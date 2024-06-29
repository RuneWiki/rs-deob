import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public class class344 extends class457 implements class526 {

    @OriginalMember(owner = "client!ku", name = "X", descriptor = "Z")
    private boolean field4605;

    @OriginalMember(owner = "client!ku", name = "M", descriptor = "B")
    private byte field4594;

    @OriginalMember(owner = "client!ku", name = "W", descriptor = "S")
    private short field4604;

    @OriginalMember(owner = "client!ku", name = "U", descriptor = "Z")
    private boolean field4602;

    @OriginalMember(owner = "client!ku", name = "kb", descriptor = "Z")
    private boolean field4618;

    @OriginalMember(owner = "client!ku", name = "pb", descriptor = "Z")
    private boolean field4623;

    @OriginalMember(owner = "client!ku", name = "nb", descriptor = "Lha;")
    private class54 field4621;

    @OriginalMember(owner = "client!ku", name = "Y", descriptor = "Lda;")
    private class55 field4606;

    @OriginalMember(owner = "client!ku", name = "L", descriptor = "I")
    public static int field4593;

    @OriginalMember(owner = "client!ku", name = "O", descriptor = "I")
    public static int field4596;

    @OriginalMember(owner = "client!ku", name = "P", descriptor = "I")
    public static int field4597;

    @OriginalMember(owner = "client!ku", name = "Q", descriptor = "I")
    public static int field4598;

    @OriginalMember(owner = "client!ku", name = "S", descriptor = "I")
    public static int field4600;

    @OriginalMember(owner = "client!ku", name = "T", descriptor = "I")
    public static int field4601;

    @OriginalMember(owner = "client!ku", name = "V", descriptor = "I")
    public static int field4603;

    @OriginalMember(owner = "client!ku", name = "Z", descriptor = "I")
    public static int field4607;

    @OriginalMember(owner = "client!ku", name = "ab", descriptor = "I")
    public static int field4608;

    @OriginalMember(owner = "client!ku", name = "bb", descriptor = "I")
    public static int field4609;

    @OriginalMember(owner = "client!ku", name = "cb", descriptor = "I")
    public static int field4610;

    @OriginalMember(owner = "client!ku", name = "db", descriptor = "I")
    public static int field4611;

    @OriginalMember(owner = "client!ku", name = "eb", descriptor = "I")
    public static int field4612;

    @OriginalMember(owner = "client!ku", name = "fb", descriptor = "I")
    public static int field4613;

    @OriginalMember(owner = "client!ku", name = "gb", descriptor = "I")
    public static int field4614;

    @OriginalMember(owner = "client!ku", name = "hb", descriptor = "I")
    public static int field4615;

    @OriginalMember(owner = "client!ku", name = "ib", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!ku", name = "jb", descriptor = "I")
    public static int field4617;

    @OriginalMember(owner = "client!ku", name = "lb", descriptor = "I")
    public static int field4619;

    @OriginalMember(owner = "client!ku", name = "mb", descriptor = "I")
    public static int field4620;

    @OriginalMember(owner = "client!ku", name = "ob", descriptor = "I")
    public static int field4622;

    @OriginalMember(owner = "client!ku", name = "qb", descriptor = "I")
    public static int field4624;

    @OriginalMember(owner = "client!ku", name = "rb", descriptor = "I")
    public static int field4625;

    @OriginalMember(owner = "client!ku", name = "sb", descriptor = "I")
    public static int field4626;

    @OriginalMember(owner = "client!ku", name = "N", descriptor = "Lcr;")
    private class533 field4595;

    @OriginalMember(owner = "client!ku", name = "R", descriptor = "[[I")
    public static int[][] field4599;

    @OriginalMember(owner = "client!ku", name = "h", descriptor = "(B)V", line = 4)
    public static void method2003(byte arg0) {
        field4599 = null;
        if (arg0 != -42) {
            field4599 = null;
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(III)Z", line = 16)
    public static final boolean method2004(int arg0, int arg1, int arg2) {
        if (arg0 != -1) {
            method2007(-24, -32);
        }
        ++field4600;
        return ~(1408 & arg1) != -1;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(BIIIII)V", line = 28)
    public static final void method2005(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4626;
        int var6 = class280.method1727((byte) 94, class533.field7200, class469.field6466, arg1);
        int var7 = class280.method1727((byte) 94, class533.field7200, class469.field6466, arg5);
        int var8 = class280.method1727((byte) 94, class529.field7169, class128.field1831, arg3);
        int var9 = class280.method1727((byte) 94, class529.field7169, class128.field1831, arg2);
        if (arg0 == 0) {
            for (int var10 = var6; ~var7 <= ~var10; ++var10) {
                class470.method2660(var8, var9, field4599[var10], (byte) 11, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(ILr;)Lcr;", line = 63)
    public final class533 method214(int arg0, class166 arg1) {
        int var3 = 78 / ((81 - arg0) / 43);
        ++field4611;
        if (this.field4595 == null) {
            this.field4595 = class333.method1966(super.field4042, 16, super.field4052, this.method2006(0, (byte) 104, arg1), super.field4047);
        }
        return this.field4595;
    }

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(Lr;I)Lbca;", line = 77)
    public final class614 method221(class166 arg0, int arg1) {
        ++field4607;
        if (this.field4606 == null) {
            return null;
        } else {
            class392 var3 = arg0.method166();
            if (arg1 != -5) {
                this.method211((byte) -97);
            }
            var3.method689(super.field4042, super.field4052, super.field4047);
            class614 var4 = null;
            if (this.field4605) {
                var4 = class524.method2987(arg1 ^ -6262, 1);
            }
            if (class340.field4563) {
                this.field4606.method453(var3, var4 != null ? var4.field8572[0] : null, class22.field250, 0);
            } else {
                this.field4606.method465(var3, var4 != null ? var4.field8572[0] : null, 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(Lvv;IIZLr;II)V", line = 114)
    public final void method223(class295 arg0, int arg1, int arg2, boolean arg3, class166 arg4, int arg5, int arg6) {
        if (arg0 instanceof class344) {
            class344 var8 = (class344) arg0;
            if (this.field4606 != null && var8.field4606 != null) {
                this.field4606.method467(var8.field4606, arg5, arg1, arg2, arg3);
            }
        }
        if (arg6 == 0) {
            ++field4610;
        }
    }

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(B)I", line = 138)
    public final int method211(byte arg0) {
        int var2 = 55 / ((38 - arg0) / 41);
        ++field4596;
        return this.field4604 & 65535;
    }

    @OriginalMember(owner = "client!ku", name = "e", descriptor = "(B)Z", line = 149)
    public final boolean method209(byte arg0) {
        int var2 = 19 % ((31 - arg0) / 42);
        ++field4620;
        return this.field4606 == null ? false : this.field4606.method430();
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(IIILr;)Z", line = 165)
    public final boolean method224(int arg0, int arg1, int arg2, class166 arg3) {
        ++field4625;
        class55 var5 = this.method2006(131072, (byte) 104, arg3);
        if (var5 != null) {
            class392 var6 = arg3.method166();
            var6.method689(super.field4042, super.field4052, super.field4047);
            return !class340.field4563 ? var5.method448(arg2, arg0, var6, false) : var5.method419(arg2, arg0, var6, false, class22.field250);
        } else {
            return arg1 != 0 ? false : false;
        }
    }

    @OriginalMember(owner = "client!ku", name = "f", descriptor = "(I)I", line = 188)
    public final int method217(int arg0) {
        ++field4612;
        if (arg0 <= 29) {
            this.field4594 = 65;
        }
        return this.field4606 != null ? this.field4606.method463() : 0;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(B)I", line = 200)
    public final int method213(byte arg0) {
        if (arg0 < 39) {
            this.field4618 = false;
        }
        ++field4593;
        return this.field4594;
    }

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(I)Z", line = 211)
    public final boolean method219(int arg0) {
        int var2 = -124 % ((arg0 - 28) / 40);
        ++field4603;
        return this.field4623;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(IBLr;)Lda;", line = 222)
    private final class55 method2006(int arg0, byte arg1, class166 arg2) {
        ++field4615;
        if (this.field4606 != null && arg2.method134(this.field4606.method422(), arg0) == 0) {
            return this.field4606;
        } else {
            if (arg1 != 104) {
                method2008((byte) -41, 60, -7);
            }
            class604 var4 = this.method2009(false, arg0, (byte) 115, arg2);
            return var4 == null ? null : var4.field8408;
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(BLr;)V", line = 243)
    public final void method210(byte arg0, class166 arg1) {
        if (arg0 != 12) {
            this.field4604 = 55;
        }
        ++field4622;
        Object var3 = null;
        class54 var5;
        if (this.field4621 == null && this.field4623) {
            class604 var4 = this.method2009(true, 262144, (byte) 92, arg1);
            var5 = var4 == null ? null : var4.field8406;
        } else {
            var5 = this.field4621;
            this.field4621 = null;
        }
        if (var5 != null) {
            class403.method2350(var5, super.field4050, super.field4042, super.field4047, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(Lr;Z)V", line = 270)
    public final void method220(class166 arg0, boolean arg1) {
        ++field4608;
        if (!arg1) {
            this.method2006(-39, (byte) 126, (class166) null);
        }
    }

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(Z)Z", line = 281)
    public final boolean method216(boolean arg0) {
        if (!arg0) {
            this.field4606 = null;
        }
        ++field4619;
        return true;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(Z)I", line = 293)
    public final int method222(boolean arg0) {
        if (!arg0) {
            this.field4605 = true;
        }
        ++field4616;
        return 22;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(Lr;I)V", line = 304)
    public final void method225(class166 arg0, int arg1) {
        ++field4614;
        Object var3 = null;
        class54 var5;
        if (this.field4621 == null && this.field4623) {
            class604 var4 = this.method2009(true, 262144, (byte) 121, arg0);
            var5 = var4 != null ? var4.field8406 : null;
        } else {
            var5 = this.field4621;
            this.field4621 = null;
        }
        if (var5 != null) {
            class482.method2706(var5, super.field4050, super.field4042, super.field4047, (boolean[]) null);
        }
        if (arg1 != -32013) {
            this.field4623 = false;
        }
    }

    @OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Lr;Ljs;IIIIIZIZ)V", line = 332)
    public class344(class166 arg0, class301 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, boolean arg9) {
        super(arg4, arg5, arg6, arg2, arg3, arg1.field4182);
        this.field4605 = arg1.field4164 != 0 && !arg7;
        this.field4594 = (byte) arg8;
        super.field4042 = arg4;
        this.field4604 = (short) arg1.field4131;
        this.field4602 = arg9;
        super.field4047 = arg6;
        this.field4618 = arg7;
        this.field4623 = arg0.method94() && arg1.field4128 && !this.field4618 && ~class366.field4875.method3770(class503.field6917, true) != -1;
        int var11 = 2048;
        if (this.field4602) {
            var11 |= 65536;
        }
        class604 var12 = this.method2009(this.field4623, var11, (byte) 43, arg0);
        if (var12 != null) {
            this.field4621 = var12.field8406;
            this.field4606 = var12.field8408;
            if (this.field4602) {
                this.field4606 = this.field4606.method462((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ku", name = "d", descriptor = "(I)I", line = 366)
    public final int method226(int arg0) {
        ++field4597;
        if (arg0 != 6329) {
            return 43;
        } else {
            return this.field4606 == null ? 0 : this.field4606.method426();
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(II)V", line = 379)
    public static final void method2007(int arg0, int arg1) {
        if (arg0 != 65536) {
            method2007(-50, 79);
        }
        ++field4609;
        class51 var2 = class703.method3938(-1989279584, arg1, 9);
        var2.method404(58);
    }

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(BII)Z", line = 393)
    public static final boolean method2008(byte arg0, int arg1, int arg2) {
        if (arg0 != -7) {
            return false;
        } else {
            ++field4613;
            return ~(2048 & arg1) != -1;
        }
    }

    @OriginalMember(owner = "client!ku", name = "g", descriptor = "(I)Z", line = 405)
    public final boolean method215(int arg0) {
        ++field4617;
        if (arg0 < 49) {
            this.method222(false);
        }
        return this.field4602;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(ZIBLr;)Lfh;", line = 417)
    private final class604 method2009(boolean arg0, int arg1, byte arg2, class166 arg3) {
        ++field4598;
        if (arg2 <= 28) {
            this.method217(-104);
        }
        class301 var5 = class475.field6543.method2685(this.field4604 & 65535, -64);
        class37 var6;
        class37 var7;
        if (!this.field4618) {
            if (super.field4050 >= 3) {
                var6 = null;
            } else {
                var6 = class497.field6766[super.field4050 + 1];
            }
            var7 = class497.field6766[super.field4050];
        } else {
            var7 = class52.field606[super.field4050];
            var6 = class497.field6766[0];
        }
        return var5.method1826(super.field4042, 11553, super.field4047, var6, arg0, arg1, arg3, var7, 22, super.field4052, this.field4594);
    }

    @OriginalMember(owner = "client!ku", name = "i", descriptor = "(I)V", line = 448)
    public final void method227(int arg0) {
        this.field4602 = false;
        if (arg0 < -115) {
            ++field4601;
            if (this.field4606 != null) {
                this.field4606.method452(this.field4606.method422() & -65537);
            }
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(I)V", line = 462)
    public final void method208(int arg0) {
        if (arg0 == -18279) {
            if (this.field4606 != null) {
                this.field4606.method432();
            }
            ++field4624;
        }
    }
}
