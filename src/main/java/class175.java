import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class175 {

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "Lfn;")
    public static class52 field2573 = new class52(10, -1);

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "S")
    public static short field2574;

    @OriginalMember(owner = "client!pk", name = "j", descriptor = "Z")
    public static boolean field2577;

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "Lcs;")
    public static class351 field2575;

    @OriginalMember(owner = "client!pk", name = "o", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!pk", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field2581;

    @OriginalMember(owner = "client!pk", name = "t", descriptor = "[I")
    public static int[] field2587;

    @OriginalMember(owner = "client!pk", name = "p", descriptor = "[I")
    public static int[] field2583;

    @OriginalMember(owner = "client!pk", name = "v", descriptor = "[I")
    public static int[] field2589;

    @OriginalMember(owner = "client!pk", name = "q", descriptor = "[I")
    public static int[] field2584;

    @OriginalMember(owner = "client!pk", name = "s", descriptor = "[I")
    public static int[] field2586;

    @OriginalMember(owner = "client!pk", name = "l", descriptor = "[I")
    public static int[] field2579;

    @OriginalMember(owner = "client!pk", name = "r", descriptor = "Lfl;")
    public static class345 field2585;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!pk", name = "i", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!pk", name = "k", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!pk", name = "m", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!pk", name = "u", descriptor = "I")
    public static int field2588;

    static {
        new class112("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
        field2574 = 1;
        field2577 = false;
        field2575 = new class351(21, 2);
        field2582 = 50;
        field2581 = new String[field2582];
        field2587 = new int[field2582];
        field2583 = new int[field2582];
        field2589 = new int[field2582];
        field2584 = new int[field2582];
        field2586 = new int[field2582];
        field2579 = new int[field2582];
        field2585 = new class345("LIVE", 0);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)V", line = 4)
    public static void method1159(int arg0) {
        field2581 = null;
        field2583 = null;
        field2589 = null;
        field2575 = null;
        field2587 = null;
        field2573 = null;
        field2586 = null;
        if (arg0 != 21) {
            method1161(-19, (class464) null);
        }
        field2584 = null;
        field2585 = null;
        field2579 = null;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZI)V", line = 25)
    public static final void method1160(boolean arg0, int arg1) {
        class67.field1000 = arg0;
        if (arg1 != 116) {
            field2575 = null;
        }
        field2571++;
        if (class304.field4160 != null) {
            class304.field4160.method2082((byte) -43, !class410.method2404(-1));
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILbd;)V", line = 42)
    public static final void method1161(int arg0, class464 arg1) {
        field2570++;
        if (class204.field2929 == arg1) {
            int var2 = class388.field5458.method2503(true);
            int var3 = ((var2 & 0xFD) >> 4) + class231.field3262 * 2;
            int var4 = (var2 & 0xF) + class84.field1263 * 2;
            int var5 = var3 + class388.field5458.method2480(-8315);
            int var6 = var4 + class388.field5458.method2480(-8315);
            int var7 = class388.field5458.method2514(9786);
            int var8 = class388.field5458.method2514(9786);
            int var9 = class388.field5458.method2508(true);
            int var10 = class388.field5458.method2480(-8315);
            int var11 = class388.field5458.method2503(true) * 4;
            int var12 = class388.field5458.method2508(true);
            int var13 = class388.field5458.method2508(true);
            int var14 = class388.field5458.method2503(true);
            int var15 = class388.field5458.method2503(true);
            if (var14 == 255) {
                var14 = -1;
            }
            if (var3 >= 0 && var4 >= 0 && var3 < (class200.field2875 * 2) && (class200.field2875 * 2) > var4 && var5 >= 0 && var6 >= 0 && (class422.field5811 * 2) > var5 && class422.field5811 * 2 > var6 && var9 != 65535) {
                int var16 = var5 * 64;
                int var17 = var4 * 64;
                int var18 = var6 * 64;
                int var19 = var3 * 64;
                if (var7 != 0) {
                    int var21;
                    class75 var23;
                    if (var7 < 0) {
                        int var20 = -var7 - 1;
                        var21 = (var20 & 0x79FC) >> 11;
                        int var22 = var20 & 0x7FF;
                        if (class327.field4523 == var22) {
                            var23 = class2.field21;
                        } else {
                            var23 = class310.field4235[var22];
                        }
                    } else {
                        int var24 = var7 - 1;
                        int var25 = var24 & 0x7FF;
                        var21 = (var24 & 0x7EB1) >> 11;
                        var23 = class256.field3581[var25];
                    }
                    if (var23 != null) {
                        class318 var26 = var23.method517(-103);
                        if (var26.field4356 != null && var26.field4356[var21] != null) {
                            int var27 = var26.field4356[var21][0];
                            int var28 = var26.field4356[var21][2];
                            int var29 = var23.field1076.method493((byte) 123);
                            int var30 = class432.field5955[var29];
                            int var31 = class432.field5957[var29];
                            int var32 = var27 * var31 + var28 * var30 >> 15;
                            int var33 = var28 * var31 - var27 * var30 >> 15;
                            var17 += var33;
                            var19 += var32;
                            var10 -= var26.field4356[var21][1];
                        }
                    }
                }
                class288 var35 = new class288(var9, class24.field426, var19, var17, class418.method2441(var17, class24.field426, var19, -16778) - var10, class356.field4972 + var12, class356.field4972 + var13, var14, var15, var8, var11);
                var35.method1777(var16, var18, true, class418.method2441(var18, class24.field426, var16, -16778) - var11, class356.field4972 + var12);
                class68.field1005.method1553((byte) -87, new class314(var35));
            }
        } else if (class401.field5595 == arg1) {
            int var36 = class388.field5458.method2503(true);
            int var37 = (var36 >> 4 & 0x7) + class231.field3262;
            int var38 = (var36 & 0x7) + class84.field1263;
            int var39 = class388.field5458.method2508(true);
            if (var39 == 65535) {
                var39 = -1;
            }
            int var40 = class388.field5458.method2503(true);
            int var41 = var40 >> 4 & 0xF;
            int var42 = var40 & 0x7;
            int var43 = class388.field5458.method2503(true);
            int var44 = class388.field5458.method2503(true);
            if (var37 >= 0 && var38 >= 0 && var37 < class200.field2875 && var38 < class422.field5811) {
                int var45 = var41 + 1;
                if ((var37 - var45) <= class2.field21.field1144[0] && class2.field21.field1144[0] <= var37 + var45 && class2.field21.field1140[0] >= (var38 - var45) && (var38 + var45) >= class2.field21.field1140[0] && class491.field6932 != 0 && var42 > 0 && class345.field4718 < 50 && var39 != -1) {
                    class325.field4478[class345.field4718] = var39;
                    class317.field4304[class345.field4718] = var42;
                    class189.field2715[class345.field4718] = var43;
                    class400.field5593[class345.field4718] = null;
                    class468.field6565[class345.field4718] = (class24.field426 << 24) + var41 - (-(var37 << 16) - (var38 << 8));
                    class197.field2835[class345.field4718] = var44;
                    class345.field4718++;
                }
            }
        } else if (class166.field2445 == arg1) {
            class388.field5458.method2503(true);
            int var46 = class388.field5458.method2503(true);
            int var47 = ((var46 & 0x74) >> 4) + class231.field3262;
            int var48 = (var46 & 0x7) + class84.field1263;
            int var49 = class388.field5458.method2508(true);
            int var50 = class388.field5458.method2503(true);
            int var51 = class388.field5458.method2498(3);
            String var52 = class388.field5458.method2464(false);
            class60.method443(var51, var49, var52, class24.field426, var48, var50, -1, var47);
        } else if (class210.field2970 == arg1) {
            int var53 = class388.field5458.method2459(-96);
            int var54 = (var53 >> 4 & 0x7) + class231.field3262;
            int var55 = class84.field1263 + (var53 & 0x7);
            int var56 = class388.field5458.method2459(-100);
            int var57 = var56 >> 2;
            int var58 = var56 & 0x3;
            int var59 = class104.field1501[var57];
            int var60 = class388.field5458.method2508(true);
            if (var54 >= 0 && var55 >= 0 && class200.field2875 > var54 && var55 < class422.field5811) {
                class307.method1858(var57, class24.field426, var54, var59, 0, -128, var60, var58, -1, var55);
            }
        } else if (class22.field370 == arg1) {
            int var61 = class388.field5458.method2492((byte) -48);
            int var62 = class388.field5458.method2483(-2103088664);
            int var63 = class388.field5458.method2503(true);
            int var64 = class231.field3262 + ((var63 & 0x7E) >> 4);
            int var65 = (var63 & 0x7) + class84.field1263;
            int var66 = class388.field5458.method2492((byte) -48);
            if (var64 >= 0 && var65 >= 0 && class200.field2875 > var64 && var65 < class422.field5811 && class327.field4523 != var61) {
                class438.method2544(new class155(var66, var62), false, var65, var64, class24.field426);
                class421.method2447(-527387929, var65, class24.field426, var64);
            }
        } else if (class353.field4921 == arg1) {
            int var67 = class388.field5458.method2508(true);
            int var68 = class388.field5458.method2503(true);
            class304.field4160.method2075(var67, false).method2781(false, var68);
        } else if (class120.field1680 == arg1) {
            int var69 = class388.field5458.method2456(-29879);
            int var70 = var69 >> 2;
            int var71 = var69 & 0x3;
            int var72 = class104.field1501[var70];
            int var73 = class388.field5458.method2503(true);
            int var74 = ((var73 & 0x7A) >> 4) + class231.field3262;
            int var75 = class84.field1263 + (var73 & 0x7);
            if (var74 >= 0 && var75 >= 0 && var74 < class200.field2875 && class422.field5811 > var75) {
                class307.method1858(var70, class24.field426, var74, var72, 0, -126, -1, var71, -1, var75);
            }
        } else if (class283.field3885 == arg1) {
            int var76 = class388.field5458.method2503(true);
            int var77 = ((var76 & 0x71) >> 4) + class231.field3262;
            int var78 = (var76 & 0x7) + class84.field1263;
            int var79 = var77 + class388.field5458.method2480(-8315);
            int var80 = var78 + class388.field5458.method2480(-8315);
            int var81 = class388.field5458.method2514(9786);
            int var82 = class388.field5458.method2508(true);
            int var83 = class388.field5458.method2503(true) * 4;
            int var84 = class388.field5458.method2503(true) * 4;
            int var85 = class388.field5458.method2508(true);
            int var86 = class388.field5458.method2508(true);
            int var87 = class388.field5458.method2503(true);
            int var88 = class388.field5458.method2503(true);
            if (var87 == 255) {
                var87 = -1;
            }
            if (var77 >= 0 && var78 >= 0 && class200.field2875 > var77 && var78 < class422.field5811 && var79 >= 0 && var80 >= 0 && var79 < class200.field2875 && var80 < class422.field5811 && var82 != 65535) {
                int var89 = var78 * 128 + 64;
                int var90 = var77 * 128 + 64;
                int var91 = var80 * 128 + 64;
                int var92 = var79 * 128 + 64;
                class288 var93 = new class288(var82, class24.field426, var90, var89, class418.method2441(var89, class24.field426, var90, -16778) - var83, class356.field4972 + var85, class356.field4972 + var86, var87, var88, var81, var84);
                var93.method1777(var92, var91, true, class418.method2441(var91, class24.field426, var92, -16778) - var84, class356.field4972 + var85);
                class68.field1005.method1553((byte) -124, new class314(var93));
            }
        } else if (class449.field6185 == arg1) {
            int var94 = class388.field5458.method2503(true);
            int var95 = ((var94 & 0x72) >> 4) + class231.field3262;
            int var96 = (var94 & 0x7) + class84.field1263;
            int var97 = class388.field5458.method2508(true);
            int var98 = class388.field5458.method2508(true);
            int var99 = class388.field5458.method2508(true);
            if (class135.field1898 != null && var95 >= 0 && var96 >= 0 && var95 < class200.field2875 && class422.field5811 > var96) {
                class418 var100 = (class418) class135.field1898.method2614((long) (class24.field426 << 28 | var96 << 14 | var95), -76);
                if (var100 != null) {
                    for (class155 var101 = (class155) var100.field5749.method1544(-91); var101 != null; var101 = (class155) var100.field5749.method1546((byte) -42)) {
                        if ((var97 & 0x7FFF) == var101.field2233 && var101.field2240 == var98) {
                            var101.method1182(28818);
                            var101.field2240 = var99;
                            class438.method2544(var101, false, var96, var95, class24.field426);
                            break;
                        }
                    }
                    class421.method2447(-527387929, var96, class24.field426, var95);
                }
            }
        } else if (class138.field1963 == arg1) {
            int var102 = class388.field5458.method2508(true);
            int var103 = class388.field5458.method2456(-29879);
            int var104 = (var103 >> 4 & 0x7) + class231.field3262;
            int var105 = class84.field1263 + (var103 & 0x7);
            if (var104 >= 0 && var105 >= 0 && class200.field2875 > var104 && var105 < class422.field5811) {
                class418 var106 = (class418) class135.field1898.method2614((long) (class24.field426 << 28 | var105 << 14 | var104), -91);
                if (var106 != null) {
                    for (class155 var107 = (class155) var106.field5749.method1544(-119); var107 != null; var107 = (class155) var106.field5749.method1546((byte) -42)) {
                        if ((var102 & 0x7FFF) == var107.field2233) {
                            var107.method1182(28818);
                            break;
                        }
                    }
                    if (var106.field5749.method1549(2)) {
                        var106.method1182(28818);
                    }
                    class421.method2447(-527387929, var105, class24.field426, var104);
                }
            }
        } else if (class473.field6629 == arg1) {
            int var108 = class388.field5458.method2503(true);
            int var109 = (var108 >> 4 & 0xF) + class231.field3262 * 2;
            int var110 = (var108 & 0xF) + class84.field1263 * 2;
            int var111 = var109 + class388.field5458.method2480(-8315);
            int var112 = var110 + class388.field5458.method2480(-8315);
            int var113 = class388.field5458.method2514(9786);
            int var114 = class388.field5458.method2508(true);
            int var115 = class388.field5458.method2503(true) * 4;
            int var116 = class388.field5458.method2503(true) * 4;
            int var117 = class388.field5458.method2508(true);
            int var118 = class388.field5458.method2508(true);
            int var119 = class388.field5458.method2503(true);
            if (var119 == 255) {
                var119 = -1;
            }
            int var120 = class388.field5458.method2503(true);
            if (var109 >= 0 && var110 >= 0 && (class200.field2875 * 2) > var109 && var110 < class200.field2875 * 2 && var111 >= 0 && var112 >= 0 && class422.field5811 * 2 > var111 && var112 < (class422.field5811 * 2) && var114 != 65535) {
                int var121 = var110 * 64;
                int var122 = var112 * 64;
                int var123 = var109 * 64;
                int var124 = var111 * 64;
                class288 var125 = new class288(var114, class24.field426, var123, var121, class418.method2441(var121, class24.field426, var123, -16778) - var115, var117 - -class356.field4972, class356.field4972 + var118, var119, var120, var113, var116);
                var125.method1777(var124, var122, true, class418.method2441(var122, class24.field426, var124, -16778) - var116, class356.field4972 + var117);
                class68.field1005.method1553((byte) -78, new class314(var125));
            }
        } else {
            if (arg0 > -23) {
                field2583 = null;
            }
            if (class11.field196 == arg1) {
                int var126 = class388.field5458.method2512((byte) -56);
                int var127 = var126 >> 2;
                int var128 = var126 & 0x3;
                int var129 = class388.field5458.method2500(92);
                int var130 = class388.field5458.method2508(true);
                byte var131 = class388.field5458.method2480(-8315);
                int var132 = class388.field5458.method2459(-88);
                int var133 = (var132 >> 4 & 0x7) + class231.field3262;
                int var134 = (var132 & 0x7) + class84.field1263;
                int var135 = class388.field5458.method2500(115);
                int var136 = class388.field5458.method2485(65280);
                byte var137 = class388.field5458.method2480(-8315);
                byte var138 = class388.field5458.method2509(-26667);
                byte var139 = class388.field5458.method2480(-8315);
                if (!class338.field4636.method1092()) {
                    class103.method648(var135, var137, var133, var130, var129, var136, var139, var138, var127, false, var134, var128, var131, class24.field426);
                }
            } else if (class303.field4146 == arg1) {
                int var140 = class388.field5458.method2459(-89);
                int var141 = ((var140 & 0x7C) >> 4) + class231.field3262;
                int var142 = class84.field1263 + (var140 & 0x7);
                int var143 = class388.field5458.method2503(true);
                int var144 = var143 >> 2;
                int var145 = var143 & 0x3;
                int var146 = class104.field1501[var144];
                int var147 = class388.field5458.method2483(-2103088664);
                if (var147 == 65535) {
                    var147 = -1;
                }
                class191.method1228(var144, var147, var145, var142, true, var146, class24.field426, var141);
            } else if (class240.field3377 == arg1) {
                int var148 = class388.field5458.method2483(-2103088664);
                int var149 = class388.field5458.method2503(true);
                int var150 = class231.field3262 + (var149 >> 4 & 0x7);
                int var151 = (var149 & 0x7) + class84.field1263;
                int var152 = class388.field5458.method2508(true);
                if (var150 >= 0 && var151 >= 0 && class200.field2875 > var150 && var151 < class422.field5811) {
                    class438.method2544(new class155(var148, var152), false, var151, var150, class24.field426);
                    class421.method2447(-527387929, var151, class24.field426, var150);
                }
            } else if (class345.field4720 == arg1) {
                int var153 = class388.field5458.method2503(true);
                int var154 = (var153 >> 4 & 0x7) + class231.field3262;
                int var155 = class84.field1263 + (var153 & 0x7);
                int var156 = class388.field5458.method2508(true);
                int var157 = class388.field5458.method2503(true);
                int var158 = class388.field5458.method2508(true);
                if (var154 >= 0 && var155 >= 0 && var154 < class200.field2875 && var155 < class422.field5811) {
                    int var159 = var154 * 128 + 64;
                    int var160 = var155 * 128 + 64;
                    class233 var161 = new class233(var156, var158, class356.field4972, class24.field426, var159, class418.method2441(var160, class24.field426, var159, -16778) - var157, var160, var154, var154, var155, var155);
                    class346.field4724.method1553((byte) -122, new class229(var161));
                }
            } else {
                class181.method1190((byte) 121, "T3 - " + arg1, (Throwable) null);
                class166.method1021(-125);
            }
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "([[BLuq;B)V", line = 654)
    public static final void method1162(byte[][] arg0, class115 arg1, byte arg2) {
        field2572++;
        int var3 = class123.field1709.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var6 = arg0[var4];
            if (var6 != null) {
                int var7 = (class490.field6908[var4] >> 8) * 64 - class153.field2204;
                int var8 = (class490.field6908[var4] & 0xFF) * 64 - class325.field4472;
                class172.method1155(15547);
                arg1.method722(42, var7, var6, class308.field4209, class338.field4636, var8);
            }
        }
        int var5 = -71 / ((51 - arg2) / 60);
    }
}
