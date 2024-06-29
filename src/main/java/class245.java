import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class245 {

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "Z")
    public static boolean field3024 = false;

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "I")
    public static int field3028 = 0;

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!bo", name = "g", descriptor = "I")
    public static int field3030;

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "Lbo;")
    public class245 field3027;

    @OriginalMember(owner = "client!bo", name = "f", descriptor = "Let;")
    public class613 field3029;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V", line = 6)
    public static final void method1444(int arg0) {
        field3026++;
        int var1 = 19 % ((arg0 + 23) / 59);
        if (class272.field3387 == null) {
            return;
        }
        if (class272.field3387.field884 == 1) {
            class272.field3387 = null;
            return;
        }
        if (class272.field3387.field884 == 2) {
            class634.method3566(class597.field8398, 2, 0, class44.field428);
            class272.field3387 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)V", line = 37)
    public final void method1445(int arg0) {
        field3025++;
        if (class244.field3022 >= 500) {
            return;
        }
        this.field3029 = null;
        this.field3027 = class454.field6489;
        class454.field6489 = this;
        if (arg0 != -1) {
            this.field3027 = null;
        }
        class244.field3022++;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(ILps;)V", line = 60)
    public static final void method1446(int arg0, class469 arg1) {
        if (arg0 != 65535) {
            return;
        }
        field3030++;
        if (class120.field1340 == arg1) {
            int var2 = class626.field8849.method620((byte) -128);
            int var3 = ((var2 & 0x7D) >> 4) + class301.field3745;
            int var4 = class411.field5523 + (var2 & 0x7);
            int var5 = class626.field8849.method643((byte) -77);
            if (var5 == 65535) {
                var5 = -1;
            }
            int var6 = class626.field8849.method620((byte) 39);
            int var7 = (var6 & 0xF0) >> 4;
            int var8 = var6 & 0x7;
            int var9 = class626.field8849.method620((byte) -34);
            int var10 = class626.field8849.method620((byte) 104);
            if (var3 >= 0 && var4 >= 0 && var3 < class142.field1574 && class140.field1550 > var4) {
                int var11 = var7 + 1;
                if (class362.field4859.field9517[0] >= var3 - var11 && var3 + var11 >= class362.field4859.field9517[0] && class362.field4859.field9513[0] >= var4 - var11 && class362.field4859.field9513[0] <= var4 + var11) {
                    class313.method1796(var10, var5, var8, false, var9, (class180.field2025 << 24) + (var3 << 16) + (var4 << 8) + var7);
                }
            }
        } else if (class595.field8390 == arg1) {
            int var12 = class626.field8849.method623(arg0 ^ 0xFFFF0076);
            int var13 = class626.field8849.method649(255);
            int var14 = class411.field5523 + (var13 & 0x7);
            int var15 = class231.field2860 + var14;
            int var16 = ((var13 & 0x7F) >> 4) + class301.field3745;
            int var17 = class26.field245 + var16;
            int var18 = class626.field8849.method619((byte) -102);
            boolean var19 = var16 >= 0 && var14 >= 0 && class142.field1574 > var16 && var14 < class140.field1550;
            if (var19 || class485.method2798(class247.field3061, (byte) 44)) {
                class476.method2744(class180.field2025, var15, (byte) 41, var17, new class190(var12, var18));
                if (var19) {
                    class443.method2566(var14, var16, -2098890839, class180.field2025);
                }
            }
        } else if (class247.field3051 == arg1) {
            int var20 = class626.field8849.method620((byte) -128);
            int var21 = (var20 >> 4 & 0xF) + class301.field3745 * 2;
            int var22 = (var20 & 0xF) + class411.field5523 * 2;
            boolean var23 = class626.field8849.method620((byte) -127) != 0;
            int var24 = class626.field8849.method657(false) + var21;
            int var25 = class626.field8849.method657(false) + var22;
            int var26 = class626.field8849.method676(-5);
            int var27 = class626.field8849.method643((byte) -77);
            int var28 = class626.field8849.method620((byte) -27) * 4;
            int var29 = class626.field8849.method620((byte) -128) * 4;
            int var30 = class626.field8849.method643((byte) -77);
            int var31 = class626.field8849.method643((byte) -77);
            int var32 = class626.field8849.method620((byte) -126);
            if (var32 == 255) {
                var32 = -1;
            }
            int var33 = class626.field8849.method643((byte) -77);
            if (var21 >= 0 && var22 >= 0 && (class142.field1574 * 2) > var21 && (class142.field1574 * 2) > var22 && var24 >= 0 && var25 >= 0 && class140.field1550 * 2 > var24 && var25 < (class140.field1550 * 2) && var27 != 65535) {
                int var34 = var29 << 2;
                int var35 = var21 * 256;
                int var36 = var22 * 256;
                int var37 = var28 << 2;
                int var38 = var25 * 256;
                int var39 = var24 * 256;
                int var40 = var33 << 2;
                class618 var41 = new class618(var27, class180.field2025, class180.field2025, var35, var36, var37, class678.field9539 + var30, class678.field9539 + var31, var32, var40, var26, var34, var23);
                var41.method3450(var38, var39, class593.method3335(var38, class180.field2025, 27648, var39) - var34, class678.field9539 + var30, (byte) -93);
                class375.field5107.method3425(new class658(var41), false);
            }
        } else if (class375.field5097 == arg1) {
            int var42 = class626.field8849.method651((byte) -125);
            int var43 = (var42 >> 4 & 0x7) + class301.field3745;
            int var44 = class411.field5523 + (var42 & 0x7);
            int var45 = class626.field8849.method630(30426);
            int var46 = var45 >> 2;
            int var47 = var45 & 0x3;
            int var48 = class505.field7272[var46];
            if (class485.method2798(class247.field3061, (byte) 54) || var43 >= 0 && var44 >= 0 && var43 < class142.field1574 && class140.field1550 > var44) {
                class138.method769(var47, -1, var44, (byte) 51, -1, var48, var46, class180.field2025, var43, 0);
            }
        } else if (class469.field6705 == arg1) {
            int var49 = class626.field8849.method651((byte) -113);
            int var50 = var49 >> 2;
            int var51 = var49 & 0x3;
            int var52 = class505.field7272[var50];
            int var53 = class626.field8849.method619((byte) -73);
            int var54 = class626.field8849.method649(255);
            int var55 = (var54 >> 4 & 0x7) + class301.field3745;
            int var56 = class411.field5523 + (var54 & 0x7);
            if (class485.method2798(class247.field3061, (byte) 120) || var55 >= 0 && var56 >= 0 && class142.field1574 > var55 && class140.field1550 > var56) {
                class138.method769(var51, -1, var56, (byte) 51, var53, var52, var50, class180.field2025, var55, 0);
            }
        } else if (class273.field3415 == arg1) {
            int var57 = class626.field8849.method643((byte) -77);
            int var58 = class626.field8849.method620((byte) 40);
            class364.field4891.method2134(var57, true).method3581(-16543, var58);
        } else if (class572.field8122 == arg1) {
            int var59 = class626.field8849.method620((byte) -126);
            int var60 = class411.field5523 + (var59 & 0x7);
            int var61 = class231.field2860 + var60;
            int var62 = (var59 >> 4 & 0x7) + class301.field3745;
            int var63 = class26.field245 + var62;
            int var64 = class626.field8849.method643((byte) -77);
            int var65 = class626.field8849.method643((byte) -77);
            int var66 = class626.field8849.method643((byte) -77);
            if (class200.field2354 != null) {
                class310 var67 = (class310) class200.field2354.method3669((long) (var63 | var61 << 14 | class180.field2025 << 28), -1);
                if (var67 != null) {
                    for (class190 var68 = (class190) var67.field3833.method3434((byte) 2); var68 != null; var68 = (class190) var67.field3833.method3430(true)) {
                        if ((var64 & 0x7FFF) == var68.field2177 && var68.field2179 == var65) {
                            var68.method1922(82);
                            var68.field2179 = var66;
                            class476.method2744(class180.field2025, var61, (byte) 41, var63, var68);
                            break;
                        }
                    }
                    if (var62 >= 0 && var60 >= 0 && class142.field1574 > var62 && var60 < class140.field1550) {
                        class443.method2566(var60, var62, arg0 ^ 0x82E58856, class180.field2025);
                    }
                }
            }
        } else if (class200.field2358 == arg1) {
            int var69 = class626.field8849.method620((byte) -127);
            int var70 = ((var69 & 0xF1) >> 4) + class301.field3745 * 2;
            int var71 = (var69 & 0xF) + class411.field5523 * 2;
            int var72 = class626.field8849.method620((byte) -127);
            boolean var73 = (var72 & 0x1) != 0;
            int var74 = var72 >> 1;
            int var75 = var70 + class626.field8849.method657(false);
            int var76 = class626.field8849.method657(false) + var71;
            int var77 = class626.field8849.method676(-5);
            int var78 = class626.field8849.method676(arg0 ^ 0xFFFF0004);
            int var79 = class626.field8849.method643((byte) -77);
            byte var80 = class626.field8849.method657(false);
            int var81 = class626.field8849.method620((byte) 34) * 4;
            int var82 = class626.field8849.method643((byte) -77);
            int var83 = class626.field8849.method643((byte) -77);
            int var84 = class626.field8849.method620((byte) 119);
            int var85 = class626.field8849.method643((byte) -77);
            if (var84 == 255) {
                var84 = -1;
            }
            if (var70 >= 0 && var71 >= 0 && (class142.field1574 * 2) > var70 && (class142.field1574 * 2) > var71 && var75 >= 0 && var76 >= 0 && class140.field1550 * 2 > var75 && (class140.field1550 * 2) > var76 && var79 != 65535) {
                int var86 = var76 * 256;
                int var87 = var70 * 256;
                int var88 = var81 << 2;
                int var89 = var80 << 2;
                int var90 = var75 * 256;
                int var91 = var71 * 256;
                int var92 = var85 << 2;
                if (var77 != 0) {
                    class677 var93 = null;
                    if (var77 >= 0) {
                        int var94 = var77 - 1;
                        class214 var95 = (class214) class274.field3433.method3669((long) var94, -1);
                        if (var95 != null) {
                            var93 = var95.field2601;
                        }
                    } else {
                        int var96 = -var77 - 1;
                        if (class392.field5314 == var96) {
                            var93 = class362.field4859;
                        } else {
                            var93 = class139.field1540[var96];
                        }
                    }
                    if (var93 != null) {
                        class543 var97 = var93.method3737((byte) 86);
                        if (var97.field7667 != null && var97.field7667[var74] != null) {
                            int var98 = var97.field7667[var74][0];
                            int var99 = var97.field7667[var74][2];
                            int var100 = var93.field9446.method3391(arg0 - 65415);
                            int var101 = class435.field6134[var100];
                            int var102 = class435.field6135[var100];
                            int var103 = var98 * var102 + var99 * var101 >> 14;
                            int var104 = var99 * var102 - var98 * var101 >> 14;
                            var87 += var103;
                            var91 += var104;
                            var89 -= var97.field7667[var74][1];
                        }
                    }
                }
                class618 var106 = new class618(var79, class180.field2025, class180.field2025, var87, var91, var89, class678.field9539 + var82, var83 - -class678.field9539, var84, var92, var78, var88, var73);
                var106.method3450(var86, var90, class593.method3335(var86, class180.field2025, 27648, var90) - var88, class678.field9539 + var82, (byte) -111);
                class375.field5107.method3425(new class658(var106), false);
            }
        } else if (class116.field1284 == arg1) {
            int var107 = class626.field8849.method620((byte) -126);
            int var108 = class411.field5523 + (var107 & 0x7);
            int var109 = var108 + class231.field2860;
            int var110 = class301.field3745 + (var107 >> 4 & 0x7);
            int var111 = class26.field245 + var110;
            int var112 = class626.field8849.method643((byte) -77);
            int var113 = class626.field8849.method650((byte) -28);
            int var114 = class626.field8849.method619((byte) -114);
            if (class392.field5314 != var112) {
                boolean var115 = var110 >= 0 && var108 >= 0 && var110 < class142.field1574 && class140.field1550 > var108;
                if (var115 || class485.method2798(class247.field3061, (byte) 50)) {
                    class476.method2744(class180.field2025, var109, (byte) 41, var111, new class190(var113, var114));
                    if (var115) {
                        class443.method2566(var108, var110, -2098890839, class180.field2025);
                    }
                }
            }
        } else if (class642.field9081 == arg1) {
            int var116 = class626.field8849.method620((byte) -126);
            int var117 = class301.field3745 + (var116 >> 4 & 0x7);
            int var118 = (var116 & 0x7) + class411.field5523;
            int var119 = class626.field8849.method643((byte) -77);
            int var120 = class626.field8849.method620((byte) -126);
            int var121 = class626.field8849.method643((byte) -77);
            int var122 = class626.field8849.method620((byte) 65);
            if (var117 >= 0 && var118 >= 0 && var117 < class142.field1574 && class140.field1550 > var118) {
                int var123 = var117 * 512 + 256;
                int var124 = var118 * 512 + 256;
                int var125 = class180.field2025;
                if (var125 < 3 && class568.method3221(var118, var117, 0)) {
                    var125++;
                }
                class34 var126 = new class34(var119, var121, class678.field9539, class180.field2025, var125, var123, class593.method3335(var124, class180.field2025, 27648, var123) - var120, var124, var117, var117, var118, var118, var122);
                class372.field5072.method3425(new class152(var126), false);
            }
        } else if (class474.field6828 == arg1) {
            int var127 = class626.field8849.method649(255);
            int var128 = class301.field3745 + (var127 >> 4 & 0x7);
            int var129 = (var127 & 0x7) + class411.field5523;
            int var130 = class626.field8849.method630(30426);
            int var131 = var130 >> 2;
            int var132 = var130 & 0x3;
            int var133 = class505.field7272[var131];
            int var134 = class626.field8849.method623(24);
            if (var134 == 65535) {
                var134 = -1;
            }
            class587.method3313((byte) 18, var131, var133, var132, var134, var129, class180.field2025, var128);
        } else if (class35.field352 == arg1) {
            int var135 = class626.field8849.method620((byte) 72);
            boolean var136 = (var135 & 0x80) != 0;
            int var137 = class301.field3745 + (var135 >> 3 & 0x7);
            int var138 = (var135 & 0x7) + class411.field5523;
            int var139 = class626.field8849.method657(false) + var137;
            int var140 = class626.field8849.method657(false) + var138;
            int var141 = class626.field8849.method676(-5);
            int var142 = class626.field8849.method643((byte) -77);
            int var143 = class626.field8849.method620((byte) -126) * 4;
            int var144 = class626.field8849.method620((byte) -128) * 4;
            int var145 = class626.field8849.method643((byte) -77);
            int var146 = class626.field8849.method643((byte) -77);
            int var147 = class626.field8849.method620((byte) 91);
            int var148 = class626.field8849.method643((byte) -77);
            if (var147 == 255) {
                var147 = -1;
            }
            if (var137 >= 0 && var138 >= 0 && var137 < class142.field1574 && class140.field1550 > var138 && var139 >= 0 && var140 >= 0 && var139 < class142.field1574 && var140 < class140.field1550 && var142 != 65535) {
                int var149 = var140 * 512 + 256;
                int var150 = var143 << 2;
                int var151 = var148 << 2;
                int var152 = var138 * 512 + 256;
                int var153 = var144 << 2;
                int var154 = var137 * 512 + 256;
                int var155 = var139 * 512 + 256;
                class618 var156 = new class618(var142, class180.field2025, class180.field2025, var154, var152, var150, class678.field9539 + var145, class678.field9539 + var146, var147, var151, var141, var153, var136);
                var156.method3450(var149, var155, class593.method3335(var149, class180.field2025, 27648, var155) - var153, class678.field9539 + var145, (byte) -88);
                class375.field5107.method3425(new class658(var156), false);
            }
        } else if (class364.field4889 == arg1) {
            int var157 = class626.field8849.method619((byte) -127);
            int var158 = class626.field8849.method620((byte) 101);
            int var159 = (var158 & 0x7) + class411.field5523;
            int var160 = class231.field2860 + var159;
            int var161 = (var158 >> 4 & 0x7) + class301.field3745;
            int var162 = class26.field245 + var161;
            class310 var163 = (class310) class200.field2354.method3669((long) (class180.field2025 << 28 | var160 << 14 | var162), -1);
            if (var163 != null) {
                for (class190 var164 = (class190) var163.field3833.method3434((byte) 2); var164 != null; var164 = (class190) var163.field3833.method3430(true)) {
                    if ((var157 & 0x7FFF) == var164.field2177) {
                        var164.method1922(74);
                        break;
                    }
                }
                if (var163.field3833.method3439((byte) 92)) {
                    var163.method1922(122);
                }
                if (var161 >= 0 && var159 >= 0 && class142.field1574 > var161 && class140.field1550 > var159) {
                    class443.method2566(var159, var161, arg0 - 2098956374, class180.field2025);
                }
            }
        } else if (class678.field9534 == arg1) {
            class626.field8849.method620((byte) -128);
            int var165 = class626.field8849.method620((byte) 37);
            int var166 = class301.field3745 + ((var165 & 0x71) >> 4);
            int var167 = (var165 & 0x7) + class411.field5523;
            int var168 = class626.field8849.method643((byte) -77);
            int var169 = class626.field8849.method620((byte) 109);
            int var170 = class626.field8849.method675(-128);
            String var171 = class626.field8849.method626(106);
            class97.method532(var167, var169, var168, class180.field2025, 2968, var171, var166, var170);
        } else if (class687.field9660 == arg1) {
            int var172 = class626.field8849.method620((byte) -28);
            int var173 = (var172 >> 4 & 0x7) + class301.field3745;
            int var174 = (var172 & 0x7) + class411.field5523;
            int var175 = class626.field8849.method643((byte) -77);
            if (var175 == 65535) {
                var175 = -1;
            }
            int var176 = class626.field8849.method620((byte) 115);
            int var177 = (var176 & 0xF5) >> 4;
            int var178 = var176 & 0x7;
            int var179 = class626.field8849.method620((byte) -127);
            int var180 = class626.field8849.method620((byte) 24);
            if (var173 >= 0 && var174 >= 0 && var173 < class142.field1574 && class140.field1550 > var174) {
                int var181 = var177 + 1;
                if (class362.field4859.field9517[0] >= (var173 - var181) && var173 + var181 >= class362.field4859.field9517[0] && class362.field4859.field9513[0] >= var174 - var181 && var174 + var181 >= class362.field4859.field9513[0]) {
                    class116.method679(var178, false, var179, var175, (var174 << 8) + (class180.field2025 << 24) + (var173 << 16) + var177, -121, var180);
                }
            }
        } else {
            class333.method1923(null, true, "T3 - " + arg1);
            class73.method394(0, false);
        }
    }
}
