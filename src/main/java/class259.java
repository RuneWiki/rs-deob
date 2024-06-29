import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class259 {

    @OriginalMember(owner = "client!bk", name = "u", descriptor = "[I")
    private int[] field3654 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

    @OriginalMember(owner = "client!bk", name = "A", descriptor = "[I")
    private int[] field3660 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "I")
    public int field3639;

    @OriginalMember(owner = "client!bk", name = "t", descriptor = "I")
    public int field3653;

    @OriginalMember(owner = "client!bk", name = "w", descriptor = "Lta;")
    private class144 field3656;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "I")
    public int field3637;

    @OriginalMember(owner = "client!bk", name = "p", descriptor = "Ltj;")
    private class134 field3649;

    @OriginalMember(owner = "client!bk", name = "n", descriptor = "Z")
    public boolean field3647;

    @OriginalMember(owner = "client!bk", name = "l", descriptor = "[[[I")
    public int[][][] field3645;

    @OriginalMember(owner = "client!bk", name = "j", descriptor = "[[[B")
    private byte[][][] field3643;

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "[[[B")
    private byte[][][] field3640;

    @OriginalMember(owner = "client!bk", name = "q", descriptor = "[[[B")
    private byte[][][] field3650;

    @OriginalMember(owner = "client!bk", name = "k", descriptor = "[[[B")
    private byte[][][] field3644;

    @OriginalMember(owner = "client!bk", name = "s", descriptor = "[[[B")
    public byte[][][] field3652;

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "Lwi;")
    public static class330 field3636 = new class330(8);

    @OriginalMember(owner = "client!bk", name = "x", descriptor = "Lof;")
    public static class446 field3657 = new class446("flash3:", "blinken3:", "clignotant3:", "brilho3:");

    @OriginalMember(owner = "client!bk", name = "B", descriptor = "I")
    public static int field3661 = 0;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "I")
    public static int field3642;

    @OriginalMember(owner = "client!bk", name = "m", descriptor = "I")
    public static int field3646;

    @OriginalMember(owner = "client!bk", name = "o", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!bk", name = "v", descriptor = "I")
    public static int field3655;

    @OriginalMember(owner = "client!bk", name = "y", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!bk", name = "z", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!bk", name = "C", descriptor = "I")
    public static int field3662;

    @OriginalMember(owner = "client!bk", name = "D", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!bk", name = "E", descriptor = "I")
    public static int field3664;

    @OriginalMember(owner = "client!bk", name = "r", descriptor = "[[[B")
    public byte[][][] field3651;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "([[IIB)V")
    public final void method1668(int[][] arg0, int arg1, byte arg2) {
        if (arg2 != -77) {
            return;
        }
        field3658++;
        int[][] var4 = this.field3645[arg1];
        for (int var5 = 0; var5 < this.field3637 + 1; var5++) {
            for (int var6 = 0; var6 < (this.field3639 + 1); var6++) {
                var4[var5][var6] += arg0[var5][var6];
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIIII)V")
    private final void method1669(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3646++;
        int var7 = arg0;
        if (arg2 < 70) {
            field3636 = null;
        }
        while (arg0 + arg1 > var7) {
            for (int var10 = arg3; var10 < (arg3 + arg5); var10++) {
                if (var10 >= 0 && var10 < this.field3637 && var7 >= 0 && this.field3639 > var7) {
                    this.field3645[arg4][var10][var7] = arg4 <= 0 ? 0 : this.field3645[arg4 - 1][var10][var7] - 240;
                }
            }
            var7++;
        }
        if (arg3 > 0 && this.field3637 > arg3) {
            for (int var8 = arg0 + 1; var8 < arg0 + arg1; var8++) {
                if (var8 >= 0 && this.field3639 > var8) {
                    this.field3645[arg4][arg3][var8] = this.field3645[arg4][arg3 - 1][var8];
                }
            }
        }
        if (arg0 > 0 && arg0 < this.field3639) {
            for (int var9 = arg3 + 1; var9 < (arg3 + arg5); var9++) {
                if (var9 >= 0 && this.field3637 > var9) {
                    this.field3645[arg4][var9][arg0] = this.field3645[arg4][var9][arg0 - 1];
                }
            }
        }
        if (arg3 < 0 || arg0 < 0 || this.field3637 <= arg3 || arg0 >= this.field3639) {
            return;
        }
        if (arg4 == 0) {
            if (arg3 <= 0 || this.field3645[arg4][arg3 - 1][arg0] == 0) {
                if (arg0 > 0 && this.field3645[arg4][arg3][arg0 - 1] != 0) {
                    this.field3645[arg4][arg3][arg0] = this.field3645[arg4][arg3][arg0 - 1];
                    return;
                }
                if (arg3 > 0 && arg0 > 0 && this.field3645[arg4][arg3 - 1][arg0 - 1] != 0) {
                    this.field3645[arg4][arg3][arg0] = this.field3645[arg4][arg3 - 1][arg0 - 1];
                    return;
                }
                return;
            }
            this.field3645[arg4][arg3][arg0] = this.field3645[arg4][arg3 - 1][arg0];
        } else if (arg3 <= 0 || this.field3645[arg4][arg3 - 1][arg0] == this.field3645[arg4 - 1][arg3 - 1][arg0]) {
            if (arg0 > 0 && this.field3645[arg4][arg3][arg0 - 1] != this.field3645[arg4 - 1][arg3][arg0 - 1]) {
                this.field3645[arg4][arg3][arg0] = this.field3645[arg4][arg3][arg0 - 1];
                return;
            }
            if (arg3 > 0 && arg0 > 0 && this.field3645[arg4 - 1][arg3 - 1][arg0 - 1] != this.field3645[arg4][arg3 - 1][arg0 - 1]) {
                this.field3645[arg4][arg3][arg0] = this.field3645[arg4][arg3 - 1][arg0 - 1];
                return;
            }
        } else {
            this.field3645[arg4][arg3][arg0] = this.field3645[arg4][arg3 - 1][arg0];
            return;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V")
    public static void method1670(int arg0) {
        field3636 = null;
        if (arg0 != 1) {
            method1671(89);
        }
        field3657 = null;
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)V")
    public static final void method1671(int arg0) {
        class303.field4434 = 0;
        if (arg0 == 50) {
            field3642++;
            class475.field7049 = new class153[50];
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lo;Lo;ILqa;)V")
    public final void method1672(class23 arg0, class23 arg1, int arg2, class165 arg3) {
        field3648++;
        int[][] var5 = new int[this.field3637][this.field3639];
        if (class492.field7263 == null || class492.field7263.length != this.field3639) {
            class35.field514 = new int[this.field3639];
            class281.field3975 = new int[this.field3639];
            class264.field3700 = new int[this.field3639];
            class381.field5814 = new int[this.field3639];
            class492.field7263 = new int[this.field3639];
        }
        for (int var6 = arg2; var6 < this.field3653; var6++) {
            for (int var8 = 0; var8 < this.field3639; var8++) {
                class492.field7263[var8] = 0;
                class264.field3700[var8] = 0;
                class381.field5814[var8] = 0;
                class35.field514[var8] = 0;
                class281.field3975[var8] = 0;
            }
            for (int var9 = -5; var9 < this.field3637; var9++) {
                for (int var10 = 0; var10 < this.field3639; var10++) {
                    int var19 = var9 + 5;
                    int var10002;
                    if (var19 < this.field3637) {
                        int var20 = this.field3643[var6][var19][var10] & 0xFF;
                        if (var20 > 0) {
                            class27 var21 = this.field3656.method959(108, var20 - 1);
                            class492.field7263[var10] += var21.field393;
                            class264.field3700[var10] += var21.field399;
                            class381.field5814[var10] += var21.field392;
                            class35.field514[var10] += var21.field386;
                            var10002 = class281.field3975[var10]++;
                        }
                    }
                    int var22 = var9 - 5;
                    if (var22 >= 0) {
                        int var23 = this.field3643[var6][var22][var10] & 0xFF;
                        if (var23 > 0) {
                            class27 var24 = this.field3656.method959(-76, var23 - 1);
                            class492.field7263[var10] -= var24.field393;
                            class264.field3700[var10] -= var24.field399;
                            class381.field5814[var10] -= var24.field392;
                            class35.field514[var10] -= var24.field386;
                            var10002 = class281.field3975[var10]--;
                        }
                    }
                }
                if (var9 >= 0) {
                    int var11 = 0;
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    for (int var16 = -5; var16 < this.field3639; var16++) {
                        int var17 = var16 + 5;
                        if (this.field3639 > var17) {
                            var13 += class381.field5814[var17];
                            var14 += class35.field514[var17];
                            var11 += class492.field7263[var17];
                            var12 += class264.field3700[var17];
                            var15 += class281.field3975[var17];
                        }
                        int var18 = var16 - 5;
                        if (var18 >= 0) {
                            var13 -= class381.field5814[var18];
                            var12 -= class264.field3700[var18];
                            var14 -= class35.field514[var18];
                            var11 -= class492.field7263[var18];
                            var15 -= class281.field3975[var18];
                        }
                        if (var16 >= 0 && var14 > 0 && var15 > 0) {
                            var5[var9][var16] = class9.method98(var13 / var15, var12 / var15, var11 * 256 / var14, (byte) -93);
                        }
                    }
                }
            }
            if (class323.field4680) {
                this.method1675(arg3, var6 == 0 ? arg0 : null, var6, class306.field4447[var6], var5, arg2 - 30048, var6 == 0 ? arg1 : null);
            } else {
                this.method1677(arg2 - 2, var6, class306.field4447[var6], var6 == 0 ? arg1 : null, var5, arg3, var6 == 0 ? arg0 : null);
            }
            this.field3643[var6] = null;
            this.field3640[var6] = null;
            this.field3644[var6] = null;
            this.field3650[var6] = null;
        }
        if (!this.field3647) {
            if (class448.field6745 != 0) {
                class455.method2768();
            }
            if (class441.field6659) {
                class433.method2640();
            }
        }
        for (int var7 = 0; var7 < this.field3653; var7++) {
            class306.field4447[var7].method211();
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "([Lkg;IIIILnj;I)V")
    public final void method1673(class181[] arg0, int arg1, int arg2, int arg3, int arg4, class164 arg5, int arg6) {
        field3659++;
        if (!this.field3647) {
            for (int var8 = 0; var8 < 4; var8++) {
                class181 var9 = arg0[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg1 + var10;
                        int var13 = arg2 + var11;
                        if (var12 >= 0 && var12 < this.field3637 && var13 >= 0 && this.field3639 > var13) {
                            var9.method1216(var13, var12, 0);
                        }
                    }
                }
            }
        }
        int var14 = arg1 + arg6;
        if (arg4 != 64) {
            this.method1673(null, 80, -26, 61, 91, null, 73);
        }
        int var15 = arg2 + arg3;
        for (int var16 = 0; var16 < this.field3653; var16++) {
            for (int var17 = 0; var17 < 64; var17++) {
                for (int var18 = 0; var18 < 64; var18++) {
                    this.method1678(var16, var14 + var17, 0, -2, arg1 + var17, 0, arg2 + var18, 0, arg5, false, var15 + var18);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lqa;[Lkg;B[[[I)V")
    public final void method1674(class165 arg0, class181[] arg1, byte arg2, int[][][] arg3) {
        field3638++;
        if (!this.field3647) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field3637; var6++) {
                    for (int var7 = 0; var7 < this.field3639; var7++) {
                        if ((class178.field2382[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class178.field2382[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg1[var8].method1220(27414, var6, var7);
                            }
                        }
                    }
                }
            }
        }
        int var9 = 0;
        if (arg2 > -100) {
            this.field3649 = null;
        }
        while (this.field3653 > var9) {
            int var10 = 0;
            int var11 = 0;
            if (!this.field3647) {
                if (class441.field6659) {
                    var10 |= 0x2;
                }
                if (class271.field3764) {
                    var11 |= 0x8;
                }
                if (class448.field6745 != 0) {
                    if (var9 == 0 | class414.field6310) {
                        var11 |= 0x10;
                    }
                    var10 |= 0x1;
                }
            }
            if (class441.field6659) {
                var11 |= 0x7;
            }
            if (!class127.field1728) {
                var11 |= 0x20;
            }
            int[][] var12 = arg3 == null || arg3.length <= var9 ? this.field3645[var9] : arg3[var9];
            class447.method2710(var9, arg0.method752(this.field3637, this.field3639, this.field3645[var9], var12, 128, var10, var11));
            var9++;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lqa;Lo;ILo;[[IILo;)V")
    private final void method1675(class165 arg0, class23 arg1, int arg2, class23 arg3, int[][] arg4, int arg5, class23 arg6) {
        field3664++;
        byte[][] var8 = this.field3644[arg2];
        byte[][] var9 = this.field3650[arg2];
        byte[][] var10 = this.field3643[arg2];
        if (arg5 != -30048) {
            this.method1681(null, -109, null, null, (byte) 17, null, null, 51, null, null, -2, 1, -60, 92);
        }
        byte[][] var11 = this.field3640[arg2];
        for (int var12 = 0; var12 < this.field3637; var12++) {
            int var13 = var12 >= (this.field3637 - 1) ? var12 : var12 + 1;
            for (int var14 = 0; var14 < this.field3639; var14++) {
                int var15 = var14 >= this.field3639 - 1 ? var14 : var14 + 1;
                if (class410.field6230 == -1 || class519.method3091(var14, class410.field6230, var12, arg2, 119)) {
                    boolean var16 = false;
                    boolean var17 = false;
                    boolean[] var18 = new boolean[4];
                    int var19 = var8[var12][var14];
                    int var20 = var9[var12][var14];
                    int var21 = var11[var12][var14] & 0xFF;
                    int var22 = var10[var12][var14] & 0xFF;
                    int var23 = var10[var12][var15] & 0xFF;
                    int var24 = var10[var13][var15] & 0xFF;
                    int var25 = var10[var13][var14] & 0xFF;
                    if (var21 != 0 || var22 != 0) {
                        class459 var26 = var21 == 0 ? null : this.field3649.method907(22599, var21 - 1);
                        class27 var27 = var22 == 0 ? null : this.field3656.method959(arg5 ^ 0xFFFF8ADD, var22 - 1);
                        if (var19 == 0 && var26 == null) {
                            var19 = 12;
                        }
                        class459 var28 = var26;
                        if (var26 != null) {
                            if (var26.field6864 == -1 && var26.field6878 == -1) {
                                var28 = var26;
                                var26 = null;
                            } else if (var27 != null && var19 != 0) {
                                var17 = var26.field6873;
                            }
                        }
                        if ((var19 == 0 || var19 == 12) && var12 > 0 && var14 > 0 && this.field3637 > var12 && this.field3639 > var14) {
                            byte var29 = 0;
                            byte var30 = 0;
                            byte var31 = 0;
                            int var32 = var30 + (var10[var13][var14 - 1] == var22 ? 1 : -1);
                            int var33 = var31 + (var10[var13][var15] == var22 ? 1 : -1);
                            byte var34 = 0;
                            int var35 = var29 + (var10[var12 - 1][var14 - 1] == var22 ? 1 : -1);
                            int var36 = var34 + (var10[var12 - 1][var15] == var22 ? 1 : -1);
                            if (var10[var12][var14 - 1] == var22) {
                                var32++;
                                var35++;
                            } else {
                                var35--;
                                var32--;
                            }
                            if (var10[var13][var14] == var22) {
                                var32++;
                                var33++;
                            } else {
                                var33--;
                                var32--;
                            }
                            if (var10[var12][var15] == var22) {
                                var36++;
                                var33++;
                            } else {
                                var36--;
                                var33--;
                            }
                            if (var10[var12 - 1][var14] == var22) {
                                var36++;
                                var35++;
                            } else {
                                var36--;
                                var35--;
                            }
                            int var37 = var35 - var33;
                            if (var37 < 0) {
                                var37 = -var37;
                            }
                            int var38 = var32 - var36;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            if (var37 == var38) {
                                var37 = arg3.method222(var12, var14) - arg3.method222(var13, var15);
                                if (var37 < 0) {
                                    var37 = -var37;
                                }
                                var38 = arg3.method222(var13, var14) - arg3.method222(var12, var15);
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                            }
                            var20 = var37 < var38 ? 1 : 0;
                        }
                        for (int var39 = 0; var39 < 13; var39++) {
                            class538.field7890[var39] = -1;
                            class468.field7006[var39] = 1;
                        }
                        boolean[] var40 = var26 != null && var26.field6873 ? class294.field4295[var19] : class384.field5835[var19];
                        this.method1681(var8, var14, var18, arg0, (byte) -125, var26, var11, var20, var9, var27, this.field3639, var19, var12, this.field3637);
                        boolean var41 = var26 != null && var26.field6878 != var26.field6864;
                        if (!var41) {
                            for (int var42 = 0; var42 < 8; var42++) {
                                if (class538.field7890[var42] >= 0 && class535.field7865[var42] != class448.field6739[var42]) {
                                    var41 = true;
                                    break;
                                }
                            }
                        }
                        if (!var40[var20 + 1 & 0x3]) {
                            var18[1] = class78.method538(var18[1], class519.method3092(class468.field7006[4], class468.field7006[2]) == 0);
                        }
                        if (!var40[var20 + 3 & 0x3]) {
                            var18[3] = class78.method538(var18[3], class519.method3092(class468.field7006[6], class468.field7006[0]) == 0);
                        }
                        if (!var40[-(-var20) & 0x3]) {
                            var18[0] = class78.method538(var18[0], class519.method3092(class468.field7006[2], class468.field7006[0]) == 0);
                        }
                        if (!var40[var20 + 2 & 0x3]) {
                            var18[2] = class78.method538(var18[2], class519.method3092(class468.field7006[6], class468.field7006[4]) == 0);
                        }
                        if (!var17 && (var19 == 0 || var19 == 12)) {
                            if (var18[0] && !var18[1] && !var18[2] && var18[3]) {
                                var18[0] = var18[3] = false;
                                var20 = 0;
                                var19 = var19 == 0 ? 13 : 14;
                            } else if (var18[0] && var18[1] && !var18[2] && !var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var20 = 3;
                                var18[0] = var18[1] = false;
                            } else if (!var18[0] && var18[1] && var18[2] && !var18[3]) {
                                var20 = 2;
                                var19 = var19 == 0 ? 13 : 14;
                                var18[1] = var18[2] = false;
                            } else if (!var18[0] && !var18[1] && var18[2] && var18[3]) {
                                var20 = 1;
                                var18[2] = var18[3] = false;
                                var19 = var19 == 0 ? 13 : 14;
                            }
                        }
                        boolean var43 = !var17 && !var18[0] && !var18[2] && !var18[1] && !var18[3];
                        int[] var44 = null;
                        int var45;
                        int[] var46;
                        int[] var47;
                        int var48;
                        int[] var49;
                        if (var43) {
                            var45 = var27 == null ? 0 : class453.field6821[var19];
                            var46 = class518.field7620[var19];
                            var47 = class84.field1234[var19];
                            var48 = var26 == null ? 0 : class421.field6421[var19];
                            var49 = class289.field4230[var19];
                        } else if (var17) {
                            var47 = class492.field7264[var19];
                            var49 = class142.field1899[var19];
                            var48 = var26 == null ? 0 : class340.field5261[var19];
                            var46 = class422.field6446[var19];
                            var44 = class273.field3799[var19];
                            var45 = var27 == null ? 0 : class428.field6495[var19];
                        } else {
                            var49 = class147.field1958[var19];
                            var47 = class183.field2479[var19];
                            var45 = var27 == null ? 0 : class398.field6073[var19];
                            var48 = var26 == null ? 0 : class136.field1819[var19];
                            var46 = class310.field4516[var19];
                            var44 = class424.field6464[var19];
                        }
                        int var50 = var45 + var48;
                        if (var50 <= 0) {
                            class106.method678(arg2, var12, var14);
                        } else {
                            if (var18[0]) {
                                var50++;
                            }
                            if (var18[2]) {
                                var50++;
                            }
                            if (var18[1]) {
                                var50++;
                            }
                            if (var18[3]) {
                                var50++;
                            }
                            int var51 = 0;
                            int var52 = 0;
                            int var53 = var50 * 3;
                            int[] var54 = var41 ? new int[var53] : null;
                            int[] var55 = new int[var53];
                            int[] var56 = new int[var53];
                            int[] var57 = new int[var53];
                            int[] var58 = new int[var53];
                            int[] var59 = new int[var53];
                            int[] var60 = arg6 == null ? null : new int[var53];
                            int[] var61 = arg6 == null && arg1 == null ? null : new int[var53];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var26 != null) {
                                var62 = var26.field6864;
                                var63 = arg0.method755() ? var26.field6871 : var26.field6869;
                                var64 = var26.field6868;
                                int var65 = class355.method2282((byte) -47, var26, arg0);
                                for (int var66 = 0; var66 < var48; var66++) {
                                    boolean var67 = false;
                                    byte var68;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class65.field932[0] = var46[var51];
                                        class65.field932[1] = 1;
                                        class65.field932[2] = var49[var51];
                                        class65.field932[3] = 1;
                                        class65.field932[4] = var47[var51];
                                        class65.field932[5] = var49[var51];
                                        var68 = 6;
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class65.field932[0] = var46[var51];
                                        class65.field932[1] = 5;
                                        class65.field932[2] = var49[var51];
                                        class65.field932[3] = 5;
                                        class65.field932[4] = var47[var51];
                                        class65.field932[5] = var49[var51];
                                        var68 = 6;
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class65.field932[0] = var46[var51];
                                        class65.field932[1] = 3;
                                        class65.field932[2] = var49[var51];
                                        class65.field932[3] = 3;
                                        class65.field932[4] = var47[var51];
                                        class65.field932[5] = var49[var51];
                                        var68 = 6;
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class65.field932[0] = var46[var51];
                                        class65.field932[1] = 7;
                                        class65.field932[2] = var49[var51];
                                        class65.field932[3] = 7;
                                        class65.field932[4] = var47[var51];
                                        var68 = 6;
                                        class65.field932[5] = var49[var51];
                                    } else {
                                        class65.field932[0] = var46[var51];
                                        class65.field932[1] = var47[var51];
                                        var68 = 3;
                                        class65.field932[2] = var49[var51];
                                    }
                                    var51++;
                                    for (int var69 = 0; var69 < var68; var69++) {
                                        int var70 = class65.field932[var69];
                                        int var71 = var70 - var20 * 2 & 0x7;
                                        int var72 = this.field3654[var70];
                                        int var73 = this.field3660[var70];
                                        int var74;
                                        int var75;
                                        if (var20 == 1) {
                                            var74 = 128 - var72;
                                            var75 = var73;
                                        } else if (var20 == 2) {
                                            var75 = 128 - var72;
                                            var74 = 128 - var73;
                                        } else if (var20 == 3) {
                                            var75 = 128 - var73;
                                            var74 = var72;
                                        } else {
                                            var75 = var72;
                                            var74 = var73;
                                        }
                                        var55[var52] = var75;
                                        var56[var52] = var74;
                                        if (var60 != null && class83.field1207[var19][var70]) {
                                            int var76 = (var12 << 7) + var75;
                                            int var77 = (var14 << 7) + var74;
                                            var60[var52] = arg6.method218(var76, var77) - arg3.method218(var76, var77);
                                        }
                                        if (var61 != null) {
                                            if (arg6 != null && !class83.field1207[var19][var70]) {
                                                int var78 = (var12 << 7) + var75;
                                                int var79 = (var14 << 7) + var74;
                                                var61[var52] = arg3.method218(var78, var79) - arg6.method218(var78, var79);
                                            } else if (arg1 != null && !class510.field7491[var19][var70]) {
                                                int var80 = (var12 << 7) + var75;
                                                int var81 = (var14 << 7) + var74;
                                                var61[var52] = arg1.method218(var80, var81) - arg3.method218(var80, var81);
                                            }
                                        }
                                        if (var70 < 8 && var26.field6883 < class538.field7890[var71]) {
                                            if (var54 != null) {
                                                var54[var52] = class535.field7865[var71];
                                            }
                                            var59[var52] = class45.field648[var71];
                                            var58[var52] = class178.field2379[var71];
                                            var57[var52] = class448.field6739[var71];
                                        } else {
                                            if (var54 != null) {
                                                var54[var52] = var65;
                                            }
                                            var58[var52] = arg0.method755() ? var26.field6871 : var26.field6869;
                                            var59[var52] = var26.field6868;
                                            var57[var52] = var62;
                                        }
                                        var52++;
                                    }
                                }
                                if (!this.field3647 && arg2 == 0) {
                                    class420.method2569(var12, var14, var26.field6870, var26.field6881 * 8, var26.field6865);
                                }
                                if (var19 != 12 && var26.field6864 != -1 && var26.field6876) {
                                    var16 = true;
                                }
                            } else if (var43) {
                                var51 += class421.field6421[var19];
                            } else if (var17) {
                                var51 += class340.field5261[var19];
                            } else {
                                var51 += class136.field1819[var19];
                            }
                            if (var27 != null) {
                                if (var24 == 0) {
                                    var24 = var22;
                                }
                                if (var25 == 0) {
                                    var25 = var22;
                                }
                                if (var23 == 0) {
                                    var23 = var22;
                                }
                                class27 var82 = this.field3656.method959(arg5 ^ 0xFFFF8ADD, var22 - 1);
                                class27 var83 = this.field3656.method959(-18, var23 - 1);
                                class27 var84 = this.field3656.method959(arg5 + 30166, var24 + -1);
                                class27 var85 = this.field3656.method959(arg5 ^ 0xFFFF8AD1, var25 - 1);
                                for (int var86 = 0; var86 < var45; var86++) {
                                    boolean var87 = false;
                                    byte var88;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class65.field932[0] = var46[var51];
                                        class65.field932[1] = 1;
                                        class65.field932[2] = var49[var51];
                                        class65.field932[3] = 1;
                                        class65.field932[4] = var47[var51];
                                        var88 = 6;
                                        class65.field932[5] = var49[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class65.field932[0] = var46[var51];
                                        class65.field932[1] = 5;
                                        class65.field932[2] = var49[var51];
                                        class65.field932[3] = 5;
                                        class65.field932[4] = var47[var51];
                                        class65.field932[5] = var49[var51];
                                        var88 = 6;
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class65.field932[0] = var46[var51];
                                        class65.field932[1] = 3;
                                        class65.field932[2] = var49[var51];
                                        class65.field932[3] = 3;
                                        class65.field932[4] = var47[var51];
                                        var88 = 6;
                                        class65.field932[5] = var49[var51];
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class65.field932[0] = var46[var51];
                                        class65.field932[1] = 7;
                                        class65.field932[2] = var49[var51];
                                        class65.field932[3] = 7;
                                        class65.field932[4] = var47[var51];
                                        class65.field932[5] = var49[var51];
                                        var88 = 6;
                                    } else {
                                        class65.field932[0] = var46[var51];
                                        class65.field932[1] = var47[var51];
                                        class65.field932[2] = var49[var51];
                                        var88 = 3;
                                    }
                                    var51++;
                                    for (int var89 = 0; var89 < var88; var89++) {
                                        int var90 = class65.field932[var89];
                                        int var91 = var90 - (var20 * 2) & 0x7;
                                        int var92 = this.field3654[var90];
                                        int var93 = this.field3660[var90];
                                        int var94;
                                        int var95;
                                        if (var20 == 1) {
                                            var94 = var93;
                                            var95 = 128 - var92;
                                        } else if (var20 == 2) {
                                            var95 = 128 - var93;
                                            var94 = 128 - var92;
                                        } else if (var20 == 3) {
                                            var95 = var92;
                                            var94 = 128 - var93;
                                        } else {
                                            var94 = var92;
                                            var95 = var93;
                                        }
                                        var55[var52] = var94;
                                        var56[var52] = var95;
                                        if (var60 != null && class83.field1207[var19][var90]) {
                                            int var96 = (var12 << 7) + var94;
                                            int var97 = (var14 << 7) + var95;
                                            var60[var52] = arg6.method218(var96, var97) - arg3.method218(var96, var97);
                                        }
                                        if (var61 != null) {
                                            if (arg6 != null && !class83.field1207[var19][var90]) {
                                                int var98 = (var12 << 7) + var94;
                                                int var99 = (var14 << 7) + var95;
                                                var61[var52] = arg3.method218(var98, var99) - arg6.method218(var98, var99);
                                            } else if (arg1 != null && !class510.field7491[var19][var90]) {
                                                int var100 = (var12 << 7) + var94;
                                                int var101 = (var14 << 7) + var95;
                                                var61[var52] = arg1.method218(var100, var101) - arg3.method218(var100, var101);
                                            }
                                        }
                                        if (var90 < 8 && class538.field7890[var91] >= 0) {
                                            if (var54 != null) {
                                                var54[var52] = class535.field7865[var91];
                                            }
                                            var59[var52] = class45.field648[var91];
                                            var58[var52] = class178.field2379[var91];
                                            var57[var52] = class448.field6739[var91];
                                        } else {
                                            if (var17 && class83.field1207[var19][var90]) {
                                                var58[var52] = var63;
                                                var59[var52] = var64;
                                                var57[var52] = var62;
                                            } else if (var94 == 0 && var95 == 0) {
                                                var57[var52] = arg4[var12][var14];
                                                var58[var52] = var82.field395;
                                                var59[var52] = var82.field398;
                                            } else if (var94 == 0 && var95 == 128) {
                                                var57[var52] = arg4[var12][var15];
                                                var58[var52] = var83.field395;
                                                var59[var52] = var83.field398;
                                            } else if (var94 == 128 && var95 == 128) {
                                                var57[var52] = arg4[var13][var15];
                                                var58[var52] = var84.field395;
                                                var59[var52] = var84.field398;
                                            } else if (var94 == 128 && var95 == 0) {
                                                var57[var52] = arg4[var13][var14];
                                                var58[var52] = var85.field395;
                                                var59[var52] = var85.field398;
                                            } else {
                                                if (var94 < 64) {
                                                    if (var95 >= 64) {
                                                        var58[var52] = var83.field395;
                                                        var59[var52] = var83.field398;
                                                    } else {
                                                        var58[var52] = var82.field395;
                                                        var59[var52] = var82.field398;
                                                    }
                                                } else if (var95 >= 64) {
                                                    var58[var52] = var84.field395;
                                                    var59[var52] = var84.field398;
                                                } else {
                                                    var58[var52] = var85.field395;
                                                    var59[var52] = var85.field398;
                                                }
                                                int var102 = class542.method3193(arg4[var13][var14], true, arg4[var12][var14], var94 << 7 >> 7);
                                                int var103 = class542.method3193(arg4[var13][var15], true, arg4[var12][var15], var94 << 7 >> 7);
                                                var57[var52] = class542.method3193(var103, true, var102, var95 << 7 >> 7);
                                            }
                                            if (var54 != null) {
                                                var54[var52] = var57[var52];
                                            }
                                        }
                                        var52++;
                                    }
                                }
                                if (var19 != 0 && var27.field388) {
                                    var16 = true;
                                }
                            }
                            int var104 = arg3.method222(var12, var14);
                            int var105 = arg3.method222(var13, var14);
                            int var106 = arg3.method222(var13, var15);
                            int var107 = arg3.method222(var12, var15);
                            if (arg2 > 0) {
                                boolean var108 = true;
                                if (var22 == 0 && var19 != 0) {
                                    var108 = false;
                                }
                                if (var21 > 0 && var28 != null && !var28.field6880) {
                                    var108 = false;
                                }
                                if (var108 && var104 == var105 && var104 == var106 && var104 == var107) {
                                    this.field3652[arg2][var12][var14] = (byte) class311.method1956(this.field3652[arg2][var12][var14], 4);
                                }
                            }
                            int var109 = 0;
                            int var110 = 0;
                            int var111 = 0;
                            if (this.field3647) {
                                var109 = class62.method441(var12, var14);
                                var110 = class263.method1699(var12, var14);
                                var111 = class510.method3053(var12, var14);
                            }
                            arg3.method216(var12, var14, var55, var60, var56, var61, var57, var54, var58, var59, var109, var110, var111, var16);
                            class106.method678(arg2, var12, var14);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)I")
    public static final int method1676(int arg0, int arg1) {
        field3641++;
        if (arg1 != 128) {
            field3661 = -26;
        }
        if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
            return 6407;
        } else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
            return 6408;
        } else if (arg0 == 6406 || arg0 == 34844) {
            return 6406;
        } else if (arg0 == 6409 || arg0 == 34846) {
            return 6409;
        } else if (arg0 == 6410 || arg0 == 34847) {
            return 6410;
        } else if (arg0 == 6402) {
            return 6402;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IILo;Lo;[[ILqa;Lo;)V")
    private final void method1677(int arg0, int arg1, class23 arg2, class23 arg3, int[][] arg4, class165 arg5, class23 arg6) {
        field3663++;
        for (int var8 = 0; var8 < this.field3637; var8++) {
            for (int var9 = 0; var9 < this.field3639; var9++) {
                if (class410.field6230 == -1 || class519.method3091(var9, class410.field6230, var8, arg1, -32)) {
                    byte var10 = this.field3644[arg1][var8][var9];
                    byte var11 = this.field3650[arg1][var8][var9];
                    int var12 = this.field3640[arg1][var8][var9] & 0xFF;
                    int var13 = this.field3643[arg1][var8][var9] & 0xFF;
                    class459 var14 = var12 == 0 ? null : this.field3649.method907(22599, var12 - 1);
                    class27 var15 = var13 == 0 ? null : this.field3656.method959(arg0 - 9, var13 + -1);
                    int var16 = 0;
                    int var17 = 0;
                    if (var10 != 0) {
                        var16 = var15 == null ? 0 : class453.field6821[var10];
                        var17 = var14 == null ? 0 : class421.field6421[var10];
                    } else if (var14 != null) {
                        var17 = class421.field6421[var10];
                    } else if (var15 != null) {
                        var16 = class421.field6421[var10];
                    }
                    int var18 = var16 + var17;
                    int var19 = 0;
                    if (var18 != 0) {
                        int[] var20 = new int[var18];
                        int[] var21 = new int[var18];
                        int[] var22 = new int[var18];
                        int[] var23 = new int[var18];
                        boolean var24 = false;
                        if (var14 == null || var14.field6864 == -1 && var14.field6878 == -1 && var14.field6871 == -1) {
                            for (int var27 = 0; var27 < var17; var27++) {
                                var20[var19] = -1;
                                var19++;
                            }
                        } else {
                            int var25 = arg5.method755() ? var14.field6871 : var14.field6869;
                            if (class528.field7738) {
                                var25 = -1;
                            }
                            for (int var26 = 0; var26 < var17; var26++) {
                                var22[var19] = var25;
                                var23[var19] = var14.field6868;
                                if (var14.field6864 == -1) {
                                    var20[var19] = -1;
                                } else {
                                    var20[var19] = var14.field6864;
                                }
                                if (var14.field6878 == -1) {
                                    var21[var19] = -1;
                                } else {
                                    var24 = true;
                                    var21[var19] = var14.field6878;
                                }
                                var19++;
                            }
                            if (!this.field3647 && arg1 == 0) {
                                class420.method2569(var8, var9, var14.field6870, var14.field6881 * 8, var14.field6865);
                            }
                        }
                        if (!var24) {
                            var21 = null;
                        }
                        if (var15 == null) {
                            for (int var28 = 0; var28 < var16; var28++) {
                                var20[var19] = -1;
                                var19++;
                            }
                        } else {
                            int var29 = var15.field395;
                            if (class528.field7738) {
                                var29 = -1;
                            }
                            for (int var30 = 0; var30 < var16; var30++) {
                                var22[var19] = var29;
                                var23[var19] = var15.field398;
                                var20[var19] = arg4[var8][var9];
                                if (var21 != null) {
                                    var21[var19] = -1;
                                }
                                var19++;
                            }
                        }
                        int var31 = this.field3654.length;
                        int[] var32 = new int[var31];
                        int[] var33 = new int[var31];
                        int[] var34 = arg3 == null ? null : new int[var31];
                        int[] var35 = arg3 == null && arg6 == null ? null : new int[var31];
                        for (int var36 = 0; var36 < var31; var36++) {
                            int var45 = this.field3654[var36];
                            int var46 = this.field3660[var36];
                            if (var11 == 0) {
                                var32[var36] = var45;
                                var33[var36] = var46;
                            } else if (var11 == 1) {
                                var32[var36] = var46;
                                var33[var36] = 128 - var45;
                            } else if (var11 == 2) {
                                var32[var36] = 128 - var45;
                                var33[var36] = 128 - var46;
                            } else if (var11 == 3) {
                                var32[var36] = 128 - var46;
                                var33[var36] = var45;
                            }
                            if (var34 != null && class83.field1207[var10][var36]) {
                                int var49 = (var8 << 7) + var45;
                                int var50 = (var9 << 7) + var45;
                                var34[var36] = arg3.method218(var49, var50) - arg2.method218(var49, var50);
                            }
                            if (var35 != null) {
                                if (arg3 != null && !class83.field1207[var10][var36]) {
                                    int var51 = (var8 << 7) + var45;
                                    int var52 = (var9 << 7) + var45;
                                    var35[var36] = arg2.method218(var51, var52) - arg3.method218(var51, var52);
                                } else if (arg6 != null && !class510.field7491[var10][var36]) {
                                    int var53 = (var8 << 7) + var45;
                                    int var54 = (var9 << 7) + var45;
                                    var35[var36] = arg6.method218(var53, var54) - arg2.method218(var53, var54);
                                }
                            }
                        }
                        int var37 = arg2.method222(var8, var9);
                        int var38 = arg2.method222(var8 + 1, var9);
                        int var39 = arg2.method222(var8 + 1, var9 + 1);
                        int var40 = arg2.method222(var8, var9 + 1);
                        if (arg1 > 0) {
                            boolean var41 = true;
                            if (var13 == 0 && var10 != 0) {
                                var41 = false;
                            }
                            if (var12 > 0 && var14 != null && !var14.field6880) {
                                var41 = false;
                            }
                            if (var41 && var37 == var38 && var37 == var39 && var37 == var40) {
                                this.field3652[arg1][var8][var9] = (byte) class311.method1956(this.field3652[arg1][var8][var9], 4);
                            }
                        }
                        int var42 = 0;
                        int var43 = 0;
                        int var44 = 0;
                        if (this.field3647) {
                            var42 = class62.method441(var8, var9);
                            var43 = class263.method1699(var8, var9);
                            var44 = class510.method3053(var8, var9);
                        }
                        arg2.method221(var8, var9, var32, var34, var33, var35, class518.field7620[var10], class84.field1234[var10], class289.field4230[var10], var20, var21, var22, var23, var42, var43, var44, false);
                        class106.method678(arg1, var8, var9);
                    }
                }
            }
        }
        if (arg0 != -2) {
            this.field3654 = null;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIIIIIILnj;ZI)V")
    private final void method1678(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class164 arg8, boolean arg9, int arg10) {
        if (arg2 == 1) {
            arg7 = 1;
        } else if (arg2 == 2) {
            arg5 = 1;
            arg7 = 1;
        } else if (arg2 == 3) {
            arg5 = 1;
        }
        field3634++;
        if (arg4 >= 0 && this.field3637 > arg4 && arg6 >= 0 && arg6 < this.field3639) {
            if (!this.field3647 && !arg9) {
                class178.field2382[arg0][arg4][arg6] = 0;
            }
            while (true) {
                int var12 = arg8.method1087(false);
                if (var12 == 0) {
                    if (this.field3647) {
                        this.field3645[0][arg4 + arg5][arg6 + arg7] = 0;
                    } else if (arg0 == 0) {
                        this.field3645[0][arg4 + arg5][arg6 + arg7] = -class518.method3088(arg1 + 932731, arg10 + 556238, (byte) 59) * 8 << 0;
                    } else {
                        this.field3645[arg0][arg4 + arg5][arg6 + arg7] = this.field3645[arg0 - 1][arg4 + arg5][arg6 + arg7] - 240;
                    }
                    break;
                }
                if (var12 == 1) {
                    int var13 = arg8.method1087(false);
                    if (this.field3647) {
                        this.field3645[0][arg4 + arg5][arg6 + arg7] = var13 * 8 << 0;
                    } else {
                        if (var13 == 1) {
                            var13 = 0;
                        }
                        if (arg0 == 0) {
                            this.field3645[0][arg4 + arg5][arg6 + arg7] = -var13 * 8 << 0;
                        } else {
                            this.field3645[arg0][arg4 + arg5][arg6 + arg7] = this.field3645[arg0 - 1][arg4 + arg5][arg6 + arg7] - (var13 * 8 << 0);
                        }
                    }
                    break;
                }
                if (var12 <= 49) {
                    if (arg9) {
                        arg8.method1087(false);
                    } else {
                        this.field3640[arg0][arg4][arg6] = arg8.method1088((byte) -81);
                        this.field3644[arg0][arg4][arg6] = (byte) ((var12 - 2) / 4);
                        this.field3650[arg0][arg4][arg6] = (byte) class519.method3092(arg2 + var12 - 2, 3);
                    }
                } else if (var12 <= 81) {
                    if (!this.field3647 && !arg9) {
                        class178.field2382[arg0][arg4][arg6] = (byte) (var12 - 49);
                    }
                } else if (!arg9) {
                    this.field3643[arg0][arg4][arg6] = (byte) (var12 - 81);
                }
            }
        } else {
            while (true) {
                int var14 = arg8.method1087(false);
                if (var14 == 0) {
                    break;
                }
                if (var14 == 1) {
                    arg8.method1087(false);
                    break;
                }
                if (var14 <= 49) {
                    arg8.method1087(false);
                }
            }
        }
        if (arg3 != -2) {
            this.method1681(null, -93, null, null, (byte) 51, null, null, 36, null, null, 35, 88, 74, 94);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIII)V")
    public final void method1679(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 6) {
            method1676(23, -50);
        }
        for (int var6 = 0; var6 < this.field3653; var6++) {
            this.method1669(arg4, arg1, 102, arg0, var6, arg3);
        }
        field3635++;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIIIILnj;[Lkg;II)V")
    public final void method1680(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class164 arg6, class181[] arg7, int arg8, int arg9) {
        field3662++;
        int var11 = (arg4 & 0x7) * 8;
        if (!this.field3647) {
            class181 var12 = arg7[arg0];
            for (int var13 = 0; var13 < 8; var13++) {
                for (int var14 = 0; var14 < 8; var14++) {
                    int var15 = arg8 + class333.method2150(arg2, var13 & 0x7, var14 & 0x7, (byte) -118);
                    int var16 = arg3 + class298.method1899(-3, arg2, var13 & 0x7, var14 & 0x7);
                    if (var15 > 0 && (this.field3637 - 1) > var15 && var16 > 0 && var16 < this.field3639 - 1) {
                        var12.method1216(var16, var15, 0);
                    }
                }
            }
        }
        int var17 = (arg5 & 0x7) * 8;
        int var18 = arg4 & 0x1FFFFFF8 << 3;
        int var19 = (arg5 & 0xFFFFFFF8) << 3;
        byte var20 = 0;
        int var21 = arg9;
        if (arg2 == 1) {
            var21 = 1;
        } else if (arg2 == 2) {
            var21 = 1;
            var20 = 1;
        } else if (arg2 == 3) {
            var20 = 1;
        }
        for (int var22 = 0; var22 < this.field3653; var22++) {
            for (int var23 = 0; var23 < 64; var23++) {
                for (int var24 = 0; var24 < 64; var24++) {
                    if (arg1 == var22 && var23 >= var11 && var23 <= var11 + 8 && var24 >= var17 && var24 <= var17 + 8) {
                        int var25;
                        int var26;
                        if (var11 + 8 == var23 || var17 + 8 == var24) {
                            if (arg2 == 0) {
                                var25 = arg8 + var23 - var11;
                                var26 = var24 + arg3 - var17;
                            } else if (arg2 == 1) {
                                var26 = var11 + (arg3 - -8) - var23;
                                var25 = arg8 + var24 - var17;
                            } else if (arg2 == 2) {
                                var26 = arg3 + var17 + 8 - var24;
                                var25 = arg8 - var23 - (-var11 - 8);
                            } else {
                                var25 = var17 + arg8 + 8 - var24;
                                var26 = arg3 + var23 - var11;
                            }
                            this.method1678(arg0, var18 + var23, 0, arg9 - 2, var25, 0, var26, 0, arg6, true, var19 + var24);
                        } else {
                            var25 = class333.method2150(arg2, var23 & 0x7, var24 & 0x7, (byte) -117) + arg8;
                            var26 = arg3 + class298.method1899(-3, arg2, var23 & 0x7, var24 & 0x7);
                            this.method1678(arg0, var18 + var23, arg2, -2, var25, var20, var26, var21, arg6, false, var19 + var24);
                        }
                        if (var23 == 63 || var24 == 63) {
                            byte var27 = 1;
                            if (var23 == 63 && var24 == 63) {
                                var27 = 3;
                            }
                            for (int var28 = 0; var28 < var27; var28++) {
                                int var29 = var23;
                                int var30 = var24;
                                if (var28 == 0) {
                                    var30 = var24 == 63 ? 64 : var24;
                                    var29 = var23 == 63 ? 64 : var23;
                                } else if (var28 == 1) {
                                    var29 = 64;
                                } else if (var28 == 2) {
                                    var30 = 64;
                                }
                                int var31;
                                int var32;
                                if (arg2 == 0) {
                                    var32 = arg3 + var30 - var17;
                                    var31 = arg8 + var29 - var11;
                                } else if (arg2 == 1) {
                                    var31 = arg8 + var30 - var17;
                                    var32 = arg3 + var11 + 8 - var29;
                                } else if (arg2 == 2) {
                                    var31 = var11 + arg8 + 8 - var29;
                                    var32 = arg3 + var17 + 8 - var30;
                                } else {
                                    var31 = var17 + (arg8 - -8) - var30;
                                    var32 = arg3 + var29 - var11;
                                }
                                if (var31 >= 0 && var31 < this.field3637 && var32 >= 0 && var32 < this.field3639) {
                                    this.field3645[arg0][var31][var32] = this.field3645[arg0][var20 + var25][var21 + var26];
                                }
                            }
                        }
                    } else {
                        this.method1678(0, 0, 0, -2, -1, 0, -1, 0, arg6, false, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "([[BI[ZLqa;BLav;[[BI[[BLbh;IIII)V")
    private final void method1681(byte[][] arg0, int arg1, boolean[] arg2, class165 arg3, byte arg4, class459 arg5, byte[][] arg6, int arg7, byte[][] arg8, class27 arg9, int arg10, int arg11, int arg12, int arg13) {
        field3655++;
        boolean[] var15 = arg5 != null && arg5.field6873 ? class294.field4295[arg11] : class384.field5835[arg11];
        if (arg1 > 0) {
            if (arg12 > 0) {
                int var16 = arg6[arg12 - 1][arg1 - 1] & 0xFF;
                if (var16 > 0) {
                    class459 var17 = this.field3649.method907(22599, var16 - 1);
                    if (var17.field6864 != -1 && var17.field6873) {
                        byte var18 = arg0[arg12 - 1][arg1 - 1];
                        int var19 = arg8[arg12 - 1][arg1 - 1] * 2 + 4 & 0x7;
                        int var20 = class355.method2282((byte) -115, var17, arg3);
                        if (class83.field1207[var18][var19]) {
                            class448.field6739[0] = var17.field6864;
                            class535.field7865[0] = var20;
                            class178.field2379[0] = arg3.method755() ? var17.field6871 : var17.field6869;
                            class45.field648[0] = var17.field6868;
                            class538.field7890[0] = var17.field6883;
                            class468.field7006[0] = 256;
                        }
                    }
                }
            }
            if (arg12 < arg13 - 1) {
                int var21 = arg6[arg12 + 1][arg1 - 1] & 0xFF;
                if (var21 > 0) {
                    class459 var22 = this.field3649.method907(22599, var21 - 1);
                    if (var22.field6864 != -1 && var22.field6873) {
                        byte var23 = arg0[arg12 + 1][arg1 - 1];
                        int var24 = arg8[arg12 + 1][arg1 - 1] * 2 + 6 & 0x7;
                        int var25 = class355.method2282((byte) -45, var22, arg3);
                        if (class83.field1207[var23][var24]) {
                            class448.field6739[2] = var22.field6864;
                            class535.field7865[2] = var25;
                            class178.field2379[2] = arg3.method755() ? var22.field6871 : var22.field6869;
                            class45.field648[2] = var22.field6868;
                            class538.field7890[2] = var22.field6883;
                            class468.field7006[2] = 512;
                        }
                    }
                }
            }
        }
        if (arg1 < arg10 - 1) {
            if (arg12 > 0) {
                int var26 = arg6[arg12 - 1][arg1 + 1] & 0xFF;
                if (var26 > 0) {
                    class459 var27 = this.field3649.method907(22599, var26 - 1);
                    if (var27.field6864 != -1 && var27.field6873) {
                        byte var28 = arg0[arg12 - 1][arg1 + 1];
                        int var29 = arg8[arg12 - 1][arg1 + 1] * 2 + 2 & 0x7;
                        int var30 = class355.method2282((byte) -46, var27, arg3);
                        if (class83.field1207[var28][var29]) {
                            class448.field6739[6] = var27.field6864;
                            class535.field7865[6] = var30;
                            class178.field2379[6] = arg3.method755() ? var27.field6871 : var27.field6869;
                            class45.field648[6] = var27.field6868;
                            class538.field7890[6] = var27.field6883;
                            class468.field7006[6] = 64;
                        }
                    }
                }
            }
            if (arg12 < (arg13 - 1)) {
                int var31 = arg6[arg12 + 1][arg1 + 1] & 0xFF;
                if (var31 > 0) {
                    class459 var32 = this.field3649.method907(22599, var31 - 1);
                    if (var32.field6864 != -1 && var32.field6873) {
                        byte var33 = arg0[arg12 + 1][arg1 + 1];
                        int var34 = arg8[arg12 + 1][arg1 + 1] * 2 & 0x7;
                        int var35 = class355.method2282((byte) -109, var32, arg3);
                        if (class83.field1207[var33][var34]) {
                            class448.field6739[4] = var32.field6864;
                            class535.field7865[4] = var35;
                            class178.field2379[4] = arg3.method755() ? var32.field6871 : var32.field6869;
                            class45.field648[4] = var32.field6868;
                            class538.field7890[4] = var32.field6883;
                            class468.field7006[4] = 128;
                        }
                    }
                }
            }
        }
        if (arg1 > 0) {
            int var36 = arg6[arg12][arg1 - 1] & 0xFF;
            if (var36 > 0) {
                class459 var37 = this.field3649.method907(22599, var36 - 1);
                if (var37.field6864 != -1) {
                    byte var38 = arg0[arg12][arg1 - 1];
                    byte var39 = arg8[arg12][arg1 - 1];
                    if (var37.field6873) {
                        int var40 = 2;
                        int var41 = var39 * 2 + 4;
                        int var42 = class355.method2282((byte) -69, var37, arg3);
                        for (int var43 = 0; var43 < 3; var43++) {
                            var41 &= 0x7;
                            var40 &= 0x7;
                            if (class83.field1207[var38][var41] && class538.field7890[var40] <= var37.field6883) {
                                class448.field6739[var40] = var37.field6864;
                                class535.field7865[var40] = var42;
                                class178.field2379[var40] = arg3.method755() ? var37.field6871 : var37.field6869;
                                class45.field648[var40] = var37.field6868;
                                if (class538.field7890[var40] == var37.field6883) {
                                    class468.field7006[var40] = class311.method1956(class468.field7006[var40], 32);
                                } else {
                                    class468.field7006[var40] = 32;
                                }
                                class538.field7890[var40] = var37.field6883;
                            }
                            var40--;
                            var41++;
                        }
                        if (!var15[arg7 & 0x3]) {
                            arg2[0] = class294.field4295[var38][class519.method3092(3, var39 + 2)];
                        }
                    } else if (!var15[arg7 & 0x3]) {
                        arg2[0] = class384.field5835[var38][class519.method3092(3, var39 + 2)];
                    }
                }
            }
        }
        if (arg10 - 1 > arg1) {
            int var44 = arg6[arg12][arg1 + 1] & 0xFF;
            if (var44 > 0) {
                class459 var45 = this.field3649.method907(22599, var44 - 1);
                if (var45.field6864 != -1) {
                    byte var46 = arg0[arg12][arg1 + 1];
                    byte var47 = arg8[arg12][arg1 + 1];
                    if (var45.field6873) {
                        int var48 = 4;
                        int var49 = var47 * 2 + 2;
                        int var50 = class355.method2282((byte) -106, var45, arg3);
                        for (int var51 = 0; var51 < 3; var51++) {
                            var48 &= 0x7;
                            var49 &= 0x7;
                            if (class83.field1207[var46][var49] && var45.field6883 >= class538.field7890[var48]) {
                                class448.field6739[var48] = var45.field6864;
                                class535.field7865[var48] = var50;
                                class178.field2379[var48] = arg3.method755() ? var45.field6871 : var45.field6869;
                                class45.field648[var48] = var45.field6868;
                                if (class538.field7890[var48] == var45.field6883) {
                                    class468.field7006[var48] = class311.method1956(class468.field7006[var48], 16);
                                } else {
                                    class468.field7006[var48] = 16;
                                }
                                class538.field7890[var48] = var45.field6883;
                            }
                            var49--;
                            var48++;
                        }
                        if (!var15[arg7 + 2 & 0x3]) {
                            arg2[2] = class294.field4295[var46][class519.method3092(3, var47)];
                        }
                    } else if (!var15[arg7 + 2 & 0x3]) {
                        arg2[2] = class384.field5835[var46][class519.method3092(3, var47)];
                    }
                }
            }
        }
        if (arg4 > -114) {
            field3657 = null;
        }
        if (arg12 > 0) {
            int var52 = arg6[arg12 - 1][arg1] & 0xFF;
            if (var52 > 0) {
                class459 var53 = this.field3649.method907(22599, var52 - 1);
                if (var53.field6864 != -1) {
                    byte var54 = arg0[arg12 - 1][arg1];
                    byte var55 = arg8[arg12 - 1][arg1];
                    if (var53.field6873) {
                        int var56 = 6;
                        int var57 = var55 * 2 + 4;
                        int var58 = class355.method2282((byte) -65, var53, arg3);
                        for (int var59 = 0; var59 < 3; var59++) {
                            var56 &= 0x7;
                            var57 &= 0x7;
                            if (class83.field1207[var54][var57] && class538.field7890[var56] <= var53.field6883) {
                                class448.field6739[var56] = var53.field6864;
                                class535.field7865[var56] = var58;
                                class178.field2379[var56] = arg3.method755() ? var53.field6871 : var53.field6869;
                                class45.field648[var56] = var53.field6868;
                                if (class538.field7890[var56] == var53.field6883) {
                                    class468.field7006[var56] = class311.method1956(class468.field7006[var56], 8);
                                } else {
                                    class468.field7006[var56] = 8;
                                }
                                class538.field7890[var56] = var53.field6883;
                            }
                            var57--;
                            var56++;
                        }
                        if (!var15[arg7 + 3 & 0x3]) {
                            arg2[3] = class294.field4295[var54][class519.method3092(var55 + 1, 3)];
                        }
                    } else if (!var15[arg7 + 3 & 0x3]) {
                        arg2[3] = class384.field5835[var54][class519.method3092(3, var55 + 1)];
                    }
                }
            }
        }
        if (arg13 - 1 > arg12) {
            int var60 = arg6[arg12 + 1][arg1] & 0xFF;
            if (var60 > 0) {
                class459 var61 = this.field3649.method907(22599, var60 - 1);
                if (var61.field6864 != -1) {
                    byte var62 = arg0[arg12 + 1][arg1];
                    byte var63 = arg8[arg12 + 1][arg1];
                    if (var61.field6873) {
                        int var64 = 4;
                        int var65 = var63 * 2 + 6;
                        int var66 = class355.method2282((byte) -59, var61, arg3);
                        for (int var67 = 0; var67 < 3; var67++) {
                            var65 &= 0x7;
                            var64 &= 0x7;
                            if (class83.field1207[var62][var65] && class538.field7890[var64] <= var61.field6883) {
                                class448.field6739[var64] = var61.field6864;
                                class535.field7865[var64] = var66;
                                class178.field2379[var64] = arg3.method755() ? var61.field6871 : var61.field6869;
                                class45.field648[var64] = var61.field6868;
                                if (class538.field7890[var64] == var61.field6883) {
                                    class468.field7006[var64] = class311.method1956(class468.field7006[var64], 4);
                                } else {
                                    class468.field7006[var64] = 4;
                                }
                                class538.field7890[var64] = var61.field6883;
                            }
                            var64--;
                            var65++;
                        }
                        if (!var15[arg7 + 1 & 0x3]) {
                            arg2[1] = class294.field4295[var62][class519.method3092(3, var63 + 3)];
                        }
                    } else if (!var15[arg7 + 1 & 0x3]) {
                        arg2[1] = class384.field5835[var62][class519.method3092(var63 + 3, 3)];
                    }
                }
            }
        }
        if (arg5 == null) {
            return;
        }
        int var68 = class355.method2282((byte) -32, arg5, arg3);
        if (!arg5.field6873) {
            return;
        }
        for (int var69 = 0; var69 < 8; var69++) {
            int var70 = var69 - arg7 * 2 & 0x7;
            if (class83.field1207[arg11][var69] && class538.field7890[var70] <= arg5.field6883) {
                class448.field6739[var70] = arg5.field6864;
                class535.field7865[var70] = var68;
                class178.field2379[var70] = arg3.method755() ? arg5.field6871 : arg5.field6869;
                class45.field648[var70] = arg5.field6868;
                if (class538.field7890[var70] == arg5.field6883) {
                    class468.field7006[var70] = class311.method1956(class468.field7006[var70], 2);
                } else {
                    class468.field7006[var70] = 2;
                }
                class538.field7890[var70] = arg5.field6883;
            }
        }
        return;
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(IIIZLtj;Lta;)V")
    public class259(int arg0, int arg1, int arg2, boolean arg3, class134 arg4, class144 arg5) {
        this.field3639 = arg2;
        this.field3653 = arg0;
        this.field3656 = arg5;
        this.field3637 = arg1;
        this.field3649 = arg4;
        this.field3647 = arg3;
        this.field3645 = new int[this.field3653][this.field3637 + 1][this.field3639 + 1];
        this.field3643 = new byte[this.field3653][this.field3637][this.field3639];
        this.field3640 = new byte[this.field3653][this.field3637][this.field3639];
        this.field3650 = new byte[this.field3653][this.field3637][this.field3639];
        this.field3644 = new byte[this.field3653][this.field3637][this.field3639];
        this.field3652 = new byte[this.field3653][this.field3637 + 1][this.field3639 + 1];
    }

    static {
        new class446("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
    }
}
