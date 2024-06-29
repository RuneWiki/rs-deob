import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class103 {

    @OriginalMember(owner = "client!of", name = "b", descriptor = "I")
    public int field2562 = 0;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "I")
    public int field2566 = 0;

    @OriginalMember(owner = "client!of", name = "k", descriptor = "Lkd;")
    public static class73 field2571 = class126.method1070((byte) -66, "Wir vermuten)1 dass Ihr Konto gestohlen wurde");

    @OriginalMember(owner = "client!of", name = "j", descriptor = "I")
    public static int field2570 = 0;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    public static int field2564 = 0;

    @OriginalMember(owner = "client!of", name = "i", descriptor = "Lkd;")
    public static class73 field2569 = class126.method1070((byte) -66, "::clientdrop");

    @OriginalMember(owner = "client!of", name = "g", descriptor = "I")
    public static int field2567 = 0;

    @OriginalMember(owner = "client!of", name = "m", descriptor = "Lkd;")
    public static class73 field2573 = class126.method1070((byte) -66, "<col=ffffff> )4 ");

    @OriginalMember(owner = "client!of", name = "a", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "I")
    public int field2563;

    @OriginalMember(owner = "client!of", name = "h", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!of", name = "l", descriptor = "I")
    public int field2572;

    @OriginalMember(owner = "client!of", name = "o", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!of", name = "p", descriptor = "I")
    public int field2576;

    @OriginalMember(owner = "client!of", name = "q", descriptor = "I")
    public int field2577;

    @OriginalMember(owner = "client!of", name = "r", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!of", name = "t", descriptor = "I")
    public int field2580;

    @OriginalMember(owner = "client!of", name = "u", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!of", name = "v", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "Lbc;")
    public static class11 field2565;

    @OriginalMember(owner = "client!of", name = "n", descriptor = "Lcc;")
    public class18 field2574;

    @OriginalMember(owner = "client!of", name = "s", descriptor = "Lcc;")
    public class18 field2579;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(B)I")
    public static final int method826(byte arg0) {
        field2575++;
        return arg0 < 100 ? -120 : 6;
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(B)V")
    public static final void method827(byte arg0) {
        class86.field2181.method995(115);
        if (arg0 <= 44) {
            method829(false, (byte) -91);
        }
        class26.field754 = 1;
        class104.field2591 = null;
        field2561++;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)V")
    public static final void method828(boolean arg0) {
        field2581++;
        if (class142.field3535 == 24) {
            int var1 = class89.field2235.method957((byte) 37);
            int var2 = (var1 & 0x7) + class19.field531;
            int var3 = (var1 >> 4 & 0x7) + class84.field2149;
            int var4 = class89.field2235.method934((byte) -9);
            if (var3 >= 0 && var2 >= 0 && var3 < 104 && var2 < 104) {
                class61 var5 = class118.field3019[class11.field320][var3][var2];
                if (var5 != null) {
                    for (class24 var6 = (class24) var5.method514((byte) -79); var6 != null; var6 = (class24) var5.method517(-57)) {
                        if ((var4 & 0x7FFF) == var6.field692) {
                            var6.method1147((byte) -43);
                            break;
                        }
                    }
                    if (var5.method514((byte) -79) == null) {
                        class118.field3019[class11.field320][var3][var2] = null;
                    }
                    class36.method285(var3, var2, true);
                }
            }
        } else if (class142.field3535 == 190) {
            int var7 = class89.field2235.method959(128);
            int var8 = (var7 >> 4 & 0x7) + class84.field2149;
            int var9 = (var7 & 0x7) + class19.field531;
            int var10 = class89.field2235.method962(!arg0);
            int var11 = var10 & 0x3;
            int var12 = var10 >> 2;
            int var13 = class49.field1301[var12];
            int var14 = class89.field2235.method934((byte) -9);
            if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) {
                class81.method693(class11.field320, var14, 0, var13, var12, -1, (byte) -110, var11, var8, var9);
            }
        } else if (class142.field3535 == 31) {
            int var15 = class89.field2235.method938(-128);
            int var16 = (var15 >> 4 & 0x7) + class84.field2149;
            int var17 = class19.field531 + (var15 & 0x7);
            int var18 = class89.field2235.method962(false);
            int var19 = var18 >> 2;
            int var20 = var18 & 0x3;
            int var21 = class49.field1301[var19];
            if (var16 >= 0 && var17 >= 0 && var16 < 104 && var17 < 104) {
                class81.method693(class11.field320, -1, 0, var21, var19, -1, (byte) -123, var20, var16, var17);
            }
        } else if (class142.field3535 == 123) {
            int var22 = class89.field2235.method938(-128);
            int var23 = (var22 >> 4 & 0x7) + class84.field2149;
            int var24 = (var22 & 0x7) + class19.field531;
            int var25 = class89.field2235.method958((byte) -96);
            int var26 = class89.field2235.method944((byte) 118);
            if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104) {
                class24 var27 = new class24();
                var27.field687 = var26;
                var27.field692 = var25;
                if (class118.field3019[class11.field320][var23][var24] == null) {
                    class118.field3019[class11.field320][var23][var24] = new class61();
                }
                class118.field3019[class11.field320][var23][var24].method519(var27, 13017);
                class36.method285(var23, var24, true);
            }
        } else {
            if (class142.field3535 == 54) {
                int var28 = class89.field2235.method957((byte) 12);
                int var29 = (var28 >> 4 & 0x7) + class84.field2149;
                int var30 = (var28 & 0x7) + class19.field531;
                int var31 = class89.field2235.method944((byte) 113);
                int var32 = class89.field2235.method957((byte) 82);
                int var33 = var32 >> 4 & 0xF;
                int var34 = class89.field2235.method957((byte) 54);
                int var35 = var32 & 0x7;
                if (var29 >= 0 && var30 >= 0 && var29 < 104 && var30 < 104) {
                    int var36 = var33 + 1;
                    if (class73.field1901.field2304[0] >= var29 - var36 && class73.field1901.field2304[0] <= var29 + var36 && var30 - var36 <= class73.field1901.field2280[0] && class73.field1901.field2280[0] <= var30 + var36 && class99.field2492 != 0 && var35 > 0 && class62.field1635 < 50) {
                        class20.field572[class62.field1635] = var31;
                        class150.field3708[class62.field1635] = var35;
                        class38.field1032[class62.field1635] = var34;
                        class2.field154[class62.field1635] = null;
                        class42.field1123[class62.field1635] = (var30 << 8) + ((var29 << 16) + var33);
                        class62.field1635++;
                    }
                }
            }
            if (class142.field3535 == 199) {
                byte var37 = class89.field2235.method966((byte) 96);
                int var38 = class89.field2235.method934((byte) -9);
                int var39 = class89.field2235.method957((byte) 76);
                int var40 = var39 >> 2;
                int var41 = class49.field1301[var40];
                int var42 = var39 & 0x3;
                int var43 = class89.field2235.method934((byte) -9);
                byte var44 = class89.field2235.method961(-95);
                int var45 = class89.field2235.method934((byte) -9);
                int var46 = class89.field2235.method962(false);
                int var47 = (var46 >> 4 & 0x7) + class84.field2149;
                int var48 = (var46 & 0x7) + class19.field531;
                byte var49 = class89.field2235.method935(1489581447);
                byte var50 = class89.field2235.method935(1489581447);
                int var51 = class89.field2235.method929(31165);
                class118 var52;
                if (class78.field1997 == var51) {
                    var52 = class73.field1901;
                } else {
                    var52 = class42.field1141[var51];
                }
                if (var52 != null) {
                    class149 var53 = class122.method1045(31, var43);
                    int var54 = class55.field1484[class11.field320][var47 + 1][var48 + 1];
                    int var55 = class55.field1484[class11.field320][var47][var48];
                    int var56 = class55.field1484[class11.field320][var47 + 1][var48];
                    int var57 = class55.field1484[class11.field320][var47][var48 + 1];
                    class91 var58 = var53.method1186(var55, var57, var42, var56, var54, 12328, var40);
                    if (var58 != null) {
                        class81.method693(class11.field320, -1, var45 + 1, var41, 0, var38 + 1, (byte) -100, 0, var47, var48);
                        var52.field2998 = var58;
                        var52.field3022 = class49.field1308 + var38;
                        var52.field3023 = var45 + class49.field1308;
                        if (var50 > var44) {
                            byte var59 = var50;
                            var50 = var44;
                            var44 = var59;
                        }
                        if (var49 > var37) {
                            byte var60 = var49;
                            var49 = var37;
                            var37 = var60;
                        }
                        int var61 = var53.field3643;
                        int var62 = var53.field3660;
                        if (var42 == 1 || var42 == 3) {
                            var62 = var53.field3643;
                            var61 = var53.field3660;
                        }
                        var52.field2992 = var47 * 128 + var62 * 64;
                        var52.field3003 = var48 * 128 + var61 * 64;
                        var52.field3016 = class70.method585(class11.field320, var52.field2992, var52.field3003, (byte) 80);
                        var52.field2999 = var48 + var49;
                        var52.field2995 = var48 + var37;
                        var52.field3012 = var44 + var47;
                        var52.field3004 = var47 + var50;
                    }
                }
            }
            if (class142.field3535 == 136) {
                int var63 = class89.field2235.method959(128);
                int var64 = var63 & 0x3;
                int var65 = var63 >> 2;
                int var66 = class49.field1301[var65];
                int var67 = class89.field2235.method959(128);
                int var68 = (var67 >> 4 & 0x7) + class84.field2149;
                int var69 = (var67 & 0x7) + class19.field531;
                int var70 = class89.field2235.method929(31165);
                if (var68 >= 0 && var69 >= 0 && var68 < 103 && var69 < 103) {
                    int var71 = class55.field1484[class11.field320][var68][var69];
                    int var72 = class55.field1484[class11.field320][var68 + 1][var69];
                    int var73 = class55.field1484[class11.field320][var68 + 1][var69 + 1];
                    int var74 = class55.field1484[class11.field320][var68][var69 + 1];
                    if (var66 == 0) {
                        class103 var75 = class34.field923.method61(class11.field320, var68, var69);
                        if (var75 != null) {
                            int var76 = var75.field2562 >> 14 & 0x7FFF;
                            if (var65 == 2) {
                                var75.field2579 = new class53(var76, 2, var64 + 4, var71, var72, var73, var74, var70, false, var75.field2579);
                                var75.field2574 = new class53(var76, 2, var64 + 1 & 0x3, var71, var72, var73, var74, var70, false, var75.field2574);
                            } else {
                                var75.field2579 = new class53(var76, var65, var64, var71, var72, var73, var74, var70, false, var75.field2579);
                            }
                        }
                    }
                    if (var66 == 1) {
                        class16 var77 = class34.field923.method66(class11.field320, var68, var69);
                        if (var77 != null) {
                            var77.field486 = new class53(var77.field482 >> 14 & 0x7FFF, 4, 0, var71, var72, var73, var74, var70, false, var77.field486);
                        }
                    }
                    if (var66 == 2) {
                        if (var65 == 11) {
                            var65 = 10;
                        }
                        class39 var78 = class34.field923.method83(class11.field320, var68, var69);
                        if (var78 != null) {
                            var78.field1063 = new class53(var78.field1071 >> 14 & 0x7FFF, var65, var64, var71, var72, var73, var74, var70, false, var78.field1063);
                        }
                    }
                    if (var66 == 3) {
                        class26 var79 = class34.field923.method37(class11.field320, var68, var69);
                        if (var79 != null) {
                            var79.field767 = new class53(var79.field758 >> 14 & 0x7FFF, 22, var64, var71, var72, var73, var74, var70, false, var79.field767);
                        }
                    }
                }
            } else if (class142.field3535 == 147) {
                int var80 = class89.field2235.method957((byte) 82);
                int var81 = (var80 >> 4 & 0x7) + class84.field2149;
                int var82 = (var80 & 0x7) + class19.field531;
                int var83 = class89.field2235.method966((byte) 39) + var81;
                int var84 = class89.field2235.method966((byte) 122) + var82;
                int var85 = class89.field2235.method945(arg0);
                int var86 = class89.field2235.method944((byte) 109);
                int var87 = class89.field2235.method957((byte) 85) * 4;
                int var88 = class89.field2235.method957((byte) 79) * 4;
                int var89 = class89.field2235.method944((byte) 113);
                int var90 = class89.field2235.method944((byte) 115);
                int var91 = class89.field2235.method957((byte) 82);
                int var92 = class89.field2235.method957((byte) 37);
                if (var81 >= 0 && var82 >= 0 && var81 < 104 && var82 < 104 && var83 >= 0 && var84 >= 0 && var83 < 104 && var84 < 104 && var86 != 65535) {
                    int var93 = var82 * 128 + 64;
                    int var94 = var83 * 128 + 64;
                    int var95 = var84 * 128 + 64;
                    int var96 = var81 * 128 + 64;
                    class83 var97 = new class83(var86, class11.field320, var96, var93, class70.method585(class11.field320, var96, var93, (byte) -45) - var87, var89 - -class49.field1308, class49.field1308 + var90, var91, var92, var85, var88);
                    var97.method702(class49.field1308 + var89, var95, var94, class70.method585(class11.field320, var94, var95, (byte) -96) - var88, 67);
                    class92.field2371.method519(var97, 13017);
                }
            } else if (class142.field3535 == 114) {
                int var98 = class89.field2235.method934((byte) -9);
                int var99 = class89.field2235.method929(31165);
                int var100 = class89.field2235.method962(!arg0);
                int var101 = (var100 >> 4 & 0x7) + class84.field2149;
                int var102 = (var100 & 0x7) + class19.field531;
                int var103 = class89.field2235.method944((byte) 117);
                if (var101 >= 0 && var102 >= 0 && var101 < 104 && var102 < 104 && class78.field1997 != var99) {
                    class24 var104 = new class24();
                    var104.field692 = var103;
                    var104.field687 = var98;
                    if (class118.field3019[class11.field320][var101][var102] == null) {
                        class118.field3019[class11.field320][var101][var102] = new class61();
                    }
                    class118.field3019[class11.field320][var101][var102].method519(var104, 13017);
                    class36.method285(var101, var102, arg0);
                }
            } else if (class142.field3535 == 27) {
                int var105 = class89.field2235.method957((byte) 21);
                int var106 = class84.field2149 + (var105 >> 4 & 0x7);
                int var107 = (var105 & 0x7) + class19.field531;
                int var108 = class89.field2235.method944((byte) 123);
                int var109 = class89.field2235.method957((byte) 16);
                int var110 = class89.field2235.method944((byte) 110);
                if (var106 >= 0 && var107 >= 0 && var106 < 104 && var107 < 104) {
                    int var111 = var107 * 128 + 64;
                    int var112 = var106 * 128 + 64;
                    class20 var113 = new class20(var108, class11.field320, var112, var111, class70.method585(class11.field320, var112, var111, (byte) -118) - var109, var110, class49.field1308);
                    class58.field1538.method519(var113, 13017);
                }
            } else if (class142.field3535 == 57) {
                int var114 = class89.field2235.method957((byte) 96);
                int var115 = (var114 >> 4 & 0x7) + class84.field2149;
                int var116 = (var114 & 0x7) + class19.field531;
                int var117 = class89.field2235.method944((byte) 111);
                int var118 = class89.field2235.method944((byte) 121);
                int var119 = class89.field2235.method944((byte) 118);
                if (var115 >= 0 && var116 >= 0 && var115 < 104 && var116 < 104) {
                    class61 var120 = class118.field3019[class11.field320][var115][var116];
                    if (var120 != null) {
                        for (class24 var121 = (class24) var120.method514((byte) -79); var121 != null; var121 = (class24) var120.method517(-123)) {
                            if ((var117 & 0x7FFF) == var121.field692 && var121.field687 == var118) {
                                var121.field687 = var119;
                                break;
                            }
                        }
                        class36.method285(var115, var116, arg0);
                    }
                }
            } else if (!arg0) {
                field2571 = null;
            }
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ZB)V")
    public static final void method829(boolean arg0, byte arg1) {
        class92.field2376 = arg0;
        field2582++;
        if (class92.field2376) {
            int var15 = class89.field2235.method944((byte) 127);
            int var16 = class89.field2235.method959(128);
            int var17 = class89.field2235.method934((byte) -9);
            class89.field2235.method1205(8);
            for (int var18 = 0; var18 < 4; var18++) {
                for (int var35 = 0; var35 < 13; var35++) {
                    for (int var36 = 0; var36 < 13; var36++) {
                        int var37 = class89.field2235.method1211(1, 7);
                        if (var37 == 1) {
                            class32.field898[var18][var35][var36] = class89.field2235.method1211(26, 7);
                        } else {
                            class32.field898[var18][var35][var36] = -1;
                        }
                    }
                }
            }
            class89.field2235.method1210((byte) -127);
            int var19 = (class81.field2039 - class89.field2235.field2816) / 16;
            class36.field1007 = new int[var19][4];
            for (int var20 = 0; var20 < var19; var20++) {
                for (int var34 = 0; var34 < 4; var34++) {
                    class36.field1007[var20][var34] = class89.field2235.method946(0);
                }
            }
            int var21 = class89.field2235.method958((byte) -88);
            int var22 = class89.field2235.method929(31165);
            class2.field155 = new byte[var19][];
            class58.field1543 = new int[var19];
            class18.field520 = new int[var19];
            class38.field1044 = new byte[var19][];
            class133.field3328 = new int[var19];
            int var23 = 0;
            for (int var24 = 0; var24 < 4; var24++) {
                for (int var25 = 0; var25 < 13; var25++) {
                    for (int var26 = 0; var26 < 13; var26++) {
                        int var27 = class32.field898[var24][var25][var26];
                        if (var27 != -1) {
                            int var28 = var27 >> 14 & 0x3FF;
                            int var29 = var27 >> 3 & 0x7FF;
                            int var30 = (var28 / 8 << 8) + (var29 / 8);
                            for (int var31 = 0; var31 < var23; var31++) {
                                if (class58.field1543[var31] == var30) {
                                    var30 = -1;
                                    break;
                                }
                            }
                            if (var30 != -1) {
                                int var32 = var30 >> 8 & 0xFF;
                                class58.field1543[var23] = var30;
                                int var33 = var30 & 0xFF;
                                class133.field3328[var23] = class149.field3673.method905(class32.method258(-115, new class73[] { class39.field1073, class78.method676(var32, -38), class23.field667, class78.method676(var33, -83) }), (byte) -72);
                                class18.field520[var23] = class149.field3673.method905(class32.method258(-116, new class73[] { class81.field2036, class78.method676(var32, -111), class23.field667, class78.method676(var33, -95) }), (byte) -72);
                                var23++;
                            }
                        }
                    }
                }
            }
            class115.method984(var21, (byte) -113, var15, var22, var17, var16);
        } else {
            int var2 = class89.field2235.method957((byte) 87);
            int var3 = class89.field2235.method929(31165);
            int var4 = (class81.field2039 - class89.field2235.field2816) / 16;
            class36.field1007 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var14 = 0; var14 < 4; var14++) {
                    class36.field1007[var5][var14] = class89.field2235.method946(0);
                }
            }
            int var6 = class89.field2235.method944((byte) 116);
            int var7 = class89.field2235.method944((byte) 123);
            int var8 = class89.field2235.method929(31165);
            class2.field155 = new byte[var4][];
            class38.field1044 = new byte[var4][];
            class133.field3328 = new int[var4];
            class58.field1543 = new int[var4];
            class18.field520 = new int[var4];
            boolean var9 = false;
            if ((var7 / 8 == 48 || var7 / 8 == 49) && var6 / 8 == 48) {
                var9 = true;
            }
            int var10 = 0;
            if (var7 / 8 == 48 && var6 / 8 == 148) {
                var9 = true;
            }
            for (int var11 = (var7 - 6) / 8; var11 <= (var7 + 6) / 8; var11++) {
                for (int var12 = (var6 - 6) / 8; var12 <= (var6 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        class58.field1543[var10] = var13;
                        class133.field3328[var10] = class149.field3673.method905(class32.method258(-80, new class73[] { class39.field1073, class78.method676(var11, -3), class23.field667, class78.method676(var12, -5) }), (byte) -72);
                        class18.field520[var10] = class149.field3673.method905(class32.method258(-58, new class73[] { class81.field2036, class78.method676(var11, -5), class23.field667, class78.method676(var12, -10) }), (byte) -72);
                        var10++;
                    }
                }
            }
            class115.method984(var7, (byte) -94, var8, var6, var3, var2);
        }
        if (arg1 < 51) {
            field2570 = -99;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIIIII)Z")
    public static final boolean method830(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2578++;
        if (!class80.method690(arg4, -1)) {
            return false;
        }
        class54.field1446 = null;
        if (arg0 != 23578) {
            field2568 = -104;
        }
        boolean var7 = class47.method374(0, arg2, arg3, arg1, 0, -1, arg6, -15113, class120.field3066[arg4], arg5);
        if (class54.field1446 != null) {
            class47.method374(class84.field2150, arg2, arg3, arg1, class120.field3067, -1412584499, arg6, -15113, class54.field1446, arg5);
        }
        return var7;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V")
    public static void method831(int arg0) {
        field2565 = null;
        field2573 = null;
        field2569 = null;
        if (arg0 <= -53) {
            field2571 = null;
        }
    }
}
