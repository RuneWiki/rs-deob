import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class127 extends class131 {

    @OriginalMember(owner = "client!pb", name = "jc", descriptor = "I")
    public int field2220 = -1;

    @OriginalMember(owner = "client!pb", name = "rc", descriptor = "I")
    public int field2228 = 0;

    @OriginalMember(owner = "client!pb", name = "uc", descriptor = "I")
    public int field2231 = 0;

    @OriginalMember(owner = "client!pb", name = "Ac", descriptor = "I")
    public int field2237 = -1;

    @OriginalMember(owner = "client!pb", name = "Bc", descriptor = "I")
    public int field2238 = 0;

    @OriginalMember(owner = "client!pb", name = "qc", descriptor = "I")
    public int field2227 = 0;

    @OriginalMember(owner = "client!pb", name = "mc", descriptor = "I")
    public int field2223 = -1;

    @OriginalMember(owner = "client!pb", name = "Ec", descriptor = "I")
    public int field2241 = -1;

    @OriginalMember(owner = "client!pb", name = "zc", descriptor = "I")
    public int field2236 = -1;

    @OriginalMember(owner = "client!pb", name = "vc", descriptor = "I")
    public int field2232 = -1;

    @OriginalMember(owner = "client!pb", name = "lc", descriptor = "Z")
    public boolean field2222 = false;

    @OriginalMember(owner = "client!pb", name = "Lc", descriptor = "I")
    public int field2248 = -1;

    @OriginalMember(owner = "client!pb", name = "Mc", descriptor = "I")
    private int field2249 = 0;

    @OriginalMember(owner = "client!pb", name = "ic", descriptor = "I")
    public int field2219 = 0;

    @OriginalMember(owner = "client!pb", name = "sc", descriptor = "Z")
    public static boolean field2229 = false;

    @OriginalMember(owner = "client!pb", name = "xc", descriptor = "Lve;")
    public static class189 field2234 = new class189(5);

    @OriginalMember(owner = "client!pb", name = "kc", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!pb", name = "oc", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!pb", name = "tc", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!pb", name = "wc", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!pb", name = "yc", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!pb", name = "Cc", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!pb", name = "Dc", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!pb", name = "Fc", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!pb", name = "Hc", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!pb", name = "Ic", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!pb", name = "Jc", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!pb", name = "Kc", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!pb", name = "Gc", descriptor = "Lid;")
    public class149 field2243;

    @OriginalMember(owner = "client!pb", name = "pc", descriptor = "Lcl;")
    public class194 field2226;

    @OriginalMember(owner = "client!pb", name = "nc", descriptor = "Lal;")
    public static class230 field2224;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BZ)V")
    public static final void method884(byte arg0, boolean arg1) {
        ++field2244;
        class8.field99 = arg1;
        class279.field4985 = !class123.method869(true);
        if (arg0 >= -9) {
            method887((byte) 33);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIII)V")
    public final void method49(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2225;
    }

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "(B)I")
    public final int method885(byte arg0) {
        ++field2247;
        if (arg0 >= -8) {
            method886((class199) null, 24, -111, 13, 17, -111);
        }
        return this.field2226 != null && this.field2226.field3474 != -1 ? class98.method712(this.field2226.field3474, 90).field1049 : super.method885((byte) -120);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lug;IIIII)V")
    public static final void method886(class199 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; ++var11) {
            if (class62.field1114 != var11) {
                for (int var12 = var7; var12 <= var8; ++var12) {
                    if (var12 >= 0 && var12 < class181.field3264) {
                        for (int var13 = var9; var13 <= var10; ++var13) {
                            if (var13 >= 0 && var13 < class129.field2291 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class231 var14 = class261.field4664[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class189.field3393[var11][var12 + 1][var13] + class189.field3393[var11][var12][var13] + class189.field3393[var11][var12][var13 + 1] + class189.field3393[var11][var12 + 1][var13 + 1]) / 4 - (class189.field3393[arg1][arg2 + 1][arg3] + class189.field3393[arg1][arg2][arg3] + class189.field3393[arg1][arg2][arg3 + 1] + class189.field3393[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class125 var16 = var14.field4053;
                                    if (var16 != null) {
                                        if (var16.field2203.method1364()) {
                                            arg0.method1360(var16.field2203, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field2197 != null && var16.field2197.method1364()) {
                                            arg0.method1360(var16.field2197, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field4047; ++var17) {
                                        class23 var18 = var14.field4061[var17];
                                        if (var18 != null && var18.field343.method1364() && (var18.field318 == var12 || var7 == var12) && (var18.field330 == var13 || var9 == var13)) {
                                            int var19 = var18.field331 - var18.field318 + 1;
                                            int var20 = var18.field342 - var18.field330 + 1;
                                            arg0.method1360(var18.field343, (var18.field318 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field330 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                --var7;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)I")
    public final int method112(int arg0) {
        if (arg0 != 0) {
            field2224 = null;
        }
        ++field2242;
        return super.field2342;
    }

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "(B)Z")
    public final boolean method117(byte arg0) {
        ++field2246;
        if (this.field2226 == null) {
            return false;
        } else {
            return arg0 == 62;
        }
    }

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "(B)V")
    public static void method887(byte arg0) {
        if (arg0 > -79) {
            method884((byte) -98, true);
        }
        field2234 = null;
        field2224 = null;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZIII)V")
    public final void method888(boolean arg0, int arg1, int arg2, int arg3) {
        super.method921(this.method885((byte) -29), arg1, (byte) 88, arg2, arg0);
        if (arg3 == 14508) {
            ++field2240;
        }
    }

    @OriginalMember(owner = "client!pb", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field2230;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lgd;I)V")
    public final void method889(class74 arg0, int arg1) {
        arg0.field1340 = 0;
        ++field2221;
        int var3 = arg0.method489((byte) -37);
        int var4 = var3 & 1;
        boolean var5 = (var3 & 4) != 0;
        int var6 = super.method885((byte) -85);
        int[] var7 = new int[12];
        int var8 = -1;
        this.method925(0, ((var3 & 57) >> 3) - -1);
        this.field2249 = (218 & var3) >> 6;
        super.field2347 += (-var6 + this.method885((byte) -109)) * 64;
        super.field2340 += (this.method885((byte) -77) + -var6) * 64;
        this.field2220 = arg0.method514((byte) 1);
        this.field2237 = arg0.method514((byte) 1);
        int var9 = -108 / ((-37 - arg1) / 61);
        this.field2238 = 0;
        for (int var10 = 0; var10 < 12; ++var10) {
            int var11 = arg0.method489((byte) 124);
            if (~var11 == -1) {
                var7[var10] = 0;
            } else {
                int var12 = arg0.method489((byte) -12);
                int var13 = (var11 << 8) - -var12;
                if (~var10 == -1 && var13 == 65535) {
                    var8 = arg0.method485(-2386);
                    this.field2238 = arg0.method489((byte) -66);
                    break;
                }
                if (var13 >= 32768) {
                    int var25 = class52.field942[var13 + -32768];
                    var7[var10] = class40.method238(1073741824, var25);
                    int var26 = class226.method1516(var25, -28322).field4663;
                    if (~var26 != -1) {
                        this.field2238 = var26;
                    }
                } else {
                    var7[var10] = class40.method238(var13 + -256, Integer.MIN_VALUE);
                }
            }
        }
        int[] var14 = new int[5];
        for (int var15 = 0; var15 < 5; ++var15) {
            int var24 = arg0.method489((byte) 83);
            if (var24 < 0 || class116.field1975[var15].length <= var24) {
                var24 = 0;
            }
            var14[var15] = var24;
        }
        super.field2342 = arg0.method485(-2386);
        long var16 = arg0.method478(-9426);
        this.field2243 = class258.method1780((byte) -72, var16).method1022(0);
        this.field2231 = arg0.method489((byte) -115);
        if (!var5) {
            this.field2228 = 0;
            this.field2227 = arg0.method489((byte) -84);
            this.field2236 = arg0.method489((byte) 98);
            if (~this.field2236 == -256) {
                this.field2236 = -1;
            }
        } else {
            this.field2228 = arg0.method485(-2386);
            this.field2227 = this.field2231;
            this.field2236 = -1;
        }
        int var18 = this.field2219;
        this.field2219 = arg0.method489((byte) 118);
        if (this.field2219 == 0) {
            class150.method1071(false, this);
        } else {
            int var19 = this.field2223;
            int var20 = this.field2248;
            int var21 = this.field2241;
            int var22 = this.field2232;
            this.field2248 = arg0.method485(-2386);
            this.field2223 = arg0.method485(-2386);
            this.field2241 = arg0.method485(-2386);
            this.field2232 = arg0.method485(-2386);
            if (this.field2219 != var18 || this.field2248 != var20 || ~this.field2223 != ~var19 || this.field2241 != var21 || this.field2232 != var22) {
                class94.method684(this, false);
            }
        }
        if (this.field2226 == null) {
            this.field2226 = new class194();
        }
        int var23 = this.field2226.field3474;
        this.field2226.method1318(~var4 == -2, var14, super.field2342, var7, -9, var8);
        if (var8 != var23) {
            super.field2347 = super.field2333[0] * 128 - -(this.method885((byte) -82) * 64);
            super.field2340 = super.field2400[0] * 128 - -(64 * this.method885((byte) -59));
        }
        if (super.field2346 != null) {
            super.field2346.method653();
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIIIIIJILue;)V")
    public final void method54(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class88 arg10) {
        ++field2239;
        if (this.field2226 != null) {
            class164 var13 = ~super.field2349 != 0 && ~super.field2406 == -1 ? class69.method436(super.field2349, -32) : null;
            class164 var14 = ~super.field2334 == 0 || this.field2222 || ~super.field2334 == ~this.method923((byte) -74).field4718 && var13 != null ? null : class69.method436(super.field2334, -32);
            class262 var15 = this.field2226.method1314(super.field2372, super.field2318, var13, super.field2397, true, super.field2363, super.field2331, super.field2355, true, var14, super.field2336);
            int var16 = class173.method1233(false);
            if (~class80.field1484 != -1 && var16 < 50) {
                int var17 = -var16 + 50;
                while (class73.field1259 < var17) {
                    class273.field4907[class73.field1259] = new byte[102400];
                    ++class73.field1259;
                }
                while (~class73.field1259 < ~var17) {
                    --class73.field1259;
                    class273.field4907[class73.field1259] = null;
                }
            }
            if (var15 != null) {
                super.field2390 = var15.method53();
                if (class116.field1989 && (~this.field2226.field3474 == 0 || class98.method712(this.field2226.field3474, 91).field1072)) {
                    class262 var18 = class278.method1917(super.field2340, 1, var15, 240, 0, true, 0, var14 != null ? var14 : var13, super.field2347, super.field2313, arg0, 160, var14 != null ? super.field2372 : super.field2397, super.field2329);
                    var18.method54(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class88) null);
                }
                if (class77.field1449 == this) {
                    for (int var19 = class189.field3396.length + -1; ~var19 <= -1; --var19) {
                        class180 var20 = class189.field3396[var19];
                        if (var20 != null && var20.field3246 != -1) {
                            if (var20.field3248 == 1 && ~var20.field3239 <= -1 && ~class38.field572.length < ~var20.field3239) {
                                class20 var21 = class38.field572[var20.field3239];
                                if (var21 != null) {
                                    int var22 = var21.field2347 / 32 + -(class77.field1449.field2347 / 32);
                                    int var23 = var21.field2340 / 32 + -(class77.field1449.field2340 / 32);
                                    this.method891(var23, arg7, arg5, (byte) 16, var20.field3246, arg6, var22, arg1, (class88) null, arg3, arg2, arg0, arg9, arg4, var15);
                                }
                            }
                            if (~var20.field3248 == -3) {
                                int var24 = (-class115.field1969 + var20.field3243) * 4 + -(class77.field1449.field2340 / 32) + 2;
                                int var25 = (-class125.field2199 + var20.field3247) * 4 + 2 + -(class77.field1449.field2347 / 32);
                                this.method891(var24, arg7, arg5, (byte) 16, var20.field3246, arg6, var25, arg1, (class88) null, arg3, arg2, arg0, arg9, arg4, var15);
                            }
                            if (~var20.field3248 == -11 && ~var20.field3239 <= -1 && ~var20.field3239 > ~class107.field1851.length) {
                                class127 var26 = class107.field1851[var20.field3239];
                                if (var26 != null) {
                                    int var27 = var26.field2340 / 32 - class77.field1449.field2340 / 32;
                                    int var28 = var26.field2347 / 32 + -(class77.field1449.field2347 / 32);
                                    this.method891(var27, arg7, arg5, (byte) 16, var20.field3246, arg6, var28, arg1, (class88) null, arg3, arg2, arg0, arg9, arg4, var15);
                                }
                            }
                        }
                    }
                }
                this.method926((byte) -118, var15);
                class262 var29 = null;
                this.method917(arg0, var15, true);
                if (!this.field2222 && ~super.field2353 != 0 && super.field2359 != -1) {
                    class288 var30 = class200.method1374(-17177, super.field2353);
                    var29 = var30.method1972(super.field2394, (byte) -71, super.field2326, super.field2359);
                    if (var29 != null) {
                        var29.method826(0, -super.field2374, 0);
                        if (var30.field5125) {
                            if (class272.field4889 != 0) {
                                var29.method858(class272.field4889);
                            }
                            if (~class199.field3611 != -1) {
                                var29.method833(class199.field3611);
                            }
                            if (class78.field1463 != 0) {
                                var29.method826(0, class78.field1463, 0);
                            }
                        }
                    }
                }
                class262 var31 = null;
                if (!this.field2222 && super.field2361 != null) {
                    if (class118.field2022 >= super.field2356) {
                        super.field2361 = null;
                    }
                    if (super.field2320 <= class118.field2022 && ~class118.field2022 > ~super.field2356) {
                        if (!(super.field2361 instanceof class287)) {
                            var31 = (class262) super.field2361;
                        } else {
                            var31 = (class262) ((class287) super.field2361).method1966((byte) 35);
                        }
                        var31.method826(-super.field2347 + super.field2396, -super.field2329 + super.field2376, super.field2306 - super.field2340);
                        if (super.field2335 == 512) {
                            var31.method839();
                        } else if (~super.field2335 == -1025) {
                            var31.method836();
                        } else if (super.field2335 == 1536) {
                            var31.method857();
                        }
                    }
                }
                if (var29 != null) {
                    var15 = ((class121) var15).method827(var29);
                }
                if (var31 != null) {
                    var15 = ((class121) var15).method827(var31);
                }
                var15.field4670 = true;
                var15.method54(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, super.field2346);
                if (var31 != null) {
                    if (~super.field2335 == -513) {
                        var31.method857();
                    } else if (~super.field2335 != -1025) {
                        if (~super.field2335 == -1537) {
                            var31.method839();
                        }
                    } else {
                        var31.method836();
                    }
                    var31.method826(-super.field2396 + super.field2347, -super.field2376 + super.field2329, -super.field2306 + super.field2340);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "()I")
    public final int method53() {
        ++field2245;
        return super.field2390;
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(I)Lid;")
    public final class149 method890(int arg0) {
        ++field2235;
        if (arg0 != -14756) {
            return null;
        } else {
            class149 var2 = this.field2243;
            if (class268.field4802 != null) {
                var2 = class237.method1603(new class149[] { class268.field4802[this.field2249], var2 }, -91);
            }
            if (class118.field2013 != null) {
                var2 = class237.method1603(new class149[] { var2, class118.field2013[this.field2249] }, -99);
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIBIIIILue;IIIIILnd;)V")
    private final void method891(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, class88 arg8, int arg9, int arg10, int arg11, int arg12, int arg13, class262 arg14) {
        ++field2233;
        if (arg3 == 16) {
            int var16 = arg0 * arg0 + arg6 * arg6;
            if (~var16 <= -17 && ~var16 >= -360001) {
                int var17 = 2047 & (int) (325.949D * Math.atan2((double) arg6, (double) arg0));
                class262 var18 = class86.method641(var17, super.field2340, -124, arg4, arg14, super.field2329, super.field2347);
                if (var18 != null) {
                    var18.method54(0, arg7, arg10, arg9, arg13, arg2, arg5, arg1, -1L, arg12, arg8);
                }
            }
        }
    }
}
