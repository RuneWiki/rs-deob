import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public abstract class class243 {

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "Lma;")
    private static class5 field4041 = class12.method119("Started 3d library", (byte) 54);

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "Lma;")
    public static class5 field4042 = field4041;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "Lwj;")
    public static class153 field4040 = new class153(64);

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public static int field4043;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)Z", line = 11)
    public static final boolean method1708(int arg0) throws IOException {
        field4039++;
        if (class47.field725 == null) {
            return false;
        }
        int var1 = class47.field725.method1180(false);
        if (var1 == 0) {
            return false;
        }
        if (class167.field2549 == -1) {
            var1--;
            class47.field725.method1183(1, 0, -14925, class200.field3184.field3617);
            class200.field3184.field3610 = 0;
            class167.field2549 = class200.field3184.method1394(255);
            class171.field2625 = class272.field4646[class167.field2549];
        }
        if (class171.field2625 == -1) {
            if (var1 <= 0) {
                return false;
            }
            var1--;
            class47.field725.method1183(1, 0, -14925, class200.field3184.field3617);
            class171.field2625 = class200.field3184.field3617[0] & 0xFF;
        }
        if (class171.field2625 == -2) {
            if (var1 <= 1) {
                return false;
            }
            var1 -= 2;
            class47.field725.method1183(2, 0, -14925, class200.field3184.field3617);
            class200.field3184.field3610 = 0;
            class171.field2625 = class200.field3184.method1524((byte) 116);
        }
        if (class171.field2625 > var1) {
            return false;
        }
        class200.field3184.field3610 = 0;
        class47.field725.method1183(class171.field2625, 0, -14925, class200.field3184.field3617);
        class242.field4027 = class240.field3988;
        class15.field281 = 0;
        class240.field3988 = class177.field2703;
        class177.field2703 = class167.field2549;
        if (class167.field2549 == 92) {
            int var357 = class200.field3184.method1525(1);
            int var358 = class200.field3184.method1528(-113);
            class301.method2046(var357, 128, var358);
            class167.field2549 = -1;
            return true;
        } else if (class167.field2549 == 153) {
            class151.method950(0);
            int var353 = class200.field3184.method1495(96);
            int var354 = class200.field3184.method1499(false);
            int var355 = class200.field3184.method1544((byte) -61);
            class219.field3551[var355] = var353;
            class1.field9[var355] = var354;
            class264.field4519[var355] = 1;
            for (int var356 = 0; var356 < 98; var356++) {
                if (var353 >= class80.field1240[var356]) {
                    class264.field4519[var355] = var356 + 2;
                }
            }
            class130.field1953[class204.method1354(class260.field4433++, 31)] = var355;
            class167.field2549 = -1;
            return true;
        } else if (class167.field2549 == 214) {
            int var348 = class200.field3184.method1509(true);
            int var349 = class200.field3184.method1509(true);
            int var350 = class200.field3184.method1524((byte) 81);
            int var351 = class200.field3184.method1509(true);
            int var352 = class200.field3184.method1509(true);
            class9.method102(-13303, true, var348, var351, var349, var350, var352);
            class167.field2549 = -1;
            return true;
        } else if (class167.field2549 == 49) {
            class228.field3779 = class200.field3184.method1499(false);
            class174.field2661 = class200.field3184.method1544((byte) -76);
            class167.field2549 = -1;
            return true;
        } else if (class167.field2549 == 33) {
            int var2 = class200.field3184.method1524((byte) 60);
            class5 var3 = class200.field3184.method1501((byte) -56);
            int var4 = class200.field3184.method1524((byte) 51);
            class29.method208(-11561, var2);
            class265.method1826(2, var3, var4);
            class167.field2549 = -1;
            return true;
        } else if (class167.field2549 == 91) {
            int var5 = class200.field3184.method1517((byte) -123);
            int var6 = class200.field3184.method1524((byte) 78);
            if (var5 < -70000) {
                var6 += 32768;
            }
            class253 var7;
            if (var5 >= 0) {
                var7 = class172.method1140(var5, -121);
            } else {
                var7 = null;
            }
            if (var7 != null) {
                for (int var8 = 0; var8 < var7.field4257.length; var8++) {
                    var7.field4257[var8] = 0;
                    var7.field4317[var8] = 0;
                }
            }
            class46.method343(var6, 80);
            int var9 = class200.field3184.method1524((byte) 70);
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = class200.field3184.method1498((byte) -27);
                int var12 = class200.field3184.method1509(true);
                if (var12 == 255) {
                    var12 = class200.field3184.method1503((byte) -126);
                }
                if (var7 != null && var10 < var7.field4257.length) {
                    var7.field4257[var10] = var11;
                    var7.field4317[var10] = var12;
                }
                class10.method105((byte) 48, var10, var11 - 1, var6, var12);
            }
            if (var7 != null) {
                class29.method205(var7, (byte) 108);
            }
            class151.method950(0);
            class185.field2904[class204.method1354(class181.field2749++, 31)] = class204.method1354(var6, 32767);
            class167.field2549 = -1;
            return true;
        } else if (class167.field2549 == 88) {
            int var13 = class200.field3184.method1498((byte) -27);
            int var14 = class200.field3184.method1525(1);
            int var15 = class200.field3184.method1544((byte) -46);
            class174 var16 = (class174) class81.field1253.method1372(false, (long) var14);
            if (var16 != null) {
                class301.method2044(var16.field2660 != var13, 29786, var16);
            }
            class302.method2052(-117, var13, var14, var15);
            class167.field2549 = -1;
            return true;
        } else if (class167.field2549 == 226) {
            if (class207.field3291 != null) {
                class278.method1890(101);
            }
            byte[] var347 = new byte[class171.field2625];
            class200.field3184.method1395(class171.field2625, 0, var347, (byte) 101);
            class31.method215(class101.method645(var347, true, 0, class171.field2625), (byte) 114, true);
            class167.field2549 = -1;
            return true;
        } else if (class167.field2549 == 56) {
            class107.field1594 = class200.field3184.method1509(true);
            class156.field2317 = class200.field3184.method1509(true);
            class171.field2627 = class200.field3184.method1509(true);
            class167.field2549 = -1;
            return true;
        } else if (class167.field2549 == 194) {
            class33.method220(-72, false);
            class167.field2549 = -1;
            return true;
        } else if (class167.field2549 == 8) {
            int var343 = class200.field3184.method1527(true);
            int var344 = class200.field3184.method1498((byte) -27);
            int var345 = class200.field3184.method1544((byte) -82);
            class177 var346 = class119.field1804[var343];
            if (var346 != null) {
                class206.method1360(var344, -1, var345, var346);
            }
            class167.field2549 = -1;
            return true;
        } else if (class167.field2549 == 46) {
            int var340 = class200.field3184.method1503((byte) -126);
            int var341 = class200.field3184.method1505(-41);
            class253 var342 = class172.method1140(var340, -119);
            if (var342.field4300 != var341 || var341 == -1) {
                var342.field4336 = 0;
                var342.field4300 = var341;
                var342.field4191 = 0;
                class29.method205(var342, (byte) 98);
            }
            class167.field2549 = -1;
            return true;
        } else if (class167.field2549 == 247) {
            class151.method950(0);
            class210.field3353 = class200.field3184.method1509(true);
            class167.field2549 = -1;
            class123.field1868 = class303.field5107;
            return true;
        } else if (class167.field2549 == 87) {
            for (int var17 = 0; var17 < class149.field2149.length; var17++) {
                if (class149.field2149[var17] != class114.field1702[var17]) {
                    class149.field2149[var17] = class114.field1702[var17];
                    class179.method1167(var17, -24523764);
                    class164.field2500[class204.method1354(class100.field1494++, 31)] = var17;
                }
            }
            class167.field2549 = -1;
            return true;
        } else if (class167.field2549 == 182) {
            int var322 = class200.field3184.method1498((byte) -27);
            int var323 = class200.field3184.method1525(1);
            int var324 = class200.field3184.method1498((byte) -27);
            int var325 = class200.field3184.method1498((byte) -27);
            if (var323 >> 30 != 0) {
                int var326 = var323 >> 28 & 0x3;
                int var327 = (var323 & 0x3FFF) - class74.field1158;
                int var328 = ((var323 & 0xFFFE850) >> 14) - class193.field3017;
                if (var328 >= 0 && var327 >= 0 && var328 < 104 && var327 < 104) {
                    int var329 = var327 * 128 + 64;
                    int var330 = var328 * 128 + 64;
                    class92 var331 = new class92(var322, var326, var330, var329, class20.method161(var329, var330, 1, var326) - var324, var325, class50.field784);
                    class110.field1629.method1485(-8564, new class145(var331));
                }
            } else if (var323 >> 29 != 0) {
                int var336 = var323 & 0xFFFF;
                class177 var337 = class119.field1804[var336];
                if (var337 != null) {
                    var337.field213 = var324;
                    var337.field236 = 0;
                    var337.field199 = class50.field784 + var325;
                    var337.field195 = 0;
                    var337.field222 = var322;
                    if (class50.field784 < var337.field199) {
                        var337.field236 = -1;
                    }
                    if (var337.field222 == 65535) {
                        var337.field222 = -1;
                    }
                    if (var337.field222 != -1 && class50.field784 == var337.field199) {
                        int var338 = class57.method430(var337.field222, 22867872).field753;
                        if (var338 != -1) {
                            class33 var339 = class171.method1136(var338, -6722);
                            if (var339 != null && var339.field529 != null) {
                                class272.method1859(var337.field178, var337.field211, 64, 0, var339, false);
                            }
                        }
                    }
                }
            } else if (var323 >> 28 != 0) {
                int var332 = var323 & 0xFFFF;
                class91 var333;
                if (class161.field2460 == var332) {
                    var333 = class151.field2183;
                } else {
                    var333 = class267.field4593[var332];
                }
                if (var333 != null) {
                    var333.field199 = class50.field784 + var325;
                    var333.field236 = 0;
                    var333.field222 = var322;
                    if (var333.field199 > class50.field784) {
                        var333.field236 = -1;
                    }
                    var333.field213 = var324;
                    if (var333.field222 == 65535) {
                        var333.field222 = -1;
                    }
                    var333.field195 = 0;
                    if (var333.field222 != -1 && class50.field784 == var333.field199) {
                        int var334 = class57.method430(var333.field222, 22867872).field753;
                        if (var334 != -1) {
                            class33 var335 = class171.method1136(var334, -6722);
                            if (var335 != null && var335.field529 != null) {
                                class272.method1859(var333.field178, var333.field211, 64, 0, var335, class151.field2183 == var333);
                            }
                        }
                    }
                }
            }
            class167.field2549 = -1;
            return true;
        } else if (class167.field2549 == 95) {
            class303.field5106 = class200.field3184.method1509(true);
            class228.field3777 = class303.field5107;
            class167.field2549 = -1;
            return true;
        } else if (class167.field2549 == 192) {
            long var18 = class200.field3184.method1510(20396);
            int var20 = class200.field3184.method1524((byte) 64);
            int var21 = class200.field3184.method1509(true);
            class5 var22 = class250.field4145;
            boolean var23 = true;
            if (var18 < 0L) {
                var18 &= Long.MAX_VALUE;
                var23 = false;
            }
            if (var20 > 0) {
                var22 = class200.field3184.method1501((byte) -56);
            }
            class5 var24 = class245.method1719(var18, (byte) -45).method30(-106);
            for (int var25 = 0; var25 < class275.field4698; var25++) {
                if (class168.field2565[var25] == var18) {
                    if (class49.field771[var25] != var20) {
                        class49.field771[var25] = var20;
                        if (var20 > 0) {
                            class69.method497(24077, class250.field4145, 5, class288.method1940((byte) 106, new class5[] { var24, class185.field2873 }));
                        }
                        if (var20 == 0) {
                            class69.method497(24077, class250.field4145, 5, class288.method1940((byte) 75, new class5[] { var24, class250.field4139 }));
                        }
                    }
                    var24 = null;
                    class127.field1912[var25] = var22;
                    class91.field1376[var25] = var21;
                    class33.field516[var25] = var23;
                    break;
                }
            }
            if (var24 != null && class275.field4698 < 200) {
                class168.field2565[class275.field4698] = var18;
                class244.field4048[class275.field4698] = var24;
                class49.field771[class275.field4698] = var20;
                class127.field1912[class275.field4698] = var22;
                class91.field1376[class275.field4698] = var21;
                class33.field516[class275.field4698] = var23;
                class275.field4698++;
            }
            class228.field3777 = class303.field5107;
            boolean var26 = false;
            int var27 = class275.field4698;
            while (var27 > 0) {
                var27--;
                boolean var28 = true;
                for (int var29 = 0; var29 < var27; var29++) {
                    if (class49.field771[var29] != class239.field3967 && class49.field771[var29 + 1] == class239.field3967 || class49.field771[var29] == 0 && class49.field771[var29 + 1] != 0) {
                        var28 = false;
                        int var30 = class49.field771[var29];
                        class49.field771[var29] = class49.field771[var29 + 1];
                        class49.field771[var29 + 1] = var30;
                        class5 var31 = class127.field1912[var29];
                        class127.field1912[var29] = class127.field1912[var29 + 1];
                        class127.field1912[var29 + 1] = var31;
                        class5 var32 = class244.field4048[var29];
                        class244.field4048[var29] = class244.field4048[var29 + 1];
                        class244.field4048[var29 + 1] = var32;
                        long var33 = class168.field2565[var29];
                        class168.field2565[var29] = class168.field2565[var29 + 1];
                        class168.field2565[var29 + 1] = var33;
                        int var35 = class91.field1376[var29];
                        class91.field1376[var29] = class91.field1376[var29 + 1];
                        class91.field1376[var29 + 1] = var35;
                        boolean var36 = class33.field516[var29];
                        class33.field516[var29] = class33.field516[var29 + 1];
                        class33.field516[var29 + 1] = var36;
                    }
                }
                if (var28) {
                    break;
                }
            }
            class167.field2549 = -1;
            return true;
        } else if (class167.field2549 == 196) {
            int var37 = class200.field3184.method1517((byte) -113);
            int var38 = class200.field3184.method1517((byte) -122);
            class174 var39 = (class174) class81.field1253.method1372(false, (long) var37);
            class174 var40 = (class174) class81.field1253.method1372(false, (long) var38);
            if (var40 != null) {
                class301.method2044(var39 == null || var39.field2660 != var40.field2660, 29786, var40);
            }
            if (var39 != null) {
                var39.method1997(-27381);
                class81.field1253.method1376((long) var38, -1, var39);
            }
            class253 var41 = class172.method1140(var37, 24);
            if (var41 != null) {
                class29.method205(var41, (byte) 114);
            }
            class253 var42 = class172.method1140(var38, -116);
            if (var42 != null) {
                class29.method205(var42, (byte) 121);
                class171.method1134(true, -78, var42);
            }
            if (class255.field4354 != -1) {
                class8.method92(0, class255.field4354, 1);
            }
            class167.field2549 = -1;
            return true;
        } else if (class167.field2549 == 181) {
            class72.method514((byte) 125);
            class167.field2549 = -1;
            return true;
        } else if (class167.field2549 == 140) {
            int var43 = class200.field3184.method1524((byte) 96);
            int var44 = class200.field3184.method1498((byte) -27);
            class46.field707 = var44;
            class24.field416 = var43;
            class46.method345(-123);
            class167.field2549 = -1;
            return true;
        } else if (class167.field2549 == 246) {
            int var45 = class171.field2625 + class200.field3184.field3610;
            int var46 = class200.field3184.method1524((byte) 46);
            int var47 = class200.field3184.method1524((byte) 82);
            if (class255.field4354 != var46) {
                class255.field4354 = var46;
                class201.method1321(0, class255.field4354);
                class237.method1676(false, 0);
                class176.method1151(124, class255.field4354);
                for (int var48 = 0; var48 < 100; var48++) {
                    class296.field4975[var48] = true;
                }
            }
            while ((var47--) > 0) {
                int var49 = class200.field3184.method1517((byte) -112);
                int var50 = class200.field3184.method1524((byte) 126);
                int var51 = class200.field3184.method1509(true);
                class174 var52 = (class174) class81.field1253.method1372(false, (long) var49);
                if (var52 == null) {
                }
                if (var52 != null && var52.field2660 != var50) {
                    class301.method2044(true, 29786, var52);
                    var52 = null;
                }
                if (var52 == null) {
                    var52 = class302.method2052(119, var50, var49, var51);
                }
                var52.field2655 = true;
            }
            for (class174 var53 = (class174) class81.field1253.method1379(true); var53 != null; var53 = (class174) class81.field1253.method1380((byte) 66)) {
                if (var53.field2655) {
                    var53.field2655 = false;
                } else {
                    class301.method2044(true, 29786, var53);
                }
            }
            class270.field4629.method1382((byte) 66);
            while (var45 > class200.field3184.field3610) {
                int var54 = class200.field3184.method1517((byte) -113);
                int var55 = class200.field3184.method1524((byte) 97);
                int var56 = class200.field3184.method1524((byte) 98);
                int var57 = class200.field3184.method1517((byte) -118);
                for (int var58 = var55; var58 <= var56; var58++) {
                    long var59 = ((long) var54 << 32) + ((long) var58);
                    class270.field4629.method1376(var59, -1, new class276(var57));
                }
            }
            class167.field2549 = -1;
            return true;
        } else if (class167.field2549 == 22) {
            class100.field1484 = class171.field2625 / 8;
            for (int var321 = 0; var321 < class100.field1484; var321++) {
                class202.field3226[var321] = class200.field3184.method1510(20396);
                class153.field2239[var321] = class245.method1719(class202.field3226[var321], (byte) -45);
            }
            class228.field3777 = class303.field5107;
            class167.field2549 = -1;
            return true;
        } else if (class167.field2549 == 135) {
            class174.field2661 = class200.field3184.method1509(true);
            class228.field3779 = class200.field3184.method1544((byte) -124);
            while (class200.field3184.field3610 < class171.field2625) {
                class167.field2549 = class200.field3184.method1509(true);
                class68.method493(126);
            }
            class167.field2549 = -1;
            return true;
        } else if (class167.field2549 == 203) {
            int var319 = class200.field3184.method1524((byte) 91);
            int var320 = class200.field3184.method1495(120);
            class239.method1686(var320, var319, (byte) -127);
            class167.field2549 = -1;
            return true;
        } else if (class167.field2549 == 243) {
            long var304 = class200.field3184.method1510(20396);
            class200.field3184.method1543(false);
            long var306 = class200.field3184.method1510(20396);
            boolean var308 = false;
            long var309 = (long) class200.field3184.method1524((byte) 59);
            long var311 = (long) class200.field3184.method1497(3610);
            int var313 = class200.field3184.method1509(true);
            long var314 = (var309 << 32) + var311;
            int var316 = 0;
            label1556: while (true) {
                if (var316 >= 100) {
                    if (var313 <= 1) {
                        if (class57.field902 == 1 || class123.field1865 == 1) {
                            var308 = true;
                        } else {
                            for (int var317 = 0; var317 < class100.field1484; var317++) {
                                if (class202.field3226[var317] == var304) {
                                    var308 = true;
                                    break label1556;
                                }
                            }
                        }
                    }
                    break;
                }
                if (class188.field2945[var316] == var314) {
                    var308 = true;
                    break;
                }
                var316++;
            }
            if (!var308 && class236.field3904 == 0) {
                class188.field2945[class260.field4437] = var314;
                class260.field4437 = (class260.field4437 + 1) % 100;
                class5 var318 = class299.method2030(class103.method653(0, class200.field3184).method59(15624));
                if (var313 == 2 || var313 == 3) {
                    class276.method1874(class288.method1940((byte) 123, new class5[] { class301.field5070, class245.method1719(var304, (byte) -45).method30(-124) }), 9, var318, (byte) -85, class245.method1719(var306, (byte) -45).method30(-77));
                } else if (var313 == 1) {
                    class276.method1874(class288.method1940((byte) 67, new class5[] { class89.field1338, class245.method1719(var304, (byte) -45).method30(-109) }), 9, var318, (byte) -85, class245.method1719(var306, (byte) -45).method30(-78));
                } else {
                    class276.method1874(class245.method1719(var304, (byte) -45).method30(-112), 9, var318, (byte) -85, class245.method1719(var306, (byte) -45).method30(-92));
                }
            }
            class167.field2549 = -1;
            return true;
        } else if (class167.field2549 == 4) {
            int var301 = class200.field3184.method1499(false);
            int var302 = class200.field3184.method1509(true);
            int var303 = class200.field3184.method1547((byte) 50);
            class276.field4701 = var302 >> 1;
            class151.field2183.method121(var301, (var302 & 0x1) == 1, -22763, var303);
            class167.field2549 = -1;
            return true;
        } else if (class167.field2549 == 241) {
            int var61 = class200.field3184.method1498((byte) -27);
            class99.method636(0, var61);
            class185.field2904[class204.method1354(31, class181.field2749++)] = class204.method1354(var61, 32767);
            class167.field2549 = -1;
            return true;
        } else if (class167.field2549 == 106) {
            int var290 = class200.field3184.method1528(-109);
            if (var290 == 65535) {
                var290 = -1;
            }
            int var291 = class200.field3184.method1517((byte) -112);
            int var292 = var291 >> 28 & 0x3;
            int var293 = (var291 & 0xFFFF838) >> 14;
            int var294 = var291 & 0x3FFF;
            int var295 = class200.field3184.method1544((byte) -120);
            int var296 = var294 - class74.field1158;
            int var297 = var293 - class193.field3017;
            int var298 = var295 >> 2;
            int var299 = var295 & 0x3;
            int var300 = class103.field1526[var298];
            class116.method757(var300, var296, var292, -29360, var297, var298, var290, var299);
            class167.field2549 = -1;
            return true;
        } else if (class167.field2549 == 42) {
            class5 var62 = class200.field3184.method1501((byte) -56);
            if (var62.method39(class282.field4782, 0)) {
                class5 var63 = var62.method76(0, 0, var62.method73(-5069, class185.field2837));
                boolean var64 = false;
                long var65 = var63.method69(-49);
                for (int var67 = 0; var67 < class100.field1484; var67++) {
                    if (class202.field3226[var67] == var65) {
                        var64 = true;
                        break;
                    }
                }
                if (!var64 && class236.field3904 == 0) {
                    class69.method497(24077, var63, 4, class182.field2777);
                }
            } else if (var62.method39(class204.field3263, 0)) {
                class5 var68 = var62.method76(0, 0, var62.method73(-5069, class185.field2837));
                long var69 = var68.method69(-49);
                boolean var71 = false;
                for (int var72 = 0; var72 < class100.field1484; var72++) {
                    if (class202.field3226[var72] == var69) {
                        var71 = true;
                        break;
                    }
                }
                if (!var71 && class236.field3904 == 0) {
                    class5 var73 = var62.method76(0, var62.method73(-5069, class185.field2837) + 1, var62.method36(30673) - 9);
                    class69.method497(24077, var68, 8, var73);
                }
            } else if (var62.method39(class201.field3193, 0)) {
                class5 var98 = var62.method76(0, 0, var62.method73(-5069, class185.field2837));
                long var99 = var98.method69(-49);
                boolean var101 = false;
                for (int var102 = 0; var102 < class100.field1484; var102++) {
                    if (class202.field3226[var102] == var99) {
                        var101 = true;
                        break;
                    }
                }
                if (!var101 && class236.field3904 == 0) {
                    class69.method497(24077, var98, 10, class250.field4145);
                }
            } else if (var62.method39(class275.field4693, 0)) {
                class5 var74 = var62.method76(0, 0, var62.method73(-5069, class275.field4693));
                class69.method497(24077, class250.field4145, 11, var74);
            } else if (var62.method39(class88.field1322, 0)) {
                class5 var97 = var62.method76(0, 0, var62.method73(-5069, class88.field1322));
                if (class236.field3904 == 0) {
                    class69.method497(24077, class250.field4145, 12, var97);
                }
            } else if (var62.method39(class172.field2642, 0)) {
                class5 var75 = var62.method76(0, 0, var62.method73(-5069, class172.field2642));
                if (class236.field3904 == 0) {
                    class69.method497(24077, class250.field4145, 13, var75);
                }
            } else if (var62.method39(class249.field4117, 0)) {
                class5 var92 = var62.method76(0, 0, var62.method73(-5069, class185.field2837));
                long var93 = var92.method69(-49);
                boolean var95 = false;
                for (int var96 = 0; var96 < class100.field1484; var96++) {
                    if (class202.field3226[var96] == var93) {
                        var95 = true;
                        break;
                    }
                }
                if (!var95 && class236.field3904 == 0) {
                    class69.method497(24077, var92, 14, class250.field4145);
                }
            } else if (var62.method39(class93.field1417, 0)) {
                class5 var76 = var62.method76(0, 0, var62.method73(-5069, class185.field2837));
                long var77 = var76.method69(-49);
                boolean var79 = false;
                for (int var80 = 0; var80 < class100.field1484; var80++) {
                    if (class202.field3226[var80] == var77) {
                        var79 = true;
                        break;
                    }
                }
                if (!var79 && class236.field3904 == 0) {
                    class69.method497(24077, var76, 15, class250.field4145);
                }
            } else if (var62.method39(class77.field1210, 0)) {
                boolean var81 = false;
                class5 var82 = var62.method76(0, 0, var62.method73(-5069, class185.field2837));
                long var83 = var82.method69(-49);
                for (int var85 = 0; var85 < class100.field1484; var85++) {
                    if (class202.field3226[var85] == var83) {
                        var81 = true;
                        break;
                    }
                }
                if (!var81 && class236.field3904 == 0) {
                    class69.method497(24077, var82, 16, class250.field4145);
                }
            } else if (var62.method39(class49.field767, 0)) {
                class5 var86 = var62.method76(0, 0, var62.method73(-5069, class185.field2837));
                long var87 = var86.method69(-49);
                boolean var89 = false;
                for (int var90 = 0; var90 < class100.field1484; var90++) {
                    if (class202.field3226[var90] == var87) {
                        var89 = true;
                        break;
                    }
                }
                if (!var89 && class236.field3904 == 0) {
                    class5 var91 = var62.method76(0, var62.method73(-5069, class185.field2837) + 1, var62.method36(30673) + -9);
                    class69.method497(24077, var86, 21, var91);
                }
            } else {
                class69.method497(24077, class250.field4145, 0, var62);
            }
            class167.field2549 = -1;
            return true;
        } else if (class167.field2549 == 72) {
            class66.field1032 = class303.field5107;
            long var278 = class200.field3184.method1510(20396);
            if (var278 == 0L) {
                class223.field3669 = 0;
                class167.field2549 = -1;
                class110.field1631 = null;
                class66.field1033 = null;
                class231.field3844 = null;
                return true;
            }
            long var280 = class200.field3184.method1510(20396);
            class110.field1631 = class245.method1719(var280, (byte) -45);
            class66.field1033 = class245.method1719(var278, (byte) -45);
            class185.field2905 = class200.field3184.method1543(false);
            int var282 = class200.field3184.method1509(true);
            if (var282 == 255) {
                class167.field2549 = -1;
                return true;
            }
            class223.field3669 = var282;
            class301[] var283 = new class301[100];
            for (int var284 = 0; var284 < class223.field3669; var284++) {
                var283[var284] = new class301();
                var283[var284].field5004 = class200.field3184.method1510(20396);
                var283[var284].field5078 = class245.method1719(var283[var284].field5004, (byte) -45);
                var283[var284].field5071 = class200.field3184.method1524((byte) 73);
                var283[var284].field5068 = class200.field3184.method1543(false);
                var283[var284].field5087 = class200.field3184.method1501((byte) -56);
                if (class47.field729 == var283[var284].field5004) {
                    class86.field1297 = var283[var284].field5068;
                }
            }
            boolean var285 = false;
            int var286 = class223.field3669;
            while (var286 > 0) {
                var286--;
                boolean var287 = true;
                for (int var288 = 0; var288 < var286; var288++) {
                    if (var283[var288].field5078.method48(255, var283[var288 + 1].field5078) > 0) {
                        var287 = false;
                        class301 var289 = var283[var288];
                        var283[var288] = var283[var288 + 1];
                        var283[var288 + 1] = var289;
                    }
                }
                if (var287) {
                    break;
                }
            }
            class231.field3844 = var283;
            class167.field2549 = -1;
            return true;
        } else if (class167.field2549 == 184) {
            class115.method755(class267.field4597, class200.field3184, 30200, class171.field2625);
            class167.field2549 = -1;
            return true;
        } else if (class167.field2549 == 137) {
            int var275 = class200.field3184.method1528(-90);
            int var276 = class200.field3184.method1495(15);
            int var277 = class200.field3184.method1527(true);
            class29.method208(-11561, var277);
            class208.method1368(var275, var276, 3);
            class167.field2549 = -1;
            return true;
        } else if (class167.field2549 == 123) {
            int var273 = class200.field3184.method1517((byte) -114);
            class174 var274 = (class174) class81.field1253.method1372(false, (long) var273);
            if (var274 != null) {
                class301.method2044(true, 29786, var274);
            }
            if (class73.field1145 != null) {
                class29.method205(class73.field1145, (byte) 121);
                class73.field1145 = null;
            }
            class167.field2549 = -1;
            return true;
        } else if (class167.field2549 == 7) {
            long var259 = class200.field3184.method1510(20396);
            int var261 = class200.field3184.method1524((byte) 95);
            byte var262 = class200.field3184.method1543(false);
            boolean var263 = false;
            if ((var259 & Long.MIN_VALUE) != 0L) {
                var263 = true;
            }
            if (var263) {
                if (class223.field3669 == 0) {
                    class167.field2549 = -1;
                    return true;
                }
                boolean var264 = false;
                long var265 = var259 & Long.MAX_VALUE;
                int var267;
                for (var267 = 0; class223.field3669 > var267 && (class231.field3844[var267].field5004 != var265 || class231.field3844[var267].field5071 != var261); var267++) {
                }
                if (class223.field3669 > var267) {
                    while (class223.field3669 - 1 > var267) {
                        class231.field3844[var267] = class231.field3844[var267 + 1];
                        var267++;
                    }
                    class223.field3669--;
                    class231.field3844[class223.field3669] = null;
                }
            } else {
                class5 var268 = class200.field3184.method1501((byte) -56);
                class301 var269 = new class301();
                var269.field5004 = var259;
                var269.field5078 = class245.method1719(var269.field5004, (byte) -45);
                var269.field5071 = var261;
                var269.field5068 = var262;
                var269.field5087 = var268;
                int var270;
                for (var270 = class223.field3669 - 1; var270 >= 0; var270--) {
                    int var271 = class231.field3844[var270].field5078.method48(255, var269.field5078);
                    if (var271 == 0) {
                        class231.field3844[var270].field5071 = var261;
                        class231.field3844[var270].field5068 = var262;
                        class231.field3844[var270].field5087 = var268;
                        if (class47.field729 == var259) {
                            class86.field1297 = var262;
                        }
                        class167.field2549 = -1;
                        class66.field1032 = class303.field5107;
                        return true;
                    }
                    if (var271 < 0) {
                        break;
                    }
                }
                if (class223.field3669 >= class231.field3844.length) {
                    class167.field2549 = -1;
                    return true;
                }
                for (int var272 = class223.field3669 - 1; var272 > var270; var272--) {
                    class231.field3844[var272 + 1] = class231.field3844[var272];
                }
                if (class223.field3669 == 0) {
                    class231.field3844 = new class301[100];
                }
                class231.field3844[var270 + 1] = var269;
                if (class47.field729 == var259) {
                    class86.field1297 = var262;
                }
                class223.field3669++;
            }
            class167.field2549 = -1;
            class66.field1032 = class303.field5107;
            return true;
        } else if (class167.field2549 == 225) {
            class238.method1685((byte) -123, class200.field3184.method1501((byte) -56));
            class167.field2549 = -1;
            return true;
        } else if (class167.field2549 == 78) {
            long var245 = class200.field3184.method1510(20396);
            long var247 = (long) class200.field3184.method1524((byte) 118);
            long var249 = (long) class200.field3184.method1497(3610);
            int var251 = class200.field3184.method1509(true);
            int var252 = class200.field3184.method1524((byte) 58);
            boolean var253 = false;
            long var254 = (var247 << 32) + var249;
            int var256 = 0;
            label1458: while (true) {
                if (var256 >= 100) {
                    if (var251 <= 1) {
                        for (int var257 = 0; var257 < class100.field1484; var257++) {
                            if (class202.field3226[var257] == var245) {
                                var253 = true;
                                break label1458;
                            }
                        }
                    }
                    break;
                }
                if (class188.field2945[var256] == var254) {
                    var253 = true;
                    break;
                }
                var256++;
            }
            if (!var253 && class236.field3904 == 0) {
                class188.field2945[class260.field4437] = var254;
                class260.field4437 = (class260.field4437 + 1) % 100;
                class5 var258 = class91.method600(81, var252).method1654(true, class200.field3184);
                if (var251 == 2) {
                    class238.method1682(var252, var258, (class5) null, (byte) -113, 18, class288.method1940((byte) 79, new class5[] { class301.field5070, class245.method1719(var245, (byte) -45).method30(-85) }));
                } else if (var251 == 1) {
                    class238.method1682(var252, var258, (class5) null, (byte) -108, 18, class288.method1940((byte) 86, new class5[] { class89.field1338, class245.method1719(var245, (byte) -45).method30(-75) }));
                } else {
                    class238.method1682(var252, var258, (class5) null, (byte) -26, 18, class245.method1719(var245, (byte) -45).method30(-112));
                }
            }
            class167.field2549 = -1;
            return true;
        } else if (class167.field2549 == 68) {
            long var229 = class200.field3184.method1510(20396);
            class200.field3184.method1543(false);
            long var231 = class200.field3184.method1510(20396);
            long var233 = (long) class200.field3184.method1524((byte) 43);
            long var235 = (long) class200.field3184.method1497(3610);
            int var237 = class200.field3184.method1509(true);
            int var238 = class200.field3184.method1524((byte) 56);
            long var239 = (var233 << 32) + var235;
            boolean var241 = false;
            int var242 = 0;
            label1439: while (true) {
                if (var242 < 100) {
                    if (class188.field2945[var242] != var239) {
                        var242++;
                        continue;
                    }
                    var241 = true;
                    break;
                }
                if (var237 <= 1) {
                    for (int var243 = 0; var243 < class100.field1484; var243++) {
                        if (class202.field3226[var243] == var229) {
                            var241 = true;
                            break label1439;
                        }
                    }
                }
                break;
            }
            if (!var241 && class236.field3904 == 0) {
                class188.field2945[class260.field4437] = var239;
                class260.field4437 = (class260.field4437 + 1) % 100;
                class5 var244 = class91.method600(-80, var238).method1654(true, class200.field3184);
                if (var237 == 2 || var237 == 3) {
                    class238.method1682(var238, var244, class245.method1719(var231, (byte) -45).method30(-87), (byte) -90, 20, class288.method1940((byte) 93, new class5[] { class301.field5070, class245.method1719(var229, (byte) -45).method30(-119) }));
                } else if (var237 == 1) {
                    class238.method1682(var238, var244, class245.method1719(var231, (byte) -45).method30(-73), (byte) -46, 20, class288.method1940((byte) 92, new class5[] { class89.field1338, class245.method1719(var229, (byte) -45).method30(-68) }));
                } else {
                    class238.method1682(var238, var244, class245.method1719(var231, (byte) -45).method30(-67), (byte) -47, 20, class245.method1719(var229, (byte) -45).method30(-109));
                }
            }
            class167.field2549 = -1;
            return true;
        } else if (class167.field2549 == 104) {
            int var226 = class200.field3184.method1524((byte) 121);
            int var227 = class200.field3184.method1544((byte) -118);
            if (var227 == 2) {
                class274.method1868(25);
            }
            class255.field4354 = var226;
            class201.method1321(0, var226);
            class237.method1676(false, 0);
            class176.method1151(116, class255.field4354);
            for (int var228 = 0; var228 < 100; var228++) {
                class296.field4975[var228] = true;
            }
            class167.field2549 = -1;
            return true;
        } else if (class167.field2549 == 142) {
            int var103 = class200.field3184.method1517((byte) -123);
            class253 var104 = class172.method1140(var103, -115);
            var104.field4262 = 3;
            var104.field4183 = class151.field2183.field1369.method838(77);
            class29.method205(var104, (byte) 103);
            class167.field2549 = -1;
            return true;
        } else if (class167.field2549 == 127) {
            if (class255.field4354 != -1) {
                class8.method92(0, class255.field4354, 0);
            }
            class167.field2549 = -1;
            return true;
        } else if (class167.field2549 == 211) {
            int var105 = class200.field3184.method1524((byte) 50);
            if (var105 == 65535) {
                var105 = -1;
            }
            int var106 = class200.field3184.method1509(true);
            int var107 = class200.field3184.method1524((byte) 75);
            class188.method1236(var105, var106, 0, var107);
            class167.field2549 = -1;
            return true;
        } else if (class167.field2549 == 18) {
            int var108 = class200.field3184.method1527(true);
            int var109 = class200.field3184.method1527(true);
            int var110 = class200.field3184.method1517((byte) -108);
            class253 var111 = class172.method1140(var110, -111);
            var111.field4189 = (var108 << 16) + var109;
            class167.field2549 = -1;
            return true;
        } else if (class167.field2549 == 161) {
            for (int var224 = 0; var224 < class267.field4593.length; var224++) {
                if (class267.field4593[var224] != null) {
                    class267.field4593[var224].field238 = -1;
                }
            }
            for (int var225 = 0; var225 < class119.field1804.length; var225++) {
                if (class119.field1804[var225] != null) {
                    class119.field1804[var225].field238 = -1;
                }
            }
            class167.field2549 = -1;
            return true;
        } else if (class167.field2549 == 157) {
            class5 var220 = class200.field3184.method1501((byte) -56);
            Object[] var221 = new Object[var220.method36(30673) + 1];
            for (int var222 = var220.method36(30673) - 1; var222 >= 0; var222--) {
                if (var220.method65((byte) 93, var222) == 115) {
                    var221[var222 + 1] = class200.field3184.method1501((byte) -56);
                } else {
                    var221[var222 + 1] = Integer.valueOf(class200.field3184.method1517((byte) -110));
                }
            }
            var221[0] = Integer.valueOf(class200.field3184.method1517((byte) -119));
            class256 var223 = new class256();
            var223.field4372 = var221;
            class12.method122(var223, (byte) -116);
            class167.field2549 = -1;
            return true;
        } else if (class167.field2549 == 51) {
            class228.field3779 = class200.field3184.method1509(true);
            class174.field2661 = class200.field3184.method1547((byte) 63);
            for (int var217 = class228.field3779; var217 < class228.field3779 + 8; var217++) {
                for (int var218 = class174.field2661; var218 < class174.field2661 + 8; var218++) {
                    if (class91.field1358[class276.field4701][var217][var218] != null) {
                        class91.field1358[class276.field4701][var217][var218] = null;
                        class217.method1470((byte) -57, var218, var217);
                    }
                }
            }
            for (class186 var219 = (class186) class127.field1905.method1475(14); var219 != null; var219 = (class186) class127.field1905.method1486(38)) {
                if (var219.field2923 >= class228.field3779 && var219.field2923 < (class228.field3779 + 8) && var219.field2918 >= class174.field2661 && class174.field2661 + 8 > var219.field2918 && class276.field4701 == var219.field2920) {
                    var219.field2919 = 0;
                }
            }
            class167.field2549 = -1;
            return true;
        } else {
            if (arg0 >= -118) {
                method1709((byte) -100);
            }
            if (class167.field2549 == 80) {
                int var214 = class200.field3184.method1528(-95);
                int var215 = class200.field3184.method1499(false);
                int var216 = class200.field3184.method1528(-91);
                class29.method208(-11561, var214);
                class208.method1368(var216, var215, 3);
                class167.field2549 = -1;
                return true;
            } else if (class167.field2549 == 112) {
                int var112 = class200.field3184.method1509(true);
                int var113 = class200.field3184.method1509(true);
                int var114 = class200.field3184.method1509(true);
                int var115 = class200.field3184.method1509(true);
                int var116 = class200.field3184.method1524((byte) 103);
                client.field1751[var112] = true;
                class23.field392[var112] = var113;
                class80.field1235[var112] = var114;
                class260.field4442[var112] = var115;
                class249.field4118[var112] = var116;
                class167.field2549 = -1;
                return true;
            } else if (class167.field2549 == 116) {
                class88.field1317 = class200.field3184.method1498((byte) -27) * 30;
                class167.field2549 = -1;
                class123.field1868 = class303.field5107;
                return true;
            } else if (class167.field2549 == 145) {
                int var117 = class200.field3184.method1498((byte) -27);
                if (var117 == 65535) {
                    var117 = -1;
                }
                int var118 = class200.field3184.method1527(true);
                int var119 = class200.field3184.method1525(1);
                int var120 = class200.field3184.method1503((byte) -113);
                if (var118 == 65535) {
                    var118 = -1;
                }
                for (int var121 = var118; var121 <= var117; var121++) {
                    long var122 = ((long) var119 << 32) + (long) var121;
                    class297 var124 = class270.field4629.method1372(false, var122);
                    if (var124 != null) {
                        var124.method1997(-27381);
                    }
                    class270.field4629.method1376(var122, -1, new class276(var120));
                }
                class167.field2549 = -1;
                return true;
            } else if (class167.field2549 == 189) {
                class150.method941((byte) -20);
                class167.field2549 = -1;
                return false;
            } else if (class167.field2549 == 29) {
                int var213 = class200.field3184.method1509(true);
                if (class200.field3184.method1509(true) == 0) {
                    class80.field1243[var213] = new class296();
                } else {
                    class200.field3184.field3610--;
                    class80.field1243[var213] = new class296(class200.field3184);
                }
                class167.field2549 = -1;
                class207.field3292 = class303.field5107;
                return true;
            } else if (class167.field2549 == 250 || class167.field2549 == 64 || class167.field2549 == 9 || class167.field2549 == 93 || class167.field2549 == 55 || class167.field2549 == 252 || class167.field2549 == 213 || class167.field2549 == 215 || class167.field2549 == 52 || class167.field2549 == 237 || class167.field2549 == 73 || class167.field2549 == 126) {
                class68.method493(126);
                class167.field2549 = -1;
                return true;
            } else if (class167.field2549 == 178) {
                int var125 = class200.field3184.method1528(-118);
                int var126 = class200.field3184.method1503((byte) -120);
                class253 var127 = class172.method1140(var126, 59);
                if (var127 != null && var127.field4216 == 0) {
                    if ((var127.field4334 - var127.field4190) < var125) {
                        var125 = var127.field4334 - var127.field4190;
                    }
                    if (var125 < 0) {
                        var125 = 0;
                    }
                    if (var127.field4243 != var125) {
                        var127.field4243 = var125;
                        class29.method205(var127, (byte) 123);
                    }
                }
                class167.field2549 = -1;
                return true;
            } else if (class167.field2549 == 242) {
                class264.method1819((byte) -5);
                class167.field2549 = -1;
                return true;
            } else if (class167.field2549 == 45) {
                long var209 = class200.field3184.method1510(20396);
                int var211 = class200.field3184.method1524((byte) 121);
                class5 var212 = class91.method600(-80, var211).method1654(true, class200.field3184);
                class238.method1682(var211, var212, (class5) null, (byte) -61, 19, class245.method1719(var209, (byte) -45).method30(-121));
                class167.field2549 = -1;
                return true;
            } else if (class167.field2549 == 125) {
                class100.field1499 = class200.field3184.method1509(true);
                class167.field2549 = -1;
                return true;
            } else if (class167.field2549 == 114) {
                int var204 = class200.field3184.method1528(-113);
                int var205 = class200.field3184.method1525(1);
                int var206 = class200.field3184.method1524((byte) 58);
                int var207 = class200.field3184.method1527(true);
                class253 var208 = class172.method1140(var205, -109);
                if (var208.field4302 != var206 || var208.field4319 != var204 || var208.field4325 != var207) {
                    var208.field4302 = var206;
                    var208.field4319 = var204;
                    var208.field4325 = var207;
                    class29.method205(var208, (byte) 101);
                }
                class167.field2549 = -1;
                return true;
            } else if (class167.field2549 == 17) {
                long var128 = class200.field3184.method1510(20396);
                class5 var130 = class299.method2030(class103.method653(0, class200.field3184).method59(15624));
                class69.method497(24077, class245.method1719(var128, (byte) -45).method30(-85), 6, var130);
                class167.field2549 = -1;
                return true;
            } else if (class167.field2549 == 176) {
                int var131 = class200.field3184.method1524((byte) 59);
                if (var131 == 65535) {
                    var131 = -1;
                }
                class78.method539(var131, -108);
                class167.field2549 = -1;
                return true;
            } else if (class167.field2549 == 24) {
                int var132 = class200.field3184.method1497(3610);
                int var133 = class200.field3184.method1528(-115);
                if (var133 == 65535) {
                    var133 = -1;
                }
                class193.method1264(var132, 4, var133);
                class167.field2549 = -1;
                return true;
            } else if (class167.field2549 == 107) {
                int var201 = class200.field3184.method1547((byte) -112);
                class5 var202 = class200.field3184.method1501((byte) -56);
                int var203 = class200.field3184.method1544((byte) -70);
                if (var201 >= 1 && var201 <= 8) {
                    if (var202.method29(61, class81.field1265)) {
                        var202 = null;
                    }
                    class69.field1088[var201 - 1] = var202;
                    class302.field5094[var201 - 1] = var203 == 0;
                }
                class167.field2549 = -1;
                return true;
            } else if (class167.field2549 == 210) {
                int var197 = class200.field3184.method1500(true);
                int var198 = class200.field3184.method1518(2);
                int var199 = class200.field3184.method1495(102);
                class253 var200 = class172.method1140(var199, -117);
                var200.field4218 = 0;
                var200.field4322 = var200.field4268 = var198;
                var200.field4235 = var200.field4280 = var197;
                var200.field4229 = 0;
                class29.method205(var200, (byte) 123);
                class167.field2549 = -1;
                return true;
            } else if (class167.field2549 == 85) {
                int var134 = class200.field3184.method1509(true);
                int var135 = class200.field3184.method1509(true);
                int var136 = class200.field3184.method1524((byte) 125);
                int var137 = class200.field3184.method1509(true);
                int var138 = class200.field3184.method1509(true);
                class236.method1673(var138, 2, var135, var136, var137, var134);
                class167.field2549 = -1;
                return true;
            } else if (class167.field2549 == 204) {
                int var139 = class200.field3184.method1525(1);
                int var140 = class200.field3184.method1524((byte) 44);
                int var141 = class200.field3184.method1517((byte) -118);
                if (var140 == 65535) {
                    var140 = -1;
                }
                class253 var142 = class172.method1140(var139, 115);
                if (var142.field4265) {
                    var142.field4281 = var141;
                    var142.field4198 = var140;
                    class196 var143 = class235.method1664(88, var140);
                    var142.field4255 = var143.field3063;
                    var142.field4249 = var143.field3092;
                    var142.field4205 = var143.field3059;
                    var142.field4325 = var143.field3101;
                    var142.field4302 = var143.field3068;
                    var142.field4319 = var143.field3106;
                    if (var142.field4220 > 0) {
                        var142.field4325 = var142.field4325 * 32 / var142.field4220;
                    } else if (var142.field4283 > 0) {
                        var142.field4325 = var142.field4325 * 32 / var142.field4283;
                    }
                    class29.method205(var142, (byte) 108);
                } else if (var140 == -1) {
                    var142.field4262 = 0;
                    class167.field2549 = -1;
                    return true;
                } else {
                    class196 var144 = class235.method1664(89, var140);
                    var142.field4325 = var144.field3101 * 100 / var141;
                    var142.field4183 = var140;
                    var142.field4262 = 4;
                    var142.field4302 = var144.field3068;
                    var142.field4319 = var144.field3106;
                    class29.method205(var142, (byte) 116);
                }
                class167.field2549 = -1;
                return true;
            } else if (class167.field2549 == 98) {
                int var196 = class200.field3184.method1495(62);
                class197.field3137 = class267.field4597.method976(false, var196);
                class167.field2549 = -1;
                return true;
            } else if (class167.field2549 == 27) {
                int var193 = class200.field3184.method1498((byte) -27);
                int var194 = class200.field3184.method1527(true);
                class5 var195 = class200.field3184.method1501((byte) -56);
                class29.method208(-11561, var193);
                class265.method1826(2, var195, var194);
                class167.field2549 = -1;
                return true;
            } else if (class167.field2549 == 120) {
                byte var145 = class200.field3184.method1543(false);
                int var146 = class200.field3184.method1524((byte) 122);
                class301.method2046(var145, 128, var146);
                class167.field2549 = -1;
                return true;
            } else if (class167.field2549 == 201) {
                class217.method1463(-1);
                class151.method950(0);
                class100.field1494 += 32;
                class167.field2549 = -1;
                return true;
            } else if (class167.field2549 == 152) {
                int var147 = class200.field3184.method1503((byte) -120);
                class5 var148 = class200.field3184.method1501((byte) -56);
                class253 var149 = class172.method1140(var147, 18);
                if (!var148.method62(var149.field4327, -23269)) {
                    var149.field4327 = var148;
                    class29.method205(var149, (byte) 122);
                }
                class167.field2549 = -1;
                return true;
            } else if (class167.field2549 == 118) {
                int var150 = class200.field3184.method1509(true);
                class81 var151 = new class81();
                var151.field1259 = var150 & 0x3F;
                int var152 = var150 >> 6;
                var151.field1249 = class200.field3184.method1509(true);
                if (var151.field1249 >= 0 && var151.field1249 < class66.field1030.length) {
                    if (var151.field1259 == 1 || var151.field1259 == 10) {
                        var151.field1250 = class200.field3184.method1524((byte) 64);
                        class200.field3184.field3610 += 3;
                    } else if (var151.field1259 >= 2 && var151.field1259 <= 6) {
                        if (var151.field1259 == 2) {
                            var151.field1252 = 64;
                            var151.field1251 = 64;
                        }
                        if (var151.field1259 == 3) {
                            var151.field1252 = 0;
                            var151.field1251 = 64;
                        }
                        if (var151.field1259 == 4) {
                            var151.field1252 = 128;
                            var151.field1251 = 64;
                        }
                        if (var151.field1259 == 5) {
                            var151.field1251 = 0;
                            var151.field1252 = 64;
                        }
                        if (var151.field1259 == 6) {
                            var151.field1252 = 64;
                            var151.field1251 = 128;
                        }
                        var151.field1259 = 2;
                        var151.field1258 = class200.field3184.method1524((byte) 116);
                        var151.field1254 = class200.field3184.method1524((byte) 95);
                        var151.field1260 = class200.field3184.method1509(true);
                    }
                    var151.field1255 = class200.field3184.method1524((byte) 70);
                    if (var151.field1255 == 65535) {
                        var151.field1255 = -1;
                    }
                    class226.field3714[var152] = var151;
                }
                class167.field2549 = -1;
                return true;
            } else if (class167.field2549 == 128) {
                class213.field3383 = 0;
                class167.field2549 = -1;
                return true;
            } else if (class167.field2549 == 119) {
                class33.method220(-88, true);
                class167.field2549 = -1;
                return true;
            } else if (class167.field2549 == 2) {
                int var153 = class200.field3184.method1509(true);
                int var154 = class200.field3184.method1527(true);
                class239.method1686(var153, var154, (byte) -128);
                class167.field2549 = -1;
                return true;
            } else if (class167.field2549 == 154) {
                class31.method218(108);
                class167.field2549 = -1;
                return true;
            } else if (class167.field2549 == 188) {
                int var155 = class200.field3184.method1495(11);
                class253 var156 = class172.method1140(var155, 48);
                for (int var157 = 0; var157 < var156.field4257.length; var157++) {
                    var156.field4257[var157] = -1;
                    var156.field4257[var157] = 0;
                }
                class29.method205(var156, (byte) 93);
                class167.field2549 = -1;
                return true;
            } else if (class167.field2549 == 235) {
                int var190 = class200.field3184.method1503((byte) -116);
                int var191 = class200.field3184.method1498((byte) -27);
                if (var191 == 65535) {
                    var191 = -1;
                }
                class253 var192 = class172.method1140(var190, -115);
                if (var192.field4262 != 1 || var192.field4183 != var191) {
                    var192.field4262 = 1;
                    var192.field4183 = var191;
                    class29.method205(var192, (byte) 127);
                }
                class167.field2549 = -1;
                return true;
            } else if (class167.field2549 == 82) {
                long var177 = class200.field3184.method1510(20396);
                boolean var179 = false;
                long var180 = (long) class200.field3184.method1524((byte) 112);
                long var182 = (long) class200.field3184.method1497(3610);
                int var184 = class200.field3184.method1509(true);
                long var185 = (var180 << 32) + var182;
                int var187 = 0;
                label1318: while (true) {
                    if (var187 >= 100) {
                        if (var184 <= 1) {
                            if (class57.field902 == 1 || class123.field1865 == 1) {
                                var179 = true;
                            } else {
                                for (int var188 = 0; var188 < class100.field1484; var188++) {
                                    if (class202.field3226[var188] == var177) {
                                        var179 = true;
                                        break label1318;
                                    }
                                }
                            }
                        }
                        break;
                    }
                    if (class188.field2945[var187] == var185) {
                        var179 = true;
                        break;
                    }
                    var187++;
                }
                if (!var179 && class236.field3904 == 0) {
                    class188.field2945[class260.field4437] = var185;
                    class260.field4437 = (class260.field4437 + 1) % 100;
                    class5 var189 = class299.method2030(class103.method653(0, class200.field3184).method59(15624));
                    if (var184 == 2 || var184 == 3) {
                        class69.method497(24077, class288.method1940((byte) 126, new class5[] { class301.field5070, class245.method1719(var177, (byte) -45).method30(-97) }), 7, var189);
                    } else if (var184 == 1) {
                        class69.method497(24077, class288.method1940((byte) 89, new class5[] { class89.field1338, class245.method1719(var177, (byte) -45).method30(-116) }), 7, var189);
                    } else {
                        class69.method497(24077, class245.method1719(var177, (byte) -45).method30(-97), 3, var189);
                    }
                }
                class167.field2549 = -1;
                return true;
            } else if (class167.field2549 == 207) {
                int var174 = class200.field3184.method1524((byte) 85);
                int var175 = class200.field3184.method1525(1);
                if (var174 == 65535) {
                    var174 = -1;
                }
                class253 var176 = class172.method1140(var175, -109);
                if (var176.field4262 != 2 || var176.field4183 != var174) {
                    var176.field4262 = 2;
                    var176.field4183 = var174;
                    class29.method205(var176, (byte) 127);
                }
                class167.field2549 = -1;
                return true;
            } else if (class167.field2549 == 179) {
                class151.method950(0);
                class195.field3035 = class200.field3184.method1505(109);
                class123.field1868 = class303.field5107;
                class167.field2549 = -1;
                return true;
            } else if (class167.field2549 == 61) {
                boolean var158 = class200.field3184.method1547((byte) 83) == 1;
                int var159 = class200.field3184.method1495(81);
                class253 var160 = class172.method1140(var159, 42);
                if (var158 != var160.field4269) {
                    var160.field4269 = var158;
                    class29.method205(var160, (byte) 105);
                }
                class167.field2549 = -1;
                return true;
            } else if (class167.field2549 == 110) {
                if (class171.field2625 == 0) {
                    class81.field1257 = class119.field1802;
                } else {
                    class81.field1257 = class200.field3184.method1501((byte) -56);
                }
                class167.field2549 = -1;
                return true;
            } else if (class167.field2549 == 113) {
                class218.method1480(24, class200.field3184);
                class167.field2549 = -1;
                return true;
            } else if (class167.field2549 == 205) {
                int var161 = class200.field3184.method1517((byte) -109);
                int var162 = class200.field3184.method1524((byte) 116);
                class253 var163;
                if (var161 >= 0) {
                    var163 = class172.method1140(var161, -125);
                } else {
                    var163 = null;
                }
                if (var161 < -70000) {
                    var162 += 32768;
                }
                while (class171.field2625 > class200.field3184.field3610) {
                    int var164 = class200.field3184.method1507(-43);
                    int var165 = class200.field3184.method1524((byte) 67);
                    int var166 = 0;
                    if (var165 != 0) {
                        var166 = class200.field3184.method1509(true);
                        if (var166 == 255) {
                            var166 = class200.field3184.method1517((byte) -114);
                        }
                    }
                    if (var163 != null && var164 >= 0 && var163.field4257.length > var164) {
                        var163.field4257[var164] = var165;
                        var163.field4317[var164] = var166;
                    }
                    class10.method105((byte) 48, var164, var165 - 1, var162, var166);
                }
                if (var163 != null) {
                    class29.method205(var163, (byte) 93);
                }
                class151.method950(0);
                class185.field2904[class204.method1354(31, class181.field2749++)] = class204.method1354(var162, 32767);
                class167.field2549 = -1;
                return true;
            } else if (class167.field2549 == 134) {
                int var167 = class200.field3184.method1528(-109);
                int var168 = (var167 & 0x3F4) >> 5;
                int var169 = class200.field3184.method1517((byte) -113);
                int var170 = (var167 & 0x7ECB) >> 10;
                int var171 = var167 & 0x1F;
                int var172 = (var171 << 3) + (var168 << 11) + (var170 << 19);
                class253 var173 = class172.method1140(var169, 119);
                if (var173.field4310 != var172) {
                    var173.field4310 = var172;
                    class29.method205(var173, (byte) 107);
                }
                class167.field2549 = -1;
                return true;
            } else {
                class98.method630("T1 - " + class167.field2549 + "," + class240.field3988 + "," + class242.field4027 + " - " + class171.field2625, -91, (Throwable) null);
                class150.method941((byte) 79);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V", line = 2675)
    public static void method1709(byte arg0) {
        field4042 = null;
        field4041 = null;
        field4040 = null;
        if (arg0 != 95) {
            field4041 = (class5) null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILad;)V", line = 2694)
    public static final void method1710(int arg0, class167 arg1) {
        if (arg0 == -7962) {
            field4043++;
            class284.field4806 = arg1;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)[B")
    public abstract byte[] method1023(int arg0);

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "([BB)V")
    public abstract void method1024(byte[] arg0, byte arg1);
}
