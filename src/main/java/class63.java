import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("WYBZGYVK")
public class class63 {

    @OriginalMember(owner = "WYBZGYVK", name = "b", descriptor = "B")
    private byte field1592 = 57;

    @OriginalMember(owner = "WYBZGYVK", name = "q", descriptor = "Z")
    private boolean field1607 = false;

    @OriginalMember(owner = "WYBZGYVK", name = "x", descriptor = "I")
    private int field1614;

    @OriginalMember(owner = "WYBZGYVK", name = "y", descriptor = "I")
    private int field1615;

    @OriginalMember(owner = "WYBZGYVK", name = "p", descriptor = "[[[I")
    private int[][][] field1606;

    @OriginalMember(owner = "WYBZGYVK", name = "u", descriptor = "[[[B")
    private byte[][][] field1611;

    @OriginalMember(owner = "WYBZGYVK", name = "z", descriptor = "[[[B")
    private byte[][][] field1616;

    @OriginalMember(owner = "WYBZGYVK", name = "A", descriptor = "[[[B")
    private byte[][][] field1617;

    @OriginalMember(owner = "WYBZGYVK", name = "c", descriptor = "[[[B")
    private byte[][][] field1593;

    @OriginalMember(owner = "WYBZGYVK", name = "v", descriptor = "[[[B")
    private byte[][][] field1612;

    @OriginalMember(owner = "WYBZGYVK", name = "t", descriptor = "[[[I")
    private int[][][] field1610;

    @OriginalMember(owner = "WYBZGYVK", name = "s", descriptor = "[[[B")
    private byte[][][] field1609;

    @OriginalMember(owner = "WYBZGYVK", name = "o", descriptor = "[[I")
    private int[][] field1605;

    @OriginalMember(owner = "WYBZGYVK", name = "d", descriptor = "[I")
    private int[] field1594;

    @OriginalMember(owner = "WYBZGYVK", name = "e", descriptor = "[I")
    private int[] field1595;

    @OriginalMember(owner = "WYBZGYVK", name = "f", descriptor = "[I")
    private int[] field1596;

    @OriginalMember(owner = "WYBZGYVK", name = "g", descriptor = "[I")
    private int[] field1597;

    @OriginalMember(owner = "WYBZGYVK", name = "h", descriptor = "[I")
    private int[] field1598;

