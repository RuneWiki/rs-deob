import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class545 {

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "[I")
    private int[] field7831 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

    @OriginalMember(owner = "client!cb", name = "z", descriptor = "[I")
    private int[] field7848 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    public int field7824;

    @OriginalMember(owner = "client!cb", name = "C", descriptor = "Lgba;")
    private class695 field7851;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "Z")
    public boolean field7823;

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "I")
    public int field7834;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "I")
    public int field7832;

    @OriginalMember(owner = "client!cb", name = "D", descriptor = "Lufa;")
    private class708 field7852;

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "[[[B")
    public byte[][][] field7835;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "[[[I")
    public int[][][] field7828;

    @OriginalMember(owner = "client!cb", name = "t", descriptor = "[[[B")
    private byte[][][] field7842;

    @OriginalMember(owner = "client!cb", name = "s", descriptor = "[[[B")
    private byte[][][] field7841;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "[[[B")
    private byte[][][] field7829;

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "[[[B")
    private byte[][][] field7837;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "Lfba;")
    public static class27 field7825 = new class27(55, 18);

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    public static int field7826;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
    public static int field7827;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "I")
    public static int field7830;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "I")
    public static int field7833;

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
    public static int field7836;

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "I")
    public static int field7838;

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "I")
    public static int field7839;

    @OriginalMember(owner = "client!cb", name = "u", descriptor = "I")
    public static int field7843;

    @OriginalMember(owner = "client!cb", name = "v", descriptor = "I")
    public static int field7844;

    @OriginalMember(owner = "client!cb", name = "w", descriptor = "I")
    public static int field7845;

    @OriginalMember(owner = "client!cb", name = "x", descriptor = "I")
    public static int field7846;

    @OriginalMember(owner = "client!cb", name = "y", descriptor = "I")
    public static int field7847;

    @OriginalMember(owner = "client!cb", name = "A", descriptor = "I")
    public static int field7849;

    @OriginalMember(owner = "client!cb", name = "B", descriptor = "I")
    public static int field7850;

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "[[[B")
    public byte[][][] field7840;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "([[ILs;Ls;Lha;Ls;II)V", line = 5)
    private final void method3252(int[][] arg0, class294 arg1, class294 arg2, class65 arg3, class294 arg4, int arg5, int arg6) {
        field7836++;
        for (int var8 = 0; var8 < this.field7834; var8++) {
            for (int var9 = 0; var9 < this.field7832; var9++) {
                if (class451.field6344 == -1 || class580.method3400(var8, arg5, var9, class451.field6344, 81)) {
                    byte var10 = this.field7829[arg5][var8][var9];
                    byte var11 = this.field7837[arg5][var8][var9];
                    int var12 = this.field7842[arg5][var8][var9] & 0xFF;
                    int var13 = this.field7841[arg5][var8][var9] & 0xFF;
                    class374 var14 = var12 == 0 ? null : this.field7852.method3998(64, var12 - 1);
                    if (var10 == 0 && var14 == null) {
                        var10 = 12;
                    }
                    class510 var15 = var13 == 0 ? null : this.field7851.method3925(true, var13 - 1);
                    class374 var16 = var14;
                    if (var14 != null && var14.field5158 == -1 && var14.field5167 == -1) {
                        var16 = var14;
                        var14 = null;
                    }
                    if (var14 != null || var15 != null) {
                        int var17 = class521.field7353[var10];
                        int var18 = class360.field5054[var10];
                        int var19 = (var15 == null ? 0 : var17) + (var14 == null ? 0 : var18);
                        int var20 = 0;
                        int var21 = 0;
                        int var22 = var14 == null ? -1 : var14.field5164;
                        int var23 = var15 == null ? -1 : var15.field7218;
                        int[] var24 = new int[var19];
                        int[] var25 = new int[var19];
                        int[] var26 = new int[var19];
                        int[] var27 = new int[var19];
                        int[] var28 = new int[var19];
                        int[] var29 = new int[var19];
                        int[] var30 = var14 == null || var14.field5167 == -1 ? null : new int[var19];
                        if (var14 == null) {
                            var21 += var18;
                        } else {
                            for (int var31 = 0; var31 < var18; var31++) {
                                var24[var20] = class465.field6549[var10][var21];
                                var25[var20] = class489.field6928[var10][var21];
                                var26[var20] = class549.field7895[var10][var21];
                                var28[var20] = var22;
                                var29[var20] = var14.field5161;
                                var27[var20] = var14.field5158;
                                if (var30 != null) {
                                    var30[var20] = var14.field5167;
                                }
                                var20++;
                                var21++;
                            }
                            if (!this.field7823 && arg5 == 0) {
                                class413.method2501(var8, var9, var14.field5160, var14.field5166 * 8, var14.field5157);
                            }
                        }
                        if (var15 != null) {
                            for (int var32 = 0; var32 < var17; var32++) {
                                var24[var20] = class465.field6549[var10][var21];
                                var25[var20] = class489.field6928[var10][var21];
                                var26[var20] = class549.field7895[var10][var21];
                                var28[var20] = var23;
                                var29[var20] = var15.field7215;
                                var27[var20] = arg0[var8][var9];
                                if (var30 != null) {
                                    var30[var20] = var27[var20];
                                }
                                var20++;
                                var21++;
                            }
                        }
                        int var33 = this.field7848.length;
                        int[] var34 = new int[var33];
                        int[] var35 = new int[var33];
                        int[] var36 = arg1 == null ? null : new int[var33];
                        int[] var37 = arg1 == null && arg4 == null ? null : new int[var33];
                        for (int var38 = 0; var38 < var33; var38++) {
                            int var48 = this.field7848[var38];
                            int var49 = this.field7831[var38];
                            if (var11 == 0) {
                                var34[var38] = var48;
                                var35[var38] = var49;
                            } else if (var11 == 1) {
                                var34[var38] = var49;
                                var35[var38] = 512 - var48;
                            } else if (var11 == 2) {
                                var34[var38] = 512 - var48;
                                var35[var38] = 512 - var49;
                            } else if (var11 == 3) {
                                var34[var38] = 512 - var49;
                                var35[var38] = var48;
                            }
                            if (var36 != null && class343.field4786[var10][var38]) {
                                int var52 = (var8 << 9) + var34[var38];
                                int var53 = (var9 << 9) + var35[var38];
                                var36[var38] = arg1.method1918(var52, (byte) 127, var53) - arg2.method1918(var52, (byte) 126, var53);
                            }
                            if (var37 != null) {
                                if (arg1 != null && !class343.field4786[var10][var38]) {
                                    int var54 = (var8 << 9) + var34[var38];
                                    int var55 = (var9 << 9) + var35[var38];
                                    var37[var38] = arg2.method1918(var54, (byte) 127, var55) - arg1.method1918(var54, (byte) 125, var55);
                                } else if (arg4 != null && !class651.field9090[var10][var38]) {
                                    int var56 = (var8 << 9) + var34[var38];
                                    int var57 = (var9 << 9) + var35[var38];
                                    var37[var38] = arg4.method1918(var56, (byte) 126, var57) - arg2.method1918(var56, (byte) 126, var57);
                                }
                            }
                        }
                        int var39 = arg2.method1904(var9, (byte) -121, var8);
                        int var40 = arg2.method1904(var9, (byte) 74, var8 + 1);
                        int var41 = arg2.method1904(var9 + 1, (byte) -5, var8 + 1);
                        int var42 = arg2.method1904(var9 + 1, (byte) -124, var8);
                        boolean var43 = class124.method941(4, var9, var8);
                        if (var43 && arg5 > 1 || !var43 && arg5 > 0) {
                            boolean var44 = true;
                            if (var15 != null && !var15.field7224) {
                                var44 = false;
                            } else if (var13 == 0 && var10 != 0) {
                                var44 = false;
                            } else if (var12 > 0 && var16 != null && !var16.field5155) {
                                var44 = false;
                            }
                            if (var44 && var39 == var40 && var39 == var41 && var39 == var42) {
                                this.field7835[arg5][var8][var9] = (byte) class746.method4158(this.field7835[arg5][var8][var9], 4);
                            }
                        }
                        int var45 = 0;
                        int var46 = 0;
                        int var47 = 0;
                        if (this.field7823) {
                            var45 = class422.method2558(var8, var9);
                            var46 = class60.method403(var8, var9);
                            var47 = class465.method2783(var8, var9);
                        }
                        arg2.method1903(var8, var9, var34, var36, var35, var37, var24, var25, var26, var27, var30, var28, var29, var45, var46, var47, false);
                        class442.method2638(arg5, var8, var9);
                    }
                }
            }
        }
        if (arg6 > -45) {
            this.field7840 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "([[BIBILha;IILlda;ILjp;[[B[[BI[Z)V", line = 293)
    private final void method3253(byte[][] arg0, int arg1, byte arg2, int arg3, class65 arg4, int arg5, int arg6, class510 arg7, int arg8, class374 arg9, byte[][] arg10, byte[][] arg11, int arg12, boolean[] arg13) {
        field7849++;
        boolean[] var15 = arg9 != null && arg9.field5168 ? class502.field7114[arg1] : class233.field3511[arg1];
        if (arg8 > 0) {
            if (arg5 > 0) {
                int var16 = arg10[arg5 - 1][arg8 - 1] & 0xFF;
                if (var16 > 0) {
                    class374 var17 = this.field7852.method3998(64, var16 - 1);
                    if (var17.field5158 != -1 && var17.field5168) {
                        byte var18 = arg11[arg5 - 1][arg8 - 1];
                        int var19 = (arg0[arg5 - 1][arg8 - 1] * 2) + 4 & 0x7;
                        int var20 = class489.method2917(arg4, -72, var17);
                        if (class343.field4786[var18][var19]) {
                            class229.field3500[0] = var17.field5158;
                            class199.field3043[0] = var20;
                            class351.field4913[0] = var17.field5164;
                            class387.field5358[0] = var17.field5161;
                            class22.field366[0] = var17.field5171;
                            class36.field481[0] = 256;
                        }
                    }
                }
            }
            if ((arg12 - 1) > arg5) {
                int var21 = arg10[arg5 + 1][arg8 - 1] & 0xFF;
                if (var21 > 0) {
                    class374 var22 = this.field7852.method3998(64, var21 - 1);
                    if (var22.field5158 != -1 && var22.field5168) {
                        byte var23 = arg11[arg5 + 1][arg8 - 1];
                        int var24 = arg0[arg5 + 1][arg8 - 1] * 2 + 6 & 0x7;
                        int var25 = class489.method2917(arg4, -120, var22);
                        if (class343.field4786[var23][var24]) {
                            class229.field3500[2] = var22.field5158;
                            class199.field3043[2] = var25;
                            class351.field4913[2] = var22.field5164;
                            class387.field5358[2] = var22.field5161;
                            class22.field366[2] = var22.field5171;
                            class36.field481[2] = 512;
                        }
                    }
                }
            }
        }
        if (arg3 - 1 > arg8) {
            if (arg5 > 0) {
                int var26 = arg10[arg5 - 1][arg8 + 1] & 0xFF;
                if (var26 > 0) {
                    class374 var27 = this.field7852.method3998(64, var26 - 1);
                    if (var27.field5158 != -1 && var27.field5168) {
                        byte var28 = arg11[arg5 - 1][arg8 + 1];
                        int var29 = arg0[arg5 - 1][arg8 + 1] * 2 + 2 & 0x7;
                        int var30 = class489.method2917(arg4, -51, var27);
                        if (class343.field4786[var28][var29]) {
                            class229.field3500[6] = var27.field5158;
                            class199.field3043[6] = var30;
                            class351.field4913[6] = var27.field5164;
                            class387.field5358[6] = var27.field5161;
                            class22.field366[6] = var27.field5171;
                            class36.field481[6] = 64;
                        }
                    }
                }
            }
            if (arg5 < arg12 - 1) {
                int var31 = arg10[arg5 + 1][arg8 + 1] & 0xFF;
                if (var31 > 0) {
                    class374 var32 = this.field7852.method3998(64, var31 - 1);
                    if (var32.field5158 != -1 && var32.field5168) {
                        byte var33 = arg11[arg5 + 1][arg8 + 1];
                        int var34 = arg0[arg5 + 1][arg8 + 1] * 2 & 0x7;
                        int var35 = class489.method2917(arg4, -119, var32);
                        if (class343.field4786[var33][var34]) {
                            class229.field3500[4] = var32.field5158;
                            class199.field3043[4] = var35;
                            class351.field4913[4] = var32.field5164;
                            class387.field5358[4] = var32.field5161;
                            class22.field366[4] = var32.field5171;
                            class36.field481[4] = 128;
                        }
                    }
                }
            }
        }
        int var36 = -43 / ((30 - arg2) / 44);
        if (arg8 > 0) {
            int var37 = arg10[arg5][arg8 - 1] & 0xFF;
            if (var37 > 0) {
                class374 var38 = this.field7852.method3998(64, var37 - 1);
                if (var38.field5158 != -1) {
                    byte var39 = arg11[arg5][arg8 - 1];
                    byte var40 = arg0[arg5][arg8 - 1];
                    if (var38.field5168) {
                        int var41 = 2;
                        int var42 = (var40 * 2) + 4;
                        int var43 = class489.method2917(arg4, -68, var38);
                        for (int var44 = 0; var44 < 3; var44++) {
                            var41 &= 0x7;
                            var42 &= 0x7;
                            if (class343.field4786[var39][var42] && var38.field5171 >= class22.field366[var41]) {
                                class229.field3500[var41] = var38.field5158;
                                class199.field3043[var41] = var43;
                                class351.field4913[var41] = var38.field5164;
                                class387.field5358[var41] = var38.field5161;
                                if (class22.field366[var41] == var38.field5171) {
                                    class36.field481[var41] = class746.method4158(class36.field481[var41], 32);
                                } else {
                                    class36.field481[var41] = 32;
                                }
                                class22.field366[var41] = var38.field5171;
                            }
                            var41--;
                            var42++;
                        }
                        if (!var15[-(-arg6) & 0x3]) {
                            arg13[0] = class502.field7114[var39][class702.method3977(var40 + 2, 3)];
                        }
                    } else if (!var15[arg6 & 0x3]) {
                        arg13[0] = class233.field3511[var39][class702.method3977(3, var40 + 2)];
                    }
                }
            }
        }
        if ((arg3 - 1) > arg8) {
            int var45 = arg10[arg5][arg8 + 1] & 0xFF;
            if (var45 > 0) {
                class374 var46 = this.field7852.method3998(64, var45 - 1);
                if (var46.field5158 != -1) {
                    byte var47 = arg11[arg5][arg8 + 1];
                    byte var48 = arg0[arg5][arg8 + 1];
                    if (var46.field5168) {
                        int var49 = 4;
                        int var50 = var48 * 2 + 2;
                        int var51 = class489.method2917(arg4, -66, var46);
                        for (int var52 = 0; var52 < 3; var52++) {
                            var49 &= 0x7;
                            var50 &= 0x7;
                            if (class343.field4786[var47][var50] && class22.field366[var49] <= var46.field5171) {
                                class229.field3500[var49] = var46.field5158;
                                class199.field3043[var49] = var51;
                                class351.field4913[var49] = var46.field5164;
                                class387.field5358[var49] = var46.field5161;
                                if (class22.field366[var49] == var46.field5171) {
                                    class36.field481[var49] = class746.method4158(class36.field481[var49], 16);
                                } else {
                                    class36.field481[var49] = 16;
                                }
                                class22.field366[var49] = var46.field5171;
                            }
                            var49++;
                            var50--;
                        }
                        if (!var15[arg6 + 2 & 0x3]) {
                            arg13[2] = class502.field7114[var47][class702.method3977(3, var48)];
                        }
                    } else if (!var15[arg6 + 2 & 0x3]) {
                        arg13[2] = class233.field3511[var47][class702.method3977(3, -(-var48))];
                    }
                }
            }
        }
        if (arg5 > 0) {
            int var53 = arg10[arg5 - 1][arg8] & 0xFF;
            if (var53 > 0) {
                class374 var54 = this.field7852.method3998(64, var53 - 1);
                if (var54.field5158 != -1) {
                    byte var55 = arg11[arg5 - 1][arg8];
                    byte var56 = arg0[arg5 - 1][arg8];
                    if (var54.field5168) {
                        int var57 = 6;
                        int var58 = (var56 * 2) + 4;
                        int var59 = class489.method2917(arg4, -116, var54);
                        for (int var60 = 0; var60 < 3; var60++) {
                            var57 &= 0x7;
                            var58 &= 0x7;
                            if (class343.field4786[var55][var58] && class22.field366[var57] <= var54.field5171) {
                                class229.field3500[var57] = var54.field5158;
                                class199.field3043[var57] = var59;
                                class351.field4913[var57] = var54.field5164;
                                class387.field5358[var57] = var54.field5161;
                                if (class22.field366[var57] == var54.field5171) {
                                    class36.field481[var57] = class746.method4158(class36.field481[var57], 8);
                                } else {
                                    class36.field481[var57] = 8;
                                }
                                class22.field366[var57] = var54.field5171;
                            }
                            var57++;
                            var58--;
                        }
                        if (!var15[arg6 + 3 & 0x3]) {
                            arg13[3] = class502.field7114[var55][class702.method3977(var56 + 1, 3)];
                        }
                    } else if (!var15[arg6 + 3 & 0x3]) {
                        arg13[3] = class233.field3511[var55][class702.method3977(3, var56 + 1)];
                    }
                }
            }
        }
        if (arg5 < arg12 - 1) {
            int var61 = arg10[arg5 + 1][arg8] & 0xFF;
            if (var61 > 0) {
                class374 var62 = this.field7852.method3998(64, var61 - 1);
                if (var62.field5158 != -1) {
                    byte var63 = arg11[arg5 + 1][arg8];
                    byte var64 = arg0[arg5 + 1][arg8];
                    if (var62.field5168) {
                        int var65 = 4;
                        int var66 = var64 * 2 + 6;
                        int var67 = class489.method2917(arg4, -126, var62);
                        for (int var68 = 0; var68 < 3; var68++) {
                            var66 &= 0x7;
                            var65 &= 0x7;
                            if (class343.field4786[var63][var66] && class22.field366[var65] <= var62.field5171) {
                                class229.field3500[var65] = var62.field5158;
                                class199.field3043[var65] = var67;
                                class351.field4913[var65] = var62.field5164;
                                class387.field5358[var65] = var62.field5161;
                                if (class22.field366[var65] == var62.field5171) {
                                    class36.field481[var65] = class746.method4158(class36.field481[var65], 4);
                                } else {
                                    class36.field481[var65] = 4;
                                }
                                class22.field366[var65] = var62.field5171;
                            }
                            var66++;
                            var65--;
                        }
                        if (!var15[arg6 + 1 & 0x3]) {
                            arg13[1] = class502.field7114[var63][class702.method3977(var64 + 3, 3)];
                        }
                    } else if (!var15[arg6 + 1 & 0x3]) {
                        arg13[1] = class233.field3511[var63][class702.method3977(var64 + 3, 3)];
                    }
                }
            }
        }
        if (arg9 == null) {
            return;
        }
        int var69 = class489.method2917(arg4, -106, arg9);
        if (!arg9.field5168) {
            return;
        }
        for (int var70 = 0; var70 < 8; var70++) {
            int var71 = var70 - (arg6 * 2) & 0x7;
            if (class343.field4786[arg1][var70] && arg9.field5171 >= class22.field366[var71]) {
                class229.field3500[var71] = arg9.field5158;
                class199.field3043[var71] = var69;
                class351.field4913[var71] = arg9.field5164;
                class387.field5358[var71] = arg9.field5161;
                if (class22.field366[var71] == arg9.field5171) {
                    class36.field481[var71] = class746.method4158(class36.field481[var71], 2);
                } else {
                    class36.field481[var71] = 2;
                }
                class22.field366[var71] = arg9.field5171;
            }
        }
        return;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II[[I)V", line = 762)
    public final void method3254(int arg0, int arg1, int[][] arg2) {
        field7827++;
        int[][] var4 = this.field7828[arg0];
        for (int var5 = 0; var5 < this.field7834 + 1; var5++) {
            for (int var6 = 0; var6 < this.field7832 + 1; var6++) {
                var4[var5][var6] += arg2[var5][var6];
            }
        }
        if (arg1 <= 16) {
            this.method3263((byte) 95, 102, -7, -12, 20, -110);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIII)V", line = 793)
    public final void method3255(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field7838++;
        if (arg4 != 2) {
            this.method3252(null, null, null, null, null, -100, -122);
        }
        for (int var6 = 0; var6 < this.field7824; var6++) {
            this.method3263((byte) -88, arg1, arg3, arg0, arg2, var6);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILso;Z[Lmb;III)V", line = 811)
    public final void method3256(int arg0, class494 arg1, boolean arg2, class274[] arg3, int arg4, int arg5, int arg6) {
        field7845++;
        if (!this.field7823) {
            for (int var8 = 0; var8 < 4; var8++) {
                class274 var9 = arg3[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg5 + var10;
                        int var13 = arg4 + var11;
                        if (var12 >= 0 && var12 < this.field7834 && var13 >= 0 && this.field7832 > var13) {
                            var9.method1770(var12, var13, false);
                        }
                    }
                }
            }
        }
        int var14 = arg5 + arg6;
        int var15 = arg0 + arg4;
        for (int var16 = 0; var16 < this.field7824; var16++) {
            for (int var17 = 0; var17 < 64; var17++) {
                for (int var18 = 0; var18 < 64; var18++) {
                    this.method3265(0, arg1, 109, 0, var16, arg5 + var17, arg4 + var18, 0, var14 + var17, false, var15 + var18);
                }
            }
        }
        if (!arg2) {
            this.field7831 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V", line = 888)
    public static void method3257(int arg0) {
        field7825 = null;
        if (arg0 != 0) {
            field7847 = -102;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIZ)I", line = 900)
    public static final int method3258(int arg0, int arg1, int arg2, boolean arg3) {
        field7850++;
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return 7 - arg1;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else if (arg3) {
            return -54;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lha;I[[[I[Lmb;)V", line = 924)
    public final void method3259(class65 arg0, int arg1, int[][][] arg2, class274[] arg3) {
        if (!this.field7823) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field7834; var6++) {
                    for (int var7 = 0; var7 < this.field7832; var7++) {
                        if ((class190.field2932[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class190.field2932[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg3[var8].method1763(var6, true, var7);
                            }
                        }
                    }
                }
            }
        }
        field7826++;
        if (arg1 != 6) {
            this.method3260(-75, 93, -107, 75, 98, 47, 14, null, 34, null);
        }
        for (int var9 = 0; var9 < this.field7824; var9++) {
            int var10 = 0;
            int var11 = 0;
            if (!this.field7823) {
                if (class53.field671) {
                    var11 |= 0x8;
                }
                if (class147.field2132) {
                    var10 |= 0x2;
                }
                if (class26.field390 != 0) {
                    var10 |= 0x1;
                    if (class682.field9452 | var9 == 0) {
                        var11 |= 0x10;
                    }
                }
            }
            if (class147.field2132) {
                var11 |= 0x7;
            }
            if (!class588.field8296) {
                var11 |= 0x20;
            }
            int[][] var12 = arg2 == null || var9 >= arg2.length ? this.field7828[var9] : arg2[var9];
            class671.method3812(var9, arg0.method488(this.field7834, this.field7832, this.field7828[var9], var12, 512, var10, var11));
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIIILso;I[Lmb;)V", line = 1023)
    public final void method3260(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class494 arg7, int arg8, class274[] arg9) {
        field7844++;
        int var11 = (arg2 & 0x7) * 8;
        if (!this.field7823) {
            class274 var12 = arg9[arg4];
            for (int var13 = 0; var13 < 8; var13++) {
                for (int var14 = 0; var14 < 8; var14++) {
                    int var15 = arg6 + class248.method1636(var14 & 0x7, var13 & 0x7, 69, arg1);
                    int var16 = method3258(arg1, var13 & 0x7, var14 & 0x7, false) + arg8;
                    if (var15 > 0 && this.field7834 - 1 > var15 && var16 > 0 && var16 < (this.field7832 - 1)) {
                        var12.method1770(var15, var16, false);
                    }
                }
            }
        }
        int var17 = (arg0 & 0x7) * 8;
        int var18 = arg2 & 0x1FFFFFF8 << 3;
        int var19 = (arg0 & 0xFFFFFFF8) << 3;
        byte var20 = 0;
        if (arg3 < 80) {
            this.field7840 = null;
        }
        byte var21 = 0;
        if (arg1 == 1) {
            var21 = 1;
        } else if (arg1 == 2) {
            var20 = 1;
            var21 = 1;
        } else if (arg1 == 3) {
            var20 = 1;
        }
        for (int var22 = 0; var22 < this.field7824; var22++) {
            for (int var23 = 0; var23 < 64; var23++) {
                for (int var24 = 0; var24 < 64; var24++) {
                    if (arg5 == var22 && var11 <= var23 && var23 <= var11 + 8 && var24 >= var17 && (var17 + 8) >= var24) {
                        int var25;
                        int var26;
                        if (var11 + 8 == var23 || (var17 + 8) == var24) {
                            if (arg1 == 0) {
                                var25 = arg6 + var23 - var11;
                                var26 = var24 - (var17 - arg8);
                            } else if (arg1 == 1) {
                                var26 = var11 - (var23 - arg8 - 8);
                                var25 = arg6 + var24 - var17;
                            } else if (arg1 == 2) {
                                var26 = var17 - (var24 - arg8 - 8);
                                var25 = -var23 - (-var11 - (arg6 + 8));
                            } else {
                                var25 = var17 + arg6 + 8 - var24;
                                var26 = arg8 + var23 - var11;
                            }
                            this.method3265(0, arg7, 37, 0, arg4, var25, var26, 0, var18 + var23, true, var19 + var24);
                        } else {
                            var25 = arg6 + class248.method1636(var24 & 0x7, var23 & 0x7, 41, arg1);
                            var26 = method3258(arg1, var23 & 0x7, var24 & 0x7, false) + arg8;
                            this.method3265(var21, arg7, 53, arg1, arg4, var25, var26, var20, var18 + var23, false, var19 + var24);
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
                                if (arg1 == 0) {
                                    var31 = arg8 + var30 - var17;
                                    var32 = arg6 + var29 - var11;
                                } else if (arg1 == 1) {
                                    var32 = var30 + arg6 - var17;
                                    var31 = arg8 + var11 + 8 - var29;
                                } else if (arg1 == 2) {
                                    var31 = var17 + arg8 + 8 - var30;
                                    var32 = var11 + arg6 + 8 - var29;
                                } else {
                                    var32 = var17 + arg6 + 8 - var30;
                                    var31 = var29 - (var11 - arg8);
                                }
                                if (var32 >= 0 && this.field7834 > var32 && var31 >= 0 && var31 < this.field7832) {
                                    this.field7828[arg4][var32][var31] = this.field7828[arg4][var25 + var20][var21 + var26];
                                }
                            }
                        }
                    } else {
                        this.method3265(0, arg7, 32, 0, 0, -1, -1, 0, 0, false, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILha;Ls;Ls;)V", line = 1226)
    public final void method3261(int arg0, class65 arg1, class294 arg2, class294 arg3) {
        field7843++;
        if (class727.field10043 == null || class727.field10043.length != this.field7832) {
            class791.field10850 = new int[this.field7832];
            class606.field8479 = new int[this.field7832];
            class727.field10043 = new int[this.field7832];
            class235.field3538 = new int[this.field7832];
            class319.field4526 = new int[this.field7832];
        }
        int[][] var5 = new int[this.field7834][this.field7832];
        for (int var6 = 0; var6 < this.field7824; var6++) {
            for (int var8 = 0; var8 < this.field7832; var8++) {
                class727.field10043[var8] = 0;
                class235.field3538[var8] = 0;
                class791.field10850[var8] = 0;
                class319.field4526[var8] = 0;
                class606.field8479[var8] = 0;
            }
            for (int var9 = -5; var9 < this.field7834; var9++) {
                for (int var10 = 0; var10 < this.field7832; var10++) {
                    int var19 = var9 + 5;
                    int var10002;
                    if (this.field7834 > var19) {
                        int var20 = this.field7841[var6][var19][var10] & 0xFF;
                        if (var20 > 0) {
                            class510 var21 = this.field7851.method3925(true, var20 - 1);
                            class727.field10043[var10] += var21.field7219;
                            class235.field3538[var10] += var21.field7223;
                            class791.field10850[var10] += var21.field7220;
                            class319.field4526[var10] += var21.field7217;
                            var10002 = class606.field8479[var10]++;
                        }
                    }
                    int var22 = var9 - 5;
                    if (var22 >= 0) {
                        int var23 = this.field7841[var6][var22][var10] & 0xFF;
                        if (var23 > 0) {
                            class510 var24 = this.field7851.method3925(true, var23 - 1);
                            class727.field10043[var10] -= var24.field7219;
                            class235.field3538[var10] -= var24.field7223;
                            class791.field10850[var10] -= var24.field7220;
                            class319.field4526[var10] -= var24.field7217;
                            var10002 = class606.field8479[var10]--;
                        }
                    }
                }
                if (var9 >= 0) {
                    int var11 = 0;
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    for (int var16 = -5; var16 < this.field7832; var16++) {
                        int var17 = var16 + 5;
                        if (var17 < this.field7832) {
                            var12 += class235.field3538[var17];
                            var15 += class606.field8479[var17];
                            var13 += class791.field10850[var17];
                            var11 += class727.field10043[var17];
                            var14 += class319.field4526[var17];
                        }
                        int var18 = var16 - 5;
                        if (var18 >= 0) {
                            var11 -= class727.field10043[var18];
                            var13 -= class791.field10850[var18];
                            var15 -= class606.field8479[var18];
                            var14 -= class319.field4526[var18];
                            var12 -= class235.field3538[var18];
                        }
                        if (var16 >= 0 && var14 > 0 && var15 > 0) {
                            var5[var9][var16] = class438.method2615(-1208546591, var11 * 256 / var14, var13 / var15, var12 / var15);
                        }
                    }
                }
            }
            if (class281.field4082) {
                this.method3264(arg1, -6795, class208.field3219[var6], var6, var5, var6 == 0 ? arg3 : null, var6 == 0 ? arg2 : null);
            } else {
                this.method3252(var5, var6 == 0 ? arg2 : null, class208.field3219[var6], arg1, var6 == 0 ? arg3 : null, var6, -105);
            }
            this.field7841[var6] = null;
            this.field7842[var6] = null;
            this.field7829[var6] = null;
            this.field7837[var6] = null;
        }
        if (!this.field7823) {
            if (class26.field390 != 0) {
                class515.method3107();
            }
            if (class147.field2132) {
                class725.method4063();
            }
        }
        for (int var7 = arg0; var7 < this.field7824; var7++) {
            class208.field3219[var7].method1913();
        }
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(IIIZLufa;Lgba;)V", line = 2545)
    public class545(int arg0, int arg1, int arg2, boolean arg3, class708 arg4, class695 arg5) {
        this.field7824 = arg0;
        this.field7851 = arg5;
        this.field7823 = arg3;
        this.field7834 = arg1;
        this.field7832 = arg2;
        this.field7852 = arg4;
        this.field7835 = new byte[this.field7824][this.field7834 + 1][this.field7832 + 1];
        this.field7828 = new int[this.field7824][this.field7834 + 1][this.field7832 + 1];
        this.field7842 = new byte[this.field7824][this.field7834][this.field7832];
        this.field7841 = new byte[this.field7824][this.field7834][this.field7832];
        this.field7829 = new byte[this.field7824][this.field7834][this.field7832];
        this.field7837 = new byte[this.field7824][this.field7834][this.field7832];
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lrr;[[BI)V", line = 1403)
    public static final void method3262(class381 arg0, byte[][] arg1, int arg2) {
        field7839++;
        int var3 = class300.field4333.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = arg1[var4];
            if (var5 != null) {
                int var6 = (class551.field7919[var4] >> 8) * 64 - class124.field1922;
                int var7 = (class551.field7919[var4] & 0xFF) * 64 - class88.field999;
                class265.method1722(16033);
                arg0.method2375(var5, var7, var6, 22414, class346.field4838, class37.field491);
            }
        }
        if (arg2 <= 36) {
            method3258(5, -82, 76, false);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BIIIII)V", line = 1441)
    public final void method3263(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field7833++;
        int var7 = arg4;
        if (arg0 != -88) {
            this.field7834 = 46;
        }
        while (var7 < (arg3 + arg4)) {
            for (int var10 = arg1; var10 < (arg1 + arg2); var10++) {
                if (var10 >= 0 && this.field7834 > var10 && var7 >= 0 && var7 < this.field7832) {
                    this.field7828[arg5][var10][var7] = arg5 > 0 ? this.field7828[arg5 - 1][var10][var7] - 960 : 0;
                }
            }
            var7++;
        }
        if (arg1 > 0 && arg1 < this.field7834) {
            for (int var8 = arg4 + 1; var8 < arg4 + arg3; var8++) {
                if (var8 >= 0 && this.field7832 > var8) {
                    this.field7828[arg5][arg1][var8] = this.field7828[arg5][arg1 - 1][var8];
                }
            }
        }
        if (arg4 > 0 && this.field7832 > arg4) {
            for (int var9 = arg1 + 1; var9 < (arg1 + arg2); var9++) {
                if (var9 >= 0 && this.field7834 > var9) {
                    this.field7828[arg5][var9][arg4] = this.field7828[arg5][var9][arg4 - 1];
                }
            }
        }
        if (arg1 < 0 || arg4 < 0 || this.field7834 <= arg1 || this.field7832 <= arg4) {
            return;
        }
        if (arg5 == 0) {
            if (arg1 > 0 && this.field7828[arg5][arg1 - 1][arg4] != 0) {
                this.field7828[arg5][arg1][arg4] = this.field7828[arg5][arg1 - 1][arg4];
                return;
            }
            if (arg4 > 0 && this.field7828[arg5][arg1][arg4 - 1] != 0) {
                this.field7828[arg5][arg1][arg4] = this.field7828[arg5][arg1][arg4 - 1];
                return;
            }
            if (arg1 > 0 && arg4 > 0 && this.field7828[arg5][arg1 - 1][arg4 - 1] != 0) {
                this.field7828[arg5][arg1][arg4] = this.field7828[arg5][arg1 - 1][arg4 - 1];
                return;
            }
        } else if (arg1 <= 0 || this.field7828[arg5 - 1][arg1 - 1][arg4] == this.field7828[arg5][arg1 - 1][arg4]) {
            if (arg4 <= 0 || this.field7828[arg5][arg1][arg4 - 1] == this.field7828[arg5 - 1][arg1][arg4 - 1]) {
                if (arg1 > 0 && arg4 > 0 && this.field7828[arg5][arg1 - 1][arg4 - 1] != this.field7828[arg5 - 1][arg1 - 1][arg4 - 1]) {
                    this.field7828[arg5][arg1][arg4] = this.field7828[arg5][arg1 - 1][arg4 - 1];
                    return;
                }
                return;
            }
            this.field7828[arg5][arg1][arg4] = this.field7828[arg5][arg1][arg4 - 1];
        } else {
            this.field7828[arg5][arg1][arg4] = this.field7828[arg5][arg1 - 1][arg4];
            return;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lha;ILs;I[[ILs;Ls;)V", line = 1542)
    private final void method3264(class65 arg0, int arg1, class294 arg2, int arg3, int[][] arg4, class294 arg5, class294 arg6) {
        field7846++;
        byte[][] var8 = this.field7829[arg3];
        byte[][] var9 = this.field7837[arg3];
        if (arg1 != -6795) {
            this.field7851 = null;
        }
        byte[][] var10 = this.field7841[arg3];
        byte[][] var11 = this.field7842[arg3];
        for (int var12 = 0; var12 < this.field7834; var12++) {
            int var13 = var12 >= this.field7834 - 1 ? var12 : var12 + 1;
            for (int var14 = 0; var14 < this.field7832; var14++) {
                int var15 = (this.field7832 - 1) <= var14 ? var14 : var14 + 1;
                if (class451.field6344 == -1 || class580.method3400(var12, arg3, var14, class451.field6344, arg1 + 6894)) {
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
                        class374 var26 = var21 == 0 ? null : this.field7852.method3998(64, var21 - 1);
                        if (var19 == 0 && var26 == null) {
                            var19 = 12;
                        }
                        class510 var27 = var22 == 0 ? null : this.field7851.method3925(true, var22 - 1);
                        class374 var28 = var26;
                        if (var26 != null) {
                            if (var26.field5158 == -1 && var26.field5167 == -1) {
                                var28 = var26;
                                var26 = null;
                            } else if (var27 != null && var19 != 0) {
                                var17 = var26.field5168;
                            }
                        }
                        if ((var19 == 0 || var19 == 12) && var12 > 0 && var14 > 0 && var12 < this.field7834 && var14 < this.field7832) {
                            byte var29 = 0;
                            byte var30 = 0;
                            byte var31 = 0;
                            int var32 = var31 + (var10[var13][var15] == var22 ? 1 : -1);
                            byte var33 = 0;
                            int var34 = var30 + (var10[var13][var14 - 1] == var22 ? 1 : -1);
                            int var35 = var29 + (var10[var12 - 1][var14 - 1] == var22 ? 1 : -1);
                            if (var10[var12][var14 - 1] == var22) {
                                var34++;
                                var35++;
                            } else {
                                var34--;
                                var35--;
                            }
                            int var36 = var33 + (var10[var12 - 1][var15] == var22 ? 1 : -1);
                            if (var10[var13][var14] == var22) {
                                var32++;
                                var34++;
                            } else {
                                var32--;
                                var34--;
                            }
                            if (var10[var12][var15] == var22) {
                                var36++;
                                var32++;
                            } else {
                                var32--;
                                var36--;
                            }
                            if (var10[var12 - 1][var14] == var22) {
                                var35++;
                                var36++;
                            } else {
                                var36--;
                                var35--;
                            }
                            int var37 = var35 - var32;
                            if (var37 < 0) {
                                var37 = -var37;
                            }
                            int var38 = var34 - var36;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            if (var37 == var38) {
                                var37 = arg2.method1904(var14, (byte) -126, var12) - arg2.method1904(var15, (byte) -126, var13);
                                var38 = arg2.method1904(var14, (byte) 63, var13) - arg2.method1904(var15, (byte) -122, var12);
                                if (var37 < 0) {
                                    var37 = -var37;
                                }
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                            }
                            var20 = var38 > var37 ? 1 : 0;
                        }
                        for (int var39 = 0; var39 < 13; var39++) {
                            class22.field366[var39] = -1;
                            class36.field481[var39] = 1;
                        }
                        boolean[] var40 = var26 != null && var26.field5168 ? class502.field7114[var19] : class233.field3511[var19];
                        this.method3253(var9, var19, (byte) -97, this.field7832, arg0, var12, var20, var27, var14, var26, var11, var8, this.field7834, var18);
                        boolean var41 = var26 != null && var26.field5167 != var26.field5158;
                        if (!var41) {
                            for (int var42 = 0; var42 < 8; var42++) {
                                if (class22.field366[var42] >= 0 && class229.field3500[var42] != class199.field3043[var42]) {
                                    var41 = true;
                                    break;
                                }
                            }
                        }
                        if (!var40[var20 + 1 & 0x3]) {
                            var18[1] = class171.method1259(var18[1], class702.method3977(class36.field481[4], class36.field481[2]) == 0);
                        }
                        if (!var40[var20 + 3 & 0x3]) {
                            var18[3] = class171.method1259(var18[3], class702.method3977(class36.field481[0], class36.field481[6]) == 0);
                        }
                        if (!var40[var20 & 0x3]) {
                            var18[0] = class171.method1259(var18[0], class702.method3977(class36.field481[2], class36.field481[0]) == 0);
                        }
                        if (!var40[var20 + 2 & 0x3]) {
                            var18[2] = class171.method1259(var18[2], class702.method3977(class36.field481[6], class36.field481[4]) == 0);
                        }
                        if (!var17 && (var19 == 0 || var19 == 12)) {
                            if (var18[0] && !var18[1] && !var18[2] && var18[3]) {
                                var20 = 0;
                                var19 = var19 == 0 ? 13 : 14;
                                var18[0] = var18[3] = false;
                            } else if (var18[0] && var18[1] && !var18[2] && !var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var20 = 3;
                                var18[0] = var18[1] = false;
                            } else if (!var18[0] && var18[1] && var18[2] && !var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var18[1] = var18[2] = false;
                                var20 = 2;
                            } else if (!var18[0] && !var18[1] && var18[2] && var18[3]) {
                                var18[2] = var18[3] = false;
                                var20 = 1;
                                var19 = var19 == 0 ? 13 : 14;
                            }
                        }
                        boolean var43 = !var17 && !var18[0] && !var18[2] && !var18[1] && !var18[3];
                        int[] var44 = null;
                        int[] var45;
                        int var46;
                        int[] var47;
                        int var48;
                        int[] var49;
                        if (var43) {
                            var45 = class549.field7895[var19];
                            var46 = var27 == null ? 0 : class521.field7353[var19];
                            var47 = class465.field6549[var19];
                            var48 = var26 == null ? 0 : class360.field5054[var19];
                            var49 = class489.field6928[var19];
                        } else if (var17) {
                            var44 = class738.field10178[var19];
                            var45 = class788.field10820[var19];
                            var47 = class56.field713[var19];
                            var46 = var27 == null ? 0 : class531.field7678[var19];
                            var49 = class751.field10386[var19];
                            var48 = var26 == null ? 0 : class577.field8130[var19];
                        } else {
                            var45 = class598.field8404[var19];
                            var49 = class306.field4411[var19];
                            var46 = var27 == null ? 0 : class742.field10292[var19];
                            var48 = var26 == null ? 0 : class226.field3472[var19];
                            var47 = class282.field4153[var19];
                            var44 = class562.field7989[var19];
                        }
                        int var50 = var46 + var48;
                        if (var50 <= 0) {
                            class442.method2638(arg3, var12, var14);
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
                            int[] var61 = arg6 == null && arg5 == null ? null : new int[var53];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var26 != null) {
                                var64 = var26.field5161;
                                var62 = var26.field5158;
                                var63 = var26.field5164;
                                int var65 = class489.method2917(arg0, -86, var26);
                                for (int var66 = 0; var66 < var48; var66++) {
                                    boolean var67 = false;
                                    byte var68;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class227.field3486[0] = var47[var51];
                                        class227.field3486[1] = 1;
                                        class227.field3486[2] = var45[var51];
                                        class227.field3486[3] = 1;
                                        class227.field3486[4] = var49[var51];
                                        class227.field3486[5] = var45[var51];
                                        var68 = 6;
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class227.field3486[0] = var47[var51];
                                        class227.field3486[1] = 5;
                                        class227.field3486[2] = var45[var51];
                                        class227.field3486[3] = 5;
                                        class227.field3486[4] = var49[var51];
                                        class227.field3486[5] = var45[var51];
                                        var68 = 6;
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class227.field3486[0] = var47[var51];
                                        class227.field3486[1] = 3;
                                        class227.field3486[2] = var45[var51];
                                        class227.field3486[3] = 3;
                                        class227.field3486[4] = var49[var51];
                                        class227.field3486[5] = var45[var51];
                                        var68 = 6;
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class227.field3486[0] = var47[var51];
                                        class227.field3486[1] = 7;
                                        class227.field3486[2] = var45[var51];
                                        class227.field3486[3] = 7;
                                        class227.field3486[4] = var49[var51];
                                        var68 = 6;
                                        class227.field3486[5] = var45[var51];
                                    } else {
                                        class227.field3486[0] = var47[var51];
                                        class227.field3486[1] = var49[var51];
                                        var68 = 3;
                                        class227.field3486[2] = var45[var51];
                                    }
                                    for (int var69 = 0; var69 < var68; var69++) {
                                        int var70 = class227.field3486[var69];
                                        int var71 = var70 - (var20 * 2) & 0x7;
                                        int var72 = this.field7848[var70];
                                        int var73 = this.field7831[var70];
                                        int var74;
                                        int var75;
                                        if (var20 == 1) {
                                            var74 = 512 - var72;
                                            var75 = var73;
                                        } else if (var20 == 2) {
                                            var75 = 512 - var72;
                                            var74 = 512 - var73;
                                        } else if (var20 == 3) {
                                            var74 = var72;
                                            var75 = 512 - var73;
                                        } else {
                                            var75 = var72;
                                            var74 = var73;
                                        }
                                        var55[var52] = var75;
                                        var56[var52] = var74;
                                        if (var60 != null && class343.field4786[var19][var70]) {
                                            int var76 = (var12 << 9) + var75;
                                            int var77 = (var14 << 9) + var74;
                                            var60[var52] = arg6.method1918(var76, (byte) 127, var77) - arg2.method1918(var76, (byte) 127, var77);
                                        }
                                        if (var61 != null) {
                                            if (arg6 != null && !class343.field4786[var19][var70]) {
                                                int var78 = (var12 << 9) + var75;
                                                int var79 = (var14 << 9) + var74;
                                                var61[var52] = arg2.method1918(var78, (byte) 127, var79) - arg6.method1918(var78, (byte) 125, var79);
                                            } else if (arg5 != null && !class651.field9090[var19][var70]) {
                                                int var80 = (var12 << 9) + var75;
                                                int var81 = (var14 << 9) + var74;
                                                var61[var52] = arg5.method1918(var80, (byte) 127, var81) - arg2.method1918(var80, (byte) 126, var81);
                                            }
                                        }
                                        if (var70 < 8 && var26.field5171 < class22.field366[var71]) {
                                            if (var54 != null) {
                                                var54[var52] = class199.field3043[var71];
                                            }
                                            var59[var52] = class387.field5358[var71];
                                            var58[var52] = class351.field4913[var71];
                                            var57[var52] = class229.field3500[var71];
                                        } else {
                                            if (var54 != null) {
                                                var54[var52] = var65;
                                            }
                                            var58[var52] = var26.field5164;
                                            var59[var52] = var26.field5161;
                                            var57[var52] = var62;
                                        }
                                        var52++;
                                    }
                                    var51++;
                                }
                                if (!this.field7823 && arg3 == 0) {
                                    class413.method2501(var12, var14, var26.field5160, var26.field5166 * 8, var26.field5157);
                                }
                                if (var19 != 12 && var26.field5158 != -1 && var26.field5172) {
                                    var16 = true;
                                }
                            } else if (var43) {
                                var51 += class360.field5054[var19];
                            } else if (var17) {
                                var51 += class577.field8130[var19];
                            } else {
                                var51 += class226.field3472[var19];
                            }
                            if (var27 != null) {
                                if (var24 == 0) {
                                    var24 = var22;
                                }
                                if (var23 == 0) {
                                    var23 = var22;
                                }
                                if (var25 == 0) {
                                    var25 = var22;
                                }
                                class510 var82 = this.field7851.method3925(true, var22 - 1);
                                class510 var83 = this.field7851.method3925(true, var23 - 1);
                                class510 var84 = this.field7851.method3925(true, var24 - 1);
                                class510 var85 = this.field7851.method3925(true, var25 - 1);
                                for (int var86 = 0; var86 < var46; var86++) {
                                    boolean var87 = false;
                                    byte var88;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class227.field3486[0] = var47[var51];
                                        class227.field3486[1] = 1;
                                        class227.field3486[2] = var45[var51];
                                        class227.field3486[3] = 1;
                                        class227.field3486[4] = var49[var51];
                                        var88 = 6;
                                        class227.field3486[5] = var45[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class227.field3486[0] = var47[var51];
                                        class227.field3486[1] = 5;
                                        class227.field3486[2] = var45[var51];
                                        class227.field3486[3] = 5;
                                        class227.field3486[4] = var49[var51];
                                        class227.field3486[5] = var45[var51];
                                        var88 = 6;
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class227.field3486[0] = var47[var51];
                                        class227.field3486[1] = 3;
                                        class227.field3486[2] = var45[var51];
                                        class227.field3486[3] = 3;
                                        class227.field3486[4] = var49[var51];
                                        var88 = 6;
                                        class227.field3486[5] = var45[var51];
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class227.field3486[0] = var47[var51];
                                        class227.field3486[1] = 7;
                                        class227.field3486[2] = var45[var51];
                                        class227.field3486[3] = 7;
                                        class227.field3486[4] = var49[var51];
                                        var88 = 6;
                                        class227.field3486[5] = var45[var51];
                                    } else {
                                        class227.field3486[0] = var47[var51];
                                        class227.field3486[1] = var49[var51];
                                        class227.field3486[2] = var45[var51];
                                        var88 = 3;
                                    }
                                    var51++;
                                    for (int var89 = 0; var89 < var88; var89++) {
                                        int var90 = class227.field3486[var89];
                                        int var91 = var90 - (var20 * 2) & 0x7;
                                        int var92 = this.field7848[var90];
                                        int var93 = this.field7831[var90];
                                        int var94;
                                        int var95;
                                        if (var20 == 1) {
                                            var94 = var93;
                                            var95 = 512 - var92;
                                        } else if (var20 == 2) {
                                            var95 = 512 - var93;
                                            var94 = 512 - var92;
                                        } else if (var20 == 3) {
                                            var94 = 512 - var93;
                                            var95 = var92;
                                        } else {
                                            var95 = var93;
                                            var94 = var92;
                                        }
                                        var55[var52] = var94;
                                        var56[var52] = var95;
                                        if (var60 != null && class343.field4786[var19][var90]) {
                                            int var96 = (var12 << 9) + var94;
                                            int var97 = (var14 << 9) + var95;
                                            var60[var52] = arg6.method1918(var96, (byte) 126, var97) - arg2.method1918(var96, (byte) 126, var97);
                                        }
                                        if (var61 != null) {
                                            if (arg6 != null && !class343.field4786[var19][var90]) {
                                                int var98 = (var12 << 9) + var94;
                                                int var99 = (var14 << 9) + var95;
                                                var61[var52] = arg2.method1918(var98, (byte) 127, var99) - arg6.method1918(var98, (byte) 127, var99);
                                            } else if (arg5 != null && !class651.field9090[var19][var90]) {
                                                int var100 = (var12 << 9) + var94;
                                                int var101 = (var14 << 9) + var95;
                                                var61[var52] = arg5.method1918(var100, (byte) 127, var101) - arg2.method1918(var100, (byte) 127, var101);
                                            }
                                        }
                                        if (var90 < 8 && class22.field366[var91] >= 0) {
                                            if (var54 != null) {
                                                var54[var52] = class199.field3043[var91];
                                            }
                                            var59[var52] = class387.field5358[var91];
                                            var58[var52] = class351.field4913[var91];
                                            var57[var52] = class229.field3500[var91];
                                        } else {
                                            if (var17 && class343.field4786[var19][var90]) {
                                                var58[var52] = var63;
                                                var59[var52] = var64;
                                                var57[var52] = var62;
                                            } else if (var94 == 0 && var95 == 0) {
                                                var57[var52] = arg4[var12][var14];
                                                var58[var52] = var82.field7218;
                                                var59[var52] = var82.field7215;
                                            } else if (var94 == 0 && var95 == 512) {
                                                var57[var52] = arg4[var12][var15];
                                                var58[var52] = var83.field7218;
                                                var59[var52] = var83.field7215;
                                            } else if (var94 == 512 && var95 == 512) {
                                                var57[var52] = arg4[var13][var15];
                                                var58[var52] = var84.field7218;
                                                var59[var52] = var84.field7215;
                                            } else if (var94 == 512 && var95 == 0) {
                                                var57[var52] = arg4[var13][var14];
                                                var58[var52] = var85.field7218;
                                                var59[var52] = var85.field7215;
                                            } else {
                                                if (var94 < 256) {
                                                    if (var95 < 256) {
                                                        var58[var52] = var82.field7218;
                                                        var59[var52] = var82.field7215;
                                                    } else {
                                                        var58[var52] = var83.field7218;
                                                        var59[var52] = var83.field7215;
                                                    }
                                                } else if (var95 < 256) {
                                                    var58[var52] = var85.field7218;
                                                    var59[var52] = var85.field7215;
                                                } else {
                                                    var58[var52] = var84.field7218;
                                                    var59[var52] = var84.field7215;
                                                }
                                                int var102 = class345.method2187((byte) -78, arg4[var13][var14], arg4[var12][var14], var94 << 7 >> 9);
                                                int var103 = class345.method2187((byte) -103, arg4[var13][var15], arg4[var12][var15], var94 << 7 >> 9);
                                                var57[var52] = class345.method2187((byte) -121, var103, var102, var95 << 7 >> 9);
                                            }
                                            if (var54 != null) {
                                                var54[var52] = var57[var52];
                                            }
                                        }
                                        var52++;
                                    }
                                }
                                if (var19 != 0 && var27.field7208) {
                                    var16 = true;
                                }
                            }
                            int var104 = arg2.method1904(var14, (byte) 47, var12);
                            int var105 = arg2.method1904(var14, (byte) 120, var13);
                            int var106 = arg2.method1904(var15, (byte) -123, var13);
                            int var107 = arg2.method1904(var15, (byte) 40, var12);
                            boolean var108 = class124.method941(4, var14, var12);
                            if (var108 && arg3 > 1 || !var108 && arg3 > 0) {
                                boolean var109 = true;
                                if (var27 != null && !var27.field7224) {
                                    var109 = false;
                                } else if (var22 == 0 && var19 != 0) {
                                    var109 = false;
                                } else if (var21 > 0 && var28 != null && !var28.field5155) {
                                    var109 = false;
                                }
                                if (var109 && var104 == var105 && var104 == var106 && var104 == var107) {
                                    this.field7835[arg3][var12][var14] = (byte) class746.method4158(this.field7835[arg3][var12][var14], 4);
                                }
                            }
                            int var110 = 0;
                            int var111 = 0;
                            int var112 = 0;
                            if (this.field7823) {
                                var110 = class422.method2558(var12, var14);
                                var111 = class60.method403(var12, var14);
                                var112 = class465.method2783(var12, var14);
                            }
                            arg2.method1908(var12, var14, var55, var60, var56, var61, var57, var54, var58, var59, var110, var111, var112, var16);
                            class442.method2638(arg3, var12, var14);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILso;IIIIIIIZI)V", line = 2410)
    private final void method3265(int arg0, class494 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        if (arg3 == 1) {
            arg0 = 1;
        } else if (arg3 == 2) {
            arg7 = 1;
            arg0 = 1;
        } else if (arg3 == 3) {
            arg7 = 1;
        }
        if (arg2 <= 31) {
            return;
        }
        field7830++;
        if (arg5 < 0 || arg5 >= this.field7834 || arg6 < 0 || this.field7832 <= arg6) {
            while (true) {
                int var14 = arg1.method2964((byte) 100);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg1.method2964((byte) 60);
                    return;
                }
                if (var14 <= 49) {
                    arg1.method2964((byte) 40);
                }
            }
        }
        if (!this.field7823 && !arg9) {
            class190.field2932[arg4][arg5][arg6] = 0;
        }
        while (true) {
            int var12 = arg1.method2964((byte) 61);
            if (var12 == 0) {
                if (this.field7823) {
                    this.field7828[0][arg5 + arg7][arg0 + arg6] = 0;
                    return;
                } else if (arg4 == 0) {
                    this.field7828[0][arg5 + arg7][arg0 + arg6] = -class399.method2460(arg10 + 556238, arg8 + 932731, (byte) -114) * 8 << 2;
                    return;
                } else {
                    this.field7828[arg4][arg5 + arg7][arg0 + arg6] = this.field7828[arg4 - 1][arg5 + arg7][arg0 + arg6] - 960;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg1.method2964((byte) 100);
                if (this.field7823) {
                    this.field7828[0][arg5 + arg7][arg0 + arg6] = var13 * 8 << 2;
                    return;
                }
                if (var13 == 1) {
                    var13 = 0;
                }
                if (arg4 == 0) {
                    this.field7828[0][arg5 + arg7][arg0 + arg6] = -var13 * 8 << 2;
                    return;
                }
                this.field7828[arg4][arg5 + arg7][arg0 + arg6] = this.field7828[arg4 - 1][arg5 + arg7][arg6 + arg0] - (var13 * 8 << 2);
                return;
            }
            if (var12 <= 49) {
                if (arg9) {
                    arg1.method2964((byte) 116);
                } else {
                    this.field7842[arg4][arg5][arg6] = arg1.method2943((byte) 16);
                    this.field7829[arg4][arg5][arg6] = (byte) ((var12 - 2) / 4);
                    this.field7837[arg4][arg5][arg6] = (byte) class702.method3977(arg3 + var12 - 2, 3);
                }
            } else if (var12 <= 81) {
                if (!this.field7823 && !arg9) {
                    class190.field2932[arg4][arg5][arg6] = (byte) (var12 - 49);
                }
            } else if (!arg9) {
                this.field7841[arg4][arg5][arg6] = (byte) (var12 - 81);
            }
        }
    }
}
