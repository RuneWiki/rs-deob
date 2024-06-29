import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tga")
public class class54 {

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "I")
    public int field738;

    @OriginalMember(owner = "client!tga", name = "b", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "client!tga", name = "c", descriptor = "I")
    public static int field740;

    @OriginalMember(owner = "client!tga", name = "d", descriptor = "I")
    public static int field741;

    @OriginalMember(owner = "client!tga", name = "e", descriptor = "I")
    public static int field742;

    @OriginalMember(owner = "client!tga", name = "toString", descriptor = "()Ljava/lang/String;", line = 5)
    public final String toString() {
        field742++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(IIIIIII[Lgba;II)V", line = 17)
    public static final void method362(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class625[] arg7, int arg8, int arg9) {
        field741++;
        class10.field197.method421(arg3, arg8, arg6, arg4);
        if (arg2 != 1024) {
            return;
        }
        for (int var10 = 0; var10 < arg7.length; var10++) {
            class625 var11 = arg7[var10];
            if (var11 != null && (var11.field8288 == arg0 || arg0 == -1412584499 && class109.field1591 == var11)) {
                int var12;
                if (arg5 == -1) {
                    class443.field6070[class172.field2661].setBounds(var11.field8312 + arg1, var11.field8317 + arg9, var11.field8350, var11.field8361);
                    var12 = class172.field2661++;
                } else {
                    var12 = arg5;
                }
                var11.field8283 = class642.field8626;
                var11.field8280 = var12;
                if (!client.method1697(var11)) {
                    if (var11.field8402 != 0) {
                        class104.method795((byte) -91, var11);
                    }
                    int var13 = var11.field8312 + arg1;
                    int var14 = var11.field8317 + arg9;
                    int var15 = var11.field8406;
                    if (class295.field4171 && (client.method1701(var11).field725 != 0 || var11.field8421 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class109.field1591 == var11) {
                        if (arg0 != -1412584499 && (class187.field2781 == var11.field8281 || class315.field4332 == var11.field8281)) {
                            class710.field9935 = arg7;
                            class325.field4502 = arg1;
                            class308.field4258 = arg9;
                            continue;
                        }
                        if (class29.field477 && class704.field9907) {
                            int var16 = class164.field2564.method1110((byte) 91);
                            int var17 = class164.field2564.method1113(-6387);
                            int var18 = var17 - class643.field8627;
                            int var19 = var16 - class628.field8468;
                            if (class199.field2886 > var19) {
                                var19 = class199.field2886;
                            }
                            if ((var11.field8350 + var19) > (class199.field2886 + class673.field9525.field8350)) {
                                var19 = class199.field2886 + class673.field9525.field8350 - var11.field8350;
                            }
                            if (var18 < class138.field2231) {
                                var18 = class138.field2231;
                            }
                            if ((class138.field2231 + class673.field9525.field8361) < (var11.field8361 + var18)) {
                                var18 = class138.field2231 + class673.field9525.field8361 - var11.field8361;
                            }
                            var13 = var19;
                            var14 = var18;
                        }
                        if (class315.field4332 == var11.field8281) {
                            var15 = 128;
                        }
                    }
                    int var22;
                    int var23;
                    int var24;
                    int var25;
                    if (var11.field8421 == 2) {
                        var22 = arg3;
                        var23 = arg8;
                        var25 = arg6;
                        var24 = arg4;
                    } else {
                        int var20 = var11.field8350 + var13;
                        int var21 = var14 + var11.field8361;
                        var22 = arg3 >= var13 ? arg3 : var13;
                        var23 = var14 <= arg8 ? arg8 : var14;
                        if (var11.field8421 == 9) {
                            var21++;
                            var20++;
                        }
                        var24 = var21 >= arg4 ? arg4 : var21;
                        var25 = var20 >= arg6 ? arg6 : var20;
                    }
                    if (var25 > var22 && var24 > var23) {
                        if (var11.field8402 != 0) {
                            if (class697.field9792 == var11.field8402 || class618.field8206 == var11.field8402) {
                                class50.method345(var11.field8350, var13, (byte) -64, class618.field8206 == var11.field8402, var14, var11.field8361);
                                class511.field6834[var12] = true;
                                class10.field197.method421(arg3, arg8, arg6, arg4);
                                continue;
                            }
                            if (class61.field918 == var11.field8402) {
                                if (var11.method3431(0, class10.field197) != null) {
                                    class381.method2226((byte) 124);
                                    class647.method3545(class10.field197, var11, var13, -939090648, var14);
                                    class209.field2994[var12] = true;
                                    class10.field197.method421(arg3, arg8, arg6, arg4);
                                }
                                continue;
                            }
                            if (class418.field5715 == var11.field8402) {
                                if (var11.method3431(0, class10.field197) != null) {
                                    class305.method1846(-57, var14, var13, var11);
                                    class209.field2994[var12] = true;
                                    class10.field197.method421(arg3, arg8, arg6, arg4);
                                }
                                continue;
                            }
                            if (class368.field4977 == var11.field8402) {
                                class491.method2740(var11.field8350, (byte) -128, class10.field197, var13, var14, class94.field1447, var11.field8361);
                                class511.field6834[var12] = true;
                                class10.field197.method421(arg3, arg8, arg6, arg4);
                                continue;
                            }
                            if (class599.field7949 == var11.field8402) {
                                class276.method1676(var11.field8361, class10.field197, arg2 ^ 0xFFFF8A84, var11.field8350, var14, var13);
                                class511.field6834[var12] = true;
                                class10.field197.method421(arg3, arg8, arg6, arg4);
                                continue;
                            }
                            if (class244.field3416 == var11.field8402) {
                                if (!class286.field4034 && !class5.field121) {
                                    continue;
                                }
                                int var26 = var11.field8350 + var13;
                                int var27 = var14 + 15;
                                if (class286.field4034) {
                                    int var28 = -256;
                                    if (class244.field3415 < 20) {
                                        var28 = -65536;
                                    }
                                    class188.field2788.method1293(var26, -1, "Fps:" + class244.field3415, 24386, var27, var28);
                                    var27 += 15;
                                    Runtime var29 = Runtime.getRuntime();
                                    int var30 = (int) ((var29.totalMemory() - var29.freeMemory()) / 1024L);
                                    int var31 = -256;
                                    if (var30 > 65536) {
                                        if (class229.field3211) {
                                            class463.method2623(true);
                                            for (int var32 = 0; var32 < 10; var32++) {
                                                System.gc();
                                            }
                                            var30 = (int) ((var29.totalMemory() - var29.freeMemory()) / 1024L);
                                            if (var30 > 65536) {
                                                class315.method1881("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.", 0, 4);
                                            }
                                        }
                                        var31 = -65536;
                                    }
                                    class188.field2788.method1293(var26, -1, "Mem:" + var30 + "k", arg2 ^ 0x5B42, var27, var31);
                                    var27 += 15;
                                    class188.field2788.method1293(var26, -1, "In:" + class295.field4166 + "B/s Out:" + class345.field4752 + "B/s", 24386, var27, -256);
                                    var27 += 15;
                                    int var33 = class10.field197.method403() / 1024;
                                    class188.field2788.method1293(var26, -1, "Offheap:" + var33 + "k", arg2 + 23362, var27, var33 > 65536 ? -65536 : -256);
                                    var27 += 15;
                                    int var34 = 0;
                                    int var35 = 0;
                                    int var36 = 0;
                                    for (int var37 = 0; var37 < 35; var37++) {
                                        if (class47.field677[var37] != null) {
                                            var34 += class47.field677[var37].method183((byte) 43);
                                            var35 += class47.field677[var37].method179(false);
                                            var36 += class47.field677[var37].method173(-23098);
                                        }
                                    }
                                    int var38 = var36 * 100 / var34;
                                    int var39 = var35 * 10000 / var34;
                                    String var40 = "Cache:" + class411.method2349(2, 0, (long) var39, 0, true) + "% (" + var38 + "%)";
                                    class700.field9851.method1293(var26, -1, var40, 24386, var27, -256);
                                    var27 += 12;
                                }
                                if (class530.field7064 > 0) {
                                    class700.field9851.method1293(var26, -1, "Particles: " + class102.field1526 + " / " + class530.field7064, 24386, var27, -256);
                                }
                                var27 += 12;
                                if (class5.field121) {
                                    class700.field9851.method1293(var26, -1, "Polys: " + class10.field197.method104() + " Models: " + class10.field197.method412(), 24386, var27, -256);
                                    var27 += 12;
                                    class700.field9851.method1293(var26, -1, "Ls: " + class692.field9745 + " La: " + class124.field2085 + " NPC: " + class344.field4713 + " Pl: " + class391.field5161, 24386, var27, -256);
                                    var27 += 12;
                                    class333.method1977((byte) -54);
                                }
                                class511.field6834[var12] = true;
                                continue;
                            }
                        }
                        if (var11.field8421 == 0) {
                            if (class98.field1489 == var11.field8402 && class10.field197.method96()) {
                                class10.field197.method51(var13, var14, var11.field8350, var11.field8361);
                            }
                            method362(var11.field8327, var13 - var11.field8365, arg2, var22, var24, var12, var25, arg7, var23, var14 - var11.field8441);
                            if (var11.field8420 != null) {
                                method362(var11.field8327, var13 - var11.field8365, 1024, var22, var24, var12, var25, var11.field8420, var23, var14 - var11.field8441);
                            }
                            class140 var41 = (class140) class264.field3667.method2918((long) var11.field8327, (byte) 109);
                            if (var41 != null) {
                                class588.method3236(var12, var41.field2256, var14, var25, 3, var13, var22, var23, var24);
                            }
                            if (class98.field1489 == var11.field8402 && class10.field197.method96()) {
                                class10.field197.method29();
                                class703.field9904 = true;
                            }
                            class10.field197.method421(arg3, arg8, arg6, arg4);
                        }
                        if (class87.field1313[var12] || class476.field6354 > 1) {
                            if (var11.field8421 == 3) {
                                if (var15 == 0) {
                                    if (var11.field8340) {
                                        class10.field197.method415(var13, var14, var11.field8350, var11.field8361, var11.field8392, 0);
                                    } else {
                                        class10.field197.method423(var13, var14, var11.field8350, var11.field8361, var11.field8392, 0);
                                    }
                                } else if (var11.field8340) {
                                    class10.field197.method415(var13, var14, var11.field8350, var11.field8361, 255 - (var15 & 0xFF) << 24 | var11.field8392 & 0xFFFFFF, 1);
                                } else {
                                    class10.field197.method423(var13, var14, var11.field8350, var11.field8361, var11.field8392 & 0xFFFFFF | 255 - (var15 & 0xFF) << 24, 1);
                                }
                            } else if (var11.field8421 == 4) {
                                class200 var42 = var11.method3415(class10.field197, false);
                                if (var42 != null) {
                                    int var43 = var11.field8392;
                                    String var44 = var11.field8343;
                                    if (var11.field8403 != -1) {
                                        class577 var45 = class193.field2826.method1047(var11.field8403, -1);
                                        var44 = var45.field7679;
                                        if (var44 == null) {
                                            var44 = "null";
                                        }
                                        if ((var45.field7635 == 1 || var11.field8367 != 1) && var11.field8367 != -1) {
                                            var44 = "<col=ff9040>" + var44 + "</col> x" + class502.method2789(var11.field8367, arg2 - 1016);
                                        }
                                    }
                                    if (class436.field5966 == var11) {
                                        var44 = class72.field1095.method546(class516.field6892, (byte) -35);
                                        var43 = var11.field8392;
                                    }
                                    if (class17.field262) {
                                        class10.field197.method459(var13, var14, var11.field8350 + var13, var11.field8361 + var14);
                                    }
                                    var42.method1298(var11.field8438, var11.field8350, 255 - (var15 & 0xFF) << 24 | var43, var44, var11.field8395, 0, null, var11.field8335 ? 255 - (var15 & 0xFF) << 24 : -1, var11.field8444, class391.field5159, var14, (byte) 72, var11.field8361, 0, null, var13, var11.field8381);
                                    if (class17.field262) {
                                        class10.field197.method421(arg3, arg8, arg6, arg4);
                                    }
                                } else if (class392.field5168) {
                                    class463.method2624(false, var11);
                                }
                            } else if (var11.field8421 == 5) {
                                if (var11.field8306 < 0) {
                                    class468 var46;
                                    if (var11.field8403 == -1) {
                                        var46 = var11.method3422(class10.field197, (byte) -115);
                                    } else {
                                        class435 var47 = var11.field8380 ? class199.field2897.field5362 : null;
                                        var46 = class193.field2826.method1043(var11.field8362, var47, var11.field8440 | 0xFF000000, class10.field197, var11.field8367, var11.field8409, var11.field8403, (byte) 108);
                                    }
                                    if (var46 != null) {
                                        int var48 = var46.method1025();
                                        int var49 = var46.method1030();
                                        int var50 = (var11.field8392 == 0 ? 16777215 : var11.field8392 & 0xFFFFFF) | 255 - (var15 & 0xFF) << 24;
                                        if (var11.field8400) {
                                            class10.field197.method459(var13, var14, var11.field8350 + var13, var11.field8361 + var14);
                                            if (var11.field8302 != 0) {
                                                int var51 = (var11.field8350 + var48 - 1) / var48;
                                                int var52 = (var11.field8361 - (1 - var49)) / var49;
                                                for (int var53 = 0; var53 < var51; var53++) {
                                                    for (int var54 = 0; var54 < var52; var54++) {
                                                        if (var11.field8392 == 0) {
                                                            var46.method2636((float) var48 / 2.0F + (float) (var48 * var53 + var13), (float) var49 / 2.0F + (float) (var49 * var54 + var14), 4096, var11.field8302);
                                                        } else {
                                                            var46.method2638((float) var48 / 2.0F + (float) (var48 * var53 + var13), (float) var49 / 2.0F + (float) (var49 * var54 + var14), 4096, var11.field8302, 0, var50, 1);
                                                        }
                                                    }
                                                }
                                            } else if (var11.field8392 == 0 && var15 == 0) {
                                                var46.method2643(var13, var14, var11.field8350, var11.field8361);
                                            } else {
                                                var46.method1027(var13, var14, var11.field8350, var11.field8361, 0, var50, 1);
                                            }
                                            class10.field197.method421(arg3, arg8, arg6, arg4);
                                        } else if (var11.field8392 == 0 && var15 == 0) {
                                            if (var11.field8302 != 0) {
                                                var46.method2636((float) var11.field8350 / 2.0F + (float) var13, (float) var11.field8361 / 2.0F + (float) var14, var11.field8350 * 4096 / var48, var11.field8302);
                                            } else if (var11.field8350 == var48 && var11.field8361 == var49) {
                                                var46.method2637(var13, var14);
                                            } else {
                                                var46.method2641(var13, var14, var11.field8350, var11.field8361);
                                            }
                                        } else if (var11.field8302 != 0) {
                                            var46.method2638((float) var11.field8350 / 2.0F + (float) var13, (float) var11.field8361 / 2.0F + (float) var14, var11.field8350 * 4096 / var48, var11.field8302, 0, var50, 1);
                                        } else if (var11.field8350 == var48 && var11.field8361 == var49) {
                                            var46.method271(var13, var14, 0, var50, 1);
                                        } else {
                                            var46.method274(var13, var14, var11.field8350, var11.field8361, 0, var50, 1);
                                        }
                                    } else if (class392.field5168) {
                                        class463.method2624(false, var11);
                                    }
                                } else {
                                    var11.method3424(class152.field2405, class328.field4518, arg2 + 64511).method1191(var13, class10.field197, -1, 0, var11.field8361, var14, var11.field8383 << 3, 0, var11.field8311 << 3, var11.field8350);
                                }
                            } else if (var11.field8421 == 6) {
                                class634.method3499(false);
                                class358 var55 = null;
                                int var56 = 0;
                                if (var11.field8403 != -1) {
                                    class577 var57 = class193.field2826.method1047(var11.field8403, -1);
                                    if (var57 != null) {
                                        class577 var58 = var57.method3154(var11.field8367, (byte) 111);
                                        class616 var59 = var11.field8377 == -1 ? null : class636.field8570.method231(var11.field8377, arg2 ^ 0xFFFFD60C);
                                        class435 var60 = var11.field8380 ? class199.field2897.field5362 : null;
                                        var55 = var58.method3165(var60, class10.field197, var11.field8321, 2048, var59, 1, var11.field8372, (byte) -127, var11.field8439);
                                        if (var55 == null) {
                                            class463.method2624(false, var11);
                                        } else {
                                            var56 = -var55.method1939() >> 1;
                                        }
                                    }
                                } else if (var11.field8294 == 5) {
                                    int var61 = var11.field8401;
                                    if (var61 >= 0 && var61 < 2048) {
                                        class403 var62 = class572.field7601[var61];
                                        class616 var63 = var11.field8377 == -1 ? null : class636.field8570.method231(var11.field8377, -11764);
                                        if (var62 != null && (class416.field5693 == var61 || class155.method1089(var62.field5398, 0) == var11.field8309)) {
                                            var55 = var62.field5362.method2466(true, 0, class80.field1261, -1, 2048, null, class10.field197, class133.field2174, arg2 - 1134, var63, null, class636.field8570, class239.field3369, var11.field8439, 0, class193.field2826, var11.field8372, class674.field9537, var11.field8321);
                                        }
                                    }
                                } else if (var11.field8294 == 8 || var11.field8294 == 9) {
                                    class521 var65 = class265.method1620(var11.field8401, false, false);
                                    class616 var66 = var11.field8377 == -1 ? null : class636.field8570.method231(var11.field8377, -11764);
                                    if (var65 != null) {
                                        class435 var67 = var11.field8380 ? class199.field2897.field5362 : null;
                                        var55 = var65.method2922(class10.field197, var67, var11.field8309, 2048, var11.field8439, (byte) 109, var11.field8372, var11.field8294 == 9, var11.field8321, var66);
                                    }
                                } else if (var11.field8377 == -1) {
                                    var55 = var11.method3420(class239.field3369, null, class133.field2174, class636.field8570, 37, -1, 0, class674.field9537, 2048, -1, class80.field1261, class199.field2897.field5362, class10.field197, class193.field2826);
                                    if (var55 == null && class392.field5168) {
                                        class463.method2624(false, var11);
                                    }
                                } else {
                                    class616 var64 = class636.field8570.method231(var11.field8377, -11764);
                                    var55 = var11.method3420(class239.field3369, var64, class133.field2174, class636.field8570, -121, var11.field8321, var11.field8439, class674.field9537, 2048, var11.field8372, class80.field1261, class199.field2897.field5362, class10.field197, class193.field2826);
                                    if (var55 == null && class392.field5168) {
                                        class463.method2624(false, var11);
                                    }
                                }
                                if (var55 != null) {
                                    int var68;
                                    if (var11.field8411 <= 0) {
                                        var68 = 512;
                                    } else {
                                        var68 = (var11.field8350 << 9) / var11.field8411;
                                    }
                                    int var69;
                                    if (var11.field8412 > 0) {
                                        var69 = (var11.field8361 << 9) / var11.field8412;
                                    } else {
                                        var69 = 512;
                                    }
                                    int var70 = (var11.field8320 * var68 >> 9) + var11.field8350 / 2 + var13;
                                    int var71 = (var11.field8382 * var69 >> 9) + var11.field8361 / 2 + var14;
                                    class166.field2583.method580();
                                    class10.field197.method405(class166.field2583);
                                    class10.field197.method373(var70, var71, var68, var69);
                                    class10.field197.method385((float) (var11.field8363 << 2), var11.field8405 ? (float) (var11.field8426 << 2) : (float) (var11.field8426 << 2) * 1.5F);
                                    if (arg0 == -1412584499 || class703.field9904) {
                                        class10.field197.method435();
                                        class10.field197.method38();
                                        class10.field197.method421(arg3, arg8, arg6, arg4);
                                        class703.field9904 = false;
                                    }
                                    if (var11.field8299) {
                                        class10.field197.method407(false);
                                    }
                                    int var72 = (var11.field8332 << 2) * class126.field2116[var11.field8292 << 3] >> 14;
                                    int var73 = (var11.field8332 << 2) * class126.field2105[var11.field8292 << 3] >> 14;
                                    class129.field2152.method573(-var11.field8346 << 3);
                                    class129.field2152.method570(var11.field8373 << 3);
                                    class129.field2152.method571(var11.field8353 << 2, var72 + (var11.field8354 << 2) + var56, (var11.field8354 << 2) + var73);
                                    class129.field2152.method555(var11.field8292 << 3);
                                    var11.method3423(class642.field8626, class129.field2152, arg2 ^ 0x400, class10.field197, var55);
                                    if (class17.field262) {
                                        class10.field197.method459(var13, var14, var11.field8350 + var13, var11.field8361 + var14);
                                    }
                                    if (var11.field8405) {
                                        var55.method1906(class129.field2152, null, var11.field8332 << 2, 1);
                                    } else if (var11.field8430 == null) {
                                        var55.method1947(class129.field2152, null, 1);
                                    } else {
                                        class10.field197.method392(var55, var11.field8430.method2705(), class129.field2152, null, 1);
                                    }
                                    if (class17.field262) {
                                        class10.field197.method421(arg3, arg8, arg6, arg4);
                                    }
                                    if (var11.field8299) {
                                        class10.field197.method407(true);
                                    }
                                    class10.field197.method385(0.0F, 0.0F);
                                }
                            } else if (var11.field8421 == 9) {
                                int var74;
                                int var75;
                                int var76;
                                int var77;
                                if (var11.field8408) {
                                    var74 = var14;
                                    var75 = var11.field8361 + var14;
                                    var76 = var13;
                                    var77 = var11.field8350 + var13;
                                } else {
                                    var76 = var13;
                                    var77 = var11.field8350 + var13;
                                    var74 = var11.field8361 + var14;
                                    var75 = var14;
                                }
                                if (var11.field8286 == 1) {
                                    class10.field197.method384(var76, var75, var77, var74, var11.field8392, 0);
                                } else {
                                    class10.field197.method399(var76, var75, var77, var74, var11.field8392, var11.field8286, 0);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tga", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 711)
    public class54(String arg0, int arg1) {
        this.field738 = arg1;
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(IB)Lew;", line = 723)
    public static final class460 method363(int arg0, byte arg1) {
        field739++;
        class460 var2 = (class460) class473.field6331.method3750((long) arg0, false);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class362.field4881.method2537(false, 0, arg0);
        class460 var4 = new class460();
        if (arg1 != -126) {
            method362(58, -81, -53, -60, 25, -69, -122, null, 45, 11);
        }
        if (var3 != null) {
            var4.method2617(arg0, new class335(var3), -90);
        }
        class473.field6331.method3745(1, (long) arg0, var4);
        return var4;
    }
}
