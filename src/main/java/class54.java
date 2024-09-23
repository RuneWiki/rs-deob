import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("SNGUFYDX")
public class class54 {

    @OriginalMember(owner = "SNGUFYDX", name = "c", descriptor = "I")
    private int field1389 = -868;

    @OriginalMember(owner = "SNGUFYDX", name = "i", descriptor = "Z")
    private boolean field1395 = false;

    @OriginalMember(owner = "SNGUFYDX", name = "k", descriptor = "Z")
    private boolean field1397 = false;

    @OriginalMember(owner = "SNGUFYDX", name = "B", descriptor = "I")
    private int field1414;

    @OriginalMember(owner = "SNGUFYDX", name = "C", descriptor = "I")
    private int field1415;

    @OriginalMember(owner = "SNGUFYDX", name = "d", descriptor = "[[[I")
    private int[][][] field1390;

    @OriginalMember(owner = "SNGUFYDX", name = "j", descriptor = "[[[B")
    private byte[][][] field1396;

    @OriginalMember(owner = "SNGUFYDX", name = "a", descriptor = "[[[B")
    private byte[][][] field1387;

    @OriginalMember(owner = "SNGUFYDX", name = "n", descriptor = "[[[B")
    private byte[][][] field1400;

    @OriginalMember(owner = "SNGUFYDX", name = "E", descriptor = "[[[B")
    private byte[][][] field1417;

    @OriginalMember(owner = "SNGUFYDX", name = "m", descriptor = "[[[B")
    private byte[][][] field1399;

    @OriginalMember(owner = "SNGUFYDX", name = "z", descriptor = "[[[I")
    private int[][][] field1412;

    @OriginalMember(owner = "SNGUFYDX", name = "b", descriptor = "[[[B")
    private byte[][][] field1388;

    @OriginalMember(owner = "SNGUFYDX", name = "v", descriptor = "[[I")
    private int[][] field1408;

    @OriginalMember(owner = "SNGUFYDX", name = "p", descriptor = "[I")
    private int[] field1402;

    @OriginalMember(owner = "SNGUFYDX", name = "q", descriptor = "[I")
    private int[] field1403;

    @OriginalMember(owner = "SNGUFYDX", name = "r", descriptor = "[I")
    private int[] field1404;

    @OriginalMember(owner = "SNGUFYDX", name = "s", descriptor = "[I")
    private int[] field1405;

    @OriginalMember(owner = "SNGUFYDX", name = "t", descriptor = "[I")
    private int[] field1406;

