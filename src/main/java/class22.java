import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class22 extends class210 implements class526 {

    @OriginalMember(owner = "client!an", name = "hb", descriptor = "B")
    private byte field261;

    @OriginalMember(owner = "client!an", name = "S", descriptor = "S")
    private short field246;

    @OriginalMember(owner = "client!an", name = "ub", descriptor = "Z")
    private boolean field274;

    @OriginalMember(owner = "client!an", name = "wb", descriptor = "Z")
    private boolean field276;

    @OriginalMember(owner = "client!an", name = "R", descriptor = "B")
    private byte field245;

    @OriginalMember(owner = "client!an", name = "tb", descriptor = "Z")
    private boolean field273;

    @OriginalMember(owner = "client!an", name = "lb", descriptor = "Z")
    private boolean field265;

    @OriginalMember(owner = "client!an", name = "sb", descriptor = "Lda;")
    public class55 field272;

    @OriginalMember(owner = "client!an", name = "bb", descriptor = "Lha;")
    private class54 field255;

    @OriginalMember(owner = "client!an", name = "W", descriptor = "I")
    public static int field250 = 7000;

    @OriginalMember(owner = "client!an", name = "Q", descriptor = "I")
    public static int field244;

    @OriginalMember(owner = "client!an", name = "T", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "client!an", name = "U", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!an", name = "V", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!an", name = "X", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!an", name = "Y", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!an", name = "Z", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!an", name = "ab", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!an", name = "cb", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!an", name = "db", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!an", name = "eb", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!an", name = "fb", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!an", name = "gb", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!an", name = "jb", descriptor = "I")
    public static int field263;

    @OriginalMember(owner = "client!an", name = "kb", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!an", name = "mb", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!an", name = "nb", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!an", name = "ob", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!an", name = "pb", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!an", name = "qb", descriptor = "I")
    public static int field270;

    @OriginalMember(owner = "client!an", name = "rb", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!an", name = "vb", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!an", name = "xb", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!an", name = "ib", descriptor = "Lcr;")
    private class533 field262;

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Lr;Ljs;IIIIIZIIIIIIZ)V")
    public class22(class166 arg0, class301 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field4110 == -2, class59.method488(arg12, 9, arg13));
        this.field261 = (byte) arg13;
        this.field246 = (short) arg1.field4131;
        this.field274 = arg1.field4164 != 0 && !arg7;
        this.field276 = arg14;
        this.field245 = (byte) arg12;
        super.field4050 = (byte) arg3;
        this.field273 = arg7;
        this.field265 = arg0.method94() && arg1.field4128 && !this.field273 && ~class366.field4875.method3770(class503.field6917, true) != -1;
        int var16 = 2048;
        if (this.field276) {
            var16 |= 65536;
        }
        class604 var17 = this.method233(this.field265, arg0, var16, -9506);
        if (var17 != null) {
            this.field272 = var17.field8408;
            this.field255 = var17.field8406;
            if (this.field276) {
                this.field272 = this.field272.method462((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(B)I")
    public final int method213(byte arg0) {
        ++field266;
        return arg0 <= 39 ? 35 : this.field261;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(BLr;)V")
    public final void method210(byte arg0, class166 arg1) {
        ++field277;
        Object var3 = null;
        class54 var5;
        if (this.field255 == null && this.field265) {
            class604 var4 = this.method233(true, arg1, 262144, -9506);
            var5 = var4 != null ? var4.field8406 : null;
        } else {
            var5 = this.field255;
            this.field255 = null;
        }
        if (arg0 != 12) {
            this.method219(64);
        }
        if (var5 != null) {
            class403.method2350(var5, super.field4050, super.field4042, super.field4047, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Lr;Z)V")
    public final void method220(class166 arg0, boolean arg1) {
        ++field270;
        if (!arg1) {
            this.method227(124);
        }
    }

    @OriginalMember(owner = "client!an", name = "f", descriptor = "(I)I")
    public final int method217(int arg0) {
        if (arg0 <= 29) {
            this.method223((class295) null, 47, 94, true, (class166) null, -89, -55);
        }
        ++field251;
        return this.field272 == null ? 0 : this.field272.method463();
    }

    @OriginalMember(owner = "client!an", name = "c", descriptor = "(Z)I")
    public final int method229(boolean arg0) {
        if (arg0) {
            return -45;
        } else {
            ++field267;
            return this.field272 == null ? 15 : this.field272.method450() / 4;
        }
    }

    @OriginalMember(owner = "client!an", name = "d", descriptor = "(I)I")
    public final int method226(int arg0) {
        if (arg0 != 6329) {
            return 119;
        } else {
            ++field275;
            return this.field272 == null ? 0 : this.field272.method426();
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(ILr;)Lcr;")
    public final class533 method214(int arg0, class166 arg1) {
        int var3 = -10 % ((arg0 - 81) / 43);
        if (this.field262 == null) {
            this.field262 = class333.method1966(super.field4042, 16, super.field4052, this.method230(0, arg1, 0), super.field4047);
        }
        ++field269;
        return this.field262;
    }

    @OriginalMember(owner = "client!an", name = "e", descriptor = "(B)Z")
    public final boolean method209(byte arg0) {
        int var2 = -100 % ((31 - arg0) / 42);
        ++field263;
        return this.field272 == null ? false : this.field272.method430();
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(ILr;I)Lda;")
    private final class55 method230(int arg0, class166 arg1, int arg2) {
        ++field244;
        if (this.field272 != null && arg1.method134(this.field272.method422(), arg2) == 0) {
            return this.field272;
        } else {
            if (arg0 != 0) {
                this.field274 = false;
            }
            class604 var4 = this.method233(false, arg1, arg2, -9506);
            return var4 == null ? null : var4.field8408;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IIILr;)Z")
    public final boolean method224(int arg0, int arg1, int arg2, class166 arg3) {
        ++field247;
        class55 var5 = this.method230(arg1, arg3, 131072);
        if (var5 != null) {
            class392 var6 = arg3.method166();
            var6.method689(super.field4042, super.field4052, super.field4047);
            return class340.field4563 ? var5.method419(arg2, arg0, var6, false, field250) : var5.method448(arg2, arg0, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Lr;I)V")
    public final void method225(class166 arg0, int arg1) {
        if (arg1 == -32013) {
            ++field260;
            Object var3 = null;
            class54 var5;
            if (this.field255 == null && this.field265) {
                class604 var4 = this.method233(true, arg0, 262144, -9506);
                var5 = var4 != null ? var4.field8406 : null;
            } else {
                var5 = this.field255;
                this.field255 = null;
            }
            if (var5 != null) {
                class482.method2706(var5, super.field4050, super.field4042, super.field4047, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(Z)Z")
    public final boolean method216(boolean arg0) {
        if (!arg0) {
            this.method222(false);
        }
        ++field259;
        return true;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(I)V")
    public final void method208(int arg0) {
        if (arg0 == -18279) {
            if (this.field272 != null) {
                this.field272.method432();
            }
            ++field256;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Z)I")
    public final int method222(boolean arg0) {
        if (!arg0) {
            this.method227(127);
        }
        ++field257;
        return this.field245;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IB)V")
    public static final void method231(int arg0, byte arg1) {
        int var2 = -78 % ((10 - arg1) / 39);
        ++field252;
        if (client.method1683(arg0, (byte) 103)) {
            class303.method1848(class167.field2439[arg0], -1, 59);
        }
    }

    @OriginalMember(owner = "client!an", name = "g", descriptor = "(I)Z")
    public final boolean method215(int arg0) {
        ++field248;
        return arg0 <= 49 ? false : this.field276;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(ILac;)Lec;")
    public static final class213 method232(int arg0, class501 arg1) {
        ++field249;
        if (arg0 != 0) {
            method232(-64, (class501) null);
        }
        int var2 = arg1.method2845(-1);
        return new class213(var2);
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(ZLr;II)Lfh;")
    private final class604 method233(boolean arg0, class166 arg1, int arg2, int arg3) {
        if (arg3 != -9506) {
            method231(-105, (byte) -10);
        }
        ++field258;
        class301 var5 = class475.field6543.method2685(this.field246 & 65535, arg3 ^ 9579);
        class37 var6;
        class37 var7;
        if (this.field273) {
            var6 = class52.field606[super.field4050];
            var7 = class497.field6766[0];
        } else {
            var6 = class497.field6766[super.field4050];
            if (super.field4050 >= 3) {
                var7 = null;
            } else {
                var7 = class497.field6766[super.field4050 + 1];
            }
        }
        return var5.method1826(super.field4042, 11553, super.field4047, var7, arg0, arg2, arg1, var6, ~this.field245 != -12 ? this.field245 : 10, super.field4052, this.field245 == 11 ? this.field261 + 4 : this.field261);
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(B)I")
    public final int method211(byte arg0) {
        ++field254;
        int var2 = 69 / ((38 - arg0) / 41);
        return 65535 & this.field246;
    }

    @OriginalMember(owner = "client!an", name = "i", descriptor = "(I)V")
    public final void method227(int arg0) {
        this.field276 = false;
        ++field264;
        if (arg0 > -115) {
            this.method222(true);
        }
        if (this.field272 != null) {
            this.field272.method452(-65537 & this.field272.method422());
        }
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(Lr;I)Lbca;")
    public final class614 method221(class166 arg0, int arg1) {
        ++field253;
        if (this.field272 == null) {
            return null;
        } else {
            if (arg1 != -5) {
                this.field265 = false;
            }
            class392 var3 = arg0.method166();
            var3.method689(super.field4042, super.field4052, super.field4047);
            class614 var4 = null;
            if (this.field274) {
                var4 = class524.method2987(6257, 1);
            }
            if (class340.field4563) {
                this.field272.method453(var3, var4 != null ? var4.field8572[0] : null, field250, 0);
            } else {
                this.field272.method465(var3, var4 != null ? var4.field8572[0] : null, 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Lvv;IIZLr;II)V")
    public final void method223(class295 arg0, int arg1, int arg2, boolean arg3, class166 arg4, int arg5, int arg6) {
        ++field268;
        if (arg6 != 0) {
            this.field272 = null;
        }
        if (arg0 instanceof class451) {
            class451 var8 = (class451) arg0;
            if (this.field272 != null && var8.field6189 != null) {
                this.field272.method467(var8.field6189, arg5, arg1, arg2, arg3);
            }
        } else {
            if (arg0 instanceof class22) {
                class22 var9 = (class22) arg0;
                if (this.field272 != null && var9.field272 != null) {
                    this.field272.method467(var9.field272, arg5, arg1, arg2, arg3);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(I)Z")
    public final boolean method219(int arg0) {
        ++field271;
        int var2 = -90 % ((arg0 - 28) / 40);
        return this.field265;
    }
}
