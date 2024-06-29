import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class138 extends class719 implements class722 {

    @OriginalMember(owner = "client!vr", name = "ob", descriptor = "B")
    private byte field1776;

    @OriginalMember(owner = "client!vr", name = "Z", descriptor = "Z")
    private boolean field1761;

    @OriginalMember(owner = "client!vr", name = "I", descriptor = "B")
    private byte field1748;

    @OriginalMember(owner = "client!vr", name = "T", descriptor = "S")
    private short field1755;

    @OriginalMember(owner = "client!vr", name = "P", descriptor = "Z")
    private boolean field1751;

    @OriginalMember(owner = "client!vr", name = "nb", descriptor = "Z")
    private boolean field1775;

    @OriginalMember(owner = "client!vr", name = "R", descriptor = "Z")
    private boolean field1753;

    @OriginalMember(owner = "client!vr", name = "jb", descriptor = "Lka;")
    public class472 field1771;

    @OriginalMember(owner = "client!vr", name = "kb", descriptor = "Lr;")
    private class184 field1772;

    @OriginalMember(owner = "client!vr", name = "N", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!vr", name = "O", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!vr", name = "Q", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!vr", name = "U", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!vr", name = "V", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!vr", name = "W", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!vr", name = "X", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!vr", name = "Y", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!vr", name = "ab", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!vr", name = "bb", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!vr", name = "cb", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!vr", name = "db", descriptor = "I")
    public static int field1765;

    @OriginalMember(owner = "client!vr", name = "eb", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!vr", name = "fb", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!vr", name = "gb", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!vr", name = "hb", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!vr", name = "ib", descriptor = "I")
    public static int field1770;

    @OriginalMember(owner = "client!vr", name = "lb", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!vr", name = "mb", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!vr", name = "pb", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!vr", name = "qb", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!vr", name = "rb", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!vr", name = "S", descriptor = "Loia;")
    private class90 field1754;

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(Lha;I)Lbd;")
    public final class62 method127(class60 arg0, int arg1) {
        ++field1764;
        if (this.field1771 == null) {
            return null;
        } else {
            class10 var3 = arg0.method410();
            var3.method33(super.field2170, super.field2178, super.field2165);
            class62 var4 = class413.method2384(1, (byte) -47, this.field1751);
            if (!class670.field9312) {
                this.field1771.method230(var3, var4.field678[0], 0);
            } else {
                this.field1771.method243(var3, var4.field678[0], class661.field9249, 0);
            }
            return arg1 >= -12 ? null : var4;
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(I)I")
    public final int method680(int arg0) {
        ++field1767;
        if (arg0 != 30472) {
            this.field1761 = false;
        }
        return this.field1755 & 65535;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(BLha;)Loia;")
    public final class90 method134(byte arg0, class60 arg1) {
        ++field1758;
        if (this.field1754 == null) {
            this.field1754 = class185.method1041(super.field2178, super.field2170, this.method854(0, (byte) 58, arg1), super.field2165, 4);
        }
        if (arg0 != -53) {
            this.method854(89, (byte) -78, (class60) null);
        }
        return this.field1754;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lha;IIZ)Lsfa;")
    private final class696 method853(class60 arg0, int arg1, int arg2, boolean arg3) {
        if (arg1 >= -20) {
            return null;
        } else {
            ++field1762;
            class685 var5 = class707.field9894.method4109(65535 & this.field1755, (byte) 119);
            class281 var6;
            class281 var7;
            if (!this.field1775) {
                if (~super.field2167 > -4) {
                    var6 = class86.field1182[super.field2167 - -1];
                } else {
                    var6 = null;
                }
                var7 = class86.field1182[super.field2167];
            } else {
                var7 = class143.field1850[super.field2167];
                var6 = class86.field1182[0];
            }
            return var5.method3874(super.field2165, false, var6, this.field1776, super.field2178, arg3, super.field2170, arg2, (class150) null, var7, arg0, this.field1748);
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILha;BI)Z")
    public final boolean method131(int arg0, class60 arg1, byte arg2, int arg3) {
        ++field1757;
        class472 var5 = this.method854(131072, (byte) 61, arg1);
        if (var5 != null) {
            class10 var6 = arg1.method410();
            var6.method33(super.field2170, super.field2178, super.field2165);
            return class670.field9312 ? var5.method196(arg0, arg3, var6, false, 0, class661.field9249) : var5.method206(arg0, arg3, var6, false, 0);
        } else {
            if (arg2 <= 59) {
                method855(43, -102);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!vr", name = "d", descriptor = "(I)Z")
    public final boolean method123(int arg0) {
        ++field1750;
        int var2 = 114 % ((arg0 - -76) / 47);
        if (this.field1771 == null) {
            return true;
        } else {
            return !this.field1771.method204();
        }
    }

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "(Z)I")
    public final int method128(boolean arg0) {
        if (arg0) {
            return 118;
        } else {
            ++field1765;
            return this.field1771 != null ? this.field1771.method212() : 0;
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lgg;BZILha;II)V")
    public final void method162(class176 arg0, byte arg1, boolean arg2, int arg3, class60 arg4, int arg5, int arg6) {
        int var8 = -86 % ((15 - arg1) / 55);
        ++field1759;
        if (!(arg0 instanceof class138)) {
            if (arg0 instanceof class265) {
                class265 var9 = (class265) arg0;
                if (this.field1771 != null && var9.field3503 != null) {
                    this.field1771.method232(var9.field3503, arg3, arg5, arg6, arg2);
                    return;
                }
            }
        } else {
            class138 var10 = (class138) arg0;
            if (this.field1771 == null || var10.field1771 == null) {
                return;
            }
            this.field1771.method232(var10.field1771, arg3, arg5, arg6, arg2);
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(B)V")
    public final void method681(byte arg0) {
        if (this.field1771 != null) {
            this.field1771.method240();
        }
        if (arg0 != -96) {
            this.method150((byte) -58);
        }
        ++field1768;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Z)Z")
    public final boolean method682(boolean arg0) {
        ++field1760;
        return !arg0 ? false : this.field1753;
    }

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(B)I")
    public final int method686(byte arg0) {
        if (arg0 != 20) {
            this.method680(-101);
        }
        ++field1756;
        return this.field1748;
    }

    @OriginalMember(owner = "client!vr", name = "d", descriptor = "(B)Z")
    public final boolean method157(byte arg0) {
        if (arg0 > -70) {
            method856(-106, 41, (float[]) null);
        }
        ++field1769;
        return this.field1761;
    }

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "(Lha;I)V")
    public final void method136(class60 arg0, int arg1) {
        int var3 = -10 / ((53 - arg1) / 46);
        ++field1752;
    }

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(I)I")
    public final int method685(int arg0) {
        ++field1773;
        if (arg0 != 4657) {
            this.field1761 = true;
        }
        return this.field1776;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IBLha;)Lka;")
    private final class472 method854(int arg0, byte arg1, class60 arg2) {
        ++field1766;
        if (this.field1771 != null && arg2.method396(this.field1771.method225(), arg0) == 0) {
            return this.field1771;
        } else {
            if (arg1 < 31) {
                this.field1754 = null;
            }
            class696 var4 = this.method853(arg2, -56, arg0, false);
            return var4 == null ? null : var4.field9718;
        }
    }

    @OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(Lha;Lvha;IIIIIZIIZ)V")
    public class138(class60 arg0, class685 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, boolean arg10) {
        super(arg4, arg5, arg6, arg2, arg3, class236.method1427(arg8, (byte) -72, arg9));
        this.field1776 = (byte) arg9;
        this.field1761 = arg10;
        this.field1748 = (byte) arg8;
        this.field1755 = (short) arg1.field9541;
        this.field1751 = arg1.field9610 != 0 && !arg7;
        this.field1775 = arg7;
        super.field2170 = arg4;
        super.field2165 = arg6;
        this.field1753 = arg0.method381() && arg1.field9540 && !this.field1775 && class11.field68.field5545.method61((byte) 124) != 0;
        int var12 = 2048;
        if (this.field1761) {
            var12 |= 65536;
        }
        class696 var13 = this.method853(arg0, -99, var12, this.field1753);
        if (var13 != null) {
            this.field1771 = var13.field9718;
            this.field1772 = var13.field9720;
            if (this.field1761) {
                this.field1771 = this.field1771.method241((byte) 0, var12, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lha;I)V")
    public final void method679(class60 arg0, int arg1) {
        ++field1777;
        Object var3 = null;
        if (arg1 != 24447) {
            this.field1755 = -43;
        }
        class184 var5;
        if (this.field1772 == null && this.field1753) {
            class696 var4 = this.method853(arg0, -49, 262144, true);
            var5 = var4 == null ? null : var4.field9720;
        } else {
            var5 = this.field1772;
            this.field1772 = null;
        }
        if (var5 != null) {
            class432.method2467(var5, super.field2167, super.field2170, super.field2165, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!vr", name = "f", descriptor = "(B)V")
    public final void method150(byte arg0) {
        ++field1763;
        this.field1761 = false;
        if (this.field1771 != null) {
            this.field1771.method202(-65537 & this.field1771.method225());
        }
        if (arg0 != -73) {
            this.method127((class60) null, -1);
        }
    }

    @OriginalMember(owner = "client!vr", name = "h", descriptor = "(I)I")
    public final int method132(int arg0) {
        if (arg0 != 0) {
            return 127;
        } else {
            ++field1749;
            return this.field1771 == null ? 0 : this.field1771.method234();
        }
    }

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "(II)Lafa;")
    public static final class348 method855(int arg0, int arg1) {
        ++field1778;
        if (arg1 <= 101) {
            method855(26, -94);
        }
        class348[] var2 = class547.method3099((byte) -63);
        for (int var3 = 0; var2.length > var3; ++var3) {
            class348 var4 = var2[var3];
            if (~var4.field4623 == ~arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(II[F)[F")
    public static final float[] method856(int arg0, int arg1, float[] arg2) {
        ++field1774;
        float[] var3 = new float[arg1];
        class373.method2197(arg2, 0, var3, 0, arg1);
        return arg0 != -65537 ? null : var3;
    }

    @OriginalMember(owner = "client!vr", name = "g", descriptor = "(I)Z")
    public final boolean method126(int arg0) {
        if (arg0 != 6540) {
            return true;
        } else {
            ++field1770;
            return this.field1771 != null ? this.field1771.method219() : false;
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILha;)V")
    public final void method678(int arg0, class60 arg1) {
        ++field1779;
        if (arg0 == -25163) {
            Object var3 = null;
            class184 var5;
            if (this.field1772 == null && this.field1753) {
                class696 var4 = this.method853(arg1, arg0 + 25108, 262144, true);
                var5 = var4 != null ? var4.field9720 : null;
            } else {
                var5 = this.field1772;
                this.field1772 = null;
            }
            if (var5 != null) {
                class65.method500(var5, super.field2167, super.field2170, super.field2165, (boolean[]) null);
            }
        }
    }
}
