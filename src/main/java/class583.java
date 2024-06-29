import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class583 extends class26 {

    @OriginalMember(owner = "client!wn", name = "Ab", descriptor = "[J")
    public static long[] field8289 = new long[32];

    @OriginalMember(owner = "client!wn", name = "Db", descriptor = "I")
    public static int field8292 = 0;

    @OriginalMember(owner = "client!wn", name = "Bb", descriptor = "I")
    private int field8290;

    @OriginalMember(owner = "client!wn", name = "Cb", descriptor = "I")
    public static int field8291;

    @OriginalMember(owner = "client!wn", name = "Eb", descriptor = "I")
    public static int field8293;

    @OriginalMember(owner = "client!wn", name = "Fb", descriptor = "I")
    public static int field8294;

    @OriginalMember(owner = "client!wn", name = "Gb", descriptor = "I")
    public static int field8295;

    @OriginalMember(owner = "client!wn", name = "Hb", descriptor = "I")
    public static int field8296;

    @OriginalMember(owner = "client!wn", name = "Jb", descriptor = "I")
    public static int field8298;

    @OriginalMember(owner = "client!wn", name = "Kb", descriptor = "I")
    public static int field8299;

    @OriginalMember(owner = "client!wn", name = "Lb", descriptor = "I")
    public static int field8300;

    @OriginalMember(owner = "client!wn", name = "Mb", descriptor = "I")
    public static int field8301;

    @OriginalMember(owner = "client!wn", name = "Nb", descriptor = "I")
    public static int field8302;

    @OriginalMember(owner = "client!wn", name = "Ob", descriptor = "I")
    public static int field8303;

    @OriginalMember(owner = "client!wn", name = "Pb", descriptor = "I")
    public static int field8304;

    @OriginalMember(owner = "client!wn", name = "Qb", descriptor = "I")
    public static int field8305;

    @OriginalMember(owner = "client!wn", name = "Rb", descriptor = "I")
    public static int field8306;

    @OriginalMember(owner = "client!wn", name = "Sb", descriptor = "I")
    public static int field8307;

    @OriginalMember(owner = "client!wn", name = "Tb", descriptor = "I")
    public static int field8308;

    @OriginalMember(owner = "client!wn", name = "Ib", descriptor = "Lhaa;")
    private class311 field8297;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "([Lpaa;IIIIIIIIZI)V")
    public static final void method3454(class712[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        ++field8301;
        class96.field1401.method2097(arg1, arg7, arg10, arg5);
        for (int var11 = 0; ~arg0.length < ~var11; ++var11) {
            class712 var12 = arg0[var11];
            if (var12 != null && (var12.field10030 == arg6 || ~arg6 == 1412584498 && class740.field10315 == var12)) {
                int var13 = var12.field10048 + arg8;
                int var14 = var12.field10013 + arg2;
                int var15 = var13 + 1 + var12.field9966;
                int var16 = var14 + 1 + var12.field10011;
                int var17;
                if (arg3 == -1) {
                    class391.field5453[class752.field10450].setBounds(var12.field10048 + arg8, var12.field10013 + arg2, var12.field9966, var12.field10011);
                    var17 = class752.field10450++;
                } else {
                    var17 = arg3;
                }
                var12.field10016 = var17;
                var12.field9959 = class245.field3409;
                if (!client.method2685(var12)) {
                    if (~var12.field9930 != -1) {
                        class600.method3534(2047, var12);
                    }
                    int var18 = var12.field10048 - -arg8;
                    int var19 = var12.field10013 + arg2;
                    int var20 = 0;
                    int var21 = 0;
                    if (class264.field3595) {
                        var20 = class468.method2788(false);
                        var21 = class142.method934((byte) -88);
                    }
                    int var22 = var12.field10024;
                    if (class399.field5526 && (~client.method2675(var12).field1372 != -1 || var12.field10039 == 0) && ~var22 < -128) {
                        var22 = 127;
                    }
                    if (class740.field10315 == var12) {
                        if (arg6 != -1412584499 && (~class111.field1593 == ~var12.field10063 || ~class586.field8429 == ~var12.field10063)) {
                            class694.field9699 = arg2;
                            class488.field6581 = arg0;
                            class206.field2942 = arg8;
                            continue;
                        }
                        if (class662.field9335 && class441.field6047) {
                            int var23 = class93.field1263.method805(0) + var20;
                            int var24 = var21 + class93.field1263.method806(0);
                            int var25 = var23 - class281.field3737;
                            int var26 = var24 - class138.field1900;
                            if (~class94.field1375 < ~var25) {
                                var25 = class94.field1375;
                            }
                            if (var12.field9966 + var25 > class94.field1375 + class316.field4062.field9966) {
                                var25 = -var12.field9966 + class94.field1375 - -class316.field4062.field9966;
                            }
                            if (~class416.field5798 < ~var26) {
                                var26 = class416.field5798;
                            }
                            if (~(var12.field10011 + var26) < ~(class416.field5798 - -class316.field4062.field10011)) {
                                var26 = -var12.field10011 + class416.field5798 - -class316.field4062.field10011;
                            }
                            var18 = var25;
                            var19 = var26;
                        }
                        if (class586.field8429 == var12.field10063) {
                            var22 = 128;
                        }
                    }
                    int var29;
                    int var30;
                    int var31;
                    int var32;
                    if (var12.field10039 != 2) {
                        int var27 = var12.field9966 + var18;
                        int var28 = var12.field10011 + var19;
                        var29 = ~arg1 > ~var18 ? var18 : arg1;
                        var30 = arg7 < var19 ? var19 : arg7;
                        if (var12.field10039 == 9) {
                            ++var28;
                            ++var27;
                        }
                        var31 = arg5 <= var28 ? arg5 : var28;
                        var32 = ~var27 <= ~arg10 ? arg10 : var27;
                    } else {
                        var30 = arg7;
                        var31 = arg5;
                        var32 = arg10;
                        var29 = arg1;
                    }
                    if (~var32 < ~var29 && ~var30 > ~var31) {
                        if (~var12.field9930 != -1) {
                            if (class224.field3145 == var12.field9930 || ~class213.field3006 == ~var12.field9930) {
                                class38.method265(var18, var19, var12, (byte) -3);
                                if (!class264.field3595) {
                                    class469.method2796(var12.field9966, var18, var12.field10011, true, var19, ~class213.field3006 == ~var12.field9930);
                                    class96.field1401.method2097(arg1, arg7, arg10, arg5);
                                }
                                class142.field1966[var17] = true;
                                continue;
                            }
                            if (class59.field811 == var12.field9930) {
                                if (var12.method3996(-59, class96.field1401) != null) {
                                    class350.method1993(26779);
                                    class235.method1503(var12, (byte) -36, var19, var18, class96.field1401);
                                    class523.field7346[var17] = true;
                                    class96.field1401.method2097(arg1, arg7, arg10, arg5);
                                    if (class264.field3595) {
                                        if (!arg9) {
                                            class345.method1982(var16, (byte) 125, var15, var14, var13);
                                        } else {
                                            class217.method1422(var15, var16, -128, var13, var14);
                                        }
                                    }
                                }
                                continue;
                            }
                            if (~class96.field1403 == ~var12.field9930) {
                                if (var12.method3996(-81, class96.field1401) != null) {
                                    class433.method2612(90, var18, var12, var19);
                                    class523.field7346[var17] = true;
                                    class96.field1401.method2097(arg1, arg7, arg10, arg5);
                                    if (class264.field3595) {
                                        if (arg9) {
                                            class217.method1422(var15, var16, -119, var13, var14);
                                        } else {
                                            class345.method1982(var16, (byte) 125, var15, var14, var13);
                                        }
                                    }
                                }
                                continue;
                            }
                            if (class538.field7526 == var12.field9930) {
                                class425.method2592(var12.field9966, var12.field10011, var19, var18, class96.field1401, (byte) -98, class746.field10393);
                                class142.field1966[var17] = true;
                                class96.field1401.method2097(arg1, arg7, arg10, arg5);
                                continue;
                            }
                            if (class409.field5689 == var12.field9930) {
                                class375.method2265(-2, var12.field10011, var19, var12.field9966, var18, class96.field1401);
                                class142.field1966[var17] = true;
                                class96.field1401.method2097(arg1, arg7, arg10, arg5);
                                continue;
                            }
                            if (~class743.field10356 == ~var12.field9930) {
                                if (!class222.field3119 && !class617.field8783) {
                                    continue;
                                }
                                int var33 = var18 - -var12.field9966;
                                if (class264.field3595) {
                                    if (!arg9) {
                                        class345.method1982(var16, (byte) 125, var15, var14, var13);
                                    } else {
                                        class217.method1422(var15, var16, -95, var13, var14);
                                    }
                                }
                                int var34 = var19 + 15;
                                if (class222.field3119) {
                                    int var35 = -256;
                                    if (~class38.field527 > -21) {
                                        var35 = -65536;
                                    }
                                    class339.field4345.method2422(var35, var33, -1, var34, 18127, "Fps:" + class38.field527);
                                    var34 += 15;
                                    Runtime var36 = Runtime.getRuntime();
                                    int var37 = (int) ((var36.totalMemory() - var36.freeMemory()) / 1024L);
                                    int var38 = -256;
                                    if (var37 > 98304) {
                                        if (class274.field3674) {
                                            class512.method3059((byte) -45);
                                            for (int var39 = 0; var39 < 10; ++var39) {
                                                System.gc();
                                            }
                                            var37 = (int) ((var36.totalMemory() + -var36.freeMemory()) / 1024L);
                                            if (~var37 < -65537) {
                                                class216.method1417("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.", (byte) -11, 4);
                                            }
                                        }
                                        var38 = -65536;
                                    }
                                    class339.field4345.method2422(var38, var33, -1, var34, 18127, "Mem:" + var37 + "k");
                                    var34 += 15;
                                    class339.field4345.method2422(-256, var33, -1, var34, 18127, "In:" + class441.field6045 + "B/s Out:" + class463.field6347 + "B/s");
                                    var34 += 15;
                                    int var40 = class96.field1401.method2179() / 1024;
                                    class339.field4345.method2422(~var40 >= -65537 ? -256 : -65536, var33, -1, var34, 18127, "Offheap:" + var40 + "k");
                                    var34 += 15;
                                    int var41 = 0;
                                    int var42 = 0;
                                    int var43 = 0;
                                    for (int var44 = 0; ~var44 > -38; ++var44) {
                                        if (class753.field10469[var44] != null) {
                                            var41 += class753.field10469[var44].method2278(91);
                                            var42 += class753.field10469[var44].method2268((byte) -127);
                                            var43 += class753.field10469[var44].method2274(0);
                                        }
                                    }
                                    int var45 = var43 * 100 / var41;
                                    int var46 = var42 * 10000 / var41;
                                    String var47 = "Cache:" + class670.method3836(-92, 2, true, (long) var46, 0) + "% (" + var45 + "%)";
                                    class140.field1926.method2422(-256, var33, -1, var34, 18127, var47);
                                    var34 += 12;
                                }
                                if (class289.field3794 > 0) {
                                    class140.field1926.method2422(-256, var33, -1, var34, 18127, "Particles: " + class213.field2998 + " / " + class289.field3794);
                                }
                                var34 += 12;
                                if (class617.field8783) {
                                    class140.field1926.method2422(-256, var33, -1, var34, 18127, "Polys: " + class96.field1401.method593() + " Models: " + class96.field1401.method2223());
                                    var34 += 12;
                                    class140.field1926.method2422(-256, var33, -1, var34, 18127, "Ls: " + class60.field823 + " La: " + class756.field10496 + " NPC: " + class244.field3395 + " Pl: " + class494.field6945);
                                    var34 += 12;
                                    class370.method2066((byte) 111);
                                }
                                class142.field1966[var17] = true;
                                continue;
                            }
                        }
                        if (~var12.field10039 == -1) {
                            if (~class209.field2974 == ~var12.field9930 && class96.field1401.method569()) {
                                class96.field1401.method574(var18, var19, var12.field9966, var12.field10011);
                            }
                            method3454(arg0, var29, -var12.field10014 + var19, var17, 109, var31, var12.field9998, var30, var18 - var12.field9971, arg9, var32);
                            if (var12.field9981 != null) {
                                method3454(var12.field9981, var29, -var12.field10014 + var19, var17, 69, var31, var12.field9998, var30, -var12.field9971 + var18, arg9, var32);
                            }
                            class14 var48 = (class14) class426.field5894.method1381(true, (long) var12.field9998);
                            if (var48 != null) {
                                class677.method3876(var48.field194, var17, 82, var19, var29, var32, var31, var30, var18);
                            }
                            if (class209.field2974 == var12.field9930 && class96.field1401.method569()) {
                                class96.field1401.method617();
                            }
                            class96.field1401.method2097(arg1, arg7, arg10, arg5);
                        }
                        if (class513.field7167[var17] || class575.field8125 > 1) {
                            if (~var12.field10039 == -4) {
                                if (~var22 != -1) {
                                    if (!var12.field9938) {
                                        class96.field1401.method2166(var18, var19, var12.field9966, var12.field10011, 16777215 & var12.field10069 | -(255 & var22) + 255 << 24, 1);
                                    } else {
                                        class96.field1401.method2194(var18, var19, var12.field9966, var12.field10011, 255 - (255 & var22) << 24 | var12.field10069 & 16777215, 1);
                                    }
                                } else if (var12.field9938) {
                                    class96.field1401.method2194(var18, var19, var12.field9966, var12.field10011, var12.field10069, 0);
                                } else {
                                    class96.field1401.method2166(var18, var19, var12.field9966, var12.field10011, var12.field10069, 0);
                                }
                                if (class264.field3595) {
                                    if (!arg9) {
                                        class345.method1982(var16, (byte) 125, var15, var14, var13);
                                    } else {
                                        class217.method1422(var15, var16, -102, var13, var14);
                                    }
                                }
                            } else if (var12.field10039 == 4) {
                                class400 var49 = var12.method4011(-5, class96.field1401);
                                if (var49 == null) {
                                    if (class469.field6405) {
                                        class116.method764(var12, -1176833464);
                                    }
                                } else {
                                    int var50 = var12.field10069;
                                    String var51 = var12.field10062;
                                    if (var12.field9953 != -1) {
                                        class544 var52 = class487.field6572.method3054(var12.field9953, (byte) -99);
                                        var51 = var52.field7672;
                                        if (var51 == null) {
                                            var51 = "null";
                                        }
                                        if ((~var52.field7626 == -2 || var12.field10017 != 1) && ~var12.field10017 != 0) {
                                            var51 = "<col=ff9040>" + var51 + "</col> x" + class719.method4035(var12.field10017, -10353);
                                        }
                                    }
                                    if (var12.field9984 != -1) {
                                        var51 = class312.method1824(var12.field9984, 2);
                                        if (var51 == null) {
                                            var51 = "";
                                        }
                                    }
                                    if (class240.field3352 == var12) {
                                        var51 = class138.field1867.method891(-2041650704, class369.field4721);
                                        var50 = var12.field10069;
                                    }
                                    if (class362.field4644) {
                                        class96.field1401.method2090(var18, var19, var12.field9966 + var18, var12.field10011 + var19);
                                    }
                                    var49.method2438(var12.field10096, var12.field9966, var12.field9990, (class571) null, var12.field9935, (int[]) null, var12.field9945, var50 | -(var22 & 255) + 255 << 24, var12.field10011, 0, -1, !var12.field9976 ? -1 : -(var22 & 255) + 255 << 24, var51, class209.field2979, var19, 0, var18);
                                    if (class362.field4644) {
                                        class96.field1401.method2097(arg1, arg7, arg10, arg5);
                                    }
                                    if (~var51.trim().length() < -1) {
                                        if (class362.field4644) {
                                            if (class264.field3595) {
                                                if (arg9) {
                                                    class217.method1422(var15, var16, -118, var13, var14);
                                                } else {
                                                    class345.method1982(var16, (byte) 125, var15, var14, var13);
                                                }
                                            }
                                        } else {
                                            class742 var53 = class564.method3368((byte) 127, class96.field1401, var12.field10070);
                                            int var54 = var53.method4133(var12.field9966, var51, -20, class209.field2979);
                                            int var55 = var53.method4136(var12.field9935, var12.field9966, (byte) -48, var51, class209.field2979);
                                            if (class264.field3595) {
                                                if (!arg9) {
                                                    class345.method1982(var19 + var55, (byte) 125, var18 + var54, var19, var18);
                                                } else {
                                                    class217.method1422(var18 + var54, var19 + var55, -96, var18, var19);
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (var12.field10039 == 5) {
                                if (~var12.field10094 <= -1) {
                                    var12.method4004(class533.field7474, -114, class128.field1758).method3558(class96.field1401, 0, var12.field9954 << 3, 0, var12.field9966, var18, var19, var12.field9955 << 3, var12.field10011, 23206);
                                } else {
                                    class21 var57;
                                    if (var12.field9953 != -1) {
                                        class635 var56 = var12.field9964 ? class473.field6483.field9257 : null;
                                        var57 = class487.field6572.method3046(var12.field10017, (byte) 108, var12.field10087, -16777216 | var12.field9960, var12.field10004, var12.field9953, var56, class96.field1401);
                                    } else if (~var12.field9984 != 0) {
                                        var57 = class515.method3069(class96.field1401, var12.field9984, -253);
                                    } else {
                                        var57 = var12.method4007(class96.field1401, (byte) -95);
                                    }
                                    if (var57 == null) {
                                        if (class469.field6405) {
                                            class116.method764(var12, -1176833464);
                                        }
                                    } else {
                                        int var58 = var57.method116();
                                        int var59 = var57.method108();
                                        int var60 = (~var12.field10069 == -1 ? 16777215 : var12.field10069 & 16777215) | -(var22 & 255) + 255 << 24;
                                        if (!var12.field9952) {
                                            if (~var12.field10069 == -1 && ~var22 == -1) {
                                                if (var12.field9951 != 0) {
                                                    var57.method112((float) var12.field9966 / 2.0F + (float) var18, (float) var12.field10011 / 2.0F + (float) var19, var12.field9966 * 4096 / var58, var12.field9951);
                                                } else if (var12.field9966 == var58 && ~var12.field10011 == ~var59) {
                                                    var57.method101(var18, var19);
                                                } else {
                                                    var57.method100(var18, var19, var12.field9966, var12.field10011);
                                                }
                                            } else if (var12.field9951 == 0) {
                                                if (~var12.field9966 == ~var58 && var12.field10011 == var59) {
                                                    var57.method104(var18, var19, 0, var60, 1);
                                                } else {
                                                    var57.method110(var18, var19, var12.field9966, var12.field10011, 0, var60, 1);
                                                }
                                            } else {
                                                var57.method122((float) var12.field9966 / 2.0F + (float) var18, (float) var12.field10011 / 2.0F + (float) var19, var12.field9966 * 4096 / var58, var12.field9951, 0, var60, 1);
                                            }
                                        } else {
                                            class96.field1401.method2090(var18, var19, var12.field9966 + var18, var12.field10011 + var19);
                                            if (~var12.field9951 == -1) {
                                                if (~var12.field10069 == -1 && var22 == 0) {
                                                    var57.method109(var18, var19, var12.field9966, var12.field10011);
                                                } else {
                                                    var57.method105(var18, var19, var12.field9966, var12.field10011, 0, var60, 1);
                                                }
                                            } else {
                                                int var61 = (-1 - -var58 + var12.field9966) / var58;
                                                int var62 = (-1 - -var59 + var12.field10011) / var59;
                                                for (int var63 = 0; var61 > var63; ++var63) {
                                                    for (int var64 = 0; var64 < var62; ++var64) {
                                                        if (var12.field10069 != 0) {
                                                            var57.method122((float) var58 / 2.0F + (float) (var58 * var63 + var18), (float) var59 / 2.0F + (float) (var59 * var64 + var19), 4096, var12.field9951, 0, var60, 1);
                                                        } else {
                                                            var57.method112((float) var58 / 2.0F + (float) (var18 - -(var58 * var63)), (float) var59 / 2.0F + (float) (var59 * var64 + var19), 4096, var12.field9951);
                                                        }
                                                    }
                                                }
                                            }
                                            class96.field1401.method2097(arg1, arg7, arg10, arg5);
                                        }
                                    }
                                }
                                if (class264.field3595) {
                                    if (!arg9) {
                                        class345.method1982(var16, (byte) 125, var15, var14, var13);
                                    } else {
                                        class217.method1422(var15, var16, -126, var13, var14);
                                    }
                                }
                            } else if (var12.field10039 != 6) {
                                if (var12.field10039 == 9) {
                                    int var84;
                                    int var85;
                                    int var86;
                                    int var87;
                                    if (var12.field10022) {
                                        var84 = var19;
                                        var85 = var18;
                                        var86 = var12.field10011 + var19;
                                        var87 = var12.field9966 + var18;
                                    } else {
                                        var87 = var12.field9966 + var18;
                                        var86 = var19;
                                        var85 = var18;
                                        var84 = var12.field10011 + var19;
                                    }
                                    if (var12.field9979 == 1) {
                                        class96.field1401.method2168(var85, var86, var87, var84, var12.field10069, 0);
                                    } else {
                                        class96.field1401.method2188(var85, var86, var87, var84, var12.field10069, var12.field9979, 0);
                                    }
                                    if (class264.field3595) {
                                        if (!arg9) {
                                            class345.method1982(var16, (byte) 125, var15, var14, var13);
                                        } else {
                                            class217.method1422(var15, var16, -110, var13, var14);
                                        }
                                    }
                                }
                            } else {
                                class555.method3303((byte) 28);
                                class283 var65 = null;
                                int var66 = 0;
                                if (var12.field9953 == -1) {
                                    if (~var12.field10038 != -6) {
                                        if (~var12.field10038 != -9 && ~var12.field10038 != -10) {
                                            if (var12.field9943 == -1) {
                                                var65 = var12.method3997(class473.field6483.field9257, class486.field6564, class544.field7653, -1, -1, -1, class274.field3684, class643.field9112, class554.field7826, class487.field6572, 0, 2048, class96.field1401, (class103) null);
                                                if (var65 == null && class469.field6405) {
                                                    class116.method764(var12, -1176833464);
                                                }
                                            } else {
                                                class103 var67 = class274.field3684.method1881((byte) -80, var12.field9943);
                                                var65 = var12.method3997(class473.field6483.field9257, class486.field6564, class544.field7653, var12.field9947, var12.field10040, -1, class274.field3684, class643.field9112, class554.field7826, class487.field6572, var12.field9970, 2048, class96.field1401, var67);
                                                if (var65 == null && class469.field6405) {
                                                    class116.method764(var12, -1176833464);
                                                }
                                            }
                                        } else {
                                            class344 var68 = class70.method444(var12.field9937, false, Integer.MIN_VALUE);
                                            class103 var69 = ~var12.field9943 != 0 ? class274.field3684.method1881((byte) -80, var12.field9943) : null;
                                            if (var68 != null) {
                                                class635 var70 = !var12.field9964 ? null : class473.field6483.field9257;
                                                var65 = var68.method1978(class96.field1401, var12.field9963, var12.field9970, 2048, var12.field10038 == 9, var69, var12.field9947, var12.field10040, false, var70);
                                            }
                                        }
                                    } else {
                                        int var71 = var12.field9937;
                                        if (var71 >= 0 && var71 < 2048) {
                                            class655 var72 = class40.field563[var71];
                                            class103 var73 = ~var12.field9943 == 0 ? null : class274.field3684.method1881((byte) -80, var12.field9943);
                                            if (var72 != null && (~class471.field6467 == ~var71 || ~class617.method3621(var72.field9272, (byte) 50) == ~var12.field9963)) {
                                                var65 = var72.field9257.method3691(class554.field7826, var73, -1, (int[]) null, 0, class544.field7653, var12.field10040, class274.field3684, class486.field6564, var12.field9970, 5, (class696[]) null, class96.field1401, class487.field6572, 0, 2048, 0, (class103) null, var12.field9947, class643.field9112, true);
                                            }
                                        }
                                    }
                                } else {
                                    class544 var74 = class487.field6572.method3054(var12.field9953, (byte) -99);
                                    if (var74 != null) {
                                        class544 var75 = var74.method3243(var12.field10017, true);
                                        class103 var76 = var12.field9943 != -1 ? class274.field3684.method1881((byte) -80, var12.field9943) : null;
                                        class635 var77 = var12.field9964 ? class473.field6483.field9257 : null;
                                        var65 = var75.method3242(1, class96.field1401, var77, var76, 2048, var12.field9947, -32342, var12.field10040, var12.field9970);
                                        if (var65 == null) {
                                            class116.method764(var12, -1176833464);
                                        } else {
                                            var66 = -var65.method1120() >> 1;
                                        }
                                    }
                                }
                                if (var65 != null) {
                                    int var78;
                                    if (var12.field9992 <= 0) {
                                        var78 = 512;
                                    } else {
                                        var78 = (var12.field9966 << 9) / var12.field9992;
                                    }
                                    int var79;
                                    if (~var12.field9942 < -1) {
                                        var79 = (var12.field10011 << 9) / var12.field9942;
                                    } else {
                                        var79 = 512;
                                    }
                                    int var80 = var12.field9966 / 2 + var18;
                                    int var81 = var12.field10011 / 2 + var19;
                                    if (!var12.field9961) {
                                        var80 += var12.field9949 * var78 >> 9;
                                        var81 += var12.field10029 * var79 >> 9;
                                    }
                                    class123.field1685.method860();
                                    class96.field1401.method2068(class123.field1685);
                                    class96.field1401.method2081(var80, var81, var78, var79);
                                    class96.field1401.method610();
                                    if (var12.field10007) {
                                        class96.field1401.method2148(false);
                                    }
                                    if (!var12.field9961) {
                                        int var82 = (var12.field9997 << 2) * class231.field3217[var12.field10050 << 3] >> 14;
                                        int var83 = (var12.field9997 << 2) * class231.field3218[var12.field10050 << 3] >> 14;
                                        class383.field5374.method846(-var12.field10064 << 3);
                                        class383.field5374.method873(var12.field10102 << 3);
                                        class383.field5374.method851(var12.field10067 << 2, (var12.field9978 << 2) + var66 + var82, var83 - -(var12.field9978 << 2));
                                        class383.field5374.method844(var12.field10050 << 3);
                                    } else {
                                        class383.field5374.method843(var12.field10050);
                                        class383.field5374.method873(var12.field10102);
                                        class383.field5374.method847(var12.field10064);
                                        class383.field5374.method851(var12.field9949, var12.field10029, var12.field9965);
                                    }
                                    var12.method4001(var65, class383.field5374, class96.field1401, true, class245.field3409);
                                    if (class362.field4644) {
                                        class96.field1401.method2090(var18, var19, var18 - -var12.field9966, var12.field10011 + var19);
                                    }
                                    if (!var12.field9961) {
                                        if (!var12.field10057) {
                                            var65.method1168(class383.field5374, (class247) null, 1);
                                            if (var12.field10053 != null) {
                                                class96.field1401.method2122(var12.field10053.method1335());
                                            }
                                        } else {
                                            var65.method1164(class383.field5374, (class247) null, var12.field9997 << 2, 1);
                                        }
                                    } else if (!var12.field10057) {
                                        var65.method1168(class383.field5374, (class247) null, 1);
                                        if (var12.field10053 != null) {
                                            class96.field1401.method2122(var12.field10053.method1335());
                                        }
                                    } else {
                                        var65.method1164(class383.field5374, (class247) null, var12.field9997, 1);
                                    }
                                    if (class362.field4644) {
                                        class96.field1401.method2097(arg1, arg7, arg10, arg5);
                                    }
                                    if (var12.field10007) {
                                        class96.field1401.method2148(true);
                                    }
                                }
                                if (class264.field3595) {
                                    if (arg9) {
                                        class217.method1422(var15, var16, -117, var13, var14);
                                    } else {
                                        class345.method1982(var16, (byte) 125, var15, var14, var13);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg4 < 21) {
            field8292 = -116;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(B[I)V")
    public final void method3455(byte arg0, int[] arg1) {
        this.field8297 = new class311(arg1);
        ++field8303;
        if (arg0 != 75) {
            field8292 = -67;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "([[BI[BB[II[I[[B)I")
    public static final int method3456(byte[][] arg0, int arg1, byte[] arg2, byte arg3, int[] arg4, int arg5, int[] arg6, byte[][] arg7) {
        if (arg3 >= -127) {
            field8292 = 71;
        }
        ++field8296;
        int var8 = arg6[arg1];
        int var9 = var8 - -arg4[arg1];
        int var10 = arg6[arg5];
        int var11 = arg4[arg5] + var10;
        int var12 = var8;
        if (var8 < var10) {
            var12 = var10;
        }
        int var13 = var9;
        if (~var9 < ~var11) {
            var13 = var11;
        }
        int var14 = 255 & arg2[arg1];
        if (~(255 & arg2[arg5]) > ~var14) {
            var14 = 255 & arg2[arg5];
        }
        byte[] var15 = arg7[arg1];
        byte[] var16 = arg0[arg5];
        int var17 = -var8 + var12;
        int var18 = var12 - var10;
        for (int var19 = var12; ~var19 > ~var13; ++var19) {
            int var20 = var16[var18++] + var15[var17++];
            if (var20 < var14) {
                var14 = var20;
            }
        }
        return -var14;
    }

    @OriginalMember(owner = "client!wn", name = "h", descriptor = "(BI)V")
    public final void method3457(byte arg0, int arg1) {
        if (arg0 != 0) {
            this.method3459((class311) null, -93);
        }
        ++field8302;
        super.field279[super.field330++] = (byte) (arg1 + this.field8297.method1817((byte) 119));
    }

    @OriginalMember(owner = "client!wn", name = "k", descriptor = "(B)V")
    public final void method3458(byte arg0) {
        super.field330 = (this.field8290 + 7) / 8;
        if (arg0 == 53) {
            ++field8298;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lhaa;I)V")
    public final void method3459(class311 arg0, int arg1) {
        this.field8297 = arg0;
        ++field8300;
        if (arg1 < 26) {
            this.method3467(59, -39);
        }
    }

    @OriginalMember(owner = "client!wn", name = "k", descriptor = "(II)I")
    public final int method3460(int arg0, int arg1) {
        int var3 = 4 / ((arg1 - 47) / 35);
        ++field8305;
        return arg0 * 8 - this.field8290;
    }

    @OriginalMember(owner = "client!wn", name = "w", descriptor = "(I)I")
    public final int method3461(int arg0) {
        ++field8307;
        int var2 = 255 & super.field279[super.field330++] + -this.field8297.method1817((byte) 108);
        if (var2 < 128) {
            return var2;
        } else {
            if (arg0 >= -31) {
                this.method3463(-127);
            }
            return (255 & super.field279[super.field330++] + -this.field8297.method1817((byte) -20)) + (var2 + -128 << 8);
        }
    }

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(II[BI)V")
    public final void method3462(int arg0, int arg1, byte[] arg2, int arg3) {
        ++field8299;
        for (int var5 = arg1; ~var5 > ~arg3; ++var5) {
            arg2[arg0 + var5] = (byte) (super.field279[super.field330++] + -this.field8297.method1817((byte) 107));
        }
    }

    @OriginalMember(owner = "client!wn", name = "x", descriptor = "(I)Z")
    public final boolean method3463(int arg0) {
        ++field8291;
        int var2 = super.field279[super.field330] - this.field8297.method1816((byte) 46) & 255;
        if (arg0 <= 29) {
            return true;
        } else {
            return var2 >= 128;
        }
    }

    @OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(I)V")
    public class583(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!wn", name = "y", descriptor = "(I)V")
    public final void method3464(int arg0) {
        this.field8290 = super.field330 * arg0;
        ++field8293;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(B[B)V")
    public static final void method3465(byte arg0, byte[] arg1) {
        int var2 = 86 % ((arg0 - 53) / 61);
        ++field8308;
        class26 var3 = new class26(arg1);
        while (true) {
            while (true) {
                while (true) {
                    int var4 = var3.method194((byte) 119);
                    if (~var4 == -1) {
                        return;
                    }
                    if (~var4 != -2) {
                        if (var4 == 4) {
                            int var5 = var3.method194((byte) 119);
                            class673.field9458 = new int[var5];
                            for (int var6 = 0; var6 < var5; ++var6) {
                                class673.field9458[var6] = var3.method193(2);
                                if (class673.field9458[var6] == 65535) {
                                    class673.field9458[var6] = -1;
                                }
                            }
                        } else if (~var4 == -6) {
                            int var7 = var3.method194((byte) 119);
                            class13.field191 = new int[var7];
                            for (int var8 = 0; ~var7 < ~var8; ++var8) {
                                class13.field191[var8] = var3.method193(2);
                                if (~class13.field191[var8] == -65536) {
                                    class13.field191[var8] = -1;
                                }
                            }
                        }
                    } else {
                        int[] var9 = class422.field5850 = new int[6];
                        var9[0] = var3.method193(2);
                        var9[1] = var3.method193(2);
                        var9[2] = var3.method193(2);
                        var9[3] = var3.method193(2);
                        var9[4] = var3.method193(2);
                        var9[5] = var3.method193(2);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wn", name = "l", descriptor = "(B)V")
    public static final void method3466(byte arg0) {
        class592.field8538.method1385((byte) -97);
        if (arg0 >= 116) {
            ++field8295;
        }
    }

    @OriginalMember(owner = "client!wn", name = "l", descriptor = "(II)I")
    public final int method3467(int arg0, int arg1) {
        ++field8294;
        int var3 = this.field8290 >> 3;
        int var4 = 8 - (7 & this.field8290);
        this.field8290 += arg1;
        int var5 = 0;
        int var6 = 58 / ((47 - arg0) / 32);
        while (~arg1 < ~var4) {
            var5 += (class661.field9319[var4] & super.field279[var3++]) << -var4 + arg1;
            arg1 -= var4;
            var4 = 8;
        }
        int var7;
        if (arg1 == var4) {
            var7 = (super.field279[var3] & class661.field9319[var4]) + var5;
        } else {
            var7 = (super.field279[var3] >> var4 - arg1 & class661.field9319[arg1]) + var5;
        }
        return var7;
    }

    @OriginalMember(owner = "client!wn", name = "h", descriptor = "(Z)V")
    public static void method3468(boolean arg0) {
        field8289 = null;
        if (arg0) {
            field8292 = 43;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIIIIILjm;ILha;III)V")
    public static final void method3469(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class6 arg6, int arg7, class545 arg8, int arg9, int arg10, int arg11) {
        if (arg10 > arg2 && ~arg10 > ~(arg2 - -arg4) && ~(arg1 + -13) > ~arg11 && ~(arg1 - -3) < ~arg11 && arg6.field55) {
            arg3 = arg9;
        }
        ++field8306;
        int[] var12 = null;
        if (class50.method341(-83, arg6.field60)) {
            var12 = class487.field6572.method3054((int) arg6.field47, (byte) -99).field7666;
        } else if (~arg6.field52 == 0) {
            if (class462.method2765((byte) 94, arg6.field60)) {
                class15 var13 = (class15) class403.field5587.method1381(true, (long) ((int) arg6.field47));
                if (var13 != null) {
                    class55 var14 = var13.field204;
                    class11 var15 = var14.field771;
                    if (var15.field111 != null) {
                        var15 = var15.method55((byte) 118, class554.field7826);
                    }
                    if (var15 != null) {
                        var12 = var15.field162;
                    }
                }
            } else if (class464.method2770(arg6.field60, -46)) {
                Object var16 = null;
                class30 var17;
                if (arg6.field60 != 1001) {
                    var17 = class264.field3604.method3188((int) (2147483647L & arg6.field47 >>> 32), (byte) -57);
                } else {
                    var17 = class264.field3604.method3188((int) arg6.field47, (byte) -57);
                }
                if (var17.field455 != null) {
                    var17 = var17.method219(-1, class554.field7826);
                }
                if (var17 != null) {
                    var12 = var17.field453;
                }
            }
        } else {
            var12 = class487.field6572.method3054(arg6.field52, (byte) -99).field7666;
        }
        String var18 = class159.method995(arg0 + 86, arg6);
        if (var12 != null) {
            var18 = var18 + class278.method1672(var12, (byte) 89);
        }
        class743.field10354.method2437(arg0, arg2 + 3, var18, class298.field3904, arg1, -122, arg3, class200.field2888);
        if (arg6.field46) {
            class575.field8113.method101(arg2 - (-5 - class514.field7181.method4134((byte) -97, var18)), arg1 + -12);
        }
    }
}
