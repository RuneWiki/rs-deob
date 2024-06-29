import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class3 extends class64 {

    @OriginalMember(owner = "client!qd", name = "r", descriptor = "Lid;")
    private static class149 field38 = class60.method382("Loading )2 please wait)3", (byte) 67);

    @OriginalMember(owner = "client!qd", name = "s", descriptor = "Lid;")
    public static class149 field39 = field38;

    @OriginalMember(owner = "client!qd", name = "u", descriptor = "Z")
    public static volatile boolean field41 = true;

    @OriginalMember(owner = "client!qd", name = "x", descriptor = "I")
    public static int field44 = 1;

    @OriginalMember(owner = "client!qd", name = "t", descriptor = "[[I")
    public static int[][] field40 = new int[104][104];

    @OriginalMember(owner = "client!qd", name = "q", descriptor = "I")
    public int field37;

    @OriginalMember(owner = "client!qd", name = "v", descriptor = "I")
    public int field42;

    @OriginalMember(owner = "client!qd", name = "w", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!qd", name = "y", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!qd", name = "z", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
    public static final void method14(int arg0) {
        field43++;
        if (class246.field4327 == 16) {
            int var1 = class11.field150.method489((byte) 92);
            int var2 = class140.field2579 + (var1 >> 4 & 0x7);
            int var3 = class30.field444 + (var1 & 0x7);
            int var4 = class11.field150.method514((byte) 1) + var2;
            int var5 = var3 + class11.field150.method514((byte) 1);
            int var6 = class11.field150.method526((byte) 122);
            int var7 = class11.field150.method485(arg0 - 2450);
            int var8 = class11.field150.method489((byte) -112) * 4;
            int var9 = class11.field150.method489((byte) -100) * 4;
            int var10 = class11.field150.method485(-2386);
            int var11 = class11.field150.method485(arg0 ^ 0xFFFFF6EE);
            int var12 = class11.field150.method489((byte) -99);
            if (var12 == 255) {
                var12 = -1;
            }
            int var13 = class11.field150.method489((byte) -42);
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104 && var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104 && var7 != 65535) {
                int var14 = var5 * 128 + 64;
                int var15 = var3 * 128 + 64;
                int var16 = var4 * 128 + 64;
                int var17 = var2 * 128 + 64;
                class39 var18 = new class39(var7, class277.field4948, var17, var15, class287.method1968(class277.field4948, var17, var15, (byte) -25) - var8, class118.field2022 + var10, class118.field2022 + var11, var12, var13, var6, var9);
                var18.method231((byte) -84, var16, class287.method1968(class277.field4948, var16, var14, (byte) 120) - var9, var14, var10 + class118.field2022);
                class166.field3083.method1131(new class107(var18), false);
            }
        } else if (class246.field4327 == 121) {
            int var19 = class11.field150.method489((byte) -33);
            int var20 = class140.field2579 * 2 + ((var19 & 0xF8) >> 4);
            int var21 = (var19 & 0xF) + class30.field444 * 2;
            int var22 = var20 + class11.field150.method514((byte) 1);
            int var23 = var21 + class11.field150.method514((byte) 1);
            int var24 = class11.field150.method526((byte) 112);
            int var25 = class11.field150.method485(-2386);
            int var26 = class11.field150.method489((byte) 117) * 4;
            int var27 = class11.field150.method489((byte) 119) * 4;
            int var28 = class11.field150.method485(-2386);
            int var29 = class11.field150.method485(arg0 - 2450);
            int var30 = class11.field150.method489((byte) 101);
            int var31 = class11.field150.method489((byte) -25);
            if (var30 == 255) {
                var30 = -1;
            }
            if (var20 >= 0 && var21 >= 0 && var20 < 208 && var21 < 208 && var22 >= 0 && var23 >= 0 && var22 < 208 && var23 < 208 && var25 != 65535) {
                int var32 = var20 * 64;
                int var33 = var21 * 64;
                int var34 = var22 * 64;
                class39 var35 = new class39(var25, class277.field4948, var32, var33, class287.method1968(class277.field4948, var32, var33, (byte) -6) - var26, class118.field2022 + var28, var29 + class118.field2022, var30, var31, var24, var27);
                int var36 = var23 * 64;
                var35.method231((byte) -127, var34, class287.method1968(class277.field4948, var34, var36, (byte) 115) - var27, var36, class118.field2022 + var28);
                class166.field3083.method1131(new class107(var35), false);
            }
        } else if (class246.field4327 == 33) {
            int var37 = class11.field150.method491((byte) 122);
            int var38 = class11.field150.method489((byte) 89);
            int var39 = (var38 & 0x7) + class30.field444;
            int var40 = (var38 >> 4 & 0x7) + class140.field2579;
            int var41 = class11.field150.method484((byte) 22);
            if (var40 >= 0 && var39 >= 0 && var40 < 104 && var39 < 104) {
                class9 var42 = new class9();
                var42.field117 = var37;
                var42.field120 = var41;
                if (class83.field1515[class277.field4948][var40][var39] == null) {
                    class83.field1515[class277.field4948][var40][var39] = new class157();
                }
                class83.field1515[class277.field4948][var40][var39].method1131(new class83(var42), false);
                class76.method557(arg0 ^ 0x2A, var39, var40);
            }
        } else if (class246.field4327 == 14) {
            int var43 = class11.field150.method489((byte) -44);
            int var44 = class140.field2579 + (var43 >> 4 & 0x7);
            int var45 = class30.field444 + (var43 & 0x7);
            int var46 = class11.field150.method485(-2386);
            int var47 = class11.field150.method485(-2386);
            int var48 = class11.field150.method485(-2386);
            if (var44 >= 0 && var45 >= 0 && var44 < 104 && var45 < 104) {
                class157 var49 = class83.field1515[class277.field4948][var44][var45];
                if (var49 != null) {
                    for (class83 var50 = (class83) var49.method1140(0); var50 != null; var50 = (class83) var49.method1127(0)) {
                        class9 var51 = var50.field1526;
                        if ((var46 & 0x7FFF) == var51.field117 && var51.field120 == var47) {
                            var51.field120 = var48;
                            break;
                        }
                    }
                    class76.method557(-126, var45, var44);
                }
            }
        } else if (class246.field4327 == 97) {
            int var52 = class11.field150.method489((byte) -11);
            int var53 = class140.field2579 + (var52 >> 4 & 0x7);
            int var54 = (var52 & 0x7) + class30.field444;
            int var55 = class11.field150.method485(arg0 ^ 0xFFFFF6EE);
            if (var55 == 65535) {
                var55 = -1;
            }
            int var56 = class11.field150.method489((byte) -78);
            int var57 = var56 >> 4 & 0xF;
            int var58 = class11.field150.method489((byte) 88);
            int var59 = var56 & 0x7;
            if (var53 >= 0 && var54 >= 0 && var53 < 104 && var54 < 104) {
                int var60 = var57 + 1;
                if (class77.field1449.field2333[0] >= var53 - var60 && class77.field1449.field2333[0] <= var53 + var60 && (var54 - var60) <= class77.field1449.field2400[0] && (var54 + var60) >= class77.field1449.field2400[0] && class133.field2432 != 0 && var59 > 0 && class184.field3327 < 50 && var55 != -1) {
                    class18.field276[class184.field3327] = var55;
                    class101.field1776[class184.field3327] = var59;
                    class119.field2048[class184.field3327] = var58;
                    class139.field2542[class184.field3327] = null;
                    class157.field2883[class184.field3327] = (var53 << 16) + (var54 << 8) + var57;
                    class184.field3327++;
                }
            }
        } else if (class246.field4327 == 240) {
            int var61 = class11.field150.method522(128);
            int var62 = (var61 >> 4 & 0x7) + class140.field2579;
            int var63 = class30.field444 + (var61 & 0x7);
            int var64 = class11.field150.method485(-2386);
            if (var62 >= 0 && var63 >= 0 && var62 < 104 && var63 < 104) {
                class157 var65 = class83.field1515[class277.field4948][var62][var63];
                if (var65 != null) {
                    for (class83 var66 = (class83) var65.method1140(0); var66 != null; var66 = (class83) var65.method1127(0)) {
                        if ((var64 & 0x7FFF) == var66.field1526.field117) {
                            var66.method401((byte) -118);
                            break;
                        }
                    }
                    if (var65.method1140(0) == null) {
                        class83.field1515[class277.field4948][var62][var63] = null;
                    }
                    class76.method557(-110, var63, var62);
                }
            }
        } else if (class246.field4327 == 135) {
            int var67 = class11.field150.method531((byte) -88);
            int var68 = class11.field150.method487((byte) -80);
            int var69 = (var68 & 0x7) + class30.field444;
            int var70 = (var68 >> 4 & 0x7) + class140.field2579;
            int var71 = class11.field150.method491((byte) 114);
            int var72 = class11.field150.method491((byte) 88);
            if (var70 >= 0 && var69 >= 0 && var70 < 104 && var69 < 104 && class258.field4514 != var67) {
                class9 var73 = new class9();
                var73.field120 = var71;
                var73.field117 = var72;
                if (class83.field1515[class277.field4948][var70][var69] == null) {
                    class83.field1515[class277.field4948][var70][var69] = new class157();
                }
                class83.field1515[class277.field4948][var70][var69].method1131(new class83(var73), false);
                class76.method557(-103, var69, var70);
            }
        } else if (class246.field4327 == 17) {
            int var74 = class11.field150.method489((byte) 81);
            int var75 = (var74 >> 4 & 0x7) + class140.field2579;
            int var76 = class30.field444 + (var74 & 0x7);
            int var77 = class11.field150.method485(arg0 ^ 0xFFFFF6EE);
            int var78 = class11.field150.method489((byte) 108);
            int var79 = class11.field150.method485(-2386);
            if (var75 >= 0 && var76 >= 0 && var75 < 104 && var76 < 104) {
                int var80 = var75 * 128 + 64;
                int var81 = var76 * 128 + 64;
                class135 var82 = new class135(var77, class277.field4948, var80, var81, class287.method1968(class277.field4948, var80, var81, (byte) -74) - var78, var79, class118.field2022);
                class78.field1458.method1131(new class104(var82), false);
            }
        } else if (class246.field4327 == 195) {
            int var83 = class11.field150.method487((byte) -80);
            int var84 = var83 >> 2;
            int var85 = class111.field1919[var84];
            int var86 = var83 & 0x3;
            int var87 = class11.field150.method489((byte) 101);
            int var88 = (var87 >> 4 & 0x7) + class140.field2579;
            int var89 = (var87 & 0x7) + class30.field444;
            if (var88 >= 0 && var89 >= 0 && var88 < 104 && var89 < 104) {
                class83.method616(0, false, var84, var88, -1, var89, class277.field4948, var85, -1, var86);
            }
        } else {
            if (arg0 != 64) {
                method14(-55);
            }
            if (class246.field4327 == 104) {
                int var90 = class11.field150.method489((byte) 98);
                int var91 = (var90 >> 4 & 0xF) + class140.field2579 * 2;
                int var92 = class30.field444 * 2 + (var90 & 0xF);
                int var93 = class11.field150.method514((byte) 1) + var91;
                int var94 = var92 + class11.field150.method514((byte) 1);
                int var95 = class11.field150.method526((byte) 70);
                int var96 = class11.field150.method526((byte) 126);
                int var97 = class11.field150.method485(-2386);
                int var98 = class11.field150.method514((byte) 1);
                int var99 = class11.field150.method489((byte) -82) * 4;
                int var100 = class11.field150.method485(-2386);
                int var101 = class11.field150.method485(-2386);
                int var102 = class11.field150.method489((byte) 100);
                int var103 = class11.field150.method489((byte) 79);
                if (var102 == 255) {
                    var102 = -1;
                }
                if (var91 >= 0 && var92 >= 0 && var91 < 208 && var92 < 208 && var93 >= 0 && var94 >= 0 && var93 < 208 && var94 < 208 && var97 != 65535) {
                    int var104 = var91 * 64;
                    int var105 = var93 * 64;
                    int var106 = var92 * 64;
                    int var107 = var94 * 64;
                    if (var95 != 0) {
                        int var109;
                        class131 var111;
                        if (var95 >= 0) {
                            int var108 = var95 - 1;
                            var109 = var108 >> 11 & 0xF;
                            int var110 = var108 & 0x7FF;
                            var111 = class38.field572[var110];
                        } else {
                            int var112 = -var95 - 1;
                            var109 = var112 >> 11 & 0xF;
                            int var113 = var112 & 0x7FF;
                            if (class258.field4514 == var113) {
                                var111 = class77.field1449;
                            } else {
                                var111 = class107.field1851[var113];
                            }
                        }
                        if (var111 != null) {
                            class264 var114 = var111.method923((byte) -76);
                            if (var114.field4717 != null && var114.field4717[var109] != null) {
                                var98 -= var114.field4717[var109][1];
                                int var115 = var114.field4717[var109][0];
                                int var116 = var114.field4717[var109][2];
                                int var117 = class235.field4123[var111.field2354];
                                int var118 = class235.field4118[var111.field2354];
                                int var119 = var115 * var118 + var116 * var117 >> 16;
                                int var120 = var116 * var118 - (var115 * var117) >> 16;
                                var106 += var120;
                                var104 += var119;
                            }
                        }
                    }
                    class39 var122 = new class39(var97, class277.field4948, var104, var106, class287.method1968(class277.field4948, var104, var106, (byte) -46) - var98, class118.field2022 + var100, var101 + class118.field2022, var102, var103, var96, var99);
                    var122.method231((byte) -119, var105, class287.method1968(class277.field4948, var105, var107, (byte) 115) - var99, var107, class118.field2022 + var100);
                    class166.field3083.method1131(new class107(var122), false);
                }
            } else {
                if (class246.field4327 == 202) {
                    int var123 = class11.field150.method489((byte) 127);
                    int var124 = var123 & 0x3;
                    int var125 = var123 >> 2;
                    int var126 = class11.field150.method489((byte) -93);
                    int var127 = (var126 & 0x7) + class30.field444;
                    int var128 = (var126 >> 4 & 0x7) + class140.field2579;
                    byte var129 = class11.field150.method535((byte) 111);
                    byte var130 = class11.field150.method535((byte) 111);
                    byte var131 = class11.field150.method520((byte) 127);
                    int var132 = class11.field150.method484((byte) 22);
                    int var133 = class11.field150.method491((byte) -118);
                    byte var134 = class11.field150.method514((byte) 1);
                    int var135 = class11.field150.method485(-2386);
                    int var136 = class11.field150.method502((byte) -19);
                    class276.method1910(var136, var124, var133, var128, var131, var125, var127, var134, (byte) 6, var130, var132, var129, var135);
                }
                if (class246.field4327 == 179) {
                    int var137 = class11.field150.method530((byte) 118);
                    int var138 = var137 >> 2;
                    int var139 = class111.field1919[var138];
                    int var140 = class11.field150.method489((byte) -120);
                    int var141 = class140.field2579 + (var140 >> 4 & 0x7);
                    int var142 = var137 & 0x3;
                    int var143 = class30.field444 + (var140 & 0x7);
                    int var144 = class11.field150.method484((byte) 22);
                    if (var141 >= 0 && var143 >= 0 && var141 < 104 && var143 < 104) {
                        class83.method616(0, false, var138, var141, -1, var143, class277.field4948, var139, var144, var142);
                    }
                } else if (class246.field4327 == 20) {
                    int var145 = class11.field150.method522(128);
                    int var146 = ((var145 & 0x7D) >> 4) + class140.field2579;
                    int var147 = (var145 & 0x7) + class30.field444;
                    int var148 = class11.field150.method522(128);
                    int var149 = var148 & 0x3;
                    int var150 = var148 >> 2;
                    int var151 = class111.field1919[var150];
                    int var152 = class11.field150.method491((byte) -44);
                    if (var152 == 65535) {
                        var152 = -1;
                    }
                    class208.method1416(2047, var146, var149, var152, var147, var150, class277.field4948, var151);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(Z)V")
    public static void method15(boolean arg0) {
        field38 = null;
        if (arg0) {
            field39 = null;
            field40 = null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIIIII)I")
    public static final int method16(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg0 & 0x3;
        if ((arg5 & 0x1) == 1) {
            int var8 = arg1;
            arg1 = arg3;
            arg3 = var8;
        }
        field46++;
        if (var7 == 0) {
            return arg2;
        } else if (var7 == 1) {
            return 7 - arg1 - (arg6 - 1);
        } else {
            if (arg4 != 15) {
                method17(23);
            }
            return var7 == 2 ? 7 - arg2 - (arg3 + -1) : arg6;
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)[Lsi;")
    public static final class198[] method17(int arg0) {
        field45++;
        if (arg0 < 8) {
            method17(-44);
        }
        class198[] var1 = new class198[class84.field1528];
        for (int var2 = 0; var2 < class84.field1528; var2++) {
            var1[var2] = new class282(class251.field4406, class286.field5082, class147.field2651[var2], class18.field259[var2], class283.field5005[var2], class55.field991[var2], class73.field1276[var2], class108.field1865);
        }
        class103.method731(false);
        return var1;
    }
}
