import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class15 extends class208 {

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "J")
    public long field223;

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "I")
    public static int field221 = 0;

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "S")
    public static short field222 = 32767;

    @OriginalMember(owner = "client!oh", name = "p", descriptor = "I")
    public static int field225 = 0;

    @OriginalMember(owner = "client!oh", name = "o", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!oh", name = "q", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "[Ldm;")
    public static class273[] field220;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lbb;IIIIIIIZ)V", line = 15)
    public static final void method74(class84 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class210.field3580;
        int var11;
        int var12 = var11 = (arg7 << 7) - class59.field912;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class106.field1783[arg1][arg6][arg7] - class274.field4718;
        int var18 = class106.field1783[arg1][arg6 + 1][arg7] - class274.field4718;
        int var19 = class106.field1783[arg1][arg6 + 1][arg7 + 1] - class274.field4718;
        int var20 = class106.field1783[arg1][arg6][arg7 + 1] - class274.field4718;
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
        int var45 = (var21 << 9) / var25 + class283.field4880;
        int var46 = (var24 << 9) / var25 + class283.field4864;
        int var47 = (var27 << 9) / var31 + class283.field4880;
        int var48 = (var30 << 9) / var31 + class283.field4864;
        int var49 = (var33 << 9) / var37 + class283.field4880;
        int var50 = (var36 << 9) / var37 + class283.field4864;
        int var51 = (var39 << 9) / var43 + class283.field4880;
        int var52 = (var42 << 9) / var43 + class283.field4864;
        class283.field4867 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class29.field461 && class237.method1642(class75.field1231 + class283.field4880, class283.field4864 + class199.field3426, var50, var52, var48, var49, var51, var47)) {
                class247.field4140 = arg6;
                class82.field1338 = arg7;
            }
            if (!class281.field4827 && !arg8) {
                class283.field4875 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class283.field4881 || var51 > class283.field4881 || var47 > class283.field4881) {
                    class283.field4875 = true;
                }
                if (arg0.field1348 == -1) {
                    if (arg0.field1347 != 12345678) {
                        class283.method1998(var50, var52, var48, var49, var51, var47, arg0.field1347, arg0.field1360, arg0.field1361);
                    }
                } else if (!class136.field2262) {
                    int var53 = class283.field4866.method982(arg0.field1348, true);
                    class283.method1998(var50, var52, var48, var49, var51, var47, class25.method140(var53, arg0.field1347), class25.method140(var53, arg0.field1360), class25.method140(var53, arg0.field1361));
                } else if (arg0.field1362) {
                    class283.method2018(var50, var52, var48, var49, var51, var47, arg0.field1347, arg0.field1360, arg0.field1361, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field1348);
                } else {
                    class283.method2018(var50, var52, var48, var49, var51, var47, arg0.field1347, arg0.field1360, arg0.field1361, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field1348);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class29.field461 && class237.method1642(class75.field1231 + class283.field4880, class283.field4864 + class199.field3426, var46, var48, var52, var45, var47, var51)) {
            class247.field4140 = arg6;
            class82.field1338 = arg7;
        }
        if (class281.field4827 || arg8) {
            return;
        }
        class283.field4875 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class283.field4881 || var47 > class283.field4881 || var51 > class283.field4881) {
            class283.field4875 = true;
        }
        if (arg0.field1348 == -1) {
            if (arg0.field1352 != 12345678) {
                class283.method1998(var46, var48, var52, var45, var47, var51, arg0.field1352, arg0.field1361, arg0.field1360);
            }
        } else if (class136.field2262) {
            class283.method2018(var46, var48, var52, var45, var47, var51, arg0.field1352, arg0.field1361, arg0.field1360, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field1348);
        } else {
            int var54 = class283.field4866.method982(arg0.field1348, true);
            class283.method1998(var46, var48, var52, var45, var47, var51, class25.method140(var54, arg0.field1352), class25.method140(var54, arg0.field1361), class25.method140(var54, arg0.field1360));
        }
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(B)V", line = 200)
    public static void method75(byte arg0) {
        int var1 = -68 / ((arg0 + 58) / 62);
        field220 = null;
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "()V", line = 210)
    public class15() {
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(J)V", line = 217)
    public class15(long arg0) {
        this.field223 = arg0;
    }
}
