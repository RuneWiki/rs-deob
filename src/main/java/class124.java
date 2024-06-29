import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class124 extends class261 {

    @OriginalMember(owner = "client!cl", name = "K", descriptor = "Lve;")
    private static class255 field2059 = class87.method607(111, "glow2:");

    @OriginalMember(owner = "client!cl", name = "H", descriptor = "Lve;")
    public static class255 field2056 = field2059;

    @OriginalMember(owner = "client!cl", name = "J", descriptor = "I")
    public static int field2058 = 0;

    @OriginalMember(owner = "client!cl", name = "V", descriptor = "I")
    public static int field2070 = -1;

    @OriginalMember(owner = "client!cl", name = "F", descriptor = "[I")
    public static int[] field2054 = new int[50];

    @OriginalMember(owner = "client!cl", name = "W", descriptor = "Lve;")
    public static class255 field2071 = field2059;

    @OriginalMember(owner = "client!cl", name = "G", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!cl", name = "I", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!cl", name = "L", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!cl", name = "M", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!cl", name = "N", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!cl", name = "P", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!cl", name = "Q", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!cl", name = "R", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!cl", name = "S", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!cl", name = "T", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!cl", name = "U", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!cl", name = "O", descriptor = "[Lvk;")
    private class160[] field2063;

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "(B)Z", line = 4)
    public static final boolean method914(byte arg0) throws IOException {
        field2060++;
        if (client.field4041 == null) {
            return false;
        }
        int var1 = client.field4041.method1652(-13301);
        if (var1 == 0) {
            return false;
        }
        if (class75.field1230 == -1) {
            var1--;
            client.field4041.method1651(1, class160.field2692.field1066, arg0 + 58, 0);
            class160.field2692.field1068 = 0;
            class75.field1230 = class160.field2692.method1517(false);
            class125.field2084 = class252.field4248[class75.field1230];
        }
        if (class125.field2084 == -1) {
            if (var1 <= 0) {
                return false;
            }
            var1--;
            client.field4041.method1651(1, class160.field2692.field1066, arg0 ^ 0x3A, 0);
            class125.field2084 = class160.field2692.field1066[0] & 0xFF;
        }
        if (class125.field2084 == -2) {
            if (var1 <= 1) {
                return false;
            }
            var1 -= 2;
            client.field4041.method1651(2, class160.field2692.field1066, -1, 0);
            class160.field2692.field1068 = 0;
            class125.field2084 = class160.field2692.method423(255);
        }
        if (var1 < class125.field2084) {
            return false;
        }
        class160.field2692.field1068 = 0;
        client.field4041.method1651(class125.field2084, class160.field2692.field1066, -1, 0);
        class235.field3866 = class30.field494;
        class30.field494 = class313.field5299;
        class313.field5299 = class75.field1230;
        class103.field1738 = 0;
        if (class75.field1230 == 227) {
            class111.field1874 = class160.field2692.method481(arg0 ^ 0xFFFFFFC5);
            class246.field4137 = class160.field2692.method481(0);
            class69.field1031 = class160.field2692.method481(0);
            class75.field1230 = -1;
            return true;
        } else if (class75.field1230 == 138) {
            class264.method1842((byte) 126);
            class114.field1938 = class160.field2692.method481(0);
            class163.field2750 = class251.field4240;
            class75.field1230 = -1;
            return true;
        } else if (class75.field1230 == 60) {
            class29.field453 = class125.field2084 / 8;
            for (int var2 = 0; var2 < class29.field453; var2++) {
                class114.field1933[var2] = class160.field2692.method485(-380964768);
                class184.field2969[var2] = class147.method1091(class114.field1933[var2], arg0 - 69);
            }
            class75.field1230 = -1;
            class251.field4224 = class251.field4240;
            return true;
        } else if (class75.field1230 == 253) {
            class148.method1097((byte) -120);
            class75.field1230 = -1;
            return true;
        } else if (class75.field1230 == 213) {
            long var333 = class160.field2692.method485(-380964768);
            boolean var335 = true;
            int var336 = class160.field2692.method423(arg0 + 314);
            if (var333 < 0L) {
                var333 &= Long.MAX_VALUE;
                var335 = false;
            }
            int var337 = class160.field2692.method481(0);
            class255 var338 = class49.field728;
            if (var336 > 0) {
                var338 = class160.field2692.method479(-1);
            }
            class255 var339 = class147.method1091(var333, -128).method1787(true);
            for (int var340 = 0; var340 < class33.field529; var340++) {
                if (class209.field3570[var340] == var333) {
                    if (class93.field1595[var340] != var336) {
                        class93.field1595[var340] = var336;
                        if (var336 > 0) {
                            class260.method1807(1, class49.field728, class3.method14(new class255[] { var339, class69.field1035 }, (byte) -77), 5);
                        }
                        if (var336 == 0) {
                            class260.method1807(1, class49.field728, class3.method14(new class255[] { var339, class154.field2625 }, (byte) -72), 5);
                        }
                    }
                    class198.field3420[var340] = var338;
                    class70.field1110[var340] = var337;
                    class220.field3713[var340] = var335;
                    var339 = null;
                    break;
                }
            }
            if (var339 != null && class33.field529 < 200) {
                class209.field3570[class33.field529] = var333;
                class32.field519[class33.field529] = var339;
                class93.field1595[class33.field529] = var336;
                class198.field3420[class33.field529] = var338;
                class70.field1110[class33.field529] = var337;
                class220.field3713[class33.field529] = var335;
                class33.field529++;
            }
            class251.field4224 = class251.field4240;
            boolean var341 = false;
            int var342 = class33.field529;
            while (var342 > 0) {
                var342--;
                boolean var343 = true;
                for (int var344 = 0; var344 < var342; var344++) {
                    if (class93.field1595[var344] != class25.field386 && class93.field1595[var344 + 1] == class25.field386 || class93.field1595[var344] == 0 && class93.field1595[var344 + 1] != 0) {
                        var343 = false;
                        int var345 = class93.field1595[var344];
                        class93.field1595[var344] = class93.field1595[var344 + 1];
                        class93.field1595[var344 + 1] = var345;
                        class255 var346 = class198.field3420[var344];
                        class198.field3420[var344] = class198.field3420[var344 + 1];
                        class198.field3420[var344 + 1] = var346;
                        class255 var347 = class32.field519[var344];
                        class32.field519[var344] = class32.field519[var344 + 1];
                        class32.field519[var344 + 1] = var347;
                        long var348 = class209.field3570[var344];
                        class209.field3570[var344] = class209.field3570[var344 + 1];
                        class209.field3570[var344 + 1] = var348;
                        int var350 = class70.field1110[var344];
                        class70.field1110[var344] = class70.field1110[var344 + 1];
                        class70.field1110[var344 + 1] = var350;
                        boolean var351 = class220.field3713[var344];
                        class220.field3713[var344] = class220.field3713[var344 + 1];
                        class220.field3713[var344 + 1] = var351;
                    }
                }
                if (var343) {
                    break;
                }
            }
            class75.field1230 = -1;
            return true;
        } else if (class75.field1230 == 69) {
            int var332 = class160.field2692.method423(arg0 + 314);
            class44.method266(true, var332);
            class113.field1917[class154.method1134(31, class274.field4714++)] = class154.method1134(32767, var332);
            class75.field1230 = -1;
            return true;
        } else if (class75.field1230 == 198) {
            int var3 = class160.field2692.method464(arg0 ^ 0xFFFFC5);
            int var4 = var3 >> 28 & 0x3;
            int var5 = var3 & 0x3FFF;
            int var6 = var3 >> 14 & 0x3FFF;
            int var7 = class160.field2692.method423(255);
            int var8 = class160.field2692.method431((byte) 125);
            int var9 = var5 - class268.field4615;
            int var10 = var6 - class197.field3355;
            int var11 = var8 >> 2;
            if (var7 == 65535) {
                var7 = -1;
            }
            int var12 = var8 & 0x3;
            int var13 = class109.field1852[var11];
            class96.method755((byte) -120, var9, var10, var7, var11, var13, var12, var4);
            class75.field1230 = -1;
            return true;
        } else if (class75.field1230 == 26) {
            int var14 = class160.field2692.method482(6205);
            int var15 = class160.field2692.method426((byte) -23);
            int var16 = class160.field2692.method423(255);
            if (class141.method1053(var15, (byte) 102)) {
                if (var14 == 2) {
                    class240.method1658((byte) 79);
                }
                class264.field4459 = var16;
                class186.method1299(arg0 + 59, var16);
                class155.method1141(-121, false);
                class229.method1592(-1, class264.field4459);
                for (int var17 = 0; var17 < 100; var17++) {
                    class187.field3008[var17] = true;
                }
            }
            class75.field1230 = -1;
            return true;
        } else if (class75.field1230 == 201) {
            byte var18 = class160.field2692.method461(128);
            int var19 = class160.field2692.method423(255);
            class256.method1797(var18, false, var19);
            class75.field1230 = -1;
            return true;
        } else if (class75.field1230 == 22) {
            int var327 = class160.field2692.method464(arg0 - 16777157);
            int var328 = class160.field2692.method426((byte) -23);
            int var329 = class160.field2692.method473(-16350);
            int var330 = class160.field2692.method476((byte) 72);
            if (class141.method1053(var330, (byte) 117)) {
                class155 var331 = (class155) class158.field2675.method280((long) var327, 29153);
                if (var331 != null) {
                    class22.method120(var331.field2637 != var328, var331, arg0 ^ 0xFFFFFFB5);
                }
                class197.method1416(var328, true, var329, var327);
            }
            class75.field1230 = -1;
            return true;
        } else if (class75.field1230 == 61) {
            int var326 = class160.field2692.method481(0);
            if (class160.field2692.method481(0) == 0) {
                class60.field933[var326] = new class224();
            } else {
                class160.field2692.field1068--;
                class60.field933[var326] = new class224(class160.field2692);
            }
            class75.field1230 = -1;
            class173.field2855 = class251.field4240;
            return true;
        } else if (class75.field1230 == 183) {
            int var20 = class160.field2692.method426((byte) -23);
            class255 var21 = class160.field2692.method479(-1);
            int var22 = class160.field2692.method426((byte) -23);
            if (class141.method1053(var20, (byte) 117)) {
                class78.method545(var21, false, var22);
            }
            class75.field1230 = -1;
            return true;
        } else if (class75.field1230 == 101) {
            int var23 = class160.field2692.method481(0);
            int var24 = class160.field2692.method426((byte) -23);
            int var25 = class160.field2692.method426((byte) -23);
            if (class141.method1053(var24, (byte) 117)) {
                class30.method171(var25, var23, arg0 + 2106);
            }
            class75.field1230 = -1;
            return true;
        } else if (class75.field1230 == 245) {
            int var323 = class160.field2692.method434(-1584014312);
            class197 var324 = class58.method353(var323, (byte) -125);
            for (int var325 = 0; var325 < var324.field3352.length; var325++) {
                var324.field3352[var325] = -1;
                var324.field3352[var325] = 0;
            }
            class108.method834((byte) 49, var324);
            class75.field1230 = -1;
            return true;
        } else if (class75.field1230 == 210) {
            long var309 = class160.field2692.method485(-380964768);
            long var311 = (long) class160.field2692.method423(255);
            long var313 = (long) class160.field2692.method465(true);
            int var315 = class160.field2692.method481(0);
            int var316 = class160.field2692.method423(255);
            long var317 = (var311 << 32) + var313;
            boolean var319 = false;
            int var320 = 0;
            label1512: while (true) {
                if (var320 >= 100) {
                    if (var315 <= 1) {
                        for (int var321 = 0; var321 < class29.field453; var321++) {
                            if (class114.field1933[var321] == var309) {
                                var319 = true;
                                break label1512;
                            }
                        }
                    }
                    break;
                }
                if (class163.field2757[var320] == var317) {
                    var319 = true;
                    break;
                }
                var320++;
            }
            if (!var319 && class90.field1541 == 0) {
                class163.field2757[class127.field2099] = var317;
                class127.field2099 = (class127.field2099 + 1) % 100;
                class255 var322 = class38.method225(arg0 + 60, var316).method1595(class160.field2692, arg0 + 58);
                if (var315 == 2) {
                    class100.method780(var316, (class255) null, class3.method14(new class255[] { class254.field4279, class147.method1091(var309, -128).method1787(true) }, (byte) -83), -32411, 18, var322);
                } else if (var315 == 1) {
                    class100.method780(var316, (class255) null, class3.method14(new class255[] { class51.field764, class147.method1091(var309, -128).method1787(true) }, (byte) -72), -32411, 18, var322);
                } else {
                    class100.method780(var316, (class255) null, class147.method1091(var309, -128).method1787(true), -32411, 18, var322);
                }
            }
            class75.field1230 = -1;
            return true;
        } else if (class75.field1230 == 10) {
            int var306 = class160.field2692.method434(arg0 ^ 0x5E6A23DD);
            int var307 = class160.field2692.method426((byte) -23);
            int var308 = class160.field2692.method474((byte) 70);
            if (class141.method1053(var307, (byte) 110)) {
                class293.method2071(arg0 + 64, var306, var308);
            }
            class75.field1230 = -1;
            return true;
        } else if (class75.field1230 == 234) {
            class282.field4861 = class160.field2692.method481(0);
            class75.field1230 = -1;
            return true;
        } else if (class75.field1230 == 195) {
            int var26 = class160.field2692.method460(arg0 + 56);
            int var27 = class160.field2692.method426((byte) -23);
            if (var27 == 65535) {
                var27 = -1;
            }
            int var28 = class160.field2692.method476((byte) 72);
            if (class141.method1053(var28, (byte) 85)) {
                class218.method1542(var27, 1, var26, arg0 ^ 0x59);
            }
            class75.field1230 = -1;
            return true;
        } else if (class75.field1230 == 54) {
            int var29 = class160.field2692.method460(arg0 + 56);
            int var30 = class160.field2692.method476((byte) 72);
            int var31 = class160.field2692.method469(arg0 ^ 0xFFFFFFA1);
            if (class141.method1053(var30, (byte) 111)) {
                class155 var32 = (class155) class158.field2675.method280((long) var29, 29153);
                class155 var33 = (class155) class158.field2675.method280((long) var31, 29153);
                if (var33 != null) {
                    class22.method120(var32 == null || var32.field2637 != var33.field2637, var33, arg0 ^ 0xFFFFFF90);
                }
                if (var32 != null) {
                    var32.method1502((byte) -82);
                    class158.field2675.method284(true, (long) var31, var32);
                }
                class197 var34 = class58.method353(var29, (byte) 28);
                if (var34 != null) {
                    class108.method834((byte) 49, var34);
                }
                class197 var35 = class58.method353(var31, (byte) -113);
                if (var35 != null) {
                    class108.method834((byte) 49, var35);
                    class131.method972((byte) 117, true, var35);
                }
                if (class264.field4459 != -1) {
                    class291.method2059(true, 1, class264.field4459);
                }
            }
            class75.field1230 = -1;
            return true;
        } else if (class75.field1230 == 211) {
            int var36 = class160.field2692.method476((byte) 72);
            int var37 = class160.field2692.method476((byte) 72);
            class255 var38 = class160.field2692.method479(-1);
            if (class141.method1053(var37, (byte) 115)) {
                class78.method545(var38, false, var36);
            }
            class75.field1230 = -1;
            return true;
        } else if (class75.field1230 == 14) {
            int var39 = class160.field2692.method464(arg0 ^ 0xFFFFC5);
            int var40 = class160.field2692.method423(255);
            int var41 = class160.field2692.method460(-3);
            int var42 = class160.field2692.method439(-32768);
            if (var42 == 65535) {
                var42 = -1;
            }
            if (class141.method1053(var40, (byte) 95)) {
                class197 var43 = class58.method353(var41, (byte) -128);
                if (var43.field3365) {
                    class125.method923((byte) -108, var41, var42, var39);
                    class192 var45 = class132.method990((byte) -119, var42);
                    class101.method782(var41, var45.field3092, var45.field3077, var45.field3110, -60);
                    class78.method541(var45.field3073, var41, var45.field3111, 10, var45.field3082);
                } else if (var42 == -1) {
                    var43.field3274 = 0;
                    class75.field1230 = -1;
                    return true;
                } else {
                    class192 var44 = class132.method990((byte) -119, var42);
                    var43.field3259 = var44.field3092 * 100 / var39;
                    var43.field3399 = var42;
                    var43.field3251 = var44.field3077;
                    var43.field3350 = var44.field3110;
                    var43.field3274 = 4;
                    class108.method834((byte) 49, var43);
                }
            }
            class75.field1230 = -1;
            return true;
        } else if (class75.field1230 == 250) {
            class108.method836(false);
            class264.method1842((byte) 119);
            class262.field4441 += 32;
            class75.field1230 = -1;
            return true;
        } else if (class75.field1230 == 39) {
            long var302 = class160.field2692.method485(-380964768);
            int var304 = class160.field2692.method423(arg0 ^ 0xFFFFFF3A);
            class255 var305 = class38.method225(arg0 ^ 0xFFFFFFC4, var304).method1595(class160.field2692, -1);
            class100.method780(var304, (class255) null, class147.method1091(var302, arg0 - 69).method1787(true), -32411, 19, var305);
            class75.field1230 = -1;
            return true;
        } else if (class75.field1230 == 247) {
            for (int var301 = 0; var301 < class76.field1246.length; var301++) {
                if (class93.field1601[var301] != class76.field1246[var301]) {
                    class76.field1246[var301] = class93.field1601[var301];
                    class156.method1151((byte) 7, var301);
                    class68.field1018[class154.method1134(31, class262.field4441++)] = var301;
                }
            }
            class75.field1230 = -1;
            return true;
        } else if (class75.field1230 == 163) {
            int var46 = class160.field2692.method469(97);
            int var47 = class160.field2692.method423(arg0 + 314);
            if (var46 < -70000) {
                var47 += 32768;
            }
            class197 var48;
            if (var46 < 0) {
                var48 = null;
            } else {
                var48 = class58.method353(var46, (byte) -19);
            }
            while (class160.field2692.field1068 < class125.field2084) {
                int var49 = class160.field2692.method486((byte) 115);
                int var50 = class160.field2692.method423(255);
                int var51 = 0;
                if (var50 != 0) {
                    var51 = class160.field2692.method481(0);
                    if (var51 == 255) {
                        var51 = class160.field2692.method469(96);
                    }
                }
                if (var48 != null && var49 >= 0 && var48.field3352.length > var49) {
                    var48.field3352[var49] = var50;
                    var48.field3360[var49] = var51;
                }
                class80.method550(var51, var50 - 1, var47, 1, var49);
            }
            if (var48 != null) {
                class108.method834((byte) 49, var48);
            }
            class264.method1842((byte) 120);
            class113.field1917[class154.method1134(31, class274.field4714++)] = class154.method1134(var47, 32767);
            class75.field1230 = -1;
            return true;
        } else if (class75.field1230 == 168) {
            int var52 = class160.field2692.method423(255);
            int var53 = class160.field2692.method426((byte) -23);
            class76.field1253 = var52;
            class271.field4652 = var53;
            class148.method1096((byte) -113);
            class75.field1230 = -1;
            return true;
        } else if (class75.field1230 == 56) {
            int var297 = class160.field2692.method476((byte) 72);
            int var298 = class160.field2692.method472(arg0 ^ 0x3774);
            int var299 = class160.field2692.method464(-16777216);
            int var300 = class160.field2692.method472(-14159);
            if (class141.method1053(var297, (byte) 122)) {
                class72.method518((byte) 108, var300, var298, var299);
            }
            class75.field1230 = -1;
            return true;
        } else if (class75.field1230 == 93) {
            class255 var54 = class160.field2692.method479(-1);
            if (var54.method1781(class59.field904, 119)) {
                boolean var55 = false;
                class255 var56 = var54.method1780(var54.method1790((byte) 111, class280.field4789), -10449, 0);
                long var57 = var56.method1764((byte) 80);
                for (int var59 = 0; var59 < class29.field453; var59++) {
                    if (class114.field1933[var59] == var57) {
                        var55 = true;
                        break;
                    }
                }
                if (!var55 && class90.field1541 == 0) {
                    class260.method1807(1, var56, class218.field3684, 4);
                }
            } else if (var54.method1781(class75.field1243, 127)) {
                class255 var60 = var54.method1780(var54.method1790((byte) 117, class280.field4789), -10449, 0);
                long var61 = var60.method1764((byte) -121);
                boolean var63 = false;
                for (int var64 = 0; var64 < class29.field453; var64++) {
                    if (class114.field1933[var64] == var61) {
                        var63 = true;
                        break;
                    }
                }
                if (!var63 && class90.field1541 == 0) {
                    class255 var65 = var54.method1780(var54.method1774(-41) - 9, -10449, var54.method1790((byte) 109, class280.field4789) + 1);
                    class260.method1807(1, var60, var65, 8);
                }
            } else if (var54.method1781(class262.field4442, 122)) {
                class255 var66 = var54.method1780(var54.method1790((byte) 111, class280.field4789), arg0 ^ 0x28EA, 0);
                long var67 = var66.method1764((byte) 87);
                boolean var69 = false;
                for (int var70 = 0; var70 < class29.field453; var70++) {
                    if (class114.field1933[var70] == var67) {
                        var69 = true;
                        break;
                    }
                }
                if (!var69 && class90.field1541 == 0) {
                    class260.method1807(1, var66, class49.field728, 10);
                }
            } else if (var54.method1781(class218.field3696, 116)) {
                class255 var71 = var54.method1780(var54.method1790((byte) -43, class218.field3696), arg0 ^ 0x28EA, 0);
                class260.method1807(1, class49.field728, var71, 11);
            } else if (var54.method1781(class75.field1232, 115)) {
                class255 var72 = var54.method1780(var54.method1790((byte) -95, class75.field1232), arg0 - 10390, 0);
                if (class90.field1541 == 0) {
                    class260.method1807(1, class49.field728, var72, 12);
                }
            } else if (var54.method1781(client.field4034, 118)) {
                class255 var94 = var54.method1780(var54.method1790((byte) -25, client.field4034), -10449, 0);
                if (class90.field1541 == 0) {
                    class260.method1807(1, class49.field728, var94, 13);
                }
            } else if (var54.method1781(class266.field4515, 114)) {
                class255 var89 = var54.method1780(var54.method1790((byte) -32, class280.field4789), -10449, 0);
                boolean var90 = false;
                long var91 = var89.method1764((byte) -91);
                for (int var93 = 0; var93 < class29.field453; var93++) {
                    if (class114.field1933[var93] == var91) {
                        var90 = true;
                        break;
                    }
                }
                if (!var90 && class90.field1541 == 0) {
                    class260.method1807(arg0 + 60, var89, class49.field728, 14);
                }
            } else if (var54.method1781(class2.field30, 119)) {
                class255 var84 = var54.method1780(var54.method1790((byte) 125, class280.field4789), -10449, 0);
                long var85 = var84.method1764((byte) -111);
                boolean var87 = false;
                for (int var88 = 0; var88 < class29.field453; var88++) {
                    if (class114.field1933[var88] == var85) {
                        var87 = true;
                        break;
                    }
                }
                if (!var87 && class90.field1541 == 0) {
                    class260.method1807(1, var84, class49.field728, 15);
                }
            } else if (var54.method1781(class84.field1359, 120)) {
                class255 var73 = var54.method1780(var54.method1790((byte) 115, class280.field4789), -10449, 0);
                long var74 = var73.method1764((byte) -122);
                boolean var76 = false;
                for (int var77 = 0; var77 < class29.field453; var77++) {
                    if (class114.field1933[var77] == var74) {
                        var76 = true;
                        break;
                    }
                }
                if (!var76 && class90.field1541 == 0) {
                    class260.method1807(1, var73, class49.field728, 16);
                }
            } else if (var54.method1781(class64.field973, arg0 ^ 0xFFFFFFB8)) {
                class255 var78 = var54.method1780(var54.method1790((byte) -37, class280.field4789), arg0 ^ 0x28EA, 0);
                long var79 = var78.method1764((byte) 39);
                boolean var81 = false;
                for (int var82 = 0; var82 < class29.field453; var82++) {
                    if (class114.field1933[var82] == var79) {
                        var81 = true;
                        break;
                    }
                }
                if (!var81 && class90.field1541 == 0) {
                    class255 var83 = var54.method1780(var54.method1774(-41) - 9, -10449, var54.method1790((byte) -70, class280.field4789) + 1);
                    class260.method1807(1, var78, var83, 21);
                }
            } else {
                class260.method1807(arg0 + 60, class49.field728, var54, 0);
            }
            class75.field1230 = -1;
            return true;
        } else if (class75.field1230 == 66) {
            int var293 = class160.field2692.method423(255);
            int var294 = class160.field2692.method469(93);
            int var295 = class160.field2692.method439(-32768);
            int var296 = class160.field2692.method476((byte) 72);
            if (class141.method1053(var293, (byte) 83)) {
                class242.method1684(var294, (var296 << 16) + var295, true);
            }
            class75.field1230 = -1;
            return true;
        } else if (class75.field1230 == 116) {
            class22.method124(arg0 ^ 0x44);
            class75.field1230 = -1;
            return true;
        } else if (class75.field1230 == 84) {
            int var95 = class160.field2692.method460(arg0 + 56);
            int var96 = class160.field2692.method423(arg0 ^ 0xFFFFFF3A);
            int var97 = class160.field2692.method423(255);
            int var98 = class160.field2692.method423(arg0 ^ 0xFFFFFF3A);
            if ((var95 >> 30) != 0) {
                int var107 = ((var95 & 0xFFFD84C) >> 14) - class197.field3355;
                int var108 = (var95 & 0x3FFF) - class268.field4615;
                int var109 = (var95 & 0x3B300EE0) >> 28;
                if (var107 >= 0 && var108 >= 0 && var107 < 104 && var108 < 104) {
                    int var110 = var108 * 128 + 64;
                    int var111 = var107 * 128 + 64;
                    class128 var112 = new class128(var96, var109, var111, var110, class113.method861((byte) 125, var111, var110, var109) - var98, var97, class277.field4768);
                    class218.field3692.method1472(true, new class130(var112));
                }
            } else if (var95 >> 29 != 0) {
                int var103 = var95 & 0xFFFF;
                class186 var104 = class82.field1334[var103];
                if (var104 != null) {
                    var104.field5128 = var98;
                    var104.field5152 = class277.field4768 + var97;
                    var104.field5164 = var96;
                    var104.field5151 = 0;
                    if (var104.field5164 == 65535) {
                        var104.field5164 = -1;
                    }
                    var104.field5165 = 0;
                    if (class277.field4768 < var104.field5152) {
                        var104.field5165 = -1;
                    }
                    if (var104.field5164 != -1 && class277.field4768 == var104.field5152) {
                        int var105 = class232.method1611(var104.field5164, (byte) -110).field1420;
                        if (var105 != -1) {
                            class271 var106 = class181.method1269(arg0 ^ 0xFFFFFF98, var105);
                            if (var106 != null && var106.field4667 != null) {
                                class232.method1609(false, var104.field5130, 0, var106, var104.field5173, 26694);
                            }
                        }
                    }
                }
            } else if (var95 >> 28 != 0) {
                int var99 = var95 & 0xFFFF;
                class242 var100;
                if (class14.field210 == var99) {
                    var100 = class276.field4742;
                } else {
                    var100 = class151.field2555[var99];
                }
                if (var100 != null) {
                    var100.field5152 = class277.field4768 + var97;
                    var100.field5164 = var96;
                    if (var100.field5164 == 65535) {
                        var100.field5164 = -1;
                    }
                    var100.field5165 = 0;
                    var100.field5151 = 0;
                    if (var100.field5152 > class277.field4768) {
                        var100.field5165 = -1;
                    }
                    var100.field5128 = var98;
                    if (var100.field5164 != -1 && class277.field4768 == var100.field5152) {
                        int var101 = class232.method1611(var100.field5164, (byte) -125).field1420;
                        if (var101 != -1) {
                            class271 var102 = class181.method1269(127, var101);
                            if (var102 != null && var102.field4667 != null) {
                                class232.method1609(class276.field4742 == var100, var100.field5130, 0, var102, var100.field5173, 26694);
                            }
                        }
                    }
                }
            }
            class75.field1230 = -1;
            return true;
        } else if (class75.field1230 == 239) {
            int var113 = class160.field2692.method439(-32768);
            if (var113 == 65535) {
                var113 = -1;
            }
            int var114 = class160.field2692.method434(arg0 ^ 0x5E6A23DD);
            int var115 = class160.field2692.method439(-32768);
            if (class141.method1053(var115, (byte) 118)) {
                class218.method1542(var113, 2, var114, -124);
            }
            class75.field1230 = -1;
            return true;
        } else if (class75.field1230 == 9) {
            int var116 = class160.field2692.method476((byte) 72);
            int var117 = class160.field2692.method423(255);
            int var118 = class160.field2692.method439(-32768);
            int var119 = class160.field2692.method434(arg0 - 1584014253);
            int var120 = class160.field2692.method439(-32768);
            if (class141.method1053(var118, (byte) 100)) {
                class101.method782(var119, var116, var120, var117, -57);
            }
            class75.field1230 = -1;
            return true;
        } else if (class75.field1230 == 134) {
            int var121 = class160.field2692.method481(0);
            int var122 = class160.field2692.method481(0);
            int var123 = class160.field2692.method423(arg0 ^ 0xFFFFFF3A);
            int var124 = class160.field2692.method481(0);
            int var125 = class160.field2692.method481(0);
            class280.method1949(var121, (byte) -96, var122, var125, var123, var124, true);
            class75.field1230 = -1;
            return true;
        } else if (class75.field1230 == 235) {
            int var126 = class160.field2692.method481(0);
            int var127 = class160.field2692.method481(0);
            int var128 = class160.field2692.method481(arg0 ^ 0xFFFFFFC5);
            int var129 = class160.field2692.method481(0);
            int var130 = class160.field2692.method423(255);
            class247.field4138[var126] = true;
            class37.field564[var126] = var127;
            class237.field3947[var126] = var128;
            class190.field3049[var126] = var129;
            class112.field1889[var126] = var130;
            class75.field1230 = -1;
            return true;
        } else if (class75.field1230 == 36) {
            long var131 = class160.field2692.method485(-380964768);
            long var133 = (long) class160.field2692.method423(255);
            long var135 = (long) class160.field2692.method465(true);
            int var137 = class160.field2692.method481(0);
            long var138 = (var133 << 32) + var135;
            boolean var140 = false;
            int var141 = 0;
            label1224: while (true) {
                if (var141 >= 100) {
                    if (var137 <= 1) {
                        if (class2.field35 == 1 || class231.field3837 == 1) {
                            var140 = true;
                        } else {
                            for (int var142 = 0; var142 < class29.field453; var142++) {
                                if (class114.field1933[var142] == var131) {
                                    var140 = true;
                                    break label1224;
                                }
                            }
                        }
                    }
                    break;
                }
                if (class163.field2757[var141] == var138) {
                    var140 = true;
                    break;
                }
                var141++;
            }
            if (!var140 && class90.field1541 == 0) {
                class163.field2757[class127.field2099] = var138;
                class127.field2099 = (class127.field2099 + 1) % 100;
                class255 var143 = class71.method508(class194.method1392(class160.field2692, 410623404).method1753(1));
                if (var137 == 2 || var137 == 3) {
                    class260.method1807(1, class3.method14(new class255[] { class254.field4279, class147.method1091(var131, -128).method1787(true) }, (byte) -60), var143, 7);
                } else if (var137 == 1) {
                    class260.method1807(1, class3.method14(new class255[] { class51.field764, class147.method1091(var131, arg0 - 69).method1787(true) }, (byte) -92), var143, 7);
                } else {
                    class260.method1807(1, class147.method1091(var131, -128).method1787(true), var143, 3);
                }
            }
            class75.field1230 = -1;
            return true;
        } else if (class75.field1230 == 33) {
            int var290 = class160.field2692.method434(-1584014312);
            int var291 = class160.field2692.method476((byte) 72);
            int var292 = class160.field2692.method423(255);
            if (class141.method1053(var292, (byte) 96)) {
                class120.method891((byte) -111, var291, var290);
            }
            class75.field1230 = -1;
            return true;
        } else if (class75.field1230 == 19) {
            class75.field1230 = -1;
            class113.field1918 = 0;
            return true;
        } else if (class75.field1230 == 15) {
            long var276 = class160.field2692.method485(arg0 ^ 0x16B50FA5);
            int var278 = class160.field2692.method423(255);
            byte var279 = class160.field2692.method466((byte) -28);
            boolean var280 = false;
            if ((var276 & Long.MIN_VALUE) != 0L) {
                var280 = true;
            }
            if (var280) {
                if (class255.field4358 == 0) {
                    class75.field1230 = -1;
                    return true;
                }
                long var286 = var276 & Long.MAX_VALUE;
                boolean var288 = false;
                int var289;
                for (var289 = 0; class255.field4358 > var289 && (class153.field2594[var289].field3568 != var286 || class153.field2594[var289].field4225 != var278); var289++) {
                }
                if (class255.field4358 > var289) {
                    while (var289 < (class255.field4358 - 1)) {
                        class153.field2594[var289] = class153.field2594[var289 + 1];
                        var289++;
                    }
                    class255.field4358--;
                    class153.field2594[class255.field4358] = null;
                }
            } else {
                class255 var281 = class160.field2692.method479(-1);
                class251 var282 = new class251();
                var282.field3568 = var276;
                var282.field4236 = class147.method1091(var282.field3568, arg0 ^ 0x45);
                var282.field4225 = var278;
                var282.field4232 = var279;
                var282.field4229 = var281;
                int var283;
                for (var283 = class255.field4358 - 1; var283 >= 0; var283--) {
                    int var284 = class153.field2594[var283].field4236.method1789(var282.field4236, (byte) 50);
                    if (var284 == 0) {
                        class153.field2594[var283].field4225 = var278;
                        class153.field2594[var283].field4232 = var279;
                        class153.field2594[var283].field4229 = var281;
                        class111.field1867 = class251.field4240;
                        if (class256.field4378 == var276) {
                            class43.field676 = var279;
                        }
                        class75.field1230 = -1;
                        return true;
                    }
                    if (var284 < 0) {
                        break;
                    }
                }
                if (class255.field4358 >= class153.field2594.length) {
                    class75.field1230 = -1;
                    return true;
                }
                for (int var285 = class255.field4358 - 1; var285 > var283; var285--) {
                    class153.field2594[var285 + 1] = class153.field2594[var285];
                }
                if (class255.field4358 == 0) {
                    class153.field2594 = new class251[100];
                }
                class153.field2594[var283 + 1] = var282;
                if (class256.field4378 == var276) {
                    class43.field676 = var279;
                }
                class255.field4358++;
            }
            class111.field1867 = class251.field4240;
            class75.field1230 = -1;
            return true;
        } else if (class75.field1230 == 73) {
            if (class125.field2084 == 0) {
                class309.field5254 = class291.field4996;
            } else {
                class309.field5254 = class160.field2692.method479(-1);
            }
            class75.field1230 = -1;
            return true;
        } else if (class75.field1230 == 80) {
            int var144 = class160.field2692.method476((byte) 72);
            int var145 = class160.field2692.method464(-16777216);
            class256.method1797(var145, false, var144);
            class75.field1230 = -1;
            return true;
        } else if (class75.field1230 == 218) {
            class78.field1269 = class160.field2692.method481(0);
            class75.field1230 = -1;
            class251.field4224 = class251.field4240;
            return true;
        } else if (class75.field1230 == 96) {
            int var273 = class160.field2692.method469(116);
            int var274 = class160.field2692.method439(arg0 ^ 0x7FC5);
            int var275 = class160.field2692.method426((byte) -23);
            if (class141.method1053(var275, (byte) 106)) {
                class30.method171(var274, var273, arg0 + 2106);
            }
            class75.field1230 = -1;
            return true;
        } else if (class75.field1230 == 193) {
            class42.method261(false, (byte) 51);
            class75.field1230 = -1;
            return true;
        } else if (class75.field1230 == 189) {
            int var270 = class160.field2692.method423(255);
            int var271 = class160.field2692.method481(0);
            int var272 = class160.field2692.method423(255);
            if (var270 == 65535) {
                var270 = -1;
            }
            class2.method6(var271, var270, (byte) 83, var272);
            class75.field1230 = -1;
            return true;
        } else if (class75.field1230 == 23) {
            class264.method1842((byte) 111);
            class15.field221 = class160.field2692.method454((byte) 84);
            class163.field2750 = class251.field4240;
            class75.field1230 = -1;
            return true;
        } else if (class75.field1230 == 85) {
            class42.method261(true, (byte) 76);
            class75.field1230 = -1;
            return true;
        } else if (class75.field1230 == 164) {
            int var268 = class160.field2692.method426((byte) -23);
            int var269 = class160.field2692.method473(arg0 - 16291);
            class230.method1598(var269, -17764, var268);
            class75.field1230 = -1;
            return true;
        } else if (class75.field1230 == 202) {
            class239.field3976 = class160.field2692.method481(0);
            class289.field4974 = class160.field2692.method482(6205);
            for (int var265 = class239.field3976; var265 < class239.field3976 + 8; var265++) {
                for (int var266 = class289.field4974; var266 < (class289.field4974 + 8); var266++) {
                    if (class16.field230[client.field4039][var265][var266] != null) {
                        class16.field230[client.field4039][var265][var266] = null;
                        class298.method2094((byte) -116, var266, var265);
                    }
                }
            }
            for (class294 var267 = (class294) class274.field4716.method1471((byte) -111); var267 != null; var267 = (class294) class274.field4716.method1475((byte) 83)) {
                if (class239.field3976 <= var267.field5054 && (class239.field3976 + 8) > var267.field5054 && var267.field5056 >= class289.field4974 && (class289.field4974 + 8) > var267.field5056 && client.field4039 == var267.field5046) {
                    var267.field5045 = 0;
                }
            }
            class75.field1230 = -1;
            return true;
        } else if (class75.field1230 == 177) {
            int var146 = class160.field2692.method426((byte) -23);
            int var147 = class160.field2692.method434(-1584014312);
            if (class141.method1053(var146, (byte) 119)) {
                int var148 = 0;
                if (class276.field4742.field4057 != null) {
                    var148 = class276.field4742.field4057.method2154(-106);
                }
                class218.method1542(var148, 3, var147, arg0 - 10);
            }
            class75.field1230 = -1;
            return true;
        } else {
            if (arg0 != -59) {
                field2061 = 56;
            }
            if (class75.field1230 == 87) {
                int var261 = class160.field2692.method476((byte) 72);
                int var262 = class160.field2692.method426((byte) -23);
                int var263 = class160.field2692.method481(0);
                class186 var264 = class82.field1334[var261];
                if (var264 != null) {
                    class111.method848(var262, 103, var264, var263);
                }
                class75.field1230 = -1;
                return true;
            } else if (class75.field1230 == 16) {
                class289.field4974 = class160.field2692.method473(-16350);
                class239.field3976 = class160.field2692.method481(0);
                class75.field1230 = -1;
                return true;
            } else if (class75.field1230 == 11) {
                long var149 = class160.field2692.method485(arg0 - 380964709);
                class160.field2692.method466((byte) -100);
                long var151 = class160.field2692.method485(arg0 ^ 0x16B50FA5);
                long var153 = (long) class160.field2692.method423(255);
                long var155 = (long) class160.field2692.method465(true);
                int var157 = class160.field2692.method481(arg0 ^ 0xFFFFFFC5);
                long var158 = (var153 << 32) + var155;
                int var160 = class160.field2692.method423(255);
                boolean var161 = false;
                int var162 = 0;
                label1249: while (true) {
                    if (var162 < 100) {
                        if (class163.field2757[var162] != var158) {
                            var162++;
                            continue;
                        }
                        var161 = true;
                        break;
                    }
                    if (var157 <= 1) {
                        for (int var163 = 0; var163 < class29.field453; var163++) {
                            if (class114.field1933[var163] == var149) {
                                var161 = true;
                                break label1249;
                            }
                        }
                    }
                    break;
                }
                if (!var161 && class90.field1541 == 0) {
                    class163.field2757[class127.field2099] = var158;
                    class127.field2099 = (class127.field2099 + 1) % 100;
                    class255 var164 = class38.method225(1, var160).method1595(class160.field2692, -1);
                    if (var157 == 2 || var157 == 3) {
                        class100.method780(var160, class147.method1091(var151, arg0 ^ 0x45).method1787(true), class3.method14(new class255[] { class254.field4279, class147.method1091(var149, -128).method1787(true) }, (byte) -67), arg0 ^ 0x7EA0, 20, var164);
                    } else if (var157 == 1) {
                        class100.method780(var160, class147.method1091(var151, arg0 - 69).method1787(true), class3.method14(new class255[] { class51.field764, class147.method1091(var149, -128).method1787(true) }, (byte) -69), -32411, 20, var164);
                    } else {
                        class100.method780(var160, class147.method1091(var151, -128).method1787(true), class147.method1091(var149, arg0 - 69).method1787(true), -32411, 20, var164);
                    }
                }
                class75.field1230 = -1;
                return true;
            } else if (class75.field1230 == 174) {
                method918(class160.field2692.method479(-1), -102);
                class75.field1230 = -1;
                return true;
            } else if (class75.field1230 == 146) {
                if (class307.field5221 != null) {
                    class149.method1105(false, -1, -1, false, class289.field4979);
                }
                byte[] var165 = new byte[class125.field2084];
                class160.field2692.method1516(0, class125.field2084, var165, -13);
                class255 var166 = class33.method185(var165, class125.field2084, 0, false);
                if (class37.field561 == null && class40.field624 == 3 || !class40.field619.startsWith("win") || class137.field2292) {
                    class130.method958(true, (byte) 45, var166);
                } else {
                    class147.field2494 = var166;
                    class81.field1317 = true;
                    class235.field3867 = class221.field3728.method245(new String(var166.method1742((byte) -28), "ISO-8859-1"), false);
                }
                class75.field1230 = -1;
                return true;
            } else if (class75.field1230 == 158) {
                long var246 = class160.field2692.method485(arg0 - 380964709);
                class160.field2692.method466((byte) -72);
                long var248 = class160.field2692.method485(-380964768);
                boolean var250 = false;
                long var251 = (long) class160.field2692.method423(255);
                long var253 = (long) class160.field2692.method465(true);
                long var255 = (var251 << 32) + var253;
                int var257 = class160.field2692.method481(0);
                int var258 = 0;
                label1403: while (true) {
                    if (var258 >= 100) {
                        if (var257 <= 1) {
                            if (class2.field35 == 1 || class231.field3837 == 1) {
                                var250 = true;
                            } else {
                                for (int var259 = 0; var259 < class29.field453; var259++) {
                                    if (class114.field1933[var259] == var246) {
                                        var250 = true;
                                        break label1403;
                                    }
                                }
                            }
                        }
                        break;
                    }
                    if (class163.field2757[var258] == var255) {
                        var250 = true;
                        break;
                    }
                    var258++;
                }
                if (!var250 && class90.field1541 == 0) {
                    class163.field2757[class127.field2099] = var255;
                    class127.field2099 = (class127.field2099 + 1) % 100;
                    class255 var260 = class71.method508(class194.method1392(class160.field2692, 410623404).method1753(1));
                    if (var257 == 2 || var257 == 3) {
                        class251.method1723(class3.method14(new class255[] { class254.field4279, class147.method1091(var246, -128).method1787(true) }, (byte) -116), class147.method1091(var248, -128).method1787(true), -1, 9, var260);
                    } else if (var257 == 1) {
                        class251.method1723(class3.method14(new class255[] { class51.field764, class147.method1091(var246, -128).method1787(true) }, (byte) -86), class147.method1091(var248, arg0 - 69).method1787(true), arg0 + 58, 9, var260);
                    } else {
                        class251.method1723(class147.method1091(var246, arg0 ^ 0x45).method1787(true), class147.method1091(var248, -128).method1787(true), -1, 9, var260);
                    }
                }
                class75.field1230 = -1;
                return true;
            } else if (class75.field1230 == 76) {
                int var245 = class160.field2692.method423(255);
                if (var245 == 65535) {
                    var245 = -1;
                }
                class297.method2089(var245, arg0 ^ 0xFFFFFFC5);
                class75.field1230 = -1;
                return true;
            } else if (class75.field1230 == 65) {
                int var167 = class160.field2692.method467(arg0 + 236447019);
                int var168 = class160.field2692.method476((byte) 72);
                if (var168 == 65535) {
                    var168 = -1;
                }
                class84.method589(var168, 1, var167);
                class75.field1230 = -1;
                return true;
            } else if (class75.field1230 == 229 || class75.field1230 == 254 || class75.field1230 == 133 || class75.field1230 == 243 || class75.field1230 == 0 || class75.field1230 == 179 || class75.field1230 == 117 || class75.field1230 == 79 || class75.field1230 == 188 || class75.field1230 == 166 || class75.field1230 == 5 || class75.field1230 == 72) {
                class314.method2171((byte) 28);
                class75.field1230 = -1;
                return true;
            } else if (class75.field1230 == 98) {
                int var169 = class160.field2692.method476((byte) 72);
                int var170 = class160.field2692.method469(arg0 ^ 0xFFFFFFA2);
                int var171 = class160.field2692.method426((byte) -23);
                if (class141.method1053(var171, (byte) 107)) {
                    class259.method1806(6, var170, var169);
                }
                class75.field1230 = -1;
                return true;
            } else if (class75.field1230 == 112) {
                class264.method1842((byte) 127);
                int var241 = class160.field2692.method431((byte) 74);
                int var242 = class160.field2692.method431((byte) 123);
                int var243 = class160.field2692.method460(-3);
                class143.field2386[var242] = var243;
                class217.field3678[var242] = var241;
                class271.field4678[var242] = 1;
                for (int var244 = 0; var244 < 98; var244++) {
                    if (var243 >= class251.field4231[var244]) {
                        class271.field4678[var242] = var244 + 2;
                    }
                }
                class187.field3029[class154.method1134(class149.field2526++, 31)] = var242;
                class75.field1230 = -1;
                return true;
            } else if (class75.field1230 == 155) {
                class271.method1880((byte) -32);
                class75.field1230 = -1;
                return true;
            } else if (class75.field1230 == 140) {
                int var233 = class160.field2692.method469(arg0 + 152);
                int var234 = class160.field2692.method423(255);
                class197 var235;
                if (var233 >= 0) {
                    var235 = class58.method353(var233, (byte) -125);
                } else {
                    var235 = null;
                }
                if (var233 < -70000) {
                    var234 += 32768;
                }
                if (var235 != null) {
                    for (int var236 = 0; var236 < var235.field3352.length; var236++) {
                        var235.field3352[var236] = 0;
                        var235.field3360[var236] = 0;
                    }
                }
                class96.method758(48, var234);
                int var237 = class160.field2692.method423(255);
                for (int var238 = 0; var238 < var237; var238++) {
                    int var239 = class160.field2692.method482(6205);
                    if (var239 == 255) {
                        var239 = class160.field2692.method434(-1584014312);
                    }
                    int var240 = class160.field2692.method426((byte) -23);
                    if (var235 != null && var235.field3352.length > var238) {
                        var235.field3352[var238] = var240;
                        var235.field3360[var238] = var239;
                    }
                    class80.method550(var239, var240 - 1, var234, arg0 + 60, var238);
                }
                if (var235 != null) {
                    class108.method834((byte) 49, var235);
                }
                class264.method1842((byte) 111);
                class113.field1917[class154.method1134(class274.field4714++, 31)] = class154.method1134(32767, var234);
                class75.field1230 = -1;
                return true;
            } else if (class75.field1230 == 233) {
                class255 var172 = class160.field2692.method479(-1);
                int var173 = class160.field2692.method481(arg0 ^ 0xFFFFFFC5);
                int var174 = class160.field2692.method431((byte) 127);
                if (var173 >= 1 && var173 <= 8) {
                    if (var172.method1779(arg0 ^ 0x12, class242.field4061)) {
                        var172 = null;
                    }
                    class251.field4237[var173 - 1] = var172;
                    class305.field5213[var173 - 1] = var174 == 0;
                }
                class75.field1230 = -1;
                return true;
            } else if (class75.field1230 == 206) {
                for (int var231 = 0; var231 < class151.field2555.length; var231++) {
                    if (class151.field2555[var231] != null) {
                        class151.field2555[var231].field5166 = -1;
                    }
                }
                for (int var232 = 0; var232 < class82.field1334.length; var232++) {
                    if (class82.field1334[var232] != null) {
                        class82.field1334[var232].field5166 = -1;
                    }
                }
                class75.field1230 = -1;
                return true;
            } else if (class75.field1230 == 224) {
                int var175 = class160.field2692.method464(-16777216);
                class152.field2575 = class221.field3728.method234(var175, 11281);
                class75.field1230 = -1;
                return true;
            } else if (class75.field1230 == 6) {
                int var176 = class160.field2692.method481(0);
                int var177 = class160.field2692.method481(0);
                int var178 = class160.field2692.method431((byte) 98);
                client.field4039 = var178 >> 1;
                class276.field4742.method1687(var176, var177, (var178 & 0x1) == 1, (byte) 107);
                class75.field1230 = -1;
                return true;
            } else if (class75.field1230 == 130) {
                int var222 = class160.field2692.method426((byte) -23);
                int var223 = class160.field2692.method439(-32768);
                if (var222 == 65535) {
                    var222 = -1;
                }
                int var224 = class160.field2692.method460(-3);
                int var225 = class160.field2692.method439(-32768);
                if (var225 == 65535) {
                    var225 = -1;
                }
                int var226 = class160.field2692.method469(85);
                if (class141.method1053(var223, (byte) 92)) {
                    for (int var227 = var225; var227 <= var222; var227++) {
                        long var228 = ((long) var226 << 32) + (long) var227;
                        class208 var230 = class74.field1222.method280(var228, 29153);
                        if (var230 != null) {
                            var230.method1502((byte) -82);
                        }
                        class74.field1222.method284(true, var228, new class172(var224));
                    }
                }
                class75.field1230 = -1;
                return true;
            } else if (class75.field1230 == 67) {
                int var179 = class160.field2692.method426((byte) -23);
                int var180 = class160.field2692.method469(81);
                class255 var181 = class160.field2692.method479(arg0 ^ 0x3A);
                if (class141.method1053(var179, (byte) 91)) {
                    class232.method1612((byte) 60, var181, var180);
                }
                class75.field1230 = -1;
                return true;
            } else if (class75.field1230 == 169) {
                class111.field1867 = class251.field4240;
                long var210 = class160.field2692.method485(-380964768);
                if (var210 == 0L) {
                    class153.field2594 = null;
                    class42.field657 = null;
                    class255.field4358 = 0;
                    class217.field3680 = null;
                    class75.field1230 = -1;
                    return true;
                }
                long var212 = class160.field2692.method485(arg0 ^ 0x16B50FA5);
                class217.field3680 = class147.method1091(var212, -128);
                class42.field657 = class147.method1091(var210, -128);
                class102.field1717 = class160.field2692.method466((byte) -107);
                int var214 = class160.field2692.method481(0);
                if (var214 == 255) {
                    class75.field1230 = -1;
                    return true;
                }
                class251[] var215 = new class251[100];
                class255.field4358 = var214;
                for (int var216 = 0; var216 < class255.field4358; var216++) {
                    var215[var216] = new class251();
                    var215[var216].field3568 = class160.field2692.method485(arg0 - 380964709);
                    var215[var216].field4236 = class147.method1091(var215[var216].field3568, -128);
                    var215[var216].field4225 = class160.field2692.method423(255);
                    var215[var216].field4232 = class160.field2692.method466((byte) -60);
                    var215[var216].field4229 = class160.field2692.method479(-1);
                    if (class256.field4378 == var215[var216].field3568) {
                        class43.field676 = var215[var216].field4232;
                    }
                }
                boolean var217 = false;
                int var218 = class255.field4358;
                while (var218 > 0) {
                    var218--;
                    boolean var219 = true;
                    for (int var220 = 0; var220 < var218; var220++) {
                        if (var215[var220].field4236.method1789(var215[var220 + 1].field4236, (byte) -97) > 0) {
                            class251 var221 = var215[var220];
                            var215[var220] = var215[var220 + 1];
                            var215[var220 + 1] = var221;
                            var219 = false;
                        }
                    }
                    if (var219) {
                        break;
                    }
                }
                class75.field1230 = -1;
                class153.field2594 = var215;
                return true;
            } else if (class75.field1230 == 142) {
                class234.method1623(0);
                class75.field1230 = -1;
                return false;
            } else if (class75.field1230 == 44) {
                class289.field4974 = class160.field2692.method473(arg0 ^ 0x3FE7);
                class239.field3976 = class160.field2692.method431((byte) 85);
                while (class125.field2084 > class160.field2692.field1068) {
                    class75.field1230 = class160.field2692.method481(0);
                    class314.method2171((byte) 111);
                }
                class75.field1230 = -1;
                return true;
            } else if (class75.field1230 == 184) {
                int var207 = class160.field2692.method460(-3);
                int var208 = class160.field2692.method426((byte) -23);
                int var209 = class160.field2692.method473(-16350);
                if (class141.method1053(var208, (byte) 90)) {
                    class129.method952(var209, false, var207);
                }
                class75.field1230 = -1;
                return true;
            } else if (class75.field1230 == 129) {
                class186.field2998 = class160.field2692.method426((byte) -23) * 30;
                class163.field2750 = class251.field4240;
                class75.field1230 = -1;
                return true;
            } else if (class75.field1230 == 29) {
                class115.method879(class160.field2692, class221.field3728, class125.field2084, (byte) -69);
                class75.field1230 = -1;
                return true;
            } else if (class75.field1230 == 128) {
                int var205 = class160.field2692.method439(-32768);
                int var206 = class160.field2692.method460(-3);
                class230.method1598(var206, -17764, var205);
                class75.field1230 = -1;
                return true;
            } else if (class75.field1230 == 17) {
                int var182 = class160.field2692.method423(255);
                class255 var183 = class160.field2692.method479(-1);
                Object[] var184 = new Object[var183.method1774(-41) + 1];
                for (int var185 = var183.method1774(arg0 + 18) - 1; var185 >= 0; var185--) {
                    if (var183.method1757(88, var185) == 115) {
                        var184[var185 + 1] = class160.field2692.method479(arg0 + 58);
                    } else {
                        var184[var185 + 1] = Integer.valueOf(class160.field2692.method469(102));
                    }
                }
                var184[0] = Integer.valueOf(class160.field2692.method469(125));
                if (class141.method1053(var182, (byte) 95)) {
                    class26 var186 = new class26();
                    var186.field414 = var184;
                    class114.method873(-106, var186);
                }
                class75.field1230 = -1;
                return true;
            } else if (class75.field1230 == 139) {
                class191.method1313(arg0 ^ 0x4A, class160.field2692);
                class75.field1230 = -1;
                return true;
            } else if (class75.field1230 == 82) {
                int var187 = class160.field2692.method423(255);
                int var188 = class160.field2692.method426((byte) -23);
                int var189 = class160.field2692.method476((byte) 72);
                int var190 = class160.field2692.method469(116);
                if (class141.method1053(var188, (byte) 111)) {
                    class218.method1542(var189 << 16 | var187, 7, var190, -94);
                }
                class75.field1230 = -1;
                return true;
            } else if (class75.field1230 == 125) {
                int var202 = class160.field2692.method423(255);
                int var203 = class160.field2692.method469(86);
                if (class141.method1053(var202, (byte) 116)) {
                    class155 var204 = (class155) class158.field2675.method280((long) var203, arg0 ^ 0xFFFF8E24);
                    if (var204 != null) {
                        class22.method120(true, var204, 101);
                    }
                    if (class68.field1009 != null) {
                        class108.method834((byte) 49, class68.field1009);
                        class68.field1009 = null;
                    }
                }
                class75.field1230 = -1;
                return true;
            } else if (class75.field1230 == 13) {
                if (class264.field4459 != -1) {
                    class291.method2059(true, 0, class264.field4459);
                }
                class75.field1230 = -1;
                return true;
            } else if (class75.field1230 == 154) {
                int var199 = class160.field2692.method481(0);
                int var200 = var199 >> 6;
                class190 var201 = new class190();
                var201.field3034 = var199 & 0x3F;
                var201.field3039 = class160.field2692.method481(0);
                if (var201.field3039 >= 0 && class127.field2095.length > var201.field3039) {
                    if (var201.field3034 == 1 || var201.field3034 == 10) {
                        var201.field3040 = class160.field2692.method423(255);
                        class160.field2692.field1068 += 3;
                    } else if (var201.field3034 >= 2 && var201.field3034 <= 6) {
                        if (var201.field3034 == 2) {
                            var201.field3047 = 64;
                            var201.field3044 = 64;
                        }
                        if (var201.field3034 == 3) {
                            var201.field3047 = 0;
                            var201.field3044 = 64;
                        }
                        if (var201.field3034 == 4) {
                            var201.field3044 = 64;
                            var201.field3047 = 128;
                        }
                        if (var201.field3034 == 5) {
                            var201.field3047 = 64;
                            var201.field3044 = 0;
                        }
                        if (var201.field3034 == 6) {
                            var201.field3044 = 128;
                            var201.field3047 = 64;
                        }
                        var201.field3034 = 2;
                        var201.field3046 = class160.field2692.method423(255);
                        var201.field3045 = class160.field2692.method423(255);
                        var201.field3038 = class160.field2692.method481(0);
                    }
                    var201.field3035 = class160.field2692.method423(255);
                    if (var201.field3035 == 65535) {
                        var201.field3035 = -1;
                    }
                    class108.field1824[var200] = var201;
                }
                class75.field1230 = -1;
                return true;
            } else if (class75.field1230 == 34) {
                long var191 = class160.field2692.method485(-380964768);
                class255 var193 = class71.method508(class194.method1392(class160.field2692, 410623404).method1753(1));
                class260.method1807(arg0 + 60, class147.method1091(var191, -128).method1787(true), var193, 6);
                class75.field1230 = -1;
                return true;
            } else if (class75.field1230 == 95) {
                int var194 = class160.field2692.method481(0);
                int var195 = class160.field2692.method481(0);
                int var196 = class160.field2692.method423(255);
                int var197 = class160.field2692.method481(0);
                int var198 = class160.field2692.method481(0);
                class155.method1147(var194, var196, var195, var197, var198, (byte) 16);
                class75.field1230 = -1;
                return true;
            } else {
                class195.method1393((Throwable) null, 0, "T1 - " + class75.field1230 + "," + class30.field494 + "," + class235.field3866 + " - " + class125.field2084);
                class234.method1623(0);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIII)V", line = 2631)
    public static final void method915(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2066++;
        if (arg2 != -2) {
            field2058 = 115;
        }
        for (int var5 = 0; var5 < class279.field4784; var5++) {
            if ((class247.field4147[var5] + class49.field745[var5]) > arg0 && class247.field4147[var5] < arg0 + arg4 && (class271.field4679[var5] + class10.field146[var5]) > arg3 && class271.field4679[var5] < arg3 + arg1) {
                class187.field3008[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "(B)V", line = 2654)
    public static void method916(byte arg0) {
        field2059 = null;
        field2056 = null;
        field2054 = null;
        if (arg0 < -20) {
            field2071 = null;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "([BZ)V", line = 2667)
    public static final void method917(byte[] arg0, boolean arg1) {
        field2065++;
        class70 var2 = new class70(arg0);
        var2.field1068 = arg0.length - 2;
        class109.field1850 = var2.method423(255);
        class187.field3027 = new int[class109.field1850];
        class150.field2539 = new byte[class109.field1850][];
        class131.field2167 = new int[class109.field1850];
        class244.field4114 = new boolean[class109.field1850];
        class282.field4849 = new byte[class109.field1850][];
        class132.field2173 = new int[class109.field1850];
        class298.field5098 = new int[class109.field1850];
        var2.field1068 = arg0.length - (class109.field1850 * 8) - 7;
        if (arg1) {
            return;
        }
        class153.field2608 = var2.method423(255);
        class154.field2632 = var2.method423(255);
        int var3 = (var2.method481(0) & 0xFF) + 1;
        for (int var4 = 0; var4 < class109.field1850; var4++) {
            class131.field2167[var4] = var2.method423(255);
        }
        for (int var5 = 0; var5 < class109.field1850; var5++) {
            class298.field5098[var5] = var2.method423(255);
        }
        for (int var6 = 0; var6 < class109.field1850; var6++) {
            class132.field2173[var6] = var2.method423(255);
        }
        for (int var7 = 0; var7 < class109.field1850; var7++) {
            class187.field3027[var7] = var2.method423(255);
        }
        var2.field1068 = arg0.length - (class109.field1850 * 8) - ((var3 - 1) * 3) - 7;
        class18.field296 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class18.field296[var8] = var2.method465(true);
            if (class18.field296[var8] == 0) {
                class18.field296[var8] = 1;
            }
        }
        var2.field1068 = 0;
        for (int var9 = 0; var9 < class109.field1850; var9++) {
            int var10 = class132.field2173[var9];
            int var11 = class187.field3027[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            byte[] var14 = new byte[var12];
            class282.field4849[var9] = var14;
            class150.field2539[var9] = var13;
            boolean var15 = false;
            int var16 = var2.method481(0);
            if ((var16 & 0x1) == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var14[var17] = var2.method466((byte) -79);
                }
                if ((var16 & 0x2) != 0) {
                    for (int var18 = 0; var18 < var12; var18++) {
                        byte var19 = var13[var18] = var2.method466((byte) -104);
                        var15 |= var19 != -1;
                    }
                }
            } else {
                int var20 = 0;
                label102: while (true) {
                    if (var10 <= var20) {
                        if ((var16 & 0x2) == 0) {
                            break;
                        }
                        int var22 = 0;
                        while (true) {
                            if (var10 <= var22) {
                                break label102;
                            }
                            for (int var23 = 0; var23 < var11; var23++) {
                                byte var24 = var13[var22 + (var10 * var23)] = var2.method466((byte) -25);
                                var15 |= var24 != -1;
                            }
                            var22++;
                        }
                    }
                    for (int var21 = 0; var21 < var11; var21++) {
                        var14[var10 * var21 + var20] = var2.method466((byte) -111);
                    }
                    var20++;
                }
            }
            class244.field4114[var9] = var15;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lve;I)V", line = 2839)
    private static final void method918(class255 arg0, int arg1) {
        class135.field2245 = arg0;
        field2062++;
        if (class221.field3728.field626 == null) {
            return;
        }
        try {
            if (arg1 >= -71) {
                return;
            }
            class255 var2 = class269.field4630.method1751(class221.field3728.field626, 0);
            class255 var3 = class129.field2128.method1751(class221.field3728.field626, 0);
            class255 var4 = class3.method14(new class255[] { var2, class74.field1228, arg0, class25.field408, var3 }, (byte) -89);
            class255 var5;
            if (arg0.method1774(-41) == 0) {
                var5 = class3.method14(new class255[] { var4, class17.field263 }, (byte) -119);
            } else {
                var5 = class3.method14(new class255[] { var4, class203.field3508, class92.method691(10, class218.method1541(-67) + 94608000000L), class249.field4171, class264.method1843(94608000L, (byte) 102) }, (byte) -72);
            }
            class3.method14(new class255[] { class165.field2784, var5, class25.field407 }, (byte) -62).method1785(class221.field3728.field626, 29913);
        } catch (Throwable var7) {
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I[[I)V", line = 2876)
    private final void method919(int arg0, int[][] arg1) {
        if (arg0 != 5851) {
            method918((class255) null, -111);
        }
        field2069++;
        int var3 = class210.field3590;
        int var4 = class92.field1576;
        class236.method1627((byte) 124, arg1);
        class72.method519(class250.field4205, 0, 0, class77.field1260, arg0 - 5723);
        if (this.field2063 == null) {
            return;
        }
        for (int var5 = 0; var5 < this.field2063.length; var5++) {
            class160 var6 = this.field2063[var5];
            int var7 = var6.field2695;
            int var8 = var6.field2693;
            if (var7 < 0) {
                if (var8 >= 0) {
                    var6.method163((byte) 97, var3, var4);
                }
            } else if (var8 >= 0) {
                var6.method158(-30729, var4, var3);
            } else {
                var6.method160(0, var3, var4);
            }
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lpb;BI)V", line = 2932)
    public final void method20(class70 arg0, byte arg1, int arg2) {
        if (arg2 == 0) {
            this.field2063 = new class160[arg0.method481(0)];
            for (int var4 = 0; var4 < this.field2063.length; var4++) {
                int var5 = arg0.method481(0);
                if (var5 == 0) {
                    this.field2063[var4] = class209.method1504((byte) -42, arg0);
                } else if (var5 == 1) {
                    this.field2063[var4] = class196.method1406((byte) -128, arg0);
                } else if (var5 == 2) {
                    this.field2063[var4] = class90.method658(arg0, (byte) 21);
                } else if (var5 == 3) {
                    this.field2063[var4] = class222.method1560(arg0, false);
                }
            }
        } else if (arg2 == 1) {
            this.field4434 = arg0.method481(0) == 1;
        }
        if (arg1 > -115) {
            field2056 = (class255) null;
        }
        field2067++;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ZI)[[I", line = 3013)
    public final int[][] method13(boolean arg0, int arg1) {
        if (!arg0) {
            method916((byte) -107);
        }
        int[][] var3 = this.field4418.method35(arg1, 113);
        if (this.field4418.field94) {
            int var4 = class92.field1576;
            int var5 = class210.field3590;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = this.field4418.method32(0);
            this.method919(5851, var6);
            for (int var8 = 0; var8 < class210.field3590; var8++) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[1];
                int[] var12 = var10[0];
                int[] var13 = var10[2];
                for (int var14 = 0; var14 < class92.field1576; var14++) {
                    int var15 = var9[var14];
                    var13[var14] = class154.method1134(255, var15) << 4;
                    var11[var14] = class154.method1134(var15 >> 4, 4080);
                    var12[var14] = class154.method1134(var15, 16711680) >> 12;
                }
            }
        }
        field2055++;
        return var3;
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(III)V", line = 3075)
    public static final void method920(int arg0, int arg1, int arg2) {
        int var3 = arg2;
        if (arg2 > 25) {
            var3 = 25;
        }
        if (arg0 != -31723) {
            method921(true);
        }
        arg2--;
        int var4 = class212.field3617[arg2];
        field2068++;
        int var5 = class90.field1535[arg2];
        if (arg1 == 0) {
            class44.field688++;
            class255.field4318.method1523(22260, 198);
            class255.field4318.method463(false, var3 + var3 + 3);
        }
        if (arg1 == 1) {
            class255.field4318.method1523(22260, 184);
            class255.field4318.method463(false, var3 + var3 + 3 + 14);
            class234.field3860++;
        }
        if (arg1 == 2) {
            class255.field4318.method1523(22260, 103);
            class101.field1705++;
            class255.field4318.method463(false, var3 + var3 + 3);
        }
        class255.field4318.method459((byte) -128, class128.field2114[82] ? 1 : 0);
        class255.field4318.method438(class197.field3355 + var4, 255);
        class15.field225 = class90.field1535[0];
        class113.field1918 = class212.field3617[0];
        for (int var6 = 1; var6 < var3; var6++) {
            arg2--;
            class255.field4318.method424(arg0 ^ 0xFFFFE084, class212.field3617[arg2] - var4);
            class255.field4318.method463(false, class90.field1535[arg2] - var5);
        }
        class255.field4318.method462(class268.field4615 + var5, (byte) -61);
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(Z)V", line = 3137)
    public static final void method921(boolean arg0) {
        if (arg0) {
            return;
        }
        field2057++;
        if (class60.field917 != null) {
            class97 var1 = class60.field917;
            synchronized (class60.field917) {
                class60.field917 = null;
            }
        }
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "()V", line = 3160)
    public class124() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(BI)[I", line = 3164)
    public final int[] method21(byte arg0, int arg1) {
        field2064++;
        int var3 = -10 % ((arg0 + 49) / 33);
        int[] var4 = this.field4425.method906(arg1, 8251);
        if (this.field4425.field2043) {
            this.method919(5851, this.field4425.method904(115));
        }
        return var4;
    }
}
