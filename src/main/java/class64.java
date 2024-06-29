import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!WZFUDUYZ")
public class class64 {

    @OriginalMember(owner = "client!WZFUDUYZ", name = "c", descriptor = "Z")
    private boolean field1637 = false;

    @OriginalMember(owner = "client!WZFUDUYZ", name = "e", descriptor = "Z")
    private boolean field1639 = false;

    @OriginalMember(owner = "client!WZFUDUYZ", name = "f", descriptor = "I")
    private int field1640 = 3;

    @OriginalMember(owner = "client!WZFUDUYZ", name = "o", descriptor = "I")
    private int field1649 = 850;

    @OriginalMember(owner = "client!WZFUDUYZ", name = "B", descriptor = "I")
    private int field1662 = 171;

    @OriginalMember(owner = "client!WZFUDUYZ", name = "G", descriptor = "B")
    private byte field1667 = -30;

    @OriginalMember(owner = "client!WZFUDUYZ", name = "E", descriptor = "I")
    private int field1665;

    @OriginalMember(owner = "client!WZFUDUYZ", name = "F", descriptor = "I")
    private int field1666;

    @OriginalMember(owner = "client!WZFUDUYZ", name = "C", descriptor = "[[[I")
    private int[][][] field1663;

    @OriginalMember(owner = "client!WZFUDUYZ", name = "A", descriptor = "[[[B")
    private byte[][][] field1661;

    @OriginalMember(owner = "client!WZFUDUYZ", name = "u", descriptor = "[[[B")
    private byte[][][] field1655;

    @OriginalMember(owner = "client!WZFUDUYZ", name = "H", descriptor = "[[[B")
    private byte[][][] field1668;

    @OriginalMember(owner = "client!WZFUDUYZ", name = "z", descriptor = "[[[B")
    private byte[][][] field1660;

    @OriginalMember(owner = "client!WZFUDUYZ", name = "k", descriptor = "[[[B")
    private byte[][][] field1645;

    @OriginalMember(owner = "client!WZFUDUYZ", name = "d", descriptor = "[[[I")
    private int[][][] field1638;

    @OriginalMember(owner = "client!WZFUDUYZ", name = "i", descriptor = "[[[B")
    private byte[][][] field1643;

    @OriginalMember(owner = "client!WZFUDUYZ", name = "b", descriptor = "[[I")
    private int[][] field1636;

    @OriginalMember(owner = "client!WZFUDUYZ", name = "p", descriptor = "[I")
    private int[] field1650;

    @OriginalMember(owner = "client!WZFUDUYZ", name = "q", descriptor = "[I")
    private int[] field1651;

    @OriginalMember(owner = "client!WZFUDUYZ", name = "r", descriptor = "[I")
    private int[] field1652;

    @OriginalMember(owner = "client!WZFUDUYZ", name = "s", descriptor = "[I")
    private int[] field1653;

    @OriginalMember(owner = "client!WZFUDUYZ", name = "t", descriptor = "[I")
    private int[] field1654;

    @OriginalMember(owner = "client!WZFUDUYZ", name = "a", descriptor = "[I")
    private static final int[] field1635 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!WZFUDUYZ", name = "g", descriptor = "I")
    private static int field1641 = 9;

