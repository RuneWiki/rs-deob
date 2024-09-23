import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("PMCVBMMY")
public class class36 {

    @OriginalMember(owner = "PMCVBMMY", name = "t", descriptor = "Z")
    private boolean field1292 = true;

    @OriginalMember(owner = "PMCVBMMY", name = "H", descriptor = "I")
    private int field1306 = 8;

    @OriginalMember(owner = "PMCVBMMY", name = "J", descriptor = "I")
    private int field1308 = -543;

    @OriginalMember(owner = "PMCVBMMY", name = "q", descriptor = "I")
    private int field1289;

    @OriginalMember(owner = "PMCVBMMY", name = "r", descriptor = "I")
    private int field1290;

    @OriginalMember(owner = "PMCVBMMY", name = "j", descriptor = "[[[I")
    private int[][][] field1282;

    @OriginalMember(owner = "PMCVBMMY", name = "k", descriptor = "[[[B")
    private byte[][][] field1283;

    @OriginalMember(owner = "PMCVBMMY", name = "A", descriptor = "[[[B")
    private byte[][][] field1299;

    @OriginalMember(owner = "PMCVBMMY", name = "E", descriptor = "[[[B")
    private byte[][][] field1303;

    @OriginalMember(owner = "PMCVBMMY", name = "F", descriptor = "[[[B")
    private byte[][][] field1304;

    @OriginalMember(owner = "PMCVBMMY", name = "n", descriptor = "[[[B")
    private byte[][][] field1286;

    @OriginalMember(owner = "PMCVBMMY", name = "K", descriptor = "[[[I")
    private int[][][] field1309;

    @OriginalMember(owner = "PMCVBMMY", name = "z", descriptor = "[[[B")
    private byte[][][] field1298;

    @OriginalMember(owner = "PMCVBMMY", name = "u", descriptor = "[[I")
    private int[][] field1293;

    @OriginalMember(owner = "PMCVBMMY", name = "e", descriptor = "[I")
    private int[] field1277;

    @OriginalMember(owner = "PMCVBMMY", name = "f", descriptor = "[I")
    private int[] field1278;

    @OriginalMember(owner = "PMCVBMMY", name = "g", descriptor = "[I")
    private int[] field1279;

    @OriginalMember(owner = "PMCVBMMY", name = "h", descriptor = "[I")
    private int[] field1280;

    @OriginalMember(owner = "PMCVBMMY", name = "i", descriptor = "[I")
    private int[] field1281;

    @OriginalMember(owner = "PMCVBMMY", name = "a", descriptor = "Z")
    private static boolean field1273 = true;

