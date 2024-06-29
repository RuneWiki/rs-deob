import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class349 {

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "[Z")
    public static boolean[] field5544 = new boolean[100];

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "Z")
    public static boolean field5545 = false;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    public int field5535;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
    public static int field5536;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
    public static int field5537;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
    public static int field5538;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "I")
    public int field5539;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "I")
    public int field5541;

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "I")
    public int field5542;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "I")
    public int field5543;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "I")
    public static int field5546;

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "I")
    public int field5547;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "[[[Lfk;")
    public static class317[][][] field5540;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)Lqn;", line = 5)
    public static final class361 method2449(int arg0) {
        if (arg0 != -491401919) {
            method2453(-20, -57, -68, -71, 50, 50, (byte) -72);
        }
        field5546++;
        int var1 = class62.field957[0] * class358.field5694[0];
        byte[] var2 = class172.field2732[0];
        class361 var6;
        if (class172.field2744[0]) {
            byte[] var3 = class25.field396[0];
            int[] var4 = new int[var1];
            for (int var5 = 0; var5 < var1; var5++) {
                var4[var5] = class41.method426(class38.field582[class301.method2169(255, var2[var5])], class301.method2169(255, var3[var5]) << 24);
            }
            var6 = new class54(class280.field4332, class49.field776, class150.field2449[0], class89.field1262[0], class358.field5694[0], class62.field957[0], var4);
        } else {
            int[] var7 = new int[var1];
            for (int var8 = 0; var8 < var1; var8++) {
                var7[var8] = class38.field582[class301.method2169(var2[var8], 255)];
            }
            var6 = new class361(class280.field4332, class49.field776, class150.field2449[0], class89.field1262[0], class358.field5694[0], class62.field957[0], var7);
        }
        class29.method330(-1);
        return var6;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V", line = 61)
    public static final void method2450(byte arg0) {
        field5538++;
        int var1 = 40 % ((74 - arg0) / 44);
        if (class49.field774 == null) {
            return;
        }
        class110 var2 = new class110();
        for (int var3 = 0; var3 < 13; var3++) {
            for (int var4 = 0; var4 < 13; var4++) {
                class49.field774[var3][var4] = var2;
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(B)V", line = 93)
    public static void method2451(byte arg0) {
        field5544 = null;
        if (arg0 != -117) {
            method2450((byte) -90);
        }
        field5540 = (class317[][][]) null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZLqg;IILqg;)I", line = 104)
    public static final int method2452(boolean arg0, class316 arg1, int arg2, int arg3, class316 arg4) {
        field5536++;
        if (arg3 == 1) {
            int var5 = arg1.field5221;
            int var6 = arg4.field5221;
            if (!arg0) {
                if (var6 == -1) {
                    var6 = 2001;
                }
                if (var5 == -1) {
                    var5 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg3 == 2) {
            return class278.method2036(arg4.method2228(0).field1131, class339.field5211, arg1.method2228(0).field1131, (byte) -37);
        } else if (arg3 == 3) {
            if (arg1.field4869.equals("-")) {
                if (arg4.field4869.equals("-")) {
                    return 0;
                } else if (arg0) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg4.field4869.equals("-")) {
                return arg0 ? 1 : -1;
            } else {
                return class278.method2036(arg4.field4869, class339.field5211, arg1.field4869, (byte) -120);
            }
        } else if (arg3 == 4) {
            return arg1.method2387(0) ? (arg4.method2387(0) ? 0 : 1) : (arg4.method2387(0) ? -1 : 0);
        } else if (arg3 == 5) {
            return arg1.method2386((byte) -58) ? (arg4.method2386((byte) -54) ? 0 : 1) : (arg4.method2386((byte) -79) ? -1 : 0);
        } else if (arg3 == 6) {
            return arg1.method2385(-1) ? (arg4.method2385(-1) ? 0 : 1) : (arg4.method2385(-1) ? -1 : 0);
        } else if (arg3 == 7) {
            return arg1.method2381(15253) ? (arg4.method2381(15253) ? 0 : 1) : (arg4.method2381(arg2 ^ 0x3B87) ? -1 : 0);
        } else {
            if (arg2 != 18) {
                method2452(true, (class316) null, -78, 31, (class316) null);
            }
            return arg1.field4875 - arg4.field4875;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIIIB)V", line = 178)
    public static final void method2453(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field5537++;
        class199.field3090 = 0;
        for (int var7 = -1; var7 < class66.field995 + class6.field80; var7++) {
            class130 var8 = null;
            class91 var9;
            if (var7 < 0) {
                var9 = class173.field2746;
            } else if (class66.field995 > var7) {
                var9 = class177.field2795[class345.field5495[var7]];
            } else {
                var9 = class110.field1683[class126.field2114[var7 - class66.field995]];
                var8 = ((class244) var9).field3802;
                if (var8.field2149 != null) {
                    var8 = var8.method1120((byte) -126);
                    if (var8 == null) {
                        continue;
                    }
                }
            }
            if (var9.method811(256)) {
                class306.method2196(var9.method809((byte) 125), arg4 >> 1, arg2, arg0, (byte) 99, arg5 >> 1, var9);
                if (class18.field292 >= 0) {
                    if (var9.field1314 != null && (class66.field995 <= var7 || class270.field4150 == 0 || class270.field4150 == 3 || class270.field4150 == 1 && class214.method1604(-128, ((class171) var9).field2706)) && class199.field3090 < class311.field4832) {
                        class311.field4823[class199.field3090] = class64.field988.method1194(var9.field1314) / 2;
                        class311.field4834[class199.field3090] = class64.field988.field2366;
                        class311.field4825[class199.field3090] = class18.field292;
                        class311.field4808[class199.field3090] = class59.field925;
                        class311.field4837[class199.field3090] = var9.field1381;
                        class311.field4812[class199.field3090] = var9.field1327;
                        class311.field4824[class199.field3090] = var9.field1382;
                        class311.field4818[class199.field3090] = var9.field1314;
                        class199.field3090++;
                    }
                    class215 var10 = class85.field1216[0];
                    int var11 = arg1 + class59.field925 - Math.max(class64.field988.field2363, var10.field3367);
                    if (!var9.field1291 && var9.field1348 > class360.field5718) {
                        class215 var12 = class85.field1216[1];
                        if (var9 instanceof class244) {
                            class244 var13 = (class244) var9;
                            class215[] var14 = (class215[]) ((class215[]) class256.field3936.method654(-51, (long) var13.field3802.field2157));
                            if (var14 == null) {
                                var14 = class67.method661(0, var13.field3802.field2157, class303.field4725, (byte) 95);
                                if (var14 != null) {
                                    class256.field3936.method652(-71, var14, (long) var13.field3802.field2157);
                                }
                            }
                            if (var14 != null && var14.length == 2) {
                                var12 = var14[1];
                                var10 = var14[0];
                            }
                        }
                        int var15 = arg3 + class18.field292 - (var10.field3366 >> 1);
                        var10.method17(var15, var11);
                        int var16 = var9.field1301 * var10.field3366 / 255;
                        if (class240.field3737) {
                            class213.method1600(var15, var11, var15 + var16, var10.field3367 + var11);
                        } else {
                            class60.method589(var15, var11, var15 + var16, var10.field3367 + var11);
                        }
                        var12.method17(var15, var11);
                        if (class240.field3737) {
                            class213.method1595(arg3, arg1, arg3 + arg4, arg1 + arg5);
                        } else {
                            class60.method598(arg3, arg1, arg3 + arg4, arg1 + arg5);
                        }
                    }
                    var11 -= 2;
                    if (!var9.field1291) {
                        if (class66.field995 > var7) {
                            class171 var17 = (class171) var9;
                            if (var17.field2712 != -1) {
                                var11 -= 25;
                                class310.field4806[var17.field2712].method17(class18.field292 + arg3 - 12, var11);
                                var11 -= 2;
                            }
                            if (var17.field2720 != -1) {
                                var11 -= 25;
                                class19.field312[var17.field2720].method17(arg3 + class18.field292 - 12, var11);
                                var11 -= 2;
                            }
                        } else if (var8.field2199 >= 0 && var8.field2199 < class19.field312.length) {
                            class215 var18 = class19.field312[var8.field2199];
                            var11 -= 25;
                            var18.method17(class18.field292 + arg3 - (var18.field3366 >> 1), var11);
                            var11 -= 2;
                        }
                    }
                    int var10000;
                    if (!var9 instanceof class171) {
                        int var25 = 0;
                        int var26 = 0;
                        class68[] var27 = class301.field4677;
                        while (var26 < var27.length) {
                            class68 var28 = var27[var26];
                            if (var28 != null && var28.field1036 == 1 && class126.field2114[var7 - class66.field995] == var28.field1035) {
                                class215 var29 = class221.field3434[var28.field1044];
                                if (var29.field3367 > var25) {
                                    var25 = var29.field3367;
                                }
                                if (class360.field5718 % 20 < 10) {
                                    var29.method17(class18.field292 + arg3 - 12, -var29.field3367 + var11);
                                }
                            }
                            var26++;
                        }
                        if (var25 > 0) {
                            var10000 = var11 - (var25 + 2);
                        }
                    } else if (var7 >= 0) {
                        int var19 = 0;
                        class68[] var20 = class301.field4677;
                        for (int var21 = 0; var21 < var20.length; var21++) {
                            class68 var22 = var20[var21];
                            if (var22 != null && var22.field1036 == 10 && class345.field5495[var7] == var22.field1035) {
                                class215 var23 = class221.field3434[var22.field1044];
                                if (var23.field3367 > var19) {
                                    var19 = var23.field3367;
                                }
                                var23.method17(class18.field292 + arg3 - 12, var11 - var23.field3367);
                            }
                        }
                        if (var19 > 0) {
                            var10000 = var11 - (var19 + 2);
                        }
                    }
                    for (int var31 = 0; var31 < 4; var31++) {
                        if (var9.field1295[var31] > class360.field5718) {
                            int var32 = var9.method809((byte) 124) / 2;
                            class306.method2196(var32, arg4 >> 1, arg2, arg0, (byte) 55, arg5 >> 1, var9);
                            if (class18.field292 > -1) {
                                if (var31 == 1) {
                                    class59.field925 -= 20;
                                }
                                if (var31 == 2) {
                                    class18.field292 -= 15;
                                    class59.field925 -= 10;
                                }
                                if (var31 == 3) {
                                    class59.field925 -= 10;
                                    class18.field292 += 15;
                                }
                                class350.field5563[var9.field1363[var31]].method17(class18.field292 + arg3 - 12, arg1 + -12 + class59.field925);
                                class314.field4853.method1189(Integer.toString(var9.field1324[var31]), arg3 + class18.field292 - 1, class59.field925 - -3 + arg1, 16777215, 0);
                            }
                        }
                    }
                }
            }
        }
        int var33 = 0;
        if (arg6 >= -3) {
            return;
        }
        while (var33 < class178.field2810) {
            int var34 = class146.field2392[var33];
            class91 var35;
            if (var34 < 2048) {
                var35 = class177.field2795[var34];
            } else {
                var34 -= 2048;
                var35 = class110.field1683[var34];
            }
            int var36 = class277.field4280[var33];
            class91 var37;
            if (var36 < 2048) {
                var37 = class177.field2795[var36];
            } else {
                var36 -= 2048;
                var37 = class110.field1683[var36];
            }
            int var38 = var35.method812(61);
            if (var38 != -1) {
                Object var39 = null;
                class215 var40 = (class215) class134.field2248.method654(-118, (long) var38);
                if (var40 == null) {
                    class215[] var41 = class67.method661(0, var38, class303.field4725, (byte) 95);
                    if (var41 != null) {
                        var40 = var41[0];
                        class134.field2248.method652(-60, var40, (long) var38);
                    }
                }
                if (var40 != null) {
                    int var42 = var37.field1306++;
                    class186.method1434(false, var37.field1359, var37.field1286, var37.method808(-89) * 64, arg4 >> 1, arg5 >> 1, arg0, 0, arg2);
                    int var43 = class59.field925 - 16 - 54;
                    int var44 = var42 % 4 * 18 + var43;
                    int var45 = class18.field292 + arg3 - 18;
                    int var46 = var42 / 4 * 18 + var45;
                    var40.method17(var46, var44);
                    if (var35 == var37) {
                        if (class240.field3737) {
                            class213.method1599(var46 - 1, var44 + -1, 18, 18, 16776960);
                        } else {
                            class60.method604(var46 - 1, var44 - 1, 18, 18, 16776960);
                        }
                    }
                    if (class344.field5479 >= var46 && var40.field3366 + var46 > class344.field5479 && class191.field3003 >= var44 && class191.field3003 < var40.field3367 + var44) {
                        if ((var35 instanceof class171)) {
                            class238.field3694[0] = (long) var34 << 32;
                        } else {
                            class238.field3694[0] = class146.method1222((long) var34 << 32, 536870912L);
                        }
                        class74.field1096 = 1;
                        class214.field3348 = false;
                    }
                }
            }
            var33++;
        }
        for (int var47 = 0; var47 < class199.field3090; var47++) {
            int var48 = class311.field4808[var47];
            int var49 = class311.field4825[var47];
            int var50 = class311.field4823[var47];
            boolean var51 = true;
            int var52 = class311.field4834[var47];
            while (var51) {
                var51 = false;
                for (int var53 = 0; var53 < var47; var53++) {
                    if ((class311.field4808[var53] - class311.field4834[var53]) < (var48 + 2) && (class311.field4808[var53] + 2) > (var48 - var52) && (var49 - var50) < (class311.field4825[var53] + class311.field4823[var53]) && (class311.field4825[var53] - class311.field4823[var53]) < (var49 + var50) && var48 > (class311.field4808[var53] - class311.field4834[var53])) {
                        var51 = true;
                        var48 = class311.field4808[var53] - class311.field4834[var53];
                    }
                }
            }
            class18.field292 = class311.field4825[var47];
            class59.field925 = class311.field4808[var47] = var48;
            String var54 = class311.field4818[var47];
            if (class61.field947 == 0) {
                int var55 = 16776960;
                if (class311.field4837[var47] < 6) {
                    var55 = class295.field4583[class311.field4837[var47]];
                }
                if (class311.field4837[var47] == 6) {
                    var55 = (class192.field3027 % 20) < 10 ? 16711680 : 16776960;
                }
                if (class311.field4837[var47] == 7) {
                    var55 = (class192.field3027 % 20) < 10 ? 255 : 65535;
                }
                if (class311.field4837[var47] == 8) {
                    var55 = class192.field3027 % 20 >= 10 ? 8454016 : 45056;
                }
                if (class311.field4837[var47] == 9) {
                    int var56 = 150 - class311.field4824[var47];
                    if (var56 < 50) {
                        var55 = var56 * 1280 + 16711680;
                    } else if (var56 < 100) {
                        var55 = 16776960 - (var56 * 327680 - 16384000);
                    } else if (var56 < 150) {
                        var55 = var56 * 5 + 65280 - 500;
                    }
                }
                if (class311.field4837[var47] == 10) {
                    int var57 = 150 - class311.field4824[var47];
                    if (var57 < 50) {
                        var55 = var57 * 5 + 16711680;
                    } else if (var57 < 100) {
                        var55 = 16384000 - (var57 * 327680 - 16711935);
                    } else if (var57 < 150) {
                        var55 = (var57 - 100) * 327680 + 255 - ((var57 + -100) * 5);
                    }
                }
                if (class311.field4837[var47] == 11) {
                    int var58 = 150 - class311.field4824[var47];
                    if (var58 < 50) {
                        var55 = 16777215 - var58 * 327685;
                    } else if (var58 < 100) {
                        var55 = var58 * 327685 + 65280 - 16384250;
                    } else if (var58 < 150) {
                        var55 = 49545215 - (var58 * 327680);
                    }
                }
                if (class311.field4812[var47] == 0) {
                    class64.field988.method1189(var54, class18.field292 + arg3, class59.field925 + arg1, var55, 0);
                }
                if (class311.field4812[var47] == 1) {
                    class64.field988.method1209(var54, class18.field292 + arg3, arg1 - -class59.field925, var55, 0, class192.field3027);
                }
                if (class311.field4812[var47] == 2) {
                    class64.field988.method1199(var54, class18.field292 + arg3, arg1 - -class59.field925, var55, 0, class192.field3027);
                }
                if (class311.field4812[var47] == 3) {
                    class64.field988.method1202(var54, class18.field292 + arg3, class59.field925 + arg1, var55, 0, class192.field3027, 150 - class311.field4824[var47]);
                }
                if (class311.field4812[var47] == 4) {
                    int var59 = (150 - class311.field4824[var47]) * (class64.field988.method1194(var54) + 100) / 150;
                    if (class240.field3737) {
                        class213.method1600(class18.field292 + arg3 - 50, arg1, arg3 + class18.field292 + 50, arg1 + arg5);
                    } else {
                        class60.method589(class18.field292 + arg3 - 50, arg1, class18.field292 + arg3 + 50, arg1 + arg5);
                    }
                    class64.field988.method1190(var54, arg3 - (-class18.field292 - 50) - var59, arg1 - -class59.field925, var55, 0);
                    if (class240.field3737) {
                        class213.method1595(arg3, arg1, arg3 + arg4, arg1 + arg5);
                    } else {
                        class60.method598(arg3, arg1, arg3 + arg4, arg1 + arg5);
                    }
                }
                if (class311.field4812[var47] == 5) {
                    int var60 = 150 - class311.field4824[var47];
                    if (class240.field3737) {
                        class213.method1600(arg3, arg1 + class59.field925 - class64.field988.field2366 - 1, arg3 - -arg4, class59.field925 + arg1 + 5);
                    } else {
                        class60.method589(arg3, class59.field925 + arg1 - (class64.field988.field2366 - -1), arg3 + arg4, arg1 - (-class59.field925 - 5));
                    }
                    int var61 = 0;
                    if (var60 < 25) {
                        var61 = var60 - 25;
                    } else if (var60 > 125) {
                        var61 = var60 - 125;
                    }
                    class64.field988.method1189(var54, class18.field292 + arg3, class59.field925 + arg1 + var61, var55, 0);
                    if (class240.field3737) {
                        class213.method1595(arg3, arg1, arg3 + arg4, arg1 + arg5);
                    } else {
                        class60.method598(arg3, arg1, arg3 + arg4, arg1 + arg5);
                    }
                }
            } else {
                class64.field988.method1189(var54, class18.field292 + arg3, class59.field925 + arg1, 16776960, 0);
            }
        }
    }
}
