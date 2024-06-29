import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class94 extends class21 {

    @OriginalMember(owner = "client!o", name = "X", descriptor = "I")
    private int field1694 = 6;

    @OriginalMember(owner = "client!o", name = "V", descriptor = "I")
    public static int field1692 = 0;

    @OriginalMember(owner = "client!o", name = "W", descriptor = "Ljava/lang/String;")
    public static String field1693 = "Use";

    @OriginalMember(owner = "client!o", name = "T", descriptor = "B")
    public static byte field1690;

    @OriginalMember(owner = "client!o", name = "N", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!o", name = "O", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!o", name = "R", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!o", name = "S", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!o", name = "U", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!o", name = "Y", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!o", name = "Q", descriptor = "Lbm;")
    public static class307 field1687;

    @OriginalMember(owner = "client!o", name = "P", descriptor = "[I")
    public static int[] field1686;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lbm;Lbm;III)Lfb;", line = 5)
    public static final class237 method629(class307 arg0, class307 arg1, int arg2, int arg3, int arg4) {
        field1695++;
        if (arg3 > -113) {
            field1693 = (String) null;
        }
        return class135.method885(arg4, arg0, -10948, arg2) ? class226.method1505(arg1.method2036(arg4, arg2, (byte) 120), 107) : null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIIIIB)V", line = 24)
    public static final void method630(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field1691++;
        int var8 = arg5 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = (class189.field3073 - class138.field2306) * var8 / 100 + class138.field2306;
        int var10 = arg2 * var9 >> 8;
        int var11 = 2048 - arg1 & 0x7FF;
        int var12 = 2048 - arg4 & 0x7FF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            int var16 = class284.field4398[var11];
            int var17 = class284.field4395[var11];
            var14 = -var10 * var17 >> 16;
            var15 = var10 * var16 >> 16;
        }
        if (arg7 > -10) {
            field1686 = (int[]) null;
        }
        if (var12 != 0) {
            int var18 = class284.field4398[var12];
            int var19 = class284.field4395[var12];
            var13 = var15 * var19 >> 16;
            var15 = var15 * var18 >> 16;
        }
        class132.field2232 = arg0 - var14;
        class283.field4381 = arg6 - var15;
        class43.field820 = arg1;
        class131.field2213 = arg4;
        class38.field742 = arg3 - var13;
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V", line = 80)
    public class94() {
        super(2, false);
    }

    @OriginalMember(owner = "client!o", name = "d", descriptor = "(I)V", line = 85)
    public static void method631(int arg0) {
        field1687 = null;
        field1693 = null;
        field1686 = null;
        if (arg0 != 6) {
            method629((class307) null, (class307) null, 86, -75, 127);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)[I", line = 100)
    public final int[] method177(int arg0, int arg1) {
        field1684++;
        int var3 = 95 / ((arg0 - 33) / 36);
        int[] var4 = this.field443.method1040(arg1, false);
        if (this.field443.field2637) {
            int[] var5 = this.method171(0, 94, arg1);
            int[] var6 = this.method171(1, -61, arg1);
            int var7 = this.field1694;
            if (var7 == 1) {
                for (int var8 = 0; var8 < class294.field4489; var8++) {
                    var4[var8] = var5[var8] + var6[var8];
                }
            } else if (var7 == 2) {
                for (int var31 = 0; var31 < class294.field4489; var31++) {
                    var4[var31] = var5[var31] - var6[var31];
                }
            } else if (var7 == 3) {
                for (int var30 = 0; var30 < class294.field4489; var30++) {
                    var4[var30] = var5[var30] * var6[var30] >> 12;
                }
            } else if (var7 == 4) {
                for (int var28 = 0; var28 < class294.field4489; var28++) {
                    int var29 = var6[var28];
                    var4[var28] = var29 == 0 ? 4096 : (var5[var28] << 12) / var29;
                }
            } else if (var7 == 5) {
                for (int var27 = 0; var27 < class294.field4489; var27++) {
                    var4[var27] = 4096 - ((4096 - var5[var27]) * (4096 - var6[var27]) >> 12);
                }
            } else if (var7 == 6) {
                for (int var9 = 0; var9 < class294.field4489; var9++) {
                    int var10 = var6[var9];
                    var4[var9] = var10 < 2048 ? var5[var9] * var10 >> 11 : 4096 - ((4096 - var5[var9]) * (4096 - var10) >> 11);
                }
            } else if (var7 == 7) {
                for (int var25 = 0; var25 < class294.field4489; var25++) {
                    int var26 = var5[var25];
                    var4[var25] = var26 == 4096 ? 4096 : (var6[var25] << 12) / (4096 - var26);
                }
            } else if (var7 == 8) {
                for (int var11 = 0; var11 < class294.field4489; var11++) {
                    int var12 = var5[var11];
                    var4[var11] = var12 == 0 ? 0 : 4096 - ((4096 - var6[var11] << 12) / var12);
                }
            } else if (var7 == 9) {
                for (int var13 = 0; var13 < class294.field4489; var13++) {
                    int var14 = var5[var13];
                    int var15 = var6[var13];
                    var4[var13] = var15 <= var14 ? var15 : var14;
                }
            } else if (var7 == 10) {
                for (int var22 = 0; var22 < class294.field4489; var22++) {
                    int var23 = var5[var22];
                    int var24 = var6[var22];
                    var4[var22] = var23 > var24 ? var23 : var24;
                }
            } else if (var7 == 11) {
                for (int var16 = 0; var16 < class294.field4489; var16++) {
                    int var17 = var5[var16];
                    int var18 = var6[var16];
                    var4[var16] = var18 >= var17 ? var18 - var17 : var17 - var18;
                }
            } else if (var7 == 12) {
                for (int var19 = 0; var19 < class294.field4489; var19++) {
                    int var20 = var6[var19];
                    int var21 = var5[var19];
                    var4[var19] = var21 + var20 - (var20 * var21 >> 11);
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(IB)[[I", line = 348)
    public final int[][] method175(int arg0, byte arg1) {
        field1688++;
        int[][] var3 = this.field441.method220(arg0, 17433);
        if (arg1 <= 16) {
            this.method178(77, -41, (class202) null);
        }
        if (this.field441.field532) {
            int[][] var4 = this.method173(0, arg0, (byte) 102);
            int[][] var5 = this.method173(1, arg0, (byte) 92);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[2];
            int[] var11 = var4[1];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field1694;
            if (var15 == 1) {
                for (int var16 = 0; var16 < class294.field4489; var16++) {
                    var6[var16] = var9[var16] + var12[var16];
                    var7[var16] = var11[var16] + var13[var16];
                    var8[var16] = var10[var16] + var14[var16];
                }
            } else if (var15 == 2) {
                for (int var17 = 0; var17 < class294.field4489; var17++) {
                    var6[var17] = var9[var17] - var12[var17];
                    var7[var17] = var11[var17] - var13[var17];
                    var8[var17] = var10[var17] - var14[var17];
                }
            } else if (var15 == 3) {
                for (int var63 = 0; var63 < class294.field4489; var63++) {
                    var6[var63] = var9[var63] * var12[var63] >> 12;
                    var7[var63] = var11[var63] * var13[var63] >> 12;
                    var8[var63] = var10[var63] * var14[var63] >> 12;
                }
            } else if (var15 == 4) {
                for (int var18 = 0; var18 < class294.field4489; var18++) {
                    int var19 = var13[var18];
                    int var20 = var12[var18];
                    int var21 = var14[var18];
                    var6[var18] = var20 == 0 ? 4096 : (var9[var18] << 12) / var20;
                    var7[var18] = var19 == 0 ? 4096 : (var11[var18] << 12) / var19;
                    var8[var18] = var21 == 0 ? 4096 : (var10[var18] << 12) / var21;
                }
            } else if (var15 == 5) {
                for (int var62 = 0; var62 < class294.field4489; var62++) {
                    var6[var62] = 4096 - ((4096 - var12[var62]) * (4096 - var9[var62]) >> 12);
                    var7[var62] = 4096 - ((4096 - var13[var62]) * (4096 - var11[var62]) >> 12);
                    var8[var62] = 4096 - ((4096 - var14[var62]) * (4096 - var10[var62]) >> 12);
                }
            } else if (var15 == 6) {
                for (int var58 = 0; var58 < class294.field4489; var58++) {
                    int var59 = var14[var58];
                    int var60 = var12[var58];
                    int var61 = var13[var58];
                    var6[var58] = var60 >= 2048 ? 4096 - ((4096 - var9[var58]) * (4096 - var60) >> 11) : var9[var58] * var60 >> 11;
                    var7[var58] = var61 >= 2048 ? 4096 - ((4096 - var11[var58]) * (4096 - var61) >> 11) : var11[var58] * var61 >> 11;
                    var8[var58] = var59 >= 2048 ? 4096 - ((4096 - var59) * (4096 - var10[var58]) >> 11) : var10[var58] * var59 >> 11;
                }
            } else if (var15 == 7) {
                for (int var22 = 0; var22 < class294.field4489; var22++) {
                    int var23 = var10[var22];
                    int var24 = var11[var22];
                    int var25 = var9[var22];
                    var6[var22] = var25 == 4096 ? 4096 : (var12[var22] << 12) / (4096 - var25);
                    var7[var22] = var24 == 4096 ? 4096 : (var13[var22] << 12) / (4096 - var24);
                    var8[var22] = var23 == 4096 ? 4096 : (var14[var22] << 12) / (4096 - var23);
                }
            } else if (var15 == 8) {
                for (int var26 = 0; var26 < class294.field4489; var26++) {
                    int var27 = var10[var26];
                    int var28 = var11[var26];
                    int var29 = var9[var26];
                    var6[var26] = var29 == 0 ? 0 : 4096 - (4096 - var12[var26] << 12) / var29;
                    var7[var26] = var28 == 0 ? 0 : 4096 - ((4096 - var13[var26] << 12) / var28);
                    var8[var26] = var27 == 0 ? 0 : 4096 - ((4096 - var14[var26] << 12) / var27);
                }
            } else if (var15 == 9) {
                for (int var30 = 0; var30 < class294.field4489; var30++) {
                    int var31 = var12[var30];
                    int var32 = var14[var30];
                    int var33 = var11[var30];
                    int var34 = var9[var30];
                    int var35 = var10[var30];
                    int var36 = var13[var30];
                    var6[var30] = var34 < var31 ? var34 : var31;
                    var7[var30] = var36 <= var33 ? var36 : var33;
                    var8[var30] = var32 <= var35 ? var32 : var35;
                }
            } else if (var15 == 10) {
                for (int var51 = 0; var51 < class294.field4489; var51++) {
                    int var52 = var12[var51];
                    int var53 = var9[var51];
                    int var54 = var14[var51];
                    int var55 = var13[var51];
                    int var56 = var10[var51];
                    int var57 = var11[var51];
                    var6[var51] = var52 >= var53 ? var52 : var53;
                    var7[var51] = var55 < var57 ? var57 : var55;
                    var8[var51] = var56 <= var54 ? var54 : var56;
                }
            } else if (var15 == 11) {
                for (int var44 = 0; var44 < class294.field4489; var44++) {
                    int var45 = var9[var44];
                    int var46 = var12[var44];
                    int var47 = var13[var44];
                    int var48 = var11[var44];
                    int var49 = var10[var44];
                    int var50 = var14[var44];
                    var6[var44] = var46 >= var45 ? var46 - var45 : var45 - var46;
                    var7[var44] = var47 >= var48 ? var47 - var48 : var48 - var47;
                    var8[var44] = var50 < var49 ? var49 - var50 : var50 - var49;
                }
            } else if (var15 == 12) {
                for (int var37 = 0; var37 < class294.field4489; var37++) {
                    int var38 = var12[var37];
                    int var39 = var11[var37];
                    int var40 = var10[var37];
                    int var41 = var9[var37];
                    int var42 = var14[var37];
                    int var43 = var13[var37];
                    var6[var37] = var41 + var38 - (var38 * var41 >> 11);
                    var7[var37] = var39 + var43 - (var39 * var43 >> 11);
                    var8[var37] = var40 - ((var40 * var42 >> 11) - var42);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IILag;)V", line = 663)
    public final void method178(int arg0, int arg1, class202 arg2) {
        if (arg0 != -318) {
            method630(88, -82, -28, -84, 57, 79, 82, (byte) -77);
        }
        if (arg1 == 0) {
            this.field1694 = arg2.method1317((byte) -96);
        } else if (arg1 == 1) {
            this.field444 = arg2.method1317((byte) -128) == 1;
        }
        field1685++;
    }
}
