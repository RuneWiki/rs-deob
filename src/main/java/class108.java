import java.security.MessageDigest;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class108 extends class252 {

    @OriginalMember(owner = "client!th", name = "X", descriptor = "I")
    private int field1902 = 4;

    @OriginalMember(owner = "client!th", name = "fb", descriptor = "I")
    private int field1910 = 4;

    @OriginalMember(owner = "client!th", name = "T", descriptor = "I")
    public static int field1898 = 0;

    @OriginalMember(owner = "client!th", name = "Z", descriptor = "I")
    public static int field1904 = 0;

    @OriginalMember(owner = "client!th", name = "eb", descriptor = "Ljd;")
    private static class85 field1909 = class221.method1499("Loaded textures", (byte) -53);

    @OriginalMember(owner = "client!th", name = "mb", descriptor = "[I")
    public static int[] field1917 = new int[50];

    @OriginalMember(owner = "client!th", name = "W", descriptor = "Ljd;")
    public static class85 field1901 = field1909;

    @OriginalMember(owner = "client!th", name = "U", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!th", name = "V", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!th", name = "ab", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!th", name = "bb", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!th", name = "cb", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!th", name = "db", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!th", name = "gb", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!th", name = "hb", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!th", name = "ib", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "client!th", name = "jb", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!th", name = "kb", descriptor = "I")
    public static int field1915;

    @OriginalMember(owner = "client!th", name = "lb", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!th", name = "Y", descriptor = "Lrk;")
    public static class256 field1903;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "(I)V")
    public static void method745(int arg0) {
        field1909 = null;
        if (arg0 == 0) {
            field1903 = null;
            field1901 = null;
            field1917 = null;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IB)[[I")
    public final int[][] method89(int arg0, byte arg1) {
        if (arg1 != -123) {
            return null;
        } else {
            ++field1916;
            int[][] var3 = super.field4350.method155(arg0, false);
            if (super.field4350.field338) {
                int var4 = class5.field63 / this.field1910;
                int var5 = class140.field2422 / this.field1902;
                int[][] var7;
                if (var5 > 0) {
                    int var6 = arg0 % var5;
                    var7 = this.method1737(0, 3, class140.field2422 * var6 / var5);
                } else {
                    var7 = this.method1737(0, 3, 0);
                }
                int[] var8 = var7[0];
                int[] var9 = var7[2];
                int[] var10 = var7[1];
                int[] var11 = var3[1];
                int[] var12 = var3[2];
                int[] var13 = var3[0];
                for (int var14 = 0; ~var14 > ~class5.field63; ++var14) {
                    int var16;
                    if (~var4 < -1) {
                        int var15 = var14 % var4;
                        var16 = class5.field63 * var15 / var4;
                    } else {
                        var16 = 0;
                    }
                    var13[var14] = var8[var16];
                    var11[var14] = var10[var16];
                    var12[var14] = var9[var16];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(IBI)V")
    public static final void method746(int arg0, byte arg1, int arg2) {
        class171 var3 = class85.method579(12, 0, arg0);
        ++field1908;
        var3.method1140(-28981);
        var3.field2951 = arg2;
        int var4 = 44 / ((-42 - arg1) / 40);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(JBSIILjd;Ljd;)V")
    public static final void method747(long arg0, byte arg1, short arg2, int arg3, int arg4, class85 arg5, class85 arg6) {
        ++field1913;
        if (!class52.field902) {
            int var8 = -123 / ((arg1 - -44) / 42);
            if (~class115.field2058 > -501) {
                class124.field2198[class115.field2058] = arg6;
                class184.field3161[class115.field2058] = arg5;
                class90.field1659[class115.field2058] = arg2;
                class268.field4767[class115.field2058] = arg0;
                class251.field4313[class115.field2058] = arg4;
                class193.field3292[class115.field2058] = arg3;
                ++class115.field2058;
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V")
    public class108() {
        super(1, false);
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(IB)[I")
    public final int[] method149(int arg0, byte arg1) {
        if (arg1 != -55) {
            return null;
        } else {
            ++field1906;
            int[] var3 = super.field4356.method868(arg0, (byte) 104);
            if (super.field4356.field2258) {
                int var4 = class5.field63 / this.field1910;
                int var5 = class140.field2422 / this.field1902;
                int[] var6;
                if (var5 <= 0) {
                    var6 = this.method1742((byte) 8, 0, 0);
                } else {
                    int var7 = arg0 % var5;
                    var6 = this.method1742((byte) 8, 0, class140.field2422 * var7 / var5);
                }
                for (int var8 = 0; ~class5.field63 < ~var8; ++var8) {
                    if (var4 > 0) {
                        int var9 = var8 % var4;
                        var3[var8] = var6[class5.field63 * var9 / var4];
                    } else {
                        var3[var8] = var6[0];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIII)V")
    public static final void method748(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1912;
        class171 var5 = class85.method579(arg1, arg1 + -10, arg0);
        var5.method1140(-28981);
        var5.field2947 = arg4;
        var5.field2948 = arg3;
        var5.field2951 = arg2;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIIIII)V")
    public static final void method749(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class35.field536 = 0;
        int var7 = -1;
        if (arg4 == 1043150433) {
            while (class44.field775 + class196.field3375 > var7) {
                class58 var23;
                if (~var7 != 0) {
                    if (var7 < class196.field3375) {
                        var23 = class249.field4291[class151.field2556[var7]];
                    } else {
                        var23 = class194.field3320[class137.field2380[-class196.field3375 + var7]];
                    }
                } else {
                    var23 = class22.field308;
                }
                if (var23 != null && var23.method128(10)) {
                    label370: {
                        if (var23 instanceof class17) {
                            class263 var24 = ((class17) var23).field247;
                            if (var24.field4695 != null) {
                                var24 = var24.method1794((byte) 121);
                            }
                            if (var24 == null) {
                                break label370;
                            }
                        }
                        if (var7 >= class196.field3375) {
                            class263 var25 = ((class17) var23).field247;
                            if (var25.field4695 != null) {
                                var25 = var25.method1794((byte) 103);
                            }
                            if (~var25.field4663 <= -1 && ~var25.field4663 > ~class205.field3587.length) {
                                int var26;
                                if (~var25.field4677 != 0) {
                                    var26 = var25.field4677 - -15;
                                } else {
                                    var26 = var23.method385(32767) + 15;
                                }
                                class3.method13(var23, var26, arg5 >> 1, 99, arg2 >> 1, arg6, arg1);
                                if (~class71.field1324 < 0) {
                                    class205.field3587[var25.field4663].method56(arg3 + -12 + class71.field1324, arg0 - 30 + class47.field832);
                                }
                            }
                            class251[] var27 = class7.field87;
                            for (int var28 = 0; var27.length > var28; ++var28) {
                                class251 var29 = var27[var28];
                                if (var29 != null && ~var29.field4321 == -2 && class137.field2380[-class196.field3375 + var7] == var29.field4304 && class151.field2555 % 20 < 10) {
                                    int var30;
                                    if (var25.field4677 != -1) {
                                        var30 = var25.field4677 + 15;
                                    } else {
                                        var30 = var23.method385(32767) - -15;
                                    }
                                    class3.method13(var23, var30, arg5 >> 1, -82, arg2 >> 1, arg6, arg1);
                                    if (class71.field1324 > -1) {
                                        class182.field3112[var29.field4325].method56(arg3 + -12 + class71.field1324, arg0 - (-class47.field832 - -28));
                                    }
                                }
                            }
                        } else {
                            class44 var31 = (class44) var23;
                            int var32 = 30;
                            if (var31.field784 != -1 || ~var31.field787 != 0) {
                                class3.method13(var23, var23.method385(32767) - -15, arg5 >> 1, -97, arg2 >> 1, arg6, arg1);
                                if (~class71.field1324 < 0) {
                                    if (~var31.field784 != 0) {
                                        class94.field1731[var31.field784].method56(arg3 - 12 + class71.field1324, class47.field832 + arg0 + -var32);
                                        var32 += 25;
                                    }
                                    if (~var31.field787 != 0) {
                                        class205.field3587[var31.field787].method56(class71.field1324 + arg3 + -12, -var32 + class47.field832 + arg0);
                                        var32 += 25;
                                    }
                                }
                            }
                            if (var7 >= 0) {
                                class251[] var33 = class7.field87;
                                for (int var34 = 0; var33.length > var34; ++var34) {
                                    class251 var35 = var33[var34];
                                    if (var35 != null && ~var35.field4321 == -11 && class151.field2556[var7] == var35.field4304) {
                                        class3.method13(var23, 15 + var23.method385(32767), arg5 >> 1, -124, arg2 >> 1, arg6, arg1);
                                        if (~class71.field1324 < 0) {
                                            class182.field3112[var35.field4325].method56(class71.field1324 + -12 + arg3, -var32 + arg0 + class47.field832);
                                        }
                                    }
                                }
                            }
                        }
                        if (var23.field1060 != null && (~var7 <= ~class196.field3375 || ~class242.field4158 == -1 || ~class242.field4158 == -4 || class242.field4158 == 1 && class214.method1473(arg4 ^ 1043150411, ((class44) var23).field762))) {
                            class3.method13(var23, var23.method385(arg4 ^ 1043155358), arg5 >> 1, arg4 ^ -1043150399, arg2 >> 1, arg6, arg1);
                            if (class71.field1324 > -1 && ~class35.field536 > ~class45.field801) {
                                class45.field807[class35.field536] = class180.field3092.method75(var23.field1060) / 2;
                                class45.field815[class35.field536] = class180.field3092.field147;
                                class45.field808[class35.field536] = class71.field1324;
                                class45.field812[class35.field536] = class47.field832;
                                class45.field804[class35.field536] = var23.field1034;
                                class45.field802[class35.field536] = var23.field1040;
                                class45.field819[class35.field536] = var23.field1070;
                                class45.field813[class35.field536] = var23.field1060;
                                ++class35.field536;
                            }
                        }
                        if (class151.field2555 < var23.field1004) {
                            class12 var36 = class187.field3203[1];
                            class12 var37 = class187.field3203[0];
                            int var38;
                            if (!(var23 instanceof class17)) {
                                var38 = var23.method385(arg4 ^ 1043155358);
                            } else {
                                class17 var39 = (class17) var23;
                                class12[] var40 = (class12[]) class198.field3392.method1269((long) var39.field247.field4671, (byte) 49);
                                if (var40 == null) {
                                    var40 = class85.method606((byte) 118, 0, var39.field247.field4671, class161.field2773);
                                    if (var40 != null) {
                                        class198.field3392.method1271(-15561, var40, (long) var39.field247.field4671);
                                    }
                                }
                                class263 var41 = var39.field247;
                                if (var40 != null && var40.length == 2) {
                                    var37 = var40[0];
                                    var36 = var40[1];
                                }
                                if (var41.field4677 == -1) {
                                    var38 = var23.method385(32767);
                                } else {
                                    var38 = var41.field4677;
                                }
                            }
                            class3.method13(var23, var37.field183 + var38 - -10, arg5 >> 1, 49, arg2 >> 1, arg6, arg1);
                            if (class71.field1324 > -1) {
                                int var42 = arg3 - -class71.field1324 + -(var37.field184 >> 1);
                                int var43 = arg0 + -3 - -class47.field832;
                                var37.method56(var42, var43);
                                int var44 = var23.field1039 * var37.field184 / 255;
                                int var45 = var37.field183;
                                class179.method1230(var42, var43, var42 - -var44, var43 - -var45);
                                var36.method56(var42, var43);
                                class179.method1216(arg3, arg0, arg3 - -arg5, arg0 + arg2);
                            }
                        }
                        for (int var46 = 0; var46 < 4; ++var46) {
                            if (~var23.field1031[var46] < ~class151.field2555) {
                                int var49;
                                if (var23 instanceof class17) {
                                    class17 var47 = (class17) var23;
                                    class263 var48 = var47.field247;
                                    if (~var48.field4677 == 0) {
                                        var49 = var23.method385(arg4 + -1043117666) / 2;
                                    } else {
                                        var49 = var48.field4677 / 2;
                                    }
                                } else {
                                    var49 = var23.method385(32767) / 2;
                                }
                                class3.method13(var23, var49, arg5 >> 1, -103, arg2 >> 1, arg6, arg1);
                                if (class71.field1324 > -1) {
                                    if (~var46 == -2) {
                                        class47.field832 -= 20;
                                    }
                                    if (var46 == 2) {
                                        class71.field1324 -= 15;
                                        class47.field832 -= 10;
                                    }
                                    if (~var46 == -4) {
                                        class71.field1324 += 15;
                                        class47.field832 -= 10;
                                    }
                                    class268.field4768[var23.field1055[var46]].method56(arg3 - -class71.field1324 + -12, class47.field832 + arg0 - 12);
                                    class130.field2280.method71(class68.method451(var23.field1062[var46], -12572), class71.field1324 + arg3 + -1, class47.field832 + arg0 - -3, 16777215, 0);
                                }
                            }
                        }
                    }
                }
                ++var7;
            }
            ++field1915;
            for (int var8 = 0; class35.field536 > var8; ++var8) {
                int var9 = class45.field808[var8];
                int var10 = class45.field807[var8];
                int var11 = class45.field812[var8];
                int var12 = class45.field815[var8];
                boolean var13 = true;
                while (var13) {
                    var13 = false;
                    for (int var22 = 0; ~var22 > ~var8; ++var22) {
                        if (class45.field812[var22] + -class45.field815[var22] < var11 + 2 && class45.field812[var22] + 2 > -var12 + var11 && ~(-var10 + var9) > ~(class45.field808[var22] + class45.field807[var22]) && ~(var9 + var10) < ~(class45.field808[var22] + -class45.field807[var22]) && ~(class45.field812[var22] - class45.field815[var22]) > ~var11) {
                            var13 = true;
                            var11 = class45.field812[var22] + -class45.field815[var22];
                        }
                    }
                }
                class71.field1324 = class45.field808[var8];
                class47.field832 = class45.field812[var8] = var11;
                class85 var14 = class45.field813[var8];
                if (class55.field967 == 0) {
                    int var15 = 16776960;
                    if (~class45.field804[var8] > -7) {
                        var15 = class72.field1357[class45.field804[var8]];
                    }
                    if (~class45.field804[var8] == -7) {
                        var15 = ~(class50.field873 % 20) <= -11 ? 16776960 : 16711680;
                    }
                    if (class45.field804[var8] == 7) {
                        var15 = ~(class50.field873 % 20) > -11 ? 255 : 65535;
                    }
                    if (~class45.field804[var8] == -9) {
                        var15 = ~(class50.field873 % 20) <= -11 ? 8454016 : 45056;
                    }
                    if (class45.field804[var8] == 9) {
                        int var16 = 150 - class45.field819[var8];
                        if (var16 >= 50) {
                            if (var16 < 100) {
                                var15 = -(var16 * 327680) - -33160960;
                            } else if (~var16 > -151) {
                                var15 = (var16 + -100) * 5 + 65280;
                            }
                        } else {
                            var15 = var16 * 1280 + 16711680;
                        }
                    }
                    if (~class45.field804[var8] == -11) {
                        int var17 = 150 - class45.field819[var8];
                        if (var17 < 50) {
                            var15 = var17 * 5 + 16711680;
                        } else if (var17 < 100) {
                            var15 = -((var17 + -50) * 327680) + 16711935;
                        } else if (var17 < 150) {
                            var15 = var17 * 327680 + -32768000 + 500 - var17 * 5 + 255;
                        }
                    }
                    if (class45.field804[var8] == 11) {
                        int var18 = -class45.field819[var8] + 150;
                        if (var18 >= 50) {
                            if (var18 < 100) {
                                var15 = (var18 - 50) * 327685 + 65280;
                            } else if (~var18 > -151) {
                                var15 = 16777215 - (var18 + -100) * 327680;
                            }
                        } else {
                            var15 = -(var18 * 327685) + 16777215;
                        }
                    }
                    if (class45.field802[var8] == 0) {
                        class180.field3092.method71(var14, class71.field1324 + arg3, class47.field832 + arg0, var15, 0);
                    }
                    if (class45.field802[var8] == 1) {
                        class180.field3092.method82(var14, class71.field1324 + arg3, arg0 - -class47.field832, var15, 0, class50.field873);
                    }
                    if (class45.field802[var8] == 2) {
                        class180.field3092.method79(var14, class71.field1324 + arg3, class47.field832 + arg0, var15, 0, class50.field873);
                    }
                    if (~class45.field802[var8] == -4) {
                        class180.field3092.method69(var14, arg3 - -class71.field1324, class47.field832 + arg0, var15, 0, class50.field873, -class45.field819[var8] + 150);
                    }
                    if (~class45.field802[var8] == -5) {
                        int var19 = (-class45.field819[var8] + 150) * (class180.field3092.method75(var14) - -100) / 150;
                        class179.method1230(arg3 + -50 + class71.field1324, arg0, arg3 - -class71.field1324 + 50, arg0 + arg2);
                        class180.field3092.method67(var14, class71.field1324 + arg3 - (-50 - -var19), class47.field832 + arg0, var15, 0);
                        class179.method1216(arg3, arg0, arg3 - -arg5, arg0 - -arg2);
                    }
                    if (~class45.field802[var8] == -6) {
                        int var20 = -class45.field819[var8] + 150;
                        class179.method1230(arg3, class47.field832 + arg0 + -1 + -class180.field3092.field147, arg3 + arg5, class47.field832 + 5 + arg0);
                        int var21 = 0;
                        if (~var20 > -26) {
                            var21 = var20 + -25;
                        } else if (~var20 < -126) {
                            var21 = var20 + -125;
                        }
                        class180.field3092.method71(var14, class71.field1324 + arg3, class47.field832 + arg0 + var21, var15, 0);
                        class179.method1216(arg3, arg0, arg3 + arg5, arg0 + arg2);
                    }
                } else {
                    class180.field3092.method71(var14, class71.field1324 + arg3, class47.field832 + arg0, 16776960, 0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ILjd;)Z")
    public static final boolean method750(int arg0, class85 arg1) {
        ++field1911;
        try {
            int var2 = arg1.method613(44, -123);
            if (var2 == -1) {
                return false;
            } else {
                class85 var3 = arg1.method636(var2, 0, true);
                class85 var4 = arg1.method611((byte) -97, var2 + 1);
                MessageDigest var5 = MessageDigest.getInstance("SHA");
                var5.reset();
                var5.update(var3.method588(17473));
                byte[] var6 = var5.digest();
                byte[] var7 = var4.method602((byte) 59);
                class247 var8 = new class247(5000);
                var8.method1668(var7, 0, 255, var7.length);
                var8.field4224 = 0;
                var8.method1689(class216.field3781, -2, class180.field3076);
                if (~var8.field4238[0] != -2) {
                    return false;
                } else {
                    if (arg0 != -130) {
                        method745(48);
                    }
                    for (int var9 = 0; ~var9 > -21; ++var9) {
                        if (~var8.field4238[var9 + 1] != ~var6[var9]) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        } catch (Exception var10) {
            return false;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lik;IB)V")
    public final void method88(class247 arg0, int arg1, byte arg2) {
        if (arg1 != 0) {
            if (~arg1 == -2) {
                this.field1902 = arg0.method1711((byte) -67);
            }
        } else {
            this.field1910 = arg0.method1711((byte) -67);
        }
        ++field1907;
        if (arg2 != -99) {
            field1904 = 73;
        }
    }

    @OriginalMember(owner = "client!th", name = "h", descriptor = "(I)V")
    public static final void method751(int arg0) {
        for (int var1 = arg0; ~var1 > ~class44.field775; ++var1) {
            int var2 = class137.field2380[var1];
            class17 var3 = class194.field3320[var2];
            if (var3 != null) {
                class191.method1312(var3.field247.field4700, (byte) 126, var3);
            }
        }
        ++field1905;
    }
}
