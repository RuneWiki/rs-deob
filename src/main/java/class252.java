import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class252 extends class189 {

    @OriginalMember(owner = "client!he", name = "A", descriptor = "Lia;")
    public class419 field3877;

    @OriginalMember(owner = "client!he", name = "v", descriptor = "Ls;")
    public static class186 field3872 = new class186(87, -2);

    @OriginalMember(owner = "client!he", name = "y", descriptor = "[I")
    public static int[] field3875 = new int[500];

    @OriginalMember(owner = "client!he", name = "w", descriptor = "I")
    public static int field3873;

    @OriginalMember(owner = "client!he", name = "x", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!he", name = "z", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(II)V")
    public static final void method1626(int arg0, int arg1) {
        if (class68.field1382 == 1) {
            class462.field6867 = arg0;
        } else if (class68.field1382 == 2 || class68.field1382 == 3) {
            class524.field7623 = arg0;
        }
        int var2 = -34 % ((51 - arg1) / 57);
        field3876++;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
    public static void method1627(int arg0) {
        field3875 = null;
        field3872 = null;
        if (arg0 != 11885) {
            method1629(null, (byte) -60);
        }
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(II)Z")
    public static final boolean method1628(int arg0, int arg1) {
        if (arg0 < 26) {
            return true;
        } else {
            field3874++;
            return arg1 == 2 || arg1 == 4 || arg1 == 5;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lmo;B)V")
    public static final void method1629(class531 arg0, byte arg1) {
        field3873++;
        if (class397.field6027 == arg0) {
            int var2 = class219.field3446.method1858(-3256);
            int var3 = (var2 >> 4 & 0x7) + class311.field4709;
            int var4 = (var2 & 0x7) + class237.field3667;
            int var5 = class219.field3446.method1841((byte) 26);
            int var6 = class219.field3446.method1858(-3256);
            int var7 = class219.field3446.method1841((byte) -119);
            int var8 = class219.field3446.method1858(-3256);
            if (var3 >= 0 && var4 >= 0 && class339.field5099 > var3 && class484.field7129 > var4) {
                int var9 = var3 * 128 + 64;
                int var10 = var4 * 128 + 64;
                int var11 = class445.field6627;
                if (var11 < 3 && class304.method1941(var4, var3, 1)) {
                    var11++;
                }
                class419 var12 = new class419(var5, var7, class62.field1268, class445.field6627, var11, var9, class483.method2899(class445.field6627, var9, var10, false) - var6, var10, var3, var3, var4, var4, var8);
                class244.field3781.method1885(false, new class252(var12));
            }
        } else if (class4.field78 == arg0) {
            int var13 = class219.field3446.method1841((byte) 42);
            int var14 = class219.field3446.method1842(83);
            int var15 = (var14 & 0x7) + class237.field3667;
            int var16 = class212.field3378 + var15;
            int var17 = (var14 >> 4 & 0x7) + class311.field4709;
            int var18 = class496.field7292 + var17;
            int var19 = class219.field3446.method1876((byte) -110);
            int var20 = class219.field3446.method1876((byte) -125);
            if (class174.field2806 != var19) {
                boolean var21 = var17 >= 0 && var15 >= 0 && class339.field5099 > var17 && var15 < class484.field7129;
                if (var21 || class243.method1587(class506.field7382, false)) {
                    class260.method1670(var16, class445.field6627, new class506(var20, var13), var18, 0);
                    if (var21) {
                        class502.method3023(class445.field6627, var15, var17, -29969);
                    }
                }
            }
        } else {
            if (arg1 < 26) {
                method1629(null, (byte) -76);
            }
            if (class496.field7291 == arg0) {
                int var22 = class219.field3446.method1858(-3256);
                int var23 = (var22 & 0x7) + class237.field3667;
                int var24 = class212.field3378 + var23;
                int var25 = ((var22 & 0x71) >> 4) + class311.field4709;
                int var26 = var25 + class496.field7292;
                int var27 = class219.field3446.method1841((byte) 22);
                class354 var28 = (class354) class169.field2757.method1622((long) (class445.field6627 << 28 | var24 << 14 | var26), 52);
                if (var28 != null) {
                    for (class506 var29 = (class506) var28.field5220.method1892(95); var29 != null; var29 = (class506) var28.field5220.method1893((byte) -2)) {
                        if ((var27 & 0x7FFF) == var29.field7376) {
                            var29.method1676(true);
                            break;
                        }
                    }
                    if (var28.field5220.method1889((byte) -126)) {
                        var28.method1676(true);
                    }
                    if (var25 >= 0 && var23 >= 0 && class339.field5099 > var25 && class484.field7129 > var23) {
                        class502.method3023(class445.field6627, var23, var25, -29969);
                    }
                }
            } else if (class384.field5608 == arg0) {
                class219.field3446.method1858(-3256);
                int var30 = class219.field3446.method1858(-3256);
                int var31 = class311.field4709 + (var30 >> 4 & 0x7);
                int var32 = (var30 & 0x7) + class237.field3667;
                int var33 = class219.field3446.method1841((byte) 69);
                int var34 = class219.field3446.method1858(-3256);
                int var35 = class219.field3446.method1863(-118);
                String var36 = class219.field3446.method1834(-17823);
                class129.method1008(var36, var32, var33, var31, 10, var35, class445.field6627, var34);
            } else if (class421.field6344 == arg0) {
                int var37 = class219.field3446.method1858(-3256);
                boolean var38 = (var37 & 0x80) != 0;
                int var39 = ((var37 & 0x3D) >> 3) + class311.field4709;
                int var40 = (var37 & 0x7) + class237.field3667;
                int var41 = class219.field3446.method1816(true) + var39;
                int var42 = class219.field3446.method1816(true) + var40;
                int var43 = class219.field3446.method1848((byte) 114);
                int var44 = class219.field3446.method1841((byte) -10);
                int var45 = class219.field3446.method1858(-3256) * 4;
                int var46 = class219.field3446.method1858(-3256) * 4;
                int var47 = class219.field3446.method1841((byte) -126);
                int var48 = class219.field3446.method1841((byte) -126);
                int var49 = class219.field3446.method1858(-3256);
                int var50 = class219.field3446.method1858(-3256);
                if (var49 == 255) {
                    var49 = -1;
                }
                if (var39 >= 0 && var40 >= 0 && class339.field5099 > var39 && class484.field7129 > var40 && var41 >= 0 && var42 >= 0 && var41 < class339.field5099 && var42 < class484.field7129 && var44 != 65535) {
                    int var51 = var41 * 128 + 64;
                    int var52 = var39 * 128 + 64;
                    int var53 = var40 * 128 + 64;
                    int var54 = var45 << 0;
                    int var55 = var46 << 0;
                    int var56 = var42 * 128 + 64;
                    class1 var57 = new class1(var44, class445.field6627, var52, var53, var54, var47 + class62.field1268, class62.field1268 + var48, var49, var50, var43, var55, var38);
                    var57.method1(var51, var56, class483.method2899(class445.field6627, var51, var56, false) - var55, class62.field1268 + var47, -4);
                    class450.field6685.method1885(false, new class398(var57));
                }
            } else if (class71.field1431 == arg0) {
                int var58 = class219.field3446.method1842(-37);
                int var59 = (var58 & 0x7) + class237.field3667;
                int var60 = class212.field3378 + var59;
                int var61 = (var58 >> 4 & 0x7) + class311.field4709;
                int var62 = class496.field7292 + var61;
                int var63 = class219.field3446.method1854(-11428);
                int var64 = class219.field3446.method1876((byte) -113);
                boolean var65 = var61 >= 0 && var59 >= 0 && class339.field5099 > var61 && var59 < class484.field7129;
                if (var65 || class243.method1587(class506.field7382, false)) {
                    class260.method1670(var60, class445.field6627, new class506(var63, var64), var62, 0);
                    if (var65) {
                        class502.method3023(class445.field6627, var59, var61, -29969);
                    }
                }
            } else if (class298.field4517 == arg0) {
                int var66 = class219.field3446.method1858(-3256);
                int var67 = class311.field4709 + ((var66 & 0x7B) >> 4);
                int var68 = class237.field3667 + (var66 & 0x7);
                int var69 = class219.field3446.method1842(-41);
                int var70 = var69 >> 2;
                int var71 = var69 & 0x3;
                int var72 = class87.field1784[var70];
                if (class243.method1587(class506.field7382, false) || var67 >= 0 && var68 >= 0 && var67 < class339.field5099 && class484.field7129 > var68) {
                    class384.method2359(var72, var70, -1, var68, (byte) -125, 0, -1, var71, class445.field6627, var67);
                }
            } else if (class329.field4993 == arg0) {
                int var73 = class219.field3446.method1858(-3256);
                int var74 = class237.field3667 + (var73 & 0x7);
                int var75 = var74 + class212.field3378;
                int var76 = (var73 >> 4 & 0x7) + class311.field4709;
                int var77 = class496.field7292 + var76;
                int var78 = class219.field3446.method1841((byte) -123);
                int var79 = class219.field3446.method1841((byte) 43);
                int var80 = class219.field3446.method1841((byte) -121);
                if (class169.field2757 != null) {
                    class354 var81 = (class354) class169.field2757.method1622((long) (var77 | class445.field6627 << 28 | var75 << 14), -124);
                    if (var81 != null) {
                        for (class506 var82 = (class506) var81.field5220.method1892(97); var82 != null; var82 = (class506) var81.field5220.method1893((byte) -2)) {
                            if ((var78 & 0x7FFF) == var82.field7376 && var82.field7375 == var79) {
                                var82.method1676(true);
                                var82.field7375 = var80;
                                class260.method1670(var75, class445.field6627, var82, var77, 0);
                                break;
                            }
                        }
                        if (var76 >= 0 && var74 >= 0 && var76 < class339.field5099 && class484.field7129 > var74) {
                            class502.method3023(class445.field6627, var74, var76, -29969);
                        }
                    }
                }
            } else if (class247.field3808 == arg0) {
                int var83 = class219.field3446.method1841((byte) -123);
                int var84 = class219.field3446.method1858(-3256);
                class123.field2142.method1530((byte) -101, var83).method1959(0, var84);
            } else if (class366.field5372 == arg0) {
                int var85 = class219.field3446.method1858(-3256);
                int var86 = class311.field4709 + ((var85 & 0x77) >> 4);
                int var87 = class237.field3667 + (var85 & 0x7);
                int var88 = class219.field3446.method1841((byte) 81);
                if (var88 == 65535) {
                    var88 = -1;
                }
                int var89 = class219.field3446.method1858(-3256);
                int var90 = var89 >> 4 & 0xF;
                int var91 = var89 & 0x7;
                int var92 = class219.field3446.method1858(-3256);
                int var93 = class219.field3446.method1858(-3256);
                if (var86 >= 0 && var87 >= 0 && var86 < class339.field5099 && var87 < class484.field7129) {
                    int var94 = var90 + 1;
                    if (class15.field266.field7866[0] >= var86 - var94 && class15.field266.field7866[0] <= (var86 + var94) && class15.field266.field7870[0] >= var87 - var94 && var87 + var94 >= class15.field266.field7870[0]) {
                        class456.method2719(var93, var92, var88, true, var91, (class445.field6627 << 24) + ((var86 << 16) + (var87 << 8)) + var90);
                    }
                }
            } else if (class142.field2352 == arg0) {
                int var95 = class219.field3446.method1833(128);
                byte var96 = class219.field3446.method1837((byte) 104);
                byte var97 = class219.field3446.method1831(255);
                int var98 = class219.field3446.method1827(124);
                int var99 = class219.field3446.method1854(-11428);
                byte var100 = class219.field3446.method1832(-29627);
                int var101 = class219.field3446.method1876((byte) -100);
                int var102 = class219.field3446.method1858(-3256);
                int var103 = ((var102 & 0x7B) >> 4) + class311.field4709;
                int var104 = (var102 & 0x7) + class237.field3667;
                byte var105 = class219.field3446.method1831(255);
                int var106 = class219.field3446.method1858(-3256);
                int var107 = var106 >> 2;
                int var108 = var106 & 0x3;
                if (!class262.field4006.method421()) {
                    class137.method1035(var100, var95, class445.field6627, var104, var96, 65280, var98, var103, var101, var97, var99, var107, var108, var105);
                }
            } else if (class483.field7120 == arg0) {
                int var109 = class219.field3446.method1858(-3256);
                int var110 = ((var109 & 0xFE) >> 4) + class311.field4709 * 2;
                int var111 = class237.field3667 * 2 + (var109 & 0xF);
                boolean var112 = class219.field3446.method1858(-3256) != 0;
                int var113 = class219.field3446.method1816(true) + var110;
                int var114 = var111 + class219.field3446.method1816(true);
                int var115 = class219.field3446.method1848((byte) 114);
                int var116 = class219.field3446.method1841((byte) -126);
                int var117 = class219.field3446.method1858(-3256) * 4;
                int var118 = class219.field3446.method1858(-3256) * 4;
                int var119 = class219.field3446.method1841((byte) -124);
                int var120 = class219.field3446.method1841((byte) -128);
                int var121 = class219.field3446.method1858(-3256);
                int var122 = class219.field3446.method1858(-3256);
                if (var121 == 255) {
                    var121 = -1;
                }
                if (var110 >= 0 && var111 >= 0 && class339.field5099 * 2 > var110 && var111 < class339.field5099 * 2 && var113 >= 0 && var114 >= 0 && var113 < (class484.field7129 * 2) && class484.field7129 * 2 > var114 && var116 != 65535) {
                    int var123 = var114 * 64;
                    int var124 = var110 * 64;
                    int var125 = var111 * 64;
                    int var126 = var113 * 64;
                    int var127 = var118 << 0;
                    int var128 = var117 << 0;
                    class1 var129 = new class1(var116, class445.field6627, var124, var125, var128, class62.field1268 + var119, class62.field1268 + var120, var121, var122, var115, var127, var112);
                    var129.method1(var126, var123, class483.method2899(class445.field6627, var126, var123, false) - var127, var119 - -class62.field1268, -4);
                    class450.field6685.method1885(false, new class398(var129));
                }
            } else if (class499.field7321 == arg0) {
                int var130 = class219.field3446.method1858(-3256);
                int var131 = (var130 >> 4 & 0xF) + class311.field4709 * 2;
                int var132 = (var130 & 0xF) + class237.field3667 * 2;
                boolean var133 = class219.field3446.method1858(-3256) != 0;
                int var134 = class219.field3446.method1816(true) + var131;
                int var135 = var132 + class219.field3446.method1816(true);
                int var136 = class219.field3446.method1848((byte) 113);
                int var137 = class219.field3446.method1848((byte) 107);
                int var138 = class219.field3446.method1841((byte) 95);
                byte var139 = class219.field3446.method1816(true);
                int var140 = class219.field3446.method1858(-3256) * 4;
                int var141 = class219.field3446.method1841((byte) -118);
                int var142 = class219.field3446.method1841((byte) -122);
                int var143 = class219.field3446.method1858(-3256);
                int var144 = class219.field3446.method1858(-3256);
                if (var143 == 255) {
                    var143 = -1;
                }
                if (var131 >= 0 && var132 >= 0 && var131 < (class339.field5099 * 2) && var132 < (class339.field5099 * 2) && var134 >= 0 && var135 >= 0 && class484.field7129 * 2 > var134 && class484.field7129 * 2 > var135 && var138 != 65535) {
                    int var145 = var140 << 0;
                    int var146 = var139 << 0;
                    int var147 = var134 * 64;
                    int var148 = var132 * 64;
                    int var149 = var135 * 64;
                    int var150 = var131 * 64;
                    if (var136 != 0) {
                        class535 var151 = null;
                        int var153;
                        if (var136 >= 0) {
                            int var152 = var136 - 1;
                            var153 = (var152 & 0x7E83) >> 11;
                            int var154 = var152 & 0x7FF;
                            class435 var155 = (class435) class209.field3337.method1622((long) var154, 65);
                            if (var155 != null) {
                                var151 = var155.field6471;
                            }
                        } else {
                            int var156 = -var136 - 1;
                            var153 = (var156 & 0x7E79) >> 11;
                            int var157 = var156 & 0x7FF;
                            if (class174.field2806 == var157) {
                                var151 = class15.field266;
                            } else {
                                var151 = class73.field1444[var157];
                            }
                        }
                        if (var151 != null) {
                            class166 var158 = var151.method3169((byte) 23);
                            if (var158.field2642 != null && var158.field2642[var153] != null) {
                                int var159 = var158.field2642[var153][0];
                                int var160 = var158.field2642[var153][2];
                                int var161 = var151.field7814.method3100((byte) -119);
                                int var162 = class407.field6169[var161];
                                int var163 = class407.field6168[var161];
                                int var164 = var160 * var162 + (var159 * var163) >> 15;
                                int var165 = var160 * var163 - var159 * var162 >> 15;
                                var150 += var164;
                                var148 += var165;
                                var146 -= var158.field2642[var153][1];
                            }
                        }
                    }
                    class1 var167 = new class1(var138, class445.field6627, var150, var148, var146, var141 + class62.field1268, var142 - -class62.field1268, var143, var144, var137, var145, var133);
                    var167.method1(var147, var149, class483.method2899(class445.field6627, var147, var149, false) - var145, class62.field1268 + var141, -4);
                    class450.field6685.method1885(false, new class398(var167));
                }
            } else if (class146.field2453 == arg0) {
                int var168 = class219.field3446.method1842(-99);
                int var169 = ((var168 & 0x75) >> 4) + class311.field4709;
                int var170 = (var168 & 0x7) + class237.field3667;
                int var171 = class219.field3446.method1839(121);
                int var172 = var171 >> 2;
                int var173 = var171 & 0x3;
                int var174 = class87.field1784[var172];
                int var175 = class219.field3446.method1841((byte) -123);
                if (var175 == 65535) {
                    var175 = -1;
                }
                class492.method2970(var172, var174, var169, class445.field6627, var170, var175, var173, 32295);
            } else if (class275.field4169 == arg0) {
                int var176 = class219.field3446.method1859(255);
                int var177 = class311.field4709 + ((var176 & 0x7C) >> 4);
                int var178 = class237.field3667 + (var176 & 0x7);
                int var179 = class219.field3446.method1841((byte) -120);
                int var180 = class219.field3446.method1842(-102);
                int var181 = var180 >> 2;
                int var182 = var180 & 0x3;
                int var183 = class87.field1784[var181];
                if (class243.method1587(class506.field7382, false) || var177 >= 0 && var178 >= 0 && var177 < class339.field5099 && var178 < class484.field7129) {
                    class384.method2359(var183, var181, -1, var178, (byte) -125, 0, var179, var182, class445.field6627, var177);
                }
            } else {
                class486.method2913("T3 - " + arg0, null, (byte) -104);
                class391.method2414(false, 5424);
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Lia;)V")
    public class252(class419 arg0) {
        this.field3877 = arg0;
    }
}
