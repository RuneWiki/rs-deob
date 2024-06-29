import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class177 {

    @OriginalMember(owner = "client!me", name = "e", descriptor = "Loj;")
    private class346 field2624 = new class346(256);

    @OriginalMember(owner = "client!me", name = "n", descriptor = "Loj;")
    private class346 field2633 = new class346(256);

    @OriginalMember(owner = "client!me", name = "f", descriptor = "Lpj;")
    private class132 field2625;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "Lpj;")
    private class132 field2626;

    @OriginalMember(owner = "client!me", name = "l", descriptor = "Lfc;")
    public static class235 field2631 = new class235(17, 2);

    @OriginalMember(owner = "client!me", name = "h", descriptor = "F")
    public static float field2627;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!me", name = "j", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!me", name = "k", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!me", name = "m", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lof;I)V")
    public static final void method1202(class568 arg0, int arg1) {
        field2623++;
        if (class106.field1427 == arg0) {
            int var2 = class602.field8356.method718(arg1 + 108);
            int var3 = (var2 & 0x7) + class103.field1392;
            int var4 = class124.field1726 + var3;
            int var5 = class186.field2761 + ((var2 & 0x71) >> 4);
            int var6 = class511.field6989 + var5;
            int var7 = class602.field8356.method743((byte) -29);
            int var8 = class602.field8356.method743((byte) -4);
            int var9 = class602.field8356.method743((byte) -112);
            if (class179.field2656 != null) {
                class435 var10 = (class435) class179.field2656.method2061(-17305, (long) (var4 << 14 | class490.field6780 << 28 | var6));
                if (var10 != null) {
                    for (class13 var11 = (class13) var10.field6146.method1270((byte) -25); var11 != null; var11 = (class13) var10.field6146.method1282(0)) {
                        if ((var7 & 0x7FFF) == var11.field216 && var11.field217 == var8) {
                            var11.method2971(1);
                            var11.field217 = var9;
                            class640.method3565(var4, var11, var6, class490.field6780, (byte) 40);
                            break;
                        }
                    }
                    if (var5 >= 0 && var3 >= 0 && var5 < class86.field1185 && var3 < class526.field7212) {
                        class442.method2527(var3, var5, (byte) -1, class490.field6780);
                    }
                }
            }
        } else if (class45.field668 == arg0) {
            int var12 = class602.field8356.method718(-114);
            int var13 = (var12 >> 4 & 0xF) + class186.field2761 * 2;
            int var14 = (var12 & 0xF) + class103.field1392 * 2;
            boolean var15 = class602.field8356.method718(arg1 ^ 0xFFFFFFB8) != 0;
            int var16 = class602.field8356.method748(-813976688) + var13;
            int var17 = class602.field8356.method748(-813976688) + var14;
            int var18 = class602.field8356.method722(4);
            int var19 = class602.field8356.method722(arg1 ^ 0xB);
            int var20 = class602.field8356.method743((byte) -2);
            byte var21 = class602.field8356.method748(-813976688);
            int var22 = class602.field8356.method718(-95) * 4;
            int var23 = class602.field8356.method743((byte) -109);
            int var24 = class602.field8356.method743((byte) -59);
            int var25 = class602.field8356.method718(arg1 ^ 0x58);
            if (var25 == 255) {
                var25 = -1;
            }
            int var26 = class602.field8356.method743((byte) -94);
            if (var13 >= 0 && var14 >= 0 && class86.field1185 * 2 > var13 && var14 < (class86.field1185 * 2) && var16 >= 0 && var17 >= 0 && var16 < (class526.field7212 * 2) && var17 < (class526.field7212 * 2) && var20 != 65535) {
                int var27 = var13 * 256;
                int var28 = var22 << 2;
                int var29 = var21 << 2;
                int var30 = var16 * 256;
                int var31 = var26 << 2;
                int var32 = var14 * 256;
                int var33 = var17 * 256;
                if (var18 != 0) {
                    class457 var34 = null;
                    int var36;
                    if (var18 < 0) {
                        int var35 = -var18 - 1;
                        var36 = (var35 & 0x7996) >> 11;
                        int var37 = var35 & 0x7FF;
                        if (class27.field343 == var37) {
                            var34 = class253.field3576;
                        } else {
                            var34 = class495.field6821[var37];
                        }
                    } else {
                        int var38 = var18 - 1;
                        int var39 = var38 & 0x7FF;
                        var36 = var38 >> 11 & 0xF;
                        class178 var40 = (class178) class323.field4762.method2061(-17305, (long) var39);
                        if (var40 != null) {
                            var34 = var40.field2634;
                        }
                    }
                    if (var34 != null) {
                        class308 var41 = var34.method2636((byte) 104);
                        if (var41.field4585 != null && var41.field4585[var36] != null) {
                            int var42 = var41.field4585[var36][0];
                            int var43 = var41.field4585[var36][2];
                            int var44 = var34.field6395.method3589(true);
                            int var45 = class675.field9542[var44];
                            int var46 = class675.field9541[var44];
                            int var47 = var42 * var46 + var43 * var45 >> 14;
                            int var48 = var43 * var46 - (var42 * var45) >> 14;
                            var27 += var47;
                            var29 -= var41.field4585[var36][1];
                            var32 += var48;
                        }
                    }
                }
                class641 var50 = new class641(var20, class490.field6780, var27, var32, var29, class239.field3440 + var23, class239.field3440 + var24, var25, var31, var19, var28, var15);
                var50.method3576(var30, var33, class203.method1355(var33, var30, 4, class490.field6780) - var28, 109, var23 + class239.field3440);
                class364.field5199.method1273(new class473(var50), (byte) 122);
            }
        } else if (class644.field9149 == arg0) {
            int var51 = class602.field8356.method718(arg1 - 76);
            int var52 = (var51 & 0x7) + class103.field1392;
            int var53 = class124.field1726 + var52;
            int var54 = class186.field2761 + ((var51 & 0x7E) >> 4);
            int var55 = class511.field6989 + var54;
            int var56 = class602.field8356.method743((byte) -25);
            class435 var57 = (class435) class179.field2656.method2061(arg1 ^ 0xFFFFBC68, (long) (class490.field6780 << 28 | var53 << 14 | var55));
            if (var57 != null) {
                for (class13 var58 = (class13) var57.field6146.method1270((byte) -25); var58 != null; var58 = (class13) var57.field6146.method1282(0)) {
                    if ((var56 & 0x7FFF) == var58.field216) {
                        var58.method2971(1);
                        break;
                    }
                }
                if (var57.field6146.method1274((byte) 100)) {
                    var57.method2971(arg1 - 14);
                }
                if (var54 >= 0 && var52 >= 0 && var54 < class86.field1185 && var52 < class526.field7212) {
                    class442.method2527(var52, var54, (byte) -1, class490.field6780);
                }
            }
        } else if (class184.field2712 == arg0) {
            int var59 = class602.field8356.method718(arg1 - 99);
            boolean var60 = (var59 & 0x80) != 0;
            int var61 = class186.field2761 + (var59 >> 3 & 0x7);
            int var62 = (var59 & 0x7) + class103.field1392;
            int var63 = var61 + class602.field8356.method748(arg1 - 813976703);
            int var64 = var62 + class602.field8356.method748(-813976688);
            int var65 = class602.field8356.method722(4);
            int var66 = class602.field8356.method743((byte) -72);
            int var67 = class602.field8356.method718(84) * 4;
            int var68 = class602.field8356.method718(arg1 ^ 0xFFFFFF89) * 4;
            int var69 = class602.field8356.method743((byte) -40);
            int var70 = class602.field8356.method743((byte) -105);
            int var71 = class602.field8356.method718(116);
            int var72 = class602.field8356.method743((byte) -67);
            if (var71 == 255) {
                var71 = -1;
            }
            if (var61 >= 0 && var62 >= 0 && class86.field1185 > var61 && var62 < class526.field7212 && var63 >= 0 && var64 >= 0 && class86.field1185 > var63 && class526.field7212 > var64 && var66 != 65535) {
                int var73 = var67 << 2;
                int var74 = var63 * 512 + 256;
                int var75 = var68 << 2;
                int var76 = var72 << 2;
                int var77 = var62 * 512 + 256;
                int var78 = var64 * 512 + 256;
                int var79 = var61 * 512 + 256;
                class641 var80 = new class641(var66, class490.field6780, var79, var77, var73, class239.field3440 + var69, var70 - -class239.field3440, var71, var76, var65, var75, var60);
                var80.method3576(var74, var78, class203.method1355(var78, var74, arg1 ^ 0xB, class490.field6780) - var75, arg1 ^ 0x71, class239.field3440 + var69);
                class364.field5199.method1273(new class473(var80), (byte) 122);
            }
        } else if (class399.field5541 == arg0) {
            int var81 = class602.field8356.method743((byte) -112);
            int var82 = class602.field8356.method718(-123);
            class164.field2499.method2013(var81, false).method3446(arg1 - 15, var82);
        } else if (class694.field9743 == arg0) {
            int var83 = class602.field8356.method743((byte) -16);
            int var84 = class602.field8356.method754(0);
            int var85 = class602.field8356.method726((byte) 124);
            int var86 = (var85 & 0x7) + class103.field1392;
            int var87 = class124.field1726 + var86;
            int var88 = (var85 >> 4 & 0x7) + class186.field2761;
            int var89 = class511.field6989 + var88;
            boolean var90 = var88 >= 0 && var86 >= 0 && class86.field1185 > var88 && var86 < class526.field7212;
            if (var90 || class218.method1412(class161.field2465, false)) {
                class640.method3565(var87, new class13(var83, var84), var89, class490.field6780, (byte) 40);
                if (var90) {
                    class442.method2527(var86, var88, (byte) -1, class490.field6780);
                }
            }
        } else if (class605.field8435 == arg0) {
            class602.field8356.method718(arg1 ^ 0xFFFFFF85);
            int var91 = class602.field8356.method718(-72);
            int var92 = (var91 >> 4 & 0x7) + class186.field2761;
            int var93 = (var91 & 0x7) + class103.field1392;
            int var94 = class602.field8356.method743((byte) -117);
            int var95 = class602.field8356.method718(115);
            int var96 = class602.field8356.method736(-128);
            String var97 = class602.field8356.method739(1);
            class491.method2751(var96, var95, var92, 27590, var94, class490.field6780, var93, var97);
        } else if (class580.field7908 == arg0) {
            int var98 = class602.field8356.method754(0);
            int var99 = class602.field8356.method726((byte) 126);
            int var100 = ((var99 & 0x75) >> 4) + class186.field2761;
            int var101 = (var99 & 0x7) + class103.field1392;
            byte var102 = class602.field8356.method706((byte) 87);
            byte var103 = class602.field8356.method706((byte) 86);
            int var104 = class602.field8356.method747(arg1 ^ 0x2F);
            byte var105 = class602.field8356.method712(true);
            int var106 = class602.field8356.method710(95);
            int var107 = var106 >> 2;
            int var108 = var106 & 0x3;
            int var109 = class602.field8356.method756((byte) 101);
            byte var110 = class602.field8356.method706((byte) 124);
            int var111 = class602.field8356.method722(4);
            if (!class630.field8790.method385()) {
                class185.method1239(var109, var103, var98, 1, var104, var101, var110, var107, var100, var108, var105, var111, var102, class490.field6780);
            }
        } else if (class673.field9479 == arg0) {
            int var112 = class602.field8356.method718(-121);
            int var113 = (var112 >> 4 & 0x7) + class186.field2761;
            int var114 = (var112 & 0x7) + class103.field1392;
            int var115 = class602.field8356.method743((byte) -22);
            if (var115 == 65535) {
                var115 = -1;
            }
            int var116 = class602.field8356.method718(-98);
            int var117 = var116 >> 4 & 0xF;
            int var118 = var116 & 0x7;
            int var119 = class602.field8356.method718(arg1 - 143);
            int var120 = class602.field8356.method718(-63);
            if (var113 >= 0 && var114 >= 0 && var113 < class86.field1185 && var114 < class526.field7212) {
                int var121 = var117 + 1;
                if ((var113 - var121) <= class253.field3576.field6483[0] && (var113 + var121) >= class253.field3576.field6483[0] && class253.field3576.field6477[0] >= (var114 - var121) && class253.field3576.field6477[0] <= var114 + var121) {
                    class80.method638(var120, var118, false, var115, (class490.field6780 << 24) + (var113 << 16) + (var114 << 8) + var117, -123, var119);
                }
            }
        } else if (class421.field5947 == arg0) {
            int var122 = class602.field8356.method743((byte) -16);
            int var123 = class602.field8356.method710(arg1 - 135);
            int var124 = class186.field2761 + (var123 >> 4 & 0x7);
            int var125 = (var123 & 0x7) + class103.field1392;
            int var126 = class602.field8356.method710(110);
            int var127 = var126 >> 2;
            int var128 = var126 & 0x3;
            int var129 = class469.field6565[var127];
            if (class218.method1412(class161.field2465, false) || var124 >= 0 && var125 >= 0 && var124 < class86.field1185 && var125 < class526.field7212) {
                class680.method3758(var124, class490.field6780, -1, var127, var125, arg1 ^ 0xFFFF9C41, var129, 0, var128, var122);
            }
        } else if (class583.field8122 == arg0) {
            int var130 = class602.field8356.method747(55);
            if (var130 == 65535) {
                var130 = -1;
            }
            int var131 = class602.field8356.method726((byte) 123);
            int var132 = var131 >> 2;
            int var133 = var131 & 0x3;
            int var134 = class469.field6565[var132];
            int var135 = class602.field8356.method726((byte) 122);
            int var136 = ((var135 & 0x7C) >> 4) + class186.field2761;
            int var137 = (var135 & 0x7) + class103.field1392;
            class651.method3620(var134, var132, class490.field6780, var133, var137, var130, var136, -90);
        } else if (class650.field9205 == arg0) {
            int var138 = class602.field8356.method726((byte) 122);
            int var139 = class186.field2761 + (var138 >> 4 & 0x7);
            int var140 = (var138 & 0x7) + class103.field1392;
            int var141 = class602.field8356.method718(-116);
            int var142 = var141 >> 2;
            int var143 = var141 & 0x3;
            int var144 = class469.field6565[var142];
            if (class218.method1412(class161.field2465, false) || var139 >= 0 && var140 >= 0 && class86.field1185 > var139 && class526.field7212 > var140) {
                class680.method3758(var139, class490.field6780, -1, var142, var140, -25522, var144, 0, var143, -1);
            }
        } else if (class662.field9336 == arg0) {
            int var145 = class602.field8356.method718(115);
            int var146 = ((var145 & 0xF6) >> 4) + class186.field2761 * 2;
            int var147 = (var145 & 0xF) + class103.field1392 * 2;
            boolean var148 = class602.field8356.method718(82) != 0;
            int var149 = class602.field8356.method748(-813976688) + var146;
            int var150 = var147 + class602.field8356.method748(-813976688);
            int var151 = class602.field8356.method722(4);
            int var152 = class602.field8356.method743((byte) -94);
            int var153 = class602.field8356.method718(arg1 - 70) * 4;
            int var154 = class602.field8356.method718(117) * 4;
            int var155 = class602.field8356.method743((byte) -121);
            int var156 = class602.field8356.method743((byte) -124);
            int var157 = class602.field8356.method718(76);
            int var158 = class602.field8356.method743((byte) -112);
            if (var157 == 255) {
                var157 = -1;
            }
            if (var146 >= 0 && var147 >= 0 && class86.field1185 * 2 > var146 && var147 < class86.field1185 * 2 && var149 >= 0 && var150 >= 0 && (class526.field7212 * 2) > var149 && var150 < class526.field7212 * 2 && var152 != 65535) {
                int var159 = var147 * 256;
                int var160 = var150 * 256;
                int var161 = var153 << 2;
                int var162 = var149 * 256;
                int var163 = var158 << 2;
                int var164 = var154 << 2;
                int var165 = var146 * 256;
                class641 var166 = new class641(var152, class490.field6780, var165, var159, var161, var155 + class239.field3440, class239.field3440 + var156, var157, var163, var151, var164, var148);
                var166.method3576(var162, var160, class203.method1355(var160, var162, arg1 - 11, class490.field6780) - var164, 26, class239.field3440 + var155);
                class364.field5199.method1273(new class473(var166), (byte) 122);
            }
        } else if (class362.field5166 == arg0) {
            int var167 = class602.field8356.method718(arg1 ^ 0xFFFFFF8E);
            int var168 = (var167 >> 4 & 0x7) + class186.field2761;
            int var169 = (var167 & 0x7) + class103.field1392;
            int var170 = class602.field8356.method743((byte) -11);
            int var171 = class602.field8356.method718(-77);
            int var172 = class602.field8356.method743((byte) -101);
            int var173 = class602.field8356.method718(-69);
            if (var168 >= 0 && var169 >= 0 && var168 < class86.field1185 && var169 < class526.field7212) {
                int var174 = var168 * 512 + 256;
                int var175 = var169 * 512 + 256;
                int var176 = class490.field6780;
                if (var176 < 3 && class105.method800((byte) 119, var169, var168)) {
                    var176++;
                }
                class552 var177 = new class552(var170, var172, class239.field3440, class490.field6780, var176, var174, class203.method1355(var175, var174, 4, class490.field6780) - var171, var175, var168, var168, var169, var169, var173);
                class83.field1161.method1273(new class137(var177), (byte) 122);
            }
        } else if (class240.field3449 == arg0) {
            int var178 = class602.field8356.method718(118);
            int var179 = class186.field2761 + ((var178 & 0x75) >> 4);
            int var180 = (var178 & 0x7) + class103.field1392;
            int var181 = class602.field8356.method743((byte) -123);
            if (var181 == 65535) {
                var181 = -1;
            }
            int var182 = class602.field8356.method718(-97);
            int var183 = (var182 & 0xFE) >> 4;
            int var184 = var182 & 0x7;
            int var185 = class602.field8356.method718(arg1 + 84);
            int var186 = class602.field8356.method718(-97);
            if (var179 >= 0 && var180 >= 0 && class86.field1185 > var179 && var180 < class526.field7212) {
                int var187 = var183 + 1;
                if (class253.field3576.field6483[0] >= (var179 - var187) && class253.field3576.field6483[0] <= (var179 + var187) && class253.field3576.field6477[0] >= (var180 - var187) && class253.field3576.field6477[0] <= var180 + var187) {
                    class552.method3036(var185, (byte) -109, var184, var186, var181, (class490.field6780 << 24) + (var179 << 16) + ((var180 << 8) - -var183));
                }
            }
        } else if (class364.field5198 == arg0) {
            int var188 = class602.field8356.method754(0);
            int var189 = class602.field8356.method756((byte) 101);
            int var190 = class602.field8356.method718(-95);
            int var191 = class103.field1392 + (var190 & 0x7);
            int var192 = class124.field1726 + var191;
            int var193 = ((var190 & 0x7C) >> 4) + class186.field2761;
            int var194 = class511.field6989 + var193;
            int var195 = class602.field8356.method747(73);
            if (class27.field343 != var188) {
                boolean var196 = var193 >= 0 && var191 >= 0 && class86.field1185 > var193 && class526.field7212 > var191;
                if (var196 || class218.method1412(class161.field2465, false)) {
                    class640.method3565(var192, new class13(var189, var195), var194, class490.field6780, (byte) 40);
                    if (var196) {
                        class442.method2527(var191, var193, (byte) -1, class490.field6780);
                    }
                }
            }
        } else {
            class139.method985((byte) -126, "T3 - " + arg0, null);
            if (arg1 == 15) {
                class528.method2930(false, 2);
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(III[I)Lqr;")
    private final class59 method1203(int arg0, int arg1, int arg2, int[] arg3) {
        field2632++;
        int var5 = (arg2 >>> 12 | (arg2 & 0x20000FFF) << 4) ^ arg0;
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class59 var9 = (class59) this.field2633.method2061(-17305, var7);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            if (arg1 != -26068) {
                this.method1207(null, -57, (byte) 57, 114);
            }
            class111 var10 = (class111) this.field2624.method2061(arg1 + 8763, var7);
            if (var10 == null) {
                var10 = class111.method829(this.field2625, arg2, arg0);
                if (var10 == null) {
                    return null;
                }
                this.field2624.method2063(var7, 1, var10);
            }
            class59 var11 = var10.method830(arg3);
            if (var11 == null) {
                return null;
            } else {
                var10.method2971(1);
                this.field2633.method2063(var7, 1, var11);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I[II)Lqr;")
    public final class59 method1204(int arg0, int[] arg1, int arg2) {
        field2630++;
        if (arg2 != 0) {
            this.field2625 = null;
        }
        if (this.field2625.method917((byte) -74) == 1) {
            return this.method1203(arg0, arg2 ^ 0xFFFF9A2C, 0, arg1);
        } else if (this.field2625.method936(arg0, -128) == 1) {
            return this.method1203(0, -26068, arg0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "([IBI)Lqr;")
    public final class59 method1205(int[] arg0, byte arg1, int arg2) {
        if (arg1 >= -78) {
            this.field2624 = null;
        }
        field2620++;
        if (this.field2626.method917((byte) -74) == 1) {
            return this.method1207(arg0, 0, (byte) -99, arg2);
        } else if (this.field2626.method936(arg2, -119) == 1) {
            return this.method1207(arg0, arg2, (byte) -106, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIII)V")
    public static final void method1206(int arg0, int arg1, int arg2, int arg3) {
        field2621++;
        class679 var4 = class669.method3708(9, arg2, arg3 + 1403029142);
        var4.method3748(true);
        var4.field9573 = arg0;
        var4.field9574 = arg1;
        if (arg3 != 19786) {
            field2627 = -1.3446604F;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "([IIBI)Lqr;")
    private final class59 method1207(int[] arg0, int arg1, byte arg2, int arg3) {
        field2622++;
        int var5 = (arg1 >>> 12 | arg1 << 4 & 0xFFFD) ^ arg3;
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6;
        class59 var9 = (class59) this.field2633.method2061(-17305, var7);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class90 var10 = class90.method671(this.field2626, arg1, arg3);
            if (var10 == null) {
                return null;
            }
            class59 var11 = var10.method672();
            this.field2633.method2063(var7, 1, var11);
            if (arg2 >= -89) {
                this.field2625 = null;
            }
            if (arg0 != null) {
                arg0[0] -= var11.field808.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(B)V")
    public static void method1208(byte arg0) {
        if (arg0 == 103) {
            field2631 = null;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIZIFIIII)[[I")
    public static final int[][] method1209(int arg0, int arg1, boolean arg2, int arg3, float arg4, int arg5, int arg6, int arg7, int arg8) {
        field2629++;
        int[][] var9 = new int[arg0][arg6];
        class203 var10 = new class203();
        var10.field2974 = (int) ((float) arg8 * arg4);
        var10.field2981 = arg7;
        var10.field2987 = arg2;
        var10.field2975 = arg1;
        var10.field2978 = arg5;
        var10.method40(arg8 - 4001);
        class687.method3782(arg6, 0, arg0);
        for (int var11 = 0; var11 < arg0; var11++) {
            var10.method1358(72, var11, var9[var11]);
        }
        return var9;
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lpj;Lpj;)V")
    public class177(class132 arg0, class132 arg1) {
        this.field2625 = arg1;
        this.field2626 = arg0;
    }
}
