import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class236 extends class144 {

    @OriginalMember(owner = "client!wc", name = "pc", descriptor = "I")
    public int field3802 = -1;

    @OriginalMember(owner = "client!wc", name = "mc", descriptor = "I")
    public int field3799 = -1;

    @OriginalMember(owner = "client!wc", name = "tc", descriptor = "Z")
    public boolean field3806 = false;

    @OriginalMember(owner = "client!wc", name = "xc", descriptor = "B")
    private byte field3810 = 0;

    @OriginalMember(owner = "client!wc", name = "yc", descriptor = "I")
    public int field3811 = 0;

    @OriginalMember(owner = "client!wc", name = "zc", descriptor = "I")
    public int field3812 = 0;

    @OriginalMember(owner = "client!wc", name = "Ec", descriptor = "I")
    public int field3817 = 0;

    @OriginalMember(owner = "client!wc", name = "Hc", descriptor = "I")
    public int field3820 = -1;

    @OriginalMember(owner = "client!wc", name = "Ic", descriptor = "I")
    public int field3821 = 0;

    @OriginalMember(owner = "client!wc", name = "Ac", descriptor = "I")
    public int field3813 = -1;

    @OriginalMember(owner = "client!wc", name = "Jc", descriptor = "I")
    public int field3822 = 255;

    @OriginalMember(owner = "client!wc", name = "Lc", descriptor = "I")
    public int field3824 = 0;

    @OriginalMember(owner = "client!wc", name = "Gc", descriptor = "I")
    public int field3819 = -1;

    @OriginalMember(owner = "client!wc", name = "Oc", descriptor = "I")
    public int field3827 = -1;

    @OriginalMember(owner = "client!wc", name = "Cc", descriptor = "I")
    public int field3815 = -1;

    @OriginalMember(owner = "client!wc", name = "Bc", descriptor = "Lvg;")
    public static class75 field3814 = new class75(5000);

    @OriginalMember(owner = "client!wc", name = "Qc", descriptor = "J")
    public static long field3829 = 0L;

    @OriginalMember(owner = "client!wc", name = "oc", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!wc", name = "rc", descriptor = "I")
    public static int field3804;

    @OriginalMember(owner = "client!wc", name = "sc", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!wc", name = "uc", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!wc", name = "vc", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!wc", name = "wc", descriptor = "I")
    public static int field3809;

    @OriginalMember(owner = "client!wc", name = "Dc", descriptor = "I")
    public static int field3816;

    @OriginalMember(owner = "client!wc", name = "Fc", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!wc", name = "Kc", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!wc", name = "Mc", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!wc", name = "Nc", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!wc", name = "Pc", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!wc", name = "Rc", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!wc", name = "Sc", descriptor = "J")
    public static long field3831;

    @OriginalMember(owner = "client!wc", name = "Tc", descriptor = "Lhc;")
    public static class235 field3832;

    @OriginalMember(owner = "client!wc", name = "nc", descriptor = "La;")
    public class49 field3800;

    @OriginalMember(owner = "client!wc", name = "qc", descriptor = "Ljava/lang/String;")
    public String field3803;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(Z)Ljava/lang/String;")
    public final String method1620(boolean arg0) {
        if (arg0) {
            return null;
        } else {
            ++field3809;
            String var2 = this.field3803;
            if (class98.field1652 != null) {
                var2 = class98.field1652[this.field3810] + var2;
            }
            if (class72.field1216 != null) {
                var2 = var2 + class72.field1216[this.field3810];
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!wc", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field3801;
    }

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "(I)I")
    public final int method326(int arg0) {
        ++field3828;
        return arg0 <= 17 ? -101 : super.field2270;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lai;I)V")
    public final void method1621(class88 arg0, int arg1) {
        arg0.field1535 = 0;
        ++field3804;
        int var3 = arg0.method633(79);
        boolean var4 = (var3 & 4) != arg1;
        int var5 = 1 & var3;
        int var6 = super.method971(65535);
        this.method967(((var3 & 60) >> 3) + 1, (byte) -30);
        this.field3810 = (byte) ((var3 & 231) >> 6);
        super.field2240 += (-var6 + this.method971(arg1 ^ 65535)) * 64;
        super.field2278 += 64 * (-var6 + this.method971(65535));
        int var7 = -1;
        int[] var8 = new int[12];
        this.field3827 = arg0.method656(-252);
        this.field3799 = arg0.method656(-252);
        this.field3824 = 0;
        for (int var9 = 0; var9 < 12; ++var9) {
            int var10 = arg0.method633(arg1 ^ 90);
            if (var10 == 0) {
                var8[var9] = 0;
            } else {
                int var11 = arg0.method633(59);
                int var12 = (var10 << 8) - -var11;
                if (var9 == 0 && var12 == 65535) {
                    var7 = arg0.method645(arg1 + 11596);
                    this.field3824 = arg0.method633(48);
                    break;
                }
                if (var12 >= 32768) {
                    int var25 = class231.field3682[var12 + -32768];
                    var8[var9] = class45.method330(var25, 1073741824);
                    int var26 = class85.method602(false, var25).field1198;
                    if (var26 != 0) {
                        this.field3824 = var26;
                    }
                } else {
                    var8[var9] = class45.method330(var12 + -256, Integer.MIN_VALUE);
                }
            }
        }
        int[] var13 = new int[5];
        for (int var14 = 0; var14 < 5; ++var14) {
            int var24 = arg0.method633(110);
            if (var24 < 0 || ~var24 <= ~class114.field1859[var14].length) {
                var24 = 0;
            }
            var13[var14] = var24;
        }
        super.field2270 = arg0.method645(11596);
        long var15 = arg0.method625((byte) -22);
        this.field3803 = class28.method222(-256, var15);
        this.field3821 = arg0.method633(54);
        if (!var4) {
            this.field3811 = 0;
            this.field3817 = arg0.method633(51);
            this.field3819 = arg0.method633(48);
            if (this.field3819 == 255) {
                this.field3819 = -1;
            }
        } else {
            this.field3811 = arg0.method645(arg1 ^ 11596);
            this.field3817 = this.field3821;
            this.field3819 = -1;
        }
        int var17 = this.field3812;
        this.field3812 = arg0.method633(50);
        if (~this.field3812 == -1) {
            class103.method743((byte) -92, this);
        } else {
            int var18 = this.field3815;
            int var19 = this.field3802;
            int var20 = this.field3813;
            int var21 = this.field3820;
            int var22 = this.field3822;
            this.field3815 = arg0.method645(arg1 ^ 11596);
            this.field3802 = arg0.method645(11596);
            this.field3813 = arg0.method645(11596);
            this.field3820 = arg0.method645(11596);
            this.field3822 = arg0.method633(93);
            if (this.field3812 != var17 || this.field3815 != var18 || ~this.field3802 != ~var19 || this.field3813 != var20 || this.field3820 != var21 || ~this.field3822 != ~var22) {
                class98.method720(this, false);
            }
        }
        if (this.field3800 == null) {
            this.field3800 = new class49();
        }
        int var23 = this.field3800.field712;
        this.field3800.method360(var8, var13, var5 == 1, var7, (byte) 98, super.field2270);
        if (var7 != var23) {
            super.field2240 = super.field2268[0] * 128 - -(this.method971(65535) * 64);
            super.field2278 = super.field2271[0] * 128 + 64 * this.method971(arg1 + 65535);
        }
        if (super.field2284 != null) {
            super.field2284.method492();
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIIIIJILri;)V")
    public final void method100(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class67 arg10) {
        ++field3818;
        if (this.field3800 != null) {
            class30 var13 = super.field2214 != -1 && ~super.field2239 == -1 ? class148.method996(-119, super.field2214) : null;
            class30 var14 = ~super.field2250 == 0 || this.field3806 || ~super.field2250 == ~this.method972((byte) -71).field4496 && var13 != null ? null : class148.method996(-104, super.field2250);
            class9 var15 = this.field3800.method364(super.field2212, super.field2273, true, var13, (byte) -83, var14, super.field2288, super.field2296, super.field2291, super.field2199, super.field2287);
            int var16 = class80.method571((byte) -105);
            if (class183.field2843 != 0 && var16 < 50) {
                int var17 = -var16 + 50;
                while (var17 > class145.field2311) {
                    class277.field4396[class145.field2311] = new byte[102400];
                    ++class145.field2311;
                }
                while (~var17 > ~class145.field2311) {
                    --class145.field2311;
                    class277.field4396[class145.field2311] = null;
                }
            }
            if (var15 != null) {
                super.field2228 = var15.method102();
                if (class19.field291 && (this.field3800.field712 == -1 || class62.method469(this.field3800.field712, 98).field992)) {
                    class9 var18 = class291.method1948(super.field2234, 0, var15, 1, -1409, var14 == null ? super.field2199 : super.field2212, 0, super.field2278, super.field2200, arg0, var14 == null ? var13 : var14, 160, super.field2240, 240);
                    var18.method100(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class67) null);
                }
                if (class283.field4473 == this) {
                    for (int var19 = class28.field393.length - 1; var19 >= 0; --var19) {
                        class83 var20 = class28.field393[var19];
                        if (var20 != null && var20.field1405 != -1) {
                            if (var20.field1397 == 1 && ~var20.field1409 <= -1 && class255.field4082.length > var20.field1409) {
                                class45 var21 = class255.field4082[var20.field1409];
                                if (var21 != null) {
                                    int var22 = var21.field2278 / 32 - class283.field4473.field2278 / 32;
                                    int var23 = var21.field2240 / 32 + -(class283.field4473.field2240 / 32);
                                    this.method1623(arg3, arg7, var15, (byte) 68, var22, arg9, arg4, (class67) null, var20.field1405, arg1, arg5, var23, arg6, 360000, arg2, arg0);
                                }
                            }
                            if (var20.field1397 == 2) {
                                int var24 = (-class260.field4162 + var20.field1400) * 4 + -(class283.field4473.field2278 / 32) + 2;
                                int var25 = var20.field1403 * 4;
                                int var26 = var25 * var25;
                                int var27 = (-class46.field656 + var20.field1402) * 4 - -2 + -(class283.field4473.field2240 / 32);
                                this.method1623(arg3, arg7, var15, (byte) 68, var24, arg9, arg4, (class67) null, var20.field1405, arg1, arg5, var27, arg6, var26, arg2, arg0);
                            }
                            if (~var20.field1397 == -11 && ~var20.field1409 <= -1 && var20.field1409 < class210.field3267.length) {
                                class236 var28 = class210.field3267[var20.field1409];
                                if (var28 != null) {
                                    int var29 = var28.field2240 / 32 + -(class283.field4473.field2240 / 32);
                                    int var30 = var28.field2278 / 32 + -(class283.field4473.field2278 / 32);
                                    this.method1623(arg3, arg7, var15, (byte) 68, var30, arg9, arg4, (class67) null, var20.field1405, arg1, arg5, var29, arg6, 360000, arg2, arg0);
                                }
                            }
                        }
                    }
                }
                class9 var31 = null;
                this.method977(var15, (byte) -89);
                this.method975((byte) 74, var15, arg0);
                if (!this.field3806 && super.field2299 != -1 && ~super.field2289 != 0) {
                    class238 var32 = class16.method158(super.field2299, true);
                    var31 = var32.method1638((byte) 74, super.field2261, super.field2289, super.field2203);
                    if (var31 != null) {
                        var31.method90(0, -super.field2201, 0);
                        if (var32.field3855) {
                            if (~class88.field1483 != -1) {
                                var31.method89(class88.field1483);
                            }
                            if (class166.field2601 != 0) {
                                var31.method95(class166.field2601);
                            }
                            if (class8.field166 != 0) {
                                var31.method90(0, class8.field166, 0);
                            }
                        }
                    }
                }
                class9 var33 = null;
                if (!this.field3806 && super.field2290 != null) {
                    if (super.field2235 <= class192.field2978) {
                        super.field2290 = null;
                    }
                    if (class192.field2978 >= super.field2224 && ~super.field2235 < ~class192.field2978) {
                        if (!(super.field2290 instanceof class269)) {
                            var33 = (class9) super.field2290;
                        } else {
                            var33 = (class9) ((class269) super.field2290).method1816(0);
                        }
                        var33.method90(super.field2230 - super.field2240, -super.field2234 + super.field2292, -super.field2278 + super.field2211);
                        if (super.field2257 == 512) {
                            var33.method85();
                        } else if (~super.field2257 == -1025) {
                            var33.method103();
                        } else if (~super.field2257 == -1537) {
                            var33.method76();
                        }
                    }
                }
                if (var31 != null) {
                    var15 = ((class54) var15).method408(var31);
                }
                if (var33 != null) {
                    var15 = ((class54) var15).method408(var33);
                }
                var15.field170 = true;
                var15.method100(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, super.field2284);
                if (var33 != null) {
                    if (super.field2257 == 512) {
                        var33.method76();
                    } else if (~super.field2257 != -1025) {
                        if (super.field2257 == 1536) {
                            var33.method85();
                        }
                    } else {
                        var33.method103();
                    }
                    var33.method90(super.field2240 - super.field2230, -super.field2292 + super.field2234, -super.field2211 + super.field2278);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "(I)Z")
    public final boolean method328(int arg0) {
        if (arg0 != 0) {
            return false;
        } else {
            ++field3825;
            return this.field3800 != null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIZI)V")
    public final void method1622(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg1 != 0) {
            this.field3812 = -93;
        }
        super.method978(this.method971(65535), arg3, arg0, 2, arg2);
        ++field3826;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IILig;BIIILri;IIIIIIII)V")
    private final void method1623(int arg0, int arg1, class9 arg2, byte arg3, int arg4, int arg5, int arg6, class67 arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        if (arg3 == 68) {
            int var17 = arg4 * arg4 + arg11 * arg11;
            ++field3830;
            if (~var17 <= -17 && ~arg13 <= ~var17) {
                int var18 = 2047 & (int) (Math.atan2((double) arg11, (double) arg4) * 325.949D);
                class9 var19 = class53.method397(119, arg2, super.field2240, super.field2278, super.field2234, var18, arg8);
                if (var19 != null) {
                    var19.method100(0, arg9, arg14, arg0, arg6, arg10, arg12, arg1, -1L, arg5, arg7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Ljava/lang/String;ILre;)Ljava/lang/String;")
    public static final String method1624(String arg0, int arg1, class228 arg2) {
        if (~arg0.indexOf("%") != 0) {
            label56: while (true) {
                int var3 = arg0.indexOf("%1");
                if (~var3 == 0) {
                    while (true) {
                        int var4 = arg0.indexOf("%2");
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg0.indexOf("%3");
                                if (~var5 == 0) {
                                    while (true) {
                                        int var6 = arg0.indexOf("%4");
                                        if (~var6 == 0) {
                                            while (true) {
                                                int var7 = arg0.indexOf("%5");
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg0.indexOf("%dns");
                                                        if (~var8 == 0) {
                                                            break label56;
                                                        }
                                                        String var9 = "";
                                                        if (class50.field738 != null) {
                                                            if (class50.field738.field1258 != null) {
                                                                var9 = (String) class50.field738.field1258;
                                                            } else {
                                                                var9 = class97.method715(class50.field738.field1253, -64);
                                                            }
                                                        }
                                                        arg0 = arg0.substring(0, var8) + var9 + arg0.substring(var8 + 4);
                                                    }
                                                }
                                                arg0 = arg0.substring(0, var7) + class89.method684(-1554, class132.method915((byte) 48, arg2, 4)) + arg0.substring(var7 + 2);
                                            }
                                        }
                                        arg0 = arg0.substring(0, var6) + class89.method684(-1554, class132.method915((byte) 48, arg2, 3)) + arg0.substring(var6 + 2);
                                    }
                                }
                                arg0 = arg0.substring(0, var5) + class89.method684(arg1 ^ 23983, class132.method915((byte) 48, arg2, 2)) + arg0.substring(var5 + 2);
                            }
                        }
                        arg0 = arg0.substring(0, var4) + class89.method684(-1554, class132.method915((byte) 48, arg2, 1)) + arg0.substring(var4 + 2);
                    }
                }
                arg0 = arg0.substring(0, var3) + class89.method684(arg1 ^ 23983, class132.method915((byte) 48, arg2, 0)) + arg0.substring(var3 + 2);
            }
        }
        if (arg1 != -23487) {
            method1624((String) null, -115, (class228) null);
        }
        ++field3807;
        return arg0;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "()I")
    public final int method102() {
        ++field3823;
        return super.field2228;
    }

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "(I)V")
    public static void method1625(int arg0) {
        if (arg0 == -1) {
            field3814 = null;
            field3832 = null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(I)I")
    public final int method971(int arg0) {
        ++field3816;
        if (this.field3800 != null && this.field3800.field712 != -1) {
            return class62.method469(this.field3800.field712, -86).field977;
        } else {
            return arg0 != 65535 ? 16 : super.method971(arg0);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIII)V")
    public final void method82(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3805;
    }
}
