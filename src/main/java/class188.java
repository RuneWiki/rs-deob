import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rfa")
public class class188 {

    @OriginalMember(owner = "client!rfa", name = "d", descriptor = "[I")
    private int[] field2218 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

    @OriginalMember(owner = "client!rfa", name = "B", descriptor = "[I")
    private int[] field2242 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

    @OriginalMember(owner = "client!rfa", name = "u", descriptor = "Lhba;")
    private class10 field2235;

    @OriginalMember(owner = "client!rfa", name = "z", descriptor = "Z")
    public boolean field2240;

    @OriginalMember(owner = "client!rfa", name = "g", descriptor = "I")
    public int field2221;

    @OriginalMember(owner = "client!rfa", name = "v", descriptor = "I")
    public int field2236;

    @OriginalMember(owner = "client!rfa", name = "l", descriptor = "Lmga;")
    private class665 field2226;

    @OriginalMember(owner = "client!rfa", name = "s", descriptor = "I")
    public int field2233;

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "[[[B")
    private byte[][][] field2215;

    @OriginalMember(owner = "client!rfa", name = "x", descriptor = "[[[B")
    private byte[][][] field2238;

    @OriginalMember(owner = "client!rfa", name = "r", descriptor = "[[[I")
    public int[][][] field2232;

    @OriginalMember(owner = "client!rfa", name = "h", descriptor = "[[[B")
    public byte[][][] field2222;

    @OriginalMember(owner = "client!rfa", name = "C", descriptor = "[[[B")
    private byte[][][] field2243;

    @OriginalMember(owner = "client!rfa", name = "A", descriptor = "[[[B")
    private byte[][][] field2241;

    @OriginalMember(owner = "client!rfa", name = "t", descriptor = "I")
    public static int field2234 = 328;

    @OriginalMember(owner = "client!rfa", name = "m", descriptor = "Luv;")
    public static class338 field2227 = new class338();

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!rfa", name = "c", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!rfa", name = "e", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!rfa", name = "f", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!rfa", name = "i", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!rfa", name = "k", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!rfa", name = "o", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!rfa", name = "p", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!rfa", name = "q", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!rfa", name = "w", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!rfa", name = "y", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!rfa", name = "n", descriptor = "[[[B")
    public byte[][][] field2228;

    @OriginalMember(owner = "client!rfa", name = "j", descriptor = "[[[I")
    public static int[][][] field2224;

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IIIIII[Lld;IILji;)V", line = 3)
    public final void method1111(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class158[] arg6, int arg7, int arg8, class572 arg9) {
        field2237++;
        int var11 = (arg1 & 0x7) * 8;
        int var12 = (arg7 & 0x7) * 8;
        if (!this.field2240) {
            class158 var13 = arg6[arg8];
            for (int var14 = 0; var14 < 8; var14++) {
                for (int var15 = 0; var15 < 8; var15++) {
                    int var16 = class122.method806((byte) 88, var14 & 0x7, arg5, var15 & 0x7) + arg4;
                    int var17 = class379.method2184(var14 & 0x7, var15 & 0x7, 2, arg5) + arg3;
                    if (var16 > 0 && var16 < (this.field2233 - 1) && var17 > 0 && var17 < (this.field2236 - 1)) {
                        var13.method974(-2995, var16, var17);
                    }
                }
            }
        }
        if (arg0 > -23) {
            return;
        }
        int var18 = arg1 & 0x1FFFFFF8 << 3;
        int var19 = (arg7 & 0xFFFFFFF8) << 3;
        byte var20 = 0;
        byte var21 = 0;
        if (arg5 == 1) {
            var21 = 1;
        } else if (arg5 == 2) {
            var21 = 1;
            var20 = 1;
        } else if (arg5 == 3) {
            var20 = 1;
        }
        for (int var22 = 0; var22 < this.field2221; var22++) {
            for (int var23 = 0; var23 < 64; var23++) {
                for (int var24 = 0; var24 < 64; var24++) {
                    if (arg2 == var22 && var11 <= var23 && var11 + 8 >= var23 && var24 >= var12 && var24 <= (var12 + 8)) {
                        int var25;
                        int var26;
                        if (var11 + 8 == var23 || (var12 + 8) == var24) {
                            if (arg5 == 0) {
                                var25 = arg4 + var23 - var11;
                                var26 = var24 + arg3 - var12;
                            } else if (arg5 == 1) {
                                var26 = arg3 + 8 - (-var11 + var23);
                                var25 = arg4 + var24 - var12;
                            } else if (arg5 == 2) {
                                var25 = arg4 + var11 + 8 - var23;
                                var26 = arg3 + var12 + 8 - var24;
                            } else {
                                var26 = arg3 + var23 - var11;
                                var25 = var12 - (var24 - (arg4 + 8));
                            }
                            this.method1121(0, 0, (byte) 64, arg8, var19 + var24, true, var25, 0, var26, var18 + var23, arg9);
                        } else {
                            var25 = class122.method806((byte) 116, var23 & 0x7, arg5, var24 & 0x7) + arg4;
                            var26 = arg3 + class379.method2184(var23 & 0x7, var24 & 0x7, 2, arg5);
                            this.method1121(var21, arg5, (byte) 79, arg8, var19 + var24, false, var25, var20, var26, var18 + var23, arg9);
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
                                if (arg5 == 0) {
                                    var31 = arg3 + var30 - var12;
                                    var32 = arg4 + var29 - var11;
                                } else if (arg5 == 1) {
                                    var32 = arg4 + var30 - var12;
                                    var31 = var11 + arg3 + 8 - var29;
                                } else if (arg5 == 2) {
                                    var32 = arg4 + var11 + 8 - var29;
                                    var31 = 8 - var30 - (-var12 - arg3);
                                } else {
                                    var32 = arg4 + var12 + 8 - var30;
                                    var31 = var29 - (var11 - arg3);
                                }
                                if (var32 >= 0 && var32 < this.field2233 && var31 >= 0 && var31 < this.field2236) {
                                    this.field2232[arg8][var32][var31] = this.field2232[arg8][var20 + var25][var21 + var26];
                                }
                            }
                        }
                    } else {
                        this.method1121(0, 0, (byte) 90, 0, 0, false, -1, 0, -1, 0, arg9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Ljl;Loa;[[B[[BII[ZBIIILvi;[[BI)V", line = 209)
    private final void method1112(class253 arg0, class650 arg1, byte[][] arg2, byte[][] arg3, int arg4, int arg5, boolean[] arg6, byte arg7, int arg8, int arg9, int arg10, class505 arg11, byte[][] arg12, int arg13) {
        field2216++;
        boolean[] var15 = arg11 != null && arg11.field6316 ? class53.field668[arg5] : class693.field9603[arg5];
        if (arg8 > 0) {
            if (arg13 > 0) {
                int var16 = arg12[arg13 - 1][arg8 - 1] & 0xFF;
                if (var16 > 0) {
                    class505 var17 = this.field2226.method3700(4, var16 - 1);
                    if (var17.field6314 != -1 && var17.field6316) {
                        byte var18 = arg2[arg13 - 1][arg8 - 1];
                        int var19 = arg3[arg13 - 1][arg8 - 1] * 2 + 4 & 0x7;
                        int var20 = class636.method3563(arg1, var17, (byte) 24);
                        if (class517.field6543[var18][var19]) {
                            class24.field282[0] = var17.field6314;
                            class370.field4784[0] = var20;
                            class681.field9274[0] = arg1.method419() ? var17.field6300 : var17.field6301;
                            class436.field5489[0] = var17.field6309;
                            class95.field1238[0] = var17.field6305;
                            class309.field3893[0] = 256;
                        }
                    }
                }
            }
            if (arg13 < arg9 - 1) {
                int var21 = arg12[arg13 + 1][arg8 - 1] & 0xFF;
                if (var21 > 0) {
                    class505 var22 = this.field2226.method3700(4, var21 - 1);
                    if (var22.field6314 != -1 && var22.field6316) {
                        byte var23 = arg2[arg13 + 1][arg8 - 1];
                        int var24 = arg3[arg13 + 1][arg8 - 1] * 2 + 6 & 0x7;
                        int var25 = class636.method3563(arg1, var22, (byte) 24);
                        if (class517.field6543[var23][var24]) {
                            class24.field282[2] = var22.field6314;
                            class370.field4784[2] = var25;
                            class681.field9274[2] = arg1.method419() ? var22.field6300 : var22.field6301;
                            class436.field5489[2] = var22.field6309;
                            class95.field1238[2] = var22.field6305;
                            class309.field3893[2] = 512;
                        }
                    }
                }
            }
        }
        if (arg8 < (arg4 - 1)) {
            if (arg13 > 0) {
                int var26 = arg12[arg13 - 1][arg8 + 1] & 0xFF;
                if (var26 > 0) {
                    class505 var27 = this.field2226.method3700(4, var26 - 1);
                    if (var27.field6314 != -1 && var27.field6316) {
                        byte var28 = arg2[arg13 - 1][arg8 + 1];
                        int var29 = arg3[arg13 - 1][arg8 + 1] * 2 + 2 & 0x7;
                        int var30 = class636.method3563(arg1, var27, (byte) 24);
                        if (class517.field6543[var28][var29]) {
                            class24.field282[6] = var27.field6314;
                            class370.field4784[6] = var30;
                            class681.field9274[6] = arg1.method419() ? var27.field6300 : var27.field6301;
                            class436.field5489[6] = var27.field6309;
                            class95.field1238[6] = var27.field6305;
                            class309.field3893[6] = 64;
                        }
                    }
                }
            }
            if (arg13 < (arg9 - 1)) {
                int var31 = arg12[arg13 + 1][arg8 + 1] & 0xFF;
                if (var31 > 0) {
                    class505 var32 = this.field2226.method3700(4, var31 - 1);
                    if (var32.field6314 != -1 && var32.field6316) {
                        byte var33 = arg2[arg13 + 1][arg8 + 1];
                        int var34 = arg3[arg13 + 1][arg8 + 1] * 2 & 0x7;
                        int var35 = class636.method3563(arg1, var32, (byte) 24);
                        if (class517.field6543[var33][var34]) {
                            class24.field282[4] = var32.field6314;
                            class370.field4784[4] = var35;
                            class681.field9274[4] = arg1.method419() ? var32.field6300 : var32.field6301;
                            class436.field5489[4] = var32.field6309;
                            class95.field1238[4] = var32.field6305;
                            class309.field3893[4] = 128;
                        }
                    }
                }
            }
        }
        int var36 = 34 / ((56 - arg7) / 37);
        if (arg8 > 0) {
            int var37 = arg12[arg13][arg8 - 1] & 0xFF;
            if (var37 > 0) {
                class505 var38 = this.field2226.method3700(4, var37 - 1);
                if (var38.field6314 != -1) {
                    byte var39 = arg2[arg13][arg8 - 1];
                    byte var40 = arg3[arg13][arg8 - 1];
                    if (var38.field6316) {
                        int var41 = 2;
                        int var42 = var40 * 2 + 4;
                        int var43 = class636.method3563(arg1, var38, (byte) 24);
                        for (int var44 = 0; var44 < 3; var44++) {
                            var42 &= 0x7;
                            var41 &= 0x7;
                            if (class517.field6543[var39][var42] && var38.field6305 >= class95.field1238[var41]) {
                                class24.field282[var41] = var38.field6314;
                                class370.field4784[var41] = var43;
                                class681.field9274[var41] = arg1.method419() ? var38.field6300 : var38.field6301;
                                class436.field5489[var41] = var38.field6309;
                                if (class95.field1238[var41] == var38.field6305) {
                                    class309.field3893[var41] = class364.method2113(class309.field3893[var41], 32);
                                } else {
                                    class309.field3893[var41] = 32;
                                }
                                class95.field1238[var41] = var38.field6305;
                            }
                            var41--;
                            var42++;
                        }
                        if (!var15[arg10 & 0x3]) {
                            arg6[0] = class53.field668[var39][class109.method762(var40 + 2, 3)];
                        }
                    } else if (!var15[arg10 & 0x3]) {
                        arg6[0] = class693.field9603[var39][class109.method762(3, var40 + 2)];
                    }
                }
            }
        }
        if (arg8 < (arg4 - 1)) {
            int var45 = arg12[arg13][arg8 + 1] & 0xFF;
            if (var45 > 0) {
                class505 var46 = this.field2226.method3700(4, var45 - 1);
                if (var46.field6314 != -1) {
                    byte var47 = arg2[arg13][arg8 + 1];
                    byte var48 = arg3[arg13][arg8 + 1];
                    if (var46.field6316) {
                        int var49 = 4;
                        int var50 = (var48 * 2) + 2;
                        int var51 = class636.method3563(arg1, var46, (byte) 24);
                        for (int var52 = 0; var52 < 3; var52++) {
                            var50 &= 0x7;
                            var49 &= 0x7;
                            if (class517.field6543[var47][var50] && class95.field1238[var49] <= var46.field6305) {
                                class24.field282[var49] = var46.field6314;
                                class370.field4784[var49] = var51;
                                class681.field9274[var49] = arg1.method419() ? var46.field6300 : var46.field6301;
                                class436.field5489[var49] = var46.field6309;
                                if (class95.field1238[var49] == var46.field6305) {
                                    class309.field3893[var49] = class364.method2113(class309.field3893[var49], 16);
                                } else {
                                    class309.field3893[var49] = 16;
                                }
                                class95.field1238[var49] = var46.field6305;
                            }
                            var50--;
                            var49++;
                        }
                        if (!var15[arg10 + 2 & 0x3]) {
                            arg6[2] = class53.field668[var47][class109.method762(var48, 3)];
                        }
                    } else if (!var15[arg10 + 2 & 0x3]) {
                        arg6[2] = class693.field9603[var47][class109.method762(3, var48)];
                    }
                }
            }
        }
        if (arg13 > 0) {
            int var53 = arg12[arg13 - 1][arg8] & 0xFF;
            if (var53 > 0) {
                class505 var54 = this.field2226.method3700(4, var53 - 1);
                if (var54.field6314 != -1) {
                    byte var55 = arg2[arg13 - 1][arg8];
                    byte var56 = arg3[arg13 - 1][arg8];
                    if (var54.field6316) {
                        int var57 = 6;
                        int var58 = var56 * 2 + 4;
                        int var59 = class636.method3563(arg1, var54, (byte) 24);
                        for (int var60 = 0; var60 < 3; var60++) {
                            var58 &= 0x7;
                            var57 &= 0x7;
                            if (class517.field6543[var55][var58] && var54.field6305 >= class95.field1238[var57]) {
                                class24.field282[var57] = var54.field6314;
                                class370.field4784[var57] = var59;
                                class681.field9274[var57] = arg1.method419() ? var54.field6300 : var54.field6301;
                                class436.field5489[var57] = var54.field6309;
                                if (class95.field1238[var57] == var54.field6305) {
                                    class309.field3893[var57] = class364.method2113(class309.field3893[var57], 8);
                                } else {
                                    class309.field3893[var57] = 8;
                                }
                                class95.field1238[var57] = var54.field6305;
                            }
                            var57++;
                            var58--;
                        }
                        if (!var15[arg10 + 3 & 0x3]) {
                            arg6[3] = class53.field668[var55][class109.method762(var56 + 1, 3)];
                        }
                    } else if (!var15[arg10 + 3 & 0x3]) {
                        arg6[3] = class693.field9603[var55][class109.method762(var56 + 1, 3)];
                    }
                }
            }
        }
        if (arg9 - 1 > arg13) {
            int var61 = arg12[arg13 + 1][arg8] & 0xFF;
            if (var61 > 0) {
                class505 var62 = this.field2226.method3700(4, var61 - 1);
                if (var62.field6314 != -1) {
                    byte var63 = arg2[arg13 + 1][arg8];
                    byte var64 = arg3[arg13 + 1][arg8];
                    if (var62.field6316) {
                        int var65 = 4;
                        int var66 = var64 * 2 + 6;
                        int var67 = class636.method3563(arg1, var62, (byte) 24);
                        for (int var68 = 0; var68 < 3; var68++) {
                            var66 &= 0x7;
                            var65 &= 0x7;
                            if (class517.field6543[var63][var66] && var62.field6305 >= class95.field1238[var65]) {
                                class24.field282[var65] = var62.field6314;
                                class370.field4784[var65] = var67;
                                class681.field9274[var65] = arg1.method419() ? var62.field6300 : var62.field6301;
                                class436.field5489[var65] = var62.field6309;
                                if (class95.field1238[var65] == var62.field6305) {
                                    class309.field3893[var65] = class364.method2113(class309.field3893[var65], 4);
                                } else {
                                    class309.field3893[var65] = 4;
                                }
                                class95.field1238[var65] = var62.field6305;
                            }
                            var65--;
                            var66++;
                        }
                        if (!var15[arg10 + 1 & 0x3]) {
                            arg6[1] = class53.field668[var63][class109.method762(var64 + 3, 3)];
                        }
                    } else if (!var15[arg10 + 1 & 0x3]) {
                        arg6[1] = class693.field9603[var63][class109.method762(var64 + 3, 3)];
                    }
                }
            }
        }
        if (arg11 == null) {
            return;
        }
        int var69 = class636.method3563(arg1, arg11, (byte) 24);
        if (!arg11.field6316) {
            return;
        }
        for (int var70 = 0; var70 < 8; var70++) {
            int var71 = var70 - arg10 * 2 & 0x7;
            if (class517.field6543[arg5][var70] && arg11.field6305 >= class95.field1238[var71]) {
                class24.field282[var71] = arg11.field6314;
                class370.field4784[var71] = var69;
                class681.field9274[var71] = arg1.method419() ? arg11.field6300 : arg11.field6301;
                class436.field5489[var71] = arg11.field6309;
                if (class95.field1238[var71] == arg11.field6305) {
                    class309.field3893[var71] = class364.method2113(class309.field3893[var71], 2);
                } else {
                    class309.field3893[var71] = 2;
                }
                class95.field1238[var71] = arg11.field6305;
            }
        }
        return;
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IIIII)V", line = 674)
    public final void method1113(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != -30728) {
            this.field2215 = null;
        }
        for (int var6 = 0; var6 < this.field2221; var6++) {
            this.method1116(true, arg1, var6, arg0, arg4, arg2);
        }
        field2239++;
    }

    @OriginalMember(owner = "client!rfa", name = "<init>", descriptor = "(IIIZLmga;Lhba;)V", line = 2520)
    public class188(int arg0, int arg1, int arg2, boolean arg3, class665 arg4, class10 arg5) {
        this.field2235 = arg5;
        this.field2240 = arg3;
        this.field2221 = arg0;
        this.field2236 = arg2;
        this.field2226 = arg4;
        this.field2233 = arg1;
        this.field2215 = new byte[this.field2221][this.field2233][this.field2236];
        this.field2238 = new byte[this.field2221][this.field2233][this.field2236];
        this.field2232 = new int[this.field2221][this.field2233 + 1][this.field2236 + 1];
        this.field2222 = new byte[this.field2221][this.field2233 + 1][this.field2236 + 1];
        this.field2243 = new byte[this.field2221][this.field2233][this.field2236];
        this.field2241 = new byte[this.field2221][this.field2233][this.field2236];
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(I[[II)V", line = 697)
    public final void method1114(int arg0, int[][] arg1, int arg2) {
        field2223++;
        int[][] var4 = this.field2232[arg2];
        for (int var5 = arg0; var5 < (this.field2233 + 1); var5++) {
            for (int var6 = 0; var6 < this.field2236 + 1; var6++) {
                var4[var5][var6] += arg1[var5][var6];
            }
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IIBIILji;[Lld;)V", line = 721)
    public final void method1115(int arg0, int arg1, byte arg2, int arg3, int arg4, class572 arg5, class158[] arg6) {
        if (arg2 >= -20) {
            return;
        }
        if (!this.field2240) {
            for (int var8 = 0; var8 < 4; var8++) {
                class158 var9 = arg6[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg4 + var10;
                        int var13 = arg1 + var11;
                        if (var12 >= 0 && var12 < this.field2233 && var13 >= 0 && this.field2236 > var13) {
                            var9.method974(-2995, var12, var13);
                        }
                    }
                }
            }
        }
        field2230++;
        int var14 = arg0 + arg4;
        int var15 = arg3 + arg1;
        for (int var16 = 0; var16 < this.field2221; var16++) {
            for (int var17 = 0; var17 < 64; var17++) {
                for (int var18 = 0; var18 < 64; var18++) {
                    this.method1121(0, 0, (byte) 88, var16, var15 + var18, false, arg4 + var17, 0, arg1 + var18, var14 + var17, arg5);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(ZIIIII)V", line = 803)
    private final void method1116(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2220++;
        for (int var7 = arg1; var7 < arg1 + arg5; var7++) {
            for (int var10 = arg3; var10 < arg3 + arg4; var10++) {
                if (var10 >= 0 && this.field2233 > var10 && var7 >= 0 && this.field2236 > var7) {
                    this.field2232[arg2][var10][var7] = arg2 <= 0 ? 0 : this.field2232[arg2 - 1][var10][var7] - 960;
                }
            }
        }
        if (!arg0) {
            this.field2226 = null;
        }
        if (arg3 > 0 && arg3 < this.field2233) {
            for (int var8 = arg1 + 1; var8 < (arg1 + arg5); var8++) {
                if (var8 >= 0 && var8 < this.field2236) {
                    this.field2232[arg2][arg3][var8] = this.field2232[arg2][arg3 - 1][var8];
                }
            }
        }
        if (arg1 > 0 && arg1 < this.field2236) {
            for (int var9 = arg3 + 1; var9 < arg3 + arg4; var9++) {
                if (var9 >= 0 && var9 < this.field2233) {
                    this.field2232[arg2][var9][arg1] = this.field2232[arg2][var9][arg1 - 1];
                }
            }
        }
        if (arg3 < 0 || arg1 < 0 || arg3 >= this.field2233 || this.field2236 <= arg1) {
            return;
        }
        if (arg2 == 0) {
            if (arg3 <= 0 || this.field2232[arg2][arg3 - 1][arg1] == 0) {
                if (arg1 > 0 && this.field2232[arg2][arg3][arg1 - 1] != 0) {
                    this.field2232[arg2][arg3][arg1] = this.field2232[arg2][arg3][arg1 - 1];
                    return;
                }
                if (arg3 > 0 && arg1 > 0 && this.field2232[arg2][arg3 - 1][arg1 - 1] != 0) {
                    this.field2232[arg2][arg3][arg1] = this.field2232[arg2][arg3 - 1][arg1 - 1];
                    return;
                }
                return;
            }
            this.field2232[arg2][arg3][arg1] = this.field2232[arg2][arg3 - 1][arg1];
        } else if (arg3 <= 0 || this.field2232[arg2 - 1][arg3 - 1][arg1] == this.field2232[arg2][arg3 - 1][arg1]) {
            if (arg1 > 0 && this.field2232[arg2][arg3][arg1 - 1] != this.field2232[arg2 - 1][arg3][arg1 - 1]) {
                this.field2232[arg2][arg3][arg1] = this.field2232[arg2][arg3][arg1 - 1];
                return;
            }
            if (arg3 > 0 && arg1 > 0 && this.field2232[arg2 - 1][arg3 - 1][arg1 - 1] != this.field2232[arg2][arg3 - 1][arg1 - 1]) {
                this.field2232[arg2][arg3][arg1] = this.field2232[arg2][arg3 - 1][arg1 - 1];
                return;
            }
        } else {
            this.field2232[arg2][arg3][arg1] = this.field2232[arg2][arg3 - 1][arg1];
            return;
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(B)V", line = 910)
    public static void method1117(byte arg0) {
        if (arg0 != 1) {
            field2224 = null;
        }
        field2224 = null;
        field2227 = null;
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "([[[IB[Lld;Loa;)V", line = 923)
    public final void method1118(int[][][] arg0, byte arg1, class158[] arg2, class650 arg3) {
        field2225++;
        if (!this.field2240) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field2233; var6++) {
                    for (int var7 = 0; var7 < this.field2236; var7++) {
                        if ((class234.field3033[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class234.field3033[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg2[var8].method980(var7, var6, -86);
                            }
                        }
                    }
                }
            }
        }
        if (arg1 != -81) {
            this.method1111(-103, 38, 4, 124, -108, -31, null, -26, 54, null);
        }
        for (int var9 = 0; var9 < this.field2221; var9++) {
            int var10 = 0;
            int var11 = 0;
            if (!this.field2240) {
                if (class639.field8664) {
                    var10 |= 0x2;
                }
                if (class337.field4308) {
                    var11 |= 0x8;
                }
                if (class292.field3687 != 0) {
                    var10 |= 0x1;
                    if (class348.field4467 | var9 == 0) {
                        var11 |= 0x10;
                    }
                }
            }
            if (class639.field8664) {
                var11 |= 0x7;
            }
            if (!class633.field8576) {
                var11 |= 0x20;
            }
            int[][] var12 = arg0 == null || var9 >= arg0.length ? this.field2232[var9] : arg0[var9];
            class224.method1358(var9, arg3.method412(this.field2233, this.field2236, this.field2232[var9], var12, 512, var10, var11));
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Loa;BLd;Ld;)V", line = 1019)
    public final void method1119(class650 arg0, byte arg1, class140 arg2, class140 arg3) {
        field2219++;
        if (class694.field9628 == null || class694.field9628.length != this.field2236) {
            class488.field6106 = new int[this.field2236];
            class299.field3803 = new int[this.field2236];
            class337.field4318 = new int[this.field2236];
            class29.field347 = new int[this.field2236];
            class694.field9628 = new int[this.field2236];
        }
        if (arg1 < 7) {
            this.method1122(36, null, null, null, 120, null, null);
        }
        int[][] var5 = new int[this.field2233][this.field2236];
        for (int var6 = 0; var6 < this.field2221; var6++) {
            for (int var8 = 0; var8 < this.field2236; var8++) {
                class694.field9628[var8] = 0;
                class299.field3803[var8] = 0;
                class29.field347[var8] = 0;
                class337.field4318[var8] = 0;
                class488.field6106[var8] = 0;
            }
            for (int var9 = -5; var9 < this.field2233; var9++) {
                for (int var10 = 0; var10 < this.field2236; var10++) {
                    int var19 = var9 + 5;
                    int var10002;
                    if (this.field2233 > var19) {
                        int var20 = this.field2238[var6][var19][var10] & 0xFF;
                        if (var20 > 0) {
                            class253 var21 = this.field2235.method44(2, var20 - 1);
                            class694.field9628[var10] += var21.field3267;
                            class299.field3803[var10] += var21.field3264;
                            class29.field347[var10] += var21.field3261;
                            class337.field4318[var10] += var21.field3272;
                            var10002 = class488.field6106[var10]++;
                        }
                    }
                    int var22 = var9 - 5;
                    if (var22 >= 0) {
                        int var23 = this.field2238[var6][var22][var10] & 0xFF;
                        if (var23 > 0) {
                            class253 var24 = this.field2235.method44(2, var23 - 1);
                            class694.field9628[var10] -= var24.field3267;
                            class299.field3803[var10] -= var24.field3264;
                            class29.field347[var10] -= var24.field3261;
                            class337.field4318[var10] -= var24.field3272;
                            var10002 = class488.field6106[var10]--;
                        }
                    }
                }
                if (var9 >= 0) {
                    int var11 = 0;
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    for (int var16 = -5; var16 < this.field2236; var16++) {
                        int var17 = var16 + 5;
                        if (var17 < this.field2236) {
                            var12 += class299.field3803[var17];
                            var15 += class488.field6106[var17];
                            var14 += class337.field4318[var17];
                            var11 += class694.field9628[var17];
                            var13 += class29.field347[var17];
                        }
                        int var18 = var16 - 5;
                        if (var18 >= 0) {
                            var13 -= class29.field347[var18];
                            var11 -= class694.field9628[var18];
                            var15 -= class488.field6106[var18];
                            var12 -= class299.field3803[var18];
                            var14 -= class337.field4318[var18];
                        }
                        if (var16 >= 0 && var14 > 0 && var15 > 0) {
                            var5[var9][var16] = class672.method3727(var13 / var15, var12 / var15, var11 * 256 / var14, 3935);
                        }
                    }
                }
            }
            if (class558.field6975) {
                this.method1120(var6, 124, var6 == 0 ? arg2 : null, class299.field3801[var6], var6 == 0 ? arg3 : null, var5, arg0);
            } else {
                this.method1122(var6, var5, var6 == 0 ? arg2 : null, arg0, 1, class299.field3801[var6], var6 == 0 ? arg3 : null);
            }
            this.field2238[var6] = null;
            this.field2243[var6] = null;
            this.field2215[var6] = null;
            this.field2241[var6] = null;
        }
        if (!this.field2240) {
            if (class292.field3687 != 0) {
                class512.method2790();
            }
            if (class639.field8664) {
                class201.method1173();
            }
        }
        for (int var7 = 0; var7 < this.field2221; var7++) {
            class299.field3801[var7].method191();
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IILd;Ld;Ld;[[ILoa;)V", line = 1197)
    private final void method1120(int arg0, int arg1, class140 arg2, class140 arg3, class140 arg4, int[][] arg5, class650 arg6) {
        field2217++;
        byte[][] var8 = this.field2215[arg0];
        int var9 = -39 / ((35 - arg1) / 56);
        byte[][] var10 = this.field2241[arg0];
        byte[][] var11 = this.field2238[arg0];
        byte[][] var12 = this.field2243[arg0];
        for (int var13 = 0; var13 < this.field2233; var13++) {
            int var14 = var13 >= (this.field2233 - 1) ? var13 : var13 + 1;
            for (int var15 = 0; var15 < this.field2236; var15++) {
                int var16 = this.field2236 - 1 > var15 ? var15 + 1 : var15;
                if (class596.field7997 == -1 || class28.method174(var15, -17783, var13, class596.field7997, arg0)) {
                    boolean var17 = false;
                    boolean var18 = false;
                    boolean[] var19 = new boolean[4];
                    int var20 = var8[var13][var15];
                    int var21 = var10[var13][var15];
                    int var22 = var12[var13][var15] & 0xFF;
                    int var23 = var11[var13][var15] & 0xFF;
                    int var24 = var11[var13][var16] & 0xFF;
                    int var25 = var11[var14][var16] & 0xFF;
                    int var26 = var11[var14][var15] & 0xFF;
                    if (var22 != 0 || var23 != 0) {
                        class505 var27 = var22 == 0 ? null : this.field2226.method3700(4, var22 - 1);
                        class253 var28 = var23 == 0 ? null : this.field2235.method44(2, var23 - 1);
                        if (var20 == 0 && var27 == null) {
                            var20 = 12;
                        }
                        class505 var29 = var27;
                        if (var27 != null) {
                            if (var27.field6314 == -1 && var27.field6302 == -1) {
                                var29 = var27;
                                var27 = null;
                            } else if (var28 != null && var20 != 0) {
                                var18 = var27.field6316;
                            }
                        }
                        if ((var20 == 0 || var20 == 12) && var13 > 0 && var15 > 0 && var13 < this.field2233 && var15 < this.field2236) {
                            byte var30 = 0;
                            byte var31 = 0;
                            byte var32 = 0;
                            byte var33 = 0;
                            int var34 = var30 + (var11[var13 - 1][var15 - 1] == var23 ? 1 : -1);
                            int var35 = var32 + (var11[var14][var16] == var23 ? 1 : -1);
                            int var36 = var31 + (var11[var14][var15 - 1] == var23 ? 1 : -1);
                            if (var11[var13][var15 - 1] == var23) {
                                var36++;
                                var34++;
                            } else {
                                var36--;
                                var34--;
                            }
                            int var37 = var33 + (var11[var13 - 1][var16] == var23 ? 1 : -1);
                            if (var11[var14][var15] == var23) {
                                var36++;
                                var35++;
                            } else {
                                var35--;
                                var36--;
                            }
                            if (var11[var13][var16] == var23) {
                                var37++;
                                var35++;
                            } else {
                                var35--;
                                var37--;
                            }
                            if (var11[var13 - 1][var15] == var23) {
                                var34++;
                                var37++;
                            } else {
                                var37--;
                                var34--;
                            }
                            int var38 = var34 - var35;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            int var39 = var36 - var37;
                            if (var39 < 0) {
                                var39 = -var39;
                            }
                            if (var38 == var39) {
                                var38 = arg3.method201(var13, var15) - arg3.method201(var14, var16);
                                var39 = arg3.method201(var14, var15) - arg3.method201(var13, var16);
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                                if (var39 < 0) {
                                    var39 = -var39;
                                }
                            }
                            var21 = var39 <= var38 ? 0 : 1;
                        }
                        for (int var40 = 0; var40 < 13; var40++) {
                            class95.field1238[var40] = -1;
                            class309.field3893[var40] = 1;
                        }
                        boolean[] var41 = var27 != null && var27.field6316 ? class53.field668[var20] : class693.field9603[var20];
                        this.method1112(var28, arg6, var8, var10, this.field2236, var20, var19, (byte) -82, var15, this.field2233, var21, var27, var12, var13);
                        boolean var42 = var27 != null && var27.field6314 != var27.field6302;
                        if (!var42) {
                            for (int var43 = 0; var43 < 8; var43++) {
                                if (class95.field1238[var43] >= 0 && class370.field4784[var43] != class24.field282[var43]) {
                                    var42 = true;
                                    break;
                                }
                            }
                        }
                        if (!var41[var21 + 1 & 0x3]) {
                            var19[1] = class387.method2214(var19[1], class109.method762(class309.field3893[2], class309.field3893[4]) == 0);
                        }
                        if (!var41[var21 + 3 & 0x3]) {
                            var19[3] = class387.method2214(var19[3], class109.method762(class309.field3893[0], class309.field3893[6]) == 0);
                        }
                        if (!var41[-(-var21) & 0x3]) {
                            var19[0] = class387.method2214(var19[0], class109.method762(class309.field3893[2], class309.field3893[0]) == 0);
                        }
                        if (!var41[var21 + 2 & 0x3]) {
                            var19[2] = class387.method2214(var19[2], class109.method762(class309.field3893[6], class309.field3893[4]) == 0);
                        }
                        if (!var18 && (var20 == 0 || var20 == 12)) {
                            if (var19[0] && !var19[1] && !var19[2] && var19[3]) {
                                var21 = 0;
                                var20 = var20 == 0 ? 13 : 14;
                                var19[0] = var19[3] = false;
                            } else if (var19[0] && var19[1] && !var19[2] && !var19[3]) {
                                var19[0] = var19[1] = false;
                                var21 = 3;
                                var20 = var20 == 0 ? 13 : 14;
                            } else if (!var19[0] && var19[1] && var19[2] && !var19[3]) {
                                var19[1] = var19[2] = false;
                                var20 = var20 == 0 ? 13 : 14;
                                var21 = 2;
                            } else if (!var19[0] && !var19[1] && var19[2] && var19[3]) {
                                var21 = 1;
                                var19[2] = var19[3] = false;
                                var20 = var20 == 0 ? 13 : 14;
                            }
                        }
                        boolean var44 = !var18 && !var19[0] && !var19[2] && !var19[1] && !var19[3];
                        int[] var45 = null;
                        int[] var46;
                        int var47;
                        int[] var48;
                        int var49;
                        int[] var50;
                        if (var44) {
                            var46 = class175.field2062[var20];
                            var48 = class124.field1517[var20];
                            var50 = class381.field4888[var20];
                            var47 = var28 == null ? 0 : class348.field4474[var20];
                            var49 = var27 == null ? 0 : class560.field6997[var20];
                        } else if (var18) {
                            var46 = class611.field8309[var20];
                            var45 = class578.field7766[var20];
                            var47 = var28 == null ? 0 : class273.field3443[var20];
                            var48 = class171.field2016[var20];
                            var49 = var27 == null ? 0 : class248.field3196[var20];
                            var50 = class356.field4594[var20];
                        } else {
                            var48 = class16.field164[var20];
                            var50 = class664.field9023[var20];
                            var47 = var28 == null ? 0 : class418.field5344[var20];
                            var49 = var27 == null ? 0 : class674.field9208[var20];
                            var45 = class391.field5009[var20];
                            var46 = class306.field3877[var20];
                        }
                        int var51 = var47 + var49;
                        if (var51 <= 0) {
                            class160.method987(arg0, var13, var15);
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
                            int[] var61 = arg2 == null ? null : new int[var54];
                            int[] var62 = arg2 == null && arg4 == null ? null : new int[var54];
                            int var63 = -1;
                            int var64 = -1;
                            int var65 = 256;
                            if (var27 != null) {
                                var63 = var27.field6314;
                                var64 = arg6.method419() ? var27.field6300 : var27.field6301;
                                var65 = var27.field6309;
                                int var66 = class636.method3563(arg6, var27, (byte) 24);
                                for (int var67 = 0; var67 < var49; var67++) {
                                    boolean var68 = false;
                                    byte var69;
                                    if (var19[-var21 & 0x3] && var45[0] == var52) {
                                        class583.field7838[0] = var46[var52];
                                        class583.field7838[1] = 1;
                                        class583.field7838[2] = var48[var52];
                                        class583.field7838[3] = 1;
                                        class583.field7838[4] = var50[var52];
                                        class583.field7838[5] = var48[var52];
                                        var69 = 6;
                                    } else if (var19[2 - var21 & 0x3] && var45[2] == var52) {
                                        class583.field7838[0] = var46[var52];
                                        class583.field7838[1] = 5;
                                        class583.field7838[2] = var48[var52];
                                        class583.field7838[3] = 5;
                                        class583.field7838[4] = var50[var52];
                                        var69 = 6;
                                        class583.field7838[5] = var48[var52];
                                    } else if (var19[1 - var21 & 0x3] && var45[1] == var52) {
                                        class583.field7838[0] = var46[var52];
                                        class583.field7838[1] = 3;
                                        class583.field7838[2] = var48[var52];
                                        class583.field7838[3] = 3;
                                        class583.field7838[4] = var50[var52];
                                        var69 = 6;
                                        class583.field7838[5] = var48[var52];
                                    } else if (var19[3 - var21 & 0x3] && var45[3] == var52) {
                                        class583.field7838[0] = var46[var52];
                                        class583.field7838[1] = 7;
                                        class583.field7838[2] = var48[var52];
                                        class583.field7838[3] = 7;
                                        class583.field7838[4] = var50[var52];
                                        var69 = 6;
                                        class583.field7838[5] = var48[var52];
                                    } else {
                                        class583.field7838[0] = var46[var52];
                                        class583.field7838[1] = var50[var52];
                                        var69 = 3;
                                        class583.field7838[2] = var48[var52];
                                    }
                                    var52++;
                                    for (int var70 = 0; var70 < var69; var70++) {
                                        int var71 = class583.field7838[var70];
                                        int var72 = var71 - var21 * 2 & 0x7;
                                        int var73 = this.field2242[var71];
                                        int var74 = this.field2218[var71];
                                        int var75;
                                        int var76;
                                        if (var21 == 1) {
                                            var75 = var74;
                                            var76 = 512 - var73;
                                        } else if (var21 == 2) {
                                            var76 = 512 - var74;
                                            var75 = 512 - var73;
                                        } else if (var21 == 3) {
                                            var75 = 512 - var74;
                                            var76 = var73;
                                        } else {
                                            var75 = var73;
                                            var76 = var74;
                                        }
                                        var56[var53] = var75;
                                        var57[var53] = var76;
                                        if (var61 != null && class517.field6543[var20][var71]) {
                                            int var77 = (var13 << 9) + var75;
                                            int var78 = (var15 << 9) + var76;
                                            var61[var53] = arg2.method194(var77, var78) - arg3.method194(var77, var78);
                                        }
                                        if (var62 != null) {
                                            if (arg2 != null && !class517.field6543[var20][var71]) {
                                                int var79 = (var13 << 9) + var75;
                                                int var80 = (var15 << 9) + var76;
                                                var62[var53] = arg3.method194(var79, var80) - arg2.method194(var79, var80);
                                            } else if (arg4 != null && !class279.field3540[var20][var71]) {
                                                int var81 = (var13 << 9) + var75;
                                                int var82 = (var15 << 9) + var76;
                                                var62[var53] = arg4.method194(var81, var82) - arg3.method194(var81, var82);
                                            }
                                        }
                                        if (var71 < 8 && class95.field1238[var72] > var27.field6305) {
                                            if (var55 != null) {
                                                var55[var53] = class370.field4784[var72];
                                            }
                                            var60[var53] = class436.field5489[var72];
                                            var59[var53] = class681.field9274[var72];
                                            var58[var53] = class24.field282[var72];
                                        } else {
                                            if (var55 != null) {
                                                var55[var53] = var66;
                                            }
                                            var59[var53] = arg6.method419() ? var27.field6300 : var27.field6301;
                                            var60[var53] = var27.field6309;
                                            var58[var53] = var63;
                                        }
                                        var53++;
                                    }
                                }
                                if (!this.field2240 && arg0 == 0) {
                                    class509.method2775(var13, var15, var27.field6298, var27.field6304 * 8, var27.field6306);
                                }
                                if (var20 != 12 && var27.field6314 != -1 && var27.field6308) {
                                    var17 = true;
                                }
                            } else if (var44) {
                                var52 += class560.field6997[var20];
                            } else if (var18) {
                                var52 += class248.field3196[var20];
                            } else {
                                var52 += class674.field9208[var20];
                            }
                            if (var28 != null) {
                                if (var26 == 0) {
                                    var26 = var23;
                                }
                                if (var25 == 0) {
                                    var25 = var23;
                                }
                                if (var24 == 0) {
                                    var24 = var23;
                                }
                                class253 var83 = this.field2235.method44(2, var23 - 1);
                                class253 var84 = this.field2235.method44(2, var24 - 1);
                                class253 var85 = this.field2235.method44(2, var25 - 1);
                                class253 var86 = this.field2235.method44(2, var26 - 1);
                                for (int var87 = 0; var87 < var47; var87++) {
                                    boolean var88 = false;
                                    byte var89;
                                    if (var19[-var21 & 0x3] && var45[0] == var52) {
                                        class583.field7838[0] = var46[var52];
                                        class583.field7838[1] = 1;
                                        class583.field7838[2] = var48[var52];
                                        class583.field7838[3] = 1;
                                        class583.field7838[4] = var50[var52];
                                        var89 = 6;
                                        class583.field7838[5] = var48[var52];
                                    } else if (var19[2 - var21 & 0x3] && var45[2] == var52) {
                                        class583.field7838[0] = var46[var52];
                                        class583.field7838[1] = 5;
                                        class583.field7838[2] = var48[var52];
                                        class583.field7838[3] = 5;
                                        class583.field7838[4] = var50[var52];
                                        class583.field7838[5] = var48[var52];
                                        var89 = 6;
                                    } else if (var19[1 - var21 & 0x3] && var45[1] == var52) {
                                        class583.field7838[0] = var46[var52];
                                        class583.field7838[1] = 3;
                                        class583.field7838[2] = var48[var52];
                                        class583.field7838[3] = 3;
                                        class583.field7838[4] = var50[var52];
                                        class583.field7838[5] = var48[var52];
                                        var89 = 6;
                                    } else if (var19[3 - var21 & 0x3] && var45[3] == var52) {
                                        class583.field7838[0] = var46[var52];
                                        class583.field7838[1] = 7;
                                        class583.field7838[2] = var48[var52];
                                        class583.field7838[3] = 7;
                                        class583.field7838[4] = var50[var52];
                                        var89 = 6;
                                        class583.field7838[5] = var48[var52];
                                    } else {
                                        class583.field7838[0] = var46[var52];
                                        class583.field7838[1] = var50[var52];
                                        class583.field7838[2] = var48[var52];
                                        var89 = 3;
                                    }
                                    for (int var90 = 0; var90 < var89; var90++) {
                                        int var91 = class583.field7838[var90];
                                        int var92 = var91 - (var21 * 2) & 0x7;
                                        int var93 = this.field2242[var91];
                                        int var94 = this.field2218[var91];
                                        int var95;
                                        int var96;
                                        if (var21 == 1) {
                                            var95 = var94;
                                            var96 = 512 - var93;
                                        } else if (var21 == 2) {
                                            var95 = 512 - var93;
                                            var96 = 512 - var94;
                                        } else if (var21 == 3) {
                                            var95 = 512 - var94;
                                            var96 = var93;
                                        } else {
                                            var95 = var93;
                                            var96 = var94;
                                        }
                                        var56[var53] = var95;
                                        var57[var53] = var96;
                                        if (var61 != null && class517.field6543[var20][var91]) {
                                            int var97 = (var13 << 9) + var95;
                                            int var98 = (var15 << 9) + var96;
                                            var61[var53] = arg2.method194(var97, var98) - arg3.method194(var97, var98);
                                        }
                                        if (var62 != null) {
                                            if (arg2 != null && !class517.field6543[var20][var91]) {
                                                int var99 = (var13 << 9) + var95;
                                                int var100 = (var15 << 9) + var96;
                                                var62[var53] = arg3.method194(var99, var100) - arg2.method194(var99, var100);
                                            } else if (arg4 != null && !class279.field3540[var20][var91]) {
                                                int var101 = (var13 << 9) + var95;
                                                int var102 = (var15 << 9) + var96;
                                                var62[var53] = arg4.method194(var101, var102) - arg3.method194(var101, var102);
                                            }
                                        }
                                        if (var91 < 8 && class95.field1238[var92] >= 0) {
                                            if (var55 != null) {
                                                var55[var53] = class370.field4784[var92];
                                            }
                                            var60[var53] = class436.field5489[var92];
                                            var59[var53] = class681.field9274[var92];
                                            var58[var53] = class24.field282[var92];
                                        } else {
                                            if (var18 && class517.field6543[var20][var91]) {
                                                var59[var53] = var64;
                                                var60[var53] = var65;
                                                var58[var53] = var63;
                                            } else if (var95 == 0 && var96 == 0) {
                                                var58[var53] = arg5[var13][var15];
                                                var59[var53] = var83.field3265;
                                                var60[var53] = var83.field3266;
                                            } else if (var95 == 0 && var96 == 512) {
                                                var58[var53] = arg5[var13][var16];
                                                var59[var53] = var84.field3265;
                                                var60[var53] = var84.field3266;
                                            } else if (var95 == 512 && var96 == 512) {
                                                var58[var53] = arg5[var14][var16];
                                                var59[var53] = var85.field3265;
                                                var60[var53] = var85.field3266;
                                            } else if (var95 == 512 && var96 == 0) {
                                                var58[var53] = arg5[var14][var15];
                                                var59[var53] = var86.field3265;
                                                var60[var53] = var86.field3266;
                                            } else {
                                                if (var95 >= 256) {
                                                    if (var96 < 256) {
                                                        var59[var53] = var86.field3265;
                                                        var60[var53] = var86.field3266;
                                                    } else {
                                                        var59[var53] = var85.field3265;
                                                        var60[var53] = var85.field3266;
                                                    }
                                                } else if (var96 < 256) {
                                                    var59[var53] = var83.field3265;
                                                    var60[var53] = var83.field3266;
                                                } else {
                                                    var59[var53] = var84.field3265;
                                                    var60[var53] = var84.field3266;
                                                }
                                                int var103 = class30.method192(arg5[var14][var15], arg5[var13][var15], var95 << 7 >> 9, (byte) -125);
                                                int var104 = class30.method192(arg5[var14][var16], arg5[var13][var16], var95 << 7 >> 9, (byte) 36);
                                                var58[var53] = class30.method192(var104, var103, var96 << 7 >> 9, (byte) -41);
                                            }
                                            if (var55 != null) {
                                                var55[var53] = var58[var53];
                                            }
                                        }
                                        var53++;
                                    }
                                    var52++;
                                }
                                if (var20 != 0 && var28.field3257) {
                                    var17 = true;
                                }
                            }
                            int var105 = arg3.method201(var13, var15);
                            int var106 = arg3.method201(var14, var15);
                            int var107 = arg3.method201(var14, var16);
                            int var108 = arg3.method201(var13, var16);
                            if (arg0 > 0) {
                                boolean var109 = true;
                                if (var23 == 0 && var20 != 0) {
                                    var109 = false;
                                }
                                if (var22 > 0 && var29 != null && !var29.field6297) {
                                    var109 = false;
                                }
                                if (var109 && var105 == var106 && var105 == var107 && var105 == var108) {
                                    this.field2222[arg0][var13][var15] = (byte) class364.method2113(this.field2222[arg0][var13][var15], 4);
                                }
                            }
                            int var110 = 0;
                            int var111 = 0;
                            int var112 = 0;
                            if (this.field2240) {
                                var110 = class106.method746(var13, var15);
                                var111 = class439.method2411(var13, var15);
                                var112 = class682.method3770(var13, var15);
                            }
                            arg3.method196(var13, var15, var56, var61, var57, var62, var58, var55, var59, var60, var110, var111, var112, var17);
                            class160.method987(arg0, var13, var15);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IIBIIZIIIILji;)V", line = 2064)
    private final void method1121(int arg0, int arg1, byte arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, class572 arg10) {
        field2229++;
        if (arg2 < 49) {
            this.field2232 = null;
        }
        if (arg1 == 1) {
            arg0 = 1;
        } else if (arg1 == 2) {
            arg0 = 1;
            arg7 = 1;
        } else if (arg1 == 3) {
            arg7 = 1;
        }
        if (arg6 < 0 || this.field2233 <= arg6 || arg8 < 0 || arg8 >= this.field2236) {
            while (true) {
                int var14 = arg10.method3097((byte) 12);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg10.method3097((byte) 12);
                    return;
                }
                if (var14 <= 49) {
                    arg10.method3097((byte) 12);
                }
            }
        }
        if (!this.field2240 && !arg5) {
            class234.field3033[arg3][arg6][arg8] = 0;
        }
        while (true) {
            int var12 = arg10.method3097((byte) 12);
            if (var12 == 0) {
                if (this.field2240) {
                    this.field2232[0][arg6 + arg7][arg0 + arg8] = 0;
                    return;
                } else if (arg3 == 0) {
                    this.field2232[0][arg6 + arg7][arg8 + arg0] = -class650.method3635(13871, arg9 + 932731, 556238 - -arg4) * 8 << 2;
                    return;
                } else {
                    this.field2232[arg3][arg6 + arg7][arg0 + arg8] = this.field2232[arg3 - 1][arg6 + arg7][arg0 + arg8] - 960;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg10.method3097((byte) 12);
                if (!this.field2240) {
                    if (var13 == 1) {
                        var13 = 0;
                    }
                    if (arg3 == 0) {
                        this.field2232[0][arg6 + arg7][arg0 + arg8] = -var13 * 8 << 2;
                        return;
                    }
                    this.field2232[arg3][arg6 + arg7][arg0 + arg8] = this.field2232[arg3 - 1][arg6 + arg7][arg0 + arg8] - (var13 * 8 << 2);
                    return;
                }
                this.field2232[0][arg6 + arg7][arg0 + arg8] = var13 * 8 << 2;
                return;
            }
            if (var12 <= 49) {
                if (arg5) {
                    arg10.method3097((byte) 12);
                } else {
                    this.field2243[arg3][arg6][arg8] = arg10.method3083(255);
                    this.field2215[arg3][arg6][arg8] = (byte) ((var12 - 2) / 4);
                    this.field2241[arg3][arg6][arg8] = (byte) class109.method762(3, var12 + arg1 - 2);
                }
            } else if (var12 <= 81) {
                if (!this.field2240 && !arg5) {
                    class234.field3033[arg3][arg6][arg8] = (byte) (var12 - 49);
                }
            } else if (!arg5) {
                this.field2238[arg3][arg6][arg8] = (byte) (var12 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(I[[ILd;Loa;ILd;Ld;)V", line = 2195)
    private final void method1122(int arg0, int[][] arg1, class140 arg2, class650 arg3, int arg4, class140 arg5, class140 arg6) {
        if (arg4 != 1) {
            return;
        }
        field2231++;
        for (int var8 = 0; var8 < this.field2233; var8++) {
            for (int var9 = 0; var9 < this.field2236; var9++) {
                if (class596.field7997 == -1 || class28.method174(var9, -17783, var8, class596.field7997, arg0)) {
                    byte var10 = this.field2215[arg0][var8][var9];
                    byte var11 = this.field2241[arg0][var8][var9];
                    int var12 = this.field2243[arg0][var8][var9] & 0xFF;
                    int var13 = this.field2238[arg0][var8][var9] & 0xFF;
                    class505 var14 = var12 == 0 ? null : this.field2226.method3700(arg4 + 3, var12 - 1);
                    class253 var15 = var13 == 0 ? null : this.field2235.method44(2, var13 - 1);
                    int var16 = 0;
                    int var17 = 0;
                    if (var10 != 0) {
                        var17 = var14 == null ? 0 : class560.field6997[var10];
                        var16 = var15 == null ? 0 : class348.field4474[var10];
                    } else if (var14 != null) {
                        var17 = class560.field6997[var10];
                    } else if (var15 != null) {
                        var16 = class560.field6997[var10];
                    }
                    int var18 = var16 + var17;
                    int var19 = 0;
                    if (var18 != 0) {
                        int[] var20 = new int[var18];
                        int[] var21 = new int[var18];
                        int[] var22 = new int[var18];
                        int[] var23 = new int[var18];
                        boolean var24 = false;
                        if (var14 == null || var14.field6314 == -1 && var14.field6302 == -1 && var14.field6300 == -1) {
                            for (int var27 = 0; var27 < var17; var27++) {
                                var20[var19] = -1;
                                var19++;
                            }
                        } else {
                            int var25 = arg3.method419() ? var14.field6300 : var14.field6301;
                            if (class654.field8910) {
                                var25 = -1;
                            }
                            for (int var26 = 0; var26 < var17; var26++) {
                                var22[var19] = var25;
                                var23[var19] = var14.field6309;
                                if (var14.field6314 == -1) {
                                    var20[var19] = -1;
                                } else {
                                    var20[var19] = var14.field6314;
                                }
                                if (var14.field6302 == -1) {
                                    var21[var19] = -1;
                                } else {
                                    var24 = true;
                                    var21[var19] = var14.field6302;
                                }
                                var19++;
                            }
                            if (!this.field2240 && arg0 == 0) {
                                class509.method2775(var8, var9, var14.field6298, var14.field6304 * 8, var14.field6306);
                            }
                        }
                        if (!var24) {
                            var21 = null;
                        }
                        if (var15 == null) {
                            for (int var30 = 0; var30 < var16; var30++) {
                                var20[var19] = -1;
                                var19++;
                            }
                        } else {
                            int var28 = var15.field3265;
                            if (class654.field8910) {
                                var28 = -1;
                            }
                            for (int var29 = 0; var29 < var16; var29++) {
                                var22[var19] = var28;
                                var23[var19] = var15.field3266;
                                var20[var19] = arg1[var8][var9];
                                if (var21 != null) {
                                    var21[var19] = -1;
                                }
                                var19++;
                            }
                        }
                        int var31 = this.field2242.length;
                        int[] var32 = new int[var31];
                        int[] var33 = new int[var31];
                        int[] var34 = arg2 == null ? null : new int[var31];
                        int[] var35 = arg2 == null && arg6 == null ? null : new int[var31];
                        for (int var36 = 0; var36 < var31; var36++) {
                            int var45 = this.field2242[var36];
                            int var46 = this.field2218[var36];
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
                            if (var34 != null && class517.field6543[var10][var36]) {
                                int var49 = (var8 << 9) + var45;
                                int var50 = (var9 << 9) + var45;
                                var34[var36] = arg2.method194(var49, var50) - arg5.method194(var49, var50);
                            }
                            if (var35 != null) {
                                if (arg2 != null && !class517.field6543[var10][var36]) {
                                    int var51 = (var8 << 9) + var45;
                                    int var52 = (var9 << 9) + var45;
                                    var35[var36] = arg5.method194(var51, var52) - arg2.method194(var51, var52);
                                } else if (arg6 != null && !class279.field3540[var10][var36]) {
                                    int var53 = (var8 << 9) + var45;
                                    int var54 = (var9 << 9) + var45;
                                    var35[var36] = arg6.method194(var53, var54) - arg5.method194(var53, var54);
                                }
                            }
                        }
                        int var37 = arg5.method201(var8, var9);
                        int var38 = arg5.method201(var8 + 1, var9);
                        int var39 = arg5.method201(var8 + 1, var9 - -1);
                        int var40 = arg5.method201(var8, var9 + 1);
                        if (arg0 > 0) {
                            boolean var41 = true;
                            if (var13 == 0 && var10 != 0) {
                                var41 = false;
                            }
                            if (var12 > 0 && var14 != null && !var14.field6297) {
                                var41 = false;
                            }
                            if (var41 && var37 == var38 && var37 == var39 && var37 == var40) {
                                this.field2222[arg0][var8][var9] = (byte) class364.method2113(this.field2222[arg0][var8][var9], 4);
                            }
                        }
                        int var42 = 0;
                        int var43 = 0;
                        int var44 = 0;
                        if (this.field2240) {
                            var42 = class106.method746(var8, var9);
                            var43 = class439.method2411(var8, var9);
                            var44 = class682.method3770(var8, var9);
                        }
                        arg5.method203(var8, var9, var32, var34, var33, var35, class175.field2062[var10], class381.field4888[var10], class124.field1517[var10], var20, var21, var22, var23, var42, var43, var44, false);
                        class160.method987(arg0, var8, var9);
                    }
                }
            }
        }
    }
}
