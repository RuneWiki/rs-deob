import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dca")
public class class544 extends class19 implements class324 {

    @OriginalMember(owner = "client!dca", name = "P", descriptor = "Z")
    private boolean field7901 = false;

    @OriginalMember(owner = "client!dca", name = "eb", descriptor = "Llm;")
    public class205 field7916;

    @OriginalMember(owner = "client!dca", name = "K", descriptor = "Z")
    private boolean field7896;

    @OriginalMember(owner = "client!dca", name = "R", descriptor = "I")
    public static int field7903 = -1;

    @OriginalMember(owner = "client!dca", name = "db", descriptor = "I")
    public static int field7915 = 503;

    @OriginalMember(owner = "client!dca", name = "C", descriptor = "I")
    public static int field7888;

    @OriginalMember(owner = "client!dca", name = "E", descriptor = "I")
    public static int field7890;

    @OriginalMember(owner = "client!dca", name = "F", descriptor = "I")
    public static int field7891;

    @OriginalMember(owner = "client!dca", name = "G", descriptor = "I")
    public static int field7892;

    @OriginalMember(owner = "client!dca", name = "H", descriptor = "I")
    public static int field7893;

    @OriginalMember(owner = "client!dca", name = "I", descriptor = "I")
    public static int field7894;

    @OriginalMember(owner = "client!dca", name = "J", descriptor = "I")
    public static int field7895;

    @OriginalMember(owner = "client!dca", name = "L", descriptor = "I")
    public static int field7897;

    @OriginalMember(owner = "client!dca", name = "M", descriptor = "I")
    public static int field7898;

    @OriginalMember(owner = "client!dca", name = "N", descriptor = "I")
    public static int field7899;

    @OriginalMember(owner = "client!dca", name = "O", descriptor = "I")
    public static int field7900;

    @OriginalMember(owner = "client!dca", name = "Q", descriptor = "I")
    public static int field7902;

    @OriginalMember(owner = "client!dca", name = "S", descriptor = "I")
    public static int field7904;

    @OriginalMember(owner = "client!dca", name = "T", descriptor = "I")
    public static int field7905;

    @OriginalMember(owner = "client!dca", name = "U", descriptor = "I")
    public static int field7906;

    @OriginalMember(owner = "client!dca", name = "V", descriptor = "I")
    public static int field7907;

    @OriginalMember(owner = "client!dca", name = "W", descriptor = "I")
    public static int field7908;

    @OriginalMember(owner = "client!dca", name = "X", descriptor = "I")
    public static int field7909;

    @OriginalMember(owner = "client!dca", name = "Y", descriptor = "I")
    public static int field7910;

    @OriginalMember(owner = "client!dca", name = "Z", descriptor = "I")
    public static int field7911;

    @OriginalMember(owner = "client!dca", name = "ab", descriptor = "I")
    public static int field7912;

    @OriginalMember(owner = "client!dca", name = "bb", descriptor = "I")
    public static int field7913;

    @OriginalMember(owner = "client!dca", name = "cb", descriptor = "I")
    public static int field7914;

    @OriginalMember(owner = "client!dca", name = "D", descriptor = "Lro;")
    private class522 field7889;

