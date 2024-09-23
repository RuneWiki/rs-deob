import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("CDASFTJJ")
public class class9 {

    @OriginalMember(owner = "CDASFTJJ", name = "c", descriptor = "I")
    private int field105 = -35541;

    @OriginalMember(owner = "CDASFTJJ", name = "n", descriptor = "I")
    private int field116 = -406;

    @OriginalMember(owner = "CDASFTJJ", name = "r", descriptor = "I")
    private int field120;

    @OriginalMember(owner = "CDASFTJJ", name = "s", descriptor = "I")
    private int field121;

    @OriginalMember(owner = "CDASFTJJ", name = "o", descriptor = "[[[I")
    private int[][][] field117;

    @OriginalMember(owner = "CDASFTJJ", name = "i", descriptor = "[[[B")
    private byte[][][] field111;

    @OriginalMember(owner = "CDASFTJJ", name = "F", descriptor = "[[[B")
    private byte[][][] field134;

    @OriginalMember(owner = "CDASFTJJ", name = "g", descriptor = "[[[B")
    private byte[][][] field109;

    @OriginalMember(owner = "CDASFTJJ", name = "d", descriptor = "[[[B")
    private byte[][][] field106;

    @OriginalMember(owner = "CDASFTJJ", name = "j", descriptor = "[[[B")
    private byte[][][] field112;

    @OriginalMember(owner = "CDASFTJJ", name = "e", descriptor = "[[[I")
    private int[][][] field107;

    @OriginalMember(owner = "CDASFTJJ", name = "k", descriptor = "[[[B")
    private byte[][][] field113;

    @OriginalMember(owner = "CDASFTJJ", name = "f", descriptor = "[[I")
    private int[][] field108;

    @OriginalMember(owner = "CDASFTJJ", name = "u", descriptor = "[I")
    private int[] field123;

    @OriginalMember(owner = "CDASFTJJ", name = "v", descriptor = "[I")
    private int[] field124;

    @OriginalMember(owner = "CDASFTJJ", name = "w", descriptor = "[I")
    private int[] field125;

    @OriginalMember(owner = "CDASFTJJ", name = "x", descriptor = "[I")
    private int[] field126;

    @OriginalMember(owner = "CDASFTJJ", name = "y", descriptor = "[I")
    private int[] field127;

