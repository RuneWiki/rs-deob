import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public abstract class class30 {

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "Z")
    public static boolean field850 = false;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "Lkd;")
    public static class73 field851 = class126.method1070((byte) -66, "Cabbage");

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "Ljb;")
    public static class64 field849 = new class64(64);

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
    public static int field856 = 0;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    public static int field852;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "Lq;")
    public static class111 field855;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
    public abstract void method246(int arg0);

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)V")
    public abstract void method247(int arg0);

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(III)I")
    public abstract int method248(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)V")
    public static void method249(int arg0) {
        if (arg0 < 14) {
            method251(91, null, null);
        }
        field851 = null;
        field855 = null;
        field849 = null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IILdf;BI)V")
    public static final void method250(int arg0, int arg1, class28 arg2, byte arg3, int arg4) {
        field853++;
        if (class129.field3262 >= 400) {
            return;
        }
        if (arg2.field801 != null) {
            arg2 = arg2.method216(-1);
        }
        if (arg2 == null || !arg2.field802) {
            return;
        }
        class73 var5 = arg2.field792;
        if (arg2.field816 != 0) {
            var5 = class32.method258(-73, new class73[] { var5, class72.method599(class73.field1901.field3002, -1, arg2.field816), class36.field1001, class105.field2611, class78.method676(arg2.field816, -99), class60.field1585 });
        }
        if (class103.field2567 == 1) {
            class80.method684(class32.method258(-103, new class73[] { class5.field192, class87.field2201, var5 }), false, 42, class87.field2189, arg1, arg4, arg0);
            class102.field2533++;
        } else if (!class50.field1329) {
            class39.field1070++;
            class73[] var6 = arg2.field808;
            if (class33.field915) {
                var6 = class143.method1155(false, var6);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].method615(class50.field1364, 60)) {
                        class107.field2641++;
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 2;
                        }
                        if (var7 == 1) {
                            var8 = 46;
                        }
                        if (var7 == 2) {
                            var8 = 44;
                        }
                        if (var7 == 3) {
                            var8 = 50;
                        }
                        if (var7 == 4) {
                            var8 = 27;
                        }
                        class80.method684(class32.method258(-123, new class73[] { class5.field189, var5 }), false, var8, var6[var7], arg1, arg4, arg0);
                    }
                }
            }
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method615(class50.field1364, 60)) {
                        class42.field1120++;
                        short var10 = 0;
                        int var11 = 0;
                        if (class73.field1901.field3002 < arg2.field816) {
                            var10 = 2000;
                        }
                        if (var9 == 0) {
                            var11 = var10 + 2;
                        }
                        if (var9 == 1) {
                            var11 = var10 + 46;
                        }
                        if (var9 == 2) {
                            var11 = var10 + 44;
                        }
                        if (var9 == 3) {
                            var11 = var10 + 50;
                        }
                        if (var9 == 4) {
                            var11 = var10 + 27;
                        }
                        class80.method684(class32.method258(-84, new class73[] { class5.field189, var5 }), false, var11, var6[var9], arg1, arg4, arg0);
                    }
                }
            }
            class80.method684(class32.method258(-117, new class73[] { class5.field189, var5 }), false, 1004, class86.field2178, arg1, arg4, arg0);
        } else if ((class94.field2392 & 0x2) == 2) {
            class80.method684(class32.method258(-77, new class73[] { class121.field3102, class87.field2201, var5 }), false, 41, class57.field1511, arg1, arg4, arg0);
            class104.field2586++;
        }
        if (arg3 > -111) {
            field857 = -61;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILb;[Lge;)V")
    public static final void method251(int arg0, class8 arg1, class47[] arg2) {
        field852++;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((class55.field1482[var3][var110][var111] & 0x1) == 1) {
                        int var112 = var3;
                        if ((class55.field1482[1][var110][var111] & 0x2) == 2) {
                            var112 = var3 - 1;
                        }
                        if (var112 >= 0) {
                            arg2[var112].method381(var110, var111, (byte) 115);
                        }
                    }
                }
            }
        }
        class9.field311 += (int) (Math.random() * 5.0D) - 2;
        class51.field1373 += (int) (Math.random() * 5.0D) - 2;
        if (class9.field311 < -16) {
            class9.field311 = -16;
        }
        if (class9.field311 > 16) {
            class9.field311 = 16;
        }
        if (class51.field1373 < -8) {
            class51.field1373 = -8;
        }
        if (class51.field1373 > 8) {
            class51.field1373 = 8;
        }
        for (int var4 = 0; var4 < 4; var4++) {
            byte[][] var47 = class61.field1615[var4];
            int var48 = (int) Math.sqrt(5100.0D);
            int var49 = var48 * 768 >> 8;
            for (int var50 = 1; var50 < 103; var50++) {
                for (int var101 = 1; var101 < 103; var101++) {
                    int var102 = class55.field1484[var4][var101 + 1][var50] - class55.field1484[var4][var101 - 1][var50];
                    int var103 = class55.field1484[var4][var101][var50 + 1] - class55.field1484[var4][var101][var50 - 1];
                    int var104 = (int) Math.sqrt((double) (var102 * var102 + var103 * var103 + 65536));
                    int var105 = (var103 << 8) / var104;
                    int var106 = (var102 << 8) / var104;
                    int var107 = 65536 / var104;
                    int var108 = (var47[var101][var50 + 1] >> 3) + (var47[var101][var50 - 1] >> 2) + (var47[var101][var50] >> 1) + (var47[var101 - 1][var50] >> 2) + (var47[var101 + 1][var50] >> 3);
                    int var109 = (var105 * -50 + var106 * -50 + var107 * -10) / var49 + 96;
                    class47.field1245[var101][var50] = var109 - var108;
                }
            }
            for (int var51 = 0; var51 < 104; var51++) {
                class141.field3513[var51] = 0;
                class99.field2490[var51] = 0;
                class47.field1236[var51] = 0;
                class129.field3247[var51] = 0;
                class125.field3169[var51] = 0;
            }
            for (int var52 = -5; var52 < 109; var52++) {
                for (int var55 = 0; var55 < 104; var55++) {
                    int var95 = var52 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < 104) {
                        int var96 = class12.field400[var4][var95][var55] & 0xFF;
                        if (var96 > 0) {
                            class123 var97 = class51.method417(var96 - 1, (byte) -119);
                            class141.field3513[var55] += var97.field3139;
                            class99.field2490[var55] += var97.field3148;
                            class47.field1236[var55] += var97.field3144;
                            class129.field3247[var55] += var97.field3142;
                            var10002 = class125.field3169[var55]++;
                        }
                    }
                    int var98 = var52 - 5;
                    if (var98 >= 0 && var98 < 104) {
                        int var99 = class12.field400[var4][var98][var55] & 0xFF;
                        if (var99 > 0) {
                            class123 var100 = class51.method417(var99 - 1, (byte) 40);
                            class141.field3513[var55] -= var100.field3139;
                            class99.field2490[var55] -= var100.field3148;
                            class47.field1236[var55] -= var100.field3144;
                            class129.field3247[var55] -= var100.field3142;
                            var10002 = class125.field3169[var55]--;
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
                            var59 += class125.field3169[var62];
                            var57 += class129.field3247[var62];
                            var58 += class99.field2490[var62];
                            var56 += class141.field3513[var62];
                            var60 += class47.field1236[var62];
                        }
                        int var63 = var61 - 5;
                        if (var63 >= 0 && var63 < 104) {
                            var59 -= class125.field3169[var63];
                            var57 -= class129.field3247[var63];
                            var56 -= class141.field3513[var63];
                            var60 -= class47.field1236[var63];
                            var58 -= class99.field2490[var63];
                        }
                        if (var61 >= 1 && var61 < 103 && (!class77.field1971 || (class55.field1482[0][var52][var61] & 0x2) != 0 || (class55.field1482[var4][var52][var61] & 0x10) == 0 && class118.method1025(var52, 0, var4, var61) == class110.field2694)) {
                            if (class5.field183 > var4) {
                                class5.field183 = var4;
                            }
                            int var64 = class12.field400[var4][var52][var61] & 0xFF;
                            int var65 = class86.field2163[var4][var52][var61] & 0xFF;
                            if (var64 > 0 || var65 > 0) {
                                int var66 = class55.field1484[var4][var52 + 1][var61];
                                int var67 = class55.field1484[var4][var52][var61];
                                int var68 = class55.field1484[var4][var52 + 1][var61 + 1];
                                int var69 = class47.field1245[var52 + 1][var61 + 1];
                                int var70 = class47.field1245[var52][var61];
                                int var71 = class55.field1484[var4][var52][var61 + 1];
                                int var72 = class47.field1245[var52][var61 + 1];
                                int var73 = class47.field1245[var52 + 1][var61];
                                int var74 = -1;
                                int var75 = -1;
                                if (var64 > 0) {
                                    int var76 = var58 / var59;
                                    int var77 = var56 * 256 / var57;
                                    int var78 = var60 / var59;
                                    var75 = class71.method595(var76, (byte) -93, var77, var78);
                                    int var79 = class9.field311 + var78;
                                    int var80 = var77 + class51.field1373 & 0xFF;
                                    if (var79 < 0) {
                                        var79 = 0;
                                    } else if (var79 > 255) {
                                        var79 = 255;
                                    }
                                    var74 = class71.method595(var76, (byte) -120, var80, var79);
                                }
                                if (var4 > 0) {
                                    boolean var81 = true;
                                    if (var64 == 0 && class1.field100[var4][var52][var61] != 0) {
                                        var81 = false;
                                    }
                                    if (var65 > 0 && !class131.method1095(var65 - 1, -24761).field389) {
                                        var81 = false;
                                    }
                                    if (var81 && var66 == var67 && var67 == var68 && var67 == var71) {
                                        class11.field352[var4][var52][var61] = class84.method713(class11.field352[var4][var52][var61], 2340);
                                    }
                                }
                                int var82 = 0;
                                if (var74 != -1) {
                                    var82 = class29.field836[class12.method107(96, (byte) -114, var74)];
                                }
                                if (var65 == 0) {
                                    arg1.method72(var4, var52, var61, 0, 0, -1, var67, var66, var68, var71, class12.method107(var70, (byte) -115, var75), class12.method107(var73, (byte) -127, var75), class12.method107(var69, (byte) -115, var75), class12.method107(var72, (byte) -110, var75), 0, 0, 0, 0, var82, 0);
                                } else {
                                    int var83 = class1.field100[var4][var52][var61] + 1;
                                    byte var84 = class116.field2958[var4][var52][var61];
                                    class12 var85 = class131.method1095(var65 - 1, -24761);
                                    int var86 = var85.field385;
                                    int var87;
                                    int var90;
                                    if (var86 >= 0) {
                                        var87 = -1;
                                        var90 = class29.field829.method280(var86, (byte) 3);
                                    } else if (var85.field382 == 16711935) {
                                        var90 = -2;
                                        var87 = -2;
                                        var86 = -1;
                                    } else {
                                        var87 = class71.method595(var85.field397, (byte) -103, var85.field391, var85.field392);
                                        int var88 = class51.field1373 + var85.field391 & 0xFF;
                                        int var89 = class9.field311 + var85.field392;
                                        if (var89 < 0) {
                                            var89 = 0;
                                        } else if (var89 > 255) {
                                            var89 = 255;
                                        }
                                        var90 = class71.method595(var85.field397, (byte) -117, var88, var89);
                                    }
                                    int var91 = 0;
                                    if (var90 != -2) {
                                        var91 = class29.field836[class71.method596(var90, 96, 0)];
                                    }
                                    if (var85.field380 != -1) {
                                        int var92 = class51.field1373 + var85.field404 & 0xFF;
                                        int var93 = var85.field395 + class9.field311;
                                        if (var93 < 0) {
                                            var93 = 0;
                                        } else if (var93 > 255) {
                                            var93 = 255;
                                        }
                                        int var94 = class71.method595(var85.field398, (byte) -110, var92, var93);
                                        var91 = class29.field836[class71.method596(var94, 96, 0)];
                                    }
                                    arg1.method72(var4, var52, var61, var83, var84, var86, var67, var66, var68, var71, class12.method107(var70, (byte) -115, var75), class12.method107(var73, (byte) -120, var75), class12.method107(var69, (byte) -114, var75), class12.method107(var72, (byte) -111, var75), class71.method596(var87, var70, 0), class71.method596(var87, var73, 0), class71.method596(var87, var69, 0), class71.method596(var87, var72, 0), var82, var91);
                                }
                            }
                        }
                    }
                }
            }
            for (int var53 = 1; var53 < 103; var53++) {
                for (int var54 = 1; var54 < 103; var54++) {
                    arg1.method69(var4, var54, var53, class118.method1025(var54, 0, var4, var53));
                }
            }
            class12.field400[var4] = null;
            class86.field2163[var4] = null;
            class1.field100[var4] = null;
            class116.field2958[var4] = null;
            class61.field1615[var4] = null;
        }
        arg1.method80(-50, -10, -50);
        for (int var5 = 0; var5 < 104; var5++) {
            for (int var46 = 0; var46 < 104; var46++) {
                if ((class55.field1482[1][var5][var46] & 0x2) == 2) {
                    arg1.method53(var5, var46);
                }
            }
        }
        int var6 = 1;
        int var7 = 4;
        int var8 = 2;
        if (arg0 > -90) {
            method249(24);
        }
        for (int var9 = 0; var9 < 4; var9++) {
            if (var9 > 0) {
                var6 <<= 0x3;
                var7 <<= 0x3;
                var8 <<= 0x3;
            }
            for (int var10 = 0; var10 <= var9; var10++) {
                for (int var11 = 0; var11 <= 104; var11++) {
                    for (int var12 = 0; var12 <= 104; var12++) {
                        if ((var6 & class11.field352[var10][var12][var11]) != 0) {
                            int var13;
                            for (var13 = var11; var13 > 0 && (var6 & class11.field352[var10][var12][var13 - 1]) != 0; var13--) {
                            }
                            int var14 = var10;
                            int var15 = var10;
                            int var16;
                            for (var16 = var11; var16 < 104 && (var6 & class11.field352[var10][var12][var16 + 1]) != 0; var16++) {
                            }
                            label354: while (var14 > 0) {
                                for (int var17 = var13; var17 <= var16; var17++) {
                                    if ((class11.field352[var14 - 1][var12][var17] & var6) == 0) {
                                        break label354;
                                    }
                                }
                                var14--;
                            }
                            label343: while (var15 < var9) {
                                for (int var18 = var13; var18 <= var16; var18++) {
                                    if ((var6 & class11.field352[var15 + 1][var12][var18]) == 0) {
                                        break label343;
                                    }
                                }
                                var15++;
                            }
                            int var19 = (var16 + 1 - var13) * (var15 + 1 - var14);
                            if (var19 >= 8) {
                                short var20 = 240;
                                int var21 = class55.field1484[var14][var12][var13];
                                int var22 = class55.field1484[var15][var12][var13] - var20;
                                class8.method36(var9, 1, var12 * 128, var12 * 128, var13 * 128, var16 * 128 + 128, var22, var21);
                                for (int var23 = var14; var23 <= var15; var23++) {
                                    for (int var24 = var13; var24 <= var16; var24++) {
                                        class11.field352[var23][var12][var24] = class149.method1189(class11.field352[var23][var12][var24], ~var6);
                                    }
                                }
                            }
                        }
                        if ((var8 & class11.field352[var10][var12][var11]) != 0) {
                            int var25 = var10;
                            int var26 = var10;
                            int var27 = var12;
                            int var28 = var12;
                            while (var27 > 0 && (class11.field352[var10][var27 - 1][var11] & var8) != 0) {
                                var27--;
                            }
                            while (var28 < 104 && (class11.field352[var10][var28 + 1][var11] & var8) != 0) {
                                var28++;
                            }
                            label408: while (var25 > 0) {
                                for (int var29 = var27; var29 <= var28; var29++) {
                                    if ((var8 & class11.field352[var25 - 1][var29][var11]) == 0) {
                                        break label408;
                                    }
                                }
                                var25--;
                            }
                            label397: while (var9 > var26) {
                                for (int var30 = var27; var30 <= var28; var30++) {
                                    if ((class11.field352[var26 + 1][var30][var11] & var8) == 0) {
                                        break label397;
                                    }
                                }
                                var26++;
                            }
                            int var31 = (var26 + 1 - var25) * (var28 + 1 - var27);
                            if (var31 >= 8) {
                                short var32 = 240;
                                int var33 = class55.field1484[var25][var27][var11];
                                int var34 = class55.field1484[var26][var27][var11] - var32;
                                class8.method36(var9, 2, var27 * 128, var28 * 128 + 128, var11 * 128, var11 * 128, var34, var33);
                                for (int var35 = var25; var35 <= var26; var35++) {
                                    for (int var36 = var27; var36 <= var28; var36++) {
                                        class11.field352[var35][var36][var11] = class149.method1189(class11.field352[var35][var36][var11], ~var8);
                                    }
                                }
                            }
                        }
                        if ((class11.field352[var10][var12][var11] & var7) != 0) {
                            int var37 = var12;
                            int var38 = var12;
                            int var39;
                            for (var39 = var11; var39 < 104 && (var7 & class11.field352[var10][var12][var39 + 1]) != 0; var39++) {
                            }
                            int var40;
                            for (var40 = var11; var40 > 0 && (class11.field352[var10][var12][var40 - 1] & var7) != 0; var40--) {
                            }
                            label461: while (var37 > 0) {
                                for (int var41 = var40; var41 <= var39; var41++) {
                                    if ((class11.field352[var10][var37 - 1][var41] & var7) == 0) {
                                        break label461;
                                    }
                                }
                                var37--;
                            }
                            label450: while (var38 < 104) {
                                for (int var42 = var40; var42 <= var39; var42++) {
                                    if ((class11.field352[var10][var38 + 1][var42] & var7) == 0) {
                                        break label450;
                                    }
                                }
                                var38++;
                            }
                            if ((var38 + 1 - var37) * (-var40 + var39 + 1) >= 4) {
                                int var43 = class55.field1484[var10][var37][var40];
                                class8.method36(var9, 4, var37 * 128, var38 * 128 + 128, var40 * 128, var39 * 128 + 128, var43, var43);
                                for (int var44 = var37; var44 <= var38; var44++) {
                                    for (int var45 = var40; var45 <= var39; var45++) {
                                        class11.field352[var10][var44][var45] = class149.method1189(class11.field352[var10][var44][var45], ~var7);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
