import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class305 {

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "I")
    public int field4355 = -1;

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "I")
    public static int field4362 = 0;

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "I")
    public static int field4357;

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "Lq;")
    public class246 field4359;

    @OriginalMember(owner = "client!ni", name = "j", descriptor = "[I")
    public int[] field4364;

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field4360;

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "[Ljava/lang/String;")
    public String[] field4361;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V")
    public static void method1913(int arg0) {
        field4360 = null;
        if (arg0 != 7) {
            field4362 = 108;
        }
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)V")
    public static final void method1914(int arg0) {
        if (arg0 < 41) {
            return;
        }
        field4356++;
        if (class367.field5358 == 13) {
            int var1 = class249.field3379.method1342((byte) -128);
            int var2 = class299.field4265 + ((var1 & 0x7C) >> 4);
            int var3 = (var1 & 0x7) + class173.field2414;
            int var4 = class249.field3379.method1355(32136);
            if (var2 >= 0 && var3 >= 0 && class279.field3935 > var2 && var3 < class164.field2287) {
                class111 var5 = (class111) class319.field4527.method1204((byte) -90, (long) (var2 | var3 << 14 | class410.field5931 << 28));
                if (var5 != null) {
                    for (class437 var6 = (class437) var5.field1280.method1124(-1); var6 != null; var6 = (class437) var5.field1280.method1119(false)) {
                        if ((var4 & 0x7FFF) == var6.field6402) {
                            var6.method2290((byte) 98);
                            break;
                        }
                    }
                    if (var5.field1280.method1122(-5874)) {
                        var5.method2290((byte) 98);
                    }
                    class32.method187(class410.field5931, 112, var3, var2);
                }
            }
        } else if (class367.field5358 == 116) {
            int var7 = class249.field3379.method1355(32136);
            int var8 = class249.field3379.method1342((byte) -126);
            class157.method1036(0, var7).method2019(var8, -2330);
        } else if (class367.field5358 == 24) {
            int var9 = class249.field3379.method1385(-125);
            int var10 = class249.field3379.method1355(32136);
            int var11 = class249.field3379.method1355(32136);
            int var12 = class249.field3379.method1342((byte) -126);
            int var13 = class299.field4265 + ((var12 & 0x77) >> 4);
            int var14 = class173.field2414 + (var12 & 0x7);
            if (var13 >= 0 && var14 >= 0 && class279.field3935 > var13 && var14 < class164.field2287 && class188.field2547 != var11) {
                class274.method1736(var14, new class437(var10, var9), false, var13, class410.field5931);
                class32.method187(class410.field5931, 125, var14, var13);
            }
        } else if (class367.field5358 == 44) {
            int var15 = class249.field3379.method1342((byte) -127);
            int var16 = (var15 >> 4 & 0x7) + class299.field4265;
            int var17 = class173.field2414 + (var15 & 0x7);
            int var18 = class249.field3379.method1355(32136);
            int var19 = class249.field3379.method1355(32136);
            int var20 = class249.field3379.method1355(32136);
            if (class319.field4527 != null && var16 >= 0 && var17 >= 0 && var16 < class279.field3935 && class164.field2287 > var17) {
                class111 var21 = (class111) class319.field4527.method1204((byte) -69, (long) (var16 | class410.field5931 << 28 | var17 << 14));
                if (var21 != null) {
                    for (class437 var22 = (class437) var21.field1280.method1124(-1); var22 != null; var22 = (class437) var21.field1280.method1119(false)) {
                        if ((var18 & 0x7FFF) == var22.field6402 && var22.field6401 == var19) {
                            var22.method2290((byte) 98);
                            var22.field6401 = var20;
                            class274.method1736(var17, var22, false, var16, class410.field5931);
                            break;
                        }
                    }
                    class32.method187(class410.field5931, 118, var17, var16);
                }
            }
        } else if (class367.field5358 == 42) {
            int var23 = class249.field3379.method1377(29247);
            int var24 = class249.field3379.method1395(116);
            int var25 = var24 >> 2;
            int var26 = var24 & 0x3;
            int var27 = class98.field1108[var25];
            int var28 = class249.field3379.method1382(-28295);
            int var29 = class299.field4265 + ((var28 & 0x74) >> 4);
            int var30 = (var28 & 0x7) + class173.field2414;
            if (var29 >= 0 && var30 >= 0 && class279.field3935 > var29 && var30 < class164.field2287) {
                class448.method2778(var29, class410.field5931, var23, false, var26, var30, var27, 0, -1, var25);
            }
        } else if (class367.field5358 == 244) {
            int var31 = class249.field3379.method1342((byte) -127);
            int var32 = ((var31 & 0xFD) >> 4) + class299.field4265 * 2;
            int var33 = (var31 & 0xF) + class173.field2414 * 2;
            int var34 = var32 + class249.field3379.method1373((byte) 30);
            int var35 = var33 + class249.field3379.method1373((byte) 30);
            int var36 = class249.field3379.method1344((byte) -4);
            int var37 = class249.field3379.method1355(32136);
            int var38 = class249.field3379.method1342((byte) -128) * 4;
            int var39 = class249.field3379.method1342((byte) -128) * 4;
            int var40 = class249.field3379.method1355(32136);
            int var41 = class249.field3379.method1355(32136);
            int var42 = class249.field3379.method1342((byte) -127);
            int var43 = class249.field3379.method1342((byte) -127);
            if (var42 == 255) {
                var42 = -1;
            }
            if (var32 >= 0 && var33 >= 0 && var32 < 208 && var33 < 208 && var34 >= 0 && var35 >= 0 && var34 < 208 && var35 < 208 && var37 != 65535) {
                int var44 = var33 * 64;
                int var45 = var35 * 64;
                int var46 = var34 * 64;
                int var47 = var32 * 64;
                class426 var48 = new class426(var37, class410.field5931, var47, var44, class372.method2335(var44, class410.field5931, (byte) 26, var47) - var38, var40 - -class221.field3033, var41 + class221.field3033, var42, var43, var36, var39);
                var48.method2654(0, var45, class372.method2335(var45, class410.field5931, (byte) 92, var46) - var39, var46, var40 + class221.field3033);
                class78.field880.method1125(-1, new class63(var48));
            }
        } else if (class367.field5358 == 204) {
            int var49 = class249.field3379.method1356((byte) 45);
            int var50 = (var49 >> 4 & 0x7) + class299.field4265;
            int var51 = (var49 & 0x7) + class173.field2414;
            int var52 = class249.field3379.method1355(32136);
            int var53 = class249.field3379.method1377(29247);
            if (var50 >= 0 && var51 >= 0 && var50 < class279.field3935 && var51 < class164.field2287) {
                class274.method1736(var51, new class437(var53, var52), false, var50, class410.field5931);
                class32.method187(class410.field5931, 119, var51, var50);
            }
        } else if (class367.field5358 == 149) {
            int var54 = class249.field3379.method1395(111);
            int var55 = ((var54 & 0x74) >> 4) + class299.field4265;
            int var56 = class173.field2414 + (var54 & 0x7);
            int var57 = class249.field3379.method1395(120);
            int var58 = var57 >> 2;
            int var59 = var57 & 0x3;
            int var60 = class98.field1108[var58];
            if (var55 >= 0 && var56 >= 0 && class279.field3935 > var55 && var56 < class164.field2287) {
                class448.method2778(var55, class410.field5931, -1, false, var59, var56, var60, 0, -1, var58);
            }
        } else if (class367.field5358 == 99) {
            class249.field3379.method1342((byte) -128);
            int var61 = class249.field3379.method1342((byte) -126);
            int var62 = (var61 >> 4 & 0x7) + class299.field4265;
            int var63 = class173.field2414 + (var61 & 0x7);
            int var64 = class249.field3379.method1355(32136);
            int var65 = class249.field3379.method1342((byte) -128);
            int var66 = class249.field3379.method1353(97);
            String var67 = class249.field3379.method1350(96);
            class327.method2010(var66, var62, var67, var64, var63, var65, 22095);
        } else {
            if (class367.field5358 == 232) {
                byte var68 = class249.field3379.method1341((byte) 78);
                byte var69 = class249.field3379.method1388((byte) 104);
                int var70 = class249.field3379.method1382(-28295);
                int var71 = (var70 >> 4 & 0x7) + class299.field4265;
                int var72 = class173.field2414 + (var70 & 0x7);
                byte var73 = class249.field3379.method1351(-1);
                int var74 = class249.field3379.method1344((byte) -4);
                int var75 = class249.field3379.method1355(32136);
                int var76 = class249.field3379.method1382(-28295);
                int var77 = var76 >> 2;
                int var78 = var76 & 0x3;
                int var79 = class249.field3379.method1349(2);
                int var80 = class249.field3379.method1349(114);
                byte var81 = class249.field3379.method1388((byte) 105);
                if (!class218.field2991.method996()) {
                    class34.method196(var71, var69, var72, true, var78, var81, var77, var80, var73, var74, var79, var75, var68);
                }
            }
            if (class367.field5358 == 195) {
                int var82 = class249.field3379.method1342((byte) -126);
                int var83 = (var82 >> 4 & 0x7) + class299.field4265;
                int var84 = (var82 & 0x7) + class173.field2414;
                int var85 = var83 + class249.field3379.method1373((byte) 30);
                int var86 = class249.field3379.method1373((byte) 30) + var84;
                int var87 = class249.field3379.method1344((byte) -4);
                int var88 = class249.field3379.method1355(32136);
                int var89 = class249.field3379.method1342((byte) -128) * 4;
                int var90 = class249.field3379.method1342((byte) -126) * 4;
                int var91 = class249.field3379.method1355(32136);
                int var92 = class249.field3379.method1355(32136);
                int var93 = class249.field3379.method1342((byte) -128);
                int var94 = class249.field3379.method1342((byte) -127);
                if (var93 == 255) {
                    var93 = -1;
                }
                if (var83 >= 0 && var84 >= 0 && var83 < class279.field3935 && class164.field2287 > var84 && var85 >= 0 && var86 >= 0 && var85 < class279.field3935 && class164.field2287 > var86 && var88 != 65535) {
                    int var95 = var85 * 128 + 64;
                    int var96 = var84 * 128 + 64;
                    int var97 = var83 * 128 + 64;
                    int var98 = var86 * 128 + 64;
                    class426 var99 = new class426(var88, class410.field5931, var97, var96, class372.method2335(var96, class410.field5931, (byte) 100, var97) - var89, class221.field3033 + var91, class221.field3033 + var92, var93, var94, var87, var90);
                    var99.method2654(0, var98, class372.method2335(var98, class410.field5931, (byte) 52, var95) - var90, var95, class221.field3033 + var91);
                    class78.field880.method1125(-1, new class63(var99));
                }
            } else if (class367.field5358 == 133) {
                int var100 = class249.field3379.method1342((byte) -126);
                int var101 = (var100 >> 4 & 0x7) + class299.field4265;
                int var102 = (var100 & 0x7) + class173.field2414;
                int var103 = class249.field3379.method1355(32136);
                if (var103 == 65535) {
                    var103 = -1;
                }
                int var104 = class249.field3379.method1342((byte) -128);
                int var105 = var104 >> 4 & 0xF;
                int var106 = var104 & 0x7;
                int var107 = class249.field3379.method1342((byte) -128);
                int var108 = class249.field3379.method1342((byte) -126);
                if (var101 >= 0 && var102 >= 0 && var101 < class279.field3935 && class164.field2287 > var102) {
                    int var109 = var105 + 1;
                    if ((var101 - var109) <= class390.field5715.field6351[0] && class390.field5715.field6351[0] <= var101 + var109 && class390.field5715.field6350[0] >= var102 - var109 && class390.field5715.field6350[0] <= (var102 + var109) && class308.field4405 != 0 && var106 > 0 && class45.field544 < 50 && var103 != -1) {
                        class116.field1373[class45.field544] = var103;
                        class56.field632[class45.field544] = var106;
                        class119.field1560[class45.field544] = var107;
                        class236.field3210[class45.field544] = null;
                        class268.field3768[class45.field544] = (var101 << 16) + (var102 << 8) + var105;
                        class83.field932[class45.field544] = var108;
                        class45.field544++;
                    }
                }
            } else if (class367.field5358 == 78) {
                int var110 = class249.field3379.method1342((byte) -128);
                int var111 = ((var110 & 0xF3) >> 4) + class299.field4265 * 2;
                int var112 = (var110 & 0xF) + class173.field2414 * 2;
                int var113 = var111 + class249.field3379.method1373((byte) 30);
                int var114 = var112 + class249.field3379.method1373((byte) 30);
                int var115 = class249.field3379.method1344((byte) -4);
                int var116 = class249.field3379.method1344((byte) -4);
                int var117 = class249.field3379.method1355(32136);
                int var118 = class249.field3379.method1373((byte) 30);
                int var119 = class249.field3379.method1342((byte) -127) * 4;
                int var120 = class249.field3379.method1355(32136);
                int var121 = class249.field3379.method1355(32136);
                int var122 = class249.field3379.method1342((byte) -126);
                if (var122 == 255) {
                    var122 = -1;
                }
                int var123 = class249.field3379.method1342((byte) -126);
                if (var111 >= 0 && var112 >= 0 && var111 < 208 && var112 < 208 && var113 >= 0 && var114 >= 0 && var113 < 208 && var114 < 208 && var117 != 65535) {
                    int var124 = var112 * 64;
                    int var125 = var113 * 64;
                    int var126 = var114 * 64;
                    int var127 = var111 * 64;
                    if (var115 != 0) {
                        int var130;
                        class433 var131;
                        if (var115 >= 0) {
                            int var128 = var115 - 1;
                            int var129 = var128 & 0x7FF;
                            var130 = (var128 & 0x7DC3) >> 11;
                            var131 = class81.field917[var129];
                        } else {
                            int var132 = -var115 - 1;
                            var130 = (var132 & 0x7FFC) >> 11;
                            int var133 = var132 & 0x7FF;
                            if (class188.field2547 == var133) {
                                var131 = class390.field5715;
                            } else {
                                var131 = class375.field5473[var133];
                            }
                        }
                        if (var131 != null) {
                            class270 var134 = var131.method2697((byte) 93);
                            if (var134.field3833 != null && var134.field3833[var130] != null) {
                                int var135 = var134.field3833[var130][0];
                                int var136 = var134.field3833[var130][2];
                                int var137 = var131.field6289.method2776(126);
                                int var138 = class286.field4025[var137];
                                int var139 = class286.field4035[var137];
                                int var140 = var135 * var139 + var136 * var138 >> 15;
                                int var141 = var136 * var139 - (var135 * var138) >> 15;
                                var127 += var140;
                                var118 -= var134.field3833[var130][1];
                                var124 += var141;
                            }
                        }
                    }
                    class426 var143 = new class426(var117, class410.field5931, var127, var124, class372.method2335(var124, class410.field5931, (byte) 30, var127) - var118, var120 - -class221.field3033, class221.field3033 + var121, var122, var123, var116, var119);
                    var143.method2654(0, var126, class372.method2335(var126, class410.field5931, (byte) 57, var125) - var119, var125, class221.field3033 + var120);
                    class78.field880.method1125(-1, new class63(var143));
                }
            } else if (class367.field5358 == 141) {
                int var144 = class249.field3379.method1356((byte) -86);
                int var145 = var144 >> 2;
                int var146 = var144 & 0x3;
                int var147 = class98.field1108[var145];
                int var148 = class249.field3379.method1382(-28295);
                int var149 = class299.field4265 + ((var148 & 0x75) >> 4);
                int var150 = class173.field2414 + (var148 & 0x7);
                int var151 = class249.field3379.method1377(29247);
                if (var151 == 65535) {
                    var151 = -1;
                }
                class83.method454((byte) 60, var150, var146, var147, var149, var145, class410.field5931, var151);
            } else if (class367.field5358 == 183) {
                int var152 = class249.field3379.method1342((byte) -128);
                int var153 = ((var152 & 0x72) >> 4) + class299.field4265;
                int var154 = (var152 & 0x7) + class173.field2414;
                int var155 = class249.field3379.method1355(32136);
                int var156 = class249.field3379.method1342((byte) -126);
                int var157 = class249.field3379.method1355(32136);
                if (var153 >= 0 && var154 >= 0 && var153 < class279.field3935 && var154 < class164.field2287) {
                    int var158 = var153 * 128 + 64;
                    int var159 = var154 * 128 + 64;
                    class227 var160 = new class227(var155, var157, class221.field3033, class410.field5931, var158, class372.method2335(var159, class410.field5931, (byte) 92, var158) - var156, var159, var153, var153, var154, var154);
                    class334.field4906.method1125(-1, new class423(var160));
                }
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)V")
    public static final void method1915(int arg0, String arg1, int arg2, String arg3) {
        class289.field4101 = arg3;
        class261.field3605 = arg2;
        field4357++;
        class93.field1033 = arg1;
        if (class93.field1033.equals("") || class289.field4101.equals("")) {
            class159.field2251 = 3;
        } else if (class23.field229 == -1) {
            class386.field5654 = 0;
            class78.field883 = 0;
            class159.field2251 = -3;
            class351.field5127 = 1;
            class211 var4 = new class211(128);
            var4.method1396(21375, 10);
            var4.method1361((byte) -121, (int) (Math.random() * 9.9999999E7D));
            var4.method1381(1024975824, class190.method1215(-1, class93.field1033));
            var4.method1361((byte) -125, (int) (Math.random() * 9.9999999E7D));
            var4.method1359((byte) 0, class289.field4101);
            var4.method1361((byte) -124, (int) (Math.random() * 9.9999999E7D));
            var4.method1369(class221.field3027, -117, class301.field4285);
            class169.field2360.field2888 = 0;
            class169.field2360.method1396(21375, 24);
            class169.field2360.method1396(21375, arg0 + var4.field2888);
            class169.field2360.method1380(560, (byte) -8);
            class169.field2360.method1360(0, var4.field2867, var4.field2888, 1);
        } else {
            class329.method2037(arg0 ^ 0x2);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "([[BI[[B[[BZ[[ILac;B[[BLen;Lac;II)V")
    public static final void method1916(byte[][] arg0, int arg1, byte[][] arg2, byte[][] arg3, boolean arg4, int[][] arg5, class319 arg6, byte arg7, byte[][] arg8, class174 arg9, class319 arg10, int arg11, int arg12) {
        field4363++;
        if (arg7 < 99) {
            method1913(-115);
        }
        for (int var13 = 0; var13 < arg12; var13++) {
            int var14 = (arg12 - 1) > var13 ? var13 + 1 : var13;
            for (int var15 = 0; var15 < arg1; var15++) {
                int var16 = arg1 - 1 > var15 ? var15 + 1 : var15;
                if (class257.method1613(-122) || class139.method831(var13, class356.field5209, arg11, var15, (byte) -45)) {
                    boolean var17 = false;
                    boolean var18 = false;
                    boolean[] var19 = new boolean[4];
                    int var20 = arg3[var13][var15];
                    int var21 = arg0[var13][var15];
                    int var22 = arg8[var13][var15] & 0xFF;
                    int var23 = arg2[var13][var15] & 0xFF;
                    int var24 = arg2[var13][var16] & 0xFF;
                    int var25 = arg2[var14][var16] & 0xFF;
                    int var26 = arg2[var14][var15] & 0xFF;
                    if (var22 != 0 || var23 != 0) {
                        class190 var27 = var22 == 0 ? null : class196.method1260(var22 - 1, 93);
                        if (var20 == 0 && var27 == null) {
                            var20 = 12;
                        }
                        class151 var28 = var23 == 0 ? null : class52.method311(82, var23 - 1);
                        class190 var29 = var27;
                        if (var27 != null) {
                            if (var27.field2596 == -1 && var27.field2581 == -1) {
                                var29 = var27;
                                var27 = null;
                            } else if (var28 != null && var20 != 0) {
                                var18 = var27.field2585;
                            }
                        }
                        if ((var20 == 0 || var20 == 12) && var13 > 0 && var15 > 0 && var13 < arg12 && var15 < arg1) {
                            byte var30 = 0;
                            byte var31 = 0;
                            byte var32 = 0;
                            int var33 = var31 + (arg2[var14][var15 - 1] == var23 ? 1 : -1);
                            byte var34 = 0;
                            int var35 = var32 + (arg2[var14][var16] == var23 ? 1 : -1);
                            int var36 = var30 + (arg2[var13 - 1][var15 - 1] == var23 ? 1 : -1);
                            int var37 = var34 + (arg2[var13 - 1][var16] == var23 ? 1 : -1);
                            if (arg2[var13][var15 - 1] == var23) {
                                var33++;
                                var36++;
                            } else {
                                var33--;
                                var36--;
                            }
                            if (arg2[var14][var15] == var23) {
                                var33++;
                                var35++;
                            } else {
                                var35--;
                                var33--;
                            }
                            if (arg2[var13][var16] == var23) {
                                var35++;
                                var37++;
                            } else {
                                var35--;
                                var37--;
                            }
                            if (arg2[var13 - 1][var15] == var23) {
                                var36++;
                                var37++;
                            } else {
                                var37--;
                                var36--;
                            }
                            int var38 = var36 - var35;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            int var39 = var33 - var37;
                            if (var39 < 0) {
                                var39 = -var39;
                            }
                            if (var38 == var39) {
                                var38 = arg10.method1990(var13, var15) - arg10.method1990(var14, var16);
                                var39 = arg10.method1990(var14, var15) - arg10.method1990(var13, var16);
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                                if (var39 < 0) {
                                    var39 = -var39;
                                }
                            }
                            var21 = var39 > var38 ? 1 : 0;
                        }
                        for (int var40 = 0; var40 < 13; var40++) {
                            class178.field2459[var40] = -1;
                            class440.field6444[var40] = 1;
                        }
                        boolean[] var41 = var27 != null && var27.field2585 ? class248.field3368[var20] : class115.field1350[var20];
                        class314.method1964(var20, var21, (byte) -109, var13, arg3, arg0, arg9, arg1, var27, var19, arg8, var28, arg12, var15);
                        boolean var42 = var27 != null && var27.field2596 != var27.field2581;
                        if (!var42) {
                            for (int var43 = 0; var43 < 8; var43++) {
                                if (class178.field2459[var43] >= 0 && class444.field6495[var43] != class303.field4335[var43]) {
                                    var42 = true;
                                    break;
                                }
                            }
                        }
                        if (!var41[var21 + 1 & 0x3]) {
                            var19[1] = class118.method663(var19[1], class40.method253(class440.field6444[2], class440.field6444[4]) == 0);
                        }
                        if (!var41[var21 + 3 & 0x3]) {
                            var19[3] = class118.method663(var19[3], class40.method253(class440.field6444[0], class440.field6444[6]) == 0);
                        }
                        if (!var41[var21 & 0x3]) {
                            var19[0] = class118.method663(var19[0], class40.method253(class440.field6444[2], class440.field6444[0]) == 0);
                        }
                        if (!var41[var21 + 2 & 0x3]) {
                            var19[2] = class118.method663(var19[2], class40.method253(class440.field6444[4], class440.field6444[6]) == 0);
                        }
                        if (!var18 && (var20 == 0 || var20 == 12)) {
                            if (var19[0] && !var19[1] && !var19[2] && var19[3]) {
                                var19[0] = var19[3] = false;
                                var20 = var20 == 0 ? 13 : 14;
                                var21 = 0;
                            } else if (var19[0] && var19[1] && !var19[2] && !var19[3]) {
                                var19[0] = var19[1] = false;
                                var21 = 3;
                                var20 = var20 == 0 ? 13 : 14;
                            } else if (!var19[0] && var19[1] && var19[2] && !var19[3]) {
                                var19[1] = var19[2] = false;
                                var20 = var20 == 0 ? 13 : 14;
                                var21 = 2;
                            } else if (!var19[0] && !var19[1] && var19[2] && var19[3]) {
                                var19[2] = var19[3] = false;
                                var21 = 1;
                                var20 = var20 == 0 ? 13 : 14;
                            }
                        }
                        boolean var44 = !var18 && !var19[0] && !var19[2] && !var19[1] && !var19[3];
                        int[] var45 = null;
                        int[] var46;
                        int var47;
                        int var48;
                        int[] var49;
                        int[] var50;
                        if (var44) {
                            var46 = class435.field6380[var20];
                            var47 = var27 == null ? 0 : class192.field2624[var20];
                            var48 = var28 == null ? 0 : class156.field2222[var20];
                            var49 = class57.field673[var20];
                            var50 = class407.field5916[var20];
                        } else if (var18) {
                            var49 = class159.field2253[var20];
                            var47 = var27 == null ? 0 : class12.field126[var20];
                            var50 = class450.field6567[var20];
                            var45 = class201.field2778[var20];
                            var46 = class270.field3826[var20];
                            var48 = var28 == null ? 0 : class6.field67[var20];
                        } else {
                            var46 = class56.field630[var20];
                            var49 = class109.field1259[var20];
                            var45 = class132.field1810[var20];
                            var48 = var28 == null ? 0 : class66.field746[var20];
                            var47 = var27 == null ? 0 : class379.field5577[var20];
                            var50 = class274.field3877[var20];
                        }
                        int var51 = var47 + var48;
                        if (var51 <= 0) {
                            class252.method1578(arg11, var13, var15);
                        } else {
                            if (var19[0]) {
                                var51++;
                            }
                            if (var19[2]) {
                                var51++;
                            }
                            if (var19[1]) {
                                var51++;
                            }
                            if (var19[3]) {
                                var51++;
                            }
                            int var52 = 0;
                            int var53 = 0;
                            int var54 = var51 * 3;
                            int[] var55 = arg4 ? new int[var54] : null;
                            int[] var56 = var42 ? new int[var54] : null;
                            int[] var57 = new int[var54];
                            int[] var58 = new int[var54];
                            int[] var59 = new int[var54];
                            int[] var60 = new int[var54];
                            int[] var61 = new int[var54];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var27 != null) {
                                var62 = var27.field2596;
                                var63 = arg9.method996() ? var27.field2584 : var27.field2592;
                                var64 = var27.field2582;
                                int var65 = class344.method2205(arg9, var27, 127);
                                for (int var66 = 0; var66 < var47; var66++) {
                                    boolean var67 = false;
                                    byte var68;
                                    if (var19[-var21 & 0x3] && var45[0] == var52) {
                                        class338.field5006[0] = var49[var52];
                                        class338.field5006[1] = 1;
                                        class338.field5006[2] = var50[var52];
                                        class338.field5006[3] = 1;
                                        class338.field5006[4] = var46[var52];
                                        var68 = 6;
                                        class338.field5006[5] = var50[var52];
                                    } else if (var19[2 - var21 & 0x3] && var45[2] == var52) {
                                        class338.field5006[0] = var49[var52];
                                        class338.field5006[1] = 5;
                                        class338.field5006[2] = var50[var52];
                                        class338.field5006[3] = 5;
                                        class338.field5006[4] = var46[var52];
                                        class338.field5006[5] = var50[var52];
                                        var68 = 6;
                                    } else if (var19[1 - var21 & 0x3] && var45[1] == var52) {
                                        class338.field5006[0] = var49[var52];
                                        class338.field5006[1] = 3;
                                        class338.field5006[2] = var50[var52];
                                        class338.field5006[3] = 3;
                                        class338.field5006[4] = var46[var52];
                                        class338.field5006[5] = var50[var52];
                                        var68 = 6;
                                    } else if (var19[3 - var21 & 0x3] && var45[3] == var52) {
                                        class338.field5006[0] = var49[var52];
                                        class338.field5006[1] = 7;
                                        class338.field5006[2] = var50[var52];
                                        class338.field5006[3] = 7;
                                        class338.field5006[4] = var46[var52];
                                        class338.field5006[5] = var50[var52];
                                        var68 = 6;
                                    } else {
                                        class338.field5006[0] = var49[var52];
                                        class338.field5006[1] = var46[var52];
                                        var68 = 3;
                                        class338.field5006[2] = var50[var52];
                                    }
                                    var52++;
                                    for (int var69 = 0; var69 < var68; var69++) {
                                        int var70 = class338.field5006[var69];
                                        int var71 = var70 - (var21 * 2) & 0x7;
                                        int var72 = class344.field5064[var70];
                                        int var73 = class102.field1168[var70];
                                        if (var21 == 1) {
                                            var57[var53] = var73;
                                            var58[var53] = 128 - var72;
                                        } else if (var21 == 2) {
                                            var57[var53] = 128 - var72;
                                            var58[var53] = 128 - var73;
                                        } else if (var21 == 3) {
                                            var57[var53] = 128 - var73;
                                            var58[var53] = var72;
                                        } else {
                                            var57[var53] = var72;
                                            var58[var53] = var73;
                                        }
                                        if (arg4 && class349.field5104[var20][var70]) {
                                            int var74 = (var13 << 7) + var57[var53];
                                            int var75 = (var15 << 7) + var58[var53];
                                            var55[var53] = arg6.method1991(var74, var75) - arg10.method1991(var74, var75);
                                        }
                                        if (var70 < 8 && var27.field2595 < class178.field2459[var71]) {
                                            if (var56 != null) {
                                                var56[var53] = class303.field4335[var71];
                                            }
                                            var61[var53] = class72.field817[var71];
                                            var60[var53] = class191.field2607[var71];
                                            var59[var53] = class444.field6495[var71];
                                        } else {
                                            if (var56 != null) {
                                                var56[var53] = var65;
                                            }
                                            var60[var53] = arg9.method996() ? var27.field2584 : var27.field2592;
                                            var61[var53] = var27.field2582;
                                            var59[var53] = var62;
                                        }
                                        var53++;
                                    }
                                }
                                if (!arg4 && arg11 == 0) {
                                    class410.method2576(var13, var15, var27.field2590, var27.field2589 * 8);
                                }
                                if (var20 != 12 && var27.field2596 != -1 && var27.field2597) {
                                    var17 = true;
                                }
                            } else if (var44) {
                                var52 += class192.field2624[var20];
                            } else if (var18) {
                                var52 += class12.field126[var20];
                            } else {
                                var52 += class379.field5577[var20];
                            }
                            if (var28 != null) {
                                if (var25 == 0) {
                                    var25 = var23;
                                }
                                if (var24 == 0) {
                                    var24 = var23;
                                }
                                if (var26 == 0) {
                                    var26 = var23;
                                }
                                class151 var76 = class52.method311(122, var23 - 1);
                                class151 var77 = class52.method311(88, var24 - 1);
                                class151 var78 = class52.method311(-74, var25 - 1);
                                class151 var79 = class52.method311(58, var26 - 1);
                                for (int var80 = 0; var80 < var48; var80++) {
                                    boolean var81 = false;
                                    byte var82;
                                    if (var19[-var21 & 0x3] && var45[0] == var52) {
                                        class338.field5006[0] = var49[var52];
                                        class338.field5006[1] = 1;
                                        class338.field5006[2] = var50[var52];
                                        class338.field5006[3] = 1;
                                        class338.field5006[4] = var46[var52];
                                        var82 = 6;
                                        class338.field5006[5] = var50[var52];
                                    } else if (var19[2 - var21 & 0x3] && var45[2] == var52) {
                                        class338.field5006[0] = var49[var52];
                                        class338.field5006[1] = 5;
                                        class338.field5006[2] = var50[var52];
                                        class338.field5006[3] = 5;
                                        class338.field5006[4] = var46[var52];
                                        var82 = 6;
                                        class338.field5006[5] = var50[var52];
                                    } else if (var19[1 - var21 & 0x3] && var45[1] == var52) {
                                        class338.field5006[0] = var49[var52];
                                        class338.field5006[1] = 3;
                                        class338.field5006[2] = var50[var52];
                                        class338.field5006[3] = 3;
                                        class338.field5006[4] = var46[var52];
                                        class338.field5006[5] = var50[var52];
                                        var82 = 6;
                                    } else if (var19[3 - var21 & 0x3] && var45[3] == var52) {
                                        class338.field5006[0] = var49[var52];
                                        class338.field5006[1] = 7;
                                        class338.field5006[2] = var50[var52];
                                        class338.field5006[3] = 7;
                                        class338.field5006[4] = var46[var52];
                                        class338.field5006[5] = var50[var52];
                                        var82 = 6;
                                    } else {
                                        class338.field5006[0] = var49[var52];
                                        class338.field5006[1] = var46[var52];
                                        var82 = 3;
                                        class338.field5006[2] = var50[var52];
                                    }
                                    for (int var83 = 0; var83 < var82; var83++) {
                                        int var84 = class338.field5006[var83];
                                        int var85 = var84 - (var21 * 2) & 0x7;
                                        int var86 = class344.field5064[var84];
                                        int var87 = class102.field1168[var84];
                                        int var88;
                                        int var89;
                                        if (var21 == 1) {
                                            var89 = 128 - var86;
                                            var88 = var87;
                                        } else if (var21 == 2) {
                                            var88 = 128 - var86;
                                            var89 = 128 - var87;
                                        } else if (var21 == 3) {
                                            var88 = 128 - var87;
                                            var89 = var86;
                                        } else {
                                            var88 = var86;
                                            var89 = var87;
                                        }
                                        var57[var53] = var88;
                                        var58[var53] = var89;
                                        if (arg4 && class349.field5104[var20][var84]) {
                                            int var90 = (var13 << 7) + var88;
                                            int var91 = (var15 << 7) + var89;
                                            var55[var53] = arg6.method1991(var90, var91) - arg10.method1991(var90, var91);
                                        }
                                        if (var84 < 8 && class178.field2459[var85] >= 0) {
                                            if (var56 != null) {
                                                var56[var53] = class303.field4335[var85];
                                            }
                                            var61[var53] = class72.field817[var85];
                                            var60[var53] = class191.field2607[var85];
                                            var59[var53] = class444.field6495[var85];
                                        } else {
                                            if (var18 && class349.field5104[var20][var84]) {
                                                var60[var53] = var63;
                                                var61[var53] = var64;
                                                var59[var53] = var62;
                                            } else if (var88 == 0 && var89 == 0) {
                                                var59[var53] = arg5[var13][var15];
                                                var60[var53] = var76.field2124;
                                                var61[var53] = var76.field2127;
                                            } else if (var88 == 0 && var89 == 128) {
                                                var59[var53] = arg5[var13][var16];
                                                var60[var53] = var77.field2124;
                                                var61[var53] = var77.field2127;
                                            } else if (var88 == 128 && var89 == 128) {
                                                var59[var53] = arg5[var14][var16];
                                                var60[var53] = var78.field2124;
                                                var61[var53] = var78.field2127;
                                            } else if (var88 == 128 && var89 == 0) {
                                                var59[var53] = arg5[var14][var15];
                                                var60[var53] = var79.field2124;
                                                var61[var53] = var79.field2127;
                                            } else {
                                                if (var88 < 64) {
                                                    if (var89 < 64) {
                                                        var60[var53] = var76.field2124;
                                                        var61[var53] = var76.field2127;
                                                    } else {
                                                        var60[var53] = var77.field2124;
                                                        var61[var53] = var77.field2127;
                                                    }
                                                } else if (var89 >= 64) {
                                                    var60[var53] = var78.field2124;
                                                    var61[var53] = var78.field2127;
                                                } else {
                                                    var60[var53] = var79.field2124;
                                                    var61[var53] = var79.field2127;
                                                }
                                                int var92 = class435.method2707(arg5[var14][var15], arg5[var13][var15], var88 << 7 >> 7, 14760);
                                                int var93 = class435.method2707(arg5[var14][var16], arg5[var13][var16], var88 << 7 >> 7, 14760);
                                                var59[var53] = class435.method2707(var93, var92, var89 << 7 >> 7, 14760);
                                            }
                                            if (var56 != null) {
                                                var56[var53] = var59[var53];
                                            }
                                        }
                                        var53++;
                                    }
                                    var52++;
                                }
                                if (var20 != 0 && var28.field2120) {
                                    var17 = true;
                                }
                            }
                            int var94 = arg10.method1990(var13, var15);
                            int var95 = arg10.method1990(var14, var15);
                            int var96 = arg10.method1990(var14, var16);
                            int var97 = arg10.method1990(var13, var16);
                            if (arg11 > 0) {
                                boolean var98 = true;
                                if (var23 == 0 && var20 != 0) {
                                    var98 = false;
                                }
                                if (var22 > 0 && var29 != null && !var29.field2593) {
                                    var98 = false;
                                }
                                if (var98 && var94 == var95 && var94 == var96 && var94 == var97) {
                                    class275.field3883[arg11][var13][var15] = (byte) class164.method1059(class275.field3883[arg11][var13][var15], 4);
                                }
                            }
                            int var99 = 0;
                            int var100 = 0;
                            if (arg4) {
                                var99 = class437.method2712(var13, var15);
                                var100 = class109.method605(var13, var15);
                            }
                            arg10.method1993(var13, var15, var57, var55, var58, var59, var56, var60, var61, var99, var100, var17);
                            class252.method1578(arg11, var13, var15);
                        }
                    }
                }
            }
        }
    }
}
