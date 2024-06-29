import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class132 extends class252 {

    @OriginalMember(owner = "client!kg", name = "V", descriptor = "Lve;")
    public static class184 field2303 = new class184(30);

    @OriginalMember(owner = "client!kg", name = "ab", descriptor = "Ljd;")
    private static class85 field2308 = class221.method1499("Discard", (byte) -100);

    @OriginalMember(owner = "client!kg", name = "bb", descriptor = "Ljd;")
    public static class85 field2309 = class221.method1499("<col=40ff00>", (byte) 105);

    @OriginalMember(owner = "client!kg", name = "db", descriptor = "Ljd;")
    public static class85 field2311 = class221.method1499(" x ", (byte) -78);

    @OriginalMember(owner = "client!kg", name = "cb", descriptor = "Ljd;")
    public static class85 field2310 = field2308;

    @OriginalMember(owner = "client!kg", name = "T", descriptor = "I")
    public static int field2301;

    @OriginalMember(owner = "client!kg", name = "U", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!kg", name = "W", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!kg", name = "X", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!kg", name = "Y", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!kg", name = "Z", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(IB)[I")
    public final int[] method149(int arg0, byte arg1) {
        if (arg1 != -55) {
            return null;
        } else {
            int[] var3 = super.field4356.method868(arg0, (byte) -75);
            ++field2305;
            if (super.field4356.field2258) {
                int var4 = class39.field622[arg0];
                for (int var5 = 0; ~class5.field63 < ~var5; ++var5) {
                    var3[var5] = this.method885(var4, class105.field1838[var5], (byte) 79) % 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "(IB)Lqg;")
    public static final class101 method883(int arg0, byte arg1) {
        ++field2301;
        int var2 = -13 % ((-89 - arg1) / 36);
        class101 var3 = (class101) class267.field4757.method1269((long) arg0, (byte) 93);
        if (var3 != null) {
            return var3;
        } else {
            byte[] var4 = class152.field2603.method464(-1, class156.method1027(arg0, 16169), class142.method938(-13, arg0));
            class101 var5 = new class101();
            if (var4 != null) {
                var5.method700((byte) 92, new class247(var4));
            }
            class267.field4757.method1271(-15561, var5, (long) arg0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "(I)V")
    public static void method884(int arg0) {
        field2308 = null;
        field2309 = null;
        field2310 = null;
        field2311 = null;
        field2303 = null;
        if (arg0 != 1003) {
            method883(111, (byte) 18);
        }
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "()V")
    public class132() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIB)I")
    private final int method885(int arg0, int arg1, byte arg2) {
        if (arg2 != 79) {
            method883(46, (byte) 31);
        }
        ++field2304;
        int var4 = arg0 * 57 + arg1;
        int var5 = var4 ^ var4 << 1;
        return -((Integer.MAX_VALUE & (var5 * 15731 * var5 - -789221) * var5 + 1376312589) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IZIIIII)V")
    public static final void method886(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class70.field1303 == 0) {
            int var7 = class51.field896;
            int var8 = class148.field2511;
            ++class95.field1734;
            int var9 = class240.field4137;
            int var10 = class194.field3317;
            int var11 = (arg6 - arg0) * (var9 - var10) / arg2 + var10;
            int var12 = (arg3 - arg5) * (-var8 + var7) / arg4 + var8;
            if (class12.field193 && ~(64 & class227.field3946) == -65) {
                class255 var13 = class67.method449(class105.field1849, (byte) 125, class206.field3606);
                if (var13 != null) {
                    class108.method747(0L, (byte) -107, (short) 4, var11, var12, class34.field526, class150.field2542);
                } else {
                    class32.method224(1);
                }
            } else {
                class108.method747(0L, (byte) 98, (short) 35, var11, var12, class100.field1795, class190.field3263);
            }
        }
        ++field2302;
        if (arg1) {
            long var14 = -1L;
            for (int var16 = 0; class108.field1904 > var16; ++var16) {
                long var17 = class119.field2114[var16];
                int var19 = 127 & (int) var17;
                int var20 = 127 & (int) var17 >> 7;
                int var21 = 3 & (int) var17 >> 29;
                int var22 = (int) (var17 >>> 32) & Integer.MAX_VALUE;
                if (var14 != var17) {
                    var14 = var17;
                    if (var21 == 2 && class231.method1547(class116.field2066, var19, var20, var17)) {
                        class199 var23 = class110.method753(var22, (byte) 122);
                        if (var23.field3474 != null) {
                            var23 = var23.method1355(-1);
                        }
                        if (var23 == null) {
                            continue;
                        }
                        if (class70.field1303 != 1) {
                            if (class12.field193) {
                                if (~(class227.field3946 & 4) == -5) {
                                    class108.method747(var17, (byte) 126, (short) 21, var20, var19, class172.method1150(new class85[] { class30.field452, class67.field1235, var23.field3418 }, 0), class150.field2542);
                                    ++class184.field3158;
                                }
                            } else {
                                ++class32.field488;
                                class85[] var24 = var23.field3435;
                                if (class254.field4388) {
                                    var24 = class256.method1775(5, var24);
                                }
                                if (var24 != null) {
                                    for (int var25 = 4; var25 >= 0; --var25) {
                                        if (var24[var25] != null) {
                                            ++class186.field3195;
                                            short var26 = 0;
                                            if (var25 == 0) {
                                                var26 = 40;
                                            }
                                            if (var25 == 1) {
                                                var26 = 2;
                                            }
                                            if (var25 == 2) {
                                                var26 = 19;
                                            }
                                            if (~var25 == -4) {
                                                var26 = 58;
                                            }
                                            if (~var25 == -5) {
                                                var26 = 1004;
                                            }
                                            class108.method747(var17, (byte) -2, var26, var20, var19, class172.method1150(new class85[] { class6.field71, var23.field3418 }, 0), var24[var25]);
                                        }
                                    }
                                }
                                class108.method747((long) var23.field3420, (byte) -92, (short) 1006, var20, var19, class172.method1150(new class85[] { class6.field71, var23.field3418 }, 0), class219.field3859);
                            }
                        } else {
                            ++class127.field2224;
                            class108.method747(var17, (byte) -108, (short) 37, var20, var19, class172.method1150(new class85[] { class144.field2472, class67.field1235, var23.field3418 }, 0), class77.field1425);
                        }
                    }
                    if (~var21 == -2) {
                        class17 var27 = class194.field3320[var22];
                        if (var27.field247.field4700 == 1 && ~(127 & var27.field1042) == -65 && ~(127 & var27.field1027) == -65) {
                            for (int var28 = 0; ~var28 > ~class44.field775; ++var28) {
                                class17 var31 = class194.field3320[class137.field2380[var28]];
                                if (var31 != null && var27 != var31 && var31.field247.field4700 == 1 && ~var27.field1042 == ~var31.field1042 && ~var27.field1027 == ~var31.field1027) {
                                    class232.method1555(var20, class137.field2380[var28], 16426, var31.field247, var19);
                                }
                            }
                            for (int var29 = 0; ~var29 > ~class196.field3375; ++var29) {
                                class44 var30 = class249.field4291[class151.field2556[var29]];
                                if (var30 != null && ~var27.field1042 == ~var30.field1042 && var27.field1027 == var30.field1027) {
                                    class124.method852(var30, var20, 0, class151.field2556[var29], var19);
                                }
                            }
                        }
                        class232.method1555(var20, var22, 16426, var27.field247, var19);
                    }
                    if (var21 == 0) {
                        class44 var32 = class249.field4291[var22];
                        if (~(var32.field1042 & 127) == -65 && ~(var32.field1027 & 127) == -65) {
                            for (int var33 = 0; class44.field775 > var33; ++var33) {
                                class17 var36 = class194.field3320[class137.field2380[var33]];
                                if (var36 != null && ~var36.field247.field4700 == -2 && ~var32.field1042 == ~var36.field1042 && var32.field1027 == var36.field1027) {
                                    class232.method1555(var20, class137.field2380[var33], 16426, var36.field247, var19);
                                }
                            }
                            for (int var34 = 0; ~class196.field3375 < ~var34; ++var34) {
                                class44 var35 = class249.field4291[class151.field2556[var34]];
                                if (var35 != null && var32 != var35 && var32.field1042 == var35.field1042 && ~var32.field1027 == ~var35.field1027) {
                                    class124.method852(var35, var20, 0, class151.field2556[var34], var19);
                                }
                            }
                        }
                        class124.method852(var32, var20, 0, var22, var19);
                    }
                    if (~var21 == -4) {
                        class15 var37 = class191.field3278[class116.field2066][var19][var20];
                        if (var37 != null) {
                            for (class226 var38 = (class226) var37.method113(85); var38 != null; var38 = (class226) var37.method111((byte) -29)) {
                                int var39 = var38.field3929.field9;
                                class61 var40 = class32.method221(11649, var39);
                                if (class70.field1303 == 1) {
                                    class108.method747((long) var39, (byte) -96, (short) 57, var20, var19, class172.method1150(new class85[] { class144.field2472, class76.field1404, var40.field1106 }, 0), class77.field1425);
                                    ++class156.field2676;
                                } else if (class12.field193) {
                                    if ((1 & class227.field3946) == 1) {
                                        ++class27.field421;
                                        class108.method747((long) var39, (byte) -105, (short) 16, var20, var19, class172.method1150(new class85[] { class30.field452, class76.field1404, var40.field1106 }, 0), class150.field2542);
                                    }
                                } else {
                                    ++class239.field4120;
                                    class85[] var41 = var40.field1151;
                                    if (class254.field4388) {
                                        var41 = class256.method1775(5, var41);
                                    }
                                    for (int var42 = 4; var42 >= 0; --var42) {
                                        if (var41 != null && var41[var42] != null) {
                                            ++class217.field3816;
                                            byte var43 = 0;
                                            if (var42 == 0) {
                                                var43 = 5;
                                            }
                                            if (~var42 == -2) {
                                                var43 = 18;
                                            }
                                            if (~var42 == -3) {
                                                var43 = 48;
                                            }
                                            if (var42 == 3) {
                                                var43 = 12;
                                            }
                                            if (var42 == 4) {
                                                var43 = 51;
                                            }
                                            class108.method747((long) var39, (byte) 2, var43, var20, var19, class172.method1150(new class85[] { class269.field4781, var40.field1106 }, 0), var41[var42]);
                                        } else if (~var42 == -3) {
                                            ++class194.field3323;
                                            class108.method747((long) var39, (byte) 95, (short) 48, var20, var19, class172.method1150(new class85[] { class269.field4781, var40.field1106 }, 0), class198.field3394);
                                        }
                                    }
                                    class108.method747((long) var39, (byte) 124, (short) 1003, var20, var19, class172.method1150(new class85[] { class269.field4781, var40.field1106 }, 0), class219.field3859);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lge;ZIIII)V")
    public static final void method887(class68 arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        class269.field4788 = arg0;
        class40.field635 = 10000;
        class230.field3983 = 1;
        ++field2306;
        class61.field1087 = arg3;
        if (arg2 != 27750) {
            method887((class68) null, false, 110, 103, -78, 44);
        }
        class146.field2489 = arg1;
        class1.field7 = arg4;
        class3.field36 = arg5;
    }
}
