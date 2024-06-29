import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class237 extends class210 {

    @OriginalMember(owner = "client!s", name = "pc", descriptor = "I")
    public int field4220 = 0;

    @OriginalMember(owner = "client!s", name = "tc", descriptor = "I")
    public int field4224 = 0;

    @OriginalMember(owner = "client!s", name = "wc", descriptor = "I")
    public int field4227 = 0;

    @OriginalMember(owner = "client!s", name = "Dc", descriptor = "I")
    public int field4234 = -1;

    @OriginalMember(owner = "client!s", name = "xc", descriptor = "I")
    public int field4228 = 0;

    @OriginalMember(owner = "client!s", name = "Hc", descriptor = "I")
    private int field4238 = 0;

    @OriginalMember(owner = "client!s", name = "Gc", descriptor = "I")
    public int field4237 = -1;

    @OriginalMember(owner = "client!s", name = "Cc", descriptor = "I")
    public int field4233 = -1;

    @OriginalMember(owner = "client!s", name = "Rc", descriptor = "I")
    public int field4248 = -1;

    @OriginalMember(owner = "client!s", name = "Oc", descriptor = "I")
    public int field4245 = -1;

    @OriginalMember(owner = "client!s", name = "vc", descriptor = "I")
    public int field4226 = 0;

    @OriginalMember(owner = "client!s", name = "Fc", descriptor = "I")
    public int field4236 = -1;

    @OriginalMember(owner = "client!s", name = "rc", descriptor = "I")
    public int field4222 = -1;

    @OriginalMember(owner = "client!s", name = "Bc", descriptor = "Z")
    public boolean field4232 = false;

    @OriginalMember(owner = "client!s", name = "Tc", descriptor = "I")
    public static int field4250 = 0;

    @OriginalMember(owner = "client!s", name = "kc", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!s", name = "lc", descriptor = "I")
    public static int field4216;

    @OriginalMember(owner = "client!s", name = "nc", descriptor = "I")
    public static int field4218;

    @OriginalMember(owner = "client!s", name = "oc", descriptor = "I")
    public static int field4219;

    @OriginalMember(owner = "client!s", name = "qc", descriptor = "I")
    public static int field4221;

    @OriginalMember(owner = "client!s", name = "sc", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!s", name = "uc", descriptor = "I")
    public static int field4225;

    @OriginalMember(owner = "client!s", name = "yc", descriptor = "I")
    public static int field4229;

    @OriginalMember(owner = "client!s", name = "zc", descriptor = "I")
    public static int field4230;

    @OriginalMember(owner = "client!s", name = "Ac", descriptor = "I")
    public static int field4231;

    @OriginalMember(owner = "client!s", name = "Ic", descriptor = "I")
    public static int field4239;

    @OriginalMember(owner = "client!s", name = "Jc", descriptor = "I")
    public static int field4240;

    @OriginalMember(owner = "client!s", name = "Kc", descriptor = "I")
    public static int field4241;

    @OriginalMember(owner = "client!s", name = "Mc", descriptor = "I")
    public static int field4243;

    @OriginalMember(owner = "client!s", name = "Nc", descriptor = "I")
    public static int field4244;

    @OriginalMember(owner = "client!s", name = "Pc", descriptor = "I")
    public static int field4246;

    @OriginalMember(owner = "client!s", name = "Sc", descriptor = "Lil;")
    public class162 field4249;

    @OriginalMember(owner = "client!s", name = "Lc", descriptor = "Lhg;")
    public static class177 field4242;

    @OriginalMember(owner = "client!s", name = "Ec", descriptor = "Lfe;")
    public static class253 field4235;

    @OriginalMember(owner = "client!s", name = "Qc", descriptor = "Lcf;")
    public class93 field4247;

    @OriginalMember(owner = "client!s", name = "mc", descriptor = "[I")
    public static int[] field4217;

    @OriginalMember(owner = "client!s", name = "jc", descriptor = "[Ldh;")
    public static class120[] field4214;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Ls;[IZ[I[I)V")
    public static final void method1612(class237 arg0, int[] arg1, boolean arg2, int[] arg3, int[] arg4) {
        for (int var5 = 0; ~var5 > ~arg1.length; ++var5) {
            int var6 = arg4[var5];
            int var7 = arg3[var5];
            int var8 = arg1[var5];
            for (int var9 = 0; var6 != 0 && arg0.field3775.length > var9; ++var9) {
                if ((1 & var6) != 0) {
                    if (~var8 != 0) {
                        class31 var10 = class131.method964(var8, true);
                        class208 var11 = arg0.field3775[var9];
                        int var12 = var10.field471;
                        if (var11 != null) {
                            if (~var11.field3729 == ~var8) {
                                if (~var12 != -1) {
                                    if (var12 != 1) {
                                        if (~var12 == -3) {
                                            var11.field3723 = 0;
                                        }
                                    } else {
                                        var11.field3723 = 0;
                                        var11.field3720 = var7;
                                        var11.field3724 = 0;
                                        var11.field3719 = 0;
                                        var11.field3730 = 1;
                                        class55.method309(arg0.field3784, 0, var10, arg0.field3868, -17474, class166.field2927 == arg0);
                                    }
                                } else {
                                    var11 = arg0.field3775[var9] = null;
                                }
                            } else if (~var10.field475 <= ~class131.method964(var11.field3729, !arg2).field475) {
                                var11 = arg0.field3775[var9] = null;
                            }
                        }
                        if (var11 == null) {
                            class208 var13 = arg0.field3775[var9] = new class208();
                            var13.field3730 = 1;
                            var13.field3720 = var7;
                            var13.field3723 = 0;
                            var13.field3729 = var8;
                            var13.field3724 = 0;
                            var13.field3719 = 0;
                            class55.method309(arg0.field3784, 0, var10, arg0.field3868, -17474, class166.field2927 == arg0);
                        }
                    } else {
                        arg0.field3775[var9] = null;
                    }
                }
                var6 >>>= 1;
            }
        }
        if (arg2) {
            method1620(-28);
        }
        ++field4239;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BI)V")
    public static final void method1613(byte arg0, int arg1) {
        ++field4229;
        if (arg0 >= -16) {
            method1619((byte) -52);
        }
        class212 var2 = class123.method905(-1205364448, 10, arg1);
        var2.method1502(255);
    }

    @OriginalMember(owner = "client!s", name = "d", descriptor = "(I)I")
    public final int method1486(int arg0) {
        if (arg0 != 0) {
            field4242 = null;
        }
        ++field4219;
        return super.field3861;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BIZI)V")
    public final void method1614(byte arg0, int arg1, boolean arg2, int arg3) {
        super.method1482(7, arg3, arg1, arg2, this.method1475(false));
        ++field4216;
        int var5 = -52 % ((arg0 - 12) / 36);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIIIIJILod;)V")
    public final void method106(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class91 arg10) {
        ++field4215;
        if (this.field4249 != null) {
            class31 var13 = ~super.field3840 != 0 && ~super.field3869 == -1 ? class131.method964(super.field3840, true) : null;
            class31 var14 = ~super.field3797 == 0 || this.field4232 || super.field3797 == this.method1483(0).field800 && var13 != null ? null : class131.method964(super.field3797, true);
            class20 var15 = this.field4249.method1167(var13, 0, var14, super.field3767, super.field3811, super.field3796, super.field3817, true, super.field3862, super.field3852, super.field3775);
            int var16 = class266.method1780((byte) -90);
            if (~class163.field2873 != -1 && ~var16 > -51) {
                int var17 = -var16 + 50;
                while (~class32.field514 > ~var17) {
                    class234.field4183[class32.field514] = new byte[102400];
                    ++class32.field514;
                }
                while (var17 < class32.field514) {
                    --class32.field514;
                    class234.field4183[class32.field514] = null;
                }
            }
            if (var15 != null) {
                super.field3864 = var15.method93();
                if (class154.field2697 && (this.field4249.field2869 == -1 || class5.method19((byte) -59, this.field4249.field2869).field2503)) {
                    class20 var18 = class163.method1179((byte) 125, super.field3784, 0, 160, 0, arg0, var14 != null ? super.field3862 : super.field3852, super.field3859, super.field3868, 240, var14 != null ? var14 : var13, super.field3795, var15, 1);
                    var18.method106(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class91) null);
                }
                if (class166.field2927 == this) {
                    for (int var19 = class44.field707.length + -1; var19 >= 0; --var19) {
                        class174 var20 = class44.field707[var19];
                        if (var20 != null && var20.field3023 != -1) {
                            if (var20.field3028 == 1 && var20.field3022 >= 0 && ~class155.field2709.length < ~var20.field3022) {
                                class227 var21 = class155.field2709[var20.field3022];
                                if (var21 != null) {
                                    int var22 = var21.field3868 / 32 + -(class166.field2927.field3868 / 32);
                                    int var23 = var21.field3784 / 32 + -(class166.field2927.field3784 / 32);
                                    this.method1621(arg4, (class91) null, arg5, arg2, var20.field3023, arg1, arg6, var15, var22, arg7, var23, arg3, arg0, arg9, (byte) 84);
                                }
                            }
                            if (var20.field3028 == 2) {
                                int var24 = (-class229.field4111 + var20.field3038) * 4 - (class166.field2927.field3868 / 32 + -2);
                                int var25 = (-class4.field52 + var20.field3026) * 4 + -(class166.field2927.field3784 / 32) - -2;
                                this.method1621(arg4, (class91) null, arg5, arg2, var20.field3023, arg1, arg6, var15, var24, arg7, var25, arg3, arg0, arg9, (byte) 84);
                            }
                            if (~var20.field3028 == -11 && ~var20.field3022 <= -1 && ~var20.field3022 > ~class224.field4031.length) {
                                class237 var26 = class224.field4031[var20.field3022];
                                if (var26 != null) {
                                    int var27 = var26.field3868 / 32 + -(class166.field2927.field3868 / 32);
                                    int var28 = var26.field3784 / 32 + -(class166.field2927.field3784 / 32);
                                    this.method1621(arg4, (class91) null, arg5, arg2, var20.field3023, arg1, arg6, var15, var27, arg7, var28, arg3, arg0, arg9, (byte) 84);
                                }
                            }
                        }
                    }
                }
                class20 var29 = null;
                this.method1480(-15429, var15);
                this.method1477(var15, arg0, (byte) -25);
                if (!this.field4232 && ~super.field3846 != 0 && ~super.field3847 != 0) {
                    class135 var30 = class188.method1359(super.field3846, -97);
                    var29 = var30.method984(super.field3829, (byte) 124, super.field3847, super.field3798);
                    if (var29 != null) {
                        var29.method117(0, -super.field3844, 0);
                        if (var30.field2358) {
                            if (~class53.field882 != -1) {
                                var29.method107(class53.field882);
                            }
                            if (class227.field4067 != 0) {
                                var29.method109(class227.field4067);
                            }
                            if (~class191.field3494 != -1) {
                                var29.method117(0, class191.field3494, 0);
                            }
                        }
                    }
                }
                class20 var31 = null;
                if (!this.field4232 && super.field3790 != null) {
                    if (~super.field3839 >= ~class275.field4921) {
                        super.field3790 = null;
                    }
                    if (~class275.field4921 <= ~super.field3813 && class275.field4921 < super.field3839) {
                        if (!(super.field3790 instanceof class178)) {
                            var31 = (class20) super.field3790;
                        } else {
                            var31 = (class20) ((class178) super.field3790).method1299(true);
                        }
                        var31.method117(super.field3831 - super.field3868, -super.field3859 + super.field3853, -super.field3784 + super.field3788);
                        if (~super.field3770 != -513) {
                            if (~super.field3770 == -1025) {
                                var31.method97();
                            } else if (~super.field3770 == -1537) {
                                var31.method91();
                            }
                        } else {
                            var31.method92();
                        }
                    }
                }
                if (var29 != null) {
                    var15 = ((class62) var15).method394(var29);
                }
                if (var31 != null) {
                    var15 = ((class62) var15).method394(var31);
                }
                var15.field264 = true;
                var15.method106(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, super.field3824);
                if (var31 != null) {
                    if (~super.field3770 == -513) {
                        var31.method91();
                    } else if (super.field3770 != 1024) {
                        if (super.field3770 == 1536) {
                            var31.method92();
                        }
                    } else {
                        var31.method97();
                    }
                    var31.method117(-super.field3831 + super.field3868, super.field3859 - super.field3853, -super.field3788 + super.field3784);
                }
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field4218;
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(II)I")
    public static final int method1615(int arg0, int arg1) {
        ++field4240;
        if (arg0 != -2) {
            method1620(55);
        }
        return arg1 & 255;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(B)Z")
    public final boolean method1478(byte arg0) {
        ++field4230;
        int var2 = 63 / ((-57 - arg0) / 46);
        return this.field4249 != null;
    }

    @OriginalMember(owner = "client!s", name = "d", descriptor = "(B)Lcf;")
    public final class93 method1616(byte arg0) {
        ++field4243;
        class93 var2 = this.field4247;
        if (class110.field1885 != null) {
            var2 = class130.method949((byte) -77, new class93[] { class110.field1885[this.field4238], var2 });
        }
        if (client.field2716 != null) {
            var2 = class130.method949((byte) -77, new class93[] { var2, client.field2716[this.field4238] });
        }
        return arg0 != 52 ? null : var2;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BLee;)V")
    public final void method1617(byte arg0, class280 arg1) {
        ++field4231;
        arg1.field5027 = 0;
        int var3 = arg1.method1907(16832);
        int var4 = 1 & var3;
        int var5 = -1;
        int var6 = super.method1475(false);
        this.method1479((7 & var3 >> 3) + 1, -1);
        this.field4238 = (var3 & 249) >> 6;
        int[] var7 = new int[12];
        boolean var8 = ~(4 & var3) != -1;
        super.field3868 += 64 * (-var6 + this.method1475(false));
        super.field3784 += (this.method1475(false) - var6) * 64;
        this.field4222 = arg1.method1925(true);
        this.field4234 = arg1.method1925(true);
        this.field4220 = 0;
        for (int var9 = 0; var9 < 12; ++var9) {
            int var10 = arg1.method1907(16832);
            if (var10 == 0) {
                var7[var9] = 0;
            } else {
                int var11 = arg1.method1907(16832);
                int var12 = (var10 << 8) - -var11;
                if (var9 == 0 && ~var12 == -65536) {
                    var5 = arg1.method1891(-112);
                    this.field4220 = arg1.method1907(16832);
                    break;
                }
                if (~var12 <= -32769) {
                    int var25 = field4217[var12 + -32768];
                    var7[var9] = class270.method1797(var25, 1073741824);
                    int var26 = class89.method617(var25, 0).field423;
                    if (~var26 != -1) {
                        this.field4220 = var26;
                    }
                } else {
                    var7[var9] = class270.method1797(Integer.MIN_VALUE, var12 - 256);
                }
            }
        }
        int[] var13 = new int[5];
        for (int var14 = 0; var14 < 5; ++var14) {
            int var24 = arg1.method1907(16832);
            if (var24 < 0 || var24 >= client.field2730[var14].length) {
                var24 = 0;
            }
            var13[var14] = var24;
        }
        int var15 = -126 % ((9 - arg0) / 51);
        super.field3861 = arg1.method1891(-126);
        long var16 = arg1.method1873((byte) 6);
        this.field4247 = class205.method1454((byte) -126, var16).method687(-96);
        this.field4228 = arg1.method1907(16832);
        if (var8) {
            this.field4227 = arg1.method1891(-118);
            this.field4236 = -1;
            this.field4226 = this.field4228;
        } else {
            this.field4227 = 0;
            this.field4226 = arg1.method1907(16832);
            this.field4236 = arg1.method1907(16832);
            if (this.field4236 == 255) {
                this.field4236 = -1;
            }
        }
        int var18 = this.field4224;
        this.field4224 = arg1.method1907(16832);
        if (~this.field4224 == -1) {
            class45.method252(this, true);
        } else {
            int var19 = this.field4245;
            int var20 = this.field4233;
            int var21 = this.field4237;
            int var22 = this.field4248;
            this.field4233 = arg1.method1891(-121);
            this.field4245 = arg1.method1891(-126);
            this.field4248 = arg1.method1891(-118);
            this.field4237 = arg1.method1891(-111);
            if (this.field4224 != var18 || ~this.field4233 != ~var20 || ~this.field4245 != ~var19 || ~this.field4248 != ~var22 || this.field4237 != var21) {
                class149.method1073(0, this);
            }
        }
        if (this.field4249 == null) {
            this.field4249 = new class162();
        }
        int var23 = this.field4249.field2869;
        this.field4249.method1174(super.field3861, var13, var4 == 1, -10710, var7, var5);
        if (~var5 != ~var23) {
            super.field3868 = super.field3805[0] * 128 - -(this.method1475(false) * 64);
            super.field3784 = super.field3820[0] * 128 + this.method1475(false) * 64;
        }
        if (super.field3824 != null) {
            super.field3824.method630();
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Z)I")
    public final int method1475(boolean arg0) {
        ++field4241;
        if (arg0) {
            return -21;
        } else {
            return this.field4249 != null && this.field4249.field2869 != -1 ? class5.method19((byte) -59, this.field4249.field2869).field2504 : super.method1475(false);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIII)V")
    public final void method95(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4246;
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(III)V")
    public static final void method1618(int arg0, int arg1, int arg2) {
        if (arg2 < 12) {
            method1612((class237) null, (int[]) null, false, (int[]) null, (int[]) null);
        }
        ++field4223;
        for (int var3 = 0; ~class141.field2455 < ~var3; ++var3) {
            class148 var4 = class33.method193(0, var3);
            if (var4 != null) {
                int var5 = var4.field2601;
                if (~var5 <= -1 && !class179.field3156.method1418(-64, var5)) {
                    var5 = -1;
                }
                int var9;
                if (var4.field2607 >= 0) {
                    int var6 = var4.field2607;
                    int var7 = (var6 & 127) + arg0;
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (~var7 < -128) {
                        var7 = 127;
                    }
                    int var8 = (896 & var6) + (64512 & arg1 + var6) + var7;
                    var9 = class179.field3159[class193.method1381(96, (byte) 111, var8)];
                } else if (~var5 > -1) {
                    if (~var4.field2597 != 0) {
                        int var10 = var4.field2597;
                        int var11 = (127 & var10) + arg0;
                        if (var11 >= 0) {
                            if (var11 > 127) {
                                var11 = 127;
                            }
                        } else {
                            var11 = 0;
                        }
                        int var12 = (64512 & var10 - -arg1) + var11 - -(896 & var10);
                        var9 = class179.field3159[class193.method1381(96, (byte) 124, var12)];
                    } else {
                        var9 = -1;
                    }
                } else {
                    var9 = class179.field3159[class193.method1381(96, (byte) 127, class179.field3156.method1416((byte) 114, var5))];
                }
                class159.field2810[var3 - -1] = var9;
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "e", descriptor = "(B)V")
    public static void method1619(byte arg0) {
        field4214 = null;
        field4235 = null;
        field4217 = null;
        field4242 = null;
        if (arg0 != -1) {
            field4214 = null;
        }
    }

    @OriginalMember(owner = "client!s", name = "f", descriptor = "(I)V")
    public static final void method1620(int arg0) {
        int var1 = 0;
        if (arg0 <= 109) {
            method1612((class237) null, (int[]) null, true, (int[]) null, (int[]) null);
        }
        while (class272.field4839 > var1) {
            int var10002 = class53.field860[var1]--;
            if (~class53.field860[var1] <= 9) {
                label89: {
                    class215 var3 = class212.field3882[var1];
                    if (var3 == null) {
                        var3 = class215.method1515(class144.field2487, class283.field5075[var1], 0);
                        if (var3 == null) {
                            break label89;
                        }
                        class53.field860[var1] += var3.method1514();
                        class212.field3882[var1] = var3;
                    }
                    if (~class53.field860[var1] > -1) {
                        label92: {
                            int var4;
                            if (~class4.field44[var1] == -1) {
                                var4 = class267.field4756;
                            } else {
                                int var5 = (class4.field44[var1] & 255) * 128;
                                int var6 = 255 & class4.field44[var1] >> 16;
                                int var7 = var6 * 128 + -class166.field2927.field3868 - -64;
                                if (~var7 > -1) {
                                    var7 = -var7;
                                }
                                int var8 = 255 & class4.field44[var1] >> 8;
                                int var9 = var8 * 128 - -64 + -class166.field2927.field3784;
                                if (~var9 > -1) {
                                    var9 = -var9;
                                }
                                int var10 = var7 + -128 + var9;
                                if (var5 < var10) {
                                    class53.field860[var1] = -100;
                                    break label92;
                                }
                                if (~var10 > -1) {
                                    var10 = 0;
                                }
                                var4 = (var5 - var10) * class143.field2480 / var5;
                            }
                            if (var4 > 0) {
                                class194 var11 = var3.method1517().method1388(class209.field3766);
                                class59 var12 = class59.method344(var11, 100, var4);
                                var12.method361(class131.field2319[var1] + -1);
                                class35.field543.method1658(var12);
                            }
                            class53.field860[var1] = -100;
                        }
                    }
                }
            } else {
                --class272.field4839;
                for (int var2 = var1; ~var2 > ~class272.field4839; ++var2) {
                    class283.field5075[var2] = class283.field5075[var2 - -1];
                    class212.field3882[var2] = class212.field3882[var2 - -1];
                    class131.field2319[var2] = class131.field2319[var2 + 1];
                    class53.field860[var2] = class53.field860[var2 + 1];
                    class4.field44[var2] = class4.field44[var2 + 1];
                }
                --var1;
            }
            ++var1;
        }
        ++field4225;
        if (class254.field4599 && !class51.method283(114)) {
            if (~class195.field3552 != -1 && class164.field2894 != -1) {
                class15.method69(false, 0, class189.field3468, class164.field2894, class195.field3552, -933796316);
            }
            class254.field4599 = false;
        } else if (class195.field3552 != 0 && ~class164.field2894 != 0 && !class51.method283(69)) {
            ++class29.field373;
            class285.field5105.method1568(36, (byte) 125);
            class285.field5105.method1886(class164.field2894, 2);
            class164.field2894 = -1;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "()I")
    public final int method93() {
        ++field4221;
        return super.field3864;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ILod;IIIIILbk;IIIIIIB)V")
    private final void method1621(int arg0, class91 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class20 arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, byte arg14) {
        ++field4244;
        int var16 = arg8 * arg8 - -(arg10 * arg10);
        if (var16 >= 16 && var16 <= 360000) {
            int var17 = 2047 & (int) (Math.atan2((double) arg8, (double) arg10) * 325.949D);
            class20 var18 = class53.method293(var17, super.field3868, super.field3859, arg4, false, arg7, super.field3784);
            if (var18 != null) {
                var18.method106(0, arg5, arg3, arg11, arg0, arg2, arg6, arg9, -1L, arg13, arg1);
            }
            if (arg14 != 84) {
                this.field4227 = 29;
            }
        }
    }
}
