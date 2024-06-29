import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class125 {

    @OriginalMember(owner = "client!s", name = "f", descriptor = "[J")
    public static long[] field2905 = new long[32];

    @OriginalMember(owner = "client!s", name = "d", descriptor = "Lec;")
    public static class32 field2903 = class73.method594("Spieler)3 Bitte w-=hlen Sie eine andere Welt)3", true);

    @OriginalMember(owner = "client!s", name = "e", descriptor = "Lec;")
    public static class32 field2904 = class73.method594("Diese Welt ist voll)3", true);

    @OriginalMember(owner = "client!s", name = "n", descriptor = "I")
    public static int field2913 = 0;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    public static int field2900 = 0;

    @OriginalMember(owner = "client!s", name = "p", descriptor = "I")
    public static int field2915 = 0;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "Lec;")
    private static class32 field2902 = class73.method594("Too many connections from your address)3", true);

    @OriginalMember(owner = "client!s", name = "q", descriptor = "Z")
    public static boolean field2916 = false;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "Lec;")
    public static class32 field2908 = field2902;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "I")
    public static int field2909;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!s", name = "l", descriptor = "I")
    public static int field2911;

    @OriginalMember(owner = "client!s", name = "m", descriptor = "I")
    public static int field2912;

    @OriginalMember(owner = "client!s", name = "o", descriptor = "I")
    public static int field2914;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Z)V")
    public static final void method979(boolean arg0) {
        field2911++;
        if (class66.field1586 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (class66.field1586 > 768) {
                    class63.field1443[var1] = class85.method659(class133.field3088[var1], 1024 - class66.field1586, (byte) 35, class94.field2171[var1]);
                } else if (class66.field1586 > 256) {
                    class63.field1443[var1] = class133.field3088[var1];
                } else {
                    class63.field1443[var1] = class85.method659(class94.field2171[var1], 256 - class66.field1586, (byte) 35, class133.field3088[var1]);
                }
            }
        } else if (class85.field1997 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (class85.field1997 > 768) {
                    class63.field1443[var2] = class85.method659(class124.field2892[var2], 1024 - class85.field1997, (byte) 35, class94.field2171[var2]);
                } else if (class85.field1997 <= 256) {
                    class63.field1443[var2] = class85.method659(class94.field2171[var2], 256 - class85.field1997, (byte) 35, class124.field2892[var2]);
                } else {
                    class63.field1443[var2] = class124.field2892[var2];
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                class63.field1443[var3] = class94.field2171[var3];
            }
        }
        int var4 = 0;
        int var5 = 6885;
        short var6 = 256;
        class141.method1068(0, 9, 128, var6 + 7);
        class100.field2322.method388(0, 0);
        class141.method1058();
        for (int var7 = 1; var7 < var6 - 1; var7++) {
            int var20 = (var6 - var7) * class81.field1869[var7] / var6;
            int var21 = var20 + 22;
            if (var21 < 0) {
                var21 = 0;
            }
            var4 += var21;
            for (int var22 = var21; var22 < 128; var22++) {
                int var23 = class43.field999[var4++];
                if (var23 == 0) {
                    var5++;
                } else {
                    int var25 = class50.field1158.field1125[var5];
                    int var26 = 256 - var23;
                    int var27 = class63.field1443[var23];
                    class50.field1158.field1125[var5++] = class41.method326(16711680, class41.method326(var27, 65280) * var23 + var26 * class41.method326(var25, 65280)) + class41.method326(var26 * class41.method326(var25, 16711935) + class41.method326(16711935, var27) * var23, -16711936) >> 8;
                }
            }
            var5 += var21 + 765 - 128;
        }
        int var8 = 7546;
        int var9 = 0;
        class141.method1068(637, 9, 765, var6 + 7);
        class45.field1053.method388(382, 0);
        if (!arg0) {
            method982(54);
        }
        class141.method1058();
        for (int var10 = 1; var10 < var6 - 1; var10++) {
            int var11 = (var6 - var10) * class81.field1869[var10] / var6;
            int var12 = var8 + var11;
            int var13 = 103 - var11;
            for (int var14 = 0; var14 < var13; var14++) {
                int var15 = class43.field999[var9++];
                if (var15 == 0) {
                    var12++;
                } else {
                    int var17 = 256 - var15;
                    int var18 = class50.field1158.field1125[var12];
                    int var19 = class63.field1443[var15];
                    class50.field1158.field1125[var12++] = class41.method326(class41.method326(var19, 16711935) * var15 + var17 * class41.method326(16711935, var18), -16711936) + class41.method326(class41.method326(var19, 65280) * var15 + var17 * class41.method326(var18, 65280), 16711680) >> 8;
                }
            }
            var9 += 128 - var13;
            var8 = var12 + 765 - var11 - var13;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)Lec;")
    private static final class32 method980(int arg0, int arg1) {
        class32 var2 = class159.method1230(arg0, arg1 ^ arg1);
        for (int var3 = var2.method240((byte) 32) - 3; var3 > 0; var3 -= 3) {
            var2 = class52.method403(new class32[] { var2.method241((byte) -120, 0, var3), class75.field1770, var2.method268((byte) -64, var3) }, (byte) -20);
        }
        field2909++;
        if (var2.method240((byte) 36) > 9) {
            return class52.method403(new class32[] { class135.field3140, var2.method241((byte) 57, 0, var2.method240((byte) 88) - 8), class44.field1045, class41.field955, var2, class106.field2503 }, (byte) -20);
        } else if (var2.method240((byte) 95) > 6) {
            return class52.method403(new class32[] { class38.field928, var2.method241((byte) -128, 0, var2.method240((byte) 60) - 4), class89.field2052, class41.field955, var2, class106.field2503 }, (byte) -20);
        } else {
            return class52.method403(new class32[] { class151.field3468, var2, class65.field1509 }, (byte) -20);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III[Lf;IIIIII)V")
    public static final void method981(int arg0, int arg1, int arg2, class36[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class141.method1068(arg2, arg8, arg1, arg9);
        class7.method36();
        int var10 = 0;
        if (arg0 != 1) {
            method981(91, -79, -124, null, -18, 20, 127, 30, 76, 125);
        }
        while (arg3.length > var10) {
            class36 var11 = arg3[var10];
            if (var11 != null && (var11.field865 == arg4 || arg4 == -1412584499 && class158.field3631 == var11)) {
                int var12;
                if (arg7 == -1) {
                    class144.field3289[class133.field3083] = var11.field830 + arg5;
                    class124.field2894[class133.field3083] = var11.field856 + arg6;
                    class28.field512[class133.field3083] = var11.field811;
                    class20.field366[class133.field3083] = var11.field774;
                    var12 = class133.field3083++;
                } else {
                    var12 = arg7;
                }
                var11.field824 = var12;
                var11.field841 = class140.field3219;
                if (!var11.field849 || !class118.method934(true, var11)) {
                    label758: {
                        if (var11.field846 > 0) {
                            class34.method290(1, var11);
                        }
                        int var13 = var11.field830 + arg5;
                        int var14 = var11.field862;
                        int var15 = var11.field856 + arg6;
                        if (class158.field3631 == var11) {
                            if (arg4 != -1412584499 && !var11.field863) {
                                class84.field1969 = arg6;
                                class68.field1604 = arg5;
                                class98.field2255 = arg3;
                                break label758;
                            }
                            if (!var11.field863) {
                                var14 = 128;
                            }
                            if (class77.field1790 && class27.field500) {
                                int var16 = class140.field3218;
                                int var17 = var16 - class88.field2031;
                                if (class137.field3182 > var17) {
                                    var17 = class137.field3182;
                                }
                                if (class137.field3182 + class117.field2809.field774 < var11.field774 + var17) {
                                    var17 = class117.field2809.field774 + class137.field3182 - var11.field774;
                                }
                                int var18 = class86.field2002;
                                int var19 = var18 - class45.field1069;
                                var15 = var17;
                                if (class111.field2608 > var19) {
                                    var19 = class111.field2608;
                                }
                                if (class111.field2608 + class117.field2809.field811 < var11.field811 + var19) {
                                    var19 = class111.field2608 + class117.field2809.field811 - var11.field811;
                                }
                                var13 = var19;
                            }
                        }
                        int var20;
                        int var21;
                        int var22;
                        int var23;
                        if (var11.field756 == 2) {
                            var20 = arg9;
                            var21 = arg2;
                            var22 = arg8;
                            var23 = arg1;
                        } else if (var11.field756 == 9) {
                            int var26 = var15;
                            int var27 = var13;
                            int var28 = var11.field774 + var15;
                            int var29 = var11.field811 + var13;
                            if (var13 > var29) {
                                var27 = var29;
                                var29 = var13;
                            }
                            var21 = arg2 >= var27 ? arg2 : var27;
                            if (var15 > var28) {
                                var26 = var28;
                                var28 = var15;
                            }
                            var22 = var26 <= arg8 ? arg8 : var26;
                            var28++;
                            var20 = var28 < arg9 ? var28 : arg9;
                            var29++;
                            var23 = arg1 <= var29 ? arg1 : var29;
                        } else {
                            var22 = arg8 < var15 ? var15 : arg8;
                            var21 = var13 > arg2 ? var13 : arg2;
                            int var24 = var11.field811 + var13;
                            int var25 = var11.field774 + var15;
                            var23 = var24 < arg1 ? var24 : arg1;
                            var20 = var25 >= arg9 ? arg9 : var25;
                        }
                        if (!var11.field849 || var23 > var21 && var22 < var20) {
                            label768: {
                                if (var11.field846 != 0) {
                                    if (var11.field846 == 1337) {
                                        class154.field3515 = var15;
                                        class32.field677 = var13;
                                        class75.method603(var11.field811, var13, var11.field774, (byte) 117, var15);
                                        class141.method1068(arg2, arg8, arg1, arg9);
                                        break label768;
                                    }
                                    if (var11.field846 == 1338) {
                                        class88.method673(var15, var13, var12, arg0 ^ 0xFFFFFF82);
                                        class141.method1068(arg2, arg8, arg1, arg9);
                                        break label768;
                                    }
                                }
                                int var32 = class86.field2002;
                                int var33 = class140.field3218;
                                if (!class26.field476 && var21 <= var32 && var22 <= var33 && var23 > var32 && var20 > var33) {
                                    class159.method1231(true, var33 - var15, var11, var32 - var13);
                                }
                                if (var11.field756 == 0) {
                                    if (!var11.field849 && class118.method934(true, var11) && class50.field1164 != var11) {
                                        break label768;
                                    }
                                    if (!var11.field849) {
                                        if (var11.field821 - var11.field774 < var11.field873) {
                                            var11.field873 = var11.field821 - var11.field774;
                                        }
                                        if (var11.field873 < 0) {
                                            var11.field873 = 0;
                                        }
                                    }
                                    method981(1, var23, var21, arg3, var11.field744, var13 - var11.field844, -var11.field873 + var15, var12, var22, var20);
                                    if (var11.field755 != null) {
                                        method981(1, var23, var21, var11.field755, var11.field744, var13 - var11.field844, -var11.field873 + var15, var12, var22, var20);
                                    }
                                    class144 var34 = (class144) class109.field2573.method1198((long) var11.field744, (byte) -106);
                                    if (var34 != null) {
                                        if (var34.field3293 == 0 && class86.field2002 >= var21 && class140.field3218 >= var22 && class86.field2002 < var23 && var20 > class140.field3218 && !class26.field476 && !class146.field3320) {
                                            class119.field2851 = 1;
                                            class44.field1035[0] = 1007;
                                            class109.field2577[0] = class92.field2116;
                                            class56.field1296[0] = class77.field1787;
                                        }
                                        class84.method657(var22, -101, var13, var34.field3282, var21, var12, var23, var20, var15);
                                    }
                                    class141.method1068(arg2, arg8, arg1, arg9);
                                    class7.method36();
                                }
                                if (class57.field1319[var12] || class92.field2118 > 1) {
                                    if (var11.field756 == 0 && !var11.field849 && var11.field774 < var11.field821) {
                                        class32.method257((byte) 53, var11.field873, var15, var11.field811 + var13, var11.field821, var11.field774);
                                    }
                                    if (var11.field756 != 1) {
                                        if (var11.field756 == 2) {
                                            int var35 = 0;
                                            for (int var36 = 0; var36 < var11.field774; var36++) {
                                                for (int var37 = 0; var37 < var11.field811; var37++) {
                                                    int var38 = var13 + (var11.field819 + 32) * var37;
                                                    int var39 = (var11.field785 + 32) * var36 + var15;
                                                    if (var35 < 20) {
                                                        var39 += var11.field746[var35];
                                                        var38 += var11.field810[var35];
                                                    }
                                                    if (var11.field835[var35] > 0) {
                                                        boolean var40 = false;
                                                        boolean var41 = false;
                                                        int var42 = var11.field835[var35] - 1;
                                                        if (arg2 < var38 + 32 && var38 < arg1 && arg8 < var39 + 32 && var39 < arg9 || class34.field724 == var11 && class107.field2544 == var35) {
                                                            class49 var43;
                                                            if (field2915 == 1 && class41.field967 == var35 && class44.field1039 == var11.field744) {
                                                                var43 = class133.method1018(2, var42, 54, false, 0, var11.field754[var35]);
                                                            } else {
                                                                var43 = class133.method1018(1, var42, -123, false, 3153952, var11.field754[var35]);
                                                            }
                                                            if (var43 == null) {
                                                                class132.method1010(var11, (byte) -115);
                                                            } else if (class34.field724 == var11 && class107.field2544 == var35) {
                                                                int var44 = class86.field2002 - class113.field2639;
                                                                int var45 = class140.field3218 - class94.field2162;
                                                                if (var44 < 5 && var44 > -5) {
                                                                    var44 = 0;
                                                                }
                                                                if (var45 < 5 && var45 > -5) {
                                                                    var45 = 0;
                                                                }
                                                                if (class109.field2571 < 5) {
                                                                    var45 = 0;
                                                                    var44 = 0;
                                                                }
                                                                var43.method385(var38 + var44, var39 - -var45, 128);
                                                                if (arg4 != -1) {
                                                                    class36 var46 = arg3[arg4 & 0xFFFF];
                                                                    if (class141.field3238 > var39 + var45 && var46.field873 > 0) {
                                                                        int var47 = (class141.field3238 - var39 - var45) * class54.field1283 / 3;
                                                                        if (var47 > class54.field1283 * 10) {
                                                                            var47 = class54.field1283 * 10;
                                                                        }
                                                                        if (var47 > var46.field873) {
                                                                            var47 = var46.field873;
                                                                        }
                                                                        var46.field873 -= var47;
                                                                        class94.field2162 += var47;
                                                                        class132.method1010(var46, (byte) -124);
                                                                    }
                                                                    if (var39 + var45 + 32 > class141.field3241 && var46.field821 - var46.field774 > var46.field873) {
                                                                        int var48 = (var39 + var45 + 32 - class141.field3241) * class54.field1283 / 3;
                                                                        if (class54.field1283 * 10 < var48) {
                                                                            var48 = class54.field1283 * 10;
                                                                        }
                                                                        if (var48 > var46.field821 - var46.field873 - var46.field774) {
                                                                            var48 = var46.field821 - var46.field774 - var46.field873;
                                                                        }
                                                                        var46.field873 += var48;
                                                                        class94.field2162 -= var48;
                                                                        class132.method1010(var46, (byte) -101);
                                                                    }
                                                                }
                                                            } else if (class5.field89 == var11 && class34.field730 == var35) {
                                                                var43.method385(var38, var39, 128);
                                                            } else {
                                                                var43.method370(var38, var39);
                                                            }
                                                        }
                                                    } else if (var11.field762 != null && var35 < 20) {
                                                        class49 var49 = var11.method308(0, var35);
                                                        if (var49 != null) {
                                                            var49.method370(var38, var39);
                                                        } else if (field2916) {
                                                            class132.method1010(var11, (byte) -104);
                                                        }
                                                    }
                                                    var35++;
                                                }
                                            }
                                        } else if (var11.field756 == 3) {
                                            int var50;
                                            if (class84.method658(var11, 76)) {
                                                var50 = var11.field870;
                                                if (class50.field1164 == var11 && var11.field784 != 0) {
                                                    var50 = var11.field784;
                                                }
                                            } else {
                                                var50 = var11.field777;
                                                if (class50.field1164 == var11 && var11.field831 != 0) {
                                                    var50 = var11.field831;
                                                }
                                            }
                                            if (var14 == 0) {
                                                if (var11.field804) {
                                                    class141.method1055(var13, var15, var11.field811, var11.field774, var50);
                                                } else {
                                                    class141.method1060(var13, var15, var11.field811, var11.field774, var50);
                                                }
                                            } else if (var11.field804) {
                                                class141.method1059(var13, var15, var11.field811, var11.field774, var50, 256 - (var14 & 0xFF));
                                            } else {
                                                class141.method1070(var13, var15, var11.field811, var11.field774, var50, 256 - (var14 & 0xFF));
                                            }
                                        } else if (var11.field756 == 4) {
                                            class96 var51 = var11.method303(false);
                                            if (var51 != null) {
                                                class32 var52 = var11.field764;
                                                int var53;
                                                if (class84.method658(var11, arg0 ^ 0x7C)) {
                                                    var53 = var11.field870;
                                                    if (class50.field1164 == var11 && var11.field784 != 0) {
                                                        var53 = var11.field784;
                                                    }
                                                    if (var11.field775.method240((byte) 83) > 0) {
                                                        var52 = var11.field775;
                                                    }
                                                } else {
                                                    var53 = var11.field777;
                                                    if (class50.field1164 == var11 && var11.field831 != 0) {
                                                        var53 = var11.field831;
                                                    }
                                                }
                                                if (var11.field849 && var11.field805 != -1) {
                                                    class62 var54 = class146.method1094(var11.field805, 80);
                                                    var52 = var54.field1430;
                                                    if (var52 == null) {
                                                        var52 = class91.field2103;
                                                    }
                                                    if ((var54.field1410 == 1 || var11.field787 != 1) && var11.field787 != -1) {
                                                        var52 = class52.method403(new class32[] { class38.field903, var52, class115.field2721, method980(var11.field787, arg0) }, (byte) -20);
                                                    }
                                                }
                                                if (class50.field1159 == var11) {
                                                    var52 = class131.field3017;
                                                    var53 = var11.field777;
                                                }
                                                if (!var11.field849) {
                                                    var52 = class89.method676(var11, var52, false);
                                                }
                                                var51.method771(var52, var13, var15, var11.field811, var11.field774, var53, var11.field857 ? 0 : -1, var11.field842, var11.field800, var11.field839);
                                            } else if (field2916) {
                                                class132.method1010(var11, (byte) -111);
                                            }
                                        } else if (var11.field756 == 5) {
                                            if (var11.field849) {
                                                class49 var56;
                                                if (var11.field805 == -1) {
                                                    var56 = var11.method300(-81, false);
                                                } else {
                                                    var56 = class133.method1018(var11.field797, var11.field805, 92, false, var11.field818, var11.field787);
                                                }
                                                if (var56 != null) {
                                                    int var57 = var56.field1139;
                                                    int var58 = var56.field1141;
                                                    if (var11.field749) {
                                                        class141.method1067(var13, var15, var13 + var11.field811, var11.field774 + var15);
                                                        int var60 = (var11.field811 + var57 - 1) / var57;
                                                        int var61 = (var58 + var11.field774 - 1) / var58;
                                                        int var62 = 0;
                                                        while (true) {
                                                            if (var60 <= var62) {
                                                                class141.method1068(arg2, arg8, arg1, arg9);
                                                                break;
                                                            }
                                                            for (int var63 = 0; var63 < var61; var63++) {
                                                                if (var11.field778 != 0) {
                                                                    var56.method383(var13 + var57 * var62 + var57 / 2, var58 / 2 + var58 * var63 + var15, var11.field778, 4096);
                                                                } else if (var14 == 0) {
                                                                    var56.method370(var57 * var62 + var13, var15 - -(var58 * var63));
                                                                } else {
                                                                    var56.method385(var57 * var62 + var13, var58 * var63 + var15, 256 - (var14 & 0xFF));
                                                                }
                                                            }
                                                            var62++;
                                                        }
                                                    } else {
                                                        int var59 = var11.field811 * 4096 / var57;
                                                        if (var11.field778 != 0) {
                                                            var56.method383(var11.field811 / 2 + var13, var11.field774 / 2 + var15, var11.field778, var59);
                                                        } else if (var14 != 0) {
                                                            var56.method373(var13, var15, var11.field811, var11.field774, 256 - (var14 & 0xFF));
                                                        } else if (var11.field811 == var57 && var11.field774 == var58) {
                                                            var56.method370(var13, var15);
                                                        } else {
                                                            var56.method371(var13, var15, var11.field811, var11.field774);
                                                        }
                                                    }
                                                } else if (field2916) {
                                                    class132.method1010(var11, (byte) -100);
                                                }
                                            } else {
                                                class49 var55 = var11.method300(-105, class84.method658(var11, arg0 ^ 0x2E));
                                                if (var55 != null) {
                                                    var55.method370(var13, var15);
                                                } else if (field2916) {
                                                    class132.method1010(var11, (byte) -107);
                                                }
                                            }
                                        } else if (var11.field756 == 6) {
                                            boolean var64 = class84.method658(var11, 54);
                                            int var65;
                                            if (var64) {
                                                var65 = var11.field788;
                                            } else {
                                                var65 = var11.field766;
                                            }
                                            class101 var66 = null;
                                            int var67 = 0;
                                            if (var11.field805 != -1) {
                                                class62 var69 = class146.method1094(var11.field805, 27);
                                                if (var69 != null) {
                                                    class62 var70 = var69.method472((byte) 74, var11.field787);
                                                    var66 = var70.method471(1, arg0 ^ 0x1);
                                                    if (var66 == null) {
                                                        class132.method1010(var11, (byte) -121);
                                                    } else {
                                                        var66.method806();
                                                        var67 = var66.field470 / 2;
                                                    }
                                                }
                                            } else if (var11.field771 == 5) {
                                                if (var11.field850 == 0) {
                                                    var66 = class61.field1361.method233(null, -1, null, -5774, -1);
                                                } else {
                                                    var66 = class20.field373.method132((byte) 109);
                                                }
                                            } else if (var65 == -1) {
                                                var66 = var11.method307(null, arg0 - 51, class20.field373.field1632, -1, var64);
                                                if (var66 == null && field2916) {
                                                    class132.method1010(var11, (byte) -106);
                                                }
                                            } else {
                                                class149 var68 = class97.method762((byte) 105, var65);
                                                var66 = var11.method307(var68, -50, class20.field373.field1632, var11.field763, var64);
                                                if (var66 == null && field2916) {
                                                    class132.method1010(var11, (byte) -124);
                                                }
                                            }
                                            class7.method43(var11.field811 / 2 + var13, var11.field774 / 2 + var15);
                                            int var71 = class7.field113[var11.field813] * var11.field809 >> 16;
                                            int var72 = class7.field121[var11.field813] * var11.field809 >> 16;
                                            if (var66 != null) {
                                                if (var11.field849) {
                                                    var66.method806();
                                                    if (var11.field854) {
                                                        var66.method811(0, var11.field875, var11.field751, var11.field813, var11.field817, var67 + var71 + var11.field852, var11.field852 + var72, var11.field809);
                                                    } else {
                                                        var66.method815(0, var11.field875, var11.field751, var11.field813, var11.field817, var67 + var71 + var11.field852, var11.field852 + var72);
                                                    }
                                                } else {
                                                    var66.method815(0, var11.field875, 0, var11.field813, 0, var71, var72);
                                                }
                                            }
                                            class7.method32();
                                        } else {
                                            label747: {
                                                if (var11.field756 == 7) {
                                                    class96 var73 = var11.method303(false);
                                                    if (var73 == null) {
                                                        if (field2916) {
                                                            class132.method1010(var11, (byte) -128);
                                                        }
                                                        break label747;
                                                    }
                                                    int var74 = 0;
                                                    for (int var75 = 0; var75 < var11.field774; var75++) {
                                                        for (int var76 = 0; var76 < var11.field811; var76++) {
                                                            if (var11.field835[var74] > 0) {
                                                                class62 var77 = class146.method1094(var11.field835[var74] - 1, 102);
                                                                class32 var78;
                                                                if (var77.field1410 != 1 && var11.field754[var74] == 1) {
                                                                    var78 = class52.method403(new class32[] { class38.field903, var77.field1430, class65.field1509 }, (byte) -20);
                                                                } else {
                                                                    var78 = class52.method403(new class32[] { class38.field903, var77.field1430, class115.field2721, method980(var11.field754[var74], 1) }, (byte) -20);
                                                                }
                                                                int var79 = var13 + (var11.field819 + 115) * var76;
                                                                int var80 = (var11.field785 + 12) * var75 + var15;
                                                                if (var11.field842 == 0) {
                                                                    var73.method793(var78, var79, var80, var11.field777, var11.field857 ? 0 : -1);
                                                                } else if (var11.field842 == 1) {
                                                                    var73.method795(var78, var79 + var11.field811 / 2, var80, var11.field777, var11.field857 ? 0 : -1);
                                                                } else {
                                                                    var73.method779(var78, var79 + var11.field811 - 1, var80, var11.field777, var11.field857 ? 0 : -1);
                                                                }
                                                            }
                                                            var74++;
                                                        }
                                                    }
                                                }
                                                if (var11.field756 == 8 && class71.field1666 == var11 && class92.field2123 == class38.field925) {
                                                    int var81 = 0;
                                                    class96 var82 = class121.field2878;
                                                    class32 var83 = var11.field764;
                                                    class32 var84 = class89.method676(var11, var83, false);
                                                    int var85 = 0;
                                                    while (var84.method240((byte) 74) > 0) {
                                                        int var93 = var84.method267(1, class154.field3540);
                                                        class32 var94;
                                                        if (var93 == -1) {
                                                            var94 = var84;
                                                            var84 = class77.field1787;
                                                        } else {
                                                            var94 = var84.method241((byte) -127, 0, var93);
                                                            var84 = var84.method268((byte) -36, var93 + 4);
                                                        }
                                                        int var95 = var82.method772(var94);
                                                        var85 += var82.field2294 + 1;
                                                        if (var95 > var81) {
                                                            var81 = var95;
                                                        }
                                                    }
                                                    var81 += 6;
                                                    var85 += 7;
                                                    int var86 = var11.field811 + var13 - var81 - 5;
                                                    if (var13 + 5 > var86) {
                                                        var86 = var13 + 5;
                                                    }
                                                    if (arg1 < var86 + var81) {
                                                        var86 = arg1 - var81;
                                                    }
                                                    int var87 = var15 + var11.field774 + 5;
                                                    if (arg9 < var85 + var87) {
                                                        var87 = arg9 - var85;
                                                    }
                                                    class141.method1055(var86, var87, var81, var85, 16777120);
                                                    class141.method1060(var86, var87, var81, var85, 0);
                                                    int var88 = var87 + var82.field2294 + 2;
                                                    class32 var89 = var11.field764;
                                                    class32 var90 = class89.method676(var11, var89, false);
                                                    while (var90.method240((byte) 125) > 0) {
                                                        int var91 = var90.method267(arg0, class154.field3540);
                                                        class32 var92;
                                                        if (var91 == -1) {
                                                            var92 = var90;
                                                            var90 = class77.field1787;
                                                        } else {
                                                            var92 = var90.method241((byte) -119, 0, var91);
                                                            var90 = var90.method268((byte) -2, var91 + 4);
                                                        }
                                                        var82.method793(var92, var86 + 3, var88, 0, -1);
                                                        var88 += var82.field2294 + 1;
                                                    }
                                                }
                                                if (var11.field756 == 9) {
                                                    if (var11.field789 == 1) {
                                                        class141.method1057(var13, var15, var11.field811 + var13, var15 - -var11.field774, var11.field777);
                                                    } else {
                                                        int var96 = var11.field774 >= 0 ? var11.field774 : -var11.field774;
                                                        int var97 = var11.field811 >= 0 ? var11.field811 : -var11.field811;
                                                        int var98 = var97;
                                                        if (var96 > var97) {
                                                            var98 = var96;
                                                        }
                                                        if (var98 != 0) {
                                                            int var99 = (var11.field811 << 16) / var98;
                                                            int var100 = (var11.field774 << 16) / var98;
                                                            if (var100 > var99) {
                                                                var100 = -var100;
                                                            } else {
                                                                var99 = -var99;
                                                            }
                                                            int var101 = var11.field789 * var100 >> 17;
                                                            int var102 = var11.field789 * var100 + 1 >> 17;
                                                            int var103 = var11.field789 * var99 + 1 >> 17;
                                                            int var104 = var11.field789 * var99 >> 17;
                                                            int var105 = var13 - var102;
                                                            int var106 = var13 + var101;
                                                            int var107 = var13 + var11.field811 - var102;
                                                            int var108 = var11.field811 + var13 + var101;
                                                            int var109 = var15 + var104;
                                                            int var110 = var15 - var103;
                                                            int var111 = var11.field774 + var15 - var103;
                                                            int var112 = var15 + var104 + var11.field774;
                                                            class7.method26(var106, var105, var107);
                                                            class7.method38(var109, var110, var111, var106, var105, var107, var11.field777);
                                                            class7.method26(var106, var107, var108);
                                                            class7.method38(var109, var111, var112, var106, var107, var108, var11.field777);
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
            }
            var10++;
        }
        field2910++;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
    public static final void method982(int arg0) {
        if (arg0 != -7) {
            return;
        }
        field2906++;
        if (class29.field525 != null) {
            class29.field525.method895(0);
        }
        if (class36.field745 != null) {
            class36.field745.method895(0);
        }
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(Z)V")
    public static final void method983(boolean arg0) {
        field2907++;
        for (class98 var1 = (class98) class63.field1467.method1213(91); var1 != null; var1 = (class98) class63.field1467.method1211(-3)) {
            if (var1.field2252 != null) {
                var1.method769(13492);
            }
        }
        if (!arg0) {
            method981(30, -81, 70, null, -128, 99, 108, -36, 22, 26);
        }
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(Z)V")
    public static void method984(boolean arg0) {
        field2905 = null;
        field2902 = null;
        field2903 = null;
        if (!arg0) {
            field2908 = null;
            field2904 = null;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIB)I")
    public static final int method985(int arg0, int arg1, byte arg2) {
        field2912++;
        if (arg2 <= 94) {
            return 70;
        } else if (arg1 == -1) {
            return 12345678;
        } else {
            int var3 = (arg1 & 0x7F) * arg0 / 128;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg1 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "([Lec;I)[Lec;")
    public static final class32[] method986(class32[] arg0, int arg1) {
        field2914++;
        class32[] var2 = new class32[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class52.method403(new class32[] { class159.method1230(var3, 0), class34.field718 }, (byte) -20);
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = class52.method403(new class32[] { var2[var3], arg0[var3] }, (byte) -20);
            }
        }
        if (arg1 != 3) {
            method981(92, -109, -19, null, -95, -16, -118, 32, -105, -55);
        }
        return var2;
    }
}
