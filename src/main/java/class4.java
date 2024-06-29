import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class4 extends class144 {

    @OriginalMember(owner = "client!ff", name = "p", descriptor = "I")
    public static int field35 = 0;

    @OriginalMember(owner = "client!ff", name = "r", descriptor = "Lhi;")
    private static class82 field37 = class95.method664((byte) -67, "Started 3d Library");

    @OriginalMember(owner = "client!ff", name = "n", descriptor = "Lhi;")
    public static class82 field33 = field37;

    @OriginalMember(owner = "client!ff", name = "o", descriptor = "Lqc;")
    public static class329 field34 = new class329(64);

    @OriginalMember(owner = "client!ff", name = "t", descriptor = "I")
    public static int field39 = 0;

    @OriginalMember(owner = "client!ff", name = "m", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!ff", name = "q", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!ff", name = "s", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)V", line = 4)
    public static void method27(int arg0) {
        field33 = null;
        field34 = null;
        if (arg0 != 3) {
            method27(-27);
        }
        field37 = null;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)V", line = 27)
    public static final void method28(int arg0, int arg1) {
        class227 var2 = class215.method1531(-1, 12, arg0);
        field38++;
        if (arg1 >= -119) {
            method28(-119, 88);
        }
        var2.method1624((byte) -101);
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(B)Z", line = 41)
    public static final boolean method29(byte arg0) throws IOException {
        field36++;
        if (class66.field1036 == null) {
            return false;
        }
        int var1 = class66.field1036.method2088((byte) 91);
        if (var1 == 0) {
            return false;
        }
        if (class187.field3155 == -1) {
            var1--;
            class66.field1036.method2087(1, class35.field545.field2598, 0, (byte) 127);
            class35.field545.field2611 = 0;
            class187.field3155 = class35.field545.method1503(121);
            class199.field3421 = class31.field470[class187.field3155];
        }
        if (class199.field3421 == -1) {
            if (var1 <= 0) {
                return false;
            }
            var1--;
            class66.field1036.method2087(1, class35.field545.field2598, 0, (byte) 127);
            class199.field3421 = class35.field545.field2598[0] & 0xFF;
        }
        if (class199.field3421 == -2) {
            if (var1 <= 1) {
                return false;
            }
            class66.field1036.method2087(2, class35.field545.field2598, 0, (byte) 127);
            var1 -= 2;
            class35.field545.field2611 = 0;
            class199.field3421 = class35.field545.method1090(false);
        }
        if (class199.field3421 > var1) {
            return false;
        }
        int var2 = 14 % ((35 - arg0) / 59);
        class35.field545.field2611 = 0;
        class66.field1036.method2087(class199.field3421, class35.field545.field2598, 0, (byte) 120);
        class220.field3819 = class184.field3129;
        class302.field5152 = 0;
        class184.field3129 = class64.field997;
        class64.field997 = class187.field3155;
        if (class187.field3155 == 95) {
            class22.method149(0);
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 251) {
            int var352 = class35.field545.method1090(false);
            class234.method1664(var352, -34);
            class35.field568[class277.method1935(31, class83.field1479++)] = class277.method1935(var352, 32767);
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 223) {
            int var3 = class35.field545.method1097((byte) -75);
            int var4 = class35.field545.method1078(false);
            class196.method1363(var4, false, var3);
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 65) {
            class330.method2257(0, class35.field545.method1092((byte) 118));
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 138) {
            int var5 = class35.field545.method1105((byte) -20);
            int var6 = class35.field545.method1105((byte) -20);
            int var7 = class35.field545.method1068(-13190);
            class297.field5058 = var6 >> 1;
            class168.field2932.method521((var6 & 0x1) == 1, var7, -1, var5);
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 134) {
            int var8 = class35.field545.method1101(255);
            int var9 = class35.field545.method1052(31521);
            int var10 = class35.field545.method1056(-14275);
            int var11 = class35.field545.method1078(false);
            if (class302.method2091((byte) 70, var11)) {
                class260.method1855(var10, var8, var9, (byte) 113);
            }
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 122) {
            class222.method1571(0);
            class187.field3155 = -1;
            return false;
        } else if (class187.field3155 == 238) {
            class39.method306((byte) -90);
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 116) {
            int var12 = class35.field545.method1078(false);
            if (var12 == 65535) {
                var12 = -1;
            }
            int var13 = class35.field545.method1090(false);
            int var14 = class35.field545.method1089((byte) 65);
            int var15 = class35.field545.method1077(-62);
            if (class302.method2091((byte) 56, var13)) {
                class75 var16 = class282.method1965(var15, (byte) 6);
                if (var16.field1136) {
                    class29.method179(var14, var12, var15, 1);
                    class312 var18 = class273.method1912(var12, -50);
                    class48.method349(var18.field5360, var18.field5363, (byte) 27, var18.field5389, var15);
                    class27.method168(var18.field5377, var15, var18.field5343, var18.field5386, 44);
                } else if (var12 == -1) {
                    var16.field1180 = 0;
                    class187.field3155 = -1;
                    return true;
                } else {
                    class312 var17 = class273.method1912(var12, -126);
                    var16.field1299 = var17.field5360;
                    var16.field1180 = 4;
                    var16.field1167 = var17.field5389;
                    var16.field1164 = var12;
                    var16.field1186 = var17.field5363 * 100 / var14;
                    class138.method937(var16, 16);
                }
            }
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 142) {
            int var19 = class35.field545.method1082(-95);
            int var20 = class35.field545.method1082(-87);
            int var21 = class35.field545.method1082(-55);
            int var22 = class35.field545.method1082(-77);
            int var23 = class35.field545.method1090(false);
            class166.field2910[var19] = true;
            class214.field3735[var19] = var20;
            class22.field304[var19] = var21;
            class242.field4197[var19] = var22;
            class133.field2309[var19] = var23;
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 209) {
            class82 var24 = class35.field545.method1092((byte) 118);
            int var25 = class35.field545.method1076(-49);
            int var26 = class35.field545.method1077(-115);
            if (class302.method2091((byte) 91, var25)) {
                class82.method537(var24, var26, 50);
            }
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 190) {
            int var27 = class35.field545.method1076(-39);
            int var28 = class35.field545.method1100(-32768);
            int var29 = class35.field545.method1068(-13190);
            if (class302.method2091((byte) 104, var28)) {
                if (var29 == 2) {
                    class16.method95(0);
                }
                class255.field4382 = var27;
                class133.method913(false, var27);
                class81.method522(false, false);
                class107.method733(-106, class255.field4382);
                for (int var30 = 0; var30 < 100; var30++) {
                    class276.field4639[var30] = true;
                }
            }
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 19) {
            long var339 = class35.field545.method1067(-1510872160);
            long var341 = (long) class35.field545.method1090(false);
            long var343 = (long) class35.field545.method1107((byte) 82);
            int var345 = class35.field545.method1082(-58);
            boolean var346 = false;
            long var347 = (var341 << 32) + var343;
            int var349 = 0;
            label1581: while (true) {
                if (var349 < 100) {
                    if (class165.field2886[var349] != var347) {
                        var349++;
                        continue;
                    }
                    var346 = true;
                    break;
                }
                if (var345 <= 1) {
                    if ((!class82.field1462 || class317.field5437) && !class289.field4864) {
                        for (int var350 = 0; var350 < class171.field2964; var350++) {
                            if (class144.field2458[var350] == var339) {
                                var346 = true;
                                break label1581;
                            }
                        }
                    } else {
                        var346 = true;
                    }
                }
                break;
            }
            if (!var346 && class298.field5061 == 0) {
                class165.field2886[class88.field1567] = var347;
                class88.field1567 = (class88.field1567 + 1) % 100;
                class82 var351 = class18.method121(class220.method1559(-114, class35.field545).method567((byte) 20));
                if (var345 == 2 || var345 == 3) {
                    class200.method1406(class29.method182(-6039, new class82[] { class35.field560, class56.method388(var339, 0).method553((byte) -80) }), 7, var351, 4);
                } else if (var345 == 1) {
                    class200.method1406(class29.method182(-6039, new class82[] { class137.field2358, class56.method388(var339, 0).method553((byte) -88) }), 7, var351, 4);
                } else {
                    class200.method1406(class56.method388(var339, 0).method553((byte) -67), 3, var351, 4);
                }
            }
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 175) {
            class214.method1529((byte) 41);
            class235.field4091 = class35.field545.method1082(-128);
            class187.field3155 = -1;
            class131.field2271 = class157.field2726;
            return true;
        } else if (class187.field3155 == 136) {
            int var335 = class35.field545.method1076(-90);
            int var336 = class35.field545.method1090(false);
            int var337 = class35.field545.method1090(false);
            int var338 = class35.field545.method1077(-91);
            if (class302.method2091((byte) 67, var336)) {
                class83.method583(-1, var338, (var337 << 16) + var335);
            }
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 194) {
            class60.field943 = class35.field545.method1082(-119);
            class77.field1318 = class35.field545.method1082(-27);
            class91.field1638 = class35.field545.method1082(-70);
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 60) {
            int var31 = class35.field545.method1100(-32768);
            int var32 = class35.field545.method1100(-32768);
            int var33 = class35.field545.method1068(-13190);
            class275 var34 = class99.field1777[var31];
            if (var34 != null) {
                class84.method586(var34, var33, (byte) -29, var32);
            }
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 13) {
            if (class48.field795 != null) {
                class129.method898(false, (byte) 81, -1, -1, class261.field4470);
            }
            byte[] var333 = new byte[class199.field3421];
            class35.field545.method1505(var333, class199.field3421, 0, (byte) -58);
            class82 var334 = class14.method78(class199.field3421, -128, 0, var333);
            if (class261.field4468 == null && class120.field2113 == 3 || !class120.field2119.startsWith("win") || class208.field3655) {
                client.method867(var334, -3576, true);
            } else {
                class207.field3619 = true;
                class15.field127 = var334;
                class300.field5099 = class55.field881.method828((byte) -108, new String(var334.method552(false), "ISO-8859-1"));
            }
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 27) {
            class109.method750(-31878, false);
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 203) {
            class82 var35 = class35.field545.method1092((byte) 118);
            int var36 = class35.field545.method1090(false);
            int var37 = class35.field545.method1090(false);
            if (class302.method2091((byte) 118, var37)) {
                class242.method1735(var36, var35, true);
            }
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 188) {
            class187.field3155 = -1;
            class111.field2008 = 0;
            return true;
        } else if (class187.field3155 == 114) {
            int var322 = class35.field545.method1082(-58);
            int var323 = var322 >> 2;
            int var324 = var322 & 0x3;
            int var325 = class290.field4875[var323];
            int var326 = class35.field545.method1097((byte) -126);
            int var327 = var326 >> 28 & 0x3;
            int var328 = (var326 & 0xFFFDAD7) >> 14;
            int var329 = var326 & 0x3FFF;
            int var330 = class35.field545.method1076(-51);
            if (var330 == 65535) {
                var330 = -1;
            }
            int var331 = var328 - class230.field3976;
            int var332 = var329 - class226.field3916;
            class79.method499(var325, (byte) -65, var331, var327, var324, var330, var323, var332);
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 70) {
            class109.method750(-31878, true);
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 92) {
            int var38 = class35.field545.method1082(-63);
            if (class35.field545.method1082(-29) == 0) {
                class29.field394[var38] = new class106();
            } else {
                class35.field545.field2611--;
                class29.field394[var38] = new class106(class35.field545);
            }
            class187.field3155 = -1;
            class183.field3122 = class157.field2726;
            return true;
        } else if (class187.field3155 == 206) {
            int var39 = class35.field545.method1090(false);
            int var40 = class35.field545.method1097((byte) -57);
            if (class302.method2091((byte) 72, var39)) {
                class146 var41 = (class146) class191.field3195.method507((long) var40, 602425312);
                if (var41 != null) {
                    class117.method797(true, var41, true);
                }
                if (class99.field1789 != null) {
                    class138.method937(class99.field1789, 16);
                    class99.field1789 = null;
                }
            }
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 173) {
            int var42 = class35.field545.method1100(-32768);
            byte var43 = class35.field545.method1086(-93);
            class196.method1363(var42, false, var43);
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 25) {
            class215.method1532((byte) -42, class199.field3421, class35.field545, class55.field881);
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 109) {
            if (class255.field4382 != -1) {
                class143.method976(class255.field4382, 256, 0);
            }
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 156) {
            int var44 = class35.field545.method1072(65280);
            class82 var45 = class35.field545.method1092((byte) 118);
            int var46 = class35.field545.method1072(65280);
            if (var46 >= 1 && var46 <= 8) {
                if (var45.method543(class143.field2438, (byte) 122)) {
                    var45 = null;
                }
                class191.field3191[var46 - 1] = var45;
                class200.field3442[var46 - 1] = var44 == 0;
            }
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 252) {
            class89.field1592 = class35.field545.method1082(-41);
            class232.field4012 = class157.field2726;
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 128) {
            int var318 = class35.field545.method1089((byte) 114);
            int var319 = class35.field545.method1100(-32768);
            int var320 = class35.field545.method1090(false);
            int var321 = class35.field545.method1076(-76);
            if (class302.method2091((byte) 84, var321)) {
                class51.method364(var318, 7, var319 << 16 | var320, true);
            }
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 228) {
            int var47 = class35.field545.method1082(-28);
            int var48 = class35.field545.method1076(-70);
            int var49 = class35.field545.method1090(false);
            if (class302.method2091((byte) 66, var49)) {
                class130.method903((byte) -117, var48, var47);
            }
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 144) {
            class238.field4134 = class35.field545.method1100(-32768) * 30;
            class187.field3155 = -1;
            class131.field2271 = class157.field2726;
            return true;
        } else if (class187.field3155 == 52) {
            int var315 = class35.field545.method1076(-90);
            if (var315 == 65535) {
                var315 = -1;
            }
            int var316 = class35.field545.method1089((byte) 119);
            int var317 = class35.field545.method1076(-36);
            if (class302.method2091((byte) 68, var317)) {
                class51.method364(var316, 1, var315, true);
            }
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 26) {
            class53.method373(0);
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 242) {
            int var50 = class35.field545.method1077(-79);
            int var51 = class35.field545.method1100(-32768);
            int var52 = class35.field545.method1058(597862648);
            if (class302.method2091((byte) 73, var51)) {
                class259.method1845(-115, var52, var50);
            }
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 11) {
            class214.method1529((byte) 47);
            int var53 = class35.field545.method1077(-99);
            int var54 = class35.field545.method1068(-13190);
            int var55 = class35.field545.method1072(65280);
            class208.field3645[var55] = var53;
            class331.field5631[var55] = var54;
            class22.field296[var55] = 1;
            for (int var56 = 0; var56 < 98; var56++) {
                if (class282.field4739[var56] <= var53) {
                    class22.field296[var55] = var56 + 2;
                }
            }
            class93.field1714[class277.method1935(class110.field1980++, 31)] = var55;
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 108) {
            int var312 = class35.field545.method1077(63);
            int var313 = class35.field545.method1078(false);
            int var314 = class35.field545.method1082(-38);
            if (class302.method2091((byte) 63, var313)) {
                class105.method721(7, var314, var312);
            }
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 29) {
            int var57 = class35.field545.method1077(57);
            int var58 = class35.field545.method1078(false);
            int var59 = class35.field545.method1100(-32768);
            if (class302.method2091((byte) 76, var59)) {
                class127.method894(var58, var57, 29728);
            }
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 167) {
            int var60 = class35.field545.method1100(-32768);
            int var61 = class35.field545.method1090(false);
            int var62 = class35.field545.method1101(255);
            if (class302.method2091((byte) 54, var60)) {
                class200.method1404(7406, var61, var62);
            }
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 112) {
            for (int var310 = 0; var310 < class29.field405.length; var310++) {
                if (class29.field405[var310] != null) {
                    class29.field405[var310].field1709 = -1;
                }
            }
            for (int var311 = 0; var311 < class99.field1777.length; var311++) {
                if (class99.field1777[var311] != null) {
                    class99.field1777[var311].field1709 = -1;
                }
            }
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 153) {
            long var296 = class35.field545.method1067(-1510872160);
            boolean var298 = false;
            int var299 = class35.field545.method1090(false);
            if ((Long.MIN_VALUE & var296) != 0L) {
                var298 = true;
            }
            byte var300 = class35.field545.method1104(-1);
            if (var298) {
                if (class80.field1363 == 0) {
                    class187.field3155 = -1;
                    return true;
                }
                long var306 = var296 & Long.MAX_VALUE;
                boolean var308 = false;
                int var309;
                for (var309 = 0; var309 < class80.field1363 && (class157.field2662[var309].field2418 != var306 || class157.field2662[var309].field2209 != var299); var309++) {
                }
                if (class80.field1363 > var309) {
                    while ((class80.field1363 - 1) > var309) {
                        class157.field2662[var309] = class157.field2662[var309 + 1];
                        var309++;
                    }
                    class80.field1363--;
                    class157.field2662[class80.field1363] = null;
                }
            } else {
                class82 var301 = class35.field545.method1092((byte) 118);
                class126 var302 = new class126();
                var302.field2418 = var296;
                var302.field2211 = class56.method388(var302.field2418, 0);
                var302.field2219 = var300;
                var302.field2213 = var301;
                var302.field2209 = var299;
                int var303;
                for (var303 = class80.field1363 - 1; var303 >= 0; var303--) {
                    int var304 = class157.field2662[var303].field2211.method565(-11645, var302.field2211);
                    if (var304 == 0) {
                        class157.field2662[var303].field2209 = var299;
                        class157.field2662[var303].field2219 = var300;
                        class157.field2662[var303].field2213 = var301;
                        if (class9.field71 == var296) {
                            class38.field638 = var300;
                        }
                        class276.field4640 = class157.field2726;
                        class187.field3155 = -1;
                        return true;
                    }
                    if (var304 < 0) {
                        break;
                    }
                }
                if (class80.field1363 >= class157.field2662.length) {
                    class187.field3155 = -1;
                    return true;
                }
                for (int var305 = class80.field1363 - 1; var305 > var303; var305--) {
                    class157.field2662[var305 + 1] = class157.field2662[var305];
                }
                if (class80.field1363 == 0) {
                    class157.field2662 = new class126[100];
                }
                class157.field2662[var303 + 1] = var302;
                class80.field1363++;
                if (class9.field71 == var296) {
                    class38.field638 = var300;
                }
            }
            class187.field3155 = -1;
            class276.field4640 = class157.field2726;
            return true;
        } else if (class187.field3155 == 168) {
            class82 var293 = class35.field545.method1092((byte) 118);
            int var294 = class35.field545.method1100(-32768);
            int var295 = class35.field545.method1078(false);
            if (class302.method2091((byte) 106, var294)) {
                class242.method1735(var295, var293, true);
            }
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 8) {
            int var275 = class35.field545.method1076(-92);
            int var276 = class35.field545.method1100(-32768);
            int var277 = class35.field545.method1078(false);
            int var278 = class35.field545.method1077(73);
            if (var278 >> 30 != 0) {
                int var287 = (var278 & 0x3FFF) - class226.field3916;
                int var288 = (var278 & 0x30278450) >> 28;
                int var289 = (var278 >> 14 & 0x3FFF) - class230.field3976;
                if (var289 >= 0 && var287 >= 0 && var289 < 104 && var287 < 104) {
                    int var290 = var287 * 128 + 64;
                    int var291 = var289 * 128 + 64;
                    class168 var292 = new class168(var276, var288, var291, var290, class21.method145(var291, var290, var288, (byte) -105) - var275, var277, class212.field3708);
                    class60.field947.method1940((byte) 11, new class42(var292));
                }
            } else if ((var278 >> 29) != 0) {
                int var279 = var278 & 0xFFFF;
                class275 var280 = class99.field1777[var279];
                if (var280 != null) {
                    var280.field1715 = var276;
                    var280.field1678 = 0;
                    if (var280.field1715 == 65535) {
                        var280.field1715 = -1;
                    }
                    var280.field1688 = class212.field3708 + var277;
                    if (class212.field3708 < var280.field1688) {
                        var280.field1678 = -1;
                    }
                    var280.field1721 = var275;
                    var280.field1662 = 0;
                    if (var280.field1715 != -1 && class212.field3708 == var280.field1688) {
                        int var281 = class187.method1289(var280.field1715, (byte) 52).field999;
                        if (var281 != -1) {
                            class35 var282 = class284.method1973(var281, false);
                            if (var282 != null && var282.field547 != null) {
                                class205.method1474(var282, false, 0, var280.field1685, var280.field1689, (byte) -83);
                            }
                        }
                    }
                }
            } else if ((var278 >> 28) != 0) {
                int var283 = var278 & 0xFFFF;
                class81 var284;
                if (class109.field1949 == var283) {
                    var284 = class168.field2932;
                } else {
                    var284 = class29.field405[var283];
                }
                if (var284 != null) {
                    var284.field1662 = 0;
                    var284.field1721 = var275;
                    var284.field1715 = var276;
                    var284.field1688 = class212.field3708 + var277;
                    var284.field1678 = 0;
                    if (var284.field1688 > class212.field3708) {
                        var284.field1678 = -1;
                    }
                    if (var284.field1715 == 65535) {
                        var284.field1715 = -1;
                    }
                    if (var284.field1715 != -1 && class212.field3708 == var284.field1688) {
                        int var285 = class187.method1289(var284.field1715, (byte) 62).field999;
                        if (var285 != -1) {
                            class35 var286 = class284.method1973(var285, false);
                            if (var286 != null && var286.field547 != null) {
                                class205.method1474(var286, class168.field2932 == var284, 0, var284.field1685, var284.field1689, (byte) -97);
                            }
                        }
                    }
                }
            }
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 118) {
            class276.field4640 = class157.field2726;
            long var263 = class35.field545.method1067(-1510872160);
            if (var263 == 0L) {
                class80.field1363 = 0;
                class187.field3155 = -1;
                class255.field4384 = null;
                class157.field2662 = null;
                class106.field1888 = null;
                return true;
            }
            long var265 = class35.field545.method1067(-1510872160);
            class255.field4384 = class56.method388(var265, 0);
            class106.field1888 = class56.method388(var263, 0);
            class256.field4403 = class35.field545.method1104(-1);
            int var267 = class35.field545.method1082(-65);
            if (var267 == 255) {
                class187.field3155 = -1;
                return true;
            }
            class80.field1363 = var267;
            class126[] var268 = new class126[100];
            for (int var269 = 0; var269 < class80.field1363; var269++) {
                var268[var269] = new class126();
                var268[var269].field2418 = class35.field545.method1067(-1510872160);
                var268[var269].field2211 = class56.method388(var268[var269].field2418, 0);
                var268[var269].field2209 = class35.field545.method1090(false);
                var268[var269].field2219 = class35.field545.method1104(-1);
                var268[var269].field2213 = class35.field545.method1092((byte) 118);
                if (class9.field71 == var268[var269].field2418) {
                    class38.field638 = var268[var269].field2219;
                }
            }
            boolean var270 = false;
            int var271 = class80.field1363;
            while (var271 > 0) {
                var271--;
                boolean var272 = true;
                for (int var273 = 0; var273 < var271; var273++) {
                    if (var268[var273].field2211.method565(-11645, var268[var273 + 1].field2211) > 0) {
                        class126 var274 = var268[var273];
                        var272 = false;
                        var268[var273] = var268[var273 + 1];
                        var268[var273 + 1] = var274;
                    }
                }
                if (var272) {
                    break;
                }
            }
            class187.field3155 = -1;
            class157.field2662 = var268;
            return true;
        } else if (class187.field3155 == 166) {
            long var63 = class35.field545.method1067(-1510872160);
            int var65 = class35.field545.method1090(false);
            class82 var66 = class280.method1951(var65, 26029).method1347((byte) -114, class35.field545);
            class62.method403(0, class56.method388(var63, 0).method553((byte) -57), (class82) null, 19, var66, var65);
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 74) {
            class82 var222 = class35.field545.method1092((byte) 118);
            if (var222.method564(class180.field3079, (byte) -57)) {
                class82 var258 = var222.method573(0, 81, var222.method563(98, class138.field2370));
                boolean var259 = false;
                long var260 = var258.method568(22476);
                for (int var262 = 0; var262 < class171.field2964; var262++) {
                    if (class144.field2458[var262] == var260) {
                        var259 = true;
                        break;
                    }
                }
                if (!var259 && class298.field5061 == 0) {
                    class200.method1406(var258, 4, class290.field4869, 4);
                }
            } else if (var222.method564(class135.field2337, (byte) -107)) {
                class82 var252 = var222.method573(0, 69, var222.method563(117, class138.field2370));
                boolean var253 = false;
                long var254 = var252.method568(22476);
                for (int var256 = 0; var256 < class171.field2964; var256++) {
                    if (class144.field2458[var256] == var254) {
                        var253 = true;
                        break;
                    }
                }
                if (!var253 && class298.field5061 == 0) {
                    class82 var257 = var222.method573(var222.method563(83, class138.field2370) + 1, 56, var222.method535(true) - 9);
                    class200.method1406(var252, 8, var257, 4);
                }
            } else if (var222.method564(class257.field4426, (byte) -99)) {
                class82 var247 = var222.method573(0, 127, var222.method563(122, class138.field2370));
                long var248 = var247.method568(22476);
                boolean var250 = false;
                for (int var251 = 0; var251 < class171.field2964; var251++) {
                    if (class144.field2458[var251] == var248) {
                        var250 = true;
                        break;
                    }
                }
                if (!var250 && class298.field5061 == 0) {
                    class200.method1406(var247, 10, class129.field2247, 4);
                }
            } else if (var222.method564(class329.field5615, (byte) -98)) {
                class82 var246 = var222.method573(0, 59, var222.method563(116, class329.field5615));
                class200.method1406(class129.field2247, 11, var246, 4);
            } else if (var222.method564(class276.field4643, (byte) -87)) {
                class82 var223 = var222.method573(0, 78, var222.method563(116, class276.field4643));
                if (class298.field5061 == 0) {
                    class200.method1406(class129.field2247, 12, var223, 4);
                }
            } else if (var222.method564(class99.field1778, (byte) -99)) {
                class82 var245 = var222.method573(0, 79, var222.method563(94, class99.field1778));
                if (class298.field5061 == 0) {
                    class200.method1406(class129.field2247, 13, var245, 4);
                }
            } else if (var222.method564(class23.field316, (byte) -67)) {
                class82 var224 = var222.method573(0, 55, var222.method563(80, class138.field2370));
                long var225 = var224.method568(22476);
                boolean var227 = false;
                for (int var228 = 0; var228 < class171.field2964; var228++) {
                    if (class144.field2458[var228] == var225) {
                        var227 = true;
                        break;
                    }
                }
                if (!var227 && class298.field5061 == 0) {
                    class200.method1406(var224, 14, class129.field2247, 4);
                }
            } else if (var222.method564(class202.field3481, (byte) -111)) {
                class82 var240 = var222.method573(0, 54, var222.method563(81, class138.field2370));
                long var241 = var240.method568(22476);
                boolean var243 = false;
                for (int var244 = 0; var244 < class171.field2964; var244++) {
                    if (class144.field2458[var244] == var241) {
                        var243 = true;
                        break;
                    }
                }
                if (!var243 && class298.field5061 == 0) {
                    class200.method1406(var240, 15, class129.field2247, 4);
                }
            } else if (var222.method564(class127.field2226, (byte) -49)) {
                class82 var229 = var222.method573(0, 113, var222.method563(119, class138.field2370));
                boolean var230 = false;
                long var231 = var229.method568(22476);
                for (int var233 = 0; var233 < class171.field2964; var233++) {
                    if (class144.field2458[var233] == var231) {
                        var230 = true;
                        break;
                    }
                }
                if (!var230 && class298.field5061 == 0) {
                    class200.method1406(var229, 16, class129.field2247, 4);
                }
            } else if (var222.method564(class175.field3034, (byte) -91)) {
                class82 var234 = var222.method573(0, 81, var222.method563(114, class138.field2370));
                boolean var235 = false;
                long var236 = var234.method568(22476);
                for (int var238 = 0; var238 < class171.field2964; var238++) {
                    if (class144.field2458[var238] == var236) {
                        var235 = true;
                        break;
                    }
                }
                if (!var235 && class298.field5061 == 0) {
                    class82 var239 = var222.method573(var222.method563(85, class138.field2370) + 1, 123, var222.method535(true) - 9);
                    class200.method1406(var234, 21, var239, 4);
                }
            } else {
                class200.method1406(class129.field2247, 0, var222, 4);
            }
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 247) {
            long var67 = class35.field545.method1067(-1510872160);
            class35.field545.method1104(-1);
            boolean var69 = false;
            long var70 = class35.field545.method1067(-1510872160);
            long var72 = (long) class35.field545.method1090(false);
            long var74 = (long) class35.field545.method1107((byte) 82);
            int var76 = class35.field545.method1082(-112);
            int var77 = class35.field545.method1090(false);
            long var78 = (var72 << 32) + var74;
            int var80 = 0;
            label1131: while (true) {
                if (var80 < 100) {
                    if (class165.field2886[var80] != var78) {
                        var80++;
                        continue;
                    }
                    var69 = true;
                    break;
                }
                if (var76 <= 1) {
                    for (int var81 = 0; var81 < class171.field2964; var81++) {
                        if (class144.field2458[var81] == var67) {
                            var69 = true;
                            break label1131;
                        }
                    }
                }
                break;
            }
            if (!var69 && class298.field5061 == 0) {
                class165.field2886[class88.field1567] = var78;
                class88.field1567 = (class88.field1567 + 1) % 100;
                class82 var82 = class280.method1951(var77, 26029).method1347((byte) -60, class35.field545);
                if (var76 == 2 || var76 == 3) {
                    class62.method403(0, class29.method182(-6039, new class82[] { class35.field560, class56.method388(var67, 0).method553((byte) -71) }), class56.method388(var70, 0).method553((byte) -103), 20, var82, var77);
                } else if (var76 == 1) {
                    class62.method403(0, class29.method182(-6039, new class82[] { class137.field2358, class56.method388(var67, 0).method553((byte) -64) }), class56.method388(var70, 0).method553((byte) -128), 20, var82, var77);
                } else {
                    class62.method403(0, class56.method388(var67, 0).method553((byte) -85), class56.method388(var70, 0).method553((byte) -124), 20, var82, var77);
                }
            }
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 43 || class187.field3155 == 24 || class187.field3155 == 193 || class187.field3155 == 211 || class187.field3155 == 98 || class187.field3155 == 76 || class187.field3155 == 46 || class187.field3155 == 121 || class187.field3155 == 210 || class187.field3155 == 163 || class187.field3155 == 255 || class187.field3155 == 49) {
            class159.method1152(true);
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 214) {
            int var83 = class35.field545.method1082(-106);
            int var84 = class35.field545.method1082(-85);
            int var85 = class35.field545.method1090(false);
            int var86 = class35.field545.method1082(-69);
            int var87 = class35.field545.method1082(-29);
            class285.method1980(var85, var84, var86, var87, var83, 128);
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 20) {
            class31.method246(class35.field545, (byte) -120);
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 237) {
            class214.method1529((byte) 118);
            class325.field5580 = class35.field545.method1052(31521);
            class187.field3155 = -1;
            class131.field2271 = class157.field2726;
            return true;
        } else if (class187.field3155 == 88) {
            long var208 = class35.field545.method1067(-1510872160);
            long var210 = (long) class35.field545.method1090(false);
            long var212 = (long) class35.field545.method1107((byte) 82);
            int var214 = class35.field545.method1082(-64);
            int var215 = class35.field545.method1090(false);
            long var216 = (var210 << 32) + var212;
            boolean var218 = false;
            int var219 = 0;
            label1325: while (true) {
                if (var219 < 100) {
                    if (class165.field2886[var219] != var216) {
                        var219++;
                        continue;
                    }
                    var218 = true;
                    break;
                }
                if (var214 <= 1) {
                    for (int var220 = 0; var220 < class171.field2964; var220++) {
                        if (class144.field2458[var220] == var208) {
                            var218 = true;
                            break label1325;
                        }
                    }
                }
                break;
            }
            if (!var218 && class298.field5061 == 0) {
                class165.field2886[class88.field1567] = var216;
                class88.field1567 = (class88.field1567 + 1) % 100;
                class82 var221 = class280.method1951(var215, 26029).method1347((byte) -89, class35.field545);
                if (var214 == 2) {
                    class62.method403(0, class29.method182(-6039, new class82[] { class35.field560, class56.method388(var208, 0).method553((byte) -112) }), (class82) null, 18, var221, var215);
                } else if (var214 == 1) {
                    class62.method403(0, class29.method182(-6039, new class82[] { class137.field2358, class56.method388(var208, 0).method553((byte) -81) }), (class82) null, 18, var221, var215);
                } else {
                    class62.method403(0, class56.method388(var208, 0).method553((byte) -112), (class82) null, 18, var221, var215);
                }
            }
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 204) {
            long var88 = class35.field545.method1067(-1510872160);
            int var90 = class35.field545.method1090(false);
            int var91 = class35.field545.method1082(-105);
            boolean var92 = true;
            class82 var93 = class129.field2247;
            if (var90 > 0) {
                var93 = class35.field545.method1092((byte) 118);
            }
            if (var88 < 0L) {
                var92 = false;
                var88 &= Long.MAX_VALUE;
            }
            class82 var94 = class56.method388(var88, 0).method553((byte) -64);
            for (int var95 = 0; var95 < class90.field1632; var95++) {
                if (class107.field1903[var95] == var88) {
                    if (class139.field2386[var95] != var90) {
                        class139.field2386[var95] = var90;
                        if (var90 > 0) {
                            class200.method1406(class129.field2247, 5, class29.method182(-6039, new class82[] { var94, class307.field5235 }), 4);
                        }
                        if (var90 == 0) {
                            class200.method1406(class129.field2247, 5, class29.method182(-6039, new class82[] { var94, class80.field1365 }), 4);
                        }
                    }
                    var94 = null;
                    class198.field3390[var95] = var93;
                    class317.field5436[var95] = var91;
                    class160.field2780[var95] = var92;
                    break;
                }
            }
            if (var94 != null && class90.field1632 < 200) {
                class107.field1903[class90.field1632] = var88;
                class222.field3882[class90.field1632] = var94;
                class139.field2386[class90.field1632] = var90;
                class198.field3390[class90.field1632] = var93;
                class317.field5436[class90.field1632] = var91;
                class160.field2780[class90.field1632] = var92;
                class90.field1632++;
            }
            class232.field4012 = class157.field2726;
            int var96 = class90.field1632;
            boolean var97 = false;
            while (var96 > 0) {
                var96--;
                boolean var98 = true;
                for (int var99 = 0; var99 < var96; var99++) {
                    if (class139.field2386[var99] != class47.field786 && class139.field2386[var99 + 1] == class47.field786 || class139.field2386[var99] == 0 && class139.field2386[var99 + 1] != 0) {
                        var98 = false;
                        int var100 = class139.field2386[var99];
                        class139.field2386[var99] = class139.field2386[var99 + 1];
                        class139.field2386[var99 + 1] = var100;
                        class82 var101 = class198.field3390[var99];
                        class198.field3390[var99] = class198.field3390[var99 + 1];
                        class198.field3390[var99 + 1] = var101;
                        class82 var102 = class222.field3882[var99];
                        class222.field3882[var99] = class222.field3882[var99 + 1];
                        class222.field3882[var99 + 1] = var102;
                        long var103 = class107.field1903[var99];
                        class107.field1903[var99] = class107.field1903[var99 + 1];
                        class107.field1903[var99 + 1] = var103;
                        int var105 = class317.field5436[var99];
                        class317.field5436[var99] = class317.field5436[var99 + 1];
                        class317.field5436[var99 + 1] = var105;
                        boolean var106 = class160.field2780[var99];
                        class160.field2780[var99] = class160.field2780[var99 + 1];
                        class160.field2780[var99 + 1] = var106;
                    }
                }
                if (var98) {
                    break;
                }
            }
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 89) {
            class47.method343((byte) -48);
            class214.method1529((byte) 27);
            class44.field766 += 32;
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 103) {
            class92.field1647 = class35.field545.method1082(-90);
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 47) {
            long var107 = class35.field545.method1067(-1510872160);
            class82 var109 = class18.method121(class220.method1559(-119, class35.field545).method567((byte) 20));
            class200.method1406(class56.method388(var107, 0).method553((byte) -72), 6, var109, 4);
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 80) {
            class92.field1645 = class35.field545.method1082(-94);
            class230.field3969 = class35.field545.method1082(-121);
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 181) {
            int var110 = class35.field545.method1089((byte) 95);
            int var111 = class35.field545.method1076(-118);
            int var112 = class35.field545.method1076(-82);
            if (class302.method2091((byte) 72, var111)) {
                class130.method903((byte) -51, var112, var110);
            }
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 3) {
            class171.field2964 = class199.field3421 / 8;
            for (int var207 = 0; var207 < class171.field2964; var207++) {
                class144.field2458[var207] = class35.field545.method1067(-1510872160);
                class157.field2736[var207] = class56.method388(class144.field2458[var207], 0);
            }
            class232.field4012 = class157.field2726;
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 132) {
            int var113 = class35.field545.method1090(false);
            int var114 = class35.field545.method1089((byte) 88);
            class87.method607(var113, var114, -1);
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 149) {
            int var115 = class35.field545.method1090(false);
            if (var115 == 65535) {
                var115 = -1;
            }
            int var116 = class35.field545.method1082(-108);
            int var117 = class35.field545.method1090(false);
            class222.method1588((byte) 85, var117, var116, var115);
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 169) {
            int var205 = class35.field545.method1072(65280);
            int var206 = class35.field545.method1076(-80);
            class87.method607(var206, var205, -1);
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 48) {
            if (class199.field3421 == 0) {
                class143.field2442 = class249.field4302;
            } else {
                class143.field2442 = class35.field545.method1092((byte) 118);
            }
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 191) {
            int var202 = class35.field545.method1101(255);
            class75 var203 = class282.method1965(var202, (byte) 6);
            for (int var204 = 0; var204 < var203.field1170.length; var204++) {
                var203.field1170[var204] = -1;
                var203.field1170[var204] = 0;
            }
            class138.method937(var203, 16);
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 2) {
            for (int var201 = 0; var201 < class312.field5398.length; var201++) {
                if (class330.field5623[var201] != class312.field5398[var201]) {
                    class312.field5398[var201] = class330.field5623[var201];
                    class181.method1265(var201, (byte) 116);
                    class29.field395[class277.method1935(31, class44.field766++)] = var201;
                }
            }
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 222) {
            int var118 = class35.field545.method1089((byte) 101);
            int var119 = class35.field545.method1090(false);
            if (class302.method2091((byte) 117, var119)) {
                int var120 = 0;
                if (class168.field2932.field1404 != null) {
                    var120 = class168.field2932.field1404.method1393(-1651847158);
                }
                class51.method364(var118, 3, var120, true);
            }
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 148) {
            int var198 = class35.field545.method1100(-32768);
            int var199 = class35.field545.method1090(false);
            if (var199 == 65535) {
                var199 = -1;
            }
            int var200 = class35.field545.method1097((byte) -57);
            if (class302.method2091((byte) 67, var198)) {
                class51.method364(var200, 2, var199, true);
            }
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 73) {
            int var191 = class35.field545.method1077(-44);
            int var192 = class35.field545.method1076(-96);
            int var193 = class35.field545.method1089((byte) 119);
            if (class302.method2091((byte) 51, var192)) {
                class146 var194 = (class146) class191.field3195.method507((long) var193, 602425312);
                class146 var195 = (class146) class191.field3195.method507((long) var191, 602425312);
                if (var195 != null) {
                    class117.method797(true, var195, var194 == null || var194.field2474 != var195.field2474);
                }
                if (var194 != null) {
                    var194.method961((byte) 66);
                    class191.field3195.method503((long) var191, -87, var194);
                }
                class75 var196 = class282.method1965(var193, (byte) 6);
                if (var196 != null) {
                    class138.method937(var196, 16);
                }
                class75 var197 = class282.method1965(var191, (byte) 6);
                if (var197 != null) {
                    class138.method937(var197, 16);
                    class177.method1253((byte) -55, var197, true);
                }
                if (class255.field4382 != -1) {
                    class143.method976(class255.field4382, 256, 1);
                }
            }
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 7) {
            int var121 = class35.field545.method1076(-63);
            int var122 = class35.field545.method1076(-85);
            int var123 = class35.field545.method1097((byte) -117);
            int var124 = class35.field545.method1072(65280);
            if (class302.method2091((byte) 61, var121)) {
                class146 var125 = (class146) class191.field3195.method507((long) var123, 602425312);
                if (var125 != null) {
                    class117.method797(true, var125, var125.field2474 != var122);
                }
                class25.method160(var123, (byte) -128, var122, var124);
            }
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 123) {
            int var186 = class35.field545.method1090(false);
            class82 var187 = class35.field545.method1092((byte) 118);
            Object[] var188 = new Object[var187.method535(true) + 1];
            for (int var189 = var187.method535(true) - 1; var189 >= 0; var189--) {
                if (var187.method551(var189, (byte) -116) == 115) {
                    var188[var189 + 1] = class35.field545.method1092((byte) 118);
                } else {
                    var188[var189 + 1] = Integer.valueOf(class35.field545.method1097((byte) -70));
                }
            }
            var188[0] = Integer.valueOf(class35.field545.method1097((byte) -113));
            if (class302.method2091((byte) 94, var186)) {
                class331 var190 = new class331();
                var190.field5635 = var188;
                class15.method92(var190, -113);
            }
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 131) {
            int var126 = class35.field545.method1090(false);
            int var127 = class35.field545.method1100(-32768);
            class226.field3915 = var127;
            class219.field3804 = var126;
            class109.method748(70);
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 45) {
            int var185 = class35.field545.method1076(-81);
            if (var185 == 65535) {
                var185 = -1;
            }
            class203.method1426(var185, true);
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 37) {
            int var128 = class35.field545.method1076(-46);
            int var129 = class35.field545.method1085(-16);
            if (var128 == 65535) {
                var128 = -1;
            }
            class5.method30(var128, var129, 1);
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 221) {
            long var170 = class35.field545.method1067(-1510872160);
            class35.field545.method1104(-1);
            long var172 = class35.field545.method1067(-1510872160);
            long var174 = (long) class35.field545.method1090(false);
            long var176 = (long) class35.field545.method1107((byte) 82);
            int var178 = class35.field545.method1082(-99);
            long var179 = (var174 << 32) + var176;
            boolean var181 = false;
            int var182 = 0;
            label1255: while (true) {
                if (var182 < 100) {
                    if (class165.field2886[var182] != var179) {
                        var182++;
                        continue;
                    }
                    var181 = true;
                    break;
                }
                if (var178 <= 1) {
                    if ((!class82.field1462 || class317.field5437) && !class289.field4864) {
                        for (int var183 = 0; var183 < class171.field2964; var183++) {
                            if (class144.field2458[var183] == var170) {
                                var181 = true;
                                break label1255;
                            }
                        }
                    } else {
                        var181 = true;
                    }
                }
                break;
            }
            if (!var181 && class298.field5061 == 0) {
                class165.field2886[class88.field1567] = var179;
                class88.field1567 = (class88.field1567 + 1) % 100;
                class82 var184 = class18.method121(class220.method1559(-119, class35.field545).method567((byte) 20));
                if (var178 == 2 || var178 == 3) {
                    class286.method1986(var184, class56.method388(var172, 0).method553((byte) -88), 1, 9, class29.method182(-6039, new class82[] { class35.field560, class56.method388(var170, 0).method553((byte) -119) }));
                } else if (var178 == 1) {
                    class286.method1986(var184, class56.method388(var172, 0).method553((byte) -80), 1, 9, class29.method182(-6039, new class82[] { class137.field2358, class56.method388(var170, 0).method553((byte) -74) }));
                } else {
                    class286.method1986(var184, class56.method388(var172, 0).method553((byte) -126), 1, 9, class56.method388(var170, 0).method553((byte) -65));
                }
            }
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 137) {
            int var130 = class35.field545.method1090(false);
            int var131 = class35.field545.method1100(-32768);
            int var132 = class35.field545.method1077(-65);
            int var133 = class35.field545.method1090(false);
            int var134 = class35.field545.method1100(-32768);
            if (class302.method2091((byte) 80, var131)) {
                class48.method349(var134, var130, (byte) 27, var133, var132);
            }
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 155) {
            class92.field1645 = class35.field545.method1072(65280);
            class230.field3969 = class35.field545.method1068(-13190);
            for (int var167 = class92.field1645; var167 < class92.field1645 + 8; var167++) {
                for (int var168 = class230.field3969; var168 < (class230.field3969 + 8); var168++) {
                    if (class107.field1889[class297.field5058][var167][var168] != null) {
                        class107.field1889[class297.field5058][var167][var168] = null;
                        class122.method837(var167, (byte) 83, var168);
                    }
                }
            }
            for (class181 var169 = (class181) class68.field1055.method1936(16173); var169 != null; var169 = (class181) class68.field1055.method1926((byte) 90)) {
                if (class92.field1645 <= var169.field3085 && (class92.field1645 + 8) > var169.field3085 && var169.field3087 >= class230.field3969 && (class230.field3969 + 8) > var169.field3087 && class297.field5058 == var169.field3093) {
                    var169.field3099 = 0;
                }
            }
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 159) {
            int var166 = class35.field545.method1097((byte) -85);
            class75.field1300 = class55.field881.method826((byte) -10, var166);
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 186) {
            int var135 = class35.field545.method1082(-80);
            int var136 = var135 >> 6;
            class84 var137 = new class84();
            var137.field1506 = var135 & 0x3F;
            var137.field1516 = class35.field545.method1082(-87);
            if (var137.field1516 >= 0 && var137.field1516 < class290.field4872.length) {
                if (var137.field1506 == 1 || var137.field1506 == 10) {
                    var137.field1494 = class35.field545.method1090(false);
                    class35.field545.field2611 += 3;
                } else if (var137.field1506 >= 2 && var137.field1506 <= 6) {
                    if (var137.field1506 == 2) {
                        var137.field1493 = 64;
                        var137.field1517 = 64;
                    }
                    if (var137.field1506 == 3) {
                        var137.field1493 = 0;
                        var137.field1517 = 64;
                    }
                    if (var137.field1506 == 4) {
                        var137.field1517 = 64;
                        var137.field1493 = 128;
                    }
                    if (var137.field1506 == 5) {
                        var137.field1493 = 64;
                        var137.field1517 = 0;
                    }
                    if (var137.field1506 == 6) {
                        var137.field1517 = 128;
                        var137.field1493 = 64;
                    }
                    var137.field1506 = 2;
                    var137.field1518 = class35.field545.method1090(false);
                    var137.field1495 = class35.field545.method1090(false);
                    var137.field1510 = class35.field545.method1082(-53);
                }
                var137.field1507 = class35.field545.method1090(false);
                if (var137.field1507 == 65535) {
                    var137.field1507 = -1;
                }
                class101.field1804[var136] = var137;
            }
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 61) {
            int var138 = class35.field545.method1097((byte) -73);
            int var139 = class35.field545.method1089((byte) 64);
            int var140 = class35.field545.method1078(false);
            if (var140 == 65535) {
                var140 = -1;
            }
            int var141 = class35.field545.method1078(false);
            int var142 = class35.field545.method1090(false);
            if (var142 == 65535) {
                var142 = -1;
            }
            if (class302.method2091((byte) 68, var141)) {
                for (int var143 = var142; var143 <= var140; var143++) {
                    long var144 = ((long) var138 << 32) + (long) var143;
                    class141 var146 = class68.field1057.method507(var144, 602425312);
                    if (var146 != null) {
                        var146.method961((byte) 79);
                    }
                    class68.field1057.method503(var144, -52, new class259(var139));
                }
            }
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 56) {
            class92.field1645 = class35.field545.method1082(-91);
            class230.field3969 = class35.field545.method1082(-110);
            while (class35.field545.field2611 < class199.field3421) {
                class187.field3155 = class35.field545.method1082(-32);
                class159.method1152(true);
            }
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 40) {
            int var147 = class35.field545.method1097((byte) -59);
            int var148 = class35.field545.method1090(false);
            if (var147 < -70000) {
                var148 += 32768;
            }
            class75 var149;
            if (var147 < 0) {
                var149 = null;
            } else {
                var149 = class282.method1965(var147, (byte) 6);
            }
            while (class199.field3421 > class35.field545.field2611) {
                int var150 = 0;
                int var151 = class35.field545.method1050(-32768);
                int var152 = class35.field545.method1090(false);
                if (var152 != 0) {
                    var150 = class35.field545.method1082(-79);
                    if (var150 == 255) {
                        var150 = class35.field545.method1097((byte) -77);
                    }
                }
                if (var149 != null && var151 >= 0 && var149.field1170.length > var151) {
                    var149.field1170[var151] = var152;
                    var149.field1144[var151] = var150;
                }
                class32.method249((byte) -112, var150, var151, var152 - 1, var148);
            }
            if (var149 != null) {
                class138.method937(var149, 16);
            }
            class214.method1529((byte) 43);
            class35.field568[class277.method1935(31, class83.field1479++)] = class277.method1935(var148, 32767);
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 36) {
            int var158 = class35.field545.method1097((byte) -65);
            int var159 = class35.field545.method1090(false);
            if (var158 < -70000) {
                var159 += 32768;
            }
            class75 var160;
            if (var158 < 0) {
                var160 = null;
            } else {
                var160 = class282.method1965(var158, (byte) 6);
            }
            if (var160 != null) {
                for (int var161 = 0; var161 < var160.field1170.length; var161++) {
                    var160.field1170[var161] = 0;
                    var160.field1144[var161] = 0;
                }
            }
            class27.method171(0, var159);
            int var162 = class35.field545.method1090(false);
            for (int var163 = 0; var163 < var162; var163++) {
                int var164 = class35.field545.method1100(-32768);
                int var165 = class35.field545.method1105((byte) -20);
                if (var165 == 255) {
                    var165 = class35.field545.method1101(255);
                }
                if (var160 != null && var163 < var160.field1170.length) {
                    var160.field1170[var163] = var164;
                    var160.field1144[var163] = var165;
                }
                class32.method249((byte) -116, var165, var163, var164 - 1, var159);
            }
            if (var160 != null) {
                class138.method937(var160, 16);
            }
            class214.method1529((byte) 50);
            class35.field568[class277.method1935(31, class83.field1479++)] = class277.method1935(32767, var159);
            class187.field3155 = -1;
            return true;
        } else if (class187.field3155 == 57) {
            int var153 = class35.field545.method1082(-46);
            int var154 = class35.field545.method1082(-89);
            int var155 = class35.field545.method1090(false);
            int var156 = class35.field545.method1082(-93);
            int var157 = class35.field545.method1082(-117);
            class150.method1035(-80, var153, var155, true, var157, var154, var156);
            class187.field3155 = -1;
            return true;
        } else {
            class48.method348(-2, "T1 - " + class187.field3155 + "," + class184.field3129 + "," + class220.field3819 + " - " + class199.field3421, (Throwable) null);
            class222.method1571(0);
            return true;
        }
    }
}
