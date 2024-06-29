import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class484 extends class374 {

    @OriginalMember(owner = "client!kj", name = "Kb", descriptor = "Lrg;")
    public static class548 field6762 = new class548(56, -1);

    @OriginalMember(owner = "client!kj", name = "Sb", descriptor = "[I")
    public static int[] field6770 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!kj", name = "Tb", descriptor = "I")
    public static int field6771 = 0;

    @OriginalMember(owner = "client!kj", name = "Fb", descriptor = "I")
    public static int field6757;

    @OriginalMember(owner = "client!kj", name = "Gb", descriptor = "I")
    private int field6758;

    @OriginalMember(owner = "client!kj", name = "Hb", descriptor = "I")
    public static int field6759;

    @OriginalMember(owner = "client!kj", name = "Ib", descriptor = "I")
    public static int field6760;

    @OriginalMember(owner = "client!kj", name = "Jb", descriptor = "I")
    public static int field6761;

    @OriginalMember(owner = "client!kj", name = "Lb", descriptor = "I")
    public static int field6763;

    @OriginalMember(owner = "client!kj", name = "Mb", descriptor = "I")
    public static int field6764;

    @OriginalMember(owner = "client!kj", name = "Nb", descriptor = "I")
    public static int field6765;

    @OriginalMember(owner = "client!kj", name = "Pb", descriptor = "I")
    public static int field6767;

    @OriginalMember(owner = "client!kj", name = "Qb", descriptor = "I")
    public static int field6768;

    @OriginalMember(owner = "client!kj", name = "Rb", descriptor = "I")
    public static int field6769;

    @OriginalMember(owner = "client!kj", name = "Ob", descriptor = "Lvl;")
    private class13 field6766;

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(I)V")
    public class484(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!kj", name = "m", descriptor = "(II)V")
    public final void method2804(int arg0, int arg1) {
        if (arg1 == 30979) {
            ++field6768;
            super.field4929[super.field4966++] = (byte) (this.field6766.method108((byte) 59) + arg0);
        }
    }

    @OriginalMember(owner = "client!kj", name = "u", descriptor = "(I)I")
    public final int method2805(int arg0) {
        ++field6763;
        if (arg0 != 3659) {
            this.method2813(-9, -80);
        }
        int var2 = 255 & super.field4929[super.field4966++] + -this.field6766.method108((byte) -98);
        return ~var2 > -129 ? var2 : (super.field4929[super.field4966++] - this.field6766.method108((byte) 73) & 255) + (var2 - 128 << 8);
    }

    @OriginalMember(owner = "client!kj", name = "v", descriptor = "(I)V")
    public final void method2806(int arg0) {
        ++field6764;
        if (arg0 == -1) {
            this.field6758 = super.field4966 * 8;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "([IB)V")
    public final void method2807(int[] arg0, byte arg1) {
        this.field6766 = new class13(arg0);
        int var3 = -5 % ((-67 - arg1) / 57);
        ++field6757;
    }

    @OriginalMember(owner = "client!kj", name = "n", descriptor = "(II)I")
    public static final int method2808(int arg0, int arg1) {
        if (arg0 != 4) {
            field6771 = 74;
        }
        ++field6759;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!kj", name = "j", descriptor = "(B)Z")
    public final boolean method2809(byte arg0) {
        if (arg0 > -68) {
            method2810(false);
        }
        ++field6760;
        int var2 = super.field4929[super.field4966] + -this.field6766.method104(34847) & 255;
        return var2 >= 128;
    }

    @OriginalMember(owner = "client!kj", name = "j", descriptor = "(Z)V")
    public static void method2810(boolean arg0) {
        field6770 = null;
        if (!arg0) {
            field6762 = null;
        }
    }

    @OriginalMember(owner = "client!kj", name = "o", descriptor = "(II)I")
    public final int method2811(int arg0, int arg1) {
        ++field6761;
        if (arg1 != 11672) {
            this.method2812(-18, 4, (byte) -18, (byte[]) null);
        }
        return arg0 * 8 + -this.field6758;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIB[B)V")
    public final void method2812(int arg0, int arg1, byte arg2, byte[] arg3) {
        ++field6767;
        for (int var5 = 0; ~arg0 < ~var5; ++var5) {
            arg3[arg1 + var5] = (byte) (super.field4929[super.field4966++] + -this.field6766.method108((byte) -70));
        }
        int var6 = 54 % ((16 - arg2) / 52);
    }

    @OriginalMember(owner = "client!kj", name = "p", descriptor = "(II)I")
    public final int method2813(int arg0, int arg1) {
        ++field6765;
        int var3 = this.field6758 >> 3;
        int var4 = 8 - (7 & this.field6758);
        this.field6758 += arg0;
        int var5 = 0;
        while (~arg0 < ~var4) {
            var5 += (class183.field2224[var4] & super.field4929[var3++]) << -var4 + arg0;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg0 == var4) {
            var6 = (super.field4929[var3] & class183.field2224[var4]) + var5;
        } else {
            var6 = (super.field4929[var3] >> -arg0 + var4 & class183.field2224[arg0]) + var5;
        }
        int var7 = -85 % ((55 - arg1) / 40);
        return var6;
    }

    @OriginalMember(owner = "client!kj", name = "k", descriptor = "(B)V")
    public final void method2814(byte arg0) {
        if (arg0 <= 6) {
            this.method2806(44);
        }
        super.field4966 = (this.field6758 + 7) / 8;
        ++field6769;
    }
}
