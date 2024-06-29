import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class29 extends class197 {

    @OriginalMember(owner = "client!ga", name = "O", descriptor = "I")
    private int field343 = 6;

    @OriginalMember(owner = "client!ga", name = "N", descriptor = "Lmb;")
    public static class172 field342 = new class172(64);

    @OriginalMember(owner = "client!ga", name = "R", descriptor = "Loh;")
    public static class258 field346 = class153.method1046(":tradereq:", 91);

    @OriginalMember(owner = "client!ga", name = "S", descriptor = "[[I")
    public static int[][] field347 = new int[104][104];

    @OriginalMember(owner = "client!ga", name = "M", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!ga", name = "P", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!ga", name = "Q", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "()V", line = 4)
    public class29() {
        super(2, false);
    }

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "(III)J", line = 19)
    public static final long method218(int arg0, int arg1, int arg2) {
        class228 var3 = class178.field3180[arg0][arg1][arg2];
        return var3 == null || var3.field3939 == null ? 0L : var3.field3939.field4584;
    }

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "(B)V", line = 27)
    public static void method219(byte arg0) {
        field342 = null;
        field346 = null;
        if (arg0 == 35) {
            field347 = (int[][]) null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILva;I)V", line = 45)
    public final void method98(int arg0, class235 arg1, int arg2) {
        field341++;
        if (arg0 != 7955) {
            this.method96(3, -23);
        }
        if (arg2 == 0) {
            this.field343 = arg1.method1589(74);
        } else if (arg2 == 1) {
            this.field3462 = arg1.method1589(97) == 1;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)[I", line = 87)
    public final int[] method96(int arg0, int arg1) {
        field344++;
        int[] var3 = this.field3456.method2104(arg1, 0);
        if (this.field3456.field5115) {
            int[] var4 = this.method1327(0, -128, arg1);
            int[] var5 = this.method1327(1, arg0 ^ 0x3F22, arg1);
            int var6 = this.field343;
            if (var6 == 1) {
                for (int var7 = 0; var7 < class190.field3362; var7++) {
                    var3[var7] = var4[var7] + var5[var7];
                }
            } else if (var6 == 2) {
                for (int var30 = 0; var30 < class190.field3362; var30++) {
                    var3[var30] = var4[var30] - var5[var30];
                }
            } else if (var6 == 3) {
                for (int var29 = 0; var29 < class190.field3362; var29++) {
                    var3[var29] = var4[var29] * var5[var29] >> 12;
                }
            } else if (var6 == 4) {
                for (int var27 = 0; var27 < class190.field3362; var27++) {
                    int var28 = var5[var27];
                    var3[var27] = var28 == 0 ? 4096 : (var4[var27] << 12) / var28;
                }
            } else if (var6 == 5) {
                for (int var8 = 0; var8 < class190.field3362; var8++) {
                    var3[var8] = 4096 - ((4096 - var5[var8]) * (4096 - var4[var8]) >> 12);
                }
            } else if (var6 == 6) {
                for (int var9 = 0; var9 < class190.field3362; var9++) {
                    int var10 = var5[var9];
                    var3[var9] = var10 >= 2048 ? 4096 - ((4096 - var4[var9]) * (4096 - var10) >> 11) : var4[var9] * var10 >> 11;
                }
            } else if (var6 == 7) {
                for (int var11 = 0; var11 < class190.field3362; var11++) {
                    int var12 = var4[var11];
                    var3[var11] = var12 == 4096 ? 4096 : (var5[var11] << 12) / (4096 - var12);
                }
            } else if (var6 == 8) {
                for (int var13 = 0; var13 < class190.field3362; var13++) {
                    int var14 = var4[var13];
                    var3[var13] = var14 == 0 ? 0 : 4096 - ((4096 - var5[var13] << 12) / var14);
                }
            } else if (var6 == 9) {
                for (int var15 = 0; var15 < class190.field3362; var15++) {
                    int var16 = var4[var15];
                    int var17 = var5[var15];
                    var3[var15] = var16 >= var17 ? var17 : var16;
                }
            } else if (var6 == 10) {
                for (int var24 = 0; var24 < class190.field3362; var24++) {
                    int var25 = var5[var24];
                    int var26 = var4[var24];
                    var3[var24] = var25 >= var26 ? var25 : var26;
                }
            } else if (var6 == 11) {
                for (int var18 = 0; var18 < class190.field3362; var18++) {
                    int var19 = var5[var18];
                    int var20 = var4[var18];
                    var3[var18] = var19 >= var20 ? var19 - var20 : -var19 + var20;
                }
            } else if (var6 == 12) {
                for (int var21 = 0; var21 < class190.field3362; var21++) {
                    int var22 = var4[var21];
                    int var23 = var5[var21];
                    var3[var21] = var22 + var23 - (var22 * var23 >> 11);
                }
            }
        }
        if (arg0 != -16221) {
            field347 = (int[][]) ((int[][]) null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IB)[[I", line = 331)
    public final int[][] method101(int arg0, byte arg1) {
        field345++;
        int var3 = 67 / ((1 - arg1) / 37);
        int[][] var4 = this.field3461.method1936(arg0, 17174);
        if (this.field3461.field4765) {
            int[][] var5 = this.method1322(0, arg0, 0);
            int[][] var6 = this.method1322(0, arg0, 1);
            int[] var7 = var4[1];
            int[] var8 = var4[0];
            int[] var9 = var4[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[1];
            int[] var14 = var6[0];
            int[] var15 = var6[2];
            int var16 = this.field343;
            if (var16 == 1) {
                for (int var17 = 0; var17 < class190.field3362; var17++) {
                    var8[var17] = var10[var17] + var14[var17];
                    var7[var17] = var11[var17] + var13[var17];
                    var9[var17] = var12[var17] + var15[var17];
                }
            } else if (var16 == 2) {
                for (int var18 = 0; var18 < class190.field3362; var18++) {
                    var8[var18] = var10[var18] - var14[var18];
                    var7[var18] = var11[var18] - var13[var18];
                    var9[var18] = var12[var18] - var15[var18];
                }
            } else if (var16 == 3) {
                for (int var19 = 0; var19 < class190.field3362; var19++) {
                    var8[var19] = var10[var19] * var14[var19] >> 12;
                    var7[var19] = var11[var19] * var13[var19] >> 12;
                    var9[var19] = var12[var19] * var15[var19] >> 12;
                }
            } else if (var16 == 4) {
                for (int var61 = 0; var61 < class190.field3362; var61++) {
                    int var62 = var13[var61];
                    int var63 = var15[var61];
                    int var64 = var14[var61];
                    var8[var61] = var64 == 0 ? 4096 : (var10[var61] << 12) / var64;
                    var7[var61] = var62 == 0 ? 4096 : (var11[var61] << 12) / var62;
                    var9[var61] = var63 == 0 ? 4096 : (var12[var61] << 12) / var63;
                }
            } else if (var16 == 5) {
                for (int var60 = 0; var60 < class190.field3362; var60++) {
                    var8[var60] = 4096 - ((4096 - var14[var60]) * (4096 - var10[var60]) >> 12);
                    var7[var60] = 4096 - ((4096 - var11[var60]) * (4096 - var13[var60]) >> 12);
                    var9[var60] = 4096 - ((4096 - var12[var60]) * (4096 - var15[var60]) >> 12);
                }
            } else if (var16 == 6) {
                for (int var20 = 0; var20 < class190.field3362; var20++) {
                    int var21 = var14[var20];
                    int var22 = var13[var20];
                    int var23 = var15[var20];
                    var8[var20] = var21 < 2048 ? var10[var20] * var21 >> 11 : 4096 - ((4096 - var10[var20]) * (4096 - var21) >> 11);
                    var7[var20] = var22 < 2048 ? var11[var20] * var22 >> 11 : 4096 - ((4096 - var11[var20]) * (4096 - var22) >> 11);
                    var9[var20] = var23 < 2048 ? var12[var20] * var23 >> 11 : 4096 - ((4096 - var12[var20]) * (4096 - var23) >> 11);
                }
            } else if (var16 == 7) {
                for (int var56 = 0; var56 < class190.field3362; var56++) {
                    int var57 = var11[var56];
                    int var58 = var10[var56];
                    int var59 = var12[var56];
                    var8[var56] = var58 == 4096 ? 4096 : (var14[var56] << 12) / (4096 - var58);
                    var7[var56] = var57 == 4096 ? 4096 : (var13[var56] << 12) / (4096 - var57);
                    var9[var56] = var59 == 4096 ? 4096 : (var15[var56] << 12) / (4096 - var59);
                }
            } else if (var16 == 8) {
                for (int var24 = 0; var24 < class190.field3362; var24++) {
                    int var25 = var10[var24];
                    int var26 = var11[var24];
                    int var27 = var12[var24];
                    var8[var24] = var25 == 0 ? 0 : 4096 - ((4096 - var14[var24] << 12) / var25);
                    var7[var24] = var26 == 0 ? 0 : 4096 - (4096 - var13[var24] << 12) / var26;
                    var9[var24] = var27 == 0 ? 0 : 4096 - ((4096 - var15[var24] << 12) / var27);
                }
            } else if (var16 == 9) {
                for (int var28 = 0; var28 < class190.field3362; var28++) {
                    int var29 = var15[var28];
                    int var30 = var10[var28];
                    int var31 = var14[var28];
                    int var32 = var12[var28];
                    int var33 = var11[var28];
                    int var34 = var13[var28];
                    var8[var28] = var30 >= var31 ? var31 : var30;
                    var7[var28] = var33 < var34 ? var33 : var34;
                    var9[var28] = var32 >= var29 ? var29 : var32;
                }
            } else if (var16 == 10) {
                for (int var35 = 0; var35 < class190.field3362; var35++) {
                    int var36 = var14[var35];
                    int var37 = var12[var35];
                    int var38 = var10[var35];
                    int var39 = var13[var35];
                    int var40 = var15[var35];
                    int var41 = var11[var35];
                    var8[var35] = var36 < var38 ? var38 : var36;
                    var7[var35] = var41 <= var39 ? var39 : var41;
                    var9[var35] = var40 >= var37 ? var40 : var37;
                }
            } else if (var16 == 11) {
                for (int var49 = 0; var49 < class190.field3362; var49++) {
                    int var50 = var15[var49];
                    int var51 = var11[var49];
                    int var52 = var10[var49];
                    int var53 = var14[var49];
                    int var54 = var12[var49];
                    int var55 = var13[var49];
                    var8[var49] = var52 > var53 ? var52 - var53 : -var52 + var53;
                    var7[var49] = var55 < var51 ? var51 - var55 : -var51 + var55;
                    var9[var49] = var54 <= var50 ? var50 - var54 : var54 - var50;
                }
            } else if (var16 == 12) {
                for (int var42 = 0; var42 < class190.field3362; var42++) {
                    int var43 = var13[var42];
                    int var44 = var10[var42];
                    int var45 = var12[var42];
                    int var46 = var15[var42];
                    int var47 = var14[var42];
                    int var48 = var11[var42];
                    var8[var42] = var44 + var47 - (var44 * var47 >> 11);
                    var7[var42] = var48 + var43 - (var43 * var48 >> 11);
                    var9[var42] = var45 - ((var45 * var46 >> 11) - var46);
                }
            }
        }
        return var4;
    }
}
