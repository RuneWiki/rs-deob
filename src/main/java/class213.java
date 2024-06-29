import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class213 extends class303 {

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2844 = "purple:";

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "I")
    public static int field2843;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V", line = 7)
    public static void method1371(int arg0) {
        if (arg0 == -30600) {
            field2844 = null;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIIIIII[Lrg;I)V", line = 21)
    public static final void method1372(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class383[] arg8, int arg9) {
        class408.field5920.method1735(arg9, arg1, arg6, arg7);
        field2843++;
        if (arg3 > -86) {
            return;
        }
        for (int var10 = 0; var10 < arg8.length; var10++) {
            class383 var11 = arg8[var10];
            if (var11 != null && (var11.field5538 == arg5 || arg5 == -1412584499 && class142.field2046 == var11)) {
                int var12;
                if (arg0 == -1) {
                    class60.field840[class75.field1161].setBounds(var11.field5470 + arg4, var11.field5428 - -arg2, var11.field5431, var11.field5491);
                    var12 = class75.field1161++;
                } else {
                    var12 = arg0;
                }
                var11.field5549 = var12;
                var11.field5557 = class35.field541;
                if (!var11.field5589 || !client.method1113(var11)) {
                    if (var11.field5480 > 0) {
                        class2.method6(var11, (byte) 96);
                    }
                    int var13 = var11.field5470 + arg4;
                    int var14 = var11.field5428 + arg2;
                    int var15 = var11.field5594;
                    if (class280.field3829 && (client.method1119(var11).field3612 != 0 || var11.field5488 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class142.field2046 == var11) {
                        if (arg5 != -1412584499 && !var11.field5519) {
                            class9.field137 = arg2;
                            class115.field1675 = arg8;
                            class386.field5625 = arg4;
                            continue;
                        }
                        if (class441.field6397 && class259.field3551) {
                            int var16 = class349.field4883;
                            int var17 = class162.field2269;
                            int var18 = var16 - class341.field4765;
                            int var19 = var17 - class259.field3552;
                            if (class34.field535 > var18) {
                                var18 = class34.field535;
                            }
                            if (var19 < class31.field491) {
                                var19 = class31.field491;
                            }
                            if ((class34.field535 + class32.field497.field5431) < (var18 + var11.field5431)) {
                                var18 = class34.field535 + class32.field497.field5431 - var11.field5431;
                            }
                            var13 = var18;
                            if ((var11.field5491 + var19) > (class31.field491 + class32.field497.field5491)) {
                                var19 = class31.field491 + class32.field497.field5491 - var11.field5491;
                            }
                            var14 = var19;
                        }
                        if (!var11.field5519) {
                            var15 = 128;
                        }
                    }
                    int var22;
                    int var23;
                    int var24;
                    int var25;
                    if (var11.field5488 == 2) {
                        var25 = arg7;
                        var24 = arg6;
                        var23 = arg1;
                        var22 = arg9;
                    } else {
                        int var20 = var13 + var11.field5431;
                        int var21 = var11.field5491 + var14;
                        if (var11.field5488 == 9) {
                            var21++;
                            var20++;
                        }
                        var22 = arg9 < var13 ? var13 : arg9;
                        var23 = var14 > arg1 ? var14 : arg1;
                        var24 = var20 < arg6 ? var20 : arg6;
                        var25 = arg7 > var21 ? var21 : arg7;
                    }
                    if (!var11.field5589 || var22 < var24 && var25 > var23) {
                        if (var11.field5480 != 0) {
                            if (var11.field5480 == 1337 || var11.field5480 == 1403) {
                                class80.method573(var11.field5431, var14, var11.field5480 == 1403, var13, var11.field5491, (byte) 102);
                                class259.field3553[var12] = true;
                                class408.field5920.method1735(arg9, arg1, arg6, arg7);
                                continue;
                            }
                            if (var11.field5480 == 1338) {
                                if (var11.method2496(-16243, class408.field5920) != null) {
                                    class154.method1038(0);
                                    class383.method2498(var13, class408.field5920, var11, -18020, var14);
                                    class296.field4100[var12] = true;
                                    class408.field5920.method1735(arg9, arg1, arg6, arg7);
                                }
                                continue;
                            }
                            if (var11.field5480 == 1339) {
                                if (var11.method2496(-16243, class408.field5920) != null) {
                                    class225.method1427(var11, var14, var13, 0);
                                    class296.field4100[var12] = true;
                                    class408.field5920.method1735(arg9, arg1, arg6, arg7);
                                }
                                continue;
                            }
                            if (var11.field5480 == 1400) {
                                class105.method716(class65.field1027, var11.field5491, -117, var11.field5431, var14, class408.field5920, var13);
                                class259.field3553[var12] = true;
                                class408.field5920.method1735(arg9, arg1, arg6, arg7);
                                continue;
                            }
                            if (var11.field5480 == 1401) {
                                class221.method1396(var13, var11.field5491, var11.field5431, -103, class408.field5920, var14);
                                class259.field3553[var12] = true;
                                class408.field5920.method1735(arg9, arg1, arg6, arg7);
                                continue;
                            }
                            if (var11.field5480 == 1405) {
                                if (!class75.field1162 && !class309.field4238) {
                                    continue;
                                }
                                int var26 = var11.field5431 + var13;
                                int var27 = var14 + 15;
                                if (class75.field1162) {
                                    class216.field2867.method2274("Fps:" + class62.field978, var26, -1, (byte) 38, -256, var27);
                                    var27 += 15;
                                    Runtime var28 = Runtime.getRuntime();
                                    int var29 = (int) ((var28.totalMemory() - var28.freeMemory()) / 1024L);
                                    int var30 = -256;
                                    if (var29 > 65536) {
                                        var30 = -65536;
                                    }
                                    class216.field2867.method2274("Mem:" + var29 + "k", var26, -1, (byte) 38, var30, var27);
                                    var27 += 15;
                                    int var31 = class408.field5920.method1747() / 1024;
                                    class216.field2867.method2274("Offheap:" + var31 + "k", var26, -1, (byte) 38, var31 <= 65536 ? -256 : -65536, var27);
                                    var27 += 15;
                                    int var32 = 0;
                                    int var33 = 0;
                                    int var34 = 0;
                                    for (int var35 = 0; var35 < 29; var35++) {
                                        var32 += class31.field486[var35].method2813((byte) 124);
                                        var33 += class31.field486[var35].method2817(-112);
                                        var34 += class31.field486[var35].method2812(true);
                                    }
                                    int var36 = var34 * 100 / var32;
                                    int var37 = var33 * 10000 / var32;
                                    String var38 = "Cache:" + class188.method1233(-11142, true, (long) var37, 2, 0) + "% (" + var36 + "%)";
                                    class403.field5875.method2274(var38, var26, -1, (byte) 38, -256, var27);
                                    var27 += 12;
                                }
                                if (class398.field5825 > 0) {
                                    class403.field5875.method2274("Particles: " + class218.field2878 + " / " + class398.field5825, var26, -1, (byte) 38, -256, var27);
                                }
                                var27 += 12;
                                if (class309.field4238) {
                                    class403.field5875.method2274("Polys: " + class408.field5920.method1738() + " Models: " + class408.field5920.method1750(), var26, -1, (byte) 38, -256, var27);
                                    var27 += 12;
                                    class403.field5875.method2274("Ls: " + class357.field5033 + " La: " + class105.field1580 + " NPC: " + class143.field2072 + " Pl: " + class395.field5779, var26, -1, (byte) 38, -256, var27);
                                    class214.method1373(0);
                                    var27 += 12;
                                }
                                class259.field3553[var12] = true;
                                continue;
                            }
                        }
                        if (var11.field5488 == 0) {
                            if (!var11.field5589 && client.method1113(var11) && class75.field1168 != var11) {
                                continue;
                            }
                            if (!var11.field5589) {
                                if (var11.field5434 > var11.field5590 - var11.field5491) {
                                    var11.field5434 = var11.field5590 - var11.field5491;
                                }
                                if (var11.field5434 < 0) {
                                    var11.field5434 = 0;
                                }
                            }
                            if (var11.field5480 == 1407 && class408.field5920.method1780()) {
                                class408.field5920.method1731(var13, var14, var11.field5431, var11.field5491);
                            }
                            method1372(var12, var23, var14 - var11.field5434, -117, var13 - var11.field5511, var11.field5507, var24, var25, arg8, var22);
                            if (var11.field5465 != null) {
                                method1372(var12, var23, var14 - var11.field5434, -99, var13 - var11.field5511, var11.field5507, var24, var25, var11.field5465, var22);
                            }
                            class432 var39 = (class432) class271.field3700.method1412((byte) -54, (long) var11.field5507);
                            if (var39 != null) {
                                class403.method2599(var25, var24, var12, var39.field6217, var14, var13, 2, var22, var23);
                            }
                            if (var11.field5480 == 1407 && class408.field5920.method1780()) {
                                class408.field5920.method1813();
                                class237.field3230 = true;
                            }
                            class408.field5920.method1735(arg9, arg1, arg6, arg7);
                        }
                        if (class257.field3512[var12] || class152.field2156 > 1) {
                            if (var11.field5488 == 0 && !var11.field5589 && var11.field5590 > var11.field5491) {
                                class299.method1930(var11.field5431 + var13, var11.field5491, var11.field5590, var14, var11.field5434, -65);
                            }
                            if (var11.field5488 != 1) {
                                if (var11.field5488 == 2) {
                                    int var40 = 0;
                                    for (int var41 = 0; var41 < var11.field5454; var41++) {
                                        for (int var42 = 0; var42 < var11.field5493; var42++) {
                                            int var43 = (var11.field5425 + 32) * var42 + var13;
                                            int var44 = (var11.field5592 + 32) * var41 + var14;
                                            if (var40 < 20) {
                                                var44 += var11.field5451[var40];
                                                var43 += var11.field5422[var40];
                                            }
                                            if (var11.field5564[var40] > 0) {
                                                boolean var46 = false;
                                                boolean var47 = false;
                                                int var48 = var11.field5564[var40] - 1;
                                                if (arg9 < (var43 + 32) && arg6 > var43 && arg1 < (var44 + 32) && var44 < arg7 || class145.field2106 == var11 && class437.field6288 == var40) {
                                                    class130 var49;
                                                    if (class222.field2980 == 1 && class29.field458 == var40 && class55.field805 == var11.field5507) {
                                                        var49 = class434.method2724(var11.field5560[var40], class408.field5920, 2, var48, (class412) null, (byte) -78, 0, var11.field5430);
                                                    } else {
                                                        var49 = class434.method2724(var11.field5560[var40], class408.field5920, 1, var48, (class412) null, (byte) -78, -13623264, var11.field5430);
                                                    }
                                                    if (var49 == null) {
                                                        class86.method596(14459, var11);
                                                    } else if (class145.field2106 == var11 && class437.field6288 == var40) {
                                                        int var50 = class162.field2269 - class298.field4131;
                                                        int var51 = class349.field4883 - class427.field6126;
                                                        if (var50 < 5 && var50 > -5) {
                                                            var50 = 0;
                                                        }
                                                        if (var51 < 5 && var51 > -5) {
                                                            var51 = 0;
                                                        }
                                                        if (class6.field92 < 5) {
                                                            var51 = 0;
                                                            var50 = 0;
                                                        }
                                                        var49.method809(var43 + var51, var44 + var50, 0, -2013265920, 1);
                                                        if (arg5 != -1) {
                                                            class383 var52 = arg8[arg5 & 0xFFFF];
                                                            int[] var53 = new int[4];
                                                            class408.field5920.method1796(var53);
                                                            int var54 = var53[1];
                                                            int var55 = var53[3];
                                                            if (var54 > var44 + var50 && var52.field5434 > 0) {
                                                                int var56 = (var54 - var44 - var50) * class63.field980 / 3;
                                                                if (var56 > (class63.field980 * 10)) {
                                                                    var56 = class63.field980 * 10;
                                                                }
                                                                if (var56 > var52.field5434) {
                                                                    var56 = var52.field5434;
                                                                }
                                                                class298.field4131 += var56;
                                                                var52.field5434 -= var56;
                                                                class86.method596(14459, var52);
                                                            }
                                                            if ((var50 + var44 + 32) > var55 && (var52.field5590 - var52.field5491) > var52.field5434) {
                                                                int var57 = (var44 + var50 + 32 - var55) * class63.field980 / 3;
                                                                if (var57 > class63.field980 * 10) {
                                                                    var57 = class63.field980 * 10;
                                                                }
                                                                if (var52.field5590 - var52.field5434 - var52.field5491 < var57) {
                                                                    var57 = var52.field5590 - var52.field5491 - var52.field5434;
                                                                }
                                                                var52.field5434 += var57;
                                                                class298.field4131 -= var57;
                                                                class86.method596(14459, var52);
                                                            }
                                                        }
                                                    } else if (class15.field173 == var11 && class14.field167 == var40) {
                                                        var49.method809(var43, var44, 0, -2013265920, 1);
                                                    } else {
                                                        var49.method867(var43, var44);
                                                    }
                                                }
                                            } else if (var11.field5427 != null && var40 < 20) {
                                                class130 var45 = var11.method2504(class408.field5920, (byte) 127, var40);
                                                if (var45 != null) {
                                                    var45.method867(var43, var44);
                                                } else if (class105.field1578) {
                                                    class86.method596(14459, var11);
                                                }
                                            }
                                            var40++;
                                        }
                                    }
                                } else if (var11.field5488 == 3) {
                                    int var58;
                                    if (class349.method2231(83, var11)) {
                                        var58 = var11.field5555;
                                        if (class75.field1168 == var11 && var11.field5523 != 0) {
                                            var58 = var11.field5523;
                                        }
                                    } else {
                                        var58 = var11.field5468;
                                        if (class75.field1168 == var11 && var11.field5547 != 0) {
                                            var58 = var11.field5547;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var11.field5526) {
                                            class408.field5920.method1785(var13, var14, var11.field5431, var11.field5491, var58, 0);
                                        } else {
                                            class408.field5920.method1748(var13, var14, var11.field5431, var11.field5491, var58, 0);
                                        }
                                    } else if (var11.field5526) {
                                        class408.field5920.method1785(var13, var14, var11.field5431, var11.field5491, var58 & 0xFFFFFF | 255 - (var15 & 0xFF) << 24, 1);
                                    } else {
                                        class408.field5920.method1748(var13, var14, var11.field5431, var11.field5491, 255 - (var15 & 0xFF) << 24 | var58 & 0xFFFFFF, 1);
                                    }
                                } else if (var11.field5488 == 4) {
                                    class352 var59 = var11.method2505(class408.field5920, 1);
                                    if (var59 != null) {
                                        String var60 = var11.field5445;
                                        int var61;
                                        if (class349.method2231(-92, var11)) {
                                            var61 = var11.field5555;
                                            if (class75.field1168 == var11 && var11.field5523 != 0) {
                                                var61 = var11.field5523;
                                            }
                                            if (var11.field5550.length() > 0) {
                                                var60 = var11.field5550;
                                            }
                                        } else {
                                            var61 = var11.field5468;
                                            if (class75.field1168 == var11 && var11.field5547 != 0) {
                                                var61 = var11.field5547;
                                            }
                                        }
                                        if (var11.field5589 && var11.field5569 != -1) {
                                            class389 var62 = class347.method2222(var11.field5569, 18682);
                                            var60 = var62.field5722;
                                            if (var60 == null) {
                                                var60 = "null";
                                            }
                                            if ((var62.field5680 == 1 || var11.field5571 != 1) && var11.field5571 != -1) {
                                                var60 = "<col=ff9040>" + var60 + "</col> x" + class188.method1234(var11.field5571, (byte) -127);
                                            }
                                        }
                                        if (class353.field4958 == var11) {
                                            var61 = var11.field5468;
                                            var60 = class448.field6482;
                                        }
                                        if (!var11.field5589) {
                                            var60 = class237.method1494(101, var11, var60);
                                        }
                                        if (class30.field469) {
                                            class408.field5920.method1776(var13, var14, var11.field5431 + var13, var11.field5491 + var14);
                                        }
                                        var59.method2264(var60, var11.field5556, 0, var11.field5610, class140.field1992, var11.field5499, (byte) -88, var11.field5431, 0, var11.field5476 ? -16777216 : -1, var13, var61 | 0xFF000000, var14, (class220) null, var11.field5491, (int[]) null);
                                        if (class30.field469) {
                                            class408.field5920.method1735(arg9, arg1, arg6, arg7);
                                        }
                                    } else if (class105.field1578) {
                                        class86.method596(14459, var11);
                                    }
                                } else if (var11.field5488 == 5) {
                                    if (!var11.field5589) {
                                        class130 var63 = var11.method2509((byte) -69, class408.field5920, class349.method2231(58, var11));
                                        if (var63 != null) {
                                            var63.method867(var13, var14);
                                        } else if (class105.field1578) {
                                            class86.method596(14459, var11);
                                        }
                                    } else if (var11.field5503 >= 0) {
                                        var11.method2502((byte) 127).method998(class408.field5920, var13, 0, var11.field5431, var11.field5601 << 3, 0, var11.field5491, var14, 0, var11.field5486 << 3);
                                    } else {
                                        class130 var64;
                                        if (var11.field5569 == -1) {
                                            var64 = var11.method2509((byte) -69, class408.field5920, false);
                                        } else {
                                            class412 var65 = var11.field5466 ? class307.field4211.field4965 : null;
                                            var64 = class434.method2724(var11.field5571, class408.field5920, var11.field5510, var11.field5569, var65, (byte) -78, var11.field5520 | 0xFF000000, var11.field5430);
                                        }
                                        if (var64 != null) {
                                            int var66 = var64.method874();
                                            int var67 = var64.method877();
                                            if (var11.field5608) {
                                                class408.field5920.method1776(var13, var14, var11.field5431 + var13, var14 - -var11.field5491);
                                                if (var11.field5495 != 0) {
                                                    int var69 = (var11.field5431 - (1 - var66)) / var66;
                                                    int var70 = (var67 - (1 - var11.field5491)) / var67;
                                                    for (int var71 = 0; var71 < var69; var71++) {
                                                        for (int var72 = 0; var72 < var70; var72++) {
                                                            var64.method871((float) var66 / 2.0F + (float) (var13 + (var66 * var71)), (float) var67 / 2.0F + (float) (var67 * var72 + var14), 4096, var11.field5495);
                                                        }
                                                    }
                                                } else if (var15 == 0) {
                                                    var64.method875(var13, var14, var11.field5431, var11.field5491, 0, 0, 1);
                                                } else {
                                                    var64.method875(var13, var14, var11.field5431, var11.field5491, 1, 255 - (var15 & 0xFF) << 24 | 0xFFFFFF, 1);
                                                }
                                                class408.field5920.method1735(arg9, arg1, arg6, arg7);
                                            } else if (var15 != 0) {
                                                int var68 = 255 - (var15 & 0xFF) << 24 | 0xFFFFFF;
                                                if (var11.field5495 != 0) {
                                                    var64.method869((float) var11.field5431 / 2.0F + (float) var13, (float) var11.field5491 / 2.0F + (float) var14, var11.field5431 * 4096 / var66, var11.field5495, 1, var68, 1);
                                                } else if (var11.field5431 == var66 && var11.field5491 == var67) {
                                                    var64.method809(var13, var14, 1, var68, 1);
                                                } else {
                                                    var64.method807(var13, var14, var11.field5431, var11.field5491, 1, var68, 1);
                                                }
                                            } else if (var11.field5495 != 0) {
                                                var64.method871((float) var11.field5431 / 2.0F + (float) var13, (float) var11.field5491 / 2.0F + (float) var14, var11.field5431 * 4096 / var66, var11.field5495);
                                            } else if (var11.field5431 == var66 && var11.field5491 == var67) {
                                                var64.method867(var13, var14);
                                            } else {
                                                var64.method872(var13, var14, var11.field5431, var11.field5491);
                                            }
                                        } else if (class105.field1578) {
                                            class86.method596(14459, var11);
                                        }
                                    }
                                } else if (var11.field5488 == 6) {
                                    boolean var73 = class349.method2231(-84, var11);
                                    int var74;
                                    if (var73) {
                                        var74 = var11.field5578;
                                    } else {
                                        var74 = var11.field5551;
                                    }
                                    class113.method747(true);
                                    class75 var75 = null;
                                    int var76 = 0;
                                    if (var11.field5569 != -1) {
                                        class389 var84 = class347.method2222(var11.field5569, 18682);
                                        if (var84 != null) {
                                            class389 var85 = var84.method2541((byte) -104, var11.field5571);
                                            class449 var86 = var74 == -1 ? null : class86.method599(false, var74);
                                            class412 var87 = var11.field5466 ? class307.field4211.field4965 : null;
                                            var75 = var85.method2546(var11.field5446, var86, 1024, var11.field5426, class408.field5920, var87, 111, var11.field5544, 1);
                                            if (var75 == null) {
                                                class86.method596(14459, var11);
                                            } else {
                                                var76 = -var75.method523() / 2;
                                            }
                                        }
                                    } else if (var11.field5457 == 5) {
                                        if (var11.field5554 == -1) {
                                            var75 = class296.field4080.method2643(0, (class7[]) null, -1, 1024, -1, class408.field5920, -31379, -1, -1, 0, true, (class449) null, (class449) null);
                                        } else {
                                            int var81 = var11.field5554;
                                            class354 var82;
                                            if (class414.field6012 == var81) {
                                                var82 = class307.field4211;
                                            } else {
                                                var82 = class12.field153[var81];
                                            }
                                            class449 var83 = var74 == -1 ? null : class86.method599(false, var74);
                                            if (var82 != null && (var81 == 2047 || class429.method2701(92, var82.field4994) == var11.field5437)) {
                                                var75 = var82.field4965.method2643(var11.field5446, (class7[]) null, var11.field5426, 1024, var11.field5544, class408.field5920, -31379, -1, 0, 0, true, (class449) null, var83);
                                            }
                                        }
                                    } else if (var11.field5457 == 8 || var11.field5457 == 9) {
                                        class124 var78 = client.method1116(var11.field5554, (byte) -61);
                                        class449 var79 = var74 == -1 ? null : class86.method599(false, var74);
                                        if (var78 != null) {
                                            class412 var80 = var11.field5466 ? class307.field4211.field4965 : null;
                                            var75 = var78.method831(1024, var11.field5544, var79, var11.field5446, var11.field5437, (byte) -44, class408.field5920, var11.field5426, var11.field5457 == 9, var80);
                                        }
                                    } else if (var74 == -1) {
                                        var75 = var11.method2497((byte) -89, 1024, class408.field5920, -1, var73, 0, (class449) null, class307.field4211.field4965, -1);
                                        if (var75 == null && class105.field1578) {
                                            class86.method596(14459, var11);
                                        }
                                    } else {
                                        class449 var77 = class86.method599(false, var74);
                                        var75 = var11.method2497((byte) -70, 1024, class408.field5920, var11.field5426, var73, var11.field5446, var77, class307.field4211.field4965, var11.field5544);
                                        if (var75 == null && class105.field1578) {
                                            class86.method596(14459, var11);
                                        }
                                    }
                                    if (var75 != null) {
                                        int var88;
                                        if (var11.field5521 <= 0) {
                                            var88 = 512;
                                        } else {
                                            var88 = (var11.field5431 << 9) / var11.field5521;
                                        }
                                        int var89;
                                        if (var11.field5498 <= 0) {
                                            var89 = 512;
                                        } else {
                                            var89 = (var11.field5491 << 9) / var11.field5498;
                                        }
                                        int var90 = (var11.field5469 * var88 >> 9) + var11.field5431 / 2 + var13;
                                        int var91 = (var11.field5463 * var89 >> 9) + (var14 + (var11.field5491 / 2));
                                        class220.field2893.method893();
                                        class408.field5920.method1724(class220.field2893);
                                        int var92 = class362.field5083[var11.field5585 << 3] * var11.field5504 >> 15;
                                        int var93 = class362.field5082[var11.field5585 << 3] * var11.field5504 >> 15;
                                        class408.field5920.method1763(var90, var91, var88, var89);
                                        class408.field5920.method1805((float) var11.field5442, var11.field5497 ? (float) var11.field5542 : (float) var11.field5542 * 1.5F);
                                        if (class237.field3230) {
                                            class408.field5920.method1812();
                                            class408.field5920.method1779();
                                            class408.field5920.method1735(arg9, arg1, arg6, arg7);
                                            class237.field3230 = false;
                                        }
                                        if (var11.field5512) {
                                            class408.field5920.method1822(false);
                                        }
                                        if (var11.field5589) {
                                            class410.field5962.method886(-var11.field5479 << 3);
                                            class410.field5962.method883(var11.field5603 << 3);
                                            class410.field5962.method888(var11.field5432, var11.field5588 + var92 + var76, var11.field5588 + var93);
                                        } else {
                                            class410.field5962.method891(var11.field5603 << 3);
                                            class410.field5962.method888(0, var92, var93);
                                        }
                                        class410.field5962.method892(var11.field5585 << 3);
                                        if (class30.field469) {
                                            class408.field5920.method1776(var13, var14, var11.field5431 + var13, var11.field5491 + var14);
                                        }
                                        if (var11.field5497) {
                                            var75.method519(class410.field5962, (class38) null, var11.field5504, 1);
                                        } else {
                                            var75.method514(class410.field5962, (class38) null, 1);
                                        }
                                        if (class30.field469) {
                                            class408.field5920.method1735(arg9, arg1, arg6, arg7);
                                        }
                                        if (var11.field5512) {
                                            class408.field5920.method1822(true);
                                        }
                                    }
                                } else {
                                    if (var11.field5488 == 7) {
                                        class352 var94 = var11.method2505(class408.field5920, 1);
                                        if (var94 == null) {
                                            if (class105.field1578) {
                                                class86.method596(14459, var11);
                                            }
                                            continue;
                                        }
                                        int var95 = 0;
                                        for (int var96 = 0; var96 < var11.field5454; var96++) {
                                            for (int var97 = 0; var97 < var11.field5493; var97++) {
                                                if (var11.field5564[var95] > 0) {
                                                    class389 var98 = class347.method2222(var11.field5564[var95] - 1, 18682);
                                                    String var99;
                                                    if (var98.field5680 != 1 && var11.field5560[var95] == 1) {
                                                        var99 = "<col=ff9040>" + var98.field5722 + "</col>";
                                                    } else {
                                                        var99 = "<col=ff9040>" + var98.field5722 + "</col> x" + class188.method1234(var11.field5560[var95], (byte) -122);
                                                    }
                                                    int var100 = (var11.field5425 + 115) * var97 + var13;
                                                    int var101 = (var11.field5592 + 12) * var96 + var14;
                                                    if (var11.field5556 == 0) {
                                                        var94.method2273(var11.field5476 ? -16777216 : -1, var100, var99, var11.field5468 | 0xFF000000, 0, var101, class140.field1992, (int[]) null);
                                                    } else if (var11.field5556 == 1) {
                                                        var94.method2283((int[]) null, var100 + 57, var11.field5468 | 0xFF000000, var11.field5476 ? -16777216 : -1, var99, var101, (byte) -123, class140.field1992);
                                                    } else {
                                                        var94.method2281(var100 + 115 - 1, var99, var11.field5468 | 0xFF000000, (int[]) null, var101, class140.field1992, var11.field5476 ? -16777216 : -1, true);
                                                    }
                                                }
                                                var95++;
                                            }
                                        }
                                    }
                                    if (var11.field5488 == 8 && class393.field5754 == var11 && class86.field1318 == class71.field1102) {
                                        int var102 = 0;
                                        int var103 = 0;
                                        class352 var104 = class216.field2867;
                                        String var105 = var11.field5445;
                                        String var106 = class237.method1494(76, var11, var105);
                                        while (var106.length() > 0) {
                                            int var114 = var106.indexOf("<br>");
                                            String var115;
                                            if (var114 == -1) {
                                                var115 = var106;
                                                var106 = "";
                                            } else {
                                                var115 = var106.substring(0, var114);
                                                var106 = var106.substring(var114 + 4);
                                            }
                                            int var116 = class235.field3194.method448((byte) -125, var115);
                                            if (var102 < var116) {
                                                var102 = var116;
                                            }
                                            var103 += class235.field3194.field1022 + 1;
                                        }
                                        var103 += 7;
                                        var102 += 6;
                                        int var107 = var11.field5431 + var13 - var102 - 5;
                                        if (var107 < (var13 + 5)) {
                                            var107 = var13 + 5;
                                        }
                                        int var108 = var14 + var11.field5491 + 5;
                                        if ((var102 + var107) > arg6) {
                                            var107 = arg6 - var102;
                                        }
                                        if (var103 + var108 > arg7) {
                                            var108 = arg7 - var103;
                                        }
                                        class408.field5920.method1785(var107, var108, var102, var103, -96, 0);
                                        class408.field5920.method1748(var107, var108, var102, var103, -16777216, 0);
                                        String var109 = var11.field5445;
                                        int var110 = class235.field3194.field1022 + var108 + 2;
                                        String var111 = class237.method1494(96, var11, var109);
                                        while (var111.length() > 0) {
                                            int var112 = var111.indexOf("<br>");
                                            String var113;
                                            if (var112 == -1) {
                                                var113 = var111;
                                                var111 = "";
                                            } else {
                                                var113 = var111.substring(0, var112);
                                                var111 = var111.substring(var112 + 4);
                                            }
                                            var104.method2278(-16777216, var110, -1, var113, (byte) -89, var107 + 3);
                                            var110 += class235.field3194.field1022 + 1;
                                        }
                                    }
                                    if (var11.field5488 == 9) {
                                        int var117;
                                        int var118;
                                        int var119;
                                        int var120;
                                        if (var11.field5441) {
                                            var118 = var14;
                                            var117 = var13;
                                            var119 = var11.field5491 + var14;
                                            var120 = var11.field5431 + var13;
                                        } else {
                                            var117 = var13;
                                            var118 = var11.field5491 + var14;
                                            var119 = var14;
                                            var120 = var11.field5431 + var13;
                                        }
                                        if (var11.field5453 == 1) {
                                            class408.field5920.method1752(var117, var119, var120, var118, var11.field5468, 0);
                                        } else {
                                            class408.field5920.method1758(var117, var119, var120, var118, var11.field5468, var11.field5453, 0);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