    @OriginalMember(owner = "WYBZGYVK", name = "a", descriptor = "[I")
    private static final int[] field1591 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "WYBZGYVK", name = "j", descriptor = "I")
    private static int field1600 = 504;

    @OriginalMember(owner = "WYBZGYVK", name = "k", descriptor = "Z")
    public static boolean field1601 = true;

    @OriginalMember(owner = "WYBZGYVK", name = "l", descriptor = "[I")
    private static final int[] field1602 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "WYBZGYVK", name = "m", descriptor = "I")
    private static int field1603 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "WYBZGYVK", name = "n", descriptor = "[I")
    private static final int[] field1604 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "WYBZGYVK", name = "r", descriptor = "I")
    private static int field1608 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "WYBZGYVK", name = "w", descriptor = "[I")
    private static final int[] field1613 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "WYBZGYVK", name = "B", descriptor = "B")
    private static byte field1618 = 7;

    @OriginalMember(owner = "WYBZGYVK", name = "i", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "WYBZGYVK", name = "a", descriptor = "(III)I")
    private final int method556(int arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "WYBZGYVK", name = "a", descriptor = "(II)I")
    private static final int method557(int arg0, int arg1) {
        int var2 = method566(arg0 + 45365, arg1 + 91923, 4) + (method566(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method566(arg0, arg1, 1) - 128 >> 2) - 128;
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @OriginalMember(owner = "WYBZGYVK", name = "a", descriptor = "([LEMCOJCFH;LQLFNWQSF;I)V")
    public final void method558(class14[] arg0, class47 arg1, int arg2) {
        if (arg2 != 0) {
            field1600 = 48;
        }
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((this.field1611[var4][var110][var111] & 0x1) == 1) {
                        int var112 = var4;
                        if ((this.field1611[1][var110][var111] & 0x2) == 2) {
                            var112 = var4 - 1;
                        }
                        if (var112 >= 0) {
                            arg0[var112].method208((byte) -105, var111, var110);
                        }
                    }
                }
            }
        }
        field1603 += (int) (Math.random() * 5.0D) - 2;
        if (field1603 < -8) {
            field1603 = -8;
        }
        if (field1603 > 8) {
            field1603 = 8;
        }
        field1608 += (int) (Math.random() * 5.0D) - 2;
        if (field1608 < -16) {
            field1608 = -16;
        }
        if (field1608 > 16) {
            field1608 = 16;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            byte[][] var48 = this.field1609[var5];
            byte var49 = 96;
            short var50 = 768;
            byte var51 = -50;
            byte var52 = -10;
            byte var53 = -50;
            int var54 = (int) Math.sqrt((double) (var53 * var53 + var51 * var51 + var52 * var52));
            int var55 = var50 * var54 >> 8;
            for (int var56 = 1; var56 < this.field1615 - 1; var56++) {
                for (int var101 = 1; var101 < this.field1614 - 1; var101++) {
                    int var102 = this.field1606[var5][var101 + 1][var56] - this.field1606[var5][var101 - 1][var56];
                    int var103 = this.field1606[var5][var101][var56 + 1] - this.field1606[var5][var101][var56 - 1];
                    int var104 = (int) Math.sqrt((double) (var103 * var103 + var102 * var102 + 65536));
                    int var105 = (var102 << 8) / var104;
                    int var106 = 65536 / var104;
                    int var107 = (var103 << 8) / var104;
                    int var108 = (var53 * var107 + var51 * var105 + var52 * var106) / var55 + var49;
                    int var109 = (var48[var101][var56] >> 1) + (var48[var101][var56 + 1] >> 3) + (var48[var101][var56 - 1] >> 2) + (var48[var101 - 1][var56] >> 2) + (var48[var101 + 1][var56] >> 3);
                    this.field1605[var101][var56] = var108 - var109;
                }
            }
            for (int var57 = 0; var57 < this.field1615; var57++) {
                this.field1594[var57] = 0;
                this.field1595[var57] = 0;
                this.field1596[var57] = 0;
                this.field1597[var57] = 0;
                this.field1598[var57] = 0;
            }
            for (int var58 = -5; var58 < this.field1614 + 5; var58++) {
                for (int var61 = 0; var61 < this.field1615; var61++) {
                    int var95 = var58 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < this.field1614) {
                        int var96 = this.field1616[var5][var95][var61] & 0xFF;
                        if (var96 > 0) {
                            class40 var97 = class40.field1074[var96 - 1];
                            this.field1594[var61] += var97.field1083;
                            this.field1595[var61] += var97.field1081;
                            this.field1596[var61] += var97.field1082;
                            this.field1597[var61] += var97.field1084;
                            var10002 = this.field1598[var61]++;
                        }
                    }
                    int var98 = var58 - 5;
                    if (var98 >= 0 && var98 < this.field1614) {
                        int var99 = this.field1616[var5][var98][var61] & 0xFF;
                        if (var99 > 0) {
                            class40 var100 = class40.field1074[var99 - 1];
                            this.field1594[var61] -= var100.field1083;
                            this.field1595[var61] -= var100.field1081;
                            this.field1596[var61] -= var100.field1082;
                            this.field1597[var61] -= var100.field1084;
                            var10002 = this.field1598[var61]--;
                        }
                    }
                }
                if (var58 >= 1 && var58 < this.field1614 - 1) {
                    int var62 = 0;
                    int var63 = 0;
                    int var64 = 0;
                    int var65 = 0;
                    int var66 = 0;
                    for (int var67 = -5; var67 < this.field1615 + 5; var67++) {
                        int var68 = var67 + 5;
                        if (var68 >= 0 && var68 < this.field1615) {
                            var62 += this.field1594[var68];
                            var63 += this.field1595[var68];
                            var64 += this.field1596[var68];
                            var65 += this.field1597[var68];
                            var66 += this.field1598[var68];
                        }
                        int var69 = var67 - 5;
                        if (var69 >= 0 && var69 < this.field1615) {
                            var62 -= this.field1594[var69];
                            var63 -= this.field1595[var69];
                            var64 -= this.field1596[var69];
                            var65 -= this.field1597[var69];
                            var66 -= this.field1598[var69];
                        }
                        if (var67 >= 1 && var67 < this.field1615 - 1 && (!field1601 || (this.field1611[var5][var58][var67] & 0x10) == 0 && this.method569(var5, var58, 0, var67) == field1599)) {
                            int var70 = this.field1616[var5][var58][var67] & 0xFF;
                            int var71 = this.field1617[var5][var58][var67] & 0xFF;
                            if (var70 > 0 || var71 > 0) {
                                int var72 = this.field1606[var5][var58][var67];
                                int var73 = this.field1606[var5][var58 + 1][var67];
                                int var74 = this.field1606[var5][var58 + 1][var67 + 1];
                                int var75 = this.field1606[var5][var58][var67 + 1];
                                int var76 = this.field1605[var58][var67];
                                int var77 = this.field1605[var58 + 1][var67];
                                int var78 = this.field1605[var58 + 1][var67 + 1];
                                int var79 = this.field1605[var58][var67 + 1];
                                int var80 = -1;
                                int var81 = -1;
                                if (var70 > 0) {
                                    int var82 = var62 * 256 / var65;
                                    int var83 = var63 / var66;
                                    int var84 = var64 / var66;
                                    var80 = this.method556(var82, var83, var84);
                                    int var85 = field1603 + var82 & 0xFF;
                                    int var86 = field1608 + var84;
                                    if (var86 < 0) {
                                        var86 = 0;
                                    } else if (var86 > 255) {
                                        var86 = 255;
                                    }
                                    var81 = this.method556(var85, var83, var86);
                                }
                                if (var5 > 0) {
                                    boolean var87 = true;
                                    if (var70 == 0 && this.field1593[var5][var58][var67] != 0) {
                                        var87 = false;
                                    }
                                    if (var71 > 0 && !class40.field1074[var71 - 1].field1079) {
                                        var87 = false;
                                    }
                                    if (var87 && var72 == var73 && var72 == var74 && var72 == var75) {
                                        this.field1610[var5][var58][var67] |= 0x924;
                                    }
                                }
                                int var88 = 0;
                                if (var80 != -1) {
                                    var88 = class9.field687[method570(var81, 96)];
                                }
                                if (var71 == 0) {
                                    arg1.method416(var5, var58, var67, 0, 0, -1, var72, var73, var74, var75, method570(var80, var76), method570(var80, var77), method570(var80, var78), method570(var80, var79), 0, 0, 0, 0, var88, 0);
                                } else {
                                    int var89 = this.field1593[var5][var58][var67] + 1;
                                    byte var90 = this.field1612[var5][var58][var67];
                                    class40 var91 = class40.field1074[var71 - 1];
                                    int var92 = var91.field1077;
                                    int var93;
                                    int var94;
                                    if (var92 >= 0) {
                                        var93 = class9.method178(var92, 8);
                                        var94 = -1;
                                    } else if (var91.field1076 == 16711935) {
                                        var93 = 0;
                                        var94 = -2;
                                        var92 = -1;
                                    } else {
                                        var94 = this.method556(var91.field1080, var91.field1081, var91.field1082);
                                        var93 = class9.field687[this.method563(var91.field1085, 96)];
                                    }
                                    arg1.method416(var5, var58, var67, var89, var90, var92, var72, var73, var74, var75, method570(var80, var76), method570(var80, var77), method570(var80, var78), method570(var80, var79), this.method563(var94, var76), this.method563(var94, var77), this.method563(var94, var78), this.method563(var94, var79), var88, var93);
                                }
                            }
                        }
                    }
                }
            }
            for (int var59 = 1; var59 < this.field1615 - 1; var59++) {
                for (int var60 = 1; var60 < this.field1614 - 1; var60++) {
                    arg1.method415(var5, var60, var59, this.method569(var5, var60, 0, var59));
                }
            }
        }
        arg1.method442(-50, -10, -50, false, 64, 768);
        for (int var6 = 0; var6 < this.field1614; var6++) {
            for (int var47 = 0; var47 < this.field1615; var47++) {
                if ((this.field1611[1][var6][var47] & 0x2) == 2) {
                    arg1.method413(false, var47, var6);
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
                for (int var12 = 0; var12 <= this.field1615; var12++) {
                    for (int var13 = 0; var13 <= this.field1614; var13++) {
                        if ((this.field1610[var11][var13][var12] & var7) != 0) {
                            int var14 = var12;
                            int var15 = var12;
                            int var16 = var11;
                            int var17 = var11;
                            while (var14 > 0 && (this.field1610[var11][var13][var14 - 1] & var7) != 0) {
                                var14--;
                            }
                            while (var15 < this.field1615 && (this.field1610[var11][var13][var15 + 1] & var7) != 0) {
                                var15++;
                            }
                            label326: while (var16 > 0) {
                                for (int var18 = var14; var18 <= var15; var18++) {
                                    if ((this.field1610[var16 - 1][var13][var18] & var7) == 0) {
                                        break label326;
                                    }
                                }
                                var16--;
                            }
                            label315: while (var17 < var10) {
                                for (int var19 = var14; var19 <= var15; var19++) {
                                    if ((this.field1610[var17 + 1][var13][var19] & var7) == 0) {
                                        break label315;
                                    }
                                }
                                var17++;
                            }
                            int var20 = (var17 + 1 - var16) * (var15 + 1 - var14);
                            if (var20 >= 8) {
                                short var21 = 240;
                                int var22 = this.field1606[var17][var13][var14] - var21;
                                int var23 = this.field1606[var16][var13][var14];
                                class47.method414(var13 * 128, var13 * 128, var10, var15 * 128 + 128, var14 * 128, var22, this.field1592, var23, 1);
                                for (int var24 = var16; var24 <= var17; var24++) {
                                    for (int var25 = var14; var25 <= var15; var25++) {
                                        this.field1610[var24][var13][var25] &= ~var7;
                                    }
                                }
                            }
                        }
                        if ((this.field1610[var11][var13][var12] & var8) != 0) {
                            int var26 = var13;
                            int var27 = var13;
                            int var28 = var11;
                            int var29 = var11;
                            while (var26 > 0 && (this.field1610[var11][var26 - 1][var12] & var8) != 0) {
                                var26--;
                            }
                            while (var27 < this.field1614 && (this.field1610[var11][var27 + 1][var12] & var8) != 0) {
                                var27++;
                            }
                            label379: while (var28 > 0) {
                                for (int var30 = var26; var30 <= var27; var30++) {
                                    if ((this.field1610[var28 - 1][var30][var12] & var8) == 0) {
                                        break label379;
                                    }
                                }
                                var28--;
                            }
                            label368: while (var29 < var10) {
                                for (int var31 = var26; var31 <= var27; var31++) {
                                    if ((this.field1610[var29 + 1][var31][var12] & var8) == 0) {
                                        break label368;
                                    }
                                }
                                var29++;
                            }
                            int var32 = (var29 + 1 - var28) * (var27 + 1 - var26);
                            if (var32 >= 8) {
                                short var33 = 240;
                                int var34 = this.field1606[var29][var26][var12] - var33;
                                int var35 = this.field1606[var28][var26][var12];
                                class47.method414(var27 * 128 + 128, var26 * 128, var10, var12 * 128, var12 * 128, var34, this.field1592, var35, 2);
                                for (int var36 = var28; var36 <= var29; var36++) {
                                    for (int var37 = var26; var37 <= var27; var37++) {
                                        this.field1610[var36][var37][var12] &= ~var8;
                                    }
                                }
                            }
                        }
                        if ((this.field1610[var11][var13][var12] & var9) != 0) {
                            int var38 = var13;
                            int var39 = var13;
                            int var40 = var12;
                            int var41 = var12;
                            while (var40 > 0 && (this.field1610[var11][var13][var40 - 1] & var9) != 0) {
                                var40--;
                            }
                            while (var41 < this.field1615 && (this.field1610[var11][var13][var41 + 1] & var9) != 0) {
                                var41++;
                            }
                            label432: while (var38 > 0) {
                                for (int var42 = var40; var42 <= var41; var42++) {
                                    if ((this.field1610[var11][var38 - 1][var42] & var9) == 0) {
                                        break label432;
                                    }
                                }
                                var38--;
                            }
                            label421: while (var39 < this.field1614) {
                                for (int var43 = var40; var43 <= var41; var43++) {
                                    if ((this.field1610[var11][var39 + 1][var43] & var9) == 0) {
                                        break label421;
                                    }
                                }
                                var39++;
                            }
                            if ((var39 + 1 - var38) * (var41 + 1 - var40) >= 4) {
                                int var44 = this.field1606[var11][var38][var40];
                                class47.method414(var39 * 128 + 128, var38 * 128, var10, var41 * 128 + 128, var40 * 128, var44, this.field1592, var44, 4);
                                for (int var45 = var38; var45 <= var39; var45++) {
                                    for (int var46 = var40; var46 <= var41; var46++) {
                                        this.field1610[var11][var45][var46] &= ~var9;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "WYBZGYVK", name = "a", descriptor = "(IIII[BIII[LEMCOJCFH;LQLFNWQSF;I)V")
    public final void method559(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, class14[] arg8, class47 arg9, int arg10) {
        label57: while (true) {
            if (arg10 >= 0) {
                int var28 = 1;
                while (true) {
                    if (var28 <= 0) {
                        continue label57;
                    }
                    var28++;
                }
            }
            class21 var12 = new class21(arg4, -49015);
            int var13 = -1;
            while (true) {
                int var14 = var12.method258();
                if (var14 == 0) {
                    return;
                }
                var13 += var14;
                int var15 = 0;
                while (true) {
                    int var16 = var12.method258();
                    if (var16 == 0) {
                        break;
                    }
                    var15 += var16 - 1;
                    int var17 = var15 & 0x3F;
                    int var18 = var15 >> 6 & 0x3F;
                    int var19 = var15 >> 12;
                    int var20 = var12.method244();
                    int var21 = var20 >> 2;
                    int var22 = var20 & 0x3;
                    if (arg6 == var19 && var18 >= arg5 && var18 < arg5 + 8 && var17 >= arg7 && var17 < arg7 + 8) {
                        class48 var23 = class48.method472(var13);
                        int var24 = arg2 + class22.method283(arg1, var23.field1230, true, var17 & 0x7, var23.field1262, var18 & 0x7);
                        int var25 = arg0 + class22.method284(var18 & 0x7, var23.field1230, var23.field1262, var17 & 0x7, arg1, -76);
                        if (var24 > 0 && var25 > 0 && var24 < 103 && var25 < 103) {
                            int var26 = var19;
                            if ((this.field1611[1][var24][var25] & 0x2) == 2) {
                                var26 = var19 - 1;
                            }
                            class14 var27 = null;
                            if (var26 >= 0) {
                                var27 = arg8[var26];
                            }
                            this.method568(var24, var19, var13, var25, 227, var21, var27, arg9, arg1 + var22 & 0x3);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "WYBZGYVK", name = "b", descriptor = "(II)I")
    private static final int method560(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "WYBZGYVK", name = "a", descriptor = "(II[LEMCOJCFH;LQLFNWQSF;[BI)V")
    public final void method561(int arg0, int arg1, class14[] arg2, class47 arg3, byte[] arg4, int arg5) {
        class21 var7 = new class21(arg4, -49015);
        int var8 = -1;
        if (arg0 < 1 || arg0 > 1) {
            return;
        }
        while (true) {
            int var9 = var7.method258();
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method258();
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = var10 & 0x3F;
                int var13 = var10 >> 6 & 0x3F;
                int var14 = var10 >> 12;
                int var15 = var7.method244();
                int var16 = var15 >> 2;
                int var17 = var15 & 0x3;
                int var18 = arg1 + var13;
                int var19 = arg5 + var12;
                if (var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) {
                    int var20 = var14;
                    if ((this.field1611[1][var18][var19] & 0x2) == 2) {
                        var20 = var14 - 1;
                    }
                    class14 var21 = null;
                    if (var20 >= 0) {
                        var21 = arg2[var20];
                    }
                    this.method568(var18, var14, var8, var19, 227, var16, var21, arg3, var17);
                }
            }
        }
    }

    @OriginalMember(owner = "WYBZGYVK", name = "<init>", descriptor = "(I[[[III[[[B)V")
    public class63(int arg0, int[][][] arg1, int arg2, int arg3, byte[][][] arg4) {
        this.field1614 = arg3;
        this.field1615 = arg2;
        this.field1606 = arg1;
        this.field1611 = arg4;
        this.field1616 = new byte[4][this.field1614][this.field1615];
        this.field1617 = new byte[4][this.field1614][this.field1615];
        int var6 = 45 / arg0;
        this.field1593 = new byte[4][this.field1614][this.field1615];
        this.field1612 = new byte[4][this.field1614][this.field1615];
        this.field1610 = new int[4][this.field1614 + 1][this.field1615 + 1];
        this.field1609 = new byte[4][this.field1614 + 1][this.field1615 + 1];
        this.field1605 = new int[this.field1614 + 1][this.field1615 + 1];
        this.field1594 = new int[this.field1615];
        this.field1595 = new int[this.field1615];
        this.field1596 = new int[this.field1615];
        this.field1597 = new int[this.field1615];
        this.field1598 = new int[this.field1615];
    }

    @OriginalMember(owner = "WYBZGYVK", name = "c", descriptor = "(II)I")
    private static final int method562(int arg0, int arg1) {
        int var2 = method560(arg0 - 1, arg1 - 1) + method560(arg0 + 1, arg1 - 1) + method560(arg0 - 1, arg1 + 1) + method560(arg0 + 1, arg1 + 1);
        int var3 = method560(arg0 - 1, arg1) + method560(arg0 + 1, arg1) + method560(arg0, arg1 - 1) + method560(arg0, arg1 + 1);
        int var4 = method560(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @OriginalMember(owner = "WYBZGYVK", name = "d", descriptor = "(II)I")
    private final int method563(int arg0, int arg1) {
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

    @OriginalMember(owner = "WYBZGYVK", name = "a", descriptor = "(LLNOSHUMO;ILGLMIQHJI;)V")
    public static final void method564(class35 arg0, int arg1, class21 arg2) {
        int var3 = 98 / arg1;
        int var4 = -1;
        while (true) {
            int var5 = arg2.method258();
            if (var5 == 0) {
                return;
            }
            var4 += var5;
            class48 var6 = class48.method472(var4);
            var6.method464(arg0, field1618);
            while (true) {
                int var7 = arg2.method258();
                if (var7 == 0) {
                    break;
                }
                arg2.method244();
            }
        }
    }

    @OriginalMember(owner = "WYBZGYVK", name = "a", descriptor = "(IIZII)V")
    public final void method565(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (arg2) {
            this.field1607 = !this.field1607;
        }
        for (int var6 = arg1; var6 <= arg1 + arg3; var6++) {
            for (int var7 = arg4; var7 <= arg0 + arg4; var7++) {
                if (var7 >= 0 && var7 < this.field1614 && var6 >= 0 && var6 < this.field1615) {
                    this.field1609[0][var7][var6] = 127;
                    if (arg4 == var7 && var7 > 0) {
                        this.field1606[0][var7][var6] = this.field1606[0][var7 - 1][var6];
                    }
                    if (arg0 + arg4 == var7 && var7 < this.field1614 - 1) {
                        this.field1606[0][var7][var6] = this.field1606[0][var7 + 1][var6];
                    }
                    if (arg1 == var6 && var6 > 0) {
                        this.field1606[0][var7][var6] = this.field1606[0][var7][var6 - 1];
                    }
                    if (arg1 + arg3 == var6 && var6 < this.field1615 - 1) {
                        this.field1606[0][var7][var6] = this.field1606[0][var7][var6 + 1];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "WYBZGYVK", name = "b", descriptor = "(III)I")
    private static final int method566(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method562(var3, var5);
        int var8 = method562(var3 + 1, var5);
        int var9 = method562(var3, var5 + 1);
        int var10 = method562(var3 + 1, var5 + 1);
        int var11 = method572(var7, var8, var4, arg2);
        int var12 = method572(var9, var10, var4, arg2);
        return method572(var11, var12, var6, arg2);
    }

    @OriginalMember(owner = "WYBZGYVK", name = "a", descriptor = "(II[[[IIILQLFNWQSF;IIILEMCOJCFH;I)V")
    public static final void method567(int arg0, int arg1, int[][][] arg2, int arg3, int arg4, class47 arg5, int arg6, int arg7, int arg8, class14 arg9, int arg10) {
        int var11 = arg2[arg6][arg7][arg10];
        int var12 = arg2[arg6][arg7 + 1][arg10];
        int var13 = arg2[arg6][arg7 + 1][arg10 + 1];
        int var14 = arg2[arg6][arg7][arg10 + 1];
        int var15 = var11 + var12 + var13 + var14 >> 2;
        if (arg3 != 2) {
            return;
        }
        class48 var16 = class48.method472(arg4);
        int var17 = (arg4 << 14) + (arg10 << 7) + arg7 + 1073741824;
        if (!var16.field1212) {
            var17 += Integer.MIN_VALUE;
        }
        byte var18 = (byte) ((arg0 << 6) + arg8);
        if (arg8 == 22) {
            class44 var19;
            if (var16.field1211 == -1 && var16.field1232 == null) {
                var19 = var16.method462(22, arg0, var11, var12, var13, var14, -1);
            } else {
                var19 = new class66(22, var12, var11, var13, 154, true, var16.field1211, arg0, var14, arg4);
            }
            arg5.method417(arg7, var15, var18, var17, 0, arg10, var19, arg1);
            if (var16.field1236 && var16.field1212) {
                arg9.method208((byte) -105, arg10, arg7);
            }
        } else if (arg8 == 10 || arg8 == 11) {
            class44 var39;
            if (var16.field1211 == -1 && var16.field1232 == null) {
                var39 = var16.method462(10, arg0, var11, var12, var13, var14, -1);
            } else {
                var39 = new class66(10, var12, var11, var13, 154, true, var16.field1211, arg0, var14, arg4);
            }
            if (var39 != null) {
                int var40 = 0;
                if (arg8 == 11) {
                    var40 += 256;
                }
                int var41;
                int var42;
                if (arg0 == 1 || arg0 == 3) {
                    var41 = var16.field1230;
                    var42 = var16.field1262;
                } else {
                    var41 = var16.field1262;
                    var42 = var16.field1230;
                }
                arg5.method421(var41, arg1, var40, var15, var18, (byte) -88, var42, var17, arg7, arg10, var39);
            }
            if (var16.field1236) {
                arg9.method207(false, var16.field1230, var16.field1262, arg10, var16.field1243, arg0, arg7);
            }
        } else if (arg8 >= 12) {
            class44 var20;
            if (var16.field1211 == -1 && var16.field1232 == null) {
                var20 = var16.method462(arg8, arg0, var11, var12, var13, var14, -1);
            } else {
                var20 = new class66(arg8, var12, var11, var13, 154, true, var16.field1211, arg0, var14, arg4);
            }
            arg5.method421(1, arg1, 0, var15, var18, (byte) -88, 1, var17, arg7, arg10, var20);
            if (var16.field1236) {
                arg9.method207(false, var16.field1230, var16.field1262, arg10, var16.field1243, arg0, arg7);
            }
        } else if (arg8 == 0) {
            class44 var21;
            if (var16.field1211 == -1 && var16.field1232 == null) {
                var21 = var16.method462(0, arg0, var11, var12, var13, var14, -1);
            } else {
                var21 = new class66(0, var12, var11, var13, 154, true, var16.field1211, arg0, var14, arg4);
            }
            arg5.method419(var18, 0, var17, arg1, null, var21, arg10, arg7, var15, false, field1602[arg0]);
            if (var16.field1236) {
                arg9.method206(arg8, arg10, arg7, var16.field1243, arg0, 545);
            }
        } else if (arg8 == 1) {
            class44 var22;
            if (var16.field1211 == -1 && var16.field1232 == null) {
                var22 = var16.method462(1, arg0, var11, var12, var13, var14, -1);
            } else {
                var22 = new class66(1, var12, var11, var13, 154, true, var16.field1211, arg0, var14, arg4);
            }
            arg5.method419(var18, 0, var17, arg1, null, var22, arg10, arg7, var15, false, field1591[arg0]);
            if (var16.field1236) {
                arg9.method206(arg8, arg10, arg7, var16.field1243, arg0, 545);
            }
        } else if (arg8 == 2) {
            int var23 = arg0 + 1 & 0x3;
            class44 var24;
            class44 var25;
            if (var16.field1211 == -1 && var16.field1232 == null) {
                var24 = var16.method462(2, arg0 + 4, var11, var12, var13, var14, -1);
                var25 = var16.method462(2, var23, var11, var12, var13, var14, -1);
            } else {
                var24 = new class66(2, var12, var11, var13, 154, true, var16.field1211, arg0 + 4, var14, arg4);
                var25 = new class66(2, var12, var11, var13, 154, true, var16.field1211, var23, var14, arg4);
            }
            arg5.method419(var18, field1602[var23], var17, arg1, var25, var24, arg10, arg7, var15, false, field1602[arg0]);
            if (var16.field1236) {
                arg9.method206(arg8, arg10, arg7, var16.field1243, arg0, 545);
            }
        } else if (arg8 == 3) {
            class44 var26;
            if (var16.field1211 == -1 && var16.field1232 == null) {
                var26 = var16.method462(3, arg0, var11, var12, var13, var14, -1);
            } else {
                var26 = new class66(3, var12, var11, var13, 154, true, var16.field1211, arg0, var14, arg4);
            }
            arg5.method419(var18, 0, var17, arg1, null, var26, arg10, arg7, var15, false, field1591[arg0]);
            if (var16.field1236) {
                arg9.method206(arg8, arg10, arg7, var16.field1243, arg0, 545);
            }
        } else if (arg8 == 9) {
            class44 var27;
            if (var16.field1211 == -1 && var16.field1232 == null) {
                var27 = var16.method462(arg8, arg0, var11, var12, var13, var14, -1);
            } else {
                var27 = new class66(arg8, var12, var11, var13, 154, true, var16.field1211, arg0, var14, arg4);
            }
            arg5.method421(1, arg1, 0, var15, var18, (byte) -88, 1, var17, arg7, arg10, var27);
            if (var16.field1236) {
                arg9.method207(false, var16.field1230, var16.field1262, arg10, var16.field1243, arg0, arg7);
            }
        } else {
            if (var16.field1259) {
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
            if (arg8 == 4) {
                class44 var32;
                if (var16.field1211 == -1 && var16.field1232 == null) {
                    var32 = var16.method462(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var32 = new class66(4, var12, var11, var13, 154, true, var16.field1211, 0, var14, arg4);
                }
                arg5.method420(true, var15, arg7, field1602[arg0], var18, var32, var17, arg1, arg0 * 512, arg10, 0, 0);
            } else if (arg8 == 5) {
                int var33 = 16;
                int var34 = arg5.method437(arg1, arg7, arg10);
                if (var34 > 0) {
                    var33 = class48.method472(var34 >> 14 & 0x7FFF).field1231;
                }
                class44 var35;
                if (var16.field1211 == -1 && var16.field1232 == null) {
                    var35 = var16.method462(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var35 = new class66(4, var12, var11, var13, 154, true, var16.field1211, 0, var14, arg4);
                }
                arg5.method420(true, var15, arg7, field1602[arg0], var18, var35, var17, arg1, arg0 * 512, arg10, field1604[arg0] * var33, field1613[arg0] * var33);
            } else if (arg8 == 6) {
                class44 var36;
                if (var16.field1211 == -1 && var16.field1232 == null) {
                    var36 = var16.method462(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var36 = new class66(4, var12, var11, var13, 154, true, var16.field1211, 0, var14, arg4);
                }
                arg5.method420(true, var15, arg7, 256, var18, var36, var17, arg1, arg0, arg10, 0, 0);
            } else if (arg8 == 7) {
                class44 var37;
                if (var16.field1211 == -1 && var16.field1232 == null) {
                    var37 = var16.method462(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var37 = new class66(4, var12, var11, var13, 154, true, var16.field1211, 0, var14, arg4);
                }
                arg5.method420(true, var15, arg7, 512, var18, var37, var17, arg1, arg0, arg10, 0, 0);
            } else if (arg8 == 8) {
                class44 var38;
                if (var16.field1211 == -1 && var16.field1232 == null) {
                    var38 = var16.method462(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var38 = new class66(4, var12, var11, var13, 154, true, var16.field1211, 0, var14, arg4);
                }
                arg5.method420(true, var15, arg7, 768, var18, var38, var17, arg1, arg0, arg10, 0, 0);
            }
        }
    }

    @OriginalMember(owner = "WYBZGYVK", name = "a", descriptor = "(IIIIIILEMCOJCFH;LQLFNWQSF;I)V")
    private final void method568(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class14 arg6, class47 arg7, int arg8) {
        if (field1601) {
            if ((this.field1611[arg1][arg0][arg3] & 0x10) != 0) {
                return;
            }
            if (this.method569(arg1, arg0, 0, arg3) != field1599) {
                return;
            }
        }
        int var10 = this.field1606[arg1][arg0][arg3];
        int var11 = this.field1606[arg1][arg0 + 1][arg3];
        int var12 = this.field1606[arg1][arg0 + 1][arg3 + 1];
        int var13 = this.field1606[arg1][arg0][arg3 + 1];
        int var14 = var10 + var11 + var12 + var13 >> 2;
        class48 var15 = class48.method472(arg2);
        int var16 = (arg2 << 14) + (arg3 << 7) + arg0 + 1073741824;
        int var17 = 77 / arg4;
        if (!var15.field1212) {
            var16 += Integer.MIN_VALUE;
        }
        byte var18 = (byte) ((arg8 << 6) + arg5);
        if (arg5 == 22) {
            if (!field1601 || var15.field1212 || var15.field1256) {
                class44 var19;
                if (var15.field1211 == -1 && var15.field1232 == null) {
                    var19 = var15.method462(22, arg8, var10, var11, var12, var13, -1);
                } else {
                    var19 = new class66(22, var11, var10, var12, 154, true, var15.field1211, arg8, var13, arg2);
                }
                arg7.method417(arg0, var14, var18, var16, 0, arg3, var19, arg1);
                if (var15.field1236 && var15.field1212 && arg6 != null) {
                    arg6.method208((byte) -105, arg3, arg0);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class44 var39;
            if (var15.field1211 == -1 && var15.field1232 == null) {
                var39 = var15.method462(10, arg8, var10, var11, var12, var13, -1);
            } else {
                var39 = new class66(10, var11, var10, var12, 154, true, var15.field1211, arg8, var13, arg2);
            }
            if (var39 != null) {
                int var40 = 0;
                if (arg5 == 11) {
                    var40 += 256;
                }
                int var41;
                int var42;
                if (arg8 == 1 || arg8 == 3) {
                    var41 = var15.field1230;
                    var42 = var15.field1262;
                } else {
                    var41 = var15.field1262;
                    var42 = var15.field1230;
                }
                if (arg7.method421(var41, arg1, var40, var14, var18, (byte) -88, var42, var16, arg0, arg3, var39) && var15.field1254) {
                    class53 var43;
                    if (var39 instanceof class53) {
                        var43 = (class53) var39;
                    } else {
                        var43 = var15.method462(10, arg8, var10, var11, var12, var13, -1);
                    }
                    if (var43 != null) {
                        for (int var44 = 0; var44 <= var41; var44++) {
                            for (int var45 = 0; var45 <= var42; var45++) {
                                int var46 = var43.field1403 / 4;
                                if (var46 > 30) {
                                    var46 = 30;
                                }
                                if (var46 > this.field1609[arg1][arg0 + var44][arg3 + var45]) {
                                    this.field1609[arg1][arg0 + var44][arg3 + var45] = (byte) var46;
                                }
                            }
                        }
                    }
                }
            }
            if (var15.field1236 && arg6 != null) {
                arg6.method207(false, var15.field1230, var15.field1262, arg3, var15.field1243, arg8, arg0);
            }
        } else if (arg5 >= 12) {
            class44 var20;
            if (var15.field1211 == -1 && var15.field1232 == null) {
                var20 = var15.method462(arg5, arg8, var10, var11, var12, var13, -1);
            } else {
                var20 = new class66(arg5, var11, var10, var12, 154, true, var15.field1211, arg8, var13, arg2);
            }
            arg7.method421(1, arg1, 0, var14, var18, (byte) -88, 1, var16, arg0, arg3, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg1 > 0) {
                this.field1610[arg1][arg0][arg3] |= 0x924;
            }
            if (var15.field1236 && arg6 != null) {
                arg6.method207(false, var15.field1230, var15.field1262, arg3, var15.field1243, arg8, arg0);
            }
        } else if (arg5 == 0) {
            class44 var21;
            if (var15.field1211 == -1 && var15.field1232 == null) {
                var21 = var15.method462(0, arg8, var10, var11, var12, var13, -1);
            } else {
                var21 = new class66(0, var11, var10, var12, 154, true, var15.field1211, arg8, var13, arg2);
            }
            arg7.method419(var18, 0, var16, arg1, null, var21, arg3, arg0, var14, false, field1602[arg8]);
            if (arg8 == 0) {
                if (var15.field1254) {
                    this.field1609[arg1][arg0][arg3] = 50;
                    this.field1609[arg1][arg0][arg3 + 1] = 50;
                }
                if (var15.field1253) {
                    this.field1610[arg1][arg0][arg3] |= 0x249;
                }
            } else if (arg8 == 1) {
                if (var15.field1254) {
                    this.field1609[arg1][arg0][arg3 + 1] = 50;
                    this.field1609[arg1][arg0 + 1][arg3 + 1] = 50;
                }
                if (var15.field1253) {
                    this.field1610[arg1][arg0][arg3 + 1] |= 0x492;
                }
            } else if (arg8 == 2) {
                if (var15.field1254) {
                    this.field1609[arg1][arg0 + 1][arg3] = 50;
                    this.field1609[arg1][arg0 + 1][arg3 + 1] = 50;
                }
                if (var15.field1253) {
                    this.field1610[arg1][arg0 + 1][arg3] |= 0x249;
                }
            } else if (arg8 == 3) {
                if (var15.field1254) {
                    this.field1609[arg1][arg0][arg3] = 50;
                    this.field1609[arg1][arg0 + 1][arg3] = 50;
                }
                if (var15.field1253) {
                    this.field1610[arg1][arg0][arg3] |= 0x492;
                }
            }
            if (var15.field1236 && arg6 != null) {
                arg6.method206(arg5, arg3, arg0, var15.field1243, arg8, 545);
            }
            if (var15.field1231 != 16) {
                arg7.method427(arg1, var15.field1231, arg0, arg3, (byte) 6);
            }
        } else if (arg5 == 1) {
            class44 var22;
            if (var15.field1211 == -1 && var15.field1232 == null) {
                var22 = var15.method462(1, arg8, var10, var11, var12, var13, -1);
            } else {
                var22 = new class66(1, var11, var10, var12, 154, true, var15.field1211, arg8, var13, arg2);
            }
            arg7.method419(var18, 0, var16, arg1, null, var22, arg3, arg0, var14, false, field1591[arg8]);
            if (var15.field1254) {
                if (arg8 == 0) {
                    this.field1609[arg1][arg0][arg3 + 1] = 50;
                } else if (arg8 == 1) {
                    this.field1609[arg1][arg0 + 1][arg3 + 1] = 50;
                } else if (arg8 == 2) {
                    this.field1609[arg1][arg0 + 1][arg3] = 50;
                } else if (arg8 == 3) {
                    this.field1609[arg1][arg0][arg3] = 50;
                }
            }
            if (var15.field1236 && arg6 != null) {
                arg6.method206(arg5, arg3, arg0, var15.field1243, arg8, 545);
            }
        } else if (arg5 == 2) {
            int var23 = arg8 + 1 & 0x3;
            class44 var24;
            class44 var25;
            if (var15.field1211 == -1 && var15.field1232 == null) {
                var24 = var15.method462(2, arg8 + 4, var10, var11, var12, var13, -1);
                var25 = var15.method462(2, var23, var10, var11, var12, var13, -1);
            } else {
                var24 = new class66(2, var11, var10, var12, 154, true, var15.field1211, arg8 + 4, var13, arg2);
                var25 = new class66(2, var11, var10, var12, 154, true, var15.field1211, var23, var13, arg2);
            }
            arg7.method419(var18, field1602[var23], var16, arg1, var25, var24, arg3, arg0, var14, false, field1602[arg8]);
            if (var15.field1253) {
                if (arg8 == 0) {
                    this.field1610[arg1][arg0][arg3] |= 0x249;
                    this.field1610[arg1][arg0][arg3 + 1] |= 0x492;
                } else if (arg8 == 1) {
                    this.field1610[arg1][arg0][arg3 + 1] |= 0x492;
                    this.field1610[arg1][arg0 + 1][arg3] |= 0x249;
                } else if (arg8 == 2) {
                    this.field1610[arg1][arg0 + 1][arg3] |= 0x249;
                    this.field1610[arg1][arg0][arg3] |= 0x492;
                } else if (arg8 == 3) {
                    this.field1610[arg1][arg0][arg3] |= 0x492;
                    this.field1610[arg1][arg0][arg3] |= 0x249;
                }
            }
            if (var15.field1236 && arg6 != null) {
                arg6.method206(arg5, arg3, arg0, var15.field1243, arg8, 545);
            }
            if (var15.field1231 != 16) {
                arg7.method427(arg1, var15.field1231, arg0, arg3, (byte) 6);
            }
        } else if (arg5 == 3) {
            class44 var26;
            if (var15.field1211 == -1 && var15.field1232 == null) {
                var26 = var15.method462(3, arg8, var10, var11, var12, var13, -1);
            } else {
                var26 = new class66(3, var11, var10, var12, 154, true, var15.field1211, arg8, var13, arg2);
            }
            arg7.method419(var18, 0, var16, arg1, null, var26, arg3, arg0, var14, false, field1591[arg8]);
            if (var15.field1254) {
                if (arg8 == 0) {
                    this.field1609[arg1][arg0][arg3 + 1] = 50;
                } else if (arg8 == 1) {
                    this.field1609[arg1][arg0 + 1][arg3 + 1] = 50;
                } else if (arg8 == 2) {
                    this.field1609[arg1][arg0 + 1][arg3] = 50;
                } else if (arg8 == 3) {
                    this.field1609[arg1][arg0][arg3] = 50;
                }
            }
            if (var15.field1236 && arg6 != null) {
                arg6.method206(arg5, arg3, arg0, var15.field1243, arg8, 545);
            }
        } else if (arg5 == 9) {
            class44 var27;
            if (var15.field1211 == -1 && var15.field1232 == null) {
                var27 = var15.method462(arg5, arg8, var10, var11, var12, var13, -1);
            } else {
                var27 = new class66(arg5, var11, var10, var12, 154, true, var15.field1211, arg8, var13, arg2);
            }
            arg7.method421(1, arg1, 0, var14, var18, (byte) -88, 1, var16, arg0, arg3, var27);
            if (var15.field1236 && arg6 != null) {
                arg6.method207(false, var15.field1230, var15.field1262, arg3, var15.field1243, arg8, arg0);
            }
        } else {
            if (var15.field1259) {
                if (arg8 == 1) {
                    int var28 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var10;
                    var10 = var28;
                } else if (arg8 == 2) {
                    int var29 = var13;
                    var13 = var11;
                    var11 = var29;
                    int var30 = var12;
                    var12 = var10;
                    var10 = var30;
                } else if (arg8 == 3) {
                    int var31 = var13;
                    var13 = var10;
                    var10 = var11;
                    var11 = var12;
                    var12 = var31;
                }
            }
            if (arg5 == 4) {
                class44 var32;
                if (var15.field1211 == -1 && var15.field1232 == null) {
                    var32 = var15.method462(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var32 = new class66(4, var11, var10, var12, 154, true, var15.field1211, 0, var13, arg2);
                }
                arg7.method420(true, var14, arg0, field1602[arg8], var18, var32, var16, arg1, arg8 * 512, arg3, 0, 0);
            } else if (arg5 == 5) {
                int var33 = 16;
                int var34 = arg7.method437(arg1, arg0, arg3);
                if (var34 > 0) {
                    var33 = class48.method472(var34 >> 14 & 0x7FFF).field1231;
                }
                class44 var35;
                if (var15.field1211 == -1 && var15.field1232 == null) {
                    var35 = var15.method462(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var35 = new class66(4, var11, var10, var12, 154, true, var15.field1211, 0, var13, arg2);
                }
                arg7.method420(true, var14, arg0, field1602[arg8], var18, var35, var16, arg1, arg8 * 512, arg3, field1604[arg8] * var33, field1613[arg8] * var33);
            } else if (arg5 == 6) {
                class44 var36;
                if (var15.field1211 == -1 && var15.field1232 == null) {
                    var36 = var15.method462(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var36 = new class66(4, var11, var10, var12, 154, true, var15.field1211, 0, var13, arg2);
                }
                arg7.method420(true, var14, arg0, 256, var18, var36, var16, arg1, arg8, arg3, 0, 0);
            } else if (arg5 == 7) {
                class44 var37;
                if (var15.field1211 == -1 && var15.field1232 == null) {
                    var37 = var15.method462(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var37 = new class66(4, var11, var10, var12, 154, true, var15.field1211, 0, var13, arg2);
                }
                arg7.method420(true, var14, arg0, 512, var18, var37, var16, arg1, arg8, arg3, 0, 0);
            } else if (arg5 == 8) {
                class44 var38;
                if (var15.field1211 == -1 && var15.field1232 == null) {
                    var38 = var15.method462(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var38 = new class66(4, var11, var10, var12, 154, true, var15.field1211, 0, var13, arg2);
                }
                arg7.method420(true, var14, arg0, 768, var18, var38, var16, arg1, arg8, arg3, 0, 0);
            }
        }
    }

    @OriginalMember(owner = "WYBZGYVK", name = "a", descriptor = "(IIII)I")
    public int method569(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 0) {
            return 2;
        } else if ((this.field1611[arg0][arg1][arg3] & 0x8) == 0) {
            return arg0 <= 0 || (this.field1611[1][arg1][arg3] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "WYBZGYVK", name = "e", descriptor = "(II)I")
    private static final int method570(int arg0, int arg1) {
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

    @OriginalMember(owner = "WYBZGYVK", name = "a", descriptor = "(IIIIIIILGLMIQHJI;)V")
    private final void method571(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class21 arg7) {
        if (arg3 != 0) {
            return;
        }
        if (arg2 < 0 || arg2 >= 104 || arg6 < 0 || arg6 >= 104) {
            while (true) {
                int var11 = arg7.method244();
                if (var11 == 0) {
                    return;
                }
                if (var11 == 1) {
                    arg7.method244();
                    return;
                }
                if (var11 <= 49) {
                    arg7.method244();
                }
            }
        }
        this.field1611[arg5][arg2][arg6] = 0;
        while (true) {
            int var9 = arg7.method244();
            if (var9 == 0) {
                if (arg5 == 0) {
                    this.field1606[0][arg2][arg6] = -method557(arg2 + arg4 + 932731, arg6 + 556238 + arg1) * 8;
                    return;
                } else {
                    this.field1606[arg5][arg2][arg6] = this.field1606[arg5 - 1][arg2][arg6] - 240;
                    return;
                }
            }
            if (var9 == 1) {
                int var10 = arg7.method244();
                if (var10 == 1) {
                    var10 = 0;
                }
                if (arg5 == 0) {
                    this.field1606[0][arg2][arg6] = -var10 * 8;
                    return;
                }
                this.field1606[arg5][arg2][arg6] = this.field1606[arg5 - 1][arg2][arg6] - var10 * 8;
                return;
            }
            if (var9 <= 49) {
                this.field1617[arg5][arg2][arg6] = arg7.method245();
                this.field1593[arg5][arg2][arg6] = (byte) ((var9 - 2) / 4);
                this.field1612[arg5][arg2][arg6] = (byte) (var9 + arg0 - 2 & 0x3);
            } else if (var9 <= 81) {
                this.field1611[arg5][arg2][arg6] = (byte) (var9 - 49);
            } else {
                this.field1616[arg5][arg2][arg6] = (byte) (var9 - 81);
            }
        }
    }

    @OriginalMember(owner = "WYBZGYVK", name = "b", descriptor = "(IIII)I")
    private static final int method572(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class9.field676[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @OriginalMember(owner = "WYBZGYVK", name = "a", descriptor = "([LEMCOJCFH;III[BII)V")
    public final void method573(class14[] arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    if (arg3 + var14 > 0 && arg3 + var14 < 103 && arg2 + var15 > 0 && arg2 + var15 < 103) {
                        arg0[var8].field749[arg3 + var14][arg2 + var15] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class21 var9 = new class21(arg4, -49015);
        if (arg5 >= 0) {
            for (int var10 = 1; var10 > 0; var10++) {
            }
        }
        for (int var11 = 0; var11 < 4; var11++) {
            for (int var12 = 0; var12 < 64; var12++) {
                for (int var13 = 0; var13 < 64; var13++) {
                    this.method571(0, arg1, arg3 + var12, 0, arg6, var11, arg2 + var13, var9);
                }
            }
        }
    }

    @OriginalMember(owner = "WYBZGYVK", name = "a", descriptor = "([BIBI)Z")
    public static final boolean method574(byte[] arg0, int arg1, byte arg2, int arg3) {
        boolean var4 = true;
        if (arg2 != 7) {
            throw new NullPointerException();
        }
        class21 var5 = new class21(arg0, -49015);
        int var6 = -1;
        label54: while (true) {
            int var7 = var5.method258();
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method258();
                    if (var11 == 0) {
                        continue label54;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = var5.method244() >> 2;
                    int var15 = arg1 + var13;
                    int var16 = arg3 + var12;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        class48 var17 = class48.method472(var6);
                        if (var14 != 22 || !field1601 || var17.field1212 || var17.field1256) {
                            var4 &= var17.method465(8);
                            var9 = true;
                        }
                    }
                }
                int var10 = var5.method258();
                if (var10 == 0) {
                    break;
                }
                var5.method244();
            }
        }
    }

    @OriginalMember(owner = "WYBZGYVK", name = "a", descriptor = "(IIIBIII[LEMCOJCFH;I[B)V")
    public final void method575(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, class14[] arg7, int arg8, byte[] arg9) {
        for (int var11 = 0; var11 < 8; var11++) {
            for (int var18 = 0; var18 < 8; var18++) {
                if (arg6 + var11 > 0 && arg6 + var11 < 103 && arg0 + var18 > 0 && arg0 + var18 < 103) {
                    arg7[arg1].field749[arg6 + var11][arg0 + var18] &= 0xFEFFFFFF;
                }
            }
        }
        class21 var12 = new class21(arg9, -49015);
        if (arg3 == 4) {
            boolean var13 = false;
        } else {
            for (int var14 = 1; var14 > 0; var14++) {
            }
        }
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 < 64; var16++) {
                for (int var17 = 0; var17 < 64; var17++) {
                    if (arg2 == var15 && var16 >= arg8 && var16 < arg8 + 8 && var17 >= arg4 && var17 < arg4 + 8) {
                        this.method571(arg5, 0, arg6 + class22.method281(arg5, var17 & 0x7, 38653, var16 & 0x7), 0, 0, arg1, arg0 + class22.method282(arg5, var16 & 0x7, 0, var17 & 0x7), var12);
                    } else {
                        this.method571(0, 0, -1, 0, 0, 0, -1, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "WYBZGYVK", name = "a", descriptor = "(IBI)Z")
    public static final boolean method576(int arg0, byte arg1, int arg2) {
        class48 var3 = class48.method472(arg0);
        if (arg1 != -13) {
            throw new NullPointerException();
        }
        if (arg2 == 11) {
            arg2 = 10;
        }
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        return var3.method470(false, arg2);
    }
}
