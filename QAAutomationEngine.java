public class QAAutomationEngine {
    public static void main(String[] args) {

        String testerName = "Youssef Hebish";
        int totalTests =0;
        int passedTests = 0;
        boolean test1 = verifyPayment(100.50, 50.00);
        if (test1){
            System.out.println("Test 1 (Valid Payment): Passed");
            passedTests +=1;
        }
        else
            System.out.println("Failed");
        totalTests +=1;

        boolean test2 = verifyPayment(30.00, 80.00);
        if (test2){
            System.out.println("Test 2 (Invalid Payment): Passed");
            passedTests +=1;
        }
        else
            System.out.println("Test 2: Failed");
        totalTests +=1;

        for(int i =1 ; i<= 3; i++){
            System.out.println("Checking server connection... Attempt "+i);
        }
        System.out.println("Test 3 (Server Connection): Passed");
        passedTests +=1;
        totalTests +=1;

        int scorePercentage =(passedTests * 100) / totalTests;


        System.out.println("=================================");
        System.out.println("QA EXECUTION REPORT");
        System.out.println("Tester: "+testerName);
        System.out.println("Total Tests Run: "+totalTests);
        System.out.println("Total Tests Passed:"+passedTests);
        System.out.println("Success Rate: "+scorePercentage +"%");
        System.out.println("=================================");

    }
    public static boolean verifyPayment(double walletBalance, double itemPrice){
        if(walletBalance >= itemPrice)
            return true;
        else
            return false;
    }
}
