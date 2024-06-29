import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class556 extends class742 {

    @OriginalMember(owner = "client!fs", name = "Zc", descriptor = "I")
    public int field7309 = 1;

    @OriginalMember(owner = "client!fs", name = "gd", descriptor = "I")
    public int field7316 = -1;

    @OriginalMember(owner = "client!fs", name = "Yc", descriptor = "I")
    public int field7308 = -1;

    @OriginalMember(owner = "client!fs", name = "dd", descriptor = "I")
    public int field7313 = 1;

    @OriginalMember(owner = "client!fs", name = "td", descriptor = "Lga;")
    public static class407 field7329 = new class407();

    @OriginalMember(owner = "client!fs", name = "ud", descriptor = "Lqj;")
    public static class512 field7330 = new class512();

    @OriginalMember(owner = "client!fs", name = "Qc", descriptor = "I")
    public static int field7300;

    @OriginalMember(owner = "client!fs", name = "Rc", descriptor = "I")
    public static int field7301;

    @OriginalMember(owner = "client!fs", name = "Sc", descriptor = "I")
    public static int field7302;

    @OriginalMember(owner = "client!fs", name = "Tc", descriptor = "I")
    public static int field7303;

    @OriginalMember(owner = "client!fs", name = "Uc", descriptor = "I")
    public static int field7304;

    @OriginalMember(owner = "client!fs", name = "Wc", descriptor = "I")
    public static int field7306;

    @OriginalMember(owner = "client!fs", name = "Xc", descriptor = "I")
    public static int field7307;

    @OriginalMember(owner = "client!fs", name = "ad", descriptor = "I")
    public static int field7310;

    @OriginalMember(owner = "client!fs", name = "bd", descriptor = "I")
    public static int field7311;

    @OriginalMember(owner = "client!fs", name = "cd", descriptor = "I")
    public static int field7312;

    @OriginalMember(owner = "client!fs", name = "ed", descriptor = "I")
    public static int field7314;

    @OriginalMember(owner = "client!fs", name = "fd", descriptor = "I")
    public static int field7315;

    @OriginalMember(owner = "client!fs", name = "hd", descriptor = "I")
    public static int field7317;

    @OriginalMember(owner = "client!fs", name = "jd", descriptor = "I")
    public static int field7319;

    @OriginalMember(owner = "client!fs", name = "kd", descriptor = "I")
    public static int field7320;

    @OriginalMember(owner = "client!fs", name = "ld", descriptor = "I")
    public static int field7321;

    @OriginalMember(owner = "client!fs", name = "md", descriptor = "I")
    public int field7322;

    @OriginalMember(owner = "client!fs", name = "nd", descriptor = "I")
    public static int field7323;

    @OriginalMember(owner = "client!fs", name = "od", descriptor = "I")
    public static int field7324;

    @OriginalMember(owner = "client!fs", name = "pd", descriptor = "I")
    public static int field7325;

    @OriginalMember(owner = "client!fs", name = "rd", descriptor = "I")
    public static int field7327;

    @OriginalMember(owner = "client!fs", name = "qd", descriptor = "Lhh;")
    public class131 field7326;

    @OriginalMember(owner = "client!fs", name = "sd", descriptor = "Lpha;")
    public class166 field7328;

    @OriginalMember(owner = "client!fs", name = "Vc", descriptor = "Lwu;")
    public static class376 field7305;

    @OriginalMember(owner = "client!fs", name = "id", descriptor = "Ljava/lang/String;")
    public String field7318;

    @OriginalMember(owner = "client!fs", name = "f", descriptor = "(I)I", line = 5)
    public final int method1451(int arg0) {
        ++field7320;
        if (arg0 >= 0) {
            return -99;
        } else {
            return this.field7328 == null ? 0 : this.field7328.field2522;
        }
    }

    @OriginalMember(owner = "client!fs", name = "d", descriptor = "(I)Z", line = 21)
    public final boolean method798(int arg0) {
        int var2 = -84 / ((53 - arg0) / 45);
        ++field7319;
        return false;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Lee;Z)Leja;", line = 32)
    public static final class735 method3090(class677 arg0, boolean arg1) {
        ++field7301;
        class476 var2 = class446.method2555(124, arg0);
        int var3 = arg0.method3807(-1);
        int var4 = arg0.method3807(-1);
        if (!arg1) {
            method3097(121, (class59) null, -107, 14, (class2) null);
        }
        int var5 = arg0.method3807(-1);
        int var6 = arg0.method3807(-1);
        int var7 = arg0.method3807(-1);
        int var8 = arg0.method3807(-1);
        return new class735(var2.field6522, var2.field6523, var2.field6521, var2.field6528, var2.field6529, var2.field6531, var2.field6526, var2.field6530, var2.field6524, var3, var4, var5, var6, var7, var8);
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Lkf;Lha;IIIZI)V", line = 57)
    public final void method807(class256 arg0, class59 arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        if (arg3 < 109) {
            this.method3092((byte) -84);
        }
        ++field7315;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "(Z)I", line = 68)
    public final int method3091(boolean arg0) {
        ++field7306;
        if (this.field7328.field2575 != null) {
            class166 var2 = this.field7328.method1190((byte) 83, class74.field901);
            if (var2 != null && var2.field2530 != -1) {
                return var2.field2530;
            }
        }
        if (!arg0) {
            method3090((class677) null, true);
        }
        return ~this.field7328.field2530 == 0 ? super.method3091(arg0) : this.field7328.field2530;
    }

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "(B)Z", line = 92)
    public final boolean method3092(byte arg0) {
        ++field7314;
        if (arg0 != -84) {
            return true;
        } else {
            return this.field7328 != null;
        }
    }

    @OriginalMember(owner = "client!fs", name = "m", descriptor = "(I)V", line = 107)
    public static final void method3093(int arg0) {
        if (~class15.field215 == -10) {
            class66.method566(5, -21035);
        } else if (~class15.field215 != -6 && class15.field215 != 6) {
            if (class15.field215 == 12) {
                class66.method566(3, -21035);
            }
        } else {
            class66.method566(3, -21035);
        }
        ++field7311;
        int var1 = -91 / ((26 - arg0) / 58);
    }

    @OriginalMember(owner = "client!fs", name = "d", descriptor = "(Z)V", line = 134)
    public static void method3094(boolean arg0) {
        field7305 = null;
        field7329 = null;
        field7330 = null;
        if (arg0) {
            method3090((class677) null, true);
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Lha;B)V", line = 146)
    public final void method792(class59 arg0, byte arg1) {
        ++field7324;
        if (this.field7328 != null) {
            if (super.field10317 || this.method3096((byte) -104, 0, arg0)) {
                class333 var3 = arg0.method451();
                if (arg1 < 121) {
                    this.method3100(-112, (byte) -58, -107);
                }
                var3.method1713(super.field10284.method2097((byte) -106));
                var3.method1730(super.field3505, super.field3510 + -20, super.field3502);
                this.method4140(super.field10315, arg0, (byte) -22, var3, super.field10317);
                super.field10315[0] = super.field10315[1] = super.field10315[2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(BLha;)Lck;", line = 175)
    public final class642 method808(byte arg0, class59 arg1) {
        ++field7307;
        if (arg0 > -86) {
            this.method807((class256) null, (class59) null, -53, -68, 57, false, 85);
        }
        return null;
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(B)I", line = 190)
    public final int method2257(byte arg0) {
        ++field7310;
        if (this.field7328.field2575 != null) {
            class166 var2 = this.field7328.method1190((byte) 101, class74.field901);
            if (var2 != null && ~var2.field2513 != 0) {
                return var2.field2513;
            }
        }
        int var3 = 78 % ((arg0 - 64) / 59);
        return this.field7328.field2513;
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(ILha;)Lww;", line = 214)
    public final class733 method800(int arg0, class59 arg1) {
        ++field7323;
        if (this.field7328 != null && this.method3096((byte) -110, 2048, arg1)) {
            class333 var3 = arg1.method451();
            int var4 = super.field10284.method2097((byte) -60);
            var3.method1713(var4);
            class701 var5 = class660.field8718[super.field3508][super.field3505 >> class140.field2224][super.field3502 >> class140.field2224];
            if (arg0 != -1) {
                this.field7309 = 9;
            }
            if (var5 != null && var5.field9738 != null) {
                int var6 = super.field10224 - var5.field9738.field7274;
                super.field10224 = (int) ((float) super.field10224 - (float) var6 / 10.0F);
            } else {
                super.field10224 = (int) ((float) super.field10224 - (float) super.field10224 / 10.0F);
            }
            var3.method1730(super.field3505, super.field3510 + -20 + -super.field10224, super.field3502);
            class98 var7 = this.method4141(0);
            class166 var8 = this.field7328.field2575 != null ? this.field7328.method1190((byte) 94, class74.field901) : this.field7328;
            super.field10314 = false;
            class733 var9 = null;
            if (~class411.field5711.field3918.method1832(true) == -2 && var8.field2506 && var7.field1258) {
                class456 var10 = ~super.field10257 != 0 && ~super.field10237 == -1 ? class509.field6780.method663((byte) -90, super.field10257) : null;
                class456 var11 = super.field10247 == -1 || super.field10304 && var10 != null ? null : class509.field6780.method663((byte) -90, super.field10247);
                class475 var12 = class721.method4048(super.field10295, super.field10315[0], this.field7328.field2544, arg1, super.field10260, super.field10236, var11 == null ? super.field10233 : super.field10261, var4, 255 & this.field7328.field2552, 255 & this.field7328.field2531, 65535 & this.field7328.field2548, var11 == null ? var10 : var11, (byte) -75, this.field7328.field2580 & 65535);
                if (var12 != null) {
                    var9 = class397.method2338(this.method3098(-2), (byte) 117, super.field10315.length + 1);
                    super.field10314 = true;
                    arg1.method493(false);
                    if (class540.field7159) {
                        var12.method160(var3, var9.field10150[super.field10315.length], class100.field1358, 0);
                    } else {
                        var12.method155(var3, var9.field10150[super.field10315.length], 0);
                    }
                    arg1.method493(true);
                }
            }
            var3.method1713(var4);
            var3.method1730(super.field3505, super.field3510 + -5 + -super.field10224, super.field3502);
            if (var9 == null) {
                var9 = class397.method2338(this.method3098(-2), (byte) 127, super.field10315.length);
            }
            this.method4140(super.field10315, arg1, (byte) -121, var3, false);
            if (!class540.field7159) {
                for (int var13 = 0; ~super.field10315.length < ~var13; ++var13) {
                    if (super.field10315[var13] != null) {
                        super.field10315[var13].method155(var3, var9.field10150[var13], 0);
                    }
                }
            } else {
                for (int var14 = 0; var14 < super.field10315.length; ++var14) {
                    if (super.field10315[var14] != null) {
                        super.field10315[var14].method160(var3, var9.field10150[var14], class100.field1358, 0);
                    }
                }
            }
            if (super.field10319 != null) {
                class388 var15 = super.field10319.method131();
                if (!class540.field7159) {
                    arg1.method508(var15);
                } else {
                    arg1.method407(var15, class100.field1358);
                }
            }
            for (int var16 = 0; super.field10315.length > var16; ++var16) {
                if (super.field10315[var16] != null) {
                    super.field10314 |= super.field10315[var16].method159();
                }
            }
            super.field10258 = class405.field5645;
            super.field10315[0] = super.field10315[1] = super.field10315[2] = null;
            return var9;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(ZIIIII)V", line = 350)
    public final void method3095(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super.field3508 = super.field3515 = (byte) arg4;
        ++field7304;
        if (class498.method2810(-10387, arg1, arg2)) {
            ++super.field3515;
        }
        if (~super.field10257 != 0 && ~class509.field6780.method663((byte) -90, super.field10257).field6217 == -2) {
            super.field10227 = null;
            super.field10257 = -1;
        }
        for (int var7 = 0; super.field10254.length > var7; ++var7) {
            if (super.field10254[var7].field6361 != -1) {
                class94 var12 = class226.field3216.method3929(super.field10254[var7].field6361, -1);
                if (var12.field1132 && var12.field1140 != -1 && ~class509.field6780.method663((byte) -90, var12.field1140).field6217 == -2) {
                    super.field10254[var7].field6361 = -1;
                }
            }
        }
        if (!arg0) {
            int var8 = -super.field10322[0] + arg1;
            int var9 = -super.field10321[0] + arg2;
            if (~var8 <= 7 && var8 <= 8 && var9 >= -8 && ~var9 >= -9) {
                if (super.field10316 < 9) {
                    ++super.field10316;
                }
                for (int var10 = super.field10316; ~var10 < -1; --var10) {
                    super.field10322[var10] = super.field10322[var10 + -1];
                    super.field10321[var10] = super.field10321[var10 + -1];
                    super.field10312[var10] = super.field10312[var10 + -1];
                }
                super.field10322[0] = arg1;
                super.field10321[0] = arg2;
                super.field10312[0] = 1;
                return;
            }
        }
        super.field10316 = 0;
        super.field10322[0] = arg1;
        super.field10313 = 0;
        super.field10318 = 0;
        super.field10321[0] = arg2;
        super.field3505 = (super.field10322[0] << 9) + (arg3 << 8);
        super.field3502 = (super.field10321[0] << 9) - -(arg3 << 8);
        int var11 = -18 / ((arg5 - 49) / 49);
        if (super.field10319 != null) {
            super.field10319.method130();
        }
    }

    @OriginalMember(owner = "client!fs", name = "g", descriptor = "(I)V", line = 436)
    public final void method803(int arg0) {
        if (arg0 == 131072) {
            ++field7325;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(BILha;)Z", line = 447)
    private final boolean method3096(byte arg0, int arg1, class59 arg2) {
        ++field7303;
        int var4 = arg1;
        if (arg0 >= -67) {
            this.method807((class256) null, (class59) null, -125, -64, 126, true, 114);
        }
        class98 var5 = this.method4141(0);
        class456 var6 = super.field10257 != -1 && super.field10237 == 0 ? class509.field6780.method663((byte) -90, super.field10257) : null;
        class456 var7 = ~super.field10247 == 0 || super.field10304 && var6 != null ? null : class509.field6780.method663((byte) -90, super.field10247);
        int var8 = var5.field1237;
        int var9 = var5.field1226;
        if (~var8 != -1 || var9 != 0 || var5.field1240 != 0 || ~var5.field1250 != -1) {
            arg1 |= 7;
        }
        boolean var10 = ~super.field10263 != -1 && ~class29.field474 <= ~super.field10292 && ~class29.field474 > ~super.field10234;
        if (var10) {
            arg1 |= 524288;
        }
        int var11 = super.field10284.method2097((byte) -100);
        class475 var12 = super.field10315[0] = this.field7328.method1191(super.field10238, var6, 32, this.field7326, arg1, class372.field5174, var7, super.field10233, super.field10220, super.field10279, class74.field901, super.field10261, super.field10301, arg2, super.field10291, var11, super.field10276, class509.field6780);
        if (var12 == null) {
            return false;
        } else {
            super.field10306 = var12.method180();
            super.field10269 = var12.method167();
            this.method4134(0, var12);
            if (var8 == 0 && var9 == 0) {
                this.method4135(this.method2256(-1) << 9, 0, this.method2256(-1) << 9, var11, -17993, 0);
            } else {
                this.method4135(var8, var5.field1252, var9, var11, -17993, var5.field1261);
                if (super.field10236 != 0) {
                    super.field10315[0].method143(super.field10236);
                }
                if (super.field10295 != 0) {
                    super.field10315[0].method210(super.field10295);
                }
                if (super.field10260 != 0) {
                    super.field10315[0].method188(0, super.field10260, 0);
                }
            }
            if (var10) {
                var12.method199(super.field10290, super.field10226, super.field10298, super.field10263 & 255);
            }
            this.method4145(var8, var4, var11, var5, var9, arg2, false);
            return true;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(B)I", line = 511)
    public final int method2266(byte arg0) {
        ++field7312;
        if (arg0 <= 80) {
            this.field7313 = 87;
        }
        if (this.field7328.field2575 != null) {
            class166 var2 = this.field7328.method1190((byte) 103, class74.field901);
            if (var2 != null && var2.field2521 != -1) {
                return var2.field2521;
            }
        }
        return this.field7328.field2521;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Lha;IIB)Z", line = 535)
    public final boolean method790(class59 arg0, int arg1, int arg2, byte arg3) {
        ++field7300;
        if (this.field7328 != null && this.method3096((byte) -120, 131072, arg0)) {
            class333 var5 = arg0.method451();
            int var6 = super.field10284.method2097((byte) -100);
            var5.method1713(var6);
            var5.method1730(super.field3505, super.field3510, super.field3502);
            boolean var7 = false;
            for (int var8 = 0; ~super.field10315.length < ~var8; ++var8) {
                if (super.field10315[var8] != null) {
                    boolean var10000;
                    label47: {
                        if (~this.field7328.field2522 >= -1) {
                            label45: {
                                if (~this.field7328.field2517 == 0) {
                                    if (this.field7328.field2544 == 1) {
                                        break label45;
                                    }
                                    var10000 = false;
                                } else {
                                    if (~this.field7328.field2517 == -2) {
                                        break label45;
                                    }
                                    var10000 = false;
                                }
                                if (!var10000) {
                                    var10000 = false;
                                    break label47;
                                }
                            }
                        }
                        var10000 = true;
                    }
                    boolean var9 = var10000;
                    boolean var10;
                    if (class540.field7159) {
                        var10 = super.field10315[var8].method203(arg2, arg1, var5, var9, this.field7328.field2522, class100.field1358);
                    } else {
                        var10 = super.field10315[var8].method158(arg2, arg1, var5, var9, this.field7328.field2522);
                    }
                    if (var10) {
                        var7 = true;
                        break;
                    }
                }
            }
            if (arg3 != 103) {
                this.field7309 = 89;
            }
            super.field10315[0] = super.field10315[1] = super.field10315[2] = null;
            return var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(ILha;IILro;)V", line = 593)
    public static final void method3097(int arg0, class59 arg1, int arg2, int arg3, class2 arg4) {
        ++field7317;
        class668.field9127.method23(10);
        if (!class442.field6098) {
            for (class630 var5 = (class630) arg4.method21(2); var5 != null; var5 = (class630) arg4.method9(-128)) {
                class325 var6 = class744.field10338.method3192((byte) 118, var5.field8387);
                if (class378.method2236(var6, 7)) {
                    boolean var7 = class18.method138(var6, arg0, arg2, -1789756095, arg1, var5);
                    if (var7) {
                        class654.method3561(var5, arg1, var6, 6983);
                    }
                }
            }
            if (arg3 != -4201) {
                method3090((class677) null, false);
            }
        }
    }

    @OriginalMember(owner = "client!fs", name = "n", descriptor = "(I)Z", line = 628)
    private final boolean method3098(int arg0) {
        if (arg0 != -2) {
            return true;
        } else {
            ++field7327;
            return this.field7328.field2563;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(BLpha;)V", line = 639)
    public final void method3099(byte arg0, class166 arg1) {
        ++field7321;
        this.field7328 = arg1;
        if (this.field7328 != null) {
            this.field7322 = this.field7328.field2510;
            this.field7318 = this.field7328.field2567;
        }
        if (arg0 <= -76) {
            if (super.field10319 != null) {
                super.field10319.method130();
            }
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IBI)V", line = 661)
    public final void method3100(int arg0, byte arg1, int arg2) {
        ++field7302;
        int var4 = super.field10322[0];
        if (arg1 < -72) {
            int var5 = super.field10321[0];
            if (~arg2 == -1) {
                ++var5;
            }
            if (~arg2 == -2) {
                ++var5;
                ++var4;
            }
            if (arg2 == 2) {
                ++var4;
            }
            if (~arg2 == -4) {
                --var5;
                ++var4;
            }
            if (arg2 == 4) {
                --var5;
            }
            if (arg2 == 5) {
                --var4;
                --var5;
            }
            if (~arg2 == -7) {
                --var4;
            }
            if (~arg2 == -8) {
                ++var5;
                --var4;
            }
            if (super.field10257 != -1 && ~class509.field6780.method663((byte) -90, super.field10257).field6217 == -2) {
                super.field10257 = -1;
                super.field10227 = null;
            }
            for (int var6 = 0; ~var6 > ~super.field10254.length; ++var6) {
                if (~super.field10254[var6].field6361 != 0) {
                    class94 var8 = class226.field3216.method3929(super.field10254[var6].field6361, -1);
                    if (var8.field1132 && ~var8.field1140 != 0 && ~class509.field6780.method663((byte) -90, var8.field1140).field6217 == -2) {
                        super.field10254[var6].field6361 = -1;
                    }
                }
            }
            if (~super.field10316 > -10) {
                ++super.field10316;
            }
            for (int var7 = super.field10316; ~var7 < -1; --var7) {
                super.field10322[var7] = super.field10322[var7 + -1];
                super.field10321[var7] = super.field10321[var7 + -1];
                super.field10312[var7] = super.field10312[var7 + -1];
            }
            super.field10322[0] = var4;
            super.field10312[0] = (byte) arg0;
            super.field10321[0] = var5;
        }
    }
}
