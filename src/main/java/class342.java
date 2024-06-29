import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class342 {

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "Z")
    public static boolean field5297 = false;

    @OriginalMember(owner = "client!rc", name = "r", descriptor = "Ljava/lang/String;")
    public static String field5312 = "Loaded world list data";

    @OriginalMember(owner = "client!rc", name = "u", descriptor = "I")
    public static int field5315 = 0;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public int field5295;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    public int field5296;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
    public int field5298;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
    public int field5299;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
    public int field5300;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
    public static int field5302;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "I")
    public static int field5303;

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "I")
    public static int field5304;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
    public int field5305;

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "I")
    public int field5306;

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "I")
    public static int field5307;

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "I")
    public int field5308;

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
    public int field5309;

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "I")
    public int field5310;

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "I")
    public static int field5311;

    @OriginalMember(owner = "client!rc", name = "s", descriptor = "I")
    public int field5313;

    @OriginalMember(owner = "client!rc", name = "t", descriptor = "I")
    public int field5314;

    @OriginalMember(owner = "client!rc", name = "v", descriptor = "I")
    public static int field5316;

    @OriginalMember(owner = "client!rc", name = "w", descriptor = "I")
    public int field5317;

    @OriginalMember(owner = "client!rc", name = "x", descriptor = "I")
    public int field5318;

    @OriginalMember(owner = "client!rc", name = "y", descriptor = "I")
    public int field5319;

    @OriginalMember(owner = "client!rc", name = "z", descriptor = "I")
    public int field5320;

    @OriginalMember(owner = "client!rc", name = "A", descriptor = "I")
    public int field5321;

    @OriginalMember(owner = "client!rc", name = "B", descriptor = "I")
    public int field5322;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "[I")
    public static int[] field5301;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V", line = 4)
    public static void method2366(int arg0) {
        field5301 = null;
        field5312 = null;
        if (arg0 != 136) {
            field5315 = 123;
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)V", line = 18)
    public static final void method2367(int arg0) {
        class175.field2535 = new class263[class285.field4490.method1183(8321)][];
        if (arg0 <= -22) {
            field5304++;
            class328.field5016 = new boolean[class285.field4490.method1183(8321)];
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)Lhi;", line = 52)
    public static final class307 method2368(byte arg0) {
        class307 var1;
        if (class250.field3787) {
            var1 = new class273(class99.field1288, class78.field988, class120.field1681[0], class223.field3150[0], class54.field664[0], class264.field4159[0], class153.field2105[0], class134.field1854);
        } else {
            var1 = new class234(class99.field1288, class78.field988, class120.field1681[0], class223.field3150[0], class54.field664[0], class264.field4159[0], class153.field2105[0], class134.field1854);
        }
        field5311++;
        class321.method2238(108);
        if (arg0 != 47) {
            method2367(-118);
        }
        return var1;
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)Z", line = 87)
    public static final boolean method2369(int arg0) throws IOException {
        field5303++;
        if (class236.field3463 == null) {
            return false;
        }
        int var1 = class236.field3463.method1091((byte) 18);
        if (var1 == 0) {
            return false;
        }
        if (class308.field4757 == -1) {
            class236.field3463.method1092(0, 1, arg0 - 1, class307.field4742.field1388);
            class307.field4742.field1400 = 0;
            class308.field4757 = class307.field4742.method567((byte) -100);
            var1--;
            class132.field1817 = class16.field226[class308.field4757];
        }
        if (class132.field1817 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class236.field3463.method1092(0, 1, ~arg0, class307.field4742.field1388);
            class132.field1817 = class307.field4742.field1388[0] & 0xFF;
            var1--;
        }
        if (class132.field1817 == -2) {
            if (var1 <= 1) {
                return false;
            }
            var1 -= 2;
            class236.field3463.method1092(0, 2, -1, class307.field4742.field1388);
            class307.field4742.field1400 = 0;
            class132.field1817 = class307.field4742.method624(14612);
        }
        if (var1 < class132.field1817) {
            return false;
        }
        class307.field4742.field1400 = arg0;
        class236.field3463.method1092(0, class132.field1817, -1, class307.field4742.field1388);
        class291.field4571 = 0;
        class5.field80 = class43.field507;
        class43.field507 = class260.field3938;
        class260.field3938 = class308.field4757;
        if (class308.field4757 == 50) {
            int var2 = class307.field4742.method637((byte) -121);
            int var3 = class307.field4742.method637((byte) 55);
            int var4 = class307.field4742.method638(-121);
            if (var4 == 65535) {
                var4 = -1;
            }
            int var5 = class307.field4742.method638(-126);
            if (class263.method1893(var5, arg0 ^ 0x48)) {
                class263 var6 = class91.method530(var2, arg0 + 10989328);
                if (var6.field3993) {
                    class198.method1363(var3, var4, (byte) -77, var2);
                    class93 var7 = class60.method353(var4, (byte) -105);
                    class195.method1352(var7.field1186, var7.field1198, var2, var7.field1214, true);
                    class107.method625(var7.field1156, var2, -2019839760, var7.field1218, var7.field1200);
                } else if (var4 == -1) {
                    class308.field4757 = -1;
                    var6.field4142 = 0;
                    return true;
                } else {
                    class93 var8 = class60.method353(var4, (byte) -80);
                    var6.field4131 = var8.field1186;
                    var6.field4136 = var8.field1214 * 100 / var3;
                    var6.field4120 = var8.field1198;
                    var6.field4142 = 4;
                    var6.field4034 = var4;
                    class239.method1712(arg0 ^ 0x0, var6);
                }
            }
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 232) {
            int var390 = class307.field4742.method655(-10505);
            int var391 = class307.field4742.method655(-10505);
            int var392 = class307.field4742.method676(true);
            if (class263.method1893(var390, arg0 ^ 0xFFFFFF9D)) {
                class229.method1611(var392, var391, -26078);
            }
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 83) {
            int var9 = class307.field4742.method655(-10505);
            int var10 = class307.field4742.method624(arg0 + 14612);
            int var11 = class307.field4742.method637((byte) 75);
            if (class263.method1893(var9, -107)) {
                class237.method1689(var11, var10, 12);
            }
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 145) {
            if (class146.field2031 != -1) {
                class90.method526(class146.field2031, 0, true);
            }
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 210) {
            int var387 = class307.field4742.method655(-10505);
            int var388 = class307.field4742.method624(arg0 ^ 0x3914);
            int var389 = class307.field4742.method637((byte) 85);
            if (var388 == 65535) {
                var388 = -1;
            }
            if (class263.method1893(var387, arg0 ^ 0xFFFFFFA1)) {
                class75.method453(var389, 0, 2, -1, var388);
            }
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 121) {
            class137.method910(118);
            class55.method330(true);
            class68.field889 += 32;
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 156) {
            class54.field663 = class331.field5060;
            long var12 = class307.field4742.method651(-13052);
            if (var12 == 0L) {
                class72.field913 = 0;
                class308.field4757 = -1;
                class225.field3189 = null;
                class170.field2394 = null;
                class20.field263 = null;
                return true;
            }
            long var14 = class307.field4742.method651(arg0 - 13052);
            class20.field263 = class248.method1783(var14, 0);
            class225.field3189 = class248.method1783(var12, 0);
            class329.field5035 = class307.field4742.method679(-3);
            int var16 = class307.field4742.method661(arg0 - 1);
            if (var16 == 255) {
                class308.field4757 = -1;
                return true;
            }
            class72.field913 = var16;
            class40[] var17 = new class40[100];
            for (int var18 = 0; var18 < class72.field913; var18++) {
                var17[var18] = new class40();
                var17[var18].field5065 = class307.field4742.method651(-13052);
                var17[var18].field476 = class248.method1783(var17[var18].field5065, 0);
                var17[var18].field471 = class307.field4742.method624(14612);
                var17[var18].field468 = class307.field4742.method679(-3);
                var17[var18].field473 = class307.field4742.method628(false);
                if (class267.field4208 == var17[var18].field5065) {
                    class224.field3164 = var17[var18].field468;
                }
            }
            boolean var19 = false;
            int var20 = class72.field913;
            while (var20 > 0) {
                boolean var21 = true;
                var20--;
                for (int var22 = 0; var22 < var20; var22++) {
                    if (var17[var22].field476.compareTo(var17[var22 + 1].field476) > 0) {
                        class40 var23 = var17[var22];
                        var17[var22] = var17[var22 + 1];
                        var21 = false;
                        var17[var22 + 1] = var23;
                    }
                }
                if (var21) {
                    break;
                }
            }
            class170.field2394 = var17;
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 117) {
            long var374 = class307.field4742.method651(-13052);
            long var376 = (long) class307.field4742.method624(14612);
            long var378 = (long) class307.field4742.method622((byte) 126);
            int var380 = class307.field4742.method661(-1);
            long var381 = (var376 << 32) + var378;
            boolean var383 = false;
            int var384 = 0;
            label1733: while (true) {
                if (var384 < 100) {
                    if (class115.field1624[var384] != var381) {
                        var384++;
                        continue;
                    }
                    var383 = true;
                    break;
                }
                if (var380 <= 1) {
                    if ((!class270.field4257 || class136.field1884) && !class316.field4872) {
                        for (int var385 = 0; var385 < class96.field1248; var385++) {
                            if (class113.field1615[var385] == var374) {
                                var383 = true;
                                break label1733;
                            }
                        }
                    } else {
                        var383 = true;
                    }
                }
                break;
            }
            if (!var383 && class191.field2761 == 0) {
                class115.field1624[class300.field4675] = var381;
                class300.field4675 = (class300.field4675 + 1) % 100;
                String var386 = class11.method57(class244.method1760(-57, class267.method1939(class307.field4742, true)));
                if (var380 == 2 || var380 == 3) {
                    class150.method1010(var386, 7, (byte) -59, "<img=1>" + class109.method743(var374, 1));
                } else if (var380 == 1) {
                    class150.method1010(var386, 7, (byte) -59, "<img=0>" + class109.method743(var374, 1));
                } else {
                    class150.method1010(var386, 3, (byte) -59, class109.method743(var374, arg0 + 1));
                }
            }
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 13) {
            class128.method854(false, (byte) 126);
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 19) {
            int var24 = class307.field4742.method624(14612);
            int var25 = class307.field4742.method638(-122);
            String var26 = class307.field4742.method628(false);
            if (class263.method1893(var24, arg0 + 11)) {
                class81.method486(var25, var26, 2);
            }
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 185) {
            int var369 = class307.field4742.method631((byte) 99);
            int var370 = class307.field4742.method655(arg0 - 10505);
            int var371 = class307.field4742.method661(-1);
            int var372 = class307.field4742.method638(arg0 ^ 0xFFFFFF82);
            if (class263.method1893(var372, arg0 - 109)) {
                class343 var373 = (class343) class292.field4585.method1537((long) var369, -22708);
                if (var373 != null) {
                    class84.method500(var373, var373.field5329 != var370, arg0 ^ 0x5A63);
                }
                class27.method167(var369, (byte) -120, var371, var370);
            }
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 108) {
            class55.method330(true);
            int var365 = class307.field4742.method669(-31662);
            int var366 = class307.field4742.method631((byte) 99);
            int var367 = class307.field4742.method659(false);
            class286.field4499[var367] = var366;
            class97.field1260[var367] = var365;
            class59.field723[var367] = 1;
            for (int var368 = 0; var368 < 98; var368++) {
                if (class129.field1790[var368] <= var366) {
                    class59.field723[var367] = var368 + 2;
                }
            }
            class295.field4607[class229.method1613(31, class74.field952++)] = var367;
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 238) {
            int var359 = class307.field4742.method676(true);
            int var360 = class307.field4742.method624(arg0 + 14612);
            if (var359 < -70000) {
                var360 += 32768;
            }
            class263 var361;
            if (var359 < 0) {
                var361 = null;
            } else {
                var361 = class91.method530(var359, 10989328);
            }
            while (class307.field4742.field1400 < class132.field1817) {
                int var362 = class307.field4742.method643(-14205);
                int var363 = class307.field4742.method624(arg0 + 14612);
                int var364 = 0;
                if (var363 != 0) {
                    var364 = class307.field4742.method661(~arg0);
                    if (var364 == 255) {
                        var364 = class307.field4742.method676(true);
                    }
                }
                if (var361 != null && var362 >= 0 && var361.field4132.length > var362) {
                    var361.field4132[var362] = var363;
                    var361.field4047[var362] = var364;
                }
                class321.method2236(var364, var363 - 1, arg0 + 6047, var360, var362);
            }
            if (var361 != null) {
                class239.method1712(0, var361);
            }
            class55.method330(true);
            class49.field598[class229.method1613(class256.field3896++, 31)] = class229.method1613(var360, 32767);
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 254) {
            int var27 = class307.field4742.method624(14612);
            int var28 = class307.field4742.method661(arg0 - 1);
            int var29 = class307.field4742.method661(-1);
            int var30 = class307.field4742.method624(14612);
            int var31 = class307.field4742.method661(-1);
            int var32 = class307.field4742.method661(-1);
            if (class263.method1893(var27, 65)) {
                class74.method451(var32, var29, var28, arg0 + 126, var31, true, var30);
            }
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 194) {
            int var33 = class307.field4742.method661(-1);
            int var34 = class307.field4742.method638(-123);
            int var35 = class307.field4742.method655(-10505);
            class184 var36 = class223.field3159[var34];
            if (var36 != null) {
                class289.method2068((byte) 120, var36, var35, var33);
            }
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 51) {
            class91.method533(class307.field4742.method628(false), 0);
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 201) {
            int var37 = class307.field4742.method683((byte) 124);
            String var38 = class307.field4742.method628(false);
            int var39 = class307.field4742.method655(-10505);
            if (class263.method1893(var37, arg0 - 103)) {
                class81.method486(var39, var38, 2);
            }
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 21) {
            int var354 = class307.field4742.method683((byte) -33);
            int var355 = class307.field4742.method655(-10505);
            int var356 = class307.field4742.method645((byte) -113);
            int var357 = class307.field4742.method624(14612);
            int var358 = class307.field4742.method638(-112);
            if (class263.method1893(var354, -92)) {
                class75.method453(var356, 0, 7, var357, var358 | var355 << 16);
            }
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 70) {
            int var320 = class307.field4742.method638(-115);
            int var321 = class307.field4742.method676(true);
            int var322 = class307.field4742.method624(14612);
            int var323 = class307.field4742.method683((byte) 115);
            if (var321 >> 30 != 0) {
                int var348 = var321 >> 28 & 0x3;
                int var349 = (var321 >> 14 & 0x3FFF) - class142.field1992;
                int var350 = (var321 & 0x3FFF) - class118.field1668;
                if (var349 >= 0 && var350 >= 0 && var349 < 104 && var350 < 104) {
                    int var351 = var350 * 128 + 64;
                    int var352 = var349 * 128 + 64;
                    class99 var353 = new class99(var322, var348, var352, var351, class184.method1278(var348, -13660, var351, var352) - var323, var320, class38.field463);
                    class104.field1345.method2325(new class180(var353), (byte) 34);
                }
            } else if (var321 >> 29 != 0) {
                int var324 = var321 & 0xFFFF;
                class184 var325 = class223.field3159[var324];
                if (var325 != null) {
                    boolean var326 = true;
                    if (var322 == 65535) {
                        var322 = -1;
                    }
                    if (var322 != -1 && var325.field2372 != -1) {
                        if (var325.field2372 == var322) {
                            class159 var327 = class120.method818((byte) 96, var322);
                            if (var327.field2196 && var327.field2205 != -1) {
                                class247 var328 = class185.method1289(var327.field2205, (byte) 125);
                                int var329 = var328.field3729;
                                if (var329 == 1) {
                                    var326 = false;
                                    var325.field2408 = 0;
                                    var325.field2412 = 1;
                                    var325.field2424 = 0;
                                    var325.field2396 = class38.field463 + var320;
                                    var325.field2449 = 0;
                                    class337.method2329(false, var328, (byte) -97, var325.field2392, var325.field2357, var325.field2449);
                                } else if (var329 == 2) {
                                    var325.field2356 = 0;
                                    var326 = false;
                                }
                            }
                        } else {
                            class159 var330 = class120.method818((byte) 96, var322);
                            class159 var331 = class120.method818((byte) 96, var325.field2372);
                            if (var330.field2205 != -1 && var331.field2205 != -1) {
                                class247 var332 = class185.method1289(var330.field2205, (byte) 114);
                                class247 var333 = class185.method1289(var331.field2205, (byte) 114);
                                if (var332.field3740 < var333.field3740) {
                                    var326 = false;
                                }
                            }
                        }
                    }
                    if (var326) {
                        var325.field2448 = var323;
                        var325.field2372 = var322;
                        var325.field2449 = 0;
                        var325.field2408 = 0;
                        var325.field2396 = class38.field463 + var320;
                        if (class38.field463 < var325.field2396) {
                            var325.field2449 = -1;
                        }
                        var325.field2412 = 1;
                        if (var325.field2372 != -1 && class38.field463 == var325.field2396) {
                            int var334 = class120.method818((byte) 96, var325.field2372).field2205;
                            if (var334 != -1) {
                                class247 var335 = class185.method1289(var334, (byte) 127);
                                if (var335 != null && var335.field3734 != null) {
                                    class337.method2329(false, var335, (byte) -97, var325.field2392, var325.field2357, 0);
                                }
                            }
                        }
                    }
                }
            } else if ((var321 >> 28) != 0) {
                int var336 = var321 & 0xFFFF;
                class109 var337;
                if (class117.field1655 == var336) {
                    var337 = class118.field1664;
                } else {
                    var337 = class328.field5009[var336];
                }
                if (var337 != null) {
                    boolean var338 = true;
                    if (var322 == 65535) {
                        var322 = -1;
                    }
                    if (var322 != -1 && var337.field2372 != -1) {
                        if (var337.field2372 == var322) {
                            class159 var343 = class120.method818((byte) 96, var322);
                            if (var343.field2196 && var343.field2205 != -1) {
                                class247 var344 = class185.method1289(var343.field2205, (byte) 116);
                                int var345 = var344.field3729;
                                if (var345 == 1) {
                                    var337.field2424 = 0;
                                    var337.field2412 = 1;
                                    var338 = false;
                                    var337.field2449 = 0;
                                    var337.field2396 = class38.field463 + var320;
                                    var337.field2408 = 0;
                                    class337.method2329(false, var344, (byte) -97, var337.field2392, var337.field2357, var337.field2449);
                                } else if (var345 == 2) {
                                    var338 = false;
                                    var337.field2356 = 0;
                                }
                            }
                        } else {
                            class159 var339 = class120.method818((byte) 96, var322);
                            class159 var340 = class120.method818((byte) 96, var337.field2372);
                            if (var339.field2205 != -1 && var340.field2205 != -1) {
                                class247 var341 = class185.method1289(var339.field2205, (byte) 115);
                                class247 var342 = class185.method1289(var340.field2205, (byte) 109);
                                if (var342.field3740 > var341.field3740) {
                                    var338 = false;
                                }
                            }
                        }
                    }
                    if (var338) {
                        var337.field2372 = var322;
                        var337.field2412 = 1;
                        var337.field2448 = var323;
                        var337.field2396 = class38.field463 + var320;
                        var337.field2449 = 0;
                        var337.field2408 = 0;
                        if (class38.field463 < var337.field2396) {
                            var337.field2449 = -1;
                        }
                        if (var337.field2372 == 65535) {
                            var337.field2372 = -1;
                        }
                        if (var337.field2372 != -1 && class38.field463 == var337.field2396) {
                            int var346 = class120.method818((byte) 96, var337.field2372).field2205;
                            if (var346 != -1) {
                                class247 var347 = class185.method1289(var346, (byte) 122);
                                if (var347 != null && var347.field3734 != null) {
                                    class337.method2329(class118.field1664 == var337, var347, (byte) -97, var337.field2392, var337.field2357, 0);
                                }
                            }
                        }
                    }
                }
            }
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 213 || class308.field4757 == 172 || class308.field4757 == 132 || class308.field4757 == 81 || class308.field4757 == 137 || class308.field4757 == 211 || class308.field4757 == 111 || class308.field4757 == 6 || class308.field4757 == 18 || class308.field4757 == 214 || class308.field4757 == 82 || class308.field4757 == 76 || class308.field4757 == 138 || class308.field4757 == 130) {
            class63.method393((byte) -126);
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 4) {
            int var317 = class307.field4742.method683((byte) 121);
            int var318 = class307.field4742.method631((byte) 99);
            int var319 = class307.field4742.method656(-64);
            if (class263.method1893(var317, arg0 + 50)) {
                class127.method849(var319, arg0 ^ 0x7A5, var318);
            }
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 10) {
            long var313 = class307.field4742.method651(-13052);
            int var315 = class307.field4742.method624(14612);
            String var316 = class135.method897((byte) 79, var315).method257(class307.field4742, (byte) -77);
            class146.method985(var315, var316, (byte) -125, 19, class109.method743(var313, 1), (String) null);
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 136) {
            class171.method1117((byte) -106);
            class308.field4757 = -1;
            return false;
        } else if (class308.field4757 == 227) {
            int var311 = class307.field4742.method659(false);
            int var312 = class307.field4742.method638(-114);
            if (var312 == 65535) {
                var312 = -1;
            }
            class304.method2130(arg0 - 35, var311, var312);
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 246) {
            int var40 = class307.field4742.method632(-8388608);
            int var41 = class307.field4742.method638(-111);
            if (var41 == 65535) {
                var41 = -1;
            }
            int var42 = class307.field4742.method669(-31662);
            class280.method2002(true, var41, var42, var40);
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 32) {
            class221.method1517(0);
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 79) {
            int var43 = class307.field4742.method683((byte) 118);
            int var44 = class307.field4742.method683((byte) -102);
            int var45 = class307.field4742.method676(true);
            if (var43 == 65535) {
                var43 = -1;
            }
            if (class263.method1893(var44, arg0 - 92)) {
                class75.method453(var45, 0, 1, -1, var43);
            }
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 24) {
            int var46 = class307.field4742.method638(-111);
            int var47 = class307.field4742.method652(0);
            class244.method1757(var46, 0, var47);
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 97) {
            int var308 = class307.field4742.method676(true);
            class263 var309 = class91.method530(var308, 10989328);
            for (int var310 = 0; var310 < var309.field4132.length; var310++) {
                var309.field4132[var310] = -1;
                var309.field4132[var310] = 0;
            }
            class239.method1712(0, var309);
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 30) {
            int var302 = class307.field4742.method624(arg0 + 14612);
            int var303 = class307.field4742.method661(-1);
            int var304 = class307.field4742.method661(-1);
            int var305 = class307.field4742.method624(14612);
            int var306 = class307.field4742.method661(-1);
            int var307 = class307.field4742.method661(-1);
            if (class263.method1893(var302, 99)) {
                class140.method931(var303, var306, var304, 1746656908, var307, var305);
            }
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 116) {
            int var298 = class307.field4742.method624(14612);
            int var299 = class307.field4742.method661(-1);
            int var300 = class307.field4742.method624(14612);
            int var301 = class307.field4742.method661(-1);
            if (var298 == 65535) {
                var298 = -1;
            }
            class74.method452((byte) -29, var298, var299, var301, var300);
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 11) {
            int var48 = class307.field4742.method624(14612);
            int var49 = class307.field4742.method661(arg0 - 1);
            int var50 = class307.field4742.method661(-1);
            int var51 = class307.field4742.method661(arg0 - 1);
            int var52 = class307.field4742.method661(-1);
            int var53 = class307.field4742.method624(14612);
            if (class263.method1893(var48, 1)) {
                class74.field958[var49] = true;
                class323.field4970[var49] = var50;
                class98.field1282[var49] = var51;
                class232.field3385[var49] = var52;
                class242.field3650[var49] = var53;
            }
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 229) {
            class55.method330(true);
            class223.field3154 = class307.field4742.method656(-87);
            class229.field3341 = class331.field5060;
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 212) {
            long var54 = class307.field4742.method651(-13052);
            class307.field4742.method679(-3);
            long var56 = class307.field4742.method651(arg0 - 13052);
            long var58 = (long) class307.field4742.method624(14612);
            long var60 = (long) class307.field4742.method622((byte) -21);
            int var62 = class307.field4742.method661(-1);
            int var63 = class307.field4742.method624(14612);
            boolean var64 = false;
            long var65 = (var58 << 32) + var60;
            int var67 = 0;
            label1287: while (true) {
                if (var67 < 100) {
                    if (class115.field1624[var67] != var65) {
                        var67++;
                        continue;
                    }
                    var64 = true;
                    break;
                }
                if (var62 <= 1) {
                    for (int var68 = 0; var68 < class96.field1248; var68++) {
                        if (class113.field1615[var68] == var54) {
                            var64 = true;
                            break label1287;
                        }
                    }
                }
                break;
            }
            if (!var64 && class191.field2761 == 0) {
                class115.field1624[class300.field4675] = var65;
                class300.field4675 = (class300.field4675 + 1) % 100;
                String var69 = class135.method897((byte) 79, var63).method257(class307.field4742, (byte) -96);
                if (var62 == 2 || var62 == 3) {
                    class146.method985(var63, var69, (byte) -125, 20, "<img=1>" + class109.method743(var54, 1), class109.method743(var56, 1));
                } else if (var62 == 1) {
                    class146.method985(var63, var69, (byte) -125, 20, "<img=0>" + class109.method743(var54, 1), class109.method743(var56, arg0 ^ 0x1));
                } else {
                    class146.method985(var63, var69, (byte) -125, 20, class109.method743(var54, 1), class109.method743(var56, arg0 ^ 0x1));
                }
            }
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 37) {
            class90.field1122 = class307.field4742.method655(arg0 ^ 0xFFFFD6F7) * 30;
            class308.field4757 = -1;
            class229.field3341 = class331.field5060;
            return true;
        } else if (class308.field4757 == 41) {
            if (class243.field3659 != null) {
                class35.method208(false, class191.field2746, -1, -1, 26332);
            }
            byte[] var70 = new byte[class132.field1817];
            class307.field4742.method575(0, 8, class132.field1817, var70);
            String var71 = class236.method1673(class132.field1817, 0, var70, arg0 ^ 0xFFFFFFFE);
            if (class329.field5029 == null && class265.field4178 == 3 || !class265.field4172.startsWith("win") || class311.field4806) {
                class15.method108((byte) -55, var71, true);
            } else {
                class163.field2257 = var71;
                class243.field3662 = true;
                class32.field408 = class9.field131.method1906(arg0 ^ 0x19F1, var71);
            }
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 134) {
            int var72 = class307.field4742.method683((byte) 127);
            class37.method223(var72, 128);
            class49.field598[class229.method1613(class256.field3896++, 31)] = class229.method1613(var72, 32767);
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 66) {
            int var73 = class307.field4742.method655(-10505);
            int var74 = class307.field4742.method624(arg0 + 14612);
            int var75 = class307.field4742.method655(arg0 - 10505);
            if (class263.method1893(var74, -111)) {
                class110.method752(6751, var75, var73);
            }
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 223) {
            int var76 = class307.field4742.method683((byte) -39);
            int var77 = class307.field4742.method631((byte) 99);
            int var78 = class307.field4742.method655(arg0 ^ 0xFFFFD6F7);
            if (class263.method1893(var76, arg0 + 82)) {
                class85.method503(var77, var78, (byte) 125);
            }
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 100) {
            int var79 = class307.field4742.method661(-1);
            if (class307.field4742.method661(-1) == 0) {
                class326.field4988[var79] = new class233();
            } else {
                class307.field4742.field1400--;
                class326.field4988[var79] = new class233(class307.field4742);
            }
            class308.field4757 = -1;
            class320.field4920 = class331.field5060;
            return true;
        } else if (class308.field4757 == 55) {
            int var290 = class307.field4742.method676(true);
            int var291 = class307.field4742.method624(14612);
            if (var290 < -70000) {
                var291 += 32768;
            }
            class263 var292;
            if (var290 < 0) {
                var292 = null;
            } else {
                var292 = class91.method530(var290, 10989328);
            }
            if (var292 != null) {
                for (int var293 = 0; var293 < var292.field4132.length; var293++) {
                    var292.field4132[var293] = 0;
                    var292.field4047[var293] = 0;
                }
            }
            class7.method26(arg0 ^ 0xFFFFFF8D, var291);
            int var294 = class307.field4742.method624(arg0 ^ 0x3914);
            for (int var295 = 0; var295 < var294; var295++) {
                int var296 = class307.field4742.method669(arg0 ^ 0xFFFF8452);
                if (var296 == 255) {
                    var296 = class307.field4742.method637((byte) -127);
                }
                int var297 = class307.field4742.method655(-10505);
                if (var292 != null && var295 < var292.field4132.length) {
                    var292.field4132[var295] = var297;
                    var292.field4047[var295] = var296;
                }
                class321.method2236(var296, var297 - 1, 6047, var291, var295);
            }
            if (var292 != null) {
                class239.method1712(0, var292);
            }
            class55.method330(true);
            class49.field598[class229.method1613(class256.field3896++, 31)] = class229.method1613(var291, 32767);
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 160) {
            int var80 = class307.field4742.method624(14612);
            int var81 = class307.field4742.method676(true);
            if (class263.method1893(var80, -127)) {
                class343 var82 = (class343) class292.field4585.method1537((long) var81, arg0 ^ 0xFFFFA74C);
                if (var82 != null) {
                    class84.method500(var82, true, arg0 + 23139);
                }
                if (class262.field3960 != null) {
                    class239.method1712(arg0, class262.field3960);
                    class262.field3960 = null;
                }
            }
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 101) {
            int var286 = class307.field4742.method661(-1);
            int var287 = var286 >> 5;
            int var288 = var286 & 0x1F;
            if (var288 == 0) {
                class167.field2328[var287] = null;
                class308.field4757 = -1;
                return true;
            }
            class219 var289 = new class219();
            var289.field3079 = var288;
            var289.field3079 = var286 & 0x3F;
            var289.field3075 = class307.field4742.method661(~arg0);
            if (var289.field3075 >= 0 && class141.field1970.length > var289.field3075) {
                if (var289.field3079 == 1 || var289.field3079 == 10) {
                    var289.field3077 = class307.field4742.method624(14612);
                    class307.field4742.field1400 += 5;
                } else if (var289.field3079 >= 2 && var289.field3079 <= 6) {
                    if (var289.field3079 == 2) {
                        var289.field3076 = 64;
                        var289.field3082 = 64;
                    }
                    if (var289.field3079 == 3) {
                        var289.field3076 = 64;
                        var289.field3082 = 0;
                    }
                    if (var289.field3079 == 4) {
                        var289.field3076 = 64;
                        var289.field3082 = 128;
                    }
                    if (var289.field3079 == 5) {
                        var289.field3076 = 0;
                        var289.field3082 = 64;
                    }
                    if (var289.field3079 == 6) {
                        var289.field3076 = 128;
                        var289.field3082 = 64;
                    }
                    var289.field3079 = 2;
                    var289.field3081 = class307.field4742.method624(arg0 + 14612);
                    var289.field3083 = class307.field4742.method624(14612);
                    var289.field3080 = class307.field4742.method661(arg0 - 1);
                    var289.field3074 = class307.field4742.method624(14612);
                }
                var289.field3084 = class307.field4742.method624(14612);
                if (var289.field3084 == 65535) {
                    var289.field3084 = -1;
                }
                class167.field2328[var287] = var289;
            }
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 243) {
            int var284 = class307.field4742.method637((byte) 25);
            int var285 = class307.field4742.method655(-10505);
            class244.method1757(var285, 0, var284);
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 249) {
            String var83 = class307.field4742.method628(false);
            if (var83.endsWith(":tradereq:")) {
                String var119 = var83.substring(0, var83.indexOf(":"));
                boolean var120 = false;
                long var121 = class48.method285((byte) -90, var119);
                for (int var123 = 0; var123 < class96.field1248; var123++) {
                    if (class113.field1615[var123] == var121) {
                        var120 = true;
                        break;
                    }
                }
                if (!var120 && class191.field2761 == 0) {
                    class150.method1010(class309.field4779, 4, (byte) -59, var119);
                }
            } else if (var83.endsWith(":chalreq:")) {
                String var84 = var83.substring(0, var83.indexOf(":"));
                boolean var85 = false;
                long var86 = class48.method285((byte) -90, var84);
                for (int var88 = 0; var88 < class96.field1248; var88++) {
                    if (class113.field1615[var88] == var86) {
                        var85 = true;
                        break;
                    }
                }
                if (!var85 && class191.field2761 == 0) {
                    String var89 = var83.substring(var83.indexOf(":") + 1, var83.length() + -9);
                    class150.method1010(var89, 8, (byte) -59, var84);
                }
            } else if (var83.endsWith(":assistreq:")) {
                String var90 = var83.substring(0, var83.indexOf(":"));
                long var91 = class48.method285((byte) -90, var90);
                boolean var93 = false;
                for (int var94 = 0; var94 < class96.field1248; var94++) {
                    if (class113.field1615[var94] == var91) {
                        var93 = true;
                        break;
                    }
                }
                if (!var93 && class191.field2761 == 0) {
                    class150.method1010("", 10, (byte) -59, var90);
                }
            } else if (var83.endsWith(":clan:")) {
                String var95 = var83.substring(0, var83.indexOf(":clan:"));
                class150.method1010(var95, 11, (byte) -59, "");
            } else if (var83.endsWith(":trade:")) {
                String var96 = var83.substring(0, var83.indexOf(":trade:"));
                if (class191.field2761 == 0) {
                    class150.method1010(var96, 12, (byte) -59, "");
                }
            } else if (var83.endsWith(":assist:")) {
                String var97 = var83.substring(0, var83.indexOf(":assist:"));
                if (class191.field2761 == 0) {
                    class150.method1010(var97, 13, (byte) -59, "");
                }
            } else if (var83.endsWith(":duelstake:")) {
                String var98 = var83.substring(0, var83.indexOf(":"));
                boolean var99 = false;
                long var100 = class48.method285((byte) -90, var98);
                for (int var102 = 0; var102 < class96.field1248; var102++) {
                    if (class113.field1615[var102] == var100) {
                        var99 = true;
                        break;
                    }
                }
                if (!var99 && class191.field2761 == 0) {
                    class150.method1010("", 14, (byte) -59, var98);
                }
            } else if (var83.endsWith(":duelfriend:")) {
                String var114 = var83.substring(0, var83.indexOf(":"));
                long var115 = class48.method285((byte) -90, var114);
                boolean var117 = false;
                for (int var118 = 0; var118 < class96.field1248; var118++) {
                    if (class113.field1615[var118] == var115) {
                        var117 = true;
                        break;
                    }
                }
                if (!var117 && class191.field2761 == 0) {
                    class150.method1010("", 15, (byte) -59, var114);
                }
            } else if (var83.endsWith(":clanreq:")) {
                boolean var109 = false;
                String var110 = var83.substring(0, var83.indexOf(":"));
                long var111 = class48.method285((byte) -90, var110);
                for (int var113 = 0; var113 < class96.field1248; var113++) {
                    if (class113.field1615[var113] == var111) {
                        var109 = true;
                        break;
                    }
                }
                if (!var109 && class191.field2761 == 0) {
                    class150.method1010("", 16, (byte) -59, var110);
                }
            } else if (var83.endsWith(":allyreq:")) {
                String var103 = var83.substring(0, var83.indexOf(":"));
                long var104 = class48.method285((byte) -90, var103);
                boolean var106 = false;
                for (int var107 = 0; var107 < class96.field1248; var107++) {
                    if (class113.field1615[var107] == var104) {
                        var106 = true;
                        break;
                    }
                }
                if (!var106 && class191.field2761 == 0) {
                    String var108 = var83.substring(var83.indexOf(":") + 1, var83.length() + -9);
                    class150.method1010(var108, 21, (byte) -59, var103);
                }
            } else {
                class150.method1010(var83, 0, (byte) -59, "");
            }
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 167) {
            int var283 = class307.field4742.method624(arg0 + 14612);
            if (class263.method1893(var283, 21)) {
                class300.method2117((byte) 102);
            }
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 102) {
            long var269 = class307.field4742.method651(arg0 ^ 0xFFFFCD04);
            long var271 = (long) class307.field4742.method624(arg0 + 14612);
            long var273 = (long) class307.field4742.method622((byte) -114);
            int var275 = class307.field4742.method661(-1);
            int var276 = class307.field4742.method624(14612);
            boolean var277 = false;
            long var278 = (var271 << 32) + var273;
            int var280 = 0;
            label1593: while (true) {
                if (var280 < 100) {
                    if (class115.field1624[var280] != var278) {
                        var280++;
                        continue;
                    }
                    var277 = true;
                    break;
                }
                if (var275 <= 1) {
                    for (int var281 = 0; var281 < class96.field1248; var281++) {
                        if (class113.field1615[var281] == var269) {
                            var277 = true;
                            break label1593;
                        }
                    }
                }
                break;
            }
            if (!var277 && class191.field2761 == 0) {
                class115.field1624[class300.field4675] = var278;
                class300.field4675 = (class300.field4675 + 1) % 100;
                String var282 = class135.method897((byte) 79, var276).method257(class307.field4742, (byte) 62);
                if (var275 == 2) {
                    class146.method985(var276, var282, (byte) -125, 18, "<img=1>" + class109.method743(var269, 1), (String) null);
                } else if (var275 == 1) {
                    class146.method985(var276, var282, (byte) -125, 18, "<img=0>" + class109.method743(var269, 1), (String) null);
                } else {
                    class146.method985(var276, var282, (byte) -125, 18, class109.method743(var269, 1), (String) null);
                }
            }
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 163) {
            class186.field2694 = class307.field4742.method659(false);
            class112.field1591 = class307.field4742.method669(-31662);
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 122) {
            int var124 = class307.field4742.method638(-109);
            int var125 = class307.field4742.method652(0);
            int var126 = class307.field4742.method645((byte) -100);
            if (class263.method1893(var124, -115)) {
                class29.method178((byte) 109, var126, var125);
            }
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 103) {
            class96.field1248 = class132.field1817 / 8;
            for (int var127 = 0; var127 < class96.field1248; var127++) {
                class113.field1615[var127] = class307.field4742.method651(-13052);
                class37.field439[var127] = class133.method886(class113.field1615[var127], (byte) 10);
                class100.field1317[var127] = false;
            }
            class186.field2686 = class331.field5060;
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 5) {
            int var268 = class307.field4742.method624(14612);
            if (class263.method1893(var268, 29)) {
                class135.method903((byte) 124);
            }
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 251) {
            int var128 = class307.field4742.method624(14612);
            int var129 = class307.field4742.method637((byte) 82);
            int var130 = class307.field4742.method647(15592);
            int var131 = class307.field4742.method656(88);
            if (class263.method1893(var128, 48)) {
                class44.method256(80, var129, var131, var130);
            }
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 64) {
            int var132 = class307.field4742.method669(-31662);
            int var133 = class307.field4742.method655(-10505);
            int var134 = class307.field4742.method655(-10505);
            if (class263.method1893(var134, 43)) {
                if (var132 == 2) {
                    class211.method1445(0);
                }
                class146.field2031 = var133;
                class303.method2125(var133, (byte) 36);
                class112.method774(-27290, false);
                class142.method944(7485, class146.field2031);
                for (int var135 = 0; var135 < 100; var135++) {
                    class285.field4483[var135] = true;
                }
            }
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 248) {
            class68.field894 = class307.field4742.method661(-1);
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 98) {
            class128.method854(true, (byte) 127);
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 255) {
            int var265 = class307.field4742.method638(-121);
            int var266 = class307.field4742.method638(-126);
            byte var267 = class307.field4742.method681(arg0 ^ 0x4);
            if (class263.method1893(var266, arg0 - 114)) {
                class229.method1611(var267, var265, -26078);
            }
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 155) {
            for (int var136 = 0; var136 < class226.field3235.length; var136++) {
                if (class226.field3235[var136] != class121.field1698[var136]) {
                    class226.field3235[var136] = class121.field1698[var136];
                    class319.method2227(var136, arg0 - 2708);
                    class319.field4908[class229.method1613(class68.field889++, 31)] = var136;
                }
            }
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 244) {
            class239.field3568 = class307.field4742.method661(-1);
            class186.field2686 = class331.field5060;
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 127) {
            class55.method330(true);
            class14.field188 = class307.field4742.method661(-1);
            class229.field3341 = class331.field5060;
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 78) {
            class165.method1084(class9.field131, class307.field4742, -4, class132.field1817);
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 38) {
            int var137 = class307.field4742.method624(arg0 ^ 0x3914);
            String var138 = class307.field4742.method628(false);
            Object[] var139 = new Object[var138.length() + 1];
            for (int var140 = var138.length() - 1; var140 >= 0; var140--) {
                if (var138.charAt(var140) == 's') {
                    var139[var140 + 1] = class307.field4742.method628(false);
                } else {
                    var139[var140 + 1] = Integer.valueOf(class307.field4742.method676(true));
                }
            }
            var139[0] = Integer.valueOf(class307.field4742.method676(true));
            if (class263.method1893(var137, 7)) {
                class176 var141 = new class176();
                var141.field2551 = var139;
                class283.method2027(200000, var141);
            }
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 154) {
            long var142 = class307.field4742.method651(-13052);
            int var144 = class307.field4742.method624(14612);
            byte var145 = class307.field4742.method679(-3);
            boolean var146 = false;
            if ((var142 & Long.MIN_VALUE) != 0L) {
                var146 = true;
            }
            if (var146) {
                if (class72.field913 == 0) {
                    class308.field4757 = -1;
                    return true;
                }
                boolean var147 = false;
                long var148 = var142 & Long.MAX_VALUE;
                int var150;
                for (var150 = 0; class72.field913 > var150 && (class170.field2394[var150].field5065 != var148 || class170.field2394[var150].field471 != var144); var150++) {
                }
                if (var150 < class72.field913) {
                    while (var150 < (class72.field913 - 1)) {
                        class170.field2394[var150] = class170.field2394[var150 + 1];
                        var150++;
                    }
                    class72.field913--;
                    class170.field2394[class72.field913] = null;
                }
            } else {
                String var151 = class307.field4742.method628(false);
                class40 var152 = new class40();
                var152.field5065 = var142;
                var152.field476 = class248.method1783(var152.field5065, 0);
                var152.field471 = var144;
                var152.field468 = var145;
                var152.field473 = var151;
                int var153;
                for (var153 = class72.field913 - 1; var153 >= 0; var153--) {
                    int var154 = class170.field2394[var153].field476.compareTo(var152.field476);
                    if (var154 == 0) {
                        class170.field2394[var153].field471 = var144;
                        class170.field2394[var153].field468 = var145;
                        class170.field2394[var153].field473 = var151;
                        class54.field663 = class331.field5060;
                        class308.field4757 = -1;
                        if (class267.field4208 == var142) {
                            class224.field3164 = var145;
                        }
                        return true;
                    }
                    if (var154 < 0) {
                        break;
                    }
                }
                if (class72.field913 >= class170.field2394.length) {
                    class308.field4757 = -1;
                    return true;
                }
                for (int var155 = class72.field913 - 1; var155 > var153; var155--) {
                    class170.field2394[var155 + 1] = class170.field2394[var155];
                }
                if (class72.field913 == 0) {
                    class170.field2394 = new class40[100];
                }
                class170.field2394[var153 + 1] = var152;
                if (class267.field4208 == var142) {
                    class224.field3164 = var145;
                }
                class72.field913++;
            }
            class308.field4757 = -1;
            class54.field663 = class331.field5060;
            return true;
        } else if (class308.field4757 == 196) {
            int var262 = class307.field4742.method631((byte) 99);
            int var263 = class307.field4742.method655(-10505);
            if (class263.method1893(var263, 96)) {
                int var264 = 0;
                if (class118.field1664.field1510 != null) {
                    var264 = class118.field1664.field1510.method2317(108);
                }
                class75.method453(var262, arg0, 3, -1, var264);
            }
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 180) {
            class279.method2000(-5262);
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 8) {
            int var261 = class307.field4742.method631((byte) 99);
            class135.field1872 = class9.field131.method1909(var261, true);
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 193) {
            for (int var259 = 0; var259 < class328.field5009.length; var259++) {
                if (class328.field5009[var259] != null) {
                    class328.field5009[var259].field2435 = -1;
                }
            }
            for (int var260 = 0; var260 < class223.field3159.length; var260++) {
                if (class223.field3159[var260] != null) {
                    class223.field3159[var260].field2435 = -1;
                }
            }
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 72) {
            int var156 = class307.field4742.method631((byte) 99);
            int var157 = class307.field4742.method624(arg0 + 14612);
            int var158 = class307.field4742.method624(14612);
            int var159 = class307.field4742.method655(-10505);
            if (var158 == 65535) {
                var158 = -1;
            }
            int var160 = class307.field4742.method683((byte) -22);
            if (var159 == 65535) {
                var159 = -1;
            }
            if (class263.method1893(var157, 85)) {
                for (int var161 = var158; var161 <= var159; var161++) {
                    long var162 = ((long) var156 << 32) + (long) var161;
                    class171 var164 = (class171) class277.field4315.method1537(var162, -22708);
                    class171 var165;
                    if (var164 != null) {
                        var165 = new class171(var164.field2467, var160);
                        var164.method2285(true);
                    } else if (var161 == -1) {
                        var165 = new class171(class91.method530(var156, 10989328).field4089.field2467, var160);
                    } else {
                        var165 = new class171(0, var160);
                    }
                    class277.field4315.method1541(false, var165, var162);
                }
            }
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 198) {
            class112.field1591 = class307.field4742.method661(-1);
            class186.field2694 = class307.field4742.method659(false);
            for (int var166 = class186.field2694; var166 < (class186.field2694 + 8); var166++) {
                for (int var167 = class112.field1591; var167 < class112.field1591 + 8; var167++) {
                    if (class269.field4239[class138.field1940][var166][var167] != null) {
                        class269.field4239[class138.field1940][var166][var167] = null;
                        class221.method1521(-123, var166, var167);
                    }
                }
            }
            for (class7 var168 = (class7) class74.field955.method2331((byte) 79); var168 != null; var168 = (class7) class74.field955.method2332(-109)) {
                if (class186.field2694 <= var168.field86 && var168.field86 < (class186.field2694 + 8) && class112.field1591 <= var168.field88 && (class112.field1591 + 8) > var168.field88 && class138.field1940 == var168.field102) {
                    var168.field92 = 0;
                }
            }
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 80) {
            class68.field898 = class307.field4742.method661(-1);
            class7.field107 = class307.field4742.method661(-1);
            class272.field4268 = class307.field4742.method661(-1);
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 252) {
            int var169 = class307.field4742.method631((byte) 99);
            int var170 = class307.field4742.method624(14612);
            int var171 = class307.field4742.method631((byte) 99);
            if (class263.method1893(var170, arg0 ^ 0xFFFFFFA7)) {
                class343 var172 = (class343) class292.field4585.method1537((long) var169, -22708);
                class343 var173 = (class343) class292.field4585.method1537((long) var171, -22708);
                if (var173 != null) {
                    class84.method500(var173, var172 == null || var172.field5329 != var173.field5329, arg0 ^ 0x5A63);
                }
                if (var172 != null) {
                    var172.method2285(true);
                    class292.field4585.method1541(false, var172, (long) var171);
                }
                class263 var174 = class91.method530(var169, 10989328);
                if (var174 != null) {
                    class239.method1712(0, var174);
                }
                class263 var175 = class91.method530(var171, 10989328);
                if (var175 != null) {
                    class239.method1712(0, var175);
                    class112.method769(var175, true, 268219088);
                }
                if (class146.field2031 != -1) {
                    class90.method526(class146.field2031, 1, true);
                }
            }
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 169) {
            long var240 = class307.field4742.method651(-13052);
            int var242 = class307.field4742.method624(14612);
            boolean var243 = true;
            if (var240 < 0L) {
                var240 &= Long.MAX_VALUE;
                var243 = false;
            }
            int var244 = class307.field4742.method661(-1);
            String var245 = "";
            if (var242 > 0) {
                var245 = class307.field4742.method628(false);
            }
            String var246 = class109.method743(var240, arg0 + 1);
            for (int var247 = 0; var247 < class74.field954; var247++) {
                if (class233.field3398[var247] == var240) {
                    if (class132.field1816[var247] != var242) {
                        class132.field1816[var247] = var242;
                        if (var242 > 0) {
                            class150.method1010(var246 + class229.field3342, 5, (byte) -59, "");
                        }
                        if (var242 == 0) {
                            class150.method1010(var246 + class218.field3062, 5, (byte) -59, "");
                        }
                    }
                    class330.field5039[var247] = var245;
                    class296.field4619[var247] = var244;
                    class154.field2114[var247] = var243;
                    var246 = null;
                    break;
                }
            }
            if (var246 != null && class74.field954 < 200) {
                class233.field3398[class74.field954] = var240;
                class76.field965[class74.field954] = var246;
                class132.field1816[class74.field954] = var242;
                class330.field5039[class74.field954] = var245;
                class296.field4619[class74.field954] = var244;
                class154.field2114[class74.field954] = var243;
                class74.field954++;
            }
            class186.field2686 = class331.field5060;
            boolean var248 = false;
            int var249 = class74.field954;
            while (var249 > 0) {
                boolean var250 = true;
                var249--;
                for (int var251 = 0; var251 < var249; var251++) {
                    if (class132.field1816[var251] != class109.field1500 && class132.field1816[var251 + 1] == class109.field1500 || class132.field1816[var251] == 0 && class132.field1816[var251 + 1] != 0) {
                        int var252 = class132.field1816[var251];
                        class132.field1816[var251] = class132.field1816[var251 + 1];
                        class132.field1816[var251 + 1] = var252;
                        var250 = false;
                        String var253 = class330.field5039[var251];
                        class330.field5039[var251] = class330.field5039[var251 + 1];
                        class330.field5039[var251 + 1] = var253;
                        String var254 = class76.field965[var251];
                        class76.field965[var251] = class76.field965[var251 + 1];
                        class76.field965[var251 + 1] = var254;
                        long var255 = class233.field3398[var251];
                        class233.field3398[var251] = class233.field3398[var251 + 1];
                        class233.field3398[var251 + 1] = var255;
                        int var257 = class296.field4619[var251];
                        class296.field4619[var251] = class296.field4619[var251 + 1];
                        class296.field4619[var251 + 1] = var257;
                        boolean var258 = class154.field2114[var251];
                        class154.field2114[var251] = class154.field2114[var251 + 1];
                        class154.field2114[var251 + 1] = var258;
                    }
                }
                if (var250) {
                    break;
                }
            }
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 16) {
            class308.field4757 = -1;
            class110.field1538 = 0;
            return true;
        } else if (class308.field4757 == 12) {
            int var176 = class307.field4742.method638(-112);
            int var177 = class307.field4742.method637((byte) 74);
            int var178 = class307.field4742.method638(-126);
            int var179 = class307.field4742.method655(arg0 - 10505);
            int var180 = class307.field4742.method683((byte) 125);
            if (class263.method1893(var176, -96)) {
                class195.method1352(var180, var178, var177, var179, true);
            }
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 109) {
            int var181 = class307.field4742.method624(14612);
            byte var182 = class307.field4742.method679(-3);
            class232.method1640(var181, var182, 0);
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 242) {
            class112.field1591 = class307.field4742.method661(arg0 - 1);
            class186.field2694 = class307.field4742.method669(-31662);
            while (class307.field4742.field1400 < class132.field1817) {
                class308.field4757 = class307.field4742.method661(~arg0);
                class63.method393((byte) -102);
            }
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 90) {
            int var238 = class307.field4742.method624(14612);
            int var239 = class307.field4742.method661(~arg0);
            if (class263.method1893(var238, arg0 ^ 0xFFFFFF86)) {
                class214.field3003 = var239;
            }
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 207) {
            String var234 = class307.field4742.method628(false);
            int var235 = class307.field4742.method652(0);
            int var236 = class307.field4742.method624(arg0 ^ 0x3914);
            if (var236 == 65535) {
                var236 = -1;
            }
            int var237 = class307.field4742.method661(-1);
            if (var235 >= 1 && var235 <= 8) {
                if (var234.equalsIgnoreCase("null")) {
                    var234 = null;
                }
                class112.field1594[var235 - 1] = var234;
                class295.field4605[var235 - 1] = var236;
                class325.field4981[var235 - 1] = var237 == 0;
            }
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 2) {
            long var219 = class307.field4742.method651(-13052);
            class307.field4742.method679(-3);
            long var221 = class307.field4742.method651(-13052);
            boolean var223 = false;
            long var224 = (long) class307.field4742.method624(14612);
            long var226 = (long) class307.field4742.method622((byte) 22);
            long var228 = (var224 << 32) + var226;
            int var230 = class307.field4742.method661(-1);
            int var231 = 0;
            label1513: while (true) {
                if (var231 >= 100) {
                    if (var230 <= 1) {
                        if ((!class270.field4257 || class136.field1884) && !class316.field4872) {
                            for (int var232 = 0; var232 < class96.field1248; var232++) {
                                if (class113.field1615[var232] == var219) {
                                    var223 = true;
                                    break label1513;
                                }
                            }
                        } else {
                            var223 = true;
                        }
                    }
                    break;
                }
                if (class115.field1624[var231] == var228) {
                    var223 = true;
                    break;
                }
                var231++;
            }
            if (!var223 && class191.field2761 == 0) {
                class115.field1624[class300.field4675] = var228;
                class300.field4675 = (class300.field4675 + 1) % 100;
                String var233 = class11.method57(class244.method1760(arg0 ^ 0xFFFFFFA1, class267.method1939(class307.field4742, true)));
                if (var230 == 2 || var230 == 3) {
                    class115.method789(var233, true, class109.method743(var221, 1), "<img=1>" + class109.method743(var219, 1), 9);
                } else if (var230 == 1) {
                    class115.method789(var233, true, class109.method743(var221, 1), "<img=0>" + class109.method743(var219, 1), 9);
                } else {
                    class115.method789(var233, true, class109.method743(var221, 1), class109.method743(var219, 1), 9);
                }
            }
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 92) {
            int var209 = class307.field4742.method624(14612);
            int var210 = class307.field4742.method638(-116);
            if (var209 == 65535) {
                var209 = -1;
            }
            int var211 = class307.field4742.method676(true);
            int var212 = class307.field4742.method638(-128);
            int var213 = class307.field4742.method637((byte) 84);
            if (var210 == 65535) {
                var210 = -1;
            }
            if (class263.method1893(var212, arg0 - 86)) {
                for (int var214 = var209; var214 <= var210; var214++) {
                    long var215 = ((long) var213 << 32) + ((long) var214);
                    class171 var217 = (class171) class277.field4315.method1537(var215, arg0 - 22708);
                    class171 var218;
                    if (var217 != null) {
                        var218 = new class171(var211, var217.field2468);
                        var217.method2285(true);
                    } else if (var214 == -1) {
                        var218 = new class171(var211, class91.method530(var213, arg0 + 10989328).field4089.field2468);
                    } else {
                        var218 = new class171(var211, -1);
                    }
                    class277.field4315.method1541(false, var218, var215);
                }
            }
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 143) {
            long var183 = class307.field4742.method651(-13052);
            String var185 = class11.method57(class244.method1760(-52, class267.method1939(class307.field4742, true)));
            class150.method1010(var185, 6, (byte) -59, class109.method743(var183, 1));
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 168) {
            int var186 = class307.field4742.method669(arg0 ^ 0xFFFF8452);
            int var187 = class307.field4742.method661(-1);
            int var188 = class307.field4742.method669(arg0 ^ 0xFFFF8452);
            class138.field1940 = var186 >> 1;
            class118.field1664.method749(0, var188, var187, (var186 & 0x1) == 1);
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 125) {
            class307.field4742.field1400 += 28;
            if (class307.field4742.method627(false)) {
                class272.method1967(class307.field4742, true, class307.field4742.field1400 - 28);
            }
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 39) {
            if (class132.field1817 == 0) {
                class267.field4210 = class15.field213;
            } else {
                class267.field4210 = class307.field4742.method628(false);
            }
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 142) {
            int var189 = class307.field4742.method631((byte) 99);
            int var190 = (var189 & 0xFFFFF69) >> 14;
            int var191 = (var189 & 0x38736E38) >> 28;
            int var192 = class307.field4742.method683((byte) -95);
            int var193 = var189 & 0x3FFF;
            if (var192 == 65535) {
                var192 = -1;
            }
            int var194 = class307.field4742.method659(false);
            int var195 = var193 - class118.field1668;
            int var196 = var194 >> 2;
            int var197 = var190 - class142.field1992;
            int var198 = var194 & 0x3;
            int var199 = class120.field1693[var196];
            class148.method997(var195, var196, (byte) -85, var191, var199, var192, var197, var198);
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 177) {
            int var205 = class307.field4742.method676(true);
            int var206 = class307.field4742.method624(14612);
            int var207 = class307.field4742.method638(-128);
            int var208 = class307.field4742.method624(14612);
            if (class263.method1893(var207, arg0 + 28)) {
                class181.method1253(13, var205, (var208 << 16) + var206);
            }
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 45) {
            int var200 = class307.field4742.method645((byte) -85);
            int var201 = class307.field4742.method655(-10505);
            class232.method1640(var201, var200, 0);
            class308.field4757 = -1;
            return true;
        } else if (class308.field4757 == 58) {
            int var202 = class307.field4742.method624(14612);
            String var203 = class307.field4742.method628(false);
            int var204 = class307.field4742.method676(true);
            if (class263.method1893(var202, arg0 ^ 0x68)) {
                class97.method588(false, var203, var204);
            }
            class308.field4757 = -1;
            return true;
        } else {
            class42.method245("T1 - " + class308.field4757 + "," + class43.field507 + "," + class5.field80 + " - " + class132.field1817, 1, (Throwable) null);
            class171.method1117((byte) -111);
            return true;
        }
    }
}
