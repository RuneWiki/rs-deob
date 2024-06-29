import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class96 extends class114 {

    @OriginalMember(owner = "client!ke", name = "Sb", descriptor = "Lai;")
    public static class10 field1773 = class44.method278("Lade Schrifts-=tze )2 ", -115);

    @OriginalMember(owner = "client!ke", name = "Gb", descriptor = "Lai;")
    private static class10 field1761 = class44.method278("Loaded textures", -91);

    @OriginalMember(owner = "client!ke", name = "Hb", descriptor = "Lai;")
    public static class10 field1762 = class44.method278("<col=ffffff>", -28);

    @OriginalMember(owner = "client!ke", name = "Pb", descriptor = "Lai;")
    private static class10 field1770 = class44.method278("Unexpected server response)3", -18);

    @OriginalMember(owner = "client!ke", name = "Db", descriptor = "Lai;")
    public static class10 field1758 = field1770;

    @OriginalMember(owner = "client!ke", name = "Eb", descriptor = "Lai;")
    public static class10 field1759 = field1761;

    @OriginalMember(owner = "client!ke", name = "Fb", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!ke", name = "Ib", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!ke", name = "Jb", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!ke", name = "Kb", descriptor = "I")
    public static int field1765;

    @OriginalMember(owner = "client!ke", name = "Lb", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!ke", name = "Mb", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!ke", name = "Nb", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!ke", name = "Ob", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!ke", name = "Qb", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!ke", name = "Tb", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!ke", name = "Ub", descriptor = "I")
    private int field1775;

    @OriginalMember(owner = "client!ke", name = "Vb", descriptor = "Lfe;")
    private class53 field1776;

    @OriginalMember(owner = "client!ke", name = "Rb", descriptor = "Z")
    public static boolean field1772;

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(I)V")
    public class96(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ke", name = "r", descriptor = "(I)V")
    public static void method630(int arg0) {
        field1759 = null;
        field1762 = null;
        field1758 = null;
        field1761 = null;
        field1770 = null;
        if (arg0 != 0) {
            field1762 = null;
        }
        field1773 = null;
    }

    @OriginalMember(owner = "client!ke", name = "s", descriptor = "(I)I")
    public final int method631(int arg0) {
        ++field1774;
        int var2 = -75 % ((arg0 - -47) / 59);
        return 255 & super.field2160[super.field2170++] - this.field1776.method372(-6);
    }

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "(II)I")
    public final int method632(int arg0, int arg1) {
        ++field1769;
        if (arg0 != 8) {
            this.method635((byte) -96, 56);
        }
        return arg1 * 8 - this.field1775;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIZBLmb;I)V")
    public static final void method633(int arg0, int arg1, int arg2, boolean arg3, byte arg4, class111 arg5, int arg6) {
        ++field1763;
        if (arg2 == -1469261520) {
            long var7 = (long) ((arg1 << 16) - -arg6);
            class194 var9 = (class194) class176.field3374.method213(121, var7);
            if (var9 == null) {
                class194 var10 = (class194) class170.field3287.method213(-69, var7);
                if (var10 == null) {
                    class194 var11 = (class194) class98.field1803.method213(arg2 ^ -1469261493, var7);
                    if (var11 != null) {
                        if (arg3) {
                            var11.method1247(0);
                            class176.field3374.method214(var11, (byte) 113, var7);
                            ++class89.field1570;
                            --class101.field1900;
                        }
                    } else {
                        if (!arg3) {
                            class194 var12 = (class194) class97.field1792.method213(-25, var7);
                            if (var12 != null) {
                                return;
                            }
                        }
                        class194 var13 = new class194();
                        var13.field3695 = arg4;
                        var13.field3691 = arg0;
                        var13.field3688 = arg5;
                        if (arg3) {
                            class176.field3374.method214(var13, (byte) 120, var7);
                            ++class89.field1570;
                        } else {
                            class42.field697.method902((byte) 118, var13);
                            class98.field1803.method214(var13, (byte) 109, var7);
                            ++class101.field1900;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "(Z)V")
    public final void method634(boolean arg0) {
        this.field1775 = super.field2170 * 8;
        ++field1764;
        if (!arg0) {
            this.method638(88, (byte) 33);
        }
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(BI)V")
    public final void method635(byte arg0, int arg1) {
        super.field2160[super.field2170++] = (byte) (this.field1776.method372(-6) + arg1);
        ++field1766;
        if (arg0 > -39) {
            this.method638(-127, (byte) -103);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "([IB)V")
    public final void method636(int[] arg0, byte arg1) {
        if (arg1 == 0) {
            ++field1760;
            this.field1776 = new class53(arg0);
        }
    }

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "(Z)V")
    public final void method637(boolean arg0) {
        if (!arg0) {
            method633(-23, 109, 58, false, (byte) 111, (class111) null, -70);
        }
        ++field1768;
        super.field2170 = (this.field1775 + 7) / 8;
    }

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "(IB)I")
    public final int method638(int arg0, byte arg1) {
        ++field1765;
        if (arg1 > -116) {
            method633(-127, -46, -108, true, (byte) -38, (class111) null, -21);
        }
        int var3 = 8 - (this.field1775 & 7);
        int var4 = 0;
        int var5 = this.field1775 >> 3;
        this.field1775 += arg0;
        while (~var3 > ~arg0) {
            var4 += (super.field2160[var5++] & class207.field4040[var3]) << -var3 + arg0;
            arg0 -= var3;
            var3 = 8;
        }
        int var6;
        if (arg0 == var3) {
            var6 = (super.field2160[var5] & class207.field4040[var3]) + var4;
        } else {
            var6 = (super.field2160[var5] >> -arg0 + var3 & class207.field4040[arg0]) + var4;
        }
        return var6;
    }
}
