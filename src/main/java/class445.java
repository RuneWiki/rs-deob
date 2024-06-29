import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class445 {

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "Lqu;")
    public static class219 field6912 = new class219(58, 7);

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "Lgf;")
    public static class46 field6914 = new class46("", 10);

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
    public static int field6909;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
    public static int field6910;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "Li;")
    public class521 field6913;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "Le;")
    public class536 field6911;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIIIIZ)V")
    public static final void method2815(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        class418.field6341 = arg4;
        class203.field3094 = arg2;
        class322.field5016 = arg3;
        class296.field4667 = arg0;
        class500.field7505 = arg5;
        field6910++;
        if (arg6 && class418.field6341 >= 100) {
            class98.field1404 = class296.field4667 * 128 + 64;
            class163.field2367 = class203.field3094 * 128 + 64;
            class371.field5703 = class532.method3165(class201.field3057, class163.field2367, false, class98.field1404) - class322.field5016;
        }
        int var7 = -47 % ((-arg1 - 14) / 46);
        class334.field5222 = 2;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZII)V")
    public static final void method2816(boolean arg0, int arg1, int arg2) {
        field6909++;
        class456 var3 = class233.method1654(arg2, 13, 125);
        if (!arg0) {
            var3.method2858(10250);
            var3.field7042 = arg1;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V")
    public static void method2817(int arg0) {
        field6912 = null;
        if (arg0 != 7) {
            method2815(-125, 54, 15, 114, 85, 27, true);
        }
        field6914 = null;
    }
}
