import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("VZMNLGCR")
public class class67 {

    @OriginalMember(owner = "VZMNLGCR", name = "q", descriptor = "I")
    private int field1562 = -37804;

    @OriginalMember(owner = "VZMNLGCR", name = "D", descriptor = "Z")
    private boolean field1575 = true;

    @OriginalMember(owner = "VZMNLGCR", name = "u", descriptor = "I")
    private int field1566;

    @OriginalMember(owner = "VZMNLGCR", name = "v", descriptor = "I")
    private int field1567;

    @OriginalMember(owner = "VZMNLGCR", name = "w", descriptor = "[[[I")
    private int[][][] field1568;

    @OriginalMember(owner = "VZMNLGCR", name = "k", descriptor = "[[[B")
    private byte[][][] field1556;

    @OriginalMember(owner = "VZMNLGCR", name = "g", descriptor = "[[[B")
    private byte[][][] field1552;

    @OriginalMember(owner = "VZMNLGCR", name = "l", descriptor = "[[[B")
    private byte[][][] field1557;

    @OriginalMember(owner = "VZMNLGCR", name = "r", descriptor = "[[[B")
    private byte[][][] field1563;

    @OriginalMember(owner = "VZMNLGCR", name = "o", descriptor = "[[[B")
    private byte[][][] field1560;

    @OriginalMember(owner = "VZMNLGCR", name = "e", descriptor = "[[[I")
    private int[][][] field1550;

    @OriginalMember(owner = "VZMNLGCR", name = "b", descriptor = "[[[B")
    private byte[][][] field1547;

    @OriginalMember(owner = "VZMNLGCR", name = "n", descriptor = "[[I")
    private int[][] field1559;

    @OriginalMember(owner = "VZMNLGCR", name = "y", descriptor = "[I")
    private int[] field1570;

    @OriginalMember(owner = "VZMNLGCR", name = "z", descriptor = "[I")
    private int[] field1571;

    @OriginalMember(owner = "VZMNLGCR", name = "A", descriptor = "[I")
    private int[] field1572;

    @OriginalMember(owner = "VZMNLGCR", name = "B", descriptor = "[I")
    private int[] field1573;

    @OriginalMember(owner = "VZMNLGCR", name = "C", descriptor = "[I")
    private int[] field1574;

