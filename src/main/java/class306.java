import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class306 extends class90 {

    @OriginalMember(owner = "client!wp", name = "u", descriptor = "I")
    public int field4558 = 0;

    @OriginalMember(owner = "client!wp", name = "s", descriptor = "Lj;")
    public static class240 field4556 = new class240(3, 3);

    @OriginalMember(owner = "client!wp", name = "B", descriptor = "Z")
    public static boolean field4565;

    @OriginalMember(owner = "client!wp", name = "t", descriptor = "I")
    public static int field4557;

    @OriginalMember(owner = "client!wp", name = "v", descriptor = "I")
    public static int field4559;

    @OriginalMember(owner = "client!wp", name = "w", descriptor = "I")
    public static int field4560;

    @OriginalMember(owner = "client!wp", name = "y", descriptor = "I")
    public static int field4562;

    @OriginalMember(owner = "client!wp", name = "z", descriptor = "I")
    public static int field4563;

    @OriginalMember(owner = "client!wp", name = "A", descriptor = "I")
    public static int field4564;

    @OriginalMember(owner = "client!wp", name = "x", descriptor = "[S")
    public static short[] field4561;

    static {
        new class332("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
        field4565 = false;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lre;Z)V", line = 4)
    public final void method1905(class446 arg0, boolean arg1) {
        while (true) {
            int var3 = arg0.method2628(49152);
            if (var3 == 0) {
                field4564++;
                if (arg1) {
                    method1906(true, (class187) null, (byte) -110, (class187) null, -14);
                    return;
                }
                return;
            }
            this.method1908(-3, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(ZLso;BLso;I)I", line = 27)
    public static final int method1906(boolean arg0, class187 arg1, byte arg2, class187 arg3, int arg4) {
        field4557++;
        if (arg4 == 1) {
            int var5 = arg3.field4990;
            int var6 = arg1.field4990;
            if (!arg0) {
                if (var6 == -1) {
                    var6 = 2001;
                }
                if (var5 == -1) {
                    var5 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg4 == 2) {
            return class422.method2492(arg3.method1292(0).field3795, arg2 + 16, class4.field85, arg1.method1292(0).field3795);
        } else if (arg4 == 3) {
            if (arg3.field2841.equals("-")) {
                if (arg1.field2841.equals("-")) {
                    return 0;
                } else if (arg0) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field2841.equals("-")) {
                return arg0 ? 1 : -1;
            } else {
                return class422.method2492(arg3.field2841, arg2 ^ 0x10, class4.field85, arg1.field2841);
            }
        } else if (arg4 == 4) {
            if (arg3.method2046((byte) -120)) {
                return arg1.method2046((byte) -120) ? 0 : 1;
            } else if (arg1.method2046((byte) 17)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg4 == 5) {
            if (arg3.method2044(1912297900)) {
                return arg1.method2044(1912297900) ? 0 : 1;
            } else if (arg1.method2044(arg2 ^ 0x8E04A643)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg4 == 6) {
            if (arg3.method2045(arg2 - 6983)) {
                return arg1.method2045(arg2 ^ 0x1B47) ? 0 : 1;
            } else if (arg1.method2045(-7000)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg4 == 7) {
            if (arg3.method2050((byte) 111)) {
                return arg1.method2050((byte) -23) ? 0 : 1;
            } else if (arg1.method2050((byte) -73)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg2 != -17) {
            return 22;
        } else if (arg4 == 8) {
            int var7 = arg3.field2846;
            int var8 = arg1.field2846;
            if (arg0) {
                if (var7 == 1000) {
                    var7 = -1;
                }
                if (var8 == 1000) {
                    var8 = -1;
                }
            } else {
                if (var7 == -1) {
                    var7 = 1000;
                }
                if (var8 == -1) {
                    var8 = 1000;
                }
            }
            return var7 - var8;
        } else {
            return arg3.field2845 - arg1.field2845;
        }
    }

    @OriginalMember(owner = "client!wp", name = "f", descriptor = "(I)V", line = 126)
    public static void method1907(int arg0) {
        field4561 = null;
        if (arg0 != 7) {
            method1909(-100, (class240) null);
        }
        field4556 = null;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(IILre;)V", line = 141)
    private final void method1908(int arg0, int arg1, class446 arg2) {
        if (~arg1 == arg0) {
            this.field4558 = arg2.method2631(2530);
        }
        field4559++;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(ILj;)V", line = 156)
    public static final void method1909(int arg0, class240 arg1) {
        field4560++;
        if (class331.field4958 == arg1) {
            class220.field3246.method2628(49152);
            int var2 = class220.field3246.method2628(49152);
            int var3 = class305.field4549 + (var2 >> 4 & 0x7);
            int var4 = (var2 & 0x7) + class131.field1832;
            int var5 = class220.field3246.method2631(2530);
            int var6 = class220.field3246.method2628(arg0 + 49088);
            int var7 = class220.field3246.method2613(-25778);
            String var8 = class220.field3246.method2582((byte) -102);
            class206.method1399(var6, var8, var5, var7, (byte) 75, class95.field1341, var3, var4);
        } else if (class327.field4920 == arg1) {
            int var9 = class220.field3246.method2628(arg0 ^ 0xC040);
            int var10 = class305.field4549 + (var9 >> 4 & 0x7);
            int var11 = (var9 & 0x7) + class131.field1832;
            int var12 = class220.field3246.method2631(2530);
            int var13 = class220.field3246.method2631(2530);
            int var14 = class220.field3246.method2631(2530);
            if (class491.field6897 != null && var10 >= 0 && var11 >= 0 && class379.field5642 > var10 && var11 < class456.field6477) {
                class31 var15 = (class31) class491.field6897.method2305((long) (var11 << 14 | class95.field1341 << 28 | var10), (byte) 31);
                if (var15 != null) {
                    for (class267 var16 = (class267) var15.field407.method2456(32101); var16 != null; var16 = (class267) var15.field407.method2461(301)) {
                        if ((var12 & 0x7FFF) == var16.field3963 && var16.field3961 == var13) {
                            var16.method283(arg0 - 62);
                            var16.field3961 = var14;
                            class387.method2343(var11, var10, var16, class95.field1341, -16431);
                            break;
                        }
                    }
                    class409.method2444(class95.field1341, var10, (byte) 26, var11);
                }
            }
        } else if (class161.field2221 == arg1) {
            int var17 = class220.field3246.method2585(97);
            int var18 = class220.field3246.method2628(49152);
            int var19 = (var18 >> 4 & 0x7) + class305.field4549;
            int var20 = (var18 & 0x7) + class131.field1832;
            int var21 = class220.field3246.method2585(arg0 ^ 0x6);
            int var22 = class220.field3246.method2585(arg0 ^ 0x32);
            if (var19 >= 0 && var20 >= 0 && var19 < class379.field5642 && class456.field6477 > var20 && class263.field3910 != var22) {
                class387.method2343(var20, var19, new class267(var17, var21), class95.field1341, -16431);
                class409.method2444(class95.field1341, var19, (byte) 26, var20);
            }
        } else if (class72.field969 == arg1) {
            int var23 = class220.field3246.method2626(124);
            int var24 = ((var23 & 0x70) >> 4) + class305.field4549;
            int var25 = (var23 & 0x7) + class131.field1832;
            int var26 = class220.field3246.method2628(49152);
            int var27 = var26 >> 2;
            int var28 = var26 & 0x3;
            int var29 = class352.field5363[var27];
            if (var24 >= 0 && var25 >= 0 && var24 < class379.field5642 && class456.field6477 > var25) {
                class27.method235(true, var27, class95.field1341, -1, var25, var28, var24, 0, var29, -1);
            }
        } else {
            if (arg0 != 64) {
                field4562 = -96;
            }
            if (field4556 == arg1) {
                int var30 = class220.field3246.method2616((byte) -100);
                int var31 = ((var30 & 0x7C) >> 4) + class305.field4549;
                int var32 = (var30 & 0x7) + class131.field1832;
                int var33 = class220.field3246.method2631(2530);
                if (var31 >= 0 && var32 >= 0 && class379.field5642 > var31 && var32 < class456.field6477) {
                    class31 var34 = (class31) class491.field6897.method2305((long) (var31 | class95.field1341 << 28 | var32 << 14), (byte) 115);
                    if (var34 != null) {
                        for (class267 var35 = (class267) var34.field407.method2456(32101); var35 != null; var35 = (class267) var34.field407.method2461(301)) {
                            if ((var33 & 0x7FFF) == var35.field3963) {
                                var35.method283(arg0 - 62);
                                break;
                            }
                        }
                        if (var34.field407.method2458(-111)) {
                            var34.method283(2);
                        }
                        class409.method2444(class95.field1341, var31, (byte) 26, var32);
                    }
                }
            } else if (class253.field3631 == arg1) {
                int var36 = class220.field3246.method2628(49152);
                int var37 = class305.field4549 * 2 + (var36 >> 4 & 0xF);
                int var38 = (var36 & 0xF) + class131.field1832 * 2;
                int var39 = var37 + class220.field3246.method2642(true);
                int var40 = var38 + class220.field3246.method2642(true);
                int var41 = class220.field3246.method2634(123);
                int var42 = class220.field3246.method2631(2530);
                int var43 = class220.field3246.method2628(arg0 ^ 0xC040) * 4;
                int var44 = class220.field3246.method2628(49152) * 4;
                int var45 = class220.field3246.method2631(2530);
                int var46 = class220.field3246.method2631(2530);
                int var47 = class220.field3246.method2628(49152);
                int var48 = class220.field3246.method2628(49152);
                if (var47 == 255) {
                    var47 = -1;
                }
                if (var37 >= 0 && var38 >= 0 && var37 < (class379.field5642 * 2) && class379.field5642 * 2 > var38 && var39 >= 0 && var40 >= 0 && var39 < (class456.field6477 * 2) && var40 < (class456.field6477 * 2) && var42 != 65535) {
                    int var49 = var37 * 64;
                    int var50 = var40 * 64;
                    int var51 = var38 * 64;
                    int var52 = var39 * 64;
                    class226 var53 = new class226(var42, class95.field1341, var49, var51, class25.method219(48602855, class95.field1341, var51, var49) - var43, class452.field6418 + var45, class452.field6418 + var46, var47, var48, var41, var44);
                    var53.method1471(class25.method219(arg0 + 48602791, class95.field1341, var50, var52) - var44, var52, var45 + class452.field6418, var50, arg0 ^ 0x1D);
                    class36.field460.method2453((byte) -83, new class171(var53));
                }
            } else if (class220.field3247 == arg1) {
                int var54 = class220.field3246.method2628(arg0 ^ 0xC040);
                int var55 = (var54 >> 4 & 0x7) + class305.field4549;
                int var56 = (var54 & 0x7) + class131.field1832;
                int var57 = class220.field3246.method2631(2530);
                int var58 = class220.field3246.method2628(49152);
                int var59 = class220.field3246.method2631(2530);
                if (var55 >= 0 && var56 >= 0 && class379.field5642 > var55 && var56 < class456.field6477) {
                    int var60 = var55 * 128 + 64;
                    int var61 = var56 * 128 + 64;
                    class200 var62 = new class200(var57, var59, class452.field6418, class95.field1341, var60, class25.method219(48602855, class95.field1341, var61, var60) - var58, var61, var55, var55, var56, var56);
                    class467.field6578.method2453((byte) -84, new class425(var62));
                }
            } else if (class493.field6935 == arg1) {
                byte var63 = class220.field3246.method2618(false);
                int var64 = class220.field3246.method2585(64);
                byte var65 = class220.field3246.method2641(arg0 - 168);
                int var66 = class220.field3246.method2621((byte) 107);
                int var67 = class220.field3246.method2631(arg0 + 2466);
                int var68 = class220.field3246.method2616((byte) -105);
                int var69 = var68 >> 2;
                int var70 = var68 & 0x3;
                byte var71 = class220.field3246.method2618(false);
                int var72 = class220.field3246.method2631(2530);
                byte var73 = class220.field3246.method2642(true);
                int var74 = class220.field3246.method2626(-68);
                int var75 = ((var74 & 0x71) >> 4) + class305.field4549;
                int var76 = (var74 & 0x7) + class131.field1832;
                if (!class138.field1976.method556()) {
                    class188.method1299(var63, class95.field1341, var69, var65, var72, var70, var71, var73, var64, arg0 ^ 0x14, var67, var66, var76, var75);
                }
            } else if (class150.field2115 == arg1) {
                int var77 = class220.field3246.method2628(arg0 + 49088);
                int var78 = (var77 >> 4 & 0xF) + class305.field4549 * 2;
                int var79 = class131.field1832 * 2 + (var77 & 0xF);
                int var80 = class220.field3246.method2642(true) + var78;
                int var81 = var79 + class220.field3246.method2642(true);
                int var82 = class220.field3246.method2634(arg0 - 64);
                int var83 = class220.field3246.method2634(-126);
                int var84 = class220.field3246.method2631(2530);
                int var85 = class220.field3246.method2642(true);
                int var86 = class220.field3246.method2628(49152) * 4;
                int var87 = class220.field3246.method2631(2530);
                int var88 = class220.field3246.method2631(arg0 + 2466);
                int var89 = class220.field3246.method2628(49152);
                int var90 = class220.field3246.method2628(arg0 + 49088);
                if (var89 == 255) {
                    var89 = -1;
                }
                if (var78 >= 0 && var79 >= 0 && var78 < class379.field5642 * 2 && var79 < class379.field5642 * 2 && var80 >= 0 && var81 >= 0 && var80 < class456.field6477 * 2 && (class456.field6477 * 2) > var81 && var84 != 65535) {
                    int var91 = var81 * 64;
                    int var92 = var78 * 64;
                    int var93 = var79 * 64;
                    int var94 = var80 * 64;
                    if (var82 != 0) {
                        int var96;
                        class309 var98;
                        if (var82 >= 0) {
                            int var95 = var82 - 1;
                            var96 = var95 >> 11 & 0xF;
                            int var97 = var95 & 0x7FF;
                            var98 = class18.field241[var97];
                        } else {
                            int var99 = -var82 - 1;
                            var96 = var99 >> 11 & 0xF;
                            int var100 = var99 & 0x7FF;
                            if (class263.field3910 == var100) {
                                var98 = class472.field6622;
                            } else {
                                var98 = class40.field565[var100];
                            }
                        }
                        if (var98 != null) {
                            class322 var101 = var98.method1917(arg0 - 64);
                            if (var101.field4818 != null && var101.field4818[var96] != null) {
                                int var102 = var101.field4818[var96][0];
                                int var103 = var101.field4818[var96][2];
                                int var104 = var98.field4611.method2743(true);
                                int var105 = class172.field2450[var104];
                                int var106 = class172.field2456[var104];
                                int var107 = var102 * var106 + var103 * var105 >> 15;
                                int var108 = var103 * var106 - (var102 * var105) >> 15;
                                var92 += var107;
                                var93 += var108;
                                var85 -= var101.field4818[var96][1];
                            }
                        }
                    }
                    class226 var110 = new class226(var84, class95.field1341, var92, var93, class25.method219(48602855, class95.field1341, var93, var92) - var85, class452.field6418 + var87, class452.field6418 + var88, var89, var90, var83, var86);
                    var110.method1471(class25.method219(48602855, class95.field1341, var91, var94) - var86, var94, class452.field6418 + var87, var91, 124);
                    class36.field460.method2453((byte) -99, new class171(var110));
                }
            } else if (class332.field4966 == arg1) {
                int var111 = class220.field3246.method2637(-4);
                if (var111 == 65535) {
                    var111 = -1;
                }
                int var112 = class220.field3246.method2616((byte) 122);
                int var113 = var112 >> 2;
                int var114 = var112 & 0x3;
                int var115 = class352.field5363[var113];
                int var116 = class220.field3246.method2620(arg0 ^ 0xFFFFFFC2);
                int var117 = ((var116 & 0x76) >> 4) + class305.field4549;
                int var118 = (var116 & 0x7) + class131.field1832;
                class485.method2841(var115, var113, var111, class95.field1341, 5, var114, var118, var117);
            } else if (class262.field3900 == arg1) {
                int var119 = class220.field3246.method2631(2530);
                int var120 = class220.field3246.method2628(49152);
                class206.field3124.method338((byte) 104, var119).method1760(-28496, var120);
            } else if (class252.field3623 == arg1) {
                int var121 = class220.field3246.method2598(arg0 + 15165);
                int var122 = class220.field3246.method2598(arg0 ^ 0x3B3D);
                int var123 = class220.field3246.method2616((byte) 97);
                int var124 = ((var123 & 0x79) >> 4) + class305.field4549;
                int var125 = class131.field1832 + (var123 & 0x7);
                if (var124 >= 0 && var125 >= 0 && var124 < class379.field5642 && class456.field6477 > var125) {
                    class387.method2343(var125, var124, new class267(var122, var121), class95.field1341, -16431);
                    class409.method2444(class95.field1341, var124, (byte) 26, var125);
                }
            } else if (class229.field3369 == arg1) {
                int var126 = class220.field3246.method2628(49152);
                int var127 = ((var126 & 0x7B) >> 4) + class305.field4549;
                int var128 = class131.field1832 + (var126 & 0x7);
                int var129 = class220.field3246.method2642(true) + var127;
                int var130 = class220.field3246.method2642(true) + var128;
                int var131 = class220.field3246.method2634(124);
                int var132 = class220.field3246.method2631(2530);
                int var133 = class220.field3246.method2628(arg0 ^ 0xC040) * 4;
                int var134 = class220.field3246.method2628(49152) * 4;
                int var135 = class220.field3246.method2631(2530);
                int var136 = class220.field3246.method2631(2530);
                int var137 = class220.field3246.method2628(49152);
                int var138 = class220.field3246.method2628(49152);
                if (var137 == 255) {
                    var137 = -1;
                }
                if (var127 >= 0 && var128 >= 0 && class379.field5642 > var127 && class456.field6477 > var128 && var129 >= 0 && var130 >= 0 && class379.field5642 > var129 && var130 < class456.field6477 && var132 != 65535) {
                    int var139 = var130 * 128 + 64;
                    int var140 = var127 * 128 + 64;
                    int var141 = var129 * 128 + 64;
                    int var142 = var128 * 128 + 64;
                    class226 var143 = new class226(var132, class95.field1341, var140, var142, class25.method219(48602855, class95.field1341, var142, var140) - var133, class452.field6418 + var135, class452.field6418 + var136, var137, var138, var131, var134);
                    var143.method1471(class25.method219(48602855, class95.field1341, var139, var141) - var134, var141, var135 + class452.field6418, var139, 82);
                    class36.field460.method2453((byte) -84, new class171(var143));
                }
            } else if (class193.field2936 == arg1) {
                int var144 = class220.field3246.method2628(49152);
                int var145 = class305.field4549 + ((var144 & 0x7E) >> 4);
                int var146 = (var144 & 0x7) + class131.field1832;
                int var147 = class220.field3246.method2631(2530);
                if (var147 == 65535) {
                    var147 = -1;
                }
                int var148 = class220.field3246.method2628(49152);
                int var149 = var148 >> 4 & 0xF;
                int var150 = var148 & 0x7;
                int var151 = class220.field3246.method2628(49152);
                int var152 = class220.field3246.method2628(49152);
                if (var145 >= 0 && var146 >= 0 && class379.field5642 > var145 && var146 < class456.field6477) {
                    int var153 = var149 + 1;
                    if ((var145 - var153) <= class472.field6622.field4675[0] && (var145 + var153) >= class472.field6622.field4675[0] && class472.field6622.field4674[0] >= var146 - var153 && class472.field6622.field4674[0] <= (var146 + var153) && class337.field5038.field3934 != 0 && var150 > 0 && class198.field2984 < 50 && var147 != -1) {
                        class78.field1107[class198.field2984] = var147;
                        class419.field6024[class198.field2984] = var150;
                        class385.field5696[class198.field2984] = var151;
                        class283.field4297[class198.field2984] = null;
                        class325.field4876[class198.field2984] = (class95.field1341 << 24) + (var146 << 8) + var149 + (var145 << 16);
                        class37.field476[class198.field2984] = var152;
                        class198.field2984++;
                    }
                }
            } else if (class459.field6502 == arg1) {
                int var154 = class220.field3246.method2620(-127);
                int var155 = (var154 >> 4 & 0x7) + class305.field4549;
                int var156 = (var154 & 0x7) + class131.field1832;
                int var157 = class220.field3246.method2628(arg0 + 49088);
                int var158 = var157 >> 2;
                int var159 = var157 & 0x3;
                int var160 = class352.field5363[var158];
                int var161 = class220.field3246.method2631(2530);
                if (var155 >= 0 && var156 >= 0 && class379.field5642 > var155 && var156 < class456.field6477) {
                    class27.method235(true, var158, class95.field1341, var161, var156, var159, var155, 0, var160, -1);
                }
            } else {
                class416.method2475(false, (Throwable) null, "T3 - " + arg1);
                class38.method295(arg0 ^ 0x10);
            }
        }
    }
}
