import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class144 {

    @OriginalMember(owner = "client!vd", name = "u", descriptor = "J")
    public long field2344 = 0L;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
    public static int field2329 = 0;

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "I")
    public static int field2331 = 0;

    @OriginalMember(owner = "client!vd", name = "r", descriptor = "[[I")
    public static int[][] field2341 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
    public static int field2326 = 0;

    @OriginalMember(owner = "client!vd", name = "s", descriptor = "Z")
    public static boolean field2342 = false;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "I")
    public int field2324;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
    public int field2327;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "I")
    public int field2332;

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "I")
    public int field2333;

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "I")
    public int field2334;

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "I")
    public int field2335;

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "I")
    public int field2336;

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "I")
    public int field2337;

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "I")
    public int field2338;

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "I")
    public int field2339;

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!vd", name = "t", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!vd", name = "v", descriptor = "I")
    public int field2345;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "Lpk;")
    public static class120 field2328;

    @OriginalMember(owner = "client!vd", name = "w", descriptor = "Leh;")
    public class179 field2346;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V", line = 17)
    public static final void method1103(byte arg0) {
        field2340++;
        if (class60.field884 == 67) {
            int var1 = class80.field1248.method39(arg0 - 7780);
            int var2 = class80.field1248.method15((byte) 95);
            int var3 = var2 >> 2;
            int var4 = var2 & 0x3;
            int var5 = class113.field1830[var3];
            int var6 = class80.field1248.method19(255);
            int var7 = ((var6 & 0x7E) >> 4) + class318.field4989;
            int var8 = (var6 & 0x7) + field2330;
            if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
                class128.method999(class75.field1153, var7, var5, -1, var1, var3, var4, 0, var8, (byte) -60);
            }
            return;
        }
        if (class60.field884 == 131) {
            byte var9 = class80.field1248.method32(128);
            int var10 = class80.field1248.method31((byte) 98);
            int var11 = class80.field1248.method29(15976);
            int var12 = class80.field1248.method39(-7872);
            byte var13 = class80.field1248.method18((byte) 50);
            byte var14 = class80.field1248.method55(4);
            int var15 = class80.field1248.method39(arg0 ^ 0x1EE4);
            int var16 = class80.field1248.method15((byte) 92);
            int var17 = (var16 & 0x7) + field2330;
            int var18 = class318.field4989 + (var16 >> 4 & 0x7);
            int var19 = class80.field1248.method19(arg0 ^ 0xFFFFFF5B);
            int var20 = var19 & 0x3;
            int var21 = var19 >> 2;
            byte var22 = class80.field1248.method32(128);
            if (!class162.field2623) {
                class247.method1731(var22, var18, var15, var13, var21, var20, var11, var17, (byte) 62, var10, var9, var12, var14);
            }
        }
        if (class60.field884 == 26) {
            int var123 = class80.field1248.method15((byte) -18);
            int var124 = (var123 >> 4 & 0xF) + class318.field4989 * 2;
            int var125 = field2330 * 2 + (var123 & 0xF);
            int var126 = class80.field1248.method55(4) + var124;
            int var127 = class80.field1248.method55(4) + var125;
            int var128 = class80.field1248.method41((byte) -66);
            int var129 = class80.field1248.method41((byte) -66);
            int var130 = class80.field1248.method56(19612);
            int var131 = class80.field1248.method55(4);
            int var132 = class80.field1248.method15((byte) 60) * 4;
            int var133 = class80.field1248.method56(19612);
            int var134 = class80.field1248.method56(19612);
            int var135 = class80.field1248.method15((byte) -14);
            int var136 = class80.field1248.method15((byte) -15);
            if (var135 == 255) {
                var135 = -1;
            }
            if (var124 >= 0 && var125 >= 0 && var124 < 208 && var125 < 208 && var126 >= 0 && var127 >= 0 && var126 < 208 && var127 < 208 && var130 != 65535) {
                int var137 = var127 * 64;
                int var138 = var126 * 64;
                int var139 = var125 * 64;
                int var140 = var124 * 64;
                if (var128 != 0) {
                    int var142;
                    class294 var144;
                    if (var128 < 0) {
                        int var141 = -var128 - 1;
                        var142 = (var141 & 0x7F7B) >> 11;
                        int var143 = var141 & 0x7FF;
                        if (class75.field1146 == var143) {
                            var144 = class345.field5363;
                        } else {
                            var144 = class74.field1140[var143];
                        }
                    } else {
                        int var145 = var128 - 1;
                        int var146 = var145 & 0x7FF;
                        var144 = class197.field3029[var146];
                        var142 = (var145 & 0x7F51) >> 11;
                    }
                    if (var144 != null) {
                        class66 var147 = var144.method2062((byte) -86);
                        if (var147.field990 != null && var147.field990[var142] != null) {
                            var131 -= var147.field990[var142][1];
                            int var148 = var147.field990[var142][0];
                            int var149 = class40.field612[var144.field4682];
                            int var150 = var147.field990[var142][2];
                            int var151 = class40.field619[var144.field4682];
                            int var152 = var149 * var150 + (var148 * var151) >> 16;
                            int var153 = var150 * var151 - var148 * var149 >> 16;
                            var139 += var153;
                            var140 += var152;
                        }
                    }
                }
                class288 var155 = new class288(var130, class75.field1153, var140, var139, class170.method1265(var140, var139, class75.field1153, 1) - var131, class307.field4869 + var133, var134 + class307.field4869, var135, var136, var129, var132);
                var155.method2029(class307.field4869 + var133, var138, var137, (byte) -126, class170.method1265(var138, var137, class75.field1153, arg0 + 93) - var132);
                class242.field3627.method277(new class32(var155), (byte) -119);
            }
        } else if (class60.field884 == 203) {
            int var23 = class80.field1248.method15((byte) -122);
            int var24 = ((var23 & 0x79) >> 4) + class318.field4989;
            int var25 = (var23 & 0x7) + field2330;
            int var26 = class80.field1248.method56(19612);
            int var27 = class80.field1248.method15((byte) -23);
            int var28 = (var27 & 0xFD) >> 4;
            if (var26 == 65535) {
                var26 = -1;
            }
            int var29 = var27 & 0x7;
            int var30 = class80.field1248.method15((byte) 114);
            int var31 = class80.field1248.method15((byte) 108);
            if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104) {
                int var32 = var28 + 1;
                if (var24 - var32 <= class345.field5363.field4643[0] && var24 + var32 >= class345.field5363.field4643[0] && var25 - var32 <= class345.field5363.field4619[0] && (var25 + var32) >= class345.field5363.field4619[0] && class22.field398 != 0 && var29 > 0 && class113.field1828 < 50 && var26 != -1) {
                    class90.field1445[class113.field1828] = var26;
                    client.field4120[class113.field1828] = var29;
                    class200.field3068[class113.field1828] = var30;
                    class226.field3502[class113.field1828] = null;
                    class308.field4878[class113.field1828] = (var24 << 16) + (var25 << 8) + var28;
                    class180.field2869[class113.field1828] = var31;
                    class113.field1828++;
                }
            }
        } else if (class60.field884 == 45) {
            int var33 = class80.field1248.method3((byte) -117);
            int var34 = ((var33 & 0x7E) >> 4) + class318.field4989;
            int var35 = (var33 & 0x7) + field2330;
            int var36 = class80.field1248.method15((byte) 72);
            int var37 = var36 >> 2;
            int var38 = var36 & 0x3;
            int var39 = class113.field1830[var37];
            if (var34 >= 0 && var35 >= 0 && var34 < 104 && var35 < 104) {
                class128.method999(class75.field1153, var34, var39, -1, -1, var37, var38, 0, var35, (byte) 72);
            }
        } else if (class60.field884 == 29) {
            int var40 = class80.field1248.method15((byte) 81);
            int var41 = (var40 & 0x7) + field2330;
            int var42 = (var40 >> 4 & 0x7) + class318.field4989;
            int var43 = class80.field1248.method56(19612);
            if (var42 >= 0 && var41 >= 0 && var42 < 104 && var41 < 104) {
                class30 var44 = class316.field4985[class75.field1153][var42][var41];
                if (var44 != null) {
                    for (class227 var45 = (class227) var44.method268(arg0 ^ 0x5B); var45 != null; var45 = (class227) var44.method278(1)) {
                        if ((var43 & 0x7FFF) == var45.field3510.field1029) {
                            var45.method489(false);
                            break;
                        }
                    }
                    if (var44.method268(-1) == null) {
                        class316.field4985[class75.field1153][var42][var41] = null;
                    }
                    class63.method504(var41, var42, true);
                }
            }
        } else if (class60.field884 == 237) {
            int var46 = class80.field1248.method15((byte) 86);
            int var47 = class318.field4989 + (var46 >> 4 & 0x7);
            int var48 = (var46 & 0x7) + field2330;
            int var49 = class80.field1248.method56(19612);
            int var50 = class80.field1248.method56(19612);
            int var51 = class80.field1248.method56(19612);
            if (var47 >= 0 && var48 >= 0 && var47 < 104 && var48 < 104) {
                class30 var52 = class316.field4985[class75.field1153][var47][var48];
                if (var52 != null) {
                    for (class227 var53 = (class227) var52.method268(arg0 ^ 0x5B); var53 != null; var53 = (class227) var52.method278(1)) {
                        class68 var54 = var53.field3510;
                        if ((var49 & 0x7FFF) == var54.field1029 && var54.field1028 == var50) {
                            var54.field1028 = var51;
                            break;
                        }
                    }
                    class63.method504(var48, var47, true);
                }
            }
        } else if (class60.field884 == 199) {
            int var55 = class80.field1248.method56(19612);
            int var56 = class80.field1248.method29(15976);
            int var57 = class80.field1248.method15((byte) 78);
            int var58 = (var57 & 0x7) + field2330;
            int var59 = (var57 >> 4 & 0x7) + class318.field4989;
            int var60 = class80.field1248.method29(15976);
            if (var59 >= 0 && var58 >= 0 && var59 < 104 && var58 < 104 && class75.field1146 != var60) {
                class68 var61 = new class68();
                var61.field1029 = var55;
                var61.field1028 = var56;
                if (class316.field4985[class75.field1153][var59][var58] == null) {
                    class316.field4985[class75.field1153][var59][var58] = new class30();
                }
                class316.field4985[class75.field1153][var59][var58].method277(new class227(var61), (byte) -119);
                class63.method504(var58, var59, true);
            }
        } else if (arg0 == -92) {
            if (class60.field884 == 92) {
                int var105 = class80.field1248.method15((byte) 62);
                int var106 = (var105 >> 4 & 0xF) + class318.field4989 * 2;
                int var107 = field2330 * 2 + (var105 & 0xF);
                int var108 = var106 + class80.field1248.method55(4);
                int var109 = class80.field1248.method55(4) + var107;
                int var110 = class80.field1248.method41((byte) -66);
                int var111 = class80.field1248.method56(19612);
                int var112 = class80.field1248.method15((byte) -45) * 4;
                int var113 = class80.field1248.method15((byte) -9) * 4;
                int var114 = class80.field1248.method56(19612);
                int var115 = class80.field1248.method56(19612);
                int var116 = class80.field1248.method15((byte) 64);
                int var117 = class80.field1248.method15((byte) -47);
                if (var116 == 255) {
                    var116 = -1;
                }
                if (var106 >= 0 && var107 >= 0 && var106 < 208 && var107 < 208 && var108 >= 0 && var109 >= 0 && var108 < 208 && var109 < 208 && var111 != 65535) {
                    int var118 = var107 * 64;
                    int var119 = var106 * 64;
                    int var120 = var109 * 64;
                    int var121 = var108 * 64;
                    class288 var122 = new class288(var111, class75.field1153, var119, var118, class170.method1265(var119, var118, class75.field1153, arg0 + 93) - var112, class307.field4869 + var114, class307.field4869 + var115, var116, var117, var110, var113);
                    var122.method2029(class307.field4869 + var114, var121, var120, (byte) -120, class170.method1265(var121, var120, class75.field1153, arg0 ^ 0xFFFFFFA5) - var113);
                    class242.field3627.method277(new class32(var122), (byte) -119);
                }
            } else if (class60.field884 == 63) {
                int var62 = class80.field1248.method58((byte) -78);
                int var63 = class80.field1248.method19(255);
                int var64 = var63 >> 2;
                int var65 = class113.field1830[var64];
                int var66 = var63 & 0x3;
                if (var62 == 65535) {
                    var62 = -1;
                }
                int var67 = class80.field1248.method19(255);
                int var68 = class318.field4989 + (var67 >> 4 & 0x7);
                int var69 = (var67 & 0x7) + field2330;
                class99.method805(var69, var64, var66, class75.field1153, var68, var62, var65, (byte) -122);
            } else if (class60.field884 == 218) {
                int var70 = class80.field1248.method15((byte) -58);
                int var71 = (var70 >> 4 & 0x7) + class318.field4989;
                int var72 = (var70 & 0x7) + field2330;
                int var73 = class80.field1248.method56(19612);
                int var74 = class80.field1248.method15((byte) -125);
                int var75 = class80.field1248.method56(arg0 ^ 0xFFFFB338);
                if (var71 >= 0 && var72 >= 0 && var71 < 104 && var72 < 104) {
                    int var76 = var72 * 128 + 64;
                    int var77 = var71 * 128 + 64;
                    class76 var78 = new class76(var73, class75.field1153, var77, var76, class170.method1265(var77, var76, class75.field1153, 1) - var74, var75, class307.field4869);
                    class143.field2320.method277(new class93(var78), (byte) -119);
                }
            } else if (class60.field884 == 111) {
                int var79 = class80.field1248.method56(19612);
                int var80 = class80.field1248.method15((byte) -91);
                class288.method2025(var79, -1).method815(var80, true);
            } else if (class60.field884 == 134) {
                int var99 = class80.field1248.method58((byte) -78);
                int var100 = class80.field1248.method15((byte) 90);
                int var101 = ((var100 & 0x70) >> 4) + class318.field4989;
                int var102 = (var100 & 0x7) + field2330;
                int var103 = class80.field1248.method58((byte) -78);
                if (var101 >= 0 && var102 >= 0 && var101 < 104 && var102 < 104) {
                    class68 var104 = new class68();
                    var104.field1028 = var103;
                    var104.field1029 = var99;
                    if (class316.field4985[class75.field1153][var101][var102] == null) {
                        class316.field4985[class75.field1153][var101][var102] = new class30();
                    }
                    class316.field4985[class75.field1153][var101][var102].method277(new class227(var104), (byte) -119);
                    class63.method504(var102, var101, true);
                }
            } else if (class60.field884 == 230) {
                int var81 = class80.field1248.method15((byte) -74);
                int var82 = (var81 & 0x7) + field2330;
                int var83 = class318.field4989 + ((var81 & 0x71) >> 4);
                int var84 = class80.field1248.method55(4) + var83;
                int var85 = class80.field1248.method55(arg0 + 96) + var82;
                int var86 = class80.field1248.method41((byte) -66);
                int var87 = class80.field1248.method56(19612);
                int var88 = class80.field1248.method15((byte) -37) * 4;
                int var89 = class80.field1248.method15((byte) 96) * 4;
                int var90 = class80.field1248.method56(19612);
                int var91 = class80.field1248.method56(19612);
                int var92 = class80.field1248.method15((byte) 97);
                int var93 = class80.field1248.method15((byte) -56);
                if (var92 == 255) {
                    var92 = -1;
                }
                if (var83 >= 0 && var82 >= 0 && var83 < 104 && var82 < 104 && var84 >= 0 && var85 >= 0 && var84 < 104 && var85 < 104 && var87 != 65535) {
                    int var94 = var85 * 128 + 64;
                    int var95 = var83 * 128 + 64;
                    int var96 = var82 * 128 + 64;
                    class288 var97 = new class288(var87, class75.field1153, var95, var96, class170.method1265(var95, var96, class75.field1153, 1) - var88, var90 - -class307.field4869, var91 + class307.field4869, var92, var93, var86, var89);
                    int var98 = var84 * 128 + 64;
                    var97.method2029(class307.field4869 + var90, var98, var94, (byte) -120, class170.method1265(var98, var94, class75.field1153, 1) - var89);
                    class242.field3627.method277(new class32(var97), (byte) -119);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(III)Ljava/lang/String;", line = 618)
    public static final String method1104(int arg0, int arg1, int arg2) {
        int var3 = arg2 - arg0;
        field2343++;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else {
            if (arg1 != -6013) {
                field2341 = (int[][]) ((int[][]) null);
            }
            if (var3 < 0) {
                return "<col=ffb000>";
            } else if (var3 > 9) {
                return "<col=00ff00>";
            } else if (var3 > 6) {
                return "<col=40ff00>";
            } else if (var3 > 3) {
                return "<col=80ff00>";
            } else if (var3 <= 0) {
                return "<col=ffff00>";
            } else {
                return "<col=c0ff00>";
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V", line = 657)
    public static void method1105(int arg0) {
        field2341 = (int[][]) null;
        if (arg0 > -33) {
            method1104(82, 48, -82);
        }
        field2328 = null;
    }
}
