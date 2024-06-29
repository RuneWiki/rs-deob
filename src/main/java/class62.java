import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!XAALPTAR")
public class class62 {

    @OriginalMember(owner = "client!XAALPTAR", name = "m", descriptor = "Z")
    private boolean field1525 = true;

    @OriginalMember(owner = "client!XAALPTAR", name = "t", descriptor = "I")
    private int field1532 = 8;

    @OriginalMember(owner = "client!XAALPTAR", name = "u", descriptor = "Z")
    private boolean field1533 = false;

    @OriginalMember(owner = "client!XAALPTAR", name = "w", descriptor = "Z")
    private boolean field1535 = true;

    @OriginalMember(owner = "client!XAALPTAR", name = "H", descriptor = "B")
    private byte field1546 = 1;

    @OriginalMember(owner = "client!XAALPTAR", name = "i", descriptor = "I")
    private int field1521;

    @OriginalMember(owner = "client!XAALPTAR", name = "j", descriptor = "I")
    private int field1522;

    @OriginalMember(owner = "client!XAALPTAR", name = "a", descriptor = "[[[I")
    private int[][][] field1513;

    @OriginalMember(owner = "client!XAALPTAR", name = "l", descriptor = "[[[B")
    private byte[][][] field1524;

    @OriginalMember(owner = "client!XAALPTAR", name = "e", descriptor = "[[[B")
    private byte[][][] field1517;

    @OriginalMember(owner = "client!XAALPTAR", name = "v", descriptor = "[[[B")
    private byte[][][] field1534;

    @OriginalMember(owner = "client!XAALPTAR", name = "E", descriptor = "[[[B")
    private byte[][][] field1543;

    @OriginalMember(owner = "client!XAALPTAR", name = "b", descriptor = "[[[B")
    private byte[][][] field1514;

    @OriginalMember(owner = "client!XAALPTAR", name = "f", descriptor = "[[[I")
    private int[][][] field1518;

    @OriginalMember(owner = "client!XAALPTAR", name = "C", descriptor = "[[[B")
    private byte[][][] field1541;

    @OriginalMember(owner = "client!XAALPTAR", name = "D", descriptor = "[[I")
    private int[][] field1542;

    @OriginalMember(owner = "client!XAALPTAR", name = "x", descriptor = "[I")
    private int[] field1536;

    @OriginalMember(owner = "client!XAALPTAR", name = "y", descriptor = "[I")
    private int[] field1537;

    @OriginalMember(owner = "client!XAALPTAR", name = "z", descriptor = "[I")
    private int[] field1538;

    @OriginalMember(owner = "client!XAALPTAR", name = "A", descriptor = "[I")
    private int[] field1539;

    @OriginalMember(owner = "client!XAALPTAR", name = "B", descriptor = "[I")
    private int[] field1540;

