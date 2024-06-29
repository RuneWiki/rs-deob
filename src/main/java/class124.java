import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sfa")
public class class124 extends class638 {

    @OriginalMember(owner = "client!sfa", name = "L", descriptor = "I")
    private int field1704 = -1;

    @OriginalMember(owner = "client!sfa", name = "J", descriptor = "I")
    private int field1702 = 0;

    @OriginalMember(owner = "client!sfa", name = "fb", descriptor = "Z")
    private boolean field1723 = true;

    @OriginalMember(owner = "client!sfa", name = "N", descriptor = "Z")
    public boolean field1705 = false;

    @OriginalMember(owner = "client!sfa", name = "W", descriptor = "I")
    private int field1714 = 0;

    @OriginalMember(owner = "client!sfa", name = "gb", descriptor = "I")
    private int field1724 = 0;

    @OriginalMember(owner = "client!sfa", name = "hb", descriptor = "I")
    private int field1725 = 0;

    @OriginalMember(owner = "client!sfa", name = "H", descriptor = "I")
    private int field1700 = 0;

    @OriginalMember(owner = "client!sfa", name = "P", descriptor = "I")
    public int field1707;

    @OriginalMember(owner = "client!sfa", name = "eb", descriptor = "I")
    private int field1722;

    @OriginalMember(owner = "client!sfa", name = "ib", descriptor = "Lvo;")
    private class131 field1726;

