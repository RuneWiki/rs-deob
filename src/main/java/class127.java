import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class127 extends class27 {

    @OriginalMember(owner = "client!wc", name = "Kb", descriptor = "Lo;")
    public static class84 field2798 = class15.method124("Your friendlist is full)3 Max of 100 for free users)1 and 200 for members", 255);

    @OriginalMember(owner = "client!wc", name = "Rb", descriptor = "Lo;")
    public static class84 field2805 = class15.method124("Importing models )2 ", 255);

    @OriginalMember(owner = "client!wc", name = "Pb", descriptor = "[Lo;")
    public static class84[] field2803 = new class84[100];

    @OriginalMember(owner = "client!wc", name = "Yb", descriptor = "Lo;")
    public static class84 field2812 = class15.method124("You need to set*6nnew contact details)3", 255);

    @OriginalMember(owner = "client!wc", name = "ac", descriptor = "Lo;")
    public static class84 field2814 = class15.method124("The server is being updated)3", 255);

    @OriginalMember(owner = "client!wc", name = "Ib", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!wc", name = "Jb", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!wc", name = "Lb", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!wc", name = "Mb", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!wc", name = "Nb", descriptor = "I")
    private int field2801;

    @OriginalMember(owner = "client!wc", name = "Ob", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!wc", name = "Qb", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!wc", name = "Sb", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!wc", name = "Tb", descriptor = "I")
    public static int field2807;

    @OriginalMember(owner = "client!wc", name = "Ub", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!wc", name = "Vb", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!wc", name = "Xb", descriptor = "I")
    public static int field2811;

    @OriginalMember(owner = "client!wc", name = "Wb", descriptor = "Lbe;")
    private class12 field2810;

    @OriginalMember(owner = "client!wc", name = "Zb", descriptor = "Lib;")
    public static class50 field2813;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "(B)I", line = 4)
    public final int method976(byte arg0) {
        if (arg0 != 105) {
            this.method977((int[]) null, -64);
        }
        ++field2799;
        return super.field502[super.field482++] - this.field2810.method107(255) & 255;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "([II)V", line = 16)
    public final void method977(int[] arg0, int arg1) {
        ++field2804;
        int var3 = -15 / ((14 - arg1) / 62);
        this.field2810 = new class12(arg0);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIILud;I)[B", line = 27)
    public static final byte[] method978(int arg0, int arg1, int arg2, class118 arg3, int arg4) {
        ++field2796;
        long var5 = ((long) arg0 << arg2) + (long) (arg4 << 16) - -((long) (65535 & arg4 * 37 + arg1));
        if (class44.field919 != null) {
            class14 var7 = (class14) class44.field919.method737(var5, (byte) -114);
            if (var7 != null) {
                return var7.field257;
            }
        }
        byte[] var8 = arg3.method909((byte) -120, arg1, arg4);
        if (var8 == null) {
            return null;
        } else {
            if (class44.field919 != null) {
                class44.field919.method744(-121, var5, new class14(var8));
            }
            return var8;
        }
    }

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "(II)V", line = 58)
    public final void method979(int arg0, int arg1) {
        super.field502[super.field482++] = (byte) (this.field2810.method107(255) + arg1);
        ++field2797;
        if (arg0 != 1) {
            this.method980(true);
        }
    }

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "(Z)V", line = 75)
    public final void method980(boolean arg0) {
        ++field2807;
        if (!arg0) {
            this.field2801 = super.field482 * 8;
        }
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(I)V", line = 95)
    public class127(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "(I)V", line = 105)
    public static void method981(int arg0) {
        field2814 = null;
        field2813 = null;
        field2805 = null;
        field2798 = null;
        if (arg0 != -1650) {
            field2812 = null;
        }
        field2803 = null;
        field2812 = null;
    }

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "(B)V", line = 130)
    public final void method982(byte arg0) {
        ++field2808;
        super.field482 = (this.field2801 - -7) / 8;
        if (arg0 != 43) {
            this.method982((byte) 126);
        }
    }

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "(I)V", line = 148)
    public static final void method983(int arg0) {
        ++field2800;
        while (true) {
            label288: do {
                while (class116.method890(-14465)) {
                    if (class27.field528 != -1 && class88.field1990 == class27.field528) {
                        if (~class44.field899 == -86 && ~class73.field1528.method639(-117) < -1) {
                            class73.field1528 = class73.field1528.method650(-1 + class73.field1528.method639(arg0 ^ 15), arg0 ^ -31, 0);
                        }
                        continue label288;
                    }
                    if (class86.field1961) {
                        if (class44.field899 == 85 && class73.field1526.method639(arg0 + 126) > 0) {
                            class73.field1526 = class73.field1526.method650(class73.field1526.method639(-127) - 1, -32, 0);
                            class85.field1927 = true;
                        }
                        if (class88.method699(class5.field84, 127) && ~class73.field1526.method639(arg0 + -113) > -81) {
                            class73.field1526 = class73.field1526.method662((byte) -82, class5.field84);
                            class85.field1927 = true;
                        }
                        if (class44.field899 == 84) {
                            class85.field1927 = true;
                            class86.field1961 = false;
                            if (class112.field2430 == 1) {
                                long var1 = class73.field1526.method649((byte) -125);
                                class75.method565(var1, -116);
                            }
                            if (class112.field2430 == 2 && ~class27.field537 < -1) {
                                long var3 = class73.field1526.method649((byte) -127);
                                class82.method602(-50, var3);
                            }
                            if (~class112.field2430 == -4 && ~class73.field1526.method639(-88) < -1) {
                                class97.field2070.method979(1, 22);
                                ++class88.field1979;
                                class97.field2070.method226(-9646, 0);
                                int var5 = class97.field2070.field482;
                                class97.field2070.method203(-24628, class65.field1403);
                                class40.method355(class73.field1526, 111, class97.field2070);
                                class97.field2070.method254(-128, -var5 + class97.field2070.field482);
                                if (~class125.field2771 == -3) {
                                    ++class84.field1889;
                                    class125.field2771 = 1;
                                    class61.field1271 = true;
                                    class97.field2070.method979(1, 132);
                                    class97.field2070.method226(-9646, class28.field550);
                                    class97.field2070.method226(arg0 + -9647, class125.field2771);
                                    class97.field2070.method226(-9646, class123.field2756);
                                }
                            }
                            if (class112.field2430 == 4 && class118.field2629 < 100) {
                                long var6 = class73.field1526.method649((byte) -128);
                                class17.method133((byte) 45, var6);
                            }
                            if (~class112.field2430 == -6 && class118.field2629 > 0) {
                                long var8 = class73.field1526.method649((byte) -128);
                                class100.method757((byte) -42, var8);
                            }
                        }
                    } else if (~class120.field2654 == -2) {
                        if (~class44.field899 == -86 && ~class73.field1523.method639(121) < -1) {
                            class73.field1523 = class73.field1523.method650(class73.field1523.method639(121) + -1, -32, 0);
                            class85.field1927 = true;
                        }
                        if (class78.method575(class5.field84, (byte) -122) && class73.field1523.method639(arg0 ^ -28) < 10) {
                            class73.field1523 = class73.field1523.method662((byte) -116, class5.field84);
                            class85.field1927 = true;
                        }
                        if (~class44.field899 == -85) {
                            if (~class73.field1523.method639(arg0 ^ 6) < -1) {
                                ++class38.field734;
                                int var10 = 0;
                                if (class73.field1523.method646(-126)) {
                                    var10 = class73.field1523.method668((byte) 55);
                                }
                                class97.field2070.method979(1, 122);
                                class97.field2070.method248(var10, -2147393384);
                            }
                            class85.field1927 = true;
                            class120.field2654 = 0;
                        }
                    } else if (class120.field2654 != 2) {
                        if (~class120.field2654 != -4) {
                            if (~class104.field2202 == 0 && class103.field2165 == -1) {
                                if (class44.field899 == 85 && class73.field1539.method639(-93) > 0) {
                                    class73.field1539 = class73.field1539.method650(-1 + class73.field1539.method639(arg0 ^ -62), arg0 ^ -31, 0);
                                    class85.field1927 = true;
                                }
                                if (class88.method699(class5.field84, arg0 + 126) && ~class73.field1539.method639(-36) > -81) {
                                    class73.field1539 = class73.field1539.method662((byte) -92, class5.field84);
                                    class85.field1927 = true;
                                }
                                if (class44.field899 == 84 && ~class73.field1539.method639(-61) < -1) {
                                    if (~class73.field1542 == -3) {
                                        if (class73.field1539.method654(-10, class82.field1755)) {
                                            class40.method357(arg0 ^ -19029);
                                        }
                                        if (class73.field1539.method654(-10, class99.field2109)) {
                                            class115.field2503 = true;
                                        }
                                        if (class73.field1539.method654(-10, class30.field597)) {
                                            class115.field2503 = false;
                                        }
                                        if (class73.field1539.method654(-10, class78.field1646)) {
                                            for (int var11 = 0; var11 < 4; ++var11) {
                                                for (int var12 = 1; ~var12 > -104; ++var12) {
                                                    for (int var13 = 1; var13 < 103; ++var13) {
                                                        class93.field2034[var11].field654[var12][var13] = 0;
                                                    }
                                                }
                                            }
                                        }
                                        if (class73.field1539.method654(arg0 + -11, class11.field211) && class109.field2365 == 2) {
                                            throw new RuntimeException();
                                        }
                                        if (class73.field1539.method654(-10, class61.field1270)) {
                                            class84.field1892 = true;
                                        }
                                    }
                                    if (class73.field1539.method638(class28.field567, 68)) {
                                        ++class58.field1206;
                                        class97.field2070.method979(arg0, 92);
                                        class97.field2070.method226(arg0 ^ -9645, class73.field1539.method639(121) - 1);
                                        class97.field2070.method206(class73.field1539.method655(28418, 2), (byte) -63);
                                    } else {
                                        ++class63.field1293;
                                        class84 var14 = class73.field1539.method666(-104);
                                        byte var15 = 0;
                                        byte var16 = 0;
                                        if (var14.method638(class54.field1131, 112)) {
                                            var15 = 0;
                                            class73.field1539 = class73.field1539.method655(28418, 7);
                                        } else if (var14.method638(class38.field744, 76)) {
                                            class73.field1539 = class73.field1539.method655(28418, 4);
                                            var15 = 1;
                                        } else if (var14.method638(client.field320, 50)) {
                                            class73.field1539 = class73.field1539.method655(arg0 + 28417, 6);
                                            var15 = 2;
                                        } else if (var14.method638(class35.field692, 90)) {
                                            var15 = 3;
                                            class73.field1539 = class73.field1539.method655(28418, 5);
                                        } else if (!var14.method638(class100.field2131, 88)) {
                                            if (var14.method638(class17.field312, 102)) {
                                                var15 = 5;
                                                class73.field1539 = class73.field1539.method655(28418, 6);
                                            } else if (!var14.method638(class25.field424, arg0 + 61)) {
                                                if (var14.method638(class60.field1249, 88)) {
                                                    var15 = 7;
                                                    class73.field1539 = class73.field1539.method655(28418, 7);
                                                } else if (var14.method638(class100.field2128, 64)) {
                                                    var15 = 8;
                                                    class73.field1539 = class73.field1539.method655(28418, 7);
                                                } else if (var14.method638(class109.field2366, 98)) {
                                                    var15 = 9;
                                                    class73.field1539 = class73.field1539.method655(28418, 6);
                                                } else if (var14.method638(class73.field1535, 88)) {
                                                    var15 = 10;
                                                    class73.field1539 = class73.field1539.method655(arg0 + 28417, 6);
                                                } else if (var14.method638(class101.field2161, 91)) {
                                                    class73.field1539 = class73.field1539.method655(arg0 ^ 28419, 6);
                                                    var15 = 11;
                                                }
                                            } else {
                                                class73.field1539 = class73.field1539.method655(arg0 + 28417, 7);
                                                var15 = 6;
                                            }
                                        } else {
                                            var15 = 4;
                                            class73.field1539 = class73.field1539.method655(28418, 7);
                                        }
                                        class84 var17 = class73.field1539.method666(arg0 ^ -126);
                                        if (var17.method638(class75.field1629, 52)) {
                                            class73.field1539 = class73.field1539.method655(28418, 5);
                                            var16 = 1;
                                        } else if (var17.method638(class11.field225, arg0 + 88)) {
                                            var16 = 2;
                                            class73.field1539 = class73.field1539.method655(28418, 6);
                                        } else if (var17.method638(class51.field1101, 105)) {
                                            var16 = 3;
                                            class73.field1539 = class73.field1539.method655(28418, 6);
                                        } else if (var17.method638(class112.field2440, 78)) {
                                            var16 = 4;
                                            class73.field1539 = class73.field1539.method655(28418, 7);
                                        } else if (var17.method638(class85.field1947, arg0 + 86)) {
                                            class73.field1539 = class73.field1539.method655(28418, 6);
                                            var16 = 5;
                                        }
                                        class97.field2070.method979(1, 40);
                                        class97.field2070.method226(-9646, 0);
                                        int var18 = class97.field2070.field482;
                                        class97.field2070.method226(-9646, var15);
                                        class97.field2070.method226(-9646, var16);
                                        class40.method355(class73.field1539, 113, class97.field2070);
                                        class97.field2070.method254(arg0 ^ -127, -var18 + class97.field2070.field482);
                                        if (class28.field550 == 2) {
                                            class28.field550 = 3;
                                            class61.field1271 = true;
                                            ++class84.field1889;
                                            class97.field2070.method979(1, 132);
                                            class97.field2070.method226(arg0 ^ -9645, class28.field550);
                                            class97.field2070.method226(-9646, class125.field2771);
                                            class97.field2070.method226(-9646, class123.field2756);
                                        }
                                    }
                                    class73.field1539 = class73.field1524;
                                    class85.field1927 = true;
                                }
                            }
                        } else {
                            if (class44.field899 == 85 && ~class73.field1523.method639(arg0 + 124) < -1) {
                                class73.field1523 = class73.field1523.method650(-1 + class73.field1523.method639(0), arg0 ^ -31, 0);
                                class85.field1927 = true;
                            }
                            if (class88.method699(class5.field84, 127) && class73.field1523.method639(120) < 40) {
                                class73.field1523 = class73.field1523.method662((byte) -117, class5.field84);
                                class85.field1927 = true;
                            }
                        }
                    } else {
                        if (class44.field899 == 85 && ~class73.field1523.method639(-115) < -1) {
                            class73.field1523 = class73.field1523.method650(class73.field1523.method639(123) + -1, arg0 ^ -31, 0);
                            class85.field1927 = true;
                        }
                        if ((class1.method2(-123, class5.field84) || class5.field84 == 32) && class73.field1523.method639(-66) < 12) {
                            class73.field1523 = class73.field1523.method662((byte) -63, class5.field84);
                            class85.field1927 = true;
                        }
                        if (class44.field899 == 84) {
                            if (~class73.field1523.method639(-24) < -1) {
                                class97.field2070.method979(1, 51);
                                ++class75.field1568;
                                class97.field2070.method203(-24628, class73.field1523.method649((byte) -126));
                            }
                            class85.field1927 = true;
                            class120.field2654 = 0;
                        }
                    }
                }
                if (arg0 != 1) {
                    method978(-59, -30, 60, (class118) null, 89);
                    return;
                }
                return;
            } while (!class1.method2(-123, class5.field84) && ~class5.field84 != -33);
            if (class73.field1528.method639(127) < 12) {
                class73.field1528 = class73.field1528.method662((byte) -105, class5.field84);
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lud;Lud;BZ)V", line = 640)
    public static final void method984(class118 arg0, class118 arg1, byte arg2, boolean arg3) {
        class65.field1395 = arg0;
        class50.field1086 = arg3;
        ++field2802;
        if (arg2 != -123) {
            field2812 = null;
        }
        class48.field1009 = arg1;
        class45.field946 = class48.field1009.method917(10, (byte) 120);
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(ZI)I", line = 655)
    public final int method985(boolean arg0, int arg1) {
        if (!arg0) {
            field2798 = null;
        }
        ++field2806;
        return arg1 * 8 + -this.field2801;
    }

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "(II)I", line = 671)
    public final int method986(int arg0, int arg1) {
        ++field2809;
        int var3 = this.field2801 >> 3;
        int var4 = -27 % ((-10 - arg0) / 50);
        int var5 = -(7 & this.field2801) + 8;
        this.field2801 += arg1;
        int var6 = 0;
        while (~var5 > ~arg1) {
            var6 += (super.field502[var3++] & class57.field1183[var5]) << -var5 + arg1;
            arg1 -= var5;
            var5 = 8;
        }
        int var7;
        if (arg1 == var5) {
            var7 = (class57.field1183[var5] & super.field502[var3]) + var6;
        } else {
            var7 = (super.field502[var3] >> -arg1 + var5 & class57.field1183[arg1]) + var6;
        }
        return var7;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZLud;ILud;I)Lsb;", line = 702)
    public static final class106 method987(boolean arg0, class118 arg1, int arg2, class118 arg3, int arg4) {
        ++field2811;
        boolean var5 = true;
        int[] var6 = arg1.method922((byte) -100, arg4);
        int var7 = 0;
        if (arg2 != 32214) {
            return null;
        } else {
            while (~var7 > ~var6.length) {
                byte[] var8 = arg1.method902(arg4, var6[var7], -1);
                if (var8 == null) {
                    var5 = false;
                } else {
                    int var9 = var8[0] << 8 & 65280 | var8[1] & 255;
                    byte[] var10;
                    if (!arg0) {
                        var10 = arg3.method902(var9, 0, -1);
                    } else {
                        var10 = arg3.method902(0, var9, -1);
                    }
                    if (var10 == null) {
                        var5 = false;
                    }
                }
                ++var7;
            }
            if (!var5) {
                return null;
            } else {
                try {
                    return new class106(arg1, arg3, arg4, arg0);
                } catch (Exception var11) {
                    return null;
                }
            }
        }
    }
}
