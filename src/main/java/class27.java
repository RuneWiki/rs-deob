import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class27 {

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "Lae;")
    public static class6 field674 = class64.method474(125, "(U2");

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "Lae;")
    private static class6 field671 = class64.method474(127, "Please try again)3");

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "Lae;")
    public static class6 field680 = class64.method474(120, "@or1@");

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
    public static int field679 = 0;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "Lae;")
    public static class6 field670 = field671;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "[[[Lp;")
    public static class95[][][] field682 = new class95[4][104][104];

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
    public static int field683 = 0;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    public static int field673;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "Lsc;")
    public static class112 field676;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "Lcd;")
    public static class19 field681;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "[Lq;")
    public static class101[] field678;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "[[I")
    public static int[][] field677;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(JB)V", line = 3)
    public static final void method245(long arg0, byte arg1) {
        field675++;
        if (arg0 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class7.field139; var3++) {
            if (class109.field2609[var3] == arg0) {
                class118.field2811++;
                class139.field3380 = true;
                class7.field139--;
                for (int var4 = var3; var4 < class7.field139; var4++) {
                    class41.field924[var4] = class41.field924[var4 + 1];
                    class66.field1470[var4] = class66.field1470[var4 + 1];
                    class109.field2609[var4] = class109.field2609[var4 + 1];
                }
                class111.field2660.method938((byte) 63, 159);
                class111.field2660.method639(true, arg0);
                break;
            }
        }
        int var5 = -61 / ((-arg1 - 84) / 38);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V", line = 53)
    public static void method246(byte arg0) {
        field681 = null;
        field670 = null;
        field678 = null;
        field676 = null;
        if (arg0 < 97) {
            method247(null, 79, -63, -33, 31, 50, -50, -82, -11, 11);
        }
        field671 = null;
        field680 = null;
        field674 = null;
        field677 = null;
        field682 = null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "([Lte;IIIIIIIII)Z", line = 150)
    public static final boolean method247(class121[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field672++;
        class74.method587(arg9, arg4, arg6, arg8);
        boolean var10 = true;
        for (int var11 = 0; var11 < arg0.length; var11++) {
            class121 var12 = arg0[var11];
            if (var12 != null && var12.field2915 == arg3) {
                if (var12.field2953 > 0) {
                    class8.method77(var12, 114);
                }
                int var13 = arg9 + var12.field2967 - arg5;
                int var14 = arg4 + var12.field2879 - arg2;
                int var15 = var12.field2890;
                if (class100.field2341 == var12) {
                    class121 var16 = class81.method693(var12, (byte) -126);
                    if (var16 == null) {
                        class100.field2341 = null;
                    } else {
                        int[] var17 = class130.method1051(-6622, var16);
                        int[] var18 = class130.method1051(arg7 ^ 0xFFFFC051, var12);
                        if (!var12.field2989) {
                            var15 = 128;
                        }
                        int var19 = class57.field1244 - class129.field3143;
                        int var20 = class117.field2771 - class22.field576;
                        if (var20 <= var12.field2923 && -var12.field2923 <= var20 && var19 <= var12.field2923 && var19 >= -var12.field2923 && !class67.field1474) {
                            var20 = 0;
                            var19 = 0;
                        } else if (var12.field2863 < class109.field2646 || class67.field1474) {
                            class67.field1474 = true;
                        } else {
                            var19 = 0;
                            var20 = 0;
                        }
                        int var21 = var18[1] + var19 - var17[1];
                        if (var21 < 0) {
                            var21 = 0;
                        }
                        int var22 = var18[0] + var20 - var17[0];
                        if (var22 < 0) {
                            var22 = 0;
                        }
                        if (var12.field2984 + var22 > var16.field2984) {
                            var22 = var16.field2984 - var12.field2984;
                        }
                        if (var16.field2872 < var12.field2872 + var21) {
                            var21 = var16.field2872 - var12.field2872;
                        }
                        var13 = var17[0] + var22;
                        var14 = var17[1] + var21;
                    }
                }
                if ((!var12.field2870 || var13 <= class74.field1685 && var14 <= class74.field1681 && class74.field1686 <= var12.field2984 + var13 && class74.field1682 <= var12.field2872 + var14) && (!var12.field2870 || !var12.method980(125, class30.field717))) {
                    if (var12.field2971 == 0) {
                        if (!var12.field2870 && var12.method980(127, class30.field717) && !class22.method222(arg1, -1, var11)) {
                            continue;
                        }
                        if (!var12.field2870) {
                            if (var12.field2847 > var12.field2972 - var12.field2872) {
                                var12.field2847 = var12.field2972 - var12.field2872;
                            }
                            if (var12.field2847 < 0) {
                                var12.field2847 = 0;
                            }
                        }
                        var10 &= method247(arg0, arg1, var12.field2847, var12.field2960, var14, var12.field2936, var12.field2984 + var13, arg7, var12.field2872 + var14, var13);
                        if (var12.field2885 != null) {
                            var10 &= method247(var12.field2885, arg1, var12.field2847, var12.field2960, var14, var12.field2936, var12.field2984 + var13, 9843, var12.field2872 + var14, var13);
                        }
                        class74.method587(arg9, arg4, arg6, arg8);
                        if (var12.field2872 < var12.field2972 && !var12.field2870) {
                            class7.method73(var12.field2984 + var13, var12.field2847, var12.field2972, var14, 18734, var12.field2872);
                        }
                    }
                    if (var12.field2971 != 1) {
                        if (var12.field2971 == 2) {
                            int var23 = 0;
                            for (int var24 = 0; var24 < var12.field2872; var24++) {
                                for (int var25 = 0; var25 < var12.field2984; var25++) {
                                    int var26 = (var12.field2854 + 32) * var25 + var13;
                                    int var27 = (var12.field2866 + 32) * var24 + var14;
                                    if (var23 < 20) {
                                        var27 += var12.field2900[var23];
                                        var26 += var12.field2888[var23];
                                    }
                                    if (var12.field2963[var23] > 0) {
                                        int var28 = var12.field2963[var23] - 1;
                                        boolean var29 = false;
                                        boolean var30 = false;
                                        if (class74.field1686 - 32 < var26 && class74.field1685 > var26 && var27 > class74.field1682 - 32 && class74.field1681 > var27 || class54.field1188 != 0 && class87.field2085 == var23) {
                                            class101 var31;
                                            if (class19.field382 == 1 && class37.field845 == var23 && class96.field2284 == var12.field2960) {
                                                var31 = class111.method937(var28, 0, false, var12.field2946[var23], 115, 2);
                                            } else {
                                                var31 = class111.method937(var28, 3153952, false, var12.field2946[var23], arg7 ^ 0x264D, 1);
                                            }
                                            if (var31 == null) {
                                                var10 = false;
                                            } else if (class54.field1188 != 0 && class87.field2085 == var23 && class138.field3358 == var12.field2960) {
                                                int var32 = class57.field1244 - class34.field810;
                                                if (var32 < 5 && var32 > -5) {
                                                    var32 = 0;
                                                }
                                                int var33 = class117.field2771 - class32.field789;
                                                if (var33 < 5 && var33 > -5) {
                                                    var33 = 0;
                                                }
                                                if (class121.field2891 < 5) {
                                                    var33 = 0;
                                                    var32 = 0;
                                                }
                                                var31.method856(var26 + var33, var27 + var32, 128);
                                                if (arg3 != -1) {
                                                    class121 var34 = arg0[arg3 & 0xFFFF];
                                                    if (class74.field1682 > var27 + var32 && var34.field2847 > 0) {
                                                        int var35 = (class74.field1682 - var27 - var32) * class82.field2005 / 3;
                                                        if (var35 > class82.field2005 * 10) {
                                                            var35 = class82.field2005 * 10;
                                                        }
                                                        if (var34.field2847 < var35) {
                                                            var35 = var34.field2847;
                                                        }
                                                        class34.field810 += var35;
                                                        var34.field2847 -= var35;
                                                    }
                                                    if (class74.field1681 < var27 + var32 + 32 && var34.field2847 < var34.field2972 - var34.field2872) {
                                                        int var36 = (var27 + var32 + 32 - class74.field1681) * class82.field2005 / 3;
                                                        if (var36 > class82.field2005 * 10) {
                                                            var36 = class82.field2005 * 10;
                                                        }
                                                        if (var34.field2972 - var34.field2872 - var34.field2847 < var36) {
                                                            var36 = var34.field2972 - var34.field2872 - var34.field2847;
                                                        }
                                                        class34.field810 -= var36;
                                                        var34.field2847 += var36;
                                                    }
                                                }
                                            } else if (class40.field886 != 0 && class50.field1116 == var23 && class130.field3154 == var12.field2960) {
                                                var31.method856(var26, var27, 128);
                                            } else {
                                                var31.method850(var26, var27);
                                            }
                                        }
                                    } else if (var12.field2918 != null && var23 < 20) {
                                        class101 var37 = var12.method985(var23, arg7 ^ 0xFFFFD98C);
                                        if (var37 != null) {
                                            var37.method850(var26, var27);
                                        } else if (class90.field2159) {
                                            var10 = false;
                                        }
                                    }
                                    var23++;
                                }
                            }
                        } else if (var12.field2971 == 3) {
                            int var38;
                            if (class69.method502(var12, -111)) {
                                var38 = var12.field2939;
                                if (class22.method222(arg1, arg7 - 9844, var11) && var12.field2962 != 0) {
                                    var38 = var12.field2962;
                                }
                            } else {
                                var38 = var12.field2952;
                                if (class22.method222(arg1, -1, var11) && var12.field2905 != 0) {
                                    var38 = var12.field2905;
                                }
                            }
                            if (var15 == 0) {
                                if (var12.field2950) {
                                    class74.method579(var13, var14, var12.field2984, var12.field2872, var38);
                                } else {
                                    class74.method582(var13, var14, var12.field2984, var12.field2872, var38);
                                }
                            } else if (var12.field2950) {
                                class74.method592(var13, var14, var12.field2984, var12.field2872, var38, 256 - (var15 & 0xFF));
                            } else {
                                class74.method588(var13, var14, var12.field2984, var12.field2872, var38, 256 - (var15 & 0xFF));
                            }
                        } else if (var12.field2971 == 4) {
                            class9 var39 = var12.method978(true);
                            if (var39 != null) {
                                class6 var40 = var12.field2889;
                                int var41;
                                if (class69.method502(var12, -124)) {
                                    var41 = var12.field2939;
                                    if (class22.method222(arg1, -1, var11) && var12.field2962 != 0) {
                                        var41 = var12.field2962;
                                    }
                                    if (var12.field2913.method41(-8521) > 0) {
                                        var40 = var12.field2913;
                                    }
                                } else {
                                    var41 = var12.field2952;
                                    if (class22.method222(arg1, -1, var11) && var12.field2905 != 0) {
                                        var41 = var12.field2905;
                                    }
                                }
                                if (var12.field2870 && var12.field2851 != -1) {
                                    class22 var42 = class43.method356(-85, var12.field2851);
                                    var40 = var42.field549;
                                    if (var40 == null) {
                                        var40 = class62.field1350;
                                    }
                                    if ((var42.field550 == 1 || var12.field2973 != 1) && var12.field2973 != -1) {
                                        var40 = class85.method731(new class6[] { var40, class24.field610, class75.method604(var12.field2973, (byte) -113) }, 14569);
                                    }
                                }
                                if (class96.field2272 == var12.field2960 && class6.field105 == var12.field2980) {
                                    var40 = class46.field1039;
                                    var41 = var12.field2952;
                                }
                                if (class74.field1683 == 479) {
                                    if (var41 == 16776960) {
                                        var41 = 255;
                                    }
                                    if (var41 == 49152) {
                                        var41 = 16777215;
                                    }
                                }
                                class6 var43 = class93.method776(var12, 0, var40);
                                var39.method84(var43, var13, var14, var12.field2984, var12.field2872, var41, var12.field2928, var12.field2894, var12.field2850, var12.field2899);
                            } else if (class90.field2159) {
                                var10 = false;
                            }
                        } else if (var12.field2971 == 5) {
                            if (var12.field2870) {
                                class101 var45;
                                if (var12.field2851 == -1) {
                                    var45 = var12.method1000(-1, false);
                                } else {
                                    var45 = class111.method937(var12.field2851, var12.field2858, false, var12.field2973, 68, var12.field2881);
                                }
                                if (var45 != null) {
                                    int var46 = var45.field2377;
                                    int var47 = var45.field2379;
                                    if (var12.field2871) {
                                        int var49 = var13;
                                        int[] var50 = new int[4];
                                        class74.method591(var50);
                                        if (var13 < var50[0]) {
                                            var49 = var50[0];
                                        }
                                        int var51 = var14;
                                        if (var14 < var50[1]) {
                                            var51 = var50[1];
                                        }
                                        int var52 = var12.field2984 + var13;
                                        int var53 = var12.field2872 + var14;
                                        if (var50[3] < var53) {
                                            var53 = var50[3];
                                        }
                                        if (var50[2] < var52) {
                                            var52 = var50[2];
                                        }
                                        class74.method587(var49, var51, var52, var53);
                                        int var54 = (var12.field2872 + var47 - 1) / var47;
                                        int var55 = (var12.field2984 + var46 - 1) / var46;
                                        for (int var56 = 0; var56 < var55; var56++) {
                                            for (int var57 = 0; var57 < var54; var57++) {
                                                if (var12.field2916 != 0) {
                                                    var45.method864(var46 / 2 + var46 * var56 + var13, var47 / 2 + (var14 - -(var47 * var57)), var12.field2916, 4096);
                                                } else if (var15 == 0) {
                                                    var45.method850(var46 * var56 + var13, var47 * var57 + var14);
                                                } else {
                                                    var45.method856(var13 + var46 * var56, var47 * var57 + var14, 256 - (var15 & 0xFF));
                                                }
                                            }
                                        }
                                        class74.method589(var50);
                                    } else {
                                        int var48 = var12.field2984 * 4096 / var46;
                                        if (var12.field2916 != 0) {
                                            var45.method864(var12.field2984 / 2 + var13, var12.field2872 / 2 + var14, var12.field2916, var48);
                                        } else if (var15 != 0) {
                                            var45.method860(var13, var14, var12.field2984, var12.field2872, 256 - (var15 & 0xFF));
                                        } else if (var12.field2984 == var46 && var12.field2872 == var47) {
                                            var45.method850(var13, var14);
                                        } else {
                                            var45.method867(var13, var14, var12.field2984, var12.field2872);
                                        }
                                    }
                                } else if (class90.field2159) {
                                    var10 = false;
                                }
                            } else {
                                class101 var44 = var12.method1000(arg7 - 9844, class69.method502(var12, -111));
                                if (var44 != null) {
                                    var44.method850(var13, var14);
                                } else if (class90.field2159) {
                                    var10 = false;
                                }
                            }
                        } else if (var12.field2971 == 6) {
                            boolean var58 = class69.method502(var12, arg7 - 9834);
                            int var59;
                            if (var58) {
                                var59 = var12.field2917;
                            } else {
                                var59 = var12.field2983;
                            }
                            Object var60 = null;
                            class131 var61;
                            if (var12.field2864 == 5) {
                                if (var12.field2886 == 0) {
                                    var61 = class32.field793.method701(-27537, null, null, -1, -1);
                                } else {
                                    var61 = class12.field229.method3(true);
                                }
                            } else if (var59 == -1) {
                                var61 = var12.method1001(arg7 - 9861, -1, var58, class12.field229.field1451, null);
                                if (var61 == null && class90.field2159) {
                                    var10 = false;
                                }
                            } else {
                                class85 var62 = class35.method314(var59, (byte) 54);
                                var61 = var12.method1001(-99, var12.field2853, var58, class12.field229.field1451, var62);
                                if (var61 == null && class90.field2159) {
                                    var10 = false;
                                }
                            }
                            int var63 = var12.field2975;
                            int var64 = var12.field2868;
                            int var65 = var12.field2862;
                            int var66 = var12.field2944;
                            int var67 = var12.field2927;
                            int var68 = var12.field2947;
                            if (var12.field2851 != -1) {
                                class22 var69 = class43.method356(-97, var12.field2851);
                                if (var69 != null) {
                                    class22 var70 = var69.method225(var12.field2973, (byte) 71);
                                    var61 = var70.method217(1, true, (byte) -123);
                                    var66 = var70.field563;
                                    var68 = var70.field534;
                                    var63 = var70.field558;
                                    var65 = var70.field541;
                                    var67 = var70.field539;
                                    if (var12.field2984 > 0) {
                                        var68 = var68 * 32 / var12.field2984;
                                    }
                                    var64 = var70.field567;
                                }
                            }
                            class29.method260(var13 + var12.field2984 / 2, var14 - -(var12.field2872 / 2));
                            int var71 = class29.field689[var63] * var68 >> 16;
                            int var72 = class29.field702[var63] * var68 >> 16;
                            if (var61 != null) {
                                if (var12.field2870) {
                                    var61.method1062();
                                    if (var12.field2957) {
                                        var61.method1060(0, var64, var65, var63, var66, var61.field954 / 2 + var72 + var67, var71 - -var67, var68);
                                    } else {
                                        var61.method1069(0, var64, var65, var63, var66, var61.field954 / 2 + var67 + var72, var71 - -var67);
                                    }
                                } else {
                                    var61.method1069(0, var64, 0, var63, 0, var72, var71);
                                }
                            }
                            class29.method255();
                        } else {
                            if (var12.field2971 == 7) {
                                class9 var73 = var12.method978(true);
                                if (var73 == null) {
                                    if (class90.field2159) {
                                        var10 = false;
                                    }
                                    continue;
                                }
                                int var74 = 0;
                                for (int var75 = 0; var75 < var12.field2872; var75++) {
                                    for (int var76 = 0; var76 < var12.field2984; var76++) {
                                        if (var12.field2963[var74] > 0) {
                                            class22 var77 = class43.method356(-35, var12.field2963[var74] - 1);
                                            class6 var78 = var77.field549;
                                            if (var78 == null) {
                                                var78 = class62.field1350;
                                            }
                                            if (var77.field550 == 1 || var12.field2946[var74] != 1) {
                                                var78 = class85.method731(new class6[] { var78, class24.field610, class75.method604(var12.field2946[var74], (byte) -115) }, arg7 ^ 0x1E9A);
                                            }
                                            int var79 = (var12.field2854 + 115) * var76 + var13;
                                            int var80 = (var12.field2866 + 12) * var75 + var14;
                                            if (var12.field2894 == 0) {
                                                var73.method94(var78, var79, var80, var12.field2952, var12.field2928);
                                            } else if (var12.field2894 == 1) {
                                                var73.method95(var78, var79 + var12.field2984 / 2, var80, var12.field2952, var12.field2928);
                                            } else {
                                                var73.method86(var78, var12.field2984 + var79 - 1, var80, var12.field2952, var12.field2928);
                                            }
                                        }
                                        var74++;
                                    }
                                }
                            }
                            if (var12.field2971 == 8 && class104.method882(var11, arg1, 1) && class54.field1206 == class111.field2679) {
                                int var81 = 0;
                                int var82 = 0;
                                class6 var83 = var12.field2889;
                                class9 var84 = class102.field2397;
                                class6 var85 = class93.method776(var12, 0, var83);
                                while (var85.method41(-8521) > 0) {
                                    int var93 = var85.method51(22938, class64.field1411);
                                    class6 var94;
                                    if (var93 == -1) {
                                        var94 = var85;
                                        var85 = class133.field3262;
                                    } else {
                                        var94 = var85.method30(0, -1, var93);
                                        var85 = var85.method56(-58, var93 + 2);
                                    }
                                    int var95 = var84.method105(var94);
                                    if (var95 > var82) {
                                        var82 = var95;
                                    }
                                    var81 += var84.field184 + 1;
                                }
                                var82 += 6;
                                int var86 = var13 + var12.field2984 - var82 - 5;
                                var81 += 7;
                                int var87 = var12.field2872 + var14 + 5;
                                if (arg8 < var87 + var81) {
                                    var87 = arg8 - var81;
                                }
                                if (var13 + 5 > var86) {
                                    var86 = var13 + 5;
                                }
                                if (arg6 < var86 + var82) {
                                    var86 = arg6 - var82;
                                }
                                class74.method579(var86, var87, var82, var81, 16777120);
                                class74.method582(var86, var87, var82, var81, 0);
                                class6 var88 = var12.field2889;
                                int var89 = var84.field184 + var87 + 2;
                                class6 var90 = class93.method776(var12, 0, var88);
                                while (var90.method41(-8521) > 0) {
                                    int var91 = var90.method51(arg7 ^ 0x7FE9, class64.field1411);
                                    class6 var92;
                                    if (var91 == -1) {
                                        var92 = var90;
                                        var90 = class133.field3262;
                                    } else {
                                        var92 = var90.method30(0, -1, var91);
                                        var90 = var90.method56(arg7 ^ 0xFFFFD9B5, var91 + 2);
                                    }
                                    var84.method94(var92, var86 + 3, var89, 0, false);
                                    var89 += var84.field184 + 1;
                                }
                            }
                            if (var12.field2971 == 9) {
                                if (var12.field2959 == 1) {
                                    class74.method580(var13, var14, var12.field2984 + var13, var12.field2872 + var14, var12.field2952);
                                } else {
                                    int var96 = var12.field2984 >= 0 ? var12.field2984 : -var12.field2984;
                                    int var97 = var12.field2872 >= 0 ? var12.field2872 : -var12.field2872;
                                    int var98 = var96;
                                    if (var96 < var97) {
                                        var98 = var97;
                                    }
                                    if (var98 != 0) {
                                        int var99 = (var12.field2984 << 16) / var98;
                                        int var100 = (var12.field2872 << 16) / var98;
                                        if (var100 <= var99) {
                                            var99 = -var99;
                                        } else {
                                            var100 = -var100;
                                        }
                                        int var101 = var12.field2959 * var100 >> 17;
                                        int var102 = var12.field2959 * var100 + 1 >> 17;
                                        int var103 = var12.field2959 * var99 >> 17;
                                        int var104 = var12.field2959 * var99 + 1 >> 17;
                                        int var105 = var13 + var101;
                                        int var106 = var13 + var12.field2984 - var102;
                                        int var107 = var12.field2872 + var14 - var104;
                                        int var108 = var14 - var104;
                                        int var109 = var13 - var102;
                                        int var110 = var12.field2984 + var101 + var13;
                                        int var111 = var14 + var103 + var12.field2872;
                                        class29.method267(var105, var109, var106);
                                        int var112 = var14 + var103;
                                        class29.method263(var112, var108, var107, var105, var109, var106, var12.field2952);
                                        class29.method267(var105, var106, var110);
                                        class29.method263(var112, var107, var111, var105, var106, var110, var12.field2952);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg7 == 9843) {
            return var10;
        } else {
            return true;
        }
    }
}
