import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class296 extends class366 {

    @OriginalMember(owner = "client!st", name = "v", descriptor = "Lub;")
    private class18 field4232;

    @OriginalMember(owner = "client!st", name = "j", descriptor = "Lub;")
    private class18 field4220;

    @OriginalMember(owner = "client!st", name = "r", descriptor = "Lub;")
    private class18 field4228;

    @OriginalMember(owner = "client!st", name = "o", descriptor = "Lub;")
    private class18 field4225;

    @OriginalMember(owner = "client!st", name = "k", descriptor = "Z")
    private boolean field4221;

    @OriginalMember(owner = "client!st", name = "m", descriptor = "Lvp;")
    public static class123 field4223 = new class123(7, 0);

    @OriginalMember(owner = "client!st", name = "B", descriptor = "[I")
    public static int[] field4238 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!st", name = "l", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!st", name = "p", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!st", name = "q", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!st", name = "s", descriptor = "I")
    public static int field4229;

    @OriginalMember(owner = "client!st", name = "t", descriptor = "I")
    public static int field4230;

    @OriginalMember(owner = "client!st", name = "w", descriptor = "I")
    public static int field4233;

    @OriginalMember(owner = "client!st", name = "x", descriptor = "I")
    public static int field4234;

    @OriginalMember(owner = "client!st", name = "y", descriptor = "I")
    public static int field4235;

    @OriginalMember(owner = "client!st", name = "z", descriptor = "I")
    public static int field4236;

    @OriginalMember(owner = "client!st", name = "A", descriptor = "I")
    public static int field4237;

    @OriginalMember(owner = "client!st", name = "n", descriptor = "Z")
    private boolean field4224;

    @OriginalMember(owner = "client!st", name = "u", descriptor = "Z")
    private boolean field4231;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "([Ltn;IIIIIIIII)V")
    public static final void method1825(class58[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field4236;
        if (arg2 != 1) {
            method1829((byte) -50);
        }
        class394.field5821.method509(arg5, arg8, arg9, arg3);
        for (int var10 = 0; arg0.length > var10; ++var10) {
            class58 var11 = arg0[var10];
            if (var11 != null && (~var11.field876 == ~arg4 || arg4 == -1412584499 && class13.field221 == var11)) {
                int var12;
                if (~arg6 != 0) {
                    var12 = arg6;
                } else {
                    class135.field2072[class73.field1232].setBounds(var11.field845 + arg7, var11.field899 - -arg1, var11.field925, var11.field896);
                    var12 = class73.field1232++;
                }
                var11.field969 = class180.field2734;
                var11.field984 = var12;
                if (!client.method1334(var11)) {
                    if (var11.field892 != 0) {
                        class413.method2551((byte) -123, var11);
                    }
                    int var13 = var11.field845 + arg7;
                    int var14 = var11.field899 + arg1;
                    int var15 = var11.field973;
                    if (class38.field578 && (~client.method1349(var11).field1626 != -1 || ~var11.field843 == -1) && ~var15 < -128) {
                        var15 = 127;
                    }
                    if (class13.field221 == var11) {
                        if (arg4 != -1412584499 && (class11.field175 == var11.field913 || ~class122.field1909 == ~var11.field913)) {
                            class153.field2342 = arg7;
                            class188.field2790 = arg1;
                            class49.field733 = arg0;
                            continue;
                        }
                        if (class516.field7584 && class216.field3101) {
                            int var16 = class481.field7063.method713(arg2 + 114);
                            int var17 = class481.field7063.method712(arg2 + -31040);
                            int var18 = var16 - class95.field1556;
                            int var19 = var17 - class442.field6484;
                            if (~var18 > ~class436.field6327) {
                                var18 = class436.field6327;
                            }
                            if (class436.field6327 - -class216.field3103.field925 < var11.field925 + var18) {
                                var18 = class436.field6327 - -class216.field3103.field925 + -var11.field925;
                            }
                            if (~var19 > ~class414.field6085) {
                                var19 = class414.field6085;
                            }
                            var13 = var18;
                            if (~(var11.field896 + var19) < ~(class414.field6085 - -class216.field3103.field896)) {
                                var19 = -var11.field896 + class414.field6085 - -class216.field3103.field896;
                            }
                            var14 = var19;
                        }
                        if (~class122.field1909 == ~var11.field913) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (~var11.field843 == -3) {
                        var20 = arg9;
                        var21 = arg8;
                        var22 = arg3;
                        var23 = arg5;
                    } else {
                        int var24 = var11.field925 + var13;
                        int var25 = var11.field896 + var14;
                        var23 = var13 > arg5 ? var13 : arg5;
                        var21 = ~var14 < ~arg8 ? var14 : arg8;
                        if (~var11.field843 == -10) {
                            ++var25;
                            ++var24;
                        }
                        var22 = ~arg3 < ~var25 ? var25 : arg3;
                        var20 = arg9 > var24 ? var24 : arg9;
                    }
                    if (var23 < var20 && ~var21 > ~var22) {
                        if (~var11.field892 != -1) {
                            if (~class494.field7196 == ~var11.field892 || class8.field138 == var11.field892) {
                                class250.method1593(class8.field138 == var11.field892, var13, var11.field925, var14, (byte) 76, var11.field896);
                                class165.field2473[var12] = true;
                                class394.field5821.method509(arg5, arg8, arg9, arg3);
                                continue;
                            }
                            if (~class160.field2427 == ~var11.field892) {
                                if (var11.method415(class394.field5821, 1816933795) != null) {
                                    class292.method1811(true);
                                    class57.method406(16383, var11, var13, var14, class394.field5821);
                                    class482.field7076[var12] = true;
                                    class394.field5821.method509(arg5, arg8, arg9, arg3);
                                }
                                continue;
                            }
                            if (class118.field1856 == var11.field892) {
                                if (var11.method415(class394.field5821, arg2 ^ 1816933794) != null) {
                                    class496.method2953(var14, -1467647389, var11, var13);
                                    class482.field7076[var12] = true;
                                    class394.field5821.method509(arg5, arg8, arg9, arg3);
                                }
                                continue;
                            }
                            if (~class277.field4004 == ~var11.field892) {
                                class473.method2833(-25228, class394.field5821, var11.field896, class237.field3440, var14, var11.field925, var13);
                                class165.field2473[var12] = true;
                                class394.field5821.method509(arg5, arg8, arg9, arg3);
                                continue;
                            }
                            if (~class165.field2470 == ~var11.field892) {
                                class79.method644(var11.field925, class394.field5821, var11.field896, var14, var13, arg2 ^ -81);
                                class165.field2473[var12] = true;
                                class394.field5821.method509(arg5, arg8, arg9, arg3);
                                continue;
                            }
                            if (class45.field680 == var11.field892) {
                                if (!class183.field2754 && !class61.field1057) {
                                    continue;
                                }
                                int var26 = var13 - -var11.field925;
                                int var27 = var14 + 15;
                                if (class183.field2754) {
                                    class55.field808.method2914(var27, -123, -1, var26, -256, "Fps:" + class285.field4133);
                                    var27 += 15;
                                    Runtime var28 = Runtime.getRuntime();
                                    int var29 = (int) ((var28.totalMemory() + -var28.freeMemory()) / 1024L);
                                    int var30 = -256;
                                    if (~var29 < -65537) {
                                        var30 = -65536;
                                    }
                                    class55.field808.method2914(var27, -124, -1, var26, var30, "Mem:" + var29 + "k");
                                    var27 += 15;
                                    class55.field808.method2914(var27, arg2 + -129, -1, var26, -256, "In:" + class92.field1524 + "B/s Out:" + class209.field3003 + "B/s");
                                    var27 += 15;
                                    int var31 = class394.field5821.method489() / 1024;
                                    class55.field808.method2914(var27, arg2 + -122, -1, var26, var31 <= 65536 ? -256 : -65536, "Offheap:" + var31 + "k");
                                    var27 += 15;
                                    int var32 = 0;
                                    int var33 = 0;
                                    int var34 = 0;
                                    for (int var35 = 0; ~var35 > -31; ++var35) {
                                        var32 += class401.field5888[var35].method314(arg2 ^ 86);
                                        var33 += class401.field5888[var35].method304((byte) -127);
                                        var34 += class401.field5888[var35].method309((byte) -88);
                                    }
                                    int var36 = var34 * 100 / var32;
                                    int var37 = var33 * 10000 / var32;
                                    String var38 = "Cache:" + class250.method1590(true, 2, (long) var37, 122, 0) + "% (" + var36 + "%)";
                                    class125.field1923.method2914(var27, -114, -1, var26, -256, var38);
                                    var27 += 12;
                                }
                                if (~class49.field730 < -1) {
                                    class125.field1923.method2914(var27, -126, -1, var26, -256, "Particles: " + class356.field5382 + " / " + class49.field730);
                                }
                                var27 += 12;
                                if (class61.field1057) {
                                    class125.field1923.method2914(var27, -118, -1, var26, -256, "Polys: " + class394.field5821.method445() + " Models: " + class394.field5821.method462());
                                    var27 += 12;
                                    class125.field1923.method2914(var27, -125, -1, var26, -256, "Ls: " + class22.field376 + " La: " + class342.field5221 + " NPC: " + class244.field3519 + " Pl: " + class295.field4215);
                                    class207.method1386((byte) 119);
                                    var27 += 12;
                                }
                                class165.field2473[var12] = true;
                                continue;
                            }
                        }
                        if (~var11.field843 == -1) {
                            if (~class342.field5217 == ~var11.field892 && class394.field5821.method529()) {
                                class394.field5821.method429(var13, var14, var11.field925, var11.field896);
                            }
                            method1825(arg0, var14 - var11.field855, 1, var22, var11.field955, var23, var12, -var11.field885 + var13, var21, var20);
                            if (var11.field910 != null) {
                                method1825(var11.field910, -var11.field855 + var14, 1, var22, var11.field955, var23, var12, -var11.field885 + var13, var21, var20);
                            }
                            class183 var39 = (class183) class466.field6844.method2485(27, (long) var11.field955);
                            if (var39 != null) {
                                class121.method914(var12, (byte) 114, var23, var21, var22, var20, var39.field2753, var14, var13);
                            }
                            if (class342.field5217 == var11.field892 && class394.field5821.method529()) {
                                class394.field5821.method444();
                                class466.field6856 = true;
                            }
                            class394.field5821.method509(arg5, arg8, arg9, arg3);
                        }
                        if (class459.field6776[var12] || ~class482.field7078 < -2) {
                            if (var11.field843 == 3) {
                                if (~var15 == -1) {
                                    if (!var11.field893) {
                                        class394.field5821.method516(var13, var14, var11.field925, var11.field896, var11.field943, 0);
                                    } else {
                                        class394.field5821.method471(var13, var14, var11.field925, var11.field896, var11.field943, 0);
                                    }
                                } else if (!var11.field893) {
                                    class394.field5821.method516(var13, var14, var11.field925, var11.field896, -(var15 & 255) + 255 << 24 | var11.field943 & 16777215, 1);
                                } else {
                                    class394.field5821.method471(var13, var14, var11.field925, var11.field896, var11.field943 & 16777215 | -(255 & var15) + 255 << 24, 1);
                                }
                            } else if (var11.field843 == 4) {
                                class488 var40 = var11.method414(class394.field5821, (byte) -104);
                                if (var40 == null) {
                                    if (class138.field2088) {
                                        class139.method1027(var11, false);
                                    }
                                } else {
                                    int var41 = var11.field943;
                                    String var42 = var11.field859;
                                    if (var11.field946 != -1) {
                                        class172 var43 = class8.field111.method3077(-120, var11.field946);
                                        var42 = var43.field2569;
                                        if (var42 == null) {
                                            var42 = "null";
                                        }
                                        if ((~var43.field2566 == -2 || ~var11.field977 != -2) && ~var11.field977 != 0) {
                                            var42 = "<col=ff9040>" + var42 + "</col> x" + class68.method595(var11.field977, -2);
                                        }
                                    }
                                    if (class259.field3741 == var11) {
                                        var42 = class472.field6955.method1273(true, class370.field5530);
                                        var41 = var11.field943;
                                    }
                                    if (class386.field5727) {
                                        class394.field5821.method480(var13, var14, var11.field925 + var13, var11.field896 + var14);
                                    }
                                    var40.method2927(var11.field925, var42, (int[]) null, class402.field5901, var11.field842, 0, !var11.field948 ? -1 : 255 - (255 & var15) << 24, var13, 255 - (255 & var15) << 24 | var41, -84, var11.field896, (class381) null, var11.field988, var11.field902, var11.field853, var14, 0);
                                    if (class386.field5727) {
                                        class394.field5821.method509(arg5, arg8, arg9, arg3);
                                    }
                                }
                            } else if (~var11.field843 == -6) {
                                if (var11.field949 >= 0) {
                                    var11.method426(arg2 ^ -124, class233.field3389, class25.field443).method1516(0, var11.field925, class394.field5821, var11.field962 << 3, var11.field923 << 3, var13, (byte) 111, var14, var11.field896, 0);
                                } else {
                                    class528 var45;
                                    if (var11.field946 != -1) {
                                        class45 var44 = var11.field834 ? class95.field1558.field1060 : null;
                                        var45 = class8.field111.method3084(var11.field977, class394.field5821, var11.field889, var11.field852, var11.field983 | -16777216, (byte) 86, var44, var11.field946);
                                    } else {
                                        var45 = var11.method425(class394.field5821, 12);
                                    }
                                    if (var45 != null) {
                                        int var46 = var45.method134();
                                        int var47 = var45.method131();
                                        int var48 = 255 - (var15 & 255) << 24 | (~var11.field943 != -1 ? var11.field943 & 16777215 : 16777215);
                                        if (!var11.field929) {
                                            if (~var11.field943 == -1 && ~var15 == -1) {
                                                if (~var11.field865 != -1) {
                                                    var45.method3130((float) var11.field925 / 2.0F + (float) var13, (float) var11.field896 / 2.0F + (float) var14, var11.field925 * 4096 / var46, var11.field865);
                                                } else if (~var11.field925 == ~var46 && ~var11.field896 == ~var47) {
                                                    var45.method3129(var13, var14);
                                                } else {
                                                    var45.method3127(var13, var14, var11.field925, var11.field896);
                                                }
                                            } else if (~var11.field865 != -1) {
                                                var45.method3131((float) var11.field925 / 2.0F + (float) var13, (float) var11.field896 / 2.0F + (float) var14, var11.field925 * 4096 / var46, var11.field865, 0, var48, 1);
                                            } else if (var11.field925 == var46 && var11.field896 == var47) {
                                                var45.method133(var13, var14, 0, var48, 1);
                                            } else {
                                                var45.method136(var13, var14, var11.field925, var11.field896, 0, var48, 1);
                                            }
                                        } else {
                                            class394.field5821.method480(var13, var14, var11.field925 + var13, var11.field896 + var14);
                                            if (~var11.field865 == -1) {
                                                if (~var11.field943 == -1 && ~var15 == -1) {
                                                    var45.method3128(var13, var14, var11.field925, var11.field896);
                                                } else {
                                                    var45.method145(var13, var14, var11.field925, var11.field896, 0, var48, 1);
                                                }
                                            } else {
                                                int var49 = (var46 + -1 + var11.field925) / var46;
                                                int var50 = (var47 + -1 + var11.field896) / var47;
                                                for (int var51 = 0; var51 < var49; ++var51) {
                                                    for (int var52 = 0; var50 > var52; ++var52) {
                                                        if (~var11.field943 != -1) {
                                                            var45.method3131((float) var46 / 2.0F + (float) (var13 - -(var46 * var51)), (float) var47 / 2.0F + (float) (var47 * var52 + var14), 4096, var11.field865, 0, var48, 1);
                                                        } else {
                                                            var45.method3130((float) var46 / 2.0F + (float) (var46 * var51 + var13), (float) var47 / 2.0F + (float) (var47 * var52 + var14), 4096, var11.field865);
                                                        }
                                                    }
                                                }
                                            }
                                            class394.field5821.method509(arg5, arg8, arg9, arg3);
                                        }
                                    } else if (class138.field2088) {
                                        class139.method1027(var11, false);
                                    }
                                }
                            } else if (var11.field843 != 6) {
                                if (var11.field843 == 9) {
                                    int var72;
                                    int var73;
                                    int var74;
                                    int var75;
                                    if (var11.field942) {
                                        var72 = var11.field925 + var13;
                                        var73 = var14;
                                        var74 = var13;
                                        var75 = var14 - -var11.field896;
                                    } else {
                                        var75 = var14;
                                        var72 = var11.field925 + var13;
                                        var74 = var13;
                                        var73 = var11.field896 + var14;
                                    }
                                    if (var11.field917 != 1) {
                                        class394.field5821.method491(var74, var75, var72, var73, var11.field943, var11.field917, 0);
                                    } else {
                                        class394.field5821.method470(var74, var75, var72, var73, var11.field943, 0);
                                    }
                                }
                            } else {
                                class29.method241((byte) 119);
                                class121 var53 = null;
                                int var54 = 0;
                                if (~var11.field946 != 0) {
                                    class172 var55 = class8.field111.method3077(-127, var11.field946);
                                    if (var55 != null) {
                                        class172 var56 = var55.method1213(var11.field977, true);
                                        class357 var57 = var11.field909 != -1 ? class311.field4455.method1233(true, var11.field909) : null;
                                        class45 var58 = var11.field834 ? class95.field1558.field1060 : null;
                                        var53 = var56.method1224(1, var11.field944, 2048, var11.field901, class394.field5821, var58, var11.field866, var57, arg2 + -38);
                                        if (var53 == null) {
                                            class139.method1027(var11, false);
                                        } else {
                                            var54 = -var53.method918() >> 1;
                                        }
                                    }
                                } else if (var11.field945 != 5) {
                                    if (~var11.field945 != -9 && var11.field945 != 9) {
                                        if (~var11.field909 == 0) {
                                            var53 = var11.method418(class526.field7733, class8.field111, class413.field6075, -1, class500.field7358, class95.field1558.field1060, (class357) null, 2048, class4.field64, class311.field4455, class394.field5821, 26431, -1, 0);
                                            if (var53 == null && class138.field2088) {
                                                class139.method1027(var11, false);
                                            }
                                        } else {
                                            class357 var59 = class311.field4455.method1233(true, var11.field909);
                                            var53 = var11.method418(class526.field7733, class8.field111, class413.field6075, var11.field901, class500.field7358, class95.field1558.field1060, var59, 2048, class4.field64, class311.field4455, class394.field5821, 26431, var11.field866, var11.field944);
                                            if (var53 == null && class138.field2088) {
                                                class139.method1027(var11, false);
                                            }
                                        }
                                    } else {
                                        class78 var60 = class192.method1311(var11.field966, false, -29496);
                                        class357 var61 = ~var11.field909 == 0 ? null : class311.field4455.method1233(true, var11.field909);
                                        if (var60 != null) {
                                            class45 var62 = !var11.field834 ? null : class95.field1558.field1060;
                                            var53 = var60.method637(var11.field866, true, var11.field944, var62, 2048, class394.field5821, var61, var11.field894, ~var11.field945 == -10, var11.field901);
                                        }
                                    }
                                } else {
                                    int var63 = var11.field966;
                                    if (var63 >= 0 && ~var63 > -2049) {
                                        class62 var64 = class390.field5783[var63];
                                        class357 var65 = var11.field909 != -1 ? class311.field4455.method1233(true, var11.field909) : null;
                                        if (var64 != null && (~class64.field1128 == ~var63 || class16.method148(var64.field1094, 0) == var11.field894)) {
                                            var53 = var64.field1060.method344((class228[]) null, 2048, -1, class526.field7733, var11.field901, class394.field5821, 0, class4.field64, class8.field111, true, 2, 0, var65, var11.field866, class311.field4455, var11.field944, (class357) null, class413.field6075, class500.field7358);
                                        }
                                    }
                                }
                                if (var53 != null) {
                                    int var66;
                                    if (var11.field857 > 0) {
                                        var66 = (var11.field925 << 9) / var11.field857;
                                    } else {
                                        var66 = 512;
                                    }
                                    int var67;
                                    if (~var11.field961 >= -1) {
                                        var67 = 512;
                                    } else {
                                        var67 = (var11.field896 << 9) / var11.field961;
                                    }
                                    int var68 = (var11.field881 * var66 >> 9) + var13 - -(var11.field925 / 2);
                                    int var69 = (var11.field888 * var67 >> 9) + var11.field896 / 2 + var14;
                                    class81.field1351.method1003();
                                    class394.field5821.method497(class81.field1351);
                                    class394.field5821.method485(var68, var69, var66, var67);
                                    class394.field5821.method514((float) (var11.field861 << 0), var11.field976 ? (float) (var11.field851 << 0) : (float) (var11.field851 << 0) * 1.5F);
                                    if (~arg4 == 1412584498 || class466.field6856) {
                                        class394.field5821.method492();
                                        class394.field5821.method506();
                                        class394.field5821.method509(arg5, arg8, arg9, arg3);
                                        class466.field6856 = false;
                                    }
                                    if (var11.field903) {
                                        class394.field5821.method494(false);
                                    }
                                    int var70 = (var11.field835 << 0) * class324.field4966[var11.field990 << 3] >> 15;
                                    int var71 = (var11.field835 << 0) * class324.field4974[var11.field990 << 3] >> 15;
                                    class402.field5902.method998(-var11.field932 << 3);
                                    class402.field5902.method996(var11.field872 << 3);
                                    class402.field5902.method1004(var11.field847 << 0, (var11.field869 << 0) + var54 + var70, (var11.field869 << 0) + var71);
                                    class402.field5902.method994(var11.field990 << 3);
                                    if (class386.field5727) {
                                        class394.field5821.method480(var13, var14, var11.field925 + var13, var14 - -var11.field896);
                                    }
                                    if (!var11.field976) {
                                        var53.method910(class402.field5902, (class361) null, 1);
                                    } else {
                                        var53.method903(class402.field5902, (class361) null, var11.field835 << 0, 1);
                                    }
                                    if (class386.field5727) {
                                        class394.field5821.method509(arg5, arg8, arg9, arg3);
                                    }
                                    if (var11.field903) {
                                        class394.field5821.method494(true);
                                    }
                                    class394.field5821.method514(0.0F, 0.0F);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(II)I")
    public static final int method1826(int arg0, int arg1) {
        ++field4222;
        return arg1 != 2 ? -24 : arg0 >>> 7;
    }

    @OriginalMember(owner = "client!st", name = "c", descriptor = "(I)V")
    public final void method1(int arg0) {
        ++field4233;
        if (this.field4231) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field4231 = false;
        }
        if (arg0 < 2) {
            this.method6(-1, (class440) null, (byte) 20);
        }
    }

    @OriginalMember(owner = "client!st", name = "b", descriptor = "(B)V")
    public final void method1827(byte arg0) {
        class378.field5643[3] = (float) super.field5494.field4863;
        ++field4226;
        OpenGL.glTexGenfv(8192, 9474, class378.field5643, 0);
        if (this.field4224) {
            OpenGL.glBindProgramARB(34336, super.field5494.field4863 == Integer.MAX_VALUE ? this.field4220.field279 : this.field4225.field279);
        } else {
            OpenGL.glBindProgramARB(34336, ~super.field5494.field4863 == Integer.MIN_VALUE ? this.field4232.field279 : this.field4228.field279);
        }
        OpenGL.glEnable(34336);
        this.field4231 = true;
        if (arg0 != -26) {
            field4223 = null;
        }
        this.method1828(arg0 + 26);
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(ILgo;B)V")
    public final void method6(int arg0, class440 arg1, byte arg2) {
        ++field4227;
        int var4 = 4 % ((arg2 - 31) / 59);
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(I)Z")
    public final boolean method9(int arg0) {
        ++field4230;
        if (arg0 < 21) {
            this.field4224 = true;
        }
        return this.field4221;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(IIB)V")
    public final void method8(int arg0, int arg1, byte arg2) {
        if (arg2 >= 18) {
            ++field4237;
        }
    }

    @OriginalMember(owner = "client!st", name = "<init>", descriptor = "(Lqg;)V")
    public class296(class321 arg0) {
        super(arg0);
        if (super.field5494.field4810) {
            this.field4232 = class458.method2749("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", 0, super.field5494, 34336);
            this.field4220 = class458.method2749("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", 0, super.field5494, 34336);
            this.field4228 = class458.method2749("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", 0, super.field5494, 34336);
            this.field4225 = class458.method2749("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", 0, super.field5494, 34336);
            this.field4221 = this.field4228 != null & this.field4220 != null & this.field4232 != null & this.field4225 != null;
        } else {
            this.field4221 = false;
        }
    }

    @OriginalMember(owner = "client!st", name = "d", descriptor = "(I)V")
    public final void method1828(int arg0) {
        if (arg0 != 0) {
            method1826(77, 48);
        }
        ++field4229;
        if (this.field4231) {
            OpenGL.glProgramLocalParameter4fARB(34336, 0, (float) (super.field5494.field4843 + -1280), (float) (super.field5494.field4843 - 768), 1.0F / (float) super.field5494.field4812, (float) super.field5494.field4852 / 255.0F);
        }
    }

    @OriginalMember(owner = "client!st", name = "c", descriptor = "(B)V")
    public static void method1829(byte arg0) {
        if (arg0 < -60) {
            field4238 = null;
            field4223 = null;
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(ZZ)V")
    public final void method7(boolean arg0, boolean arg1) {
        ++field4235;
        if (!arg0) {
            this.method5(true, 101);
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(ZI)V")
    public final void method5(boolean arg0, int arg1) {
        this.field4224 = arg0;
        ++field4234;
        int var3 = -55 / ((10 - arg1) / 48);
    }
}
