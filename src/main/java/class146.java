import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class146 {

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "Lag;")
    public static class97 field2094 = new class97();

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "I")
    public static int field2096 = -1;

    @OriginalMember(owner = "client!dh", name = "j", descriptor = "[I")
    public static int[] field2098 = new int[50];

    @OriginalMember(owner = "client!dh", name = "k", descriptor = "[Lee;")
    public static class246[] field2099 = new class246[14];

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
    public static int field2089;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "I")
    public static int field2095;

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "I")
    public static int field2097;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)V")
    public static final void method976(byte arg0) {
        class95.field1451.method522(42, 28727);
        field2091++;
        class279.field4454++;
        class95.field1451.method775(class24.method178(-16648), -118);
        class95.field1451.method794(class214.field3080, (byte) -67);
        class95.field1451.method794(class250.field3813, (byte) -105);
        class95.field1451.method775(class243.field3661, -119);
        if (arg0 != -1) {
            method978((byte) -113, 31, 103);
        }
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(B)V")
    public static void method977(byte arg0) {
        field2094 = null;
        field2098 = null;
        field2099 = null;
        int var1 = 81 % ((16 - arg0) / 62);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(BII)V")
    public static final void method978(byte arg0, int arg1, int arg2) {
        class20.field276[arg1] = arg2;
        field2092++;
        if (arg0 >= -2) {
            return;
        }
        class71 var3 = (class71) class51.field749.method1218((long) arg1, 111);
        if (var3 == null) {
            class71 var4 = new class71(class287.method1928(27332) + 500L);
            class51.field749.method1215(var4, -128, (long) arg1);
        } else {
            var3.field1103 = class287.method1928(27332) + 500L;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZZ)V")
    public static final void method979(boolean arg0, boolean arg1) {
        field2089++;
        class152.field2193 = null;
        class234.field3525 = null;
        class280.field4470 = 0;
        class63.field1014 = null;
        class76.field1175 = null;
        class225.field3387 = null;
        class120.field1757 = null;
        class204.field2952 = null;
        if (arg0 && class70.field1099 != null) {
            class259.field3922 = class70.field1099.field3381;
        } else {
            class259.field3922 = null;
        }
        class228.field3421 = null;
        class193.field2759 = null;
        class236.field3560 = null;
        class70.field1099 = null;
        class173.field2471.method647((byte) -70);
        class212.field3045 = null;
        class140.field2028 = -1;
        class93.field1425 = null;
        class94.field1427 = null;
        class162.field2338 = null;
        class224.field3355 = null;
        class118.field1742 = null;
        class163.field2371 = null;
        class12.field191 = -1;
        class155.field2271 = null;
        class168.field2440 = null;
        if (!arg1) {
            field2098 = null;
        }
        class288.field4563 = null;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V")
    public static final void method980(int arg0) {
        field2095++;
        if (class195.field2807 == 140) {
            int var1 = class68.field1071.method783(arg0 + 60);
            int var2 = ((var1 & 0x74) >> 4) + class262.field3950;
            int var3 = (var1 & 0x7) + class96.field1455;
            int var4 = class68.field1071.method760(false);
            int var5 = var4 >> 2;
            int var6 = var4 & 0x3;
            int var7 = class66.field1032[var5];
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                class224.method1458(-1, var7, var6, var2, var3, -1, var5, class163.field2364, false, 0);
            }
        } else if (class195.field2807 == 36) {
            int var8 = class68.field1071.method757(-1380156360);
            int var9 = class68.field1071.method750((byte) 127);
            if (var8 == 65535) {
                var8 = -1;
            }
            int var10 = var9 & 0x3;
            int var11 = var9 >> 2;
            int var12 = class66.field1032[var11];
            int var13 = class68.field1071.method760(false);
            int var14 = (var13 >> 4 & 0x7) + class262.field3950;
            int var15 = class96.field1455 + (var13 & 0x7);
            class152.method1030(class163.field2364, var14, var12, 262143, var15, var8, var11, var10);
        } else if (class195.field2807 == 68) {
            int var16 = class68.field1071.method760(false);
            int var17 = ((var16 & 0x74) >> 4) + class262.field3950;
            int var18 = (var16 & 0x7) + class96.field1455;
            int var19 = class68.field1071.method756(-29901);
            int var20 = class68.field1071.method760(false);
            if (var19 == 65535) {
                var19 = -1;
            }
            int var21 = (var20 & 0xF0) >> 4;
            int var22 = var20 & 0x7;
            int var23 = class68.field1071.method760(false);
            if (var17 >= 0 && var18 >= 0 && var17 < 104 && var18 < 104) {
                int var24 = var21 + 1;
                if (class55.field847.field119[0] >= (var17 - var24) && var17 + var24 >= class55.field847.field119[0] && (var18 - var24) <= class55.field847.field50[0] && var18 + var24 >= class55.field847.field50[0] && class62.field1000 != 0 && var22 > 0 && class224.field3358 < 50 && var19 != -1) {
                    class212.field3042[class224.field3358] = var19;
                    class160.field2325[class224.field3358] = var22;
                    field2098[class224.field3358] = var23;
                    class236.field3563[class224.field3358] = null;
                    class123.field1783[class224.field3358] = (var17 << 16) + (var18 << 8) + var21;
                    class224.field3358++;
                }
            }
        } else if (class195.field2807 == 241) {
            int var25 = class68.field1071.method757(-1380156360);
            int var26 = class68.field1071.method750((byte) 126);
            int var27 = (var26 & 0x7) + class96.field1455;
            int var28 = ((var26 & 0x7A) >> 4) + class262.field3950;
            int var29 = class68.field1071.method756(-29901);
            int var30 = class68.field1071.method733(false);
            if (var28 >= 0 && var27 >= 0 && var28 < 104 && var27 < 104 && class73.field1133 != var25) {
                class59 var31 = new class59();
                var31.field903 = var29;
                var31.field899 = var30;
                if (class162.field2335[class163.field2364][var28][var27] == null) {
                    class162.field2335[class163.field2364][var28][var27] = new class97();
                }
                class162.field2335[class163.field2364][var28][var27].method652(112, new class274(var31));
                class107.method702(30926, var28, var27);
            }
        } else if (arg0 == 7) {
            if (class195.field2807 == 29) {
                int var32 = class68.field1071.method760(false);
                int var33 = (var32 & 0x7) + class96.field1455;
                int var34 = ((var32 & 0x72) >> 4) + class262.field3950;
                int var35 = class68.field1071.method756(-29901);
                int var36 = class68.field1071.method756(arg0 - 29908);
                int var37 = class68.field1071.method756(-29901);
                if (var34 >= 0 && var33 >= 0 && var34 < 104 && var33 < 104) {
                    class97 var38 = class162.field2335[class163.field2364][var34][var33];
                    if (var38 != null) {
                        for (class274 var39 = (class274) var38.method656(arg0 + 107); var39 != null; var39 = (class274) var38.method650(arg0 + 119)) {
                            class59 var40 = var39.field4404;
                            if ((var35 & 0x7FFF) == var40.field903 && var40.field899 == var36) {
                                var40.field899 = var37;
                                break;
                            }
                        }
                        class107.method702(arg0 ^ 0x78C9, var34, var33);
                    }
                }
            } else if (class195.field2807 == 55) {
                int var41 = class68.field1071.method760(false);
                int var42 = (var41 & 0xF) + class96.field1455 * 2;
                int var43 = ((var41 & 0xFF) >> 4) + class262.field3950 * 2;
                int var44 = var43 + class68.field1071.method741(arg0 + 3076);
                int var45 = var42 + class68.field1071.method741(3083);
                int var46 = class68.field1071.method763(true);
                int var47 = class68.field1071.method763(true);
                int var48 = class68.field1071.method756(-29901);
                int var49 = class68.field1071.method741(3083);
                int var50 = class68.field1071.method760(false) * 4;
                int var51 = class68.field1071.method756(-29901);
                int var52 = class68.field1071.method756(-29901);
                int var53 = class68.field1071.method760(false);
                int var54 = class68.field1071.method760(false);
                if (var53 == 255) {
                    var53 = -1;
                }
                if (var43 >= 0 && var42 >= 0 && var43 < 208 && var42 < 208 && var44 >= 0 && var45 >= 0 && var44 < 208 && var45 < 208 && var48 != 65535) {
                    int var55 = var43 * 64;
                    int var56 = var42 * 64;
                    int var57 = var45 * 64;
                    int var58 = var44 * 64;
                    if (var46 != 0) {
                        int var60;
                        class5 var62;
                        if (var46 < 0) {
                            int var59 = -var46 - 1;
                            var60 = var59 >> 11 & 0xF;
                            int var61 = var59 & 0x7FF;
                            if (class73.field1133 == var61) {
                                var62 = class55.field847;
                            } else {
                                var62 = class194.field2777[var61];
                            }
                        } else {
                            int var63 = var46 - 1;
                            var60 = var63 >> 11 & 0xF;
                            int var64 = var63 & 0x7FF;
                            var62 = class82.field1268[var64];
                        }
                        if (var62 != null) {
                            class35 var65 = var62.method73((byte) -44);
                            if (var65.field520 != null && var65.field520[var60] != null) {
                                var49 -= var65.field520[var60][1];
                                int var66 = var65.field520[var60][0];
                                int var67 = class18.field261[var62.field104];
                                int var68 = var65.field520[var60][2];
                                int var69 = class18.field259[var62.field104];
                                int var70 = var66 * var69 + var67 * var68 >> 16;
                                int var71 = var68 * var69 - (var66 * var67) >> 16;
                                var56 += var71;
                                var55 += var70;
                            }
                        }
                    }
                    class202 var73 = new class202(var48, class163.field2364, var55, var56, class81.method542(var55, -1, class163.field2364, var56) - var49, class82.field1267 + var51, class82.field1267 + var52, var53, var54, var47, var50);
                    var73.method1313(class81.method542(var58, -1, class163.field2364, var57) - var50, arg0 + 53, var57, class82.field1267 + var51, var58);
                    field2094.method652(105, new class136(var73));
                }
            } else if (class195.field2807 == 25) {
                int var74 = class68.field1071.method760(false);
                int var75 = (var74 & 0xF) + class96.field1455 * 2;
                int var76 = (var74 >> 4 & 0xF) + class262.field3950 * 2;
                int var77 = var76 + class68.field1071.method741(arg0 ^ 0xC0C);
                int var78 = var75 + class68.field1071.method741(arg0 + 3076);
                int var79 = class68.field1071.method763(true);
                int var80 = class68.field1071.method756(-29901);
                int var81 = class68.field1071.method760(false) * 4;
                int var82 = class68.field1071.method760(false) * 4;
                int var83 = class68.field1071.method756(-29901);
                int var84 = class68.field1071.method756(-29901);
                int var85 = class68.field1071.method760(false);
                if (var85 == 255) {
                    var85 = -1;
                }
                int var86 = class68.field1071.method760(false);
                if (var76 >= 0 && var75 >= 0 && var76 < 208 && var75 < 208 && var77 >= 0 && var78 >= 0 && var77 < 208 && var78 < 208 && var80 != 65535) {
                    int var87 = var75 * 64;
                    int var88 = var77 * 64;
                    int var89 = var76 * 64;
                    class202 var90 = new class202(var80, class163.field2364, var89, var87, class81.method542(var89, -1, class163.field2364, var87) - var81, class82.field1267 + var83, class82.field1267 + var84, var85, var86, var79, var82);
                    int var91 = var78 * 64;
                    var90.method1313(class81.method542(var88, -1, class163.field2364, var91) - var82, arg0 + 93, var91, class82.field1267 + var83, var88);
                    field2094.method652(65, new class136(var90));
                }
            } else if (class195.field2807 == 94) {
                int var92 = class68.field1071.method760(false);
                int var93 = (var92 >> 4 & 0x7) + class262.field3950;
                int var94 = class96.field1455 + (var92 & 0x7);
                int var95 = var93 + class68.field1071.method741(3083);
                int var96 = var94 + class68.field1071.method741(3083);
                int var97 = class68.field1071.method763(true);
                int var98 = class68.field1071.method756(arg0 - 29908);
                int var99 = class68.field1071.method760(false) * 4;
                int var100 = class68.field1071.method760(false) * 4;
                int var101 = class68.field1071.method756(arg0 ^ 0xFFFF8B34);
                int var102 = class68.field1071.method756(arg0 ^ 0xFFFF8B34);
                int var103 = class68.field1071.method760(false);
                if (var103 == 255) {
                    var103 = -1;
                }
                int var104 = class68.field1071.method760(false);
                if (var93 >= 0 && var94 >= 0 && var93 < 104 && var94 < 104 && var95 >= 0 && var96 >= 0 && var95 < 104 && var96 < 104 && var98 != 65535) {
                    int var105 = var95 * 128 + 64;
                    int var106 = var93 * 128 + 64;
                    int var107 = var96 * 128 + 64;
                    int var108 = var94 * 128 + 64;
                    class202 var109 = new class202(var98, class163.field2364, var106, var108, class81.method542(var106, -1, class163.field2364, var108) - var99, class82.field1267 + var101, class82.field1267 + var102, var103, var104, var97, var100);
                    var109.method1313(class81.method542(var105, arg0 - 8, class163.field2364, var107) - var100, -119, var107, class82.field1267 + var101, var105);
                    field2094.method652(arg0 ^ 0x6B, new class136(var109));
                }
            } else if (class195.field2807 == 103) {
                int var110 = class68.field1071.method746((byte) -113);
                int var111 = class68.field1071.method783(arg0 ^ 0x3A);
                int var112 = (var111 >> 4 & 0x7) + class262.field3950;
                int var113 = (var111 & 0x7) + class96.field1455;
                if (var112 >= 0 && var113 >= 0 && var112 < 104 && var113 < 104) {
                    class97 var114 = class162.field2335[class163.field2364][var112][var113];
                    if (var114 != null) {
                        for (class274 var115 = (class274) var114.method656(124); var115 != null; var115 = (class274) var114.method650(124)) {
                            if ((var110 & 0x7FFF) == var115.field4404.field903) {
                                var115.method1706(-121);
                                break;
                            }
                        }
                        if (var114.method656(124) == null) {
                            class162.field2335[class163.field2364][var112][var113] = null;
                        }
                        class107.method702(30926, var112, var113);
                    }
                }
            } else {
                if (class195.field2807 == 93) {
                    int var116 = class68.field1071.method756(-29901);
                    byte var117 = class68.field1071.method778((byte) -112);
                    byte var118 = class68.field1071.method762(arg0 ^ 0x7);
                    byte var119 = class68.field1071.method772(128);
                    int var120 = class68.field1071.method786(arg0 ^ 0xFFFFFFA9);
                    int var121 = class68.field1071.method750((byte) 127);
                    int var122 = class262.field3950 + (var121 >> 4 & 0x7);
                    int var123 = (var121 & 0x7) + class96.field1455;
                    int var124 = class68.field1071.method746((byte) -90);
                    byte var125 = class68.field1071.method772(128);
                    int var126 = class68.field1071.method750((byte) 127);
                    int var127 = var126 >> 2;
                    int var128 = var126 & 0x3;
                    int var129 = class68.field1071.method757(-1380156360);
                    class229.method1495(var122, -13058, var127, var128, var125, var117, var123, var124, var118, var120, var129, var116, var119);
                }
                if (class195.field2807 == 179) {
                    int var130 = class68.field1071.method760(false);
                    int var131 = class262.field3950 + (var130 >> 4 & 0x7);
                    int var132 = (var130 & 0x7) + class96.field1455;
                    int var133 = class68.field1071.method757(arg0 - 1380156367);
                    int var134 = class68.field1071.method756(-29901);
                    if (var131 >= 0 && var132 >= 0 && var131 < 104 && var132 < 104) {
                        class59 var135 = new class59();
                        var135.field903 = var134;
                        var135.field899 = var133;
                        if (class162.field2335[class163.field2364][var131][var132] == null) {
                            class162.field2335[class163.field2364][var131][var132] = new class97();
                        }
                        class162.field2335[class163.field2364][var131][var132].method652(52, new class274(var135));
                        class107.method702(30926, var131, var132);
                    }
                } else if (class195.field2807 == 229) {
                    int var136 = class68.field1071.method760(false);
                    int var137 = ((var136 & 0x74) >> 4) + class262.field3950;
                    int var138 = (var136 & 0x7) + class96.field1455;
                    int var139 = class68.field1071.method756(-29901);
                    int var140 = class68.field1071.method760(false);
                    int var141 = class68.field1071.method756(-29901);
                    if (var137 >= 0 && var138 >= 0 && var137 < 104 && var138 < 104) {
                        int var142 = var138 * 128 + 64;
                        int var143 = var137 * 128 + 64;
                        class73 var144 = new class73(var139, class163.field2364, var143, var142, class81.method542(var143, -1, class163.field2364, var142) - var140, var141, class82.field1267);
                        class86.field1323.method652(arg0 ^ 0x45, new class290(var144));
                    }
                } else if (class195.field2807 == 110) {
                    int var145 = class68.field1071.method783(99);
                    int var146 = var145 >> 2;
                    int var147 = var145 & 0x3;
                    int var148 = class66.field1032[var146];
                    int var149 = class68.field1071.method757(-1380156360);
                    int var150 = class68.field1071.method760(false);
                    int var151 = ((var150 & 0x7B) >> 4) + class262.field3950;
                    int var152 = (var150 & 0x7) + class96.field1455;
                    if (var151 >= 0 && var152 >= 0 && var151 < 104 && var152 < 104) {
                        class224.method1458(-1, var148, var147, var151, var152, var149, var146, class163.field2364, false, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIIBI)V")
    public static final void method981(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field2093++;
        int var6 = 0;
        int var7 = arg0 * arg0;
        int var8 = arg5;
        int var9 = arg5 * arg5;
        int var10 = var7 << 1;
        int var11 = var9 << 1;
        if (arg4 != 104) {
            method981(-1, -51, 114, 4, (byte) 85, 83);
        }
        int var12 = arg5 << 1;
        int var13 = (1 - var12) * var7 + var11;
        int var14 = var9 - ((var12 - 1) * var10);
        int var15 = var7 << 2;
        int var16 = ((var6 << 1) + 3) * var11;
        int var17 = var9 << 2;
        int var18 = ((arg5 << 1) - 3) * var10;
        int var19 = (var6 + 1) * var17;
        int var20 = (arg5 - 1) * var15;
        if (class93.field1418 <= arg1 && class254.field3857 >= arg1) {
            int var21 = class177.method1152(class93.field1412, class142.field2061, arg0 + arg3, 120);
            int var22 = class177.method1152(class93.field1412, class142.field2061, arg3 - arg0, 112);
            class183.method1181(arg2, (byte) -69, var21, class163.field2370[arg1], var22);
        }
        while (var8 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var14 += var19;
                    var6++;
                    var13 += var16;
                    var19 += var17;
                    var16 += var17;
                }
            }
            var8--;
            int var23 = arg1 + var8;
            int var24 = arg1 - var8;
            if (var14 < 0) {
                var6++;
                var14 += var19;
                var19 += var17;
                var13 += var16;
                var16 += var17;
            }
            var14 += -var18;
            var13 += -var20;
            if (var23 >= class93.field1418 && class254.field3857 >= var24) {
                int var25 = class177.method1152(class93.field1412, class142.field2061, arg3 + var6, -71);
                int var26 = class177.method1152(class93.field1412, class142.field2061, arg3 - var6, -5);
                if (class93.field1418 <= var24) {
                    class183.method1181(arg2, (byte) -69, var25, class163.field2370[var24], var26);
                }
                if (class254.field3857 >= var23) {
                    class183.method1181(arg2, (byte) -69, var25, class163.field2370[var23], var26);
                }
            }
            var20 -= var15;
            var18 -= var15;
        }
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)V")
    public static final void method982(int arg0) {
        class48.field707 = "Remova ";
        class48.field697 = "Sprites carregados";
        class227.field3409 = "Tentando reestabelecer conexão. Aguarde.";
        if (arg0 < 121) {
            field2097 = 126;
        }
        class179.field2553 = "Descartar";
        class55.field846 = "Conexão perdida.";
        class183.field2617 = "Objeto para membros";
        class155.field2263 = "Iniciando biblioteca 3D";
        class47.field661 = "cyan:";
        class248.field3722 = "Verificando atualizações - ";
        class110.field1591 = "Carregando fontes - ";
        class233.field3503 = "Cancelar";
        class183.field2607 = "Pegar";
        class10.field169 = " da sua lista de ignorados primeiro.";
        class124.field1802 = "Oculto";
        class40.field594 = "habilidade: ";
        class123.field1781 = "Fontes carregadas";
        class237.field3569 = "vermelho:";
        class39.field586 = "Pacote de palavras carregado";
        class52.field760 = "flash2:";
        class67.field1039 = "brilho2:";
        class168.field2435 = "brilho3:";
        class75.field1169 = "qualificação: ";
        class262.field3946 = "Lista de atualizações carregada";
        class227.field3408 = "onda2:";
        class70.field1096 = "Selecionar";
        class55.field830 = "Examinar";
        class80.field1238 = "Tela título carregada";
        class182.field2603 = "nível: ";
        class240.field3609 = "Usar";
        class235.field3541 = "Aguarde...";
        class47.field662 = "Ok";
        class197.field2847 = "Você não pode adicionar a si próprio à sua lista de ignorados.";
        class166.field2424 = "Interfaces carregadas";
        class42.field611 = "Carregando interfaces - ";
        class140.field2027 = "Conectando ao servidor de atualização";
        field2090++;
        class194.field2787 = "Carregando pacote de palavras - ";
        class23.field309 = "Alocando memória";
        class109.field1570 = "brilho3:";
        class263.field3966 = "verde:";
        class84.field1306 = "Remova ";
        class109.field1572 = "Sua lista de ignorados está cheia. O limite é 100 usuários.";
        class123.field1784 = "Config carregada";
        class38.field564 = "Largar";
        class221.field3281 = "deseja negociar com você.";
        class1.field15 = "flash1:";
        class96.field1454 = "Não é possível encontrar ";
        class72.field1116 = "Carregando sprites - ";
        class273.field4341 = "Memória alocada";
        class94.field1437 = "Virar para cá";
        class55.field845 = "M";
        class58.field895 = "Carregando dados da lista de mundos";
        class56.field857 = "roxo:";
        class124.field1809 = "Carregando config - ";
        class78.field1209 = "Conectado ao servidor de atualização";
        class176.field2504 = "Carregando tela título - ";
        class130.field1900 = " já está na sua lista de ignorados.";
        class91.field1385 = "Carregando /secure/libs_v4s/RCras - ";
        class284.field4516 = "Carregando...";
        class158.field2287 = "Caminhar para cá";
        class26.field358 = " entrou no jogo.";
        class86.field1333 = "Carregando. Aguarde.";
        class237.field3566 = "amarelo:";
        class20.field272 = " ";
        class43.field627 = "Mecanismo de som preparado";
        class194.field2795 = "Tela título aberta";
        class135.field1955 = "Continuar";
        class13.field208 = "Gerenciador de entradas carregado";
        class184.field2626 = "M";
        class1.field16 = "Atacar";
        class221.field3280 = " saiu do jogo.";
        class33.field478 = "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.";
        class181.field2598 = "RuneScape carregando. Aguarde...";
        class253.field3848 = "Selecionar opção";
        class163.field2366 = "Biblioteca 3D iniciada";
        class147.field2105 = "rolagem:";
        class89.field1358 = "deslizamento:";
        class16.field232 = "Dados da lista de mundos carregados";
        class152.field2203 = "branco:";
        class56.field849 = "brilho1:";
        class260.field3926 = "Fechar";
        class273.field4329 = "onda:";
        class66.field1034 = "K";
        class99.field1481 = " mais opções";
        class51.field746 = "Universo de jogo criado";
        class267.field4067 = " já está na sua lista de amigos.";
        class280.field4474 = "K";
        class163.field2375 = " da sua lista de amigos primeiro.";
        class203.field2942 = "Texturas carregadas";
        class124.field1805 = "tremor:";
        class101.field1509 = "Você não pode adicionar a si próprio à sua lista de amigos.";
    }
}
