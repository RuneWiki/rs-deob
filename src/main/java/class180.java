import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class180 extends class136 {

    @OriginalMember(owner = "client!th", name = "wb", descriptor = "Led;")
    public static class43 field3582 = class191.method1219("::", false);

    @OriginalMember(owner = "client!th", name = "xb", descriptor = "Led;")
    public static class43 field3583 = class191.method1219("Clientscript error )2 check log for details", false);

    @OriginalMember(owner = "client!th", name = "Bb", descriptor = "I")
    public static int field3587 = 2;

    @OriginalMember(owner = "client!th", name = "Db", descriptor = "Led;")
    public static class43 field3589 = class191.method1219("Sie befinden sich in einem Mitglieder)2Gebiet(Q", false);

    @OriginalMember(owner = "client!th", name = "zb", descriptor = "[I")
    public static int[] field3585 = new int[128];

    @OriginalMember(owner = "client!th", name = "tb", descriptor = "I")
    public static int field3579;

    @OriginalMember(owner = "client!th", name = "ub", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!th", name = "vb", descriptor = "I")
    public static int field3581;

    @OriginalMember(owner = "client!th", name = "yb", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!th", name = "Ab", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!th", name = "Cb", descriptor = "I")
    public static int field3588;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "(I)V")
    public static void method1166(int arg0) {
        field3582 = null;
        field3589 = null;
        if (arg0 == 3) {
            field3583 = null;
            field3585 = null;
        }
    }

    @OriginalMember(owner = "client!th", name = "f", descriptor = "(I)V")
    public static final void method1167(int arg0) {
        ++field3581;
        class126.field2510.method1108((byte) -90);
        if (arg0 != 5571) {
            method1169(false);
        }
        class23.field418.method1108((byte) -90);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IB)[[I")
    public final int[][] method99(int arg0, byte arg1) {
        if (arg1 != -94) {
            field3582 = null;
        }
        int[][] var3 = super.field1027.method1087(arg0, -2);
        ++field3588;
        if (super.field1027.field3428 && this.method884((byte) -100)) {
            int[] var4 = var3[0];
            int[] var5 = var3[2];
            int[] var6 = var3[1];
            int var7 = arg0 % super.field2816 * super.field2816;
            for (int var8 = 0; var8 < class122.field2442; ++var8) {
                int var9 = super.field2819[var8 % super.field2815 + var7];
                var5[var8] = class7.method38(4080, var9 << 4);
                var6[var8] = class7.method38(var9, 65280) >> 4;
                var4[var8] = class7.method38(var9, 16711680) >> 12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIZZ)V")
    private static final void method1168(int arg0, int arg1, boolean arg2, boolean arg3) {
        ++field3579;
        if (~arg0 <= -8001 && ~arg0 >= -48001) {
            class88.field1708 = arg3;
            class38.field726 = arg0;
            if (arg2) {
                class28.field515 = arg1;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!th", name = "e", descriptor = "(Z)Lr;")
    public static final class154 method1169(boolean arg0) {
        if (class89.field1728 == null) {
            class89.field1728 = new class154();
        }
        ++field3586;
        if (!arg0) {
            field3585 = null;
        }
        return class89.field1728;
    }

    @OriginalMember(owner = "client!th", name = "g", descriptor = "(I)V")
    public static final void method1170(int arg0) {
        ++field3580;
        if (~class60.field1238 == -1) {
            class137.field2842 = new class177(4, 104, 104, class158.field3203);
            for (int var1 = 0; ~var1 > -5; ++var1) {
                class147.field3011[var1] = new class153(104, 104);
            }
            class9.field161 = new class120(512, 512);
            class60.field1238 = 20;
            class95.field1856 = 5;
            class68.field1366 = class125.field2486;
        } else if (~class60.field1238 == -21) {
            int[] var2 = new int[9];
            for (int var3 = 0; ~var3 > -10; ++var3) {
                int var4 = var3 * 32 + 143;
                int var5 = class135.field2797[var4];
                int var6 = var4 * 3 + 600;
                var2[var3] = var5 * var6 >> 16;
            }
            class177.method1118(var2, 500, 800, 512, 334, 25, 3500);
            class68.field1366 = class90.field1802;
            class60.field1238 = 30;
            class95.field1856 = 10;
        } else if (class60.field1238 == 30) {
            class36.field662 = class109.method677(true, -82, false, 0, true);
            class157.field3181 = class109.method677(true, -26, false, 1, true);
            class144.field2968 = class109.method677(false, -17, true, 2, true);
            class32.field596 = class109.method677(true, arg0 + -2109, false, 3, true);
            class182.field3597 = class109.method677(true, -79, false, 4, true);
            class4.field90 = class109.method677(true, arg0 ^ -2119, true, 5, true);
            class189.field3695 = class109.method677(true, arg0 + -2139, true, 6, false);
            class108.field2069 = class109.method677(true, -72, false, 7, true);
            class157.field3171 = class109.method677(true, -93, false, 8, true);
            class47.field948 = class109.method677(false, -114, true, 9, true);
            class58.field1166 = class109.method677(true, arg0 ^ -2097, false, 10, true);
            class80.field1596 = class109.method677(true, -81, false, 11, true);
            class128.field2553 = class109.method677(true, -7, false, 12, true);
            class184.field3632 = class109.method677(false, arg0 ^ -2141, true, 13, true);
            class93.field1835 = class109.method677(true, arg0 ^ -2100, false, 14, false);
            class133.field2777 = class109.method677(true, -126, false, 15, true);
            class95.field1856 = 20;
            class60.field1238 = 40;
            class68.field1366 = class54.field1094;
        } else {
            if (arg0 != 2048) {
                field3585 = null;
            }
            if (class60.field1238 == 40) {
                byte var7 = 0;
                int var8 = var7 + 4 * class36.field662.method497((byte) -68) / 100;
                int var9 = var8 + class157.field3181.method497((byte) -68) * 4 / 100;
                int var10 = var9 + 2 * class144.field2968.method497((byte) -68) / 100;
                int var11 = var10 + class32.field596.method497((byte) -68) * 2 / 100;
                int var12 = var11 + 6 * class182.field3597.method497((byte) -68) / 100;
                int var13 = var12 + 4 * class4.field90.method497((byte) -68) / 100;
                int var14 = var13 + class189.field3695.method497((byte) -68) * 2 / 100;
                int var15 = var14 + class108.field2069.method497((byte) -68) * 60 / 100;
                int var16 = var15 + 2 * class157.field3171.method497((byte) -68) / 100;
                int var17 = var16 + class47.field948.method497((byte) -68) * 2 / 100;
                int var18 = var17 + class58.field1166.method497((byte) -68) * 2 / 100;
                int var19 = var18 + 2 * class80.field1596.method497((byte) -68) / 100;
                int var20 = var19 + 2 * class128.field2553.method497((byte) -68) / 100;
                int var21 = var20 + class184.field3632.method497((byte) -68) * 2 / 100;
                int var22 = var21 + 2 * class93.field1835.method497((byte) -68) / 100;
                int var23 = var22 + class133.field2777.method497((byte) -68) * 2 / 100;
                if (~var23 != -101) {
                    if (var23 != 0) {
                        class68.field1366 = class167.method1036(new class43[] { class23.field447, class30.method161(var23, 10), class90.field1805 }, true);
                    }
                    class95.field1856 = 30;
                } else {
                    class95.field1856 = 30;
                    class68.field1366 = class41.field789;
                    class60.field1238 = 45;
                }
            } else if (~class60.field1238 == -46) {
                method1168(22050, 2, true, !class9.field163);
                class114 var24 = new class114();
                var24.method726((byte) 111, 9, 128);
                class82.field1621 = class85.method515(arg0 ^ 2168, 0, class100.field1911, class32.field585, 22050);
                class82.field1621.method450(2000, var24);
                class93.method596(class133.field2777, -121, var24, class93.field1835, class182.field3597);
                class167.field3295 = class85.method515(125, 1, class100.field1911, class32.field585, 2048);
                class185.field3638 = new class183();
                class167.field3295.method450(2000, class185.field3638);
                class103.field1955 = new class14(22050, class38.field726);
                class95.field1856 = 35;
                class68.field1366 = class108.field2065;
                class60.field1238 = 50;
            } else if (class60.field1238 == 50) {
                int var25 = 0;
                if (class89.field1729 != null) {
                    ++var25;
                } else {
                    class89.field1729 = class108.method672(class18.field308, class110.field2127, class157.field3171, class184.field3632, (byte) -99);
                }
                if (class121.field2405 != null) {
                    ++var25;
                } else {
                    class121.field2405 = class89.field1729;
                }
                if (class23.field451 != null) {
                    ++var25;
                } else {
                    class23.field451 = class108.method672(class13.field187, class110.field2127, class157.field3171, class184.field3632, (byte) -35);
                }
                if (class118.field2294 != null) {
                    ++var25;
                } else {
                    class118.field2294 = class108.method672(class90.field1803, class110.field2127, class157.field3171, class184.field3632, (byte) -98);
                }
                if (~var25 > -5) {
                    class68.field1366 = class167.method1036(new class43[] { class150.field3042, class30.method161(var25 * 100 / 4, 10), class90.field1805 }, true);
                    class95.field1856 = 40;
                } else {
                    class68.field1366 = class15.field233;
                    class95.field1856 = 40;
                    class60.field1238 = 60;
                }
            } else if (~class60.field1238 == -61) {
                int var26 = class124.method800(class58.field1166, class157.field3171, 44);
                int var27 = class7.method37(120);
                if (var26 < var27) {
                    class68.field1366 = class167.method1036(new class43[] { class78.field1553, class30.method161(var26 * 100 / var27, arg0 + -2038), class90.field1805 }, true);
                    class95.field1856 = 50;
                } else {
                    class95.field1856 = 50;
                    class68.field1366 = class74.field1464;
                    class35.method197((byte) -73, 5);
                    class60.field1238 = 70;
                }
            } else if (~class60.field1238 == -71) {
                if (!class144.field2968.method354(arg0 + -2176)) {
                    class68.field1366 = class167.method1036(new class43[] { class187.field3672, class30.method161(class144.field2968.method490(100), 10), class90.field1805 }, true);
                    class95.field1856 = 60;
                } else {
                    class27.method131((byte) -80, class144.field2968);
                    class189.method1203(class144.field2968, (byte) -42);
                    class206.method1339(class108.field2069, class144.field2968, (byte) -105);
                    class126.method813(class9.field163, -1, class144.field2968, class108.field2069);
                    class102.method633(class108.field2069, class144.field2968, (byte) -88);
                    class89.method567(arg0 + -2038, class108.field2069, class144.field2968, class200.field3938, class121.field2405);
                    class2.method15(117, class144.field2968, class157.field3181, class36.field662);
                    class75.method464(class108.field2069, (byte) -94, class144.field2968);
                    class65.method408((byte) -115, class144.field2968);
                    class204.method1317(115, class144.field2968);
                    class90.method585((byte) 85, class108.field2069, class184.field3632, class157.field3171, class32.field596);
                    class32.method185(false, class144.field2968);
                    class80.method489((byte) -97, class144.field2968);
                    class68.field1366 = class115.field2239;
                    class95.field1856 = 60;
                    class119.method759(0);
                    class60.field1238 = 80;
                }
            } else if (~class60.field1238 != -81) {
                if (~class60.field1238 == -91) {
                    if (!class47.field948.method354(-116)) {
                        class68.field1366 = class167.method1036(new class43[] { class124.field2462, class30.method161(class47.field948.method490(arg0 ^ 2148), 10), class90.field1805 }, true);
                        class95.field1856 = 90;
                    } else {
                        class2 var34 = new class2(class47.field948, class157.field3171, 20, class9.field163 ? 64 : 128);
                        class135.method869(var34);
                        class135.method868(0.7F);
                        class60.field1238 = 110;
                        class68.field1366 = class156.field3156;
                        class95.field1856 = 90;
                    }
                } else if (~class60.field1238 == -111) {
                    class23.field453 = new class159();
                    class32.field585.method1011(-9054, class23.field453, 10);
                    class68.field1366 = class153.field3107;
                    class60.field1238 = 120;
                    class95.field1856 = 94;
                } else if (~class60.field1238 == -121) {
                    if (!class58.field1166.method361((byte) 122, class115.field2240, class110.field2127)) {
                        class68.field1366 = class167.method1036(new class43[] { class175.field3476, class28.field500 }, true);
                        class95.field1856 = 96;
                    } else {
                        class149 var35 = new class149(class58.field1166.method355(class110.field2127, (byte) 12, class115.field2240));
                        class16.method72((byte) 27, var35);
                        class68.field1366 = class142.field2938;
                        class95.field1856 = 96;
                        class60.field1238 = 130;
                    }
                } else if (~class60.field1238 == -131) {
                    if (!class32.field596.method354(-116)) {
                        class68.field1366 = class167.method1036(new class43[] { class138.field2855, class30.method161(4 * class32.field596.method490(100) / 5, 10), class90.field1805 }, true);
                        class95.field1856 = 100;
                    } else if (!class128.field2553.method354(-126)) {
                        class68.field1366 = class167.method1036(new class43[] { class138.field2855, class30.method161(80 + class128.field2553.method490(100) / 6, arg0 + -2038), class90.field1805 }, true);
                        class95.field1856 = 100;
                    } else if (!class184.field3632.method354(-127)) {
                        class68.field1366 = class167.method1036(new class43[] { class138.field2855, class30.method161(class184.field3632.method490(100) / 20 + 96, arg0 ^ 2058), class90.field1805 }, true);
                        class95.field1856 = 100;
                    } else {
                        class68.field1366 = class122.field2448;
                        class95.field1856 = 100;
                        class60.field1238 = 140;
                    }
                } else if (~class60.field1238 == -141) {
                    class35.method197((byte) -107, 10);
                }
            } else {
                int var28 = 0;
                if (class107.field2044 == null) {
                    class107.field2044 = class2.method8(class110.field2127, -4666, class189.field3700, class157.field3171);
                } else {
                    ++var28;
                }
                if (class19.field325 != null) {
                    ++var28;
                } else {
                    class19.field325 = class2.method8(class110.field2127, -4666, class21.field361, class157.field3171);
                }
                if (class66.field1330 != null) {
                    ++var28;
                } else {
                    class66.field1330 = class84.method512(class157.field3171, class79.field1566, class110.field2127, (byte) -47);
                }
                if (class77.field1540 == null) {
                    class77.field1540 = class106.method658(-11889, class20.field342, class110.field2127, class157.field3171);
                } else {
                    ++var28;
                }
                if (class173.field3445 == null) {
                    class173.field3445 = class106.method658(-11889, class23.field442, class110.field2127, class157.field3171);
                } else {
                    ++var28;
                }
                if (class207.field4053 != null) {
                    ++var28;
                } else {
                    class207.field4053 = class106.method658(-11889, class115.field2230, class110.field2127, class157.field3171);
                }
                if (class27.field489 == null) {
                    class27.field489 = class106.method658(-11889, class172.field3434, class110.field2127, class157.field3171);
                } else {
                    ++var28;
                }
                if (class136.field2834 == null) {
                    class136.field2834 = class106.method658(arg0 ^ -9841, class185.field3648, class110.field2127, class157.field3171);
                } else {
                    ++var28;
                }
                if (class137.field2837 != null) {
                    ++var28;
                } else {
                    class137.field2837 = class106.method658(arg0 ^ -9841, class161.field3250, class110.field2127, class157.field3171);
                }
                if (class4.field89 != null) {
                    ++var28;
                } else {
                    class4.field89 = class106.method658(-11889, class15.field231, class110.field2127, class157.field3171);
                }
                if (class186.field3658 == null) {
                    class186.field3658 = class106.method658(-11889, class23.field433, class110.field2127, class157.field3171);
                } else {
                    ++var28;
                }
                if (class69.field1380 != null) {
                    ++var28;
                } else {
                    class69.field1380 = class84.method512(class157.field3171, class136.field2824, class110.field2127, (byte) -47);
                }
                if (class36.field677 != null) {
                    ++var28;
                } else {
                    class36.field677 = class84.method512(class157.field3171, class163.field3268, class110.field2127, (byte) -47);
                }
                if (class142.field2931 == null) {
                    class142.field2931 = class193.method1232(class157.field3171, class110.field2127, class82.field1616, -1);
                } else {
                    ++var28;
                }
                if (var28 < 14) {
                    class68.field1366 = class167.method1036(new class43[] { class44.field876, class30.method161(var28 * 100 / 14, 10), class90.field1805 }, true);
                    class95.field1856 = 70;
                } else {
                    class151.field3057 = class36.field677;
                    class19.field325.method778();
                    int var29 = -10 + (int) (21.0D * Math.random());
                    int var30 = -10 + (int) (21.0D * Math.random());
                    int var31 = (int) (Math.random() * 21.0D) + -10;
                    int var32 = -20 + (int) (Math.random() * 41.0D);
                    for (int var33 = 0; ~class77.field1540.length < ~var33; ++var33) {
                        class77.field1540[var33].method768(var29 + var32, var30 - -var32, var31 + var32);
                    }
                    class66.field1330[0].method1161(var29 + var32, var30 - -var32, var31 - -var32);
                    class99.method617(-61);
                    class95.field1856 = 70;
                    class60.field1238 = 90;
                    class68.field1366 = class19.field331;
                }
            }
        }
    }
}