    @OriginalMember(owner = "CDASFTJJ", name = "a", descriptor = "[I")
    private static final int[] field103 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "CDASFTJJ", name = "h", descriptor = "I")
    private static int field110 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "CDASFTJJ", name = "m", descriptor = "I")
    private static int field115 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "CDASFTJJ", name = "p", descriptor = "[I")
    private static final int[] field118 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "CDASFTJJ", name = "q", descriptor = "I")
    public static int field119 = 99;

    @OriginalMember(owner = "CDASFTJJ", name = "t", descriptor = "Z")
    private static boolean field122 = true;

    @OriginalMember(owner = "CDASFTJJ", name = "z", descriptor = "[I")
    private static final int[] field128 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "CDASFTJJ", name = "A", descriptor = "[I")
    private static final int[] field129 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "CDASFTJJ", name = "C", descriptor = "I")
    private static int field131 = -493;

    @OriginalMember(owner = "CDASFTJJ", name = "E", descriptor = "Z")
    public static boolean field133 = true;

    @OriginalMember(owner = "CDASFTJJ", name = "b", descriptor = "I")
    private int field104;

    @OriginalMember(owner = "CDASFTJJ", name = "D", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "CDASFTJJ", name = "l", descriptor = "Z")
    private static boolean field114;

    @OriginalMember(owner = "CDASFTJJ", name = "B", descriptor = "Z")
    private static boolean field130;

    @OriginalMember(owner = "CDASFTJJ", name = "a", descriptor = "(LPKHWFJLM;LJHGVYYQH;I)V")
    public static final void method27(class43 arg0, class28 arg1, int arg2) {
        if (arg2 != -33719) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        int var4 = -1;
        while (true) {
            int var5 = arg0.method344();
            if (var5 == 0) {
                return;
            }
            var4 += var5;
            class33 var6 = class33.method290(var4);
            var6.method293(5, arg1);
            while (true) {
                int var7 = arg0.method344();
                if (var7 == 0) {
                    break;
                }
                arg0.method330();
            }
        }
    }

    @OriginalMember(owner = "CDASFTJJ", name = "a", descriptor = "(II[LTJMGSZMW;[BIIIBII)V")
    public final void method28(int arg0, int arg1, class56[] arg2, byte[] arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9) {
        if (arg7 != -123) {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
        for (int var12 = 0; var12 < 8; var12++) {
            for (int var17 = 0; var17 < 8; var17++) {
                if (arg6 + var12 > 0 && arg6 + var12 < 103 && arg8 + var17 > 0 && arg8 + var17 < 103) {
                    arg2[arg4].field1483[arg6 + var12][arg8 + var17] &= 0xFEFFFFFF;
                }
            }
        }
        class43 var13 = new class43(arg3, 0);
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 64; var15++) {
                for (int var16 = 0; var16 < 64; var16++) {
                    if (arg0 == var14 && var15 >= arg5 && var15 < arg5 + 8 && var16 >= arg1 && var16 < arg1 + 8) {
                        this.method37(0, arg8 + class50.method455(arg9, false, var16 & 0x7, var15 & 0x7), var13, arg6 + class50.method454(7, var16 & 0x7, var15 & 0x7, arg9), arg9, arg4, this.field104, 0);
                    } else {
                        this.method37(0, -1, var13, -1, 0, 0, this.field104, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "CDASFTJJ", name = "a", descriptor = "(III)I")
    private final int method29(int arg0, int arg1, int arg2) {
        if (arg2 > 179) {
            arg1 /= 2;
        }
        if (arg2 > 192) {
            arg1 /= 2;
        }
        if (arg2 > 217) {
            arg1 /= 2;
        }
        if (arg2 > 243) {
            arg1 /= 2;
        }
        return arg2 / 2 + (arg0 / 4 << 10) + (arg1 / 32 << 7);
    }

    @OriginalMember(owner = "CDASFTJJ", name = "a", descriptor = "(LWJVLISUF;[LTJMGSZMW;I)V")
    public final void method30(class67 arg0, class56[] arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var111 = 0; var111 < 104; var111++) {
                for (int var112 = 0; var112 < 104; var112++) {
                    if ((this.field111[var4][var111][var112] & 0x1) == 1) {
                        int var113 = var4;
                        if ((this.field111[1][var111][var112] & 0x2) == 2) {
                            var113 = var4 - 1;
                        }
                        if (var113 >= 0) {
                            arg1[var113].method483(var111, var112, field131);
                        }
                    }
                }
            }
        }
        field110 += (int) (Math.random() * 5.0D) - 2;
        if (field110 < -8) {
            field110 = -8;
        }
        if (field110 > 8) {
            field110 = 8;
        }
        field115 += (int) (Math.random() * 5.0D) - 2;
        if (field115 < -16) {
            field115 = -16;
        }
        if (field115 > 16) {
            field115 = 16;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            byte[][] var49 = this.field113[var5];
            byte var50 = 96;
            short var51 = 768;
            byte var52 = -50;
            byte var53 = -10;
            byte var54 = -50;
            int var55 = (int) Math.sqrt((double) (var54 * var54 + var52 * var52 + var53 * var53));
            int var56 = var51 * var55 >> 8;
            for (int var57 = 1; var57 < this.field121 - 1; var57++) {
                for (int var102 = 1; var102 < this.field120 - 1; var102++) {
                    int var103 = this.field117[var5][var102 + 1][var57] - this.field117[var5][var102 - 1][var57];
                    int var104 = this.field117[var5][var102][var57 + 1] - this.field117[var5][var102][var57 - 1];
                    int var105 = (int) Math.sqrt((double) (var104 * var104 + var103 * var103 + 65536));
                    int var106 = (var103 << 8) / var105;
                    int var107 = 65536 / var105;
                    int var108 = (var104 << 8) / var105;
                    int var109 = (var54 * var108 + var52 * var106 + var53 * var107) / var56 + var50;
                    int var110 = (var49[var102][var57] >> 1) + (var49[var102][var57 + 1] >> 3) + (var49[var102][var57 - 1] >> 2) + (var49[var102 - 1][var57] >> 2) + (var49[var102 + 1][var57] >> 3);
                    this.field108[var102][var57] = var109 - var110;
                }
            }
            for (int var58 = 0; var58 < this.field121; var58++) {
                this.field123[var58] = 0;
                this.field124[var58] = 0;
                this.field125[var58] = 0;
                this.field126[var58] = 0;
                this.field127[var58] = 0;
            }
            for (int var59 = -5; var59 < this.field120 + 5; var59++) {
                for (int var62 = 0; var62 < this.field121; var62++) {
                    int var96 = var59 + 5;
                    int var10002;
                    if (var96 >= 0 && var96 < this.field120) {
                        int var97 = this.field134[var5][var96][var62] & 0xFF;
                        if (var97 > 0) {
                            class49 var98 = class49.field1296[var97 - 1];
                            this.field123[var62] += var98.field1305;
                            this.field124[var62] += var98.field1303;
                            this.field125[var62] += var98.field1304;
                            this.field126[var62] += var98.field1306;
                            var10002 = this.field127[var62]++;
                        }
                    }
                    int var99 = var59 - 5;
                    if (var99 >= 0 && var99 < this.field120) {
                        int var100 = this.field134[var5][var99][var62] & 0xFF;
                        if (var100 > 0) {
                            class49 var101 = class49.field1296[var100 - 1];
                            this.field123[var62] -= var101.field1305;
                            this.field124[var62] -= var101.field1303;
                            this.field125[var62] -= var101.field1304;
                            this.field126[var62] -= var101.field1306;
                            var10002 = this.field127[var62]--;
                        }
                    }
                }
                if (var59 >= 1 && var59 < this.field120 - 1) {
                    int var63 = 0;
                    int var64 = 0;
                    int var65 = 0;
                    int var66 = 0;
                    int var67 = 0;
                    for (int var68 = -5; var68 < this.field121 + 5; var68++) {
                        int var69 = var68 + 5;
                        if (var69 >= 0 && var69 < this.field121) {
                            var63 += this.field123[var69];
                            var64 += this.field124[var69];
                            var65 += this.field125[var69];
                            var66 += this.field126[var69];
                            var67 += this.field127[var69];
                        }
                        int var70 = var68 - 5;
                        if (var70 >= 0 && var70 < this.field121) {
                            var63 -= this.field123[var70];
                            var64 -= this.field124[var70];
                            var65 -= this.field125[var70];
                            var66 -= this.field126[var70];
                            var67 -= this.field127[var70];
                        }
                        if (var68 >= 1 && var68 < this.field121 - 1 && (!field133 || (this.field111[0][var59][var68] & 0x2) != 0 || (this.field111[var5][var59][var68] & 0x10) == 0 && this.method38(var68, (byte) -102, var59, var5) == field132)) {
                            if (var5 < field119) {
                                field119 = var5;
                            }
                            int var71 = this.field134[var5][var59][var68] & 0xFF;
                            int var72 = this.field109[var5][var59][var68] & 0xFF;
                            if (var71 > 0 || var72 > 0) {
                                int var73 = this.field117[var5][var59][var68];
                                int var74 = this.field117[var5][var59 + 1][var68];
                                int var75 = this.field117[var5][var59 + 1][var68 + 1];
                                int var76 = this.field117[var5][var59][var68 + 1];
                                int var77 = this.field108[var59][var68];
                                int var78 = this.field108[var59 + 1][var68];
                                int var79 = this.field108[var59 + 1][var68 + 1];
                                int var80 = this.field108[var59][var68 + 1];
                                int var81 = -1;
                                int var82 = -1;
                                if (var71 > 0) {
                                    int var83 = var63 * 256 / var66;
                                    int var84 = var64 / var67;
                                    int var85 = var65 / var67;
                                    var81 = this.method29(var83, var84, var85);
                                    int var86 = field110 + var83 & 0xFF;
                                    int var87 = field115 + var85;
                                    if (var87 < 0) {
                                        var87 = 0;
                                    } else if (var87 > 255) {
                                        var87 = 255;
                                    }
                                    var82 = this.method29(var86, var84, var87);
                                }
                                if (var5 > 0) {
                                    boolean var88 = true;
                                    if (var71 == 0 && this.field106[var5][var59][var68] != 0) {
                                        var88 = false;
                                    }
                                    if (var72 > 0 && !class49.field1296[var72 - 1].field1301) {
                                        var88 = false;
                                    }
                                    if (var88 && var73 == var74 && var73 == var75 && var73 == var76) {
                                        this.field107[var5][var59][var68] |= 0x924;
                                    }
                                }
                                int var89 = 0;
                                if (var81 != -1) {
                                    var89 = class71.field1716[method45(var82, 96)];
                                }
                                if (var72 == 0) {
                                    arg0.method528(var5, var59, var68, 0, 0, -1, var73, var74, var75, var76, method45(var81, var77), method45(var81, var78), method45(var81, var79), method45(var81, var80), 0, 0, 0, 0, var89, 0);
                                } else {
                                    int var90 = this.field106[var5][var59][var68] + 1;
                                    byte var91 = this.field112[var5][var59][var68];
                                    class49 var92 = class49.field1296[var72 - 1];
                                    int var93 = var92.field1299;
                                    int var94;
                                    int var95;
                                    if (var93 >= 0) {
                                        var94 = class71.method590(var93, -826);
                                        var95 = -1;
                                    } else if (var92.field1298 == 16711935) {
                                        var94 = 0;
                                        var95 = -2;
                                        var93 = -1;
                                    } else {
                                        var95 = this.method29(var92.field1302, var92.field1303, var92.field1304);
                                        var94 = class71.field1716[this.method44(var92.field1307, 96)];
                                    }
                                    arg0.method528(var5, var59, var68, var90, var91, var93, var73, var74, var75, var76, method45(var81, var77), method45(var81, var78), method45(var81, var79), method45(var81, var80), this.method44(var95, var77), this.method44(var95, var78), this.method44(var95, var79), this.method44(var95, var80), var89, var94);
                                }
                            }
                        }
                    }
                }
            }
            for (int var60 = 1; var60 < this.field121 - 1; var60++) {
                for (int var61 = 1; var61 < this.field120 - 1; var61++) {
                    arg0.method527(var5, var61, var60, this.method38(var60, (byte) -102, var61, var5));
                }
            }
        }
        arg0.method554(768, -50, 64, -50, -10, true);
        if (arg2 >= 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        for (int var7 = 0; var7 < this.field120; var7++) {
            for (int var48 = 0; var48 < this.field121; var48++) {
                if ((this.field111[1][var7][var48] & 0x2) == 2) {
                    arg0.method525(13368, var48, var7);
                }
            }
        }
        int var8 = 1;
        int var9 = 2;
        int var10 = 4;
        for (int var11 = 0; var11 < 4; var11++) {
            if (var11 > 0) {
                var8 <<= 0x3;
                var9 <<= 0x3;
                var10 <<= 0x3;
            }
            for (int var12 = 0; var12 <= var11; var12++) {
                for (int var13 = 0; var13 <= this.field121; var13++) {
                    for (int var14 = 0; var14 <= this.field120; var14++) {
                        if ((this.field107[var12][var14][var13] & var8) != 0) {
                            int var15 = var13;
                            int var16 = var13;
                            int var17 = var12;
                            int var18 = var12;
                            while (var15 > 0 && (this.field107[var12][var14][var15 - 1] & var8) != 0) {
                                var15--;
                            }
                            while (var16 < this.field121 && (this.field107[var12][var14][var16 + 1] & var8) != 0) {
                                var16++;
                            }
                            label331: while (var17 > 0) {
                                for (int var19 = var15; var19 <= var16; var19++) {
                                    if ((this.field107[var17 - 1][var14][var19] & var8) == 0) {
                                        break label331;
                                    }
                                }
                                var17--;
                            }
                            label320: while (var18 < var11) {
                                for (int var20 = var15; var20 <= var16; var20++) {
                                    if ((this.field107[var18 + 1][var14][var20] & var8) == 0) {
                                        break label320;
                                    }
                                }
                                var18++;
                            }
                            int var21 = (var18 + 1 - var17) * (var16 + 1 - var15);
                            if (var21 >= 8) {
                                short var22 = 240;
                                int var23 = this.field117[var18][var14][var15] - var22;
                                int var24 = this.field117[var17][var14][var15];
                                class67.method526(var16 * 128 + 128, var14 * 128, this.field116, var24, 1, var11, var23, var14 * 128, var15 * 128);
                                for (int var25 = var17; var25 <= var18; var25++) {
                                    for (int var26 = var15; var26 <= var16; var26++) {
                                        this.field107[var25][var14][var26] &= ~var8;
                                    }
                                }
                            }
                        }
                        if ((this.field107[var12][var14][var13] & var9) != 0) {
                            int var27 = var14;
                            int var28 = var14;
                            int var29 = var12;
                            int var30 = var12;
                            while (var27 > 0 && (this.field107[var12][var27 - 1][var13] & var9) != 0) {
                                var27--;
                            }
                            while (var28 < this.field120 && (this.field107[var12][var28 + 1][var13] & var9) != 0) {
                                var28++;
                            }
                            label384: while (var29 > 0) {
                                for (int var31 = var27; var31 <= var28; var31++) {
                                    if ((this.field107[var29 - 1][var31][var13] & var9) == 0) {
                                        break label384;
                                    }
                                }
                                var29--;
                            }
                            label373: while (var30 < var11) {
                                for (int var32 = var27; var32 <= var28; var32++) {
                                    if ((this.field107[var30 + 1][var32][var13] & var9) == 0) {
                                        break label373;
                                    }
                                }
                                var30++;
                            }
                            int var33 = (var30 + 1 - var29) * (var28 + 1 - var27);
                            if (var33 >= 8) {
                                short var34 = 240;
                                int var35 = this.field117[var30][var27][var13] - var34;
                                int var36 = this.field117[var29][var27][var13];
                                class67.method526(var13 * 128, var27 * 128, this.field116, var36, 2, var11, var35, var28 * 128 + 128, var13 * 128);
                                for (int var37 = var29; var37 <= var30; var37++) {
                                    for (int var38 = var27; var38 <= var28; var38++) {
                                        this.field107[var37][var38][var13] &= ~var9;
                                    }
                                }
                            }
                        }
                        if ((this.field107[var12][var14][var13] & var10) != 0) {
                            int var39 = var14;
                            int var40 = var14;
                            int var41 = var13;
                            int var42 = var13;
                            while (var41 > 0 && (this.field107[var12][var14][var41 - 1] & var10) != 0) {
                                var41--;
                            }
                            while (var42 < this.field121 && (this.field107[var12][var14][var42 + 1] & var10) != 0) {
                                var42++;
                            }
                            label437: while (var39 > 0) {
                                for (int var43 = var41; var43 <= var42; var43++) {
                                    if ((this.field107[var12][var39 - 1][var43] & var10) == 0) {
                                        break label437;
                                    }
                                }
                                var39--;
                            }
                            label426: while (var40 < this.field120) {
                                for (int var44 = var41; var44 <= var42; var44++) {
                                    if ((this.field107[var12][var40 + 1][var44] & var10) == 0) {
                                        break label426;
                                    }
                                }
                                var40++;
                            }
                            if ((var40 + 1 - var39) * (var42 + 1 - var41) >= 4) {
                                int var45 = this.field117[var12][var39][var41];
                                class67.method526(var42 * 128 + 128, var39 * 128, this.field116, var45, 4, var11, var45, var40 * 128 + 128, var41 * 128);
                                for (int var46 = var39; var46 <= var40; var46++) {
                                    for (int var47 = var41; var47 <= var42; var47++) {
                                        this.field107[var12][var46][var47] &= ~var10;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "CDASFTJJ", name = "a", descriptor = "(II)I")
    private static final int method31(int arg0, int arg1) {
        int var2 = method43(arg0 + 45365, arg1 + 91923, 4) + (method43(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method43(arg0, arg1, 1) - 128 >> 2) - 128;
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @OriginalMember(owner = "CDASFTJJ", name = "a", descriptor = "(ILWJVLISUF;IIILTJMGSZMW;[[[IIZII)V")
    public static final void method32(int arg0, class67 arg1, int arg2, int arg3, int arg4, class56 arg5, int[][][] arg6, int arg7, boolean arg8, int arg9, int arg10) {
        int var11 = arg6[arg3][arg4][arg7];
        int var12 = arg6[arg3][arg4 + 1][arg7];
        int var13 = arg6[arg3][arg4 + 1][arg7 + 1];
        int var14 = arg6[arg3][arg4][arg7 + 1];
        int var15 = var11 + var12 + var13 + var14 >> 2;
        class33 var16 = class33.method290(arg2);
        if (!arg8) {
            field130 = !field130;
        }
        int var17 = (arg2 << 14) + (arg7 << 7) + arg4 + 1073741824;
        if (!var16.field980) {
            var17 += Integer.MIN_VALUE;
        }
        byte var18 = (byte) ((arg9 << 6) + arg0);
        if (arg0 == 22) {
            class62 var19;
            if (var16.field987 == -1 && var16.field1000 == null) {
                var19 = var16.method295(22, arg9, var11, var12, var13, var14, -1);
            } else {
                var19 = new class54(arg2, arg9, true, var13, 9, var11, var12, 22, var14, var16.field987);
            }
            arg1.method529(arg10, var19, arg4, var15, arg7, var17, -281, var18);
            if (var16.field1013 && var16.field980) {
                arg5.method483(arg4, arg7, field131);
            }
        } else if (arg0 == 10 || arg0 == 11) {
            class62 var39;
            if (var16.field987 == -1 && var16.field1000 == null) {
                var39 = var16.method295(10, arg9, var11, var12, var13, var14, -1);
            } else {
                var39 = new class54(arg2, arg9, true, var13, 9, var11, var12, 10, var14, var16.field987);
            }
            if (var39 != null) {
                int var40 = 0;
                if (arg0 == 11) {
                    var40 += 256;
                }
                int var41;
                int var42;
                if (arg9 == 1 || arg9 == 3) {
                    var41 = var16.field993;
                    var42 = var16.field1001;
                } else {
                    var41 = var16.field1001;
                    var42 = var16.field993;
                }
                arg1.method533(arg7, arg10, var15, var42, var39, arg4, var17, var41, true, var40, var18);
            }
            if (var16.field1013) {
                arg5.method482(arg4, arg7, var16.field993, var16.field1026, arg9, var16.field1001, 33793);
            }
        } else if (arg0 >= 12) {
            class62 var20;
            if (var16.field987 == -1 && var16.field1000 == null) {
                var20 = var16.method295(arg0, arg9, var11, var12, var13, var14, -1);
            } else {
                var20 = new class54(arg2, arg9, true, var13, 9, var11, var12, arg0, var14, var16.field987);
            }
            arg1.method533(arg7, arg10, var15, 1, var20, arg4, var17, 1, true, 0, var18);
            if (var16.field1013) {
                arg5.method482(arg4, arg7, var16.field993, var16.field1026, arg9, var16.field1001, 33793);
            }
        } else if (arg0 == 0) {
            class62 var21;
            if (var16.field987 == -1 && var16.field1000 == null) {
                var21 = var16.method295(0, arg9, var11, var12, var13, var14, -1);
            } else {
                var21 = new class54(arg2, arg9, true, var13, 9, var11, var12, 0, var14, var16.field987);
            }
            arg1.method531(field118[arg9], field114, var15, 0, var17, var21, arg10, arg7, null, arg4, var18);
            if (var16.field1013) {
                arg5.method481(arg9, var16.field1026, arg0, true, arg7, arg4);
            }
        } else if (arg0 == 1) {
            class62 var22;
            if (var16.field987 == -1 && var16.field1000 == null) {
                var22 = var16.method295(1, arg9, var11, var12, var13, var14, -1);
            } else {
                var22 = new class54(arg2, arg9, true, var13, 9, var11, var12, 1, var14, var16.field987);
            }
            arg1.method531(field128[arg9], field114, var15, 0, var17, var22, arg10, arg7, null, arg4, var18);
            if (var16.field1013) {
                arg5.method481(arg9, var16.field1026, arg0, true, arg7, arg4);
            }
        } else if (arg0 == 2) {
            int var23 = arg9 + 1 & 0x3;
            class62 var24;
            class62 var25;
            if (var16.field987 == -1 && var16.field1000 == null) {
                var24 = var16.method295(2, arg9 + 4, var11, var12, var13, var14, -1);
                var25 = var16.method295(2, var23, var11, var12, var13, var14, -1);
            } else {
                var24 = new class54(arg2, arg9 + 4, true, var13, 9, var11, var12, 2, var14, var16.field987);
                var25 = new class54(arg2, var23, true, var13, 9, var11, var12, 2, var14, var16.field987);
            }
            arg1.method531(field118[arg9], field114, var15, field118[var23], var17, var24, arg10, arg7, var25, arg4, var18);
            if (var16.field1013) {
                arg5.method481(arg9, var16.field1026, arg0, true, arg7, arg4);
            }
        } else if (arg0 == 3) {
            class62 var26;
            if (var16.field987 == -1 && var16.field1000 == null) {
                var26 = var16.method295(3, arg9, var11, var12, var13, var14, -1);
            } else {
                var26 = new class54(arg2, arg9, true, var13, 9, var11, var12, 3, var14, var16.field987);
            }
            arg1.method531(field128[arg9], field114, var15, 0, var17, var26, arg10, arg7, null, arg4, var18);
            if (var16.field1013) {
                arg5.method481(arg9, var16.field1026, arg0, true, arg7, arg4);
            }
        } else if (arg0 == 9) {
            class62 var27;
            if (var16.field987 == -1 && var16.field1000 == null) {
                var27 = var16.method295(arg0, arg9, var11, var12, var13, var14, -1);
            } else {
                var27 = new class54(arg2, arg9, true, var13, 9, var11, var12, arg0, var14, var16.field987);
            }
            arg1.method533(arg7, arg10, var15, 1, var27, arg4, var17, 1, true, 0, var18);
            if (var16.field1013) {
                arg5.method482(arg4, arg7, var16.field993, var16.field1026, arg9, var16.field1001, 33793);
            }
        } else {
            if (var16.field997) {
                if (arg9 == 1) {
                    int var28 = var14;
                    var14 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var28;
                } else if (arg9 == 2) {
                    int var29 = var14;
                    var14 = var12;
                    var12 = var29;
                    int var30 = var13;
                    var13 = var11;
                    var11 = var30;
                } else if (arg9 == 3) {
                    int var31 = var14;
                    var14 = var11;
                    var11 = var12;
                    var12 = var13;
                    var13 = var31;
                }
            }
            if (arg0 == 4) {
                class62 var32;
                if (var16.field987 == -1 && var16.field1000 == null) {
                    var32 = var16.method295(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var32 = new class54(arg2, 0, true, var13, 9, var11, var12, 4, var14, var16.field987);
                }
                arg1.method532(var15, arg4, var32, var18, field118[arg9], var17, true, arg7, arg10, arg9 * 512, 0, 0);
            } else if (arg0 == 5) {
                int var33 = 16;
                int var34 = arg1.method549(arg10, arg4, arg7);
                if (var34 > 0) {
                    var33 = class33.method290(var34 >> 14 & 0x7FFF).field985;
                }
                class62 var35;
                if (var16.field987 == -1 && var16.field1000 == null) {
                    var35 = var16.method295(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var35 = new class54(arg2, 0, true, var13, 9, var11, var12, 4, var14, var16.field987);
                }
                arg1.method532(var15, arg4, var35, var18, field118[arg9], var17, true, arg7, arg10, arg9 * 512, field129[arg9] * var33, field103[arg9] * var33);
            } else if (arg0 == 6) {
                class62 var36;
                if (var16.field987 == -1 && var16.field1000 == null) {
                    var36 = var16.method295(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var36 = new class54(arg2, 0, true, var13, 9, var11, var12, 4, var14, var16.field987);
                }
                arg1.method532(var15, arg4, var36, var18, 256, var17, true, arg7, arg10, arg9, 0, 0);
            } else if (arg0 == 7) {
                class62 var37;
                if (var16.field987 == -1 && var16.field1000 == null) {
                    var37 = var16.method295(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var37 = new class54(arg2, 0, true, var13, 9, var11, var12, 4, var14, var16.field987);
                }
                arg1.method532(var15, arg4, var37, var18, 512, var17, true, arg7, arg10, arg9, 0, 0);
            } else if (arg0 == 8) {
                class62 var38;
                if (var16.field987 == -1 && var16.field1000 == null) {
                    var38 = var16.method295(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var38 = new class54(arg2, 0, true, var13, 9, var11, var12, 4, var14, var16.field987);
                }
                arg1.method532(var15, arg4, var38, var18, 768, var17, true, arg7, arg10, arg9, 0, 0);
            }
        }
    }

    @OriginalMember(owner = "CDASFTJJ", name = "a", descriptor = "(I[BII)Z")
    public static final boolean method33(int arg0, byte[] arg1, int arg2, int arg3) {
        boolean var4 = true;
        class43 var5 = new class43(arg1, 0);
        int var6 = -1;
        if (arg0 != -22551) {
            throw new NullPointerException();
        }
        label52: while (true) {
            int var7 = var5.method344();
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method344();
                    if (var11 == 0) {
                        continue label52;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = var5.method330() >> 2;
                    int var15 = arg2 + var13;
                    int var16 = arg3 + var12;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        class33 var17 = class33.method290(var6);
                        if (var14 != 22 || !field133 || var17.field980 || var17.field1025) {
                            var4 &= var17.method296(0);
                            var9 = true;
                        }
                    }
                }
                int var10 = var5.method344();
                if (var10 == 0) {
                    break;
                }
                var5.method330();
            }
        }
    }

    @OriginalMember(owner = "CDASFTJJ", name = "a", descriptor = "(BIIII)V")
    public final void method34(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var6 = arg2; var6 <= arg2 + arg4; var6++) {
            for (int var7 = arg1; var7 <= arg1 + arg3; var7++) {
                if (var7 >= 0 && var7 < this.field120 && var6 >= 0 && var6 < this.field121) {
                    this.field113[0][var7][var6] = 127;
                    if (arg1 == var7 && var7 > 0) {
                        this.field117[0][var7][var6] = this.field117[0][var7 - 1][var6];
                    }
                    if (arg1 + arg3 == var7 && var7 < this.field120 - 1) {
                        this.field117[0][var7][var6] = this.field117[0][var7 + 1][var6];
                    }
                    if (arg2 == var6 && var6 > 0) {
                        this.field117[0][var7][var6] = this.field117[0][var7][var6 - 1];
                    }
                    if (arg2 + arg4 == var6 && var6 < this.field121 - 1) {
                        this.field117[0][var7][var6] = this.field117[0][var7][var6 + 1];
                    }
                }
            }
        }
        if (arg0 != -73) {
            field130 = !field130;
        }
    }

    @OriginalMember(owner = "CDASFTJJ", name = "a", descriptor = "(IILTJMGSZMW;ILWJVLISUF;IIII)V")
    private final void method35(int arg0, int arg1, class56 arg2, int arg3, class67 arg4, int arg5, int arg6, int arg7, int arg8) {
        if (field133 && (this.field111[0][arg8][arg3] & 0x2) == 0) {
            if ((this.field111[arg1][arg8][arg3] & 0x10) != 0) {
                return;
            }
            if (this.method38(arg3, (byte) -102, arg8, arg1) != field132) {
                return;
            }
        }
        if (arg1 < field119) {
            field119 = arg1;
        }
        int var10 = this.field117[arg1][arg8][arg3];
        int var11 = this.field117[arg1][arg8 + 1][arg3];
        int var12 = this.field117[arg1][arg8 + 1][arg3 + 1];
        int var13 = this.field117[arg1][arg8][arg3 + 1];
        int var14 = var10 + var11 + var12 + var13 >> 2;
        if (arg7 != 31613) {
            for (int var15 = 1; var15 > 0; var15++) {
            }
        }
        class33 var16 = class33.method290(arg5);
        int var17 = (arg5 << 14) + (arg3 << 7) + arg8 + 1073741824;
        if (!var16.field980) {
            var17 += Integer.MIN_VALUE;
        }
        byte var18 = (byte) ((arg0 << 6) + arg6);
        if (arg6 == 22) {
            if (!field133 || var16.field980 || var16.field1025) {
                class62 var19;
                if (var16.field987 == -1 && var16.field1000 == null) {
                    var19 = var16.method295(22, arg0, var10, var11, var12, var13, -1);
                } else {
                    var19 = new class54(arg5, arg0, true, var12, 9, var10, var11, 22, var13, var16.field987);
                }
                arg4.method529(arg1, var19, arg8, var14, arg3, var17, -281, var18);
                if (var16.field1013 && var16.field980 && arg2 != null) {
                    arg2.method483(arg8, arg3, field131);
                }
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class62 var39;
            if (var16.field987 == -1 && var16.field1000 == null) {
                var39 = var16.method295(10, arg0, var10, var11, var12, var13, -1);
            } else {
                var39 = new class54(arg5, arg0, true, var12, 9, var10, var11, 10, var13, var16.field987);
            }
            if (var39 != null) {
                int var40 = 0;
                if (arg6 == 11) {
                    var40 += 256;
                }
                int var41;
                int var42;
                if (arg0 == 1 || arg0 == 3) {
                    var41 = var16.field993;
                    var42 = var16.field1001;
                } else {
                    var41 = var16.field1001;
                    var42 = var16.field993;
                }
                if (arg4.method533(arg3, arg1, var14, var42, var39, arg8, var17, var41, true, var40, var18) && var16.field992) {
                    class45 var43;
                    if (var39 instanceof class45) {
                        var43 = (class45) var39;
                    } else {
                        var43 = var16.method295(10, arg0, var10, var11, var12, var13, -1);
                    }
                    if (var43 != null) {
                        for (int var44 = 0; var44 <= var41; var44++) {
                            for (int var45 = 0; var45 <= var42; var45++) {
                                int var46 = var43.field1174 / 4;
                                if (var46 > 30) {
                                    var46 = 30;
                                }
                                if (var46 > this.field113[arg1][arg8 + var44][arg3 + var45]) {
                                    this.field113[arg1][arg8 + var44][arg3 + var45] = (byte) var46;
                                }
                            }
                        }
                    }
                }
            }
            if (var16.field1013 && arg2 != null) {
                arg2.method482(arg8, arg3, var16.field993, var16.field1026, arg0, var16.field1001, 33793);
            }
        } else if (arg6 >= 12) {
            class62 var20;
            if (var16.field987 == -1 && var16.field1000 == null) {
                var20 = var16.method295(arg6, arg0, var10, var11, var12, var13, -1);
            } else {
                var20 = new class54(arg5, arg0, true, var12, 9, var10, var11, arg6, var13, var16.field987);
            }
            arg4.method533(arg3, arg1, var14, 1, var20, arg8, var17, 1, true, 0, var18);
            if (arg6 >= 12 && arg6 <= 17 && arg6 != 13 && arg1 > 0) {
                this.field107[arg1][arg8][arg3] |= 0x924;
            }
            if (var16.field1013 && arg2 != null) {
                arg2.method482(arg8, arg3, var16.field993, var16.field1026, arg0, var16.field1001, 33793);
            }
        } else if (arg6 == 0) {
            class62 var21;
            if (var16.field987 == -1 && var16.field1000 == null) {
                var21 = var16.method295(0, arg0, var10, var11, var12, var13, -1);
            } else {
                var21 = new class54(arg5, arg0, true, var12, 9, var10, var11, 0, var13, var16.field987);
            }
            arg4.method531(field118[arg0], field114, var14, 0, var17, var21, arg1, arg3, null, arg8, var18);
            if (arg0 == 0) {
                if (var16.field992) {
                    this.field113[arg1][arg8][arg3] = 50;
                    this.field113[arg1][arg8][arg3 + 1] = 50;
                }
                if (var16.field989) {
                    this.field107[arg1][arg8][arg3] |= 0x249;
                }
            } else if (arg0 == 1) {
                if (var16.field992) {
                    this.field113[arg1][arg8][arg3 + 1] = 50;
                    this.field113[arg1][arg8 + 1][arg3 + 1] = 50;
                }
                if (var16.field989) {
                    this.field107[arg1][arg8][arg3 + 1] |= 0x492;
                }
            } else if (arg0 == 2) {
                if (var16.field992) {
                    this.field113[arg1][arg8 + 1][arg3] = 50;
                    this.field113[arg1][arg8 + 1][arg3 + 1] = 50;
                }
                if (var16.field989) {
                    this.field107[arg1][arg8 + 1][arg3] |= 0x249;
                }
            } else if (arg0 == 3) {
                if (var16.field992) {
                    this.field113[arg1][arg8][arg3] = 50;
                    this.field113[arg1][arg8 + 1][arg3] = 50;
                }
                if (var16.field989) {
                    this.field107[arg1][arg8][arg3] |= 0x492;
                }
            }
            if (var16.field1013 && arg2 != null) {
                arg2.method481(arg0, var16.field1026, arg6, true, arg3, arg8);
            }
            if (var16.field985 != 16) {
                arg4.method539(arg8, arg1, arg3, true, var16.field985);
            }
        } else if (arg6 == 1) {
            class62 var22;
            if (var16.field987 == -1 && var16.field1000 == null) {
                var22 = var16.method295(1, arg0, var10, var11, var12, var13, -1);
            } else {
                var22 = new class54(arg5, arg0, true, var12, 9, var10, var11, 1, var13, var16.field987);
            }
            arg4.method531(field128[arg0], field114, var14, 0, var17, var22, arg1, arg3, null, arg8, var18);
            if (var16.field992) {
                if (arg0 == 0) {
                    this.field113[arg1][arg8][arg3 + 1] = 50;
                } else if (arg0 == 1) {
                    this.field113[arg1][arg8 + 1][arg3 + 1] = 50;
                } else if (arg0 == 2) {
                    this.field113[arg1][arg8 + 1][arg3] = 50;
                } else if (arg0 == 3) {
                    this.field113[arg1][arg8][arg3] = 50;
                }
            }
            if (var16.field1013 && arg2 != null) {
                arg2.method481(arg0, var16.field1026, arg6, true, arg3, arg8);
            }
        } else if (arg6 == 2) {
            int var23 = arg0 + 1 & 0x3;
            class62 var24;
            class62 var25;
            if (var16.field987 == -1 && var16.field1000 == null) {
                var24 = var16.method295(2, arg0 + 4, var10, var11, var12, var13, -1);
                var25 = var16.method295(2, var23, var10, var11, var12, var13, -1);
            } else {
                var24 = new class54(arg5, arg0 + 4, true, var12, 9, var10, var11, 2, var13, var16.field987);
                var25 = new class54(arg5, var23, true, var12, 9, var10, var11, 2, var13, var16.field987);
            }
            arg4.method531(field118[arg0], field114, var14, field118[var23], var17, var24, arg1, arg3, var25, arg8, var18);
            if (var16.field989) {
                if (arg0 == 0) {
                    this.field107[arg1][arg8][arg3] |= 0x249;
                    this.field107[arg1][arg8][arg3 + 1] |= 0x492;
                } else if (arg0 == 1) {
                    this.field107[arg1][arg8][arg3 + 1] |= 0x492;
                    this.field107[arg1][arg8 + 1][arg3] |= 0x249;
                } else if (arg0 == 2) {
                    this.field107[arg1][arg8 + 1][arg3] |= 0x249;
                    this.field107[arg1][arg8][arg3] |= 0x492;
                } else if (arg0 == 3) {
                    this.field107[arg1][arg8][arg3] |= 0x492;
                    this.field107[arg1][arg8][arg3] |= 0x249;
                }
            }
            if (var16.field1013 && arg2 != null) {
                arg2.method481(arg0, var16.field1026, arg6, true, arg3, arg8);
            }
            if (var16.field985 != 16) {
                arg4.method539(arg8, arg1, arg3, true, var16.field985);
            }
        } else if (arg6 == 3) {
            class62 var26;
            if (var16.field987 == -1 && var16.field1000 == null) {
                var26 = var16.method295(3, arg0, var10, var11, var12, var13, -1);
            } else {
                var26 = new class54(arg5, arg0, true, var12, 9, var10, var11, 3, var13, var16.field987);
            }
            arg4.method531(field128[arg0], field114, var14, 0, var17, var26, arg1, arg3, null, arg8, var18);
            if (var16.field992) {
                if (arg0 == 0) {
                    this.field113[arg1][arg8][arg3 + 1] = 50;
                } else if (arg0 == 1) {
                    this.field113[arg1][arg8 + 1][arg3 + 1] = 50;
                } else if (arg0 == 2) {
                    this.field113[arg1][arg8 + 1][arg3] = 50;
                } else if (arg0 == 3) {
                    this.field113[arg1][arg8][arg3] = 50;
                }
            }
            if (var16.field1013 && arg2 != null) {
                arg2.method481(arg0, var16.field1026, arg6, true, arg3, arg8);
            }
        } else if (arg6 == 9) {
            class62 var27;
            if (var16.field987 == -1 && var16.field1000 == null) {
                var27 = var16.method295(arg6, arg0, var10, var11, var12, var13, -1);
            } else {
                var27 = new class54(arg5, arg0, true, var12, 9, var10, var11, arg6, var13, var16.field987);
            }
            arg4.method533(arg3, arg1, var14, 1, var27, arg8, var17, 1, true, 0, var18);
            if (var16.field1013 && arg2 != null) {
                arg2.method482(arg8, arg3, var16.field993, var16.field1026, arg0, var16.field1001, 33793);
            }
        } else {
            if (var16.field997) {
                if (arg0 == 1) {
                    int var28 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var10;
                    var10 = var28;
                } else if (arg0 == 2) {
                    int var29 = var13;
                    var13 = var11;
                    var11 = var29;
                    int var30 = var12;
                    var12 = var10;
                    var10 = var30;
                } else if (arg0 == 3) {
                    int var31 = var13;
                    var13 = var10;
                    var10 = var11;
                    var11 = var12;
                    var12 = var31;
                }
            }
            if (arg6 == 4) {
                class62 var32;
                if (var16.field987 == -1 && var16.field1000 == null) {
                    var32 = var16.method295(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var32 = new class54(arg5, 0, true, var12, 9, var10, var11, 4, var13, var16.field987);
                }
                arg4.method532(var14, arg8, var32, var18, field118[arg0], var17, true, arg3, arg1, arg0 * 512, 0, 0);
            } else if (arg6 == 5) {
                int var33 = 16;
                int var34 = arg4.method549(arg1, arg8, arg3);
                if (var34 > 0) {
                    var33 = class33.method290(var34 >> 14 & 0x7FFF).field985;
                }
                class62 var35;
                if (var16.field987 == -1 && var16.field1000 == null) {
                    var35 = var16.method295(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var35 = new class54(arg5, 0, true, var12, 9, var10, var11, 4, var13, var16.field987);
                }
                arg4.method532(var14, arg8, var35, var18, field118[arg0], var17, true, arg3, arg1, arg0 * 512, field129[arg0] * var33, field103[arg0] * var33);
            } else if (arg6 == 6) {
                class62 var36;
                if (var16.field987 == -1 && var16.field1000 == null) {
                    var36 = var16.method295(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var36 = new class54(arg5, 0, true, var12, 9, var10, var11, 4, var13, var16.field987);
                }
                arg4.method532(var14, arg8, var36, var18, 256, var17, true, arg3, arg1, arg0, 0, 0);
            } else if (arg6 == 7) {
                class62 var37;
                if (var16.field987 == -1 && var16.field1000 == null) {
                    var37 = var16.method295(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var37 = new class54(arg5, 0, true, var12, 9, var10, var11, 4, var13, var16.field987);
                }
                arg4.method532(var14, arg8, var37, var18, 512, var17, true, arg3, arg1, arg0, 0, 0);
            } else if (arg6 == 8) {
                class62 var38;
                if (var16.field987 == -1 && var16.field1000 == null) {
                    var38 = var16.method295(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var38 = new class54(arg5, 0, true, var12, 9, var10, var11, 4, var13, var16.field987);
                }
                arg4.method532(var14, arg8, var38, var18, 768, var17, true, arg3, arg1, arg0, 0, 0);
            }
        }
    }

    @OriginalMember(owner = "CDASFTJJ", name = "a", descriptor = "(IIII)I")
    private static final int method36(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class71.field1705[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @OriginalMember(owner = "CDASFTJJ", name = "a", descriptor = "(IILPKHWFJLM;IIIII)V")
    private final void method37(int arg0, int arg1, class43 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != 0) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        if (arg3 < 0 || arg3 >= 104 || arg1 < 0 || arg1 >= 104) {
            while (true) {
                int var12 = arg2.method330();
                if (var12 == 0) {
                    return;
                }
                if (var12 == 1) {
                    arg2.method330();
                    return;
                }
                if (var12 <= 49) {
                    arg2.method330();
                }
            }
        }
        this.field111[arg5][arg3][arg1] = 0;
        while (true) {
            int var10 = arg2.method330();
            if (var10 == 0) {
                if (arg5 == 0) {
                    this.field117[0][arg3][arg1] = -method31(arg3 + arg0 + 932731, arg1 + 556238 + arg7) * 8;
                    return;
                } else {
                    this.field117[arg5][arg3][arg1] = this.field117[arg5 - 1][arg3][arg1] - 240;
                    return;
                }
            }
            if (var10 == 1) {
                int var11 = arg2.method330();
                if (var11 == 1) {
                    var11 = 0;
                }
                if (arg5 == 0) {
                    this.field117[0][arg3][arg1] = -var11 * 8;
                    return;
                }
                this.field117[arg5][arg3][arg1] = this.field117[arg5 - 1][arg3][arg1] - var11 * 8;
                return;
            }
            if (var10 <= 49) {
                this.field109[arg5][arg3][arg1] = arg2.method331();
                this.field106[arg5][arg3][arg1] = (byte) ((var10 - 2) / 4);
                this.field112[arg5][arg3][arg1] = (byte) (var10 + arg4 - 2 & 0x3);
            } else if (var10 <= 81) {
                this.field111[arg5][arg3][arg1] = (byte) (var10 - 49);
            } else {
                this.field134[arg5][arg3][arg1] = (byte) (var10 - 81);
            }
        }
    }

    @OriginalMember(owner = "CDASFTJJ", name = "a", descriptor = "(IBII)I")
    public int method38(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != -102) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if ((this.field111[arg3][arg2][arg0] & 0x8) == 0) {
            return arg3 <= 0 || (this.field111[1][arg2][arg0] & 0x2) == 0 ? arg3 : arg3 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "CDASFTJJ", name = "a", descriptor = "(IIII[BI[LTJMGSZMW;)V")
    public final void method39(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, class56[] arg6) {
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    if (arg5 + var14 > 0 && arg5 + var14 < 103 && arg2 + var15 > 0 && arg2 + var15 < 103) {
                        arg6[var8].field1483[arg5 + var14][arg2 + var15] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class43 var9 = new class43(arg4, 0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var12 = 0; var12 < 64; var12++) {
                for (int var13 = 0; var13 < 64; var13++) {
                    this.method37(arg3, arg2 + var13, var9, arg5 + var12, 0, var10, this.field104, arg1);
                }
            }
        }
        if (arg0 < 3 || arg0 > 3) {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
    }

    @OriginalMember(owner = "CDASFTJJ", name = "b", descriptor = "(II)I")
    private static final int method40(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "CDASFTJJ", name = "<init>", descriptor = "([[[I[[[BIII)V")
    public class9(int[][][] arg0, byte[][][] arg1, int arg2, int arg3, int arg4) {
        field119 = 99;
        this.field120 = arg2;
        this.field121 = arg4;
        this.field117 = arg0;
        this.field111 = arg1;
        this.field134 = new byte[4][this.field120][this.field121];
        this.field109 = new byte[4][this.field120][this.field121];
        this.field106 = new byte[4][this.field120][this.field121];
        this.field112 = new byte[4][this.field120][this.field121];
        this.field107 = new int[4][this.field120 + 1][this.field121 + 1];
        if (arg3 != 1) {
            throw new NullPointerException();
        }
        this.field113 = new byte[4][this.field120 + 1][this.field121 + 1];
        this.field108 = new int[this.field120 + 1][this.field121 + 1];
        this.field123 = new int[this.field121];
        this.field124 = new int[this.field121];
        this.field125 = new int[this.field121];
        this.field126 = new int[this.field121];
        this.field127 = new int[this.field121];
    }

    @OriginalMember(owner = "CDASFTJJ", name = "b", descriptor = "(III)Z")
    public static final boolean method41(int arg0, int arg1, int arg2) {
        if (arg0 != 49097) {
            field122 = !field122;
        }
        class33 var3 = class33.method290(arg1);
        if (arg2 == 11) {
            arg2 = 10;
        }
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        return var3.method298(0, arg2);
    }

    @OriginalMember(owner = "CDASFTJJ", name = "c", descriptor = "(II)I")
    private static final int method42(int arg0, int arg1) {
        int var2 = method40(arg0 - 1, arg1 - 1) + method40(arg0 + 1, arg1 - 1) + method40(arg0 - 1, arg1 + 1) + method40(arg0 + 1, arg1 + 1);
        int var3 = method40(arg0 - 1, arg1) + method40(arg0 + 1, arg1) + method40(arg0, arg1 - 1) + method40(arg0, arg1 + 1);
        int var4 = method40(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @OriginalMember(owner = "CDASFTJJ", name = "c", descriptor = "(III)I")
    private static final int method43(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method42(var3, var5);
        int var8 = method42(var3 + 1, var5);
        int var9 = method42(var3, var5 + 1);
        int var10 = method42(var3 + 1, var5 + 1);
        int var11 = method36(var7, var8, var4, arg2);
        int var12 = method36(var9, var10, var4, arg2);
        return method36(var11, var12, var6, arg2);
    }

    @OriginalMember(owner = "CDASFTJJ", name = "d", descriptor = "(II)I")
    private final int method44(int arg0, int arg1) {
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg1 < 0) {
                arg1 = 0;
            } else if (arg1 > 127) {
                arg1 = 127;
            }
            return 127 - arg1;
        } else {
            int var4 = (arg0 & 0x7F) * arg1 / 128;
            if (var4 < 2) {
                var4 = 2;
            } else if (var4 > 126) {
                var4 = 126;
            }
            return (arg0 & 0xFF80) + var4;
        }
    }

    @OriginalMember(owner = "CDASFTJJ", name = "e", descriptor = "(II)I")
    private static final int method45(int arg0, int arg1) {
        if (arg0 == -1) {
            return 12345678;
        }
        int var2 = (arg0 & 0x7F) * arg1 / 128;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "CDASFTJJ", name = "a", descriptor = "(II[BIIILWJVLISUF;III[LTJMGSZMW;)V")
    public final void method46(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, class67 arg6, int arg7, int arg8, int arg9, class56[] arg10) {
        class43 var12 = new class43(arg2, 0);
        if (this.field105 != arg0) {
            field130 = !field130;
        }
        int var13 = -1;
        while (true) {
            int var14 = var12.method344();
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method344();
                if (var16 == 0) {
                    break;
                }
                var15 += var16 - 1;
                int var17 = var15 & 0x3F;
                int var18 = var15 >> 6 & 0x3F;
                int var19 = var15 >> 12;
                int var20 = var12.method330();
                int var21 = var20 >> 2;
                int var22 = var20 & 0x3;
                if (arg1 == var19 && var18 >= arg5 && var18 < arg5 + 8 && var17 >= arg3 && var17 < arg3 + 8) {
                    class33 var23 = class33.method290(var13);
                    int var24 = arg4 + class50.method456(var18 & 0x7, var23.field1001, arg7, var17 & 0x7, var22, (byte) 60, var23.field993);
                    int var25 = arg9 + class50.method457(true, arg7, var23.field1001, var23.field993, var18 & 0x7, var22, var17 & 0x7);
                    if (var24 > 0 && var25 > 0 && var24 < 103 && var25 < 103) {
                        int var26 = arg8;
                        if ((this.field111[1][var24][var25] & 0x2) == 2) {
                            var26 = arg8 - 1;
                        }
                        class56 var27 = null;
                        if (var26 >= 0) {
                            var27 = arg10[var26];
                        }
                        this.method35(arg7 + var22 & 0x3, arg8, var27, var25, arg6, var13, var21, 31613, var24);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "CDASFTJJ", name = "a", descriptor = "(ILWJVLISUF;[LTJMGSZMW;II[B)V")
    public final void method47(int arg0, class67 arg1, class56[] arg2, int arg3, int arg4, byte[] arg5) {
        class43 var7 = new class43(arg5, 0);
        if (arg4 <= 0) {
            field122 = !field122;
        }
        int var8 = -1;
        while (true) {
            int var9 = var7.method344();
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method344();
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = var10 & 0x3F;
                int var13 = var10 >> 6 & 0x3F;
                int var14 = var10 >> 12;
                int var15 = var7.method330();
                int var16 = var15 >> 2;
                int var17 = var15 & 0x3;
                int var18 = arg0 + var13;
                int var19 = arg3 + var12;
                if (var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) {
                    int var20 = var14;
                    if ((this.field111[1][var18][var19] & 0x2) == 2) {
                        var20 = var14 - 1;
                    }
                    class56 var21 = null;
                    if (var20 >= 0) {
                        var21 = arg2[var20];
                    }
                    this.method35(var17, var14, var21, var19, arg1, var8, var16, 31613, var18);
                }
            }
        }
    }
}
