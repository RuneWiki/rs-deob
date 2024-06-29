import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jga")
public class class129 extends class441 implements class722 {

    @OriginalMember(owner = "client!jga", name = "Y", descriptor = "Z")
    private boolean field1790 = false;

    @OriginalMember(owner = "client!jga", name = "J", descriptor = "Ldj;")
    public class708 field1775;

    @OriginalMember(owner = "client!jga", name = "jb", descriptor = "Z")
    private boolean field1801;

    @OriginalMember(owner = "client!jga", name = "V", descriptor = "Lkr;")
    public static class602 field1787 = new class602(39, 6);

    @OriginalMember(owner = "client!jga", name = "lb", descriptor = "I")
    public static int field1803 = -1;

    @OriginalMember(owner = "client!jga", name = "nb", descriptor = "[I")
    public static int[] field1805 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!jga", name = "L", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!jga", name = "M", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!jga", name = "N", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!jga", name = "O", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!jga", name = "P", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!jga", name = "Q", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!jga", name = "R", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!jga", name = "S", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!jga", name = "T", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!jga", name = "U", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!jga", name = "X", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!jga", name = "Z", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!jga", name = "ab", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!jga", name = "bb", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!jga", name = "cb", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!jga", name = "db", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!jga", name = "eb", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!jga", name = "fb", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!jga", name = "gb", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!jga", name = "hb", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!jga", name = "ib", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!jga", name = "kb", descriptor = "Lha;")
    public static class548 field1802;

    @OriginalMember(owner = "client!jga", name = "W", descriptor = "Liha;")
    private class613 field1788;

    @OriginalMember(owner = "client!jga", name = "K", descriptor = "Lgu;")
    public static class729 field1776;

    @OriginalMember(owner = "client!jga", name = "mb", descriptor = "[Lfd;")
    public static class298[] field1804;

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(ZLha;)V", line = 4)
    public final void method659(boolean arg0, class548 arg1) {
        ++field1795;
        class284 var3 = this.field1775.method3988(true, true, -125, arg1, 262144);
        if (arg0) {
            this.method642((byte) -36);
        }
        if (var3 != null) {
            int var4 = super.field4410 >> 9;
            int var5 = super.field4418 >> 9;
            class744 var6 = arg1.method1404();
            var6.method905(super.field4410, super.field4413, super.field4418);
            this.field1775.method3980(var6, var5, var4, var3, var5, arg1, false, var4, -20837);
        }
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(BLha;ZILuq;II)V", line = 30)
    public final void method648(byte arg0, class548 arg1, boolean arg2, int arg3, class318 arg4, int arg5, int arg6) {
        if (arg0 <= -8) {
            ++field1797;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(ILha;IB)Z", line = 41)
    public final boolean method644(int arg0, class548 arg1, int arg2, byte arg3) {
        ++field1796;
        if (arg3 >= -58) {
            this.field1801 = true;
        }
        class284 var5 = this.field1775.method3988(false, false, -118, arg1, 131072);
        if (var5 == null) {
            return false;
        } else {
            class744 var6 = arg1.method1404();
            var6.method905(super.field4410, super.field4413, super.field4418);
            return !class301.field4261 ? var5.method1669(arg0, arg2, var6, false, 0) : var5.method1653(arg0, arg2, var6, false, 0, class3.field30);
        }
    }

    @OriginalMember(owner = "client!jga", name = "c", descriptor = "(B)I", line = 60)
    public final int method793(byte arg0) {
        ++field1780;
        return arg0 != -86 ? 76 : this.field1775.method3979(10);
    }

    @OriginalMember(owner = "client!jga", name = "b", descriptor = "(Lha;B)Liha;", line = 76)
    public final class613 method653(class548 arg0, byte arg1) {
        if (arg1 != 13) {
            method811(114);
        }
        ++field1794;
        return this.field1788;
    }

    @OriginalMember(owner = "client!jga", name = "c", descriptor = "(I)V", line = 88)
    public final void method795(int arg0) {
        ++field1791;
        if (arg0 <= 31) {
            this.method653((class548) null, (byte) 1);
        }
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(B)I", line = 98)
    public final int method782(byte arg0) {
        int var2 = -112 % ((arg0 - -5) / 54);
        ++field1793;
        return this.field1775.field9863;
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(Z[BI)I", line = 110)
    public static final int method807(boolean arg0, byte[] arg1, int arg2) {
        ++field1784;
        if (!arg0) {
            method811(-117);
        }
        return class268.method1822(arg2, 0, arg1, 0);
    }

    @OriginalMember(owner = "client!jga", name = "n", descriptor = "(I)I", line = 122)
    public final int method790(int arg0) {
        ++field1786;
        if (arg0 != -11692) {
            field1787 = null;
        }
        return this.field1775.method3983(arg0 ^ 11671);
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(Lha;B)V", line = 133)
    public final void method792(class548 arg0, byte arg1) {
        if (arg1 > -105) {
            field1787 = null;
        }
        this.field1775.method3985(-5923, arg0);
        ++field1785;
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(BLkea;)V", line = 146)
    public final void method808(byte arg0, class77 arg1) {
        ++field1779;
        if (arg0 == 34) {
            this.field1775.method3989(-31939, arg1);
        }
    }

    @OriginalMember(owner = "client!jga", name = "h", descriptor = "(I)Z", line = 157)
    public final boolean method783(int arg0) {
        ++field1792;
        return arg0 != 0 ? false : false;
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(II)Z", line = 171)
    public static final boolean method809(int arg0, int arg1) {
        ++field1782;
        if (arg0 != -8) {
            field1805 = null;
        }
        return ~arg1 == -8 || arg1 == 9;
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(Lha;I)Lua;", line = 183)
    public final class3 method660(class548 arg0, int arg1) {
        ++field1800;
        class284 var3 = this.field1775.method3988(true, false, -99, arg0, 2048);
        if (arg1 != -1) {
            this.field1775 = null;
        }
        if (var3 == null) {
            return null;
        } else {
            class744 var4 = arg0.method1404();
            var4.method905(super.field4410, super.field4413, super.field4418);
            class3 var5 = class682.method3841(1, this.field1801, 28389);
            int var6 = super.field4410 >> 9;
            int var7 = super.field4418 >> 9;
            this.field1775.method3980(var4, var7, var6, var3, var7, arg0, true, var6, -20837);
            if (!class301.field4261) {
                var3.method1686(var4, var5.field18[0], 0);
            } else {
                var3.method1682(var4, var5.field18[0], class3.field30, 0);
            }
            if (this.field1775.field9885 != null) {
                class100 var8 = this.field1775.field9885.method3895();
                if (class301.field4261) {
                    arg0.method1479(var8, class3.field30);
                } else {
                    arg0.method1413(var8);
                }
            }
            this.field1790 = var3.method1673() || this.field1775.field9885 != null;
            if (this.field1788 == null) {
                this.field1788 = class491.method2980(super.field4418, -15, super.field4413, var3, super.field4410);
            } else {
                class507.method3047(super.field4410, super.field4418, -114, var3, super.field4413, this.field1788);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!jga", name = "l", descriptor = "(I)Z", line = 237)
    public final boolean method785(int arg0) {
        if (arg0 >= -117) {
            return false;
        } else {
            ++field1798;
            return this.field1790;
        }
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(I)I", line = 249)
    public final int method784(int arg0) {
        ++field1783;
        if (arg0 != -4532) {
            this.method641(119);
        }
        return this.field1775.field9879;
    }

    @OriginalMember(owner = "client!jga", name = "<init>", descriptor = "(Lha;Lts;IIIIIZII)V", line = 260)
    public class129(class548 arg0, class220 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg2, arg3, arg1.field2894);
        this.field1775 = new class708(arg0, arg1, 22, arg8, arg2, arg3, this, arg7, arg9);
        this.field1801 = ~arg1.field2948 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(IIIII)V", line = 269)
    public static final void method810(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class644.field8632 != null) {
            class644.field8632[arg0][arg1] = -16777216 | arg2;
        }
        if (class680.field9452 != null) {
            class680.field9452[arg0][arg1] = (short) arg3;
        }
        if (class151.field2085 != null) {
            class151.field2085[arg0][arg1] = (byte) arg4;
        }
    }

    @OriginalMember(owner = "client!jga", name = "m", descriptor = "(I)V", line = 281)
    public final void method641(int arg0) {
        ++field1789;
        if (arg0 <= 91) {
            this.field1790 = true;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jga", name = "b", descriptor = "(I)I", line = 294)
    public final int method794(int arg0) {
        if (arg0 <= 92) {
            this.field1775 = null;
        }
        ++field1778;
        return this.field1775.field9889;
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(Lha;Z)V", line = 311)
    public final void method786(class548 arg0, boolean arg1) {
        ++field1777;
        if (!arg1) {
            this.method642((byte) 62);
        }
        this.field1775.method3978(arg0, -384);
    }

    @OriginalMember(owner = "client!jga", name = "d", descriptor = "(I)Z", line = 322)
    public final boolean method781(int arg0) {
        ++field1799;
        if (arg0 >= -86) {
            this.method785(-77);
        }
        return this.field1775.method3977((byte) -121);
    }

    @OriginalMember(owner = "client!jga", name = "b", descriptor = "(B)Z", line = 337)
    public final boolean method642(byte arg0) {
        ++field1781;
        return arg0 != 2;
    }

    @OriginalMember(owner = "client!jga", name = "o", descriptor = "(I)V", line = 350)
    public static void method811(int arg0) {
        if (arg0 != -1) {
            method810(-84, 3, 91, 32, -128);
        }
        field1804 = null;
        field1805 = null;
        field1802 = null;
        field1787 = null;
        field1776 = null;
    }
}
