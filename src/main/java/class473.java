import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!faa")
public class class473 {

    @OriginalMember(owner = "client!faa", name = "f", descriptor = "I")
    public static int field6433 = 1;

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "Lin;")
    public static class380 field6428 = new class380(84, 3);

    @OriginalMember(owner = "client!faa", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field6434 = new String[100];

    @OriginalMember(owner = "client!faa", name = "b", descriptor = "I")
    public static int field6429;

    @OriginalMember(owner = "client!faa", name = "c", descriptor = "I")
    public static int field6430;

    @OriginalMember(owner = "client!faa", name = "e", descriptor = "I")
    public static int field6432;

    @OriginalMember(owner = "client!faa", name = "h", descriptor = "I")
    public static int field6435;

    @OriginalMember(owner = "client!faa", name = "i", descriptor = "I")
    public int field6436;

    @OriginalMember(owner = "client!faa", name = "d", descriptor = "Liaa;")
    public class118 field6431;

    @OriginalMember(owner = "client!faa", name = "j", descriptor = "[I")
    public int[] field6437;

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(I)V", line = 7)
    public static void method2760(int arg0) {
        field6428 = null;
        field6434 = null;
        int var1 = -24 % ((-arg0 - 10) / 57);
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(IIIII)V", line = 17)
    public static final void method2761(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6429++;
        if (arg1 != 8) {
            return;
        }
        if (class742.field10301 <= (arg0 - arg2) && class435.field6058 >= arg0 + arg2 && class515.field7102 <= (arg4 - arg2) && class698.field9801 >= (arg4 + arg2)) {
            class163.method1234(arg0, arg1 - 8, arg2, arg3, arg4);
        } else {
            class330.method2014(arg3, arg0, arg2, 0, arg4);
        }
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(IZ)V", line = 44)
    public static final void method2762(int arg0, boolean arg1) {
        class144.field2337 = -1;
        field6432++;
        class582.field8375 = 1;
        class419.field5804 = arg0;
        class348.field4945 = null;
        class542.field7503 = null;
        class229.field3357 = -1;
        class430.field5951 = arg1;
        class406.field5591 = 0;
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(Lcea;Lgga;Z)V", line = 61)
    public static final void method2763(class111 arg0, class513 arg1, boolean arg2) {
        class778.field10678 = arg0;
        class228.field3322 = "";
        class339.field4807 = arg1;
        field6435++;
        if (class247.field3556.startsWith("win")) {
            class228.field3322 = class228.field3322 + "windows/";
        } else if (class247.field3556.startsWith("linux")) {
            class228.field3322 = class228.field3322 + "linux/";
        } else if (class247.field3556.startsWith("mac")) {
            class228.field3322 = class228.field3322 + "macos/";
        }
        if (arg2) {
            return;
        }
        if (class778.field10678.field1588) {
            class228.field3322 = class228.field3322 + "msjava/";
        } else if (class247.field3557.startsWith("amd64") || class247.field3557.startsWith("x86_64")) {
            class228.field3322 = class228.field3322 + "x86_64/";
        } else if (class247.field3557.startsWith("i386") || class247.field3557.startsWith("i486") || class247.field3557.startsWith("i586") || class247.field3557.startsWith("x86")) {
            class228.field3322 = class228.field3322 + "x86/";
        } else if (class247.field3557.startsWith("ppc")) {
            class228.field3322 = class228.field3322 + "ppc/";
        } else {
            class228.field3322 = class228.field3322 + "universal/";
        }
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(B)V", line = 109)
    public static final void method2764(byte arg0) {
        field6430++;
        if (class141.field2306 == 3) {
            class75.method690(true, 4);
        } else if (class141.field2306 == 7) {
            class75.method690(true, 8);
        } else if (class141.field2306 == 10) {
            class75.method690(true, 11);
        }
        int var1 = 45 / ((-arg0 - 26) / 61);
    }
}