    @OriginalMember(owner = "client!WZFUDUYZ", name = "h", descriptor = "[I")
    private static final int[] field1642 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!WZFUDUYZ", name = "j", descriptor = "[I")
    private static final int[] field1644 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!WZFUDUYZ", name = "l", descriptor = "I")
    private static int field1646 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!WZFUDUYZ", name = "n", descriptor = "[I")
    private static final int[] field1648 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!WZFUDUYZ", name = "v", descriptor = "I")
    private static int field1656 = 2;

    @OriginalMember(owner = "client!WZFUDUYZ", name = "w", descriptor = "I")
    private static int field1657 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!WZFUDUYZ", name = "x", descriptor = "I")
    private static int field1658 = 1;

    @OriginalMember(owner = "client!WZFUDUYZ", name = "y", descriptor = "Z")
    public static boolean field1659 = true;

    @OriginalMember(owner = "client!WZFUDUYZ", name = "D", descriptor = "I")
    public static int field1664 = 99;

    @OriginalMember(owner = "client!WZFUDUYZ", name = "m", descriptor = "I")
    public static int field1647;

    @OriginalMember(owner = "client!WZFUDUYZ", name = "a", descriptor = "(IIIB)I")
    public int method560(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != -30) {
            return 3;
        } else if ((this.field1661[arg2][arg1][arg0] & 0x8) == 0) {
            return arg2 <= 0 || (this.field1661[1][arg1][arg0] & 0x2) == 0 ? arg2 : arg2 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!WZFUDUYZ", name = "a", descriptor = "(III)I")
    private final int method561(int arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "client!WZFUDUYZ", name = "a", descriptor = "(II)I")
    private static final int method562(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!WZFUDUYZ", name = "a", descriptor = "(LBSNPYLEV;ZLVYNRIVYZ;)V")
    public static final void method563(class7 arg0, boolean arg1, class62 arg2) {
        int var3 = -1;
        if (!arg1) {
            return;
        }
        while (true) {
            int var4 = arg0.method61();
            if (var4 == 0) {
                return;
            }
            var3 += var4;
            class48 var5 = class48.method494(var3);
            var5.method502(true, arg2);
            while (true) {
                int var6 = arg0.method61();
                if (var6 == 0) {
                    break;
                }
                arg0.method47();
            }
        }
    }

    @OriginalMember(owner = "client!WZFUDUYZ", name = "a", descriptor = "(LPAJXYXWG;Z[LEOLCIJGV;)V")
    public final void method564(class39 arg0, boolean arg1, class14[] arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((this.field1661[var4][var110][var111] & 0x1) == 1) {
                        int var112 = var4;
                        if ((this.field1661[1][var110][var111] & 0x2) == 2) {
                            var112 = var4 - 1;
                        }
                        if (var112 >= 0) {
                            arg2[var112].method288(var111, false, var110);
                        }
                    }
                }
            }
        }
        field1646 += (int) (Math.random() * 5.0D) - 2;
        if (field1646 < -8) {
            field1646 = -8;
        }
        if (field1646 > 8) {
            field1646 = 8;
        }
        field1657 += (int) (Math.random() * 5.0D) - 2;
        if (field1657 < -16) {
            field1657 = -16;
        }
        if (field1657 > 16) {
            field1657 = 16;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            byte[][] var48 = this.field1643[var5];
            byte var49 = 96;
            short var50 = 768;
            byte var51 = -50;
            byte var52 = -10;
            byte var53 = -50;
            int var54 = (int) Math.sqrt((double) (var53 * var53 + var51 * var51 + var52 * var52));
            int var55 = var50 * var54 >> 8;
            for (int var56 = 1; var56 < this.field1666 - 1; var56++) {
                for (int var101 = 1; var101 < this.field1665 - 1; var101++) {
                    int var102 = this.field1663[var5][var101 + 1][var56] - this.field1663[var5][var101 - 1][var56];
                    int var103 = this.field1663[var5][var101][var56 + 1] - this.field1663[var5][var101][var56 - 1];
                    int var104 = (int) Math.sqrt((double) (var103 * var103 + var102 * var102 + 65536));
                    int var105 = (var102 << 8) / var104;
                    int var106 = 65536 / var104;
                    int var107 = (var103 << 8) / var104;
                    int var108 = (var53 * var107 + var51 * var105 + var52 * var106) / var55 + var49;
                    int var109 = (var48[var101][var56] >> 1) + (var48[var101][var56 + 1] >> 3) + (var48[var101][var56 - 1] >> 2) + (var48[var101 - 1][var56] >> 2) + (var48[var101 + 1][var56] >> 3);
                    this.field1636[var101][var56] = var108 - var109;
                }
            }
            for (int var57 = 0; var57 < this.field1666; var57++) {
                this.field1650[var57] = 0;
                this.field1651[var57] = 0;
                this.field1652[var57] = 0;
                this.field1653[var57] = 0;
                this.field1654[var57] = 0;
            }
            for (int var58 = -5; var58 < this.field1665 + 5; var58++) {
                for (int var61 = 0; var61 < this.field1666; var61++) {
                    int var95 = var58 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < this.field1665) {
                        int var96 = this.field1655[var5][var95][var61] & 0xFF;
                        if (var96 > 0) {
                            class60 var97 = class60.field1562[var96 - 1];
                            this.field1650[var61] += var97.field1571;
                            this.field1651[var61] += var97.field1569;
                            this.field1652[var61] += var97.field1570;
                            this.field1653[var61] += var97.field1572;
                            var10002 = this.field1654[var61]++;
                        }
                    }
                    int var98 = var58 - 5;
                    if (var98 >= 0 && var98 < this.field1665) {
                        int var99 = this.field1655[var5][var98][var61] & 0xFF;
                        if (var99 > 0) {
                            class60 var100 = class60.field1562[var99 - 1];
                            this.field1650[var61] -= var100.field1571;
                            this.field1651[var61] -= var100.field1569;
                            this.field1652[var61] -= var100.field1570;
                            this.field1653[var61] -= var100.field1572;
                            var10002 = this.field1654[var61]--;
                        }
                    }
                }
                if (var58 >= 1 && var58 < this.field1665 - 1) {
                    int var62 = 0;
                    int var63 = 0;
                    int var64 = 0;
                    int var65 = 0;
                    int var66 = 0;
                    for (int var67 = -5; var67 < this.field1666 + 5; var67++) {
                        int var68 = var67 + 5;
                        if (var68 >= 0 && var68 < this.field1666) {
                            var62 += this.field1650[var68];
                            var63 += this.field1651[var68];
                            var64 += this.field1652[var68];
                            var65 += this.field1653[var68];
                            var66 += this.field1654[var68];
                        }
                        int var69 = var67 - 5;
                        if (var69 >= 0 && var69 < this.field1666) {
                            var62 -= this.field1650[var69];
                            var63 -= this.field1651[var69];
                            var64 -= this.field1652[var69];
                            var65 -= this.field1653[var69];
                            var66 -= this.field1654[var69];
                        }
                        if (var67 >= 1 && var67 < this.field1666 - 1 && (!field1659 || (this.field1661[0][var58][var67] & 0x2) != 0 || (this.field1661[var5][var58][var67] & 0x10) == 0 && this.method560(var67, var58, var5, this.field1667) == field1647)) {
                            if (var5 < field1664) {
                                field1664 = var5;
                            }
                            int var70 = this.field1655[var5][var58][var67] & 0xFF;
                            int var71 = this.field1668[var5][var58][var67] & 0xFF;
                            if (var70 > 0 || var71 > 0) {
                                int var72 = this.field1663[var5][var58][var67];
                                int var73 = this.field1663[var5][var58 + 1][var67];
                                int var74 = this.field1663[var5][var58 + 1][var67 + 1];
                                int var75 = this.field1663[var5][var58][var67 + 1];
                                int var76 = this.field1636[var58][var67];
                                int var77 = this.field1636[var58 + 1][var67];
                                int var78 = this.field1636[var58 + 1][var67 + 1];
                                int var79 = this.field1636[var58][var67 + 1];
                                int var80 = -1;
                                int var81 = -1;
                                if (var70 > 0) {
                                    int var82 = var62 * 256 / var65;
                                    int var83 = var63 / var66;
                                    int var84 = var64 / var66;
                                    var80 = this.method561(var82, var83, var84);
                                    int var85 = field1646 + var82 & 0xFF;
                                    int var86 = field1657 + var84;
                                    if (var86 < 0) {
                                        var86 = 0;
                                    } else if (var86 > 255) {
                                        var86 = 255;
                                    }
                                    var81 = this.method561(var85, var83, var86);
                                }
                                if (var5 > 0) {
                                    boolean var87 = true;
                                    if (var70 == 0 && this.field1660[var5][var58][var67] != 0) {
                                        var87 = false;
                                    }
                                    if (var71 > 0 && !class60.field1562[var71 - 1].field1567) {
                                        var87 = false;
                                    }
                                    if (var87 && var72 == var73 && var72 == var74 && var72 == var75) {
                                        this.field1638[var5][var58][var67] |= 0x924;
                                    }
                                }
                                int var88 = 0;
                                if (var80 != -1) {
                                    var88 = class27.field879[method575(var81, 96)];
                                }
                                if (var71 == 0) {
                                    arg0.method380(var5, var58, var67, 0, 0, -1, var72, var73, var74, var75, method575(var80, var76), method575(var80, var77), method575(var80, var78), method575(var80, var79), 0, 0, 0, 0, var88, 0);
                                } else {
                                    int var89 = this.field1660[var5][var58][var67] + 1;
                                    byte var90 = this.field1645[var5][var58][var67];
                                    class60 var91 = class60.field1562[var71 - 1];
                                    int var92 = var91.field1565;
                                    int var93;
                                    int var94;
                                    if (var92 >= 0) {
                                        var93 = class27.method330((byte) 9, var92);
                                        var94 = -1;
                                    } else if (var91.field1564 == 16711935) {
                                        var94 = -2;
                                        var92 = -1;
                                        var93 = class27.field879[this.method579(var91.field1573, 96)];
                                    } else {
                                        var94 = this.method561(var91.field1568, var91.field1569, var91.field1570);
                                        var93 = class27.field879[this.method579(var91.field1573, 96)];
                                    }
                                    arg0.method380(var5, var58, var67, var89, var90, var92, var72, var73, var74, var75, method575(var80, var76), method575(var80, var77), method575(var80, var78), method575(var80, var79), this.method579(var94, var76), this.method579(var94, var77), this.method579(var94, var78), this.method579(var94, var79), var88, var93);
                                }
                            }
                        }
                    }
                }
            }
            for (int var59 = 1; var59 < this.field1666 - 1; var59++) {
                for (int var60 = 1; var60 < this.field1665 - 1; var60++) {
                    arg0.method379(var5, var60, var59, this.method560(var59, var60, var5, this.field1667));
                }
            }
        }
        if (!arg1) {
            field1641 = 352;
        }
        arg0.method406(-50, -50, -10, (byte) 67);
        for (int var6 = 0; var6 < this.field1665; var6++) {
            for (int var47 = 0; var47 < this.field1666; var47++) {
                if ((this.field1661[1][var6][var47] & 0x2) == 2) {
                    arg0.method377(-596, var6, var47);
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
                for (int var12 = 0; var12 <= this.field1666; var12++) {
                    for (int var13 = 0; var13 <= this.field1665; var13++) {
                        if ((this.field1638[var11][var13][var12] & var7) != 0) {
                            int var14 = var12;
                            int var15 = var12;
                            int var16 = var11;
                            int var17 = var11;
                            while (var14 > 0 && (this.field1638[var11][var13][var14 - 1] & var7) != 0) {
                                var14--;
                            }
                            while (var15 < this.field1666 && (this.field1638[var11][var13][var15 + 1] & var7) != 0) {
                                var15++;
                            }
                            label330: while (var16 > 0) {
                                for (int var18 = var14; var18 <= var15; var18++) {
                                    if ((this.field1638[var16 - 1][var13][var18] & var7) == 0) {
                                        break label330;
                                    }
                                }
                                var16--;
                            }
                            label319: while (var17 < var10) {
                                for (int var19 = var14; var19 <= var15; var19++) {
                                    if ((this.field1638[var17 + 1][var13][var19] & var7) == 0) {
                                        break label319;
                                    }
                                }
                                var17++;
                            }
                            int var20 = (var17 + 1 - var16) * (var15 + 1 - var14);
                            if (var20 >= 8) {
                                short var21 = 240;
                                int var22 = this.field1663[var17][var13][var14] - var21;
                                int var23 = this.field1663[var16][var13][var14];
                                class39.method378(var10, var23, 1, var22, var15 * 128 + 128, var13 * 128, var14 * 128, var13 * 128, 865);
                                for (int var24 = var16; var24 <= var17; var24++) {
                                    for (int var25 = var14; var25 <= var15; var25++) {
                                        this.field1638[var24][var13][var25] &= ~var7;
                                    }
                                }
                            }
                        }
                        if ((this.field1638[var11][var13][var12] & var8) != 0) {
                            int var26 = var13;
                            int var27 = var13;
                            int var28 = var11;
                            int var29 = var11;
                            while (var26 > 0 && (this.field1638[var11][var26 - 1][var12] & var8) != 0) {
                                var26--;
                            }
                            while (var27 < this.field1665 && (this.field1638[var11][var27 + 1][var12] & var8) != 0) {
                                var27++;
                            }
                            label383: while (var28 > 0) {
                                for (int var30 = var26; var30 <= var27; var30++) {
                                    if ((this.field1638[var28 - 1][var30][var12] & var8) == 0) {
                                        break label383;
                                    }
                                }
                                var28--;
                            }
                            label372: while (var29 < var10) {
                                for (int var31 = var26; var31 <= var27; var31++) {
                                    if ((this.field1638[var29 + 1][var31][var12] & var8) == 0) {
                                        break label372;
                                    }
                                }
                                var29++;
                            }
                            int var32 = (var29 + 1 - var28) * (var27 + 1 - var26);
                            if (var32 >= 8) {
                                short var33 = 240;
                                int var34 = this.field1663[var29][var26][var12] - var33;
                                int var35 = this.field1663[var28][var26][var12];
                                class39.method378(var10, var35, 2, var34, var12 * 128, var26 * 128, var12 * 128, var27 * 128 + 128, 865);
                                for (int var36 = var28; var36 <= var29; var36++) {
                                    for (int var37 = var26; var37 <= var27; var37++) {
                                        this.field1638[var36][var37][var12] &= ~var8;
                                    }
                                }
                            }
                        }
                        if ((this.field1638[var11][var13][var12] & var9) != 0) {
                            int var38 = var13;
                            int var39 = var13;
                            int var40 = var12;
                            int var41 = var12;
                            while (var40 > 0 && (this.field1638[var11][var13][var40 - 1] & var9) != 0) {
                                var40--;
                            }
                            while (var41 < this.field1666 && (this.field1638[var11][var13][var41 + 1] & var9) != 0) {
                                var41++;
                            }
                            label436: while (var38 > 0) {
                                for (int var42 = var40; var42 <= var41; var42++) {
                                    if ((this.field1638[var11][var38 - 1][var42] & var9) == 0) {
                                        break label436;
                                    }
                                }
                                var38--;
                            }
                            label425: while (var39 < this.field1665) {
                                for (int var43 = var40; var43 <= var41; var43++) {
                                    if ((this.field1638[var11][var39 + 1][var43] & var9) == 0) {
                                        break label425;
                                    }
                                }
                                var39++;
                            }
                            if ((var39 + 1 - var38) * (var41 + 1 - var40) >= 4) {
                                int var44 = this.field1663[var11][var38][var40];
                                class39.method378(var10, var44, 4, var44, var41 * 128 + 128, var38 * 128, var40 * 128, var39 * 128 + 128, 865);
                                for (int var45 = var38; var45 <= var39; var45++) {
                                    for (int var46 = var40; var46 <= var41; var46++) {
                                        this.field1638[var11][var45][var46] &= ~var9;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!WZFUDUYZ", name = "a", descriptor = "(IIILEOLCIJGV;IILPAJXYXWG;II)V")
    private final void method565(int arg0, int arg1, int arg2, class14 arg3, int arg4, int arg5, class39 arg6, int arg7, int arg8) {
        if (field1659 && (this.field1661[0][arg7][arg1] & 0x2) == 0) {
            if ((this.field1661[arg0][arg7][arg1] & 0x10) != 0) {
                return;
            }
            if (this.method560(arg1, arg7, arg0, this.field1667) != field1647) {
                return;
            }
        }
        if (arg0 < field1664) {
            field1664 = arg0;
        }
        int var10 = this.field1663[arg0][arg7][arg1];
        int var11 = this.field1663[arg0][arg7 + 1][arg1];
        int var12 = this.field1663[arg0][arg7 + 1][arg1 + 1];
        int var13 = this.field1663[arg0][arg7][arg1 + 1];
        if (arg4 != 0) {
            this.field1649 = -194;
        }
        int var14 = var10 + var11 + var12 + var13 >> 2;
        class48 var15 = class48.method494(arg5);
        int var16 = (arg5 << 14) + (arg1 << 7) + arg7 + 1073741824;
        if (!var15.field1424) {
            var16 += Integer.MIN_VALUE;
        }
        byte var17 = (byte) ((arg8 << 6) + arg2);
        if (arg2 == 22) {
            if (!field1659 || var15.field1424 || var15.field1448) {
                class44 var18;
                if (var15.field1441 == -1 && var15.field1436 == null) {
                    var18 = var15.method492(22, arg8, var10, var11, var12, var13, -1);
                } else {
                    var18 = new class50(var12, arg8, arg5, 22, var15.field1441, true, (byte) -21, var13, var11, var10);
                }
                arg6.method381(arg0, var16, arg1, var17, var18, 5, arg7, var14);
                if (var15.field1430 && var15.field1424 && arg3 != null) {
                    arg3.method288(arg1, false, arg7);
                }
            }
        } else if (arg2 == 10 || arg2 == 11) {
            class44 var38;
            if (var15.field1441 == -1 && var15.field1436 == null) {
                var38 = var15.method492(10, arg8, var10, var11, var12, var13, -1);
            } else {
                var38 = new class50(var12, arg8, arg5, 10, var15.field1441, true, (byte) -21, var13, var11, var10);
            }
            if (var38 != null) {
                int var39 = 0;
                if (arg2 == 11) {
                    var39 += 256;
                }
                int var40;
                int var41;
                if (arg8 == 1 || arg8 == 3) {
                    var40 = var15.field1443;
                    var41 = var15.field1429;
                } else {
                    var40 = var15.field1429;
                    var41 = var15.field1443;
                }
                if (arg6.method385(arg0, arg1, var14, var38, var39, var16, var17, field1658, arg7, var41, var40) && var15.field1425) {
                    class47 var42;
                    if (var38 instanceof class47) {
                        var42 = (class47) var38;
                    } else {
                        var42 = var15.method492(10, arg8, var10, var11, var12, var13, -1);
                    }
                    if (var42 != null) {
                        for (int var43 = 0; var43 <= var40; var43++) {
                            for (int var44 = 0; var44 <= var41; var44++) {
                                int var45 = var42.field1360 / 4;
                                if (var45 > 30) {
                                    var45 = 30;
                                }
                                if (var45 > this.field1643[arg0][arg7 + var43][arg1 + var44]) {
                                    this.field1643[arg0][arg7 + var43][arg1 + var44] = (byte) var45;
                                }
                            }
                        }
                    }
                }
            }
            if (var15.field1430 && arg3 != null) {
                arg3.method287(arg1, true, var15.field1453, var15.field1429, var15.field1443, arg8, arg7);
            }
        } else if (arg2 >= 12) {
            class44 var19;
            if (var15.field1441 == -1 && var15.field1436 == null) {
                var19 = var15.method492(arg2, arg8, var10, var11, var12, var13, -1);
            } else {
                var19 = new class50(var12, arg8, arg5, arg2, var15.field1441, true, (byte) -21, var13, var11, var10);
            }
            arg6.method385(arg0, arg1, var14, var19, 0, var16, var17, field1658, arg7, 1, 1);
            if (arg2 >= 12 && arg2 <= 17 && arg2 != 13 && arg0 > 0) {
                this.field1638[arg0][arg7][arg1] |= 0x924;
            }
            if (var15.field1430 && arg3 != null) {
                arg3.method287(arg1, true, var15.field1453, var15.field1429, var15.field1443, arg8, arg7);
            }
        } else if (arg2 == 0) {
            class44 var20;
            if (var15.field1441 == -1 && var15.field1436 == null) {
                var20 = var15.method492(0, arg8, var10, var11, var12, var13, -1);
            } else {
                var20 = new class50(var12, arg8, arg5, 0, var15.field1441, true, (byte) -21, var13, var11, var10);
            }
            arg6.method383(arg0, field1642[arg8], 0, var16, arg1, var20, 0, var17, arg7, var14, null);
            if (arg8 == 0) {
                if (var15.field1425) {
                    this.field1643[arg0][arg7][arg1] = 50;
                    this.field1643[arg0][arg7][arg1 + 1] = 50;
                }
                if (var15.field1416) {
                    this.field1638[arg0][arg7][arg1] |= 0x249;
                }
            } else if (arg8 == 1) {
                if (var15.field1425) {
                    this.field1643[arg0][arg7][arg1 + 1] = 50;
                    this.field1643[arg0][arg7 + 1][arg1 + 1] = 50;
                }
                if (var15.field1416) {
                    this.field1638[arg0][arg7][arg1 + 1] |= 0x492;
                }
            } else if (arg8 == 2) {
                if (var15.field1425) {
                    this.field1643[arg0][arg7 + 1][arg1] = 50;
                    this.field1643[arg0][arg7 + 1][arg1 + 1] = 50;
                }
                if (var15.field1416) {
                    this.field1638[arg0][arg7 + 1][arg1] |= 0x249;
                }
            } else if (arg8 == 3) {
                if (var15.field1425) {
                    this.field1643[arg0][arg7][arg1] = 50;
                    this.field1643[arg0][arg7 + 1][arg1] = 50;
                }
                if (var15.field1416) {
                    this.field1638[arg0][arg7][arg1] |= 0x492;
                }
            }
            if (var15.field1430 && arg3 != null) {
                arg3.method286(arg8, arg1, arg2, 2, arg7, var15.field1453);
            }
            if (var15.field1442 != 16) {
                arg6.method391(arg0, arg7, false, var15.field1442, arg1);
            }
        } else if (arg2 == 1) {
            class44 var21;
            if (var15.field1441 == -1 && var15.field1436 == null) {
                var21 = var15.method492(1, arg8, var10, var11, var12, var13, -1);
            } else {
                var21 = new class50(var12, arg8, arg5, 1, var15.field1441, true, (byte) -21, var13, var11, var10);
            }
            arg6.method383(arg0, field1635[arg8], 0, var16, arg1, var21, 0, var17, arg7, var14, null);
            if (var15.field1425) {
                if (arg8 == 0) {
                    this.field1643[arg0][arg7][arg1 + 1] = 50;
                } else if (arg8 == 1) {
                    this.field1643[arg0][arg7 + 1][arg1 + 1] = 50;
                } else if (arg8 == 2) {
                    this.field1643[arg0][arg7 + 1][arg1] = 50;
                } else if (arg8 == 3) {
                    this.field1643[arg0][arg7][arg1] = 50;
                }
            }
            if (var15.field1430 && arg3 != null) {
                arg3.method286(arg8, arg1, arg2, 2, arg7, var15.field1453);
            }
        } else if (arg2 == 2) {
            int var22 = arg8 + 1 & 0x3;
            class44 var23;
            class44 var24;
            if (var15.field1441 == -1 && var15.field1436 == null) {
                var23 = var15.method492(2, arg8 + 4, var10, var11, var12, var13, -1);
                var24 = var15.method492(2, var22, var10, var11, var12, var13, -1);
            } else {
                var23 = new class50(var12, arg8 + 4, arg5, 2, var15.field1441, true, (byte) -21, var13, var11, var10);
                var24 = new class50(var12, var22, arg5, 2, var15.field1441, true, (byte) -21, var13, var11, var10);
            }
            arg6.method383(arg0, field1642[arg8], 0, var16, arg1, var23, field1642[var22], var17, arg7, var14, var24);
            if (var15.field1416) {
                if (arg8 == 0) {
                    this.field1638[arg0][arg7][arg1] |= 0x249;
                    this.field1638[arg0][arg7][arg1 + 1] |= 0x492;
                } else if (arg8 == 1) {
                    this.field1638[arg0][arg7][arg1 + 1] |= 0x492;
                    this.field1638[arg0][arg7 + 1][arg1] |= 0x249;
                } else if (arg8 == 2) {
                    this.field1638[arg0][arg7 + 1][arg1] |= 0x249;
                    this.field1638[arg0][arg7][arg1] |= 0x492;
                } else if (arg8 == 3) {
                    this.field1638[arg0][arg7][arg1] |= 0x492;
                    this.field1638[arg0][arg7][arg1] |= 0x249;
                }
            }
            if (var15.field1430 && arg3 != null) {
                arg3.method286(arg8, arg1, arg2, 2, arg7, var15.field1453);
            }
            if (var15.field1442 != 16) {
                arg6.method391(arg0, arg7, false, var15.field1442, arg1);
            }
        } else if (arg2 == 3) {
            class44 var25;
            if (var15.field1441 == -1 && var15.field1436 == null) {
                var25 = var15.method492(3, arg8, var10, var11, var12, var13, -1);
            } else {
                var25 = new class50(var12, arg8, arg5, 3, var15.field1441, true, (byte) -21, var13, var11, var10);
            }
            arg6.method383(arg0, field1635[arg8], 0, var16, arg1, var25, 0, var17, arg7, var14, null);
            if (var15.field1425) {
                if (arg8 == 0) {
                    this.field1643[arg0][arg7][arg1 + 1] = 50;
                } else if (arg8 == 1) {
                    this.field1643[arg0][arg7 + 1][arg1 + 1] = 50;
                } else if (arg8 == 2) {
                    this.field1643[arg0][arg7 + 1][arg1] = 50;
                } else if (arg8 == 3) {
                    this.field1643[arg0][arg7][arg1] = 50;
                }
            }
            if (var15.field1430 && arg3 != null) {
                arg3.method286(arg8, arg1, arg2, 2, arg7, var15.field1453);
            }
        } else if (arg2 == 9) {
            class44 var26;
            if (var15.field1441 == -1 && var15.field1436 == null) {
                var26 = var15.method492(arg2, arg8, var10, var11, var12, var13, -1);
            } else {
                var26 = new class50(var12, arg8, arg5, arg2, var15.field1441, true, (byte) -21, var13, var11, var10);
            }
            arg6.method385(arg0, arg1, var14, var26, 0, var16, var17, field1658, arg7, 1, 1);
            if (var15.field1430 && arg3 != null) {
                arg3.method287(arg1, true, var15.field1453, var15.field1429, var15.field1443, arg8, arg7);
            }
        } else {
            if (var15.field1403) {
                if (arg8 == 1) {
                    int var27 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var10;
                    var10 = var27;
                } else if (arg8 == 2) {
                    int var28 = var13;
                    var13 = var11;
                    var11 = var28;
                    int var29 = var12;
                    var12 = var10;
                    var10 = var29;
                } else if (arg8 == 3) {
                    int var30 = var13;
                    var13 = var10;
                    var10 = var11;
                    var11 = var12;
                    var12 = var30;
                }
            }
            if (arg2 == 4) {
                class44 var31;
                if (var15.field1441 == -1 && var15.field1436 == null) {
                    var31 = var15.method492(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var31 = new class50(var12, 0, arg5, 4, var15.field1441, true, (byte) -21, var13, var11, var10);
                }
                arg6.method384(0, 4, var14, var16, arg0, var31, arg8 * 512, 0, arg7, arg1, field1642[arg8], var17);
            } else if (arg2 == 5) {
                int var32 = 16;
                int var33 = arg6.method401(arg0, arg7, arg1);
                if (var33 > 0) {
                    var32 = class48.method494(var33 >> 14 & 0x7FFF).field1442;
                }
                class44 var34;
                if (var15.field1441 == -1 && var15.field1436 == null) {
                    var34 = var15.method492(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var34 = new class50(var12, 0, arg5, 4, var15.field1441, true, (byte) -21, var13, var11, var10);
                }
                arg6.method384(field1648[arg8] * var32, 4, var14, var16, arg0, var34, arg8 * 512, field1644[arg8] * var32, arg7, arg1, field1642[arg8], var17);
            } else if (arg2 == 6) {
                class44 var35;
                if (var15.field1441 == -1 && var15.field1436 == null) {
                    var35 = var15.method492(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var35 = new class50(var12, 0, arg5, 4, var15.field1441, true, (byte) -21, var13, var11, var10);
                }
                arg6.method384(0, 4, var14, var16, arg0, var35, arg8, 0, arg7, arg1, 256, var17);
            } else if (arg2 == 7) {
                class44 var36;
                if (var15.field1441 == -1 && var15.field1436 == null) {
                    var36 = var15.method492(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var36 = new class50(var12, 0, arg5, 4, var15.field1441, true, (byte) -21, var13, var11, var10);
                }
                arg6.method384(0, 4, var14, var16, arg0, var36, arg8, 0, arg7, arg1, 512, var17);
            } else if (arg2 == 8) {
                class44 var37;
                if (var15.field1441 == -1 && var15.field1436 == null) {
                    var37 = var15.method492(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var37 = new class50(var12, 0, arg5, 4, var15.field1441, true, (byte) -21, var13, var11, var10);
                }
                arg6.method384(0, 4, var14, var16, arg0, var37, arg8, 0, arg7, arg1, 768, var17);
            }
        }
    }

    @OriginalMember(owner = "client!WZFUDUYZ", name = "a", descriptor = "([LEOLCIJGV;IIII[BIIII)V")
    public final void method566(class14[] arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var11 = 0; var11 < 8; var11++) {
            for (int var16 = 0; var16 < 8; var16++) {
                if (arg3 + var11 > 0 && arg3 + var11 < 103 && arg4 + var16 > 0 && arg4 + var16 < 103) {
                    arg0[arg6].field675[arg3 + var11][arg4 + var16] &= 0xFEFFFFFF;
                }
            }
        }
        class7 var12 = new class7(arg5, (byte) 3);
        if (arg7 < 7 || arg7 > 7) {
            this.field1639 = !this.field1639;
        }
        for (int var13 = 0; var13 < 4; var13++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    if (arg2 == var13 && var14 >= arg8 && var14 < arg8 + 8 && var15 >= arg1 && var15 < arg1 + 8) {
                        this.method571(3, 0, 0, arg3 + class57.method519(arg9, var14 & 0x7, var15 & 0x7, false), arg4 + class57.method520(var15 & 0x7, arg9, 7, var14 & 0x7), arg6, var12, arg9);
                    } else {
                        this.method571(3, 0, 0, -1, -1, 0, var12, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!WZFUDUYZ", name = "a", descriptor = "(Z[B[LEOLCIJGV;LPAJXYXWG;II)V")
    public final void method567(boolean arg0, byte[] arg1, class14[] arg2, class39 arg3, int arg4, int arg5) {
        if (!arg0) {
            this.field1637 = !this.field1637;
        }
        class7 var7 = new class7(arg1, (byte) 3);
        int var8 = -1;
        while (true) {
            int var9 = var7.method61();
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method61();
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = var10 & 0x3F;
                int var13 = var10 >> 6 & 0x3F;
                int var14 = var10 >> 12;
                int var15 = var7.method47();
                int var16 = var15 >> 2;
                int var17 = var15 & 0x3;
                int var18 = arg4 + var13;
                int var19 = arg5 + var12;
                if (var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) {
                    int var20 = var14;
                    if ((this.field1661[1][var18][var19] & 0x2) == 2) {
                        var20 = var14 - 1;
                    }
                    class14 var21 = null;
                    if (var20 >= 0) {
                        var21 = arg2[var20];
                    }
                    this.method565(var14, var19, var16, var21, 0, var8, arg3, var18, var17);
                }
            }
        }
    }

    @OriginalMember(owner = "client!WZFUDUYZ", name = "a", descriptor = "(IBI[LEOLCIJGV;III[BIILPAJXYXWG;)V")
    public final void method568(int arg0, byte arg1, int arg2, class14[] arg3, int arg4, int arg5, int arg6, byte[] arg7, int arg8, int arg9, class39 arg10) {
        class7 var12 = new class7(arg7, (byte) 3);
        int var13 = -1;
        if (arg1 != -103) {
            for (int var14 = 1; var14 > 0; var14++) {
            }
        }
        while (true) {
            int var15 = var12.method61();
            if (var15 == 0) {
                return;
            }
            var13 += var15;
            int var16 = 0;
            while (true) {
                int var17 = var12.method61();
                if (var17 == 0) {
                    break;
                }
                var16 += var17 - 1;
                int var18 = var16 & 0x3F;
                int var19 = var16 >> 6 & 0x3F;
                int var20 = var16 >> 12;
                int var21 = var12.method47();
                int var22 = var21 >> 2;
                int var23 = var21 & 0x3;
                if (arg4 == var20 && var19 >= arg6 && var19 < arg6 + 8 && var18 >= arg2 && var18 < arg2 + 8) {
                    class48 var24 = class48.method494(var13);
                    int var25 = arg5 + class57.method521(var23, var18 & 0x7, var24.field1443, var24.field1429, arg8, 0, var19 & 0x7);
                    int var26 = arg9 + class57.method522(var24.field1429, arg8, true, var24.field1443, var19 & 0x7, var23, var18 & 0x7);
                    if (var25 > 0 && var26 > 0 && var25 < 103 && var26 < 103) {
                        int var27 = arg0;
                        if ((this.field1661[1][var25][var26] & 0x2) == 2) {
                            var27 = arg0 - 1;
                        }
                        class14 var28 = null;
                        if (var27 >= 0) {
                            var28 = arg3[var27];
                        }
                        this.method565(arg0, var26, var22, var28, 0, var13, arg10, var25, arg8 + var23 & 0x3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!WZFUDUYZ", name = "b", descriptor = "(III)I")
    private static final int method569(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method578(var3, var5);
        int var8 = method578(var3 + 1, var5);
        int var9 = method578(var3, var5 + 1);
        int var10 = method578(var3 + 1, var5 + 1);
        int var11 = method580(var7, var8, var4, arg2);
        int var12 = method580(var9, var10, var4, arg2);
        return method580(var11, var12, var6, arg2);
    }

    @OriginalMember(owner = "client!WZFUDUYZ", name = "a", descriptor = "([[[IIILPAJXYXWG;ILEOLCIJGV;IIIII)V")
    public static final void method570(int[][][] arg0, int arg1, int arg2, class39 arg3, int arg4, class14 arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        while (arg1 >= 0) {
            for (int var43 = 1; var43 > 0; var43++) {
            }
        }
        int var11 = arg0[arg6][arg7][arg8];
        int var12 = arg0[arg6][arg7 + 1][arg8];
        int var13 = arg0[arg6][arg7 + 1][arg8 + 1];
        int var14 = arg0[arg6][arg7][arg8 + 1];
        int var15 = var11 + var12 + var13 + var14 >> 2;
        class48 var16 = class48.method494(arg10);
        int var17 = (arg10 << 14) + (arg8 << 7) + arg7 + 1073741824;
        if (!var16.field1424) {
            var17 += Integer.MIN_VALUE;
        }
        byte var18 = (byte) ((arg2 << 6) + arg9);
        if (arg9 == 22) {
            class44 var19;
            if (var16.field1441 == -1 && var16.field1436 == null) {
                var19 = var16.method492(22, arg2, var11, var12, var13, var14, -1);
            } else {
                var19 = new class50(var13, arg2, arg10, 22, var16.field1441, true, (byte) -21, var14, var12, var11);
            }
            arg3.method381(arg4, var17, arg8, var18, var19, 5, arg7, var15);
            if (var16.field1430 && var16.field1424) {
                arg5.method288(arg8, false, arg7);
            }
        } else if (arg9 == 10 || arg9 == 11) {
            class44 var39;
            if (var16.field1441 == -1 && var16.field1436 == null) {
                var39 = var16.method492(10, arg2, var11, var12, var13, var14, -1);
            } else {
                var39 = new class50(var13, arg2, arg10, 10, var16.field1441, true, (byte) -21, var14, var12, var11);
            }
            if (var39 != null) {
                int var40 = 0;
                if (arg9 == 11) {
                    var40 += 256;
                }
                int var41;
                int var42;
                if (arg2 == 1 || arg2 == 3) {
                    var41 = var16.field1443;
                    var42 = var16.field1429;
                } else {
                    var41 = var16.field1429;
                    var42 = var16.field1443;
                }
                arg3.method385(arg4, arg8, var15, var39, var40, var17, var18, field1658, arg7, var42, var41);
            }
            if (var16.field1430) {
                arg5.method287(arg8, true, var16.field1453, var16.field1429, var16.field1443, arg2, arg7);
            }
        } else if (arg9 >= 12) {
            class44 var20;
            if (var16.field1441 == -1 && var16.field1436 == null) {
                var20 = var16.method492(arg9, arg2, var11, var12, var13, var14, -1);
            } else {
                var20 = new class50(var13, arg2, arg10, arg9, var16.field1441, true, (byte) -21, var14, var12, var11);
            }
            arg3.method385(arg4, arg8, var15, var20, 0, var17, var18, field1658, arg7, 1, 1);
            if (var16.field1430) {
                arg5.method287(arg8, true, var16.field1453, var16.field1429, var16.field1443, arg2, arg7);
            }
        } else if (arg9 == 0) {
            class44 var21;
            if (var16.field1441 == -1 && var16.field1436 == null) {
                var21 = var16.method492(0, arg2, var11, var12, var13, var14, -1);
            } else {
                var21 = new class50(var13, arg2, arg10, 0, var16.field1441, true, (byte) -21, var14, var12, var11);
            }
            arg3.method383(arg4, field1642[arg2], 0, var17, arg8, var21, 0, var18, arg7, var15, null);
            if (var16.field1430) {
                arg5.method286(arg2, arg8, arg9, 2, arg7, var16.field1453);
            }
        } else if (arg9 == 1) {
            class44 var22;
            if (var16.field1441 == -1 && var16.field1436 == null) {
                var22 = var16.method492(1, arg2, var11, var12, var13, var14, -1);
            } else {
                var22 = new class50(var13, arg2, arg10, 1, var16.field1441, true, (byte) -21, var14, var12, var11);
            }
            arg3.method383(arg4, field1635[arg2], 0, var17, arg8, var22, 0, var18, arg7, var15, null);
            if (var16.field1430) {
                arg5.method286(arg2, arg8, arg9, 2, arg7, var16.field1453);
            }
        } else if (arg9 == 2) {
            int var23 = arg2 + 1 & 0x3;
            class44 var24;
            class44 var25;
            if (var16.field1441 == -1 && var16.field1436 == null) {
                var24 = var16.method492(2, arg2 + 4, var11, var12, var13, var14, -1);
                var25 = var16.method492(2, var23, var11, var12, var13, var14, -1);
            } else {
                var24 = new class50(var13, arg2 + 4, arg10, 2, var16.field1441, true, (byte) -21, var14, var12, var11);
                var25 = new class50(var13, var23, arg10, 2, var16.field1441, true, (byte) -21, var14, var12, var11);
            }
            arg3.method383(arg4, field1642[arg2], 0, var17, arg8, var24, field1642[var23], var18, arg7, var15, var25);
            if (var16.field1430) {
                arg5.method286(arg2, arg8, arg9, 2, arg7, var16.field1453);
            }
        } else if (arg9 == 3) {
            class44 var26;
            if (var16.field1441 == -1 && var16.field1436 == null) {
                var26 = var16.method492(3, arg2, var11, var12, var13, var14, -1);
            } else {
                var26 = new class50(var13, arg2, arg10, 3, var16.field1441, true, (byte) -21, var14, var12, var11);
            }
            arg3.method383(arg4, field1635[arg2], 0, var17, arg8, var26, 0, var18, arg7, var15, null);
            if (var16.field1430) {
                arg5.method286(arg2, arg8, arg9, 2, arg7, var16.field1453);
            }
        } else if (arg9 == 9) {
            class44 var27;
            if (var16.field1441 == -1 && var16.field1436 == null) {
                var27 = var16.method492(arg9, arg2, var11, var12, var13, var14, -1);
            } else {
                var27 = new class50(var13, arg2, arg10, arg9, var16.field1441, true, (byte) -21, var14, var12, var11);
            }
            arg3.method385(arg4, arg8, var15, var27, 0, var17, var18, field1658, arg7, 1, 1);
            if (var16.field1430) {
                arg5.method287(arg8, true, var16.field1453, var16.field1429, var16.field1443, arg2, arg7);
            }
        } else {
            if (var16.field1403) {
                if (arg2 == 1) {
                    int var28 = var14;
                    var14 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var28;
                } else if (arg2 == 2) {
                    int var29 = var14;
                    var14 = var12;
                    var12 = var29;
                    int var30 = var13;
                    var13 = var11;
                    var11 = var30;
                } else if (arg2 == 3) {
                    int var31 = var14;
                    var14 = var11;
                    var11 = var12;
                    var12 = var13;
                    var13 = var31;
                }
            }
            if (arg9 == 4) {
                class44 var32;
                if (var16.field1441 == -1 && var16.field1436 == null) {
                    var32 = var16.method492(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var32 = new class50(var13, 0, arg10, 4, var16.field1441, true, (byte) -21, var14, var12, var11);
                }
                arg3.method384(0, 4, var15, var17, arg4, var32, arg2 * 512, 0, arg7, arg8, field1642[arg2], var18);
            } else if (arg9 == 5) {
                int var33 = 16;
                int var34 = arg3.method401(arg4, arg7, arg8);
                if (var34 > 0) {
                    var33 = class48.method494(var34 >> 14 & 0x7FFF).field1442;
                }
                class44 var35;
                if (var16.field1441 == -1 && var16.field1436 == null) {
                    var35 = var16.method492(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var35 = new class50(var13, 0, arg10, 4, var16.field1441, true, (byte) -21, var14, var12, var11);
                }
                arg3.method384(field1648[arg2] * var33, 4, var15, var17, arg4, var35, arg2 * 512, field1644[arg2] * var33, arg7, arg8, field1642[arg2], var18);
            } else if (arg9 == 6) {
                class44 var36;
                if (var16.field1441 == -1 && var16.field1436 == null) {
                    var36 = var16.method492(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var36 = new class50(var13, 0, arg10, 4, var16.field1441, true, (byte) -21, var14, var12, var11);
                }
                arg3.method384(0, 4, var15, var17, arg4, var36, arg2, 0, arg7, arg8, 256, var18);
            } else if (arg9 == 7) {
                class44 var37;
                if (var16.field1441 == -1 && var16.field1436 == null) {
                    var37 = var16.method492(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var37 = new class50(var13, 0, arg10, 4, var16.field1441, true, (byte) -21, var14, var12, var11);
                }
                arg3.method384(0, 4, var15, var17, arg4, var37, arg2, 0, arg7, arg8, 512, var18);
            } else if (arg9 == 8) {
                class44 var38;
                if (var16.field1441 == -1 && var16.field1436 == null) {
                    var38 = var16.method492(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var38 = new class50(var13, 0, arg10, 4, var16.field1441, true, (byte) -21, var14, var12, var11);
                }
                arg3.method384(0, 4, var15, var17, arg4, var38, arg2, 0, arg7, arg8, 768, var18);
            }
        }
    }

    @OriginalMember(owner = "client!WZFUDUYZ", name = "a", descriptor = "(IIIIIILBSNPYLEV;I)V")
    private final void method571(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class7 arg6, int arg7) {
        if (arg0 < this.field1640 || arg0 > this.field1640) {
            return;
        }
        if (arg3 < 0 || arg3 >= 104 || arg4 < 0 || arg4 >= 104) {
            while (true) {
                int var11 = arg6.method47();
                if (var11 == 0) {
                    return;
                }
                if (var11 == 1) {
                    arg6.method47();
                    return;
                }
                if (var11 <= 49) {
                    arg6.method47();
                }
            }
        }
        this.field1661[arg5][arg3][arg4] = 0;
        while (true) {
            int var9 = arg6.method47();
            if (var9 == 0) {
                if (arg5 == 0) {
                    this.field1663[0][arg3][arg4] = -method574(arg3 + arg2 + 932731, arg4 + 556238 + arg1) * 8;
                    return;
                } else {
                    this.field1663[arg5][arg3][arg4] = this.field1663[arg5 - 1][arg3][arg4] - 240;
                    return;
                }
            }
            if (var9 == 1) {
                int var10 = arg6.method47();
                if (var10 == 1) {
                    var10 = 0;
                }
                if (arg5 == 0) {
                    this.field1663[0][arg3][arg4] = -var10 * 8;
                    return;
                }
                this.field1663[arg5][arg3][arg4] = this.field1663[arg5 - 1][arg3][arg4] - var10 * 8;
                return;
            }
            if (var9 <= 49) {
                this.field1668[arg5][arg3][arg4] = arg6.method48();
                this.field1660[arg5][arg3][arg4] = (byte) ((var9 - 2) / 4);
                this.field1645[arg5][arg3][arg4] = (byte) (var9 + arg7 - 2 & 0x3);
            } else if (var9 <= 81) {
                this.field1661[arg5][arg3][arg4] = (byte) (var9 - 49);
            } else {
                this.field1655[arg5][arg3][arg4] = (byte) (var9 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!WZFUDUYZ", name = "a", descriptor = "(II[BI)Z")
    public static final boolean method572(int arg0, int arg1, byte[] arg2, int arg3) {
        boolean var4 = true;
        class7 var5 = new class7(arg2, (byte) 3);
        int var6 = -1;
        if (arg1 != -48151) {
            throw new NullPointerException();
        }
        label52: while (true) {
            int var7 = var5.method61();
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method61();
                    if (var11 == 0) {
                        continue label52;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = var5.method47() >> 2;
                    int var15 = arg3 + var13;
                    int var16 = arg0 + var12;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        class48 var17 = class48.method494(var6);
                        if (var14 != 22 || !field1659 || var17.field1424 || var17.field1448) {
                            var4 &= var17.method499(-577);
                            var9 = true;
                        }
                    }
                }
                int var10 = var5.method61();
                if (var10 == 0) {
                    break;
                }
                var5.method47();
            }
        }
    }

    @OriginalMember(owner = "client!WZFUDUYZ", name = "a", descriptor = "(II[LEOLCIJGV;I[BII)V")
    public final void method573(int arg0, int arg1, class14[] arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    if (arg5 + var14 > 0 && arg5 + var14 < 103 && arg6 + var15 > 0 && arg6 + var15 < 103) {
                        arg2[var8].field675[arg5 + var14][arg6 + var15] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class7 var9 = new class7(arg4, (byte) 3);
        if (arg1 != -48086) {
            for (int var10 = 1; var10 > 0; var10++) {
            }
        }
        for (int var11 = 0; var11 < 4; var11++) {
            for (int var12 = 0; var12 < 64; var12++) {
                for (int var13 = 0; var13 < 64; var13++) {
                    this.method571(3, arg3, arg0, arg5 + var12, arg6 + var13, var11, var9, 0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!WZFUDUYZ", name = "b", descriptor = "(II)I")
    private static final int method574(int arg0, int arg1) {
        int var2 = method569(arg0 + 45365, arg1 + 91923, 4) + (method569(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method569(arg0, arg1, 1) - 128 >> 2) - 128;
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @OriginalMember(owner = "client!WZFUDUYZ", name = "c", descriptor = "(II)I")
    private static final int method575(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!WZFUDUYZ", name = "a", descriptor = "(IIBI)V")
    public final void method576(int arg0, int arg1, byte arg2, int arg3) {
        for (int var5 = 0; var5 < 8; var5++) {
            for (int var8 = 0; var8 < 8; var8++) {
                this.field1663[arg3][arg0 + var5][arg1 + var8] = 0;
            }
        }
        if (arg2 != -96) {
            this.field1662 = -8;
        }
        if (arg0 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                this.field1663[arg3][arg0][arg1 + var6] = this.field1663[arg3][arg0 - 1][arg1 + var6];
            }
        }
        if (arg1 > 0) {
            for (int var7 = 1; var7 < 8; var7++) {
                this.field1663[arg3][arg0 + var7][arg1] = this.field1663[arg3][arg0 + var7][arg1 - 1];
            }
        }
        if (arg0 > 0 && this.field1663[arg3][arg0 - 1][arg1] != 0) {
            this.field1663[arg3][arg0][arg1] = this.field1663[arg3][arg0 - 1][arg1];
        } else if (arg1 > 0 && this.field1663[arg3][arg0][arg1 - 1] != 0) {
            this.field1663[arg3][arg0][arg1] = this.field1663[arg3][arg0][arg1 - 1];
        } else if (arg0 > 0 && arg1 > 0 && this.field1663[arg3][arg0 - 1][arg1 - 1] != 0) {
            this.field1663[arg3][arg0][arg1] = this.field1663[arg3][arg0 - 1][arg1 - 1];
        }
    }

    @OriginalMember(owner = "client!WZFUDUYZ", name = "a", descriptor = "(IIIII)V")
    public final void method577(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var6 = arg2; var6 <= arg0 + arg2; var6++) {
            for (int var8 = arg1; var8 <= arg1 + arg3; var8++) {
                if (var8 >= 0 && var8 < this.field1665 && var6 >= 0 && var6 < this.field1666) {
                    this.field1643[0][var8][var6] = 127;
                    if (arg1 == var8 && var8 > 0) {
                        this.field1663[0][var8][var6] = this.field1663[0][var8 - 1][var6];
                    }
                    if (arg1 + arg3 == var8 && var8 < this.field1665 - 1) {
                        this.field1663[0][var8][var6] = this.field1663[0][var8 + 1][var6];
                    }
                    if (arg2 == var6 && var6 > 0) {
                        this.field1663[0][var8][var6] = this.field1663[0][var8][var6 - 1];
                    }
                    if (arg0 + arg2 == var6 && var6 < this.field1666 - 1) {
                        this.field1663[0][var8][var6] = this.field1663[0][var8][var6 + 1];
                    }
                }
            }
        }
        while (arg4 >= 0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
    }

    @OriginalMember(owner = "client!WZFUDUYZ", name = "d", descriptor = "(II)I")
    private static final int method578(int arg0, int arg1) {
        int var2 = method562(arg0 - 1, arg1 - 1) + method562(arg0 + 1, arg1 - 1) + method562(arg0 - 1, arg1 + 1) + method562(arg0 + 1, arg1 + 1);
        int var3 = method562(arg0 - 1, arg1) + method562(arg0 + 1, arg1) + method562(arg0, arg1 - 1) + method562(arg0, arg1 + 1);
        int var4 = method562(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @OriginalMember(owner = "client!WZFUDUYZ", name = "e", descriptor = "(II)I")
    private final int method579(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!WZFUDUYZ", name = "<init>", descriptor = "(I[[[BBI[[[I)V")
    public class64(int arg0, byte[][][] arg1, byte arg2, int arg3, int[][][] arg4) {
        field1664 = 99;
        this.field1665 = arg3;
        this.field1666 = arg0;
        this.field1663 = arg4;
        this.field1661 = arg1;
        this.field1655 = new byte[4][this.field1665][this.field1666];
        this.field1668 = new byte[4][this.field1665][this.field1666];
        this.field1660 = new byte[4][this.field1665][this.field1666];
        this.field1645 = new byte[4][this.field1665][this.field1666];
        this.field1638 = new int[4][this.field1665 + 1][this.field1666 + 1];
        if (arg2 != 1) {
            throw new NullPointerException();
        }
        this.field1643 = new byte[4][this.field1665 + 1][this.field1666 + 1];
        this.field1636 = new int[this.field1665 + 1][this.field1666 + 1];
        this.field1650 = new int[this.field1666];
        this.field1651 = new int[this.field1666];
        this.field1652 = new int[this.field1666];
        this.field1653 = new int[this.field1666];
        this.field1654 = new int[this.field1666];
    }

    @OriginalMember(owner = "client!WZFUDUYZ", name = "a", descriptor = "(IIII)I")
    private static final int method580(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class27.field868[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @OriginalMember(owner = "client!WZFUDUYZ", name = "c", descriptor = "(III)Z")
    public static final boolean method581(int arg0, int arg1, int arg2) {
        class48 var3 = class48.method494(arg0);
        if (arg1 < field1656 || arg1 > field1656) {
            field1641 = 210;
        }
        if (arg2 == 11) {
            arg2 = 10;
        }
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        return var3.method501(arg2, 447);
    }
}
