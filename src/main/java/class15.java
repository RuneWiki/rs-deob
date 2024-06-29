import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class15 extends class139 {

    @OriginalMember(owner = "client!bd", name = "vb", descriptor = "Lsg;")
    public static class169 field323 = class165.method1060("da dieser Computer gegen unsere ", 1536);

    @OriginalMember(owner = "client!bd", name = "xb", descriptor = "Lsg;")
    private static class169 field325 = class165.method1060("Checking for updates )2 ", 1536);

    @OriginalMember(owner = "client!bd", name = "wb", descriptor = "I")
    public static int field324 = -1;

    @OriginalMember(owner = "client!bd", name = "tb", descriptor = "Lsg;")
    public static class169 field321 = field325;

    @OriginalMember(owner = "client!bd", name = "Bb", descriptor = "Lsg;")
    public static class169 field329 = class165.method1060("Sprites geladen)3", 1536);

    @OriginalMember(owner = "client!bd", name = "sb", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!bd", name = "ub", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!bd", name = "yb", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!bd", name = "zb", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!bd", name = "Ab", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(II[Lqf;IIIIBII)V")
    public static final void method87(int arg0, int arg1, class150[] arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9) {
        ++field320;
        if (arg7 != -101) {
            method87(-109, 125, (class150[]) null, -53, -4, 94, -94, (byte) 26, -115, 109);
        }
        class130.method851(arg0, arg1, arg6, arg5);
        class12.method82();
        for (int var10 = 0; var10 < arg2.length; ++var10) {
            class150 var11 = arg2[var10];
            if (var11 != null && (~var11.field2893 == ~arg8 || ~arg8 == 1412584498 && class37.field726 == var11)) {
                int var12;
                if (~arg4 != 0) {
                    var12 = arg4;
                } else {
                    class63.field1164[class201.field3930] = var11.field2805 + arg9;
                    class85.field1570[class201.field3930] = var11.field2903 - -arg3;
                    class107.field1952[class201.field3930] = var11.field2875;
                    class112.field2055[class201.field3930] = var11.field2770;
                    var12 = class201.field3930++;
                }
                var11.field2851 = var12;
                var11.field2798 = class162.field3107;
                if (!var11.field2778 || !class187.method1233(var11, arg7 + 101)) {
                    if (var11.field2872 > 0) {
                        class120.method749(var11, arg7 + 106);
                    }
                    int var13 = var11.field2805 + arg9;
                    int var14 = var11.field2902;
                    int var15 = var11.field2903 + arg3;
                    if (class37.field726 == var11) {
                        if (~arg8 != 1412584498 && !var11.field2864) {
                            class190.field3752 = arg9;
                            class99.field1857 = arg2;
                            class8.field212 = arg3;
                            continue;
                        }
                        if (!var11.field2864) {
                            var14 = 128;
                        }
                        if (class7.field184 && class56.field1024) {
                            int var16 = class150.field2806;
                            int var17 = var16 - class172.field3331;
                            int var18 = class22.field459;
                            int var19 = var18 - class44.field818;
                            if (class64.field1189 > var17) {
                                var17 = class64.field1189;
                            }
                            if (~var19 > ~class69.field1291) {
                                var19 = class69.field1291;
                            }
                            if (class64.field1189 + class180.field3498.field2770 < var11.field2770 + var17) {
                                var17 = class64.field1189 + class180.field3498.field2770 + -var11.field2770;
                            }
                            if (~(class69.field1291 + class180.field3498.field2875) > ~(var11.field2875 + var19)) {
                                var19 = class69.field1291 - (-class180.field3498.field2875 - -var11.field2875);
                            }
                            var15 = var17;
                            var13 = var19;
                        }
                    }
                    int var25;
                    int var27;
                    int var28;
                    int var29;
                    if (var11.field2882 != 2) {
                        if (var11.field2882 == 9) {
                            int var20 = var13;
                            int var21 = var15;
                            int var22 = var11.field2875 + var13;
                            int var23 = var11.field2770 + var15;
                            if (var22 < var13) {
                                var20 = var22;
                                var22 = var13;
                            }
                            var25 = var20 > arg0 ? var20 : arg0;
                            ++var22;
                            if (var23 < var15) {
                                var21 = var23;
                                var23 = var15;
                            }
                            var27 = ~var21 >= ~arg1 ? arg1 : var21;
                            var28 = ~var22 <= ~arg6 ? arg6 : var22;
                            ++var23;
                            var29 = var23 >= arg5 ? arg5 : var23;
                        } else {
                            var27 = ~var15 >= ~arg1 ? arg1 : var15;
                            var25 = ~arg0 > ~var13 ? var13 : arg0;
                            int var30 = var13 - -var11.field2875;
                            var28 = ~var30 <= ~arg6 ? arg6 : var30;
                            int var31 = var11.field2770 + var15;
                            var29 = ~var31 <= ~arg5 ? arg5 : var31;
                        }
                    } else {
                        var28 = arg6;
                        var27 = arg1;
                        var29 = arg5;
                        var25 = arg0;
                    }
                    if (!var11.field2778 || var25 < var28 && ~var27 > ~var29) {
                        if (~var11.field2872 != -1) {
                            if (var11.field2872 == 1337) {
                                class174.field3356 = var15;
                                class182.field3550 = var13;
                                class145.method955(var13, var15, var11.field2770, var11.field2875, 16808);
                                class130.method851(arg0, arg1, arg6, arg5);
                                continue;
                            }
                            if (~var11.field2872 == -1339) {
                                class81.method489(var13, var15, 22896, var12);
                                class130.method851(arg0, arg1, arg6, arg5);
                                continue;
                            }
                        }
                        int var32 = class22.field459;
                        int var33 = class150.field2806;
                        if (!class189.field3707 && ~var32 <= ~var25 && ~var27 >= ~var33 && ~var28 < ~var32 && var33 < var29) {
                            class28.method190((byte) -108, var11, -var15 + var33, var32 - var13);
                        }
                        if (~var11.field2882 == -1) {
                            if (!var11.field2778 && class187.method1233(var11, 0) && class129.field2419 != var11) {
                                continue;
                            }
                            if (!var11.field2778) {
                                if (~(-var11.field2770 + var11.field2837) > ~var11.field2811) {
                                    var11.field2811 = -var11.field2770 + var11.field2837;
                                }
                                if (~var11.field2811 > -1) {
                                    var11.field2811 = 0;
                                }
                            }
                            method87(var25, var27, arg2, -var11.field2811 + var15, var12, var29, var28, (byte) -101, var11.field2878, var13 - var11.field2860);
                            if (var11.field2784 != null) {
                                method87(var25, var27, var11.field2784, var15 - var11.field2811, var12, var29, var28, (byte) -101, var11.field2878, -var11.field2860 + var13);
                            }
                            class80 var34 = (class80) class202.field3948.method1045((long) var11.field2878, (byte) -77);
                            if (var34 != null) {
                                if (~var34.field1480 == -1 && ~var25 >= ~class22.field459 && class150.field2806 >= var27 && var28 > class22.field459 && class150.field2806 < var29 && !class189.field3707 && !class172.field3335) {
                                    class149.field2746[0] = 1007;
                                    class20.field436 = 1;
                                    class63.field1166[0] = class206.field4035;
                                    class154.field2967[0] = class45.field838;
                                }
                                class150.method992(var28, (byte) 127, var34.field1475, var13, var25, var27, var29, var12, var15);
                            }
                            class130.method851(arg0, arg1, arg6, arg5);
                            class12.method82();
                        }
                        if (class174.field3358[var12] || ~class65.field1209 < -2) {
                            if (~var11.field2882 == -1 && !var11.field2778 && var11.field2770 < var11.field2837) {
                                class118.method741(var15, var11.field2770, var11.field2811, false, var11.field2837, var11.field2875 + var13);
                            }
                            if (var11.field2882 != 1) {
                                if (var11.field2882 == 2) {
                                    int var35 = 0;
                                    for (int var36 = 0; var36 < var11.field2770; ++var36) {
                                        for (int var37 = 0; ~var37 > ~var11.field2875; ++var37) {
                                            int var38 = (32 - -var11.field2892) * var37 + var13;
                                            int var39 = (var11.field2781 + 32) * var36 + var15;
                                            if (~var35 > -21) {
                                                var38 += var11.field2802[var35];
                                                var39 += var11.field2768[var35];
                                            }
                                            if (var11.field2782[var35] <= 0) {
                                                if (var11.field2842 != null && var35 < 20) {
                                                    class18 var51 = var11.method995(1, var35);
                                                    if (var51 != null) {
                                                        var51.method123(var38, var39);
                                                    } else if (class16.field345) {
                                                        class64.method404(95, var11);
                                                    }
                                                }
                                            } else {
                                                boolean var40 = false;
                                                boolean var41 = false;
                                                int var42 = var11.field2782[var35] - 1;
                                                if (var38 - -32 > arg0 && ~arg6 < ~var38 && var39 + 32 > arg1 && arg5 > var39 || class171.field3307 == var11 && class141.field2619 == var35) {
                                                    class18 var43;
                                                    if (class141.field2630 == 1 && ~class91.field1679 == ~var35 && class176.field3454 == var11.field2878) {
                                                        var43 = class82.method497(var42, 77, var11.field2870[var35], false, 0, 2);
                                                    } else {
                                                        var43 = class82.method497(var42, 81, var11.field2870[var35], false, 3153952, 1);
                                                    }
                                                    if (var43 != null) {
                                                        if (class171.field3307 == var11 && class141.field2619 == var35) {
                                                            int var44 = -class150.field2792 + class22.field459;
                                                            int var45 = -class69.field1292 + class150.field2806;
                                                            if (var45 < 5 && var45 > -5) {
                                                                var45 = 0;
                                                            }
                                                            if (var44 < 5 && ~var44 < 4) {
                                                                var44 = 0;
                                                            }
                                                            if (~class49.field880 > -6) {
                                                                var44 = 0;
                                                                var45 = 0;
                                                            }
                                                            var43.method127(var38 + var44, var39 + var45, 128);
                                                            if (arg8 != -1) {
                                                                class150 var46 = arg2[arg8 & 65535];
                                                                int var47 = class130.field2428;
                                                                int var48 = class130.field2425;
                                                                if (var39 + var45 < var48 && ~var46.field2811 < -1) {
                                                                    int var49 = (var48 - (var39 + var45)) * class149.field2756 / 3;
                                                                    if (var49 > class149.field2756 * 10) {
                                                                        var49 = class149.field2756 * 10;
                                                                    }
                                                                    if (~var46.field2811 > ~var49) {
                                                                        var49 = var46.field2811;
                                                                    }
                                                                    class69.field1292 += var49;
                                                                    var46.field2811 -= var49;
                                                                    class64.method404(102, var46);
                                                                }
                                                                if (var47 < var39 + var45 + 32 && ~var46.field2811 > ~(-var46.field2770 + var46.field2837)) {
                                                                    int var50 = (var39 + var45 + 32 - var47) * class149.field2756 / 3;
                                                                    if (var50 > class149.field2756 * 10) {
                                                                        var50 = class149.field2756 * 10;
                                                                    }
                                                                    if (var46.field2837 - var46.field2811 + -var46.field2770 < var50) {
                                                                        var50 = -var46.field2770 + var46.field2837 - var46.field2811;
                                                                    }
                                                                    var46.field2811 += var50;
                                                                    class69.field1292 -= var50;
                                                                    class64.method404(96, var46);
                                                                }
                                                            }
                                                        } else if (class128.field2398 == var11 && class73.field1370 == var35) {
                                                            var43.method127(var38, var39, 128);
                                                        } else {
                                                            var43.method123(var38, var39);
                                                        }
                                                    } else {
                                                        class64.method404(118, var11);
                                                    }
                                                }
                                            }
                                            ++var35;
                                        }
                                    }
                                } else if (var11.field2882 == 3) {
                                    int var52;
                                    if (class19.method137(0, var11)) {
                                        var52 = var11.field2767;
                                        if (class129.field2419 == var11 && var11.field2855 != 0) {
                                            var52 = var11.field2855;
                                        }
                                    } else {
                                        var52 = var11.field2847;
                                        if (class129.field2419 == var11 && var11.field2852 != 0) {
                                            var52 = var11.field2852;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (!var11.field2843) {
                                            class130.method857(var13, var15, var11.field2875, var11.field2770, var52);
                                        } else {
                                            class130.method850(var13, var15, var11.field2875, var11.field2770, var52);
                                        }
                                    } else if (var11.field2843) {
                                        class130.method853(var13, var15, var11.field2875, var11.field2770, var52, 256 - (255 & var14));
                                    } else {
                                        class130.method849(var13, var15, var11.field2875, var11.field2770, var52, -(255 & var14) + 256);
                                    }
                                } else if (var11.field2882 == 4) {
                                    class71 var53 = var11.method981(true);
                                    if (var53 == null) {
                                        if (class16.field345) {
                                            class64.method404(94, var11);
                                        }
                                    } else {
                                        class169 var54 = var11.field2832;
                                        int var55;
                                        if (class19.method137(arg7 + 101, var11)) {
                                            var55 = var11.field2767;
                                            if (class129.field2419 == var11 && ~var11.field2855 != -1) {
                                                var55 = var11.field2855;
                                            }
                                            if (~var11.field2859.method1134(0) < -1) {
                                                var54 = var11.field2859;
                                            }
                                        } else {
                                            var55 = var11.field2847;
                                            if (class129.field2419 == var11 && ~var11.field2852 != -1) {
                                                var55 = var11.field2852;
                                            }
                                        }
                                        if (var11.field2778 && var11.field2901 != -1) {
                                            class73 var56 = class180.method1196(var11.field2901, arg7 ^ -101);
                                            var54 = var56.field1383;
                                            if (var54 == null) {
                                                var54 = class63.field1168;
                                            }
                                            if ((~var56.field1364 == -2 || var11.field2900 != 1) && ~var11.field2900 != 0) {
                                                var54 = class165.method1058(0, new class169[] { class112.field2047, var54, class19.field416, class105.method618(var11.field2900, (byte) 126) });
                                            }
                                        }
                                        if (class55.field999 == var11) {
                                            var55 = var11.field2847;
                                            var54 = class31.field659;
                                        }
                                        if (!var11.field2778) {
                                            var54 = class37.method244((byte) 90, var54, var11);
                                        }
                                        var53.method732(var54, var13, var15, var11.field2875, var11.field2770, var55, var11.field2772 ? 0 : -1, var11.field2865, var11.field2822, var11.field2871);
                                    }
                                } else if (~var11.field2882 == -6) {
                                    if (!var11.field2778) {
                                        class18 var65 = var11.method982(arg7 ^ 56, class19.method137(arg7 + 101, var11));
                                        if (var65 != null) {
                                            var65.method123(var13, var15);
                                        } else if (class16.field345) {
                                            class64.method404(arg7 + 226, var11);
                                        }
                                    } else {
                                        class18 var57;
                                        if (~var11.field2901 == 0) {
                                            var57 = var11.method982(-105, false);
                                        } else {
                                            var57 = class82.method497(var11.field2901, arg7 + -5, var11.field2900, false, var11.field2791, var11.field2813);
                                        }
                                        if (var57 == null) {
                                            if (class16.field345) {
                                                class64.method404(99, var11);
                                            }
                                        } else {
                                            int var58 = var57.field414;
                                            int var59 = var57.field411;
                                            if (!var11.field2854) {
                                                int var64 = var11.field2875 * 4096 / var58;
                                                if (var11.field2883 != 0) {
                                                    var57.method129(var11.field2875 / 2 + var13, var15 - -(var11.field2770 / 2), var11.field2883, var64);
                                                } else if (var14 == 0) {
                                                    if (~var11.field2875 == ~var58 && var11.field2770 == var59) {
                                                        var57.method123(var13, var15);
                                                    } else {
                                                        var57.method108(var13, var15, var11.field2875, var11.field2770);
                                                    }
                                                } else {
                                                    var57.method117(var13, var15, var11.field2875, var11.field2770, -(var14 & 255) + 256);
                                                }
                                            } else {
                                                class130.method852(var13, var15, var13 - -var11.field2875, var15 - -var11.field2770);
                                                int var60 = (var59 - (1 - var11.field2770)) / var59;
                                                int var61 = (var58 - (1 - var11.field2875)) / var58;
                                                for (int var62 = 0; var61 > var62; ++var62) {
                                                    for (int var63 = 0; var63 < var60; ++var63) {
                                                        if (~var11.field2883 != -1) {
                                                            var57.method129(var58 * var62 - -(var58 / 2) + var13, var59 * var63 + var59 / 2 + var15, var11.field2883, 4096);
                                                        } else if (~var14 == -1) {
                                                            var57.method123(var58 * var62 + var13, var59 * var63 + var15);
                                                        } else {
                                                            var57.method127(var58 * var62 + var13, var59 * var63 + var15, -(var14 & 255) + 256);
                                                        }
                                                    }
                                                }
                                                class130.method851(arg0, arg1, arg6, arg5);
                                            }
                                        }
                                    }
                                } else if (~var11.field2882 == -7) {
                                    class24 var66 = null;
                                    boolean var67 = class19.method137(0, var11);
                                    int var68;
                                    if (var67) {
                                        var68 = var11.field2899;
                                    } else {
                                        var68 = var11.field2836;
                                    }
                                    int var69 = 0;
                                    if (var11.field2901 != -1) {
                                        class73 var70 = class180.method1196(var11.field2901, 0);
                                        if (var70 != null) {
                                            class73 var71 = var70.method456(var11.field2900, true);
                                            var66 = var71.method446(1, arg7 + 101, (class174) null, 0);
                                            if (var66 != null) {
                                                var66.method171();
                                                var69 = -var66.field84 / 2;
                                            } else {
                                                class64.method404(100, var11);
                                            }
                                        }
                                    } else if (~var11.field2808 == -6) {
                                        if (~var11.field2803 == 0) {
                                            var66 = class63.field1163.method9((byte) 114, -1, (class174) null, (class174) null, -1);
                                        } else {
                                            int var72 = var11.field2803 & 2047;
                                            if (class206.field4041 == var72) {
                                                var72 = 2047;
                                            }
                                            class196 var73 = class65.field1213[var72];
                                            class174 var74 = ~var68 == 0 ? null : class159.method1021((byte) 65, var68);
                                            if (var73 != null && ~((int) var73.field3856.method1133(false) << 11) == ~(var11.field2803 & -2048)) {
                                                var66 = var73.field3846.method9((byte) 94, var11.field2846, (class174) null, var74, 0);
                                            }
                                        }
                                    } else if (~var68 != 0) {
                                        class174 var75 = class159.method1021((byte) 10, var68);
                                        var66 = var11.method990(-128, var75, class4.field79.field3846, var11.field2846, var67);
                                        if (var66 == null && class16.field345) {
                                            class64.method404(120, var11);
                                        }
                                    } else {
                                        var66 = var11.method990(-126, (class174) null, class4.field79.field3846, -1, var67);
                                        if (var66 == null && class16.field345) {
                                            class64.method404(arg7 ^ -5, var11);
                                        }
                                    }
                                    if (var66 != null) {
                                        class12.method75(var13 - -(var11.field2875 / 2) + var11.field2906, var15 - -(var11.field2770 / 2) + var11.field2827);
                                        int var76 = class12.field279[var11.field2888] * var11.field2904 >> 16;
                                        int var77 = class12.field283[var11.field2888] * var11.field2904 >> 16;
                                        if (var11.field2778) {
                                            if (!var11.field2866) {
                                                var66.method170(0, var11.field2863, var11.field2833, var11.field2888, var11.field2820, var11.field2796 + var76 - -var69, var11.field2796 + var77);
                                            } else {
                                                var66.method167(0, var11.field2863, var11.field2833, var11.field2888, var11.field2820, var76 - -var69 + var11.field2796, var11.field2796 + var77, var11.field2904);
                                            }
                                        } else {
                                            var66.method170(0, var11.field2863, 0, var11.field2888, 0, var76, var77);
                                        }
                                        class12.method65();
                                    }
                                } else {
                                    if (~var11.field2882 == -8) {
                                        class71 var78 = var11.method981(true);
                                        if (var78 == null) {
                                            if (class16.field345) {
                                                class64.method404(108, var11);
                                            }
                                            continue;
                                        }
                                        int var79 = 0;
                                        for (int var80 = 0; var11.field2770 > var80; ++var80) {
                                            for (int var81 = 0; ~var11.field2875 < ~var81; ++var81) {
                                                if (~var11.field2782[var79] < -1) {
                                                    class73 var82 = class180.method1196(var11.field2782[var79] + -1, 0);
                                                    class169 var83;
                                                    if (~var82.field1364 != -2 && var11.field2870[var79] == 1) {
                                                        var83 = class165.method1058(arg7 + 101, new class169[] { class112.field2047, var82.field1383, class99.field1862 });
                                                    } else {
                                                        var83 = class165.method1058(0, new class169[] { class112.field2047, var82.field1383, class19.field416, class105.method618(var11.field2870[var79], (byte) 104) });
                                                    }
                                                    int var84 = (var11.field2781 + 12) * var80 + var15;
                                                    int var85 = (var11.field2892 + 115) * var81 + var13;
                                                    if (~var11.field2865 == -1) {
                                                        var78.method718(var83, var85, var84, var11.field2847, var11.field2772 ? 0 : -1);
                                                    } else if (var11.field2865 != 1) {
                                                        var78.method727(var83, var11.field2875 + var85 + -1, var84, var11.field2847, var11.field2772 ? 0 : -1);
                                                    } else {
                                                        var78.method717(var83, var11.field2875 / 2 + var85, var84, var11.field2847, !var11.field2772 ? -1 : 0);
                                                    }
                                                }
                                                ++var79;
                                            }
                                        }
                                    }
                                    if (~var11.field2882 == -9 && class9.field236 == var11 && class204.field3991 == class129.field2409) {
                                        int var86 = 0;
                                        class71 var87 = class96.field1823;
                                        int var88 = 0;
                                        class169 var89 = var11.field2832;
                                        class169 var90 = class37.method244((byte) 94, var89, var11);
                                        while (~var90.method1134(0) < -1) {
                                            int var98 = var90.method1116(-248, class185.field3608);
                                            class169 var99;
                                            if (~var98 != 0) {
                                                var99 = var90.method1132(0, arg7 ^ -18, var98);
                                                var90 = var90.method1106(false, var98 + 4);
                                            } else {
                                                var99 = var90;
                                                var90 = class45.field838;
                                            }
                                            int var100 = var87.method736(var99);
                                            var86 += var87.field2166 - -1;
                                            if (~var88 > ~var100) {
                                                var88 = var100;
                                            }
                                        }
                                        var86 += 7;
                                        int var91 = var11.field2770 + var15 + 5;
                                        var88 += 6;
                                        int var92 = var13 - -var11.field2875 + -5 - var88;
                                        if (arg5 < var91 - -var86) {
                                            var91 = -var86 + arg5;
                                        }
                                        if (var92 < var13 + 5) {
                                            var92 = var13 + 5;
                                        }
                                        if (~(var88 + var92) < ~arg6) {
                                            var92 = arg6 - var88;
                                        }
                                        class130.method850(var92, var91, var88, var86, 16777120);
                                        class130.method857(var92, var91, var88, var86, 0);
                                        int var93 = var87.field2166 + 2 + var91;
                                        class169 var94 = var11.field2832;
                                        class169 var95 = class37.method244((byte) 111, var94, var11);
                                        while (~var95.method1134(arg7 ^ -101) < -1) {
                                            int var96 = var95.method1116(-248, class185.field3608);
                                            class169 var97;
                                            if (var96 == -1) {
                                                var97 = var95;
                                                var95 = class45.field838;
                                            } else {
                                                var97 = var95.method1132(0, arg7 ^ -19, var96);
                                                var95 = var95.method1106(false, var96 + 4);
                                            }
                                            var87.method718(var97, var92 + 3, var93, 0, -1);
                                            var93 += var87.field2166 - -1;
                                        }
                                    }
                                    if (var11.field2882 == 9) {
                                        if (var11.field2815 != 1) {
                                            int var101 = ~var11.field2770 <= -1 ? var11.field2770 : -var11.field2770;
                                            int var102 = var11.field2875 < 0 ? -var11.field2875 : var11.field2875;
                                            int var103 = var102;
                                            if (~var102 > ~var101) {
                                                var103 = var101;
                                            }
                                            if (~var103 != -1) {
                                                int var104 = (var11.field2770 << 16) / var103;
                                                int var105 = (var11.field2875 << 16) / var103;
                                                if (~var105 <= ~var104) {
                                                    var105 = -var105;
                                                } else {
                                                    var104 = -var104;
                                                }
                                                int var106 = var11.field2815 * var104 >> 17;
                                                int var107 = var11.field2815 * var104 - -1 >> 17;
                                                int var108 = var11.field2815 * var105 >> 17;
                                                int var109 = var11.field2815 * var105 + 1 >> 17;
                                                int var110 = -arg0 + var13;
                                                int var111 = var106 + var110;
                                                int var112 = -arg1 + var15;
                                                int var113 = -var107 + var110;
                                                int var114 = var11.field2875 + var110 + -var107;
                                                int var115 = -var109 + var112;
                                                int var116 = var108 + var112;
                                                int var117 = var110 - -var11.field2875 - -var106;
                                                int var118 = var11.field2770 + var112 + -var109;
                                                int var119 = var11.field2770 + var108 + var112;
                                                class12.method81(var111, var113, var114);
                                                class12.method76(var116, var115, var118, var111, var113, var114, var11.field2847);
                                                class12.method81(var111, var114, var117);
                                                class12.method76(var116, var118, var119, var111, var114, var117, var11.field2847);
                                            }
                                        } else {
                                            class130.method856(var13, var15, var13 - -var11.field2875, var11.field2770 + var15, var11.field2847);
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

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZILih;)V")
    public static final void method88(boolean arg0, int arg1, class80 arg2) {
        ++field327;
        if (arg1 == 6) {
            int var3 = arg2.field1475;
            int var4 = (int) arg2.field3543;
            arg2.method1213(9104);
            if (arg0) {
                class127.method779(var3, false);
            }
            class61.method383(var3, 0);
            class150 var5 = class62.method385((byte) 41, var4);
            if (var5 != null) {
                class64.method404(107, var5);
            }
            class20.field436 = 0;
            class189.field3707 = false;
            class5.method35(class178.field3475, class73.field1388, true, class19.field422, class167.field3217);
            if (~class106.field1943 != 0) {
                class200.method1310(class106.field1943, -7102, 1);
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BI)[[I")
    public final int[][] method59(byte arg0, int arg1) {
        ++field328;
        int[][] var3 = super.field1195.method177(1193, arg1);
        if (arg0 != -40) {
            field322 = 108;
        }
        if (super.field1195.field532 && this.method930(124)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int var6 = arg1 % super.field2575 * super.field2575;
            int[] var7 = var3[2];
            for (int var8 = 0; var8 < class147.field2715; ++var8) {
                int var9 = super.field2578[var8 % super.field2586 + var6];
                var7[var8] = class150.method984(var9, 255) << 4;
                var5[var8] = class150.method984(4080, var9 >> 4);
                var4[var8] = class150.method984(var9 >> 12, 4080);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(Z)V")
    public static void method89(boolean arg0) {
        field323 = null;
        field329 = null;
        field325 = null;
        field321 = null;
        if (!arg0) {
            field322 = -103;
        }
    }
}
