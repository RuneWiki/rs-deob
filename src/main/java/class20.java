import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class20 {

    @OriginalMember(owner = "client!ak", name = "n", descriptor = "Lqe;")
    private class298 field316 = new class298();

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "I")
    private int field303;

    @OriginalMember(owner = "client!ak", name = "p", descriptor = "I")
    private int field318;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "Lfl;")
    private class86 field305;

    @OriginalMember(owner = "client!ak", name = "r", descriptor = "Lok;")
    public static class41 field320 = class137.method956("Lade Liste der Welten", 45);

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "Z")
    public static boolean field309 = false;

    @OriginalMember(owner = "client!ak", name = "s", descriptor = "Lok;")
    private static class41 field321 = class137.method956("Loading wordpack )2 ", 45);

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "Lok;")
    public static class41 field312 = field321;

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!ak", name = "m", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!ak", name = "o", descriptor = "I")
    public static int field317;

    @OriginalMember(owner = "client!ak", name = "q", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!ak", name = "t", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!ak", name = "u", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "Lcd;")
    public static class36 field313;

    @OriginalMember(owner = "client!ak", name = "l", descriptor = "Lmh;")
    public static class65 field314;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V", line = 7)
    public static void method130(int arg0) {
        field320 = null;
        field312 = null;
        if (arg0 >= -95) {
            method133((byte) -98);
        }
        field313 = null;
        field321 = null;
        field314 = null;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(I)V", line = 21)
    public final void method131(int arg0) {
        field306++;
        this.field316.method2054((byte) 53);
        if (arg0 == -2) {
            this.field305.method615(15968);
            this.field318 = this.field303;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(JLjava/lang/Object;I)V", line = 35)
    public final void method132(long arg0, Object arg1, int arg2) {
        field310++;
        this.method139(arg0, 124);
        if (this.field318 == 0) {
            class221 var5 = (class221) this.field316.method2059(false);
            var5.method418(6971);
            var5.method11(true);
        } else {
            this.field318--;
        }
        class181 var6 = new class181(arg1);
        if (arg2 != -1) {
            this.method138(2, -8);
        }
        this.field305.method610(arg2 + 105, var6, arg0);
        this.field316.method2055(var6, 35);
        var6.field41 = 0L;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)V", line = 68)
    public static final void method133(byte arg0) {
        int var1 = -30 % ((arg0 + 18) / 46);
        field304++;
        class35.field527.method131(-2);
        class289.field4692.method131(-2);
        class81.field1190.method131(-2);
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(I)I", line = 84)
    public static final int method134(int arg0) {
        if (arg0 >= -51) {
            method134(99);
        }
        field311++;
        return 16;
    }

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "(I)V", line = 101)
    public final void method135(int arg0) {
        if (arg0 != 18436) {
            return;
        }
        for (class221 var2 = (class221) this.field316.method2057(55); var2 != null; var2 = (class221) this.field316.method2058(false)) {
            if (var2.method709((byte) -60)) {
                var2.method418(6971);
                var2.method11(true);
                this.field318++;
            }
        }
        field308++;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(JZ)Ljava/lang/Object;", line = 128)
    public final Object method136(long arg0, boolean arg1) {
        class221 var4 = (class221) this.field305.method617(arg0, false);
        field319++;
        if (var4 == null) {
            return null;
        }
        if (!arg1) {
            field312 = (class41) null;
        }
        Object var5 = var4.method710((byte) -109);
        if (var5 == null) {
            var4.method418(6971);
            var4.method11(true);
            this.field318++;
            return null;
        }
        if (var4.method709((byte) -115)) {
            class181 var6 = new class181(var5);
            this.field305.method610(86, var6, var4.field844);
            this.field316.method2055(var6, 67);
            var6.field41 = 0L;
            var4.method418(6971);
            var4.method11(true);
        } else {
            this.field316.method2055(var4, 96);
            var4.field41 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "(I)Z", line = 176)
    public static final boolean method137(int arg0) throws IOException {
        field322++;
        if (class118.field1724 == null) {
            return false;
        }
        int var1 = class118.field1724.method1571(1);
        if (var1 == 0) {
            return false;
        }
        if (class116.field1679 == -1) {
            var1--;
            class118.field1724.method1575(1, 14574, 0, class164.field2597.field1607);
            class164.field2597.field1640 = 0;
            class116.field1679 = class164.field2597.method846(arg0 - 859717996);
            class1.field7 = class92.field1326[class116.field1679];
        }
        if (class1.field7 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class118.field1724.method1575(1, 14574, 0, class164.field2597.field1607);
            class1.field7 = class164.field2597.field1607[0] & 0xFF;
            var1--;
        }
        if (class1.field7 == -2) {
            if (var1 <= 1) {
                return false;
            }
            class118.field1724.method1575(2, 14574, 0, class164.field2597.field1607);
            class164.field2597.field1640 = 0;
            var1 -= 2;
            class1.field7 = class164.field2597.method759((byte) -80);
        }
        if (var1 < class1.field7) {
            return false;
        }
        class164.field2597.field1640 = 0;
        class118.field1724.method1575(class1.field7, 14574, 0, class164.field2597.field1607);
        class57.field816 = 0;
        class295.field4770 = class131.field1962;
        class131.field1962 = class162.field2573;
        class162.field2573 = class116.field1679;
        if (class116.field1679 == 78) {
            class171.method1221((byte) 64, true);
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 106) {
            class68.method495((byte) -120);
            class236.field3790 = class164.field2597.method771(-111);
            class284.field4613 = class33.field493;
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 123) {
            int var345 = class164.field2597.method781((byte) 124);
            int var346 = class164.field2597.method775(56);
            int var347 = class164.field2597.method781((byte) 99);
            if (class73.method538(var346, false)) {
                class187 var348 = (class187) class113.field1658.method617((long) var345, false);
                class187 var349 = (class187) class113.field1658.method617((long) var347, false);
                if (var349 != null) {
                    class206.method1457(var349, (byte) 127, var348 == null || var348.field3052 != var349.field3052);
                }
                if (var348 != null) {
                    var348.method418(arg0 ^ 0x333E585B);
                    class113.field1658.method610(86, var348, (long) var347);
                }
                class302 var350 = class165.method1157(false, var345);
                if (var350 != null) {
                    class18.method91(28515, var350);
                }
                class302 var351 = class165.method1157(false, var347);
                if (var351 != null) {
                    class18.method91(28515, var351);
                    class148.method1027(var351, (byte) -118, true);
                }
                if (class136.field2015 != -1) {
                    class228.method1635(1, class136.field2015, arg0 ^ 0x333E4377);
                }
            }
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 0) {
            int var2 = class164.field2597.method759((byte) -72);
            class41 var3 = class164.field2597.method763(true);
            int var4 = class164.field2597.method798((byte) 112);
            if (class73.method538(var4, false)) {
                class232.method1653(59, var2, var3);
            }
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 171) {
            class35.method235(class164.field2597, class138.field2065, false, class1.field7);
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 12) {
            int var344 = class164.field2597.method779(-27100);
            class138.field2075 = class138.field2065.method1478(false, var344);
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 98) {
            long var340 = class164.field2597.method768((byte) 92);
            int var342 = class164.field2597.method759((byte) -109);
            class41 var343 = class195.method1397((byte) -83, var342).method1242(arg0 - 859718496, class164.field2597);
            class107.method728(201, class235.method1690(var340, (byte) -125).method288((byte) -118), var342, var343, 19, (class41) null);
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 100) {
            long var5 = class164.field2597.method768((byte) 92);
            class41 var7 = class253.method1797(class119.method850(-2, class164.field2597).method315((byte) 32));
            class262.method1843(var7, 6, class235.method1690(var5, (byte) -124).method288((byte) -126), arg0 ^ 0x333E4352);
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 240) {
            class225.field3607 = class33.field493;
            long var328 = class164.field2597.method768((byte) 92);
            if (var328 == 0L) {
                class116.field1679 = -1;
                class15.field196 = null;
                class88.field1299 = 0;
                class271.field4379 = null;
                class152.field2422 = null;
                return true;
            }
            long var330 = class164.field2597.method768((byte) 92);
            class152.field2422 = class235.method1690(var330, (byte) 109);
            class15.field196 = class235.method1690(var328, (byte) 91);
            class2.field33 = class164.field2597.method785((byte) -128);
            int var332 = class164.field2597.method792(2);
            if (var332 == 255) {
                class116.field1679 = -1;
                return true;
            }
            class88.field1299 = var332;
            class283[] var333 = new class283[100];
            for (int var334 = 0; var334 < class88.field1299; var334++) {
                var333[var334] = new class283();
                var333[var334].field844 = class164.field2597.method768((byte) 92);
                var333[var334].field4595 = class235.method1690(var333[var334].field844, (byte) -128);
                var333[var334].field4593 = class164.field2597.method759((byte) -113);
                var333[var334].field4597 = class164.field2597.method785((byte) -107);
                var333[var334].field4592 = class164.field2597.method763(true);
                if (class205.field3324 == var333[var334].field844) {
                    class302.field4899 = var333[var334].field4597;
                }
            }
            boolean var335 = false;
            int var336 = class88.field1299;
            while (var336 > 0) {
                boolean var337 = true;
                var336--;
                for (int var338 = 0; var338 < var336; var338++) {
                    if (var333[var338].field4595.method292((byte) -85, var333[var338 + 1].field4595) > 0) {
                        class283 var339 = var333[var338];
                        var337 = false;
                        var333[var338] = var333[var338 + 1];
                        var333[var338 + 1] = var339;
                    }
                }
                if (var337) {
                    break;
                }
            }
            class271.field4379 = var333;
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 139) {
            class238.method1705(arg0 - 859718562);
            class116.field1679 = -1;
            return false;
        } else if (class116.field1679 == 34) {
            class9.field126 = class164.field2597.method792(2);
            class127.field1882 = class164.field2597.method792(2);
            class273.field4454 = class164.field2597.method792(2);
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 161) {
            int var8 = class164.field2597.method792(2);
            int var9 = class164.field2597.method792(2);
            int var10 = class164.field2597.method792(arg0 ^ 0x333E4362);
            int var11 = class164.field2597.method792(2);
            int var12 = class164.field2597.method759((byte) -66);
            class234.field3730[var8] = true;
            class91.field1320[var8] = var9;
            class124.field1839[var8] = var10;
            class242.field3866[var8] = var11;
            class192.field3103[var8] = var12;
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 145) {
            int var321 = class164.field2597.method779(-27100);
            int var322 = class164.field2597.method816(false);
            int var323 = class164.field2597.method798((byte) -13);
            int var324 = class164.field2597.method798((byte) 126);
            if (var324 == 65535) {
                var324 = -1;
            }
            if (class73.method538(var323, false)) {
                class302 var325 = class165.method1157(false, var322);
                if (var325.field4964) {
                    class164.method1151(var324, var322, 9, var321);
                    class138 var326 = class130.method918(var324, -113);
                    class228.method1634(true, var326.field2119, var326.field2059, var326.field2101, var322);
                    class44.method327(-25077, var322, var326.field2074, var326.field2067, var326.field2127);
                } else if (var324 == -1) {
                    class116.field1679 = -1;
                    var325.field4909 = 0;
                    return true;
                } else {
                    class138 var327 = class130.method918(var324, -117);
                    var325.field4889 = var327.field2059;
                    var325.field5009 = var327.field2119;
                    var325.field5048 = var327.field2101 * 100 / var321;
                    var325.field4909 = 4;
                    var325.field4968 = var324;
                    class18.method91(28515, var325);
                }
            }
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 64) {
            int var320 = class164.field2597.method792(2);
            if (class164.field2597.method792(2) == 0) {
                class28.field423[var320] = new class282();
            } else {
                class164.field2597.field1640--;
                class28.field423[var320] = new class282(class164.field2597);
            }
            class24.field369 = class33.field493;
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 208) {
            int var315 = class164.field2597.method798((byte) 110);
            int var316 = class164.field2597.method782((byte) -110);
            int var317 = class164.field2597.method810(26873);
            int var318 = class164.field2597.method808(255);
            if (class73.method538(var318, false)) {
                class187 var319 = (class187) class113.field1658.method617((long) var316, false);
                if (var319 != null) {
                    class206.method1457(var319, (byte) 127, var319.field3052 != var315);
                }
                class176.method1257((byte) -114, var316, var315, var317);
            }
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 109) {
            int var13 = class164.field2597.method798((byte) 126);
            int var14 = class164.field2597.method782((byte) -124);
            int var15 = class164.field2597.method808(255);
            int var16 = class164.field2597.method759((byte) -111);
            if (class73.method538(var15, false)) {
                class57.method399(arg0 - 859718496, var14, var13 | var16 << 16, 7);
            }
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 20) {
            byte var313 = class164.field2597.method785((byte) -106);
            int var314 = class164.field2597.method798((byte) 102);
            class314.method2175(arg0 - 859718492, var313, var314);
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 99) {
            if (class1.field7 == 0) {
                class26.field384 = class224.field3584;
            } else {
                class26.field384 = class164.field2597.method763(true);
            }
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 166) {
            int var17 = class164.field2597.method781((byte) 98);
            int var18 = class164.field2597.method808(255);
            if (class73.method538(var18, false)) {
                int var19 = 0;
                if (class62.field913.field3946 != null) {
                    var19 = class62.field913.field3946.method503(305419896);
                }
                class57.method399(0, var17, var19, 3);
            }
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 111) {
            int var20 = class164.field2597.method792(2);
            int var21 = class164.field2597.method792(2);
            int var22 = class164.field2597.method759((byte) -58);
            int var23 = class164.field2597.method792(2);
            int var24 = class164.field2597.method792(arg0 - 859718494);
            class33.method229(var20, var24, var22, var21, (byte) 104, var23);
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 133) {
            class68.method494(1);
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 134 || class116.field1679 == 248 || class116.field1679 == 68 || class116.field1679 == 233 || class116.field1679 == 253 || class116.field1679 == 135 || class116.field1679 == 38 || class116.field1679 == 187 || class116.field1679 == 127 || class116.field1679 == 196 || class116.field1679 == 10 || class116.field1679 == 43) {
            class13.method55(4447);
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 225) {
            class68.method495((byte) -116);
            int var309 = class164.field2597.method781((byte) 115);
            int var310 = class164.field2597.method810(arg0 - 859691623);
            int var311 = class164.field2597.method793(-89);
            class85.field1246[var311] = var309;
            class206.field3340[var311] = var310;
            class64.field938[var311] = 1;
            for (int var312 = 0; var312 < 98; var312++) {
                if (var309 >= class304.field5066[var312]) {
                    class64.field938[var311] = var312 + 2;
                }
            }
            class162.field2575[class217.method1563(class128.field1904++, 31)] = var311;
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 255) {
            int var25 = class164.field2597.method793(-113);
            int var26 = class164.field2597.method798((byte) -39);
            int var27 = class164.field2597.method775(22);
            if (class73.method538(var26, false)) {
                class32.method221(var27, var25, arg0 ^ 0x333E4339);
            }
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 96) {
            class116.field1679 = -1;
            class124.field1846 = 0;
            return true;
        } else if (class116.field1679 == 86) {
            int var306 = class164.field2597.method810(arg0 - 859691623);
            class41 var307 = class164.field2597.method763(true);
            int var308 = class164.field2597.method792(2);
            if (var306 >= 1 && var306 <= 8) {
                if (var307.method306(class129.field1918, 27080)) {
                    var307 = null;
                }
                class240.field3843[var306 - 1] = var307;
                class265.field4206[var306 - 1] = var308 == 0;
            }
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 195) {
            int var298 = class164.field2597.method779(arg0 - 859745596);
            int var299 = class164.field2597.method759((byte) -100);
            if (var298 < -70000) {
                var299 += 32768;
            }
            class302 var300;
            if (var298 >= 0) {
                var300 = class165.method1157(false, var298);
            } else {
                var300 = null;
            }
            if (var300 != null) {
                for (int var301 = 0; var301 < var300.field5011.length; var301++) {
                    var300.field5011[var301] = 0;
                    var300.field5023[var301] = 0;
                }
            }
            class250.method1772(1, var299);
            int var302 = class164.field2597.method759((byte) -102);
            for (int var303 = 0; var303 < var302; var303++) {
                int var304 = class164.field2597.method793(-100);
                if (var304 == 255) {
                    var304 = class164.field2597.method781((byte) 110);
                }
                int var305 = class164.field2597.method808(255);
                if (var300 != null && var303 < var300.field5011.length) {
                    var300.field5011[var303] = var305;
                    var300.field5023[var303] = var304;
                }
                class226.method1622(var299, var304, var305 - 1, (byte) -96, var303);
            }
            if (var300 != null) {
                class18.method91(28515, var300);
            }
            class68.method495((byte) -115);
            class171.field2769[class217.method1563(class129.field1909++, 31)] = class217.method1563(var299, 32767);
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 212) {
            int var296 = class164.field2597.method793(-112);
            int var297 = class164.field2597.method798((byte) 104);
            class79.method568(var296, 28984, var297);
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 156) {
            class171.method1221((byte) 64, false);
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 66) {
            int var285 = class164.field2597.method782((byte) -127);
            int var286 = (var285 & 0x3284E908) >> 28;
            int var287 = var285 & 0x3FFF;
            int var288 = (var285 & 0xFFFDCA3) >> 14;
            int var289 = class164.field2597.method775(82);
            int var290 = class164.field2597.method793(-95);
            int var291 = var287 - class55.field809;
            int var292 = var290 >> 2;
            int var293 = class310.field5229[var292];
            if (var289 == 65535) {
                var289 = -1;
            }
            int var294 = var290 & 0x3;
            int var295 = var288 - class88.field1300;
            class101.method708(var289, var292, var293, 69, var286, var291, var295, var294);
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 232) {
            int var281 = class164.field2597.method815(255);
            int var282 = class164.field2597.method798((byte) -9);
            int var283 = class164.field2597.method808(arg0 - 859718241);
            if (class73.method538(var283, false)) {
                if (var281 == 2) {
                    class184.method1336(25);
                }
                class136.field2015 = var282;
                class181.method1299((byte) -49, var282);
                class16.method75(false, false);
                class83.method587(class136.field2015, arg0 - 859709515);
                for (int var284 = 0; var284 < 100; var284++) {
                    class195.field3151[var284] = true;
                }
            }
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 224) {
            int var278 = class164.field2597.method792(2);
            class162 var279 = new class162();
            var279.field2584 = var278 & 0x3F;
            var279.field2583 = class164.field2597.method792(2);
            int var280 = var278 >> 6;
            if (var279.field2583 >= 0 && var279.field2583 < class277.field4538.length) {
                if (var279.field2584 == 1 || var279.field2584 == 10) {
                    var279.field2571 = class164.field2597.method759((byte) -128);
                    class164.field2597.field1640 += 3;
                } else if (var279.field2584 >= 2 && var279.field2584 <= 6) {
                    if (var279.field2584 == 2) {
                        var279.field2579 = 64;
                        var279.field2574 = 64;
                    }
                    if (var279.field2584 == 3) {
                        var279.field2579 = 64;
                        var279.field2574 = 0;
                    }
                    if (var279.field2584 == 4) {
                        var279.field2574 = 128;
                        var279.field2579 = 64;
                    }
                    if (var279.field2584 == 5) {
                        var279.field2574 = 64;
                        var279.field2579 = 0;
                    }
                    if (var279.field2584 == 6) {
                        var279.field2574 = 64;
                        var279.field2579 = 128;
                    }
                    var279.field2584 = 2;
                    var279.field2577 = class164.field2597.method759((byte) -112);
                    var279.field2580 = class164.field2597.method759((byte) -118);
                    var279.field2581 = class164.field2597.method792(2);
                }
                var279.field2576 = class164.field2597.method759((byte) -55);
                if (var279.field2576 == 65535) {
                    var279.field2576 = -1;
                }
                class35.field529[var280] = var279;
            }
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 205) {
            long var28 = class164.field2597.method768((byte) 92);
            long var30 = (long) class164.field2597.method759((byte) -115);
            long var32 = (long) class164.field2597.method757(11997);
            int var34 = class164.field2597.method792(arg0 ^ 0x333E4362);
            int var35 = class164.field2597.method759((byte) -55);
            long var36 = (var30 << 32) + var32;
            boolean var38 = false;
            int var39 = 0;
            label1119: while (true) {
                if (var39 < 100) {
                    if (class111.field1577[var39] != var36) {
                        var39++;
                        continue;
                    }
                    var38 = true;
                    break;
                }
                if (var34 <= 1) {
                    for (int var40 = 0; var40 < class281.field4576; var40++) {
                        if (class273.field4436[var40] == var28) {
                            var38 = true;
                            break label1119;
                        }
                    }
                }
                break;
            }
            if (!var38 && class194.field3136 == 0) {
                class111.field1577[class162.field2582] = var36;
                class162.field2582 = (class162.field2582 + 1) % 100;
                class41 var41 = class195.method1397((byte) -110, var35).method1242(0, class164.field2597);
                if (var34 == 2) {
                    class107.method728(arg0 ^ 0x333E43A9, class187.method1346(new class41[] { class67.field1015, class235.method1690(var28, (byte) -125).method288((byte) -123) }, arg0 - 859718496), var35, var41, 18, (class41) null);
                } else if (var34 == 1) {
                    class107.method728(201, class187.method1346(new class41[] { class161.field2555, class235.method1690(var28, (byte) -126).method288((byte) -123) }, arg0 - 859718496), var35, var41, 18, (class41) null);
                } else {
                    class107.method728(arg0 - 859718295, class235.method1690(var28, (byte) 110).method288((byte) -125), var35, var41, 18, (class41) null);
                }
            }
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 213) {
            int var275 = class164.field2597.method782((byte) -118);
            int var276 = class164.field2597.method798((byte) -111);
            int var277 = class164.field2597.method775(-114);
            if (class73.method538(var276, false)) {
                class32.method221(var277, var275, -108);
            }
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 82) {
            int var272 = class164.field2597.method781((byte) 107);
            int var273 = class164.field2597.method775(arg0 - 859718370);
            int var274 = class164.field2597.method789(arg0 ^ 0xCCC1BC9E);
            if (class73.method538(var273, false)) {
                class251.method1777(var272, (byte) -106, var274);
            }
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 57) {
            class311.method2152(65482, class164.field2597.method763(true));
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 41) {
            int var42 = class164.field2597.method779(-27100);
            int var43 = class164.field2597.method775(-111);
            class79.method568(var42, 28984, var43);
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 39) {
            int var263 = class164.field2597.method775(-113);
            int var264 = class164.field2597.method781((byte) 114);
            int var265 = class164.field2597.method782((byte) -127);
            if (var263 == 65535) {
                var263 = -1;
            }
            int var266 = class164.field2597.method775(-111);
            int var267 = class164.field2597.method798((byte) -12);
            if (var267 == 65535) {
                var267 = -1;
            }
            if (class73.method538(var266, false)) {
                for (int var268 = var263; var268 <= var267; var268++) {
                    long var269 = ((long) var264 << 32) + ((long) var268);
                    class59 var271 = class292.field4723.method617(var269, false);
                    if (var271 != null) {
                        var271.method418(arg0 - 859711525);
                    }
                    class292.field4723.method610(86, new class55(var265), var269);
                }
            }
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 192) {
            class38.field586 = class164.field2597.method808(arg0 ^ 0x333E439F) * 30;
            class116.field1679 = -1;
            class284.field4613 = class33.field493;
            return true;
        } else if (class116.field1679 == 59) {
            int var44 = class164.field2597.method775(62);
            int var45 = class164.field2597.method759((byte) -43);
            class8.field101 = var44;
            class286.field4658 = var45;
            class140.method978((byte) -70);
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 184) {
            int var46 = class164.field2597.method759((byte) -73);
            class41 var47 = class164.field2597.method763(true);
            Object[] var48 = new Object[var47.method275(false) + 1];
            for (int var49 = var47.method275(false) - 1; var49 >= 0; var49--) {
                if (var47.method281(var49, (byte) -16) == 115) {
                    var48[var49 + 1] = class164.field2597.method763(true);
                } else {
                    var48[var49 + 1] = Integer.valueOf(class164.field2597.method779(-27100));
                }
            }
            var48[0] = Integer.valueOf(class164.field2597.method779(-27100));
            if (class73.method538(var46, false)) {
                class73 var50 = new class73();
                var50.field1083 = var48;
                class161.method1141(var50, true);
            }
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 203) {
            class226.method1624(arg0 - 859726340);
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 1) {
            int var51 = class164.field2597.method809(255);
            int var52 = class164.field2597.method816(false);
            int var53 = class164.field2597.method759((byte) -43);
            int var54 = class164.field2597.method806(true);
            if (class73.method538(var53, false)) {
                class238.method1703(false, var54, var52, var51);
            }
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 217) {
            int var259 = class164.field2597.method808(255);
            int var260 = class164.field2597.method779(-27100);
            int var261 = class164.field2597.method798((byte) -56);
            int var262 = class164.field2597.method759((byte) -99);
            if (class73.method538(var259, false)) {
                class297.method2050(var260, (var261 << 16) + var262, 2012);
            }
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 148) {
            int var256 = class164.field2597.method798((byte) 106);
            int var257 = class164.field2597.method779(-27100);
            int var258 = class164.field2597.method759((byte) -116);
            if (class73.method538(var258, false)) {
                class240.method1719(var257, (byte) 56, var256);
            }
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 157) {
            class74.method545((byte) -56, class164.field2597);
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 246) {
            int var253 = class164.field2597.method779(-27100);
            class302 var254 = class165.method1157(false, var253);
            for (int var255 = 0; var255 < var254.field5011.length; var255++) {
                var254.field5011[var255] = -1;
                var254.field5011[var255] = 0;
            }
            class18.method91(arg0 ^ 0x333E2C03, var254);
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 121) {
            class51.method355((byte) -124);
            class68.method495((byte) 119);
            class237.field3802 += 32;
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 130) {
            if (class136.field2015 != -1) {
                class228.method1635(0, class136.field2015, 23);
            }
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 214) {
            int var250 = class164.field2597.method775(34);
            if (var250 == 65535) {
                var250 = -1;
            }
            int var251 = class164.field2597.method775(106);
            int var252 = class164.field2597.method781((byte) 126);
            if (class73.method538(var251, false)) {
                class57.method399(0, var252, var250, 2);
            }
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 227) {
            class68.method495((byte) -112);
            class266.field4231 = class164.field2597.method792(2);
            class116.field1679 = -1;
            class284.field4613 = class33.field493;
            return true;
        } else if (class116.field1679 == 94) {
            int var55 = class164.field2597.method759((byte) -123);
            int var56 = class164.field2597.method779(-27100);
            if (class73.method538(var55, false)) {
                class187 var57 = (class187) class113.field1658.method617((long) var56, false);
                if (var57 != null) {
                    class206.method1457(var57, (byte) 126, true);
                }
                if (class109.field1526 != null) {
                    class18.method91(28515, class109.field1526);
                    class109.field1526 = null;
                }
            }
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 73) {
            int var247 = class164.field2597.method782((byte) -112);
            int var248 = class164.field2597.method759((byte) -43);
            int var249 = class164.field2597.method759((byte) -121);
            if (var249 == 65535) {
                var249 = -1;
            }
            if (class73.method538(var248, false)) {
                class57.method399(0, var247, var249, 1);
            }
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 55) {
            long var58 = class164.field2597.method768((byte) 92);
            long var60 = (long) class164.field2597.method759((byte) -103);
            long var62 = (long) class164.field2597.method757(11997);
            long var64 = (var60 << 32) + var62;
            int var66 = class164.field2597.method792(arg0 ^ 0x333E4362);
            boolean var67 = false;
            int var68 = 0;
            label1150: while (true) {
                if (var68 < 100) {
                    if (class111.field1577[var68] != var64) {
                        var68++;
                        continue;
                    }
                    var67 = true;
                    break;
                }
                if (var66 <= 1) {
                    if ((!class164.field2595 || class62.field907) && !class169.field2696) {
                        for (int var69 = 0; var69 < class281.field4576; var69++) {
                            if (class273.field4436[var69] == var58) {
                                var67 = true;
                                break label1150;
                            }
                        }
                    } else {
                        var67 = true;
                    }
                }
                break;
            }
            if (!var67 && class194.field3136 == 0) {
                class111.field1577[class162.field2582] = var64;
                class162.field2582 = (class162.field2582 + 1) % 100;
                class41 var70 = class253.method1797(class119.method850(arg0 - 859718498, class164.field2597).method315((byte) 32));
                if (var66 == 2 || var66 == 3) {
                    class262.method1843(var70, 7, class187.method1346(new class41[] { class67.field1015, class235.method1690(var58, (byte) 116).method288((byte) -121) }, 0), 123);
                } else if (var66 == 1) {
                    class262.method1843(var70, 7, class187.method1346(new class41[] { class161.field2555, class235.method1690(var58, (byte) 118).method288((byte) -128) }, 0), 46);
                } else {
                    class262.method1843(var70, 3, class235.method1690(var58, (byte) -126).method288((byte) -127), 58);
                }
            }
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 201) {
            class295.field4769 = class164.field2597.method810(26873);
            class176.field2867 = class164.field2597.method792(2);
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 113) {
            class295.field4769 = class164.field2597.method793(arg0 ^ 0xCCC1BCF5);
            class176.field2867 = class164.field2597.method792(arg0 - 859718494);
            while (class1.field7 > class164.field2597.field1640) {
                class116.field1679 = class164.field2597.method792(2);
                class13.method55(arg0 ^ 0x333E523F);
            }
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 37) {
            long var232 = class164.field2597.method768((byte) 92);
            class164.field2597.method785((byte) -116);
            long var234 = class164.field2597.method768((byte) 92);
            long var236 = (long) class164.field2597.method759((byte) -29);
            long var238 = (long) class164.field2597.method757(11997);
            long var240 = (var236 << 32) + var238;
            int var242 = class164.field2597.method792(2);
            boolean var243 = false;
            int var244 = 0;
            label1405: while (true) {
                if (var244 >= 100) {
                    if (var242 <= 1) {
                        if ((!class164.field2595 || class62.field907) && !class169.field2696) {
                            for (int var245 = 0; var245 < class281.field4576; var245++) {
                                if (class273.field4436[var245] == var232) {
                                    var243 = true;
                                    break label1405;
                                }
                            }
                        } else {
                            var243 = true;
                        }
                    }
                    break;
                }
                if (class111.field1577[var244] == var240) {
                    var243 = true;
                    break;
                }
                var244++;
            }
            if (!var243 && class194.field3136 == 0) {
                class111.field1577[class162.field2582] = var240;
                class162.field2582 = (class162.field2582 + 1) % 100;
                class41 var246 = class253.method1797(class119.method850(arg0 ^ 0xCCC1BC9E, class164.field2597).method315((byte) 32));
                if (var242 == 2 || var242 == 3) {
                    class14.method64((byte) -115, class235.method1690(var234, (byte) -127).method288((byte) -123), var246, class187.method1346(new class41[] { class67.field1015, class235.method1690(var232, (byte) 103).method288((byte) -119) }, arg0 ^ 0x333E4360), 9);
                } else if (var242 == 1) {
                    class14.method64((byte) 82, class235.method1690(var234, (byte) -3).method288((byte) -127), var246, class187.method1346(new class41[] { class161.field2555, class235.method1690(var232, (byte) -126).method288((byte) -126) }, 0), 9);
                } else {
                    class14.method64((byte) -128, class235.method1690(var234, (byte) 18).method288((byte) -120), var246, class235.method1690(var232, (byte) 124).method288((byte) -123), 9);
                }
            }
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 207) {
            int var71 = class164.field2597.method781((byte) 98);
            int var72 = class164.field2597.method792(2);
            int var73 = class164.field2597.method775(arg0 - 859718621);
            if (class73.method538(var73, false)) {
                class185.method1339(false, var72, var71);
            }
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 204) {
            long var213 = class164.field2597.method768((byte) 92);
            int var215 = class164.field2597.method759((byte) -104);
            int var216 = class164.field2597.method792(arg0 ^ 0x333E4362);
            class41 var217 = class266.field4233;
            boolean var218 = true;
            if (var215 > 0) {
                var217 = class164.field2597.method763(true);
            }
            if (var213 < 0L) {
                var218 = false;
                var213 &= Long.MAX_VALUE;
            }
            class41 var219 = class235.method1690(var213, (byte) 74).method288((byte) -122);
            for (int var220 = 0; var220 < class118.field1741; var220++) {
                if (class65.field1001[var220] == var213) {
                    if (class159.field2496[var220] != var215) {
                        class159.field2496[var220] = var215;
                        if (var215 > 0) {
                            class262.method1843(class187.method1346(new class41[] { var219, class187.field3047 }, 0), 5, class266.field4233, arg0 - 859718388);
                        }
                        if (var215 == 0) {
                            class262.method1843(class187.method1346(new class41[] { var219, class218.field3512 }, 0), 5, class266.field4233, 101);
                        }
                    }
                    var219 = null;
                    class278.field4547[var220] = var217;
                    class109.field1521[var220] = var216;
                    class238.field3813[var220] = var218;
                    break;
                }
            }
            boolean var221 = false;
            if (var219 != null && class118.field1741 < 200) {
                class65.field1001[class118.field1741] = var213;
                class78.field1147[class118.field1741] = var219;
                class159.field2496[class118.field1741] = var215;
                class278.field4547[class118.field1741] = var217;
                class109.field1521[class118.field1741] = var216;
                class238.field3813[class118.field1741] = var218;
                class118.field1741++;
            }
            class275.field4508 = class33.field493;
            int var222 = class118.field1741;
            while (var222 > 0) {
                var222--;
                boolean var223 = true;
                for (int var224 = 0; var224 < var222; var224++) {
                    if (class159.field2496[var224] != class218.field3495 && class159.field2496[var224 + 1] == class218.field3495 || class159.field2496[var224] == 0 && class159.field2496[var224 + 1] != 0) {
                        int var225 = class159.field2496[var224];
                        class159.field2496[var224] = class159.field2496[var224 + 1];
                        var223 = false;
                        class159.field2496[var224 + 1] = var225;
                        class41 var226 = class278.field4547[var224];
                        class278.field4547[var224] = class278.field4547[var224 + 1];
                        class278.field4547[var224 + 1] = var226;
                        class41 var227 = class78.field1147[var224];
                        class78.field1147[var224] = class78.field1147[var224 + 1];
                        class78.field1147[var224 + 1] = var227;
                        long var228 = class65.field1001[var224];
                        class65.field1001[var224] = class65.field1001[var224 + 1];
                        class65.field1001[var224 + 1] = var228;
                        int var230 = class109.field1521[var224];
                        class109.field1521[var224] = class109.field1521[var224 + 1];
                        class109.field1521[var224 + 1] = var230;
                        boolean var231 = class238.field3813[var224];
                        class238.field3813[var224] = class238.field3813[var224 + 1];
                        class238.field3813[var224 + 1] = var231;
                    }
                }
                if (var223) {
                    break;
                }
            }
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 29) {
            int var208 = class164.field2597.method792(2);
            int var209 = class164.field2597.method792(2);
            int var210 = class164.field2597.method759((byte) -108);
            int var211 = class164.field2597.method792(2);
            int var212 = class164.field2597.method792(2);
            class41.method296(-7057, var208, true, var210, var209, var211, var212);
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 228) {
            int var74 = class164.field2597.method793(-122);
            int var75 = class164.field2597.method792(arg0 ^ 0x333E4362);
            int var76 = class164.field2597.method793(arg0 - 859718595);
            class55.field807 = var75 >> 1;
            class62.field913.method1756(var76, var74, (var75 & 0x1) == 1, -1);
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 104) {
            int var205 = class164.field2597.method759((byte) -64);
            if (var205 == 65535) {
                var205 = -1;
            }
            int var206 = class164.field2597.method792(2);
            int var207 = class164.field2597.method759((byte) -78);
            class201.method1431(var205, var206, var207, arg0 - 859726181);
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 136) {
            class289.field4697 = class164.field2597.method792(2);
            class275.field4508 = class33.field493;
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 163) {
            for (int var203 = 0; var203 < class246.field3955.length; var203++) {
                if (class246.field3955[var203] != null) {
                    class246.field3955[var203].field4300 = -1;
                }
            }
            for (int var204 = 0; var204 < class216.field3471.length; var204++) {
                if (class216.field3471[var204] != null) {
                    class216.field3471[var204].field4300 = -1;
                }
            }
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 85) {
            class41 var77 = class164.field2597.method763(true);
            if (var77.method310(arg0 - 859718637, class169.field2695)) {
                class41 var113 = var77.method308(var77.method305(arg0 ^ 0xCCC1BCA9, class288.field4675), 0, 99);
                long var114 = var113.method291((byte) 65);
                boolean var116 = false;
                for (int var117 = 0; var117 < class281.field4576; var117++) {
                    if (class273.field4436[var117] == var114) {
                        var116 = true;
                        break;
                    }
                }
                if (!var116 && class194.field3136 == 0) {
                    class262.method1843(class285.field4630, 4, var113, 100);
                }
            } else if (var77.method310(-141, class234.field3742)) {
                class41 var78 = var77.method308(var77.method305(-62, class288.field4675), 0, arg0 - 859718578);
                long var79 = var78.method291((byte) 65);
                boolean var81 = false;
                for (int var82 = 0; var82 < class281.field4576; var82++) {
                    if (class273.field4436[var82] == var79) {
                        var81 = true;
                        break;
                    }
                }
                if (!var81 && class194.field3136 == 0) {
                    class41 var83 = var77.method308(var77.method275(false) - 9, var77.method305(-65, class288.field4675) - -1, arg0 ^ 0xCCC1BCD5);
                    class262.method1843(var83, 8, var78, 120);
                }
            } else if (var77.method310(arg0 - 859718637, class199.field3191)) {
                class41 var84 = var77.method308(var77.method305(-74, class288.field4675), 0, arg0 ^ 0xCCC1BCA0);
                long var85 = var84.method291((byte) 65);
                boolean var87 = false;
                for (int var88 = 0; var88 < class281.field4576; var88++) {
                    if (class273.field4436[var88] == var85) {
                        var87 = true;
                        break;
                    }
                }
                if (!var87 && class194.field3136 == 0) {
                    class262.method1843(class266.field4233, 10, var84, 52);
                }
            } else if (var77.method310(-141, class207.field3348)) {
                class41 var89 = var77.method308(var77.method305(arg0 ^ 0xCCC1BCA5, class207.field3348), 0, arg0 - 859718532);
                class262.method1843(var89, 11, class266.field4233, 88);
            } else if (var77.method310(-141, class311.field5261)) {
                class41 var90 = var77.method308(var77.method305(-56, class311.field5261), 0, 123);
                if (class194.field3136 == 0) {
                    class262.method1843(var90, 12, class266.field4233, 100);
                }
            } else if (var77.method310(-141, class141.field2168)) {
                class41 var91 = var77.method308(var77.method305(-80, class141.field2168), 0, 118);
                if (class194.field3136 == 0) {
                    class262.method1843(var91, 13, class266.field4233, 119);
                }
            } else if (var77.method310(arg0 - 859718637, class112.field1657)) {
                class41 var92 = var77.method308(var77.method305(-92, class288.field4675), 0, -51);
                boolean var93 = false;
                long var94 = var92.method291((byte) 65);
                for (int var96 = 0; var96 < class281.field4576; var96++) {
                    if (class273.field4436[var96] == var94) {
                        var93 = true;
                        break;
                    }
                }
                if (!var93 && class194.field3136 == 0) {
                    class262.method1843(class266.field4233, 14, var92, 88);
                }
            } else if (var77.method310(arg0 - 859718637, class295.field4771)) {
                class41 var97 = var77.method308(var77.method305(arg0 - 859718587, class288.field4675), 0, arg0 - 859718556);
                long var98 = var97.method291((byte) 65);
                boolean var100 = false;
                for (int var101 = 0; var101 < class281.field4576; var101++) {
                    if (class273.field4436[var101] == var98) {
                        var100 = true;
                        break;
                    }
                }
                if (!var100 && class194.field3136 == 0) {
                    class262.method1843(class266.field4233, 15, var97, 73);
                }
            } else if (var77.method310(-141, class18.field240)) {
                class41 var102 = var77.method308(var77.method305(arg0 ^ 0xCCC1BCC4, class288.field4675), 0, -86);
                boolean var103 = false;
                long var104 = var102.method291((byte) 65);
                for (int var106 = 0; var106 < class281.field4576; var106++) {
                    if (class273.field4436[var106] == var104) {
                        var103 = true;
                        break;
                    }
                }
                if (!var103 && class194.field3136 == 0) {
                    class262.method1843(class266.field4233, 16, var102, 97);
                }
            } else if (var77.method310(-141, class297.field4817)) {
                class41 var107 = var77.method308(var77.method305(-56, class288.field4675), 0, arg0 - 859718540);
                long var108 = var107.method291((byte) 65);
                boolean var110 = false;
                for (int var111 = 0; var111 < class281.field4576; var111++) {
                    if (class273.field4436[var111] == var108) {
                        var110 = true;
                        break;
                    }
                }
                if (!var110 && class194.field3136 == 0) {
                    class41 var112 = var77.method308(var77.method275(false) - 9, var77.method305(-98, class288.field4675) + 1, arg0 ^ 0xCCC1BC84);
                    class262.method1843(var112, 21, var107, 76);
                }
            } else {
                class262.method1843(var77, 0, class266.field4233, 50);
            }
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 155) {
            int var118 = class164.field2597.method798((byte) -124);
            class41 var119 = class164.field2597.method763(true);
            int var120 = class164.field2597.method782((byte) -115);
            if (class73.method538(var118, false)) {
                class305.method2095(var119, var120, 3);
            }
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 45) {
            int var201 = class164.field2597.method779(arg0 - 859745596);
            int var202 = class164.field2597.method798((byte) -29);
            class314.method2175(4, var201, var202);
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 164) {
            int var195 = class164.field2597.method779(-27100);
            int var196 = class164.field2597.method759((byte) -73);
            if (var195 < -70000) {
                var196 += 32768;
            }
            class302 var197;
            if (var195 < 0) {
                var197 = null;
            } else {
                var197 = class165.method1157(false, var195);
            }
            while (class164.field2597.field1640 < class1.field7) {
                int var198 = class164.field2597.method756(arg0 ^ 0x333E4304);
                int var199 = class164.field2597.method759((byte) -85);
                int var200 = 0;
                if (var199 != 0) {
                    var200 = class164.field2597.method792(arg0 ^ 0x333E4362);
                    if (var200 == 255) {
                        var200 = class164.field2597.method779(arg0 ^ 0xCCC1D544);
                    }
                }
                if (var197 != null && var198 >= 0 && var197.field5011.length > var198) {
                    var197.field5011[var198] = var199;
                    var197.field5023[var198] = var200;
                }
                class226.method1622(var196, var200, var199 - 1, (byte) -118, var198);
            }
            if (var197 != null) {
                class18.method91(28515, var197);
            }
            class68.method495((byte) -120);
            class171.field2769[class217.method1563(31, class129.field1909++)] = class217.method1563(32767, var196);
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 126) {
            class176.field2867 = class164.field2597.method792(2);
            class295.field4769 = class164.field2597.method810(26873);
            for (int var121 = class176.field2867; var121 < class176.field2867 + 8; var121++) {
                for (int var122 = class295.field4769; var122 < class295.field4769 + 8; var122++) {
                    if (class81.field1199[class55.field807][var121][var122] != null) {
                        class81.field1199[class55.field807][var121][var122] = null;
                        class158.method1115((byte) 30, var122, var121);
                    }
                }
            }
            for (class125 var123 = (class125) class286.field4645.method1495(-312); var123 != null; var123 = (class125) class286.field4645.method1501(-101)) {
                if (var123.field1865 >= class176.field2867 && class176.field2867 + 8 > var123.field1865 && var123.field1867 >= class295.field4769 && class295.field4769 + 8 > var123.field1867 && class55.field807 == var123.field1859) {
                    var123.field1866 = 0;
                }
            }
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 47) {
            long var179 = class164.field2597.method768((byte) 92);
            class164.field2597.method785((byte) -111);
            long var181 = class164.field2597.method768((byte) 92);
            long var183 = (long) class164.field2597.method759((byte) -53);
            long var185 = (long) class164.field2597.method757(11997);
            int var187 = class164.field2597.method792(2);
            int var188 = class164.field2597.method759((byte) -91);
            long var189 = (var183 << 32) + var185;
            boolean var191 = false;
            int var192 = 0;
            label1341: while (true) {
                if (var192 >= 100) {
                    if (var187 <= 1) {
                        for (int var193 = 0; var193 < class281.field4576; var193++) {
                            if (class273.field4436[var193] == var179) {
                                var191 = true;
                                break label1341;
                            }
                        }
                    }
                    break;
                }
                if (class111.field1577[var192] == var189) {
                    var191 = true;
                    break;
                }
                var192++;
            }
            if (!var191 && class194.field3136 == 0) {
                class111.field1577[class162.field2582] = var189;
                class162.field2582 = (class162.field2582 + 1) % 100;
                class41 var194 = class195.method1397((byte) -118, var188).method1242(0, class164.field2597);
                if (var187 == 2 || var187 == 3) {
                    class107.method728(201, class187.method1346(new class41[] { class67.field1015, class235.method1690(var179, (byte) 23).method288((byte) -124) }, 0), var188, var194, 20, class235.method1690(var181, (byte) 116).method288((byte) -128));
                } else if (var187 == 1) {
                    class107.method728(arg0 - 859718295, class187.method1346(new class41[] { class161.field2555, class235.method1690(var179, (byte) 12).method288((byte) -128) }, 0), var188, var194, 20, class235.method1690(var181, (byte) -126).method288((byte) -126));
                } else {
                    class107.method728(201, class235.method1690(var179, (byte) -126).method288((byte) -124), var188, var194, 20, class235.method1690(var181, (byte) 112).method288((byte) -126));
                }
            }
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 46) {
            class41 var176 = class164.field2597.method763(true);
            int var177 = class164.field2597.method759((byte) -99);
            int var178 = class164.field2597.method775(64);
            if (class73.method538(var178, false)) {
                class232.method1653(arg0 - 859718393, var177, var176);
            }
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 209) {
            int var124 = class164.field2597.method759((byte) -102);
            int var125 = class164.field2597.method798((byte) 105);
            int var126 = class164.field2597.method808(255);
            int var127 = class164.field2597.method782((byte) -117);
            if (var127 >> 30 != 0) {
                int var128 = var127 >> 28 & 0x3;
                int var129 = ((var127 & 0xFFFEF69) >> 14) - class88.field1300;
                int var130 = (var127 & 0x3FFF) - class55.field809;
                if (var129 >= 0 && var130 >= 0 && var129 < 104 && var130 < 104) {
                    int var131 = var129 * 128 + 64;
                    int var132 = var130 * 128 + 64;
                    class311 var133 = new class311(var126, var128, var131, var132, class140.method983((byte) -124, var128, var131, var132) - var125, var124, class18.field234);
                    class290.field4703.method1503(new class66(var133), (byte) -79);
                }
            } else if ((var127 >> 29) != 0) {
                int var138 = var127 & 0xFFFF;
                class50 var139 = class216.field3471[var138];
                if (var139 != null) {
                    var139.field4320 = 0;
                    var139.field4279 = class18.field234 + var124;
                    var139.field4330 = 0;
                    var139.field4287 = var125;
                    var139.field4289 = var126;
                    if (var139.field4289 == 65535) {
                        var139.field4289 = -1;
                    }
                    if (class18.field234 < var139.field4279) {
                        var139.field4320 = -1;
                    }
                    if (var139.field4289 != -1 && class18.field234 == var139.field4279) {
                        int var140 = class5.method15(var139.field4289, false).field3545;
                        if (var140 != -1) {
                            class205 var141 = class285.method2000(var140, 4442);
                            if (var141 != null && var141.field3323 != null) {
                                class148.method1026(var139.field4311, 0, var139.field4280, var141, 34, false);
                            }
                        }
                    }
                }
            } else if ((var127 >> 28) != 0) {
                int var134 = var127 & 0xFFFF;
                class245 var135;
                if (class204.field3300 == var134) {
                    var135 = class62.field913;
                } else {
                    var135 = class246.field3955[var134];
                }
                if (var135 != null) {
                    var135.field4330 = 0;
                    var135.field4287 = var125;
                    var135.field4279 = class18.field234 + var124;
                    var135.field4289 = var126;
                    var135.field4320 = 0;
                    if (var135.field4279 > class18.field234) {
                        var135.field4320 = -1;
                    }
                    if (var135.field4289 == 65535) {
                        var135.field4289 = -1;
                    }
                    if (var135.field4289 != -1 && class18.field234 == var135.field4279) {
                        int var136 = class5.method15(var135.field4289, false).field3545;
                        if (var136 != -1) {
                            class205 var137 = class285.method2000(var136, arg0 - 859714054);
                            if (var137 != null && var137.field3323 != null) {
                                class148.method1026(var135.field4311, 0, var135.field4280, var137, 87, class62.field913 == var135);
                            }
                        }
                    }
                }
            }
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 80) {
            class5.field49 = class164.field2597.method792(2);
            class116.field1679 = -1;
            return true;
        } else if (class116.field1679 == 128) {
            int var142 = class164.field2597.method775(40);
            int var143 = class164.field2597.method808(255);
            int var144 = class164.field2597.method816(false);
            if (class73.method538(var143, false)) {
                class264.method1869((byte) -107, var142, var144);
            }
            class116.field1679 = -1;
            return true;
        } else {
            if (arg0 != 859718496) {
                method130(-19);
            }
            if (class116.field1679 == 49) {
                long var162 = class164.field2597.method768((byte) 92);
                int var164 = class164.field2597.method759((byte) -77);
                byte var165 = class164.field2597.method785((byte) -106);
                boolean var166 = false;
                if ((Long.MIN_VALUE & var162) != 0L) {
                    var166 = true;
                }
                if (var166) {
                    if (class88.field1299 == 0) {
                        class116.field1679 = -1;
                        return true;
                    }
                    long var167 = var162 & Long.MAX_VALUE;
                    boolean var169 = false;
                    int var170;
                    for (var170 = 0; class88.field1299 > var170 && (class271.field4379[var170].field844 != var167 || class271.field4379[var170].field4593 != var164); var170++) {
                    }
                    if (var170 < class88.field1299) {
                        while (class88.field1299 - 1 > var170) {
                            class271.field4379[var170] = class271.field4379[var170 + 1];
                            var170++;
                        }
                        class88.field1299--;
                        class271.field4379[class88.field1299] = null;
                    }
                } else {
                    class41 var171 = class164.field2597.method763(true);
                    class283 var172 = new class283();
                    var172.field844 = var162;
                    var172.field4595 = class235.method1690(var172.field844, (byte) -125);
                    var172.field4592 = var171;
                    var172.field4593 = var164;
                    var172.field4597 = var165;
                    int var173;
                    for (var173 = class88.field1299 - 1; var173 >= 0; var173--) {
                        int var174 = class271.field4379[var173].field4595.method292((byte) -27, var172.field4595);
                        if (var174 == 0) {
                            class271.field4379[var173].field4593 = var164;
                            class271.field4379[var173].field4597 = var165;
                            class271.field4379[var173].field4592 = var171;
                            if (class205.field3324 == var162) {
                                class302.field4899 = var165;
                            }
                            class225.field3607 = class33.field493;
                            class116.field1679 = -1;
                            return true;
                        }
                        if (var174 < 0) {
                            break;
                        }
                    }
                    if (class88.field1299 >= class271.field4379.length) {
                        class116.field1679 = -1;
                        return true;
                    }
                    for (int var175 = class88.field1299 - 1; var175 > var173; var175--) {
                        class271.field4379[var175 + 1] = class271.field4379[var175];
                    }
                    if (class88.field1299 == 0) {
                        class271.field4379 = new class283[100];
                    }
                    class271.field4379[var173 + 1] = var172;
                    if (class205.field3324 == var162) {
                        class302.field4899 = var165;
                    }
                    class88.field1299++;
                }
                class116.field1679 = -1;
                class225.field3607 = class33.field493;
                return true;
            } else if (class116.field1679 == 61) {
                class274.method1939(56);
                class116.field1679 = -1;
                return true;
            } else if (class116.field1679 == 18) {
                int var145 = class164.field2597.method793(arg0 ^ 0xCCC1BCCD);
                int var146 = class164.field2597.method759((byte) -76);
                int var147 = class164.field2597.method808(255);
                class50 var148 = class216.field3471[var146];
                if (var148 != null) {
                    class119.method852(var148, var147, var145, 108);
                }
                class116.field1679 = -1;
                return true;
            } else if (class116.field1679 == 115) {
                for (int var149 = 0; var149 < class60.field885.length; var149++) {
                    if (class60.field885[var149] != class268.field4291[var149]) {
                        class60.field885[var149] = class268.field4291[var149];
                        class161.method1140(var149, 9);
                        class251.field3992[class217.method1563(31, class237.field3802++)] = var149;
                    }
                }
                class116.field1679 = -1;
                return true;
            } else if (class116.field1679 == 179) {
                int var161 = class164.field2597.method775(-108);
                if (var161 == 65535) {
                    var161 = -1;
                }
                class121.method862(arg0 - 859718595, var161);
                class116.field1679 = -1;
                return true;
            } else if (class116.field1679 == 69) {
                int var159 = class164.field2597.method814((byte) -53);
                int var160 = class164.field2597.method775(37);
                if (var160 == 65535) {
                    var160 = -1;
                }
                class312.method2162(var159, (byte) -109, var160);
                class116.field1679 = -1;
                return true;
            } else if (class116.field1679 == 153) {
                int var150 = class164.field2597.method798((byte) 118);
                int var151 = class164.field2597.method808(arg0 ^ 0x333E439F);
                int var152 = class164.field2597.method782((byte) -101);
                int var153 = class164.field2597.method759((byte) -98);
                int var154 = class164.field2597.method775(90);
                if (class73.method538(var150, false)) {
                    class228.method1634(true, var151, var153, var154, var152);
                }
                class116.field1679 = -1;
                return true;
            } else if (class116.field1679 == 137) {
                class281.field4576 = class1.field7 / 8;
                for (int var158 = 0; var158 < class281.field4576; var158++) {
                    class273.field4436[var158] = class164.field2597.method768((byte) 92);
                    class315.field5310[var158] = class235.method1690(class273.field4436[var158], (byte) -128);
                }
                class116.field1679 = -1;
                class275.field4508 = class33.field493;
                return true;
            } else if (class116.field1679 == 210) {
                int var155 = class164.field2597.method808(255);
                class22.method158((byte) 127, var155);
                class171.field2769[class217.method1563(31, class129.field1909++)] = class217.method1563(var155, 32767);
                class116.field1679 = -1;
                return true;
            } else if (class116.field1679 == 9) {
                if (class55.field803 != null) {
                    class105.method725(-1, false, class314.field5298, false, -1);
                }
                byte[] var156 = new byte[class1.field7];
                class164.field2597.method840(class1.field7, var156, 0, 1);
                class41 var157 = class213.method1507(class1.field7, 0, false, var156);
                if (class238.field3817 == null && class211.field3397 == 3 || !class211.field3400.startsWith("win") || class126.field1881) {
                    class144.method997(true, var157, (byte) 77);
                } else {
                    class77.field1146 = var157;
                    class265.field4201 = true;
                    class308.field5183 = class138.field2065.method1477((byte) 120, new String(var157.method317(false), "ISO-8859-1"));
                }
                class116.field1679 = -1;
                return true;
            } else {
                class104.method719("T1 - " + class116.field1679 + "," + class131.field1962 + "," + class295.field4770 + " - " + class1.field7, (Throwable) null, false);
                class238.method1705(110);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)V", line = 2816)
    public final void method138(int arg0, int arg1) {
        if (arg1 != 0) {
            return;
        }
        if (class118.field1725 != null) {
            for (class221 var3 = (class221) this.field316.method2057(52); var3 != null; var3 = (class221) this.field316.method2058(false)) {
                if (var3.method709((byte) -62)) {
                    if (var3.method710((byte) 59) == null) {
                        var3.method418(6971);
                        var3.method11(true);
                        this.field318++;
                    }
                } else if ((long) arg0 < ++var3.field41) {
                    class221 var4 = class118.field1725.method947(var3, arg1 ^ 0xFFFFD2A7);
                    this.field305.method610(114, var4, var3.field844);
                    class104.method720((byte) -112, var4, var3);
                    var3.method418(6971);
                    var3.method11(true);
                }
            }
        }
        field317++;
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(I)V", line = 2870)
    public class20(int arg0) {
        this.field303 = arg0;
        this.field318 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field305 = new class86(var2);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(JI)V", line = 2893)
    public final void method139(long arg0, int arg1) {
        int var4 = -60 % ((arg1 - 69) / 55);
        field323++;
        class221 var5 = (class221) this.field305.method617(arg0, false);
        if (var5 != null) {
            var5.method418(6971);
            var5.method11(true);
            this.field318++;
        }
    }
}
