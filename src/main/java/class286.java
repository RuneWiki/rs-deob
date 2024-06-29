import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class286 extends class117 {

    @OriginalMember(owner = "client!lk", name = "B", descriptor = "[Lik;")
    public static class54[] field4319 = new class54[50];

    @OriginalMember(owner = "client!lk", name = "v", descriptor = "[I")
    public static int[] field4313 = new int[500];

    @OriginalMember(owner = "client!lk", name = "E", descriptor = "F")
    public static float field4322;

    @OriginalMember(owner = "client!lk", name = "l", descriptor = "I")
    public int field4303;

    @OriginalMember(owner = "client!lk", name = "m", descriptor = "I")
    public int field4304;

    @OriginalMember(owner = "client!lk", name = "n", descriptor = "I")
    public int field4305;

    @OriginalMember(owner = "client!lk", name = "p", descriptor = "I")
    public static int field4307;

    @OriginalMember(owner = "client!lk", name = "q", descriptor = "I")
    public static int field4308;

    @OriginalMember(owner = "client!lk", name = "s", descriptor = "I")
    public int field4310;

    @OriginalMember(owner = "client!lk", name = "t", descriptor = "I")
    public static int field4311;

    @OriginalMember(owner = "client!lk", name = "u", descriptor = "I")
    public static int field4312;

    @OriginalMember(owner = "client!lk", name = "w", descriptor = "I")
    public static int field4314;

    @OriginalMember(owner = "client!lk", name = "x", descriptor = "I")
    public int field4315;

    @OriginalMember(owner = "client!lk", name = "y", descriptor = "I")
    public static int field4316;

    @OriginalMember(owner = "client!lk", name = "A", descriptor = "I")
    public int field4318;

    @OriginalMember(owner = "client!lk", name = "C", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!lk", name = "D", descriptor = "I")
    public int field4321;

    @OriginalMember(owner = "client!lk", name = "F", descriptor = "I")
    public int field4323;

    @OriginalMember(owner = "client!lk", name = "H", descriptor = "I")
    public static int field4325;

    @OriginalMember(owner = "client!lk", name = "I", descriptor = "I")
    public int field4326;

    @OriginalMember(owner = "client!lk", name = "J", descriptor = "I")
    public static int field4327;

    @OriginalMember(owner = "client!lk", name = "K", descriptor = "I")
    public int field4328;

    @OriginalMember(owner = "client!lk", name = "L", descriptor = "I")
    public int field4329;

    @OriginalMember(owner = "client!lk", name = "N", descriptor = "I")
    public int field4330;

    @OriginalMember(owner = "client!lk", name = "O", descriptor = "I")
    public int field4331;

    @OriginalMember(owner = "client!lk", name = "P", descriptor = "I")
    public int field4332;

    @OriginalMember(owner = "client!lk", name = "R", descriptor = "I")
    public int field4334;

    @OriginalMember(owner = "client!lk", name = "S", descriptor = "I")
    public int field4335;

    @OriginalMember(owner = "client!lk", name = "T", descriptor = "I")
    public int field4336;

    @OriginalMember(owner = "client!lk", name = "G", descriptor = "Lwk;")
    public class119 field4324;

    @OriginalMember(owner = "client!lk", name = "Q", descriptor = "Lbd;")
    public class226 field4333;

    @OriginalMember(owner = "client!lk", name = "z", descriptor = "Lpk;")
    public class291 field4317;

    @OriginalMember(owner = "client!lk", name = "o", descriptor = "Ld;")
    public class43 field4306;

    @OriginalMember(owner = "client!lk", name = "r", descriptor = "[[[B")
    public static byte[][][] field4309;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(B)V", line = 23)
    public static void method2063(byte arg0) {
        int var1 = -43 / ((77 - arg0) / 35);
        field4319 = null;
        field4309 = (byte[][][]) null;
        field4313 = null;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Z)V", line = 35)
    public final void method2064(boolean arg0) {
        this.field4324 = null;
        this.field4317 = null;
        this.field4306 = null;
        this.field4333 = null;
        if (arg0) {
            field4320++;
        }
    }

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "(I)V", line = 49)
    public static final void method2065(int arg0) {
        field4316++;
        if (class54.field788 == 34) {
            int var1 = class83.field1194.method1317((byte) 15);
            int var2 = class83.field1194.method1319(255);
            class30.method212(0, var1).method1924(var2, -27);
        } else if (class54.field788 == 91) {
            int var3 = class83.field1194.method1319(255);
            int var4 = var3 >> 2;
            int var5 = class103.field1481[var4];
            int var6 = var3 & 0x3;
            int var7 = class83.field1194.method1351(14794);
            int var8 = (var7 & 0x7) + class133.field1946;
            int var9 = class125.field1819 + (var7 >> 4 & 0x7);
            if (var9 >= 0 && var8 >= 0 && var9 < 104 && var8 < 104) {
                class175.method1227(var9, var4, var5, 3344, var8, -1, 0, var6, class321.field4835, -1);
            }
        } else if (class54.field788 == 118) {
            int var148 = class83.field1194.method1351(14794);
            int var149 = var148 & 0x3;
            int var150 = var148 >> 2;
            int var151 = class103.field1481[var150];
            int var152 = class83.field1194.method1350(0);
            if (var152 == 65535) {
                var152 = -1;
            }
            int var153 = class83.field1194.method1351(14794);
            int var154 = (var153 & 0x7) + class133.field1946;
            int var155 = class125.field1819 + ((var153 & 0x7B) >> 4);
            class190.method1325(var155, var149, class321.field4835, var151, var154, -102, var152, var150);
        } else if (class54.field788 == 189) {
            int var10 = class83.field1194.method1320((byte) 51);
            int var11 = (var10 >> 4 & 0x7) + class125.field1819;
            int var12 = (var10 & 0x7) + class133.field1946;
            int var13 = class83.field1194.method1362(255);
            int var14 = class83.field1194.method1362(255);
            if (var11 >= 0 && var12 >= 0 && var11 < 104 && var12 < 104) {
                class270 var15 = new class270();
                var15.field4108 = var13;
                var15.field4098 = var14;
                if (class252.field3762[class321.field4835][var11][var12] == null) {
                    class252.field3762[class321.field4835][var11][var12] = new class16();
                }
                class252.field3762[class321.field4835][var11][var12].method106(new class158(var15), -128);
                class241.method1776(var12, true, var11);
            }
        } else if (class54.field788 == 186) {
            int var16 = class83.field1194.method1319(255);
            int var17 = ((var16 & 0xF2) >> 4) + class125.field1819 * 2;
            int var18 = class133.field1946 * 2 + (var16 & 0xF);
            int var19 = class83.field1194.method1322(9813) + var17;
            int var20 = class83.field1194.method1322(9813) + var18;
            int var21 = class83.field1194.method1347((byte) 61);
            int var22 = class83.field1194.method1347((byte) 61);
            int var23 = class83.field1194.method1317((byte) 42);
            int var24 = class83.field1194.method1322(9813);
            int var25 = class83.field1194.method1319(255) * 4;
            int var26 = class83.field1194.method1317((byte) 108);
            int var27 = class83.field1194.method1317((byte) 59);
            int var28 = class83.field1194.method1319(255);
            int var29 = class83.field1194.method1319(255);
            if (var28 == 255) {
                var28 = -1;
            }
            if (var17 >= 0 && var18 >= 0 && var17 < 208 && var18 < 208 && var19 >= 0 && var20 >= 0 && var19 < 208 && var20 < 208 && var23 != 65535) {
                int var30 = var20 * 64;
                int var31 = var18 * 64;
                int var32 = var19 * 64;
                int var33 = var17 * 64;
                if (var21 != 0) {
                    class333 var36;
                    int var37;
                    if (var21 < 0) {
                        int var34 = -var21 - 1;
                        int var35 = var34 & 0x7FF;
                        if (class54.field790 == var35) {
                            var36 = class1.field55;
                        } else {
                            var36 = class343.field5312[var35];
                        }
                        var37 = var34 >> 11 & 0xF;
                    } else {
                        int var38 = var21 - 1;
                        int var39 = var38 & 0x7FF;
                        var36 = class300.field4495[var39];
                        var37 = (var38 & 0x7C53) >> 11;
                    }
                    if (var36 != null) {
                        class15 var40 = var36.method2355(true);
                        if (var40.field233 != null && var40.field233[var37] != null) {
                            var24 -= var40.field233[var37][1];
                            int var41 = var40.field233[var37][0];
                            int var42 = var40.field233[var37][2];
                            int var43 = class345.field5339[var36.field5199];
                            int var44 = class345.field5343[var36.field5199];
                            int var45 = var41 * var44 + var42 * var43 >> 16;
                            int var46 = var42 * var44 - var41 * var43 >> 16;
                            var31 += var46;
                            var33 += var45;
                        }
                    }
                }
                class332 var48 = new class332(var23, class321.field4835, var33, var31, class71.method584(class321.field4835, var33, -63, var31) - var24, var26 - -class304.field4560, class304.field4560 + var27, var28, var29, var22, var25);
                var48.method2335(-36, class71.method584(class321.field4835, var32, 65, var30) - var25, class304.field4560 + var26, var32, var30);
                class62.field905.method106(new class19(var48), -127);
            }
        } else if (class54.field788 == 137) {
            int var139 = class83.field1194.method1319(255);
            int var140 = ((var139 & 0x79) >> 4) + class125.field1819;
            int var141 = (var139 & 0x7) + class133.field1946;
            int var142 = class83.field1194.method1317((byte) 122);
            int var143 = class83.field1194.method1317((byte) 101);
            int var144 = class83.field1194.method1317((byte) 53);
            if (var140 >= 0 && var141 >= 0 && var140 < 104 && var141 < 104) {
                class16 var145 = class252.field3762[class321.field4835][var140][var141];
                if (var145 != null) {
                    for (class158 var146 = (class158) var145.method93((byte) -112); var146 != null; var146 = (class158) var145.method97(-108)) {
                        class270 var147 = var146.field2273;
                        if ((var142 & 0x7FFF) == var147.field4108 && var147.field4098 == var143) {
                            var147.field4098 = var144;
                            break;
                        }
                    }
                    class241.method1776(var141, true, var140);
                }
            }
        } else if (class54.field788 == 11) {
            int var131 = class83.field1194.method1370(-31156);
            int var132 = class125.field1819 + ((var131 & 0x74) >> 4);
            int var133 = (var131 & 0x7) + class133.field1946;
            int var134 = class83.field1194.method1370(-31156);
            int var135 = var134 >> 2;
            int var136 = class103.field1481[var135];
            int var137 = class83.field1194.method1317((byte) 29);
            int var138 = var134 & 0x3;
            if (var132 >= 0 && var133 >= 0 && var132 < 104 && var133 < 104) {
                class175.method1227(var132, var135, var136, 3344, var133, var137, 0, var138, class321.field4835, -1);
            }
        } else if (class54.field788 == 124) {
            int var49 = class83.field1194.method1319(255);
            int var50 = ((var49 & 0x74) >> 4) + class125.field1819;
            int var51 = (var49 & 0x7) + class133.field1946;
            int var52 = class83.field1194.method1317((byte) 118);
            if (var52 == 65535) {
                var52 = -1;
            }
            int var53 = class83.field1194.method1319(255);
            int var54 = var53 & 0x7;
            int var55 = var53 >> 4 & 0xF;
            int var56 = class83.field1194.method1319(255);
            int var57 = class83.field1194.method1319(255);
            if (var50 >= 0 && var51 >= 0 && var50 < 104 && var51 < 104) {
                int var58 = var55 + 1;
                if (var50 - var58 <= class1.field55.field5186[0] && (var50 + var58) >= class1.field55.field5186[0] && class1.field55.field5162[0] >= (var51 - var58) && (var51 + var58) >= class1.field55.field5162[0] && class207.field3035 != 0 && var54 > 0 && class194.field2821 < 50 && var52 != -1) {
                    class186.field2668[class194.field2821] = var52;
                    class300.field4489[class194.field2821] = var54;
                    class214.field3141[class194.field2821] = var56;
                    class276.field4188[class194.field2821] = null;
                    class225.field3396[class194.field2821] = (var50 << 16) + (var51 << 8) + var55;
                    class344.field5322[class194.field2821] = var57;
                    class194.field2821++;
                }
            }
        } else {
            if (class54.field788 == 158) {
                byte var59 = class83.field1194.method1322(9813);
                int var60 = class83.field1194.method1350(0);
                int var61 = class83.field1194.method1319(255);
                int var62 = ((var61 & 0x71) >> 4) + class125.field1819;
                int var63 = (var61 & 0x7) + class133.field1946;
                int var64 = class83.field1194.method1341(121);
                int var65 = class83.field1194.method1319(255);
                int var66 = var65 >> 2;
                int var67 = var65 & 0x3;
                int var68 = class83.field1194.method1338((byte) -54);
                byte var69 = class83.field1194.method1316((byte) -106);
                int var70 = class83.field1194.method1362(255);
                byte var71 = class83.field1194.method1353(83);
                byte var72 = class83.field1194.method1353(-66);
                if (!class141.field2031) {
                    class30.method208(var72, var68, var71, (byte) 111, var67, var70, var63, var69, var64, var62, var59, var60, var66);
                }
            }
            if (class54.field788 == 150) {
                int var113 = class83.field1194.method1319(255);
                int var114 = (var113 & 0xF) + class133.field1946 * 2;
                int var115 = (var113 >> 4 & 0xF) + class125.field1819 * 2;
                int var116 = class83.field1194.method1322(9813) + var115;
                int var117 = class83.field1194.method1322(9813) + var114;
                int var118 = class83.field1194.method1347((byte) 61);
                int var119 = class83.field1194.method1317((byte) 53);
                int var120 = class83.field1194.method1319(255) * 4;
                int var121 = class83.field1194.method1319(255) * 4;
                int var122 = class83.field1194.method1317((byte) 46);
                int var123 = class83.field1194.method1317((byte) 115);
                int var124 = class83.field1194.method1319(255);
                int var125 = class83.field1194.method1319(255);
                if (var124 == 255) {
                    var124 = -1;
                }
                if (var115 >= 0 && var114 >= 0 && var115 < 208 && var114 < 208 && var116 >= 0 && var117 >= 0 && var116 < 208 && var117 < 208 && var119 != 65535) {
                    int var126 = var115 * 64;
                    int var127 = var117 * 64;
                    int var128 = var116 * 64;
                    int var129 = var114 * 64;
                    class332 var130 = new class332(var119, class321.field4835, var126, var129, class71.method584(class321.field4835, var126, -89, var129) - var120, class304.field4560 + var122, class304.field4560 + var123, var124, var125, var118, var121);
                    var130.method2335(118, class71.method584(class321.field4835, var128, -109, var127) - var121, class304.field4560 + var122, var128, var127);
                    class62.field905.method106(new class19(var130), -126);
                }
            } else if (class54.field788 == 66) {
                int var73 = class83.field1194.method1370(-31156);
                int var74 = (var73 >> 4 & 0x7) + class125.field1819;
                int var75 = class133.field1946 + (var73 & 0x7);
                int var76 = class83.field1194.method1350(0);
                int var77 = class83.field1194.method1362(255);
                int var78 = class83.field1194.method1338((byte) -54);
                if (var74 >= 0 && var75 >= 0 && var74 < 104 && var75 < 104 && class54.field790 != var78) {
                    class270 var79 = new class270();
                    var79.field4108 = var77;
                    var79.field4098 = var76;
                    if (class252.field3762[class321.field4835][var74][var75] == null) {
                        class252.field3762[class321.field4835][var74][var75] = new class16();
                    }
                    class252.field3762[class321.field4835][var74][var75].method106(new class158(var79), -128);
                    class241.method1776(var75, true, var74);
                }
            } else if (class54.field788 == 103) {
                int var104 = class83.field1194.method1319(255);
                int var105 = (var104 & 0x7) + class133.field1946;
                int var106 = (var104 >> 4 & 0x7) + class125.field1819;
                int var107 = class83.field1194.method1317((byte) 20);
                int var108 = class83.field1194.method1319(255);
                int var109 = class83.field1194.method1317((byte) 42);
                if (var106 >= 0 && var105 >= 0 && var106 < 104 && var105 < 104) {
                    int var110 = var105 * 128 + 64;
                    int var111 = var106 * 128 + 64;
                    class323 var112 = new class323(var107, class321.field4835, var111, var110, class71.method584(class321.field4835, var111, 108, var110) - var108, var109, class304.field4560);
                    class217.field3199.method106(new class211(var112), -126);
                }
            } else {
                if (arg0 <= 2) {
                    method2069(-77, 43, true, 23, -44, 53);
                }
                if (class54.field788 == 235) {
                    int var86 = class83.field1194.method1319(255);
                    int var87 = class133.field1946 + (var86 & 0x7);
                    int var88 = ((var86 & 0x7C) >> 4) + class125.field1819;
                    int var89 = var88 + class83.field1194.method1322(9813);
                    int var90 = class83.field1194.method1322(9813) + var87;
                    int var91 = class83.field1194.method1347((byte) 61);
                    int var92 = class83.field1194.method1317((byte) 51);
                    int var93 = class83.field1194.method1319(255) * 4;
                    int var94 = class83.field1194.method1319(255) * 4;
                    int var95 = class83.field1194.method1317((byte) 19);
                    int var96 = class83.field1194.method1317((byte) 47);
                    int var97 = class83.field1194.method1319(255);
                    int var98 = class83.field1194.method1319(255);
                    if (var97 == 255) {
                        var97 = -1;
                    }
                    if (var88 >= 0 && var87 >= 0 && var88 < 104 && var87 < 104 && var89 >= 0 && var90 >= 0 && var89 < 104 && var90 < 104 && var92 != 65535) {
                        int var99 = var89 * 128 + 64;
                        int var100 = var90 * 128 + 64;
                        int var101 = var87 * 128 + 64;
                        int var102 = var88 * 128 + 64;
                        class332 var103 = new class332(var92, class321.field4835, var102, var101, class71.method584(class321.field4835, var102, -120, var101) - var93, class304.field4560 + var95, class304.field4560 + var96, var97, var98, var91, var94);
                        var103.method2335(-108, class71.method584(class321.field4835, var99, -59, var100) - var94, class304.field4560 + var95, var99, var100);
                        class62.field905.method106(new class19(var103), -127);
                    }
                } else if (class54.field788 == 60) {
                    int var80 = class83.field1194.method1351(14794);
                    int var81 = (var80 & 0x7) + class133.field1946;
                    int var82 = ((var80 & 0x7C) >> 4) + class125.field1819;
                    int var83 = class83.field1194.method1350(0);
                    if (var82 >= 0 && var81 >= 0 && var82 < 104 && var81 < 104) {
                        class16 var84 = class252.field3762[class321.field4835][var82][var81];
                        if (var84 != null) {
                            for (class158 var85 = (class158) var84.method93((byte) -123); var85 != null; var85 = (class158) var84.method97(-85)) {
                                if ((var83 & 0x7FFF) == var85.field2273.field4108) {
                                    var85.method876(8);
                                    break;
                                }
                            }
                            if (var84.method93((byte) -49) == null) {
                                class252.field3762[class321.field4835][var82][var81] = null;
                            }
                            class241.method1776(var81, true, var82);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IZI)Ljava/lang/String;", line = 641)
    public static final String method2066(int arg0, boolean arg1, int arg2) {
        field4307++;
        int var3 = arg0 - arg2;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (!arg1) {
            return (String) null;
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else if (var3 > 3) {
            return "<col=80ff00>";
        } else if (var3 <= 0) {
            return "<col=ffff00>";
        } else {
            return "<col=c0ff00>";
        }
    }

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "(I)V", line = 684)
    public static final void method2067(int arg0) {
        class312.field4646 = new class16();
        if (arg0 == -1) {
            field4308++;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(JB)Ljava/lang/String;", line = 703)
    public static final String method2068(long arg0, byte arg1) {
        field4311++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            int var4 = 12 % ((arg1 + 18) / 43);
            for (long var5 = arg0; var5 != 0L; var5 /= 37L) {
                var3++;
            }
            StringBuffer var7 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var8 = arg0;
                arg0 /= 37L;
                var7.append(class177.field2545[(int) (var8 - (arg0 * 37L))]);
            }
            return var7.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIZIII)V", line = 742)
    public static final void method2069(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg5 < 1) {
            arg5 = 1;
        }
        if (arg1 < 1) {
            arg1 = 1;
        }
        field4327++;
        if (class141.field2031) {
            int var6 = arg1 - 334;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 100) {
                var6 = 100;
            }
            int var7 = (class54.field798 - class265.field4055) * var6 / 100 + class265.field4055;
            if (var7 < class323.field4867) {
                var7 = class323.field4867;
            } else if (var7 > class299.field4470) {
                var7 = class299.field4470;
            }
            int var8 = arg1 * var7 * 512 / (arg5 * 334);
            if (var8 < class256.field3827) {
                short var9 = class256.field3827;
                var7 = arg5 * var9 * 334 / (arg1 * 512);
                if (var7 > class299.field4470) {
                    var7 = class299.field4470;
                    int var10 = arg1 * var7 * 512 / (var9 * 334);
                    int var11 = (arg5 - var10) / 2;
                    if (arg2) {
                        class205.method1489();
                        class205.method1499(arg4, arg0, var11, arg1, 0);
                        class205.method1499(arg4 + arg5 - var11, arg0, var11, arg1, 0);
                    }
                    arg4 += var11;
                    arg5 -= var11 * 2;
                }
            } else if (class306.field4587 < var8) {
                short var12 = class306.field4587;
                var7 = var12 * 334 * arg5 / (arg1 * 512);
                if (class323.field4867 > var7) {
                    var7 = class323.field4867;
                    int var13 = arg5 * var12 * 334 / (var7 * 512);
                    int var14 = (arg1 - var13) / 2;
                    if (arg2) {
                        class205.method1489();
                        class205.method1499(arg4, arg0, arg5, var14, 0);
                        class205.method1499(arg4, arg0 + arg1 - var14, arg5, var14, 0);
                    }
                    arg0 += var14;
                    arg1 -= var14 * 2;
                }
            }
            class167.field2417 = arg1 * var7 / 334;
        }
        if (arg3 != 64) {
            method2066(-30, false, 71);
        }
        class109.field1584 = (short) arg5;
        class40.field580 = (short) arg1;
        class322.field4849 = arg0;
        class14.field205 = arg4;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)V", line = 844)
    public static final void method2070(int arg0, int arg1) {
        if (arg0 > -91) {
            field4319 = (class54[]) null;
        }
        class335.field5215 = 1000 / arg1;
        field4325++;
    }

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "(I)V", line = 863)
    public static final void method2071(int arg0) {
        field4314++;
        if (arg0 != -15170) {
            return;
        }
        if (class61.field882.toLowerCase().indexOf("microsoft") != -1) {
            class83.field1184[188] = 71;
            class83.field1184[187] = 27;
            class83.field1184[191] = 73;
            class83.field1184[189] = 26;
            class83.field1184[186] = 57;
            class83.field1184[220] = 74;
            class83.field1184[222] = 59;
            class83.field1184[219] = 42;
            class83.field1184[221] = 43;
            class83.field1184[190] = 72;
            class83.field1184[223] = 28;
            class83.field1184[192] = 58;
            return;
        }
        if (class61.field899 == null) {
            class83.field1184[192] = 58;
            class83.field1184[222] = 59;
        } else {
            class83.field1184[192] = 28;
            class83.field1184[520] = 59;
            class83.field1184[222] = 58;
        }
        class83.field1184[59] = 57;
        class83.field1184[61] = 27;
        class83.field1184[91] = 42;
        class83.field1184[92] = 74;
        class83.field1184[47] = 73;
        class83.field1184[46] = 72;
        class83.field1184[93] = 43;
        class83.field1184[44] = 71;
        class83.field1184[45] = 26;
    }
}
