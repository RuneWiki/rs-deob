import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class234 extends class224 {

    @OriginalMember(owner = "client!jd", name = "V", descriptor = "I")
    private int field3761 = 6;

    @OriginalMember(owner = "client!jd", name = "S", descriptor = "I")
    public static int field3758 = -1;

    @OriginalMember(owner = "client!jd", name = "W", descriptor = "[[Z")
    public static boolean[][] field3762 = new boolean[][] { new boolean[0], { true, false, true }, { true, false, false, true }, { false, false, true, true }, { true, true, false }, { false, true, true }, { true, false, false, true }, { false, false, false, true, true }, { false, true, true }, { true, false, true, true, true }, { false, true, true, true, true }, { false, true, true, true, true, false } };

    @OriginalMember(owner = "client!jd", name = "U", descriptor = "S")
    public static short field3760 = 320;

    @OriginalMember(owner = "client!jd", name = "bb", descriptor = "Luf;")
    private static class168 field3767 = class148.method1019(-1720, "Type");

    @OriginalMember(owner = "client!jd", name = "Z", descriptor = "Luf;")
    public static class168 field3765 = field3767;

    @OriginalMember(owner = "client!jd", name = "R", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!jd", name = "T", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!jd", name = "X", descriptor = "I")
    public static int field3763;

    @OriginalMember(owner = "client!jd", name = "Y", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "client!jd", name = "ab", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "(I)V", line = 4)
    public static void method1588(int arg0) {
        if (arg0 != 18922) {
            method1588(-3);
        }
        field3765 = null;
        field3762 = (boolean[][]) null;
        field3767 = null;
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "()V", line = 41)
    public class234() {
        super(2, false);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IZLj;)V", line = 45)
    public final void method19(int arg0, boolean arg1, class153 arg2) {
        if (arg1) {
            this.method19(-125, false, (class153) null);
        }
        field3759++;
        if (arg0 == 0) {
            this.field3761 = arg2.method1042((byte) -21);
        } else if (arg0 == 1) {
            this.field3610 = arg2.method1042((byte) 108) == 1;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IB)[[I", line = 80)
    public final int[][] method17(int arg0, byte arg1) {
        if (arg1 != -77) {
            field3765 = (class168) null;
        }
        field3757++;
        int[][] var3 = this.field3631.method1587(arg0, arg1 ^ 0xFFFFD9FF);
        if (this.field3631.field3756) {
            int[][] var4 = this.method1535(0, 3, arg0);
            int[][] var5 = this.method1535(1, 3, arg0);
            int[] var6 = var3[1];
            int[] var7 = var3[0];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[2];
            int[] var14 = var5[1];
            int var15 = this.field3761;
            if (var15 == 1) {
                for (int var63 = 0; var63 < class187.field2961; var63++) {
                    var7[var63] = var9[var63] + var12[var63];
                    var6[var63] = var10[var63] + var14[var63];
                    var8[var63] = var11[var63] + var13[var63];
                }
            } else if (var15 == 2) {
                for (int var62 = 0; var62 < class187.field2961; var62++) {
                    var7[var62] = var9[var62] - var12[var62];
                    var6[var62] = var10[var62] - var14[var62];
                    var8[var62] = var11[var62] - var13[var62];
                }
            } else if (var15 == 3) {
                for (int var61 = 0; var61 < class187.field2961; var61++) {
                    var7[var61] = var9[var61] * var12[var61] >> 12;
                    var6[var61] = var10[var61] * var14[var61] >> 12;
                    var8[var61] = var11[var61] * var13[var61] >> 12;
                }
            } else if (var15 == 4) {
                for (int var16 = 0; var16 < class187.field2961; var16++) {
                    int var17 = var14[var16];
                    int var18 = var13[var16];
                    int var19 = var12[var16];
                    var7[var16] = var19 == 0 ? 4096 : (var9[var16] << 12) / var19;
                    var6[var16] = var17 == 0 ? 4096 : (var10[var16] << 12) / var17;
                    var8[var16] = var18 == 0 ? 4096 : (var11[var16] << 12) / var18;
                }
            } else if (var15 == 5) {
                for (int var20 = 0; var20 < class187.field2961; var20++) {
                    var7[var20] = 4096 - ((4096 - var9[var20]) * (4096 - var12[var20]) >> 12);
                    var6[var20] = 4096 - ((4096 - var10[var20]) * (4096 - var14[var20]) >> 12);
                    var8[var20] = 4096 - ((4096 - var11[var20]) * (4096 - var13[var20]) >> 12);
                }
            } else if (var15 == 6) {
                for (int var57 = 0; var57 < class187.field2961; var57++) {
                    int var58 = var12[var57];
                    int var59 = var14[var57];
                    int var60 = var13[var57];
                    var7[var57] = var58 < 2048 ? var9[var57] * var58 >> 11 : 4096 - ((4096 - var9[var57]) * (4096 - var58) >> 11);
                    var6[var57] = var59 < 2048 ? var10[var57] * var59 >> 11 : 4096 - ((4096 - var10[var57]) * (4096 - var59) >> 11);
                    var8[var57] = var60 < 2048 ? var11[var57] * var60 >> 11 : 4096 - ((4096 - var11[var57]) * (4096 - var60) >> 11);
                }
            } else if (var15 == 7) {
                for (int var53 = 0; var53 < class187.field2961; var53++) {
                    int var54 = var9[var53];
                    int var55 = var11[var53];
                    int var56 = var10[var53];
                    var7[var53] = var54 == 4096 ? 4096 : (var12[var53] << 12) / (4096 - var54);
                    var6[var53] = var56 == 4096 ? 4096 : (var14[var53] << 12) / (4096 - var56);
                    var8[var53] = var55 == 4096 ? 4096 : (var13[var53] << 12) / (4096 - var55);
                }
            } else if (var15 == 8) {
                for (int var49 = 0; var49 < class187.field2961; var49++) {
                    int var50 = var10[var49];
                    int var51 = var9[var49];
                    int var52 = var11[var49];
                    var7[var49] = var51 == 0 ? 0 : 4096 - ((4096 - var12[var49] << 12) / var51);
                    var6[var49] = var50 == 0 ? 0 : 4096 - ((4096 - var14[var49] << 12) / var50);
                    var8[var49] = var52 == 0 ? 0 : 4096 - ((4096 - var13[var49] << 12) / var52);
                }
            } else if (var15 == 9) {
                for (int var21 = 0; var21 < class187.field2961; var21++) {
                    int var22 = var11[var21];
                    int var23 = var13[var21];
                    int var24 = var14[var21];
                    int var25 = var9[var21];
                    int var26 = var12[var21];
                    int var27 = var10[var21];
                    var7[var21] = var26 > var25 ? var25 : var26;
                    var6[var21] = var24 > var27 ? var27 : var24;
                    var8[var21] = var22 < var23 ? var22 : var23;
                }
            } else if (var15 == 10) {
                for (int var42 = 0; var42 < class187.field2961; var42++) {
                    int var43 = var14[var42];
                    int var44 = var10[var42];
                    int var45 = var9[var42];
                    int var46 = var11[var42];
                    int var47 = var12[var42];
                    int var48 = var13[var42];
                    var7[var42] = var47 < var45 ? var45 : var47;
                    var6[var42] = var43 >= var44 ? var43 : var44;
                    var8[var42] = var48 < var46 ? var46 : var48;
                }
            } else if (var15 == 11) {
                for (int var28 = 0; var28 < class187.field2961; var28++) {
                    int var29 = var9[var28];
                    int var30 = var11[var28];
                    int var31 = var12[var28];
                    int var32 = var13[var28];
                    int var33 = var14[var28];
                    int var34 = var10[var28];
                    var7[var28] = var31 >= var29 ? var31 - var29 : -var31 + var29;
                    var6[var28] = var34 <= var33 ? var33 - var34 : -var33 + var34;
                    var8[var28] = var30 > var32 ? var30 - var32 : -var30 + var32;
                }
            } else if (var15 == 12) {
                for (int var35 = 0; var35 < class187.field2961; var35++) {
                    int var36 = var12[var35];
                    int var37 = var14[var35];
                    int var38 = var9[var35];
                    int var39 = var11[var35];
                    int var40 = var13[var35];
                    int var41 = var10[var35];
                    var7[var35] = var36 + var38 - (var36 * var38 >> 11);
                    var6[var35] = var41 + var37 - (var37 * var41 >> 11);
                    var8[var35] = var39 + var40 - (var39 * var40 >> 11);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BI)[I", line = 397)
    public final int[] method18(byte arg0, int arg1) {
        field3766++;
        int[] var3 = this.field3613.method1866(1, arg1);
        int var4 = -88 % ((20 - arg0) / 51);
        if (this.field3613.field4531) {
            int[] var5 = this.method1537(arg1, 0, 0);
            int[] var6 = this.method1537(arg1, 1, 0);
            int var7 = this.field3761;
            if (var7 == 1) {
                for (int var8 = 0; var8 < class187.field2961; var8++) {
                    var3[var8] = var5[var8] + var6[var8];
                }
            } else if (var7 == 2) {
                for (int var9 = 0; var9 < class187.field2961; var9++) {
                    var3[var9] = var5[var9] - var6[var9];
                }
            } else if (var7 == 3) {
                for (int var31 = 0; var31 < class187.field2961; var31++) {
                    var3[var31] = var5[var31] * var6[var31] >> 12;
                }
            } else if (var7 == 4) {
                for (int var29 = 0; var29 < class187.field2961; var29++) {
                    int var30 = var6[var29];
                    var3[var29] = var30 == 0 ? 4096 : (var5[var29] << 12) / var30;
                }
            } else if (var7 == 5) {
                for (int var10 = 0; var10 < class187.field2961; var10++) {
                    var3[var10] = 4096 - ((4096 - var6[var10]) * (4096 - var5[var10]) >> 12);
                }
            } else if (var7 == 6) {
                for (int var11 = 0; var11 < class187.field2961; var11++) {
                    int var12 = var6[var11];
                    var3[var11] = var12 >= 2048 ? 4096 - ((4096 - var5[var11]) * (4096 - var12) >> 11) : var5[var11] * var12 >> 11;
                }
            } else if (var7 == 7) {
                for (int var27 = 0; var27 < class187.field2961; var27++) {
                    int var28 = var5[var27];
                    var3[var27] = var28 == 4096 ? 4096 : (var6[var27] << 12) / (4096 - var28);
                }
            } else if (var7 == 8) {
                for (int var13 = 0; var13 < class187.field2961; var13++) {
                    int var14 = var5[var13];
                    var3[var13] = var14 == 0 ? 0 : 4096 - ((4096 - var6[var13] << 12) / var14);
                }
            } else if (var7 == 9) {
                for (int var24 = 0; var24 < class187.field2961; var24++) {
                    int var25 = var6[var24];
                    int var26 = var5[var24];
                    var3[var24] = var26 >= var25 ? var25 : var26;
                }
            } else if (var7 == 10) {
                for (int var15 = 0; var15 < class187.field2961; var15++) {
                    int var16 = var6[var15];
                    int var17 = var5[var15];
                    var3[var15] = var17 > var16 ? var17 : var16;
                }
            } else if (var7 == 11) {
                for (int var18 = 0; var18 < class187.field2961; var18++) {
                    int var19 = var5[var18];
                    int var20 = var6[var18];
                    var3[var18] = var20 < var19 ? var19 - var20 : -var19 + var20;
                }
            } else if (var7 == 12) {
                for (int var21 = 0; var21 < class187.field2961; var21++) {
                    int var22 = var6[var21];
                    int var23 = var5[var21];
                    var3[var21] = var23 - ((var22 * var23 >> 11) - var22);
                }
            }
        }
        return var3;
    }
}
