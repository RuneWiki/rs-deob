import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class121 extends class153 implements class196 {

    @OriginalMember(owner = "client!cr", name = "u", descriptor = "B")
    private byte field1723;

    @OriginalMember(owner = "client!cr", name = "M", descriptor = "Z")
    private boolean field1739;

    @OriginalMember(owner = "client!cr", name = "N", descriptor = "B")
    private byte field1740;

    @OriginalMember(owner = "client!cr", name = "H", descriptor = "Z")
    private boolean field1735;

    @OriginalMember(owner = "client!cr", name = "P", descriptor = "Z")
    private boolean field1742;

    @OriginalMember(owner = "client!cr", name = "L", descriptor = "B")
    private byte field1738;

    @OriginalMember(owner = "client!cr", name = "V", descriptor = "S")
    private short field1747;

    @OriginalMember(owner = "client!cr", name = "K", descriptor = "Z")
    private boolean field1737;

    @OriginalMember(owner = "client!cr", name = "I", descriptor = "Lj;")
    private class229 field1736;

    @OriginalMember(owner = "client!cr", name = "T", descriptor = "Lc;")
    public class201 field1745;

    @OriginalMember(owner = "client!cr", name = "y", descriptor = "I")
    public static int field1727 = 2;

    @OriginalMember(owner = "client!cr", name = "t", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!cr", name = "v", descriptor = "I")
    public static int field1724;

    @OriginalMember(owner = "client!cr", name = "w", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!cr", name = "x", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!cr", name = "z", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!cr", name = "A", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!cr", name = "B", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!cr", name = "C", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "client!cr", name = "D", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!cr", name = "F", descriptor = "I")
    public static int field1733;

    @OriginalMember(owner = "client!cr", name = "G", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!cr", name = "O", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!cr", name = "R", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!cr", name = "S", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!cr", name = "U", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!cr", name = "W", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!cr", name = "X", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!cr", name = "Y", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIILqa;)Z", line = 10)
    public final boolean method56(int arg0, int arg1, int arg2, class496 arg3) {
        ++field1732;
        if (arg1 != 3) {
            this.method55((byte) -64, (class496) null);
        }
        class201 var5 = this.method777(131072, 0, arg3);
        if (var5 != null) {
            class23 var6 = arg3.method1088();
            var6.method185(super.field2217, super.field2222, super.field2215);
            return var5.method310(arg0, arg2, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(ILqa;B)Lc;", line = 32)
    public final class201 method53(int arg0, class496 arg1, byte arg2) {
        int var4 = -76 / ((-62 - arg2) / 39);
        ++field1724;
        return this.method777(arg0, 0, arg1);
    }

    @OriginalMember(owner = "client!cr", name = "d", descriptor = "(I)Z", line = 46)
    public final boolean method49(int arg0) {
        if (arg0 != 7) {
            return false;
        } else {
            ++field1741;
            return this.field1739;
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IILqa;)Lc;", line = 57)
    private final class201 method777(int arg0, int arg1, class496 arg2) {
        if (arg1 != 0) {
            return null;
        } else {
            ++field1728;
            if (this.field1745 != null && arg2.method1141(this.field1745.method279(), arg0) == 0) {
                return this.field1745;
            } else {
                class454 var4 = this.method780(arg2, false, arg0, (byte) -123);
                return var4 != null ? var4.field6670 : null;
            }
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lqa;I)Lpj;", line = 79)
    public final class507 method51(class496 arg0, int arg1) {
        ++field1750;
        if (this.field1745 == null) {
            return null;
        } else if (arg1 != -150) {
            return null;
        } else {
            class23 var3 = arg0.method1088();
            var3.method185(super.field2217, super.field2222, super.field2215);
            class507 var4 = null;
            if (this.field1735) {
                var4 = class82.method527(1, 1761171873);
            }
            this.field1745.method318(var3, var4 == null ? null : var4.field7549[0], 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!cr", name = "h", descriptor = "(I)I", line = 113)
    public final int method778(int arg0) {
        ++field1749;
        if (arg0 != 4) {
            field1727 = -120;
        }
        return this.field1745 == null ? 15 : this.field1745.method311() / 4;
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "(BLqa;)V", line = 128)
    public final void method62(byte arg0, class496 arg1) {
        if (arg0 == -126) {
            ++field1729;
        }
    }

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "(B)V", line = 138)
    public final void method59(byte arg0) {
        int var2 = -52 / ((27 - arg0) / 63);
        if (this.field1745 != null) {
            this.field1745.method295();
        }
        ++field1734;
    }

    @OriginalMember(owner = "client!cr", name = "d", descriptor = "(B)I", line = 151)
    public final int method779(byte arg0) {
        if (arg0 != 9) {
            return -76;
        } else {
            ++field1744;
            return this.field1745 == null ? 0 : this.field1745.method306();
        }
    }

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(Lqa;Leu;IIIIIZIIIIIIZ)V", line = 162)
    public class121(class496 arg0, class130 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field1851 == 1, class119.method766(3508, arg13, arg12));
        this.field1723 = (byte) arg13;
        this.field1739 = arg14;
        this.field1740 = (byte) arg3;
        this.field1735 = arg1.field1886 != 0 && !arg7;
        this.field1742 = arg7;
        this.field1738 = (byte) arg12;
        this.field1747 = (short) arg1.field1826;
        this.field1737 = arg0.method1145() && arg1.field1884 && !this.field1742 && ~class96.field1399.method2170(class441.field6563, true) != -1;
        int var16 = 2048;
        if (this.field1739) {
            var16 |= 65536;
        }
        class454 var17 = this.method780(arg0, this.field1737, var16, (byte) -35);
        if (var17 != null) {
            this.field1736 = var17.field6667;
            this.field1745 = var17.field6670;
            if (this.field1739) {
                this.field1745 = this.field1745.method292((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)I", line = 193)
    public final int method50(int arg0) {
        ++field1733;
        return arg0 != 25707 ? 35 : this.field1747 & 65535;
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "(I)I", line = 205)
    public final int method66(int arg0) {
        ++field1722;
        if (arg0 != -7234) {
            this.method780((class496) null, true, -111, (byte) 84);
        }
        return this.field1723;
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "(B)Z", line = 217)
    public final boolean method60(byte arg0) {
        ++field1746;
        if (arg0 >= -108) {
            this.field1737 = false;
        }
        return this.field1737;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lqa;ZIB)Lfo;", line = 230)
    private final class454 method780(class496 arg0, boolean arg1, int arg2, byte arg3) {
        ++field1725;
        class130 var5 = class56.field755.method2031(110, this.field1747 & 65535);
        int var6 = -9 % ((arg3 - 92) / 34);
        class206 var7;
        class206 var8;
        if (!this.field1742) {
            var7 = class204.field2871[this.field1740];
            if (this.field1740 >= 3) {
                var8 = null;
            } else {
                var8 = class204.field2871[this.field1740 + 1];
            }
        } else {
            var7 = class187.field2632[this.field1740];
            var8 = class204.field2871[0];
        }
        return var5.method831(3, arg2, this.field1738 == 11 ? 10 : this.field1738, super.field2217, super.field2215, ~this.field1738 != -12 ? this.field1723 : 4 - -this.field1723, var7, var8, arg1, arg0, super.field2222);
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lqv;BLqa;IZII)V", line = 262)
    public final void method61(class49 arg0, byte arg1, class496 arg2, int arg3, boolean arg4, int arg5, int arg6) {
        ++field1730;
        if (arg0 instanceof class6) {
            class6 var8 = (class6) arg0;
            if (this.field1745 != null && var8.field88 != null) {
                this.field1745.method298(var8.field88, arg5, arg6, arg3, arg4);
            }
        } else if (arg0 instanceof class121) {
            class121 var9 = (class121) arg0;
            if (this.field1745 != null && var9.field1745 != null) {
                this.field1745.method298(var9.field1745, arg5, arg6, arg3, arg4);
            }
        }
        if (arg1 != 118) {
            this.field1736 = null;
        }
    }

    @OriginalMember(owner = "client!cr", name = "e", descriptor = "(I)V", line = 291)
    public final void method57(int arg0) {
        if (arg0 != -5077) {
            this.method61((class49) null, (byte) 104, (class496) null, -4, false, -38, -106);
        }
        this.field1739 = false;
        ++field1731;
        if (this.field1745 != null) {
            this.field1745.method297(this.field1745.method279() & -65537);
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(B)I", line = 306)
    public final int method63(byte arg0) {
        if (arg0 != 63) {
            this.method779((byte) 119);
        }
        ++field1726;
        return this.field1738;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(ILqa;)V", line = 317)
    public final void method67(int arg0, class496 arg1) {
        ++field1743;
        Object var3 = null;
        class229 var5;
        if (this.field1736 == null && this.field1737) {
            class454 var4 = this.method780(arg1, true, 262144, (byte) -126);
            var5 = var4 != null ? var4.field6667 : null;
        } else {
            var5 = this.field1736;
            this.field1736 = null;
        }
        int var6 = -93 % ((arg0 - 59) / 60);
        if (var5 != null) {
            class220.method1489(var5, this.field1740, super.field2217, super.field2215, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(BLqa;)V", line = 344)
    public final void method55(byte arg0, class496 arg1) {
        ++field1748;
        if (arg0 > -31) {
            field1727 = 12;
        }
        Object var3 = null;
        class229 var5;
        if (this.field1736 == null && this.field1737) {
            class454 var4 = this.method780(arg1, true, 262144, (byte) 127);
            var5 = var4 != null ? var4.field6667 : null;
        } else {
            var5 = this.field1736;
            this.field1736 = null;
        }
        if (var5 != null) {
            class457.method2753(var5, this.field1740, super.field2217, super.field2215, (boolean[]) null);
        }
    }
}
