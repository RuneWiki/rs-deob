import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("YCYSFKFW")
public class class63 {

    @OriginalMember(owner = "YCYSFKFW", name = "r", descriptor = "I")
    private int field1593 = 33722;

    @OriginalMember(owner = "YCYSFKFW", name = "v", descriptor = "Z")
    private boolean field1597 = true;

    @OriginalMember(owner = "YCYSFKFW", name = "z", descriptor = "I")
    private int field1601;

    @OriginalMember(owner = "YCYSFKFW", name = "A", descriptor = "I")
    private int field1602;

    @OriginalMember(owner = "YCYSFKFW", name = "o", descriptor = "[[[I")
    private int[][][] field1590;

    @OriginalMember(owner = "YCYSFKFW", name = "j", descriptor = "[[[B")
    private byte[][][] field1585;

    @OriginalMember(owner = "YCYSFKFW", name = "n", descriptor = "[[[B")
    private byte[][][] field1589;

    @OriginalMember(owner = "YCYSFKFW", name = "f", descriptor = "[[[B")
    private byte[][][] field1581;

    @OriginalMember(owner = "YCYSFKFW", name = "i", descriptor = "[[[B")
    private byte[][][] field1584;

    @OriginalMember(owner = "YCYSFKFW", name = "q", descriptor = "[[[B")
    private byte[][][] field1592;

    @OriginalMember(owner = "YCYSFKFW", name = "C", descriptor = "[[[I")
    private int[][][] field1604;

    @OriginalMember(owner = "YCYSFKFW", name = "p", descriptor = "[[[B")
    private byte[][][] field1591;

    @OriginalMember(owner = "YCYSFKFW", name = "B", descriptor = "[[I")
    private int[][] field1603;

    @OriginalMember(owner = "YCYSFKFW", name = "a", descriptor = "[I")
    private int[] field1576;

    @OriginalMember(owner = "YCYSFKFW", name = "b", descriptor = "[I")
    private int[] field1577;

    @OriginalMember(owner = "YCYSFKFW", name = "c", descriptor = "[I")
    private int[] field1578;

    @OriginalMember(owner = "YCYSFKFW", name = "d", descriptor = "[I")
    private int[] field1579;

    @OriginalMember(owner = "YCYSFKFW", name = "e", descriptor = "[I")
    private int[] field1580;

