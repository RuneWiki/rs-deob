import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class161 extends class195 {

    @OriginalMember(owner = "client!nb", name = "bb", descriptor = "Lck;")
    private static class119 field2554 = class298.method1987((byte) 63, "Allocated memory");

    @OriginalMember(owner = "client!nb", name = "cb", descriptor = "Lck;")
    public static class119 field2555 = class298.method1987((byte) 92, "loginscreen");

    @OriginalMember(owner = "client!nb", name = "Y", descriptor = "Lck;")
    public static class119 field2551 = field2554;

    @OriginalMember(owner = "client!nb", name = "db", descriptor = "I")
    public static int field2556 = 0;

    @OriginalMember(owner = "client!nb", name = "U", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!nb", name = "V", descriptor = "I")
    public static int field2548;

    @OriginalMember(owner = "client!nb", name = "W", descriptor = "I")
    public static int field2549;

    @OriginalMember(owner = "client!nb", name = "Z", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!nb", name = "X", descriptor = "Lcf;")
    public static class174 field2550;

    @OriginalMember(owner = "client!nb", name = "eb", descriptor = "Lva;")
    public static class36 field2557;

    @OriginalMember(owner = "client!nb", name = "ab", descriptor = "[I")
    public static int[] field2553;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZI[Lnc;)V", line = 9)
    public static final void method1027(boolean arg0, int arg1, class266[] arg2) {
        field2549++;
        byte var3;
        if (arg0) {
            var3 = 1;
        } else {
            var3 = 4;
        }
        if (!arg0) {
            for (int var4 = 0; var4 < 4; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    for (int var6 = 0; var6 < 104; var6++) {
                        if ((class111.field1707[var4][var5][var6] & 0x1) == 1) {
                            int var7 = var4;
                            if ((class111.field1707[1][var5][var6] & 0x2) == 2) {
                                var7 = var4 - 1;
                            }
                            if (var7 >= 0) {
                                arg2[var7].method1753(var5, var6, (byte) 59);
                            }
                        }
                    }
                }
            }
            class68.field1057 += (int) (Math.random() * 5.0D) - 2;
            class164.field2584 += (int) (Math.random() * 5.0D) - 2;
            if (class164.field2584 < -16) {
                class164.field2584 = -16;
            }
            if (class164.field2584 > 16) {
                class164.field2584 = 16;
            }
            if (class68.field1057 < -8) {
                class68.field1057 = -8;
            }
            if (class68.field1057 > 8) {
                class68.field1057 = 8;
            }
        }
        int var8 = class68.field1057 >> 2 << 10;
        int[][] var9 = new int[104][104];
        int var10 = class164.field2584 >> 1;
        int[][] var11 = new int[104][104];
        if (arg1 <= 85) {
            field2553 = (int[]) null;
        }
        for (int var12 = 0; var12 < var3; var12++) {
            byte[][] var13 = class289.field4752[var12];
            if (class6.field146) {
                for (int var14 = 1; var14 < 103; var14++) {
                    for (int var15 = 1; var15 < 103; var15++) {
                        byte var16 = 74;
                        int var17 = (var13[var15][var14 + 1] >> 3) + (var13[var15][var14] >> 1) + ((var13[var15 + -1][var14] >> 2) - (-(var13[var15 + 1][var14] >> 3) - (var13[var15][var14 + -1] >> 2)));
                        var11[var15][var14] = var16 - var17;
                    }
                }
            } else {
                int var18 = (int) class178.field2847[0];
                int var19 = (int) class178.field2847[2];
                int var20 = (int) class178.field2847[1];
                int var21 = (int) Math.sqrt((double) (var18 * var18 + var20 * var20 + (var19 * var19)));
                int var22 = var21 * 1024 >> 8;
                for (int var23 = 1; var23 < 103; var23++) {
                    for (int var24 = 1; var24 < 103; var24++) {
                        int var25 = class57.field926[var12][var24 + 1][var23] - class57.field926[var12][var24 - 1][var23];
                        int var26 = class57.field926[var12][var24][var23 + 1] - class57.field926[var12][var24][var23 - 1];
                        int var27 = (int) Math.sqrt((double) (var25 * var25 + var26 * var26 + 65536));
                        byte var28 = 96;
                        int var29 = -65536 / var27;
                        int var30 = (var26 << 8) / var27;
                        int var31 = (var25 << 8) / var27;
                        int var32 = (var13[var24 - 1][var23] >> 2) + (var13[var24][var23] >> 1) + (var13[var24][var23 + 1] >> 3) + (var13[var24][var23 + -1] >> 2) + (var13[var24 - -1][var23] >> 3);
                        int var33 = (var18 * var31 - (-(var20 * var29) - var19 * var30)) / var22 + var28;
                        var11[var24][var23] = var33 - (int) ((float) var32 * 1.7F);
                    }
                }
            }
            for (int var34 = 0; var34 < 104; var34++) {
                class95.field1464[var34] = 0;
                class182.field2886[var34] = 0;
                class268.field4416[var34] = 0;
                class241.field3867[var34] = 0;
                class202.field3209[var34] = 0;
            }
            for (int var35 = -5; var35 < 104; var35++) {
                for (int var36 = 0; var36 < 104; var36++) {
                    int var37 = var35 + 5;
                    int var10002;
                    if (var37 < 104) {
                        int var38 = client.field1392[var12][var37][var36] & 0xFF;
                        if (var38 > 0) {
                            class247 var39 = class296.method1973(503157193, var38 - 1);
                            class95.field1464[var36] += var39.field3996;
                            class182.field2886[var36] += var39.field3994;
                            class268.field4416[var36] += var39.field4003;
                            class241.field3867[var36] += var39.field3998;
                            var10002 = class202.field3209[var36]++;
                        }
                    }
                    int var40 = var35 - 5;
                    if (var40 >= 0) {
                        int var41 = client.field1392[var12][var40][var36] & 0xFF;
                        if (var41 > 0) {
                            class247 var42 = class296.method1973(503157193, var41 - 1);
                            class95.field1464[var36] -= var42.field3996;
                            class182.field2886[var36] -= var42.field3994;
                            class268.field4416[var36] -= var42.field4003;
                            class241.field3867[var36] -= var42.field3998;
                            var10002 = class202.field3209[var36]--;
                        }
                    }
                }
                if (var35 >= 0) {
                    int var43 = 0;
                    int var44 = 0;
                    int var45 = 0;
                    int var46 = 0;
                    int var47 = 0;
                    for (int var48 = -5; var48 < 104; var48++) {
                        int var49 = var48 + 5;
                        if (var49 < 104) {
                            var47 += class241.field3867[var49];
                            var44 += class182.field2886[var49];
                            var43 += class95.field1464[var49];
                            var46 += class268.field4416[var49];
                            var45 += class202.field3209[var49];
                        }
                        int var50 = var48 - 5;
                        if (var50 >= 0) {
                            var47 -= class241.field3867[var50];
                            var45 -= class202.field3209[var50];
                            var46 -= class268.field4416[var50];
                            var43 -= class95.field1464[var50];
                            var44 -= class182.field2886[var50];
                        }
                        if (var48 >= 0 && var45 > 0) {
                            var9[var35][var48] = class49.method371(var43 * 256 / var47, var44 / var45, var46 / var45, (byte) -117);
                        }
                    }
                }
            }
            for (int var51 = 1; var51 < 103; var51++) {
                label758: for (int var52 = 1; var52 < 103; var52++) {
                    if (arg0 || class64.method479(301989888) || (class111.field1707[0][var51][var52] & 0x2) != 0 || (class111.field1707[var12][var51][var52] & 0x10) == 0 && class221.method1401(var51, var52, -124, var12) == class119.field1862) {
                        if (var12 < class88.field1354) {
                            class88.field1354 = var12;
                        }
                        int var53 = class135.field2190[var12][var51][var52] & 0xFF;
                        int var54 = client.field1392[var12][var51][var52] & 0xFF;
                        if (var54 > 0 || var53 > 0) {
                            int var55 = class57.field926[var12][var51][var52];
                            int var56 = class57.field926[var12][var51 + 1][var52 + 1];
                            int var57 = class57.field926[var12][var51][var52 + 1];
                            int var58 = class57.field926[var12][var51 + 1][var52];
                            if (var12 > 0) {
                                boolean var59 = true;
                                if (var54 == 0 && class220.field3525[var12][var51][var52] != 0) {
                                    var59 = false;
                                }
                                if (var53 > 0 && !class158.method1009((byte) -64, var53 - 1).field4935) {
                                    var59 = false;
                                }
                                if (var59 && var55 == var58 && var55 == var56 && var55 == var57) {
                                    class291.field4780[var12][var51][var52] = class156.method998(class291.field4780[var12][var51][var52], 2340);
                                }
                            }
                            int var60;
                            int var63;
                            if (var54 > 0) {
                                var60 = var9[var51][var52];
                                int var61 = (var60 & 0x7F) + var10;
                                if (var61 < 0) {
                                    var61 = 0;
                                } else if (var61 > 127) {
                                    var61 = 127;
                                }
                                int var62 = (var60 + var8 & 0xFC00) + var61 + (var60 & 0x380);
                                var63 = class284.field4687[class55.method405(96, var62, 12345678)];
                            } else {
                                var63 = 0;
                                var60 = -1;
                            }
                            int var64 = var11[var51][var52];
                            int var65 = var11[var51 + 1][var52];
                            int var66 = var11[var51 + 1][var52 + 1];
                            int var67 = var11[var51][var52 + 1];
                            if (var53 == 0) {
                                class255.method1638(var12, var51, var52, 0, 0, -1, var55, var58, var56, var57, class55.method405(var64, var60, 12345678), class55.method405(var65, var60, 12345678), class55.method405(var66, var60, 12345678), class55.method405(var67, var60, 12345678), 0, 0, 0, 0, var63, 0);
                                if (var12 > 0 && var60 != -1 && class296.method1973(503157193, var54 - 1).field4000) {
                                    class172.method1090(0, 0, true, false, var51, var52, var55 - class57.field926[0][var51][var52], -class57.field926[0][var51 + 1][var52] + var58, var56 - class57.field926[0][var51 + 1][var52 + 1], -class57.field926[0][var51][var52 + 1] + var57);
                                }
                                if (!arg0 && class37.field554 != null && var12 == 0) {
                                    for (int var83 = var51 - 1; var83 <= (var51 + 1); var83++) {
                                        for (int var84 = var52 - 1; var84 <= (var52 + 1); var84++) {
                                            if ((var51 != var83 || var52 != var84) && var83 >= 0 && var83 < 104 && var84 >= 0 && var84 < 104) {
                                                int var85 = class135.field2190[var12][var83][var84] & 0xFF;
                                                if (var85 != 0) {
                                                    class296 var86 = class158.method1009((byte) -57, var85 - 1);
                                                    if (var86.field4928 != -1 && class284.field4692.method133(var86.field4928, true) == 4) {
                                                        class37.field554[var51][var52] = (var86.field4936 << 24) + var86.field4919;
                                                        continue label758;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                byte var68 = class273.field4487[var12][var51][var52];
                                int var69 = class220.field3525[var12][var51][var52] + 1;
                                class296 var70 = class158.method1009((byte) -85, var53 - 1);
                                if (!arg0 && class37.field554 != null && var12 == 0) {
                                    if (var70.field4928 != -1 && class284.field4692.method133(var70.field4928, true) == 4) {
                                        class37.field554[var51][var52] = (var70.field4936 << 24) + var70.field4919;
                                    } else {
                                        label725: for (int var71 = var51 - 1; var71 <= var51 + 1; var71++) {
                                            for (int var72 = var52 - 1; var72 <= (var52 + 1); var72++) {
                                                if ((var51 != var71 || var52 != var72) && var71 >= 0 && var71 < 104 && var72 >= 0 && var72 < 104) {
                                                    int var73 = class135.field2190[var12][var71][var72] & 0xFF;
                                                    if (var73 != 0) {
                                                        class296 var74 = class158.method1009((byte) -59, var73 - 1);
                                                        if (var74.field4928 != -1 && class284.field4692.method133(var74.field4928, true) == 4) {
                                                            class37.field554[var51][var52] = (var74.field4936 << 24) + var74.field4919;
                                                            break label725;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                int var75 = var70.field4928;
                                if (var75 >= 0 && !class284.field4692.method131(var75, 64)) {
                                    var75 = -1;
                                }
                                int var76;
                                int var77;
                                if (var75 >= 0) {
                                    var76 = -1;
                                    var77 = class284.field4687[class25.method190(class284.field4692.method134(var75, 25505), 96, 2)];
                                } else if (var70.field4923 == -1) {
                                    var76 = -2;
                                    var77 = 0;
                                } else {
                                    var76 = var70.field4923;
                                    int var78 = (var76 & 0x7F) + var10;
                                    if (var78 < 0) {
                                        var78 = 0;
                                    } else if (var78 > 127) {
                                        var78 = 127;
                                    }
                                    int var79 = (var8 + var76 & 0xFC00) + (var76 & 0x380) + var78;
                                    var77 = class284.field4687[class25.method190(var79, 96, 2)];
                                }
                                if (var70.field4916 >= 0) {
                                    int var80 = var70.field4916;
                                    int var81 = (var80 & 0x7F) + var10;
                                    if (var81 < 0) {
                                        var81 = 0;
                                    } else if (var81 > 127) {
                                        var81 = 127;
                                    }
                                    int var82 = (var8 + var80 & 0xFC00) + var81 + (var80 & 0x380);
                                    var77 = class284.field4687[class25.method190(var82, 96, 2)];
                                }
                                class255.method1638(var12, var51, var52, var69, var68, var75, var55, var58, var56, var57, class55.method405(var64, var60, 12345678), class55.method405(var65, var60, 12345678), class55.method405(var66, var60, 12345678), class55.method405(var67, var60, 12345678), class25.method190(var76, var64, 2), class25.method190(var76, var65, 2), class25.method190(var76, var66, 2), class25.method190(var76, var67, 2), var63, var77);
                                if (var12 > 0) {
                                    class172.method1090(var69, var68, var76 == -2 || !var70.field4930, var60 == -1 || !class296.method1973(503157193, var54 - 1).field4000, var51, var52, var55 - class57.field926[0][var51][var52], -class57.field926[0][var51 - -1][var52] + var58, var56 - class57.field926[0][var51 + 1][var52 + 1], -class57.field926[0][var51][var52 - -1] + var57);
                                }
                            }
                        }
                    }
                }
            }
            if (!arg0) {
                for (int var87 = 1; var87 < 103; var87++) {
                    for (int var88 = 1; var88 < 103; var88++) {
                        if ((class111.field1707[0][var88][var87] & 0x2) == 0) {
                            class196.method1260(var12, var88, var87, class221.method1401(var88, var87, -127, var12));
                        } else {
                            class196.method1260(var12, var88, var87, 0);
                        }
                    }
                }
            }
            float[][] var89 = new float[105][105];
            float[][] var90 = new float[105][105];
            float[][] var91 = new float[105][105];
            int[][] var92 = class57.field926[var12];
            for (int var93 = 1; var93 <= 103; var93++) {
                for (int var94 = 1; var94 <= 103; var94++) {
                    int var95 = var92[var94][var93 + 1] - var92[var94][var93 - 1];
                    int var96 = var92[var94 + 1][var93] - var92[var94 - 1][var93];
                    float var97 = (float) Math.sqrt((double) (var95 * var95 + var96 * var96 + 65536));
                    var90[var94][var93] = (float) var96 / var97;
                    var89[var94][var93] = -256.0F / var97;
                    var91[var94][var93] = (float) var95 / var97;
                }
            }
            if (arg0) {
                class145[] var98 = class30.method228(var90, client.field1392[var12], 550005848, class135.field2190[var12], class37.field554, var91, class57.field926[var12], var12, var89, class128.field1966[0], class111.field1707, class220.field3525[var12], class273.field4487[var12], var9, var11);
                class157.method1005(var12, var98);
            } else {
                class145[] var99 = class30.method228(var90, client.field1392[var12], 550005848, class135.field2190[var12], (int[][]) null, var91, class57.field926[var12], var12, var89, (int[][]) null, class111.field1707, class220.field3525[var12], class273.field4487[var12], var9, var11);
                class145[] var100 = class189.method1199(class111.field1707, class220.field3525[var12], var91, class57.field926[var12], 3, class273.field4487[var12], var89, client.field1392[var12], var12, var90, class135.field2190[var12], var11);
                class145[] var101 = new class145[var99.length + var100.length];
                for (int var102 = 0; var102 < var99.length; var102++) {
                    var101[var102] = var99[var102];
                }
                for (int var103 = 0; var103 < var100.length; var103++) {
                    var101[var99.length + var103] = var100[var103];
                }
                class157.method1005(var12, var101);
                class46.method352((byte) -81, class220.field3525[var12], class135.field2190[var12], class273.field4487[var12], var12, var90, class125.field1934, var89, class57.field926[var12], class125.field1927, var91, client.field1392[var12]);
            }
            client.field1392[var12] = (byte[][]) null;
            class135.field2190[var12] = (byte[][]) null;
            class220.field3525[var12] = (byte[][]) null;
            class273.field4487[var12] = (byte[][]) null;
            class289.field4752[var12] = (byte[][]) null;
        }
        class269.method1786(-50, -10, -50);
        if (arg0) {
            return;
        }
        for (int var104 = 0; var104 < 104; var104++) {
            for (int var105 = 0; var105 < 104; var105++) {
                if ((class111.field1707[1][var104][var105] & 0x2) == 2) {
                    class269.method1787(var104, var105);
                }
            }
        }
        int var106 = 1;
        int var107 = 2;
        int var108 = 4;
        for (int var109 = 0; var109 < 4; var109++) {
            if (var109 > 0) {
                var107 <<= 0x3;
                var106 <<= 0x3;
                var108 <<= 0x3;
            }
            for (int var110 = 0; var110 <= var109; var110++) {
                for (int var111 = 0; var111 <= 104; var111++) {
                    for (int var112 = 0; var112 <= 104; var112++) {
                        if ((var106 & class291.field4780[var110][var112][var111]) != 0) {
                            int var113 = var111;
                            int var114;
                            for (var114 = var111; var114 < 104 && (class291.field4780[var110][var112][var114 + 1] & var106) != 0; var114++) {
                            }
                            while (var113 > 0 && (var106 & class291.field4780[var110][var112][var113 - 1]) != 0) {
                                var113--;
                            }
                            int var115 = var110;
                            int var116 = var110;
                            label455: while (var115 > 0) {
                                for (int var117 = var113; var117 <= var114; var117++) {
                                    if ((class291.field4780[var115 - 1][var112][var117] & var106) == 0) {
                                        break label455;
                                    }
                                }
                                var115--;
                            }
                            label444: while (var116 < var109) {
                                for (int var118 = var113; var118 <= var114; var118++) {
                                    if ((class291.field4780[var116 + 1][var112][var118] & var106) == 0) {
                                        break label444;
                                    }
                                }
                                var116++;
                            }
                            int var119 = (var114 + 1 - var113) * (var116 + 1 - var115);
                            if (var119 >= 8) {
                                short var120 = 240;
                                int var121 = class57.field926[var115][var112][var113];
                                int var122 = class57.field926[var116][var112][var113] - var120;
                                class263.method1705(var109, 1, var112 * 128, var112 * 128, var113 * 128, var114 * 128 + 128, var122, var121);
                                for (int var123 = var115; var123 <= var116; var123++) {
                                    for (int var124 = var113; var124 <= var114; var124++) {
                                        class291.field4780[var123][var112][var124] = class19.method151(class291.field4780[var123][var112][var124], ~var106);
                                    }
                                }
                            }
                        }
                        if ((var107 & class291.field4780[var110][var112][var111]) != 0) {
                            int var125;
                            for (var125 = var112; var125 > 0 && (var107 & class291.field4780[var110][var125 - 1][var111]) != 0; var125--) {
                            }
                            int var126 = var112;
                            int var127 = var110;
                            int var128 = var110;
                            while (var126 < 104 && (class291.field4780[var110][var126 + 1][var111] & var107) != 0) {
                                var126++;
                            }
                            label509: while (var127 > 0) {
                                for (int var129 = var125; var129 <= var126; var129++) {
                                    if ((var107 & class291.field4780[var127 - 1][var129][var111]) == 0) {
                                        break label509;
                                    }
                                }
                                var127--;
                            }
                            label498: while (var128 < var109) {
                                for (int var130 = var125; var130 <= var126; var130++) {
                                    if ((class291.field4780[var128 + 1][var130][var111] & var107) == 0) {
                                        break label498;
                                    }
                                }
                                var128++;
                            }
                            int var131 = (var126 + 1 - var125) * (var128 + 1 - var127);
                            if (var131 >= 8) {
                                short var132 = 240;
                                int var133 = class57.field926[var128][var125][var111] - var132;
                                int var134 = class57.field926[var127][var125][var111];
                                class263.method1705(var109, 2, var125 * 128, var126 * 128 + 128, var111 * 128, var111 * 128, var133, var134);
                                for (int var135 = var127; var135 <= var128; var135++) {
                                    for (int var136 = var125; var136 <= var126; var136++) {
                                        class291.field4780[var135][var136][var111] = class19.method151(class291.field4780[var135][var136][var111], ~var107);
                                    }
                                }
                            }
                        }
                        if ((class291.field4780[var110][var112][var111] & var108) != 0) {
                            int var137 = var112;
                            int var138 = var112;
                            int var139;
                            for (var139 = var111; var139 > 0 && (var108 & class291.field4780[var110][var112][var139 - 1]) != 0; var139--) {
                            }
                            int var140;
                            for (var140 = var111; var140 < 104 && (var108 & class291.field4780[var110][var112][var140 + 1]) != 0; var140++) {
                            }
                            label563: while (var138 > 0) {
                                for (int var141 = var139; var141 <= var140; var141++) {
                                    if ((class291.field4780[var110][var138 - 1][var141] & var108) == 0) {
                                        break label563;
                                    }
                                }
                                var138--;
                            }
                            label552: while (var137 < 104) {
                                for (int var142 = var139; var142 <= var140; var142++) {
                                    if ((class291.field4780[var110][var137 + 1][var142] & var108) == 0) {
                                        break label552;
                                    }
                                }
                                var137++;
                            }
                            if ((var137 - (var138 - 1)) * (var140 + 1 - var139) >= 4) {
                                int var143 = class57.field926[var110][var138][var139];
                                class263.method1705(var109, 4, var138 * 128, var137 * 128 + 128, var139 * 128, var140 * 128 + 128, var143, var143);
                                for (int var144 = var138; var144 <= var137; var144++) {
                                    for (int var145 = var139; var145 <= var140; var145++) {
                                        class291.field4780[var110][var144][var145] = class19.method151(class291.field4780[var110][var144][var145], ~var108);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "()V", line = 975)
    public class161() {
        super(1, true);
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(Z)V", line = 980)
    public static void method1028(boolean arg0) {
        field2553 = null;
        field2555 = null;
        field2550 = null;
        if (!arg0) {
            field2556 = 89;
        }
        field2551 = null;
        field2554 = null;
        field2557 = null;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IZ)[I", line = 1000)
    public final int[] method11(int arg0, boolean arg1) {
        if (arg1) {
            return (int[]) null;
        }
        int[] var3 = this.field3106.method924(100, arg0);
        field2548++;
        if (this.field3106.field2260) {
            int[][] var4 = this.method1256(arg0, 0, -10072);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            for (int var8 = 0; var8 < class157.field2504; var8++) {
                var3[var8] = (var5[var8] + var6[var8] + var7[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIIIIIII)V", line = 1050)
    public static final void method1029(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg9 != 3) {
            field2551 = (class119) null;
        }
        field2547++;
        if (arg1 == arg8 && arg4 == arg6 && arg2 == arg7 && arg0 == arg3) {
            class37.method290(arg0, arg4, arg2, arg1, 102, arg5);
            return;
        }
        int var10 = arg1 * 3;
        int var11 = arg1;
        int var12 = arg4;
        int var13 = arg8 * 3;
        int var14 = arg7 * 3;
        int var15 = arg3 * 3;
        int var16 = arg4 * 3;
        int var17 = var13 + arg2 - arg1 - var14;
        int var18 = arg6 * 3;
        int var19 = arg0 + var18 - arg4 - var15;
        int var20 = var14 + var10 - var13 - var13;
        int var21 = var16 + var15 - var18 - var18;
        int var22 = var13 - var10;
        int var23 = var18 - var16;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var24 * var25 >> 12;
            int var27 = var19 * var26;
            int var28 = var20 * var25;
            int var29 = var21 * var25;
            int var30 = var17 * var26;
            int var31 = var22 * var24;
            int var32 = (var28 + var30 + var31 >> 12) + arg1;
            int var33 = var23 * var24;
            int var34 = (var27 + var29 + var33 >> 12) + arg4;
            class37.method290(var34, var12, var32, var11, 121, arg5);
            var11 = var32;
            var12 = var34;
        }
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(B)Lfj;", line = 1135)
    public static final class3 method1030(byte arg0) {
        field2552++;
        class3 var1 = new class3(24);
        var1.method32(2, (byte) -99);
        var1.method32(class99.field1503, (byte) -99);
        var1.method32(class65.field1020 ? 1 : 0, (byte) -99);
        var1.method32(class29.field417 ? 1 : 0, (byte) -99);
        var1.method32(class198.field3168 ? 1 : 0, (byte) -99);
        var1.method32(class78.field1199 ? 1 : 0, (byte) -99);
        var1.method32(class281.field4640 ? 1 : 0, (byte) -99);
        if (arg0 != 82) {
            field2550 = (class174) null;
        }
        var1.method32(class129.field1979 ? 1 : 0, (byte) -99);
        var1.method32(class185.field2934 ? 1 : 0, (byte) -99);
        var1.method32(class224.field3598 ? 1 : 0, (byte) -99);
        var1.method32(class153.field2434, (byte) -99);
        var1.method32(class6.field146 ? 1 : 0, (byte) -99);
        var1.method32(class10.field184 ? 1 : 0, (byte) -99);
        var1.method32(class14.field226 ? 1 : 0, (byte) -99);
        var1.method32(class10.field183, (byte) -99);
        var1.method32(class244.field3943 ? 1 : 0, (byte) -99);
        var1.method32(class4.field120, (byte) -99);
        var1.method32(class78.field1205, (byte) -99);
        var1.method32(class184.field2916, (byte) -99);
        var1.method40(class27.field407, 92);
        var1.method40(class146.field2349, -110);
        return var1;
    }
}
