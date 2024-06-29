import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!haa")
public class class311 extends class19 implements class324 {

    @OriginalMember(owner = "client!haa", name = "hb", descriptor = "B")
    private byte field4219;

    @OriginalMember(owner = "client!haa", name = "T", descriptor = "Z")
    private boolean field4205;

    @OriginalMember(owner = "client!haa", name = "S", descriptor = "B")
    private byte field4204;

    @OriginalMember(owner = "client!haa", name = "W", descriptor = "Z")
    private boolean field4208;

    @OriginalMember(owner = "client!haa", name = "G", descriptor = "Z")
    private boolean field4193;

    @OriginalMember(owner = "client!haa", name = "jb", descriptor = "S")
    private short field4221;

    @OriginalMember(owner = "client!haa", name = "R", descriptor = "Z")
    private boolean field4203;

    @OriginalMember(owner = "client!haa", name = "X", descriptor = "Lka;")
    public class282 field4209;

    @OriginalMember(owner = "client!haa", name = "D", descriptor = "Lr;")
    private class704 field4190;

    @OriginalMember(owner = "client!haa", name = "U", descriptor = "I")
    public static int field4206 = 0;

    @OriginalMember(owner = "client!haa", name = "ab", descriptor = "Lgr;")
    public static class530 field4212 = new class530(23, 7);

    @OriginalMember(owner = "client!haa", name = "nb", descriptor = "I")
    public static int field4225 = 0;

    @OriginalMember(owner = "client!haa", name = "C", descriptor = "I")
    public static int field4189;

    @OriginalMember(owner = "client!haa", name = "E", descriptor = "I")
    public static int field4191;

    @OriginalMember(owner = "client!haa", name = "F", descriptor = "I")
    public static int field4192;

    @OriginalMember(owner = "client!haa", name = "H", descriptor = "I")
    public static int field4194;

    @OriginalMember(owner = "client!haa", name = "I", descriptor = "I")
    public static int field4195;

    @OriginalMember(owner = "client!haa", name = "J", descriptor = "I")
    public static int field4196;

