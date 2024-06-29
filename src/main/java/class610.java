import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class610 extends class638 implements class324 {

    @OriginalMember(owner = "client!eb", name = "gb", descriptor = "Z")
    private boolean field8720;

    @OriginalMember(owner = "client!eb", name = "nb", descriptor = "Z")
    private boolean field8727;

    @OriginalMember(owner = "client!eb", name = "kb", descriptor = "S")
    private short field8724;

    @OriginalMember(owner = "client!eb", name = "M", descriptor = "B")
    private byte field8701;

    @OriginalMember(owner = "client!eb", name = "I", descriptor = "Z")
    private boolean field8697;

    @OriginalMember(owner = "client!eb", name = "jb", descriptor = "B")
    private byte field8723;

    @OriginalMember(owner = "client!eb", name = "hb", descriptor = "Z")
    private boolean field8721;

    @OriginalMember(owner = "client!eb", name = "ab", descriptor = "Lka;")
    public class282 field8714;

    @OriginalMember(owner = "client!eb", name = "pb", descriptor = "Lr;")
    private class704 field8729;

    @OriginalMember(owner = "client!eb", name = "V", descriptor = "[I")
    public static int[] field8709 = new int[3];

    @OriginalMember(owner = "client!eb", name = "H", descriptor = "I")
    public static int field8696;

    @OriginalMember(owner = "client!eb", name = "K", descriptor = "I")
    public static int field8699;

    @OriginalMember(owner = "client!eb", name = "L", descriptor = "I")
    public static int field8700;

    @OriginalMember(owner = "client!eb", name = "N", descriptor = "I")
    public static int field8702;

    @OriginalMember(owner = "client!eb", name = "O", descriptor = "I")
    public static int field8703;

    @OriginalMember(owner = "client!eb", name = "P", descriptor = "I")
    public static int field8704;

    @OriginalMember(owner = "client!eb", name = "R", descriptor = "I")
    public static int field8706;

    @OriginalMember(owner = "client!eb", name = "T", descriptor = "I")
    public static int field8707;

    @OriginalMember(owner = "client!eb", name = "U", descriptor = "I")
    public static int field8708;

    @OriginalMember(owner = "client!eb", name = "W", descriptor = "I")
    public static int field8710;

    @OriginalMember(owner = "client!eb", name = "X", descriptor = "I")
    public static int field8711;

    @OriginalMember(owner = "client!eb", name = "Y", descriptor = "I")
    public static int field8712;

    @OriginalMember(owner = "client!eb", name = "Z", descriptor = "I")
    public static int field8713;

    @OriginalMember(owner = "client!eb", name = "bb", descriptor = "I")
    public static int field8715;

    @OriginalMember(owner = "client!eb", name = "cb", descriptor = "I")
    public static int field8716;

    @OriginalMember(owner = "client!eb", name = "db", descriptor = "I")
    public static int field8717;

    @OriginalMember(owner = "client!eb", name = "eb", descriptor = "I")
    public static int field8718;

    @OriginalMember(owner = "client!eb", name = "fb", descriptor = "I")
    public static int field8719;

    @OriginalMember(owner = "client!eb", name = "ib", descriptor = "I")
    public static int field8722;

    @OriginalMember(owner = "client!eb", name = "lb", descriptor = "I")
    public static int field8725;

    @OriginalMember(owner = "client!eb", name = "mb", descriptor = "I")
    public static int field8726;

    @OriginalMember(owner = "client!eb", name = "ob", descriptor = "I")
    public static int field8728;

    @OriginalMember(owner = "client!eb", name = "qb", descriptor = "I")
    public static int field8730;

    @OriginalMember(owner = "client!eb", name = "rb", descriptor = "I")
    public static int field8731;

    @OriginalMember(owner = "client!eb", name = "J", descriptor = "Lnc;")
    public static class493 field8698;

    @OriginalMember(owner = "client!eb", name = "Q", descriptor = "Lro;")
    private class522 field8705;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "(B)I")
    public final int method599(byte arg0) {
        if (arg0 >= -4) {
            field8707 = 35;
        }
        ++field8728;
        return this.field8714 == null ? 0 : this.field8714.method507();
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(BLha;)V")
    public final void method610(byte arg0, class543 arg1) {
        if (arg0 >= 51) {
            ++field8704;
        }
    }

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "(B)I")
    public final int method3548(byte arg0) {
        if (arg0 >= -29) {
            field8707 = -31;
        }
        ++field8702;
        return this.field8714 != null ? this.field8714.method514() / 4 : 15;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIZLha;)Lmg;")
    private final class495 method3549(int arg0, int arg1, boolean arg2, class543 arg3) {
        ++field8712;
        class482 var5 = class375.field5421.method2680(65535 & this.field8724, (byte) 97);
        if (arg1 != 65536) {
            this.method713(4);
        }
        class339 var6;
        class339 var7;
        if (!this.field8697) {
            var6 = class491.field7079[super.field3924];
            if (super.field3924 >= 3) {
                var7 = null;
            } else {
                var7 = class491.field7079[super.field3924 + 1];
            }
        } else {
            var7 = class491.field7079[0];
            var6 = class25.field221[super.field3924];
        }
        return var5.method2942(super.field3923, this.field8701 != 11 ? this.field8723 : this.field8723 + 4, arg2, super.field3916, this.field8701 == 11 ? 10 : this.field8701, arg0, arg3, super.field3922, (byte) 87, var6, var7);
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(B)V")
    public final void method598(byte arg0) {
        ++field8719;
        if (arg0 > -9) {
            this.field8721 = false;
        }
        if (this.field8714 != null) {
            this.field8714.method499();
        }
    }

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "(I)I")
    public final int method595(int arg0) {
        if (arg0 != 32767) {
            field8698 = null;
        }
        ++field8717;
        return this.field8714 == null ? 0 : this.field8714.method511();
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BLha;)Lqs;")
    public final class603 method613(byte arg0, class543 arg1) {
        ++field8722;
        if (this.field8714 == null) {
            return null;
        } else {
            if (arg0 < 76) {
                this.method602((byte) 83, (class543) null);
            }
            class121 var3 = arg1.method342();
            var3.method845(super.field3923, super.field3922, super.field3916);
            class603 var4 = class6.method26(this.field8720, 122, 1);
            if (class100.field1447) {
                this.field8714.method503(var3, var4.field8543[0], class680.field9660, 0);
            } else {
                this.field8714.method533(var3, var4.field8543[0], 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "(I)V")
    public final void method713(int arg0) {
        ++field8699;
        this.field8727 = false;
        if (arg0 == -16221) {
            if (this.field8714 != null) {
                this.field8714.method487(this.field8714.method528() & -65537);
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)Z")
    public final boolean method611(int arg0) {
        ++field8713;
        if (arg0 != 15795) {
            method3551(74);
        }
        return this.field8721;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILjw;Lha;BIZI)V")
    public final void method711(int arg0, class280 arg1, class543 arg2, byte arg3, int arg4, boolean arg5, int arg6) {
        ++field8726;
        if (!(arg1 instanceof class311)) {
            if (arg1 instanceof class610) {
                class610 var8 = (class610) arg1;
                if (this.field8714 != null && var8.field8714 != null) {
                    this.field8714.method512(var8.field8714, arg0, arg4, arg6, arg5);
                }
            }
        } else {
            class311 var9 = (class311) arg1;
            if (this.field8714 != null && var9.field4209 != null) {
                this.field8714.method512(var9.field4209, arg0, arg4, arg6, arg5);
            }
        }
        if (arg3 <= 28) {
            this.field8724 = -105;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BLbm;)Z")
    public static final boolean method3550(byte arg0, class463 arg1) {
        ++field8706;
        if (arg1 == null) {
            return false;
        } else if (!arg1.field6576) {
            return false;
        } else if (!arg1.method2811(class664.field9484, (byte) 92)) {
            return false;
        } else {
            if (arg0 > -23) {
                field8698 = null;
            }
            if (class718.field10130.method4020((long) arg1.field6600, (byte) -116) != null) {
                return false;
            } else {
                return class121.field1651.method4020((long) arg1.field6597, (byte) -110) == null;
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "(I)Z")
    public final boolean method715(int arg0) {
        if (arg0 != -12888) {
            this.method713(111);
        }
        ++field8696;
        return this.field8727;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIILha;)Z")
    public final boolean method594(int arg0, int arg1, int arg2, class543 arg3) {
        ++field8730;
        class282 var5 = this.method3552(false, arg3, 131072);
        if (arg2 != 1) {
            return false;
        } else if (var5 != null) {
            class121 var6 = arg3.method342();
            var6.method845(super.field3923, super.field3922, super.field3916);
            return !class100.field1447 ? var5.method496(arg1, arg0, var6, false, 0) : var5.method538(arg1, arg0, var6, false, 0, class680.field9660);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lha;Z)V")
    public final void method597(class543 arg0, boolean arg1) {
        ++field8700;
        if (arg1) {
            this.method594(84, 90, -38, (class543) null);
        }
        Object var3 = null;
        class704 var5;
        if (this.field8729 == null && this.field8721) {
            class495 var4 = this.method3549(262144, 65536, true, arg0);
            var5 = var4 == null ? null : var4.field7117;
        } else {
            var5 = this.field8729;
            this.field8729 = null;
        }
        if (var5 != null) {
            class659.method3762(var5, super.field3924, super.field3923, super.field3916, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "(B)Z")
    public final boolean method607(byte arg0) {
        ++field8715;
        if (this.field8714 != null) {
            return !this.field8714.method504();
        } else {
            int var2 = 105 / ((arg0 - 27) / 62);
            return true;
        }
    }

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "(I)V")
    public static void method3551(int arg0) {
        if (arg0 != 4) {
            method3551(115);
        }
        field8698 = null;
        field8709 = null;
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lha;Lrq;IIIIIZIIIIIIZ)V")
    public class610(class543 arg0, class482 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field6926 == 1, class301.method1887(arg13, 2, arg12));
        this.field8720 = ~arg1.field6903 != -1 && !arg7;
        this.field8727 = arg14;
        super.field3924 = (byte) arg3;
        this.field8724 = (short) arg1.field6965;
        this.field8701 = (byte) arg12;
        this.field8697 = arg7;
        this.field8723 = (byte) arg13;
        this.field8721 = arg0.method365() && arg1.field6892 && !this.field8697 && class243.field3580.field8007.method435(false) != 0;
        int var16 = 2048;
        if (this.field8727) {
            var16 |= 65536;
        }
        class495 var17 = this.method3549(var16, 65536, this.field8721, arg0);
        if (var17 != null) {
            this.field8714 = var17.field7119;
            this.field8729 = var17.field7117;
            if (this.field8727) {
                this.field8714 = this.field8714.method509((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lha;I)V")
    public final void method608(class543 arg0, int arg1) {
        ++field8703;
        Object var3 = null;
        class704 var5;
        if (this.field8729 == null && this.field8721) {
            class495 var4 = this.method3549(262144, 65536, true, arg0);
            var5 = var4 == null ? null : var4.field7117;
        } else {
            var5 = this.field8729;
            this.field8729 = null;
        }
        int var6 = -76 / ((68 - arg1) / 32);
        if (var5 != null) {
            class667.method3808(var5, super.field3924, super.field3923, super.field3916, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)I")
    public final int method601(byte arg0) {
        if (arg0 < 86) {
            return 54;
        } else {
            ++field8725;
            return this.field8724 & 65535;
        }
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)I")
    public final int method606(int arg0) {
        if (arg0 >= -32) {
            this.field8705 = null;
        }
        ++field8708;
        return this.field8723;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZLha;I)Lka;")
    private final class282 method3552(boolean arg0, class543 arg1, int arg2) {
        ++field8710;
        if (this.field8714 != null && ~arg1.method300(this.field8714.method528(), arg2) == -1) {
            return this.field8714;
        } else {
            class495 var4 = this.method3549(arg2, 65536, arg0, arg1);
            return var4 == null ? null : var4.field7119;
        }
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(B)I")
    public final int method604(byte arg0) {
        ++field8731;
        if (arg0 != 94) {
            this.method613((byte) 3, (class543) null);
        }
        return this.field8701;
    }

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "(B)Z")
    public final boolean method614(byte arg0) {
        int var2 = -71 % ((arg0 - -38) / 63);
        ++field8711;
        return this.field8714 != null ? this.field8714.method497() : false;
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(BLha;)Lro;")
    public final class522 method602(byte arg0, class543 arg1) {
        ++field8716;
        if (this.field8705 == null) {
            this.field8705 = class222.method1551(this.method3552(false, arg1, 0), super.field3923, super.field3922, super.field3916, 34);
        }
        if (arg0 >= -114) {
            this.method602((byte) -7, (class543) null);
        }
        return this.field8705;
    }
}
