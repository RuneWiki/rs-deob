import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class90 {

    @OriginalMember(owner = "client!ic", name = "s", descriptor = "I")
    private int field1713 = -1;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    private int field1695 = 0;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "Ldc;")
    private class36 field1702 = new class36();

    @OriginalMember(owner = "client!ic", name = "D", descriptor = "Z")
    public boolean field1724 = false;

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "I")
    private int field1704;

    @OriginalMember(owner = "client!ic", name = "u", descriptor = "I")
    private int field1715;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "[Lq;")
    private class174[] field1699;

    @OriginalMember(owner = "client!ic", name = "C", descriptor = "[[[I")
    private int[][][] field1723;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "Lqe;")
    private static class179 field1698 = class206.method1380("Jan", (byte) -128);

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "Lqe;")
    private static class179 field1697 = class206.method1380("Sep", (byte) -127);

    @OriginalMember(owner = "client!ic", name = "x", descriptor = "Lqe;")
    private static class179 field1718 = class206.method1380("Aug", (byte) 116);

    @OriginalMember(owner = "client!ic", name = "v", descriptor = "Lqe;")
    private static class179 field1716 = class206.method1380("Jul", (byte) -127);

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "Lqe;")
    private static class179 field1701 = class206.method1380("Nov", (byte) 31);

    @OriginalMember(owner = "client!ic", name = "q", descriptor = "Lqe;")
    private static class179 field1711 = class206.method1380("Mar", (byte) -126);

    @OriginalMember(owner = "client!ic", name = "z", descriptor = "Lqe;")
    private static class179 field1720 = class206.method1380("Apr", (byte) -128);

    @OriginalMember(owner = "client!ic", name = "y", descriptor = "Lqe;")
    private static class179 field1719 = class206.method1380("New User", (byte) -128);

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "Lqe;")
    private static class179 field1703 = class206.method1380("Dec", (byte) 116);

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "Lqe;")
    private static class179 field1700 = class206.method1380("Oct", (byte) -126);

    @OriginalMember(owner = "client!ic", name = "p", descriptor = "Lqe;")
    private static class179 field1710 = class206.method1380("Feb", (byte) 104);

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "Lqe;")
    public static class179 field1705 = field1719;

    @OriginalMember(owner = "client!ic", name = "o", descriptor = "Lqe;")
    private static class179 field1709 = class206.method1380("May", (byte) -127);

    @OriginalMember(owner = "client!ic", name = "A", descriptor = "Lqe;")
    private static class179 field1721 = class206.method1380("Jun", (byte) -128);

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "[Lqe;")
    public static class179[] field1706 = new class179[] { field1698, field1710, field1711, field1720, field1709, field1721, field1716, field1718, field1697, field1700, field1701, field1703 };

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!ic", name = "t", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!ic", name = "w", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!ic", name = "B", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!ic", name = "r", descriptor = "Lod;")
    public static class156 field1712;

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "Leh;")
    public static class52 field1708;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "[[[B")
    public static byte[][][] field1696;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "([Ldg;I)V")
    public static final void method594(class40[] arg0, int arg1) {
        field1717++;
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var113 = 0; var113 < 104; var113++) {
                for (int var114 = 0; var114 < 104; var114++) {
                    if ((class9.field265[var2][var113][var114] & 0x1) == 1) {
                        int var115 = var2;
                        if ((class9.field265[1][var113][var114] & 0x2) == 2) {
                            var115 = var2 - 1;
                        }
                        if (var115 >= 0) {
                            arg0[var115].method259(var113, var114, -43);
                        }
                    }
                }
            }
        }
        class3.field40 += (int) (Math.random() * 5.0D) - 2;
        class19.field501 += (int) (Math.random() * 5.0D) - 2;
        if (class3.field40 < -16) {
            class3.field40 = -16;
        }
        if (class3.field40 > 16) {
            class3.field40 = 16;
        }
        if (class19.field501 < -8) {
            class19.field501 = -8;
        }
        if (class19.field501 > 8) {
            class19.field501 = 8;
        }
        int[][] var3 = new int[104][104];
        int var4 = class19.field501 >> 2 << 10;
        int[][] var5 = new int[104][104];
        int var6 = class3.field40 >> 1;
        for (int var7 = 0; var7 < 4; var7++) {
            short var50 = 768;
            byte var51 = 74;
            byte[][] var52 = class128.field2344[var7];
            int var53 = (int) Math.sqrt(5100.0D);
            int var54 = var50 * var53 >> 8;
            for (int var55 = 1; var55 < 103; var55++) {
                for (int var103 = 1; var103 < 103; var103++) {
                    int var105 = class194.field3619[var7][var103 + 1][var55] - class194.field3619[var7][var103 - 1][var55];
                    int var106 = class194.field3619[var7][var103][var55 + 1] - class194.field3619[var7][var103][var55 - 1];
                    int var107 = (int) Math.sqrt((double) (var106 * var106 + var105 * var105 + 65536));
                    int var108 = -65536 / var107;
                    int var109 = (var105 << 8) / var107;
                    int var110 = (var106 << 8) / var107;
                    int var111 = (var108 * -10 + var109 * -50 + var110 * -50) / var54 + var51;
                    int var112 = (var52[var103][var55 - 1] >> 2) + (var52[var103][var55 + 1] >> 3) + (var52[var103][var55] >> 1) + (var52[var103 - -1][var55] >> 3) + (var52[var103 - 1][var55] >> 2);
                    var3[var103][var55] = var111 - var112;
                }
            }
            for (int var56 = 0; var56 < 104; var56++) {
                class143.field2605[var56] = 0;
                class28.field619[var56] = 0;
                class195.field3628[var56] = 0;
                class175.field3135[var56] = 0;
                class119.field2238[var56] = 0;
            }
            for (int var57 = -5; var57 < 104; var57++) {
                for (int var88 = 0; var88 < 104; var88++) {
                    int var97 = var57 + 5;
                    int var10002;
                    if (var97 < 104) {
                        int var98 = class66.field1340[var7][var97][var88] & 0xFF;
                        if (var98 > 0) {
                            class64 var99 = class77.method494((byte) 16, var98 - 1);
                            class143.field2605[var88] += var99.field1323;
                            class28.field619[var88] += var99.field1335;
                            class195.field3628[var88] += var99.field1334;
                            class175.field3135[var88] += var99.field1324;
                            var10002 = class119.field2238[var88]++;
                        }
                    }
                    int var100 = var57 - 5;
                    if (var100 >= 0) {
                        int var101 = class66.field1340[var7][var100][var88] & 0xFF;
                        if (var101 > 0) {
                            class64 var102 = class77.method494((byte) 16, var101 - 1);
                            class143.field2605[var88] -= var102.field1323;
                            class28.field619[var88] -= var102.field1335;
                            class195.field3628[var88] -= var102.field1334;
                            class175.field3135[var88] -= var102.field1324;
                            var10002 = class119.field2238[var88]--;
                        }
                    }
                }
                if (var57 >= 0) {
                    int var89 = 0;
                    int var90 = 0;
                    int var91 = 0;
                    int var92 = 0;
                    int var93 = 0;
                    for (int var94 = -5; var94 < 104; var94++) {
                        int var95 = var94 + 5;
                        int var96 = var94 - 5;
                        if (var95 < 104) {
                            var92 += class28.field619[var95];
                            var90 += class175.field3135[var95];
                            var89 += class143.field2605[var95];
                            var91 += class195.field3628[var95];
                            var93 += class119.field2238[var95];
                        }
                        if (var96 >= 0) {
                            var92 -= class28.field619[var96];
                            var93 -= class119.field2238[var96];
                            var91 -= class195.field3628[var96];
                            var90 -= class175.field3135[var96];
                            var89 -= class143.field2605[var96];
                        }
                        if (var94 >= 0 && var93 > 0) {
                            var5[var57][var94] = class67.method436(var91 / var93, var89 * 256 / var90, 217, var92 / var93);
                        }
                    }
                }
            }
            for (int var58 = 1; var58 < 103; var58++) {
                for (int var61 = 1; var61 < 103; var61++) {
                    if (!class180.field3307 || (class9.field265[0][var58][var61] & 0x2) != 0 || (class9.field265[var7][var58][var61] & 0x10) == 0 && class113.method730(var58, (byte) 121, var7, var61) == class182.field3364) {
                        if (var7 < class46.field1010) {
                            class46.field1010 = var7;
                        }
                        int var62 = class14.field342[var7][var58][var61] & 0xFF;
                        int var63 = class66.field1340[var7][var58][var61] & 0xFF;
                        if (var63 > 0 || var62 > 0) {
                            int var64 = class194.field3619[var7][var58 + 1][var61];
                            int var65 = class194.field3619[var7][var58 + 1][var61 + 1];
                            int var66 = class194.field3619[var7][var58][var61 + 1];
                            int var67 = class194.field3619[var7][var58][var61];
                            if (var7 > 0) {
                                boolean var68 = true;
                                if (var63 == 0 && class10.field286[var7][var58][var61] != 0) {
                                    var68 = false;
                                }
                                if (var62 > 0 && !class201.method1333((byte) 118, var62 - 1).field1816) {
                                    var68 = false;
                                }
                                if (var68 && var64 == var67 && var65 == var67 && var66 == var67) {
                                    class70.field1408[var7][var58][var61] = class125.method790(class70.field1408[var7][var58][var61], 2340);
                                }
                            }
                            int var69;
                            int var72;
                            if (var63 > 0) {
                                var69 = var5[var58][var61];
                                int var70 = (var69 & 0x7F) + var6;
                                if (var70 < 0) {
                                    var70 = 0;
                                } else if (var70 > 127) {
                                    var70 = 127;
                                }
                                int var71 = (var4 + var69 & 0xFC00) + (var69 & 0x380) + var70;
                                var72 = class27.field602[class3.method20(var71, 96, -14053)];
                            } else {
                                var72 = 0;
                                var69 = -1;
                            }
                            int var73 = var3[var58][var61];
                            int var74 = var3[var58 + 1][var61];
                            int var75 = var3[var58 + 1][var61 + 1];
                            int var76 = var3[var58][var61 + 1];
                            if (var62 == 0) {
                                class180.method1185(var7, var58, var61, 0, 0, -1, var67, var64, var65, var66, class3.method20(var69, var73, -14053), class3.method20(var69, var74, -14053), class3.method20(var69, var75, -14053), class3.method20(var69, var76, -14053), 0, 0, 0, 0, var72, 0);
                            } else {
                                int var77 = class10.field286[var7][var58][var61] + 1;
                                byte var78 = class78.field1510[var7][var58][var61];
                                class96 var79 = class201.method1333((byte) -11, var62 - 1);
                                int var80 = var79.field1806;
                                if (var80 >= 0 && !class27.field597.method514(var80, -20090)) {
                                    var80 = -1;
                                }
                                int var81;
                                int var82;
                                if (var80 >= 0) {
                                    var81 = -1;
                                    var82 = class27.field602[class146.method939(class27.field597.method515(-117, var80), 497, 96)];
                                } else if (var79.field1810 == -1) {
                                    var81 = -2;
                                    var82 = 0;
                                } else {
                                    var81 = var79.field1810;
                                    int var83 = (var81 & 0x7F) + var6;
                                    if (var83 < 0) {
                                        var83 = 0;
                                    } else if (var83 > 127) {
                                        var83 = 127;
                                    }
                                    int var84 = (var4 + var81 & 0xFC00) + (var81 & 0x380) + var83;
                                    var82 = class27.field602[class146.method939(var84, 497, 96)];
                                }
                                if (var79.field1815 >= 0) {
                                    int var85 = var79.field1815;
                                    int var86 = (var85 & 0x7F) + var6;
                                    if (var86 < 0) {
                                        var86 = 0;
                                    } else if (var86 > 127) {
                                        var86 = 127;
                                    }
                                    int var87 = (var4 + var85 & 0xFC00) + (var85 & 0x380) + var86;
                                    var82 = class27.field602[class146.method939(var87, 497, 96)];
                                }
                                class180.method1185(var7, var58, var61, var77, var78, var80, var67, var64, var65, var66, class3.method20(var69, var73, -14053), class3.method20(var69, var74, -14053), class3.method20(var69, var75, -14053), class3.method20(var69, var76, -14053), class146.method939(var81, 497, var73), class146.method939(var81, 497, var74), class146.method939(var81, 497, var75), class146.method939(var81, 497, var76), var72, var82);
                            }
                        }
                    }
                }
            }
            for (int var59 = 1; var59 < 103; var59++) {
                for (int var60 = 1; var60 < 103; var60++) {
                    class171.method1086(var7, var60, var59, class113.method730(var60, (byte) 124, var7, var59));
                }
            }
            class66.field1340[var7] = null;
            class14.field342[var7] = null;
            class10.field286[var7] = null;
            class78.field1510[var7] = null;
            class128.field2344[var7] = null;
        }
        if (arg1 >= -33) {
            field1712 = null;
        }
        class124.method781(-50, -10, -50);
        for (int var8 = 0; var8 < 104; var8++) {
            for (int var49 = 0; var49 < 104; var49++) {
                if ((class9.field265[1][var8][var49] & 0x2) == 2) {
                    class165.method1059(var8, var49);
                }
            }
        }
        int var9 = 1;
        int var10 = 2;
        int var11 = 4;
        for (int var12 = 0; var12 < 4; var12++) {
            if (var12 > 0) {
                var10 <<= 0x3;
                var11 <<= 0x3;
                var9 <<= 0x3;
            }
            for (int var13 = 0; var13 <= var12; var13++) {
                for (int var14 = 0; var14 <= 104; var14++) {
                    for (int var15 = 0; var15 <= 104; var15++) {
                        if ((var9 & class70.field1408[var13][var15][var14]) != 0) {
                            int var16;
                            for (var16 = var14; var16 > 0 && (class70.field1408[var13][var15][var16 - 1] & var9) != 0; var16--) {
                            }
                            int var17 = var14;
                            int var18 = var13;
                            int var19 = var13;
                            while (var17 < 104 && (class70.field1408[var13][var15][var17 + 1] & var9) != 0) {
                                var17++;
                            }
                            label359: while (var19 > 0) {
                                for (int var20 = var16; var20 <= var17; var20++) {
                                    if ((class70.field1408[var19 - 1][var15][var20] & var9) == 0) {
                                        break label359;
                                    }
                                }
                                var19--;
                            }
                            label348: while (var18 < var12) {
                                for (int var21 = var16; var21 <= var17; var21++) {
                                    if ((var9 & class70.field1408[var18 + 1][var15][var21]) == 0) {
                                        break label348;
                                    }
                                }
                                var18++;
                            }
                            int var22 = (var18 + 1 - var19) * (var17 + 1 - var16);
                            if (var22 >= 8) {
                                short var23 = 240;
                                int var24 = class194.field3619[var18][var15][var16] - var23;
                                int var25 = class194.field3619[var19][var15][var16];
                                class108.method706(var12, 1, var15 * 128, var15 * 128, var16 * 128, var17 * 128 + 128, var24, var25);
                                for (int var26 = var19; var26 <= var18; var26++) {
                                    for (int var27 = var16; var27 <= var17; var27++) {
                                        class70.field1408[var26][var15][var27] = class107.method696(class70.field1408[var26][var15][var27], ~var9);
                                    }
                                }
                            }
                        }
                        if ((class70.field1408[var13][var15][var14] & var10) != 0) {
                            int var28;
                            for (var28 = var15; var28 > 0 && (var10 & class70.field1408[var13][var28 - 1][var14]) != 0; var28--) {
                            }
                            int var29;
                            for (var29 = var15; var29 < 104 && (class70.field1408[var13][var29 + 1][var14] & var10) != 0; var29++) {
                            }
                            int var30 = var13;
                            int var31;
                            label413: for (var31 = var13; var31 > 0; var31--) {
                                for (int var32 = var28; var32 <= var29; var32++) {
                                    if ((class70.field1408[var31 - 1][var32][var14] & var10) == 0) {
                                        break label413;
                                    }
                                }
                            }
                            label402: while (var12 > var30) {
                                for (int var33 = var28; var33 <= var29; var33++) {
                                    if ((var10 & class70.field1408[var30 + 1][var33][var14]) == 0) {
                                        break label402;
                                    }
                                }
                                var30++;
                            }
                            int var34 = (var29 + 1 - var28) * (var30 + 1 - var31);
                            if (var34 >= 8) {
                                short var35 = 240;
                                int var36 = class194.field3619[var30][var28][var14] - var35;
                                int var37 = class194.field3619[var31][var28][var14];
                                class108.method706(var12, 2, var28 * 128, var29 * 128 + 128, var14 * 128, var14 * 128, var36, var37);
                                for (int var38 = var31; var38 <= var30; var38++) {
                                    for (int var39 = var28; var39 <= var29; var39++) {
                                        class70.field1408[var38][var39][var14] = class107.method696(class70.field1408[var38][var39][var14], ~var10);
                                    }
                                }
                            }
                        }
                        if ((class70.field1408[var13][var15][var14] & var11) != 0) {
                            int var40 = var15;
                            int var41 = var15;
                            int var42;
                            for (var42 = var14; var42 > 0 && (var11 & class70.field1408[var13][var15][var42 - 1]) != 0; var42--) {
                            }
                            int var43;
                            for (var43 = var14; var43 < 104 && (class70.field1408[var13][var15][var43 + 1] & var11) != 0; var43++) {
                            }
                            label468: while (var40 > 0) {
                                for (int var44 = var42; var44 <= var43; var44++) {
                                    if ((var11 & class70.field1408[var13][var40 - 1][var44]) == 0) {
                                        break label468;
                                    }
                                }
                                var40--;
                            }
                            label457: while (var41 < 104) {
                                for (int var45 = var42; var45 <= var43; var45++) {
                                    if ((var11 & class70.field1408[var13][var41 + 1][var45]) == 0) {
                                        break label457;
                                    }
                                }
                                var41++;
                            }
                            if ((var41 + 1 - var40) * (var43 + 1 - var42) >= 4) {
                                int var46 = class194.field3619[var13][var40][var42];
                                class108.method706(var12, 4, var40 * 128, var41 * 128 + 128, var42 * 128, var43 * 128 + 128, var46, var46);
                                for (int var47 = var40; var47 <= var41; var47++) {
                                    for (int var48 = var42; var48 <= var43; var48++) {
                                        class70.field1408[var13][var47][var48] = class107.method696(class70.field1408[var13][var47][var48], ~var11);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
    public final void method595(int arg0) {
        field1722++;
        if (arg0 != 1) {
            method594(null, 10);
        }
        for (int var2 = 0; var2 < this.field1704; var2++) {
            this.field1723[var2][0] = null;
            this.field1723[var2][1] = null;
            this.field1723[var2][2] = null;
            this.field1723[var2] = null;
        }
        this.field1723 = null;
        this.field1699 = null;
        this.field1702.method236((byte) 40);
        this.field1702 = null;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)[[[I")
    public final int[][][] method596(int arg0) {
        field1714++;
        if (this.field1715 != this.field1704) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (arg0 != 11443) {
            this.field1715 = -74;
        }
        for (int var2 = 0; var2 < this.field1704; var2++) {
            this.field1699[var2] = class223.field4114;
        }
        return this.field1723;
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)V")
    public static void method597(int arg0) {
        field1698 = null;
        field1697 = null;
        field1721 = null;
        field1701 = null;
        field1716 = null;
        field1718 = null;
        field1720 = null;
        field1706 = null;
        field1709 = null;
        field1700 = null;
        field1696 = null;
        field1711 = null;
        field1719 = null;
        field1710 = null;
        field1703 = null;
        field1705 = null;
        if (arg0 == 31840) {
            field1708 = null;
            field1712 = null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BI)[[I")
    public final int[][] method598(byte arg0, int arg1) {
        field1707++;
        if (arg0 > -27) {
            method597(75);
        }
        if (this.field1715 == this.field1704) {
            this.field1724 = this.field1699[arg1] == null;
            this.field1699[arg1] = class223.field4114;
            return this.field1723[arg1];
        } else if (this.field1704 == 1) {
            this.field1724 = this.field1713 != arg1;
            this.field1713 = arg1;
            return this.field1723[0];
        } else {
            class174 var3 = this.field1699[arg1];
            if (var3 == null) {
                this.field1724 = true;
                if (this.field1704 > this.field1695) {
                    var3 = new class174(arg1, this.field1695);
                    this.field1695++;
                } else {
                    class174 var4 = (class174) this.field1702.method234((byte) 119);
                    var3 = new class174(arg1, var4.field3116);
                    this.field1699[var4.field3109] = null;
                    var4.method592((byte) -128);
                }
                this.field1699[arg1] = var3;
            } else {
                this.field1724 = false;
            }
            this.field1702.method233(var3, false);
            return this.field1723[var3.field3116];
        }
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(III)V")
    public class90(int arg0, int arg1, int arg2) {
        this.field1704 = arg0;
        this.field1715 = arg1;
        this.field1699 = new class174[this.field1715];
        this.field1723 = new int[this.field1704][3][arg2];
    }
}
