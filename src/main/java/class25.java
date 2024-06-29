import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class25 extends class61 {

    @OriginalMember(owner = "client!hj", name = "m", descriptor = "I")
    public static int field421 = 0;

    @OriginalMember(owner = "client!hj", name = "t", descriptor = "Llc;")
    public static class143 field428 = class66.method374("<br>(X100(U(Y", -1);

    @OriginalMember(owner = "client!hj", name = "s", descriptor = "Z")
    public static boolean field427 = false;

    @OriginalMember(owner = "client!hj", name = "u", descriptor = "Llc;")
    private static class143 field429 = class66.method374("Please wait )2 attempting to reestablish)3", -1);

    @OriginalMember(owner = "client!hj", name = "l", descriptor = "Llc;")
    public static class143 field420 = field429;

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "B")
    public byte field419;

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "I")
    public static int field418;

    @OriginalMember(owner = "client!hj", name = "n", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!hj", name = "p", descriptor = "I")
    public int field424;

    @OriginalMember(owner = "client!hj", name = "r", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!hj", name = "o", descriptor = "Llc;")
    public class143 field423;

    @OriginalMember(owner = "client!hj", name = "q", descriptor = "Llc;")
    public class143 field425;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILgf;)V")
    public static final void method175(int arg0, class7 arg1) {
        if (arg0 != 16) {
            field427 = true;
        }
        class255.field4587 = arg1;
        field418++;
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(I)V")
    public static void method176(int arg0) {
        field429 = null;
        if (arg0 == -25392) {
            field428 = null;
            field420 = null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lmh;IIIIIIIZ)V")
    public static final void method177(class117 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class40.field682;
        int var11;
        int var12 = var11 = (arg7 << 7) - class264.field4751;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class192.field3535[arg1][arg6][arg7] - class266.field4782;
        int var18 = class192.field3535[arg1][arg6 + 1][arg7] - class266.field4782;
        int var19 = class192.field3535[arg1][arg6 + 1][arg7 + 1] - class266.field4782;
        int var20 = class192.field3535[arg1][arg6][arg7 + 1] - class266.field4782;
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
        int var45 = (var21 << 9) / var25 + class196.field3637;
        int var46 = (var24 << 9) / var25 + class196.field3631;
        int var47 = (var27 << 9) / var31 + class196.field3637;
        int var48 = (var30 << 9) / var31 + class196.field3631;
        int var49 = (var33 << 9) / var37 + class196.field3637;
        int var50 = (var36 << 9) / var37 + class196.field3631;
        int var51 = (var39 << 9) / var43 + class196.field3637;
        int var52 = (var42 << 9) / var43 + class196.field3631;
        class196.field3632 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class133.field2328 && class189.method1227(class5.field65 + class196.field3637, class196.field3631 + class190.field3498, var50, var52, var48, var49, var51, var47)) {
                class176.field3146 = arg6;
                class7.field143 = arg7;
            }
            if (!arg8) {
                class196.field3638 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class196.field3628 || var51 > class196.field3628 || var47 > class196.field3628) {
                    class196.field3638 = true;
                }
                if (arg0.field2080 == -1) {
                    if (arg0.field2081 != 12345678) {
                        class196.method1369(var50, var52, var48, var49, var51, var47, arg0.field2081, arg0.field2078, arg0.field2079);
                    }
                } else if (!class49.field966) {
                    int var53 = class196.field3636.method388(0, arg0.field2080);
                    class196.method1369(var50, var52, var48, var49, var51, var47, class285.method1870(var53, arg0.field2081), class285.method1870(var53, arg0.field2078), class285.method1870(var53, arg0.field2079));
                } else if (arg0.field2083) {
                    class196.method1351(var50, var52, var48, var49, var51, var47, arg0.field2081, arg0.field2078, arg0.field2079, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field2080);
                } else {
                    class196.method1351(var50, var52, var48, var49, var51, var47, arg0.field2081, arg0.field2078, arg0.field2079, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field2080);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class133.field2328 && class189.method1227(class5.field65 + class196.field3637, class196.field3631 + class190.field3498, var46, var48, var52, var45, var47, var51)) {
            class176.field3146 = arg6;
            class7.field143 = arg7;
        }
        if (arg8) {
            return;
        }
        class196.field3638 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class196.field3628 || var47 > class196.field3628 || var51 > class196.field3628) {
            class196.field3638 = true;
        }
        if (arg0.field2080 != -1) {
            if (class49.field966) {
                class196.method1351(var46, var48, var52, var45, var47, var51, arg0.field2082, arg0.field2079, arg0.field2078, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field2080);
                return;
            }
            int var54 = class196.field3636.method388(0, arg0.field2080);
            class196.method1369(var46, var48, var52, var45, var47, var51, class285.method1870(var54, arg0.field2082), class285.method1870(var54, arg0.field2079), class285.method1870(var54, arg0.field2078));
        } else if (arg0.field2082 != 12345678) {
            class196.method1369(var46, var48, var52, var45, var47, var51, arg0.field2082, arg0.field2079, arg0.field2078);
            return;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)I")
    public static int method178(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I[Llc;)Llc;")
    public static final class143 method179(int arg0, class143[] arg1) {
        if (arg0 != 0) {
            field427 = false;
        }
        field422++;
        if (arg1.length < 2) {
            throw new IllegalArgumentException();
        }
        return class18.method133(31887, 0, arg1, arg1.length);
    }
}
