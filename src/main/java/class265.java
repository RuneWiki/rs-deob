import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class265 {

    @OriginalMember(owner = "client!tr", name = "g", descriptor = "[I")
    private int[] field3756 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

    @OriginalMember(owner = "client!tr", name = "f", descriptor = "[I")
    private int[] field3755 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

    @OriginalMember(owner = "client!tr", name = "z", descriptor = "Z")
    public boolean field3775;

    @OriginalMember(owner = "client!tr", name = "s", descriptor = "Lada;")
    private class149 field3768;

    @OriginalMember(owner = "client!tr", name = "y", descriptor = "I")
    public int field3774;

    @OriginalMember(owner = "client!tr", name = "j", descriptor = "I")
    public int field3759;

    @OriginalMember(owner = "client!tr", name = "p", descriptor = "Lc;")
    private class169 field3765;

    @OriginalMember(owner = "client!tr", name = "q", descriptor = "I")
    public int field3766;

    @OriginalMember(owner = "client!tr", name = "m", descriptor = "[[[B")
    private byte[][][] field3762;

    @OriginalMember(owner = "client!tr", name = "o", descriptor = "[[[B")
    private byte[][][] field3764;

    @OriginalMember(owner = "client!tr", name = "h", descriptor = "[[[B")
    private byte[][][] field3757;

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "[[[I")
    public int[][][] field3751;

    @OriginalMember(owner = "client!tr", name = "k", descriptor = "[[[B")
    public byte[][][] field3760;

    @OriginalMember(owner = "client!tr", name = "A", descriptor = "[[[B")
    private byte[][][] field3776;

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!tr", name = "d", descriptor = "I")
    public static int field3753;

    @OriginalMember(owner = "client!tr", name = "e", descriptor = "I")
    public static int field3754;

    @OriginalMember(owner = "client!tr", name = "i", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!tr", name = "l", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!tr", name = "n", descriptor = "I")
    public static int field3763;

    @OriginalMember(owner = "client!tr", name = "r", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!tr", name = "t", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!tr", name = "u", descriptor = "I")
    public static int field3770;

    @OriginalMember(owner = "client!tr", name = "v", descriptor = "I")
    public static int field3771;

    @OriginalMember(owner = "client!tr", name = "w", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!tr", name = "B", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!tr", name = "C", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "Lkm;")
    public static class322 field3750;

    @OriginalMember(owner = "client!tr", name = "x", descriptor = "[[[B")
    public byte[][][] field3773;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIIIII)V")
    private final void method1610(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != 512) {
            return;
        }
        for (int var7 = arg5; var7 < (arg4 + arg5); var7++) {
            for (int var10 = arg3; var10 < arg0 + arg3; var10++) {
                if (var10 >= 0 && var10 < this.field3774 && var7 >= 0 && var7 < this.field3759) {
                    this.field3751[arg2][var10][var7] = arg2 <= 0 ? 0 : this.field3751[arg2 - 1][var10][var7] - 960;
                }
            }
        }
        field3767++;
        if (arg3 > 0 && this.field3774 > arg3) {
            for (int var8 = arg5 + 1; var8 < arg4 + arg5; var8++) {
                if (var8 >= 0 && this.field3759 > var8) {
                    this.field3751[arg2][arg3][var8] = this.field3751[arg2][arg3 - 1][var8];
                }
            }
        }
        if (arg5 > 0 && arg5 < this.field3759) {
            for (int var9 = arg3 + 1; var9 < (arg0 + arg3); var9++) {
                if (var9 >= 0 && var9 < this.field3774) {
                    this.field3751[arg2][var9][arg5] = this.field3751[arg2][var9][arg5 - 1];
                }
            }
        }
        if (arg3 < 0 || arg5 < 0 || this.field3774 <= arg3 || this.field3759 <= arg5) {
            return;
        }
        if (arg2 == 0) {
            if (arg3 > 0 && this.field3751[arg2][arg3 - 1][arg5] != 0) {
                this.field3751[arg2][arg3][arg5] = this.field3751[arg2][arg3 - 1][arg5];
                return;
            }
            if (arg5 <= 0 || this.field3751[arg2][arg3][arg5 - 1] == 0) {
                if (arg3 > 0 && arg5 > 0 && this.field3751[arg2][arg3 - 1][arg5 - 1] != 0) {
                    this.field3751[arg2][arg3][arg5] = this.field3751[arg2][arg3 - 1][arg5 - 1];
                    return;
                }
                return;
            }
            this.field3751[arg2][arg3][arg5] = this.field3751[arg2][arg3][arg5 - 1];
        } else if (arg3 <= 0 || this.field3751[arg2 - 1][arg3 - 1][arg5] == this.field3751[arg2][arg3 - 1][arg5]) {
            if (arg5 > 0 && this.field3751[arg2 - 1][arg3][arg5 - 1] != this.field3751[arg2][arg3][arg5 - 1]) {
                this.field3751[arg2][arg3][arg5] = this.field3751[arg2][arg3][arg5 - 1];
                return;
            }
            if (arg3 > 0 && arg5 > 0 && this.field3751[arg2 - 1][arg3 - 1][arg5 - 1] != this.field3751[arg2][arg3 - 1][arg5 - 1]) {
                this.field3751[arg2][arg3][arg5] = this.field3751[arg2][arg3 - 1][arg5 - 1];
                return;
            }
        } else {
            this.field3751[arg2][arg3][arg5] = this.field3751[arg2][arg3 - 1][arg5];
            return;
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIIII)V")
    public final void method1611(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3772++;
        for (int var6 = arg2; var6 < this.field3766; var6++) {
            this.method1610(arg3, arg2 ^ 0x200, var6, arg0, arg4, arg1);
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "([Liaa;[[[ILoa;I)V")
    public final void method1612(class455[] arg0, int[][][] arg1, class638 arg2, int arg3) {
        if (!this.field3775) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field3774; var6++) {
                    for (int var7 = 0; var7 < this.field3759; var7++) {
                        if ((class246.field3501[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class246.field3501[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg0[var8].method2617(var7, var6, arg3 + 2097152);
                            }
                        }
                    }
                }
            }
        }
        field3753++;
        for (int var9 = arg3; var9 < this.field3766; var9++) {
            int var10 = 0;
            int var11 = 0;
            if (!this.field3775) {
                if (class644.field9150) {
                    var11 |= 0x8;
                }
                if (class335.field4900) {
                    var10 |= 0x2;
                }
                if (class333.field4888 != 0) {
                    var10 |= 0x1;
                    if (var9 == 0 | class324.field4791) {
                        var11 |= 0x10;
                    }
                }
            }
            if (class335.field4900) {
                var11 |= 0x7;
            }
            if (!class658.field9260) {
                var11 |= 0x20;
            }
            int[][] var12 = arg1 == null || arg1.length <= var9 ? this.field3751[var9] : arg1[var9];
            class195.method1317(var9, arg2.method383(this.field3774, this.field3759, this.field3751[var9], var12, 512, var10, var11));
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IBII[Liaa;IILjr;II)V")
    public final void method1613(int arg0, byte arg1, int arg2, int arg3, class455[] arg4, int arg5, int arg6, class96 arg7, int arg8, int arg9) {
        field3754++;
        int var11 = (arg2 & 0x7) * 8;
        int var12 = (arg5 & 0x7) * 8;
        if (!this.field3775) {
            class455 var13 = arg4[arg3];
            for (int var14 = 0; var14 < 8; var14++) {
                for (int var15 = 0; var15 < 8; var15++) {
                    int var16 = arg6 + class315.method1929(var14 & 0x7, var15 & 0x7, 65535, arg8);
                    int var17 = arg0 + class677.method3742((byte) 58, var14 & 0x7, var15 & 0x7, arg8);
                    if (var16 > 0 && this.field3774 - 1 > var16 && var17 > 0 && var17 < (this.field3759 - 1)) {
                        var13.method2616(false, var16, var17);
                    }
                }
            }
        }
        int var18 = arg2 & 0x1FFFFFF8 << 3;
        int var19 = arg5 & 0x1FFFFFF8 << 3;
        byte var20 = 0;
        byte var21 = 0;
        if (arg8 == 1) {
            var21 = 1;
        } else if (arg8 == 2) {
            var20 = 1;
            var21 = 1;
        } else if (arg8 == 3) {
            var20 = 1;
        }
        int var22 = -11 % ((11 - arg1) / 46);
        for (int var23 = 0; var23 < this.field3766; var23++) {
            for (int var24 = 0; var24 < 64; var24++) {
                for (int var25 = 0; var25 < 64; var25++) {
                    if (arg9 == var23 && var11 <= var24 && (var11 + 8) >= var24 && var12 <= var25 && var12 + 8 >= var25) {
                        int var26;
                        int var27;
                        if ((var11 + 8) == var24 || var12 + 8 == var25) {
                            if (arg8 == 0) {
                                var26 = arg6 + var24 - var11;
                                var27 = arg0 + var25 - var12;
                            } else if (arg8 == 1) {
                                var26 = arg6 + var25 - var12;
                                var27 = -var24 - (-var11 - (arg0 + 8));
                            } else if (arg8 == 2) {
                                var27 = var12 + arg0 + 8 - var25;
                                var26 = var11 + arg6 + 8 - var24;
                            } else {
                                var26 = arg6 - var25 - (-var12 - 8);
                                var27 = arg0 + var24 - var11;
                            }
                            this.method1618(arg3, (byte) 104, 0, arg7, 0, var19 + var25, 0, var26, true, var18 + var24, var27);
                        } else {
                            var26 = class315.method1929(var24 & 0x7, var25 & 0x7, 65535, arg8) + arg6;
                            var27 = arg0 + class677.method3742((byte) 58, var24 & 0x7, var25 & 0x7, arg8);
                            this.method1618(arg3, (byte) 66, var21, arg7, arg8, var19 + var25, var20, var26, false, var18 + var24, var27);
                        }
                        if (var24 == 63 || var25 == 63) {
                            byte var28 = 1;
                            if (var24 == 63 && var25 == 63) {
                                var28 = 3;
                            }
                            for (int var29 = 0; var29 < var28; var29++) {
                                int var30 = var24;
                                int var31 = var25;
                                if (var29 == 0) {
                                    var30 = var24 == 63 ? 64 : var24;
                                    var31 = var25 == 63 ? 64 : var25;
                                } else if (var29 == 1) {
                                    var30 = 64;
                                } else if (var29 == 2) {
                                    var31 = 64;
                                }
                                int var32;
                                int var33;
                                if (arg8 == 0) {
                                    var32 = var31 - (var12 - arg0);
                                    var33 = var30 + arg6 - var11;
                                } else if (arg8 == 1) {
                                    var32 = var11 + arg0 + 8 - var30;
                                    var33 = var31 + arg6 - var12;
                                } else if (arg8 == 2) {
                                    var32 = var12 + arg0 + 8 - var31;
                                    var33 = arg6 + 8 - (-var11 + var30);
                                } else {
                                    var32 = var30 - (var11 - arg0);
                                    var33 = var12 + (arg6 - -8) - var31;
                                }
                                if (var33 >= 0 && this.field3774 > var33 && var32 >= 0 && var32 < this.field3759) {
                                    this.field3751[arg3][var33][var32] = this.field3751[arg3][var20 + var26][var21 + var27];
                                }
                            }
                        }
                    } else {
                        this.method1618(0, (byte) -103, 0, arg7, 0, 0, 0, -1, false, 0, -1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lon;[ZII[[BII[[B[[BIILjp;Loa;I)V")
    private final void method1614(class305 arg0, boolean[] arg1, int arg2, int arg3, byte[][] arg4, int arg5, int arg6, byte[][] arg7, byte[][] arg8, int arg9, int arg10, class323 arg11, class638 arg12, int arg13) {
        if (arg2 != -3917) {
            return;
        }
        field3769++;
        boolean[] var15 = arg11 != null && arg11.field4774 ? class348.field5012[arg5] : class397.field5518[arg5];
        if (arg3 > 0) {
            if (arg13 > 0) {
                int var16 = arg7[arg13 - 1][arg3 - 1] & 0xFF;
                if (var16 > 0) {
                    class323 var17 = this.field3768.method1046(-104, var16 - 1);
                    if (var17.field4767 != -1 && var17.field4774) {
                        byte var18 = arg4[arg13 - 1][arg3 - 1];
                        int var19 = arg8[arg13 - 1][arg3 - 1] * 2 + 4 & 0x7;
                        int var20 = class487.method2743(arg12, false, var17);
                        if (class206.field3051[var18][var19]) {
                            class226.field3252[0] = var17.field4767;
                            class327.field4836[0] = var20;
                            class78.field1072[0] = arg12.method385() ? var17.field4775 : var17.field4769;
                            class186.field2743[0] = var17.field4770;
                            class14.field219[0] = var17.field4761;
                            class603.field8367[0] = 256;
                        }
                    }
                }
            }
            if (arg13 < arg6 - 1) {
                int var21 = arg7[arg13 + 1][arg3 - 1] & 0xFF;
                if (var21 > 0) {
                    class323 var22 = this.field3768.method1046(-42, var21 - 1);
                    if (var22.field4767 != -1 && var22.field4774) {
                        byte var23 = arg4[arg13 + 1][arg3 - 1];
                        int var24 = arg8[arg13 + 1][arg3 - 1] * 2 + 6 & 0x7;
                        int var25 = class487.method2743(arg12, false, var22);
                        if (class206.field3051[var23][var24]) {
                            class226.field3252[2] = var22.field4767;
                            class327.field4836[2] = var25;
                            class78.field1072[2] = arg12.method385() ? var22.field4775 : var22.field4769;
                            class186.field2743[2] = var22.field4770;
                            class14.field219[2] = var22.field4761;
                            class603.field8367[2] = 512;
                        }
                    }
                }
            }
        }
        if (arg10 - 1 > arg3) {
            if (arg13 > 0) {
                int var26 = arg7[arg13 - 1][arg3 + 1] & 0xFF;
                if (var26 > 0) {
                    class323 var27 = this.field3768.method1046(arg2 ^ 0xF20, var26 - 1);
                    if (var27.field4767 != -1 && var27.field4774) {
                        byte var28 = arg4[arg13 - 1][arg3 + 1];
                        int var29 = arg8[arg13 - 1][arg3 + 1] * 2 + 2 & 0x7;
                        int var30 = class487.method2743(arg12, false, var27);
                        if (class206.field3051[var28][var29]) {
                            class226.field3252[6] = var27.field4767;
                            class327.field4836[6] = var30;
                            class78.field1072[6] = arg12.method385() ? var27.field4775 : var27.field4769;
                            class186.field2743[6] = var27.field4770;
                            class14.field219[6] = var27.field4761;
                            class603.field8367[6] = 64;
                        }
                    }
                }
            }
            if (arg6 - 1 > arg13) {
                int var31 = arg7[arg13 + 1][arg3 + 1] & 0xFF;
                if (var31 > 0) {
                    class323 var32 = this.field3768.method1046(-127, var31 - 1);
                    if (var32.field4767 != -1 && var32.field4774) {
                        byte var33 = arg4[arg13 + 1][arg3 + 1];
                        int var34 = arg8[arg13 + 1][arg3 + 1] * 2 & 0x7;
                        int var35 = class487.method2743(arg12, false, var32);
                        if (class206.field3051[var33][var34]) {
                            class226.field3252[4] = var32.field4767;
                            class327.field4836[4] = var35;
                            class78.field1072[4] = arg12.method385() ? var32.field4775 : var32.field4769;
                            class186.field2743[4] = var32.field4770;
                            class14.field219[4] = var32.field4761;
                            class603.field8367[4] = 128;
                        }
                    }
                }
            }
        }
        if (arg3 > 0) {
            int var36 = arg7[arg13][arg3 - 1] & 0xFF;
            if (var36 > 0) {
                class323 var37 = this.field3768.method1046(-57, var36 - 1);
                if (var37.field4767 != -1) {
                    byte var38 = arg4[arg13][arg3 - 1];
                    byte var39 = arg8[arg13][arg3 - 1];
                    if (var37.field4774) {
                        int var40 = 2;
                        int var41 = (var39 * 2) + 4;
                        int var42 = class487.method2743(arg12, false, var37);
                        for (int var43 = 0; var43 < 3; var43++) {
                            var41 &= 0x7;
                            var40 &= 0x7;
                            if (class206.field3051[var38][var41] && var37.field4761 >= class14.field219[var40]) {
                                class226.field3252[var40] = var37.field4767;
                                class327.field4836[var40] = var42;
                                class78.field1072[var40] = arg12.method385() ? var37.field4775 : var37.field4769;
                                class186.field2743[var40] = var37.field4770;
                                if (class14.field219[var40] == var37.field4761) {
                                    class603.field8367[var40] = class266.method1624(class603.field8367[var40], 32);
                                } else {
                                    class603.field8367[var40] = 32;
                                }
                                class14.field219[var40] = var37.field4761;
                            }
                            var40--;
                            var41++;
                        }
                        if (!var15[arg9 & 0x3]) {
                            arg1[0] = class348.field5012[var38][class249.method1537(var39 + 2, 3)];
                        }
                    } else if (!var15[arg9 & 0x3]) {
                        arg1[0] = class397.field5518[var38][class249.method1537(3, var39 + 2)];
                    }
                }
            }
        }
        if (arg3 < (arg10 - 1)) {
            int var44 = arg7[arg13][arg3 + 1] & 0xFF;
            if (var44 > 0) {
                class323 var45 = this.field3768.method1046(-88, var44 - 1);
                if (var45.field4767 != -1) {
                    byte var46 = arg4[arg13][arg3 + 1];
                    byte var47 = arg8[arg13][arg3 + 1];
                    if (var45.field4774) {
                        int var48 = 4;
                        int var49 = (var47 * 2) + 2;
                        int var50 = class487.method2743(arg12, false, var45);
                        for (int var51 = 0; var51 < 3; var51++) {
                            var48 &= 0x7;
                            var49 &= 0x7;
                            if (class206.field3051[var46][var49] && var45.field4761 >= class14.field219[var48]) {
                                class226.field3252[var48] = var45.field4767;
                                class327.field4836[var48] = var50;
                                class78.field1072[var48] = arg12.method385() ? var45.field4775 : var45.field4769;
                                class186.field2743[var48] = var45.field4770;
                                if (class14.field219[var48] == var45.field4761) {
                                    class603.field8367[var48] = class266.method1624(class603.field8367[var48], 16);
                                } else {
                                    class603.field8367[var48] = 16;
                                }
                                class14.field219[var48] = var45.field4761;
                            }
                            var49--;
                            var48++;
                        }
                        if (!var15[arg9 + 2 & 0x3]) {
                            arg1[2] = class348.field5012[var46][class249.method1537(3, var47)];
                        }
                    } else if (!var15[arg9 + 2 & 0x3]) {
                        arg1[2] = class397.field5518[var46][class249.method1537(var47, 3)];
                    }
                }
            }
        }
        if (arg13 > 0) {
            int var52 = arg7[arg13 - 1][arg3] & 0xFF;
            if (var52 > 0) {
                class323 var53 = this.field3768.method1046(-110, var52 - 1);
                if (var53.field4767 != -1) {
                    byte var54 = arg4[arg13 - 1][arg3];
                    byte var55 = arg8[arg13 - 1][arg3];
                    if (var53.field4774) {
                        int var56 = 6;
                        int var57 = var55 * 2 + 4;
                        int var58 = class487.method2743(arg12, false, var53);
                        for (int var59 = 0; var59 < 3; var59++) {
                            var56 &= 0x7;
                            var57 &= 0x7;
                            if (class206.field3051[var54][var57] && var53.field4761 >= class14.field219[var56]) {
                                class226.field3252[var56] = var53.field4767;
                                class327.field4836[var56] = var58;
                                class78.field1072[var56] = arg12.method385() ? var53.field4775 : var53.field4769;
                                class186.field2743[var56] = var53.field4770;
                                if (class14.field219[var56] == var53.field4761) {
                                    class603.field8367[var56] = class266.method1624(class603.field8367[var56], 8);
                                } else {
                                    class603.field8367[var56] = 8;
                                }
                                class14.field219[var56] = var53.field4761;
                            }
                            var56++;
                            var57--;
                        }
                        if (!var15[arg9 + 3 & 0x3]) {
                            arg1[3] = class348.field5012[var54][class249.method1537(3, var55 + 1)];
                        }
                    } else if (!var15[arg9 + 3 & 0x3]) {
                        arg1[3] = class397.field5518[var54][class249.method1537(var55 + 1, 3)];
                    }
                }
            }
        }
        if (arg6 - 1 > arg13) {
            int var60 = arg7[arg13 + 1][arg3] & 0xFF;
            if (var60 > 0) {
                class323 var61 = this.field3768.method1046(-34, var60 - 1);
                if (var61.field4767 != -1) {
                    byte var62 = arg4[arg13 + 1][arg3];
                    byte var63 = arg8[arg13 + 1][arg3];
                    if (var61.field4774) {
                        int var64 = 4;
                        int var65 = (var63 * 2) + 6;
                        int var66 = class487.method2743(arg12, false, var61);
                        for (int var67 = 0; var67 < 3; var67++) {
                            var64 &= 0x7;
                            var65 &= 0x7;
                            if (class206.field3051[var62][var65] && class14.field219[var64] <= var61.field4761) {
                                class226.field3252[var64] = var61.field4767;
                                class327.field4836[var64] = var66;
                                class78.field1072[var64] = arg12.method385() ? var61.field4775 : var61.field4769;
                                class186.field2743[var64] = var61.field4770;
                                if (class14.field219[var64] == var61.field4761) {
                                    class603.field8367[var64] = class266.method1624(class603.field8367[var64], 4);
                                } else {
                                    class603.field8367[var64] = 4;
                                }
                                class14.field219[var64] = var61.field4761;
                            }
                            var64--;
                            var65++;
                        }
                        if (!var15[arg9 + 1 & 0x3]) {
                            arg1[1] = class348.field5012[var62][class249.method1537(3, var63 + 3)];
                        }
                    } else if (!var15[arg9 + 1 & 0x3]) {
                        arg1[1] = class397.field5518[var62][class249.method1537(var63 + 3, 3)];
                    }
                }
            }
        }
        if (arg11 == null) {
            return;
        }
        int var68 = class487.method2743(arg12, false, arg11);
        if (!arg11.field4774) {
            return;
        }
        for (int var69 = 0; var69 < 8; var69++) {
            int var70 = var69 - (arg9 * 2) & 0x7;
            if (class206.field3051[arg5][var69] && class14.field219[var70] <= arg11.field4761) {
                class226.field3252[var70] = arg11.field4767;
                class327.field4836[var70] = var68;
                class78.field1072[var70] = arg12.method385() ? arg11.field4775 : arg11.field4769;
                class186.field2743[var70] = arg11.field4770;
                if (class14.field219[var70] == arg11.field4761) {
                    class603.field8367[var70] = class266.method1624(class603.field8367[var70], 2);
                } else {
                    class603.field8367[var70] = 2;
                }
                class14.field219[var70] = arg11.field4761;
            }
        }
        return;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "([[ILoa;Ld;BLd;Ld;I)V")
    private final void method1615(int[][] arg0, class638 arg1, class136 arg2, byte arg3, class136 arg4, class136 arg5, int arg6) {
        field3752++;
        byte[][] var8 = this.field3776[arg6];
        byte[][] var9 = this.field3762[arg6];
        int var10 = -81 % ((arg3 + 57) / 38);
        byte[][] var11 = this.field3764[arg6];
        byte[][] var12 = this.field3757[arg6];
        for (int var13 = 0; var13 < this.field3774; var13++) {
            int var14 = this.field3774 - 1 <= var13 ? var13 : var13 + 1;
            for (int var15 = 0; var15 < this.field3759; var15++) {
                int var16 = var15 < this.field3759 - 1 ? var15 + 1 : var15;
                if (class174.field2606 == -1 || class269.method1632(var13, class174.field2606, (byte) 48, var15, arg6)) {
                    boolean var17 = false;
                    boolean var18 = false;
                    boolean[] var19 = new boolean[4];
                    int var20 = var8[var13][var15];
                    int var21 = var9[var13][var15];
                    int var22 = var12[var13][var15] & 0xFF;
                    int var23 = var11[var13][var15] & 0xFF;
                    int var24 = var11[var13][var16] & 0xFF;
                    int var25 = var11[var14][var16] & 0xFF;
                    int var26 = var11[var14][var15] & 0xFF;
                    if (var22 != 0 || var23 != 0) {
                        class323 var27 = var22 == 0 ? null : this.field3768.method1046(-104, var22 - 1);
                        if (var20 == 0 && var27 == null) {
                            var20 = 12;
                        }
                        class305 var28 = var23 == 0 ? null : this.field3765.method1162(1, var23 - 1);
                        class323 var29 = var27;
                        if (var27 != null) {
                            if (var27.field4767 == -1 && var27.field4780 == -1) {
                                var29 = var27;
                                var27 = null;
                            } else if (var28 != null && var20 != 0) {
                                var18 = var27.field4774;
                            }
                        }
                        if ((var20 == 0 || var20 == 12) && var13 > 0 && var15 > 0 && this.field3774 > var13 && this.field3759 > var15) {
                            byte var30 = 0;
                            byte var31 = 0;
                            byte var32 = 0;
                            int var33 = var30 + (var11[var13 - 1][var15 - 1] == var23 ? 1 : -1);
                            int var34 = var31 + (var11[var14][var15 - 1] == var23 ? 1 : -1);
                            int var35 = var32 + (var11[var14][var16] == var23 ? 1 : -1);
                            byte var36 = 0;
                            int var37 = var36 + (var11[var13 - 1][var16] == var23 ? 1 : -1);
                            if (var11[var13][var15 - 1] == var23) {
                                var34++;
                                var33++;
                            } else {
                                var33--;
                                var34--;
                            }
                            if (var11[var14][var15] == var23) {
                                var35++;
                                var34++;
                            } else {
                                var34--;
                                var35--;
                            }
                            if (var11[var13][var16] == var23) {
                                var37++;
                                var35++;
                            } else {
                                var37--;
                                var35--;
                            }
                            if (var11[var13 - 1][var15] == var23) {
                                var33++;
                                var37++;
                            } else {
                                var37--;
                                var33--;
                            }
                            int var38 = var33 - var35;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            int var39 = var34 - var37;
                            if (var39 < 0) {
                                var39 = -var39;
                            }
                            if (var38 == var39) {
                                var38 = arg4.method273(var13, var15) - arg4.method273(var14, var16);
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                                var39 = arg4.method273(var14, var15) - arg4.method273(var13, var16);
                                if (var39 < 0) {
                                    var39 = -var39;
                                }
                            }
                            var21 = var38 < var39 ? 1 : 0;
                        }
                        for (int var40 = 0; var40 < 13; var40++) {
                            class14.field219[var40] = -1;
                            class603.field8367[var40] = 1;
                        }
                        boolean[] var41 = var27 != null && var27.field4774 ? class348.field5012[var20] : class397.field5518[var20];
                        this.method1614(var28, var19, -3917, var15, var8, var20, this.field3774, var12, var9, var21, this.field3759, var27, arg1, var13);
                        boolean var42 = var27 != null && var27.field4780 != var27.field4767;
                        if (!var42) {
                            for (int var43 = 0; var43 < 8; var43++) {
                                if (class14.field219[var43] >= 0 && class327.field4836[var43] != class226.field3252[var43]) {
                                    var42 = true;
                                    break;
                                }
                            }
                        }
                        if (!var41[var21 + 1 & 0x3]) {
                            var19[1] = class106.method802(var19[1], class249.method1537(class603.field8367[4], class603.field8367[2]) == 0);
                        }
                        if (!var41[var21 + 3 & 0x3]) {
                            var19[3] = class106.method802(var19[3], class249.method1537(class603.field8367[0], class603.field8367[6]) == 0);
                        }
                        if (!var41[var21 & 0x3]) {
                            var19[0] = class106.method802(var19[0], class249.method1537(class603.field8367[0], class603.field8367[2]) == 0);
                        }
                        if (!var41[var21 + 2 & 0x3]) {
                            var19[2] = class106.method802(var19[2], class249.method1537(class603.field8367[6], class603.field8367[4]) == 0);
                        }
                        if (!var18 && (var20 == 0 || var20 == 12)) {
                            if (var19[0] && !var19[1] && !var19[2] && var19[3]) {
                                var21 = 0;
                                var19[0] = var19[3] = false;
                                var20 = var20 == 0 ? 13 : 14;
                            } else if (var19[0] && var19[1] && !var19[2] && !var19[3]) {
                                var20 = var20 == 0 ? 13 : 14;
                                var19[0] = var19[1] = false;
                                var21 = 3;
                            } else if (!var19[0] && var19[1] && var19[2] && !var19[3]) {
                                var20 = var20 == 0 ? 13 : 14;
                                var21 = 2;
                                var19[1] = var19[2] = false;
                            } else if (!var19[0] && !var19[1] && var19[2] && var19[3]) {
                                var19[2] = var19[3] = false;
                                var20 = var20 == 0 ? 13 : 14;
                                var21 = 1;
                            }
                        }
                        boolean var44 = !var18 && !var19[0] && !var19[2] && !var19[1] && !var19[3];
                        int[] var45 = null;
                        int var46;
                        int[] var47;
                        int[] var48;
                        int var49;
                        int[] var50;
                        if (var44) {
                            var50 = class551.field7459[var20];
                            var48 = class230.field3281[var20];
                            var47 = class245.field3494[var20];
                            var46 = var27 == null ? 0 : class202.field2972[var20];
                            var49 = var28 == null ? 0 : class418.field5901[var20];
                        } else if (var18) {
                            var49 = var28 == null ? 0 : class202.field2970[var20];
                            var48 = class487.field6766[var20];
                            var50 = class690.field9702[var20];
                            var45 = class434.field6137[var20];
                            var47 = class228.field3266[var20];
                            var46 = var27 == null ? 0 : class188.field2781[var20];
                        } else {
                            var46 = var27 == null ? 0 : class83.field1155[var20];
                            var47 = class289.field4055[var20];
                            var45 = class81.field1134[var20];
                            var48 = class101.field1378[var20];
                            var49 = var28 == null ? 0 : class383.field5371[var20];
                            var50 = class305.field4500[var20];
                        }
                        int var51 = var46 + var49;
                        if (var51 <= 0) {
                            class509.method2833(arg6, var13, var15);
                        } else {
                            if (var19[0]) {
                                var51++;
                            }
                            if (var19[2]) {
                                var51++;
                            }
                            if (var19[1]) {
                                var51++;
                            }
                            if (var19[3]) {
                                var51++;
                            }
                            int var52 = 0;
                            int var53 = 0;
                            int var54 = var51 * 3;
                            int[] var55 = var42 ? new int[var54] : null;
                            int[] var56 = new int[var54];
                            int[] var57 = new int[var54];
                            int[] var58 = new int[var54];
                            int[] var59 = new int[var54];
                            int[] var60 = new int[var54];
                            int[] var61 = arg5 == null ? null : new int[var54];
                            int[] var62 = arg5 == null && arg2 == null ? null : new int[var54];
                            int var63 = -1;
                            int var64 = -1;
                            int var65 = 256;
                            if (var27 != null) {
                                var63 = var27.field4767;
                                var64 = arg1.method385() ? var27.field4775 : var27.field4769;
                                var65 = var27.field4770;
                                int var66 = class487.method2743(arg1, false, var27);
                                for (int var67 = 0; var67 < var46; var67++) {
                                    boolean var98 = false;
                                    byte var99;
                                    if (var19[-var21 & 0x3] && var45[0] == var52) {
                                        class506.field6930[0] = var47[var52];
                                        class506.field6930[1] = 1;
                                        class506.field6930[2] = var48[var52];
                                        class506.field6930[3] = 1;
                                        class506.field6930[4] = var50[var52];
                                        class506.field6930[5] = var48[var52];
                                        var99 = 6;
                                    } else if (var19[2 - var21 & 0x3] && var45[2] == var52) {
                                        class506.field6930[0] = var47[var52];
                                        class506.field6930[1] = 5;
                                        class506.field6930[2] = var48[var52];
                                        class506.field6930[3] = 5;
                                        class506.field6930[4] = var50[var52];
                                        var99 = 6;
                                        class506.field6930[5] = var48[var52];
                                    } else if (var19[1 - var21 & 0x3] && var45[1] == var52) {
                                        class506.field6930[0] = var47[var52];
                                        class506.field6930[1] = 3;
                                        class506.field6930[2] = var48[var52];
                                        class506.field6930[3] = 3;
                                        class506.field6930[4] = var50[var52];
                                        var99 = 6;
                                        class506.field6930[5] = var48[var52];
                                    } else if (var19[3 - var21 & 0x3] && var45[3] == var52) {
                                        class506.field6930[0] = var47[var52];
                                        class506.field6930[1] = 7;
                                        class506.field6930[2] = var48[var52];
                                        class506.field6930[3] = 7;
                                        class506.field6930[4] = var50[var52];
                                        var99 = 6;
                                        class506.field6930[5] = var48[var52];
                                    } else {
                                        class506.field6930[0] = var47[var52];
                                        class506.field6930[1] = var50[var52];
                                        class506.field6930[2] = var48[var52];
                                        var99 = 3;
                                    }
                                    var52++;
                                    for (int var100 = 0; var100 < var99; var100++) {
                                        int var101 = class506.field6930[var100];
                                        int var102 = var101 - (var21 * 2) & 0x7;
                                        int var103 = this.field3755[var101];
                                        int var104 = this.field3756[var101];
                                        int var105;
                                        int var106;
                                        if (var21 == 1) {
                                            var106 = var104;
                                            var105 = 512 - var103;
                                        } else if (var21 == 2) {
                                            var105 = 512 - var104;
                                            var106 = 512 - var103;
                                        } else if (var21 == 3) {
                                            var105 = var103;
                                            var106 = 512 - var104;
                                        } else {
                                            var105 = var104;
                                            var106 = var103;
                                        }
                                        var56[var53] = var106;
                                        var57[var53] = var105;
                                        if (var61 != null && class206.field3051[var20][var101]) {
                                            int var107 = (var13 << 9) + var106;
                                            int var108 = (var15 << 9) + var105;
                                            var61[var53] = arg5.method267(var107, var108) - arg4.method267(var107, var108);
                                        }
                                        if (var62 != null) {
                                            if (arg5 != null && !class206.field3051[var20][var101]) {
                                                int var109 = (var13 << 9) + var106;
                                                int var110 = (var15 << 9) + var105;
                                                var62[var53] = arg4.method267(var109, var110) - arg5.method267(var109, var110);
                                            } else if (arg2 != null && !class44.field665[var20][var101]) {
                                                int var111 = (var13 << 9) + var106;
                                                int var112 = (var15 << 9) + var105;
                                                var62[var53] = arg2.method267(var111, var112) - arg4.method267(var111, var112);
                                            }
                                        }
                                        if (var101 < 8 && class14.field219[var102] > var27.field4761) {
                                            if (var55 != null) {
                                                var55[var53] = class327.field4836[var102];
                                            }
                                            var60[var53] = class186.field2743[var102];
                                            var59[var53] = class78.field1072[var102];
                                            var58[var53] = class226.field3252[var102];
                                        } else {
                                            if (var55 != null) {
                                                var55[var53] = var66;
                                            }
                                            var59[var53] = arg1.method385() ? var27.field4775 : var27.field4769;
                                            var60[var53] = var27.field4770;
                                            var58[var53] = var63;
                                        }
                                        var53++;
                                    }
                                }
                                if (!this.field3775 && arg6 == 0) {
                                    class63.method519(var13, var15, var27.field4765, var27.field4781 * 8, var27.field4768);
                                }
                                if (var20 != 12 && var27.field4767 != -1 && var27.field4764) {
                                    var17 = true;
                                }
                            } else if (var44) {
                                var52 += class202.field2972[var20];
                            } else if (var18) {
                                var52 += class188.field2781[var20];
                            } else {
                                var52 += class83.field1155[var20];
                            }
                            if (var28 != null) {
                                if (var24 == 0) {
                                    var24 = var23;
                                }
                                if (var26 == 0) {
                                    var26 = var23;
                                }
                                if (var25 == 0) {
                                    var25 = var23;
                                }
                                class305 var68 = this.field3765.method1162(1, var23 - 1);
                                class305 var69 = this.field3765.method1162(1, var24 - 1);
                                class305 var70 = this.field3765.method1162(1, var25 - 1);
                                class305 var71 = this.field3765.method1162(1, var26 - 1);
                                for (int var72 = 0; var72 < var49; var72++) {
                                    boolean var73 = false;
                                    byte var74;
                                    if (var19[-var21 & 0x3] && var45[0] == var52) {
                                        class506.field6930[0] = var47[var52];
                                        class506.field6930[1] = 1;
                                        class506.field6930[2] = var48[var52];
                                        class506.field6930[3] = 1;
                                        class506.field6930[4] = var50[var52];
                                        class506.field6930[5] = var48[var52];
                                        var74 = 6;
                                    } else if (var19[2 - var21 & 0x3] && var45[2] == var52) {
                                        class506.field6930[0] = var47[var52];
                                        class506.field6930[1] = 5;
                                        class506.field6930[2] = var48[var52];
                                        class506.field6930[3] = 5;
                                        class506.field6930[4] = var50[var52];
                                        class506.field6930[5] = var48[var52];
                                        var74 = 6;
                                    } else if (var19[1 - var21 & 0x3] && var45[1] == var52) {
                                        class506.field6930[0] = var47[var52];
                                        class506.field6930[1] = 3;
                                        class506.field6930[2] = var48[var52];
                                        class506.field6930[3] = 3;
                                        class506.field6930[4] = var50[var52];
                                        class506.field6930[5] = var48[var52];
                                        var74 = 6;
                                    } else if (var19[3 - var21 & 0x3] && var45[3] == var52) {
                                        class506.field6930[0] = var47[var52];
                                        class506.field6930[1] = 7;
                                        class506.field6930[2] = var48[var52];
                                        class506.field6930[3] = 7;
                                        class506.field6930[4] = var50[var52];
                                        class506.field6930[5] = var48[var52];
                                        var74 = 6;
                                    } else {
                                        class506.field6930[0] = var47[var52];
                                        class506.field6930[1] = var50[var52];
                                        var74 = 3;
                                        class506.field6930[2] = var48[var52];
                                    }
                                    for (int var75 = 0; var75 < var74; var75++) {
                                        int var76 = class506.field6930[var75];
                                        int var77 = var76 - (var21 * 2) & 0x7;
                                        int var78 = this.field3755[var76];
                                        int var79 = this.field3756[var76];
                                        int var80;
                                        int var81;
                                        if (var21 == 1) {
                                            var80 = 512 - var78;
                                            var81 = var79;
                                        } else if (var21 == 2) {
                                            var80 = 512 - var79;
                                            var81 = 512 - var78;
                                        } else if (var21 == 3) {
                                            var80 = var78;
                                            var81 = 512 - var79;
                                        } else {
                                            var81 = var78;
                                            var80 = var79;
                                        }
                                        var56[var53] = var81;
                                        var57[var53] = var80;
                                        if (var61 != null && class206.field3051[var20][var76]) {
                                            int var82 = (var13 << 9) + var81;
                                            int var83 = (var15 << 9) + var80;
                                            var61[var53] = arg5.method267(var82, var83) - arg4.method267(var82, var83);
                                        }
                                        if (var62 != null) {
                                            if (arg5 != null && !class206.field3051[var20][var76]) {
                                                int var84 = (var13 << 9) + var81;
                                                int var85 = (var15 << 9) + var80;
                                                var62[var53] = arg4.method267(var84, var85) - arg5.method267(var84, var85);
                                            } else if (arg2 != null && !class44.field665[var20][var76]) {
                                                int var86 = (var13 << 9) + var81;
                                                int var87 = (var15 << 9) + var80;
                                                var62[var53] = arg2.method267(var86, var87) - arg4.method267(var86, var87);
                                            }
                                        }
                                        if (var76 < 8 && class14.field219[var77] >= 0) {
                                            if (var55 != null) {
                                                var55[var53] = class327.field4836[var77];
                                            }
                                            var60[var53] = class186.field2743[var77];
                                            var59[var53] = class78.field1072[var77];
                                            var58[var53] = class226.field3252[var77];
                                        } else {
                                            if (var18 && class206.field3051[var20][var76]) {
                                                var59[var53] = var64;
                                                var60[var53] = var65;
                                                var58[var53] = var63;
                                            } else if (var81 == 0 && var80 == 0) {
                                                var58[var53] = arg0[var13][var15];
                                                var59[var53] = var68.field4493;
                                                var60[var53] = var68.field4496;
                                            } else if (var81 == 0 && var80 == 512) {
                                                var58[var53] = arg0[var13][var16];
                                                var59[var53] = var69.field4493;
                                                var60[var53] = var69.field4496;
                                            } else if (var81 == 512 && var80 == 512) {
                                                var58[var53] = arg0[var14][var16];
                                                var59[var53] = var70.field4493;
                                                var60[var53] = var70.field4496;
                                            } else if (var81 == 512 && var80 == 0) {
                                                var58[var53] = arg0[var14][var15];
                                                var59[var53] = var71.field4493;
                                                var60[var53] = var71.field4496;
                                            } else {
                                                if (var81 >= 256) {
                                                    if (var80 >= 256) {
                                                        var59[var53] = var70.field4493;
                                                        var60[var53] = var70.field4496;
                                                    } else {
                                                        var59[var53] = var71.field4493;
                                                        var60[var53] = var71.field4496;
                                                    }
                                                } else if (var80 < 256) {
                                                    var59[var53] = var68.field4493;
                                                    var60[var53] = var68.field4496;
                                                } else {
                                                    var59[var53] = var69.field4493;
                                                    var60[var53] = var69.field4496;
                                                }
                                                int var88 = class36.method168(arg0[var13][var15], var81 << 7 >> 9, arg0[var14][var15], -19761);
                                                int var89 = class36.method168(arg0[var13][var16], var81 << 7 >> 9, arg0[var14][var16], -19761);
                                                var58[var53] = class36.method168(var88, var80 << 7 >> 9, var89, -19761);
                                            }
                                            if (var55 != null) {
                                                var55[var53] = var58[var53];
                                            }
                                        }
                                        var53++;
                                    }
                                    var52++;
                                }
                                if (var20 != 0 && var28.field4487) {
                                    var17 = true;
                                }
                            }
                            int var90 = arg4.method273(var13, var15);
                            int var91 = arg4.method273(var14, var15);
                            int var92 = arg4.method273(var14, var16);
                            int var93 = arg4.method273(var13, var16);
                            if (arg6 > 0) {
                                boolean var94 = true;
                                if (var23 == 0 && var20 != 0) {
                                    var94 = false;
                                }
                                if (var22 > 0 && var29 != null && !var29.field4776) {
                                    var94 = false;
                                }
                                if (var94 && var90 == var91 && var90 == var92 && var90 == var93) {
                                    this.field3760[arg6][var13][var15] = (byte) class266.method1624(this.field3760[arg6][var13][var15], 4);
                                }
                            }
                            int var95 = 0;
                            int var96 = 0;
                            int var97 = 0;
                            if (this.field3775) {
                                var95 = class558.method3058(var13, var15);
                                var96 = class273.method1664(var13, var15);
                                var97 = class496.method2771(var13, var15);
                            }
                            arg4.method266(var13, var15, var56, var61, var57, var62, var58, var55, var59, var60, var95, var96, var97, var17);
                            class509.method2833(arg6, var13, var15);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(III)Z")
    public static final boolean method1616(int arg0, int arg1, int arg2) {
        if (arg1 <= 116) {
            method1616(36, 92, 83);
        }
        field3778++;
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(BI[Liaa;IILjr;I)V")
    public final void method1617(byte arg0, int arg1, class455[] arg2, int arg3, int arg4, class96 arg5, int arg6) {
        if (!this.field3775) {
            for (int var8 = 0; var8 < 4; var8++) {
                class455 var9 = arg2[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg4 + var10;
                        int var13 = arg1 + var11;
                        if (var12 >= 0 && this.field3774 > var12 && var13 >= 0 && this.field3759 > var13) {
                            var9.method2616(false, var12, var13);
                        }
                    }
                }
            }
        }
        field3761++;
        int var14 = arg4 + arg6;
        int var15 = arg1 + arg3;
        for (int var16 = 0; var16 < this.field3766; var16++) {
            for (int var17 = 0; var17 < 64; var17++) {
                for (int var18 = 0; var18 < 64; var18++) {
                    this.method1618(var16, (byte) 115, 0, arg5, 0, var15 + var18, 0, var17 + arg4, false, var14 + var17, arg1 + var18);
                }
            }
        }
        if (arg0 > -56) {
            method1616(-61, -52, -80);
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IBILjr;IIIIZII)V")
    private final void method1618(int arg0, byte arg1, int arg2, class96 arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10) {
        int var12 = 27 / ((-arg1 - 10) / 46);
        if (arg4 == 1) {
            arg2 = 1;
        } else if (arg4 == 2) {
            arg6 = 1;
            arg2 = 1;
        } else if (arg4 == 3) {
            arg6 = 1;
        }
        field3770++;
        if (arg7 < 0 || this.field3774 <= arg7 || arg10 < 0 || arg10 >= this.field3759) {
            while (true) {
                int var15 = arg3.method718(-88);
                if (var15 == 0) {
                    return;
                }
                if (var15 == 1) {
                    arg3.method718(-80);
                    return;
                }
                if (var15 <= 49) {
                    arg3.method718(94);
                }
            }
        }
        if (!this.field3775 && !arg8) {
            class246.field3501[arg0][arg7][arg10] = 0;
        }
        while (true) {
            int var13 = arg3.method718(103);
            if (var13 == 0) {
                if (this.field3775) {
                    this.field3751[0][arg6 + arg7][arg10 + arg2] = 0;
                    return;
                } else if (arg0 == 0) {
                    this.field3751[0][arg6 + arg7][arg2 + arg10] = -class73.method584(arg9 + 932731, 122, arg5 + 556238) * 8 << 2;
                    return;
                } else {
                    this.field3751[arg0][arg6 + arg7][arg10 + arg2] = this.field3751[arg0 - 1][arg6 + arg7][arg2 + arg10] - 960;
                    return;
                }
            }
            if (var13 == 1) {
                int var14 = arg3.method718(-116);
                if (this.field3775) {
                    this.field3751[0][arg7 + arg6][arg2 + arg10] = var14 * 8 << 2;
                    return;
                }
                if (var14 == 1) {
                    var14 = 0;
                }
                if (arg0 != 0) {
                    this.field3751[arg0][arg7 + arg6][arg10 + arg2] = this.field3751[arg0 - 1][arg6 + arg7][arg2 + arg10] - (var14 * 8 << 2);
                    return;
                }
                this.field3751[0][arg6 + arg7][arg2 + arg10] = -var14 * 8 << 2;
                return;
            }
            if (var13 <= 49) {
                if (arg8) {
                    arg3.method718(122);
                } else {
                    this.field3757[arg0][arg7][arg10] = arg3.method748(-813976688);
                    this.field3776[arg0][arg7][arg10] = (byte) ((var13 - 2) / 4);
                    this.field3762[arg0][arg7][arg10] = (byte) class249.method1537(3, var13 + arg4 - 2);
                }
            } else if (var13 <= 81) {
                if (!this.field3775 && !arg8) {
                    class246.field3501[arg0][arg7][arg10] = (byte) (var13 - 49);
                }
            } else if (!arg8) {
                this.field3764[arg0][arg7][arg10] = (byte) (var13 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(B)V")
    public static void method1619(byte arg0) {
        int var1 = 11 % ((arg0 + 36) / 62);
        field3750 = null;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Ld;Loa;ILd;)V")
    public final void method1620(class136 arg0, class638 arg1, int arg2, class136 arg3) {
        field3771++;
        int[][] var5 = new int[this.field3774][this.field3759];
        if (class389.field5464 == null || class389.field5464.length != this.field3759) {
            class691.field9704 = new int[this.field3759];
            class491.field6784 = new int[this.field3759];
            class506.field6923 = new int[this.field3759];
            class389.field5464 = new int[this.field3759];
            class348.field5016 = new int[this.field3759];
        }
        for (int var6 = 0; var6 < this.field3766; var6++) {
            for (int var8 = 0; var8 < this.field3759; var8++) {
                class389.field5464[var8] = 0;
                class691.field9704[var8] = 0;
                class506.field6923[var8] = 0;
                class348.field5016[var8] = 0;
                class491.field6784[var8] = 0;
            }
            for (int var9 = -5; var9 < this.field3774; var9++) {
                for (int var10 = 0; var10 < this.field3759; var10++) {
                    int var19 = var9 + 5;
                    int var10002;
                    if (this.field3774 > var19) {
                        int var20 = this.field3764[var6][var19][var10] & 0xFF;
                        if (var20 > 0) {
                            class305 var21 = this.field3765.method1162(1, var20 - 1);
                            class389.field5464[var10] += var21.field4486;
                            class691.field9704[var10] += var21.field4491;
                            class506.field6923[var10] += var21.field4495;
                            class348.field5016[var10] += var21.field4489;
                            var10002 = class491.field6784[var10]++;
                        }
                    }
                    int var22 = var9 - 5;
                    if (var22 >= 0) {
                        int var23 = this.field3764[var6][var22][var10] & 0xFF;
                        if (var23 > 0) {
                            class305 var24 = this.field3765.method1162(1, var23 - 1);
                            class389.field5464[var10] -= var24.field4486;
                            class691.field9704[var10] -= var24.field4491;
                            class506.field6923[var10] -= var24.field4495;
                            class348.field5016[var10] -= var24.field4489;
                            var10002 = class491.field6784[var10]--;
                        }
                    }
                }
                if (var9 >= 0) {
                    int var11 = 0;
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    for (int var16 = -5; var16 < this.field3759; var16++) {
                        int var17 = var16 + 5;
                        if (this.field3759 > var17) {
                            var14 += class348.field5016[var17];
                            var13 += class506.field6923[var17];
                            var12 += class691.field9704[var17];
                            var15 += class491.field6784[var17];
                            var11 += class389.field5464[var17];
                        }
                        int var18 = var16 - 5;
                        if (var18 >= 0) {
                            var15 -= class491.field6784[var18];
                            var12 -= class691.field9704[var18];
                            var11 -= class389.field5464[var18];
                            var14 -= class348.field5016[var18];
                            var13 -= class506.field6923[var18];
                        }
                        if (var16 >= 0 && var14 > 0 && var15 > 0) {
                            var5[var9][var16] = class228.method1457(var12 / var15, var13 / var15, (byte) 55, var11 * 256 / var14);
                        }
                    }
                }
            }
            if (class353.field5072) {
                this.method1615(var5, arg1, var6 == 0 ? arg3 : null, (byte) 115, class144.field2149[var6], var6 == 0 ? arg0 : null, var6);
            } else {
                this.method1622((byte) -17, var5, arg1, var6, var6 == 0 ? arg0 : null, var6 == 0 ? arg3 : null, class144.field2149[var6]);
            }
            this.field3764[var6] = null;
            this.field3757[var6] = null;
            this.field3776[var6] = null;
            this.field3762[var6] = null;
        }
        if (!this.field3775) {
            if (class333.field4888 != 0) {
                class211.method1387();
            }
            if (class335.field4900) {
                class103.method793();
            }
        }
        for (int var7 = 0; var7 < this.field3766; var7++) {
            class144.field2149[var7].method270();
        }
        if (arg2 > -7) {
            this.method1618(-18, (byte) 88, 1, null, -108, -112, 75, 75, false, -39, 51);
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(CI)I")
    public static final int method1621(char arg0, int arg1) {
        field3777++;
        return arg1 >= ~arg0 && arg0 < class247.field3507.length ? class247.field3507[arg0] : -1;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(B[[ILoa;ILd;Ld;Ld;)V")
    private final void method1622(byte arg0, int[][] arg1, class638 arg2, int arg3, class136 arg4, class136 arg5, class136 arg6) {
        for (int var8 = 0; var8 < this.field3774; var8++) {
            for (int var10 = 0; var10 < this.field3759; var10++) {
                if (class174.field2606 == -1 || class269.method1632(var8, class174.field2606, (byte) 48, var10, arg3)) {
                    byte var11 = this.field3776[arg3][var8][var10];
                    byte var12 = this.field3762[arg3][var8][var10];
                    int var13 = this.field3757[arg3][var8][var10] & 0xFF;
                    int var14 = this.field3764[arg3][var8][var10] & 0xFF;
                    class323 var15 = var13 == 0 ? null : this.field3768.method1046(-90, var13 - 1);
                    class305 var16 = var14 == 0 ? null : this.field3765.method1162(1, var14 - 1);
                    int var17 = 0;
                    int var18 = 0;
                    if (var11 != 0) {
                        var17 = var16 == null ? 0 : class418.field5901[var11];
                        var18 = var15 == null ? 0 : class202.field2972[var11];
                    } else if (var15 != null) {
                        var18 = class202.field2972[var11];
                    } else if (var16 != null) {
                        var17 = class202.field2972[var11];
                    }
                    int var19 = var17 + var18;
                    int var20 = 0;
                    if (var19 != 0) {
                        int[] var21 = new int[var19];
                        int[] var22 = new int[var19];
                        int[] var23 = new int[var19];
                        int[] var24 = new int[var19];
                        boolean var25 = false;
                        if (var15 == null || var15.field4767 == -1 && var15.field4780 == -1 && var15.field4775 == -1) {
                            for (int var28 = 0; var28 < var18; var28++) {
                                var21[var20] = -1;
                                var20++;
                            }
                        } else {
                            int var26 = arg2.method385() ? var15.field4775 : var15.field4769;
                            if (class441.field6212) {
                                var26 = -1;
                            }
                            for (int var27 = 0; var27 < var18; var27++) {
                                var23[var20] = var26;
                                var24[var20] = var15.field4770;
                                if (var15.field4767 == -1) {
                                    var21[var20] = -1;
                                } else {
                                    var21[var20] = var15.field4767;
                                }
                                if (var15.field4780 == -1) {
                                    var22[var20] = -1;
                                } else {
                                    var25 = true;
                                    var22[var20] = var15.field4780;
                                }
                                var20++;
                            }
                            if (!this.field3775 && arg3 == 0) {
                                class63.method519(var8, var10, var15.field4765, var15.field4781 * 8, var15.field4768);
                            }
                        }
                        if (!var25) {
                            var22 = null;
                        }
                        if (var16 == null) {
                            for (int var31 = 0; var31 < var17; var31++) {
                                var21[var20] = -1;
                                var20++;
                            }
                        } else {
                            int var29 = var16.field4493;
                            if (class441.field6212) {
                                var29 = -1;
                            }
                            for (int var30 = 0; var30 < var17; var30++) {
                                var23[var20] = var29;
                                var24[var20] = var16.field4496;
                                var21[var20] = arg1[var8][var10];
                                if (var22 != null) {
                                    var22[var20] = -1;
                                }
                                var20++;
                            }
                        }
                        int var32 = this.field3755.length;
                        int[] var33 = new int[var32];
                        int[] var34 = new int[var32];
                        int[] var35 = arg4 == null ? null : new int[var32];
                        int[] var36 = arg4 == null && arg5 == null ? null : new int[var32];
                        for (int var37 = 0; var37 < var32; var37++) {
                            int var46 = this.field3755[var37];
                            int var47 = this.field3756[var37];
                            if (var12 == 0) {
                                var33[var37] = var46;
                                var34[var37] = var47;
                            } else if (var12 == 1) {
                                var33[var37] = var47;
                                var34[var37] = 512 - var46;
                            } else if (var12 == 2) {
                                var33[var37] = 512 - var46;
                                var34[var37] = 512 - var47;
                            } else if (var12 == 3) {
                                var33[var37] = 512 - var47;
                                var34[var37] = var46;
                            }
                            if (var35 != null && class206.field3051[var11][var37]) {
                                int var50 = (var8 << 9) + var46;
                                int var51 = (var10 << 9) + var46;
                                var35[var37] = arg4.method267(var50, var51) - arg6.method267(var50, var51);
                            }
                            if (var36 != null) {
                                if (arg4 != null && !class206.field3051[var11][var37]) {
                                    int var52 = (var8 << 9) + var46;
                                    int var53 = (var10 << 9) + var46;
                                    var36[var37] = arg6.method267(var52, var53) - arg4.method267(var52, var53);
                                } else if (arg5 != null && !class44.field665[var11][var37]) {
                                    int var54 = (var8 << 9) + var46;
                                    int var55 = (var10 << 9) + var46;
                                    var36[var37] = arg5.method267(var54, var55) - arg6.method267(var54, var55);
                                }
                            }
                        }
                        int var38 = arg6.method273(var8, var10);
                        int var39 = arg6.method273(var8 + 1, var10);
                        int var40 = arg6.method273(var8 + 1, var10 - -1);
                        int var41 = arg6.method273(var8, var10 + 1);
                        if (arg3 > 0) {
                            boolean var42 = true;
                            if (var14 == 0 && var11 != 0) {
                                var42 = false;
                            }
                            if (var13 > 0 && var15 != null && !var15.field4776) {
                                var42 = false;
                            }
                            if (var42 && var38 == var39 && var38 == var40 && var38 == var41) {
                                this.field3760[arg3][var8][var10] = (byte) class266.method1624(this.field3760[arg3][var8][var10], 4);
                            }
                        }
                        int var43 = 0;
                        int var44 = 0;
                        int var45 = 0;
                        if (this.field3775) {
                            var43 = class558.method3058(var8, var10);
                            var44 = class273.method1664(var8, var10);
                            var45 = class496.method2771(var8, var10);
                        }
                        arg6.method275(var8, var10, var33, var35, var34, var36, class245.field3494[var11], class551.field7459[var11], class230.field3281[var11], var21, var22, var23, var24, var43, var44, var45, false);
                        class509.method2833(arg3, var8, var10);
                    }
                }
            }
        }
        int var9 = 14 % ((arg0 - 66) / 36);
        field3763++;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(II[[I)V")
    public final void method1623(int arg0, int arg1, int[][] arg2) {
        field3758++;
        if (arg1 != 11168) {
            return;
        }
        int[][] var4 = this.field3751[arg0];
        for (int var5 = 0; var5 < this.field3774 + 1; var5++) {
            for (int var6 = 0; var6 < this.field3759 + 1; var6++) {
                var4[var5][var6] += arg2[var5][var6];
            }
        }
    }

    @OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(IIIZLada;Lc;)V")
    public class265(int arg0, int arg1, int arg2, boolean arg3, class149 arg4, class169 arg5) {
        this.field3775 = arg3;
        this.field3768 = arg4;
        this.field3774 = arg1;
        this.field3759 = arg2;
        this.field3765 = arg5;
        this.field3766 = arg0;
        this.field3762 = new byte[this.field3766][this.field3774][this.field3759];
        this.field3764 = new byte[this.field3766][this.field3774][this.field3759];
        this.field3757 = new byte[this.field3766][this.field3774][this.field3759];
        this.field3751 = new int[this.field3766][this.field3774 + 1][this.field3759 + 1];
        this.field3760 = new byte[this.field3766][this.field3774 + 1][this.field3759 + 1];
        this.field3776 = new byte[this.field3766][this.field3774][this.field3759];
    }
}
