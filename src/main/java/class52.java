import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("RRREBNUU")
public class class52 {

    @OriginalMember(owner = "RRREBNUU", name = "u", descriptor = "Z")
    private boolean field1363 = true;

    @OriginalMember(owner = "RRREBNUU", name = "x", descriptor = "Z")
    private boolean field1366 = true;

    @OriginalMember(owner = "RRREBNUU", name = "e", descriptor = "I")
    private int field1347;

    @OriginalMember(owner = "RRREBNUU", name = "f", descriptor = "I")
    private int field1348;

    @OriginalMember(owner = "RRREBNUU", name = "k", descriptor = "[[[I")
    private int[][][] field1353;

    @OriginalMember(owner = "RRREBNUU", name = "s", descriptor = "[[[B")
    private byte[][][] field1361;

    @OriginalMember(owner = "RRREBNUU", name = "B", descriptor = "[[[B")
    private byte[][][] field1370;

    @OriginalMember(owner = "RRREBNUU", name = "j", descriptor = "[[[B")
    private byte[][][] field1352;

    @OriginalMember(owner = "RRREBNUU", name = "D", descriptor = "[[[B")
    private byte[][][] field1372;

    @OriginalMember(owner = "RRREBNUU", name = "C", descriptor = "[[[B")
    private byte[][][] field1371;

    @OriginalMember(owner = "RRREBNUU", name = "w", descriptor = "[[[I")
    private int[][][] field1365;

    @OriginalMember(owner = "RRREBNUU", name = "y", descriptor = "[[[B")
    private byte[][][] field1367;

    @OriginalMember(owner = "RRREBNUU", name = "b", descriptor = "[[I")
    private int[][] field1344;

    @OriginalMember(owner = "RRREBNUU", name = "l", descriptor = "[I")
    private int[] field1354;

    @OriginalMember(owner = "RRREBNUU", name = "m", descriptor = "[I")
    private int[] field1355;

    @OriginalMember(owner = "RRREBNUU", name = "n", descriptor = "[I")
    private int[] field1356;

    @OriginalMember(owner = "RRREBNUU", name = "o", descriptor = "[I")
    private int[] field1357;

    @OriginalMember(owner = "RRREBNUU", name = "p", descriptor = "[I")
    private int[] field1358;

    @OriginalMember(owner = "RRREBNUU", name = "a", descriptor = "Z")
    public static boolean field1343 = true;

