import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class245 extends class42 {

    @OriginalMember(owner = "client!s", name = "E", descriptor = "I")
    public static int field3745 = -1;

    @OriginalMember(owner = "client!s", name = "K", descriptor = "Ljava/lang/String;")
    public static String field3750 = null;

    @OriginalMember(owner = "client!s", name = "D", descriptor = "Z")
    public static boolean field3744 = true;

    @OriginalMember(owner = "client!s", name = "w", descriptor = "Llc;")
    public static class86 field3737 = new class86(30);

    @OriginalMember(owner = "client!s", name = "x", descriptor = "I")
    public static int field3738;

    @OriginalMember(owner = "client!s", name = "y", descriptor = "I")
    public static int field3739;

    @OriginalMember(owner = "client!s", name = "z", descriptor = "I")
    public static int field3740;

    @OriginalMember(owner = "client!s", name = "A", descriptor = "I")
    public int field3741;

    @OriginalMember(owner = "client!s", name = "F", descriptor = "I")
    public static int field3746;

    @OriginalMember(owner = "client!s", name = "H", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!s", name = "I", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!s", name = "B", descriptor = "Ljava/lang/String;")
    public String field3742;

    @OriginalMember(owner = "client!s", name = "C", descriptor = "Ljava/lang/String;")
    public String field3743;

    @OriginalMember(owner = "client!s", name = "G", descriptor = "[[Z")
    public static boolean[][] field3747;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIII)V")
    public static final void method1647(int arg0, int arg1, int arg2, int arg3) {
        int var4 = -101 % ((-15 - arg2) / 44);
        ++field3739;
        class280 var5 = class181.method1180(arg3, 0, 11);
        var5.method1876(1840457248);
        var5.field4338 = arg1;
        var5.field4330 = arg0;
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(II)Lgk;")
    public static final class159 method1648(int arg0, int arg1) {
        if (arg0 < 64) {
            method1650(-44);
        }
        ++field3740;
        class159 var2 = (class159) class195.field2695.method540((byte) -122, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            class159 var3 = class19.method147(class297.field4689, false, class6.field49, 65280, arg1);
            if (var3 != null) {
                class195.field2695.method543(var3, (long) arg1, 858993459);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Z)Lam;")
    public final class181 method1649(boolean arg0) {
        ++field3749;
        if (!arg0) {
            method1653((byte) 107);
        }
        return class218.field3291[super.field641];
    }

    @OriginalMember(owner = "client!s", name = "e", descriptor = "(I)V")
    public static void method1650(int arg0) {
        field3750 = null;
        if (arg0 != -401) {
            field3744 = true;
        }
        field3737 = null;
        field3747 = null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIZILg;)V")
    public static final void method1651(int arg0, int arg1, boolean arg2, int arg3, class284 arg4) {
        ++field3738;
        if (~class68.field925 > -401) {
            if (arg4.field4450 != null) {
                arg4 = arg4.method1905((byte) -26);
            }
            if (arg4 != null) {
                if (arg4.field4416) {
                    String var5 = arg4.field4424;
                    if (~arg4.field4388 != -1) {
                        String var6 = ~class124.field1746 != -2 ? class101.field1421 : class78.field1092;
                        var5 = var5 + class227.method1504(class217.field3280.field1190, arg4.field4388, 2) + " (" + var6 + arg4.field4388 + ")";
                    }
                    if (arg2) {
                        if (~class141.field1963 == -2) {
                            class238.method1593(class265.field3976, (long) arg1, -30789, arg0, class224.field3405, class238.field3612 + " -> <col=ffff00>" + var5, (short) 5, arg3);
                            ++class63.field871;
                        } else if (!class11.field113) {
                            ++class37.field566;
                            String[] var7 = arg4.field4410;
                            if (class175.field2462) {
                                var7 = class197.method1261(var7, 5);
                            }
                            if (var7 != null) {
                                for (int var8 = 4; var8 >= 0; --var8) {
                                    if (var7[var8] != null && (class124.field1746 != 0 || !var7[var8].equalsIgnoreCase(class132.field1872))) {
                                        ++class283.field4375;
                                        byte var9 = 0;
                                        if (~var8 == -1) {
                                            var9 = 6;
                                        }
                                        int var10 = -1;
                                        if (arg4.field4417 == var8) {
                                            var10 = arg4.field4394;
                                        }
                                        if (~arg4.field4455 == ~var8) {
                                            var10 = arg4.field4390;
                                        }
                                        if (var8 == 1) {
                                            var9 = 37;
                                        }
                                        if (var8 == 2) {
                                            var9 = 42;
                                        }
                                        if (~var8 == -4) {
                                            var9 = 45;
                                        }
                                        if (~var8 == -5) {
                                            var9 = 12;
                                        }
                                        class238.method1593(var10, (long) arg1, -30789, arg0, var7[var8], "<col=ffff00>" + var5, var9, arg3);
                                    }
                                }
                            }
                            if (~class124.field1746 == -1 && var7 != null) {
                                for (int var11 = 4; ~var11 <= -1; --var11) {
                                    if (var7[var11] != null && var7[var11].equalsIgnoreCase(class132.field1872)) {
                                        short var12 = 0;
                                        if (~var11 == -1) {
                                            var12 = 6;
                                        }
                                        short var13 = 0;
                                        if (~arg4.field4388 < ~class217.field3280.field1190) {
                                            var13 = 2000;
                                        }
                                        ++class31.field423;
                                        if (~var11 == -2) {
                                            var12 = 37;
                                        }
                                        if (var11 == 2) {
                                            var12 = 42;
                                        }
                                        if (var11 == 3) {
                                            var12 = 45;
                                        }
                                        if (var11 == 4) {
                                            var12 = 12;
                                        }
                                        if (~var12 != -1) {
                                            var12 += var13;
                                        }
                                        class238.method1593(arg4.field4419, (long) arg1, -30789, arg0, var7[var11], "<col=ffff00>" + var5, var12, arg3);
                                    }
                                }
                            }
                            class238.method1593(class273.field4217, (long) arg1, -30789, arg0, class277.field4295, "<col=ffff00>" + var5, (short) 1005, arg3);
                        } else {
                            class230 var14 = class96.field1357 == -1 ? null : class92.method602(-108, class96.field1357);
                            if ((class285.field4469 & 2) != 0) {
                                if (var14 == null || ~arg4.method1906(0, class96.field1357, var14.field3480) != ~var14.field3480) {
                                    class238.method1593(class93.field1303, (long) arg1, -30789, arg0, class168.field2332, class54.field791 + " -> <col=ffff00>" + var5, (short) 21, arg3);
                                    ++class137.field1914;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "f", descriptor = "(I)V")
    public static final void method1652(int arg0) {
        ++field3746;
        int var1 = class82.field1114.length;
        if (arg0 == -1) {
            for (int var2 = 0; ~var2 > ~var1; ++var2) {
                if (class82.field1114[var2] != null) {
                    int var3 = -1;
                    for (int var4 = 0; var4 < class154.field2130; ++var4) {
                        if (class274.field4242[var2] == class177.field2482[var4]) {
                            var3 = var4;
                            break;
                        }
                    }
                    if (var3 == -1) {
                        class177.field2482[class154.field2130] = class274.field4242[var2];
                        var3 = class154.field2130++;
                    }
                    int var5 = 0;
                    class224 var6 = new class224(class82.field1114[var2]);
                    while (~class82.field1114[var2].length < ~var6.field3402 && var5 < 511) {
                        int var7 = var3 | var5++ << 6;
                        int var8 = var6.method1445(false);
                        int var9 = var8 >> 14;
                        int var10 = 63 & var8;
                        int var11 = (class274.field4242[var2] & 255) * 64 + -class216.field3255 - -var10;
                        int var12 = 63 & var8 >> 7;
                        int var13 = (class274.field4242[var2] >> 8) * 64 + -class37.field565 + var12;
                        class284 var14 = class270.method1783((byte) 75, var6.method1445(false));
                        if (class119.field1679[var7] == null && (var14.field4387 & 1) > 0 && class281.field4361 == var9 && ~var13 <= -1 && ~(var14.field4431 + var13) > -105 && ~var11 <= -1 && ~(var14.field4431 + var11) > -105) {
                            class119.field1679[var7] = new class140();
                            class140 var15 = class119.field1679[var7];
                            class194.field2688[class92.field1283++] = var7;
                            var15.field4090 = class52.field740;
                            var15.method946(var14, arg0);
                            var15.method1744(var15.field1946.field4431, (byte) -102);
                            var15.field4009 = var15.field4010 = class290.field4566[var15.field1946.field4427];
                            var15.field4025 = var15.field1946.field4442;
                            var15.field3991 = var15.field1946.field4401;
                            if (~var15.field3991 == -1) {
                                var15.field4010 = 0;
                            }
                            var15.method1740((byte) 61, var15.method561(arg0), true, var11, var13);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(B)Ljava/lang/String;")
    public static final String method1653(byte arg0) {
        ++field3748;
        String var1 = "www";
        if (arg0 != -95) {
            return null;
        } else {
            if (class34.field533 != 0) {
                var1 = "www-wtqa";
            }
            String var2 = "";
            if (class218.field3287 != null) {
                var2 = "/p=" + class218.field3287;
            }
            return "http://" + var1 + ".runescape.com/l=" + class218.field3288 + "/a=" + class230.field3491 + var2 + "/";
        }
    }
}
