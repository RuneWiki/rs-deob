import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class class323 {

    @OriginalMember(owner = "client!du", name = "i", descriptor = "[I")
    private int[] field4768 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

    @OriginalMember(owner = "client!du", name = "A", descriptor = "[I")
    private int[] field4786 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

    @OriginalMember(owner = "client!du", name = "t", descriptor = "I")
    public int field4779;

    @OriginalMember(owner = "client!du", name = "d", descriptor = "I")
    public int field4763;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "Z")
    public boolean field4760;

    @OriginalMember(owner = "client!du", name = "v", descriptor = "Ltu;")
    private class316 field4781;

    @OriginalMember(owner = "client!du", name = "z", descriptor = "I")
    public int field4785;

    @OriginalMember(owner = "client!du", name = "e", descriptor = "Lka;")
    private class435 field4764;

    @OriginalMember(owner = "client!du", name = "B", descriptor = "[[[B")
    private byte[][][] field4787;

    @OriginalMember(owner = "client!du", name = "y", descriptor = "[[[B")
    private byte[][][] field4784;

    @OriginalMember(owner = "client!du", name = "f", descriptor = "[[[I")
    public int[][][] field4765;

    @OriginalMember(owner = "client!du", name = "h", descriptor = "[[[B")
    private byte[][][] field4767;

    @OriginalMember(owner = "client!du", name = "n", descriptor = "[[[B")
    private byte[][][] field4773;

    @OriginalMember(owner = "client!du", name = "o", descriptor = "[[[B")
    public byte[][][] field4774;

    @OriginalMember(owner = "client!du", name = "b", descriptor = "I")
    public static int field4761;

    @OriginalMember(owner = "client!du", name = "g", descriptor = "I")
    public static int field4766;

    @OriginalMember(owner = "client!du", name = "j", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!du", name = "k", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!du", name = "l", descriptor = "I")
    public static int field4771;

    @OriginalMember(owner = "client!du", name = "m", descriptor = "I")
    public static int field4772;

    @OriginalMember(owner = "client!du", name = "p", descriptor = "I")
    public static int field4775;

    @OriginalMember(owner = "client!du", name = "q", descriptor = "I")
    public static int field4776;

    @OriginalMember(owner = "client!du", name = "r", descriptor = "I")
    public static int field4777;

    @OriginalMember(owner = "client!du", name = "s", descriptor = "I")
    public static int field4778;

    @OriginalMember(owner = "client!du", name = "w", descriptor = "I")
    public static int field4782;

    @OriginalMember(owner = "client!du", name = "x", descriptor = "I")
    public static int field4783;

    @OriginalMember(owner = "client!du", name = "c", descriptor = "Lbh;")
    public static class34 field4762;

    @OriginalMember(owner = "client!du", name = "u", descriptor = "[[[B")
    public byte[][][] field4780;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(I[[B[[BILr;ILtca;[[BIILpi;[ZII)V")
    private final void method2021(int arg0, byte[][] arg1, byte[][] arg2, int arg3, class166 arg4, int arg5, class156 arg6, byte[][] arg7, int arg8, int arg9, class460 arg10, boolean[] arg11, int arg12, int arg13) {
        int var15 = -12 / ((arg8 + 43) / 52);
        field4770++;
        boolean[] var16 = arg6 != null && arg6.field2249 ? class177.field2523[arg9] : class549.field7714[arg9];
        if (arg13 > 0) {
            if (arg12 > 0) {
                int var17 = arg2[arg12 - 1][arg13 - 1] & 0xFF;
                if (var17 > 0) {
                    class156 var18 = this.field4764.method2586(-20216, var17 - 1);
                    if (var18.field2241 != -1 && var18.field2249) {
                        byte var19 = arg7[arg12 - 1][arg13 - 1];
                        int var20 = arg1[arg12 - 1][arg13 - 1] * 2 + 4 & 0x7;
                        int var21 = class279.method1820(arg4, var18, -1);
                        if (class561.field7898[var19][var20]) {
                            class651.field9128[0] = var18.field2241;
                            class319.field4699[0] = var21;
                            class664.field9377[0] = var18.field2244;
                            class273.field4111[0] = var18.field2250;
                            class157.field2268[0] = var18.field2254;
                            class86.field1407[0] = 256;
                        }
                    }
                }
            }
            if (arg5 - 1 > arg12) {
                int var22 = arg2[arg12 + 1][arg13 - 1] & 0xFF;
                if (var22 > 0) {
                    class156 var23 = this.field4764.method2586(-20216, var22 - 1);
                    if (var23.field2241 != -1 && var23.field2249) {
                        byte var24 = arg7[arg12 + 1][arg13 - 1];
                        int var25 = arg1[arg12 + 1][arg13 - 1] * 2 + 6 & 0x7;
                        int var26 = class279.method1820(arg4, var23, -1);
                        if (class561.field7898[var24][var25]) {
                            class651.field9128[2] = var23.field2241;
                            class319.field4699[2] = var26;
                            class664.field9377[2] = var23.field2244;
                            class273.field4111[2] = var23.field2250;
                            class157.field2268[2] = var23.field2254;
                            class86.field1407[2] = 512;
                        }
                    }
                }
            }
        }
        if (arg13 < arg3 - 1) {
            if (arg12 > 0) {
                int var27 = arg2[arg12 - 1][arg13 + 1] & 0xFF;
                if (var27 > 0) {
                    class156 var28 = this.field4764.method2586(-20216, var27 - 1);
                    if (var28.field2241 != -1 && var28.field2249) {
                        byte var29 = arg7[arg12 - 1][arg13 + 1];
                        int var30 = arg1[arg12 - 1][arg13 + 1] * 2 + 2 & 0x7;
                        int var31 = class279.method1820(arg4, var28, -1);
                        if (class561.field7898[var29][var30]) {
                            class651.field9128[6] = var28.field2241;
                            class319.field4699[6] = var31;
                            class664.field9377[6] = var28.field2244;
                            class273.field4111[6] = var28.field2250;
                            class157.field2268[6] = var28.field2254;
                            class86.field1407[6] = 64;
                        }
                    }
                }
            }
            if (arg5 - 1 > arg12) {
                int var32 = arg2[arg12 + 1][arg13 + 1] & 0xFF;
                if (var32 > 0) {
                    class156 var33 = this.field4764.method2586(-20216, var32 - 1);
                    if (var33.field2241 != -1 && var33.field2249) {
                        byte var34 = arg7[arg12 + 1][arg13 + 1];
                        int var35 = arg1[arg12 + 1][arg13 + 1] * 2 & 0x7;
                        int var36 = class279.method1820(arg4, var33, -1);
                        if (class561.field7898[var34][var35]) {
                            class651.field9128[4] = var33.field2241;
                            class319.field4699[4] = var36;
                            class664.field9377[4] = var33.field2244;
                            class273.field4111[4] = var33.field2250;
                            class157.field2268[4] = var33.field2254;
                            class86.field1407[4] = 128;
                        }
                    }
                }
            }
        }
        if (arg13 > 0) {
            int var37 = arg2[arg12][arg13 - 1] & 0xFF;
            if (var37 > 0) {
                class156 var38 = this.field4764.method2586(-20216, var37 - 1);
                if (var38.field2241 != -1) {
                    byte var39 = arg7[arg12][arg13 - 1];
                    byte var40 = arg1[arg12][arg13 - 1];
                    if (var38.field2249) {
                        int var41 = 2;
                        int var42 = (var40 * 2) + 4;
                        int var43 = class279.method1820(arg4, var38, -1);
                        for (int var44 = 0; var44 < 3; var44++) {
                            var42 &= 0x7;
                            var41 &= 0x7;
                            if (class561.field7898[var39][var42] && class157.field2268[var41] <= var38.field2254) {
                                class651.field9128[var41] = var38.field2241;
                                class319.field4699[var41] = var43;
                                class664.field9377[var41] = var38.field2244;
                                class273.field4111[var41] = var38.field2250;
                                if (class157.field2268[var41] == var38.field2254) {
                                    class86.field1407[var41] = class486.method2826(class86.field1407[var41], 32);
                                } else {
                                    class86.field1407[var41] = 32;
                                }
                                class157.field2268[var41] = var38.field2254;
                            }
                            var41--;
                            var42++;
                        }
                        if (!var16[-(-arg0) & 0x3]) {
                            arg11[0] = class177.field2523[var39][class689.method3797(var40 + 2, 3)];
                        }
                    } else if (!var16[-(-arg0) & 0x3]) {
                        arg11[0] = class549.field7714[var39][class689.method3797(3, var40 + 2)];
                    }
                }
            }
        }
        if (arg3 - 1 > arg13) {
            int var45 = arg2[arg12][arg13 + 1] & 0xFF;
            if (var45 > 0) {
                class156 var46 = this.field4764.method2586(-20216, var45 - 1);
                if (var46.field2241 != -1) {
                    byte var47 = arg7[arg12][arg13 + 1];
                    byte var48 = arg1[arg12][arg13 + 1];
                    if (var46.field2249) {
                        int var49 = 4;
                        int var50 = (var48 * 2) + 2;
                        int var51 = class279.method1820(arg4, var46, -1);
                        for (int var52 = 0; var52 < 3; var52++) {
                            var50 &= 0x7;
                            var49 &= 0x7;
                            if (class561.field7898[var47][var50] && class157.field2268[var49] <= var46.field2254) {
                                class651.field9128[var49] = var46.field2241;
                                class319.field4699[var49] = var51;
                                class664.field9377[var49] = var46.field2244;
                                class273.field4111[var49] = var46.field2250;
                                if (class157.field2268[var49] == var46.field2254) {
                                    class86.field1407[var49] = class486.method2826(class86.field1407[var49], 16);
                                } else {
                                    class86.field1407[var49] = 16;
                                }
                                class157.field2268[var49] = var46.field2254;
                            }
                            var50--;
                            var49++;
                        }
                        if (!var16[arg0 + 2 & 0x3]) {
                            arg11[2] = class177.field2523[var47][class689.method3797(3, -(-var48))];
                        }
                    } else if (!var16[arg0 + 2 & 0x3]) {
                        arg11[2] = class549.field7714[var47][class689.method3797(var48, 3)];
                    }
                }
            }
        }
        if (arg12 > 0) {
            int var53 = arg2[arg12 - 1][arg13] & 0xFF;
            if (var53 > 0) {
                class156 var54 = this.field4764.method2586(-20216, var53 - 1);
                if (var54.field2241 != -1) {
                    byte var55 = arg7[arg12 - 1][arg13];
                    byte var56 = arg1[arg12 - 1][arg13];
                    if (var54.field2249) {
                        int var57 = 6;
                        int var58 = var56 * 2 + 4;
                        int var59 = class279.method1820(arg4, var54, -1);
                        for (int var60 = 0; var60 < 3; var60++) {
                            var57 &= 0x7;
                            var58 &= 0x7;
                            if (class561.field7898[var55][var58] && class157.field2268[var57] <= var54.field2254) {
                                class651.field9128[var57] = var54.field2241;
                                class319.field4699[var57] = var59;
                                class664.field9377[var57] = var54.field2244;
                                class273.field4111[var57] = var54.field2250;
                                if (class157.field2268[var57] == var54.field2254) {
                                    class86.field1407[var57] = class486.method2826(class86.field1407[var57], 8);
                                } else {
                                    class86.field1407[var57] = 8;
                                }
                                class157.field2268[var57] = var54.field2254;
                            }
                            var58--;
                            var57++;
                        }
                        if (!var16[arg0 + 3 & 0x3]) {
                            arg11[3] = class177.field2523[var55][class689.method3797(3, var56 + 1)];
                        }
                    } else if (!var16[arg0 + 3 & 0x3]) {
                        arg11[3] = class549.field7714[var55][class689.method3797(var56 + 1, 3)];
                    }
                }
            }
        }
        if (arg12 < arg5 - 1) {
            int var61 = arg2[arg12 + 1][arg13] & 0xFF;
            if (var61 > 0) {
                class156 var62 = this.field4764.method2586(-20216, var61 - 1);
                if (var62.field2241 != -1) {
                    byte var63 = arg7[arg12 + 1][arg13];
                    byte var64 = arg1[arg12 + 1][arg13];
                    if (var62.field2249) {
                        int var65 = 4;
                        int var66 = var64 * 2 + 6;
                        int var67 = class279.method1820(arg4, var62, -1);
                        for (int var68 = 0; var68 < 3; var68++) {
                            var65 &= 0x7;
                            var66 &= 0x7;
                            if (class561.field7898[var63][var66] && var62.field2254 >= class157.field2268[var65]) {
                                class651.field9128[var65] = var62.field2241;
                                class319.field4699[var65] = var67;
                                class664.field9377[var65] = var62.field2244;
                                class273.field4111[var65] = var62.field2250;
                                if (class157.field2268[var65] == var62.field2254) {
                                    class86.field1407[var65] = class486.method2826(class86.field1407[var65], 4);
                                } else {
                                    class86.field1407[var65] = 4;
                                }
                                class157.field2268[var65] = var62.field2254;
                            }
                            var66++;
                            var65--;
                        }
                        if (!var16[arg0 + 1 & 0x3]) {
                            arg11[1] = class177.field2523[var63][class689.method3797(3, var64 + 3)];
                        }
                    } else if (!var16[arg0 + 1 & 0x3]) {
                        arg11[1] = class549.field7714[var63][class689.method3797(var64 + 3, 3)];
                    }
                }
            }
        }
        if (arg6 == null) {
            return;
        }
        int var69 = class279.method1820(arg4, arg6, -1);
        if (!arg6.field2249) {
            return;
        }
        for (int var70 = 0; var70 < 8; var70++) {
            int var71 = var70 - (arg0 * 2) & 0x7;
            if (class561.field7898[arg9][var70] && class157.field2268[var71] <= arg6.field2254) {
                class651.field9128[var71] = arg6.field2241;
                class319.field4699[var71] = var69;
                class664.field9377[var71] = arg6.field2244;
                class273.field4111[var71] = arg6.field2250;
                if (class157.field2268[var71] == arg6.field2254) {
                    class86.field1407[var71] = class486.method2826(class86.field1407[var71], 2);
                } else {
                    class86.field1407[var71] = 2;
                }
                class157.field2268[var71] = arg6.field2254;
            }
        }
        return;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(I[Lcp;IILmo;BI)V")
    public final void method2022(int arg0, class674[] arg1, int arg2, int arg3, class695 arg4, byte arg5, int arg6) {
        if (arg5 != 76) {
            this.field4774 = null;
        }
        field4772++;
        if (!this.field4760) {
            for (int var8 = 0; var8 < 4; var8++) {
                class674 var9 = arg1[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg2 + var10;
                        int var13 = arg6 + var11;
                        if (var12 >= 0 && var12 < this.field4763 && var13 >= 0 && var13 < this.field4785) {
                            var9.method3753(arg5 - 20483, var12, var13);
                        }
                    }
                }
            }
        }
        int var14 = arg0 + arg2;
        int var15 = arg3 + arg6;
        for (int var16 = 0; var16 < this.field4779; var16++) {
            for (int var17 = 0; var17 < 64; var17++) {
                for (int var18 = 0; var18 < 64; var18++) {
                    this.method2026(556238, arg6 + var18, false, 0, var14 + var17, arg2 + var17, var16, var15 + var18, 0, 0, arg4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(Lmo;IIIII[Lcp;ZII)V")
    public final void method2023(class695 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class674[] arg6, boolean arg7, int arg8, int arg9) {
        field4771++;
        int var11 = (arg9 & 0x7) * 8;
        if (!this.field4760) {
            class674 var12 = arg6[arg1];
            for (int var13 = 0; var13 < 8; var13++) {
                for (int var14 = 0; var14 < 8; var14++) {
                    int var15 = arg5 + class392.method2410(arg4, var13 & 0x7, var14 & 0x7, 1);
                    int var16 = class239.method1637(arg4, 119, var13 & 0x7, var14 & 0x7) + arg2;
                    if (var15 > 0 && (this.field4763 - 1) > var15 && var16 > 0 && this.field4785 - 1 > var16) {
                        var12.method3753(-20407, var15, var16);
                    }
                }
            }
        }
        int var17 = (arg8 & 0x7) * 8;
        int var18 = (arg9 & 0xFFFFFFF8) << 3;
        if (arg7) {
            return;
        }
        int var19 = arg8 & 0x1FFFFFF8 << 3;
        byte var20 = 0;
        byte var21 = 0;
        if (arg4 == 1) {
            var21 = 1;
        } else if (arg4 == 2) {
            var20 = 1;
            var21 = 1;
        } else if (arg4 == 3) {
            var20 = 1;
        }
        for (int var22 = 0; var22 < this.field4779; var22++) {
            for (int var23 = 0; var23 < 64; var23++) {
                for (int var24 = 0; var24 < 64; var24++) {
                    if (arg3 == var22 && var11 <= var23 && var11 + 8 >= var23 && var24 >= var17 && var24 <= (var17 + 8)) {
                        int var25;
                        int var26;
                        if (var11 + 8 == var23 || (var17 + 8) == var24) {
                            if (arg4 == 0) {
                                var26 = arg2 + var24 - var17;
                                var25 = var23 + arg5 - var11;
                            } else if (arg4 == 1) {
                                var26 = arg2 + 8 - (-var11 + var23);
                                var25 = arg5 + var24 - var17;
                            } else if (arg4 == 2) {
                                var26 = var17 + arg2 + 8 - var24;
                                var25 = arg5 + 8 - (-var11 + var23);
                            } else {
                                var25 = var17 + arg5 + 8 - var24;
                                var26 = arg2 - (var11 - var23);
                            }
                            this.method2026(556238, var26, true, 0, var18 + var23, var25, arg1, var19 + var24, 0, 0, arg0);
                        } else {
                            var25 = arg5 + class392.method2410(arg4, var23 & 0x7, var24 & 0x7, 1);
                            var26 = arg2 + class239.method1637(arg4, 82, var23 & 0x7, var24 & 0x7);
                            this.method2026(556238, var26, false, var21, var18 + var23, var25, arg1, var19 + var24, arg4, var20, arg0);
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
                                    var29 = var23 == 63 ? 64 : var23;
                                    var30 = var24 == 63 ? 64 : var24;
                                } else if (var28 == 1) {
                                    var29 = 64;
                                } else if (var28 == 2) {
                                    var30 = 64;
                                }
                                int var31;
                                int var32;
                                if (arg4 == 0) {
                                    var31 = var30 + arg2 - var17;
                                    var32 = arg5 + var29 - var11;
                                } else if (arg4 == 1) {
                                    var32 = var30 + arg5 - var17;
                                    var31 = var11 + arg2 + 8 - var29;
                                } else if (arg4 == 2) {
                                    var31 = arg2 + var17 + 8 - var30;
                                    var32 = arg5 + var11 + 8 - var29;
                                } else {
                                    var32 = var17 + arg5 + 8 - var30;
                                    var31 = arg2 - (var11 - var29);
                                }
                                if (var32 >= 0 && this.field4763 > var32 && var31 >= 0 && var31 < this.field4785) {
                                    this.field4765[arg1][var32][var31] = this.field4765[arg1][var20 + var25][var21 + var26];
                                }
                            }
                        }
                    } else {
                        this.method2026(556238, -1, false, 0, 0, -1, 0, 0, 0, 0, arg0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(Lr;ILi;ZLi;Li;[[I)V")
    private final void method2024(class166 arg0, int arg1, class37 arg2, boolean arg3, class37 arg4, class37 arg5, int[][] arg6) {
        field4777++;
        byte[][] var8 = this.field4787[arg1];
        byte[][] var9 = this.field4767[arg1];
        byte[][] var10 = this.field4784[arg1];
        byte[][] var11 = this.field4773[arg1];
        for (int var12 = 0; var12 < this.field4763; var12++) {
            int var13 = (this.field4763 - 1) > var12 ? var12 + 1 : var12;
            for (int var14 = 0; var14 < this.field4785; var14++) {
                int var15 = (this.field4785 - 1) > var14 ? var14 + 1 : var14;
                if (class466.field6703 == -1 || class278.method1815(5, arg1, var14, class466.field6703, var12)) {
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
                        class156 var26 = var21 == 0 ? null : this.field4764.method2586(-20216, var21 - 1);
                        class460 var27 = var22 == 0 ? null : this.field4781.method1993(var22 - 1, true);
                        if (var19 == 0 && var26 == null) {
                            var19 = 12;
                        }
                        class156 var28 = var26;
                        if (var26 != null) {
                            if (var26.field2241 == -1 && var26.field2248 == -1) {
                                var28 = var26;
                                var26 = null;
                            } else if (var27 != null && var19 != 0) {
                                var17 = var26.field2249;
                            }
                        }
                        if ((var19 == 0 || var19 == 12) && var12 > 0 && var14 > 0 && this.field4763 > var12 && var14 < this.field4785) {
                            byte var29 = 0;
                            byte var30 = 0;
                            byte var31 = 0;
                            int var32 = var29 + (var10[var12 - 1][var14 - 1] == var22 ? 1 : -1);
                            int var33 = var31 + (var10[var13][var15] == var22 ? 1 : -1);
                            byte var34 = 0;
                            int var35 = var30 + (var10[var13][var14 - 1] == var22 ? 1 : -1);
                            if (var10[var12][var14 - 1] == var22) {
                                var35++;
                                var32++;
                            } else {
                                var35--;
                                var32--;
                            }
                            int var36 = var34 + (var10[var12 - 1][var15] == var22 ? 1 : -1);
                            if (var10[var13][var14] == var22) {
                                var33++;
                                var35++;
                            } else {
                                var35--;
                                var33--;
                            }
                            if (var10[var12][var15] == var22) {
                                var33++;
                                var36++;
                            } else {
                                var36--;
                                var33--;
                            }
                            if (var10[var12 - 1][var14] == var22) {
                                var36++;
                                var32++;
                            } else {
                                var36--;
                                var32--;
                            }
                            int var37 = var32 - var33;
                            if (var37 < 0) {
                                var37 = -var37;
                            }
                            int var38 = var35 - var36;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            if (var37 == var38) {
                                var37 = arg2.method432(var12, false, var14) - arg2.method432(var13, false, var15);
                                if (var37 < 0) {
                                    var37 = -var37;
                                }
                                var38 = arg2.method432(var13, false, var14) - arg2.method432(var12, arg3, var15);
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                            }
                            var20 = var37 < var38 ? 1 : 0;
                        }
                        for (int var39 = 0; var39 < 13; var39++) {
                            class157.field2268[var39] = -1;
                            class86.field1407[var39] = 1;
                        }
                        boolean[] var40 = var26 != null && var26.field2249 ? class177.field2523[var19] : class549.field7714[var19];
                        this.method2021(var20, var9, var11, this.field4785, arg0, this.field4763, var26, var8, 74, var19, var27, var18, var12, var14);
                        boolean var41 = var26 != null && var26.field2248 != var26.field2241;
                        if (!var41) {
                            for (int var42 = 0; var42 < 8; var42++) {
                                if (class157.field2268[var42] >= 0 && class651.field9128[var42] != class319.field4699[var42]) {
                                    var41 = true;
                                    break;
                                }
                            }
                        }
                        if (!var40[var20 + 1 & 0x3]) {
                            var18[1] = class562.method3210(var18[1], class689.method3797(class86.field1407[2], class86.field1407[4]) == 0);
                        }
                        if (!var40[var20 + 3 & 0x3]) {
                            var18[3] = class562.method3210(var18[3], class689.method3797(class86.field1407[6], class86.field1407[0]) == 0);
                        }
                        if (!var40[var20 & 0x3]) {
                            var18[0] = class562.method3210(var18[0], class689.method3797(class86.field1407[0], class86.field1407[2]) == 0);
                        }
                        if (!var40[var20 + 2 & 0x3]) {
                            var18[2] = class562.method3210(var18[2], class689.method3797(class86.field1407[4], class86.field1407[6]) == 0);
                        }
                        if (!var17 && (var19 == 0 || var19 == 12)) {
                            if (var18[0] && !var18[1] && !var18[2] && var18[3]) {
                                var20 = 0;
                                var19 = var19 == 0 ? 13 : 14;
                                var18[0] = var18[3] = false;
                            } else if (var18[0] && var18[1] && !var18[2] && !var18[3]) {
                                var20 = 3;
                                var18[0] = var18[1] = false;
                                var19 = var19 == 0 ? 13 : 14;
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
                        int var46;
                        int[] var47;
                        int[] var48;
                        int[] var49;
                        if (var43) {
                            var45 = var27 == null ? 0 : class173.field2466[var19];
                            var46 = var26 == null ? 0 : class208.field2917[var19];
                            var47 = class334.field4951[var19];
                            var48 = class686.field9660[var19];
                            var49 = class358.field5133[var19];
                        } else if (var17) {
                            var46 = var26 == null ? 0 : class162.field2325[var19];
                            var48 = class667.field9426[var19];
                            var45 = var27 == null ? 0 : class114.field1747[var19];
                            var44 = class161.field2315[var19];
                            var47 = class22.field299[var19];
                            var49 = class379.field5376[var19];
                        } else {
                            var47 = class259.field3944[var19];
                            var48 = class157.field2261[var19];
                            var49 = class467.field6714[var19];
                            var46 = var26 == null ? 0 : class674.field9548[var19];
                            var44 = class665.field9388[var19];
                            var45 = var27 == null ? 0 : class619.field8654[var19];
                        }
                        int var50 = var46 + var45;
                        if (var50 <= 0) {
                            class701.method3903(arg1, var12, var14);
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
                            int[] var60 = arg4 == null ? null : new int[var53];
                            int[] var61 = arg4 == null && arg5 == null ? null : new int[var53];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var26 != null) {
                                var62 = var26.field2241;
                                var64 = var26.field2250;
                                var63 = var26.field2244;
                                int var65 = class279.method1820(arg0, var26, -1);
                                for (int var66 = 0; var66 < var46; var66++) {
                                    boolean var67 = false;
                                    byte var68;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class421.field6136[0] = var49[var51];
                                        class421.field6136[1] = 1;
                                        class421.field6136[2] = var47[var51];
                                        class421.field6136[3] = 1;
                                        class421.field6136[4] = var48[var51];
                                        var68 = 6;
                                        class421.field6136[5] = var47[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class421.field6136[0] = var49[var51];
                                        class421.field6136[1] = 5;
                                        class421.field6136[2] = var47[var51];
                                        class421.field6136[3] = 5;
                                        class421.field6136[4] = var48[var51];
                                        var68 = 6;
                                        class421.field6136[5] = var47[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class421.field6136[0] = var49[var51];
                                        class421.field6136[1] = 3;
                                        class421.field6136[2] = var47[var51];
                                        class421.field6136[3] = 3;
                                        class421.field6136[4] = var48[var51];
                                        var68 = 6;
                                        class421.field6136[5] = var47[var51];
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class421.field6136[0] = var49[var51];
                                        class421.field6136[1] = 7;
                                        class421.field6136[2] = var47[var51];
                                        class421.field6136[3] = 7;
                                        class421.field6136[4] = var48[var51];
                                        var68 = 6;
                                        class421.field6136[5] = var47[var51];
                                    } else {
                                        class421.field6136[0] = var49[var51];
                                        class421.field6136[1] = var48[var51];
                                        var68 = 3;
                                        class421.field6136[2] = var47[var51];
                                    }
                                    var51++;
                                    for (int var69 = 0; var69 < var68; var69++) {
                                        int var70 = class421.field6136[var69];
                                        int var71 = var70 - var20 * 2 & 0x7;
                                        int var72 = this.field4786[var70];
                                        int var73 = this.field4768[var70];
                                        int var74;
                                        int var75;
                                        if (var20 == 1) {
                                            var74 = var73;
                                            var75 = 512 - var72;
                                        } else if (var20 == 2) {
                                            var74 = 512 - var72;
                                            var75 = 512 - var73;
                                        } else if (var20 == 3) {
                                            var75 = var72;
                                            var74 = 512 - var73;
                                        } else {
                                            var74 = var72;
                                            var75 = var73;
                                        }
                                        var55[var52] = var74;
                                        var56[var52] = var75;
                                        if (var60 != null && class561.field7898[var19][var70]) {
                                            int var76 = (var12 << 9) + var74;
                                            int var77 = (var14 << 9) + var75;
                                            var60[var52] = arg4.method442(var76, true, var77) - arg2.method442(var76, true, var77);
                                        }
                                        if (var61 != null) {
                                            if (arg4 != null && !class561.field7898[var19][var70]) {
                                                int var78 = (var12 << 9) + var74;
                                                int var79 = (var14 << 9) + var75;
                                                var61[var52] = arg2.method442(var78, true, var79) - arg4.method442(var78, true, var79);
                                            } else if (arg5 != null && !class330.field4880[var19][var70]) {
                                                int var80 = (var12 << 9) + var74;
                                                int var81 = (var14 << 9) + var75;
                                                var61[var52] = arg5.method442(var80, true, var81) - arg2.method442(var80, true, var81);
                                            }
                                        }
                                        if (var70 < 8 && var26.field2254 < class157.field2268[var71]) {
                                            if (var54 != null) {
                                                var54[var52] = class319.field4699[var71];
                                            }
                                            var59[var52] = class273.field4111[var71];
                                            var58[var52] = class664.field9377[var71];
                                            var57[var52] = class651.field9128[var71];
                                        } else {
                                            if (var54 != null) {
                                                var54[var52] = var65;
                                            }
                                            var58[var52] = var26.field2244;
                                            var59[var52] = var26.field2250;
                                            var57[var52] = var62;
                                        }
                                        var52++;
                                    }
                                }
                                if (!this.field4760 && arg1 == 0) {
                                    class276.method1807(var12, var14, var26.field2252, var26.field2239 * 8, var26.field2242);
                                }
                                if (var19 != 12 && var26.field2241 != -1 && var26.field2245) {
                                    var16 = true;
                                }
                            } else if (var43) {
                                var51 += class208.field2917[var19];
                            } else if (var17) {
                                var51 += class162.field2325[var19];
                            } else {
                                var51 += class674.field9548[var19];
                            }
                            if (var27 != null) {
                                if (var23 == 0) {
                                    var23 = var22;
                                }
                                if (var25 == 0) {
                                    var25 = var22;
                                }
                                if (var24 == 0) {
                                    var24 = var22;
                                }
                                class460 var82 = this.field4781.method1993(var22 - 1, true);
                                class460 var83 = this.field4781.method1993(var23 - 1, true);
                                class460 var84 = this.field4781.method1993(var24 - 1, true);
                                class460 var85 = this.field4781.method1993(var25 - 1, true);
                                for (int var86 = 0; var86 < var45; var86++) {
                                    boolean var87 = false;
                                    byte var88;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class421.field6136[0] = var49[var51];
                                        class421.field6136[1] = 1;
                                        class421.field6136[2] = var47[var51];
                                        class421.field6136[3] = 1;
                                        class421.field6136[4] = var48[var51];
                                        class421.field6136[5] = var47[var51];
                                        var88 = 6;
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class421.field6136[0] = var49[var51];
                                        class421.field6136[1] = 5;
                                        class421.field6136[2] = var47[var51];
                                        class421.field6136[3] = 5;
                                        class421.field6136[4] = var48[var51];
                                        var88 = 6;
                                        class421.field6136[5] = var47[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class421.field6136[0] = var49[var51];
                                        class421.field6136[1] = 3;
                                        class421.field6136[2] = var47[var51];
                                        class421.field6136[3] = 3;
                                        class421.field6136[4] = var48[var51];
                                        class421.field6136[5] = var47[var51];
                                        var88 = 6;
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class421.field6136[0] = var49[var51];
                                        class421.field6136[1] = 7;
                                        class421.field6136[2] = var47[var51];
                                        class421.field6136[3] = 7;
                                        class421.field6136[4] = var48[var51];
                                        var88 = 6;
                                        class421.field6136[5] = var47[var51];
                                    } else {
                                        class421.field6136[0] = var49[var51];
                                        class421.field6136[1] = var48[var51];
                                        var88 = 3;
                                        class421.field6136[2] = var47[var51];
                                    }
                                    for (int var89 = 0; var89 < var88; var89++) {
                                        int var90 = class421.field6136[var89];
                                        int var91 = var90 - (var20 * 2) & 0x7;
                                        int var92 = this.field4786[var90];
                                        int var93 = this.field4768[var90];
                                        int var94;
                                        int var95;
                                        if (var20 == 1) {
                                            var95 = var93;
                                            var94 = 512 - var92;
                                        } else if (var20 == 2) {
                                            var94 = 512 - var93;
                                            var95 = 512 - var92;
                                        } else if (var20 == 3) {
                                            var95 = 512 - var93;
                                            var94 = var92;
                                        } else {
                                            var95 = var92;
                                            var94 = var93;
                                        }
                                        var55[var52] = var95;
                                        var56[var52] = var94;
                                        if (var60 != null && class561.field7898[var19][var90]) {
                                            int var96 = (var12 << 9) + var95;
                                            int var97 = (var14 << 9) + var94;
                                            var60[var52] = arg4.method442(var96, true, var97) - arg2.method442(var96, !arg3, var97);
                                        }
                                        if (var61 != null) {
                                            if (arg4 != null && !class561.field7898[var19][var90]) {
                                                int var98 = (var12 << 9) + var95;
                                                int var99 = (var14 << 9) + var94;
                                                var61[var52] = arg2.method442(var98, true, var99) - arg4.method442(var98, true, var99);
                                            } else if (arg5 != null && !class330.field4880[var19][var90]) {
                                                int var100 = (var12 << 9) + var95;
                                                int var101 = (var14 << 9) + var94;
                                                var61[var52] = arg5.method442(var100, true, var101) - arg2.method442(var100, true, var101);
                                            }
                                        }
                                        if (var90 < 8 && class157.field2268[var91] >= 0) {
                                            if (var54 != null) {
                                                var54[var52] = class319.field4699[var91];
                                            }
                                            var59[var52] = class273.field4111[var91];
                                            var58[var52] = class664.field9377[var91];
                                            var57[var52] = class651.field9128[var91];
                                        } else {
                                            if (var17 && class561.field7898[var19][var90]) {
                                                var58[var52] = var63;
                                                var59[var52] = var64;
                                                var57[var52] = var62;
                                            } else if (var95 == 0 && var94 == 0) {
                                                var57[var52] = arg6[var12][var14];
                                                var58[var52] = var82.field6584;
                                                var59[var52] = var82.field6574;
                                            } else if (var95 == 0 && var94 == 512) {
                                                var57[var52] = arg6[var12][var15];
                                                var58[var52] = var83.field6584;
                                                var59[var52] = var83.field6574;
                                            } else if (var95 == 512 && var94 == 512) {
                                                var57[var52] = arg6[var13][var15];
                                                var58[var52] = var84.field6584;
                                                var59[var52] = var84.field6574;
                                            } else if (var95 == 512 && var94 == 0) {
                                                var57[var52] = arg6[var13][var14];
                                                var58[var52] = var85.field6584;
                                                var59[var52] = var85.field6574;
                                            } else {
                                                if (var95 >= 256) {
                                                    if (var94 >= 256) {
                                                        var58[var52] = var84.field6584;
                                                        var59[var52] = var84.field6574;
                                                    } else {
                                                        var58[var52] = var85.field6584;
                                                        var59[var52] = var85.field6574;
                                                    }
                                                } else if (var94 >= 256) {
                                                    var58[var52] = var83.field6584;
                                                    var59[var52] = var83.field6574;
                                                } else {
                                                    var58[var52] = var82.field6584;
                                                    var59[var52] = var82.field6574;
                                                }
                                                int var102 = class71.method687((byte) 16, var95 << 7 >> 9, arg6[var12][var14], arg6[var13][var14]);
                                                int var103 = class71.method687((byte) 73, var95 << 7 >> 9, arg6[var12][var15], arg6[var13][var15]);
                                                var57[var52] = class71.method687((byte) 77, var94 << 7 >> 9, var102, var103);
                                            }
                                            if (var54 != null) {
                                                var54[var52] = var57[var52];
                                            }
                                        }
                                        var52++;
                                    }
                                    var51++;
                                }
                                if (var19 != 0 && var27.field6588) {
                                    var16 = true;
                                }
                            }
                            int var104 = arg2.method432(var12, false, var14);
                            int var105 = arg2.method432(var13, arg3, var14);
                            int var106 = arg2.method432(var13, false, var15);
                            int var107 = arg2.method432(var12, false, var15);
                            if (arg1 > 0) {
                                boolean var108 = true;
                                if (var27 != null && !var27.field6582) {
                                    var108 = false;
                                } else if (var22 == 0 && var19 != 0) {
                                    var108 = false;
                                } else if (var21 > 0 && var28 != null && !var28.field2253) {
                                    var108 = false;
                                }
                                if (var108 && var104 == var105 && var104 == var106 && var104 == var107) {
                                    this.field4774[arg1][var12][var14] = (byte) class486.method2826(this.field4774[arg1][var12][var14], 4);
                                }
                            }
                            int var109 = 0;
                            int var110 = 0;
                            int var111 = 0;
                            if (this.field4760) {
                                var109 = class642.method3578(var12, var14);
                                var110 = class437.method2599(var12, var14);
                                var111 = class640.method3567(var12, var14);
                            }
                            arg2.method433(var12, var14, var55, var60, var56, var61, var57, var54, var58, var59, var109, var110, var111, var16);
                            class701.method3903(arg1, var12, var14);
                        }
                    }
                }
            }
        }
        if (arg3) {
            this.method2024(null, -20, null, true, null, null, null);
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(Li;BLr;Li;)V")
    public final void method2025(class37 arg0, byte arg1, class166 arg2, class37 arg3) {
        int var5 = 121 % ((arg1 + 4) / 54);
        field4778++;
        int[][] var6 = new int[this.field4763][this.field4785];
        if (class683.field9625 == null || class683.field9625.length != this.field4785) {
            class411.field5991 = new int[this.field4785];
            class17.field184 = new int[this.field4785];
            class261.field3973 = new int[this.field4785];
            class683.field9625 = new int[this.field4785];
            class228.field3243 = new int[this.field4785];
        }
        for (int var7 = 0; var7 < this.field4779; var7++) {
            for (int var9 = 0; var9 < this.field4785; var9++) {
                class683.field9625[var9] = 0;
                class411.field5991[var9] = 0;
                class17.field184[var9] = 0;
                class228.field3243[var9] = 0;
                class261.field3973[var9] = 0;
            }
            for (int var10 = -5; var10 < this.field4763; var10++) {
                for (int var11 = 0; var11 < this.field4785; var11++) {
                    int var20 = var10 + 5;
                    int var10002;
                    if (this.field4763 > var20) {
                        int var21 = this.field4784[var7][var20][var11] & 0xFF;
                        if (var21 > 0) {
                            class460 var22 = this.field4781.method1993(var21 - 1, true);
                            class683.field9625[var11] += var22.field6585;
                            class411.field5991[var11] += var22.field6581;
                            class17.field184[var11] += var22.field6590;
                            class228.field3243[var11] += var22.field6572;
                            var10002 = class261.field3973[var11]++;
                        }
                    }
                    int var23 = var10 - 5;
                    if (var23 >= 0) {
                        int var24 = this.field4784[var7][var23][var11] & 0xFF;
                        if (var24 > 0) {
                            class460 var25 = this.field4781.method1993(var24 - 1, true);
                            class683.field9625[var11] -= var25.field6585;
                            class411.field5991[var11] -= var25.field6581;
                            class17.field184[var11] -= var25.field6590;
                            class228.field3243[var11] -= var25.field6572;
                            var10002 = class261.field3973[var11]--;
                        }
                    }
                }
                if (var10 >= 0) {
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    int var16 = 0;
                    for (int var17 = -5; var17 < this.field4785; var17++) {
                        int var18 = var17 + 5;
                        if (var18 < this.field4785) {
                            var14 += class17.field184[var18];
                            var13 += class411.field5991[var18];
                            var16 += class261.field3973[var18];
                            var12 += class683.field9625[var18];
                            var15 += class228.field3243[var18];
                        }
                        int var19 = var17 - 5;
                        if (var19 >= 0) {
                            var12 -= class683.field9625[var19];
                            var16 -= class261.field3973[var19];
                            var13 -= class411.field5991[var19];
                            var14 -= class17.field184[var19];
                            var15 -= class228.field3243[var19];
                        }
                        if (var17 >= 0 && var15 > 0 && var16 > 0) {
                            var6[var10][var17] = class639.method3555(107, var13 / var16, var14 / var16, var12 * 256 / var15);
                        }
                    }
                }
            }
            if (class124.field1864) {
                this.method2024(arg2, var7, class296.field4340[var7], false, var7 == 0 ? arg3 : null, var7 == 0 ? arg0 : null, var6);
            } else {
                this.method2031(-89, var7 == 0 ? arg3 : null, var6, arg2, class296.field4340[var7], var7 == 0 ? arg0 : null, var7);
            }
            this.field4784[var7] = null;
            this.field4773[var7] = null;
            this.field4787[var7] = null;
            this.field4767[var7] = null;
        }
        if (!this.field4760) {
            if (class236.field3675 != 0) {
                class504.method2898();
            }
            if (class367.field5247) {
                class206.method1367();
            }
        }
        for (int var8 = 0; var8 < this.field4779; var8++) {
            class296.field4340[var8].method436();
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(IIZIIIIIIILmo;)V")
    private final void method2026(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class695 arg10) {
        if (arg0 != 556238) {
            this.field4785 = -53;
        }
        field4766++;
        if (arg8 == 1) {
            arg3 = 1;
        } else if (arg8 == 2) {
            arg9 = 1;
            arg3 = 1;
        } else if (arg8 == 3) {
            arg9 = 1;
        }
        if (arg5 < 0 || arg5 >= this.field4763 || arg1 < 0 || arg1 >= this.field4785) {
            while (true) {
                int var14 = arg10.method3826(false);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg10.method3826(false);
                    return;
                }
                if (var14 <= 49) {
                    arg10.method3826(false);
                }
            }
        }
        if (!this.field4760 && !arg2) {
            class672.field9500[arg6][arg5][arg1] = 0;
        }
        while (true) {
            int var12 = arg10.method3826(false);
            if (var12 == 0) {
                if (this.field4760) {
                    this.field4765[0][arg5 + arg9][arg1 + arg3] = 0;
                    return;
                } else if (arg6 == 0) {
                    this.field4765[0][arg5 + arg9][arg1 + arg3] = -class438.method2601(arg4 + 932731, arg7 + 556238, -17408) * 8 << 2;
                    return;
                } else {
                    this.field4765[arg6][arg5 + arg9][arg1 + arg3] = this.field4765[arg6 - 1][arg5 + arg9][arg1 + arg3] - 960;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg10.method3826(false);
                if (this.field4760) {
                    this.field4765[0][arg5 + arg9][arg1 + arg3] = var13 * 8 << 2;
                    return;
                }
                if (var13 == 1) {
                    var13 = 0;
                }
                if (arg6 == 0) {
                    this.field4765[0][arg5 + arg9][arg1 + arg3] = -var13 * 8 << 2;
                    return;
                }
                this.field4765[arg6][arg5 + arg9][arg1 + arg3] = this.field4765[arg6 - 1][arg5 + arg9][arg1 + arg3] - (var13 * 8 << 2);
                return;
            }
            if (var12 <= 49) {
                if (arg2) {
                    arg10.method3826(false);
                } else {
                    this.field4773[arg6][arg5][arg1] = arg10.method3827((byte) 38);
                    this.field4787[arg6][arg5][arg1] = (byte) ((var12 - 2) / 4);
                    this.field4767[arg6][arg5][arg1] = (byte) class689.method3797(var12 + arg8 - 2, 3);
                }
            } else if (var12 <= 81) {
                if (!this.field4760 && !arg2) {
                    class672.field9500[arg6][arg5][arg1] = (byte) (var12 - 49);
                }
            } else if (!arg2) {
                this.field4784[arg6][arg5][arg1] = (byte) (var12 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(IIIII[BI)V")
    public static final void method2027(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        field4783++;
        if (arg1 > 0 && !class284.method1835(arg1, 45)) {
            throw new IllegalArgumentException("");
        } else if (arg3 <= 0 || class284.method1835(arg3, 20)) {
            int var7 = class385.method2304(-15499, arg0);
            int var8 = arg6;
            int var9 = arg3 > arg1 ? arg1 : arg3;
            int var10 = arg1 >> 1;
            int var11 = arg3 >> 1;
            byte[] var12 = arg5;
            byte[] var13 = new byte[var10 * var11 * var7];
            while (true) {
                OpenGL.glTexImage2Dub(arg4, var8, arg2, arg1, arg3, 0, arg0, 5121, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg1 * var7;
                byte[] var15 = var13;
                for (int var16 = 0; var16 < var7; var16++) {
                    int var17 = var16;
                    int var18 = var16;
                    int var19 = var14 + var16;
                    for (int var20 = 0; var20 < var11; var20++) {
                        for (int var21 = 0; var21 < var10; var21++) {
                            byte var22 = var12[var18];
                            int var23 = var7 + var18;
                            int var24 = var12[var23] + var22;
                            int var25 = var12[var19] + var24;
                            var18 = var7 + var23;
                            int var26 = var7 + var19;
                            int var27 = var12[var26] + var25;
                            var19 = var7 + var26;
                            var13[var17] = (byte) (var27 >> 2);
                            var17 += var7;
                        }
                        var18 += var14;
                        var19 += var14;
                    }
                }
                var13 = var12;
                arg3 = var11;
                var12 = var15;
                arg1 = var10;
                var8++;
                var11 >>= 0x1;
                var9 >>= 0x1;
                var10 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(B[[II)V")
    public final void method2028(byte arg0, int[][] arg1, int arg2) {
        field4761++;
        int[][] var4 = this.field4765[arg2];
        for (int var5 = 0; var5 < (this.field4763 + 1); var5++) {
            for (int var6 = 0; var6 < this.field4785 + 1; var6++) {
                var4[var5][var6] += arg1[var5][var6];
            }
        }
        if (arg0 > -25) {
            this.method2022(109, null, -45, -83, null, (byte) 101, 94);
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(IIBII)V")
    public final void method2029(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field4782++;
        int var6 = 13 % ((arg2 + 37) / 57);
        for (int var7 = 0; var7 < this.field4779; var7++) {
            this.method2030(arg1, arg3, arg0, var7, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(IIIIII)V")
    private final void method2030(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4769++;
        if (arg5 != 1) {
            return;
        }
        for (int var7 = arg0; var7 < arg0 + arg1; var7++) {
            for (int var10 = arg2; var10 < arg2 + arg4; var10++) {
                if (var10 >= 0 && var10 < this.field4763 && var7 >= 0 && this.field4785 > var7) {
                    this.field4765[arg3][var10][var7] = arg3 <= 0 ? 0 : this.field4765[arg3 - 1][var10][var7] - 960;
                }
            }
        }
        if (arg2 > 0 && arg2 < this.field4763) {
            for (int var8 = arg0 + 1; var8 < (arg0 + arg1); var8++) {
                if (var8 >= 0 && var8 < this.field4785) {
                    this.field4765[arg3][arg2][var8] = this.field4765[arg3][arg2 - 1][var8];
                }
            }
        }
        if (arg0 > 0 && this.field4785 > arg0) {
            for (int var9 = arg2 + 1; var9 < arg2 + arg4; var9++) {
                if (var9 >= 0 && var9 < this.field4763) {
                    this.field4765[arg3][var9][arg0] = this.field4765[arg3][var9][arg0 - 1];
                }
            }
        }
        if (arg2 < 0 || arg0 < 0 || arg2 >= this.field4763 || this.field4785 <= arg0) {
            return;
        }
        if (arg3 != 0) {
            if (arg2 > 0 && this.field4765[arg3 - 1][arg2 - 1][arg0] != this.field4765[arg3][arg2 - 1][arg0]) {
                this.field4765[arg3][arg2][arg0] = this.field4765[arg3][arg2 - 1][arg0];
                return;
            }
            if (arg0 > 0 && this.field4765[arg3 - 1][arg2][arg0 - 1] != this.field4765[arg3][arg2][arg0 - 1]) {
                this.field4765[arg3][arg2][arg0] = this.field4765[arg3][arg2][arg0 - 1];
                return;
            }
            if (arg2 > 0 && arg0 > 0 && this.field4765[arg3][arg2 - 1][arg0 - 1] != this.field4765[arg3 - 1][arg2 - 1][arg0 - 1]) {
                this.field4765[arg3][arg2][arg0] = this.field4765[arg3][arg2 - 1][arg0 - 1];
                return;
            }
            return;
        }
        if (arg2 > 0 && this.field4765[arg3][arg2 - 1][arg0] != 0) {
            this.field4765[arg3][arg2][arg0] = this.field4765[arg3][arg2 - 1][arg0];
            return;
        }
        if (arg0 > 0 && this.field4765[arg3][arg2][arg0 - 1] != 0) {
            this.field4765[arg3][arg2][arg0] = this.field4765[arg3][arg2][arg0 - 1];
            return;
        }
        if (arg2 > 0 && arg0 > 0 && this.field4765[arg3][arg2 - 1][arg0 - 1] != 0) {
            this.field4765[arg3][arg2][arg0] = this.field4765[arg3][arg2 - 1][arg0 - 1];
            return;
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(ILi;[[ILr;Li;Li;I)V")
    private final void method2031(int arg0, class37 arg1, int[][] arg2, class166 arg3, class37 arg4, class37 arg5, int arg6) {
        field4775++;
        for (int var8 = 0; var8 < this.field4763; var8++) {
            for (int var9 = 0; var9 < this.field4785; var9++) {
                if (class466.field6703 == -1 || class278.method1815(5, arg6, var9, class466.field6703, var8)) {
                    byte var10 = this.field4787[arg6][var8][var9];
                    byte var11 = this.field4767[arg6][var8][var9];
                    int var12 = this.field4773[arg6][var8][var9] & 0xFF;
                    int var13 = this.field4784[arg6][var8][var9] & 0xFF;
                    class156 var14 = var12 == 0 ? null : this.field4764.method2586(-20216, var12 - 1);
                    class460 var15 = var13 == 0 ? null : this.field4781.method1993(var13 - 1, true);
                    int var16 = 0;
                    int var17 = 0;
                    if (var10 != 0) {
                        var16 = var15 == null ? 0 : class173.field2466[var10];
                        var17 = var14 == null ? 0 : class208.field2917[var10];
                    } else if (var14 != null) {
                        var17 = class208.field2917[var10];
                    } else if (var15 != null) {
                        var16 = class208.field2917[var10];
                    }
                    int var18 = var16 + var17;
                    int var19 = 0;
                    if (var18 != 0) {
                        int var20;
                        if (class163.field2333) {
                            var20 = var14 == null ? -1 : var14.field2244;
                        } else {
                            var20 = -1;
                        }
                        int[] var21 = new int[var18];
                        int[] var22 = new int[var18];
                        int[] var23 = new int[var18];
                        int[] var24 = new int[var18];
                        boolean var25 = false;
                        if (var14 == null || var14.field2241 == -1 && var14.field2248 == -1 && var20 == -1) {
                            for (int var27 = 0; var27 < var17; var27++) {
                                var21[var19] = -1;
                                var19++;
                            }
                        } else {
                            for (int var26 = 0; var26 < var17; var26++) {
                                var23[var19] = var20;
                                var24[var19] = var14.field2250;
                                if (var14.field2241 == -1) {
                                    var21[var19] = -1;
                                } else {
                                    var21[var19] = var14.field2241;
                                }
                                if (var14.field2248 == -1) {
                                    var22[var19] = -1;
                                } else {
                                    var25 = true;
                                    var22[var19] = var14.field2248;
                                }
                                var19++;
                            }
                            if (!this.field4760 && arg6 == 0) {
                                class276.method1807(var8, var9, var14.field2252, var14.field2239 * 8, var14.field2242);
                            }
                        }
                        if (!var25) {
                            var22 = null;
                        }
                        if (var15 == null) {
                            for (int var30 = 0; var30 < var16; var30++) {
                                var21[var19] = -1;
                                var19++;
                            }
                        } else {
                            int var28 = var15.field6584;
                            if (class163.field2333) {
                                var28 = -1;
                            }
                            for (int var29 = 0; var29 < var16; var29++) {
                                var23[var19] = var28;
                                var24[var19] = var15.field6574;
                                var21[var19] = arg2[var8][var9];
                                if (var22 != null) {
                                    var22[var19] = -1;
                                }
                                var19++;
                            }
                        }
                        int var31 = this.field4786.length;
                        int[] var32 = new int[var31];
                        int[] var33 = new int[var31];
                        int[] var34 = arg1 == null ? null : new int[var31];
                        int[] var35 = arg1 == null && arg5 == null ? null : new int[var31];
                        for (int var36 = 0; var36 < var31; var36++) {
                            int var45 = this.field4786[var36];
                            int var46 = this.field4768[var36];
                            if (var11 == 0) {
                                var32[var36] = var45;
                                var33[var36] = var46;
                            } else if (var11 == 1) {
                                var32[var36] = var46;
                                var33[var36] = 512 - var45;
                            } else if (var11 == 2) {
                                var32[var36] = 512 - var45;
                                var33[var36] = 512 - var46;
                            } else if (var11 == 3) {
                                var32[var36] = 512 - var46;
                                var33[var36] = var45;
                            }
                            if (var34 != null && class561.field7898[var10][var36]) {
                                int var49 = (var8 << 9) + var45;
                                int var50 = (var9 << 9) + var45;
                                var34[var36] = arg1.method442(var49, true, var50) - arg4.method442(var49, true, var50);
                            }
                            if (var35 != null) {
                                if (arg1 != null && !class561.field7898[var10][var36]) {
                                    int var51 = (var8 << 9) + var45;
                                    int var52 = (var9 << 9) + var45;
                                    var35[var36] = arg4.method442(var51, true, var52) - arg1.method442(var51, true, var52);
                                } else if (arg5 != null && !class330.field4880[var10][var36]) {
                                    int var53 = (var8 << 9) + var45;
                                    int var54 = (var9 << 9) + var45;
                                    var35[var36] = arg5.method442(var53, true, var54) - arg4.method442(var53, true, var54);
                                }
                            }
                        }
                        int var37 = arg4.method432(var8, false, var9);
                        int var38 = arg4.method432(var8 + 1, false, var9);
                        int var39 = arg4.method432(var8 + 1, false, var9 + 1);
                        int var40 = arg4.method432(var8, false, var9 + 1);
                        if (arg6 > 0) {
                            boolean var41 = true;
                            if (var15 != null && !var15.field6582) {
                                var41 = false;
                            } else if (var13 == 0 && var10 != 0) {
                                var41 = false;
                            } else if (var12 > 0 && var14 != null && !var14.field2253) {
                                var41 = false;
                            }
                            if (var41 && var37 == var38 && var37 == var39 && var37 == var40) {
                                this.field4774[arg6][var8][var9] = (byte) class486.method2826(this.field4774[arg6][var8][var9], 4);
                            }
                        }
                        int var42 = 0;
                        int var43 = 0;
                        int var44 = 0;
                        if (this.field4760) {
                            var42 = class642.method3578(var8, var9);
                            var43 = class437.method2599(var8, var9);
                            var44 = class640.method3567(var8, var9);
                        }
                        arg4.method434(var8, var9, var32, var34, var33, var35, class358.field5133[var10], class686.field9660[var10], class334.field4951[var10], var21, var22, var23, var24, var42, var43, var44, false);
                        class701.method3903(arg6, var8, var9);
                    }
                }
            }
        }
        if (arg0 > -88) {
            this.method2026(-76, 39, false, -109, 44, 37, -104, 85, -95, -108, null);
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "([[[ILr;[Lcp;B)V")
    public final void method2032(int[][][] arg0, class166 arg1, class674[] arg2, byte arg3) {
        if (arg3 != -16) {
            return;
        }
        field4776++;
        if (!this.field4760) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field4763; var6++) {
                    for (int var7 = 0; var7 < this.field4785; var7++) {
                        if ((class672.field9500[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class672.field9500[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg2[var8].method3754(var6, (byte) -84, var7);
                            }
                        }
                    }
                }
            }
        }
        for (int var9 = 0; var9 < this.field4779; var9++) {
            int var10 = 0;
            int var11 = 0;
            if (!this.field4760) {
                if (class367.field5247) {
                    var10 |= 0x2;
                }
                if (class201.field2844) {
                    var11 |= 0x8;
                }
                if (class236.field3675 != 0) {
                    var10 |= 0x1;
                    if (class327.field4848 | var9 == 0) {
                        var11 |= 0x10;
                    }
                }
            }
            if (class367.field5247) {
                var11 |= 0x7;
            }
            if (!class376.field5357) {
                var11 |= 0x20;
            }
            int[][] var12 = arg0 == null || arg0.length <= var9 ? this.field4765[var9] : arg0[var9];
            class146.method1040(var9, arg1.method215(this.field4763, this.field4785, this.field4765[var9], var12, 512, var10, var11));
        }
    }

    @OriginalMember(owner = "client!du", name = "<init>", descriptor = "(IIIZLka;Ltu;)V")
    public class323(int arg0, int arg1, int arg2, boolean arg3, class435 arg4, class316 arg5) {
        this.field4779 = arg0;
        this.field4763 = arg1;
        this.field4760 = arg3;
        this.field4781 = arg5;
        this.field4785 = arg2;
        this.field4764 = arg4;
        this.field4787 = new byte[this.field4779][this.field4763][this.field4785];
        this.field4784 = new byte[this.field4779][this.field4763][this.field4785];
        this.field4765 = new int[this.field4779][this.field4763 + 1][this.field4785 + 1];
        this.field4767 = new byte[this.field4779][this.field4763][this.field4785];
        this.field4773 = new byte[this.field4779][this.field4763][this.field4785];
        this.field4774 = new byte[this.field4779][this.field4763 + 1][this.field4785 + 1];
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(I)V")
    public static void method2033(int arg0) {
        if (arg0 != 1) {
            field4762 = null;
        }
        field4762 = null;
    }
}
