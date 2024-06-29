import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class94 {

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "Loh;")
    private class281 field1319 = new class281();

    @OriginalMember(owner = "client!bi", name = "t", descriptor = "Loh;")
    private class281 field1329 = new class281();

    @OriginalMember(owner = "client!bi", name = "u", descriptor = "Loh;")
    private class281 field1330 = new class281();

    @OriginalMember(owner = "client!bi", name = "v", descriptor = "Loh;")
    private class281 field1331 = new class281();

    @OriginalMember(owner = "client!bi", name = "x", descriptor = "Lql;")
    private class224 field1333 = new class224(4);

    @OriginalMember(owner = "client!bi", name = "C", descriptor = "I")
    public volatile int field1338 = 0;

    @OriginalMember(owner = "client!bi", name = "D", descriptor = "I")
    public volatile int field1339 = 0;

    @OriginalMember(owner = "client!bi", name = "A", descriptor = "B")
    private byte field1336 = 0;

    @OriginalMember(owner = "client!bi", name = "B", descriptor = "Lql;")
    private class224 field1337 = new class224(8);

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "Z")
    public static boolean field1314 = false;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!bi", name = "m", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!bi", name = "n", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!bi", name = "p", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!bi", name = "q", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!bi", name = "r", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!bi", name = "s", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!bi", name = "y", descriptor = "I")
    private int field1334;

    @OriginalMember(owner = "client!bi", name = "z", descriptor = "J")
    private long field1335;

    @OriginalMember(owner = "client!bi", name = "E", descriptor = "Lre;")
    private class229 field1340;

    @OriginalMember(owner = "client!bi", name = "w", descriptor = "Lpl;")
    private class293 field1332;

    @OriginalMember(owner = "client!bi", name = "o", descriptor = "[I")
    public static int[] field1324;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)Z")
    public static final boolean method618(int arg0) {
        field1327++;
        if (class202.field2806 == 0) {
            if (arg0 > -28) {
                method619(-63, -36, 68, -64, 49, -23, -74, -53, -25, (class211[]) null);
            }
            return class181.field2541.method1345((byte) 57);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIIIIIII[Lse;)V")
    public static final void method619(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class211[] arg9) {
        class64.method398(arg5, arg1, arg4, arg6);
        class90.method580();
        for (int var10 = 0; var10 < arg9.length; var10++) {
            class211 var11 = arg9[var10];
            if (var11 != null && (var11.field3127 == arg3 || arg3 == -1412584499 && class208.field2967 == var11)) {
                int var12;
                if (arg8 == -1) {
                    class118.field1670[class265.field3979] = var11.field3137 + arg7;
                    class101.field1420[class265.field3979] = var11.field3101 + arg0;
                    class123.field1713[class265.field3979] = var11.field3112;
                    class150.field2074[class265.field3979] = var11.field3166;
                    var12 = class265.field3979++;
                } else {
                    var12 = arg8;
                }
                var11.field3116 = class52.field740;
                var11.field3061 = var12;
                if (!var11.field3011 || !client.method1045(var11)) {
                    if (var11.field3062 > 0) {
                        class200.method1274(0, var11);
                    }
                    int var13 = var11.field3137 + arg7;
                    int var14 = var11.field3101 + arg0;
                    int var15 = var11.field3098;
                    if (class19.field269 && (client.method1040(var11).field2828 != 0 || var11.field3035 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class208.field2967 == var11) {
                        if (arg3 != -1412584499 && !var11.field3049) {
                            class108.field1515 = arg7;
                            class274.field4245 = arg9;
                            class110.field1524 = arg0;
                            continue;
                        }
                        if (class265.field3975 && class30.field409) {
                            int var16 = class12.field124;
                            int var17 = class287.field4543;
                            int var18 = var17 - class294.field4625;
                            int var19 = var16 - class42.field642;
                            if (var19 < class202.field2812) {
                                var19 = class202.field2812;
                            }
                            if ((class202.field2812 + class225.field3414.field3112) < (var19 + var11.field3112)) {
                                var19 = class225.field3414.field3112 + class202.field2812 - var11.field3112;
                            }
                            if (class297.field4683 > var18) {
                                var18 = class297.field4683;
                            }
                            if ((class297.field4683 + class225.field3414.field3166) < (var18 + var11.field3166)) {
                                var18 = class297.field4683 - (var11.field3166 - class225.field3414.field3166);
                            }
                            var13 = var19;
                            var14 = var18;
                        }
                        if (!var11.field3049) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.field3035 == 2) {
                        var20 = arg5;
                        var21 = arg6;
                        var22 = arg4;
                        var23 = arg1;
                    } else {
                        int var24 = var11.field3166 + var14;
                        var23 = var14 > arg1 ? var14 : arg1;
                        int var25 = var11.field3112 + var13;
                        var20 = var13 <= arg5 ? arg5 : var13;
                        if (var11.field3035 == 9) {
                            var25++;
                            var24++;
                        }
                        var21 = arg6 <= var24 ? arg6 : var24;
                        var22 = arg4 <= var25 ? arg4 : var25;
                    }
                    if (!var11.field3011 || var20 < var22 && var23 < var21) {
                        if (var11.field3062 != 0) {
                            if (var11.field3062 == 1337 || var11.field3062 == 1403) {
                                class47.field690 = var11;
                                class154.field2152 = var14;
                                class79.field1101 = var13;
                                class269.method1776(var11.field3062 == 1403, var14, -60, var11.field3166, var11.field3112, var13);
                                class42.field640[var12] = true;
                                class64.method398(arg5, arg1, arg4, arg6);
                                continue;
                            }
                            if (var11.field3062 == 1338) {
                                if (!var11.method1374(0)) {
                                    continue;
                                }
                                class16.method90(var14, (byte) -62, var12, var13, var11);
                                class64.method398(arg5, arg1, arg4, arg6);
                                if (class286.field4481 != 0 && class286.field4481 != 3 || class15.field146 || var20 > class203.field2830 || var23 > class193.field2678 || class203.field2830 >= var22 || var21 <= class193.field2678) {
                                    continue;
                                }
                                int var26 = class203.field2830 - var13;
                                int var27 = class193.field2678 - var14;
                                int var28 = var11.field3182[var27];
                                if (var26 < var28 || (var11.field3106[var27] + var28) < var26) {
                                    continue;
                                }
                                int var29 = var27 - var11.field3166 / 2;
                                int var30 = var26 - var11.field3112 / 2;
                                int var31 = (int) class68.field912 + class217.field3266 & 0x7FF;
                                int var32 = class90.field1255[var31];
                                int var33 = class90.field1259[var31];
                                int var34 = (class111.field1600 + 256) * var33 >> 8;
                                int var35 = (class111.field1600 + 256) * var32 >> 8;
                                int var36 = var29 * var35 - (var30 * var34) >> 11;
                                int var37 = var29 * var34 + (var30 * var35) >> 11;
                                int var38 = class217.field3280.field4019 + var37 - (class217.field3280.method561(-1) * 64 + -64) >> 7;
                                int var39 = class217.field3280.field4085 + 64 - var36 - (class217.field3280.method561(-1) * 64) >> 7;
                                if (class11.field113 && (class285.field4469 & 0x40) != 0) {
                                    class211 var40 = class168.method1099(0, class144.field1998, class93.field1306);
                                    if (var40 == null) {
                                        class136.method923(arg2 - 28071);
                                    } else {
                                        class238.method1593(class93.field1303, 1L, arg2 - 58792, var38, class168.field2332, " ->", (short) 43, var39);
                                    }
                                    continue;
                                }
                                if (class124.field1746 == 1) {
                                    class238.method1593(-1, 1L, -30789, var38, class242.field3712, "", (short) 49, var39);
                                }
                                class238.method1593(-1, 1L, -30789, var38, class277.field4285, "", (short) 9, var39);
                                continue;
                            }
                            if (var11.field3062 == 1339) {
                                if (var11.method1374(arg2 ^ 0x6D63)) {
                                    class46.method302(var11, (byte) 100, var12, var14, var13);
                                    class64.method398(arg5, arg1, arg4, arg6);
                                }
                                continue;
                            }
                            if (var11.field3062 == 1400) {
                                class184.method1192(var13, var14, (byte) -39, var11.field3112, var11.field3166);
                                class42.field640[var12] = true;
                                class293.field4607[var12] = true;
                                class64.method398(arg5, arg1, arg4, arg6);
                                continue;
                            }
                            if (var11.field3062 == 1401) {
                                class7.method40(var11.field3166, (byte) 125, var13, var14, var11.field3112);
                                class42.field640[var12] = true;
                                class293.field4607[var12] = true;
                                class64.method398(arg5, arg1, arg4, arg6);
                                continue;
                            }
                            if (var11.field3062 == 1402) {
                                class145.method975((byte) -117, var13, var14);
                                class42.field640[var12] = true;
                                class293.field4607[var12] = true;
                                continue;
                            }
                            if (var11.field3062 == 1405) {
                                if (!class172.field2389) {
                                    continue;
                                }
                                int var41 = var11.field3112 + var13;
                                int var42 = var14 + 15;
                                class208.field2968.method829("Fps:" + class135.field1894, var41, var42, 16776960, -1);
                                int var131 = var42 + 15;
                                Runtime var43 = Runtime.getRuntime();
                                int var44 = 0;
                                int var45 = 16776960;
                                int var46 = 0;
                                int var47 = 0;
                                int var48 = (int) ((var43.totalMemory() - var43.freeMemory()) / 1024L);
                                if (var48 > 65536) {
                                    var45 = 16711680;
                                }
                                class208.field2968.method829("Mem:" + var48 + "k", var41, var131, var45, -1);
                                var42 = var131 + 15;
                                for (int var49 = 0; var49 < 29; var49++) {
                                    var44 += class160.field2246[var49].method1104(0);
                                    var47 += class160.field2246[var49].method1098((byte) -126);
                                    var46 += class160.field2246[var49].method1100(true);
                                }
                                int var50 = 16776960;
                                int var51 = var46 * 100 / var44;
                                int var52 = var47 * 10000 / var44;
                                String var53 = "Cache:" + class261.method1726(0, -11776, true, (long) var52, 2) + "% (" + var51 + "%)";
                                class61.field852.method829(var53, var41, var42, var50, -1);
                                class42.field640[var12] = true;
                                class293.field4607[var12] = true;
                                var42 += 12;
                                continue;
                            }
                            if (var11.field3062 == 1406) {
                                class28.field369 = var14;
                                class143.field1987 = var13;
                                class248.field3798 = var11;
                                continue;
                            }
                        }
                        if (!class15.field146) {
                            if (var11.field3035 == 0 && var11.field3154 && var20 <= class203.field2830 && var23 <= class193.field2678 && var22 > class203.field2830 && var21 > class193.field2678 && !class19.field269) {
                                class285.field4468[0] = class122.field1704;
                                class41.field612[0] = "";
                                class221.field3306[0] = 1007;
                                class227.field3444[0] = class172.field2399;
                                class68.field925 = 1;
                            }
                            if (var20 <= class203.field2830 && class193.field2678 >= var23 && class203.field2830 < var22 && class193.field2678 < var21) {
                                class30.method196(var11, 23309, class193.field2678 - var14, -var13 + class203.field2830);
                            }
                        }
                        if (var11.field3035 == 0) {
                            if (!var11.field3011 && client.method1045(var11) && class270.field4147 != var11) {
                                continue;
                            }
                            if (!var11.field3011) {
                                if ((var11.field3146 - var11.field3166) < var11.field3031) {
                                    var11.field3031 = var11.field3146 - var11.field3166;
                                }
                                if (var11.field3031 < 0) {
                                    var11.field3031 = 0;
                                }
                            }
                            method619(var14 - var11.field3031, var23, 28003, var11.field3093, var22, var20, var21, var13 - var11.field3066, var12, arg9);
                            if (var11.field3180 != null) {
                                method619(var14 - var11.field3031, var23, arg2, var11.field3093, var22, var20, var21, var13 - var11.field3066, var12, var11.field3180);
                            }
                            class56 var54 = (class56) class289.field4559.method23(216, (long) var11.field3093);
                            if (var54 != null) {
                                if (var54.field802 == 0 && !class15.field146 && var20 <= class203.field2830 && var23 <= class193.field2678 && class203.field2830 < var22 && var21 > class193.field2678 && !class19.field269) {
                                    class221.field3306[0] = 1007;
                                    class285.field4468[0] = class122.field1704;
                                    class68.field925 = 1;
                                    class41.field612[0] = "";
                                    class227.field3444[0] = class172.field2399;
                                }
                                class256.method1712(-1, var54.field808, var14, var12, var21, var13, var23, var20, var22);
                            }
                            class64.method398(arg5, arg1, arg4, arg6);
                            class90.method580();
                        }
                        if (class73.field999[var12] || class193.field2669 > 1) {
                            if (var11.field3035 == 0 && !var11.field3011 && var11.field3166 < var11.field3146) {
                                class146.method980(var11.field3112 + var13, var11.field3146, var14, var11.field3031, var11.field3166, true);
                            }
                            if (var11.field3035 != 1) {
                                if (var11.field3035 == 2) {
                                    int var55 = 0;
                                    for (int var56 = 0; var56 < var11.field3087; var56++) {
                                        for (int var57 = 0; var57 < var11.field3026; var57++) {
                                            int var58 = (var11.field3178 + 32) * var57 + var13;
                                            int var59 = var14 + ((var11.field3159 + 32) * var56);
                                            if (var55 < 20) {
                                                var59 += var11.field3006[var55];
                                                var58 += var11.field3167[var55];
                                            }
                                            if (var11.field3015[var55] > 0) {
                                                boolean var60 = false;
                                                boolean var61 = false;
                                                int var62 = var11.field3015[var55] - 1;
                                                if (arg5 < var58 + 32 && arg4 > var58 && (var59 + 32) > arg1 && var59 < arg6 || class52.field758 == var11 && class100.field1396 == var55) {
                                                    class110 var63;
                                                    if (class141.field1963 == 1 && class156.field2172 == var55 && class76.field1061 == var11.field3093) {
                                                        var63 = class198.method1266(2, arg2 - 24134, var62, 0, var11.field3005[var55], (class144) null, var11.field3090);
                                                    } else {
                                                        var63 = class198.method1266(1, 3869, var62, 3153952, var11.field3005[var55], (class144) null, var11.field3090);
                                                    }
                                                    if (class90.field1266) {
                                                        class42.field640[var12] = true;
                                                    }
                                                    if (var63 == null) {
                                                        class236.method1583(var11, 0);
                                                    } else if (class52.field758 == var11 && class100.field1396 == var55) {
                                                        int var64 = class12.field124 - class40.field595;
                                                        if (var64 < 5 && var64 > -5) {
                                                            var64 = 0;
                                                        }
                                                        int var65 = class287.field4543 - class173.field2410;
                                                        if (var65 < 5 && var65 > -5) {
                                                            var65 = 0;
                                                        }
                                                        if (class57.field826 < 5) {
                                                            var64 = 0;
                                                            var65 = 0;
                                                        }
                                                        var63.method707(var58 + var64, var59 + var65, 128);
                                                        if (arg3 != -1) {
                                                            class211 var66 = arg9[arg3 & 0xFFFF];
                                                            int var67 = class64.field876;
                                                            int var68 = class64.field878;
                                                            if (var67 > var59 + var65 && var66.field3031 > 0) {
                                                                int var69 = (var67 - (var59 + var65)) * class225.field3409 / 3;
                                                                if (class225.field3409 * 10 < var69) {
                                                                    var69 = class225.field3409 * 10;
                                                                }
                                                                if (var69 > var66.field3031) {
                                                                    var69 = var66.field3031;
                                                                }
                                                                class173.field2410 += var69;
                                                                var66.field3031 -= var69;
                                                                class236.method1583(var66, 0);
                                                            }
                                                            if (var68 < (var59 + var65 + 32) && var66.field3146 - var66.field3166 > var66.field3031) {
                                                                int var70 = (var59 - var68 - (-var65 - 32)) * class225.field3409 / 3;
                                                                if (var70 > (class225.field3409 * 10)) {
                                                                    var70 = class225.field3409 * 10;
                                                                }
                                                                if (var66.field3146 - var66.field3031 - var66.field3166 < var70) {
                                                                    var70 = var66.field3146 - var66.field3166 - var66.field3031;
                                                                }
                                                                class173.field2410 -= var70;
                                                                var66.field3031 += var70;
                                                                class236.method1583(var66, 0);
                                                            }
                                                        }
                                                    } else if (class17.field183 == var11 && class222.field3332 == var55) {
                                                        var63.method707(var58, var59, 128);
                                                    } else {
                                                        var63.method710(var58, var59);
                                                    }
                                                }
                                            } else if (var11.field3155 != null && var55 < 20) {
                                                class110 var71 = var11.method1377((byte) -88, var55);
                                                if (var71 != null) {
                                                    var71.method710(var58, var59);
                                                } else if (class143.field1980) {
                                                    class236.method1583(var11, 0);
                                                }
                                            }
                                            var55++;
                                        }
                                    }
                                } else if (var11.field3035 == 3) {
                                    int var72;
                                    if (class175.method1150((byte) 75, var11)) {
                                        var72 = var11.field3094;
                                        if (class270.field4147 == var11 && var11.field3103 != 0) {
                                            var72 = var11.field3103;
                                        }
                                    } else {
                                        var72 = var11.field3152;
                                        if (class270.field4147 == var11 && var11.field3139 != 0) {
                                            var72 = var11.field3139;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var11.field3070) {
                                            class64.method401(var13, var14, var11.field3112, var11.field3166, var72);
                                        } else {
                                            class64.method393(var13, var14, var11.field3112, var11.field3166, var72);
                                        }
                                    } else if (var11.field3070) {
                                        class64.method395(var13, var14, var11.field3112, var11.field3166, var72, 256 - (var15 & 0xFF));
                                    } else {
                                        class64.method409(var13, var14, var11.field3112, var11.field3166, var72, 256 - (var15 & 0xFF));
                                    }
                                } else if (var11.field3035 == 4) {
                                    class126 var73 = var11.method1366(class169.field2346, false);
                                    if (var73 != null) {
                                        String var74 = var11.field3014;
                                        int var75;
                                        if (class175.method1150((byte) 75, var11)) {
                                            var75 = var11.field3094;
                                            if (class270.field4147 == var11 && var11.field3103 != 0) {
                                                var75 = var11.field3103;
                                            }
                                            if (var11.field3118.length() > 0) {
                                                var74 = var11.field3118;
                                            }
                                        } else {
                                            var75 = var11.field3152;
                                            if (class270.field4147 == var11 && var11.field3139 != 0) {
                                                var75 = var11.field3139;
                                            }
                                        }
                                        if (var11.field3011 && var11.field3086 != -1) {
                                            class32 var76 = class73.method463(var11.field3086, -31104);
                                            var74 = var76.field437;
                                            if (var74 == null) {
                                                var74 = "null";
                                            }
                                            if ((var76.field458 == 1 || var11.field3132 != 1) && var11.field3132 != -1) {
                                                var74 = "<col=ff9040>" + var74 + "</col> x" + class172.method1123(0, var11.field3132);
                                            }
                                        }
                                        if (class233.field3524 == var11) {
                                            var75 = var11.field3152;
                                            var74 = class191.field2642;
                                        }
                                        if (!var11.field3011) {
                                            var74 = class254.method1699((byte) 122, var74, var11);
                                        }
                                        var73.method832(var74, var13, var14, var11.field3112, var11.field3166, var75, var11.field3016 ? 0 : -1, var11.field3135, var11.field3007, var11.field3126);
                                    } else if (class143.field1980) {
                                        class236.method1583(var11, arg2 ^ 0x6D63);
                                    }
                                } else if (var11.field3035 == 5) {
                                    if (!var11.field3011) {
                                        class110 var86 = var11.method1379(class175.method1150((byte) 75, var11), (byte) 69);
                                        if (var86 != null) {
                                            var86.method710(var13, var14);
                                        } else if (class143.field1980) {
                                            class236.method1583(var11, 0);
                                        }
                                    } else if (var11.field3023 >= 0) {
                                        class130 var85 = var11.method1380(false);
                                        var85.method889(0, var13, var14, var11.field3112, var11.field3166, var11.field3173, var11.field3130, 0);
                                    } else {
                                        class110 var77;
                                        if (var11.field3086 == -1) {
                                            var77 = var11.method1379(false, (byte) 103);
                                        } else if (var11.field3068 && class217.field3280.field1209 != null) {
                                            var77 = class198.method1266(var11.field3079, 3869, var11.field3086, var11.field3053, var11.field3132, class217.field3280.field1209, var11.field3090);
                                        } else {
                                            var77 = class198.method1266(var11.field3079, 3869, var11.field3086, var11.field3053, var11.field3132, (class144) null, var11.field3090);
                                        }
                                        if (var77 != null) {
                                            int var78 = var77.field1536;
                                            int var79 = var77.field1526;
                                            if (var11.field3046) {
                                                int var80 = (var79 - (1 - var11.field3166)) / var79;
                                                int var81 = (var11.field3112 - (1 - var78)) / var78;
                                                class64.method390(var13, var14, var11.field3112 + var13, var11.field3166 + var14);
                                                for (int var82 = 0; var82 < var81; var82++) {
                                                    for (int var83 = 0; var83 < var80; var83++) {
                                                        if (var11.field3009 != 0) {
                                                            var77.method708(var78 * var82 + var13 + (var78 / 2), 4096, arg2 - 27908, var79 * var83 + var79 / 2 + var14, var11.field3009);
                                                        } else if (var15 == 0) {
                                                            var77.method710(var13 + (var78 * var82), var79 * var83 + var14);
                                                        } else {
                                                            var77.method707(var13 + (var78 * var82), var79 * var83 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class64.method398(arg5, arg1, arg4, arg6);
                                            } else {
                                                int var84 = var11.field3112 * 4096 / var78;
                                                if (var11.field3009 != 0) {
                                                    var77.method708(var11.field3112 / 2 + var13, var84, 85, var11.field3166 / 2 + var14, var11.field3009);
                                                } else if (var15 != 0) {
                                                    var77.method712(var13, var14, var11.field3112, var11.field3166, 256 - (var15 & 0xFF));
                                                } else if (var11.field3112 == var78 && var11.field3166 == var79) {
                                                    var77.method710(var13, var14);
                                                } else {
                                                    var77.method705(var13, var14, var11.field3112, var11.field3166);
                                                }
                                            }
                                        } else if (class143.field1980) {
                                            class236.method1583(var11, arg2 ^ 0x6D63);
                                        }
                                    }
                                } else if (var11.field3035 == 6) {
                                    class25 var87 = null;
                                    int var88 = 0;
                                    boolean var89 = class175.method1150((byte) 75, var11);
                                    int var90;
                                    if (var89) {
                                        var90 = var11.field3034;
                                    } else {
                                        var90 = var11.field3083;
                                    }
                                    if (var11.field3086 != -1) {
                                        class32 var91 = class73.method463(var11.field3086, -31104);
                                        if (var91 != null) {
                                            class32 var92 = var91.method217(var11.field3132, (byte) -74);
                                            class240 var93 = var90 == -1 ? null : class132.method905(true, var90);
                                            if (var11.field3068 && class217.field3280.field1209 != null) {
                                                var87 = var92.method216(-24745, var93, var11.field3021, var11.field3074, 1, class217.field3280.field1209, var11.field3051);
                                            } else {
                                                var87 = var92.method216(arg2 ^ 0xFFFFF234, var93, var11.field3021, var11.field3074, 1, (class144) null, var11.field3051);
                                            }
                                            if (var87 == null) {
                                                class236.method1583(var11, 0);
                                            } else {
                                                var88 = -var87.method106() / 2;
                                            }
                                        }
                                    } else if (var11.field3027 == 5) {
                                        if (var11.field3075 == -1) {
                                            var87 = class150.field2068.method972(0, -1, -7893, -1, (class240) null, (class240) null, (class212[]) null, true, 0, -1, -1);
                                        } else {
                                            int var95 = var11.field3075 & 0x7FF;
                                            if (class35.field550 == var95) {
                                                var95 = 2047;
                                            }
                                            class88 var96 = class154.field2133[var95];
                                            class240 var97 = var90 == -1 ? null : class132.method905(true, var90);
                                            if (var96 != null && ((int) class73.method465((byte) -105, var96.field1217) << 11) == (var11.field3075 & 0xFFFFF800)) {
                                                var87 = var96.field1209.method972(0, -1, -7893, 0, var97, (class240) null, (class212[]) null, true, 0, var11.field3074, -1);
                                            }
                                        }
                                    } else if (var90 == -1) {
                                        var87 = var11.method1369(-1, (class240) null, -1, -52, var89, class217.field3280.field1209, 0);
                                        if (var87 == null && class143.field1980) {
                                            class236.method1583(var11, arg2 - 28003);
                                        }
                                    } else {
                                        class240 var94 = class132.method905(true, var90);
                                        var87 = var11.method1369(var11.field3021, var94, var11.field3074, -52, var89, class217.field3280.field1209, var11.field3051);
                                        if (var87 == null && class143.field1980) {
                                            class236.method1583(var11, 0);
                                        }
                                    }
                                    if (var87 != null) {
                                        int var98;
                                        if (var11.field3131 <= 0) {
                                            var98 = 256;
                                        } else {
                                            var98 = (var11.field3112 << 8) / var11.field3131;
                                        }
                                        int var99;
                                        if (var11.field3084 > 0) {
                                            var99 = (var11.field3166 << 8) / var11.field3084;
                                        } else {
                                            var99 = 256;
                                        }
                                        int var100 = (var11.field3119 * var98 >> 8) + var13 + (var11.field3112 / 2);
                                        int var101 = var11.field3166 / 2 + (var14 + (var11.field3013 * var99 >> 8));
                                        class90.method578(var100, var101);
                                        int var102 = class90.field1259[var11.field3040] * var11.field3012 >> 16;
                                        int var103 = class90.field1255[var11.field3040] * var11.field3012 >> 16;
                                        if (!var11.field3011) {
                                            var87.method122(0, var11.field3041, 0, var11.field3040, 0, var102, var103, -1L);
                                        } else if (var11.field3163) {
                                            ((class18) var87).method130(0, var11.field3041, var11.field3122, var11.field3040, var11.field3089, var88 + var102 + var11.field3036, var11.field3036 + var103, var11.field3012);
                                        } else {
                                            var87.method122(0, var11.field3041, var11.field3122, var11.field3040, var11.field3089, var88 + var102 + var11.field3036, var11.field3036 + var103, -1L);
                                        }
                                        class90.method571();
                                    }
                                } else {
                                    if (var11.field3035 == 7) {
                                        class126 var104 = var11.method1366(class169.field2346, false);
                                        if (var104 == null) {
                                            if (class143.field1980) {
                                                class236.method1583(var11, 0);
                                            }
                                            continue;
                                        }
                                        int var105 = 0;
                                        for (int var106 = 0; var106 < var11.field3087; var106++) {
                                            for (int var107 = 0; var107 < var11.field3026; var107++) {
                                                if (var11.field3015[var105] > 0) {
                                                    class32 var108 = class73.method463(var11.field3015[var105] - 1, arg2 + -59107);
                                                    String var109;
                                                    if (var108.field458 != 1 && var11.field3005[var105] == 1) {
                                                        var109 = "<col=ff9040>" + var108.field437 + "</col>";
                                                    } else {
                                                        var109 = "<col=ff9040>" + var108.field437 + "</col> x" + class172.method1123(arg2 ^ 0x6D63, var11.field3005[var105]);
                                                    }
                                                    int var110 = (var11.field3178 + 115) * var107 + var13;
                                                    int var111 = (var11.field3159 + 12) * var106 + var14;
                                                    if (var11.field3135 == 0) {
                                                        var104.method842(var109, var110, var111, var11.field3152, var11.field3016 ? 0 : -1);
                                                    } else if (var11.field3135 == 1) {
                                                        var104.method825(var109, var110 + 57, var111, var11.field3152, var11.field3016 ? 0 : -1);
                                                    } else {
                                                        var104.method829(var109, var110 + 115 - 1, var111, var11.field3152, var11.field3016 ? 0 : -1);
                                                    }
                                                }
                                                var105++;
                                            }
                                        }
                                    }
                                    if (var11.field3035 == 8 && class206.field2884 == var11 && class38.field569 == class22.field319) {
                                        int var112 = 0;
                                        int var113 = 0;
                                        class126 var114 = class208.field2968;
                                        String var115 = var11.field3014;
                                        String var116 = class254.method1699((byte) 122, var115, var11);
                                        while (var116.length() > 0) {
                                            int var124 = var116.indexOf("<br>");
                                            String var125;
                                            if (var124 == -1) {
                                                var125 = var116;
                                                var116 = "";
                                            } else {
                                                var125 = var116.substring(0, var124);
                                                var116 = var116.substring(var124 + 4);
                                            }
                                            int var126 = var114.method824(var125);
                                            if (var112 < var126) {
                                                var112 = var126;
                                            }
                                            var113 += var114.field1757 + 1;
                                        }
                                        var112 += 6;
                                        var113 += 7;
                                        int var117 = var11.field3112 + var13 - var112 - 5;
                                        int var118 = var11.field3166 + var14 + 5;
                                        if (var118 + var113 > arg6) {
                                            var118 = arg6 - var113;
                                        }
                                        if ((var13 + 5) > var117) {
                                            var117 = var13 + 5;
                                        }
                                        if (arg4 < (var112 + var117)) {
                                            var117 = arg4 - var112;
                                        }
                                        class64.method401(var117, var118, var112, var113, 16777120);
                                        class64.method393(var117, var118, var112, var113, 0);
                                        int var119 = var114.field1757 + var118 + 2;
                                        String var120 = var11.field3014;
                                        String var121 = class254.method1699((byte) 122, var120, var11);
                                        while (var121.length() > 0) {
                                            int var122 = var121.indexOf("<br>");
                                            String var123;
                                            if (var122 == -1) {
                                                var123 = var121;
                                                var121 = "";
                                            } else {
                                                var123 = var121.substring(0, var122);
                                                var121 = var121.substring(var122 + 4);
                                            }
                                            var114.method842(var123, var117 + 3, var119, 0, -1);
                                            var119 += var114.field1757 + 1;
                                        }
                                    }
                                    if (var11.field3035 == 9) {
                                        int var127;
                                        int var128;
                                        int var129;
                                        int var130;
                                        if (var11.field3153) {
                                            var130 = var13;
                                            var127 = var11.field3112 + var13;
                                            var128 = var14;
                                            var129 = var14 + var11.field3166;
                                        } else {
                                            var127 = var11.field3112 + var13;
                                            var128 = var11.field3166 + var14;
                                            var129 = var14;
                                            var130 = var13;
                                        }
                                        if (var11.field3151 == 1) {
                                            class64.method389(var130, var129, var127, var128, var11.field3152);
                                        } else {
                                            class64.method394(var130, var129, var127, var128, var11.field3152, var11.field3151);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        field1315++;
        if (arg2 != 28003) {
            field1314 = false;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V")
    private final void method620(byte arg0) {
        field1310++;
        if (this.field1332 == null) {
            return;
        }
        try {
            this.field1333.field3402 = 0;
            this.field1333.method1447(6, 17363472);
            int var2 = 121 % ((arg0 - 15) / 52);
            this.field1333.method1484(3, 2);
            this.field1332.method1967(this.field1333.field3336, 0, 4, 0);
        } catch (IOException var4) {
            try {
                this.field1332.method1958(5000);
            } catch (Exception var3) {
            }
            this.field1332 = null;
            this.field1338++;
            this.field1339 = -2;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Z)V")
    public final void method621(boolean arg0) {
        try {
            if (arg0) {
                return;
            }
            this.field1332.method1958(5000);
        } catch (Exception var2) {
        }
        this.field1336 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        field1311++;
        this.field1339 = -1;
        this.field1338++;
        this.field1332 = null;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lpl;ZI)V")
    public final void method622(class293 arg0, boolean arg1, int arg2) {
        if (this.field1332 != null) {
            try {
                this.field1332.method1958(5000);
            } catch (Exception var8) {
            }
            this.field1332 = null;
        }
        field1318++;
        if (arg2 != -21503) {
            this.field1339 = 89;
        }
        this.field1332 = arg0;
        this.method620((byte) 91);
        this.method626(arg1, true);
        this.field1337.field3402 = 0;
        this.field1340 = null;
        while (true) {
            class229 var4 = (class229) this.field1329.method1880(0);
            if (var4 == null) {
                while (true) {
                    class229 var5 = (class229) this.field1331.method1880(0);
                    if (var5 == null) {
                        if (this.field1336 != 0) {
                            try {
                                this.field1333.field3402 = 0;
                                this.field1333.method1447(4, 17363472);
                                this.field1333.method1447(this.field1336, 17363472);
                                this.field1333.method1470(393660232, 0);
                                this.field1332.method1967(this.field1333.field3336, 0, 4, 0);
                            } catch (IOException var7) {
                                try {
                                    this.field1332.method1958(5000);
                                } catch (Exception var6) {
                                }
                                this.field1332 = null;
                                this.field1339 = -2;
                                this.field1338++;
                            }
                        }
                        this.field1334 = 0;
                        this.field1335 = class223.method1433((byte) -125);
                        return;
                    }
                    this.field1330.method1890(var5, 0);
                }
            }
            this.field1319.method1890(var4, 0);
        }
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)V")
    public final void method623(int arg0) {
        field1312++;
        if (this.field1332 == null) {
            return;
        }
        try {
            this.field1333.field3402 = 0;
            this.field1333.method1447(7, 17363472);
            this.field1333.method1484(0, 2);
            this.field1332.method1967(this.field1333.field3336, 0, 4, arg0 ^ arg0);
        } catch (IOException var3) {
            try {
                this.field1332.method1958(arg0 ^ 0xFFFFEC76);
            } catch (Exception var2) {
            }
            this.field1338++;
            this.field1332 = null;
            this.field1339 = -2;
        }
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(B)V")
    public static void method624(byte arg0) {
        field1324 = null;
        int var1 = 5 / ((28 - arg0) / 32);
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(I)Z")
    public final boolean method625(int arg0) {
        field1326++;
        if (this.field1332 != null) {
            long var2 = class223.method1433((byte) -99);
            int var4 = (int) (var2 - this.field1335);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field1334 += var4;
            this.field1335 = var2;
            if (this.field1334 > 30000) {
                try {
                    this.field1332.method1958(5000);
                } catch (Exception var27) {
                }
                this.field1332 = null;
            }
        }
        if (this.field1332 == null) {
            return this.method631(27) == 0 && this.method630((byte) -122) == 0;
        }
        try {
            this.field1332.method1962(arg0 ^ 0x1388);
            for (class229 var5 = (class229) this.field1319.method1887((byte) -117); var5 != null; var5 = (class229) this.field1319.method1886(arg0 + 115)) {
                this.field1333.field3402 = 0;
                this.field1333.method1447(1, 17363472);
                this.field1333.method1484((int) var5.field1148, 2);
                this.field1332.method1967(this.field1333.field3336, 0, 4, arg0);
                this.field1329.method1890(var5, arg0);
            }
            for (class229 var6 = (class229) this.field1330.method1887((byte) -97); var6 != null; var6 = (class229) this.field1330.method1886(-106)) {
                this.field1333.field3402 = 0;
                this.field1333.method1447(0, 17363472);
                this.field1333.method1484((int) var6.field1148, 2);
                this.field1332.method1967(this.field1333.field3336, 0, 4, 0);
                this.field1331.method1890(var6, 0);
            }
            for (int var7 = arg0; var7 < 100; var7++) {
                int var8 = this.field1332.method1960(-1);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field1334 = 0;
                byte var9 = 0;
                if (this.field1340 == null) {
                    var9 = 8;
                } else if (this.field1340.field3475 == 0) {
                    var9 = 1;
                }
                if (var9 > 0) {
                    int var10 = var9 - this.field1337.field3402;
                    if (var8 < var10) {
                        var10 = var8;
                    }
                    this.field1332.method1963(var10, this.field1337.field3336, this.field1337.field3402, false);
                    if (this.field1336 != 0) {
                        for (int var11 = 0; var11 < var10; var11++) {
                            this.field1337.field3336[this.field1337.field3402 + var11] = (byte) class283.method1897(this.field1337.field3336[this.field1337.field3402 + var11], this.field1336);
                        }
                    }
                    this.field1337.field3402 += var10;
                    if (this.field1337.field3402 >= var9) {
                        if (this.field1340 == null) {
                            this.field1337.field3402 = 0;
                            int var12 = this.field1337.method1453((byte) -127);
                            int var13 = this.field1337.method1445(false);
                            int var14 = this.field1337.method1453((byte) -128);
                            int var15 = var14 & 0x7F;
                            boolean var16 = (var14 & 0x80) != 0;
                            Object var17 = null;
                            long var18 = (long) ((var12 << 16) + var13);
                            int var20 = this.field1337.method1483((byte) 46);
                            class229 var21;
                            if (var16) {
                                for (var21 = (class229) this.field1331.method1887((byte) -54); var21 != null && var21.field1148 != var18; var21 = (class229) this.field1331.method1886(112)) {
                                }
                            } else {
                                for (var21 = (class229) this.field1329.method1887((byte) -81); var21 != null && var21.field1148 != var18; var21 = (class229) this.field1329.method1886(arg0 ^ 0x52)) {
                                }
                            }
                            if (var21 == null) {
                                throw new IOException();
                            }
                            int var22 = var15 == 0 ? 5 : 9;
                            this.field1340 = var21;
                            this.field1340.field3471 = new class224(var20 + this.field1340.field3465 + var22);
                            this.field1340.field3471.method1447(var15, arg0 + 17363472);
                            this.field1340.field3471.method1435(-111, var20);
                            this.field1340.field3475 = 8;
                            this.field1337.field3402 = 0;
                        } else if (this.field1340.field3475 != 0) {
                            throw new IOException();
                        } else if (this.field1337.field3336[0] == -1) {
                            this.field1340.field3475 = 1;
                            this.field1337.field3402 = 0;
                        } else {
                            this.field1340 = null;
                        }
                    }
                } else {
                    int var23 = this.field1340.field3471.field3336.length - this.field1340.field3465;
                    int var24 = 512 - this.field1340.field3475;
                    if (var24 > var23 - this.field1340.field3471.field3402) {
                        var24 = var23 - this.field1340.field3471.field3402;
                    }
                    if (var8 < var24) {
                        var24 = var8;
                    }
                    this.field1332.method1963(var24, this.field1340.field3471.field3336, this.field1340.field3471.field3402, false);
                    if (this.field1336 != 0) {
                        for (int var25 = 0; var25 < var24; var25++) {
                            this.field1340.field3471.field3336[this.field1340.field3471.field3402 + var25] = (byte) class283.method1897(this.field1340.field3471.field3336[this.field1340.field3471.field3402 + var25], this.field1336);
                        }
                    }
                    this.field1340.field3475 += var24;
                    this.field1340.field3471.field3402 += var24;
                    if (this.field1340.field3471.field3402 == var23) {
                        this.field1340.method527(false);
                        this.field1340.field1519 = false;
                        this.field1340 = null;
                    } else if (this.field1340.field3475 == 512) {
                        this.field1340.field3475 = 0;
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field1332.method1958(5000);
            } catch (Exception var26) {
            }
            this.field1339 = -2;
            this.field1332 = null;
            this.field1338++;
            return this.method631(72) == 0 && this.method630((byte) -45) == 0;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZZ)V")
    public final void method626(boolean arg0, boolean arg1) {
        field1325++;
        if (this.field1332 == null) {
            return;
        }
        try {
            this.field1333.field3402 = 0;
            this.field1333.method1447(arg0 ? 2 : 3, 17363472);
            this.field1333.method1484(0, 2);
            this.field1332.method1967(this.field1333.field3336, 0, 4, 0);
        } catch (IOException var4) {
            try {
                this.field1332.method1958(5000);
            } catch (Exception var3) {
            }
            this.field1338++;
            this.field1339 = -2;
            this.field1332 = null;
        }
        if (!arg1) {
            this.method625(-120);
        }
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(B)V")
    public final void method627(byte arg0) {
        if (arg0 != 80) {
            this.field1340 = null;
        }
        if (this.field1332 != null) {
            this.field1332.method1964(5000);
        }
        field1321++;
    }

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "(I)Z")
    public final boolean method628(int arg0) {
        field1320++;
        if (arg0 != 20) {
            this.field1332 = null;
        }
        return this.method630((byte) -64) >= 20;
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(Z)V")
    public final void method629(boolean arg0) {
        if (!arg0) {
            this.method623(52);
        }
        if (this.field1332 != null) {
            this.field1332.method1958(5000);
        }
        field1322++;
    }

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "(B)I")
    private final int method630(byte arg0) {
        field1328++;
        return arg0 >= -20 ? -33 : this.field1330.method1882(0) + this.field1331.method1882(0);
    }

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "(I)I")
    public final int method631(int arg0) {
        if (arg0 <= 24) {
            this.method626(true, true);
        }
        field1313++;
        return this.field1319.method1882(0) + this.field1329.method1882(0);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIII)Z")
    public static final boolean method632(int arg0, int arg1, int arg2, int arg3) {
        if (class239.method1600(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class36.method242(var4 + 1, class200.field2788[arg0][arg1][arg2] + arg3, var5 + 1) && class36.method242(var4 + 128 - 1, class200.field2788[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class36.method242(var4 + 128 - 1, class200.field2788[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class36.method242(var4 + 1, class200.field2788[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "(I)Z")
    public final boolean method633(int arg0) {
        if (arg0 != -30387) {
            method624((byte) 3);
        }
        field1316++;
        return this.method631(123) >= 20;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIZBI)Lre;")
    public final class229 method634(int arg0, int arg1, boolean arg2, byte arg3, int arg4) {
        field1323++;
        if (arg0 >= -68) {
            this.field1333 = null;
        }
        long var6 = (long) ((arg4 << 16) + arg1);
        class229 var8 = new class229();
        var8.field1148 = var6;
        var8.field1517 = arg2;
        var8.field3465 = arg3;
        if (arg2) {
            if (this.method631(42) >= 20) {
                throw new RuntimeException();
            }
            this.field1319.method1890(var8, 0);
        } else if (this.method630((byte) -118) < 20) {
            this.field1330.method1890(var8, 0);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }
}
