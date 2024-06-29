import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class78 {

    @OriginalMember(owner = "client!me", name = "a", descriptor = "I")
    public static int field1043 = -1;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "Ljava/lang/String;")
    public static String field1044 = " more options";

    @OriginalMember(owner = "client!me", name = "d", descriptor = "I")
    public static int field1046 = 0;

    @OriginalMember(owner = "client!me", name = "l", descriptor = "Ljava/lang/String;")
    public static String field1054 = null;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!me", name = "h", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!me", name = "j", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!me", name = "k", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "Lug;")
    public static class253 field1051;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "[I")
    public static int[] field1048;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(B)V", line = 18)
    public static final void method579(byte arg0) {
        field1049++;
        if (class30.field449 == 250) {
            int var1 = class111.field1544.method39((byte) 103);
            int var2 = class111.field1544.method58(-288140008);
            int var3 = class282.field4362 + (var2 & 0x7);
            int var4 = class120.field1673 + ((var2 & 0x78) >> 4);
            if (var4 >= 0 && var3 >= 0 && var4 < 104 && var3 < 104) {
                class5 var5 = class304.field4750[class154.field2392][var4][var3];
                if (var5 != null) {
                    for (class132 var6 = (class132) var5.method22((byte) 117); var6 != null; var6 = (class132) var5.method26((byte) -114)) {
                        if ((var1 & 0x7FFF) == var6.field1947.field1097) {
                            var6.method2028(13329);
                            break;
                        }
                    }
                    if (var5.method22((byte) 119) == null) {
                        class304.field4750[class154.field2392][var4][var3] = null;
                    }
                    class68.method537(-112, var3, var4);
                }
            }
        } else if (class30.field449 == 215) {
            int var150 = class111.field1544.method89(99);
            int var151 = class111.field1544.method58(-288140008);
            int var152 = (var151 & 0x7) + class282.field4362;
            int var153 = (var151 >> 4 & 0x7) + class120.field1673;
            int var154 = class111.field1544.method72((byte) -66);
            int var155 = class111.field1544.method89(76);
            if (var153 >= 0 && var152 >= 0 && var153 < 104 && var152 < 104 && class92.field1231 != var150) {
                class81 var156 = new class81();
                var156.field1097 = var155;
                var156.field1100 = var154;
                if (class304.field4750[class154.field2392][var153][var152] == null) {
                    class304.field4750[class154.field2392][var153][var152] = new class5();
                }
                class304.field4750[class154.field2392][var153][var152].method19(new class132(var156), -1058);
                class68.method537(-123, var152, var153);
            }
        } else if (class30.field449 == 227) {
            int var7 = class111.field1544.method58(-288140008);
            int var8 = ((var7 & 0x7F) >> 4) + class120.field1673;
            int var9 = (var7 & 0x7) + class282.field4362;
            int var10 = class111.field1544.method39((byte) 124);
            int var11 = class111.field1544.method58(-288140008);
            int var12 = class111.field1544.method39((byte) 26);
            if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) {
                int var13 = var8 * 128 + 64;
                int var14 = var9 * 128 + 64;
                class94 var15 = new class94(var10, class154.field2392, var13, var14, class320.method2245((byte) -85, var14, class154.field2392, var13) - var11, var12, class229.field3595);
                class244.field3809.method19(new class123(var15), -1058);
            }
        } else if (class30.field449 == 88) {
            int var16 = class111.field1544.method58(-288140008);
            int var17 = class282.field4362 + (var16 & 0x7);
            int var18 = ((var16 & 0x76) >> 4) + class120.field1673;
            int var19 = class111.field1544.method39((byte) 116);
            if (var19 == 65535) {
                var19 = -1;
            }
            int var20 = class111.field1544.method58(-288140008);
            int var21 = var20 & 0x7;
            int var22 = (var20 & 0xFF) >> 4;
            int var23 = class111.field1544.method58(-288140008);
            int var24 = class111.field1544.method58(-288140008);
            if (var18 >= 0 && var17 >= 0 && var18 < 104 && var17 < 104) {
                int var25 = var22 + 1;
                if (var18 - var25 <= class146.field2310.field4708[0] && class146.field2310.field4708[0] <= var18 + var25 && var17 - var25 <= class146.field2310.field4675[0] && var17 + var25 >= class146.field2310.field4675[0] && class10.field183 != 0 && var21 > 0 && class43.field600 < 50 && var19 != -1) {
                    class237.field3725[class43.field600] = var19;
                    class334.field5207[class43.field600] = var21;
                    class86.field1161[class43.field600] = var23;
                    class121.field1715[class43.field600] = null;
                    class22.field347[class43.field600] = (var17 << 8) + (var18 << 16) + var22;
                    class161.field2556[class43.field600] = var24;
                    class43.field600++;
                }
            }
        } else if (class30.field449 == 92) {
            int var117 = class111.field1544.method58(-288140008);
            int var118 = ((var117 & 0xF6) >> 4) + class120.field1673 * 2;
            int var119 = (var117 & 0xF) + class282.field4362 * 2;
            int var120 = class111.field1544.method83((byte) -95) + var118;
            int var121 = var119 + class111.field1544.method83((byte) -88);
            int var122 = class111.field1544.method78((byte) -21);
            int var123 = class111.field1544.method78((byte) -92);
            int var124 = class111.field1544.method39((byte) 85);
            int var125 = class111.field1544.method83((byte) -113);
            int var126 = class111.field1544.method58(-288140008) * 4;
            int var127 = class111.field1544.method39((byte) 102);
            int var128 = class111.field1544.method39((byte) 54);
            int var129 = class111.field1544.method58(-288140008);
            int var130 = class111.field1544.method58(-288140008);
            if (var129 == 255) {
                var129 = -1;
            }
            if (var118 >= 0 && var119 >= 0 && var118 < 208 && var119 < 208 && var120 >= 0 && var121 >= 0 && var120 < 208 && var121 < 208 && var124 != 65535) {
                int var131 = var119 * 64;
                int var132 = var120 * 64;
                int var133 = var118 * 64;
                if (var122 != 0) {
                    int var136;
                    class303 var137;
                    if (var122 >= 0) {
                        int var134 = var122 - 1;
                        int var135 = var134 & 0x7FF;
                        var136 = (var134 & 0x7EA6) >> 11;
                        var137 = class59.field870[var135];
                    } else {
                        int var138 = -var122 - 1;
                        int var139 = var138 & 0x7FF;
                        if (class92.field1231 == var139) {
                            var137 = class146.field2310;
                        } else {
                            var137 = class284.field4403[var139];
                        }
                        var136 = (var138 & 0x7AEF) >> 11;
                    }
                    if (var137 != null) {
                        class107 var140 = var137.method2100(2000117776);
                        if (var140.field1413 != null && var140.field1413[var136] != null) {
                            var125 -= var140.field1413[var136][1];
                            int var141 = var140.field1413[var136][2];
                            int var142 = var140.field1413[var136][0];
                            int var143 = class31.field467[var137.field4715];
                            int var144 = class31.field451[var137.field4715];
                            int var145 = var141 * var143 + (var142 * var144) >> 16;
                            int var146 = var141 * var144 - (var142 * var143) >> 16;
                            var133 += var145;
                            var131 += var146;
                        }
                    }
                }
                int var148 = var121 * 64;
                class99 var149 = new class99(var124, class154.field2392, var133, var131, class320.method2245((byte) -119, var131, class154.field2392, var133) - var125, class229.field3595 + var127, class229.field3595 + var128, var129, var130, var123, var126);
                var149.method693(class320.method2245((byte) -114, var148, class154.field2392, var132) - var126, (byte) 105, var148, var132, var127 + class229.field3595);
                class314.field4913.method19(new class116(var149), -1058);
            }
        } else if (class30.field449 == 214) {
            int var109 = class111.field1544.method68(-4325);
            if (var109 == 65535) {
                var109 = -1;
            }
            int var110 = class111.field1544.method38(89);
            int var111 = var110 >> 2;
            int var112 = var110 & 0x3;
            int var113 = class95.field1260[var111];
            int var114 = class111.field1544.method38(85);
            int var115 = class120.field1673 + ((var114 & 0x79) >> 4);
            int var116 = (var114 & 0x7) + class282.field4362;
            class220.method1612((byte) 50, var113, var109, var112, var116, class154.field2392, var115, var111);
        } else if (class30.field449 == 104) {
            int var26 = class111.field1544.method58(-288140008);
            int var27 = (var26 & 0x7) + class282.field4362;
            int var28 = ((var26 & 0x74) >> 4) + class120.field1673;
            int var29 = var28 + class111.field1544.method83((byte) -83);
            int var30 = var27 + class111.field1544.method83((byte) -117);
            int var31 = class111.field1544.method78((byte) -47);
            int var32 = class111.field1544.method39((byte) 40);
            int var33 = class111.field1544.method58(-288140008) * 4;
            int var34 = class111.field1544.method58(-288140008) * 4;
            int var35 = class111.field1544.method39((byte) 110);
            int var36 = class111.field1544.method39((byte) 98);
            int var37 = class111.field1544.method58(-288140008);
            int var38 = class111.field1544.method58(-288140008);
            if (var37 == 255) {
                var37 = -1;
            }
            if (var28 >= 0 && var27 >= 0 && var28 < 104 && var27 < 104 && var29 >= 0 && var30 >= 0 && var29 < 104 && var30 < 104 && var32 != 65535) {
                int var39 = var28 * 128 + 64;
                int var40 = var29 * 128 + 64;
                int var41 = var27 * 128 + 64;
                int var42 = var30 * 128 + 64;
                class99 var43 = new class99(var32, class154.field2392, var39, var41, class320.method2245((byte) -18, var41, class154.field2392, var39) - var33, class229.field3595 + var35, class229.field3595 + var36, var37, var38, var31, var34);
                var43.method693(class320.method2245((byte) -56, var42, class154.field2392, var40) - var34, (byte) 57, var42, var40, class229.field3595 + var35);
                class314.field4913.method19(new class116(var43), -1058);
            }
        } else {
            if (class30.field449 == 20) {
                int var44 = class111.field1544.method85(1);
                int var45 = var44 >> 2;
                int var46 = var44 & 0x3;
                byte var47 = class111.field1544.method77(2);
                byte var48 = class111.field1544.method93(-114);
                byte var49 = class111.field1544.method84(false);
                byte var50 = class111.field1544.method77(2);
                int var51 = class111.field1544.method58(-288140008);
                int var52 = class120.field1673 + (var51 >> 4 & 0x7);
                int var53 = (var51 & 0x7) + class282.field4362;
                int var54 = class111.field1544.method32(122);
                int var55 = class111.field1544.method39((byte) 44);
                int var56 = class111.field1544.method89(101);
                int var57 = class111.field1544.method68(-4325);
                if (!class109.field1458) {
                    class175.method1292(var50, var57, var55, var53, 0, var45, var46, var47, var54, var52, var48, var56, var49);
                }
            }
            if (class30.field449 == 177) {
                int var58 = class111.field1544.method68(-4325);
                int var59 = class111.field1544.method42((byte) 18);
                int var60 = ((var59 & 0x72) >> 4) + class120.field1673;
                int var61 = (var59 & 0x7) + class282.field4362;
                int var62 = class111.field1544.method89(79);
                if (var60 >= 0 && var61 >= 0 && var60 < 104 && var61 < 104) {
                    class81 var63 = new class81();
                    var63.field1097 = var62;
                    var63.field1100 = var58;
                    if (class304.field4750[class154.field2392][var60][var61] == null) {
                        class304.field4750[class154.field2392][var60][var61] = new class5();
                    }
                    class304.field4750[class154.field2392][var60][var61].method19(new class132(var63), -1058);
                    class68.method537(-111, var61, var60);
                }
            } else {
                int var64 = 91 / ((arg0 - 41) / 62);
                if (class30.field449 == 239) {
                    int var101 = class111.field1544.method38(61);
                    int var102 = var101 >> 2;
                    int var103 = var101 & 0x3;
                    int var104 = class95.field1260[var102];
                    int var105 = class111.field1544.method85(1);
                    int var106 = ((var105 & 0x7C) >> 4) + class120.field1673;
                    int var107 = class282.field4362 + (var105 & 0x7);
                    int var108 = class111.field1544.method72((byte) -66);
                    if (var106 >= 0 && var107 >= 0 && var106 < 104 && var107 < 104) {
                        class84.method611(var106, var103, var102, var108, var104, 0, -126, -1, class154.field2392, var107);
                    }
                } else if (class30.field449 == 121) {
                    int var65 = class111.field1544.method58(-288140008);
                    int var66 = class282.field4362 * 2 + (var65 & 0xF);
                    int var67 = ((var65 & 0xF5) >> 4) + class120.field1673 * 2;
                    int var68 = var67 + class111.field1544.method83((byte) -103);
                    int var69 = var66 + class111.field1544.method83((byte) -83);
                    int var70 = class111.field1544.method78((byte) -33);
                    int var71 = class111.field1544.method39((byte) 117);
                    int var72 = class111.field1544.method58(-288140008) * 4;
                    int var73 = class111.field1544.method58(-288140008) * 4;
                    int var74 = class111.field1544.method39((byte) 42);
                    int var75 = class111.field1544.method39((byte) 84);
                    int var76 = class111.field1544.method58(-288140008);
                    int var77 = class111.field1544.method58(-288140008);
                    if (var76 == 255) {
                        var76 = -1;
                    }
                    if (var67 >= 0 && var66 >= 0 && var67 < 208 && var66 < 208 && var68 >= 0 && var69 >= 0 && var68 < 208 && var69 < 208 && var71 != 65535) {
                        int var78 = var68 * 64;
                        int var79 = var69 * 64;
                        int var80 = var67 * 64;
                        int var81 = var66 * 64;
                        class99 var82 = new class99(var71, class154.field2392, var80, var81, class320.method2245((byte) -57, var81, class154.field2392, var80) - var72, class229.field3595 + var74, var75 + class229.field3595, var76, var77, var70, var73);
                        var82.method693(class320.method2245((byte) -60, var79, class154.field2392, var78) - var73, (byte) 94, var79, var78, class229.field3595 + var74);
                        class314.field4913.method19(new class116(var82), -1058);
                    }
                } else if (class30.field449 == 52) {
                    int var83 = class111.field1544.method58(-288140008);
                    int var84 = ((var83 & 0x70) >> 4) + class120.field1673;
                    int var85 = (var83 & 0x7) + class282.field4362;
                    int var86 = class111.field1544.method39((byte) 81);
                    int var87 = class111.field1544.method39((byte) 83);
                    int var88 = class111.field1544.method39((byte) 54);
                    if (var84 >= 0 && var85 >= 0 && var84 < 104 && var85 < 104) {
                        class5 var89 = class304.field4750[class154.field2392][var84][var85];
                        if (var89 != null) {
                            for (class132 var90 = (class132) var89.method22((byte) 117); var90 != null; var90 = (class132) var89.method26((byte) -121)) {
                                class81 var91 = var90.field1947;
                                if ((var86 & 0x7FFF) == var91.field1097 && var91.field1100 == var87) {
                                    var91.field1100 = var88;
                                    break;
                                }
                            }
                            class68.method537(-112, var85, var84);
                        }
                    }
                } else if (class30.field449 == 176) {
                    int var92 = class111.field1544.method58(-288140008);
                    int var93 = var92 & 0x3;
                    int var94 = var92 >> 2;
                    int var95 = class95.field1260[var94];
                    int var96 = class111.field1544.method38(108);
                    int var97 = class120.field1673 + ((var96 & 0x7D) >> 4);
                    int var98 = (var96 & 0x7) + class282.field4362;
                    if (var97 >= 0 && var98 >= 0 && var97 < 104 && var98 < 104) {
                        class84.method611(var97, var93, var94, -1, var95, 0, 110, -1, class154.field2392, var98);
                    }
                } else if (class30.field449 == 96) {
                    int var99 = class111.field1544.method39((byte) 34);
                    int var100 = class111.field1544.method58(-288140008);
                    class249.method1790(46, var99).method873(var100, -1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIILgh;JZ)V", line = 630)
    public static final void method580(int arg0, int arg1, int arg2, int arg3, class248 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class138 var8 = new class138();
        var8.field2205 = arg4;
        var8.field2202 = arg1 * 128 + 64;
        var8.field2201 = arg2 * 128 + 64;
        var8.field2207 = arg3;
        var8.field2200 = arg5;
        var8.field2198 = arg6;
        if (class83.field1138[arg0][arg1][arg2] == null) {
            class83.field1138[arg0][arg1][arg2] = new class124(arg0, arg1, arg2);
        }
        class83.field1138[arg0][arg1][arg2].field1788 = var8;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Z)V", line = 652)
    public static final void method581(boolean arg0) {
        if (!arg0) {
            method581(true);
        }
        class52 var1 = class81.field1099;
        synchronized (class81.field1099) {
            class113.field1590 = class4.field33;
            class238.field3732++;
            if (class279.field4301 >= 0) {
                while (class42.field577 != class279.field4301) {
                    int var3 = class4.field36[class42.field577];
                    class42.field577 = class42.field577 + 1 & 0x7F;
                    if (var3 >= 0) {
                        class260.field4093[var3] = true;
                    } else {
                        class260.field4093[~var3] = false;
                    }
                }
            } else {
                for (int var2 = 0; var2 < 112; var2++) {
                    class260.field4093[var2] = false;
                }
                class279.field4301 = class42.field577;
            }
            class4.field33 = class328.field5143;
        }
        field1053++;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V", line = 694)
    public static void method582(int arg0) {
        field1044 = null;
        field1051 = null;
        if (arg0 <= -1) {
            field1054 = null;
            field1048 = null;
        }
    }
}
