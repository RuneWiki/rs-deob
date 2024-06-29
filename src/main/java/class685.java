import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class685 extends class293 implements class83 {

    @OriginalMember(owner = "client!jg", name = "R", descriptor = "Z")
    private boolean field9671 = false;

    @OriginalMember(owner = "client!jg", name = "hb", descriptor = "Lnq;")
    public class155 field9687;

    @OriginalMember(owner = "client!jg", name = "U", descriptor = "Z")
    private boolean field9674;

    @OriginalMember(owner = "client!jg", name = "I", descriptor = "I")
    public static int field9662;

    @OriginalMember(owner = "client!jg", name = "J", descriptor = "I")
    public static int field9663;

    @OriginalMember(owner = "client!jg", name = "K", descriptor = "I")
    public static int field9664;

    @OriginalMember(owner = "client!jg", name = "L", descriptor = "I")
    public static int field9665;

    @OriginalMember(owner = "client!jg", name = "M", descriptor = "I")
    public static int field9666;

    @OriginalMember(owner = "client!jg", name = "N", descriptor = "I")
    public static int field9667;

    @OriginalMember(owner = "client!jg", name = "O", descriptor = "I")
    public static int field9668;

    @OriginalMember(owner = "client!jg", name = "P", descriptor = "I")
    public static int field9669;

    @OriginalMember(owner = "client!jg", name = "Q", descriptor = "I")
    public static int field9670;

    @OriginalMember(owner = "client!jg", name = "S", descriptor = "I")
    public static int field9672;

    @OriginalMember(owner = "client!jg", name = "T", descriptor = "I")
    public static int field9673;

    @OriginalMember(owner = "client!jg", name = "W", descriptor = "I")
    public static int field9676;

    @OriginalMember(owner = "client!jg", name = "X", descriptor = "I")
    public static int field9677;

    @OriginalMember(owner = "client!jg", name = "Y", descriptor = "I")
    public static int field9678;

    @OriginalMember(owner = "client!jg", name = "Z", descriptor = "I")
    public static int field9679;

    @OriginalMember(owner = "client!jg", name = "ab", descriptor = "I")
    public static int field9680;

    @OriginalMember(owner = "client!jg", name = "cb", descriptor = "I")
    public static int field9682;

    @OriginalMember(owner = "client!jg", name = "db", descriptor = "I")
    public static int field9683;

    @OriginalMember(owner = "client!jg", name = "eb", descriptor = "I")
    public static int field9684;

    @OriginalMember(owner = "client!jg", name = "fb", descriptor = "I")
    public static int field9685;

    @OriginalMember(owner = "client!jg", name = "gb", descriptor = "I")
    public static int field9686;

    @OriginalMember(owner = "client!jg", name = "bb", descriptor = "Lifa;")
    private class62 field9681;

    @OriginalMember(owner = "client!jg", name = "V", descriptor = "[[S")
    public static short[][] field9675;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(B)I")
    public final int method277(byte arg0) {
        ++field9684;
        if (arg0 != 95) {
            this.method274(15);
        }
        return this.field9687.field2220;
    }

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "(Z)Z")
    public final boolean method309(boolean arg0) {
        if (!arg0) {
            this.field9671 = false;
        }
        ++field9673;
        return false;
    }

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "(Lr;I)Lifa;")
    public final class62 method268(class98 arg0, int arg1) {
        ++field9672;
        if (arg1 != 0) {
            this.field9687 = null;
        }
        return this.field9681;
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(Z)I")
    public final int method271(boolean arg0) {
        if (arg0) {
            field9675 = null;
        }
        ++field9683;
        return this.field9687.method1102(-26609);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIZLr;)Z")
    public final boolean method261(int arg0, int arg1, boolean arg2, class98 arg3) {
        ++field9664;
        class395 var5 = this.field9687.method1110((byte) -104, arg2, arg3, false, 131072);
        if (var5 == null) {
            return false;
        } else {
            class151 var6 = arg3.method682();
            var6.method883(super.field7895, super.field7894, super.field7896);
            return class384.field5767 ? var5.method1022(arg0, arg1, var6, false, class515.field7222) : var5.method1026(arg0, arg1, var6, false);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lr;Z)V")
    public final void method265(class98 arg0, boolean arg1) {
        if (arg1) {
            ++field9679;
            this.field9687.method1109(0, arg0);
        }
    }

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "(I)Z")
    public final boolean method266(int arg0) {
        if (arg0 != 28107) {
            this.method274(-125);
        }
        ++field9677;
        return this.field9687.method1105(-1);
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Lr;Llt;IIIIIZIIIIIII)V")
    public class685(class98 arg0, class289 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field4187 == 1, class227.method1422(arg12, arg13, 2));
        this.field9687 = new class155(arg0, arg1, arg12, arg13, super.field7905, arg3, this, arg7, arg14);
        this.field9674 = arg1.field4250 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "(B)V")
    public final void method315(byte arg0) {
        ++field9686;
        if (arg0 <= 101) {
            this.field9681 = null;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(Lr;I)V")
    public final void method259(class98 arg0, int arg1) {
        ++field9668;
        if (arg1 == 11771) {
            class395 var3 = this.field9687.method1110((byte) -104, true, arg0, true, 262144);
            if (var3 != null) {
                class151 var4 = arg0.method682();
                var4.method883(super.field7895, super.field7894, super.field7896);
                this.field9687.method1107(super.field4305, arg1 + -40779, super.field4299, super.field4294, arg0, super.field4300, var4, false, var3);
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "(B)V")
    public static void method3840(byte arg0) {
        int var1 = -114 % ((-4 - arg0) / 57);
        field9675 = null;
    }

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "(I)I")
    public final int method258(int arg0) {
        ++field9676;
        if (arg0 != -1) {
            this.field9671 = false;
        }
        return this.field9687.method1101((byte) 108);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BLr;)V")
    public final void method273(byte arg0, class98 arg1) {
        ++field9669;
        int var3 = -102 / ((2 - arg0) / 56);
        this.field9687.method1100(false, arg1);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V")
    public final void method276(int arg0) {
        ++field9670;
        if (arg0 <= 63) {
            field9675 = null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "(I)Z")
    public final boolean method270(int arg0) {
        ++field9662;
        return arg0 > -42;
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(II)V")
    public static final void method3841(int arg0, int arg1) {
        class673.field9460 = 2;
        ++field9663;
        if (arg0 <= 113) {
            method3842((byte) 26);
        }
        class642.field9203 = arg1;
        long var2 = 0L;
        if (class119.field1771 == null) {
            class668.method3746(35, true);
        } else {
            class540 var4 = new class540(class461.method2687(class2.method7(-71, class119.field1771), (byte) 28));
            long var5 = var4.method3165(88);
            class27.field465 = var4.method3165(120);
            class504.method2873(true, "", class444.method2626(-4943, var5), (byte) 46);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lr;I)Lhr;")
    public final class218 method272(class98 arg0, int arg1) {
        ++field9682;
        class395 var3 = this.field9687.method1110((byte) -104, true, arg0, false, 2048);
        if (var3 == null) {
            return null;
        } else {
            class151 var4 = arg0.method682();
            if (arg1 != -1) {
                this.field9671 = true;
            }
            var4.method883(super.field7895, super.field7894, super.field7896);
            class218 var5 = null;
            if (this.field9674) {
                var5 = class187.method1237(1, (byte) 43);
            }
            this.field9687.method1107(super.field4305, -29008, super.field4299, super.field4294, arg0, super.field4300, var4, true, var3);
            if (class384.field5767) {
                var3.method1030(var4, var5 == null ? null : var5.field2902[0], class515.field7222, 0);
            } else {
                var3.method1054(var4, var5 == null ? null : var5.field2902[0], 0);
            }
            if (this.field9687.field2202 != null) {
                class620 var6 = this.field9687.field2202.method112();
                if (class384.field5767) {
                    arg0.method708(var6, class515.field7222);
                } else {
                    arg0.method679(var6);
                }
            }
            this.field9671 = var3.method1024() || this.field9687.field2202 != null;
            if (this.field9681 == null) {
                this.field9681 = class249.method1513(super.field7896, super.field7894, var3, 2, super.field7895);
            } else {
                class340.method2112(true, this.field9681, super.field7895, super.field7894, super.field7896, var3);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "(B)V")
    public static final void method3842(byte arg0) {
        if (arg0 != -71) {
            method3840((byte) 74);
        }
        ++field9667;
        if (~class641.field9191 != -1 && class641.field9191 != 6) {
            try {
                if (++class154.field2179 > 2000) {
                    if (class230.field3051 != null) {
                        class230.field3051.method1362((byte) 21);
                        class230.field3051 = null;
                    }
                    if (class418.field6179 >= 2) {
                        class641.field9191 = 0;
                        class668.method3746(-5, true);
                        return;
                    }
                    if (class673.field9460 != 2 && ~class673.field9460 != -4) {
                        class584.field8491.method729(31292);
                    } else {
                        class684.field9654.method729(31292);
                    }
                    class641.field9191 = 1;
                    ++class418.field6179;
                    class154.field2179 = 0;
                }
                if (class641.field9191 == 1) {
                    if (class673.field9460 != 2 && class673.field9460 != 3) {
                        class165.field2318 = class584.field8491.method733(arg0 ^ -510, class61.field978);
                    } else {
                        class165.field2318 = class684.field9654.method733(443, class61.field978);
                    }
                    class641.field9191 = 2;
                }
                if (class641.field9191 == 2) {
                    if (~class165.field2318.field3311 == -3) {
                        throw new IOException();
                    }
                    if (class165.field2318.field3311 != 1) {
                        return;
                    }
                    class230.field3051 = class5.method24((Socket) class165.field2318.field3307, 7500, (byte) 9);
                    class165.field2318 = null;
                    long var1 = class149.field2108 = class583.method3343(-118, class11.field278);
                    int var3 = (int) (31L & var1 >> 16);
                    class373.method2299(true);
                    class654 var4 = class149.method1067(77);
                    var4.field9358.method3110(class196.field2650.field9823, arg0 ^ -99);
                    var4.field9358.method3110(var3, 36);
                    class444.method2623(121, var4);
                    class220.method1385(true);
                    class641.field9191 = 3;
                }
                if (class641.field9191 == 3) {
                    if (!class230.field3051.method1359(-93, 1)) {
                        return;
                    }
                    class230.field3051.method1356(false, 0, class389.field5816.field7952, 1);
                    int var5 = 255 & class389.field5816.field7952[0];
                    if (var5 != 0) {
                        class641.field9191 = 0;
                        class668.method3746(var5, true);
                        class230.field3051.method1362((byte) -114);
                        class230.field3051 = null;
                        class149.method1066(-78);
                        return;
                    }
                    class641.field9191 = 4;
                }
                if (class641.field9191 == 4) {
                    if (!class230.field3051.method1359(-95, 8)) {
                        return;
                    }
                    class230.field3051.method1356(false, 0, class389.field5816.field7952, 8);
                    class389.field5816.field7956 = 0;
                    class79.field1286 = class389.field5816.method3165(45);
                    class540 var6 = new class540(518);
                    int[] var7 = new int[] { (int) (9.9999999E7D * Math.random()), (int) (9.9999999E7D * Math.random()), (int) (class79.field1286 >> 32), (int) class79.field1286 };
                    var6.method3110(10, 42);
                    var6.method3146(var7[0], -119);
                    var6.method3146(var7[1], -102);
                    var6.method3146(var7[2], -83);
                    var6.method3146(var7[3], arg0 ^ 114);
                    var6.method3144(-34, class583.method3343(arg0 + -41, class11.field278));
                    var6.method3132(class239.field3137, 3);
                    var6.method3144(-39, class27.field465);
                    var6.method3144(arg0 ^ 20, class283.field3775);
                    var6.method3131(class58.field948, 3, class351.field5187);
                    class373.method2299(true);
                    class654 var8 = class149.method1067(108);
                    class311 var9 = var8.field9358;
                    if (class673.field9460 != 2 && class673.field9460 != 3) {
                        var9.method3110(class196.field2682.field9823, arg0 + 177);
                        var9.method3162(arg0 + -2003712625, 0);
                        int var10 = var9.field7956;
                        var9.method3146(627, 63);
                        var9.method3110(class478.field6840.field5519, 117);
                        var9.method3110(class262.field3401, 95);
                        class343.method2128((byte) -109, var9);
                        var9.method3132(class433.field6283, 3);
                        var9.method3146(class122.field1815, -63);
                        class589.method3359((byte) 124, var9);
                        var9.method3149(0, var6.field7952, var6.field7956, -99);
                        var9.method3153(-var10 + var9.field7956, arg0 ^ 70);
                    } else {
                        if (class264.field3451 == 13) {
                            var9.method3110(class196.field2681.field9823, 58);
                        } else {
                            var9.method3110(class196.field2677.field9823, 77);
                        }
                        var9.method3162(-2003712696, 0);
                        int var11 = var9.field7956;
                        var9.method3146(627, -70);
                        var9.method3110(class642.field9203, arg0 ^ -42);
                        var9.method3110(class38.method219(-2), arg0 + 147);
                        var9.method3162(-2003712696, class454.field6538);
                        var9.method3162(-2003712696, class425.field6218);
                        var9.method3110(class335.field4872.field9485, 100);
                        class343.method2128((byte) -117, var9);
                        var9.method3132(class433.field6283, 3);
                        var9.method3146(class122.field1815, -104);
                        class540 var12 = new class540(class415.method2528(-1));
                        class335.field4872.method3787(arg0 + 186, var12);
                        var9.method3110(var12.field7956, arg0 + 161);
                        var9.method3149(0, var12.field7952, var12.field7956, -119);
                        class326.field4730 = true;
                        class540 var13 = new class540(class202.field2761.method936(-62));
                        class202.field2761.method933(false, var13);
                        var9.method3149(0, var13.field7952, var13.field7952.length, arg0 + -53);
                        var9.method3162(-2003712696, class298.field4387);
                        var9.method3144(-57, class224.field2970);
                        var9.method3110(class222.field2944 == null ? 0 : 1, 72);
                        if (class222.field2944 != null) {
                            var9.method3132(class222.field2944, 3);
                        }
                        class589.method3359((byte) 123, var9);
                        var9.method3149(0, var6.field7952, var6.field7956, -102);
                        var9.method3153(-var11 + var9.field7956, arg0 + 70);
                    }
                    class444.method2623(arg0 ^ -50, var8);
                    class220.method1385(true);
                    class357.field5280 = new class162(var7);
                    for (int var14 = 0; ~var14 > -5; ++var14) {
                        var7[var14] += 50;
                    }
                    class389.field5816.method1940(var7, (byte) 106);
                    class641.field9191 = 5;
                }
                if (class641.field9191 == 5) {
                    if (!class230.field3051.method1359(-104, 1)) {
                        return;
                    }
                    class230.field3051.method1356(false, 0, class389.field5816.field7952, 1);
                    int var15 = 255 & class389.field5816.field7952[0];
                    if (~var15 != -22) {
                        if (var15 != 29) {
                            if (~var15 == -2) {
                                class641.field9191 = 6;
                                class668.method3746(var15, true);
                                return;
                            }
                            if (~var15 == -3) {
                                class641.field9191 = 9;
                            } else {
                                if (var15 != 15) {
                                    if (~var15 == -24 && class418.field6179 < 2) {
                                        class641.field9191 = 1;
                                        class154.field2179 = 0;
                                        ++class418.field6179;
                                        class230.field3051.method1362((byte) 3);
                                        class230.field3051 = null;
                                        return;
                                    }
                                    class641.field9191 = 0;
                                    class668.method3746(var15, true);
                                    class230.field3051.method1362((byte) 77);
                                    class230.field3051 = null;
                                    class149.method1066(arg0 + 162);
                                    return;
                                }
                                class641.field9191 = 15;
                                class297.field4376 = -2;
                            }
                        } else {
                            class641.field9191 = 14;
                        }
                    } else {
                        class641.field9191 = 8;
                    }
                }
                if (class641.field9191 == 7) {
                    class373.method2299(true);
                    class654 var16 = class149.method1067(arg0 + 181);
                    class311 var17 = var16.field9358;
                    var17.method1945(class357.field5280, -120);
                    var17.method1939(true, class196.field2689.field9823);
                    class444.method2623(119, var16);
                    class220.method1385(true);
                    class641.field9191 = 5;
                } else if (class641.field9191 == 8) {
                    if (class230.field3051.method1359(-104, 1)) {
                        class230.field3051.method1356(false, 0, class389.field5816.field7952, 1);
                        int var18 = 255 & class389.field5816.field7952[0];
                        class557.field8180 = (var18 + 3) * 60;
                        class641.field9191 = 0;
                        class668.method3746(21, true);
                        class230.field3051.method1362((byte) 72);
                        class230.field3051 = null;
                        class149.method1066(-37);
                    }
                } else if (~class641.field9191 == -15) {
                    if (class230.field3051.method1359(-77, 1)) {
                        class230.field3051.method1356(false, 0, class389.field5816.field7952, 1);
                        class641.field9191 = 0;
                        class432.field6269 = class389.field5816.field7952[0] & 255;
                        class668.method3746(29, true);
                        class230.field3051.method1362((byte) 127);
                        class230.field3051 = null;
                        class149.method1066(-63);
                    }
                } else if (~class641.field9191 == -10) {
                    if (class230.field3051.method1359(-122, 1)) {
                        class230.field3051.method1356(false, 0, class389.field5816.field7952, 1);
                        class11.field277 = 255 & class389.field5816.field7952[0];
                        class641.field9191 = 10;
                    }
                } else {
                    if (class641.field9191 == 10) {
                        if (~class673.field9460 == -4) {
                            class413.field6123 = true;
                        } else {
                            class413.field6123 = false;
                        }
                        class311 var19 = class389.field5816;
                        if (class673.field9460 != 2 && ~class673.field9460 != -4) {
                            if (!class230.field3051.method1359(-82, class11.field277)) {
                                return;
                            }
                            class230.field3051.method1356(false, 0, var19.field7952, class11.field277);
                            var19.field7956 = 0;
                            class248.field3272 = var19.method3115(29871);
                            class344.field5085 = var19.method3115(29871);
                            class379.field5684 = var19.method3115(arg0 + 29942) == 1;
                            class621.field8993 = var19.method3115(29871) == 1;
                            class564.field8249 = ~var19.method3115(arg0 + 29942) == -2;
                            class180.field2493 = var19.method3129(arg0 + 189);
                            class221.field2937 = ~class180.field2493 < -1;
                            class173.field2444 = var19.method3169(26488);
                            class167.field2331 = var19.method3169(26488);
                            class220.field2927 = var19.method3169(arg0 ^ -26431);
                            class557.field8184 = var19.method3160(false);
                            class665.field9442 = class61.field978.method1410(class557.field8184, (byte) -103);
                            class300.field4452 = var19.method3115(arg0 + 29942);
                            class580.field8449 = var19.method3169(arg0 + 26559);
                            class697.field9816 = var19.method3169(26488);
                            class100.field1518 = ~var19.method3115(29871) == -2;
                            class321.field4681.field1094 = class321.field4681.field1106 = var19.method3138(-127);
                            class160.field2277 = var19.method3115(29871);
                            class169.field2398 = var19.method3160(false);
                            class116.field1739 = new class102();
                            class116.field1739.field1522 = var19.method3169(26488);
                            if (~class116.field1739.field1522 == -65536) {
                                class116.field1739.field1522 = -1;
                            }
                            class116.field1739.field1527 = var19.method3138(-121);
                            if (class280.field3708 != class215.field2882) {
                                class116.field1739.field1528 = class116.field1739.field1522 + 50000;
                                class116.field1739.field1526 = class116.field1739.field1522 + 40000;
                            }
                            if (class436.field6358 != class215.field2882 && (class684.field9654.method730(class202.field2763, (byte) 109) || class684.field9654.method730(class389.field5824, (byte) 27))) {
                                class200.method1301(false);
                            }
                        } else {
                            if (!class230.field3051.method1359(arg0 + -43, class11.field277)) {
                                return;
                            }
                            class230.field3051.method1356(false, 0, var19.field7952, class11.field277);
                            var19.field7956 = 0;
                            class248.field3272 = var19.method3115(29871);
                            class344.field5085 = var19.method3115(29871);
                            class379.field5684 = var19.method3115(29871) == 1;
                            class621.field8993 = ~var19.method3115(29871) == -2;
                            class564.field8249 = var19.method3115(29871) == 1;
                            class398.field6008 = ~var19.method3115(29871) == -2;
                            class478.field6850 = var19.method3169(26488);
                            class221.field2937 = ~var19.method3115(29871) == -2;
                            class238.field3132 = var19.method3121(2);
                            class232.field3066 = ~var19.method3115(29871) == -2;
                            if (class673.field9460 == 3) {
                                boolean var20 = ~var19.method3115(29871) == -2;
                                if (var20) {
                                    long var21 = var19.method3165(arg0 ^ -64);
                                    String var23 = class444.method2626(arg0 + -4872, var21);
                                    int var24 = var19.method3115(arg0 + 29942);
                                    byte[] var25 = new byte[var24];
                                    var19.method1944(0, arg0 + 24637, var24, var25);
                                    String var26 = class255.method1523(var25, (byte) 105);
                                    class568 var27 = null;
                                    try {
                                        class254 var28 = class61.field978.method1416(false, arg0 + 166, "3");
                                        while (~var28.field3311 == -1) {
                                            class687.method3846(1L, 84);
                                        }
                                        if (~var28.field3311 == -2) {
                                            var27 = (class568) var28.field3307;
                                            int var29 = 12 + 2 + 3 + (var23.length() - -2) + (var26.length() - -1);
                                            if (class222.field2944 != null) {
                                                var29 += 2 + class222.field2944.length();
                                            }
                                            if (~var29 < -121) {
                                                throw new RuntimeException(">120");
                                            }
                                            class540 var30 = new class540(1 - -var29);
                                            var30.method3110(var29, 55);
                                            var30.method3110(3, 101);
                                            var30.method3157(var23, (byte) 118);
                                            var30.method3157(var26, (byte) 99);
                                            var30.method3162(-2003712696, class122.field1815);
                                            var30.method3144(-44, class224.field2970);
                                            var30.method3110(class222.field2944 != null ? 1 : 0, 45);
                                            if (class222.field2944 != null) {
                                                var30.method3157(class222.field2944, (byte) 122);
                                            }
                                            var30.method3170(arg0 + -16668);
                                            var27.method3273(0, var30.field7956, var30.field7952, true);
                                        }
                                    } catch (Exception var40) {
                                    }
                                    try {
                                        if (var27 != null) {
                                            var27.method3271((byte) -109);
                                        }
                                    } catch (Exception var38) {
                                    }
                                    try {
                                        class101.method727("demoaccountcreated", -110, class551.field8116);
                                    } catch (Throwable var37) {
                                    }
                                }
                            }
                            class60.field965.method2602(class232.field3066, (byte) -127);
                            class259.field3355.method2392(class232.field3066, (byte) 115);
                            class563.field8235.method1095(true, class232.field3066);
                        }
                        if ((!class379.field5684 || class564.field8249) && !class221.field2937) {
                            try {
                                class101.method727("unzap", -113, class551.field8116);
                            } catch (Throwable var36) {
                            }
                        } else {
                            try {
                                class101.method727("zap", -128, class551.field8116);
                            } catch (Throwable var39) {
                                if (class449.field6501) {
                                    try {
                                        class551.field8116.getAppletContext().showDocument(new URL(class551.field8116.getCodeBase(), "blank.ws"), "tbi");
                                    } catch (Exception var35) {
                                    }
                                }
                            }
                        }
                        if (class280.field3708 == class215.field2882) {
                            try {
                                class101.method727("loggedin", arg0 ^ 51, class551.field8116);
                            } catch (Throwable var34) {
                            }
                        }
                        if (class673.field9460 != 2 && class673.field9460 != 3) {
                            class641.field9191 = 0;
                            class668.method3746(2, true);
                            class308.method1922(-115);
                            class322.method2003(0, 7);
                            class617.field8919 = null;
                            return;
                        }
                        class641.field9191 = 12;
                    }
                    if (~class641.field9191 == -13) {
                        if (!class230.field3051.method1359(-120, 3)) {
                            return;
                        }
                        class230.field3051.method1356(false, 0, class389.field5816.field7952, 3);
                        class641.field9191 = 13;
                    }
                    if (class641.field9191 == 13) {
                        class311 var31 = class389.field5816;
                        var31.field7956 = 0;
                        if (var31.method1937((byte) 82)) {
                            if (!class230.field3051.method1359(-96, 1)) {
                                return;
                            }
                            class230.field3051.method1356(false, 3, var31.field7952, 1);
                        }
                        class617.field8919 = class133.method947(0)[var31.method1938((byte) 119)];
                        class297.field4376 = var31.method3169(26488);
                        class641.field9191 = 11;
                    }
                    if (~class641.field9191 == -12) {
                        if (class230.field3051.method1359(arg0 ^ 35, class297.field4376)) {
                            class230.field3051.method1356(false, 0, class389.field5816.field7952, class297.field4376);
                            class389.field5816.field7956 = 0;
                            int var32 = class297.field4376;
                            class641.field9191 = 0;
                            class668.method3746(2, true);
                            class59.method366(0);
                            class357.method2200(class389.field5816, (byte) 9);
                            class697.field9827 = -1;
                            if (class9.field264 == class617.field8919) {
                                class582.method3342((byte) 105);
                            } else {
                                class433.method2576(true);
                            }
                            if (class389.field5816.field7956 != var32) {
                                throw new RuntimeException("lswp pos:" + class389.field5816.field7956 + " psize:" + var32);
                            } else {
                                class617.field8919 = null;
                            }
                        }
                    } else if (class641.field9191 == 15) {
                        if (class297.field4376 == -2) {
                            if (!class230.field3051.method1359(-88, 2)) {
                                return;
                            }
                            class230.field3051.method1356(false, 0, class389.field5816.field7952, 2);
                            class389.field5816.field7956 = 0;
                            class297.field4376 = class389.field5816.method3169(26488);
                        }
                        if (class230.field3051.method1359(-83, class297.field4376)) {
                            class230.field3051.method1356(false, 0, class389.field5816.field7952, class297.field4376);
                            class389.field5816.field7956 = 0;
                            class641.field9191 = 0;
                            int var33 = class297.field4376;
                            class668.method3746(15, true);
                            class565.method3257((byte) 42);
                            class357.method2200(class389.field5816, (byte) 9);
                            if (class389.field5816.field7956 != var33) {
                                throw new RuntimeException("lswpr pos:" + class389.field5816.field7956 + " psize:" + var33);
                            } else {
                                class617.field8919 = null;
                            }
                        }
                    }
                }
            } catch (IOException var41) {
                if (class230.field3051 != null) {
                    class230.field3051.method1362((byte) 21);
                    class230.field3051 = null;
                }
                if (class418.field6179 >= 2) {
                    class641.field9191 = 0;
                    class668.method3746(-4, true);
                    class149.method1066(-53);
                } else {
                    if (class673.field9460 != 2 && class673.field9460 != 3) {
                        class584.field8491.method729(31292);
                    } else {
                        class684.field9654.method729(31292);
                    }
                    class641.field9191 = 1;
                    class154.field2179 = 0;
                    ++class418.field6179;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)I")
    public final int method263(byte arg0) {
        if (arg0 <= 10) {
            field9675 = null;
        }
        ++field9685;
        return this.field9687.field2224;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "([BB)[B")
    public static final byte[] method3843(byte[] arg0, byte arg1) {
        ++field9666;
        class540 var2 = new class540(arg0);
        if (arg1 >= -91) {
            method3841(44, -34);
        }
        int var3 = var2.method3115(29871);
        int var4 = var2.method3160(false);
        if (~var4 <= -1 && (~class40.field604 == -1 || class40.field604 >= var4)) {
            if (~var3 == -1) {
                byte[] var5 = new byte[var4];
                var2.method3155(var4, 0, var5, 0);
                return var5;
            } else {
                int var6 = var2.method3160(false);
                if (var6 < 0 || ~class40.field604 != -1 && class40.field604 < var6) {
                    throw new RuntimeException();
                } else {
                    byte[] var7 = new byte[var6];
                    if (var3 != 1) {
                        class36 var8 = class479.field6857;
                        synchronized (class479.field6857) {
                            class479.field6857.method215(var2, (byte) 126, var7);
                        }
                    } else {
                        class628.method3613(var7, var6, arg0, var4, 9);
                    }
                    return var7;
                }
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)I")
    public final int method264(int arg0) {
        if (arg0 != -5273) {
            return -101;
        } else {
            ++field9678;
            return this.field9687.field2207;
        }
    }

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "(I)Z")
    public final boolean method274(int arg0) {
        if (arg0 != -1510217528) {
            return false;
        } else {
            ++field9665;
            return this.field9671;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILr;ILcaa;ZII)V")
    public final void method311(int arg0, class98 arg1, int arg2, class538 arg3, boolean arg4, int arg5, int arg6) {
        if (arg5 >= 24) {
            ++field9680;
            throw new IllegalStateException();
        }
    }
}
