import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class245 {

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "Lsg;")
    public static class30 field4375 = class167.method1221((byte) 33, "lila:");

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "Lsg;")
    private static class30 field4373 = class167.method1221((byte) 33, "RuneScape is loading )2 please wait)3)3)3");

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "[I")
    public static int[] field4372 = new int[256];

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "I")
    public static int field4376 = 0;

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "Lsg;")
    public static class30 field4378 = field4373;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "I")
    public static int field4374 = 0;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
    public static int field4371;

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "I")
    public static int field4377;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)V")
    public static final void method1723(byte arg0) {
        int var1 = 0 % ((arg0 + 10) / 57);
        field4371++;
        if (class70.field1586 == 153) {
            int var2 = class59.field1289.method81(-1239235384);
            int var3 = class59.field1289.method81(-1239235384);
            int var4 = class59.field1289.method63((byte) 97);
            int var5 = (var4 >> 4 & 0x7) + class115.field2277;
            int var6 = (var4 & 0x7) + class220.field3972;
            int var7 = class59.field1289.method65((byte) 123);
            if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104 && class249.field4405 != var3) {
                class3 var8 = new class3();
                var8.field49 = var7;
                var8.field50 = var2;
                if (class103.field2078[class159.field2998][var5][var6] == null) {
                    class103.field2078[class159.field2998][var5][var6] = new class48();
                }
                class103.field2078[class159.field2998][var5][var6].method477(new class97(var8), (byte) 6);
                class132.method1001(5640, var5, var6);
            }
        } else if (class70.field1586 == 18) {
            int var9 = class59.field1289.method63((byte) 86);
            int var10 = ((var9 & 0x7B) >> 4) + class115.field2277;
            int var11 = class220.field3972 + (var9 & 0x7);
            int var12 = class59.field1289.method65((byte) 122);
            int var13 = class59.field1289.method65((byte) 127);
            int var14 = class59.field1289.method65((byte) 111);
            if (var10 >= 0 && var11 >= 0 && var10 < 104 && var11 < 104) {
                class48 var15 = class103.field2078[class159.field2998][var10][var11];
                if (var15 != null) {
                    for (class97 var16 = (class97) var15.method478(0); var16 != null; var16 = (class97) var15.method476((byte) 13)) {
                        class3 var17 = var16.field1972;
                        if ((var12 & 0x7FFF) == var17.field49 && var17.field50 == var13) {
                            var17.field50 = var14;
                            break;
                        }
                    }
                    class132.method1001(5640, var10, var11);
                }
            }
        } else if (class70.field1586 == 74) {
            int var18 = class59.field1289.method92(125);
            if (var18 == 65535) {
                var18 = -1;
            }
            int var19 = class59.field1289.method54(100);
            int var20 = var19 >> 2;
            int var21 = var19 & 0x3;
            int var22 = class132.field2609[var20];
            int var23 = class59.field1289.method54(102);
            int var24 = class115.field2277 + (var23 >> 4 & 0x7);
            int var25 = (var23 & 0x7) + class220.field3972;
            class37.method352(class159.field2998, var22, var20, var24, var25, var21, (byte) 79, var18);
        } else {
            if (class70.field1586 == 50) {
                int var26 = class59.field1289.method65((byte) 115);
                int var27 = class59.field1289.method65((byte) 122);
                int var28 = class59.field1289.method92(109);
                byte var29 = class59.field1289.method50(false);
                byte var30 = class59.field1289.method98(1);
                int var31 = class59.field1289.method81(-1239235384);
                byte var32 = class59.field1289.method50(false);
                int var33 = class59.field1289.method77((byte) 118);
                int var34 = var33 >> 2;
                int var35 = class132.field2609[var34];
                int var36 = class59.field1289.method54(97);
                int var37 = (var36 >> 4 & 0x7) + class115.field2277;
                int var38 = (var36 & 0x7) + class220.field3972;
                int var39 = var33 & 0x3;
                byte var40 = class59.field1289.method98(1);
                class120 var41;
                if (class249.field4405 == var26) {
                    var41 = class247.field4394;
                } else {
                    var41 = class75.field1670[var26];
                }
                if (var41 != null) {
                    class40 var42 = class195.method1415(47, var27);
                    int var43;
                    int var44;
                    if (var39 == 1 || var39 == 3) {
                        var44 = var42.field955;
                        var43 = var42.field937;
                    } else {
                        var43 = var42.field955;
                        var44 = var42.field937;
                    }
                    int var45 = (var43 + 1 >> 1) + var38;
                    int var46 = (var44 + 1 >> 1) + var37;
                    int var47 = var37 + (var44 >> 1);
                    int var48 = var38 + (var43 >> 1);
                    int var49 = (var38 << 7) + (var43 << 6);
                    int[][] var50 = null;
                    int[][] var51 = class242.field4333[class159.field2998];
                    if (class159.field2998 < 3) {
                        var50 = class242.field4333[class159.field2998 + 1];
                    }
                    int var52 = (var37 << 7) + (var44 << 6);
                    int var53 = var51[var46][var48] + var51[var47][var48] + var51[var47][var45] + var51[var46][var45] >> 2;
                    class73 var54 = var42.method409(var53, false, var34, var49, (class192) null, var39, var51, var50, -87, var42.field996, var52);
                    if (var54 != null) {
                        if (var30 < var40) {
                            byte var55 = var40;
                            var40 = var30;
                            var30 = var55;
                        }
                        class49.method483(var31 + 1, var28 + 1, 0, var37, 0, class159.field2998, 531531408, var35, -1, var38);
                        if (var32 > var29) {
                            byte var56 = var32;
                            var32 = var29;
                            var29 = var56;
                        }
                        var41.field2367 = var28 + class133.field2617;
                        var41.field2360 = var53;
                        var41.field2361 = class133.field2617 + var31;
                        var41.field2337 = var38 + var29;
                        var41.field2350 = var37 * 128 + var44 * 64;
                        var41.field2371 = var32 + var38;
                        var41.field2362 = var37 + var40;
                        var41.field2374 = var37 + var30;
                        var41.field2372 = var38 * 128 + var43 * 64;
                        var41.field2339 = (class217) var54.field1649;
                    }
                }
            }
            if (class70.field1586 == 183) {
                int var57 = class59.field1289.method63((byte) 127);
                int var58 = ((var57 & 0x75) >> 4) + class115.field2277;
                int var59 = (var57 & 0x7) + class220.field3972;
                int var60 = class59.field1289.method65((byte) 120);
                int var61 = class59.field1289.method63((byte) 80);
                int var62 = class59.field1289.method65((byte) 107);
                if (var58 >= 0 && var59 >= 0 && var58 < 104 && var59 < 104) {
                    int var63 = var58 * 128 + 64;
                    int var64 = var59 * 128 + 64;
                    class186 var65 = new class186(var60, class159.field2998, var63, var64, class31.method303(var63, var64, class159.field2998, -4) - var61, var62, class133.field2617);
                    class238.field4237.method477(new class123(var65), (byte) 6);
                }
            } else if (class70.field1586 == 214) {
                int var66 = class59.field1289.method63((byte) 117);
                int var67 = (var66 >> 4 & 0x7) + class115.field2277;
                int var68 = (var66 & 0x7) + class220.field3972;
                int var69 = class59.field1289.method98(1) + var67;
                int var70 = class59.field1289.method98(1) + var68;
                int var71 = class59.field1289.method74(121);
                int var72 = class59.field1289.method65((byte) 113);
                int var73 = class59.field1289.method63((byte) 99) * 4;
                int var74 = class59.field1289.method63((byte) 47) * 4;
                int var75 = class59.field1289.method65((byte) 112);
                int var76 = class59.field1289.method65((byte) 121);
                int var77 = class59.field1289.method63((byte) 65);
                int var78 = class59.field1289.method63((byte) 74);
                if (var67 >= 0 && var68 >= 0 && var67 < 104 && var68 < 104 && var69 >= 0 && var70 >= 0 && var69 < 104 && var70 < 104 && var72 != 65535) {
                    int var79 = var69 * 128 + 64;
                    int var80 = var70 * 128 + 64;
                    int var81 = var67 * 128 + 64;
                    int var82 = var68 * 128 + 64;
                    class107 var83 = new class107(var72, class159.field2998, var81, var82, class31.method303(var81, var82, class159.field2998, -4) - var73, class133.field2617 + var75, class133.field2617 + var76, var77, var78, var71, var74);
                    var83.method846(var80, var75 + class133.field2617, class31.method303(var79, var80, class159.field2998, -4) + -var74, (byte) -127, var79);
                    class77.field1681.method477(new class201(var83), (byte) 6);
                }
            } else if (class70.field1586 == 39) {
                int var84 = class59.field1289.method92(103);
                int var85 = class59.field1289.method92(110);
                int var86 = class59.field1289.method69(5002);
                int var87 = ((var86 & 0x7E) >> 4) + class115.field2277;
                int var88 = (var86 & 0x7) + class220.field3972;
                if (var87 >= 0 && var88 >= 0 && var87 < 104 && var88 < 104) {
                    class3 var89 = new class3();
                    var89.field50 = var85;
                    var89.field49 = var84;
                    if (class103.field2078[class159.field2998][var87][var88] == null) {
                        class103.field2078[class159.field2998][var87][var88] = new class48();
                    }
                    class103.field2078[class159.field2998][var87][var88].method477(new class97(var89), (byte) 6);
                    class132.method1001(5640, var87, var88);
                }
            } else if (class70.field1586 == 241) {
                int var90 = class59.field1289.method63((byte) 60);
                int var91 = class115.field2277 + ((var90 & 0x7C) >> 4);
                int var92 = class220.field3972 + (var90 & 0x7);
                int var93 = class59.field1289.method65((byte) 121);
                if (var93 == 65535) {
                    var93 = -1;
                }
                int var94 = class59.field1289.method63((byte) 57);
                int var95 = var94 & 0x7;
                int var96 = class59.field1289.method63((byte) 58);
                int var97 = (var94 & 0xF4) >> 4;
                if (var91 >= 0 && var92 >= 0 && var91 < 104 && var92 < 104) {
                    int var98 = var97 + 1;
                    if (class247.field4394.field1349[0] >= (var91 - var98) && (var91 + var98) >= class247.field4394.field1349[0] && (var92 - var98) <= class247.field4394.field1372[0] && class247.field4394.field1372[0] <= (var92 + var98) && class169.field3185 != 0 && var95 > 0 && class233.field4153 < 50 && var93 != -1) {
                        class277.field4826[class233.field4153] = var93;
                        class25.field483[class233.field4153] = var95;
                        class272.field4765[class233.field4153] = var96;
                        class193.field3494[class233.field4153] = null;
                        class22.field419[class233.field4153] = (var92 << 8) + ((var91 << 16) + var97);
                        class233.field4153++;
                    }
                }
            } else if (class70.field1586 == 107) {
                int var99 = class59.field1289.method63((byte) 84);
                int var100 = ((var99 & 0xF0) >> 4) + class115.field2277 * 2;
                int var101 = (var99 & 0xF) + class220.field3972 * 2;
                int var102 = var100 + class59.field1289.method98(1);
                int var103 = var101 + class59.field1289.method98(1);
                int var104 = class59.field1289.method74(111);
                int var105 = class59.field1289.method65((byte) 126);
                int var106 = class59.field1289.method63((byte) 58) * 4;
                int var107 = class59.field1289.method63((byte) 57) * 4;
                int var108 = class59.field1289.method65((byte) 110);
                int var109 = class59.field1289.method65((byte) 118);
                int var110 = class59.field1289.method63((byte) 116);
                int var111 = class59.field1289.method63((byte) 104);
                if (var100 >= 0 && var101 >= 0 && var100 < 208 && var101 < 208 && var102 >= 0 && var103 >= 0 && var102 < 208 && var103 < 208 && var105 != 65535) {
                    int var112 = var100 * 64;
                    int var113 = var103 * 64;
                    int var114 = var101 * 64;
                    class107 var115 = new class107(var105, class159.field2998, var112, var114, class31.method303(var112, var114, class159.field2998, -4) - var106, var108 - -class133.field2617, class133.field2617 + var109, var110, var111, var104, var107);
                    int var116 = var102 * 64;
                    var115.method846(var113, class133.field2617 + var108, -var107 + class31.method303(var116, var113, class159.field2998, -4), (byte) -127, var116);
                    class77.field1681.method477(new class201(var115), (byte) 6);
                }
            } else if (class70.field1586 == 134) {
                int var117 = class59.field1289.method65((byte) 115);
                int var118 = class59.field1289.method77((byte) -7);
                int var119 = (var118 >> 4 & 0x7) + class115.field2277;
                int var120 = (var118 & 0x7) + class220.field3972;
                if (var119 >= 0 && var120 >= 0 && var119 < 104 && var120 < 104) {
                    class48 var121 = class103.field2078[class159.field2998][var119][var120];
                    if (var121 != null) {
                        for (class97 var122 = (class97) var121.method478(0); var122 != null; var122 = (class97) var121.method476((byte) 13)) {
                            if ((var117 & 0x7FFF) == var122.field1972.field49) {
                                var122.method1681(false);
                                break;
                            }
                        }
                        if (var121.method478(0) == null) {
                            class103.field2078[class159.field2998][var119][var120] = null;
                        }
                        class132.method1001(5640, var119, var120);
                    }
                }
            } else if (class70.field1586 == 85) {
                int var123 = class59.field1289.method63((byte) 112);
                int var124 = var123 & 0x3;
                int var125 = var123 >> 2;
                int var126 = class132.field2609[var125];
                int var127 = class59.field1289.method77((byte) 107);
                int var128 = class115.field2277 + ((var127 & 0x72) >> 4);
                int var129 = (var127 & 0x7) + class220.field3972;
                if (var128 >= 0 && var129 >= 0 && var128 < 104 && var129 < 104) {
                    class49.method483(-1, 0, var124, var128, var125, class159.field2998, 531531408, var126, -1, var129);
                }
            } else if (class70.field1586 == 81) {
                int var130 = class59.field1289.method77((byte) -77);
                int var131 = var130 >> 2;
                int var132 = var130 & 0x3;
                int var133 = class132.field2609[var131];
                int var134 = class59.field1289.method79(true);
                int var135 = class59.field1289.method69(5002);
                int var136 = class115.field2277 + ((var135 & 0x73) >> 4);
                int var137 = class220.field3972 + (var135 & 0x7);
                if (var136 >= 0 && var137 >= 0 && var136 < 104 && var137 < 104) {
                    class49.method483(-1, 0, var132, var136, var131, class159.field2998, 531531408, var133, var134, var137);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)Lof;")
    public static final class197 method1724(int arg0) {
        if (arg0 != 26440) {
            method1723((byte) 65);
        }
        field4377++;
        try {
            return (class197) Class.forName("uf").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(I)V")
    public static void method1725(int arg0) {
        field4378 = null;
        field4372 = null;
        if (arg0 == -209) {
            field4375 = null;
            field4373 = null;
        }
    }
}
