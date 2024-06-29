import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jca")
public class class79 {

    @OriginalMember(owner = "client!jca", name = "b", descriptor = "[I")
    public static int[] field1138 = new int[] { 3, 7, 15 };

    @OriginalMember(owner = "client!jca", name = "e", descriptor = "Llc;")
    public static class435 field1141 = new class435(88, 8);

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "client!jca", name = "c", descriptor = "I")
    public static int field1139;

    @OriginalMember(owner = "client!jca", name = "d", descriptor = "Lqt;")
    public static class502 field1140;

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(II)V", line = 6)
    public static final void method649(int arg0, int arg1) {
        field1139++;
        if (class369.field5392 == arg1) {
            return;
        }
        if (arg1 == 13) {
            if (client.field6418 == null) {
                class700.method3929(class544.field7903, -25696, class669.field9541, class505.field7344);
            } else {
                class519.method3158((byte) 53, class544.field7903);
            }
        }
        if (arg1 != 13 && class537.field7814 != null) {
            class537.field7814.method1581(false);
            class537.field7814 = null;
        }
        if (arg1 == 3) {
            class638.method3678(class346.field4771 != class119.field1638, -1);
        }
        if (arg1 == 7) {
            class51.method471(class476.field6769 != class346.field4771, (byte) 9);
        }
        if (arg0 != -19704) {
            field1141 = null;
        }
        if (arg1 == 5) {
            if (client.field6418 == null) {
                class228.method1589(-99, class669.field9541, class505.field7344);
            } else {
                class253.method1699(arg0 + 34315);
            }
        } else if (arg1 == 6) {
            if (client.field6418 == null) {
                class700.method3929(class544.field7903, -25696, class669.field9541, class505.field7344);
            } else {
                class519.method3158((byte) 53, class544.field7903);
            }
        } else if (arg1 == 9) {
            if (client.field6418 == null) {
                class700.method3929(class544.field7903, -25696, class669.field9541, class505.field7344);
            } else {
                class519.method3158((byte) 53, class544.field7903);
            }
        } else if (arg1 == 12) {
            if (client.field6418 == null) {
                class228.method1589(-66, class669.field9541, class505.field7344);
            } else {
                class253.method1699(arg0 + 34315);
            }
        }
        if (class447.method2721((byte) -82, class369.field5392)) {
            class284.field3966.field6037 = 2;
            class751.field10463.field6037 = 2;
            class564.field8184.field6037 = 2;
            class499.field7173.field6037 = 2;
            class634.field8938.field6037 = 2;
            class377.field5456.field6037 = 2;
            class717.field10116.field6037 = 2;
        }
        if (class447.method2721((byte) -82, arg1)) {
            class488.field7033 = 0;
            class11.field108 = 0;
            class258.field3700 = 1;
            class127.field1757 = 0;
            class640.field9110 = 1;
            class145.method1015(true, (byte) -87);
            class284.field3966.field6037 = 1;
            class751.field10463.field6037 = 1;
            class564.field8184.field6037 = 1;
            class499.field7173.field6037 = 1;
            class634.field8938.field6037 = 1;
            class377.field5456.field6037 = 1;
            class717.field10116.field6037 = 1;
        }
        if (arg1 == 11 || arg1 == 3) {
            class663.method3778((byte) -117);
        }
        boolean var2 = arg1 == 2 || class693.method3912(-18935, arg1) || class488.method2970(arg1, false);
        boolean var3 = class369.field5392 == 2 || class693.method3912(-18935, class369.field5392) || class488.method2970(class369.field5392, false);
        if (var2 != var3) {
            if (var2) {
                class428.field6173 = class304.field4155;
                if (class243.field3580.field7988.method3577(false) == 0) {
                    class390.method2389((byte) 82, 2);
                } else {
                    class732.method4077(0, 2, class243.field3580.field7988.method3577(false), class505.field7338, (byte) -49, false, class304.field4155);
                    class303.method1894(0);
                }
                class488.field7032.method3870(false, (byte) -125);
            } else {
                class390.method2389((byte) 96, 2);
                class488.field7032.method3870(true, (byte) -122);
            }
        }
        if (class447.method2721((byte) -82, arg1) || arg1 == 13) {
            class211.field3164.method1222();
        }
        class369.field5392 = arg1;
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(I)V", line = 160)
    public static void method650(int arg0) {
        if (arg0 != -9001) {
            field1141 = null;
        }
        field1141 = null;
        field1138 = null;
        field1140 = null;
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(Lla;ILhga;)V", line = 178)
    public static final void method651(class423 arg0, int arg1, class300 arg2) {
        class740.field10332 = arg2;
        class584.field8338 = arg0;
        class520.field7506 = "";
        field1137++;
        if (class563.field8155.startsWith("win")) {
            class520.field7506 = class520.field7506 + "windows/";
        } else if (class563.field8155.startsWith("linux")) {
            class520.field7506 = class520.field7506 + "linux/";
        } else if (class563.field8155.startsWith("mac")) {
            class520.field7506 = class520.field7506 + "macos/";
        }
        if (arg1 != 2) {
            field1140 = null;
        }
        if (class740.field10332.field4100) {
            class520.field7506 = class520.field7506 + "msjava/";
        } else if (class563.field8154.startsWith("amd64") || class563.field8154.startsWith("x86_64")) {
            class520.field7506 = class520.field7506 + "x86_64/";
        } else if (class563.field8154.startsWith("i386") || class563.field8154.startsWith("i486") || class563.field8154.startsWith("i586") || class563.field8154.startsWith("x86")) {
            class520.field7506 = class520.field7506 + "x86/";
        } else if (class563.field8154.startsWith("ppc")) {
            class520.field7506 = class520.field7506 + "ppc/";
        } else {
            class520.field7506 = class520.field7506 + "universal/";
        }
    }
}
