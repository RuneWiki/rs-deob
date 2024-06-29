import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class43 implements class233 {

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "Z")
    public static boolean field592 = false;

    @OriginalMember(owner = "client!ji", name = "k", descriptor = "Ljava/lang/String;")
    public static String field602 = null;

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!ji", name = "j", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V")
    public static final void method273(int arg0) {
        if (class223.field3548 == 171) {
            int var1 = class192.field3042.method1455((byte) -99);
            byte var2 = class192.field3042.method1431(-19768);
            byte var3 = class192.field3042.method1431(-19768);
            int var4 = class192.field3042.method1454(true);
            byte var5 = class192.field3042.method1414(11766);
            int var6 = class192.field3042.method1421(-2090211480);
            int var7 = class192.field3042.method1432(65);
            int var8 = var7 >> 2;
            int var9 = var7 & 0x3;
            int var10 = class192.field3042.method1419(90);
            int var11 = class192.field3042.method1405(-122);
            int var12 = ((var11 & 0x74) >> 4) + class109.field1666;
            int var13 = (var11 & 0x7) + class24.field304;
            byte var14 = class192.field3042.method1411(0);
            class14.method95(var2, var4, var8, var14, false, var5, var12, var3, var1, var9, var6, var13, var10);
        }
        field595++;
        if (class223.field3548 == 22) {
            int var15 = class192.field3042.method1398((byte) 110);
            int var16 = class24.field304 + (var15 & 0x7);
            int var17 = class109.field1666 + ((var15 & 0x7A) >> 4);
            int var18 = class192.field3042.method1398((byte) 110);
            int var19 = var18 >> 2;
            int var20 = class131.field2016[var19];
            int var21 = class192.field3042.method1455((byte) -99);
            if (var21 == 65535) {
                var21 = -1;
            }
            int var22 = var18 & 0x3;
            class100.method650(var17, var21, var20, class165.field2600, var22, -21, var19, var16);
        } else if (class223.field3548 == 19) {
            int var23 = class192.field3042.method1455((byte) -99);
            int var24 = class192.field3042.method1410(true);
            int var25 = class192.field3042.method1420((byte) 0);
            int var26 = class109.field1666 + (var25 >> 4 & 0x7);
            int var27 = (var25 & 0x7) + class24.field304;
            if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104) {
                class111 var28 = new class111();
                var28.field1685 = var24;
                var28.field1691 = var23;
                if (class239.field3780[class165.field2600][var26][var27] == null) {
                    class239.field3780[class165.field2600][var26][var27] = new class281();
                }
                class239.field3780[class165.field2600][var26][var27].method1952(new class310(var28), 76);
                class135.method906(var26, var27, -17521);
            }
        } else if (class223.field3548 == 12) {
            int var29 = class192.field3042.method1420((byte) 0);
            int var30 = (var29 >> 4 & 0x7) + class109.field1666;
            int var31 = (var29 & 0x7) + class24.field304;
            int var32 = class192.field3042.method1454(true);
            if (var30 >= 0 && var31 >= 0 && var30 < 104 && var31 < 104) {
                class281 var33 = class239.field3780[class165.field2600][var30][var31];
                if (var33 != null) {
                    for (class310 var34 = (class310) var33.method1959(205); var34 != null; var34 = (class310) var33.method1956(121)) {
                        if ((var32 & 0x7FFF) == var34.field5012.field1685) {
                            var34.method900(119);
                            break;
                        }
                    }
                    if (var33.method1959(205) == null) {
                        class239.field3780[class165.field2600][var30][var31] = null;
                    }
                    class135.method906(var30, var31, -17521);
                }
            }
        } else if (class223.field3548 == 179) {
            int var35 = class192.field3042.method1410(true);
            int var36 = class192.field3042.method1405(-124);
            int var37 = class109.field1666 + ((var36 & 0x71) >> 4);
            int var38 = (var36 & 0x7) + class24.field304;
            int var39 = class192.field3042.method1432(-122);
            int var40 = var39 & 0x3;
            int var41 = var39 >> 2;
            int var42 = class131.field2016[var41];
            if (var37 >= 0 && var38 >= 0 && var37 < 104 && var38 < 104) {
                class104.method671(var38, -1, (byte) 64, var41, class165.field2600, var40, var37, var35, var42, 0);
            }
        } else {
            int var43 = -1 / ((arg0 - 7) / 43);
            if (class223.field3548 == 145) {
                int var44 = class192.field3042.method1420((byte) 0);
                int var45 = ((var44 & 0x7F) >> 4) + class109.field1666;
                int var46 = class24.field304 + (var44 & 0x7);
                int var47 = class192.field3042.method1419(98);
                int var48 = class192.field3042.method1419(97);
                int var49 = class192.field3042.method1419(70);
                if (var45 >= 0 && var46 >= 0 && var45 < 104 && var46 < 104) {
                    class281 var50 = class239.field3780[class165.field2600][var45][var46];
                    if (var50 != null) {
                        for (class310 var51 = (class310) var50.method1959(205); var51 != null; var51 = (class310) var50.method1956(99)) {
                            class111 var52 = var51.field5012;
                            if ((var47 & 0x7FFF) == var52.field1685 && var52.field1691 == var48) {
                                var52.field1691 = var49;
                                break;
                            }
                        }
                        class135.method906(var45, var46, -17521);
                    }
                }
            } else if (class223.field3548 == 77) {
                int var53 = class192.field3042.method1419(121);
                int var54 = class192.field3042.method1420((byte) 0);
                class216.method1510(0, var53).method487(var54, 65535);
            } else if (class223.field3548 == 59) {
                int var55 = class192.field3042.method1420((byte) 0);
                int var56 = ((var55 & 0x73) >> 4) + class109.field1666;
                int var57 = (var55 & 0x7) + class24.field304;
                int var58 = class192.field3042.method1419(68);
                int var59 = class192.field3042.method1420((byte) 0);
                int var60 = class192.field3042.method1419(96);
                if (var56 >= 0 && var57 >= 0 && var56 < 104 && var57 < 104) {
                    int var61 = var57 * 128 + 64;
                    int var62 = var56 * 128 + 64;
                    class73 var63 = new class73(var58, class165.field2600, var62, var61, class12.method66(var62, class165.field2600, var61, 0) - var59, var60, class4.field32);
                    class258.field4233.method1952(new class309(var63), 76);
                }
            } else if (class223.field3548 == 32) {
                int var64 = class192.field3042.method1420((byte) 0);
                int var65 = ((var64 & 0xF5) >> 4) + class109.field1666 * 2;
                int var66 = (var64 & 0xF) + class24.field304 * 2;
                int var67 = var65 + class192.field3042.method1457((byte) -89);
                int var68 = class192.field3042.method1457((byte) -63) + var66;
                int var69 = class192.field3042.method1442(-1970239824);
                int var70 = class192.field3042.method1419(64);
                int var71 = class192.field3042.method1420((byte) 0) * 4;
                int var72 = class192.field3042.method1420((byte) 0) * 4;
                int var73 = class192.field3042.method1419(74);
                int var74 = class192.field3042.method1419(93);
                int var75 = class192.field3042.method1420((byte) 0);
                int var76 = class192.field3042.method1420((byte) 0);
                if (var75 == 255) {
                    var75 = -1;
                }
                if (var65 >= 0 && var66 >= 0 && var65 < 208 && var66 < 208 && var67 >= 0 && var68 >= 0 && var67 < 208 && var68 < 208 && var70 != 65535) {
                    int var77 = var66 * 64;
                    int var78 = var67 * 64;
                    int var79 = var68 * 64;
                    int var80 = var65 * 64;
                    class245 var81 = new class245(var70, class165.field2600, var80, var77, class12.method66(var80, class165.field2600, var77, 0) - var71, var73 - -class4.field32, class4.field32 + var74, var75, var76, var69, var72);
                    var81.method1710(class12.method66(var78, class165.field2600, var79, 0) - var72, var79, 4290, var78, class4.field32 + var73);
                    class10.field125.method1952(new class194(var81), 76);
                }
            } else if (class223.field3548 == 115) {
                int var82 = class192.field3042.method1405(-122);
                int var83 = var82 >> 2;
                int var84 = var82 & 0x3;
                int var85 = class131.field2016[var83];
                int var86 = class192.field3042.method1420((byte) 0);
                int var87 = (var86 & 0x7) + class24.field304;
                int var88 = (var86 >> 4 & 0x7) + class109.field1666;
                if (var88 >= 0 && var87 >= 0 && var88 < 104 && var87 < 104) {
                    class104.method671(var87, -1, (byte) 64, var83, class165.field2600, var84, var88, -1, var85, 0);
                }
            } else if (class223.field3548 == 107) {
                int var89 = class192.field3042.method1405(-128);
                int var90 = ((var89 & 0x71) >> 4) + class109.field1666;
                int var91 = (var89 & 0x7) + class24.field304;
                int var92 = class192.field3042.method1454(true);
                int var93 = class192.field3042.method1410(true);
                int var94 = class192.field3042.method1410(true);
                if (var90 >= 0 && var91 >= 0 && var90 < 104 && var91 < 104 && class31.field396 != var93) {
                    class111 var95 = new class111();
                    var95.field1691 = var94;
                    var95.field1685 = var92;
                    if (class239.field3780[class165.field2600][var90][var91] == null) {
                        class239.field3780[class165.field2600][var90][var91] = new class281();
                    }
                    class239.field3780[class165.field2600][var90][var91].method1952(new class310(var95), 76);
                    class135.method906(var90, var91, -17521);
                }
            } else if (class223.field3548 == 228) {
                int var96 = class192.field3042.method1420((byte) 0);
                int var97 = class109.field1666 + ((var96 & 0x75) >> 4);
                int var98 = (var96 & 0x7) + class24.field304;
                int var99 = class192.field3042.method1457((byte) -36) + var97;
                int var100 = class192.field3042.method1457((byte) -118) + var98;
                int var101 = class192.field3042.method1442(-1970239824);
                int var102 = class192.field3042.method1419(97);
                int var103 = class192.field3042.method1420((byte) 0) * 4;
                int var104 = class192.field3042.method1420((byte) 0) * 4;
                int var105 = class192.field3042.method1419(95);
                int var106 = class192.field3042.method1419(82);
                int var107 = class192.field3042.method1420((byte) 0);
                if (var107 == 255) {
                    var107 = -1;
                }
                int var108 = class192.field3042.method1420((byte) 0);
                if (var97 >= 0 && var98 >= 0 && var97 < 104 && var98 < 104 && var99 >= 0 && var100 >= 0 && var99 < 104 && var100 < 104 && var102 != 65535) {
                    int var109 = var99 * 128 + 64;
                    int var110 = var98 * 128 + 64;
                    int var111 = var97 * 128 + 64;
                    int var112 = var100 * 128 + 64;
                    class245 var113 = new class245(var102, class165.field2600, var111, var110, class12.method66(var111, class165.field2600, var110, 0) - var103, class4.field32 + var105, class4.field32 + var106, var107, var108, var101, var104);
                    var113.method1710(class12.method66(var109, class165.field2600, var112, 0) - var104, var112, 4290, var109, var105 + class4.field32);
                    class10.field125.method1952(new class194(var113), 76);
                }
            } else if (class223.field3548 == 109) {
                int var114 = class192.field3042.method1420((byte) 0);
                int var115 = ((var114 & 0xFB) >> 4) + class109.field1666 * 2;
                int var116 = class24.field304 * 2 + (var114 & 0xF);
                int var117 = class192.field3042.method1457((byte) -91) + var115;
                int var118 = var116 + class192.field3042.method1457((byte) -66);
                int var119 = class192.field3042.method1442(-1970239824);
                int var120 = class192.field3042.method1442(-1970239824);
                int var121 = class192.field3042.method1419(102);
                int var122 = class192.field3042.method1457((byte) -37);
                int var123 = class192.field3042.method1420((byte) 0) * 4;
                int var124 = class192.field3042.method1419(100);
                int var125 = class192.field3042.method1419(111);
                int var126 = class192.field3042.method1420((byte) 0);
                if (var126 == 255) {
                    var126 = -1;
                }
                int var127 = class192.field3042.method1420((byte) 0);
                if (var115 >= 0 && var116 >= 0 && var115 < 208 && var116 < 208 && var117 >= 0 && var118 >= 0 && var117 < 208 && var118 < 208 && var121 != 65535) {
                    int var128 = var115 * 64;
                    int var129 = var116 * 64;
                    if (var119 != 0) {
                        int var131;
                        class58 var133;
                        if (var119 >= 0) {
                            int var130 = var119 - 1;
                            var131 = (var130 & 0x7EAA) >> 11;
                            int var132 = var130 & 0x7FF;
                            var133 = class76.field1188[var132];
                        } else {
                            int var134 = -var119 - 1;
                            var131 = (var134 & 0x78BC) >> 11;
                            int var135 = var134 & 0x7FF;
                            if (class31.field396 == var135) {
                                var133 = class309.field5006;
                            } else {
                                var133 = class300.field4925[var135];
                            }
                        }
                        if (var133 != null) {
                            class261 var136 = var133.method361(-1);
                            if (var136.field4307 != null && var136.field4307[var131] != null) {
                                int var137 = var136.field4307[var131][0];
                                var122 -= var136.field4307[var131][1];
                                int var138 = var136.field4307[var131][2];
                                int var139 = class172.field2669[var133.field855];
                                int var140 = class172.field2658[var133.field855];
                                int var141 = var138 * var139 + (var137 * var140) >> 16;
                                int var142 = var138 * var140 - (var137 * var139) >> 16;
                                var129 += var142;
                                var128 += var141;
                            }
                        }
                    }
                    int var144 = var118 * 64;
                    int var145 = var117 * 64;
                    class245 var146 = new class245(var121, class165.field2600, var128, var129, class12.method66(var128, class165.field2600, var129, 0) - var122, class4.field32 + var124, class4.field32 + var125, var126, var127, var120, var123);
                    var146.method1710(class12.method66(var145, class165.field2600, var144, 0) - var123, var144, 4290, var145, class4.field32 + var124);
                    class10.field125.method1952(new class194(var146), 76);
                }
            } else if (class223.field3548 == 124) {
                int var147 = class192.field3042.method1420((byte) 0);
                int var148 = (var147 & 0x7) + class24.field304;
                int var149 = ((var147 & 0x73) >> 4) + class109.field1666;
                int var150 = class192.field3042.method1419(114);
                int var151 = class192.field3042.method1420((byte) 0);
                int var152 = (var151 & 0xF8) >> 4;
                if (var150 == 65535) {
                    var150 = -1;
                }
                int var153 = var151 & 0x7;
                int var154 = class192.field3042.method1420((byte) 0);
                int var155 = class192.field3042.method1420((byte) 0);
                if (var149 >= 0 && var148 >= 0 && var149 < 104 && var148 < 104) {
                    int var156 = var152 + 1;
                    if (class309.field5006.field849[0] >= (var149 - var156) && class309.field5006.field849[0] <= (var149 + var156) && class309.field5006.field804[0] >= (var148 - var156) && class309.field5006.field804[0] <= var148 + var156 && class19.field257 != 0 && var153 > 0 && class195.field3109 < 50 && var150 != -1) {
                        class71.field1031[class195.field3109] = var150;
                        class275.field4553[class195.field3109] = var153;
                        class166.field2608[class195.field3109] = var154;
                        class276.field4575[class195.field3109] = null;
                        class307.field4996[class195.field3109] = (var149 << 16) + (var148 << 8) + var152;
                        class105.field1575[class195.field3109] = var155;
                        class195.field3109++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(BILcl;)V")
    public static final void method274(byte arg0, int arg1, class208 arg2) {
        if (arg0 != 115) {
            return;
        }
        class145 var3 = (class145) class89.field1371.method872((byte) -93, (long) arg1);
        if (var3 != null) {
            if (var3.field2290 != null) {
                class71.field1024.method597(var3.field2290);
                var3.field2290 = null;
            }
            var3.method900(94);
        }
        field593++;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)V")
    public static final void method275(byte arg0) {
        class102.field1547.method144(0);
        if (arg0 != -109) {
            field592 = true;
        }
        field600++;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IZIIII)V")
    public static final void method276(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field596++;
        class176.field2749[0].method20(arg0, arg4);
        class176.field2749[1].method20(arg0, arg2 + arg4 - 16);
        int var6 = (arg2 - 32) * arg2 / arg3;
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg2 - var6 - 32) * arg5 / (arg3 - arg2);
        class62.method380(arg0, arg4 + 16, 16, arg2 - 32, class89.field1380);
        class62.method380(arg0, arg4 + var7 + 16, 16, var6, class230.field3675);
        class62.method392(arg0, arg4 - (-var7 - 16), var6, class69.field1011);
        class62.method392(arg0 + 1, arg4 - -16 + var7, var6, class69.field1011);
        if (!arg1) {
            return;
        }
        class62.method385(arg0, arg4 - (-var7 - 16), 16, class69.field1011);
        class62.method385(arg0, arg4 + var7 + 17, 16, class69.field1011);
        class62.method392(arg0 + 15, arg4 - (-var7 + -16), var6, class196.field3119);
        class62.method392(arg0 + 14, 17 - -var7 + arg4, var6 - 1, class196.field3119);
        class62.method385(arg0, arg4 + var7 + var6 + 15, 16, class196.field3119);
        class62.method385(arg0 + 1, arg4 + 14 + var7 + var6, 15, class196.field3119);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(II)V")
    public static final void method277(int arg0, int arg1) {
        field594++;
        if (arg1 != -16) {
            field592 = false;
        }
        class218.field3482.method147(arg0, (byte) -124);
        class69.field1009.method147(arg0, (byte) -124);
        class12.field152.method147(arg0, (byte) -120);
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(B)V")
    public static void method278(byte arg0) {
        if (arg0 <= -7) {
            field602 = null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(B)V")
    public static final void method279(byte arg0) {
        if (arg0 < 118) {
            return;
        }
        while (class192.field3042.method1396(class20.field272, 124) >= 11) {
            int var1 = class192.field3042.method1394((byte) 115, 11);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class300.field4925[var1] == null) {
                var2 = true;
                class300.field4925[var1] = new class208();
                if (class37.field483[var1] != null) {
                    class300.field4925[var1].method1475((byte) 79, class37.field483[var1], var1);
                }
            }
            class53.field713[class249.field3964++] = var1;
            class208 var3 = class300.field4925[var1];
            var3.field860 = class4.field32;
            int var4 = class192.field3042.method1394((byte) 84, 5);
            int var5 = class192.field3042.method1394((byte) 91, 1);
            if (var4 > 15) {
                var4 -= 32;
            }
            if (var5 == 1) {
                class208.field3323[class70.field1018++] = var1;
            }
            int var6 = class164.field2588[class192.field3042.method1394((byte) 86, 3)];
            if (var2) {
                var3.field802 = var3.field855 = var6;
            }
            int var7 = class192.field3042.method1394((byte) 120, 5);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = class192.field3042.method1394((byte) 101, 1);
            var3.method1480(class309.field5006.field849[0] + var7, var8 == 1, false, class309.field5006.field804[0] + var4);
        }
        class192.field3042.method1389(8);
        field597++;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "([IJII)Ljava/lang/String;")
    public final String method280(int[] arg0, long arg1, int arg2, int arg3) {
        field599++;
        if (arg2 == 0) {
            class124 var6 = class154.method1012(arg0[0], false);
            return var6.method827((int) arg1, (byte) 40);
        } else if (arg2 == 1 || arg2 == 10) {
            class132 var7 = class14.method92((int) arg1, false);
            return var7.field2071;
        } else if (arg2 == arg3 || arg2 == 7 || arg2 == 11) {
            return class154.method1012(arg0[0], false).method827((int) arg1, (byte) 40);
        } else {
            return null;
        }
    }
}
