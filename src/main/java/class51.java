import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class51 extends class446 {

    @OriginalMember(owner = "client!vg", name = "Mb", descriptor = "I")
    public static int field739 = 0;

    @OriginalMember(owner = "client!vg", name = "Nb", descriptor = "Lsh;")
    public static class472 field740 = new class472(5, -2);

    @OriginalMember(owner = "client!vg", name = "Sb", descriptor = "[I")
    public static int[] field745 = new int[4096];

    @OriginalMember(owner = "client!vg", name = "Qb", descriptor = "I")
    public static int field743 = 1;

    @OriginalMember(owner = "client!vg", name = "B", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!vg", name = "F", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!vg", name = "Db", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!vg", name = "Eb", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!vg", name = "Fb", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!vg", name = "Gb", descriptor = "I")
    private int field733;

    @OriginalMember(owner = "client!vg", name = "Hb", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!vg", name = "Jb", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!vg", name = "Kb", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!vg", name = "Lb", descriptor = "I")
    public static int field738;

    @OriginalMember(owner = "client!vg", name = "Pb", descriptor = "I")
    public static int field742;

    @OriginalMember(owner = "client!vg", name = "Rb", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "client!vg", name = "Ob", descriptor = "J")
    public static long field741;

    @OriginalMember(owner = "client!vg", name = "Ib", descriptor = "Lrk;")
    private class312 field735;

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "(B)I", line = 5)
    public final int method368(byte arg0) {
        ++field738;
        int var2 = 255 & super.field6316[super.field6315++] + -this.field735.method1932((byte) -87);
        if (var2 < 128) {
            return var2;
        } else {
            if (arg0 != -4) {
                this.field733 = 80;
            }
            return (var2 - 128 << 8) - -(255 & super.field6316[super.field6315++] - this.field735.method1932((byte) -118));
        }
    }

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "(BI)I", line = 21)
    public final int method369(byte arg0, int arg1) {
        ++field728;
        int var3 = this.field733 >> 3;
        if (arg0 != 126) {
            return -31;
        } else {
            int var4 = 8 - (7 & this.field733);
            this.field733 += arg1;
            int var5 = 0;
            while (arg1 > var4) {
                var5 += (super.field6316[var3++] & class297.field4452[var4]) << -var4 + arg1;
                arg1 -= var4;
                var4 = 8;
            }
            int var6;
            if (~arg1 == ~var4) {
                var6 = (super.field6316[var3] & class297.field4452[var4]) + var5;
            } else {
                var6 = (super.field6316[var3] >> var4 - arg1 & class297.field4452[arg1]) + var5;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(I)V", line = 58)
    public class51(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ILsk;)V", line = 64)
    public static final void method370(int arg0, class309 arg1) {
        arg1.field4629 = false;
        ++field737;
        if (arg1.field4620 != -1) {
            class356 var2 = class170.field2423.method1586(arg1.field4620, (byte) 36);
            if (var2 != null && var2.field5389 != null) {
                label300: {
                    ++arg1.field4604;
                    if (var2.field5389.length > arg1.field4610 && ~var2.field5421[arg1.field4610] > ~arg1.field4604) {
                        arg1.field4604 = 1;
                        ++arg1.field4610;
                        ++arg1.field4662;
                        class210.method1416(arg1.field4610, arg1.field4543, class472.field6622 == arg1, arg1.field4545, var2, 15806, arg1.field4538);
                    }
                    if (var2.field5389.length <= arg1.field4610) {
                        arg1.field4604 = 0;
                        arg1.field4610 = 0;
                        if (arg1.field4663) {
                            arg1.field4620 = arg1.method1917(0).method1986((byte) -24);
                            if (arg1.field4620 == -1) {
                                arg1.field4663 = false;
                                break label300;
                            }
                            var2 = class170.field2423.method1586(arg1.field4620, (byte) 36);
                        }
                        class210.method1416(arg1.field4610, arg1.field4543, class472.field6622 == arg1, arg1.field4545, var2, 15806, arg1.field4538);
                    }
                    arg1.field4662 = arg1.field4610 - -1;
                    if (arg1.field4662 >= var2.field5389.length) {
                        arg1.field4662 = 0;
                    }
                }
            } else {
                arg1.field4620 = -1;
                arg1.field4663 = false;
            }
        }
        if (~arg1.field4618 != 0 && arg1.field4637 <= class452.field6418) {
            class188 var3 = class322.field4848.method951(arg1.field4618, (byte) 88);
            int var4 = var3.field2862;
            if (~var4 == 0) {
                arg1.field4618 = -1;
            } else {
                label302: {
                    class356 var5 = class170.field2423.method1586(var4, (byte) 36);
                    if (var3.field2861) {
                        if (~var5.field5409 != -4) {
                            if (~var5.field5409 == -2 && arg1.field4673 > 0 && arg1.field4616 <= class452.field6418 && ~class452.field6418 < ~arg1.field4628) {
                                arg1.field4637 = class452.field6418 + 1;
                                break label302;
                            }
                        } else if (~arg1.field4673 < -1 && ~class452.field6418 <= ~arg1.field4616 && arg1.field4628 < class452.field6418) {
                            arg1.field4618 = -1;
                            break label302;
                        }
                    }
                    if (var5 != null && var5.field5389 != null) {
                        if (arg1.field4659 < 0) {
                            arg1.field4659 = 0;
                            class210.method1416(0, arg1.field4543, class472.field6622 == arg1, arg1.field4545, var5, 15806, arg1.field4538);
                        }
                        ++arg1.field4658;
                        if (~arg1.field4659 > ~var5.field5389.length && var5.field5421[arg1.field4659] < arg1.field4658) {
                            ++arg1.field4659;
                            arg1.field4658 = 1;
                            class210.method1416(arg1.field4659, arg1.field4543, class472.field6622 == arg1, arg1.field4545, var5, 15806, arg1.field4538);
                        }
                        if (var5.field5389.length <= arg1.field4659) {
                            if (!var3.field2861) {
                                arg1.field4618 = -1;
                            } else {
                                arg1.field4659 -= var5.field5414;
                                ++arg1.field4646;
                                if (~var5.field5402 >= ~arg1.field4646) {
                                    arg1.field4618 = -1;
                                } else if (arg1.field4659 >= 0 && var5.field5389.length > arg1.field4659) {
                                    class210.method1416(arg1.field4659, arg1.field4543, class472.field6622 == arg1, arg1.field4545, var5, 15806, arg1.field4538);
                                } else {
                                    arg1.field4618 = -1;
                                }
                            }
                        }
                        arg1.field4608 = arg1.field4659 + 1;
                        if (var5.field5389.length <= arg1.field4608) {
                            if (var3.field2861) {
                                arg1.field4608 -= var5.field5414;
                                if (var5.field5402 <= arg1.field4646 + 1) {
                                    arg1.field4608 = -1;
                                } else if (~arg1.field4608 > -1 || ~var5.field5389.length >= ~arg1.field4608) {
                                    arg1.field4608 = -1;
                                }
                            } else {
                                arg1.field4608 = -1;
                            }
                        }
                    } else {
                        arg1.field4618 = -1;
                    }
                }
            }
        }
        if (~arg1.field4612 != 0 && ~arg1.field4601 >= -2) {
            class356 var6 = class170.field2423.method1586(arg1.field4612, (byte) 36);
            if (~var6.field5409 != -4) {
                if (var6.field5409 == 1 && arg1.field4673 > 0 && class452.field6418 >= arg1.field4616 && ~class452.field6418 < ~arg1.field4628) {
                    arg1.field4601 = 2;
                }
            } else if (~arg1.field4673 < -1 && ~arg1.field4616 >= ~class452.field6418 && arg1.field4628 < class452.field6418) {
                arg1.field4612 = -1;
            }
        }
        if (~arg1.field4612 != 0 && arg1.field4601 == 0) {
            class356 var7 = class170.field2423.method1586(arg1.field4612, (byte) 36);
            if (var7 != null && var7.field5389 != null) {
                ++arg1.field4636;
                if (~arg1.field4600 > ~var7.field5389.length && ~arg1.field4636 < ~var7.field5421[arg1.field4600]) {
                    arg1.field4636 = 1;
                    ++arg1.field4600;
                    class210.method1416(arg1.field4600, arg1.field4543, class472.field6622 == arg1, arg1.field4545, var7, 15806, arg1.field4538);
                }
                if (arg1.field4600 >= var7.field5389.length) {
                    ++arg1.field4642;
                    arg1.field4600 -= var7.field5414;
                    if (~var7.field5402 >= ~arg1.field4642) {
                        arg1.field4612 = -1;
                    } else if (arg1.field4600 >= 0 && arg1.field4600 < var7.field5389.length) {
                        class210.method1416(arg1.field4600, arg1.field4543, class472.field6622 == arg1, arg1.field4545, var7, 15806, arg1.field4538);
                    } else {
                        arg1.field4612 = -1;
                    }
                }
                arg1.field4603 = arg1.field4600 + 1;
                if (~var7.field5389.length >= ~arg1.field4603) {
                    arg1.field4603 -= var7.field5414;
                    if (~var7.field5402 < ~(arg1.field4642 - -1)) {
                        if (~arg1.field4603 > -1 || ~arg1.field4603 <= ~var7.field5389.length) {
                            arg1.field4603 = -1;
                        }
                    } else {
                        arg1.field4603 = -1;
                    }
                }
                arg1.field4629 = var7.field5394;
            } else {
                arg1.field4612 = -1;
            }
        }
        int var8 = 17 / ((arg0 - -46) / 44);
        if (~arg1.field4601 < -1) {
            --arg1.field4601;
        }
        for (int var9 = 0; var9 < arg1.field4649.length; ++var9) {
            class414 var10 = arg1.field4649[var9];
            if (var10 != null) {
                if (var10.field5970 > 0) {
                    --var10.field5970;
                } else {
                    class356 var11 = class170.field2423.method1586(var10.field5974, (byte) 36);
                    if (var11 != null && var11.field5389 != null) {
                        ++var10.field5969;
                        if (var11.field5389.length > var10.field5973 && var10.field5969 > var11.field5421[var10.field5973]) {
                            var10.field5969 = 1;
                            ++var10.field5973;
                            class210.method1416(var10.field5973, arg1.field4543, class472.field6622 == arg1, arg1.field4545, var11, 15806, arg1.field4538);
                        }
                        if (var11.field5389.length <= var10.field5973) {
                            var10.field5973 -= var11.field5414;
                            ++var10.field5975;
                            if (~var11.field5402 >= ~var10.field5975) {
                                arg1.field4649[var9] = null;
                            } else if (var10.field5973 >= 0 && var11.field5389.length > var10.field5973) {
                                class210.method1416(var10.field5973, arg1.field4543, class472.field6622 == arg1, arg1.field4545, var11, 15806, arg1.field4538);
                            } else {
                                arg1.field4649[var9] = null;
                            }
                        }
                        var10.field5966 = var10.field5973 - -1;
                        if (var10.field5966 >= var11.field5389.length) {
                            var10.field5966 -= var11.field5414;
                            if (~(var10.field5975 + 1) > ~var11.field5402) {
                                if (~var10.field5966 > -1 || var11.field5389.length <= var10.field5966) {
                                    var10.field5966 = -1;
                                }
                            } else {
                                var10.field5966 = -1;
                            }
                        }
                    } else {
                        arg1.field4649[var9] = null;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "(Z)V", line = 385)
    public final void method371(boolean arg0) {
        ++field734;
        super.field6315 = (this.field733 + 7) / 8;
        if (!arg0) {
            this.method368((byte) -87);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "([IB)V", line = 398)
    public final void method372(int[] arg0, byte arg1) {
        ++field742;
        if (arg1 <= -12) {
            this.field735 = new class312(arg0);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(II[BI)V", line = 411)
    public final void method373(int arg0, int arg1, byte[] arg2, int arg3) {
        ++field744;
        for (int var5 = arg3; arg1 > var5; ++var5) {
            arg2[arg0 + var5] = (byte) (super.field6316[super.field6315++] + -this.field735.method1932((byte) -116));
        }
    }

    @OriginalMember(owner = "client!vg", name = "k", descriptor = "(B)Z", line = 425)
    public final boolean method374(byte arg0) {
        if (arg0 >= -26) {
            this.field735 = null;
        }
        ++field731;
        int var2 = super.field6316[super.field6315] + -this.field735.method1931(115) & 255;
        return ~var2 <= -129;
    }

    @OriginalMember(owner = "client!vg", name = "x", descriptor = "(I)V", line = 442)
    public static void method375(int arg0) {
        if (arg0 != -2) {
            method375(-128);
        }
        field745 = null;
        field740 = null;
    }

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "(BI)V", line = 453)
    public final void method376(byte arg0, int arg1) {
        ++field730;
        super.field6316[super.field6315++] = (byte) (arg1 + this.field735.method1932((byte) -107));
        if (arg0 != 87) {
            this.method368((byte) 125);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IZLjava/lang/String;Ljava/lang/String;)V", line = 464)
    public static final void method377(int arg0, boolean arg1, String arg2, String arg3) {
        ++field732;
        class324.field4860 = arg3;
        class301.field4485 = arg2;
        class356.field5410 = arg0;
        if (!class324.field4860.equals("") && !class301.field4485.equals("")) {
            if (~class212.field3196 != 0) {
                class286.method1828(-3);
            } else {
                class225.field3268 = 0;
                class6.field107 = -3;
                class390.field5726 = 1;
                class73.field981 = 0;
                class446 var4 = new class446(128);
                var4.method2619((byte) -121, 10);
                var4.method2596((byte) -41, (int) (9.9999999E7D * Math.random()));
                var4.method2581(-1973283408, class479.method2812(class324.field4860, 0));
                var4.method2596((byte) -10, (int) (Math.random() * 9.9999999E7D));
                var4.method2597(class301.field4485, (byte) -117);
                var4.method2596((byte) -61, (int) (9.9999999E7D * Math.random()));
                var4.method2584(class266.field3940, class486.field6829, (byte) 54);
                class230.field3390.field6315 = 0;
                if (arg1) {
                    class230.field3390.method2619((byte) 53, class109.field1546.field2407);
                    class230.field3390.method2619((byte) -128, var4.field6315 + 2);
                    class230.field3390.method2592(575, (byte) -123);
                    class230.field3390.method2606(0, var4.field6315, var4.field6316, (byte) 0);
                }
            }
        } else {
            class6.field107 = 3;
        }
    }

    @OriginalMember(owner = "client!vg", name = "l", descriptor = "(B)V", line = 515)
    public final void method378(byte arg0) {
        if (arg0 < 80) {
            field745 = null;
        }
        this.field733 = super.field6315 * 8;
        ++field729;
    }

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "(BI)I", line = 539)
    public final int method379(byte arg0, int arg1) {
        if (arg0 > -32) {
            return -1;
        } else {
            ++field736;
            return arg1 * 8 - this.field733;
        }
    }
}
