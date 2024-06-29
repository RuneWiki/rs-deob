import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class276 {

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "Lgd;")
    public static class170 field4257 = new class170(8);

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field4259 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!gl", name = "i", descriptor = "[[B")
    public static byte[][] field4261 = new byte[50][];

    @OriginalMember(owner = "client!gl", name = "j", descriptor = "I")
    public static int field4262 = 0;

    @OriginalMember(owner = "client!gl", name = "k", descriptor = "I")
    public static int field4263 = -1;

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "Lpg;")
    public static class320 field4260 = new class320(50);

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "I")
    public static int field4253;

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "I")
    public static int field4254;

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "I")
    public static int field4255;

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "I")
    public static int field4256;

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!gl", name = "l", descriptor = "I")
    public static int field4264;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IZ)V", line = 6)
    public static final void method1890(int arg0, boolean arg1) {
        field4256++;
        class338 var2 = class195.method1391(8, (byte) -92, arg0);
        var2.method2347(arg1);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V", line = 31)
    public static final void method1891(int arg0) {
        field4254++;
        if (class342.field5333 == 60) {
            int var150 = class10.field132.method1180(arg0 + 24728);
            int var151 = class10.field132.method1172(false);
            int var152 = class90.field1442 + (var151 & 0x7);
            int var153 = class203.field3043 + ((var151 & 0x78) >> 4);
            if (var153 >= 0 && var152 >= 0 && var153 < 104 && var152 < 104) {
                class87 var154 = class280.field4315[class205.field3101][var153][var152];
                if (var154 != null) {
                    for (class84 var155 = (class84) var154.method636(-1); var155 != null; var155 = (class84) var154.method638(55)) {
                        if ((var150 & 0x7FFF) == var155.field1308.field1456) {
                            var155.method403(arg0 ^ 0xFFFF9FE9);
                            break;
                        }
                    }
                    if (var154.method636(-1) == null) {
                        class280.field4315[class205.field3101][var153][var152] = null;
                    }
                    method1893(var152, var153, false);
                }
            }
        } else if (class342.field5333 == 120) {
            int var1 = class10.field132.method1178(0);
            int var2 = (var1 >> 4 & 0x7) + class203.field3043;
            int var3 = (var1 & 0x7) + class90.field1442;
            int var4 = class10.field132.method1151(-117);
            int var5 = class10.field132.method1178(0);
            int var6 = class10.field132.method1151(-102);
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                int var7 = var2 * 128 + 64;
                int var8 = var3 * 128 + 64;
                class158 var9 = new class158(var4, class205.field3101, var7, var8, class320.method2181(var7, var8, arg0 ^ 0x600A, class205.field3101) - var5, var6, class227.field3618);
                class89.field1430.method632(-95, new class115(var9));
            }
        } else if (class342.field5333 == 153) {
            int var10 = class10.field132.method1178(0);
            int var11 = ((var10 & 0x74) >> 4) + class203.field3043;
            int var12 = (var10 & 0x7) + class90.field1442;
            int var13 = class10.field132.method1143(arg0 + 24700) + var11;
            int var14 = class10.field132.method1143(arg0 ^ 0x6044) + var12;
            int var15 = class10.field132.method1166(52);
            int var16 = class10.field132.method1151(-94);
            int var17 = class10.field132.method1178(arg0 + 24600) * 4;
            int var18 = class10.field132.method1178(0) * 4;
            int var19 = class10.field132.method1151(-69);
            int var20 = class10.field132.method1151(-79);
            int var21 = class10.field132.method1178(0);
            int var22 = class10.field132.method1178(0);
            if (var21 == 255) {
                var21 = -1;
            }
            if (var11 >= 0 && var12 >= 0 && var11 < 104 && var12 < 104 && var13 >= 0 && var14 >= 0 && var13 < 104 && var14 < 104 && var16 != 65535) {
                int var23 = var11 * 128 + 64;
                int var24 = var13 * 128 + 64;
                int var25 = var12 * 128 + 64;
                int var26 = var14 * 128 + 64;
                class10 var27 = new class10(var16, class205.field3101, var23, var25, class320.method2181(var23, var25, -104, class205.field3101) - var17, class227.field3618 + var19, class227.field3618 + var20, var21, var22, var15, var18);
                var27.method79(var19 + class227.field3618, var24, class320.method2181(var24, var26, -44, class205.field3101) - var18, var26, (byte) 89);
                class265.field4120.method632(-59, new class272(var27));
            }
        } else if (class342.field5333 == 91) {
            int var141 = class10.field132.method1178(0);
            int var142 = class90.field1442 + (var141 & 0x7);
            int var143 = (var141 >> 4 & 0x7) + class203.field3043;
            int var144 = class10.field132.method1151(-94);
            int var145 = class10.field132.method1151(-57);
            int var146 = class10.field132.method1151(-102);
            if (var143 >= 0 && var142 >= 0 && var143 < 104 && var142 < 104) {
                class87 var147 = class280.field4315[class205.field3101][var143][var142];
                if (var147 != null) {
                    for (class84 var148 = (class84) var147.method636(-1); var148 != null; var148 = (class84) var147.method638(83)) {
                        class91 var149 = var148.field1308;
                        if ((var144 & 0x7FFF) == var149.field1456 && var149.field1454 == var145) {
                            var149.field1454 = var146;
                            break;
                        }
                    }
                    method1893(var142, var143, false);
                }
            }
        } else {
            if (arg0 != -24600) {
                field4262 = 4;
            }
            if (class342.field5333 == 43) {
                int var28 = class10.field132.method1151(-62);
                int var29 = class10.field132.method1153(arg0 + 40273);
                int var30 = class203.field3043 + (var29 >> 4 & 0x7);
                int var31 = class90.field1442 + (var29 & 0x7);
                int var32 = class10.field132.method1172(false);
                int var33 = var32 & 0x3;
                int var34 = var32 >> 2;
                int var35 = class177.field2683[var34];
                if (var30 >= 0 && var31 >= 0 && var30 < 104 && var31 < 104) {
                    class313.method2121(var31, 0, var34, var35, 0, class205.field3101, var30, -1, var28, var33);
                }
            } else if (class342.field5333 == 93) {
                int var36 = class10.field132.method1151(-94);
                int var37 = class10.field132.method1178(0);
                class201.method1431(-96, var36).method614(var37, arg0 + 24599);
            } else if (class342.field5333 == 37) {
                int var38 = class10.field132.method1178(0);
                int var39 = class203.field3043 * 2 + ((var38 & 0xFF) >> 4);
                int var40 = class90.field1442 * 2 + (var38 & 0xF);
                int var41 = class10.field132.method1143(-122) + var39;
                int var42 = var40 + class10.field132.method1143(-98);
                int var43 = class10.field132.method1166(52);
                int var44 = class10.field132.method1151(arg0 + 24546);
                int var45 = class10.field132.method1178(0) * 4;
                int var46 = class10.field132.method1178(arg0 ^ 0xFFFF9FE8) * 4;
                int var47 = class10.field132.method1151(-125);
                int var48 = class10.field132.method1151(-61);
                int var49 = class10.field132.method1178(0);
                int var50 = class10.field132.method1178(0);
                if (var49 == 255) {
                    var49 = -1;
                }
                if (var39 >= 0 && var40 >= 0 && var39 < 208 && var40 < 208 && var41 >= 0 && var42 >= 0 && var41 < 208 && var42 < 208 && var44 != 65535) {
                    int var51 = var42 * 64;
                    int var52 = var40 * 64;
                    int var53 = var41 * 64;
                    int var54 = var39 * 64;
                    class10 var55 = new class10(var44, class205.field3101, var54, var52, class320.method2181(var54, var52, -108, class205.field3101) - var45, class227.field3618 + var47, class227.field3618 + var48, var49, var50, var43, var46);
                    var55.method79(class227.field3618 + var47, var53, class320.method2181(var53, var51, -91, class205.field3101) - var46, var51, (byte) 89);
                    class265.field4120.method632(arg0 + 24488, new class272(var55));
                }
            } else if (class342.field5333 == 220) {
                int var135 = class10.field132.method1128((byte) -92);
                int var136 = class10.field132.method1172(false);
                int var137 = class90.field1442 + (var136 & 0x7);
                int var138 = (var136 >> 4 & 0x7) + class203.field3043;
                int var139 = class10.field132.method1151(-58);
                if (var138 >= 0 && var137 >= 0 && var138 < 104 && var137 < 104) {
                    class91 var140 = new class91();
                    var140.field1454 = var135;
                    var140.field1456 = var139;
                    if (class280.field4315[class205.field3101][var138][var137] == null) {
                        class280.field4315[class205.field3101][var138][var137] = new class87();
                    }
                    class280.field4315[class205.field3101][var138][var137].method632(arg0 + 24533, new class84(var140));
                    method1893(var137, var138, false);
                }
            } else if (class342.field5333 == 79) {
                int var56 = class10.field132.method1178(0);
                int var57 = (var56 >> 4 & 0xF) + class203.field3043 * 2;
                int var58 = (var56 & 0xF) + class90.field1442 * 2;
                int var59 = var57 + class10.field132.method1143(-85);
                int var60 = var58 + class10.field132.method1143(-116);
                int var61 = class10.field132.method1166(52);
                int var62 = class10.field132.method1166(52);
                int var63 = class10.field132.method1151(-121);
                int var64 = class10.field132.method1143(97);
                int var65 = class10.field132.method1178(0) * 4;
                int var66 = class10.field132.method1151(-77);
                int var67 = class10.field132.method1151(-108);
                int var68 = class10.field132.method1178(arg0 ^ 0xFFFF9FE8);
                if (var68 == 255) {
                    var68 = -1;
                }
                int var69 = class10.field132.method1178(arg0 ^ 0xFFFF9FE8);
                if (var57 >= 0 && var58 >= 0 && var57 < 208 && var58 < 208 && var59 >= 0 && var60 >= 0 && var59 < 208 && var60 < 208 && var63 != 65535) {
                    int var70 = var58 * 64;
                    int var71 = var59 * 64;
                    int var72 = var57 * 64;
                    if (var61 != 0) {
                        int var74;
                        class123 var76;
                        if (var61 < 0) {
                            int var73 = -var61 - 1;
                            var74 = (var73 & 0x7BDD) >> 11;
                            int var75 = var73 & 0x7FF;
                            if (class120.field1837 == var75) {
                                var76 = class98.field1566;
                            } else {
                                var76 = class254.field3992[var75];
                            }
                        } else {
                            int var77 = var61 - 1;
                            int var78 = var77 & 0x7FF;
                            var76 = class254.field3989[var78];
                            var74 = var77 >> 11 & 0xF;
                        }
                        if (var76 != null) {
                            class333 var79 = var76.method888(0);
                            if (var79.field5211 != null && var79.field5211[var74] != null) {
                                int var80 = var79.field5211[var74][0];
                                var64 -= var79.field5211[var74][1];
                                int var81 = class15.field204[var76.field1939];
                                int var82 = var79.field5211[var74][2];
                                int var83 = class15.field216[var76.field1939];
                                int var84 = var80 * var83 + var81 * var82 >> 16;
                                int var85 = var82 * var83 - (var80 * var81) >> 16;
                                var72 += var84;
                                var70 += var85;
                            }
                        }
                    }
                    int var87 = var60 * 64;
                    class10 var88 = new class10(var63, class205.field3101, var72, var70, class320.method2181(var72, var70, -46, class205.field3101) - var64, class227.field3618 + var66, var67 + class227.field3618, var68, var69, var62, var65);
                    var88.method79(class227.field3618 + var66, var71, class320.method2181(var71, var87, -17, class205.field3101) - var65, var87, (byte) 89);
                    class265.field4120.method632(-70, new class272(var88));
                }
            } else if (class342.field5333 == 11) {
                int var89 = class10.field132.method1153(15673);
                int var90 = ((var89 & 0x70) >> 4) + class203.field3043;
                int var91 = (var89 & 0x7) + class90.field1442;
                int var92 = class10.field132.method1128((byte) -53);
                int var93 = class10.field132.method1180(arg0 ^ 0xFFFF9F68);
                int var94 = class10.field132.method1128((byte) -59);
                if (var90 >= 0 && var91 >= 0 && var90 < 104 && var91 < 104 && class120.field1837 != var92) {
                    class91 var95 = new class91();
                    var95.field1454 = var93;
                    var95.field1456 = var94;
                    if (class280.field4315[class205.field3101][var90][var91] == null) {
                        class280.field4315[class205.field3101][var90][var91] = new class87();
                    }
                    class280.field4315[class205.field3101][var90][var91].method632(-110, new class84(var95));
                    method1893(var91, var90, false);
                }
            } else if (class342.field5333 == 8) {
                int var128 = class10.field132.method1172(false);
                int var129 = var128 >> 2;
                int var130 = var128 & 0x3;
                int var131 = class177.field2683[var129];
                int var132 = class10.field132.method1120(arg0 ^ 0xFFFF9F90);
                int var133 = (var132 & 0x7) + class90.field1442;
                int var134 = ((var132 & 0x78) >> 4) + class203.field3043;
                if (var134 >= 0 && var133 >= 0 && var134 < 104 && var133 < 104) {
                    class313.method2121(var133, 0, var129, var131, 0, class205.field3101, var134, -1, -1, var130);
                }
            } else if (class342.field5333 == 183) {
                int var96 = class10.field132.method1178(0);
                int var97 = (var96 & 0x7) + class90.field1442;
                int var98 = ((var96 & 0x7A) >> 4) + class203.field3043;
                int var99 = class10.field132.method1151(arg0 + 24523);
                int var100 = class10.field132.method1178(arg0 + 24600);
                int var101 = class10.field132.method1178(0);
                int var102 = (var100 & 0xFD) >> 4;
                int var103 = var100 & 0x7;
                if (var99 == 65535) {
                    var99 = -1;
                }
                int var104 = class10.field132.method1178(arg0 ^ 0xFFFF9FE8);
                if (var98 >= 0 && var97 >= 0 && var98 < 104 && var97 < 104) {
                    int var105 = var102 + 1;
                    if (var98 - var105 <= class98.field1566.field1910[0] && class98.field1566.field1910[0] <= (var98 + var105) && (var97 - var105) <= class98.field1566.field1938[0] && var97 + var105 >= class98.field1566.field1938[0] && class201.field3016 != 0 && var103 > 0 && class61.field986 < 50 && var99 != -1) {
                        class103.field1594[class61.field986] = var99;
                        class342.field5330[class61.field986] = var103;
                        class19.field256[class61.field986] = var101;
                        class267.field4168[class61.field986] = null;
                        class263.field4092[class61.field986] = (var97 << 8) + (var98 << 16) + var102;
                        class117.field1784[class61.field986] = var104;
                        class61.field986++;
                    }
                }
            } else {
                if (class342.field5333 == 237) {
                    int var106 = class10.field132.method1148(-2123880488);
                    int var107 = class10.field132.method1166(52);
                    byte var108 = class10.field132.method1133((byte) -117);
                    int var109 = class10.field132.method1153(15673);
                    int var110 = var109 >> 2;
                    byte var111 = class10.field132.method1140(-17103);
                    int var112 = var109 & 0x3;
                    byte var113 = class10.field132.method1140(-17103);
                    byte var114 = class10.field132.method1140(arg0 + 7497);
                    int var115 = class10.field132.method1180(128);
                    int var116 = class10.field132.method1178(0);
                    int var117 = (var116 & 0x7) + class90.field1442;
                    int var118 = class203.field3043 + ((var116 & 0x7C) >> 4);
                    int var119 = class10.field132.method1151(arg0 + 24548);
                    if (!class94.field1516) {
                        class191.method1361(var108, var106, var119, var110, var118, var117, var114, var111, var112, var115, -120, var113, var107);
                    }
                }
                if (class342.field5333 == 110) {
                    int var120 = class10.field132.method1180(128);
                    int var121 = class10.field132.method1172(false);
                    if (var120 == 65535) {
                        var120 = -1;
                    }
                    int var122 = var121 >> 2;
                    int var123 = class177.field2683[var122];
                    int var124 = var121 & 0x3;
                    int var125 = class10.field132.method1120(119);
                    int var126 = ((var125 & 0x70) >> 4) + class203.field3043;
                    int var127 = (var125 & 0x7) + class90.field1442;
                    class143.method1016(-25, var123, var127, var124, var120, class205.field3101, var122, var126);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)V", line = 623)
    public static final void method1892(byte arg0) {
        class98.field1559 = class257.method1765(0.4F, 35, 4, 8, 8, true, 2048, (byte) 37);
        field4255++;
        if (arg0 <= 49) {
            field4263 = -106;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIZ)V", line = 636)
    public static final void method1893(int arg0, int arg1, boolean arg2) {
        field4258++;
        class87 var3 = class280.field4315[class205.field3101][arg1][arg0];
        if (var3 == null) {
            class222.method1579(class205.field3101, arg1, arg0);
            return;
        }
        int var4 = -99999999;
        class84 var5 = null;
        for (class84 var6 = (class84) var3.method636(-1); var6 != null; var6 = (class84) var3.method638(49)) {
            class299 var7 = class237.method1657(2, var6.field1308.field1456);
            int var8 = var7.field4657;
            if (var7.field4641 == 1) {
                var8 = (var6.field1308.field1454 + 1) * var8;
            }
            if (var8 > var4) {
                var4 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            class222.method1579(class205.field3101, arg1, arg0);
            return;
        }
        var3.method631(var5, arg2);
        class91 var9 = null;
        class84 var10 = (class84) var3.method636(-1);
        class91 var11 = null;
        while (var10 != null) {
            class91 var12 = var10.field1308;
            if (var5.field1308.field1456 != var12.field1456) {
                if (var9 == null) {
                    var9 = var12;
                }
                if (var9.field1456 != var12.field1456 && var11 == null) {
                    var11 = var12;
                }
            }
            var10 = (class84) var3.method638(85);
        }
        long var13 = (long) ((arg0 << 7) + arg1 + 1610612736);
        class339.method2357(class205.field3101, arg1, arg0, class320.method2181(arg1 * 128 + 64, arg0 * 128 + 64, -118, class205.field3101), var5.field1308, var13, var9, var11);
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(B)V", line = 711)
    public static void method1894(byte arg0) {
        int var1 = -102 % ((-arg0 - 21) / 54);
        field4261 = (byte[][]) null;
        field4257 = null;
        field4260 = null;
        field4259 = null;
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "()V", line = 750)
    public class276() {
        new class184();
    }
}
