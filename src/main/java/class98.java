import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class98 extends class455 implements class185 {

    @OriginalMember(owner = "client!d", name = "S", descriptor = "B")
    private byte field1785;

    @OriginalMember(owner = "client!d", name = "Q", descriptor = "Z")
    private boolean field1783;

    @OriginalMember(owner = "client!d", name = "C", descriptor = "Z")
    private boolean field1769;

    @OriginalMember(owner = "client!d", name = "O", descriptor = "S")
    private short field1781;

    @OriginalMember(owner = "client!d", name = "A", descriptor = "B")
    private byte field1767;

    @OriginalMember(owner = "client!d", name = "R", descriptor = "Z")
    private boolean field1784;

    @OriginalMember(owner = "client!d", name = "W", descriptor = "B")
    private byte field1789;

    @OriginalMember(owner = "client!d", name = "z", descriptor = "Z")
    private boolean field1766;

    @OriginalMember(owner = "client!d", name = "t", descriptor = "Lh;")
    private class452 field1760;

    @OriginalMember(owner = "client!d", name = "F", descriptor = "Lcd;")
    public class198 field1772;

    @OriginalMember(owner = "client!d", name = "G", descriptor = "Z")
    public static boolean field1773 = false;

    @OriginalMember(owner = "client!d", name = "w", descriptor = "I")
    public static int field1763 = 0;

    @OriginalMember(owner = "client!d", name = "J", descriptor = "Ltq;")
    public static class427 field1776 = null;

    @OriginalMember(owner = "client!d", name = "P", descriptor = "Loe;")
    public static class127 field1782 = new class127(50, 6);

    @OriginalMember(owner = "client!d", name = "p", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!d", name = "q", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!d", name = "r", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!d", name = "s", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!d", name = "u", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!d", name = "v", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!d", name = "x", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!d", name = "y", descriptor = "I")
    public static int field1765;

    @OriginalMember(owner = "client!d", name = "B", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!d", name = "D", descriptor = "I")
    public static int field1770;

    @OriginalMember(owner = "client!d", name = "E", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!d", name = "H", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!d", name = "I", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!d", name = "K", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!d", name = "L", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!d", name = "M", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!d", name = "N", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!d", name = "T", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!d", name = "U", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!d", name = "V", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Z)I", line = 6)
    public final int method170(boolean arg0) {
        ++field1774;
        if (!arg0) {
            this.field1767 = 78;
        }
        return this.field1789;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IILqq;Z)Ldi;", line = 18)
    private final class78 method738(int arg0, int arg1, class318 arg2, boolean arg3) {
        ++field1787;
        if (arg0 <= 14) {
            this.field1760 = null;
        }
        class56 var5 = class128.field2070.method916((byte) -15, this.field1781 & 65535);
        class343 var6;
        class343 var7;
        if (this.field1784) {
            var6 = class262.field3978[this.field1767];
            var7 = class201.field3195[0];
        } else {
            if (~this.field1767 <= -4) {
                var7 = null;
            } else {
                var7 = class201.field3195[this.field1767 + 1];
            }
            var6 = class201.field3195[this.field1767];
        }
        return var5.method391(this.field1785, super.field6978, true, super.field6980, var7, super.field6982, arg1, this.field1789, arg2, var6, arg3);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ZLqq;)V", line = 50)
    public final void method176(boolean arg0, class318 arg1) {
        ++field1756;
        if (arg0) {
            Object var3 = null;
            class452 var5;
            if (this.field1760 == null && this.field1766) {
                class78 var4 = this.method738(118, 262144, arg1, true);
                var5 = var4 == null ? null : var4.field1381;
            } else {
                var5 = this.field1760;
                this.field1760 = null;
            }
            if (var5 != null) {
                class90.method668(var5, this.field1767, super.field6980, super.field6978, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(Lqq;Lin;IIIIZIIZ)V", line = 79)
    public class98(class318 arg0, class56 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, boolean arg9) {
        super(arg3, arg4, arg5, class382.method2291(arg8, (byte) 22, arg7));
        this.field1785 = (byte) arg8;
        this.field1783 = arg9;
        this.field1769 = arg1.field895 != 0 && !arg6;
        this.field1781 = (short) arg1.field958;
        super.field6980 = arg3;
        this.field1767 = (byte) arg2;
        this.field1784 = arg6;
        this.field1789 = (byte) arg7;
        super.field6978 = arg5;
        this.field1766 = arg0.method1934() && arg1.field921 && !this.field1784 && class463.field7116.field2974 != 0;
        int var11 = 2048;
        if (this.field1783) {
            var11 |= 65536;
        }
        class78 var12 = this.method738(39, var11, arg0, this.field1766);
        if (var12 != null) {
            this.field1760 = var12.field1381;
            this.field1772 = var12.field1385;
            if (this.field1783) {
                this.field1772 = this.field1772.method511((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "d", descriptor = "(I)Z", line = 117)
    public final boolean method164(int arg0) {
        ++field1778;
        return arg0 != 0 ? true : this.field1783;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(III[B)[B", line = 129)
    public static final byte[] method739(int arg0, int arg1, int arg2, byte[] arg3) {
        ++field1779;
        byte[] var4 = new byte[arg1];
        int var5 = -86 / ((arg2 - 17) / 44);
        class356.method2184(arg3, arg0, var4, 0, arg1);
        return var4;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I[Ltq;I)V", line = 149)
    public static final void method740(int arg0, class427[] arg1, int arg2) {
        if (arg0 != -1) {
            method743(-122, 108, 8);
        }
        ++field1775;
        for (int var3 = 0; ~arg1.length < ~var3; ++var3) {
            class427 var4 = arg1[var3];
            if (var4 != null) {
                if (var4.field6197 == 0) {
                    if (var4.field6193 != null) {
                        method740(-1, var4.field6193, arg2);
                    }
                    class394 var5 = (class394) class245.field3741.method2409(false, (long) var4.field6157);
                    if (var5 != null) {
                        class141.method933(255, arg2, var5.field5750);
                    }
                }
                if (~arg2 == -1 && var4.field6283 != null) {
                    class298 var6 = new class298();
                    var6.field4517 = var4;
                    var6.field4520 = var4.field6283;
                    class94.method704(var6);
                }
                if (~arg2 == -2 && var4.field6279 != null) {
                    if (var4.field6265 >= 0) {
                        class427 var7 = class413.method2435(160291920, var4.field6157);
                        if (var7 == null || var7.field6193 == null || ~var7.field6193.length >= ~var4.field6265 || var7.field6193[var4.field6265] != var4) {
                            continue;
                        }
                    }
                    class298 var8 = new class298();
                    var8.field4520 = var4.field6279;
                    var8.field4517 = var4;
                    class94.method704(var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(ZLqq;)V", line = 221)
    public final void method172(boolean arg0, class318 arg1) {
        ++field1788;
        if (arg0) {
            method741(-111, -45, 35);
        }
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(III)Ljk;", line = 232)
    public static final class431 method741(int arg0, int arg1, int arg2) {
        class268 var3 = class321.field4830[arg0][arg1][arg2];
        return var3 == null ? null : var3.field4052;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lqq;BII)Z", line = 240)
    public final boolean method162(class318 arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != -44) {
            return false;
        } else {
            ++field1777;
            class198 var5 = this.method744(arg1 + -79, 131072, arg0);
            if (var5 != null) {
                class496 var6 = arg0.method1976();
                var6.method198(super.field6980, super.field6982, super.field6978);
                return var5.method495(arg2, arg3, var6, false);
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(Z)V", line = 262)
    public static void method742(boolean arg0) {
        if (!arg0) {
            field1782 = null;
            field1776 = null;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ILqq;Lps;ZZII)V", line = 274)
    public final void method165(int arg0, class318 arg1, class59 arg2, boolean arg3, boolean arg4, int arg5, int arg6) {
        if (!arg4) {
            this.method171((class318) null, 118);
        }
        ++field1768;
        if (!(arg2 instanceof class98)) {
            if (arg2 instanceof class75) {
                class75 var8 = (class75) arg2;
                if (this.field1772 != null && var8.field1333 != null) {
                    this.field1772.method474(var8.field1333, arg6, arg0, arg5, arg3);
                    return;
                }
            }
        } else {
            class98 var9 = (class98) arg2;
            if (this.field1772 == null || var9.field1772 == null) {
                return;
            }
            this.field1772.method474(var9.field1772, arg6, arg0, arg5, arg3);
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)Z", line = 305)
    public final boolean method161(int arg0) {
        ++field1764;
        return arg0 != 15275 ? true : this.field1766;
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(III)Z", line = 322)
    public static final boolean method743(int arg0, int arg1, int arg2) {
        ++field1761;
        if (arg0 != 0) {
            field1757 = 12;
        }
        return ~(arg2 & 2048) != -1;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(B)I", line = 335)
    public final int method174(byte arg0) {
        ++field1770;
        return arg0 < 113 ? 34 : 65535 & this.field1781;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lqq;I)V", line = 348)
    public final void method171(class318 arg0, int arg1) {
        ++field1758;
        if (arg1 != 1577) {
            this.method161(-115);
        }
        Object var3 = null;
        class452 var5;
        if (this.field1760 == null && this.field1766) {
            class78 var4 = this.method738(arg1 + -1528, 262144, arg0, true);
            var5 = var4 != null ? var4.field1381 : null;
        } else {
            var5 = this.field1760;
            this.field1760 = null;
        }
        if (var5 != null) {
            class208.method1275(var5, this.field1767, super.field6980, super.field6978, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lqq;ZI)Lcd;", line = 378)
    public final class198 method167(class318 arg0, boolean arg1, int arg2) {
        ++field1771;
        return arg1 ? null : this.method744(-117, arg2, arg0);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(BLqq;)Lkm;", line = 393)
    public final class227 method169(byte arg0, class318 arg1) {
        ++field1786;
        if (this.field1772 == null) {
            return null;
        } else if (arg0 >= -11) {
            return null;
        } else {
            class496 var3 = arg1.method1976();
            var3.method198(super.field6980, super.field6982, super.field6978);
            class227 var4 = null;
            if (this.field1769) {
                var4 = class145.method951(1, 0);
            }
            this.field1772.method461(var3, var4 != null ? var4.field3476[0] : null, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!d", name = "e", descriptor = "(I)V", line = 419)
    public final void method168(int arg0) {
        this.field1783 = false;
        int var2 = -60 % ((arg0 - -53) / 62);
        ++field1780;
        if (this.field1772 != null) {
            this.field1772.method504(this.field1772.method489() & -65537);
        }
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(I)I", line = 435)
    public final int method173(int arg0) {
        if (arg0 != 1438) {
            return -4;
        } else {
            ++field1759;
            return this.field1785;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IILqq;)Lcd;", line = 446)
    private final class198 method744(int arg0, int arg1, class318 arg2) {
        ++field1765;
        if (this.field1772 != null && ~arg2.method1944(this.field1772.method489(), arg1) == -1) {
            return this.field1772;
        } else {
            if (arg0 > -113) {
                this.method164(-49);
            }
            class78 var4 = this.method738(61, arg1, arg2, false);
            return var4 == null ? null : var4.field1385;
        }
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(I)V", line = 475)
    public final void method163(int arg0) {
        if (arg0 != 8793) {
            method741(-28, 33, 82);
        }
        if (this.field1772 != null) {
            this.field1772.method503();
        }
        ++field1762;
    }
}
