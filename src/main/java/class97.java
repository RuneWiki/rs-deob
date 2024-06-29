import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class97 extends class99 {

    @OriginalMember(owner = "client!o", name = "x", descriptor = "[I")
    public int[] field2262 = new int[1];

    @OriginalMember(owner = "client!o", name = "v", descriptor = "[I")
    public int[] field2260 = new int[] { -1 };

    @OriginalMember(owner = "client!o", name = "C", descriptor = "Lr;")
    public static class118 field2267 = class153.method1136(112, "<col=80ff00>");

    @OriginalMember(owner = "client!o", name = "w", descriptor = "Lge;")
    public static class47 field2261 = new class47(20);

    @OriginalMember(owner = "client!o", name = "F", descriptor = "Lr;")
    public static class118 field2270 = class153.method1136(108, "<)4col> x");

    @OriginalMember(owner = "client!o", name = "E", descriptor = "Lr;")
    public static class118 field2269 = class153.method1136(99, "Lade)3)3)3");

    @OriginalMember(owner = "client!o", name = "H", descriptor = "Lr;")
    private static class118 field2272 = class153.method1136(81, "Please remove ");

    @OriginalMember(owner = "client!o", name = "I", descriptor = "Lr;")
    public static class118 field2273 = field2272;

    @OriginalMember(owner = "client!o", name = "D", descriptor = "Lr;")
    public static class118 field2268 = field2272;

    @OriginalMember(owner = "client!o", name = "J", descriptor = "Lr;")
    private static class118 field2274 = class153.method1136(98, "Could not complete login)3");

    @OriginalMember(owner = "client!o", name = "G", descriptor = "Lr;")
    public static class118 field2271 = field2274;

    @OriginalMember(owner = "client!o", name = "y", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!o", name = "z", descriptor = "I")
    public static int field2264;

    @OriginalMember(owner = "client!o", name = "A", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!o", name = "B", descriptor = "I")
    public static int field2266;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "(B)V")
    public static final void method755(byte arg0) {
        int var1 = -28 % ((58 - arg0) / 43);
        class74.field1830 = null;
        class153.field3467 = null;
        field2263++;
        class54.field1293 = null;
        class127.field2904 = null;
        class56.field1313 = null;
        class65.field1488 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(III)I")
    public static final int method756(int arg0, int arg1, int arg2) {
        field2266++;
        long var3 = (long) ((arg0 << 16) + arg2);
        if (class151.field3374 != null && class151.field3374.field2295 == var3) {
            return arg1 == -838321904 ? class53.field1265.field2404 * 99 / (class53.field1265.field2405.length - class151.field3374.field788) + 1 : -13;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I[Lsc;Lwa;)V")
    public static final void method757(int arg0, class128[] arg1, class154 arg2) {
        field2265++;
        for (int var3 = arg0; var3 < 4; var3++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((class33.field830[var3][var110][var111] & 0x1) == 1) {
                        int var112 = var3;
                        if ((class33.field830[1][var110][var111] & 0x2) == 2) {
                            var112 = var3 - 1;
                        }
                        if (var112 >= 0) {
                            arg1[var112].method1002(var111, var110, (byte) -43);
                        }
                    }
                }
            }
        }
        class108.field2515 += (int) (Math.random() * 5.0D) - 2;
        if (class108.field2515 < -16) {
            class108.field2515 = -16;
        }
        class103.field2384 += (int) (Math.random() * 5.0D) - 2;
        if (class108.field2515 > 16) {
            class108.field2515 = 16;
        }
        if (class103.field2384 < -8) {
            class103.field2384 = -8;
        }
        if (class103.field2384 > 8) {
            class103.field2384 = 8;
        }
        for (int var4 = 0; var4 < 4; var4++) {
            byte[][] var47 = class22.field541[var4];
            int var48 = (int) Math.sqrt(5100.0D);
            int var49 = var48 * 768 >> 8;
            for (int var50 = 1; var50 < 103; var50++) {
                for (int var101 = 1; var101 < 103; var101++) {
                    int var102 = class72.field1668[var4][var101 + 1][var50] - class72.field1668[var4][var101 - 1][var50];
                    int var103 = class72.field1668[var4][var101][var50 + 1] - class72.field1668[var4][var101][var50 - 1];
                    int var104 = (int) Math.sqrt((double) (var103 * var103 + var102 * var102 + 65536));
                    int var105 = (var102 << 8) / var104;
                    int var106 = 65536 / var104;
                    int var107 = (var47[var101 - 1][var50] >> 2) + (var47[var101][var50 - 1] >> 2) + (var47[var101][var50] >> 1) - (-(var47[var101][var50 + 1] >> 3) - (var47[var101 + 1][var50] >> 3));
                    int var108 = (var103 << 8) / var104;
                    int var109 = (var108 * -50 + var105 * -50 + var106 * -10) / var49 + 96;
                    class56.field1337[var101][var50] = var109 - var107;
                }
            }
            for (int var51 = 0; var51 < 104; var51++) {
                class153.field3468[var51] = 0;
                class77.field1874[var51] = 0;
                class148.field3332[var51] = 0;
                class35.field895[var51] = 0;
                class149.field3349[var51] = 0;
            }
            for (int var52 = -5; var52 < 109; var52++) {
                for (int var55 = 0; var55 < 104; var55++) {
                    int var95 = var52 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < 104) {
                        int var96 = class82.field1977[var4][var95][var55] & 0xFF;
                        if (var96 > 0) {
                            class36 var97 = class84.method683(1, var96 - 1);
                            class153.field3468[var55] += var97.field898;
                            class77.field1874[var55] += var97.field901;
                            class148.field3332[var55] += var97.field908;
                            class35.field895[var55] += var97.field899;
                            var10002 = class149.field3349[var55]++;
                        }
                    }
                    int var98 = var52 - 5;
                    if (var98 >= 0 && var98 < 104) {
                        int var99 = class82.field1977[var4][var98][var55] & 0xFF;
                        if (var99 > 0) {
                            class36 var100 = class84.method683(1, var99 - 1);
                            class153.field3468[var55] -= var100.field898;
                            class77.field1874[var55] -= var100.field901;
                            class148.field3332[var55] -= var100.field908;
                            class35.field895[var55] -= var100.field899;
                            var10002 = class149.field3349[var55]--;
                        }
                    }
                }
                if (var52 >= 1 && var52 < 103) {
                    int var56 = 0;
                    int var57 = 0;
                    int var58 = 0;
                    int var59 = 0;
                    int var60 = 0;
                    for (int var61 = -5; var61 < 109; var61++) {
                        int var62 = var61 + 5;
                        if (var62 >= 0 && var62 < 104) {
                            var58 += class77.field1874[var62];
                            var56 += class153.field3468[var62];
                            var57 += class35.field895[var62];
                            var59 += class148.field3332[var62];
                            var60 += class149.field3349[var62];
                        }
                        int var63 = var61 - 5;
                        if (var63 >= 0 && var63 < 104) {
                            var59 -= class148.field3332[var63];
                            var60 -= class149.field3349[var63];
                            var56 -= class153.field3468[var63];
                            var58 -= class77.field1874[var63];
                            var57 -= class35.field895[var63];
                        }
                        if (var61 >= 1 && var61 < 103 && (!class68.field1582 || (class33.field830[0][var52][var61] & 0x2) != 0 || (class33.field830[var4][var52][var61] & 0x10) == 0 && class31.method266((byte) 104, var4, var52, var61) == class62.field1441)) {
                            if (class39.field944 > var4) {
                                class39.field944 = var4;
                            }
                            int var64 = class82.field1977[var4][var52][var61] & 0xFF;
                            int var65 = class128.field2933[var4][var52][var61] & 0xFF;
                            if (var64 > 0 || var65 > 0) {
                                int var66 = class72.field1668[var4][var52][var61];
                                int var67 = class72.field1668[var4][var52 + 1][var61];
                                int var68 = class72.field1668[var4][var52 + 1][var61 + 1];
                                int var69 = class72.field1668[var4][var52][var61 + 1];
                                int var70 = class56.field1337[var52][var61];
                                int var71 = class56.field1337[var52 + 1][var61];
                                int var72 = class56.field1337[var52 + 1][var61 + 1];
                                int var73 = -1;
                                int var74 = -1;
                                int var75 = class56.field1337[var52][var61 + 1];
                                if (var64 > 0) {
                                    int var76 = var56 * 256 / var57;
                                    int var77 = var58 / var60;
                                    int var78 = var59 / var60;
                                    var73 = class53.method483(var78, var76, (byte) -27, var77);
                                    int var79 = class103.field2384 + var76 & 0xFF;
                                    int var80 = class108.field2515 + var78;
                                    if (var80 < 0) {
                                        var80 = 0;
                                    } else if (var80 > 255) {
                                        var80 = 255;
                                    }
                                    var74 = class53.method483(var80, var79, (byte) -27, var77);
                                }
                                if (var4 > 0) {
                                    boolean var81 = true;
                                    if (var64 == 0 && class87.field2100[var4][var52][var61] != 0) {
                                        var81 = false;
                                    }
                                    if (var65 > 0 && !class64.method561(true, var65 - 1).field1393) {
                                        var81 = false;
                                    }
                                    if (var81 && var66 == var67 && var66 == var68 && var66 == var69) {
                                        class68.field1564[var4][var52][var61] = class19.method178(class68.field1564[var4][var52][var61], 2340);
                                    }
                                }
                                int var82 = 0;
                                if (var74 != -1) {
                                    var82 = class58.field1344[class75.method634(var74, 96, 12345678)];
                                }
                                if (var65 == 0) {
                                    arg2.method1148(var4, var52, var61, 0, 0, -1, var66, var67, var68, var69, class75.method634(var73, var70, arg0 ^ 0xBC614E), class75.method634(var73, var71, 12345678), class75.method634(var73, var72, 12345678), class75.method634(var73, var75, 12345678), 0, 0, 0, 0, var82, 0);
                                } else {
                                    int var83 = class87.field2100[var4][var52][var61] + 1;
                                    byte var84 = class54.field1273[var4][var52][var61];
                                    class60 var85 = class64.method561(true, var65 - 1);
                                    int var86 = var85.field1392;
                                    if (var86 >= 0 && !class58.field1351.method657(var86, arg0 + 126)) {
                                        var86 = -1;
                                    }
                                    int var87;
                                    int var90;
                                    if (var86 >= 0) {
                                        var90 = class58.field1351.method649((byte) 77, var86);
                                        var87 = -1;
                                    } else if (var85.field1406 == 16711935) {
                                        var86 = -1;
                                        var90 = -2;
                                        var87 = -2;
                                    } else {
                                        var87 = class53.method483(var85.field1399, var85.field1400, (byte) -27, var85.field1404);
                                        int var88 = var85.field1400 + class103.field2384 & 0xFF;
                                        int var89 = class108.field2515 + var85.field1399;
                                        if (var89 < 0) {
                                            var89 = 0;
                                        } else if (var89 > 255) {
                                            var89 = 255;
                                        }
                                        var90 = class53.method483(var89, var88, (byte) -27, var85.field1404);
                                    }
                                    int var91 = 0;
                                    if (var90 != -2) {
                                        var91 = class58.field1344[class64.method560(var90, (byte) -124, 96)];
                                    }
                                    if (var85.field1396 != -1) {
                                        int var92 = class103.field2384 + var85.field1391 & 0xFF;
                                        int var93 = class108.field2515 + var85.field1389;
                                        if (var93 < 0) {
                                            var93 = 0;
                                        } else if (var93 > 255) {
                                            var93 = 255;
                                        }
                                        int var94 = class53.method483(var93, var92, (byte) -27, var85.field1394);
                                        var91 = class58.field1344[class64.method560(var94, (byte) -113, 96)];
                                    }
                                    arg2.method1148(var4, var52, var61, var83, var84, var86, var66, var67, var68, var69, class75.method634(var73, var70, arg0 + 12345678), class75.method634(var73, var71, 12345678), class75.method634(var73, var72, 12345678), class75.method634(var73, var75, 12345678), class64.method560(var87, (byte) -128, var70), class64.method560(var87, (byte) -127, var71), class64.method560(var87, (byte) -128, var72), class64.method560(var87, (byte) -127, var75), var82, var91);
                                }
                            }
                        }
                    }
                }
            }
            for (int var53 = 1; var53 < 103; var53++) {
                for (int var54 = 1; var54 < 103; var54++) {
                    arg2.method1164(var4, var54, var53, class31.method266((byte) 122, var4, var54, var53));
                }
            }
            class82.field1977[var4] = null;
            class128.field2933[var4] = null;
            class87.field2100[var4] = null;
            class54.field1273[var4] = null;
            class22.field541[var4] = null;
        }
        arg2.method1163(-50, -10, -50);
        for (int var5 = 0; var5 < 104; var5++) {
            for (int var46 = 0; var46 < 104; var46++) {
                if ((class33.field830[1][var5][var46] & 0x2) == 2) {
                    arg2.method1161(var5, var46);
                }
            }
        }
        int var6 = 1;
        int var7 = 2;
        int var8 = 4;
        for (int var9 = 0; var9 < 4; var9++) {
            if (var9 > 0) {
                var6 <<= 0x3;
                var8 <<= 0x3;
                var7 <<= 0x3;
            }
            for (int var10 = 0; var10 <= var9; var10++) {
                for (int var11 = 0; var11 <= 104; var11++) {
                    for (int var12 = 0; var12 <= 104; var12++) {
                        if ((var6 & class68.field1564[var10][var12][var11]) != 0) {
                            int var13 = var11;
                            int var14 = var11;
                            int var15 = var10;
                            while (var14 > 0 && (var6 & class68.field1564[var10][var12][var14 - 1]) != 0) {
                                var14--;
                            }
                            while (var13 < 104 && (class68.field1564[var10][var12][var13 + 1] & var6) != 0) {
                                var13++;
                            }
                            int var16;
                            label356: for (var16 = var10; var16 > 0; var16--) {
                                for (int var17 = var14; var17 <= var13; var17++) {
                                    if ((class68.field1564[var16 - 1][var12][var17] & var6) == 0) {
                                        break label356;
                                    }
                                }
                            }
                            label345: while (var15 < var9) {
                                for (int var18 = var14; var18 <= var13; var18++) {
                                    if ((var6 & class68.field1564[var15 + 1][var12][var18]) == 0) {
                                        break label345;
                                    }
                                }
                                var15++;
                            }
                            int var19 = (var13 + 1 - var14) * (var15 + 1 - var16);
                            if (var19 >= 8) {
                                short var20 = 240;
                                int var21 = class72.field1668[var15][var12][var14] - var20;
                                int var22 = class72.field1668[var16][var12][var14];
                                class154.method1153(var9, 1, var12 * 128, var12 * 128, var14 * 128, var13 * 128 + 128, var21, var22);
                                for (int var23 = var16; var23 <= var15; var23++) {
                                    for (int var24 = var14; var24 <= var13; var24++) {
                                        class68.field1564[var23][var12][var24] = class79.method669(class68.field1564[var23][var12][var24], ~var6);
                                    }
                                }
                            }
                        }
                        if ((var7 & class68.field1564[var10][var12][var11]) != 0) {
                            int var25 = var12;
                            int var26 = var12;
                            int var27 = var10;
                            int var28 = var10;
                            while (var25 < 104 && (class68.field1564[var10][var25 + 1][var11] & var7) != 0) {
                                var25++;
                            }
                            while (var26 > 0 && (class68.field1564[var10][var26 - 1][var11] & var7) != 0) {
                                var26--;
                            }
                            label410: while (var27 > 0) {
                                for (int var29 = var26; var29 <= var25; var29++) {
                                    if ((var7 & class68.field1564[var27 - 1][var29][var11]) == 0) {
                                        break label410;
                                    }
                                }
                                var27--;
                            }
                            label399: while (var9 > var28) {
                                for (int var30 = var26; var30 <= var25; var30++) {
                                    if ((var7 & class68.field1564[var28 + 1][var30][var11]) == 0) {
                                        break label399;
                                    }
                                }
                                var28++;
                            }
                            int var31 = (var25 + 1 - var26) * (var28 + 1 - var27);
                            if (var31 >= 8) {
                                short var32 = 240;
                                int var33 = class72.field1668[var28][var26][var11] - var32;
                                int var34 = class72.field1668[var27][var26][var11];
                                class154.method1153(var9, 2, var26 * 128, var25 * 128 + 128, var11 * 128, var11 * 128, var33, var34);
                                for (int var35 = var27; var35 <= var28; var35++) {
                                    for (int var36 = var26; var36 <= var25; var36++) {
                                        class68.field1564[var35][var36][var11] = class79.method669(class68.field1564[var35][var36][var11], ~var7);
                                    }
                                }
                            }
                        }
                        if ((class68.field1564[var10][var12][var11] & var8) != 0) {
                            int var37 = var12;
                            int var38 = var12;
                            int var39;
                            for (var39 = var11; var39 > 0 && (var8 & class68.field1564[var10][var12][var39 - 1]) != 0; var39--) {
                            }
                            int var40;
                            for (var40 = var11; var40 < 104 && (class68.field1564[var10][var12][var40 + 1] & var8) != 0; var40++) {
                            }
                            label463: while (var37 > 0) {
                                for (int var41 = var39; var41 <= var40; var41++) {
                                    if ((var8 & class68.field1564[var10][var37 - 1][var41]) == 0) {
                                        break label463;
                                    }
                                }
                                var37--;
                            }
                            label452: while (var38 < 104) {
                                for (int var42 = var39; var42 <= var40; var42++) {
                                    if ((class68.field1564[var10][var38 + 1][var42] & var8) == 0) {
                                        break label452;
                                    }
                                }
                                var38++;
                            }
                            if ((var38 + 1 - var37) * (var40 + 1 - var39) >= 4) {
                                int var43 = class72.field1668[var10][var37][var39];
                                class154.method1153(var9, 4, var37 * 128, var38 * 128 + 128, var39 * 128, var40 * 128 + 128, var43, var43);
                                for (int var44 = var37; var44 <= var38; var44++) {
                                    for (int var45 = var39; var45 <= var40; var45++) {
                                        class68.field1564[var10][var44][var45] = class79.method669(class68.field1564[var10][var44][var45], ~var8);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(I)V")
    public static void method758(int arg0) {
        field2267 = null;
        field2270 = null;
        field2261 = null;
        int var1 = -61 % ((arg0 + 16) / 32);
        field2271 = null;
        field2273 = null;
        field2272 = null;
        field2269 = null;
        field2268 = null;
        field2274 = null;
    }
}
