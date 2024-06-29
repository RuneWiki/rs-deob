import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class132 extends RuntimeException {

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "Ljava/lang/String;")
    public String field2270;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "Ljava/lang/Throwable;")
    public Throwable field2271;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "[[I")
    public static int[][] field2266 = new int[][] { new int[0], { 128, 0, 128, 128, 0, 128 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 64, 0, 128, 0, 128, 128, 64, 128 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 128, 0, 0, 32, 32, 96, 32, 128, 0, 128, 128 } };

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    public static int field2267 = 0;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2269 = "RuneScape is loading - please wait...";

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "Z")
    public static boolean field2275 = false;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    public static int field2268;

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "Lek;")
    public static class206 field2273;

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "Lek;")
    public static class206 field2276;

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "[[B")
    public static byte[][] field2272;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(BZ[B)Ljava/lang/Object;", line = 6)
    public static final Object method931(byte arg0, boolean arg1, byte[] arg2) {
        field2274++;
        if (arg2 == null) {
            return null;
        }
        if (arg2.length > 136 && !class220.field3659) {
            try {
                class61 var3 = (class61) Class.forName("be").getDeclaredConstructor().newInstance();
                var3.method497(arg2, 10);
                return var3;
            } catch (Throwable var5) {
                class220.field3659 = true;
            }
        }
        if (arg0 == 113) {
            return arg1 ? class76.method582(arg2, -1) : arg2;
        } else {
            return (Object) null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V", line = 50)
    public static void method932(int arg0) {
        field2269 = null;
        field2273 = null;
        if (arg0 != 18602) {
            field2269 = (String) null;
        }
        field2266 = (int[][]) null;
        field2276 = null;
        field2272 = (byte[][]) null;
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 68)
    public class132(Throwable arg0, String arg1) {
        this.field2270 = arg1;
        this.field2271 = arg0;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)Z", line = 79)
    public static final boolean method933(byte arg0) throws IOException {
        field2268++;
        if (class127.field2224 == null) {
            return false;
        }
        int var1 = class127.field2224.method1642((byte) -89);
        if (var1 == 0) {
            return false;
        }
        if (class65.field1240 == -1) {
            var1--;
            class127.field2224.method1643(0, 1, (byte) -68, class342.field5413.field2496);
            class342.field5413.field2435 = 0;
            class65.field1240 = class342.field5413.method293((byte) -128);
            class205.field3414 = class35.field776[class65.field1240];
        }
        if (class205.field3414 == -1) {
            if (var1 <= 0) {
                return false;
            }
            var1--;
            class127.field2224.method1643(0, 1, (byte) -125, class342.field5413.field2496);
            class205.field3414 = class342.field5413.field2496[0] & 0xFF;
        }
        if (class205.field3414 == -2) {
            if (var1 <= 1) {
                return false;
            }
            class127.field2224.method1643(0, 2, (byte) -103, class342.field5413.field2496);
            class342.field5413.field2435 = 0;
            class205.field3414 = class342.field5413.method989(79);
            var1 -= 2;
        }
        if (class205.field3414 > var1) {
            return false;
        }
        class342.field5413.field2435 = 0;
        class127.field2224.method1643(0, class205.field3414, (byte) -55, class342.field5413.field2496);
        class363.field5738 = 0;
        class155.field2629 = class359.field5721;
        class359.field5721 = class275.field4489;
        class275.field4489 = class65.field1240;
        if (class65.field1240 == 9) {
            class303.method2164((byte) 60, class342.field5413.method1017((byte) -124));
            class65.field1240 = -1;
            return true;
        } else if (class65.field1240 == 104) {
            int var2 = class342.field5413.method996(6107);
            int var3 = class342.field5413.method1007(-2);
            int var4 = class342.field5413.method1005((byte) 122);
            if (var2 == 65535) {
                var2 = -1;
            }
            String var5 = class342.field5413.method1017((byte) -119);
            if (var4 >= 1 && var4 <= 8) {
                if (var5.equalsIgnoreCase("null")) {
                    var5 = null;
                }
                class24.field623[var4 - 1] = var5;
                class223.field3694[var4 - 1] = var2;
                class133.field2284[var4 - 1] = var3 == 0;
            }
            class65.field1240 = -1;
            return true;
        } else if (class65.field1240 == 158) {
            int var367 = class342.field5413.method989(123);
            int var368 = class342.field5413.method1005((byte) 122);
            int var369 = class342.field5413.method1005((byte) 122);
            int var370 = class342.field5413.method1005((byte) 122);
            int var371 = class342.field5413.method1005((byte) 122);
            int var372 = class342.field5413.method989(117);
            if (class222.method1553(true, var367)) {
                class195.field3271[var368] = true;
                class334.field5318[var368] = var369;
                class231.field3790[var368] = var370;
                class19.field507[var368] = var371;
                class219.field3642[var368] = var372;
            }
            class65.field1240 = -1;
            return true;
        } else if (class65.field1240 == 170) {
            int var362 = class342.field5413.method989(75);
            String var363 = class342.field5413.method1017((byte) -127);
            Object[] var364 = new Object[var363.length() + 1];
            for (int var365 = var363.length() - 1; var365 >= 0; var365--) {
                if (var363.charAt(var365) == 's') {
                    var364[var365 + 1] = class342.field5413.method1017((byte) -117);
                } else {
                    var364[var365 + 1] = Integer.valueOf(class342.field5413.method1004(3));
                }
            }
            var364[0] = Integer.valueOf(class342.field5413.method1004(3));
            if (class222.method1553(true, var362)) {
                class47 var366 = new class47();
                var366.field936 = var364;
                class20.method184(var366, (byte) 122);
            }
            class65.field1240 = -1;
            return true;
        } else if (class65.field1240 == 245) {
            int var6 = class342.field5413.method1011(-32768);
            int var7 = class342.field5413.method996(6107);
            int var8 = class342.field5413.method1024(11008);
            if (class222.method1553(true, var6)) {
                class281.method2001(var8, 14, var7);
            }
            class65.field1240 = -1;
            return true;
        } else if (class65.field1240 == 103) {
            int var360 = class342.field5413.method1014(109);
            int var361 = class342.field5413.method1011(-32768);
            if (class222.method1553(true, var361)) {
                class158.method1141(0, -9590, 2047, 5, var360);
            }
            class65.field1240 = -1;
            return true;
        } else if (class65.field1240 == 34) {
            int var355 = class342.field5413.method1014(-59);
            int var356 = class342.field5413.method1011(-32768);
            int var357 = class342.field5413.method1054(2);
            int var358 = class342.field5413.method1011(-32768);
            int var359 = class342.field5413.method1054(2);
            if (class222.method1553(true, var359)) {
                class158.method1141(var356, -9590, var358 | var357 << 16, 7, var355);
            }
            class65.field1240 = -1;
            return true;
        } else if (class65.field1240 == 133) {
            class73.method555((byte) -108);
            class78.field1381 = class342.field5413.method1050(3);
            class65.field1240 = -1;
            class110.field2021 = class83.field1436;
            return true;
        } else if (class65.field1240 == 149) {
            int var351 = class342.field5413.method989(72);
            int var352 = class342.field5413.method1005((byte) 122);
            if (var351 == 65535) {
                var351 = -1;
            }
            int var353 = class342.field5413.method989(106);
            int var354 = class342.field5413.method1005((byte) 122);
            class23.method195(107, var351, var352, var354, var353);
            class65.field1240 = -1;
            return true;
        } else if (class65.field1240 == 150) {
            boolean var333 = class342.field5413.method1005((byte) 122) == 1;
            String var334 = class342.field5413.method1017((byte) -105);
            String var335 = class342.field5413.method1017((byte) -128);
            int var336 = class342.field5413.method989(67);
            String var337 = "";
            boolean var338 = false;
            int var339 = class342.field5413.method1005((byte) 122);
            if (var336 > 0) {
                var337 = class342.field5413.method1017((byte) -107);
                var338 = class342.field5413.method1005((byte) 122) == 1;
            }
            for (int var340 = 0; var340 < class151.field2550; var340++) {
                if (var333) {
                    if (var335.equals(class91.field1610[var340])) {
                        class91.field1610[var340] = var334;
                        var334 = null;
                        class18.field499[var340] = var335;
                        break;
                    }
                } else if (var334.equals(class91.field1610[var340])) {
                    if (class336.field5345[var340] != var336) {
                        class336.field5345[var340] = var336;
                        if (var336 > 0) {
                            class220.method1533(var334 + class103.field1887, "", 0, "", 5, 27293);
                        }
                        if (var336 == 0) {
                            class220.method1533(var334 + class316.field5148, "", 0, "", 5, 27293);
                        }
                    }
                    class18.field499[var340] = var335;
                    class224.field3699[var340] = var337;
                    var334 = null;
                    class125.field2202[var340] = var339;
                    class293.field4742[var340] = var338;
                    break;
                }
            }
            if (var334 != null && class151.field2550 < 200) {
                class91.field1610[class151.field2550] = var334;
                class18.field499[class151.field2550] = var335;
                class336.field5345[class151.field2550] = var336;
                class224.field3699[class151.field2550] = var337;
                class125.field2202[class151.field2550] = var339;
                class293.field4742[class151.field2550] = var338;
                class151.field2550++;
            }
            class70.field1286 = class83.field1436;
            boolean var341 = false;
            int var342 = class151.field2550;
            while (var342 > 0) {
                boolean var343 = true;
                var342--;
                for (int var344 = 0; var344 < var342; var344++) {
                    if (class336.field5345[var344] != class68.field1262 && class336.field5345[var344 + 1] == class68.field1262 || class336.field5345[var344] == 0 && class336.field5345[var344 + 1] != 0) {
                        var343 = false;
                        int var345 = class336.field5345[var344];
                        class336.field5345[var344] = class336.field5345[var344 + 1];
                        class336.field5345[var344 + 1] = var345;
                        String var346 = class224.field3699[var344];
                        class224.field3699[var344] = class224.field3699[var344 + 1];
                        class224.field3699[var344 + 1] = var346;
                        String var347 = class91.field1610[var344];
                        class91.field1610[var344] = class91.field1610[var344 + 1];
                        class91.field1610[var344 + 1] = var347;
                        String var348 = class18.field499[var344];
                        class18.field499[var344] = class18.field499[var344 + 1];
                        class18.field499[var344 + 1] = var348;
                        int var349 = class125.field2202[var344];
                        class125.field2202[var344] = class125.field2202[var344 + 1];
                        class125.field2202[var344 + 1] = var349;
                        boolean var350 = class293.field4742[var344];
                        class293.field4742[var344] = class293.field4742[var344 + 1];
                        class293.field4742[var344 + 1] = var350;
                    }
                }
                if (var343) {
                    break;
                }
            }
            class65.field1240 = -1;
            return true;
        } else if (class65.field1240 == 4) {
            int var9 = class342.field5413.method989(83);
            class318.method2288(-1860655736, var9);
            class182.field3162[class83.method613(class220.field3656++, 31)] = class83.method613(32767, var9);
            class65.field1240 = -1;
            return true;
        } else if (class65.field1240 == 125) {
            int var331 = class342.field5413.method1011(-32768);
            int var332 = class342.field5413.method1034(0);
            class8.method93(32, var332, var331);
            class65.field1240 = -1;
            return true;
        } else if (class65.field1240 == 251) {
            class73.method555((byte) -109);
            int var10 = class342.field5413.method1005((byte) 122);
            int var11 = class342.field5413.method1014(-98);
            int var12 = class342.field5413.method1005((byte) 122);
            class208.field3474[var10] = var11;
            class128.field2231[var10] = var12;
            class75.field1364[var10] = 1;
            for (int var13 = 0; var13 < 98; var13++) {
                if (var11 >= class26.field671[var13]) {
                    class75.field1364[var10] = var13 + 2;
                }
            }
            class77.field1379[class83.method613(class171.field2821++, 31)] = var10;
            class65.field1240 = -1;
            return true;
        } else if (class65.field1240 == 166) {
            int var14 = class342.field5413.method1014(-22);
            class181 var15 = class224.method1564(-109, var14);
            for (int var16 = 0; var16 < var15.field2983.length; var16++) {
                var15.field2983[var16] = -1;
                var15.field2983[var16] = 0;
            }
            class52.method459(128, var15);
            class65.field1240 = -1;
            return true;
        } else if (class65.field1240 == 202) {
            int var329 = class342.field5413.method1014(-52);
            int var330 = class342.field5413.method1011(-32768);
            class8.method93(32, var329, var330);
            class65.field1240 = -1;
            return true;
        } else if (class65.field1240 == 219) {
            int var326 = class342.field5413.method989(108);
            int var327 = class342.field5413.method1011(-32768);
            String var328 = class342.field5413.method1017((byte) -119);
            if (class222.method1553(true, var326)) {
                class134.method942(var327, -86, var328);
            }
            class65.field1240 = -1;
            return true;
        } else if (class65.field1240 == 25) {
            class282.method2004(0);
            class73.method555((byte) -124);
            class65.field1240 = -1;
            class278.field4524 += 32;
            return true;
        } else if (class65.field1240 == 80) {
            int var17 = class342.field5413.method989(80);
            int var18 = class342.field5413.method1004(3);
            if (class222.method1553(true, var17)) {
                class355 var19 = (class355) class34.field758.method2344(-1, (long) var18);
                if (var19 != null) {
                    class6.method44(var19, true, (byte) -18);
                }
                if (class140.field2371 != null) {
                    class52.method459(128, class140.field2371);
                    class140.field2371 = null;
                }
            }
            class65.field1240 = -1;
            return true;
        } else if (class65.field1240 == 66) {
            int var318 = class342.field5413.method1004(3);
            int var319 = class342.field5413.method989(105);
            if (var318 < -70000) {
                var319 += 32768;
            }
            class181 var320;
            if (var318 < 0) {
                var320 = null;
            } else {
                var320 = class224.method1564(-108, var318);
            }
            if (var320 != null) {
                for (int var321 = 0; var321 < var320.field2983.length; var321++) {
                    var320.field2983[var321] = 0;
                    var320.field2989[var321] = 0;
                }
            }
            class292.method2073(13248, var319);
            int var322 = class342.field5413.method989(111);
            for (int var323 = 0; var323 < var322; var323++) {
                int var324 = class342.field5413.method1034(0);
                if (var324 == 255) {
                    var324 = class342.field5413.method1018(-1);
                }
                int var325 = class342.field5413.method1011(-32768);
                if (var320 != null && var323 < var320.field2983.length) {
                    var320.field2983[var323] = var325;
                    var320.field2989[var323] = var324;
                }
                class147.method1056((byte) 108, var323, var325 - 1, var319, var324);
            }
            if (var320 != null) {
                class52.method459(128, var320);
            }
            class73.method555((byte) -120);
            class182.field3162[class83.method613(class220.field3656++, 31)] = class83.method613(var319, 32767);
            class65.field1240 = -1;
            return true;
        } else if (class65.field1240 == 206) {
            int var317 = class342.field5413.method1005((byte) 122);
            if (class342.field5413.method1005((byte) 122) == 0) {
                class161.field2718[var317] = new class225();
            } else {
                class342.field5413.field2435--;
                class161.field2718[var317] = new class225(class342.field5413);
            }
            class353.field5647 = class83.field1436;
            class65.field1240 = -1;
            return true;
        } else if (class65.field1240 == 6) {
            int var20 = class342.field5413.method1054(2);
            byte var21 = class342.field5413.method1029(-2);
            class207.method1433((byte) -86, var20, var21);
            class65.field1240 = -1;
            return true;
        } else if (class65.field1240 == 110) {
            int var22 = class342.field5413.method1024(11008);
            class267.field4363 = class59.field1164.method1121(0, var22);
            class65.field1240 = -1;
            return true;
        } else if (class65.field1240 == 63) {
            int var23 = class342.field5413.method1005((byte) 122);
            String var24 = class342.field5413.method1017((byte) -117);
            String var25 = class342.field5413.method1017((byte) -108);
            boolean var26 = (var23 & 0x1) == 1;
            String var27 = class342.field5413.method1017((byte) -110);
            String var28 = class342.field5413.method1017((byte) -110);
            if (var26) {
                for (int var29 = 0; var29 < class317.field5171; var29++) {
                    if (class340.field5382[var29].equals(var28)) {
                        class306.field4974[var29] = var24;
                        if (var25.equals("")) {
                            class340.field5382[var29] = var24;
                        } else {
                            class340.field5382[var29] = var25;
                        }
                        class178.field2945[var29] = var27;
                        if (var28.equals("")) {
                            class295.field4821[var29] = var27;
                        } else {
                            class295.field4821[var29] = var28;
                        }
                        break;
                    }
                }
            } else {
                class306.field4974[class317.field5171] = var24;
                if (var25.equals("")) {
                    class340.field5382[class317.field5171] = var24;
                } else {
                    class340.field5382[class317.field5171] = var25;
                }
                class178.field2945[class317.field5171] = var27;
                if (var28.equals("")) {
                    class295.field4821[class317.field5171] = var27;
                } else {
                    class295.field4821[class317.field5171] = var28;
                }
                class76.field1369[class317.field5171] = class83.method613(var23, 2) == 2;
                class317.field5171++;
            }
            class70.field1286 = class83.field1436;
            class65.field1240 = -1;
            return true;
        } else if (class65.field1240 == 144) {
            String var30 = class342.field5413.method1017((byte) -126);
            int var31 = class342.field5413.method996(6107);
            int var32 = class342.field5413.method1024(11008);
            if (class222.method1553(true, var31)) {
                class275.method1959(var32, (byte) -113, var30);
            }
            class65.field1240 = -1;
            return true;
        } else if (class65.field1240 == 244) {
            int var315 = class342.field5413.method996(6107);
            int var316 = class342.field5413.method1007(-2);
            if (class222.method1553(true, var315)) {
                class51.field1042 = var316;
            }
            class65.field1240 = -1;
            return true;
        } else if (class65.field1240 == 193) {
            class310.field5059 = class342.field5413.method1034(0);
            class97.field1772 = class342.field5413.method1005((byte) 122);
            for (int var312 = class310.field5059; var312 < class310.field5059 + 8; var312++) {
                for (int var313 = class97.field1772; var313 < (class97.field1772 + 8); var313++) {
                    if (class99.field1810[class276.field4506][var312][var313] != null) {
                        class99.field1810[class276.field4506][var312][var313] = null;
                        class8.method88(20000, var312, var313);
                    }
                }
            }
            for (class107 var314 = (class107) class123.field2165.method431(0); var314 != null; var314 = (class107) class123.field2165.method439(-28512)) {
                if (var314.field1944 >= class310.field5059 && var314.field1944 < class310.field5059 + 8 && class97.field1772 <= var314.field1936 && var314.field1936 < (class97.field1772 + 8) && class276.field4506 == var314.field1950) {
                    var314.field1940 = 0;
                }
            }
            class65.field1240 = -1;
            return true;
        } else if (class65.field1240 == 31) {
            String var33 = class342.field5413.method1017((byte) -107);
            int var34 = class342.field5413.method989(86);
            String var35 = class335.method2362(104, var34).method251((byte) 50, class342.field5413);
            class287.method2038(false, (String) null, var35, var33, var34, var33, 19, 0);
            class65.field1240 = -1;
            return true;
        } else if (class65.field1240 == 137) {
            int var36 = class342.field5413.method1005((byte) 122);
            int var37 = class342.field5413.method992((byte) 119);
            int var38 = class342.field5413.method1005((byte) 122);
            class276.field4506 = var36 >> 1;
            class96.field1750.method749((var36 & 0x1) == 1, var38, -26866, var37);
            class65.field1240 = -1;
            return true;
        } else if (class65.field1240 == 39) {
            int var309 = class342.field5413.method1011(-32768);
            int var310 = class342.field5413.method1034(0);
            int var311 = class342.field5413.method1004(3);
            if (class222.method1553(true, var309)) {
                class171.method1214(var310, var311, 108);
            }
            class65.field1240 = -1;
            return true;
        } else if (class65.field1240 == 167) {
            int var39 = class342.field5413.method1011(-32768);
            int var40 = class342.field5413.method1011(-32768);
            int var41 = class342.field5413.method1004(3);
            int var42 = class342.field5413.method1024(11008);
            if (class222.method1553(true, var40)) {
                class158.method1141(var41, -9590, var39, 5, var42);
            }
            class65.field1240 = -1;
            return true;
        } else if (class65.field1240 == 161) {
            class97.field1772 = class342.field5413.method1005((byte) 122);
            class310.field5059 = class342.field5413.method1034(0);
            while (class205.field3414 > class342.field5413.field2435) {
                class65.field1240 = class342.field5413.method1005((byte) 122);
                class23.method201(-1);
            }
            class65.field1240 = -1;
            return true;
        } else if (class65.field1240 == 93) {
            int var43 = class342.field5413.method1005((byte) 122);
            int var44 = var43 >> 5;
            int var45 = var43 & 0x1F;
            if (var45 == 0) {
                class120.field2140[var44] = null;
                class65.field1240 = -1;
                return true;
            }
            class68 var46 = new class68();
            var46.field1253 = var45;
            var46.field1274 = class342.field5413.method1005((byte) 122);
            if (var46.field1274 >= 0 && class138.field2351.length > var46.field1274) {
                if (var46.field1253 == 1 || var46.field1253 == 10) {
                    var46.field1264 = class342.field5413.method989(92);
                    class342.field5413.field2435 += 5;
                } else if (var46.field1253 >= 2 && var46.field1253 <= 6) {
                    if (var46.field1253 == 2) {
                        var46.field1271 = 64;
                        var46.field1273 = 64;
                    }
                    if (var46.field1253 == 3) {
                        var46.field1271 = 0;
                        var46.field1273 = 64;
                    }
                    if (var46.field1253 == 4) {
                        var46.field1271 = 128;
                        var46.field1273 = 64;
                    }
                    if (var46.field1253 == 5) {
                        var46.field1273 = 0;
                        var46.field1271 = 64;
                    }
                    if (var46.field1253 == 6) {
                        var46.field1273 = 128;
                        var46.field1271 = 64;
                    }
                    var46.field1253 = 2;
                    var46.field1275 = class342.field5413.method989(67);
                    var46.field1257 = class342.field5413.method989(85);
                    var46.field1265 = class342.field5413.method1005((byte) 122);
                    var46.field1259 = class342.field5413.method989(96);
                }
                var46.field1268 = class342.field5413.method989(101);
                if (var46.field1268 == 65535) {
                    var46.field1268 = -1;
                }
                class120.field2140[var44] = var46;
            }
            class65.field1240 = -1;
            return true;
        } else if (class65.field1240 == 190) {
            if (class88.field1566 != -1) {
                class222.method1557(0, true, class88.field1566);
            }
            class65.field1240 = -1;
            return true;
        } else if (class65.field1240 == 172) {
            class284.method2018((byte) 83);
            class65.field1240 = -1;
            return true;
        } else if (class65.field1240 == 106) {
            boolean var295 = class342.field5413.method1005((byte) 122) == 1;
            String var296 = class342.field5413.method1017((byte) -122);
            String var297 = var296;
            if (var295) {
                var297 = class342.field5413.method1017((byte) -111);
            }
            long var298 = (long) class342.field5413.method989(119);
            long var300 = (long) class342.field5413.method1025((byte) -96);
            int var302 = class342.field5413.method1005((byte) 122);
            int var303 = class342.field5413.method989(108);
            boolean var304 = false;
            long var305 = (var298 << 32) + var300;
            int var307 = 0;
            while (true) {
                if (var307 >= 100) {
                    if (var302 <= 1 && class110.method823(var297, -98)) {
                        var304 = true;
                    }
                    break;
                }
                if (class238.field3973[var307] == var305) {
                    var304 = true;
                    break;
                }
                var307++;
            }
            if (!var304 && class18.field495 == 0) {
                class238.field3973[class53.field1058] = var305;
                class53.field1058 = (class53.field1058 + 1) % 100;
                String var308 = class335.method2362(104, var303).method251((byte) 50, class342.field5413);
                if (var302 == 2) {
                    class287.method2038(false, (String) null, var308, "<img=1>" + var297, var303, "<img=1>" + var296, 18, 0);
                } else if (var302 == 1) {
                    class287.method2038(false, (String) null, var308, "<img=0>" + var297, var303, "<img=0>" + var296, 18, 0);
                } else {
                    class287.method2038(false, (String) null, var308, var297, var303, var296, 18, 0);
                }
            }
            class65.field1240 = -1;
            return true;
        } else if (class65.field1240 == 119) {
            class342.field5413.field2435 += 28;
            if (class342.field5413.method1035((byte) 31)) {
                class295.method2121(class342.field5413.field2435 - 28, class342.field5413, 1008605068);
            }
            class65.field1240 = -1;
            return true;
        } else if (class65.field1240 == 177) {
            int var291 = class342.field5413.method1011(-32768);
            int var292 = class342.field5413.method1050(3);
            int var293 = class342.field5413.method1050(3);
            int var294 = class342.field5413.method1004(3);
            if (class222.method1553(true, var291)) {
                class153.method1095(124, var292, var293, var294);
            }
            class65.field1240 = -1;
            return true;
        } else if (class65.field1240 == 252) {
            int var47 = class342.field5413.method996(6107);
            if (var47 == 65535) {
                var47 = -1;
            }
            int var48 = class342.field5413.method996(6107);
            if (var48 == 65535) {
                var48 = -1;
            }
            int var49 = class342.field5413.method996(6107);
            int var50 = class342.field5413.method1024(11008);
            int var51 = class342.field5413.method1018(-1);
            if (class222.method1553(true, var49)) {
                for (int var52 = var48; var52 <= var47; var52++) {
                    long var53 = ((long) var51 << 32) + (long) var52;
                    class340 var55 = (class340) class223.field3682.method2344(-1, var53);
                    class340 var56;
                    if (var55 != null) {
                        var56 = new class340(var50, var55.field5390);
                        var55.method535(-2801);
                    } else if (var52 == -1) {
                        var56 = new class340(var50, class224.method1564(-104, var51).field3025.field5390);
                    } else {
                        var56 = new class340(var50, -1);
                    }
                    class223.field3682.method2337(var56, 709, var53);
                }
            }
            class65.field1240 = -1;
            return true;
        } else if (class65.field1240 == 127) {
            String var278 = class342.field5413.method1017((byte) -120);
            boolean var279 = class342.field5413.method1005((byte) 122) == 1;
            String var280;
            if (var279) {
                var280 = class342.field5413.method1017((byte) -108);
            } else {
                var280 = var278;
            }
            int var281 = class342.field5413.method989(107);
            byte var282 = class342.field5413.method1029(-2);
            boolean var283 = false;
            if (var282 == -128) {
                var283 = true;
            }
            if (var283) {
                if (class293.field4739 == 0) {
                    class65.field1240 = -1;
                    return true;
                }
                boolean var289 = false;
                int var290;
                for (var290 = 0; var290 < class293.field4739 && (!class85.field1473[var290].field4605.equals(var280) || class85.field1473[var290].field4602 != var281); var290++) {
                }
                if (var290 < class293.field4739) {
                    while (var290 < class293.field4739 - 1) {
                        class85.field1473[var290] = class85.field1473[var290 + 1];
                        var290++;
                    }
                    class293.field4739--;
                    class85.field1473[class293.field4739] = null;
                }
            } else {
                String var284 = class342.field5413.method1017((byte) -118);
                class281 var285 = new class281();
                var285.field4598 = var282;
                var285.field4599 = var284;
                var285.field4603 = var278;
                var285.field4602 = var281;
                var285.field4605 = var280;
                int var286;
                for (var286 = class293.field4739 - 1; var286 >= 0; var286--) {
                    int var287 = class85.field1473[var286].field4605.compareTo(var285.field4605);
                    if (var287 == 0) {
                        class85.field1473[var286].field4602 = var281;
                        class85.field1473[var286].field4598 = var282;
                        class85.field1473[var286].field4599 = var284;
                        if (var280.equals(class96.field1750.field1779)) {
                            class127.field2212 = var282;
                        }
                        class240.field3987 = class83.field1436;
                        class65.field1240 = -1;
                        return true;
                    }
                    if (var287 < 0) {
                        break;
                    }
                }
                if (class293.field4739 >= class85.field1473.length) {
                    class65.field1240 = -1;
                    return true;
                }
                for (int var288 = class293.field4739 - 1; var288 > var286; var288--) {
                    class85.field1473[var288 + 1] = class85.field1473[var288];
                }
                if (class293.field4739 == 0) {
                    class85.field1473 = new class281[100];
                }
                class85.field1473[var286 + 1] = var285;
                class293.field4739++;
                if (var280.equals(class96.field1750.field1779)) {
                    class127.field2212 = var282;
                }
            }
            class240.field3987 = class83.field1436;
            class65.field1240 = -1;
            return true;
        } else if (class65.field1240 == 118) {
            int var268 = class342.field5413.method1011(-32768);
            int var269 = class342.field5413.method1054(2);
            int var270 = class342.field5413.method1018(-1);
            if (var269 == 65535) {
                var269 = -1;
            }
            int var271 = class342.field5413.method1011(-32768);
            int var272 = class342.field5413.method1054(2);
            if (var272 == 65535) {
                var272 = -1;
            }
            if (class222.method1553(true, var271)) {
                for (int var273 = var269; var273 <= var272; var273++) {
                    long var274 = ((long) var270 << 32) + (long) var273;
                    class340 var276 = (class340) class223.field3682.method2344(-1, var274);
                    class340 var277;
                    if (var276 != null) {
                        var277 = new class340(var276.field5380, var268);
                        var276.method535(-2801);
                    } else if (var273 == -1) {
                        var277 = new class340(class224.method1564(-100, var270).field3025.field5380, var268);
                    } else {
                        var277 = new class340(0, var268);
                    }
                    class223.field3682.method2337(var277, 709, var274);
                }
            }
            class65.field1240 = -1;
            return true;
        } else if (class65.field1240 == 199) {
            class73.method555((byte) -111);
            class14.field408 = class342.field5413.method1005((byte) 122);
            class110.field2021 = class83.field1436;
            class65.field1240 = -1;
            return true;
        } else if (class65.field1240 == 198) {
            int var265 = class342.field5413.method996(6107);
            int var266 = class342.field5413.method1054(2);
            int var267 = class342.field5413.method1004(3);
            if (class222.method1553(true, var266)) {
                class146.method1028(var265, true, var267);
            }
            class65.field1240 = -1;
            return true;
        } else if (class65.field1240 == 229) {
            int var259 = class342.field5413.method989(80);
            int var260 = class342.field5413.method1005((byte) 122);
            int var261 = class342.field5413.method1005((byte) 122);
            int var262 = class342.field5413.method989(68);
            int var263 = class342.field5413.method1005((byte) 122);
            int var264 = class342.field5413.method1005((byte) 122);
            if (class222.method1553(true, var259)) {
                class356.method2525(var261, var260, var264, var262, var263, -120);
            }
            class65.field1240 = -1;
            return true;
        } else if (class65.field1240 == 148) {
            int var256 = class342.field5413.method1011(-32768);
            int var257 = class342.field5413.method1018(-1);
            int var258 = class342.field5413.method996(6107);
            if (class222.method1553(true, var256)) {
                class182.method1286((byte) -50, var258, var257);
            }
            class65.field1240 = -1;
            return true;
        } else if (class65.field1240 == 147) {
            for (int var57 = 0; var57 < class334.field5322.length; var57++) {
                if (class340.field5391[var57] != class334.field5322[var57]) {
                    class334.field5322[var57] = class340.field5391[var57];
                    class142.method974(var57, 1);
                    class68.field1272[class83.method613(class278.field4524++, 31)] = var57;
                }
            }
            class65.field1240 = -1;
            return true;
        } else if (class65.field1240 == 243) {
            boolean var243 = class342.field5413.method1005((byte) 122) == 1;
            String var244 = class342.field5413.method1017((byte) -105);
            String var245 = var244;
            if (var243) {
                var245 = class342.field5413.method1017((byte) -110);
            }
            long var246 = (long) class342.field5413.method989(80);
            long var248 = (long) class342.field5413.method1025((byte) -123);
            int var250 = class342.field5413.method1005((byte) 122);
            long var251 = (var246 << 32) + var248;
            boolean var253 = false;
            int var254 = 0;
            while (true) {
                if (var254 < 100) {
                    if (class238.field3973[var254] != var251) {
                        var254++;
                        continue;
                    }
                    var253 = true;
                    break;
                }
                if (var250 <= 1) {
                    if (!(!class153.field2612 || class345.field5452) || class312.field5088) {
                        var253 = true;
                    } else if (class110.method823(var245, -122)) {
                        var253 = true;
                    }
                }
                break;
            }
            if (!var253 && class18.field495 == 0) {
                class238.field3973[class53.field1058] = var251;
                class53.field1058 = (class53.field1058 + 1) % 100;
                String var255 = class84.method622(class298.method2136((byte) 127, class216.method1509(class342.field5413, -82)));
                if (var250 == 2) {
                    class287.method2038(false, (String) null, var255, "<img=1>" + var245, -1, "<img=1>" + var244, 7, 0);
                } else if (var250 == 1) {
                    class287.method2038(false, (String) null, var255, "<img=0>" + var245, -1, "<img=0>" + var244, 7, 0);
                } else {
                    class287.method2038(false, (String) null, var255, var245, -1, var244, 3, 0);
                }
            }
            class65.field1240 = -1;
            return true;
        } else if (class65.field1240 == 182) {
            int var240 = class342.field5413.method1005((byte) 122);
            int var241 = class342.field5413.method1005((byte) 122);
            byte var242 = class342.field5413.method1029(-2);
            if (class272.field4424 != var242) {
                class65.field1240 = -1;
                return true;
            }
            if (var240 == 255) {
                class92.field1637 = 0;
                class275.field4492 = false;
                class284.field4641 = 0;
            } else {
                class284.field4641 = var241;
                class92.field1637 = var240;
                class275.field4492 = true;
            }
            class65.field1240 = -1;
            return true;
        } else if (class65.field1240 == 136) {
            int var229 = class342.field5413.method996(6107);
            if (var229 == 65535) {
                var229 = -1;
            }
            int var230 = class342.field5413.method992((byte) 112);
            int var231 = var230 & 0x3;
            int var232 = var230 >> 2;
            int var233 = class47.field952[var232];
            int var234 = class342.field5413.method1004(3);
            int var235 = (var234 & 0xFFFC19A) >> 14;
            int var236 = var235 - class272.field4426;
            int var237 = var234 >> 28 & 0x3;
            int var238 = var234 & 0x3FFF;
            int var239 = var238 - class21.field543;
            class174.method1236(var233, 85, var229, var237, var231, var236, var239, var232);
            class65.field1240 = -1;
            return true;
        } else if (class65.field1240 == 76) {
            int var58 = class342.field5413.method996(6107);
            int var59 = class342.field5413.method1024(11008);
            int var60 = class342.field5413.method1007(-2);
            int var61 = class342.field5413.method996(6107);
            if (class222.method1553(true, var61)) {
                class355 var62 = (class355) class34.field758.method2344(-1, (long) var59);
                if (var62 != null) {
                    class6.method44(var62, var62.field5657 != var58, (byte) 125);
                }
                class119.method866(var60, var59, (byte) 88, var58);
            }
            class65.field1240 = -1;
            return true;
        } else if (class65.field1240 == 77 || class65.field1240 == 109 || class65.field1240 == 32 || class65.field1240 == 124 || class65.field1240 == 145 || class65.field1240 == 171 || class65.field1240 == 107 || class65.field1240 == 59 || class65.field1240 == 228 || class65.field1240 == 12 || class65.field1240 == 19 || class65.field1240 == 22 || class65.field1240 == 115 || class65.field1240 == 179) {
            class23.method201(-1);
            class65.field1240 = -1;
            return true;
        } else if (class65.field1240 == 75) {
            class34.field759 = class342.field5413.method1005((byte) 122);
            class70.field1286 = class83.field1436;
            class65.field1240 = -1;
            return true;
        } else if (class65.field1240 == 230) {
            class293.method2081(-11542, false);
            class65.field1240 = -1;
            return true;
        } else if (class65.field1240 == 146) {
            int var226 = class342.field5413.method1004(3);
            int var227 = class342.field5413.method989(100);
            int var228 = class342.field5413.method1021((byte) 84);
            if (class222.method1553(true, var227)) {
                class306.method2235(5, var228, var226);
            }
            class65.field1240 = -1;
            return true;
        } else if (class65.field1240 == 214) {
            int var63 = class342.field5413.method996(6107);
            int var64 = class342.field5413.method989(116);
            int var65 = class342.field5413.method989(95);
            int var66 = class342.field5413.method1018(-1);
            if (class222.method1553(true, var63)) {
                class303.method2169(var66, (var64 << 16) + var65, 32);
            }
            class65.field1240 = -1;
            return true;
        } else if (class65.field1240 == 42) {
            class174.field2885 = class342.field5413.method1005((byte) 122);
            class65.field1240 = -1;
            return true;
        } else if (class65.field1240 == 29) {
            int var67 = class342.field5413.method1011(-32768);
            int var68 = class342.field5413.method989(91);
            int var69 = class342.field5413.method1024(11008);
            int var70 = class342.field5413.method996(6107);
            int var71 = class342.field5413.method1011(-32768);
            if (class222.method1553(true, var67)) {
                class88.method672(var68, var71, -128, var70, var69);
            }
            class65.field1240 = -1;
            return true;
        } else if (class65.field1240 == 11) {
            int var219 = class342.field5413.method1018(-1);
            int var220 = class342.field5413.method1004(3);
            int var221 = class342.field5413.method996(6107);
            if (class222.method1553(true, var221)) {
                class355 var222 = (class355) class34.field758.method2344(-1, (long) var220);
                class355 var223 = (class355) class34.field758.method2344(-1, (long) var219);
                if (var223 != null) {
                    class6.method44(var223, var222 == null || var222.field5657 != var223.field5657, (byte) 105);
                }
                if (var222 != null) {
                    var222.method535(-2801);
                    class34.field758.method2337(var222, 709, (long) var219);
                }
                class181 var224 = class224.method1564(-105, var220);
                if (var224 != null) {
                    class52.method459(128, var224);
                }
                class181 var225 = class224.method1564(-117, var219);
                if (var225 != null) {
                    class52.method459(128, var225);
                    class353.method2513(true, var225, 124);
                }
                if (class88.field1566 != -1) {
                    class222.method1557(1, true, class88.field1566);
                }
            }
            class65.field1240 = -1;
            return true;
        } else if (class65.field1240 == 163) {
            int var213 = class342.field5413.method1004(3);
            int var214 = class342.field5413.method989(120);
            if (var213 < -70000) {
                var214 += 32768;
            }
            class181 var215;
            if (var213 < 0) {
                var215 = null;
            } else {
                var215 = class224.method1564(-109, var213);
            }
            while (class342.field5413.field2435 < class205.field3414) {
                int var216 = class342.field5413.method1020(true);
                int var217 = 0;
                int var218 = class342.field5413.method989(125);
                if (var218 != 0) {
                    var217 = class342.field5413.method1005((byte) 122);
                    if (var217 == 255) {
                        var217 = class342.field5413.method1004(3);
                    }
                }
                if (var215 != null && var216 >= 0 && var216 < var215.field2983.length) {
                    var215.field2983[var216] = var218;
                    var215.field2989[var216] = var217;
                }
                class147.method1056((byte) 86, var216, var218 - 1, var214, var217);
            }
            if (var215 != null) {
                class52.method459(128, var215);
            }
            class73.method555((byte) -105);
            class182.field3162[class83.method613(31, class220.field3656++)] = class83.method613(32767, var214);
            class65.field1240 = -1;
            return true;
        } else if (class65.field1240 == 131) {
            int var72 = class342.field5413.method996(6107);
            int var73 = class342.field5413.method1054(2);
            int var74 = class342.field5413.method1005((byte) 122);
            if (class222.method1553(true, var73)) {
                if (var74 == 2) {
                    class234.method1627((byte) -78);
                }
                class88.field1566 = var72;
                class219.method1522(var72, 0);
                class316.method2278(false, 0);
                class92.method702(2000000, class88.field1566);
                for (int var75 = 0; var75 < 100; var75++) {
                    class213.field3524[var75] = true;
                }
            }
            class65.field1240 = -1;
            return true;
        } else if (class65.field1240 == 73) {
            if (class205.field3414 == 0) {
                class216.field3608 = class266.field4350;
            } else {
                class216.field3608 = class342.field5413.method1017((byte) -106);
            }
            class65.field1240 = -1;
            return true;
        } else if (class65.field1240 == 218) {
            class310.field5059 = class342.field5413.method1034(0);
            class97.field1772 = class342.field5413.method1007(-2);
            class65.field1240 = -1;
            return true;
        } else if (class65.field1240 == 231) {
            int var210 = class342.field5413.method996(6107);
            int var211 = class342.field5413.method989(105);
            String var212 = class342.field5413.method1017((byte) -121);
            if (class222.method1553(true, var210)) {
                class134.method942(var211, -109, var212);
            }
            class65.field1240 = -1;
            return true;
        } else {
            if (arg0 > -24) {
                field2272 = (byte[][]) ((byte[][]) null);
            }
            if (class65.field1240 == 140) {
                int var76 = class342.field5413.method989(122);
                int var77 = class342.field5413.method1011(-32768);
                int var78 = class342.field5413.method1004(3);
                if (class222.method1553(true, var77)) {
                    class291.method2068(-4825, var78, var76);
                }
                class65.field1240 = -1;
                return true;
            } else if (class65.field1240 == 61) {
                int var209 = class342.field5413.method989(118);
                if (class222.method1553(true, var209)) {
                    class269.method1876(false);
                }
                class65.field1240 = -1;
                return true;
            } else if (class65.field1240 == 226) {
                boolean var194 = class342.field5413.method1005((byte) 122) == 1;
                String var195 = class342.field5413.method1017((byte) -119);
                String var196 = var195;
                if (var194) {
                    var196 = class342.field5413.method1017((byte) -127);
                }
                boolean var197 = false;
                long var198 = class342.field5413.method991((byte) -91);
                long var200 = (long) class342.field5413.method989(113);
                long var202 = (long) class342.field5413.method1025((byte) -25);
                long var204 = (var200 << 32) + var202;
                int var206 = class342.field5413.method1005((byte) 122);
                int var207 = 0;
                while (true) {
                    if (var207 >= 100) {
                        if (var206 <= 1) {
                            if (!(!class153.field2612 || class345.field5452) || class312.field5088) {
                                var197 = true;
                            } else if (class110.method823(var196, -110)) {
                                var197 = true;
                            }
                        }
                        break;
                    }
                    if (class238.field3973[var207] == var204) {
                        var197 = true;
                        break;
                    }
                    var207++;
                }
                if (!var197 && class18.field495 == 0) {
                    class238.field3973[class53.field1058] = var204;
                    class53.field1058 = (class53.field1058 + 1) % 100;
                    String var208 = class84.method622(class298.method2136((byte) 123, class216.method1509(class342.field5413, -85)));
                    if (var206 == 2 || var206 == 3) {
                        class287.method2038(false, class82.method610(-23159, var198), var208, "<img=1>" + var196, -1, "<img=1>" + var195, 9, 0);
                    } else if (var206 == 1) {
                        class287.method2038(false, class82.method610(-23159, var198), var208, "<img=0>" + var196, -1, "<img=0>" + var195, 9, 0);
                    } else {
                        class287.method2038(false, class82.method610(-23159, var198), var208, var196, -1, var195, 9, 0);
                    }
                }
                class65.field1240 = -1;
                return true;
            } else if (class65.field1240 == 69) {
                int var79 = class342.field5413.method989(77);
                int var80 = class342.field5413.method1005((byte) 122);
                int var81 = class342.field5413.method1005((byte) 122);
                int var82 = class342.field5413.method989(71);
                int var83 = class342.field5413.method1005((byte) 122);
                int var84 = class342.field5413.method1005((byte) 122);
                if (class222.method1553(true, var79)) {
                    class287.method2027(var84, var81, var82, var80, (byte) 120, true, var83);
                }
                class65.field1240 = -1;
                return true;
            } else if (class65.field1240 == 216) {
                int var191 = class342.field5413.method1018(-1);
                int var192 = class342.field5413.method989(77);
                int var193 = class342.field5413.method1011(-32768);
                if (var193 == 65535) {
                    var193 = -1;
                }
                if (class222.method1553(true, var192)) {
                    class158.method1141(-1, -9590, var193, 1, var191);
                }
                class65.field1240 = -1;
                return true;
            } else if (class65.field1240 == 74) {
                int var85 = class342.field5413.method989(80);
                if (class222.method1553(true, var85)) {
                    class189.method1310(-1);
                }
                class65.field1240 = -1;
                return true;
            } else if (class65.field1240 == 82) {
                int var86 = class342.field5413.method1011(-32768);
                int var87 = class342.field5413.method1014(-114);
                if (class222.method1553(true, var86)) {
                    int var88 = 0;
                    if (class96.field1750.field1775 != null) {
                        var88 = class96.field1750.field1775.method1833(94);
                    }
                    class158.method1141(-1, -9590, var88, 3, var87);
                }
                class65.field1240 = -1;
                return true;
            } else if (class65.field1240 == 72) {
                int var188 = class342.field5413.method996(6107);
                byte var189 = class342.field5413.method1046((byte) 70);
                int var190 = class342.field5413.method996(6107);
                if (class222.method1553(true, var188)) {
                    class146.method1028(var190, true, var189);
                }
                class65.field1240 = -1;
                return true;
            } else if (class65.field1240 == 58) {
                int var89 = class342.field5413.method996(6107);
                int var90 = class342.field5413.method989(116);
                int var91 = class342.field5413.method1034(0);
                class314 var92 = class149.field2533[var89];
                if (var92 != null) {
                    class87.method666(var90, var91, (byte) 125, var92);
                }
                class65.field1240 = -1;
                return true;
            } else if (class65.field1240 == 209) {
                class125.field2203 = class342.field5413.method989(90) * 30;
                class65.field1240 = -1;
                class110.field2021 = class83.field1436;
                return true;
            } else if (class65.field1240 == 83) {
                class345.method2433((byte) 109);
                class65.field1240 = -1;
                return false;
            } else if (class65.field1240 == 105) {
                class293.method2081(-11542, true);
                class65.field1240 = -1;
                return true;
            } else if (class65.field1240 == 253) {
                int var93 = class342.field5413.method1018(-1);
                int var94 = class342.field5413.method1011(-32768);
                class207.method1433((byte) 46, var94, var93);
                class65.field1240 = -1;
                return true;
            } else if (class65.field1240 == 100) {
                class79.method598(class59.field1164, class205.field3414, (byte) 101, class342.field5413);
                class65.field1240 = -1;
                return true;
            } else if (class65.field1240 == 141) {
                for (int var186 = 0; var186 < class182.field3151.length; var186++) {
                    if (class182.field3151[var186] != null) {
                        class182.field3151[var186].field166 = -1;
                    }
                }
                for (int var187 = 0; var187 < class149.field2533.length; var187++) {
                    if (class149.field2533[var187] != null) {
                        class149.field2533[var187].field166 = -1;
                    }
                }
                class65.field1240 = -1;
                return true;
            } else if (class65.field1240 == 8) {
                boolean var95 = class342.field5413.method1005((byte) 122) == 1;
                String var96 = class342.field5413.method1017((byte) -114);
                String var97 = var96;
                if (var95) {
                    var97 = class342.field5413.method1017((byte) -110);
                }
                long var98 = class342.field5413.method991((byte) -52);
                long var100 = (long) class342.field5413.method989(104);
                boolean var102 = false;
                long var103 = (long) class342.field5413.method1025((byte) -126);
                long var105 = (var100 << 32) + var103;
                int var107 = class342.field5413.method1005((byte) 122);
                int var108 = class342.field5413.method989(120);
                int var109 = 0;
                while (true) {
                    if (var109 < 100) {
                        if (class238.field3973[var109] != var105) {
                            var109++;
                            continue;
                        }
                        var102 = true;
                        break;
                    }
                    if (var107 <= 1 && class110.method823(var97, -125)) {
                        var102 = true;
                    }
                    break;
                }
                if (!var102 && class18.field495 == 0) {
                    class238.field3973[class53.field1058] = var105;
                    class53.field1058 = (class53.field1058 + 1) % 100;
                    String var110 = class335.method2362(104, var108).method251((byte) 50, class342.field5413);
                    if (var107 == 2) {
                        class287.method2038(false, class82.method610(-23159, var98), var110, "<img=1>" + var97, var108, "<img=1>" + var96, 20, 0);
                    } else if (var107 == 1) {
                        class287.method2038(false, class82.method610(-23159, var98), var110, "<img=0>" + var97, var108, "<img=0>" + var96, 20, 0);
                    } else {
                        class287.method2038(false, class82.method610(-23159, var98), var110, var97, var108, var96, 20, 0);
                    }
                }
                class65.field1240 = -1;
                return true;
            } else if (class65.field1240 == 20) {
                class68.field1269 = class342.field5413.method1005((byte) 122);
                class136.field2334 = class342.field5413.method1005((byte) 122);
                class325.field5251 = class342.field5413.method1005((byte) 122);
                class65.field1240 = -1;
                return true;
            } else if (class65.field1240 == 255) {
                class189.method1314(true);
                class65.field1240 = -1;
                return true;
            } else if (class65.field1240 == 126) {
                int var111 = class342.field5413.method996(6107);
                int var112 = class342.field5413.method1011(-32768);
                int var113 = class342.field5413.method1024(11008);
                if (var112 == 65535) {
                    var112 = -1;
                }
                if (class222.method1553(true, var111)) {
                    class158.method1141(-1, -9590, var112, 2, var113);
                }
                class65.field1240 = -1;
                return true;
            } else if (class65.field1240 == 78) {
                int var180 = class342.field5413.method1020(true);
                String var181 = "";
                int var182 = class342.field5413.method1004(3);
                String var183 = var181;
                int var184 = class342.field5413.method1005((byte) 122);
                if ((var184 & 0x1) != 0) {
                    var181 = class342.field5413.method1017((byte) -128);
                    if ((var184 & 0x2) == 0) {
                        var183 = var181;
                    } else {
                        var183 = class342.field5413.method1017((byte) -109);
                    }
                }
                String var185 = class342.field5413.method1017((byte) -109);
                if (!var183.equals("") && class110.method823(var183, -107)) {
                    class65.field1240 = -1;
                    return true;
                } else {
                    class220.method1533(var185, var183, var182, var181, var180, 27293);
                    class65.field1240 = -1;
                    return true;
                }
            } else if (class65.field1240 == 142) {
                class317.field5171 = class342.field5413.method1005((byte) 122);
                for (int var114 = 0; var114 < class317.field5171; var114++) {
                    class306.field4974[var114] = class342.field5413.method1017((byte) -109);
                    class340.field5382[var114] = class342.field5413.method1017((byte) -123);
                    if (class340.field5382[var114].equals("")) {
                        class340.field5382[var114] = class306.field4974[var114];
                    }
                    class178.field2945[var114] = class342.field5413.method1017((byte) -105);
                    class295.field4821[var114] = class342.field5413.method1017((byte) -128);
                    if (class295.field4821[var114].equals("")) {
                        class295.field4821[var114] = class178.field2945[var114];
                    }
                    class76.field1369[var114] = false;
                }
                class65.field1240 = -1;
                class70.field1286 = class83.field1436;
                return true;
            } else if (class65.field1240 == 47) {
                String var178 = class342.field5413.method1017((byte) -106);
                String var179 = class84.method622(class298.method2136((byte) 108, class216.method1509(class342.field5413, -103)));
                class220.method1533(var179, var178, 0, var178, 6, 27293);
                class65.field1240 = -1;
                return true;
            } else if (class65.field1240 == 41) {
                int var115 = class342.field5413.method989(105);
                int var116 = class342.field5413.method1054(2);
                int var117 = class342.field5413.method1018(-1);
                int var118 = class342.field5413.method996(6107);
                if (var117 >> 30 != 0) {
                    int var143 = (var117 >> 14 & 0x3FFF) - class272.field4426;
                    int var144 = (var117 & 0x3FFF) - class21.field543;
                    int var145 = (var117 & 0x3716F555) >> 28;
                    if (var143 >= 0 && var144 >= 0 && var143 < 104 && var144 < 104) {
                        int var146 = var143 * 128 + 64;
                        int var147 = var144 * 128 + 64;
                        class176 var148 = new class176(var115, var145, var146, var147, class21.method189((byte) 83, var147, var146, var145) - var118, var116, class267.field4371);
                        class181.field3121.method437(new class90(var148), (byte) 51);
                    }
                } else if ((var117 >> 29) != 0) {
                    int var119 = var117 & 0xFFFF;
                    class314 var120 = class149.field2533[var119];
                    if (var120 != null) {
                        boolean var121 = true;
                        if (var115 == 65535) {
                            var115 = -1;
                        }
                        if (var115 != -1 && var120.field127 != -1) {
                            if (var120.field127 == var115) {
                                class198 var126 = class134.method944(1, var115);
                                if (var126.field3316 && var126.field3322 != -1) {
                                    class300 var127 = class258.method1807(var126.field3322, 73);
                                    int var128 = var127.field4872;
                                    if (var128 == 1) {
                                        var121 = false;
                                        var120.field153 = 0;
                                        var120.field147 = 0;
                                        var120.field132 = 0;
                                        var120.field209 = class267.field4371 + var116;
                                        var120.field204 = 1;
                                        class347.method2479(false, (byte) -55, var127, var120.field147, var120.field199, var120.field213);
                                    } else if (var128 == 2) {
                                        var121 = false;
                                        var120.field191 = 0;
                                    }
                                }
                            } else {
                                class198 var122 = class134.method944(1, var115);
                                class198 var123 = class134.method944(1, var120.field127);
                                if (var122.field3322 != -1 && var123.field3322 != -1) {
                                    class300 var124 = class258.method1807(var122.field3322, 92);
                                    class300 var125 = class258.method1807(var123.field3322, 122);
                                    if (var124.field4892 < var125.field4892) {
                                        var121 = false;
                                    }
                                }
                            }
                        }
                        if (var121) {
                            var120.field147 = 0;
                            var120.field127 = var115;
                            var120.field204 = 1;
                            var120.field209 = class267.field4371 + var116;
                            var120.field159 = var118;
                            var120.field153 = 0;
                            if (class267.field4371 < var120.field209) {
                                var120.field147 = -1;
                            }
                            if (var120.field127 != -1 && class267.field4371 == var120.field209) {
                                int var129 = class134.method944(1, var120.field127).field3322;
                                if (var129 != -1) {
                                    class300 var130 = class258.method1807(var129, 123);
                                    if (var130 != null && var130.field4885 != null) {
                                        class347.method2479(false, (byte) -86, var130, 0, var120.field199, var120.field213);
                                    }
                                }
                            }
                        }
                    }
                } else if ((var117 >> 28) != 0) {
                    int var131 = var117 & 0xFFFF;
                    class98 var132;
                    if (class96.field1752 == var131) {
                        var132 = class96.field1750;
                    } else {
                        var132 = class182.field3151[var131];
                    }
                    if (var132 != null) {
                        if (var115 == 65535) {
                            var115 = -1;
                        }
                        boolean var133 = true;
                        if (var115 != -1 && var132.field127 != -1) {
                            if (var132.field127 == var115) {
                                class198 var134 = class134.method944(1, var115);
                                if (var134.field3316 && var134.field3322 != -1) {
                                    class300 var135 = class258.method1807(var134.field3322, 118);
                                    int var136 = var135.field4872;
                                    if (var136 == 1) {
                                        var132.field153 = 0;
                                        var133 = false;
                                        var132.field209 = class267.field4371 + var116;
                                        var132.field147 = 0;
                                        var132.field204 = 1;
                                        var132.field132 = 0;
                                        class347.method2479(false, (byte) -48, var135, var132.field147, var132.field199, var132.field213);
                                    } else if (var136 == 2) {
                                        var132.field191 = 0;
                                        var133 = false;
                                    }
                                }
                            } else {
                                class198 var137 = class134.method944(1, var115);
                                class198 var138 = class134.method944(1, var132.field127);
                                if (var137.field3322 != -1 && var138.field3322 != -1) {
                                    class300 var139 = class258.method1807(var137.field3322, 82);
                                    class300 var140 = class258.method1807(var138.field3322, 115);
                                    if (var140.field4892 > var139.field4892) {
                                        var133 = false;
                                    }
                                }
                            }
                        }
                        if (var133) {
                            var132.field159 = var118;
                            var132.field153 = 0;
                            var132.field147 = 0;
                            var132.field204 = 1;
                            var132.field127 = var115;
                            var132.field209 = class267.field4371 + var116;
                            if (var132.field127 == 65535) {
                                var132.field127 = -1;
                            }
                            if (class267.field4371 < var132.field209) {
                                var132.field147 = -1;
                            }
                            if (var132.field127 != -1 && class267.field4371 == var132.field209) {
                                int var141 = class134.method944(1, var132.field127).field3322;
                                if (var141 != -1) {
                                    class300 var142 = class258.method1807(var141, 125);
                                    if (var142 != null && var142.field4885 != null) {
                                        class347.method2479(class96.field1750 == var132, (byte) -102, var142, 0, var132.field199, var132.field213);
                                    }
                                }
                            }
                        }
                    }
                }
                class65.field1240 = -1;
                return true;
            } else if (class65.field1240 == 38) {
                int var149 = class342.field5413.method989(75);
                int var150 = class342.field5413.method1034(0);
                if (var149 == 65535) {
                    var149 = -1;
                }
                class35.method259(var150, -60, var149);
                class65.field1240 = -1;
                return true;
            } else if (class65.field1240 == 241) {
                int var175 = class342.field5413.method1007(-2);
                int var176 = class342.field5413.method1055(26279);
                int var177 = class342.field5413.method1054(2);
                if (var177 == 65535) {
                    var177 = -1;
                }
                class160.method1148(var176, -81, var175, var177);
                class65.field1240 = -1;
                return true;
            } else if (class65.field1240 == 15) {
                class240.field3987 = class83.field1436;
                if (class205.field3414 == 0) {
                    class85.field1473 = null;
                    class293.field4739 = 0;
                    class34.field763 = null;
                    class37.field811 = null;
                    class65.field1240 = -1;
                    return true;
                }
                class34.field763 = class342.field5413.method1017((byte) -125);
                boolean var163 = class342.field5413.method1005((byte) 122) == 1;
                if (var163) {
                    class342.field5413.method1017((byte) -111);
                }
                long var164 = class342.field5413.method991((byte) -101);
                class37.field811 = class41.method316(var164, 30274);
                class244.field4054 = class342.field5413.method1029(-2);
                int var166 = class342.field5413.method1005((byte) 122);
                if (var166 == 255) {
                    class65.field1240 = -1;
                    return true;
                }
                class293.field4739 = var166;
                class281[] var167 = new class281[100];
                for (int var168 = 0; var168 < class293.field4739; var168++) {
                    var167[var168] = new class281();
                    var167[var168].field4603 = class342.field5413.method1017((byte) -115);
                    boolean var169 = class342.field5413.method1005((byte) 122) == 1;
                    if (var169) {
                        var167[var168].field4605 = class342.field5413.method1017((byte) -127);
                    } else {
                        var167[var168].field4605 = var167[var168].field4603;
                    }
                    var167[var168].field4602 = class342.field5413.method989(89);
                    var167[var168].field4598 = class342.field5413.method1029(-2);
                    var167[var168].field4599 = class342.field5413.method1017((byte) -116);
                    if (var167[var168].field4605.equals(class96.field1750.field1779)) {
                        class127.field2212 = var167[var168].field4598;
                    }
                }
                boolean var170 = false;
                int var171 = class293.field4739;
                while (var171 > 0) {
                    var171--;
                    boolean var172 = true;
                    for (int var173 = 0; var173 < var171; var173++) {
                        if (var167[var173].field4603.compareTo(var167[var173 + 1].field4603) > 0) {
                            class281 var174 = var167[var173];
                            var172 = false;
                            var167[var173] = var167[var173 + 1];
                            var167[var173 + 1] = var174;
                        }
                    }
                    if (var172) {
                        break;
                    }
                }
                class85.field1473 = var167;
                class65.field1240 = -1;
                return true;
            } else if (class65.field1240 == 129) {
                if (class202.field3384 != null) {
                    class145.method986(class135.field2318, -1, -1, false, false);
                }
                byte[] var161 = new byte[class205.field3414];
                class342.field5413.method292(var161, class205.field3414, (byte) -100, 0);
                String var162 = class199.method1362(0, class205.field3414, var161, 2);
                if (class274.field4469 == null && class157.field2662 == 3 || !class157.field2661.startsWith("win") || class346.field5529) {
                    class352.method2508(var162, 1190717, true);
                } else {
                    class83.field1439 = true;
                    class331.field5293 = var162;
                    class234.field3830 = class59.field1164.method1129(var162, 50);
                }
                class65.field1240 = -1;
                return true;
            } else if (class65.field1240 == 33) {
                int var151 = class342.field5413.method989(73);
                int var152 = class342.field5413.method989(78);
                int var153 = class342.field5413.method1054(2);
                if (class222.method1553(true, var152)) {
                    class250.method1761(var151, 1280, var153);
                }
                class65.field1240 = -1;
                return true;
            } else if (class65.field1240 == 194) {
                int var154 = class342.field5413.method1004(3);
                int var155 = class342.field5413.method1054(2);
                int var156 = class342.field5413.method1011(-32768);
                if (var156 == 65535) {
                    var156 = -1;
                }
                int var157 = class342.field5413.method1004(3);
                if (class222.method1553(true, var155)) {
                    class181 var158 = class224.method1564(-120, var157);
                    if (var158.field3058) {
                        class114.method840(104, var156, var157, var154);
                        class11 var160 = class296.method2124(0, var156);
                        class88.method672(var160.field360, var160.field306, 53, var160.field332, var157);
                        class137.method957(2088751436, var160.field341, var160.field345, var157, var160.field329);
                    } else if (var156 == -1) {
                        var158.field3118 = 0;
                        class65.field1240 = -1;
                        return true;
                    } else {
                        class11 var159 = class296.method2124(0, var156);
                        var158.field3114 = var159.field360 * 100 / var154;
                        var158.field3000 = var159.field332;
                        var158.field3002 = var156;
                        var158.field3118 = 4;
                        var158.field3130 = var159.field306;
                        class52.method459(128, var158);
                    }
                }
                class65.field1240 = -1;
                return true;
            } else {
                class348.method2493(-26700, (Throwable) null, "T1 - " + class65.field1240 + "," + class359.field5721 + "," + class155.field2629 + " - " + class205.field3414);
                class345.method2433((byte) -12);
                return true;
            }
        }
    }
}
