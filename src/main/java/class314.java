import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class314 extends class232 {

    @OriginalMember(owner = "client!ge", name = "X", descriptor = "I")
    private int field5414 = 6;

    @OriginalMember(owner = "client!ge", name = "Q", descriptor = "I")
    public static int field5407 = 0;

    @OriginalMember(owner = "client!ge", name = "T", descriptor = "Lhi;")
    public static class82 field5410 = class95.method664((byte) -55, "blinken2:");

    @OriginalMember(owner = "client!ge", name = "V", descriptor = "Lhn;")
    public static class317 field5412 = new class317(64);

    @OriginalMember(owner = "client!ge", name = "Z", descriptor = "I")
    public static int field5416 = 0;

    @OriginalMember(owner = "client!ge", name = "bb", descriptor = "F")
    public static float field5418;

    @OriginalMember(owner = "client!ge", name = "P", descriptor = "I")
    public static int field5406;

    @OriginalMember(owner = "client!ge", name = "R", descriptor = "I")
    public static int field5408;

    @OriginalMember(owner = "client!ge", name = "S", descriptor = "I")
    public static int field5409;

    @OriginalMember(owner = "client!ge", name = "U", descriptor = "I")
    public static int field5411;

    @OriginalMember(owner = "client!ge", name = "W", descriptor = "I")
    public static int field5413;

    @OriginalMember(owner = "client!ge", name = "Y", descriptor = "I")
    public static int field5415;

    @OriginalMember(owner = "client!ge", name = "ab", descriptor = "[[[B")
    public static byte[][][] field5417;

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "()V", line = 10)
    public class314() {
        super(2, false);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIII)V", line = 18)
    public static final void method2157(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5406++;
        int var6 = (arg4 - 32) * arg4 / arg0;
        class84.field1512[0].method1284(arg2, arg1);
        if (arg5 != -1) {
            field5415 = -110;
        }
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg4 - var6 - 32) * arg3 / (arg0 - arg4);
        class84.field1512[1].method1284(arg2, arg1 + arg4 - 16);
        if (!class147.field2485) {
            class320.method2217(arg2, arg1 + 16, 16, arg4 - 32, class199.field3405);
            class320.method2217(arg2, var7 + arg1 + 16, 16, var6, class202.field3465);
            class320.method2211(arg2, arg1 + var7 + 16, var6, class302.field5144);
            class320.method2211(arg2 + 1, arg1 + 16 + var7, var6, class302.field5144);
            class320.method2206(arg2, arg1 + var7 + 16, 16, class302.field5144);
            class320.method2206(arg2, arg1 + var7 + 17, 16, class302.field5144);
            class320.method2211(arg2 + 15, arg1 + var7 - -16, var6, class113.field2036);
            class320.method2211(arg2 + 14, arg1 - -var7 + 17, var6 - 1, class113.field2036);
            class320.method2206(arg2, arg1 + var6 - (-var7 - 15), 16, class113.field2036);
            class320.method2206(arg2 + 1, arg1 + var6 + 14 - -var7, 15, class113.field2036);
            return;
        }
        class116.method784(arg2, arg1 + 16, 16, arg4 - 32, class199.field3405);
        class116.method784(arg2, arg1 + var7 + 16, 16, var6, class202.field3465);
        class116.method792(arg2, arg1 + var7 + 16, var6, class302.field5144);
        class116.method792(arg2 + 1, arg1 + 16 + var7, var6, class302.field5144);
        class116.method781(arg2, arg1 + var7 + 16, 16, class302.field5144);
        class116.method781(arg2, var7 + arg1 + 17, 16, class302.field5144);
        class116.method792(arg2 + 15, arg1 + var7 + 16, var6, class113.field2036);
        class116.method792(arg2 + 14, arg1 + var7 - -17, var6 - 1, class113.field2036);
        class116.method781(arg2, var7 + arg1 + var6 + 15, 16, class113.field2036);
        class116.method781(arg2 + 1, arg1 - -14 - (-var6 + -var7), 15, class113.field2036);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)V", line = 67)
    public static void method2158(boolean arg0) {
        field5410 = null;
        field5412 = null;
        if (!arg0) {
            field5407 = -65;
        }
        field5417 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(IB)[I", line = 102)
    public final int[] method80(int arg0, byte arg1) {
        field5413++;
        int var3 = -51 / ((-arg1 - 31) / 55);
        int[] var4 = this.field4008.method131((byte) -68, arg0);
        if (this.field4008.field256) {
            int[] var5 = this.method1649(0, (byte) 89, arg0);
            int[] var6 = this.method1649(1, (byte) 68, arg0);
            int var7 = this.field5414;
            if (var7 == 1) {
                for (int var31 = 0; var31 < class54.field858; var31++) {
                    var4[var31] = var5[var31] + var6[var31];
                }
            } else if (var7 == 2) {
                for (int var30 = 0; var30 < class54.field858; var30++) {
                    var4[var30] = var5[var30] - var6[var30];
                }
            } else if (var7 == 3) {
                for (int var29 = 0; var29 < class54.field858; var29++) {
                    var4[var29] = var5[var29] * var6[var29] >> 12;
                }
            } else if (var7 == 4) {
                for (int var8 = 0; var8 < class54.field858; var8++) {
                    int var9 = var6[var8];
                    var4[var8] = var9 == 0 ? 4096 : (var5[var8] << 12) / var9;
                }
            } else if (var7 == 5) {
                for (int var28 = 0; var28 < class54.field858; var28++) {
                    var4[var28] = 4096 - ((4096 - var5[var28]) * (4096 - var6[var28]) >> 12);
                }
            } else if (var7 == 6) {
                for (int var10 = 0; var10 < class54.field858; var10++) {
                    int var11 = var6[var10];
                    var4[var10] = var11 < 2048 ? var5[var10] * var11 >> 11 : 4096 - ((4096 - var11) * (4096 - var5[var10]) >> 11);
                }
            } else if (var7 == 7) {
                for (int var26 = 0; var26 < class54.field858; var26++) {
                    int var27 = var5[var26];
                    var4[var26] = var27 == 4096 ? 4096 : (var6[var26] << 12) / (4096 - var27);
                }
            } else if (var7 == 8) {
                for (int var12 = 0; var12 < class54.field858; var12++) {
                    int var13 = var5[var12];
                    var4[var12] = var13 == 0 ? 0 : 4096 - ((4096 - var6[var12] << 12) / var13);
                }
            } else if (var7 == 9) {
                for (int var23 = 0; var23 < class54.field858; var23++) {
                    int var24 = var6[var23];
                    int var25 = var5[var23];
                    var4[var23] = var25 < var24 ? var25 : var24;
                }
            } else if (var7 == 10) {
                for (int var14 = 0; var14 < class54.field858; var14++) {
                    int var15 = var6[var14];
                    int var16 = var5[var14];
                    var4[var14] = var16 > var15 ? var16 : var15;
                }
            } else if (var7 == 11) {
                for (int var17 = 0; var17 < class54.field858; var17++) {
                    int var18 = var6[var17];
                    int var19 = var5[var17];
                    var4[var17] = var19 > var18 ? var19 - var18 : -var19 + var18;
                }
            } else if (var7 == 12) {
                for (int var20 = 0; var20 < class54.field858; var20++) {
                    int var21 = var6[var20];
                    int var22 = var5[var20];
                    var4[var20] = var22 + var21 - (var21 * var22 >> 11);
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IB)[[I", line = 360)
    public final int[][] method146(int arg0, byte arg1) {
        int[][] var3 = this.field3996.method136(0, arg0);
        field5409++;
        if (this.field3996.field278) {
            int[][] var4 = this.method1641(0, arg0, (byte) -98);
            int[][] var5 = this.method1641(1, arg0, (byte) -98);
            int[] var6 = var3[1];
            int[] var7 = var3[0];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field5414;
            if (var15 == 1) {
                for (int var63 = 0; var63 < class54.field858; var63++) {
                    var7[var63] = var9[var63] + var12[var63];
                    var6[var63] = var10[var63] + var13[var63];
                    var8[var63] = var11[var63] + var14[var63];
                }
            } else if (var15 == 2) {
                for (int var16 = 0; var16 < class54.field858; var16++) {
                    var7[var16] = var9[var16] - var12[var16];
                    var6[var16] = var10[var16] - var13[var16];
                    var8[var16] = var11[var16] - var14[var16];
                }
            } else if (var15 == 3) {
                for (int var17 = 0; var17 < class54.field858; var17++) {
                    var7[var17] = var9[var17] * var12[var17] >> 12;
                    var6[var17] = var10[var17] * var13[var17] >> 12;
                    var8[var17] = var11[var17] * var14[var17] >> 12;
                }
            } else if (var15 == 4) {
                for (int var18 = 0; var18 < class54.field858; var18++) {
                    int var19 = var13[var18];
                    int var20 = var14[var18];
                    int var21 = var12[var18];
                    var7[var18] = var21 == 0 ? 4096 : (var9[var18] << 12) / var21;
                    var6[var18] = var19 == 0 ? 4096 : (var10[var18] << 12) / var19;
                    var8[var18] = var20 == 0 ? 4096 : (var11[var18] << 12) / var20;
                }
            } else if (var15 == 5) {
                for (int var22 = 0; var22 < class54.field858; var22++) {
                    var7[var22] = 4096 - ((4096 - var12[var22]) * (4096 - var9[var22]) >> 12);
                    var6[var22] = 4096 - ((4096 - var10[var22]) * (4096 - var13[var22]) >> 12);
                    var8[var22] = 4096 - ((4096 - var11[var22]) * (4096 - var14[var22]) >> 12);
                }
            } else if (var15 == 6) {
                for (int var59 = 0; var59 < class54.field858; var59++) {
                    int var60 = var13[var59];
                    int var61 = var12[var59];
                    int var62 = var14[var59];
                    var7[var59] = var61 >= 2048 ? 4096 - ((4096 - var9[var59]) * (4096 - var61) >> 11) : var9[var59] * var61 >> 11;
                    var6[var59] = var60 >= 2048 ? 4096 - ((4096 - var10[var59]) * (4096 - var60) >> 11) : var10[var59] * var60 >> 11;
                    var8[var59] = var62 >= 2048 ? 4096 - ((4096 - var62) * (4096 - var11[var59]) >> 11) : var11[var59] * var62 >> 11;
                }
            } else if (var15 == 7) {
                for (int var55 = 0; var55 < class54.field858; var55++) {
                    int var56 = var9[var55];
                    int var57 = var11[var55];
                    int var58 = var10[var55];
                    var7[var55] = var56 == 4096 ? 4096 : (var12[var55] << 12) / (4096 - var56);
                    var6[var55] = var58 == 4096 ? 4096 : (var13[var55] << 12) / (4096 - var58);
                    var8[var55] = var57 == 4096 ? 4096 : (var14[var55] << 12) / (4096 - var57);
                }
            } else if (var15 == 8) {
                for (int var23 = 0; var23 < class54.field858; var23++) {
                    int var24 = var11[var23];
                    int var25 = var9[var23];
                    int var26 = var10[var23];
                    var7[var23] = var25 == 0 ? 0 : 4096 - ((4096 - var12[var23] << 12) / var25);
                    var6[var23] = var26 == 0 ? 0 : 4096 - ((4096 - var13[var23] << 12) / var26);
                    var8[var23] = var24 == 0 ? 0 : 4096 - ((4096 - var14[var23] << 12) / var24);
                }
            } else if (var15 == 9) {
                for (int var27 = 0; var27 < class54.field858; var27++) {
                    int var28 = var12[var27];
                    int var29 = var14[var27];
                    int var30 = var13[var27];
                    int var31 = var9[var27];
                    int var32 = var10[var27];
                    int var33 = var11[var27];
                    var7[var27] = var28 > var31 ? var31 : var28;
                    var6[var27] = var32 >= var30 ? var30 : var32;
                    var8[var27] = var33 >= var29 ? var29 : var33;
                }
            } else if (var15 == 10) {
                for (int var48 = 0; var48 < class54.field858; var48++) {
                    int var49 = var10[var48];
                    int var50 = var11[var48];
                    int var51 = var12[var48];
                    int var52 = var14[var48];
                    int var53 = var13[var48];
                    int var54 = var9[var48];
                    var7[var48] = var51 < var54 ? var54 : var51;
                    var6[var48] = var49 <= var53 ? var53 : var49;
                    var8[var48] = var52 >= var50 ? var52 : var50;
                }
            } else if (var15 == 11) {
                for (int var34 = 0; var34 < class54.field858; var34++) {
                    int var35 = var11[var34];
                    int var36 = var10[var34];
                    int var37 = var9[var34];
                    int var38 = var14[var34];
                    int var39 = var12[var34];
                    int var40 = var13[var34];
                    var7[var34] = var39 < var37 ? var37 - var39 : -var37 + var39;
                    var6[var34] = var40 < var36 ? var36 - var40 : -var36 + var40;
                    var8[var34] = var35 > var38 ? var35 - var38 : var38 - var35;
                }
            } else if (var15 == 12) {
                for (int var41 = 0; var41 < class54.field858; var41++) {
                    int var42 = var10[var41];
                    int var43 = var13[var41];
                    int var44 = var11[var41];
                    int var45 = var14[var41];
                    int var46 = var12[var41];
                    int var47 = var9[var41];
                    var7[var41] = var47 + var46 - (var46 * var47 >> 11);
                    var6[var41] = var42 + var43 - (var42 * var43 >> 11);
                    var8[var41] = var45 + var44 - (var44 * var45 >> 11);
                }
            }
        }
        return arg1 == -82 ? var3 : (int[][]) ((int[][]) null);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IBLbc;)V", line = 690)
    public final void method81(int arg0, byte arg1, class153 arg2) {
        if (arg0 == 0) {
            this.field5414 = arg2.method1082(arg1 ^ 0x52);
        } else if (arg0 == 1) {
            this.field3990 = arg2.method1082(-110) == 1;
        }
        if (arg1 == -19) {
            field5408++;
        }
    }
}
