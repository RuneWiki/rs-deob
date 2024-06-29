import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class168 implements class146 {

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "[I")
    public static int[] field3107 = new int[32];

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "Ljd;")
    public static class86 field3109 = class122.method868(" zuerst von Ihrer Ignorieren)2Liste(Q", true);

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "[I")
    public static int[] field3105 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "Lqh;")
    public static class195 field3102 = new class195(5000);

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "Lva;")
    public static class34 field3112 = null;

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "Ljd;")
    public static class86 field3113 = class122.method868("Fps:", true);

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "Z")
    public static boolean field3114 = true;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "I")
    public static int field3104;

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
    public static int field3106;

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "I")
    public static int field3110;

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "[I")
    public static int[] field3103;

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "[I")
    public static int[] field3108;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILmk;)V")
    public static final void method1208(int arg0, class101 arg1) {
        short var2 = 256;
        field3099++;
        if (arg0 != 20792) {
            field3108 = null;
        }
        for (int var3 = 0; var3 < class43.field954.length; var3++) {
            class43.field954[var3] = 0;
        }
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) ((double) var2 * 128.0D * Math.random());
            class43.field954[var16] = (int) (Math.random() * 284.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < var2 - 1; var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = (var12 << 7) + var14;
                    class78.field1539[var15] = (class43.field954[var15 + 128] + class43.field954[var15 + 1] + class43.field954[var15 + -1] + class43.field954[var15 + -128]) / 4;
                }
            }
            int[] var13 = class43.field954;
            class43.field954 = class78.field1539;
            class78.field1539 = var13;
        }
        if (arg1 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg1.field1217; var7++) {
            for (int var8 = 0; var8 < arg1.field1227; var8++) {
                if (arg1.field1962[var6++] != 0) {
                    int var9 = arg1.field1220 + var8 + 16;
                    int var10 = var7 + arg1.field1222 + 16;
                    int var11 = (var10 << 7) + var9;
                    class43.field954[var11] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)V")
    public static final void method1209(byte arg0) {
        field3104++;
        if (class44.field969 == 168) {
            int var1 = field3102.method1408((byte) -54);
            int var2 = class38.field895 + (var1 & 0x7);
            int var3 = class76.field1519 + ((var1 & 0x79) >> 4);
            int var4 = field3102.method1410(-84);
            int var5 = field3102.method1408((byte) -99);
            int var6 = field3102.method1410(-99);
            if (var3 >= 0 && var2 >= 0 && var3 < 104 && var2 < 104) {
                int var7 = var2 * 128 + 64;
                int var8 = var3 * 128 + 64;
                class82 var9 = new class82(var4, class180.field3244, var8, var7, class30.method198(31482, var8, var7, class180.field3244) - var5, var6, class236.field4265);
                class187.field3313.method1731(66, new class178(var9));
            }
        } else if (class44.field969 == 116) {
            int var10 = field3102.method1410(-97);
            int var11 = field3102.method1383(54);
            int var12 = field3102.method1431((byte) 23);
            int var13 = ((var12 & 0x76) >> 4) + class76.field1519;
            int var14 = (var12 & 0x7) + class38.field895;
            if (var13 >= 0 && var14 >= 0 && var13 < 104 && var14 < 104) {
                class140 var15 = new class140();
                var15.field2660 = var11;
                var15.field2657 = var10;
                if (class238.field4284[class180.field3244][var13][var14] == null) {
                    class238.field4284[class180.field3244][var13][var14] = new class257();
                }
                class238.field4284[class180.field3244][var13][var14].method1731(-82, new class126(var15));
                class234.method1621(var13, var14, 64);
            }
        } else if (class44.field969 == 112) {
            int var16 = field3102.method1408((byte) -85);
            int var17 = (var16 & 0x7) + class38.field895;
            int var18 = ((var16 & 0x7F) >> 4) + class76.field1519;
            int var19 = field3102.method1410(-81);
            int var20 = field3102.method1410(-100);
            int var21 = field3102.method1410(-113);
            if (var18 >= 0 && var17 >= 0 && var18 < 104 && var17 < 104) {
                class257 var22 = class238.field4284[class180.field3244][var18][var17];
                if (var22 != null) {
                    for (class126 var23 = (class126) var22.method1737((byte) 74); var23 != null; var23 = (class126) var22.method1740(-8843)) {
                        class140 var24 = var23.field2433;
                        if ((var19 & 0x7FFF) == var24.field2660 && var24.field2657 == var20) {
                            var24.field2657 = var21;
                            break;
                        }
                    }
                    class234.method1621(var18, var17, 64);
                }
            }
        } else if (class44.field969 == 222) {
            int var25 = field3102.method1389((byte) 121);
            int var26 = (var25 & 0x7) + class38.field895;
            int var27 = class76.field1519 + (var25 >> 4 & 0x7);
            int var28 = field3102.method1389((byte) 100);
            int var29 = var28 & 0x3;
            int var30 = var28 >> 2;
            int var31 = class100.field1955[var30];
            if (var27 >= 0 && var26 >= 0 && var27 < 104 && var26 < 104) {
                class258.method1744(var31, var26, var30, -1, var29, 0, -1, class180.field3244, var27, (byte) -63);
            }
        } else if (class44.field969 == 189) {
            int var32 = field3102.method1408((byte) -109);
            int var33 = class38.field895 + (var32 & 0x7);
            int var34 = ((var32 & 0x73) >> 4) + class76.field1519;
            int var35 = field3102.method1412((byte) 108) + var34;
            int var36 = field3102.method1412((byte) 80) + var33;
            int var37 = field3102.method1421((byte) -59);
            int var38 = field3102.method1410(-111);
            int var39 = field3102.method1408((byte) -124) * 4;
            int var40 = field3102.method1408((byte) -111) * 4;
            int var41 = field3102.method1410(-81);
            int var42 = field3102.method1410(-123);
            int var43 = field3102.method1408((byte) -57);
            int var44 = field3102.method1408((byte) -52);
            if (var34 >= 0 && var33 >= 0 && var34 < 104 && var33 < 104 && var35 >= 0 && var36 >= 0 && var35 < 104 && var36 < 104 && var38 != 65535) {
                int var45 = var34 * 128 + 64;
                int var46 = var35 * 128 + 64;
                int var47 = var36 * 128 + 64;
                int var48 = var33 * 128 + 64;
                class134 var49 = new class134(var38, class180.field3244, var45, var48, class30.method198(31482, var45, var48, class180.field3244) - var39, var41 - -class236.field4265, var42 + class236.field4265, var43, var44, var37, var40);
                var49.method963(class30.method198(31482, var46, var47, class180.field3244) - var40, class236.field4265 + var41, var47, var46, true);
                class23.field576.method1731(74, new class27(var49));
            }
        } else {
            int var50 = -69 / ((arg0 + 15) / 62);
            if (class44.field969 == 63) {
                int var51 = field3102.method1408((byte) -38);
                int var52 = ((var51 & 0xFE) >> 4) + class76.field1519 * 2;
                int var53 = class38.field895 * 2 + (var51 & 0xF);
                int var54 = var52 + field3102.method1412((byte) 99);
                int var55 = field3102.method1412((byte) 124) + var53;
                int var56 = field3102.method1421((byte) -78);
                int var57 = field3102.method1410(-76);
                int var58 = field3102.method1408((byte) -106) * 4;
                int var59 = field3102.method1408((byte) -106) * 4;
                int var60 = field3102.method1410(-121);
                int var61 = field3102.method1410(-73);
                int var62 = field3102.method1408((byte) -94);
                int var63 = field3102.method1408((byte) -90);
                if (var52 >= 0 && var53 >= 0 && var52 < 208 && var53 < 208 && var54 >= 0 && var55 >= 0 && var54 < 208 && var55 < 208 && var57 != 65535) {
                    int var64 = var55 * 64;
                    int var65 = var52 * 64;
                    int var66 = var54 * 64;
                    int var67 = var53 * 64;
                    class134 var68 = new class134(var57, class180.field3244, var65, var67, class30.method198(31482, var65, var67, class180.field3244) - var58, var60 - -class236.field4265, class236.field4265 + var61, var62, var63, var56, var59);
                    var68.method963(class30.method198(31482, var66, var64, class180.field3244) - var59, class236.field4265 + var60, var64, var66, true);
                    class23.field576.method1731(62, new class27(var68));
                }
            } else {
                if (class44.field969 == 82) {
                    byte var69 = field3102.method1412((byte) 121);
                    int var70 = field3102.method1413(-11011);
                    int var71 = field3102.method1413(-11011);
                    int var72 = field3102.method1389((byte) 6);
                    int var73 = (var72 & 0x7) + class38.field895;
                    int var74 = ((var72 & 0x7F) >> 4) + class76.field1519;
                    byte var75 = field3102.method1374(31421);
                    int var76 = field3102.method1410(-70);
                    byte var77 = field3102.method1374(31421);
                    byte var78 = field3102.method1429(128);
                    int var79 = field3102.method1389((byte) 31);
                    int var80 = var79 >> 2;
                    int var81 = class100.field1955[var80];
                    int var82 = field3102.method1413(-11011);
                    int var83 = var79 & 0x3;
                    class224 var84;
                    if (class176.field3189 == var76) {
                        var84 = class124.field2412;
                    } else {
                        var84 = class186.field3294[var76];
                    }
                    if (var84 != null) {
                        class117 var85 = class268.method1845(var70, (byte) -114);
                        int var86;
                        int var87;
                        if (var83 == 1 || var83 == 3) {
                            var86 = var85.field2273;
                            var87 = var85.field2307;
                        } else {
                            var86 = var85.field2307;
                            var87 = var85.field2273;
                        }
                        int var88 = (var86 >> 1) + var74;
                        int var89 = (var86 + 1 >> 1) + var74;
                        int var90 = var73 + (var87 >> 1);
                        int var91 = (var87 + 1 >> 1) + var73;
                        int[][] var92 = null;
                        if (class180.field3244 < 3) {
                            var92 = class35.field796[class180.field3244 + 1];
                        }
                        int[][] var93 = class35.field796[class180.field3244];
                        int var94 = (var73 << 7) + (var87 << 6);
                        int var95 = (var74 << 7) + (var86 << 6);
                        int var96 = var93[var88][var90] + var93[var89][var90] + var93[var88][var91] + var93[var89][var91] >> 2;
                        class244 var97 = var85.method828(var95, var93, var85.field2270, false, var94, var96, var80, var92, -76, var83, (class101) null);
                        if (var97 != null) {
                            class258.method1744(var81, var73, 0, -1, 0, var82 + 1, var71 - -1, class180.field3244, var74, (byte) -63);
                            var84.field4049 = class236.field4265 + var71;
                            if (var75 > var78) {
                                byte var98 = var75;
                                var75 = var78;
                                var78 = var98;
                            }
                            var84.field4044 = (class32) var97.field4358;
                            var84.field4028 = var73 * 128 + var87 * 64;
                            if (var69 > var77) {
                                byte var99 = var69;
                                var69 = var77;
                                var77 = var99;
                            }
                            var84.field4041 = var74 + var75;
                            var84.field4047 = var96;
                            var84.field4059 = var73 + var69;
                            var84.field4043 = var74 * 128 + var86 * 64;
                            var84.field4021 = var73 + var77;
                            var84.field4048 = class236.field4265 + var82;
                            var84.field4052 = var74 + var78;
                        }
                    }
                }
                if (class44.field969 == 238) {
                    int var100 = field3102.method1413(-11011);
                    int var101 = field3102.method1389((byte) -93);
                    if (var100 == 65535) {
                        var100 = -1;
                    }
                    int var102 = var101 >> 2;
                    int var103 = class100.field1955[var102];
                    int var104 = var101 & 0x3;
                    int var105 = field3102.method1407(255);
                    int var106 = (var105 >> 4 & 0x7) + class76.field1519;
                    int var107 = (var105 & 0x7) + class38.field895;
                    class122.method870(var104, var106, class180.field3244, var107, var103, var102, var100, -11433);
                } else if (class44.field969 == 242) {
                    int var108 = field3102.method1408((byte) -24);
                    int var109 = (var108 >> 4 & 0x7) + class76.field1519;
                    int var110 = (var108 & 0x7) + class38.field895;
                    int var111 = field3102.method1410(-76);
                    if (var111 == 65535) {
                        var111 = -1;
                    }
                    int var112 = field3102.method1408((byte) -50);
                    int var113 = (var112 & 0xF2) >> 4;
                    int var114 = var112 & 0x7;
                    int var115 = field3102.method1408((byte) -38);
                    if (var109 >= 0 && var110 >= 0 && var109 < 104 && var110 < 104) {
                        int var116 = var113 + 1;
                        if (class124.field2412.field707[0] >= (var109 - var116) && class124.field2412.field707[0] <= (var109 + var116) && (var110 - var116) <= class124.field2412.field705[0] && (var110 + var116) >= class124.field2412.field705[0] && class152.field2879 != 0 && var114 > 0 && class21.field544 < 50 && var111 != -1) {
                            class180.field3243[class21.field544] = var111;
                            class75.field1496[class21.field544] = var114;
                            class246.field4375[class21.field544] = var115;
                            class211.field3815[class21.field544] = null;
                            class91.field1853[class21.field544] = (var109 << 16) + (var110 << 8) + var113;
                            class21.field544++;
                        }
                    }
                } else if (class44.field969 == 165) {
                    int var117 = field3102.method1401(2080652896);
                    int var118 = field3102.method1389((byte) -127);
                    int var119 = (var118 >> 4 & 0x7) + class76.field1519;
                    int var120 = class38.field895 + (var118 & 0x7);
                    int var121 = field3102.method1413(-11011);
                    int var122 = field3102.method1413(-11011);
                    if (var119 >= 0 && var120 >= 0 && var119 < 104 && var120 < 104 && class176.field3189 != var117) {
                        class140 var123 = new class140();
                        var123.field2657 = var122;
                        var123.field2660 = var121;
                        if (class238.field4284[class180.field3244][var119][var120] == null) {
                            class238.field4284[class180.field3244][var119][var120] = new class257();
                        }
                        class238.field4284[class180.field3244][var119][var120].method1731(-49, new class126(var123));
                        class234.method1621(var119, var120, 64);
                    }
                } else if (class44.field969 == 83) {
                    int var124 = field3102.method1407(255);
                    int var125 = (var124 >> 4 & 0x7) + class76.field1519;
                    int var126 = (var124 & 0x7) + class38.field895;
                    int var127 = field3102.method1401(2080652896);
                    if (var125 >= 0 && var126 >= 0 && var125 < 104 && var126 < 104) {
                        class257 var128 = class238.field4284[class180.field3244][var125][var126];
                        if (var128 != null) {
                            for (class126 var129 = (class126) var128.method1737((byte) 74); var129 != null; var129 = (class126) var128.method1740(-8843)) {
                                if ((var127 & 0x7FFF) == var129.field2433.field2660) {
                                    var129.method1477(1);
                                    break;
                                }
                            }
                            if (var128.method1737((byte) 74) == null) {
                                class238.field4284[class180.field3244][var125][var126] = null;
                            }
                            class234.method1621(var125, var126, 64);
                        }
                    }
                } else if (class44.field969 == 111) {
                    int var130 = field3102.method1401(2080652896);
                    int var131 = field3102.method1408((byte) -80);
                    int var132 = (var131 >> 4 & 0x7) + class76.field1519;
                    int var133 = class38.field895 + (var131 & 0x7);
                    int var134 = field3102.method1407(255);
                    int var135 = var134 >> 2;
                    int var136 = var134 & 0x3;
                    int var137 = class100.field1955[var135];
                    if (var132 >= 0 && var133 >= 0 && var132 < 104 && var133 < 104) {
                        class258.method1744(var137, var133, var135, var130, var136, 0, -1, class180.field3244, var132, (byte) -63);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIII)I")
    public static final int method1210(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 > 243) {
            arg3 >>= 0x4;
        } else if (arg2 > 217) {
            arg3 >>= 0x3;
        } else if (arg2 > 192) {
            arg3 >>= 0x2;
        } else if (arg2 > 179) {
            arg3 >>= 0x1;
        }
        if (arg0 == 3) {
            field3100++;
            return (arg1 >> 2 << 10) - (-(arg3 >> 5 << 7) - (arg2 >> 1));
        } else {
            return -25;
        }
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(B)V")
    public static void method1211(byte arg0) {
        field3103 = null;
        if (arg0 <= 114) {
            method1211((byte) 99);
        }
        field3107 = null;
        field3102 = null;
        field3105 = null;
        field3109 = null;
        field3108 = null;
        field3113 = null;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIZLq;II)V")
    public static final void method1212(int arg0, int arg1, boolean arg2, class122 arg3, int arg4, int arg5) {
        field3101++;
        if (class21.field544 >= 50 || arg3.field2378 == null || arg3.field2378.length <= arg1 || arg3.field2378[arg1] == null) {
            return;
        }
        int var6 = arg3.field2378[arg1][0];
        int var7 = var6 >> 8;
        if (arg3.field2378[arg1].length > 1) {
            int var8 = (int) ((double) arg3.field2378[arg1].length * Math.random());
            if (var8 > 0) {
                var7 = arg3.field2378[arg1][var8];
            }
        }
        if (arg4 != 1928670186) {
            return;
        }
        int var9 = var6 & 0xF;
        int var10 = var6 >> 4 & 0x7;
        if (var9 == 0) {
            if (arg2) {
                class37.method310(var7, 0, var10, 50);
            }
        } else if (class152.field2879 != 0) {
            int var11 = (arg0 - 64) / 128;
            class180.field3243[class21.field544] = var7;
            int var12 = (arg5 - 64) / 128;
            class75.field1496[class21.field544] = var10;
            class246.field4375[class21.field544] = 0;
            class211.field3815[class21.field544] = null;
            class91.field1853[class21.field544] = (var11 << 16) + (var12 << 8) + var9;
            class21.field544++;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(JIZ[I)Ljd;")
    public final class86 method1051(long arg0, int arg1, boolean arg2, int[] arg3) {
        field3111++;
        if (arg1 == 0) {
            class219 var6 = class193.method1346(arg3[0], (byte) 37);
            return var6.method1548((byte) 74, (int) arg0);
        }
        if (arg2) {
            method1210(-23, -48, 21, 46);
        }
        if (arg1 == 1 || arg1 == 10) {
            class69 var7 = class272.method1853(0, (int) arg0);
            return var7.field1421;
        } else if (arg1 == 6 || arg1 == 7) {
            return class193.method1346(arg3[0], (byte) 100).method1548((byte) 111, (int) arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIB)Ljd;")
    public static final class86 method1213(int arg0, int arg1, byte arg2) {
        field3110++;
        int var3 = arg0 - arg1;
        if (var3 < -9) {
            return class62.field1228;
        } else if (var3 < -6) {
            return class100.field1954;
        } else if (var3 < -3) {
            return class9.field280;
        } else {
            int var4 = -79 % ((arg2 + 19) / 42);
            if (var3 < 0) {
                return class205.field3703;
            } else if (var3 > 9) {
                return class82.field1614;
            } else if (var3 > 6) {
                return class267.field4717;
            } else if (var3 > 3) {
                return class220.field3959;
            } else if (var3 > 0) {
                return class7.field247;
            } else {
                return class111.field2130;
            }
        }
    }
}