    @OriginalMember(owner = "client!sfa", name = "I", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!sfa", name = "K", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!sfa", name = "O", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!sfa", name = "R", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!sfa", name = "S", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!sfa", name = "T", descriptor = "I")
    public static int field1711;

    @OriginalMember(owner = "client!sfa", name = "U", descriptor = "I")
    public static int field1712;

    @OriginalMember(owner = "client!sfa", name = "V", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!sfa", name = "X", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!sfa", name = "Y", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!sfa", name = "Z", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!sfa", name = "ab", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!sfa", name = "bb", descriptor = "I")
    public static int field1719;

    @OriginalMember(owner = "client!sfa", name = "cb", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!sfa", name = "db", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!sfa", name = "jb", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!sfa", name = "kb", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!sfa", name = "Q", descriptor = "Lta;")
    private class27 field1708;

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(I)V", line = 3)
    public final void method872(int arg0) {
        if (this.field1708 != null) {
            this.field1708.method124();
        }
        if (arg0 >= 13) {
            ++field1718;
        }
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(IIILha;)Z", line = 17)
    public final boolean method594(int arg0, int arg1, int arg2, class543 arg3) {
        if (arg2 != 1) {
            return false;
        } else {
            ++field1706;
            return false;
        }
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(ILjw;Lha;BIZI)V", line = 37)
    public final void method711(int arg0, class280 arg1, class543 arg2, byte arg3, int arg4, boolean arg5, int arg6) {
        if (arg3 < 28) {
            this.method874(112, 55, (class543) null, -84);
        }
        ++field1701;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sfa", name = "d", descriptor = "(I)Z", line = 48)
    public final boolean method715(int arg0) {
        if (arg0 != -12888) {
            this.field1714 = -29;
        }
        ++field1720;
        return false;
    }

    @OriginalMember(owner = "client!sfa", name = "<init>", descriptor = "(IIIIIIIIIIIII)V", line = 59)
    public class124(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        this.field1707 = arg1 + arg2;
        this.field1722 = arg0;
        this.field1702 = arg12;
        class365 var14 = class596.field8476.method2263(this.field1722, -107);
        int var15 = var14.field5332;
        if (~var15 == 0) {
            this.field1705 = true;
        } else {
            this.field1726 = class610.field8698.method2999(var15, false);
            this.field1705 = false;
        }
        if (~this.field1707 == ~arg2) {
            class701.method3941(this.field1700, this.field1726, (byte) 101, this);
        }
    }

    @OriginalMember(owner = "client!sfa", name = "c", descriptor = "(BLha;)Lro;", line = 89)
    public final class522 method602(byte arg0, class543 arg1) {
        if (arg0 >= -114) {
            this.method602((byte) 109, (class543) null);
        }
        ++field1716;
        return null;
    }

    @OriginalMember(owner = "client!sfa", name = "b", descriptor = "(BLha;)V", line = 111)
    public final void method610(byte arg0, class543 arg1) {
        ++field1728;
        if (arg0 < 51) {
            this.method875(-25, (class282) null, (class121) null, (class543) null);
        }
        class282 var3 = this.method874(this.field1722, 4686, arg1, 0);
        if (var3 != null) {
            class121 var4 = arg1.method342();
            var4.method845(super.field3923, super.field3922, super.field3916);
            this.method875(0, var3, var4, arg1);
        }
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(II)V", line = 134)
    public final void method873(int arg0, int arg1) {
        if (arg1 != -1) {
            this.method874(43, 99, (class543) null, -45);
        }
        ++field1711;
        if (!this.field1705) {
            this.field1714 += arg0;
            while (~this.field1714 < ~this.field1726.field1812[this.field1700]) {
                this.field1714 -= this.field1726.field1812[this.field1700];
                ++this.field1700;
                if (~this.field1700 <= ~this.field1726.field1792.length) {
                    this.field1705 = true;
                    break;
                }
            }
            if (!this.field1705) {
                class701.method3941(this.field1700, this.field1726, (byte) 101, this);
            }
        }
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(BLha;)Lqs;", line = 165)
    public final class603 method613(byte arg0, class543 arg1) {
        ++field1719;
        class282 var3 = this.method874(this.field1722, 4686, arg1, (this.field1702 == 0 ? 0 : 5) | 2048);
        if (arg0 < 76) {
            this.method875(27, (class282) null, (class121) null, (class543) null);
        }
        if (var3 == null) {
            return null;
        } else {
            if (this.field1702 != 0) {
                var3.method541(this.field1702 * 2048);
            }
            class121 var4 = arg1.method342();
            var4.method845(super.field3923, super.field3922, super.field3916);
            this.method875(0, var3, var4, arg1);
            class603 var5 = class6.method26(false, -86, 1);
            if (!class100.field1447) {
                var3.method533(var4, var5.field8543[0], 0);
            } else {
                var3.method503(var4, var5.field8543[0], class680.field9660, 0);
            }
            if (this.field1708 != null) {
                class458 var6 = this.field1708.method127();
                if (class100.field1447) {
                    arg1.method216(var6, class680.field9660);
                } else {
                    arg1.method214(var6);
                }
            }
            this.field1723 = var3.method497();
            this.field1724 = var3.method511();
            this.field1725 = var3.method507();
            return var5;
        }
    }

    @OriginalMember(owner = "client!sfa", name = "g", descriptor = "(I)I", line = 216)
    public final int method595(int arg0) {
        if (arg0 != 32767) {
            this.field1714 = 56;
        }
        ++field1709;
        return this.field1724;
    }

    @OriginalMember(owner = "client!sfa", name = "d", descriptor = "(B)I", line = 228)
    public final int method599(byte arg0) {
        ++field1721;
        return arg0 >= -4 ? 108 : this.field1725;
    }

    @OriginalMember(owner = "client!sfa", name = "e", descriptor = "(I)V", line = 239)
    public final void method713(int arg0) {
        ++field1715;
        if (arg0 == -16221) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(IILha;I)Lka;", line = 254)
    private final class282 method874(int arg0, int arg1, class543 arg2, int arg3) {
        ++field1712;
        class365 var5 = class596.field8476.method2263(arg0, arg1 ^ -4666);
        if (arg1 != 4686) {
            this.method613((byte) 5, (class543) null);
        }
        class339 var6 = class491.field7079[super.field3920];
        class339 var7 = ~super.field3924 <= -4 ? null : class491.field7079[super.field3924 + 1];
        return !this.field1705 ? var5.method2296(class610.field8698, this.field1704, super.field3916, arg2, (byte) -76, true, super.field3922, var6, super.field3923, arg3, var7, this.field1714, this.field1700) : var5.method2296(class610.field8698, -1, super.field3916, arg2, (byte) -121, true, super.field3922, var6, super.field3923, arg3, var7, 0, -1);
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(ILka;Lsk;Lha;)V", line = 278)
    private final void method875(int arg0, class282 arg1, class121 arg2, class543 arg3) {
        ++field1713;
        arg1.method491(arg2);
        class108[] var5 = arg1.method517();
        if (arg0 != 0) {
            this.field1723 = false;
        }
        class647[] var6 = arg1.method502();
        if ((this.field1708 == null || this.field1708.field244) && (var5 != null || var6 != null)) {
            this.field1708 = class27.method128(class703.field9918, true);
        }
        if (this.field1708 != null) {
            this.field1708.method126(arg3, (long) class703.field9918, var5, var6, false);
            this.field1708.method130(super.field3920, super.field9038, super.field9036, super.field9035, super.field9042);
        }
    }

    @OriginalMember(owner = "client!sfa", name = "g", descriptor = "(B)Z", line = 303)
    public final boolean method614(byte arg0) {
        int var2 = 3 / ((-38 - arg0) / 63);
        ++field1710;
        return this.field1723;
    }

    @OriginalMember(owner = "client!sfa", name = "finalize", descriptor = "()V", line = 319)
    protected final void finalize() {
        ++field1727;
        if (this.field1708 != null) {
            this.field1708.method124();
        }
    }

    @OriginalMember(owner = "client!sfa", name = "e", descriptor = "(B)Z", line = 331)
    public final boolean method607(byte arg0) {
        int var2 = -118 % ((27 - arg0) / 62);
        ++field1717;
        return false;
    }
}
