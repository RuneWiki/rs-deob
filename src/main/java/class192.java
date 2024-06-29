import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class192 extends class119 {

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "I")
    private int field2740;

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "I")
    private int field2741;

    @OriginalMember(owner = "client!tb", name = "x", descriptor = "I")
    private int field2750;

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "I")
    private int field2737;

    @OriginalMember(owner = "client!tb", name = "r", descriptor = "I")
    private int field2744;

    @OriginalMember(owner = "client!tb", name = "q", descriptor = "I")
    private int field2743;

    @OriginalMember(owner = "client!tb", name = "s", descriptor = "I")
    private int field2745;

    @OriginalMember(owner = "client!tb", name = "D", descriptor = "I")
    private int field2756;

    @OriginalMember(owner = "client!tb", name = "y", descriptor = "[Ljava/lang/String;")
    public static String[] field2751 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!tb", name = "B", descriptor = "I")
    public static int field2754 = 0;

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "I")
    public static int field2742;

    @OriginalMember(owner = "client!tb", name = "t", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!tb", name = "u", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!tb", name = "v", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!tb", name = "w", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!tb", name = "A", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!tb", name = "C", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!tb", name = "E", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "Lve;")
    public static class233 field2739;

    @OriginalMember(owner = "client!tb", name = "z", descriptor = "Z")
    public static boolean field2752;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(III)V")
    public final void method313(int arg0, int arg1, int arg2) {
        ++field2738;
        if (arg0 != -1) {
            method1233(27, -127, -61, -38, -23);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIII[Lha;ZIIII)V")
    public static final void method1231(int arg0, int arg1, int arg2, int arg3, class267[] arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg5) {
            field2752 = true;
        }
        class144.method950(arg9, arg8, arg6, arg7);
        class18.method150();
        for (int var10 = 0; ~var10 > ~arg4.length; ++var10) {
            class267 var11 = arg4[var10];
            if (var11 != null && (var11.field4139 == arg0 || ~arg0 == 1412584498 && class273.field4357 == var11)) {
                int var12;
                if (~arg2 == 0) {
                    class99.field1480[class220.field3252] = var11.field4173 + arg3;
                    class1.field4[class220.field3252] = var11.field4035 + arg1;
                    class263.field3964[class220.field3252] = var11.field4177;
                    class109.field1579[class220.field3252] = var11.field4051;
                    var12 = class220.field3252++;
                } else {
                    var12 = arg2;
                }
                var11.field4031 = class82.field1267;
                var11.field4061 = var12;
                if (!var11.field4039 || !client.method1428(var11)) {
                    if (var11.field4104 > 0) {
                        class276.method1860((byte) -27, var11);
                    }
                    int var13 = var11.field4173 + arg3;
                    int var14 = var11.field4035 - -arg1;
                    int var15 = var11.field4102;
                    if (class268.field4194 && (client.method1439(var11).field1395 != 0 || ~var11.field4149 == -1) && ~var15 < -128) {
                        var15 = 127;
                    }
                    if (class273.field4357 == var11) {
                        if (arg0 != -1412584499 && !var11.field4075) {
                            class275.field4409 = arg4;
                            class107.field1554 = arg1;
                            class45.field632 = arg3;
                            continue;
                        }
                        if (class114.field1632 && class70.field1091) {
                            int var16 = class190.field2688;
                            int var17 = var16 - class35.field504;
                            int var18 = class25.field345;
                            if (var17 < class142.field2060) {
                                var17 = class142.field2060;
                            }
                            int var19 = var18 - class123.field1786;
                            if (var11.field4051 + var17 > class142.field2060 + class219.field3231.field4051) {
                                var17 = -var11.field4051 + class219.field3231.field4051 + class142.field2060;
                            }
                            if (class32.field472 > var19) {
                                var19 = class32.field472;
                            }
                            var14 = var17;
                            if (var11.field4177 + var19 > class32.field472 - -class219.field3231.field4177) {
                                var19 = class32.field472 + class219.field3231.field4177 - var11.field4177;
                            }
                            var13 = var19;
                        }
                        if (!var11.field4075) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.field4149 == 2) {
                        var20 = arg8;
                        var21 = arg7;
                        var22 = arg9;
                        var23 = arg6;
                    } else {
                        var20 = ~arg8 > ~var14 ? var14 : arg8;
                        var22 = ~var13 >= ~arg9 ? arg9 : var13;
                        int var24 = var11.field4177 + var13;
                        int var25 = var11.field4051 + var14;
                        if (var11.field4149 == 9) {
                            ++var25;
                            ++var24;
                        }
                        var21 = ~var25 <= ~arg7 ? arg7 : var25;
                        var23 = arg6 > var24 ? var24 : arg6;
                    }
                    if (!var11.field4039 || var23 > var22 && ~var21 < ~var20) {
                        if (~var11.field4104 != -1) {
                            if (var11.field4104 == 1337) {
                                class213.field3060 = var13;
                                class21.field280 = var11;
                                class51.field748 = var14;
                                class162.method1088(var13, var11.field4051, 27773, var11.field4104 == 1403, var14, var11.field4177);
                                class144.method950(arg9, arg8, arg6, arg7);
                                continue;
                            }
                            if (var11.field4104 == 1338) {
                                if (!var11.method1780(0)) {
                                    continue;
                                }
                                class124.method836(var13, var14, var11, var12, !arg5);
                                class144.method950(arg9, arg8, arg6, arg7);
                                if (~class30.field423 != -1 && class30.field423 != 3 || class151.field2185 || ~class261.field3942 > ~var22 || ~class222.field3311 > ~var20 || ~class261.field3942 <= ~var23 || ~var21 >= ~class222.field3311) {
                                    continue;
                                }
                                int var26 = -var14 + class222.field3311;
                                int var27 = -var13 + class261.field3942;
                                int var28 = var11.field4163[var26];
                                if (~var28 < ~var27 || ~var27 < ~(var11.field4136[var26] + var28)) {
                                    continue;
                                }
                                int var29 = var26 - var11.field4051 / 2;
                                int var30 = var27 - var11.field4177 / 2;
                                int var31 = 2047 & class245.field3667 + class183.field2611;
                                int var32 = class18.field261[var31];
                                int var33 = (class282.field4495 + 256) * var32 >> 8;
                                int var34 = class18.field259[var31];
                                int var35 = (class282.field4495 + 256) * var34 >> 8;
                                int var36 = var29 * var35 + -(var30 * var33) >> 11;
                                int var37 = -var36 + class55.field847.field94 >> 7;
                                int var38 = var29 * var33 + var30 * var35 >> 11;
                                int var39 = class55.field847.field45 + var38 >> 7;
                                if (class275.field4406 && ~(64 & class136.field1970) != -1) {
                                    class267 var40 = class22.method165(class102.field1511, false, class172.field2462);
                                    if (var40 != null) {
                                        class180.method1167(class214.field3087, " ->", class255.field3866, var37, (short) 38, 1L, 126, var39);
                                    } else {
                                        class213.method1363(true);
                                    }
                                    continue;
                                }
                                if (~class69.field1076 == -2) {
                                    class180.method1167(class94.field1437, "", -1, var37, (short) 37, 1L, -117, var39);
                                }
                                class180.method1167(class189.field2682, "", -1, var37, (short) 17, 1L, 119, var39);
                                continue;
                            }
                            if (var11.field4104 == 1339) {
                                if (var11.method1780(0)) {
                                    class48.method315(var13, var11, var14, var12, -2319);
                                    class144.method950(arg9, arg8, arg6, arg7);
                                }
                                continue;
                            }
                            if (var11.field4104 == 1400) {
                                class160.method1073(var11.field4177, var13, var14, 9179409, var11.field4051);
                                class21.field278[var12] = true;
                                class119.field1753[var12] = true;
                                class144.method950(arg9, arg8, arg6, arg7);
                                continue;
                            }
                            if (~var11.field4104 == -1402) {
                                class234.method1541(30106, var14, var13, var11.field4051, var11.field4177);
                                class21.field278[var12] = true;
                                class119.field1753[var12] = true;
                                class144.method950(arg9, arg8, arg6, arg7);
                                continue;
                            }
                            if (var11.field4104 == 1402) {
                                class150.method1016(1425091048, var14, var13);
                                class21.field278[var12] = true;
                                class119.field1753[var12] = true;
                                continue;
                            }
                            if (var11.field4104 == 1405) {
                                if (!class246.field3676) {
                                    continue;
                                }
                                int var41 = var14 - -15;
                                int var42 = var11.field4177 + var13;
                                class258.field3914.method1282("Fps:" + class33.field483, var42, var41, 16776960, -1);
                                int var130 = var41 + 15;
                                Runtime var43 = Runtime.getRuntime();
                                int var44 = (int) ((var43.totalMemory() + -var43.freeMemory()) / 1024L);
                                int var45 = 0;
                                int var46 = 16776960;
                                if (~var44 < -65537) {
                                    var46 = 16711680;
                                }
                                int var47 = 0;
                                class258.field3914.method1282("Mem:" + var44 + "k", var42, var130, var46, -1);
                                int var48 = 0;
                                var41 = var130 + 15;
                                for (int var49 = 0; ~var49 > -29; ++var49) {
                                    var45 += class90.field1371[var49].method1393(-124);
                                    var47 += class90.field1371[var49].method1387(!arg5);
                                    var48 += class90.field1371[var49].method1392((byte) -100);
                                }
                                int var50 = 16776960;
                                int var51 = var47 * 10000 / var45;
                                int var52 = var48 * 100 / var45;
                                String var53 = "Cache:" + class197.method1258(true, (long) var51, 2, 0, (byte) 66) + "% (" + var52 + "%)";
                                class134.field1948.method1282(var53, var42, var41, var50, -1);
                                var41 += 12;
                                class21.field278[var12] = true;
                                class119.field1753[var12] = true;
                                continue;
                            }
                            if (var11.field4104 == 1406) {
                                class153.field2237 = var13;
                                class84.field1298 = var11;
                                class196.field2814 = var14;
                                continue;
                            }
                        }
                        if (!class151.field2185) {
                            if (~var11.field4149 == -1 && var11.field4049 && ~class261.field3942 <= ~var22 && ~class222.field3311 <= ~var20 && class261.field3942 < var23 && ~class222.field3311 > ~var21 && !class268.field4194) {
                                class187.field2665[0] = class275.field4416;
                                class283.field4508 = 1;
                                class86.field1330[0] = class233.field3503;
                                class69.field1087[0] = "";
                                class280.field4475[0] = 1006;
                            }
                            if (~var22 >= ~class261.field3942 && ~var20 >= ~class222.field3311 && class261.field3942 < var23 && ~class222.field3311 > ~var21) {
                                class15.method119(-var14 + class222.field3311, 97, -var13 + class261.field3942, var11);
                            }
                        }
                        if (var11.field4149 == 0) {
                            if (!var11.field4039 && client.method1428(var11) && class250.field3790 != var11) {
                                continue;
                            }
                            if (!var11.field4039) {
                                if (~var11.field4140 < ~(-var11.field4051 + var11.field4134)) {
                                    var11.field4140 = -var11.field4051 + var11.field4134;
                                }
                                if (~var11.field4140 > -1) {
                                    var11.field4140 = 0;
                                }
                            }
                            method1231(var11.field4113, var14 - var11.field4140, var12, -var11.field4059 + var13, arg4, false, var23, var21, var20, var22);
                            if (var11.field4160 != null) {
                                method1231(var11.field4113, var14 - var11.field4140, var12, var13 - var11.field4059, var11.field4160, false, var23, var21, var20, var22);
                            }
                            class261 var54 = (class261) class128.field1874.method1218((long) var11.field4113, -16);
                            if (var54 != null) {
                                if (var54.field3941 == 0 && !class151.field2185 && class261.field3942 >= var22 && ~var20 >= ~class222.field3311 && class261.field3942 < var23 && ~class222.field3311 > ~var21 && !class268.field4194) {
                                    class187.field2665[0] = class275.field4416;
                                    class86.field1330[0] = class233.field3503;
                                    class280.field4475[0] = 1006;
                                    class69.field1087[0] = "";
                                    class283.field4508 = 1;
                                }
                                class114.method795(false, var21, var54.field3940, var13, var12, var22, var20, var14, var23);
                            }
                            class144.method950(arg9, arg8, arg6, arg7);
                            class18.method150();
                        }
                        if (class86.field1334[var12] || ~class222.field3305 < -2) {
                            if (~var11.field4149 == -1 && !var11.field4039 && var11.field4051 < var11.field4134) {
                                class138.method929(120, var11.field4177 + var13, var11.field4051, var14, var11.field4140, var11.field4134);
                            }
                            if (~var11.field4149 != -2) {
                                if (~var11.field4149 == -3) {
                                    int var55 = 0;
                                    for (int var56 = 0; ~var11.field4105 < ~var56; ++var56) {
                                        for (int var57 = 0; ~var57 > ~var11.field4187; ++var57) {
                                            int var58 = (var11.field4106 + 32) * var56 + var14;
                                            int var59 = (var11.field4026 + 32) * var57 + var13;
                                            if (var55 < 20) {
                                                var58 += var11.field4179[var55];
                                                var59 += var11.field4122[var55];
                                            }
                                            if (~var11.field4107[var55] >= -1) {
                                                if (var11.field4174 != null && var55 < 20) {
                                                    class69 var60 = var11.method1781(var55, true);
                                                    if (var60 != null) {
                                                        var60.method470(var59, var58);
                                                    } else if (class119.field1752) {
                                                        class217.method1396(false, var11);
                                                    }
                                                }
                                            } else {
                                                boolean var61 = false;
                                                boolean var62 = false;
                                                int var63 = var11.field4107[var55] + -1;
                                                if (~arg9 > ~(var59 + 32) && ~arg6 < ~var59 && var58 + 32 > arg8 && var58 < arg7 || class16.field235 == var11 && class234.field3524 == var55) {
                                                    class69 var64;
                                                    if (class204.field2963 == 1 && class151.field2169 == var55 && ~class91.field1387 == ~var11.field4113) {
                                                        var64 = class107.method705(0, var11.field4172[var55], 2, var11.field4033, arg5, var63);
                                                    } else {
                                                        var64 = class107.method705(3153952, var11.field4172[var55], 1, var11.field4033, arg5, var63);
                                                    }
                                                    if (class18.field263) {
                                                        class21.field278[var12] = true;
                                                    }
                                                    if (var64 == null) {
                                                        class217.method1396(false, var11);
                                                    } else if (class16.field235 == var11 && class234.field3524 == var55) {
                                                        int var65 = -class57.field874 + class25.field345;
                                                        int var66 = -class262.field3947 + class190.field2688;
                                                        if (~var65 > -6 && var65 > -5) {
                                                            var65 = 0;
                                                        }
                                                        if (var66 < 5 && ~var66 < 4) {
                                                            var66 = 0;
                                                        }
                                                        if (~class213.field3055 > -6) {
                                                            var66 = 0;
                                                            var65 = 0;
                                                        }
                                                        var64.method468(var59 + var65, var58 + var66, 128);
                                                        if (~arg0 != 0) {
                                                            class267 var67 = arg4[arg0 & 65535];
                                                            int var68 = class144.field2067;
                                                            int var69 = class144.field2069;
                                                            if (var58 + var66 < var69 && var67.field4140 > 0) {
                                                                int var70 = (-var58 + var69 + -var66) * class38.field566 / 3;
                                                                if (~var70 < ~(class38.field566 * 10)) {
                                                                    var70 = class38.field566 * 10;
                                                                }
                                                                if (var70 > var67.field4140) {
                                                                    var70 = var67.field4140;
                                                                }
                                                                class262.field3947 += var70;
                                                                var67.field4140 -= var70;
                                                                class217.method1396(false, var67);
                                                            }
                                                            if (var68 < var58 + var66 - -32 && -var67.field4051 + var67.field4134 > var67.field4140) {
                                                                int var71 = (var58 + var66 + -var68 - -32) * class38.field566 / 3;
                                                                if (var71 > class38.field566 * 10) {
                                                                    var71 = class38.field566 * 10;
                                                                }
                                                                if (-var67.field4051 + var67.field4134 - var67.field4140 < var71) {
                                                                    var71 = -var67.field4051 + var67.field4134 + -var67.field4140;
                                                                }
                                                                class262.field3947 -= var71;
                                                                var67.field4140 += var71;
                                                                class217.method1396(false, var67);
                                                            }
                                                        }
                                                    } else if (class114.field1694 == var11 && ~class113.field1607 == ~var55) {
                                                        var64.method468(var59, var58, 128);
                                                    } else {
                                                        var64.method470(var59, var58);
                                                    }
                                                }
                                            }
                                            ++var55;
                                        }
                                    }
                                } else if (~var11.field4149 == -4) {
                                    int var72;
                                    if (!class283.method1903(var11, 67)) {
                                        var72 = var11.field4084;
                                        if (class250.field3790 == var11 && ~var11.field4053 != -1) {
                                            var72 = var11.field4053;
                                        }
                                    } else {
                                        var72 = var11.field4048;
                                        if (class250.field3790 == var11 && var11.field4184 != 0) {
                                            var72 = var11.field4184;
                                        }
                                    }
                                    if (~var15 == -1) {
                                        if (var11.field4109) {
                                            class144.method955(var13, var14, var11.field4177, var11.field4051, var72);
                                        } else {
                                            class144.method951(var13, var14, var11.field4177, var11.field4051, var72);
                                        }
                                    } else if (var11.field4109) {
                                        class144.method958(var13, var14, var11.field4177, var11.field4051, var72, -(255 & var15) + 256);
                                    } else {
                                        class144.method960(var13, var14, var11.field4177, var11.field4051, var72, -(255 & var15) + 256);
                                    }
                                } else if (~var11.field4149 == -5) {
                                    class198 var73 = var11.method1784(class158.field2290, (byte) 44);
                                    if (var73 == null) {
                                        if (class119.field1752) {
                                            class217.method1396(false, var11);
                                        }
                                    } else {
                                        String var74 = var11.field4156;
                                        int var75;
                                        if (class283.method1903(var11, 53)) {
                                            var75 = var11.field4048;
                                            if (class250.field3790 == var11 && var11.field4184 != 0) {
                                                var75 = var11.field4184;
                                            }
                                            if (~var11.field4091.length() < -1) {
                                                var74 = var11.field4091;
                                            }
                                        } else {
                                            var75 = var11.field4084;
                                            if (class250.field3790 == var11 && var11.field4053 != 0) {
                                                var75 = var11.field4053;
                                            }
                                        }
                                        if (var11.field4039 && var11.field4185 != -1) {
                                            class273 var76 = class259.method1735(var11.field4185, -14667);
                                            var74 = var76.field4375;
                                            if (var74 == null) {
                                                var74 = "null";
                                            }
                                            if ((~var76.field4387 == -2 || ~var11.field4100 != -2) && ~var11.field4100 != 0) {
                                                var74 = "<col=ff9040>" + var74 + "</col> x" + class227.method1485(-1, var11.field4100);
                                            }
                                        }
                                        if (class101.field1508 == var11) {
                                            var75 = var11.field4084;
                                            var74 = class235.field3541;
                                        }
                                        if (!var11.field4039) {
                                            var74 = class80.method537(var11, -76, var74);
                                        }
                                        var73.method1267(var74, var13, var14, var11.field4177, var11.field4051, var75, !var11.field4030 ? -1 : 0, var11.field4114, var11.field4047, var11.field4073);
                                    }
                                } else if (~var11.field4149 == -6) {
                                    if (!var11.field4039) {
                                        class69 var77 = var11.method1776(class283.method1903(var11, 74), true);
                                        if (var77 != null) {
                                            var77.method470(var13, var14);
                                        } else if (class119.field1752) {
                                            class217.method1396(arg5, var11);
                                        }
                                    } else {
                                        class69 var78;
                                        if (var11.field4185 == -1) {
                                            var78 = var11.method1776(false, !arg5);
                                        } else {
                                            var78 = class107.method705(var11.field4175, var11.field4100, var11.field4137, var11.field4033, false, var11.field4185);
                                        }
                                        if (var78 == null) {
                                            if (class119.field1752) {
                                                class217.method1396(arg5, var11);
                                            }
                                        } else {
                                            int var79 = var78.field1079;
                                            int var80 = var78.field1082;
                                            if (!var11.field4072) {
                                                int var81 = var11.field4177 * 4096 / var79;
                                                if (var11.field4071 == 0) {
                                                    if (var15 != 0) {
                                                        var78.method471(var13, var14, var11.field4177, var11.field4051, -(255 & var15) + 256);
                                                    } else if (~var11.field4177 == ~var79 && ~var11.field4051 == ~var80) {
                                                        var78.method470(var13, var14);
                                                    } else {
                                                        var78.method477(var13, var14, var11.field4177, var11.field4051);
                                                    }
                                                } else {
                                                    var78.method467(var13 - -(var11.field4177 / 2), var81, (byte) 32, var14 - -(var11.field4051 / 2), var11.field4071);
                                                }
                                            } else {
                                                int var82 = (var80 + -1 + var11.field4051) / var80;
                                                int var83 = (-1 - (-var79 - var11.field4177)) / var79;
                                                class144.method964(var13, var14, var11.field4177 + var13, var11.field4051 + var14);
                                                for (int var84 = 0; var83 > var84; ++var84) {
                                                    for (int var85 = 0; var82 > var85; ++var85) {
                                                        if (var11.field4071 != 0) {
                                                            var78.method467(var79 / 2 + var79 * var84 + var13, 4096, (byte) 32, var80 * var85 + var80 / 2 + var14, var11.field4071);
                                                        } else if (var15 == 0) {
                                                            var78.method470(var79 * var84 + var13, var80 * var85 + var14);
                                                        } else {
                                                            var78.method468(var13 - -(var79 * var84), var80 * var85 + var14, -(255 & var15) + 256);
                                                        }
                                                    }
                                                }
                                                class144.method950(arg9, arg8, arg6, arg7);
                                            }
                                        }
                                    }
                                } else if (~var11.field4149 == -7) {
                                    boolean var86 = class283.method1903(var11, 107);
                                    int var87;
                                    if (!var86) {
                                        var87 = var11.field4120;
                                    } else {
                                        var87 = var11.field4086;
                                    }
                                    class2 var88 = null;
                                    int var89 = 0;
                                    if (var11.field4185 != -1) {
                                        class273 var90 = class259.method1735(var11.field4185, -14667);
                                        if (var90 != null) {
                                            class273 var91 = var90.method1832((byte) 104, var11.field4100);
                                            class196 var92 = var87 != -1 ? class70.method478(var87, false) : null;
                                            var88 = var91.method1831((byte) 116, var11.field4190, var11.field4115, var92, var11.field4126, 1);
                                            if (var88 != null) {
                                                var89 = -var88.method36() / 2;
                                            } else {
                                                class217.method1396(false, var11);
                                            }
                                        }
                                    } else if (~var11.field4057 != -6) {
                                        if (var87 != -1) {
                                            class196 var93 = class70.method478(var87, false);
                                            var88 = var11.method1783(var93, var11.field4115, var11.field4126, false, class55.field847.field765, var11.field4190, var86);
                                            if (var88 == null && class119.field1752) {
                                                class217.method1396(arg5, var11);
                                            }
                                        } else {
                                            var88 = var11.method1783((class196) null, -1, 0, false, class55.field847.field765, -1, var86);
                                            if (var88 == null && class119.field1752) {
                                                class217.method1396(arg5, var11);
                                            }
                                        }
                                    } else if (var11.field4038 != -1) {
                                        int var94 = 2047 & var11.field4038;
                                        if (class73.field1133 == var94) {
                                            var94 = 2047;
                                        }
                                        class53 var95 = class194.field2777[var94];
                                        class196 var96 = ~var87 == 0 ? null : class70.method478(var87, false);
                                        if (var95 != null && (int) class109.method712((byte) -127, var95.field766) << 11 == (-2048 & var11.field4038)) {
                                            var88 = var95.field765.method1417((class235[]) null, 0, 0, (byte) -13, 0, -1, true, (class196) null, var96, -1, var11.field4115);
                                        }
                                    } else {
                                        var88 = class124.field1804.method1417((class235[]) null, 0, 0, (byte) -13, -1, -1, true, (class196) null, (class196) null, -1, -1);
                                    }
                                    if (var88 != null) {
                                        int var97;
                                        if (~var11.field4141 >= -1) {
                                            var97 = 256;
                                        } else {
                                            var97 = (var11.field4051 << 8) / var11.field4141;
                                        }
                                        int var98;
                                        if (var11.field4123 > 0) {
                                            var98 = (var11.field4177 << 8) / var11.field4123;
                                        } else {
                                            var98 = 256;
                                        }
                                        int var99 = var11.field4177 / 2 + (var11.field4169 * var98 >> 8) + var13;
                                        int var100 = (var11.field4150 * var97 >> 8) + var11.field4051 / 2 + var14;
                                        class18.method140(var99, var100);
                                        int var101 = class18.field261[var11.field4097] * var11.field4135 >> 16;
                                        int var102 = class18.field259[var11.field4097] * var11.field4135 >> 16;
                                        if (!var11.field4039) {
                                            var88.method24(0, var11.field4155, 0, var11.field4097, 0, var101, var102, -1L);
                                        } else if (var11.field4022) {
                                            ((class215) var88).method1385(0, var11.field4155, var11.field4054, var11.field4097, var11.field4041, var11.field4076 + var101 + var89, var11.field4076 + var102, var11.field4135);
                                        } else {
                                            var88.method24(0, var11.field4155, var11.field4054, var11.field4097, var11.field4041, var89 + var101 + var11.field4076, var11.field4076 + var102, -1L);
                                        }
                                        class18.method135();
                                    }
                                } else {
                                    if (var11.field4149 == 7) {
                                        class198 var103 = var11.method1784(class158.field2290, (byte) 44);
                                        if (var103 == null) {
                                            if (class119.field1752) {
                                                class217.method1396(false, var11);
                                            }
                                            continue;
                                        }
                                        int var104 = 0;
                                        for (int var105 = 0; var105 < var11.field4105; ++var105) {
                                            for (int var106 = 0; var11.field4187 > var106; ++var106) {
                                                if (var11.field4107[var104] > 0) {
                                                    class273 var107 = class259.method1735(var11.field4107[var104] + -1, -14667);
                                                    String var108;
                                                    if (var107.field4387 != 1 && ~var11.field4172[var104] == -2) {
                                                        var108 = "<col=ff9040>" + var107.field4375 + "</col>";
                                                    } else {
                                                        var108 = "<col=ff9040>" + var107.field4375 + "</col> x" + class227.method1485(-1, var11.field4172[var104]);
                                                    }
                                                    int var109 = (var11.field4106 + 12) * var105 + var14;
                                                    int var110 = (115 - -var11.field4026) * var106 + var13;
                                                    if (~var11.field4114 != -1) {
                                                        if (~var11.field4114 != -2) {
                                                            var103.method1282(var108, var110 - -115 + -1, var109, var11.field4084, !var11.field4030 ? -1 : 0);
                                                        } else {
                                                            var103.method1289(var108, var110 + 57, var109, var11.field4084, !var11.field4030 ? -1 : 0);
                                                        }
                                                    } else {
                                                        var103.method1270(var108, var110, var109, var11.field4084, !var11.field4030 ? -1 : 0);
                                                    }
                                                }
                                                ++var104;
                                            }
                                        }
                                    }
                                    if (var11.field4149 == 8 && class15.field221 == var11 && ~class261.field3943 == ~class222.field3312) {
                                        int var111 = 0;
                                        class198 var112 = class258.field3914;
                                        int var113 = 0;
                                        String var114 = var11.field4156;
                                        String var115 = class80.method537(var11, -26, var114);
                                        while (~var115.length() < -1) {
                                            int var123 = var115.indexOf("<br>");
                                            String var124;
                                            if (var123 != -1) {
                                                var124 = var115.substring(0, var123);
                                                var115 = var115.substring(var123 + 4);
                                            } else {
                                                var124 = var115;
                                                var115 = "";
                                            }
                                            int var125 = var112.method1278(var124);
                                            var111 += var112.field2852 + 1;
                                            if (var113 < var125) {
                                                var113 = var125;
                                            }
                                        }
                                        var111 += 7;
                                        int var116 = var11.field4051 + var14 + 5;
                                        var113 += 6;
                                        int var117 = var11.field4177 + var13 + -var113 + -5;
                                        if (var13 + 5 > var117) {
                                            var117 = var13 - -5;
                                        }
                                        if (arg7 < var116 - -var111) {
                                            var116 = -var111 + arg7;
                                        }
                                        if (~(var113 + var117) < ~arg6) {
                                            var117 = -var113 + arg6;
                                        }
                                        class144.method955(var117, var116, var113, var111, 16777120);
                                        class144.method951(var117, var116, var113, var111, 0);
                                        String var118 = var11.field4156;
                                        int var119 = var116 - (-var112.field2852 + -2);
                                        String var120 = class80.method537(var11, -63, var118);
                                        while (var120.length() > 0) {
                                            int var121 = var120.indexOf("<br>");
                                            String var122;
                                            if (var121 != -1) {
                                                var122 = var120.substring(0, var121);
                                                var120 = var120.substring(var121 + 4);
                                            } else {
                                                var122 = var120;
                                                var120 = "";
                                            }
                                            var112.method1270(var122, var117 + 3, var119, 0, -1);
                                            var119 += var112.field2852 - -1;
                                        }
                                    }
                                    if (var11.field4149 == 9) {
                                        int var126;
                                        int var127;
                                        int var128;
                                        int var129;
                                        if (!var11.field4118) {
                                            var126 = var11.field4177 + var13;
                                            var127 = var11.field4051 + var14;
                                            var128 = var13;
                                            var129 = var14;
                                        } else {
                                            var128 = var13;
                                            var129 = var11.field4051 + var14;
                                            var127 = var14;
                                            var126 = var11.field4177 + var13;
                                        }
                                        if (var11.field4181 == 1) {
                                            class144.method963(var128, var129, var126, var127, var11.field4084);
                                        } else {
                                            class144.method969(var128, var129, var126, var127, var11.field4084, var11.field4181);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ++field2748;
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class192(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field2740 = arg4;
        this.field2741 = arg0;
        this.field2750 = arg1;
        this.field2737 = arg6;
        this.field2744 = arg7;
        this.field2743 = arg5;
        this.field2745 = arg2;
        this.field2756 = arg3;
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)V")
    public static void method1232(int arg0) {
        if (arg0 == -5) {
            field2751 = null;
            field2739 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIII)V")
    public static final void method1233(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2747;
        class270 var5 = class190.method1213(arg4 ^ 25708, arg0, arg4);
        var5.method1808((byte) 62);
        var5.field4226 = arg1;
        var5.field4233 = arg2;
        var5.field4230 = arg3;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IBI)V")
    public final void method311(int arg0, byte arg1, int arg2) {
        ++field2749;
        int var4 = this.field2750 * arg2 >> 12;
        if (arg1 == 122) {
            int var5 = this.field2741 * arg0 >> 12;
            int var6 = this.field2740 * arg0 >> 12;
            int var7 = this.field2743 * arg2 >> 12;
            int var8 = this.field2745 * arg0 >> 12;
            int var9 = this.field2756 * arg2 >> 12;
            int var10 = this.field2737 * arg0 >> 12;
            int var11 = this.field2744 * arg2 >> 12;
            class108.method709(var11, var6, var10, var5, super.field1749, var9, var4, var8, var7, -6);
        }
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(I)V")
    public static final void method1234(int arg0) {
        if (arg0 >= -46) {
            method1234(-6);
        }
        ++field2755;
        class28.field407.method260(0);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(III)V")
    public final void method310(int arg0, int arg1, int arg2) {
        ++field2742;
        if (arg2 != -11777) {
            this.field2750 = -127;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIZII)V")
    public static final void method1235(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        ++field2746;
        class95.field1451.field1673 = 0;
        class95.field1451.method775(20, -119);
        class95.field1451.method775(arg3, -117);
        class95.field1451.method775(arg1, -120);
        if (arg2) {
            class95.field1451.method794(arg0, (byte) -61);
            class95.field1451.method794(arg4, (byte) -41);
            class221.field3259 = 0;
            class81.field1251 = 1;
            class40.field591 = 0;
            class204.field2956 = -3;
        }
    }
}
