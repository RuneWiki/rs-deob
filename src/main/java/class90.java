import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class90 {

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
    public static int field1596 = 0;

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "I")
    public static int field1598 = 0;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "Lqb;")
    public static class209 field1600 = new class209(5);

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!qh", name = "k", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "Lda;")
    public static class143 field1601;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIII[[II)I", line = 5)
    public static final int method680(int arg0, int arg1, int arg2, int arg3, int[][] arg4, int arg5) {
        field1602++;
        if (arg5 >= -102) {
            field1603 = -50;
        }
        int var6 = (128 - arg2) * arg4[arg0][arg1] + arg4[arg0 + 1][arg1] * arg2 >> 7;
        int var7 = (128 - arg2) * arg4[arg0][arg1 + 1] + (arg4[arg0 + 1][arg1 + 1] * arg2) >> 7;
        return (128 - arg3) * var6 + arg3 * var7 >> 7;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lhl;IIIIIIIZ)V", line = 23)
    public static final void method681(class80 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class201.field3418;
        int var11;
        int var12 = var11 = (arg7 << 7) - class156.field2748;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class206.field3473[arg1][arg6][arg7] - class31.field523;
        int var18 = class206.field3473[arg1][arg6 + 1][arg7] - class31.field523;
        int var19 = class206.field3473[arg1][arg6 + 1][arg7 + 1] - class31.field523;
        int var20 = class206.field3473[arg1][arg6][arg7 + 1] - class31.field523;
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
        int var45 = (var21 << 9) / var25 + class312.field5263;
        int var46 = (var24 << 9) / var25 + class312.field5261;
        int var47 = (var27 << 9) / var31 + class312.field5263;
        int var48 = (var30 << 9) / var31 + class312.field5261;
        int var49 = (var33 << 9) / var37 + class312.field5263;
        int var50 = (var36 << 9) / var37 + class312.field5261;
        int var51 = (var39 << 9) / var43 + class312.field5263;
        int var52 = (var42 << 9) / var43 + class312.field5261;
        class312.field5270 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class302.field5073 && class247.method1734(class312.field5263 + class123.field2226, class314.field5300 + class312.field5261, var50, var52, var48, var49, var51, var47)) {
                class302.field5095 = arg6;
                class286.field4828 = arg7;
            }
            if (!class117.field2159 && !arg8) {
                class312.field5259 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class312.field5260 || var51 > class312.field5260 || var47 > class312.field5260) {
                    class312.field5259 = true;
                }
                if (arg0.field1395 == -1) {
                    if (arg0.field1397 != 12345678) {
                        class312.method2129(var50, var52, var48, var49, var51, var47, arg0.field1397, arg0.field1386, arg0.field1394);
                    }
                } else if (!class247.field4090) {
                    int var53 = class312.field5271.method157(arg0.field1395, false);
                    class312.method2129(var50, var52, var48, var49, var51, var47, class148.method1176(var53, arg0.field1397), class148.method1176(var53, arg0.field1386), class148.method1176(var53, arg0.field1394));
                } else if (arg0.field1385) {
                    class312.method2131(var50, var52, var48, var49, var51, var47, arg0.field1397, arg0.field1386, arg0.field1394, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field1395);
                } else {
                    class312.method2131(var50, var52, var48, var49, var51, var47, arg0.field1397, arg0.field1386, arg0.field1394, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field1395);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class302.field5073 && class247.method1734(class312.field5263 + class123.field2226, class314.field5300 + class312.field5261, var46, var48, var52, var45, var47, var51)) {
            class302.field5095 = arg6;
            class286.field4828 = arg7;
        }
        if (class117.field2159 || arg8) {
            return;
        }
        class312.field5259 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class312.field5260 || var47 > class312.field5260 || var51 > class312.field5260) {
            class312.field5259 = true;
        }
        if (arg0.field1395 == -1) {
            if (arg0.field1389 != 12345678) {
                class312.method2129(var46, var48, var52, var45, var47, var51, arg0.field1389, arg0.field1394, arg0.field1386);
            }
        } else if (class247.field4090) {
            class312.method2131(var46, var48, var52, var45, var47, var51, arg0.field1389, arg0.field1394, arg0.field1386, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field1395);
        } else {
            int var54 = class312.field5271.method157(arg0.field1395, false);
            class312.method2129(var46, var48, var52, var45, var47, var51, class148.method1176(var54, arg0.field1389), class148.method1176(var54, arg0.field1394), class148.method1176(var54, arg0.field1386));
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V", line = 193)
    public static final void method682(int arg0) {
        field1604++;
        int[] var1 = new int[class173.field2988];
        int var2 = 0;
        for (int var3 = arg0; var3 < class173.field2988; var3++) {
            class116 var4 = class304.method2075(var3, arg0 + 4);
            if (var4.field2067 >= 0 || var4.field2056 >= 0) {
                var1[var2++] = var3;
            }
        }
        class267.field4468 = new int[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            class267.field4468[var5] = var1[var5];
        }
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(I)V", line = 236)
    public static final void method683(int arg0) {
        if (arg0 == 9) {
            field1599++;
            class229.field3807.method1529(false);
        }
    }

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "(I)V", line = 248)
    public static void method684(int arg0) {
        if (arg0 > -41) {
            field1597 = -35;
        }
        field1601 = null;
        field1600 = null;
    }
}
