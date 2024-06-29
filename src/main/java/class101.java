import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class101 extends class112 {

    @OriginalMember(owner = "client!pe", name = "T", descriptor = "I")
    private int field1474 = 6;

    @OriginalMember(owner = "client!pe", name = "K", descriptor = "I")
    public static int field1465 = 0;

    @OriginalMember(owner = "client!pe", name = "P", descriptor = "[I")
    public static int[] field1470 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

    @OriginalMember(owner = "client!pe", name = "L", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!pe", name = "M", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!pe", name = "N", descriptor = "I")
    public static int field1468;

    @OriginalMember(owner = "client!pe", name = "Q", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!pe", name = "R", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!pe", name = "S", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!pe", name = "O", descriptor = "[I")
    public static int[] field1469;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZBIIJ)Lwm;", line = 8)
    public static final class152 method676(boolean arg0, byte arg1, int arg2, int arg3, long arg4) {
        field1471++;
        class152 var6 = class97.method652(0, (byte) -35);
        if (arg4 < 0L) {
            var6.method1008(arg1 ^ 0x78, class197.field3151);
            arg4 = -arg4;
        }
        class152 var7 = class40.field647;
        class152 var8 = class251.field4316;
        if (arg1 != -113) {
            field1469 = (int[]) null;
        }
        if (arg3 == 1) {
            var8 = class40.field647;
            var7 = class251.field4316;
        }
        if (arg3 == 2) {
            var7 = class164.field2598;
            var8 = class40.field647;
        }
        if (arg3 == 3) {
            var7 = class251.field4316;
            var8 = class40.field647;
        }
        class152 var9 = class97.method652(0, (byte) -39);
        for (int var10 = 0; var10 < arg2; var10++) {
            var9.method1008(-9, class38.method280(76, (int) (arg4 % 10L)));
            arg4 /= 10L;
        }
        int var11 = 0;
        class152 var13;
        if (arg4 == 0L) {
            var13 = class64.field973;
        } else {
            class152 var12 = class97.method652(0, (byte) -110);
            var13 = var12;
            while (arg4 > 0L) {
                if (arg0 && var11 != 0 && var11 % 3 == 0) {
                    var12.method1008(arg1 ^ 0x78, var7);
                }
                var12.method1008(-9, class38.method280(arg1 + 217, (int) (arg4 % 10L)));
                var11++;
                arg4 /= 10L;
            }
        }
        if (var9.method1000(0) > 0) {
            var9.method1008(-9, var8);
        }
        return class195.method1307(new class152[] { var6, var13.method982((byte) 17), var9.method982((byte) 17) }, (byte) 29);
    }

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "(I)V", line = 92)
    public static void method677(int arg0) {
        field1470 = null;
        if (arg0 != -2049) {
            method676(false, (byte) 96, 59, 36, -70L);
        }
        field1469 = null;
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "()V", line = 102)
    public class101() {
        super(2, false);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IZ)[[I", line = 110)
    public final int[][] method55(int arg0, boolean arg1) {
        if (arg1) {
            this.method53((byte) 29, 10);
        }
        int[][] var3 = this.field1594.method656((byte) -74, arg0);
        field1473++;
        if (this.field1594.field1402) {
            int[][] var4 = this.method750(0, (byte) -17, arg0);
            int[][] var5 = this.method750(1, (byte) -17, arg0);
            int[] var6 = var3[0];
            int[] var7 = var3[2];
            int[] var8 = var3[1];
            int[] var9 = var4[1];
            int[] var10 = var4[0];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[2];
            int[] var14 = var5[1];
            int var15 = this.field1474;
            if (var15 == 1) {
                for (int var63 = 0; var63 < class58.field889; var63++) {
                    var6[var63] = var10[var63] + var12[var63];
                    var8[var63] = var9[var63] + var14[var63];
                    var7[var63] = var11[var63] + var13[var63];
                }
            } else if (var15 == 2) {
                for (int var16 = 0; var16 < class58.field889; var16++) {
                    var6[var16] = var10[var16] - var12[var16];
                    var8[var16] = var9[var16] - var14[var16];
                    var7[var16] = var11[var16] - var13[var16];
                }
            } else if (var15 == 3) {
                for (int var62 = 0; var62 < class58.field889; var62++) {
                    var6[var62] = var10[var62] * var12[var62] >> 12;
                    var8[var62] = var9[var62] * var14[var62] >> 12;
                    var7[var62] = var11[var62] * var13[var62] >> 12;
                }
            } else if (var15 == 4) {
                for (int var17 = 0; var17 < class58.field889; var17++) {
                    int var18 = var14[var17];
                    int var19 = var12[var17];
                    int var20 = var13[var17];
                    var6[var17] = var19 == 0 ? 4096 : (var10[var17] << 12) / var19;
                    var8[var17] = var18 == 0 ? 4096 : (var9[var17] << 12) / var18;
                    var7[var17] = var20 == 0 ? 4096 : (var11[var17] << 12) / var20;
                }
            } else if (var15 == 5) {
                for (int var61 = 0; var61 < class58.field889; var61++) {
                    var6[var61] = 4096 - ((4096 - var12[var61]) * (4096 - var10[var61]) >> 12);
                    var8[var61] = 4096 - ((4096 - var14[var61]) * (4096 - var9[var61]) >> 12);
                    var7[var61] = 4096 - ((4096 - var11[var61]) * (4096 - var13[var61]) >> 12);
                }
            } else if (var15 == 6) {
                for (int var21 = 0; var21 < class58.field889; var21++) {
                    int var22 = var14[var21];
                    int var23 = var12[var21];
                    int var24 = var13[var21];
                    var6[var21] = var23 < 2048 ? var10[var21] * var23 >> 11 : 4096 - ((4096 - var10[var21]) * (4096 - var23) >> 11);
                    var8[var21] = var22 >= 2048 ? 4096 - ((4096 - var9[var21]) * (4096 - var22) >> 11) : var9[var21] * var22 >> 11;
                    var7[var21] = var24 >= 2048 ? 4096 - ((4096 - var11[var21]) * (4096 - var24) >> 11) : var11[var21] * var24 >> 11;
                }
            } else if (var15 == 7) {
                for (int var57 = 0; var57 < class58.field889; var57++) {
                    int var58 = var9[var57];
                    int var59 = var11[var57];
                    int var60 = var10[var57];
                    var6[var57] = var60 == 4096 ? 4096 : (var12[var57] << 12) / (4096 - var60);
                    var8[var57] = var58 == 4096 ? 4096 : (var14[var57] << 12) / (4096 - var58);
                    var7[var57] = var59 == 4096 ? 4096 : (var13[var57] << 12) / (4096 - var59);
                }
            } else if (var15 == 8) {
                for (int var53 = 0; var53 < class58.field889; var53++) {
                    int var54 = var11[var53];
                    int var55 = var10[var53];
                    int var56 = var9[var53];
                    var6[var53] = var55 == 0 ? 0 : 4096 - ((4096 - var12[var53] << 12) / var55);
                    var8[var53] = var56 == 0 ? 0 : 4096 - ((4096 - var14[var53] << 12) / var56);
                    var7[var53] = var54 == 0 ? 0 : 4096 - (4096 - var13[var53] << 12) / var54;
                }
            } else if (var15 == 9) {
                for (int var25 = 0; var25 < class58.field889; var25++) {
                    int var26 = var11[var25];
                    int var27 = var12[var25];
                    int var28 = var9[var25];
                    int var29 = var10[var25];
                    int var30 = var14[var25];
                    int var31 = var13[var25];
                    var6[var25] = var29 >= var27 ? var27 : var29;
                    var8[var25] = var30 > var28 ? var28 : var30;
                    var7[var25] = var26 < var31 ? var26 : var31;
                }
            } else if (var15 == 10) {
                for (int var32 = 0; var32 < class58.field889; var32++) {
                    int var33 = var10[var32];
                    int var34 = var12[var32];
                    int var35 = var14[var32];
                    int var36 = var13[var32];
                    int var37 = var9[var32];
                    int var38 = var11[var32];
                    var6[var32] = var34 >= var33 ? var34 : var33;
                    var8[var32] = var37 > var35 ? var37 : var35;
                    var7[var32] = var36 < var38 ? var38 : var36;
                }
            } else if (var15 == 11) {
                for (int var39 = 0; var39 < class58.field889; var39++) {
                    int var40 = var10[var39];
                    int var41 = var11[var39];
                    int var42 = var13[var39];
                    int var43 = var9[var39];
                    int var44 = var12[var39];
                    int var45 = var14[var39];
                    var6[var39] = var44 < var40 ? var40 - var44 : -var40 + var44;
                    var8[var39] = var45 >= var43 ? var45 - var43 : -var45 + var43;
                    var7[var39] = var41 <= var42 ? var42 - var41 : -var42 + var41;
                }
            } else if (var15 == 12) {
                for (int var46 = 0; var46 < class58.field889; var46++) {
                    int var47 = var9[var46];
                    int var48 = var11[var46];
                    int var49 = var14[var46];
                    int var50 = var12[var46];
                    int var51 = var13[var46];
                    int var52 = var10[var46];
                    var6[var46] = var50 + var52 - (var50 * var52 >> 11);
                    var8[var46] = var47 + var49 - (var47 * var49 >> 11);
                    var7[var46] = var48 + var51 - (var48 * var51 >> 11);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(BI)[I", line = 424)
    public final int[] method53(byte arg0, int arg1) {
        field1467++;
        if (arg0 != -3) {
            return (int[]) null;
        }
        int[] var3 = this.field1585.method1952(arg1, (byte) 65);
        if (this.field1585.field4935) {
            int[] var4 = this.method751(arg1, (byte) 100, 0);
            int[] var5 = this.method751(arg1, (byte) 104, 1);
            int var6 = this.field1474;
            if (var6 == 1) {
                for (int var30 = 0; var30 < class58.field889; var30++) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            } else if (var6 == 2) {
                for (int var7 = 0; var7 < class58.field889; var7++) {
                    var3[var7] = var4[var7] - var5[var7];
                }
            } else if (var6 == 3) {
                for (int var29 = 0; var29 < class58.field889; var29++) {
                    var3[var29] = var4[var29] * var5[var29] >> 12;
                }
            } else if (var6 == 4) {
                for (int var8 = 0; var8 < class58.field889; var8++) {
                    int var9 = var5[var8];
                    var3[var8] = var9 == 0 ? 4096 : (var4[var8] << 12) / var9;
                }
            } else if (var6 == 5) {
                for (int var28 = 0; var28 < class58.field889; var28++) {
                    var3[var28] = 4096 - ((4096 - var4[var28]) * (4096 - var5[var28]) >> 12);
                }
            } else if (var6 == 6) {
                for (int var10 = 0; var10 < class58.field889; var10++) {
                    int var11 = var5[var10];
                    var3[var10] = var11 >= 2048 ? 4096 - ((4096 - var11) * (4096 - var4[var10]) >> 11) : var4[var10] * var11 >> 11;
                }
            } else if (var6 == 7) {
                for (int var26 = 0; var26 < class58.field889; var26++) {
                    int var27 = var4[var26];
                    var3[var26] = var27 == 4096 ? 4096 : (var5[var26] << 12) / (4096 - var27);
                }
            } else if (var6 == 8) {
                for (int var24 = 0; var24 < class58.field889; var24++) {
                    int var25 = var4[var24];
                    var3[var24] = var25 == 0 ? 0 : 4096 - (4096 - var5[var24] << 12) / var25;
                }
            } else if (var6 == 9) {
                for (int var12 = 0; var12 < class58.field889; var12++) {
                    int var13 = var5[var12];
                    int var14 = var4[var12];
                    var3[var12] = var14 >= var13 ? var13 : var14;
                }
            } else if (var6 == 10) {
                for (int var21 = 0; var21 < class58.field889; var21++) {
                    int var22 = var5[var21];
                    int var23 = var4[var21];
                    var3[var21] = var22 >= var23 ? var22 : var23;
                }
            } else if (var6 == 11) {
                for (int var18 = 0; var18 < class58.field889; var18++) {
                    int var19 = var5[var18];
                    int var20 = var4[var18];
                    var3[var18] = var20 <= var19 ? var19 - var20 : -var19 + var20;
                }
            } else if (var6 == 12) {
                for (int var15 = 0; var15 < class58.field889; var15++) {
                    int var16 = var5[var15];
                    int var17 = var4[var15];
                    var3[var15] = var16 + var17 - (var16 * var17 >> 11);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IILhi;)V", line = 670)
    public final void method52(int arg0, int arg1, class291 arg2) {
        field1472++;
        if (arg1 == 0) {
            this.field1474 = arg2.method2011(-33);
        } else if (arg1 == 1) {
            this.field1591 = arg2.method2011(arg0 ^ 0xFFFF8659) == 1;
        }
        if (arg0 != 31164) {
            this.method53((byte) -52, -56);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 722)
    public static final void method678(String arg0, byte arg1) {
        field1466++;
        if (arg1 >= 38) {
            System.out.println("Error: " + class121.method785(arg0, "\n", -117, "%0a"));
        }
    }
}
