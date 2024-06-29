import java.io.UnsupportedEncodingException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class187 extends class249 {

    @OriginalMember(owner = "client!dk", name = "G", descriptor = "[Lsa;")
    public class70[] field3274 = new class70[5];

    @OriginalMember(owner = "client!dk", name = "A", descriptor = "[I")
    public int[] field3268 = new int[5];

    @OriginalMember(owner = "client!dk", name = "I", descriptor = "I")
    public int field3276 = 0;

    @OriginalMember(owner = "client!dk", name = "Q", descriptor = "I")
    public int field3284;

    @OriginalMember(owner = "client!dk", name = "E", descriptor = "I")
    public int field3272;

    @OriginalMember(owner = "client!dk", name = "M", descriptor = "I")
    public int field3280;

    @OriginalMember(owner = "client!dk", name = "J", descriptor = "I")
    public int field3277;

    @OriginalMember(owner = "client!dk", name = "p", descriptor = "S")
    private static short field3257 = 320;

    @OriginalMember(owner = "client!dk", name = "q", descriptor = "I")
    public static int field3258 = 0;

    @OriginalMember(owner = "client!dk", name = "t", descriptor = "Lmb;")
    public static class96 field3261 = class243.method1708("T", (byte) 102);

    @OriginalMember(owner = "client!dk", name = "o", descriptor = "I")
    public static int field3256 = 0;

    @OriginalMember(owner = "client!dk", name = "r", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!dk", name = "s", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!dk", name = "v", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!dk", name = "w", descriptor = "I")
    public int field3264;

    @OriginalMember(owner = "client!dk", name = "x", descriptor = "I")
    public int field3265;

    @OriginalMember(owner = "client!dk", name = "D", descriptor = "I")
    public static int field3271;

    @OriginalMember(owner = "client!dk", name = "H", descriptor = "I")
    public int field3275;

    @OriginalMember(owner = "client!dk", name = "K", descriptor = "I")
    public int field3278;

    @OriginalMember(owner = "client!dk", name = "O", descriptor = "I")
    public int field3282;

    @OriginalMember(owner = "client!dk", name = "B", descriptor = "Lsb;")
    public class105 field3269;

    @OriginalMember(owner = "client!dk", name = "u", descriptor = "Ljc;")
    public static class160 field3262;

    @OriginalMember(owner = "client!dk", name = "S", descriptor = "Ldk;")
    public class187 field3286;

    @OriginalMember(owner = "client!dk", name = "N", descriptor = "Lna;")
    public class19 field3281;

    @OriginalMember(owner = "client!dk", name = "P", descriptor = "Lua;")
    public class250 field3283;

    @OriginalMember(owner = "client!dk", name = "R", descriptor = "Lhh;")
    public class41 field3285;

    @OriginalMember(owner = "client!dk", name = "L", descriptor = "Lkh;")
    public class5 field3279;

    @OriginalMember(owner = "client!dk", name = "y", descriptor = "Ltj;")
    public class66 field3266;

    @OriginalMember(owner = "client!dk", name = "z", descriptor = "Z")
    public boolean field3267;

    @OriginalMember(owner = "client!dk", name = "C", descriptor = "Z")
    public boolean field3270;

    @OriginalMember(owner = "client!dk", name = "F", descriptor = "Z")
    public boolean field3273;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(BILdh;)V")
    public static final void method1322(byte arg0, int arg1, class116 arg2) {
        int var3 = 27 / ((-arg0 - 60) / 47);
        field3259++;
        Object[] var4 = arg2.field2155;
        int var5 = (Integer) var4[0];
        class226 var6 = class71.method484(var5, false);
        if (var6 == null) {
            return;
        }
        class260.field4519 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = -1;
        byte var10 = -1;
        int[] var11 = var6.field3854;
        int[] var12 = var6.field3835;
        try {
            int var13 = 0;
            class161.field2840 = new int[var6.field3843];
            class144.field2555 = new class96[var6.field3842];
            int var14 = 0;
            for (int var15 = 1; var15 < var4.length; var15++) {
                if ((var4[var15] instanceof Integer)) {
                    int var17 = (Integer) var4[var15];
                    if (var17 == -2147483647) {
                        var17 = arg2.field2152;
                    }
                    if (var17 == -2147483646) {
                        var17 = arg2.field2167;
                    }
                    if (var17 == -2147483645) {
                        var17 = arg2.field2158 == null ? -1 : arg2.field2158.field1896;
                    }
                    if (var17 == -2147483644) {
                        var17 = arg2.field2164;
                    }
                    if (var17 == -2147483643) {
                        var17 = arg2.field2158 == null ? -1 : arg2.field2158.field1974;
                    }
                    if (var17 == -2147483642) {
                        var17 = arg2.field2159 == null ? -1 : arg2.field2159.field1896;
                    }
                    if (var17 == -2147483641) {
                        var17 = arg2.field2159 == null ? -1 : arg2.field2159.field1974;
                    }
                    if (var17 == -2147483640) {
                        var17 = arg2.field2161;
                    }
                    if (var17 == -2147483639) {
                        var17 = arg2.field2156;
                    }
                    class161.field2840[var13++] = var17;
                } else if (var4[var15] instanceof class96) {
                    class96 var16 = (class96) var4[var15];
                    if (var16.method705(0, class143.field2532)) {
                        var16 = arg2.field2154;
                    }
                    class144.field2555[var14++] = var16;
                }
            }
            int var18 = 0;
            label3611: while (true) {
                var18++;
                if (var18 > arg1) {
                    throw new RuntimeException("slow");
                }
                var9++;
                int var475 = var11[var9];
                if (var475 < 100) {
                    if (var475 == 0) {
                        class62.field1052[var7++] = var12[var9];
                        continue;
                    }
                    if (var475 == 1) {
                        int var19 = var12[var9];
                        class62.field1052[var7++] = class54.field937[var19];
                        continue;
                    }
                    if (var475 == 2) {
                        int var20 = var12[var9];
                        var7--;
                        class130.method984(class62.field1052[var7], var20, (byte) -71);
                        continue;
                    }
                    if (var475 == 3) {
                        class211.field3634[var8++] = var6.field3838[var9];
                        continue;
                    }
                    if (var475 == 6) {
                        var9 += var12[var9];
                        continue;
                    }
                    if (var475 == 7) {
                        var7 -= 2;
                        if (class62.field1052[var7 + 1] != class62.field1052[var7]) {
                            var9 += var12[var9];
                        }
                        continue;
                    }
                    if (var475 == 8) {
                        var7 -= 2;
                        if (class62.field1052[var7 + 1] == class62.field1052[var7]) {
                            var9 += var12[var9];
                        }
                        continue;
                    }
                    if (var475 == 9) {
                        var7 -= 2;
                        if (class62.field1052[var7] < class62.field1052[var7 + 1]) {
                            var9 += var12[var9];
                        }
                        continue;
                    }
                    if (var475 == 10) {
                        var7 -= 2;
                        if (class62.field1052[var7 + 1] < class62.field1052[var7]) {
                            var9 += var12[var9];
                        }
                        continue;
                    }
                    if (var475 == 21) {
                        if (class260.field4519 == 0) {
                            return;
                        }
                        class215 var21 = class10.field168[--class260.field4519];
                        var6 = var21.field3701;
                        var12 = var6.field3835;
                        var11 = var6.field3854;
                        class161.field2840 = var21.field3698;
                        class144.field2555 = var21.field3700;
                        var9 = var21.field3703;
                        continue;
                    }
                    if (var475 == 25) {
                        int var22 = var12[var9];
                        class62.field1052[var7++] = class267.method1831(var22, true);
                        continue;
                    }
                    if (var475 == 27) {
                        int var23 = var12[var9];
                        var7--;
                        class27.method182(class62.field1052[var7], -4683, var23);
                        continue;
                    }
                    if (var475 == 31) {
                        var7 -= 2;
                        if (class62.field1052[var7 + 1] >= class62.field1052[var7]) {
                            var9 += var12[var9];
                        }
                        continue;
                    }
                    if (var475 == 32) {
                        var7 -= 2;
                        if (class62.field1052[var7] >= class62.field1052[var7 + 1]) {
                            var9 += var12[var9];
                        }
                        continue;
                    }
                    if (var475 == 33) {
                        class62.field1052[var7++] = class161.field2840[var12[var9]];
                        continue;
                    }
                    int var10001;
                    if (var475 == 34) {
                        var10001 = var12[var9];
                        var7--;
                        class161.field2840[var10001] = class62.field1052[var7];
                        continue;
                    }
                    if (var475 == 35) {
                        class211.field3634[var8++] = class144.field2555[var12[var9]];
                        continue;
                    }
                    if (var475 == 36) {
                        var10001 = var12[var9];
                        var8--;
                        class144.field2555[var10001] = class211.field3634[var8];
                        continue;
                    }
                    if (var475 == 37) {
                        int var24 = var12[var9];
                        var8 -= var24;
                        class96 var25 = class124.method958(var24, class211.field3634, var8, -25433);
                        class211.field3634[var8++] = var25;
                        continue;
                    }
                    if (var475 == 38) {
                        var7--;
                        continue;
                    }
                    if (var475 == 39) {
                        var8--;
                        continue;
                    }
                    if (var475 == 40) {
                        int var26 = var12[var9];
                        class226 var27 = class71.method484(var26, false);
                        int[] var28 = new int[var27.field3843];
                        class96[] var29 = new class96[var27.field3842];
                        for (int var30 = 0; var30 < var27.field3848; var30++) {
                            var28[var30] = class62.field1052[var7 - (var27.field3848 - var30)];
                        }
                        for (int var31 = 0; var31 < var27.field3844; var31++) {
                            var29[var31] = class211.field3634[var8 + var31 - var27.field3844];
                        }
                        var8 -= var27.field3844;
                        var7 -= var27.field3848;
                        class215 var32 = new class215();
                        var32.field3701 = var6;
                        var32.field3700 = class144.field2555;
                        var32.field3703 = var9;
                        var32.field3698 = class161.field2840;
                        if (class260.field4519 >= class10.field168.length) {
                            throw new RuntimeException();
                        }
                        var9 = -1;
                        class10.field168[class260.field4519++] = var32;
                        class144.field2555 = var29;
                        class161.field2840 = var28;
                        var6 = var27;
                        var11 = var27.field3854;
                        var12 = var27.field3835;
                        continue;
                    }
                    if (var475 == 42) {
                        class62.field1052[var7++] = class21.field348[var12[var9]];
                        continue;
                    }
                    if (var475 == 43) {
                        int var33 = var12[var9];
                        var7--;
                        class21.field348[var33] = class62.field1052[var7];
                        class94.method661(-121, var33);
                        continue;
                    }
                    if (var475 == 44) {
                        int var34 = var12[var9] >> 16;
                        var7--;
                        int var35 = class62.field1052[var7];
                        int var36 = var12[var9] & 0xFFFF;
                        if (var35 >= 0 && var35 <= 5000) {
                            class33.field575[var34] = var35;
                            byte var37 = -1;
                            if (var36 == 105) {
                                var37 = 0;
                            }
                            int var38 = 0;
                            while (true) {
                                if (var35 <= var38) {
                                    continue label3611;
                                }
                                class87.field1455[var34][var38] = var37;
                                var38++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var475 == 45) {
                        int var39 = var12[var9];
                        var7--;
                        int var40 = class62.field1052[var7];
                        if (var40 >= 0 && var40 < class33.field575[var39]) {
                            class62.field1052[var7++] = class87.field1455[var39][var40];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var475 == 46) {
                        int var41 = var12[var9];
                        var7 -= 2;
                        int var42 = class62.field1052[var7];
                        if (var42 >= 0 && class33.field575[var41] > var42) {
                            class87.field1455[var41][var42] = class62.field1052[var7 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var475 == 47) {
                        class96 var43 = class41.field699[var12[var9]];
                        if (var43 == null) {
                            var43 = class179.field3088;
                        }
                        class211.field3634[var8++] = var43;
                        continue;
                    }
                    if (var475 == 48) {
                        int var44 = var12[var9];
                        var8--;
                        class41.field699[var44] = class211.field3634[var8];
                        class92.method646(var44, (byte) 127);
                        continue;
                    }
                    if (var475 == 51) {
                        class146 var45 = var6.field3858[var12[var9]];
                        var7--;
                        class46 var46 = (class46) var45.method1081(0, (long) class62.field1052[var7]);
                        if (var46 != null) {
                            var9 += var46.field795;
                        }
                        continue;
                    }
                }
                boolean var47;
                if (var12[var9] == 1) {
                    var47 = true;
                } else {
                    var47 = false;
                }
                if (var475 < 300) {
                    if (var475 == 100) {
                        var7 -= 3;
                        int var454 = class62.field1052[var7 + 2];
                        int var455 = class62.field1052[var7 + 1];
                        int var456 = class62.field1052[var7];
                        if (var455 == 0) {
                            throw new RuntimeException();
                        }
                        class107 var457 = class55.method408(var456, 251234864);
                        if (var457.field1842 == null) {
                            var457.field1842 = new class107[var454 + 1];
                        }
                        if (var457.field1842.length <= var454) {
                            class107[] var458 = new class107[var454 + 1];
                            for (int var459 = 0; var459 < var457.field1842.length; var459++) {
                                var458[var459] = var457.field1842[var459];
                            }
                            var457.field1842 = var458;
                        }
                        if (var454 > 0 && var457.field1842[var454 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var454 - 1));
                        }
                        class107 var460 = new class107();
                        var460.field1827 = var460.field1896 = var457.field1896;
                        var460.field1833 = var455;
                        var460.field1974 = var454;
                        var460.field1867 = true;
                        var457.field1842[var454] = var460;
                        if (var47) {
                            class55.field953 = var460;
                        } else {
                            class154.field2707 = var460;
                        }
                        class53.method403(-124, var457);
                        continue;
                    }
                    if (var475 == 101) {
                        class107 var461 = var47 ? class55.field953 : class154.field2707;
                        if (var461.field1974 == -1) {
                            if (!var47) {
                                throw new RuntimeException("Tried to cc_delete static active-component!");
                            }
                            throw new RuntimeException("Tried to .cc_delete static .active-component!");
                        }
                        class107 var462 = class55.method408(var461.field1896, 251234864);
                        var462.field1842[var461.field1974] = null;
                        class53.method403(-64, var462);
                        continue;
                    }
                    if (var475 == 102) {
                        var7--;
                        class107 var463 = class55.method408(class62.field1052[var7], 251234864);
                        var463.field1842 = null;
                        class53.method403(-69, var463);
                        continue;
                    }
                    if (var475 == 200) {
                        var7 -= 2;
                        int var464 = class62.field1052[var7];
                        int var465 = class62.field1052[var7 + 1];
                        class107 var466 = class1.method7(var464, var465, -89);
                        if (var466 != null && var465 != -1) {
                            class62.field1052[var7++] = 1;
                            if (var47) {
                                class55.field953 = var466;
                            } else {
                                class154.field2707 = var466;
                            }
                            continue;
                        }
                        class62.field1052[var7++] = 0;
                        continue;
                    }
                    if (var475 == 201) {
                        var7--;
                        int var467 = class62.field1052[var7];
                        class107 var468 = class55.method408(var467, 251234864);
                        if (var468 == null) {
                            class62.field1052[var7++] = 0;
                        } else {
                            class62.field1052[var7++] = 1;
                            if (var47) {
                                class55.field953 = var468;
                            } else {
                                class154.field2707 = var468;
                            }
                        }
                        continue;
                    }
                } else if (var475 < 500) {
                    if (var475 == 403) {
                        var7 -= 2;
                        int var449 = class62.field1052[var7];
                        int var450 = class62.field1052[var7 + 1];
                        if (var449 >= 7) {
                            var449 -= 7;
                        }
                        class236.field4047.field812.method1309(var449, true, var450);
                        continue;
                    }
                    if (var475 == 404) {
                        var7 -= 2;
                        int var451 = class62.field1052[var7];
                        int var452 = class62.field1052[var7 + 1];
                        class236.field4047.field812.method1312(var451, 8590, var452);
                        continue;
                    }
                    if (var475 == 410) {
                        var7--;
                        boolean var453 = class62.field1052[var7] != 0;
                        class236.field4047.field812.method1310(var453, (byte) 51);
                        continue;
                    }
                } else if (!(var475 < 1000 || var475 >= 1100) || !(var475 < 2000 || var475 >= 2100)) {
                    class107 var48;
                    if (var475 >= 2000) {
                        var475 -= 1000;
                        var7--;
                        var48 = class55.method408(class62.field1052[var7], 251234864);
                    } else {
                        var48 = var47 ? class55.field953 : class154.field2707;
                    }
                    if (var475 == 1000) {
                        var7 -= 4;
                        var48.field1852 = class62.field1052[var7];
                        var48.field1903 = class62.field1052[var7 + 1];
                        int var49 = class62.field1052[var7 + 3];
                        int var50 = class62.field1052[var7 + 2];
                        if (var50 < 0) {
                            var50 = 0;
                        } else if (var50 > 5) {
                            var50 = 5;
                        }
                        var48.field1962 = (byte) var50;
                        if (var49 < 0) {
                            var49 = 0;
                        } else if (var49 > 5) {
                            var49 = 5;
                        }
                        var48.field1810 = (byte) var49;
                        class53.method403(-78, var48);
                        class2.method9(var48, (byte) 103);
                        if (var48.field1974 == -1) {
                            class24.method167((byte) 59, var48.field1896);
                        }
                        continue;
                    }
                    if (var475 == 1001) {
                        var7 -= 4;
                        var48.field1899 = class62.field1052[var7];
                        var48.field1866 = class62.field1052[var7 + 1];
                        var48.field1915 = 0;
                        var48.field1830 = 0;
                        int var51 = class62.field1052[var7 + 2];
                        int var52 = class62.field1052[var7 + 3];
                        if (var51 < 0) {
                            var51 = 0;
                        } else if (var51 > 4) {
                            var51 = 4;
                        }
                        if (var52 < 0) {
                            var52 = 0;
                        } else if (var52 > 4) {
                            var52 = 4;
                        }
                        var48.field1897 = (byte) var51;
                        var48.field1951 = (byte) var52;
                        class53.method403(-126, var48);
                        class2.method9(var48, (byte) 124);
                        if (var48.field1833 == 0) {
                            class148.method1092(var48, false, false);
                        }
                        continue;
                    }
                    if (var475 == 1003) {
                        var7--;
                        boolean var53 = class62.field1052[var7] == 1;
                        if (var48.field1911 != var53) {
                            var48.field1911 = var53;
                            class53.method403(-87, var48);
                        }
                        if (var48.field1974 == -1) {
                            class198.method1393(7, var48.field1896);
                        }
                        continue;
                    }
                    if (var475 == 1004) {
                        var7 -= 2;
                        var48.field1948 = class62.field1052[var7];
                        var48.field1950 = class62.field1052[var7 + 1];
                        class53.method403(-117, var48);
                        class2.method9(var48, (byte) 117);
                        if (var48.field1833 == 0) {
                            class148.method1092(var48, false, false);
                        }
                        continue;
                    }
                } else if (!(var475 < 1100 || var475 >= 1200) || !(var475 < 2100 || var475 >= 2200)) {
                    class107 var446;
                    if (var475 >= 2000) {
                        var475 -= 1000;
                        var7--;
                        var446 = class55.method408(class62.field1052[var7], 251234864);
                    } else {
                        var446 = var47 ? class55.field953 : class154.field2707;
                    }
                    if (var475 == 1100) {
                        var7 -= 2;
                        var446.field1937 = class62.field1052[var7];
                        if (var446.field1937 > (var446.field1828 - var446.field1856)) {
                            var446.field1937 = var446.field1828 - var446.field1856;
                        }
                        if (var446.field1937 < 0) {
                            var446.field1937 = 0;
                        }
                        var446.field1934 = class62.field1052[var7 + 1];
                        if ((var446.field1850 - var446.field1919) < var446.field1934) {
                            var446.field1934 = var446.field1850 - var446.field1919;
                        }
                        if (var446.field1934 < 0) {
                            var446.field1934 = 0;
                        }
                        class53.method403(-64, var446);
                        if (var446.field1974 == -1) {
                            class176.method1261(var446.field1896, 18037);
                        }
                        continue;
                    }
                    if (var475 == 1101) {
                        var7--;
                        var446.field1848 = class62.field1052[var7];
                        class53.method403(-108, var446);
                        if (var446.field1974 == -1) {
                            class86.method624(var446.field1896, 38);
                        }
                        continue;
                    }
                    if (var475 == 1102) {
                        var7--;
                        var446.field1823 = class62.field1052[var7] == 1;
                        class53.method403(-123, var446);
                        continue;
                    }
                    if (var475 == 1103) {
                        var7--;
                        var446.field1922 = class62.field1052[var7];
                        class53.method403(-126, var446);
                        continue;
                    }
                    if (var475 == 1104) {
                        var7--;
                        var446.field1971 = class62.field1052[var7];
                        class53.method403(-121, var446);
                        continue;
                    }
                    if (var475 == 1105) {
                        var7--;
                        var446.field1882 = class62.field1052[var7];
                        class53.method403(-116, var446);
                        continue;
                    }
                    if (var475 == 1106) {
                        var7--;
                        var446.field1926 = class62.field1052[var7];
                        class53.method403(-75, var446);
                        continue;
                    }
                    if (var475 == 1107) {
                        var7--;
                        var446.field1875 = class62.field1052[var7] == 1;
                        class53.method403(-98, var446);
                        continue;
                    }
                    if (var475 == 1108) {
                        var446.field1947 = 1;
                        var7--;
                        var446.field1847 = class62.field1052[var7];
                        class53.method403(-89, var446);
                        if (var446.field1974 == -1) {
                            class208.method1449(0, var446.field1896);
                        }
                        continue;
                    }
                    if (var475 == 1109) {
                        var7 -= 6;
                        var446.field1972 = class62.field1052[var7];
                        var446.field1886 = class62.field1052[var7 + 1];
                        var446.field1969 = class62.field1052[var7 + 2];
                        var446.field1840 = class62.field1052[var7 + 3];
                        var446.field1822 = class62.field1052[var7 + 4];
                        var446.field1904 = class62.field1052[var7 + 5];
                        class53.method403(-65, var446);
                        if (var446.field1974 == -1) {
                            class214.method1488((byte) -113, var446.field1896);
                            class176.method1260(var446.field1896, 10);
                        }
                        continue;
                    }
                    if (var475 == 1110) {
                        var7--;
                        int var447 = class62.field1052[var7];
                        if (var446.field1888 != var447) {
                            var446.field1888 = var447;
                            var446.field1910 = 0;
                            var446.field1952 = 0;
                            class53.method403(-100, var446);
                        }
                        if (var446.field1974 == -1) {
                            class107.method812(-124, var446.field1896);
                        }
                        continue;
                    }
                    if (var475 == 1111) {
                        var7--;
                        var446.field1961 = class62.field1052[var7] == 1;
                        class53.method403(-112, var446);
                        continue;
                    }
                    if (var475 == 1112) {
                        var8--;
                        class96 var448 = class211.field3634[var8];
                        if (!var448.method705(0, var446.field1918)) {
                            var446.field1918 = var448;
                            class53.method403(-72, var446);
                        }
                        if (var446.field1974 == -1) {
                            class248.method1736(var446.field1896, false);
                        }
                        continue;
                    }
                    if (var475 == 1113) {
                        var7--;
                        var446.field1814 = class62.field1052[var7];
                        class53.method403(-88, var446);
                        continue;
                    }
                    if (var475 == 1114) {
                        var7 -= 3;
                        var446.field1818 = class62.field1052[var7];
                        var446.field1967 = class62.field1052[var7 + 1];
                        var446.field1876 = class62.field1052[var7 + 2];
                        class53.method403(-60, var446);
                        continue;
                    }
                    if (var475 == 1115) {
                        var7--;
                        var446.field1935 = class62.field1052[var7] == 1;
                        class53.method403(-115, var446);
                        continue;
                    }
                    if (var475 == 1116) {
                        var7--;
                        var446.field1839 = class62.field1052[var7];
                        class53.method403(-108, var446);
                        continue;
                    }
                    if (var475 == 1117) {
                        var7--;
                        var446.field1901 = class62.field1052[var7];
                        class53.method403(-86, var446);
                        continue;
                    }
                    if (var475 == 1118) {
                        var7--;
                        var446.field1844 = class62.field1052[var7] == 1;
                        class53.method403(-70, var446);
                        continue;
                    }
                    if (var475 == 1119) {
                        var7--;
                        var446.field1851 = class62.field1052[var7] == 1;
                        class53.method403(-64, var446);
                        continue;
                    }
                    if (var475 == 1120) {
                        var7 -= 2;
                        var446.field1828 = class62.field1052[var7];
                        var446.field1850 = class62.field1052[var7 + 1];
                        class53.method403(-60, var446);
                        if (var446.field1833 == 0) {
                            class148.method1092(var446, false, false);
                        }
                        continue;
                    }
                    if (var475 == 1121) {
                        class53.method403(-66, var446);
                        var7 -= 2;
                        continue;
                    }
                    if (var475 == 1122) {
                        var7--;
                        var446.field1933 = class62.field1052[var7] == 1;
                        class53.method403(-82, var446);
                        continue;
                    }
                } else if (var475 >= 1200 && var475 < 1300 || var475 >= 2200 && var475 < 2300) {
                    class107 var442;
                    if (var475 >= 2000) {
                        var7--;
                        var442 = class55.method408(class62.field1052[var7], 251234864);
                        var475 -= 1000;
                    } else {
                        var442 = var47 ? class55.field953 : class154.field2707;
                    }
                    class53.method403(-108, var442);
                    if (var475 == 1200 || var475 == 1205) {
                        var7 -= 2;
                        int var443 = class62.field1052[var7 + 1];
                        int var444 = class62.field1052[var7];
                        if (var442.field1974 == -1) {
                            class262.method1818((byte) 13, var442.field1896);
                            class214.method1488((byte) -98, var442.field1896);
                            class176.method1260(var442.field1896, 10);
                        }
                        if (var444 == -1) {
                            var442.field1847 = -1;
                            var442.field1863 = -1;
                            var442.field1947 = 1;
                        } else {
                            var442.field1924 = var443;
                            var442.field1863 = var444;
                            class159 var445 = class269.method1845(var444, (byte) 61);
                            var442.field1886 = var445.field2783;
                            var442.field1840 = var445.field2757;
                            var442.field1969 = var445.field2829;
                            if (var475 == 1205) {
                                var442.field1932 = false;
                            } else {
                                var442.field1932 = true;
                            }
                            var442.field1822 = var445.field2827;
                            var442.field1972 = var445.field2805;
                            var442.field1904 = var445.field2820;
                            if (var442.field1830 > 0) {
                                var442.field1904 = var442.field1904 * 32 / var442.field1830;
                            } else if (var442.field1899 > 0) {
                                var442.field1904 = var442.field1904 * 32 / var442.field1899;
                            }
                        }
                        continue;
                    }
                    if (var475 == 1201) {
                        var442.field1947 = 2;
                        var7--;
                        var442.field1847 = class62.field1052[var7];
                        if (var442.field1974 == -1) {
                            class208.method1449(0, var442.field1896);
                        }
                        continue;
                    }
                    if (var475 == 1202) {
                        var442.field1947 = 3;
                        var442.field1847 = class236.field4047.field812.method1307(44);
                        if (var442.field1974 == -1) {
                            class208.method1449(0, var442.field1896);
                        }
                        continue;
                    }
                    if (var475 == 1203) {
                        var442.field1947 = 6;
                        var7--;
                        var442.field1847 = class62.field1052[var7];
                        if (var442.field1974 == -1) {
                            class208.method1449(0, var442.field1896);
                        }
                        continue;
                    }
                    if (var475 == 1204) {
                        var442.field1947 = 5;
                        var7--;
                        var442.field1847 = class62.field1052[var7];
                        if (var442.field1974 == -1) {
                            class208.method1449(0, var442.field1896);
                        }
                        continue;
                    }
                } else if (var475 >= 1300 && var475 < 1400 || var475 >= 2300 && var475 < 2400) {
                    class107 var54;
                    if (var475 < 2000) {
                        var54 = var47 ? class55.field953 : class154.field2707;
                    } else {
                        var475 -= 1000;
                        var7--;
                        var54 = class55.method408(class62.field1052[var7], 251234864);
                    }
                    if (var475 == 1300) {
                        var7--;
                        int var55 = class62.field1052[var7] - 1;
                        if (var55 >= 0 && var55 <= 9) {
                            var8--;
                            var54.method810(class211.field3634[var8], var55, (byte) 113);
                            continue;
                        }
                        var8--;
                        continue;
                    }
                    if (var475 == 1301) {
                        var7 -= 2;
                        int var56 = class62.field1052[var7];
                        int var57 = class62.field1052[var7 + 1];
                        var54.field1931 = class1.method7(var56, var57, -95);
                        continue;
                    }
                    if (var475 == 1302) {
                        var7--;
                        var54.field1841 = class62.field1052[var7] == 1;
                        continue;
                    }
                    if (var475 == 1303) {
                        var7--;
                        var54.field1921 = class62.field1052[var7];
                        continue;
                    }
                    if (var475 == 1304) {
                        var7--;
                        var54.field1955 = class62.field1052[var7];
                        continue;
                    }
                    if (var475 == 1305) {
                        var8--;
                        var54.field1812 = class211.field3634[var8];
                        continue;
                    }
                    if (var475 == 1306) {
                        var8--;
                        var54.field1959 = class211.field3634[var8];
                        continue;
                    }
                    if (var475 == 1307) {
                        var54.field1930 = null;
                        continue;
                    }
                } else {
                    if (var475 >= 1400 && var475 < 1500 || var475 >= 2400 && var475 < 2500) {
                        class107 var58;
                        if (var475 >= 2000) {
                            var475 -= 1000;
                            var7--;
                            var58 = class55.method408(class62.field1052[var7], 251234864);
                        } else {
                            var58 = var47 ? class55.field953 : class154.field2707;
                        }
                        var8--;
                        class96 var59 = class211.field3634[var8];
                        int[] var60 = null;
                        if (var59.method707(-34) > 0 && var59.method687(var59.method707(-20) - 1, 0) == 89) {
                            var7--;
                            int var61 = class62.field1052[var7];
                            if (var61 > 0) {
                                var60 = new int[var61];
                                while ((var61--) > 0) {
                                    var7--;
                                    var60[var61] = class62.field1052[var7];
                                }
                            }
                            var59 = var59.method716(var59.method707(-83) - 1, (byte) -13, 0);
                        }
                        Object[] var62 = new Object[var59.method707(-29) + 1];
                        for (int var63 = var62.length - 1; var63 >= 1; var63--) {
                            if (var59.method687(var63 - 1, 0) == 115) {
                                var8--;
                                var62[var63] = class211.field3634[var8];
                            } else {
                                var7--;
                                var62[var63] = Integer.valueOf(class62.field1052[var7]);
                            }
                        }
                        var7--;
                        int var64 = class62.field1052[var7];
                        if (var64 == -1) {
                            var62 = null;
                        } else {
                            var62[0] = Integer.valueOf(var64);
                        }
                        var58.field1976 = true;
                        if (var475 == 1400) {
                            var58.field1819 = var62;
                        } else if (var475 == 1401) {
                            var58.field1941 = var62;
                        } else if (var475 == 1402) {
                            var58.field1887 = var62;
                        } else if (var475 == 1403) {
                            var58.field1940 = var62;
                        } else if (var475 == 1404) {
                            var58.field1843 = var62;
                        } else if (var475 == 1405) {
                            var58.field1874 = var62;
                        } else if (var475 == 1406) {
                            var58.field1857 = var62;
                        } else if (var475 == 1407) {
                            var58.field1892 = var62;
                            var58.field1898 = var60;
                        } else if (var475 == 1408) {
                            var58.field1954 = var62;
                        } else if (var475 == 1409) {
                            var58.field1824 = var62;
                        } else if (var475 == 1410) {
                            var58.field1849 = var62;
                        } else if (var475 == 1411) {
                            var58.field1939 = var62;
                        } else if (var475 == 1412) {
                            var58.field1820 = var62;
                        } else if (var475 == 1414) {
                            var58.field1946 = var60;
                            var58.field1913 = var62;
                        } else if (var475 == 1415) {
                            var58.field1938 = var60;
                            var58.field1879 = var62;
                        } else if (var475 == 1416) {
                            var58.field1965 = var62;
                        } else if (var475 == 1417) {
                            var58.field1902 = var62;
                        } else if (var475 == 1418) {
                            var58.field1909 = var62;
                        } else if (var475 == 1419) {
                            var58.field1929 = var62;
                        } else if (var475 == 1420) {
                            var58.field1957 = var62;
                        } else if (var475 == 1421) {
                            var58.field1836 = var62;
                        } else if (var475 == 1422) {
                            var58.field1853 = var62;
                        } else if (var475 == 1423) {
                            var58.field1894 = var62;
                        } else if (var475 == 1424) {
                            var58.field1895 = var62;
                        } else if (var475 == 1425) {
                            var58.field1889 = var62;
                        } else if (var475 == 1426) {
                            var58.field1920 = var62;
                        } else if (var475 == 1427) {
                            var58.field1845 = var62;
                        } else if (var475 == 1428) {
                            var58.field1893 = var60;
                            var58.field1881 = var62;
                        } else if (var475 == 1429) {
                            var58.field1859 = var62;
                            var58.field1885 = var60;
                        }
                        continue;
                    }
                    if (var475 < 1600) {
                        class107 var65 = var47 ? class55.field953 : class154.field2707;
                        if (var475 == 1500) {
                            class62.field1052[var7++] = var65.field1942;
                            continue;
                        }
                        if (var475 == 1501) {
                            class62.field1052[var7++] = var65.field1945;
                            continue;
                        }
                        if (var475 == 1502) {
                            class62.field1052[var7++] = var65.field1856;
                            continue;
                        }
                        if (var475 == 1503) {
                            class62.field1052[var7++] = var65.field1919;
                            continue;
                        }
                        if (var475 == 1504) {
                            class62.field1052[var7++] = var65.field1911 ? 1 : 0;
                            continue;
                        }
                        if (var475 == 1505) {
                            class62.field1052[var7++] = var65.field1827;
                            continue;
                        }
                    } else if (var475 < 1700) {
                        class107 var66 = var47 ? class55.field953 : class154.field2707;
                        if (var475 == 1600) {
                            class62.field1052[var7++] = var66.field1937;
                            continue;
                        }
                        if (var475 == 1601) {
                            class62.field1052[var7++] = var66.field1934;
                            continue;
                        }
                        if (var475 == 1602) {
                            class211.field3634[var8++] = var66.field1918;
                            continue;
                        }
                        if (var475 == 1603) {
                            class62.field1052[var7++] = var66.field1828;
                            continue;
                        }
                        if (var475 == 1604) {
                            class62.field1052[var7++] = var66.field1850;
                            continue;
                        }
                        if (var475 == 1605) {
                            class62.field1052[var7++] = var66.field1904;
                            continue;
                        }
                        if (var475 == 1606) {
                            class62.field1052[var7++] = var66.field1969;
                            continue;
                        }
                        if (var475 == 1607) {
                            class62.field1052[var7++] = var66.field1822;
                            continue;
                        }
                        if (var475 == 1608) {
                            class62.field1052[var7++] = var66.field1840;
                            continue;
                        }
                        if (var475 == 1609) {
                            class62.field1052[var7++] = var66.field1922;
                            continue;
                        }
                    } else if (var475 < 1800) {
                        class107 var67 = var47 ? class55.field953 : class154.field2707;
                        if (var475 == 1700) {
                            class62.field1052[var7++] = var67.field1863;
                            continue;
                        }
                        if (var475 == 1701) {
                            if (var67.field1863 == -1) {
                                class62.field1052[var7++] = 0;
                            } else {
                                class62.field1052[var7++] = var67.field1924;
                            }
                            continue;
                        }
                        if (var475 == 1702) {
                            class62.field1052[var7++] = var67.field1974;
                            continue;
                        }
                    } else if (var475 < 1900) {
                        class107 var440 = var47 ? class55.field953 : class154.field2707;
                        if (var475 == 1800) {
                            class62.field1052[var7++] = class140.method1041(client.method817(var440), 32677);
                            continue;
                        }
                        if (var475 == 1801) {
                            var7--;
                            int var441 = class62.field1052[var7];
                            int var477 = var441 - 1;
                            if (var440.field1930 != null && var440.field1930.length > var477 && var440.field1930[var477] != null) {
                                class211.field3634[var8++] = var440.field1930[var477];
                                continue;
                            }
                            class211.field3634[var8++] = class216.field3719;
                            continue;
                        }
                        if (var475 == 1802) {
                            if (var440.field1812 == null) {
                                class211.field3634[var8++] = class216.field3719;
                            } else {
                                class211.field3634[var8++] = var440.field1812;
                            }
                            continue;
                        }
                    } else if (var475 < 2600) {
                        var7--;
                        class107 var68 = class55.method408(class62.field1052[var7], 251234864);
                        if (var475 == 2500) {
                            class62.field1052[var7++] = var68.field1942;
                            continue;
                        }
                        if (var475 == 2501) {
                            class62.field1052[var7++] = var68.field1945;
                            continue;
                        }
                        if (var475 == 2502) {
                            class62.field1052[var7++] = var68.field1856;
                            continue;
                        }
                        if (var475 == 2503) {
                            class62.field1052[var7++] = var68.field1919;
                            continue;
                        }
                        if (var475 == 2504) {
                            class62.field1052[var7++] = var68.field1911 ? 1 : 0;
                            continue;
                        }
                        if (var475 == 2505) {
                            class62.field1052[var7++] = var68.field1827;
                            continue;
                        }
                    } else if (var475 < 2700) {
                        var7--;
                        class107 var69 = class55.method408(class62.field1052[var7], 251234864);
                        if (var475 == 2600) {
                            class62.field1052[var7++] = var69.field1937;
                            continue;
                        }
                        if (var475 == 2601) {
                            class62.field1052[var7++] = var69.field1934;
                            continue;
                        }
                        if (var475 == 2602) {
                            class211.field3634[var8++] = var69.field1918;
                            continue;
                        }
                        if (var475 == 2603) {
                            class62.field1052[var7++] = var69.field1828;
                            continue;
                        }
                        if (var475 == 2604) {
                            class62.field1052[var7++] = var69.field1850;
                            continue;
                        }
                        if (var475 == 2605) {
                            class62.field1052[var7++] = var69.field1904;
                            continue;
                        }
                        if (var475 == 2606) {
                            class62.field1052[var7++] = var69.field1969;
                            continue;
                        }
                        if (var475 == 2607) {
                            class62.field1052[var7++] = var69.field1822;
                            continue;
                        }
                        if (var475 == 2608) {
                            class62.field1052[var7++] = var69.field1840;
                            continue;
                        }
                        if (var475 == 2609) {
                            class62.field1052[var7++] = var69.field1922;
                            continue;
                        }
                    } else if (var475 < 2800) {
                        if (var475 == 2700) {
                            var7--;
                            class107 var430 = class55.method408(class62.field1052[var7], 251234864);
                            class62.field1052[var7++] = var430.field1863;
                            continue;
                        }
                        if (var475 == 2701) {
                            var7--;
                            class107 var431 = class55.method408(class62.field1052[var7], 251234864);
                            if (var431.field1863 == -1) {
                                class62.field1052[var7++] = 0;
                            } else {
                                class62.field1052[var7++] = var431.field1924;
                            }
                            continue;
                        }
                        if (var475 == 2702) {
                            var7--;
                            int var432 = class62.field1052[var7];
                            class168 var433 = (class168) class34.field606.method1081(0, (long) var432);
                            if (var433 == null) {
                                class62.field1052[var7++] = 0;
                            } else {
                                class62.field1052[var7++] = 1;
                            }
                            continue;
                        }
                        if (var475 == 2703) {
                            var7--;
                            class107 var434 = class55.method408(class62.field1052[var7], 251234864);
                            if (var434.field1842 == null) {
                                class62.field1052[var7++] = 0;
                                continue;
                            }
                            int var435 = var434.field1842.length;
                            for (int var436 = 0; var436 < var434.field1842.length; var436++) {
                                if (var434.field1842[var436] == null) {
                                    var435 = var436;
                                    break;
                                }
                            }
                            class62.field1052[var7++] = var435;
                            continue;
                        }
                        if (var475 == 2704 || var475 == 2705) {
                            var7 -= 2;
                            int var437 = class62.field1052[var7];
                            int var438 = class62.field1052[var7 + 1];
                            class168 var439 = (class168) class34.field606.method1081(0, (long) var437);
                            if (var439 != null && var439.field2961 == var438) {
                                class62.field1052[var7++] = 1;
                                continue;
                            }
                            class62.field1052[var7++] = 0;
                            continue;
                        }
                    } else if (var475 < 2900) {
                        var7--;
                        class107 var428 = class55.method408(class62.field1052[var7], 251234864);
                        if (var475 == 2800) {
                            class62.field1052[var7++] = class140.method1041(client.method817(var428), 32677);
                            continue;
                        }
                        if (var475 == 2801) {
                            var7--;
                            int var429 = class62.field1052[var7];
                            int var476 = var429 - 1;
                            if (var428.field1930 != null && var476 < var428.field1930.length && var428.field1930[var476] != null) {
                                class211.field3634[var8++] = var428.field1930[var476];
                                continue;
                            }
                            class211.field3634[var8++] = class216.field3719;
                            continue;
                        }
                        if (var475 == 2802) {
                            if (var428.field1812 == null) {
                                class211.field3634[var8++] = class216.field3719;
                            } else {
                                class211.field3634[var8++] = var428.field1812;
                            }
                            continue;
                        }
                    } else if (var475 < 3200) {
                        if (var475 == 3100) {
                            var8--;
                            class96 var70 = class211.field3634[var8];
                            class226.method1540(class216.field3719, 0, (byte) -9, var70);
                            continue;
                        }
                        if (var475 == 3101) {
                            var7 -= 2;
                            class215.method1490(-3, class62.field1052[var7 + 1], class62.field1052[var7], class236.field4047);
                            continue;
                        }
                        if (var475 == 3103) {
                            class47.method363(30797);
                            continue;
                        }
                        if (var475 == 3104) {
                            var8--;
                            class96 var71 = class211.field3634[var8];
                            class216.field3709++;
                            int var72 = 0;
                            if (var71.method671(10)) {
                                var72 = var71.method694(10);
                            }
                            class140.field2505.method1012((byte) 6, 184);
                            class140.field2505.method1625((byte) 46, var72);
                            continue;
                        }
                        if (var475 == 3105) {
                            class211.field3643++;
                            var8--;
                            class96 var73 = class211.field3634[var8];
                            class140.field2505.method1012((byte) 62, 32);
                            class140.field2505.method1668(var73.method685((byte) -110), -20);
                            continue;
                        }
                        if (var475 == 3106) {
                            var8--;
                            class96 var74 = class211.field3634[var8];
                            class79.field1340++;
                            class140.field2505.method1012((byte) -123, 235);
                            class140.field2505.method1652(var74.method707(-41) + 1, (byte) 41);
                            class140.field2505.method1644(var74, -37);
                            continue;
                        }
                        if (var475 == 3107) {
                            var7--;
                            int var75 = class62.field1052[var7];
                            var8--;
                            class96 var76 = class211.field3634[var8];
                            class203.method1415(var76, true, var75);
                            continue;
                        }
                        if (var475 == 3108) {
                            var7 -= 3;
                            int var77 = class62.field1052[var7];
                            int var78 = class62.field1052[var7 + 2];
                            int var79 = class62.field1052[var7 + 1];
                            class107 var80 = class55.method408(var78, 251234864);
                            class206.method1422(var77, var79, false, var80);
                            continue;
                        }
                        if (var475 == 3109) {
                            var7 -= 2;
                            int var81 = class62.field1052[var7];
                            int var82 = class62.field1052[var7 + 1];
                            class107 var83 = var47 ? class55.field953 : class154.field2707;
                            class206.method1422(var81, var82, false, var83);
                            continue;
                        }
                        if (var475 == 3110) {
                            class235.field4035++;
                            var7--;
                            int var84 = class62.field1052[var7];
                            class140.field2505.method1012((byte) 43, 68);
                            class140.field2505.method1632(true, var84);
                            continue;
                        }
                    } else if (var475 < 3300) {
                        if (var475 == 3200) {
                            var7 -= 3;
                            class17.method113(class62.field1052[var7 + 2], class62.field1052[var7], 25373, class62.field1052[var7 + 1]);
                            continue;
                        }
                        if (var475 == 3201) {
                            var7--;
                            class38.method298(0, class62.field1052[var7]);
                            continue;
                        }
                        if (var475 == 3202) {
                            var7 -= 2;
                            class201.method1404(class62.field1052[var7 + 1], true, class62.field1052[var7]);
                            continue;
                        }
                    } else if (var475 < 3400) {
                        if (var475 == 3300) {
                            class62.field1052[var7++] = class236.field4053;
                            continue;
                        }
                        if (var475 == 3301) {
                            var7 -= 2;
                            int var401 = class62.field1052[var7];
                            int var402 = class62.field1052[var7 + 1];
                            class62.field1052[var7++] = class151.method1107((byte) -96, var401, var402);
                            continue;
                        }
                        if (var475 == 3302) {
                            var7 -= 2;
                            int var403 = class62.field1052[var7];
                            int var404 = class62.field1052[var7 + 1];
                            class62.field1052[var7++] = class115.method908(var404, var403, 40);
                            continue;
                        }
                        if (var475 == 3303) {
                            var7 -= 2;
                            int var405 = class62.field1052[var7 + 1];
                            int var406 = class62.field1052[var7];
                            class62.field1052[var7++] = class197.method1380(var406, (byte) -112, var405);
                            continue;
                        }
                        if (var475 == 3304) {
                            var7--;
                            int var407 = class62.field1052[var7];
                            class62.field1052[var7++] = class9.method71(var407, 3).field2383;
                            continue;
                        }
                        if (var475 == 3305) {
                            var7--;
                            int var408 = class62.field1052[var7];
                            class62.field1052[var7++] = class168.field2958[var408];
                            continue;
                        }
                        if (var475 == 3306) {
                            var7--;
                            int var409 = class62.field1052[var7];
                            class62.field1052[var7++] = class230.field3958[var409];
                            continue;
                        }
                        if (var475 == 3307) {
                            var7--;
                            int var410 = class62.field1052[var7];
                            class62.field1052[var7++] = class95.field1565[var410];
                            continue;
                        }
                        if (var475 == 3308) {
                            int var411 = (class236.field4047.field4533 >> 7) + class225.field3832;
                            int var412 = class216.field3712;
                            int var413 = (class236.field4047.field4511 >> 7) + class196.field3383;
                            class62.field1052[var7++] = (var412 << 28) + (var413 << 14) + var411;
                            continue;
                        }
                        if (var475 == 3309) {
                            var7--;
                            int var414 = class62.field1052[var7];
                            class62.field1052[var7++] = class130.method985(16383, var414 >> 14);
                            continue;
                        }
                        if (var475 == 3310) {
                            var7--;
                            int var415 = class62.field1052[var7];
                            class62.field1052[var7++] = var415 >> 28;
                            continue;
                        }
                        if (var475 == 3311) {
                            var7--;
                            int var416 = class62.field1052[var7];
                            class62.field1052[var7++] = class130.method985(var416, 16383);
                            continue;
                        }
                        if (var475 == 3312) {
                            class62.field1052[var7++] = class25.field423 ? 1 : 0;
                            continue;
                        }
                        if (var475 == 3313) {
                            var7 -= 2;
                            int var417 = class62.field1052[var7] + 32768;
                            int var418 = class62.field1052[var7 + 1];
                            class62.field1052[var7++] = class151.method1107((byte) -96, var417, var418);
                            continue;
                        }
                        if (var475 == 3314) {
                            var7 -= 2;
                            int var419 = class62.field1052[var7] + 32768;
                            int var420 = class62.field1052[var7 + 1];
                            class62.field1052[var7++] = class115.method908(var420, var419, 62);
                            continue;
                        }
                        if (var475 == 3315) {
                            var7 -= 2;
                            int var421 = class62.field1052[var7 + 1];
                            int var422 = class62.field1052[var7] + 32768;
                            class62.field1052[var7++] = class197.method1380(var422, (byte) -119, var421);
                            continue;
                        }
                        if (var475 == 3316) {
                            if (class254.field4389 < 2) {
                                class62.field1052[var7++] = 0;
                            } else {
                                class62.field1052[var7++] = class254.field4389;
                            }
                            continue;
                        }
                        if (var475 == 3317) {
                            class62.field1052[var7++] = class217.field3728;
                            continue;
                        }
                        if (var475 == 3318) {
                            class62.field1052[var7++] = class235.field4032;
                            continue;
                        }
                        if (var475 == 3321) {
                            class62.field1052[var7++] = class270.field4706;
                            continue;
                        }
                        if (var475 == 3322) {
                            class62.field1052[var7++] = class186.field3252;
                            continue;
                        }
                        if (var475 == 3323) {
                            if (class57.field1010 >= 5 && class57.field1010 <= 9) {
                                class62.field1052[var7++] = 1;
                                continue;
                            }
                            class62.field1052[var7++] = 0;
                            continue;
                        }
                        if (var475 == 3324) {
                            if (class57.field1010 >= 5 && class57.field1010 <= 9) {
                                class62.field1052[var7++] = class57.field1010;
                                continue;
                            }
                            class62.field1052[var7++] = 0;
                            continue;
                        }
                        if (var475 == 3325) {
                            class62.field1052[var7++] = class193.field3332 ? 1 : 0;
                            continue;
                        }
                        if (var475 == 3326) {
                            class62.field1052[var7++] = class236.field4047.field801;
                            continue;
                        }
                        if (var475 == 3327) {
                            class62.field1052[var7++] = class236.field4047.field812.field3243 ? 1 : 0;
                            continue;
                        }
                        if (var475 == 3328) {
                            class62.field1052[var7++] = class31.field487 && !class265.field4625 ? 1 : 0;
                            continue;
                        }
                        if (var475 == 3329) {
                            class62.field1052[var7++] = class74.field1277 ? 1 : 0;
                            continue;
                        }
                        if (var475 == 3330) {
                            var7--;
                            int var423 = class62.field1052[var7];
                            class62.field1052[var7++] = class151.method1110(var423, true);
                            continue;
                        }
                        if (var475 == 3331) {
                            var7 -= 2;
                            int var424 = class62.field1052[var7];
                            int var425 = class62.field1052[var7 + 1];
                            class62.field1052[var7++] = class114.method894(false, var424, true, var425);
                            continue;
                        }
                        if (var475 == 3332) {
                            var7 -= 2;
                            int var426 = class62.field1052[var7];
                            int var427 = class62.field1052[var7 + 1];
                            class62.field1052[var7++] = class114.method894(true, var426, true, var427);
                            continue;
                        }
                        if (var475 == 3333) {
                            class62.field1052[var7++] = class245.field4260;
                            continue;
                        }
                        if (var475 == 3335) {
                            class62.field1052[var7++] = class156.field2722;
                            continue;
                        }
                    } else if (var475 < 3500) {
                        if (var475 == 3400) {
                            var7 -= 2;
                            int var85 = class62.field1052[var7];
                            int var86 = class62.field1052[var7 + 1];
                            class42 var87 = class50.method378(10, var85);
                            class211.field3634[var8++] = var87.method326(-4, var86);
                            continue;
                        }
                        if (var475 == 3408) {
                            var7 -= 4;
                            int var88 = class62.field1052[var7];
                            int var89 = class62.field1052[var7 + 1];
                            int var90 = class62.field1052[var7 + 3];
                            int var91 = class62.field1052[var7 + 2];
                            class42 var92 = class50.method378(10, var91);
                            if (var92.field716 == var88 && var92.field722 == var89) {
                                if (var89 == 115) {
                                    class211.field3634[var8++] = var92.method326(-4, var90);
                                } else {
                                    class62.field1052[var7++] = var92.method331(var90, 83);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var475 == 3409) {
                            var7 -= 3;
                            int var93 = class62.field1052[var7];
                            int var94 = class62.field1052[var7 + 2];
                            int var95 = class62.field1052[var7 + 1];
                            if (var95 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class42 var96 = class50.method378(10, var95);
                            if (var96.field722 != var93) {
                                throw new RuntimeException("C3409-1");
                            }
                            class62.field1052[var7++] = var96.method323(var94, -91) ? 1 : 0;
                            continue;
                        }
                        if (var475 == 3410) {
                            var8--;
                            class96 var97 = class211.field3634[var8];
                            var7--;
                            int var98 = class62.field1052[var7];
                            if (var98 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class42 var99 = class50.method378(10, var98);
                            if (var99.field722 != 115) {
                                throw new RuntimeException("C3410-1");
                            }
                            class62.field1052[var7++] = var99.method325(var97, -10429) ? 1 : 0;
                            continue;
                        }
                        if (var475 == 3411) {
                            var7--;
                            int var100 = class62.field1052[var7];
                            class42 var101 = class50.method378(10, var100);
                            class62.field1052[var7++] = var101.field729.method1079((byte) -54);
                            continue;
                        }
                    } else if (var475 < 3700) {
                        if (var475 == 3600) {
                            if (class253.field4380 == 0) {
                                class62.field1052[var7++] = -2;
                            } else if (class253.field4380 == 1) {
                                class62.field1052[var7++] = -1;
                            } else {
                                class62.field1052[var7++] = class76.field1306;
                            }
                            continue;
                        }
                        if (var475 == 3601) {
                            var7--;
                            int var379 = class62.field1052[var7];
                            if (class253.field4380 == 2 && class76.field1306 > var379) {
                                class211.field3634[var8++] = class185.field3224[var379];
                                continue;
                            }
                            class211.field3634[var8++] = class216.field3719;
                            continue;
                        }
                        if (var475 == 3602) {
                            var7--;
                            int var380 = class62.field1052[var7];
                            if (class253.field4380 == 2 && class76.field1306 > var380) {
                                class62.field1052[var7++] = class251.field4337[var380];
                                continue;
                            }
                            class62.field1052[var7++] = 0;
                            continue;
                        }
                        if (var475 == 3603) {
                            var7--;
                            int var381 = class62.field1052[var7];
                            if (class253.field4380 == 2 && class76.field1306 > var381) {
                                class62.field1052[var7++] = class124.field2298[var381];
                                continue;
                            }
                            class62.field1052[var7++] = 0;
                            continue;
                        }
                        if (var475 == 3604) {
                            var8--;
                            class96 var382 = class211.field3634[var8];
                            var7--;
                            int var383 = class62.field1052[var7];
                            class245.method1718(var383, var382, -12858);
                            continue;
                        }
                        if (var475 == 3605) {
                            var8--;
                            class96 var384 = class211.field3634[var8];
                            class249.method1739(-100, var384.method685((byte) -101));
                            continue;
                        }
                        if (var475 == 3606) {
                            var8--;
                            class96 var385 = class211.field3634[var8];
                            class39.method314(true, var385.method685((byte) -11));
                            continue;
                        }
                        if (var475 == 3607) {
                            var8--;
                            class96 var386 = class211.field3634[var8];
                            class138.method1030(var386.method685((byte) 115), 31491);
                            continue;
                        }
                        if (var475 == 3608) {
                            var8--;
                            class96 var387 = class211.field3634[var8];
                            class99.method746(0, var387.method685((byte) 10));
                            continue;
                        }
                        if (var475 == 3609) {
                            var8--;
                            class96 var388 = class211.field3634[var8];
                            if (var388.method703(0, class134.field2404) || var388.method703(0, class109.field2018)) {
                                var388 = var388.method710(127, 7);
                            }
                            class62.field1052[var7++] = class25.method170(0, var388) ? 1 : 0;
                            continue;
                        }
                        if (var475 == 3610) {
                            var7--;
                            int var389 = class62.field1052[var7];
                            if (class253.field4380 == 2 && var389 < class76.field1306) {
                                class211.field3634[var8++] = class251.field4336[var389];
                                continue;
                            }
                            class211.field3634[var8++] = class216.field3719;
                            continue;
                        }
                        if (var475 == 3611) {
                            if (class147.field2606 == null) {
                                class211.field3634[var8++] = class216.field3719;
                            } else {
                                class211.field3634[var8++] = class147.field2606.method706((byte) 76);
                            }
                            continue;
                        }
                        if (var475 == 3612) {
                            if (class147.field2606 == null) {
                                class62.field1052[var7++] = 0;
                            } else {
                                class62.field1052[var7++] = class118.field2190;
                            }
                            continue;
                        }
                        if (var475 == 3613) {
                            var7--;
                            int var390 = class62.field1052[var7];
                            if (class147.field2606 != null && var390 < class118.field2190) {
                                class211.field3634[var8++] = class244.field4237[var390].field2219.method706((byte) 40);
                                continue;
                            }
                            class211.field3634[var8++] = class216.field3719;
                            continue;
                        }
                        if (var475 == 3614) {
                            var7--;
                            int var391 = class62.field1052[var7];
                            if (class147.field2606 != null && class118.field2190 > var391) {
                                class62.field1052[var7++] = class244.field4237[var391].field2217;
                                continue;
                            }
                            class62.field1052[var7++] = 0;
                            continue;
                        }
                        if (var475 == 3615) {
                            var7--;
                            int var392 = class62.field1052[var7];
                            if (class147.field2606 != null && var392 < class118.field2190) {
                                class62.field1052[var7++] = class244.field4237[var392].field2218;
                                continue;
                            }
                            class62.field1052[var7++] = 0;
                            continue;
                        }
                        if (var475 == 3616) {
                            class62.field1052[var7++] = class169.field2964;
                            continue;
                        }
                        if (var475 == 3617) {
                            var8--;
                            class96 var393 = class211.field3634[var8];
                            class276.method1874(true, var393);
                            continue;
                        }
                        if (var475 == 3618) {
                            class62.field1052[var7++] = class143.field2540;
                            continue;
                        }
                        if (var475 == 3619) {
                            var8--;
                            class96 var394 = class211.field3634[var8];
                            class73.method531(var394.method685((byte) 124), 1168643819);
                            continue;
                        }
                        if (var475 == 3620) {
                            class268.method1835(-54);
                            continue;
                        }
                        if (var475 == 3621) {
                            if (class253.field4380 == 0) {
                                class62.field1052[var7++] = -1;
                            } else {
                                class62.field1052[var7++] = class231.field3974;
                            }
                            continue;
                        }
                        if (var475 == 3622) {
                            var7--;
                            int var395 = class62.field1052[var7];
                            if (class253.field4380 != 0 && class231.field3974 > var395) {
                                class211.field3634[var8++] = class57.method421((byte) -114, class7.field132[var395]).method706((byte) 59);
                                continue;
                            }
                            class211.field3634[var8++] = class216.field3719;
                            continue;
                        }
                        if (var475 == 3623) {
                            var8--;
                            class96 var396 = class211.field3634[var8];
                            if (var396.method703(0, class134.field2404) || var396.method703(0, class109.field2018)) {
                                var396 = var396.method710(115, 7);
                            }
                            class62.field1052[var7++] = method1324((byte) -90, var396) ? 1 : 0;
                            continue;
                        }
                        if (var475 == 3624) {
                            var7--;
                            int var397 = class62.field1052[var7];
                            if (class244.field4237 != null && class118.field2190 > var397 && class244.field4237[var397].field2219.method679(class236.field4047.field828, 18452)) {
                                class62.field1052[var7++] = 1;
                                continue;
                            }
                            class62.field1052[var7++] = 0;
                            continue;
                        }
                        if (var475 == 3625) {
                            if (class237.field4071 == null) {
                                class211.field3634[var8++] = class216.field3719;
                            } else {
                                class211.field3634[var8++] = class237.field4071.method706((byte) -86);
                            }
                            continue;
                        }
                        if (var475 == 3626) {
                            var7--;
                            int var398 = class62.field1052[var7];
                            if (class147.field2606 != null && class118.field2190 > var398) {
                                class211.field3634[var8++] = class244.field4237[var398].field2224;
                                continue;
                            }
                            class211.field3634[var8++] = class216.field3719;
                            continue;
                        }
                        if (var475 == 3627) {
                            var7--;
                            int var399 = class62.field1052[var7];
                            if (class253.field4380 == 2 && var399 >= 0 && var399 < class76.field1306) {
                                class62.field1052[var7++] = class86.field1454[var399] ? 1 : 0;
                                continue;
                            }
                            class62.field1052[var7++] = 0;
                            continue;
                        }
                        if (var475 == 3628) {
                            var8--;
                            class96 var400 = class211.field3634[var8];
                            if (var400.method703(0, class134.field2404) || var400.method703(0, class109.field2018)) {
                                var400 = var400.method710(117, 7);
                            }
                            class62.field1052[var7++] = class41.method318(var400, 0);
                            continue;
                        }
                    } else if (var475 < 4000) {
                        if (var475 == 3903) {
                            var7--;
                            int var102 = class62.field1052[var7];
                            class62.field1052[var7++] = class127.field2313[var102].method1142(-123);
                            continue;
                        }
                        if (var475 == 3904) {
                            var7--;
                            int var103 = class62.field1052[var7];
                            class62.field1052[var7++] = class127.field2313[var103].field2737;
                            continue;
                        }
                        if (var475 == 3905) {
                            var7--;
                            int var104 = class62.field1052[var7];
                            class62.field1052[var7++] = class127.field2313[var104].field2748;
                            continue;
                        }
                        if (var475 == 3906) {
                            var7--;
                            int var105 = class62.field1052[var7];
                            class62.field1052[var7++] = class127.field2313[var105].field2747;
                            continue;
                        }
                        if (var475 == 3907) {
                            var7--;
                            int var106 = class62.field1052[var7];
                            class62.field1052[var7++] = class127.field2313[var106].field2743;
                            continue;
                        }
                        if (var475 == 3908) {
                            var7--;
                            int var107 = class62.field1052[var7];
                            class62.field1052[var7++] = class127.field2313[var107].field2742;
                            continue;
                        }
                        if (var475 == 3910) {
                            var7--;
                            int var108 = class62.field1052[var7];
                            int var109 = class127.field2313[var108].method1138(7);
                            class62.field1052[var7++] = var109 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var475 == 3911) {
                            var7--;
                            int var110 = class62.field1052[var7];
                            int var111 = class127.field2313[var110].method1138(7);
                            class62.field1052[var7++] = var111 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var475 == 3912) {
                            var7--;
                            int var112 = class62.field1052[var7];
                            int var113 = class127.field2313[var112].method1138(7);
                            class62.field1052[var7++] = var113 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var475 == 3913) {
                            var7--;
                            int var114 = class62.field1052[var7];
                            int var115 = class127.field2313[var114].method1138(7);
                            class62.field1052[var7++] = var115 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var475 < 4100) {
                        if (var475 == 4000) {
                            var7 -= 2;
                            int var334 = class62.field1052[var7];
                            int var335 = class62.field1052[var7 + 1];
                            class62.field1052[var7++] = var334 + var335;
                            continue;
                        }
                        if (var475 == 4001) {
                            var7 -= 2;
                            int var336 = class62.field1052[var7];
                            int var337 = class62.field1052[var7 + 1];
                            class62.field1052[var7++] = var336 - var337;
                            continue;
                        }
                        if (var475 == 4002) {
                            var7 -= 2;
                            int var338 = class62.field1052[var7];
                            int var339 = class62.field1052[var7 + 1];
                            class62.field1052[var7++] = var338 * var339;
                            continue;
                        }
                        if (var475 == 4003) {
                            var7 -= 2;
                            int var340 = class62.field1052[var7];
                            int var341 = class62.field1052[var7 + 1];
                            class62.field1052[var7++] = var340 / var341;
                            continue;
                        }
                        if (var475 == 4004) {
                            var7--;
                            int var342 = class62.field1052[var7];
                            class62.field1052[var7++] = (int) (Math.random() * (double) var342);
                            continue;
                        }
                        if (var475 == 4005) {
                            var7--;
                            int var343 = class62.field1052[var7];
                            class62.field1052[var7++] = (int) ((double) (var343 + 1) * Math.random());
                            continue;
                        }
                        if (var475 == 4006) {
                            var7 -= 5;
                            int var344 = class62.field1052[var7 + 1];
                            int var345 = class62.field1052[var7 + 2];
                            int var346 = class62.field1052[var7 + 4];
                            int var347 = class62.field1052[var7];
                            int var348 = class62.field1052[var7 + 3];
                            class62.field1052[var7++] = var347 + ((var346 - var345) * (var344 - var347) / (var348 - var345));
                            continue;
                        }
                        if (var475 == 4007) {
                            var7 -= 2;
                            long var349 = (long) class62.field1052[var7 + 1];
                            long var351 = (long) class62.field1052[var7];
                            class62.field1052[var7++] = (int) (var349 * var351 / 100L + var351);
                            continue;
                        }
                        if (var475 == 4008) {
                            var7 -= 2;
                            int var353 = class62.field1052[var7];
                            int var354 = class62.field1052[var7 + 1];
                            class62.field1052[var7++] = class45.method348(0x1 << var354, var353);
                            continue;
                        }
                        if (var475 == 4009) {
                            var7 -= 2;
                            int var355 = class62.field1052[var7];
                            int var356 = class62.field1052[var7 + 1];
                            class62.field1052[var7++] = class130.method985(-(0x1 << var356) - 1, var355);
                            continue;
                        }
                        if (var475 == 4010) {
                            var7 -= 2;
                            int var357 = class62.field1052[var7];
                            int var358 = class62.field1052[var7 + 1];
                            class62.field1052[var7++] = class130.method985(var357, 0x1 << var358) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var475 == 4011) {
                            var7 -= 2;
                            int var359 = class62.field1052[var7];
                            int var360 = class62.field1052[var7 + 1];
                            class62.field1052[var7++] = var359 % var360;
                            continue;
                        }
                        if (var475 == 4012) {
                            var7 -= 2;
                            int var361 = class62.field1052[var7];
                            int var362 = class62.field1052[var7 + 1];
                            if (var361 == 0) {
                                class62.field1052[var7++] = 0;
                            } else {
                                class62.field1052[var7++] = (int) Math.pow((double) var361, (double) var362);
                            }
                            continue;
                        }
                        if (var475 == 4013) {
                            var7 -= 2;
                            int var363 = class62.field1052[var7];
                            int var364 = class62.field1052[var7 + 1];
                            if (var363 == 0) {
                                class62.field1052[var7++] = 0;
                            } else if (var364 == 0) {
                                class62.field1052[var7++] = Integer.MAX_VALUE;
                            } else {
                                class62.field1052[var7++] = (int) Math.pow((double) var363, 1.0D / (double) var364);
                            }
                            continue;
                        }
                        if (var475 == 4014) {
                            var7 -= 2;
                            int var365 = class62.field1052[var7 + 1];
                            int var366 = class62.field1052[var7];
                            class62.field1052[var7++] = class130.method985(var365, var366);
                            continue;
                        }
                        if (var475 == 4015) {
                            var7 -= 2;
                            int var367 = class62.field1052[var7 + 1];
                            int var368 = class62.field1052[var7];
                            class62.field1052[var7++] = class45.method348(var367, var368);
                            continue;
                        }
                        if (var475 == 4016) {
                            var7 -= 2;
                            int var369 = class62.field1052[var7 + 1];
                            int var370 = class62.field1052[var7];
                            class62.field1052[var7++] = var370 < var369 ? var370 : var369;
                            continue;
                        }
                        if (var475 == 4017) {
                            var7 -= 2;
                            int var371 = class62.field1052[var7 + 1];
                            int var372 = class62.field1052[var7];
                            class62.field1052[var7++] = var372 <= var371 ? var371 : var372;
                            continue;
                        }
                        if (var475 == 4018) {
                            var7 -= 3;
                            long var373 = (long) class62.field1052[var7];
                            long var375 = (long) class62.field1052[var7 + 2];
                            long var377 = (long) class62.field1052[var7 + 1];
                            class62.field1052[var7++] = (int) (var373 * var375 / var377);
                            continue;
                        }
                    } else if (var475 < 4200) {
                        if (var475 == 4100) {
                            var8--;
                            class96 var282 = class211.field3634[var8];
                            var7--;
                            int var283 = class62.field1052[var7];
                            class211.field3634[var8++] = class36.method289(-5615, new class96[] { var282, class31.method205(var283, (byte) -78) });
                            continue;
                        }
                        if (var475 == 4101) {
                            var8 -= 2;
                            class96 var284 = class211.field3634[var8];
                            class96 var285 = class211.field3634[var8 + 1];
                            class211.field3634[var8++] = class36.method289(-5615, new class96[] { var284, var285 });
                            continue;
                        }
                        if (var475 == 4102) {
                            var8--;
                            class96 var286 = class211.field3634[var8];
                            var7--;
                            int var287 = class62.field1052[var7];
                            class211.field3634[var8++] = class36.method289(-5615, new class96[] { var286, class249.method1744(true, var287, 0) });
                            continue;
                        }
                        if (var475 == 4103) {
                            var8--;
                            class96 var288 = class211.field3634[var8];
                            class211.field3634[var8++] = var288.method702(124);
                            continue;
                        }
                        if (var475 == 4104) {
                            var7--;
                            int var289 = class62.field1052[var7];
                            long var290 = ((long) var289 + 11745L) * 86400000L;
                            class64.field1099.setTime(new Date(var290));
                            int var292 = class64.field1099.get(5);
                            int var293 = class64.field1099.get(2);
                            int var294 = class64.field1099.get(1);
                            class211.field3634[var8++] = class36.method289(-5615, new class96[] { class31.method205(var292, (byte) -78), class82.field1380, class56.field962[var293], class82.field1380, class31.method205(var294, (byte) -78) });
                            continue;
                        }
                        if (var475 == 4105) {
                            var8 -= 2;
                            class96 var295 = class211.field3634[var8];
                            class96 var296 = class211.field3634[var8 + 1];
                            if (class236.field4047.field812 != null && class236.field4047.field812.field3243) {
                                class211.field3634[var8++] = var296;
                                continue;
                            }
                            class211.field3634[var8++] = var295;
                            continue;
                        }
                        if (var475 == 4106) {
                            var7--;
                            int var297 = class62.field1052[var7];
                            class211.field3634[var8++] = class31.method205(var297, (byte) -78);
                            continue;
                        }
                        if (var475 == 4107) {
                            var8 -= 2;
                            class62.field1052[var7++] = class211.field3634[var8].method722(-16882, class211.field3634[var8 + 1]);
                            continue;
                        }
                        if (var475 == 4108) {
                            var8--;
                            class96 var298 = class211.field3634[var8];
                            var7 -= 2;
                            int var299 = class62.field1052[var7 + 1];
                            int var300 = class62.field1052[var7];
                            byte[] var301 = class49.field867.method23(0, 103, var299);
                            class12 var302 = new class12(var301);
                            var302.method137(class45.field773, (int[]) null);
                            class62.field1052[var7++] = var302.method122(var298, var300);
                            continue;
                        }
                        if (var475 == 4109) {
                            var7 -= 2;
                            var8--;
                            class96 var303 = class211.field3634[var8];
                            int var304 = class62.field1052[var7];
                            int var305 = class62.field1052[var7 + 1];
                            byte[] var306 = class49.field867.method23(0, 103, var305);
                            class12 var307 = new class12(var306);
                            var307.method137(class45.field773, (int[]) null);
                            class62.field1052[var7++] = var307.method118(var303, var304);
                            continue;
                        }
                        if (var475 == 4110) {
                            var8 -= 2;
                            class96 var308 = class211.field3634[var8];
                            class96 var309 = class211.field3634[var8 + 1];
                            var7--;
                            if (class62.field1052[var7] == 1) {
                                class211.field3634[var8++] = var308;
                            } else {
                                class211.field3634[var8++] = var309;
                            }
                            continue;
                        }
                        if (var475 == 4111) {
                            var8--;
                            class96 var310 = class211.field3634[var8];
                            class211.field3634[var8++] = class18.method139(var310);
                            continue;
                        }
                        if (var475 == 4112) {
                            var8--;
                            class96 var311 = class211.field3634[var8];
                            var7--;
                            int var312 = class62.field1052[var7];
                            if (var312 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class211.field3634[var8++] = var311.method698(var312, 86);
                            continue;
                        }
                        if (var475 == 4113) {
                            var7--;
                            int var313 = class62.field1052[var7];
                            class62.field1052[var7++] = class137.method1021((byte) -120, var313) ? 1 : 0;
                            continue;
                        }
                        if (var475 == 4114) {
                            var7--;
                            int var314 = class62.field1052[var7];
                            class62.field1052[var7++] = class85.method619(var314, 118) ? 1 : 0;
                            continue;
                        }
                        if (var475 == 4115) {
                            var7--;
                            int var315 = class62.field1052[var7];
                            class62.field1052[var7++] = class168.method1212(var315, 8764) ? 1 : 0;
                            continue;
                        }
                        if (var475 == 4116) {
                            var7--;
                            int var316 = class62.field1052[var7];
                            class62.field1052[var7++] = class176.method1262((byte) -109, var316) ? 1 : 0;
                            continue;
                        }
                        if (var475 == 4117) {
                            var8--;
                            class96 var317 = class211.field3634[var8];
                            if (var317 == null) {
                                class62.field1052[var7++] = 0;
                            } else {
                                class62.field1052[var7++] = var317.method707(-13);
                            }
                            continue;
                        }
                        if (var475 == 4118) {
                            var7 -= 2;
                            int var318 = class62.field1052[var7];
                            var8--;
                            class96 var319 = class211.field3634[var8];
                            int var320 = class62.field1052[var7 + 1];
                            class211.field3634[var8++] = var319.method716(var320, (byte) -13, var318);
                            continue;
                        }
                        if (var475 == 4119) {
                            var8--;
                            class96 var321 = class211.field3634[var8];
                            class96 var322 = class162.method1178(var321.method707(-11), 124);
                            boolean var323 = false;
                            for (int var324 = 0; var321.method707(-86) > var324; var324++) {
                                int var325 = var321.method687(var324, 0);
                                if (var325 == 60) {
                                    var323 = true;
                                } else if (var325 == 62) {
                                    var323 = false;
                                } else if (!var323) {
                                    var322.method721(var325, (byte) 127);
                                }
                            }
                            var322.method697(109);
                            class211.field3634[var8++] = var322;
                            continue;
                        }
                        if (var475 == 4120) {
                            var7 -= 2;
                            var8--;
                            class96 var326 = class211.field3634[var8];
                            int var327 = class62.field1052[var7];
                            int var328 = class62.field1052[var7 + 1];
                            class62.field1052[var7++] = var326.method713(var328, -18527, var327);
                            continue;
                        }
                        if (var475 == 4121) {
                            var8 -= 2;
                            class96 var329 = class211.field3634[var8];
                            var7--;
                            int var330 = class62.field1052[var7];
                            class96 var331 = class211.field3634[var8 + 1];
                            class62.field1052[var7++] = var329.method714(var331, var330, 1);
                            continue;
                        }
                        if (var475 == 4122) {
                            var7--;
                            int var332 = class62.field1052[var7];
                            class62.field1052[var7++] = class200.method1400(var332, true);
                            continue;
                        }
                        if (var475 == 4123) {
                            var7--;
                            int var333 = class62.field1052[var7];
                            class62.field1052[var7++] = class169.method1215((byte) 66, var333);
                            continue;
                        }
                    } else if (var475 < 4300) {
                        if (var475 == 4200) {
                            var7--;
                            int var263 = class62.field1052[var7];
                            class211.field3634[var8++] = class269.method1845(var263, (byte) 61).field2779;
                            continue;
                        }
                        if (var475 == 4201) {
                            var7 -= 2;
                            int var264 = class62.field1052[var7 + 1];
                            int var265 = class62.field1052[var7];
                            class159 var266 = class269.method1845(var265, (byte) 61);
                            if (var264 >= 1 && var264 <= 5 && var266.field2788[var264 - 1] != null) {
                                class211.field3634[var8++] = var266.field2788[var264 - 1];
                                continue;
                            }
                            class211.field3634[var8++] = class216.field3719;
                            continue;
                        }
                        if (var475 == 4202) {
                            var7 -= 2;
                            int var267 = class62.field1052[var7];
                            int var268 = class62.field1052[var7 + 1];
                            class159 var269 = class269.method1845(var267, (byte) 61);
                            if (var268 >= 1 && var268 <= 5 && var269.field2755[var268 - 1] != null) {
                                class211.field3634[var8++] = var269.field2755[var268 - 1];
                                continue;
                            }
                            class211.field3634[var8++] = class216.field3719;
                            continue;
                        }
                        if (var475 == 4203) {
                            var7--;
                            int var270 = class62.field1052[var7];
                            class62.field1052[var7++] = class269.method1845(var270, (byte) 61).field2758;
                            continue;
                        }
                        if (var475 == 4204) {
                            var7--;
                            int var271 = class62.field1052[var7];
                            class62.field1052[var7++] = class269.method1845(var271, (byte) 61).field2796 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var475 == 4205) {
                            var7--;
                            int var272 = class62.field1052[var7];
                            class159 var273 = class269.method1845(var272, (byte) 61);
                            if (var273.field2811 == -1 && var273.field2772 >= 0) {
                                class62.field1052[var7++] = var273.field2772;
                                continue;
                            }
                            class62.field1052[var7++] = var272;
                            continue;
                        }
                        if (var475 == 4206) {
                            var7--;
                            int var274 = class62.field1052[var7];
                            class159 var275 = class269.method1845(var274, (byte) 61);
                            if (var275.field2811 >= 0 && var275.field2772 >= 0) {
                                class62.field1052[var7++] = var275.field2772;
                                continue;
                            }
                            class62.field1052[var7++] = var274;
                            continue;
                        }
                        if (var475 == 4207) {
                            var7--;
                            int var276 = class62.field1052[var7];
                            class62.field1052[var7++] = class269.method1845(var276, (byte) 61).field2795 ? 1 : 0;
                            continue;
                        }
                        if (var475 == 4208) {
                            var7 -= 2;
                            int var277 = class62.field1052[var7];
                            int var278 = class62.field1052[var7 + 1];
                            class253 var279 = class119.method920((byte) -52, var278);
                            if (var279.method1759((byte) -67)) {
                                class211.field3634[var8++] = class269.method1845(var277, (byte) 61).method1148(var279.field4375, var278, 0);
                            } else {
                                class62.field1052[var7++] = class269.method1845(var277, (byte) 61).method1159(var279.field4370, var278, 62);
                            }
                            continue;
                        }
                        if (var475 == 4210) {
                            var8--;
                            class96 var280 = class211.field3634[var8];
                            var7--;
                            int var281 = class62.field1052[var7];
                            class235.method1594(true, var280, var281 == 1);
                            class62.field1052[var7++] = class91.field1515;
                            continue;
                        }
                        if (var475 == 4211) {
                            if (class274.field4785 != null && class91.field1515 > class256.field4454) {
                                class62.field1052[var7++] = class130.method985(65535, class274.field4785[class256.field4454++]);
                                continue;
                            }
                            class62.field1052[var7++] = -1;
                            continue;
                        }
                        if (var475 == 4212) {
                            class256.field4454 = 0;
                            continue;
                        }
                    } else if (var475 < 4400) {
                        if (var475 == 4300) {
                            var7 -= 2;
                            int var116 = class62.field1052[var7];
                            int var117 = class62.field1052[var7 + 1];
                            class253 var118 = class119.method920((byte) -52, var117);
                            if (var118.method1759((byte) -67)) {
                                class211.field3634[var8++] = class260.method1799(var116, (byte) -121).method1565(var118.field4375, var117, true);
                            } else {
                                class62.field1052[var7++] = class260.method1799(var116, (byte) -112).method1569(var117, var118.field4370, -108);
                            }
                            continue;
                        }
                        if (var475 == 4301) {
                            var7--;
                            int var119 = class62.field1052[var7];
                            class62.field1052[var7++] = class260.method1799(var119, (byte) -106).field3889;
                            continue;
                        }
                        if (var475 == 4302) {
                            var7--;
                            int var120 = class62.field1052[var7];
                            class62.field1052[var7++] = class260.method1799(var120, (byte) 70).field3937;
                            continue;
                        }
                        if (var475 == 4303) {
                            var7--;
                            int var121 = class62.field1052[var7];
                            class62.field1052[var7++] = class260.method1799(var121, (byte) -117).field3929;
                            continue;
                        }
                        if (var475 == 4304) {
                            var7--;
                            int var122 = class62.field1052[var7];
                            class62.field1052[var7++] = class260.method1799(var122, (byte) -113).field3895;
                            continue;
                        }
                        if (var475 == 4305) {
                            var7--;
                            int var123 = class62.field1052[var7];
                            class62.field1052[var7++] = class260.method1799(var123, (byte) 67).field3880;
                            continue;
                        }
                        if (var475 == 4306) {
                            var7--;
                            int var124 = class62.field1052[var7];
                            class62.field1052[var7++] = class260.method1799(var124, (byte) -119).field3898;
                            continue;
                        }
                        if (var475 == 4307) {
                            var7--;
                            int var125 = class62.field1052[var7];
                            class62.field1052[var7++] = class260.method1799(var125, (byte) -8).field3890;
                            continue;
                        }
                    } else if (var475 >= 4500) {
                        if (var475 >= 4600) {
                            if (var475 < 5100) {
                                if (var475 == 5000) {
                                    class62.field1052[var7++] = class106.field1774;
                                    continue;
                                }
                                if (var475 == 5001) {
                                    class132.field2362++;
                                    var7 -= 3;
                                    class106.field1774 = class62.field1052[var7];
                                    class90.field1499 = class62.field1052[var7 + 1];
                                    class276.field4796 = class62.field1052[var7 + 2];
                                    class140.field2505.method1012((byte) 72, 169);
                                    class140.field2505.method1652(class106.field1774, (byte) 41);
                                    class140.field2505.method1652(class90.field1499, (byte) 41);
                                    class140.field2505.method1652(class276.field4796, (byte) 41);
                                    continue;
                                }
                                if (var475 == 5002) {
                                    class15.field234++;
                                    var7 -= 2;
                                    int var192 = class62.field1052[var7 + 1];
                                    int var193 = class62.field1052[var7];
                                    var8--;
                                    class96 var194 = class211.field3634[var8];
                                    class140.field2505.method1012((byte) -28, 88);
                                    class140.field2505.method1668(var194.method685((byte) 124), -85);
                                    class140.field2505.method1652(var193 - 1, (byte) 41);
                                    class140.field2505.method1652(var192, (byte) 41);
                                    continue;
                                }
                                if (var475 == 5003) {
                                    class96 var195 = null;
                                    var7--;
                                    int var196 = class62.field1052[var7];
                                    if (var196 < 100) {
                                        var195 = class192.field3319[var196];
                                    }
                                    if (var195 == null) {
                                        var195 = class216.field3719;
                                    }
                                    class211.field3634[var8++] = var195;
                                    continue;
                                }
                                if (var475 == 5004) {
                                    var7--;
                                    int var197 = class62.field1052[var7];
                                    int var198 = -1;
                                    if (var197 < 100 && class192.field3319[var197] != null) {
                                        var198 = class91.field1508[var197];
                                    }
                                    class62.field1052[var7++] = var198;
                                    continue;
                                }
                                if (var475 == 5005) {
                                    class62.field1052[var7++] = class90.field1499;
                                    continue;
                                }
                                if (var475 == 5008) {
                                    var8--;
                                    class96 var199 = class211.field3634[var8];
                                    if (var199.method703(0, class119.field2216)) {
                                        class265.method1826((byte) -124, var199);
                                        continue;
                                    }
                                    if (class254.field4389 == 0 && (class31.field487 && !class265.field4625 || class74.field1277)) {
                                        continue;
                                    }
                                    class95.field1566++;
                                    class96 var200 = var199.method702(126);
                                    byte var201 = 0;
                                    if (var200.method703(0, class175.field3038)) {
                                        var199 = var199.method710(121, class175.field3038.method707(-110));
                                        var201 = 0;
                                    } else if (var200.method703(0, class70.field1203)) {
                                        var201 = 1;
                                        var199 = var199.method710(114, class70.field1203.method707(-52));
                                    } else if (var200.method703(0, class3.field66)) {
                                        var199 = var199.method710(111, class3.field66.method707(-40));
                                        var201 = 2;
                                    } else if (var200.method703(0, class171.field3006)) {
                                        var201 = 3;
                                        var199 = var199.method710(119, class171.field3006.method707(-35));
                                    } else if (var200.method703(0, class212.field3664)) {
                                        var199 = var199.method710(121, class212.field3664.method707(-57));
                                        var201 = 4;
                                    } else if (var200.method703(0, class118.field2181)) {
                                        var201 = 5;
                                        var199 = var199.method710(125, class118.field2181.method707(-117));
                                    } else if (var200.method703(0, class34.field603)) {
                                        var199 = var199.method710(112, class34.field603.method707(-22));
                                        var201 = 6;
                                    } else if (var200.method703(0, class77.field1320)) {
                                        var199 = var199.method710(111, class77.field1320.method707(-53));
                                        var201 = 7;
                                    } else if (var200.method703(0, class130.field2348)) {
                                        var201 = 8;
                                        var199 = var199.method710(115, class130.field2348.method707(-60));
                                    } else if (var200.method703(0, class247.field4286)) {
                                        var199 = var199.method710(110, class247.field4286.method707(-87));
                                        var201 = 9;
                                    } else if (var200.method703(0, class145.field2578)) {
                                        var201 = 10;
                                        var199 = var199.method710(123, class145.field2578.method707(-122));
                                    } else if (var200.method703(0, class85.field1430)) {
                                        var201 = 11;
                                        var199 = var199.method710(114, class85.field1430.method707(-84));
                                    } else if (class156.field2722 != 0) {
                                        if (var200.method703(0, class175.field3042)) {
                                            var199 = var199.method710(125, class175.field3042.method707(-14));
                                            var201 = 0;
                                        } else if (var200.method703(0, class70.field1210)) {
                                            var201 = 1;
                                            var199 = var199.method710(118, class70.field1210.method707(-83));
                                        } else if (var200.method703(0, class3.field59)) {
                                            var201 = 2;
                                            var199 = var199.method710(121, class3.field59.method707(-10));
                                        } else if (var200.method703(0, class171.field2997)) {
                                            var201 = 3;
                                            var199 = var199.method710(118, class171.field2997.method707(-49));
                                        } else if (var200.method703(0, class212.field3656)) {
                                            var201 = 4;
                                            var199 = var199.method710(120, class212.field3656.method707(-101));
                                        } else if (var200.method703(0, class118.field2193)) {
                                            var201 = 5;
                                            var199 = var199.method710(120, class118.field2193.method707(-2));
                                        } else if (var200.method703(0, class34.field601)) {
                                            var199 = var199.method710(123, class34.field601.method707(-123));
                                            var201 = 6;
                                        } else if (var200.method703(0, class77.field1313)) {
                                            var199 = var199.method710(119, class77.field1313.method707(-63));
                                            var201 = 7;
                                        } else if (var200.method703(0, class130.field2350)) {
                                            var199 = var199.method710(112, class130.field2350.method707(-92));
                                            var201 = 8;
                                        } else if (var200.method703(0, class247.field4283)) {
                                            var199 = var199.method710(123, class247.field4283.method707(-102));
                                            var201 = 9;
                                        } else if (var200.method703(0, class145.field2576)) {
                                            var199 = var199.method710(126, class145.field2576.method707(-38));
                                            var201 = 10;
                                        } else if (var200.method703(0, class85.field1445)) {
                                            var199 = var199.method710(118, class85.field1445.method707(-104));
                                            var201 = 11;
                                        }
                                    }
                                    class96 var202 = var199.method702(127);
                                    byte var203 = 0;
                                    if (var202.method703(0, class244.field4244)) {
                                        var199 = var199.method710(126, class244.field4244.method707(-90));
                                        var203 = 1;
                                    } else if (var202.method703(0, class10.field177)) {
                                        var203 = 2;
                                        var199 = var199.method710(123, class10.field177.method707(-107));
                                    } else if (var202.method703(0, class3.field35)) {
                                        var199 = var199.method710(125, class3.field35.method707(-122));
                                        var203 = 3;
                                    } else if (var202.method703(0, class169.field2978)) {
                                        var199 = var199.method710(125, class169.field2978.method707(-36));
                                        var203 = 4;
                                    } else if (var202.method703(0, class224.field3802)) {
                                        var199 = var199.method710(117, class224.field3802.method707(-2));
                                        var203 = 5;
                                    } else if (class156.field2722 != 0) {
                                        if (var202.method703(0, class244.field4236)) {
                                            var203 = 1;
                                            var199 = var199.method710(122, class244.field4236.method707(-118));
                                        } else if (var202.method703(0, class10.field173)) {
                                            var203 = 2;
                                            var199 = var199.method710(123, class10.field173.method707(-6));
                                        } else if (var202.method703(0, class3.field27)) {
                                            var203 = 3;
                                            var199 = var199.method710(112, class3.field27.method707(-18));
                                        } else if (var202.method703(0, class169.field2965)) {
                                            var199 = var199.method710(117, class169.field2965.method707(-58));
                                            var203 = 4;
                                        } else if (var202.method703(0, class224.field3807)) {
                                            var203 = 5;
                                            var199 = var199.method710(125, class224.field3807.method707(-30));
                                        }
                                    }
                                    class140.field2505.method1012((byte) -125, 20);
                                    class140.field2505.method1652(0, (byte) 41);
                                    int var204 = class140.field2505.field4124;
                                    class140.field2505.method1652(var201, (byte) 41);
                                    class140.field2505.method1652(var203, (byte) 41);
                                    class20.method145(class140.field2505, 0, var199);
                                    class140.field2505.method1665(class140.field2505.field4124 - var204, -98);
                                    continue;
                                }
                                if (var475 == 5009) {
                                    var8 -= 2;
                                    class96 var205 = class211.field3634[var8];
                                    class96 var206 = class211.field3634[var8 + 1];
                                    if (class254.field4389 != 0 || (!class31.field487 || class265.field4625) && !class74.field1277) {
                                        class140.field2505.method1012((byte) -120, 134);
                                        class140.field2505.method1652(0, (byte) 41);
                                        class5.field97++;
                                        int var207 = class140.field2505.field4124;
                                        class140.field2505.method1668(var205.method685((byte) 117), -114);
                                        class20.method145(class140.field2505, 0, var206);
                                        class140.field2505.method1665(class140.field2505.field4124 - var207, -128);
                                    }
                                    continue;
                                }
                                if (var475 == 5010) {
                                    class96 var208 = null;
                                    var7--;
                                    int var209 = class62.field1052[var7];
                                    if (var209 < 100) {
                                        var208 = class83.field1416[var209];
                                    }
                                    if (var208 == null) {
                                        var208 = class216.field3719;
                                    }
                                    class211.field3634[var8++] = var208;
                                    continue;
                                }
                                if (var475 == 5011) {
                                    var7--;
                                    int var210 = class62.field1052[var7];
                                    class96 var211 = null;
                                    if (var210 < 100) {
                                        var211 = class197.field3437[var210];
                                    }
                                    if (var211 == null) {
                                        var211 = class216.field3719;
                                    }
                                    class211.field3634[var8++] = var211;
                                    continue;
                                }
                                if (var475 == 5012) {
                                    var7--;
                                    int var212 = class62.field1052[var7];
                                    int var213 = -1;
                                    if (var212 < 100) {
                                        var213 = class98.field1673[var212];
                                    }
                                    class62.field1052[var7++] = var213;
                                    continue;
                                }
                                if (var475 == 5015) {
                                    class96 var214;
                                    if (class236.field4047 == null || class236.field4047.field828 == null) {
                                        var214 = class120.field2221;
                                    } else {
                                        var214 = class236.field4047.method365(-112);
                                    }
                                    class211.field3634[var8++] = var214;
                                    continue;
                                }
                                if (var475 == 5016) {
                                    class62.field1052[var7++] = class276.field4796;
                                    continue;
                                }
                                if (var475 == 5017) {
                                    class62.field1052[var7++] = class57.field1009;
                                    continue;
                                }
                                if (var475 == 5050) {
                                    var7--;
                                    int var215 = class62.field1052[var7];
                                    class211.field3634[var8++] = class234.method1588((byte) 113, var215).field4199;
                                    continue;
                                }
                                if (var475 == 5051) {
                                    var7--;
                                    int var216 = class62.field1052[var7];
                                    class242 var217 = class234.method1588((byte) 115, var216);
                                    if (var217.field4196 == null) {
                                        class62.field1052[var7++] = 0;
                                    } else {
                                        class62.field1052[var7++] = var217.field4196.length;
                                    }
                                    continue;
                                }
                                if (var475 == 5052) {
                                    var7 -= 2;
                                    int var218 = class62.field1052[var7];
                                    int var219 = class62.field1052[var7 + 1];
                                    class242 var220 = class234.method1588((byte) 119, var218);
                                    int var221 = var220.field4196[var219];
                                    class62.field1052[var7++] = var221;
                                    continue;
                                }
                                if (var475 == 5053) {
                                    var7--;
                                    int var222 = class62.field1052[var7];
                                    class242 var223 = class234.method1588((byte) 122, var222);
                                    if (var223.field4204 == null) {
                                        class62.field1052[var7++] = 0;
                                    } else {
                                        class62.field1052[var7++] = var223.field4204.length;
                                    }
                                    continue;
                                }
                                if (var475 == 5054) {
                                    var7 -= 2;
                                    int var224 = class62.field1052[var7];
                                    int var225 = class62.field1052[var7 + 1];
                                    class62.field1052[var7++] = class234.method1588((byte) 115, var224).field4204[var225];
                                    continue;
                                }
                                if (var475 == 5055) {
                                    var7--;
                                    int var226 = class62.field1052[var7];
                                    class211.field3634[var8++] = class11.method89(var226, false).method1455(21);
                                    continue;
                                }
                                if (var475 == 5056) {
                                    var7--;
                                    int var227 = class62.field1052[var7];
                                    class208 var228 = class11.method89(var227, false);
                                    if (var228.field3589 == null) {
                                        class62.field1052[var7++] = 0;
                                    } else {
                                        class62.field1052[var7++] = var228.field3589.length;
                                    }
                                    continue;
                                }
                                if (var475 == 5057) {
                                    var7 -= 2;
                                    int var229 = class62.field1052[var7];
                                    int var230 = class62.field1052[var7 + 1];
                                    class62.field1052[var7++] = class11.method89(var229, false).field3589[var230];
                                    continue;
                                }
                                if (var475 == 5058) {
                                    class85.field1433 = new class267();
                                    var7--;
                                    class85.field1433.field4650 = class62.field1052[var7];
                                    class85.field1433.field4653 = class11.method89(class85.field1433.field4650, false);
                                    class85.field1433.field4652 = new int[class85.field1433.field4653.method1451(-95)];
                                    continue;
                                }
                                if (var475 == 5059) {
                                    class140.field2505.method1012((byte) -124, 104);
                                    class140.field2505.method1652(0, (byte) 41);
                                    int var231 = class140.field2505.field4124;
                                    class225.field3831++;
                                    class140.field2505.method1652(0, (byte) 41);
                                    class140.field2505.method1632(true, class85.field1433.field4650);
                                    class85.field1433.field4653.method1448(class140.field2505, class85.field1433.field4652, (byte) -107);
                                    class140.field2505.method1665(class140.field2505.field4124 - var231, -123);
                                    continue;
                                }
                                if (var475 == 5060) {
                                    var8--;
                                    class96 var232 = class211.field3634[var8];
                                    class128.field2341++;
                                    class140.field2505.method1012((byte) 118, 220);
                                    class140.field2505.method1652(0, (byte) 41);
                                    int var233 = class140.field2505.field4124;
                                    class140.field2505.method1668(var232.method685((byte) 123), -13);
                                    class140.field2505.method1632(true, class85.field1433.field4650);
                                    class85.field1433.field4653.method1448(class140.field2505, class85.field1433.field4652, (byte) -107);
                                    class140.field2505.method1665(class140.field2505.field4124 - var233, -125);
                                    continue;
                                }
                                if (var475 == 5061) {
                                    class225.field3831++;
                                    class140.field2505.method1012((byte) 88, 104);
                                    class140.field2505.method1652(0, (byte) 41);
                                    int var234 = class140.field2505.field4124;
                                    class140.field2505.method1652(1, (byte) 41);
                                    class140.field2505.method1632(true, class85.field1433.field4650);
                                    class85.field1433.field4653.method1448(class140.field2505, class85.field1433.field4652, (byte) -107);
                                    class140.field2505.method1665(class140.field2505.field4124 - var234, -113);
                                    continue;
                                }
                                if (var475 == 5062) {
                                    var7 -= 2;
                                    int var235 = class62.field1052[var7];
                                    int var236 = class62.field1052[var7 + 1];
                                    class62.field1052[var7++] = class234.method1588((byte) 121, var235).field4198[var236];
                                    continue;
                                }
                                if (var475 == 5063) {
                                    var7 -= 2;
                                    int var237 = class62.field1052[var7 + 1];
                                    int var238 = class62.field1052[var7];
                                    class62.field1052[var7++] = class234.method1588((byte) 113, var238).field4200[var237];
                                    continue;
                                }
                                if (var475 == 5064) {
                                    var7 -= 2;
                                    int var239 = class62.field1052[var7];
                                    int var240 = class62.field1052[var7 + 1];
                                    if (var240 == -1) {
                                        class62.field1052[var7++] = -1;
                                    } else {
                                        class62.field1052[var7++] = class234.method1588((byte) 124, var239).method1700(32768, var240);
                                    }
                                    continue;
                                }
                                if (var475 == 5065) {
                                    var7 -= 2;
                                    int var241 = class62.field1052[var7];
                                    int var242 = class62.field1052[var7 + 1];
                                    if (var242 == -1) {
                                        class62.field1052[var7++] = -1;
                                    } else {
                                        class62.field1052[var7++] = class234.method1588((byte) 126, var241).method1699(var242, -1);
                                    }
                                    continue;
                                }
                                if (var475 == 5066) {
                                    var7--;
                                    int var243 = class62.field1052[var7];
                                    class62.field1052[var7++] = class11.method89(var243, false).method1451(-101);
                                    continue;
                                }
                                if (var475 == 5067) {
                                    var7 -= 2;
                                    int var244 = class62.field1052[var7];
                                    int var245 = class62.field1052[var7 + 1];
                                    int var246 = class11.method89(var244, false).method1446((byte) 42, var245);
                                    class62.field1052[var7++] = var246;
                                    continue;
                                }
                                if (var475 == 5068) {
                                    var7 -= 2;
                                    int var247 = class62.field1052[var7];
                                    int var248 = class62.field1052[var7 + 1];
                                    class85.field1433.field4652[var247] = var248;
                                    continue;
                                }
                                if (var475 == 5069) {
                                    var7 -= 2;
                                    int var249 = class62.field1052[var7];
                                    int var250 = class62.field1052[var7 + 1];
                                    class85.field1433.field4652[var249] = var250;
                                    continue;
                                }
                                if (var475 == 5070) {
                                    var7 -= 3;
                                    int var251 = class62.field1052[var7];
                                    int var252 = class62.field1052[var7 + 1];
                                    int var253 = class62.field1052[var7 + 2];
                                    class208 var254 = class11.method89(var251, false);
                                    if (var254.method1446((byte) 60, var252) != 0) {
                                        throw new RuntimeException("bad command");
                                    }
                                    class62.field1052[var7++] = var254.method1453(var252, 88, var253);
                                    continue;
                                }
                                if (var475 == 5071) {
                                    var8--;
                                    class96 var255 = class211.field3634[var8];
                                    var7--;
                                    boolean var256 = class62.field1052[var7] == 1;
                                    class159.method1145(var256, -8, var255);
                                    class62.field1052[var7++] = class91.field1515;
                                    continue;
                                }
                                if (var475 == 5072) {
                                    if (class274.field4785 != null && class91.field1515 > class256.field4454) {
                                        class62.field1052[var7++] = class130.method985(class274.field4785[class256.field4454++], 65535);
                                        continue;
                                    }
                                    class62.field1052[var7++] = -1;
                                    continue;
                                }
                                if (var475 == 5073) {
                                    class256.field4454 = 0;
                                    continue;
                                }
                            } else if (var475 < 5200) {
                                if (var475 == 5100) {
                                    if (class233.field3990[86]) {
                                        class62.field1052[var7++] = 1;
                                    } else {
                                        class62.field1052[var7++] = 0;
                                    }
                                    continue;
                                }
                                if (var475 == 5101) {
                                    if (class233.field3990[82]) {
                                        class62.field1052[var7++] = 1;
                                    } else {
                                        class62.field1052[var7++] = 0;
                                    }
                                    continue;
                                }
                                if (var475 == 5102) {
                                    if (class233.field3990[81]) {
                                        class62.field1052[var7++] = 1;
                                    } else {
                                        class62.field1052[var7++] = 0;
                                    }
                                    continue;
                                }
                            } else if (var475 < 5300) {
                                if (var475 == 5200) {
                                    var7--;
                                    class224.method1532(class62.field1052[var7], true);
                                    continue;
                                }
                                if (var475 == 5201) {
                                    class62.field1052[var7++] = class149.method1095((byte) 127);
                                    continue;
                                }
                                if (var475 == 5202) {
                                    var7--;
                                    class109.method835(class62.field1052[var7], (byte) 89);
                                    continue;
                                }
                                if (var475 == 5203) {
                                    var8--;
                                    class116.method914(class211.field3634[var8], (byte) -128);
                                    continue;
                                }
                                if (var475 == 5204) {
                                    class211.field3634[var8 - 1] = class157.method1143(16, class211.field3634[var8 - 1]);
                                    continue;
                                }
                                if (var475 == 5205) {
                                    var8--;
                                    class1.method2(22050, class211.field3634[var8]);
                                    continue;
                                }
                                if (var475 == 5206) {
                                    var7--;
                                    int var126 = class62.field1052[var7];
                                    class265 var127 = class68.method475(var126 & 0x3FFF, (var126 & 0xFFFD13F) >> 14, 6551);
                                    if (var127 == null) {
                                        class211.field3634[var8++] = class216.field3719;
                                    } else {
                                        class211.field3634[var8++] = var127.field4623;
                                    }
                                    continue;
                                }
                                if (var475 == 5207) {
                                    var8--;
                                    class265 var128 = class75.method547(class211.field3634[var8], (byte) -52);
                                    if (var128 != null && var128.field4622 != null) {
                                        class211.field3634[var8++] = var128.field4622;
                                        continue;
                                    }
                                    class211.field3634[var8++] = class216.field3719;
                                    continue;
                                }
                            } else if (var475 < 5400) {
                                if (var475 == 5300) {
                                    var7 -= 2;
                                    class62.field1052[var7++] = 0;
                                    continue;
                                }
                                if (var475 == 5301) {
                                    continue;
                                }
                                if (var475 == 5302) {
                                    class62.field1052[var7++] = 0;
                                    continue;
                                }
                                if (var475 == 5303) {
                                    var7--;
                                    class62.field1052[var7++] = 0;
                                    class62.field1052[var7++] = 0;
                                    continue;
                                }
                                if (var475 == 5305) {
                                    byte var129 = -1;
                                    class62.field1052[var7++] = var129;
                                    continue;
                                }
                                if (var475 == 5306) {
                                    class62.field1052[var7++] = class159.method1157(-1);
                                    continue;
                                }
                                if (var475 == 5307) {
                                    var7--;
                                    int var130 = class62.field1052[var7];
                                    if (var130 < 0 || var130 > 2) {
                                        var130 = 0;
                                    }
                                    class40.method315(-1, false, -1, var130, -108);
                                    continue;
                                }
                                if (var475 == 5308) {
                                    class62.field1052[var7++] = class256.field4461;
                                    continue;
                                }
                                if (var475 == 5309) {
                                    var7--;
                                    int var131 = class62.field1052[var7];
                                    if (var131 < 0 || var131 > 2) {
                                        var131 = 0;
                                    }
                                    class256.field4461 = var131;
                                    class95.method670((byte) -87, class234.field4017);
                                    continue;
                                }
                            } else if (var475 < 5500) {
                                if (var475 == 5400) {
                                    var8 -= 2;
                                    class96 var132 = class211.field3634[var8];
                                    class159.field2765++;
                                    var7--;
                                    int var133 = class62.field1052[var7];
                                    class96 var134 = class211.field3634[var8 + 1];
                                    class140.field2505.method1012((byte) -13, 155);
                                    class140.field2505.method1652(class154.method1126(var132, (byte) 0) + class154.method1126(var134, (byte) 0) + 1, (byte) 41);
                                    class140.field2505.method1644(var132, -96);
                                    class140.field2505.method1644(var134, -68);
                                    class140.field2505.method1652(var133, (byte) 41);
                                    continue;
                                }
                                if (var475 == 5401) {
                                    var7 -= 2;
                                    class93.field1535[class62.field1052[var7]] = (short) class82.method579(class62.field1052[var7 + 1], (byte) 93);
                                    class200.method1398(0);
                                    class64.method452(-125);
                                    class250.method1745((byte) -105);
                                    class10.method79(false);
                                    class202.method1414(5951);
                                    continue;
                                }
                                if (var475 == 5405) {
                                    var7 -= 2;
                                    int var135 = class62.field1052[var7 + 1];
                                    int var136 = class62.field1052[var7];
                                    if (var136 >= 0 && var136 < 2) {
                                        class189.field3300[var136] = new int[var135 << 1][4];
                                    }
                                    continue;
                                }
                                if (var475 == 5406) {
                                    var7 -= 7;
                                    int var137 = class62.field1052[var7 + 1] << 1;
                                    int var138 = class62.field1052[var7];
                                    int var139 = class62.field1052[var7 + 2];
                                    int var140 = class62.field1052[var7 + 4];
                                    int var141 = class62.field1052[var7 + 3];
                                    int var142 = class62.field1052[var7 + 6];
                                    int var143 = class62.field1052[var7 + 5];
                                    if (var138 >= 0 && var138 < 2 && class189.field3300[var138] != null && var137 >= 0 && class189.field3300[var138].length > var137) {
                                        class189.field3300[var138][var137] = new int[] { (class130.method985(268434137, var139) >> 14) * 128, var141, class130.method985(var139, 16383) * 128, var142 };
                                        class189.field3300[var138][var137 + 1] = new int[] { class130.method985(var140 >> 14, 16383) * 128, var143, class130.method985(var140, 16383) * 128 };
                                    }
                                    continue;
                                }
                                if (var475 == 5407) {
                                    var7--;
                                    int var144 = class189.field3300[class62.field1052[var7]].length >> 1;
                                    class62.field1052[var7++] = var144;
                                    continue;
                                }
                                if (var475 == 5411) {
                                    if (class103.field1743 == null) {
                                        class76.method552(false, (byte) -104, class227.method1547(0));
                                    } else {
                                        System.exit(0);
                                    }
                                    continue;
                                }
                                if (var475 == 5419) {
                                    class96 var145 = class216.field3719;
                                    if (class92.field1519 != null) {
                                        var145 = class58.method427((byte) -99, class92.field1519.field4602);
                                        try {
                                            if (class92.field1519.field4604 != null) {
                                                byte[] var146 = ((String) class92.field1519.field4604).getBytes("ISO-8859-1");
                                                var145 = class154.method1131(97, var146, 0, var146.length);
                                            }
                                        } catch (UnsupportedEncodingException var473) {
                                        }
                                    }
                                    class211.field3634[var8++] = var145;
                                    continue;
                                }
                                if (var475 == 5420) {
                                    class62.field1052[var7++] = class123.field2288 == 3 ? 1 : 0;
                                    continue;
                                }
                                if (var475 == 5421) {
                                    var8--;
                                    class96 var147 = class211.field3634[var8];
                                    var7--;
                                    boolean var148 = class62.field1052[var7] == 1;
                                    class96 var149 = class36.method289(-5615, new class96[] { class227.method1547(0), var147 });
                                    if (class103.field1743 != null || var148 && class123.field2288 != 3 && class123.field2273.startsWith("win") && !class207.field3576) {
                                        class22.field385 = var148;
                                        class122.field2247 = var149;
                                        class236.field4038 = class234.field4017.method940(new String(var149.method709(-90), "ISO-8859-1"), 0);
                                        continue;
                                    }
                                    class76.method552(var148, (byte) -108, var149);
                                    continue;
                                }
                                if (var475 == 5422) {
                                    var8 -= 2;
                                    class96 var150 = class211.field3634[var8];
                                    class96 var151 = class211.field3634[var8 + 1];
                                    var7--;
                                    int var152 = class62.field1052[var7];
                                    if (var150.method707(-34) > 0) {
                                        if (class50.field878 == null) {
                                            class50.field878 = new class96[class206.field3540[class239.field4097]];
                                        }
                                        class50.field878[var152] = var150;
                                    }
                                    if (var151.method707(-9) > 0) {
                                        if (class106.field1782 == null) {
                                            class106.field1782 = new class96[class206.field3540[class239.field4097]];
                                        }
                                        class106.field1782[var152] = var151;
                                    }
                                    continue;
                                }
                                if (var475 == 5423) {
                                    var8--;
                                    class211.field3634[var8].method686(true);
                                    continue;
                                }
                            } else if (var475 < 5600) {
                                if (var475 == 5500) {
                                    var7 -= 4;
                                    int var153 = class62.field1052[var7];
                                    int var154 = class62.field1052[var7 + 1];
                                    int var155 = class62.field1052[var7 + 2];
                                    int var156 = class62.field1052[var7 + 3];
                                    class85.method618((var153 & 0x3FFF) - class225.field3832, false, var154, (var153 >> 14 & 0x3FFF) - class196.field3383, var155, var156, (byte) 121);
                                    continue;
                                }
                                if (var475 == 5501) {
                                    var7 -= 4;
                                    int var157 = class62.field1052[var7 + 2];
                                    int var158 = class62.field1052[var7 + 3];
                                    int var159 = class62.field1052[var7 + 1];
                                    int var160 = class62.field1052[var7];
                                    class143.method1062((var160 & 0x3FFF) - class225.field3832, (var160 >> 14 & 0x3FFF) + -class196.field3383, var157, 1557, var158, var159);
                                    continue;
                                }
                                if (var475 == 5502) {
                                    var7 -= 6;
                                    int var161 = class62.field1052[var7];
                                    if (var161 >= 2) {
                                        throw new RuntimeException();
                                    }
                                    class244.field4243 = var161;
                                    int var162 = class62.field1052[var7 + 1];
                                    if ((class189.field3300[class244.field4243].length >> 1) <= (var162 + 1)) {
                                        throw new RuntimeException();
                                    }
                                    class7.field133 = 0;
                                    class9.field143 = var162;
                                    class136.field2438 = class62.field1052[var7 + 2];
                                    class206.field3543 = class62.field1052[var7 + 3];
                                    int var163 = class62.field1052[var7 + 4];
                                    if (var163 >= 2) {
                                        throw new RuntimeException();
                                    }
                                    class270.field4711 = var163;
                                    int var164 = class62.field1052[var7 + 5];
                                    if ((class189.field3300[class270.field4711].length >> 1) <= (var164 + 1)) {
                                        throw new RuntimeException();
                                    }
                                    class179.field3095 = 3;
                                    class237.field4074 = var164;
                                    continue;
                                }
                                if (var475 == 5503) {
                                    class15.method110(125);
                                    continue;
                                }
                                if (var475 == 5504) {
                                    var7 -= 2;
                                    class117.field2170 = class62.field1052[var7];
                                    class235.field4033 = class62.field1052[var7 + 1];
                                    class54.method407(123);
                                    continue;
                                }
                                if (var475 == 5505) {
                                    class62.field1052[var7++] = class117.field2170;
                                    continue;
                                }
                                if (var475 == 5506) {
                                    class62.field1052[var7++] = class235.field4033;
                                    continue;
                                }
                            } else if (var475 < 5700) {
                                if (var475 == 5600) {
                                    var8 -= 2;
                                    var7--;
                                    int var188 = class62.field1052[var7];
                                    class96 var189 = class211.field3634[var8];
                                    class96 var190 = class211.field3634[var8 + 1];
                                    if (class101.field1729 == 10 && class6.field129 == 0 && class203.field3517 == 0 && class106.field1800 == 0 && class235.field4021 == 0) {
                                        class226.method1541(var188, var189, false, var190);
                                    }
                                    continue;
                                }
                                if (var475 == 5601) {
                                    class213.method1479(true);
                                    continue;
                                }
                                if (var475 == 5602) {
                                    if (class203.field3517 == 0) {
                                        class25.field424 = -2;
                                    }
                                    continue;
                                }
                                if (var475 == 5603) {
                                    var7 -= 4;
                                    if (class101.field1729 == 10 && class6.field129 == 0 && class203.field3517 == 0 && class106.field1800 == 0 && class235.field4021 == 0) {
                                        client.method824(class62.field1052[var7 + 1], -121, class62.field1052[var7 + 2], class62.field1052[var7], class62.field1052[var7 + 3]);
                                    }
                                    continue;
                                }
                                if (var475 == 5604) {
                                    var8--;
                                    if (class101.field1729 == 10 && class6.field129 == 0 && class203.field3517 == 0 && class106.field1800 == 0 && class235.field4021 == 0) {
                                        class138.method1028(-32340, class211.field3634[var8].method685((byte) 124));
                                    }
                                    continue;
                                }
                                if (var475 == 5605) {
                                    var7 -= 4;
                                    var8 -= 2;
                                    if (class101.field1729 == 10 && class6.field129 == 0 && class203.field3517 == 0 && class106.field1800 == 0 && class235.field4021 == 0) {
                                        class154.method1128(class211.field3634[var8].method685((byte) -16), class62.field1052[var7], class62.field1052[var7 + 1], class62.field1052[var7 + 3], 19909, class211.field3634[var8 + 1], class62.field1052[var7 + 2]);
                                    }
                                    continue;
                                }
                                if (var475 == 5606) {
                                    if (class106.field1800 == 0) {
                                        class77.field1322 = -2;
                                    }
                                    continue;
                                }
                                if (var475 == 5607) {
                                    class62.field1052[var7++] = class25.field424;
                                    continue;
                                }
                                if (var475 == 5608) {
                                    class62.field1052[var7++] = class19.field301;
                                    continue;
                                }
                                if (var475 == 5609) {
                                    class62.field1052[var7++] = class77.field1322;
                                    continue;
                                }
                                if (var475 == 5610) {
                                    for (int var191 = 0; var191 < 5; var191++) {
                                        class211.field3634[var8++] = var191 >= class114.field2099.length ? class216.field3719 : class114.field2099[var191].method706((byte) 55);
                                    }
                                    class114.field2099 = null;
                                    continue;
                                }
                                if (var475 == 5611) {
                                    class62.field1052[var7++] = class141.field2519;
                                    continue;
                                }
                            } else if (var475 < 6100) {
                                if (var475 == 6001) {
                                    var7--;
                                    int var182 = class62.field1052[var7];
                                    if (var182 < 1) {
                                        var182 = 1;
                                    }
                                    if (var182 > 4) {
                                        var182 = 4;
                                    }
                                    class269.field4682 = var182;
                                    if (class269.field4682 == 1) {
                                        class240.method1683(0.9F);
                                    }
                                    if (class269.field4682 == 2) {
                                        class240.method1683(0.8F);
                                    }
                                    if (class269.field4682 == 3) {
                                        class240.method1683(0.7F);
                                    }
                                    if (class269.field4682 == 4) {
                                        class240.method1683(0.6F);
                                    }
                                    class64.method452(-128);
                                    class95.method670((byte) -98, class234.field4017);
                                    class169.field2977 = false;
                                    continue;
                                }
                                if (var475 == 6002) {
                                    var7--;
                                    class109.method837(class62.field1052[var7] == 1, 14459);
                                    class276.method1866(false);
                                    class239.method1647(-16777216);
                                    class180.method1276(-25210);
                                    class95.method670((byte) -117, class234.field4017);
                                    class169.field2977 = false;
                                    continue;
                                }
                                if (var475 == 6003) {
                                    var7--;
                                    class248.field4292 = class62.field1052[var7] == 1;
                                    class180.method1276(-25210);
                                    class95.method670((byte) -119, class234.field4017);
                                    class169.field2977 = false;
                                    continue;
                                }
                                if (var475 == 6005) {
                                    var7--;
                                    class89.field1478 = class62.field1052[var7] == 1;
                                    class239.method1647(-16777216);
                                    class95.method670((byte) -106, class234.field4017);
                                    class169.field2977 = false;
                                    continue;
                                }
                                if (var475 == 6006) {
                                    var7--;
                                    class237.field4073 = class62.field1052[var7] == 1;
                                    ((class114) class240.field4167).method892(0, !class237.field4073);
                                    class95.method670((byte) -103, class234.field4017);
                                    class169.field2977 = false;
                                    continue;
                                }
                                if (var475 == 6007) {
                                    var7--;
                                    class82.field1392 = class62.field1052[var7] == 1;
                                    class95.method670((byte) -127, class234.field4017);
                                    class169.field2977 = false;
                                    continue;
                                }
                                if (var475 == 6008) {
                                    var7--;
                                    class128.field2334 = class62.field1052[var7] == 1;
                                    class95.method670((byte) -86, class234.field4017);
                                    class169.field2977 = false;
                                    continue;
                                }
                                if (var475 == 6009) {
                                    var7--;
                                    class94.field1550 = class62.field1052[var7] == 1;
                                    class95.method670((byte) -123, class234.field4017);
                                    class169.field2977 = false;
                                    continue;
                                }
                                if (var475 == 6010) {
                                    var7--;
                                    class219.field3743 = class62.field1052[var7] == 1;
                                    class95.method670((byte) -109, class234.field4017);
                                    class169.field2977 = false;
                                    continue;
                                }
                                if (var475 == 6011) {
                                    var7--;
                                    int var183 = class62.field1052[var7];
                                    if (var183 < 0 || var183 > 2) {
                                        var183 = 0;
                                    }
                                    class148.field2620 = var183;
                                    class95.method670((byte) -113, class234.field4017);
                                    class169.field2977 = false;
                                    continue;
                                }
                                if (var475 == 6012) {
                                    var7--;
                                    class143.field2541 = class62.field1052[var7] == 1;
                                    if (class269.field4682 == 1) {
                                        class240.method1683(0.9F);
                                    }
                                    if (class269.field4682 == 2) {
                                        class240.method1683(0.8F);
                                    }
                                    if (class269.field4682 == 3) {
                                        class240.method1683(0.7F);
                                    }
                                    if (class269.field4682 == 4) {
                                        class240.method1683(0.6F);
                                    }
                                    class239.method1647(-16777216);
                                    class95.method670((byte) -97, class234.field4017);
                                    class169.field2977 = false;
                                    continue;
                                }
                                if (var475 == 6014) {
                                    var7--;
                                    class161.field2860 = class62.field1052[var7] == 1;
                                    class95.method670((byte) -125, class234.field4017);
                                    class169.field2977 = false;
                                    continue;
                                }
                                if (var475 == 6015) {
                                    var7--;
                                    class109.field2014 = class62.field1052[var7] == 1;
                                    class95.method670((byte) -117, class234.field4017);
                                    class169.field2977 = false;
                                    continue;
                                }
                                if (var475 == 6016) {
                                    var7--;
                                    int var184 = class62.field1052[var7];
                                    if (var184 < 0 || var184 > 2) {
                                        var184 = 0;
                                    }
                                    class22.field376 = var184;
                                    class95.method670((byte) -90, class234.field4017);
                                    class169.field2977 = false;
                                    continue;
                                }
                                if (var475 == 6017) {
                                    var7--;
                                    class22.field386 = class62.field1052[var7] == 1;
                                    class274.method1862(4527);
                                    class95.method670((byte) -104, class234.field4017);
                                    class169.field2977 = false;
                                    continue;
                                }
                                if (var475 == 6018) {
                                    var7--;
                                    int var185 = class62.field1052[var7];
                                    if (var185 < 0) {
                                        var185 = 0;
                                    }
                                    if (var185 > 127) {
                                        var185 = 127;
                                    }
                                    class233.field3999 = var185;
                                    class95.method670((byte) -86, class234.field4017);
                                    class169.field2977 = false;
                                    continue;
                                }
                                if (var475 == 6019) {
                                    var7--;
                                    int var186 = class62.field1052[var7];
                                    if (var186 < 0) {
                                        var186 = 0;
                                    }
                                    if (var186 > 255) {
                                        var186 = 255;
                                    }
                                    if (class92.field1525 != var186) {
                                        if (class92.field1525 == 0 && class163.field2897 != -1) {
                                            class68.method476(class163.field2897, var186, class181.field3155, false, 0, -95);
                                            class119.field2213 = false;
                                        } else if (var186 == 0) {
                                            class83.method582((byte) -119);
                                            class119.field2213 = false;
                                        } else {
                                            class122.method939((byte) 121, var186);
                                        }
                                        class92.field1525 = var186;
                                    }
                                    class95.method670((byte) -113, class234.field4017);
                                    class169.field2977 = false;
                                    continue;
                                }
                                if (var475 == 6020) {
                                    var7--;
                                    int var187 = class62.field1052[var7];
                                    if (var187 < 0) {
                                        var187 = 0;
                                    }
                                    if (var187 > 127) {
                                        var187 = 127;
                                    }
                                    class5.field100 = var187;
                                    class95.method670((byte) -121, class234.field4017);
                                    class169.field2977 = false;
                                    continue;
                                }
                                if (var475 == 6021) {
                                    var7--;
                                    class201.field3485 = class62.field1052[var7] == 1;
                                    class180.method1276(-25210);
                                    continue;
                                }
                            } else if (var475 < 6200) {
                                if (var475 == 6101) {
                                    class62.field1052[var7++] = class269.field4682;
                                    continue;
                                }
                                if (var475 == 6102) {
                                    class62.field1052[var7++] = class106.method786(82) ? 1 : 0;
                                    continue;
                                }
                                if (var475 == 6103) {
                                    class62.field1052[var7++] = class248.field4292 ? 1 : 0;
                                    continue;
                                }
                                if (var475 == 6105) {
                                    class62.field1052[var7++] = class89.field1478 ? 1 : 0;
                                    continue;
                                }
                                if (var475 == 6106) {
                                    class62.field1052[var7++] = class237.field4073 ? 1 : 0;
                                    continue;
                                }
                                if (var475 == 6107) {
                                    class62.field1052[var7++] = class82.field1392 ? 1 : 0;
                                    continue;
                                }
                                if (var475 == 6108) {
                                    class62.field1052[var7++] = class128.field2334 ? 1 : 0;
                                    continue;
                                }
                                if (var475 == 6109) {
                                    class62.field1052[var7++] = class94.field1550 ? 1 : 0;
                                    continue;
                                }
                                if (var475 == 6110) {
                                    class62.field1052[var7++] = class219.field3743 ? 1 : 0;
                                    continue;
                                }
                                if (var475 == 6111) {
                                    class62.field1052[var7++] = class148.field2620;
                                    continue;
                                }
                                if (var475 == 6112) {
                                    class62.field1052[var7++] = class143.field2541 ? 1 : 0;
                                    continue;
                                }
                                if (var475 == 6114) {
                                    class62.field1052[var7++] = class161.field2860 ? 1 : 0;
                                    continue;
                                }
                                if (var475 == 6115) {
                                    class62.field1052[var7++] = class109.field2014 ? 1 : 0;
                                    continue;
                                }
                                if (var475 == 6116) {
                                    class62.field1052[var7++] = class22.field376;
                                    continue;
                                }
                                if (var475 == 6117) {
                                    class62.field1052[var7++] = class22.field386 ? 1 : 0;
                                    continue;
                                }
                                if (var475 == 6118) {
                                    class62.field1052[var7++] = class233.field3999;
                                    continue;
                                }
                                if (var475 == 6119) {
                                    class62.field1052[var7++] = class92.field1525;
                                    continue;
                                }
                                if (var475 == 6120) {
                                    class62.field1052[var7++] = class5.field100;
                                    continue;
                                }
                                if (var475 == 6121) {
                                    class62.field1052[var7++] = 0;
                                    continue;
                                }
                            } else if (var475 < 6300) {
                                if (var475 == 6200) {
                                    var7 -= 2;
                                    class239.field4137 = (short) class62.field1052[var7];
                                    if (class239.field4137 <= 0) {
                                        class239.field4137 = 256;
                                    }
                                    class167.field2949 = (short) class62.field1052[var7 + 1];
                                    if (class167.field2949 <= 0) {
                                        class167.field2949 = 205;
                                    }
                                    continue;
                                }
                                if (var475 == 6201) {
                                    var7 -= 2;
                                    class169.field2971 = (short) class62.field1052[var7];
                                    if (class169.field2971 <= 0) {
                                        class169.field2971 = 256;
                                    }
                                    field3257 = (short) class62.field1052[var7 + 1];
                                    if (field3257 <= 0) {
                                        field3257 = 320;
                                    }
                                    continue;
                                }
                                if (var475 == 6202) {
                                    var7 -= 4;
                                    class60.field1033 = (short) class62.field1052[var7];
                                    if (class60.field1033 <= 0) {
                                        class60.field1033 = 1;
                                    }
                                    class74.field1280 = (short) class62.field1052[var7 + 1];
                                    if (class74.field1280 <= 0) {
                                        class74.field1280 = 32767;
                                    } else if (class74.field1280 < class60.field1033) {
                                        class74.field1280 = class60.field1033;
                                    }
                                    class224.field3816 = (short) class62.field1052[var7 + 2];
                                    if (class224.field3816 <= 0) {
                                        class224.field3816 = 1;
                                    }
                                    class60.field1034 = (short) class62.field1052[var7 + 3];
                                    if (class60.field1034 <= 0) {
                                        class60.field1034 = 32767;
                                    } else if (class60.field1034 < class224.field3816) {
                                        class60.field1034 = class224.field3816;
                                    }
                                    continue;
                                }
                                if (var475 == 6203) {
                                    class100.method763(0, class222.field3798.field1919, false, class222.field3798.field1856, 2, 0);
                                    class62.field1052[var7++] = class140.field2512;
                                    class62.field1052[var7++] = class139.field2488;
                                    continue;
                                }
                                if (var475 == 6204) {
                                    class62.field1052[var7++] = class169.field2971;
                                    class62.field1052[var7++] = field3257;
                                    continue;
                                }
                                if (var475 == 6205) {
                                    class62.field1052[var7++] = class239.field4137;
                                    class62.field1052[var7++] = class167.field2949;
                                    continue;
                                }
                            } else if (var475 < 6400) {
                                if (var475 == 6300) {
                                    class62.field1052[var7++] = (int) (class155.method1133(123) / 60000L);
                                    continue;
                                }
                                if (var475 == 6301) {
                                    class62.field1052[var7++] = (int) (class155.method1133(123) / 86400000L) - 11745;
                                    continue;
                                }
                                if (var475 == 6302) {
                                    var7 -= 3;
                                    int var165 = class62.field1052[var7];
                                    int var166 = class62.field1052[var7 + 1];
                                    int var167 = class62.field1052[var7 + 2];
                                    class64.field1099.clear();
                                    class64.field1099.set(11, 12);
                                    class64.field1099.set(var167, var166, var165);
                                    class62.field1052[var7++] = (int) (class64.field1099.getTime().getTime() / 86400000L) - 11745;
                                    continue;
                                }
                                if (var475 == 6303) {
                                    class64.field1099.clear();
                                    class64.field1099.setTime(new Date(class155.method1133(127)));
                                    class62.field1052[var7++] = class64.field1099.get(1);
                                    continue;
                                }
                                if (var475 == 6304) {
                                    boolean var168 = true;
                                    var7--;
                                    int var169 = class62.field1052[var7];
                                    if (var169 < 0) {
                                        var168 = ((var169 + 1) % 4) == 0;
                                    } else if (var169 < 1582) {
                                        var168 = (var169 % 4) == 0;
                                    } else if ((var169 % 4) != 0) {
                                        var168 = false;
                                    } else if ((var169 % 100) != 0) {
                                        var168 = true;
                                    } else if (var169 % 400 != 0) {
                                        var168 = false;
                                    }
                                    class62.field1052[var7++] = var168 ? 1 : 0;
                                    continue;
                                }
                            } else if (var475 < 6500) {
                                if (var475 == 6405) {
                                    class62.field1052[var7++] = class37.method292(0) ? 1 : 0;
                                    continue;
                                }
                                if (var475 == 6406) {
                                    class62.field1052[var7++] = class211.method1466(16741706) ? 1 : 0;
                                    continue;
                                }
                            } else if (var475 < 6600) {
                                if (var475 == 6500) {
                                    if (class101.field1729 == 10 && class6.field129 == 0 && class203.field3517 == 0 && class106.field1800 == 0) {
                                        class62.field1052[var7++] = class90.method641(-3) == -1 ? 0 : 1;
                                        continue;
                                    }
                                    class62.field1052[var7++] = 1;
                                    continue;
                                }
                                if (var475 == 6501) {
                                    class36 var170 = class100.method749(false);
                                    if (var170 == null) {
                                        class62.field1052[var7++] = -1;
                                        class62.field1052[var7++] = 0;
                                        class211.field3634[var8++] = class216.field3719;
                                        class62.field1052[var7++] = 0;
                                        class211.field3634[var8++] = class216.field3719;
                                        class62.field1052[var7++] = 0;
                                    } else {
                                        class62.field1052[var7++] = var170.field621;
                                        class62.field1052[var7++] = var170.field783;
                                        class211.field3634[var8++] = var170.field614;
                                        class258 var171 = var170.method288(0);
                                        class62.field1052[var7++] = var171.field4471;
                                        class211.field3634[var8++] = var171.field4472;
                                        class62.field1052[var7++] = var170.field772;
                                    }
                                    continue;
                                }
                                if (var475 == 6502) {
                                    class36 var172 = class162.method1175(-1);
                                    if (var172 == null) {
                                        class62.field1052[var7++] = -1;
                                        class62.field1052[var7++] = 0;
                                        class211.field3634[var8++] = class216.field3719;
                                        class62.field1052[var7++] = 0;
                                        class211.field3634[var8++] = class216.field3719;
                                        class62.field1052[var7++] = 0;
                                    } else {
                                        class62.field1052[var7++] = var172.field621;
                                        class62.field1052[var7++] = var172.field783;
                                        class211.field3634[var8++] = var172.field614;
                                        class258 var173 = var172.method288(0);
                                        class62.field1052[var7++] = var173.field4471;
                                        class211.field3634[var8++] = var173.field4472;
                                        class62.field1052[var7++] = var172.field772;
                                    }
                                    continue;
                                }
                                if (var475 == 6503) {
                                    var7--;
                                    int var174 = class62.field1052[var7];
                                    if (class101.field1729 == 10 && class6.field129 == 0 && class203.field3517 == 0 && class106.field1800 == 0) {
                                        class62.field1052[var7++] = class143.method1061(var174, 128) ? 1 : 0;
                                        continue;
                                    }
                                    class62.field1052[var7++] = 0;
                                    continue;
                                }
                                if (var475 == 6504) {
                                    var7--;
                                    class234.field4018 = class62.field1052[var7];
                                    class95.method670((byte) -114, class234.field4017);
                                    continue;
                                }
                                if (var475 == 6505) {
                                    class62.field1052[var7++] = class234.field4018;
                                    continue;
                                }
                                if (var475 == 6506) {
                                    var7--;
                                    int var175 = class62.field1052[var7];
                                    class36 var176 = class71.method486(var175, true);
                                    if (var176 == null) {
                                        class62.field1052[var7++] = -1;
                                        class211.field3634[var8++] = class216.field3719;
                                        class62.field1052[var7++] = 0;
                                        class211.field3634[var8++] = class216.field3719;
                                        class62.field1052[var7++] = 0;
                                    } else {
                                        class62.field1052[var7++] = var176.field783;
                                        class211.field3634[var8++] = var176.field614;
                                        class258 var177 = var176.method288(0);
                                        class62.field1052[var7++] = var177.field4471;
                                        class211.field3634[var8++] = var177.field4472;
                                        class62.field1052[var7++] = var176.field772;
                                    }
                                    continue;
                                }
                                if (var475 == 6507) {
                                    var7 -= 4;
                                    boolean var178 = class62.field1052[var7 + 1] == 1;
                                    int var179 = class62.field1052[var7 + 2];
                                    int var180 = class62.field1052[var7];
                                    boolean var181 = class62.field1052[var7 + 3] == 1;
                                    class128.method978(var178, var180, -29289, var179, var181);
                                    continue;
                                }
                            }
                        } else if (var475 == 4500) {
                            var7 -= 2;
                            int var257 = class62.field1052[var7];
                            int var258 = class62.field1052[var7 + 1];
                            class253 var259 = class119.method920((byte) -52, var258);
                            if (var259.method1759((byte) -67)) {
                                class211.field3634[var8++] = class243.method1709(var257, -13770).method838(var259.field4375, var258, 20090);
                            } else {
                                class62.field1052[var7++] = class243.method1709(var257, -13770).method836(var258, 0, var259.field4370);
                            }
                            continue;
                        }
                    } else if (var475 == 4400) {
                        var7 -= 2;
                        int var260 = class62.field1052[var7 + 1];
                        int var261 = class62.field1052[var7];
                        class253 var262 = class119.method920((byte) -52, var260);
                        if (var262.method1759((byte) -67)) {
                            class211.field3634[var8++] = class132.method995(var261, 0).method1378((byte) -111, var262.field4375, var260);
                        } else {
                            class62.field1052[var7++] = class132.method995(var261, 0).method1373(var260, var262.field4370, (byte) -27);
                        }
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var474) {
            if (var6.field3853 == null) {
                if (class44.field755 != 0) {
                    class226.method1540(class216.field3719, 0, (byte) -108, class32.field511);
                }
                client.method815("CS2 - scr:" + var6.field4304 + " op:" + var10, (byte) -112, var474);
            } else {
                class96 var470 = class162.method1178(30, 122);
                var470.method690(class230.field3955, 0).method690(var6.field3853, 0);
                for (int var471 = class260.field4519 - 1; var471 >= 0; var471--) {
                    var470.method690(class270.field4709, 0).method690(class10.field168[var471].field3701.field3853, 0);
                }
                if (var10 == 40) {
                    int var472 = var12[var9];
                    var470.method690(class235.field4023, 0).method690(class31.method205(var472, (byte) -78), 0);
                }
                if (class44.field755 != 0) {
                    class226.method1540(class216.field3719, 0, (byte) 109, class36.method289(-5615, new class96[] { class7.field140, var6.field3853 }));
                }
                client.method815("CS2 - scr:" + var6.field4304 + " op:" + var10 + new String(var470.method709(-128)), (byte) -98, var474);
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IILw;ZI)V")
    public static final void method1323(int arg0, int arg1, class107 arg2, boolean arg3, int arg4) {
        field3271++;
        int var5 = arg2.field1856;
        if (arg2.field1897 == 0) {
            arg2.field1856 = arg2.field1899;
        } else if (arg2.field1897 == 1) {
            arg2.field1856 = arg4 - arg2.field1899;
        } else if (arg2.field1897 == 2) {
            arg2.field1856 = arg2.field1899 * arg4 >> 14;
        } else if (arg2.field1897 == 3) {
            if (arg2.field1833 == 2) {
                arg2.field1856 = arg2.field1899 * 32 + ((arg2.field1899 - 1) * arg2.field1966);
            } else if (arg2.field1833 == 7) {
                arg2.field1856 = arg2.field1899 * 115 + ((arg2.field1899 - 1) * arg2.field1966);
            }
        }
        int var6 = arg2.field1919;
        if (arg2.field1951 == arg0) {
            arg2.field1919 = arg2.field1866;
        } else if (arg2.field1951 == 1) {
            arg2.field1919 = arg1 - arg2.field1866;
        } else if (arg2.field1951 == 2) {
            arg2.field1919 = arg2.field1866 * arg1 >> 14;
        } else if (arg2.field1951 == 3) {
            if (arg2.field1833 == 2) {
                arg2.field1919 = (arg2.field1866 - 1) * arg2.field1816 + arg2.field1866 * 32;
            } else if (arg2.field1833 == 7) {
                arg2.field1919 = arg2.field1866 * 12 + ((arg2.field1866 - 1) * arg2.field1816);
            }
        }
        if (arg2.field1897 == 4) {
            arg2.field1856 = arg2.field1948 * arg2.field1919 / arg2.field1950;
        }
        if (arg2.field1951 == 4) {
            arg2.field1919 = arg2.field1950 * arg2.field1856 / arg2.field1948;
        }
        if (class45.field784 && (client.method817(arg2) != 0 || arg2.field1833 == 0)) {
            if (arg2.field1919 < 5 && arg2.field1856 < 5) {
                arg2.field1919 = 5;
                arg2.field1856 = 5;
            } else {
                if (arg2.field1919 <= 0) {
                    arg2.field1919 = 5;
                }
                if (arg2.field1856 <= 0) {
                    arg2.field1856 = 5;
                }
            }
        }
        if (arg2.field1869 == 1337) {
            class222.field3798 = arg2;
        }
        if (arg3 && arg2.field1845 != null && arg2.field1856 != var5 || arg2.field1919 != var6) {
            class116 var7 = new class116();
            var7.field2158 = arg2;
            var7.field2155 = arg2.field1845;
            class47.field830.method1814(1, var7);
        }
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(III)V")
    public class187(int arg0, int arg1, int arg2) {
        this.field3284 = arg1;
        this.field3272 = arg2;
        this.field3277 = this.field3280 = arg0;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(BLmb;)Z")
    private static final boolean method1324(byte arg0, class96 arg1) {
        field3260++;
        if (arg1 == null) {
            return false;
        }
        if (arg0 != -90) {
            field3257 = -104;
        }
        for (int var2 = 0; var2 < class231.field3974; var2++) {
            if (arg1.method679(class106.field1804[var2], 18452)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(I)V")
    public static void method1325(int arg0) {
        field3262 = null;
        field3261 = null;
        if (arg0 != -1301) {
            field3257 = 52;
        }
    }
}
