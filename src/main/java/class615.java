import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rda")
public class class615 extends class401 {

    @OriginalMember(owner = "client!rda", name = "w", descriptor = "Lhca;")
    private class453 field8593;

    @OriginalMember(owner = "client!rda", name = "B", descriptor = "Ltw;")
    private class186 field8598;

    @OriginalMember(owner = "client!rda", name = "F", descriptor = "Llj;")
    private class565 field8602;

    @OriginalMember(owner = "client!rda", name = "o", descriptor = "I")
    private int field8585;

    @OriginalMember(owner = "client!rda", name = "H", descriptor = "I")
    private int field8604;

    @OriginalMember(owner = "client!rda", name = "v", descriptor = "I")
    private int field8592;

    @OriginalMember(owner = "client!rda", name = "j", descriptor = "I")
    private int field8580;

    @OriginalMember(owner = "client!rda", name = "C", descriptor = "[[F")
    private float[][] field8599;

    @OriginalMember(owner = "client!rda", name = "l", descriptor = "[[F")
    private float[][] field8582;

    @OriginalMember(owner = "client!rda", name = "u", descriptor = "[[F")
    private float[][] field8591;

    @OriginalMember(owner = "client!rda", name = "y", descriptor = "I")
    private int field8595;

    @OriginalMember(owner = "client!rda", name = "A", descriptor = "Lac;")
    private class501 field8597;

    @OriginalMember(owner = "client!rda", name = "s", descriptor = "Lwu;")
    private class340 field8589;

    @OriginalMember(owner = "client!rda", name = "D", descriptor = "Lfaa;")
    private class139 field8600;

    @OriginalMember(owner = "client!rda", name = "G", descriptor = "Lii;")
    private class514 field8603;

    @OriginalMember(owner = "client!rda", name = "z", descriptor = "Leq;")
    private class194 field8596;

    @OriginalMember(owner = "client!rda", name = "x", descriptor = "Lmq;")
    private class470 field8594;

    @OriginalMember(owner = "client!rda", name = "k", descriptor = "Lmq;")
    private class470 field8581;

    @OriginalMember(owner = "client!rda", name = "m", descriptor = "I")
    public static int field8583;

    @OriginalMember(owner = "client!rda", name = "p", descriptor = "I")
    public static int field8586;

    @OriginalMember(owner = "client!rda", name = "q", descriptor = "I")
    private int field8587;

    @OriginalMember(owner = "client!rda", name = "r", descriptor = "I")
    public static int field8588;

    @OriginalMember(owner = "client!rda", name = "t", descriptor = "I")
    public static int field8590;

    @OriginalMember(owner = "client!rda", name = "E", descriptor = "I")
    public static int field8601;

