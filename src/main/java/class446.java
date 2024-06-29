import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dea")
public class class446 {

    @OriginalMember(owner = "client!dea", name = "d", descriptor = "Ldea;")
    public static class446 field6287 = new class446();

    @OriginalMember(owner = "client!dea", name = "f", descriptor = "Ldea;")
    public static class446 field6289 = new class446();

    @OriginalMember(owner = "client!dea", name = "g", descriptor = "Ldea;")
    public static class446 field6290 = new class446();

    @OriginalMember(owner = "client!dea", name = "h", descriptor = "Ldea;")
    public static class446 field6291 = new class446();

    @OriginalMember(owner = "client!dea", name = "i", descriptor = "Lsb;")
    public static class305 field6292 = new class305(15, 8);

    @OriginalMember(owner = "client!dea", name = "j", descriptor = "Lcq;")
    public static class110 field6293 = new class110(74, 2);

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "I")
    public static int field6284;

    @OriginalMember(owner = "client!dea", name = "b", descriptor = "I")
    public static int field6285;

    @OriginalMember(owner = "client!dea", name = "c", descriptor = "I")
    public static int field6286;

    @OriginalMember(owner = "client!dea", name = "e", descriptor = "I")
    public static int field6288;

    @OriginalMember(owner = "client!dea", name = "k", descriptor = "I")
    public static int field6294;

    @OriginalMember(owner = "client!dea", name = "l", descriptor = "Lla;")
    public static class413 field6295;

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(Z)V")
    public static void method2585(boolean arg0) {
        field6289 = null;
        field6290 = null;
        field6293 = null;
        field6291 = null;
        field6295 = null;
        if (arg0) {
            method2588(84, 48, -48, 2, null, 7, -14, -28, 122, 90);
        }
        field6292 = null;
        field6287 = null;
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(ZLjava/lang/String;)[B")
    public static final byte[] method2586(boolean arg0, String arg1) {
        field6285++;
        int var2 = arg1.length();
        if (var2 == 0) {
            return new byte[0];
        }
        int var3 = var2 + 3 & 0xFFFFFFFC;
        if (!arg0) {
            method2585(true);
        }
        int var4 = var3 / 4 * 3;
        if (var2 <= var3 - 2 || class85.method445(95, arg1.charAt(var3 - 2)) == -1) {
            var4 -= 2;
        } else if (var3 - 1 >= var2 || class85.method445(81, arg1.charAt(var3 - 1)) == -1) {
            var4--;
        }
        byte[] var5 = new byte[var4];
        class80.method426(arg1, 100, var5, 0);
        return var5;
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(I)V")
    public static final void method2587(int arg0) {
        field6288++;
        class499.method2880(-882);
        class679.method3766(class639.field9075.field6784, 22050, 2, (byte) 104);
        class39.field394 = class327.method1841(class41.field407, class353.field4757, (byte) 54, 0, 22050);
        class39.field394.method3548((byte) -124, class257.field3238);
        class637.field8964 = class327.method1841(class41.field407, class353.field4757, (byte) 54, 1, 2048);
        int var1 = 30 / ((arg0 - 15) / 52);
        class637.field8964.method3548((byte) -99, class209.field2471);
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(IIII[Lwp;IIIII)V")
    public static final void method2588(int arg0, int arg1, int arg2, int arg3, class452[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field6286++;
        if (arg0 != -128) {
            field6290 = null;
        }
        class701.field9813.method982(arg6, arg2, arg3, arg1);
        for (int var10 = 0; var10 < arg4.length; var10++) {
            class452 var11 = arg4[var10];
            if (var11 != null && (var11.field6467 == arg7 || arg7 == -1412584499 && class497.field7199 == var11)) {
                int var12;
                if (arg5 == -1) {
                    class275.field3446[class141.field1556].setBounds(var11.field6357 + arg8, var11.field6459 + arg9, var11.field6483, var11.field6443);
                    var12 = class141.field1556++;
                } else {
                    var12 = arg5;
                }
                var11.field6317 = var12;
                var11.field6436 = class678.field9539;
                if (!client.method3749(var11)) {
                    if (var11.field6335 != 0) {
                        class194.method1177(var11, -105);
                    }
                    int var13 = var11.field6357 + arg8;
                    int var14 = var11.field6459 + arg9;
                    int var15 = var11.field6400;
                    if (class590.field8339 && (client.method3750(var11).field3898 != 0 || var11.field6471 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class497.field7199 == var11) {
                        if (arg7 != -1412584499 && (class314.field3908 == var11.field6370 || class556.field7939 == var11.field6370)) {
                            class122.field1367 = arg8;
                            class674.field9377 = arg9;
                            class142.field1572 = arg4;
                            continue;
                        }
                        if (class323.field3980 && class473.field6815) {
                            int var16 = class108.field1166.method253(true);
                            int var17 = class108.field1166.method252(7);
                            int var18 = var17 - class102.field1109;
                            int var19 = var16 - class471.field6758;
                            if (class697.field9781 > var19) {
                                var19 = class697.field9781;
                            }
                            if (class697.field9781 + class480.field6918.field6483 < var11.field6483 + var19) {
                                var19 = class697.field9781 - (var11.field6483 - class480.field6918.field6483);
                            }
                            if (class546.field7802 > var18) {
                                var18 = class546.field7802;
                            }
                            if (var11.field6443 + var18 > class546.field7802 - -class480.field6918.field6443) {
                                var18 = class546.field7802 + class480.field6918.field6443 - var11.field6443;
                            }
                            var13 = var19;
                            var14 = var18;
                        }
                        if (class556.field7939 == var11.field6370) {
                            var15 = 128;
                        }
                    }
                    int var22;
                    int var23;
                    int var24;
                    int var25;
                    if (var11.field6471 == 2) {
                        var25 = arg3;
                        var24 = arg1;
                        var23 = arg2;
                        var22 = arg6;
                    } else {
                        int var20 = var11.field6483 + var13;
                        int var21 = var14 + var11.field6443;
                        var22 = arg6 >= var13 ? arg6 : var13;
                        var23 = arg2 < var14 ? var14 : arg2;
                        if (var11.field6471 == 9) {
                            var21++;
                            var20++;
                        }
                        var24 = var21 >= arg1 ? arg1 : var21;
                        var25 = arg3 <= var20 ? arg3 : var20;
                    }
                    if (var22 < var25 && var24 > var23) {
                        if (var11.field6335 != 0) {
                            if (class191.field2196 == var11.field6335 || class674.field9383 == var11.field6335) {
                                class277.method1619((byte) 105, var11.field6483, var14, var13, var11.field6443, class674.field9383 == var11.field6335);
                                class313.field3894[var12] = true;
                                class701.field9813.method982(arg6, arg2, arg3, arg1);
                                continue;
                            }
                            if (class59.field609 == var11.field6335) {
                                if (var11.method2607(-46, class701.field9813) != null) {
                                    class530.method2975((byte) 101);
                                    class397.method2244(-16777216, var14, var11, var13, class701.field9813);
                                    class444.field6263[var12] = true;
                                    class701.field9813.method982(arg6, arg2, arg3, arg1);
                                }
                                continue;
                            }
                            if (class16.field129 == var11.field6335) {
                                if (var11.method2607(-101, class701.field9813) != null) {
                                    class71.method372(var14, (byte) -21, var11, var13);
                                    class444.field6263[var12] = true;
                                    class701.field9813.method982(arg6, arg2, arg3, arg1);
                                }
                                continue;
                            }
                            if (class278.field3453 == var11.field6335) {
                                class63.method341(arg0 + 128, class701.field9813, var11.field6443, var11.field6483, var13, class79.field801, var14);
                                class313.field3894[var12] = true;
                                class701.field9813.method982(arg6, arg2, arg3, arg1);
                                continue;
                            }
                            if (class522.field7400 == var11.field6335) {
                                class140.method778(class701.field9813, var11.field6483, (byte) -103, var11.field6443, var14, var13);
                                class313.field3894[var12] = true;
                                class701.field9813.method982(arg6, arg2, arg3, arg1);
                                continue;
                            }
                            if (class237.field2946 == var11.field6335) {
                                if (!class585.field8296 && !class257.field3232) {
                                    continue;
                                }
                                int var26 = var11.field6483 + var13;
                                int var27 = var14 + 15;
                                if (class585.field8296) {
                                    int var28 = -256;
                                    if (class359.field4816 < 20) {
                                        var28 = -65536;
                                    }
                                    class698.field9799.method2312(var28, var26, "Fps:" + class359.field4816, -1, var27, (byte) 113);
                                    var27 += 15;
                                    Runtime var29 = Runtime.getRuntime();
                                    int var30 = (int) ((var29.totalMemory() - var29.freeMemory()) / 1024L);
                                    int var31 = -256;
                                    if (var30 > 98304) {
                                        if (class518.field7376) {
                                            class24.method123((byte) 126);
                                            for (int var32 = 0; var32 < 10; var32++) {
                                                System.gc();
                                            }
                                            var30 = (int) ((var29.totalMemory() - var29.freeMemory()) / 1024L);
                                            if (var30 > 65536) {
                                                class340.method1964(4, "WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.", arg0 + 240);
                                            }
                                        }
                                        var31 = -65536;
                                    }
                                    class698.field9799.method2312(var31, var26, "Mem:" + var30 + "k", -1, var27, (byte) 90);
                                    var27 += 15;
                                    class698.field9799.method2312(-256, var26, "In:" + class329.field4029 + "B/s Out:" + class670.field9343 + "B/s", -1, var27, (byte) 13);
                                    var27 += 15;
                                    int var33 = class701.field9813.method981() / 1024;
                                    class698.field9799.method2312(var33 <= 65536 ? -256 : -65536, var26, "Offheap:" + var33 + "k", -1, var27, (byte) 77);
                                    var27 += 15;
                                    int var34 = 0;
                                    int var35 = 0;
                                    int var36 = 0;
                                    for (int var37 = 0; var37 < 35; var37++) {
                                        if (class578.field8187[var37] != null) {
                                            var34 += class578.field8187[var37].method1155(-115);
                                            var35 += class578.field8187[var37].method1163((byte) 118);
                                            var36 += class578.field8187[var37].method1160((byte) 122);
                                        }
                                    }
                                    int var38 = var36 * 100 / var34;
                                    int var39 = var35 * 10000 / var34;
                                    String var40 = "Cache:" + class71.method373(0, 2, arg0 - 28735, (long) var39, true) + "% (" + var38 + "%)";
                                    class198.field2349.method2312(-256, var26, var40, -1, var27, (byte) 107);
                                    var27 += 12;
                                }
                                if (class638.field8989 > 0) {
                                    class198.field2349.method2312(-256, var26, "Particles: " + class397.field5367 + " / " + class638.field8989, -1, var27, (byte) 53);
                                }
                                var27 += 12;
                                if (class257.field3232) {
                                    class198.field2349.method2312(-256, var26, "Polys: " + class701.field9813.method1021() + " Models: " + class701.field9813.method952(), -1, var27, (byte) 81);
                                    var27 += 12;
                                    class198.field2349.method2312(-256, var26, "Ls: " + class333.field4178 + " La: " + class291.field3638 + " NPC: " + class458.field6509 + " Pl: " + class36.field365, -1, var27, (byte) 65);
                                    class104.method566((byte) 110);
                                    var27 += 12;
                                }
                                class313.field3894[var12] = true;
                                continue;
                            }
                        }
                        if (var11.field6471 == 0) {
                            if (class89.field892 == var11.field6335 && class701.field9813.method1044()) {
                                class701.field9813.method976(var13, var14, var11.field6483, var11.field6443);
                            }
                            method2588(-128, var24, var23, var25, arg4, var12, var22, var11.field6339, var13 - var11.field6414, -var11.field6451 + var14);
                            if (var11.field6399 != null) {
                                method2588(-128, var24, var23, var25, var11.field6399, var12, var22, var11.field6339, var13 - var11.field6414, var14 - var11.field6451);
                            }
                            class633 var41 = (class633) class14.field117.method3669((long) var11.field6339, arg0 ^ 0x7F);
                            if (var41 != null) {
                                class453.method2614(var25, var24, var41.field8920, arg0 ^ 0xFFFFFFE7, var13, var23, var14, var12, var22);
                            }
                            if (class89.field892 == var11.field6335 && class701.field9813.method1044()) {
                                class701.field9813.method1049();
                            }
                            class701.field9813.method982(arg6, arg2, arg3, arg1);
                        }
                        if (class73.field768[var12] || class593.field8373 > 1) {
                            if (var11.field6471 == 3) {
                                if (var15 == 0) {
                                    if (var11.field6424) {
                                        class701.field9813.method1022(var13, var14, var11.field6483, var11.field6443, var11.field6338, 0);
                                    } else {
                                        class701.field9813.method999(var13, var14, var11.field6483, var11.field6443, var11.field6338, 0);
                                    }
                                } else if (var11.field6424) {
                                    class701.field9813.method1022(var13, var14, var11.field6483, var11.field6443, var11.field6338 & 0xFFFFFF | 255 - (var15 & 0xFF) << 24, 1);
                                } else {
                                    class701.field9813.method999(var13, var14, var11.field6483, var11.field6443, 255 - (var15 & 0xFF) << 24 | var11.field6338 & 0xFFFFFF, 1);
                                }
                            } else if (var11.field6471 == 4) {
                                class413 var42 = var11.method2612(class701.field9813, (byte) -102);
                                if (var42 != null) {
                                    int var43 = var11.field6338;
                                    String var44 = var11.field6438;
                                    if (var11.field6434 != -1) {
                                        class487 var45 = class19.field153.method272(var11.field6434, -11824);
                                        var44 = var45.field7027;
                                        if (var44 == null) {
                                            var44 = "null";
                                        }
                                        if ((var45.field7064 == 1 || var11.field6358 != 1) && var11.field6358 != -1) {
                                            var44 = "<col=ff9040>" + var44 + "</col> x" + class63.method343(var11.field6358, true);
                                        }
                                    }
                                    if (class250.field3132 == var11) {
                                        var44 = class198.field2316.method1195((byte) 62, class504.field7267);
                                        var43 = var11.field6338;
                                    }
                                    if (class683.field9625) {
                                        class701.field9813.method941(var13, var14, var11.field6483 + var13, var14 - -var11.field6443);
                                    }
                                    var42.method2319(var11.field6483, 0, null, var11.field6336, var11.field6430 ? 255 - (var15 & 0xFF) << 24 : -1, class485.field6988, var14, var11.field6443, var44, var11.field6407, var13, 255 - (var15 & 0xFF) << 24 | var43, var11.field6346, 0, 17443, null, var11.field6352);
                                    if (class683.field9625) {
                                        class701.field9813.method982(arg6, arg2, arg3, arg1);
                                    }
                                } else if (class552.field7890) {
                                    class130.method741(var11, 26034);
                                }
                            } else if (var11.field6471 == 5) {
                                if (var11.field6381 < 0) {
                                    class534 var46;
                                    if (var11.field6434 == -1) {
                                        var46 = var11.method2604((byte) 103, class701.field9813);
                                    } else {
                                        class158 var47 = var11.field6382 ? class362.field4859.field2897 : null;
                                        var46 = class19.field153.method271(var11.field6449 | 0xFF000000, class701.field9813, var11.field6394, var11.field6358, var11.field6434, false, var47, var11.field6401);
                                    }
                                    if (var46 != null) {
                                        int var48 = var46.method312();
                                        int var49 = var46.method304();
                                        int var50 = 255 - (var15 & 0xFF) << 24 | (var11.field6338 == 0 ? 16777215 : var11.field6338 & 0xFFFFFF);
                                        if (var11.field6408) {
                                            class701.field9813.method941(var13, var14, var11.field6483 + var13, var11.field6443 + var14);
                                            if (var11.field6344 != 0) {
                                                int var51 = (var48 - (1 - var11.field6483)) / var48;
                                                int var52 = (var49 + var11.field6443 - 1) / var49;
                                                for (int var53 = 0; var53 < var51; var53++) {
                                                    for (int var54 = 0; var54 < var52; var54++) {
                                                        if (var11.field6338 == 0) {
                                                            var46.method2999((float) var48 / 2.0F + (float) (var48 * var53 + var13), (float) var49 / 2.0F + (float) (var49 * var54 + var14), 4096, var11.field6344);
                                                        } else {
                                                            var46.method2998((float) var48 / 2.0F + (float) (var48 * var53 + var13), (float) var49 / 2.0F + (float) (var14 - -(var49 * var54)), 4096, var11.field6344, 0, var50, 1);
                                                        }
                                                    }
                                                }
                                            } else if (var11.field6338 == 0 && var15 == 0) {
                                                var46.method3003(var13, var14, var11.field6483, var11.field6443);
                                            } else {
                                                var46.method307(var13, var14, var11.field6483, var11.field6443, 0, var50, 1);
                                            }
                                            class701.field9813.method982(arg6, arg2, arg3, arg1);
                                        } else if (var11.field6338 == 0 && var15 == 0) {
                                            if (var11.field6344 != 0) {
                                                var46.method2999((float) var11.field6483 / 2.0F + (float) var13, (float) var11.field6443 / 2.0F + (float) var14, var11.field6483 * 4096 / var48, var11.field6344);
                                            } else if (var11.field6483 == var48 && var11.field6443 == var49) {
                                                var46.method3001(var13, var14);
                                            } else {
                                                var46.method3002(var13, var14, var11.field6483, var11.field6443);
                                            }
                                        } else if (var11.field6344 != 0) {
                                            var46.method2998((float) var11.field6483 / 2.0F + (float) var13, (float) var11.field6443 / 2.0F + (float) var14, var11.field6483 * 4096 / var48, var11.field6344, 0, var50, 1);
                                        } else if (var11.field6483 == var48 && var11.field6443 == var49) {
                                            var46.method314(var13, var14, 0, var50, 1);
                                        } else {
                                            var46.method2997(var13, var14, var11.field6483, var11.field6443, 0, var50, 1);
                                        }
                                    } else if (class552.field7890) {
                                        class130.method741(var11, 26034);
                                    }
                                } else {
                                    var11.method2595(class66.field669, class328.field4021, arg0 + 128).method1571(var11.field6417 << 3, var11.field6483, var11.field6443, var14, arg0 + 128, class701.field9813, 0, var11.field6427 << 3, 0, var13);
                                }
                            } else if (var11.field6471 == 6) {
                                class252.method1478(arg0 ^ 0xC564306C);
                                class473 var55 = null;
                                int var56 = 0;
                                if (var11.field6434 != -1) {
                                    class487 var64 = class19.field153.method272(var11.field6434, -11824);
                                    if (var64 != null) {
                                        class487 var65 = var64.method2817(var11.field6358, arg0 ^ 0x4);
                                        class257 var66 = var11.field6378 == -1 ? null : class265.field3301.method3043(var11.field6378, -8191);
                                        class158 var67 = var11.field6382 ? class362.field4859.field2897 : null;
                                        var55 = var65.method2830(2048, var11.field6341, var66, var67, var11.field6433, var11.field6470, 1, -124, class701.field9813);
                                        if (var55 == null) {
                                            class130.method741(var11, 26034);
                                        } else {
                                            var56 = -var55.method1869() >> 1;
                                        }
                                    }
                                } else if (var11.field6322 == 5) {
                                    int var57 = var11.field6402;
                                    if (var57 >= 0 && var57 < 2048) {
                                        class236 var58 = class139.field1540[var57];
                                        class257 var59 = var11.field6378 == -1 ? null : class265.field3301.method3043(var11.field6378, -8191);
                                        if (var58 != null && (class392.field5314 == var57 || class183.method1112(var58.field2893, false) == var11.field6406)) {
                                            var55 = var58.field2897.method851(null, class19.field153, class508.field7303, null, class628.field8859, var11.field6470, 0, class701.field9813, class265.field3301, 2048, class400.field5381, var11.field6341, class369.field5055, var59, (byte) 95, var11.field6433, true, 0, -1);
                                        }
                                    }
                                } else if (var11.field6322 == 8 || var11.field6322 == 9) {
                                    class628 var61 = class555.method3150(var11.field6402, 0, false);
                                    class257 var62 = var11.field6378 == -1 ? null : class265.field3301.method3043(var11.field6378, -8191);
                                    if (var61 != null) {
                                        class158 var63 = var11.field6382 ? class362.field4859.field2897 : null;
                                        var55 = var61.method3526(var62, 2048, var11.field6470, var11.field6433, var11.field6406, var11.field6322 == 9, var63, var11.field6341, -117, class701.field9813);
                                    }
                                } else if (var11.field6378 == -1) {
                                    var55 = var11.method2605(class701.field9813, class19.field153, class265.field3301, 2048, class369.field5055, 0, class400.field5381, class628.field8859, true, null, class362.field4859.field2897, -1, class508.field7303, -1);
                                    if (var55 == null && class552.field7890) {
                                        class130.method741(var11, 26034);
                                    }
                                } else {
                                    class257 var60 = class265.field3301.method3043(var11.field6378, -8191);
                                    var55 = var11.method2605(class701.field9813, class19.field153, class265.field3301, 2048, class369.field5055, var11.field6341, class400.field5381, class628.field8859, true, var60, class362.field4859.field2897, var11.field6470, class508.field7303, var11.field6433);
                                    if (var55 == null && class552.field7890) {
                                        class130.method741(var11, 26034);
                                    }
                                }
                                if (var55 != null) {
                                    int var68;
                                    if (var11.field6355 <= 0) {
                                        var68 = 512;
                                    } else {
                                        var68 = (var11.field6483 << 9) / var11.field6355;
                                    }
                                    int var69;
                                    if (var11.field6457 > 0) {
                                        var69 = (var11.field6443 << 9) / var11.field6457;
                                    } else {
                                        var69 = 512;
                                    }
                                    int var70 = var11.field6483 / 2 + var13;
                                    int var71 = var11.field6443 / 2 + var14;
                                    if (!var11.field6415) {
                                        var71 += var11.field6397 * var69 >> 9;
                                        var70 += var11.field6321 * var68 >> 9;
                                    }
                                    class499.field7213.method22();
                                    class701.field9813.method992(class499.field7213);
                                    class701.field9813.method997(var70, var71, var68, var69);
                                    class701.field9813.method969();
                                    if (var11.field6403) {
                                        class701.field9813.method955(false);
                                    }
                                    if (var11.field6415) {
                                        class143.field1593.method20(var11.field6473);
                                        class143.field1593.method24(var11.field6422);
                                        class143.field1593.method26(var11.field6331);
                                        class143.field1593.method30(var11.field6321, var11.field6397, var11.field6319);
                                    } else {
                                        int var72 = (var11.field6374 << 2) * class435.field6134[var11.field6473 << 3] >> 14;
                                        int var73 = (var11.field6374 << 2) * class435.field6135[var11.field6473 << 3] >> 14;
                                        class143.field1593.method17(-var11.field6331 << 3);
                                        class143.field1593.method24(var11.field6422 << 3);
                                        class143.field1593.method30(var11.field6419 << 2, (var11.field6393 << 2) + var56 + var72, (var11.field6393 << 2) + var73);
                                        class143.field1593.method18(var11.field6473 << 3);
                                    }
                                    var11.method2609(class143.field1593, class701.field9813, class678.field9539, arg0 + 128, var55);
                                    if (class683.field9625) {
                                        class701.field9813.method941(var13, var14, var11.field6483 + var13, var14 - -var11.field6443);
                                    }
                                    if (var11.field6415) {
                                        if (var11.field6404) {
                                            var55.method1875(class143.field1593, null, var11.field6374, 1);
                                        } else {
                                            var55.method1914(class143.field1593, null, 1);
                                            if (var11.field6482 != null) {
                                                class701.field9813.method1033(var11.field6482.method1963());
                                            }
                                        }
                                    } else if (var11.field6404) {
                                        var55.method1875(class143.field1593, null, var11.field6374 << 2, 1);
                                    } else {
                                        var55.method1914(class143.field1593, null, 1);
                                        if (var11.field6482 != null) {
                                            class701.field9813.method1033(var11.field6482.method1963());
                                        }
                                    }
                                    if (class683.field9625) {
                                        class701.field9813.method982(arg6, arg2, arg3, arg1);
                                    }
                                    if (var11.field6403) {
                                        class701.field9813.method955(true);
                                    }
                                }
                            } else if (var11.field6471 == 9) {
                                int var74;
                                int var75;
                                int var76;
                                int var77;
                                if (var11.field6464) {
                                    var76 = var11.field6483 + var13;
                                    var77 = var14;
                                    var75 = var14 + var11.field6443;
                                    var74 = var13;
                                } else {
                                    var74 = var13;
                                    var75 = var14;
                                    var76 = var11.field6483 + var13;
                                    var77 = var11.field6443 + var14;
                                }
                                if (var11.field6423 == 1) {
                                    class701.field9813.method957(var74, var75, var76, var77, var11.field6338, 0);
                                } else {
                                    class701.field9813.method1046(var74, var75, var76, var77, var11.field6338, var11.field6423, 0);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dea", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6284++;
        throw new IllegalStateException();
    }
}
