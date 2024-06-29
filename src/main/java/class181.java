import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class181 {

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "Leg;")
    private static class37 field3024 = class174.method1167("Prepared sound engine", 117);

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "[J")
    public static long[] field3025 = new long[100];

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "I")
    public static int field3023 = 0;

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "Leg;")
    public static class37 field3028 = class174.method1167("; Expires=", 90);

    @OriginalMember(owner = "client!gk", name = "k", descriptor = "Leg;")
    public static class37 field3029 = class174.method1167("Abbrechen", 62);

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "Leg;")
    public static class37 field3022 = field3024;

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "Leg;")
    private static class37 field3021 = class174.method1167("Loading wordpack )2 ", 104);

    @OriginalMember(owner = "client!gk", name = "n", descriptor = "Leg;")
    public static class37 field3032 = field3021;

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "Leg;")
    public static class37 field3027 = class174.method1167("(U2", -21);

    @OriginalMember(owner = "client!gk", name = "o", descriptor = "Lbf;")
    public static class202 field3033 = new class202(64);

    @OriginalMember(owner = "client!gk", name = "s", descriptor = "Leg;")
    public static class37 field3037 = class174.method1167("leuchten2:", -29);

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "I")
    public static int field3020;

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!gk", name = "m", descriptor = "I")
    public static int field3031;

    @OriginalMember(owner = "client!gk", name = "p", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "client!gk", name = "q", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "Lmd;")
    public static class208 field3019;

    @OriginalMember(owner = "client!gk", name = "l", descriptor = "Lpe;")
    public static class237 field3030;

    @OriginalMember(owner = "client!gk", name = "r", descriptor = "[[Z")
    public static boolean[][] field3036;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V")
    public static final void method1196(int arg0) {
        field3034++;
        if (class215.field3718 == 110) {
            int var1 = class213.field3680.method1278(true);
            int var2 = ((var1 & 0x7D) >> 4) + class148.field2505;
            int var3 = class168.field2816 + (var1 & 0x7);
            int var4 = class213.field3680.method1244(false);
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                class226 var5 = class210.field3621[class237.field4140][var2][var3];
                if (var5 != null) {
                    for (class61 var6 = (class61) var5.method1566(-3); var6 != null; var6 = (class61) var5.method1570(3)) {
                        if ((var4 & 0x7FFF) == var6.field995.field739) {
                            var6.method441(16773377);
                            break;
                        }
                    }
                    if (var5.method1566(-3) == null) {
                        class210.field3621[class237.field4140][var2][var3] = null;
                    }
                    class50.method324(var3, var2, (byte) 21);
                }
            }
        } else if (class215.field3718 == 22) {
            int var7 = class213.field3680.method1268(255);
            int var8 = var7 >> 2;
            int var9 = var7 & 0x3;
            int var10 = class108.field1724[var8];
            int var11 = class213.field3680.method1278(true);
            int var12 = ((var11 & 0x79) >> 4) + class148.field2505;
            int var13 = (var11 & 0x7) + class168.field2816;
            int var14 = class213.field3680.method1282(255);
            if (var12 >= 0 && var13 >= 0 && var12 < 104 && var13 < 104) {
                class180.method1195(var12, var13, var9, 0, var14, -1, class237.field4140, -1, var8, var10);
            }
        } else if (class215.field3718 == 34) {
            int var15 = class213.field3680.method1268(255);
            int var16 = (var15 >> 4 & 0x7) + class148.field2505;
            int var17 = (var15 & 0x7) + class168.field2816;
            int var18 = class213.field3680.method1244(false);
            int var19 = class213.field3680.method1268(255);
            int var20 = class213.field3680.method1244(false);
            if (var16 >= 0 && var17 >= 0 && var16 < 104 && var17 < 104) {
                int var21 = var17 * 128 + 64;
                int var22 = var16 * 128 + 64;
                class113 var23 = new class113(var18, class237.field4140, var22, var21, class262.method1768(class237.field4140, var22, var21, (byte) -126) - var19, var20, class72.field1146);
                class281.field4956.method1574(new class268(var23), 0);
            }
        } else if (class215.field3718 == 73) {
            int var24 = class213.field3680.method1268(255);
            int var25 = ((var24 & 0x7E) >> 4) + class148.field2505;
            int var26 = class168.field2816 + (var24 & 0x7);
            int var27 = class213.field3680.method1244(false);
            int var28 = class213.field3680.method1244(false);
            int var29 = class213.field3680.method1244(false);
            if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104) {
                class226 var30 = class210.field3621[class237.field4140][var25][var26];
                if (var30 != null) {
                    for (class61 var31 = (class61) var30.method1566(-3); var31 != null; var31 = (class61) var30.method1570(3)) {
                        class47 var32 = var31.field995;
                        if ((var27 & 0x7FFF) == var32.field739 && var32.field751 == var28) {
                            var32.field751 = var29;
                            break;
                        }
                    }
                    class50.method324(var26, var25, (byte) 21);
                }
            }
        } else {
            if (arg0 >= -53) {
                field3022 = null;
            }
            if (class215.field3718 == 215) {
                int var33 = class213.field3680.method1255(false);
                int var34 = var33 >> 2;
                int var35 = class108.field1724[var34];
                int var36 = var33 & 0x3;
                int var37 = class213.field3680.method1255(false);
                int var38 = class168.field2816 + (var37 & 0x7);
                int var39 = ((var37 & 0x73) >> 4) + class148.field2505;
                if (var39 >= 0 && var38 >= 0 && var39 < 104 && var38 < 104) {
                    class180.method1195(var39, var38, var36, 0, -1, -1, class237.field4140, -1, var34, var35);
                }
            } else if (class215.field3718 == 31) {
                int var40 = class213.field3680.method1268(255);
                int var41 = (var40 & 0x7) + class168.field2816;
                int var42 = (var40 >> 4 & 0x7) + class148.field2505;
                int var43 = var42 + class213.field3680.method1269(255);
                int var44 = class213.field3680.method1269(255) + var41;
                int var45 = class213.field3680.method1276((byte) 105);
                int var46 = class213.field3680.method1244(false);
                int var47 = class213.field3680.method1268(255) * 4;
                int var48 = class213.field3680.method1268(255) * 4;
                int var49 = class213.field3680.method1244(false);
                int var50 = class213.field3680.method1244(false);
                int var51 = class213.field3680.method1268(255);
                int var52 = class213.field3680.method1268(255);
                if (var42 >= 0 && var41 >= 0 && var42 < 104 && var41 < 104 && var43 >= 0 && var44 >= 0 && var43 < 104 && var44 < 104 && var46 != 65535) {
                    int var53 = var42 * 128 + 64;
                    int var54 = var44 * 128 + 64;
                    int var55 = var43 * 128 + 64;
                    int var56 = var41 * 128 + 64;
                    class232 var57 = new class232(var46, class237.field4140, var53, var56, class262.method1768(class237.field4140, var53, var56, (byte) -128) - var47, var49 - -class72.field1146, class72.field1146 + var50, var51, var52, var45, var48);
                    var57.method1602(var55, -115, var49 + class72.field1146, -var48 + class262.method1768(class237.field4140, var55, var54, (byte) -104), var54);
                    class59.field952.method1574(new class31(var57), 0);
                }
            } else {
                if (class215.field3718 == 9) {
                    int var58 = class213.field3680.method1268(255);
                    int var59 = var58 & 0x3;
                    int var60 = var58 >> 2;
                    int var61 = class108.field1724[var60];
                    int var62 = class213.field3680.method1244(false);
                    int var63 = class213.field3680.method1282(255);
                    byte var64 = class213.field3680.method1269(255);
                    int var65 = class213.field3680.method1263(true);
                    byte var66 = class213.field3680.method1270(0);
                    byte var67 = class213.field3680.method1269(255);
                    byte var68 = class213.field3680.method1269(255);
                    int var69 = class213.field3680.method1286(8);
                    int var70 = class213.field3680.method1250(-120);
                    int var71 = (var70 & 0x7) + class168.field2816;
                    class188 var72;
                    if (class116.field1986 == var62) {
                        var72 = class82.field1285;
                    } else {
                        var72 = class98.field1526[var62];
                    }
                    int var73 = class148.field2505 + ((var70 & 0x76) >> 4);
                    if (var72 != null) {
                        class133 var74 = class178.method1186(var65, 0);
                        int var75;
                        int var76;
                        if (var59 == 1 || var59 == 3) {
                            var76 = var74.field2272;
                            var75 = var74.field2306;
                        } else {
                            var75 = var74.field2272;
                            var76 = var74.field2306;
                        }
                        int var77 = (var75 >> 1) + var73;
                        int var78 = var73 + (var75 + 1 >> 1);
                        int var79 = (var76 >> 1) + var71;
                        int[][] var80 = class218.field3754[class237.field4140];
                        int var81 = (var76 + 1 >> 1) + var71;
                        int var82 = var80[var77][var79] + var80[var78][var79] + var80[var77][var81] + var80[var78][var81] >> 2;
                        int[][] var83 = null;
                        int var84 = (var73 << 7) + (var75 << 6);
                        if (class237.field4140 < 3) {
                            var83 = class218.field3754[class237.field4140 + 1];
                        }
                        int var85 = (var71 << 7) + (var76 << 6);
                        class40 var86 = var74.method959((class14) null, var59, var82, var83, var80, var84, 17, var60, var85, var74.field2275, false);
                        if (var86 != null) {
                            if (var64 > var68) {
                                byte var87 = var64;
                                var64 = var68;
                                var68 = var87;
                            }
                            if (var66 < var67) {
                                byte var88 = var67;
                                var67 = var66;
                                var66 = var88;
                            }
                            class180.method1195(var73, var71, 0, var69 + 1, -1, var63 + 1, class237.field4140, -1, 0, var61);
                            var72.field3218 = var67 + var71;
                            var72.field3236 = var66 + var71;
                            var72.field3229 = var73 + var68;
                            var72.field3239 = var82;
                            var72.field3211 = var64 + var73;
                            var72.field3214 = var71 * 128 + (var76 * 64);
                            var72.field3242 = (class253) var86.field648;
                            var72.field3208 = var73 * 128 + var75 * 64;
                            var72.field3233 = class72.field1146 + var63;
                            var72.field3206 = class72.field1146 + var69;
                        }
                    }
                }
                if (class215.field3718 == 156) {
                    int var89 = class213.field3680.method1263(true);
                    int var90 = class213.field3680.method1268(255);
                    int var91 = (var90 & 0x7) + class168.field2816;
                    int var92 = ((var90 & 0x7A) >> 4) + class148.field2505;
                    int var93 = class213.field3680.method1263(true);
                    int var94 = class213.field3680.method1286(8);
                    if (var92 >= 0 && var91 >= 0 && var92 < 104 && var91 < 104 && class116.field1986 != var94) {
                        class47 var95 = new class47();
                        var95.field739 = var89;
                        var95.field751 = var93;
                        if (class210.field3621[class237.field4140][var92][var91] == null) {
                            class210.field3621[class237.field4140][var92][var91] = new class226();
                        }
                        class210.field3621[class237.field4140][var92][var91].method1574(new class61(var95), 0);
                        class50.method324(var91, var92, (byte) 21);
                    }
                } else if (class215.field3718 == 192) {
                    int var96 = class213.field3680.method1286(8);
                    if (var96 == 65535) {
                        var96 = -1;
                    }
                    int var97 = class213.field3680.method1255(false);
                    int var98 = var97 >> 2;
                    int var99 = var97 & 0x3;
                    int var100 = class108.field1724[var98];
                    int var101 = class213.field3680.method1268(255);
                    int var102 = (var101 >> 4 & 0x7) + class148.field2505;
                    int var103 = (var101 & 0x7) + class168.field2816;
                    class289.method1940(var103, (byte) 3, var99, var96, var98, var102, var100, class237.field4140);
                } else if (class215.field3718 == 189) {
                    int var104 = class213.field3680.method1278(true);
                    int var105 = class148.field2505 + ((var104 & 0x7D) >> 4);
                    int var106 = class168.field2816 + (var104 & 0x7);
                    int var107 = class213.field3680.method1244(false);
                    int var108 = class213.field3680.method1263(true);
                    if (var105 >= 0 && var106 >= 0 && var105 < 104 && var106 < 104) {
                        class47 var109 = new class47();
                        var109.field739 = var108;
                        var109.field751 = var107;
                        if (class210.field3621[class237.field4140][var105][var106] == null) {
                            class210.field3621[class237.field4140][var105][var106] = new class226();
                        }
                        class210.field3621[class237.field4140][var105][var106].method1574(new class61(var109), 0);
                        class50.method324(var106, var105, (byte) 21);
                    }
                } else if (class215.field3718 == 115) {
                    int var110 = class213.field3680.method1268(255);
                    int var111 = (var110 >> 4 & 0x7) + class148.field2505;
                    int var112 = (var110 & 0x7) + class168.field2816;
                    int var113 = class213.field3680.method1244(false);
                    if (var113 == 65535) {
                        var113 = -1;
                    }
                    int var114 = class213.field3680.method1268(255);
                    int var115 = (var114 & 0xF4) >> 4;
                    int var116 = var114 & 0x7;
                    int var117 = class213.field3680.method1268(255);
                    if (var111 >= 0 && var112 >= 0 && var111 < 104 && var112 < 104) {
                        int var118 = var115 + 1;
                        if (class82.field1285.field1812[0] >= (var111 - var118) && class82.field1285.field1812[0] <= (var111 + var118) && var112 - var118 <= class82.field1285.field1780[0] && class82.field1285.field1780[0] <= (var112 + var118) && class151.field2544 != 0 && var116 > 0 && class159.field2658 < 50 && var113 != -1) {
                            class202.field3443[class159.field2658] = var113;
                            class281.field4957[class159.field2658] = var116;
                            class235.field4055[class159.field2658] = var117;
                            class202.field3446[class159.field2658] = null;
                            class42.field667[class159.field2658] = (var111 << 16) + (var112 << 8) + var115;
                            class159.field2658++;
                        }
                    }
                } else if (class215.field3718 == 60) {
                    int var119 = class213.field3680.method1268(255);
                    int var120 = class148.field2505 * 2 + ((var119 & 0xF1) >> 4);
                    int var121 = (var119 & 0xF) + class168.field2816 * 2;
                    int var122 = class213.field3680.method1269(255) + var120;
                    int var123 = var121 + class213.field3680.method1269(255);
                    int var124 = class213.field3680.method1276((byte) 102);
                    int var125 = class213.field3680.method1244(false);
                    int var126 = class213.field3680.method1268(255) * 4;
                    int var127 = class213.field3680.method1268(255) * 4;
                    int var128 = class213.field3680.method1244(false);
                    int var129 = class213.field3680.method1244(false);
                    int var130 = class213.field3680.method1268(255);
                    int var131 = class213.field3680.method1268(255);
                    if (var120 >= 0 && var121 >= 0 && var120 < 208 && var121 < 208 && var122 >= 0 && var123 >= 0 && var122 < 208 && var123 < 208 && var125 != 65535) {
                        int var132 = var121 * 64;
                        int var133 = var122 * 64;
                        int var134 = var120 * 64;
                        int var135 = var123 * 64;
                        class232 var136 = new class232(var125, class237.field4140, var134, var132, class262.method1768(class237.field4140, var134, var132, (byte) -122) - var126, class72.field1146 + var128, class72.field1146 + var129, var130, var131, var124, var127);
                        var136.method1602(var133, -7, class72.field1146 + var128, -var127 + class262.method1768(class237.field4140, var133, var135, (byte) -118), var135);
                        class59.field952.method1574(new class31(var136), 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)V")
    public static final void method1197(int arg0) {
        field3031++;
        if (class35.field501 || class165.field2737 == 2) {
            return;
        }
        try {
            if (arg0 == 17820) {
                class179.field2983.method234(0, class133.field2291);
            }
        } catch (Throwable var1) {
        }
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(I)V")
    public static void method1198(int arg0) {
        field3033 = null;
        field3027 = null;
        if (arg0 < 19) {
            method1197(58);
        }
        field3030 = null;
        field3022 = null;
        field3028 = null;
        field3021 = null;
        field3032 = null;
        field3024 = null;
        field3019 = null;
        field3029 = null;
        field3036 = null;
        field3037 = null;
        field3025 = null;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(BJ)V")
    public static final void method1199(byte arg0, long arg1) {
        field3026++;
        if (arg1 == 0L) {
            return;
        }
        if (class62.field1028 >= 100) {
            class274.method1839((byte) -59, 0, class179.field2989, class289.field5102);
            return;
        }
        class37 var3 = class35.method201(arg1, 2).method227(-98);
        for (int var4 = 0; var4 < class62.field1028; var4++) {
            if (class68.field1068[var4] == arg1) {
                class274.method1839((byte) -74, 0, class179.field2989, class156.method1061((byte) 110, new class37[] { var3, class95.field1493 }));
                return;
            }
        }
        int var5 = 29 / ((arg0 - 17) / 61);
        for (int var6 = 0; var6 < class242.field4363; var6++) {
            if (class58.field941[var6] == arg1) {
                class274.method1839((byte) -53, 0, class179.field2989, class156.method1061((byte) 75, new class37[] { class99.field1529, var3, class40.field644 }));
                return;
            }
        }
        if (var3.method223(class82.field1285.field3235, (byte) 63)) {
            class274.method1839((byte) -122, 0, class179.field2989, class24.field325);
            return;
        }
        class68.field1068[class62.field1028] = arg1;
        class244.field4399[class62.field1028++] = class35.method201(arg1, 2);
        class121.field2045++;
        class218.field3750 = class221.field3804;
        class273.field4778.method1697(31, 120);
        class273.field4778.method1256(arg1, (byte) 84);
    }
}