    @OriginalMember(owner = "RRREBNUU", name = "c", descriptor = "[I")
    private static final int[] field1345 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "RRREBNUU", name = "h", descriptor = "[I")
    private static final int[] field1350 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "RRREBNUU", name = "i", descriptor = "[I")
    private static final int[] field1351 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "RRREBNUU", name = "q", descriptor = "I")
    private static int field1359 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "RRREBNUU", name = "t", descriptor = "I")
    private static int field1362 = 1;

    @OriginalMember(owner = "RRREBNUU", name = "v", descriptor = "I")
    private static int field1364 = 916;

    @OriginalMember(owner = "RRREBNUU", name = "z", descriptor = "I")
    private static int field1368 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "RRREBNUU", name = "A", descriptor = "[I")
    private static final int[] field1369 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "RRREBNUU", name = "d", descriptor = "I")
    private static int field1346;

    @OriginalMember(owner = "RRREBNUU", name = "g", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "RRREBNUU", name = "r", descriptor = "I")
    private int field1360;

    @OriginalMember(owner = "RRREBNUU", name = "a", descriptor = "(III)Z")
    public static final boolean method432(int arg0, int arg1, int arg2) {
        if (arg1 <= 0) {
            throw new NullPointerException();
        }
        class63 var3 = class63.method501(arg2);
        if (arg0 == 11) {
            arg0 = 10;
        }
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        return var3.method497(false, arg0);
    }

    @OriginalMember(owner = "RRREBNUU", name = "a", descriptor = "(III[BILXRAHVOIV;Z[LUTWNPFGW;III)V")
    public final void method433(int arg0, int arg1, int arg2, byte[] arg3, int arg4, class67 arg5, boolean arg6, class62[] arg7, int arg8, int arg9, int arg10) {
        if (!arg6) {
            return;
        }
        class29 var12 = new class29((byte) -28, arg3);
        int var13 = -1;
        while (true) {
            int var14 = var12.method322();
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method322();
                if (var16 == 0) {
                    break;
                }
                var15 += var16 - 1;
                int var17 = var15 & 0x3F;
                int var18 = var15 >> 6 & 0x3F;
                int var19 = var15 >> 12;
                int var20 = var12.method308();
                int var21 = var20 >> 2;
                int var22 = var20 & 0x3;
                if (arg2 == var19 && var18 >= arg4 && var18 < arg4 + 8 && var17 >= arg1 && var17 < arg1 + 8) {
                    class63 var23 = class63.method501(var13);
                    int var24 = arg0 + class1.method3(false, var18 & 0x7, arg9, var23.field1506, var17 & 0x7, var23.field1541);
                    int var25 = arg8 + class1.method4(var23.field1506, 0, var23.field1541, var17 & 0x7, arg9, var18 & 0x7);
                    if (var24 > 0 && var25 > 0 && var24 < 103 && var25 < 103) {
                        int var26 = var19;
                        if ((this.field1361[1][var24][var25] & 0x2) == 2) {
                            var26 = var19 - 1;
                        }
                        class62 var27 = null;
                        if (var26 >= 0) {
                            var27 = arg7[var26];
                        }
                        this.method444(var19, var21, var24, var27, var13, arg9 + var22 & 0x3, arg5, (byte) 121, var25);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "RRREBNUU", name = "b", descriptor = "(III)I")
    private final int method434(int arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "RRREBNUU", name = "a", descriptor = "(I[BIIIIIII)V")
    public final void method435(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class29 var10 = new class29((byte) -28, arg1);
        for (int var11 = 0; var11 < 4; var11++) {
            for (int var12 = 0; var12 < 64; var12++) {
                for (int var13 = 0; var13 < 64; var13++) {
                    if (arg7 == var11 && var12 >= arg0 && var12 < arg0 + 8 && var13 >= arg8 && var13 < arg8 + 8) {
                        this.method446(arg3, arg5, arg4 + class1.method2(this.field1360, var12 & 0x7, var13 & 0x7, arg3), var10, (byte) -126, 0, arg2 + class1.method1(-937, var12 & 0x7, arg3, var13 & 0x7), 0);
                    } else {
                        this.method446(0, 0, -1, var10, (byte) -126, 0, -1, 0);
                    }
                }
            }
        }
        if (arg6 != 26170) {
            this.field1360 = 401;
        }
    }

    @OriginalMember(owner = "RRREBNUU", name = "a", descriptor = "(I[LUTWNPFGW;LXRAHVOIV;)V")
    public final void method436(int arg0, class62[] arg1, class67 arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((this.field1361[var4][var110][var111] & 0x1) == 1) {
                        int var112 = var4;
                        if ((this.field1361[1][var110][var111] & 0x2) == 2) {
                            var112 = var4 - 1;
                        }
                        if (var112 >= 0) {
                            arg1[var112].method487(var110, var111, 9);
                        }
                    }
                }
            }
        }
        field1359 += (int) (Math.random() * 5.0D) - 2;
        if (arg0 != 0) {
            return;
        }
        if (field1359 < -8) {
            field1359 = -8;
        }
        if (field1359 > 8) {
            field1359 = 8;
        }
        field1368 += (int) (Math.random() * 5.0D) - 2;
        if (field1368 < -16) {
            field1368 = -16;
        }
        if (field1368 > 16) {
            field1368 = 16;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            byte[][] var48 = this.field1367[var5];
            byte var49 = 96;
            short var50 = 768;
            byte var51 = -50;
            byte var52 = -10;
            byte var53 = -50;
            int var54 = (int) Math.sqrt((double) (var53 * var53 + var51 * var51 + var52 * var52));
            int var55 = var50 * var54 >> 8;
            for (int var56 = 1; var56 < this.field1348 - 1; var56++) {
                for (int var101 = 1; var101 < this.field1347 - 1; var101++) {
                    int var102 = this.field1353[var5][var101 + 1][var56] - this.field1353[var5][var101 - 1][var56];
                    int var103 = this.field1353[var5][var101][var56 + 1] - this.field1353[var5][var101][var56 - 1];
                    int var104 = (int) Math.sqrt((double) (var103 * var103 + var102 * var102 + 65536));
                    int var105 = (var102 << 8) / var104;
                    int var106 = 65536 / var104;
                    int var107 = (var103 << 8) / var104;
                    int var108 = (var53 * var107 + var51 * var105 + var52 * var106) / var55 + var49;
                    int var109 = (var48[var101][var56] >> 1) + (var48[var101][var56 + 1] >> 3) + (var48[var101][var56 - 1] >> 2) + (var48[var101 - 1][var56] >> 2) + (var48[var101 + 1][var56] >> 3);
                    this.field1344[var101][var56] = var108 - var109;
                }
            }
            for (int var57 = 0; var57 < this.field1348; var57++) {
                this.field1354[var57] = 0;
                this.field1355[var57] = 0;
                this.field1356[var57] = 0;
                this.field1357[var57] = 0;
                this.field1358[var57] = 0;
            }
            for (int var58 = -5; var58 < this.field1347 + 5; var58++) {
                for (int var61 = 0; var61 < this.field1348; var61++) {
                    int var95 = var58 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < this.field1347) {
                        int var96 = this.field1370[var5][var95][var61] & 0xFF;
                        if (var96 > 0) {
                            class56 var97 = class56.field1412[var96 - 1];
                            this.field1354[var61] += var97.field1421;
                            this.field1355[var61] += var97.field1419;
                            this.field1356[var61] += var97.field1420;
                            this.field1357[var61] += var97.field1422;
                            var10002 = this.field1358[var61]++;
                        }
                    }
                    int var98 = var58 - 5;
                    if (var98 >= 0 && var98 < this.field1347) {
                        int var99 = this.field1370[var5][var98][var61] & 0xFF;
                        if (var99 > 0) {
                            class56 var100 = class56.field1412[var99 - 1];
                            this.field1354[var61] -= var100.field1421;
                            this.field1355[var61] -= var100.field1419;
                            this.field1356[var61] -= var100.field1420;
                            this.field1357[var61] -= var100.field1422;
                            var10002 = this.field1358[var61]--;
                        }
                    }
                }
                if (var58 >= 1 && var58 < this.field1347 - 1) {
                    int var62 = 0;
                    int var63 = 0;
                    int var64 = 0;
                    int var65 = 0;
                    int var66 = 0;
                    for (int var67 = -5; var67 < this.field1348 + 5; var67++) {
                        int var68 = var67 + 5;
                        if (var68 >= 0 && var68 < this.field1348) {
                            var62 += this.field1354[var68];
                            var63 += this.field1355[var68];
                            var64 += this.field1356[var68];
                            var65 += this.field1357[var68];
                            var66 += this.field1358[var68];
                        }
                        int var69 = var67 - 5;
                        if (var69 >= 0 && var69 < this.field1348) {
                            var62 -= this.field1354[var69];
                            var63 -= this.field1355[var69];
                            var64 -= this.field1356[var69];
                            var65 -= this.field1357[var69];
                            var66 -= this.field1358[var69];
                        }
                        if (var67 >= 1 && var67 < this.field1348 - 1 && (!field1343 || (this.field1361[var5][var58][var67] & 0x10) == 0 && this.method449(var5, var67, 0, var58) == field1349)) {
                            int var70 = this.field1370[var5][var58][var67] & 0xFF;
                            int var71 = this.field1352[var5][var58][var67] & 0xFF;
                            if (var70 > 0 || var71 > 0) {
                                int var72 = this.field1353[var5][var58][var67];
                                int var73 = this.field1353[var5][var58 + 1][var67];
                                int var74 = this.field1353[var5][var58 + 1][var67 + 1];
                                int var75 = this.field1353[var5][var58][var67 + 1];
                                int var76 = this.field1344[var58][var67];
                                int var77 = this.field1344[var58 + 1][var67];
                                int var78 = this.field1344[var58 + 1][var67 + 1];
                                int var79 = this.field1344[var58][var67 + 1];
                                int var80 = -1;
                                int var81 = -1;
                                if (var70 > 0) {
                                    int var82 = var62 * 256 / var65;
                                    int var83 = var63 / var66;
                                    int var84 = var64 / var66;
                                    var80 = this.method434(var82, var83, var84);
                                    int var85 = field1359 + var82 & 0xFF;
                                    int var86 = field1368 + var84;
                                    if (var86 < 0) {
                                        var86 = 0;
                                    } else if (var86 > 255) {
                                        var86 = 255;
                                    }
                                    var81 = this.method434(var85, var83, var86);
                                }
                                if (var5 > 0) {
                                    boolean var87 = true;
                                    if (var70 == 0 && this.field1372[var5][var58][var67] != 0) {
                                        var87 = false;
                                    }
                                    if (var71 > 0 && !class56.field1412[var71 - 1].field1417) {
                                        var87 = false;
                                    }
                                    if (var87 && var72 == var73 && var72 == var74 && var72 == var75) {
                                        this.field1365[var5][var58][var67] |= 0x924;
                                    }
                                }
                                int var88 = 0;
                                if (var80 != -1) {
                                    var88 = class12.field718[method439(var81, 96)];
                                }
                                if (var71 == 0) {
                                    arg2.method532(var5, var58, var67, 0, 0, -1, var72, var73, var74, var75, method439(var80, var76), method439(var80, var77), method439(var80, var78), method439(var80, var79), 0, 0, 0, 0, var88, 0);
                                } else {
                                    int var89 = this.field1372[var5][var58][var67] + 1;
                                    byte var90 = this.field1371[var5][var58][var67];
                                    class56 var91 = class56.field1412[var71 - 1];
                                    int var92 = var91.field1415;
                                    int var93;
                                    int var94;
                                    if (var92 >= 0) {
                                        var93 = class12.method223(0, var92);
                                        var94 = -1;
                                    } else if (var91.field1414 == 16711935) {
                                        var93 = 0;
                                        var94 = -2;
                                        var92 = -1;
                                    } else {
                                        var94 = this.method434(var91.field1418, var91.field1419, var91.field1420);
                                        var93 = class12.field718[this.method440(var91.field1423, 96)];
                                    }
                                    arg2.method532(var5, var58, var67, var89, var90, var92, var72, var73, var74, var75, method439(var80, var76), method439(var80, var77), method439(var80, var78), method439(var80, var79), this.method440(var94, var76), this.method440(var94, var77), this.method440(var94, var78), this.method440(var94, var79), var88, var93);
                                }
                            }
                        }
                    }
                }
            }
            for (int var59 = 1; var59 < this.field1348 - 1; var59++) {
                for (int var60 = 1; var60 < this.field1347 - 1; var60++) {
                    arg2.method531(var5, var60, var59, this.method449(var5, var59, 0, var60));
                }
            }
        }
        arg2.method558(-10, -50, -50, (byte) 5, 768, 64);
        for (int var6 = 0; var6 < this.field1347; var6++) {
            for (int var47 = 0; var47 < this.field1348; var47++) {
                if ((this.field1361[1][var6][var47] & 0x2) == 2) {
                    arg2.method529(var47, 38779, var6);
                }
            }
        }
        int var7 = 1;
        int var8 = 2;
        int var9 = 4;
        for (int var10 = 0; var10 < 4; var10++) {
            if (var10 > 0) {
                var7 <<= 0x3;
                var8 <<= 0x3;
                var9 <<= 0x3;
            }
            for (int var11 = 0; var11 <= var10; var11++) {
                for (int var12 = 0; var12 <= this.field1348; var12++) {
                    for (int var13 = 0; var13 <= this.field1347; var13++) {
                        if ((this.field1365[var11][var13][var12] & var7) != 0) {
                            int var14 = var12;
                            int var15 = var12;
                            int var16 = var11;
                            int var17 = var11;
                            while (var14 > 0 && (this.field1365[var11][var13][var14 - 1] & var7) != 0) {
                                var14--;
                            }
                            while (var15 < this.field1348 && (this.field1365[var11][var13][var15 + 1] & var7) != 0) {
                                var15++;
                            }
                            label326: while (var16 > 0) {
                                for (int var18 = var14; var18 <= var15; var18++) {
                                    if ((this.field1365[var16 - 1][var13][var18] & var7) == 0) {
                                        break label326;
                                    }
                                }
                                var16--;
                            }
                            label315: while (var17 < var10) {
                                for (int var19 = var14; var19 <= var15; var19++) {
                                    if ((this.field1365[var17 + 1][var13][var19] & var7) == 0) {
                                        break label315;
                                    }
                                }
                                var17++;
                            }
                            int var20 = (var17 + 1 - var16) * (var15 - var14 + 1);
                            if (var20 >= 8) {
                                short var21 = 240;
                                int var22 = this.field1353[var17][var13][var14] - var21;
                                int var23 = this.field1353[var16][var13][var14];
                                class67.method530(var13 * 128, var14 * 128, var13 * 128, var23, var15 * 128 + 128, var10, var22, 1, 28703);
                                for (int var24 = var16; var24 <= var17; var24++) {
                                    for (int var25 = var14; var25 <= var15; var25++) {
                                        this.field1365[var24][var13][var25] &= ~var7;
                                    }
                                }
                            }
                        }
                        if ((this.field1365[var11][var13][var12] & var8) != 0) {
                            int var26 = var13;
                            int var27 = var13;
                            int var28 = var11;
                            int var29 = var11;
                            while (var26 > 0 && (this.field1365[var11][var26 - 1][var12] & var8) != 0) {
                                var26--;
                            }
                            while (var27 < this.field1347 && (this.field1365[var11][var27 + 1][var12] & var8) != 0) {
                                var27++;
                            }
                            label379: while (var28 > 0) {
                                for (int var30 = var26; var30 <= var27; var30++) {
                                    if ((this.field1365[var28 - 1][var30][var12] & var8) == 0) {
                                        break label379;
                                    }
                                }
                                var28--;
                            }
                            label368: while (var29 < var10) {
                                for (int var31 = var26; var31 <= var27; var31++) {
                                    if ((this.field1365[var29 + 1][var31][var12] & var8) == 0) {
                                        break label368;
                                    }
                                }
                                var29++;
                            }
                            int var32 = (var29 + 1 - var28) * (var27 - var26 + 1);
                            if (var32 >= 8) {
                                short var33 = 240;
                                int var34 = this.field1353[var29][var26][var12] - var33;
                                int var35 = this.field1353[var28][var26][var12];
                                class67.method530(var26 * 128, var12 * 128, var27 * 128 + 128, var35, var12 * 128, var10, var34, 2, 28703);
                                for (int var36 = var28; var36 <= var29; var36++) {
                                    for (int var37 = var26; var37 <= var27; var37++) {
                                        this.field1365[var36][var37][var12] &= ~var8;
                                    }
                                }
                            }
                        }
                        if ((this.field1365[var11][var13][var12] & var9) != 0) {
                            int var38 = var13;
                            int var39 = var13;
                            int var40 = var12;
                            int var41 = var12;
                            while (var40 > 0 && (this.field1365[var11][var13][var40 - 1] & var9) != 0) {
                                var40--;
                            }
                            while (var41 < this.field1348 && (this.field1365[var11][var13][var41 + 1] & var9) != 0) {
                                var41++;
                            }
                            label432: while (var38 > 0) {
                                for (int var42 = var40; var42 <= var41; var42++) {
                                    if ((this.field1365[var11][var38 - 1][var42] & var9) == 0) {
                                        break label432;
                                    }
                                }
                                var38--;
                            }
                            label421: while (var39 < this.field1347) {
                                for (int var43 = var40; var43 <= var41; var43++) {
                                    if ((this.field1365[var11][var39 + 1][var43] & var9) == 0) {
                                        break label421;
                                    }
                                }
                                var39++;
                            }
                            if ((var39 + 1 - var38) * (var41 - var40 + 1) >= 4) {
                                int var44 = this.field1353[var11][var38][var40];
                                class67.method530(var38 * 128, var40 * 128, var39 * 128 + 128, var44, var41 * 128 + 128, var10, var44, 4, 28703);
                                for (int var45 = var38; var45 <= var39; var45++) {
                                    for (int var46 = var40; var46 <= var41; var46++) {
                                        this.field1365[var11][var45][var46] &= ~var9;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "RRREBNUU", name = "a", descriptor = "(LCXHZUTUD;BLINLHDAGO;)V")
    public static final void method437(class9 arg0, byte arg1, class29 arg2) {
        int var3 = -1;
        if (arg1 != -112) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        while (true) {
            int var5 = arg2.method322();
            if (var5 == 0) {
                return;
            }
            var3 += var5;
            class63 var6 = class63.method501(var3);
            var6.method502((byte) 77, arg0);
            while (true) {
                int var7 = arg2.method322();
                if (var7 == 0) {
                    break;
                }
                arg2.method308();
            }
        }
    }

    @OriginalMember(owner = "RRREBNUU", name = "a", descriptor = "(III[BII)V")
    public final void method438(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        if (arg4 != 4) {
            return;
        }
        class29 var7 = new class29((byte) -28, arg3);
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 64; var9++) {
                for (int var10 = 0; var10 < 64; var10++) {
                    this.method446(0, var8, arg5 + var10, var7, (byte) -126, arg1, arg2 + var9, arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "RRREBNUU", name = "a", descriptor = "(II)I")
    private static final int method439(int arg0, int arg1) {
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

    @OriginalMember(owner = "RRREBNUU", name = "b", descriptor = "(II)I")
    private final int method440(int arg0, int arg1) {
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

    @OriginalMember(owner = "RRREBNUU", name = "c", descriptor = "(II)I")
    private static final int method441(int arg0, int arg1) {
        int var2 = method451(arg0 + 45365, arg1 + 91923, 4) + (method451(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method451(arg0, arg1, 1) - 128 >> 2) - 128;
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @OriginalMember(owner = "RRREBNUU", name = "a", descriptor = "(I[BII)Z")
    public static final boolean method442(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg2 != 49616) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        boolean var5 = true;
        class29 var6 = new class29((byte) -28, arg1);
        int var7 = -1;
        label55: while (true) {
            int var8 = var6.method322();
            if (var8 == 0) {
                return var5;
            }
            var7 += var8;
            int var9 = 0;
            boolean var10 = false;
            while (true) {
                while (!var10) {
                    int var12 = var6.method322();
                    if (var12 == 0) {
                        continue label55;
                    }
                    var9 += var12 - 1;
                    int var13 = var9 & 0x3F;
                    int var14 = var9 >> 6 & 0x3F;
                    int var15 = var6.method308() >> 2;
                    int var16 = arg0 + var14;
                    int var17 = arg3 + var13;
                    if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                        class63 var18 = class63.method501(var7);
                        if (var15 != 22 || !field1343 || var18.field1525 || var18.field1513) {
                            var5 &= var18.method498(0);
                            var10 = true;
                        }
                    }
                }
                int var11 = var6.method322();
                if (var11 == 0) {
                    break;
                }
                var6.method308();
            }
        }
    }

    @OriginalMember(owner = "RRREBNUU", name = "d", descriptor = "(II)I")
    private static final int method443(int arg0, int arg1) {
        int var2 = method445(arg0 - 1, arg1 - 1) + method445(arg0 + 1, arg1 - 1) + method445(arg0 - 1, arg1 + 1) + method445(arg0 + 1, arg1 + 1);
        int var3 = method445(arg0 - 1, arg1) + method445(arg0 + 1, arg1) + method445(arg0, arg1 - 1) + method445(arg0, arg1 + 1);
        int var4 = method445(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @OriginalMember(owner = "RRREBNUU", name = "a", descriptor = "(IIILUTWNPFGW;IILXRAHVOIV;BI)V")
    private final void method444(int arg0, int arg1, int arg2, class62 arg3, int arg4, int arg5, class67 arg6, byte arg7, int arg8) {
        if (field1343) {
            if ((this.field1361[arg0][arg2][arg8] & 0x10) != 0) {
                return;
            }
            if (this.method449(arg0, arg8, 0, arg2) != field1349) {
                return;
            }
        }
        int var10 = this.field1353[arg0][arg2][arg8];
        int var11 = this.field1353[arg0][arg2 + 1][arg8];
        if (arg7 != 121) {
            this.field1366 = !this.field1366;
        }
        int var12 = this.field1353[arg0][arg2 + 1][arg8 + 1];
        int var13 = this.field1353[arg0][arg2][arg8 + 1];
        int var14 = var10 + var11 + var12 + var13 >> 2;
        class63 var15 = class63.method501(arg4);
        int var16 = (arg4 << 14) + (arg8 << 7) + arg2 + 1073741824;
        if (!var15.field1525) {
            var16 += Integer.MIN_VALUE;
        }
        byte var17 = (byte) ((arg5 << 6) + arg1);
        if (arg1 == 22) {
            if (!field1343 || var15.field1525 || var15.field1513) {
                class18 var18;
                if (var15.field1537 == -1 && var15.field1554 == null) {
                    var18 = var15.method506(22, arg5, var10, var11, var12, var13, -1);
                } else {
                    var18 = new class25(true, var11, arg4, var13, var15.field1537, var12, arg5, 22, var10, 0);
                }
                arg6.method533(field1364, var14, var17, arg2, arg8, arg0, var18, var16);
                if (var15.field1518 && var15.field1525 && arg3 != null) {
                    arg3.method487(arg2, arg8, 9);
                }
            }
        } else if (arg1 == 10 || arg1 == 11) {
            class18 var38;
            if (var15.field1537 == -1 && var15.field1554 == null) {
                var38 = var15.method506(10, arg5, var10, var11, var12, var13, -1);
            } else {
                var38 = new class25(true, var11, arg4, var13, var15.field1537, var12, arg5, 10, var10, 0);
            }
            if (var38 != null) {
                int var39 = 0;
                if (arg1 == 11) {
                    var39 += 256;
                }
                int var40;
                int var41;
                if (arg5 == 1 || arg5 == 3) {
                    var40 = var15.field1541;
                    var41 = var15.field1506;
                } else {
                    var40 = var15.field1506;
                    var41 = var15.field1541;
                }
                if (arg6.method537(arg2, var41, var14, var16, var40, var17, arg8, -28737, var39, var38, arg0) && var15.field1549) {
                    class10 var42;
                    if (var38 instanceof class10) {
                        var42 = (class10) var38;
                    } else {
                        var42 = var15.method506(10, arg5, var10, var11, var12, var13, -1);
                    }
                    if (var42 != null) {
                        for (int var43 = 0; var43 <= var40; var43++) {
                            for (int var44 = 0; var44 <= var41; var44++) {
                                int var45 = var42.field641 / 4;
                                if (var45 > 30) {
                                    var45 = 30;
                                }
                                if (var45 > this.field1367[arg0][arg2 + var43][arg8 + var44]) {
                                    this.field1367[arg0][arg2 + var43][arg8 + var44] = (byte) var45;
                                }
                            }
                        }
                    }
                }
            }
            if (var15.field1518 && arg3 != null) {
                arg3.method486(arg5, arg2, field1362, var15.field1506, var15.field1541, var15.field1523, arg8);
            }
        } else if (arg1 >= 12) {
            class18 var19;
            if (var15.field1537 == -1 && var15.field1554 == null) {
                var19 = var15.method506(arg1, arg5, var10, var11, var12, var13, -1);
            } else {
                var19 = new class25(true, var11, arg4, var13, var15.field1537, var12, arg5, arg1, var10, 0);
            }
            arg6.method537(arg2, 1, var14, var16, 1, var17, arg8, -28737, 0, var19, arg0);
            if (arg1 >= 12 && arg1 <= 17 && arg1 != 13 && arg0 > 0) {
                this.field1365[arg0][arg2][arg8] |= 0x924;
            }
            if (var15.field1518 && arg3 != null) {
                arg3.method486(arg5, arg2, field1362, var15.field1506, var15.field1541, var15.field1523, arg8);
            }
        } else if (arg1 == 0) {
            class18 var20;
            if (var15.field1537 == -1 && var15.field1554 == null) {
                var20 = var15.method506(0, arg5, var10, var11, var12, var13, -1);
            } else {
                var20 = new class25(true, var11, arg4, var13, var15.field1537, var12, arg5, 0, var10, 0);
            }
            arg6.method535(var17, var16, var14, null, 0, false, var20, field1351[arg5], arg8, arg0, arg2);
            if (arg5 == 0) {
                if (var15.field1549) {
                    this.field1367[arg0][arg2][arg8] = 50;
                    this.field1367[arg0][arg2][arg8 + 1] = 50;
                }
                if (var15.field1514) {
                    this.field1365[arg0][arg2][arg8] |= 0x249;
                }
            } else if (arg5 == 1) {
                if (var15.field1549) {
                    this.field1367[arg0][arg2][arg8 + 1] = 50;
                    this.field1367[arg0][arg2 + 1][arg8 + 1] = 50;
                }
                if (var15.field1514) {
                    this.field1365[arg0][arg2][arg8 + 1] |= 0x492;
                }
            } else if (arg5 == 2) {
                if (var15.field1549) {
                    this.field1367[arg0][arg2 + 1][arg8] = 50;
                    this.field1367[arg0][arg2 + 1][arg8 + 1] = 50;
                }
                if (var15.field1514) {
                    this.field1365[arg0][arg2 + 1][arg8] |= 0x249;
                }
            } else if (arg5 == 3) {
                if (var15.field1549) {
                    this.field1367[arg0][arg2][arg8] = 50;
                    this.field1367[arg0][arg2 + 1][arg8] = 50;
                }
                if (var15.field1514) {
                    this.field1365[arg0][arg2][arg8] |= 0x492;
                }
            }
            if (var15.field1518 && arg3 != null) {
                arg3.method485(var15.field1523, arg5, arg2, (byte) 96, arg8, arg1);
            }
            if (var15.field1539 != 16) {
                arg6.method543(false, arg0, arg8, var15.field1539, arg2);
            }
        } else if (arg1 == 1) {
            class18 var21;
            if (var15.field1537 == -1 && var15.field1554 == null) {
                var21 = var15.method506(1, arg5, var10, var11, var12, var13, -1);
            } else {
                var21 = new class25(true, var11, arg4, var13, var15.field1537, var12, arg5, 1, var10, 0);
            }
            arg6.method535(var17, var16, var14, null, 0, false, var21, field1369[arg5], arg8, arg0, arg2);
            if (var15.field1549) {
                if (arg5 == 0) {
                    this.field1367[arg0][arg2][arg8 + 1] = 50;
                } else if (arg5 == 1) {
                    this.field1367[arg0][arg2 + 1][arg8 + 1] = 50;
                } else if (arg5 == 2) {
                    this.field1367[arg0][arg2 + 1][arg8] = 50;
                } else if (arg5 == 3) {
                    this.field1367[arg0][arg2][arg8] = 50;
                }
            }
            if (var15.field1518 && arg3 != null) {
                arg3.method485(var15.field1523, arg5, arg2, (byte) 96, arg8, arg1);
            }
        } else if (arg1 == 2) {
            int var22 = arg5 + 1 & 0x3;
            class18 var23;
            class18 var24;
            if (var15.field1537 == -1 && var15.field1554 == null) {
                var23 = var15.method506(2, arg5 + 4, var10, var11, var12, var13, -1);
                var24 = var15.method506(2, var22, var10, var11, var12, var13, -1);
            } else {
                var23 = new class25(true, var11, arg4, var13, var15.field1537, var12, arg5 + 4, 2, var10, 0);
                var24 = new class25(true, var11, arg4, var13, var15.field1537, var12, var22, 2, var10, 0);
            }
            arg6.method535(var17, var16, var14, var24, field1351[var22], false, var23, field1351[arg5], arg8, arg0, arg2);
            if (var15.field1514) {
                if (arg5 == 0) {
                    this.field1365[arg0][arg2][arg8] |= 0x249;
                    this.field1365[arg0][arg2][arg8 + 1] |= 0x492;
                } else if (arg5 == 1) {
                    this.field1365[arg0][arg2][arg8 + 1] |= 0x492;
                    this.field1365[arg0][arg2 + 1][arg8] |= 0x249;
                } else if (arg5 == 2) {
                    this.field1365[arg0][arg2 + 1][arg8] |= 0x249;
                    this.field1365[arg0][arg2][arg8] |= 0x492;
                } else if (arg5 == 3) {
                    this.field1365[arg0][arg2][arg8] |= 0x492;
                    this.field1365[arg0][arg2][arg8] |= 0x249;
                }
            }
            if (var15.field1518 && arg3 != null) {
                arg3.method485(var15.field1523, arg5, arg2, (byte) 96, arg8, arg1);
            }
            if (var15.field1539 != 16) {
                arg6.method543(false, arg0, arg8, var15.field1539, arg2);
            }
        } else if (arg1 == 3) {
            class18 var25;
            if (var15.field1537 == -1 && var15.field1554 == null) {
                var25 = var15.method506(3, arg5, var10, var11, var12, var13, -1);
            } else {
                var25 = new class25(true, var11, arg4, var13, var15.field1537, var12, arg5, 3, var10, 0);
            }
            arg6.method535(var17, var16, var14, null, 0, false, var25, field1369[arg5], arg8, arg0, arg2);
            if (var15.field1549) {
                if (arg5 == 0) {
                    this.field1367[arg0][arg2][arg8 + 1] = 50;
                } else if (arg5 == 1) {
                    this.field1367[arg0][arg2 + 1][arg8 + 1] = 50;
                } else if (arg5 == 2) {
                    this.field1367[arg0][arg2 + 1][arg8] = 50;
                } else if (arg5 == 3) {
                    this.field1367[arg0][arg2][arg8] = 50;
                }
            }
            if (var15.field1518 && arg3 != null) {
                arg3.method485(var15.field1523, arg5, arg2, (byte) 96, arg8, arg1);
            }
        } else if (arg1 == 9) {
            class18 var26;
            if (var15.field1537 == -1 && var15.field1554 == null) {
                var26 = var15.method506(arg1, arg5, var10, var11, var12, var13, -1);
            } else {
                var26 = new class25(true, var11, arg4, var13, var15.field1537, var12, arg5, arg1, var10, 0);
            }
            arg6.method537(arg2, 1, var14, var16, 1, var17, arg8, -28737, 0, var26, arg0);
            if (var15.field1518 && arg3 != null) {
                arg3.method486(arg5, arg2, field1362, var15.field1506, var15.field1541, var15.field1523, arg8);
            }
        } else {
            if (var15.field1530) {
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
            if (arg1 == 4) {
                class18 var31;
                if (var15.field1537 == -1 && var15.field1554 == null) {
                    var31 = var15.method506(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var31 = new class25(true, var11, arg4, var13, var15.field1537, var12, 0, 4, var10, 0);
                }
                arg6.method536(var14, var31, arg8, arg0, var16, 21665, 0, var17, field1351[arg5], arg2, arg5 * 512, 0);
            } else if (arg1 == 5) {
                int var32 = 16;
                int var33 = arg6.method553(arg0, arg2, arg8);
                if (var33 > 0) {
                    var32 = class63.method501(var33 >> 14 & 0x7FFF).field1539;
                }
                class18 var34;
                if (var15.field1537 == -1 && var15.field1554 == null) {
                    var34 = var15.method506(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var34 = new class25(true, var11, arg4, var13, var15.field1537, var12, 0, 4, var10, 0);
                }
                arg6.method536(var14, var34, arg8, arg0, var16, 21665, field1345[arg5] * var32, var17, field1351[arg5], arg2, arg5 * 512, field1350[arg5] * var32);
            } else if (arg1 == 6) {
                class18 var35;
                if (var15.field1537 == -1 && var15.field1554 == null) {
                    var35 = var15.method506(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var35 = new class25(true, var11, arg4, var13, var15.field1537, var12, 0, 4, var10, 0);
                }
                arg6.method536(var14, var35, arg8, arg0, var16, 21665, 0, var17, 256, arg2, arg5, 0);
            } else if (arg1 == 7) {
                class18 var36;
                if (var15.field1537 == -1 && var15.field1554 == null) {
                    var36 = var15.method506(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var36 = new class25(true, var11, arg4, var13, var15.field1537, var12, 0, 4, var10, 0);
                }
                arg6.method536(var14, var36, arg8, arg0, var16, 21665, 0, var17, 512, arg2, arg5, 0);
            } else if (arg1 == 8) {
                class18 var37;
                if (var15.field1537 == -1 && var15.field1554 == null) {
                    var37 = var15.method506(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var37 = new class25(true, var11, arg4, var13, var15.field1537, var12, 0, 4, var10, 0);
                }
                arg6.method536(var14, var37, arg8, arg0, var16, 21665, 0, var17, 768, arg2, arg5, 0);
            }
        }
    }

    @OriginalMember(owner = "RRREBNUU", name = "e", descriptor = "(II)I")
    private static final int method445(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "RRREBNUU", name = "a", descriptor = "(IIILINLHDAGO;BIII)V")
    private final void method446(int arg0, int arg1, int arg2, class29 arg3, byte arg4, int arg5, int arg6, int arg7) {
        if (arg4 != -126) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        if (arg6 < 0 || arg6 >= 104 || arg2 < 0 || arg2 >= 104) {
            while (true) {
                int var12 = arg3.method308();
                if (var12 == 0) {
                    return;
                }
                if (var12 == 1) {
                    arg3.method308();
                    return;
                }
                if (var12 <= 49) {
                    arg3.method308();
                }
            }
        }
        this.field1361[arg1][arg6][arg2] = 0;
        while (true) {
            int var10 = arg3.method308();
            if (var10 == 0) {
                if (arg1 == 0) {
                    this.field1353[0][arg6][arg2] = -method441(arg6 + arg7 + 932731, arg2 + 556238 + arg5) * 8;
                    return;
                } else {
                    this.field1353[arg1][arg6][arg2] = this.field1353[arg1 - 1][arg6][arg2] - 240;
                    return;
                }
            }
            if (var10 == 1) {
                int var11 = arg3.method308();
                if (var11 == 1) {
                    var11 = 0;
                }
                if (arg1 == 0) {
                    this.field1353[0][arg6][arg2] = -var11 * 8;
                    return;
                }
                this.field1353[arg1][arg6][arg2] = this.field1353[arg1 - 1][arg6][arg2] - var11 * 8;
                return;
            }
            if (var10 <= 49) {
                this.field1352[arg1][arg6][arg2] = arg3.method309();
                this.field1372[arg1][arg6][arg2] = (byte) ((var10 - 2) / 4);
                this.field1371[arg1][arg6][arg2] = (byte) (var10 + arg0 - 2 & 0x3);
            } else if (var10 <= 81) {
                this.field1361[arg1][arg6][arg2] = (byte) (var10 - 49);
            } else {
                this.field1370[arg1][arg6][arg2] = (byte) (var10 - 81);
            }
        }
    }

    @OriginalMember(owner = "RRREBNUU", name = "a", descriptor = "(LUTWNPFGW;IIIILXRAHVOIV;IIII[[[I)V")
    public static final void method447(class62 arg0, int arg1, int arg2, int arg3, int arg4, class67 arg5, int arg6, int arg7, int arg8, int arg9, int[][][] arg10) {
        int var11 = arg10[arg3][arg7][arg6];
        int var12 = arg10[arg3][arg7 + 1][arg6];
        int var13 = arg10[arg3][arg7 + 1][arg6 + 1];
        int var14 = arg10[arg3][arg7][arg6 + 1];
        int var15 = var11 + var12 + var13 + var14 >> 2;
        if (arg9 != 2) {
            field1346 = -121;
        }
        class63 var16 = class63.method501(arg8);
        int var17 = (arg8 << 14) + (arg6 << 7) + arg7 + 1073741824;
        if (!var16.field1525) {
            var17 += Integer.MIN_VALUE;
        }
        byte var18 = (byte) ((arg4 << 6) + arg2);
        if (arg2 == 22) {
            class18 var19;
            if (var16.field1537 == -1 && var16.field1554 == null) {
                var19 = var16.method506(22, arg4, var11, var12, var13, var14, -1);
            } else {
                var19 = new class25(true, var12, arg8, var14, var16.field1537, var13, arg4, 22, var11, 0);
            }
            arg5.method533(field1364, var15, var18, arg7, arg6, arg1, var19, var17);
            if (var16.field1518 && var16.field1525) {
                arg0.method487(arg7, arg6, 9);
            }
        } else if (arg2 == 10 || arg2 == 11) {
            class18 var39;
            if (var16.field1537 == -1 && var16.field1554 == null) {
                var39 = var16.method506(10, arg4, var11, var12, var13, var14, -1);
            } else {
                var39 = new class25(true, var12, arg8, var14, var16.field1537, var13, arg4, 10, var11, 0);
            }
            if (var39 != null) {
                int var40 = 0;
                if (arg2 == 11) {
                    var40 += 256;
                }
                int var41;
                int var42;
                if (arg4 == 1 || arg4 == 3) {
                    var41 = var16.field1541;
                    var42 = var16.field1506;
                } else {
                    var41 = var16.field1506;
                    var42 = var16.field1541;
                }
                arg5.method537(arg7, var42, var15, var17, var41, var18, arg6, -28737, var40, var39, arg1);
            }
            if (var16.field1518) {
                arg0.method486(arg4, arg7, field1362, var16.field1506, var16.field1541, var16.field1523, arg6);
            }
        } else if (arg2 >= 12) {
            class18 var20;
            if (var16.field1537 == -1 && var16.field1554 == null) {
                var20 = var16.method506(arg2, arg4, var11, var12, var13, var14, -1);
            } else {
                var20 = new class25(true, var12, arg8, var14, var16.field1537, var13, arg4, arg2, var11, 0);
            }
            arg5.method537(arg7, 1, var15, var17, 1, var18, arg6, -28737, 0, var20, arg1);
            if (var16.field1518) {
                arg0.method486(arg4, arg7, field1362, var16.field1506, var16.field1541, var16.field1523, arg6);
            }
        } else if (arg2 == 0) {
            class18 var21;
            if (var16.field1537 == -1 && var16.field1554 == null) {
                var21 = var16.method506(0, arg4, var11, var12, var13, var14, -1);
            } else {
                var21 = new class25(true, var12, arg8, var14, var16.field1537, var13, arg4, 0, var11, 0);
            }
            arg5.method535(var18, var17, var15, null, 0, false, var21, field1351[arg4], arg6, arg1, arg7);
            if (var16.field1518) {
                arg0.method485(var16.field1523, arg4, arg7, (byte) 96, arg6, arg2);
            }
        } else if (arg2 == 1) {
            class18 var22;
            if (var16.field1537 == -1 && var16.field1554 == null) {
                var22 = var16.method506(1, arg4, var11, var12, var13, var14, -1);
            } else {
                var22 = new class25(true, var12, arg8, var14, var16.field1537, var13, arg4, 1, var11, 0);
            }
            arg5.method535(var18, var17, var15, null, 0, false, var22, field1369[arg4], arg6, arg1, arg7);
            if (var16.field1518) {
                arg0.method485(var16.field1523, arg4, arg7, (byte) 96, arg6, arg2);
            }
        } else if (arg2 == 2) {
            int var23 = arg4 + 1 & 0x3;
            class18 var24;
            class18 var25;
            if (var16.field1537 == -1 && var16.field1554 == null) {
                var24 = var16.method506(2, arg4 + 4, var11, var12, var13, var14, -1);
                var25 = var16.method506(2, var23, var11, var12, var13, var14, -1);
            } else {
                var24 = new class25(true, var12, arg8, var14, var16.field1537, var13, arg4 + 4, 2, var11, 0);
                var25 = new class25(true, var12, arg8, var14, var16.field1537, var13, var23, 2, var11, 0);
            }
            arg5.method535(var18, var17, var15, var25, field1351[var23], false, var24, field1351[arg4], arg6, arg1, arg7);
            if (var16.field1518) {
                arg0.method485(var16.field1523, arg4, arg7, (byte) 96, arg6, arg2);
            }
        } else if (arg2 == 3) {
            class18 var26;
            if (var16.field1537 == -1 && var16.field1554 == null) {
                var26 = var16.method506(3, arg4, var11, var12, var13, var14, -1);
            } else {
                var26 = new class25(true, var12, arg8, var14, var16.field1537, var13, arg4, 3, var11, 0);
            }
            arg5.method535(var18, var17, var15, null, 0, false, var26, field1369[arg4], arg6, arg1, arg7);
            if (var16.field1518) {
                arg0.method485(var16.field1523, arg4, arg7, (byte) 96, arg6, arg2);
            }
        } else if (arg2 == 9) {
            class18 var27;
            if (var16.field1537 == -1 && var16.field1554 == null) {
                var27 = var16.method506(arg2, arg4, var11, var12, var13, var14, -1);
            } else {
                var27 = new class25(true, var12, arg8, var14, var16.field1537, var13, arg4, arg2, var11, 0);
            }
            arg5.method537(arg7, 1, var15, var17, 1, var18, arg6, -28737, 0, var27, arg1);
            if (var16.field1518) {
                arg0.method486(arg4, arg7, field1362, var16.field1506, var16.field1541, var16.field1523, arg6);
            }
        } else {
            if (var16.field1530) {
                if (arg4 == 1) {
                    int var28 = var14;
                    var14 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var28;
                } else if (arg4 == 2) {
                    int var29 = var14;
                    var14 = var12;
                    var12 = var29;
                    int var30 = var13;
                    var13 = var11;
                    var11 = var30;
                } else if (arg4 == 3) {
                    int var31 = var14;
                    var14 = var11;
                    var11 = var12;
                    var12 = var13;
                    var13 = var31;
                }
            }
            if (arg2 == 4) {
                class18 var32;
                if (var16.field1537 == -1 && var16.field1554 == null) {
                    var32 = var16.method506(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var32 = new class25(true, var12, arg8, var14, var16.field1537, var13, 0, 4, var11, 0);
                }
                arg5.method536(var15, var32, arg6, arg1, var17, 21665, 0, var18, field1351[arg4], arg7, arg4 * 512, 0);
            } else if (arg2 == 5) {
                int var33 = 16;
                int var34 = arg5.method553(arg1, arg7, arg6);
                if (var34 > 0) {
                    var33 = class63.method501(var34 >> 14 & 0x7FFF).field1539;
                }
                class18 var35;
                if (var16.field1537 == -1 && var16.field1554 == null) {
                    var35 = var16.method506(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var35 = new class25(true, var12, arg8, var14, var16.field1537, var13, 0, 4, var11, 0);
                }
                arg5.method536(var15, var35, arg6, arg1, var17, 21665, field1345[arg4] * var33, var18, field1351[arg4], arg7, arg4 * 512, field1350[arg4] * var33);
            } else if (arg2 == 6) {
                class18 var36;
                if (var16.field1537 == -1 && var16.field1554 == null) {
                    var36 = var16.method506(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var36 = new class25(true, var12, arg8, var14, var16.field1537, var13, 0, 4, var11, 0);
                }
                arg5.method536(var15, var36, arg6, arg1, var17, 21665, 0, var18, 256, arg7, arg4, 0);
            } else if (arg2 == 7) {
                class18 var37;
                if (var16.field1537 == -1 && var16.field1554 == null) {
                    var37 = var16.method506(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var37 = new class25(true, var12, arg8, var14, var16.field1537, var13, 0, 4, var11, 0);
                }
                arg5.method536(var15, var37, arg6, arg1, var17, 21665, 0, var18, 512, arg7, arg4, 0);
            } else if (arg2 == 8) {
                class18 var38;
                if (var16.field1537 == -1 && var16.field1554 == null) {
                    var38 = var16.method506(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var38 = new class25(true, var12, arg8, var14, var16.field1537, var13, 0, 4, var11, 0);
                }
                arg5.method536(var15, var38, arg6, arg1, var17, 21665, 0, var18, 768, arg7, arg4, 0);
            }
        }
    }

    @OriginalMember(owner = "RRREBNUU", name = "a", descriptor = "(IIII)I")
    private static final int method448(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class12.field707[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @OriginalMember(owner = "RRREBNUU", name = "b", descriptor = "(IIII)I")
    public int method449(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 0) {
            field1346 = -240;
        }
        if ((this.field1361[arg0][arg3][arg1] & 0x8) == 0) {
            return arg0 <= 0 || (this.field1361[1][arg3][arg1] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "RRREBNUU", name = "<init>", descriptor = "([[[I[[[BIBI)V")
    public class52(int[][][] arg0, byte[][][] arg1, int arg2, byte arg3, int arg4) {
        this.field1347 = arg4;
        this.field1348 = arg2;
        this.field1353 = arg0;
        this.field1361 = arg1;
        this.field1370 = new byte[4][this.field1347][this.field1348];
        this.field1352 = new byte[4][this.field1347][this.field1348];
        this.field1372 = new byte[4][this.field1347][this.field1348];
        this.field1371 = new byte[4][this.field1347][this.field1348];
        this.field1365 = new int[4][this.field1347 + 1][this.field1348 + 1];
        this.field1367 = new byte[4][this.field1347 + 1][this.field1348 + 1];
        this.field1344 = new int[this.field1347 + 1][this.field1348 + 1];
        if (arg3 != 8) {
            throw new NullPointerException();
        }
        this.field1354 = new int[this.field1348];
        this.field1355 = new int[this.field1348];
        this.field1356 = new int[this.field1348];
        this.field1357 = new int[this.field1348];
        this.field1358 = new int[this.field1348];
    }

    @OriginalMember(owner = "RRREBNUU", name = "a", descriptor = "(Z[LUTWNPFGW;ILXRAHVOIV;I[B)V")
    public final void method450(boolean arg0, class62[] arg1, int arg2, class67 arg3, int arg4, byte[] arg5) {
        if (arg0) {
            return;
        }
        class29 var7 = new class29((byte) -28, arg5);
        int var8 = -1;
        while (true) {
            int var9 = var7.method322();
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method322();
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = var10 & 0x3F;
                int var13 = var10 >> 6 & 0x3F;
                int var14 = var10 >> 12;
                int var15 = var7.method308();
                int var16 = var15 >> 2;
                int var17 = var15 & 0x3;
                int var18 = arg2 + var13;
                int var19 = arg4 + var12;
                if (var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) {
                    int var20 = var14;
                    if ((this.field1361[1][var18][var19] & 0x2) == 2) {
                        var20 = var14 - 1;
                    }
                    class62 var21 = null;
                    if (var20 >= 0) {
                        var21 = arg1[var20];
                    }
                    this.method444(var14, var16, var18, var21, var8, var17, arg3, (byte) 121, var19);
                }
            }
        }
    }

    @OriginalMember(owner = "RRREBNUU", name = "c", descriptor = "(III)I")
    private static final int method451(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method443(var3, var5);
        int var8 = method443(var3 + 1, var5);
        int var9 = method443(var3, var5 + 1);
        int var10 = method443(var3 + 1, var5 + 1);
        int var11 = method448(var7, var8, var4, arg2);
        int var12 = method448(var9, var10, var4, arg2);
        return method448(var11, var12, var6, arg2);
    }

    @OriginalMember(owner = "RRREBNUU", name = "a", descriptor = "(IIZII)V")
    public final void method452(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (!arg2) {
            return;
        }
        for (int var6 = arg0; var6 <= arg0 + arg4; var6++) {
            for (int var7 = arg3; var7 <= arg1 + arg3; var7++) {
                if (var7 >= 0 && var7 < this.field1347 && var6 >= 0 && var6 < this.field1348) {
                    this.field1367[0][var7][var6] = 127;
                    if (arg3 == var7 && var7 > 0) {
                        this.field1353[0][var7][var6] = this.field1353[0][var7 - 1][var6];
                    }
                    if (arg1 + arg3 == var7 && var7 < this.field1347 - 1) {
                        this.field1353[0][var7][var6] = this.field1353[0][var7 + 1][var6];
                    }
                    if (arg0 == var6 && var6 > 0) {
                        this.field1353[0][var7][var6] = this.field1353[0][var7][var6 - 1];
                    }
                    if (arg0 + arg4 == var6 && var6 < this.field1348 - 1) {
                        this.field1353[0][var7][var6] = this.field1353[0][var7][var6 + 1];
                    }
                }
            }
        }
    }
}
