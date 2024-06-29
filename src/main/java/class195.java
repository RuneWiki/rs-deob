import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class195 extends class297 {

    @OriginalMember(owner = "client!pj", name = "L", descriptor = "I")
    private int field3012 = 6;

    @OriginalMember(owner = "client!pj", name = "P", descriptor = "[Ljava/lang/String;")
    public static String[] field3016 = new String[100];

    @OriginalMember(owner = "client!pj", name = "M", descriptor = "Lgd;")
    public static class325 field3013 = new class325(5);

    @OriginalMember(owner = "client!pj", name = "T", descriptor = "Ljava/lang/String;")
    public static String field3020 = "Continue";

    @OriginalMember(owner = "client!pj", name = "I", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!pj", name = "J", descriptor = "I")
    public static int field3010;

    @OriginalMember(owner = "client!pj", name = "K", descriptor = "I")
    public static int field3011;

    @OriginalMember(owner = "client!pj", name = "N", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!pj", name = "O", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!pj", name = "Q", descriptor = "I")
    public static int field3017;

    @OriginalMember(owner = "client!pj", name = "R", descriptor = "Lpk;")
    public static class120 field3018;

    @OriginalMember(owner = "client!pj", name = "S", descriptor = "[Lp;")
    public static class108[] field3019;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IILaj;)V", line = 12)
    public final void method169(int arg0, int arg1, class1 arg2) {
        if (arg0 == 0) {
            this.field3012 = arg2.method15((byte) -89);
        } else if (arg0 == 1) {
            this.field4762 = arg2.method15((byte) -10) == 1;
        }
        if (arg1 != 255) {
            this.method173(-124, true);
        }
        field3009++;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIZ)V", line = 49)
    public static final void method1382(int arg0, int arg1, boolean arg2) {
        class170 var3 = class221.method1613(7, arg0, -8410);
        field3010++;
        var3.method1269(false);
        var3.field2730 = arg1;
        if (!arg2) {
            method1385(-5);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IZ)[I", line = 63)
    public final int[] method173(int arg0, boolean arg1) {
        field3014++;
        int[] var3 = this.field4760.method215(arg0, 19142);
        if (!arg1) {
            field3016 = (String[]) null;
        }
        if (this.field4760.field388) {
            int[] var4 = this.method2109(arg0, (byte) 121, 0);
            int[] var5 = this.method2109(arg0, (byte) 20, 1);
            int var6 = this.field3012;
            if (var6 == 1) {
                for (int var7 = 0; var7 < class31.field491; var7++) {
                    var3[var7] = var4[var7] + var5[var7];
                }
            } else if (var6 == 2) {
                for (int var30 = 0; var30 < class31.field491; var30++) {
                    var3[var30] = var4[var30] - var5[var30];
                }
            } else if (var6 == 3) {
                for (int var8 = 0; var8 < class31.field491; var8++) {
                    var3[var8] = var4[var8] * var5[var8] >> 12;
                }
            } else if (var6 == 4) {
                for (int var28 = 0; var28 < class31.field491; var28++) {
                    int var29 = var5[var28];
                    var3[var28] = var29 == 0 ? 4096 : (var4[var28] << 12) / var29;
                }
            } else if (var6 == 5) {
                for (int var27 = 0; var27 < class31.field491; var27++) {
                    var3[var27] = 4096 - ((4096 - var4[var27]) * (4096 - var5[var27]) >> 12);
                }
            } else if (var6 == 6) {
                for (int var9 = 0; var9 < class31.field491; var9++) {
                    int var10 = var5[var9];
                    var3[var9] = var10 < 2048 ? var4[var9] * var10 >> 11 : 4096 - ((4096 - var4[var9]) * (4096 - var10) >> 11);
                }
            } else if (var6 == 7) {
                for (int var11 = 0; var11 < class31.field491; var11++) {
                    int var12 = var4[var11];
                    var3[var11] = var12 == 4096 ? 4096 : (var5[var11] << 12) / (4096 - var12);
                }
            } else if (var6 == 8) {
                for (int var25 = 0; var25 < class31.field491; var25++) {
                    int var26 = var4[var25];
                    var3[var25] = var26 == 0 ? 0 : 4096 - ((4096 - var5[var25] << 12) / var26);
                }
            } else if (var6 == 9) {
                for (int var22 = 0; var22 < class31.field491; var22++) {
                    int var23 = var5[var22];
                    int var24 = var4[var22];
                    var3[var22] = var24 < var23 ? var24 : var23;
                }
            } else if (var6 == 10) {
                for (int var13 = 0; var13 < class31.field491; var13++) {
                    int var14 = var5[var13];
                    int var15 = var4[var13];
                    var3[var13] = var14 < var15 ? var15 : var14;
                }
            } else if (var6 == 11) {
                for (int var16 = 0; var16 < class31.field491; var16++) {
                    int var17 = var4[var16];
                    int var18 = var5[var16];
                    var3[var16] = var17 > var18 ? var17 - var18 : -var17 + var18;
                }
            } else if (var6 == 12) {
                for (int var19 = 0; var19 < class31.field491; var19++) {
                    int var20 = var4[var19];
                    int var21 = var5[var19];
                    var3[var19] = var20 + var21 - (var20 * var21 >> 11);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(B)V", line = 308)
    public static void method1383(byte arg0) {
        field3020 = null;
        field3013 = null;
        field3018 = null;
        field3019 = null;
        int var1 = -84 % ((arg0 + 19) / 40);
        field3016 = null;
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "()V", line = 672)
    public class195() {
        super(2, false);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IB)[[I", line = 330)
    public final int[][] method172(int arg0, byte arg1) {
        field3015++;
        int[][] var3 = this.field4767.method1141(-1677, arg0);
        if (this.field4767.field2480) {
            int[][] var4 = this.method2105(arg0, arg1 ^ 0x3D, 0);
            int[][] var5 = this.method2105(arg0, arg1 ^ 0x3D, 1);
            int[] var6 = var3[2];
            int[] var7 = var4[1];
            int[] var8 = var3[0];
            int[] var9 = var4[0];
            int[] var10 = var4[2];
            int[] var11 = var5[0];
            int[] var12 = var5[1];
            int[] var13 = var3[1];
            int[] var14 = var5[2];
            int var15 = this.field3012;
            if (var15 == 1) {
                for (int var63 = 0; var63 < class31.field491; var63++) {
                    var8[var63] = var9[var63] + var11[var63];
                    var13[var63] = var7[var63] + var12[var63];
                    var6[var63] = var10[var63] + var14[var63];
                }
            } else if (var15 == 2) {
                for (int var16 = 0; var16 < class31.field491; var16++) {
                    var8[var16] = var9[var16] - var11[var16];
                    var13[var16] = var7[var16] - var12[var16];
                    var6[var16] = var10[var16] - var14[var16];
                }
            } else if (var15 == 3) {
                for (int var62 = 0; var62 < class31.field491; var62++) {
                    var8[var62] = var9[var62] * var11[var62] >> 12;
                    var13[var62] = var7[var62] * var12[var62] >> 12;
                    var6[var62] = var10[var62] * var14[var62] >> 12;
                }
            } else if (var15 == 4) {
                for (int var58 = 0; var58 < class31.field491; var58++) {
                    int var59 = var14[var58];
                    int var60 = var11[var58];
                    int var61 = var12[var58];
                    var8[var58] = var60 == 0 ? 4096 : (var9[var58] << 12) / var60;
                    var13[var58] = var61 == 0 ? 4096 : (var7[var58] << 12) / var61;
                    var6[var58] = var59 == 0 ? 4096 : (var10[var58] << 12) / var59;
                }
            } else if (var15 == 5) {
                for (int var57 = 0; var57 < class31.field491; var57++) {
                    var8[var57] = 4096 - ((4096 - var9[var57]) * (4096 - var11[var57]) >> 12);
                    var13[var57] = 4096 - ((4096 - var7[var57]) * (4096 - var12[var57]) >> 12);
                    var6[var57] = 4096 - ((4096 - var10[var57]) * (4096 - var14[var57]) >> 12);
                }
            } else if (var15 == 6) {
                for (int var17 = 0; var17 < class31.field491; var17++) {
                    int var18 = var12[var17];
                    int var19 = var14[var17];
                    int var20 = var11[var17];
                    var8[var17] = var20 >= 2048 ? 4096 - ((4096 - var9[var17]) * (4096 - var20) >> 11) : var9[var17] * var20 >> 11;
                    var13[var17] = var18 < 2048 ? var7[var17] * var18 >> 11 : 4096 - ((4096 - var7[var17]) * (4096 - var18) >> 11);
                    var6[var17] = var19 >= 2048 ? 4096 - ((4096 - var10[var17]) * (4096 - var19) >> 11) : var10[var17] * var19 >> 11;
                }
            } else if (var15 == 7) {
                for (int var53 = 0; var53 < class31.field491; var53++) {
                    int var54 = var10[var53];
                    int var55 = var7[var53];
                    int var56 = var9[var53];
                    var8[var53] = var56 == 4096 ? 4096 : (var11[var53] << 12) / (4096 - var56);
                    var13[var53] = var55 == 4096 ? 4096 : (var12[var53] << 12) / (4096 - var55);
                    var6[var53] = var54 == 4096 ? 4096 : (var14[var53] << 12) / (4096 - var54);
                }
            } else if (var15 == 8) {
                for (int var49 = 0; var49 < class31.field491; var49++) {
                    int var50 = var10[var49];
                    int var51 = var9[var49];
                    int var52 = var7[var49];
                    var8[var49] = var51 == 0 ? 0 : 4096 - ((4096 - var11[var49] << 12) / var51);
                    var13[var49] = var52 == 0 ? 0 : 4096 - ((4096 - var12[var49] << 12) / var52);
                    var6[var49] = var50 == 0 ? 0 : 4096 - ((4096 - var14[var49] << 12) / var50);
                }
            } else if (var15 == 9) {
                for (int var21 = 0; var21 < class31.field491; var21++) {
                    int var22 = var10[var21];
                    int var23 = var7[var21];
                    int var24 = var14[var21];
                    int var25 = var9[var21];
                    int var26 = var11[var21];
                    int var27 = var12[var21];
                    var8[var21] = var25 >= var26 ? var26 : var25;
                    var13[var21] = var27 > var23 ? var23 : var27;
                    var6[var21] = var24 <= var22 ? var24 : var22;
                }
            } else if (var15 == 10) {
                for (int var42 = 0; var42 < class31.field491; var42++) {
                    int var43 = var12[var42];
                    int var44 = var11[var42];
                    int var45 = var14[var42];
                    int var46 = var10[var42];
                    int var47 = var9[var42];
                    int var48 = var7[var42];
                    var8[var42] = var44 >= var47 ? var44 : var47;
                    var13[var42] = var43 < var48 ? var48 : var43;
                    var6[var42] = var46 <= var45 ? var45 : var46;
                }
            } else if (var15 == 11) {
                for (int var35 = 0; var35 < class31.field491; var35++) {
                    int var36 = var11[var35];
                    int var37 = var7[var35];
                    int var38 = var12[var35];
                    int var39 = var14[var35];
                    int var40 = var10[var35];
                    int var41 = var9[var35];
                    var8[var35] = var41 > var36 ? var41 - var36 : -var41 + var36;
                    var13[var35] = var37 <= var38 ? var38 - var37 : -var38 + var37;
                    var6[var35] = var40 > var39 ? var40 - var39 : -var40 + var39;
                }
            } else if (var15 == 12) {
                for (int var28 = 0; var28 < class31.field491; var28++) {
                    int var29 = var10[var28];
                    int var30 = var11[var28];
                    int var31 = var14[var28];
                    int var32 = var9[var28];
                    int var33 = var12[var28];
                    int var34 = var7[var28];
                    var8[var28] = var32 + var30 - (var30 * var32 >> 11);
                    var13[var28] = var33 + var34 - (var33 * var34 >> 11);
                    var6[var28] = var29 + var31 - (var29 * var31 >> 11);
                }
            }
        }
        return arg1 == 63 ? var3 : (int[][]) ((int[][]) null);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)Lfj;", line = 647)
    public static final class255 method1384(int arg0, int arg1) {
        if (arg1 <= 96) {
            return (class255) null;
        }
        field3017++;
        class255 var2 = (class255) class274.field4284.method2288((long) arg0, (byte) 94);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class5.field125.method967(3, arg0, 65280);
        class255 var4 = new class255();
        if (var3 != null) {
            var4.method1763(true, new class1(var3));
        }
        class274.field4284.method2281(0, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "(I)V", line = 676)
    public static final void method1385(int arg0) {
        if (arg0 != -18520) {
            method1385(-14);
        }
        class311.field4915.method2283((byte) 77);
        field3011++;
    }
}
