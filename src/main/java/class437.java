import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class437 extends class260 {

    @OriginalMember(owner = "client!of", name = "s", descriptor = "I")
    public static int field6392 = 1;

    @OriginalMember(owner = "client!of", name = "z", descriptor = "I")
    public static int field6399;

    @OriginalMember(owner = "client!of", name = "k", descriptor = "I")
    public int field6384;

    @OriginalMember(owner = "client!of", name = "l", descriptor = "I")
    public int field6385;

    @OriginalMember(owner = "client!of", name = "n", descriptor = "I")
    public int field6387;

    @OriginalMember(owner = "client!of", name = "o", descriptor = "I")
    public int field6388;

    @OriginalMember(owner = "client!of", name = "t", descriptor = "I")
    public static int field6393;

    @OriginalMember(owner = "client!of", name = "u", descriptor = "I")
    public static int field6394;

    @OriginalMember(owner = "client!of", name = "v", descriptor = "I")
    public static int field6395;

    @OriginalMember(owner = "client!of", name = "x", descriptor = "I")
    public int field6397;

    @OriginalMember(owner = "client!of", name = "y", descriptor = "I")
    public int field6398;

    @OriginalMember(owner = "client!of", name = "q", descriptor = "Lem;")
    public class150 field6390;

    @OriginalMember(owner = "client!of", name = "r", descriptor = "Lem;")
    public class150 field6391;

    @OriginalMember(owner = "client!of", name = "m", descriptor = "Ljava/lang/String;")
    public String field6386;

    @OriginalMember(owner = "client!of", name = "w", descriptor = "Z")
    public boolean field6396;

    @OriginalMember(owner = "client!of", name = "p", descriptor = "[Ljava/lang/Object;")
    public Object[] field6389;

    @OriginalMember(owner = "client!of", name = "A", descriptor = "[[I")
    public static int[][] field6400;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)V")
    public static void method2571(boolean arg0) {
        field6400 = null;
        if (arg0) {
            method2571(true);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "([I[Ljava/lang/Object;I)V")
    public static final void method2572(int[] arg0, Object[] arg1, int arg2) {
        class104.method772(0, arg0, arg1, (byte) -105, arg0.length - 1);
        if (arg2 == 26439) {
            field6393++;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IILya;I)V")
    public static final void method2573(int arg0, int arg1, class38 arg2, int arg3) {
        class267.field3695 = new class373[arg0][arg3];
        field6394++;
        class485.field7085 = arg2;
        if (class58.field699 != null) {
            class402.field5903 = class497.method2904(class58.field699[0], class58.field699[4], class58.field699[2], class58.field699[1], class58.field699[5], class58.field699[3], (byte) -124);
        }
        class421.field6170 = new class373();
        class84.method660(arg1);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I[Lem;IIIIIIII)V")
    public static final void method2574(int arg0, class150[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field6395++;
        class269.field3721.method279(arg6, arg2, arg7, arg9);
        int var10 = 0;
        if (arg0 <= 101) {
            return;
        }
        while (arg1.length > var10) {
            class150 var11 = arg1[var10];
            if (var11 != null && (var11.field2259 == arg5 || arg5 == -1412584499 && class110.field1664 == var11)) {
                int var12;
                if (arg8 == -1) {
                    class521.field7729[class9.field146].setBounds(var11.field2309 + arg4, var11.field2247 + arg3, var11.field2204, var11.field2322);
                    var12 = class9.field146++;
                } else {
                    var12 = arg8;
                }
                var11.field2317 = var12;
                var11.field2270 = class441.field6516;
                if (!client.method1222(var11)) {
                    label574: {
                        if (var11.field2289 != 0) {
                            class199.method1244(var11, 0);
                        }
                        int var13 = var11.field2309 + arg4;
                        int var14 = var11.field2247 + arg3;
                        int var15 = var11.field2163;
                        if (class214.field2982 && (client.method1228(var11).field2719 != 0 || var11.field2315 == 0) && var15 > 127) {
                            var15 = 127;
                        }
                        if (class110.field1664 == var11) {
                            if (arg5 != -1412584499 && (class28.field365 == var11.field2235 || class174.field2591 == var11.field2235)) {
                                class483.field7046 = arg4;
                                class121.field1798 = arg3;
                                class166.field2481 = arg1;
                                break label574;
                            }
                            if (class55.field663 && class493.field7200) {
                                int var16 = class518.field7668.method1813(0);
                                int var17 = class518.field7668.method1822(126);
                                int var18 = var17 - class12.field194;
                                int var19 = var16 - class233.field3292;
                                if (class241.field3372 > var19) {
                                    var19 = class241.field3372;
                                }
                                if ((var11.field2204 + var19) > (class241.field3372 + class257.field3566.field2204)) {
                                    var19 = class241.field3372 + class257.field3566.field2204 - var11.field2204;
                                }
                                if (var18 < class33.field442) {
                                    var18 = class33.field442;
                                }
                                if (var18 + var11.field2322 > class33.field442 + class257.field3566.field2322) {
                                    var18 = class33.field442 + class257.field3566.field2322 - var11.field2322;
                                }
                                var13 = var19;
                                var14 = var18;
                            }
                            if (class174.field2591 == var11.field2235) {
                                var15 = 128;
                            }
                        }
                        int var20;
                        int var21;
                        int var22;
                        int var23;
                        if (var11.field2315 == 2) {
                            var20 = arg7;
                            var21 = arg6;
                            var22 = arg2;
                            var23 = arg9;
                        } else {
                            int var24 = var11.field2204 + var13;
                            int var25 = var11.field2322 + var14;
                            var22 = arg2 >= var14 ? arg2 : var14;
                            var21 = var13 <= arg6 ? arg6 : var13;
                            if (var11.field2315 == 9) {
                                var25++;
                                var24++;
                            }
                            var20 = arg7 <= var24 ? arg7 : var24;
                            var23 = var25 < arg9 ? var25 : arg9;
                        }
                        if (var20 > var21 && var22 < var23) {
                            label576: {
                                if (var11.field2289 != 0) {
                                    if (class186.field2700 == var11.field2289 || class425.field6247 == var11.field2289) {
                                        class526.method3127(var11.field2204, var14, class425.field6247 == var11.field2289, var13, (byte) -26, var11.field2322);
                                        class463.field6801[var12] = true;
                                        class269.field3721.method279(arg6, arg2, arg7, arg9);
                                        break label576;
                                    }
                                    if (class210.field2932 == var11.field2289) {
                                        if (var11.method1012(false, class269.field3721) != null) {
                                            class358.method2144((byte) -69);
                                            class298.method1749(var14, var13, 125, var11, class269.field3721);
                                            class165.field2477[var12] = true;
                                            class269.field3721.method279(arg6, arg2, arg7, arg9);
                                        }
                                        break label576;
                                    }
                                    if (class356.field5203 == var11.field2289) {
                                        if (var11.method1012(false, class269.field3721) != null) {
                                            class5.method33(-128, var13, var14, var11);
                                            class165.field2477[var12] = true;
                                            class269.field3721.method279(arg6, arg2, arg7, arg9);
                                        }
                                        break label576;
                                    }
                                    if (class362.field5292 == var11.field2289) {
                                        class48.method427(var14, class269.field3721, 32637, var11.field2204, var11.field2322, class124.field1851, var13);
                                        class463.field6801[var12] = true;
                                        class269.field3721.method279(arg6, arg2, arg7, arg9);
                                        break label576;
                                    }
                                    if (class117.field1747 == var11.field2289) {
                                        class339.method2016(var14, var13, var11.field2322, class269.field3721, var11.field2204, 56);
                                        class463.field6801[var12] = true;
                                        class269.field3721.method279(arg6, arg2, arg7, arg9);
                                        break label576;
                                    }
                                    if (class361.field5271 == var11.field2289) {
                                        if (!class225.field3200 && !class359.field5236) {
                                            break label576;
                                        }
                                        int var26 = var11.field2204 + var13;
                                        int var27 = var14 + 15;
                                        if (class225.field3200) {
                                            class297.field4084.method1831(var27, -1, (byte) 3, var26, "Fps:" + class244.field3417, -256);
                                            var27 += 15;
                                            Runtime var28 = Runtime.getRuntime();
                                            int var29 = (int) ((var28.totalMemory() - var28.freeMemory()) / 1024L);
                                            int var30 = -256;
                                            if (var29 > 65536) {
                                                var30 = -65536;
                                            }
                                            class297.field4084.method1831(var27, -1, (byte) 3, var26, "Mem:" + var29 + "k", var30);
                                            var27 += 15;
                                            class297.field4084.method1831(var27, -1, (byte) 3, var26, "In:" + class454.field6666 + "B/s Out:" + class110.field1651 + "B/s", -256);
                                            var27 += 15;
                                            int var31 = class269.field3721.method313() / 1024;
                                            class297.field4084.method1831(var27, -1, (byte) 3, var26, "Offheap:" + var31 + "k", var31 <= 65536 ? -256 : -65536);
                                            var27 += 15;
                                            int var32 = 0;
                                            int var33 = 0;
                                            int var34 = 0;
                                            for (int var35 = 0; var35 < 30; var35++) {
                                                var32 += class328.field4478[var35].method2802(-31803);
                                                var33 += class328.field4478[var35].method2800((byte) -67);
                                                var34 += class328.field4478[var35].method2799((byte) 107);
                                            }
                                            int var36 = var34 * 100 / var32;
                                            int var37 = var33 * 10000 / var32;
                                            String var38 = "Cache:" + class252.method1514(0, true, (long) var37, 2, (byte) 62) + "% (" + var36 + "%)";
                                            class451.field6653.method1831(var27, -1, (byte) 3, var26, var38, -256);
                                            var27 += 12;
                                        }
                                        if (class85.field1260 > 0) {
                                            class451.field6653.method1831(var27, -1, (byte) 3, var26, "Particles: " + class101.field1534 + " / " + class85.field1260, -256);
                                        }
                                        var27 += 12;
                                        if (class359.field5236) {
                                            class451.field6653.method1831(var27, -1, (byte) 3, var26, "Polys: " + class269.field3721.method283() + " Models: " + class269.field3721.method272(), -256);
                                            var27 += 12;
                                            class451.field6653.method1831(var27, -1, (byte) 3, var26, "Ls: " + class143.field2059 + " La: " + class74.field1003 + " NPC: " + class289.field4004 + " Pl: " + class498.field7256, -256);
                                            class353.method2117(7051);
                                            var27 += 12;
                                        }
                                        class463.field6801[var12] = true;
                                        break label576;
                                    }
                                }
                                if (var11.field2315 == 0) {
                                    if (class420.field6154 == var11.field2289 && class269.field3721.method261()) {
                                        class269.field3721.method306(var13, var14, var11.field2204, var11.field2322);
                                    }
                                    method2574(122, arg1, var22, var14 - var11.field2173, var13 - var11.field2181, var11.field2277, var21, var20, var12, var23);
                                    if (var11.field2299 != null) {
                                        method2574(112, var11.field2299, var22, var14 - var11.field2173, var13 - var11.field2181, var11.field2277, var21, var20, var12, var23);
                                    }
                                    class295 var39 = (class295) class212.field2960.method1492((long) var11.field2277, 6340);
                                    if (var39 != null) {
                                        class247.method1484(var20, 1, var12, var13, var21, var14, var39.field4055, var23, var22);
                                    }
                                    if (class420.field6154 == var11.field2289 && class269.field3721.method261()) {
                                        class269.field3721.method329();
                                        class401.field5885 = true;
                                    }
                                    class269.field3721.method279(arg6, arg2, arg7, arg9);
                                }
                                if (class25.field330[var12] || class278.field3812 > 1) {
                                    if (var11.field2315 == 3) {
                                        if (var15 == 0) {
                                            if (var11.field2278) {
                                                class269.field3721.method243(var13, var14, var11.field2204, var11.field2322, var11.field2288, 0);
                                            } else {
                                                class269.field3721.method253(var13, var14, var11.field2204, var11.field2322, var11.field2288, 0);
                                            }
                                        } else if (var11.field2278) {
                                            class269.field3721.method243(var13, var14, var11.field2204, var11.field2322, var11.field2288 & 0xFFFFFF | 255 - (var15 & 0xFF) << 24, 1);
                                        } else {
                                            class269.field3721.method253(var13, var14, var11.field2204, var11.field2322, var11.field2288 & 0xFFFFFF | 255 - (var15 & 0xFF) << 24, 1);
                                        }
                                    } else if (var11.field2315 == 4) {
                                        class315 var40 = var11.method1011(class269.field3721, 7442);
                                        if (var40 != null) {
                                            int var41 = var11.field2288;
                                            String var42 = var11.field2199;
                                            if (var11.field2237 != -1) {
                                                class508 var43 = class328.field4480.method3091(125, var11.field2237);
                                                var42 = var43.field7506;
                                                if (var42 == null) {
                                                    var42 = "null";
                                                }
                                                if ((var43.field7511 == 1 || var11.field2257 != 1) && var11.field2257 != -1) {
                                                    var42 = "<col=ff9040>" + var42 + "</col> x" + class2.method7(true, var11.field2257);
                                                }
                                            }
                                            if (class408.field5971 == var11) {
                                                var42 = class134.field1941.method2731(62, class372.field5455);
                                                var41 = var11.field2288;
                                            }
                                            if (class428.field6264) {
                                                class269.field3721.method250(var13, var14, var13 + var11.field2204, var11.field2322 + var14);
                                            }
                                            var40.method1841(null, false, var11.field2263, 0, var11.field2171, var11.field2311, var11.field2190, var13, var14, null, var11.field2291 ? 255 - (var15 & 0xFF) << 24 : -1, class134.field1947, var42, 0, var11.field2322, var11.field2204, 255 - (var15 & 0xFF) << 24 | var41);
                                            if (class428.field6264) {
                                                class269.field3721.method279(arg6, arg2, arg7, arg9);
                                            }
                                        } else if (class9.field141) {
                                            class370.method2222(0, var11);
                                        }
                                    } else if (var11.field2315 == 5) {
                                        if (var11.field2279 >= 0) {
                                            var11.method998(class214.field2995, class328.field4481, -78).method1811(var11.field2322, class269.field3721, -21927, var11.field2204, var14, 0, var13, var11.field2292 << 3, var11.field2185 << 3, 0);
                                        } else {
                                            class16 var44;
                                            if (var11.field2237 == -1) {
                                                var44 = var11.method1009(class269.field3721, false);
                                            } else {
                                                class441 var45 = var11.field2266 ? class316.field4324.field6417 : null;
                                                var44 = class328.field4480.method3099(var45, 36, class269.field3721, var11.field2223 | 0xFF000000, var11.field2237, var11.field2257, var11.field2228, var11.field2324);
                                            }
                                            if (var44 != null) {
                                                int var46 = var44.method84();
                                                int var47 = var44.method93();
                                                int var48 = (var11.field2288 == 0 ? 16777215 : var11.field2288 & 0xFFFFFF) | 255 - (var15 & 0xFF) << 24;
                                                if (var11.field2319) {
                                                    class269.field3721.method250(var13, var14, var11.field2204 + var13, var11.field2322 + var14);
                                                    if (var11.field2191 != 0) {
                                                        int var49 = (var11.field2204 + var46 - 1) / var46;
                                                        int var50 = (var11.field2322 + var47 - 1) / var47;
                                                        for (int var51 = 0; var51 < var49; var51++) {
                                                            for (int var52 = 0; var52 < var50; var52++) {
                                                                if (var11.field2288 == 0) {
                                                                    var44.method92((float) var46 / 2.0F + (float) (var13 + (var46 * var51)), (float) var47 / 2.0F + (float) (var47 * var52 + var14), 4096, var11.field2191);
                                                                } else {
                                                                    var44.method90((float) var46 / 2.0F + (float) (var46 * var51 + var13), (float) var47 / 2.0F + (float) (var14 - -(var47 * var52)), 4096, var11.field2191, 0, var48, 1);
                                                                }
                                                            }
                                                        }
                                                    } else if (var11.field2288 == 0 && var15 == 0) {
                                                        var44.method83(var13, var14, var11.field2204, var11.field2322);
                                                    } else {
                                                        var44.method82(var13, var14, var11.field2204, var11.field2322, 0, var48, 1);
                                                    }
                                                    class269.field3721.method279(arg6, arg2, arg7, arg9);
                                                } else if (var11.field2288 == 0 && var15 == 0) {
                                                    if (var11.field2191 != 0) {
                                                        var44.method92((float) var11.field2204 / 2.0F + (float) var13, (float) var11.field2322 / 2.0F + (float) var14, var11.field2204 * 4096 / var46, var11.field2191);
                                                    } else if (var11.field2204 == var46 && var11.field2322 == var47) {
                                                        var44.method85(var13, var14);
                                                    } else {
                                                        var44.method99(var13, var14, var11.field2204, var11.field2322);
                                                    }
                                                } else if (var11.field2191 != 0) {
                                                    var44.method90((float) var11.field2204 / 2.0F + (float) var13, (float) var11.field2322 / 2.0F + (float) var14, var11.field2204 * 4096 / var46, var11.field2191, 0, var48, 1);
                                                } else if (var11.field2204 == var46 && var11.field2322 == var47) {
                                                    var44.method100(var13, var14, 0, var48, 1);
                                                } else {
                                                    var44.method94(var13, var14, var11.field2204, var11.field2322, 0, var48, 1);
                                                }
                                            } else if (class9.field141) {
                                                class370.method2222(0, var11);
                                            }
                                        }
                                    } else if (var11.field2315 == 6) {
                                        class233.method1437(78);
                                        class471 var53 = null;
                                        int var54 = 0;
                                        if (var11.field2237 != -1) {
                                            class508 var62 = class328.field4480.method3091(93, var11.field2237);
                                            if (var62 != null) {
                                                class508 var63 = var62.method3028(0, var11.field2257);
                                                class104 var64 = var11.field2262 == -1 ? null : class222.field3168.method126(-73, var11.field2262);
                                                class441 var65 = var11.field2266 ? class316.field4324.field6417 : null;
                                                var53 = var63.method3043(var11.field2240, 127, var64, class269.field3721, 1, 2048, var11.field2281, var65, var11.field2267);
                                                if (var53 == null) {
                                                    class370.method2222(0, var11);
                                                } else {
                                                    var54 = -var53.method380() >> 1;
                                                }
                                            }
                                        } else if (var11.field2297 == 5) {
                                            int var55 = var11.field2229;
                                            if (var55 >= 0 && var55 < 2048) {
                                                class438 var56 = class12.field182[var55];
                                                class104 var57 = var11.field2262 == -1 ? null : class222.field3168.method126(-80, var11.field2262);
                                                if (var56 != null && (class152.field2335 == var55 || class316.method1846(var56.field6421, 7) == var11.field2194)) {
                                                    var53 = var56.field6417.method2616(class168.field2515, class222.field3168, true, null, class421.field6166, class269.field3721, var11.field2281, -1, null, var11.field2267, class158.field2401, var11.field2240, 911238472, class328.field4480, var57, class501.field7375, 2048, 0, 0);
                                                }
                                            }
                                        } else if (var11.field2297 == 8 || var11.field2297 == 9) {
                                            class128 var59 = class507.method3024(var11.field2229, false, Integer.MIN_VALUE);
                                            class104 var60 = var11.field2262 == -1 ? null : class222.field3168.method126(-123, var11.field2262);
                                            if (var59 != null) {
                                                class441 var61 = var11.field2266 ? class316.field4324.field6417 : null;
                                                var53 = var59.method887(var11.field2194, class269.field3721, var11.field2297 == 9, 2048, var11.field2267, var11.field2281, var61, var11.field2240, false, var60);
                                            }
                                        } else if (var11.field2262 == -1) {
                                            var53 = var11.method1005(class328.field4480, class222.field3168, class269.field3721, 0, -1, null, class421.field6166, class158.field2401, -1, -7473, class168.field2515, class501.field7375, class316.field4324.field6417, 2048);
                                            if (var53 == null && class9.field141) {
                                                class370.method2222(0, var11);
                                            }
                                        } else {
                                            class104 var58 = class222.field3168.method126(-68, var11.field2262);
                                            var53 = var11.method1005(class328.field4480, class222.field3168, class269.field3721, var11.field2240, var11.field2267, var58, class421.field6166, class158.field2401, var11.field2281, -7473, class168.field2515, class501.field7375, class316.field4324.field6417, 2048);
                                            if (var53 == null && class9.field141) {
                                                class370.method2222(0, var11);
                                            }
                                        }
                                        if (var53 != null) {
                                            int var66;
                                            if (var11.field2236 > 0) {
                                                var66 = (var11.field2204 << 9) / var11.field2236;
                                            } else {
                                                var66 = 512;
                                            }
                                            int var67;
                                            if (var11.field2301 <= 0) {
                                                var67 = 512;
                                            } else {
                                                var67 = (var11.field2322 << 9) / var11.field2301;
                                            }
                                            int var68 = var11.field2204 / 2 + (var13 + (var11.field2249 * var66 >> 9));
                                            int var69 = (var11.field2178 * var67 >> 9) + var11.field2322 / 2 + var14;
                                            class450.field6623.method179();
                                            class269.field3721.method299(class450.field6623);
                                            class269.field3721.method296(var68, var69, var66, var67);
                                            class269.field3721.method245((float) (var11.field2320 << 0), var11.field2285 ? (float) (var11.field2314 << 0) : (float) (var11.field2314 << 0) * 1.5F);
                                            if (arg5 == -1412584499 || class401.field5885) {
                                                class269.field3721.method260();
                                                class269.field3721.method322();
                                                class269.field3721.method279(arg6, arg2, arg7, arg9);
                                                class401.field5885 = false;
                                            }
                                            if (var11.field2295) {
                                                class269.field3721.method235(false);
                                            }
                                            int var70 = (var11.field2304 << 0) * class183.field2684[var11.field2276 << 3] >> 15;
                                            int var71 = (var11.field2304 << 0) * class183.field2678[var11.field2276 << 3] >> 15;
                                            class228.field3243.method193(-var11.field2326 << 3);
                                            class228.field3243.method181(var11.field2234 << 3);
                                            class228.field3243.method188(var11.field2213 << 0, (var11.field2225 << 0) + var54 + var70, var71 - -(var11.field2225 << 0));
                                            class228.field3243.method187(var11.field2276 << 3);
                                            if (class428.field6264) {
                                                class269.field3721.method250(var13, var14, var11.field2204 + var13, var11.field2322 + var14);
                                            }
                                            if (var11.field2285) {
                                                var53.method384(class228.field3243, null, var11.field2304 << 0, 1);
                                            } else {
                                                var53.method397(class228.field3243, null, 1);
                                            }
                                            if (class428.field6264) {
                                                class269.field3721.method279(arg6, arg2, arg7, arg9);
                                            }
                                            if (var11.field2295) {
                                                class269.field3721.method235(true);
                                            }
                                            class269.field3721.method245(0.0F, 0.0F);
                                        }
                                    } else if (var11.field2315 == 9) {
                                        int var72;
                                        int var73;
                                        int var74;
                                        int var75;
                                        if (var11.field2253) {
                                            var72 = var11.field2322 + var14;
                                            var74 = var13;
                                            var75 = var14;
                                            var73 = var13 + var11.field2204;
                                        } else {
                                            var72 = var14;
                                            var73 = var11.field2204 + var13;
                                            var74 = var13;
                                            var75 = var11.field2322 + var14;
                                        }
                                        if (var11.field2214 == 1) {
                                            class269.field3721.method285(var74, var72, var73, var75, var11.field2288, 0);
                                        } else {
                                            class269.field3721.method227(var74, var72, var73, var75, var11.field2288, var11.field2214, 0);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            var10++;
        }
    }

    static {
        new class466("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
        field6399 = -1;
    }
}
