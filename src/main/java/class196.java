import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class196 {

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "Ljd;")
    public static class85 field3373 = class221.method1499("::gc", (byte) 109);

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "Ljd;")
    public static class85 field3370 = class221.method1499("cookiehost", (byte) -106);

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "I")
    public static int field3375 = 0;

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "Ljd;")
    private static class85 field3376 = class221.method1499(" from your ignore list first)3", (byte) 118);

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "Ljd;")
    public static class85 field3374 = field3376;

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "Ljd;")
    public static class85 field3379 = class221.method1499("runes", (byte) 98);

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "[Z")
    public static boolean[] field3377 = new boolean[8];

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lre;IIIIIIIZ)V")
    public static final void method1340(class212 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class221.field3877;
        int var11;
        int var12 = var11 = (arg7 << 7) - class237.field4097;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class245.field4193[arg1][arg6][arg7] - class34.field528;
        int var18 = class245.field4193[arg1][arg6 + 1][arg7] - class34.field528;
        int var19 = class245.field4193[arg1][arg6 + 1][arg7 + 1] - class34.field528;
        int var20 = class245.field4193[arg1][arg6][arg7 + 1] - class34.field528;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 < 50) {
            return;
        }
        int var27 = arg4 * var11 + arg5 * var14 >> 16;
        int var28 = arg5 * var11 - arg4 * var14 >> 16;
        int var30 = arg3 * var18 - arg2 * var28 >> 16;
        int var31 = arg2 * var18 + arg3 * var28 >> 16;
        if (var31 < 50) {
            return;
        }
        int var33 = arg4 * var16 + arg5 * var13 >> 16;
        int var34 = arg5 * var16 - arg4 * var13 >> 16;
        int var36 = arg3 * var19 - arg2 * var34 >> 16;
        int var37 = arg2 * var19 + arg3 * var34 >> 16;
        if (var37 < 50) {
            return;
        }
        int var39 = arg4 * var15 + arg5 * var9 >> 16;
        int var40 = arg5 * var15 - arg4 * var9 >> 16;
        int var42 = arg3 * var20 - arg2 * var40 >> 16;
        int var43 = arg2 * var20 + arg3 * var40 >> 16;
        if (var43 < 50) {
            return;
        }
        int var45 = (var21 << 9) / var25 + class173.field2996;
        int var46 = (var24 << 9) / var25 + class173.field3001;
        int var47 = (var27 << 9) / var31 + class173.field2996;
        int var48 = (var30 << 9) / var31 + class173.field3001;
        int var49 = (var33 << 9) / var37 + class173.field2996;
        int var50 = (var36 << 9) / var37 + class173.field3001;
        int var51 = (var39 << 9) / var43 + class173.field2996;
        int var52 = (var42 << 9) / var43 + class173.field3001;
        class173.field2993 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class28.field436 && class232.method1559(class261.field4620 + class173.field2996, class173.field3001 + class163.field2814, var50, var52, var48, var49, var51, var47)) {
                class247.field4227 = arg6;
                class49.field859 = arg7;
            }
            if (!arg8) {
                class173.field2994 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class173.field2985 || var51 > class173.field2985 || var47 > class173.field2985) {
                    class173.field2994 = true;
                }
                if (arg0.field3719 == -1) {
                    if (arg0.field3712 != 12345678) {
                        class173.method1160(var50, var52, var48, var49, var51, var47, arg0.field3712, arg0.field3717, arg0.field3709);
                    }
                } else if (!class180.field3093) {
                    int var53 = class173.field2987.method681((byte) 78, arg0.field3719);
                    class173.method1160(var50, var52, var48, var49, var51, var47, class187.method1287(var53, arg0.field3712), class187.method1287(var53, arg0.field3717), class187.method1287(var53, arg0.field3709));
                } else if (arg0.field3708) {
                    class173.method1156(var50, var52, var48, var49, var51, var47, arg0.field3712, arg0.field3717, arg0.field3709, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field3719);
                } else {
                    class173.method1156(var50, var52, var48, var49, var51, var47, arg0.field3712, arg0.field3717, arg0.field3709, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field3719);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class28.field436 && class232.method1559(class261.field4620 + class173.field2996, class173.field3001 + class163.field2814, var46, var48, var52, var45, var47, var51)) {
            class247.field4227 = arg6;
            class49.field859 = arg7;
        }
        if (arg8) {
            return;
        }
        class173.field2994 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class173.field2985 || var47 > class173.field2985 || var51 > class173.field2985) {
            class173.field2994 = true;
        }
        if (arg0.field3719 != -1) {
            if (class180.field3093) {
                class173.method1156(var46, var48, var52, var45, var47, var51, arg0.field3710, arg0.field3709, arg0.field3717, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field3719);
                return;
            }
            int var54 = class173.field2987.method681((byte) 78, arg0.field3719);
            class173.method1160(var46, var48, var52, var45, var47, var51, class187.method1287(var54, arg0.field3710), class187.method1287(var54, arg0.field3709), class187.method1287(var54, arg0.field3717));
        } else if (arg0.field3710 != 12345678) {
            class173.method1160(var46, var48, var52, var45, var47, var51, arg0.field3710, arg0.field3709, arg0.field3717);
            return;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V")
    public static void method1341(int arg0) {
        field3377 = null;
        field3376 = null;
        field3373 = null;
        if (arg0 != 5894) {
            field3373 = null;
        }
        field3379 = null;
        field3370 = null;
        field3374 = null;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)Z")
    public static final boolean method1342(int arg0, int arg1) {
        if (arg1 == 48) {
            field3372++;
            return arg0 >= 48 && arg0 <= 57;
        } else {
            return false;
        }
    }
}
