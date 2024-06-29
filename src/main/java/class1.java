import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class1 {

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "I")
    public static int field1 = 0;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
    public static int field3 = 0;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "Lec;")
    public static class25 field4 = new class25(4);

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V")
    public static void method1(int arg0) {
        if (arg0 < 114) {
            field3 = -95;
        }
        field4 = null;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lmb;IIIIIIIZ)V")
    public static final void method2(class168 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class160.field2527;
        int var11;
        int var12 = var11 = (arg7 << 7) - class60.field927;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class242.field3842[arg1][arg6][arg7] - class60.field925;
        int var18 = class242.field3842[arg1][arg6 + 1][arg7] - class60.field925;
        int var19 = class242.field3842[arg1][arg6 + 1][arg7 + 1] - class60.field925;
        int var20 = class242.field3842[arg1][arg6][arg7 + 1] - class60.field925;
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
        int var45 = (var21 << 9) / var25 + class172.field2663;
        int var46 = (var24 << 9) / var25 + class172.field2657;
        int var47 = (var27 << 9) / var31 + class172.field2663;
        int var48 = (var30 << 9) / var31 + class172.field2657;
        int var49 = (var33 << 9) / var37 + class172.field2663;
        int var50 = (var36 << 9) / var37 + class172.field2657;
        int var51 = (var39 << 9) / var43 + class172.field2663;
        int var52 = (var42 << 9) / var43 + class172.field2657;
        class172.field2655 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class34.field418 && class152.method1002(class285.field4758 + class172.field2663, class217.field3456 + class172.field2657, var50, var52, var48, var49, var51, var47)) {
                class74.field1138 = arg6;
                class299.field4912 = arg7;
            }
            if (!arg8) {
                class172.field2666 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class172.field2667 || var51 > class172.field2667 || var47 > class172.field2667) {
                    class172.field2666 = true;
                }
                if (arg0.field2621 == -1) {
                    if (arg0.field2626 != 12345678) {
                        class172.method1133(var50, var52, var48, var49, var51, var47, arg0.field2626, arg0.field2628, arg0.field2629);
                    }
                } else if (!class182.field2830) {
                    int var53 = class172.field2670.method1120(arg0.field2621, -101);
                    class172.method1133(var50, var52, var48, var49, var51, var47, class130.method870(var53, arg0.field2626), class130.method870(var53, arg0.field2628), class130.method870(var53, arg0.field2629));
                } else if (arg0.field2627) {
                    class172.method1150(var50, var52, var48, var49, var51, var47, arg0.field2626, arg0.field2628, arg0.field2629, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field2621);
                } else {
                    class172.method1150(var50, var52, var48, var49, var51, var47, arg0.field2626, arg0.field2628, arg0.field2629, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field2621);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class34.field418 && class152.method1002(class285.field4758 + class172.field2663, class217.field3456 + class172.field2657, var46, var48, var52, var45, var47, var51)) {
            class74.field1138 = arg6;
            class299.field4912 = arg7;
        }
        if (arg8) {
            return;
        }
        class172.field2666 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class172.field2667 || var47 > class172.field2667 || var51 > class172.field2667) {
            class172.field2666 = true;
        }
        if (arg0.field2621 != -1) {
            if (class182.field2830) {
                class172.method1150(var46, var48, var52, var45, var47, var51, arg0.field2623, arg0.field2629, arg0.field2628, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field2621);
                return;
            }
            int var54 = class172.field2670.method1120(arg0.field2621, -107);
            class172.method1133(var46, var48, var52, var45, var47, var51, class130.method870(var54, arg0.field2623), class130.method870(var54, arg0.field2629), class130.method870(var54, arg0.field2628));
        } else if (arg0.field2623 != 12345678) {
            class172.method1133(var46, var48, var52, var45, var47, var51, arg0.field2623, arg0.field2629, arg0.field2628);
            return;
        }
    }
}
