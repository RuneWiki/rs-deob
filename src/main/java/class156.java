import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class156 {

    @OriginalMember(owner = "client!j", name = "i", descriptor = "Lmh;")
    private static class62 field2514 = class201.method1405(true, "Loaded input handler");

    @OriginalMember(owner = "client!j", name = "h", descriptor = "Lmh;")
    public static class62 field2513 = field2514;

    @OriginalMember(owner = "client!j", name = "f", descriptor = "Lmh;")
    public static class62 field2511 = class201.method1405(true, "welle:");

    @OriginalMember(owner = "client!j", name = "e", descriptor = "Lmh;")
    private static class62 field2510 = class201.method1405(true, "wishes to trade with you)3");

    @OriginalMember(owner = "client!j", name = "q", descriptor = "Lmh;")
    private static class62 field2522 = class201.method1405(true, "Members only world");

    @OriginalMember(owner = "client!j", name = "g", descriptor = "I")
    public static int field2512 = 0;

    @OriginalMember(owner = "client!j", name = "j", descriptor = "Lmh;")
    public static class62 field2515 = field2510;

    @OriginalMember(owner = "client!j", name = "o", descriptor = "Lmh;")
    public static class62 field2520 = field2522;

    @OriginalMember(owner = "client!j", name = "n", descriptor = "I")
    public static int field2519 = 0;

    @OriginalMember(owner = "client!j", name = "r", descriptor = "I")
    public static int field2523 = -1;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "I")
    public int field2506;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!j", name = "k", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!j", name = "l", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!j", name = "m", descriptor = "I")
    public int field2518;

    @OriginalMember(owner = "client!j", name = "p", descriptor = "I")
    public int field2521;

    @OriginalMember(owner = "client!j", name = "s", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!j", name = "d", descriptor = "Lwi;")
    public static class242 field2509;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V", line = 6)
    public static void method1151(int arg0) {
        field2515 = null;
        field2510 = null;
        if (arg0 != -1) {
            method1154(-117, false, -27);
        }
        field2513 = null;
        field2509 = null;
        field2514 = null;
        field2522 = null;
        field2511 = null;
        field2520 = null;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(B)Z", line = 33)
    public static final boolean method1152(byte arg0) throws IOException {
        field2507++;
        if (class200.field3381 == null) {
            return false;
        }
        int var1 = class200.field3381.method1185((byte) 103);
        if (var1 == 0) {
            return false;
        }
        if (class237.field4063 == -1) {
            class200.field3381.method1192((byte) 126, 0, 1, class75.field1223.field1495);
            var1--;
            class75.field1223.field1476 = 0;
            class237.field4063 = class75.field1223.method1690(11598);
            class60.field874 = class120.field2005[class237.field4063];
        }
        if (class60.field874 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class200.field3381.method1192((byte) 126, 0, 1, class75.field1223.field1495);
            class60.field874 = class75.field1223.field1495[0] & 0xFF;
            var1--;
        }
        if (class60.field874 == -2) {
            if (var1 <= 1) {
                return false;
            }
            class200.field3381.method1192((byte) 122, 0, 2, class75.field1223.field1495);
            class75.field1223.field1476 = 0;
            class60.field874 = class75.field1223.method721(104);
            var1 -= 2;
        }
        if (class60.field874 > var1) {
            return false;
        }
        class75.field1223.field1476 = 0;
        class200.field3381.method1192(arg0, 0, class60.field874, class75.field1223.field1495);
        class32.field436 = 0;
        class107.field1735 = class70.field1071;
        class70.field1071 = class286.field4893;
        class286.field4893 = class237.field4063;
        if (class237.field4063 == 251) {
            long var2 = class75.field1223.method690(85);
            class75.field1223.method743((byte) 95);
            long var4 = class75.field1223.method690(74);
            long var6 = (long) class75.field1223.method721(arg0 - 20);
            long var8 = (long) class75.field1223.method737(arg0 - 128);
            int var10 = class75.field1223.method702(-1);
            long var11 = (var6 << 32) + var8;
            boolean var13 = false;
            int var14 = 0;
            label1140: while (true) {
                if (var14 >= 100) {
                    if (var10 <= 1) {
                        if (class304.field5236 == 1 || class14.field111 == 1) {
                            var13 = true;
                        } else {
                            for (int var15 = 0; var15 < class141.field2269; var15++) {
                                if (class55.field808[var15] == var2) {
                                    var13 = true;
                                    break label1140;
                                }
                            }
                        }
                    }
                    break;
                }
                if (class109.field1760[var14] == var11) {
                    var13 = true;
                    break;
                }
                var14++;
            }
            if (!var13 && class73.field1111 == 0) {
                class109.field1760[class104.field1712] = var11;
                class104.field1712 = (class104.field1712 + 1) % 100;
                class62 var16 = class299.method2022(class36.method233(class75.field1223, (byte) -105).method427(22874));
                if (var10 == 2 || var10 == 3) {
                    class256.method1777(9, class170.method1227(0, var4).method419(28768), class254.method1772(new class62[] { class104.field1708, class170.method1227(arg0 ^ 0x7F, var2).method419(28768) }, arg0 - 127), var16, (byte) -127);
                } else if (var10 == 1) {
                    class256.method1777(9, class170.method1227(0, var4).method419(28768), class254.method1772(new class62[] { class207.field3511, class170.method1227(0, var2).method419(arg0 + 28641) }, arg0 - 127), var16, (byte) -126);
                } else {
                    class256.method1777(9, class170.method1227(0, var4).method419(arg0 ^ 0x701F), class170.method1227(0, var2).method419(28768), var16, (byte) -118);
                }
            }
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 64) {
            class196.field3326 = class75.field1223.method691(arg0 ^ 0xFF) * 30;
            class237.field4063 = -1;
            class149.field2356 = class105.field1716;
            return true;
        } else if (class237.field4063 == 249) {
            class103.method818(false, true);
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 2) {
            int var17 = class75.field1223.method691(128);
            int var18 = class75.field1223.method691(arg0 ^ 0xFF);
            int var19 = class75.field1223.method714((byte) -97);
            if (class101.method800(-120, var17)) {
                class206.method1446(var18, (byte) 96, var19);
            }
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 250) {
            int var20 = class75.field1223.method702(arg0 ^ 0xFFFFFF80);
            int var21 = var20 >> 6;
            class133 var22 = new class133();
            var22.field2171 = var20 & 0x3F;
            var22.field2158 = class75.field1223.method702(-1);
            if (var22.field2158 >= 0 && var22.field2158 < class298.field5088.length) {
                if (var22.field2171 == 1 || var22.field2171 == 10) {
                    var22.field2173 = class75.field1223.method721(101);
                    class75.field1223.field1476 += 3;
                } else if (var22.field2171 >= 2 && var22.field2171 <= 6) {
                    if (var22.field2171 == 2) {
                        var22.field2167 = 64;
                        var22.field2169 = 64;
                    }
                    if (var22.field2171 == 3) {
                        var22.field2167 = 64;
                        var22.field2169 = 0;
                    }
                    if (var22.field2171 == 4) {
                        var22.field2167 = 64;
                        var22.field2169 = 128;
                    }
                    if (var22.field2171 == 5) {
                        var22.field2169 = 64;
                        var22.field2167 = 0;
                    }
                    if (var22.field2171 == 6) {
                        var22.field2167 = 128;
                        var22.field2169 = 64;
                    }
                    var22.field2171 = 2;
                    var22.field2156 = class75.field1223.method721(60);
                    var22.field2161 = class75.field1223.method721(arg0 - 75);
                    var22.field2172 = class75.field1223.method702(arg0 ^ 0xFFFFFF80);
                }
                var22.field2165 = class75.field1223.method721(48);
                if (var22.field2165 == 65535) {
                    var22.field2165 = -1;
                }
                class189.field3012[var21] = var22;
            }
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 0) {
            class37.field572 = class75.field1223.method744(arg0 - 23);
            class230.field3995 = class75.field1223.method702(-1);
            for (int var349 = class230.field3995; var349 < (class230.field3995 + 8); var349++) {
                for (int var350 = class37.field572; var350 < (class37.field572 + 8); var350++) {
                    if (class7.field72[class7.field85][var349][var350] != null) {
                        class7.field72[class7.field85][var349][var350] = null;
                        class262.method1815(var350, var349, (byte) -77);
                    }
                }
            }
            for (class148 var351 = (class148) class68.field1053.method334(-18673); var351 != null; var351 = (class148) class68.field1053.method335((byte) 99)) {
                if (class230.field3995 <= var351.field2341 && var351.field2341 < class230.field3995 + 8 && class37.field572 <= var351.field2342 && var351.field2342 < (class37.field572 + 8) && class7.field85 == var351.field2330) {
                    var351.field2336 = 0;
                }
            }
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 78) {
            int var23 = class75.field1223.method691(128);
            int var24 = class75.field1223.method702(-1);
            int var25 = class75.field1223.method721(83);
            if (class101.method800(-118, var25)) {
                class252.method1752(var24, 9, var23);
            }
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 173) {
            int var344 = class75.field1223.method702(-1);
            int var345 = class75.field1223.method702(-1);
            int var346 = class75.field1223.method721(arg0 ^ 0xB);
            int var347 = class75.field1223.method702(arg0 ^ 0xFFFFFF80);
            int var348 = class75.field1223.method702(arg0 - 128);
            class294.method2002(true, var347, var345, var348, var344, var346, 128);
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 178) {
            int var26 = class75.field1223.method721(58);
            if (var26 == 65535) {
                var26 = -1;
            }
            class64.method462((byte) 90, var26);
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 63) {
            int var27 = class75.field1223.method734(false);
            if (var27 == 65535) {
                var27 = -1;
            }
            int var28 = class75.field1223.method737(arg0 ^ 0xFFFFFF80);
            class192.method1349(var27, -47, var28);
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 138) {
            int var29 = class75.field1223.method744(99);
            int var30 = class75.field1223.method721(39);
            class200.method1399(var30, 0, var29);
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 59) {
            int var31 = class75.field1223.method720(true);
            int var32 = class75.field1223.method739(true);
            int var33 = class75.field1223.method702(arg0 ^ 0xFFFFFF80);
            class7.field85 = var32 >> 1;
            class268.field4551.method1096(var33, var31, (var32 & 0x1) == 1, (byte) -123);
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 101) {
            int var34 = class75.field1223.method709(4);
            class195.field3286 = class193.field3246.method1945(var34, -95);
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 79) {
            int var339 = class75.field1223.method721(124);
            class62 var340 = class75.field1223.method696((byte) -99);
            Object[] var341 = new Object[var340.method439(85) + 1];
            for (int var342 = var340.method439(79) - 1; var342 >= 0; var342--) {
                if (var340.method456(var342, 31846) == 115) {
                    var341[var342 + 1] = class75.field1223.method696((byte) 44);
                } else {
                    var341[var342 + 1] = Integer.valueOf(class75.field1223.method704(1509947792));
                }
            }
            var341[0] = Integer.valueOf(class75.field1223.method704(1509947792));
            if (class101.method800(arg0 ^ 0xFFFFFFDA, var339)) {
                class161 var343 = new class161();
                var343.field2598 = var341;
                class262.method1818(var343, -128);
            }
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 88) {
            long var35 = class75.field1223.method690(arg0 - 25);
            int var37 = class75.field1223.method721(arg0 ^ 0x61);
            int var38 = class75.field1223.method702(-1);
            class62 var39 = class275.field4694;
            if (var37 > 0) {
                var39 = class75.field1223.method696((byte) -89);
            }
            boolean var40 = true;
            if (var35 < 0L) {
                var40 = false;
                var35 &= Long.MAX_VALUE;
            }
            class62 var41 = class170.method1227(0, var35).method419(28768);
            for (int var42 = 0; var42 < class190.field3042; var42++) {
                if (class64.field963[var42] == var35) {
                    if (class26.field311[var42] != var37) {
                        class26.field311[var42] = var37;
                        if (var37 > 0) {
                            class116.method901(5, class275.field4694, class254.method1772(new class62[] { var41, class68.field1052 }, 0), (byte) 94);
                        }
                        if (var37 == 0) {
                            class116.method901(5, class275.field4694, class254.method1772(new class62[] { var41, class64.field975 }, 0), (byte) 69);
                        }
                    }
                    class234.field4034[var42] = var39;
                    var41 = null;
                    class144.field2299[var42] = var38;
                    class203.field3430[var42] = var40;
                    break;
                }
            }
            boolean var43 = false;
            if (var41 != null && class190.field3042 < 200) {
                class64.field963[class190.field3042] = var35;
                class294.field5022[class190.field3042] = var41;
                class26.field311[class190.field3042] = var37;
                class234.field4034[class190.field3042] = var39;
                class144.field2299[class190.field3042] = var38;
                class203.field3430[class190.field3042] = var40;
                class190.field3042++;
            }
            int var44 = class190.field3042;
            class17.field153 = class105.field1716;
            while (var44 > 0) {
                var44--;
                boolean var45 = true;
                for (int var46 = 0; var46 < var44; var46++) {
                    if (class26.field311[var46] != class123.field2046 && class26.field311[var46 + 1] == class123.field2046 || class26.field311[var46] == 0 && class26.field311[var46 + 1] != 0) {
                        var45 = false;
                        int var47 = class26.field311[var46];
                        class26.field311[var46] = class26.field311[var46 + 1];
                        class26.field311[var46 + 1] = var47;
                        class62 var48 = class234.field4034[var46];
                        class234.field4034[var46] = class234.field4034[var46 + 1];
                        class234.field4034[var46 + 1] = var48;
                        class62 var49 = class294.field5022[var46];
                        class294.field5022[var46] = class294.field5022[var46 + 1];
                        class294.field5022[var46 + 1] = var49;
                        long var50 = class64.field963[var46];
                        class64.field963[var46] = class64.field963[var46 + 1];
                        class64.field963[var46 + 1] = var50;
                        int var52 = class144.field2299[var46];
                        class144.field2299[var46] = class144.field2299[var46 + 1];
                        class144.field2299[var46 + 1] = var52;
                        boolean var53 = class203.field3430[var46];
                        class203.field3430[var46] = class203.field3430[var46 + 1];
                        class203.field3430[var46 + 1] = var53;
                    }
                }
                if (var45) {
                    break;
                }
            }
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 34) {
            class298.method2014(class75.field1223.method696((byte) -105), 2);
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 103) {
            int var335 = class75.field1223.method691(128);
            int var336 = class75.field1223.method744(119);
            int var337 = class75.field1223.method691(arg0 + 1);
            if (class101.method800(-123, var335)) {
                if (var336 == 2) {
                    class108.method830(1024);
                }
                class301.field5183 = var337;
                class137.method1034(arg0 ^ 0x9, var337);
                class252.method1753(false, true);
                class309.method2105(class301.field5183, true);
                for (int var338 = 0; var338 < 100; var338++) {
                    class220.field3784[var338] = true;
                }
            }
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 207) {
            int var332 = class75.field1223.method704(1509947792);
            class191 var333 = class1.method2(var332, (byte) -37);
            for (int var334 = 0; var334 < var333.field3085.length; var334++) {
                var333.field3085[var334] = -1;
                var333.field3085[var334] = 0;
            }
            class250.method1744(var333, (byte) 117);
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 166) {
            int var329 = class75.field1223.method748(arg0 - 130);
            int var330 = class75.field1223.method748(-3);
            class62 var331 = class75.field1223.method696((byte) -91);
            if (class101.method800(-103, var329)) {
                class116.method899(2, var330, var331);
            }
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 68) {
            int var324 = class75.field1223.method702(-1);
            int var325 = class75.field1223.method702(-1);
            int var326 = class75.field1223.method721(98);
            int var327 = class75.field1223.method702(arg0 - 128);
            int var328 = class75.field1223.method702(arg0 ^ 0xFFFFFF80);
            class121.method931(var327, (byte) 121, var326, var328, var324, var325);
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 21) {
            int var54 = class75.field1223.method734(false);
            if (var54 == 65535) {
                var54 = -1;
            }
            int var55 = class75.field1223.method709(4);
            int var56 = class75.field1223.method721(91);
            int var57 = class75.field1223.method734(false);
            if (var57 == 65535) {
                var57 = -1;
            }
            int var58 = class75.field1223.method703(12646);
            if (class101.method800(-112, var56)) {
                for (int var59 = var57; var59 <= var54; var59++) {
                    long var60 = ((long) var55 << 32) + (long) var59;
                    class206 var62 = class183.field2929.method311((byte) 114, var60);
                    if (var62 != null) {
                        var62.method1444((byte) 89);
                    }
                    class183.field2929.method309(new class173(var58), var60, arg0 ^ 0x7E);
                }
            }
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 49) {
            class141.field2269 = class60.field874 / 8;
            for (int var63 = 0; var63 < class141.field2269; var63++) {
                class55.field808[var63] = class75.field1223.method690(125);
                class184.field2952[var63] = class170.method1227(0, class55.field808[var63]);
            }
            class17.field153 = class105.field1716;
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 133) {
            int var64 = class75.field1223.method744(105);
            class62 var65 = class75.field1223.method696((byte) -120);
            int var66 = class75.field1223.method739(true);
            if (var64 >= 1 && var64 <= 8) {
                if (var65.method436(class190.field3018, arg0 ^ 0x5F)) {
                    var65 = null;
                }
                class205.field3473[var64 - 1] = var65;
                class291.field4945[var64 - 1] = var66 == 0;
            }
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 50) {
            int var67 = class75.field1223.method702(-1);
            int var68 = class75.field1223.method702(-1);
            int var69 = class75.field1223.method702(-1);
            int var70 = class75.field1223.method702(-1);
            int var71 = class75.field1223.method721(87);
            class219.field3774[var67] = true;
            class26.field302[var67] = var68;
            class298.field5087[var67] = var69;
            class30.field411[var67] = var70;
            class186.field2979[var67] = var71;
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 27) {
            class62 var72 = class75.field1223.method696((byte) 25);
            if (var72.method442((byte) -75, class73.field1114)) {
                boolean var73 = false;
                class62 var74 = var72.method429(var72.method457(arg0 - 27900, class163.field2646), 0, true);
                long var75 = var74.method451(arg0 - 46);
                for (int var77 = 0; var77 < class141.field2269; var77++) {
                    if (class55.field808[var77] == var75) {
                        var73 = true;
                        break;
                    }
                }
                if (!var73 && class73.field1111 == 0) {
                    class116.method901(4, var74, field2515, (byte) 68);
                }
            } else if (var72.method442((byte) -56, class304.field5241)) {
                class62 var78 = var72.method429(var72.method457(-27773, class163.field2646), 0, true);
                boolean var79 = false;
                long var80 = var78.method451(arg0 ^ 0x5B);
                for (int var82 = 0; var82 < class141.field2269; var82++) {
                    if (class55.field808[var82] == var80) {
                        var79 = true;
                        break;
                    }
                }
                if (!var79 && class73.field1111 == 0) {
                    class62 var83 = var72.method429(var72.method439(arg0 ^ -16) - 9, var72.method457(-27773, class163.field2646) + 1, true);
                    class116.method901(8, var78, var83, (byte) 69);
                }
            } else if (var72.method442((byte) -19, class244.field4153)) {
                class62 var84 = var72.method429(var72.method457(-27773, class163.field2646), 0, true);
                long var85 = var84.method451(72);
                boolean var87 = false;
                for (int var88 = 0; var88 < class141.field2269; var88++) {
                    if (class55.field808[var88] == var85) {
                        var87 = true;
                        break;
                    }
                }
                if (!var87 && class73.field1111 == 0) {
                    class116.method901(10, var84, class275.field4694, (byte) 72);
                }
            } else if (var72.method442((byte) -53, class195.field3298)) {
                class62 var112 = var72.method429(var72.method457(arg0 ^ 0xFFFF93FC, class195.field3298), 0, true);
                class116.method901(11, class275.field4694, var112, (byte) 102);
            } else if (var72.method442((byte) -121, class197.field3340)) {
                class62 var111 = var72.method429(var72.method457(-27773, class197.field3340), 0, true);
                if (class73.field1111 == 0) {
                    class116.method901(12, class275.field4694, var111, (byte) 110);
                }
            } else if (var72.method442((byte) -99, class276.field4743)) {
                class62 var110 = var72.method429(var72.method457(-27773, class276.field4743), 0, true);
                if (class73.field1111 == 0) {
                    class116.method901(13, class275.field4694, var110, (byte) 104);
                }
            } else if (var72.method442((byte) -98, class101.field1656)) {
                class62 var105 = var72.method429(var72.method457(-27773, class163.field2646), 0, true);
                long var106 = var105.method451(121);
                boolean var108 = false;
                for (int var109 = 0; var109 < class141.field2269; var109++) {
                    if (class55.field808[var109] == var106) {
                        var108 = true;
                        break;
                    }
                }
                if (!var108 && class73.field1111 == 0) {
                    class116.method901(14, var105, class275.field4694, (byte) 101);
                }
            } else if (var72.method442((byte) -61, class220.field3781)) {
                class62 var100 = var72.method429(var72.method457(-27773, class163.field2646), 0, true);
                boolean var101 = false;
                long var102 = var100.method451(100);
                for (int var104 = 0; var104 < class141.field2269; var104++) {
                    if (class55.field808[var104] == var102) {
                        var101 = true;
                        break;
                    }
                }
                if (!var101 && class73.field1111 == 0) {
                    class116.method901(15, var100, class275.field4694, (byte) 106);
                }
            } else if (var72.method442((byte) -66, class53.field771)) {
                class62 var95 = var72.method429(var72.method457(-27773, class163.field2646), 0, true);
                long var96 = var95.method451(97);
                boolean var98 = false;
                for (int var99 = 0; var99 < class141.field2269; var99++) {
                    if (class55.field808[var99] == var96) {
                        var98 = true;
                        break;
                    }
                }
                if (!var98 && class73.field1111 == 0) {
                    class116.method901(16, var95, class275.field4694, (byte) 112);
                }
            } else if (var72.method442((byte) -119, class215.field3660)) {
                class62 var89 = var72.method429(var72.method457(-27773, class163.field2646), 0, true);
                boolean var90 = false;
                long var91 = var89.method451(arg0 - 37);
                for (int var93 = 0; var93 < class141.field2269; var93++) {
                    if (class55.field808[var93] == var91) {
                        var90 = true;
                        break;
                    }
                }
                if (!var90 && class73.field1111 == 0) {
                    class62 var94 = var72.method429(var72.method439(-28) - 9, var72.method457(-27773, class163.field2646) + 1, true);
                    class116.method901(21, var89, var94, (byte) 89);
                }
            } else {
                class116.method901(0, class275.field4694, var72, (byte) 89);
            }
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 122) {
            for (int var323 = 0; var323 < class222.field3877.length; var323++) {
                if (class24.field275[var323] != class222.field3877[var323]) {
                    class222.field3877[var323] = class24.field275[var323];
                    class308.method2099(var323, -51);
                    class248.field4217[class234.method1648(31, class5.field57++)] = var323;
                }
            }
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 117) {
            int var113 = class75.field1223.method704(1509947792);
            int var114 = class75.field1223.method721(91);
            class191 var115;
            if (var113 < 0) {
                var115 = null;
            } else {
                var115 = class1.method2(var113, (byte) -37);
            }
            if (var113 < -70000) {
                var114 += 32768;
            }
            if (var115 != null) {
                for (int var116 = 0; var116 < var115.field3085.length; var116++) {
                    var115.field3085[var116] = 0;
                    var115.field3106[var116] = 0;
                }
            }
            class232.method1642(21247, var114);
            int var117 = class75.field1223.method721(32);
            for (int var118 = 0; var118 < var117; var118++) {
                int var119 = class75.field1223.method691(arg0 ^ 0xFF);
                int var120 = class75.field1223.method720(true);
                if (var120 == 255) {
                    var120 = class75.field1223.method704(arg0 + 1509947665);
                }
                if (var115 != null && var118 < var115.field3085.length) {
                    var115.field3085[var118] = var119;
                    var115.field3106[var118] = var120;
                }
                class304.method2084(var120, var114, (byte) -87, var118, var119 - 1);
            }
            if (var115 != null) {
                class250.method1744(var115, (byte) 96);
            }
            class291.method1979(0);
            class194.field3285[class234.method1648(class261.field4381++, 31)] = class234.method1648(32767, var114);
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 234) {
            class103.method818(false, false);
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 224) {
            int var322 = class75.field1223.method721(arg0 - 46);
            class45.method294((byte) -64, var322);
            class194.field3285[class234.method1648(class261.field4381++, 31)] = class234.method1648(32767, var322);
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 191) {
            class41.method277(true);
            class237.field4063 = -1;
            return false;
        } else if (class237.field4063 == 137) {
            long var121 = class75.field1223.method690(arg0 ^ 0x5);
            class75.field1223.method743((byte) 78);
            long var123 = class75.field1223.method690(84);
            long var125 = (long) class75.field1223.method721(82);
            long var127 = (long) class75.field1223.method737(arg0 - 128);
            int var129 = class75.field1223.method702(-1);
            int var130 = class75.field1223.method721(45);
            long var131 = (var125 << 32) + var127;
            boolean var133 = false;
            int var134 = 0;
            label1297: while (true) {
                if (var134 >= 100) {
                    if (var129 <= 1) {
                        for (int var135 = 0; var135 < class141.field2269; var135++) {
                            if (class55.field808[var135] == var121) {
                                var133 = true;
                                break label1297;
                            }
                        }
                    }
                    break;
                }
                if (class109.field1760[var134] == var131) {
                    var133 = true;
                    break;
                }
                var134++;
            }
            if (!var133 && class73.field1111 == 0) {
                class109.field1760[class104.field1712] = var131;
                class104.field1712 = (class104.field1712 + 1) % 100;
                class62 var136 = class31.method206(var130, false).method1794((byte) -34, class75.field1223);
                if (var129 == 2 || var129 == 3) {
                    class38.method260(20, var136, class254.method1772(new class62[] { class104.field1708, class170.method1227(arg0 - 127, var121).method419(arg0 ^ 0x701F) }, arg0 ^ 0x7F), var130, arg0 ^ 0xFFFFFF80, class170.method1227(arg0 ^ 0x7F, var123).method419(arg0 ^ 0x701F));
                } else if (var129 == 1) {
                    class38.method260(20, var136, class254.method1772(new class62[] { class207.field3511, class170.method1227(0, var121).method419(28768) }, 0), var130, -1, class170.method1227(0, var123).method419(28768));
                } else {
                    class38.method260(20, var136, class170.method1227(0, var121).method419(28768), var130, -1, class170.method1227(arg0 - 127, var123).method419(28768));
                }
            }
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 171) {
            int var319 = class75.field1223.method691(128);
            int var320 = class75.field1223.method714((byte) -78);
            if (class101.method800(arg0 ^ 0xFFFFFFDC, var319)) {
                int var321 = 0;
                if (class268.field4551.field2448 != null) {
                    var321 = class268.field4551.field2448.method89((byte) 123);
                }
                class192.method1348(3, var320, var321, arg0 ^ 0x12);
            }
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 219) {
            long var305 = class75.field1223.method690(80);
            int var307 = class75.field1223.method721(40);
            byte var308 = class75.field1223.method743((byte) 88);
            boolean var309 = false;
            if ((Long.MIN_VALUE & var305) != 0L) {
                var309 = true;
            }
            if (var309) {
                if (class201.field3410 == 0) {
                    class237.field4063 = -1;
                    return true;
                }
                boolean var310 = false;
                long var311 = var305 & Long.MAX_VALUE;
                int var313;
                for (var313 = 0; var313 < class201.field3410 && (class225.field3923[var313].field3499 != var311 || class225.field3923[var313].field3919 != var307); var313++) {
                }
                if (class201.field3410 > var313) {
                    while ((class201.field3410 - 1) > var313) {
                        class225.field3923[var313] = class225.field3923[var313 + 1];
                        var313++;
                    }
                    class201.field3410--;
                    class225.field3923[class201.field3410] = null;
                }
            } else {
                class62 var314 = class75.field1223.method696((byte) 106);
                class225 var315 = new class225();
                var315.field3499 = var305;
                var315.field3922 = class170.method1227(0, var315.field3499);
                var315.field3924 = var308;
                var315.field3919 = var307;
                var315.field3921 = var314;
                int var316;
                for (var316 = class201.field3410 - 1; var316 >= 0; var316--) {
                    int var317 = class225.field3923[var316].field3922.method452(arg0 - 20, var315.field3922);
                    if (var317 == 0) {
                        class225.field3923[var316].field3919 = var307;
                        class225.field3923[var316].field3924 = var308;
                        class225.field3923[var316].field3921 = var314;
                        class237.field4063 = -1;
                        if (class123.field2043 == var305) {
                            class241.field4117 = var308;
                        }
                        class15.field123 = class105.field1716;
                        return true;
                    }
                    if (var317 < 0) {
                        break;
                    }
                }
                if (class201.field3410 >= class225.field3923.length) {
                    class237.field4063 = -1;
                    return true;
                }
                for (int var318 = class201.field3410 - 1; var318 > var316; var318--) {
                    class225.field3923[var318 + 1] = class225.field3923[var318];
                }
                if (class201.field3410 == 0) {
                    class225.field3923 = new class225[100];
                }
                class225.field3923[var316 + 1] = var315;
                if (class123.field2043 == var305) {
                    class241.field4117 = var308;
                }
                class201.field3410++;
            }
            class15.field123 = class105.field1716;
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 84) {
            int var137 = class75.field1223.method709(4);
            int var138 = class75.field1223.method748(arg0 - 130);
            class200.method1399(var138, 0, var137);
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 238) {
            class233.method1646(true, class75.field1223);
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 159) {
            int var302 = class75.field1223.method748(-3);
            int var303 = class75.field1223.method748(-3);
            class62 var304 = class75.field1223.method696((byte) 76);
            if (class101.method800(arg0 ^ 0xFFFFFFDE, var302)) {
                class116.method899(arg0 ^ 0x7D, var303, var304);
            }
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 6) {
            int var298 = class75.field1223.method693((byte) -100);
            int var299 = class75.field1223.method691(arg0 + 1);
            int var300 = class75.field1223.method699((byte) -43);
            int var301 = class75.field1223.method704(1509947792);
            if (class101.method800(arg0 ^ 0xFFFFFFF8, var299)) {
                class72.method517(var301, var300, (byte) -118, var298);
            }
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 33) {
            int var139 = class75.field1223.method721(57);
            if (var139 == 65535) {
                var139 = -1;
            }
            int var140 = class75.field1223.method702(-1);
            int var141 = class75.field1223.method721(arg0 - 29);
            class281.method1919(var140, var141, -26080, var139);
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 211) {
            class230.field3995 = class75.field1223.method744(91);
            class37.field572 = class75.field1223.method702(-1);
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 233) {
            class134.method1015((byte) -111);
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 140) {
            class293.field4993 = class75.field1223.method702(-1);
            class17.field153 = class105.field1716;
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 118) {
            int var142 = class75.field1223.method748(-3);
            int var143 = class75.field1223.method709(4);
            int var144 = class75.field1223.method748(arg0 - 130);
            if (var142 == 65535) {
                var142 = -1;
            }
            int var145 = class75.field1223.method714((byte) -77);
            if (class101.method800(arg0 ^ 0xFFFFFFF3, var144)) {
                class191 var146 = class1.method2(var145, (byte) -37);
                if (var146.field3209) {
                    class184.method1293(var145, 25119, var142, var143);
                    class37 var148 = class189.method1320(arg0 - 127, var142);
                    class166.method1195(var148.field544, arg0 ^ 0x77, var148.field504, var145, var148.field545);
                    class122.method933(var145, var148.field559, 10, var148.field516, var148.field525);
                } else if (var142 == -1) {
                    var146.field3105 = 0;
                    class237.field4063 = -1;
                    return true;
                } else {
                    class37 var147 = class189.method1320(0, var142);
                    var146.field3192 = var147.field504;
                    var146.field3182 = var147.field545;
                    var146.field3105 = 4;
                    var146.field3141 = var142;
                    var146.field3118 = var147.field544 * 100 / var143;
                    class250.method1744(var146, (byte) 79);
                }
            }
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 222) {
            long var294 = class75.field1223.method690(arg0 ^ 0x8);
            int var296 = class75.field1223.method721(22);
            class62 var297 = class31.method206(var296, false).method1794((byte) -34, class75.field1223);
            class38.method260(19, var297, class170.method1227(0, var294).method419(28768), var296, arg0 - 128, (class62) null);
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 214) {
            int var292 = class75.field1223.method734(false);
            int var293 = class75.field1223.method704(1509947792);
            class195.method1371(-26388, var293, var292);
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 195) {
            int var289 = class75.field1223.method748(-3);
            int var290 = class75.field1223.method714((byte) -109);
            int var291 = class75.field1223.method748(arg0 ^ 0xFFFFFF82);
            if (class101.method800(-128, var291)) {
                class252.method1752(var290, 9, var289);
            }
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 170) {
            int var149 = class75.field1223.method721(68);
            int var150 = class75.field1223.method691(128);
            class267.field4516 = var149;
            class20.field208 = var150;
            class236.method1662((byte) 109);
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 96) {
            int var151 = class75.field1223.method734(false);
            int var152 = class75.field1223.method709(arg0 ^ 0x7B);
            int var153 = class75.field1223.method713(116);
            if (class101.method800(-94, var151)) {
                class41.method280((byte) -111, var152, var153);
            }
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 246) {
            if (class301.field5183 != -1) {
                class108.method832(0, 0, class301.field5183);
            }
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 185) {
            int var154 = class75.field1223.method704(1509947792);
            int var155 = class75.field1223.method721(101);
            int var156 = class75.field1223.method721(arg0 ^ 0x55);
            int var157 = class75.field1223.method748(-3);
            if (class101.method800(-116, var157)) {
                class169.method1215(arg0 ^ 0x13, var154, (var155 << 16) + var156);
            }
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 189) {
            int var284 = class75.field1223.method691(arg0 + 1);
            int var285 = class75.field1223.method748(-3);
            int var286 = class75.field1223.method734(false);
            int var287 = class75.field1223.method709(arg0 ^ 0x7B);
            int var288 = class75.field1223.method721(arg0 - 38);
            if (class101.method800(-102, var285)) {
                class166.method1195(var288, 8, var284, var287, var286);
            }
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 86) {
            for (int var282 = 0; var282 < class5.field50.length; var282++) {
                if (class5.field50[var282] != null) {
                    class5.field50[var282].field3836 = -1;
                }
            }
            for (int var283 = 0; var283 < class301.field5186.length; var283++) {
                if (class301.field5186[var283] != null) {
                    class301.field5186[var283].field3836 = -1;
                }
            }
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 206) {
            int var279 = class75.field1223.method748(-3);
            int var280 = class75.field1223.method704(1509947792);
            int var281 = class75.field1223.method734(false);
            if (var281 == 65535) {
                var281 = -1;
            }
            if (class101.method800(-114, var279)) {
                class192.method1348(2, var280, var281, arg0 - 32);
            }
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 129) {
            int var278 = class75.field1223.method702(arg0 ^ 0xFFFFFF80);
            if (class75.field1223.method702(-1) == 0) {
                class281.field4808[var278] = new class201();
            } else {
                class75.field1223.field1476--;
                class281.field4808[var278] = new class201(class75.field1223);
            }
            class141.field2272 = class105.field1716;
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 188) {
            int var260 = class75.field1223.method691(128);
            int var261 = class75.field1223.method704(1509947792);
            int var262 = class75.field1223.method748(-3);
            int var263 = class75.field1223.method734(false);
            if (var261 >> 30 != 0) {
                int var272 = (var261 & 0x3A64ECAF) >> 28;
                int var273 = ((var261 & 0xFFFFDBA) >> 14) - class120.field2006;
                int var274 = (var261 & 0x3FFF) - class290.field4936;
                if (var273 >= 0 && var274 >= 0 && var273 < 104 && var274 < 104) {
                    int var275 = var273 * 128 + 64;
                    int var276 = var274 * 128 + 64;
                    class194 var277 = new class194(var263, var272, var275, var276, class165.method1186((byte) -58, var276, var275, var272) - var262, var260, class199.field3367);
                    class241.field4113.method330(new class277(var277), 126);
                }
            } else if ((var261 >> 29) != 0) {
                int var264 = var261 & 0xFFFF;
                class204 var265 = class301.field5186[var264];
                if (var265 != null) {
                    var265.field3871 = class199.field3367 + var260;
                    var265.field3855 = var262;
                    var265.field3851 = 0;
                    var265.field3813 = 0;
                    if (class199.field3367 < var265.field3871) {
                        var265.field3813 = -1;
                    }
                    var265.field3847 = var263;
                    if (var265.field3847 == 65535) {
                        var265.field3847 = -1;
                    }
                    if (var265.field3847 != -1 && class199.field3367 == var265.field3871) {
                        int var266 = class115.method895(arg0 - 186, var265.field3847).field4611;
                        if (var266 != -1) {
                            class96 var267 = class151.method1085(var266, (byte) 105);
                            if (var267 != null && var267.field1586 != null) {
                                class113.method881(var267, var265.field3821, var265.field3814, false, (byte) -91, 0);
                            }
                        }
                    }
                }
            } else if (var261 >> 28 != 0) {
                int var268 = var261 & 0xFFFF;
                class153 var269;
                if (field2523 == var268) {
                    var269 = class268.field4551;
                } else {
                    var269 = class5.field50[var268];
                }
                if (var269 != null) {
                    var269.field3847 = var263;
                    var269.field3851 = 0;
                    var269.field3813 = 0;
                    if (var269.field3847 == 65535) {
                        var269.field3847 = -1;
                    }
                    var269.field3855 = var262;
                    var269.field3871 = class199.field3367 + var260;
                    if (class199.field3367 < var269.field3871) {
                        var269.field3813 = -1;
                    }
                    if (var269.field3847 != -1 && class199.field3367 == var269.field3871) {
                        int var270 = class115.method895(arg0 - 23, var269.field3847).field4611;
                        if (var270 != -1) {
                            class96 var271 = class151.method1085(var270, (byte) 121);
                            if (var271 != null && var271.field1586 != null) {
                                class113.method881(var271, var269.field3821, var269.field3814, class268.field4551 == var269, (byte) -93, 0);
                            }
                        }
                    }
                }
            }
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 61 || class237.field4063 == 62 || class237.field4063 == 194 || class237.field4063 == 92 || class237.field4063 == 58 || class237.field4063 == 42 || class237.field4063 == 95 || class237.field4063 == 98 || class237.field4063 == 72 || class237.field4063 == 120 || class237.field4063 == 80 || class237.field4063 == 17) {
            class243.method1706(-26562);
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 5) {
            int var158 = class75.field1223.method691(128);
            int var159 = class75.field1223.method748(arg0 - 130);
            int var160 = class75.field1223.method702(-1);
            class204 var161 = class301.field5186[var159];
            if (var161 != null) {
                class129.method957(var158, var161, var160, true);
            }
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 40) {
            if (class212.field3569 != null) {
                class57.method376(-28268);
            }
            byte[] var162 = new byte[class60.field874];
            class75.field1223.method1694(94, class60.field874, var162, 0);
            class62 var163 = class266.method1833(0, class60.field874, var162, arg0 - 127);
            if (class216.field3686 == null && class278.field4772 == 2 || !class285.field4865.startsWith("win") || class60.field868) {
                class300.method2044(var163, true, 46);
            } else {
                class200.field3390 = true;
                class248.field4218 = var163;
                class133.field2174 = class193.field3246.method1943(new String(var163.method404(-231), "ISO-8859-1"), (byte) -124);
            }
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 35) {
            int var164 = class75.field1223.method691(128);
            int var165 = class75.field1223.method714((byte) -98);
            int var166 = class75.field1223.method721(64);
            if (var164 == 65535) {
                var164 = -1;
            }
            if (class101.method800(-93, var166)) {
                class192.method1348(1, var165, var164, 66);
            }
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 45) {
            class291.method1979(0);
            int var167 = class75.field1223.method739(true);
            int var168 = class75.field1223.method720(true);
            int var169 = class75.field1223.method704(1509947792);
            class52.field742[var167] = var169;
            class146.field2314[var167] = var168;
            class260.field4372[var167] = 1;
            for (int var170 = 0; var170 < 98; var170++) {
                if (var169 >= class259.field4363[var170]) {
                    class260.field4372[var167] = var170 + 2;
                }
            }
            class87.field1399[class234.method1648(31, class270.field4591++)] = var167;
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 228) {
            int var257 = class75.field1223.method703(12646);
            int var258 = class75.field1223.method721(102);
            class62 var259 = class75.field1223.method696((byte) 100);
            if (class101.method800(-98, var258)) {
                class106.method824(3, var259, var257);
            }
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 119) {
            class15.field123 = class105.field1716;
            long var245 = class75.field1223.method690(94);
            if (var245 == 0L) {
                class291.field4944 = null;
                class237.field4063 = -1;
                class127.field2105 = null;
                class225.field3923 = null;
                class201.field3410 = 0;
                return true;
            }
            long var247 = class75.field1223.method690(103);
            class127.field2105 = class170.method1227(0, var247);
            class291.field4944 = class170.method1227(0, var245);
            class297.field5065 = class75.field1223.method743((byte) 35);
            int var249 = class75.field1223.method702(-1);
            if (var249 == 255) {
                class237.field4063 = -1;
                return true;
            }
            class201.field3410 = var249;
            class225[] var250 = new class225[100];
            for (int var251 = 0; var251 < class201.field3410; var251++) {
                var250[var251] = new class225();
                var250[var251].field3499 = class75.field1223.method690(arg0 - 55);
                var250[var251].field3922 = class170.method1227(0, var250[var251].field3499);
                var250[var251].field3919 = class75.field1223.method721(116);
                var250[var251].field3924 = class75.field1223.method743((byte) 121);
                var250[var251].field3921 = class75.field1223.method696((byte) 42);
                if (class123.field2043 == var250[var251].field3499) {
                    class241.field4117 = var250[var251].field3924;
                }
            }
            boolean var252 = false;
            int var253 = class201.field3410;
            while (var253 > 0) {
                var253--;
                boolean var254 = true;
                for (int var255 = 0; var255 < var253; var255++) {
                    if (var250[var255].field3922.method452(60, var250[var255 + 1].field3922) > 0) {
                        var254 = false;
                        class225 var256 = var250[var255];
                        var250[var255] = var250[var255 + 1];
                        var250[var255 + 1] = var256;
                    }
                }
                if (var254) {
                    break;
                }
            }
            class237.field4063 = -1;
            class225.field3923 = var250;
            return true;
        } else if (class237.field4063 == 57) {
            int var171 = class75.field1223.method748(-3);
            int var172 = class75.field1223.method704(arg0 + 1509947665);
            int var173 = class75.field1223.method734(false);
            if (class101.method800(-90, var173)) {
                class186.method1307(var172, 6, var171);
            }
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 148) {
            class152.field2398 = 0;
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 37) {
            int var174 = class75.field1223.method709(4);
            int var175 = class75.field1223.method714((byte) -103);
            int var176 = class75.field1223.method748(-3);
            if (class101.method800(-100, var176)) {
                class146 var177 = (class146) class214.field3632.method311((byte) 114, (long) var174);
                class146 var178 = (class146) class214.field3632.method311((byte) 114, (long) var175);
                if (var178 != null) {
                    class294.method1993(var178, arg0 ^ 0x7C, var177 == null || var177.field2312 != var178.field2312);
                }
                if (var177 != null) {
                    var177.method1444((byte) 89);
                    class214.field3632.method309(var177, (long) var175, 1);
                }
                class191 var179 = class1.method2(var174, (byte) -37);
                if (var179 != null) {
                    class250.method1744(var179, (byte) 113);
                }
                class191 var180 = class1.method2(var175, (byte) -37);
                if (var180 != null) {
                    class250.method1744(var180, (byte) 80);
                    class192.method1347(arg0 ^ 0x8E39AD8F, true, var180);
                }
                if (class301.field5183 != -1) {
                    class108.method832(1, 0, class301.field5183);
                }
            }
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 111) {
            int var181 = class75.field1223.method734(false);
            int var182 = class75.field1223.method734(false);
            int var183 = class75.field1223.method739(true);
            int var184 = class75.field1223.method703(12646);
            if (class101.method800(-124, var181)) {
                class146 var185 = (class146) class214.field3632.method311((byte) 114, (long) var184);
                if (var185 != null) {
                    class294.method1993(var185, arg0 - 124, var185.field2312 != var182);
                }
                class184.method1288(var184, var182, true, var183);
            }
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 77) {
            if (class60.field874 == 0) {
                class108.field1741 = class152.field2407;
            } else {
                class108.field1741 = class75.field1223.method696((byte) -93);
            }
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 230) {
            class37.field572 = class75.field1223.method744(arg0 - 80);
            class230.field3995 = class75.field1223.method720(true);
            while (class60.field874 > class75.field1223.field1476) {
                class237.field4063 = class75.field1223.method702(-1);
                class243.method1706(arg0 - 26689);
            }
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 240) {
            int var186 = class75.field1223.method721(116);
            int var187 = class75.field1223.method748(-3);
            int var188 = class75.field1223.method748(-3);
            int var189 = class75.field1223.method714((byte) -104);
            if (class101.method800(-125, var187)) {
                class192.method1348(7, var189, var188 << 16 | var186, 80);
            }
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 114) {
            class94.method757(5);
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 243) {
            int var242 = class75.field1223.method721(113);
            int var243 = class75.field1223.method704(arg0 ^ 0x59FFF9EF);
            if (class101.method800(-119, var242)) {
                class146 var244 = (class146) class214.field3632.method311((byte) 114, (long) var243);
                if (var244 != null) {
                    class294.method1993(var244, arg0 - 124, true);
                }
                if (class81.field1354 != null) {
                    class250.method1744(class81.field1354, (byte) 81);
                    class81.field1354 = null;
                }
            }
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 242) {
            long var190 = class75.field1223.method690(80);
            class62 var192 = class299.method2022(class36.method233(class75.field1223, (byte) -71).method427(22874));
            class116.method901(6, class170.method1227(0, var190).method419(28768), var192, (byte) 67);
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 115) {
            class291.method1979(arg0 ^ 0x7F);
            class238.field4074 = class75.field1223.method702(arg0 - 128);
            class149.field2356 = class105.field1716;
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 253) {
            int var193 = class75.field1223.method704(1509947792);
            int var194 = class75.field1223.method721(44);
            if (var193 < -70000) {
                var194 += 32768;
            }
            class191 var195;
            if (var193 < 0) {
                var195 = null;
            } else {
                var195 = class1.method2(var193, (byte) -37);
            }
            while (class60.field874 > class75.field1223.field1476) {
                int var196 = class75.field1223.method731(-92);
                int var197 = class75.field1223.method721(arg0 ^ 0x36);
                int var198 = 0;
                if (var197 != 0) {
                    var198 = class75.field1223.method702(-1);
                    if (var198 == 255) {
                        var198 = class75.field1223.method704(1509947792);
                    }
                }
                if (var195 != null && var196 >= 0 && var196 < var195.field3085.length) {
                    var195.field3085[var196] = var197;
                    var195.field3106[var196] = var198;
                }
                class304.method2084(var198, var194, (byte) -86, var196, var197 - 1);
            }
            if (var195 != null) {
                class250.method1744(var195, (byte) 97);
            }
            class291.method1979(arg0 - 127);
            class194.field3285[class234.method1648(31, class261.field4381++)] = class234.method1648(32767, var194);
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 161) {
            long var229 = class75.field1223.method690(91);
            long var231 = (long) class75.field1223.method721(arg0 ^ 0x4C);
            long var233 = (long) class75.field1223.method737(-1);
            boolean var235 = false;
            long var236 = (var231 << 32) + var233;
            int var238 = class75.field1223.method702(-1);
            int var239 = 0;
            label1376: while (true) {
                if (var239 < 100) {
                    if (class109.field1760[var239] != var236) {
                        var239++;
                        continue;
                    }
                    var235 = true;
                    break;
                }
                if (var238 <= 1) {
                    if (class304.field5236 == 1 || class14.field111 == 1) {
                        var235 = true;
                    } else {
                        for (int var240 = 0; var240 < class141.field2269; var240++) {
                            if (class55.field808[var240] == var229) {
                                var235 = true;
                                break label1376;
                            }
                        }
                    }
                }
                break;
            }
            if (!var235 && class73.field1111 == 0) {
                class109.field1760[class104.field1712] = var236;
                class104.field1712 = (class104.field1712 + 1) % 100;
                class62 var241 = class299.method2022(class36.method233(class75.field1223, (byte) -120).method427(22874));
                if (var238 == 2 || var238 == 3) {
                    class116.method901(7, class254.method1772(new class62[] { class104.field1708, class170.method1227(0, var229).method419(arg0 + 28641) }, 0), var241, (byte) 70);
                } else if (var238 == 1) {
                    class116.method901(7, class254.method1772(new class62[] { class207.field3511, class170.method1227(arg0 - 127, var229).method419(28768) }, 0), var241, (byte) 80);
                } else {
                    class116.method901(3, class170.method1227(arg0 ^ 0x7F, var229).method419(28768), var241, (byte) 112);
                }
            }
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 168) {
            int var218 = class75.field1223.method709(4);
            int var219 = var218 >> 14 & 0x3FFF;
            int var220 = class75.field1223.method734(false);
            int var221 = (var218 & 0x31908AE3) >> 28;
            int var222 = var218 & 0x3FFF;
            if (var220 == 65535) {
                var220 = -1;
            }
            int var223 = class75.field1223.method744(68);
            int var224 = var219 - class120.field2006;
            int var225 = var222 - class290.field4936;
            int var226 = var223 >> 2;
            int var227 = var223 & 0x3;
            int var228 = class60.field869[var226];
            class85.method649(var221, var225, var227, var228, false, var224, var220, var226);
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 197) {
            class291.method1979(0);
            class292.field4974 = class75.field1223.method699((byte) -107);
            class149.field2356 = class105.field1716;
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 29) {
            class7.field68 = class75.field1223.method702(-1);
            class208.field3529 = class75.field1223.method702(arg0 ^ 0xFFFFFF80);
            class247.field4208 = class75.field1223.method702(-1);
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 1) {
            class254.method1774((byte) 119);
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 172) {
            long var199 = class75.field1223.method690(112);
            long var201 = (long) class75.field1223.method721(64);
            boolean var203 = false;
            long var204 = (long) class75.field1223.method737(arg0 - 128);
            int var206 = class75.field1223.method702(arg0 ^ 0xFFFFFF80);
            long var207 = (var201 << 32) + var204;
            int var209 = class75.field1223.method721(arg0 ^ 0x5A);
            int var210 = 0;
            label1338: while (true) {
                if (var210 < 100) {
                    if (class109.field1760[var210] != var207) {
                        var210++;
                        continue;
                    }
                    var203 = true;
                    break;
                }
                if (var206 <= 1) {
                    for (int var211 = 0; var211 < class141.field2269; var211++) {
                        if (class55.field808[var211] == var199) {
                            var203 = true;
                            break label1338;
                        }
                    }
                }
                break;
            }
            if (!var203 && class73.field1111 == 0) {
                class109.field1760[class104.field1712] = var207;
                class104.field1712 = (class104.field1712 + 1) % 100;
                class62 var212 = class31.method206(var209, false).method1794((byte) -34, class75.field1223);
                if (var206 == 2) {
                    class38.method260(18, var212, class254.method1772(new class62[] { class104.field1708, class170.method1227(0, var199).method419(28768) }, 0), var209, -1, (class62) null);
                } else if (var206 == 1) {
                    class38.method260(18, var212, class254.method1772(new class62[] { class207.field3511, class170.method1227(0, var199).method419(28768) }, arg0 ^ 0x7F), var209, -1, (class62) null);
                } else {
                    class38.method260(18, var212, class170.method1227(0, var199).method419(28768), var209, -1, (class62) null);
                }
            }
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 199) {
            byte var213 = class75.field1223.method728(-128);
            int var214 = class75.field1223.method721(107);
            class195.method1371(-26388, var213, var214);
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 87) {
            int var215 = class75.field1223.method691(128);
            int var216 = class75.field1223.method704(1509947792);
            int var217 = class75.field1223.method702(-1);
            if (class101.method800(-93, var215)) {
                class287.method1964(var216, var217, (byte) 83);
            }
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 43) {
            class29.field372 = class75.field1223.method702(-1);
            class237.field4063 = -1;
            return true;
        } else if (class237.field4063 == 186) {
            class102.method809((byte) 97);
            class291.method1979(0);
            class237.field4063 = -1;
            class5.field57 += 32;
            return true;
        } else if (class237.field4063 == 65) {
            class170.method1225(class193.field3246, (byte) -126, class60.field874, class75.field1223);
            class237.field4063 = -1;
            return true;
        } else {
            class235.method1659((Throwable) null, "T1 - " + class237.field4063 + "," + class70.field1071 + "," + class107.field1735 + " - " + class60.field874, -28677);
            class41.method277(true);
            return true;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IZ)Lad;", line = 2647)
    public static final class5 method1153(int arg0, boolean arg1) {
        field2524++;
        class5 var2 = (class5) class229.field3984.method1396(0, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class186.field2966.method157(arg0, 1, (byte) 19);
        class5 var4 = new class5();
        if (var3 != null) {
            var4.method23(new class92(var3), 51, arg0);
        }
        class229.field3984.method1397((long) arg0, var4, arg1);
        return var4;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IZI)V", line = 2669)
    public static final void method1154(int arg0, boolean arg1, int arg2) {
        field2516++;
        if (!arg1) {
            field2511 = (class62) null;
        }
        for (int var3 = 0; var3 < class297.field5073; var3++) {
            class35 var4 = class247.method1726(var3, (byte) -93);
            if (var4 != null) {
                int var5 = var4.field461;
                if (var5 >= 0 && !class23.field248.method175(15411, var5)) {
                    var5 = -1;
                }
                int var9;
                if (var4.field456 >= 0) {
                    int var6 = var4.field456;
                    int var7 = (var6 & 0x7F) + arg2;
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 127) {
                        var7 = 127;
                    }
                    int var8 = (arg0 + var6 & 0xFC00) + (var6 & 0x380) + var7;
                    var9 = class23.field246[class176.method1241(65408, 96, var8)];
                } else if (var5 >= 0) {
                    var9 = class23.field246[class176.method1241(65408, 96, class23.field248.method173((byte) -74, var5))];
                } else if (var4.field466 == -1) {
                    var9 = -1;
                } else {
                    int var10 = var4.field466;
                    int var11 = (var10 & 0x7F) + arg2;
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 127) {
                        var11 = 127;
                    }
                    int var12 = (arg0 + var10 & 0xFC00) + (var10 & 0x380) + var11;
                    var9 = class23.field246[class176.method1241(65408, 96, var12)];
                }
                class192.field3234[var3 + 1] = var9;
            }
        }
    }
}
