import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class23 {

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "Ljava/lang/String;")
    public static String field343 = "K";

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(III)V", line = 5)
    public static final void method132(int arg0, int arg1, int arg2) {
        field342++;
        class309 var3 = class185.method1286(false, arg1);
        int var4 = var3.field4623;
        int var5 = var3.field4622;
        int var6 = var3.field4621;
        if (arg2 != -14154) {
            method134(36, (int[][][]) ((int[][][]) null), (class96[]) null, false);
        }
        int var7 = class267.field4067[var5 - var6];
        if (arg0 < 0 || arg0 > var7) {
            arg0 = 0;
        }
        int var8 = var7 << var6;
        class272.method1999(class307.field4594[var4] & ~var8 | arg0 << var6 & var8, -87, var4);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V", line = 33)
    public static void method133(int arg0) {
        if (arg0 != -1) {
            method132(122, -93, 115);
        }
        field343 = null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[[[I[Lo;Z)V", line = 47)
    public static final void method134(int arg0, int[][][] arg1, class96[] arg2, boolean arg3) {
        field344++;
        if (!arg3) {
            for (int var4 = 0; var4 < 4; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    for (int var6 = 0; var6 < 104; var6++) {
                        if ((class230.field3491[var4][var5][var6] & 0x1) == 1) {
                            int var7 = var4;
                            if ((class230.field3491[1][var5][var6] & 0x2) == 2) {
                                var7 = var4 - 1;
                            }
                            if (var7 >= 0) {
                                arg2[var7].method756(var5, 2961, var6);
                            }
                        }
                    }
                }
            }
            class217.field3205 += (int) (Math.random() * 5.0D) - 2;
            class276.field4193 += (int) (Math.random() * 5.0D) - 2;
            if (class276.field4193 < -8) {
                class276.field4193 = -8;
            }
            if (class276.field4193 > 8) {
                class276.field4193 = 8;
            }
            if (class217.field3205 < -16) {
                class217.field3205 = -16;
            }
            if (class217.field3205 > 16) {
                class217.field3205 = 16;
            }
        }
        byte var8;
        if (arg3) {
            var8 = 1;
        } else {
            var8 = 4;
        }
        int var9 = class276.field4193 >> 2 << 10;
        int var10 = class217.field3205 >> 1;
        int[][] var11 = new int[104][104];
        int[][] var12 = new int[104][104];
        for (int var13 = arg0; var13 < var8; var13++) {
            byte[][] var14 = class102.field1454[var13];
            if (!class141.field2031) {
                int var15 = (int) Math.sqrt(5100.0D);
                int var16 = var15 * 768 >> 8;
                for (int var17 = 1; var17 < 103; var17++) {
                    for (int var18 = 1; var18 < 103; var18++) {
                        byte var19 = 74;
                        int var20 = class132.field1930[var13][var18][var17 + 1] - class132.field1930[var13][var18][var17 - 1];
                        int var21 = class132.field1930[var13][var18 + 1][var17] - class132.field1930[var13][var18 - 1][var17];
                        int var22 = (int) Math.sqrt((double) (var20 * var20 + var21 * var21 + 65536));
                        int var23 = -65536 / var22;
                        int var24 = (var21 << 8) / var22;
                        int var25 = (var20 << 8) / var22;
                        int var26 = (var24 * -50 - (-(var23 * -10) - (var25 * -50))) / var16 + var19;
                        int var27 = (var14[var18][var17 - 1] >> 2) + (var14[var18 + 1][var17] >> 3) + (var14[var18][var17 + 1] >> 3) + (var14[var18 + -1][var17] >> 2) + (var14[var18][var17] >> 1);
                        var12[var18][var17] = var26 - var27;
                    }
                }
            } else if (class98.field1379) {
                for (int var28 = 1; var28 < 103; var28++) {
                    for (int var29 = 1; var29 < 103; var29++) {
                        byte var30 = 74;
                        int var31 = (var14[var29][var28] >> 1) + (var14[var29][var28 + 1] >> 3) + ((var14[var29 + -1][var28] >> 2) - (-(var14[var29 + 1][var28] >> 3) - (var14[var29][var28 - 1] >> 2)));
                        var12[var29][var28] = var30 - var31;
                    }
                }
            } else {
                int var32 = (int) class222.field3330[1];
                int var33 = (int) class222.field3330[0];
                int var34 = (int) class222.field3330[2];
                int var35 = (int) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
                int var36 = var35 * 1024 >> 8;
                for (int var37 = 1; var37 < 103; var37++) {
                    for (int var38 = 1; var38 < 103; var38++) {
                        int var39 = class132.field1930[var13][var38 + 1][var37] - class132.field1930[var13][var38 - 1][var37];
                        byte var40 = 96;
                        int var41 = class132.field1930[var13][var38][var37 + 1] - class132.field1930[var13][var38][var37 - 1];
                        int var42 = (int) Math.sqrt((double) (var39 * var39 + (var41 * var41) + 65536));
                        int var43 = (var39 << 8) / var42;
                        int var44 = (var41 << 8) / var42;
                        int var45 = -65536 / var42;
                        int var46 = (var34 * var44 + (var33 * var43 + (var32 * var45))) / var36 + var40;
                        int var47 = (var14[var38][var37 + 1] >> 3) + (var14[var38][var37] >> 1) + (var14[var38 - -1][var37] >> 3) + (var14[var38 + -1][var37] >> 2) + (var14[var38][var37 - 1] >> 2);
                        var12[var38][var37] = var46 - ((int) ((float) var47 * 1.7F));
                    }
                }
            }
            for (int var48 = 0; var48 < 104; var48++) {
                class19.field304[var48] = 0;
                class352.field5424[var48] = 0;
                class229.field3469[var48] = 0;
                class154.field2201[var48] = 0;
                class230.field3476[var48] = 0;
            }
            for (int var49 = -5; var49 < 104; var49++) {
                for (int var50 = 0; var50 < 104; var50++) {
                    int var51 = var49 + 5;
                    int var10002;
                    if (var51 < 104) {
                        int var52 = class126.field1826[var13][var51][var50] & 0xFF;
                        if (var52 > 0) {
                            class37 var53 = class165.method1177(26277, var52 - 1);
                            class19.field304[var50] += var53.field553;
                            class352.field5424[var50] += var53.field540;
                            class229.field3469[var50] += var53.field555;
                            class154.field2201[var50] += var53.field543;
                            var10002 = class230.field3476[var50]++;
                        }
                    }
                    int var54 = var49 - 5;
                    if (var54 >= 0) {
                        int var55 = class126.field1826[var13][var54][var50] & 0xFF;
                        if (var55 > 0) {
                            class37 var56 = class165.method1177(26277, var55 - 1);
                            class19.field304[var50] -= var56.field553;
                            class352.field5424[var50] -= var56.field540;
                            class229.field3469[var50] -= var56.field555;
                            class154.field2201[var50] -= var56.field543;
                            var10002 = class230.field3476[var50]--;
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
                            var58 += class352.field5424[var63];
                            var61 += class230.field3476[var63];
                            var59 += class154.field2201[var63];
                            var60 += class229.field3469[var63];
                            var57 += class19.field304[var63];
                        }
                        if (var64 >= 0) {
                            var61 -= class230.field3476[var64];
                            var59 -= class154.field2201[var64];
                            var58 -= class352.field5424[var64];
                            var57 -= class19.field304[var64];
                            var60 -= class229.field3469[var64];
                        }
                        if (var62 >= 0 && var61 > 0) {
                            var11[var49][var62] = class133.method958(var60 / var61, (byte) 115, var57 * 256 / var59, var58 / var61);
                        }
                    }
                }
            }
            for (int var65 = 1; var65 < 103; var65++) {
                label765: for (int var66 = 1; var66 < 103; var66++) {
                    if (arg3 || class3.method15((byte) 93) || (class230.field3491[0][var65][var66] & 0x2) != 0 || (class230.field3491[var13][var65][var66] & 0x10) == 0 && class137.method972(var66, false, var65, var13) == class277.field4217) {
                        if (class215.field3169 > var13) {
                            class215.field3169 = var13;
                        }
                        int var67 = class126.field1826[var13][var65][var66] & 0xFF;
                        int var68 = class261.field3913[var13][var65][var66] & 0xFF;
                        if (var67 > 0 || var68 > 0) {
                            int var69 = class132.field1930[var13][var65][var66];
                            int var70 = class132.field1930[var13][var65 + 1][var66];
                            int var71 = class132.field1930[var13][var65 + 1][var66 + 1];
                            int var72 = class132.field1930[var13][var65][var66 + 1];
                            if (var13 > 0) {
                                boolean var73 = true;
                                if (var67 == 0 && class300.field4492[var13][var65][var66] != 0) {
                                    var73 = false;
                                }
                                if (var68 > 0 && !class1.method5(4, var68 - 1).field3625) {
                                    var73 = false;
                                }
                                if (var73 && var69 == var70 && var69 == var71 && var69 == var72) {
                                    class228.field3462[var13][var65][var66] = class81.method666(class228.field3462[var13][var65][var66], 4);
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
                                var77 = class345.field5349[class64.method530(96, var76, 120)];
                            } else {
                                var77 = 0;
                                var74 = -1;
                            }
                            int var78 = var12[var65][var66];
                            int var79 = var12[var65 + 1][var66];
                            int var80 = var12[var65][var66 + 1];
                            int var81 = var12[var65 + 1][var66 + 1];
                            if (var68 == 0) {
                                class314.method2194(var13, var65, var66, 0, 0, -1, var69, var70, var71, var72, class64.method530(var78, var74, 51), class64.method530(var79, var74, -106), class64.method530(var81, var74, 60), class64.method530(var80, var74, 83), 0, 0, 0, 0, var77, 0);
                                if (class141.field2031 && var13 > 0 && var74 != -1 && class165.method1177(26277, var67 - 1).field556) {
                                    class24.method147(0, 0, true, false, var65, var66, var69 - class132.field1930[0][var65][var66], -class132.field1930[0][var65 - -1][var66] + var70, var71 - class132.field1930[0][var65 + 1][var66 + 1], -class132.field1930[0][var65][var66 + 1] + var72);
                                }
                                if (class141.field2031 && !arg3 && class165.field2358 != null && var13 == 0) {
                                    for (int var82 = var65 - 1; var82 <= (var65 + 1); var82++) {
                                        for (int var83 = var66 - 1; var83 <= var66 + 1; var83++) {
                                            if ((var65 != var82 || var66 != var83) && var82 >= 0 && var82 < 104 && var83 >= 0 && var83 < 104) {
                                                int var84 = class261.field3913[var13][var82][var83] & 0xFF;
                                                if (var84 != 0) {
                                                    class243 var85 = class1.method5(arg0 ^ 0x4, var84 - 1);
                                                    if (var85.field3618 != -1 && class173.method1213(arg0 ^ 0x60EF, class345.field5336.method586(var85.field3618, 13078))) {
                                                        class165.field2358[var65][var66] = (var85.field3619 << 24) + var85.field3616;
                                                        continue label765;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                byte var86 = class132.field1933[var13][var65][var66];
                                int var87 = class300.field4492[var13][var65][var66] + 1;
                                class243 var88 = class1.method5(4, var68 - 1);
                                if (class141.field2031 && !arg3 && class165.field2358 != null && var13 == 0) {
                                    if (var88.field3618 != -1 && class173.method1213(24815, class345.field5336.method586(var88.field3618, arg0 + 13078))) {
                                        class165.field2358[var65][var66] = (var88.field3619 << 24) + var88.field3616;
                                    } else {
                                        label746: for (int var89 = var65 - 1; var89 <= (var65 + 1); var89++) {
                                            for (int var90 = var66 - 1; var90 <= (var66 + 1); var90++) {
                                                if ((var65 != var89 || var66 != var90) && var89 >= 0 && var89 < 104 && var90 >= 0 && var90 < 104) {
                                                    int var91 = class261.field3913[var13][var89][var90] & 0xFF;
                                                    if (var91 != 0) {
                                                        class243 var92 = class1.method5(4, var91 - 1);
                                                        if (var92.field3618 != -1 && class173.method1213(24815, class345.field5336.method586(var92.field3618, 13078))) {
                                                            class165.field2358[var65][var66] = (var92.field3619 << 24) + var92.field3616;
                                                            break label746;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                int var93 = var88.field3618;
                                if (var93 >= 0 && !class345.field5336.method568(var93, arg0 ^ 0xFFFFF8DE)) {
                                    var93 = -1;
                                }
                                int var94;
                                int var95;
                                if (var93 >= 0) {
                                    var95 = class345.field5349[class322.method2238(96, class345.field5336.method591(var93, -124), (byte) -122)];
                                    var94 = -1;
                                } else if (var88.field3627 == -1) {
                                    var94 = -2;
                                    var95 = 0;
                                } else {
                                    var94 = var88.field3627;
                                    int var96 = (var94 & 0x7F) + var10;
                                    if (var96 < 0) {
                                        var96 = 0;
                                    } else if (var96 > 127) {
                                        var96 = 127;
                                    }
                                    int var97 = (var9 + var94 & 0xFC00) + (var94 & 0x380) + var96;
                                    var95 = class345.field5349[class322.method2238(96, var97, (byte) -122)];
                                }
                                if (var88.field3614 >= 0) {
                                    int var98 = var88.field3614;
                                    int var99 = (var98 & 0x7F) + var10;
                                    if (var99 < 0) {
                                        var99 = 0;
                                    } else if (var99 > 127) {
                                        var99 = 127;
                                    }
                                    int var100 = (var98 + var9 & 0xFC00) + (var98 & 0x380) + var99;
                                    var95 = class345.field5349[class322.method2238(96, var100, (byte) -122)];
                                }
                                class314.method2194(var13, var65, var66, var87, var86, var93, var69, var70, var71, var72, class64.method530(var78, var74, -107), class64.method530(var79, var74, -106), class64.method530(var81, var74, arg0 ^ 0x2C), class64.method530(var80, var74, -128), class322.method2238(var78, var94, (byte) -122), class322.method2238(var79, var94, (byte) -122), class322.method2238(var81, var94, (byte) -122), class322.method2238(var80, var94, (byte) -122), var77, var95);
                                if (class141.field2031 && var13 > 0) {
                                    class24.method147(var87, var86, var94 == -2 || !var88.field3613, var74 == -1 || !class165.method1177(26277, var67 - 1).field556, var65, var66, var69 - class132.field1930[0][var65][var66], var70 - class132.field1930[0][var65 + 1][var66], var71 - class132.field1930[0][var65 + 1][var66 + 1], var72 - class132.field1930[0][var65][var66 + 1]);
                                }
                            }
                        }
                    }
                }
            }
            if (class141.field2031) {
                float[][] var101 = new float[105][105];
                float[][] var102 = new float[105][105];
                int[][] var103 = class132.field1930[var13];
                float[][] var104 = new float[105][105];
                int var105 = 1;
                while (true) {
                    if (var105 > 103) {
                        if (arg3) {
                            class224[] var110 = class264.method1962(class132.field1933[var13], class261.field3913[var13], class287.field4340[0], arg1, var13, class132.field1930[var13], arg0 ^ 0xD267168C, var101, class230.field3491, class300.field4492[var13], var104, class126.field1826[var13], var12, var11, var102, class165.field2358);
                            class12.method71(var13, var110);
                            break;
                        }
                        class224[] var111 = class264.method1962(class132.field1933[var13], class261.field3913[var13], (int[][]) null, arg1, var13, class132.field1930[var13], -764995956, var101, class230.field3491, class300.field4492[var13], var104, class126.field1826[var13], var12, var11, var102, (int[][]) null);
                        class224[] var112 = class109.method839(class132.field1930[var13], class300.field4492[var13], var101, class132.field1933[var13], class261.field3913[var13], class126.field1826[var13], var102, var104, (byte) -48, var12, class230.field3491, var13);
                        class224[] var113 = new class224[var111.length + var112.length];
                        for (int var114 = 0; var114 < var111.length; var114++) {
                            var113[var114] = var111[var114];
                        }
                        for (int var115 = 0; var115 < var112.length; var115++) {
                            var113[var111.length + var115] = var112[var115];
                        }
                        class12.method71(var13, var113);
                        class184.method1282(class126.field1826[var13], class261.field3913[var13], class300.field4492[var13], 85, class132.field1933[var13], var104, var13, class132.field1930[var13], class268.field4081, class268.field4082, var101, var102);
                        break;
                    }
                    for (int var106 = 1; var106 <= 103; var106++) {
                        int var107 = var103[var106][var105 + 1] - var103[var106][var105 - 1];
                        int var108 = var103[var106 + 1][var105] - var103[var106 - 1][var105];
                        float var109 = (float) Math.sqrt((double) (var108 * var108 + (var107 * var107) + 65536));
                        var102[var106][var105] = (float) var108 / var109;
                        var101[var106][var105] = -256.0F / var109;
                        var104[var106][var105] = (float) var107 / var109;
                    }
                    var105++;
                }
            }
            class126.field1826[var13] = (byte[][]) null;
            class261.field3913[var13] = (byte[][]) null;
            class300.field4492[var13] = (byte[][]) null;
            class132.field1933[var13] = (byte[][]) null;
            class102.field1454[var13] = (byte[][]) null;
        }
        class255.method1875(-50, -10, -50);
        if (arg3) {
            return;
        }
        for (int var116 = 0; var116 < 104; var116++) {
            for (int var117 = 0; var117 < 104; var117++) {
                if ((class230.field3491[1][var116][var117] & 0x2) == 2) {
                    class347.method2436(var116, var117);
                }
            }
        }
        for (int var118 = 0; var118 < 4; var118++) {
            for (int var119 = 0; var119 <= 104; var119++) {
                for (int var120 = 0; var120 <= 104; var120++) {
                    if ((class228.field3462[var118][var120][var119] & 0x1) != 0) {
                        int var121 = var119;
                        int var122 = var119;
                        int var123 = var118;
                        while (var122 < 104 && (class228.field3462[var118][var120][var122 + 1] & 0x1) != 0) {
                            var122++;
                        }
                        while (var121 > 0 && (class228.field3462[var118][var120][var121 - 1] & 0x1) != 0) {
                            var121--;
                        }
                        label449: while (var123 > 0) {
                            for (int var124 = var121; var124 <= var122; var124++) {
                                if ((class228.field3462[var123 - 1][var120][var124] & 0x1) == 0) {
                                    break label449;
                                }
                            }
                            var123--;
                        }
                        int var125;
                        label437: for (var125 = var118; var125 < 3; var125++) {
                            for (int var126 = var121; var126 <= var122; var126++) {
                                if ((class228.field3462[var125 + 1][var120][var126] & 0x1) == 0) {
                                    break label437;
                                }
                            }
                        }
                        int var127 = (var122 + 1 - var121) * (var125 + 1 - var123);
                        if (var127 >= 8) {
                            short var128 = 240;
                            int var129 = class132.field1930[var123][var120][var121];
                            int var130 = class132.field1930[var125][var120][var121] - var128;
                            class352.method2456(1, var120 * 128, var120 * 128, var121 * 128, var122 * 128 + 128, var130, var129);
                            for (int var131 = var123; var131 <= var125; var131++) {
                                for (int var132 = var121; var132 <= var122; var132++) {
                                    class228.field3462[var131][var120][var132] = class287.method2076(class228.field3462[var131][var120][var132], -2);
                                }
                            }
                        }
                    }
                    if ((class228.field3462[var118][var120][var119] & 0x2) != 0) {
                        int var133 = var120;
                        int var134 = var118;
                        int var135 = var120;
                        while (var133 < 104 && (class228.field3462[var118][var133 + 1][var119] & 0x2) != 0) {
                            var133++;
                        }
                        int var136 = var118;
                        while (var135 > 0 && (class228.field3462[var118][var135 - 1][var119] & 0x2) != 0) {
                            var135--;
                        }
                        label502: while (var134 > 0) {
                            for (int var137 = var135; var137 <= var133; var137++) {
                                if ((class228.field3462[var134 - 1][var137][var119] & 0x2) == 0) {
                                    break label502;
                                }
                            }
                            var134--;
                        }
                        label491: while (var136 < 3) {
                            for (int var138 = var135; var138 <= var133; var138++) {
                                if ((class228.field3462[var136 + 1][var138][var119] & 0x2) == 0) {
                                    break label491;
                                }
                            }
                            var136++;
                        }
                        int var139 = (var136 + 1 - var134) * (var133 + 1 - var135);
                        if (var139 >= 8) {
                            short var140 = 240;
                            int var141 = class132.field1930[var134][var135][var119];
                            int var142 = class132.field1930[var136][var135][var119] - var140;
                            class352.method2456(2, var135 * 128, var133 * 128 + 128, var119 * 128, var119 * 128, var142, var141);
                            for (int var143 = var134; var143 <= var136; var143++) {
                                for (int var144 = var135; var144 <= var133; var144++) {
                                    class228.field3462[var143][var144][var119] = class287.method2076(class228.field3462[var143][var144][var119], -3);
                                }
                            }
                        }
                    }
                    if ((class228.field3462[var118][var120][var119] & 0x4) != 0) {
                        int var145 = var120;
                        int var146 = var120;
                        int var147;
                        for (var147 = var119; var147 < 104 && (class228.field3462[var118][var120][var147 + 1] & 0x4) != 0; var147++) {
                        }
                        int var148;
                        for (var148 = var119; var148 > 0 && (class228.field3462[var118][var120][var148 - 1] & 0x4) != 0; var148--) {
                        }
                        label556: while (var145 > 0) {
                            for (int var149 = var148; var149 <= var147; var149++) {
                                if ((class228.field3462[var118][var145 - 1][var149] & 0x4) == 0) {
                                    break label556;
                                }
                            }
                            var145--;
                        }
                        label545: while (var146 < 104) {
                            for (int var150 = var148; var150 <= var147; var150++) {
                                if ((class228.field3462[var118][var146 + 1][var150] & 0x4) == 0) {
                                    break label545;
                                }
                            }
                            var146++;
                        }
                        if (((var146 + 1 - var145) * (var147 + 1 - var148)) >= 4) {
                            int var151 = class132.field1930[var118][var145][var148];
                            class352.method2456(4, var145 * 128, var146 * 128 + 128, var148 * 128, var147 * 128 + 128, var151, var151);
                            for (int var152 = var145; var152 <= var146; var152++) {
                                for (int var153 = var148; var153 <= var147; var153++) {
                                    class228.field3462[var118][var152][var153] = class287.method2076(class228.field3462[var118][var152][var153], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
