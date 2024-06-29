import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class277 implements class136 {

    @OriginalMember(owner = "client!am", name = "d", descriptor = "Z")
    public static boolean field4405 = false;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "I")
    public static int field4402 = -1;

    @OriginalMember(owner = "client!am", name = "j", descriptor = "Ljava/lang/String;")
    public static String field4411 = "Mechscape is loading - please wait...";

    @OriginalMember(owner = "client!am", name = "b", descriptor = "I")
    public static int field4403;

    @OriginalMember(owner = "client!am", name = "c", descriptor = "I")
    public static int field4404;

    @OriginalMember(owner = "client!am", name = "e", descriptor = "I")
    public static int field4406;

    @OriginalMember(owner = "client!am", name = "f", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!am", name = "i", descriptor = "I")
    public static int field4410;

    @OriginalMember(owner = "client!am", name = "g", descriptor = "Lcg;")
    public static class49 field4408;

    @OriginalMember(owner = "client!am", name = "h", descriptor = "[[B")
    public static byte[][] field4409;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIII)V", line = 9)
    public static final void method1902(int arg0, int arg1, int arg2, int arg3) {
        field4410++;
        if (arg3 == 0) {
            class286.field4561++;
            class341.field5443.method26(68, 7);
            class341.field5443.method2370(5, (byte) -20);
        }
        if (~arg3 == arg1) {
            class341.field5443.method26(229, arg1 ^ 0xFFFFFFF9);
            class280.field4445++;
            class341.field5443.method2370(19, (byte) -20);
        }
        class341.field5443.method2359(-805606200, class24.field345 + arg2);
        class341.field5443.method2351(0, class97.field1572[82] ? 1 : 0);
        class341.field5443.method2366(arg1 ^ 0xFFFFFFA5, class34.field484 + arg0);
        class338.field5408 = arg2;
        class332.field5287 = arg0;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(B)V", line = 37)
    public static void method1903(byte arg0) {
        if (arg0 > -35) {
            field4405 = false;
        }
        field4411 = null;
        field4408 = null;
        field4409 = (byte[][]) null;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(III)Ljo;", line = 57)
    public static final class98 method1904(int arg0, int arg1, int arg2) {
        field4407++;
        class98 var3 = new class98();
        if (arg0 != -1) {
            field4402 = 7;
        }
        for (class325 var4 = (class325) class137.field2370.method736(2); var4 != null; var4 = (class325) class137.field2370.method727((byte) -110)) {
            if (var4.field5189 && var4.method2256(arg1, true, arg2)) {
                var3.method851(var4, (byte) -44);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(II[IJ)Ljava/lang/String;", line = 87)
    public final String method1115(int arg0, int arg1, int[] arg2, long arg3) {
        field4404++;
        if (arg1 == 0) {
            class184 var7 = class28.method256(arg2[0], 40);
            return var7.method1418(arg0 ^ 0xFFFF82FE, (int) arg3);
        } else if (arg1 == 1 || arg1 == 10) {
            class134 var6 = class5.method31(-1731690365, (int) arg3);
            return var6.field2346;
        } else if (arg1 == 6 || arg1 == 7 || arg1 == 11) {
            return class28.method256(arg2[0], 40).method1418(arg0 - 32067, (int) arg3);
        } else {
            if (arg0 != 32111) {
                field4411 = (String) null;
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Lqe;III)V", line = 120)
    public static final void method1905(class205 arg0, int arg1, int arg2, int arg3) {
        field4406++;
        if (arg1 != 0) {
            return;
        }
        if (arg0.field1998 == arg3 && arg3 != -1) {
            class285 var4 = class346.method2428(arg3, (byte) -24);
            int var5 = var4.field4532;
            if (var5 == 1) {
                arg0.field2035 = 0;
                arg0.field1929 = 1;
                arg0.field2002 = 0;
                arg0.field1932 = 0;
                arg0.field1934 = arg2;
                class20.method199(class218.field3632 == arg0, arg0.field1985, var4, arg0.field2036, arg0.field1932, true);
            }
            if (var5 == 2) {
                arg0.field2002 = 0;
            }
        } else if (arg3 == -1 || arg0.field1998 == -1 || class346.method2428(arg3, (byte) -24).field4517 >= class346.method2428(arg0.field1998, (byte) -24).field4517) {
            arg0.field2002 = 0;
            arg0.field2035 = 0;
            arg0.field2013 = arg0.field1957;
            arg0.field1929 = 1;
            arg0.field1932 = 0;
            arg0.field1934 = arg2;
            arg0.field1998 = arg3;
            if (arg0.field1998 != -1) {
                class20.method199(class218.field3632 == arg0, arg0.field1985, class346.method2428(arg0.field1998, (byte) -24), arg0.field2036, arg0.field1932, true);
            }
        }
    }
}