    @OriginalMember(owner = "client!XAALPTAR", name = "c", descriptor = "[I")
    private static final int[] field1515 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!XAALPTAR", name = "d", descriptor = "[I")
    private static final int[] field1516 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!XAALPTAR", name = "h", descriptor = "I")
    public static int field1520 = 99;

    @OriginalMember(owner = "client!XAALPTAR", name = "k", descriptor = "I")
    private static int field1523 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!XAALPTAR", name = "n", descriptor = "[I")
    private static final int[] field1526 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!XAALPTAR", name = "p", descriptor = "Z")
    private static boolean field1528 = true;

    @OriginalMember(owner = "client!XAALPTAR", name = "q", descriptor = "Z")
    private static boolean field1529 = true;

    @OriginalMember(owner = "client!XAALPTAR", name = "r", descriptor = "Z")
    public static boolean field1530 = true;

    @OriginalMember(owner = "client!XAALPTAR", name = "s", descriptor = "[I")
    private static final int[] field1531 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!XAALPTAR", name = "F", descriptor = "I")
    private static int field1544 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!XAALPTAR", name = "G", descriptor = "I")
    private static int field1545 = 31743;

    @OriginalMember(owner = "client!XAALPTAR", name = "g", descriptor = "I")
    public static int field1519;

    @OriginalMember(owner = "client!XAALPTAR", name = "o", descriptor = "I")
    private static int field1527;

    @OriginalMember(owner = "client!XAALPTAR", name = "a", descriptor = "(III)Z")
    public static final boolean method492(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            field1545 = 294;
        }
        class59 var3 = class59.method450(arg0);
        if (arg2 == 11) {
            arg2 = 10;
        }
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        return var3.method449(173, arg2);
    }

    @OriginalMember(owner = "client!XAALPTAR", name = "a", descriptor = "(II)I")
    private final int method493(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!XAALPTAR", name = "a", descriptor = "(BLYJCKMNKP;[LKQTHKTBC;)V")
    public final void method494(byte arg0, class67 arg1, class30[] arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var111 = 0; var111 < 104; var111++) {
                for (int var112 = 0; var112 < 104; var112++) {
                    if ((this.field1524[var4][var111][var112] & 0x1) == 1) {
                        int var113 = var4;
                        if ((this.field1524[1][var111][var112] & 0x2) == 2) {
                            var113 = var4 - 1;
                        }
                        if (var113 >= 0) {
                            arg2[var113].method286(-132, var112, var111);
                        }
                    }
                }
            }
        }
        field1523 += (int) (Math.random() * 5.0D) - 2;
        if (arg0 != 0) {
            return;
        }
        boolean var5 = false;
        if (field1523 < -8) {
            field1523 = -8;
        }
        if (field1523 > 8) {
            field1523 = 8;
        }
        field1544 += (int) (Math.random() * 5.0D) - 2;
        if (field1544 < -16) {
            field1544 = -16;
        }
        if (field1544 > 16) {
            field1544 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var49 = this.field1541[var6];
            byte var50 = 96;
            short var51 = 768;
            byte var52 = -50;
            byte var53 = -10;
            byte var54 = -50;
            int var55 = (int) Math.sqrt((double) (var54 * var54 + var52 * var52 + var53 * var53));
            int var56 = var51 * var55 >> 8;
            for (int var57 = 1; var57 < this.field1522 - 1; var57++) {
                for (int var102 = 1; var102 < this.field1521 - 1; var102++) {
                    int var103 = this.field1513[var6][var102 + 1][var57] - this.field1513[var6][var102 - 1][var57];
                    int var104 = this.field1513[var6][var102][var57 + 1] - this.field1513[var6][var102][var57 - 1];
                    int var105 = (int) Math.sqrt((double) (var104 * var104 + var103 * var103 + 65536));
                    int var106 = (var103 << 8) / var105;
                    int var107 = 65536 / var105;
                    int var108 = (var104 << 8) / var105;
                    int var109 = (var54 * var108 + var52 * var106 + var53 * var107) / var56 + var50;
                    int var110 = (var49[var102][var57] >> 1) + (var49[var102][var57 + 1] >> 3) + (var49[var102][var57 - 1] >> 2) + (var49[var102 - 1][var57] >> 2) + (var49[var102 + 1][var57] >> 3);
                    this.field1542[var102][var57] = var109 - var110;
                }
            }
            for (int var58 = 0; var58 < this.field1522; var58++) {
                this.field1536[var58] = 0;
                this.field1537[var58] = 0;
                this.field1538[var58] = 0;
                this.field1539[var58] = 0;
                this.field1540[var58] = 0;
            }
            for (int var59 = -5; var59 < this.field1521 + 5; var59++) {
                for (int var62 = 0; var62 < this.field1522; var62++) {
                    int var96 = var59 + 5;
                    int var10002;
                    if (var96 >= 0 && var96 < this.field1521) {
                        int var97 = this.field1517[var6][var96][var62] & 0xFF;
                        if (var97 > 0) {
                            class72 var98 = class72.field1749[var97 - 1];
                            this.field1536[var62] += var98.field1758;
                            this.field1537[var62] += var98.field1756;
                            this.field1538[var62] += var98.field1757;
                            this.field1539[var62] += var98.field1759;
                            var10002 = this.field1540[var62]++;
                        }
                    }
                    int var99 = var59 - 5;
                    if (var99 >= 0 && var99 < this.field1521) {
                        int var100 = this.field1517[var6][var99][var62] & 0xFF;
                        if (var100 > 0) {
                            class72 var101 = class72.field1749[var100 - 1];
                            this.field1536[var62] -= var101.field1758;
                            this.field1537[var62] -= var101.field1756;
                            this.field1538[var62] -= var101.field1757;
                            this.field1539[var62] -= var101.field1759;
                            var10002 = this.field1540[var62]--;
                        }
                    }
                }
                if (var59 >= 1 && var59 < this.field1521 - 1) {
                    int var63 = 0;
                    int var64 = 0;
                    int var65 = 0;
                    int var66 = 0;
                    int var67 = 0;
                    for (int var68 = -5; var68 < this.field1522 + 5; var68++) {
                        int var69 = var68 + 5;
                        if (var69 >= 0 && var69 < this.field1522) {
                            var63 += this.field1536[var69];
                            var64 += this.field1537[var69];
                            var65 += this.field1538[var69];
                            var66 += this.field1539[var69];
                            var67 += this.field1540[var69];
                        }
                        int var70 = var68 - 5;
                        if (var70 >= 0 && var70 < this.field1522) {
                            var63 -= this.field1536[var70];
                            var64 -= this.field1537[var70];
                            var65 -= this.field1538[var70];
                            var66 -= this.field1539[var70];
                            var67 -= this.field1540[var70];
                        }
                        if (var68 >= 1 && var68 < this.field1522 - 1 && (!field1530 || (this.field1524[0][var59][var68] & 0x2) != 0 || (this.field1524[var6][var59][var68] & 0x10) == 0 && this.method512(var68, var59, 6, var6) == field1519)) {
                            if (var6 < field1520) {
                                field1520 = var6;
                            }
                            int var71 = this.field1517[var6][var59][var68] & 0xFF;
                            int var72 = this.field1534[var6][var59][var68] & 0xFF;
                            if (var71 > 0 || var72 > 0) {
                                int var73 = this.field1513[var6][var59][var68];
                                int var74 = this.field1513[var6][var59 + 1][var68];
                                int var75 = this.field1513[var6][var59 + 1][var68 + 1];
                                int var76 = this.field1513[var6][var59][var68 + 1];
                                int var77 = this.field1542[var59][var68];
                                int var78 = this.field1542[var59 + 1][var68];
                                int var79 = this.field1542[var59 + 1][var68 + 1];
                                int var80 = this.field1542[var59][var68 + 1];
                                int var81 = -1;
                                int var82 = -1;
                                if (var71 > 0) {
                                    int var83 = var63 * 256 / var66;
                                    int var84 = var64 / var67;
                                    int var85 = var65 / var67;
                                    var81 = this.method507(var83, var84, var85);
                                    int var86 = field1523 + var83 & 0xFF;
                                    int var87 = field1544 + var85;
                                    if (var87 < 0) {
                                        var87 = 0;
                                    } else if (var87 > 255) {
                                        var87 = 255;
                                    }
                                    var82 = this.method507(var86, var84, var87);
                                }
                                if (var6 > 0) {
                                    boolean var88 = true;
                                    if (var71 == 0 && this.field1543[var6][var59][var68] != 0) {
                                        var88 = false;
                                    }
                                    if (var72 > 0 && !class72.field1749[var72 - 1].field1754) {
                                        var88 = false;
                                    }
                                    if (var88 && var73 == var74 && var73 == var75 && var73 == var76) {
                                        this.field1518[var6][var59][var68] |= 0x924;
                                    }
                                }
                                int var89 = 0;
                                if (var81 != -1) {
                                    var89 = class63.field1571[method506(var82, 96)];
                                }
                                if (var72 == 0) {
                                    arg1.method547(var6, var59, var68, 0, 0, -1, var73, var74, var75, var76, method506(var81, var77), method506(var81, var78), method506(var81, var79), method506(var81, var80), 0, 0, 0, 0, var89, 0);
                                } else {
                                    int var90 = this.field1543[var6][var59][var68] + 1;
                                    byte var91 = this.field1514[var6][var59][var68];
                                    class72 var92 = class72.field1749[var72 - 1];
                                    int var93 = var92.field1752;
                                    int var94;
                                    int var95;
                                    if (var93 >= 0) {
                                        var94 = class63.method520(var93, 2);
                                        var95 = -1;
                                    } else if (var92.field1751 == 16711935) {
                                        var95 = -2;
                                        var93 = -1;
                                        var94 = class63.field1571[this.method493(var92.field1760, 96)];
                                    } else {
                                        var95 = this.method507(var92.field1755, var92.field1756, var92.field1757);
                                        var94 = class63.field1571[this.method493(var92.field1760, 96)];
                                    }
                                    arg1.method547(var6, var59, var68, var90, var91, var93, var73, var74, var75, var76, method506(var81, var77), method506(var81, var78), method506(var81, var79), method506(var81, var80), this.method493(var95, var77), this.method493(var95, var78), this.method493(var95, var79), this.method493(var95, var80), var89, var94);
                                }
                            }
                        }
                    }
                }
            }
            for (int var60 = 1; var60 < this.field1522 - 1; var60++) {
                for (int var61 = 1; var61 < this.field1521 - 1; var61++) {
                    arg1.method546(var6, var61, var60, this.method512(var60, var61, 6, var6));
                }
            }
        }
        arg1.method573(-50, 901, -50, -10);
        for (int var7 = 0; var7 < this.field1521; var7++) {
            for (int var48 = 0; var48 < this.field1522; var48++) {
                if ((this.field1524[1][var7][var48] & 0x2) == 2) {
                    arg1.method544(var7, var48, this.field1535);
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
                for (int var13 = 0; var13 <= this.field1522; var13++) {
                    for (int var14 = 0; var14 <= this.field1521; var14++) {
                        if ((this.field1518[var12][var14][var13] & var8) != 0) {
                            int var15 = var13;
                            int var16 = var13;
                            int var17 = var12;
                            int var18 = var12;
                            while (var15 > 0 && (this.field1518[var12][var14][var15 - 1] & var8) != 0) {
                                var15--;
                            }
                            while (var16 < this.field1522 && (this.field1518[var12][var14][var16 + 1] & var8) != 0) {
                                var16++;
                            }
                            label330: while (var17 > 0) {
                                for (int var19 = var15; var19 <= var16; var19++) {
                                    if ((this.field1518[var17 - 1][var14][var19] & var8) == 0) {
                                        break label330;
                                    }
                                }
                                var17--;
                            }
                            label319: while (var18 < var11) {
                                for (int var20 = var15; var20 <= var16; var20++) {
                                    if ((this.field1518[var18 + 1][var14][var20] & var8) == 0) {
                                        break label319;
                                    }
                                }
                                var18++;
                            }
                            int var21 = (var18 + 1 - var17) * (var16 - var15 + 1);
                            if (var21 >= 8) {
                                short var22 = 240;
                                int var23 = this.field1513[var18][var14][var15] - var22;
                                int var24 = this.field1513[var17][var14][var15];
                                class67.method545(var23, var11, -170, var16 * 128 + 128, var14 * 128, var15 * 128, var24, var14 * 128, 1);
                                for (int var25 = var17; var25 <= var18; var25++) {
                                    for (int var26 = var15; var26 <= var16; var26++) {
                                        this.field1518[var25][var14][var26] &= ~var8;
                                    }
                                }
                            }
                        }
                        if ((this.field1518[var12][var14][var13] & var9) != 0) {
                            int var27 = var14;
                            int var28 = var14;
                            int var29 = var12;
                            int var30 = var12;
                            while (var27 > 0 && (this.field1518[var12][var27 - 1][var13] & var9) != 0) {
                                var27--;
                            }
                            while (var28 < this.field1521 && (this.field1518[var12][var28 + 1][var13] & var9) != 0) {
                                var28++;
                            }
                            label383: while (var29 > 0) {
                                for (int var31 = var27; var31 <= var28; var31++) {
                                    if ((this.field1518[var29 - 1][var31][var13] & var9) == 0) {
                                        break label383;
                                    }
                                }
                                var29--;
                            }
                            label372: while (var30 < var11) {
                                for (int var32 = var27; var32 <= var28; var32++) {
                                    if ((this.field1518[var30 + 1][var32][var13] & var9) == 0) {
                                        break label372;
                                    }
                                }
                                var30++;
                            }
                            int var33 = (var30 + 1 - var29) * (var28 - var27 + 1);
                            if (var33 >= 8) {
                                short var34 = 240;
                                int var35 = this.field1513[var30][var27][var13] - var34;
                                int var36 = this.field1513[var29][var27][var13];
                                class67.method545(var35, var11, -170, var13 * 128, var28 * 128 + 128, var13 * 128, var36, var27 * 128, 2);
                                for (int var37 = var29; var37 <= var30; var37++) {
                                    for (int var38 = var27; var38 <= var28; var38++) {
                                        this.field1518[var37][var38][var13] &= ~var9;
                                    }
                                }
                            }
                        }
                        if ((this.field1518[var12][var14][var13] & var10) != 0) {
                            int var39 = var14;
                            int var40 = var14;
                            int var41 = var13;
                            int var42 = var13;
                            while (var41 > 0 && (this.field1518[var12][var14][var41 - 1] & var10) != 0) {
                                var41--;
                            }
                            while (var42 < this.field1522 && (this.field1518[var12][var14][var42 + 1] & var10) != 0) {
                                var42++;
                            }
                            label436: while (var39 > 0) {
                                for (int var43 = var41; var43 <= var42; var43++) {
                                    if ((this.field1518[var12][var39 - 1][var43] & var10) == 0) {
                                        break label436;
                                    }
                                }
                                var39--;
                            }
                            label425: while (var40 < this.field1521) {
                                for (int var44 = var41; var44 <= var42; var44++) {
                                    if ((this.field1518[var12][var40 + 1][var44] & var10) == 0) {
                                        break label425;
                                    }
                                }
                                var40++;
                            }
                            if ((var40 + 1 - var39) * (var42 - var41 + 1) >= 4) {
                                int var45 = this.field1513[var12][var39][var41];
                                class67.method545(var45, var11, -170, var42 * 128 + 128, var40 * 128 + 128, var41 * 128, var45, var39 * 128, 4);
                                for (int var46 = var39; var46 <= var40; var46++) {
                                    for (int var47 = var41; var47 <= var42; var47++) {
                                        this.field1518[var12][var46][var47] &= ~var10;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!XAALPTAR", name = "b", descriptor = "(III)I")
    private static final int method495(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method498(var3, var5);
        int var8 = method498(var3 + 1, var5);
        int var9 = method498(var3, var5 + 1);
        int var10 = method498(var3 + 1, var5 + 1);
        int var11 = method503(var7, var8, var4, arg2);
        int var12 = method503(var9, var10, var4, arg2);
        return method503(var11, var12, var6, arg2);
    }

    @OriginalMember(owner = "client!XAALPTAR", name = "a", descriptor = "(IIIBI)V")
    public final void method496(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        for (int var6 = arg1; var6 <= arg1 + arg4; var6++) {
            for (int var7 = arg0; var7 <= arg0 + arg2; var7++) {
                if (var7 >= 0 && var7 < this.field1521 && var6 >= 0 && var6 < this.field1522) {
                    this.field1541[0][var7][var6] = 127;
                    if (arg0 == var7 && var7 > 0) {
                        this.field1513[0][var7][var6] = this.field1513[0][var7 - 1][var6];
                    }
                    if (arg0 + arg2 == var7 && var7 < this.field1521 - 1) {
                        this.field1513[0][var7][var6] = this.field1513[0][var7 + 1][var6];
                    }
                    if (arg1 == var6 && var6 > 0) {
                        this.field1513[0][var7][var6] = this.field1513[0][var7][var6 - 1];
                    }
                    if (arg1 + arg4 == var6 && var6 < this.field1522 - 1) {
                        this.field1513[0][var7][var6] = this.field1513[0][var7][var6 + 1];
                    }
                }
            }
        }
        if (arg3 != -60) {
            field1527 = 380;
        }
    }

    @OriginalMember(owner = "client!XAALPTAR", name = "a", descriptor = "([BIIZI[LKQTHKTBC;IILYJCKMNKP;II)V")
    public final void method497(byte[] arg0, int arg1, int arg2, boolean arg3, int arg4, class30[] arg5, int arg6, int arg7, class67 arg8, int arg9, int arg10) {
        if (!arg3) {
            this.field1525 = !this.field1525;
        }
        class50 var12 = new class50(arg0, -46859);
        int var13 = -1;
        while (true) {
            int var14 = var12.method402();
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method402();
                if (var16 == 0) {
                    break;
                }
                var15 += var16 - 1;
                int var17 = var15 & 0x3F;
                int var18 = var15 >> 6 & 0x3F;
                int var19 = var15 >> 12;
                int var20 = var12.method388();
                int var21 = var20 >> 2;
                int var22 = var20 & 0x3;
                if (arg9 == var19 && var18 >= arg7 && var18 < arg7 + 8 && var17 >= arg2 && var17 < arg2 + 8) {
                    class59 var23 = class59.method450(var13);
                    int var24 = arg1 + class66.method539(var22, var23.field1411, var17 & 0x7, (byte) -105, arg6, var18 & 0x7, var23.field1379);
                    int var25 = arg10 + class66.method540(arg6, var18 & 0x7, 197, var17 & 0x7, var23.field1379, var22, var23.field1411);
                    if (var24 > 0 && var25 > 0 && var24 < 103 && var25 < 103) {
                        int var26 = arg4;
                        if ((this.field1524[1][var24][var25] & 0x2) == 2) {
                            var26 = arg4 - 1;
                        }
                        class30 var27 = null;
                        if (var26 >= 0) {
                            var27 = arg5[var26];
                        }
                        this.method509(arg6 + var22 & 0x3, var24, 0, var25, arg4, var13, var21, var27, arg8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!XAALPTAR", name = "b", descriptor = "(II)I")
    private static final int method498(int arg0, int arg1) {
        int var2 = method511(arg0 - 1, arg1 - 1) + method511(arg0 + 1, arg1 - 1) + method511(arg0 - 1, arg1 + 1) + method511(arg0 + 1, arg1 + 1);
        int var3 = method511(arg0 - 1, arg1) + method511(arg0 + 1, arg1) + method511(arg0, arg1 - 1) + method511(arg0, arg1 + 1);
        int var4 = method511(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @OriginalMember(owner = "client!XAALPTAR", name = "a", descriptor = "(I[BIZ)Z")
    public static final boolean method499(int arg0, byte[] arg1, int arg2, boolean arg3) {
        boolean var4 = true;
        class50 var5 = new class50(arg1, -46859);
        if (arg3) {
            field1527 = -262;
        }
        int var6 = -1;
        label54: while (true) {
            int var7 = var5.method402();
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method402();
                    if (var11 == 0) {
                        continue label54;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = var5.method388() >> 2;
                    int var15 = arg0 + var13;
                    int var16 = arg2 + var12;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        class59 var17 = class59.method450(var6);
                        if (var14 != 22 || !field1530 || var17.field1365 || var17.field1394) {
                            var4 &= var17.method453(0);
                            var9 = true;
                        }
                    }
                }
                int var10 = var5.method402();
                if (var10 == 0) {
                    break;
                }
                var5.method388();
            }
        }
    }

    @OriginalMember(owner = "client!XAALPTAR", name = "c", descriptor = "(II)I")
    private static final int method500(int arg0, int arg1) {
        int var2 = method495(arg0 + 45365, arg1 + 91923, 4) + (method495(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method495(arg0, arg1, 1) - 128 >> 2) - 128;
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @OriginalMember(owner = "client!XAALPTAR", name = "a", descriptor = "(IIII)V")
    public final void method501(int arg0, int arg1, int arg2, int arg3) {
        if (field1545 != arg2) {
            return;
        }
        for (int var5 = 0; var5 < 8; var5++) {
            for (int var8 = 0; var8 < 8; var8++) {
                this.field1513[arg3][arg0 + var5][arg1 + var8] = 0;
            }
        }
        if (arg0 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                this.field1513[arg3][arg0][arg1 + var6] = this.field1513[arg3][arg0 - 1][arg1 + var6];
            }
        }
        if (arg1 > 0) {
            for (int var7 = 1; var7 < 8; var7++) {
                this.field1513[arg3][arg0 + var7][arg1] = this.field1513[arg3][arg0 + var7][arg1 - 1];
            }
        }
        if (arg0 > 0 && this.field1513[arg3][arg0 - 1][arg1] != 0) {
            this.field1513[arg3][arg0][arg1] = this.field1513[arg3][arg0 - 1][arg1];
        } else if (arg1 > 0 && this.field1513[arg3][arg0][arg1 - 1] != 0) {
            this.field1513[arg3][arg0][arg1] = this.field1513[arg3][arg0][arg1 - 1];
        } else if (arg0 > 0 && arg1 > 0 && this.field1513[arg3][arg0 - 1][arg1 - 1] != 0) {
            this.field1513[arg3][arg0][arg1] = this.field1513[arg3][arg0 - 1][arg1 - 1];
        }
    }

    @OriginalMember(owner = "client!XAALPTAR", name = "a", descriptor = "(II[LKQTHKTBC;IIIZI[BI)V")
    public final void method502(int arg0, int arg1, class30[] arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, byte[] arg8, int arg9) {
        for (int var11 = 0; var11 < 8; var11++) {
            for (int var16 = 0; var16 < 8; var16++) {
                if (arg3 + var11 > 0 && arg3 + var11 < 103 && arg4 + var16 > 0 && arg4 + var16 < 103) {
                    arg2[arg7].field921[arg3 + var11][arg4 + var16] &= 0xFEFFFFFF;
                }
            }
        }
        class50 var12 = new class50(arg8, -46859);
        if (!arg6) {
            return;
        }
        for (int var13 = 0; var13 < 4; var13++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    if (arg0 == var13 && var14 >= arg9 && var14 < arg9 + 8 && var15 >= arg1 && var15 < arg1 + 8) {
                        this.method508(0, arg3 + class66.method537(true, arg5, var14 & 0x7, var15 & 0x7), 0, arg4 + class66.method538(arg5, var15 & 0x7, var14 & 0x7, this.field1546), arg7, 8, var12, arg5);
                    } else {
                        this.method508(0, -1, 0, -1, 0, 8, var12, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!XAALPTAR", name = "b", descriptor = "(IIII)I")
    private static final int method503(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class63.field1560[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @OriginalMember(owner = "client!XAALPTAR", name = "a", descriptor = "(LRSWRPCHR;ZLQJAHKUCY;)V")
    public static final void method504(class50 arg0, boolean arg1, class47 arg2) {
        if (!arg1) {
            field1528 = !field1528;
        }
        int var3 = -1;
        while (true) {
            int var4 = arg0.method402();
            if (var4 == 0) {
                return;
            }
            var3 += var4;
            class59 var5 = class59.method450(var3);
            var5.method454(arg2, false);
            while (true) {
                int var6 = arg0.method402();
                if (var6 == 0) {
                    break;
                }
                arg0.method388();
            }
        }
    }

    @OriginalMember(owner = "client!XAALPTAR", name = "a", descriptor = "(IIZ[LKQTHKTBC;LYJCKMNKP;[B)V")
    public final void method505(int arg0, int arg1, boolean arg2, class30[] arg3, class67 arg4, byte[] arg5) {
        class50 var7 = new class50(arg5, -46859);
        if (!arg2) {
            field1527 = 262;
        }
        int var8 = -1;
        while (true) {
            int var9 = var7.method402();
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method402();
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = var10 & 0x3F;
                int var13 = var10 >> 6 & 0x3F;
                int var14 = var10 >> 12;
                int var15 = var7.method388();
                int var16 = var15 >> 2;
                int var17 = var15 & 0x3;
                int var18 = arg0 + var13;
                int var19 = arg1 + var12;
                if (var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) {
                    int var20 = var14;
                    if ((this.field1524[1][var18][var19] & 0x2) == 2) {
                        var20 = var14 - 1;
                    }
                    class30 var21 = null;
                    if (var20 >= 0) {
                        var21 = arg3[var20];
                    }
                    this.method509(var17, var18, 0, var19, var14, var8, var16, var21, arg4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!XAALPTAR", name = "d", descriptor = "(II)I")
    private static final int method506(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!XAALPTAR", name = "c", descriptor = "(III)I")
    private final int method507(int arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "client!XAALPTAR", name = "a", descriptor = "(IIIIIILRSWRPCHR;I)V")
    private final void method508(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class50 arg6, int arg7) {
        if (arg5 < this.field1532 || arg5 > this.field1532) {
            field1528 = !field1528;
        }
        if (arg1 < 0 || arg1 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var11 = arg6.method388();
                if (var11 == 0) {
                    return;
                }
                if (var11 == 1) {
                    arg6.method388();
                    return;
                }
                if (var11 <= 49) {
                    arg6.method388();
                }
            }
        }
        this.field1524[arg4][arg1][arg3] = 0;
        while (true) {
            int var9 = arg6.method388();
            if (var9 == 0) {
                if (arg4 == 0) {
                    this.field1513[0][arg1][arg3] = -method500(arg1 + arg2 + 932731, arg3 + 556238 + arg0) * 8;
                    return;
                } else {
                    this.field1513[arg4][arg1][arg3] = this.field1513[arg4 - 1][arg1][arg3] - 240;
                    return;
                }
            }
            if (var9 == 1) {
                int var10 = arg6.method388();
                if (var10 == 1) {
                    var10 = 0;
                }
                if (arg4 == 0) {
                    this.field1513[0][arg1][arg3] = -var10 * 8;
                    return;
                }
                this.field1513[arg4][arg1][arg3] = this.field1513[arg4 - 1][arg1][arg3] - var10 * 8;
                return;
            }
            if (var9 <= 49) {
                this.field1534[arg4][arg1][arg3] = arg6.method389();
                this.field1543[arg4][arg1][arg3] = (byte) ((var9 - 2) / 4);
                this.field1514[arg4][arg1][arg3] = (byte) (var9 + arg7 - 2 & 0x3);
            } else if (var9 <= 81) {
                this.field1524[arg4][arg1][arg3] = (byte) (var9 - 49);
            } else {
                this.field1517[arg4][arg1][arg3] = (byte) (var9 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!XAALPTAR", name = "a", descriptor = "(IIIIIIILKQTHKTBC;LYJCKMNKP;)V")
    private final void method509(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class30 arg7, class67 arg8) {
        if (field1530 && (this.field1524[0][arg1][arg3] & 0x2) == 0) {
            if ((this.field1524[arg4][arg1][arg3] & 0x10) != 0) {
                return;
            }
            if (this.method512(arg3, arg1, 6, arg4) != field1519) {
                return;
            }
        }
        if (arg4 < field1520) {
            field1520 = arg4;
        }
        int var10 = this.field1513[arg4][arg1][arg3];
        int var11 = this.field1513[arg4][arg1 + 1][arg3];
        int var12 = this.field1513[arg4][arg1 + 1][arg3 + 1];
        int var13 = this.field1513[arg4][arg1][arg3 + 1];
        int var14 = var10 + var11 + var12 + var13 >> 2;
        if (arg2 != 0) {
            return;
        }
        class59 var15 = class59.method450(arg5);
        int var16 = (arg5 << 14) + (arg3 << 7) + arg1 + 1073741824;
        if (!var15.field1365) {
            var16 += Integer.MIN_VALUE;
        }
        byte var17 = (byte) ((arg0 << 6) + arg6);
        if (arg6 == 22) {
            if (!field1530 || var15.field1365 || var15.field1394) {
                class16 var18;
                if (var15.field1402 == -1 && var15.field1373 == null) {
                    var18 = var15.method457(22, arg0, var10, var11, var12, var13, -1);
                } else {
                    var18 = new class48(var12, arg5, arg0, 466, 22, var13, var11, var15.field1402, var10, true);
                }
                arg8.method548(var16, arg1, true, var14, arg3, arg4, var17, var18);
                if (var15.field1367 && var15.field1365 && arg7 != null) {
                    arg7.method286(-132, arg3, arg1);
                }
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class16 var38;
            if (var15.field1402 == -1 && var15.field1373 == null) {
                var38 = var15.method457(10, arg0, var10, var11, var12, var13, -1);
            } else {
                var38 = new class48(var12, arg5, arg0, 466, 10, var13, var11, var15.field1402, var10, true);
            }
            if (var38 != null) {
                int var39 = 0;
                if (arg6 == 11) {
                    var39 += 256;
                }
                int var40;
                int var41;
                if (arg0 == 1 || arg0 == 3) {
                    var40 = var15.field1379;
                    var41 = var15.field1411;
                } else {
                    var40 = var15.field1411;
                    var41 = var15.field1379;
                }
                if (arg8.method552(var39, arg3, var38, arg4, var40, arg1, var17, var41, -237, var14, var16) && var15.field1382) {
                    class61 var42;
                    if (var38 instanceof class61) {
                        var42 = (class61) var38;
                    } else {
                        var42 = var15.method457(10, arg0, var10, var11, var12, var13, -1);
                    }
                    if (var42 != null) {
                        for (int var43 = 0; var43 <= var40; var43++) {
                            for (int var44 = 0; var44 <= var41; var44++) {
                                int var45 = var42.field1470 / 4;
                                if (var45 > 30) {
                                    var45 = 30;
                                }
                                if (var45 > this.field1541[arg4][arg1 + var43][arg3 + var44]) {
                                    this.field1541[arg4][arg1 + var43][arg3 + var44] = (byte) var45;
                                }
                            }
                        }
                    }
                }
            }
            if (var15.field1367 && arg7 != null) {
                arg7.method285(arg3, var15.field1379, arg0, var15.field1410, arg1, -127, var15.field1411);
            }
        } else if (arg6 >= 12) {
            class16 var19;
            if (var15.field1402 == -1 && var15.field1373 == null) {
                var19 = var15.method457(arg6, arg0, var10, var11, var12, var13, -1);
            } else {
                var19 = new class48(var12, arg5, arg0, 466, arg6, var13, var11, var15.field1402, var10, true);
            }
            arg8.method552(0, arg3, var19, arg4, 1, arg1, var17, 1, -237, var14, var16);
            if (arg6 >= 12 && arg6 <= 17 && arg6 != 13 && arg4 > 0) {
                this.field1518[arg4][arg1][arg3] |= 0x924;
            }
            if (var15.field1367 && arg7 != null) {
                arg7.method285(arg3, var15.field1379, arg0, var15.field1410, arg1, -127, var15.field1411);
            }
        } else if (arg6 == 0) {
            class16 var20;
            if (var15.field1402 == -1 && var15.field1373 == null) {
                var20 = var15.method457(0, arg0, var10, var11, var12, var13, -1);
            } else {
                var20 = new class48(var12, arg5, arg0, 466, 0, var13, var11, var15.field1402, var10, true);
            }
            arg8.method550(null, (byte) 3, arg1, arg3, field1516[arg0], arg4, var17, var16, var20, 0, var14);
            if (arg0 == 0) {
                if (var15.field1382) {
                    this.field1541[arg4][arg1][arg3] = 50;
                    this.field1541[arg4][arg1][arg3 + 1] = 50;
                }
                if (var15.field1395) {
                    this.field1518[arg4][arg1][arg3] |= 0x249;
                }
            } else if (arg0 == 1) {
                if (var15.field1382) {
                    this.field1541[arg4][arg1][arg3 + 1] = 50;
                    this.field1541[arg4][arg1 + 1][arg3 + 1] = 50;
                }
                if (var15.field1395) {
                    this.field1518[arg4][arg1][arg3 + 1] |= 0x492;
                }
            } else if (arg0 == 2) {
                if (var15.field1382) {
                    this.field1541[arg4][arg1 + 1][arg3] = 50;
                    this.field1541[arg4][arg1 + 1][arg3 + 1] = 50;
                }
                if (var15.field1395) {
                    this.field1518[arg4][arg1 + 1][arg3] |= 0x249;
                }
            } else if (arg0 == 3) {
                if (var15.field1382) {
                    this.field1541[arg4][arg1][arg3] = 50;
                    this.field1541[arg4][arg1 + 1][arg3] = 50;
                }
                if (var15.field1395) {
                    this.field1518[arg4][arg1][arg3] |= 0x492;
                }
            }
            if (var15.field1367 && arg7 != null) {
                arg7.method284(arg6, (byte) 78, arg1, var15.field1410, arg3, arg0);
            }
            if (var15.field1384 != 16) {
                arg8.method558(877, arg4, var15.field1384, arg3, arg1);
            }
        } else if (arg6 == 1) {
            class16 var21;
            if (var15.field1402 == -1 && var15.field1373 == null) {
                var21 = var15.method457(1, arg0, var10, var11, var12, var13, -1);
            } else {
                var21 = new class48(var12, arg5, arg0, 466, 1, var13, var11, var15.field1402, var10, true);
            }
            arg8.method550(null, (byte) 3, arg1, arg3, field1526[arg0], arg4, var17, var16, var21, 0, var14);
            if (var15.field1382) {
                if (arg0 == 0) {
                    this.field1541[arg4][arg1][arg3 + 1] = 50;
                } else if (arg0 == 1) {
                    this.field1541[arg4][arg1 + 1][arg3 + 1] = 50;
                } else if (arg0 == 2) {
                    this.field1541[arg4][arg1 + 1][arg3] = 50;
                } else if (arg0 == 3) {
                    this.field1541[arg4][arg1][arg3] = 50;
                }
            }
            if (var15.field1367 && arg7 != null) {
                arg7.method284(arg6, (byte) 78, arg1, var15.field1410, arg3, arg0);
            }
        } else if (arg6 == 2) {
            int var22 = arg0 + 1 & 0x3;
            class16 var23;
            class16 var24;
            if (var15.field1402 == -1 && var15.field1373 == null) {
                var23 = var15.method457(2, arg0 + 4, var10, var11, var12, var13, -1);
                var24 = var15.method457(2, var22, var10, var11, var12, var13, -1);
            } else {
                var23 = new class48(var12, arg5, arg0 + 4, 466, 2, var13, var11, var15.field1402, var10, true);
                var24 = new class48(var12, arg5, var22, 466, 2, var13, var11, var15.field1402, var10, true);
            }
            arg8.method550(var24, (byte) 3, arg1, arg3, field1516[arg0], arg4, var17, var16, var23, field1516[var22], var14);
            if (var15.field1395) {
                if (arg0 == 0) {
                    this.field1518[arg4][arg1][arg3] |= 0x249;
                    this.field1518[arg4][arg1][arg3 + 1] |= 0x492;
                } else if (arg0 == 1) {
                    this.field1518[arg4][arg1][arg3 + 1] |= 0x492;
                    this.field1518[arg4][arg1 + 1][arg3] |= 0x249;
                } else if (arg0 == 2) {
                    this.field1518[arg4][arg1 + 1][arg3] |= 0x249;
                    this.field1518[arg4][arg1][arg3] |= 0x492;
                } else if (arg0 == 3) {
                    this.field1518[arg4][arg1][arg3] |= 0x492;
                    this.field1518[arg4][arg1][arg3] |= 0x249;
                }
            }
            if (var15.field1367 && arg7 != null) {
                arg7.method284(arg6, (byte) 78, arg1, var15.field1410, arg3, arg0);
            }
            if (var15.field1384 != 16) {
                arg8.method558(877, arg4, var15.field1384, arg3, arg1);
            }
        } else if (arg6 == 3) {
            class16 var25;
            if (var15.field1402 == -1 && var15.field1373 == null) {
                var25 = var15.method457(3, arg0, var10, var11, var12, var13, -1);
            } else {
                var25 = new class48(var12, arg5, arg0, 466, 3, var13, var11, var15.field1402, var10, true);
            }
            arg8.method550(null, (byte) 3, arg1, arg3, field1526[arg0], arg4, var17, var16, var25, 0, var14);
            if (var15.field1382) {
                if (arg0 == 0) {
                    this.field1541[arg4][arg1][arg3 + 1] = 50;
                } else if (arg0 == 1) {
                    this.field1541[arg4][arg1 + 1][arg3 + 1] = 50;
                } else if (arg0 == 2) {
                    this.field1541[arg4][arg1 + 1][arg3] = 50;
                } else if (arg0 == 3) {
                    this.field1541[arg4][arg1][arg3] = 50;
                }
            }
            if (var15.field1367 && arg7 != null) {
                arg7.method284(arg6, (byte) 78, arg1, var15.field1410, arg3, arg0);
            }
        } else if (arg6 == 9) {
            class16 var26;
            if (var15.field1402 == -1 && var15.field1373 == null) {
                var26 = var15.method457(arg6, arg0, var10, var11, var12, var13, -1);
            } else {
                var26 = new class48(var12, arg5, arg0, 466, arg6, var13, var11, var15.field1402, var10, true);
            }
            arg8.method552(0, arg3, var26, arg4, 1, arg1, var17, 1, -237, var14, var16);
            if (var15.field1367 && arg7 != null) {
                arg7.method285(arg3, var15.field1379, arg0, var15.field1410, arg1, -127, var15.field1411);
            }
        } else {
            if (var15.field1369) {
                if (arg0 == 1) {
                    int var27 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var10;
                    var10 = var27;
                } else if (arg0 == 2) {
                    int var28 = var13;
                    var13 = var11;
                    var11 = var28;
                    int var29 = var12;
                    var12 = var10;
                    var10 = var29;
                } else if (arg0 == 3) {
                    int var30 = var13;
                    var13 = var10;
                    var10 = var11;
                    var11 = var12;
                    var12 = var30;
                }
            }
            if (arg6 == 4) {
                class16 var31;
                if (var15.field1402 == -1 && var15.field1373 == null) {
                    var31 = var15.method457(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var31 = new class48(var12, arg5, 0, 466, 4, var13, var11, var15.field1402, var10, true);
                }
                arg8.method551(var14, arg4, arg1, var16, 0, arg0 * 512, var17, arg3, var31, 0, field1516[arg0], true);
            } else if (arg6 == 5) {
                int var32 = 16;
                int var33 = arg8.method568(arg4, arg1, arg3);
                if (var33 > 0) {
                    var32 = class59.method450(var33 >> 14 & 0x7FFF).field1384;
                }
                class16 var34;
                if (var15.field1402 == -1 && var15.field1373 == null) {
                    var34 = var15.method457(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var34 = new class48(var12, arg5, 0, 466, 4, var13, var11, var15.field1402, var10, true);
                }
                arg8.method551(var14, arg4, arg1, var16, field1515[arg0] * var32, arg0 * 512, var17, arg3, var34, field1531[arg0] * var32, field1516[arg0], true);
            } else if (arg6 == 6) {
                class16 var35;
                if (var15.field1402 == -1 && var15.field1373 == null) {
                    var35 = var15.method457(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var35 = new class48(var12, arg5, 0, 466, 4, var13, var11, var15.field1402, var10, true);
                }
                arg8.method551(var14, arg4, arg1, var16, 0, arg0, var17, arg3, var35, 0, 256, true);
            } else if (arg6 == 7) {
                class16 var36;
                if (var15.field1402 == -1 && var15.field1373 == null) {
                    var36 = var15.method457(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var36 = new class48(var12, arg5, 0, 466, 4, var13, var11, var15.field1402, var10, true);
                }
                arg8.method551(var14, arg4, arg1, var16, 0, arg0, var17, arg3, var36, 0, 512, true);
            } else if (arg6 == 8) {
                class16 var37;
                if (var15.field1402 == -1 && var15.field1373 == null) {
                    var37 = var15.method457(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var37 = new class48(var12, arg5, 0, 466, 4, var13, var11, var15.field1402, var10, true);
                }
                arg8.method551(var14, arg4, arg1, var16, 0, arg0, var17, arg3, var37, 0, 768, true);
            }
        }
    }

    @OriginalMember(owner = "client!XAALPTAR", name = "a", descriptor = "(III[[[IIBIIILYJCKMNKP;LKQTHKTBC;)V")
    public static final void method510(int arg0, int arg1, int arg2, int[][][] arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, class67 arg9, class30 arg10) {
        int var11 = arg3[arg2][arg0][arg8];
        int var12 = arg3[arg2][arg0 + 1][arg8];
        int var13 = arg3[arg2][arg0 + 1][arg8 + 1];
        int var14 = arg3[arg2][arg0][arg8 + 1];
        int var15 = var11 + var12 + var13 + var14 >> 2;
        class59 var16 = class59.method450(arg7);
        int var17 = (arg7 << 14) + (arg8 << 7) + arg0 + 1073741824;
        if (!var16.field1365) {
            var17 += Integer.MIN_VALUE;
        }
        byte var18 = (byte) ((arg6 << 6) + arg4);
        if (arg5 != 1) {
            return;
        }
        if (arg4 == 22) {
            class16 var19;
            if (var16.field1402 == -1 && var16.field1373 == null) {
                var19 = var16.method457(22, arg6, var11, var12, var13, var14, -1);
            } else {
                var19 = new class48(var13, arg7, arg6, 466, 22, var14, var12, var16.field1402, var11, true);
            }
            arg9.method548(var17, arg0, true, var15, arg8, arg1, var18, var19);
            if (var16.field1367 && var16.field1365) {
                arg10.method286(-132, arg8, arg0);
            }
        } else if (arg4 == 10 || arg4 == 11) {
            class16 var39;
            if (var16.field1402 == -1 && var16.field1373 == null) {
                var39 = var16.method457(10, arg6, var11, var12, var13, var14, -1);
            } else {
                var39 = new class48(var13, arg7, arg6, 466, 10, var14, var12, var16.field1402, var11, true);
            }
            if (var39 != null) {
                int var40 = 0;
                if (arg4 == 11) {
                    var40 += 256;
                }
                int var41;
                int var42;
                if (arg6 == 1 || arg6 == 3) {
                    var41 = var16.field1379;
                    var42 = var16.field1411;
                } else {
                    var41 = var16.field1411;
                    var42 = var16.field1379;
                }
                arg9.method552(var40, arg8, var39, arg1, var41, arg0, var18, var42, -237, var15, var17);
            }
            if (var16.field1367) {
                arg10.method285(arg8, var16.field1379, arg6, var16.field1410, arg0, -127, var16.field1411);
            }
        } else if (arg4 >= 12) {
            class16 var20;
            if (var16.field1402 == -1 && var16.field1373 == null) {
                var20 = var16.method457(arg4, arg6, var11, var12, var13, var14, -1);
            } else {
                var20 = new class48(var13, arg7, arg6, 466, arg4, var14, var12, var16.field1402, var11, true);
            }
            arg9.method552(0, arg8, var20, arg1, 1, arg0, var18, 1, -237, var15, var17);
            if (var16.field1367) {
                arg10.method285(arg8, var16.field1379, arg6, var16.field1410, arg0, -127, var16.field1411);
            }
        } else if (arg4 == 0) {
            class16 var21;
            if (var16.field1402 == -1 && var16.field1373 == null) {
                var21 = var16.method457(0, arg6, var11, var12, var13, var14, -1);
            } else {
                var21 = new class48(var13, arg7, arg6, 466, 0, var14, var12, var16.field1402, var11, true);
            }
            arg9.method550(null, (byte) 3, arg0, arg8, field1516[arg6], arg1, var18, var17, var21, 0, var15);
            if (var16.field1367) {
                arg10.method284(arg4, (byte) 78, arg0, var16.field1410, arg8, arg6);
            }
        } else if (arg4 == 1) {
            class16 var22;
            if (var16.field1402 == -1 && var16.field1373 == null) {
                var22 = var16.method457(1, arg6, var11, var12, var13, var14, -1);
            } else {
                var22 = new class48(var13, arg7, arg6, 466, 1, var14, var12, var16.field1402, var11, true);
            }
            arg9.method550(null, (byte) 3, arg0, arg8, field1526[arg6], arg1, var18, var17, var22, 0, var15);
            if (var16.field1367) {
                arg10.method284(arg4, (byte) 78, arg0, var16.field1410, arg8, arg6);
            }
        } else if (arg4 == 2) {
            int var23 = arg6 + 1 & 0x3;
            class16 var24;
            class16 var25;
            if (var16.field1402 == -1 && var16.field1373 == null) {
                var24 = var16.method457(2, arg6 + 4, var11, var12, var13, var14, -1);
                var25 = var16.method457(2, var23, var11, var12, var13, var14, -1);
            } else {
                var24 = new class48(var13, arg7, arg6 + 4, 466, 2, var14, var12, var16.field1402, var11, true);
                var25 = new class48(var13, arg7, var23, 466, 2, var14, var12, var16.field1402, var11, true);
            }
            arg9.method550(var25, (byte) 3, arg0, arg8, field1516[arg6], arg1, var18, var17, var24, field1516[var23], var15);
            if (var16.field1367) {
                arg10.method284(arg4, (byte) 78, arg0, var16.field1410, arg8, arg6);
            }
        } else if (arg4 == 3) {
            class16 var26;
            if (var16.field1402 == -1 && var16.field1373 == null) {
                var26 = var16.method457(3, arg6, var11, var12, var13, var14, -1);
            } else {
                var26 = new class48(var13, arg7, arg6, 466, 3, var14, var12, var16.field1402, var11, true);
            }
            arg9.method550(null, (byte) 3, arg0, arg8, field1526[arg6], arg1, var18, var17, var26, 0, var15);
            if (var16.field1367) {
                arg10.method284(arg4, (byte) 78, arg0, var16.field1410, arg8, arg6);
            }
        } else if (arg4 == 9) {
            class16 var27;
            if (var16.field1402 == -1 && var16.field1373 == null) {
                var27 = var16.method457(arg4, arg6, var11, var12, var13, var14, -1);
            } else {
                var27 = new class48(var13, arg7, arg6, 466, arg4, var14, var12, var16.field1402, var11, true);
            }
            arg9.method552(0, arg8, var27, arg1, 1, arg0, var18, 1, -237, var15, var17);
            if (var16.field1367) {
                arg10.method285(arg8, var16.field1379, arg6, var16.field1410, arg0, -127, var16.field1411);
            }
        } else {
            if (var16.field1369) {
                if (arg6 == 1) {
                    int var28 = var14;
                    var14 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var28;
                } else if (arg6 == 2) {
                    int var29 = var14;
                    var14 = var12;
                    var12 = var29;
                    int var30 = var13;
                    var13 = var11;
                    var11 = var30;
                } else if (arg6 == 3) {
                    int var31 = var14;
                    var14 = var11;
                    var11 = var12;
                    var12 = var13;
                    var13 = var31;
                }
            }
            if (arg4 == 4) {
                class16 var32;
                if (var16.field1402 == -1 && var16.field1373 == null) {
                    var32 = var16.method457(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var32 = new class48(var13, arg7, 0, 466, 4, var14, var12, var16.field1402, var11, true);
                }
                arg9.method551(var15, arg1, arg0, var17, 0, arg6 * 512, var18, arg8, var32, 0, field1516[arg6], true);
            } else if (arg4 == 5) {
                int var33 = 16;
                int var34 = arg9.method568(arg1, arg0, arg8);
                if (var34 > 0) {
                    var33 = class59.method450(var34 >> 14 & 0x7FFF).field1384;
                }
                class16 var35;
                if (var16.field1402 == -1 && var16.field1373 == null) {
                    var35 = var16.method457(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var35 = new class48(var13, arg7, 0, 466, 4, var14, var12, var16.field1402, var11, true);
                }
                arg9.method551(var15, arg1, arg0, var17, field1515[arg6] * var33, arg6 * 512, var18, arg8, var35, field1531[arg6] * var33, field1516[arg6], true);
            } else if (arg4 == 6) {
                class16 var36;
                if (var16.field1402 == -1 && var16.field1373 == null) {
                    var36 = var16.method457(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var36 = new class48(var13, arg7, 0, 466, 4, var14, var12, var16.field1402, var11, true);
                }
                arg9.method551(var15, arg1, arg0, var17, 0, arg6, var18, arg8, var36, 0, 256, true);
            } else if (arg4 == 7) {
                class16 var37;
                if (var16.field1402 == -1 && var16.field1373 == null) {
                    var37 = var16.method457(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var37 = new class48(var13, arg7, 0, 466, 4, var14, var12, var16.field1402, var11, true);
                }
                arg9.method551(var15, arg1, arg0, var17, 0, arg6, var18, arg8, var37, 0, 512, true);
            } else if (arg4 == 8) {
                class16 var38;
                if (var16.field1402 == -1 && var16.field1373 == null) {
                    var38 = var16.method457(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var38 = new class48(var13, arg7, 0, 466, 4, var14, var12, var16.field1402, var11, true);
                }
                arg9.method551(var15, arg1, arg0, var17, 0, arg6, var18, arg8, var38, 0, 768, true);
            }
        }
    }

    @OriginalMember(owner = "client!XAALPTAR", name = "e", descriptor = "(II)I")
    private static final int method511(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!XAALPTAR", name = "<init>", descriptor = "([[[BIII[[[I)V")
    public class62(byte[][][] arg0, int arg1, int arg2, int arg3, int[][][] arg4) {
        field1520 = 99;
        this.field1521 = arg3;
        if (arg2 <= 0) {
            this.field1533 = !this.field1533;
        }
        this.field1522 = arg1;
        this.field1513 = arg4;
        this.field1524 = arg0;
        this.field1517 = new byte[4][this.field1521][this.field1522];
        this.field1534 = new byte[4][this.field1521][this.field1522];
        this.field1543 = new byte[4][this.field1521][this.field1522];
        this.field1514 = new byte[4][this.field1521][this.field1522];
        this.field1518 = new int[4][this.field1521 + 1][this.field1522 + 1];
        this.field1541 = new byte[4][this.field1521 + 1][this.field1522 + 1];
        this.field1542 = new int[this.field1521 + 1][this.field1522 + 1];
        this.field1536 = new int[this.field1522];
        this.field1537 = new int[this.field1522];
        this.field1538 = new int[this.field1522];
        this.field1539 = new int[this.field1522];
        this.field1540 = new int[this.field1522];
    }

    @OriginalMember(owner = "client!XAALPTAR", name = "c", descriptor = "(IIII)I")
    public int method512(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 < 6 || arg2 > 6) {
            field1545 = -81;
        }
        if ((this.field1524[arg3][arg1][arg0] & 0x8) == 0) {
            return arg3 <= 0 || (this.field1524[1][arg1][arg0] & 0x2) == 0 ? arg3 : arg3 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!XAALPTAR", name = "a", descriptor = "(I[BZ[LKQTHKTBC;III)V")
    public final void method513(int arg0, byte[] arg1, boolean arg2, class30[] arg3, int arg4, int arg5, int arg6) {
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    if (arg4 + var14 > 0 && arg4 + var14 < 103 && arg0 + var15 > 0 && arg0 + var15 < 103) {
                        arg3[var8].field921[arg4 + var14][arg0 + var15] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class50 var9 = new class50(arg1, -46859);
        if (!arg2) {
            for (int var10 = 1; var10 > 0; var10++) {
            }
        }
        for (int var11 = 0; var11 < 4; var11++) {
            for (int var12 = 0; var12 < 64; var12++) {
                for (int var13 = 0; var13 < 64; var13++) {
                    this.method508(arg5, arg4 + var12, arg6, arg0 + var13, var11, 8, var9, 0);
                }
            }
        }
    }
}