    @OriginalMember(owner = "client!dca", name = "b", descriptor = "(B)I")
    public final int method604(byte arg0) {
        if (arg0 != 94) {
            return 126;
        } else {
            ++field7900;
            return this.field7916.field3068;
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(IIIIIII)V")
    public static final void method3271(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field7893;
        int var7 = class468.field6665;
        class645.field9282 = 0;
        int[] var8 = class38.field500;
        for (int var9 = 0; ~var9 > ~(var7 - -class619.field8816); ++var9) {
            class521 var37 = null;
            class335 var38;
            if (~var9 > ~var7) {
                var38 = class536.field7796[var8[var9]];
            } else {
                var38 = ((class63) class389.field5608.method4020((long) class545.field7927[var9 - var7], (byte) -126)).field1004;
                var37 = ((class571) var38).field8235;
                if (var37.field7535 != null) {
                    var37 = var37.method3166(class226.field3372, true);
                    if (var37 == null) {
                        continue;
                    }
                }
            }
            if (~var38.field4552 <= -1 && (class444.field6347 == var38.field4562 || ~class108.field1536.field3920 == ~var38.field3920)) {
                class236.method1642(arg6 >> 1, arg1, true, var38, arg3 >> 1, arg5, var38.method2057(0));
                if (class90.field1273[0] >= 0) {
                    if (var38.field4632 != null && (~var9 <= ~var7 || class499.field7175 == 0 || class499.field7175 == 3 || ~class499.field7175 == -2 && class507.method3094(((class639) var38).field9056, 0)) && class721.field10146 > class645.field9282) {
                        class721.field10147[class645.field9282] = class119.field1635.method3063(0, var38.field4632) / 2;
                        class721.field10148[class645.field9282] = class90.field1273[0];
                        class721.field10140[class645.field9282] = class90.field1273[1];
                        class721.field10152[class645.field9282] = var38.field4625;
                        class721.field10156[class645.field9282] = var38.field4594;
                        class721.field10142[class645.field9282] = var38.field4579;
                        class721.field10150[class645.field9282] = var38.field4632;
                        ++class645.field9282;
                    }
                    int var39 = class90.field1273[1] + arg2;
                    int var50;
                    if (!var38.field4612 && var38.field4589 > class703.field9918) {
                        boolean var40 = true;
                        byte var41 = 1;
                        int var42;
                        if (~var7 >= ~var9) {
                            var42 = var37.field7548;
                            if (var42 == -1) {
                                var42 = var38.method2052(-5569).field1185;
                            }
                        } else {
                            class639 var43 = class536.field7796[var8[var9]];
                            var42 = var38.method2052(-5569).field1185;
                            if (var43.field9050) {
                                var41 = 2;
                            }
                        }
                        class515[] var44 = class663.field9475;
                        if (~var42 != 0) {
                            class515[] var45 = (class515[]) class501.field7281.method2216(0, (long) var42);
                            if (var45 == null) {
                                class676[] var46 = class676.method3846(class603.field8548, var42, 0);
                                if (var46 != null) {
                                    var45 = new class515[var46.length];
                                    for (int var47 = 0; ~var47 > ~var46.length; ++var47) {
                                        var45[var47] = class211.field3164.method202(var46[var47], true);
                                    }
                                    class501.field7281.method2213((byte) -16, (long) var42, var45);
                                }
                            }
                            if (var45 != null && ~var45.length <= -3) {
                                var44 = var45;
                            }
                        }
                        if (var44.length <= var41) {
                            var41 = 1;
                        }
                        class515 var48 = var44[0];
                        class515 var49 = var44[var41];
                        var50 = var39 - Math.max(class119.field1635.field7292, var48.method787());
                        int var51 = arg4 + (class90.field1273[0] - (var48.method777() >> 1));
                        int var52 = var48.method777() * var38.field4550 / 255;
                        int var53 = var48.method787();
                        if (~var38.field4550 < -1 && var52 < 2) {
                            var52 = 2;
                        }
                        var48.method3128(var51, var50);
                        class211.field3164.method335(var51, var50, var51 + var52, var50 - -var53);
                        var49.method3128(var51, var50);
                        class211.field3164.method297(arg4, arg2, arg4 + arg6, arg2 + arg3);
                        class545.method3277(var51, var50, var48.method784() + var51, -45, var50 + var53);
                    } else {
                        var50 = var39 - Math.max(class119.field1635.field7292, class663.field9475[0].method787());
                    }
                    var50 -= 2;
                    if (!var38.field4612) {
                        if (class703.field9918 < var38.field4578) {
                            class515 var54 = class711.field10018[!var38.field4556 ? 0 : 2];
                            class515 var55 = class711.field10018[!var38.field4556 ? 1 : 3];
                            boolean var56 = true;
                            int var57;
                            if (!(var38 instanceof class571)) {
                                var57 = var38.method2052(-5569).field1230;
                            } else {
                                var57 = var37.field7550;
                                if (~var57 == 0) {
                                    var57 = var38.method2052(-5569).field1230;
                                }
                            }
                            if (~var57 != 0) {
                                class515[] var58 = (class515[]) class487.field7018.method2216(0, (long) var57);
                                if (var58 == null) {
                                    class676[] var59 = class676.method3846(class603.field8548, var57, 0);
                                    if (var59 != null) {
                                        var58 = new class515[var59.length];
                                        for (int var60 = 0; ~var60 > ~var59.length; ++var60) {
                                            var58[var60] = class211.field3164.method202(var59[var60], true);
                                        }
                                        class487.field7018.method2213((byte) -16, (long) var57, var58);
                                    }
                                }
                                if (var58 != null && var58.length == 4) {
                                    var55 = var58[!var38.field4556 ? 1 : 3];
                                    var54 = var58[!var38.field4556 ? 0 : 2];
                                }
                            }
                            int var61 = -class703.field9918 + var38.field4578;
                            int var64;
                            if (~var61 < ~var38.field4537) {
                                int var62 = var61 - var38.field4537;
                                int var63 = var38.field4572 == 0 ? 0 : (-var62 + var38.field4573) / var38.field4572 * var38.field4572;
                                var64 = var54.method777() * var63 / var38.field4573;
                            } else {
                                var64 = var54.method777();
                            }
                            int var65 = var54.method787();
                            var50 -= var65;
                            int var66 = class90.field1273[0] + arg4 + -(var54.method777() >> 1);
                            var54.method3128(var66, var50);
                            class211.field3164.method335(var66, var50, var64 + var66, var50 + var65);
                            var55.method3128(var66, var50);
                            class211.field3164.method297(arg4, arg2, arg4 + arg6, arg2 - -arg3);
                            class545.method3277(var66, var50, var66 + var54.method784(), -96, var50 - -var65);
                            var50 -= 2;
                        }
                        if (~var9 <= ~var7) {
                            if (var37.field7559 >= 0 && ~var37.field7559 > ~class589.field8382.length) {
                                class515 var67 = class589.field8382[var37.field7559];
                                var50 -= 25;
                                var67.method3128(class90.field1273[0] + arg4 + -(var67.method777() >> 1), var50);
                                class545.method3277(class90.field1273[0] + arg4 - (var67.method777() >> 1), var50, class90.field1273[0] + arg4 + -(var67.method777() >> 1) + var67.method784(), -110, var50 + var67.method780());
                                var50 -= 2;
                            }
                        } else {
                            class639 var68 = (class639) var38;
                            if (var68.field9060 != -1) {
                                var50 -= 25;
                                class515 var69 = class25.field222[var68.field9060];
                                var69.method3128(arg4 + -12 - -class90.field1273[0], var50);
                                class545.method3277(class90.field1273[0] + -12 + arg4, var50, class90.field1273[0] + arg4 - (12 - var69.method784()), -44, var50 + var69.method780());
                                var50 -= 2;
                            }
                            if (var68.field9078 != -1) {
                                var50 -= 25;
                                class515 var70 = class589.field8382[var68.field9078];
                                var70.method3128(class90.field1273[0] + -12 + arg4, var50);
                                class545.method3277(class90.field1273[0] - 12 + arg4, var50, -12 + (class90.field1273[0] + arg4 - -var70.method784()), -53, var70.method780() + var50);
                                var50 -= 2;
                            }
                        }
                    }
                    int var10000;
                    if (var38 instanceof class639) {
                        if (var9 >= 0) {
                            int var71 = 0;
                            class504[] var72 = class99.field1437;
                            for (int var73 = 0; var73 < var72.length; ++var73) {
                                class504 var75 = var72[var73];
                                if (var75 != null && var75.field7322 == 10 && var8[var9] == var75.field7334) {
                                    class515 var76 = class242.field3575[var75.field7327];
                                    if (~var71 > ~var76.method787()) {
                                        var71 = var76.method787();
                                    }
                                    var76.method3128(arg4 - (-class90.field1273[0] + 12), -var76.method787() + var50);
                                    class545.method3277(class90.field1273[0] + -12 + arg4, -var76.method787() + var50, class90.field1273[0] - 12 + arg4 + var76.method784(), -124, -var76.method787() + var50 + var76.method780());
                                }
                            }
                            if (~var71 < -1) {
                                var10000 = var50 - (var71 - -2);
                            }
                        }
                    } else {
                        int var77 = 0;
                        class504[] var78 = class99.field1437;
                        for (int var79 = 0; var79 < var78.length; ++var79) {
                            class504 var84 = var78[var79];
                            if (var84 != null && var84.field7322 == 1 && class545.field7927[-var7 + var9] == var84.field7334) {
                                class515 var85 = class242.field3575[var84.field7327];
                                if (var85.method787() > var77) {
                                    var77 = var85.method787();
                                }
                                if (class703.field9918 % 20 < 10) {
                                    var85.method3128(arg4 - (-class90.field1273[0] + 12), var50 + -var85.method787());
                                    class545.method3277(arg4 - -class90.field1273[0] + -12, -var85.method787() + var50, class90.field1273[0] + -12 + arg4 + var85.method784(), -100, var50 - (var85.method787() + -var85.method780()));
                                }
                            }
                        }
                        if (var77 > 0) {
                            var10000 = var50 - (var77 + 2);
                        }
                    }
                    for (int var81 = 0; ~var81 > -5; ++var81) {
                        if (~class703.field9918 > ~var38.field4540[var81]) {
                            int var82 = var38.method2057(0) / 2;
                            class236.method1642(arg6 >> 1, arg1, true, var38, arg3 >> 1, arg5, var82);
                            if (class90.field1273[0] > -1) {
                                int var83 = class166.field2361[var38.field4536[var81]].method777();
                                if (~var81 == -2) {
                                    class90.field1273[1] -= 20;
                                }
                                if (var81 == 2) {
                                    class90.field1273[1] -= 10;
                                    class90.field1273[0] -= var83 + -9;
                                }
                                if (~var81 == -4) {
                                    class90.field1273[0] += var83 + -9;
                                    class90.field1273[1] -= 10;
                                }
                                class166.field2361[var38.field4536[var81]].method3128(class90.field1273[0] + -(var83 >> 1) + arg4, arg2 + -12 + class90.field1273[1]);
                                class564.field8163.method2424((byte) 106, 0, class90.field1273[1] + 3 + arg2, class90.field1273[0] + arg4 + -1, Integer.toString(var38.field4609[var81]), -1);
                            }
                        }
                    }
                }
            }
        }
        if (arg0 < 5) {
            method3274((int[]) null, 46, 59, -117, (int[]) null, (class38) null);
        }
        for (int var10 = 0; ~var10 > ~class63.field1006; ++var10) {
            int var33 = class109.field1564[var10];
            class335 var34;
            if (~var33 > -2049) {
                var34 = class536.field7796[var33];
            } else {
                var34 = ((class63) class389.field5608.method4020((long) (var33 - 2048), (byte) -79)).field1004;
            }
            int var35 = class145.field1967[var10];
            class335 var36;
            if (var35 >= 2048) {
                var36 = ((class63) class389.field5608.method4020((long) (var35 + -2048), (byte) -95)).field1004;
            } else {
                var36 = class536.field7796[var35];
            }
            class645.method3725(--var34.field4607, arg3, arg2, var36, arg5, arg6, arg4, 83, arg1, var34);
        }
        int var11 = class119.field1635.field7292 - -class119.field1635.field7295 + 2;
        for (int var12 = 0; var12 < class645.field9282; ++var12) {
            int var13 = class721.field10148[var12];
            int var14 = class721.field10140[var12];
            int var15 = class721.field10147[var12];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var32 = 0; ~var32 > ~var12; ++var32) {
                    if (class721.field10140[var32] + -var11 < var14 - -2 && ~(var14 - var11) > ~(class721.field10140[var32] + 2) && ~(class721.field10148[var32] - -class721.field10147[var32]) < ~(-var15 + var13) && class721.field10148[var32] + -class721.field10147[var32] < var13 + var15 && ~var14 < ~(class721.field10140[var32] + -var11)) {
                        var16 = true;
                        var14 = class721.field10140[var32] - var11;
                    }
                }
            }
            class721.field10140[var12] = var14;
            String var17 = class721.field10150[var12];
            int var18 = class119.field1635.method3063(0, var17);
            int var19 = arg4 + var13;
            int var20 = arg2 - -var14 - class119.field1635.field7292;
            int var21 = var19 - -var18;
            int var22 = arg2 + var14 - -class119.field1635.field7295;
            if (~class132.field1837 == -1) {
                int var23 = 16776960;
                if (~class721.field10152[var12] > -7) {
                    var23 = class539.field7827[class721.field10152[var12]];
                }
                if (~class721.field10152[var12] == -7) {
                    var23 = ~(class444.field6347 % 20) <= -11 ? 16776960 : 16711680;
                }
                if (~class721.field10152[var12] == -8) {
                    var23 = class444.field6347 % 20 < 10 ? 255 : 65535;
                }
                if (class721.field10152[var12] == 8) {
                    var23 = class444.field6347 % 20 >= 10 ? 8454016 : 45056;
                }
                if (class721.field10152[var12] == 9) {
                    int var24 = -class721.field10142[var12] + 150;
                    if (~var24 <= -51) {
                        if (var24 >= 100) {
                            if (var24 < 150) {
                                var23 = (var24 - 100) * 5 + 65280;
                            }
                        } else {
                            var23 = -((var24 - 50) * 327680) + 16776960;
                        }
                    } else {
                        var23 = var24 * 1280 + 16711680;
                    }
                }
                if (~class721.field10152[var12] == -11) {
                    int var25 = 150 - class721.field10142[var12];
                    if (~var25 > -51) {
                        var23 = var25 * 5 + 16711680;
                    } else if (~var25 > -101) {
                        var23 = -((var25 + -50) * 327680) + 16711935;
                    } else if (~var25 > -151) {
                        var23 = -(var25 * 5) - (-500 - (var25 + -100) * 327680 - 255);
                    }
                }
                if (~class721.field10152[var12] == -12) {
                    int var26 = -class721.field10142[var12] + 150;
                    if (~var26 > -51) {
                        var23 = -(var26 * 327685) + 16777215;
                    } else if (var26 >= 100) {
                        if (~var26 > -151) {
                            var23 = 16777215 - (var26 - 100) * 327680;
                        }
                    } else {
                        var23 = (var26 + -50) * 327685 + 65280;
                    }
                }
                int var27 = var23 | -16777216;
                if (class721.field10156[var12] == 0) {
                    class193.field2838.method2424((byte) 106, -16777216, arg2 + var14, arg4 + var13, var17, var27);
                    var19 -= var18 >> 1;
                    var21 -= var18 >> 1;
                }
                if (class721.field10156[var12] == 1) {
                    var19 -= var18 >> 1;
                    var22 += 5;
                    var20 -= 5;
                    class193.field2838.method2431(arg2 - -var14, class444.field6347, -16777216, arg4 + var13, 8364, var27, var17);
                    var21 -= var18 >> 1;
                }
                if (~class721.field10156[var12] == -3) {
                    var20 -= 5;
                    var19 -= (var18 >> 1) - -5;
                    var21 -= (var18 >> 1) + -5;
                    var22 += 5;
                    class193.field2838.method2419(arg4 + var13, 5, -16777216, var27, class444.field6347, arg2 + var14, var17);
                }
                if (class721.field10156[var12] == 3) {
                    var19 -= var18 >> 1;
                    var20 -= 7;
                    var22 += 7;
                    class193.field2838.method2434(class444.field6347, -class721.field10142[var12] + 150, var17, arg2 - -var14, arg4 + var13, -33, var27, -16777216);
                    var21 -= var18 >> 1;
                }
                if (~class721.field10156[var12] == -5) {
                    int var28 = (-class721.field10142[var12] + 150) * (100 + class119.field1635.method3063(0, var17)) / 150;
                    class211.field3164.method335(var13 + -50 + arg4, arg2, arg4 - -var13 + 50, arg2 + arg3);
                    class193.field2838.method2433(-16777216, var27, -var28 + 50 + arg4 + var13, 0, var17, arg2 + var14);
                    var21 += -var28 + 50;
                    var19 += -var28 + 50;
                    class211.field3164.method297(arg4, arg2, arg4 + arg6, arg2 - -arg3);
                }
                if (class721.field10156[var12] == 5) {
                    int var29 = -class721.field10142[var12] + 150;
                    int var30 = 0;
                    if (var29 >= 25) {
                        if (var29 > 125) {
                            var30 = var29 + -125;
                        }
                    } else {
                        var30 = var29 + -25;
                    }
                    int var31 = class119.field1635.field7295 + class119.field1635.field7292;
                    class211.field3164.method335(arg4, var14 - (var31 - -1) + arg2, arg4 - -arg6, arg2 - -5 + var14);
                    class193.field2838.method2424((byte) 106, -16777216, arg2 - (-var14 + -var30), arg4 + var13, var17, var27);
                    var20 += var30;
                    var21 -= var18 >> 1;
                    var19 -= var18 >> 1;
                    var22 += var30;
                    class211.field3164.method297(arg4, arg2, arg4 + arg6, arg2 + arg3);
                }
            } else {
                class193.field2838.method2424((byte) 106, -16777216, arg2 + var14, arg4 + var13, var17, -256);
                var21 -= var18 >> 1;
                var19 -= var18 >> 1;
            }
            class545.method3277(var19, var20, var21 + 1, -101, var22 - -1);
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(ILjc;)V")
    public static final void method3272(int arg0, class168 arg1) {
        ++field7911;
        for (int var2 = 0; var2 < class609.field8692; ++var2) {
            int var3 = class750.field10452[var2];
            class639 var4 = class536.field7796[var3];
            int var5 = arg1.method2886(true);
            if (~(var5 & 2) != -1) {
                var5 += arg1.method2886(true) << 8;
            }
            if ((var5 & 1024) != 0) {
                var5 += arg1.method2886(true) << 16;
            }
            class191.method1339(-97, arg1, var5, var3, var4);
        }
        if (arg0 <= 48) {
            field7915 = -105;
        }
    }

    @OriginalMember(owner = "client!dca", name = "g", descriptor = "(I)I")
    public final int method595(int arg0) {
        ++field7888;
        if (arg0 != 32767) {
            this.field7916 = null;
        }
        return this.field7916.method1467(-1);
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(Lha;I)V")
    public final void method608(class543 arg0, int arg1) {
        ++field7899;
        int var3 = -53 / ((arg1 - 68) / 32);
        this.field7916.method1468(arg0, -72);
    }

    @OriginalMember(owner = "client!dca", name = "<init>", descriptor = "(Lha;Lrq;IIIIIZIII)V")
    public class544(class543 arg0, class482 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, arg2, arg3, class9.method32(arg9, 69, arg8));
        this.field7916 = new class205(arg0, arg1, arg8, arg9, super.field3920, arg3, this, arg7, arg10);
        this.field7896 = arg1.field6903 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(IIILha;)Z")
    public final boolean method594(int arg0, int arg1, int arg2, class543 arg3) {
        ++field7906;
        class282 var5 = this.field7916.method1471(-2615, 131072, false, false, arg3);
        if (var5 == null) {
            return false;
        } else {
            class121 var6 = arg3.method342();
            var6.method845(super.field3923, super.field3922, super.field3916);
            if (arg2 != 1) {
                return true;
            } else {
                return class100.field1447 ? var5.method538(arg1, arg0, var6, false, 0, class680.field9660) : var5.method496(arg1, arg0, var6, false, 0);
            }
        }
    }

    @OriginalMember(owner = "client!dca", name = "g", descriptor = "(B)Z")
    public final boolean method614(byte arg0) {
        int var2 = 24 / ((arg0 - -38) / 63);
        ++field7894;
        return this.field7901;
    }

    @OriginalMember(owner = "client!dca", name = "b", descriptor = "(BLha;)V")
    public final void method610(byte arg0, class543 arg1) {
        if (arg0 >= 51) {
            ++field7913;
            class282 var3 = this.field7916.method1471(-2615, 262144, true, true, arg1);
            if (var3 != null) {
                int var4 = super.field3923 >> 9;
                int var5 = super.field3916 >> 9;
                class121 var6 = arg1.method342();
                var6.method845(super.field3923, super.field3922, super.field3916);
                this.field7916.method1466(var5, var4, var3, false, arg1, -1, var5, var4, var6);
            }
        }
    }

    @OriginalMember(owner = "client!dca", name = "b", descriptor = "(I)I")
    public final int method606(int arg0) {
        ++field7902;
        return arg0 >= -32 ? 17 : this.field7916.field3091;
    }

    @OriginalMember(owner = "client!dca", name = "e", descriptor = "(B)Z")
    public final boolean method607(byte arg0) {
        int var2 = 23 / ((arg0 - 27) / 62);
        ++field7914;
        return false;
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(BLha;)Lqs;")
    public final class603 method613(byte arg0, class543 arg1) {
        if (arg0 <= 76) {
            this.method599((byte) -47);
        }
        ++field7907;
        class282 var3 = this.field7916.method1471(-2615, 2048, true, false, arg1);
        if (var3 == null) {
            return null;
        } else {
            class121 var4 = arg1.method342();
            var4.method845(super.field3923, super.field3922, super.field3916);
            class603 var5 = class6.method26(this.field7896, -87, 1);
            int var6 = super.field3923 >> 9;
            int var7 = super.field3916 >> 9;
            this.field7916.method1466(var7, var6, var3, true, arg1, -1, var7, var6, var4);
            if (class100.field1447) {
                var3.method503(var4, var5.field8543[0], class680.field9660, 0);
            } else {
                var3.method533(var4, var5.field8543[0], 0);
            }
            if (this.field7916.field3096 != null) {
                class458 var8 = this.field7916.field3096.method127();
                if (!class100.field1447) {
                    arg1.method214(var8);
                } else {
                    arg1.method216(var8, class680.field9660);
                }
            }
            this.field7901 = var3.method497() || this.field7916.field3096 != null;
            if (this.field7889 != null) {
                class745.method4158(super.field3922, super.field3916, var3, super.field3923, -106, this.field7889);
            } else {
                this.field7889 = class222.method1551(var3, super.field3923, super.field3922, super.field3916, 34);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!dca", name = "d", descriptor = "(Z)V")
    public static final void method3273(boolean arg0) {
        if (!arg0) {
            class640.field9112 = null;
            class236.field3530 = null;
            class349.field5167 = null;
            class301.field4123 = null;
            class568.field8208 = null;
            class72.field1097 = null;
            class509.field7379 = null;
            ++field7890;
            class727.field10224 = null;
            class637.field9005 = null;
        }
    }

    @OriginalMember(owner = "client!dca", name = "d", descriptor = "(B)I")
    public final int method599(byte arg0) {
        ++field7910;
        if (arg0 > -4) {
            this.field7916 = null;
        }
        return this.field7916.method1464(0);
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(Lha;Z)V")
    public final void method597(class543 arg0, boolean arg1) {
        this.field7916.method1461(25, arg0);
        ++field7904;
        if (arg1) {
            this.field7916 = null;
        }
    }

    @OriginalMember(owner = "client!dca", name = "c", descriptor = "(BLha;)Lro;")
    public final class522 method602(byte arg0, class543 arg1) {
        if (arg0 >= -114) {
            this.method613((byte) 16, (class543) null);
        }
        ++field7909;
        return this.field7889;
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(B)I")
    public final int method601(byte arg0) {
        ++field7897;
        if (arg0 < 86) {
            method3275((byte) -121, 12);
        }
        return this.field7916.field3063;
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(ILjw;Lha;BIZI)V")
    public final void method711(int arg0, class280 arg1, class543 arg2, byte arg3, int arg4, boolean arg5, int arg6) {
        ++field7892;
        if (arg3 < 28) {
            this.method608((class543) null, 34);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "([IIII[ILch;)Lvb;")
    public static final class628 method3274(int[] arg0, int arg1, int arg2, int arg3, int[] arg4, class38 arg5) {
        ++field7908;
        if (arg5.method256(arg2 ^ arg2, class315.field4259, class674.field9590)) {
            byte[] var6 = new byte[arg1 * arg3];
            for (int var7 = 0; arg3 > var7; ++var7) {
                int var8 = arg1 * var7 + arg0[var7];
                for (int var9 = 0; var9 < arg4[var7]; ++var9) {
                    var6[var8++] = -1;
                }
            }
            return new class628(arg5, arg1, arg3, var6);
        } else {
            int[] var10 = new int[arg1 * arg3];
            for (int var11 = 0; var11 < arg3; ++var11) {
                int var12 = arg1 * var11 + arg0[var11];
                for (int var13 = 0; var13 < arg4[var11]; ++var13) {
                    var10[var12++] = -16777216;
                }
            }
            return new class628(arg5, arg1, arg3, var10);
        }
    }

    @OriginalMember(owner = "client!dca", name = "e", descriptor = "(I)V")
    public final void method713(int arg0) {
        ++field7905;
        if (arg0 == -16221) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!dca", name = "c", descriptor = "(B)V")
    public final void method598(byte arg0) {
        ++field7891;
        if (arg0 >= -9) {
            this.field7901 = true;
        }
    }

    @OriginalMember(owner = "client!dca", name = "d", descriptor = "(I)Z")
    public final boolean method715(int arg0) {
        ++field7895;
        return arg0 != -12888;
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(BI)V")
    public static final void method3275(byte arg0, int arg1) {
        ++field7898;
        class348 var2 = class675.field9603;
        synchronized (class675.field9603) {
            class675.field9603.method2207(arg1, 1);
        }
        class348 var3 = class201.field2992;
        synchronized (class201.field2992) {
            class201.field2992.method2207(arg1, 1);
        }
        if (arg0 <= 85) {
            field7903 = -25;
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(I)Z")
    public final boolean method611(int arg0) {
        ++field7912;
        if (arg0 != 15795) {
            this.field7896 = false;
        }
        return this.field7916.method1470(-12);
    }
}
