import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public abstract class class171 {

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "Loh;")
    public static class263 field3129 = class253.method1681(-119, "http:)4)4");

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
    public static int field3128 = 0;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "Loh;")
    public static class263 field3126 = class253.method1681(-126, "Titelbild geladen)3");

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
    public static int field3124 = 0;

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "Loh;")
    private static class263 field3132 = class253.method1681(-124, "Loaded world list data");

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "Loh;")
    public static class263 field3130 = field3132;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
    public static int field3125;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "Ltj;")
    public static class262 field3131;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)Z")
    public static final boolean method1126(int arg0, int arg1) {
        if (arg0 != 4) {
            field3126 = null;
        }
        field3125++;
        return ((arg1 & 0x2A6437) >> 21) != 0;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V")
    public abstract void method45(byte arg0);

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIJ)Z")
    public static final boolean method1127(int arg0, int arg1, int arg2, long arg3) {
        class2 var5 = class18.field417[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field43 != null && var5.field43.field646 == arg3) {
            return true;
        } else if (var5.field45 != null && var5.field45.field2550 == arg3) {
            return true;
        } else if (var5.field52 != null && var5.field52.field3013 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field27; var6++) {
                if (var5.field37[var6].field1408 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZIBI)I")
    public static final int method1128(boolean arg0, int arg1, byte arg2, int arg3) {
        field3123++;
        class103 var4 = (class103) class184.field3327.method31(-32665, (long) arg1);
        if (var4 == null) {
            return 0;
        }
        int var5 = 0;
        int var6 = 0;
        if (arg2 != 12) {
            method1126(108, -126);
        }
        while (var6 < var4.field1964.length) {
            if (var4.field1964[var6] >= 0 && class268.field4727 > var4.field1964[var6]) {
                class72 var7 = class92.method649(-32508, var4.field1964[var6]);
                if (var7.field1474 != null) {
                    class182 var8 = (class182) var7.field1474.method31(-32665, (long) arg3);
                    if (var8 != null) {
                        if (arg0) {
                            var5 += var4.field1951[var6] * var8.field3305;
                        } else {
                            var5 += var8.field3305;
                        }
                    }
                }
            }
            var6++;
        }
        return var5;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
    public static final void method1129(int arg0) {
        if (arg0 >= -28) {
            field3128 = 25;
        }
        field3127++;
        if (class252.field4386 == 227) {
            int var1 = class189.field3394.method1273(0);
            int var2 = (var1 >> 4 & 0x7) + class153.field2779;
            int var3 = (var1 & 0x7) + class268.field4722;
            int var4 = class189.field3394.method1326(-21737);
            int var5 = class189.field3394.method1294((byte) 3);
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                class13 var6 = new class13();
                var6.field342 = var4;
                var6.field350 = var5;
                if (class107.field2020[class12.field321][var2][var3] == null) {
                    class107.field2020[class12.field321][var2][var3] = new class277();
                }
                class107.field2020[class12.field321][var2][var3].method1883(new class109(var6), (byte) -3);
                class184.method1217(1610612736, var2, var3);
            }
        } else if (class252.field4386 == 176) {
            int var7 = class189.field3394.method1301(-8317);
            int var8 = (var7 & 0x7) + class268.field4722;
            int var9 = (var7 >> 4 & 0x7) + class153.field2779;
            int var10 = class189.field3394.method1294((byte) 3);
            int var11 = class189.field3394.method1301(-8317);
            int var12 = class189.field3394.method1294((byte) 3);
            if (var9 >= 0 && var8 >= 0 && var9 < 104 && var8 < 104) {
                int var13 = var9 * 128 + 64;
                int var14 = var8 * 128 + 64;
                class39 var15 = new class39(var10, class12.field321, var13, var14, class120.method781(class12.field321, var13, false, var14) - var11, var12, class228.field4012);
                class20.field450.method1883(new class229(var15), (byte) -3);
            }
        } else if (class252.field4386 == 214) {
            int var16 = class189.field3394.method1273(0);
            int var17 = var16 >> 2;
            int var18 = class60.field1236[var17];
            int var19 = var16 & 0x3;
            int var20 = class189.field3394.method1294((byte) 3);
            int var21 = class189.field3394.method1269(-13208);
            int var22 = ((var21 & 0x7B) >> 4) + class153.field2779;
            int var23 = (var21 & 0x7) + class268.field4722;
            if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104) {
                class115.method754(var17, true, var19, var23, var18, class12.field321, -1, var22, 0, var20);
            }
        } else if (class252.field4386 == 241) {
            int var24 = class189.field3394.method1269(-13208);
            int var25 = var24 & 0x3;
            int var26 = var24 >> 2;
            int var27 = class60.field1236[var26];
            int var28 = class189.field3394.method1294((byte) 3);
            int var29 = class189.field3394.method1301(-8317);
            if (var28 == 65535) {
                var28 = -1;
            }
            int var30 = (var29 >> 4 & 0x7) + class153.field2779;
            int var31 = (var29 & 0x7) + class268.field4722;
            class44.method268(var26, var30, -68, var25, var31, var28, class12.field321, var27);
        } else if (class252.field4386 == 101) {
            int var32 = class189.field3394.method1301(-8317);
            int var33 = (var32 & 0x7) + class268.field4722;
            int var34 = (var32 >> 4 & 0x7) + class153.field2779;
            int var35 = var34 + class189.field3394.method1281((byte) -8);
            int var36 = var33 + class189.field3394.method1281((byte) -104);
            int var37 = class189.field3394.method1298((byte) -81);
            int var38 = class189.field3394.method1294((byte) 3);
            int var39 = class189.field3394.method1301(-8317) * 4;
            int var40 = class189.field3394.method1301(-8317) * 4;
            int var41 = class189.field3394.method1294((byte) 3);
            int var42 = class189.field3394.method1294((byte) 3);
            int var43 = class189.field3394.method1301(-8317);
            int var44 = class189.field3394.method1301(-8317);
            if (var34 >= 0 && var33 >= 0 && var34 < 104 && var33 < 104 && var35 >= 0 && var36 >= 0 && var35 < 104 && var36 < 104 && var38 != 65535) {
                int var45 = var33 * 128 + 64;
                int var46 = var35 * 128 + 64;
                int var47 = var36 * 128 + 64;
                int var48 = var34 * 128 + 64;
                class158 var49 = new class158(var38, class12.field321, var48, var45, class120.method781(class12.field321, var48, false, var45) - var39, class228.field4012 + var41, var42 + class228.field4012, var43, var44, var37, var40);
                var49.method1029(class120.method781(class12.field321, var46, false, var47) - var40, var47, var46, 4205, class228.field4012 + var41);
                class182.field3300.method1883(new class112(var49), (byte) -3);
            }
        } else if (class252.field4386 == 105) {
            int var50 = class189.field3394.method1301(-8317);
            int var51 = (var50 >> 4 & 0xF) + class153.field2779 * 2;
            int var52 = (var50 & 0xF) + class268.field4722 * 2;
            int var53 = class189.field3394.method1281((byte) -32) + var51;
            int var54 = class189.field3394.method1281((byte) 122) + var52;
            int var55 = class189.field3394.method1298((byte) -128);
            int var56 = class189.field3394.method1294((byte) 3);
            int var57 = class189.field3394.method1301(-8317) * 4;
            int var58 = class189.field3394.method1301(-8317) * 4;
            int var59 = class189.field3394.method1294((byte) 3);
            int var60 = class189.field3394.method1294((byte) 3);
            int var61 = class189.field3394.method1301(-8317);
            int var62 = class189.field3394.method1301(-8317);
            if (var51 >= 0 && var52 >= 0 && var51 < 208 && var52 < 208 && var53 >= 0 && var54 >= 0 && var53 < 208 && var54 < 208 && var56 != 65535) {
                int var63 = var51 * 64;
                int var64 = var53 * 64;
                int var65 = var54 * 64;
                int var66 = var52 * 64;
                class158 var67 = new class158(var56, class12.field321, var63, var66, class120.method781(class12.field321, var63, false, var66) - var57, class228.field4012 + var59, class228.field4012 + var60, var61, var62, var55, var58);
                var67.method1029(class120.method781(class12.field321, var64, false, var65) - var58, var65, var64, 4205, class228.field4012 + var59);
                class182.field3300.method1883(new class112(var67), (byte) -3);
            }
        } else if (class252.field4386 == 222) {
            int var68 = class189.field3394.method1301(-8317);
            int var69 = (var68 >> 4 & 0x7) + class153.field2779;
            int var70 = (var68 & 0x7) + class268.field4722;
            int var71 = class189.field3394.method1294((byte) 3);
            int var72 = class189.field3394.method1294((byte) 3);
            int var73 = class189.field3394.method1294((byte) 3);
            if (var69 >= 0 && var70 >= 0 && var69 < 104 && var70 < 104) {
                class277 var74 = class107.field2020[class12.field321][var69][var70];
                if (var74 != null) {
                    for (class109 var75 = (class109) var74.method1878(true); var75 != null; var75 = (class109) var74.method1881(-122)) {
                        class13 var76 = var75.field2050;
                        if ((var71 & 0x7FFF) == var76.field342 && var76.field350 == var72) {
                            var76.field350 = var73;
                            break;
                        }
                    }
                    class184.method1217(1610612736, var69, var70);
                }
            }
        } else if (class252.field4386 == 210) {
            int var77 = class189.field3394.method1301(-8317);
            int var78 = ((var77 & 0x75) >> 4) + class153.field2779;
            int var79 = class268.field4722 + (var77 & 0x7);
            int var80 = class189.field3394.method1294((byte) 3);
            if (var80 == 65535) {
                var80 = -1;
            }
            int var81 = class189.field3394.method1301(-8317);
            int var82 = (var81 & 0xF4) >> 4;
            int var83 = var81 & 0x7;
            int var84 = class189.field3394.method1301(-8317);
            if (var78 >= 0 && var79 >= 0 && var78 < 104 && var79 < 104) {
                int var85 = var82 + 1;
                if (class229.field4018.field4714[0] >= var78 - var85 && class229.field4018.field4714[0] <= var78 + var85 && class229.field4018.field4713[0] >= var79 - var85 && class229.field4018.field4713[0] <= var79 + var85 && class214.field3798 != 0 && var83 > 0 && class112.field2107 < 50 && var80 != -1) {
                    class55.field1154[class112.field2107] = var80;
                    class35.field824[class112.field2107] = var83;
                    class24.field680[class112.field2107] = var84;
                    class150.field2713[class112.field2107] = null;
                    class243.field4294[class112.field2107] = (var78 << 16) + var82 + (var79 << 8);
                    class112.field2107++;
                }
            }
        } else if (class252.field4386 == 187) {
            int var86 = class189.field3394.method1269(-13208);
            int var87 = var86 >> 2;
            int var88 = var86 & 0x3;
            int var89 = class60.field1236[var87];
            int var90 = class189.field3394.method1279(false);
            int var91 = (var90 & 0x7) + class268.field4722;
            int var92 = (var90 >> 4 & 0x7) + class153.field2779;
            if (var92 >= 0 && var91 >= 0 && var92 < 104 && var91 < 104) {
                class115.method754(var87, true, var88, var91, var89, class12.field321, -1, var92, 0, -1);
            }
        } else {
            if (class252.field4386 == 179) {
                byte var93 = class189.field3394.method1300((byte) 32);
                int var94 = class189.field3394.method1326(-21737);
                byte var95 = class189.field3394.method1265((byte) 43);
                int var96 = class189.field3394.method1273(0);
                int var97 = var96 >> 2;
                int var98 = class60.field1236[var97];
                int var99 = var96 & 0x3;
                int var100 = class189.field3394.method1295(-1);
                int var101 = class189.field3394.method1269(-13208);
                int var102 = class268.field4722 + (var101 & 0x7);
                int var103 = (var101 >> 4 & 0x7) + class153.field2779;
                int var104 = class189.field3394.method1295(-1);
                byte var105 = class189.field3394.method1265((byte) 43);
                byte var106 = class189.field3394.method1300((byte) -126);
                int var107 = class189.field3394.method1294((byte) 3);
                class137 var108;
                if (class196.field3574 == var100) {
                    var108 = class229.field4018;
                } else {
                    var108 = class151.field2725[var100];
                }
                if (var108 != null) {
                    class12 var109 = class117.method763(var107, (byte) -125);
                    int var110;
                    int var111;
                    if (var99 == 1 || var99 == 3) {
                        var110 = var109.field308;
                        var111 = var109.field329;
                    } else {
                        var110 = var109.field329;
                        var111 = var109.field308;
                    }
                    int var112 = (var110 >> 1) + var103;
                    int var113 = (var110 + 1 >> 1) + var103;
                    int var114 = var102 + (var111 + 1 >> 1);
                    int var115 = (var111 >> 1) + var102;
                    int[][] var116 = null;
                    int[][] var117 = class112.field2102[class12.field321];
                    if (class12.field321 < 3) {
                        var116 = class112.field2102[class12.field321 + 1];
                    }
                    int var118 = var117[var112][var115] + var117[var113][var115] + var117[var113][var114] + var117[var112][var114] >> 2;
                    int var119 = (var103 << 7) + (var110 << 6);
                    int var120 = (var102 << 7) + (var111 << 6);
                    class100 var121 = var109.method93(var116, var118, var120, var109.field265, var117, false, var119, var97, (class88) null, -27556, var99);
                    if (var121 != null) {
                        if (var106 < var95) {
                            byte var122 = var95;
                            var95 = var106;
                            var106 = var122;
                        }
                        class115.method754(0, true, 0, var102, var98, class12.field321, var104 + 1, var103, var94 + 1, -1);
                        var108.field2517 = var103 * 128 + (var110 * 64);
                        var108.field2516 = var103 + var95;
                        var108.field2519 = var94 + class228.field4012;
                        var108.field2510 = var118;
                        var108.field2500 = var102 * 128 + var111 * 64;
                        if (var93 > var105) {
                            byte var123 = var93;
                            var93 = var105;
                            var105 = var123;
                        }
                        var108.field2502 = (class76) var121.field1911;
                        var108.field2539 = var102 + var105;
                        var108.field2535 = var104 + class228.field4012;
                        var108.field2531 = var93 + var102;
                        var108.field2507 = var103 + var106;
                    }
                }
            }
            if (class252.field4386 == 186) {
                int var124 = class189.field3394.method1282(false);
                int var125 = class189.field3394.method1269(-13208);
                int var126 = ((var125 & 0x76) >> 4) + class153.field2779;
                int var127 = (var125 & 0x7) + class268.field4722;
                if (var126 >= 0 && var127 >= 0 && var126 < 104 && var127 < 104) {
                    class277 var128 = class107.field2020[class12.field321][var126][var127];
                    if (var128 != null) {
                        for (class109 var129 = (class109) var128.method1878(true); var129 != null; var129 = (class109) var128.method1881(-41)) {
                            if ((var124 & 0x7FFF) == var129.field2050.field342) {
                                var129.method1614(-1204826926);
                                break;
                            }
                        }
                        if (var128.method1878(true) == null) {
                            class107.field2020[class12.field321][var126][var127] = null;
                        }
                        class184.method1217(1610612736, var126, var127);
                    }
                }
            } else if (class252.field4386 == 24) {
                int var130 = class189.field3394.method1269(-13208);
                int var131 = class153.field2779 + ((var130 & 0x7A) >> 4);
                int var132 = class268.field4722 + (var130 & 0x7);
                int var133 = class189.field3394.method1294((byte) 3);
                int var134 = class189.field3394.method1295(-1);
                int var135 = class189.field3394.method1282(false);
                if (var131 >= 0 && var132 >= 0 && var131 < 104 && var132 < 104 && class196.field3574 != var134) {
                    class13 var136 = new class13();
                    var136.field350 = var135;
                    var136.field342 = var133;
                    if (class107.field2020[class12.field321][var131][var132] == null) {
                        class107.field2020[class12.field321][var131][var132] = new class277();
                    }
                    class107.field2020[class12.field321][var131][var132].method1883(new class109(var136), (byte) -3);
                    class184.method1217(1610612736, var131, var132);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIB)I")
    public abstract int method47(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(B)V")
    public static void method1130(byte arg0) {
        field3132 = null;
        field3126 = null;
        if (arg0 != 82) {
            field3126 = null;
        }
        field3129 = null;
        field3130 = null;
        field3131 = null;
    }
}