    @OriginalMember(owner = "SNGUFYDX", name = "e", descriptor = "[I")
    private static final int[] field1391 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "SNGUFYDX", name = "f", descriptor = "I")
    private static int field1392 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "SNGUFYDX", name = "g", descriptor = "I")
    private static int field1393 = -45657;

    @OriginalMember(owner = "SNGUFYDX", name = "h", descriptor = "I")
    private static int field1394 = 8;

    @OriginalMember(owner = "SNGUFYDX", name = "o", descriptor = "[I")
    private static final int[] field1401 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "SNGUFYDX", name = "u", descriptor = "Z")
    public static boolean field1407 = true;

    @OriginalMember(owner = "SNGUFYDX", name = "w", descriptor = "Z")
    private static boolean field1409 = true;

    @OriginalMember(owner = "SNGUFYDX", name = "x", descriptor = "[I")
    private static final int[] field1410 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "SNGUFYDX", name = "y", descriptor = "[I")
    private static final int[] field1411 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "SNGUFYDX", name = "A", descriptor = "I")
    public static int field1413 = 99;

    @OriginalMember(owner = "SNGUFYDX", name = "D", descriptor = "I")
    private static int field1416 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "SNGUFYDX", name = "l", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "SNGUFYDX", name = "a", descriptor = "(I[LMNHXSMWL;III[BI)V")
    public final void method455(int arg0, class31[] arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    if (arg6 + var14 > 0 && arg6 + var14 < 103 && arg0 + var15 > 0 && arg0 + var15 < 103) {
                        arg1[var8].field919[arg6 + var14][arg0 + var15] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class33 var9 = new class33(field1394, arg5);
        if (arg3 != 17521) {
            for (int var10 = 1; var10 > 0; var10++) {
            }
        }
        for (int var11 = 0; var11 < 4; var11++) {
            for (int var12 = 0; var12 < 64; var12++) {
                for (int var13 = 0; var13 < 64; var13++) {
                    this.method474(arg6 + var12, var11, 659, arg0 + var13, var9, arg2, 0, arg4);
                }
            }
        }
    }

    @OriginalMember(owner = "SNGUFYDX", name = "a", descriptor = "(III)I")
    private final int method456(int arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "SNGUFYDX", name = "a", descriptor = "(ZIIII)V")
    public final void method457(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var6 = arg3; var6 <= arg1 + arg3; var6++) {
            for (int var8 = arg2; var8 <= arg2 + arg4; var8++) {
                if (var8 >= 0 && var8 < this.field1414 && var6 >= 0 && var6 < this.field1415) {
                    this.field1388[0][var8][var6] = 127;
                    if (arg2 == var8 && var8 > 0) {
                        this.field1390[0][var8][var6] = this.field1390[0][var8 - 1][var6];
                    }
                    if (arg2 + arg4 == var8 && var8 < this.field1414 - 1) {
                        this.field1390[0][var8][var6] = this.field1390[0][var8 + 1][var6];
                    }
                    if (arg3 == var6 && var6 > 0) {
                        this.field1390[0][var8][var6] = this.field1390[0][var8][var6 - 1];
                    }
                    if (arg1 + arg3 == var6 && var6 < this.field1415 - 1) {
                        this.field1390[0][var8][var6] = this.field1390[0][var8][var6 + 1];
                    }
                }
            }
        }
        if (arg0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
    }

    @OriginalMember(owner = "SNGUFYDX", name = "a", descriptor = "(II)I")
    private static final int method458(int arg0, int arg1) {
        int var2 = method468(arg0 + 45365, arg1 + 91923, 4) + (method468(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method468(arg0, arg1, 1) - 128 >> 2) - 128;
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @OriginalMember(owner = "SNGUFYDX", name = "b", descriptor = "(II)I")
    private final int method459(int arg0, int arg1) {
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

    @OriginalMember(owner = "SNGUFYDX", name = "a", descriptor = "([BIBI)Z")
    public static final boolean method460(byte[] arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != -96) {
            field1409 = !field1409;
        }
        boolean var4 = true;
        class33 var5 = new class33(field1394, arg0);
        int var6 = -1;
        label59: while (true) {
            int var7 = var5.method306();
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method306();
                    if (var11 == 0) {
                        continue label59;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = var5.method292() >> 2;
                    int var15 = arg3 + var13;
                    int var16 = arg1 + var12;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        class42 var17 = class42.method405(var6);
                        if (var14 != 22 || !field1407 || var17.field1153 || var17.field1140) {
                            var4 &= var17.method404(true);
                            var9 = true;
                        }
                    }
                }
                int var10 = var5.method306();
                if (var10 == 0) {
                    break;
                }
                var5.method292();
            }
        }
    }

    @OriginalMember(owner = "SNGUFYDX", name = "<init>", descriptor = "([[[BII[[[II)V")
    public class54(byte[][][] arg0, int arg1, int arg2, int[][][] arg3, int arg4) {
        field1413 = 99;
        this.field1414 = arg2;
        this.field1415 = arg1;
        this.field1390 = arg3;
        this.field1396 = arg0;
        this.field1387 = new byte[4][this.field1414][this.field1415];
        this.field1400 = new byte[4][this.field1414][this.field1415];
        this.field1417 = new byte[4][this.field1414][this.field1415];
        this.field1399 = new byte[4][this.field1414][this.field1415];
        while (arg4 >= 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        this.field1412 = new int[4][this.field1414 + 1][this.field1415 + 1];
        this.field1388 = new byte[4][this.field1414 + 1][this.field1415 + 1];
        this.field1408 = new int[this.field1414 + 1][this.field1415 + 1];
        this.field1402 = new int[this.field1415];
        this.field1403 = new int[this.field1415];
        this.field1404 = new int[this.field1415];
        this.field1405 = new int[this.field1415];
        this.field1406 = new int[this.field1415];
    }

    @OriginalMember(owner = "SNGUFYDX", name = "a", descriptor = "(ZLUWQNYVPL;[LMNHXSMWL;)V")
    public final void method461(boolean arg0, class62 arg1, class31[] arg2) {
        if (!arg0) {
            return;
        }
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((this.field1396[var4][var110][var111] & 0x1) == 1) {
                        int var112 = var4;
                        if ((this.field1396[1][var110][var111] & 0x2) == 2) {
                            var112 = var4 - 1;
                        }
                        if (var112 >= 0) {
                            arg2[var112].method271(var111, 5, var110);
                        }
                    }
                }
            }
        }
        field1416 += (int) (Math.random() * 5.0D) - 2;
        if (field1416 < -8) {
            field1416 = -8;
        }
        if (field1416 > 8) {
            field1416 = 8;
        }
        field1392 += (int) (Math.random() * 5.0D) - 2;
        if (field1392 < -16) {
            field1392 = -16;
        }
        if (field1392 > 16) {
            field1392 = 16;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            byte[][] var48 = this.field1388[var5];
            byte var49 = 96;
            short var50 = 768;
            byte var51 = -50;
            byte var52 = -10;
            byte var53 = -50;
            int var54 = (int) Math.sqrt((double) (var53 * var53 + var51 * var51 + var52 * var52));
            int var55 = var50 * var54 >> 8;
            for (int var56 = 1; var56 < this.field1415 - 1; var56++) {
                for (int var101 = 1; var101 < this.field1414 - 1; var101++) {
                    int var102 = this.field1390[var5][var101 + 1][var56] - this.field1390[var5][var101 - 1][var56];
                    int var103 = this.field1390[var5][var101][var56 + 1] - this.field1390[var5][var101][var56 - 1];
                    int var104 = (int) Math.sqrt((double) (var103 * var103 + var102 * var102 + 65536));
                    int var105 = (var102 << 8) / var104;
                    int var106 = 65536 / var104;
                    int var107 = (var103 << 8) / var104;
                    int var108 = (var53 * var107 + var51 * var105 + var52 * var106) / var55 + var49;
                    int var109 = (var48[var101][var56] >> 1) + (var48[var101][var56 + 1] >> 3) + (var48[var101][var56 - 1] >> 2) + (var48[var101 - 1][var56] >> 2) + (var48[var101 + 1][var56] >> 3);
                    this.field1408[var101][var56] = var108 - var109;
                }
            }
            for (int var57 = 0; var57 < this.field1415; var57++) {
                this.field1402[var57] = 0;
                this.field1403[var57] = 0;
                this.field1404[var57] = 0;
                this.field1405[var57] = 0;
                this.field1406[var57] = 0;
            }
            for (int var58 = -5; var58 < this.field1414 + 5; var58++) {
                for (int var61 = 0; var61 < this.field1415; var61++) {
                    int var95 = var58 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < this.field1414) {
                        int var96 = this.field1387[var5][var95][var61] & 0xFF;
                        if (var96 > 0) {
                            class69 var97 = class69.field1669[var96 - 1];
                            this.field1402[var61] += var97.field1678;
                            this.field1403[var61] += var97.field1676;
                            this.field1404[var61] += var97.field1677;
                            this.field1405[var61] += var97.field1679;
                            var10002 = this.field1406[var61]++;
                        }
                    }
                    int var98 = var58 - 5;
                    if (var98 >= 0 && var98 < this.field1414) {
                        int var99 = this.field1387[var5][var98][var61] & 0xFF;
                        if (var99 > 0) {
                            class69 var100 = class69.field1669[var99 - 1];
                            this.field1402[var61] -= var100.field1678;
                            this.field1403[var61] -= var100.field1676;
                            this.field1404[var61] -= var100.field1677;
                            this.field1405[var61] -= var100.field1679;
                            var10002 = this.field1406[var61]--;
                        }
                    }
                }
                if (var58 >= 1 && var58 < this.field1414 - 1) {
                    int var62 = 0;
                    int var63 = 0;
                    int var64 = 0;
                    int var65 = 0;
                    int var66 = 0;
                    for (int var67 = -5; var67 < this.field1415 + 5; var67++) {
                        int var68 = var67 + 5;
                        if (var68 >= 0 && var68 < this.field1415) {
                            var62 += this.field1402[var68];
                            var63 += this.field1403[var68];
                            var64 += this.field1404[var68];
                            var65 += this.field1405[var68];
                            var66 += this.field1406[var68];
                        }
                        int var69 = var67 - 5;
                        if (var69 >= 0 && var69 < this.field1415) {
                            var62 -= this.field1402[var69];
                            var63 -= this.field1403[var69];
                            var64 -= this.field1404[var69];
                            var65 -= this.field1405[var69];
                            var66 -= this.field1406[var69];
                        }
                        if (var67 >= 1 && var67 < this.field1415 - 1 && (!field1407 || (this.field1396[0][var58][var67] & 0x2) != 0 || (this.field1396[var5][var58][var67] & 0x10) == 0 && this.method470(var5, var67, var58, (byte) 7) == field1398)) {
                            if (var5 < field1413) {
                                field1413 = var5;
                            }
                            int var70 = this.field1387[var5][var58][var67] & 0xFF;
                            int var71 = this.field1400[var5][var58][var67] & 0xFF;
                            if (var70 > 0 || var71 > 0) {
                                int var72 = this.field1390[var5][var58][var67];
                                int var73 = this.field1390[var5][var58 + 1][var67];
                                int var74 = this.field1390[var5][var58 + 1][var67 + 1];
                                int var75 = this.field1390[var5][var58][var67 + 1];
                                int var76 = this.field1408[var58][var67];
                                int var77 = this.field1408[var58 + 1][var67];
                                int var78 = this.field1408[var58 + 1][var67 + 1];
                                int var79 = this.field1408[var58][var67 + 1];
                                int var80 = -1;
                                int var81 = -1;
                                if (var70 > 0) {
                                    int var82 = var62 * 256 / var65;
                                    int var83 = var63 / var66;
                                    int var84 = var64 / var66;
                                    var80 = this.method456(var82, var83, var84);
                                    int var85 = field1416 + var82 & 0xFF;
                                    int var86 = field1392 + var84;
                                    if (var86 < 0) {
                                        var86 = 0;
                                    } else if (var86 > 255) {
                                        var86 = 255;
                                    }
                                    var81 = this.method456(var85, var83, var86);
                                }
                                if (var5 > 0) {
                                    boolean var87 = true;
                                    if (var70 == 0 && this.field1417[var5][var58][var67] != 0) {
                                        var87 = false;
                                    }
                                    if (var71 > 0 && !class69.field1669[var71 - 1].field1674) {
                                        var87 = false;
                                    }
                                    if (var87 && var72 == var73 && var72 == var74 && var72 == var75) {
                                        this.field1412[var5][var58][var67] |= 0x924;
                                    }
                                }
                                int var88 = 0;
                                if (var80 != -1) {
                                    var88 = class48.field1297[method466(var81, 96)];
                                }
                                if (var71 == 0) {
                                    arg1.method514(var5, var58, var67, 0, 0, -1, var72, var73, var74, var75, method466(var80, var76), method466(var80, var77), method466(var80, var78), method466(var80, var79), 0, 0, 0, 0, var88, 0);
                                } else {
                                    int var89 = this.field1417[var5][var58][var67] + 1;
                                    byte var90 = this.field1399[var5][var58][var67];
                                    class69 var91 = class69.field1669[var71 - 1];
                                    int var92 = var91.field1672;
                                    int var93;
                                    int var94;
                                    if (var92 >= 0) {
                                        var93 = class48.method439(var92, false);
                                        var94 = -1;
                                    } else if (var91.field1671 == 16711935) {
                                        var93 = 0;
                                        var94 = -2;
                                        var92 = -1;
                                    } else {
                                        var94 = this.method456(var91.field1675, var91.field1676, var91.field1677);
                                        var93 = class48.field1297[this.method459(var91.field1680, 96)];
                                    }
                                    arg1.method514(var5, var58, var67, var89, var90, var92, var72, var73, var74, var75, method466(var80, var76), method466(var80, var77), method466(var80, var78), method466(var80, var79), this.method459(var94, var76), this.method459(var94, var77), this.method459(var94, var78), this.method459(var94, var79), var88, var93);
                                }
                            }
                        }
                    }
                }
            }
            for (int var59 = 1; var59 < this.field1415 - 1; var59++) {
                for (int var60 = 1; var60 < this.field1414 - 1; var60++) {
                    arg1.method513(var5, var60, var59, this.method470(var5, var59, var60, (byte) 7));
                }
            }
        }
        arg1.method540(-10, 768, 64, 15669, -50, -50);
        for (int var6 = 0; var6 < this.field1414; var6++) {
            for (int var47 = 0; var47 < this.field1415; var47++) {
                if ((this.field1396[1][var6][var47] & 0x2) == 2) {
                    arg1.method511(4239, var6, var47);
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
                for (int var12 = 0; var12 <= this.field1415; var12++) {
                    for (int var13 = 0; var13 <= this.field1414; var13++) {
                        if ((this.field1412[var11][var13][var12] & var7) != 0) {
                            int var14 = var12;
                            int var15 = var12;
                            int var16 = var11;
                            int var17 = var11;
                            while (var14 > 0 && (this.field1412[var11][var13][var14 - 1] & var7) != 0) {
                                var14--;
                            }
                            while (var15 < this.field1415 && (this.field1412[var11][var13][var15 + 1] & var7) != 0) {
                                var15++;
                            }
                            label330: while (var16 > 0) {
                                for (int var18 = var14; var18 <= var15; var18++) {
                                    if ((this.field1412[var16 - 1][var13][var18] & var7) == 0) {
                                        break label330;
                                    }
                                }
                                var16--;
                            }
                            label319: while (var17 < var10) {
                                for (int var19 = var14; var19 <= var15; var19++) {
                                    if ((this.field1412[var17 + 1][var13][var19] & var7) == 0) {
                                        break label319;
                                    }
                                }
                                var17++;
                            }
                            int var20 = (var17 + 1 - var16) * (var15 - var14 + 1);
                            if (var20 >= 8) {
                                short var21 = 240;
                                int var22 = this.field1390[var17][var13][var14] - var21;
                                int var23 = this.field1390[var16][var13][var14];
                                class62.method512(var23, var13 * 128, var22, var15 * 128 + 128, var10, var13 * 128, var14 * 128, (byte) 9, 1);
                                for (int var24 = var16; var24 <= var17; var24++) {
                                    for (int var25 = var14; var25 <= var15; var25++) {
                                        this.field1412[var24][var13][var25] &= ~var7;
                                    }
                                }
                            }
                        }
                        if ((this.field1412[var11][var13][var12] & var8) != 0) {
                            int var26 = var13;
                            int var27 = var13;
                            int var28 = var11;
                            int var29 = var11;
                            while (var26 > 0 && (this.field1412[var11][var26 - 1][var12] & var8) != 0) {
                                var26--;
                            }
                            while (var27 < this.field1414 && (this.field1412[var11][var27 + 1][var12] & var8) != 0) {
                                var27++;
                            }
                            label383: while (var28 > 0) {
                                for (int var30 = var26; var30 <= var27; var30++) {
                                    if ((this.field1412[var28 - 1][var30][var12] & var8) == 0) {
                                        break label383;
                                    }
                                }
                                var28--;
                            }
                            label372: while (var29 < var10) {
                                for (int var31 = var26; var31 <= var27; var31++) {
                                    if ((this.field1412[var29 + 1][var31][var12] & var8) == 0) {
                                        break label372;
                                    }
                                }
                                var29++;
                            }
                            int var32 = (var29 + 1 - var28) * (var27 - var26 + 1);
                            if (var32 >= 8) {
                                short var33 = 240;
                                int var34 = this.field1390[var29][var26][var12] - var33;
                                int var35 = this.field1390[var28][var26][var12];
                                class62.method512(var35, var26 * 128, var34, var12 * 128, var10, var27 * 128 + 128, var12 * 128, (byte) 9, 2);
                                for (int var36 = var28; var36 <= var29; var36++) {
                                    for (int var37 = var26; var37 <= var27; var37++) {
                                        this.field1412[var36][var37][var12] &= ~var8;
                                    }
                                }
                            }
                        }
                        if ((this.field1412[var11][var13][var12] & var9) != 0) {
                            int var38 = var13;
                            int var39 = var13;
                            int var40 = var12;
                            int var41 = var12;
                            while (var40 > 0 && (this.field1412[var11][var13][var40 - 1] & var9) != 0) {
                                var40--;
                            }
                            while (var41 < this.field1415 && (this.field1412[var11][var13][var41 + 1] & var9) != 0) {
                                var41++;
                            }
                            label436: while (var38 > 0) {
                                for (int var42 = var40; var42 <= var41; var42++) {
                                    if ((this.field1412[var11][var38 - 1][var42] & var9) == 0) {
                                        break label436;
                                    }
                                }
                                var38--;
                            }
                            label425: while (var39 < this.field1414) {
                                for (int var43 = var40; var43 <= var41; var43++) {
                                    if ((this.field1412[var11][var39 + 1][var43] & var9) == 0) {
                                        break label425;
                                    }
                                }
                                var39++;
                            }
                            if ((var39 + 1 - var38) * (var41 - var40 + 1) >= 4) {
                                int var44 = this.field1390[var11][var38][var40];
                                class62.method512(var44, var38 * 128, var44, var41 * 128 + 128, var10, var39 * 128 + 128, var40 * 128, (byte) 9, 4);
                                for (int var45 = var38; var45 <= var39; var45++) {
                                    for (int var46 = var40; var46 <= var41; var46++) {
                                        this.field1412[var11][var45][var46] &= ~var9;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "SNGUFYDX", name = "c", descriptor = "(II)I")
    private static final int method462(int arg0, int arg1) {
        int var2 = method473(arg0 - 1, arg1 - 1) + method473(arg0 + 1, arg1 - 1) + method473(arg0 - 1, arg1 + 1) + method473(arg0 + 1, arg1 + 1);
        int var3 = method473(arg0 - 1, arg1) + method473(arg0 + 1, arg1) + method473(arg0, arg1 - 1) + method473(arg0, arg1 + 1);
        int var4 = method473(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @OriginalMember(owner = "SNGUFYDX", name = "a", descriptor = "(IIII[LMNHXSMWL;LUWQNYVPL;IIII[B)V")
    public final void method463(int arg0, int arg1, int arg2, int arg3, class31[] arg4, class62 arg5, int arg6, int arg7, int arg8, int arg9, byte[] arg10) {
        class33 var12 = new class33(field1394, arg10);
        int var13 = -1;
        if (arg0 >= 0) {
            return;
        }
        while (true) {
            int var14 = var12.method306();
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method306();
                if (var16 == 0) {
                    break;
                }
                var15 += var16 - 1;
                int var17 = var15 & 0x3F;
                int var18 = var15 >> 6 & 0x3F;
                int var19 = var15 >> 12;
                int var20 = var12.method292();
                int var21 = var20 >> 2;
                int var22 = var20 & 0x3;
                if (arg8 == var19 && var18 >= arg2 && var18 < arg2 + 8 && var17 >= arg9 && var17 < arg9 + 8) {
                    class42 var23 = class42.method405(var13);
                    int var24 = arg6 + class13.method203(var23.field1134, var23.field1166, (byte) 0, arg3, var18 & 0x7, var17 & 0x7);
                    int var25 = arg1 + class13.method204(var17 & 0x7, 3, arg3, var18 & 0x7, var23.field1134, var23.field1166);
                    if (var24 > 0 && var25 > 0 && var24 < 103 && var25 < 103) {
                        int var26 = var19;
                        if ((this.field1396[1][var24][var25] & 0x2) == 2) {
                            var26 = var19 - 1;
                        }
                        class31 var27 = null;
                        if (var26 >= 0) {
                            var27 = arg4[var26];
                        }
                        this.method467(var19, 6, var25, arg5, var27, arg3 + var22 & 0x3, var21, var24, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "SNGUFYDX", name = "a", descriptor = "(ILMUKVLYLC;LFRNMNGGN;)V")
    public static final void method464(int arg0, class33 arg1, class17 arg2) {
        int var3 = -1;
        if (arg0 < 6 || arg0 > 6) {
            field1409 = !field1409;
        }
        while (true) {
            int var4 = arg1.method306();
            if (var4 == 0) {
                return;
            }
            var3 += var4;
            class42 var5 = class42.method405(var3);
            var5.method411(arg2, 0);
            while (true) {
                int var6 = arg1.method306();
                if (var6 == 0) {
                    break;
                }
                arg1.method292();
            }
        }
    }

    @OriginalMember(owner = "SNGUFYDX", name = "a", descriptor = "([BIIIIIZ[LMNHXSMWL;II)V")
    public final void method465(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, class31[] arg7, int arg8, int arg9) {
        for (int var11 = 0; var11 < 8; var11++) {
            for (int var17 = 0; var17 < 8; var17++) {
                if (arg1 + var11 > 0 && arg1 + var11 < 103 && arg8 + var17 > 0 && arg8 + var17 < 103) {
                    arg7[arg2].field919[arg1 + var11][arg8 + var17] &= 0xFEFFFFFF;
                }
            }
        }
        if (arg6) {
            for (int var12 = 1; var12 > 0; var12++) {
            }
        }
        class33 var13 = new class33(field1394, arg0);
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 64; var15++) {
                for (int var16 = 0; var16 < 64; var16++) {
                    if (arg5 == var14 && var15 >= arg4 && var15 < arg4 + 8 && var16 >= arg3 && var16 < arg3 + 8) {
                        this.method474(arg1 + class13.method201(var15 & 0x7, (byte) -48, arg9, var16 & 0x7), arg2, 659, arg8 + class13.method202(arg9, var15 & 0x7, (byte) 88, var16 & 0x7), var13, 0, arg9, 0);
                    } else {
                        this.method474(-1, 0, 659, -1, var13, 0, 0, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "SNGUFYDX", name = "d", descriptor = "(II)I")
    private static final int method466(int arg0, int arg1) {
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

    @OriginalMember(owner = "SNGUFYDX", name = "a", descriptor = "(IIILUWQNYVPL;LMNHXSMWL;IIII)V")
    private final void method467(int arg0, int arg1, int arg2, class62 arg3, class31 arg4, int arg5, int arg6, int arg7, int arg8) {
        if (field1407 && (this.field1396[0][arg7][arg2] & 0x2) == 0) {
            if ((this.field1396[arg0][arg7][arg2] & 0x10) != 0) {
                return;
            }
            if (this.method470(arg0, arg2, arg7, (byte) 7) != field1398) {
                return;
            }
        }
        if (arg0 < field1413) {
            field1413 = arg0;
        }
        int var10 = this.field1390[arg0][arg7][arg2];
        int var11 = this.field1390[arg0][arg7 + 1][arg2];
        int var12 = this.field1390[arg0][arg7 + 1][arg2 + 1];
        int var13 = this.field1390[arg0][arg7][arg2 + 1];
        int var14 = var10 + var11 + var12 + var13 >> 2;
        class42 var15 = class42.method405(arg8);
        if (arg1 < 6 || arg1 > 6) {
            field1409 = !field1409;
        }
        int var16 = (arg8 << 14) + (arg2 << 7) + arg7 + 1073741824;
        if (!var15.field1153) {
            var16 += Integer.MIN_VALUE;
        }
        byte var17 = (byte) ((arg5 << 6) + arg6);
        if (arg6 == 22) {
            if (!field1407 || var15.field1153 || var15.field1140) {
                class28 var18;
                if (var15.field1146 == -1 && var15.field1133 == null) {
                    var18 = var15.method406(22, arg5, var10, var11, var12, var13, -1);
                } else {
                    var18 = new class22(var15.field1146, var13, var11, 22, var12, arg5, true, var10, (byte) 39, arg8);
                }
                arg3.method515(var16, (byte) 119, var17, arg7, var18, var14, arg2, arg0);
                if (var15.field1143 && var15.field1153 && arg4 != null) {
                    arg4.method271(arg2, 5, arg7);
                }
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class28 var38;
            if (var15.field1146 == -1 && var15.field1133 == null) {
                var38 = var15.method406(10, arg5, var10, var11, var12, var13, -1);
            } else {
                var38 = new class22(var15.field1146, var13, var11, 10, var12, arg5, true, var10, (byte) 39, arg8);
            }
            if (var38 != null) {
                int var39 = 0;
                if (arg6 == 11) {
                    var39 += 256;
                }
                int var40;
                int var41;
                if (arg5 == 1 || arg5 == 3) {
                    var40 = var15.field1166;
                    var41 = var15.field1134;
                } else {
                    var40 = var15.field1134;
                    var41 = var15.field1166;
                }
                if (arg3.method519(arg2, var16, 0, var39, var14, var40, var38, var41, var17, arg0, arg7) && var15.field1158) {
                    class35 var42;
                    if (var38 instanceof class35) {
                        var42 = (class35) var38;
                    } else {
                        var42 = var15.method406(10, arg5, var10, var11, var12, var13, -1);
                    }
                    if (var42 != null) {
                        for (int var43 = 0; var43 <= var40; var43++) {
                            for (int var44 = 0; var44 <= var41; var44++) {
                                int var45 = var42.field1017 / 4;
                                if (var45 > 30) {
                                    var45 = 30;
                                }
                                if (var45 > this.field1388[arg0][arg7 + var43][arg2 + var44]) {
                                    this.field1388[arg0][arg7 + var43][arg2 + var44] = (byte) var45;
                                }
                            }
                        }
                    }
                }
            }
            if (var15.field1143 && arg4 != null) {
                arg4.method270(var15.field1134, arg2, 496, var15.field1172, var15.field1166, arg5, arg7);
            }
        } else if (arg6 >= 12) {
            class28 var19;
            if (var15.field1146 == -1 && var15.field1133 == null) {
                var19 = var15.method406(arg6, arg5, var10, var11, var12, var13, -1);
            } else {
                var19 = new class22(var15.field1146, var13, var11, arg6, var12, arg5, true, var10, (byte) 39, arg8);
            }
            arg3.method519(arg2, var16, 0, 0, var14, 1, var19, 1, var17, arg0, arg7);
            if (arg6 >= 12 && arg6 <= 17 && arg6 != 13 && arg0 > 0) {
                this.field1412[arg0][arg7][arg2] |= 0x924;
            }
            if (var15.field1143 && arg4 != null) {
                arg4.method270(var15.field1134, arg2, 496, var15.field1172, var15.field1166, arg5, arg7);
            }
        } else if (arg6 == 0) {
            class28 var20;
            if (var15.field1146 == -1 && var15.field1133 == null) {
                var20 = var15.method406(0, arg5, var10, var11, var12, var13, -1);
            } else {
                var20 = new class22(var15.field1146, var13, var11, 0, var12, arg5, true, var10, (byte) 39, arg8);
            }
            arg3.method517(arg2, var16, field1410[arg5], arg0, arg7, 0, var17, var20, var14, null, false);
            if (arg5 == 0) {
                if (var15.field1158) {
                    this.field1388[arg0][arg7][arg2] = 50;
                    this.field1388[arg0][arg7][arg2 + 1] = 50;
                }
                if (var15.field1162) {
                    this.field1412[arg0][arg7][arg2] |= 0x249;
                }
            } else if (arg5 == 1) {
                if (var15.field1158) {
                    this.field1388[arg0][arg7][arg2 + 1] = 50;
                    this.field1388[arg0][arg7 + 1][arg2 + 1] = 50;
                }
                if (var15.field1162) {
                    this.field1412[arg0][arg7][arg2 + 1] |= 0x492;
                }
            } else if (arg5 == 2) {
                if (var15.field1158) {
                    this.field1388[arg0][arg7 + 1][arg2] = 50;
                    this.field1388[arg0][arg7 + 1][arg2 + 1] = 50;
                }
                if (var15.field1162) {
                    this.field1412[arg0][arg7 + 1][arg2] |= 0x249;
                }
            } else if (arg5 == 3) {
                if (var15.field1158) {
                    this.field1388[arg0][arg7][arg2] = 50;
                    this.field1388[arg0][arg7 + 1][arg2] = 50;
                }
                if (var15.field1162) {
                    this.field1412[arg0][arg7][arg2] |= 0x492;
                }
            }
            if (var15.field1143 && arg4 != null) {
                arg4.method269(arg2, arg6, arg5, arg7, 8, var15.field1172);
            }
            if (var15.field1145 != 16) {
                arg3.method525(var15.field1145, arg7, arg2, arg0, true);
            }
        } else if (arg6 == 1) {
            class28 var21;
            if (var15.field1146 == -1 && var15.field1133 == null) {
                var21 = var15.method406(1, arg5, var10, var11, var12, var13, -1);
            } else {
                var21 = new class22(var15.field1146, var13, var11, 1, var12, arg5, true, var10, (byte) 39, arg8);
            }
            arg3.method517(arg2, var16, field1411[arg5], arg0, arg7, 0, var17, var21, var14, null, false);
            if (var15.field1158) {
                if (arg5 == 0) {
                    this.field1388[arg0][arg7][arg2 + 1] = 50;
                } else if (arg5 == 1) {
                    this.field1388[arg0][arg7 + 1][arg2 + 1] = 50;
                } else if (arg5 == 2) {
                    this.field1388[arg0][arg7 + 1][arg2] = 50;
                } else if (arg5 == 3) {
                    this.field1388[arg0][arg7][arg2] = 50;
                }
            }
            if (var15.field1143 && arg4 != null) {
                arg4.method269(arg2, arg6, arg5, arg7, 8, var15.field1172);
            }
        } else if (arg6 == 2) {
            int var22 = arg5 + 1 & 0x3;
            class28 var23;
            class28 var24;
            if (var15.field1146 == -1 && var15.field1133 == null) {
                var23 = var15.method406(2, arg5 + 4, var10, var11, var12, var13, -1);
                var24 = var15.method406(2, var22, var10, var11, var12, var13, -1);
            } else {
                var23 = new class22(var15.field1146, var13, var11, 2, var12, arg5 + 4, true, var10, (byte) 39, arg8);
                var24 = new class22(var15.field1146, var13, var11, 2, var12, var22, true, var10, (byte) 39, arg8);
            }
            arg3.method517(arg2, var16, field1410[arg5], arg0, arg7, field1410[var22], var17, var23, var14, var24, false);
            if (var15.field1162) {
                if (arg5 == 0) {
                    this.field1412[arg0][arg7][arg2] |= 0x249;
                    this.field1412[arg0][arg7][arg2 + 1] |= 0x492;
                } else if (arg5 == 1) {
                    this.field1412[arg0][arg7][arg2 + 1] |= 0x492;
                    this.field1412[arg0][arg7 + 1][arg2] |= 0x249;
                } else if (arg5 == 2) {
                    this.field1412[arg0][arg7 + 1][arg2] |= 0x249;
                    this.field1412[arg0][arg7][arg2] |= 0x492;
                } else if (arg5 == 3) {
                    this.field1412[arg0][arg7][arg2] |= 0x492;
                    this.field1412[arg0][arg7][arg2] |= 0x249;
                }
            }
            if (var15.field1143 && arg4 != null) {
                arg4.method269(arg2, arg6, arg5, arg7, 8, var15.field1172);
            }
            if (var15.field1145 != 16) {
                arg3.method525(var15.field1145, arg7, arg2, arg0, true);
            }
        } else if (arg6 == 3) {
            class28 var25;
            if (var15.field1146 == -1 && var15.field1133 == null) {
                var25 = var15.method406(3, arg5, var10, var11, var12, var13, -1);
            } else {
                var25 = new class22(var15.field1146, var13, var11, 3, var12, arg5, true, var10, (byte) 39, arg8);
            }
            arg3.method517(arg2, var16, field1411[arg5], arg0, arg7, 0, var17, var25, var14, null, false);
            if (var15.field1158) {
                if (arg5 == 0) {
                    this.field1388[arg0][arg7][arg2 + 1] = 50;
                } else if (arg5 == 1) {
                    this.field1388[arg0][arg7 + 1][arg2 + 1] = 50;
                } else if (arg5 == 2) {
                    this.field1388[arg0][arg7 + 1][arg2] = 50;
                } else if (arg5 == 3) {
                    this.field1388[arg0][arg7][arg2] = 50;
                }
            }
            if (var15.field1143 && arg4 != null) {
                arg4.method269(arg2, arg6, arg5, arg7, 8, var15.field1172);
            }
        } else if (arg6 == 9) {
            class28 var26;
            if (var15.field1146 == -1 && var15.field1133 == null) {
                var26 = var15.method406(arg6, arg5, var10, var11, var12, var13, -1);
            } else {
                var26 = new class22(var15.field1146, var13, var11, arg6, var12, arg5, true, var10, (byte) 39, arg8);
            }
            arg3.method519(arg2, var16, 0, 0, var14, 1, var26, 1, var17, arg0, arg7);
            if (var15.field1143 && arg4 != null) {
                arg4.method270(var15.field1134, arg2, 496, var15.field1172, var15.field1166, arg5, arg7);
            }
        } else {
            if (var15.field1138) {
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
            if (arg6 == 4) {
                class28 var31;
                if (var15.field1146 == -1 && var15.field1133 == null) {
                    var31 = var15.method406(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var31 = new class22(var15.field1146, var13, var11, 4, var12, 0, true, var10, (byte) 39, arg8);
                }
                arg3.method518(var31, arg5 * 512, field1410[arg5], var16, arg7, 0, arg2, 0, var14, arg0, var17, 1);
            } else if (arg6 == 5) {
                int var32 = 16;
                int var33 = arg3.method535(arg0, arg7, arg2);
                if (var33 > 0) {
                    var32 = class42.method405(var33 >> 14 & 0x7FFF).field1145;
                }
                class28 var34;
                if (var15.field1146 == -1 && var15.field1133 == null) {
                    var34 = var15.method406(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var34 = new class22(var15.field1146, var13, var11, 4, var12, 0, true, var10, (byte) 39, arg8);
                }
                arg3.method518(var34, arg5 * 512, field1410[arg5], var16, arg7, field1401[arg5] * var32, arg2, field1391[arg5] * var32, var14, arg0, var17, 1);
            } else if (arg6 == 6) {
                class28 var35;
                if (var15.field1146 == -1 && var15.field1133 == null) {
                    var35 = var15.method406(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var35 = new class22(var15.field1146, var13, var11, 4, var12, 0, true, var10, (byte) 39, arg8);
                }
                arg3.method518(var35, arg5, 256, var16, arg7, 0, arg2, 0, var14, arg0, var17, 1);
            } else if (arg6 == 7) {
                class28 var36;
                if (var15.field1146 == -1 && var15.field1133 == null) {
                    var36 = var15.method406(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var36 = new class22(var15.field1146, var13, var11, 4, var12, 0, true, var10, (byte) 39, arg8);
                }
                arg3.method518(var36, arg5, 512, var16, arg7, 0, arg2, 0, var14, arg0, var17, 1);
            } else if (arg6 == 8) {
                class28 var37;
                if (var15.field1146 == -1 && var15.field1133 == null) {
                    var37 = var15.method406(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var37 = new class22(var15.field1146, var13, var11, 4, var12, 0, true, var10, (byte) 39, arg8);
                }
                arg3.method518(var37, arg5, 768, var16, arg7, 0, arg2, 0, var14, arg0, var17, 1);
            }
        }
    }

    @OriginalMember(owner = "SNGUFYDX", name = "b", descriptor = "(III)I")
    private static final int method468(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method462(var3, var5);
        int var8 = method462(var3 + 1, var5);
        int var9 = method462(var3, var5 + 1);
        int var10 = method462(var3 + 1, var5 + 1);
        int var11 = method472(var7, var8, var4, arg2);
        int var12 = method472(var9, var10, var4, arg2);
        return method472(var11, var12, var6, arg2);
    }

    @OriginalMember(owner = "SNGUFYDX", name = "a", descriptor = "(I[LMNHXSMWL;[BBILUWQNYVPL;)V")
    public final void method469(int arg0, class31[] arg1, byte[] arg2, byte arg3, int arg4, class62 arg5) {
        if (arg3 != 107) {
            return;
        }
        class33 var7 = new class33(field1394, arg2);
        int var8 = -1;
        while (true) {
            int var9 = var7.method306();
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method306();
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = var10 & 0x3F;
                int var13 = var10 >> 6 & 0x3F;
                int var14 = var10 >> 12;
                int var15 = var7.method292();
                int var16 = var15 >> 2;
                int var17 = var15 & 0x3;
                int var18 = arg4 + var13;
                int var19 = arg0 + var12;
                if (var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) {
                    int var20 = var14;
                    if ((this.field1396[1][var18][var19] & 0x2) == 2) {
                        var20 = var14 - 1;
                    }
                    class31 var21 = null;
                    if (var20 >= 0) {
                        var21 = arg1[var20];
                    }
                    this.method467(var14, 6, var19, arg5, var21, var17, var16, var18, var8);
                }
            }
        }
    }

    @OriginalMember(owner = "SNGUFYDX", name = "a", descriptor = "(IIIB)I")
    public int method470(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 == 7) {
            boolean var5 = false;
        } else {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        if ((this.field1396[arg0][arg2][arg1] & 0x8) == 0) {
            return arg0 <= 0 || (this.field1396[1][arg2][arg1] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "SNGUFYDX", name = "c", descriptor = "(III)Z")
    public static final boolean method471(int arg0, int arg1, int arg2) {
        if (field1393 != arg2) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        class42 var4 = class42.method405(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var4.method401(arg1, (byte) 1);
    }

    @OriginalMember(owner = "SNGUFYDX", name = "a", descriptor = "(IIII)I")
    private static final int method472(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class48.field1286[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @OriginalMember(owner = "SNGUFYDX", name = "e", descriptor = "(II)I")
    private static final int method473(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "SNGUFYDX", name = "a", descriptor = "(IIIILMUKVLYLC;III)V")
    private final void method474(int arg0, int arg1, int arg2, int arg3, class33 arg4, int arg5, int arg6, int arg7) {
        int var9 = 1 / arg2;
        if (arg0 < 0 || arg0 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var12 = arg4.method292();
                if (var12 == 0) {
                    return;
                }
                if (var12 == 1) {
                    arg4.method292();
                    return;
                }
                if (var12 <= 49) {
                    arg4.method292();
                }
            }
        }
        this.field1396[arg1][arg0][arg3] = 0;
        while (true) {
            int var10 = arg4.method292();
            if (var10 == 0) {
                if (arg1 == 0) {
                    this.field1390[0][arg0][arg3] = -method458(arg0 + arg5 + 932731, arg3 + 556238 + arg7) * 8;
                    return;
                } else {
                    this.field1390[arg1][arg0][arg3] = this.field1390[arg1 - 1][arg0][arg3] - 240;
                    return;
                }
            }
            if (var10 == 1) {
                int var11 = arg4.method292();
                if (var11 == 1) {
                    var11 = 0;
                }
                if (arg1 == 0) {
                    this.field1390[0][arg0][arg3] = -var11 * 8;
                    return;
                }
                this.field1390[arg1][arg0][arg3] = this.field1390[arg1 - 1][arg0][arg3] - var11 * 8;
                return;
            }
            if (var10 <= 49) {
                this.field1400[arg1][arg0][arg3] = arg4.method293();
                this.field1417[arg1][arg0][arg3] = (byte) ((var10 - 2) / 4);
                this.field1399[arg1][arg0][arg3] = (byte) (var10 + arg6 - 2 & 0x3);
            } else if (var10 <= 81) {
                this.field1396[arg1][arg0][arg3] = (byte) (var10 - 49);
            } else {
                this.field1387[arg1][arg0][arg3] = (byte) (var10 - 81);
            }
        }
    }

    @OriginalMember(owner = "SNGUFYDX", name = "a", descriptor = "(LUWQNYVPL;[[[IIIIIILMNHXSMWL;III)V")
    public static final void method475(class62 arg0, int[][][] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class31 arg7, int arg8, int arg9, int arg10) {
        int var11 = arg1[arg8][arg10][arg6];
        int var12 = arg1[arg8][arg10 + 1][arg6];
        if (arg5 < 2 || arg5 > 2) {
            for (int var13 = 1; var13 > 0; var13++) {
            }
        }
        int var14 = arg1[arg8][arg10 + 1][arg6 + 1];
        int var15 = arg1[arg8][arg10][arg6 + 1];
        int var16 = var11 + var12 + var14 + var15 >> 2;
        class42 var17 = class42.method405(arg9);
        int var18 = (arg9 << 14) + (arg6 << 7) + arg10 + 1073741824;
        if (!var17.field1153) {
            var18 += Integer.MIN_VALUE;
        }
        byte var19 = (byte) ((arg3 << 6) + arg2);
        if (arg2 == 22) {
            class28 var20;
            if (var17.field1146 == -1 && var17.field1133 == null) {
                var20 = var17.method406(22, arg3, var11, var12, var14, var15, -1);
            } else {
                var20 = new class22(var17.field1146, var15, var12, 22, var14, arg3, true, var11, (byte) 39, arg9);
            }
            arg0.method515(var18, (byte) 119, var19, arg10, var20, var16, arg6, arg4);
            if (var17.field1143 && var17.field1153) {
                arg7.method271(arg6, 5, arg10);
            }
        } else if (arg2 == 10 || arg2 == 11) {
            class28 var40;
            if (var17.field1146 == -1 && var17.field1133 == null) {
                var40 = var17.method406(10, arg3, var11, var12, var14, var15, -1);
            } else {
                var40 = new class22(var17.field1146, var15, var12, 10, var14, arg3, true, var11, (byte) 39, arg9);
            }
            if (var40 != null) {
                int var41 = 0;
                if (arg2 == 11) {
                    var41 += 256;
                }
                int var42;
                int var43;
                if (arg3 == 1 || arg3 == 3) {
                    var42 = var17.field1166;
                    var43 = var17.field1134;
                } else {
                    var42 = var17.field1134;
                    var43 = var17.field1166;
                }
                arg0.method519(arg6, var18, 0, var41, var16, var42, var40, var43, var19, arg4, arg10);
            }
            if (var17.field1143) {
                arg7.method270(var17.field1134, arg6, 496, var17.field1172, var17.field1166, arg3, arg10);
            }
        } else if (arg2 >= 12) {
            class28 var21;
            if (var17.field1146 == -1 && var17.field1133 == null) {
                var21 = var17.method406(arg2, arg3, var11, var12, var14, var15, -1);
            } else {
                var21 = new class22(var17.field1146, var15, var12, arg2, var14, arg3, true, var11, (byte) 39, arg9);
            }
            arg0.method519(arg6, var18, 0, 0, var16, 1, var21, 1, var19, arg4, arg10);
            if (var17.field1143) {
                arg7.method270(var17.field1134, arg6, 496, var17.field1172, var17.field1166, arg3, arg10);
            }
        } else if (arg2 == 0) {
            class28 var22;
            if (var17.field1146 == -1 && var17.field1133 == null) {
                var22 = var17.method406(0, arg3, var11, var12, var14, var15, -1);
            } else {
                var22 = new class22(var17.field1146, var15, var12, 0, var14, arg3, true, var11, (byte) 39, arg9);
            }
            arg0.method517(arg6, var18, field1410[arg3], arg4, arg10, 0, var19, var22, var16, null, false);
            if (var17.field1143) {
                arg7.method269(arg6, arg2, arg3, arg10, 8, var17.field1172);
            }
        } else if (arg2 == 1) {
            class28 var23;
            if (var17.field1146 == -1 && var17.field1133 == null) {
                var23 = var17.method406(1, arg3, var11, var12, var14, var15, -1);
            } else {
                var23 = new class22(var17.field1146, var15, var12, 1, var14, arg3, true, var11, (byte) 39, arg9);
            }
            arg0.method517(arg6, var18, field1411[arg3], arg4, arg10, 0, var19, var23, var16, null, false);
            if (var17.field1143) {
                arg7.method269(arg6, arg2, arg3, arg10, 8, var17.field1172);
            }
        } else if (arg2 == 2) {
            int var24 = arg3 + 1 & 0x3;
            class28 var25;
            class28 var26;
            if (var17.field1146 == -1 && var17.field1133 == null) {
                var25 = var17.method406(2, arg3 + 4, var11, var12, var14, var15, -1);
                var26 = var17.method406(2, var24, var11, var12, var14, var15, -1);
            } else {
                var25 = new class22(var17.field1146, var15, var12, 2, var14, arg3 + 4, true, var11, (byte) 39, arg9);
                var26 = new class22(var17.field1146, var15, var12, 2, var14, var24, true, var11, (byte) 39, arg9);
            }
            arg0.method517(arg6, var18, field1410[arg3], arg4, arg10, field1410[var24], var19, var25, var16, var26, false);
            if (var17.field1143) {
                arg7.method269(arg6, arg2, arg3, arg10, 8, var17.field1172);
            }
        } else if (arg2 == 3) {
            class28 var27;
            if (var17.field1146 == -1 && var17.field1133 == null) {
                var27 = var17.method406(3, arg3, var11, var12, var14, var15, -1);
            } else {
                var27 = new class22(var17.field1146, var15, var12, 3, var14, arg3, true, var11, (byte) 39, arg9);
            }
            arg0.method517(arg6, var18, field1411[arg3], arg4, arg10, 0, var19, var27, var16, null, false);
            if (var17.field1143) {
                arg7.method269(arg6, arg2, arg3, arg10, 8, var17.field1172);
            }
        } else if (arg2 == 9) {
            class28 var28;
            if (var17.field1146 == -1 && var17.field1133 == null) {
                var28 = var17.method406(arg2, arg3, var11, var12, var14, var15, -1);
            } else {
                var28 = new class22(var17.field1146, var15, var12, arg2, var14, arg3, true, var11, (byte) 39, arg9);
            }
            arg0.method519(arg6, var18, 0, 0, var16, 1, var28, 1, var19, arg4, arg10);
            if (var17.field1143) {
                arg7.method270(var17.field1134, arg6, 496, var17.field1172, var17.field1166, arg3, arg10);
            }
        } else {
            if (var17.field1138) {
                if (arg3 == 1) {
                    int var29 = var15;
                    var15 = var14;
                    var14 = var12;
                    var12 = var11;
                    var11 = var29;
                } else if (arg3 == 2) {
                    int var30 = var15;
                    var15 = var12;
                    var12 = var30;
                    int var31 = var14;
                    var14 = var11;
                    var11 = var31;
                } else if (arg3 == 3) {
                    int var32 = var15;
                    var15 = var11;
                    var11 = var12;
                    var12 = var14;
                    var14 = var32;
                }
            }
            if (arg2 == 4) {
                class28 var33;
                if (var17.field1146 == -1 && var17.field1133 == null) {
                    var33 = var17.method406(4, 0, var11, var12, var14, var15, -1);
                } else {
                    var33 = new class22(var17.field1146, var15, var12, 4, var14, 0, true, var11, (byte) 39, arg9);
                }
                arg0.method518(var33, arg3 * 512, field1410[arg3], var18, arg10, 0, arg6, 0, var16, arg4, var19, 1);
            } else if (arg2 == 5) {
                int var34 = 16;
                int var35 = arg0.method535(arg4, arg10, arg6);
                if (var35 > 0) {
                    var34 = class42.method405(var35 >> 14 & 0x7FFF).field1145;
                }
                class28 var36;
                if (var17.field1146 == -1 && var17.field1133 == null) {
                    var36 = var17.method406(4, 0, var11, var12, var14, var15, -1);
                } else {
                    var36 = new class22(var17.field1146, var15, var12, 4, var14, 0, true, var11, (byte) 39, arg9);
                }
                arg0.method518(var36, arg3 * 512, field1410[arg3], var18, arg10, field1401[arg3] * var34, arg6, field1391[arg3] * var34, var16, arg4, var19, 1);
            } else if (arg2 == 6) {
                class28 var37;
                if (var17.field1146 == -1 && var17.field1133 == null) {
                    var37 = var17.method406(4, 0, var11, var12, var14, var15, -1);
                } else {
                    var37 = new class22(var17.field1146, var15, var12, 4, var14, 0, true, var11, (byte) 39, arg9);
                }
                arg0.method518(var37, arg3, 256, var18, arg10, 0, arg6, 0, var16, arg4, var19, 1);
            } else if (arg2 == 7) {
                class28 var38;
                if (var17.field1146 == -1 && var17.field1133 == null) {
                    var38 = var17.method406(4, 0, var11, var12, var14, var15, -1);
                } else {
                    var38 = new class22(var17.field1146, var15, var12, 4, var14, 0, true, var11, (byte) 39, arg9);
                }
                arg0.method518(var38, arg3, 512, var18, arg10, 0, arg6, 0, var16, arg4, var19, 1);
            } else if (arg2 == 8) {
                class28 var39;
                if (var17.field1146 == -1 && var17.field1133 == null) {
                    var39 = var17.method406(4, 0, var11, var12, var14, var15, -1);
                } else {
                    var39 = new class22(var17.field1146, var15, var12, 4, var14, 0, true, var11, (byte) 39, arg9);
                }
                arg0.method518(var39, arg3, 768, var18, arg10, 0, arg6, 0, var16, arg4, var19, 1);
            }
        }
    }
}
