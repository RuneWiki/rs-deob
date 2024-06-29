import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class281 implements Runnable {

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "[I")
    public static int[] field4719 = new int[2048];

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "Luf;")
    public static class168 field4723 = class148.method1019(-1720, "Card:");

    @OriginalMember(owner = "client!pa", name = "m", descriptor = "S")
    public static short field4728 = 1;

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "I")
    public static int field4725 = 0;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    public static int field4716;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
    public static int field4717;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    public static int field4718;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
    public static int field4720;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "I")
    public static int field4721;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "I")
    public static int field4722;

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "I")
    public static int field4726;

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "Luf;")
    public static class168 field4724;

    @OriginalMember(owner = "client!pa", name = "l", descriptor = "Ldk;")
    public static class241 field4727;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Z)V", line = 20)
    public static void method1939(boolean arg0) {
        if (!arg0) {
            field4724 = (class168) null;
        }
        field4723 = null;
        field4724 = null;
        field4719 = null;
        field4727 = null;
    }

    @OriginalMember(owner = "client!pa", name = "run", descriptor = "()V", line = 48)
    public final void run() {
        field4718++;
        try {
            while (true) {
                class76 var1 = class40.field500;
                class138 var2;
                synchronized (class40.field500) {
                    var2 = (class138) class40.field500.method442(65293);
                }
                if (var2 == null) {
                    class300.method2054(10, 100L);
                    Object var10 = class113.field1772;
                    synchronized (class113.field1772) {
                        if (class267.field4511 <= 1) {
                            class267.field4511 = 0;
                            class113.field1772.notifyAll();
                            return;
                        }
                        class267.field4511--;
                    }
                } else {
                    if (var2.field2126 == 0) {
                        var2.field2129.method820((int) var2.field292, -23600, var2.field2128, var2.field2128.length);
                        class76 var6 = class40.field500;
                        synchronized (class40.field500) {
                            var2.method124((byte) 125);
                        }
                    } else if (var2.field2126 == 1) {
                        var2.field2128 = var2.field2129.method817((int) var2.field292, false);
                        class76 var4 = class40.field500;
                        synchronized (class40.field500) {
                            class21.field259.method451(-91453648, var2);
                        }
                    }
                    Object var8 = class113.field1772;
                    synchronized (class113.field1772) {
                        if (class267.field4511 <= 1) {
                            class267.field4511 = 0;
                            class113.field1772.notifyAll();
                            return;
                        }
                        class267.field4511 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class43.method234(var18, -15954, (String) null);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)Z", line = 123)
    public static final boolean method1940(int arg0) throws IOException {
        field4721++;
        if (class157.field2493 == null) {
            return false;
        }
        int var1 = class157.field2493.method1227(0);
        if (var1 == 0) {
            return false;
        }
        if (class102.field1587 == -1) {
            var1--;
            class157.field2493.method1226(class166.field2671.field2359, 14451, 0, 1);
            class166.field2671.field2367 = 0;
            class102.field1587 = class166.field2671.method715(0);
            class110.field1726 = class124.field1911[class102.field1587];
        }
        if (class110.field1726 == -1) {
            if (var1 <= 0) {
                return false;
            }
            var1--;
            class157.field2493.method1226(class166.field2671.field2359, 14451, 0, 1);
            class110.field1726 = class166.field2671.field2359[0] & 0xFF;
        }
        if (class110.field1726 == -2) {
            if (var1 <= 1) {
                return false;
            }
            var1 -= 2;
            class157.field2493.method1226(class166.field2671.field2359, 14451, 0, 2);
            class166.field2671.field2367 = 0;
            class110.field1726 = class166.field2671.method1069(89);
        }
        if (class110.field1726 > var1) {
            return false;
        }
        class166.field2671.field2367 = 0;
        class157.field2493.method1226(class166.field2671.field2359, 14451, 0, class110.field1726);
        class142.field2190 = 0;
        class63.field847 = class62.field824;
        class62.field824 = class153.field2407;
        class153.field2407 = class102.field1587;
        if (class102.field1587 == 77) {
            class82.method524((byte) -37);
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 138) {
            int var356 = class166.field2671.method1069(94);
            if (var356 == 65535) {
                var356 = -1;
            }
            int var357 = class166.field2671.method1042((byte) 124);
            int var358 = class166.field2671.method1069(103);
            class280.method1938((byte) 114, var357, var356, var358);
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 178) {
            for (int var354 = 0; var354 < class9.field117.length; var354++) {
                if (class9.field117[var354] != null) {
                    class9.field117[var354].field3044 = -1;
                }
            }
            for (int var355 = 0; var355 < class190.field3065.length; var355++) {
                if (class190.field3065[var355] != null) {
                    class190.field3065[var355].field3044 = -1;
                }
            }
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 55) {
            int var347 = class166.field2671.method1043((byte) -66);
            int var348 = class166.field2671.method1049(true);
            int var349 = (var348 & 0x3F2) >> 5;
            int var350 = (var348 & 0x7E57) >> 10;
            int var351 = var348 & 0x1F;
            int var352 = (var351 << 3) + ((var350 << 19) + (var349 << 11));
            class242 var353 = class130.method910((byte) -109, var347);
            if (var353.field4034 != var352) {
                var353.field4034 = var352;
                client.method2011((byte) -59, var353);
            }
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 37) {
            long var343 = class166.field2671.method1087(1001);
            int var345 = class166.field2671.method1069(93);
            class168 var346 = class294.method2021(var345, -2828).method1925(0, class166.field2671);
            class40.method223((class168) null, var345, var346, 19, (byte) -118, class69.method388(var343, (byte) 104).method1216(-32471));
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 251) {
            int var338 = class166.field2671.method1042((byte) 103);
            int var339 = class166.field2671.method1042((byte) -88);
            int var340 = class166.field2671.method1069(72);
            int var341 = class166.field2671.method1042((byte) -121);
            int var342 = class166.field2671.method1042((byte) 103);
            class86.method592(var342, -22446, var338, var340, var341, var339);
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 91) {
            boolean var335 = class166.field2671.method1064((byte) 19) == 1;
            int var336 = class166.field2671.method1043((byte) -66);
            class242 var337 = class130.method910((byte) -113, var336);
            if (var335 != var337.field4028) {
                var337.field4028 = var335;
                client.method2011((byte) -59, var337);
            }
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 207) {
            class201.method1408(class166.field2671, 3, class110.field1726, class51.field622);
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 14) {
            for (int var334 = 0; var334 < class122.field1891.length; var334++) {
                if (class261.field4423[var334] != class122.field1891[var334]) {
                    class122.field1891[var334] = class261.field4423[var334];
                    class271.method1875(var334, (byte) -43);
                    class242.field3997[class159.method1119(class67.field878++, 31)] = var334;
                }
            }
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 205) {
            class149.field2302 = class110.field1726 / 8;
            for (int var333 = 0; var333 < class149.field2302; var333++) {
                class201.field3311[var333] = class166.field2671.method1087(1001);
                class87.field1341[var333] = class69.method388(class201.field3311[var333], (byte) 104);
            }
            class285.field4828 = class9.field116;
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 213) {
            int var331 = class166.field2671.method1052(29912);
            int var332 = class166.field2671.method1069(44);
            class256.method1752((byte) -122, var332, var331);
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 71) {
            int var2 = class166.field2671.method1043((byte) -75);
            int var3 = class166.field2671.method1049(true);
            class242 var4 = class130.method910((byte) -106, var2);
            if (var4 != null && var4.field4073 == 0) {
                if (var4.field4007 - var4.field4057 < var3) {
                    var3 = var4.field4007 - var4.field4057;
                }
                if (var3 < 0) {
                    var3 = 0;
                }
                if (var4.field4079 != var3) {
                    var4.field4079 = var3;
                    client.method2011((byte) -59, var4);
                }
            }
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 120) {
            class151.field2348 = 0;
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 133) {
            class201.field3312 = class166.field2671.method1093((byte) 67);
            class94.field1484 = class166.field2671.method1064((byte) 19);
            for (int var328 = class201.field3312; var328 < (class201.field3312 + 8); var328++) {
                for (int var329 = class94.field1484; var329 < (class94.field1484 + 8); var329++) {
                    if (class71.field952[class79.field1127][var328][var329] != null) {
                        class71.field952[class79.field1127][var328][var329] = null;
                        class204.method1427(var329, -25477, var328);
                    }
                }
            }
            for (class117 var330 = (class117) class31.field369.method442(65293); var330 != null; var330 = (class117) class31.field369.method440(3)) {
                if (var330.field1828 >= class201.field3312 && var330.field1828 < class201.field3312 + 8 && class94.field1484 <= var330.field1829 && (class94.field1484 + 8) > var330.field1829 && class79.field1127 == var330.field1827) {
                    var330.field1831 = 0;
                }
            }
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 84) {
            class201.field3312 = class166.field2671.method1093((byte) 110);
            class94.field1484 = class166.field2671.method1042((byte) -66);
            while (class166.field2671.field2367 < class110.field1726) {
                class102.field1587 = class166.field2671.method1042((byte) -35);
                class25.method130(116);
            }
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 174) {
            class14.method51(class166.field2671, 16966);
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 116) {
            class83.method560(0, false);
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 252) {
            int var5 = class166.field2671.method1069(53);
            int var6 = class166.field2671.method1049(true);
            int var7 = class166.field2671.method1052(29912);
            class195.method1373((byte) -61, var6);
            class12.method43(var5, var7, 1);
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 175) {
            int var8 = class166.field2671.method1093((byte) 73);
            int var9 = class166.field2671.method1064((byte) 19);
            int var10 = class166.field2671.method1093((byte) 53);
            class79.field1127 = var8 >> 1;
            class266.field4489.method1334((var8 & 0x1) == 1, var9, (byte) -5, var10);
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 35) {
            int var323 = class166.field2671.method1042((byte) -53);
            int var324 = class166.field2671.method1042((byte) 97);
            int var325 = class166.field2671.method1042((byte) -70);
            int var326 = class166.field2671.method1042((byte) -98);
            int var327 = class166.field2671.method1069(65);
            class247.field4236[var323] = true;
            class80.field1155[var323] = var324;
            class78.field1069[var323] = var325;
            class130.field2019[var323] = var326;
            class159.field2516[var323] = var327;
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 29) {
            class144.method985(0);
            class102.field1587 = -1;
            return false;
        } else if (class102.field1587 == 181) {
            long var320 = class166.field2671.method1087(1001);
            class168 var322 = class37.method205(class143.method980((byte) 78, class166.field2671).method1217((byte) 67));
            class266.method1850(6, var322, class69.method388(var320, (byte) 104).method1216(-32471), -41);
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 226) {
            int var319 = class166.field2671.method1042((byte) -117);
            if (class166.field2671.method1042((byte) 112) == 0) {
                class194.field3156[var319] = new class179();
            } else {
                class166.field2671.field2367--;
                class194.field3156[var319] = new class179(class166.field2671);
            }
            class120.field1873 = class9.field116;
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 201) {
            long var303 = class166.field2671.method1087(1001);
            class166.field2671.method1078(-6338);
            long var305 = class166.field2671.method1087(1001);
            long var307 = (long) class166.field2671.method1069(105);
            long var309 = (long) class166.field2671.method1088(-30917);
            int var311 = class166.field2671.method1042((byte) 121);
            int var312 = class166.field2671.method1069(78);
            long var313 = (var307 << 32) + var309;
            boolean var315 = false;
            int var316 = 0;
            label1551: while (true) {
                if (var316 < 100) {
                    if (class162.field2618[var316] != var313) {
                        var316++;
                        continue;
                    }
                    var315 = true;
                    break;
                }
                if (var311 <= 1) {
                    for (int var317 = 0; var317 < class149.field2302; var317++) {
                        if (class201.field3311[var317] == var303) {
                            var315 = true;
                            break label1551;
                        }
                    }
                }
                break;
            }
            if (!var315 && class272.field4573 == 0) {
                class162.field2618[class118.field1848] = var313;
                class118.field1848 = (class118.field1848 + 1) % 100;
                class168 var318 = class294.method2021(var312, -2828).method1925(0, class166.field2671);
                if (var311 == 2 || var311 == 3) {
                    class40.method223(class69.method388(var305, (byte) 104).method1216(-32471), var312, var318, 20, (byte) -118, class134.method938((byte) -128, new class168[] { class122.field1897, class69.method388(var303, (byte) 104).method1216(-32471) }));
                } else if (var311 == 1) {
                    class40.method223(class69.method388(var305, (byte) 104).method1216(-32471), var312, var318, 20, (byte) -118, class134.method938((byte) -126, new class168[] { class171.field2783, class69.method388(var303, (byte) 104).method1216(-32471) }));
                } else {
                    class40.method223(class69.method388(var305, (byte) 104).method1216(-32471), var312, var318, 20, (byte) -118, class69.method388(var303, (byte) 104).method1216(-32471));
                }
            }
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 34) {
            class61.method344(20980);
            class76.method448((byte) 118);
            class67.field878 += 32;
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 166) {
            class150.field2319 = class166.field2671.method1042((byte) -42);
            class285.field4828 = class9.field116;
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 54) {
            int var11 = class166.field2671.method1049(true);
            if (var11 == 65535) {
                var11 = -1;
            }
            int var12 = class166.field2671.method1089((byte) -14);
            int var13 = class166.field2671.method1091((byte) -113);
            class242 var14 = class130.method910((byte) -81, var12);
            if (var14.field4040) {
                var14.field3964 = var13;
                var14.field3976 = var11;
                class238 var16 = class284.method1963((byte) -66, var11);
                var14.field4117 = var16.field3825;
                var14.field4002 = var16.field3826;
                var14.field4081 = var16.field3820;
                var14.field3980 = var16.field3841;
                var14.field4006 = var16.field3839;
                if (var14.field4089 > 0) {
                    var14.field3980 = var14.field3980 * 32 / var14.field4089;
                } else if (var14.field4036 > 0) {
                    var14.field3980 = var14.field3980 * 32 / var14.field4036;
                }
                var14.field4098 = var16.field3827;
                client.method2011((byte) -59, var14);
            } else if (var11 == -1) {
                class102.field1587 = -1;
                var14.field4022 = 0;
                return true;
            } else {
                class238 var15 = class284.method1963((byte) -75, var11);
                var14.field3993 = var11;
                var14.field4022 = 4;
                var14.field4006 = var15.field3839;
                var14.field4098 = var15.field3827;
                var14.field3980 = var15.field3841 * 100 / var13;
                client.method2011((byte) -59, var14);
            }
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 73) {
            int var299 = class166.field2671.method1069(85);
            int var300 = class166.field2671.method1042((byte) -81);
            int var301 = class166.field2671.method1041(61);
            class22 var302 = class190.field3065[var299];
            if (var302 != null) {
                class242.method1673(var302, var300, var301, -1);
            }
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 36) {
            int var17 = class166.field2671.method1089((byte) -14);
            int var18 = class166.field2671.method1069(126);
            class242 var19;
            if (var17 >= 0) {
                var19 = class130.method910((byte) -115, var17);
            } else {
                var19 = null;
            }
            if (var19 != null) {
                for (int var20 = 0; var20 < var19.field4013.length; var20++) {
                    var19.field4013[var20] = 0;
                    var19.field4066[var20] = 0;
                }
            }
            if (var17 < -70000) {
                var18 += 32768;
            }
            class205.method1435(var18, 1822622241);
            int var21 = class166.field2671.method1069(75);
            for (int var22 = 0; var22 < var21; var22++) {
                int var23 = class166.field2671.method1093((byte) 107);
                if (var23 == 255) {
                    var23 = class166.field2671.method1091((byte) 97);
                }
                int var24 = class166.field2671.method1051(-128);
                if (var19 != null && var22 < var19.field4013.length) {
                    var19.field4013[var22] = var24;
                    var19.field4066[var22] = var23;
                }
                class200.method1404(var23, false, var24 - 1, var22, var18);
            }
            if (var19 != null) {
                client.method2011((byte) -59, var19);
            }
            class76.method448((byte) 118);
            class198.field3274[class159.method1119(31, class180.field2904++)] = class159.method1119(var18, 32767);
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 1) {
            int var283 = class110.field1726 + class166.field2671.field2367;
            int var284 = class166.field2671.method1069(79);
            int var285 = class166.field2671.method1069(40);
            if (class19.field221 != var284) {
                class19.field221 = var284;
                class27.method141((byte) -110, class19.field221);
                class264.method1836(false, (byte) 16);
                class133.method929(-10917, class19.field221);
                for (int var286 = 0; var286 < 100; var286++) {
                    class214.field3495[var286] = true;
                }
            }
            while (var285-- > 0) {
                int var287 = class166.field2671.method1089((byte) -14);
                int var288 = class166.field2671.method1069(51);
                int var289 = class166.field2671.method1042((byte) -48);
                class240 var290 = (class240) class26.field319.method493((long) var287, 59);
                if (var290 == null) {
                }
                if (var290 != null && var290.field3898 != var288) {
                    class67.method378(true, var290, 0);
                    var290 = null;
                }
                if (var290 == null) {
                    var290 = class127.method900(var288, var289, var287, 0);
                }
                var290.field3896 = true;
            }
            for (class240 var291 = (class240) class26.field319.method499((byte) -99); var291 != null; var291 = (class240) class26.field319.method488(1)) {
                if (var291.field3896) {
                    var291.field3896 = false;
                } else {
                    class67.method378(true, var291, 0);
                }
            }
            class48.field590.method500(0);
            while (var283 > class166.field2671.field2367) {
                int var292 = class166.field2671.method1089((byte) -14);
                int var293 = class166.field2671.method1069(29);
                int var294 = class166.field2671.method1069(94);
                int var295 = class166.field2671.method1089((byte) -14);
                for (int var296 = var293; var296 <= var294; var296++) {
                    long var297 = ((long) var292 << 32) + (long) var296;
                    class48.field590.method490(new class69(var295), var297, true);
                }
            }
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 104) {
            class168 var279 = class166.field2671.method1075(123);
            Object[] var280 = new Object[var279.method1167(false) + 1];
            for (int var281 = var279.method1167(false) - 1; var281 >= 0; var281--) {
                if (var279.method1171(-6146, var281) == 115) {
                    var280[var281 + 1] = class166.field2671.method1075(35);
                } else {
                    var280[var281 + 1] = Integer.valueOf(class166.field2671.method1089((byte) -14));
                }
            }
            var280[0] = Integer.valueOf(class166.field2671.method1089((byte) -14));
            class182 var282 = new class182();
            var282.field2919 = var280;
            class177.method1270(var282, (byte) -25);
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 152) {
            int var274 = class166.field2671.method1042((byte) 96);
            int var275 = class166.field2671.method1042((byte) 111);
            int var276 = class166.field2671.method1069(80);
            int var277 = class166.field2671.method1042((byte) 124);
            int var278 = class166.field2671.method1042((byte) 96);
            class162.method1146(var275, true, var274, var277, var278, var276, (byte) 106);
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 206) {
            int var272 = class166.field2671.method1069(67);
            int var273 = class166.field2671.method1049(true);
            class171.field2787 = var273;
            class71.field959 = var272;
            class5.method15(122);
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 65) {
            class168 var25 = class166.field2671.method1075(127);
            int var26 = class166.field2671.method1089((byte) -14);
            class242 var27 = class130.method910((byte) -114, var26);
            if (!var25.method1170(var27.field4030, (byte) 125)) {
                var27.field4030 = var25;
                client.method2011((byte) -59, var27);
            }
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 159) {
            int var270 = class166.field2671.method1089((byte) -14);
            int var271 = class166.field2671.method1041(-54);
            class40.method222(var270, var271, 47);
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 33) {
            class94.field1484 = class166.field2671.method1042((byte) -88);
            class201.field3312 = class166.field2671.method1064((byte) 19);
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 243) {
            int var28 = class166.field2671.method1041(120);
            if (var28 == 65535) {
                var28 = -1;
            }
            int var29 = class166.field2671.method1091((byte) -96);
            int var30 = var29 >> 28 & 0x3;
            int var31 = (var29 & 0xFFFCE64) >> 14;
            int var32 = var29 & 0x3FFF;
            int var33 = class166.field2671.method1042((byte) 106);
            int var34 = var33 >> 2;
            int var35 = var32 - class276.field4641;
            int var36 = var33 & 0x3;
            int var37 = var31 - class182.field2916;
            int var38 = class174.field2825[var34];
            class248.method1706(var37, var36, var30, var35, var28, var34, (byte) 126, var38);
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 229) {
            long var39 = class166.field2671.method1087(1001);
            int var41 = class166.field2671.method1069(66);
            boolean var42 = false;
            byte var43 = class166.field2671.method1078(-6338);
            if ((Long.MIN_VALUE & var39) != 0L) {
                var42 = true;
            }
            if (var42) {
                if (class114.field1776 == 0) {
                    class102.field1587 = -1;
                    return true;
                }
                long var44 = var39 & Long.MAX_VALUE;
                boolean var46 = false;
                int var47;
                for (var47 = 0; class114.field1776 > var47 && (class291.field4896[var47].field292 != var44 || class291.field4896[var47].field892 != var41); var47++) {
                }
                if (class114.field1776 > var47) {
                    while (var47 < (class114.field1776 - 1)) {
                        class291.field4896[var47] = class291.field4896[var47 + 1];
                        var47++;
                    }
                    class114.field1776--;
                    class291.field4896[class114.field1776] = null;
                }
            } else {
                class168 var48 = class166.field2671.method1075(81);
                class67 var49 = new class67();
                var49.field292 = var39;
                var49.field889 = class69.method388(var49.field292, (byte) 104);
                var49.field891 = var43;
                var49.field892 = var41;
                var49.field886 = var48;
                int var50;
                for (var50 = class114.field1776 - 1; var50 >= 0; var50--) {
                    int var51 = class291.field4896[var50].field889.method1177(1, var49.field889);
                    if (var51 == 0) {
                        class291.field4896[var50].field892 = var41;
                        class291.field4896[var50].field891 = var43;
                        class291.field4896[var50].field886 = var48;
                        if (class198.field3271 == var39) {
                            class5.field70 = var43;
                        }
                        class102.field1587 = -1;
                        class48.field595 = class9.field116;
                        return true;
                    }
                    if (var51 < 0) {
                        break;
                    }
                }
                if (class114.field1776 >= class291.field4896.length) {
                    class102.field1587 = -1;
                    return true;
                }
                for (int var52 = class114.field1776 - 1; var52 > var50; var52--) {
                    class291.field4896[var52 + 1] = class291.field4896[var52];
                }
                if (class114.field1776 == 0) {
                    class291.field4896 = new class67[100];
                }
                class291.field4896[var50 + 1] = var49;
                if (class198.field3271 == var39) {
                    class5.field70 = var43;
                }
                class114.field1776++;
            }
            class48.field595 = class9.field116;
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 111) {
            int var53 = class166.field2671.method1042((byte) -25);
            int var54 = class166.field2671.method1093((byte) 101);
            class168 var55 = class166.field2671.method1075(47);
            if (var53 >= 1 && var53 <= 8) {
                if (var55.method1194(class227.field3682, -26023)) {
                    var55 = null;
                }
                class79.field1131[var53 - 1] = var55;
                class213.field3481[var53 - 1] = var54 == 0;
            }
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 241) {
            class168 var229 = class166.field2671.method1075(57);
            if (var229.method1185(0, class96.field1532)) {
                class168 var265 = var229.method1187(0, 0, var229.method1196(class95.field1517, 187));
                long var266 = var265.method1208((byte) 71);
                boolean var268 = false;
                for (int var269 = 0; var269 < class149.field2302; var269++) {
                    if (class201.field3311[var269] == var266) {
                        var268 = true;
                        break;
                    }
                }
                if (!var268 && class272.field4573 == 0) {
                    class266.method1850(4, class282.field4731, var265, 72);
                }
            } else if (var229.method1185(0, class20.field241)) {
                class168 var230 = var229.method1187(0, 0, var229.method1196(class95.field1517, 187));
                long var231 = var230.method1208((byte) 71);
                boolean var233 = false;
                for (int var234 = 0; var234 < class149.field2302; var234++) {
                    if (class201.field3311[var234] == var231) {
                        var233 = true;
                        break;
                    }
                }
                if (!var233 && class272.field4573 == 0) {
                    class168 var235 = var229.method1187(var229.method1196(class95.field1517, 187) + 1, 0, var229.method1167(false) - 9);
                    class266.method1850(8, var235, var230, -39);
                }
            } else if (var229.method1185(0, class128.field2001)) {
                class168 var236 = var229.method1187(0, 0, var229.method1196(class95.field1517, 187));
                boolean var237 = false;
                long var238 = var236.method1208((byte) 71);
                for (int var240 = 0; var240 < class149.field2302; var240++) {
                    if (class201.field3311[var240] == var238) {
                        var237 = true;
                        break;
                    }
                }
                if (!var237 && class272.field4573 == 0) {
                    class266.method1850(10, class182.field2934, var236, -66);
                }
            } else if (var229.method1185(0, class272.field4566)) {
                class168 var264 = var229.method1187(0, 0, var229.method1196(class272.field4566, 187));
                class266.method1850(11, var264, class182.field2934, 88);
            } else if (var229.method1185(0, class27.field337)) {
                class168 var263 = var229.method1187(0, 0, var229.method1196(class27.field337, 187));
                if (class272.field4573 == 0) {
                    class266.method1850(12, var263, class182.field2934, -93);
                }
            } else if (var229.method1185(0, class135.field2107)) {
                class168 var241 = var229.method1187(0, 0, var229.method1196(class135.field2107, 187));
                if (class272.field4573 == 0) {
                    class266.method1850(13, var241, class182.field2934, 87);
                }
            } else if (var229.method1185(0, class156.field2472)) {
                class168 var242 = var229.method1187(0, 0, var229.method1196(class95.field1517, 187));
                long var243 = var242.method1208((byte) 71);
                boolean var245 = false;
                for (int var246 = 0; var246 < class149.field2302; var246++) {
                    if (class201.field3311[var246] == var243) {
                        var245 = true;
                        break;
                    }
                }
                if (!var245 && class272.field4573 == 0) {
                    class266.method1850(14, class182.field2934, var242, 58);
                }
            } else if (var229.method1185(0, class284.field4809)) {
                class168 var247 = var229.method1187(0, 0, var229.method1196(class95.field1517, 187));
                long var248 = var247.method1208((byte) 71);
                boolean var250 = false;
                for (int var251 = 0; var251 < class149.field2302; var251++) {
                    if (class201.field3311[var251] == var248) {
                        var250 = true;
                        break;
                    }
                }
                if (!var250 && class272.field4573 == 0) {
                    class266.method1850(15, class182.field2934, var247, 96);
                }
            } else if (var229.method1185(0, class295.field5003)) {
                class168 var258 = var229.method1187(0, 0, var229.method1196(class95.field1517, 187));
                long var259 = var258.method1208((byte) 71);
                boolean var261 = false;
                for (int var262 = 0; var262 < class149.field2302; var262++) {
                    if (class201.field3311[var262] == var259) {
                        var261 = true;
                        break;
                    }
                }
                if (!var261 && class272.field4573 == 0) {
                    class266.method1850(16, class182.field2934, var258, 84);
                }
            } else if (var229.method1185(0, class51.field628)) {
                class168 var252 = var229.method1187(0, 0, var229.method1196(class95.field1517, 187));
                long var253 = var252.method1208((byte) 71);
                boolean var255 = false;
                for (int var256 = 0; var256 < class149.field2302; var256++) {
                    if (class201.field3311[var256] == var253) {
                        var255 = true;
                        break;
                    }
                }
                if (!var255 && class272.field4573 == 0) {
                    class168 var257 = var229.method1187(var229.method1196(class95.field1517, 187) + 1, 0, var229.method1167(false) - 9);
                    class266.method1850(21, var257, var252, 86);
                }
            } else {
                class266.method1850(0, var229, class182.field2934, 115);
            }
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 22) {
            class83.method560(0, true);
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 47) {
            long var215 = class166.field2671.method1087(1001);
            long var217 = (long) class166.field2671.method1069(30);
            long var219 = (long) class166.field2671.method1088(-30917);
            int var221 = class166.field2671.method1042((byte) -70);
            int var222 = class166.field2671.method1069(98);
            long var223 = (var217 << 32) + var219;
            boolean var225 = false;
            int var226 = 0;
            label1398: while (true) {
                if (var226 < 100) {
                    if (class162.field2618[var226] != var223) {
                        var226++;
                        continue;
                    }
                    var225 = true;
                    break;
                }
                if (var221 <= 1) {
                    for (int var227 = 0; var227 < class149.field2302; var227++) {
                        if (class201.field3311[var227] == var215) {
                            var225 = true;
                            break label1398;
                        }
                    }
                }
                break;
            }
            if (!var225 && class272.field4573 == 0) {
                class162.field2618[class118.field1848] = var223;
                class118.field1848 = (class118.field1848 + 1) % 100;
                class168 var228 = class294.method2021(var222, -2828).method1925(0, class166.field2671);
                if (var221 == 2) {
                    class40.method223((class168) null, var222, var228, 18, (byte) -118, class134.method938((byte) -125, new class168[] { class122.field1897, class69.method388(var215, (byte) 104).method1216(-32471) }));
                } else if (var221 == 1) {
                    class40.method223((class168) null, var222, var228, 18, (byte) -118, class134.method938((byte) -128, new class168[] { class171.field2783, class69.method388(var215, (byte) 104).method1216(-32471) }));
                } else {
                    class40.method223((class168) null, var222, var228, 18, (byte) -118, class69.method388(var215, (byte) 104).method1216(-32471));
                }
            }
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 193) {
            long var56 = class166.field2671.method1087(1001);
            int var58 = class166.field2671.method1069(117);
            boolean var59 = true;
            int var60 = class166.field2671.method1042((byte) -97);
            if (var56 < 0L) {
                var56 &= Long.MAX_VALUE;
                var59 = false;
            }
            class168 var61 = class182.field2934;
            if (var58 > 0) {
                var61 = class166.field2671.method1075(51);
            }
            class168 var62 = class69.method388(var56, (byte) 104).method1216(-32471);
            for (int var63 = 0; var63 < class107.field1642; var63++) {
                if (class61.field793[var63] == var56) {
                    if (class237.field3782[var63] != var58) {
                        class237.field3782[var63] = var58;
                        if (var58 > 0) {
                            class266.method1850(5, class134.method938((byte) -128, new class168[] { var62, class72.field967 }), class182.field2934, 86);
                        }
                        if (var58 == 0) {
                            class266.method1850(5, class134.method938((byte) -126, new class168[] { var62, class101.field1577 }), class182.field2934, 56);
                        }
                    }
                    class15.field162[var63] = var61;
                    var62 = null;
                    class22.field274[var63] = var60;
                    class27.field335[var63] = var59;
                    break;
                }
            }
            if (var62 != null && class107.field1642 < 200) {
                class61.field793[class107.field1642] = var56;
                class142.field2192[class107.field1642] = var62;
                class237.field3782[class107.field1642] = var58;
                class15.field162[class107.field1642] = var61;
                class22.field274[class107.field1642] = var60;
                class27.field335[class107.field1642] = var59;
                class107.field1642++;
            }
            boolean var64 = false;
            int var65 = class107.field1642;
            class285.field4828 = class9.field116;
            while (var65 > 0) {
                var65--;
                boolean var66 = true;
                for (int var67 = 0; var67 < var65; var67++) {
                    if (class237.field3782[var67] != class188.field2984 && class237.field3782[var67 + 1] == class188.field2984 || class237.field3782[var67] == 0 && class237.field3782[var67 + 1] != 0) {
                        var66 = false;
                        int var68 = class237.field3782[var67];
                        class237.field3782[var67] = class237.field3782[var67 + 1];
                        class237.field3782[var67 + 1] = var68;
                        class168 var69 = class15.field162[var67];
                        class15.field162[var67] = class15.field162[var67 + 1];
                        class15.field162[var67 + 1] = var69;
                        class168 var70 = class142.field2192[var67];
                        class142.field2192[var67] = class142.field2192[var67 + 1];
                        class142.field2192[var67 + 1] = var70;
                        long var71 = class61.field793[var67];
                        class61.field793[var67] = class61.field793[var67 + 1];
                        class61.field793[var67 + 1] = var71;
                        int var73 = class22.field274[var67];
                        class22.field274[var67] = class22.field274[var67 + 1];
                        class22.field274[var67 + 1] = var73;
                        boolean var74 = class27.field335[var67];
                        class27.field335[var67] = class27.field335[var67 + 1];
                        class27.field335[var67 + 1] = var74;
                    }
                }
                if (var66) {
                    break;
                }
            }
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 218) {
            int var209 = class166.field2671.method1089((byte) -14);
            int var210 = class166.field2671.method1089((byte) -14);
            class240 var211 = (class240) class26.field319.method493((long) var209, 122);
            class240 var212 = (class240) class26.field319.method493((long) var210, 126);
            if (var212 != null) {
                class67.method378(var211 == null || var211.field3898 != var212.field3898, var212, 0);
            }
            if (var211 != null) {
                var211.method124((byte) 30);
                class26.field319.method490(var211, (long) var210, true);
            }
            class242 var213 = class130.method910((byte) -103, var209);
            if (var213 != null) {
                client.method2011((byte) -59, var213);
            }
            class242 var214 = class130.method910((byte) -121, var210);
            if (var214 != null) {
                client.method2011((byte) -59, var214);
                class149.method1028(-123, var214, true);
            }
            if (class19.field221 != -1) {
                class28.method149(class19.field221, 1, true);
            }
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 242) {
            class76.method448((byte) 118);
            int var75 = class166.field2671.method1089((byte) -14);
            int var76 = class166.field2671.method1064((byte) 19);
            int var77 = class166.field2671.method1093((byte) 114);
            class20.field249[var76] = var75;
            class144.field2225[var76] = var77;
            class155.field2447[var76] = 1;
            for (int var78 = 0; var78 < 98; var78++) {
                if (var75 >= class278.field4669[var78]) {
                    class155.field2447[var76] = var78 + 2;
                }
            }
            class25.field307[class159.method1119(class105.field1611++, 31)] = var76;
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 142) {
            class268.field4525 = class166.field2671.method1049(true) * 30;
            class102.field1587 = -1;
            class50.field612 = class9.field116;
            return true;
        } else if (class102.field1587 == 32) {
            int var79 = class166.field2671.method1069(127);
            int var80 = class166.field2671.method1051(-128);
            class168 var81 = class166.field2671.method1075(90);
            class195.method1373((byte) -72, var79);
            class21.method105(var80, var81, 82);
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 232) {
            int var82 = class166.field2671.method1069(106);
            int var83 = class166.field2671.method1041(-54);
            int var84 = class166.field2671.method1049(true);
            int var85 = class166.field2671.method1089((byte) -14);
            class242 var86 = class130.method910((byte) -116, var85);
            if (var86.field4098 != var82 || var86.field4006 != var83 || var86.field3980 != var84) {
                var86.field4006 = var83;
                var86.field4098 = var82;
                var86.field3980 = var84;
                client.method2011((byte) -59, var86);
            }
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 157) {
            class76.method448((byte) 118);
            class117.field1824 = class166.field2671.method1081((byte) 109);
            class102.field1587 = -1;
            class50.field612 = class9.field116;
            return true;
        } else if (class102.field1587 == 75) {
            if (class110.field1726 == 0) {
                field4724 = class182.field2924;
            } else {
                field4724 = class166.field2671.method1075(34);
            }
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 100) {
            int var87 = class166.field2671.method1089((byte) -14);
            int var88 = class166.field2671.method1069(105);
            class242 var89;
            if (var87 >= 0) {
                var89 = class130.method910((byte) -92, var87);
            } else {
                var89 = null;
            }
            if (var87 < -70000) {
                var88 += 32768;
            }
            while (class110.field1726 > class166.field2671.field2367) {
                int var90 = class166.field2671.method1074((byte) -115);
                int var91 = class166.field2671.method1069(95);
                int var92 = 0;
                if (var91 != 0) {
                    var92 = class166.field2671.method1042((byte) 96);
                    if (var92 == 255) {
                        var92 = class166.field2671.method1089((byte) -14);
                    }
                }
                if (var89 != null && var90 >= 0 && var90 < var89.field4013.length) {
                    var89.field4013[var90] = var91;
                    var89.field4066[var90] = var92;
                }
                class200.method1404(var92, false, var91 - 1, var90, var88);
            }
            if (var89 != null) {
                client.method2011((byte) -59, var89);
            }
            class76.method448((byte) 118);
            class198.field3274[class159.method1119(class180.field2904++, 31)] = class159.method1119(var88, 32767);
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 127) {
            int var205 = class166.field2671.method1094((byte) 100);
            int var206 = class166.field2671.method1041(71);
            int var207 = class166.field2671.method1089((byte) -14);
            class240 var208 = (class240) class26.field319.method493((long) var207, 51);
            if (var208 != null) {
                class67.method378(var208.field3898 != var206, var208, 0);
            }
            class127.method900(var206, var205, var207, 0);
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 90) {
            class48.field595 = class9.field116;
            long var193 = class166.field2671.method1087(1001);
            if (var193 == 0L) {
                class291.field4896 = null;
                class114.field1776 = 0;
                class85.field1282 = null;
                class50.field610 = null;
                class102.field1587 = -1;
                return true;
            }
            long var195 = class166.field2671.method1087(1001);
            class50.field610 = class69.method388(var195, (byte) 104);
            class85.field1282 = class69.method388(var193, (byte) 104);
            class54.field680 = class166.field2671.method1078(-6338);
            int var197 = class166.field2671.method1042((byte) -48);
            if (var197 == 255) {
                class102.field1587 = -1;
                return true;
            }
            class114.field1776 = var197;
            class67[] var198 = new class67[100];
            for (int var199 = 0; var199 < class114.field1776; var199++) {
                var198[var199] = new class67();
                var198[var199].field292 = class166.field2671.method1087(1001);
                var198[var199].field889 = class69.method388(var198[var199].field292, (byte) 104);
                var198[var199].field892 = class166.field2671.method1069(38);
                var198[var199].field891 = class166.field2671.method1078(-6338);
                var198[var199].field886 = class166.field2671.method1075(58);
                if (class198.field3271 == var198[var199].field292) {
                    class5.field70 = var198[var199].field891;
                }
            }
            boolean var200 = false;
            int var201 = class114.field1776;
            while (var201 > 0) {
                boolean var202 = true;
                var201--;
                for (int var203 = 0; var203 < var201; var203++) {
                    if (var198[var203].field889.method1177(1, var198[var203 + 1].field889) > 0) {
                        class67 var204 = var198[var203];
                        var202 = false;
                        var198[var203] = var198[var203 + 1];
                        var198[var203 + 1] = var204;
                    }
                }
                if (var202) {
                    break;
                }
            }
            class291.field4896 = var198;
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 62) {
            int var93 = class166.field2671.method1081((byte) -29);
            int var94 = class166.field2671.method1091((byte) -97);
            class242 var95 = class130.method910((byte) -94, var94);
            if (var95.field3978 != var93 || var93 == -1) {
                var95.field4091 = 0;
                var95.field3978 = var93;
                var95.field4027 = 0;
                client.method2011((byte) -59, var95);
            }
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 244) {
            if (class19.field221 != -1) {
                class28.method149(class19.field221, 0, true);
            }
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 137) {
            class40.field513 = class166.field2671.method1042((byte) 92);
            class207.field3390 = class166.field2671.method1042((byte) 125);
            class273.field4590 = class166.field2671.method1042((byte) -29);
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 44) {
            int var96 = class166.field2671.method1089((byte) -14);
            class240 var97 = (class240) class26.field319.method493((long) var96, 87);
            if (var97 != null) {
                class67.method378(true, var97, 0);
            }
            if (class94.field1507 != null) {
                client.method2011((byte) -59, class94.field1507);
                class94.field1507 = null;
            }
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 164) {
            int var98 = class166.field2671.method1081((byte) 26);
            int var99 = class166.field2671.method1081((byte) -64);
            int var100 = class166.field2671.method1043((byte) -79);
            class242 var101 = class130.method910((byte) -92, var100);
            var101.field4069 = 0;
            var101.field4108 = var101.field4094 = var99;
            var101.field3988 = var101.field4031 = var98;
            var101.field4111 = 0;
            client.method2011((byte) -59, var101);
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 250) {
            long var178 = class166.field2671.method1087(1001);
            class166.field2671.method1078(-6338);
            long var180 = class166.field2671.method1087(1001);
            boolean var182 = false;
            long var183 = (long) class166.field2671.method1069(82);
            long var185 = (long) class166.field2671.method1088(-30917);
            long var187 = (var183 << 32) + var185;
            int var189 = class166.field2671.method1042((byte) -31);
            int var190 = 0;
            label1338: while (true) {
                if (var190 >= 100) {
                    if (var189 <= 1) {
                        if (class63.field830 == 1 || class72.field963 == 1) {
                            var182 = true;
                        } else {
                            for (int var191 = 0; var191 < class149.field2302; var191++) {
                                if (class201.field3311[var191] == var178) {
                                    var182 = true;
                                    break label1338;
                                }
                            }
                        }
                    }
                    break;
                }
                if (class162.field2618[var190] == var187) {
                    var182 = true;
                    break;
                }
                var190++;
            }
            if (!var182 && class272.field4573 == 0) {
                class162.field2618[class118.field1848] = var187;
                class118.field1848 = (class118.field1848 + 1) % 100;
                class168 var192 = class37.method205(class143.method980((byte) 109, class166.field2671).method1217((byte) 83));
                if (var189 == 2 || var189 == 3) {
                    class99.method745(class69.method388(var180, (byte) 104).method1216(-32471), 9, false, class134.method938((byte) -126, new class168[] { class122.field1897, class69.method388(var178, (byte) 104).method1216(-32471) }), var192);
                } else if (var189 == 1) {
                    class99.method745(class69.method388(var180, (byte) 104).method1216(-32471), 9, false, class134.method938((byte) -126, new class168[] { class171.field2783, class69.method388(var178, (byte) 104).method1216(-32471) }), var192);
                } else {
                    class99.method745(class69.method388(var180, (byte) 104).method1216(-32471), 9, false, class69.method388(var178, (byte) 104).method1216(-32471), var192);
                }
            }
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 190) {
            long var165 = class166.field2671.method1087(1001);
            long var167 = (long) class166.field2671.method1069(88);
            long var169 = (long) class166.field2671.method1088(-30917);
            long var171 = (var167 << 32) + var169;
            int var173 = class166.field2671.method1042((byte) -104);
            boolean var174 = false;
            int var175 = 0;
            label1302: while (true) {
                if (var175 < 100) {
                    if (class162.field2618[var175] != var171) {
                        var175++;
                        continue;
                    }
                    var174 = true;
                    break;
                }
                if (var173 <= 1) {
                    if (class63.field830 == 1 || class72.field963 == 1) {
                        var174 = true;
                    } else {
                        for (int var176 = 0; var176 < class149.field2302; var176++) {
                            if (class201.field3311[var176] == var165) {
                                var174 = true;
                                break label1302;
                            }
                        }
                    }
                }
                break;
            }
            if (!var174 && class272.field4573 == 0) {
                class162.field2618[class118.field1848] = var171;
                class118.field1848 = (class118.field1848 + 1) % 100;
                class168 var177 = class37.method205(class143.method980((byte) 111, class166.field2671).method1217((byte) 122));
                if (var173 == 2 || var173 == 3) {
                    class266.method1850(7, var177, class134.method938((byte) -124, new class168[] { class122.field1897, class69.method388(var165, (byte) 104).method1216(-32471) }), -12);
                } else if (var173 == 1) {
                    class266.method1850(7, var177, class134.method938((byte) -124, new class168[] { class171.field2783, class69.method388(var165, (byte) 104).method1216(-32471) }), 55);
                } else {
                    class266.method1850(3, var177, class69.method388(var165, (byte) 104).method1216(-32471), 73);
                }
            }
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 222) {
            int var157 = class166.field2671.method1041(56);
            int var158 = class166.field2671.method1049(true);
            if (var157 == 65535) {
                var157 = -1;
            }
            if (var158 == 65535) {
                var158 = -1;
            }
            int var159 = class166.field2671.method1089((byte) -14);
            int var160 = class166.field2671.method1043((byte) -87);
            for (int var161 = var157; var161 <= var158; var161++) {
                long var162 = ((long) var160 << 32) + (long) var161;
                class24 var164 = class48.field590.method493(var162, 116);
                if (var164 != null) {
                    var164.method124((byte) 100);
                }
                class48.field590.method490(new class69(var159), var162, true);
            }
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 153) {
            class251.method1715((byte) -114);
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 15) {
            int var155 = class166.field2671.method1064((byte) 19);
            int var156 = class166.field2671.method1049(true);
            class40.method222(var155, var156, 91);
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 115) {
            int var154 = class166.field2671.method1049(true);
            class102.method767(62, var154);
            class198.field3274[class159.method1119(class180.field2904++, 31)] = class159.method1119(var154, 32767);
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 122) {
            int var102 = class166.field2671.method1042((byte) -77);
            class15 var103 = new class15();
            int var104 = var102 >> 6;
            var103.field151 = var102 & 0x3F;
            var103.field150 = class166.field2671.method1042((byte) -68);
            if (var103.field150 >= 0 && var103.field150 < class148.field2285.length) {
                if (var103.field151 == 1 || var103.field151 == 10) {
                    var103.field157 = class166.field2671.method1069(30);
                    class166.field2671.field2367 += 3;
                } else if (var103.field151 >= 2 && var103.field151 <= 6) {
                    if (var103.field151 == 2) {
                        var103.field153 = 64;
                        var103.field172 = 64;
                    }
                    if (var103.field151 == 3) {
                        var103.field172 = 64;
                        var103.field153 = 0;
                    }
                    if (var103.field151 == 4) {
                        var103.field153 = 128;
                        var103.field172 = 64;
                    }
                    if (var103.field151 == 5) {
                        var103.field153 = 64;
                        var103.field172 = 0;
                    }
                    if (var103.field151 == 6) {
                        var103.field153 = 64;
                        var103.field172 = 128;
                    }
                    var103.field151 = 2;
                    var103.field156 = class166.field2671.method1069(81);
                    var103.field152 = class166.field2671.method1069(48);
                    var103.field158 = class166.field2671.method1042((byte) 109);
                }
                var103.field177 = class166.field2671.method1069(51);
                if (var103.field177 == 65535) {
                    var103.field177 = -1;
                }
                class43.field534[var104] = var103;
            }
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 169) {
            int var105 = class166.field2671.method1069(69);
            byte var106 = class166.field2671.method1072((byte) 73);
            class256.method1752((byte) -86, var105, var106);
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 211) {
            int var153 = class166.field2671.method1041(78);
            if (var153 == 65535) {
                var153 = -1;
            }
            class57.method322(var153, 85);
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 70) {
            int var151 = class166.field2671.method1051(-128);
            if (var151 == 65535) {
                var151 = -1;
            }
            int var152 = class166.field2671.method1085((byte) 90);
            class226.method1547(true, var151, var152);
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 147) {
            int var107 = class166.field2671.method1051(-128);
            int var108 = class166.field2671.method1089((byte) -14);
            class242 var109 = class130.method910((byte) -123, var108);
            if (var107 == 65535) {
                var107 = -1;
            }
            if (var109.field4022 != 2 || var109.field3993 != var107) {
                var109.field3993 = var107;
                var109.field4022 = 2;
                client.method2011((byte) -59, var109);
            }
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 203) {
            int var110 = class166.field2671.method1042((byte) -51);
            int var111 = class166.field2671.method1041(-52);
            int var112 = class166.field2671.method1049(true);
            class195.method1373((byte) -33, var112);
            class12.method43(var111, var110, 1);
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 61) {
            class48.method257(class166.field2671.method1075(71), 0);
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 117) {
            class76.method448((byte) 118);
            class107.field1643 = class166.field2671.method1042((byte) -114);
            class50.field612 = class9.field116;
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 119) {
            int var148 = class166.field2671.method1051(-128);
            int var149 = class166.field2671.method1041(48);
            class168 var150 = class166.field2671.method1075(39);
            class195.method1373((byte) -101, var148);
            class21.method105(var149, var150, 115);
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 183) {
            if (class8.field98 != null) {
                class78.method463(-1);
            }
            byte[] var113 = new byte[class110.field1726];
            class166.field2671.method725(class110.field1726, 0, 0, var113);
            class267.method1858(class183.method1302((byte) -10, 0, class110.field1726, var113), true, (byte) -125);
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 11) {
            int var114 = class166.field2671.method1043((byte) -125);
            class289.field4871 = class51.field622.method424(var114, (byte) 112);
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 125) {
            int var115 = class166.field2671.method1051(-128);
            int var116 = class166.field2671.method1091((byte) -88);
            int var117 = class166.field2671.method1049(true);
            int var118 = class166.field2671.method1069(51);
            if ((var116 >> 30) != 0) {
                int var119 = (var116 & 0x368BC08B) >> 28;
                int var120 = ((var116 & 0xFFFD139) >> 14) - class182.field2916;
                int var121 = (var116 & 0x3FFF) - class276.field4641;
                if (var120 >= 0 && var121 >= 0 && var120 < 104 && var121 < 104) {
                    int var122 = var121 * 128 + 64;
                    int var123 = var120 * 128 + 64;
                    class155 var124 = new class155(var117, var119, var123, var122, class62.method349(128, var119, var122, var123) - var118, var115, class203.field3335);
                    class1.field2.method451(-91453648, new class51(var124));
                }
            } else if ((var116 >> 29) != 0) {
                int var125 = var116 & 0xFFFF;
                class22 var126 = class190.field3065[var125];
                if (var126 != null) {
                    var126.field3047 = var118;
                    var126.field3026 = var117;
                    var126.field3022 = class203.field3335 + var115;
                    if (var126.field3026 == 65535) {
                        var126.field3026 = -1;
                    }
                    var126.field3042 = 0;
                    if (class203.field3335 < var126.field3022) {
                        var126.field3042 = -1;
                    }
                    var126.field2989 = 0;
                    if (var126.field3026 != -1 && class203.field3335 == var126.field3022) {
                        int var127 = class270.method1873(var126.field3026, false).field48;
                        if (var127 != -1) {
                            class190 var128 = class119.method858(true, var127);
                            if (var128 != null && var128.field3063 != null) {
                                class27.method142(var128, (byte) -119, var126.field3027, 0, var126.field3021, false);
                            }
                        }
                    }
                }
            } else if (var116 >> 28 != 0) {
                int var129 = var116 & 0xFFFF;
                class54 var130;
                if (class65.field873 == var129) {
                    var130 = class266.field4489;
                } else {
                    var130 = class9.field117[var129];
                }
                if (var130 != null) {
                    var130.field3026 = var117;
                    if (var130.field3026 == 65535) {
                        var130.field3026 = -1;
                    }
                    var130.field3022 = class203.field3335 + var115;
                    var130.field3042 = 0;
                    var130.field2989 = 0;
                    if (class203.field3335 < var130.field3022) {
                        var130.field3042 = -1;
                    }
                    var130.field3047 = var118;
                    if (var130.field3026 != -1 && class203.field3335 == var130.field3022) {
                        int var131 = class270.method1873(var130.field3026, false).field48;
                        if (var131 != -1) {
                            class190 var132 = class119.method858(true, var131);
                            if (var132 != null && var132.field3063 != null) {
                                class27.method142(var132, (byte) -119, var130.field3027, 0, var130.field3021, class266.field4489 == var130);
                            }
                        }
                    }
                }
            }
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 6) {
            int var145 = class166.field2671.method1091((byte) 69);
            class242 var146 = class130.method910((byte) -117, var145);
            for (int var147 = 0; var147 < var146.field4013.length; var147++) {
                var146.field4013[var147] = -1;
                var146.field4013[var147] = 0;
            }
            client.method2011((byte) -59, var146);
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 140) {
            int var142 = class166.field2671.method1089((byte) -14);
            int var143 = class166.field2671.method1041(66);
            if (var143 == 65535) {
                var143 = -1;
            }
            class242 var144 = class130.method910((byte) -107, var142);
            if (var144.field4022 != 1 || var144.field3993 != var143) {
                var144.field4022 = 1;
                var144.field3993 = var143;
                client.method2011((byte) -59, var144);
            }
            class102.field1587 = -1;
            return true;
        } else if (class102.field1587 == 93) {
            class211.method1473(-1473);
            class102.field1587 = -1;
            return true;
        } else {
            if (arg0 > -119) {
                field4719 = (int[]) null;
            }
            if (class102.field1587 == 87) {
                int var140 = class166.field2671.method1043((byte) -116);
                class242 var141 = class130.method910((byte) -109, var140);
                var141.field4022 = 3;
                var141.field3993 = class266.field4489.field668.method1496(2);
                client.method2011((byte) -59, var141);
                class102.field1587 = -1;
                return true;
            } else if (class102.field1587 == 17) {
                class76.field1032 = class166.field2671.method1042((byte) 91);
                class102.field1587 = -1;
                return true;
            } else if (class102.field1587 == 83 || class102.field1587 == 110 || class102.field1587 == 214 || class102.field1587 == 97 || class102.field1587 == 76 || class102.field1587 == 16 || class102.field1587 == 184 || class102.field1587 == 94 || class102.field1587 == 68 || class102.field1587 == 43 || class102.field1587 == 227 || class102.field1587 == 145) {
                class25.method130(116);
                class102.field1587 = -1;
                return true;
            } else if (class102.field1587 == 24) {
                int var137 = class166.field2671.method1049(true);
                int var138 = class166.field2671.method1042((byte) -39);
                if (var138 == 2) {
                    class131.method914(-107);
                }
                class19.field221 = var137;
                class27.method141((byte) -88, var137);
                class264.method1836(false, (byte) 16);
                class133.method929(-10917, class19.field221);
                for (int var139 = 0; var139 < 100; var139++) {
                    class214.field3495[var139] = true;
                }
                class102.field1587 = -1;
                return true;
            } else if (class102.field1587 == 13) {
                int var133 = class166.field2671.method1049(true);
                int var134 = class166.field2671.method1051(-128);
                int var135 = class166.field2671.method1052(29912);
                class242 var136 = class130.method910((byte) -106, var135);
                var136.field3962 = (var133 << 16) + var134;
                class102.field1587 = -1;
                return true;
            } else {
                class43.method234((Throwable) null, -15954, "T1 - " + class102.field1587 + "," + class62.field824 + "," + class63.field847 + " - " + class110.field1726);
                class144.method985(0);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIII)V", line = 2785)
    public static final void method1941(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != -1) {
            method1942((byte) -71);
        }
        field4716++;
        if (class9.field112 <= arg0 && arg0 <= class44.field538) {
            int var5 = class54.method301(class65.field874, arg4, class150.field2331, arg2 ^ 0xFFFFFFAC);
            int var6 = class54.method301(class65.field874, arg3, class150.field2331, 96);
            class71.method401(var5, var6, arg1, arg0, (byte) -14);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)[Lsk;", line = 2818)
    public static final class193[] method1942(byte arg0) {
        class193[] var1 = new class193[class201.field3305];
        field4722++;
        if (arg0 < 28) {
            field4719 = (int[]) null;
        }
        for (int var2 = 0; var2 < class201.field3305; var2++) {
            var1[var2] = new class232(class56.field724, class206.field3381, class154.field2430[var2], class254.field4341[var2], class205.field3374[var2], class214.field3490[var2], class236.field3779[var2], class123.field1905);
        }
        class244.method1679(-14642);
        return var1;
    }
}
