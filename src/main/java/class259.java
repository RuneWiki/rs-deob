import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class259 extends class230 {

    @OriginalMember(owner = "client!bl", name = "jc", descriptor = "I")
    public int field4190 = -1;

    @OriginalMember(owner = "client!bl", name = "hc", descriptor = "B")
    private byte field4188 = 0;

    @OriginalMember(owner = "client!bl", name = "lc", descriptor = "I")
    public int field4192 = 255;

    @OriginalMember(owner = "client!bl", name = "nc", descriptor = "I")
    public int field4194 = 0;

    @OriginalMember(owner = "client!bl", name = "uc", descriptor = "I")
    public int field4201 = -1;

    @OriginalMember(owner = "client!bl", name = "Cc", descriptor = "I")
    public int field4209 = -1;

    @OriginalMember(owner = "client!bl", name = "zc", descriptor = "I")
    public int field4206 = 0;

    @OriginalMember(owner = "client!bl", name = "yc", descriptor = "I")
    public int field4205 = -1;

    @OriginalMember(owner = "client!bl", name = "Dc", descriptor = "I")
    public int field4210 = -1;

    @OriginalMember(owner = "client!bl", name = "oc", descriptor = "I")
    public int field4195 = 0;

    @OriginalMember(owner = "client!bl", name = "Gc", descriptor = "I")
    public int field4213 = -1;

    @OriginalMember(owner = "client!bl", name = "pc", descriptor = "I")
    public int field4196 = -1;

    @OriginalMember(owner = "client!bl", name = "Ic", descriptor = "I")
    public int field4215 = 0;

    @OriginalMember(owner = "client!bl", name = "tc", descriptor = "I")
    public int field4200 = 0;

    @OriginalMember(owner = "client!bl", name = "Lc", descriptor = "Z")
    public boolean field4218 = false;

    @OriginalMember(owner = "client!bl", name = "mc", descriptor = "Ljava/lang/String;")
    public static String field4193 = "Loading interfaces - ";

    @OriginalMember(owner = "client!bl", name = "xc", descriptor = "Z")
    public static boolean field4204 = true;

    @OriginalMember(owner = "client!bl", name = "ic", descriptor = "I")
    public static int field4189;

    @OriginalMember(owner = "client!bl", name = "kc", descriptor = "I")
    public static int field4191;

    @OriginalMember(owner = "client!bl", name = "qc", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!bl", name = "rc", descriptor = "I")
    public static int field4198;

    @OriginalMember(owner = "client!bl", name = "sc", descriptor = "I")
    public static int field4199;

    @OriginalMember(owner = "client!bl", name = "vc", descriptor = "I")
    public static int field4202;

    @OriginalMember(owner = "client!bl", name = "wc", descriptor = "I")
    public static int field4203;

    @OriginalMember(owner = "client!bl", name = "Ac", descriptor = "I")
    public static int field4207;

    @OriginalMember(owner = "client!bl", name = "Ec", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!bl", name = "Fc", descriptor = "I")
    public static int field4212;

    @OriginalMember(owner = "client!bl", name = "Hc", descriptor = "I")
    public static int field4214;

    @OriginalMember(owner = "client!bl", name = "Jc", descriptor = "I")
    public static int field4216;

    @OriginalMember(owner = "client!bl", name = "Kc", descriptor = "I")
    public static int field4217;

    @OriginalMember(owner = "client!bl", name = "Mc", descriptor = "Ltc;")
    public class134 field4219;

    @OriginalMember(owner = "client!bl", name = "Bc", descriptor = "Ljava/lang/String;")
    public String field4208;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIIIIIIJILt;)V")
    public final void method101(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class268 arg10) {
        ++field4214;
        if (this.field4219 != null) {
            class165 var13 = super.field3827 != -1 && super.field3765 == 0 ? class208.method1458((byte) -97, super.field3827) : null;
            class165 var14 = super.field3793 == -1 || this.field4218 || super.field3793 == this.method1636(0).field2405 && var13 != null ? null : class208.method1458((byte) -116, super.field3793);
            class158 var15 = this.field4219.method911(super.field3738, super.field3750, super.field3782, 100, var14, super.field3823, var13, super.field3800, super.field3833, true, super.field3839);
            int var16 = class278.method1854(false);
            if (class285.field4544 != 0 && var16 < 50) {
                int var17 = -var16 + 50;
                while (var17 > class186.field2972) {
                    class165.field2645[class186.field2972] = new byte[102400];
                    ++class186.field2972;
                }
                while (~class186.field2972 < ~var17) {
                    --class186.field2972;
                    class165.field2645[class186.field2972] = null;
                }
            }
            if (var15 != null) {
                super.field3811 = var15.method102();
                if (class113.field1624 && (this.field4219.field2118 == -1 || class130.method888(0, this.field4219.field2118).field3041)) {
                    class158 var18 = class95.method530(var14 != null ? super.field3750 : super.field3782, super.field3758, super.field3753, 160, super.field3818, super.field3820, var15, var14 == null ? var13 : var14, arg0, 240, 0, 0, (byte) -128, 1);
                    var18.method101(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class268) null);
                }
                if (class286.field4571 == this) {
                    for (int var19 = class134.field2111.length + -1; var19 >= 0; --var19) {
                        class262 var20 = class134.field2111[var19];
                        if (var20 != null && ~var20.field4239 != 0) {
                            if (var20.field4243 == 1 && ~var20.field4237 <= -1 && var20.field4237 < class265.field4273.length) {
                                class200 var21 = class265.field4273[var20.field4237];
                                if (var21 != null) {
                                    int var22 = var21.field3818 / 32 - class286.field4571.field3818 / 32;
                                    int var23 = var21.field3820 / 32 + -(class286.field4571.field3820 / 32);
                                    this.method1767(var15, (class268) null, arg6, arg5, var23, arg4, var22, var20.field4239, 360000, arg2, arg7, -1537, arg9, arg0, arg3, arg1);
                                }
                            }
                            if (var20.field4243 == 2) {
                                int var24 = (-class181.field2883 + var20.field4245) * 4 - -2 + -(class286.field4571.field3820 / 32);
                                int var25 = var20.field4241 * 4;
                                int var26 = var25 * var25;
                                int var27 = (var20.field4240 - class167.field2683) * 4 - -2 + -(class286.field4571.field3818 / 32);
                                this.method1767(var15, (class268) null, arg6, arg5, var24, arg4, var27, var20.field4239, var26, arg2, arg7, -1537, arg9, arg0, arg3, arg1);
                            }
                            if (var20.field4243 == 10 && var20.field4237 >= 0 && ~var20.field4237 > ~class89.field1113.length) {
                                class259 var28 = class89.field1113[var20.field4237];
                                if (var28 != null) {
                                    int var29 = var28.field3820 / 32 + -(class286.field4571.field3820 / 32);
                                    int var30 = var28.field3818 / 32 + -(class286.field4571.field3818 / 32);
                                    this.method1767(var15, (class268) null, arg6, arg5, var29, arg4, var30, var20.field4239, 360000, arg2, arg7, -1537, arg9, arg0, arg3, arg1);
                                }
                            }
                        }
                    }
                }
                this.method1639(var15, 0);
                class158 var31 = null;
                this.method1644(arg0, var15, 0);
                if (!this.field4218 && ~super.field3757 != 0 && super.field3772 != -1) {
                    class98 var32 = class79.method440(super.field3757, (byte) 14);
                    var31 = var32.method611(super.field3832, 13294, super.field3761, super.field3772);
                    if (var31 != null) {
                        var31.method838(0, -super.field3783, 0);
                        if (var32.field1317) {
                            if (class137.field2189 != 0) {
                                var31.method820(class137.field2189);
                            }
                            if (~class182.field2898 != -1) {
                                var31.method844(class182.field2898);
                            }
                            if (class3.field48 != 0) {
                                var31.method838(0, class3.field48, 0);
                            }
                        }
                    }
                }
                class158 var33 = null;
                if (!this.field4218 && super.field3760 != null) {
                    if (~super.field3838 >= ~class73.field924) {
                        super.field3760 = null;
                    }
                    if (~super.field3780 >= ~class73.field924 && super.field3838 > class73.field924) {
                        if (super.field3760 instanceof class24) {
                            var33 = (class158) ((class24) super.field3760).method142(false);
                        } else {
                            var33 = (class158) super.field3760;
                        }
                        var33.method838(-super.field3818 + super.field3826, -super.field3753 + super.field3771, -super.field3820 + super.field3744);
                        if (super.field3835 == 512) {
                            var33.method845();
                        } else if (~super.field3835 == -1025) {
                            var33.method826();
                        } else if (~super.field3835 == -1537) {
                            var33.method824();
                        }
                    }
                }
                if (var31 != null) {
                    var15 = ((class125) var15).method853(var31);
                }
                if (var33 != null) {
                    var15 = ((class125) var15).method853(var33);
                }
                var15.field2535 = true;
                var15.method101(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, super.field3746);
                if (var33 != null) {
                    if (super.field3835 != 512) {
                        if (super.field3835 != 1024) {
                            if (~super.field3835 == -1537) {
                                var33.method845();
                            }
                        } else {
                            var33.method826();
                        }
                    } else {
                        var33.method824();
                    }
                    var33.method838(-super.field3826 + super.field3818, -super.field3771 + super.field3753, -super.field3744 + super.field3820);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lwl;Lt;IIIIIIIIIIIIII)V")
    private final void method1767(class158 arg0, class268 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        ++field4203;
        int var17 = arg4 * arg4 + arg6 * arg6;
        if (~var17 <= -17 && arg8 >= var17) {
            int var18 = (int) (325.949D * Math.atan2((double) arg6, (double) arg4)) & 2047;
            if (arg11 == -1537) {
                class158 var19 = class204.method1418(super.field3753, super.field3818, arg7, var18, arg0, (byte) 30, super.field3820);
                if (var19 != null) {
                    var19.method101(0, arg15, arg9, arg14, arg5, arg3, arg2, arg10, -1L, arg12, arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(IZII)V")
    public final void method1768(int arg0, boolean arg1, int arg2, int arg3) {
        super.method1635(arg0, 66, this.method1638(-6377), arg1, arg3);
        ++field4189;
        if (arg2 <= 115) {
            this.method1400(47);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIILpb;JLpb;Lpb;)V")
    public static final void method1769(int arg0, int arg1, int arg2, int arg3, class264 arg4, long arg5, class264 arg6, class264 arg7) {
        class185 var9 = new class185();
        var9.field2954 = arg4;
        var9.field2957 = arg1 * 128 + 64;
        var9.field2959 = arg2 * 128 + 64;
        var9.field2962 = arg3;
        var9.field2961 = arg5;
        var9.field2965 = arg6;
        var9.field2955 = arg7;
        int var10 = 0;
        class246 var11 = class46.field585[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field4044; ++var12) {
                class19 var13 = var11.field4038[var12];
                if ((var13.field244 & 4194304L) == 4194304L) {
                    int var14 = var13.field234.method102();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field2952 = -var10;
        if (class46.field585[arg0][arg1][arg2] == null) {
            class46.field585[arg0][arg1][arg2] = new class246(arg0, arg1, arg2);
        }
        class46.field585[arg0][arg1][arg2].field4042 = var9;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)I")
    public final int method1393(byte arg0) {
        int var2 = 22 / ((arg0 - 75) / 47);
        ++field4191;
        return super.field3740;
    }

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "(I)Ljava/lang/String;")
    public final String method1770(int arg0) {
        ++field4202;
        String var2 = this.field4208;
        if (class21.field276 != null) {
            var2 = class21.field276[this.field4188] + var2;
        }
        if (class297.field4697 != null) {
            var2 = var2 + class297.field4697[this.field4188];
        }
        if (arg0 != -1) {
            this.field4210 = -92;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIII)V")
    public final void method99(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4211;
    }

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "(I)Z")
    public final boolean method1400(int arg0) {
        ++field4199;
        if (arg0 < 63) {
            this.field4213 = -124;
        }
        return this.field4219 != null;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(BLpd;)V")
    public final void method1771(byte arg0, class96 arg1) {
        arg1.field1228 = 0;
        ++field4197;
        int var3 = arg1.method584(255);
        int var4 = var3 & 1;
        int var5 = super.method1638(-6377);
        this.method1634(-1, (var3 >> 3 & 7) + 1);
        boolean var6 = (4 & var3) != 0;
        this.field4188 = (byte) (var3 >> 6 & 3);
        super.field3818 += 64 * (this.method1638(-6377) - var5);
        int var7 = -1;
        if (arg0 < 56) {
            method1769(46, 124, 19, 0, (class264) null, -53L, (class264) null, (class264) null);
        }
        super.field3820 += (this.method1638(-6377) - var5) * 64;
        int[] var8 = new int[12];
        this.field4196 = arg1.method587(22);
        this.field4213 = arg1.method587(104);
        this.field4215 = 0;
        for (int var9 = 0; ~var9 > -13; ++var9) {
            int var10 = arg1.method584(255);
            if (~var10 == -1) {
                var8[var9] = 0;
            } else {
                int var11 = arg1.method584(255);
                int var12 = (var10 << 8) + var11;
                if (~var9 == -1 && ~var12 == -65536) {
                    var7 = arg1.method549(255);
                    this.field4215 = arg1.method584(255);
                    break;
                }
                if (var12 >= 32768) {
                    int var25 = class110.field1565[var12 + -32768];
                    var8[var9] = class154.method1048(var25, 1073741824);
                    int var26 = class256.method1753(-2, var25).field1510;
                    if (var26 != 0) {
                        this.field4215 = var26;
                    }
                } else {
                    var8[var9] = class154.method1048(var12 + -256, Integer.MIN_VALUE);
                }
            }
        }
        int[] var13 = new int[5];
        for (int var14 = 0; var14 < 5; ++var14) {
            int var24 = arg1.method584(255);
            if (var24 < 0 || ~var24 <= ~class201.field3186[var14].length) {
                var24 = 0;
            }
            var13[var14] = var24;
        }
        super.field3740 = arg1.method549(255);
        long var15 = arg1.method556(false);
        this.field4208 = class145.method1013(var15, 95);
        this.field4200 = arg1.method584(255);
        if (!var6) {
            this.field4206 = 0;
            this.field4195 = arg1.method584(255);
            this.field4210 = arg1.method584(255);
            if (this.field4210 == 255) {
                this.field4210 = -1;
            }
        } else {
            this.field4206 = arg1.method549(255);
            this.field4210 = -1;
            this.field4195 = this.field4200;
        }
        int var17 = this.field4194;
        this.field4194 = arg1.method584(255);
        if (~this.field4194 != -1) {
            int var18 = this.field4190;
            int var19 = this.field4209;
            int var20 = this.field4205;
            int var21 = this.field4201;
            int var22 = this.field4192;
            this.field4190 = arg1.method549(255);
            this.field4209 = arg1.method549(255);
            this.field4205 = arg1.method549(255);
            this.field4201 = arg1.method549(255);
            this.field4192 = arg1.method584(255);
            if (this.field4194 != var17 || this.field4190 != var18 || ~this.field4209 != ~var19 || ~this.field4205 != ~var20 || this.field4201 != var21 || this.field4192 != var22) {
                class108.method670(this, (byte) -28);
            }
        } else {
            class171.method1170(this, -1);
        }
        if (this.field4219 == null) {
            this.field4219 = new class134();
        }
        int var23 = this.field4219.field2118;
        this.field4219.method908(var8, super.field3740, false, var7, var13, ~var4 == -2);
        if (~var7 != ~var23) {
            super.field3818 = super.field3829[0] * 128 + 64 * this.method1638(-6377);
            super.field3820 = super.field3836[0] * 128 - -(this.method1638(-6377) * 64);
        }
        if (super.field3746 != null) {
            super.field3746.method1800();
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "()I")
    public final int method102() {
        ++field4212;
        return super.field3811;
    }

    @OriginalMember(owner = "client!bl", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field4217;
    }

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "(I)I")
    public final int method1638(int arg0) {
        ++field4207;
        if (this.field4219 != null && ~this.field4219.field2118 != 0) {
            return class130.method888(arg0 + 6377, this.field4219.field2118).field3034;
        } else {
            return arg0 != -6377 ? -90 : super.method1638(-6377);
        }
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(B)V")
    public static void method1772(byte arg0) {
        if (arg0 == 91) {
            field4193 = null;
        }
    }
}
