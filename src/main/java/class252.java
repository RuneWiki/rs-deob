import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class252 extends class40 {

    @OriginalMember(owner = "client!md", name = "F", descriptor = "Ljava/lang/Object;")
    private Object field3763;

    @OriginalMember(owner = "client!md", name = "H", descriptor = "I")
    public static int field3765 = 0;

    @OriginalMember(owner = "client!md", name = "J", descriptor = "Llh;")
    public static class23 field3767 = new class23();

    @OriginalMember(owner = "client!md", name = "K", descriptor = "Lek;")
    public static class184 field3768 = null;

    @OriginalMember(owner = "client!md", name = "M", descriptor = "[I")
    public static int[] field3770 = new int[32];

    @OriginalMember(owner = "client!md", name = "z", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!md", name = "A", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!md", name = "B", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!md", name = "C", descriptor = "I")
    public static int field3760;

    @OriginalMember(owner = "client!md", name = "D", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!md", name = "E", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!md", name = "G", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "client!md", name = "I", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!md", name = "L", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIZZB)V", line = 4)
    public static final void method1748(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5, byte arg6) {
        if (arg3 < arg2) {
            int var7 = (arg2 + arg3) / 2;
            int var8 = arg3;
            class220 var9 = class246.field3709[var7];
            class246.field3709[var7] = class246.field3709[arg2];
            class246.field3709[arg2] = var9;
            for (int var10 = arg3; var10 < arg2; var10++) {
                if (class50.method463(var9, arg4, arg1, class246.field3709[var10], arg0, arg5, arg6 ^ 0x36) <= 0) {
                    class220 var11 = class246.field3709[var10];
                    class246.field3709[var10] = class246.field3709[var8];
                    class246.field3709[var8++] = var11;
                }
            }
            class246.field3709[arg2] = class246.field3709[var8];
            class246.field3709[var8] = var9;
            method1748(arg0, arg1, var8 - 1, arg3, arg4, arg5, (byte) 62);
            method1748(arg0, arg1, arg2, var8 + 1, arg4, arg5, (byte) 62);
        }
        field3761++;
        if (arg6 != 62) {
            field3767 = (class23) null;
        }
    }

    @OriginalMember(owner = "client!md", name = "d", descriptor = "(I)V", line = 50)
    public static final void method1749(int arg0) {
        class159.field2372.method59(0, (byte) 73);
        class141.field2178++;
        class159.field2372.method261(1523335144, 0L);
        if (arg0 != 8221) {
            method1753(-76);
        }
        field3757++;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIII[Lek;IIIII)V", line = 67)
    public static final void method1750(int arg0, int arg1, int arg2, int arg3, class184[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3764++;
        if (class36.field534) {
            class194.method1416(arg7, arg1, arg9, arg0);
        } else {
            class168.method1234(arg7, arg1, arg9, arg0);
            class56.method505();
        }
        for (int var10 = 0; var10 < arg4.length; var10++) {
            class184 var11 = arg4[var10];
            if (var11 != null && (var11.field2974 == arg8 || arg8 == -1412584499 && class152.field2290 == var11)) {
                int var12;
                if (arg6 == -1) {
                    class154.field2331[class112.field1762] = var11.field2948 + arg5;
                    class304.field4765[class112.field1762] = var11.field2887 + arg2;
                    class245.field3687[class112.field1762] = var11.field2890;
                    class266.field3990[class112.field1762] = var11.field2904;
                    var12 = class112.field1762++;
                } else {
                    var12 = arg6;
                }
                var11.field2899 = var12;
                var11.field2847 = class312.field4852;
                if (!var11.field2802 || !client.method1767(var11)) {
                    if (var11.field2881 > 0) {
                        class113.method887(var11, true);
                    }
                    int var13 = var11.field2948 + arg5;
                    int var14 = var11.field2887 + arg2;
                    int var15 = var11.field2823;
                    if (class199.field3147 && (client.method1764(var11).field4234 != 0 || var11.field2945 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class152.field2290 == var11) {
                        if (arg8 != -1412584499 && !var11.field2953) {
                            class50.field774 = arg5;
                            class57.field855 = arg2;
                            class58.field864 = arg4;
                            continue;
                        }
                        if (class99.field1465 && class205.field3248) {
                            int var16 = class273.field4129;
                            int var17 = var16 - class69.field1010;
                            int var18 = class295.field4646;
                            int var19 = var18 - class43.field675;
                            if (class122.field1925 > var19) {
                                var19 = class122.field1925;
                            }
                            if (class161.field2389 > var17) {
                                var17 = class161.field2389;
                            }
                            if ((var11.field2904 + var19) > (class122.field1925 + class102.field1581.field2904)) {
                                var19 = class122.field1925 + class102.field1581.field2904 - var11.field2904;
                            }
                            var14 = var19;
                            if (class161.field2389 + class102.field1581.field2890 < var17 - -var11.field2890) {
                                var17 = class161.field2389 + class102.field1581.field2890 - var11.field2890;
                            }
                            var13 = var17;
                        }
                        if (!var11.field2953) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.field2945 == 2) {
                        var20 = arg1;
                        var21 = arg9;
                        var22 = arg0;
                        var23 = arg7;
                    } else {
                        var20 = arg1 < var14 ? var14 : arg1;
                        var23 = var13 > arg7 ? var13 : arg7;
                        int var24 = var11.field2890 + var13;
                        int var25 = var11.field2904 + var14;
                        if (var11.field2945 == 9) {
                            var25++;
                            var24++;
                        }
                        var22 = arg0 <= var25 ? arg0 : var25;
                        var21 = arg9 <= var24 ? arg9 : var24;
                    }
                    if (!var11.field2802 || var23 < var21 && var20 < var22) {
                        if (var11.field2881 != 0) {
                            if (var11.field2881 == 1337 || var11.field2881 == 1403 && class36.field534) {
                                class99.field1467 = var13;
                                class231.field3574 = var14;
                                field3768 = var11;
                                class285.method2001(var13, (byte) -16, var11.field2904, var11.field2881 == 1403, var11.field2890, var14);
                                if (class36.field534) {
                                    class194.method1416(arg7, arg1, arg9, arg0);
                                } else {
                                    class168.method1234(arg7, arg1, arg9, arg0);
                                }
                                continue;
                            }
                            if (var11.field2881 == 1338) {
                                if (!var11.method1337(true)) {
                                    continue;
                                }
                                class322.method2199(arg3 + 5, var13, var11, var12, var14);
                                if (class36.field534) {
                                    class194.method1416(arg7, arg1, arg9, arg0);
                                } else {
                                    class168.method1234(arg7, arg1, arg9, arg0);
                                }
                                if (class3.field14 != 0 && class3.field14 != 3 || class67.field982 || class322.field5002 < var23 || class199.field3151 < var20 || var21 <= class322.field5002 || var22 <= class199.field3151) {
                                    continue;
                                }
                                int var26 = class199.field3151 - var14;
                                int var27 = class322.field5002 - var13;
                                int var28 = var11.field2929[var26];
                                if (var28 > var27 || (var28 + var11.field2836[var26]) < var27) {
                                    continue;
                                }
                                int var29 = var26 - var11.field2904 / 2;
                                int var30 = var27 - var11.field2890 / 2;
                                int var31 = class99.field1459 + class136.field2125 & 0x7FF;
                                int var32 = class56.field838[var31];
                                int var33 = (class317.field4929 + 256) * var32 >> 8;
                                int var34 = class56.field830[var31];
                                int var35 = (class317.field4929 + 256) * var34 >> 8;
                                int var36 = var29 * var33 + var30 * var35 >> 11;
                                int var37 = var29 * var35 - (var30 * var33) >> 11;
                                int var38 = class235.field3602.field4496 - var37 >> 7;
                                int var39 = class235.field3602.field4507 + var36 >> 7;
                                if (class81.field1136 && (class44.field687 & 0x40) != 0) {
                                    class184 var40 = class314.method2167(class249.field3742, class90.field1313, -2421);
                                    if (var40 == null) {
                                        class15.method117((byte) 82);
                                    } else {
                                        class196.method1419(1L, class309.field4805, class88.field1295, " ->", var38, var39, (byte) -4, (short) 22);
                                    }
                                    continue;
                                }
                                if (class3.field12 == 1) {
                                    class196.method1419(1L, class309.field4822, -1, "", var38, var39, (byte) -4, (short) 19);
                                }
                                class196.method1419(1L, class298.field4664, -1, "", var38, var39, (byte) -4, (short) 49);
                                continue;
                            }
                            if (var11.field2881 == 1339) {
                                if (var11.method1337(true)) {
                                    class287.method2022(var14, var11, var13, var12, 10254);
                                    if (class36.field534) {
                                        class194.method1416(arg7, arg1, arg9, arg0);
                                    } else {
                                        class168.method1234(arg7, arg1, arg9, arg0);
                                    }
                                }
                                continue;
                            }
                            if (var11.field2881 == 1400) {
                                class79.method627((byte) 28, var11.field2890, var13, var14, var11.field2904);
                                class40.field597[var12] = true;
                                class238.field3621[var12] = true;
                                if (class36.field534) {
                                    class194.method1416(arg7, arg1, arg9, arg0);
                                } else {
                                    class168.method1234(arg7, arg1, arg9, arg0);
                                }
                                continue;
                            }
                            if (var11.field2881 == 1401) {
                                class108.method833(var11.field2890, var14, var13, (byte) 118, var11.field2904);
                                class40.field597[var12] = true;
                                class238.field3621[var12] = true;
                                if (class36.field534) {
                                    class194.method1416(arg7, arg1, arg9, arg0);
                                } else {
                                    class168.method1234(arg7, arg1, arg9, arg0);
                                }
                                continue;
                            }
                            if (var11.field2881 == 1402) {
                                if (!class36.field534) {
                                    class81.method633(var13, var14, 18);
                                    class40.field597[var12] = true;
                                    class238.field3621[var12] = true;
                                }
                                continue;
                            }
                            if (var11.field2881 == 1405) {
                                if (!class87.field1285) {
                                    continue;
                                }
                                int var41 = var14 + 15;
                                int var42 = var11.field2890 + var13;
                                class182.field2726.method447("Fps:" + class96.field1424, var42, var41, 16776960, -1);
                                int var141 = var41 + 15;
                                Runtime var43 = Runtime.getRuntime();
                                int var44 = (int) ((var43.totalMemory() - var43.freeMemory()) / 1024L);
                                int var45 = 16776960;
                                if (var44 > 65536) {
                                    var45 = 16711680;
                                }
                                class182.field2726.method447("Mem:" + var44 + "k", var42, var141, var45, -1);
                                var41 = var141 + 15;
                                if (class36.field534) {
                                    int var46 = 16776960;
                                    int var47 = (class166.field2495 + class166.field2500 + class166.field2499) / 1024;
                                    if (var47 > 65536) {
                                        var46 = 16711680;
                                    }
                                    class182.field2726.method447("Card:" + var47 + "k", var42, var41, var46, -1);
                                    var41 += 15;
                                }
                                int var48 = 0;
                                int var49 = 16776960;
                                int var50 = 0;
                                int var51 = 0;
                                for (int var52 = 0; var52 < 28; var52++) {
                                    var48 += class142.field2204[var52].method758((byte) -58);
                                    var51 += class142.field2204[var52].method755((byte) 84);
                                    var50 += class142.field2204[var52].method756((byte) -73);
                                }
                                int var53 = var50 * 100 / var48;
                                int var54 = var51 * 10000 / var48;
                                String var55 = "Cache:" + class10.method80(arg3 ^ 0x7F, 0, (long) var54, 2, true) + "% (" + var53 + "%)";
                                class136.field2119.method447(var55, var42, var41, var49, -1);
                                class40.field597[var12] = true;
                                var41 += 12;
                                class238.field3621[var12] = true;
                                continue;
                            }
                            if (var11.field2881 == 1406) {
                                class93.field1344 = var14;
                                class132.field2066 = var13;
                                class304.field4763 = var11;
                                continue;
                            }
                        }
                        if (!class67.field982) {
                            if (var11.field2945 == 0 && var11.field2886 && class322.field5002 >= var23 && var20 <= class199.field3151 && var21 > class322.field5002 && var22 > class199.field3151 && !class199.field3147) {
                                class326.field5068[0] = 1004;
                                class67.field994[0] = class323.field5016;
                                class6.field62 = 1;
                                class27.field307[0] = class167.field2505;
                                class271.field4097[0] = "";
                            }
                            if (var23 <= class322.field5002 && class199.field3151 >= var20 && class322.field5002 < var21 && var22 > class199.field3151) {
                                class132.method1000(var11, class322.field5002 - var13, true, class199.field3151 - var14);
                            }
                        }
                        if (var11.field2945 == 0) {
                            if (!var11.field2802 && client.method1767(var11) && class322.field5012 != var11) {
                                continue;
                            }
                            if (!var11.field2802) {
                                if (var11.field2808 > (var11.field2882 - var11.field2904)) {
                                    var11.field2808 = var11.field2882 - var11.field2904;
                                }
                                if (var11.field2808 < 0) {
                                    var11.field2808 = 0;
                                }
                            }
                            method1750(var22, var20, var14 - var11.field2808, -1, arg4, var13 - var11.field2970, var12, var23, var11.field2806, var21);
                            if (var11.field2946 != null) {
                                method1750(var22, var20, var14 - var11.field2808, -1, var11.field2946, var13 - var11.field2970, var12, var23, var11.field2806, var21);
                            }
                            class111 var56 = (class111) client.field3794.method203(1710, (long) var11.field2806);
                            if (var56 != null) {
                                if (var56.field1751 == 0 && !class67.field982 && var23 <= class322.field5002 && var20 <= class199.field3151 && class322.field5002 < var21 && var22 > class199.field3151 && !class199.field3147) {
                                    class67.field994[0] = class323.field5016;
                                    class27.field307[0] = class167.field2505;
                                    class6.field62 = 1;
                                    class326.field5068[0] = 1004;
                                    class271.field4097[0] = "";
                                }
                                class76.method614(var22, var13, var12, var56.field1750, var23, var14, var20, 0, var21);
                            }
                            if (class36.field534) {
                                class194.method1416(arg7, arg1, arg9, arg0);
                            } else {
                                class168.method1234(arg7, arg1, arg9, arg0);
                                class56.method505();
                            }
                        }
                        if (class98.field1450[var12] || class301.field4718 > 1) {
                            if (var11.field2945 == 0 && !var11.field2802 && var11.field2904 < var11.field2882) {
                                class15.method114(74, var11.field2808, var11.field2904, var11.field2890 + var13, var14, var11.field2882);
                            }
                            if (var11.field2945 != 1) {
                                if (var11.field2945 == 2) {
                                    int var57 = 0;
                                    for (int var58 = 0; var58 < var11.field2913; var58++) {
                                        for (int var59 = 0; var59 < var11.field2936; var59++) {
                                            int var60 = (var11.field2906 + 32) * var59 + var13;
                                            int var61 = (var11.field2871 + 32) * var58 + var14;
                                            if (var57 < 20) {
                                                var61 += var11.field2865[var57];
                                                var60 += var11.field2927[var57];
                                            }
                                            if (var11.field2903[var57] > 0) {
                                                boolean var62 = false;
                                                boolean var63 = false;
                                                int var64 = var11.field2903[var57] - 1;
                                                if ((var60 + 32) > arg7 && arg9 > var60 && arg1 < var61 + 32 && var61 < arg0 || class66.field976 == var11 && class51.field784 == var57) {
                                                    class27 var65;
                                                    if (class327.field5077 == 1 && class271.field4091 == var57 && class196.field3104 == var11.field2806) {
                                                        var65 = class298.method2096(var11.field2856[var57], 0, 2, var64, arg3 + 6, var11.field2964);
                                                    } else {
                                                        var65 = class298.method2096(var11.field2856[var57], 3153952, 1, var64, 5, var11.field2964);
                                                    }
                                                    if (class56.field827) {
                                                        class40.field597[var12] = true;
                                                    }
                                                    if (var65 == null) {
                                                        class133.method1007(var11, 122);
                                                    } else if (class66.field976 == var11 && class51.field784 == var57) {
                                                        int var66 = class295.field4646 - class203.field3220;
                                                        int var67 = class273.field4129 - class263.field3932;
                                                        if (var67 < 5 && var67 > -5) {
                                                            var67 = 0;
                                                        }
                                                        if (var66 < 5 && var66 > -5) {
                                                            var66 = 0;
                                                        }
                                                        if (class72.field1041 < 5) {
                                                            var67 = 0;
                                                            var66 = 0;
                                                        }
                                                        var65.method184(var60 + var67, var61 + var66, 128);
                                                        if (arg8 != -1) {
                                                            int var68;
                                                            int var69;
                                                            if (class36.field534) {
                                                                var68 = class194.field3090;
                                                                var69 = class194.field3094;
                                                            } else {
                                                                var68 = class168.field2530;
                                                                var69 = class168.field2526;
                                                            }
                                                            class184 var70 = arg4[arg8 & 0xFFFF];
                                                            if (var61 + var66 < var68 && var70.field2808 > 0) {
                                                                int var71 = (var68 - var61 - var66) * class88.field1297 / 3;
                                                                if ((class88.field1297 * 10) < var71) {
                                                                    var71 = class88.field1297 * 10;
                                                                }
                                                                if (var71 > var70.field2808) {
                                                                    var71 = var70.field2808;
                                                                }
                                                                var70.field2808 -= var71;
                                                                class203.field3220 += var71;
                                                                class133.method1007(var70, 49);
                                                            }
                                                            if (var69 < var61 + var66 + 32 && var70.field2808 < var70.field2882 - var70.field2904) {
                                                                int var72 = (var61 + var66 + 32 - var69) * class88.field1297 / 3;
                                                                if (class88.field1297 * 10 < var72) {
                                                                    var72 = class88.field1297 * 10;
                                                                }
                                                                if ((var70.field2882 - var70.field2808 - var70.field2904) < var72) {
                                                                    var72 = var70.field2882 - var70.field2904 - var70.field2808;
                                                                }
                                                                var70.field2808 += var72;
                                                                class203.field3220 -= var72;
                                                                class133.method1007(var70, 111);
                                                            }
                                                        }
                                                    } else if (class309.field4819 == var11 && class219.field3445 == var57) {
                                                        var65.method184(var60, var61, 128);
                                                    } else {
                                                        var65.method186(var60, var61);
                                                    }
                                                }
                                            } else if (var11.field2921 != null && var57 < 20) {
                                                class27 var73 = var11.method1336((byte) 127, var57);
                                                if (var73 != null) {
                                                    var73.method186(var60, var61);
                                                } else if (class199.field3143) {
                                                    class133.method1007(var11, arg3 + 59);
                                                }
                                            }
                                            var57++;
                                        }
                                    }
                                } else if (var11.field2945 == 3) {
                                    int var74;
                                    if (class105.method811(true, var11)) {
                                        var74 = var11.field2839;
                                        if (class322.field5012 == var11 && var11.field2830 != 0) {
                                            var74 = var11.field2830;
                                        }
                                    } else {
                                        var74 = var11.field2942;
                                        if (class322.field5012 == var11 && var11.field2880 != 0) {
                                            var74 = var11.field2880;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var11.field2858) {
                                            if (class36.field534) {
                                                class194.method1413(var13, var14, var11.field2890, var11.field2904, var74);
                                            } else {
                                                class168.method1224(var13, var14, var11.field2890, var11.field2904, var74);
                                            }
                                        } else if (class36.field534) {
                                            class194.method1406(var13, var14, var11.field2890, var11.field2904, var74);
                                        } else {
                                            class168.method1228(var13, var14, var11.field2890, var11.field2904, var74);
                                        }
                                    } else if (var11.field2858) {
                                        if (class36.field534) {
                                            class194.method1412(var13, var14, var11.field2890, var11.field2904, var74, 256 - (var15 & 0xFF));
                                        } else {
                                            class168.method1226(var13, var14, var11.field2890, var11.field2904, var74, 256 - (var15 & 0xFF));
                                        }
                                    } else if (class36.field534) {
                                        class194.method1414(var13, var14, var11.field2890, var11.field2904, var74, 256 - (var15 & 0xFF));
                                    } else {
                                        class168.method1237(var13, var14, var11.field2890, var11.field2904, var74, 256 - (var15 & 0xFF));
                                    }
                                } else if (var11.field2945 == 4) {
                                    class48 var75 = var11.method1333((byte) -78, class255.field3810);
                                    if (var75 != null) {
                                        String var76 = var11.field2840;
                                        int var77;
                                        if (class105.method811(true, var11)) {
                                            var77 = var11.field2839;
                                            if (class322.field5012 == var11 && var11.field2830 != 0) {
                                                var77 = var11.field2830;
                                            }
                                            if (var11.field2843.length() > 0) {
                                                var76 = var11.field2843;
                                            }
                                        } else {
                                            var77 = var11.field2942;
                                            if (class322.field5012 == var11 && var11.field2880 != 0) {
                                                var77 = var11.field2880;
                                            }
                                        }
                                        if (var11.field2802 && var11.field2885 != -1) {
                                            class274 var78 = class225.method1603(var11.field2885, 0);
                                            var76 = var78.field4149;
                                            if (var76 == null) {
                                                var76 = "null";
                                            }
                                            if ((var78.field4173 == 1 || var11.field2908 != 1) && var11.field2908 != -1) {
                                                var76 = "<col=ff9040>" + var76 + "</col> x" + class45.method414(var11.field2908, arg3 ^ 0x74);
                                            }
                                        }
                                        if (class20.field227 == var11) {
                                            var76 = class67.field1000;
                                            var77 = var11.field2942;
                                        }
                                        if (!var11.field2802) {
                                            var76 = class60.method540((byte) -62, var76, var11);
                                        }
                                        var75.method427(var76, var13, var14, var11.field2890, var11.field2904, var77, var11.field2807 ? 0 : -1, var11.field2952, var11.field2920, var11.field2873);
                                    } else if (class199.field3143) {
                                        class133.method1007(var11, 115);
                                    }
                                } else if (var11.field2945 == 5) {
                                    if (var11.field2802) {
                                        class27 var126;
                                        if (var11.field2885 == -1) {
                                            var126 = var11.method1342(1, false);
                                        } else {
                                            var126 = class298.method2096(var11.field2908, var11.field2829, var11.field2916, var11.field2885, 5, var11.field2964);
                                        }
                                        if (var126 != null) {
                                            int var127 = var126.field311;
                                            int var128 = var126.field316;
                                            if (var11.field2965) {
                                                int var130 = (-(-var127 - var11.field2890) - 1) / var127;
                                                int var131 = (var11.field2904 + var128 - 1) / var128;
                                                if (class36.field534) {
                                                    class194.method1418(var13, var14, var11.field2890 + var13, var11.field2904 + var14);
                                                    class221 var134 = (class221) var126;
                                                    boolean var135 = class141.method1066((byte) -67, var126.field312);
                                                    boolean var136 = class141.method1066((byte) -80, var126.field315);
                                                    if (var135 && var136) {
                                                        if (var15 == 0) {
                                                            var134.method1577(var13, var14, var130, var131);
                                                        } else {
                                                            var134.method1581(var13, var14, 256 - (var15 & 0xFF), var130, var131);
                                                        }
                                                    } else if (var135) {
                                                        for (int var137 = 0; var137 < var131; var137++) {
                                                            if (var15 == 0) {
                                                                var134.method1577(var13, var128 * var137 + var14, var130, 1);
                                                            } else {
                                                                var134.method1581(var13, var128 * var137 + var14, 256 - (var15 & 0xFF), var130, 1);
                                                            }
                                                        }
                                                    } else if (var136) {
                                                        for (int var138 = 0; var138 < var130; var138++) {
                                                            if (var15 == 0) {
                                                                var134.method1577(var127 * var138 + var13, var14, 1, var131);
                                                            } else {
                                                                var134.method1581(var127 * var138 + var13, var14, 256 - (var15 & 0xFF), 1, var131);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var139 = 0; var139 < var130; var139++) {
                                                            for (int var140 = 0; var140 < var131; var140++) {
                                                                if (var15 == 0) {
                                                                    var126.method186(var127 * var139 + var13, var128 * var140 + var14);
                                                                } else {
                                                                    var126.method184(var127 * var139 + var13, var128 * var140 + var14, 256 - (var15 & 0xFF));
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class194.method1416(arg7, arg1, arg9, arg0);
                                                } else {
                                                    class168.method1230(var13, var14, var11.field2890 + var13, var14 - -var11.field2904);
                                                    for (int var132 = 0; var132 < var130; var132++) {
                                                        for (int var133 = 0; var133 < var131; var133++) {
                                                            if (var11.field2799 != 0) {
                                                                var126.method185(4096, var128 / 2 + var128 * var133 + var14, 85323683, var127 * var132 + (var127 / 2) + var13, var11.field2799);
                                                            } else if (var15 == 0) {
                                                                var126.method186(var127 * var132 + var13, var14 - -(var128 * var133));
                                                            } else {
                                                                var126.method184(var127 * var132 + var13, var128 * var133 + var14, 256 - (var15 & 0xFF));
                                                            }
                                                        }
                                                    }
                                                    class168.method1234(arg7, arg1, arg9, arg0);
                                                }
                                            } else {
                                                int var129 = var11.field2890 * 4096 / var127;
                                                if (var11.field2799 != 0) {
                                                    var126.method185(var129, var11.field2904 / 2 + var14, 85323683, var13 + (var11.field2890 / 2), var11.field2799);
                                                } else if (var15 != 0) {
                                                    var126.method182(var13, var14, var11.field2890, var11.field2904, 256 - (var15 & 0xFF));
                                                } else if (var11.field2890 == var127 && var11.field2904 == var128) {
                                                    var126.method186(var13, var14);
                                                } else {
                                                    var126.method187(var13, var14, var11.field2890, var11.field2904);
                                                }
                                            }
                                        } else if (class199.field3143) {
                                            class133.method1007(var11, arg3 ^ 0xFFFFFF90);
                                        }
                                    } else {
                                        class27 var125 = var11.method1342(1, class105.method811(true, var11));
                                        if (var125 != null) {
                                            var125.method186(var13, var14);
                                        } else if (class199.field3143) {
                                            class133.method1007(var11, 114);
                                        }
                                    }
                                } else if (var11.field2945 == 6) {
                                    boolean var106 = class105.method811(true, var11);
                                    int var107;
                                    if (var106) {
                                        var107 = var11.field2810;
                                    } else {
                                        var107 = var11.field2950;
                                    }
                                    class1 var108 = null;
                                    int var109 = 0;
                                    if (var11.field2885 != -1) {
                                        class274 var114 = class225.method1603(var11.field2885, 0);
                                        if (var114 != null) {
                                            class274 var115 = var114.method1917(var11.field2908, (byte) -113);
                                            class162 var116 = var107 == -1 ? null : class173.method1259((byte) 119, var107);
                                            var108 = var115.method1916(var116, var11.field2892, 1, var11.field2925, var11.field2905, (byte) -22);
                                            if (var108 == null) {
                                                class133.method1007(var11, 97);
                                            } else {
                                                var109 = -var108.method19() / 2;
                                            }
                                        }
                                    } else if (var11.field2930 == 5) {
                                        if (var11.field2798 == -1) {
                                            var108 = class317.field4922.method1641(-1, -1, (class162) null, -1, 0, 0, -1, (class47[]) null, (class162) null, true, -1);
                                        } else {
                                            int var110 = var11.field2798 & 0x7FF;
                                            if (class196.field3111 == var110) {
                                                var110 = 2047;
                                            }
                                            class121 var111 = class319.field4964[var110];
                                            class162 var112 = var107 == -1 ? null : class173.method1259((byte) 119, var107);
                                            if (var111 != null && (int) class224.method1597(true, var111.field1895) << 11 == (var11.field2798 & 0xFFFFF800)) {
                                                var108 = var111.field1914.method1641(-1, 0, var112, -1, 0, 0, -1, (class47[]) null, (class162) null, true, var11.field2925);
                                            }
                                        }
                                    } else if (var107 == -1) {
                                        var108 = var11.method1332((class162) null, -1, var106, -1, -114, 0, class235.field3602.field1914);
                                        if (var108 == null && class199.field3143) {
                                            class133.method1007(var11, 83);
                                        }
                                    } else {
                                        class162 var113 = class173.method1259((byte) 119, var107);
                                        var108 = var11.method1332(var113, var11.field2925, var106, var11.field2905, -114, var11.field2892, class235.field3602.field1914);
                                        if (var108 == null && class199.field3143) {
                                            class133.method1007(var11, arg3 + 117);
                                        }
                                    }
                                    if (var108 != null) {
                                        int var117;
                                        if (var11.field2901 > 0) {
                                            var117 = (var11.field2890 << 8) / var11.field2901;
                                        } else {
                                            var117 = 256;
                                        }
                                        int var118 = (var11.field2867 * var117 >> 8) + var11.field2890 / 2 + var13;
                                        int var119;
                                        if (var11.field2848 > 0) {
                                            var119 = (var11.field2904 << 8) / var11.field2848;
                                        } else {
                                            var119 = 256;
                                        }
                                        int var120 = (var11.field2850 * var119 >> 8) + (var14 + (var11.field2904 / 2));
                                        if (class36.field534) {
                                            if (var11.field2811) {
                                                class36.method308(var118, var120, var11.field2879, var11.field2972, var117, var119);
                                            } else {
                                                class36.method332(var118, var120, var117, var119);
                                                class36.method326((float) var11.field2845, (float) var11.field2972 * 1.5F);
                                            }
                                            class36.method311();
                                            class36.method318(true);
                                            class36.method333(false);
                                            class155.method1132(class317.field4926, -60);
                                            if (class142.field2186) {
                                                class194.method1405();
                                                class36.method335();
                                                class194.method1416(arg7, arg1, arg9, arg0);
                                                class142.field2186 = false;
                                            }
                                            if (var11.field2837) {
                                                class36.method319();
                                            }
                                            int var121 = class56.field830[var11.field2941] * var11.field2879 >> 16;
                                            int var122 = class56.field838[var11.field2941] * var11.field2879 >> 16;
                                            if (var11.field2802) {
                                                var108.method18(0, var11.field2878, var11.field2896, var11.field2941, var11.field2911, var122 + var109 + var11.field2933, var11.field2933 + var121, -1L);
                                            } else {
                                                var108.method18(0, var11.field2878, 0, var11.field2941, 0, var122, var121, -1L);
                                            }
                                            if (var11.field2837) {
                                                class36.method305();
                                            }
                                        } else {
                                            class56.method494(var118, var120);
                                            int var123 = class56.field838[var11.field2941] * var11.field2879 >> 16;
                                            int var124 = class56.field830[var11.field2941] * var11.field2879 >> 16;
                                            if (!var11.field2802) {
                                                var108.method18(0, var11.field2878, 0, var11.field2941, 0, var123, var124, -1L);
                                            } else if (var11.field2811) {
                                                ((class85) var108).method701(0, var11.field2878, var11.field2896, var11.field2941, var11.field2911, var109 + var123 + var11.field2933, var124 - -var11.field2933, var11.field2879);
                                            } else {
                                                var108.method18(0, var11.field2878, var11.field2896, var11.field2941, var11.field2911, var109 + var123 + var11.field2933, var11.field2933 + var124, -1L);
                                            }
                                            class56.method492();
                                        }
                                    }
                                } else {
                                    if (var11.field2945 == 7) {
                                        class48 var79 = var11.method1333((byte) -70, class255.field3810);
                                        if (var79 == null) {
                                            if (class199.field3143) {
                                                class133.method1007(var11, arg3 + 50);
                                            }
                                            continue;
                                        }
                                        int var80 = 0;
                                        for (int var81 = 0; var81 < var11.field2913; var81++) {
                                            for (int var82 = 0; var82 < var11.field2936; var82++) {
                                                if (var11.field2903[var80] > 0) {
                                                    class274 var83 = class225.method1603(var11.field2903[var80] - 1, 0);
                                                    String var84;
                                                    if (var83.field4173 != 1 && var11.field2856[var80] == 1) {
                                                        var84 = "<col=ff9040>" + var83.field4149 + "</col>";
                                                    } else {
                                                        var84 = "<col=ff9040>" + var83.field4149 + "</col> x" + class45.method414(var11.field2856[var80], -99);
                                                    }
                                                    int var85 = (var11.field2871 + 12) * var81 + var14;
                                                    int var86 = var13 + ((var11.field2906 + 115) * var82);
                                                    if (var11.field2952 == 0) {
                                                        var79.method434(var84, var86, var85, var11.field2942, var11.field2807 ? 0 : -1);
                                                    } else if (var11.field2952 == 1) {
                                                        var79.method439(var84, var86 + 57, var85, var11.field2942, var11.field2807 ? 0 : -1);
                                                    } else {
                                                        var79.method447(var84, var86 + 115 - 1, var85, var11.field2942, var11.field2807 ? 0 : -1);
                                                    }
                                                }
                                                var80++;
                                            }
                                        }
                                    }
                                    if (var11.field2945 == 8 && class299.field4707 == var11 && class33.field415 == class30.field386) {
                                        int var87 = 0;
                                        String var88 = var11.field2840;
                                        class48 var89 = class182.field2726;
                                        String var90 = class60.method540((byte) 126, var88, var11);
                                        int var91 = 0;
                                        while (var90.length() > 0) {
                                            int var92 = var90.indexOf("<br>");
                                            String var93;
                                            if (var92 == -1) {
                                                var93 = var90;
                                                var90 = "";
                                            } else {
                                                var93 = var90.substring(0, var92);
                                                var90 = var90.substring(var92 + 4);
                                            }
                                            int var94 = var89.method426(var93);
                                            var91 += var89.field733 + 1;
                                            if (var87 < var94) {
                                                var87 = var94;
                                            }
                                        }
                                        var91 += 7;
                                        var87 += 6;
                                        int var95 = var14 + var11.field2904 + 5;
                                        if (var91 + var95 > arg0) {
                                            var95 = arg0 - var91;
                                        }
                                        int var96 = var11.field2890 + var13 - var87 - 5;
                                        if ((var13 + 5) > var96) {
                                            var96 = var13 + 5;
                                        }
                                        if ((var87 + var96) > arg9) {
                                            var96 = arg9 - var87;
                                        }
                                        if (class36.field534) {
                                            class194.method1413(var96, var95, var87, var91, 16777120);
                                            class194.method1406(var96, var95, var87, var91, 0);
                                        } else {
                                            class168.method1224(var96, var95, var87, var91, 16777120);
                                            class168.method1228(var96, var95, var87, var91, 0);
                                        }
                                        String var97 = var11.field2840;
                                        int var98 = var95 + var89.field733 + 2;
                                        String var99 = class60.method540((byte) 117, var97, var11);
                                        while (var99.length() > 0) {
                                            int var100 = var99.indexOf("<br>");
                                            String var101;
                                            if (var100 == -1) {
                                                var101 = var99;
                                                var99 = "";
                                            } else {
                                                var101 = var99.substring(0, var100);
                                                var99 = var99.substring(var100 + 4);
                                            }
                                            var89.method434(var101, var96 + 3, var98, 0, -1);
                                            var98 += var89.field733 + 1;
                                        }
                                    }
                                    if (var11.field2945 == 9) {
                                        int var102;
                                        int var103;
                                        int var104;
                                        int var105;
                                        if (var11.field2943) {
                                            var104 = var13 + var11.field2890;
                                            var102 = var14;
                                            var103 = var11.field2904 + var14;
                                            var105 = var13;
                                        } else {
                                            var102 = var11.field2904 + var14;
                                            var103 = var14;
                                            var104 = var13 + var11.field2890;
                                            var105 = var13;
                                        }
                                        if (var11.field2932 == 1) {
                                            if (class36.field534) {
                                                class194.method1407(var105, var103, var104, var102, var11.field2942);
                                            } else {
                                                class168.method1243(var105, var103, var104, var102, var11.field2942);
                                            }
                                        } else if (class36.field534) {
                                            class194.method1409(var105, var103, var104, var102, var11.field2942, var11.field2932);
                                        } else {
                                            class168.method1240(var105, var103, var104, var102, var11.field2942, var11.field2932);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg3 != -1) {
            field3767 = (class23) null;
        }
    }

    @OriginalMember(owner = "client!md", name = "e", descriptor = "(I)V", line = 1338)
    public static void method1751(int arg0) {
        field3768 = null;
        field3767 = null;
        field3770 = null;
        if (arg0 <= 32) {
            method1749(-5);
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(IB)I", line = 1352)
    public static final int method1752(int arg0, byte arg1) {
        if (arg1 == -111) {
            field3759++;
            return arg0 >>> 8;
        } else {
            return 87;
        }
    }

    @OriginalMember(owner = "client!md", name = "f", descriptor = "(I)Z", line = 1371)
    public static final boolean method1753(int arg0) {
        field3769++;
        if (arg0 == -8090) {
            return class36.field534 ? true : class270.field4081;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(I)Ljava/lang/Object;", line = 1386)
    public final Object method358(int arg0) {
        field3762++;
        if (arg0 != 0) {
            field3767 = (class23) null;
        }
        return this.field3763;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ZIZIII)V", line = 1397)
    public static final void method1754(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg4 < 1) {
            arg4 = 1;
        }
        if (arg5 < 1) {
            arg5 = 1;
        }
        field3766++;
        if (class36.field534) {
            int var6 = arg4 - 334;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 100) {
                var6 = 100;
            }
            int var7 = (class307.field4794 - class263.field3929) * var6 / 100 + class263.field3929;
            if (class133.field2094 > var7) {
                var7 = class133.field2094;
            } else if (var7 > class270.field4066) {
                var7 = class270.field4066;
            }
            int var8 = var7 * 512 * arg4 / (arg5 * 334);
            if (var8 < class277.field4256) {
                short var12 = class277.field4256;
                var7 = arg5 * var12 * 334 / (arg4 * 512);
                if (var7 > class270.field4066) {
                    var7 = class270.field4066;
                    int var13 = var7 * 512 * arg4 / (var12 * 334);
                    int var14 = (arg5 - var13) / 2;
                    if (arg0) {
                        class194.method1405();
                        class194.method1413(arg3, arg1, var14, arg4, 0);
                        class194.method1413(arg3 + arg5 - var14, arg1, var14, arg4, 0);
                    }
                    arg5 -= var14 * 2;
                    arg3 += var14;
                }
            } else if (var8 > class227.field3519) {
                short var9 = class227.field3519;
                var7 = arg5 * var9 * 334 / (arg4 * 512);
                if (var7 < class133.field2094) {
                    var7 = class133.field2094;
                    int var10 = arg5 * 334 * var9 / (var7 * 512);
                    int var11 = (arg4 - var10) / 2;
                    if (arg0) {
                        class194.method1405();
                        class194.method1413(arg3, arg1, arg5, var11, 0);
                        class194.method1413(arg3, arg1 - (var11 - arg4), arg5, var11, 0);
                    }
                    arg4 -= var11 * 2;
                    arg1 += var11;
                }
            }
            class135.field2103 = arg4 * var7 / 334;
        }
        if (arg2) {
            method1751(-108);
        }
        class270.field4068 = arg3;
        class138.field2157 = (short) arg5;
        class34.field418 = arg1;
        class250.field3754 = (short) arg4;
    }

    @OriginalMember(owner = "client!md", name = "e", descriptor = "(B)Z", line = 1496)
    public final boolean method361(byte arg0) {
        if (arg0 != 35) {
            method1749(10);
        }
        field3758++;
        return false;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIIII)V", line = 1507)
    public static final void method1755(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class96 var7 = new class96();
        var7.field1423 = arg1 / 128;
        var7.field1413 = arg2 / 128;
        var7.field1431 = arg3 / 128;
        var7.field1409 = arg4 / 128;
        var7.field1408 = arg0;
        var7.field1419 = arg1;
        var7.field1416 = arg2;
        var7.field1407 = arg3;
        var7.field1427 = arg4;
        var7.field1406 = arg5;
        var7.field1415 = arg6;
        class213.field3389[class262.field3901++] = var7;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ILjava/lang/String;)[B", line = 1526)
    public static final byte[] method1756(int arg0, String arg1) {
        int var2 = 101 % ((arg0 - 2) / 39);
        field3760++;
        int var3 = arg1.length();
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            char var6 = arg1.charAt(var5);
            if (var6 > '\u0000' && var6 < '\u0080' || var6 >= ' ' && var6 <= 'ÿ') {
                var4[var5] = (byte) var6;
            } else if (var6 == '€') {
                var4[var5] = -128;
            } else if (var6 == '‚') {
                var4[var5] = -126;
            } else if (var6 == 'ƒ') {
                var4[var5] = -125;
            } else if (var6 == '„') {
                var4[var5] = -124;
            } else if (var6 == '…') {
                var4[var5] = -123;
            } else if (var6 == '†') {
                var4[var5] = -122;
            } else if (var6 == '‡') {
                var4[var5] = -121;
            } else if (var6 == 'ˆ') {
                var4[var5] = -120;
            } else if (var6 == '‰') {
                var4[var5] = -119;
            } else if (var6 == 'Š') {
                var4[var5] = -118;
            } else if (var6 == '‹') {
                var4[var5] = -117;
            } else if (var6 == 'Œ') {
                var4[var5] = -116;
            } else if (var6 == 'Ž') {
                var4[var5] = -114;
            } else if (var6 == '‘') {
                var4[var5] = -111;
            } else if (var6 == '’') {
                var4[var5] = -110;
            } else if (var6 == '“') {
                var4[var5] = -109;
            } else if (var6 == '”') {
                var4[var5] = -108;
            } else if (var6 == '•') {
                var4[var5] = -107;
            } else if (var6 == '–') {
                var4[var5] = -106;
            } else if (var6 == '—') {
                var4[var5] = -105;
            } else if (var6 == '˜') {
                var4[var5] = -104;
            } else if (var6 == '™') {
                var4[var5] = -103;
            } else if (var6 == 'š') {
                var4[var5] = -102;
            } else if (var6 == '›') {
                var4[var5] = -101;
            } else if (var6 == 'œ') {
                var4[var5] = -100;
            } else if (var6 == 'ž') {
                var4[var5] = -98;
            } else if (var6 == 'Ÿ') {
                var4[var5] = -97;
            } else {
                throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var6, 16) + " in CharSequence");
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 1669)
    public class252(Object arg0) {
        this.field3763 = arg0;
    }
}
