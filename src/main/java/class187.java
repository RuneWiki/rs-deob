import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class187 extends class33 {

    @OriginalMember(owner = "client!sh", name = "Y", descriptor = "I")
    private int field3648 = 0;

    @OriginalMember(owner = "client!sh", name = "S", descriptor = "I")
    private int field3642 = 0;

    @OriginalMember(owner = "client!sh", name = "U", descriptor = "I")
    private int field3644 = 0;

    @OriginalMember(owner = "client!sh", name = "N", descriptor = "Lrd;")
    private static class173 field3637 = class133.method843("Please try using a different world)3", 14);

    @OriginalMember(owner = "client!sh", name = "cb", descriptor = "Lrd;")
    public static class173 field3652 = field3637;

    @OriginalMember(owner = "client!sh", name = "Z", descriptor = "Lrd;")
    public static class173 field3649 = field3637;

    @OriginalMember(owner = "client!sh", name = "ab", descriptor = "I")
    public static int field3650 = 0;

    @OriginalMember(owner = "client!sh", name = "V", descriptor = "Lrd;")
    public static class173 field3645 = field3637;

    @OriginalMember(owner = "client!sh", name = "W", descriptor = "Lrd;")
    public static class173 field3646 = class133.method843("0(U", -103);

    @OriginalMember(owner = "client!sh", name = "eb", descriptor = "Lrd;")
    public static class173 field3654 = field3637;

    @OriginalMember(owner = "client!sh", name = "hb", descriptor = "Lrd;")
    public static class173 field3657 = field3637;

    @OriginalMember(owner = "client!sh", name = "mb", descriptor = "Lrd;")
    public static class173 field3662 = field3637;

    @OriginalMember(owner = "client!sh", name = "M", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!sh", name = "O", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!sh", name = "Q", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!sh", name = "R", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!sh", name = "T", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!sh", name = "X", descriptor = "I")
    private int field3647;

    @OriginalMember(owner = "client!sh", name = "bb", descriptor = "I")
    private int field3651;

    @OriginalMember(owner = "client!sh", name = "db", descriptor = "I")
    private int field3653;

    @OriginalMember(owner = "client!sh", name = "fb", descriptor = "I")
    private int field3655;

    @OriginalMember(owner = "client!sh", name = "gb", descriptor = "I")
    public static int field3656;

    @OriginalMember(owner = "client!sh", name = "ib", descriptor = "I")
    private int field3658;

    @OriginalMember(owner = "client!sh", name = "kb", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!sh", name = "lb", descriptor = "I")
    private int field3661;

    @OriginalMember(owner = "client!sh", name = "P", descriptor = "J")
    public static long field3639;

    @OriginalMember(owner = "client!sh", name = "jb", descriptor = "La;")
    public static class1 field3659;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "(I)V")
    public static void method1254(int arg0) {
        field3637 = null;
        field3652 = null;
        field3654 = null;
        field3659 = null;
        field3662 = null;
        field3646 = null;
        field3649 = null;
        field3657 = null;
        field3645 = null;
        if (arg0 != 20342) {
            method1254(58);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IILmb;)V")
    public final void method177(int arg0, int arg1, class121 arg2) {
        ++field3641;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    this.field3642 = (arg2.method767(-93) << 12) / 100;
                }
            } else {
                this.field3648 = (arg2.method767(-113) << 12) / 100;
            }
        } else {
            this.field3644 = arg2.method782(true);
        }
        if (arg1 > -99) {
            this.field3648 = 82;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIII)V")
    private final void method1255(int arg0, int arg1, int arg2, int arg3) {
        int var5 = ~arg1 >= ~arg3 ? arg3 : arg1;
        int var6 = arg2 > var5 ? arg2 : var5;
        if (arg0 > -67) {
            field3645 = null;
        }
        ++field3660;
        int var7 = ~arg1 <= ~arg3 ? arg3 : arg1;
        int var8 = var7 <= arg2 ? var7 : arg2;
        this.field3658 = (var6 + var8) / 2;
        int var9 = -var8 + var6;
        if (var9 > 0) {
            int var10 = (-arg1 + var6 << 12) / var9;
            int var11 = (var6 - arg3 << 12) / var9;
            int var12 = (var6 - arg2 << 12) / var9;
            if (~arg1 != ~var6) {
                if (~arg3 != ~var6) {
                    this.field3647 = arg1 != var8 ? -var10 + 20480 : var11 + 12288;
                } else {
                    this.field3647 = arg2 == var8 ? var10 + 4096 : -var12 + 12288;
                }
            } else {
                this.field3647 = ~arg3 == ~var8 ? var12 + 20480 : -var11 + 4096;
            }
            this.field3647 /= 6;
        } else {
            this.field3647 = 0;
        }
        if (~this.field3658 < -1 && this.field3658 < 4096) {
            this.field3651 = (var9 << 12) / (~this.field3658 >= -2049 ? this.field3658 * 2 : -(this.field3658 * 2) + 8192);
        } else {
            this.field3651 = 0;
        }
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(II)[[I")
    public final int[][] method178(int arg0, int arg1) {
        ++field3656;
        int[][] var3 = super.field731.method1340(107, arg1);
        if (super.field731.field3925) {
            int[][] var4 = this.method259(0, -9, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class117.field2173 < ~var11; ++var11) {
                this.method1255(-106, var5[var11], var6[var11], var7[var11]);
                this.field3658 += this.field3642;
                if (this.field3658 < 0) {
                    this.field3658 = 0;
                }
                if (~this.field3658 < -4097) {
                    this.field3658 = 4096;
                }
                for (this.field3647 += this.field3644; ~this.field3647 > -1; this.field3647 += 4096) {
                }
                while (this.field3647 > 4096) {
                    this.field3647 -= 4096;
                }
                this.field3651 += this.field3648;
                if (this.field3651 < 0) {
                    this.field3651 = 0;
                }
                if (this.field3651 > 4096) {
                    this.field3651 = 4096;
                }
                this.method1258(this.field3658, this.field3647, (byte) 8, this.field3651);
                var8[var11] = this.field3655;
                var9[var11] = this.field3661;
                var10[var11] = this.field3653;
            }
        }
        return arg0 < 112 ? null : var3;
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "()V")
    public class187() {
        super(1, false);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(BII)V")
    public static final void method1256(byte arg0, int arg1, int arg2) {
        ++field3643;
        class145 var3 = class160.field2985[class172.field3347][arg1][arg2];
        if (var3 == null) {
            class24.method190(class172.field3347, arg1, arg2);
        } else {
            int var4 = -99999999;
            class205 var5 = null;
            for (class205 var6 = (class205) var3.method915(-1); var6 != null; var6 = (class205) var3.method910((byte) 88)) {
                class19 var12 = class195.method1298(1639, var6.field4009);
                int var13 = var12.field442;
                if (var12.field441 == 1) {
                    var13 = (var6.field4012 + 1) * var13;
                }
                if (~var4 > ~var13) {
                    var4 = var13;
                    var5 = var6;
                }
            }
            if (var5 == null) {
                class24.method190(class172.field3347, arg1, arg2);
            } else {
                var3.method925(255, var5);
                class205 var7 = (class205) var3.method915(-1);
                class205 var8 = null;
                class205 var9 = null;
                if (arg0 <= -33) {
                    long var10 = (long) (arg1 - (-(arg2 << 7) + -1610612736));
                    while (var7 != null) {
                        if (~var5.field4009 != ~var7.field4009) {
                            if (var8 == null) {
                                var8 = var7;
                            }
                            if (var7.field4009 != var8.field4009 && var9 == null) {
                                var9 = var7;
                            }
                        }
                        var7 = (class205) var3.method910((byte) 88);
                    }
                    class153.method1006(class172.field3347, arg1, arg2, class56.method361(class172.field3347, arg2 * 128 - -64, (byte) -54, arg1 * 128 + 64), var5, var10, var8, var9);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIII)V")
    public static final void method1257(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3638;
        class27.method212(arg0, arg1, arg0 + arg4, arg1 + arg3);
        class72.method442();
        ++class41.field851;
        class62.method396(true, false);
        class211.method1386(arg2 ^ 29431, true);
        class62.method396(false, false);
        class211.method1386(arg2 ^ 29431, false);
        class105.method648(-30906);
        class186.method1252(60);
        if (!class111.field2070) {
            int var5 = class203.field3928;
            if (~var5 > ~(class196.field3827 / 256)) {
                var5 = class196.field3827 / 256;
            }
            if (class54.field1085[4] && class129.field2432[4] + 128 > var5) {
                var5 = class129.field2432[4] + 128;
            }
            int var6 = 2047 & class31.field661 + class140.field2614;
            class98.method601(var5, arg2 ^ 12308, class54.field1086, class56.method361(class172.field3347, class175.field3447.field2801, (byte) -28, class175.field3447.field2820) + -50, var5 * 3 + 600, var6, class103.field1908);
        }
        int var7;
        if (class111.field2070) {
            var7 = class15.method146((byte) -37);
        } else {
            var7 = class69.method424((byte) -106);
        }
        int var8 = class168.field3246;
        int var9 = class62.field1225;
        int var10 = class186.field3635;
        int var11 = class183.field3595;
        int var12 = class97.field1778;
        for (int var13 = 0; ~var13 > -6; ++var13) {
            if (class54.field1085[var13]) {
                int var16 = (int) ((double) (class97.field1774[var13] * 2 + 1) * Math.random() - (double) class97.field1774[var13] + Math.sin((double) class117.field2159[var13] / 100.0D * (double) class124.field2334[var13]) * (double) class129.field2432[var13]);
                if (~var13 == -5) {
                    class186.field3635 += var16;
                    if (class186.field3635 < 128) {
                        class186.field3635 = 128;
                    }
                    if (class186.field3635 > 383) {
                        class186.field3635 = 383;
                    }
                }
                if (var13 == 0) {
                    class62.field1225 += var16;
                }
                if (~var13 == -4) {
                    class183.field3595 = class183.field3595 + var16 & 2047;
                }
                if (var13 == 2) {
                    class97.field1778 += var16;
                }
                if (~var13 == -2) {
                    class168.field3246 += var16;
                }
            }
        }
        int var14 = class214.field4154;
        int var15 = class4.field72;
        if (var14 >= arg0 && var14 < arg0 + arg4 && arg1 <= var15 && ~var15 > ~(arg1 + arg3)) {
            class213.field4149 = true;
            class213.field4140 = 0;
            class213.field4148 = -arg0 + class214.field4154;
            class213.field4136 = -arg1 + class4.field72;
        } else {
            class213.field4149 = false;
            class213.field4140 = 0;
        }
        class196.method1305(-102);
        class27.method219(arg0, arg1, arg4, arg3, 0);
        if (arg2 == -29431) {
            class196.method1305(arg2 ^ 29336);
            class123.method795(class62.field1225, class168.field3246, class97.field1778, class186.field3635, class183.field3595, var7);
            class196.method1305(-100);
            class89.method569();
            class40.method299(arg4, arg3, arg1, -10096, arg0);
            class59.method377(arg1, arg0, (byte) -124);
            ((class186) class72.field1400).method1253(class171.field3305, (byte) 85);
            class57.method366(arg1, arg3, -25707, arg0, arg4);
            class62.field1225 = var9;
            class183.field3595 = var11;
            class186.field3635 = var10;
            class168.field3246 = var8;
            class97.field1778 = var12;
            if (class119.field2198 && class140.method873(0, true, false) == 0) {
                class119.field2198 = false;
            }
            if (class119.field2198) {
                class27.method219(arg0, arg1, arg4, arg3, 0);
                class140.method876(class221.field4252, false, -14911);
            }
            if (!class119.field2198 && !class167.field3223 && ~arg0 >= ~var14 && var14 < arg0 - -arg4 && var15 >= arg1 && var15 < arg1 - -arg3) {
                class66.method417(var14, arg1, 81, var15, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIBI)V")
    private final void method1258(int arg0, int arg1, byte arg2, int arg3) {
        ++field3640;
        if (arg2 == 8) {
            int var5 = arg0 <= 2048 ? (arg3 + 4096) * arg0 >> 12 : arg0 + arg3 + -(arg0 * arg3 >> 12);
            if (var5 > 0) {
                int var6 = arg1 * 6;
                int var7 = arg0 + arg0 + -var5;
                int var8 = (-var7 + var5 << 12) / var5;
                int var10 = var6 >> 12;
                int var11 = var8 * var5 >> 12;
                int var12 = -(var10 << 12) + var6;
                int var13 = var11 * var12 >> 12;
                int var14 = var7 + var13;
                int var15 = -var13 + var5;
                if (~var10 == -1) {
                    this.field3653 = var7;
                    this.field3661 = var14;
                    this.field3655 = var5;
                    return;
                }
                if (~var10 == -2) {
                    this.field3655 = var15;
                    this.field3653 = var7;
                    this.field3661 = var5;
                    return;
                }
                if (var10 == 2) {
                    this.field3653 = var14;
                    this.field3661 = var5;
                    this.field3655 = var7;
                    return;
                }
                if (~var10 == -4) {
                    this.field3653 = var5;
                    this.field3661 = var15;
                    this.field3655 = var7;
                    return;
                }
                if (var10 == 4) {
                    this.field3653 = var5;
                    this.field3655 = var14;
                    this.field3661 = var7;
                    return;
                }
                if (var10 == 5) {
                    this.field3655 = var5;
                    this.field3661 = var7;
                    this.field3653 = var15;
                    return;
                }
            } else {
                this.field3655 = this.field3661 = this.field3653 = arg0;
            }
        }
    }
}
