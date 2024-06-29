import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class31 {

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "Ldi;")
    public static class43 field638 = new class43();

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "Loc;")
    private static class151 field640 = class137.method873(2, "Click to switch");

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "[Loc;")
    public static class151[] field644 = new class151[100];

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "Loc;")
    public static class151 field643 = class137.method873(2, "<col=ffffff>");

    @OriginalMember(owner = "client!ch", name = "k", descriptor = "I")
    public static int field646 = 0;

    @OriginalMember(owner = "client!ch", name = "l", descriptor = "Loc;")
    public static class151 field647 = field640;

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "Loc;")
    public static class151 field645 = class137.method873(2, "oberen Rand der Webseite ausw-=hlen)3");

    @OriginalMember(owner = "client!ch", name = "n", descriptor = "Loc;")
    public static class151 field649 = class137.method873(2, " ");

    @OriginalMember(owner = "client!ch", name = "m", descriptor = "Loc;")
    public static class151 field648 = class137.method873(2, "und Ihr Passwort ein)3");

    @OriginalMember(owner = "client!ch", name = "q", descriptor = "I")
    public static int field652 = -1;

    @OriginalMember(owner = "client!ch", name = "p", descriptor = "Loc;")
    private static class151 field651 = class137.method873(2, " from your friend list first)3");

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "Loc;")
    public static class151 field641 = field651;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!ch", name = "o", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "[Lhh;")
    public static class84[] field642;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Z)V")
    public static final void method231(boolean arg0) {
        field639++;
        if (class219.field3813 == 99) {
            int var1 = class1.field34.method1475(255);
            int var2 = (var1 >> 4 & 0x7) + class57.field1141;
            int var3 = (var1 & 0x7) + class56.field1133;
            int var4 = class1.field34.method1490((byte) 73);
            int var5 = class1.field34.method1490((byte) 73);
            int var6 = class1.field34.method1490((byte) 73);
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                class218 var7 = class29.field615[class234.field4325][var2][var3];
                if (var7 != null) {
                    for (class158 var8 = (class158) var7.method1358(-29726); var8 != null; var8 = (class158) var7.method1360(arg0)) {
                        class180 var9 = var8.field2847;
                        if ((var4 & 0x7FFF) == var9.field3256 && var9.field3252 == var5) {
                            var9.field3252 = var6;
                            break;
                        }
                    }
                    class167.method1087(var2, var3, 8);
                }
            }
        } else if (class219.field3813 == 181) {
            int var10 = class1.field34.method1490((byte) 73);
            int var11 = class1.field34.method1441(0);
            int var12 = class1.field34.method1486((byte) -65);
            int var13 = class1.field34.method1475(255);
            int var14 = class56.field1133 + (var13 & 0x7);
            int var15 = (var13 >> 4 & 0x7) + class57.field1141;
            if (var15 >= 0 && var14 >= 0 && var15 < 104 && var14 < 104 && class163.field2943 != var10) {
                class180 var16 = new class180();
                var16.field3252 = var11;
                var16.field3256 = var12;
                if (class29.field615[class234.field4325][var15][var14] == null) {
                    class29.field615[class234.field4325][var15][var14] = new class218();
                }
                class29.field615[class234.field4325][var15][var14].method1361(new class158(var16), (byte) 71);
                class167.method1087(var15, var14, 8);
            }
        } else if (class219.field3813 == 175) {
            int var17 = class1.field34.method1475(255);
            int var18 = class57.field1141 + (var17 >> 4 & 0x7);
            int var19 = (var17 & 0x7) + class56.field1133;
            int var20 = var18 + class1.field34.method1457(-2);
            int var21 = class1.field34.method1457(-2) + var19;
            int var22 = class1.field34.method1466(12435);
            int var23 = class1.field34.method1490((byte) 73);
            int var24 = class1.field34.method1475(255) * 4;
            int var25 = class1.field34.method1475(255) * 4;
            int var26 = class1.field34.method1490((byte) 73);
            int var27 = class1.field34.method1490((byte) 73);
            int var28 = class1.field34.method1475(255);
            int var29 = class1.field34.method1475(255);
            if (var18 >= 0 && var19 >= 0 && var18 < 104 && var19 < 104 && var20 >= 0 && var21 >= 0 && var20 < 104 && var21 < 104 && var23 != 65535) {
                int var30 = var19 * 128 + 64;
                int var31 = var18 * 128 + 64;
                int var32 = var20 * 128 + 64;
                int var33 = var21 * 128 + 64;
                class112 var34 = new class112(var23, class234.field4325, var31, var30, class195.method1225(var31, class234.field4325, var30, (byte) -118) - var24, class200.field3541 + var26, class200.field3541 + var27, var28, var29, var22, var25);
                var34.method680(var32, class200.field3541 + var26, -119, class195.method1225(var32, class234.field4325, var33, (byte) -118) - var25, var33);
                class90.field1649.method1361(new class128(var34), (byte) 71);
            }
        } else if (class219.field3813 == 196) {
            int var35 = class1.field34.method1475(255);
            int var36 = (var35 >> 4 & 0x7) + class57.field1141;
            int var37 = (var35 & 0x7) + class56.field1133;
            int var38 = class1.field34.method1441(0);
            if (var36 >= 0 && var37 >= 0 && var36 < 104 && var37 < 104) {
                class218 var39 = class29.field615[class234.field4325][var36][var37];
                if (var39 != null) {
                    for (class158 var40 = (class158) var39.method1358(-29726); var40 != null; var40 = (class158) var39.method1360(true)) {
                        if ((var38 & 0x7FFF) == var40.field2847.field3256) {
                            var40.method636(69);
                            break;
                        }
                    }
                    if (var39.method1358(-29726) == null) {
                        class29.field615[class234.field4325][var36][var37] = null;
                    }
                    class167.method1087(var36, var37, 8);
                }
            }
        } else {
            if (class219.field3813 == 32) {
                int var41 = class1.field34.method1475(255);
                int var42 = (var41 >> 4 & 0x7) + class57.field1141;
                int var43 = (var41 & 0x7) + class56.field1133;
                int var44 = class1.field34.method1490((byte) 73);
                if (var44 == 65535) {
                    var44 = -1;
                }
                int var45 = class1.field34.method1475(255);
                int var46 = var45 & 0x7;
                int var47 = var45 >> 4 & 0xF;
                int var48 = class1.field34.method1475(255);
                if (var42 >= 0 && var43 >= 0 && var42 < 104 && var43 < 104) {
                    int var49 = var47 + 1;
                    if (var42 - var49 <= class228.field3975.field3978[0] && class228.field3975.field3978[0] <= var42 + var49 && class228.field3975.field4031[0] >= var43 - var49 && class228.field3975.field4031[0] <= var43 + var49 && class57.field1139 != 0 && var46 > 0 && class182.field3299 < 50 && var44 != -1) {
                        class128.field2305[class182.field3299] = var44;
                        class120.field2168[class182.field3299] = var46;
                        class155.field2800[class182.field3299] = var48;
                        class141.field2561[class182.field3299] = null;
                        class57.field1154[class182.field3299] = (var43 << 8) + (var42 << 16) + var47;
                        class182.field3299++;
                    }
                }
            }
            if (class219.field3813 == 100) {
                int var50 = class1.field34.method1465(-92);
                int var51 = class57.field1141 + (var50 >> 4 & 0x7);
                int var52 = (var50 & 0x7) + class56.field1133;
                int var53 = class1.field34.method1489(252);
                int var54 = var53 >> 2;
                int var55 = var53 & 0x3;
                int var56 = class161.field2904[var54];
                if (var51 >= 0 && var52 >= 0 && var51 < 104 && var52 < 104) {
                    class176.method1124(-1, var56, var54, var51, 0, var55, class234.field4325, 1, var52, -1);
                }
            } else if (class219.field3813 == 224) {
                int var57 = class1.field34.method1486((byte) -65);
                if (var57 == 65535) {
                    var57 = -1;
                }
                int var58 = class1.field34.method1459(255);
                int var59 = (var58 & 0x7) + class56.field1133;
                int var60 = class57.field1141 + (var58 >> 4 & 0x7);
                int var61 = class1.field34.method1475(255);
                int var62 = var61 & 0x3;
                int var63 = var61 >> 2;
                int var64 = class161.field2904[var63];
                if (var60 >= 0 && var59 >= 0 && var60 < 103 && var59 < 103) {
                    if (var64 == 0) {
                        class23 var65 = class29.method220(class234.field4325, var60, var59);
                        if (var65 != null) {
                            int var66 = Integer.MAX_VALUE & (int) (var65.field503 >>> 32);
                            if (var63 == 2) {
                                var65.field518 = new class15(var66, 2, var62 + 4, class234.field4325, var60, var59, var57, false, var65.field518);
                                var65.field517 = new class15(var66, 2, var62 + 1 & 0x3, class234.field4325, var60, var59, var57, false, var65.field517);
                            } else {
                                var65.field518 = new class15(var66, var63, var62, class234.field4325, var60, var59, var57, false, var65.field518);
                            }
                        }
                    }
                    if (var64 == 1) {
                        class213 var67 = class66.method437(class234.field4325, var60, var59);
                        if (var67 != null) {
                            int var68 = Integer.MAX_VALUE & (int) (var67.field3739 >>> 32);
                            if (var63 == 4 || var63 == 5) {
                                var67.field3744 = new class15(var68, 4, var62, class234.field4325, var60, var59, var57, false, var67.field3744);
                            } else if (var63 == 6) {
                                var67.field3744 = new class15(var68, 4, var62 + 4, class234.field4325, var60, var59, var57, false, var67.field3744);
                            } else if (var63 == 7) {
                                var67.field3744 = new class15(var68, 4, (var62 + 2 & 0x3) + 4, class234.field4325, var60, var59, var57, false, var67.field3744);
                            } else if (var63 == 8) {
                                var67.field3744 = new class15(var68, 4, var62 + 4, class234.field4325, var60, var59, var57, false, var67.field3744);
                                var67.field3745 = new class15(var68, 4, (var62 + 2 & 0x3) + 4, class234.field4325, var60, var59, var57, false, var67.field3745);
                            }
                        }
                    }
                    if (var64 == 2) {
                        class124 var69 = class174.method1112(class234.field4325, var60, var59);
                        if (var63 == 11) {
                            var63 = 10;
                        }
                        if (var69 != null) {
                            var69.field2220 = new class15((int) (var69.field2230 >>> 32) & Integer.MAX_VALUE, var63, var62, class234.field4325, var60, var59, var57, false, var69.field2220);
                        }
                    }
                    if (var64 == 3) {
                        class73 var70 = class151.method998(class234.field4325, var60, var59);
                        if (var70 != null) {
                            var70.field1423 = new class15(Integer.MAX_VALUE & (int) (var70.field1421 >>> 32), 22, var62, class234.field4325, var60, var59, var57, false, var70.field1423);
                        }
                    }
                }
            } else if (class219.field3813 == 15) {
                int var71 = class1.field34.method1465(-116);
                int var72 = var71 >> 2;
                int var73 = var71 & 0x3;
                int var74 = class161.field2904[var72];
                int var75 = class1.field34.method1489(252);
                int var76 = (var75 >> 4 & 0x7) + class57.field1141;
                int var77 = (var75 & 0x7) + class56.field1133;
                int var78 = class1.field34.method1490((byte) 73);
                if (var76 >= 0 && var77 >= 0 && var76 < 104 && var77 < 104) {
                    class176.method1124(var78, var74, var72, var76, 0, var73, class234.field4325, 1, var77, -1);
                }
            } else if (class219.field3813 == 88) {
                int var79 = class1.field34.method1475(255);
                int var80 = (var79 >> 4 & 0x7) + class57.field1141;
                int var81 = (var79 & 0x7) + class56.field1133;
                int var82 = class1.field34.method1490((byte) 73);
                int var83 = class1.field34.method1475(255);
                int var84 = class1.field34.method1490((byte) 73);
                if (var80 >= 0 && var81 >= 0 && var80 < 104 && var81 < 104) {
                    int var85 = var81 * 128 + 64;
                    int var86 = var80 * 128 + 64;
                    class160 var87 = new class160(var82, class234.field4325, var86, var85, class195.method1225(var86, class234.field4325, var85, (byte) -118) - var83, var84, class200.field3541);
                    class193.field3454.method1361(new class216(var87), (byte) 71);
                }
            } else {
                if (class219.field3813 == 77) {
                    int var88 = class1.field34.method1459(255);
                    int var89 = (var88 >> 4 & 0x7) + class57.field1141;
                    int var90 = (var88 & 0x7) + class56.field1133;
                    byte var91 = class1.field34.method1451(false);
                    int var92 = class1.field34.method1490((byte) 73);
                    int var93 = class1.field34.method1490((byte) 73);
                    byte var94 = class1.field34.method1451(!arg0);
                    int var95 = class1.field34.method1452(-14498);
                    int var96 = class1.field34.method1441(0);
                    byte var97 = class1.field34.method1451(false);
                    int var98 = class1.field34.method1475(255);
                    int var99 = var98 & 0x3;
                    int var100 = var98 >> 2;
                    int var101 = class161.field2904[var100];
                    byte var102 = class1.field34.method1453(89);
                    class20 var103;
                    if (class163.field2943 == var95) {
                        var103 = class228.field3975;
                    } else {
                        var103 = class179.field3229[var95];
                    }
                    if (var103 != null) {
                        class93 var104 = class5.method32((byte) 85, var92);
                        int var105;
                        int var106;
                        if (var99 == 1 || var99 == 3) {
                            var105 = var104.field1715;
                            var106 = var104.field1697;
                        } else {
                            var105 = var104.field1697;
                            var106 = var104.field1715;
                        }
                        int var107 = (var105 >> 1) + var89;
                        int var108 = (var105 + 1 >> 1) + var89;
                        int var109 = var90 + (var106 + 1 >> 1);
                        int var110 = (var106 >> 1) + var90;
                        int[][] var111 = class104.field1872[class234.field4325];
                        int var112 = (var89 << 7) + (var105 << 6);
                        int var113 = var111[var107][var110] + var111[var108][var110] + var111[var107][var109] + var111[var108][var109] >> 2;
                        int var114 = (var90 << 7) + (var106 << 6);
                        class159 var115 = var104.method595(27, var112, var100, var113, var99, var114, var111, false);
                        if (var115 != null) {
                            class176.method1124(-1, var101, 0, var89, var93 + 1, 0, class234.field4325, 1, var90, var96 + 1);
                            var103.field425 = var113;
                            var103.field419 = var96 + class200.field3541;
                            var103.field414 = (class18) var115.field2865;
                            var103.field424 = class200.field3541 + var93;
                            if (var102 < var94) {
                                byte var116 = var94;
                                var94 = var102;
                                var102 = var116;
                            }
                            var103.field437 = var89 * 128 + var105 * 64;
                            var103.field443 = var89 + var102;
                            var103.field441 = var89 + var94;
                            var103.field438 = var90 * 128 + var106 * 64;
                            if (var91 > var97) {
                                byte var117 = var91;
                                var91 = var97;
                                var97 = var117;
                            }
                            var103.field421 = var90 + var91;
                            var103.field445 = var90 + var97;
                        }
                    }
                }
                if (class219.field3813 == 112) {
                    int var118 = class1.field34.method1486((byte) -65);
                    int var119 = class1.field34.method1441(0);
                    int var120 = class1.field34.method1489(252);
                    int var121 = (var120 >> 4 & 0x7) + class57.field1141;
                    int var122 = (var120 & 0x7) + class56.field1133;
                    if (var121 >= 0 && var122 >= 0 && var121 < 104 && var122 < 104) {
                        class180 var123 = new class180();
                        var123.field3256 = var118;
                        var123.field3252 = var119;
                        if (class29.field615[class234.field4325][var121][var122] == null) {
                            class29.field615[class234.field4325][var121][var122] = new class218();
                        }
                        class29.field615[class234.field4325][var121][var122].method1361(new class158(var123), (byte) 71);
                        class167.method1087(var121, var122, 8);
                    }
                } else if (!arg0) {
                    field643 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V")
    public static void method232(int arg0) {
        field644 = null;
        field640 = null;
        field647 = null;
        field645 = null;
        field649 = null;
        field641 = null;
        if (arg0 != -64) {
            method231(false);
        }
        field643 = null;
        field651 = null;
        field648 = null;
        field638 = null;
        field642 = null;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIIIIIIZ)V")
    public static final void method233(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        if (arg4 == arg7 && arg1 == arg2 && arg0 == arg6 && arg5 == arg8) {
            class58.method390(arg3, -204342964, arg0, arg4, arg8, arg2);
        } else {
            int var10 = arg4;
            int var11 = arg4 * 3;
            int var12 = arg1 * 3;
            int var13 = arg2 * 3;
            int var14 = arg2;
            int var15 = arg7 * 3;
            int var16 = arg5 * 3;
            int var17 = arg6 * 3;
            int var18 = arg8 + var12 - var16 - arg2;
            int var19 = var15 - var11;
            int var20 = var17 + var11 - var15 - var15;
            int var21 = var12 - var13;
            int var22 = var16 + var13 - var12 - var12;
            int var23 = arg0 + var15 - var17 - arg4;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var20 * var25;
                int var29 = var22 * var25;
                int var30 = var23 * var26;
                int var31 = var19 * var24;
                int var32 = var21 * var24;
                int var33 = (var30 + var31 + var28 >> 12) + arg4;
                int var34 = arg2 + (var27 + var32 + var29 >> 12);
                class58.method390(arg3, -204342964, var33, var10, var34, var14);
                var14 = var34;
                var10 = var33;
            }
        }
        if (!arg9) {
            method233(-20, -97, -18, 94, -118, 34, -123, -50, -123, false);
        }
        field636++;
    }
}
