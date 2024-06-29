import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class90 extends class53 {

    @OriginalMember(owner = "client!k", name = "Gb", descriptor = "Z")
    public static boolean field1764 = false;

    @OriginalMember(owner = "client!k", name = "Rb", descriptor = "Lsd;")
    public static class166 field1775 = class135.method935("Ihr Spielkonto wird bereits benutzt)3", 0);

    @OriginalMember(owner = "client!k", name = "Kb", descriptor = "[Lv;")
    public static class189[] field1768 = new class189[16];

    @OriginalMember(owner = "client!k", name = "Vb", descriptor = "[I")
    public static int[] field1779 = new int[1000];

    @OriginalMember(owner = "client!k", name = "Yb", descriptor = "Lsd;")
    public static class166 field1782 = class135.method935("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie", 0);

    @OriginalMember(owner = "client!k", name = "Hb", descriptor = "Lb;")
    public static class11 field1765 = new class11(5);

    @OriginalMember(owner = "client!k", name = "Zb", descriptor = "Lsd;")
    public static class166 field1783 = class135.method935("<img=0>", 0);

    @OriginalMember(owner = "client!k", name = "ac", descriptor = "Lsd;")
    public static class166 field1784 = class135.method935("headicons_hint", 0);

    @OriginalMember(owner = "client!k", name = "Fb", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!k", name = "Ib", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!k", name = "Jb", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!k", name = "Lb", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!k", name = "Mb", descriptor = "I")
    public static int field1770;

    @OriginalMember(owner = "client!k", name = "Nb", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!k", name = "Ob", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!k", name = "Pb", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!k", name = "Qb", descriptor = "I")
    private int field1774;

    @OriginalMember(owner = "client!k", name = "Sb", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!k", name = "Tb", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!k", name = "Ub", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!k", name = "Wb", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!k", name = "Xb", descriptor = "Lqf;")
    private class150 field1781;

    @OriginalMember(owner = "client!k", name = "i", descriptor = "(II)Lvd;")
    public static final class193 method701(int arg0, int arg1) {
        if (arg0 != -31355) {
            return null;
        } else {
            ++field1763;
            int var2 = arg1 & 65535;
            int var3 = arg1 >> 16;
            if (class63.field1309[var3] == null || class63.field1309[var3][var2] == null) {
                boolean var4 = class169.method1169(var3, 0);
                if (!var4) {
                    return null;
                }
            }
            return class63.field1309[var3][var2];
        }
    }

    @OriginalMember(owner = "client!k", name = "j", descriptor = "(II)I")
    public final int method702(int arg0, int arg1) {
        int var3 = 25 % ((-46 - arg1) / 45);
        ++field1778;
        return arg0 * 8 - this.field1774;
    }

    @OriginalMember(owner = "client!k", name = "q", descriptor = "(B)V")
    public final void method703(byte arg0) {
        if (arg0 >= 48) {
            ++field1780;
            this.field1774 = super.field1000 * 8;
        }
    }

    @OriginalMember(owner = "client!k", name = "o", descriptor = "(I)I")
    public final int method704(int arg0) {
        if (arg0 != 255) {
            field1765 = null;
        }
        ++field1766;
        return super.field988[super.field1000++] + -this.field1781.method1018((byte) -83) & 255;
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(I)V")
    public class90(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!k", name = "c", descriptor = "(IB)V")
    public final void method705(int arg0, byte arg1) {
        if (arg1 != 9) {
            method710(-69);
        }
        super.field988[super.field1000++] = (byte) (arg0 + this.field1781.method1018((byte) -83));
        ++field1772;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "([IB)V")
    public final void method706(int[] arg0, byte arg1) {
        int var3 = -3 / ((-57 - arg1) / 51);
        ++field1773;
        this.field1781 = new class150(arg0);
    }

    @OriginalMember(owner = "client!k", name = "d", descriptor = "(IB)I")
    public static final int method707(int arg0, byte arg1) {
        ++field1777;
        if (arg1 >= -72) {
            return 0;
        } else {
            int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
            int var3 = arg0 * 6 + -61440;
            int var4 = (arg0 * var3 >> 12) + 40960;
            return var2 * var4 >> 12;
        }
    }

    @OriginalMember(owner = "client!k", name = "k", descriptor = "(II)I")
    public final int method708(int arg0, int arg1) {
        int var3 = this.field1774 >> 3;
        int var4 = 0;
        ++field1767;
        int var5 = -(7 & this.field1774) + arg0;
        this.field1774 += arg1;
        while (var5 < arg1) {
            var4 += (super.field988[var3++] & class111.field2153[var5]) << arg1 - var5;
            arg1 -= var5;
            var5 = 8;
        }
        int var6;
        if (~arg1 == ~var5) {
            var6 = (super.field988[var3] & class111.field2153[var5]) + var4;
        } else {
            var6 = (super.field988[var3] >> -arg1 + var5 & class111.field2153[arg1]) + var4;
        }
        return var6;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method709(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field1776;
        if (class169.method1169(arg0, 0)) {
            class178.method1206(5314, arg1, arg2, arg6, class63.field1309[arg0], arg5, arg7, arg3, arg4);
        }
    }

    @OriginalMember(owner = "client!k", name = "p", descriptor = "(I)V")
    public static void method710(int arg0) {
        field1779 = null;
        field1784 = null;
        if (arg0 < 21) {
            method707(-55, (byte) 106);
        }
        field1782 = null;
        field1775 = null;
        field1783 = null;
        field1768 = null;
        field1765 = null;
    }

    @OriginalMember(owner = "client!k", name = "r", descriptor = "(B)V")
    public final void method711(byte arg0) {
        super.field1000 = (this.field1774 + 7) / 8;
        ++field1770;
        if (arg0 < 99) {
            this.method708(-112, -24);
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IILcb;Lje;)V")
    public static final void method712(int arg0, int arg1, class22 arg2, class86 arg3) {
        ++field1771;
        int var4 = -91 % ((arg1 - -36) / 54);
        class153 var5 = new class153();
        var5.field2948 = arg3;
        var5.field2946 = 1;
        var5.field2541 = (long) arg0;
        var5.field2950 = arg2;
        class165 var6 = class137.field2671;
        synchronized (class137.field2671) {
            class137.field2671.method1112(-1250931468, var5);
        }
        class53.method387((byte) -63);
    }
}
