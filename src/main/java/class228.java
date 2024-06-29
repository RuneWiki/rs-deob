import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class228 extends class287 {

    @OriginalMember(owner = "client!of", name = "x", descriptor = "I")
    public static int field3971 = -1;

    @OriginalMember(owner = "client!of", name = "r", descriptor = "Lmh;")
    public static class128 field3965 = class22.method156(127, ")1 ");

    @OriginalMember(owner = "client!of", name = "u", descriptor = "Z")
    public static boolean field3968 = true;

    @OriginalMember(owner = "client!of", name = "s", descriptor = "I")
    public static int field3966;

    @OriginalMember(owner = "client!of", name = "t", descriptor = "I")
    public static int field3967;

    @OriginalMember(owner = "client!of", name = "v", descriptor = "I")
    public static int field3969;

    @OriginalMember(owner = "client!of", name = "w", descriptor = "I")
    public static int field3970;

    @OriginalMember(owner = "client!of", name = "y", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!of", name = "z", descriptor = "I")
    public static int field3973;

    @OriginalMember(owner = "client!of", name = "A", descriptor = "I")
    public int field3974;

    @OriginalMember(owner = "client!of", name = "B", descriptor = "I")
    public int field3975;

    @OriginalMember(owner = "client!of", name = "C", descriptor = "I")
    public int field3976;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(B)V", line = 25)
    public static final void method1560(byte arg0) {
        int var1 = 116 / ((-arg0 - 16) / 47);
        class164.field2818.method1834(17);
        field3970++;
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(I)Z", line = 39)
    public static final boolean method1561(int arg0) throws IOException {
        field3973++;
        if (class121.field2041 == null) {
            return false;
        }
        int var1 = class121.field2041.method1230((byte) -121);
        if (var1 == 0) {
            return false;
        }
        if (class298.field5086 == -1) {
            class121.field2041.method1227(class54.field1051.field3417, (byte) -81, 0, 1);
            class54.field1051.field3380 = 0;
            class298.field5086 = class54.field1051.method566((byte) -70);
            var1--;
            class102.field1749 = class65.field1255[class298.field5086];
        }
        if (class102.field1749 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class121.field2041.method1227(class54.field1051.field3417, (byte) -81, 0, 1);
            class102.field1749 = class54.field1051.field3417[0] & 0xFF;
            var1--;
        }
        if (class102.field1749 == -2) {
            if (var1 <= 1) {
                return false;
            }
            var1 -= 2;
            class121.field2041.method1227(class54.field1051.field3417, (byte) -81, 0, 2);
            class54.field1051.field3380 = 0;
            class102.field1749 = class54.field1051.method1308(-93);
        }
        if (var1 < class102.field1749) {
            return false;
        }
        class54.field1051.field3380 = 0;
        class121.field2041.method1227(class54.field1051.field3417, (byte) -81, 0, class102.field1749);
        class203.field3594 = 0;
        client.field4158 = class206.field3622;
        class206.field3622 = class189.field3284;
        class189.field3284 = class298.field5086;
        if (class298.field5086 == 190) {
            class61.method403(-1);
            class246.method1678(-20249);
            class298.field5086 = -1;
            class84.field1488 += 32;
            return true;
        } else if (class298.field5086 == 205) {
            if (class196.field3433 != -1) {
                class309.method2105(class196.field3433, (byte) 112, 0);
            }
            class298.field5086 = -1;
            return true;
        } else if (class298.field5086 == 67) {
            class308.method2102(0);
            class298.field5086 = -1;
            return true;
        } else if (class298.field5086 == 144) {
            int var2 = class54.field1051.method1331(28057);
            if (var2 == 65535) {
                var2 = -1;
            }
            class38.method263(var2, 25250);
            class298.field5086 = -1;
            return true;
        } else if (class298.field5086 == 16) {
            int var350 = class54.field1051.method1307(true);
            int var351 = class54.field1051.method1308(-106);
            if (var351 == 65535) {
                var351 = -1;
            }
            class166.method1088(var350, -85, var351);
            class298.field5086 = -1;
            return true;
        } else if (class298.field5086 == 245) {
            class26.method170(-18794);
            class298.field5086 = -1;
            return false;
        } else if (class298.field5086 == 11) {
            int var344 = class54.field1051.method1350(false);
            int var345 = class54.field1051.method1308(-76);
            if (var344 < -70000) {
                var345 += 32768;
            }
            class10 var346;
            if (var344 >= 0) {
                var346 = class233.method1606(true, var344);
            } else {
                var346 = null;
            }
            while (class102.field1749 > class54.field1051.field3380) {
                int var347 = class54.field1051.method1345((byte) 99);
                int var348 = 0;
                int var349 = class54.field1051.method1308(-83);
                if (var349 != 0) {
                    var348 = class54.field1051.method1325(7627);
                    if (var348 == 255) {
                        var348 = class54.field1051.method1350(false);
                    }
                }
                if (var346 != null && var347 >= 0 && var347 < var346.field336.length) {
                    var346.field336[var347] = var349;
                    var346.field324[var347] = var348;
                }
                class91.method576(var349 - 1, var348, (byte) 125, var347, var345);
            }
            if (var346 != null) {
                class7.method48(var346, 0);
            }
            class246.method1678(-20249);
            class232.field4016[class238.method1622(31, class118.field2000++)] = class238.method1622(var345, 32767);
            class298.field5086 = -1;
            return true;
        } else if (class298.field5086 == 225) {
            int var341 = class54.field1051.method1331(28057);
            if (var341 == 65535) {
                var341 = -1;
            }
            int var342 = class54.field1051.method1335(8574);
            int var343 = class54.field1051.method1346(true);
            if (class130.method876(var342, 0)) {
                class90.method569(2, var341, var343, -9);
            }
            class298.field5086 = -1;
            return true;
        } else if (class298.field5086 == 39) {
            class128 var338 = class54.field1051.method1319(1);
            int var339 = class54.field1051.method1330(true);
            int var340 = class54.field1051.method1308(-85);
            if (class130.method876(var339, 0)) {
                class121.method741(var340, var338, (byte) -27);
            }
            class298.field5086 = -1;
            return true;
        } else if (class298.field5086 == 56) {
            class34.field731 = class54.field1051.method1318(-109);
            class58.field1115 = class54.field1051.method1318(-107);
            for (int var3 = class34.field731; var3 < (class34.field731 + 8); var3++) {
                for (int var4 = class58.field1115; var4 < class58.field1115 + 8; var4++) {
                    if (class221.field3888[class133.field2315][var3][var4] != null) {
                        class221.field3888[class133.field2315][var3][var4] = null;
                        class155.method1029(var3, var4, -1);
                    }
                }
            }
            for (class236 var5 = (class236) class214.field3777.method2024(0); var5 != null; var5 = (class236) class214.field3777.method2027(1211754408)) {
                if (var5.field4055 >= class34.field731 && var5.field4055 < (class34.field731 + 8) && class58.field1115 <= var5.field4053 && (class58.field1115 + 8) > var5.field4053 && class133.field2315 == var5.field4060) {
                    var5.field4064 = 0;
                }
            }
            class298.field5086 = -1;
            return true;
        } else if (class298.field5086 == 51) {
            class32.field713 = class54.field1051.method1331(28057) * 30;
            class217.field3833 = class104.field1788;
            class298.field5086 = -1;
            return true;
        } else if (class298.field5086 == 46) {
            int var6 = class54.field1051.method1320(255);
            int var7 = class54.field1051.method1335(8574);
            int var8 = class54.field1051.method1330(true);
            int var9 = class54.field1051.method1322(-31669);
            if (class130.method876(var8, 0)) {
                class88 var10 = (class88) class182.field3198.method728(false, (long) var6);
                if (var10 != null) {
                    class50.method341(124, var10.field1510 != var7, var10);
                }
                class53.method360(var9, var6, (byte) 61, var7);
            }
            class298.field5086 = -1;
            return true;
        } else if (class298.field5086 == 231) {
            int var11 = class54.field1051.method1323(4376);
            int var12 = (var11 & 0xFFFE4AA) >> 14;
            int var13 = var11 & 0x3FFF;
            int var14 = class54.field1051.method1322(-31669);
            int var15 = var11 >> 28 & 0x3;
            int var16 = var14 >> 2;
            int var17 = class287.field4910[var16];
            int var18 = var14 & 0x3;
            int var19 = class54.field1051.method1308(-24);
            int var20 = var12 - class221.field3889;
            if (var19 == 65535) {
                var19 = -1;
            }
            int var21 = var13 - class4.field72;
            class248.method1724(var19, var18, var15, (byte) -94, var16, var20, var17, var21);
            class298.field5086 = -1;
            return true;
        } else if (class298.field5086 == 148) {
            int var22 = class54.field1051.method1335(8574);
            byte var23 = class54.field1051.method1329(0);
            class289.method1994(var22, var23, (byte) 96);
            class298.field5086 = -1;
            return true;
        } else if (class298.field5086 == 213) {
            int var333 = class54.field1051.method1325(7627);
            int var334 = class54.field1051.method1325(7627);
            int var335 = class54.field1051.method1308(-19);
            int var336 = class54.field1051.method1325(7627);
            int var337 = class54.field1051.method1325(7627);
            class151.method1009(var337, var336, var333, var334, 6379, var335);
            class298.field5086 = -1;
            return true;
        } else if (class298.field5086 == 21) {
            class58.field1115 = class54.field1051.method1327(-70);
            class34.field731 = class54.field1051.method1325(7627);
            class298.field5086 = -1;
            return true;
        } else if (class298.field5086 == 209 || class298.field5086 == 57 || class298.field5086 == 71 || class298.field5086 == 93 || class298.field5086 == 121 || class298.field5086 == 254 || class298.field5086 == 62 || class298.field5086 == 35 || class298.field5086 == 237 || class298.field5086 == 207 || class298.field5086 == 252 || class298.field5086 == 229) {
            class191.method1282((byte) -110);
            class298.field5086 = -1;
            return true;
        } else if (class298.field5086 == 154) {
            int var315 = class54.field1051.method1308(-17);
            int var316 = class54.field1051.method1330(true);
            int var317 = class54.field1051.method1308(-51);
            int var318 = class54.field1051.method1350(false);
            if (var318 >> 30 != 0) {
                int var319 = var318 >> 28 & 0x3;
                int var320 = (var318 & 0x3FFF) - class4.field72;
                int var321 = ((var318 & 0xFFFF642) >> 14) - class221.field3889;
                if (var321 >= 0 && var320 >= 0 && var321 < 104 && var320 < 104) {
                    int var322 = var321 * 128 + 64;
                    int var323 = var320 * 128 + 64;
                    class98 var324 = new class98(var315, var319, var322, var323, class64.method427(var322, var323, var319, (byte) 100) - var317, var316, class293.field5011);
                    class156.field2679.method2029((byte) -34, new class37(var324));
                }
            } else if (var318 >> 29 != 0) {
                int var329 = var318 & 0xFFFF;
                class115 var330 = class201.field3560[var329];
                if (var330 != null) {
                    var330.field416 = var315;
                    var330.field475 = 0;
                    var330.field456 = class293.field5011 + var316;
                    var330.field427 = 0;
                    var330.field466 = var317;
                    if (class293.field5011 < var330.field456) {
                        var330.field475 = -1;
                    }
                    if (var330.field416 == 65535) {
                        var330.field416 = -1;
                    }
                    if (var330.field416 != -1 && class293.field5011 == var330.field456) {
                        int var331 = class169.method1134(2, var330.field416).field2303;
                        if (var331 != -1) {
                            class1 var332 = class167.method1091(-77, var331);
                            if (var332 != null && var332.field8 != null) {
                                class171.method1143(var330.field418, 116, var332, false, 0, var330.field478);
                            }
                        }
                    }
                }
            } else if (var318 >> 28 != 0) {
                int var325 = var318 & 0xFFFF;
                class123 var326;
                if (class104.field1780 == var325) {
                    var326 = class163.field2796;
                } else {
                    var326 = class140.field2405[var325];
                }
                if (var326 != null) {
                    var326.field466 = var317;
                    var326.field416 = var315;
                    var326.field475 = 0;
                    var326.field456 = class293.field5011 + var316;
                    if (class293.field5011 < var326.field456) {
                        var326.field475 = -1;
                    }
                    if (var326.field416 == 65535) {
                        var326.field416 = -1;
                    }
                    var326.field427 = 0;
                    if (var326.field416 != -1 && class293.field5011 == var326.field456) {
                        int var327 = class169.method1134(2, var326.field416).field2303;
                        if (var327 != -1) {
                            class1 var328 = class167.method1091(61, var327);
                            if (var328 != null && var328.field8 != null) {
                                class171.method1143(var326.field418, 115, var328, class163.field2796 == var326, 0, var326.field478);
                            }
                        }
                    }
                }
            }
            class298.field5086 = -1;
            return true;
        } else if (class298.field5086 == 242) {
            int var24 = class54.field1051.method1315((byte) 22);
            int var25 = class54.field1051.method1323(4376);
            int var26 = class54.field1051.method1335(8574);
            int var27 = class54.field1051.method1293(false);
            if (class130.method876(var26, 0)) {
                class65.method440(var25, var24, 11, var27);
            }
            class298.field5086 = -1;
            return true;
        } else if (class298.field5086 == 235) {
            class15.method115((byte) -117, class54.field1051);
            class298.field5086 = -1;
            return true;
        } else if (class298.field5086 == 79) {
            class278.method1944((byte) 114);
            class298.field5086 = -1;
            return true;
        } else if (class298.field5086 == 127) {
            int var28 = class54.field1051.method1346(true);
            int var29 = class54.field1051.method1308(-99);
            int var30 = class54.field1051.method1308(-36);
            if (var29 == 65535) {
                var29 = -1;
            }
            if (class130.method876(var30, 0)) {
                class90.method569(1, var29, var28, -9);
            }
            class298.field5086 = -1;
            return true;
        } else if (class298.field5086 == 182) {
            int var312 = class54.field1051.method1308(-63);
            int var313 = class54.field1051.method1350(false);
            if (class130.method876(var312, 0)) {
                class88 var314 = (class88) class182.field3198.method728(false, (long) var313);
                if (var314 != null) {
                    class50.method341(124, true, var314);
                }
                if (class36.field739 != null) {
                    class7.method48(class36.field739, 0);
                    class36.field739 = null;
                }
            }
            class298.field5086 = -1;
            return true;
        } else if (class298.field5086 == 116) {
            for (int var310 = 0; var310 < class140.field2405.length; var310++) {
                if (class140.field2405[var310] != null) {
                    class140.field2405[var310].field451 = -1;
                }
            }
            for (int var311 = 0; var311 < class201.field3560.length; var311++) {
                if (class201.field3560[var311] != null) {
                    class201.field3560[var311].field451 = -1;
                }
            }
            class298.field5086 = -1;
            return true;
        } else if (class298.field5086 == 99) {
            int var307 = class54.field1051.method1323(4376);
            int var308 = class54.field1051.method1354(2);
            int var309 = class54.field1051.method1330(true);
            if (class130.method876(var309, 0)) {
                class31.method226(var307, var308, 5);
            }
            class298.field5086 = -1;
            return true;
        } else if (class298.field5086 == 63) {
            int var31 = class54.field1051.method1335(8574);
            int var32 = class54.field1051.method1323(4376);
            int var33 = class54.field1051.method1327(-99);
            if (class130.method876(var31, 0)) {
                class273.method1917(var33, var32, (byte) -41);
            }
            class298.field5086 = -1;
            return true;
        } else if (class298.field5086 == 135) {
            int var34 = class54.field1051.method1330(true);
            int var35 = class54.field1051.method1308(-121);
            int var36 = class54.field1051.method1308(-26);
            int var37 = class54.field1051.method1346(true);
            if (class130.method876(var34, 0)) {
                class90.method569(7, var36 | var35 << 16, var37, -9);
            }
            class298.field5086 = -1;
            return true;
        } else if (class298.field5086 == 226) {
            int var38 = class54.field1051.method1346(true);
            int var39 = class54.field1051.method1330(true);
            if (class130.method876(var39, 0)) {
                int var40 = 0;
                if (class163.field2796.field2078 != null) {
                    var40 = class163.field2796.field2078.method33((byte) -124);
                }
                class90.method569(3, var40, var38, -9);
            }
            class298.field5086 = -1;
            return true;
        } else if (class298.field5086 == 86) {
            long var293 = class54.field1051.method1321(20169);
            int var295 = class54.field1051.method1308(-85);
            byte var296 = class54.field1051.method1326((byte) 105);
            boolean var297 = false;
            if ((Long.MIN_VALUE & var293) != 0L) {
                var297 = true;
            }
            if (var297) {
                if (class288.field4928 == 0) {
                    class298.field5086 = -1;
                    return true;
                }
                boolean var298 = false;
                long var299 = var293 & Long.MAX_VALUE;
                int var301;
                for (var301 = 0; var301 < class288.field4928 && (class208.field3694[var301].field4915 != var299 || class208.field3694[var301].field579 != var295); var301++) {
                }
                if (class288.field4928 > var301) {
                    while (var301 < (class288.field4928 - 1)) {
                        class208.field3694[var301] = class208.field3694[var301 + 1];
                        var301++;
                    }
                    class288.field4928--;
                    class208.field3694[class288.field4928] = null;
                }
            } else {
                class128 var302 = class54.field1051.method1319(1);
                class26 var303 = new class26();
                var303.field4915 = var293;
                var303.field582 = class260.method1827(true, var303.field4915);
                var303.field569 = var302;
                var303.field578 = var296;
                var303.field579 = var295;
                int var304;
                for (var304 = class288.field4928 - 1; var304 >= 0; var304--) {
                    int var305 = class208.field3694[var304].field582.method835(var303.field582, (byte) 115);
                    if (var305 == 0) {
                        class208.field3694[var304].field579 = var295;
                        class208.field3694[var304].field578 = var296;
                        class208.field3694[var304].field569 = var302;
                        class58.field1106 = class104.field1788;
                        class298.field5086 = -1;
                        if (class306.field5211 == var293) {
                            class203.field3600 = var296;
                        }
                        return true;
                    }
                    if (var305 < 0) {
                        break;
                    }
                }
                if (class288.field4928 >= class208.field3694.length) {
                    class298.field5086 = -1;
                    return true;
                }
                for (int var306 = class288.field4928 - 1; var306 > var304; var306--) {
                    class208.field3694[var306 + 1] = class208.field3694[var306];
                }
                if (class288.field4928 == 0) {
                    class208.field3694 = new class26[100];
                }
                class208.field3694[var304 + 1] = var303;
                if (class306.field5211 == var293) {
                    class203.field3600 = var296;
                }
                class288.field4928++;
            }
            class298.field5086 = -1;
            class58.field1106 = class104.field1788;
            return true;
        } else if (class298.field5086 == 214) {
            long var41 = class54.field1051.method1321(20169);
            class128 var43 = class305.method2066(class279.method1948((byte) 100, class54.field1051).method856(-91));
            class212.method1456(var43, 1, class260.method1827(true, var41).method850(55), 6);
            class298.field5086 = -1;
            return true;
        } else if (class298.field5086 == 236) {
            int var290 = class54.field1051.method1331(28057);
            int var291 = class54.field1051.method1331(28057);
            int var292 = class54.field1051.method1346(true);
            if (class130.method876(var290, 0)) {
                class233.method1607(12, var292, var291);
            }
            class298.field5086 = -1;
            return true;
        } else if (class298.field5086 == 239) {
            int var283 = class54.field1051.method1323(4376);
            int var284 = class54.field1051.method1335(8574);
            int var285 = class54.field1051.method1308(-29);
            if (var285 == 65535) {
                var285 = -1;
            }
            int var286 = class54.field1051.method1346(true);
            if (class130.method876(var284, 0)) {
                class10 var287 = class233.method1606(true, var286);
                if (var287.field294) {
                    class275.method1928(var285, var286, 1, var283);
                    class200 var289 = class180.method1226(false, var285);
                    class88.method546((byte) 57, var286, var289.field3519, var289.field3554, var289.field3530);
                    class242.method1644(var289.field3547, var289.field3503, -26660, var286, var289.field3532);
                } else if (var285 == -1) {
                    class298.field5086 = -1;
                    var287.field283 = 0;
                    return true;
                } else {
                    class200 var288 = class180.method1226(false, var285);
                    var287.field265 = var285;
                    var287.field290 = var288.field3530;
                    var287.field231 = var288.field3519;
                    var287.field264 = var288.field3554 * 100 / var283;
                    var287.field283 = 4;
                    class7.method48(var287, 0);
                }
            }
            class298.field5086 = -1;
            return true;
        } else if (class298.field5086 == 232) {
            int var44 = class54.field1051.method1308(-128);
            int var45 = class54.field1051.method1325(7627);
            int var46 = class54.field1051.method1308(-55);
            if (var44 == 65535) {
                var44 = -1;
            }
            class218.method1510(var45, var44, false, var46);
            class298.field5086 = -1;
            return true;
        } else if (class298.field5086 == 202) {
            int var280 = class54.field1051.method1335(8574);
            int var281 = class54.field1051.method1346(true);
            int var282 = class54.field1051.method1335(8574);
            if (class130.method876(var282, 0)) {
                class105.method648(var281, 0, var280);
            }
            class298.field5086 = -1;
            return true;
        } else if (class298.field5086 == 91) {
            int var275 = class54.field1051.method1325(7627);
            int var276 = class54.field1051.method1325(7627);
            int var277 = class54.field1051.method1325(7627);
            int var278 = class54.field1051.method1325(7627);
            int var279 = class54.field1051.method1308(-43);
            class183.field3217[var275] = true;
            class93.field1581[var275] = var276;
            class306.field5216[var275] = var277;
            class185.field3227[var275] = var278;
            class117.field1988[var275] = var279;
            class298.field5086 = -1;
            return true;
        } else if (class298.field5086 == 188) {
            class217.field3827 = class54.field1051.method1325(7627);
            class225.field3930 = class54.field1051.method1325(7627);
            class155.field2673 = class54.field1051.method1325(7627);
            class298.field5086 = -1;
            return true;
        } else if (class298.field5086 == 105) {
            class235.method1614(class288.field4925, -5, class54.field1051, class102.field1749);
            class298.field5086 = -1;
            return true;
        } else if (class298.field5086 == 80) {
            class58.field1106 = class104.field1788;
            long var263 = class54.field1051.method1321(20169);
            if (var263 == 0L) {
                class288.field4928 = 0;
                class90.field1528 = null;
                class208.field3694 = null;
                class183.field3208 = null;
                class298.field5086 = -1;
                return true;
            }
            long var265 = class54.field1051.method1321(20169);
            class183.field3208 = class260.method1827(true, var265);
            class90.field1528 = class260.method1827(true, var263);
            class278.field4793 = class54.field1051.method1326((byte) 90);
            int var267 = class54.field1051.method1325(7627);
            if (var267 == 255) {
                class298.field5086 = -1;
                return true;
            }
            class288.field4928 = var267;
            class26[] var268 = new class26[100];
            for (int var269 = 0; var269 < class288.field4928; var269++) {
                var268[var269] = new class26();
                var268[var269].field4915 = class54.field1051.method1321(20169);
                var268[var269].field582 = class260.method1827(true, var268[var269].field4915);
                var268[var269].field579 = class54.field1051.method1308(-47);
                var268[var269].field578 = class54.field1051.method1326((byte) 117);
                var268[var269].field569 = class54.field1051.method1319(1);
                if (class306.field5211 == var268[var269].field4915) {
                    class203.field3600 = var268[var269].field578;
                }
            }
            boolean var270 = false;
            int var271 = class288.field4928;
            while (var271 > 0) {
                var271--;
                boolean var272 = true;
                for (int var273 = 0; var273 < var271; var273++) {
                    if (var268[var273].field582.method835(var268[var273 + 1].field582, (byte) -85) > 0) {
                        class26 var274 = var268[var273];
                        var272 = false;
                        var268[var273] = var268[var273 + 1];
                        var268[var273 + 1] = var274;
                    }
                }
                if (var272) {
                    break;
                }
            }
            class208.field3694 = var268;
            class298.field5086 = -1;
            return true;
        } else if (class298.field5086 == 184) {
            class298.field5086 = -1;
            class219.field3863 = 0;
            return true;
        } else if (class298.field5086 == 72) {
            class218.field3847 = class102.field1749 / 8;
            for (int var47 = 0; var47 < class218.field3847; var47++) {
                class208.field3646[var47] = class54.field1051.method1321(20169);
                class163.field2777[var47] = class260.method1827(true, class208.field3646[var47]);
            }
            class208.field3708 = class104.field1788;
            class298.field5086 = -1;
            return true;
        } else if (class298.field5086 == 203) {
            class58.field1115 = class54.field1051.method1327(-125);
            class34.field731 = class54.field1051.method1327(-87);
            while (class54.field1051.field3380 < class102.field1749) {
                class298.field5086 = class54.field1051.method1325(7627);
                class191.method1282((byte) -99);
            }
            class298.field5086 = -1;
            return true;
        } else if (class298.field5086 == 98) {
            int var48 = class54.field1051.method1327(-88);
            int var49 = class54.field1051.method1308(-18);
            int var50 = class54.field1051.method1335(8574);
            if (class130.method876(var50, 0)) {
                if (var48 == 2) {
                    class195.method1356(116);
                }
                class196.field3433 = var49;
                class74.method485(128, var49);
                class206.method1420(false, 65);
                class181.method1237(class196.field3433, -30);
                for (int var51 = 0; var51 < 100; var51++) {
                    class26.field581[var51] = true;
                }
            }
            class298.field5086 = -1;
            return true;
        } else if (class298.field5086 == 70) {
            int var261 = class54.field1051.method1331(28057);
            int var262 = class54.field1051.method1327(-124);
            class1.method7(var262, var261, -7);
            class298.field5086 = -1;
            return true;
        } else if (class298.field5086 == 60) {
            class128 var52 = class54.field1051.method1319(1);
            int var53 = class54.field1051.method1320(255);
            int var54 = class54.field1051.method1335(8574);
            if (class130.method876(var54, 0)) {
                class196.method1366(var52, (byte) 99, var53);
            }
            class298.field5086 = -1;
            return true;
        } else if (class298.field5086 == 95) {
            long var246 = class54.field1051.method1321(20169);
            class54.field1051.method1326((byte) 108);
            long var248 = class54.field1051.method1321(20169);
            long var250 = (long) class54.field1051.method1308(-26);
            long var252 = (long) class54.field1051.method1349((byte) 91);
            int var254 = class54.field1051.method1325(7627);
            boolean var255 = false;
            long var256 = (var250 << 32) + var252;
            int var258 = 0;
            label1430: while (true) {
                if (var258 < 100) {
                    if (class75.field1402[var258] != var256) {
                        var258++;
                        continue;
                    }
                    var255 = true;
                    break;
                }
                if (var254 <= 1) {
                    if (class191.field3311 == 1 || class208.field3681 == 1) {
                        var255 = true;
                    } else {
                        for (int var259 = 0; var259 < class218.field3847; var259++) {
                            if (class208.field3646[var259] == var246) {
                                var255 = true;
                                break label1430;
                            }
                        }
                    }
                }
                break;
            }
            if (!var255 && class57.field1101 == 0) {
                class75.field1402[class220.field3872] = var256;
                class220.field3872 = (class220.field3872 + 1) % 100;
                class128 var260 = class305.method2066(class279.method1948((byte) 100, class54.field1051).method856(75));
                if (var254 == 2 || var254 == 3) {
                    class94.method588(var260, 9, class28.method177((byte) -64, new class128[] { class11.field381, class260.method1827(true, var246).method850(55) }), class260.method1827(true, var248).method850(55), 59);
                } else if (var254 == 1) {
                    class94.method588(var260, 9, class28.method177((byte) -101, new class128[] { class103.field1765, class260.method1827(true, var246).method850(55) }), class260.method1827(true, var248).method850(55), 59);
                } else {
                    class94.method588(var260, 9, class260.method1827(true, var246).method850(55), class260.method1827(true, var248).method850(55), 59);
                }
            }
            class298.field5086 = -1;
            return true;
        } else if (class298.field5086 == 28) {
            int var55 = class54.field1051.method1330(true);
            int var56 = class54.field1051.method1335(8574);
            class115.field1945 = var56;
            class118.field1997 = var55;
            class121.method736((byte) 75);
            class298.field5086 = -1;
            return true;
        } else if (class298.field5086 == 221) {
            int var243 = class54.field1051.method1318(-122);
            int var244 = class54.field1051.method1308(-73);
            int var245 = class54.field1051.method1308(-35);
            if (class130.method876(var245, 0)) {
                class33.method239(var244, var243, (byte) -98);
            }
            class298.field5086 = -1;
            return true;
        } else if (class298.field5086 == 103) {
            class246.method1678(-20249);
            int var57 = class54.field1051.method1323(4376);
            int var58 = class54.field1051.method1318(-98);
            int var59 = class54.field1051.method1327(-123);
            class207.field3631[var59] = var57;
            class128.field2219[var59] = var58;
            class221.field3884[var59] = 1;
            for (int var60 = 0; var60 < 98; var60++) {
                if (var57 >= class229.field3988[var60]) {
                    class221.field3884[var59] = var60 + 2;
                }
            }
            class99.field1721[class238.method1622(class39.field824++, 31)] = var59;
            class298.field5086 = -1;
            return true;
        } else if (class298.field5086 == 119) {
            int var61 = class54.field1051.method1318(-81);
            int var62 = class54.field1051.method1318(-98);
            class128 var63 = class54.field1051.method1319(1);
            if (var62 >= 1 && var62 <= 8) {
                if (var63.method861(10362, class72.field1339)) {
                    var63 = null;
                }
                class217.field3831[var62 - 1] = var63;
                class216.field3807[var62 - 1] = var61 == 0;
            }
            class298.field5086 = -1;
            return true;
        } else if (class298.field5086 == 212) {
            int var240 = class54.field1051.method1325(7627);
            class199 var241 = new class199();
            var241.field3475 = var240 & 0x3F;
            var241.field3474 = class54.field1051.method1325(7627);
            int var242 = var240 >> 6;
            if (var241.field3474 >= 0 && var241.field3474 < class242.field4147.length) {
                if (var241.field3475 == 1 || var241.field3475 == 10) {
                    var241.field3466 = class54.field1051.method1308(-21);
                    class54.field1051.field3380 += 3;
                } else if (var241.field3475 >= 2 && var241.field3475 <= 6) {
                    if (var241.field3475 == 2) {
                        var241.field3481 = 64;
                        var241.field3479 = 64;
                    }
                    if (var241.field3475 == 3) {
                        var241.field3481 = 0;
                        var241.field3479 = 64;
                    }
                    if (var241.field3475 == 4) {
                        var241.field3481 = 128;
                        var241.field3479 = 64;
                    }
                    if (var241.field3475 == 5) {
                        var241.field3479 = 0;
                        var241.field3481 = 64;
                    }
                    if (var241.field3475 == 6) {
                        var241.field3481 = 64;
                        var241.field3479 = 128;
                    }
                    var241.field3475 = 2;
                    var241.field3478 = class54.field1051.method1308(-121);
                    var241.field3471 = class54.field1051.method1308(-31);
                    var241.field3469 = class54.field1051.method1325(7627);
                }
                var241.field3472 = class54.field1051.method1308(-124);
                if (var241.field3472 == 65535) {
                    var241.field3472 = -1;
                }
                class260.field4489[var242] = var241;
            }
            class298.field5086 = -1;
            return true;
        } else if (class298.field5086 == 45) {
            long var64 = class54.field1051.method1321(20169);
            class54.field1051.method1326((byte) 110);
            long var66 = class54.field1051.method1321(20169);
            long var68 = (long) class54.field1051.method1308(-86);
            long var70 = (long) class54.field1051.method1349((byte) 91);
            int var72 = class54.field1051.method1325(7627);
            long var73 = (var68 << 32) + var70;
            int var75 = class54.field1051.method1308(-91);
            boolean var76 = false;
            int var77 = 0;
            label1145: while (true) {
                if (var77 < 100) {
                    if (class75.field1402[var77] != var73) {
                        var77++;
                        continue;
                    }
                    var76 = true;
                    break;
                }
                if (var72 <= 1) {
                    for (int var78 = 0; var78 < class218.field3847; var78++) {
                        if (class208.field3646[var78] == var64) {
                            var76 = true;
                            break label1145;
                        }
                    }
                }
                break;
            }
            if (!var76 && class57.field1101 == 0) {
                class75.field1402[class220.field3872] = var73;
                class220.field3872 = (class220.field3872 + 1) % 100;
                class128 var79 = class145.method968(true, var75).method324(true, class54.field1051);
                if (var72 == 2 || var72 == 3) {
                    class107.method657(false, var79, class260.method1827(true, var66).method850(55), var75, 20, class28.method177((byte) -54, new class128[] { class11.field381, class260.method1827(true, var64).method850(55) }));
                } else if (var72 == 1) {
                    class107.method657(false, var79, class260.method1827(true, var66).method850(55), var75, 20, class28.method177((byte) -84, new class128[] { class103.field1765, class260.method1827(true, var64).method850(55) }));
                } else {
                    class107.method657(false, var79, class260.method1827(true, var66).method850(55), var75, 20, class260.method1827(true, var64).method850(55));
                }
            }
            class298.field5086 = -1;
            return true;
        } else if (class298.field5086 == 200) {
            int var238 = class54.field1051.method1308(-65);
            int var239 = class54.field1051.method1350(false);
            class1.method7(var239, var238, -7);
            class298.field5086 = -1;
            return true;
        } else if (class298.field5086 == 96) {
            class246.method1678(-20249);
            class57.field1087 = class54.field1051.method1325(7627);
            class217.field3833 = class104.field1788;
            class298.field5086 = -1;
            return true;
        } else if (class298.field5086 == 102) {
            class57.method382(-127, false);
            class298.field5086 = -1;
            return true;
        } else if (class298.field5086 == 166) {
            if (class102.field1749 == 0) {
                class220.field3879 = class152.field2616;
            } else {
                class220.field3879 = class54.field1051.method1319(1);
            }
            class298.field5086 = -1;
            return true;
        } else if (class298.field5086 == 189) {
            class177.field3111 = class54.field1051.method1325(7627);
            class298.field5086 = -1;
            class208.field3708 = class104.field1788;
            return true;
        } else if (class298.field5086 == 42) {
            int var237 = class54.field1051.method1325(7627);
            if (class54.field1051.method1325(7627) == 0) {
                class273.field4738[var237] = new class188();
            } else {
                class54.field1051.field3380--;
                class273.field4738[var237] = new class188(class54.field1051);
            }
            class298.field5086 = -1;
            class147.field2521 = class104.field1788;
            return true;
        } else if (class298.field5086 == 77) {
            class120.method725(class54.field1051.method1319(1), 0);
            class298.field5086 = -1;
            return true;
        } else if (class298.field5086 == 152) {
            int var80 = class54.field1051.method1331(28057);
            if (var80 == 65535) {
                var80 = -1;
            }
            int var81 = class54.field1051.method1335(8574);
            if (var81 == 65535) {
                var81 = -1;
            }
            int var82 = class54.field1051.method1331(28057);
            int var83 = class54.field1051.method1350(false);
            int var84 = class54.field1051.method1346(true);
            if (class130.method876(var82, 0)) {
                for (int var85 = var81; var85 <= var80; var85++) {
                    long var86 = ((long) var83 << 32) + (long) var85;
                    class287 var88 = class129.field2257.method728(false, var86);
                    if (var88 != null) {
                        var88.method1978((byte) -127);
                    }
                    class129.field2257.method730(new class155(var84), var86, (byte) 124);
                }
            }
            class298.field5086 = -1;
            return true;
        } else if (class298.field5086 == 173) {
            class57.method382(60, true);
            class298.field5086 = -1;
            return true;
        } else if (class298.field5086 == 69) {
            if (class114.field1924 != null) {
                class217.method1502(class165.field2836, (byte) 127, -1, false, -1);
            }
            byte[] var235 = new byte[class102.field1749];
            class54.field1051.method560(-93, 0, var235, class102.field1749);
            class128 var236 = class220.method1520(class102.field1749, (byte) 115, 0, var235);
            if (class200.field3483 == null && class270.field4676 == 3 || !class270.field4678.startsWith("win") || class156.field2688) {
                class84.method532(var236, true, false);
            } else {
                class72.field1328 = true;
                class7.field167 = var236;
                class74.field1399 = class288.field4925.method1890(new String(var236.method825(-24750), "ISO-8859-1"), 10);
            }
            class298.field5086 = -1;
            return true;
        } else if (class298.field5086 == 138) {
            int var230 = class54.field1051.method1335(8574);
            int var231 = class54.field1051.method1308(-20);
            int var232 = class54.field1051.method1335(8574);
            int var233 = class54.field1051.method1331(28057);
            int var234 = class54.field1051.method1320(255);
            if (class130.method876(var230, 0)) {
                class88.method546((byte) 50, var234, var232, var231, var233);
            }
            class298.field5086 = -1;
            return true;
        } else if (class298.field5086 == 198) {
            int var89 = class54.field1051.method1331(28057);
            int var90 = class54.field1051.method1350(false);
            int var91 = class54.field1051.method1335(8574);
            if (class130.method876(var89, 0)) {
                class33.method239(var91, var90, (byte) -98);
            }
            class298.field5086 = -1;
            return true;
        } else if (class298.field5086 == 185) {
            int var225 = class54.field1051.method1308(-100);
            class128 var226 = class54.field1051.method1319(1);
            Object[] var227 = new Object[var226.method865((byte) 119) + 1];
            for (int var228 = var226.method865((byte) 76) - 1; var228 >= 0; var228--) {
                if (var226.method828((byte) 48, var228) == 115) {
                    var227[var228 + 1] = class54.field1051.method1319(1);
                } else {
                    var227[var228 + 1] = Integer.valueOf(class54.field1051.method1350(false));
                }
            }
            var227[0] = Integer.valueOf(class54.field1051.method1350(false));
            if (class130.method876(var225, 0)) {
                class102 var229 = new class102();
                var229.field1743 = var227;
                class249.method1739(var229, -71);
            }
            class298.field5086 = -1;
            return true;
        } else if (class298.field5086 == 132) {
            class17.method133((byte) 115);
            class298.field5086 = -1;
            return true;
        } else if (class298.field5086 == 55) {
            class246.method1678(-20249);
            class6.field116 = class54.field1051.method1354(2);
            class298.field5086 = -1;
            class217.field3833 = class104.field1788;
            return true;
        } else {
            if (arg0 <= 90) {
                method1564((byte) 56, -69);
            }
            if (class298.field5086 == 75) {
                int var92 = class54.field1051.method1346(true);
                int var93 = class54.field1051.method1350(false);
                int var94 = class54.field1051.method1330(true);
                if (class130.method876(var94, 0)) {
                    class88 var95 = (class88) class182.field3198.method728(false, (long) var92);
                    class88 var96 = (class88) class182.field3198.method728(false, (long) var93);
                    if (var96 != null) {
                        class50.method341(125, var95 == null || var95.field1510 != var96.field1510, var96);
                    }
                    if (var95 != null) {
                        var95.method1978((byte) -111);
                        class182.field3198.method730(var95, (long) var93, (byte) -70);
                    }
                    class10 var97 = class233.method1606(true, var92);
                    if (var97 != null) {
                        class7.method48(var97, 0);
                    }
                    class10 var98 = class233.method1606(true, var93);
                    if (var98 != null) {
                        class7.method48(var98, 0);
                        class15.method112(var98, true, false);
                    }
                    if (class196.field3433 != -1) {
                        class309.method2105(class196.field3433, (byte) 92, 1);
                    }
                }
                class298.field5086 = -1;
                return true;
            } else if (class298.field5086 == 2) {
                int var99 = class54.field1051.method1335(8574);
                int var100 = class54.field1051.method1330(true);
                int var101 = class54.field1051.method1327(-83);
                class115 var102 = class201.field3560[var99];
                if (var102 != null) {
                    class238.method1623(var100, var101, false, var102);
                }
                class298.field5086 = -1;
                return true;
            } else if (class298.field5086 == 106) {
                class128 var184 = class54.field1051.method1319(1);
                if (var184.method826(-15181, class132.field2286)) {
                    class128 var220 = var184.method848(0, 90, var184.method823(class175.field3098, true));
                    boolean var221 = false;
                    long var222 = var220.method819((byte) 116);
                    for (int var224 = 0; var224 < class218.field3847; var224++) {
                        if (class208.field3646[var224] == var222) {
                            var221 = true;
                            break;
                        }
                    }
                    if (!var221 && class57.field1101 == 0) {
                        class212.method1456(class63.field1190, 1, var220, 4);
                    }
                } else if (var184.method826(-15181, class108.field1834)) {
                    class128 var214 = var184.method848(0, 82, var184.method823(class175.field3098, true));
                    long var215 = var214.method819((byte) 114);
                    boolean var217 = false;
                    for (int var218 = 0; var218 < class218.field3847; var218++) {
                        if (class208.field3646[var218] == var215) {
                            var217 = true;
                            break;
                        }
                    }
                    if (!var217 && class57.field1101 == 0) {
                        class128 var219 = var184.method848(var184.method823(class175.field3098, true) + 1, 85, var184.method865((byte) -85) - 9);
                        class212.method1456(var219, 1, var214, 8);
                    }
                } else if (var184.method826(-15181, class1.field1)) {
                    class128 var185 = var184.method848(0, 117, var184.method823(class175.field3098, true));
                    boolean var186 = false;
                    long var187 = var185.method819((byte) 120);
                    for (int var189 = 0; var189 < class218.field3847; var189++) {
                        if (class208.field3646[var189] == var187) {
                            var186 = true;
                            break;
                        }
                    }
                    if (!var186 && class57.field1101 == 0) {
                        class212.method1456(class273.field4733, 1, var185, 10);
                    }
                } else if (var184.method826(-15181, class276.field4784)) {
                    class128 var190 = var184.method848(0, 85, var184.method823(class276.field4784, true));
                    class212.method1456(var190, 1, class273.field4733, 11);
                } else if (var184.method826(-15181, class155.field2674)) {
                    class128 var213 = var184.method848(0, 111, var184.method823(class155.field2674, true));
                    if (class57.field1101 == 0) {
                        class212.method1456(var213, 1, class273.field4733, 12);
                    }
                } else if (var184.method826(-15181, class71.field1318)) {
                    class128 var212 = var184.method848(0, 103, var184.method823(class71.field1318, true));
                    if (class57.field1101 == 0) {
                        class212.method1456(var212, 1, class273.field4733, 13);
                    }
                } else if (var184.method826(-15181, class11.field372)) {
                    class128 var191 = var184.method848(0, 78, var184.method823(class175.field3098, true));
                    boolean var192 = false;
                    long var193 = var191.method819((byte) 98);
                    for (int var195 = 0; var195 < class218.field3847; var195++) {
                        if (class208.field3646[var195] == var193) {
                            var192 = true;
                            break;
                        }
                    }
                    if (!var192 && class57.field1101 == 0) {
                        class212.method1456(class273.field4733, 1, var191, 14);
                    }
                } else if (var184.method826(-15181, class93.field1576)) {
                    class128 var207 = var184.method848(0, 85, var184.method823(class175.field3098, true));
                    boolean var208 = false;
                    long var209 = var207.method819((byte) 106);
                    for (int var211 = 0; var211 < class218.field3847; var211++) {
                        if (class208.field3646[var211] == var209) {
                            var208 = true;
                            break;
                        }
                    }
                    if (!var208 && class57.field1101 == 0) {
                        class212.method1456(class273.field4733, 1, var207, 15);
                    }
                } else if (var184.method826(-15181, class106.field1813)) {
                    class128 var202 = var184.method848(0, 85, var184.method823(class175.field3098, true));
                    boolean var203 = false;
                    long var204 = var202.method819((byte) 103);
                    for (int var206 = 0; var206 < class218.field3847; var206++) {
                        if (class208.field3646[var206] == var204) {
                            var203 = true;
                            break;
                        }
                    }
                    if (!var203 && class57.field1101 == 0) {
                        class212.method1456(class273.field4733, 1, var202, 16);
                    }
                } else if (var184.method826(-15181, class256.field4407)) {
                    class128 var196 = var184.method848(0, 94, var184.method823(class175.field3098, true));
                    long var197 = var196.method819((byte) 117);
                    boolean var199 = false;
                    for (int var200 = 0; var200 < class218.field3847; var200++) {
                        if (class208.field3646[var200] == var197) {
                            var199 = true;
                            break;
                        }
                    }
                    if (!var199 && class57.field1101 == 0) {
                        class128 var201 = var184.method848(var184.method823(class175.field3098, true) + 1, 108, var184.method865((byte) 119) - 9);
                        class212.method1456(var201, 1, var196, 21);
                    }
                } else {
                    class212.method1456(var184, 1, class273.field4733, 0);
                }
                class298.field5086 = -1;
                return true;
            } else if (class298.field5086 == 134) {
                long var180 = class54.field1051.method1321(20169);
                int var182 = class54.field1051.method1308(-84);
                class128 var183 = class145.method968(true, var182).method324(true, class54.field1051);
                class107.method657(false, var183, (class128) null, var182, 19, class260.method1827(true, var180).method850(55));
                class298.field5086 = -1;
                return true;
            } else if (class298.field5086 == 6) {
                int var177 = class54.field1051.method1320(255);
                class10 var178 = class233.method1606(true, var177);
                for (int var179 = 0; var179 < var178.field336.length; var179++) {
                    var178.field336[var179] = -1;
                    var178.field336[var179] = 0;
                }
                class7.method48(var178, 0);
                class298.field5086 = -1;
                return true;
            } else if (class298.field5086 == 13) {
                int var173 = class54.field1051.method1330(true);
                int var174 = class54.field1051.method1350(false);
                int var175 = class54.field1051.method1335(8574);
                int var176 = class54.field1051.method1335(8574);
                if (class130.method876(var175, 0)) {
                    class307.method2097((var173 << 16) + var176, var174, (byte) -85);
                }
                class298.field5086 = -1;
                return true;
            } else if (class298.field5086 == 191) {
                long var103 = class54.field1051.method1321(20169);
                int var105 = class54.field1051.method1308(-27);
                boolean var106 = true;
                if (var103 < 0L) {
                    var103 &= Long.MAX_VALUE;
                    var106 = false;
                }
                int var107 = class54.field1051.method1325(7627);
                class128 var108 = class273.field4733;
                if (var105 > 0) {
                    var108 = class54.field1051.method1319(1);
                }
                class128 var109 = class260.method1827(true, var103).method850(55);
                for (int var110 = 0; var110 < class214.field3779; var110++) {
                    if (class34.field738[var110] == var103) {
                        if (class171.field2996[var110] != var105) {
                            class171.field2996[var110] = var105;
                            if (var105 > 0) {
                                class212.method1456(class28.method177((byte) -84, new class128[] { var109, class161.field2745 }), 1, class273.field4733, 5);
                            }
                            if (var105 == 0) {
                                class212.method1456(class28.method177((byte) -105, new class128[] { var109, class238.field4075 }), 1, class273.field4733, 5);
                            }
                        }
                        class6.field114[var110] = var108;
                        class208.field3707[var110] = var107;
                        var109 = null;
                        class256.field4406[var110] = var106;
                        break;
                    }
                }
                if (var109 != null && class214.field3779 < 200) {
                    class34.field738[class214.field3779] = var103;
                    class313.field5284[class214.field3779] = var109;
                    class171.field2996[class214.field3779] = var105;
                    class6.field114[class214.field3779] = var108;
                    class208.field3707[class214.field3779] = var107;
                    class256.field4406[class214.field3779] = var106;
                    class214.field3779++;
                }
                boolean var111 = false;
                class208.field3708 = class104.field1788;
                int var112 = class214.field3779;
                while (var112 > 0) {
                    boolean var113 = true;
                    var112--;
                    for (int var114 = 0; var114 < var112; var114++) {
                        if (class171.field2996[var114] != class105.field1793 && class171.field2996[var114 + 1] == class105.field1793 || class171.field2996[var114] == 0 && class171.field2996[var114 + 1] != 0) {
                            var113 = false;
                            int var115 = class171.field2996[var114];
                            class171.field2996[var114] = class171.field2996[var114 + 1];
                            class171.field2996[var114 + 1] = var115;
                            class128 var116 = class6.field114[var114];
                            class6.field114[var114] = class6.field114[var114 + 1];
                            class6.field114[var114 + 1] = var116;
                            class128 var117 = class313.field5284[var114];
                            class313.field5284[var114] = class313.field5284[var114 + 1];
                            class313.field5284[var114 + 1] = var117;
                            long var118 = class34.field738[var114];
                            class34.field738[var114] = class34.field738[var114 + 1];
                            class34.field738[var114 + 1] = var118;
                            int var120 = class208.field3707[var114];
                            class208.field3707[var114] = class208.field3707[var114 + 1];
                            class208.field3707[var114 + 1] = var120;
                            boolean var121 = class256.field4406[var114];
                            class256.field4406[var114] = class256.field4406[var114 + 1];
                            class256.field4406[var114 + 1] = var121;
                        }
                    }
                    if (var113) {
                        break;
                    }
                }
                class298.field5086 = -1;
                return true;
            } else if (class298.field5086 == 197) {
                for (int var122 = 0; var122 < class104.field1778.length; var122++) {
                    if (class34.field732[var122] != class104.field1778[var122]) {
                        class104.field1778[var122] = class34.field732[var122];
                        class290.method1998(var122, true);
                        class222.field3895[class238.method1622(class84.field1488++, 31)] = var122;
                    }
                }
                class298.field5086 = -1;
                return true;
            } else if (class298.field5086 == 26) {
                int var171 = class54.field1051.method1330(true);
                int var172 = class54.field1051.method1323(4376);
                class289.method1994(var171, var172, (byte) -104);
                class298.field5086 = -1;
                return true;
            } else if (class298.field5086 == 87) {
                int var123 = class54.field1051.method1323(4376);
                class158.field2710 = class288.field4925.method1888(var123, -11057);
                class298.field5086 = -1;
                return true;
            } else if (class298.field5086 == 255) {
                class128 var124 = class54.field1051.method1319(1);
                int var125 = class54.field1051.method1335(8574);
                int var126 = class54.field1051.method1330(true);
                if (class130.method876(var125, 0)) {
                    class121.method741(var126, var124, (byte) -32);
                }
                class298.field5086 = -1;
                return true;
            } else if (class298.field5086 == 219) {
                class283.field4872 = class54.field1051.method1325(7627);
                class298.field5086 = -1;
                return true;
            } else if (class298.field5086 == 40) {
                int var127 = class54.field1051.method1331(28057);
                class242.method1643(var127, (byte) 99);
                class232.field4016[class238.method1622(class118.field2000++, 31)] = class238.method1622(32767, var127);
                class298.field5086 = -1;
                return true;
            } else if (class298.field5086 == 61) {
                long var128 = class54.field1051.method1321(20169);
                long var130 = (long) class54.field1051.method1308(-16);
                long var132 = (long) class54.field1051.method1349((byte) 91);
                int var134 = class54.field1051.method1325(7627);
                int var135 = class54.field1051.method1308(-83);
                long var136 = (var130 << 32) + var132;
                boolean var138 = false;
                int var139 = 0;
                label1213: while (true) {
                    if (var139 < 100) {
                        if (class75.field1402[var139] != var136) {
                            var139++;
                            continue;
                        }
                        var138 = true;
                        break;
                    }
                    if (var134 <= 1) {
                        for (int var140 = 0; var140 < class218.field3847; var140++) {
                            if (class208.field3646[var140] == var128) {
                                var138 = true;
                                break label1213;
                            }
                        }
                    }
                    break;
                }
                if (!var138 && class57.field1101 == 0) {
                    class75.field1402[class220.field3872] = var136;
                    class220.field3872 = (class220.field3872 + 1) % 100;
                    class128 var141 = class145.method968(true, var135).method324(true, class54.field1051);
                    if (var134 == 2) {
                        class107.method657(false, var141, (class128) null, var135, 18, class28.method177((byte) -58, new class128[] { class11.field381, class260.method1827(true, var128).method850(55) }));
                    } else if (var134 == 1) {
                        class107.method657(false, var141, (class128) null, var135, 18, class28.method177((byte) -57, new class128[] { class103.field1765, class260.method1827(true, var128).method850(55) }));
                    } else {
                        class107.method657(false, var141, (class128) null, var135, 18, class260.method1827(true, var128).method850(55));
                    }
                }
                class298.field5086 = -1;
                return true;
            } else if (class298.field5086 == 153) {
                int var142 = class54.field1051.method1350(false);
                int var143 = class54.field1051.method1308(-111);
                class10 var144;
                if (var142 >= 0) {
                    var144 = class233.method1606(true, var142);
                } else {
                    var144 = null;
                }
                if (var144 != null) {
                    for (int var145 = 0; var145 < var144.field336.length; var145++) {
                        var144.field336[var145] = 0;
                        var144.field324[var145] = 0;
                    }
                }
                if (var142 < -70000) {
                    var143 += 32768;
                }
                class218.method1511(var143, 503);
                int var146 = class54.field1051.method1308(-89);
                for (int var147 = 0; var147 < var146; var147++) {
                    int var148 = class54.field1051.method1335(8574);
                    int var149 = class54.field1051.method1322(-31669);
                    if (var149 == 255) {
                        var149 = class54.field1051.method1323(4376);
                    }
                    if (var144 != null && var144.field336.length > var147) {
                        var144.field336[var147] = var148;
                        var144.field324[var147] = var149;
                    }
                    class91.method576(var148 - 1, var149, (byte) 124, var147, var143);
                }
                if (var144 != null) {
                    class7.method48(var144, 0);
                }
                class246.method1678(-20249);
                class232.field4016[class238.method1622(class118.field2000++, 31)] = class238.method1622(var143, 32767);
                class298.field5086 = -1;
                return true;
            } else if (class298.field5086 == 238) {
                int var150 = class54.field1051.method1322(-31669);
                int var151 = class54.field1051.method1325(7627);
                int var152 = class54.field1051.method1325(7627);
                class133.field2315 = var151 >> 1;
                class163.field2796.method750(var152, (var151 & 0x1) == 1, -65536, var150);
                class298.field5086 = -1;
                return true;
            } else if (class298.field5086 == 175) {
                int var166 = class54.field1051.method1325(7627);
                int var167 = class54.field1051.method1325(7627);
                int var168 = class54.field1051.method1308(-74);
                int var169 = class54.field1051.method1325(7627);
                int var170 = class54.field1051.method1325(7627);
                class264.method1852(true, var166, true, var168, var170, var169, var167);
                class298.field5086 = -1;
                return true;
            } else if (class298.field5086 == 174) {
                long var153 = class54.field1051.method1321(20169);
                long var155 = (long) class54.field1051.method1308(-116);
                long var157 = (long) class54.field1051.method1349((byte) 91);
                int var159 = class54.field1051.method1325(7627);
                boolean var160 = false;
                long var161 = (var155 << 32) + var157;
                int var163 = 0;
                label1262: while (true) {
                    if (var163 < 100) {
                        if (class75.field1402[var163] != var161) {
                            var163++;
                            continue;
                        }
                        var160 = true;
                        break;
                    }
                    if (var159 <= 1) {
                        if (class191.field3311 == 1 || class208.field3681 == 1) {
                            var160 = true;
                        } else {
                            for (int var164 = 0; var164 < class218.field3847; var164++) {
                                if (class208.field3646[var164] == var153) {
                                    var160 = true;
                                    break label1262;
                                }
                            }
                        }
                    }
                    break;
                }
                if (!var160 && class57.field1101 == 0) {
                    class75.field1402[class220.field3872] = var161;
                    class220.field3872 = (class220.field3872 + 1) % 100;
                    class128 var165 = class305.method2066(class279.method1948((byte) 100, class54.field1051).method856(-103));
                    if (var159 == 2 || var159 == 3) {
                        class212.method1456(var165, 1, class28.method177((byte) -116, new class128[] { class11.field381, class260.method1827(true, var153).method850(55) }), 7);
                    } else if (var159 == 1) {
                        class212.method1456(var165, 1, class28.method177((byte) -119, new class128[] { class103.field1765, class260.method1827(true, var153).method850(55) }), 7);
                    } else {
                        class212.method1456(var165, 1, class260.method1827(true, var153).method850(55), 3);
                    }
                }
                class298.field5086 = -1;
                return true;
            } else {
                class79.method506((byte) -51, "T1 - " + class298.field5086 + "," + class206.field3622 + "," + client.field4158 + " - " + class102.field1749, (Throwable) null);
                class26.method170(-18794);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(I)V", line = 2654)
    public static void method1562(int arg0) {
        field3965 = null;
        if (arg0 != -1154696560) {
            field3968 = true;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(FIIIIIIZI)[[I", line = 2665)
    public static final int[][] method1563(float arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
        int[][] var9 = new int[arg1][arg4];
        class279 var10 = new class279();
        if (arg2 != -28807) {
            field3972 = -6;
        }
        var10.field4819 = arg7;
        var10.field4830 = arg6;
        var10.field4810 = arg8;
        var10.field4808 = arg3;
        field3966++;
        var10.field4821 = (int) (arg0 * 4096.0F);
        var10.method267(arg2 ^ 0x7A1B);
        class158.method1044(arg4, (byte) -128, arg1);
        for (int var11 = 0; var11 < arg1; var11++) {
            var10.method1946(var9[var11], var11, arg2 + 28679);
        }
        return var9;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(BI)I", line = 2701)
    public static final int method1564(byte arg0, int arg1) {
        int var2 = ((arg1 & 0xAAAAAAAA) >>> 1) + (arg1 & 0x55555555);
        if (arg0 != -40) {
            method1560((byte) -20);
        }
        int var3 = (var2 >>> 2 & 0xF3333333) + (var2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        field3969++;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }
}
