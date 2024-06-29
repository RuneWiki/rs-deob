import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class229 extends class71 {

    @OriginalMember(owner = "client!ol", name = "R", descriptor = "I")
    private int field3989 = 6;

    @OriginalMember(owner = "client!ol", name = "M", descriptor = "[[I")
    public static int[][] field3984 = new int[104][104];

    @OriginalMember(owner = "client!ol", name = "P", descriptor = "Lud;")
    public static class279 field3987 = class130.method1024("_", 255);

    @OriginalMember(owner = "client!ol", name = "O", descriptor = "[I")
    public static int[] field3986 = new int[32];

    @OriginalMember(owner = "client!ol", name = "N", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!ol", name = "Q", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!ol", name = "S", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!ol", name = "U", descriptor = "I")
    public static int field3992;

    @OriginalMember(owner = "client!ol", name = "T", descriptor = "Lig;")
    public static class175 field3991;

    @OriginalMember(owner = "client!ol", name = "K", descriptor = "Ljava/awt/Image;")
    public static Image field3982;

    @OriginalMember(owner = "client!ol", name = "L", descriptor = "[Lve;")
    public static class265[] field3983;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IZLvh;)V", line = 10)
    public final void method77(int arg0, boolean arg1, class53 arg2) {
        if (!arg1) {
            this.method77(-61, true, (class53) null);
        }
        if (arg0 == 0) {
            this.field3989 = arg2.method483(-115);
        } else if (arg0 == 1) {
            this.field1389 = arg2.method483(-116) == 1;
        }
        field3990++;
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(IB)[I", line = 48)
    public final int[] method199(int arg0, byte arg1) {
        field3985++;
        if (arg1 > -69) {
            return (int[]) null;
        }
        int[] var3 = this.field1390.method549(arg0, true);
        if (this.field1390.field1304) {
            int[] var4 = this.method624(arg0, -3, 0);
            int[] var5 = this.method624(arg0, -3, 1);
            int var6 = this.field3989;
            if (var6 == 1) {
                for (int var7 = 0; var7 < class215.field3787; var7++) {
                    var3[var7] = var4[var7] + var5[var7];
                }
            } else if (var6 == 2) {
                for (int var8 = 0; var8 < class215.field3787; var8++) {
                    var3[var8] = var4[var8] - var5[var8];
                }
            } else if (var6 == 3) {
                for (int var30 = 0; var30 < class215.field3787; var30++) {
                    var3[var30] = var4[var30] * var5[var30] >> 12;
                }
            } else if (var6 == 4) {
                for (int var28 = 0; var28 < class215.field3787; var28++) {
                    int var29 = var5[var28];
                    var3[var28] = var29 == 0 ? 4096 : (var4[var28] << 12) / var29;
                }
            } else if (var6 == 5) {
                for (int var9 = 0; var9 < class215.field3787; var9++) {
                    var3[var9] = 4096 - ((4096 - var4[var9]) * (4096 - var5[var9]) >> 12);
                }
            } else if (var6 == 6) {
                for (int var10 = 0; var10 < class215.field3787; var10++) {
                    int var11 = var5[var10];
                    var3[var10] = var11 < 2048 ? var4[var10] * var11 >> 11 : 4096 - ((4096 - var4[var10]) * (4096 - var11) >> 11);
                }
            } else if (var6 == 7) {
                for (int var12 = 0; var12 < class215.field3787; var12++) {
                    int var13 = var4[var12];
                    var3[var12] = var13 == 4096 ? 4096 : (var5[var12] << 12) / (4096 - var13);
                }
            } else if (var6 == 8) {
                for (int var26 = 0; var26 < class215.field3787; var26++) {
                    int var27 = var4[var26];
                    var3[var26] = var27 == 0 ? 0 : 4096 - ((4096 - var5[var26] << 12) / var27);
                }
            } else if (var6 == 9) {
                for (int var14 = 0; var14 < class215.field3787; var14++) {
                    int var15 = var5[var14];
                    int var16 = var4[var14];
                    var3[var14] = var15 > var16 ? var16 : var15;
                }
            } else if (var6 == 10) {
                for (int var23 = 0; var23 < class215.field3787; var23++) {
                    int var24 = var5[var23];
                    int var25 = var4[var23];
                    var3[var23] = var24 >= var25 ? var24 : var25;
                }
            } else if (var6 == 11) {
                for (int var20 = 0; var20 < class215.field3787; var20++) {
                    int var21 = var5[var20];
                    int var22 = var4[var20];
                    var3[var20] = var22 <= var21 ? var21 - var22 : var22 - var21;
                }
            } else if (var6 == 12) {
                for (int var17 = 0; var17 < class215.field3787; var17++) {
                    int var18 = var4[var17];
                    int var19 = var5[var17];
                    var3[var17] = var18 + var19 - (var18 * var19 >> 11);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "(I)V", line = 292)
    public static final void method1652(int arg0) {
        field3988++;
        class166.field3005.method1334((byte) -25);
        if (arg0 != 415459756) {
            method1653((byte) 83);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(II)[[I", line = 304)
    public final int[][] method86(int arg0, int arg1) {
        field3992++;
        int[][] var3 = this.field1400.method1746((byte) 24, arg0);
        if (this.field1400.field4363) {
            int[][] var4 = this.method619(0, 2, arg0);
            int[][] var5 = this.method619(1, 2, arg0);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[1];
            int[] var10 = var4[0];
            int[] var11 = var5[0];
            int[] var12 = var5[1];
            int[] var13 = var4[2];
            int[] var14 = var5[2];
            int var15 = this.field3989;
            if (var15 == 1) {
                for (int var16 = 0; var16 < class215.field3787; var16++) {
                    var6[var16] = var10[var16] + var11[var16];
                    var7[var16] = var9[var16] + var12[var16];
                    var8[var16] = var13[var16] + var14[var16];
                }
            } else if (var15 == 2) {
                for (int var17 = 0; var17 < class215.field3787; var17++) {
                    var6[var17] = var10[var17] - var11[var17];
                    var7[var17] = var9[var17] - var12[var17];
                    var8[var17] = var13[var17] - var14[var17];
                }
            } else if (var15 == 3) {
                for (int var63 = 0; var63 < class215.field3787; var63++) {
                    var6[var63] = var10[var63] * var11[var63] >> 12;
                    var7[var63] = var9[var63] * var12[var63] >> 12;
                    var8[var63] = var13[var63] * var14[var63] >> 12;
                }
            } else if (var15 == 4) {
                for (int var59 = 0; var59 < class215.field3787; var59++) {
                    int var60 = var11[var59];
                    int var61 = var12[var59];
                    int var62 = var14[var59];
                    var6[var59] = var60 == 0 ? 4096 : (var10[var59] << 12) / var60;
                    var7[var59] = var61 == 0 ? 4096 : (var9[var59] << 12) / var61;
                    var8[var59] = var62 == 0 ? 4096 : (var13[var59] << 12) / var62;
                }
            } else if (var15 == 5) {
                for (int var18 = 0; var18 < class215.field3787; var18++) {
                    var6[var18] = 4096 - ((4096 - var11[var18]) * (4096 - var10[var18]) >> 12);
                    var7[var18] = 4096 - ((4096 - var9[var18]) * (4096 - var12[var18]) >> 12);
                    var8[var18] = 4096 - ((4096 - var13[var18]) * (4096 - var14[var18]) >> 12);
                }
            } else if (var15 == 6) {
                for (int var19 = 0; var19 < class215.field3787; var19++) {
                    int var20 = var11[var19];
                    int var21 = var14[var19];
                    int var22 = var12[var19];
                    var6[var19] = var20 < 2048 ? var10[var19] * var20 >> 11 : 4096 - ((4096 - var10[var19]) * (4096 - var20) >> 11);
                    var7[var19] = var22 < 2048 ? var9[var19] * var22 >> 11 : 4096 - ((4096 - var9[var19]) * (4096 - var22) >> 11);
                    var8[var19] = var21 >= 2048 ? 4096 - ((4096 - var13[var19]) * (4096 - var21) >> 11) : var13[var19] * var21 >> 11;
                }
            } else if (var15 == 7) {
                for (int var55 = 0; var55 < class215.field3787; var55++) {
                    int var56 = var10[var55];
                    int var57 = var13[var55];
                    int var58 = var9[var55];
                    var6[var55] = var56 == 4096 ? 4096 : (var11[var55] << 12) / (4096 - var56);
                    var7[var55] = var58 == 4096 ? 4096 : (var12[var55] << 12) / (4096 - var58);
                    var8[var55] = var57 == 4096 ? 4096 : (var14[var55] << 12) / (4096 - var57);
                }
            } else if (var15 == 8) {
                for (int var23 = 0; var23 < class215.field3787; var23++) {
                    int var24 = var10[var23];
                    int var25 = var13[var23];
                    int var26 = var9[var23];
                    var6[var23] = var24 == 0 ? 0 : 4096 - ((4096 - var11[var23] << 12) / var24);
                    var7[var23] = var26 == 0 ? 0 : 4096 - ((4096 - var12[var23] << 12) / var26);
                    var8[var23] = var25 == 0 ? 0 : 4096 - ((4096 - var14[var23] << 12) / var25);
                }
            } else if (var15 == 9) {
                for (int var27 = 0; var27 < class215.field3787; var27++) {
                    int var28 = var11[var27];
                    int var29 = var13[var27];
                    int var30 = var14[var27];
                    int var31 = var12[var27];
                    int var32 = var9[var27];
                    int var33 = var10[var27];
                    var6[var27] = var28 <= var33 ? var28 : var33;
                    var7[var27] = var32 >= var31 ? var31 : var32;
                    var8[var27] = var29 >= var30 ? var30 : var29;
                }
            } else if (var15 == 10) {
                for (int var34 = 0; var34 < class215.field3787; var34++) {
                    int var35 = var13[var34];
                    int var36 = var12[var34];
                    int var37 = var14[var34];
                    int var38 = var10[var34];
                    int var39 = var11[var34];
                    int var40 = var9[var34];
                    var6[var34] = var39 < var38 ? var38 : var39;
                    var7[var34] = var36 < var40 ? var40 : var36;
                    var8[var34] = var35 <= var37 ? var37 : var35;
                }
            } else if (var15 == 11) {
                for (int var48 = 0; var48 < class215.field3787; var48++) {
                    int var49 = var12[var48];
                    int var50 = var14[var48];
                    int var51 = var13[var48];
                    int var52 = var9[var48];
                    int var53 = var10[var48];
                    int var54 = var11[var48];
                    var6[var48] = var54 < var53 ? var53 - var54 : -var53 + var54;
                    var7[var48] = var49 >= var52 ? var49 - var52 : -var49 + var52;
                    var8[var48] = var50 < var51 ? var51 - var50 : -var51 + var50;
                }
            } else if (var15 == 12) {
                for (int var41 = 0; var41 < class215.field3787; var41++) {
                    int var42 = var12[var41];
                    int var43 = var10[var41];
                    int var44 = var9[var41];
                    int var45 = var13[var41];
                    int var46 = var11[var41];
                    int var47 = var14[var41];
                    var6[var41] = var43 + var46 - (var43 * var46 >> 11);
                    var7[var41] = var42 + var44 - (var42 * var44 >> 11);
                    var8[var41] = var45 + var47 - (var45 * var47 >> 11);
                }
            }
        }
        int var64 = -69 % ((arg1 + 70) / 54);
        return var3;
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "()V", line = 620)
    public class229() {
        super(2, false);
    }

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "(B)V", line = 631)
    public static void method1653(byte arg0) {
        field3982 = null;
        field3984 = (int[][]) null;
        if (arg0 < 45) {
            field3982 = (Image) null;
        }
        field3986 = null;
        field3983 = null;
        field3991 = null;
        field3987 = null;
    }
}
