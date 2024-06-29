import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class197 {

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "[I")
    public static int[] field3127 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "[I")
    public static int[] field3126 = new int[1000];

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
    public static int field3128 = 3353893;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "I")
    public static int field3125;

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Z)Z", line = 5)
    public static final boolean method1434(boolean arg0) throws IOException {
        field3125++;
        if (class127.field2032 == null) {
            return false;
        }
        int var1 = class127.field2032.method137((byte) 88);
        if (var1 == 0) {
            return false;
        }
        if (class51.field813 == -1) {
            var1--;
            class127.field2032.method139(class267.field4132.field1661, -3, 1, 0);
            class267.field4132.field1667 = 0;
            class51.field813 = class267.field4132.method241(255);
            class45.field779 = class298.field4707[class51.field813];
        }
        if (class45.field779 == -1) {
            if (var1 <= 0) {
                return false;
            }
            var1--;
            class127.field2032.method139(class267.field4132.field1661, -3, 1, 0);
            class45.field779 = class267.field4132.field1661[0] & 0xFF;
        }
        if (class45.field779 == -2) {
            if (var1 <= 1) {
                return false;
            }
            class127.field2032.method139(class267.field4132.field1661, -3, 2, 0);
            class267.field4132.field1667 = 0;
            class45.field779 = class267.field4132.method731(false);
            var1 -= 2;
        }
        if (var1 < class45.field779) {
            return false;
        }
        class267.field4132.field1667 = 0;
        class127.field2032.method139(class267.field4132.field1661, -3, class45.field779, 0);
        class26.field435 = 0;
        class312.field4897 = class243.field3760;
        class243.field3760 = class68.field1089;
        class68.field1089 = class51.field813;
        if (class51.field813 == 22) {
            int var371 = class267.field4132.method782(false);
            String var372 = class267.field4132.method749((byte) -111);
            int var373 = class267.field4132.method782(false);
            if (class145.method1100(true, var373)) {
                class121.method924(var371, (byte) -118, var372);
            }
            class51.field813 = -1;
            return true;
        } else if (class51.field813 == 251) {
            int var368 = class267.field4132.method756((byte) 84);
            class292 var369 = class215.method1555((byte) -48, var368);
            for (int var370 = 0; var370 < var369.field4439.length; var370++) {
                var369.field4439[var370] = -1;
                var369.field4439[var370] = 0;
            }
            class143.method1091(var369, (byte) 62);
            class51.field813 = -1;
            return true;
        } else if (class51.field813 == 59) {
            class36.method298(144);
            class33.field553 = class267.field4132.method741(47);
            class200.field3149 = class200.field3157;
            class51.field813 = -1;
            return true;
        } else if (class51.field813 == 135) {
            String var2 = class267.field4132.method749((byte) -121);
            int var3 = class267.field4132.method746(-13551);
            int var4 = class267.field4132.method766(true);
            if (var4 == 65535) {
                var4 = -1;
            }
            int var5 = class267.field4132.method759(4087);
            if (var5 >= 1 && var5 <= 8) {
                if (var2.equalsIgnoreCase("null")) {
                    var2 = null;
                }
                class222.field3566[var5 - 1] = var2;
                class327.field5066[var5 - 1] = var4;
                class207.field3274[var5 - 1] = var3 == 0;
            }
            class51.field813 = -1;
            return true;
        } else if (class51.field813 == 212) {
            class85.field1274 = class267.field4132.method741(99);
            class51.field813 = -1;
            class169.field2625 = class200.field3157;
            return true;
        } else if (class51.field813 == 13) {
            int var6 = class267.field4132.method731(arg0);
            int var7 = class267.field4132.method741(127);
            int var8 = class267.field4132.method741(35);
            int var9 = class267.field4132.method731(false);
            int var10 = class267.field4132.method741(14);
            int var11 = class267.field4132.method741(58);
            if (class145.method1100(true, var6)) {
                class61.method445(var8, var11, true, var10, var7, -64, var9);
            }
            class51.field813 = -1;
            return true;
        } else if (class51.field813 == 128) {
            int var12 = class267.field4132.method731(arg0);
            String var13 = class267.field4132.method749((byte) -84);
            Object[] var14 = new Object[var13.length() + 1];
            for (int var15 = var13.length() - 1; var15 >= 0; var15--) {
                if (var13.charAt(var15) == 's') {
                    var14[var15 + 1] = class267.field4132.method749((byte) -90);
                } else {
                    var14[var15 + 1] = Integer.valueOf(class267.field4132.method775(105));
                }
            }
            var14[0] = Integer.valueOf(class267.field4132.method775(82));
            if (class145.method1100(!arg0, var12)) {
                class88 var16 = new class88();
                var16.field1340 = var14;
                class228.method1656(var16, (byte) -37);
            }
            class51.field813 = -1;
            return true;
        } else if (class51.field813 == 185) {
            long var17 = class267.field4132.method723(21649);
            int var19 = class267.field4132.method731(arg0);
            String var20 = class326.method2238(1, var19).method1585(class267.field4132, 3813);
            class107.method818((byte) -26, (String) null, class259.method1835((byte) 127, var17), var20, 19, var19);
            class51.field813 = -1;
            return true;
        } else if (class51.field813 == 144) {
            int var21 = class267.field4132.method731(false);
            int var22 = class267.field4132.method782(false);
            int var23 = class267.field4132.method769(-128);
            class305 var24 = class138.field2196[var22];
            if (var24 != null) {
                class212.method1538(false, var24, var21, var23);
            }
            class51.field813 = -1;
            return true;
        } else if (class51.field813 == 94) {
            int var25 = class267.field4132.method756((byte) 84);
            class178.field2790 = class83.field1235.method2217(79, var25);
            class51.field813 = -1;
            return true;
        } else if (class51.field813 == 164) {
            String var327 = class267.field4132.method749((byte) -75);
            if (var327.endsWith(":tradereq:")) {
                boolean var328 = false;
                String var329 = var327.substring(0, var327.indexOf(":"));
                long var330 = class36.method281(37, var329);
                for (int var332 = 0; var332 < class169.field2631; var332++) {
                    if (class298.field4712[var332] == var330) {
                        var328 = true;
                        break;
                    }
                }
                if (!var328 && class64.field1013 == 0) {
                    class252.method1782(class60.field942, 4, var329, arg0);
                }
            } else if (var327.endsWith(":chalreq:")) {
                String var333 = var327.substring(0, var327.indexOf(":"));
                boolean var334 = false;
                long var335 = class36.method281(107, var333);
                for (int var337 = 0; var337 < class169.field2631; var337++) {
                    if (class298.field4712[var337] == var335) {
                        var334 = true;
                        break;
                    }
                }
                if (!var334 && class64.field1013 == 0) {
                    String var338 = var327.substring(var327.indexOf(":") + 1, var327.length() - 9);
                    class252.method1782(var338, 8, var333, arg0);
                }
            } else if (var327.endsWith(":assistreq:")) {
                String var339 = var327.substring(0, var327.indexOf(":"));
                long var340 = class36.method281(124, var339);
                boolean var342 = false;
                for (int var343 = 0; var343 < class169.field2631; var343++) {
                    if (class298.field4712[var343] == var340) {
                        var342 = true;
                        break;
                    }
                }
                if (!var342 && class64.field1013 == 0) {
                    class252.method1782("", 10, var339, arg0);
                }
            } else if (var327.endsWith(":clan:")) {
                String var367 = var327.substring(0, var327.indexOf(":clan:"));
                class252.method1782(var367, 11, "", false);
            } else if (var327.endsWith(":trade:")) {
                String var366 = var327.substring(0, var327.indexOf(":trade:"));
                if (class64.field1013 == 0) {
                    class252.method1782(var366, 12, "", false);
                }
            } else if (var327.endsWith(":assist:")) {
                String var365 = var327.substring(0, var327.indexOf(":assist:"));
                if (class64.field1013 == 0) {
                    class252.method1782(var365, 13, "", false);
                }
            } else if (var327.endsWith(":duelstake:")) {
                boolean var344 = false;
                String var345 = var327.substring(0, var327.indexOf(":"));
                long var346 = class36.method281(46, var345);
                for (int var348 = 0; var348 < class169.field2631; var348++) {
                    if (class298.field4712[var348] == var346) {
                        var344 = true;
                        break;
                    }
                }
                if (!var344 && class64.field1013 == 0) {
                    class252.method1782("", 14, var345, false);
                }
            } else if (var327.endsWith(":duelfriend:")) {
                String var349 = var327.substring(0, var327.indexOf(":"));
                long var350 = class36.method281(63, var349);
                boolean var352 = false;
                for (int var353 = 0; var353 < class169.field2631; var353++) {
                    if (class298.field4712[var353] == var350) {
                        var352 = true;
                        break;
                    }
                }
                if (!var352 && class64.field1013 == 0) {
                    class252.method1782("", 15, var349, false);
                }
            } else if (var327.endsWith(":clanreq:")) {
                String var360 = var327.substring(0, var327.indexOf(":"));
                long var361 = class36.method281(53, var360);
                boolean var363 = false;
                for (int var364 = 0; var364 < class169.field2631; var364++) {
                    if (class298.field4712[var364] == var361) {
                        var363 = true;
                        break;
                    }
                }
                if (!var363 && class64.field1013 == 0) {
                    class252.method1782("", 16, var360, false);
                }
            } else if (var327.endsWith(":allyreq:")) {
                String var354 = var327.substring(0, var327.indexOf(":"));
                long var355 = class36.method281(89, var354);
                boolean var357 = false;
                for (int var358 = 0; var358 < class169.field2631; var358++) {
                    if (class298.field4712[var358] == var355) {
                        var357 = true;
                        break;
                    }
                }
                if (!var357 && class64.field1013 == 0) {
                    String var359 = var327.substring(var327.indexOf(":") + 1, var327.length() - 9);
                    class252.method1782(var359, 21, var354, arg0);
                }
            } else {
                class252.method1782(var327, 0, "", false);
            }
            class51.field813 = -1;
            return true;
        } else if (class51.field813 == 151) {
            class36.method298(144);
            class9.field136 = class267.field4132.method780(-17432);
            class200.field3149 = class200.field3157;
            class51.field813 = -1;
            return true;
        } else if (class51.field813 == 226) {
            class189.method1409(0, true);
            class51.field813 = -1;
            return true;
        } else if (class51.field813 == 43) {
            int var307 = class267.field4132.method724(-1);
            int var308 = class267.field4132.method731(false);
            int var309 = class267.field4132.method767(-10453);
            int var310 = class267.field4132.method724(-1);
            if ((var309 >> 30) != 0) {
                int var311 = (var309 & 0x376F7CF5) >> 28;
                int var312 = (var309 >> 14 & 0x3FFF) - class177.field2780;
                int var313 = (var309 & 0x3FFF) - class91.field1485;
                if (var312 >= 0 && var313 >= 0 && var312 < 104 && var313 < 104) {
                    int var314 = var313 * 128 + 64;
                    int var315 = var312 * 128 + 64;
                    class85 var316 = new class85(var307, var311, var315, var314, class48.method374(var314, var315, 118, var311) - var308, var310, class205.field3252);
                    class289.field4411.method1493(-124, new class162(var316));
                }
            } else if (var309 >> 29 != 0) {
                int var322 = var309 & 0xFFFF;
                class305 var323 = class138.field2196[var322];
                if (var323 != null) {
                    if (var307 == 65535) {
                        var307 = -1;
                    }
                    boolean var324 = true;
                    if (var307 != -1 && var323.field1417 != -1 && class6.method28(class136.method1042((byte) 0, var307).field1477, 2).field4187 < class6.method28(class136.method1042((byte) 18, var323.field1417).field1477, 2).field4187) {
                        var324 = false;
                    }
                    if (var324) {
                        var323.field1449 = 0;
                        var323.field1461 = class205.field3252 + var310;
                        var323.field1440 = 0;
                        var323.field1417 = var307;
                        var323.field1370 = 1;
                        if (class205.field3252 < var323.field1461) {
                            var323.field1449 = -1;
                        }
                        var323.field1446 = var308;
                        if (var323.field1417 != -1 && class205.field3252 == var323.field1461) {
                            int var325 = class136.method1042((byte) 3, var323.field1417).field1477;
                            if (var325 != -1) {
                                class269 var326 = class6.method28(var325, 2);
                                if (var326 != null && var326.field4183 != null) {
                                    class89.method632(var326, var323.field1442, (byte) 98, var323.field1369, false, 0);
                                }
                            }
                        }
                    }
                }
            } else if (var309 >> 28 != 0) {
                int var317 = var309 & 0xFFFF;
                class30 var318;
                if (class60.field943 == var317) {
                    var318 = class19.field356;
                } else {
                    var318 = class82.field1228[var317];
                }
                if (var318 != null) {
                    if (var307 == 65535) {
                        var307 = -1;
                    }
                    boolean var319 = true;
                    if (var307 != -1 && var318.field1417 != -1 && class6.method28(class136.method1042((byte) 122, var307).field1477, 2).field4187 < class6.method28(class136.method1042((byte) -84, var318.field1417).field1477, 2).field4187) {
                        var319 = false;
                    }
                    if (var319) {
                        var318.field1446 = var308;
                        var318.field1417 = var307;
                        var318.field1449 = 0;
                        if (var318.field1417 == 65535) {
                            var318.field1417 = -1;
                        }
                        var318.field1440 = 0;
                        var318.field1370 = 1;
                        var318.field1461 = class205.field3252 + var310;
                        if (class205.field3252 < var318.field1461) {
                            var318.field1449 = -1;
                        }
                        if (var318.field1417 != -1 && class205.field3252 == var318.field1461) {
                            int var320 = class136.method1042((byte) -58, var318.field1417).field1477;
                            if (var320 != -1) {
                                class269 var321 = class6.method28(var320, 2);
                                if (var321 != null && var321.field4183 != null) {
                                    class89.method632(var321, var318.field1442, (byte) 117, var318.field1369, class19.field356 == var318, 0);
                                }
                            }
                        }
                    }
                }
            }
            class51.field813 = -1;
            return true;
        } else if (class51.field813 == 58) {
            int var303 = class267.field4132.method782(false);
            int var304 = class267.field4132.method758(-253);
            int var305 = class267.field4132.method762(-120);
            int var306 = class267.field4132.method733(true);
            if (class145.method1100(true, var303)) {
                class242.method1718((byte) 107, var304, var305, var306);
            }
            class51.field813 = -1;
            return true;
        } else if (class51.field813 == 15) {
            int var298 = class267.field4132.method759(4087);
            int var299 = class267.field4132.method756((byte) 84);
            int var300 = class267.field4132.method766(true);
            int var301 = class267.field4132.method724(-1);
            if (class145.method1100(true, var301)) {
                class224 var302 = (class224) class268.field4148.method833(false, (long) var299);
                if (var302 != null) {
                    class259.method1840(var302, var302.field3596 != var300, -128);
                }
                class249.method1769(0, var299, var300, var298);
            }
            class51.field813 = -1;
            return true;
        } else if (class51.field813 == 228) {
            class140.method1070(true);
            class36.method298(144);
            class51.field813 = -1;
            class208.field3330 += 32;
            return true;
        } else if (class51.field813 == 86) {
            int var295 = class267.field4132.method775(105);
            int var296 = class267.field4132.method782(false);
            int var297 = class267.field4132.method731(false);
            if (class145.method1100(true, var296)) {
                class63.method453((byte) 126, var297, var295);
            }
            class51.field813 = -1;
            return true;
        } else if (class51.field813 == 233) {
            if (class122.field1950 != -1) {
                class108.method824(0, (byte) -89, class122.field1950);
            }
            class51.field813 = -1;
            return true;
        } else if (class51.field813 == 3) {
            long var276 = class267.field4132.method723(21649);
            boolean var278 = true;
            String var279 = "";
            int var280 = class267.field4132.method731(arg0);
            if (var276 < 0L) {
                var278 = false;
                var276 &= Long.MAX_VALUE;
            }
            int var281 = class267.field4132.method741(70);
            if (var280 > 0) {
                var279 = class267.field4132.method749((byte) -65);
            }
            String var282 = class259.method1835((byte) 126, var276);
            for (int var283 = 0; var283 < class319.field4971; var283++) {
                if (class110.field1824[var283] == var276) {
                    if (class204.field3246[var283] != var280) {
                        class204.field3246[var283] = var280;
                        if (var280 > 0) {
                            class252.method1782(var282 + class41.field731, 5, "", false);
                        }
                        if (var280 == 0) {
                            class252.method1782(var282 + class45.field780, 5, "", arg0);
                        }
                    }
                    var282 = null;
                    class70.field1102[var283] = var279;
                    class274.field4265[var283] = var281;
                    class28.field461[var283] = var278;
                    break;
                }
            }
            boolean var284 = false;
            if (var282 != null && class319.field4971 < 200) {
                class110.field1824[class319.field4971] = var276;
                class329.field5082[class319.field4971] = var282;
                class204.field3246[class319.field4971] = var280;
                class70.field1102[class319.field4971] = var279;
                class274.field4265[class319.field4971] = var281;
                class28.field461[class319.field4971] = var278;
                class319.field4971++;
            }
            int var285 = class319.field4971;
            class169.field2625 = class200.field3157;
            while (var285 > 0) {
                var285--;
                boolean var286 = true;
                for (int var287 = 0; var287 < var285; var287++) {
                    if (class204.field3246[var287] != class193.field3072 && class204.field3246[var287 + 1] == class193.field3072 || class204.field3246[var287] == 0 && class204.field3246[var287 + 1] != 0) {
                        var286 = false;
                        int var288 = class204.field3246[var287];
                        class204.field3246[var287] = class204.field3246[var287 + 1];
                        class204.field3246[var287 + 1] = var288;
                        String var289 = class70.field1102[var287];
                        class70.field1102[var287] = class70.field1102[var287 + 1];
                        class70.field1102[var287 + 1] = var289;
                        String var290 = class329.field5082[var287];
                        class329.field5082[var287] = class329.field5082[var287 + 1];
                        class329.field5082[var287 + 1] = var290;
                        long var291 = class110.field1824[var287];
                        class110.field1824[var287] = class110.field1824[var287 + 1];
                        class110.field1824[var287 + 1] = var291;
                        int var293 = class274.field4265[var287];
                        class274.field4265[var287] = class274.field4265[var287 + 1];
                        class274.field4265[var287 + 1] = var293;
                        boolean var294 = class28.field461[var287];
                        class28.field461[var287] = class28.field461[var287 + 1];
                        class28.field461[var287 + 1] = var294;
                    }
                }
                if (var286) {
                    break;
                }
            }
            class51.field813 = -1;
            return true;
        } else if (class51.field813 == 205) {
            class36.method298(144);
            int var272 = class267.field4132.method769(-128);
            int var273 = class267.field4132.method775(95);
            int var274 = class267.field4132.method741(111);
            class252.field3883[var274] = var273;
            class31.field526[var274] = var272;
            class260.field4035[var274] = 1;
            for (int var275 = 0; var275 < 98; var275++) {
                if (class48.field795[var275] <= var273) {
                    class260.field4035[var274] = var275 + 2;
                }
            }
            class289.field4405[class280.method2001(31, class230.field3654++)] = var274;
            class51.field813 = -1;
            return true;
        } else if (class51.field813 == 72) {
            int var271 = class267.field4132.method766(true);
            class115.method866(var271, -1);
            class190.field3040[class280.method2001(31, class323.field5023++)] = class280.method2001(32767, var271);
            class51.field813 = -1;
            return true;
        } else {
            if (arg0) {
                method1436(-76);
            }
            if (class51.field813 == 175) {
                int var26 = class267.field4132.method724(-1);
                int var27 = class267.field4132.method769(-128);
                if (class145.method1100(!arg0, var26)) {
                    class282.field4359 = var27;
                }
                class51.field813 = -1;
                return true;
            } else if (class51.field813 == 255) {
                int var268 = class267.field4132.method756((byte) 84);
                String var269 = class267.field4132.method749((byte) -102);
                int var270 = class267.field4132.method766(true);
                if (class145.method1100(true, var270)) {
                    class188.method1403(var269, var268, false);
                }
                class51.field813 = -1;
                return true;
            } else if (class51.field813 == 221) {
                int var28 = class267.field4132.method731(arg0);
                if (var28 == 65535) {
                    var28 = -1;
                }
                int var29 = class267.field4132.method741(91);
                int var30 = class267.field4132.method731(arg0);
                class151.method1158(var28, var29, arg0, var30);
                class51.field813 = -1;
                return true;
            } else if (class51.field813 == 216) {
                class298.method2081(class267.field4132.method749((byte) -106), 116);
                class51.field813 = -1;
                return true;
            } else if (class51.field813 == 225) {
                long var31 = class267.field4132.method723(21649);
                long var33 = (long) class267.field4132.method731(false);
                long var35 = (long) class267.field4132.method776(-1574267376);
                int var37 = class267.field4132.method741(67);
                int var38 = class267.field4132.method731(false);
                long var39 = (var33 << 32) + var35;
                boolean var41 = false;
                int var42 = 0;
                label1272: while (true) {
                    if (var42 < 100) {
                        if (class264.field4093[var42] != var39) {
                            var42++;
                            continue;
                        }
                        var41 = true;
                        break;
                    }
                    if (var37 <= 1) {
                        for (int var43 = 0; var43 < class169.field2631; var43++) {
                            if (class298.field4712[var43] == var31) {
                                var41 = true;
                                break label1272;
                            }
                        }
                    }
                    break;
                }
                if (!var41 && class64.field1013 == 0) {
                    class264.field4093[class256.field3963] = var39;
                    class256.field3963 = (class256.field3963 + 1) % 100;
                    String var44 = class326.method2238(1, var38).method1585(class267.field4132, 3813);
                    if (var37 == 2) {
                        class107.method818((byte) -26, (String) null, "<img=1>" + class259.method1835((byte) 127, var31), var44, 18, var38);
                    } else if (var37 == 1) {
                        class107.method818((byte) -26, (String) null, "<img=0>" + class259.method1835((byte) 127, var31), var44, 18, var38);
                    } else {
                        class107.method818((byte) -26, (String) null, class259.method1835((byte) 126, var31), var44, 18, var38);
                    }
                }
                class51.field813 = -1;
                return true;
            } else if (class51.field813 == 65) {
                if (class45.field779 == 0) {
                    class308.field4855 = class43.field758;
                } else {
                    class308.field4855 = class267.field4132.method749((byte) -126);
                }
                class51.field813 = -1;
                return true;
            } else if (class51.field813 == 218) {
                for (int var267 = 0; var267 < class278.field4304.length; var267++) {
                    if (class278.field4304[var267] != class118.field1907[var267]) {
                        class278.field4304[var267] = class118.field1907[var267];
                        class141.method1076(var267, 5);
                        class101.field1699[class280.method2001(class208.field3330++, 31)] = var267;
                    }
                }
                class51.field813 = -1;
                return true;
            } else if (class51.field813 == 56) {
                class310.field4884 = class267.field4132.method759(4087);
                class180.field2884 = class267.field4132.method769(-128);
                class51.field813 = -1;
                return true;
            } else if (class51.field813 == 217 || class51.field813 == 2 || class51.field813 == 156 || class51.field813 == 142 || class51.field813 == 230 || class51.field813 == 254 || class51.field813 == 134 || class51.field813 == 98 || class51.field813 == 120 || class51.field813 == 75 || class51.field813 == 40 || class51.field813 == 109 || class51.field813 == 211) {
                class86.method620((byte) -14);
                class51.field813 = -1;
                return true;
            } else if (class51.field813 == 174) {
                int var45 = class267.field4132.method769(-128);
                int var46 = class267.field4132.method759(4087);
                int var47 = class267.field4132.method746(-13551);
                class41.field734 = var46 >> 1;
                class19.field356.method209(var45, 128, (var46 & 0x1) == 1, var47);
                class51.field813 = -1;
                return true;
            } else if (class51.field813 == 129) {
                if (class52.field823 != null) {
                    class240.method1705(-1, class54.field860, -1, false, -1);
                }
                byte[] var48 = new byte[class45.field779];
                class267.field4132.method247((byte) -119, class45.field779, 0, var48);
                String var49 = class230.method1663(var48, 0, class45.field779, 128);
                if (class81.field1219 == null && class325.field5048 == 3 || !class325.field5042.startsWith("win") || class273.field4243) {
                    class295.method2071((byte) 90, var49, true);
                } else {
                    class95.field1571 = var49;
                    class183.field2929 = true;
                    class48.field800 = class83.field1235.method2218(var49, false);
                }
                class51.field813 = -1;
                return true;
            } else if (class51.field813 == 239) {
                int var261 = class267.field4132.method775(123);
                int var262 = class267.field4132.method731(false);
                class292 var263;
                if (var261 >= 0) {
                    var263 = class215.method1555((byte) -48, var261);
                } else {
                    var263 = null;
                }
                if (var261 < -70000) {
                    var262 += 32768;
                }
                while (class45.field779 > class267.field4132.field1667) {
                    int var264 = 0;
                    int var265 = class267.field4132.method738(-957401312);
                    int var266 = class267.field4132.method731(false);
                    if (var266 != 0) {
                        var264 = class267.field4132.method741(113);
                        if (var264 == 255) {
                            var264 = class267.field4132.method775(-112);
                        }
                    }
                    if (var263 != null && var265 >= 0 && var263.field4439.length > var265) {
                        var263.field4439[var265] = var266;
                        var263.field4480[var265] = var264;
                    }
                    class252.method1777(-1, var262, var264, var266 - 1, var265);
                }
                if (var263 != null) {
                    class143.method1091(var263, (byte) 42);
                }
                class36.method298(144);
                class190.field3040[class280.method2001(class323.field5023++, 31)] = class280.method2001(var262, 32767);
                class51.field813 = -1;
                return true;
            } else if (class51.field813 == 176) {
                boolean var50 = false;
                long var51 = class267.field4132.method723(21649);
                if ((var51 & Long.MIN_VALUE) != 0L) {
                    var50 = true;
                }
                int var53 = class267.field4132.method731(false);
                byte var54 = class267.field4132.method727((byte) 125);
                if (var50) {
                    if (class12.field237 == 0) {
                        class51.field813 = -1;
                        return true;
                    }
                    long var55 = var51 & Long.MAX_VALUE;
                    boolean var57 = false;
                    int var58;
                    for (var58 = 0; var58 < class12.field237 && (class245.field3789[var58].field3734 != var55 || class245.field3789[var58].field1142 != var53); var58++) {
                    }
                    if (class12.field237 > var58) {
                        while (var58 < (class12.field237 - 1)) {
                            class245.field3789[var58] = class245.field3789[var58 + 1];
                            var58++;
                        }
                        class12.field237--;
                        class245.field3789[class12.field237] = null;
                    }
                } else {
                    String var59 = class267.field4132.method749((byte) -96);
                    class74 var60 = new class74();
                    var60.field3734 = var51;
                    var60.field1138 = class74.method555((byte) -95, var60.field3734);
                    var60.field1145 = var54;
                    var60.field1141 = var59;
                    var60.field1142 = var53;
                    int var61;
                    for (var61 = class12.field237 - 1; var61 >= 0; var61--) {
                        int var62 = class245.field3789[var61].field1138.compareTo(var60.field1138);
                        if (var62 == 0) {
                            class245.field3789[var61].field1142 = var53;
                            class245.field3789[var61].field1145 = var54;
                            class245.field3789[var61].field1141 = var59;
                            class292.field4543 = class200.field3157;
                            class51.field813 = -1;
                            if (class6.field75 == var51) {
                                class239.field3726 = var54;
                            }
                            return true;
                        }
                        if (var62 < 0) {
                            break;
                        }
                    }
                    if (class245.field3789.length <= class12.field237) {
                        class51.field813 = -1;
                        return true;
                    }
                    for (int var63 = class12.field237 - 1; var63 > var61; var63--) {
                        class245.field3789[var63 + 1] = class245.field3789[var63];
                    }
                    if (class12.field237 == 0) {
                        class245.field3789 = new class74[100];
                    }
                    class245.field3789[var61 + 1] = var60;
                    if (class6.field75 == var51) {
                        class239.field3726 = var54;
                    }
                    class12.field237++;
                }
                class292.field4543 = class200.field3157;
                class51.field813 = -1;
                return true;
            } else if (class51.field813 == 130) {
                int var253 = class267.field4132.method775(89);
                int var254 = class267.field4132.method731(arg0);
                if (var253 < -70000) {
                    var254 += 32768;
                }
                class292 var255;
                if (var253 >= 0) {
                    var255 = class215.method1555((byte) -48, var253);
                } else {
                    var255 = null;
                }
                if (var255 != null) {
                    for (int var256 = 0; var256 < var255.field4439.length; var256++) {
                        var255.field4439[var256] = 0;
                        var255.field4480[var256] = 0;
                    }
                }
                class134.method1007(var254, true);
                int var257 = class267.field4132.method731(arg0);
                for (int var258 = 0; var258 < var257; var258++) {
                    int var259 = class267.field4132.method782(arg0);
                    int var260 = class267.field4132.method746(-13551);
                    if (var260 == 255) {
                        var260 = class267.field4132.method762(-117);
                    }
                    if (var255 != null && var255.field4439.length > var258) {
                        var255.field4439[var258] = var259;
                        var255.field4480[var258] = var260;
                    }
                    class252.method1777(-1, var254, var260, var259 - 1, var258);
                }
                if (var255 != null) {
                    class143.method1091(var255, (byte) 75);
                }
                class36.method298(144);
                class190.field3040[class280.method2001(31, class323.field5023++)] = class280.method2001(32767, var254);
                class51.field813 = -1;
                return true;
            } else if (class51.field813 == 242) {
                int var252 = class267.field4132.method731(false);
                if (class145.method1100(true, var252)) {
                    class103.method789(125);
                }
                class51.field813 = -1;
                return true;
            } else if (class51.field813 == 14) {
                long var64 = class267.field4132.method723(21649);
                String var66 = class135.method1028(class16.method132((byte) 119, class289.method2032(class267.field4132, 1)));
                class252.method1782(var66, 6, class259.method1835((byte) 127, var64), arg0);
                class51.field813 = -1;
                return true;
            } else if (class51.field813 == 145) {
                class217.method1572(4096);
                class51.field813 = -1;
                return true;
            } else if (class51.field813 == 118) {
                int var67 = class267.field4132.method775(-87);
                int var68 = class267.field4132.method767(-10453);
                int var69 = class267.field4132.method724(-1);
                if (var69 == 65535) {
                    var69 = -1;
                }
                int var70 = class267.field4132.method724(-1);
                if (class145.method1100(true, var70)) {
                    class292 var71 = class215.method1555((byte) -48, var67);
                    if (var71.field4537) {
                        class181.method1348(var69, false, var68, var67);
                        class179 var73 = class208.method1521(-1361, var69);
                        class193.method1422(var67, var73.field2807, (byte) -117, var73.field2845, var73.field2849);
                        class270.method1950((byte) 120, var73.field2795, var73.field2822, var67, var73.field2841);
                    } else if (var69 == -1) {
                        class51.field813 = -1;
                        var71.field4500 = 0;
                        return true;
                    } else {
                        class179 var72 = class208.method1521(-1361, var69);
                        var71.field4522 = var72.field2849 * 100 / var68;
                        var71.field4509 = var72.field2807;
                        var71.field4511 = var72.field2845;
                        var71.field4500 = 4;
                        var71.field4513 = var69;
                        class143.method1091(var71, (byte) 74);
                    }
                }
                class51.field813 = -1;
                return true;
            } else if (class51.field813 == 209) {
                class165.field2558 = class267.field4132.method782(arg0) * 30;
                class51.field813 = -1;
                class200.field3149 = class200.field3157;
                return true;
            } else if (class51.field813 == 183) {
                int var241 = class267.field4132.method767(-10453);
                int var242 = var241 & 0x3FFF;
                int var243 = var241 >> 28 & 0x3;
                int var244 = (var241 & 0xFFFD0A5) >> 14;
                int var245 = class267.field4132.method724(-1);
                if (var245 == 65535) {
                    var245 = -1;
                }
                int var246 = class267.field4132.method746(-13551);
                int var247 = var244 - class177.field2780;
                int var248 = var246 >> 2;
                int var249 = class63.field1000[var248];
                int var250 = var246 & 0x3;
                int var251 = var242 - class91.field1485;
                class251.method1774(var245, var251, var250, var247, 0, var249, var248, var243);
                class51.field813 = -1;
                return true;
            } else if (class51.field813 == 223) {
                int var235 = class267.field4132.method731(false);
                int var236 = class267.field4132.method741(122);
                int var237 = class267.field4132.method741(103);
                int var238 = class267.field4132.method741(75);
                int var239 = class267.field4132.method741(40);
                int var240 = class267.field4132.method731(arg0);
                if (class145.method1100(true, var235)) {
                    class211.field3373[var236] = true;
                    class162.field2546[var236] = var237;
                    class67.field1082[var236] = var238;
                    class12.field236[var236] = var239;
                    class261.field4047[var236] = var240;
                }
                class51.field813 = -1;
                return true;
            } else if (class51.field813 == 249) {
                class310.field4884 = class267.field4132.method769(-128);
                class180.field2884 = class267.field4132.method759(4087);
                for (int var74 = class180.field2884; var74 < class180.field2884 + 8; var74++) {
                    for (int var75 = class310.field4884; var75 < class310.field4884 + 8; var75++) {
                        if (class261.field4050[class41.field734][var74][var75] != null) {
                            class261.field4050[class41.field734][var74][var75] = null;
                            class79.method580(var74, (byte) -82, var75);
                        }
                    }
                }
                for (class297 var76 = (class297) class221.field3547.method1490(200); var76 != null; var76 = (class297) class221.field3547.method1487((byte) 117)) {
                    if (class180.field2884 <= var76.field4694 && class180.field2884 + 8 > var76.field4694 && var76.field4685 >= class310.field4884 && class310.field4884 + 8 > var76.field4685 && class41.field734 == var76.field4693) {
                        var76.field4690 = 0;
                    }
                }
                class51.field813 = -1;
                return true;
            } else if (class51.field813 == 53) {
                String var232 = class267.field4132.method749((byte) -114);
                int var233 = class267.field4132.method766(true);
                int var234 = class267.field4132.method766(true);
                if (class145.method1100(true, var234)) {
                    class121.method924(var233, (byte) -120, var232);
                }
                class51.field813 = -1;
                return true;
            } else if (class51.field813 == 165) {
                int var229 = class267.field4132.method731(false);
                int var230 = class267.field4132.method775(93);
                if (class145.method1100(!arg0, var229)) {
                    class224 var231 = (class224) class268.field4148.method833(false, (long) var230);
                    if (var231 != null) {
                        class259.method1840(var231, true, 46);
                    }
                    if (class168.field2612 != null) {
                        class143.method1091(class168.field2612, (byte) 119);
                        class168.field2612 = null;
                    }
                }
                class51.field813 = -1;
                return true;
            } else if (class51.field813 == 103) {
                int var219 = class267.field4132.method724(-1);
                if (var219 == 65535) {
                    var219 = -1;
                }
                int var220 = class267.field4132.method724(-1);
                if (var220 == 65535) {
                    var220 = -1;
                }
                int var221 = class267.field4132.method775(60);
                int var222 = class267.field4132.method766(!arg0);
                int var223 = class267.field4132.method762(42);
                if (class145.method1100(true, var222)) {
                    for (int var224 = var220; var224 <= var219; var224++) {
                        long var225 = ((long) var221 << 32) + (long) var224;
                        class42 var227 = (class42) class269.field4170.method833(false, var225);
                        class42 var228;
                        if (var227 != null) {
                            var228 = new class42(var223, var227.field746);
                            var227.method1701(-118);
                        } else if (var224 == -1) {
                            var228 = new class42(var223, class215.method1555((byte) -48, var221).field4577.field746);
                        } else {
                            var228 = new class42(var223, -1);
                        }
                        class269.field4170.method845(var228, (byte) -71, var225);
                    }
                }
                class51.field813 = -1;
                return true;
            } else if (class51.field813 == 220) {
                class169.field2631 = class45.field779 / 8;
                for (int var77 = 0; var77 < class169.field2631; var77++) {
                    class298.field4712[var77] = class267.field4132.method723(21649);
                    class71.field1121[var77] = class327.method2242((byte) 92, class298.field4712[var77]);
                }
                class51.field813 = -1;
                class169.field2625 = class200.field3157;
                return true;
            } else if (class51.field813 == 119) {
                class17.field331 = class267.field4132.method741(89);
                class51.field813 = -1;
                return true;
            } else if (class51.field813 == 20) {
                int var78 = class267.field4132.method766(!arg0);
                int var79 = class267.field4132.method756((byte) 84);
                int var80 = class267.field4132.method766(true);
                if (var78 == 65535) {
                    var78 = -1;
                }
                int var81 = class267.field4132.method731(false);
                int var82 = class267.field4132.method766(true);
                if (var82 == 65535) {
                    var82 = -1;
                }
                if (class145.method1100(!arg0, var80)) {
                    for (int var83 = var78; var83 <= var82; var83++) {
                        long var84 = ((long) var79 << 32) + (long) var83;
                        class42 var86 = (class42) class269.field4170.method833(false, var84);
                        class42 var87;
                        if (var86 != null) {
                            var87 = new class42(var86.field738, var81);
                            var86.method1701(-77);
                        } else if (var83 == -1) {
                            var87 = new class42(class215.method1555((byte) -48, var79).field4577.field738, var81);
                        } else {
                            var87 = new class42(0, var81);
                        }
                        class269.field4170.method845(var87, (byte) 103, var84);
                    }
                }
                class51.field813 = -1;
                return true;
            } else if (class51.field813 == 236) {
                int var217 = class267.field4132.method762(-58);
                int var218 = class267.field4132.method724(-1);
                class226.method1636(var217, 0, var218);
                class51.field813 = -1;
                return true;
            } else if (class51.field813 == 30) {
                for (int var88 = 0; var88 < class82.field1228.length; var88++) {
                    if (class82.field1228[var88] != null) {
                        class82.field1228[var88].field1458 = -1;
                    }
                }
                for (int var89 = 0; var89 < class138.field2196.length; var89++) {
                    if (class138.field2196[var89] != null) {
                        class138.field2196[var89].field1458 = -1;
                    }
                }
                class51.field813 = -1;
                return true;
            } else if (class51.field813 == 24) {
                class96.method688(4);
                class51.field813 = -1;
                return true;
            } else if (class51.field813 == 4) {
                class25.field417 = 0;
                class51.field813 = -1;
                return true;
            } else if (class51.field813 == 104) {
                int var215 = class267.field4132.method769(-128);
                int var216 = class267.field4132.method782(arg0);
                class226.method1636(var215, 0, var216);
                class51.field813 = -1;
                return true;
            } else if (class51.field813 == 38) {
                class206.field3255 = class267.field4132.method741(126);
                class11.field217 = class267.field4132.method741(31);
                class61.field951 = class267.field4132.method741(116);
                class51.field813 = -1;
                return true;
            } else if (class51.field813 == 146) {
                int var211 = class267.field4132.method724(-1);
                int var212 = class267.field4132.method724(-1);
                int var213 = class267.field4132.method775(50);
                int var214 = class267.field4132.method782(arg0);
                if (class145.method1100(true, var211)) {
                    class188.method1404(-108, var213, (var212 << 16) + var214);
                }
                class51.field813 = -1;
                return true;
            } else if (class51.field813 == 200) {
                int var90 = class267.field4132.method762(29);
                int var91 = class267.field4132.method731(arg0);
                class48.method372(var90, (byte) -91, var91);
                class51.field813 = -1;
                return true;
            } else if (class51.field813 == 177) {
                int var92 = class267.field4132.method767(-10453);
                int var93 = class267.field4132.method782(false);
                int var94 = class267.field4132.method782(false);
                if (var94 == 65535) {
                    var94 = -1;
                }
                if (class145.method1100(!arg0, var93)) {
                    class16.method135(var94, true, -1, var92, 1);
                }
                class51.field813 = -1;
                return true;
            } else if (class51.field813 == 102) {
                class267.field4132.field1667 += 28;
                if (class267.field4132.method736(-58)) {
                    class109.method829(class267.field4132, 0, class267.field4132.field1667 - 28);
                }
                class51.field813 = -1;
                return true;
            } else if (class51.field813 == 12) {
                int var208 = class267.field4132.method741(24);
                class210 var209 = new class210();
                var209.field3358 = var208 & 0x3F;
                var209.field3360 = class267.field4132.method741(114);
                int var210 = var208 >> 6;
                if (var209.field3360 >= 0 && var209.field3360 < class293.field4614.length) {
                    if (var209.field3358 == 1 || var209.field3358 == 10) {
                        var209.field3364 = class267.field4132.method731(false);
                        class267.field4132.field1667 += 3;
                    } else if (var209.field3358 >= 2 && var209.field3358 <= 6) {
                        if (var209.field3358 == 2) {
                            var209.field3350 = 64;
                            var209.field3348 = 64;
                        }
                        if (var209.field3358 == 3) {
                            var209.field3350 = 64;
                            var209.field3348 = 0;
                        }
                        if (var209.field3358 == 4) {
                            var209.field3350 = 64;
                            var209.field3348 = 128;
                        }
                        if (var209.field3358 == 5) {
                            var209.field3350 = 0;
                            var209.field3348 = 64;
                        }
                        if (var209.field3358 == 6) {
                            var209.field3348 = 64;
                            var209.field3350 = 128;
                        }
                        var209.field3358 = 2;
                        var209.field3352 = class267.field4132.method731(arg0);
                        var209.field3361 = class267.field4132.method731(false);
                        var209.field3357 = class267.field4132.method741(72);
                    }
                    var209.field3359 = class267.field4132.method731(arg0);
                    if (var209.field3359 == 65535) {
                        var209.field3359 = -1;
                    }
                    class88.field1341[var210] = var209;
                }
                class51.field813 = -1;
                return true;
            } else if (class51.field813 == 171) {
                class189.method1409(0, false);
                class51.field813 = -1;
                return true;
            } else if (class51.field813 == 153) {
                long var95 = class267.field4132.method723(21649);
                class267.field4132.method727((byte) 126);
                long var97 = class267.field4132.method723(21649);
                long var99 = (long) class267.field4132.method731(arg0);
                boolean var101 = false;
                long var102 = (long) class267.field4132.method776(-1574267376);
                long var104 = (var99 << 32) + var102;
                int var106 = class267.field4132.method741(93);
                int var107 = 0;
                label1380: while (true) {
                    if (var107 < 100) {
                        if (class264.field4093[var107] != var104) {
                            var107++;
                            continue;
                        }
                        var101 = true;
                        break;
                    }
                    if (var106 <= 1) {
                        if ((!class17.field322 || class100.field1645) && !class53.field833) {
                            for (int var108 = 0; var108 < class169.field2631; var108++) {
                                if (class298.field4712[var108] == var95) {
                                    var101 = true;
                                    break label1380;
                                }
                            }
                        } else {
                            var101 = true;
                        }
                    }
                    break;
                }
                if (!var101 && class64.field1013 == 0) {
                    class264.field4093[class256.field3963] = var104;
                    class256.field3963 = (class256.field3963 + 1) % 100;
                    String var109 = class135.method1028(class16.method132((byte) 120, class289.method2032(class267.field4132, 1)));
                    if (var106 == 2 || var106 == 3) {
                        class99.method716(115, class259.method1835((byte) 126, var97), var109, 9, "<img=1>" + class259.method1835((byte) 126, var95));
                    } else if (var106 == 1) {
                        class99.method716(109, class259.method1835((byte) 126, var97), var109, 9, "<img=0>" + class259.method1835((byte) 126, var95));
                    } else {
                        class99.method716(103, class259.method1835((byte) 127, var97), var109, 9, class259.method1835((byte) 127, var95));
                    }
                }
                class51.field813 = -1;
                return true;
            } else if (class51.field813 == 247) {
                int var110 = class267.field4132.method731(false);
                if (var110 == 65535) {
                    var110 = -1;
                }
                class255.method1809(var110, -12599);
                class51.field813 = -1;
                return true;
            } else if (class51.field813 == 0) {
                int var111 = class267.field4132.method764((byte) -10);
                int var112 = class267.field4132.method766(!arg0);
                if (var112 == 65535) {
                    var112 = -1;
                }
                class59.method437(var111, 1, var112);
                class51.field813 = -1;
                return true;
            } else if (class51.field813 == 55) {
                int var205 = class267.field4132.method766(true);
                int var206 = class267.field4132.method775(-80);
                int var207 = class267.field4132.method780(-17432);
                if (class145.method1100(true, var205)) {
                    class138.method1055((byte) -76, var206, var207);
                }
                class51.field813 = -1;
                return true;
            } else if (class51.field813 == 46) {
                class292.field4543 = class200.field3157;
                long var193 = class267.field4132.method723(21649);
                if (var193 == 0L) {
                    class51.field813 = -1;
                    class245.field3789 = null;
                    class18.field355 = null;
                    class138.field2189 = null;
                    class12.field237 = 0;
                    return true;
                }
                long var195 = class267.field4132.method723(21649);
                class138.field2189 = class74.method555((byte) -125, var195);
                class18.field355 = class74.method555((byte) -79, var193);
                class245.field3784 = class267.field4132.method727((byte) 121);
                int var197 = class267.field4132.method741(67);
                if (var197 == 255) {
                    class51.field813 = -1;
                    return true;
                }
                class12.field237 = var197;
                class74[] var198 = new class74[100];
                for (int var199 = 0; var199 < class12.field237; var199++) {
                    var198[var199] = new class74();
                    var198[var199].field3734 = class267.field4132.method723(21649);
                    var198[var199].field1138 = class74.method555((byte) -94, var198[var199].field3734);
                    var198[var199].field1142 = class267.field4132.method731(false);
                    var198[var199].field1145 = class267.field4132.method727((byte) 110);
                    var198[var199].field1141 = class267.field4132.method749((byte) -83);
                    if (class6.field75 == var198[var199].field3734) {
                        class239.field3726 = var198[var199].field1145;
                    }
                }
                boolean var200 = false;
                int var201 = class12.field237;
                while (var201 > 0) {
                    boolean var202 = true;
                    var201--;
                    for (int var203 = 0; var203 < var201; var203++) {
                        if (var198[var203].field1138.compareTo(var198[var203 + 1].field1138) > 0) {
                            var202 = false;
                            class74 var204 = var198[var203];
                            var198[var203] = var198[var203 + 1];
                            var198[var203 + 1] = var204;
                        }
                    }
                    if (var202) {
                        break;
                    }
                }
                class51.field813 = -1;
                class245.field3789 = var198;
                return true;
            } else if (class51.field813 == 173) {
                int var190 = class267.field4132.method766(true);
                int var191 = class267.field4132.method775(-102);
                int var192 = class267.field4132.method724(-1);
                if (class145.method1100(true, var190)) {
                    class240.method1703((byte) -40, var191, var192);
                }
                class51.field813 = -1;
                return true;
            } else if (class51.field813 == 107) {
                int var187 = class267.field4132.method775(120);
                int var188 = class267.field4132.method731(false);
                int var189 = class267.field4132.method724(-1);
                if (var189 == 65535) {
                    var189 = -1;
                }
                if (class145.method1100(true, var188)) {
                    class16.method135(var189, true, -1, var187, 2);
                }
                class51.field813 = -1;
                return true;
            } else if (class51.field813 == 33) {
                long var113 = class267.field4132.method723(21649);
                long var115 = (long) class267.field4132.method731(false);
                long var117 = (long) class267.field4132.method776(-1574267376);
                int var119 = class267.field4132.method741(57);
                boolean var120 = false;
                long var121 = (var115 << 32) + var117;
                int var123 = 0;
                label1410: while (true) {
                    if (var123 >= 100) {
                        if (var119 <= 1) {
                            if ((!class17.field322 || class100.field1645) && !class53.field833) {
                                for (int var124 = 0; var124 < class169.field2631; var124++) {
                                    if (class298.field4712[var124] == var113) {
                                        var120 = true;
                                        break label1410;
                                    }
                                }
                            } else {
                                var120 = true;
                            }
                        }
                        break;
                    }
                    if (class264.field4093[var123] == var121) {
                        var120 = true;
                        break;
                    }
                    var123++;
                }
                if (!var120 && class64.field1013 == 0) {
                    class264.field4093[class256.field3963] = var121;
                    class256.field3963 = (class256.field3963 + 1) % 100;
                    String var125 = class135.method1028(class16.method132((byte) 123, class289.method2032(class267.field4132, 1)));
                    if (var119 == 2 || var119 == 3) {
                        class252.method1782(var125, 7, "<img=1>" + class259.method1835((byte) 127, var113), false);
                    } else if (var119 == 1) {
                        class252.method1782(var125, 7, "<img=0>" + class259.method1835((byte) 126, var113), arg0);
                    } else {
                        class252.method1782(var125, 3, class259.method1835((byte) 127, var113), false);
                    }
                }
                class51.field813 = -1;
                return true;
            } else if (class51.field813 == 169) {
                int var180 = class267.field4132.method767(-10453);
                int var181 = class267.field4132.method762(-128);
                int var182 = class267.field4132.method782(false);
                if (class145.method1100(true, var182)) {
                    class224 var183 = (class224) class268.field4148.method833(false, (long) var180);
                    class224 var184 = (class224) class268.field4148.method833(arg0, (long) var181);
                    if (var184 != null) {
                        class259.method1840(var184, var183 == null || var183.field3596 != var184.field3596, 100);
                    }
                    if (var183 != null) {
                        var183.method1701(-93);
                        class268.field4148.method845(var183, (byte) -90, (long) var181);
                    }
                    class292 var185 = class215.method1555((byte) -48, var180);
                    if (var185 != null) {
                        class143.method1091(var185, (byte) 42);
                    }
                    class292 var186 = class215.method1555((byte) -48, var181);
                    if (var186 != null) {
                        class143.method1091(var186, (byte) 117);
                        class314.method2162(true, false, var186);
                    }
                    if (class122.field1950 != -1) {
                        class108.method824(1, (byte) -109, class122.field1950);
                    }
                }
                class51.field813 = -1;
                return true;
            } else if (class51.field813 == 237) {
                class40.method327(class45.field779, class83.field1235, (byte) 124, class267.field4132);
                class51.field813 = -1;
                return true;
            } else if (class51.field813 == 76) {
                int var176 = class267.field4132.method731(false);
                int var177 = class267.field4132.method782(false);
                int var178 = class267.field4132.method769(-128);
                if (class145.method1100(true, var176)) {
                    if (var178 == 2) {
                        class103.method797((byte) -80);
                    }
                    class122.field1950 = var177;
                    class295.method2074(-14255, var177);
                    class67.method508(false, 1);
                    class8.method63(class122.field1950, 2000000);
                    for (int var179 = 0; var179 < 100; var179++) {
                        class30.field502[var179] = true;
                    }
                }
                class51.field813 = -1;
                return true;
            } else if (class51.field813 == 238) {
                int var173 = class267.field4132.method775(-93);
                int var174 = class267.field4132.method766(!arg0);
                int var175 = class267.field4132.method741(102);
                if (class145.method1100(true, var174)) {
                    class263.method1876(7, var173, var175);
                }
                class51.field813 = -1;
                return true;
            } else if (class51.field813 == 96) {
                int var170 = class267.field4132.method724(-1);
                int var171 = class267.field4132.method762(-89);
                if (class145.method1100(!arg0, var170)) {
                    int var172 = 0;
                    if (class19.field356.field489 != null) {
                        var172 = class19.field356.field489.method1742(18208);
                    }
                    class16.method135(var172, true, -1, var171, 3);
                }
                class51.field813 = -1;
                return true;
            } else if (class51.field813 == 159) {
                int var126 = class267.field4132.method782(false);
                int var127 = class267.field4132.method766(true);
                int var128 = class267.field4132.method782(false);
                if (class145.method1100(true, var127)) {
                    class248.field3833 = var126;
                    class143.field2254 = var128;
                    if (class62.field960 == 2) {
                        class103.field1746 = class248.field3833;
                        class181.field2891 = class143.field2254;
                    }
                    class51.method382(67);
                }
                class51.field813 = -1;
                return true;
            } else if (class51.field813 == 207) {
                int var129 = class267.field4132.method731(false);
                int var130 = class267.field4132.method782(arg0);
                int var131 = class267.field4132.method724(-1);
                int var132 = class267.field4132.method762(-94);
                int var133 = class267.field4132.method766(true);
                if (class145.method1100(true, var130)) {
                    class16.method135(var133 << 16 | var131, !arg0, var129, var132, 7);
                }
                class51.field813 = -1;
                return true;
            } else if (class51.field813 == 219) {
                int var134 = class267.field4132.method741(33);
                if (class267.field4132.method741(114) == 0) {
                    class207.field3273[var134] = new class92();
                } else {
                    class267.field4132.field1667--;
                    class207.field3273[var134] = new class92(class267.field4132);
                }
                class51.field813 = -1;
                class56.field901 = class200.field3157;
                return true;
            } else if (class51.field813 == 187) {
                int var135 = class267.field4132.method731(false);
                int var136 = class267.field4132.method741(75);
                int var137 = class267.field4132.method741(46);
                int var138 = class267.field4132.method731(false);
                int var139 = class267.field4132.method741(70);
                int var140 = class267.field4132.method741(123);
                if (class145.method1100(!arg0, var135)) {
                    class246.method1746(var137, (byte) -37, var140, var136, var139, var138);
                }
                class51.field813 = -1;
                return true;
            } else if (class51.field813 == 88) {
                int var167 = class267.field4132.method766(true);
                int var168 = class267.field4132.method762(18);
                int var169 = class267.field4132.method766(true);
                if (class145.method1100(true, var167)) {
                    class288.method2029(6, var168, var169);
                }
                class51.field813 = -1;
                return true;
            } else if (class51.field813 == 189) {
                class31.method218(45);
                class51.field813 = -1;
                return false;
            } else if (class51.field813 == 100) {
                int var141 = class267.field4132.method724(-1);
                int var142 = class267.field4132.method724(-1);
                int var143 = class267.field4132.method782(false);
                int var144 = class267.field4132.method731(arg0);
                int var145 = class267.field4132.method756((byte) 84);
                if (class145.method1100(true, var144)) {
                    class193.method1422(var145, var141, (byte) -107, var143, var142);
                }
                class51.field813 = -1;
                return true;
            } else if (class51.field813 == 28) {
                int var165 = class267.field4132.method731(false);
                byte var166 = class267.field4132.method734(false);
                class48.method372(var166, (byte) -96, var165);
                class51.field813 = -1;
                return true;
            } else if (class51.field813 == 45) {
                long var146 = class267.field4132.method723(21649);
                class267.field4132.method727((byte) 124);
                long var148 = class267.field4132.method723(21649);
                long var150 = (long) class267.field4132.method731(false);
                long var152 = (long) class267.field4132.method776(-1574267376);
                int var154 = class267.field4132.method741(61);
                int var155 = class267.field4132.method731(false);
                boolean var156 = false;
                long var157 = (var150 << 32) + var152;
                int var159 = 0;
                label1435: while (true) {
                    if (var159 >= 100) {
                        if (var154 <= 1) {
                            for (int var160 = 0; var160 < class169.field2631; var160++) {
                                if (class298.field4712[var160] == var146) {
                                    var156 = true;
                                    break label1435;
                                }
                            }
                        }
                        break;
                    }
                    if (class264.field4093[var159] == var157) {
                        var156 = true;
                        break;
                    }
                    var159++;
                }
                if (!var156 && class64.field1013 == 0) {
                    class264.field4093[class256.field3963] = var157;
                    class256.field3963 = (class256.field3963 + 1) % 100;
                    String var161 = class326.method2238(1, var155).method1585(class267.field4132, 3813);
                    if (var154 == 2 || var154 == 3) {
                        class107.method818((byte) -26, class259.method1835((byte) 126, var148), "<img=1>" + class259.method1835((byte) 126, var146), var161, 20, var155);
                    } else if (var154 == 1) {
                        class107.method818((byte) -26, class259.method1835((byte) 126, var148), "<img=0>" + class259.method1835((byte) 126, var146), var161, 20, var155);
                    } else {
                        class107.method818((byte) -26, class259.method1835((byte) 127, var148), class259.method1835((byte) 127, var146), var161, 20, var155);
                    }
                }
                class51.field813 = -1;
                return true;
            } else if (class51.field813 == 31) {
                class180.field2884 = class267.field4132.method759(4087);
                class310.field4884 = class267.field4132.method746(-13551);
                while (class267.field4132.field1667 < class45.field779) {
                    class51.field813 = class267.field4132.method741(100);
                    class86.method620((byte) -14);
                }
                class51.field813 = -1;
                return true;
            } else if (class51.field813 == 235) {
                int var162 = class267.field4132.method782(arg0);
                int var163 = class267.field4132.method724(-1);
                int var164 = class267.field4132.method741(92);
                if (class145.method1100(true, var163)) {
                    class240.method1703((byte) -40, var164, var162);
                }
                class51.field813 = -1;
                return true;
            } else {
                class134.method1009(-2, "T1 - " + class51.field813 + "," + class243.field3760 + "," + class312.field4897 + " - " + class45.field779, (Throwable) null);
                class31.method218(116);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(ZZIII)V", line = 2785)
    public static final void method1435(boolean arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field3129++;
        if (arg3 > -12) {
            method1436(-67);
        }
        class202.method1463(arg1, arg4, 0, arg2, arg0, (byte) 36, class13.field248.length - 1);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V", line = 2802)
    public static void method1436(int arg0) {
        field3126 = null;
        if (arg0 > -80) {
            method1435(true, true, 92, 99, 5);
        }
        field3127 = null;
    }
}
