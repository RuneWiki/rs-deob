import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class168 extends class205 {

    @OriginalMember(owner = "client!q", name = "V", descriptor = "I")
    private int field3199 = 4096;

    @OriginalMember(owner = "client!q", name = "fb", descriptor = "I")
    private int field3209 = 0;

    @OriginalMember(owner = "client!q", name = "db", descriptor = "Lvd;")
    public static class222 field3207 = class212.method1357("Wir vermuten)1 dass Ihr Konto gestohlen wurde", 10731);

    @OriginalMember(owner = "client!q", name = "eb", descriptor = "Lvd;")
    public static class222 field3208 = class212.method1357("(U(Y", 10731);

    @OriginalMember(owner = "client!q", name = "hb", descriptor = "Z")
    public static boolean field3211 = false;

    @OriginalMember(owner = "client!q", name = "W", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!q", name = "Y", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!q", name = "ab", descriptor = "I")
    public static int field3204;

    @OriginalMember(owner = "client!q", name = "bb", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!q", name = "cb", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!q", name = "gb", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!q", name = "Z", descriptor = "Lab;")
    public static class3 field3203;

    @OriginalMember(owner = "client!q", name = "X", descriptor = "Z")
    public static boolean field3201;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Lka;BI)V")
    public final void method2(class109 arg0, byte arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 == 1) {
                this.field3199 = arg0.method675(2);
            }
        } else {
            this.field3209 = arg0.method675(2);
        }
        ++field3204;
        int var5 = -108 % ((arg1 - -47) / 34);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ZBLbj;)V")
    public static final void method1081(boolean arg0, byte arg1, class21 arg2) {
        int var3 = arg2.field493;
        ++field3205;
        int var4 = (int) arg2.field2555;
        arg2.method826(-22101);
        if (arg0) {
            class196.method1207(var3, 111256966);
        }
        class227.method1488(20339, var3);
        class13 var5 = class10.method92(923, var4);
        if (var5 != null) {
            class80.method527(var5, 31702);
        }
        class172.field3227 = 0;
        if (arg1 < -88) {
            class38.field834 = false;
            class77.method512(class217.field4034, class34.field735, 0, class192.field3543, class222.field4140);
            if (class25.field580 != -1) {
                class8.method65(class25.field580, 1, 1);
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(II)I")
    public static int method1082(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Lge;I)V")
    public static final void method1083(class70 arg0, int arg1) {
        ++field3210;
        if (arg1 < 108) {
            method1083((class70) null, -86);
        }
        arg0.field1344 = false;
        if (arg0.field1370 != -1) {
            class183 var2 = class93.method599((byte) -127, arg0.field1370);
            if (var2 != null && var2.field3404 != null) {
                ++arg0.field1335;
                if (~var2.field3404.length < ~arg0.field1313 && var2.field3396[arg0.field1313] < arg0.field1335) {
                    ++arg0.field1313;
                    arg0.field1335 = 1;
                    class120.method770(var2, 125, arg0.field1313, class17.field432 == arg0, arg0.field1353, arg0.field1360);
                }
                if (~arg0.field1313 <= ~var2.field3404.length) {
                    arg0.field1335 = 0;
                    arg0.field1313 = 0;
                    class120.method770(var2, 126, arg0.field1313, class17.field432 == arg0, arg0.field1353, arg0.field1360);
                }
            } else {
                arg0.field1370 = -1;
            }
        }
        if (arg0.field1309 != -1 && ~class175.field3280 <= ~arg0.field1327) {
            if (arg0.field1362 < 0) {
                arg0.field1362 = 0;
            }
            int var3 = class127.method805(arg0.field1309, (byte) 102).field1827;
            if (var3 == -1) {
                arg0.field1309 = -1;
            } else {
                class183 var4 = class93.method599((byte) -102, var3);
                if (var4 != null && var4.field3404 != null) {
                    ++arg0.field1373;
                    if (~var4.field3404.length < ~arg0.field1362 && arg0.field1373 > var4.field3396[arg0.field1362]) {
                        arg0.field1373 = 1;
                        ++arg0.field1362;
                        class120.method770(var4, 116, arg0.field1362, class17.field432 == arg0, arg0.field1353, arg0.field1360);
                    }
                    if (~arg0.field1362 <= ~var4.field3404.length) {
                        arg0.field1309 = -1;
                    }
                } else {
                    arg0.field1309 = -1;
                }
            }
        }
        if (~arg0.field1323 != 0 && ~arg0.field1338 >= -2) {
            class183 var5 = class93.method599((byte) -63, arg0.field1323);
            if (var5.field3381 == 1 && arg0.field1363 > 0 && ~class175.field3280 <= ~arg0.field1367 && ~class175.field3280 < ~arg0.field1343) {
                arg0.field1338 = 1;
                return;
            }
        }
        if (arg0.field1323 != -1 && arg0.field1338 == 0) {
            class183 var6 = class93.method599((byte) -102, arg0.field1323);
            if (var6 != null && var6.field3404 != null) {
                ++arg0.field1359;
                if (~var6.field3404.length < ~arg0.field1318 && arg0.field1359 > var6.field3396[arg0.field1318]) {
                    arg0.field1359 = 1;
                    ++arg0.field1318;
                    class120.method770(var6, 121, arg0.field1318, class17.field432 == arg0, arg0.field1353, arg0.field1360);
                }
                if (arg0.field1318 >= var6.field3404.length) {
                    ++arg0.field1375;
                    arg0.field1318 -= var6.field3385;
                    if (var6.field3384 > arg0.field1375) {
                        if (~arg0.field1318 <= -1 && ~var6.field3404.length < ~arg0.field1318) {
                            class120.method770(var6, 121, arg0.field1318, class17.field432 == arg0, arg0.field1353, arg0.field1360);
                        } else {
                            arg0.field1323 = -1;
                        }
                    } else {
                        arg0.field1323 = -1;
                    }
                }
                arg0.field1344 = var6.field3403;
            } else {
                arg0.field1323 = -1;
            }
        }
        if (~arg0.field1338 < -1) {
            --arg0.field1338;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(II)[I")
    public final int[] method4(int arg0, int arg1) {
        ++field3200;
        if (arg0 != 0) {
            method1083((class70) null, 42);
        }
        int[] var3 = super.field3810.method557(6978, arg1);
        if (super.field3810.field1635) {
            int[] var4 = this.method1322(arg1, (byte) 84, 0);
            for (int var5 = 0; ~var5 > ~class118.field2245; ++var5) {
                int var6 = var4[var5];
                var3[var5] = var6 >= this.field3209 && ~this.field3199 <= ~var6 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "()V")
    public class168() {
        super(1, true);
    }

    @OriginalMember(owner = "client!q", name = "h", descriptor = "(I)V")
    public static void method1084(int arg0) {
        field3203 = null;
        field3208 = null;
        if (arg0 == 2000) {
            field3207 = null;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIBLde;I)V")
    public static final void method1085(int arg0, int arg1, byte arg2, class38 arg3, int arg4) {
        ++field3206;
        if (class17.field432 != arg3) {
            if (~class172.field3227 > -401) {
                class222 var5;
                if (arg3.field845 == 0) {
                    var5 = class234.method1531(new class222[] { arg3.field853, class203.method1301((byte) 86, class17.field432.field835, arg3.field835), class151.field2915, class20.field478, class56.method414(-116, arg3.field835), class188.field3487 }, -10949);
                } else {
                    var5 = class234.method1531(new class222[] { arg3.field853, class151.field2915, class212.field3934, class56.method414(-99, arg3.field845), class188.field3487 }, -10949);
                }
                if (~class214.field3979 == -2) {
                    ++class65.field1220;
                    class127.method803((long) arg4, class234.method1531(new class222[] { class211.field3931, class75.field1475, var5 }, -10949), (byte) 44, arg1, arg0, (short) 5, class153.field2946);
                } else if (!class79.field1522) {
                    for (int var6 = 7; ~var6 <= -1; --var6) {
                        if (class160.field3042[var6] != null) {
                            ++class98.field1839;
                            short var7 = 0;
                            if (class70.field1328 == 0 && class160.field3042[var6].method1452(class180.field3346, (byte) -127)) {
                                if (class17.field432.field835 < arg3.field835) {
                                    var7 = 2000;
                                }
                                if (~class17.field432.field849 != -1 && ~arg3.field849 != -1) {
                                    if (~class17.field432.field849 == ~arg3.field849) {
                                        var7 = 2000;
                                    } else {
                                        var7 = 0;
                                    }
                                }
                            } else if (class217.field4039[var6]) {
                                var7 = 2000;
                            }
                            boolean var8 = false;
                            short var9 = class124.field2368[var6];
                            short var10 = (short) (var7 + var9);
                            class127.method803((long) arg4, class234.method1531(new class222[] { class98.field1846, var5 }, -10949), (byte) 44, arg1, arg0, var10, class160.field3042[var6]);
                        }
                    }
                } else if (~(class22.field522 & 8) == -9) {
                    ++class32.field663;
                    class127.method803((long) arg4, class234.method1531(new class222[] { class17.field429, class75.field1475, var5 }, arg2 + -10859), (byte) 44, arg1, arg0, (short) 57, class55.field1038);
                }
                if (arg2 == -90) {
                    for (int var11 = 0; ~class172.field3227 < ~var11; ++var11) {
                        if (~class131.field2535[var11] == -5) {
                            class72.field1434[var11] = class234.method1531(new class222[] { class98.field1846, var5 }, -10949);
                            return;
                        }
                    }
                }
            }
        }
    }
}
