import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class27 extends class304 {

    @OriginalMember(owner = "client!da", name = "U", descriptor = "I")
    private int field297 = 6;

    @OriginalMember(owner = "client!da", name = "S", descriptor = "[Ll;")
    public static class10[] field295 = new class10[14];

    @OriginalMember(owner = "client!da", name = "T", descriptor = "[[Z")
    public static boolean[][] field296 = new boolean[][] { { true, true, true }, { false, false }, { false, true }, { true, false }, { false, true, true }, { true, false, true }, { false, true, false }, { true, false, false } };

    @OriginalMember(owner = "client!da", name = "R", descriptor = "[I")
    public static int[] field294 = new int[2];

    @OriginalMember(owner = "client!da", name = "ab", descriptor = "I")
    public static int field303 = 128;

    @OriginalMember(owner = "client!da", name = "V", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!da", name = "W", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!da", name = "X", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!da", name = "bb", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!da", name = "Z", descriptor = "Lkj;")
    public static class256 field302;

    @OriginalMember(owner = "client!da", name = "Y", descriptor = "Lpe;")
    public static class277 field301;

    @OriginalMember(owner = "client!da", name = "Q", descriptor = "[I")
    public static int[] field293;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(II)[[I", line = 6)
    public final int[][] method75(int arg0, int arg1) {
        field298++;
        int[][] var3 = this.field4663.method886(arg0, 3);
        if (arg1 != 0) {
            field294 = (int[]) null;
        }
        if (this.field4663.field1820) {
            int[][] var4 = this.method2082(0, (byte) -97, arg0);
            int[][] var5 = this.method2082(1, (byte) -120, arg0);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field297;
            if (var15 == 1) {
                for (int var63 = 0; var63 < class218.field3333; var63++) {
                    var6[var63] = var9[var63] + var12[var63];
                    var7[var63] = var10[var63] + var13[var63];
                    var8[var63] = var11[var63] + var14[var63];
                }
            } else if (var15 == 2) {
                for (int var16 = 0; var16 < class218.field3333; var16++) {
                    var6[var16] = var9[var16] - var12[var16];
                    var7[var16] = var10[var16] - var13[var16];
                    var8[var16] = var11[var16] - var14[var16];
                }
            } else if (var15 == 3) {
                for (int var17 = 0; var17 < class218.field3333; var17++) {
                    var6[var17] = var9[var17] * var12[var17] >> 12;
                    var7[var17] = var10[var17] * var13[var17] >> 12;
                    var8[var17] = var11[var17] * var14[var17] >> 12;
                }
            } else if (var15 == 4) {
                for (int var18 = 0; var18 < class218.field3333; var18++) {
                    int var19 = var13[var18];
                    int var20 = var12[var18];
                    int var21 = var14[var18];
                    var6[var18] = var20 == 0 ? 4096 : (var9[var18] << 12) / var20;
                    var7[var18] = var19 == 0 ? 4096 : (var10[var18] << 12) / var19;
                    var8[var18] = var21 == 0 ? 4096 : (var11[var18] << 12) / var21;
                }
            } else if (var15 == 5) {
                for (int var22 = 0; var22 < class218.field3333; var22++) {
                    var6[var22] = 4096 - ((4096 - var9[var22]) * (4096 - var12[var22]) >> 12);
                    var7[var22] = 4096 - ((4096 - var10[var22]) * (4096 - var13[var22]) >> 12);
                    var8[var22] = 4096 - ((4096 - var14[var22]) * (4096 - var11[var22]) >> 12);
                }
            } else if (var15 == 6) {
                for (int var23 = 0; var23 < class218.field3333; var23++) {
                    int var24 = var13[var23];
                    int var25 = var12[var23];
                    int var26 = var14[var23];
                    var6[var23] = var25 < 2048 ? var9[var23] * var25 >> 11 : 4096 - ((4096 - var9[var23]) * (4096 - var25) >> 11);
                    var7[var23] = var24 >= 2048 ? 4096 - ((4096 - var10[var23]) * (4096 - var24) >> 11) : var10[var23] * var24 >> 11;
                    var8[var23] = var26 < 2048 ? var11[var23] * var26 >> 11 : 4096 - ((4096 - var11[var23]) * (4096 - var26) >> 11);
                }
            } else if (var15 == 7) {
                for (int var27 = 0; var27 < class218.field3333; var27++) {
                    int var28 = var10[var27];
                    int var29 = var11[var27];
                    int var30 = var9[var27];
                    var6[var27] = var30 == 4096 ? 4096 : (var12[var27] << 12) / (4096 - var30);
                    var7[var27] = var28 == 4096 ? 4096 : (var13[var27] << 12) / (4096 - var28);
                    var8[var27] = var29 == 4096 ? 4096 : (var14[var27] << 12) / (4096 - var29);
                }
            } else if (var15 == 8) {
                for (int var59 = 0; var59 < class218.field3333; var59++) {
                    int var60 = var9[var59];
                    int var61 = var10[var59];
                    int var62 = var11[var59];
                    var6[var59] = var60 == 0 ? 0 : 4096 - ((4096 - var12[var59] << 12) / var60);
                    var7[var59] = var61 == 0 ? 0 : 4096 - ((4096 - var13[var59] << 12) / var61);
                    var8[var59] = var62 == 0 ? 0 : 4096 - (4096 - var14[var59] << 12) / var62;
                }
            } else if (var15 == 9) {
                for (int var31 = 0; var31 < class218.field3333; var31++) {
                    int var32 = var13[var31];
                    int var33 = var12[var31];
                    int var34 = var14[var31];
                    int var35 = var11[var31];
                    int var36 = var9[var31];
                    int var37 = var10[var31];
                    var6[var31] = var33 <= var36 ? var33 : var36;
                    var7[var31] = var32 > var37 ? var37 : var32;
                    var8[var31] = var35 < var34 ? var35 : var34;
                }
            } else if (var15 == 10) {
                for (int var52 = 0; var52 < class218.field3333; var52++) {
                    int var53 = var13[var52];
                    int var54 = var10[var52];
                    int var55 = var11[var52];
                    int var56 = var14[var52];
                    int var57 = var9[var52];
                    int var58 = var12[var52];
                    var6[var52] = var57 <= var58 ? var58 : var57;
                    var7[var52] = var54 > var53 ? var54 : var53;
                    var8[var52] = var56 < var55 ? var55 : var56;
                }
            } else if (var15 == 11) {
                for (int var45 = 0; var45 < class218.field3333; var45++) {
                    int var46 = var11[var45];
                    int var47 = var13[var45];
                    int var48 = var10[var45];
                    int var49 = var12[var45];
                    int var50 = var9[var45];
                    int var51 = var14[var45];
                    var6[var45] = var50 > var49 ? var50 - var49 : var49 - var50;
                    var7[var45] = var48 > var47 ? var48 - var47 : -var48 + var47;
                    var8[var45] = var51 < var46 ? var46 - var51 : var51 - var46;
                }
            } else if (var15 == 12) {
                for (int var38 = 0; var38 < class218.field3333; var38++) {
                    int var39 = var9[var38];
                    int var40 = var11[var38];
                    int var41 = var13[var38];
                    int var42 = var14[var38];
                    int var43 = var10[var38];
                    int var44 = var12[var38];
                    var6[var38] = var39 + var44 - (var39 * var44 >> 11);
                    var7[var38] = var43 + var41 - (var41 * var43 >> 11);
                    var8[var38] = var40 + var42 - (var40 * var42 >> 11);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!da", name = "e", descriptor = "(B)V", line = 323)
    public static void method204(byte arg0) {
        field294 = null;
        int var1 = 69 / ((arg0 + 21) / 36);
        field296 = (boolean[][]) null;
        field293 = null;
        field295 = null;
        field301 = null;
        field302 = null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IZI)V", line = 338)
    public static final void method205(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            field293 = (int[]) null;
        }
        class281 var3 = class265.field4136[class265.field4112][arg2][arg0];
        field304++;
        if (var3 == null) {
            class25.method200(class265.field4112, arg2, arg0);
            return;
        }
        int var4 = -99999999;
        class147 var5 = null;
        for (class147 var6 = (class147) var3.method1954(-66); var6 != null; var6 = (class147) var3.method1950((byte) 112)) {
            class108 var7 = class222.method1576(var6.field2243.field2804, (byte) 92);
            int var8 = var7.field1639;
            if (var7.field1583 == 1) {
                var8 = (var6.field2243.field2812 + 1) * var8;
            }
            if (var8 > var4) {
                var5 = var6;
                var4 = var8;
            }
        }
        if (var5 == null) {
            class25.method200(class265.field4112, arg2, arg0);
            return;
        }
        class174 var9 = null;
        var3.method1949(var5, (byte) 91);
        class147 var10 = (class147) var3.method1954(-66);
        class174 var11 = null;
        while (var10 != null) {
            class174 var12 = var10.field2243;
            if (var5.field2243.field2804 != var12.field2804) {
                if (var9 == null) {
                    var9 = var12;
                }
                if (var9.field2804 != var12.field2804 && var11 == null) {
                    var11 = var12;
                }
            }
            var10 = (class147) var3.method1950((byte) 95);
        }
        long var13 = (long) (arg2 + (arg0 << 7) + 1610612736);
        class181.method1350(class265.field4112, arg2, arg0, class328.method2291(class265.field4112, arg0 * 128 + 64, arg2 * 128 + 64, 78), var5.field2243, var13, var9, var11);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II)[I", line = 421)
    public final int[] method71(int arg0, int arg1) {
        if (arg0 != 7) {
            return (int[]) null;
        }
        field300++;
        int[] var3 = this.field4669.method2342(-28750, arg1);
        if (this.field4669.field5223) {
            int[] var4 = this.method2086(arg1, 0, (byte) 112);
            int[] var5 = this.method2086(arg1, 1, (byte) 112);
            int var6 = this.field297;
            if (var6 == 1) {
                for (int var7 = 0; var7 < class218.field3333; var7++) {
                    var3[var7] = var4[var7] + var5[var7];
                }
            } else if (var6 == 2) {
                for (int var30 = 0; var30 < class218.field3333; var30++) {
                    var3[var30] = var4[var30] - var5[var30];
                }
            } else if (var6 == 3) {
                for (int var29 = 0; var29 < class218.field3333; var29++) {
                    var3[var29] = var4[var29] * var5[var29] >> 12;
                }
            } else if (var6 == 4) {
                for (int var8 = 0; var8 < class218.field3333; var8++) {
                    int var9 = var5[var8];
                    var3[var8] = var9 == 0 ? 4096 : (var4[var8] << 12) / var9;
                }
            } else if (var6 == 5) {
                for (int var10 = 0; var10 < class218.field3333; var10++) {
                    var3[var10] = 4096 - ((4096 - var5[var10]) * (4096 - var4[var10]) >> 12);
                }
            } else if (var6 == 6) {
                for (int var27 = 0; var27 < class218.field3333; var27++) {
                    int var28 = var5[var27];
                    var3[var27] = var28 < 2048 ? var4[var27] * var28 >> 11 : 4096 - ((4096 - var4[var27]) * (4096 - var28) >> 11);
                }
            } else if (var6 == 7) {
                for (int var11 = 0; var11 < class218.field3333; var11++) {
                    int var12 = var4[var11];
                    var3[var11] = var12 == 4096 ? 4096 : (var5[var11] << 12) / (4096 - var12);
                }
            } else if (var6 == 8) {
                for (int var13 = 0; var13 < class218.field3333; var13++) {
                    int var14 = var4[var13];
                    var3[var13] = var14 == 0 ? 0 : 4096 - (4096 - var5[var13] << 12) / var14;
                }
            } else if (var6 == 9) {
                for (int var24 = 0; var24 < class218.field3333; var24++) {
                    int var25 = var5[var24];
                    int var26 = var4[var24];
                    var3[var24] = var26 < var25 ? var26 : var25;
                }
            } else if (var6 == 10) {
                for (int var21 = 0; var21 < class218.field3333; var21++) {
                    int var22 = var4[var21];
                    int var23 = var5[var21];
                    var3[var21] = var22 > var23 ? var22 : var23;
                }
            } else if (var6 == 11) {
                for (int var18 = 0; var18 < class218.field3333; var18++) {
                    int var19 = var5[var18];
                    int var20 = var4[var18];
                    var3[var18] = var20 > var19 ? var20 - var19 : var19 - var20;
                }
            } else if (var6 == 12) {
                for (int var15 = 0; var15 < class218.field3333; var15++) {
                    int var16 = var4[var15];
                    int var17 = var5[var15];
                    var3[var15] = var16 + var17 - (var16 * var17 >> 11);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V", line = 669)
    public class27() {
        super(2, false);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lwm;II)V", line = 690)
    public final void method69(class254 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            this.field297 = arg0.method1774((byte) 93);
        } else if (arg1 == 1) {
            this.field4652 = arg0.method1774((byte) 12) == 1;
        }
        field299++;
        if (arg2 != -2828) {
            method204((byte) -70);
        }
    }
}
