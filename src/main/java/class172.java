import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class172 extends class83 {

    @OriginalMember(owner = "client!ns", name = "M", descriptor = "I")
    private int field2157 = 4096;

    @OriginalMember(owner = "client!ns", name = "O", descriptor = "Z")
    public static boolean field2159 = false;

    @OriginalMember(owner = "client!ns", name = "P", descriptor = "Ljava/lang/String;")
    public static String field2160 = " is already on your friend list.";

    @OriginalMember(owner = "client!ns", name = "L", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!ns", name = "R", descriptor = "I")
    public static int field2162;

    @OriginalMember(owner = "client!ns", name = "S", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!ns", name = "T", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!ns", name = "V", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!ns", name = "N", descriptor = "[I")
    public static int[] field2158;

    @OriginalMember(owner = "client!ns", name = "Q", descriptor = "[Ljava/lang/String;")
    public static String[] field2161;

    @OriginalMember(owner = "client!ns", name = "U", descriptor = "[[[B")
    public static byte[][][] field2165;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(BLjava/lang/String;)[B", line = 7)
    public static final byte[] method903(byte arg0, String arg1) {
        ++field2163;
        int var2 = arg1.length();
        byte[] var3 = new byte[var2];
        if (arg0 <= 51) {
            field2159 = true;
        }
        for (int var4 = 0; var4 < var2; ++var4) {
            char var5 = arg1.charAt(var4);
            if (var5 > 0 && var5 < 128 || ~var5 <= -161 && var5 <= 255) {
                var3[var4] = (byte) var5;
            } else if (~var5 != -8365) {
                if (var5 != 8218) {
                    if (~var5 == -403) {
                        var3[var4] = -125;
                    } else if (var5 == 8222) {
                        var3[var4] = -124;
                    } else if (~var5 == -8231) {
                        var3[var4] = -123;
                    } else if (~var5 == -8225) {
                        var3[var4] = -122;
                    } else if (var5 == 8225) {
                        var3[var4] = -121;
                    } else if (var5 == 710) {
                        var3[var4] = -120;
                    } else if (~var5 == -8241) {
                        var3[var4] = -119;
                    } else if (var5 == 352) {
                        var3[var4] = -118;
                    } else if (~var5 != -8250) {
                        if (~var5 == -339) {
                            var3[var4] = -116;
                        } else if (var5 != 381) {
                            if (~var5 == -8217) {
                                var3[var4] = -111;
                            } else if (~var5 != -8218) {
                                if (var5 != 8220) {
                                    if (~var5 == -8222) {
                                        var3[var4] = -108;
                                    } else if (~var5 != -8227) {
                                        if (var5 == 8211) {
                                            var3[var4] = -106;
                                        } else if (var5 != 8212) {
                                            if (~var5 == -733) {
                                                var3[var4] = -104;
                                            } else if (var5 != 8482) {
                                                if (~var5 == -354) {
                                                    var3[var4] = -102;
                                                } else if (~var5 == -8251) {
                                                    var3[var4] = -101;
                                                } else if (~var5 != -340) {
                                                    if (~var5 == -383) {
                                                        var3[var4] = -98;
                                                    } else if (~var5 == -377) {
                                                        var3[var4] = -97;
                                                    } else {
                                                        var3[var4] = 63;
                                                    }
                                                } else {
                                                    var3[var4] = -100;
                                                }
                                            } else {
                                                var3[var4] = -103;
                                            }
                                        } else {
                                            var3[var4] = -105;
                                        }
                                    } else {
                                        var3[var4] = -107;
                                    }
                                } else {
                                    var3[var4] = -109;
                                }
                            } else {
                                var3[var4] = -110;
                            }
                        } else {
                            var3[var4] = -114;
                        }
                    } else {
                        var3[var4] = -117;
                    }
                } else {
                    var3[var4] = -126;
                }
            } else {
                var3[var4] = -128;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ns", name = "d", descriptor = "(B)V", line = 145)
    public static final void method904(byte arg0) {
        ++field2156;
        if (class7.field68 == 40) {
            int var1 = class448.field6514.method1331(true);
            int var2 = var1 >> 2;
            int var3 = 3 & var1;
            int var4 = class126.field1629[var2];
            int var5 = class448.field6514.method1331(true);
            int var6 = ((121 & var5) >> 4) + class386.field5505;
            int var7 = class159.field2053 - -(var5 & 7);
            int var8 = class448.field6514.method1356((byte) 105);
            if (~var6 <= -1 && ~var7 <= -1 && var6 < class315.field4214 && var7 < class340.field4549) {
                class151.method802(var2, -1, var8, var3, class263.field3592, (byte) -7, var6, var4, 0, var7);
            }
        } else if (class7.field68 == 203) {
            int var9 = class448.field6514.method1350(31351);
            int var10 = ((var9 & 254) >> 4) + class386.field5505 * 2;
            int var11 = (15 & var9) + class159.field2053 * 2;
            int var12 = var10 + class448.field6514.method1363((byte) -60);
            int var13 = var11 + class448.field6514.method1363((byte) 124);
            int var14 = class448.field6514.method1366((byte) 75);
            int var15 = class448.field6514.method1366((byte) -75);
            int var16 = class448.field6514.method1374(-2);
            int var17 = class448.field6514.method1363((byte) 108);
            int var18 = 4 * class448.field6514.method1350(31351);
            int var19 = class448.field6514.method1374(-2);
            int var20 = class448.field6514.method1374(-2);
            int var21 = class448.field6514.method1350(31351);
            if (~var21 == -256) {
                var21 = -1;
            }
            int var22 = class448.field6514.method1350(31351);
            if (~var10 <= -1 && ~var11 <= -1 && ~var10 > -209 && ~var11 > -209 && var12 >= 0 && var13 >= 0 && ~var12 > -209 && ~var13 > -209 && var16 != 65535) {
                int var23 = var10 * 64;
                int var24 = var13 * 64;
                int var25 = var12 * 64;
                int var26 = var11 * 64;
                if (~var14 != -1) {
                    int var29;
                    class419 var30;
                    if (var14 >= 0) {
                        int var27 = var14 + -1;
                        int var28 = var27 & 2047;
                        var29 = var27 >> 11 & 15;
                        var30 = class38.field397[var28];
                    } else {
                        int var31 = -var14 - 1;
                        int var32 = 2047 & var31;
                        var29 = var31 >> 11 & 15;
                        if (class324.field4325 == var32) {
                            var30 = class427.field6264;
                        } else {
                            var30 = class85.field957[var32];
                        }
                    }
                    if (var30 != null) {
                        class70 var33 = var30.method2606(0);
                        if (var33.field760 != null && var33.field760[var29] != null) {
                            int var34 = var33.field760[var29][0];
                            int var35 = var33.field760[var29][2];
                            int var36 = var30.field6075.method2690(-17869);
                            int var37 = class356.field5037[var36];
                            int var38 = class356.field5025[var36];
                            int var39 = var34 * var38 + var35 * var37 >> 15;
                            int var40 = var35 * var38 - var34 * var37 >> 15;
                            var17 -= var33.field760[var29][1];
                            var26 += var40;
                            var23 += var39;
                        }
                    }
                }
                class421 var42 = new class421(var16, class263.field3592, var23, var26, class201.method1098(var23, var26, class263.field3592, (byte) 45) - var17, class234.field3224 + var19, class234.field3224 + var20, var21, var22, var15, var18);
                var42.method2625(class234.field3224 + var19, -127, class201.method1098(var25, var24, class263.field3592, (byte) -18) - var18, var24, var25);
                class401.field5852.method825(73, new class303(var42));
            }
        } else if (class7.field68 == 114) {
            int var43 = class448.field6514.method1374(-2);
            int var44 = class448.field6514.method1334(-17290);
            int var45 = class448.field6514.method1331(true);
            int var46 = ((var45 & 119) >> 4) + class386.field5505;
            int var47 = class159.field2053 - -(var45 & 7);
            int var48 = class448.field6514.method1364(90);
            if (~var46 <= -1 && var47 >= 0 && var46 < class315.field4214 && class340.field4549 > var47 && ~class324.field4325 != ~var43) {
                class397.method2483(var47, var46, class263.field3592, (byte) 108, new class306(var44, var48));
                class292.method1721(var46, var47, class263.field3592, 108);
            }
        } else if (class7.field68 == 247) {
            int var49 = class448.field6514.method1344(-109);
            int var50 = var49 >> 2;
            int var51 = var49 & 3;
            int var52 = class126.field1629[var50];
            int var53 = class448.field6514.method1344(-89);
            int var54 = class386.field5505 - -((var53 & 122) >> 4);
            int var55 = (var53 & 7) + class159.field2053;
            if (var54 >= 0 && var55 >= 0 && ~class315.field4214 < ~var54 && class340.field4549 > var55) {
                class151.method802(var50, -1, -1, var51, class263.field3592, (byte) -7, var54, var52, 0, var55);
            }
        } else if (~class7.field68 == -100) {
            int var56 = class448.field6514.method1374(-2);
            int var57 = class448.field6514.method1350(31351);
            class281.method1655((byte) -28, var56).method1210((byte) 29, var57);
        } else {
            if (~class7.field68 == -18) {
                int var58 = class448.field6514.method1334(-17290);
                int var59 = class448.field6514.method1350(31351);
                int var60 = ((118 & var59) >> 4) + class386.field5505;
                int var61 = (var59 & 7) + class159.field2053;
                byte var62 = class448.field6514.method1375(31185);
                byte var63 = class448.field6514.method1335(-118);
                int var64 = class448.field6514.method1356((byte) 118);
                int var65 = class448.field6514.method1374(-2);
                byte var66 = class448.field6514.method1335(-114);
                int var67 = class448.field6514.method1344(-105);
                int var68 = var67 >> 2;
                int var69 = var67 & 3;
                byte var70 = class448.field6514.method1337(-26128);
                int var71 = class448.field6514.method1381(0);
                if (!class88.field1003.method1562()) {
                    class189.method1018(var58, var71, var64, var68, var69, (byte) 73, var60, var63, var61, var65, var62, var66, var70);
                }
            }
            int var72 = -81 / ((32 - arg0) / 47);
            if (~class7.field68 == -12) {
                int var73 = class448.field6514.method1387(-2);
                int var74 = var73 >> 2;
                int var75 = 3 & var73;
                int var76 = class126.field1629[var74];
                int var77 = class448.field6514.method1331(true);
                int var78 = ((126 & var77) >> 4) + class386.field5505;
                int var79 = class159.field2053 - -(7 & var77);
                int var80 = class448.field6514.method1374(-2);
                if (~var80 == -65536) {
                    var80 = -1;
                }
                class405.method2533(var79, var78, var75, var74, (byte) 80, var76, class263.field3592, var80);
            } else if (class7.field68 == 218) {
                int var81 = class448.field6514.method1331(true);
                int var82 = (7 & var81 >> 4) + class386.field5505;
                int var83 = (var81 & 7) + class159.field2053;
                int var84 = class448.field6514.method1334(-17290);
                int var85 = class448.field6514.method1356((byte) 122);
                if (var82 >= 0 && var83 >= 0 && ~var82 > ~class315.field4214 && class340.field4549 > var83) {
                    class397.method2483(var83, var82, class263.field3592, (byte) 108, new class306(var85, var84));
                    class292.method1721(var82, var83, class263.field3592, 85);
                }
            } else if (~class7.field68 == -4) {
                int var86 = class448.field6514.method1350(31351);
                int var87 = class386.field5505 - -((var86 & 119) >> 4);
                int var88 = (var86 & 7) + class159.field2053;
                int var89 = class448.field6514.method1363((byte) -88) + var87;
                int var90 = var88 + class448.field6514.method1363((byte) -2);
                int var91 = class448.field6514.method1366((byte) 10);
                int var92 = class448.field6514.method1374(-2);
                int var93 = 4 * class448.field6514.method1350(31351);
                int var94 = 4 * class448.field6514.method1350(31351);
                int var95 = class448.field6514.method1374(-2);
                int var96 = class448.field6514.method1374(-2);
                int var97 = class448.field6514.method1350(31351);
                int var98 = class448.field6514.method1350(31351);
                if (var97 == 255) {
                    var97 = -1;
                }
                if (var87 >= 0 && ~var88 <= -1 && class315.field4214 > var87 && ~class340.field4549 < ~var88 && ~var89 <= -1 && var90 >= 0 && var89 < class315.field4214 && class340.field4549 > var90 && ~var92 != -65536) {
                    int var99 = var87 * 128 + 64;
                    int var100 = var89 * 128 + 64;
                    int var101 = var90 * 128 + 64;
                    int var102 = var88 * 128 + 64;
                    class421 var103 = new class421(var92, class263.field3592, var99, var102, class201.method1098(var99, var102, class263.field3592, (byte) -126) - var93, class234.field3224 + var95, var96 - -class234.field3224, var97, var98, var91, var94);
                    var103.method2625(class234.field3224 + var95, -128, -var94 + class201.method1098(var100, var101, class263.field3592, (byte) -113), var101, var100);
                    class401.field5852.method825(56, new class303(var103));
                }
            } else if (class7.field68 == 111) {
                int var104 = class448.field6514.method1350(31351);
                int var105 = class386.field5505 - -((var104 & 114) >> 4);
                int var106 = class159.field2053 - -(7 & var104);
                int var107 = class448.field6514.method1374(-2);
                int var108 = class448.field6514.method1374(-2);
                int var109 = class448.field6514.method1374(-2);
                if (class419.field6102 != null && var105 >= 0 && ~var106 <= -1 && class315.field4214 > var105 && ~class340.field4549 < ~var106) {
                    class268 var110 = (class268) class419.field6102.method308((long) (var105 | var106 << 14 | class263.field3592 << 28), (byte) -117);
                    if (var110 != null) {
                        for (class306 var111 = (class306) var110.field3647.method814((byte) 90); var111 != null; var111 = (class306) var110.field3647.method827(-128)) {
                            if (~(var107 & 32767) == ~var111.field4144 && ~var111.field4142 == ~var108) {
                                var111.method1967(-1);
                                var111.field4142 = var109;
                                class397.method2483(var106, var105, class263.field3592, (byte) 108, var111);
                                break;
                            }
                        }
                        class292.method1721(var105, var106, class263.field3592, 70);
                    }
                }
            } else if (~class7.field68 == -184) {
                int var112 = class448.field6514.method1350(31351);
                int var113 = class386.field5505 * 2 - -(var112 >> 4 & 15);
                int var114 = (var112 & 15) + class159.field2053 * 2;
                int var115 = class448.field6514.method1363((byte) 118) + var113;
                int var116 = class448.field6514.method1363((byte) 122) + var114;
                int var117 = class448.field6514.method1366((byte) -105);
                int var118 = class448.field6514.method1374(-2);
                int var119 = class448.field6514.method1350(31351) * 4;
                int var120 = 4 * class448.field6514.method1350(31351);
                int var121 = class448.field6514.method1374(-2);
                int var122 = class448.field6514.method1374(-2);
                int var123 = class448.field6514.method1350(31351);
                int var124 = class448.field6514.method1350(31351);
                if (var123 == 255) {
                    var123 = -1;
                }
                if (~var113 <= -1 && var114 >= 0 && ~var113 > -209 && ~var114 > -209 && ~var115 <= -1 && ~var116 <= -1 && ~var115 > -209 && ~var116 > -209 && var118 != 65535) {
                    int var125 = var114 * 64;
                    int var126 = var113 * 64;
                    int var127 = var116 * 64;
                    int var128 = var115 * 64;
                    class421 var129 = new class421(var118, class263.field3592, var126, var125, class201.method1098(var126, var125, class263.field3592, (byte) -103) + -var119, class234.field3224 + var121, class234.field3224 + var122, var123, var124, var117, var120);
                    var129.method2625(class234.field3224 + var121, 67, -var120 + class201.method1098(var128, var127, class263.field3592, (byte) 126), var127, var128);
                    class401.field5852.method825(-91, new class303(var129));
                }
            } else if (~class7.field68 != -102) {
                if (class7.field68 == 233) {
                    int var136 = class448.field6514.method1350(31351);
                    int var137 = (var136 >> 4 & 7) + class386.field5505;
                    int var138 = (var136 & 7) + class159.field2053;
                    int var139 = class448.field6514.method1374(-2);
                    int var140 = class448.field6514.method1350(31351);
                    int var141 = class448.field6514.method1374(-2);
                    if (~var137 <= -1 && ~var138 <= -1 && class315.field4214 > var137 && ~class340.field4549 < ~var138) {
                        int var142 = var137 * 128 + 64;
                        int var143 = var138 * 128 - -64;
                        class235 var144 = new class235(var139, var141, class234.field3224, class263.field3592, var142, -var140 + class201.method1098(var142, var143, class263.field3592, (byte) -109), var143, var137, var137, var138, var138);
                        class131.field1687.method825(111, new class424(var144));
                    }
                } else if (class7.field68 == 139) {
                    class448.field6514.method1350(31351);
                    int var145 = class448.field6514.method1350(31351);
                    int var146 = ((var145 & 119) >> 4) + class386.field5505;
                    int var147 = class159.field2053 - -(var145 & 7);
                    int var148 = class448.field6514.method1374(-2);
                    int var149 = class448.field6514.method1350(31351);
                    int var150 = class448.field6514.method1372(-2);
                    String var151 = class448.field6514.method1349(-1754884856);
                    class162.method871(var148, var146, var151, var147, 100, var150, var149);
                } else if (~class7.field68 == -13) {
                    int var152 = class448.field6514.method1350(31351);
                    int var153 = (7 & var152 >> 4) + class386.field5505;
                    int var154 = (7 & var152) + class159.field2053;
                    int var155 = class448.field6514.method1374(-2);
                    if (~var155 == -65536) {
                        var155 = -1;
                    }
                    int var156 = class448.field6514.method1350(31351);
                    int var157 = 15 & var156 >> 4;
                    int var158 = var156 & 7;
                    int var159 = class448.field6514.method1350(31351);
                    int var160 = class448.field6514.method1350(31351);
                    if (var153 >= 0 && var154 >= 0 && ~var153 > ~class315.field4214 && class340.field4549 > var154) {
                        int var161 = var157 + 1;
                        if (~(var153 - var161) >= ~class427.field6264.field6119[0] && ~class427.field6264.field6119[0] >= ~(var153 - -var161) && class427.field6264.field6109[0] >= var154 - var161 && ~(var154 + var161) <= ~class427.field6264.field6109[0] && class295.field4002 != 0 && var158 > 0 && ~class119.field1487 > -51 && var155 != -1) {
                            class195.field2633[class119.field1487] = var155;
                            class289.field3935[class119.field1487] = var158;
                            class208.field2836[class119.field1487] = var159;
                            class438.field6421[class119.field1487] = null;
                            class344.field4619[class119.field1487] = (var154 << 8) + (var153 << 16) + var157;
                            class312.field4196[class119.field1487] = var160;
                            ++class119.field1487;
                        }
                    }
                }
            } else {
                int var130 = class448.field6514.method1387(-2);
                int var131 = (7 & var130 >> 4) + class386.field5505;
                int var132 = class159.field2053 - -(var130 & 7);
                int var133 = class448.field6514.method1364(90);
                if (~var131 <= -1 && ~var132 <= -1 && class315.field4214 > var131 && ~var132 > ~class340.field4549) {
                    class268 var134 = (class268) class419.field6102.method308((long) (var131 | class263.field3592 << 28 | var132 << 14), (byte) -105);
                    if (var134 != null) {
                        for (class306 var135 = (class306) var134.field3647.method814((byte) 90); var135 != null; var135 = (class306) var134.field3647.method827(120)) {
                            if (~(var133 & 32767) == ~var135.field4144) {
                                var135.method1967(-1);
                                break;
                            }
                        }
                        if (var134.field3647.method823(127)) {
                            var134.method1967(-1);
                        }
                        class292.method1721(var131, var132, class263.field3592, 109);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(II)[I", line = 753)
    public final int[] method37(int arg0, int arg1) {
        ++field2166;
        int[] var3 = super.field916.method1813(arg1, (byte) -28);
        if (arg0 != 2) {
            return null;
        } else {
            if (super.field916.field4174) {
                int[] var4 = this.method451(0, 94, class109.field1348 & arg1 + -1);
                int[] var5 = this.method451(0, arg0 ^ 113, arg1);
                int[] var6 = this.method451(0, 118, arg1 + 1 & class109.field1348);
                for (int var7 = 0; ~class420.field6139 < ~var7; ++var7) {
                    int var8 = (var6[var7] - var4[var7]) * this.field2157;
                    int var9 = (var5[var7 + 1 & class213.field2881] + -var5[var7 + -1 & class213.field2881]) * this.field2157;
                    int var10 = var9 >> 12;
                    int var11 = var8 >> 12;
                    int var12 = var10 * var10 >> 12;
                    int var13 = var11 * var11 >> 12;
                    int var14 = (int) (Math.sqrt((double) ((float) (var12 - -4096 + var13) / 4096.0F)) * 4096.0D);
                    int var15 = ~var14 == -1 ? 0 : 16777216 / var14;
                    var3[var7] = -var15 + 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "()V", line = 812)
    public class172() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IBLtq;)V", line = 815)
    public final void method35(int arg0, byte arg1, class250 arg2) {
        ++field2162;
        if (arg0 == 0) {
            this.field2157 = arg2.method1374(-2);
        }
        int var4 = -78 % ((arg1 - -27) / 50);
    }

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "(Z)V", line = 827)
    public static void method905(boolean arg0) {
        field2165 = null;
        field2160 = null;
        field2158 = null;
        if (!arg0) {
            method904((byte) 35);
        }
        field2161 = null;
    }
}
