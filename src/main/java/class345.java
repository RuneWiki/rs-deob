import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hda")
public class class345 extends class530 {

    @OriginalMember(owner = "client!hda", name = "j", descriptor = "Ljf;")
    public static class640 field4396 = new class640(3, 7);

    @OriginalMember(owner = "client!hda", name = "q", descriptor = "Z")
    public static volatile boolean field4403 = true;

    @OriginalMember(owner = "client!hda", name = "g", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!hda", name = "h", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!hda", name = "i", descriptor = "I")
    public static int field4395;

    @OriginalMember(owner = "client!hda", name = "k", descriptor = "I")
    public static int field4397;

    @OriginalMember(owner = "client!hda", name = "l", descriptor = "I")
    public static int field4398;

    @OriginalMember(owner = "client!hda", name = "m", descriptor = "I")
    public static int field4399;

    @OriginalMember(owner = "client!hda", name = "n", descriptor = "I")
    public static int field4400;

    @OriginalMember(owner = "client!hda", name = "o", descriptor = "I")
    public static int field4401;

    @OriginalMember(owner = "client!hda", name = "p", descriptor = "I")
    public static int field4402;

    @OriginalMember(owner = "client!hda", name = "b", descriptor = "(I)I")
    public final int method1979(int arg0) {
        ++field4395;
        return arg0 != 0 ? 63 : super.field7419;
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(IIIZIII)V")
    public static final void method1980(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        ++field4394;
        int var7 = class147.field2030;
        int[] var8 = class351.field4456;
        class591.field8486 = 0;
        for (int var9 = 0; class676.field9533 + var7 > var9; ++var9) {
            class11 var37 = null;
            class584 var38;
            if (~var7 < ~var9) {
                var38 = class40.field563[var8[var9]];
            } else {
                var38 = ((class15) class403.field5587.method1381(true, (long) class731.field10231[var9 - var7])).field204;
                var37 = ((class55) var38).field771;
                if (var37.field111 != null) {
                    var37 = var37.method55((byte) 118, class554.field7826);
                    if (var37 == null) {
                        continue;
                    }
                }
            }
            if (var38.field8383 >= 0 && (class54.field757 == var38.field8370 || ~class473.field6483.field9501 == ~var38.field9501)) {
                class486.method2847(-91, arg5, var38, arg6 >> 1, arg0, var38.method374(0), arg4 >> 1);
                if (class161.field2235[0] >= 0) {
                    if (var38.field8314 != null && (var9 >= var7 || ~class431.field5933 == -1 || ~class431.field5933 == -4 || class431.field5933 == 1 && class161.method1008(((class655) var38).field9272, -107)) && ~class591.field8486 > ~class222.field3125) {
                        class222.field3120[class591.field8486] = class514.field7181.method4134((byte) 57, var38.field8314) / 2;
                        class222.field3124[class591.field8486] = class161.field2235[0];
                        class222.field3117[class591.field8486] = class161.field2235[1];
                        class222.field3122[class591.field8486] = var38.field8346;
                        class222.field3121[class591.field8486] = var38.field8351;
                        class222.field3126[class591.field8486] = var38.field8338;
                        class222.field3118[class591.field8486] = var38.field8314;
                        ++class591.field8486;
                    }
                    int var39 = arg2 - -class161.field2235[1];
                    int var50;
                    if (!var38.field8312 && ~class245.field3409 > ~var38.field8341) {
                        boolean var40 = true;
                        byte var41 = 1;
                        int var42;
                        if (~var9 <= ~var7) {
                            var42 = var37.field124;
                            if (~var42 == 0) {
                                var42 = var38.method3482(0).field8526;
                            }
                        } else {
                            class655 var43 = class40.field563[var8[var9]];
                            var42 = var38.method3482(0).field8526;
                            if (var43.field9264) {
                                var41 = 2;
                            }
                        }
                        class21[] var44 = class631.field8998;
                        if (~var42 != 0) {
                            class21[] var45 = (class21[]) class713.field10114.method3200((long) var42, -19983);
                            if (var45 == null) {
                                class320[] var46 = class320.method1860(class323.field4156, var42, 0);
                                if (var46 != null) {
                                    var45 = new class21[var46.length];
                                    for (int var47 = 0; var46.length > var47; ++var47) {
                                        var45[var47] = class96.field1401.method2126(var46[var47], true);
                                    }
                                    class713.field10114.method3199((byte) 78, var45, (long) var42);
                                }
                            }
                            if (var45 != null && ~var45.length <= -3) {
                                var44 = var45;
                            }
                        }
                        if (~var41 <= ~var44.length) {
                            var41 = 1;
                        }
                        class21 var48 = var44[0];
                        class21 var49 = var44[var41];
                        var50 = var39 - Math.max(class514.field7181.field10332, var48.method117());
                        int var51 = arg1 - (-class161.field2235[0] - -(var48.method115() >> 1));
                        int var52 = var48.method115() * var38.field8329 / 255;
                        int var53 = var48.method117();
                        if (var38.field8329 > 0 && ~var52 > -3) {
                            var52 = 2;
                        }
                        var48.method101(var51, var50);
                        class96.field1401.method2090(var51, var50, var51 + var52, var50 + var53);
                        var49.method101(var51, var50);
                        class96.field1401.method2097(arg1, arg2, arg1 - -arg4, arg2 + arg6);
                        class217.method1422(var48.method116() + var51, var50 + var53, -115, var51, var50);
                    } else {
                        var50 = var39 - Math.max(class514.field7181.field10332, class631.field8998[0].method117());
                    }
                    var50 -= 2;
                    if (!var38.field8312) {
                        if (var38.field8374 > class245.field3409) {
                            class21 var54 = class585.field8423[!var38.field8324 ? 0 : 2];
                            class21 var55 = class585.field8423[!var38.field8324 ? 1 : 3];
                            boolean var56 = true;
                            int var57;
                            if (!(var38 instanceof class55)) {
                                var57 = var38.method3482(0).field8527;
                            } else {
                                var57 = var37.field115;
                                if (var57 == -1) {
                                    var57 = var38.method3482(0).field8527;
                                }
                            }
                            if (var57 != -1) {
                                class21[] var58 = (class21[]) class331.field4251.method3200((long) var57, -19983);
                                if (var58 == null) {
                                    class320[] var59 = class320.method1860(class323.field4156, var57, 0);
                                    if (var59 != null) {
                                        var58 = new class21[var59.length];
                                        for (int var60 = 0; var59.length > var60; ++var60) {
                                            var58[var60] = class96.field1401.method2126(var59[var60], true);
                                        }
                                        class331.field4251.method3199((byte) 78, var58, (long) var57);
                                    }
                                }
                                if (var58 != null && ~var58.length == -5) {
                                    var55 = var58[var38.field8324 ? 3 : 1];
                                    var54 = var58[var38.field8324 ? 2 : 0];
                                }
                            }
                            int var61 = -class245.field3409 + var38.field8374;
                            int var62;
                            if (~var38.field8365 <= ~var61) {
                                var62 = var54.method115();
                            } else {
                                int var63 = var61 - var38.field8365;
                                int var64 = ~var38.field8340 != -1 ? (var38.field8404 - var63) / var38.field8340 * var38.field8340 : 0;
                                var62 = var54.method115() * var64 / var38.field8404;
                            }
                            int var65 = var54.method117();
                            var50 -= var65;
                            int var66 = arg1 + (class161.field2235[0] - (var54.method115() >> 1));
                            var54.method101(var66, var50);
                            class96.field1401.method2090(var66, var50, var66 - -var62, var50 - -var65);
                            var55.method101(var66, var50);
                            class96.field1401.method2097(arg1, arg2, arg1 + arg4, arg2 + arg6);
                            class217.method1422(var54.method116() + var66, var50 + var65, -97, var66, var50);
                            var50 -= 2;
                        }
                        if (var7 <= var9) {
                            if (~var37.field96 <= -1 && var37.field96 < class604.field8629.length) {
                                var50 -= 25;
                                class21 var67 = class604.field8629[var37.field96];
                                var67.method101(class161.field2235[0] + arg1 + -(var67.method115() >> 1), var50);
                                class217.method1422(class161.field2235[0] + arg1 + -(var67.method115() >> 1) + var67.method116(), var50 - -var67.method108(), -93, arg1 - (-class161.field2235[0] - -(var67.method115() >> 1)), var50);
                                var50 -= 2;
                            }
                        } else {
                            class655 var68 = (class655) var38;
                            if (~var68.field9259 != 0) {
                                var50 -= 25;
                                class21 var69 = class175.field2385[var68.field9259];
                                var69.method101(class161.field2235[0] + arg1 + -12, var50);
                                class217.method1422(class161.field2235[0] + -12 + arg1 + var69.method116(), var50 + var69.method108(), -105, arg1 - -class161.field2235[0] - 12, var50);
                                var50 -= 2;
                            }
                            if (~var68.field9238 != 0) {
                                var50 -= 25;
                                class21 var70 = class604.field8629[var68.field9238];
                                var70.method101(class161.field2235[0] + -12 + arg1, var50);
                                class217.method1422(arg1 + -12 - (-class161.field2235[0] - var70.method116()), var50 + var70.method108(), -102, class161.field2235[0] + -12 + arg1, var50);
                                var50 -= 2;
                            }
                        }
                    }
                    int var10000;
                    if (var38 instanceof class655) {
                        if (~var9 <= -1) {
                            int var71 = 0;
                            class729[] var72 = class349.field4441;
                            for (int var73 = 0; var73 < var72.length; ++var73) {
                                class729 var75 = var72[var73];
                                if (var75 != null && var75.field10216 == 10 && var8[var9] == var75.field10224) {
                                    class21 var76 = class370.field4731[var75.field10215];
                                    if (var71 < var76.method117()) {
                                        var71 = var76.method117();
                                    }
                                    var76.method101(class161.field2235[0] + arg1 + -12, -var76.method117() + var50);
                                    class217.method1422(-12 + arg1 + (class161.field2235[0] - -var76.method116()), -var76.method117() + (var50 - -var76.method108()), -108, class161.field2235[0] + arg1 + -12, -var76.method117() + var50);
                                }
                            }
                            if (~var71 < -1) {
                                var10000 = var50 - (var71 + 2);
                            }
                        }
                    } else {
                        int var77 = 0;
                        class729[] var78 = class349.field4441;
                        for (int var79 = 0; var79 < var78.length; ++var79) {
                            class729 var84 = var78[var79];
                            if (var84 != null && ~var84.field10216 == -2 && class731.field10231[-var7 + var9] == var84.field10224) {
                                class21 var85 = class370.field4731[var84.field10215];
                                if (var85.method117() > var77) {
                                    var77 = var85.method117();
                                }
                                if (class245.field3409 % 20 < 10) {
                                    var85.method101(class161.field2235[0] + arg1 - 12, var50 - var85.method117());
                                    class217.method1422(arg1 + -12 - (-class161.field2235[0] - var85.method116()), var50 + -var85.method117() + var85.method108(), -115, class161.field2235[0] + arg1 + -12, -var85.method117() + var50);
                                }
                            }
                        }
                        if (var77 > 0) {
                            var10000 = var50 - (var77 + 2);
                        }
                    }
                    for (int var81 = 0; var81 < 4; ++var81) {
                        if (~var38.field8396[var81] < ~class245.field3409) {
                            int var82 = var38.method374(0) / 2;
                            class486.method2847(-95, arg5, var38, arg6 >> 1, arg0, var82, arg4 >> 1);
                            if (class161.field2235[0] > -1) {
                                int var83 = class405.field5621[var38.field8380[var81]].method115();
                                if (var81 == 1) {
                                    class161.field2235[1] -= 20;
                                }
                                if (var81 == 2) {
                                    class161.field2235[1] -= 10;
                                    class161.field2235[0] -= var83 + -9;
                                }
                                if (~var81 == -4) {
                                    class161.field2235[1] -= 10;
                                    class161.field2235[0] += var83 + -9;
                                }
                                class405.field5621[var38.field8380[var81]].method101(arg1 - -class161.field2235[0] + -(var83 >> 1), class161.field2235[1] + -12 + arg2);
                                class140.field1926.method2434(class161.field2235[0] + arg1 + -1, -1, Integer.toString(var38.field8382[var81]), true, 0, arg2 + 3 - -class161.field2235[1]);
                            }
                        }
                    }
                }
            }
        }
        for (int var10 = 0; ~var10 > ~class314.field4056; ++var10) {
            int var33 = class32.field481[var10];
            class584 var34;
            if (~var33 > -2049) {
                var34 = class40.field563[var33];
            } else {
                var34 = ((class15) class403.field5587.method1381(true, (long) (var33 + -2048))).field204;
            }
            int var35 = class449.field6171[var10];
            class584 var36;
            if (var35 >= 2048) {
                var36 = ((class15) class403.field5587.method1381(true, (long) (var35 - 2048))).field204;
            } else {
                var36 = class40.field563[var35];
            }
            class757.method4204(var36, arg3, --var34.field8389, arg4, var34, arg1, arg6, arg2, arg5, arg0);
        }
        if (arg3) {
            method1982(34, (byte) -101, 89, 25, -38);
        }
        int var11 = class514.field7181.field10338 + class514.field7181.field10332 + 2;
        for (int var12 = 0; class591.field8486 > var12; ++var12) {
            int var13 = class222.field3124[var12];
            int var14 = class222.field3117[var12];
            int var15 = class222.field3120[var12];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var32 = 0; var12 > var32; ++var32) {
                    if (~(class222.field3117[var32] + -var11) > ~(var14 + 2) && ~(class222.field3117[var32] + 2) < ~(-var11 + var14) && ~(-var15 + var13) > ~(class222.field3124[var32] + class222.field3120[var32]) && var13 + var15 > class222.field3124[var32] - class222.field3120[var32] && ~(class222.field3117[var32] + -var11) > ~var14) {
                        var14 = class222.field3117[var32] + -var11;
                        var16 = true;
                    }
                }
            }
            class222.field3117[var12] = var14;
            String var17 = class222.field3118[var12];
            int var18 = class514.field7181.method4134((byte) 73, var17);
            int var19 = arg1 - -var13;
            int var20 = arg2 + var14 + -class514.field7181.field10332;
            int var21 = var18 + var19;
            int var22 = arg2 + var14 + class514.field7181.field10338;
            if (class577.field8261 == 0) {
                int var23 = 16776960;
                if (~class222.field3122[var12] > -7) {
                    var23 = class202.field2914[class222.field3122[var12]];
                }
                if (~class222.field3122[var12] == -7) {
                    var23 = ~(class54.field757 % 20) <= -11 ? 16776960 : 16711680;
                }
                if (class222.field3122[var12] == 7) {
                    var23 = class54.field757 % 20 >= 10 ? 65535 : 255;
                }
                if (~class222.field3122[var12] == -9) {
                    var23 = class54.field757 % 20 < 10 ? 45056 : 8454016;
                }
                if (~class222.field3122[var12] == -10) {
                    int var24 = -class222.field3126[var12] + 150;
                    if (var24 < 50) {
                        var23 = var24 * 1280 + 16711680;
                    } else if (~var24 <= -101) {
                        if (var24 < 150) {
                            var23 = 65280 - -((var24 + -100) * 5);
                        }
                    } else {
                        var23 = 16776960 - (var24 * 327680 - 16384000);
                    }
                }
                if (~class222.field3122[var12] == -11) {
                    int var25 = 150 - class222.field3126[var12];
                    if (~var25 <= -51) {
                        if (~var25 > -101) {
                            var23 = -(var25 * 327680) - -16384000 + 16711935;
                        } else if (~var25 > -151) {
                            var23 = (var25 + -100) * 327680 + 255 + -((var25 + -100) * 5);
                        }
                    } else {
                        var23 = var25 * 5 + 16711680;
                    }
                }
                if (~class222.field3122[var12] == -12) {
                    int var26 = -class222.field3126[var12] + 150;
                    if (~var26 <= -51) {
                        if (var26 >= 100) {
                            if (var26 < 150) {
                                var23 = -(var26 * 327680) + 49545215;
                            }
                        } else {
                            var23 = (var26 + -50) * 327685 + 65280;
                        }
                    } else {
                        var23 = 16777215 - var26 * 327685;
                    }
                }
                int var27 = -16777216 | var23;
                if (~class222.field3121[var12] == -1) {
                    var21 -= var18 >> 1;
                    class743.field10354.method2434(arg1 + var13, var27, var17, true, -16777216, arg2 + var14);
                    var19 -= var18 >> 1;
                }
                if (~class222.field3121[var12] == -2) {
                    var22 += 5;
                    var20 -= 5;
                    var19 -= var18 >> 1;
                    var21 -= var18 >> 1;
                    class743.field10354.method2424(-16777216, var17, arg2 + var14, class54.field757, arg1 + var13, -19398, var27);
                }
                if (class222.field3121[var12] == 2) {
                    var19 -= (var18 >> 1) + 5;
                    var21 -= (var18 >> 1) + -5;
                    var20 -= 5;
                    var22 += 5;
                    class743.field10354.method2432(-86, class54.field757, arg1 - -var13, var17, -16777216, var27, arg2 - -var14);
                }
                if (class222.field3121[var12] == 3) {
                    var21 -= var18 >> 1;
                    class743.field10354.method2425(-class222.field3126[var12] + 150, arg2 + var14, -16777216, class54.field757, var27, arg1 + var13, var17, true);
                    var20 -= 7;
                    var19 -= var18 >> 1;
                    var22 += 7;
                }
                if (class222.field3121[var12] == 4) {
                    int var28 = (-class222.field3126[var12] + 150) * (100 + class514.field7181.method4134((byte) 66, var17)) / 150;
                    class96.field1401.method2090(arg1 + var13 + -50, arg2, arg1 + 50 - -var13, arg2 + arg6);
                    class743.field10354.method2427(648, arg1 + var13 + 50 + -var28, var17, arg2 - -var14, var27, -16777216);
                    var21 += 50 - var28;
                    var19 += 50 - var28;
                    class96.field1401.method2097(arg1, arg2, arg1 + arg4, arg2 + arg6);
                }
                if (class222.field3121[var12] == 5) {
                    int var29 = 150 - class222.field3126[var12];
                    int var30 = 0;
                    if (var29 >= 25) {
                        if (~var29 < -126) {
                            var30 = var29 - 125;
                        }
                    } else {
                        var30 = var29 + -25;
                    }
                    int var31 = class514.field7181.field10338 + class514.field7181.field10332;
                    class96.field1401.method2090(arg1, var14 + -1 + arg2 - var31, arg1 + arg4, arg2 + var14 - -5);
                    var20 += var30;
                    var19 -= var18 >> 1;
                    class743.field10354.method2434(arg1 + var13, var27, var17, true, -16777216, arg2 + var14 + var30);
                    var21 -= var18 >> 1;
                    var22 += var30;
                    class96.field1401.method2097(arg1, arg2, arg1 + arg4, arg2 + arg6);
                }
            } else {
                var21 -= var18 >> 1;
                var19 -= var18 >> 1;
                class743.field10354.method2434(arg1 + var13, -256, var17, true, -16777216, arg2 + var14);
            }
            class217.method1422(var21 - -1, var22 + 1, -101, var19, var20);
        }
    }

    @OriginalMember(owner = "client!hda", name = "c", descriptor = "(I)V")
    public static final void method1981(int arg0) {
        int var1 = 18 / ((arg0 - 22) / 35);
        ++field4401;
        for (int var2 = 0; var2 < 5; ++var2) {
            class400.field5549[var2] = false;
        }
        class374.field5167 = -1;
        class13.field180 = -1;
        class641.field9111 = 0;
        class590.field8466 = 0;
        class599.field8597 = -1;
        class665.field9377 = 1;
        class99.field1429 = -1;
    }

    @OriginalMember(owner = "client!hda", name = "<init>", descriptor = "(ILah;)V")
    public class345(int arg0, class374 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(II)I")
    public final int method75(int arg0, int arg1) {
        ++field4397;
        int var3 = 58 / ((arg1 - 63) / 60);
        return 1;
    }

    @OriginalMember(owner = "client!hda", name = "<init>", descriptor = "(Lah;)V")
    public class345(class374 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!hda", name = "b", descriptor = "(II)V")
    public final void method70(int arg0, int arg1) {
        ++field4399;
        if (arg1 >= -38) {
            method1982(-106, (byte) 78, -36, -119, 54);
        }
        super.field7419 = arg0;
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(Z)V")
    public final void method73(boolean arg0) {
        ++field4400;
        if (!arg0) {
            this.method70(16, 6);
        }
        if (super.field7419 < 0 || super.field7419 > 4) {
            super.field7419 = this.method74(0);
        }
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(IBIII)V")
    public static final void method1982(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 125) {
            field4396 = null;
        }
        ++field4402;
        int var5 = class418.field5806;
        if (var5 != 0) {
            if (~var5 != -2) {
                if (~var5 == -3) {
                    if (arg2 > class527.field7366) {
                        class527.field7366 = arg2;
                    }
                    if (~class535.field7504 < ~arg3) {
                        class535.field7504 = arg3;
                    }
                    if (~class589.field8464 < ~arg4) {
                        class589.field8464 = arg4;
                    }
                    if (class585.field8428 < arg0) {
                        class585.field8428 = arg0;
                    }
                }
            } else {
                class585.field8428 = arg0;
                class535.field7504 = arg3;
                class589.field8464 = arg4;
                class418.field5806 = 2;
                class527.field7366 = arg2;
            }
        }
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(BII)I")
    public static final int method1983(byte arg0, int arg1, int arg2) {
        if (arg0 >= -11) {
            return 49;
        } else {
            ++field4393;
            if (~arg2 > ~arg1) {
                int var3 = arg2;
                arg2 = arg1;
                arg1 = var3;
            }
            while (~arg1 != -1) {
                int var4 = arg2 % arg1;
                arg2 = arg1;
                arg1 = var4;
            }
            return arg2;
        }
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(I)I")
    public final int method74(int arg0) {
        ++field4398;
        if (arg0 != 0) {
            field4403 = false;
        }
        return 0;
    }

    @OriginalMember(owner = "client!hda", name = "d", descriptor = "(I)V")
    public static void method1984(int arg0) {
        int var1 = -74 / ((arg0 - 10) / 49);
        field4396 = null;
    }
}
