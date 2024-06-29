import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class301 extends class110 {

    @OriginalMember(owner = "client!dm", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field4800 = new String[500];

    @OriginalMember(owner = "client!dm", name = "m", descriptor = "[I")
    public static int[] field4798 = new int[100];

    @OriginalMember(owner = "client!dm", name = "n", descriptor = "[Z")
    public static boolean[] field4799 = new boolean[200];

    @OriginalMember(owner = "client!dm", name = "p", descriptor = "I")
    public static int field4801 = 20;

    @OriginalMember(owner = "client!dm", name = "i", descriptor = "I")
    public static int field4794;

    @OriginalMember(owner = "client!dm", name = "j", descriptor = "I")
    public static int field4795;

    @OriginalMember(owner = "client!dm", name = "k", descriptor = "I")
    public static int field4796;

    @OriginalMember(owner = "client!dm", name = "l", descriptor = "I")
    public static int field4797;

    @OriginalMember(owner = "client!dm", name = "q", descriptor = "I")
    public static int field4802;

    @OriginalMember(owner = "client!dm", name = "r", descriptor = "I")
    public static int field4803;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "([Lmf;Z[[[II)V", line = 7)
    public static final void method2126(class53[] arg0, boolean arg1, int[][][] arg2, int arg3) {
        field4795++;
        byte var4;
        if (arg1) {
            var4 = 1;
        } else {
            var4 = 4;
        }
        if (!arg1) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < 104; var6++) {
                    for (int var7 = 0; var7 < 104; var7++) {
                        if ((class332.field5184[var5][var6][var7] & 0x1) == 1) {
                            int var8 = var5;
                            if ((class332.field5184[1][var6][var7] & 0x2) == 2) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg0[var8].method438((byte) 8, var6, var7);
                            }
                        }
                    }
                }
            }
            class111.field1805 += (int) (Math.random() * 5.0D) - 2;
            class67.field1016 += (int) (Math.random() * 5.0D) - 2;
            if (class67.field1016 < -8) {
                class67.field1016 = -8;
            }
            if (class67.field1016 > 8) {
                class67.field1016 = 8;
            }
            if (class111.field1805 < -16) {
                class111.field1805 = -16;
            }
            if (class111.field1805 > 16) {
                class111.field1805 = 16;
            }
        }
        int var9 = class67.field1016 >> 2 << 10;
        int var10 = class111.field1805 >> 1;
        int[][] var11 = new int[104][104];
        int[][] var12 = new int[104][104];
        for (int var13 = 0; var13 < var4; var13++) {
            byte[][] var14 = class253.field3745[var13];
            if (!class162.field2623) {
                int var15 = (int) Math.sqrt(5100.0D);
                int var16 = var15 * 768 >> 8;
                for (int var17 = 1; var17 < 103; var17++) {
                    for (int var18 = 1; var18 < 103; var18++) {
                        byte var19 = 74;
                        int var20 = class85.field1374[var13][var18 + 1][var17] - class85.field1374[var13][var18 - 1][var17];
                        int var21 = class85.field1374[var13][var18][var17 + 1] - class85.field1374[var13][var18][var17 - 1];
                        int var22 = (int) Math.sqrt((double) (var20 * var20 + var21 * var21 + 65536));
                        int var23 = (var20 << 8) / var22;
                        int var24 = (var21 << 8) / var22;
                        int var25 = -65536 / var22;
                        int var26 = (var14[var18][var17] >> 1) + ((var14[var18][var17 - 1] >> 2) + (var14[var18 + 1][var17] >> 3) + (var14[var18 + -1][var17] >> 2) + (var14[var18][var17 + 1] >> 3));
                        int var27 = (var24 * -50 + var23 * -50 + var25 * -10) / var16 + var19;
                        var12[var18][var17] = var27 - var26;
                    }
                }
            } else if (class229.field3531) {
                for (int var44 = 1; var44 < 103; var44++) {
                    for (int var45 = 1; var45 < 103; var45++) {
                        int var46 = (var14[var45 - 1][var44] >> 2) + (var14[var45][var44 + 1] >> 3) + (var14[var45][var44] >> 1) - (-(var14[var45 + 1][var44] >> 3) - (var14[var45][var44 - 1] >> 2));
                        byte var47 = 74;
                        var12[var45][var44] = var47 - var46;
                    }
                }
            } else {
                int var28 = (int) class261.field3876[0];
                int var29 = (int) class261.field3876[1];
                int var30 = (int) class261.field3876[2];
                int var31 = (int) Math.sqrt((double) (var28 * var28 + var29 * var29 + var30 * var30));
                int var32 = var31 * 1024 >> 8;
                for (int var33 = 1; var33 < 103; var33++) {
                    for (int var34 = 1; var34 < 103; var34++) {
                        byte var35 = 96;
                        int var36 = class85.field1374[var13][var34 + 1][var33] - class85.field1374[var13][var34 - 1][var33];
                        int var37 = class85.field1374[var13][var34][var33 + 1] - class85.field1374[var13][var34][var33 - 1];
                        int var38 = (int) Math.sqrt((double) (var36 * var36 + ((var37 * var37) + 65536)));
                        int var39 = (var36 << 8) / var38;
                        int var40 = -65536 / var38;
                        int var41 = (var37 << 8) / var38;
                        int var42 = (var14[var34 - 1][var33] >> 2) + (var14[var34 + 1][var33] >> 3) + (var14[var34][var33 + -1] >> 2) + (var14[var34][var33 + 1] >> 3) + (var14[var34][var33] >> 1);
                        int var43 = (var29 * var40 + var28 * var39 + var30 * var41) / var32 + var35;
                        var12[var34][var33] = var43 - ((int) ((float) var42 * 1.7F));
                    }
                }
            }
            for (int var48 = 0; var48 < 104; var48++) {
                class307.field4870[var48] = 0;
                class345.field5352[var48] = 0;
                client.field4117[var48] = 0;
                class55.field845[var48] = 0;
                class174.field2799[var48] = 0;
            }
            for (int var49 = -5; var49 < 104; var49++) {
                for (int var50 = 0; var50 < 104; var50++) {
                    int var51 = var49 + 5;
                    int var10002;
                    if (var51 < 104) {
                        int var52 = class58.field872[var13][var51][var50] & 0xFF;
                        if (var52 > 0) {
                            class141 var53 = class216.method1567((byte) -43, var52 - 1);
                            class307.field4870[var50] += var53.field2284;
                            class345.field5352[var50] += var53.field2286;
                            client.field4117[var50] += var53.field2289;
                            class55.field845[var50] += var53.field2287;
                            var10002 = class174.field2799[var50]++;
                        }
                    }
                    int var54 = var49 - 5;
                    if (var54 >= 0) {
                        int var55 = class58.field872[var13][var54][var50] & 0xFF;
                        if (var55 > 0) {
                            class141 var56 = class216.method1567((byte) -43, var55 - 1);
                            class307.field4870[var50] -= var56.field2284;
                            class345.field5352[var50] -= var56.field2286;
                            client.field4117[var50] -= var56.field2289;
                            class55.field845[var50] -= var56.field2287;
                            var10002 = class174.field2799[var50]--;
                        }
                    }
                }
                if (var49 >= 0) {
                    int var57 = 0;
                    int var58 = 0;
                    int var59 = 0;
                    int var60 = 0;
                    int var61 = 0;
                    for (int var62 = -5; var62 < 104; var62++) {
                        int var63 = var62 + 5;
                        int var64 = var62 - 5;
                        if (var63 < 104) {
                            var58 += client.field4117[var63];
                            var61 += class345.field5352[var63];
                            var57 += class307.field4870[var63];
                            var59 += class55.field845[var63];
                            var60 += class174.field2799[var63];
                        }
                        if (var64 >= 0) {
                            var61 -= class345.field5352[var64];
                            var58 -= client.field4117[var64];
                            var57 -= class307.field4870[var64];
                            var60 -= class174.field2799[var64];
                            var59 -= class55.field845[var64];
                        }
                        if (var62 >= 0 && var60 > 0) {
                            var11[var49][var62] = class99.method803(var61 / var60, var57 * 256 / var59, 217, var58 / var60);
                        }
                    }
                }
            }
            for (int var65 = 1; var65 < 103; var65++) {
                label768: for (int var66 = 1; var66 < 103; var66++) {
                    if (arg1 || class53.method450(2) || (class332.field5184[0][var65][var66] & 0x2) != 0 || (class332.field5184[var13][var65][var66] & 0x10) == 0 && class82.method646(-126, var13, var66, var65) == class310.field4900) {
                        if (class116.field1885 > var13) {
                            class116.field1885 = var13;
                        }
                        int var67 = class58.field872[var13][var65][var66] & 0xFF;
                        int var68 = class260.field3875[var13][var65][var66] & 0xFF;
                        if (var67 > 0 || var68 > 0) {
                            int var69 = class85.field1374[var13][var65][var66];
                            int var70 = class85.field1374[var13][var65 + 1][var66];
                            int var71 = class85.field1374[var13][var65 + 1][var66 + 1];
                            int var72 = class85.field1374[var13][var65][var66 + 1];
                            if (var13 > 0) {
                                boolean var73 = true;
                                if (var67 == 0 && class272.field4263[var13][var65][var66] != 0) {
                                    var73 = false;
                                }
                                if (var68 > 0 && !class49.method411(var68 - 1, false).field2893) {
                                    var73 = false;
                                }
                                if (var73 && var69 == var70 && var69 == var71 && var69 == var72) {
                                    class258.field3829[var13][var65][var66] = class251.method1740(class258.field3829[var13][var65][var66], 4);
                                }
                            }
                            int var74;
                            int var77;
                            if (var67 > 0) {
                                var74 = var11[var65][var66];
                                int var75 = (var74 & 0x7F) + var10;
                                if (var75 < 0) {
                                    var75 = 0;
                                } else if (var75 > 127) {
                                    var75 = 127;
                                }
                                int var76 = (var9 + var74 & 0xFC00) + (var74 & 0x380) + var75;
                                var77 = class40.field606[class221.method1614(2, var76, 96)];
                            } else {
                                var74 = -1;
                                var77 = 0;
                            }
                            int var78 = var12[var65][var66];
                            int var79 = var12[var65][var66 + 1];
                            int var80 = var12[var65 + 1][var66];
                            int var81 = var12[var65 + 1][var66 + 1];
                            if (var68 == 0) {
                                class136.method1050(var13, var65, var66, 0, 0, -1, var69, var70, var71, var72, class221.method1614(2, var74, var78), class221.method1614(2, var74, var80), class221.method1614(2, var74, var81), class221.method1614(2, var74, var79), 0, 0, 0, 0, var77, 0);
                                if (class162.field2623 && var13 > 0 && var74 != -1 && class216.method1567((byte) -43, var67 - 1).field2285) {
                                    class295.method2078(0, 0, true, false, var65, var66, var69 - class85.field1374[0][var65][var66], -class85.field1374[0][var65 + 1][var66] + var70, var71 - class85.field1374[0][var65 + 1][var66 + 1], -class85.field1374[0][var65][var66 + 1] + var72);
                                }
                                if (class162.field2623 && !arg1 && class241.field3608 != null && var13 == 0) {
                                    for (int var82 = var65 - 1; var82 <= var65 + 1; var82++) {
                                        for (int var83 = var66 - 1; var83 <= var66 + 1; var83++) {
                                            if ((var65 != var82 || var66 != var83) && var82 >= 0 && var82 < 104 && var83 >= 0 && var83 < 104) {
                                                int var84 = class260.field3875[var13][var82][var83] & 0xFF;
                                                if (var84 != 0) {
                                                    class183 var85 = class49.method411(var84 - 1, false);
                                                    if (var85.field2898 != -1 && class12.method170((byte) -35, class40.field614.method257(var85.field2898, 255))) {
                                                        class241.field3608[var65][var66] = (var85.field2906 << 24) + var85.field2895;
                                                        continue label768;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                int var86 = class272.field4263[var13][var65][var66] + 1;
                                byte var87 = class201.field3096[var13][var65][var66];
                                class183 var88 = class49.method411(var68 - 1, false);
                                if (class162.field2623 && !arg1 && class241.field3608 != null && var13 == 0) {
                                    if (var88.field2898 != -1 && class12.method170((byte) -35, class40.field614.method257(var88.field2898, arg3 ^ 0x7F))) {
                                        class241.field3608[var65][var66] = (var88.field2906 << 24) + var88.field2895;
                                    } else {
                                        label749: for (int var89 = var65 - 1; var89 <= var65 + 1; var89++) {
                                            for (int var90 = var66 - 1; var90 <= var66 + 1; var90++) {
                                                if ((var65 != var89 || var66 != var90) && var89 >= 0 && var89 < 104 && var90 >= 0 && var90 < 104) {
                                                    int var91 = class260.field3875[var13][var89][var90] & 0xFF;
                                                    if (var91 != 0) {
                                                        class183 var92 = class49.method411(var91 - 1, false);
                                                        if (var92.field2898 != -1 && class12.method170((byte) -35, class40.field614.method257(var92.field2898, 255))) {
                                                            class241.field3608[var65][var66] = (var92.field2906 << 24) + var92.field2895;
                                                            break label749;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                int var93 = var88.field2898;
                                if (var93 >= 0 && !class40.field614.method263(false, var93)) {
                                    var93 = -1;
                                }
                                int var94;
                                int var95;
                                if (var93 >= 0) {
                                    var94 = -1;
                                    var95 = class40.field606[class297.method2108((byte) -105, class40.field614.method251(false, var93), 96)];
                                } else if (var88.field2903 == -1) {
                                    var94 = -2;
                                    var95 = 0;
                                } else {
                                    var94 = var88.field2903;
                                    int var96 = (var94 & 0x7F) + var10;
                                    if (var96 < 0) {
                                        var96 = 0;
                                    } else if (var96 > 127) {
                                        var96 = 127;
                                    }
                                    int var97 = (var9 + var94 & 0xFC00) + (var94 & 0x380) + var96;
                                    var95 = class40.field606[class297.method2108((byte) 84, var97, 96)];
                                }
                                if (var88.field2897 >= 0) {
                                    int var98 = var88.field2897;
                                    int var99 = (var98 & 0x7F) + var10;
                                    if (var99 < 0) {
                                        var99 = 0;
                                    } else if (var99 > 127) {
                                        var99 = 127;
                                    }
                                    int var100 = (var9 + var98 & 0xFC00) + (var98 & 0x380) + var99;
                                    var95 = class40.field606[class297.method2108((byte) 73, var100, 96)];
                                }
                                class136.method1050(var13, var65, var66, var86, var87, var93, var69, var70, var71, var72, class221.method1614(2, var74, var78), class221.method1614(2, var74, var80), class221.method1614(2, var74, var81), class221.method1614(2, var74, var79), class297.method2108((byte) 111, var94, var78), class297.method2108((byte) -121, var94, var80), class297.method2108((byte) -47, var94, var81), class297.method2108((byte) 90, var94, var79), var77, var95);
                                if (class162.field2623 && var13 > 0) {
                                    class295.method2078(var86, var87, var94 == -2 || !var88.field2889, var74 == -1 || !class216.method1567((byte) -43, var67 - 1).field2285, var65, var66, var69 - class85.field1374[0][var65][var66], -class85.field1374[0][var65 + 1][var66] + var70, var71 - class85.field1374[0][var65 + 1][var66 + 1], var72 - class85.field1374[0][var65][var66 - -1]);
                                }
                            }
                        }
                    }
                }
            }
            if (class162.field2623) {
                float[][] var101 = new float[105][105];
                float[][] var102 = new float[105][105];
                float[][] var103 = new float[105][105];
                int[][] var104 = class85.field1374[var13];
                int var105 = 1;
                while (true) {
                    if (var105 > 103) {
                        if (arg1) {
                            class256[] var110 = class185.method1344(var13, class58.field872[var13], var12, class332.field5184, arg2, var11, -61, class272.field4263[var13], var103, class9.field220[0], class85.field1374[var13], class241.field3608, class260.field3875[var13], var102, var101, class201.field3096[var13]);
                            class75.method597(var13, var110);
                            break;
                        }
                        class256[] var111 = class185.method1344(var13, class58.field872[var13], var12, class332.field5184, arg2, var11, -91, class272.field4263[var13], var103, (int[][]) null, class85.field1374[var13], (int[][]) null, class260.field3875[var13], var102, var101, class201.field3096[var13]);
                        class256[] var112 = class343.method2379(class260.field3875[var13], class272.field4263[var13], class332.field5184, class201.field3096[var13], var101, false, var12, var103, class58.field872[var13], var102, var13, class85.field1374[var13]);
                        class256[] var113 = new class256[var111.length + var112.length];
                        for (int var114 = 0; var114 < var111.length; var114++) {
                            var113[var114] = var111[var114];
                        }
                        for (int var115 = 0; var115 < var112.length; var115++) {
                            var113[var111.length + var115] = var112[var115];
                        }
                        class75.method597(var13, var113);
                        method2127(var102, class219.field3421, class58.field872[var13], class260.field3875[var13], var103, class201.field3096[var13], class272.field4263[var13], class219.field3426, class85.field1374[var13], var13, true, var101);
                        break;
                    }
                    for (int var106 = 1; var106 <= 103; var106++) {
                        int var107 = var104[var106][var105 + 1] - var104[var106][var105 - 1];
                        int var108 = var104[var106 + 1][var105] - var104[var106 - 1][var105];
                        float var109 = (float) Math.sqrt((double) (var108 * var108 + var107 * var107 + 65536));
                        var101[var106][var105] = (float) var108 / var109;
                        var102[var106][var105] = -256.0F / var109;
                        var103[var106][var105] = (float) var107 / var109;
                    }
                    var105++;
                }
            }
            class58.field872[var13] = (byte[][]) null;
            class260.field3875[var13] = (byte[][]) null;
            class272.field4263[var13] = (byte[][]) null;
            class201.field3096[var13] = (byte[][]) null;
            class253.field3745[var13] = (byte[][]) null;
        }
        if (arg3 != 128) {
            field4797 = -4;
        }
        class83.method654(-50, -10, -50);
        if (arg1) {
            return;
        }
        for (int var116 = 0; var116 < 104; var116++) {
            for (int var117 = 0; var117 < 104; var117++) {
                if ((class332.field5184[1][var116][var117] & 0x2) == 2) {
                    class108.method859(var116, var117);
                }
            }
        }
        for (int var118 = 0; var118 < 4; var118++) {
            for (int var119 = 0; var119 <= 104; var119++) {
                for (int var120 = 0; var120 <= 104; var120++) {
                    if ((class258.field3829[var118][var120][var119] & 0x1) != 0) {
                        int var121 = var119;
                        int var122 = var118;
                        int var123 = var119;
                        while (var121 > 0 && (class258.field3829[var118][var120][var121 - 1] & 0x1) != 0) {
                            var121--;
                        }
                        int var124 = var118;
                        while (var123 < 104 && (class258.field3829[var118][var120][var123 + 1] & 0x1) != 0) {
                            var123++;
                        }
                        label449: while (var122 > 0) {
                            for (int var125 = var121; var125 <= var123; var125++) {
                                if ((class258.field3829[var122 - 1][var120][var125] & 0x1) == 0) {
                                    break label449;
                                }
                            }
                            var122--;
                        }
                        label438: while (var124 < 3) {
                            for (int var126 = var121; var126 <= var123; var126++) {
                                if ((class258.field3829[var124 + 1][var120][var126] & 0x1) == 0) {
                                    break label438;
                                }
                            }
                            var124++;
                        }
                        int var127 = (var124 - (var122 - 1)) * (var123 + 1 - var121);
                        if (var127 >= 8) {
                            short var128 = 240;
                            int var129 = class85.field1374[var124][var120][var121] - var128;
                            int var130 = class85.field1374[var122][var120][var121];
                            class244.method1725(1, var120 * 128, var120 * 128, var121 * 128, var123 * 128 + 128, var129, var130);
                            for (int var131 = var122; var131 <= var124; var131++) {
                                for (int var132 = var121; var132 <= var123; var132++) {
                                    class258.field3829[var131][var120][var132] = class164.method1234(class258.field3829[var131][var120][var132], -2);
                                }
                            }
                        }
                    }
                    if ((class258.field3829[var118][var120][var119] & 0x2) != 0) {
                        int var133 = var120;
                        int var134 = var120;
                        while (var133 < 104 && (class258.field3829[var118][var133 + 1][var119] & 0x2) != 0) {
                            var133++;
                        }
                        int var135 = var118;
                        while (var134 > 0 && (class258.field3829[var118][var134 - 1][var119] & 0x2) != 0) {
                            var134--;
                        }
                        int var136;
                        label503: for (var136 = var118; var136 > 0; var136--) {
                            for (int var137 = var134; var137 <= var133; var137++) {
                                if ((class258.field3829[var136 - 1][var137][var119] & 0x2) == 0) {
                                    break label503;
                                }
                            }
                        }
                        label492: while (var135 < 3) {
                            for (int var138 = var134; var138 <= var133; var138++) {
                                if ((class258.field3829[var135 + 1][var138][var119] & 0x2) == 0) {
                                    break label492;
                                }
                            }
                            var135++;
                        }
                        int var139 = (var133 + 1 - var134) * (var135 + 1 - var136);
                        if (var139 >= 8) {
                            short var140 = 240;
                            int var141 = class85.field1374[var135][var134][var119] - var140;
                            int var142 = class85.field1374[var136][var134][var119];
                            class244.method1725(2, var134 * 128, var133 * 128 + 128, var119 * 128, var119 * 128, var141, var142);
                            for (int var143 = var136; var143 <= var135; var143++) {
                                for (int var144 = var134; var144 <= var133; var144++) {
                                    class258.field3829[var143][var144][var119] = class164.method1234(class258.field3829[var143][var144][var119], -3);
                                }
                            }
                        }
                    }
                    if ((class258.field3829[var118][var120][var119] & 0x4) != 0) {
                        int var145 = var120;
                        int var146 = var120;
                        int var147;
                        for (var147 = var119; var147 > 0 && (class258.field3829[var118][var120][var147 - 1] & 0x4) != 0; var147--) {
                        }
                        int var148;
                        for (var148 = var119; var148 < 104 && (class258.field3829[var118][var120][var148 + 1] & 0x4) != 0; var148++) {
                        }
                        label558: while (var145 > 0) {
                            for (int var149 = var147; var149 <= var148; var149++) {
                                if ((class258.field3829[var118][var145 - 1][var149] & 0x4) == 0) {
                                    break label558;
                                }
                            }
                            var145--;
                        }
                        label547: while (var146 < 104) {
                            for (int var150 = var147; var150 <= var148; var150++) {
                                if ((class258.field3829[var118][var146 + 1][var150] & 0x4) == 0) {
                                    break label547;
                                }
                            }
                            var146++;
                        }
                        if (((var148 + 1 - var147) * (var146 + 1 - var145)) >= 4) {
                            int var151 = class85.field1374[var118][var145][var147];
                            class244.method1725(4, var145 * 128, var146 * 128 + 128, var147 * 128, var148 * 128 + 128, var151, var151);
                            for (int var152 = var145; var152 <= var146; var152++) {
                                for (int var153 = var147; var153 <= var148; var153++) {
                                    class258.field3829[var118][var152][var153] = class164.method1234(class258.field3829[var118][var152][var153], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "([[FI[[B[[B[[F[[B[[B[Lck;[[IIZ[[F)V", line = 994)
    private static final void method2127(float[][] arg0, int arg1, byte[][] arg2, byte[][] arg3, float[][] arg4, byte[][] arg5, byte[][] arg6, class253[] arg7, int[][] arg8, int arg9, boolean arg10, float[][] arg11) {
        field4803++;
        for (int var12 = 0; var12 < arg1; var12++) {
            class253 var13 = arg7[var12];
            if (var13.field3736 == arg9) {
                class189 var14 = new class189();
                int var15 = (var13.field3725 >> 7) - var13.field3746;
                int var16 = (var13.field3747 >> 7) - var13.field3746;
                int var17 = (var13.field3747 >> 7) + var13.field3746;
                if (var17 > 103) {
                    var17 = 103;
                }
                int var18 = 0;
                if (var16 < 0) {
                    var18 -= var16;
                    var16 = 0;
                }
                for (int var19 = var16; var19 <= var17; var19++) {
                    short var20 = var13.field3732[var18];
                    int var21 = (var20 >> 8) + var15;
                    int var22 = var21 + (var20 & 0xFF) - 1;
                    if (var22 > 103) {
                        var22 = 103;
                    }
                    if (var21 < 0) {
                        var21 = 0;
                    }
                    for (int var23 = var21; var23 <= var22; var23++) {
                        int var24 = arg3[var23][var19] & 0xFF;
                        boolean var25 = false;
                        int var26 = arg2[var23][var19] & 0xFF;
                        if (var26 == 0) {
                            if (var24 == 0) {
                                continue;
                            }
                            class183 var31 = class49.method411(var24 - 1, false);
                            if (var31.field2903 == -1) {
                                continue;
                            }
                            if (arg6[var23][var19] != 0) {
                                int[] var32 = class122.field1995[arg6[var23][var19]];
                                var14.field2966 += ((var32.length >> 1) - 2) * 3;
                                var14.field2962 += var32.length >> 1;
                                continue;
                            }
                        } else if (var24 != 0) {
                            class183 var27 = class49.method411(var24 - 1, false);
                            if (var27.field2903 == -1) {
                                byte var29 = arg6[var23][var19];
                                if (var29 != 0) {
                                    int[] var30 = class185.field2937[var29];
                                    var14.field2966 += ((var30.length >> 1) - 2) * 3;
                                    var14.field2962 += var30.length >> 1;
                                }
                                continue;
                            }
                            byte var28 = arg6[var23][var19];
                            if (var28 != 0) {
                                var25 = true;
                            }
                        }
                        class144 var33 = class36.method321(arg9, var23, var19);
                        if (var33 != null) {
                            int var34 = (int) (var33.field2344 >> 14) & 0x3F;
                            if (var34 == 9) {
                                int var35 = (int) (var33.field2344 >> 20) & 0x3;
                                int[] var36 = null;
                                if ((var35 & 0x1) == 0) {
                                    boolean var37 = (var23 + 1) <= var22;
                                    boolean var38 = (var23 - 1) >= var21;
                                    if (!var38 && var17 >= var19 + 1) {
                                        short var39 = var13.field3732[var18 + 1];
                                        int var40 = (var39 >> 8) + var15;
                                        int var41 = var40 + (var39 & 0xFF);
                                        var38 = var40 < var23 && var41 > var23;
                                    }
                                    if (!var37 && var16 <= (var19 - 1)) {
                                        short var42 = var13.field3732[var18 - 1];
                                        int var43 = (var42 >> 8) + var15;
                                        int var44 = (var42 & 0xFF) + var43;
                                        var37 = var23 > var43 && var44 > var23;
                                    }
                                    if (var38 && var37) {
                                        var36 = class122.field1995[0];
                                    } else if (var38) {
                                        var36 = class122.field1995[1];
                                    } else if (var37) {
                                        var36 = class122.field1995[1];
                                    }
                                } else {
                                    boolean var45 = var21 <= (var23 - 1);
                                    boolean var46 = var23 + 1 <= var22;
                                    if (!var45 && (var19 - 1) >= var16) {
                                        short var47 = var13.field3732[var18 - 1];
                                        int var48 = (var47 >> 8) + var15;
                                        int var49 = (var47 & 0xFF) + var48;
                                        var45 = var23 > var48 && var49 > var23;
                                    }
                                    if (!var46 && var19 + 1 <= var17) {
                                        short var50 = var13.field3732[var18 + 1];
                                        int var51 = (var50 >> 8) + var15;
                                        int var52 = var51 + (var50 & 0xFF);
                                        var46 = var23 > var51 && var23 < var52;
                                    }
                                    if (var45 && var46) {
                                        var36 = class122.field1995[0];
                                    } else if (var45) {
                                        var36 = class122.field1995[1];
                                    } else if (var46) {
                                        var36 = class122.field1995[1];
                                    }
                                }
                                if (var36 != null) {
                                    var14.field2966 += ((var36.length >> 1) - 2) * 3;
                                    var14.field2962 += var36.length >> 1;
                                }
                                continue;
                            }
                        }
                        if (var25) {
                            int[] var53 = class122.field1995[arg6[var23][var19]];
                            int[] var54 = class185.field2937[arg6[var23][var19]];
                            var14.field2966 += (var53.length >> 1) * 3 - 6;
                            var14.field2966 += ((var54.length >> 1) - 2) * 3;
                            var14.field2962 += var53.length >> 1;
                            var14.field2962 += var54.length >> 1;
                        } else {
                            int[] var55 = class122.field1995[0];
                            var14.field2966 += ((var55.length >> 1) - 2) * 3;
                            var14.field2962 += var55.length >> 1;
                        }
                    }
                    var18++;
                }
                var14.method1364();
                int var56 = 0;
                if (((var13.field3747 >> 7) - var13.field3746) < 0) {
                    var56 -= (var13.field3747 >> 7) - var13.field3746;
                }
                for (int var57 = var16; var57 <= var17; var57++) {
                    short var58 = var13.field3732[var56];
                    int var59 = (var58 >> 8) + var15;
                    int var60 = (var58 & 0xFF) + var59 - 1;
                    if (var60 > 103) {
                        var60 = 103;
                    }
                    if (var59 < 0) {
                        var59 = 0;
                    }
                    for (int var61 = var59; var61 <= var60; var61++) {
                        int var62 = arg2[var61][var57] & 0xFF;
                        byte var63 = arg5[var61][var57];
                        int var64 = arg3[var61][var57] & 0xFF;
                        boolean var65 = false;
                        if (var62 == 0) {
                            if (var64 == 0) {
                                continue;
                            }
                            class183 var66 = class49.method411(var64 - 1, false);
                            if (var66.field2903 == -1) {
                                continue;
                            }
                            if (arg6[var61][var57] != 0) {
                                class9.method145(class122.field1995[arg6[var61][var57]], var13, -108, var61, arg5[var61][var57], arg0, var57, var14, arg4, arg11, arg8);
                                continue;
                            }
                        } else if (var64 != 0) {
                            class183 var67 = class49.method411(var64 - 1, false);
                            if (var67.field2903 == -1) {
                                class9.method145(class185.field2937[arg6[var61][var57]], var13, -91, var61, arg5[var61][var57], arg0, var57, var14, arg4, arg11, arg8);
                                continue;
                            }
                            byte var68 = arg6[var61][var57];
                            if (var68 != 0) {
                                var65 = true;
                            }
                        }
                        class144 var69 = class36.method321(arg9, var61, var57);
                        if (var69 != null) {
                            int var70 = (int) (var69.field2344 >> 14) & 0x3F;
                            if (var70 == 9) {
                                int[] var71 = null;
                                int var72 = (int) (var69.field2344 >> 20) & 0x3;
                                if ((var72 & 0x1) == 0) {
                                    boolean var81 = var60 >= var61 + 1;
                                    boolean var82 = var59 <= (var61 - 1);
                                    if (!var82 && var57 + 1 <= var17) {
                                        short var83 = var13.field3732[var56 + 1];
                                        int var84 = (var83 >> 8) + var15;
                                        int var85 = var84 + (var83 & 0xFF);
                                        var82 = var84 < var61 && var61 < var85;
                                    }
                                    if (!var81 && var16 <= (var57 - 1)) {
                                        short var86 = var13.field3732[var56 - 1];
                                        int var87 = (var86 >> 8) + var15;
                                        int var88 = (var86 & 0xFF) + var87;
                                        var81 = var87 < var61 && var61 < var88;
                                    }
                                    if (var82 && var81) {
                                        var71 = class122.field1995[0];
                                    } else if (var82) {
                                        var63 = 1;
                                        var71 = class122.field1995[1];
                                    } else if (var81) {
                                        var71 = class122.field1995[1];
                                        var63 = 3;
                                    }
                                } else {
                                    boolean var73 = var61 + 1 <= var60;
                                    boolean var74 = (var61 - 1) >= var59;
                                    if (!var74 && var16 <= (var57 - 1)) {
                                        short var75 = var13.field3732[var56 - 1];
                                        int var76 = (var75 >> 8) + var15;
                                        int var77 = (var75 & 0xFF) + var76;
                                        var74 = var76 < var61 && var77 > var61;
                                    }
                                    if (!var73 && var17 >= (var57 + 1)) {
                                        short var78 = var13.field3732[var56 + 1];
                                        int var79 = var15 + (var78 >> 8);
                                        int var80 = (var78 & 0xFF) + var79;
                                        var73 = var79 < var61 && var80 > var61;
                                    }
                                    if (var74 && var73) {
                                        var71 = class122.field1995[0];
                                    } else if (var74) {
                                        var71 = class122.field1995[1];
                                        var63 = 0;
                                    } else if (var73) {
                                        var63 = 2;
                                        var71 = class122.field1995[1];
                                    }
                                }
                                if (var71 != null) {
                                    class9.method145(var71, var13, -119, var61, var63, arg0, var57, var14, arg4, arg11, arg8);
                                }
                                continue;
                            }
                        }
                        if (var65) {
                            class9.method145(class185.field2937[arg6[var61][var57]], var13, -122, var61, arg5[var61][var57], arg0, var57, var14, arg4, arg11, arg8);
                            class9.method145(class122.field1995[arg6[var61][var57]], var13, -93, var61, arg5[var61][var57], arg0, var57, var14, arg4, arg11, arg8);
                        } else {
                            class9.method145(class122.field1995[0], var13, -106, var61, var63, arg0, var57, var14, arg4, arg11, arg8);
                        }
                    }
                    var56++;
                }
                if (var14.field2974 > 0 && var14.field2960 > 0) {
                    var14.method1366();
                    var13.field3717 = var14;
                }
            }
        }
        if (!arg10) {
            field4800 = (String[]) null;
        }
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(I)V", line = 1521)
    public static final void method2128(int arg0) {
        if (arg0 != -8749) {
            method2127((float[][]) ((float[][]) null), -38, (byte[][]) ((byte[][]) null), (byte[][]) ((byte[][]) null), (float[][]) ((float[][]) null), (byte[][]) ((byte[][]) null), (byte[][]) ((byte[][]) null), (class253[]) null, (int[][]) ((int[][]) null), 78, true, (float[][]) ((float[][]) null));
        }
        class147.field2416.method2283((byte) 77);
        field4796++;
        class18.field347.method2283((byte) 77);
        class13.field286.method2283((byte) 77);
    }

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "(I)V", line = 1542)
    public static void method2129(int arg0) {
        field4798 = null;
        if (arg0 < -6) {
            field4799 = null;
            field4800 = null;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(II)[F", line = 1555)
    public static final float[] method2130(int arg0, int arg1) {
        field4802++;
        float var2 = class261.method1812() + class261.method1815();
        int var3 = class261.method1818();
        class140.field2271[3] = 1.0F;
        float var4 = (float) ((arg0 & var3) >> 16) / 255.0F;
        float var5 = (float) ((var3 & 0xFF9D) >> 8) / 255.0F;
        float var6 = (float) (var3 & 0xFF) / 255.0F;
        float var7 = 0.58823526F;
        class140.field2271[2] = var2 * var7 * (float) class164.method1234(255, arg1) / 255.0F * var6;
        class140.field2271[1] = var2 * var7 * var5 * ((float) class164.method1234(255, arg1 >> 8) / 255.0F);
        class140.field2271[0] = var2 * var7 * var4 * ((float) class164.method1234(255, arg1 >> 16) / 255.0F);
        return class140.field2271;
    }

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "(I)V", line = 1588)
    public static final void method2131(int arg0) {
        if (arg0 > -81) {
            field4798 = (int[]) null;
        }
        class337.field5206.method2282((byte) -126);
        field4794++;
    }
}
