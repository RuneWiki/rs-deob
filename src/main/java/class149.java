import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class149 {

    @OriginalMember(owner = "client!em", name = "p", descriptor = "[I")
    private int[] field2259 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

    @OriginalMember(owner = "client!em", name = "y", descriptor = "[I")
    private int[] field2268 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

    @OriginalMember(owner = "client!em", name = "e", descriptor = "I")
    public int field2248;

    @OriginalMember(owner = "client!em", name = "q", descriptor = "Ljb;")
    private class340 field2260;

    @OriginalMember(owner = "client!em", name = "h", descriptor = "Z")
    public boolean field2251;

    @OriginalMember(owner = "client!em", name = "z", descriptor = "Lgs;")
    private class34 field2269;

    @OriginalMember(owner = "client!em", name = "g", descriptor = "I")
    public int field2250;

    @OriginalMember(owner = "client!em", name = "r", descriptor = "I")
    public int field2261;

    @OriginalMember(owner = "client!em", name = "u", descriptor = "[[[B")
    private byte[][][] field2264;

    @OriginalMember(owner = "client!em", name = "w", descriptor = "[[[B")
    private byte[][][] field2266;

    @OriginalMember(owner = "client!em", name = "j", descriptor = "[[[B")
    public byte[][][] field2253;

    @OriginalMember(owner = "client!em", name = "i", descriptor = "[[[I")
    public int[][][] field2252;

    @OriginalMember(owner = "client!em", name = "f", descriptor = "[[[B")
    private byte[][][] field2249;

    @OriginalMember(owner = "client!em", name = "B", descriptor = "[[[B")
    private byte[][][] field2271;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!em", name = "b", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!em", name = "c", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!em", name = "d", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!em", name = "k", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!em", name = "l", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!em", name = "m", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!em", name = "n", descriptor = "I")
    public static int field2257;

    @OriginalMember(owner = "client!em", name = "o", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!em", name = "s", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!em", name = "t", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!em", name = "v", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!em", name = "x", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!em", name = "A", descriptor = "[[[B")
    public byte[][][] field2270;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IILti;BII[Loe;III)V")
    public final void method1065(int arg0, int arg1, class303 arg2, byte arg3, int arg4, int arg5, class133[] arg6, int arg7, int arg8, int arg9) {
        field2255++;
        int var11 = (arg7 & 0x7) * 8;
        if (!this.field2251) {
            class133 var12 = arg6[arg4];
            for (int var13 = 0; var13 < 8; var13++) {
                for (int var14 = 0; var14 < 8; var14++) {
                    int var15 = class353.method2286(arg9, var14 & 0x7, var13 & 0x7, -80) + arg5;
                    int var16 = class250.method1591(arg9, var13 & 0x7, (byte) -110, var14 & 0x7) + arg0;
                    if (var15 > 0 && this.field2261 - 1 > var15 && var16 > 0 && (this.field2248 - 1) > var16) {
                        var12.method977((byte) 78, var16, var15);
                    }
                }
            }
        }
        int var17 = (arg1 & 0x7) * 8;
        int var18 = (arg7 & 0xFFFFFFF8) << 3;
        int var19 = (arg1 & 0xFFFFFFF8) << 3;
        byte var20 = 0;
        byte var21 = 0;
        if (arg3 <= 36) {
            this.method1065(-74, -104, null, (byte) -57, 100, 53, null, 22, 55, 34);
        }
        if (arg9 == 1) {
            var21 = 1;
        } else if (arg9 == 2) {
            var21 = 1;
            var20 = 1;
        } else if (arg9 == 3) {
            var20 = 1;
        }
        for (int var22 = 0; var22 < this.field2250; var22++) {
            for (int var23 = 0; var23 < 64; var23++) {
                for (int var24 = 0; var24 < 64; var24++) {
                    if (arg8 != var22 || var11 > var23 || var23 > var11 + 8 || var24 < var17 || (var17 + 8) < var24) {
                        this.method1076(0, -1, 0, 0, -1, 0, false, 0, arg2, 0, -1);
                    } else if (var11 + 8 == var23 || (var17 + 8) == var24) {
                        int var31;
                        int var32;
                        if (arg9 == 0) {
                            var32 = var24 + arg0 - var17;
                            var31 = arg5 + var23 - var11;
                        } else if (arg9 == 1) {
                            var32 = arg0 - (var23 - var11 - 8);
                            var31 = var24 + arg5 - var17;
                        } else if (arg9 == 2) {
                            var32 = arg0 + var17 + 8 - var24;
                            var31 = arg5 + var11 + 8 - var23;
                        } else {
                            var31 = arg5 + var17 + 8 - var24;
                            var32 = arg0 - (var11 - var23);
                        }
                        this.method1076(0, -1, 0, 0, var32, var18 + var23, true, var19 + var24, arg2, arg4, var31);
                    } else {
                        int var25 = class353.method2286(arg9, var24 & 0x7, var23 & 0x7, -96) + arg5;
                        int var26 = arg0 + class250.method1591(arg9, var23 & 0x7, (byte) -123, var24 & 0x7);
                        this.method1076(var20, -1, arg9, var21, var26, var18 + var23, false, var19 + var24, arg2, arg4, var25);
                        if (var23 == 63 || var24 == 63) {
                            int var27 = var23 == 63 ? 64 : var23;
                            int var28 = var24 == 63 ? 64 : var24;
                            int var29;
                            int var30;
                            if (arg9 == 0) {
                                var29 = arg5 - (var11 - var27);
                                var30 = var28 + arg0 - var17;
                            } else if (arg9 == 1) {
                                var30 = var11 + arg0 + 8 - var27;
                                var29 = -var17 - (-var28 - arg5);
                            } else if (arg9 == 2) {
                                var30 = arg0 + var17 + 8 - var28;
                                var29 = arg5 + var11 + 8 - var27;
                            } else {
                                var30 = arg0 - (var11 - var27);
                                var29 = arg5 + var17 + 8 - var28;
                            }
                            if (var29 >= 0 && this.field2261 > var29 && var30 >= 0 && this.field2248 > var30) {
                                this.field2252[arg4][var29][var30] = this.field2252[arg4][var20 + var25][var21 + var26];
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Lqa;I)V")
    public static final void method1066(class162 arg0, int arg1) {
        field2267++;
        if (class314.field4487) {
            class56.method400(arg0, (byte) -54);
        } else {
            class472.method2822((byte) 125, arg0);
        }
        if (arg1 != -1) {
            method1070(88, -106, 22);
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "([ZILon;Lqa;ILmh;I[[BI[[BII[[BI)V")
    private final void method1067(boolean[] arg0, int arg1, class220 arg2, class162 arg3, int arg4, class443 arg5, int arg6, byte[][] arg7, int arg8, byte[][] arg9, int arg10, int arg11, byte[][] arg12, int arg13) {
        if (arg4 <= 58) {
            this.method1077(65, false, -96, 76, 10, -94);
        }
        field2263++;
        if (arg2 != null && arg5 != null || arg5 != null && arg1 == 12 || arg2 != null && arg1 == 0) {
            boolean[] var15 = arg2 != null && arg2.field3184 ? class42.field637[arg1] : class488.field7125[arg1];
            if (arg13 > 0) {
                if (arg8 > 0) {
                    int var16 = arg9[arg8 - 1][arg13 - 1] & 0xFF;
                    if (var16 > 0) {
                        class220 var17 = this.field2260.method2222(-21925, var16 - 1);
                        if (var17.field3165 != -1 && var17.field3184) {
                            byte var18 = arg12[arg8 - 1][arg13 - 1];
                            int var19 = arg7[arg8 - 1][arg13 - 1] * 2 + 4 & 0x7;
                            int var20 = class530.method3143(var17, arg3, -20806);
                            if (class62.field1072[var18][var19]) {
                                class355.field5367[0] = var17.field3165;
                                class465.field6833[0] = var20;
                                class507.field7412[0] = arg3.method473() ? var17.field3172 : var17.field3182;
                                class402.field5903[0] = var17.field3166;
                                class507.field7421[0] = var17.field3183;
                                class358.field5421[0] = 256;
                            }
                        }
                    }
                }
                if (arg8 < arg10 - 1) {
                    int var21 = arg9[arg8 + 1][arg13 - 1] & 0xFF;
                    if (var21 > 0) {
                        class220 var22 = this.field2260.method2222(-21925, var21 - 1);
                        if (var22.field3165 != -1 && var22.field3184) {
                            byte var23 = arg12[arg8 + 1][arg13 - 1];
                            int var24 = arg7[arg8 + 1][arg13 - 1] * 2 + 6 & 0x7;
                            int var25 = class530.method3143(var22, arg3, -20806);
                            if (class62.field1072[var23][var24]) {
                                class355.field5367[2] = var22.field3165;
                                class465.field6833[2] = var25;
                                class507.field7412[2] = arg3.method473() ? var22.field3172 : var22.field3182;
                                class402.field5903[2] = var22.field3166;
                                class507.field7421[2] = var22.field3183;
                                class358.field5421[2] = 512;
                            }
                        }
                    }
                }
            }
            if (arg13 < (arg11 - 1)) {
                if (arg8 > 0) {
                    int var26 = arg9[arg8 - 1][arg13 + 1] & 0xFF;
                    if (var26 > 0) {
                        class220 var27 = this.field2260.method2222(-21925, var26 - 1);
                        if (var27.field3165 != -1 && var27.field3184) {
                            byte var28 = arg12[arg8 - 1][arg13 + 1];
                            int var29 = (arg7[arg8 - 1][arg13 + 1] * 2) + 2 & 0x7;
                            int var30 = class530.method3143(var27, arg3, -20806);
                            if (class62.field1072[var28][var29]) {
                                class355.field5367[6] = var27.field3165;
                                class465.field6833[6] = var30;
                                class507.field7412[6] = arg3.method473() ? var27.field3172 : var27.field3182;
                                class402.field5903[6] = var27.field3166;
                                class507.field7421[6] = var27.field3183;
                                class358.field5421[6] = 64;
                            }
                        }
                    }
                }
                if ((arg10 - 1) > arg8) {
                    int var31 = arg9[arg8 + 1][arg13 + 1] & 0xFF;
                    if (var31 > 0) {
                        class220 var32 = this.field2260.method2222(-21925, var31 - 1);
                        if (var32.field3165 != -1 && var32.field3184) {
                            byte var33 = arg12[arg8 + 1][arg13 + 1];
                            int var34 = -(-(arg7[arg8 + 1][arg13 + 1] * 2)) & 0x7;
                            int var35 = class530.method3143(var32, arg3, -20806);
                            if (class62.field1072[var33][var34]) {
                                class355.field5367[4] = var32.field3165;
                                class465.field6833[4] = var35;
                                class507.field7412[4] = arg3.method473() ? var32.field3172 : var32.field3182;
                                class402.field5903[4] = var32.field3166;
                                class507.field7421[4] = var32.field3183;
                                class358.field5421[4] = 128;
                            }
                        }
                    }
                }
            }
            if (arg13 > 0) {
                int var36 = arg9[arg8][arg13 - 1] & 0xFF;
                if (var36 > 0) {
                    class220 var37 = this.field2260.method2222(-21925, var36 - 1);
                    if (var37.field3165 != -1) {
                        byte var38 = arg12[arg8][arg13 - 1];
                        byte var39 = arg7[arg8][arg13 - 1];
                        if (var37.field3184) {
                            int var40 = 2;
                            int var41 = var39 * 2 + 4;
                            int var42 = class530.method3143(var37, arg3, -20806);
                            for (int var43 = 0; var43 < 3; var43++) {
                                var41 &= 0x7;
                                var40 &= 0x7;
                                if (class62.field1072[var38][var41] && class507.field7421[var40] <= var37.field3183) {
                                    class355.field5367[var40] = var37.field3165;
                                    class465.field6833[var40] = var42;
                                    class507.field7412[var40] = arg3.method473() ? var37.field3172 : var37.field3182;
                                    class402.field5903[var40] = var37.field3166;
                                    if (class507.field7421[var40] == var37.field3183) {
                                        class358.field5421[var40] = class29.method239(class358.field5421[var40], 32);
                                    } else {
                                        class358.field5421[var40] = 32;
                                    }
                                    class507.field7421[var40] = var37.field3183;
                                }
                                var41++;
                                var40--;
                            }
                            if (!var15[arg6 & 0x3]) {
                                arg0[0] = class42.field637[var38][class388.method2441(var39 + 2, 3)];
                            }
                        } else if (!var15[arg6 & 0x3]) {
                            arg0[0] = class488.field7125[var38][class388.method2441(3, var39 + 2)];
                        }
                    }
                }
            }
            if ((arg11 - 1) > arg13) {
                int var44 = arg9[arg8][arg13 + 1] & 0xFF;
                if (var44 > 0) {
                    class220 var45 = this.field2260.method2222(-21925, var44 - 1);
                    if (var45.field3165 != -1) {
                        byte var46 = arg12[arg8][arg13 + 1];
                        byte var47 = arg7[arg8][arg13 + 1];
                        if (var45.field3184) {
                            int var48 = 4;
                            int var49 = var47 * 2 + 2;
                            int var50 = class530.method3143(var45, arg3, -20806);
                            for (int var51 = 0; var51 < 3; var51++) {
                                var48 &= 0x7;
                                var49 &= 0x7;
                                if (class62.field1072[var46][var49] && var45.field3183 >= class507.field7421[var48]) {
                                    class355.field5367[var48] = var45.field3165;
                                    class465.field6833[var48] = var50;
                                    class507.field7412[var48] = arg3.method473() ? var45.field3172 : var45.field3182;
                                    class402.field5903[var48] = var45.field3166;
                                    if (class507.field7421[var48] == var45.field3183) {
                                        class358.field5421[var48] = class29.method239(class358.field5421[var48], 16);
                                    } else {
                                        class358.field5421[var48] = 16;
                                    }
                                    class507.field7421[var48] = var45.field3183;
                                }
                                var49--;
                                var48++;
                            }
                            if (!var15[arg6 + 2 & 0x3]) {
                                arg0[2] = class42.field637[var46][class388.method2441(-(-var47), 3)];
                            }
                        } else if (!var15[arg6 + 2 & 0x3]) {
                            arg0[2] = class488.field7125[var46][class388.method2441(var47, 3)];
                        }
                    }
                }
            }
            if (arg8 > 0) {
                int var52 = arg9[arg8 - 1][arg13] & 0xFF;
                if (var52 > 0) {
                    class220 var53 = this.field2260.method2222(-21925, var52 - 1);
                    if (var53.field3165 != -1) {
                        byte var54 = arg12[arg8 - 1][arg13];
                        byte var55 = arg7[arg8 - 1][arg13];
                        if (var53.field3184) {
                            int var56 = 6;
                            int var57 = var55 * 2 + 4;
                            int var58 = class530.method3143(var53, arg3, -20806);
                            for (int var59 = 0; var59 < 3; var59++) {
                                var57 &= 0x7;
                                var56 &= 0x7;
                                if (class62.field1072[var54][var57] && var53.field3183 >= class507.field7421[var56]) {
                                    class355.field5367[var56] = var53.field3165;
                                    class465.field6833[var56] = var58;
                                    class507.field7412[var56] = arg3.method473() ? var53.field3172 : var53.field3182;
                                    class402.field5903[var56] = var53.field3166;
                                    if (class507.field7421[var56] == var53.field3183) {
                                        class358.field5421[var56] = class29.method239(class358.field5421[var56], 8);
                                    } else {
                                        class358.field5421[var56] = 8;
                                    }
                                    class507.field7421[var56] = var53.field3183;
                                }
                                var56++;
                                var57--;
                            }
                            if (!var15[arg6 + 3 & 0x3]) {
                                arg0[3] = class42.field637[var54][class388.method2441(var55 + 1, 3)];
                            }
                        } else if (!var15[arg6 + 3 & 0x3]) {
                            arg0[3] = class488.field7125[var54][class388.method2441(var55 + 1, 3)];
                        }
                    }
                }
            }
            if (arg8 < (arg10 - 1)) {
                int var60 = arg9[arg8 + 1][arg13] & 0xFF;
                if (var60 > 0) {
                    class220 var61 = this.field2260.method2222(-21925, var60 - 1);
                    if (var61.field3165 != -1) {
                        byte var62 = arg12[arg8 + 1][arg13];
                        byte var63 = arg7[arg8 + 1][arg13];
                        if (var61.field3184) {
                            int var64 = 4;
                            int var65 = var63 * 2 + 6;
                            int var66 = class530.method3143(var61, arg3, -20806);
                            for (int var67 = 0; var67 < 3; var67++) {
                                var65 &= 0x7;
                                var64 &= 0x7;
                                if (class62.field1072[var62][var65] && var61.field3183 >= class507.field7421[var64]) {
                                    class355.field5367[var64] = var61.field3165;
                                    class465.field6833[var64] = var66;
                                    class507.field7412[var64] = arg3.method473() ? var61.field3172 : var61.field3182;
                                    class402.field5903[var64] = var61.field3166;
                                    if (class507.field7421[var64] == var61.field3183) {
                                        class358.field5421[var64] = class29.method239(class358.field5421[var64], 4);
                                    } else {
                                        class358.field5421[var64] = 4;
                                    }
                                    class507.field7421[var64] = var61.field3183;
                                }
                                var65++;
                                var64--;
                            }
                            if (!var15[arg6 + 1 & 0x3]) {
                                arg0[1] = class42.field637[var62][class388.method2441(var63 + 3, 3)];
                            }
                        } else if (!var15[arg6 + 1 & 0x3]) {
                            arg0[1] = class488.field7125[var62][class388.method2441(3, var63 + 3)];
                        }
                    }
                }
            }
        }
        if (arg2 == null) {
            return;
        }
        int var68 = class530.method3143(arg2, arg3, -20806);
        if (!arg2.field3184) {
            return;
        }
        for (int var69 = 0; var69 < 8; var69++) {
            int var70 = var69 - (arg6 * 2) & 0x7;
            if (class62.field1072[arg1][var69] && arg2.field3183 >= class507.field7421[var70]) {
                class355.field5367[var70] = arg2.field3165;
                class465.field6833[var70] = var68;
                class507.field7412[var70] = arg3.method473() ? arg2.field3172 : arg2.field3182;
                class402.field5903[var70] = arg2.field3166;
                if (class507.field7421[var70] == arg2.field3183) {
                    class358.field5421[var70] = class29.method239(class358.field5421[var70], 2);
                } else {
                    class358.field5421[var70] = 2;
                }
                class507.field7421[var70] = arg2.field3183;
            }
        }
        return;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(I[[IILna;Lqa;Lna;Lna;)V")
    private final void method1068(int arg0, int[][] arg1, int arg2, class35 arg3, class162 arg4, class35 arg5, class35 arg6) {
        field2246++;
        if (arg0 >= -80) {
            this.method1065(-49, 44, null, (byte) 90, -56, 37, null, 14, -33, 75);
        }
        for (int var8 = 0; var8 < this.field2261; var8++) {
            for (int var9 = 0; var9 < this.field2248; var9++) {
                if (class400.field5873 == -1 || class110.method813(-110, var8, class400.field5873, var9, arg2)) {
                    byte var10 = this.field2264[arg2][var8][var9];
                    byte var11 = this.field2266[arg2][var8][var9];
                    int var12 = this.field2271[arg2][var8][var9] & 0xFF;
                    int var13 = this.field2249[arg2][var8][var9] & 0xFF;
                    class220 var14 = var12 == 0 ? null : this.field2260.method2222(-21925, var12 - 1);
                    class443 var15 = var13 == 0 ? null : this.field2269.method267(true, var13 - 1);
                    int var16 = 0;
                    int var17 = 0;
                    if (var10 != 0) {
                        var17 = var14 == null ? 0 : class30.field493[var10];
                        var16 = var15 == null ? 0 : class161.field2439[var10];
                    } else if (var14 != null) {
                        var17 = class30.field493[var10];
                    } else if (var15 != null) {
                        var16 = class30.field493[var10];
                    }
                    int var18 = var17 + var16;
                    int var19 = 0;
                    if (var18 != 0) {
                        int[] var20 = new int[var18];
                        int[] var21 = new int[var18];
                        int[] var22 = new int[var18];
                        int[] var23 = new int[var18];
                        boolean var24 = false;
                        if (var14 == null || var14.field3165 == -1 && var14.field3177 == -1 && var14.field3172 == -1) {
                            for (int var27 = 0; var27 < var17; var27++) {
                                var20[var19] = -1;
                                var19++;
                            }
                        } else {
                            int var25 = arg4.method473() ? var14.field3172 : var14.field3182;
                            if (class404.field5954) {
                                var25 = -1;
                            }
                            for (int var26 = 0; var26 < var17; var26++) {
                                var22[var19] = var25;
                                var23[var19] = var14.field3166;
                                if (var14.field3165 == -1) {
                                    var20[var19] = -1;
                                } else {
                                    var20[var19] = var14.field3165;
                                }
                                if (var14.field3177 == -1) {
                                    var21[var19] = -1;
                                } else {
                                    var21[var19] = var14.field3177;
                                    var24 = true;
                                }
                                var19++;
                            }
                            if (!this.field2251 && arg2 == 0) {
                                class153.method1107(var8, var9, var14.field3179, var14.field3170 * 8, var14.field3168);
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
                            int var29 = var15.field6492;
                            if (class404.field5954) {
                                var29 = -1;
                            }
                            for (int var30 = 0; var30 < var16; var30++) {
                                var22[var19] = var29;
                                var23[var19] = var15.field6503;
                                var20[var19] = arg1[var8][var9];
                                if (var21 != null) {
                                    var21[var19] = -1;
                                }
                                var19++;
                            }
                        }
                        int var31 = this.field2259.length;
                        int[] var32 = new int[var31];
                        int[] var33 = new int[var31];
                        int[] var34 = arg3 == null ? null : new int[var31];
                        int[] var35 = arg3 == null && arg5 == null ? null : new int[var31];
                        for (int var36 = 0; var36 < var31; var36++) {
                            int var45 = this.field2259[var36];
                            int var46 = this.field2268[var36];
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
                            if (var34 != null && class62.field1072[var10][var36]) {
                                int var49 = (var8 << 7) + var45;
                                int var50 = (var9 << 7) + var45;
                                var34[var36] = arg3.method273(var49, var50) - arg6.method273(var49, var50);
                            }
                            if (var35 != null) {
                                if (arg3 != null && !class62.field1072[var10][var36]) {
                                    int var51 = (var8 << 7) + var45;
                                    int var52 = (var9 << 7) + var45;
                                    var35[var36] = arg6.method273(var51, var52) - arg3.method273(var51, var52);
                                } else if (arg5 != null && !class186.field2768[var10][var36]) {
                                    int var53 = (var8 << 7) + var45;
                                    int var54 = (var9 << 7) + var45;
                                    var35[var36] = arg5.method273(var53, var54) - arg6.method273(var53, var54);
                                }
                            }
                        }
                        int var37 = arg6.method271(var8, var9);
                        int var38 = arg6.method271(var8 + 1, var9);
                        int var39 = arg6.method271(var8 + 1, var9 + 1);
                        int var40 = arg6.method271(var8, var9 + 1);
                        if (arg2 > 0) {
                            boolean var41 = true;
                            if (var13 == 0 && var10 != 0) {
                                var41 = false;
                            }
                            if (var12 > 0 && var14 != null && !var14.field3175) {
                                var41 = false;
                            }
                            if (var41 && var37 == var38 && var37 == var39 && var37 == var40) {
                                this.field2253[arg2][var8][var9] = (byte) class29.method239(this.field2253[arg2][var8][var9], 4);
                            }
                        }
                        int var42 = 0;
                        int var43 = 0;
                        int var44 = 0;
                        if (this.field2251) {
                            var42 = class256.method1628(var8, var9);
                            var43 = class97.method768(var8, var9);
                            var44 = class279.method1772(var8, var9);
                        }
                        arg6.method274(var8, var9, var32, var34, var33, var35, class448.field6566[var10], class404.field5953[var10], class122.field1908[var10], var20, var21, var22, var23, var42, var43, var44, false);
                        class16.method152(arg2, var8, var9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "([[[II[Loe;Lqa;)V")
    public final void method1069(int[][][] arg0, int arg1, class133[] arg2, class162 arg3) {
        field2265++;
        if (!this.field2251) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field2261; var6++) {
                    for (int var7 = 0; var7 < this.field2248; var7++) {
                        if ((class364.field5475[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class364.field5475[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg2[var8].method975(true, var6, var7);
                            }
                        }
                    }
                }
            }
        }
        if (arg1 != 8) {
            this.method1077(17, false, 98, 17, 120, 94);
        }
        for (int var9 = 0; var9 < this.field2250; var9++) {
            int var10 = 0;
            int var11 = 0;
            if (!this.field2251) {
                if (class41.field635) {
                    var11 |= 0x8;
                }
                if (class356.field5388) {
                    var10 |= 0x2;
                }
                if (class67.field1167 != 0) {
                    if (class128.field1961 | var9 == 0) {
                        var11 |= 0x10;
                    }
                    var10 |= 0x1;
                }
            }
            if (class356.field5388) {
                var11 |= 0x7;
            }
            if (!class286.field4135) {
                var11 |= 0x20;
            }
            int[][] var12 = arg0 == null || arg0.length <= var9 ? this.field2252[var9] : arg0[var9];
            class485.method2898(var9, arg3.method478(this.field2261, this.field2248, this.field2252[var9], var12, 128, var10, var11));
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(III)V")
    public static final void method1070(int arg0, int arg1, int arg2) {
        class165 var3 = class36.field545[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field2482 != null) {
            var3.field2482 = null;
        }
        if (var3.field2493 != null) {
            var3.field2493 = null;
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(ILqa;Lna;Lna;)V")
    public final void method1071(int arg0, class162 arg1, class35 arg2, class35 arg3) {
        field2254++;
        int[][] var5 = new int[this.field2261][this.field2248];
        if (class65.field1143 == null || class65.field1143.length != this.field2248) {
            class508.field7424 = new int[this.field2248];
            class111.field1759 = new int[this.field2248];
            class55.field810 = new int[this.field2248];
            class31.field501 = new int[this.field2248];
            class65.field1143 = new int[this.field2248];
        }
        if (arg0 != -1) {
            this.field2260 = null;
        }
        for (int var6 = 0; var6 < this.field2250; var6++) {
            for (int var8 = 0; var8 < this.field2248; var8++) {
                class65.field1143[var8] = 0;
                class111.field1759[var8] = 0;
                class55.field810[var8] = 0;
                class508.field7424[var8] = 0;
                class31.field501[var8] = 0;
            }
            for (int var9 = -5; var9 < this.field2261; var9++) {
                for (int var10 = 0; var10 < this.field2248; var10++) {
                    int var19 = var9 + 5;
                    int var10002;
                    if (var19 < this.field2261) {
                        int var20 = this.field2249[var6][var19][var10] & 0xFF;
                        if (var20 > 0) {
                            class443 var21 = this.field2269.method267(true, var20 - 1);
                            class65.field1143[var10] += var21.field6505;
                            class111.field1759[var10] += var21.field6493;
                            class55.field810[var10] += var21.field6499;
                            class508.field7424[var10] += var21.field6494;
                            var10002 = class31.field501[var10]++;
                        }
                    }
                    int var22 = var9 - 5;
                    if (var22 >= 0) {
                        int var23 = this.field2249[var6][var22][var10] & 0xFF;
                        if (var23 > 0) {
                            class443 var24 = this.field2269.method267(true, var23 - 1);
                            class65.field1143[var10] -= var24.field6505;
                            class111.field1759[var10] -= var24.field6493;
                            class55.field810[var10] -= var24.field6499;
                            class508.field7424[var10] -= var24.field6494;
                            var10002 = class31.field501[var10]--;
                        }
                    }
                }
                if (var9 >= 0) {
                    int var11 = 0;
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    for (int var16 = -5; var16 < this.field2248; var16++) {
                        int var17 = var16 + 5;
                        if (this.field2248 > var17) {
                            var11 += class65.field1143[var17];
                            var13 += class55.field810[var17];
                            var14 += class508.field7424[var17];
                            var12 += class111.field1759[var17];
                            var15 += class31.field501[var17];
                        }
                        int var18 = var16 - 5;
                        if (var18 >= 0) {
                            var13 -= class55.field810[var18];
                            var12 -= class111.field1759[var18];
                            var14 -= class508.field7424[var18];
                            var11 -= class65.field1143[var18];
                            var15 -= class31.field501[var18];
                        }
                        if (var16 >= 0 && var14 > 0 && var15 > 0) {
                            var5[var9][var16] = class97.method767(-126, var13 / var15, var11 * 256 / var14, var12 / var15);
                        }
                    }
                }
            }
            if (class237.field3431) {
                this.method1075(var5, class529.field7807[var6], arg1, var6 == 0 ? arg2 : null, (byte) -106, var6, var6 == 0 ? arg3 : null);
            } else {
                this.method1068(-111, var5, var6, var6 == 0 ? arg2 : null, arg1, var6 == 0 ? arg3 : null, class529.field7807[var6]);
            }
            this.field2249[var6] = null;
            this.field2271[var6] = null;
            this.field2264[var6] = null;
            this.field2266[var6] = null;
        }
        if (!this.field2251) {
            if (class67.field1167 != 0) {
                class206.method1384();
            }
            if (class356.field5388) {
                class524.method3095();
            }
        }
        for (int var7 = 0; var7 < this.field2250; var7++) {
            class529.field7807[var7].method284();
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIII)V")
    public final void method1072(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 > -25) {
            this.field2252 = null;
        }
        for (int var6 = 0; var6 < this.field2250; var6++) {
            this.method1077(var6, false, arg3, arg4, arg1, arg2);
        }
        field2256++;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(I[Loe;ZIIILti;)V")
    public final void method1073(int arg0, class133[] arg1, boolean arg2, int arg3, int arg4, int arg5, class303 arg6) {
        if (!this.field2251) {
            for (int var8 = 0; var8 < 4; var8++) {
                class133 var9 = arg1[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg4 + var10;
                        int var13 = arg3 + var11;
                        if (var12 >= 0 && var12 < this.field2261 && var13 >= 0 && var13 < this.field2248) {
                            var9.method977((byte) 78, var13, var12);
                        }
                    }
                }
            }
        }
        field2247++;
        int var14 = arg4 + arg5;
        int var15 = arg0 + arg3;
        for (int var16 = 0; var16 < this.field2250; var16++) {
            for (int var17 = 0; var17 < 64; var17++) {
                for (int var18 = 0; var18 < 64; var18++) {
                    this.method1076(0, -1, 0, 0, arg3 + var18, var14 + var17, false, var15 + var18, arg6, var16, arg4 + var17);
                }
            }
        }
        if (!arg2) {
            this.field2251 = false;
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "([[IIZ)V")
    public final void method1074(int[][] arg0, int arg1, boolean arg2) {
        field2245++;
        int[][] var4 = this.field2252[arg1];
        if (!arg2) {
            this.method1077(-5, true, 55, 66, 115, -57);
        }
        for (int var5 = 0; var5 < (this.field2261 + 1); var5++) {
            for (int var6 = 0; var6 < (this.field2248 + 1); var6++) {
                var4[var5][var6] += arg0[var5][var6];
            }
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "([[ILna;Lqa;Lna;BILna;)V")
    private final void method1075(int[][] arg0, class35 arg1, class162 arg2, class35 arg3, byte arg4, int arg5, class35 arg6) {
        field2244++;
        byte[][] var8 = this.field2264[arg5];
        byte[][] var9 = this.field2266[arg5];
        byte[][] var10 = this.field2249[arg5];
        byte[][] var11 = this.field2271[arg5];
        for (int var12 = 0; var12 < this.field2261; var12++) {
            int var13 = this.field2261 - 1 > var12 ? var12 + 1 : var12;
            for (int var14 = 0; var14 < this.field2248; var14++) {
                int var15 = (this.field2248 - 1) > var14 ? var14 + 1 : var14;
                if (class400.field5873 == -1 || class110.method813(-115, var12, class400.field5873, var14, arg5)) {
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
                        class220 var26 = var21 == 0 ? null : this.field2260.method2222(-21925, var21 - 1);
                        class443 var27 = var22 == 0 ? null : this.field2269.method267(true, var22 - 1);
                        if (var19 == 0 && var26 == null) {
                            var19 = 12;
                        }
                        class220 var28 = var26;
                        if (var26 != null) {
                            if (var26.field3165 == -1 && var26.field3177 == -1) {
                                var28 = var26;
                                var26 = null;
                            } else if (var27 != null && var19 != 0) {
                                var17 = var26.field3184;
                            }
                        }
                        if ((var19 == 0 || var19 == 12) && var12 > 0 && var14 > 0 && var12 < this.field2261 && this.field2248 > var14) {
                            byte var29 = 0;
                            byte var30 = 0;
                            byte var31 = 0;
                            byte var32 = 0;
                            int var33 = var29 + (var10[var12 - 1][var14 - 1] == var22 ? 1 : -1);
                            int var34 = var31 + (var10[var13][var15] == var22 ? 1 : -1);
                            int var35 = var30 + (var10[var13][var14 - 1] == var22 ? 1 : -1);
                            if (var10[var12][var14 - 1] == var22) {
                                var33++;
                                var35++;
                            } else {
                                var35--;
                                var33--;
                            }
                            int var36 = var32 + (var10[var12 - 1][var15] == var22 ? 1 : -1);
                            if (var10[var13][var14] == var22) {
                                var35++;
                                var34++;
                            } else {
                                var35--;
                                var34--;
                            }
                            if (var10[var12][var15] == var22) {
                                var36++;
                                var34++;
                            } else {
                                var36--;
                                var34--;
                            }
                            if (var10[var12 - 1][var14] == var22) {
                                var33++;
                                var36++;
                            } else {
                                var36--;
                                var33--;
                            }
                            int var37 = var33 - var34;
                            if (var37 < 0) {
                                var37 = -var37;
                            }
                            int var38 = var35 - var36;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            if (var37 == var38) {
                                var37 = arg1.method271(var12, var14) - arg1.method271(var13, var15);
                                var38 = arg1.method271(var13, var14) - arg1.method271(var12, var15);
                                if (var37 < 0) {
                                    var37 = -var37;
                                }
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                            }
                            var20 = var38 <= var37 ? 0 : 1;
                        }
                        for (int var39 = 0; var39 < 13; var39++) {
                            class507.field7421[var39] = -1;
                            class358.field5421[var39] = 1;
                        }
                        boolean[] var40 = var26 != null && var26.field3184 ? class42.field637[var19] : class488.field7125[var19];
                        this.method1067(var18, var19, var26, arg2, 84, var27, var20, var9, var12, var11, this.field2261, this.field2248, var8, var14);
                        boolean var41 = var26 != null && var26.field3177 != var26.field3165;
                        if (!var41) {
                            for (int var42 = 0; var42 < 8; var42++) {
                                if (class507.field7421[var42] >= 0 && class465.field6833[var42] != class355.field5367[var42]) {
                                    var41 = true;
                                    break;
                                }
                            }
                        }
                        if (!var40[var20 + 1 & 0x3]) {
                            var18[1] = class155.method1122(var18[1], class388.method2441(class358.field5421[2], class358.field5421[4]) == 0);
                        }
                        if (!var40[var20 + 3 & 0x3]) {
                            var18[3] = class155.method1122(var18[3], class388.method2441(class358.field5421[0], class358.field5421[6]) == 0);
                        }
                        if (!var40[var20 & 0x3]) {
                            var18[0] = class155.method1122(var18[0], class388.method2441(class358.field5421[0], class358.field5421[2]) == 0);
                        }
                        if (!var40[var20 + 2 & 0x3]) {
                            var18[2] = class155.method1122(var18[2], class388.method2441(class358.field5421[4], class358.field5421[6]) == 0);
                        }
                        if (!var17 && (var19 == 0 || var19 == 12)) {
                            if (var18[0] && !var18[1] && !var18[2] && var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var18[0] = var18[3] = false;
                                var20 = 0;
                            } else if (var18[0] && var18[1] && !var18[2] && !var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var20 = 3;
                                var18[0] = var18[1] = false;
                            } else if (!var18[0] && var18[1] && var18[2] && !var18[3]) {
                                var18[1] = var18[2] = false;
                                var19 = var19 == 0 ? 13 : 14;
                                var20 = 2;
                            } else if (!var18[0] && !var18[1] && var18[2] && var18[3]) {
                                var18[2] = var18[3] = false;
                                var19 = var19 == 0 ? 13 : 14;
                                var20 = 1;
                            }
                        }
                        boolean var43 = !var17 && !var18[0] && !var18[2] && !var18[1] && !var18[3];
                        int[] var44 = null;
                        int var45;
                        int[] var46;
                        int var47;
                        int[] var48;
                        int[] var49;
                        if (var43) {
                            var49 = class122.field1908[var19];
                            var47 = var27 == null ? 0 : class161.field2439[var19];
                            var46 = class448.field6566[var19];
                            var48 = class404.field5953[var19];
                            var45 = var26 == null ? 0 : class30.field493[var19];
                        } else if (var17) {
                            var45 = var26 == null ? 0 : class491.field7179[var19];
                            var48 = class51.field741[var19];
                            var49 = class503.field7378[var19];
                            var47 = var27 == null ? 0 : class38.field580[var19];
                            var44 = class277.field4001[var19];
                            var46 = class367.field5508[var19];
                        } else {
                            var45 = var26 == null ? 0 : class339.field5187[var19];
                            var46 = class73.field1217[var19];
                            var47 = var27 == null ? 0 : class513.field7561[var19];
                            var44 = class18.field284[var19];
                            var48 = class494.field7194[var19];
                            var49 = class146.field2152[var19];
                        }
                        int var50 = var45 + var47;
                        if (var50 <= 0) {
                            class16.method152(arg5, var12, var14);
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
                            int[] var60 = arg3 == null ? null : new int[var53];
                            int[] var61 = arg3 == null && arg6 == null ? null : new int[var53];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var26 != null) {
                                var62 = var26.field3165;
                                var63 = arg2.method473() ? var26.field3172 : var26.field3182;
                                var64 = var26.field3166;
                                int var65 = class530.method3143(var26, arg2, arg4 - 20700);
                                for (int var66 = 0; var66 < var45; var66++) {
                                    boolean var97 = false;
                                    byte var98;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class323.field4960[0] = var46[var51];
                                        class323.field4960[1] = 1;
                                        class323.field4960[2] = var49[var51];
                                        class323.field4960[3] = 1;
                                        class323.field4960[4] = var48[var51];
                                        var98 = 6;
                                        class323.field4960[5] = var49[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class323.field4960[0] = var46[var51];
                                        class323.field4960[1] = 5;
                                        class323.field4960[2] = var49[var51];
                                        class323.field4960[3] = 5;
                                        class323.field4960[4] = var48[var51];
                                        class323.field4960[5] = var49[var51];
                                        var98 = 6;
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class323.field4960[0] = var46[var51];
                                        class323.field4960[1] = 3;
                                        class323.field4960[2] = var49[var51];
                                        class323.field4960[3] = 3;
                                        class323.field4960[4] = var48[var51];
                                        class323.field4960[5] = var49[var51];
                                        var98 = 6;
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class323.field4960[0] = var46[var51];
                                        class323.field4960[1] = 7;
                                        class323.field4960[2] = var49[var51];
                                        class323.field4960[3] = 7;
                                        class323.field4960[4] = var48[var51];
                                        var98 = 6;
                                        class323.field4960[5] = var49[var51];
                                    } else {
                                        class323.field4960[0] = var46[var51];
                                        class323.field4960[1] = var48[var51];
                                        var98 = 3;
                                        class323.field4960[2] = var49[var51];
                                    }
                                    for (int var99 = 0; var99 < var98; var99++) {
                                        int var100 = class323.field4960[var99];
                                        int var101 = var100 - (var20 * 2) & 0x7;
                                        int var102 = this.field2259[var100];
                                        int var103 = this.field2268[var100];
                                        int var104;
                                        int var105;
                                        if (var20 == 1) {
                                            var105 = 128 - var102;
                                            var104 = var103;
                                        } else if (var20 == 2) {
                                            var105 = 128 - var103;
                                            var104 = 128 - var102;
                                        } else if (var20 == 3) {
                                            var104 = 128 - var103;
                                            var105 = var102;
                                        } else {
                                            var104 = var102;
                                            var105 = var103;
                                        }
                                        var55[var52] = var104;
                                        var56[var52] = var105;
                                        if (var60 != null && class62.field1072[var19][var100]) {
                                            int var106 = (var12 << 7) + var104;
                                            int var107 = (var14 << 7) + var105;
                                            var60[var52] = arg3.method273(var106, var107) - arg1.method273(var106, var107);
                                        }
                                        if (var61 != null) {
                                            if (arg3 != null && !class62.field1072[var19][var100]) {
                                                int var108 = (var12 << 7) + var104;
                                                int var109 = (var14 << 7) + var105;
                                                var61[var52] = arg1.method273(var108, var109) - arg3.method273(var108, var109);
                                            } else if (arg6 != null && !class186.field2768[var19][var100]) {
                                                int var110 = (var12 << 7) + var104;
                                                int var111 = (var14 << 7) + var105;
                                                var61[var52] = arg6.method273(var110, var111) - arg1.method273(var110, var111);
                                            }
                                        }
                                        if (var100 < 8 && var26.field3183 < class507.field7421[var101]) {
                                            if (var54 != null) {
                                                var54[var52] = class465.field6833[var101];
                                            }
                                            var59[var52] = class402.field5903[var101];
                                            var58[var52] = class507.field7412[var101];
                                            var57[var52] = class355.field5367[var101];
                                        } else {
                                            if (var54 != null) {
                                                var54[var52] = var65;
                                            }
                                            var58[var52] = arg2.method473() ? var26.field3172 : var26.field3182;
                                            var59[var52] = var26.field3166;
                                            var57[var52] = var62;
                                        }
                                        var52++;
                                    }
                                    var51++;
                                }
                                if (!this.field2251 && arg5 == 0) {
                                    class153.method1107(var12, var14, var26.field3179, var26.field3170 * 8, var26.field3168);
                                }
                                if (var19 != 12 && var26.field3165 != -1 && var26.field3176) {
                                    var16 = true;
                                }
                            } else if (var43) {
                                var51 += class30.field493[var19];
                            } else if (var17) {
                                var51 += class491.field7179[var19];
                            } else {
                                var51 += class339.field5187[var19];
                            }
                            if (var27 != null) {
                                if (var25 == 0) {
                                    var25 = var22;
                                }
                                if (var24 == 0) {
                                    var24 = var22;
                                }
                                if (var23 == 0) {
                                    var23 = var22;
                                }
                                class443 var67 = this.field2269.method267(true, var22 - 1);
                                class443 var68 = this.field2269.method267(true, var23 - 1);
                                class443 var69 = this.field2269.method267(true, var24 - 1);
                                class443 var70 = this.field2269.method267(true, var25 - 1);
                                for (int var71 = 0; var71 < var47; var71++) {
                                    boolean var72 = false;
                                    byte var73;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class323.field4960[0] = var46[var51];
                                        class323.field4960[1] = 1;
                                        class323.field4960[2] = var49[var51];
                                        class323.field4960[3] = 1;
                                        class323.field4960[4] = var48[var51];
                                        var73 = 6;
                                        class323.field4960[5] = var49[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class323.field4960[0] = var46[var51];
                                        class323.field4960[1] = 5;
                                        class323.field4960[2] = var49[var51];
                                        class323.field4960[3] = 5;
                                        class323.field4960[4] = var48[var51];
                                        var73 = 6;
                                        class323.field4960[5] = var49[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class323.field4960[0] = var46[var51];
                                        class323.field4960[1] = 3;
                                        class323.field4960[2] = var49[var51];
                                        class323.field4960[3] = 3;
                                        class323.field4960[4] = var48[var51];
                                        var73 = 6;
                                        class323.field4960[5] = var49[var51];
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class323.field4960[0] = var46[var51];
                                        class323.field4960[1] = 7;
                                        class323.field4960[2] = var49[var51];
                                        class323.field4960[3] = 7;
                                        class323.field4960[4] = var48[var51];
                                        var73 = 6;
                                        class323.field4960[5] = var49[var51];
                                    } else {
                                        class323.field4960[0] = var46[var51];
                                        class323.field4960[1] = var48[var51];
                                        class323.field4960[2] = var49[var51];
                                        var73 = 3;
                                    }
                                    var51++;
                                    for (int var74 = 0; var74 < var73; var74++) {
                                        int var75 = class323.field4960[var74];
                                        int var76 = var75 - (var20 * 2) & 0x7;
                                        int var77 = this.field2259[var75];
                                        int var78 = this.field2268[var75];
                                        int var79;
                                        int var80;
                                        if (var20 == 1) {
                                            var79 = 128 - var77;
                                            var80 = var78;
                                        } else if (var20 == 2) {
                                            var80 = 128 - var77;
                                            var79 = 128 - var78;
                                        } else if (var20 == 3) {
                                            var79 = var77;
                                            var80 = 128 - var78;
                                        } else {
                                            var80 = var77;
                                            var79 = var78;
                                        }
                                        var55[var52] = var80;
                                        var56[var52] = var79;
                                        if (var60 != null && class62.field1072[var19][var75]) {
                                            int var81 = (var12 << 7) + var80;
                                            int var82 = (var14 << 7) + var79;
                                            var60[var52] = arg3.method273(var81, var82) - arg1.method273(var81, var82);
                                        }
                                        if (var61 != null) {
                                            if (arg3 != null && !class62.field1072[var19][var75]) {
                                                int var83 = (var12 << 7) + var80;
                                                int var84 = (var14 << 7) + var79;
                                                var61[var52] = arg1.method273(var83, var84) - arg3.method273(var83, var84);
                                            } else if (arg6 != null && !class186.field2768[var19][var75]) {
                                                int var85 = (var12 << 7) + var80;
                                                int var86 = (var14 << 7) + var79;
                                                var61[var52] = arg6.method273(var85, var86) - arg1.method273(var85, var86);
                                            }
                                        }
                                        if (var75 < 8 && class507.field7421[var76] >= 0) {
                                            if (var54 != null) {
                                                var54[var52] = class465.field6833[var76];
                                            }
                                            var59[var52] = class402.field5903[var76];
                                            var58[var52] = class507.field7412[var76];
                                            var57[var52] = class355.field5367[var76];
                                        } else {
                                            if (var17 && class62.field1072[var19][var75]) {
                                                var58[var52] = var63;
                                                var59[var52] = var64;
                                                var57[var52] = var62;
                                            } else if (var80 == 0 && var79 == 0) {
                                                var57[var52] = arg0[var12][var14];
                                                var58[var52] = var67.field6492;
                                                var59[var52] = var67.field6503;
                                            } else if (var80 == 0 && var79 == 128) {
                                                var57[var52] = arg0[var12][var15];
                                                var58[var52] = var68.field6492;
                                                var59[var52] = var68.field6503;
                                            } else if (var80 == 128 && var79 == 128) {
                                                var57[var52] = arg0[var13][var15];
                                                var58[var52] = var69.field6492;
                                                var59[var52] = var69.field6503;
                                            } else if (var80 == 128 && var79 == 0) {
                                                var57[var52] = arg0[var13][var14];
                                                var58[var52] = var70.field6492;
                                                var59[var52] = var70.field6503;
                                            } else {
                                                if (var80 < 64) {
                                                    if (var79 >= 64) {
                                                        var58[var52] = var68.field6492;
                                                        var59[var52] = var68.field6503;
                                                    } else {
                                                        var58[var52] = var67.field6492;
                                                        var59[var52] = var67.field6503;
                                                    }
                                                } else if (var79 < 64) {
                                                    var58[var52] = var70.field6492;
                                                    var59[var52] = var70.field6503;
                                                } else {
                                                    var58[var52] = var69.field6492;
                                                    var59[var52] = var69.field6503;
                                                }
                                                int var87 = class441.method2681(arg0[var12][var14], var80 << 7 >> 7, arg0[var13][var14], false);
                                                int var88 = class441.method2681(arg0[var12][var15], var80 << 7 >> 7, arg0[var13][var15], false);
                                                var57[var52] = class441.method2681(var87, var79 << 7 >> 7, var88, false);
                                            }
                                            if (var54 != null) {
                                                var54[var52] = var57[var52];
                                            }
                                        }
                                        var52++;
                                    }
                                }
                                if (var19 != 0 && var27.field6490) {
                                    var16 = true;
                                }
                            }
                            int var89 = arg1.method271(var12, var14);
                            int var90 = arg1.method271(var13, var14);
                            int var91 = arg1.method271(var13, var15);
                            int var92 = arg1.method271(var12, var15);
                            if (arg5 > 0) {
                                boolean var93 = true;
                                if (var22 == 0 && var19 != 0) {
                                    var93 = false;
                                }
                                if (var21 > 0 && var28 != null && !var28.field3175) {
                                    var93 = false;
                                }
                                if (var93 && var89 == var90 && var89 == var91 && var89 == var92) {
                                    this.field2253[arg5][var12][var14] = (byte) class29.method239(this.field2253[arg5][var12][var14], 4);
                                }
                            }
                            int var94 = 0;
                            int var95 = 0;
                            int var96 = 0;
                            if (this.field2251) {
                                var94 = class256.method1628(var12, var14);
                                var95 = class97.method768(var12, var14);
                                var96 = class279.method1772(var12, var14);
                            }
                            arg1.method282(var12, var14, var55, var60, var56, var61, var57, var54, var58, var59, var94, var95, var96, var16);
                            class16.method152(arg5, var12, var14);
                        }
                    }
                }
            }
        }
        if (arg4 != -106) {
            this.method1067(null, -29, null, null, -125, null, 96, null, -91, null, -101, 120, null, -113);
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIIIIZILti;II)V")
    private final void method1076(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, class303 arg8, int arg9, int arg10) {
        if (arg2 == 1) {
            arg3 = 1;
        } else if (arg2 == 2) {
            arg0 = 1;
            arg3 = 1;
        } else if (arg2 == 3) {
            arg0 = 1;
        }
        field2262++;
        if (arg1 < ~arg10 || this.field2261 <= arg10 || arg4 < 0 || arg4 >= this.field2248) {
            while (true) {
                int var14 = arg8.method1918((byte) -41);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg8.method1918((byte) 108);
                    return;
                }
                if (var14 <= 49) {
                    arg8.method1918((byte) -79);
                }
            }
        }
        if (!this.field2251 && !arg6) {
            class364.field5475[arg9][arg10][arg4] = 0;
        }
        while (true) {
            int var12 = arg8.method1918((byte) 126);
            if (var12 == 0) {
                if (this.field2251) {
                    this.field2252[0][arg0 + arg10][arg3 + arg4] = 0;
                    return;
                } else if (arg9 == 0) {
                    this.field2252[0][arg0 + arg10][arg3 + arg4] = -class21.method178(arg7 + 556238, (byte) -106, arg5 + 932731) * 8 << 0;
                    return;
                } else {
                    this.field2252[arg9][arg0 + arg10][arg4 + arg3] = this.field2252[arg9 - 1][arg0 + arg10][arg3 + arg4] - 240;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg8.method1918((byte) 121);
                if (this.field2251) {
                    this.field2252[0][arg0 + arg10][arg3 + arg4] = var13 * 8 << 0;
                    return;
                }
                if (var13 == 1) {
                    var13 = 0;
                }
                if (arg9 == 0) {
                    this.field2252[0][arg0 + arg10][arg3 + arg4] = -var13 * 8 << 0;
                    return;
                }
                this.field2252[arg9][arg0 + arg10][arg3 + arg4] = this.field2252[arg9 - 1][arg10 + arg0][arg3 + arg4] - (var13 * 8 << 0);
                return;
            }
            if (var12 <= 49) {
                if (arg6) {
                    arg8.method1918((byte) 116);
                } else {
                    this.field2271[arg9][arg10][arg4] = arg8.method1899((byte) 93);
                    this.field2264[arg9][arg10][arg4] = (byte) ((var12 - 2) / 4);
                    this.field2266[arg9][arg10][arg4] = (byte) class388.method2441(3, var12 + arg2 - 2);
                }
            } else if (var12 <= 81) {
                if (!this.field2251 && !arg6) {
                    class364.field5475[arg9][arg10][arg4] = (byte) (var12 - 49);
                }
            } else if (!arg6) {
                this.field2249[arg9][arg10][arg4] = (byte) (var12 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IZIIII)V")
    public final void method1077(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var7 = arg3; var7 < arg3 + arg2; var7++) {
            for (int var10 = arg4; var10 < arg4 + arg5; var10++) {
                if (var10 >= 0 && this.field2261 > var10 && var7 >= 0 && var7 < this.field2248) {
                    this.field2252[arg0][var10][var7] = arg0 > 0 ? this.field2252[arg0 - 1][var10][var7] - 240 : 0;
                }
            }
        }
        if (arg1) {
            this.field2251 = false;
        }
        field2257++;
        if (arg4 > 0 && this.field2261 > arg4) {
            for (int var8 = arg3 + 1; var8 < (arg2 + arg3); var8++) {
                if (var8 >= 0 && var8 < this.field2248) {
                    this.field2252[arg0][arg4][var8] = this.field2252[arg0][arg4 - 1][var8];
                }
            }
        }
        if (arg3 > 0 && this.field2248 > arg3) {
            for (int var9 = arg4 + 1; var9 < arg4 + arg5; var9++) {
                if (var9 >= 0 && var9 < this.field2261) {
                    this.field2252[arg0][var9][arg3] = this.field2252[arg0][var9][arg3 - 1];
                }
            }
        }
        if (arg4 < 0 || arg3 < 0 || arg4 >= this.field2261 || arg3 >= this.field2248) {
            return;
        }
        if (arg0 == 0) {
            if (arg4 > 0 && this.field2252[arg0][arg4 - 1][arg3] != 0) {
                this.field2252[arg0][arg4][arg3] = this.field2252[arg0][arg4 - 1][arg3];
                return;
            }
            if (arg3 > 0 && this.field2252[arg0][arg4][arg3 - 1] != 0) {
                this.field2252[arg0][arg4][arg3] = this.field2252[arg0][arg4][arg3 - 1];
                return;
            }
            if (arg4 > 0 && arg3 > 0 && this.field2252[arg0][arg4 - 1][arg3 - 1] != 0) {
                this.field2252[arg0][arg4][arg3] = this.field2252[arg0][arg4 - 1][arg3 - 1];
                return;
            }
        } else if (arg4 <= 0 || this.field2252[arg0 - 1][arg4 - 1][arg3] == this.field2252[arg0][arg4 - 1][arg3]) {
            if (arg3 <= 0 || this.field2252[arg0][arg4][arg3 - 1] == this.field2252[arg0 - 1][arg4][arg3 - 1]) {
                if (arg4 > 0 && arg3 > 0 && this.field2252[arg0 - 1][arg4 - 1][arg3 - 1] != this.field2252[arg0][arg4 - 1][arg3 - 1]) {
                    this.field2252[arg0][arg4][arg3] = this.field2252[arg0][arg4 - 1][arg3 - 1];
                    return;
                }
                return;
            }
            this.field2252[arg0][arg4][arg3] = this.field2252[arg0][arg4][arg3 - 1];
        } else {
            this.field2252[arg0][arg4][arg3] = this.field2252[arg0][arg4 - 1][arg3];
            return;
        }
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "(IIIZLjb;Lgs;)V")
    public class149(int arg0, int arg1, int arg2, boolean arg3, class340 arg4, class34 arg5) {
        this.field2248 = arg2;
        this.field2260 = arg4;
        this.field2251 = arg3;
        this.field2269 = arg5;
        this.field2250 = arg0;
        this.field2261 = arg1;
        this.field2264 = new byte[this.field2250][this.field2261][this.field2248];
        this.field2266 = new byte[this.field2250][this.field2261][this.field2248];
        this.field2253 = new byte[this.field2250][this.field2261 + 1][this.field2248 + 1];
        this.field2252 = new int[this.field2250][this.field2261 + 1][this.field2248 + 1];
        this.field2249 = new byte[this.field2250][this.field2261][this.field2248];
        this.field2271 = new byte[this.field2250][this.field2261][this.field2248];
    }
}
