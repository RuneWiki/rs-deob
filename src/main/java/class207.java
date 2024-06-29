import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class207 extends class248 {

    @OriginalMember(owner = "client!dk", name = "nc", descriptor = "I")
    public int field3040 = -1;

    @OriginalMember(owner = "client!dk", name = "vc", descriptor = "I")
    public int field3048 = -1;

    @OriginalMember(owner = "client!dk", name = "wc", descriptor = "B")
    private byte field3049 = 0;

    @OriginalMember(owner = "client!dk", name = "uc", descriptor = "I")
    public int field3047 = 255;

    @OriginalMember(owner = "client!dk", name = "tc", descriptor = "I")
    public int field3046 = 0;

    @OriginalMember(owner = "client!dk", name = "Ic", descriptor = "I")
    public int field3061 = 0;

    @OriginalMember(owner = "client!dk", name = "pc", descriptor = "I")
    public int field3042 = -1;

    @OriginalMember(owner = "client!dk", name = "mc", descriptor = "Z")
    public boolean field3039 = false;

    @OriginalMember(owner = "client!dk", name = "Dc", descriptor = "I")
    public int field3056 = -1;

    @OriginalMember(owner = "client!dk", name = "qc", descriptor = "I")
    public int field3043 = -1;

    @OriginalMember(owner = "client!dk", name = "Fc", descriptor = "I")
    public int field3058 = 0;

    @OriginalMember(owner = "client!dk", name = "Pc", descriptor = "I")
    public int field3068 = 0;

    @OriginalMember(owner = "client!dk", name = "Lc", descriptor = "I")
    public int field3064 = -1;

    @OriginalMember(owner = "client!dk", name = "Sc", descriptor = "I")
    public int field3071 = 0;

    @OriginalMember(owner = "client!dk", name = "Tc", descriptor = "I")
    public int field3072 = -1;

    @OriginalMember(owner = "client!dk", name = "Bc", descriptor = "Z")
    public static boolean field3054 = true;

    @OriginalMember(owner = "client!dk", name = "Jc", descriptor = "I")
    public static int field3062 = 0;

    @OriginalMember(owner = "client!dk", name = "kc", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!dk", name = "lc", descriptor = "I")
    public static int field3038;

    @OriginalMember(owner = "client!dk", name = "rc", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!dk", name = "sc", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!dk", name = "xc", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!dk", name = "yc", descriptor = "I")
    public static int field3051;

    @OriginalMember(owner = "client!dk", name = "zc", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!dk", name = "Ac", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!dk", name = "Ec", descriptor = "I")
    public static int field3057;

    @OriginalMember(owner = "client!dk", name = "Gc", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!dk", name = "Hc", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!dk", name = "Mc", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!dk", name = "Oc", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!dk", name = "Rc", descriptor = "I")
    public static int field3070;

    @OriginalMember(owner = "client!dk", name = "oc", descriptor = "Lmh;")
    public static class263 field3041;

    @OriginalMember(owner = "client!dk", name = "Kc", descriptor = "Lki;")
    public class298 field3063;

    @OriginalMember(owner = "client!dk", name = "Qc", descriptor = "Ljava/lang/String;")
    public String field3069;

    @OriginalMember(owner = "client!dk", name = "Cc", descriptor = "[I")
    public static int[] field3055;

    @OriginalMember(owner = "client!dk", name = "Nc", descriptor = "[[S")
    public static short[][] field3066;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IB)Z")
    public static final boolean method1461(int arg0, byte arg1) {
        ++field3065;
        if (~class55.field812 == ~arg0) {
            return false;
        } else {
            class156.field2435 = new int[104][104];
            class49.field683 = new int[4][13][13];
            class158.field2454 = new int[104][104];
            if (arg1 >= -70) {
                method1463((byte) 5);
            }
            class5.field49 = new int[104][104];
            for (int var2 = 0; ~var2 > -5; ++var2) {
                class235.field3431[var2] = new class228(104, 104);
            }
            class55.field812 = arg0;
            class253.field3806 = new byte[4][104][104];
            class228.field3361 = new byte[4][104][104];
            class37.field475 = new class2[4][104][104];
            return true;
        }
    }

    @OriginalMember(owner = "client!dk", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (super.field3690 != null) {
            super.field3690.method658();
        }
        ++field3067;
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(II)Ljava/lang/String;")
    public static final String method1462(int arg0, int arg1) {
        ++field3051;
        return arg1 <= ~class221.field3219[arg0].length() ? class121.field1988[arg0] : class121.field1988[arg0] + class62.field945 + class221.field3219[arg0];
    }

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "(B)V")
    public static final void method1463(byte arg0) {
        if (arg0 < 14) {
            field3062 = 107;
        }
        class139.field2259.method1422((byte) -127);
        ++field3038;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIIIIIIJILui;)V")
    public final void method16(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class88 arg10) {
        ++field3044;
        if (this.field3063 != null) {
            class76 var13 = super.field3741 != -1 && super.field3677 == 0 ? class232.method1609((byte) -32, super.field3741) : null;
            class294 var14 = this.method1708(0);
            boolean var15 = var14.field4673 != 0 || ~var14.field4672 != -1 || var14.field4707 != 0 || ~var14.field4717 != -1;
            class76 var16 = super.field3752 == -1 || this.field3039 || ~super.field3752 == ~this.method1708(0).field4703 && var13 != null ? null : class232.method1609((byte) -32, super.field3752);
            class58 var17 = this.field3063.method2027(-31167, var15, super.field3692, super.field3685, var16, super.field3747, super.field3732, super.field3678, super.field3740, var13, true, super.field3708);
            int var18 = class24.method165(-90);
            if (class55.field811 != 0 && var18 < 50) {
                int var19 = -var18 + 50;
                while (var19 > class174.field2656) {
                    class204.field3014[class174.field2656] = new byte[102400];
                    ++class174.field2656;
                }
                while (class174.field2656 > var19) {
                    --class174.field2656;
                    class204.field3014[class174.field2656] = null;
                }
            }
            if (var17 != null) {
                super.field3726 = var17.method17();
                if (class22.field247 && (this.field3063.field4796 == -1 || class303.method2062(this.field3063.field4796, -62).field1726)) {
                    class58 var20 = class145.method1082(0, 160, 1, var16 == null ? super.field3747 : super.field3685, arg0, super.field3759, true, var17, 0, var16 != null ? var16 : var13, super.field3753, 240, super.field3739, super.field3660);
                    var20.method16(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class88) null);
                }
                if (class213.field3139 == this) {
                    for (int var21 = class142.field2301.length + -1; var21 >= 0; --var21) {
                        class147 var22 = class142.field2301[var21];
                        if (var22 != null && var22.field2355 != -1) {
                            if (~var22.field2362 == -2 && ~var22.field2367 <= -1 && ~var22.field2367 > ~class255.field3856.length) {
                                class12 var23 = class255.field3856[var22.field2367];
                                if (var23 != null) {
                                    int var24 = var23.field3660 / 32 + -(class213.field3139.field3660 / 32);
                                    int var25 = var23.field3753 / 32 + -(class213.field3139.field3753 / 32);
                                    this.method1464(arg5, arg4, arg2, (class88) null, arg7, var24, var22.field2355, true, arg9, arg0, arg6, arg3, var25, 360000, arg1, var17);
                                }
                            }
                            if (var22.field2362 == 2) {
                                int var26 = var22.field2359 * 4;
                                int var27 = var26 * var26;
                                int var28 = (-class149.field2390 + var22.field2373) * 4 + -(class213.field3139.field3753 / 32) + 2;
                                int var29 = (-class163.field2520 + var22.field2353) * 4 + 2 + -(class213.field3139.field3660 / 32);
                                this.method1464(arg5, arg4, arg2, (class88) null, arg7, var29, var22.field2355, true, arg9, arg0, arg6, arg3, var28, var27, arg1, var17);
                            }
                            if (~var22.field2362 == -11 && var22.field2367 >= 0 && ~class92.field1475.length < ~var22.field2367) {
                                class207 var30 = class92.field1475[var22.field2367];
                                if (var30 != null) {
                                    int var31 = var30.field3660 / 32 + -(class213.field3139.field3660 / 32);
                                    int var32 = var30.field3753 / 32 + -(class213.field3139.field3753 / 32);
                                    this.method1464(arg5, arg4, arg2, (class88) null, arg7, var31, var22.field2355, true, arg9, arg0, arg6, arg3, var32, 360000, arg1, var17);
                                }
                            }
                        }
                    }
                }
                this.method1703(104, var17);
                this.method1715(var17, 28061, arg0);
                class58 var33 = null;
                if (!this.field3039 && super.field3718 != -1 && super.field3672 != -1) {
                    class120 var34 = class152.method1126(super.field3718, (byte) -1);
                    var33 = var34.method895(super.field3689, super.field3688, (byte) -128, super.field3672);
                    if (var33 != null) {
                        var33.method423(0, -super.field3663, 0);
                        if (var34.field1964) {
                            if (class7.field72 != 0) {
                                var33.method411(class7.field72);
                            }
                            if (class295.field4753 != 0) {
                                var33.method405(class295.field4753);
                            }
                            if (~class73.field1154 != -1) {
                                var33.method423(0, class73.field1154, 0);
                            }
                        }
                    }
                }
                class58 var35 = null;
                if (!this.field3039 && super.field3742 != null) {
                    if (~class199.field2930 <= ~super.field3674) {
                        super.field3742 = null;
                    }
                    if (super.field3728 <= class199.field2930 && ~super.field3674 < ~class199.field2930) {
                        if (!(super.field3742 instanceof class222)) {
                            var35 = (class58) super.field3742;
                        } else {
                            var35 = (class58) ((class222) super.field3742).method1544((byte) 116);
                        }
                        var35.method423(super.field3729 - super.field3660, -super.field3759 + super.field3746, -super.field3753 + super.field3683);
                        if (super.field3712 != 512) {
                            if (super.field3712 != 1024) {
                                if (~super.field3712 == -1537) {
                                    var35.method418();
                                }
                            } else {
                                var35.method432();
                            }
                        } else {
                            var35.method406();
                        }
                    }
                }
                if (var33 != null) {
                    var17 = ((class257) var17).method1762(var33);
                }
                if (var35 != null) {
                    var17 = ((class257) var17).method1762(var35);
                }
                this.method1704(var33, var17, true);
                var17.field854 = true;
                var17.method16(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, super.field3690);
                if (var35 != null) {
                    if (~super.field3712 == -513) {
                        var35.method418();
                    } else if (~super.field3712 == -1025) {
                        var35.method432();
                    } else if (super.field3712 == 1536) {
                        var35.method406();
                    }
                    var35.method423(super.field3660 - super.field3729, super.field3759 - super.field3746, -super.field3683 + super.field3753);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "(I)I")
    public final int method92(int arg0) {
        if (arg0 > -90) {
            return -101;
        } else {
            ++field3050;
            return super.field3723;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIILui;IIIZIIIIIIILmg;)V")
    private final void method1464(int arg0, int arg1, int arg2, class88 arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, class58 arg15) {
        ++field3053;
        if (!arg7) {
            this.method1464(-122, -93, -12, (class88) null, -126, 36, -43, false, -6, 35, -61, -76, 18, 52, 94, (class58) null);
        }
        int var17 = arg5 * arg5 + arg12 * arg12;
        if (~var17 <= -17 && arg13 >= var17) {
            int var18 = 2047 & (int) (Math.atan2((double) arg5, (double) arg12) * 325.949D);
            class58 var19 = class282.method1949(arg6, (byte) -15, var18, arg15, super.field3660, super.field3753, super.field3759);
            if (var19 != null) {
                var19.method16(0, arg14, arg2, arg11, arg1, arg0, arg10, arg4, -1L, arg8, arg3);
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "(I)V")
    public static void method1465(int arg0) {
        field3041 = null;
        field3066 = null;
        field3055 = null;
        if (arg0 != 104) {
            field3062 = 7;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIII)V")
    public final void method15(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3059;
        if (!super.field3698) {
            if (this.field3063 == null) {
                return;
            }
            class76 var6 = super.field3741 != -1 && ~super.field3677 == -1 ? class232.method1609((byte) -32, super.field3741) : null;
            class76 var7 = ~super.field3752 == 0 || this.field3039 || ~super.field3752 == ~this.method1708(0).field4703 && var6 != null ? null : class232.method1609((byte) -32, super.field3752);
            class58 var8 = this.field3063.method2027(-31167, false, super.field3692, super.field3685, var7, super.field3747, super.field3732, super.field3678, super.field3740, var6, false, super.field3708);
            if (var8 == null) {
                return;
            }
            this.method1704((class58) null, var8, true);
        }
        if (super.field3690 != null) {
            super.field3690.method650(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIZB)V")
    public final void method1466(int arg0, int arg1, boolean arg2, byte arg3) {
        if (arg3 <= 45) {
            this.method91(18);
        }
        super.method1710(this.method1467(0), -118, arg2, arg1, arg0);
        ++field3045;
    }

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "(I)I")
    public final int method1467(int arg0) {
        if (arg0 != 0) {
            this.method15(99, 97, 49, -38, -33);
        }
        ++field3057;
        return this.field3063 != null && ~this.field3063.field4796 != 0 ? class303.method2062(this.field3063.field4796, -126).field1738 : super.method1467(0);
    }

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "(I)Z")
    public final boolean method91(int arg0) {
        if (arg0 <= 34) {
            this.method1467(-20);
        }
        ++field3052;
        return this.field3063 != null;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "()I")
    public final int method17() {
        ++field3037;
        return super.field3726;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lhc;I)V")
    public final void method1468(class53 arg0, int arg1) {
        ++field3070;
        arg0.field735 = 0;
        int var3 = arg0.method366(-16505);
        int[] var4 = new int[12];
        boolean var5 = ~(var3 & 4) != -1;
        int var6 = -1;
        int var7 = var3 & 1;
        int var8 = super.method1467(0);
        this.method1709(-19753, ((var3 & 62) >> 3) + 1);
        this.field3049 = (byte) (3 & var3 >> 6);
        super.field3660 += 64 * (-var8 + this.method1467(0));
        super.field3753 += (this.method1467(0) + -var8) * 64;
        this.field3056 = arg0.method335((byte) 26);
        this.field3042 = arg0.method335((byte) 26);
        this.field3058 = 0;
        for (int var9 = 0; var9 < 12; ++var9) {
            int var10 = arg0.method366(-16505);
            if (~var10 == -1) {
                var4[var9] = 0;
            } else {
                int var11 = arg0.method366(-16505);
                int var12 = (var10 << 8) + var11;
                if (var9 == 0 && ~var12 == -65536) {
                    var6 = arg0.method331(-41);
                    this.field3058 = arg0.method366(-16505);
                    break;
                }
                if (var12 >= 32768) {
                    int var25 = class133.field2189[var12 + -32768];
                    var4[var9] = class200.method1408(1073741824, var25);
                    int var26 = class12.method88(var25, 27838).field348;
                    if (~var26 != -1) {
                        this.field3058 = var26;
                    }
                } else {
                    var4[var9] = class200.method1408(var12 + -256, Integer.MIN_VALUE);
                }
            }
        }
        if (arg1 < -109) {
            int[] var13 = new int[5];
            for (int var14 = 0; ~var14 > -6; ++var14) {
                int var24 = arg0.method366(-16505);
                if (var24 < 0 || ~class283.field4557[var14].length >= ~var24) {
                    var24 = 0;
                }
                var13[var14] = var24;
            }
            super.field3723 = arg0.method331(-45);
            long var15 = arg0.method371(22726);
            this.field3069 = class121.method920(49, var15);
            this.field3068 = arg0.method366(-16505);
            if (var5) {
                this.field3061 = arg0.method331(-128);
                this.field3048 = -1;
                this.field3071 = this.field3068;
            } else {
                this.field3061 = 0;
                this.field3071 = arg0.method366(-16505);
                this.field3048 = arg0.method366(-16505);
                if (this.field3048 == 255) {
                    this.field3048 = -1;
                }
            }
            int var17 = this.field3046;
            this.field3046 = arg0.method366(-16505);
            if (~this.field3046 == -1) {
                class228.method1576(this, 1);
            } else {
                int var18 = this.field3043;
                int var19 = this.field3072;
                int var20 = this.field3040;
                int var21 = this.field3047;
                int var22 = this.field3064;
                this.field3043 = arg0.method331(-35);
                this.field3072 = arg0.method331(-24);
                this.field3064 = arg0.method331(-63);
                this.field3040 = arg0.method331(-118);
                this.field3047 = arg0.method366(-16505);
                if (this.field3046 != var17 || ~this.field3043 != ~var18 || ~this.field3072 != ~var19 || this.field3064 != var22 || ~this.field3040 != ~var20 || this.field3047 != var21) {
                    class114.method859(-1, this);
                }
            }
            if (this.field3063 == null) {
                this.field3063 = new class298();
            }
            int var23 = this.field3063.field4796;
            this.field3063.method2029(~var7 == -2, var13, 16384, super.field3723, var6, var4);
            if (var6 != var23) {
                super.field3660 = super.field3761[0] * 128 + this.method1467(0) * 64;
                super.field3753 = super.field3686[0] * 128 + this.method1467(0) * 64;
            }
            if (super.field3690 != null) {
                super.field3690.method654();
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "(B)Ljava/lang/String;")
    public final String method1469(byte arg0) {
        if (arg0 != -4) {
            return null;
        } else {
            ++field3060;
            String var2 = this.field3069;
            if (class91.field1470 != null) {
                var2 = class91.field1470[this.field3049] + var2;
            }
            if (class243.field3572 != null) {
                var2 = var2 + class243.field3572[this.field3049];
            }
            return var2;
        }
    }
}
