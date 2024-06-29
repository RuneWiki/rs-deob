import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class137 extends class12 {

    @OriginalMember(owner = "client!ac", name = "A", descriptor = "[Lhg;")
    public class146[] field2506 = new class146[5];

    @OriginalMember(owner = "client!ac", name = "I", descriptor = "[I")
    public int[] field2514 = new int[5];

    @OriginalMember(owner = "client!ac", name = "O", descriptor = "I")
    public int field2520 = 0;

    @OriginalMember(owner = "client!ac", name = "N", descriptor = "I")
    public int field2519;

    @OriginalMember(owner = "client!ac", name = "D", descriptor = "I")
    public int field2509;

    @OriginalMember(owner = "client!ac", name = "y", descriptor = "I")
    public int field2504;

    @OriginalMember(owner = "client!ac", name = "s", descriptor = "I")
    public int field2498;

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "Lvf;")
    public static class265 field2495 = class87.method582(-46, "leuchten3:");

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "I")
    public static int field2494 = 0;

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "I")
    public static int field2496;

    @OriginalMember(owner = "client!ac", name = "t", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!ac", name = "w", descriptor = "I")
    public int field2502;

    @OriginalMember(owner = "client!ac", name = "C", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!ac", name = "H", descriptor = "I")
    public int field2513;

    @OriginalMember(owner = "client!ac", name = "J", descriptor = "I")
    public int field2515;

    @OriginalMember(owner = "client!ac", name = "K", descriptor = "I")
    public int field2516;

    @OriginalMember(owner = "client!ac", name = "P", descriptor = "I")
    public int field2521;

    @OriginalMember(owner = "client!ac", name = "G", descriptor = "Lac;")
    public class137 field2512;

    @OriginalMember(owner = "client!ac", name = "M", descriptor = "Lvk;")
    public class144 field2518;

    @OriginalMember(owner = "client!ac", name = "u", descriptor = "Lfl;")
    public static class192 field2500;

    @OriginalMember(owner = "client!ac", name = "E", descriptor = "Lne;")
    public class200 field2510;

    @OriginalMember(owner = "client!ac", name = "F", descriptor = "Ldd;")
    public class212 field2511;

    @OriginalMember(owner = "client!ac", name = "r", descriptor = "Lgd;")
    public class266 field2497;

    @OriginalMember(owner = "client!ac", name = "z", descriptor = "Lal;")
    public class278 field2505;

    @OriginalMember(owner = "client!ac", name = "v", descriptor = "Laa;")
    public class8 field2501;

    @OriginalMember(owner = "client!ac", name = "x", descriptor = "Z")
    public boolean field2503;

    @OriginalMember(owner = "client!ac", name = "B", descriptor = "Z")
    public boolean field2507;

    @OriginalMember(owner = "client!ac", name = "L", descriptor = "Z")
    public boolean field2517;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "(I)V")
    public static final void method951(int arg0) {
        field2499++;
        if (class93.field1650 == 253) {
            int var1 = class207.field3730.method925(-3);
            int var2 = (var1 >> 4 & 0x7) + class181.field3218;
            int var3 = (var1 & 0x7) + class279.field4927;
            int var4 = class207.field3730.method914(0);
            int var5 = var4 >> 2;
            int var6 = class49.field1048[var5];
            int var7 = class207.field3730.method901((byte) -128);
            int var8 = var4 & 0x3;
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                class202.method1388(var6, var3, var7, var5, -1, 0, 255, var8, var2, class216.field3902);
            }
        } else if (class93.field1650 == 76) {
            int var9 = class207.field3730.method910(false);
            int var10 = class207.field3730.method925(-3);
            int var11 = (var10 & 0x7) + class279.field4927;
            int var12 = (var10 >> 4 & 0x7) + class181.field3218;
            int var13 = class207.field3730.method910(false);
            if (var12 >= 0 && var11 >= 0 && var12 < 104 && var11 < 104) {
                class42 var14 = new class42();
                var14.field939 = var9;
                var14.field936 = var13;
                if (class210.field3768[class216.field3902][var12][var11] == null) {
                    class210.field3768[class216.field3902][var12][var11] = new class117();
                }
                class210.field3768[class216.field3902][var12][var11].method785(new class139(var14), -29);
                class131.method876(var11, 1, var12);
            }
        } else if (class93.field1650 == 94) {
            int var15 = class207.field3730.method920((byte) 127);
            int var16 = ((var15 & 0x72) >> 4) + class181.field3218;
            int var17 = class279.field4927 + (var15 & 0x7);
            int var18 = class207.field3730.method929((byte) -3) + var16;
            int var19 = var17 + class207.field3730.method929((byte) -3);
            int var20 = class207.field3730.method894(-100);
            int var21 = class207.field3730.method927(125);
            int var22 = class207.field3730.method920((byte) 79) * 4;
            int var23 = class207.field3730.method920((byte) 77) * 4;
            int var24 = class207.field3730.method927(126);
            int var25 = class207.field3730.method927(127);
            int var26 = class207.field3730.method920((byte) 47);
            int var27 = class207.field3730.method920((byte) 90);
            if (var16 >= 0 && var17 >= 0 && var16 < 104 && var17 < 104 && var18 >= 0 && var19 >= 0 && var18 < 104 && var19 < 104 && var21 != 65535) {
                int var28 = var19 * 128 + 64;
                int var29 = var16 * 128 + 64;
                int var30 = var18 * 128 + 64;
                int var31 = var17 * 128 + 64;
                class205 var32 = new class205(var21, class216.field3902, var29, var31, class67.method483(var31, -127, var29, class216.field3902) - var22, class93.field1655 + var24, var25 + class93.field1655, var26, var27, var20, var23);
                var32.method1406(class67.method483(var28, -119, var30, class216.field3902) - var23, class93.field1655 + var24, var28, -111, var30);
                class204.field3650.method785(new class106(var32), -29);
            }
        } else if (class93.field1650 == 97) {
            int var33 = class207.field3730.method910(false);
            int var34 = class207.field3730.method920((byte) 53);
            int var35 = class181.field3218 + (var34 >> 4 & 0x7);
            int var36 = (var34 & 0x7) + class279.field4927;
            if (var35 >= 0 && var36 >= 0 && var35 < 104 && var36 < 104) {
                class117 var37 = class210.field3768[class216.field3902][var35][var36];
                if (var37 != null) {
                    for (class139 var38 = (class139) var37.method789((byte) -77); var38 != null; var38 = (class139) var37.method787((byte) -76)) {
                        if ((var33 & 0x7FFF) == var38.field2532.field939) {
                            var38.method97(158);
                            break;
                        }
                    }
                    if (var37.method789((byte) -56) == null) {
                        class210.field3768[class216.field3902][var35][var36] = null;
                    }
                    class131.method876(var36, 1, var35);
                }
            }
        } else if (class93.field1650 == 59) {
            int var39 = class207.field3730.method920((byte) 56);
            int var40 = (var39 & 0x7) + class279.field4927;
            int var41 = ((var39 & 0x7F) >> 4) + class181.field3218;
            int var42 = class207.field3730.method927(125);
            int var43 = class207.field3730.method920((byte) 90);
            int var44 = class207.field3730.method927(125);
            if (var41 >= 0 && var40 >= 0 && var41 < 104 && var40 < 104) {
                int var45 = var40 * 128 + 64;
                int var46 = var41 * 128 + 64;
                class198 var47 = new class198(var42, class216.field3902, var46, var45, class67.method483(var45, -119, var46, class216.field3902) - var43, var44, class93.field1655);
                class6.field99.method785(new class260(var47), -29);
            }
        } else if (class93.field1650 == 145) {
            int var48 = class207.field3730.method920((byte) 109);
            int var49 = ((var48 & 0x7D) >> 4) + class181.field3218;
            int var50 = class279.field4927 + (var48 & 0x7);
            int var51 = class207.field3730.method927(125);
            if (var51 == 65535) {
                var51 = -1;
            }
            int var52 = class207.field3730.method920((byte) 105);
            int var53 = (var52 & 0xF1) >> 4;
            int var54 = var52 & 0x7;
            int var55 = class207.field3730.method920((byte) 82);
            if (var49 >= 0 && var50 >= 0 && var49 < 104 && var50 < 104) {
                int var56 = var53 + 1;
                if (class214.field3827.field2536[0] >= var49 - var56 && class214.field3827.field2536[0] <= (var49 + var56) && class214.field3827.field2575[0] >= var50 - var56 && class214.field3827.field2575[0] <= (var50 + var56) && class172.field3095 != 0 && var54 > 0 && class87.field1588 < 50 && var51 != -1) {
                    class249.field4316[class87.field1588] = var51;
                    class193.field3473[class87.field1588] = var54;
                    class4.field65[class87.field1588] = var55;
                    class262.field4580[class87.field1588] = null;
                    class210.field3775[class87.field1588] = (var49 << 16) + ((var50 << 8) + var53);
                    class87.field1588++;
                }
            }
        } else if (class93.field1650 == 131) {
            int var57 = class207.field3730.method901((byte) -128);
            int var58 = class207.field3730.method900(111);
            int var59 = class207.field3730.method914(0);
            int var60 = (var59 >> 4 & 0x7) + class181.field3218;
            int var61 = (var59 & 0x7) + class279.field4927;
            int var62 = class207.field3730.method927(126);
            if (var60 >= 0 && var61 >= 0 && var60 < 104 && var61 < 104 && class45.field1012 != var57) {
                class42 var63 = new class42();
                var63.field936 = var62;
                var63.field939 = var58;
                if (class210.field3768[class216.field3902][var60][var61] == null) {
                    class210.field3768[class216.field3902][var60][var61] = new class117();
                }
                class210.field3768[class216.field3902][var60][var61].method785(new class139(var63), -29);
                class131.method876(var61, 1, var60);
            }
        } else if (class93.field1650 == 111) {
            int var64 = class207.field3730.method893(false);
            int var65 = var64 >> 2;
            int var66 = var64 & 0x3;
            int var67 = class49.field1048[var65];
            int var68 = class207.field3730.method920((byte) 55);
            int var69 = (var68 >> 4 & 0x7) + class181.field3218;
            int var70 = (var68 & 0x7) + class279.field4927;
            if (var69 >= 0 && var70 >= 0 && var69 < 104 && var70 < 104) {
                class202.method1388(var67, var70, -1, var65, -1, 0, 255, var66, var69, class216.field3902);
            }
        } else if (class93.field1650 == 31) {
            int var71 = class207.field3730.method920((byte) 123);
            int var72 = (var71 & 0xF) + class279.field4927 * 2;
            int var73 = class181.field3218 * 2 + ((var71 & 0xF7) >> 4);
            int var74 = var73 + class207.field3730.method929((byte) -3);
            int var75 = var72 + class207.field3730.method929((byte) -3);
            int var76 = class207.field3730.method894(-123);
            int var77 = class207.field3730.method927(126);
            int var78 = class207.field3730.method920((byte) 75) * 4;
            int var79 = class207.field3730.method920((byte) 26) * 4;
            int var80 = class207.field3730.method927(125);
            int var81 = class207.field3730.method927(125);
            int var82 = class207.field3730.method920((byte) 74);
            int var83 = class207.field3730.method920((byte) 43);
            if (var73 >= 0 && var72 >= 0 && var73 < 208 && var72 < 208 && var74 >= 0 && var75 >= 0 && var74 < 208 && var75 < 208 && var77 != 65535) {
                int var84 = var72 * 64;
                int var85 = var73 * 64;
                int var86 = var75 * 64;
                int var87 = var74 * 64;
                class205 var88 = new class205(var77, class216.field3902, var85, var84, class67.method483(var84, -119, var85, class216.field3902) - var78, var80 - -class93.field1655, class93.field1655 + var81, var82, var83, var76, var79);
                var88.method1406(class67.method483(var86, -117, var87, class216.field3902) - var79, var80 - -class93.field1655, var86, 46, var87);
                class204.field3650.method785(new class106(var88), -29);
            }
        } else {
            if (class93.field1650 == 84) {
                int var89 = class207.field3730.method927(125);
                int var90 = class207.field3730.method920((byte) 23);
                int var91 = var90 & 0x3;
                int var92 = var90 >> 2;
                int var93 = class49.field1048[var92];
                byte var94 = class207.field3730.method908(-110);
                byte var95 = class207.field3730.method924((byte) 96);
                int var96 = class207.field3730.method900(94);
                int var97 = class207.field3730.method920((byte) 26);
                int var98 = (var97 & 0x7) + class279.field4927;
                int var99 = class181.field3218 + ((var97 & 0x75) >> 4);
                byte var100 = class207.field3730.method913(-128);
                int var101 = class207.field3730.method900(122);
                byte var102 = class207.field3730.method924((byte) 125);
                int var103 = class207.field3730.method910(false);
                class122 var104;
                if (class45.field1012 == var89) {
                    var104 = class214.field3827;
                } else {
                    var104 = class209.field3766[var89];
                }
                if (var104 != null) {
                    class130 var105 = class84.method574(-123, var103);
                    int var106;
                    int var107;
                    if (var91 == 1 || var91 == 3) {
                        var107 = var105.field2328;
                        var106 = var105.field2309;
                    } else {
                        var106 = var105.field2328;
                        var107 = var105.field2309;
                    }
                    int var108 = (var107 >> 1) + var99;
                    int var109 = var98 + (var106 + 1 >> 1);
                    int[][] var110 = class279.field4936[class216.field3902];
                    int[][] var111 = null;
                    if (class216.field3902 < 3) {
                        var111 = class279.field4936[class216.field3902 + 1];
                    }
                    int var112 = var98 + (var106 >> 1);
                    int var113 = (var99 << 7) + (var107 << 6);
                    int var114 = (var107 + 1 >> 1) + var99;
                    int var115 = var110[var108][var112] + var110[var114][var109] - (-var110[var114][var112] - var110[var108][var109]) >> 2;
                    int var116 = (var98 << 7) + (var106 << 6);
                    class52 var117 = var105.method850(-22501, var110, var116, var91, var113, var92, var111, false, var105.field2323, (class34) null, var115);
                    if (var117 != null) {
                        if (var100 < var95) {
                            byte var118 = var95;
                            var95 = var100;
                            var100 = var118;
                        }
                        if (var102 < var94) {
                            byte var119 = var94;
                            var94 = var102;
                            var102 = var119;
                        }
                        class202.method1388(var93, var98, -1, 0, var101 + 1, var96 + 1, 255, 0, var99, class216.field3902);
                        var104.field2176 = var98 + var102;
                        var104.field2200 = var99 + var95;
                        var104.field2159 = var98 * 128 + var106 * 64;
                        var104.field2179 = var99 + var100;
                        var104.field2191 = var115;
                        var104.field2192 = class93.field1655 + var96;
                        var104.field2168 = var94 + var98;
                        var104.field2164 = var99 * 128 + (var107 * 64);
                        var104.field2178 = (class235) var117.field1084;
                        var104.field2172 = class93.field1655 + var101;
                    }
                }
            }
            if (class93.field1650 == 136) {
                int var120 = class207.field3730.method920((byte) 56);
                int var121 = ((var120 & 0x76) >> 4) + class181.field3218;
                int var122 = class279.field4927 + (var120 & 0x7);
                int var123 = class207.field3730.method927(125);
                int var124 = class207.field3730.method927(127);
                int var125 = class207.field3730.method927(126);
                if (var121 >= 0 && var122 >= 0 && var121 < 104 && var122 < 104) {
                    class117 var126 = class210.field3768[class216.field3902][var121][var122];
                    if (var126 != null) {
                        for (class139 var127 = (class139) var126.method789((byte) -92); var127 != null; var127 = (class139) var126.method787((byte) -76)) {
                            class42 var128 = var127.field2532;
                            if ((var123 & 0x7FFF) == var128.field939 && var128.field936 == var124) {
                                var128.field936 = var125;
                                break;
                            }
                        }
                        class131.method876(var122, 1, var121);
                    }
                }
            } else if (class93.field1650 == 139) {
                int var129 = class207.field3730.method893(false);
                int var130 = (var129 & 0x7) + class279.field4927;
                int var131 = (var129 >> 4 & 0x7) + class181.field3218;
                int var132 = class207.field3730.method901((byte) -127);
                int var133 = class207.field3730.method914(0);
                if (var132 == 65535) {
                    var132 = -1;
                }
                int var134 = var133 >> 2;
                int var135 = var133 & 0x3;
                int var136 = class49.field1048[var134];
                class153.method1046(var130, var134, var132, class216.field3902, var131, var136, 83, var135);
            } else if (arg0 <= 11) {
                method954(38);
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IBI)I")
    public static final int method952(int arg0, byte arg1, int arg2) {
        field2496++;
        if (arg0 == -1) {
            return 12345678;
        }
        int var3 = (arg0 & 0x7F) * arg2 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        if (arg1 < 8) {
            method954(5);
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(III)V")
    public class137(int arg0, int arg1, int arg2) {
        this.field2509 = this.field2519 = arg0;
        this.field2504 = arg1;
        this.field2498 = arg2;
    }

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "(I)V")
    public static final void method953(int arg0) {
        field2508++;
        for (int var1 = arg0; var1 < class19.field520; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class93.field1652[var1];
            }
            class122 var3 = class209.field3766[var2];
            if (var3 != null) {
                class244.method1625(var3, -11777, var3.method822(2));
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "(I)V")
    public static void method954(int arg0) {
        field2500 = null;
        field2495 = null;
        if (arg0 >= -113) {
            method952(-111, (byte) 91, -18);
        }
    }
}