    @OriginalMember(owner = "VZMNLGCR", name = "a", descriptor = "[I")
    private static final int[] field1546 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "VZMNLGCR", name = "c", descriptor = "I")
    private static int field1548 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "VZMNLGCR", name = "h", descriptor = "[I")
    private static final int[] field1553 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "VZMNLGCR", name = "i", descriptor = "I")
    private static int field1554 = -182;

    @OriginalMember(owner = "VZMNLGCR", name = "m", descriptor = "Z")
    private static boolean field1558 = true;

    @OriginalMember(owner = "VZMNLGCR", name = "s", descriptor = "[I")
    private static final int[] field1564 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "VZMNLGCR", name = "t", descriptor = "I")
    public static int field1565 = 99;

    @OriginalMember(owner = "VZMNLGCR", name = "x", descriptor = "[I")
    private static final int[] field1569 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "VZMNLGCR", name = "E", descriptor = "B")
    private static byte field1576 = 6;

    @OriginalMember(owner = "VZMNLGCR", name = "F", descriptor = "Z")
    public static boolean field1577 = true;

    @OriginalMember(owner = "VZMNLGCR", name = "G", descriptor = "I")
    private static int field1578 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "VZMNLGCR", name = "d", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "VZMNLGCR", name = "f", descriptor = "I")
    private int field1551;

    @OriginalMember(owner = "VZMNLGCR", name = "p", descriptor = "I")
    private int field1561;

    @OriginalMember(owner = "VZMNLGCR", name = "j", descriptor = "Z")
    private static boolean field1555;

    @OriginalMember(owner = "VZMNLGCR", name = "a", descriptor = "(II)I")
    private static final int method432(int arg0, int arg1) {
        int var2 = method435(arg0 + 45365, arg1 + 91923, 4) + (method435(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method435(arg0, arg1, 1) - 128 >> 2) - 128;
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @OriginalMember(owner = "VZMNLGCR", name = "a", descriptor = "(III[B)Z")
    public static final boolean method433(int arg0, int arg1, int arg2, byte[] arg3) {
        boolean var4 = true;
        if (arg1 != 6) {
            field1558 = !field1558;
        }
        class69 var5 = new class69(arg3, -82);
        int var6 = -1;
        label59: while (true) {
            int var7 = var5.method479();
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method479();
                    if (var11 == 0) {
                        continue label59;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = var5.method465() >> 2;
                    int var15 = arg0 + var13;
                    int var16 = arg2 + var12;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        class8 var17 = class8.method30(var6);
                        if (var14 != 22 || !field1577 || var17.field105 || var17.field93) {
                            var4 &= var17.method25(3);
                            var9 = true;
                        }
                    }
                }
                int var10 = var5.method479();
                if (var10 == 0) {
                    break;
                }
                var5.method465();
            }
        }
    }

    @OriginalMember(owner = "VZMNLGCR", name = "a", descriptor = "(IBII)I")
    public int method434(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != 0) {
            return 1;
        } else if ((this.field1556[arg0][arg2][arg3] & 0x8) == 0) {
            return arg0 <= 0 || (this.field1556[1][arg2][arg3] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "VZMNLGCR", name = "a", descriptor = "(III)I")
    private static final int method435(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method437(var3, var5);
        int var8 = method437(var3 + 1, var5);
        int var9 = method437(var3, var5 + 1);
        int var10 = method437(var3 + 1, var5 + 1);
        int var11 = method439(var7, var8, var4, arg2);
        int var12 = method439(var9, var10, var4, arg2);
        return method439(var11, var12, var6, arg2);
    }

    @OriginalMember(owner = "VZMNLGCR", name = "a", descriptor = "(LXGRGMPUQ;ZLLAQKYZGL;)V")
    public static final void method436(class69 arg0, boolean arg1, class37 arg2) {
        int var3 = -1;
        if (arg1) {
            field1555 = !field1555;
        }
        while (true) {
            int var4 = arg0.method479();
            if (var4 == 0) {
                return;
            }
            var3 += var4;
            class8 var5 = class8.method30(var3);
            var5.method32(arg2, false);
            while (true) {
                int var6 = arg0.method479();
                if (var6 == 0) {
                    break;
                }
                arg0.method465();
            }
        }
    }

    @OriginalMember(owner = "VZMNLGCR", name = "b", descriptor = "(II)I")
    private static final int method437(int arg0, int arg1) {
        int var2 = method440(arg0 - 1, arg1 - 1) + method440(arg0 + 1, arg1 - 1) + method440(arg0 - 1, arg1 + 1) + method440(arg0 + 1, arg1 + 1);
        int var3 = method440(arg0 - 1, arg1) + method440(arg0 + 1, arg1) + method440(arg0, arg1 - 1) + method440(arg0, arg1 + 1);
        int var4 = method440(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @OriginalMember(owner = "VZMNLGCR", name = "c", descriptor = "(II)I")
    private final int method438(int arg0, int arg1) {
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

    @OriginalMember(owner = "VZMNLGCR", name = "a", descriptor = "(IIII)I")
    private static final int method439(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class64.field1377[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @OriginalMember(owner = "VZMNLGCR", name = "d", descriptor = "(II)I")
    private static final int method440(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "VZMNLGCR", name = "a", descriptor = "([BI[LGQSCEHQI;ILYDQEOBYY;IIIIII)V")
    public final void method441(byte[] arg0, int arg1, class21[] arg2, int arg3, class70 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        class69 var12 = new class69(arg0, -82);
        if (arg7 != 0) {
            return;
        }
        int var13 = -1;
        while (true) {
            int var14 = var12.method479();
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method479();
                if (var16 == 0) {
                    break;
                }
                var15 += var16 - 1;
                int var17 = var15 & 0x3F;
                int var18 = var15 >> 6 & 0x3F;
                int var19 = var15 >> 12;
                int var20 = var12.method465();
                int var21 = var20 >> 2;
                int var22 = var20 & 0x3;
                if (arg6 == var19 && var18 >= arg8 && var18 < arg8 + 8 && var17 >= arg5 && var17 < arg5 + 8) {
                    class8 var23 = class8.method30(var13);
                    int var24 = arg3 + class17.method205(0, var18 & 0x7, var23.field118, var22, var17 & 0x7, arg10, var23.field97);
                    int var25 = arg1 + class17.method206(var23.field118, var18 & 0x7, var17 & 0x7, arg10, var23.field97, var22, this.field1551);
                    if (var24 > 0 && var25 > 0 && var24 < 103 && var25 < 103) {
                        int var26 = arg9;
                        if ((this.field1556[1][var24][var25] & 0x2) == 2) {
                            var26 = arg9 - 1;
                        }
                        class21 var27 = null;
                        if (var26 >= 0) {
                            var27 = arg2[var26];
                        }
                        this.method444(var27, var13, var25, arg10 + var22 & 0x3, 0, arg4, var24, arg9, var21);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "VZMNLGCR", name = "a", descriptor = "([LGQSCEHQI;IIBI[BI)V")
    public final void method442(class21[] arg0, int arg1, int arg2, byte arg3, int arg4, byte[] arg5, int arg6) {
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    if (arg1 + var14 > 0 && arg1 + var14 < 103 && arg2 + var15 > 0 && arg2 + var15 < 103) {
                        arg0[var8].field828[arg1 + var14][arg2 + var15] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class69 var9 = new class69(arg5, -82);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var12 = 0; var12 < 64; var12++) {
                for (int var13 = 0; var13 < 64; var13++) {
                    this.method452(arg6, -4, arg4, 0, var9, arg1 + var12, arg2 + var13, var10);
                }
            }
        }
        if (arg3 == 6) {
            boolean var11 = false;
        } else {
            this.field1561 = 88;
        }
    }

    @OriginalMember(owner = "VZMNLGCR", name = "a", descriptor = "([LGQSCEHQI;LYDQEOBYY;B)V")
    public final void method443(class21[] arg0, class70 arg1, byte arg2) {
        if (arg2 != 3) {
            this.field1575 = !this.field1575;
        }
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((this.field1556[var4][var110][var111] & 0x1) == 1) {
                        int var112 = var4;
                        if ((this.field1556[1][var110][var111] & 0x2) == 2) {
                            var112 = var4 - 1;
                        }
                        if (var112 >= 0) {
                            arg0[var112].method216(var110, var111, 955);
                        }
                    }
                }
            }
        }
        field1578 += (int) (Math.random() * 5.0D) - 2;
        if (field1578 < -8) {
            field1578 = -8;
        }
        if (field1578 > 8) {
            field1578 = 8;
        }
        field1548 += (int) (Math.random() * 5.0D) - 2;
        if (field1548 < -16) {
            field1548 = -16;
        }
        if (field1548 > 16) {
            field1548 = 16;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            byte[][] var48 = this.field1547[var5];
            byte var49 = 96;
            short var50 = 768;
            byte var51 = -50;
            byte var52 = -10;
            byte var53 = -50;
            int var54 = (int) Math.sqrt((double) (var53 * var53 + var51 * var51 + var52 * var52));
            int var55 = var50 * var54 >> 8;
            for (int var56 = 1; var56 < this.field1567 - 1; var56++) {
                for (int var101 = 1; var101 < this.field1566 - 1; var101++) {
                    int var102 = this.field1568[var5][var101 + 1][var56] - this.field1568[var5][var101 - 1][var56];
                    int var103 = this.field1568[var5][var101][var56 + 1] - this.field1568[var5][var101][var56 - 1];
                    int var104 = (int) Math.sqrt((double) (var103 * var103 + var102 * var102 + 65536));
                    int var105 = (var102 << 8) / var104;
                    int var106 = 65536 / var104;
                    int var107 = (var103 << 8) / var104;
                    int var108 = (var53 * var107 + var51 * var105 + var52 * var106) / var55 + var49;
                    int var109 = (var48[var101][var56] >> 1) + (var48[var101][var56 + 1] >> 3) + (var48[var101][var56 - 1] >> 2) + (var48[var101 - 1][var56] >> 2) + (var48[var101 + 1][var56] >> 3);
                    this.field1559[var101][var56] = var108 - var109;
                }
            }
            for (int var57 = 0; var57 < this.field1567; var57++) {
                this.field1570[var57] = 0;
                this.field1571[var57] = 0;
                this.field1572[var57] = 0;
                this.field1573[var57] = 0;
                this.field1574[var57] = 0;
            }
            for (int var58 = -5; var58 < this.field1566 + 5; var58++) {
                for (int var61 = 0; var61 < this.field1567; var61++) {
                    int var95 = var58 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < this.field1566) {
                        int var96 = this.field1552[var5][var95][var61] & 0xFF;
                        if (var96 > 0) {
                            class50 var97 = class50.field1267[var96 - 1];
                            this.field1570[var61] += var97.field1276;
                            this.field1571[var61] += var97.field1274;
                            this.field1572[var61] += var97.field1275;
                            this.field1573[var61] += var97.field1277;
                            var10002 = this.field1574[var61]++;
                        }
                    }
                    int var98 = var58 - 5;
                    if (var98 >= 0 && var98 < this.field1566) {
                        int var99 = this.field1552[var5][var98][var61] & 0xFF;
                        if (var99 > 0) {
                            class50 var100 = class50.field1267[var99 - 1];
                            this.field1570[var61] -= var100.field1276;
                            this.field1571[var61] -= var100.field1274;
                            this.field1572[var61] -= var100.field1275;
                            this.field1573[var61] -= var100.field1277;
                            var10002 = this.field1574[var61]--;
                        }
                    }
                }
                if (var58 >= 1 && var58 < this.field1566 - 1) {
                    int var62 = 0;
                    int var63 = 0;
                    int var64 = 0;
                    int var65 = 0;
                    int var66 = 0;
                    for (int var67 = -5; var67 < this.field1567 + 5; var67++) {
                        int var68 = var67 + 5;
                        if (var68 >= 0 && var68 < this.field1567) {
                            var62 += this.field1570[var68];
                            var63 += this.field1571[var68];
                            var64 += this.field1572[var68];
                            var65 += this.field1573[var68];
                            var66 += this.field1574[var68];
                        }
                        int var69 = var67 - 5;
                        if (var69 >= 0 && var69 < this.field1567) {
                            var62 -= this.field1570[var69];
                            var63 -= this.field1571[var69];
                            var64 -= this.field1572[var69];
                            var65 -= this.field1573[var69];
                            var66 -= this.field1574[var69];
                        }
                        if (var67 >= 1 && var67 < this.field1567 - 1 && (!field1577 || (this.field1556[0][var58][var67] & 0x2) != 0 || (this.field1556[var5][var58][var67] & 0x10) == 0 && this.method434(var5, (byte) 0, var58, var67) == field1549)) {
                            if (var5 < field1565) {
                                field1565 = var5;
                            }
                            int var70 = this.field1552[var5][var58][var67] & 0xFF;
                            int var71 = this.field1557[var5][var58][var67] & 0xFF;
                            if (var70 > 0 || var71 > 0) {
                                int var72 = this.field1568[var5][var58][var67];
                                int var73 = this.field1568[var5][var58 + 1][var67];
                                int var74 = this.field1568[var5][var58 + 1][var67 + 1];
                                int var75 = this.field1568[var5][var58][var67 + 1];
                                int var76 = this.field1559[var58][var67];
                                int var77 = this.field1559[var58 + 1][var67];
                                int var78 = this.field1559[var58 + 1][var67 + 1];
                                int var79 = this.field1559[var58][var67 + 1];
                                int var80 = -1;
                                int var81 = -1;
                                if (var70 > 0) {
                                    int var82 = var62 * 256 / var65;
                                    int var83 = var63 / var66;
                                    int var84 = var64 / var66;
                                    var80 = this.method451(var82, var83, var84);
                                    int var85 = field1578 + var82 & 0xFF;
                                    int var86 = field1548 + var84;
                                    if (var86 < 0) {
                                        var86 = 0;
                                    } else if (var86 > 255) {
                                        var86 = 255;
                                    }
                                    var81 = this.method451(var85, var83, var86);
                                }
                                if (var5 > 0) {
                                    boolean var87 = true;
                                    if (var70 == 0 && this.field1563[var5][var58][var67] != 0) {
                                        var87 = false;
                                    }
                                    if (var71 > 0 && !class50.field1267[var71 - 1].field1272) {
                                        var87 = false;
                                    }
                                    if (var87 && var72 == var73 && var72 == var74 && var72 == var75) {
                                        this.field1550[var5][var58][var67] |= 0x924;
                                    }
                                }
                                int var88 = 0;
                                if (var80 != -1) {
                                    var88 = class64.field1388[method449(var81, 96)];
                                }
                                if (var71 == 0) {
                                    arg1.method507(var5, var58, var67, 0, 0, -1, var72, var73, var74, var75, method449(var80, var76), method449(var80, var77), method449(var80, var78), method449(var80, var79), 0, 0, 0, 0, var88, 0);
                                } else {
                                    int var89 = this.field1563[var5][var58][var67] + 1;
                                    byte var90 = this.field1560[var5][var58][var67];
                                    class50 var91 = class50.field1267[var71 - 1];
                                    int var92 = var91.field1270;
                                    int var93;
                                    int var94;
                                    if (var92 >= 0) {
                                        var93 = class64.method382((byte) 3, var92);
                                        var94 = -1;
                                    } else if (var91.field1269 == 16711935) {
                                        var93 = 0;
                                        var94 = -2;
                                        var92 = -1;
                                    } else {
                                        var94 = this.method451(var91.field1273, var91.field1274, var91.field1275);
                                        var93 = class64.field1388[this.method438(var91.field1278, 96)];
                                    }
                                    arg1.method507(var5, var58, var67, var89, var90, var92, var72, var73, var74, var75, method449(var80, var76), method449(var80, var77), method449(var80, var78), method449(var80, var79), this.method438(var94, var76), this.method438(var94, var77), this.method438(var94, var78), this.method438(var94, var79), var88, var93);
                                }
                            }
                        }
                    }
                }
            }
            for (int var59 = 1; var59 < this.field1567 - 1; var59++) {
                for (int var60 = 1; var60 < this.field1566 - 1; var60++) {
                    arg1.method506(var5, var60, var59, this.method434(var5, (byte) 0, var60, var59));
                }
            }
        }
        arg1.method533(field1554, 64, -10, -50, -50, 768);
        for (int var6 = 0; var6 < this.field1566; var6++) {
            for (int var47 = 0; var47 < this.field1567; var47++) {
                if ((this.field1556[1][var6][var47] & 0x2) == 2) {
                    arg1.method504(var6, (byte) 5, var47);
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
                for (int var12 = 0; var12 <= this.field1567; var12++) {
                    for (int var13 = 0; var13 <= this.field1566; var13++) {
                        if ((this.field1550[var11][var13][var12] & var7) != 0) {
                            int var14 = var12;
                            int var15 = var12;
                            int var16 = var11;
                            int var17 = var11;
                            while (var14 > 0 && (this.field1550[var11][var13][var14 - 1] & var7) != 0) {
                                var14--;
                            }
                            while (var15 < this.field1567 && (this.field1550[var11][var13][var15 + 1] & var7) != 0) {
                                var15++;
                            }
                            label335: while (var16 > 0) {
                                for (int var18 = var14; var18 <= var15; var18++) {
                                    if ((this.field1550[var16 - 1][var13][var18] & var7) == 0) {
                                        break label335;
                                    }
                                }
                                var16--;
                            }
                            label324: while (var17 < var10) {
                                for (int var19 = var14; var19 <= var15; var19++) {
                                    if ((this.field1550[var17 + 1][var13][var19] & var7) == 0) {
                                        break label324;
                                    }
                                }
                                var17++;
                            }
                            int var20 = (var17 + 1 - var16) * (var15 + 1 - var14);
                            if (var20 >= 8) {
                                short var21 = 240;
                                int var22 = this.field1568[var17][var13][var14] - var21;
                                int var23 = this.field1568[var16][var13][var14];
                                class70.method505(var23, -21221, var15 * 128 + 128, var14 * 128, var13 * 128, 1, var13 * 128, var10, var22);
                                for (int var24 = var16; var24 <= var17; var24++) {
                                    for (int var25 = var14; var25 <= var15; var25++) {
                                        this.field1550[var24][var13][var25] &= ~var7;
                                    }
                                }
                            }
                        }
                        if ((this.field1550[var11][var13][var12] & var8) != 0) {
                            int var26 = var13;
                            int var27 = var13;
                            int var28 = var11;
                            int var29 = var11;
                            while (var26 > 0 && (this.field1550[var11][var26 - 1][var12] & var8) != 0) {
                                var26--;
                            }
                            while (var27 < this.field1566 && (this.field1550[var11][var27 + 1][var12] & var8) != 0) {
                                var27++;
                            }
                            label388: while (var28 > 0) {
                                for (int var30 = var26; var30 <= var27; var30++) {
                                    if ((this.field1550[var28 - 1][var30][var12] & var8) == 0) {
                                        break label388;
                                    }
                                }
                                var28--;
                            }
                            label377: while (var29 < var10) {
                                for (int var31 = var26; var31 <= var27; var31++) {
                                    if ((this.field1550[var29 + 1][var31][var12] & var8) == 0) {
                                        break label377;
                                    }
                                }
                                var29++;
                            }
                            int var32 = (var29 + 1 - var28) * (var27 + 1 - var26);
                            if (var32 >= 8) {
                                short var33 = 240;
                                int var34 = this.field1568[var29][var26][var12] - var33;
                                int var35 = this.field1568[var28][var26][var12];
                                class70.method505(var35, -21221, var12 * 128, var12 * 128, var27 * 128 + 128, 2, var26 * 128, var10, var34);
                                for (int var36 = var28; var36 <= var29; var36++) {
                                    for (int var37 = var26; var37 <= var27; var37++) {
                                        this.field1550[var36][var37][var12] &= ~var8;
                                    }
                                }
                            }
                        }
                        if ((this.field1550[var11][var13][var12] & var9) != 0) {
                            int var38 = var13;
                            int var39 = var13;
                            int var40 = var12;
                            int var41 = var12;
                            while (var40 > 0 && (this.field1550[var11][var13][var40 - 1] & var9) != 0) {
                                var40--;
                            }
                            while (var41 < this.field1567 && (this.field1550[var11][var13][var41 + 1] & var9) != 0) {
                                var41++;
                            }
                            label441: while (var38 > 0) {
                                for (int var42 = var40; var42 <= var41; var42++) {
                                    if ((this.field1550[var11][var38 - 1][var42] & var9) == 0) {
                                        break label441;
                                    }
                                }
                                var38--;
                            }
                            label430: while (var39 < this.field1566) {
                                for (int var43 = var40; var43 <= var41; var43++) {
                                    if ((this.field1550[var11][var39 + 1][var43] & var9) == 0) {
                                        break label430;
                                    }
                                }
                                var39++;
                            }
                            if ((var39 + 1 - var38) * (var41 + 1 - var40) >= 4) {
                                int var44 = this.field1568[var11][var38][var40];
                                class70.method505(var44, -21221, var41 * 128 + 128, var40 * 128, var39 * 128 + 128, 4, var38 * 128, var10, var44);
                                for (int var45 = var38; var45 <= var39; var45++) {
                                    for (int var46 = var40; var46 <= var41; var46++) {
                                        this.field1550[var11][var45][var46] &= ~var9;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "VZMNLGCR", name = "a", descriptor = "(LGQSCEHQI;IIIILYDQEOBYY;III)V")
    private final void method444(class21 arg0, int arg1, int arg2, int arg3, int arg4, class70 arg5, int arg6, int arg7, int arg8) {
        if (field1577 && (this.field1556[0][arg6][arg2] & 0x2) == 0) {
            if ((this.field1556[arg7][arg6][arg2] & 0x10) != 0) {
                return;
            }
            if (this.method434(arg7, (byte) 0, arg6, arg2) != field1549) {
                return;
            }
        }
        if (arg7 < field1565) {
            field1565 = arg7;
        }
        int var10 = this.field1568[arg7][arg6][arg2];
        int var11 = this.field1568[arg7][arg6 + 1][arg2];
        int var12 = this.field1568[arg7][arg6 + 1][arg2 + 1];
        int var13 = this.field1568[arg7][arg6][arg2 + 1];
        int var14 = var10 + var11 + var12 + var13 >> 2;
        class8 var15 = class8.method30(arg1);
        int var16 = (arg1 << 14) + (arg2 << 7) + arg6 + 1073741824;
        if (!var15.field105) {
            var16 += Integer.MIN_VALUE;
        }
        byte var17 = (byte) ((arg3 << 6) + arg8);
        if (arg4 != 0) {
            return;
        }
        if (arg8 == 22) {
            if (!field1577 || var15.field105 || var15.field93) {
                class30 var18;
                if (var15.field89 == -1 && var15.field90 == null) {
                    var18 = var15.method27(22, arg3, var10, var11, var12, var13, -1);
                } else {
                    var18 = new class5(var12, var10, arg1, var11, true, 22, 0, arg3, var15.field89, var13);
                }
                arg5.method508(91, arg6, var18, var17, var14, arg7, arg2, var16);
                if (var15.field109 && var15.field105 && arg0 != null) {
                    arg0.method216(arg6, arg2, 955);
                }
            }
        } else if (arg8 == 10 || arg8 == 11) {
            class30 var38;
            if (var15.field89 == -1 && var15.field90 == null) {
                var38 = var15.method27(10, arg3, var10, var11, var12, var13, -1);
            } else {
                var38 = new class5(var12, var10, arg1, var11, true, 10, 0, arg3, var15.field89, var13);
            }
            if (var38 != null) {
                int var39 = 0;
                if (arg8 == 11) {
                    var39 += 256;
                }
                int var40;
                int var41;
                if (arg3 == 1 || arg3 == 3) {
                    var40 = var15.field118;
                    var41 = var15.field97;
                } else {
                    var40 = var15.field97;
                    var41 = var15.field118;
                }
                if (arg5.method512(arg7, arg2, var17, var39, var38, var40, var14, var16, var41, (byte) 4, arg6) && var15.field124) {
                    class66 var42;
                    if (var38 instanceof class66) {
                        var42 = (class66) var38;
                    } else {
                        var42 = var15.method27(10, arg3, var10, var11, var12, var13, -1);
                    }
                    if (var42 != null) {
                        for (int var43 = 0; var43 <= var40; var43++) {
                            for (int var44 = 0; var44 <= var41; var44++) {
                                int var45 = var42.field1503 / 4;
                                if (var45 > 30) {
                                    var45 = 30;
                                }
                                if (var45 > this.field1547[arg7][arg6 + var43][arg2 + var44]) {
                                    this.field1547[arg7][arg6 + var43][arg2 + var44] = (byte) var45;
                                }
                            }
                        }
                    }
                }
            }
            if (var15.field109 && arg0 != null) {
                arg0.method215(var15.field97, arg6, (byte) 8, arg2, var15.field118, arg3, var15.field117);
            }
        } else if (arg8 >= 12) {
            class30 var19;
            if (var15.field89 == -1 && var15.field90 == null) {
                var19 = var15.method27(arg8, arg3, var10, var11, var12, var13, -1);
            } else {
                var19 = new class5(var12, var10, arg1, var11, true, arg8, 0, arg3, var15.field89, var13);
            }
            arg5.method512(arg7, arg2, var17, 0, var19, 1, var14, var16, 1, (byte) 4, arg6);
            if (arg8 >= 12 && arg8 <= 17 && arg8 != 13 && arg7 > 0) {
                this.field1550[arg7][arg6][arg2] |= 0x924;
            }
            if (var15.field109 && arg0 != null) {
                arg0.method215(var15.field97, arg6, (byte) 8, arg2, var15.field118, arg3, var15.field117);
            }
        } else if (arg8 == 0) {
            class30 var20;
            if (var15.field89 == -1 && var15.field90 == null) {
                var20 = var15.method27(0, arg3, var10, var11, var12, var13, -1);
            } else {
                var20 = new class5(var12, var10, arg1, var11, true, 0, 0, arg3, var15.field89, var13);
            }
            arg5.method510(null, (byte) 122, var17, arg2, var14, 0, var20, field1569[arg3], arg7, var16, arg6);
            if (arg3 == 0) {
                if (var15.field124) {
                    this.field1547[arg7][arg6][arg2] = 50;
                    this.field1547[arg7][arg6][arg2 + 1] = 50;
                }
                if (var15.field86) {
                    this.field1550[arg7][arg6][arg2] |= 0x249;
                }
            } else if (arg3 == 1) {
                if (var15.field124) {
                    this.field1547[arg7][arg6][arg2 + 1] = 50;
                    this.field1547[arg7][arg6 + 1][arg2 + 1] = 50;
                }
                if (var15.field86) {
                    this.field1550[arg7][arg6][arg2 + 1] |= 0x492;
                }
            } else if (arg3 == 2) {
                if (var15.field124) {
                    this.field1547[arg7][arg6 + 1][arg2] = 50;
                    this.field1547[arg7][arg6 + 1][arg2 + 1] = 50;
                }
                if (var15.field86) {
                    this.field1550[arg7][arg6 + 1][arg2] |= 0x249;
                }
            } else if (arg3 == 3) {
                if (var15.field124) {
                    this.field1547[arg7][arg6][arg2] = 50;
                    this.field1547[arg7][arg6 + 1][arg2] = 50;
                }
                if (var15.field86) {
                    this.field1550[arg7][arg6][arg2] |= 0x492;
                }
            }
            if (var15.field109 && arg0 != null) {
                arg0.method214(arg2, field1576, arg3, arg6, var15.field117, arg8);
            }
            if (var15.field128 != 16) {
                arg5.method518(arg7, false, var15.field128, arg2, arg6);
            }
        } else if (arg8 == 1) {
            class30 var21;
            if (var15.field89 == -1 && var15.field90 == null) {
                var21 = var15.method27(1, arg3, var10, var11, var12, var13, -1);
            } else {
                var21 = new class5(var12, var10, arg1, var11, true, 1, 0, arg3, var15.field89, var13);
            }
            arg5.method510(null, (byte) 122, var17, arg2, var14, 0, var21, field1553[arg3], arg7, var16, arg6);
            if (var15.field124) {
                if (arg3 == 0) {
                    this.field1547[arg7][arg6][arg2 + 1] = 50;
                } else if (arg3 == 1) {
                    this.field1547[arg7][arg6 + 1][arg2 + 1] = 50;
                } else if (arg3 == 2) {
                    this.field1547[arg7][arg6 + 1][arg2] = 50;
                } else if (arg3 == 3) {
                    this.field1547[arg7][arg6][arg2] = 50;
                }
            }
            if (var15.field109 && arg0 != null) {
                arg0.method214(arg2, field1576, arg3, arg6, var15.field117, arg8);
            }
        } else if (arg8 == 2) {
            int var22 = arg3 + 1 & 0x3;
            class30 var23;
            class30 var24;
            if (var15.field89 == -1 && var15.field90 == null) {
                var23 = var15.method27(2, arg3 + 4, var10, var11, var12, var13, -1);
                var24 = var15.method27(2, var22, var10, var11, var12, var13, -1);
            } else {
                var23 = new class5(var12, var10, arg1, var11, true, 2, 0, arg3 + 4, var15.field89, var13);
                var24 = new class5(var12, var10, arg1, var11, true, 2, 0, var22, var15.field89, var13);
            }
            arg5.method510(var24, (byte) 122, var17, arg2, var14, field1569[var22], var23, field1569[arg3], arg7, var16, arg6);
            if (var15.field86) {
                if (arg3 == 0) {
                    this.field1550[arg7][arg6][arg2] |= 0x249;
                    this.field1550[arg7][arg6][arg2 + 1] |= 0x492;
                } else if (arg3 == 1) {
                    this.field1550[arg7][arg6][arg2 + 1] |= 0x492;
                    this.field1550[arg7][arg6 + 1][arg2] |= 0x249;
                } else if (arg3 == 2) {
                    this.field1550[arg7][arg6 + 1][arg2] |= 0x249;
                    this.field1550[arg7][arg6][arg2] |= 0x492;
                } else if (arg3 == 3) {
                    this.field1550[arg7][arg6][arg2] |= 0x492;
                    this.field1550[arg7][arg6][arg2] |= 0x249;
                }
            }
            if (var15.field109 && arg0 != null) {
                arg0.method214(arg2, field1576, arg3, arg6, var15.field117, arg8);
            }
            if (var15.field128 != 16) {
                arg5.method518(arg7, false, var15.field128, arg2, arg6);
            }
        } else if (arg8 == 3) {
            class30 var25;
            if (var15.field89 == -1 && var15.field90 == null) {
                var25 = var15.method27(3, arg3, var10, var11, var12, var13, -1);
            } else {
                var25 = new class5(var12, var10, arg1, var11, true, 3, 0, arg3, var15.field89, var13);
            }
            arg5.method510(null, (byte) 122, var17, arg2, var14, 0, var25, field1553[arg3], arg7, var16, arg6);
            if (var15.field124) {
                if (arg3 == 0) {
                    this.field1547[arg7][arg6][arg2 + 1] = 50;
                } else if (arg3 == 1) {
                    this.field1547[arg7][arg6 + 1][arg2 + 1] = 50;
                } else if (arg3 == 2) {
                    this.field1547[arg7][arg6 + 1][arg2] = 50;
                } else if (arg3 == 3) {
                    this.field1547[arg7][arg6][arg2] = 50;
                }
            }
            if (var15.field109 && arg0 != null) {
                arg0.method214(arg2, field1576, arg3, arg6, var15.field117, arg8);
            }
        } else if (arg8 == 9) {
            class30 var26;
            if (var15.field89 == -1 && var15.field90 == null) {
                var26 = var15.method27(arg8, arg3, var10, var11, var12, var13, -1);
            } else {
                var26 = new class5(var12, var10, arg1, var11, true, arg8, 0, arg3, var15.field89, var13);
            }
            arg5.method512(arg7, arg2, var17, 0, var26, 1, var14, var16, 1, (byte) 4, arg6);
            if (var15.field109 && arg0 != null) {
                arg0.method215(var15.field97, arg6, (byte) 8, arg2, var15.field118, arg3, var15.field117);
            }
        } else {
            if (var15.field127) {
                if (arg3 == 1) {
                    int var27 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var10;
                    var10 = var27;
                } else if (arg3 == 2) {
                    int var28 = var13;
                    var13 = var11;
                    var11 = var28;
                    int var29 = var12;
                    var12 = var10;
                    var10 = var29;
                } else if (arg3 == 3) {
                    int var30 = var13;
                    var13 = var10;
                    var10 = var11;
                    var11 = var12;
                    var12 = var30;
                }
            }
            if (arg8 == 4) {
                class30 var31;
                if (var15.field89 == -1 && var15.field90 == null) {
                    var31 = var15.method27(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var31 = new class5(var12, var10, arg1, var11, true, 4, 0, 0, var15.field89, var13);
                }
                arg5.method511(var17, arg3 * 512, var14, arg2, false, arg7, arg6, field1569[arg3], 0, 0, var16, var31);
            } else if (arg8 == 5) {
                int var32 = 16;
                int var33 = arg5.method528(arg7, arg6, arg2);
                if (var33 > 0) {
                    var32 = class8.method30(var33 >> 14 & 0x7FFF).field128;
                }
                class30 var34;
                if (var15.field89 == -1 && var15.field90 == null) {
                    var34 = var15.method27(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var34 = new class5(var12, var10, arg1, var11, true, 4, 0, 0, var15.field89, var13);
                }
                arg5.method511(var17, arg3 * 512, var14, arg2, false, arg7, arg6, field1569[arg3], field1546[arg3] * var32, field1564[arg3] * var32, var16, var34);
            } else if (arg8 == 6) {
                class30 var35;
                if (var15.field89 == -1 && var15.field90 == null) {
                    var35 = var15.method27(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var35 = new class5(var12, var10, arg1, var11, true, 4, 0, 0, var15.field89, var13);
                }
                arg5.method511(var17, arg3, var14, arg2, false, arg7, arg6, 256, 0, 0, var16, var35);
            } else if (arg8 == 7) {
                class30 var36;
                if (var15.field89 == -1 && var15.field90 == null) {
                    var36 = var15.method27(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var36 = new class5(var12, var10, arg1, var11, true, 4, 0, 0, var15.field89, var13);
                }
                arg5.method511(var17, arg3, var14, arg2, false, arg7, arg6, 512, 0, 0, var16, var36);
            } else if (arg8 == 8) {
                class30 var37;
                if (var15.field89 == -1 && var15.field90 == null) {
                    var37 = var15.method27(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var37 = new class5(var12, var10, arg1, var11, true, 4, 0, 0, var15.field89, var13);
                }
                arg5.method511(var17, arg3, var14, arg2, false, arg7, arg6, 768, 0, 0, var16, var37);
            }
        }
    }

    @OriginalMember(owner = "VZMNLGCR", name = "b", descriptor = "(III)Z")
    public static final boolean method445(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            field1555 = !field1555;
        }
        class8 var3 = class8.method30(arg1);
        if (arg0 == 11) {
            arg0 = 10;
        }
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        return var3.method24((byte) 20, arg0);
    }

    @OriginalMember(owner = "VZMNLGCR", name = "a", descriptor = "(III[BIIIZI[LGQSCEHQI;)V")
    public final void method446(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, class21[] arg9) {
        for (int var11 = 0; var11 < 8; var11++) {
            for (int var17 = 0; var17 < 8; var17++) {
                if (arg2 + var11 > 0 && arg2 + var11 < 103 && arg0 + var17 > 0 && arg0 + var17 < 103) {
                    arg9[arg8].field828[arg2 + var11][arg0 + var17] &= 0xFEFFFFFF;
                }
            }
        }
        if (arg7) {
            for (int var12 = 1; var12 > 0; var12++) {
            }
        }
        class69 var13 = new class69(arg3, -82);
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 64; var15++) {
                for (int var16 = 0; var16 < 64; var16++) {
                    if (arg4 == var14 && var15 >= arg5 && var15 < arg5 + 8 && var16 >= arg1 && var16 < arg1 + 8) {
                        this.method452(0, -4, 0, arg6, var13, arg2 + class17.method203(var15 & 0x7, var16 & 0x7, (byte) -57, arg6), arg0 + class17.method204(arg6, var16 & 0x7, true, var15 & 0x7), arg8);
                    } else {
                        this.method452(0, -4, 0, 0, var13, -1, -1, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "VZMNLGCR", name = "<init>", descriptor = "(I[[[I[[[BZI)V")
    public class67(int arg0, int[][][] arg1, byte[][][] arg2, boolean arg3, int arg4) {
        field1565 = 99;
        this.field1566 = arg0;
        this.field1567 = arg4;
        this.field1568 = arg1;
        this.field1556 = arg2;
        this.field1552 = new byte[4][this.field1566][this.field1567];
        this.field1557 = new byte[4][this.field1566][this.field1567];
        this.field1563 = new byte[4][this.field1566][this.field1567];
        this.field1560 = new byte[4][this.field1566][this.field1567];
        this.field1550 = new int[4][this.field1566 + 1][this.field1567 + 1];
        this.field1547 = new byte[4][this.field1566 + 1][this.field1567 + 1];
        this.field1559 = new int[this.field1566 + 1][this.field1567 + 1];
        this.field1570 = new int[this.field1567];
        if (arg3) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        this.field1571 = new int[this.field1567];
        this.field1572 = new int[this.field1567];
        this.field1573 = new int[this.field1567];
        this.field1574 = new int[this.field1567];
    }

    @OriginalMember(owner = "VZMNLGCR", name = "a", descriptor = "(IIIIIZLYDQEOBYY;LGQSCEHQI;I[[[II)V")
    public static final void method447(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, class70 arg6, class21 arg7, int arg8, int[][][] arg9, int arg10) {
        int var11 = arg9[arg4][arg1][arg10];
        int var12 = arg9[arg4][arg1 + 1][arg10];
        int var13 = arg9[arg4][arg1 + 1][arg10 + 1];
        int var14 = arg9[arg4][arg1][arg10 + 1];
        int var15 = var11 + var12 + var13 + var14 >> 2;
        if (!arg5) {
            field1554 = -87;
        }
        class8 var16 = class8.method30(arg3);
        int var17 = (arg3 << 14) + (arg10 << 7) + arg1 + 1073741824;
        if (!var16.field105) {
            var17 += Integer.MIN_VALUE;
        }
        byte var18 = (byte) ((arg8 << 6) + arg2);
        if (arg2 == 22) {
            class30 var19;
            if (var16.field89 == -1 && var16.field90 == null) {
                var19 = var16.method27(22, arg8, var11, var12, var13, var14, -1);
            } else {
                var19 = new class5(var13, var11, arg3, var12, true, 22, 0, arg8, var16.field89, var14);
            }
            arg6.method508(91, arg1, var19, var18, var15, arg0, arg10, var17);
            if (var16.field109 && var16.field105) {
                arg7.method216(arg1, arg10, 955);
            }
        } else if (arg2 == 10 || arg2 == 11) {
            class30 var39;
            if (var16.field89 == -1 && var16.field90 == null) {
                var39 = var16.method27(10, arg8, var11, var12, var13, var14, -1);
            } else {
                var39 = new class5(var13, var11, arg3, var12, true, 10, 0, arg8, var16.field89, var14);
            }
            if (var39 != null) {
                int var40 = 0;
                if (arg2 == 11) {
                    var40 += 256;
                }
                int var41;
                int var42;
                if (arg8 == 1 || arg8 == 3) {
                    var41 = var16.field118;
                    var42 = var16.field97;
                } else {
                    var41 = var16.field97;
                    var42 = var16.field118;
                }
                arg6.method512(arg0, arg10, var18, var40, var39, var41, var15, var17, var42, (byte) 4, arg1);
            }
            if (var16.field109) {
                arg7.method215(var16.field97, arg1, (byte) 8, arg10, var16.field118, arg8, var16.field117);
            }
        } else if (arg2 >= 12) {
            class30 var20;
            if (var16.field89 == -1 && var16.field90 == null) {
                var20 = var16.method27(arg2, arg8, var11, var12, var13, var14, -1);
            } else {
                var20 = new class5(var13, var11, arg3, var12, true, arg2, 0, arg8, var16.field89, var14);
            }
            arg6.method512(arg0, arg10, var18, 0, var20, 1, var15, var17, 1, (byte) 4, arg1);
            if (var16.field109) {
                arg7.method215(var16.field97, arg1, (byte) 8, arg10, var16.field118, arg8, var16.field117);
            }
        } else if (arg2 == 0) {
            class30 var21;
            if (var16.field89 == -1 && var16.field90 == null) {
                var21 = var16.method27(0, arg8, var11, var12, var13, var14, -1);
            } else {
                var21 = new class5(var13, var11, arg3, var12, true, 0, 0, arg8, var16.field89, var14);
            }
            arg6.method510(null, (byte) 122, var18, arg10, var15, 0, var21, field1569[arg8], arg0, var17, arg1);
            if (var16.field109) {
                arg7.method214(arg10, field1576, arg8, arg1, var16.field117, arg2);
            }
        } else if (arg2 == 1) {
            class30 var22;
            if (var16.field89 == -1 && var16.field90 == null) {
                var22 = var16.method27(1, arg8, var11, var12, var13, var14, -1);
            } else {
                var22 = new class5(var13, var11, arg3, var12, true, 1, 0, arg8, var16.field89, var14);
            }
            arg6.method510(null, (byte) 122, var18, arg10, var15, 0, var22, field1553[arg8], arg0, var17, arg1);
            if (var16.field109) {
                arg7.method214(arg10, field1576, arg8, arg1, var16.field117, arg2);
            }
        } else if (arg2 == 2) {
            int var23 = arg8 + 1 & 0x3;
            class30 var24;
            class30 var25;
            if (var16.field89 == -1 && var16.field90 == null) {
                var24 = var16.method27(2, arg8 + 4, var11, var12, var13, var14, -1);
                var25 = var16.method27(2, var23, var11, var12, var13, var14, -1);
            } else {
                var24 = new class5(var13, var11, arg3, var12, true, 2, 0, arg8 + 4, var16.field89, var14);
                var25 = new class5(var13, var11, arg3, var12, true, 2, 0, var23, var16.field89, var14);
            }
            arg6.method510(var25, (byte) 122, var18, arg10, var15, field1569[var23], var24, field1569[arg8], arg0, var17, arg1);
            if (var16.field109) {
                arg7.method214(arg10, field1576, arg8, arg1, var16.field117, arg2);
            }
        } else if (arg2 == 3) {
            class30 var26;
            if (var16.field89 == -1 && var16.field90 == null) {
                var26 = var16.method27(3, arg8, var11, var12, var13, var14, -1);
            } else {
                var26 = new class5(var13, var11, arg3, var12, true, 3, 0, arg8, var16.field89, var14);
            }
            arg6.method510(null, (byte) 122, var18, arg10, var15, 0, var26, field1553[arg8], arg0, var17, arg1);
            if (var16.field109) {
                arg7.method214(arg10, field1576, arg8, arg1, var16.field117, arg2);
            }
        } else if (arg2 == 9) {
            class30 var27;
            if (var16.field89 == -1 && var16.field90 == null) {
                var27 = var16.method27(arg2, arg8, var11, var12, var13, var14, -1);
            } else {
                var27 = new class5(var13, var11, arg3, var12, true, arg2, 0, arg8, var16.field89, var14);
            }
            arg6.method512(arg0, arg10, var18, 0, var27, 1, var15, var17, 1, (byte) 4, arg1);
            if (var16.field109) {
                arg7.method215(var16.field97, arg1, (byte) 8, arg10, var16.field118, arg8, var16.field117);
            }
        } else {
            if (var16.field127) {
                if (arg8 == 1) {
                    int var28 = var14;
                    var14 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var28;
                } else if (arg8 == 2) {
                    int var29 = var14;
                    var14 = var12;
                    var12 = var29;
                    int var30 = var13;
                    var13 = var11;
                    var11 = var30;
                } else if (arg8 == 3) {
                    int var31 = var14;
                    var14 = var11;
                    var11 = var12;
                    var12 = var13;
                    var13 = var31;
                }
            }
            if (arg2 == 4) {
                class30 var32;
                if (var16.field89 == -1 && var16.field90 == null) {
                    var32 = var16.method27(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var32 = new class5(var13, var11, arg3, var12, true, 4, 0, 0, var16.field89, var14);
                }
                arg6.method511(var18, arg8 * 512, var15, arg10, false, arg0, arg1, field1569[arg8], 0, 0, var17, var32);
            } else if (arg2 == 5) {
                int var33 = 16;
                int var34 = arg6.method528(arg0, arg1, arg10);
                if (var34 > 0) {
                    var33 = class8.method30(var34 >> 14 & 0x7FFF).field128;
                }
                class30 var35;
                if (var16.field89 == -1 && var16.field90 == null) {
                    var35 = var16.method27(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var35 = new class5(var13, var11, arg3, var12, true, 4, 0, 0, var16.field89, var14);
                }
                arg6.method511(var18, arg8 * 512, var15, arg10, false, arg0, arg1, field1569[arg8], field1546[arg8] * var33, field1564[arg8] * var33, var17, var35);
            } else if (arg2 == 6) {
                class30 var36;
                if (var16.field89 == -1 && var16.field90 == null) {
                    var36 = var16.method27(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var36 = new class5(var13, var11, arg3, var12, true, 4, 0, 0, var16.field89, var14);
                }
                arg6.method511(var18, arg8, var15, arg10, false, arg0, arg1, 256, 0, 0, var17, var36);
            } else if (arg2 == 7) {
                class30 var37;
                if (var16.field89 == -1 && var16.field90 == null) {
                    var37 = var16.method27(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var37 = new class5(var13, var11, arg3, var12, true, 4, 0, 0, var16.field89, var14);
                }
                arg6.method511(var18, arg8, var15, arg10, false, arg0, arg1, 512, 0, 0, var17, var37);
            } else if (arg2 == 8) {
                class30 var38;
                if (var16.field89 == -1 && var16.field90 == null) {
                    var38 = var16.method27(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var38 = new class5(var13, var11, arg3, var12, true, 4, 0, 0, var16.field89, var14);
                }
                arg6.method511(var18, arg8, var15, arg10, false, arg0, arg1, 768, 0, 0, var17, var38);
            }
        }
    }

    @OriginalMember(owner = "VZMNLGCR", name = "a", descriptor = "(I[LGQSCEHQI;I[BBLYDQEOBYY;)V")
    public final void method448(int arg0, class21[] arg1, int arg2, byte[] arg3, byte arg4, class70 arg5) {
        class69 var7 = new class69(arg3, -82);
        int var8 = -1;
        if (arg4 == 3) {
            boolean var9 = false;
        } else {
            this.field1562 = 420;
        }
        while (true) {
            int var10 = var7.method479();
            if (var10 == 0) {
                return;
            }
            var8 += var10;
            int var11 = 0;
            while (true) {
                int var12 = var7.method479();
                if (var12 == 0) {
                    break;
                }
                var11 += var12 - 1;
                int var13 = var11 & 0x3F;
                int var14 = var11 >> 6 & 0x3F;
                int var15 = var11 >> 12;
                int var16 = var7.method465();
                int var17 = var16 >> 2;
                int var18 = var16 & 0x3;
                int var19 = arg2 + var14;
                int var20 = arg0 + var13;
                if (var19 > 0 && var20 > 0 && var19 < 103 && var20 < 103) {
                    int var21 = var15;
                    if ((this.field1556[1][var19][var20] & 0x2) == 2) {
                        var21 = var15 - 1;
                    }
                    class21 var22 = null;
                    if (var21 >= 0) {
                        var22 = arg1[var21];
                    }
                    this.method444(var22, var8, var20, var18, 0, arg5, var19, var15, var17);
                }
            }
        }
    }

    @OriginalMember(owner = "VZMNLGCR", name = "e", descriptor = "(II)I")
    private static final int method449(int arg0, int arg1) {
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

    @OriginalMember(owner = "VZMNLGCR", name = "a", descriptor = "(IIIII)V")
    public final void method450(int arg0, int arg1, int arg2, int arg3, int arg4) {
        label64: while (true) {
            if (arg2 >= 0) {
                int var8 = 1;
                while (true) {
                    if (var8 <= 0) {
                        continue label64;
                    }
                    var8++;
                }
            }
            for (int var6 = arg4; var6 <= arg1 + arg4; var6++) {
                for (int var7 = arg0; var7 <= arg0 + arg3; var7++) {
                    if (var7 >= 0 && var7 < this.field1566 && var6 >= 0 && var6 < this.field1567) {
                        this.field1547[0][var7][var6] = 127;
                        if (arg0 == var7 && var7 > 0) {
                            this.field1568[0][var7][var6] = this.field1568[0][var7 - 1][var6];
                        }
                        if (arg0 + arg3 == var7 && var7 < this.field1566 - 1) {
                            this.field1568[0][var7][var6] = this.field1568[0][var7 + 1][var6];
                        }
                        if (arg4 == var6 && var6 > 0) {
                            this.field1568[0][var7][var6] = this.field1568[0][var7][var6 - 1];
                        }
                        if (arg1 + arg4 == var6 && var6 < this.field1567 - 1) {
                            this.field1568[0][var7][var6] = this.field1568[0][var7][var6 + 1];
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "VZMNLGCR", name = "c", descriptor = "(III)I")
    private final int method451(int arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "VZMNLGCR", name = "a", descriptor = "(IIIILXGRGMPUQ;III)V")
    private final void method452(int arg0, int arg1, int arg2, int arg3, class69 arg4, int arg5, int arg6, int arg7) {
        if (arg1 >= 0) {
            return;
        }
        if (arg5 < 0 || arg5 >= 104 || arg6 < 0 || arg6 >= 104) {
            while (true) {
                int var11 = arg4.method465();
                if (var11 == 0) {
                    return;
                }
                if (var11 == 1) {
                    arg4.method465();
                    return;
                }
                if (var11 <= 49) {
                    arg4.method465();
                }
            }
        }
        this.field1556[arg7][arg5][arg6] = 0;
        while (true) {
            int var9 = arg4.method465();
            if (var9 == 0) {
                if (arg7 == 0) {
                    this.field1568[0][arg5][arg6] = -method432(arg5 + arg0 + 932731, arg6 + 556238 + arg2) * 8;
                    return;
                } else {
                    this.field1568[arg7][arg5][arg6] = this.field1568[arg7 - 1][arg5][arg6] - 240;
                    return;
                }
            }
            if (var9 == 1) {
                int var10 = arg4.method465();
                if (var10 == 1) {
                    var10 = 0;
                }
                if (arg7 == 0) {
                    this.field1568[0][arg5][arg6] = -var10 * 8;
                    return;
                }
                this.field1568[arg7][arg5][arg6] = this.field1568[arg7 - 1][arg5][arg6] - var10 * 8;
                return;
            }
            if (var9 <= 49) {
                this.field1557[arg7][arg5][arg6] = arg4.method466();
                this.field1563[arg7][arg5][arg6] = (byte) ((var9 - 2) / 4);
                this.field1560[arg7][arg5][arg6] = (byte) (var9 + arg3 - 2 & 0x3);
            } else if (var9 <= 81) {
                this.field1556[arg7][arg5][arg6] = (byte) (var9 - 49);
            } else {
                this.field1552[arg7][arg5][arg6] = (byte) (var9 - 81);
            }
        }
    }
}