    @OriginalMember(owner = "client!rda", name = "n", descriptor = "Llf;")
    public static class215 field8584;

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(SZ)V", line = 5)
    private final void method3437(short arg0, boolean arg1) {
        field8588++;
        if (arg1) {
            method3438(80, -12, (byte) 49, -10);
        }
        if (this.field8602.field7921) {
            this.field8597.method2837(arg0, -2);
        } else {
            this.field8597.method2848((byte) -121, arg0);
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(IIBI)V", line = 24)
    public static final void method3438(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = arg0 << 3;
        if (arg2 <= 33) {
            method3440((byte) -54);
        }
        int var5 = arg1 << 3;
        field8586++;
        int var6 = arg3 << 3;
        class705.field9964 = var4;
        if (class203.field2863 == 2) {
            class41.field475 = var4;
            class164.field2363 = var6;
            class685.field9771 = var5;
        }
        class228.field3168 = var5;
        class221.method1402(-4);
        class498.field6773 = true;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(IBII[[Z)V", line = 50)
    public final void method3439(int arg0, byte arg1, int arg2, int arg3, boolean[][] arg4) {
        field8583++;
        if (this.field8603 == null || this.field8585 > arg0 + arg2 || (arg0 - arg2) > this.field8604 || this.field8592 > (arg2 + arg3) || this.field8580 < arg3 - arg2) {
            return;
        }
        int var6 = this.field8592;
        if (arg1 != -14) {
            this.field8592 = 19;
        }
        while (var6 <= this.field8580) {
            for (int var7 = this.field8585; var7 <= this.field8604; var7++) {
                int var8 = var7 - arg0;
                int var9 = var6 - arg3;
                if (var8 > (-arg2) && arg2 > var8 && -arg2 < var9 && arg2 > var9 && arg4[arg2 + var8][arg2 + var9]) {
                    this.field8602.method3162(false, (int) (this.field8598.method1285(arg1 - 1106) * 255.0F) << 24);
                    this.field8602.method3208(null, (byte) -119, null, this.field8594, this.field8581);
                    this.field8602.method3235(this.field8595, 0, this.field8603, false, 4);
                    return;
                }
            }
            var6++;
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(B)V", line = 116)
    public static void method3440(byte arg0) {
        field8584 = null;
        if (arg0 != 59) {
            method3440((byte) 20);
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(IIIIIII)V", line = 130)
    private final void method3441(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field8601++;
        long var8 = -1L;
        int var10 = (arg1 << this.field8593.field447) + arg2;
        int var11 = (arg4 << this.field8593.field447) + arg6;
        int var12 = this.field8593.method331(var11, (byte) 50, var10);
        if ((arg2 & 0x7F) == 0 || (arg6 & 0x7F) == 0) {
            var8 = (long) var10 & 0xFFFFL | ((long) var11 & 0xFFFFL) << 16;
            class401 var13 = this.field8600.method970((byte) 89, var8);
            if (var13 != null) {
                this.method3437(((class1) var13).field1, false);
                return;
            }
        }
        short var14 = (short) (this.field8587++);
        if (var8 != -1L) {
            this.field8600.method968(var8, new class1(var14), -1);
        }
        float var15;
        float var16;
        float var17;
        if (arg2 == 0 && arg6 == 0) {
            var15 = this.field8582[arg5][arg0];
            var16 = this.field8591[arg5][arg0];
            var17 = this.field8599[arg5][arg0];
        } else if (this.field8593.field441 == arg2 && arg6 == 0) {
            var17 = this.field8599[arg5 + 1][arg0];
            var15 = this.field8582[arg5 + 1][arg0];
            var16 = this.field8591[arg5 + 1][arg0];
        } else if (this.field8593.field441 == arg2 && this.field8593.field441 == arg6) {
            var17 = this.field8599[arg5 + 1][arg0 + 1];
            var15 = this.field8582[arg5 + 1][arg0 + 1];
            var16 = this.field8591[arg5 + 1][arg0 + 1];
        } else if (arg2 == 0 && this.field8593.field441 == arg6) {
            var17 = this.field8599[arg5][arg0 + 1];
            var16 = this.field8591[arg5][arg0 + 1];
            var15 = this.field8582[arg5][arg0 + 1];
        } else {
            float var18 = (float) arg2 / (float) this.field8593.field441;
            float var19 = (float) arg6 / (float) this.field8593.field441;
            float var20 = this.field8599[arg5][arg0];
            float var21 = this.field8582[arg5][arg0];
            float var22 = this.field8591[arg5][arg0];
            float var23 = this.field8599[arg5 + 1][arg0];
            float var24 = this.field8582[arg5 + 1][arg0];
            float var25 = (this.field8599[arg5][arg0 + 1] - var20) * var18 + var20;
            float var26 = (this.field8582[arg5 + 1][arg0 + 1] - var24) * var18 + var24;
            float var27 = (this.field8591[arg5][arg0 + 1] - var22) * var18 + var22;
            float var28 = (this.field8582[arg5][arg0 + 1] - var21) * var18 + var21;
            float var29 = (this.field8599[arg5 + 1][arg0 + 1] - var23) * var18 + var23;
            float var30 = this.field8591[arg5 + 1][arg0];
            var17 = (var29 - var25) * var19 + var25;
            var15 = (var26 - var28) * var19 + var28;
            float var31 = (this.field8591[arg5 + 1][arg0 + 1] - var30) * var18 + var30;
            var16 = (var31 - var27) * var19 + var27;
        }
        float var32 = (float) (this.field8598.method1280(true) - var10);
        float var33 = (float) (this.field8598.method1282((byte) 102) - var12);
        float var34 = (float) (this.field8598.method1279(0) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var34 * var36;
        float var38 = var33 * var36;
        float var39 = var32 * var36;
        float var40 = var35 / (float) this.field8598.method1281(31);
        float var41 = 1.0F - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var16 * var37 + var15 * var38 + var17 * var39;
        if (var42 < (float) arg3) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field8598.method1283(0);
        int var45 = (int) ((float) ((var44 & 0xFF3C80) >> 16) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) (var44 >> 8 & 0xFF) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (this.field8602.field7921) {
            this.field8589.method1987((float) var10, arg3 ^ 0xEA039BB8);
            this.field8589.method1987((float) var12, -368862280);
            this.field8589.method1987((float) var11, -368862280);
        } else {
            this.field8589.method1992((float) var10, arg3 + 23507);
            this.field8589.method1992((float) var12, 23507);
            this.field8589.method1992((float) var11, 23507);
        }
        if (var47 > 255) {
            var47 = 255;
        }
        this.field8589.method2817(var45, true);
        this.field8589.method2817(var46, true);
        this.field8589.method2817(var47, true);
        this.field8589.method2817(255, true);
        this.method3437(var14, false);
    }

    @OriginalMember(owner = "client!rda", name = "<init>", descriptor = "(Llj;Lhca;Ltw;[I)V", line = 302)
    public class615(class565 arg0, class453 arg1, class186 arg2, int[] arg3) {
        this.field8593 = arg1;
        this.field8598 = arg2;
        this.field8602 = arg0;
        int var5 = this.field8598.method1281(86) - (arg1.field441 >> 1);
        this.field8585 = this.field8598.method1280(true) - var5 >> arg1.field447;
        this.field8604 = var5 + this.field8598.method1280(true) >> arg1.field447;
        this.field8592 = this.field8598.method1279(0) - var5 >> arg1.field447;
        this.field8580 = var5 + this.field8598.method1279(0) >> arg1.field447;
        int var6 = this.field8604 + 1 - this.field8585;
        int var7 = this.field8580 + 1 - this.field8592;
        this.field8599 = new float[var6 + 1][var7 + 1];
        this.field8582 = new float[var6 + 1][var7 + 1];
        this.field8591 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var25 = this.field8592 + var8;
            if (var25 > 0 && this.field8593.field438 - 1 > var25) {
                for (int var26 = 0; var26 <= var6; var26++) {
                    int var27 = var26 + this.field8585;
                    if (var27 > 0 && var27 < this.field8593.field446 - 1) {
                        int var28 = arg1.method332(var25, 1, var27 + 1) - arg1.method332(var25, 1, var27 - 1);
                        int var29 = arg1.method332(var25 + 1, 1, var27) - arg1.method332(var25 - 1, 1, var27);
                        float var30 = (float) (1.0D / Math.sqrt((double) (var28 * var28 - (-(var29 * var29) - 65536))));
                        this.field8599[var26][var8] = (float) var28 * var30;
                        this.field8582[var26][var8] = var30 * -256.0F;
                        this.field8591[var26][var8] = (float) var29 * var30;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field8592; var10 <= this.field8580; var10++) {
            if (var10 >= 0 && var10 < arg1.field438) {
                for (int var21 = this.field8585; var21 <= this.field8604; var21++) {
                    if (var21 >= 0 && arg1.field446 > var21) {
                        int var22 = arg3[var9];
                        int[] var23 = arg1.field6243[var21][var10];
                        if (var23 != null && var22 != 0) {
                            if (var22 == 1) {
                                int var24 = 0;
                                while (var24 < var23.length) {
                                    if (var23[var24++] != -1 && var23[var24++] != -1 && var23[var24++] != -1) {
                                        this.field8595 += 3;
                                    }
                                }
                            } else {
                                this.field8595 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field8604 - this.field8585;
            }
        }
        if (this.field8595 > 0) {
            this.field8597 = new class501(this.field8595 * 2);
            this.field8589 = new class340(this.field8595 * 16);
            this.field8600 = new class139(class206.method1334(-1, this.field8595));
            int var11 = 0;
            int var12 = 0;
            for (int var13 = this.field8592; var13 <= this.field8580; var13++) {
                if (var13 >= 0 && var13 < arg1.field438) {
                    int var14 = 0;
                    for (int var15 = this.field8585; var15 <= this.field8604; var15++) {
                        if (var15 >= 0 && arg1.field446 > var15) {
                            int var16 = arg3[var12];
                            int[] var17 = arg1.field6243[var15][var13];
                            if (var17 != null && var16 != 0) {
                                if (var16 == 1) {
                                    int[] var18 = arg1.field6255[var15][var13];
                                    int[] var19 = arg1.field6251[var15][var13];
                                    int var20 = 0;
                                    label111: while (true) {
                                        while (true) {
                                            if (var17.length <= var20) {
                                                break label111;
                                            }
                                            if (var17[var20] == -1 || var17[var20 + 1] == -1 || var17[var20 + 2] == -1) {
                                                var20 += 3;
                                            } else {
                                                this.method3441(var11, var15, var18[var20], 0, var13, var14, var19[var20]);
                                                var20++;
                                                this.method3441(var11, var15, var18[var20], 0, var13, var14, var19[var20]);
                                                var20++;
                                                this.method3441(var11, var15, var18[var20], 0, var13, var14, var19[var20]);
                                                var20++;
                                            }
                                        }
                                    }
                                } else if (var16 == 3) {
                                    this.method3441(var11, var15, 0, 0, var13, var14, 0);
                                    this.method3441(var11, var15, arg1.field441, 0, var13, var14, 0);
                                    this.method3441(var11, var15, 0, 0, var13, var14, arg1.field441);
                                } else if (var16 == 2) {
                                    this.method3441(var11, var15, arg1.field441, 0, var13, var14, 0);
                                    this.method3441(var11, var15, arg1.field441, 0, var13, var14, arg1.field441);
                                    this.method3441(var11, var15, 0, 0, var13, var14, 0);
                                } else if (var16 == 5) {
                                    this.method3441(var11, var15, arg1.field441, 0, var13, var14, arg1.field441);
                                    this.method3441(var11, var15, 0, 0, var13, var14, arg1.field441);
                                    this.method3441(var11, var15, arg1.field441, 0, var13, var14, 0);
                                } else if (var16 == 4) {
                                    this.method3441(var11, var15, 0, 0, var13, var14, arg1.field441);
                                    this.method3441(var11, var15, 0, 0, var13, var14, 0);
                                    this.method3441(var11, var15, arg1.field441, 0, var13, var14, arg1.field441);
                                }
                            }
                        }
                        var14++;
                        var12++;
                    }
                } else {
                    var12 += this.field8604 - this.field8585;
                }
                var11++;
            }
            this.field8603 = this.field8602.method3179(this.field8597.field6855, 5123, this.field8597.field6892, 2, false);
            this.field8596 = this.field8602.method3221(-7946, this.field8589.field6892, false, this.field8589.field6855, 16);
            this.field8594 = new class470(this.field8596, 5126, 3, 0);
            this.field8581 = new class470(this.field8596, 5121, 4, 12);
        } else {
            this.field8596 = null;
            this.field8594 = null;
            this.field8603 = null;
            this.field8581 = null;
        }
        this.field8600 = null;
        this.field8597 = null;
        this.field8599 = this.field8582 = this.field8591 = null;
        this.field8589 = null;
    }
}