    @OriginalMember(owner = "client!haa", name = "K", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!haa", name = "L", descriptor = "I")
    public static int field4198;

    @OriginalMember(owner = "client!haa", name = "N", descriptor = "I")
    public static int field4199;

    @OriginalMember(owner = "client!haa", name = "O", descriptor = "I")
    public static int field4200;

    @OriginalMember(owner = "client!haa", name = "P", descriptor = "I")
    public static int field4201;

    @OriginalMember(owner = "client!haa", name = "Q", descriptor = "I")
    public static int field4202;

    @OriginalMember(owner = "client!haa", name = "V", descriptor = "I")
    public static int field4207;

    @OriginalMember(owner = "client!haa", name = "Y", descriptor = "I")
    public static int field4210;

    @OriginalMember(owner = "client!haa", name = "bb", descriptor = "I")
    public static int field4213;

    @OriginalMember(owner = "client!haa", name = "db", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!haa", name = "eb", descriptor = "I")
    public static int field4216;

    @OriginalMember(owner = "client!haa", name = "fb", descriptor = "I")
    public static int field4217;

    @OriginalMember(owner = "client!haa", name = "gb", descriptor = "I")
    public static int field4218;

    @OriginalMember(owner = "client!haa", name = "ib", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!haa", name = "kb", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!haa", name = "lb", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!haa", name = "mb", descriptor = "I")
    public static int field4224;

    @OriginalMember(owner = "client!haa", name = "ob", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!haa", name = "cb", descriptor = "Ltd;")
    public static class515 field4214;

    @OriginalMember(owner = "client!haa", name = "Z", descriptor = "Lro;")
    private class522 field4211;

    @OriginalMember(owner = "client!haa", name = "b", descriptor = "(I)I")
    public final int method606(int arg0) {
        if (arg0 >= -32) {
            this.method613((byte) 24, (class543) null);
        }
        ++field4194;
        return this.field4219;
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(Lha;Z)V")
    public final void method597(class543 arg0, boolean arg1) {
        ++field4198;
        if (arg1) {
            field4206 = 11;
        }
        Object var3 = null;
        class704 var5;
        if (this.field4190 == null && this.field4203) {
            class495 var4 = this.method1931(1, true, arg0, 262144);
            var5 = var4 != null ? var4.field7117 : null;
        } else {
            var5 = this.field4190;
            this.field4190 = null;
        }
        if (var5 != null) {
            class659.method3762(var5, super.field3924, super.field3923, super.field3916, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!haa", name = "j", descriptor = "(I)V")
    public static void method1930(int arg0) {
        field4212 = null;
        field4214 = null;
        if (arg0 != -20630) {
            method1930(32);
        }
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(ILjw;Lha;BIZI)V")
    public final void method711(int arg0, class280 arg1, class543 arg2, byte arg3, int arg4, boolean arg5, int arg6) {
        if (arg3 <= 28) {
            this.field4205 = true;
        }
        ++field4217;
        if (!(arg1 instanceof class311)) {
            if (arg1 instanceof class610) {
                class610 var8 = (class610) arg1;
                if (this.field4209 != null && var8.field8714 != null) {
                    this.field4209.method512(var8.field8714, arg0, arg4, arg6, arg5);
                    return;
                }
            }
        } else {
            class311 var9 = (class311) arg1;
            if (this.field4209 == null || var9.field4209 == null) {
                return;
            }
            this.field4209.method512(var9.field4209, arg0, arg4, arg6, arg5);
        }
    }

    @OriginalMember(owner = "client!haa", name = "d", descriptor = "(I)Z")
    public final boolean method715(int arg0) {
        if (arg0 != -12888) {
            method1930(-96);
        }
        ++field4201;
        return this.field4205;
    }

    @OriginalMember(owner = "client!haa", name = "d", descriptor = "(B)I")
    public final int method599(byte arg0) {
        if (arg0 > -4) {
            field4206 = 29;
        }
        ++field4210;
        return this.field4209 != null ? this.field4209.method507() : 0;
    }

    @OriginalMember(owner = "client!haa", name = "e", descriptor = "(B)Z")
    public final boolean method607(byte arg0) {
        int var2 = -9 % ((27 - arg0) / 62);
        ++field4207;
        if (this.field4209 != null) {
            return !this.field4209.method504();
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(IZLha;I)Lmg;")
    private final class495 method1931(int arg0, boolean arg1, class543 arg2, int arg3) {
        if (arg0 != 1) {
            this.method599((byte) -56);
        }
        ++field4220;
        class482 var5 = class375.field5421.method2680(this.field4221 & 65535, (byte) 96);
        class339 var6;
        class339 var7;
        if (!this.field4193) {
            var6 = class491.field7079[super.field3924];
            if (~super.field3924 <= -4) {
                var7 = null;
            } else {
                var7 = class491.field7079[super.field3924 + 1];
            }
        } else {
            var6 = class25.field221[super.field3924];
            var7 = class491.field7079[0];
        }
        return var5.method2942(super.field3923, this.field4219, arg1, super.field3916, this.field4204, arg3, arg2, super.field3922, (byte) 72, var6, var7);
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(B)I")
    public final int method601(byte arg0) {
        if (arg0 < 86) {
            return -77;
        } else {
            ++field4202;
            return 65535 & this.field4221;
        }
    }

    @OriginalMember(owner = "client!haa", name = "c", descriptor = "(B)V")
    public final void method598(byte arg0) {
        if (this.field4209 != null) {
            this.field4209.method499();
        }
        if (arg0 < -9) {
            ++field4197;
        }
    }

    @OriginalMember(owner = "client!haa", name = "b", descriptor = "(B)I")
    public final int method604(byte arg0) {
        ++field4222;
        return arg0 != 94 ? -120 : this.field4204;
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(BLha;)Lqs;")
    public final class603 method613(byte arg0, class543 arg1) {
        ++field4213;
        if (this.field4209 == null) {
            return null;
        } else {
            if (arg0 <= 76) {
                this.field4221 = 40;
            }
            class121 var3 = arg1.method342();
            var3.method845(super.field3923, super.field3922, super.field3916);
            class603 var4 = class6.method26(this.field4208, 108, 1);
            if (!class100.field1447) {
                this.field4209.method533(var3, var4.field8543[0], 0);
            } else {
                this.field4209.method503(var3, var4.field8543[0], class680.field9660, 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!haa", name = "g", descriptor = "(I)I")
    public final int method595(int arg0) {
        if (arg0 != 32767) {
            this.field4219 = -46;
        }
        ++field4191;
        return this.field4209 == null ? 0 : this.field4209.method511();
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(IIILha;)Z")
    public final boolean method594(int arg0, int arg1, int arg2, class543 arg3) {
        if (arg2 != 1) {
            this.field4203 = false;
        }
        ++field4200;
        class282 var5 = this.method1932(arg3, 131072, -96);
        if (var5 != null) {
            class121 var6 = arg3.method342();
            var6.method845(super.field3923, super.field3922, super.field3916);
            return class100.field1447 ? var5.method538(arg1, arg0, var6, false, 0, class680.field9660) : var5.method496(arg1, arg0, var6, false, 0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(I)Z")
    public final boolean method611(int arg0) {
        ++field4199;
        if (arg0 != 15795) {
            this.field4193 = false;
        }
        return this.field4203;
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(Lha;II)Lka;")
    private final class282 method1932(class543 arg0, int arg1, int arg2) {
        ++field4195;
        if (this.field4209 != null && arg0.method300(this.field4209.method528(), arg1) == 0) {
            return this.field4209;
        } else {
            if (arg2 > -47) {
                this.method611(62);
            }
            class495 var4 = this.method1931(1, false, arg0, arg1);
            return var4 == null ? null : var4.field7119;
        }
    }

    @OriginalMember(owner = "client!haa", name = "g", descriptor = "(B)Z")
    public final boolean method614(byte arg0) {
        ++field4216;
        int var2 = 97 % ((-38 - arg0) / 63);
        return this.field4209 == null ? false : this.field4209.method497();
    }

    @OriginalMember(owner = "client!haa", name = "<init>", descriptor = "(Lha;Lrq;IIIIIZIIZ)V")
    public class311(class543 arg0, class482 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, boolean arg10) {
        super(arg4, arg5, arg6, arg2, arg3, class378.method2342(arg9, arg8, (byte) 92));
        this.field4219 = (byte) arg9;
        this.field4205 = arg10;
        this.field4204 = (byte) arg8;
        super.field3923 = arg4;
        this.field4208 = arg1.field6903 != 0 && !arg7;
        this.field4193 = arg7;
        super.field3916 = arg6;
        this.field4221 = (short) arg1.field6965;
        this.field4203 = arg0.method365() && arg1.field6892 && !this.field4193 && class243.field3580.field8007.method435(false) != 0;
        int var12 = 2048;
        if (this.field4205) {
            var12 |= 65536;
        }
        class495 var13 = this.method1931(1, this.field4203, arg0, var12);
        if (var13 != null) {
            this.field4209 = var13.field7119;
            this.field4190 = var13.field7117;
            if (this.field4205) {
                this.field4209 = this.field4209.method509((byte) 0, var12, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(Lha;I)V")
    public final void method608(class543 arg0, int arg1) {
        ++field4192;
        Object var3 = null;
        class704 var5;
        if (this.field4190 == null && this.field4203) {
            class495 var4 = this.method1931(1, true, arg0, 262144);
            var5 = var4 != null ? var4.field7117 : null;
        } else {
            var5 = this.field4190;
            this.field4190 = null;
        }
        if (var5 != null) {
            class667.method3808(var5, super.field3924, super.field3923, super.field3916, (boolean[]) null);
        }
        int var6 = -55 / ((arg1 - 68) / 32);
    }

    @OriginalMember(owner = "client!haa", name = "e", descriptor = "(I)V")
    public final void method713(int arg0) {
        this.field4205 = false;
        ++field4215;
        if (arg0 != -16221) {
            this.method595(-16);
        }
        if (this.field4209 != null) {
            this.field4209.method487(-65537 & this.field4209.method528());
        }
    }

    @OriginalMember(owner = "client!haa", name = "c", descriptor = "(BLha;)Lro;")
    public final class522 method602(byte arg0, class543 arg1) {
        if (arg0 > -114) {
            return null;
        } else {
            if (this.field4211 == null) {
                this.field4211 = class222.method1551(this.method1932(arg1, 0, -64), super.field3923, super.field3922, super.field3916, 34);
            }
            ++field4196;
            return this.field4211;
        }
    }

    @OriginalMember(owner = "client!haa", name = "b", descriptor = "(BLha;)V")
    public final void method610(byte arg0, class543 arg1) {
        ++field4189;
        if (arg0 < 51) {
            this.field4203 = true;
        }
    }
}
