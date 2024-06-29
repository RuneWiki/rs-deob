import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class156 extends class613 implements class49 {

    @OriginalMember(owner = "client!ci", name = "P", descriptor = "Z")
    private boolean field1715;

    @OriginalMember(owner = "client!ci", name = "gb", descriptor = "Z")
    private boolean field1732;

    @OriginalMember(owner = "client!ci", name = "lb", descriptor = "Z")
    private boolean field1737;

    @OriginalMember(owner = "client!ci", name = "V", descriptor = "B")
    private byte field1721;

    @OriginalMember(owner = "client!ci", name = "Z", descriptor = "S")
    private short field1725;

    @OriginalMember(owner = "client!ci", name = "pb", descriptor = "B")
    private byte field1741;

    @OriginalMember(owner = "client!ci", name = "ab", descriptor = "Z")
    private boolean field1726;

    @OriginalMember(owner = "client!ci", name = "N", descriptor = "Lha;")
    private class120 field1713;

    @OriginalMember(owner = "client!ci", name = "hb", descriptor = "Lda;")
    public class473 field1733;

    @OriginalMember(owner = "client!ci", name = "cb", descriptor = "Lcq;")
    public static class110 field1728 = new class110(87, 4);

    @OriginalMember(owner = "client!ci", name = "sb", descriptor = "Lgk;")
    public static class616 field1744 = new class616();

    @OriginalMember(owner = "client!ci", name = "vb", descriptor = "Z")
    public static boolean field1747 = false;

    @OriginalMember(owner = "client!ci", name = "xb", descriptor = "Lsb;")
    public static class305 field1749 = new class305(53, -1);

    @OriginalMember(owner = "client!ci", name = "yb", descriptor = "[I")
    public static int[] field1750 = new int[1];

    @OriginalMember(owner = "client!ci", name = "L", descriptor = "I")
    public static int field1711;

    @OriginalMember(owner = "client!ci", name = "M", descriptor = "I")
    public static int field1712;

    @OriginalMember(owner = "client!ci", name = "O", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!ci", name = "Q", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!ci", name = "R", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!ci", name = "S", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!ci", name = "T", descriptor = "I")
    public static int field1719;

    @OriginalMember(owner = "client!ci", name = "U", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!ci", name = "W", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!ci", name = "X", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!ci", name = "Y", descriptor = "I")
    public static int field1724;

    @OriginalMember(owner = "client!ci", name = "bb", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!ci", name = "eb", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!ci", name = "fb", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "client!ci", name = "ib", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!ci", name = "jb", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!ci", name = "kb", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!ci", name = "mb", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!ci", name = "nb", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!ci", name = "ob", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!ci", name = "qb", descriptor = "I")
    public static int field1742;

    @OriginalMember(owner = "client!ci", name = "tb", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!ci", name = "ub", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!ci", name = "wb", descriptor = "Lfh;")
    public static class268 field1748;

    @OriginalMember(owner = "client!ci", name = "db", descriptor = "Llf;")
    private class676 field1729;

    @OriginalMember(owner = "client!ci", name = "rb", descriptor = "[Li;")
    public static class274[] field1743;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "(Lr;I)Llf;")
    public final class676 method185(class564 arg0, int arg1) {
        if (arg1 <= 42) {
            return null;
        } else {
            ++field1711;
            if (this.field1729 == null) {
                this.field1729 = class191.method1166(0, super.field5176, this.method842(0, -27, arg0), super.field5178, super.field5179);
            }
            return this.field1729;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lr;Z)V")
    public final void method172(class564 arg0, boolean arg1) {
        ++field1735;
        if (arg1) {
            this.method182((class564) null, -70);
        }
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(B)Z")
    public final boolean method183(byte arg0) {
        ++field1724;
        int var2 = -62 % ((arg0 - 12) / 62);
        return this.field1737;
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(B)Z")
    public final boolean method236(byte arg0) {
        ++field1731;
        if (arg0 >= -33) {
            this.field1737 = false;
        }
        return this.field1726;
    }

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "(B)I")
    public final int method175(byte arg0) {
        ++field1742;
        if (arg0 <= 119) {
            this.method232((class564) null, -15);
        }
        return this.field1733 != null ? this.field1733.method1868() : 0;
    }

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "(B)V")
    public static void method840(byte arg0) {
        if (arg0 >= 80) {
            field1728 = null;
            field1748 = null;
            field1743 = null;
            field1750 = null;
            field1744 = null;
            field1749 = null;
        }
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(Z)I")
    public final int method841(boolean arg0) {
        if (arg0) {
            this.method232((class564) null, -14);
        }
        ++field1712;
        return this.field1733 != null ? this.field1733.method1886() / 4 : 15;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lr;III)Z")
    public final boolean method173(class564 arg0, int arg1, int arg2, int arg3) {
        ++field1745;
        class473 var5 = this.method842(131072, arg2 + -127, arg0);
        if (var5 != null) {
            class490 var6 = arg0.method950();
            var6.method23(super.field5179, super.field5178, super.field5176);
            return class460.field6553 ? var5.method1896(arg1, arg3, var6, false, class682.field9623) : var5.method1867(arg1, arg3, var6, false);
        } else {
            if (arg2 != 0) {
                this.method170(50);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IILr;)Lda;")
    private final class473 method842(int arg0, int arg1, class564 arg2) {
        ++field1734;
        int var4 = 6 % ((arg1 - 53) / 59);
        if (this.field1733 != null && arg2.method973(this.field1733.method1861(), arg0) == 0) {
            return this.field1733;
        } else {
            class65 var5 = this.method844(false, arg0, 11, arg2);
            return var5 != null ? var5.field665 : null;
        }
    }

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "(I)V")
    public final void method170(int arg0) {
        this.field1737 = false;
        if (arg0 <= 20) {
            field1749 = null;
        }
        ++field1718;
        if (this.field1733 != null) {
            this.field1733.method1907(this.field1733.method1861() & -65537);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Z)I")
    public final int method237(boolean arg0) {
        if (arg0) {
            method840((byte) 1);
        }
        ++field1722;
        return this.field1741;
    }

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "(I)I")
    public final int method179(int arg0) {
        ++field1740;
        if (arg0 != 3370) {
            field1747 = false;
        }
        return this.field1733 != null ? this.field1733.method1869() : 0;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
    public final void method234(int arg0) {
        if (arg0 >= -51) {
            this.method179(-4);
        }
        ++field1719;
        if (this.field1733 != null) {
            this.field1733.method1872();
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(BLr;)V")
    public static final void method843(byte arg0, class564 arg1) {
        if (arg0 == 60) {
            ++field1738;
            if (class141.field1554.method3429((byte) -88) != 0) {
                if (~class430.field6109 != -1) {
                    if (class271.field3377 == null) {
                        Canvas var2 = new Canvas();
                        var2.setSize(36, 32);
                        class271.field3377 = class564.method3199(0, 0, class79.field801, var2, 110, class560.field7998);
                        class446.field6295 = class271.field3377.method998(class306.method1764(class573.field8139, 0, class613.field8632, -77), class550.method3117(class408.field5441, class613.field8632, 0), true);
                    }
                    for (class362 var3 = (class362) class141.field1554.method3434((byte) 2); var3 != null; var3 = (class362) class141.field1554.method3430(true)) {
                        class19.field153.method275(var3.field4854, class271.field3377, var3.field4855, false, class446.field6295, var3.field4851, var3.field4850 ? class362.field4859.field2897 : null, false, (byte) 85, arg1, var3.field4848, var3.field4852);
                        var3.method1922(arg0 ^ 102);
                    }
                } else {
                    for (class362 var4 = (class362) class141.field1554.method3434((byte) 2); var4 != null; var4 = (class362) class141.field1554.method3430(true)) {
                        class19.field153.method275(var4.field4854, arg1, var4.field4855, false, class198.field2349, var4.field4851, var4.field4850 ? class362.field4859.field2897 : null, false, (byte) 85, arg1, var4.field4848, var4.field4852);
                        var4.method1922(104);
                    }
                    class64.method346(arg0 ^ 52);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(Lr;I)V")
    public final void method230(class564 arg0, int arg1) {
        ++field1727;
        Object var3 = null;
        class120 var5;
        if (this.field1713 == null && this.field1726) {
            class65 var4 = this.method844(true, 262144, arg1 ^ 21677, arg0);
            var5 = var4 != null ? var4.field664 : null;
        } else {
            var5 = this.field1713;
            this.field1713 = null;
        }
        if (arg1 != 21670) {
            field1749 = null;
        }
        if (var5 != null) {
            class254.method1500(var5, super.field5169, super.field5179, super.field5176, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "(I)Z")
    public final boolean method177(int arg0) {
        ++field1717;
        if (arg0 >= -103) {
            this.method842(-24, -36, (class564) null);
        }
        return this.field1733 != null ? this.field1733.method1913() : false;
    }

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "(I)Z")
    public final boolean method180(int arg0) {
        if (arg0 != -1) {
            this.method177(122);
        }
        ++field1720;
        return true;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)I")
    public final int method241(byte arg0) {
        if (arg0 != 29) {
            return 113;
        } else {
            ++field1716;
            return this.field1721;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lr;I)V")
    public final void method232(class564 arg0, int arg1) {
        ++field1723;
        Object var3 = null;
        class120 var5;
        if (this.field1713 == null && this.field1726) {
            class65 var4 = this.method844(true, 262144, 11, arg0);
            var5 = var4 != null ? var4.field664 : null;
        } else {
            var5 = this.field1713;
            this.field1713 = null;
        }
        if (arg1 == 6905) {
            if (var5 != null) {
                class249.method1467(var5, super.field5169, super.field5179, super.field5176, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIILrb;Lr;Z)V")
    public final void method184(int arg0, int arg1, int arg2, int arg3, class383 arg4, class564 arg5, boolean arg6) {
        if (arg2 != 2) {
            this.method237(true);
        }
        ++field1736;
        if (!(arg4 instanceof class426)) {
            if (arg4 instanceof class156) {
                class156 var8 = (class156) arg4;
                if (this.field1733 != null && var8.field1733 != null) {
                    this.field1733.method1916(var8.field1733, arg1, arg0, arg3, arg6);
                    return;
                }
            }
        } else {
            class426 var9 = (class426) arg4;
            if (this.field1733 == null || var9.field6045 == null) {
                return;
            }
            this.field1733.method1916(var9.field6045, arg1, arg0, arg3, arg6);
        }
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(Lr;I)Lwj;")
    public final class315 method182(class564 arg0, int arg1) {
        ++field1714;
        if (this.field1733 == null) {
            return null;
        } else {
            class490 var3 = arg0.method950();
            var3.method23(super.field5179, super.field5178, super.field5176);
            if (arg1 != 0) {
                return null;
            } else {
                class315 var4 = null;
                if (this.field1732) {
                    var4 = class419.method2349((byte) 122, 1);
                }
                if (!class460.field6553) {
                    this.field1733.method1914(var3, var4 != null ? var4.field3912[0] : null, 0);
                } else {
                    this.field1733.method1875(var3, var4 != null ? var4.field3912[0] : null, class682.field9623, 0);
                }
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Lr;Lqp;IIIIIZIIIIIIZ)V")
    public class156(class564 arg0, class638 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field9068 == -2, class224.method1352(arg13, arg12, -120));
        this.field1715 = arg7;
        this.field1732 = arg1.field9035 != 0 && !arg7;
        super.field5169 = (byte) arg3;
        this.field1737 = arg14;
        this.field1721 = (byte) arg12;
        this.field1725 = (short) arg1.field9021;
        this.field1741 = (byte) arg13;
        this.field1726 = arg0.method972() && arg1.field9067 && !this.field1715 && class639.field9075.method2720((byte) -107, class430.field6109) != 0;
        int var16 = 2048;
        if (this.field1737) {
            var16 |= 65536;
        }
        class65 var17 = this.method844(this.field1726, var16, 11, arg0);
        if (var17 != null) {
            this.field1713 = var17.field664;
            this.field1733 = var17.field665;
            if (this.field1737) {
                this.field1733 = this.field1733.method1877((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZIILr;)Lhi;")
    private final class65 method844(boolean arg0, int arg1, int arg2, class564 arg3) {
        ++field1730;
        class638 var5 = class364.field4891.method2134(65535 & this.field1725, true);
        if (arg2 != 11) {
            return null;
        } else {
            class274 var6;
            class274 var7;
            if (this.field1715) {
                var6 = class385.field5193[0];
                var7 = class666.field9303[super.field5169];
            } else {
                var7 = class385.field5193[super.field5169];
                if (~super.field5169 > -4) {
                    var6 = class385.field5193[super.field5169 + 1];
                } else {
                    var6 = null;
                }
            }
            return var5.method3584(super.field5179, super.field5178, arg3, super.field5176, var7, arg1, ~this.field1721 != -12 ? this.field1721 : 10, (byte) -91, arg0, this.field1721 != 11 ? this.field1741 : this.field1741 + 4, var6);
        }
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(I)I")
    public final int method238(int arg0) {
        ++field1739;
        if (arg0 != 6518) {
            this.method842(59, 108, (class564) null);
        }
        return this.field1725 & 65535;
    }
}
