import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class304 {

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "I")
    public static int field4828 = 0;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "I")
    public static int field4829 = -1;

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "Ljava/lang/String;")
    public static String field4830 = "M";

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "I")
    public static int field4833 = 0;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "[I")
    public static int[] field4826 = new int[99];

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "I")
    public static int field4827;

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "I")
    public static int field4832;

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "I")
    public static int field4834;

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "I")
    public static int field4835;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field4831;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V")
    public static void method2038(int arg0) {
        if (arg0 == 15) {
            field4831 = null;
            field4826 = null;
            field4830 = null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(III)V")
    public static final void method2039(int arg0, int arg1, int arg2) {
        class198.field3142 = true;
        class10.field158 = arg0;
        class19.field264 = arg1;
        class188.field2944 = arg2;
        class234.field3777 = -1;
        class24.field302 = -1;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)V")
    public static final void method2040(int arg0) {
        field4827++;
        if (class105.field1530 == 130) {
            int var1 = class175.field2763.method1218(98);
            int var2 = class247.field4014 + ((var1 & 0x7E) >> 4);
            int var3 = (var1 & 0x7) + class312.field5011;
            int var4 = class175.field2763.method1186((byte) -92);
            int var5 = class175.field2763.method1218(114);
            int var6 = class175.field2763.method1186((byte) -46);
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                int var7 = var3 * 128 + 64;
                int var8 = var2 * 128 + 64;
                class179 var9 = new class179(var4, class148.field2204, var8, var7, class52.method351(-127, var7, var8, class148.field2204) - var5, var6, class311.field4996);
                class181.field2857.method1540(new class97(var9), (byte) -59);
            }
        } else if (class105.field1530 == 9) {
            int var10 = class175.field2763.method1182((byte) -85);
            int var11 = (var10 & 0x7) + class312.field5011;
            int var12 = ((var10 & 0x7C) >> 4) + class247.field4014;
            int var13 = class175.field2763.method1200(128);
            int var14 = class175.field2763.method1172(true);
            int var15 = class175.field2763.method1200(128);
            if (var12 >= 0 && var11 >= 0 && var12 < 104 && var11 < 104 && class22.field289 != var14) {
                class105 var16 = new class105();
                var16.field1527 = var15;
                var16.field1528 = var13;
                if (class74.field1128[class148.field2204][var12][var11] == null) {
                    class74.field1128[class148.field2204][var12][var11] = new class220();
                }
                class74.field1128[class148.field2204][var12][var11].method1540(new class212(var16), (byte) -114);
                class273.method1900((byte) -97, var11, var12);
            }
        } else if (class105.field1530 == 163) {
            int var17 = class175.field2763.method1186((byte) -113);
            int var18 = class175.field2763.method1182((byte) -77);
            int var19 = var18 & 0x3;
            int var20 = var18 >> 2;
            int var21 = class293.field4706[var20];
            int var22 = class175.field2763.method1218(-82);
            int var23 = ((var22 & 0x7F) >> 4) + class247.field4014;
            int var24 = (var22 & 0x7) + class312.field5011;
            if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104) {
                class130.method832(0, var20, var19, -1, var24, var17, var21, class148.field2204, false, var23);
            }
        } else if (class105.field1530 == 45) {
            int var25 = class175.field2763.method1200(128);
            int var26 = class175.field2763.method1218(-124);
            int var27 = ((var26 & 0x7B) >> 4) + class247.field4014;
            int var28 = class312.field5011 + (var26 & 0x7);
            if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104) {
                class220 var29 = class74.field1128[class148.field2204][var27][var28];
                if (var29 != null) {
                    for (class212 var30 = (class212) var29.method1548(0); var30 != null; var30 = (class212) var29.method1549(arg0 ^ 0xFFFFFF95)) {
                        if ((var25 & 0x7FFF) == var30.field3303.field1527) {
                            var30.method1764(64);
                            break;
                        }
                    }
                    if (var29.method1548(0) == null) {
                        class74.field1128[class148.field2204][var27][var28] = null;
                    }
                    class273.method1900((byte) -97, var28, var27);
                }
            }
        } else if (class105.field1530 == 225) {
            int var31 = class175.field2763.method1218(115);
            int var32 = (var31 >> 4 & 0x7) + class247.field4014;
            int var33 = (var31 & 0x7) + class312.field5011;
            int var34 = class175.field2763.method1186((byte) -46);
            int var35 = class175.field2763.method1186((byte) -38);
            int var36 = class175.field2763.method1186((byte) -102);
            if (var32 >= 0 && var33 >= 0 && var32 < 104 && var33 < 104) {
                class220 var37 = class74.field1128[class148.field2204][var32][var33];
                if (var37 != null) {
                    for (class212 var38 = (class212) var37.method1548(~arg0); var38 != null; var38 = (class212) var37.method1549(104)) {
                        class105 var39 = var38.field3303;
                        if ((var34 & 0x7FFF) == var39.field1527 && var39.field1528 == var35) {
                            var39.field1528 = var36;
                            break;
                        }
                    }
                    class273.method1900((byte) -97, var33, var32);
                }
            }
        } else {
            if (class105.field1530 == 203) {
                byte var40 = class175.field2763.method1170(arg0 + 122);
                int var41 = class175.field2763.method1172(true);
                int var42 = class175.field2763.method1172(true);
                byte var43 = class175.field2763.method1215(arg0 + 129);
                byte var44 = class175.field2763.method1205(-91);
                int var45 = class175.field2763.method1182((byte) -125);
                int var46 = class247.field4014 + (var45 >> 4 & 0x7);
                int var47 = class312.field5011 + (var45 & 0x7);
                int var48 = class175.field2763.method1159((byte) -109);
                int var49 = class175.field2763.method1182((byte) -125);
                int var50 = var49 & 0x3;
                int var51 = var49 >> 2;
                int var52 = class175.field2763.method1200(128);
                byte var53 = class175.field2763.method1215(128);
                class220.method1545(var53, var42, (byte) -98, var47, var48, var51, var44, var46, var43, var41, var50, var40, var52);
            }
            if (class105.field1530 == 155) {
                int var54 = class175.field2763.method1218(-80);
                int var55 = class312.field5011 + (var54 & 0x7);
                int var56 = ((var54 & 0x73) >> 4) + class247.field4014;
                int var57 = class175.field2763.method1182((byte) -83);
                int var58 = var57 & 0x3;
                int var59 = var57 >> 2;
                int var60 = class293.field4706[var59];
                if (var56 >= 0 && var55 >= 0 && var56 < 104 && var55 < 104) {
                    class130.method832(0, var59, var58, -1, var55, -1, var60, class148.field2204, false, var56);
                }
            } else {
                if (arg0 != -1) {
                    field4833 = -67;
                }
                if (class105.field1530 == 183) {
                    int var61 = class175.field2763.method1218(-123);
                    int var62 = ((var61 & 0x79) >> 4) + class247.field4014;
                    int var63 = (var61 & 0x7) + class312.field5011;
                    int var64 = class175.field2763.method1186((byte) -99);
                    int var65 = class175.field2763.method1218(-48);
                    int var66 = var65 >> 4 & 0xF;
                    if (var64 == 65535) {
                        var64 = -1;
                    }
                    int var67 = var65 & 0x7;
                    int var68 = class175.field2763.method1218(91);
                    int var69 = class175.field2763.method1218(-45);
                    if (var62 >= 0 && var63 >= 0 && var62 < 104 && var63 < 104) {
                        int var70 = var66 + 1;
                        if (var62 - var70 <= class214.field3347.field3970[0] && class214.field3347.field3970[0] <= (var62 + var70) && (var63 - var70) <= class214.field3347.field3972[0] && class214.field3347.field3972[0] <= (var63 + var70) && class235.field3792 != 0 && var67 > 0 && class210.field3275 < 50 && var64 != -1) {
                            class235.field3794[class210.field3275] = var64;
                            class170.field2625[class210.field3275] = var67;
                            class46.field574[class210.field3275] = var68;
                            class112.field1627[class210.field3275] = null;
                            class200.field3154[class210.field3275] = (var62 << 16) + var66 + (var63 << 8);
                            class250.field4058[class210.field3275] = var69;
                            class210.field3275++;
                        }
                    }
                } else if (class105.field1530 == 13) {
                    int var71 = class175.field2763.method1218(105);
                    int var72 = ((var71 & 0x7E) >> 4) + class247.field4014;
                    int var73 = (var71 & 0x7) + class312.field5011;
                    int var74 = var72 + class175.field2763.method1215(128);
                    int var75 = var73 + class175.field2763.method1215(128);
                    int var76 = class175.field2763.method1193(-1);
                    int var77 = class175.field2763.method1186((byte) -109);
                    int var78 = class175.field2763.method1218(arg0 + 86) * 4;
                    int var79 = class175.field2763.method1218(83) * 4;
                    int var80 = class175.field2763.method1186((byte) -73);
                    int var81 = class175.field2763.method1186((byte) -69);
                    int var82 = class175.field2763.method1218(-115);
                    if (var82 == 255) {
                        var82 = -1;
                    }
                    int var83 = class175.field2763.method1218(66);
                    if (var72 >= 0 && var73 >= 0 && var72 < 104 && var73 < 104 && var74 >= 0 && var75 >= 0 && var74 < 104 && var75 < 104 && var77 != 65535) {
                        int var84 = var72 * 128 + 64;
                        int var85 = var75 * 128 + 64;
                        int var86 = var73 * 128 + 64;
                        int var87 = var74 * 128 + 64;
                        class142 var88 = new class142(var77, class148.field2204, var84, var86, class52.method351(-100, var86, var84, class148.field2204) - var78, var80 - -class311.field4996, class311.field4996 + var81, var82, var83, var76, var79);
                        var88.method927(class52.method351(-113, var85, var87, class148.field2204) - var79, var87, 0, var85, class311.field4996 + var80);
                        class108.field1576.method1540(new class211(var88), (byte) -86);
                    }
                } else if (class105.field1530 == 246) {
                    int var89 = class175.field2763.method1218(arg0 - 121);
                    int var90 = (var89 & 0xF) + class312.field5011 * 2;
                    int var91 = ((var89 & 0xFA) >> 4) + class247.field4014 * 2;
                    int var92 = class175.field2763.method1215(arg0 ^ 0xFFFFFF7F) + var91;
                    int var93 = var90 + class175.field2763.method1215(arg0 + 129);
                    int var94 = class175.field2763.method1193(arg0);
                    int var95 = class175.field2763.method1186((byte) -38);
                    int var96 = class175.field2763.method1218(-76) * 4;
                    int var97 = class175.field2763.method1218(105) * 4;
                    int var98 = class175.field2763.method1186((byte) -49);
                    int var99 = class175.field2763.method1186((byte) -100);
                    int var100 = class175.field2763.method1218(arg0 - 31);
                    if (var100 == 255) {
                        var100 = -1;
                    }
                    int var101 = class175.field2763.method1218(arg0 + 95);
                    if (var91 >= 0 && var90 >= 0 && var91 < 208 && var90 < 208 && var92 >= 0 && var93 >= 0 && var92 < 208 && var93 < 208 && var95 != 65535) {
                        int var102 = var90 * 64;
                        int var103 = var93 * 64;
                        int var104 = var91 * 64;
                        class142 var105 = new class142(var95, class148.field2204, var104, var102, class52.method351(-99, var102, var104, class148.field2204) - var96, var98 - -class311.field4996, class311.field4996 + var99, var100, var101, var94, var97);
                        int var106 = var92 * 64;
                        var105.method927(class52.method351(-123, var103, var106, class148.field2204) - var97, var106, arg0 + 1, var103, class311.field4996 + var98);
                        class108.field1576.method1540(new class211(var105), (byte) -59);
                    }
                } else if (class105.field1530 == 175) {
                    int var107 = class175.field2763.method1189(-113);
                    int var108 = class175.field2763.method1211(126);
                    int var109 = class312.field5011 + (var108 & 0x7);
                    int var110 = ((var108 & 0x7F) >> 4) + class247.field4014;
                    int var111 = class175.field2763.method1200(128);
                    if (var110 >= 0 && var109 >= 0 && var110 < 104 && var109 < 104) {
                        class105 var112 = new class105();
                        var112.field1528 = var107;
                        var112.field1527 = var111;
                        if (class74.field1128[class148.field2204][var110][var109] == null) {
                            class74.field1128[class148.field2204][var110][var109] = new class220();
                        }
                        class74.field1128[class148.field2204][var110][var109].method1540(new class212(var112), (byte) -58);
                        class273.method1900((byte) -97, var109, var110);
                    }
                } else if (class105.field1530 == 185) {
                    int var113 = class175.field2763.method1218(102);
                    int var114 = ((var113 & 0xF4) >> 4) + class247.field4014 * 2;
                    int var115 = (var113 & 0xF) + class312.field5011 * 2;
                    int var116 = var114 + class175.field2763.method1215(128);
                    int var117 = class175.field2763.method1215(128) + var115;
                    int var118 = class175.field2763.method1193(-1);
                    int var119 = class175.field2763.method1193(arg0);
                    int var120 = class175.field2763.method1186((byte) -76);
                    int var121 = class175.field2763.method1215(128);
                    int var122 = class175.field2763.method1218(-118) * 4;
                    int var123 = class175.field2763.method1186((byte) -115);
                    int var124 = class175.field2763.method1186((byte) -39);
                    int var125 = class175.field2763.method1218(99);
                    if (var125 == 255) {
                        var125 = -1;
                    }
                    int var126 = class175.field2763.method1218(72);
                    if (var114 >= 0 && var115 >= 0 && var114 < 208 && var115 < 208 && var116 >= 0 && var117 >= 0 && var116 < 208 && var117 < 208 && var120 != 65535) {
                        int var127 = var115 * 64;
                        int var128 = var114 * 64;
                        int var129 = var116 * 64;
                        if (var118 != 0) {
                            class243 var132;
                            int var133;
                            if (var118 >= 0) {
                                int var130 = var118 - 1;
                                int var131 = var130 & 0x7FF;
                                var132 = class191.field3045[var131];
                                var133 = var130 >> 11 & 0xF;
                            } else {
                                int var134 = -var118 - 1;
                                int var135 = var134 & 0x7FF;
                                var133 = var134 >> 11 & 0xF;
                                if (class22.field289 == var135) {
                                    var132 = class214.field3347;
                                } else {
                                    var132 = class35.field409[var135];
                                }
                            }
                            if (var132 != null) {
                                class163 var136 = var132.method1725(arg0 - 124);
                                if (var136.field2500 != null && var136.field2500[var133] != null) {
                                    var121 -= var136.field2500[var133][1];
                                    int var137 = var136.field2500[var133][0];
                                    int var138 = var136.field2500[var133][2];
                                    int var139 = class221.field3468[var132.field3913];
                                    int var140 = class221.field3465[var132.field3913];
                                    int var141 = var137 * var140 + var138 * var139 >> 16;
                                    int var142 = var138 * var140 - (var137 * var139) >> 16;
                                    var127 += var142;
                                    var128 += var141;
                                }
                            }
                        }
                        int var144 = var117 * 64;
                        class142 var145 = new class142(var120, class148.field2204, var128, var127, class52.method351(-121, var127, var128, class148.field2204) - var121, var123 - -class311.field4996, class311.field4996 + var124, var125, var126, var119, var122);
                        var145.method927(class52.method351(-103, var144, var129, class148.field2204) - var122, var129, 0, var144, class311.field4996 + var123);
                        class108.field1576.method1540(new class211(var145), (byte) -71);
                    }
                } else if (class105.field1530 == 208) {
                    int var146 = class175.field2763.method1182((byte) -80);
                    int var147 = var146 & 0x3;
                    int var148 = var146 >> 2;
                    int var149 = class293.field4706[var148];
                    int var150 = class175.field2763.method1189(-127);
                    int var151 = class175.field2763.method1218(110);
                    int var152 = (var151 & 0x7) + class312.field5011;
                    if (var150 == 65535) {
                        var150 = -1;
                    }
                    int var153 = class247.field4014 + (var151 >> 4 & 0x7);
                    class226.method1596(var153, var149, -30, var148, var152, var147, class148.field2204, var150);
                } else if (class105.field1530 == 147) {
                    int var154 = class175.field2763.method1186((byte) -78);
                    int var155 = class175.field2763.method1218(-24);
                    class128.method822(var154, (byte) 124).method1343((byte) -56, var155);
                }
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(III)V")
    public static final void method2041(int arg0, int arg1, int arg2) {
        class62.field895 = new class216(arg2);
        class281.field4572 = new class216(arg0);
        int var3 = 51 / ((21 - arg1) / 41);
        field4832++;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field4826[var1] = var0 / 4;
        }
    }
}
