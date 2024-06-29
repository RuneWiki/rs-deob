import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class580 extends class6 {

    @OriginalMember(owner = "client!oo", name = "Wb", descriptor = "Lor;")
    public static class594 field8270 = new class594();

    @OriginalMember(owner = "client!oo", name = "Yb", descriptor = "I")
    public static int field8272 = -1;

    @OriginalMember(owner = "client!oo", name = "B", descriptor = "I")
    public static int field8258;

    @OriginalMember(owner = "client!oo", name = "Lb", descriptor = "I")
    public static int field8259;

    @OriginalMember(owner = "client!oo", name = "Mb", descriptor = "I")
    public static int field8260;

    @OriginalMember(owner = "client!oo", name = "Nb", descriptor = "I")
    private int field8261;

    @OriginalMember(owner = "client!oo", name = "Ob", descriptor = "I")
    public static int field8262;

    @OriginalMember(owner = "client!oo", name = "Pb", descriptor = "I")
    public static int field8263;

    @OriginalMember(owner = "client!oo", name = "Qb", descriptor = "I")
    public static int field8264;

    @OriginalMember(owner = "client!oo", name = "Rb", descriptor = "I")
    public static int field8265;

    @OriginalMember(owner = "client!oo", name = "Sb", descriptor = "I")
    public static int field8266;

    @OriginalMember(owner = "client!oo", name = "Tb", descriptor = "I")
    public static int field8267;

    @OriginalMember(owner = "client!oo", name = "Vb", descriptor = "I")
    public static int field8269;

    @OriginalMember(owner = "client!oo", name = "Xb", descriptor = "I")
    public static int field8271;

    @OriginalMember(owner = "client!oo", name = "Ub", descriptor = "Lwba;")
    private class46 field8268;

    @OriginalMember(owner = "client!oo", name = "n", descriptor = "(B)V")
    public final void method3398(byte arg0) {
        if (arg0 != 104) {
            this.method3401(true, (class46) null);
        }
        ++field8259;
        super.field57 = (this.field8261 + 7) / 8;
    }

    @OriginalMember(owner = "client!oo", name = "o", descriptor = "(B)I")
    public final int method3399(byte arg0) {
        if (arg0 != 0) {
            method3403(-91, -115, -31, -32, -90, 19, -104, 66, 91);
        }
        ++field8271;
        int var2 = super.field96[super.field57++] - this.field8268.method545(true) & 255;
        return ~var2 > -129 ? var2 : (var2 + -128 << 8) - -(255 & super.field96[super.field57++] - this.field8268.method545(true));
    }

    @OriginalMember(owner = "client!oo", name = "f", descriptor = "(Z)V")
    public static void method3400(boolean arg0) {
        field8270 = null;
        if (arg0) {
            method3400(true);
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(ZLwba;)V")
    public final void method3401(boolean arg0, class46 arg1) {
        if (arg0) {
            this.field8261 = 80;
        }
        ++field8258;
        this.field8268 = arg1;
    }

    @OriginalMember(owner = "client!oo", name = "d", descriptor = "(IB)I")
    public final int method3402(int arg0, byte arg1) {
        int var3 = 101 / ((arg1 - -22) / 54);
        ++field8265;
        return arg0 * 8 + -this.field8261;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(IIIIIIIII)Z")
    public static final boolean method3403(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field8262;
        if (arg1 >= -109) {
            method3403(95, 23, -87, 113, -7, -76, -126, 113, -29);
        }
        if (arg6 < arg8 - -arg5 && ~(arg6 + arg7) < ~arg8) {
            return ~arg0 > ~(arg2 + arg4) && ~(arg0 + arg3) < ~arg4;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oo", name = "l", descriptor = "(II)I")
    public final int method3404(int arg0, int arg1) {
        ++field8269;
        int var3 = this.field8261 >> 3;
        int var4 = -(this.field8261 & 7) + arg1;
        this.field8261 += arg0;
        int var5 = 0;
        while (~arg0 < ~var4) {
            var5 += (class327.field5080[var4] & super.field96[var3++]) << -var4 + arg0;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg0 == var4) {
            var6 = (super.field96[var3] & class327.field5080[var4]) + var5;
        } else {
            var6 = (super.field96[var3] >> -arg0 + var4 & class327.field5080[arg0]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!oo", name = "g", descriptor = "(Z)V")
    public final void method3405(boolean arg0) {
        this.field8261 = super.field57 * 8;
        if (!arg0) {
            this.method3407((byte) 70, (int[]) null);
        }
        ++field8264;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "([BIII)V")
    public final void method3406(byte[] arg0, int arg1, int arg2, int arg3) {
        ++field8266;
        for (int var5 = 0; ~arg1 < ~var5; ++var5) {
            arg0[arg2 + var5] = (byte) (super.field96[super.field57++] + -this.field8268.method545(true));
        }
        if (arg3 >= -87) {
            this.method3408((byte) 61);
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(B[I)V")
    public final void method3407(byte arg0, int[] arg1) {
        this.field8268 = new class46(arg1);
        ++field8260;
        if (arg0 != 45) {
            this.field8261 = -60;
        }
    }

    @OriginalMember(owner = "client!oo", name = "p", descriptor = "(B)Z")
    public final boolean method3408(byte arg0) {
        ++field8263;
        int var2 = super.field96[super.field57] - this.field8268.method542(7) & 255;
        int var3 = 2 % ((arg0 - -72) / 52);
        return ~var2 <= -129;
    }

    @OriginalMember(owner = "client!oo", name = "e", descriptor = "(BI)V")
    public final void method3409(byte arg0, int arg1) {
        super.field96[super.field57++] = (byte) (this.field8268.method545(true) + arg1);
        if (arg0 != -73) {
            field8270 = null;
        }
        ++field8267;
    }

    @OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(I)V")
    public class580(int arg0) {
        super(arg0);
    }
}
