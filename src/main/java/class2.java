import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class2 {

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
    public static int field19 = -1;

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "Lec;")
    public static class28 field22 = class28.method210(-46, "No matching objects found)1 please shorten search");

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "Lec;")
    public static class28 field17 = class28.method210(-46, ": ");

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "Lec;")
    public static class28 field20 = class28.method210(-46, "Please wait)3)3)3");

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "[I")
    public static int[] field25 = new int[50];

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "I")
    public static int field24 = 1;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "J")
    public static long field18 = 0L;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!aa", name = "m", descriptor = "[I")
    public static int[] field26;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
    public static final void method4(int arg0) {
        class109.field2273 = 0;
        int var1 = 87 / ((16 - arg0) / 51);
        field21++;
        for (int var2 = -1; var2 < class74.field1641 + class64.field1430; var2++) {
            class65 var19;
            if (var2 == -1) {
                var19 = class37.field848;
            } else if (var2 >= class74.field1641) {
                var19 = class88.field1956[class64.field1429[var2 - class74.field1641]];
            } else {
                var19 = class129.field2779[class4.field66[var2]];
            }
            if (var19 != null && var19.method343((byte) 110)) {
                if (var19 instanceof class90) {
                    class106 var20 = ((class90) var19).field1996;
                    if (var20.field2245 != null) {
                        var20 = var20.method736(false);
                    }
                    if (var20 == null) {
                        continue;
                    }
                }
                if (class74.field1641 <= var2) {
                    class106 var23 = ((class90) var19).field1996;
                    if (var23.field2246 >= 0 && class86.field1930.length > var23.field2246) {
                        class122.method925(var19, 89, var19.field1481 + 15);
                        if (class20.field434 > -1) {
                            class86.field1930[var23.field2246].method188(class20.field434 - 12, class57.field1308 - 30);
                        }
                    }
                    if (class110.field2314 == 1 && class64.field1429[var2 - class74.field1641] == class31.field659 && class83.field1888 % 20 < 10) {
                        class122.method925(var19, -122, var19.field1481 + 15);
                        if (class20.field434 > -1) {
                            class114.field2443[0].method188(class20.field434 - 12, class57.field1308 + -28);
                        }
                    }
                } else {
                    int var21 = 30;
                    class43 var22 = (class43) var19;
                    if (var22.field923 != -1 || var22.field916 != -1) {
                        class122.method925(var19, -127, var19.field1481 + 15);
                        if (class20.field434 > -1) {
                            if (var22.field923 != -1) {
                                class51.field1186[var22.field923].method188(class20.field434 - 12, -var21 + class57.field1308);
                                var21 += 25;
                            }
                            if (var22.field916 != -1) {
                                class86.field1930[var22.field916].method188(class20.field434 - 12, -var21 + class57.field1308);
                                var21 += 25;
                            }
                        }
                    }
                    if (var2 >= 0 && class110.field2314 == 10 && class4.field66[var2] == class90.field1986) {
                        class122.method925(var19, 101, var19.field1481 + 15);
                        if (class20.field434 > -1) {
                            class114.field2443[1].method188(class20.field434 - 12, -var21 + class57.field1308);
                        }
                    }
                }
                if (var19.field1435 != null && (class74.field1641 <= var2 || class16.field317 == 0 || class16.field317 == 3 || class16.field317 == 1 && class27.method200((byte) 25, ((class43) var19).field919))) {
                    class122.method925(var19, -124, var19.field1481);
                    if (class20.field434 > -1 && class109.field2279 > class109.field2273) {
                        class109.field2278[class109.field2273] = class126.field2737.method437(var19.field1435) / 2;
                        class109.field2282[class109.field2273] = class126.field2737.field1255;
                        class109.field2284[class109.field2273] = class20.field434;
                        class109.field2299[class109.field2273] = class57.field1308;
                        class109.field2305[class109.field2273] = var19.field1452;
                        class109.field2302[class109.field2273] = var19.field1497;
                        class109.field2289[class109.field2273] = var19.field1479;
                        class109.field2307[class109.field2273++] = var19.field1435;
                        if (class4.field71 == 0 && var19.field1497 >= 1 && var19.field1497 <= 3) {
                            class109.field2282[class109.field2273] += 10;
                            class109.field2299[class109.field2273] += 5;
                        }
                        if (class4.field71 == 0 && var19.field1497 == 4) {
                            class109.field2278[class109.field2273] = 60;
                        }
                        if (class4.field71 == 0 && var19.field1497 == 5) {
                            class109.field2282[class109.field2273] += 5;
                        }
                    }
                }
                if (class83.field1888 < var19.field1455) {
                    class122.method925(var19, -125, var19.field1481 + 15);
                    if (class20.field434 > -1) {
                        int var24 = var19.field1448 * 30 / var19.field1437;
                        if (var24 > 30) {
                            var24 = 30;
                        }
                        class120.method915(class20.field434 - 15, class57.field1308 + -3, var24, 5, 65280);
                        class120.method915(class20.field434 + var24 - 15, class57.field1308 + -3, 30 - var24, 5, 16711680);
                    }
                }
                for (int var25 = 0; var25 < 4; var25++) {
                    if (class83.field1888 < var19.field1502[var25]) {
                        class122.method925(var19, -124, var19.field1481 / 2);
                        if (class20.field434 > -1) {
                            if (var25 == 1) {
                                class57.field1308 -= 20;
                            }
                            if (var25 == 2) {
                                class20.field434 -= 15;
                                class57.field1308 -= 10;
                            }
                            if (var25 == 3) {
                                class20.field434 += 15;
                                class57.field1308 -= 10;
                            }
                            class57.field1304[var19.field1439[var25]].method188(class20.field434 - 12, class57.field1308 + -12);
                            class124.field2700.method435(class5.method25(6366, var19.field1483[var25]), class20.field434, class57.field1308 + 4, 0);
                            class124.field2700.method435(class5.method25(6366, var19.field1483[var25]), class20.field434 - 1, class57.field1308 + 3, 16777215);
                        }
                    }
                }
            }
        }
        for (int var3 = 0; var3 < class109.field2273; var3++) {
            int var4 = class109.field2284[var3];
            int var5 = class109.field2299[var3];
            int var6 = class109.field2278[var3];
            int var7 = class109.field2282[var3];
            boolean var8 = true;
            while (var8) {
                var8 = false;
                for (int var18 = 0; var18 < var3; var18++) {
                    if (class109.field2299[var18] - class109.field2282[var18] < var5 + 2 && class109.field2299[var18] + 2 > var5 - var7 && class109.field2284[var18] + class109.field2278[var18] > var4 - var6 && var4 + var6 > class109.field2284[var18] + -class109.field2278[var18] && var5 > class109.field2299[var18] - class109.field2282[var18]) {
                        var8 = true;
                        var5 = class109.field2299[var18] - class109.field2282[var18];
                    }
                }
            }
            class20.field434 = class109.field2284[var3];
            class57.field1308 = class109.field2299[var3] = var5;
            class28 var9 = class109.field2307[var3];
            if (class4.field71 == 0) {
                int var10 = 16776960;
                if (class109.field2305[var3] < 6) {
                    var10 = class122.field2629[class109.field2305[var3]];
                }
                if (class109.field2305[var3] == 6) {
                    var10 = class72.field1597 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (class109.field2305[var3] == 7) {
                    var10 = class72.field1597 % 20 < 10 ? 255 : 65535;
                }
                if (class109.field2305[var3] == 8) {
                    var10 = class72.field1597 % 20 < 10 ? 45056 : 8454016;
                }
                if (class109.field2305[var3] == 9) {
                    int var11 = 150 - class109.field2289[var3];
                    if (var11 < 50) {
                        var10 = var11 * 1280 + 16711680;
                    } else if (var11 < 100) {
                        var10 = 16384000 + 16776960 - var11 * 327680;
                    } else if (var11 < 150) {
                        var10 = var11 * 5 + 65280 - 500;
                    }
                }
                if (class109.field2305[var3] == 10) {
                    int var12 = 150 - class109.field2289[var3];
                    if (var12 < 50) {
                        var10 = var12 * 5 + 16711680;
                    } else if (var12 < 100) {
                        var10 = 16711935 + 16384000 - var12 * 327680;
                    } else if (var12 < 150) {
                        var10 = var12 * 327680 - var12 * 5 - 32767245;
                    }
                }
                if (class109.field2305[var3] == 11) {
                    int var13 = 150 - class109.field2289[var3];
                    if (var13 < 50) {
                        var10 = 16777215 - var13 * 327685;
                    } else if (var13 < 100) {
                        var10 = (var13 - 50) * 327685 + 65280;
                    } else if (var13 < 150) {
                        var10 = 16777215 - (var13 - 100) * 327680;
                    }
                }
                if (class109.field2302[var3] == 0) {
                    class126.field2737.method435(var9, class20.field434, class57.field1308 + 1, 0);
                    class126.field2737.method435(var9, class20.field434, class57.field1308, var10);
                }
                if (class109.field2302[var3] == 1) {
                    class126.field2737.method440(var9, class20.field434, class57.field1308 + 1, 0, class72.field1597);
                    class126.field2737.method440(var9, class20.field434, class57.field1308, var10, class72.field1597);
                }
                if (class109.field2302[var3] == 2) {
                    class126.field2737.method438(var9, class20.field434, class57.field1308 + 1, 0, class72.field1597);
                    class126.field2737.method438(var9, class20.field434, class57.field1308, var10, class72.field1597);
                }
                if (class109.field2302[var3] == 3) {
                    class126.field2737.method439(var9, class20.field434, class57.field1308 + 1, 0, class72.field1597, 150 - class109.field2289[var3]);
                    class126.field2737.method439(var9, class20.field434, class57.field1308, var10, class72.field1597, 150 - class109.field2289[var3]);
                }
                if (class109.field2302[var3] == 4) {
                    int var14 = class126.field2737.method437(var9);
                    int var15 = (var14 + 100) * (150 - class109.field2289[var3]) / 150;
                    class120.method918(class20.field434 - 50, 0, class20.field434 + 50, 334);
                    class126.field2737.method449(var9, class20.field434 + 50 - var15, class57.field1308 + 1, 0);
                    class126.field2737.method449(var9, class20.field434 + 50 - var15, class57.field1308, var10);
                    class120.method908();
                }
                if (class109.field2302[var3] == 5) {
                    int var16 = 150 - class109.field2289[var3];
                    class120.method918(0, class57.field1308 - class126.field2737.field1255 - 1, 512, class57.field1308 + 5);
                    int var17 = 0;
                    if (var16 < 25) {
                        var17 = var16 - 25;
                    } else if (var16 > 125) {
                        var17 = var16 - 125;
                    }
                    class126.field2737.method435(var9, class20.field434, class57.field1308 + var17 + 1, 0);
                    class126.field2737.method435(var9, class20.field434, class57.field1308 + var17, var10);
                    class120.method908();
                }
            } else {
                class126.field2737.method435(var9, class20.field434, class57.field1308 + 1, 0);
                class126.field2737.method435(var9, class20.field434, class57.field1308, 16776960);
            }
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IZI[B)I")
    public static final int method5(int arg0, boolean arg1, int arg2, byte[] arg3) {
        int var4 = -1;
        for (int var5 = arg0; var5 < arg2; var5++) {
            var4 = class21.field464[(arg3[var5] ^ var4) & 0xFF] ^ var4 >>> 8;
        }
        if (!arg1) {
            field20 = null;
        }
        int var6 = ~var4;
        field14++;
        return var6;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)V")
    public static void method6(int arg0) {
        if (arg0 != -1) {
            method5(-28, false, 46, null);
        }
        field25 = null;
        field26 = null;
        field17 = null;
        field22 = null;
        field20 = null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Z)I")
    public static final int method7(boolean arg0) {
        if (arg0) {
            return -8;
        } else {
            field16++;
            return 5;
        }
    }
}