    @OriginalMember(owner = "YCYSFKFW", name = "g", descriptor = "I")
    private static int field1582 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "YCYSFKFW", name = "h", descriptor = "I")
    private static int field1583 = -91;

    @OriginalMember(owner = "YCYSFKFW", name = "k", descriptor = "[I")
    private static final int[] field1586 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "YCYSFKFW", name = "l", descriptor = "[I")
    private static final int[] field1587 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "YCYSFKFW", name = "m", descriptor = "[I")
    private static final int[] field1588 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "YCYSFKFW", name = "s", descriptor = "I")
    private static int field1594 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "YCYSFKFW", name = "t", descriptor = "Z")
    public static boolean field1595 = true;

    @OriginalMember(owner = "YCYSFKFW", name = "u", descriptor = "I")
    private static int field1596 = -302;

    @OriginalMember(owner = "YCYSFKFW", name = "w", descriptor = "Z")
    private static boolean field1598 = true;

    @OriginalMember(owner = "YCYSFKFW", name = "y", descriptor = "I")
    public static int field1600 = 99;

    @OriginalMember(owner = "YCYSFKFW", name = "E", descriptor = "[I")
    private static final int[] field1606 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "YCYSFKFW", name = "D", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "YCYSFKFW", name = "x", descriptor = "Z")
    private static boolean field1599;

    @OriginalMember(owner = "YCYSFKFW", name = "a", descriptor = "(LNCUAQOFM;Z[LNXLHMSCV;)V")
    public final void method497(class32 arg0, boolean arg1, class35[] arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((this.field1585[var4][var110][var111] & 0x1) == 1) {
                        int var112 = var4;
                        if ((this.field1585[1][var110][var111] & 0x2) == 2) {
                            var112 = var4 - 1;
                        }
                        if (var112 >= 0) {
                            arg2[var112].method357(var110, -19527, var111);
                        }
                    }
                }
            }
        }
        field1594 += (int) (Math.random() * 5.0D) - 2;
        if (field1594 < -8) {
            field1594 = -8;
        }
        if (field1594 > 8) {
            field1594 = 8;
        }
        field1582 += (int) (Math.random() * 5.0D) - 2;
        if (field1582 < -16) {
            field1582 = -16;
        }
        if (field1582 > 16) {
            field1582 = 16;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            byte[][] var48 = this.field1591[var5];
            byte var49 = 96;
            short var50 = 768;
            byte var51 = -50;
            byte var52 = -10;
            byte var53 = -50;
            int var54 = (int) Math.sqrt((double) (var53 * var53 + var51 * var51 + var52 * var52));
            int var55 = var50 * var54 >> 8;
            for (int var56 = 1; var56 < this.field1602 - 1; var56++) {
                for (int var101 = 1; var101 < this.field1601 - 1; var101++) {
                    int var102 = this.field1590[var5][var101 + 1][var56] - this.field1590[var5][var101 - 1][var56];
                    int var103 = this.field1590[var5][var101][var56 + 1] - this.field1590[var5][var101][var56 - 1];
                    int var104 = (int) Math.sqrt((double) (var103 * var103 + var102 * var102 + 65536));
                    int var105 = (var102 << 8) / var104;
                    int var106 = 65536 / var104;
                    int var107 = (var103 << 8) / var104;
                    int var108 = (var53 * var107 + var51 * var105 + var52 * var106) / var55 + var49;
                    int var109 = (var48[var101][var56] >> 1) + (var48[var101][var56 + 1] >> 3) + (var48[var101][var56 - 1] >> 2) + (var48[var101 - 1][var56] >> 2) + (var48[var101 + 1][var56] >> 3);
                    this.field1603[var101][var56] = var108 - var109;
                }
            }
            for (int var57 = 0; var57 < this.field1602; var57++) {
                this.field1576[var57] = 0;
                this.field1577[var57] = 0;
                this.field1578[var57] = 0;
                this.field1579[var57] = 0;
                this.field1580[var57] = 0;
            }
            for (int var58 = -5; var58 < this.field1601 + 5; var58++) {
                for (int var61 = 0; var61 < this.field1602; var61++) {
                    int var95 = var58 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < this.field1601) {
                        int var96 = this.field1589[var5][var95][var61] & 0xFF;
                        if (var96 > 0) {
                            class19 var97 = class19.field861[var96 - 1];
                            this.field1576[var61] += var97.field870;
                            this.field1577[var61] += var97.field868;
                            this.field1578[var61] += var97.field869;
                            this.field1579[var61] += var97.field871;
                            var10002 = this.field1580[var61]++;
                        }
                    }
                    int var98 = var58 - 5;
                    if (var98 >= 0 && var98 < this.field1601) {
                        int var99 = this.field1589[var5][var98][var61] & 0xFF;
                        if (var99 > 0) {
                            class19 var100 = class19.field861[var99 - 1];
                            this.field1576[var61] -= var100.field870;
                            this.field1577[var61] -= var100.field868;
                            this.field1578[var61] -= var100.field869;
                            this.field1579[var61] -= var100.field871;
                            var10002 = this.field1580[var61]--;
                        }
                    }
                }
                if (var58 >= 1 && var58 < this.field1601 - 1) {
                    int var62 = 0;
                    int var63 = 0;
                    int var64 = 0;
                    int var65 = 0;
                    int var66 = 0;
                    for (int var67 = -5; var67 < this.field1602 + 5; var67++) {
                        int var68 = var67 + 5;
                        if (var68 >= 0 && var68 < this.field1602) {
                            var62 += this.field1576[var68];
                            var63 += this.field1577[var68];
                            var64 += this.field1578[var68];
                            var65 += this.field1579[var68];
                            var66 += this.field1580[var68];
                        }
                        int var69 = var67 - 5;
                        if (var69 >= 0 && var69 < this.field1602) {
                            var62 -= this.field1576[var69];
                            var63 -= this.field1577[var69];
                            var64 -= this.field1578[var69];
                            var65 -= this.field1579[var69];
                            var66 -= this.field1580[var69];
                        }
                        if (var67 >= 1 && var67 < this.field1602 - 1 && (!field1595 || (this.field1585[0][var58][var67] & 0x2) != 0 || (this.field1585[var5][var58][var67] & 0x10) == 0 && this.method514(var58, var5, 0, var67) == field1605)) {
                            if (var5 < field1600) {
                                field1600 = var5;
                            }
                            int var70 = this.field1589[var5][var58][var67] & 0xFF;
                            int var71 = this.field1581[var5][var58][var67] & 0xFF;
                            if (var70 > 0 || var71 > 0) {
                                int var72 = this.field1590[var5][var58][var67];
                                int var73 = this.field1590[var5][var58 + 1][var67];
                                int var74 = this.field1590[var5][var58 + 1][var67 + 1];
                                int var75 = this.field1590[var5][var58][var67 + 1];
                                int var76 = this.field1603[var58][var67];
                                int var77 = this.field1603[var58 + 1][var67];
                                int var78 = this.field1603[var58 + 1][var67 + 1];
                                int var79 = this.field1603[var58][var67 + 1];
                                int var80 = -1;
                                int var81 = -1;
                                if (var70 > 0) {
                                    int var82 = var62 * 256 / var65;
                                    int var83 = var63 / var66;
                                    int var84 = var64 / var66;
                                    var80 = this.method505(var82, var83, var84);
                                    int var85 = field1594 + var82 & 0xFF;
                                    int var86 = field1582 + var84;
                                    if (var86 < 0) {
                                        var86 = 0;
                                    } else if (var86 > 255) {
                                        var86 = 255;
                                    }
                                    var81 = this.method505(var85, var83, var86);
                                }
                                if (var5 > 0) {
                                    boolean var87 = true;
                                    if (var70 == 0 && this.field1584[var5][var58][var67] != 0) {
                                        var87 = false;
                                    }
                                    if (var71 > 0 && !class19.field861[var71 - 1].field866) {
                                        var87 = false;
                                    }
                                    if (var87 && var72 == var73 && var72 == var74 && var72 == var75) {
                                        this.field1604[var5][var58][var67] |= 0x924;
                                    }
                                }
                                int var88 = 0;
                                if (var80 != -1) {
                                    var88 = class8.field635[method502(var81, 96)];
                                }
                                if (var71 == 0) {
                                    arg0.method297(var5, var58, var67, 0, 0, -1, var72, var73, var74, var75, method502(var80, var76), method502(var80, var77), method502(var80, var78), method502(var80, var79), 0, 0, 0, 0, var88, 0);
                                } else {
                                    int var89 = this.field1584[var5][var58][var67] + 1;
                                    byte var90 = this.field1592[var5][var58][var67];
                                    class19 var91 = class19.field861[var71 - 1];
                                    int var92 = var91.field864;
                                    int var93;
                                    int var94;
                                    if (var92 >= 0) {
                                        var93 = class8.method189(field1583, var92);
                                        var94 = -1;
                                    } else if (var91.field863 == 16711935) {
                                        var93 = 0;
                                        var94 = -2;
                                        var92 = -1;
                                    } else {
                                        var94 = this.method505(var91.field867, var91.field868, var91.field869);
                                        var93 = class8.field635[this.method501(var91.field872, 96)];
                                    }
                                    arg0.method297(var5, var58, var67, var89, var90, var92, var72, var73, var74, var75, method502(var80, var76), method502(var80, var77), method502(var80, var78), method502(var80, var79), this.method501(var94, var76), this.method501(var94, var77), this.method501(var94, var78), this.method501(var94, var79), var88, var93);
                                }
                            }
                        }
                    }
                }
            }
            for (int var59 = 1; var59 < this.field1602 - 1; var59++) {
                for (int var60 = 1; var60 < this.field1601 - 1; var60++) {
                    arg0.method296(var5, var60, var59, this.method514(var60, var5, 0, var59));
                }
            }
        }
        arg0.method323(-50, -50, false, 64, -10, 768);
        for (int var6 = 0; var6 < this.field1601; var6++) {
            for (int var47 = 0; var47 < this.field1602; var47++) {
                if ((this.field1585[1][var6][var47] & 0x2) == 2) {
                    arg0.method294(var47, true, var6);
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
                for (int var12 = 0; var12 <= this.field1602; var12++) {
                    for (int var13 = 0; var13 <= this.field1601; var13++) {
                        if ((this.field1604[var11][var13][var12] & var7) != 0) {
                            int var14 = var12;
                            int var15 = var12;
                            int var16 = var11;
                            int var17 = var11;
                            while (var14 > 0 && (this.field1604[var11][var13][var14 - 1] & var7) != 0) {
                                var14--;
                            }
                            while (var15 < this.field1602 && (this.field1604[var11][var13][var15 + 1] & var7) != 0) {
                                var15++;
                            }
                            label330: while (var16 > 0) {
                                for (int var18 = var14; var18 <= var15; var18++) {
                                    if ((this.field1604[var16 - 1][var13][var18] & var7) == 0) {
                                        break label330;
                                    }
                                }
                                var16--;
                            }
                            label319: while (var17 < var10) {
                                for (int var19 = var14; var19 <= var15; var19++) {
                                    if ((this.field1604[var17 + 1][var13][var19] & var7) == 0) {
                                        break label319;
                                    }
                                }
                                var17++;
                            }
                            int var20 = (var17 + 1 - var16) * (var15 + 1 - var14);
                            if (var20 >= 8) {
                                short var21 = 240;
                                int var22 = this.field1590[var17][var13][var14] - var21;
                                int var23 = this.field1590[var16][var13][var14];
                                class32.method295(50, var22, var13 * 128, var14 * 128, var13 * 128, var15 * 128 + 128, 1, var10, var23);
                                for (int var24 = var16; var24 <= var17; var24++) {
                                    for (int var25 = var14; var25 <= var15; var25++) {
                                        this.field1604[var24][var13][var25] &= ~var7;
                                    }
                                }
                            }
                        }
                        if ((this.field1604[var11][var13][var12] & var8) != 0) {
                            int var26 = var13;
                            int var27 = var13;
                            int var28 = var11;
                            int var29 = var11;
                            while (var26 > 0 && (this.field1604[var11][var26 - 1][var12] & var8) != 0) {
                                var26--;
                            }
                            while (var27 < this.field1601 && (this.field1604[var11][var27 + 1][var12] & var8) != 0) {
                                var27++;
                            }
                            label383: while (var28 > 0) {
                                for (int var30 = var26; var30 <= var27; var30++) {
                                    if ((this.field1604[var28 - 1][var30][var12] & var8) == 0) {
                                        break label383;
                                    }
                                }
                                var28--;
                            }
                            label372: while (var29 < var10) {
                                for (int var31 = var26; var31 <= var27; var31++) {
                                    if ((this.field1604[var29 + 1][var31][var12] & var8) == 0) {
                                        break label372;
                                    }
                                }
                                var29++;
                            }
                            int var32 = (var29 + 1 - var28) * (var27 + 1 - var26);
                            if (var32 >= 8) {
                                short var33 = 240;
                                int var34 = this.field1590[var29][var26][var12] - var33;
                                int var35 = this.field1590[var28][var26][var12];
                                class32.method295(50, var34, var26 * 128, var12 * 128, var27 * 128 + 128, var12 * 128, 2, var10, var35);
                                for (int var36 = var28; var36 <= var29; var36++) {
                                    for (int var37 = var26; var37 <= var27; var37++) {
                                        this.field1604[var36][var37][var12] &= ~var8;
                                    }
                                }
                            }
                        }
                        if ((this.field1604[var11][var13][var12] & var9) != 0) {
                            int var38 = var13;
                            int var39 = var13;
                            int var40 = var12;
                            int var41 = var12;
                            while (var40 > 0 && (this.field1604[var11][var13][var40 - 1] & var9) != 0) {
                                var40--;
                            }
                            while (var41 < this.field1602 && (this.field1604[var11][var13][var41 + 1] & var9) != 0) {
                                var41++;
                            }
                            label436: while (var38 > 0) {
                                for (int var42 = var40; var42 <= var41; var42++) {
                                    if ((this.field1604[var11][var38 - 1][var42] & var9) == 0) {
                                        break label436;
                                    }
                                }
                                var38--;
                            }
                            label425: while (var39 < this.field1601) {
                                for (int var43 = var40; var43 <= var41; var43++) {
                                    if ((this.field1604[var11][var39 + 1][var43] & var9) == 0) {
                                        break label425;
                                    }
                                }
                                var39++;
                            }
                            if ((var39 + 1 - var38) * (var41 + 1 - var40) >= 4) {
                                int var44 = this.field1590[var11][var38][var40];
                                class32.method295(50, var44, var38 * 128, var40 * 128, var39 * 128 + 128, var41 * 128 + 128, 4, var10, var44);
                                for (int var45 = var38; var45 <= var39; var45++) {
                                    for (int var46 = var40; var46 <= var41; var46++) {
                                        this.field1604[var11][var45][var46] &= ~var9;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!arg1) {
            ;
        }
    }

    @OriginalMember(owner = "YCYSFKFW", name = "a", descriptor = "(ILNXLHMSCV;IIIZIILNCUAQOFM;)V")
    private final void method498(int arg0, class35 arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, class32 arg8) {
        if (field1595 && (this.field1585[0][arg4][arg3] & 0x2) == 0) {
            if ((this.field1585[arg6][arg4][arg3] & 0x10) != 0) {
                return;
            }
            if (this.method514(arg4, arg6, 0, arg3) != field1605) {
                return;
            }
        }
        if (arg6 < field1600) {
            field1600 = arg6;
        }
        int var10 = this.field1590[arg6][arg4][arg3];
        int var11 = this.field1590[arg6][arg4 + 1][arg3];
        int var12 = this.field1590[arg6][arg4 + 1][arg3 + 1];
        int var13 = this.field1590[arg6][arg4][arg3 + 1];
        int var14 = var10 + var11 + var12 + var13 >> 2;
        class33 var15 = class33.method350(arg7);
        int var16 = (arg7 << 14) + (arg3 << 7) + arg4 + 1073741824;
        if (!arg5) {
            return;
        }
        if (!var15.field1148) {
            var16 += Integer.MIN_VALUE;
        }
        byte var17 = (byte) ((arg2 << 6) + arg0);
        if (arg0 == 22) {
            if (!field1595 || var15.field1148 || var15.field1133) {
                class54 var18;
                if (var15.field1134 == -1 && var15.field1155 == null) {
                    var18 = var15.method344(22, arg2, var10, var11, var12, var13, -1);
                } else {
                    var18 = new class24(var15.field1134, true, arg7, 22, var11, var13, (byte) -120, var12, var10, arg2);
                }
                arg8.method298(var16, 636, arg4, arg3, var14, arg6, var18, var17);
                if (var15.field1127 && var15.field1148 && arg1 != null) {
                    arg1.method357(arg4, -19527, arg3);
                }
            }
        } else if (arg0 == 10 || arg0 == 11) {
            class54 var38;
            if (var15.field1134 == -1 && var15.field1155 == null) {
                var38 = var15.method344(10, arg2, var10, var11, var12, var13, -1);
            } else {
                var38 = new class24(var15.field1134, true, arg7, 10, var11, var13, (byte) -120, var12, var10, arg2);
            }
            if (var38 != null) {
                int var39 = 0;
                if (arg0 == 11) {
                    var39 += 256;
                }
                int var40;
                int var41;
                if (arg2 == 1 || arg2 == 3) {
                    var40 = var15.field1136;
                    var41 = var15.field1116;
                } else {
                    var40 = var15.field1116;
                    var41 = var15.field1136;
                }
                if (arg8.method302(arg4, var14, arg6, var17, var16, arg3, 1, var41, var40, var39, var38) && var15.field1142) {
                    class4 var42;
                    if (var38 instanceof class4) {
                        var42 = (class4) var38;
                    } else {
                        var42 = var15.method344(10, arg2, var10, var11, var12, var13, -1);
                    }
                    if (var42 != null) {
                        for (int var43 = 0; var43 <= var40; var43++) {
                            for (int var44 = 0; var44 <= var41; var44++) {
                                int var45 = var42.field57 / 4;
                                if (var45 > 30) {
                                    var45 = 30;
                                }
                                if (var45 > this.field1591[arg6][arg4 + var43][arg3 + var44]) {
                                    this.field1591[arg6][arg4 + var43][arg3 + var44] = (byte) var45;
                                }
                            }
                        }
                    }
                }
            }
            if (var15.field1127 && arg1 != null) {
                arg1.method356(var15.field1136, arg2, var15.field1116, 8, arg3, arg4, var15.field1164);
            }
        } else if (arg0 >= 12) {
            class54 var19;
            if (var15.field1134 == -1 && var15.field1155 == null) {
                var19 = var15.method344(arg0, arg2, var10, var11, var12, var13, -1);
            } else {
                var19 = new class24(var15.field1134, true, arg7, arg0, var11, var13, (byte) -120, var12, var10, arg2);
            }
            arg8.method302(arg4, var14, arg6, var17, var16, arg3, 1, 1, 1, 0, var19);
            if (arg0 >= 12 && arg0 <= 17 && arg0 != 13 && arg6 > 0) {
                this.field1604[arg6][arg4][arg3] |= 0x924;
            }
            if (var15.field1127 && arg1 != null) {
                arg1.method356(var15.field1136, arg2, var15.field1116, 8, arg3, arg4, var15.field1164);
            }
        } else if (arg0 == 0) {
            class54 var20;
            if (var15.field1134 == -1 && var15.field1155 == null) {
                var20 = var15.method344(0, arg2, var10, var11, var12, var13, -1);
            } else {
                var20 = new class24(var15.field1134, true, arg7, 0, var11, var13, (byte) -120, var12, var10, arg2);
            }
            arg8.method300(var16, var17, 900, null, arg3, arg4, var14, 0, var20, arg6, field1586[arg2]);
            if (arg2 == 0) {
                if (var15.field1142) {
                    this.field1591[arg6][arg4][arg3] = 50;
                    this.field1591[arg6][arg4][arg3 + 1] = 50;
                }
                if (var15.field1165) {
                    this.field1604[arg6][arg4][arg3] |= 0x249;
                }
            } else if (arg2 == 1) {
                if (var15.field1142) {
                    this.field1591[arg6][arg4][arg3 + 1] = 50;
                    this.field1591[arg6][arg4 + 1][arg3 + 1] = 50;
                }
                if (var15.field1165) {
                    this.field1604[arg6][arg4][arg3 + 1] |= 0x492;
                }
            } else if (arg2 == 2) {
                if (var15.field1142) {
                    this.field1591[arg6][arg4 + 1][arg3] = 50;
                    this.field1591[arg6][arg4 + 1][arg3 + 1] = 50;
                }
                if (var15.field1165) {
                    this.field1604[arg6][arg4 + 1][arg3] |= 0x249;
                }
            } else if (arg2 == 3) {
                if (var15.field1142) {
                    this.field1591[arg6][arg4][arg3] = 50;
                    this.field1591[arg6][arg4 + 1][arg3] = 50;
                }
                if (var15.field1165) {
                    this.field1604[arg6][arg4][arg3] |= 0x492;
                }
            }
            if (var15.field1127 && arg1 != null) {
                arg1.method355(arg0, arg4, arg3, arg2, var15.field1164, 2);
            }
            if (var15.field1167 != 16) {
                arg8.method308(var15.field1167, arg4, arg3, true, arg6);
            }
        } else if (arg0 == 1) {
            class54 var21;
            if (var15.field1134 == -1 && var15.field1155 == null) {
                var21 = var15.method344(1, arg2, var10, var11, var12, var13, -1);
            } else {
                var21 = new class24(var15.field1134, true, arg7, 1, var11, var13, (byte) -120, var12, var10, arg2);
            }
            arg8.method300(var16, var17, 900, null, arg3, arg4, var14, 0, var21, arg6, field1588[arg2]);
            if (var15.field1142) {
                if (arg2 == 0) {
                    this.field1591[arg6][arg4][arg3 + 1] = 50;
                } else if (arg2 == 1) {
                    this.field1591[arg6][arg4 + 1][arg3 + 1] = 50;
                } else if (arg2 == 2) {
                    this.field1591[arg6][arg4 + 1][arg3] = 50;
                } else if (arg2 == 3) {
                    this.field1591[arg6][arg4][arg3] = 50;
                }
            }
            if (var15.field1127 && arg1 != null) {
                arg1.method355(arg0, arg4, arg3, arg2, var15.field1164, 2);
            }
        } else if (arg0 == 2) {
            int var22 = arg2 + 1 & 0x3;
            class54 var23;
            class54 var24;
            if (var15.field1134 == -1 && var15.field1155 == null) {
                var23 = var15.method344(2, arg2 + 4, var10, var11, var12, var13, -1);
                var24 = var15.method344(2, var22, var10, var11, var12, var13, -1);
            } else {
                var23 = new class24(var15.field1134, true, arg7, 2, var11, var13, (byte) -120, var12, var10, arg2 + 4);
                var24 = new class24(var15.field1134, true, arg7, 2, var11, var13, (byte) -120, var12, var10, var22);
            }
            arg8.method300(var16, var17, 900, var24, arg3, arg4, var14, field1586[var22], var23, arg6, field1586[arg2]);
            if (var15.field1165) {
                if (arg2 == 0) {
                    this.field1604[arg6][arg4][arg3] |= 0x249;
                    this.field1604[arg6][arg4][arg3 + 1] |= 0x492;
                } else if (arg2 == 1) {
                    this.field1604[arg6][arg4][arg3 + 1] |= 0x492;
                    this.field1604[arg6][arg4 + 1][arg3] |= 0x249;
                } else if (arg2 == 2) {
                    this.field1604[arg6][arg4 + 1][arg3] |= 0x249;
                    this.field1604[arg6][arg4][arg3] |= 0x492;
                } else if (arg2 == 3) {
                    this.field1604[arg6][arg4][arg3] |= 0x492;
                    this.field1604[arg6][arg4][arg3] |= 0x249;
                }
            }
            if (var15.field1127 && arg1 != null) {
                arg1.method355(arg0, arg4, arg3, arg2, var15.field1164, 2);
            }
            if (var15.field1167 != 16) {
                arg8.method308(var15.field1167, arg4, arg3, true, arg6);
            }
        } else if (arg0 == 3) {
            class54 var25;
            if (var15.field1134 == -1 && var15.field1155 == null) {
                var25 = var15.method344(3, arg2, var10, var11, var12, var13, -1);
            } else {
                var25 = new class24(var15.field1134, true, arg7, 3, var11, var13, (byte) -120, var12, var10, arg2);
            }
            arg8.method300(var16, var17, 900, null, arg3, arg4, var14, 0, var25, arg6, field1588[arg2]);
            if (var15.field1142) {
                if (arg2 == 0) {
                    this.field1591[arg6][arg4][arg3 + 1] = 50;
                } else if (arg2 == 1) {
                    this.field1591[arg6][arg4 + 1][arg3 + 1] = 50;
                } else if (arg2 == 2) {
                    this.field1591[arg6][arg4 + 1][arg3] = 50;
                } else if (arg2 == 3) {
                    this.field1591[arg6][arg4][arg3] = 50;
                }
            }
            if (var15.field1127 && arg1 != null) {
                arg1.method355(arg0, arg4, arg3, arg2, var15.field1164, 2);
            }
        } else if (arg0 == 9) {
            class54 var26;
            if (var15.field1134 == -1 && var15.field1155 == null) {
                var26 = var15.method344(arg0, arg2, var10, var11, var12, var13, -1);
            } else {
                var26 = new class24(var15.field1134, true, arg7, arg0, var11, var13, (byte) -120, var12, var10, arg2);
            }
            arg8.method302(arg4, var14, arg6, var17, var16, arg3, 1, 1, 1, 0, var26);
            if (var15.field1127 && arg1 != null) {
                arg1.method356(var15.field1136, arg2, var15.field1116, 8, arg3, arg4, var15.field1164);
            }
        } else {
            if (var15.field1151) {
                if (arg2 == 1) {
                    int var27 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var10;
                    var10 = var27;
                } else if (arg2 == 2) {
                    int var28 = var13;
                    var13 = var11;
                    var11 = var28;
                    int var29 = var12;
                    var12 = var10;
                    var10 = var29;
                } else if (arg2 == 3) {
                    int var30 = var13;
                    var13 = var10;
                    var10 = var11;
                    var11 = var12;
                    var12 = var30;
                }
            }
            if (arg0 == 4) {
                class54 var31;
                if (var15.field1134 == -1 && var15.field1155 == null) {
                    var31 = var15.method344(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var31 = new class24(var15.field1134, true, arg7, 4, var11, var13, (byte) -120, var12, var10, 0);
                }
                arg8.method301(0, field1586[arg2], true, arg6, var14, var17, arg4, var31, arg3, arg2 * 512, var16, 0);
            } else if (arg0 == 5) {
                int var32 = 16;
                int var33 = arg8.method318(arg6, arg4, arg3);
                if (var33 > 0) {
                    var32 = class33.method350(var33 >> 14 & 0x7FFF).field1167;
                }
                class54 var34;
                if (var15.field1134 == -1 && var15.field1155 == null) {
                    var34 = var15.method344(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var34 = new class24(var15.field1134, true, arg7, 4, var11, var13, (byte) -120, var12, var10, 0);
                }
                arg8.method301(field1587[arg2] * var32, field1586[arg2], true, arg6, var14, var17, arg4, var34, arg3, arg2 * 512, var16, field1606[arg2] * var32);
            } else if (arg0 == 6) {
                class54 var35;
                if (var15.field1134 == -1 && var15.field1155 == null) {
                    var35 = var15.method344(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var35 = new class24(var15.field1134, true, arg7, 4, var11, var13, (byte) -120, var12, var10, 0);
                }
                arg8.method301(0, 256, true, arg6, var14, var17, arg4, var35, arg3, arg2, var16, 0);
            } else if (arg0 == 7) {
                class54 var36;
                if (var15.field1134 == -1 && var15.field1155 == null) {
                    var36 = var15.method344(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var36 = new class24(var15.field1134, true, arg7, 4, var11, var13, (byte) -120, var12, var10, 0);
                }
                arg8.method301(0, 512, true, arg6, var14, var17, arg4, var36, arg3, arg2, var16, 0);
            } else if (arg0 == 8) {
                class54 var37;
                if (var15.field1134 == -1 && var15.field1155 == null) {
                    var37 = var15.method344(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var37 = new class24(var15.field1134, true, arg7, 4, var11, var13, (byte) -120, var12, var10, 0);
                }
                arg8.method301(0, 768, true, arg6, var14, var17, arg4, var37, arg3, arg2, var16, 0);
            }
        }
    }

    @OriginalMember(owner = "YCYSFKFW", name = "a", descriptor = "(IILZOMNSJJM;IIIII)V")
    private final void method499(int arg0, int arg1, class69 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != -31570) {
            return;
        }
        if (arg1 < 0 || arg1 >= 104 || arg0 < 0 || arg0 >= 104) {
            while (true) {
                int var11 = arg2.method547();
                if (var11 == 0) {
                    return;
                }
                if (var11 == 1) {
                    arg2.method547();
                    return;
                }
                if (var11 <= 49) {
                    arg2.method547();
                }
            }
        }
        this.field1585[arg3][arg1][arg0] = 0;
        while (true) {
            int var9 = arg2.method547();
            if (var9 == 0) {
                if (arg3 == 0) {
                    this.field1590[0][arg1][arg0] = -method516(arg1 + arg4 + 932731, arg0 + 556238 + arg5) * 8;
                    return;
                } else {
                    this.field1590[arg3][arg1][arg0] = this.field1590[arg3 - 1][arg1][arg0] - 240;
                    return;
                }
            }
            if (var9 == 1) {
                int var10 = arg2.method547();
                if (var10 == 1) {
                    var10 = 0;
                }
                if (arg3 == 0) {
                    this.field1590[0][arg1][arg0] = -var10 * 8;
                    return;
                }
                this.field1590[arg3][arg1][arg0] = this.field1590[arg3 - 1][arg1][arg0] - var10 * 8;
                return;
            }
            if (var9 <= 49) {
                this.field1581[arg3][arg1][arg0] = arg2.method548();
                this.field1584[arg3][arg1][arg0] = (byte) ((var9 - 2) / 4);
                this.field1592[arg3][arg1][arg0] = (byte) (var9 + arg7 - 2 & 0x3);
            } else if (var9 <= 81) {
                this.field1585[arg3][arg1][arg0] = (byte) (var9 - 49);
            } else {
                this.field1589[arg3][arg1][arg0] = (byte) (var9 - 81);
            }
        }
    }

    @OriginalMember(owner = "YCYSFKFW", name = "a", descriptor = "(IZI)Z")
    public static final boolean method500(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            field1598 = !field1598;
        }
        class33 var3 = class33.method350(arg2);
        if (arg0 == 11) {
            arg0 = 10;
        }
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        return var3.method349(arg0, (byte) 7);
    }

    @OriginalMember(owner = "YCYSFKFW", name = "a", descriptor = "(II)I")
    private final int method501(int arg0, int arg1) {
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

    @OriginalMember(owner = "YCYSFKFW", name = "b", descriptor = "(II)I")
    private static final int method502(int arg0, int arg1) {
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

    @OriginalMember(owner = "YCYSFKFW", name = "a", descriptor = "(IIII)I")
    private static final int method503(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class8.field624[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @OriginalMember(owner = "YCYSFKFW", name = "a", descriptor = "(ILNCUAQOFM;[[[IIIZIILNXLHMSCV;II)V")
    public static final void method504(int arg0, class32 arg1, int[][][] arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, class35 arg8, int arg9, int arg10) {
        int var11 = arg2[arg4][arg9][arg10];
        int var12 = arg2[arg4][arg9 + 1][arg10];
        int var13 = arg2[arg4][arg9 + 1][arg10 + 1];
        int var14 = arg2[arg4][arg9][arg10 + 1];
        if (!arg5) {
            field1583 = -469;
        }
        int var15 = var11 + var12 + var13 + var14 >> 2;
        class33 var16 = class33.method350(arg6);
        int var17 = (arg6 << 14) + (arg10 << 7) + arg9 + 1073741824;
        if (!var16.field1148) {
            var17 += Integer.MIN_VALUE;
        }
        byte var18 = (byte) ((arg0 << 6) + arg3);
        if (arg3 == 22) {
            class54 var19;
            if (var16.field1134 == -1 && var16.field1155 == null) {
                var19 = var16.method344(22, arg0, var11, var12, var13, var14, -1);
            } else {
                var19 = new class24(var16.field1134, true, arg6, 22, var12, var14, (byte) -120, var13, var11, arg0);
            }
            arg1.method298(var17, 636, arg9, arg10, var15, arg7, var19, var18);
            if (var16.field1127 && var16.field1148) {
                arg8.method357(arg9, -19527, arg10);
            }
        } else if (arg3 == 10 || arg3 == 11) {
            class54 var39;
            if (var16.field1134 == -1 && var16.field1155 == null) {
                var39 = var16.method344(10, arg0, var11, var12, var13, var14, -1);
            } else {
                var39 = new class24(var16.field1134, true, arg6, 10, var12, var14, (byte) -120, var13, var11, arg0);
            }
            if (var39 != null) {
                int var40 = 0;
                if (arg3 == 11) {
                    var40 += 256;
                }
                int var41;
                int var42;
                if (arg0 == 1 || arg0 == 3) {
                    var41 = var16.field1136;
                    var42 = var16.field1116;
                } else {
                    var41 = var16.field1116;
                    var42 = var16.field1136;
                }
                arg1.method302(arg9, var15, arg7, var18, var17, arg10, 1, var42, var41, var40, var39);
            }
            if (var16.field1127) {
                arg8.method356(var16.field1136, arg0, var16.field1116, 8, arg10, arg9, var16.field1164);
            }
        } else if (arg3 >= 12) {
            class54 var20;
            if (var16.field1134 == -1 && var16.field1155 == null) {
                var20 = var16.method344(arg3, arg0, var11, var12, var13, var14, -1);
            } else {
                var20 = new class24(var16.field1134, true, arg6, arg3, var12, var14, (byte) -120, var13, var11, arg0);
            }
            arg1.method302(arg9, var15, arg7, var18, var17, arg10, 1, 1, 1, 0, var20);
            if (var16.field1127) {
                arg8.method356(var16.field1136, arg0, var16.field1116, 8, arg10, arg9, var16.field1164);
            }
        } else if (arg3 == 0) {
            class54 var21;
            if (var16.field1134 == -1 && var16.field1155 == null) {
                var21 = var16.method344(0, arg0, var11, var12, var13, var14, -1);
            } else {
                var21 = new class24(var16.field1134, true, arg6, 0, var12, var14, (byte) -120, var13, var11, arg0);
            }
            arg1.method300(var17, var18, 900, null, arg10, arg9, var15, 0, var21, arg7, field1586[arg0]);
            if (var16.field1127) {
                arg8.method355(arg3, arg9, arg10, arg0, var16.field1164, 2);
            }
        } else if (arg3 == 1) {
            class54 var22;
            if (var16.field1134 == -1 && var16.field1155 == null) {
                var22 = var16.method344(1, arg0, var11, var12, var13, var14, -1);
            } else {
                var22 = new class24(var16.field1134, true, arg6, 1, var12, var14, (byte) -120, var13, var11, arg0);
            }
            arg1.method300(var17, var18, 900, null, arg10, arg9, var15, 0, var22, arg7, field1588[arg0]);
            if (var16.field1127) {
                arg8.method355(arg3, arg9, arg10, arg0, var16.field1164, 2);
            }
        } else if (arg3 == 2) {
            int var23 = arg0 + 1 & 0x3;
            class54 var24;
            class54 var25;
            if (var16.field1134 == -1 && var16.field1155 == null) {
                var24 = var16.method344(2, arg0 + 4, var11, var12, var13, var14, -1);
                var25 = var16.method344(2, var23, var11, var12, var13, var14, -1);
            } else {
                var24 = new class24(var16.field1134, true, arg6, 2, var12, var14, (byte) -120, var13, var11, arg0 + 4);
                var25 = new class24(var16.field1134, true, arg6, 2, var12, var14, (byte) -120, var13, var11, var23);
            }
            arg1.method300(var17, var18, 900, var25, arg10, arg9, var15, field1586[var23], var24, arg7, field1586[arg0]);
            if (var16.field1127) {
                arg8.method355(arg3, arg9, arg10, arg0, var16.field1164, 2);
            }
        } else if (arg3 == 3) {
            class54 var26;
            if (var16.field1134 == -1 && var16.field1155 == null) {
                var26 = var16.method344(3, arg0, var11, var12, var13, var14, -1);
            } else {
                var26 = new class24(var16.field1134, true, arg6, 3, var12, var14, (byte) -120, var13, var11, arg0);
            }
            arg1.method300(var17, var18, 900, null, arg10, arg9, var15, 0, var26, arg7, field1588[arg0]);
            if (var16.field1127) {
                arg8.method355(arg3, arg9, arg10, arg0, var16.field1164, 2);
            }
        } else if (arg3 == 9) {
            class54 var27;
            if (var16.field1134 == -1 && var16.field1155 == null) {
                var27 = var16.method344(arg3, arg0, var11, var12, var13, var14, -1);
            } else {
                var27 = new class24(var16.field1134, true, arg6, arg3, var12, var14, (byte) -120, var13, var11, arg0);
            }
            arg1.method302(arg9, var15, arg7, var18, var17, arg10, 1, 1, 1, 0, var27);
            if (var16.field1127) {
                arg8.method356(var16.field1136, arg0, var16.field1116, 8, arg10, arg9, var16.field1164);
            }
        } else {
            if (var16.field1151) {
                if (arg0 == 1) {
                    int var28 = var14;
                    var14 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var28;
                } else if (arg0 == 2) {
                    int var29 = var14;
                    var14 = var12;
                    var12 = var29;
                    int var30 = var13;
                    var13 = var11;
                    var11 = var30;
                } else if (arg0 == 3) {
                    int var31 = var14;
                    var14 = var11;
                    var11 = var12;
                    var12 = var13;
                    var13 = var31;
                }
            }
            if (arg3 == 4) {
                class54 var32;
                if (var16.field1134 == -1 && var16.field1155 == null) {
                    var32 = var16.method344(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var32 = new class24(var16.field1134, true, arg6, 4, var12, var14, (byte) -120, var13, var11, 0);
                }
                arg1.method301(0, field1586[arg0], true, arg7, var15, var18, arg9, var32, arg10, arg0 * 512, var17, 0);
            } else if (arg3 == 5) {
                int var33 = 16;
                int var34 = arg1.method318(arg7, arg9, arg10);
                if (var34 > 0) {
                    var33 = class33.method350(var34 >> 14 & 0x7FFF).field1167;
                }
                class54 var35;
                if (var16.field1134 == -1 && var16.field1155 == null) {
                    var35 = var16.method344(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var35 = new class24(var16.field1134, true, arg6, 4, var12, var14, (byte) -120, var13, var11, 0);
                }
                arg1.method301(field1587[arg0] * var33, field1586[arg0], true, arg7, var15, var18, arg9, var35, arg10, arg0 * 512, var17, field1606[arg0] * var33);
            } else if (arg3 == 6) {
                class54 var36;
                if (var16.field1134 == -1 && var16.field1155 == null) {
                    var36 = var16.method344(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var36 = new class24(var16.field1134, true, arg6, 4, var12, var14, (byte) -120, var13, var11, 0);
                }
                arg1.method301(0, 256, true, arg7, var15, var18, arg9, var36, arg10, arg0, var17, 0);
            } else if (arg3 == 7) {
                class54 var37;
                if (var16.field1134 == -1 && var16.field1155 == null) {
                    var37 = var16.method344(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var37 = new class24(var16.field1134, true, arg6, 4, var12, var14, (byte) -120, var13, var11, 0);
                }
                arg1.method301(0, 512, true, arg7, var15, var18, arg9, var37, arg10, arg0, var17, 0);
            } else if (arg3 == 8) {
                class54 var38;
                if (var16.field1134 == -1 && var16.field1155 == null) {
                    var38 = var16.method344(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var38 = new class24(var16.field1134, true, arg6, 4, var12, var14, (byte) -120, var13, var11, 0);
                }
                arg1.method301(0, 768, true, arg7, var15, var18, arg9, var38, arg10, arg0, var17, 0);
            }
        }
    }

    @OriginalMember(owner = "YCYSFKFW", name = "a", descriptor = "(III)I")
    private final int method505(int arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "YCYSFKFW", name = "a", descriptor = "(IILNCUAQOFM;I[B[LNXLHMSCV;)V")
    public final void method506(int arg0, int arg1, class32 arg2, int arg3, byte[] arg4, class35[] arg5) {
        class69 var7 = new class69(arg4, field1596);
        int var8 = -1;
        int var9 = 27 / arg3;
        while (true) {
            int var10 = var7.method561();
            if (var10 == 0) {
                return;
            }
            var8 += var10;
            int var11 = 0;
            while (true) {
                int var12 = var7.method561();
                if (var12 == 0) {
                    break;
                }
                var11 += var12 - 1;
                int var13 = var11 & 0x3F;
                int var14 = var11 >> 6 & 0x3F;
                int var15 = var11 >> 12;
                int var16 = var7.method547();
                int var17 = var16 >> 2;
                int var18 = var16 & 0x3;
                int var19 = arg1 + var14;
                int var20 = arg0 + var13;
                if (var19 > 0 && var20 > 0 && var19 < 103 && var20 < 103) {
                    int var21 = var15;
                    if ((this.field1585[1][var19][var20] & 0x2) == 2) {
                        var21 = var15 - 1;
                    }
                    class35 var22 = null;
                    if (var21 >= 0) {
                        var22 = arg5[var21];
                    }
                    this.method498(var17, var22, var18, var20, var19, true, var15, var8, arg2);
                }
            }
        }
    }

    @OriginalMember(owner = "YCYSFKFW", name = "a", descriptor = "(IIIIZ)V")
    public final void method507(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var6 = arg0; var6 <= arg0 + arg2; var6++) {
            for (int var7 = arg1; var7 <= arg1 + arg3; var7++) {
                if (var7 >= 0 && var7 < this.field1601 && var6 >= 0 && var6 < this.field1602) {
                    this.field1591[0][var7][var6] = 127;
                    if (arg1 == var7 && var7 > 0) {
                        this.field1590[0][var7][var6] = this.field1590[0][var7 - 1][var6];
                    }
                    if (arg1 + arg3 == var7 && var7 < this.field1601 - 1) {
                        this.field1590[0][var7][var6] = this.field1590[0][var7 + 1][var6];
                    }
                    if (arg0 == var6 && var6 > 0) {
                        this.field1590[0][var7][var6] = this.field1590[0][var7][var6 - 1];
                    }
                    if (arg0 + arg2 == var6 && var6 < this.field1602 - 1) {
                        this.field1590[0][var7][var6] = this.field1590[0][var7][var6 + 1];
                    }
                }
            }
        }
        if (arg4) {
            ;
        }
    }

    @OriginalMember(owner = "YCYSFKFW", name = "a", descriptor = "(I[BII)Z")
    public static final boolean method508(int arg0, byte[] arg1, int arg2, int arg3) {
        boolean var4 = true;
        class69 var5 = new class69(arg1, field1596);
        if (arg3 != 6) {
            field1599 = !field1599;
        }
        int var6 = -1;
        label59: while (true) {
            int var7 = var5.method561();
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method561();
                    if (var11 == 0) {
                        continue label59;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = var5.method547() >> 2;
                    int var15 = arg2 + var13;
                    int var16 = arg0 + var12;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        class33 var17 = class33.method350(var6);
                        if (var14 != 22 || !field1595 || var17.field1148 || var17.field1133) {
                            var4 &= var17.method343(31222);
                            var9 = true;
                        }
                    }
                }
                int var10 = var5.method561();
                if (var10 == 0) {
                    break;
                }
                var5.method547();
            }
        }
    }

    @OriginalMember(owner = "YCYSFKFW", name = "c", descriptor = "(II)I")
    private static final int method509(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "YCYSFKFW", name = "a", descriptor = "(I[LNXLHMSCV;IIII[B)V")
    public final void method510(int arg0, class35[] arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6) {
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg0 + var13 > 0 && arg0 + var13 < 103 && arg5 + var14 > 0 && arg5 + var14 < 103) {
                        arg1[var8].field1182[arg0 + var13][arg5 + var14] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        if (this.field1593 != arg4) {
            return;
        }
        class69 var9 = new class69(arg6, field1596);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    this.method499(arg5 + var12, arg0 + var11, var9, var10, arg3, arg2, -31570, 0);
                }
            }
        }
    }

    @OriginalMember(owner = "YCYSFKFW", name = "b", descriptor = "(III)I")
    private static final int method511(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method517(var3, var5);
        int var8 = method517(var3 + 1, var5);
        int var9 = method517(var3, var5 + 1);
        int var10 = method517(var3 + 1, var5 + 1);
        int var11 = method503(var7, var8, var4, arg2);
        int var12 = method503(var9, var10, var4, arg2);
        return method503(var11, var12, var6, arg2);
    }

    @OriginalMember(owner = "YCYSFKFW", name = "a", descriptor = "([LNXLHMSCV;IILNCUAQOFM;IIZIII[B)V")
    public final void method512(class35[] arg0, int arg1, int arg2, class32 arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, byte[] arg10) {
        class69 var12 = new class69(arg10, field1596);
        int var13 = -1;
        if (!arg6) {
            return;
        }
        while (true) {
            int var14 = var12.method561();
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method561();
                if (var16 == 0) {
                    break;
                }
                var15 += var16 - 1;
                int var17 = var15 & 0x3F;
                int var18 = var15 >> 6 & 0x3F;
                int var19 = var15 >> 12;
                int var20 = var12.method547();
                int var21 = var20 >> 2;
                int var22 = var20 & 0x3;
                if (arg9 == var19 && var18 >= arg1 && var18 < arg1 + 8 && var17 >= arg7 && var17 < arg7 + 8) {
                    class33 var23 = class33.method350(var13);
                    int var24 = arg8 + class42.method386(false, var23.field1136, var18 & 0x7, var17 & 0x7, arg5, var23.field1116);
                    int var25 = arg2 + class42.method387(var23.field1116, var17 & 0x7, var23.field1136, var18 & 0x7, arg5, 0);
                    if (var24 > 0 && var25 > 0 && var24 < 103 && var25 < 103) {
                        int var26 = arg4;
                        if ((this.field1585[1][var24][var25] & 0x2) == 2) {
                            var26 = arg4 - 1;
                        }
                        class35 var27 = null;
                        if (var26 >= 0) {
                            var27 = arg0[var26];
                        }
                        this.method498(var21, var27, arg5 + var22 & 0x3, var25, var24, true, arg4, var13, arg3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "YCYSFKFW", name = "a", descriptor = "(ILSMQPXRFY;LZOMNSJJM;)V")
    public static final void method513(int arg0, class44 arg1, class69 arg2) {
        if (arg0 != 1) {
            return;
        }
        int var3 = -1;
        while (true) {
            int var4 = arg2.method561();
            if (var4 == 0) {
                return;
            }
            var3 += var4;
            class33 var5 = class33.method350(var3);
            var5.method352(arg1, (byte) 118);
            while (true) {
                int var6 = arg2.method561();
                if (var6 == 0) {
                    break;
                }
                arg2.method547();
            }
        }
    }

    @OriginalMember(owner = "YCYSFKFW", name = "b", descriptor = "(IIII)I")
    public int method514(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 < 0 || arg2 > 0) {
            this.field1597 = !this.field1597;
        }
        if ((this.field1585[arg1][arg0][arg3] & 0x8) == 0) {
            return arg1 <= 0 || (this.field1585[1][arg0][arg3] & 0x2) == 0 ? arg1 : arg1 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "YCYSFKFW", name = "a", descriptor = "(IIIIIII[B[LNXLHMSCV;I)V")
    public final void method515(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, class35[] arg8, int arg9) {
        if (arg9 != -46155) {
            field1598 = !field1598;
        }
        for (int var11 = 0; var11 < 8; var11++) {
            for (int var16 = 0; var16 < 8; var16++) {
                if (arg2 + var11 > 0 && arg2 + var11 < 103 && arg1 + var16 > 0 && arg1 + var16 < 103) {
                    arg8[arg5].field1182[arg2 + var11][arg1 + var16] &= 0xFEFFFFFF;
                }
            }
        }
        class69 var12 = new class69(arg7, field1596);
        for (int var13 = 0; var13 < 4; var13++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    if (arg6 == var13 && var14 >= arg3 && var14 < arg3 + 8 && var15 >= arg0 && var15 < arg0 + 8) {
                        this.method499(arg1 + class42.method385(arg4, var15 & 0x7, var14 & 0x7, true), arg2 + class42.method384(arg4, var14 & 0x7, -827, var15 & 0x7), var12, arg5, 0, 0, -31570, arg4);
                    } else {
                        this.method499(-1, -1, var12, 0, 0, 0, -31570, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "YCYSFKFW", name = "<init>", descriptor = "(I[[[I[[[BIB)V")
    public class63(int arg0, int[][][] arg1, byte[][][] arg2, int arg3, byte arg4) {
        if (arg4 != 4) {
            throw new NullPointerException();
        }
        boolean var6 = false;
        field1600 = 99;
        this.field1601 = arg0;
        this.field1602 = arg3;
        this.field1590 = arg1;
        this.field1585 = arg2;
        this.field1589 = new byte[4][this.field1601][this.field1602];
        this.field1581 = new byte[4][this.field1601][this.field1602];
        this.field1584 = new byte[4][this.field1601][this.field1602];
        this.field1592 = new byte[4][this.field1601][this.field1602];
        this.field1604 = new int[4][this.field1601 + 1][this.field1602 + 1];
        this.field1591 = new byte[4][this.field1601 + 1][this.field1602 + 1];
        this.field1603 = new int[this.field1601 + 1][this.field1602 + 1];
        this.field1576 = new int[this.field1602];
        this.field1577 = new int[this.field1602];
        this.field1578 = new int[this.field1602];
        this.field1579 = new int[this.field1602];
        this.field1580 = new int[this.field1602];
    }

    @OriginalMember(owner = "YCYSFKFW", name = "d", descriptor = "(II)I")
    private static final int method516(int arg0, int arg1) {
        int var2 = method511(arg0 + 45365, arg1 + 91923, 4) + (method511(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method511(arg0, arg1, 1) - 128 >> 2) - 128;
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @OriginalMember(owner = "YCYSFKFW", name = "e", descriptor = "(II)I")
    private static final int method517(int arg0, int arg1) {
        int var2 = method509(arg0 - 1, arg1 - 1) + method509(arg0 + 1, arg1 - 1) + method509(arg0 - 1, arg1 + 1) + method509(arg0 + 1, arg1 + 1);
        int var3 = method509(arg0 - 1, arg1) + method509(arg0 + 1, arg1) + method509(arg0, arg1 - 1) + method509(arg0, arg1 + 1);
        int var4 = method509(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }
}
