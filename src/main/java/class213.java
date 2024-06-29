import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class213 extends class285 {

    @OriginalMember(owner = "client!qj", name = "O", descriptor = "I")
    private int field3475 = 6;

    @OriginalMember(owner = "client!qj", name = "P", descriptor = "Ljava/lang/String;")
    public static String field3476 = "flash1:";

    @OriginalMember(owner = "client!qj", name = "R", descriptor = "S")
    public static short field3478 = 205;

    @OriginalMember(owner = "client!qj", name = "T", descriptor = "[I")
    public static int[] field3480 = new int[128];

    @OriginalMember(owner = "client!qj", name = "U", descriptor = "[I")
    public static int[] field3481 = new int[100];

    @OriginalMember(owner = "client!qj", name = "W", descriptor = "I")
    public static int field3483 = 10;

    @OriginalMember(owner = "client!qj", name = "Q", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!qj", name = "S", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!qj", name = "V", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!qj", name = "X", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!qj", name = "Y", descriptor = "[[Z")
    public static boolean[][] field3485;

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "()V", line = 679)
    public class213() {
        super(2, false);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(BI)[[I", line = 19)
    public final int[][] method62(byte arg0, int arg1) {
        if (arg0 < 121) {
            method1534((byte) -121, 34);
        }
        field3484++;
        int[][] var3 = this.field4564.method1552(arg1, (byte) -69);
        if (this.field4564.field3529) {
            int[][] var4 = this.method2053((byte) -99, 0, arg1);
            int[][] var5 = this.method2053((byte) -119, 1, arg1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[2];
            int[] var11 = var4[1];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field3475;
            if (var15 == 1) {
                for (int var63 = 0; var63 < class287.field4599; var63++) {
                    var6[var63] = var9[var63] + var12[var63];
                    var7[var63] = var11[var63] + var13[var63];
                    var8[var63] = var10[var63] + var14[var63];
                }
            } else if (var15 == 2) {
                for (int var62 = 0; var62 < class287.field4599; var62++) {
                    var6[var62] = var9[var62] - var12[var62];
                    var7[var62] = var11[var62] - var13[var62];
                    var8[var62] = var10[var62] - var14[var62];
                }
            } else if (var15 == 3) {
                for (int var61 = 0; var61 < class287.field4599; var61++) {
                    var6[var61] = var9[var61] * var12[var61] >> 12;
                    var7[var61] = var11[var61] * var13[var61] >> 12;
                    var8[var61] = var10[var61] * var14[var61] >> 12;
                }
            } else if (var15 == 4) {
                for (int var16 = 0; var16 < class287.field4599; var16++) {
                    int var17 = var14[var16];
                    int var18 = var12[var16];
                    int var19 = var13[var16];
                    var6[var16] = var18 == 0 ? 4096 : (var9[var16] << 12) / var18;
                    var7[var16] = var19 == 0 ? 4096 : (var11[var16] << 12) / var19;
                    var8[var16] = var17 == 0 ? 4096 : (var10[var16] << 12) / var17;
                }
            } else if (var15 == 5) {
                for (int var60 = 0; var60 < class287.field4599; var60++) {
                    var6[var60] = 4096 - ((4096 - var9[var60]) * (4096 - var12[var60]) >> 12);
                    var7[var60] = 4096 - ((4096 - var13[var60]) * (4096 - var11[var60]) >> 12);
                    var8[var60] = 4096 - ((4096 - var10[var60]) * (4096 - var14[var60]) >> 12);
                }
            } else if (var15 == 6) {
                for (int var56 = 0; var56 < class287.field4599; var56++) {
                    int var57 = var13[var56];
                    int var58 = var12[var56];
                    int var59 = var14[var56];
                    var6[var56] = var58 >= 2048 ? 4096 - ((4096 - var9[var56]) * (4096 - var58) >> 11) : var9[var56] * var58 >> 11;
                    var7[var56] = var57 >= 2048 ? 4096 - ((4096 - var11[var56]) * (4096 - var57) >> 11) : var11[var56] * var57 >> 11;
                    var8[var56] = var59 < 2048 ? var10[var56] * var59 >> 11 : 4096 - ((4096 - var10[var56]) * (4096 - var59) >> 11);
                }
            } else if (var15 == 7) {
                for (int var52 = 0; var52 < class287.field4599; var52++) {
                    int var53 = var10[var52];
                    int var54 = var9[var52];
                    int var55 = var11[var52];
                    var6[var52] = var54 == 4096 ? 4096 : (var12[var52] << 12) / (4096 - var54);
                    var7[var52] = var55 == 4096 ? 4096 : (var13[var52] << 12) / (4096 - var55);
                    var8[var52] = var53 == 4096 ? 4096 : (var14[var52] << 12) / (4096 - var53);
                }
            } else if (var15 == 8) {
                for (int var48 = 0; var48 < class287.field4599; var48++) {
                    int var49 = var9[var48];
                    int var50 = var11[var48];
                    int var51 = var10[var48];
                    var6[var48] = var49 == 0 ? 0 : 4096 - (4096 - var12[var48] << 12) / var49;
                    var7[var48] = var50 == 0 ? 0 : 4096 - ((4096 - var13[var48] << 12) / var50);
                    var8[var48] = var51 == 0 ? 0 : 4096 - ((4096 - var14[var48] << 12) / var51);
                }
            } else if (var15 == 9) {
                for (int var20 = 0; var20 < class287.field4599; var20++) {
                    int var21 = var9[var20];
                    int var22 = var11[var20];
                    int var23 = var10[var20];
                    int var24 = var14[var20];
                    int var25 = var12[var20];
                    int var26 = var13[var20];
                    var6[var20] = var21 >= var25 ? var25 : var21;
                    var7[var20] = var26 > var22 ? var22 : var26;
                    var8[var20] = var23 >= var24 ? var24 : var23;
                }
            } else if (var15 == 10) {
                for (int var27 = 0; var27 < class287.field4599; var27++) {
                    int var28 = var14[var27];
                    int var29 = var13[var27];
                    int var30 = var11[var27];
                    int var31 = var10[var27];
                    int var32 = var9[var27];
                    int var33 = var12[var27];
                    var6[var27] = var33 >= var32 ? var33 : var32;
                    var7[var27] = var29 < var30 ? var30 : var29;
                    var8[var27] = var31 <= var28 ? var28 : var31;
                }
            } else if (var15 == 11) {
                for (int var41 = 0; var41 < class287.field4599; var41++) {
                    int var42 = var9[var41];
                    int var43 = var14[var41];
                    int var44 = var13[var41];
                    int var45 = var12[var41];
                    int var46 = var11[var41];
                    int var47 = var10[var41];
                    var6[var41] = var42 <= var45 ? var45 - var42 : -var45 + var42;
                    var7[var41] = var46 <= var44 ? var44 - var46 : -var44 + var46;
                    var8[var41] = var47 <= var43 ? var43 - var47 : -var43 + var47;
                }
            } else if (var15 == 12) {
                for (int var34 = 0; var34 < class287.field4599; var34++) {
                    int var35 = var14[var34];
                    int var36 = var10[var34];
                    int var37 = var9[var34];
                    int var38 = var12[var34];
                    int var39 = var13[var34];
                    int var40 = var11[var34];
                    var6[var34] = var37 + var38 - (var37 * var38 >> 11);
                    var7[var34] = var39 + var40 - (var39 * var40 >> 11);
                    var8[var34] = var36 + var35 - (var35 * var36 >> 11);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(BI)C", line = 337)
    public static final char method1534(byte arg0, int arg1) {
        if (arg1 >= -54) {
            field3485 = (boolean[][]) ((boolean[][]) null);
        }
        int var2 = arg0 & 0xFF;
        field3479++;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class7.field102[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        return (char) var2;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(ZLjj;I)V", line = 369)
    public final void method63(boolean arg0, class44 arg1, int arg2) {
        if (!arg0) {
            method1534((byte) 20, 98);
        }
        if (arg2 == 0) {
            this.field3475 = arg1.method286((byte) -110);
        } else if (arg2 == 1) {
            this.field4572 = arg1.method286((byte) -105) == 1;
        }
        field3482++;
    }

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "(I)V", line = 407)
    public static void method1535(int arg0) {
        field3481 = null;
        field3485 = (boolean[][]) null;
        field3476 = null;
        field3480 = null;
        if (arg0 != 1) {
            method1535(-23);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(ZI)[I", line = 429)
    public final int[] method60(boolean arg0, int arg1) {
        int[] var3 = this.field4573.method1116(101, arg1);
        if (!arg0) {
            return (int[]) null;
        }
        field3477++;
        if (this.field4573.field2420) {
            int[] var4 = this.method2048(0, (byte) 125, arg1);
            int[] var5 = this.method2048(1, (byte) 127, arg1);
            int var6 = this.field3475;
            if (var6 == 1) {
                for (int var7 = 0; var7 < class287.field4599; var7++) {
                    var3[var7] = var4[var7] + var5[var7];
                }
            } else if (var6 == 2) {
                for (int var8 = 0; var8 < class287.field4599; var8++) {
                    var3[var8] = var4[var8] - var5[var8];
                }
            } else if (var6 == 3) {
                for (int var9 = 0; var9 < class287.field4599; var9++) {
                    var3[var9] = var4[var9] * var5[var9] >> 12;
                }
            } else if (var6 == 4) {
                for (int var29 = 0; var29 < class287.field4599; var29++) {
                    int var30 = var5[var29];
                    var3[var29] = var30 == 0 ? 4096 : (var4[var29] << 12) / var30;
                }
            } else if (var6 == 5) {
                for (int var10 = 0; var10 < class287.field4599; var10++) {
                    var3[var10] = 4096 - ((4096 - var5[var10]) * (4096 - var4[var10]) >> 12);
                }
            } else if (var6 == 6) {
                for (int var11 = 0; var11 < class287.field4599; var11++) {
                    int var12 = var5[var11];
                    var3[var11] = var12 >= 2048 ? 4096 - ((4096 - var4[var11]) * (4096 - var12) >> 11) : var4[var11] * var12 >> 11;
                }
            } else if (var6 == 7) {
                for (int var13 = 0; var13 < class287.field4599; var13++) {
                    int var14 = var4[var13];
                    var3[var13] = var14 == 4096 ? 4096 : (var5[var13] << 12) / (4096 - var14);
                }
            } else if (var6 == 8) {
                for (int var27 = 0; var27 < class287.field4599; var27++) {
                    int var28 = var4[var27];
                    var3[var27] = var28 == 0 ? 0 : 4096 - ((4096 - var5[var27] << 12) / var28);
                }
            } else if (var6 == 9) {
                for (int var15 = 0; var15 < class287.field4599; var15++) {
                    int var16 = var5[var15];
                    int var17 = var4[var15];
                    var3[var15] = var16 <= var17 ? var16 : var17;
                }
            } else if (var6 == 10) {
                for (int var24 = 0; var24 < class287.field4599; var24++) {
                    int var25 = var5[var24];
                    int var26 = var4[var24];
                    var3[var24] = var25 >= var26 ? var25 : var26;
                }
            } else if (var6 == 11) {
                for (int var18 = 0; var18 < class287.field4599; var18++) {
                    int var19 = var5[var18];
                    int var20 = var4[var18];
                    var3[var18] = var19 >= var20 ? var19 - var20 : -var19 + var20;
                }
            } else if (var6 == 12) {
                for (int var21 = 0; var21 < class287.field4599; var21++) {
                    int var22 = var5[var21];
                    int var23 = var4[var21];
                    var3[var21] = var23 + var22 - (var22 * var23 >> 11);
                }
            }
        }
        return var3;
    }
}
