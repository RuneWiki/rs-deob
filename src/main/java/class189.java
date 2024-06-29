import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class189 implements class265 {

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "[I")
    public static int[] field3064 = new int[25];

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "I")
    public static int field3067 = 0;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
    public static int field3062 = -1;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
    public static int field3056;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public static int field3057;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "I")
    public static int field3063;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
    public static int field3069;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "Lqj;")
    public static class147 field3061;

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "[Lia;")
    public static class226[] field3066;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILqh;)I")
    public static final int method1289(int arg0, class201 arg1) {
        field3060++;
        int var2 = 0;
        if (arg1.method1353(-88, class179.field2813)) {
            var2++;
        }
        if (arg1.method1353(arg0 ^ 0x276E, class255.field4058)) {
            var2++;
        }
        if (arg1.method1353(-82, class217.field3540)) {
            var2++;
        }
        if (arg1.method1353(-54, class256.field4070)) {
            var2++;
        }
        if (arg1.method1353(-56, field3057)) {
            var2++;
        }
        if (arg1.method1353(-71, class181.field2849)) {
            var2++;
        }
        if (arg0 != -10097) {
            return -123;
        }
        if (arg1.method1353(arg0 + 9996, class177.field2798)) {
            var2++;
        }
        if (arg1.method1353(-113, class176.field2779)) {
            var2++;
        }
        if (arg1.method1353(-33, class289.field4572)) {
            var2++;
        }
        if (arg1.method1353(-61, class136.field2238)) {
            var2++;
        }
        if (arg1.method1353(-106, class210.field3437)) {
            var2++;
        }
        if (arg1.method1353(-102, class240.field3891)) {
            var2++;
        }
        if (arg1.method1353(arg0 + 10045, class154.field2491)) {
            var2++;
        }
        if (arg1.method1353(-80, class181.field2833)) {
            var2++;
        }
        if (arg1.method1353(-60, class280.field4438)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "([BIII)Z")
    public static final boolean method1290(byte[] arg0, int arg1, int arg2, int arg3) {
        field3065++;
        class221 var4 = new class221(arg0);
        boolean var5 = true;
        int var6 = -1;
        if (arg1 != 0) {
            field3064 = null;
        }
        label70: while (true) {
            int var7 = var4.method1562((byte) 39);
            if (var7 == 0) {
                return var5;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                int var13;
                class135 var16;
                do {
                    int var14;
                    int var15;
                    do {
                        do {
                            do {
                                do {
                                    while (var9) {
                                        int var17 = var4.method1528(19380);
                                        if (var17 == 0) {
                                            continue label70;
                                        }
                                        var4.method1517((byte) -96);
                                    }
                                    int var10 = var4.method1528(19380);
                                    if (var10 == 0) {
                                        continue label70;
                                    }
                                    var8 += var10 - 1;
                                    int var11 = var8 & 0x3F;
                                    int var12 = var8 >> 6 & 0x3F;
                                    var13 = var4.method1517((byte) -96) >> 2;
                                    var14 = arg3 + var12;
                                    var15 = arg2 + var11;
                                } while (var14 <= 0);
                            } while (var15 <= 0);
                        } while (var14 >= 103);
                    } while (var15 >= 103);
                    var16 = class209.method1447(var6, -6653);
                } while (var13 == 22 && !class22.field361 && var16.field2206 == 0 && var16.field2169 != 1 && !var16.field2156);
                var9 = true;
                if (!var16.method950((byte) 59)) {
                    class205.field3283++;
                    var5 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
    public static void method1291(int arg0) {
        field3066 = null;
        field3064 = null;
        field3061 = null;
        if (arg0 < 17) {
            method1289(81, (class201) null);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;")
    public static final String method1292(String arg0, String arg1, String arg2, boolean arg3) {
        field3056++;
        for (int var4 = arg1.indexOf(arg0); var4 != -1; var4 = arg1.indexOf(arg0, arg2.length() + var4)) {
            arg1 = arg1.substring(0, var4) + arg2 + arg1.substring(var4 + arg0.length());
        }
        if (!arg3) {
            field3059 = -123;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V")
    public static final void method1293(int arg0) {
        if (arg0 != 230) {
            field3064 = null;
        }
        field3069++;
        class85.field1331.method481(false);
        class75.field1208.method481(false);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V")
    public static final void method1294(byte arg0) {
        field3063++;
        if (class121.field1973 == 156) {
            int var1 = class67.field1103.method1517((byte) -96);
            int var2 = (var1 & 0x7) + class244.field3918;
            int var3 = (var1 >> 4 & 0x7) + class84.field1309;
            int var4 = class67.field1103.method1521((byte) 113);
            if (var4 == 65535) {
                var4 = -1;
            }
            int var5 = class67.field1103.method1517((byte) -96);
            int var6 = var5 >> 4 & 0xF;
            int var7 = class67.field1103.method1517((byte) -96);
            int var8 = var5 & 0x7;
            if (var3 >= 0 && var2 >= 0 && var3 < 104 && var2 < 104) {
                int var9 = var6 + 1;
                if (class167.field2655.field3340[0] >= (var3 - var9) && class167.field2655.field3340[0] <= (var3 + var9) && (var2 - var9) <= class167.field2655.field3321[0] && class167.field2655.field3321[0] <= var2 + var9 && class107.field1745 != 0 && var8 > 0 && class221.field3623 < 50 && var4 != -1) {
                    class204.field3276[class221.field3623] = var4;
                    class43.field798[class221.field3623] = var8;
                    class161.field2562[class221.field3623] = var7;
                    class56.field962[class221.field3623] = null;
                    class154.field2493[class221.field3623] = (var2 << 8) + (var3 << 16) + var6;
                    class221.field3623++;
                }
            }
        } else if (class121.field1973 == 254) {
            int var10 = class67.field1103.method1512((byte) -125);
            int var11 = class67.field1103.method1515(-1);
            int var12 = class67.field1103.method1534(false);
            int var13 = (var12 & 0x7) + class244.field3918;
            int var14 = class84.field1309 + ((var12 & 0x73) >> 4);
            int var15 = class67.field1103.method1527(-10661);
            if (var14 >= 0 && var13 >= 0 && var14 < 104 && var13 < 104 && class233.field3811 != var10) {
                class66 var16 = new class66();
                var16.field1085 = var15;
                var16.field1088 = var11;
                if (class67.field1104[class250.field3980][var14][var13] == null) {
                    class67.field1104[class250.field3980][var14][var13] = new class115();
                }
                class67.field1104[class250.field3980][var14][var13].method855(false, new class21(var16));
                class169.method1168(-49, var14, var13);
            }
        } else if (class121.field1973 == 217) {
            int var17 = class67.field1103.method1517((byte) -96);
            int var18 = ((var17 & 0xF0) >> 4) + class84.field1309 * 2;
            int var19 = (var17 & 0xF) + class244.field3918 * 2;
            int var20 = class67.field1103.method1535((byte) -70) + var18;
            int var21 = var19 + class67.field1103.method1535((byte) -125);
            int var22 = class67.field1103.method1550(107);
            int var23 = class67.field1103.method1550(102);
            int var24 = class67.field1103.method1521((byte) 113);
            int var25 = class67.field1103.method1535((byte) -98);
            int var26 = class67.field1103.method1517((byte) -96) * 4;
            int var27 = class67.field1103.method1521((byte) 113);
            int var28 = class67.field1103.method1521((byte) 113);
            int var29 = class67.field1103.method1517((byte) -96);
            int var30 = class67.field1103.method1517((byte) -96);
            if (var29 == 255) {
                var29 = -1;
            }
            if (var18 >= 0 && var19 >= 0 && var18 < 208 && var19 < 208 && var20 >= 0 && var21 >= 0 && var20 < 208 && var21 < 208 && var24 != 65535) {
                int var31 = var18 * 64;
                int var32 = var20 * 64;
                int var33 = var19 * 64;
                int var34 = var21 * 64;
                if (var22 != 0) {
                    int var36;
                    class207 var38;
                    if (var22 < 0) {
                        int var35 = -var22 - 1;
                        var36 = (var35 & 0x7D42) >> 11;
                        int var37 = var35 & 0x7FF;
                        if (class233.field3811 == var37) {
                            var38 = class167.field2655;
                        } else {
                            var38 = class35.field548[var37];
                        }
                    } else {
                        int var39 = var22 - 1;
                        int var40 = var39 & 0x7FF;
                        var38 = class137.field2260[var40];
                        var36 = var39 >> 11 & 0xF;
                    }
                    if (var38 != null) {
                        class252 var41 = var38.method1435(0);
                        if (var41.field4014 != null && var41.field4014[var36] != null) {
                            var25 -= var41.field4014[var36][1];
                            int var42 = var41.field4014[var36][0];
                            int var43 = class69.field1147[var38.field3320];
                            int var44 = var41.field4014[var36][2];
                            int var45 = class69.field1137[var38.field3320];
                            int var46 = var42 * var45 + var43 * var44 >> 16;
                            int var47 = var44 * var45 - (var42 * var43) >> 16;
                            var31 += var46;
                            var33 += var47;
                        }
                    }
                }
                class64 var49 = new class64(var24, class250.field3980, var31, var33, class225.method1583(var33, var31, class250.field3980, 0) - var25, class222.field3682 + var27, class222.field3682 + var28, var29, var30, var23, var26);
                var49.method451(var32, var34, class225.method1583(var34, var32, class250.field3980, 0) - var26, class222.field3682 + var27, -1);
                class240.field3887.method855(false, new class180(var49));
            }
        } else {
            if (class121.field1973 == 230) {
                int var50 = class67.field1103.method1517((byte) -96);
                int var51 = class67.field1103.method1522((byte) -93);
                int var52 = var50 & 0x3;
                byte var53 = class67.field1103.method1552(0);
                int var54 = var50 >> 2;
                int var55 = class67.field1103.method1521((byte) 113);
                byte var56 = class67.field1103.method1552(0);
                byte var57 = class67.field1103.method1513(-49142968);
                byte var58 = class67.field1103.method1535((byte) -73);
                int var59 = class67.field1103.method1519((byte) 127);
                int var60 = ((var59 & 0x74) >> 4) + class84.field1309;
                int var61 = (var59 & 0x7) + class244.field3918;
                int var62 = class67.field1103.method1515(-1);
                int var63 = class67.field1103.method1527(-10661);
                class193.method1318(var51, var53, var56, var57, var63, 69, var60, var58, var52, var54, var55, var61, var62);
            }
            if (class121.field1973 == 75) {
                int var64 = class67.field1103.method1521((byte) 113);
                int var65 = class67.field1103.method1517((byte) -96);
                int var66 = class84.field1309 + ((var65 & 0x77) >> 4);
                int var67 = (var65 & 0x7) + class244.field3918;
                int var68 = class67.field1103.method1521((byte) 113);
                if (var66 >= 0 && var67 >= 0 && var66 < 104 && var67 < 104) {
                    class66 var69 = new class66();
                    var69.field1085 = var64;
                    var69.field1088 = var68;
                    if (class67.field1104[class250.field3980][var66][var67] == null) {
                        class67.field1104[class250.field3980][var66][var67] = new class115();
                    }
                    class67.field1104[class250.field3980][var66][var67].method855(false, new class21(var69));
                    class169.method1168(-99, var66, var67);
                }
            } else if (class121.field1973 == 40) {
                int var70 = class67.field1103.method1512((byte) -128);
                int var71 = class67.field1103.method1519((byte) 126);
                if (var70 == 65535) {
                    var70 = -1;
                }
                int var72 = (var71 >> 4 & 0x7) + class84.field1309;
                int var73 = (var71 & 0x7) + class244.field3918;
                int var74 = class67.field1103.method1517((byte) -96);
                int var75 = var74 & 0x3;
                int var76 = var74 >> 2;
                int var77 = class95.field1562[var76];
                class217.method1481((byte) -62, var75, var76, var72, var77, class250.field3980, var70, var73);
            } else if (class121.field1973 == 98) {
                int var78 = class67.field1103.method1517((byte) -96);
                int var79 = class244.field3918 + (var78 & 0x7);
                int var80 = ((var78 & 0x7E) >> 4) + class84.field1309;
                int var81 = var80 + class67.field1103.method1535((byte) -72);
                int var82 = class67.field1103.method1535((byte) -83) + var79;
                int var83 = class67.field1103.method1550(-116);
                int var84 = class67.field1103.method1521((byte) 113);
                int var85 = class67.field1103.method1517((byte) -96) * 4;
                int var86 = class67.field1103.method1517((byte) -96) * 4;
                int var87 = class67.field1103.method1521((byte) 113);
                int var88 = class67.field1103.method1521((byte) 113);
                int var89 = class67.field1103.method1517((byte) -96);
                int var90 = class67.field1103.method1517((byte) -96);
                if (var89 == 255) {
                    var89 = -1;
                }
                if (var80 >= 0 && var79 >= 0 && var80 < 104 && var79 < 104 && var81 >= 0 && var82 >= 0 && var81 < 104 && var82 < 104 && var84 != 65535) {
                    int var91 = var80 * 128 + 64;
                    int var92 = var81 * 128 + 64;
                    int var93 = var79 * 128 + 64;
                    int var94 = var82 * 128 + 64;
                    class64 var95 = new class64(var84, class250.field3980, var91, var93, class225.method1583(var93, var91, class250.field3980, 0) - var85, class222.field3682 + var87, var88 + class222.field3682, var89, var90, var83, var86);
                    var95.method451(var92, var94, class225.method1583(var94, var92, class250.field3980, 0) - var86, class222.field3682 + var87, -1);
                    class240.field3887.method855(false, new class180(var95));
                }
            } else if (class121.field1973 == 109) {
                int var96 = class67.field1103.method1519((byte) 127);
                int var97 = var96 & 0x3;
                int var98 = var96 >> 2;
                int var99 = class95.field1562[var98];
                int var100 = class67.field1103.method1534(false);
                int var101 = (var100 & 0x7) + class244.field3918;
                int var102 = ((var100 & 0x75) >> 4) + class84.field1309;
                if (var102 >= 0 && var101 >= 0 && var102 < 104 && var101 < 104) {
                    class201.method1366(-1, 0, 0, var98, var101, var99, class250.field3980, -1, var97, var102);
                }
            } else if (class121.field1973 == 2) {
                int var103 = class67.field1103.method1517((byte) -96);
                int var104 = ((var103 & 0xFC) >> 4) + class84.field1309 * 2;
                int var105 = class244.field3918 * 2 + (var103 & 0xF);
                int var106 = var104 + class67.field1103.method1535((byte) -66);
                int var107 = class67.field1103.method1535((byte) -98) + var105;
                int var108 = class67.field1103.method1550(114);
                int var109 = class67.field1103.method1521((byte) 113);
                int var110 = class67.field1103.method1517((byte) -96) * 4;
                int var111 = class67.field1103.method1517((byte) -96) * 4;
                int var112 = class67.field1103.method1521((byte) 113);
                int var113 = class67.field1103.method1521((byte) 113);
                int var114 = class67.field1103.method1517((byte) -96);
                int var115 = class67.field1103.method1517((byte) -96);
                if (var114 == 255) {
                    var114 = -1;
                }
                if (var104 >= 0 && var105 >= 0 && var104 < 208 && var105 < 208 && var106 >= 0 && var107 >= 0 && var106 < 208 && var107 < 208 && var109 != 65535) {
                    int var116 = var104 * 64;
                    int var117 = var107 * 64;
                    int var118 = var105 * 64;
                    int var119 = var106 * 64;
                    class64 var120 = new class64(var109, class250.field3980, var116, var118, class225.method1583(var118, var116, class250.field3980, 0) - var110, class222.field3682 + var112, class222.field3682 + var113, var114, var115, var108, var111);
                    var120.method451(var119, var117, class225.method1583(var117, var119, class250.field3980, 0) - var111, class222.field3682 + var112, -1);
                    class240.field3887.method855(false, new class180(var120));
                }
            } else {
                int var121 = 28 / ((21 - arg0) / 49);
                if (class121.field1973 == 134) {
                    int var122 = class67.field1103.method1517((byte) -96);
                    int var123 = class244.field3918 + (var122 & 0x7);
                    int var124 = ((var122 & 0x7C) >> 4) + class84.field1309;
                    int var125 = class67.field1103.method1521((byte) 113);
                    int var126 = class67.field1103.method1517((byte) -96);
                    int var127 = class67.field1103.method1521((byte) 113);
                    if (var124 >= 0 && var123 >= 0 && var124 < 104 && var123 < 104) {
                        int var128 = var123 * 128 + 64;
                        int var129 = var124 * 128 + 64;
                        class170 var130 = new class170(var125, class250.field3980, var129, var128, class225.method1583(var128, var129, class250.field3980, 0) - var126, var127, class222.field3682);
                        class162.field2586.method855(false, new class174(var130));
                    }
                } else if (class121.field1973 == 211) {
                    int var131 = class67.field1103.method1521((byte) 113);
                    int var132 = class67.field1103.method1553((byte) 81);
                    int var133 = var132 >> 2;
                    int var134 = var132 & 0x3;
                    int var135 = class95.field1562[var133];
                    int var136 = class67.field1103.method1519((byte) 126);
                    int var137 = (var136 & 0x7) + class244.field3918;
                    int var138 = class84.field1309 + ((var136 & 0x73) >> 4);
                    if (var138 >= 0 && var137 >= 0 && var138 < 104 && var137 < 104) {
                        class201.method1366(-1, 0, 0, var133, var137, var135, class250.field3980, var131, var134, var138);
                    }
                } else if (class121.field1973 == 120) {
                    int var139 = class67.field1103.method1521((byte) 113);
                    int var140 = class67.field1103.method1534(false);
                    int var141 = ((var140 & 0x7D) >> 4) + class84.field1309;
                    int var142 = (var140 & 0x7) + class244.field3918;
                    if (var141 >= 0 && var142 >= 0 && var141 < 104 && var142 < 104) {
                        class115 var143 = class67.field1104[class250.field3980][var141][var142];
                        if (var143 != null) {
                            for (class21 var144 = (class21) var143.method843(-92); var144 != null; var144 = (class21) var143.method852((byte) 123)) {
                                if ((var139 & 0x7FFF) == var144.field354.field1085) {
                                    var144.method1388(-101);
                                    break;
                                }
                            }
                            if (var143.method843(112) == null) {
                                class67.field1104[class250.field3980][var141][var142] = null;
                            }
                            class169.method1168(121, var141, var142);
                        }
                    }
                } else if (class121.field1973 == 142) {
                    int var145 = class67.field1103.method1517((byte) -96);
                    int var146 = class244.field3918 + (var145 & 0x7);
                    int var147 = (var145 >> 4 & 0x7) + class84.field1309;
                    int var148 = class67.field1103.method1521((byte) 113);
                    int var149 = class67.field1103.method1521((byte) 113);
                    int var150 = class67.field1103.method1521((byte) 113);
                    if (var147 >= 0 && var146 >= 0 && var147 < 104 && var146 < 104) {
                        class115 var151 = class67.field1104[class250.field3980][var147][var146];
                        if (var151 != null) {
                            for (class21 var152 = (class21) var151.method843(79); var152 != null; var152 = (class21) var151.method852((byte) 123)) {
                                class66 var153 = var152.field354;
                                if ((var148 & 0x7FFF) == var153.field1085 && var153.field1088 == var149) {
                                    var153.field1088 = var150;
                                    break;
                                }
                            }
                            class169.method1168(112, var147, var146);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I[IJI)Ljava/lang/String;")
    public final String method1295(int arg0, int[] arg1, long arg2, int arg3) {
        field3068++;
        if (arg3 == 0) {
            class85 var6 = class190.method1296(true, arg1[0]);
            return var6.method618((int) arg2, (byte) -25);
        } else if (arg0 <= 67) {
            return null;
        } else if (arg3 == 1 || arg3 == 10) {
            class12 var7 = class83.method595((int) arg2, -120);
            return var7.field174;
        } else if (arg3 == 6 || arg3 == 7 || arg3 == 11) {
            return class190.method1296(true, arg1[0]).method618((int) arg2, (byte) -74);
        } else {
            return null;
        }
    }
}
