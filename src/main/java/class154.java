import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class154 {

    @OriginalMember(owner = "client!of", name = "a", descriptor = "Loc;")
    public static class151 field2791 = class137.method873(2, "Untersuchen");

    @OriginalMember(owner = "client!of", name = "d", descriptor = "Loc;")
    public static class151 field2794 = class137.method873(2, "underlay)3dat");

    @OriginalMember(owner = "client!of", name = "c", descriptor = "I")
    public static int field2793 = 100;

    @OriginalMember(owner = "client!of", name = "i", descriptor = "[S")
    public static short[] field2799 = new short[] { 50, 38, 5, 48, 36, 30, 32, 31 };

    @OriginalMember(owner = "client!of", name = "b", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!of", name = "h", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "Luf;")
    public static class214 field2797;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIIIILwg;IJ)Z")
    public static final boolean method1010(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class235 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class218.method1363(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V")
    public static void method1011(int arg0) {
        field2794 = null;
        field2797 = null;
        field2791 = null;
        field2799 = null;
        if (arg0 != 31) {
            method1012(-12, -5, false);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIZ)I")
    public static final int method1012(int arg0, int arg1, boolean arg2) {
        field2792++;
        if (arg2) {
            int var3 = arg0 >> 31 & arg1 - 1;
            return ((arg0 >>> 31) + arg0) % arg1 + var3;
        } else {
            return -97;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIIIZIIII)V")
    public static final void method1013(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9) {
        if (class79.field1526 <= arg8 && arg8 <= class25.field524 && arg2 >= class79.field1526 && arg2 <= class25.field524 && arg6 >= class79.field1526 && arg6 <= class25.field524 && class79.field1526 <= arg1 && class25.field524 >= arg1 && arg9 >= class233.field4281 && field2793 >= arg9 && arg0 >= class233.field4281 && arg0 <= field2793 && class233.field4281 <= arg3 && field2793 >= arg3 && class233.field4281 <= arg4 && arg4 <= field2793) {
            class166.method1072(false, arg7, arg9, arg1, arg2, arg4, arg0, arg6, arg8, arg3);
        } else {
            class31.method233(arg1, arg0, arg9, arg7, arg8, arg3, arg6, arg2, arg4, true);
        }
        field2795++;
        if (!arg5) {
            method1012(45, -119, true);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIIILwg;IJZ)Z")
    public static final boolean method1014(int arg0, int arg1, int arg2, int arg3, int arg4, class235 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class218.method1363(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }
}
