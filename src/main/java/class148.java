import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class148 extends class191 {

    @OriginalMember(owner = "client!pe", name = "F", descriptor = "Ldd;")
    public static class35 field3103 = class180.method1196((byte) -117, "auf einer freien Welt zu spielen)3");

    @OriginalMember(owner = "client!pe", name = "M", descriptor = "Ldd;")
    public static class35 field3109 = class180.method1196((byte) 127, "Wordpack geladen)3");

    @OriginalMember(owner = "client!pe", name = "O", descriptor = "Ldd;")
    public static class35 field3111 = class180.method1196((byte) 127, "<br>(X100(U(Y");

    @OriginalMember(owner = "client!pe", name = "S", descriptor = "Ldd;")
    public static class35 field3114 = class180.method1196((byte) -111, ")2");

    @OriginalMember(owner = "client!pe", name = "X", descriptor = "[Lce;")
    public static class26[] field3119 = new class26[2048];

    @OriginalMember(owner = "client!pe", name = "V", descriptor = "Ldd;")
    public static class35 field3117 = class180.method1196((byte) 127, "Abbrechen");

    @OriginalMember(owner = "client!pe", name = "T", descriptor = "B")
    public static byte field3115;

    @OriginalMember(owner = "client!pe", name = "H", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!pe", name = "I", descriptor = "I")
    public static int field3106;

    @OriginalMember(owner = "client!pe", name = "K", descriptor = "I")
    public static int field3107;

    @OriginalMember(owner = "client!pe", name = "N", descriptor = "I")
    public static int field3110;

    @OriginalMember(owner = "client!pe", name = "Q", descriptor = "I")
    public static int field3112;

    @OriginalMember(owner = "client!pe", name = "R", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!pe", name = "W", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!pe", name = "G", descriptor = "J")
    public static long field3104;

    @OriginalMember(owner = "client!pe", name = "L", descriptor = "Llc;")
    public class110 field3108;

    @OriginalMember(owner = "client!pe", name = "U", descriptor = "Lag;")
    public static class8 field3116;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ldd;BLdd;Ldd;I)V")
    public static final void method1009(class35 arg0, byte arg1, class35 arg2, class35 arg3, int arg4) {
        field3110++;
        for (int var5 = 99; var5 > 0; var5--) {
            class115.field2574[var5] = class115.field2574[var5 - 1];
            class92.field2037[var5] = class92.field2037[var5 - 1];
            class60.field1480[var5] = class60.field1480[var5 - 1];
            class26.field573[var5] = class26.field573[var5 - 1];
        }
        if (arg1 != -4) {
            return;
        }
        class115.field2574[0] = arg4;
        class92.field2037[0] = arg2;
        class60.field1480[0] = arg0;
        class126.field2740++;
        class26.field573[0] = arg3;
        class183.field3770 = class13.field232;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZIII)V")
    public static final void method1010(boolean arg0, int arg1, int arg2, int arg3) {
        field3118++;
        if (arg1 < 8000 || arg1 > 48000) {
            throw new IllegalArgumentException();
        }
        class150.field3136 = arg1;
        class109.field2419 = arg0;
        class181.field3695 = arg3;
        int var4 = -87 % ((arg2 - 17) / 38);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "([Ld;I)V")
    public static final void method1011(class31[] arg0, int arg1) {
        field3107++;
        int var2 = 0;
        int var3 = -4 % ((18 - arg1) / 51);
        while (var2 < 4) {
            for (int var114 = 0; var114 < 104; var114++) {
                for (int var115 = 0; var115 < 104; var115++) {
                    if ((class40.field894[var2][var114][var115] & 0x1) == 1) {
                        int var116 = var2;
                        if ((class40.field894[1][var114][var115] & 0x2) == 2) {
                            var116 = var2 - 1;
                        }
                        if (var116 >= 0) {
                            arg0[var116].method291(var114, var115, (byte) 104);
                        }
                    }
                }
            }
            var2++;
        }
        class61.field1503 += (int) (Math.random() * 5.0D) - 2;
        class176.field3599 += (int) (Math.random() * 5.0D) - 2;
        if (class61.field1503 < -8) {
            class61.field1503 = -8;
        }
        if (class176.field3599 < -16) {
            class176.field3599 = -16;
        }
        if (class176.field3599 > 16) {
            class176.field3599 = 16;
        }
        if (class61.field1503 > 8) {
            class61.field1503 = 8;
        }
        int var4 = class61.field1503 >> 2 << 10;
        int[][] var5 = new int[104][104];
        int var6 = class176.field3599 >> 1;
        int[][] var7 = new int[104][104];
        for (int var8 = 0; var8 < 4; var8++) {
            byte[][] var51 = class92.field2050[var8];
            byte var52 = 74;
            short var53 = 768;
            int var54 = (int) Math.sqrt(5100.0D);
            int var55 = var53 * var54 >> 8;
            for (int var56 = 1; var56 < 103; var56++) {
                for (int var104 = 1; var104 < 103; var104++) {
                    int var106 = class206.field4109[var8][var104 + 1][var56] - class206.field4109[var8][var104 - 1][var56];
                    int var107 = class206.field4109[var8][var104][var56 + 1] - class206.field4109[var8][var104][var56 - 1];
                    int var108 = (int) Math.sqrt((double) (var106 * var106 + var107 * var107 + 65536));
                    int var109 = (var107 << 8) / var108;
                    int var110 = (var106 << 8) / var108;
                    int var111 = -65536 / var108;
                    int var112 = (var109 * -50 + var110 * -50 + var111 * -10) / var55 + var52;
                    int var113 = (var51[var104 - 1][var56] >> 2) + (var51[var104 + 1][var56] >> 3) + (var51[var104][var56 + -1] >> 2) + (var51[var104][var56] >> 1) + (var51[var104][var56 + 1] >> 3);
                    var7[var104][var56] = var112 - var113;
                }
            }
            for (int var57 = 0; var57 < 104; var57++) {
                class69.field1659[var57] = 0;
                class99.field2186[var57] = 0;
                class102.field2286[var57] = 0;
                class74.field1785[var57] = 0;
                class198.field3943[var57] = 0;
            }
            for (int var58 = -5; var58 < 104; var58++) {
                for (int var89 = 0; var89 < 104; var89++) {
                    int var98 = var58 + 5;
                    int var10002;
                    if (var98 < 104) {
                        int var99 = class69.field1672[var8][var98][var89] & 0xFF;
                        if (var99 > 0) {
                            class168 var100 = class204.method1346((byte) -92, var99 - 1);
                            class69.field1659[var89] += var100.field3390;
                            class99.field2186[var89] += var100.field3378;
                            class102.field2286[var89] += var100.field3382;
                            class74.field1785[var89] += var100.field3381;
                            var10002 = class198.field3943[var89]++;
                        }
                    }
                    int var101 = var58 - 5;
                    if (var101 >= 0) {
                        int var102 = class69.field1672[var8][var101][var89] & 0xFF;
                        if (var102 > 0) {
                            class168 var103 = class204.method1346((byte) -98, var102 - 1);
                            class69.field1659[var89] -= var103.field3390;
                            class99.field2186[var89] -= var103.field3378;
                            class102.field2286[var89] -= var103.field3382;
                            class74.field1785[var89] -= var103.field3381;
                            var10002 = class198.field3943[var89]--;
                        }
                    }
                }
                if (var58 >= 0) {
                    int var90 = 0;
                    int var91 = 0;
                    int var92 = 0;
                    int var93 = 0;
                    int var94 = 0;
                    for (int var95 = -5; var95 < 104; var95++) {
                        int var96 = var95 + 5;
                        if (var96 < 104) {
                            var93 += class198.field3943[var96];
                            var91 += class102.field2286[var96];
                            var94 += class74.field1785[var96];
                            var90 += class69.field1659[var96];
                            var92 += class99.field2186[var96];
                        }
                        int var97 = var95 - 5;
                        if (var97 >= 0) {
                            var91 -= class102.field2286[var97];
                            var93 -= class198.field3943[var97];
                            var94 -= class74.field1785[var97];
                            var90 -= class69.field1659[var97];
                            var92 -= class99.field2186[var97];
                        }
                        if (var95 >= 0 && var93 > 0) {
                            var5[var58][var95] = class175.method1166(var90 * 256 / var94, var91 / var93, false, var92 / var93);
                        }
                    }
                }
            }
            for (int var59 = 1; var59 < 103; var59++) {
                for (int var62 = 1; var62 < 103; var62++) {
                    if (!class35.field781 || (class40.field894[0][var59][var62] & 0x2) != 0 || (class40.field894[var8][var59][var62] & 0x10) == 0 && class35.method322(var59, var62, 31771, var8) == class152.field3160) {
                        if (class25.field502 > var8) {
                            class25.field502 = var8;
                        }
                        int var63 = class145.field3054[var8][var59][var62] & 0xFF;
                        int var64 = class69.field1672[var8][var59][var62] & 0xFF;
                        if (var64 > 0 || var63 > 0) {
                            int var65 = class206.field4109[var8][var59][var62];
                            int var66 = class206.field4109[var8][var59 + 1][var62];
                            int var67 = class206.field4109[var8][var59 + 1][var62 + 1];
                            int var68 = class206.field4109[var8][var59][var62 + 1];
                            if (var8 > 0) {
                                boolean var69 = true;
                                if (var64 == 0 && class191.field3836[var8][var59][var62] != 0) {
                                    var69 = false;
                                }
                                if (var63 > 0 && !class170.method1109(var63 - 1, -27120).field2046) {
                                    var69 = false;
                                }
                                if (var69 && var65 == var66 && var65 == var67 && var65 == var68) {
                                    class179.field3677[var8][var59][var62] = class152.method1027(class179.field3677[var8][var59][var62], 2340);
                                }
                            }
                            int var70;
                            int var71;
                            if (var64 <= 0) {
                                var70 = -1;
                                var71 = 0;
                            } else {
                                var70 = var5[var59][var62];
                                int var72 = (var70 & 0x7F) + var6;
                                if (var72 < 0) {
                                    var72 = 0;
                                } else if (var72 > 127) {
                                    var72 = 127;
                                }
                                int var73 = (var4 + var70 & 0xFC00) + (var70 & 0x380) + var72;
                                var71 = class11.field202[class25.method211((byte) -88, var73, 96)];
                            }
                            int var74 = var7[var59 + 1][var62];
                            int var75 = var7[var59][var62];
                            int var76 = var7[var59 + 1][var62 + 1];
                            int var77 = var7[var59][var62 + 1];
                            if (var63 == 0) {
                                class106.method786(var8, var59, var62, 0, 0, -1, var65, var66, var67, var68, class25.method211((byte) -82, var70, var75), class25.method211((byte) -116, var70, var74), class25.method211((byte) -123, var70, var76), class25.method211((byte) -120, var70, var77), 0, 0, 0, 0, var71, 0);
                            } else {
                                int var78 = class191.field3836[var8][var59][var62] + 1;
                                byte var79 = class23.field458[var8][var59][var62];
                                class92 var80 = class170.method1109(var63 - 1, -27120);
                                int var81 = var80.field2040;
                                if (var81 >= 0 && !class11.field217.method834(var81, 28222)) {
                                    var81 = -1;
                                }
                                int var82;
                                int var83;
                                if (var81 >= 0) {
                                    var82 = class11.field202[class71.method571(96, class11.field217.method829(529, var81), 24)];
                                    var83 = -1;
                                } else if (var80.field2047 == -1) {
                                    var82 = 0;
                                    var83 = -2;
                                } else {
                                    var83 = var80.field2047;
                                    int var84 = (var83 & 0x7F) + var6;
                                    if (var84 < 0) {
                                        var84 = 0;
                                    } else if (var84 > 127) {
                                        var84 = 127;
                                    }
                                    int var85 = (var4 + var83 & 0xFC00) + (var83 & 0x380) + var84;
                                    var82 = class11.field202[class71.method571(96, var85, 24)];
                                }
                                if (var80.field2038 >= 0) {
                                    int var86 = var80.field2038;
                                    int var87 = (var86 & 0x7F) + var6;
                                    if (var87 < 0) {
                                        var87 = 0;
                                    } else if (var87 > 127) {
                                        var87 = 127;
                                    }
                                    int var88 = (var4 + var86 & 0xFC00) + (var86 & 0x380) + var87;
                                    var82 = class11.field202[class71.method571(96, var88, 24)];
                                }
                                class106.method786(var8, var59, var62, var78, var79, var81, var65, var66, var67, var68, class25.method211((byte) -116, var70, var75), class25.method211((byte) -120, var70, var74), class25.method211((byte) -100, var70, var76), class25.method211((byte) -117, var70, var77), class71.method571(var75, var83, 24), class71.method571(var74, var83, 24), class71.method571(var76, var83, 24), class71.method571(var77, var83, 24), var71, var82);
                            }
                        }
                    }
                }
            }
            for (int var60 = 1; var60 < 103; var60++) {
                for (int var61 = 1; var61 < 103; var61++) {
                    class160.method1066(var8, var61, var60, class35.method322(var61, var60, 31771, var8));
                }
            }
            class69.field1672[var8] = null;
            class145.field3054[var8] = null;
            class191.field3836[var8] = null;
            class23.field458[var8] = null;
            class92.field2050[var8] = null;
        }
        class181.method1199(-50, -10, -50);
        for (int var9 = 0; var9 < 104; var9++) {
            for (int var50 = 0; var50 < 104; var50++) {
                if ((class40.field894[1][var9][var50] & 0x2) == 2) {
                    class135.method926(var9, var50);
                }
            }
        }
        int var10 = 2;
        int var11 = 1;
        int var12 = 4;
        for (int var13 = 0; var13 < 4; var13++) {
            if (var13 > 0) {
                var12 <<= 0x3;
                var10 <<= 0x3;
                var11 <<= 0x3;
            }
            for (int var14 = 0; var14 <= var13; var14++) {
                for (int var15 = 0; var15 <= 104; var15++) {
                    for (int var16 = 0; var16 <= 104; var16++) {
                        if ((class179.field3677[var14][var16][var15] & var11) != 0) {
                            int var17;
                            for (var17 = var15; var17 > 0 && (class179.field3677[var14][var16][var17 - 1] & var11) != 0; var17--) {
                            }
                            int var18 = var15;
                            int var19 = var14;
                            while (var18 < 104 && (var11 & class179.field3677[var14][var16][var18 + 1]) != 0) {
                                var18++;
                            }
                            int var20;
                            label356: for (var20 = var14; var20 > 0; var20--) {
                                for (int var21 = var17; var21 <= var18; var21++) {
                                    if ((class179.field3677[var20 - 1][var16][var21] & var11) == 0) {
                                        break label356;
                                    }
                                }
                            }
                            label345: while (var13 > var19) {
                                for (int var22 = var17; var22 <= var18; var22++) {
                                    if ((var11 & class179.field3677[var19 + 1][var16][var22]) == 0) {
                                        break label345;
                                    }
                                }
                                var19++;
                            }
                            int var23 = (var18 + 1 - var17) * (var19 + 1 - var20);
                            if (var23 >= 8) {
                                short var24 = 240;
                                int var25 = class206.field4109[var19][var16][var17] - var24;
                                int var26 = class206.field4109[var20][var16][var17];
                                class150.method1022(var13, 1, var16 * 128, var16 * 128, var17 * 128, var18 * 128 + 128, var25, var26);
                                for (int var27 = var20; var27 <= var19; var27++) {
                                    for (int var28 = var17; var28 <= var18; var28++) {
                                        class179.field3677[var27][var16][var28] = class208.method1372(class179.field3677[var27][var16][var28], ~var11);
                                    }
                                }
                            }
                        }
                        if ((var10 & class179.field3677[var14][var16][var15]) != 0) {
                            int var29 = var16;
                            int var30;
                            for (var30 = var16; var30 < 104 && (class179.field3677[var14][var30 + 1][var15] & var10) != 0; var30++) {
                            }
                            while (var29 > 0 && (class179.field3677[var14][var29 - 1][var15] & var10) != 0) {
                                var29--;
                            }
                            int var31;
                            label412: for (var31 = var14; var31 > 0; var31--) {
                                for (int var32 = var29; var32 <= var30; var32++) {
                                    if ((class179.field3677[var31 - 1][var32][var15] & var10) == 0) {
                                        break label412;
                                    }
                                }
                            }
                            int var33;
                            label400: for (var33 = var14; var33 < var13; var33++) {
                                for (int var34 = var29; var34 <= var30; var34++) {
                                    if ((var10 & class179.field3677[var33 + 1][var34][var15]) == 0) {
                                        break label400;
                                    }
                                }
                            }
                            int var35 = (var33 + 1 - var31) * (var30 + 1 - var29);
                            if (var35 >= 8) {
                                short var36 = 240;
                                int var37 = class206.field4109[var33][var29][var15] - var36;
                                int var38 = class206.field4109[var31][var29][var15];
                                class150.method1022(var13, 2, var29 * 128, var30 * 128 + 128, var15 * 128, var15 * 128, var37, var38);
                                for (int var39 = var31; var39 <= var33; var39++) {
                                    for (int var40 = var29; var40 <= var30; var40++) {
                                        class179.field3677[var39][var40][var15] = class208.method1372(class179.field3677[var39][var40][var15], ~var10);
                                    }
                                }
                            }
                        }
                        if ((class179.field3677[var14][var16][var15] & var12) != 0) {
                            int var41 = var16;
                            int var42 = var16;
                            int var43;
                            for (var43 = var15; var43 < 104 && (var12 & class179.field3677[var14][var16][var43 + 1]) != 0; var43++) {
                            }
                            int var44;
                            for (var44 = var15; var44 > 0 && (class179.field3677[var14][var16][var44 - 1] & var12) != 0; var44--) {
                            }
                            label466: while (var41 > 0) {
                                for (int var45 = var44; var45 <= var43; var45++) {
                                    if ((class179.field3677[var14][var41 - 1][var45] & var12) == 0) {
                                        break label466;
                                    }
                                }
                                var41--;
                            }
                            label455: while (var42 < 104) {
                                for (int var46 = var44; var46 <= var43; var46++) {
                                    if ((var12 & class179.field3677[var14][var42 + 1][var46]) == 0) {
                                        break label455;
                                    }
                                }
                                var42++;
                            }
                            if ((var43 + 1 - var44) * (-var41 + 1 + var42) >= 4) {
                                int var47 = class206.field4109[var14][var41][var44];
                                class150.method1022(var13, 4, var41 * 128, var42 * 128 + 128, var44 * 128, var43 * 128 + 128, var47, var47);
                                for (int var48 = var41; var48 <= var42; var48++) {
                                    for (int var49 = var44; var49 <= var43; var49++) {
                                        class179.field3677[var14][var48][var49] = class208.method1372(class179.field3677[var14][var48][var49], ~var12);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "([BB)V")
    public static final void method1012(byte[] arg0, byte arg1) {
        field3112++;
        class26 var2 = new class26(arg0);
        var2.field527 = arg0.length - 2;
        class135.field2904 = var2.method256((byte) -78);
        class203.field4039 = new byte[class135.field2904][];
        class118.field2623 = new int[class135.field2904];
        class15.field269 = new int[class135.field2904];
        class207.field4119 = new int[class135.field2904];
        class143.field3003 = new int[class135.field2904];
        var2.field527 = arg0.length - class135.field2904 * 8 - 7;
        class37.field815 = var2.method256((byte) -78);
        class57.field1425 = var2.method256((byte) -78);
        int var3 = (var2.method221(-89) & 0xFF) + 1;
        for (int var4 = 0; var4 < class135.field2904; var4++) {
            class207.field4119[var4] = var2.method256((byte) -78);
        }
        for (int var5 = 0; var5 < class135.field2904; var5++) {
            class143.field3003[var5] = var2.method256((byte) -78);
        }
        for (int var6 = 0; var6 < class135.field2904; var6++) {
            class15.field269[var6] = var2.method256((byte) -78);
        }
        int var7 = 63 % ((arg1 + 18) / 55);
        for (int var8 = 0; var8 < class135.field2904; var8++) {
            class118.field2623[var8] = var2.method256((byte) -78);
        }
        var2.field527 = arg0.length - (var3 - 1) * 3 - class135.field2904 * 8 - 7;
        class116.field2591 = new int[var3];
        for (int var9 = 1; var9 < var3; var9++) {
            class116.field2591[var9] = var2.method232(121);
            if (class116.field2591[var9] == 0) {
                class116.field2591[var9] = 1;
            }
        }
        var2.field527 = 0;
        for (int var10 = 0; var10 < class135.field2904; var10++) {
            int var11 = class118.field2623[var10];
            int var12 = class15.field269[var10];
            int var13 = var11 * var12;
            byte[] var14 = new byte[var13];
            class203.field4039[var10] = var14;
            int var15 = var2.method221(-79);
            if (var15 == 0) {
                for (int var18 = 0; var18 < var13; var18++) {
                    var14[var18] = var2.method225((byte) -113);
                }
            } else if (var15 == 1) {
                for (int var16 = 0; var16 < var12; var16++) {
                    for (int var17 = 0; var17 < var11; var17++) {
                        var14[var16 + var12 * var17] = var2.method225((byte) -128);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "(B)V")
    public static void method1013(byte arg0) {
        field3114 = null;
        field3117 = null;
        if (arg0 != -78) {
            return;
        }
        field3119 = null;
        field3103 = null;
        field3109 = null;
        field3111 = null;
        field3116 = null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(BLdd;)V")
    public static final void method1014(byte arg0, class35 arg1) {
        field3105++;
        if (class182.field3734.field907 == null) {
            return;
        }
        try {
            class35 var2 = class129.field2785.method352((byte) 66, class182.field3734.field907);
            class35 var3 = class93.field2064.method352((byte) 108, class182.field3734.field907);
            class35 var4 = class63.method529(new class35[] { var2, class165.field3326, arg1, class63.field1514, var3 }, (byte) 125);
            if (arg0 != 92) {
                field3117 = null;
            }
            class35 var5;
            if (arg1.method347((byte) -126) == 0) {
                var5 = class63.method529(new class35[] { var4, class137.field2933 }, (byte) 89);
            } else {
                var5 = class63.method529(new class35[] { var4, class26.field575, class147.method1008(class190.method1253((byte) 18) + 94608000000L, (byte) -104), class160.field3245, class122.method869(94608000L, 0) }, (byte) 75);
            }
            class63.method529(new class35[] { class3.field52, var5, class163.field3312 }, (byte) 115).method350((byte) 27, class182.field3734.field907);
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "(I)V")
    public static final void method1015(int arg0) {
        if (arg0 != 0) {
            method1009(null, (byte) 117, null, null, -91);
        }
        class21 var1 = (class21) class136.field2910.method1232(25831);
        field3113++;
        while (var1 != null) {
            if (var1.field413 > 0) {
                var1.field413--;
            }
            if (var1.field413 != 0) {
                if (var1.field424 > 0) {
                    var1.field424--;
                }
                if (var1.field424 == 0 && var1.field423 >= 1 && var1.field434 >= 1 && var1.field423 <= 102 && var1.field434 <= 102 && (var1.field432 < 0 || class204.method1350(-48, var1.field432, var1.field415))) {
                    class9.method67(var1.field434, var1.field420, var1.field423, var1.field436, var1.field437, (byte) 74, var1.field415, var1.field432);
                    var1.field424 = -1;
                    if (var1.field432 == var1.field425 && var1.field425 == -1) {
                        var1.method799(arg0 - 24265);
                    } else if (var1.field432 == var1.field425 && var1.field436 == var1.field417 && var1.field428 == var1.field415) {
                        var1.method799(-24265);
                    }
                }
            } else if (var1.field425 < 0 || class204.method1350(-109, var1.field425, var1.field428)) {
                class9.method67(var1.field434, var1.field420, var1.field423, var1.field417, var1.field437, (byte) 74, var1.field428, var1.field425);
                var1.method799(-24265);
            }
            var1 = (class21) class136.field2910.method1238(22622);
        }
    }

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "(B)V")
    public static final void method1016(byte arg0) {
        for (int var1 = -1; var1 < class72.field1714; var1++) {
            int var6;
            if (var1 == -1) {
                var6 = 2047;
            } else {
                var6 = class35.field748[var1];
            }
            class102 var7 = class51.field1154[var6];
            if (var7 != null && var7.field1652 > 0) {
                var7.field1652--;
                if (var7.field1652 == 0) {
                    var7.field1633 = null;
                }
            }
        }
        int var2 = 20 % ((arg0 - 59) / 41);
        for (int var3 = 0; var3 < class83.field1921; var3++) {
            int var4 = class73.field1738[var3];
            class19 var5 = class204.field4058[var4];
            if (var5 != null && var5.field1652 > 0) {
                var5.field1652--;
                if (var5.field1652 == 0) {
                    var5.field1633 = null;
                }
            }
        }
        field3106++;
    }
}
