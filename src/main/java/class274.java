import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class274 extends class291 {

    @OriginalMember(owner = "client!ic", name = "R", descriptor = "Leg;")
    private static class37 field4803 = class174.method1167("Cancel", -34);

    @OriginalMember(owner = "client!ic", name = "O", descriptor = "Leg;")
    public static class37 field4801 = field4803;

    @OriginalMember(owner = "client!ic", name = "eb", descriptor = "Leg;")
    public static class37 field4816 = class174.method1167("scrollen:", 102);

    @OriginalMember(owner = "client!ic", name = "fb", descriptor = "Leg;")
    public static class37 field4817 = class174.method1167("p11_full", 95);

    @OriginalMember(owner = "client!ic", name = "cb", descriptor = "Leg;")
    private static class37 field4814 = class174.method1167("Particles: ", -114);

    @OriginalMember(owner = "client!ic", name = "nb", descriptor = "I")
    public static int field4825 = 0;

    @OriginalMember(owner = "client!ic", name = "M", descriptor = "I")
    public static int field4799;

    @OriginalMember(owner = "client!ic", name = "N", descriptor = "I")
    public static int field4800;

    @OriginalMember(owner = "client!ic", name = "Q", descriptor = "I")
    public int field4802;

    @OriginalMember(owner = "client!ic", name = "S", descriptor = "I")
    public static int field4804;

    @OriginalMember(owner = "client!ic", name = "T", descriptor = "I")
    public static int field4805;

    @OriginalMember(owner = "client!ic", name = "U", descriptor = "I")
    public static int field4806;

    @OriginalMember(owner = "client!ic", name = "V", descriptor = "I")
    public static int field4807;

    @OriginalMember(owner = "client!ic", name = "W", descriptor = "I")
    public static int field4808;

    @OriginalMember(owner = "client!ic", name = "X", descriptor = "I")
    public static int field4809;

    @OriginalMember(owner = "client!ic", name = "Y", descriptor = "I")
    public static int field4810;

    @OriginalMember(owner = "client!ic", name = "Z", descriptor = "I")
    public static int field4811;

    @OriginalMember(owner = "client!ic", name = "bb", descriptor = "I")
    public int field4813;

    @OriginalMember(owner = "client!ic", name = "db", descriptor = "I")
    public static int field4815;

    @OriginalMember(owner = "client!ic", name = "gb", descriptor = "I")
    public static int field4818;

    @OriginalMember(owner = "client!ic", name = "ib", descriptor = "I")
    public static int field4820;

    @OriginalMember(owner = "client!ic", name = "jb", descriptor = "I")
    public static int field4821;

    @OriginalMember(owner = "client!ic", name = "kb", descriptor = "I")
    public static int field4822;

    @OriginalMember(owner = "client!ic", name = "lb", descriptor = "I")
    public static int field4823;

    @OriginalMember(owner = "client!ic", name = "mb", descriptor = "I")
    public int field4824;

    @OriginalMember(owner = "client!ic", name = "ab", descriptor = "Leg;")
    public class37 field4812;

    @OriginalMember(owner = "client!ic", name = "hb", descriptor = "[I")
    public static int[] field4819;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I[Lpe;IIIIIIII)V")
    public static final void method1832(int arg0, class237[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class122.method869(arg8, arg3, arg6, arg5);
        class76.method512();
        if (arg4 != 4096) {
            field4805 = 72;
        }
        ++field4818;
        for (int var10 = 0; arg1.length > var10; ++var10) {
            class237 var11 = arg1[var10];
            if (var11 != null && (var11.field4171 == arg7 || arg7 == -1412584499 && class276.field4891 == var11)) {
                int var12;
                if (arg9 != -1) {
                    var12 = arg9;
                } else {
                    class36.field524[class216.field3723] = var11.field4183 - -arg0;
                    class13.field213[class216.field3723] = var11.field4074 - -arg2;
                    class243.field4372[class216.field3723] = var11.field4067;
                    class277.field4908[class216.field3723] = var11.field4206;
                    var12 = class216.field3723++;
                }
                var11.field4108 = class72.field1146;
                var11.field4156 = var12;
                if (!var11.field4129 || !client.method789(var11)) {
                    if (~var11.field4175 < -1) {
                        class129.method914(-329, var11);
                    }
                    int var13 = var11.field4183 + arg0;
                    int var14 = var11.field4074 + arg2;
                    int var15 = var11.field4125;
                    if (class126.field2117 && (client.method787(var11) != 0 || var11.field4228 == 0) && ~var15 < -128) {
                        var15 = 127;
                    }
                    if (class276.field4891 == var11) {
                        if (arg7 != -1412584499 && !var11.field4111) {
                            class84.field1321 = arg0;
                            class190.field3262 = arg2;
                            class223.field3836 = arg1;
                            continue;
                        }
                        if (!var11.field4111) {
                            var15 = 128;
                        }
                        if (class233.field4018 && class95.field1494) {
                            int var16 = class26.field363;
                            int var17 = class268.field4689;
                            int var18 = var17 - class222.field3822;
                            if (~var18 > ~class39.field630) {
                                var18 = class39.field630;
                            }
                            int var19 = var16 - class242.field4361;
                            if (~(var11.field4206 + var18) < ~(class39.field630 - -class247.field4432.field4206)) {
                                var18 = -var11.field4206 + class247.field4432.field4206 + class39.field630;
                            }
                            if (var19 < class177.field2953) {
                                var19 = class177.field2953;
                            }
                            if (~(class177.field2953 + class247.field4432.field4067) > ~(var11.field4067 + var19)) {
                                var19 = -var11.field4067 + class247.field4432.field4067 + class177.field2953;
                            }
                            var14 = var18;
                            var13 = var19;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.field4228 == 2) {
                        var20 = arg8;
                        var21 = arg6;
                        var22 = arg5;
                        var23 = arg3;
                    } else {
                        var23 = arg3 >= var14 ? arg3 : var14;
                        int var24 = var11.field4067 + var13;
                        var20 = ~var13 >= ~arg8 ? arg8 : var13;
                        int var25 = var11.field4206 + var14;
                        if (~var11.field4228 == -10) {
                            ++var25;
                            ++var24;
                        }
                        var22 = ~arg5 >= ~var25 ? arg5 : var25;
                        var21 = var24 < arg6 ? var24 : arg6;
                    }
                    if (!var11.field4129 || ~var20 > ~var21 && ~var22 < ~var23) {
                        if (var11.field4175 != 0) {
                            if (~var11.field4175 == -1338) {
                                class60.field987 = var11;
                                class174.field2923 = var14;
                                class217.field3733 = var13;
                                class203.method1417(var13, var11.field4175 == 1403, var14, var11.field4067, arg4 ^ 4100, var11.field4206);
                                class122.method869(arg8, arg3, arg6, arg5);
                                continue;
                            }
                            if (var11.field4175 == 1338) {
                                if (!var11.method1622(24832)) {
                                    continue;
                                }
                                class277.method1864(var14, var11, var12, var13, -3087);
                                class122.method869(arg8, arg3, arg6, arg5);
                                if (~class288.field5082 != -1 && class288.field5082 != 3 || class152.field2556 || class24.field353 < var20 || var23 > field4805 || ~class24.field353 <= ~var21 || var22 <= field4805) {
                                    continue;
                                }
                                int var26 = -var13 + class24.field353;
                                int var27 = -var14 + field4805;
                                int var28 = var11.field4152[var27];
                                if (var26 < var28 || var26 > var28 - -var11.field4079[var27]) {
                                    continue;
                                }
                                int var29 = var26 - var11.field4067 / 2;
                                int var30 = var27 - var11.field4206 / 2;
                                int var31 = class279.field4933 + class25.field355 & 2047;
                                int var32 = class76.field1192[var31];
                                int var33 = class76.field1189[var31];
                                int var34 = (class172.field2884 + 256) * var32 >> 8;
                                int var35 = (class172.field2884 + 256) * var33 >> 8;
                                int var36 = var30 * var35 + -(var29 * var34) >> 11;
                                int var37 = -var36 + class82.field1285.field1793 >> 7;
                                int var38 = var29 * var35 + var30 * var34 >> 11;
                                int var39 = class82.field1285.field1799 + var38 >> 7;
                                if (class174.field2924 && (field4807 & 64) != 0) {
                                    class237 var40 = class47.method309(128, class129.field2150, class45.field709);
                                    if (var40 != null) {
                                        class87.method583(var37, var39, class140.field2415, 29782, (short) 23, 1L, class147.field2497);
                                    } else {
                                        class138.method973((byte) 77);
                                    }
                                    continue;
                                }
                                if (~class132.field2221 == -2) {
                                    class87.method583(var37, var39, class179.field2989, 29782, (short) 47, 1L, class139.field2394);
                                }
                                class87.method583(var37, var39, class179.field2989, arg4 + 25686, (short) 36, 1L, class200.field3399);
                                continue;
                            }
                            if (~var11.field4175 == -1340) {
                                if (var11.method1622(24832)) {
                                    class108.method737(var13, var12, var11, 256, var14);
                                    class122.method869(arg8, arg3, arg6, arg5);
                                }
                                continue;
                            }
                            if (var11.field4175 == 1400) {
                                class40.method272(var13, var11.field4206, var14, var11.field4067, arg4 ^ 4108);
                                class154.field2597[var12] = true;
                                class255.field4528[var12] = true;
                                class122.method869(arg8, arg3, arg6, arg5);
                                continue;
                            }
                            if (var11.field4175 == 1401) {
                                class28.method163(var11.field4067, var14, var11.field4206, var13, (byte) 20);
                                class154.field2597[var12] = true;
                                class255.field4528[var12] = true;
                                class122.method869(arg8, arg3, arg6, arg5);
                                continue;
                            }
                            if (var11.field4175 == 1402) {
                                class242.method1673(var13, -76, var14);
                                class154.field2597[var12] = true;
                                class255.field4528[var12] = true;
                                continue;
                            }
                            if (~var11.field4175 == -1406) {
                                if (!class243.field4373) {
                                    continue;
                                }
                                int var41 = var11.field4067 + var13;
                                int var42 = var14 + 15;
                                int var43 = 16776960;
                                class109.field1810.method1220(class156.method1061((byte) -53, new class37[] { class187.field3188, class163.method1096(class131.field2178, (byte) -35) }), var41, var42, 16776960, -1);
                                int var130 = var42 + 15;
                                Runtime var44 = Runtime.getRuntime();
                                int var45 = (int) ((var44.totalMemory() - var44.freeMemory()) / 1024L);
                                if (~var45 < -65537) {
                                    var43 = 16711680;
                                }
                                class109.field1810.method1220(class156.method1061((byte) -69, new class37[] { class178.field2971, class163.method1096(var45, (byte) -35), class291.field5121 }), var41, var130, var43, -1);
                                int var46 = 16776960;
                                int var47 = 0;
                                int var48 = 0;
                                var42 = var130 + 15;
                                int var49 = 0;
                                for (int var50 = 0; ~var50 > -29; ++var50) {
                                    var48 += class227.field3902[var50].method1812(false);
                                    var47 += class227.field3902[var50].method1810(false);
                                    var49 += class227.field3902[var50].method1809(-82);
                                }
                                int var51 = var49 * 100 / var48;
                                int var52 = var47 * 10000 / var48;
                                class37 var53 = class156.method1061((byte) -118, new class37[] { class168.field2804, class226.method1565(0, (long) var52, true, 2, -27888), class173.field2900, class163.method1096(var51, (byte) -35), class79.field1220 });
                                class92.field1431.method1220(var53, var41, var42, var46, -1);
                                var42 += 12;
                                if (~class193.field3303 < -1) {
                                    class92.field1431.method1220(class156.method1061((byte) 67, new class37[] { field4814, class163.method1096(class193.field3304, (byte) -35), class284.field5007, class163.method1096(class193.field3303, (byte) -35) }), var41, var42, var46, -1);
                                }
                                var42 += 12;
                                class154.field2597[var12] = true;
                                class255.field4528[var12] = true;
                                continue;
                            }
                            if (~var11.field4175 == -1407) {
                                class170.field2831 = var13;
                                class45.field698 = var14;
                                class73.field1160 = var11;
                                continue;
                            }
                        }
                        if (!class152.field2556) {
                            if (~var11.field4228 == -1 && var11.field4219 && ~var20 >= ~class24.field353 && ~var23 >= ~field4805 && ~class24.field353 > ~var21 && var22 > field4805 && !class126.field2117) {
                                class159.field2661 = 1;
                                class40.field645[0] = field4801;
                                class264.field4642[0] = 1001;
                                class160.field2663[0] = class179.field2989;
                            }
                            if (~class24.field353 <= ~var20 && var23 <= field4805 && ~var21 < ~class24.field353 && ~field4805 > ~var22) {
                                class202.method1412(var11, field4805 - var14, false, -var13 + class24.field353);
                            }
                        }
                        if (var11.field4228 == 0) {
                            if (!var11.field4129 && client.method789(var11) && class232.field3995 != var11) {
                                continue;
                            }
                            if (!var11.field4129) {
                                if (~var11.field4122 < ~(-var11.field4206 + var11.field4090)) {
                                    var11.field4122 = -var11.field4206 + var11.field4090;
                                }
                                if (var11.field4122 < 0) {
                                    var11.field4122 = 0;
                                }
                            }
                            method1832(-var11.field4136 + var13, arg1, -var11.field4122 + var14, var23, 4096, var22, var21, var11.field4211, var20, var12);
                            if (var11.field4194 != null) {
                                method1832(-var11.field4136 + var13, var11.field4194, var14 - var11.field4122, var23, 4096, var22, var21, var11.field4211, var20, var12);
                            }
                            class190 var54 = (class190) class120.field2022.method992((byte) 125, (long) var11.field4211);
                            if (var54 != null) {
                                if (var54.field3270 == 0 && !class152.field2556 && class24.field353 >= var20 && ~field4805 <= ~var23 && class24.field353 < var21 && ~var22 < ~field4805 && !class126.field2117) {
                                    class264.field4642[0] = 1001;
                                    class40.field645[0] = field4801;
                                    class160.field2663[0] = class179.field2989;
                                    class159.field2661 = 1;
                                }
                                class252.method1723(var22, var21, var14, var13, var12, var54.field3259, -60, var20, var23);
                            }
                            class122.method869(arg8, arg3, arg6, arg5);
                            class76.method512();
                        }
                        if (class52.field813[var12] || ~class147.field2495 < -2) {
                            if (~var11.field4228 == -1 && !var11.field4129 && var11.field4090 > var11.field4206) {
                                class100.method648(var11.field4122, var11.field4090, var14, var11.field4206, var11.field4067 + var13, 16);
                            }
                            if (~var11.field4228 != -2) {
                                if (~var11.field4228 == -3) {
                                    int var55 = 0;
                                    for (int var56 = 0; ~var56 > ~var11.field4172; ++var56) {
                                        for (int var57 = 0; ~var11.field4141 < ~var57; ++var57) {
                                            int var58 = (var11.field4071 + 32) * var57 + var13;
                                            int var59 = var14 - -((32 - -var11.field4066) * var56);
                                            if (~var55 > -21) {
                                                var58 += var11.field4213[var55];
                                                var59 += var11.field4201[var55];
                                            }
                                            if (~var11.field4094[var55] >= -1) {
                                                if (var11.field4187 != null && var55 < 20) {
                                                    class105 var60 = var11.method1628(arg4 + -4140, var55);
                                                    if (var60 != null) {
                                                        var60.method702(var58, var59);
                                                    } else if (class210.field3616) {
                                                        class121.method856(24665, var11);
                                                    }
                                                }
                                            } else {
                                                boolean var61 = false;
                                                int var62 = var11.field4094[var55] + -1;
                                                boolean var63 = false;
                                                if (~(var58 - -32) < ~arg8 && ~var58 > ~arg6 && var59 - -32 > arg3 && var59 < arg5 || class198.field3376 == var11 && class290.field5111 == var55) {
                                                    class105 var64;
                                                    if (~class23.field292 == -2 && ~class194.field3330 == ~var55 && class214.field3706 == var11.field4211) {
                                                        var64 = class222.method1551(0, 2, var11.field4127, var62, -94, var11.field4123[var55]);
                                                    } else {
                                                        var64 = class222.method1551(3153952, 1, var11.field4127, var62, -111, var11.field4123[var55]);
                                                    }
                                                    if (class76.field1191) {
                                                        class154.field2597[var12] = true;
                                                    }
                                                    if (var64 == null) {
                                                        class121.method856(arg4 ^ 28761, var11);
                                                    } else if (class198.field3376 == var11 && class290.field5111 == var55) {
                                                        int var65 = class268.field4689 - class262.field4616;
                                                        int var66 = class26.field363 - class139.field2393;
                                                        if (var65 < 5 && var65 > -5) {
                                                            var65 = 0;
                                                        }
                                                        if (var66 < 5 && var66 > -5) {
                                                            var66 = 0;
                                                        }
                                                        if (class200.field3402 < 5) {
                                                            var66 = 0;
                                                            var65 = 0;
                                                        }
                                                        var64.method695(var58 + var66, var59 + var65, 128);
                                                        if (~arg7 != 0) {
                                                            int var67 = class122.field2054;
                                                            int var68 = class122.field2055;
                                                            class237 var69 = arg1[arg7 & 65535];
                                                            if (~(var59 + var65) > ~var68 && var69.field4122 > 0) {
                                                                int var70 = (var68 - (var59 - -var65)) * class259.field4588 / 3;
                                                                if (~var70 < ~(class259.field4588 * 10)) {
                                                                    var70 = class259.field4588 * 10;
                                                                }
                                                                if (~var70 < ~var69.field4122) {
                                                                    var70 = var69.field4122;
                                                                }
                                                                var69.field4122 -= var70;
                                                                class262.field4616 += var70;
                                                                class121.method856(24665, var69);
                                                            }
                                                            if (~var67 > ~(var59 + var65 + 32) && ~(var69.field4090 - var69.field4206) < ~var69.field4122) {
                                                                int var71 = (var59 - -var65 + -var67 + 32) * class259.field4588 / 3;
                                                                if (~(class259.field4588 * 10) > ~var71) {
                                                                    var71 = class259.field4588 * 10;
                                                                }
                                                                if (var71 > -var69.field4122 + var69.field4090 - var69.field4206) {
                                                                    var71 = -var69.field4206 + var69.field4090 + -var69.field4122;
                                                                }
                                                                class262.field4616 -= var71;
                                                                var69.field4122 += var71;
                                                                class121.method856(24665, var69);
                                                            }
                                                        }
                                                    } else if (class60.field986 == var11 && class269.field4701 == var55) {
                                                        var64.method695(var58, var59, 128);
                                                    } else {
                                                        var64.method702(var58, var59);
                                                    }
                                                }
                                            }
                                            ++var55;
                                        }
                                    }
                                } else if (var11.field4228 == 3) {
                                    int var72;
                                    if (!class170.method1140(false, var11)) {
                                        var72 = var11.field4124;
                                        if (class232.field3995 == var11 && ~var11.field4182 != -1) {
                                            var72 = var11.field4182;
                                        }
                                    } else {
                                        var72 = var11.field4169;
                                        if (class232.field3995 == var11 && var11.field4117 != 0) {
                                            var72 = var11.field4117;
                                        }
                                    }
                                    if (~var15 == -1) {
                                        if (!var11.field4103) {
                                            class122.method861(var13, var14, var11.field4067, var11.field4206, var72);
                                        } else {
                                            class122.method873(var13, var14, var11.field4067, var11.field4206, var72);
                                        }
                                    } else if (var11.field4103) {
                                        class122.method860(var13, var14, var11.field4067, var11.field4206, var72, -(255 & var15) + 256);
                                    } else {
                                        class122.method863(var13, var14, var11.field4067, var11.field4206, var72, -(255 & var15) + 256);
                                    }
                                } else if (~var11.field4228 == -5) {
                                    class183 var73 = var11.method1634((byte) 68, class165.field2748);
                                    if (var73 == null) {
                                        if (class210.field3616) {
                                            class121.method856(24665, var11);
                                        }
                                    } else {
                                        class37 var74 = var11.field4098;
                                        int var75;
                                        if (class170.method1140(false, var11)) {
                                            var75 = var11.field4169;
                                            if (class232.field3995 == var11 && var11.field4117 != 0) {
                                                var75 = var11.field4117;
                                            }
                                            if (var11.field4081.method222((byte) -22) > 0) {
                                                var74 = var11.field4081;
                                            }
                                        } else {
                                            var75 = var11.field4124;
                                            if (class232.field3995 == var11 && ~var11.field4182 != -1) {
                                                var75 = var11.field4182;
                                            }
                                        }
                                        if (var11.field4129 && ~var11.field4080 != 0) {
                                            class241 var76 = class9.method52(true, var11.field4080);
                                            var74 = var76.field4325;
                                            if (var74 == null) {
                                                var74 = class82.field1287;
                                            }
                                            if ((~var76.field4316 == -2 || ~var11.field4200 != -2) && ~var11.field4200 != 0) {
                                                var74 = class156.method1061((byte) -118, new class37[] { class203.field3461, var74, class256.field4548, class117.method834(var11.field4200, 111) });
                                            }
                                        }
                                        if (class224.field3840 == var11) {
                                            var75 = var11.field4124;
                                            var74 = class47.field750;
                                        }
                                        if (!var11.field4129) {
                                            var74 = class162.method1090((byte) -58, var74, var11);
                                        }
                                        var73.method1213(var74, var13, var14, var11.field4067, var11.field4206, var75, !var11.field4164 ? -1 : 0, var11.field4087, var11.field4118, var11.field4078);
                                    }
                                } else if (~var11.field4228 == -6) {
                                    if (!var11.field4129) {
                                        class105 var77 = var11.method1627(class170.method1140(false, var11), 1);
                                        if (var77 == null) {
                                            if (class210.field3616) {
                                                class121.method856(24665, var11);
                                            }
                                        } else {
                                            var77.method702(var13, var14);
                                        }
                                    } else {
                                        class105 var78;
                                        if (var11.field4080 != -1) {
                                            var78 = class222.method1551(var11.field4144, var11.field4195, var11.field4127, var11.field4080, 56, var11.field4200);
                                        } else {
                                            var78 = var11.method1627(false, 1);
                                        }
                                        if (var78 == null) {
                                            if (class210.field3616) {
                                                class121.method856(24665, var11);
                                            }
                                        } else {
                                            int var79 = var78.field1636;
                                            int var80 = var78.field1633;
                                            if (!var11.field4131) {
                                                int var81 = var11.field4067 * 4096 / var79;
                                                if (~var11.field4163 == -1) {
                                                    if (var15 != 0) {
                                                        var78.method703(var13, var14, var11.field4067, var11.field4206, -(var15 & 255) + 256);
                                                    } else if (~var11.field4067 == ~var79 && ~var11.field4206 == ~var80) {
                                                        var78.method702(var13, var14);
                                                    } else {
                                                        var78.method700(var13, var14, var11.field4067, var11.field4206);
                                                    }
                                                } else {
                                                    var78.method699((byte) -27, var11.field4206 / 2 + var14, var81, var11.field4163, var13 - -(var11.field4067 / 2));
                                                }
                                            } else {
                                                int var82 = (var11.field4067 - (-var79 - -1)) / var79;
                                                int var83 = (var11.field4206 + var80 - 1) / var80;
                                                class122.method879(var13, var14, var11.field4067 + var13, var11.field4206 + var14);
                                                for (int var84 = 0; ~var84 > ~var82; ++var84) {
                                                    for (int var85 = 0; var83 > var85; ++var85) {
                                                        if (~var11.field4163 != -1) {
                                                            var78.method699((byte) -27, var80 / 2 + var14 - -(var80 * var85), 4096, var11.field4163, var79 / 2 + var79 * var84 + var13);
                                                        } else if (var15 != 0) {
                                                            var78.method695(var13 - -(var79 * var84), var80 * var85 + var14, -(255 & var15) + 256);
                                                        } else {
                                                            var78.method702(var13 - -(var79 * var84), var14 - -(var80 * var85));
                                                        }
                                                    }
                                                }
                                                class122.method869(arg8, arg3, arg6, arg5);
                                            }
                                        }
                                    }
                                } else if (var11.field4228 == 6) {
                                    boolean var86 = class170.method1140(false, var11);
                                    int var87;
                                    if (!var86) {
                                        var87 = var11.field4181;
                                    } else {
                                        var87 = var11.field4209;
                                    }
                                    class253 var88 = null;
                                    int var89 = 0;
                                    if (~var11.field4080 == 0) {
                                        if (~var11.field4119 == -6) {
                                            if (~var11.field4085 != 0) {
                                                int var90 = var11.field4085 & 2047;
                                                if (~class116.field1986 == ~var90) {
                                                    var90 = 2047;
                                                }
                                                class188 var91 = class98.field1526[var90];
                                                class2 var92 = var87 != -1 ? class186.method1242(arg4 ^ 4096, var87) : null;
                                                if (var91 != null && ~((int) var91.field3235.method217((byte) -102) << 11) == ~(var11.field4085 & -2048)) {
                                                    var88 = var91.field3217.method1915(arg4 + -4084, var11.field4165, 0, true, var92, (class2) null);
                                                }
                                            } else {
                                                var88 = class239.field4255.method1915(arg4 + -4084, -1, -1, true, (class2) null, (class2) null);
                                            }
                                        } else if (~var87 != 0) {
                                            class2 var93 = class186.method1242(0, var87);
                                            var88 = var11.method1633(var11.field4165, class82.field1285.field3217, var93, 77, var86);
                                            if (var88 == null && class210.field3616) {
                                                class121.method856(arg4 ^ 28761, var11);
                                            }
                                        } else {
                                            var88 = var11.method1633(-1, class82.field1285.field3217, (class2) null, 8, var86);
                                            if (var88 == null && class210.field3616) {
                                                class121.method856(24665, var11);
                                            }
                                        }
                                    } else {
                                        class241 var94 = class9.method52(true, var11.field4080);
                                        if (var94 != null) {
                                            class241 var95 = var94.method1657(arg4 ^ -4097, var11.field4200);
                                            class2 var96 = ~var87 != 0 ? class186.method1242(0, var87) : null;
                                            var88 = var95.method1661(0, 1, var11.field4165, var96);
                                            if (var88 == null) {
                                                class121.method856(arg4 ^ 28761, var11);
                                            } else {
                                                var89 = -var88.method308() / 2;
                                            }
                                        }
                                    }
                                    if (var88 != null) {
                                        int var97;
                                        if (var11.field4073 > 0) {
                                            var97 = (var11.field4067 << 8) / var11.field4073;
                                        } else {
                                            var97 = 256;
                                        }
                                        int var98;
                                        if (var11.field4186 <= 0) {
                                            var98 = 256;
                                        } else {
                                            var98 = (var11.field4206 << 8) / var11.field4186;
                                        }
                                        int var99 = var11.field4206 / 2 + (var11.field4197 * var98 >> 8) + var14;
                                        int var100 = var13 - -(var11.field4067 / 2) - -(var11.field4112 * var97 >> 8);
                                        class76.method508(var100, var99);
                                        int var101 = class76.field1192[var11.field4107] * var11.field4192 >> 16;
                                        int var102 = class76.field1189[var11.field4107] * var11.field4192 >> 16;
                                        if (var11.field4129) {
                                            if (!var11.field4089) {
                                                var88.method1471(0, var11.field4145, var11.field4162, var11.field4107, var11.field4199, var11.field4130 + var89 + var101, var11.field4130 + var102, -1L);
                                            } else {
                                                ((class209) var88).method1452(0, var11.field4145, var11.field4162, var11.field4107, var11.field4199, var89 + var101 - -var11.field4130, var11.field4130 + var102, var11.field4192);
                                            }
                                        } else {
                                            var88.method1471(0, var11.field4145, 0, var11.field4107, 0, var101, var102, -1L);
                                        }
                                        class76.method511();
                                    }
                                } else {
                                    if (~var11.field4228 == -8) {
                                        class183 var103 = var11.method1634((byte) 67, class165.field2748);
                                        if (var103 == null) {
                                            if (class210.field3616) {
                                                class121.method856(24665, var11);
                                            }
                                            continue;
                                        }
                                        int var104 = 0;
                                        for (int var105 = 0; var105 < var11.field4172; ++var105) {
                                            for (int var106 = 0; ~var11.field4141 < ~var106; ++var106) {
                                                if (~var11.field4094[var104] < -1) {
                                                    class241 var107 = class9.method52(true, var11.field4094[var104] + -1);
                                                    class37 var108;
                                                    if (var107.field4316 != 1 && ~var11.field4123[var104] == -2) {
                                                        var108 = class156.method1061((byte) 117, new class37[] { class203.field3461, var107.field4325, class177.field2962 });
                                                    } else {
                                                        var108 = class156.method1061((byte) 100, new class37[] { class203.field3461, var107.field4325, class256.field4548, class117.method834(var11.field4123[var104], 65) });
                                                    }
                                                    int var109 = (var11.field4066 + 12) * var105 + var14;
                                                    int var110 = (var11.field4071 + 115) * var106 + var13;
                                                    if (~var11.field4087 == -1) {
                                                        var103.method1226(var108, var110, var109, var11.field4124, !var11.field4164 ? -1 : 0);
                                                    } else if (~var11.field4087 == -2) {
                                                        var103.method1203(var108, var110 + 57, var109, var11.field4124, var11.field4164 ? 0 : -1);
                                                    } else {
                                                        var103.method1220(var108, var110 + 115 + -1, var109, var11.field4124, var11.field4164 ? 0 : -1);
                                                    }
                                                }
                                                ++var104;
                                            }
                                        }
                                    }
                                    if (~var11.field4228 == -9 && class184.field3097 == var11 && class69.field1104 == class279.field4936) {
                                        int var111 = 0;
                                        class183 var112 = class109.field1810;
                                        int var113 = 0;
                                        class37 var114 = var11.field4098;
                                        class37 var115 = class162.method1090((byte) -58, var114, var11);
                                        while (var115.method222((byte) -117) > 0) {
                                            int var123 = var115.method220(class98.field1520, (byte) 78);
                                            class37 var124;
                                            if (var123 == -1) {
                                                var124 = var115;
                                                var115 = class179.field2989;
                                            } else {
                                                var124 = var115.method247(0, var123, arg4 ^ 4096);
                                                var115 = var115.method263(var123 - -4, false);
                                            }
                                            int var125 = var112.method1211(var124);
                                            if (~var111 > ~var125) {
                                                var111 = var125;
                                            }
                                            var113 += var112.field3048 + 1;
                                        }
                                        var113 += 7;
                                        var111 += 6;
                                        int var116 = -var111 + var13 + var11.field4067 + -5;
                                        if (~(var13 + 5) < ~var116) {
                                            var116 = var13 + 5;
                                        }
                                        int var117 = var11.field4206 + var14 + 5;
                                        if (~arg5 > ~(var113 + var117)) {
                                            var117 = -var113 + arg5;
                                        }
                                        if (~arg6 > ~(var111 + var116)) {
                                            var116 = arg6 - var111;
                                        }
                                        class122.method873(var116, var117, var111, var113, 16777120);
                                        class122.method861(var116, var117, var111, var113, 0);
                                        class37 var118 = var11.field4098;
                                        int var119 = var112.field3048 + var117 + 2;
                                        class37 var120 = class162.method1090((byte) -58, var118, var11);
                                        while (var120.method222((byte) 97) > 0) {
                                            int var121 = var120.method220(class98.field1520, (byte) 93);
                                            class37 var122;
                                            if (~var121 == 0) {
                                                var122 = var120;
                                                var120 = class179.field2989;
                                            } else {
                                                var122 = var120.method247(0, var121, arg4 ^ 4096);
                                                var120 = var120.method263(var121 + 4, false);
                                            }
                                            var112.method1226(var122, var116 + 3, var119, 0, -1);
                                            var119 += var112.field3048 + 1;
                                        }
                                    }
                                    if (var11.field4228 == 9) {
                                        int var126;
                                        int var127;
                                        int var128;
                                        int var129;
                                        if (var11.field4158) {
                                            var126 = var13 - -var11.field4067;
                                            var127 = var14;
                                            var128 = var13;
                                            var129 = var11.field4206 + var14;
                                        } else {
                                            var128 = var13;
                                            var127 = var11.field4206 + var14;
                                            var126 = var11.field4067 + var13;
                                            var129 = var14;
                                        }
                                        if (~var11.field4115 == -2) {
                                            class122.method864(var128, var129, var126, var127, var11.field4124);
                                        } else {
                                            class122.method878(var128, var129, var126, var127, var11.field4124, var11.field4115);
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

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "(I)I")
    public final int method1833(int arg0) {
        if (arg0 != -1904584224) {
            field4805 = -18;
        }
        ++field4822;
        return (int) (super.field1027 >>> 32 & 255L);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIZIII)V")
    public static final void method1834(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        if (!arg4) {
            method1844(-31);
        }
        ++field4810;
        if (~arg1 <= -2 && ~arg5 <= -2 && arg1 <= 102 && arg5 <= 102) {
            if (!class72.method492(-2001) && (class241.field4312[0][arg1][arg5] & 2) == 0) {
                int var8 = arg3;
                if (~(class241.field4312[arg3][arg1][arg5] & 8) != -1) {
                    var8 = 0;
                }
                if (class73.field1149 != var8) {
                    return;
                }
            }
            int var9 = arg3;
            if (~arg3 > -4 && ~(class241.field4312[1][arg1][arg5] & 2) == -3) {
                var9 = arg3 + 1;
            }
            class130.method928(var9, arg6, arg1, arg3, class215.field3719[arg3], (byte) -127, arg5);
            if (arg2 >= 0) {
                boolean var10 = class271.field4754;
                class271.field4754 = true;
                class71.method485(arg3, false, arg2, arg7, false, class215.field3719[arg3], -32264, arg0, var9, arg5, arg1);
                class271.field4754 = var10;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "(I)V")
    public final void method1835(int arg0) {
        if (arg0 < -20) {
            ++field4808;
            super.field5125 |= Long.MIN_VALUE;
            if (this.method1836(-1) == 0L) {
                class224.field3846.method1152(71, this);
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "(I)J")
    public final long method1836(int arg0) {
        ++field4820;
        return arg0 != -1 ? 117L : Long.MAX_VALUE & super.field5125;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZBII[Laf;[BII)V")
    public static final void method1837(boolean arg0, byte arg1, int arg2, int arg3, class165[] arg4, byte[] arg5, int arg6, int arg7) {
        byte var8;
        if (!arg0) {
            var8 = 4;
        } else {
            var8 = 1;
        }
        ++field4799;
        if (!arg0) {
            for (int var9 = 0; var9 < 4; ++var9) {
                for (int var10 = 0; var10 < 64; ++var10) {
                    for (int var11 = 0; var11 < 64; ++var11) {
                        if (~(arg2 - -var10) < -1 && ~(arg2 + var10) > -104 && ~(arg3 + var11) < -1 && arg3 - -var11 < 103) {
                            arg4[var9].field2738[arg2 + var10][arg3 - -var11] = class96.method626(arg4[var9].field2738[arg2 + var10][arg3 - -var11], -16777217);
                        }
                    }
                }
            }
        }
        class187 var12 = new class187(arg5);
        for (int var13 = 0; var13 < var8; ++var13) {
            for (int var37 = 0; var37 < 64; ++var37) {
                for (int var38 = 0; var38 < 64; ++var38) {
                    class154.method1053(arg2 + var37, arg0, arg6, (byte) 48, arg7, var12, var13, 0, arg3 + var38);
                }
            }
        }
        int var14 = -114 / ((-52 - arg1) / 61);
        boolean var15 = false;
        while (~var12.field3175.length < ~var12.field3169) {
            int var16 = var12.method1268(255);
            if (var16 != 129) {
                --var12.field3169;
                break;
            }
            for (int var22 = 0; var22 < 4; ++var22) {
                byte var23 = var12.method1269(255);
                if (var23 != 0) {
                    if (~var23 != -2) {
                        if (var23 == 2 && ~var22 < -1) {
                            int var24 = arg2;
                            int var25 = arg2 + 64;
                            if (~var25 > -1) {
                                var25 = 0;
                            } else if (var25 >= 104) {
                                var25 = 104;
                            }
                            if (~arg2 <= -1) {
                                if (~arg2 <= -105) {
                                    var24 = 104;
                                }
                            } else {
                                var24 = 0;
                            }
                            int var26 = arg3;
                            if (~arg3 <= -1) {
                                if (arg3 >= 104) {
                                    var26 = 104;
                                }
                            } else {
                                var26 = 0;
                            }
                            int var27 = arg3 + 64;
                            if (~var27 <= -1) {
                                if (var27 >= 104) {
                                    var27 = 104;
                                }
                            } else {
                                var27 = 0;
                            }
                            while (var25 > var24) {
                                while (~var26 > ~var27) {
                                    class19.field257[var22][var24][var26] = class19.field257[var22 + -1][var24][var26];
                                    ++var26;
                                }
                                ++var24;
                            }
                        }
                    } else {
                        for (int var28 = 0; var28 < 64; var28 += 4) {
                            for (int var29 = 0; var29 < 64; var29 += 4) {
                                byte var30 = var12.method1269(255);
                                for (int var31 = var28 - -arg2; ~(var28 - (-arg2 - 4)) < ~var31; ++var31) {
                                    for (int var32 = arg3 + var29; ~(arg3 - -4 + var29) < ~var32; ++var32) {
                                        if (~var31 <= -1 && ~var31 > -105 && ~var32 <= -1 && ~var32 > -105) {
                                            class19.field257[var22][var31][var32] = var30;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    int var33 = arg3 + 64;
                    int var34 = arg3;
                    int var35 = arg2 + 64;
                    if (var35 < 0) {
                        var35 = 0;
                    } else if (~var35 <= -105) {
                        var35 = 104;
                    }
                    if (~var33 > -1) {
                        var33 = 0;
                    } else if (~var33 <= -105) {
                        var33 = 104;
                    }
                    int var36 = arg2;
                    if (arg3 >= 0) {
                        if (~arg3 <= -105) {
                            var34 = 104;
                        }
                    } else {
                        var34 = 0;
                    }
                    if (arg2 < 0) {
                        var36 = 0;
                    } else if (~arg2 <= -105) {
                        var36 = 104;
                    }
                    while (~var35 < ~var36) {
                        while (~var33 < ~var34) {
                            class19.field257[var22][var36][var34] = 0;
                            ++var34;
                        }
                        ++var36;
                    }
                }
            }
            var15 = true;
        }
        if (!var15) {
            for (int var17 = 0; ~var17 > -5; ++var17) {
                for (int var18 = 0; ~var18 > -17; ++var18) {
                    for (int var19 = 0; ~var19 > -17; ++var19) {
                        int var20 = (arg2 >> 2) - -var18;
                        int var21 = (arg3 >> 2) - -var19;
                        if (~var20 <= -1 && var20 < 26 && var21 >= 0 && ~var21 > -27) {
                            class19.field257[var17][var20][var21] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(B)V")
    public static final void method1838(byte arg0) {
        class273.field4790.method1403(45);
        int var1 = -75 / ((arg0 - -10) / 58);
        ++field4811;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BILeg;Leg;)V")
    public static final void method1839(byte arg0, int arg1, class37 arg2, class37 arg3) {
        if (arg0 < -42) {
            ++field4804;
            class102.method686(-1, arg2, (byte) 51, (class37) null, arg1, arg3);
        }
    }

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "(I)V")
    public final void method1840(int arg0) {
        super.field5125 = 500L + class149.method1024(-14898) | Long.MIN_VALUE & super.field5125;
        if (arg0 == 10000) {
            ++field4821;
            class120.field2028.method1152(114, this);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lec;I)V")
    public static final void method1841(class85 arg0, int arg1) {
        class72.method487(true, 200000, arg0);
        ++field4800;
        int var2 = 34 / ((arg1 - -12) / 38);
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(B)V")
    public static void method1842(byte arg0) {
        field4817 = null;
        field4819 = null;
        field4803 = null;
        field4816 = null;
        field4801 = null;
        if (arg0 == 0) {
            field4814 = null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(II)V")
    public class274(int arg0, int arg1) {
        super.field1027 = (long) arg0 << 32 | (long) arg1;
    }

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "(I)I")
    public final int method1843(int arg0) {
        if (arg0 != 0) {
            return 28;
        } else {
            ++field4809;
            return (int) super.field1027;
        }
    }

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "(I)V")
    public static final void method1844(int arg0) {
        ++field4806;
        try {
            int var1 = 42 / ((arg0 - -83) / 42);
            if (~class120.field2029 == -2) {
                int var2 = class73.field1158.method753((byte) -97);
                if (var2 > 0 && class73.field1158.method722(2)) {
                    int var3 = var2 - class75.field1171;
                    if (~var3 > -1) {
                        var3 = 0;
                    }
                    class73.field1158.method754(-5758, var3);
                } else {
                    class73.field1158.method755(false);
                    class73.field1158.method756(-2);
                    if (class269.field4697 != null) {
                        class120.field2029 = 2;
                    } else {
                        class120.field2029 = 0;
                    }
                    class244.field4397 = null;
                    class33.field478 = null;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            class73.field1158.method755(false);
            class244.field4397 = null;
            class120.field2029 = 0;
            class33.field478 = null;
            class269.field4697 = null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(II)Lib;")
    public static final class56 method1845(int arg0, int arg1) {
        if (arg0 != 2) {
            method1837(false, (byte) 33, 53, 97, (class165[]) null, (byte[]) null, -87, 17);
        }
        class56 var2 = (class56) class244.field4381.method1411(-5, (long) arg1);
        ++field4823;
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class139.field2372.method666(arg1, 0, (byte) -51);
            class56 var4 = new class56();
            if (var3 != null) {
                var4.method364(-5883, new class187(var3));
            }
            var4.method366(-97);
            class244.field4381.method1404((long) arg1, false, var4);
            return var4;
        }
    }
}
