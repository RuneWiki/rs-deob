import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class213 extends class171 {

    @OriginalMember(owner = "client!mk", name = "mc", descriptor = "I")
    public int field3403 = -1;

    @OriginalMember(owner = "client!mk", name = "wc", descriptor = "I")
    public int field3413 = -1;

    @OriginalMember(owner = "client!mk", name = "Ic", descriptor = "I")
    public int field3425 = 0;

    @OriginalMember(owner = "client!mk", name = "qc", descriptor = "I")
    public int field3407 = 255;

    @OriginalMember(owner = "client!mk", name = "kc", descriptor = "I")
    public int field3401 = 0;

    @OriginalMember(owner = "client!mk", name = "rc", descriptor = "B")
    private byte field3408 = 0;

    @OriginalMember(owner = "client!mk", name = "nc", descriptor = "I")
    public int field3404 = -1;

    @OriginalMember(owner = "client!mk", name = "Pc", descriptor = "I")
    public int field3432 = -1;

    @OriginalMember(owner = "client!mk", name = "Ec", descriptor = "Z")
    public boolean field3421 = false;

    @OriginalMember(owner = "client!mk", name = "Bc", descriptor = "I")
    public int field3418 = -1;

    @OriginalMember(owner = "client!mk", name = "Oc", descriptor = "I")
    public int field3431 = 0;

    @OriginalMember(owner = "client!mk", name = "Yc", descriptor = "I")
    public int field3441 = 0;

    @OriginalMember(owner = "client!mk", name = "Zc", descriptor = "I")
    public int field3442 = -1;

    @OriginalMember(owner = "client!mk", name = "Xc", descriptor = "I")
    public int field3440 = 0;

    @OriginalMember(owner = "client!mk", name = "ad", descriptor = "I")
    public int field3443 = -1;

    @OriginalMember(owner = "client!mk", name = "Qc", descriptor = "Ljava/lang/String;")
    public static String field3433 = "Started 3d Library";

    @OriginalMember(owner = "client!mk", name = "Vc", descriptor = "I")
    public static int field3438 = 50;

    @OriginalMember(owner = "client!mk", name = "Tc", descriptor = "[I")
    public static int[] field3436 = new int[field3438];

    @OriginalMember(owner = "client!mk", name = "Uc", descriptor = "[I")
    public static int[] field3437 = new int[field3438];

    @OriginalMember(owner = "client!mk", name = "Rc", descriptor = "[I")
    public static int[] field3434 = new int[field3438];

    @OriginalMember(owner = "client!mk", name = "Dc", descriptor = "[I")
    public static int[] field3420 = new int[field3438];

    @OriginalMember(owner = "client!mk", name = "Jc", descriptor = "[I")
    public static int[] field3426 = new int[field3438];

    @OriginalMember(owner = "client!mk", name = "Fc", descriptor = "[I")
    public static int[] field3422 = new int[field3438];

    @OriginalMember(owner = "client!mk", name = "xc", descriptor = "[Ljava/lang/String;")
    public static String[] field3414 = new String[field3438];

    @OriginalMember(owner = "client!mk", name = "uc", descriptor = "[I")
    public static int[] field3411 = new int[field3438];

    @OriginalMember(owner = "client!mk", name = "lc", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!mk", name = "oc", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!mk", name = "pc", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!mk", name = "sc", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!mk", name = "tc", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!mk", name = "vc", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!mk", name = "yc", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!mk", name = "zc", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!mk", name = "Ac", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!mk", name = "Gc", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!mk", name = "Hc", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!mk", name = "Kc", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!mk", name = "Lc", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!mk", name = "Mc", descriptor = "I")
    public static int field3429;

    @OriginalMember(owner = "client!mk", name = "Nc", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!mk", name = "Sc", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!mk", name = "bd", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!mk", name = "Wc", descriptor = "Lbd;")
    public class81 field3439;

    @OriginalMember(owner = "client!mk", name = "cd", descriptor = "Ljava/lang/String;")
    public String field3445;

    @OriginalMember(owner = "client!mk", name = "Cc", descriptor = "[[[B")
    public static byte[][][] field3419;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IBZI)V")
    public final void method1409(int arg0, byte arg1, boolean arg2, int arg3) {
        super.method1220((byte) 88, arg2, arg3, this.method1226((byte) -91), arg0);
        ++field3444;
        int var5 = 52 / ((-19 - arg1) / 42);
    }

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "(B)I")
    public final int method1226(byte arg0) {
        ++field3415;
        if (arg0 >= -82) {
            return -28;
        } else {
            return this.field3439 != null && this.field3439.field1350 != -1 ? class128.method932(-33, this.field3439.field1350).field2682 : super.method1226((byte) -107);
        }
    }

    @OriginalMember(owner = "client!mk", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field3416;
    }

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "(I)V")
    public static final void method1410(int arg0) {
        class197.field3224 = null;
        class4.field56 = null;
        class19.field268 = null;
        class66.field1082 = null;
        class193.field3155 = null;
        ++field3405;
        class244.field3857 = null;
        if (arg0 != 0) {
            field3419 = null;
        }
    }

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "(I)I")
    public final int method1040(int arg0) {
        if (arg0 != -1) {
            this.field3440 = 42;
        }
        ++field3430;
        return super.field2835;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILpj;IILpb;IIIIIZIIIII)V")
    private final void method1411(int arg0, class98 arg1, int arg2, int arg3, class168 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        if (!arg10) {
            field3411 = null;
        }
        ++field3428;
        int var17 = arg14 * arg14 + arg15 * arg15;
        if (var17 >= 16 && ~arg2 <= ~var17) {
            int var18 = (int) (325.949D * Math.atan2((double) arg15, (double) arg14)) & 2047;
            class168 var19 = class286.method1915(arg4, super.field2851, arg11, var18, (byte) 105, super.field2887, super.field2849);
            if (var19 != null) {
                var19.method98(0, arg6, arg0, arg8, arg3, arg12, arg13, arg7, -1L, arg5, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Z)V")
    public static final void method1412(boolean arg0) {
        if (!arg0) {
            field3434 = null;
        }
        class244.field3854.method1157(760);
        ++field3409;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIIIIIIJILpj;)V")
    public final void method98(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class98 arg10) {
        ++field3412;
        if (this.field3439 != null) {
            class77 var13 = super.field2816 != -1 && super.field2885 == 0 ? class28.method246(-73, super.field2816) : null;
            class77 var14 = super.field2901 == -1 || this.field3421 || super.field2901 == this.method1224(-1).field651 && var13 != null ? null : class28.method246(-42, super.field2901);
            class168 var15 = this.field3439.method647(super.field2886, super.field2903, super.field2826, super.field2902, true, var14, var13, true, super.field2811, super.field2847, super.field2858);
            int var16 = class129.method941(34);
            if (class237.field3745 != 0 && ~var16 > -51) {
                int var17 = -var16 + 50;
                while (class224.field3571 < var17) {
                    class23.field366[class224.field3571] = new byte[102400];
                    ++class224.field3571;
                }
                while (~var17 > ~class224.field3571) {
                    --class224.field3571;
                    class23.field366[class224.field3571] = null;
                }
            }
            if (var15 != null) {
                super.field2830 = var15.method99();
                if (class153.field2496 && (this.field3439.field1350 == -1 || class128.method932(123, this.field3439.field1350).field2717)) {
                    class168 var18 = class179.method1265(1, var14 != null ? var14 : var13, arg0, super.field2887, super.field2851, 240, 0, 160, 32720, super.field2837, var14 != null ? super.field2858 : super.field2903, var15, 0, super.field2849);
                    var18.method98(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class98) null);
                }
                if (class48.field878 == this) {
                    for (int var19 = class288.field4608.length + -1; var19 >= 0; --var19) {
                        class179 var20 = class288.field4608[var19];
                        if (var20 != null && var20.field2973 != -1) {
                            if (var20.field2981 == 1 && ~var20.field2982 <= -1 && var20.field2982 < class3.field45.length) {
                                class139 var21 = class3.field45[var20.field2982];
                                if (var21 != null) {
                                    int var22 = var21.field2849 / 32 + -(class48.field878.field2849 / 32);
                                    int var23 = var21.field2887 / 32 + -(class48.field878.field2887 / 32);
                                    this.method1411(arg2, (class98) null, 360000, arg4, var15, arg9, arg1, arg7, arg3, arg0, true, var20.field2973, arg5, arg6, var23, var22);
                                }
                            }
                            if (~var20.field2981 == -3) {
                                int var24 = (-class170.field2787 + var20.field2986) * 4 - class48.field878.field2887 / 32 + 2;
                                int var25 = (-class256.field4082 + var20.field2983) * 4 + -(class48.field878.field2849 / 32) + 2;
                                int var26 = var20.field2987 * 4;
                                int var27 = var26 * var26;
                                this.method1411(arg2, (class98) null, var27, arg4, var15, arg9, arg1, arg7, arg3, arg0, true, var20.field2973, arg5, arg6, var24, var25);
                            }
                            if (var20.field2981 == 10 && var20.field2982 >= 0 && class191.field3129.length > var20.field2982) {
                                class213 var28 = class191.field3129[var20.field2982];
                                if (var28 != null) {
                                    int var29 = var28.field2849 / 32 + -(class48.field878.field2849 / 32);
                                    int var30 = var28.field2887 / 32 + -(class48.field878.field2887 / 32);
                                    this.method1411(arg2, (class98) null, 360000, arg4, var15, arg9, arg1, arg7, arg3, arg0, true, var20.field2973, arg5, arg6, var30, var29);
                                }
                            }
                        }
                    }
                }
                this.method1227(var15, false);
                this.method1230(2, var15, arg0);
                class168 var31 = null;
                if (!this.field3421 && super.field2817 != -1 && super.field2812 != -1) {
                    class281 var32 = class35.method298(super.field2817, false);
                    var31 = var32.method1888((byte) 36, super.field2897, super.field2812, super.field2823);
                    if (var31 != null) {
                        var31.method339(0, -super.field2807, 0);
                        if (var32.field4458) {
                            if (class278.field4411 != 0) {
                                var31.method350(class278.field4411);
                            }
                            if (class241.field3816 != 0) {
                                var31.method335(class241.field3816);
                            }
                            if (~class113.field1745 != -1) {
                                var31.method339(0, class113.field1745, 0);
                            }
                        }
                    }
                }
                class168 var33 = null;
                if (!this.field3421 && super.field2820 != null) {
                    if (class207.field3336 >= super.field2853) {
                        super.field2820 = null;
                    }
                    if (~super.field2855 >= ~class207.field3336 && ~class207.field3336 > ~super.field2853) {
                        if (!(super.field2820 instanceof class100)) {
                            var33 = (class168) super.field2820;
                        } else {
                            var33 = (class168) ((class100) super.field2820).method749(-1);
                        }
                        var33.method339(-super.field2849 + super.field2860, -super.field2851 + super.field2859, -super.field2887 + super.field2808);
                        if (super.field2893 != 512) {
                            if (super.field2893 != 1024) {
                                if (~super.field2893 == -1537) {
                                    var33.method357();
                                }
                            } else {
                                var33.method351();
                            }
                        } else {
                            var33.method344();
                        }
                    }
                }
                if (var31 != null) {
                    var15 = ((class41) var15).method343(var31);
                }
                if (var33 != null) {
                    var15 = ((class41) var15).method343(var33);
                }
                var15.field2758 = true;
                var15.method98(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, super.field2828);
                if (var33 != null) {
                    if (~super.field2893 != -513) {
                        if (~super.field2893 != -1025) {
                            if (~super.field2893 == -1537) {
                                var33.method344();
                            }
                        } else {
                            var33.method351();
                        }
                    } else {
                        var33.method357();
                    }
                    var33.method339(-super.field2860 + super.field2849, -super.field2859 + super.field2851, super.field2887 - super.field2808);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IZ)V")
    public static final void method1413(int arg0, boolean arg1) {
        class204.field3289 = new int[104];
        class111.field1710 = 99;
        class21.field332 = new int[104];
        class234.field3711 = new int[104];
        ++field3410;
        byte var2;
        if (!arg1) {
            var2 = 4;
        } else {
            var2 = 1;
        }
        class179.field2974 = new int[104];
        class240.field3786 = new int[var2][105][105];
        class185.field3042 = new byte[var2][104][104];
        class228.field3623 = new int[5];
        if (arg0 != 20769) {
            method1413(-69, true);
        }
        class70.field1173 = new byte[var2][104][104];
        class127.field2098 = new byte[var2][105][105];
        class135.field2225 = new int[104];
        class64.field1060 = new byte[var2][104][104];
        class229.field3658 = new byte[var2][104][104];
    }

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "(B)Ljava/lang/String;")
    public final String method1414(byte arg0) {
        int var2 = -119 / ((-35 - arg0) / 56);
        String var3 = this.field3445;
        ++field3424;
        if (class278.field4407 != null) {
            var3 = class278.field4407[this.field3408] + var3;
        }
        if (class87.field1410 != null) {
            var3 = var3 + class87.field1410[this.field3408];
        }
        return var3;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "()I")
    public final int method99() {
        ++field3435;
        return super.field2830;
    }

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "(B)V")
    public static void method1415(byte arg0) {
        field3411 = null;
        field3426 = null;
        field3414 = null;
        field3420 = null;
        field3422 = null;
        field3436 = null;
        field3433 = null;
        field3434 = null;
        field3419 = null;
        field3437 = null;
        if (arg0 >= -74) {
            method1412(true);
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lig;I)V")
    public final void method1416(class136 arg0, int arg1) {
        ++field3402;
        int var3 = -1;
        int[] var4 = new int[12];
        arg0.field2231 = 0;
        int var5 = arg0.method1012(4);
        int var6 = super.method1226((byte) -116);
        this.method1229((byte) 8, ((63 & var5) >> 3) - -1);
        int var7 = arg1 & var5;
        boolean var8 = ~(var5 & 4) != -1;
        this.field3408 = (byte) ((var5 & 246) >> 6);
        super.field2849 += (-var6 + this.method1226((byte) -96)) * 64;
        super.field2887 += (-var6 + this.method1226((byte) -118)) * 64;
        this.field3443 = arg0.method981(false);
        this.field3418 = arg0.method981(false);
        this.field3441 = 0;
        for (int var9 = 0; ~var9 > -13; ++var9) {
            int var10 = arg0.method1012(arg1 + 3);
            if (var10 == 0) {
                var4[var9] = 0;
            } else {
                int var11 = arg0.method1012(4);
                int var12 = (var10 << 8) + var11;
                if (var9 == 0 && ~var12 == -65536) {
                    var3 = arg0.method996(65280);
                    this.field3441 = arg0.method1012(4);
                    break;
                }
                if (~var12 <= -32769) {
                    int var25 = class183.field3013[var12 - 32768];
                    var4[var9] = class140.method1045(var25, 1073741824);
                    int var26 = class190.method1314(var25, (byte) 68).field1150;
                    if (~var26 != -1) {
                        this.field3441 = var26;
                    }
                } else {
                    var4[var9] = class140.method1045(Integer.MIN_VALUE, var12 + -256);
                }
            }
        }
        int[] var13 = new int[5];
        for (int var14 = 0; ~var14 > -6; ++var14) {
            int var24 = arg0.method1012(4);
            if (var24 < 0 || class113.field1747[var14].length <= var24) {
                var24 = 0;
            }
            var13[var14] = var24;
        }
        super.field2835 = arg0.method996(65280);
        long var15 = arg0.method983(29834);
        this.field3445 = class66.method506((byte) 20, var15);
        this.field3425 = arg0.method1012(arg1 + 3);
        if (var8) {
            this.field3401 = arg0.method996(65280);
            this.field3403 = -1;
            this.field3440 = this.field3425;
        } else {
            this.field3401 = 0;
            this.field3440 = arg0.method1012(4);
            this.field3403 = arg0.method1012(arg1 + 3);
            if (~this.field3403 == -256) {
                this.field3403 = -1;
            }
        }
        int var17 = this.field3431;
        this.field3431 = arg0.method1012(4);
        if (~this.field3431 != -1) {
            int var18 = this.field3442;
            int var19 = this.field3413;
            int var20 = this.field3404;
            int var21 = this.field3407;
            int var22 = this.field3432;
            this.field3442 = arg0.method996(65280);
            this.field3432 = arg0.method996(65280);
            this.field3413 = arg0.method996(65280);
            this.field3404 = arg0.method996(65280);
            this.field3407 = arg0.method1012(4);
            if (this.field3431 != var17 || this.field3442 != var18 || this.field3432 != var22 || this.field3413 != var19 || ~this.field3404 != ~var20 || ~this.field3407 != ~var21) {
                class278.method1870((byte) 14, this);
            }
        } else {
            class127.method928(this, false);
        }
        if (this.field3439 == null) {
            this.field3439 = new class81();
        }
        int var23 = this.field3439.field1350;
        this.field3439.method646(var4, var3, 71, super.field2835, var13, var7 == 1);
        if (var3 != var23) {
            super.field2849 = super.field2844[0] * 128 - -(64 * this.method1226((byte) -110));
            super.field2887 = super.field2813[0] * 128 + 64 * this.method1226((byte) -104);
        }
        if (super.field2828 != null) {
            super.field2828.method743();
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIIIZIII)V")
    public static final void method1417(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8) {
        int var9 = 0;
        if (arg5) {
            field3437 = null;
        }
        while (class143.field2358.field4048 > var9) {
            if (class143.field2358.method1693(var9, true)) {
                int[] var10 = class152.field2484.method869(class143.field2358.field4042[var9] & 16383, 16383 & class143.field2358.field4042[var9] >> 14, (class143.field2358.field4042[var9] & 1006875767) >> 28, (byte) -87);
                if (var10 != null) {
                    int var11 = var10[1] - class285.field4524;
                    int var12 = (-arg3 + var11) * (-arg7 + arg2) / (-arg3 + arg6) + arg7;
                    int var13 = class253.field4030 - var10[2] + class31.field524 + -1;
                    int var14 = (-arg1 + var13) * (-arg4 + arg8) / (-arg1 + arg0) + arg4;
                    int var15 = class143.field2358.method1697(false, var9);
                    int var16 = 16777215;
                    class203 var17 = null;
                    if (~var15 == -1) {
                        if ((double) class170.field2791 == 3.0D) {
                            var17 = class296.field4685;
                        }
                        if ((double) class170.field2791 == 4.0D) {
                            var17 = class81.field1343;
                        }
                        if ((double) class170.field2791 == 6.0D) {
                            var17 = class22.field335;
                        }
                        if ((double) class170.field2791 >= 8.0D) {
                            var17 = class116.field1956;
                        }
                    }
                    if (var15 == 1) {
                        if ((double) class170.field2791 == 3.0D) {
                            var17 = class22.field335;
                        }
                        if ((double) class170.field2791 == 4.0D) {
                            var17 = class116.field1956;
                        }
                        if ((double) class170.field2791 == 6.0D) {
                            var17 = class258.field4113;
                        }
                        if ((double) class170.field2791 >= 8.0D) {
                            var17 = class108.field1649;
                        }
                    }
                    if (var15 == 2) {
                        var16 = 16755200;
                        if ((double) class170.field2791 == 3.0D) {
                            var17 = class258.field4113;
                        }
                        if ((double) class170.field2791 == 4.0D) {
                            var17 = class108.field1649;
                        }
                        if ((double) class170.field2791 == 6.0D) {
                            var17 = class297.field4700;
                        }
                        if ((double) class170.field2791 >= 8.0D) {
                            var17 = class8.field91;
                        }
                    }
                    if (class143.field2358.field4045[var9] != -1) {
                        var16 = class143.field2358.field4045[var9];
                    }
                    if (var17 != null) {
                        int var18 = class198.field3231.method573(class143.field2358.field4057[var9], (int[]) null, class285.field4542);
                        int var19 = var14 - (var18 + -1) * var17.method1370() / 2;
                        int var20 = var19 + var17.method1366() / 2;
                        for (int var21 = 0; var18 > var21; ++var21) {
                            String var22 = class285.field4542[var21];
                            if (~(var18 - 1) < ~var21) {
                                var22 = var22.substring(0, -4 + var22.length());
                            }
                            var17.method1371(var22, var12, var20, var16, true);
                            var20 += var17.method1370();
                        }
                    }
                }
            }
            ++var9;
        }
        ++field3417;
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(IIIII)V")
    public final void method100(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3427;
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(B)Z")
    public final boolean method1041(byte arg0) {
        int var2 = 13 % ((-60 - arg0) / 43);
        ++field3429;
        return this.field3439 != null;
    }
}