    @OriginalMember(owner = "PMCVBMMY", name = "b", descriptor = "[I")
    private static final int[] field1274 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "PMCVBMMY", name = "c", descriptor = "I")
    private static int field1275 = -741;

    @OriginalMember(owner = "PMCVBMMY", name = "l", descriptor = "B")
    private static byte field1284 = 83;

    @OriginalMember(owner = "PMCVBMMY", name = "m", descriptor = "I")
    private static int field1285 = 1;

    @OriginalMember(owner = "PMCVBMMY", name = "o", descriptor = "Z")
    public static boolean field1287 = true;

    @OriginalMember(owner = "PMCVBMMY", name = "p", descriptor = "I")
    public static int field1288 = 99;

    @OriginalMember(owner = "PMCVBMMY", name = "s", descriptor = "B")
    private static byte field1291 = -42;

    @OriginalMember(owner = "PMCVBMMY", name = "w", descriptor = "[I")
    private static final int[] field1295 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "PMCVBMMY", name = "x", descriptor = "I")
    private static int field1296 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "PMCVBMMY", name = "y", descriptor = "[I")
    private static final int[] field1297 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "PMCVBMMY", name = "C", descriptor = "I")
    private static int field1301 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "PMCVBMMY", name = "G", descriptor = "Z")
    private static boolean field1305 = true;

    @OriginalMember(owner = "PMCVBMMY", name = "I", descriptor = "[I")
    private static final int[] field1307 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "PMCVBMMY", name = "d", descriptor = "I")
    private static int field1276;

    @OriginalMember(owner = "PMCVBMMY", name = "B", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "PMCVBMMY", name = "D", descriptor = "I")
    private int field1302;

    @OriginalMember(owner = "PMCVBMMY", name = "v", descriptor = "Z")
    private static boolean field1294;

    @OriginalMember(owner = "PMCVBMMY", name = "a", descriptor = "(LLXDDKEZF;B[LXBMRDXRN;)V")
    public final void method417(class27 arg0, byte arg1, class63[] arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var111 = 0; var111 < 104; var111++) {
                for (int var112 = 0; var112 < 104; var112++) {
                    if ((this.field1283[var4][var111][var112] & 0x1) == 1) {
                        int var113 = var4;
                        if ((this.field1283[1][var111][var112] & 0x2) == 2) {
                            var113 = var4 - 1;
                        }
                        if (var113 >= 0) {
                            arg2[var113].method540(0, var111, var112);
                        }
                    }
                }
            }
        }
        field1296 += (int) (Math.random() * 5.0D) - 2;
        if (field1296 < -8) {
            field1296 = -8;
        }
        if (field1296 > 8) {
            field1296 = 8;
        }
        field1301 += (int) (Math.random() * 5.0D) - 2;
        if (field1301 < -16) {
            field1301 = -16;
        }
        if (field1301 > 16) {
            field1301 = 16;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            byte[][] var49 = this.field1298[var5];
            byte var50 = 96;
            short var51 = 768;
            byte var52 = -50;
            byte var53 = -10;
            byte var54 = -50;
            int var55 = (int) Math.sqrt((double) (var54 * var54 + var52 * var52 + var53 * var53));
            int var56 = var51 * var55 >> 8;
            for (int var57 = 1; var57 < this.field1290 - 1; var57++) {
                for (int var102 = 1; var102 < this.field1289 - 1; var102++) {
                    int var103 = this.field1282[var5][var102 + 1][var57] - this.field1282[var5][var102 - 1][var57];
                    int var104 = this.field1282[var5][var102][var57 + 1] - this.field1282[var5][var102][var57 - 1];
                    int var105 = (int) Math.sqrt((double) (var104 * var104 + var103 * var103 + 65536));
                    int var106 = (var103 << 8) / var105;
                    int var107 = 65536 / var105;
                    int var108 = (var104 << 8) / var105;
                    int var109 = (var54 * var108 + var52 * var106 + var53 * var107) / var56 + var50;
                    int var110 = (var49[var102][var57] >> 1) + (var49[var102][var57 + 1] >> 3) + (var49[var102][var57 - 1] >> 2) + (var49[var102 - 1][var57] >> 2) + (var49[var102 + 1][var57] >> 3);
                    this.field1293[var102][var57] = var109 - var110;
                }
            }
            for (int var58 = 0; var58 < this.field1290; var58++) {
                this.field1277[var58] = 0;
                this.field1278[var58] = 0;
                this.field1279[var58] = 0;
                this.field1280[var58] = 0;
                this.field1281[var58] = 0;
            }
            for (int var59 = -5; var59 < this.field1289 + 5; var59++) {
                for (int var62 = 0; var62 < this.field1290; var62++) {
                    int var96 = var59 + 5;
                    int var10002;
                    if (var96 >= 0 && var96 < this.field1289) {
                        int var97 = this.field1299[var5][var96][var62] & 0xFF;
                        if (var97 > 0) {
                            class38 var98 = class38.field1315[var97 - 1];
                            this.field1277[var62] += var98.field1324;
                            this.field1278[var62] += var98.field1322;
                            this.field1279[var62] += var98.field1323;
                            this.field1280[var62] += var98.field1325;
                            var10002 = this.field1281[var62]++;
                        }
                    }
                    int var99 = var59 - 5;
                    if (var99 >= 0 && var99 < this.field1289) {
                        int var100 = this.field1299[var5][var99][var62] & 0xFF;
                        if (var100 > 0) {
                            class38 var101 = class38.field1315[var100 - 1];
                            this.field1277[var62] -= var101.field1324;
                            this.field1278[var62] -= var101.field1322;
                            this.field1279[var62] -= var101.field1323;
                            this.field1280[var62] -= var101.field1325;
                            var10002 = this.field1281[var62]--;
                        }
                    }
                }
                if (var59 >= 1 && var59 < this.field1289 - 1) {
                    int var63 = 0;
                    int var64 = 0;
                    int var65 = 0;
                    int var66 = 0;
                    int var67 = 0;
                    for (int var68 = -5; var68 < this.field1290 + 5; var68++) {
                        int var69 = var68 + 5;
                        if (var69 >= 0 && var69 < this.field1290) {
                            var63 += this.field1277[var69];
                            var64 += this.field1278[var69];
                            var65 += this.field1279[var69];
                            var66 += this.field1280[var69];
                            var67 += this.field1281[var69];
                        }
                        int var70 = var68 - 5;
                        if (var70 >= 0 && var70 < this.field1290) {
                            var63 -= this.field1277[var70];
                            var64 -= this.field1278[var70];
                            var65 -= this.field1279[var70];
                            var66 -= this.field1280[var70];
                            var67 -= this.field1281[var70];
                        }
                        if (var68 >= 1 && var68 < this.field1290 - 1 && (!field1287 || (this.field1283[0][var59][var68] & 0x2) != 0 || (this.field1283[var5][var59][var68] & 0x10) == 0 && this.method433(var59, var5, true, var68) == field1300)) {
                            if (var5 < field1288) {
                                field1288 = var5;
                            }
                            int var71 = this.field1299[var5][var59][var68] & 0xFF;
                            int var72 = this.field1303[var5][var59][var68] & 0xFF;
                            if (var71 > 0 || var72 > 0) {
                                int var73 = this.field1282[var5][var59][var68];
                                int var74 = this.field1282[var5][var59 + 1][var68];
                                int var75 = this.field1282[var5][var59 + 1][var68 + 1];
                                int var76 = this.field1282[var5][var59][var68 + 1];
                                int var77 = this.field1293[var59][var68];
                                int var78 = this.field1293[var59 + 1][var68];
                                int var79 = this.field1293[var59 + 1][var68 + 1];
                                int var80 = this.field1293[var59][var68 + 1];
                                int var81 = -1;
                                int var82 = -1;
                                if (var71 > 0) {
                                    int var83 = var63 * 256 / var66;
                                    int var84 = var64 / var67;
                                    int var85 = var65 / var67;
                                    var81 = this.method424(var83, var84, var85);
                                    int var86 = field1296 + var83 & 0xFF;
                                    int var87 = field1301 + var85;
                                    if (var87 < 0) {
                                        var87 = 0;
                                    } else if (var87 > 255) {
                                        var87 = 255;
                                    }
                                    var82 = this.method424(var86, var84, var87);
                                }
                                if (var5 > 0) {
                                    boolean var88 = true;
                                    if (var71 == 0 && this.field1304[var5][var59][var68] != 0) {
                                        var88 = false;
                                    }
                                    if (var72 > 0 && !class38.field1315[var72 - 1].field1320) {
                                        var88 = false;
                                    }
                                    if (var88 && var73 == var74 && var73 == var75 && var73 == var76) {
                                        this.field1309[var5][var59][var68] |= 0x924;
                                    }
                                }
                                int var89 = 0;
                                if (var81 != -1) {
                                    var89 = class39.field1351[method422(var82, 96)];
                                }
                                if (var72 == 0) {
                                    arg0.method314(var5, var59, var68, 0, 0, -1, var73, var74, var75, var76, method422(var81, var77), method422(var81, var78), method422(var81, var79), method422(var81, var80), 0, 0, 0, 0, var89, 0);
                                } else {
                                    int var90 = this.field1304[var5][var59][var68] + 1;
                                    byte var91 = this.field1286[var5][var59][var68];
                                    class38 var92 = class38.field1315[var72 - 1];
                                    int var93 = var92.field1318;
                                    int var94;
                                    int var95;
                                    if (var93 >= 0) {
                                        var94 = class39.method453(var93, false);
                                        var95 = -1;
                                    } else if (var92.field1317 == 16711935) {
                                        var94 = 0;
                                        var95 = -2;
                                        var93 = -1;
                                    } else {
                                        var95 = this.method424(var92.field1321, var92.field1322, var92.field1323);
                                        var94 = class39.field1351[this.method428(var92.field1326, 96)];
                                    }
                                    arg0.method314(var5, var59, var68, var90, var91, var93, var73, var74, var75, var76, method422(var81, var77), method422(var81, var78), method422(var81, var79), method422(var81, var80), this.method428(var95, var77), this.method428(var95, var78), this.method428(var95, var79), this.method428(var95, var80), var89, var94);
                                }
                            }
                        }
                    }
                }
            }
            for (int var60 = 1; var60 < this.field1290 - 1; var60++) {
                for (int var61 = 1; var61 < this.field1289 - 1; var61++) {
                    arg0.method313(var5, var61, var60, this.method433(var61, var5, true, var60));
                }
            }
        }
        arg0.method340(768, -50, 64, -50, -10, true);
        for (int var6 = 0; var6 < this.field1289; var6++) {
            for (int var48 = 0; var48 < this.field1290; var48++) {
                if ((this.field1283[1][var6][var48] & 0x2) == 2) {
                    arg0.method311(var6, this.field1302, var48);
                }
            }
        }
        int var7 = 1;
        int var8 = 2;
        int var9 = 4;
        if (arg1 != 107) {
            for (int var10 = 1; var10 > 0; var10++) {
            }
        }
        for (int var11 = 0; var11 < 4; var11++) {
            if (var11 > 0) {
                var7 <<= 0x3;
                var8 <<= 0x3;
                var9 <<= 0x3;
            }
            for (int var12 = 0; var12 <= var11; var12++) {
                for (int var13 = 0; var13 <= this.field1290; var13++) {
                    for (int var14 = 0; var14 <= this.field1289; var14++) {
                        if ((this.field1309[var12][var14][var13] & var7) != 0) {
                            int var15 = var13;
                            int var16 = var13;
                            int var17 = var12;
                            int var18 = var12;
                            while (var15 > 0 && (this.field1309[var12][var14][var15 - 1] & var7) != 0) {
                                var15--;
                            }
                            while (var16 < this.field1290 && (this.field1309[var12][var14][var16 + 1] & var7) != 0) {
                                var16++;
                            }
                            label331: while (var17 > 0) {
                                for (int var19 = var15; var19 <= var16; var19++) {
                                    if ((this.field1309[var17 - 1][var14][var19] & var7) == 0) {
                                        break label331;
                                    }
                                }
                                var17--;
                            }
                            label320: while (var18 < var11) {
                                for (int var20 = var15; var20 <= var16; var20++) {
                                    if ((this.field1309[var18 + 1][var14][var20] & var7) == 0) {
                                        break label320;
                                    }
                                }
                                var18++;
                            }
                            int var21 = (var18 + 1 - var17) * (var16 + 1 - var15);
                            if (var21 >= 8) {
                                short var22 = 240;
                                int var23 = this.field1282[var18][var14][var15] - var22;
                                int var24 = this.field1282[var17][var14][var15];
                                class27.method312(var14 * 128, var11, -677, var24, var23, var16 * 128 + 128, 1, var14 * 128, var15 * 128);
                                for (int var25 = var17; var25 <= var18; var25++) {
                                    for (int var26 = var15; var26 <= var16; var26++) {
                                        this.field1309[var25][var14][var26] &= ~var7;
                                    }
                                }
                            }
                        }
                        if ((this.field1309[var12][var14][var13] & var8) != 0) {
                            int var27 = var14;
                            int var28 = var14;
                            int var29 = var12;
                            int var30 = var12;
                            while (var27 > 0 && (this.field1309[var12][var27 - 1][var13] & var8) != 0) {
                                var27--;
                            }
                            while (var28 < this.field1289 && (this.field1309[var12][var28 + 1][var13] & var8) != 0) {
                                var28++;
                            }
                            label384: while (var29 > 0) {
                                for (int var31 = var27; var31 <= var28; var31++) {
                                    if ((this.field1309[var29 - 1][var31][var13] & var8) == 0) {
                                        break label384;
                                    }
                                }
                                var29--;
                            }
                            label373: while (var30 < var11) {
                                for (int var32 = var27; var32 <= var28; var32++) {
                                    if ((this.field1309[var30 + 1][var32][var13] & var8) == 0) {
                                        break label373;
                                    }
                                }
                                var30++;
                            }
                            int var33 = (var30 + 1 - var29) * (var28 + 1 - var27);
                            if (var33 >= 8) {
                                short var34 = 240;
                                int var35 = this.field1282[var30][var27][var13] - var34;
                                int var36 = this.field1282[var29][var27][var13];
                                class27.method312(var27 * 128, var11, -677, var36, var35, var13 * 128, 2, var28 * 128 + 128, var13 * 128);
                                for (int var37 = var29; var37 <= var30; var37++) {
                                    for (int var38 = var27; var38 <= var28; var38++) {
                                        this.field1309[var37][var38][var13] &= ~var8;
                                    }
                                }
                            }
                        }
                        if ((this.field1309[var12][var14][var13] & var9) != 0) {
                            int var39 = var14;
                            int var40 = var14;
                            int var41 = var13;
                            int var42 = var13;
                            while (var41 > 0 && (this.field1309[var12][var14][var41 - 1] & var9) != 0) {
                                var41--;
                            }
                            while (var42 < this.field1290 && (this.field1309[var12][var14][var42 + 1] & var9) != 0) {
                                var42++;
                            }
                            label437: while (var39 > 0) {
                                for (int var43 = var41; var43 <= var42; var43++) {
                                    if ((this.field1309[var12][var39 - 1][var43] & var9) == 0) {
                                        break label437;
                                    }
                                }
                                var39--;
                            }
                            label426: while (var40 < this.field1289) {
                                for (int var44 = var41; var44 <= var42; var44++) {
                                    if ((this.field1309[var12][var40 + 1][var44] & var9) == 0) {
                                        break label426;
                                    }
                                }
                                var40++;
                            }
                            if ((var40 + 1 - var39) * (var42 + 1 - var41) >= 4) {
                                int var45 = this.field1282[var12][var39][var41];
                                class27.method312(var39 * 128, var11, -677, var45, var45, var42 * 128 + 128, 4, var40 * 128 + 128, var41 * 128);
                                for (int var46 = var39; var46 <= var40; var46++) {
                                    for (int var47 = var41; var47 <= var42; var47++) {
                                        this.field1309[var12][var46][var47] &= ~var9;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "PMCVBMMY", name = "a", descriptor = "(IIII[LXBMRDXRN;III[BI)V")
    public final void method418(int arg0, int arg1, int arg2, int arg3, class63[] arg4, int arg5, int arg6, int arg7, byte[] arg8, int arg9) {
        for (int var11 = 0; var11 < 8; var11++) {
            for (int var16 = 0; var16 < 8; var16++) {
                if (arg2 + var11 > 0 && arg2 + var11 < 103 && arg0 + var16 > 0 && arg0 + var16 < 103) {
                    arg4[arg6].field1625[arg2 + var11][arg0 + var16] &= 0xFEFFFFFF;
                }
            }
        }
        if (arg1 >= 0) {
            this.field1306 = 378;
        }
        class14 var12 = new class14(-527, arg8);
        for (int var13 = 0; var13 < 4; var13++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    if (arg7 == var13 && var14 >= arg3 && var14 < arg3 + 8 && var15 >= arg5 && var15 < arg5 + 8) {
                        this.method434(var12, arg6, 0, 0, arg0 + class66.method554(7, var15 & 0x7, var14 & 0x7, arg9), arg2 + class66.method553(var14 & 0x7, (byte) 94, arg9, var15 & 0x7), 8, arg9);
                    } else {
                        this.method434(var12, 0, 0, 0, -1, -1, 8, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "PMCVBMMY", name = "a", descriptor = "(II[LXBMRDXRN;[BLLXDDKEZF;I)V")
    public final void method419(int arg0, int arg1, class63[] arg2, byte[] arg3, class27 arg4, int arg5) {
        class14 var7 = new class14(-527, arg3);
        int var8 = -1;
        if (arg1 != 6769) {
            return;
        }
        while (true) {
            int var9 = var7.method216();
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method216();
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = var10 & 0x3F;
                int var13 = var10 >> 6 & 0x3F;
                int var14 = var10 >> 12;
                int var15 = var7.method202();
                int var16 = var15 >> 2;
                int var17 = var15 & 0x3;
                int var18 = arg5 + var13;
                int var19 = arg0 + var12;
                if (var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) {
                    int var20 = var14;
                    if ((this.field1283[1][var18][var19] & 0x2) == 2) {
                        var20 = var14 - 1;
                    }
                    class63 var21 = null;
                    if (var20 >= 0) {
                        var21 = arg2[var20];
                    }
                    this.method430(var21, var18, var8, var16, var14, var17, arg4, false, var19);
                }
            }
        }
    }

    @OriginalMember(owner = "PMCVBMMY", name = "a", descriptor = "([LXBMRDXRN;IIIIIILLXDDKEZF;II[B)V")
    public final void method420(class63[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class27 arg7, int arg8, int arg9, byte[] arg10) {
        if (arg2 <= 0) {
            this.field1308 = -477;
        }
        class14 var12 = new class14(-527, arg10);
        int var13 = -1;
        while (true) {
            int var14 = var12.method216();
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method216();
                if (var16 == 0) {
                    break;
                }
                var15 += var16 - 1;
                int var17 = var15 & 0x3F;
                int var18 = var15 >> 6 & 0x3F;
                int var19 = var15 >> 12;
                int var20 = var12.method202();
                int var21 = var20 >> 2;
                int var22 = var20 & 0x3;
                if (arg9 == var19 && var18 >= arg3 && var18 < arg3 + 8 && var17 >= arg4 && var17 < arg4 + 8) {
                    class28 var23 = class28.method365(var13);
                    int var24 = arg5 + class66.method555(var22, var18 & 0x7, var17 & 0x7, arg1, var23.field1125, 0, var23.field1131);
                    int var25 = arg8 + class66.method556(var18 & 0x7, var17 & 0x7, var23.field1131, arg1, var22, var23.field1125, 0);
                    if (var24 > 0 && var25 > 0 && var24 < 103 && var25 < 103) {
                        int var26 = arg6;
                        if ((this.field1283[1][var24][var25] & 0x2) == 2) {
                            var26 = arg6 - 1;
                        }
                        class63 var27 = null;
                        if (var26 >= 0) {
                            var27 = arg0[var26];
                        }
                        this.method430(var27, var24, var13, var21, arg6, arg1 + var22 & 0x3, arg7, false, var25);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "PMCVBMMY", name = "a", descriptor = "(IZI[LXBMRDXRN;II[B)V")
    public final void method421(int arg0, boolean arg1, int arg2, class63[] arg3, int arg4, int arg5, byte[] arg6) {
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 + var13 > 0 && arg4 + var13 < 103 && arg5 + var14 > 0 && arg5 + var14 < 103) {
                        arg3[var8].field1625[arg4 + var13][arg5 + var14] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        if (arg1) {
            this.field1292 = !this.field1292;
        }
        class14 var9 = new class14(-527, arg6);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    this.method434(var9, var10, arg0, arg2, arg5 + var12, arg4 + var11, 8, 0);
                }
            }
        }
    }

    @OriginalMember(owner = "PMCVBMMY", name = "a", descriptor = "(II)I")
    private static final int method422(int arg0, int arg1) {
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

    @OriginalMember(owner = "PMCVBMMY", name = "a", descriptor = "(IIIII)V")
    public final void method423(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != -5656) {
            return;
        }
        for (int var6 = arg4; var6 <= arg3 + arg4; var6++) {
            for (int var7 = arg0; var7 <= arg0 + arg2; var7++) {
                if (var7 >= 0 && var7 < this.field1289 && var6 >= 0 && var6 < this.field1290) {
                    this.field1298[0][var7][var6] = 127;
                    if (arg0 == var7 && var7 > 0) {
                        this.field1282[0][var7][var6] = this.field1282[0][var7 - 1][var6];
                    }
                    if (arg0 + arg2 == var7 && var7 < this.field1289 - 1) {
                        this.field1282[0][var7][var6] = this.field1282[0][var7 + 1][var6];
                    }
                    if (arg4 == var6 && var6 > 0) {
                        this.field1282[0][var7][var6] = this.field1282[0][var7][var6 - 1];
                    }
                    if (arg3 + arg4 == var6 && var6 < this.field1290 - 1) {
                        this.field1282[0][var7][var6] = this.field1282[0][var7][var6 + 1];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "PMCVBMMY", name = "a", descriptor = "(III)I")
    private final int method424(int arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "PMCVBMMY", name = "a", descriptor = "(ILLXDDKEZF;[[[IIILXBMRDXRN;IIIII)V")
    public static final void method425(int arg0, class27 arg1, int[][][] arg2, int arg3, int arg4, class63 arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = arg2[arg10][arg8][arg6];
        int var12 = arg2[arg10][arg8 + 1][arg6];
        int var13 = arg2[arg10][arg8 + 1][arg6 + 1];
        int var14 = arg2[arg10][arg8][arg6 + 1];
        int var15 = var11 + var12 + var13 + var14 >> 2;
        class28 var16 = class28.method365(arg3);
        int var17 = (arg3 << 14) + (arg6 << 7) + arg8 + 1073741824;
        int var18 = 98 / arg4;
        if (!var16.field1093) {
            var17 += Integer.MIN_VALUE;
        }
        byte var19 = (byte) ((arg0 << 6) + arg7);
        if (arg7 == 22) {
            class71 var20;
            if (var16.field1115 == -1 && var16.field1118 == null) {
                var20 = var16.method361(22, arg0, var11, var12, var13, var14, -1);
            } else {
                var20 = new class61(var13, arg3, true, var12, arg0, 0, var11, 22, var16.field1115, var14);
            }
            arg1.method315(var20, arg6, var15, false, arg8, var19, var17, arg9);
            if (var16.field1083 && var16.field1093) {
                arg5.method540(0, arg8, arg6);
            }
        } else if (arg7 == 10 || arg7 == 11) {
            class71 var40;
            if (var16.field1115 == -1 && var16.field1118 == null) {
                var40 = var16.method361(10, arg0, var11, var12, var13, var14, -1);
            } else {
                var40 = new class61(var13, arg3, true, var12, arg0, 0, var11, 10, var16.field1115, var14);
            }
            if (var40 != null) {
                int var41 = 0;
                if (arg7 == 11) {
                    var41 += 256;
                }
                int var42;
                int var43;
                if (arg0 == 1 || arg0 == 3) {
                    var42 = var16.field1125;
                    var43 = var16.field1131;
                } else {
                    var42 = var16.field1131;
                    var43 = var16.field1125;
                }
                arg1.method319(arg9, var17, var40, var43, 0, var42, var15, var19, arg6, arg8, var41);
            }
            if (var16.field1083) {
                arg5.method539(arg0, arg8, arg6, field1284, var16.field1131, var16.field1105, var16.field1125);
            }
        } else if (arg7 >= 12) {
            class71 var21;
            if (var16.field1115 == -1 && var16.field1118 == null) {
                var21 = var16.method361(arg7, arg0, var11, var12, var13, var14, -1);
            } else {
                var21 = new class61(var13, arg3, true, var12, arg0, 0, var11, arg7, var16.field1115, var14);
            }
            arg1.method319(arg9, var17, var21, 1, 0, 1, var15, var19, arg6, arg8, 0);
            if (var16.field1083) {
                arg5.method539(arg0, arg8, arg6, field1284, var16.field1131, var16.field1105, var16.field1125);
            }
        } else if (arg7 == 0) {
            class71 var22;
            if (var16.field1115 == -1 && var16.field1118 == null) {
                var22 = var16.method361(0, arg0, var11, var12, var13, var14, -1);
            } else {
                var22 = new class61(var13, arg3, true, var12, arg0, 0, var11, 0, var16.field1115, var14);
            }
            arg1.method317(field1297[arg0], null, arg6, var17, var22, var19, arg8, false, arg9, 0, var15);
            if (var16.field1083) {
                arg5.method538(arg8, var16.field1105, arg7, arg6, arg0, field1276);
            }
        } else if (arg7 == 1) {
            class71 var23;
            if (var16.field1115 == -1 && var16.field1118 == null) {
                var23 = var16.method361(1, arg0, var11, var12, var13, var14, -1);
            } else {
                var23 = new class61(var13, arg3, true, var12, arg0, 0, var11, 1, var16.field1115, var14);
            }
            arg1.method317(field1307[arg0], null, arg6, var17, var23, var19, arg8, false, arg9, 0, var15);
            if (var16.field1083) {
                arg5.method538(arg8, var16.field1105, arg7, arg6, arg0, field1276);
            }
        } else if (arg7 == 2) {
            int var24 = arg0 + 1 & 0x3;
            class71 var25;
            class71 var26;
            if (var16.field1115 == -1 && var16.field1118 == null) {
                var25 = var16.method361(2, arg0 + 4, var11, var12, var13, var14, -1);
                var26 = var16.method361(2, var24, var11, var12, var13, var14, -1);
            } else {
                var25 = new class61(var13, arg3, true, var12, arg0 + 4, 0, var11, 2, var16.field1115, var14);
                var26 = new class61(var13, arg3, true, var12, var24, 0, var11, 2, var16.field1115, var14);
            }
            arg1.method317(field1297[arg0], var26, arg6, var17, var25, var19, arg8, false, arg9, field1297[var24], var15);
            if (var16.field1083) {
                arg5.method538(arg8, var16.field1105, arg7, arg6, arg0, field1276);
            }
        } else if (arg7 == 3) {
            class71 var27;
            if (var16.field1115 == -1 && var16.field1118 == null) {
                var27 = var16.method361(3, arg0, var11, var12, var13, var14, -1);
            } else {
                var27 = new class61(var13, arg3, true, var12, arg0, 0, var11, 3, var16.field1115, var14);
            }
            arg1.method317(field1307[arg0], null, arg6, var17, var27, var19, arg8, false, arg9, 0, var15);
            if (var16.field1083) {
                arg5.method538(arg8, var16.field1105, arg7, arg6, arg0, field1276);
            }
        } else if (arg7 == 9) {
            class71 var28;
            if (var16.field1115 == -1 && var16.field1118 == null) {
                var28 = var16.method361(arg7, arg0, var11, var12, var13, var14, -1);
            } else {
                var28 = new class61(var13, arg3, true, var12, arg0, 0, var11, arg7, var16.field1115, var14);
            }
            arg1.method319(arg9, var17, var28, 1, 0, 1, var15, var19, arg6, arg8, 0);
            if (var16.field1083) {
                arg5.method539(arg0, arg8, arg6, field1284, var16.field1131, var16.field1105, var16.field1125);
            }
        } else {
            if (var16.field1096) {
                if (arg0 == 1) {
                    int var29 = var14;
                    var14 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var29;
                } else if (arg0 == 2) {
                    int var30 = var14;
                    var14 = var12;
                    var12 = var30;
                    int var31 = var13;
                    var13 = var11;
                    var11 = var31;
                } else if (arg0 == 3) {
                    int var32 = var14;
                    var14 = var11;
                    var11 = var12;
                    var12 = var13;
                    var13 = var32;
                }
            }
            if (arg7 == 4) {
                class71 var33;
                if (var16.field1115 == -1 && var16.field1118 == null) {
                    var33 = var16.method361(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var33 = new class61(var13, arg3, true, var12, 0, 0, var11, 4, var16.field1115, var14);
                }
                arg1.method318(field1305, 0, var33, arg9, field1297[arg0], var19, arg0 * 512, arg6, 0, var15, arg8, var17);
            } else if (arg7 == 5) {
                int var34 = 16;
                int var35 = arg1.method335(arg9, arg8, arg6);
                if (var35 > 0) {
                    var34 = class28.method365(var35 >> 14 & 0x7FFF).field1130;
                }
                class71 var36;
                if (var16.field1115 == -1 && var16.field1118 == null) {
                    var36 = var16.method361(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var36 = new class61(var13, arg3, true, var12, 0, 0, var11, 4, var16.field1115, var14);
                }
                arg1.method318(field1305, field1295[arg0] * var34, var36, arg9, field1297[arg0], var19, arg0 * 512, arg6, field1274[arg0] * var34, var15, arg8, var17);
            } else if (arg7 == 6) {
                class71 var37;
                if (var16.field1115 == -1 && var16.field1118 == null) {
                    var37 = var16.method361(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var37 = new class61(var13, arg3, true, var12, 0, 0, var11, 4, var16.field1115, var14);
                }
                arg1.method318(field1305, 0, var37, arg9, 256, var19, arg0, arg6, 0, var15, arg8, var17);
            } else if (arg7 == 7) {
                class71 var38;
                if (var16.field1115 == -1 && var16.field1118 == null) {
                    var38 = var16.method361(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var38 = new class61(var13, arg3, true, var12, 0, 0, var11, 4, var16.field1115, var14);
                }
                arg1.method318(field1305, 0, var38, arg9, 512, var19, arg0, arg6, 0, var15, arg8, var17);
            } else if (arg7 == 8) {
                class71 var39;
                if (var16.field1115 == -1 && var16.field1118 == null) {
                    var39 = var16.method361(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var39 = new class61(var13, arg3, true, var12, 0, 0, var11, 4, var16.field1115, var14);
                }
                arg1.method318(field1305, 0, var39, arg9, 768, var19, arg0, arg6, 0, var15, arg8, var17);
            }
        }
    }

    @OriginalMember(owner = "PMCVBMMY", name = "b", descriptor = "(III)Z")
    public static final boolean method426(int arg0, int arg1, int arg2) {
        class28 var3 = class28.method365(arg2);
        if (field1285 != arg0) {
            field1276 = 444;
        }
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var3.method367(arg1, field1275);
    }

    @OriginalMember(owner = "PMCVBMMY", name = "a", descriptor = "(IIII)I")
    private static final int method427(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class39.field1340[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @OriginalMember(owner = "PMCVBMMY", name = "b", descriptor = "(II)I")
    private final int method428(int arg0, int arg1) {
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

    @OriginalMember(owner = "PMCVBMMY", name = "c", descriptor = "(II)I")
    private static final int method429(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "PMCVBMMY", name = "a", descriptor = "(LXBMRDXRN;IIIIILLXDDKEZF;ZI)V")
    private final void method430(class63 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class27 arg6, boolean arg7, int arg8) {
        if (field1287 && (this.field1283[0][arg1][arg8] & 0x2) == 0) {
            if ((this.field1283[arg4][arg1][arg8] & 0x10) != 0) {
                return;
            }
            if (this.method433(arg1, arg4, true, arg8) != field1300) {
                return;
            }
        }
        if (arg4 < field1288) {
            field1288 = arg4;
        }
        int var10 = this.field1282[arg4][arg1][arg8];
        int var11 = this.field1282[arg4][arg1 + 1][arg8];
        int var12 = this.field1282[arg4][arg1 + 1][arg8 + 1];
        int var13 = this.field1282[arg4][arg1][arg8 + 1];
        int var14 = var10 + var11 + var12 + var13 >> 2;
        class28 var15 = class28.method365(arg2);
        if (arg7) {
            return;
        }
        int var16 = (arg2 << 14) + (arg8 << 7) + arg1 + 1073741824;
        if (!var15.field1093) {
            var16 += Integer.MIN_VALUE;
        }
        byte var17 = (byte) ((arg5 << 6) + arg3);
        if (arg3 == 22) {
            if (!field1287 || var15.field1093 || var15.field1082) {
                class71 var18;
                if (var15.field1115 == -1 && var15.field1118 == null) {
                    var18 = var15.method361(22, arg5, var10, var11, var12, var13, -1);
                } else {
                    var18 = new class61(var12, arg2, true, var11, arg5, 0, var10, 22, var15.field1115, var13);
                }
                arg6.method315(var18, arg8, var14, false, arg1, var17, var16, arg4);
                if (var15.field1083 && var15.field1093 && arg0 != null) {
                    arg0.method540(0, arg1, arg8);
                }
            }
        } else if (arg3 == 10 || arg3 == 11) {
            class71 var38;
            if (var15.field1115 == -1 && var15.field1118 == null) {
                var38 = var15.method361(10, arg5, var10, var11, var12, var13, -1);
            } else {
                var38 = new class61(var12, arg2, true, var11, arg5, 0, var10, 10, var15.field1115, var13);
            }
            if (var38 != null) {
                int var39 = 0;
                if (arg3 == 11) {
                    var39 += 256;
                }
                int var40;
                int var41;
                if (arg5 == 1 || arg5 == 3) {
                    var40 = var15.field1125;
                    var41 = var15.field1131;
                } else {
                    var40 = var15.field1131;
                    var41 = var15.field1125;
                }
                if (arg6.method319(arg4, var16, var38, var41, 0, var40, var14, var17, arg8, arg1, var39) && var15.field1106) {
                    class35 var42;
                    if (var38 instanceof class35) {
                        var42 = (class35) var38;
                    } else {
                        var42 = var15.method361(10, arg5, var10, var11, var12, var13, -1);
                    }
                    if (var42 != null) {
                        for (int var43 = 0; var43 <= var40; var43++) {
                            for (int var44 = 0; var44 <= var41; var44++) {
                                int var45 = var42.field1230 / 4;
                                if (var45 > 30) {
                                    var45 = 30;
                                }
                                if (var45 > this.field1298[arg4][arg1 + var43][arg8 + var44]) {
                                    this.field1298[arg4][arg1 + var43][arg8 + var44] = (byte) var45;
                                }
                            }
                        }
                    }
                }
            }
            if (var15.field1083 && arg0 != null) {
                arg0.method539(arg5, arg1, arg8, field1284, var15.field1131, var15.field1105, var15.field1125);
            }
        } else if (arg3 >= 12) {
            class71 var19;
            if (var15.field1115 == -1 && var15.field1118 == null) {
                var19 = var15.method361(arg3, arg5, var10, var11, var12, var13, -1);
            } else {
                var19 = new class61(var12, arg2, true, var11, arg5, 0, var10, arg3, var15.field1115, var13);
            }
            arg6.method319(arg4, var16, var19, 1, 0, 1, var14, var17, arg8, arg1, 0);
            if (arg3 >= 12 && arg3 <= 17 && arg3 != 13 && arg4 > 0) {
                this.field1309[arg4][arg1][arg8] |= 0x924;
            }
            if (var15.field1083 && arg0 != null) {
                arg0.method539(arg5, arg1, arg8, field1284, var15.field1131, var15.field1105, var15.field1125);
            }
        } else if (arg3 == 0) {
            class71 var20;
            if (var15.field1115 == -1 && var15.field1118 == null) {
                var20 = var15.method361(0, arg5, var10, var11, var12, var13, -1);
            } else {
                var20 = new class61(var12, arg2, true, var11, arg5, 0, var10, 0, var15.field1115, var13);
            }
            arg6.method317(field1297[arg5], null, arg8, var16, var20, var17, arg1, false, arg4, 0, var14);
            if (arg5 == 0) {
                if (var15.field1106) {
                    this.field1298[arg4][arg1][arg8] = 50;
                    this.field1298[arg4][arg1][arg8 + 1] = 50;
                }
                if (var15.field1119) {
                    this.field1309[arg4][arg1][arg8] |= 0x249;
                }
            } else if (arg5 == 1) {
                if (var15.field1106) {
                    this.field1298[arg4][arg1][arg8 + 1] = 50;
                    this.field1298[arg4][arg1 + 1][arg8 + 1] = 50;
                }
                if (var15.field1119) {
                    this.field1309[arg4][arg1][arg8 + 1] |= 0x492;
                }
            } else if (arg5 == 2) {
                if (var15.field1106) {
                    this.field1298[arg4][arg1 + 1][arg8] = 50;
                    this.field1298[arg4][arg1 + 1][arg8 + 1] = 50;
                }
                if (var15.field1119) {
                    this.field1309[arg4][arg1 + 1][arg8] |= 0x249;
                }
            } else if (arg5 == 3) {
                if (var15.field1106) {
                    this.field1298[arg4][arg1][arg8] = 50;
                    this.field1298[arg4][arg1 + 1][arg8] = 50;
                }
                if (var15.field1119) {
                    this.field1309[arg4][arg1][arg8] |= 0x492;
                }
            }
            if (var15.field1083 && arg0 != null) {
                arg0.method538(arg1, var15.field1105, arg3, arg8, arg5, field1276);
            }
            if (var15.field1130 != 16) {
                arg6.method325(var15.field1130, arg1, arg8, 479, arg4);
            }
        } else if (arg3 == 1) {
            class71 var21;
            if (var15.field1115 == -1 && var15.field1118 == null) {
                var21 = var15.method361(1, arg5, var10, var11, var12, var13, -1);
            } else {
                var21 = new class61(var12, arg2, true, var11, arg5, 0, var10, 1, var15.field1115, var13);
            }
            arg6.method317(field1307[arg5], null, arg8, var16, var21, var17, arg1, false, arg4, 0, var14);
            if (var15.field1106) {
                if (arg5 == 0) {
                    this.field1298[arg4][arg1][arg8 + 1] = 50;
                } else if (arg5 == 1) {
                    this.field1298[arg4][arg1 + 1][arg8 + 1] = 50;
                } else if (arg5 == 2) {
                    this.field1298[arg4][arg1 + 1][arg8] = 50;
                } else if (arg5 == 3) {
                    this.field1298[arg4][arg1][arg8] = 50;
                }
            }
            if (var15.field1083 && arg0 != null) {
                arg0.method538(arg1, var15.field1105, arg3, arg8, arg5, field1276);
            }
        } else if (arg3 == 2) {
            int var22 = arg5 + 1 & 0x3;
            class71 var23;
            class71 var24;
            if (var15.field1115 == -1 && var15.field1118 == null) {
                var23 = var15.method361(2, arg5 + 4, var10, var11, var12, var13, -1);
                var24 = var15.method361(2, var22, var10, var11, var12, var13, -1);
            } else {
                var23 = new class61(var12, arg2, true, var11, arg5 + 4, 0, var10, 2, var15.field1115, var13);
                var24 = new class61(var12, arg2, true, var11, var22, 0, var10, 2, var15.field1115, var13);
            }
            arg6.method317(field1297[arg5], var24, arg8, var16, var23, var17, arg1, false, arg4, field1297[var22], var14);
            if (var15.field1119) {
                if (arg5 == 0) {
                    this.field1309[arg4][arg1][arg8] |= 0x249;
                    this.field1309[arg4][arg1][arg8 + 1] |= 0x492;
                } else if (arg5 == 1) {
                    this.field1309[arg4][arg1][arg8 + 1] |= 0x492;
                    this.field1309[arg4][arg1 + 1][arg8] |= 0x249;
                } else if (arg5 == 2) {
                    this.field1309[arg4][arg1 + 1][arg8] |= 0x249;
                    this.field1309[arg4][arg1][arg8] |= 0x492;
                } else if (arg5 == 3) {
                    this.field1309[arg4][arg1][arg8] |= 0x492;
                    this.field1309[arg4][arg1][arg8] |= 0x249;
                }
            }
            if (var15.field1083 && arg0 != null) {
                arg0.method538(arg1, var15.field1105, arg3, arg8, arg5, field1276);
            }
            if (var15.field1130 != 16) {
                arg6.method325(var15.field1130, arg1, arg8, 479, arg4);
            }
        } else if (arg3 == 3) {
            class71 var25;
            if (var15.field1115 == -1 && var15.field1118 == null) {
                var25 = var15.method361(3, arg5, var10, var11, var12, var13, -1);
            } else {
                var25 = new class61(var12, arg2, true, var11, arg5, 0, var10, 3, var15.field1115, var13);
            }
            arg6.method317(field1307[arg5], null, arg8, var16, var25, var17, arg1, false, arg4, 0, var14);
            if (var15.field1106) {
                if (arg5 == 0) {
                    this.field1298[arg4][arg1][arg8 + 1] = 50;
                } else if (arg5 == 1) {
                    this.field1298[arg4][arg1 + 1][arg8 + 1] = 50;
                } else if (arg5 == 2) {
                    this.field1298[arg4][arg1 + 1][arg8] = 50;
                } else if (arg5 == 3) {
                    this.field1298[arg4][arg1][arg8] = 50;
                }
            }
            if (var15.field1083 && arg0 != null) {
                arg0.method538(arg1, var15.field1105, arg3, arg8, arg5, field1276);
            }
        } else if (arg3 == 9) {
            class71 var26;
            if (var15.field1115 == -1 && var15.field1118 == null) {
                var26 = var15.method361(arg3, arg5, var10, var11, var12, var13, -1);
            } else {
                var26 = new class61(var12, arg2, true, var11, arg5, 0, var10, arg3, var15.field1115, var13);
            }
            arg6.method319(arg4, var16, var26, 1, 0, 1, var14, var17, arg8, arg1, 0);
            if (var15.field1083 && arg0 != null) {
                arg0.method539(arg5, arg1, arg8, field1284, var15.field1131, var15.field1105, var15.field1125);
            }
        } else {
            if (var15.field1096) {
                if (arg5 == 1) {
                    int var27 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var10;
                    var10 = var27;
                } else if (arg5 == 2) {
                    int var28 = var13;
                    var13 = var11;
                    var11 = var28;
                    int var29 = var12;
                    var12 = var10;
                    var10 = var29;
                } else if (arg5 == 3) {
                    int var30 = var13;
                    var13 = var10;
                    var10 = var11;
                    var11 = var12;
                    var12 = var30;
                }
            }
            if (arg3 == 4) {
                class71 var31;
                if (var15.field1115 == -1 && var15.field1118 == null) {
                    var31 = var15.method361(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var31 = new class61(var12, arg2, true, var11, 0, 0, var10, 4, var15.field1115, var13);
                }
                arg6.method318(field1305, 0, var31, arg4, field1297[arg5], var17, arg5 * 512, arg8, 0, var14, arg1, var16);
            } else if (arg3 == 5) {
                int var32 = 16;
                int var33 = arg6.method335(arg4, arg1, arg8);
                if (var33 > 0) {
                    var32 = class28.method365(var33 >> 14 & 0x7FFF).field1130;
                }
                class71 var34;
                if (var15.field1115 == -1 && var15.field1118 == null) {
                    var34 = var15.method361(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var34 = new class61(var12, arg2, true, var11, 0, 0, var10, 4, var15.field1115, var13);
                }
                arg6.method318(field1305, field1295[arg5] * var32, var34, arg4, field1297[arg5], var17, arg5 * 512, arg8, field1274[arg5] * var32, var14, arg1, var16);
            } else if (arg3 == 6) {
                class71 var35;
                if (var15.field1115 == -1 && var15.field1118 == null) {
                    var35 = var15.method361(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var35 = new class61(var12, arg2, true, var11, 0, 0, var10, 4, var15.field1115, var13);
                }
                arg6.method318(field1305, 0, var35, arg4, 256, var17, arg5, arg8, 0, var14, arg1, var16);
            } else if (arg3 == 7) {
                class71 var36;
                if (var15.field1115 == -1 && var15.field1118 == null) {
                    var36 = var15.method361(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var36 = new class61(var12, arg2, true, var11, 0, 0, var10, 4, var15.field1115, var13);
                }
                arg6.method318(field1305, 0, var36, arg4, 512, var17, arg5, arg8, 0, var14, arg1, var16);
            } else if (arg3 == 8) {
                class71 var37;
                if (var15.field1115 == -1 && var15.field1118 == null) {
                    var37 = var15.method361(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var37 = new class61(var12, arg2, true, var11, 0, 0, var10, 4, var15.field1115, var13);
                }
                arg6.method318(field1305, 0, var37, arg4, 768, var17, arg5, arg8, 0, var14, arg1, var16);
            }
        }
    }

    @OriginalMember(owner = "PMCVBMMY", name = "<init>", descriptor = "([[[BI[[[III)V")
    public class36(byte[][][] arg0, int arg1, int[][][] arg2, int arg3, int arg4) {
        field1288 = 99;
        this.field1289 = arg3;
        this.field1290 = arg4;
        this.field1282 = arg2;
        this.field1283 = arg0;
        this.field1299 = new byte[4][this.field1289][this.field1290];
        this.field1303 = new byte[4][this.field1289][this.field1290];
        this.field1304 = new byte[4][this.field1289][this.field1290];
        this.field1286 = new byte[4][this.field1289][this.field1290];
        this.field1309 = new int[4][this.field1289 + 1][this.field1290 + 1];
        this.field1298 = new byte[4][this.field1289 + 1][this.field1290 + 1];
        this.field1293 = new int[this.field1289 + 1][this.field1290 + 1];
        this.field1277 = new int[this.field1290];
        this.field1278 = new int[this.field1290];
        this.field1279 = new int[this.field1290];
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        this.field1280 = new int[this.field1290];
        this.field1281 = new int[this.field1290];
    }

    @OriginalMember(owner = "PMCVBMMY", name = "c", descriptor = "(III)I")
    private static final int method431(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method437(var3, var5);
        int var8 = method437(var3 + 1, var5);
        int var9 = method437(var3, var5 + 1);
        int var10 = method437(var3 + 1, var5 + 1);
        int var11 = method427(var7, var8, var4, arg2);
        int var12 = method427(var9, var10, var4, arg2);
        return method427(var11, var12, var6, arg2);
    }

    @OriginalMember(owner = "PMCVBMMY", name = "d", descriptor = "(II)I")
    private static final int method432(int arg0, int arg1) {
        int var2 = method431(arg0 + 45365, arg1 + 91923, 4) + (method431(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method431(arg0, arg1, 1) - 128 >> 2) - 128;
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @OriginalMember(owner = "PMCVBMMY", name = "a", descriptor = "(IIZI)I")
    public int method433(int arg0, int arg1, boolean arg2, int arg3) {
        if (!arg2) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if ((this.field1283[arg1][arg0][arg3] & 0x8) == 0) {
            return arg1 <= 0 || (this.field1283[1][arg0][arg3] & 0x2) == 0 ? arg1 : arg1 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "PMCVBMMY", name = "a", descriptor = "(LGHHPHSRU;IIIIIII)V")
    private final void method434(class14 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != 8) {
            return;
        }
        if (arg5 < 0 || arg5 >= 104 || arg4 < 0 || arg4 >= 104) {
            while (true) {
                int var11 = arg0.method202();
                if (var11 == 0) {
                    return;
                }
                if (var11 == 1) {
                    arg0.method202();
                    return;
                }
                if (var11 <= 49) {
                    arg0.method202();
                }
            }
        }
        this.field1283[arg1][arg5][arg4] = 0;
        while (true) {
            int var9 = arg0.method202();
            if (var9 == 0) {
                if (arg1 == 0) {
                    this.field1282[0][arg5][arg4] = -method432(arg5 + arg3 + 932731, arg4 + 556238 + arg2) * 8;
                    return;
                } else {
                    this.field1282[arg1][arg5][arg4] = this.field1282[arg1 - 1][arg5][arg4] - 240;
                    return;
                }
            }
            if (var9 == 1) {
                int var10 = arg0.method202();
                if (var10 == 1) {
                    var10 = 0;
                }
                if (arg1 == 0) {
                    this.field1282[0][arg5][arg4] = -var10 * 8;
                    return;
                }
                this.field1282[arg1][arg5][arg4] = this.field1282[arg1 - 1][arg5][arg4] - var10 * 8;
                return;
            }
            if (var9 <= 49) {
                this.field1303[arg1][arg5][arg4] = arg0.method203();
                this.field1304[arg1][arg5][arg4] = (byte) ((var9 - 2) / 4);
                this.field1286[arg1][arg5][arg4] = (byte) (var9 + arg7 - 2 & 0x3);
            } else if (var9 <= 81) {
                this.field1283[arg1][arg5][arg4] = (byte) (var9 - 49);
            } else {
                this.field1299[arg1][arg5][arg4] = (byte) (var9 - 81);
            }
        }
    }

    @OriginalMember(owner = "PMCVBMMY", name = "a", descriptor = "(I[BZI)Z")
    public static final boolean method435(int arg0, byte[] arg1, boolean arg2, int arg3) {
        boolean var4 = true;
        if (!arg2) {
            field1273 = !field1273;
        }
        class14 var5 = new class14(-527, arg1);
        int var6 = -1;
        label59: while (true) {
            int var7 = var5.method216();
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method216();
                    if (var11 == 0) {
                        continue label59;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = var5.method202() >> 2;
                    int var15 = arg3 + var13;
                    int var16 = arg0 + var12;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        class28 var17 = class28.method365(var6);
                        if (var14 != 22 || !field1287 || var17.field1093 || var17.field1082) {
                            var4 &= var17.method362(field1291);
                            var9 = true;
                        }
                    }
                }
                int var10 = var5.method216();
                if (var10 == 0) {
                    break;
                }
                var5.method202();
            }
        }
    }

    @OriginalMember(owner = "PMCVBMMY", name = "a", descriptor = "(ZLXZFDFADG;LGHHPHSRU;)V")
    public static final void method436(boolean arg0, class67 arg1, class14 arg2) {
        if (!arg0) {
            field1294 = !field1294;
        }
        int var3 = -1;
        while (true) {
            int var4 = arg2.method216();
            if (var4 == 0) {
                return;
            }
            var3 += var4;
            class28 var5 = class28.method365(var3);
            var5.method360(arg1, true);
            while (true) {
                int var6 = arg2.method216();
                if (var6 == 0) {
                    break;
                }
                arg2.method202();
            }
        }
    }

    @OriginalMember(owner = "PMCVBMMY", name = "e", descriptor = "(II)I")
    private static final int method437(int arg0, int arg1) {
        int var2 = method429(arg0 - 1, arg1 - 1) + method429(arg0 + 1, arg1 - 1) + method429(arg0 - 1, arg1 + 1) + method429(arg0 + 1, arg1 + 1);
        int var3 = method429(arg0 - 1, arg1) + method429(arg0 + 1, arg1) + method429(arg0, arg1 - 1) + method429(arg0, arg1 + 1);
        int var4 = method429(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }
}
