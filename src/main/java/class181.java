import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class181 {

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "Lci;")
    public static class60 field2966 = new class60();

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "Lvh;")
    public static class108 field2967;

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "Lvh;")
    public static class108 field2968;

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "[Z")
    public static boolean[] field2969;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)V")
    public static void method1194(byte arg0) {
        if (arg0 <= 29) {
            field2966 = null;
        }
        field2966 = null;
        field2969 = null;
        field2967 = null;
        field2968 = null;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(II)I")
    public static final int method1195(int arg0, int arg1) {
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        int var3 = arg1 * 6 - 61440;
        int var4 = (arg1 * var3 >> 12) + 40960;
        if (arg0 == 6485) {
            field2965++;
            return var2 * var4 >> 12;
        } else {
            return -68;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lqi;IIIIIIIZ)V")
    public static final void method1196(class216 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class50.field854;
        int var11;
        int var12 = var11 = (arg7 << 7) - class199.field3272;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class95.field1642[arg1][arg6][arg7] - class210.field3554;
        int var18 = class95.field1642[arg1][arg6 + 1][arg7] - class210.field3554;
        int var19 = class95.field1642[arg1][arg6 + 1][arg7 + 1] - class210.field3554;
        int var20 = class95.field1642[arg1][arg6][arg7 + 1] - class210.field3554;
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
        int var45 = (var21 << 9) / var25 + class287.field4564;
        int var46 = (var24 << 9) / var25 + class287.field4563;
        int var47 = (var27 << 9) / var31 + class287.field4564;
        int var48 = (var30 << 9) / var31 + class287.field4563;
        int var49 = (var33 << 9) / var37 + class287.field4564;
        int var50 = (var36 << 9) / var37 + class287.field4563;
        int var51 = (var39 << 9) / var43 + class287.field4564;
        int var52 = (var42 << 9) / var43 + class287.field4563;
        class287.field4560 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class125.field2202 && class183.method1198(class287.field4564 + class203.field3326, class3.field29 + class287.field4563, var50, var52, var48, var49, var51, var47)) {
                class31.field457 = arg6;
                class65.field1099 = arg7;
            }
            if (!arg8) {
                class287.field4557 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class287.field4556 || var51 > class287.field4556 || var47 > class287.field4556) {
                    class287.field4557 = true;
                }
                if (arg0.field3652 == -1) {
                    if (arg0.field3646 != 12345678) {
                        class287.method1941(var50, var52, var48, var49, var51, var47, arg0.field3646, arg0.field3641, arg0.field3638);
                    }
                } else if (!class255.field4168) {
                    int var53 = class287.field4555.method234((byte) -101, arg0.field3652);
                    class287.method1941(var50, var52, var48, var49, var51, var47, class127.method877(var53, arg0.field3646), class127.method877(var53, arg0.field3641), class127.method877(var53, arg0.field3638));
                } else if (arg0.field3639) {
                    class287.method1948(var50, var52, var48, var49, var51, var47, arg0.field3646, arg0.field3641, arg0.field3638, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field3652);
                } else {
                    class287.method1948(var50, var52, var48, var49, var51, var47, arg0.field3646, arg0.field3641, arg0.field3638, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field3652);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class125.field2202 && class183.method1198(class287.field4564 + class203.field3326, class3.field29 + class287.field4563, var46, var48, var52, var45, var47, var51)) {
            class31.field457 = arg6;
            class65.field1099 = arg7;
        }
        if (arg8) {
            return;
        }
        class287.field4557 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class287.field4556 || var47 > class287.field4556 || var51 > class287.field4556) {
            class287.field4557 = true;
        }
        if (arg0.field3652 != -1) {
            if (class255.field4168) {
                class287.method1948(var46, var48, var52, var45, var47, var51, arg0.field3640, arg0.field3638, arg0.field3641, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field3652);
                return;
            }
            int var54 = class287.field4555.method234((byte) -89, arg0.field3652);
            class287.method1941(var46, var48, var52, var45, var47, var51, class127.method877(var54, arg0.field3640), class127.method877(var54, arg0.field3638), class127.method877(var54, arg0.field3641));
        } else if (arg0.field3640 != 12345678) {
            class287.method1941(var46, var48, var52, var45, var47, var51, arg0.field3640, arg0.field3638, arg0.field3641);
            return;
        }
    }
}
