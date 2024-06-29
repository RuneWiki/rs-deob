import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class258 {

    @OriginalMember(owner = "client!qc", name = "u", descriptor = "I")
    private int field4529 = 0;

    @OriginalMember(owner = "client!qc", name = "s", descriptor = "I")
    private int field4527;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "[Lsa;")
    private class137[] field4512;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "Lhh;")
    public static class163 field4515 = class137.method1065("::tele ", 17);

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "[I")
    public static int[] field4510 = new int[2];

    @OriginalMember(owner = "client!qc", name = "r", descriptor = "Lhh;")
    private static class163 field4526 = class137.method1065("RuneScape is loading )2 please wait)3)3)3", 17);

    @OriginalMember(owner = "client!qc", name = "p", descriptor = "Lhh;")
    public static class163 field4524 = field4526;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
    public static int field4509;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
    public static int field4511;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    public static int field4513;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
    public static int field4514;

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "I")
    public static int field4517;

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
    public static int field4518;

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "I")
    public static int field4520;

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "I")
    public static int field4521;

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "I")
    public static int field4522;

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!qc", name = "q", descriptor = "I")
    public static int field4525;

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "J")
    private long field4519;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "Lsa;")
    private class137 field4516;

    @OriginalMember(owner = "client!qc", name = "t", descriptor = "Lsa;")
    private class137 field4528;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
    public static void method1739(int arg0) {
        field4524 = null;
        field4515 = null;
        if (arg0 < 12) {
            method1739(14);
        }
        field4510 = null;
        field4526 = null;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)Lsa;")
    public final class137 method1740(int arg0) {
        field4513++;
        if (this.field4516 == null) {
            return null;
        }
        class137 var2 = this.field4512[(int) ((long) (this.field4527 + arg0) & this.field4519)];
        while (this.field4516 != var2) {
            if (this.field4516.field2641 == this.field4519) {
                class137 var3 = this.field4516;
                this.field4516 = this.field4516.field2645;
                return var3;
            }
            this.field4516 = this.field4516.field2645;
        }
        this.field4516 = null;
        return null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lsa;ZJ)V")
    public final void method1741(class137 arg0, boolean arg1, long arg2) {
        field4517++;
        if (arg0.field2648 != null) {
            arg0.method1063(102);
        }
        if (arg1) {
            this.field4512 = null;
        }
        class137 var5 = this.field4512[(int) ((long) (this.field4527 - 1) & arg2)];
        arg0.field2648 = var5.field2648;
        arg0.field2641 = arg2;
        arg0.field2645 = var5;
        arg0.field2648.field2645 = arg0;
        arg0.field2645.field2648 = arg0;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V")
    public final void method1742(byte arg0) {
        field4522++;
        int var2 = -86 % ((arg0 + 26) / 58);
        for (int var3 = 0; var3 < this.field4527; var3++) {
            class137 var4 = this.field4512[var3];
            while (true) {
                class137 var5 = var4.field2645;
                if (var4 == var5) {
                    break;
                }
                var5.method1063(108);
            }
        }
        this.field4528 = null;
        this.field4516 = null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(JZ)Lsa;")
    public final class137 method1743(long arg0, boolean arg1) {
        this.field4519 = arg0;
        field4523++;
        class137 var4 = this.field4512[(int) (arg0 & (long) (this.field4527 - 1))];
        if (arg1) {
            field4515 = null;
        }
        for (this.field4516 = var4.field2645; this.field4516 != var4; this.field4516 = this.field4516.field2645) {
            if (this.field4516.field2641 == arg0) {
                class137 var5 = this.field4516;
                this.field4516 = this.field4516.field2645;
                return var5;
            }
        }
        this.field4516 = null;
        return null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZI[Lcg;)V")
    public static final void method1744(boolean arg0, int arg1, class1[] arg2) {
        field4511++;
        byte var3;
        if (arg0) {
            var3 = 1;
        } else {
            var3 = 4;
        }
        if (arg1 != -105) {
            return;
        }
        if (!arg0) {
            for (int var4 = 0; var4 < 4; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    for (int var6 = 0; var6 < 104; var6++) {
                        if ((class123.field2344[var4][var5][var6] & 0x1) == 1) {
                            int var7 = var4;
                            if ((class123.field2344[1][var5][var6] & 0x2) == 2) {
                                var7 = var4 - 1;
                            }
                            if (var7 >= 0) {
                                arg2[var7].method16((byte) -36, var5, var6);
                            }
                        }
                    }
                }
            }
            class136.field2623 += (int) (Math.random() * 5.0D) - 2;
            if (class136.field2623 < -8) {
                class136.field2623 = -8;
            }
            if (class136.field2623 > 8) {
                class136.field2623 = 8;
            }
            class17.field243 += (int) (Math.random() * 5.0D) - 2;
            if (class17.field243 < -16) {
                class17.field243 = -16;
            }
            if (class17.field243 > 16) {
                class17.field243 = 16;
            }
        }
        int var8 = class136.field2623 >> 2 << 10;
        int var9 = class17.field243 >> 1;
        int[][] var10 = new int[104][104];
        int[][] var11 = new int[104][104];
        for (int var12 = 0; var12 < var3; var12++) {
            byte[][] var51 = class119.field2241[var12];
            int var52 = (int) Math.sqrt(5100.0D);
            int var53 = var52 * 768 >> 8;
            for (int var54 = 1; var54 < 103; var54++) {
                for (int var100 = 1; var100 < 103; var100++) {
                    byte var101 = 74;
                    int var102 = class228.field4107[var12][var100][var54 + 1] - class228.field4107[var12][var100][var54 - 1];
                    int var103 = class228.field4107[var12][var100 + 1][var54] - class228.field4107[var12][var100 - 1][var54];
                    int var104 = (int) Math.sqrt((double) (var102 * var102 + var103 * var103 + 65536));
                    int var105 = -65536 / var104;
                    int var106 = (var103 << 8) / var104;
                    int var107 = (var51[var100][var54] >> 1) + ((var51[var100][var54 + 1] >> 3) + (var51[var100 - 1][var54] >> 2) - (-(var51[var100 - -1][var54] >> 3) - (var51[var100][var54 + -1] >> 2)));
                    int var108 = (var102 << 8) / var104;
                    int var109 = (var106 * -50 + var105 * -10 + var108 * -50) / var53 + var101;
                    var11[var100][var54] = var109 - var107;
                }
            }
            for (int var55 = 0; var55 < 104; var55++) {
                class37.field631[var55] = 0;
                class131.field2542[var55] = 0;
                class260.field4553[var55] = 0;
                class60.field1020[var55] = 0;
                class3.field71[var55] = 0;
            }
            for (int var56 = -5; var56 < 104; var56++) {
                for (int var85 = 0; var85 < 104; var85++) {
                    int var94 = var56 + 5;
                    int var10002;
                    if (var94 < 104) {
                        int var95 = class116.field2206[var12][var94][var85] & 0xFF;
                        if (var95 > 0) {
                            class95 var96 = class115.method919(var95 - 1, -41);
                            class37.field631[var85] += var96.field1798;
                            class131.field2542[var85] += var96.field1794;
                            class260.field4553[var85] += var96.field1792;
                            class60.field1020[var85] += var96.field1803;
                            var10002 = class3.field71[var85]++;
                        }
                    }
                    int var97 = var56 - 5;
                    if (var97 >= 0) {
                        int var98 = class116.field2206[var12][var97][var85] & 0xFF;
                        if (var98 > 0) {
                            class95 var99 = class115.method919(var98 - 1, -113);
                            class37.field631[var85] -= var99.field1798;
                            class131.field2542[var85] -= var99.field1794;
                            class260.field4553[var85] -= var99.field1792;
                            class60.field1020[var85] -= var99.field1803;
                            var10002 = class3.field71[var85]--;
                        }
                    }
                }
                if (var56 >= 0) {
                    int var86 = 0;
                    int var87 = 0;
                    int var88 = 0;
                    int var89 = 0;
                    int var90 = 0;
                    for (int var91 = -5; var91 < 104; var91++) {
                        int var92 = var91 + 5;
                        if (var92 < 104) {
                            var88 += class3.field71[var92];
                            var86 += class37.field631[var92];
                            var89 += class260.field4553[var92];
                            var87 += class131.field2542[var92];
                            var90 += class60.field1020[var92];
                        }
                        int var93 = var91 - 5;
                        if (var93 >= 0) {
                            var90 -= class60.field1020[var93];
                            var87 -= class131.field2542[var93];
                            var86 -= class37.field631[var93];
                            var89 -= class260.field4553[var93];
                            var88 -= class3.field71[var93];
                        }
                        if (var91 >= 0 && var88 > 0) {
                            var10[var56][var91] = class234.method1621(var86 * 256 / var90, var89 / var88, 124, var87 / var88);
                        }
                    }
                }
            }
            for (int var57 = 1; var57 < 103; var57++) {
                for (int var58 = 1; var58 < 103; var58++) {
                    if (arg0 || class177.method1310(arg1 + 4748) || (class123.field2344[0][var57][var58] & 0x2) != 0 || (class123.field2344[var12][var57][var58] & 0x10) == 0 && class76.method561((byte) -101, var12, var57, var58) == class233.field4167) {
                        if (class76.field1429 > var12) {
                            class76.field1429 = var12;
                        }
                        int var59 = class222.field4048[var12][var57][var58] & 0xFF;
                        int var60 = class116.field2206[var12][var57][var58] & 0xFF;
                        if (var60 > 0 || var59 > 0) {
                            int var61 = class228.field4107[var12][var57][var58];
                            int var62 = class228.field4107[var12][var57 + 1][var58];
                            int var63 = class228.field4107[var12][var57 + 1][var58 + 1];
                            int var64 = class228.field4107[var12][var57][var58 + 1];
                            if (var12 > 0) {
                                boolean var65 = true;
                                if (var60 == 0 && class234.field4180[var12][var57][var58] != 0) {
                                    var65 = false;
                                }
                                if (var59 > 0 && !class60.method412(28, var59 - 1).field606) {
                                    var65 = false;
                                }
                                if (var65 && var61 == var62 && var61 == var63 && var61 == var64) {
                                    class233.field4164[var12][var57][var58] = class3.method27(class233.field4164[var12][var57][var58], 4);
                                }
                            }
                            int var66;
                            int var69;
                            if (var60 > 0) {
                                var66 = var10[var57][var58];
                                int var67 = (var66 & 0x7F) + var9;
                                if (var67 < 0) {
                                    var67 = 0;
                                } else if (var67 > 127) {
                                    var67 = 127;
                                }
                                int var68 = (var8 + var66 & 0xFC00) + (var66 & 0x380) + var67;
                                var69 = class98.field1850[class211.method1507(96, (byte) 105, var68)];
                            } else {
                                var66 = -1;
                                var69 = 0;
                            }
                            int var70 = var11[var57][var58 + 1];
                            int var71 = var11[var57 + 1][var58 + 1];
                            int var72 = var11[var57 + 1][var58];
                            int var73 = var11[var57][var58];
                            if (var59 == 0) {
                                class100.method809(var12, var57, var58, 0, 0, -1, var61, var62, var63, var64, class211.method1507(var73, (byte) 107, var66), class211.method1507(var72, (byte) 25, var66), class211.method1507(var71, (byte) 34, var66), class211.method1507(var70, (byte) 37, var66), 0, 0, 0, 0, var69, 0);
                            } else {
                                byte var74 = class58.field959[var12][var57][var58];
                                int var75 = class234.field4180[var12][var57][var58] + 1;
                                class36 var76 = class60.method412(-117, var59 - 1);
                                int var77 = var76.field611;
                                if (var77 >= 0 && !class98.field1852.method672(32678, var77)) {
                                    var77 = -1;
                                }
                                int var78;
                                int var79;
                                if (var77 >= 0) {
                                    var78 = -1;
                                    var79 = class98.field1850[class171.method1274(class98.field1852.method669(arg1 ^ 0xFFFFFFE7, var77), -3, 96)];
                                } else if (var76.field619 == -1) {
                                    var79 = 0;
                                    var78 = -2;
                                } else {
                                    var78 = var76.field619;
                                    int var80 = (var78 & 0x7F) + var9;
                                    if (var80 < 0) {
                                        var80 = 0;
                                    } else if (var80 > 127) {
                                        var80 = 127;
                                    }
                                    int var81 = (var78 + var8 & 0xFC00) + (var78 & 0x380) + var80;
                                    var79 = class98.field1850[class171.method1274(var81, -3, 96)];
                                }
                                if (var76.field620 >= 0) {
                                    int var82 = var76.field620;
                                    int var83 = (var82 & 0x7F) + var9;
                                    if (var83 < 0) {
                                        var83 = 0;
                                    } else if (var83 > 127) {
                                        var83 = 127;
                                    }
                                    int var84 = (var8 + var82 & 0xFC00) + (var82 & 0x380) + var83;
                                    var79 = class98.field1850[class171.method1274(var84, -3, 96)];
                                }
                                class100.method809(var12, var57, var58, var75, var74, var77, var61, var62, var63, var64, class211.method1507(var73, (byte) 91, var66), class211.method1507(var72, (byte) 28, var66), class211.method1507(var71, (byte) 95, var66), class211.method1507(var70, (byte) 72, var66), class171.method1274(var78, arg1 + 102, var73), class171.method1274(var78, -3, var72), class171.method1274(var78, -3, var71), class171.method1274(var78, -3, var70), var69, var79);
                            }
                        }
                    }
                }
            }
            class116.field2206[var12] = null;
            class222.field4048[var12] = null;
            class234.field4180[var12] = null;
            class58.field959[var12] = null;
            class119.field2241[var12] = null;
        }
        class33.method193(-50, -10, -50);
        if (arg0) {
            return;
        }
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var50 = 0; var50 < 104; var50++) {
                if ((class123.field2344[1][var13][var50] & 0x2) == 2) {
                    class55.method381(var13, var50);
                }
            }
        }
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 <= 104; var15++) {
                for (int var16 = 0; var16 <= 104; var16++) {
                    if ((class233.field4164[var14][var16][var15] & 0x1) != 0) {
                        int var17 = var15;
                        int var18 = var15;
                        while (var17 > 0 && (class233.field4164[var14][var16][var17 - 1] & 0x1) != 0) {
                            var17--;
                        }
                        int var19 = var14;
                        int var20 = var14;
                        while (var18 < 104 && (class233.field4164[var14][var16][var18 + 1] & 0x1) != 0) {
                            var18++;
                        }
                        label350: while (var19 > 0) {
                            for (int var21 = var17; var21 <= var18; var21++) {
                                if ((class233.field4164[var19 - 1][var16][var21] & 0x1) == 0) {
                                    break label350;
                                }
                            }
                            var19--;
                        }
                        label339: while (var20 < 3) {
                            for (int var22 = var17; var22 <= var18; var22++) {
                                if ((class233.field4164[var20 + 1][var16][var22] & 0x1) == 0) {
                                    break label339;
                                }
                            }
                            var20++;
                        }
                        int var23 = (var18 + 1 - var17) * (var20 + 1 - var19);
                        if (var23 >= 8) {
                            short var24 = 240;
                            int var25 = class228.field4107[var20][var16][var17] - var24;
                            int var26 = class228.field4107[var19][var16][var17];
                            class215.method1528(1, var16 * 128, var16 * 128, var17 * 128, var18 * 128 + 128, var25, var26);
                            for (int var27 = var19; var27 <= var20; var27++) {
                                for (int var28 = var17; var28 <= var18; var28++) {
                                    class233.field4164[var27][var16][var28] = class7.method50(class233.field4164[var27][var16][var28], -2);
                                }
                            }
                        }
                    }
                    if ((class233.field4164[var14][var16][var15] & 0x2) != 0) {
                        int var29;
                        for (var29 = var16; var29 > 0 && (class233.field4164[var14][var29 - 1][var15] & 0x2) != 0; var29--) {
                        }
                        int var30 = var16;
                        int var31 = var14;
                        int var32 = var14;
                        while (var30 < 104 && (class233.field4164[var14][var30 + 1][var15] & 0x2) != 0) {
                            var30++;
                        }
                        label404: while (var31 > 0) {
                            for (int var33 = var29; var33 <= var30; var33++) {
                                if ((class233.field4164[var31 - 1][var33][var15] & 0x2) == 0) {
                                    break label404;
                                }
                            }
                            var31--;
                        }
                        label393: while (var32 < 3) {
                            for (int var34 = var29; var34 <= var30; var34++) {
                                if ((class233.field4164[var32 + 1][var34][var15] & 0x2) == 0) {
                                    break label393;
                                }
                            }
                            var32++;
                        }
                        int var35 = (var30 - (var29 - 1)) * (var32 + 1 - var31);
                        if (var35 >= 8) {
                            short var36 = 240;
                            int var37 = class228.field4107[var31][var29][var15];
                            int var38 = class228.field4107[var32][var29][var15] - var36;
                            class215.method1528(2, var29 * 128, var30 * 128 + 128, var15 * 128, var15 * 128, var38, var37);
                            for (int var39 = var31; var39 <= var32; var39++) {
                                for (int var40 = var29; var40 <= var30; var40++) {
                                    class233.field4164[var39][var40][var15] = class7.method50(class233.field4164[var39][var40][var15], -3);
                                }
                            }
                        }
                    }
                    if ((class233.field4164[var14][var16][var15] & 0x4) != 0) {
                        int var41 = var16;
                        int var42 = var16;
                        int var43 = var15;
                        int var44;
                        for (var44 = var15; var44 < 104 && (class233.field4164[var14][var16][var44 + 1] & 0x4) != 0; var44++) {
                        }
                        while (var43 > 0 && (class233.field4164[var14][var16][var43 - 1] & 0x4) != 0) {
                            var43--;
                        }
                        label458: while (var41 > 0) {
                            for (int var45 = var43; var45 <= var44; var45++) {
                                if ((class233.field4164[var14][var41 - 1][var45] & 0x4) == 0) {
                                    break label458;
                                }
                            }
                            var41--;
                        }
                        label447: while (var42 < 104) {
                            for (int var46 = var43; var46 <= var44; var46++) {
                                if ((class233.field4164[var14][var42 + 1][var46] & 0x4) == 0) {
                                    break label447;
                                }
                            }
                            var42++;
                        }
                        if ((var42 + 1 - var41) * (var44 + 1 - var43) >= 4) {
                            int var47 = class228.field4107[var14][var41][var43];
                            class215.method1528(4, var41 * 128, var42 * 128 + 128, var43 * 128, var44 * 128 + 128, var47, var47);
                            for (int var48 = var41; var48 <= var42; var48++) {
                                for (int var49 = var43; var49 <= var44; var49++) {
                                    class233.field4164[var14][var48][var49] = class7.method50(class233.field4164[var14][var48][var49], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(I)Lsa;")
    public final class137 method1745(int arg0) {
        field4518++;
        if (this.field4529 > 0 && this.field4512[this.field4529 - 1] != this.field4528) {
            class137 var2 = this.field4528;
            this.field4528 = var2.field2645;
            return var2;
        }
        if (arg0 != -32496) {
            this.method1745(-46);
        }
        while (this.field4527 > this.field4529) {
            class137 var3 = this.field4512[this.field4529++].field2645;
            if (this.field4512[this.field4529 - 1] != var3) {
                this.field4528 = var3.field2645;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)I")
    public final int method1746(boolean arg0) {
        if (!arg0) {
            field4526 = null;
        }
        field4514++;
        return this.field4527;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(B)Lsa;")
    public final class137 method1747(byte arg0) {
        this.field4529 = 0;
        if (arg0 <= 70) {
            field4515 = null;
        }
        field4509++;
        return this.method1745(-32496);
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(I)V")
    public class258(int arg0) {
        this.field4527 = arg0;
        this.field4512 = new class137[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class137 var3 = this.field4512[var2] = new class137();
            var3.field2648 = var3;
            var3.field2645 = var3;
        }
    }
}
