import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class26 extends class58 {

    @OriginalMember(owner = "client!we", name = "yc", descriptor = "I")
    public int field372 = -1;

    @OriginalMember(owner = "client!we", name = "zc", descriptor = "I")
    public int field373 = -1;

    @OriginalMember(owner = "client!we", name = "Gc", descriptor = "I")
    public static int field380 = -1;

    @OriginalMember(owner = "client!we", name = "Ic", descriptor = "Lvq;")
    public static class24 field382;

    @OriginalMember(owner = "client!we", name = "Jc", descriptor = "Leb;")
    public static class395 field383;

    @OriginalMember(owner = "client!we", name = "Kc", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!we", name = "lc", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!we", name = "mc", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!we", name = "nc", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!we", name = "oc", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!we", name = "pc", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!we", name = "qc", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!we", name = "rc", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!we", name = "sc", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!we", name = "tc", descriptor = "I")
    public static int field367;

    @OriginalMember(owner = "client!we", name = "uc", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!we", name = "wc", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!we", name = "xc", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!we", name = "Ac", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!we", name = "Bc", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!we", name = "Cc", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!we", name = "Dc", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!we", name = "Ec", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!we", name = "Fc", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!we", name = "Hc", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!we", name = "vc", descriptor = "Lun;")
    public class327 field369;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "(B)I")
    public final int method263(byte arg0) {
        ++field363;
        if (this.field369.field4871 != null) {
            class327 var2 = this.field369.method2139(true);
            if (var2 != null && ~var2.field4827 != 0) {
                return var2.field4827;
            }
        }
        if (arg0 > -36) {
            this.method267(true);
        }
        return this.field369.field4827;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILfp;I)Z")
    private final boolean method264(int arg0, class9 arg1, int arg2) {
        ++field370;
        int var4 = arg0;
        class446 var5 = this.method450(0);
        class196 var6 = super.field751 != -1 && super.field737 == 0 ? class83.method556(super.field751, 115) : null;
        class196 var7 = ~super.field706 == 0 || super.field719 && var6 != null ? null : class83.method556(super.field706, arg2 + 83);
        int var8 = var5.field6511;
        int var9 = var5.field6508;
        if (~var8 != -1 || ~var9 != -1 || var5.field6522 != 0 || var5.field6516 != 0) {
            arg0 |= 7;
        }
        class143 var10 = super.field792[0] = this.field369.method2143(0, var7, super.field717, super.field758, arg0, arg1, super.field746, super.field756, var6, super.field723, super.field772, super.field780);
        if (var10 == null) {
            return false;
        } else {
            super.field736 = var10.method950();
            this.method448(var10, false);
            int var11 = super.field705.method1672(10319);
            super.field739 = 0;
            super.field732 = 0;
            super.field725 = 0;
            if (var8 == 0 && var9 == 0) {
                this.method440(2, this.method446(10) << 7, this.method446(arg2 + 10) << 7, var11);
            } else {
                this.method440(arg2 + 2, var8, var9, var11);
                if (super.field725 != 0) {
                    super.field792[0].method944(super.field725);
                }
                if (~super.field732 != -1) {
                    super.field792[0].method958(super.field732);
                }
                if (super.field739 != 0) {
                    super.field792[0].method946(0, super.field739, 0);
                }
            }
            super.field792[1] = null;
            if (~super.field781 != arg2 && ~super.field759 != 0) {
                class302 var12 = class332.method2169(256, super.field781);
                class143 var13 = var12.method2013(var4 | (var12.field4410 ? 7 : 2), super.field764, super.field724, super.field759, (byte) -121, arg1);
                if (var13 != null) {
                    var13.method946(0, -super.field707, 0);
                    if (var12.field4410 && (var8 != 0 || var9 != 0)) {
                        if (super.field725 != 0) {
                            var13.method944(super.field725);
                        }
                        if (~super.field732 != -1) {
                            var13.method958(super.field732);
                        }
                        if (super.field739 != 0) {
                            var13.method946(0, super.field739, 0);
                        }
                    }
                    super.field792[1] = var13;
                }
            }
            super.field792[2] = null;
            if (super.field787 != null) {
                if (~class388.field5665 > ~super.field787.field6682) {
                    if (super.field787.field6694 <= class388.field5665) {
                        class143 var14 = super.field787.method2816(7 | var4, arg1, (byte) -119);
                        if (var14 != null) {
                            var14.method946(-super.field4954 + super.field787.field6699, -super.field4952 + super.field787.field6679, super.field787.field6678 - super.field4951);
                            if (var11 != 0) {
                                var14.method954(var11);
                            }
                            super.field792[2] = var14;
                        }
                    }
                } else {
                    super.field787 = null;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(III)V")
    public final void method265(int arg0, int arg1, int arg2) {
        ++field378;
        int var4 = super.field793[0];
        int var5 = super.field784[0];
        if (~arg0 == -1) {
            ++var5;
        }
        if (~arg0 == -2) {
            ++var4;
            ++var5;
        }
        if (arg2 != 255) {
            this.method267(true);
        }
        if (arg0 == 2) {
            ++var4;
        }
        if (~arg0 == -4) {
            --var5;
            ++var4;
        }
        if (arg0 == 4) {
            --var5;
        }
        if (arg0 == 5) {
            --var4;
            --var5;
        }
        if (~arg0 == -7) {
            --var4;
        }
        if (~arg0 == -8) {
            ++var5;
            --var4;
        }
        if (super.field751 != -1 && class83.method556(super.field751, 123).field2770 == 1) {
            super.field751 = -1;
        }
        if (super.field781 != -1) {
            class302 var6 = class332.method2169(arg2 ^ 511, super.field781);
            if (var6.field4424 && ~var6.field4422 != 0 && class83.method556(var6.field4422, arg2 ^ 163).field2770 == 1) {
                super.field781 = -1;
            }
        }
        if (super.field790 < 9) {
            ++super.field790;
        }
        for (int var7 = super.field790; ~var7 < -1; --var7) {
            super.field793[var7] = super.field793[var7 - 1];
            super.field784[var7] = super.field784[var7 + -1];
            super.field786[var7] = super.field786[var7 - 1];
        }
        super.field793[0] = var4;
        super.field784[0] = var5;
        super.field786[0] = (byte) arg1;
    }

    @OriginalMember(owner = "client!we", name = "f", descriptor = "(I)Z")
    public final boolean method266(int arg0) {
        if (arg0 >= -115) {
            return false;
        } else {
            ++field381;
            return this.field369 != null;
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(Z)Z")
    private final boolean method267(boolean arg0) {
        if (arg0) {
            this.method275((byte) 22);
        }
        ++field371;
        return this.field369.field4810;
    }

    @OriginalMember(owner = "client!we", name = "d", descriptor = "(I)V")
    public final void method33(int arg0) {
        if (arg0 > 109) {
            ++field361;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!we", name = "e", descriptor = "(B)I")
    public final int method268(byte arg0) {
        ++field364;
        return arg0 >= -101 ? 93 : super.field736;
    }

    @OriginalMember(owner = "client!we", name = "d", descriptor = "(B)Z")
    public final boolean method34(byte arg0) {
        int var2 = -14 % ((-19 - arg0) / 44);
        ++field375;
        return false;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(ILfp;)V")
    public final void method14(int arg0, class9 arg1) {
        if (arg0 != -7561) {
            field380 = 3;
        }
        ++field367;
        if (this.field369 != null) {
            if (super.field791 || this.method264(0, arg1, 0)) {
                this.method441(super.field792, super.field791, arg1, (byte) 15);
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lfp;III)Z")
    public final boolean method5(class9 arg0, int arg1, int arg2, int arg3) {
        ++field374;
        if (this.field369 != null && this.method264(65536, arg0, 0)) {
            if (arg2 != -754) {
                this.method5((class9) null, 66, 45, 56);
            }
            class187 var5 = arg0.method145();
            int var6 = super.field705.method1672(arg2 ^ -10943);
            var5.method828(var6);
            var5.method823(super.field4954, super.field4952, super.field4951);
            for (int var7 = 0; ~super.field792.length < ~var7; ++var7) {
                if (super.field792[var7] != null && super.field792[var7].method988(arg3, arg1, var5, this.field369.field4819 == 1)) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!we", name = "h", descriptor = "(B)I")
    public final int method269(byte arg0) {
        ++field362;
        if (this.field369.field4871 != null) {
            class327 var2 = this.field369.method2139(true);
            if (var2 != null && var2.field4848 != -1) {
                return var2.field4848;
            }
        }
        if (arg0 != -117) {
            this.field372 = 106;
        }
        return ~this.field369.field4848 == 0 ? super.method269((byte) -117) : this.field369.field4848;
    }

    @OriginalMember(owner = "client!we", name = "g", descriptor = "(I)V")
    public static void method270(int arg0) {
        field382 = null;
        field383 = null;
        if (arg0 != 1) {
            field380 = 37;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILfp;)Luq;")
    public final class241 method2(int arg0, class9 arg1) {
        ++field365;
        if (this.field369 != null && this.method264(1024, arg1, 0)) {
            class187 var3 = arg1.method145();
            int var4 = super.field705.method1672(10319);
            var3.method828(var4);
            var3.method823(super.field4954, super.field4952, super.field4951);
            class446 var5 = this.method450(0);
            class327 var6 = this.field369.field4871 == null ? this.field369 : this.field369.method2139(true);
            if (class182.field2561 && var6.field4851 && var5.field6513) {
                class196 var7 = ~super.field751 != 0 && ~super.field737 == -1 ? class83.method556(super.field751, 105) : null;
                class196 var8 = super.field706 == -1 || super.field719 && var7 != null ? null : class83.method556(super.field706, 107);
                class143 var9 = class57.method433(65535 & this.field369.field4860, this.field369.field4866 & 255, var4, this.field369.field4819, super.field732, super.field725, arg1, (byte) -48, super.field739, var8 != null ? var8 : var7, super.field766, super.field792[0], this.field369.field4829 & 65535, var8 != null ? super.field723 : super.field717, this.field369.field4828 & 255);
                if (var9 != null) {
                    float var10 = arg1.method132();
                    float var11 = arg1.method149();
                    arg1.method146(false);
                    arg1.method81(var10, var11 - 150.0F);
                    var9.method947(var3, (class396) null, 0);
                    arg1.method81(var10, var11);
                    arg1.method146(true);
                }
            }
            class241 var12 = null;
            if (this.method267(false)) {
                var12 = class395.method2485(-29083, super.field792.length);
            }
            if (super.field788 == null) {
                arg1.method147(super.field792, var3, var12 == null ? null : var12.field3578, 0);
            } else {
                class400 var13 = super.field788.method2076();
                arg1.method108(super.field792, var13, var3, var12 != null ? var12.field3578 : null, 0);
            }
            this.method441(super.field792, false, arg1, (byte) 15);
            if (arg0 >= -125) {
                return null;
            } else {
                if (super.field792[2] != null) {
                    if (var4 != 0) {
                        super.field792[2].method954(var4);
                    }
                    super.field792[2].method946(super.field4954 - super.field787.field6699, super.field4952 - super.field787.field6679, -super.field787.field6678 + super.field4951);
                }
                return var12;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(IIIIIII)V")
    public static final void method271(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field368;
        int var7 = class382.method2423(arg1, class146.field1978, arg4 ^ 25891, class248.field3659);
        int var8 = class382.method2423(arg0, class146.field1978, arg4 ^ 25964, class248.field3659);
        int var9 = class382.method2423(arg6, class63.field838, 97, class9.field128);
        int var10 = class382.method2423(arg2, class63.field838, 115, class9.field128);
        int var11 = class382.method2423(arg1 + arg5, class146.field1978, 58, class248.field3659);
        int var12 = class382.method2423(-arg5 + arg0, class146.field1978, 78, class248.field3659);
        for (int var13 = var7; var11 > var13; ++var13) {
            class381.method2419((byte) 122, arg3, var9, class323.field4774[var13], var10);
        }
        if (arg4 != 25882) {
            method271(-43, -31, -49, -115, -3, -53, -71);
        }
        for (int var14 = var8; var14 > var12; --var14) {
            class381.method2419((byte) 37, arg3, var9, class323.field4774[var14], var10);
        }
        int var15 = class382.method2423(arg5 + arg6, class63.field838, arg4 + -25839, class9.field128);
        int var16 = class382.method2423(-arg5 + arg2, class63.field838, arg4 + -25848, class9.field128);
        for (int var17 = var11; ~var17 >= ~var12; ++var17) {
            int[] var18 = class323.field4774[var17];
            class381.method2419((byte) 111, arg3, var9, var18, var15);
            class381.method2419((byte) 41, arg3, var16, var18, var10);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lfp;Lje;ZIIII)V")
    public final void method32(class9 arg0, class309 arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field359;
        if (arg5 >= -31) {
            this.method34((byte) -36);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IBIIII)V")
    public static final void method272(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != -68) {
            field380 = 8;
        }
        for (int var6 = arg4; var6 < arg4 - -arg5; ++var6) {
            for (int var9 = arg0; ~var9 > ~(arg0 + arg2); ++var9) {
                if (~var9 <= -1 && var9 < class195.field2745 && var6 >= 0 && ~var6 > ~class78.field984) {
                    class264.field3910[arg3][var9][var6] = arg3 <= 0 ? 0 : class264.field3910[arg3 + -1][var9][var6] + -240;
                }
            }
        }
        ++field379;
        if (arg0 > 0 && arg0 < class195.field2745) {
            for (int var7 = arg4 - -1; arg4 - -arg5 > var7; ++var7) {
                if (var7 >= 0 && class78.field984 > var7) {
                    class264.field3910[arg3][arg0][var7] = class264.field3910[arg3][arg0 + -1][var7];
                }
            }
        }
        if (~arg4 < -1 && ~class78.field984 < ~arg4) {
            for (int var8 = arg0 - -1; ~(arg0 + arg2) < ~var8; ++var8) {
                if (~var8 <= -1 && var8 < class195.field2745) {
                    class264.field3910[arg3][var8][arg4] = class264.field3910[arg3][var8][arg4 - 1];
                }
            }
        }
        if (~arg0 <= -1 && ~arg4 <= -1 && arg0 < class195.field2745 && class78.field984 > arg4) {
            if (arg3 != 0) {
                if (arg0 > 0 && ~class264.field3910[arg3 - 1][arg0 + -1][arg4] != ~class264.field3910[arg3][arg0 + -1][arg4]) {
                    class264.field3910[arg3][arg0][arg4] = class264.field3910[arg3][arg0 - 1][arg4];
                    return;
                }
                if (~arg4 < -1 && ~class264.field3910[arg3 - 1][arg0][arg4 + -1] != ~class264.field3910[arg3][arg0][arg4 + -1]) {
                    class264.field3910[arg3][arg0][arg4] = class264.field3910[arg3][arg0][arg4 + -1];
                    return;
                }
                if (arg0 > 0 && arg4 > 0 && class264.field3910[arg3][arg0 + -1][arg4 - 1] != class264.field3910[arg3 + -1][arg0 + -1][arg4 + -1]) {
                    class264.field3910[arg3][arg0][arg4] = class264.field3910[arg3][arg0 + -1][arg4 + -1];
                    return;
                }
            } else {
                if (~arg0 >= -1 || class264.field3910[arg3][arg0 + -1][arg4] == 0) {
                    if (~arg4 < -1 && class264.field3910[arg3][arg0][arg4 - 1] != 0) {
                        class264.field3910[arg3][arg0][arg4] = class264.field3910[arg3][arg0][arg4 - 1];
                        return;
                    }
                    if (arg0 > 0 && ~arg4 < -1 && class264.field3910[arg3][arg0 + -1][arg4 + -1] != 0) {
                        class264.field3910[arg3][arg0][arg4] = class264.field3910[arg3][arg0 + -1][arg4 + -1];
                        return;
                    }
                    return;
                }
                class264.field3910[arg3][arg0][arg4] = class264.field3910[arg3][arg0 + -1][arg4];
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lun;I)V")
    public final void method273(class327 arg0, int arg1) {
        if (arg1 != -27397) {
            field382 = null;
        }
        ++field376;
        this.field369 = arg0;
        if (super.field788 != null) {
            super.field788.method2079();
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIBIZI)V")
    public final void method274(int arg0, int arg1, byte arg2, int arg3, boolean arg4, int arg5) {
        ++field377;
        super.field4960 = (byte) arg0;
        if (~super.field751 != 0 && ~class83.method556(super.field751, 81).field2770 == -2) {
            super.field751 = -1;
        }
        if (~super.field781 != 0) {
            class302 var7 = class332.method2169(256, super.field781);
            if (var7.field4424 && var7.field4422 != -1 && ~class83.method556(var7.field4422, arg2 + 121).field2770 == -2) {
                super.field781 = -1;
            }
        }
        if (!arg4) {
            int var8 = -super.field793[0] + arg3;
            int var9 = arg1 - super.field784[0];
            if (var8 >= -8 && var8 <= 8 && ~var9 <= 7 && ~var9 >= -9) {
                if (~super.field790 > -10) {
                    ++super.field790;
                }
                for (int var10 = super.field790; ~var10 < -1; --var10) {
                    super.field793[var10] = super.field793[var10 - 1];
                    super.field784[var10] = super.field784[var10 + -1];
                    super.field786[var10] = super.field786[var10 + -1];
                }
                super.field793[0] = arg3;
                super.field786[0] = 1;
                super.field784[0] = arg1;
                return;
            }
        }
        super.field785 = 0;
        super.field789 = 0;
        super.field793[0] = arg3;
        super.field790 = 0;
        super.field784[0] = arg1;
        super.field4954 = super.field793[0] * 128 + arg5 * 64;
        super.field4951 = super.field784[0] * 128 + arg5 * 64;
        if (arg2 != -35) {
            this.method264(89, (class9) null, -97);
        }
        if (super.field788 != null) {
            super.field788.method2079();
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(B)I")
    public final int method275(byte arg0) {
        ++field366;
        if (arg0 <= 113) {
            this.method5((class9) null, 25, -40, -13);
        }
        if (this.field369.field4871 != null) {
            class327 var2 = this.field369.method2139(true);
            if (var2 != null && var2.field4831 != -1) {
                return var2.field4831;
            }
        }
        return this.field369.field4831;
    }

    static {
        new class409("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
        field382 = new class24(83, 3);
        field383 = new class395();
        field384 = 1;
    }
}
