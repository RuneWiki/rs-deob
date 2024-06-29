import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class126 {

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "I")
    public static int field2337 = 0;

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "Z")
    public static boolean field2340 = true;

    @OriginalMember(owner = "client!sk", name = "n", descriptor = "Lud;")
    public static class279 field2348 = class130.method1024("Atteindre", 255);

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "I")
    public static int field2342 = 0;

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "I")
    public static int field2341 = -1;

    @OriginalMember(owner = "client!sk", name = "k", descriptor = "I")
    public static int field2345 = 0;

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "Lud;")
    public static class279 field2339 = class130.method1024("Benutzeroberfl-=che geladen)3", 255);

    @OriginalMember(owner = "client!sk", name = "o", descriptor = "I")
    public static int field2349 = 0;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!sk", name = "i", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!sk", name = "j", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!sk", name = "l", descriptor = "I")
    public static int field2346;

    @OriginalMember(owner = "client!sk", name = "m", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!sk", name = "p", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "Lbn;")
    public static class66 field2338;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(BIILok;)[Lbn;", line = 8)
    public static final class66[] method1008(byte arg0, int arg1, int arg2, class149 arg3) {
        field2335++;
        if (class137.method1066(arg2, 25486, arg3, arg1)) {
            int var4 = 15 % ((57 - arg0) / 49);
            return class198.method1473(255);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)V", line = 27)
    public static void method1009(byte arg0) {
        field2339 = null;
        if (arg0 != -6) {
            method1013(15);
        }
        field2338 = null;
        field2348 = null;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)V", line = 41)
    public static final void method1010(int arg0, int arg1) {
        class84.field1591.method1339(arg1, arg0 ^ 0xFFFFFB23);
        field2346++;
        class312.field5519.method1339(arg1, 19326);
        if (arg0 != -20387) {
            method1009((byte) 24);
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)Z", line = 66)
    public static final boolean method1011(int arg0) throws IOException {
        field2343++;
        if (class202.field3603 == null) {
            return false;
        }
        int var1 = class202.field3603.method2023(117);
        if (var1 == 0) {
            return false;
        }
        if (class143.field2597 == -1) {
            class202.field3603.method2026(124, class287.field5106.field1168, 1, 0);
            var1--;
            class287.field5106.field1142 = 0;
            class143.field2597 = class287.field5106.method1626(22186);
            class264.field4741 = class244.field4343[class143.field2597];
        }
        if (class264.field4741 == -1) {
            if (var1 <= 0) {
                return false;
            }
            var1--;
            class202.field3603.method2026(81, class287.field5106.field1168, 1, 0);
            class264.field4741 = class287.field5106.field1168[0] & 0xFF;
        }
        if (class264.field4741 == -2) {
            if (var1 <= 1) {
                return false;
            }
            var1 -= 2;
            class202.field3603.method2026(arg0 ^ 0x7D, class287.field5106.field1168, 2, 0);
            class287.field5106.field1142 = 0;
            class264.field4741 = class287.field5106.method468(28214);
        }
        if (var1 < class264.field4741) {
            return false;
        }
        class287.field5106.field1142 = 0;
        class202.field3603.method2026(-126, class287.field5106.field1168, class264.field4741, 0);
        class232.field4070 = 0;
        class165.field2969 = class302.field5366;
        class302.field5366 = class100.field1862;
        class100.field1862 = class143.field2597;
        if (class143.field2597 == 76) {
            class92.field1743 = class287.field5106.method483(arg0 ^ 0x71);
            class162.field2923 = class249.field4443;
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 225) {
            int var2 = class287.field5106.method475(117);
            int var3 = class287.field5106.method475(-112);
            int var4 = class287.field5106.method448(-13244);
            int var5 = class287.field5106.method466(255);
            int var6 = class287.field5106.method475(-81);
            if (class1.method8((byte) 113, var3)) {
                class292.method2081(var6 | var5 << 16, 4, var4, 7, var2);
            }
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 253) {
            int var7 = class287.field5106.method491(-1268);
            byte var8 = class287.field5106.method494(false);
            class92.method789(var8, var7, (byte) -15);
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 86) {
            long var368 = class287.field5106.method469((byte) 42);
            int var370 = class287.field5106.method468(28214);
            class279 var371 = class230.method1666((byte) -19, var370).method2186(-19, class287.field5106);
            class170.method1325(0, var371, 19, (class279) null, var370, class72.method631(var368, 5702).method2016(-32));
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 217) {
            int var9 = class287.field5106.method448(-13244);
            int var10 = class287.field5106.method466(arg0 ^ 0xFFFFFF00);
            if (var10 == 65535) {
                var10 = -1;
            }
            int var11 = class287.field5106.method475(-10);
            if (class1.method8((byte) 113, var11)) {
                class292.method2081(var10, 4, var9, 2, -1);
            }
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 144) {
            if (class120.field2159 != null) {
                class103.method867(-1, 74, false, -1, class283.field5062);
            }
            byte[] var366 = new byte[class264.field4741];
            class287.field5106.method1633(0, var366, class264.field4741, 29497);
            class279 var367 = class194.method1457(0, class264.field4741, var366, false);
            if (class5.field115 == null && class305.field5415 == 3 || !class305.field5416.startsWith("win") || class278.field4915) {
                class112.method914((byte) -124, true, var367);
            } else {
                class324.field5662 = true;
                class32.field733 = var367;
                class249.field4444 = class110.field2022.method2157((byte) -24, new String(var367.method2008((byte) 111), "ISO-8859-1"));
            }
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 175) {
            int var12 = class287.field5106.method483(-119);
            int var13 = var12 >> 6;
            class130 var14 = new class130();
            var14.field2365 = var12 & 0x3F;
            var14.field2380 = class287.field5106.method483(arg0 - 108);
            if (var14.field2380 >= 0 && var14.field2380 < class199.field3557.length) {
                if (var14.field2365 == 1 || var14.field2365 == 10) {
                    var14.field2374 = class287.field5106.method468(28214);
                    class287.field5106.field1142 += 3;
                } else if (var14.field2365 >= 2 && var14.field2365 <= 6) {
                    if (var14.field2365 == 2) {
                        var14.field2379 = 64;
                        var14.field2375 = 64;
                    }
                    if (var14.field2365 == 3) {
                        var14.field2375 = 64;
                        var14.field2379 = 0;
                    }
                    if (var14.field2365 == 4) {
                        var14.field2375 = 64;
                        var14.field2379 = 128;
                    }
                    if (var14.field2365 == 5) {
                        var14.field2375 = 0;
                        var14.field2379 = 64;
                    }
                    if (var14.field2365 == 6) {
                        var14.field2375 = 128;
                        var14.field2379 = 64;
                    }
                    var14.field2365 = 2;
                    var14.field2371 = class287.field5106.method468(arg0 + 28215);
                    var14.field2370 = class287.field5106.method468(28214);
                    var14.field2372 = class287.field5106.method483(-108);
                }
                var14.field2364 = class287.field5106.method468(28214);
                if (var14.field2364 == 65535) {
                    var14.field2364 = -1;
                }
                class268.field4807[var13] = var14;
            }
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 154) {
            client.field4470 = class287.field5106.method483(arg0 ^ 0x78);
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 170) {
            int var363 = class287.field5106.method483(-117);
            int var364 = class287.field5106.method488((byte) 121);
            int var365 = class287.field5106.method470((byte) -7);
            class287.field5134 = var363 >> 1;
            class72.field1420.method1722((byte) -32, var364, var365, (var363 & 0x1) == 1);
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 106 || class143.field2597 == 165 || class143.field2597 == 186 || class143.field2597 == 98 || class143.field2597 == 52 || class143.field2597 == 231 || class143.field2597 == 190 || class143.field2597 == 54 || class143.field2597 == 208 || class143.field2597 == 60 || class143.field2597 == 79 || class143.field2597 == 194 || class143.field2597 == 147) {
            class294.method2091(-99);
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 42) {
            int var15 = class287.field5106.method491(-1268);
            if (var15 == 65535) {
                var15 = -1;
            }
            class167.method1307(var15, -1);
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 126) {
            int var16 = class287.field5106.method466(255);
            if (var16 == 65535) {
                var16 = -1;
            }
            int var17 = class287.field5106.method461((byte) 108);
            class315.method2226(var17, -1068, var16);
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 229) {
            class122.field2198 = class287.field5106.method488((byte) 118);
            class293.field5232 = class287.field5106.method483(-125);
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 93) {
            int var360 = class287.field5106.method448(-13244);
            int var361 = class287.field5106.method468(28214);
            int var362 = class287.field5106.method491(arg0 - 1267);
            if (class1.method8((byte) 113, var361)) {
                class21.method200(var360, -124, var362);
            }
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 250) {
            class297.method2100(119);
            int var18 = class287.field5106.method477(-1);
            int var19 = class287.field5106.method477(arg0);
            int var20 = class287.field5106.method456((byte) -116);
            class48.field972[var19] = var20;
            class200.field3576[var19] = var18;
            class104.field1955[var19] = 1;
            for (int var21 = 0; var21 < 98; var21++) {
                if (class250.field4452[var21] <= var20) {
                    class104.field1955[var19] = var21 + 2;
                }
            }
            class180.field3274[class52.method442(31, class252.field4500++)] = var19;
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 151) {
            int var356 = class287.field5106.method483(arg0 - 105);
            int var357 = class287.field5106.method468(28214);
            int var358 = class287.field5106.method483(-121);
            if (var357 == 65535) {
                var357 = -1;
            }
            class279 var359 = class287.field5106.method467((byte) -16);
            if (var356 >= 1 && var356 <= 8) {
                if (var359.method2010(class113.field2071, (byte) 82)) {
                    var359 = null;
                }
                class41.field866[var356 - 1] = var359;
                class162.field2925[var356 - 1] = var357;
                class23.field598[var356 - 1] = var358 == 0;
            }
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 101) {
            class314.field5536 = class287.field5106.method483(-121);
            class139.field2534 = class287.field5106.method483(-111);
            class174.field3137 = class287.field5106.method483(-110);
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 172) {
            int var355 = class287.field5106.method450((byte) 108);
            class178.field3226 = class110.field2022.method2169(var355, (byte) 39);
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 115) {
            int var349 = class287.field5106.method468(28214);
            int var350 = class287.field5106.method483(arg0 - 122);
            int var351 = class287.field5106.method483(-102);
            int var352 = class287.field5106.method468(28214);
            int var353 = class287.field5106.method483(arg0 ^ 0x69);
            int var354 = class287.field5106.method483(-125);
            if (class1.method8((byte) 113, var349)) {
                class238.method1713(var353, false, var354, var352, var350, var351);
            }
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 209) {
            int var346 = class287.field5106.method453(1);
            class8 var347 = class273.method1940(var346, arg0 - 46);
            for (int var348 = 0; var348 < var347.field319.length; var348++) {
                var347.field319[var348] = -1;
                var347.field319[var348] = 0;
            }
            class50.method426(var347, false);
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 222) {
            class194.field3498 = class264.field4741 / 8;
            for (int var345 = 0; var345 < class194.field3498; var345++) {
                class59.field1250[var345] = class287.field5106.method469((byte) 42);
                class248.field4417[var345] = class72.method631(class59.field1250[var345], 5702);
            }
            class143.field2597 = -1;
            class162.field2923 = class249.field4443;
            return true;
        } else if (class143.field2597 == 120) {
            int var325 = class287.field5106.method456((byte) -126);
            int var326 = class287.field5106.method466(255);
            int var327 = class287.field5106.method466(255);
            int var328 = class287.field5106.method466(255);
            if ((var325 >> 30) != 0) {
                int var329 = (var325 >> 14 & 0x3FFF) - class112.field2058;
                int var330 = (var325 & 0x3FFF) - class12.field396;
                int var331 = var325 >> 28 & 0x3;
                if (var329 >= 0 && var330 >= 0 && var329 < 104 && var330 < 104) {
                    int var332 = var330 * 128 + 64;
                    int var333 = var329 * 128 + 64;
                    class249 var334 = new class249(var328, var331, var333, var332, class130.method1025(var333, arg0 ^ 0xC3E13098, var331, var332) - var326, var327, class8.field279);
                    class107.field1996.method2246(true, new class121(var334));
                }
            } else if ((var325 >> 29) != 0) {
                int var340 = var325 & 0xFFFF;
                class102 var341 = class122.field2196[var340];
                if (var341 != null) {
                    if (var328 == 65535) {
                        var328 = -1;
                    }
                    boolean var342 = true;
                    if (var328 != -1 && var341.field81 != -1 && class131.method1033((byte) -82, class103.method874(var328, arg0 ^ 0x258).field3755).field3321 < class131.method1033((byte) -82, class103.method874(var341.field81, -601).field3755).field3321) {
                        var342 = false;
                    }
                    if (var342) {
                        var341.field7 = var326;
                        var341.field102 = 0;
                        var341.field81 = var328;
                        var341.field2 = 1;
                        var341.field75 = class8.field279 + var327;
                        var341.field5 = 0;
                        if (class8.field279 < var341.field75) {
                            var341.field5 = -1;
                        }
                        if (var341.field81 != -1 && class8.field279 == var341.field75) {
                            int var343 = class103.method874(var341.field81, arg0 ^ 0x258).field3755;
                            if (var343 != -1) {
                                class182 var344 = class131.method1033((byte) -82, var343);
                                if (var344 != null && var344.field3341 != null) {
                                    class194.method1460(false, var341.field86, 0, var344, var341.field79, (byte) 105);
                                }
                            }
                        }
                    }
                }
            } else if ((var325 >> 28) != 0) {
                int var335 = var325 & 0xFFFF;
                class239 var336;
                if (class79.field1506 == var335) {
                    var336 = class72.field1420;
                } else {
                    var336 = class96.field1780[var335];
                }
                if (var336 != null) {
                    if (var328 == 65535) {
                        var328 = -1;
                    }
                    boolean var337 = true;
                    if (var328 != -1 && var336.field81 != -1 && class131.method1033((byte) -82, class103.method874(var328, -601).field3755).field3321 < class131.method1033((byte) -82, class103.method874(var336.field81, -601).field3755).field3321) {
                        var337 = false;
                    }
                    if (var337) {
                        var336.field102 = 0;
                        var336.field7 = var326;
                        var336.field75 = class8.field279 + var327;
                        var336.field5 = 0;
                        var336.field81 = var328;
                        var336.field2 = 1;
                        if (var336.field75 > class8.field279) {
                            var336.field5 = -1;
                        }
                        if (var336.field81 == 65535) {
                            var336.field81 = -1;
                        }
                        if (var336.field81 != -1 && class8.field279 == var336.field75) {
                            int var338 = class103.method874(var336.field81, -601).field3755;
                            if (var338 != -1) {
                                class182 var339 = class131.method1033((byte) -82, var338);
                                if (var339 != null && var339.field3341 != null) {
                                    class194.method1460(class72.field1420 == var336, var336.field86, 0, var339, var336.field79, (byte) 110);
                                }
                            }
                        }
                    }
                }
            }
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 173) {
            class62.method546(class287.field5106, true);
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 212) {
            class60.method540(-26242, true);
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 237) {
            class31.method291(0);
            class297.method2100(28);
            class143.field2597 = -1;
            class64.field1320 += 32;
            return true;
        } else if (class143.field2597 == 49) {
            int var22 = class287.field5106.method477(arg0 ^ 0x0);
            int var23 = class287.field5106.method491(-1268);
            class13.method91(var23, var22, false);
            class143.field2597 = -1;
            return true;
        } else if (arg0 != -1) {
            return false;
        } else if (class143.field2597 == 69) {
            int var323 = class287.field5106.method456((byte) -115);
            int var324 = class287.field5106.method491(-1268);
            class13.method91(var324, var323, false);
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 155) {
            int var24 = class287.field5106.method475(-78);
            int var25 = class287.field5106.method456((byte) -128);
            int var26 = class287.field5106.method466(255);
            if (var26 == 65535) {
                var26 = -1;
            }
            int var27 = class287.field5106.method475(-4);
            int var28 = class287.field5106.method468(28214);
            if (var28 == 65535) {
                var28 = -1;
            }
            if (class1.method8((byte) 113, var27)) {
                for (int var29 = var26; var29 <= var28; var29++) {
                    long var30 = ((long) var25 << 32) + (long) var29;
                    class246 var32 = (class246) class262.field4668.method610(var30, -1);
                    class246 var33;
                    if (var32 != null) {
                        var33 = new class246(var32.field4372, var24);
                        var32.method2221(true);
                    } else if (var29 == -1) {
                        var33 = new class246(class273.method1940(var25, -26).field300.field4372, var24);
                    } else {
                        var33 = new class246(0, var24);
                    }
                    class262.field4668.method612(false, var33, var30);
                }
            }
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 189) {
            int var319 = class287.field5106.method466(255);
            int var320 = class287.field5106.method475(119);
            int var321 = class287.field5106.method477(-1);
            class102 var322 = class122.field2196[var320];
            if (var322 != null) {
                class38.method341(var322, var319, var321, (byte) 12);
            }
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 223) {
            long var34 = class287.field5106.method469((byte) 42);
            int var36 = class287.field5106.method468(28214);
            byte var37 = class287.field5106.method494(false);
            boolean var38 = false;
            if ((Long.MIN_VALUE & var34) != 0L) {
                var38 = true;
            }
            if (var38) {
                if (class59.field1243 == 0) {
                    class143.field2597 = -1;
                    return true;
                }
                long var39 = var34 & Long.MAX_VALUE;
                boolean var41 = false;
                int var42;
                for (var42 = 0; class59.field1243 > var42 && (class306.field5437[var42].field5539 != var39 || class306.field5437[var42].field2413 != var36); var42++) {
                }
                if (var42 < class59.field1243) {
                    while ((class59.field1243 - 1) > var42) {
                        class306.field5437[var42] = class306.field5437[var42 + 1];
                        var42++;
                    }
                    class59.field1243--;
                    class306.field5437[class59.field1243] = null;
                }
            } else {
                class279 var43 = class287.field5106.method467((byte) -16);
                class132 var44 = new class132();
                var44.field5539 = var34;
                var44.field2410 = class72.method631(var44.field5539, 5702);
                var44.field2411 = var37;
                var44.field2407 = var43;
                var44.field2413 = var36;
                int var45;
                for (var45 = class59.field1243 - 1; var45 >= 0; var45--) {
                    int var46 = class306.field5437[var45].field2410.method1995((byte) -123, var44.field2410);
                    if (var46 == 0) {
                        class306.field5437[var45].field2413 = var36;
                        class306.field5437[var45].field2411 = var37;
                        class306.field5437[var45].field2407 = var43;
                        if (class139.field2542 == var34) {
                            class102.field1901 = var37;
                        }
                        class323.field5646 = class249.field4443;
                        class143.field2597 = -1;
                        return true;
                    }
                    if (var46 < 0) {
                        break;
                    }
                }
                if (class59.field1243 >= class306.field5437.length) {
                    class143.field2597 = -1;
                    return true;
                }
                for (int var47 = class59.field1243 - 1; var47 > var45; var47--) {
                    class306.field5437[var47 + 1] = class306.field5437[var47];
                }
                if (class59.field1243 == 0) {
                    class306.field5437 = new class132[100];
                }
                class306.field5437[var45 + 1] = var44;
                class59.field1243++;
                if (class139.field2542 == var34) {
                    class102.field1901 = var37;
                }
            }
            class323.field5646 = class249.field4443;
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 236) {
            int var48 = class287.field5106.method491(arg0 ^ 0x4F3);
            int var49 = class287.field5106.method453(1);
            class92.method789(var49, var48, (byte) -15);
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 145) {
            int var50 = class287.field5106.method477(-1);
            int var51 = class287.field5106.method448(arg0 ^ 0x33BB);
            int var52 = class287.field5106.method491(-1268);
            if (class1.method8((byte) 113, var52)) {
                class107.method890(var51, arg0 ^ 0xFFFFFFF8, var50);
            }
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 72) {
            int var312 = class287.field5106.method475(-6);
            int var313 = class287.field5106.method453(arg0 + 2);
            int var314 = class287.field5106.method475(116);
            if (var312 == 65535) {
                var312 = -1;
            }
            int var315 = class287.field5106.method456((byte) -122);
            if (class1.method8((byte) 113, var314)) {
                class8 var316 = class273.method1940(var315, -120);
                if (var316.field223) {
                    class117.method945(var312, var313, (byte) -9, var315);
                    class157 var317 = class220.method1612(-2254, var312);
                    class5.method32(true, var317.field2833, var315, var317.field2821, var317.field2888);
                    class326.method2283(var317.field2882, var317.field2879, (byte) 3, var315, var317.field2864);
                } else if (var312 == -1) {
                    var316.field238 = 0;
                    class143.field2597 = -1;
                    return true;
                } else {
                    class157 var318 = class220.method1612(-2254, var312);
                    var316.field237 = var318.field2833;
                    var316.field238 = 4;
                    var316.field225 = var318.field2821 * 100 / var313;
                    var316.field227 = var318.field2888;
                    var316.field274 = var312;
                    class50.method426(var316, false);
                }
            }
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 123) {
            class63.method551(-127);
            class143.field2597 = -1;
            return false;
        } else if (class143.field2597 == 108) {
            class297.method2100(68);
            class90.field1707 = class287.field5106.method483(-119);
            class143.field2597 = -1;
            class18.field549 = class249.field4443;
            return true;
        } else if (class143.field2597 == 117) {
            int var53 = class287.field5106.method468(28214);
            class279 var54 = class287.field5106.method467((byte) -16);
            Object[] var55 = new Object[var54.method1984(8) + 1];
            for (int var56 = var54.method1984(8) - 1; var56 >= 0; var56--) {
                if (var54.method1973(true, var56) == 115) {
                    var55[var56 + 1] = class287.field5106.method467((byte) -16);
                } else {
                    var55[var56 + 1] = Integer.valueOf(class287.field5106.method453(arg0 + 2));
                }
            }
            var55[0] = Integer.valueOf(class287.field5106.method453(1));
            if (class1.method8((byte) 113, var53)) {
                class23 var57 = new class23();
                var57.field608 = var55;
                class279.method2017(0, var57);
            }
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 140) {
            int var58 = class287.field5106.method473((byte) -44);
            int var59 = class287.field5106.method501((byte) 88);
            int var60 = class287.field5106.method450((byte) 89);
            int var61 = class287.field5106.method475(-7);
            if (class1.method8((byte) 113, var61)) {
                class113.method920((byte) -66, var59, var60, var58);
            }
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 142) {
            class60.method540(-26242, false);
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 168) {
            int var311 = class287.field5106.method468(28214);
            if (class1.method8((byte) 113, var311)) {
                class84.method727(88);
            }
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 96) {
            int var305 = class287.field5106.method468(28214);
            int var306 = class287.field5106.method483(-120);
            int var307 = class287.field5106.method483(-113);
            int var308 = class287.field5106.method483(-114);
            int var309 = class287.field5106.method483(-112);
            int var310 = class287.field5106.method468(28214);
            if (class1.method8((byte) 113, var305)) {
                class13.field406[var306] = true;
                class21.field586[var306] = var307;
                class53.field1104[var306] = var308;
                class130.field2384[var306] = var309;
                class135.field2456[var306] = var310;
            }
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 211) {
            int var62 = class287.field5106.method453(arg0 + 2);
            int var63 = class287.field5106.method468(28214);
            if (var62 < -70000) {
                var63 += 32768;
            }
            class8 var64;
            if (var62 >= 0) {
                var64 = class273.method1940(var62, -72);
            } else {
                var64 = null;
            }
            if (var64 != null) {
                for (int var65 = 0; var65 < var64.field319.length; var65++) {
                    var64.field319[var65] = 0;
                    var64.field332[var65] = 0;
                }
            }
            class262.method1872(var63, true);
            int var66 = class287.field5106.method468(28214);
            for (int var67 = 0; var67 < var66; var67++) {
                int var68 = class287.field5106.method475(-27);
                int var69 = class287.field5106.method488((byte) 127);
                if (var69 == 255) {
                    var69 = class287.field5106.method450((byte) 122);
                }
                if (var64 != null && var67 < var64.field319.length) {
                    var64.field319[var67] = var68;
                    var64.field332[var67] = var69;
                }
                class184.method1425(var69, false, var63, var67, var68 - 1);
            }
            if (var64 != null) {
                class50.method426(var64, false);
            }
            class297.method2100(arg0 ^ 0xFFFFFFC7);
            class213.field3740[class52.method442(class54.field1189++, 31)] = class52.method442(32767, var63);
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 87) {
            int var304 = class287.field5106.method483(-123);
            if (class287.field5106.method483(-108) == 0) {
                class221.field3900[var304] = new class152();
            } else {
                class287.field5106.field1142--;
                class221.field3900[var304] = new class152(class287.field5106);
            }
            class143.field2597 = -1;
            class100.field1860 = class249.field4443;
            return true;
        } else if (class143.field2597 == 55) {
            int var301 = class287.field5106.method468(28214);
            int var302 = class287.field5106.method475(arg0 - 26);
            class279 var303 = class287.field5106.method467((byte) -16);
            if (class1.method8((byte) 113, var301)) {
                class39.method347((byte) -5, var302, var303);
            }
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 248) {
            class8.method46(13560);
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 227) {
            int var70 = class287.field5106.method468(28214);
            int var71 = class287.field5106.method483(-122);
            int var72 = class287.field5106.method483(-126);
            int var73 = class287.field5106.method468(28214);
            int var74 = class287.field5106.method483(-120);
            int var75 = class287.field5106.method483(-118);
            if (class1.method8((byte) 113, var70)) {
                class297.method2103(var74, var71, 0, var72, var73, true, var75);
            }
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 74) {
            class33.field748 = class287.field5106.method468(28214) * 30;
            class143.field2597 = -1;
            class18.field549 = class249.field4443;
            return true;
        } else if (class143.field2597 == 215) {
            int var298 = class287.field5106.method491(-1268);
            int var299 = class287.field5106.method448(-13244);
            if (class1.method8((byte) 113, var298)) {
                int var300 = 0;
                if (class72.field1420.field4189 != null) {
                    var300 = class72.field1420.field4189.method371(-88);
                }
                class292.method2081(var300, arg0 ^ 0xFFFFFFFB, var299, 3, -1);
            }
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 245) {
            long var295 = class287.field5106.method469((byte) 42);
            class279 var297 = class49.method414(class58.method529(class287.field5106, (byte) -34).method2005(arg0 ^ 0xFFFFFF3F));
            class59.method532(var297, class72.method631(var295, 5702).method2016(-32), 6, 29437);
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 11) {
            class323.field5646 = class249.field4443;
            long var283 = class287.field5106.method469((byte) 42);
            if (var283 == 0L) {
                class304.field5394 = null;
                class306.field5437 = null;
                class67.field1324 = null;
                class59.field1243 = 0;
                class143.field2597 = -1;
                return true;
            }
            long var285 = class287.field5106.method469((byte) 42);
            class304.field5394 = class72.method631(var285, 5702);
            class67.field1324 = class72.method631(var283, 5702);
            class273.field4862 = class287.field5106.method494(false);
            int var287 = class287.field5106.method483(-120);
            if (var287 == 255) {
                class143.field2597 = -1;
                return true;
            }
            class132[] var288 = new class132[100];
            class59.field1243 = var287;
            for (int var289 = 0; var289 < class59.field1243; var289++) {
                var288[var289] = new class132();
                var288[var289].field5539 = class287.field5106.method469((byte) 42);
                var288[var289].field2410 = class72.method631(var288[var289].field5539, 5702);
                var288[var289].field2413 = class287.field5106.method468(28214);
                var288[var289].field2411 = class287.field5106.method494(false);
                var288[var289].field2407 = class287.field5106.method467((byte) -16);
                if (class139.field2542 == var288[var289].field5539) {
                    class102.field1901 = var288[var289].field2411;
                }
            }
            int var290 = class59.field1243;
            boolean var291 = false;
            while (var290 > 0) {
                boolean var292 = true;
                var290--;
                for (int var293 = 0; var293 < var290; var293++) {
                    if (var288[var293].field2410.method1995((byte) -123, var288[var293 + 1].field2410) > 0) {
                        var292 = false;
                        class132 var294 = var288[var293];
                        var288[var293] = var288[var293 + 1];
                        var288[var293 + 1] = var294;
                    }
                }
                if (var292) {
                    break;
                }
            }
            class143.field2597 = -1;
            class306.field5437 = var288;
            return true;
        } else if (class143.field2597 == 187) {
            int var76 = class287.field5106.method491(-1268);
            int var77 = class287.field5106.method491(-1268);
            int var78 = class287.field5106.method477(arg0);
            if (class1.method8((byte) 113, var77)) {
                class176.method1368(1, var78, var76);
            }
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 7) {
            int var278 = class287.field5106.method456((byte) -126);
            int var279 = class287.field5106.method491(-1268);
            int var280 = class287.field5106.method468(28214);
            int var281 = class287.field5106.method466(255);
            int var282 = class287.field5106.method491(-1268);
            if (class1.method8((byte) 113, var282)) {
                class5.method32(true, var280, var278, var281, var279);
            }
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 188) {
            int var275 = class287.field5106.method468(arg0 + 28215);
            int var276 = class287.field5106.method468(28214);
            int var277 = class287.field5106.method475(-86);
            if (class1.method8((byte) 113, var276)) {
                class172.field3107 = var275;
                field2349 = var277;
                if (class122.field2191 == 2) {
                    class5.field124 = field2349;
                    class62.field1278 = class172.field3107;
                }
                class159.method1250(-19267);
            }
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 14) {
            class297.method2100(arg0 + 41);
            class322.field5628 = class287.field5106.method495((byte) 123);
            class143.field2597 = -1;
            class18.field549 = class249.field4443;
            return true;
        } else if (class143.field2597 == 121) {
            class80.method666(-1, class287.field5106.method467((byte) -16));
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 103) {
            for (int var79 = 0; var79 < class326.field5679.length; var79++) {
                if (class326.field5679[var79] != class141.field2570[var79]) {
                    class326.field5679[var79] = class141.field2570[var79];
                    class102.method864(var79, 65);
                    class35.field791[class52.method442(31, class64.field1320++)] = var79;
                }
            }
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 152) {
            long var80 = class287.field5106.method469((byte) 42);
            long var82 = (long) class287.field5106.method468(28214);
            long var84 = (long) class287.field5106.method461((byte) 115);
            int var86 = class287.field5106.method483(-114);
            long var87 = (var82 << 32) + var84;
            boolean var89 = false;
            int var90 = 0;
            label1279: while (true) {
                if (var90 >= 100) {
                    if (var86 <= 1) {
                        if ((!class179.field3242 || class196.field3533) && !class248.field4408) {
                            for (int var91 = 0; var91 < class194.field3498; var91++) {
                                if (class59.field1250[var91] == var80) {
                                    var89 = true;
                                    break label1279;
                                }
                            }
                        } else {
                            var89 = true;
                        }
                    }
                    break;
                }
                if (class216.field3830[var90] == var87) {
                    var89 = true;
                    break;
                }
                var90++;
            }
            if (!var89 && class18.field543 == 0) {
                class216.field3830[class37.field809] = var87;
                class37.field809 = (class37.field809 + 1) % 100;
                class279 var92 = class49.method414(class58.method529(class287.field5106, (byte) -34).method2005(arg0 ^ 0xFFFFFF3F));
                if (var86 == 2 || var86 == 3) {
                    class59.method532(var92, class115.method929(new class279[] { class96.field1788, class72.method631(var80, 5702).method2016(-32) }, (byte) 60), 7, arg0 ^ 0xFFFF8D02);
                } else if (var86 == 1) {
                    class59.method532(var92, class115.method929(new class279[] { class318.field5588, class72.method631(var80, 5702).method2016(-32) }, (byte) 60), 7, 29437);
                } else {
                    class59.method532(var92, class72.method631(var80, 5702).method2016(-32), 3, 29437);
                }
            }
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 16) {
            int var93 = class287.field5106.method475(122);
            int var94 = class287.field5106.method450((byte) 96);
            int var95 = class287.field5106.method491(-1268);
            if (class1.method8((byte) 113, var95)) {
                class63.method558(var94, (byte) 111, var93);
            }
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 125) {
            int var268 = class287.field5106.method448(-13244);
            int var269 = class287.field5106.method450((byte) 75);
            int var270 = class287.field5106.method466(255);
            if (class1.method8((byte) 113, var270)) {
                class176 var271 = (class176) class226.field3977.method610((long) var269, -1);
                class176 var272 = (class176) class226.field3977.method610((long) var268, -1);
                if (var272 != null) {
                    class5.method29(false, var272, var271 == null || var271.field3165 != var272.field3165);
                }
                if (var271 != null) {
                    var271.method2221(true);
                    class226.field3977.method612(false, var271, (long) var268);
                }
                class8 var273 = class273.method1940(var269, -34);
                if (var273 != null) {
                    class50.method426(var273, false);
                }
                class8 var274 = class273.method1940(var268, 105);
                if (var274 != null) {
                    class50.method426(var274, false);
                    class50.method424(var274, true, -1);
                }
                if (class307.field5444 != -1) {
                    class111.method909(class307.field5444, (byte) 126, 1);
                }
            }
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 111) {
            int var258 = class287.field5106.method468(arg0 ^ 0xFFFF91C9);
            if (var258 == 65535) {
                var258 = -1;
            }
            int var259 = class287.field5106.method466(255);
            int var260 = class287.field5106.method450((byte) 108);
            int var261 = class287.field5106.method450((byte) 75);
            int var262 = class287.field5106.method468(28214);
            if (var262 == 65535) {
                var262 = -1;
            }
            if (class1.method8((byte) 113, var259)) {
                for (int var263 = var262; var263 <= var258; var263++) {
                    long var264 = ((long) var261 << 32) + (long) var263;
                    class246 var266 = (class246) class262.field4668.method610(var264, -1);
                    class246 var267;
                    if (var266 != null) {
                        var267 = new class246(var260, var266.field4369);
                        var266.method2221(true);
                    } else if (var263 == -1) {
                        var267 = new class246(var260, class273.method1940(var261, 121).field300.field4369);
                    } else {
                        var267 = new class246(var260, -1);
                    }
                    class262.field4668.method612(false, var267, var264);
                }
            }
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 40) {
            int var96 = class287.field5106.method475(arg0 ^ 0x74);
            int var97 = class287.field5106.method456((byte) -114);
            int var98 = class287.field5106.method491(-1268);
            if (class1.method8((byte) 113, var96)) {
                class176.method1368(arg0 + 2, var97, var98);
            }
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 167) {
            int var254 = class287.field5106.method468(28214);
            int var255 = class287.field5106.method477(-1);
            int var256 = class287.field5106.method475(116);
            if (class1.method8((byte) 113, var256)) {
                if (var255 == 2) {
                    class173.method1345(arg0 ^ 0xFFFFFFFD);
                }
                class307.field5444 = var254;
                class282.method2030(var254, (byte) -98);
                class237.method1702(false, (byte) -15);
                class64.method563(true, class307.field5444);
                for (int var257 = 0; var257 < 100; var257++) {
                    class71.field1398[var257] = true;
                }
            }
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 185) {
            int var99 = class287.field5106.method491(-1268);
            int var100 = class287.field5106.method453(1);
            int var101 = class287.field5106.method468(arg0 ^ 0xFFFF91C9);
            if (var101 == 65535) {
                var101 = -1;
            }
            if (class1.method8((byte) 113, var99)) {
                class292.method2081(var101, 4, var100, 1, -1);
            }
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 2) {
            class166.method1294(-32679);
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 138) {
            class293.field5232 = class287.field5106.method470((byte) -7);
            class122.field2198 = class287.field5106.method477(-1);
            for (int var102 = class122.field2198; var102 < class122.field2198 + 8; var102++) {
                for (int var103 = class293.field5232; var103 < (class293.field5232 + 8); var103++) {
                    if (class276.field4890[class287.field5134][var102][var103] != null) {
                        class276.field4890[class287.field5134][var102][var103] = null;
                        class293.method2086(var103, var102, (byte) 86);
                    }
                }
            }
            for (class261 var104 = (class261) class268.field4806.method2248(123); var104 != null; var104 = (class261) class268.field4806.method2240(1138)) {
                if (class122.field2198 <= var104.field4646 && var104.field4646 < class122.field2198 + 8 && var104.field4644 >= class293.field5232 && class293.field5232 + 8 > var104.field4644 && class287.field5134 == var104.field4641) {
                    var104.field4660 = 0;
                }
            }
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 71) {
            int var243 = class287.field5106.method456((byte) -127);
            int var244 = var243 >> 14 & 0x3FFF;
            int var245 = var243 & 0x3FFF;
            int var246 = var243 >> 28 & 0x3;
            int var247 = class287.field5106.method475(121);
            if (var247 == 65535) {
                var247 = -1;
            }
            int var248 = class287.field5106.method470((byte) -7);
            int var249 = var244 - class112.field2058;
            int var250 = var245 - class12.field396;
            int var251 = var248 >> 2;
            int var252 = var248 & 0x3;
            int var253 = class252.field4505[var251];
            class262.method1878(var246, var247, false, var250, var249, var253, var252, var251);
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 139) {
            class279 var105 = class287.field5106.method467((byte) -16);
            if (var105.method1991(class35.field796, (byte) 110)) {
                boolean var106 = false;
                class279 var107 = var105.method2009((byte) -84, 0, var105.method1989(class125.field2301, (byte) -72));
                long var108 = var107.method2013(109);
                for (int var110 = 0; var110 < class194.field3498; var110++) {
                    if (class59.field1250[var110] == var108) {
                        var106 = true;
                        break;
                    }
                }
                if (!var106 && class18.field543 == 0) {
                    class59.method532(class238.field4183, var107, 4, 29437);
                }
            } else if (var105.method1991(class217.field3841, (byte) 122)) {
                class279 var111 = var105.method2009((byte) -84, 0, var105.method1989(class125.field2301, (byte) -72));
                long var112 = var111.method2013(arg0 + 91);
                boolean var114 = false;
                for (int var115 = 0; var115 < class194.field3498; var115++) {
                    if (class59.field1250[var115] == var112) {
                        var114 = true;
                        break;
                    }
                }
                if (!var114 && class18.field543 == 0) {
                    class279 var116 = var105.method2009((byte) -84, var105.method1989(class125.field2301, (byte) -72) + 1, var105.method1984(8) + -9);
                    class59.method532(var116, var111, 8, arg0 ^ 0xFFFF8D02);
                }
            } else if (var105.method1991(class266.field4795, (byte) 120)) {
                class279 var141 = var105.method2009((byte) -84, 0, var105.method1989(class125.field2301, (byte) -72));
                long var142 = var141.method2013(105);
                boolean var144 = false;
                for (int var145 = 0; var145 < class194.field3498; var145++) {
                    if (class59.field1250[var145] == var142) {
                        var144 = true;
                        break;
                    }
                }
                if (!var144 && class18.field543 == 0) {
                    class59.method532(class60.field1265, var141, 10, 29437);
                }
            } else if (var105.method1991(class125.field2324, (byte) 107)) {
                class279 var140 = var105.method2009((byte) -84, 0, var105.method1989(class125.field2324, (byte) -72));
                class59.method532(var140, class60.field1265, 11, 29437);
            } else if (var105.method1991(class184.field3367, (byte) 113)) {
                class279 var139 = var105.method2009((byte) -84, 0, var105.method1989(class184.field3367, (byte) -72));
                if (class18.field543 == 0) {
                    class59.method532(var139, class60.field1265, 12, 29437);
                }
            } else if (var105.method1991(class13.field400, (byte) 115)) {
                class279 var138 = var105.method2009((byte) -84, 0, var105.method1989(class13.field400, (byte) -72));
                if (class18.field543 == 0) {
                    class59.method532(var138, class60.field1265, 13, 29437);
                }
            } else if (var105.method1991(class178.field3235, (byte) 113)) {
                boolean var133 = false;
                class279 var134 = var105.method2009((byte) -84, 0, var105.method1989(class125.field2301, (byte) -72));
                long var135 = var134.method2013(103);
                for (int var137 = 0; var137 < class194.field3498; var137++) {
                    if (class59.field1250[var137] == var135) {
                        var133 = true;
                        break;
                    }
                }
                if (!var133 && class18.field543 == 0) {
                    class59.method532(class60.field1265, var134, 14, arg0 + 29438);
                }
            } else if (var105.method1991(class218.field3867, (byte) 122)) {
                class279 var117 = var105.method2009((byte) -84, 0, var105.method1989(class125.field2301, (byte) -72));
                long var118 = var117.method2013(105);
                boolean var120 = false;
                for (int var121 = 0; var121 < class194.field3498; var121++) {
                    if (class59.field1250[var121] == var118) {
                        var120 = true;
                        break;
                    }
                }
                if (!var120 && class18.field543 == 0) {
                    class59.method532(class60.field1265, var117, 15, 29437);
                }
            } else if (var105.method1991(class224.field3962, (byte) 121)) {
                class279 var128 = var105.method2009((byte) -84, 0, var105.method1989(class125.field2301, (byte) -72));
                long var129 = var128.method2013(arg0 + 125);
                boolean var131 = false;
                for (int var132 = 0; var132 < class194.field3498; var132++) {
                    if (class59.field1250[var132] == var129) {
                        var131 = true;
                        break;
                    }
                }
                if (!var131 && class18.field543 == 0) {
                    class59.method532(class60.field1265, var128, 16, 29437);
                }
            } else if (var105.method1991(class233.field4077, (byte) 116)) {
                boolean var122 = false;
                class279 var123 = var105.method2009((byte) -84, 0, var105.method1989(class125.field2301, (byte) -72));
                long var124 = var123.method2013(arg0 ^ 0xFFFFFF9C);
                for (int var126 = 0; var126 < class194.field3498; var126++) {
                    if (class59.field1250[var126] == var124) {
                        var122 = true;
                        break;
                    }
                }
                if (!var122 && class18.field543 == 0) {
                    class279 var127 = var105.method2009((byte) -84, var105.method1989(class125.field2301, (byte) -72) + 1, var105.method1984(8) + -9);
                    class59.method532(var127, var123, 21, 29437);
                }
            } else {
                class59.method532(var105, class60.field1265, 0, arg0 + 29438);
            }
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 66) {
            int var146 = class287.field5106.method456((byte) -120);
            class279 var147 = class287.field5106.method467((byte) -16);
            int var148 = class287.field5106.method491(arg0 ^ 0x4F3);
            if (class1.method8((byte) 113, var148)) {
                class238.method1716(var147, var146, 248);
            }
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 22) {
            int var149 = class287.field5106.method453(arg0 ^ 0xFFFFFFFE);
            int var150 = class287.field5106.method495((byte) -83);
            int var151 = class287.field5106.method468(28214);
            if (class1.method8((byte) 113, var151)) {
                class45.method385(var150, var149, -14455);
            }
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 3) {
            class100.field1882 = 0;
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 33) {
            long var152 = class287.field5106.method469((byte) 42);
            boolean var154 = true;
            if (var152 < 0L) {
                var152 &= Long.MAX_VALUE;
                var154 = false;
            }
            int var155 = class287.field5106.method468(arg0 ^ 0xFFFF91C9);
            int var156 = class287.field5106.method483(arg0 - 116);
            class279 var157 = class60.field1265;
            if (var155 > 0) {
                var157 = class287.field5106.method467((byte) -16);
            }
            class279 var158 = class72.method631(var152, 5702).method2016(-32);
            for (int var159 = 0; var159 < class167.field3011; var159++) {
                if (class287.field5123[var159] == var152) {
                    if (class247.field4383[var159] != var155) {
                        class247.field4383[var159] = var155;
                        if (var155 > 0) {
                            class59.method532(class115.method929(new class279[] { var158, class243.field4327 }, (byte) 60), class60.field1265, 5, 29437);
                        }
                        if (var155 == 0) {
                            class59.method532(class115.method929(new class279[] { var158, class213.field3753 }, (byte) 60), class60.field1265, 5, 29437);
                        }
                    }
                    class179.field3250[var159] = var157;
                    var158 = null;
                    class26.field624[var159] = var156;
                    class87.field1677[var159] = var154;
                    break;
                }
            }
            if (var158 != null && class167.field3011 < 200) {
                class287.field5123[class167.field3011] = var152;
                class100.field1861[class167.field3011] = var158;
                class247.field4383[class167.field3011] = var155;
                class179.field3250[class167.field3011] = var157;
                class26.field624[class167.field3011] = var156;
                class87.field1677[class167.field3011] = var154;
                class167.field3011++;
            }
            boolean var160 = false;
            int var161 = class167.field3011;
            class162.field2923 = class249.field4443;
            while (var161 > 0) {
                var161--;
                boolean var162 = true;
                for (int var163 = 0; var163 < var161; var163++) {
                    if (class247.field4383[var163] != class12.field386 && class247.field4383[var163 + 1] == class12.field386 || class247.field4383[var163] == 0 && class247.field4383[var163 + 1] != 0) {
                        int var164 = class247.field4383[var163];
                        class247.field4383[var163] = class247.field4383[var163 + 1];
                        class247.field4383[var163 + 1] = var164;
                        class279 var165 = class179.field3250[var163];
                        var162 = false;
                        class179.field3250[var163] = class179.field3250[var163 + 1];
                        class179.field3250[var163 + 1] = var165;
                        class279 var166 = class100.field1861[var163];
                        class100.field1861[var163] = class100.field1861[var163 + 1];
                        class100.field1861[var163 + 1] = var166;
                        long var167 = class287.field5123[var163];
                        class287.field5123[var163] = class287.field5123[var163 + 1];
                        class287.field5123[var163 + 1] = var167;
                        int var169 = class26.field624[var163];
                        class26.field624[var163] = class26.field624[var163 + 1];
                        class26.field624[var163 + 1] = var169;
                        boolean var170 = class87.field1677[var163];
                        class87.field1677[var163] = class87.field1677[var163 + 1];
                        class87.field1677[var163 + 1] = var170;
                    }
                }
                if (var162) {
                    break;
                }
            }
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 12) {
            long var171 = class287.field5106.method469((byte) 42);
            class287.field5106.method494(false);
            long var173 = class287.field5106.method469((byte) 42);
            boolean var175 = false;
            long var176 = (long) class287.field5106.method468(28214);
            long var178 = (long) class287.field5106.method461((byte) -99);
            int var180 = class287.field5106.method483(-109);
            long var181 = (var176 << 32) + var178;
            int var183 = 0;
            label1415: while (true) {
                if (var183 >= 100) {
                    if (var180 <= 1) {
                        if ((!class179.field3242 || class196.field3533) && !class248.field4408) {
                            for (int var184 = 0; var184 < class194.field3498; var184++) {
                                if (class59.field1250[var184] == var171) {
                                    var175 = true;
                                    break label1415;
                                }
                            }
                        } else {
                            var175 = true;
                        }
                    }
                    break;
                }
                if (class216.field3830[var183] == var181) {
                    var175 = true;
                    break;
                }
                var183++;
            }
            if (!var175 && class18.field543 == 0) {
                class216.field3830[class37.field809] = var181;
                class37.field809 = (class37.field809 + 1) % 100;
                class279 var185 = class49.method414(class58.method529(class287.field5106, (byte) -34).method2005(192));
                if (var180 == 2 || var180 == 3) {
                    class272.method1939(9, class72.method631(var173, 5702).method2016(-32), var185, 0, class115.method929(new class279[] { class96.field1788, class72.method631(var171, 5702).method2016(-32) }, (byte) 60));
                } else if (var180 == 1) {
                    class272.method1939(9, class72.method631(var173, 5702).method2016(-32), var185, 0, class115.method929(new class279[] { class318.field5588, class72.method631(var171, 5702).method2016(-32) }, (byte) 60));
                } else {
                    class272.method1939(9, class72.method631(var173, 5702).method2016(-32), var185, 0, class72.method631(var171, 5702).method2016(arg0 - 31));
                }
            }
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 246) {
            int var240 = class287.field5106.method468(arg0 + 28215);
            class279 var241 = class287.field5106.method467((byte) -16);
            int var242 = class287.field5106.method475(121);
            if (class1.method8((byte) 113, var242)) {
                class39.method347((byte) -105, var240, var241);
            }
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 178) {
            for (int var186 = 0; var186 < class96.field1780.length; var186++) {
                if (class96.field1780[var186] != null) {
                    class96.field1780[var186].field30 = -1;
                }
            }
            for (int var187 = 0; var187 < class122.field2196.length; var187++) {
                if (class122.field2196[var187] != null) {
                    class122.field2196[var187].field30 = -1;
                }
            }
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 83) {
            long var188 = class287.field5106.method469((byte) 42);
            long var190 = (long) class287.field5106.method468(28214);
            long var192 = (long) class287.field5106.method461((byte) -42);
            int var194 = class287.field5106.method483(-114);
            long var195 = (var190 << 32) + var192;
            boolean var197 = false;
            int var198 = class287.field5106.method468(arg0 + 28215);
            int var199 = 0;
            label1433: while (true) {
                if (var199 < 100) {
                    if (class216.field3830[var199] != var195) {
                        var199++;
                        continue;
                    }
                    var197 = true;
                    break;
                }
                if (var194 <= 1) {
                    for (int var200 = 0; var200 < class194.field3498; var200++) {
                        if (class59.field1250[var200] == var188) {
                            var197 = true;
                            break label1433;
                        }
                    }
                }
                break;
            }
            if (!var197 && class18.field543 == 0) {
                class216.field3830[class37.field809] = var195;
                class37.field809 = (class37.field809 + 1) % 100;
                class279 var201 = class230.method1666((byte) -19, var198).method2186(8, class287.field5106);
                if (var194 == 2) {
                    class170.method1325(0, var201, 18, (class279) null, var198, class115.method929(new class279[] { class96.field1788, class72.method631(var188, 5702).method2016(-32) }, (byte) 60));
                } else if (var194 == 1) {
                    class170.method1325(0, var201, 18, (class279) null, var198, class115.method929(new class279[] { class318.field5588, class72.method631(var188, 5702).method2016(-32) }, (byte) 60));
                } else {
                    class170.method1325(0, var201, 18, (class279) null, var198, class72.method631(var188, 5702).method2016(-32));
                }
            }
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 203) {
            if (class307.field5444 != -1) {
                class111.method909(class307.field5444, (byte) 127, 0);
            }
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 62) {
            int var239 = class287.field5106.method468(28214);
            class190.method1445(false, var239);
            class213.field3740[class52.method442(class54.field1189++, 31)] = class52.method442(var239, 32767);
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 204) {
            int var233 = class287.field5106.method453(arg0 + 2);
            int var234 = class287.field5106.method468(28214);
            class8 var235;
            if (var233 < 0) {
                var235 = null;
            } else {
                var235 = class273.method1940(var233, 117);
            }
            if (var233 < -70000) {
                var234 += 32768;
            }
            while (class264.field4741 > class287.field5106.field1142) {
                int var236 = class287.field5106.method472((byte) 110);
                int var237 = class287.field5106.method468(28214);
                int var238 = 0;
                if (var237 != 0) {
                    var238 = class287.field5106.method483(-115);
                    if (var238 == 255) {
                        var238 = class287.field5106.method453(arg0 + 2);
                    }
                }
                if (var235 != null && var236 >= 0 && var236 < var235.field319.length) {
                    var235.field319[var236] = var237;
                    var235.field332[var236] = var238;
                }
                class184.method1425(var238, false, var234, var236, var237 - 1);
            }
            if (var235 != null) {
                class50.method426(var235, false);
            }
            class297.method2100(116);
            class213.field3740[class52.method442(31, class54.field1189++)] = class52.method442(32767, var234);
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 112) {
            int var230 = class287.field5106.method468(28214);
            if (var230 == 65535) {
                var230 = -1;
            }
            int var231 = class287.field5106.method483(-114);
            int var232 = class287.field5106.method468(arg0 + 28215);
            class167.method1306(var232, var230, (byte) 74, var231);
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 44) {
            int var226 = class287.field5106.method450((byte) 104);
            int var227 = class287.field5106.method466(255);
            int var228 = class287.field5106.method475(arg0 - 115);
            int var229 = class287.field5106.method466(255);
            if (class1.method8((byte) 113, var227)) {
                class1.method4(var226, (byte) -123, (var228 << 16) + var229);
            }
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 24) {
            int var221 = class287.field5106.method453(1);
            int var222 = class287.field5106.method466(255);
            int var223 = class287.field5106.method466(255);
            int var224 = class287.field5106.method477(-1);
            if (class1.method8((byte) 113, var223)) {
                class176 var225 = (class176) class226.field3977.method610((long) var221, -1);
                if (var225 != null) {
                    class5.method29(false, var225, var225.field3165 != var222);
                }
                class185.method1429((byte) 119, var224, var221, var222);
            }
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 226) {
            class99.method845(class287.field5106, class264.field4741, class110.field2022, (byte) 44);
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 70) {
            class293.field5232 = class287.field5106.method483(-123);
            class122.field2198 = class287.field5106.method477(arg0);
            while (class264.field4741 > class287.field5106.field1142) {
                class143.field2597 = class287.field5106.method483(-125);
                class294.method2091(-99);
            }
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 136) {
            int var202 = class287.field5106.method468(28214);
            int var203 = class287.field5106.method453(1);
            if (class1.method8((byte) 113, var202)) {
                class176 var204 = (class176) class226.field3977.method610((long) var203, arg0);
                if (var204 != null) {
                    class5.method29(false, var204, true);
                }
                if (class320.field5597 != null) {
                    class50.method426(class320.field5597, false);
                    class320.field5597 = null;
                }
            }
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 240) {
            long var205 = class287.field5106.method469((byte) 42);
            class287.field5106.method494(false);
            long var207 = class287.field5106.method469((byte) 42);
            boolean var209 = false;
            long var210 = (long) class287.field5106.method468(28214);
            long var212 = (long) class287.field5106.method461((byte) 122);
            long var214 = (var210 << 32) + var212;
            int var216 = class287.field5106.method483(arg0 - 108);
            int var217 = class287.field5106.method468(28214);
            int var218 = 0;
            label1456: while (true) {
                if (var218 >= 100) {
                    if (var216 <= 1) {
                        for (int var219 = 0; var219 < class194.field3498; var219++) {
                            if (class59.field1250[var219] == var205) {
                                var209 = true;
                                break label1456;
                            }
                        }
                    }
                    break;
                }
                if (class216.field3830[var218] == var214) {
                    var209 = true;
                    break;
                }
                var218++;
            }
            if (!var209 && class18.field543 == 0) {
                class216.field3830[class37.field809] = var214;
                class37.field809 = (class37.field809 + 1) % 100;
                class279 var220 = class230.method1666((byte) -19, var217).method2186(-51, class287.field5106);
                if (var216 == 2 || var216 == 3) {
                    class170.method1325(arg0 + 1, var220, 20, class72.method631(var207, 5702).method2016(-32), var217, class115.method929(new class279[] { class96.field1788, class72.method631(var205, 5702).method2016(-32) }, (byte) 60));
                } else if (var216 == 1) {
                    class170.method1325(0, var220, 20, class72.method631(var207, 5702).method2016(-32), var217, class115.method929(new class279[] { class318.field5588, class72.method631(var205, 5702).method2016(-32) }, (byte) 60));
                } else {
                    class170.method1325(0, var220, 20, class72.method631(var207, 5702).method2016(arg0 - 31), var217, class72.method631(var205, 5702).method2016(-32));
                }
            }
            class143.field2597 = -1;
            return true;
        } else if (class143.field2597 == 214) {
            if (class264.field4741 == 0) {
                class13.field415 = class195.field3519;
            } else {
                class13.field415 = class287.field5106.method467((byte) -16);
            }
            class143.field2597 = -1;
            return true;
        } else {
            class94.method792((Throwable) null, (byte) -115, "T1 - " + class143.field2597 + "," + class302.field5366 + "," + class165.field2969 + " - " + class264.field4741);
            class63.method551(-70);
            return true;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIILsf;Lsf;IIIIJ)V", line = 2826)
    public static final void method1012(int arg0, int arg1, int arg2, int arg3, class108 arg4, class108 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class235 var12 = new class235();
        var12.field4095 = arg10;
        var12.field4100 = arg1 * 128 + 64;
        var12.field4104 = arg2 * 128 + 64;
        var12.field4092 = arg3;
        var12.field4091 = arg4;
        var12.field4099 = arg5;
        var12.field4102 = arg6;
        var12.field4093 = arg7;
        var12.field4106 = arg8;
        var12.field4101 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class24.field619[var13][arg1][arg2] == null) {
                class24.field619[var13][arg1][arg2] = new class191(var13, arg1, arg2);
            }
        }
        class24.field619[arg0][arg1][arg2].field3454 = var12;
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(I)V", line = 2856)
    public static final void method1013(int arg0) {
        class18.field545 = new class8[class112.field2056.method1181(-91)][];
        field2336++;
        if (arg0 != -121) {
            field2341 = -85;
        }
        class142.field2573 = new boolean[class112.field2056.method1181(-70)];
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(II)V", line = 2874)
    public static final void method1014(int arg0, int arg1) {
        field2347++;
        class204.field3633 = null;
        class70.field1382 = false;
        class181.field3310 = arg0;
        class243.field4322 = 0;
        class103.field1937 = -1;
        class235.field4103 = arg1;
        class284.field5069 = -1;
    }
}
