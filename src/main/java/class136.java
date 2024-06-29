import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class136 {

    @OriginalMember(owner = "client!te", name = "f", descriptor = "Lqf;")
    private static class117 field3251 = class72.method514(122, "To play on this world move to a free area first");

    @OriginalMember(owner = "client!te", name = "c", descriptor = "Lqf;")
    public static class117 field3248 = class72.method514(98, "Fehler beim Laden Ihres Spielcharakters)3");

    @OriginalMember(owner = "client!te", name = "j", descriptor = "[I")
    public static int[] field3255 = new int[500];

    @OriginalMember(owner = "client!te", name = "l", descriptor = "I")
    public static int field3257 = 0;

    @OriginalMember(owner = "client!te", name = "k", descriptor = "I")
    public static int field3256 = 0;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "Lqf;")
    public static class117 field3249 = field3251;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!te", name = "e", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!te", name = "g", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!te", name = "h", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!te", name = "i", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIIIBII[Lmf;I)V")
    public static final void method1058(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, class89[] arg9, int arg10) {
        for (int var11 = 0; var11 < arg9.length; var11++) {
            class89 var12 = arg9[var11];
            if (var12 != null && (var12.field2142 == 0 || var12.field2062) && var12 != null && var12.field2154 == arg2 && !method1063((byte) 67, var12)) {
                int var13 = var12.field2133 + arg0 - arg10;
                int var14 = var12.field2046 + arg4 - arg1;
                int var15 = var12.field2152 + var13;
                int var16 = var14 + var12.field2095;
                int var17 = var13 <= arg0 ? arg0 : var13;
                int var18 = arg4 >= var14 ? arg4 : var14;
                int var19 = arg5 <= var15 ? arg5 : var15;
                int var20 = var16 < arg3 ? var16 : arg3;
                if (var12.field2142 == 0) {
                    method1058(var17, var12.field2043 + var18 - var14, var12.field2125, var20, var18, var19, (byte) -62, arg7, arg8, arg9, var17 + var12.field2103 - var13);
                    if (var12.field2084 != null) {
                        method1058(var17, var18 + var12.field2043 - var14, var12.field2125, var20, var18, var19, (byte) -62, arg7, arg8, var12.field2084, var12.field2103 + var17 - var13);
                    }
                }
                if (var12.field2062) {
                    boolean var21;
                    if (class143.field3504 >= var17 && class18.field274 >= var18 && var19 > class143.field3504 && class18.field274 < var20) {
                        var21 = true;
                    } else {
                        var21 = false;
                    }
                    boolean var22 = false;
                    if (class152.field3752 == 1 && var21) {
                        var22 = true;
                    }
                    boolean var23 = false;
                    if (class133.field3142 == 1 && class153.field3788 >= var17 && var18 <= class102.field2462 && var19 > class153.field3788 && class102.field2462 < var20) {
                        var23 = true;
                    }
                    if (var23 && class120.field2876 == -1 && (arg8 & 0x200) != 0 && !class81.field1864 && class104.method799(var12, 118) != null) {
                        class67.field1400 = class153.field3788 - var17;
                        class66.field1385 = class102.field2462 - var18;
                        class27.field540 = false;
                        class29.field589 = var12.field2122;
                        class35.field740 = arg7;
                        class120.field2876 = var12.field2125;
                        class101.field2447 = 0;
                    }
                    if (class120.field2876 != -1 || class81.field1864) {
                        var21 = false;
                        var23 = false;
                        var22 = false;
                    }
                    if (!var12.field2039 && var23 && (arg8 & 0x1) != 0) {
                        var12.field2039 = true;
                        if (var12.field2143 != null) {
                            class18.method145(var12.field2143, var12, class102.field2462 - var14, -var13 + class153.field3788, null, 18859, 0);
                        }
                    }
                    if (var12.field2039 && var22 && (arg8 & 0x4) != 0 && var12.field2090 != null) {
                        class18.method145(var12.field2090, var12, class18.field274 - var14, class143.field3504 - var13, null, arg6 ^ 0xFFFFB669, 0);
                    }
                    if (var12.field2039 && !var22 && (arg8 & 0x2) != 0) {
                        var12.field2039 = false;
                        if (var12.field2029 != null) {
                            class18.method145(var12.field2029, var12, class18.field274 - var14, -var13 + class143.field3504, null, 18859, 0);
                        }
                    }
                    if (var22 && (arg8 & 0x8) != 0 && var12.field2096 != null) {
                        class18.method145(var12.field2096, var12, class18.field274 - var14, -var13 + class143.field3504, null, arg6 + 18921, 0);
                    }
                    if (!var12.field2076 && var21 && (arg8 & 0x10) != 0) {
                        var12.field2076 = true;
                        if (var12.field2053 != null) {
                            class18.method145(var12.field2053, var12, class18.field274 - var14, -var13 + class143.field3504, null, 18859, 0);
                        }
                    }
                    if (var12.field2076 && var21 && (arg8 & 0x40) != 0 && var12.field2051 != null) {
                        class18.method145(var12.field2051, var12, class18.field274 - var14, -var13 + class143.field3504, null, 18859, 0);
                    }
                    if (var12.field2076 && !var21 && (arg8 & 0x20) != 0) {
                        var12.field2076 = false;
                        if (var12.field2055 != null) {
                            class18.method145(var12.field2055, var12, class18.field274 - var14, -var13 + class143.field3504, null, arg6 ^ 0xFFFFB669, 0);
                        }
                    }
                    if (var12.field2141 != null && (arg8 & 0x80) != 0) {
                        class18.method145(var12.field2141, var12, 0, 0, null, 18859, 0);
                    }
                    if (var21 && class126.field2989 != 0 && var12.field2117 != null && (arg8 & 0x400) != 0) {
                        class18.method145(var12.field2117, var12, class126.field2989, 0, null, 18859, 0);
                    }
                    if ((arg8 & 0x100) != 0) {
                        if (var12.field2072 != null && var12.field2077 < class97.field2362) {
                            if (var12.field2099 == null || class97.field2362 - var12.field2077 > 32) {
                                class18.method145(var12.field2072, var12, 0, 0, null, arg6 ^ 0xFFFFB669, 0);
                            } else {
                                label272: for (int var24 = var12.field2077; var24 < class97.field2362; var24++) {
                                    int var25 = class40.field797[var24 & 0x1F];
                                    for (int var26 = 0; var26 < var12.field2099.length; var26++) {
                                        if (var12.field2099[var26] == var25) {
                                            class18.method145(var12.field2072, var12, 0, 0, null, arg6 ^ 0xFFFFB669, 0);
                                            break label272;
                                        }
                                    }
                                }
                            }
                            var12.field2077 = class97.field2362;
                        }
                        if (var12.field2159 != null && class92.field2241 > var12.field2112) {
                            if (var12.field2032 == null || class92.field2241 - var12.field2112 > 32) {
                                class18.method145(var12.field2159, var12, 0, 0, null, 18859, 0);
                            } else {
                                label252: for (int var27 = var12.field2112; var27 < class92.field2241; var27++) {
                                    int var28 = class15.field217[var27 & 0x1F];
                                    for (int var29 = 0; var29 < var12.field2032.length; var29++) {
                                        if (var12.field2032[var29] == var28) {
                                            class18.method145(var12.field2159, var12, 0, 0, null, arg6 + 18921, 0);
                                            break label252;
                                        }
                                    }
                                }
                            }
                            var12.field2112 = class92.field2241;
                        }
                        if (var12.field2128 != null && var12.field2050 < class134.field3181) {
                            if (var12.field2139 == null || class134.field3181 - var12.field2050 > 32) {
                                class18.method145(var12.field2128, var12, 0, 0, null, arg6 + 18921, 0);
                            } else {
                                label232: for (int var30 = var12.field2050; var30 < class134.field3181; var30++) {
                                    int var31 = class103.field2502[var30 & 0x1F];
                                    for (int var32 = 0; var32 < var12.field2139.length; var32++) {
                                        if (var12.field2139[var32] == var31) {
                                            class18.method145(var12.field2128, var12, 0, 0, null, arg6 + 18921, 0);
                                            break label232;
                                        }
                                    }
                                }
                            }
                            var12.field2050 = class134.field3181;
                        }
                        if (var12.field2092 != null && class95.field2294 > var12.field2031) {
                            class18.method145(var12.field2092, var12, 0, 0, null, 18859, 0);
                        }
                        var12.field2031 = class43.field856;
                    }
                }
            }
        }
        if (arg6 != -62) {
            method1062(76, -49);
        }
        field3254++;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
    public static final void method1059(int arg0) {
        field3250++;
        try {
            if (class36.field767 == 0) {
                if (class125.field2957 != null) {
                    class125.field2957.method738(1);
                    class125.field2957 = null;
                }
                class140.field3339 = 0;
                class76.field1682 = false;
                class36.field767 = 1;
                class66.field1393 = null;
            }
            if (class36.field767 == 1) {
                if (class66.field1393 == null) {
                    class66.field1393 = class44.field873.method1070(class122.field2906, class85.field1938, (byte) -69);
                }
                if (class66.field1393.field108 == 2) {
                    throw new IOException();
                }
                if (class66.field1393.field108 == 1) {
                    class125.field2957 = new class93((Socket) class66.field1393.field106, class44.field873);
                    class36.field767 = 2;
                    class66.field1393 = null;
                }
            }
            if (class36.field767 == 2) {
                long var1 = class82.field1878 = class126.field2991.method942((byte) 11);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class99.field2373.field1691 = 0;
                class99.field2373.method571(14, -11124);
                class99.field2373.method571(var3, -11124);
                class125.field2957.method736((byte) 42, class99.field2373.field1748, 2, 0);
                class96.field2338.field1691 = 0;
                class36.field767 = 3;
            }
            if (class36.field767 == 3) {
                if (class119.field2853 != null) {
                    class119.field2853.method1195(256);
                }
                if (class90.field2170 != null) {
                    class90.field2170.method1195(256);
                }
                int var4 = class125.field2957.method732(27426);
                if (class119.field2853 != null) {
                    class119.field2853.method1195(256);
                }
                if (class90.field2170 != null) {
                    class90.field2170.method1195(256);
                }
                if (var4 != 0) {
                    class147.method1177(var4, (byte) 93);
                    return;
                }
                class36.field767 = 4;
                class96.field2338.field1691 = 0;
            }
            if (class36.field767 == 4) {
                if (class96.field2338.field1691 < 8) {
                    int var5 = class125.field2957.method731(0);
                    if (8 - class96.field2338.field1691 < var5) {
                        var5 = 8 - class96.field2338.field1691;
                    }
                    if (var5 > 0) {
                        class125.field2957.method729(var5, class96.field2338.field1691, (byte) 126, class96.field2338.field1748);
                        class96.field2338.field1691 += var5;
                    }
                }
                if (class96.field2338.field1691 == 8) {
                    class96.field2338.field1691 = 0;
                    class126.field2985 = class96.field2338.method586(-13628);
                    class36.field767 = 5;
                }
            }
            if (arg0 != 3794) {
                field3247 = 102;
            }
            if (class36.field767 == 5) {
                class99.field2373.field1691 = 0;
                int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class126.field2985 >> 32), (int) class126.field2985 };
                class99.field2373.method571(10, -11124);
                class99.field2373.method600(var6[0], -30515);
                class99.field2373.method600(var6[1], arg0 - 34309);
                class99.field2373.method600(var6[2], -30515);
                class99.field2373.method600(var6[3], arg0 ^ 0xFFFF861F);
                class99.field2373.method600(class44.field873.field3270, -30515);
                class99.field2373.method606(class126.field2991.method942((byte) 11), (byte) 118);
                class99.field2373.method563((byte) -73, class126.field2982);
                class99.field2373.method591(arg0 ^ 0xED2, class125.field2966, class32.field679);
                class121.field2881.field1691 = 0;
                if (class48.field1022 == 40) {
                    class121.field2881.method571(18, -11124);
                } else {
                    class121.field2881.method571(16, -11124);
                }
                class121.field2881.method571(class99.field2373.field1691 + 69, arg0 + -14918);
                class121.field2881.method600(459, -30515);
                class121.field2881.method571(class20.field334 ? 1 : 0, -11124);
                class121.field2881.method600(class82.field1887.field1322, -30515);
                class121.field2881.method600(class100.field2416.field1322, -30515);
                class121.field2881.method600(class120.field2866.field1322, -30515);
                class121.field2881.method600(class64.field1335.field1322, arg0 ^ 0xFFFF861F);
                class121.field2881.method600(class31.field666.field1322, arg0 ^ 0xFFFF861F);
                class121.field2881.method600(class133.field3147.field1322, -30515);
                class121.field2881.method600(class50.field1040.field1322, -30515);
                class121.field2881.method600(class68.field1416.field1322, -30515);
                class121.field2881.method600(class134.field3184.field1322, -30515);
                class121.field2881.method600(class29.field575.field1322, arg0 - 34309);
                class121.field2881.method600(class78.field1774.field1322, arg0 - 34309);
                class121.field2881.method600(client.field392.field1322, -30515);
                class121.field2881.method600(class138.field3285.field1322, -30515);
                class121.field2881.method600(class120.field2871.field1322, -30515);
                class121.field2881.method600(class80.field1827.field1322, -30515);
                class121.field2881.method600(class117.field2817.field1322, -30515);
                class121.field2881.method599(class99.field2373.field1748, false, 0, class99.field2373.field1691);
                class125.field2957.method736((byte) 42, class121.field2881.field1748, class121.field2881.field1691, 0);
                class99.field2373.method959(var6, arg0 - 23980);
                for (int var7 = 0; var7 < 4; var7++) {
                    var6[var7] += 50;
                }
                class96.field2338.method959(var6, arg0 ^ 0xFFFFBFF4);
                class36.field767 = 6;
            }
            if (class36.field767 == 6 && class125.field2957.method731(arg0 - 3794) > 0) {
                int var8 = class125.field2957.method732(arg0 + 23632);
                if (var8 == 21 && class48.field1022 == 20) {
                    class36.field767 = 7;
                } else if (var8 == 2) {
                    class36.field767 = 9;
                } else if (var8 == 15 && class48.field1022 == 40) {
                    class73.method533(arg0 - 3876);
                    return;
                } else if (var8 == 23 && class43.field855 < 1) {
                    class36.field767 = 0;
                    class43.field855++;
                } else {
                    class147.method1177(var8, (byte) 107);
                    return;
                }
            }
            if (class36.field767 == 7 && class125.field2957.method731(0) > 0) {
                class99.field2409 = class125.field2957.method732(27426) * 60 + 180;
                class36.field767 = 8;
            }
            if (class36.field767 == 8) {
                class140.field3339 = 0;
                class35.method272(class42.field831, false, class73.method530((byte) -83, new class117[] { class79.method614(15591, class99.field2409 / 60), class117.field2824 }), class25.field477);
                if (--class99.field2409 <= 0) {
                    class36.field767 = 0;
                }
            } else {
                if (class36.field767 == 9 && class125.field2957.method731(arg0 - 3794) >= 8) {
                    class116.field2752 = class125.field2957.method732(arg0 + 23632);
                    class75.field1623 = class125.field2957.method732(27426) == 1;
                    class43.field857 = class125.field2957.method732(27426);
                    class43.field857 <<= 0x8;
                    class43.field857 += class125.field2957.method732(27426);
                    class16.field237 = class125.field2957.method732(arg0 + 23632);
                    class125.field2957.method729(1, 0, (byte) 123, class96.field2338.field1748);
                    class96.field2338.field1691 = 0;
                    class26.field518 = class96.field2338.method962(8);
                    class125.field2957.method729(2, 0, (byte) 127, class96.field2338.field1748);
                    class96.field2338.field1691 = 0;
                    class71.field1502 = class96.field2338.method597(arg0 - 3699);
                    class36.field767 = 10;
                }
                if (class36.field767 != 10) {
                    class140.field3339++;
                    if (class140.field3339 > 2000) {
                        if (class43.field855 < 1) {
                            if (class85.field1938 == class125.field2943) {
                                class85.field1938 = class16.field248;
                            } else {
                                class85.field1938 = class125.field2943;
                            }
                            class36.field767 = 0;
                            class43.field855++;
                        } else {
                            class147.method1177(-3, (byte) 96);
                        }
                    }
                } else if (class125.field2957.method731(0) >= class71.field1502) {
                    class96.field2338.field1691 = 0;
                    class125.field2957.method729(class71.field1502, 0, (byte) 125, class96.field2338.field1748);
                    class73.method528(126);
                    class3.field35 = -1;
                    class125.method990(false, (byte) 16);
                    class26.field518 = -1;
                }
            }
        } catch (IOException var9) {
            if (class43.field855 < 1) {
                class43.field855++;
                if (class85.field1938 == class125.field2943) {
                    class85.field1938 = class16.field248;
                } else {
                    class85.field1938 = class125.field2943;
                }
                class36.field767 = 0;
            } else {
                class147.method1177(-2, (byte) 102);
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIIII)I")
    public static final int method1060(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg4 & 0x3;
        if ((arg6 & 0x1) == 1) {
            int var8 = arg0;
            arg0 = arg2;
            arg2 = var8;
        }
        field3246++;
        if (var7 == 0) {
            return arg1;
        } else if (var7 == 1) {
            return arg3;
        } else if (var7 == 2) {
            return 1 + 7 - arg0 - arg1;
        } else if (arg5 > -29) {
            return -117;
        } else {
            return 1 + 7 - arg2 - arg3;
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(I)V")
    public static void method1061(int arg0) {
        field3255 = null;
        field3248 = null;
        field3249 = null;
        field3251 = null;
        int var1 = -45 % ((-arg0 - 42) / 61);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(II)Z")
    public static final boolean method1062(int arg0, int arg1) {
        field3252++;
        if (arg1 == 19138) {
            return (arg0 >> 29 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BLmf;)Z")
    public static final boolean method1063(byte arg0, class89 arg1) {
        int var2 = 106 % ((24 - arg0) / 41);
        field3253++;
        if (class139.field3314) {
            if (class42.method292(arg1, -5447) != 0) {
                return false;
            }
            if (arg1.field2142 == 0) {
                return false;
            }
        }
        return arg1.field2120;
    }
}
