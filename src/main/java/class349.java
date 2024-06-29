import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class349 extends class494 {

    @OriginalMember(owner = "client!js", name = "Hb", descriptor = "Z")
    public static boolean field4878 = false;

    @OriginalMember(owner = "client!js", name = "Ib", descriptor = "I")
    public static int field4879;

    @OriginalMember(owner = "client!js", name = "Jb", descriptor = "I")
    public static int field4880;

    @OriginalMember(owner = "client!js", name = "Kb", descriptor = "I")
    public static int field4881;

    @OriginalMember(owner = "client!js", name = "Lb", descriptor = "I")
    private int field4882;

    @OriginalMember(owner = "client!js", name = "Mb", descriptor = "I")
    public static int field4883;

    @OriginalMember(owner = "client!js", name = "Nb", descriptor = "I")
    public static int field4884;

    @OriginalMember(owner = "client!js", name = "Ob", descriptor = "I")
    public static int field4885;

    @OriginalMember(owner = "client!js", name = "Qb", descriptor = "I")
    public static int field4887;

    @OriginalMember(owner = "client!js", name = "Rb", descriptor = "I")
    public static int field4888;

    @OriginalMember(owner = "client!js", name = "Sb", descriptor = "I")
    public static int field4889;

    @OriginalMember(owner = "client!js", name = "Tb", descriptor = "I")
    public static int field4890;

    @OriginalMember(owner = "client!js", name = "Ub", descriptor = "I")
    public static int field4891;

    @OriginalMember(owner = "client!js", name = "Pb", descriptor = "Lws;")
    private class377 field4886;

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(I[I)V")
    public final void method2208(int arg0, int[] arg1) {
        this.field4886 = new class377(arg1);
        ++field4888;
        if (arg0 != -12010) {
            this.method2217(-59);
        }
    }

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(II[BI)V")
    public final void method2209(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg1 <= 82) {
            this.method2210(-46, -47);
        }
        ++field4884;
        for (int var5 = 0; arg3 > var5; ++var5) {
            arg2[arg0 + var5] = (byte) (super.field7050[super.field7042++] + -this.field4886.method2334(-94));
        }
    }

    @OriginalMember(owner = "client!js", name = "o", descriptor = "(II)V")
    public final void method2210(int arg0, int arg1) {
        int var3 = -124 / ((arg0 - -72) / 51);
        super.field7050[super.field7042++] = (byte) (arg1 + this.field4886.method2334(-98));
        ++field4880;
    }

    @OriginalMember(owner = "client!js", name = "p", descriptor = "(II)I")
    public final int method2211(int arg0, int arg1) {
        ++field4885;
        if (arg1 != -14568) {
            this.field4886 = null;
        }
        return arg0 * 8 + -this.field4882;
    }

    @OriginalMember(owner = "client!js", name = "o", descriptor = "(I)V")
    public final void method2212(int arg0) {
        if (arg0 != 1163641539) {
            field4881 = -115;
        }
        this.field4882 = super.field7042 * 8;
        ++field4883;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(BLws;)V")
    public final void method2213(byte arg0, class377 arg1) {
        this.field4886 = arg1;
        if (arg0 > -49) {
            this.method2212(-46);
        }
        ++field4891;
    }

    @OriginalMember(owner = "client!js", name = "i", descriptor = "(Z)Z")
    public final boolean method2214(boolean arg0) {
        ++field4879;
        int var2 = super.field7050[super.field7042] - this.field4886.method2336(2015625216) & 255;
        if (var2 < 128) {
            return false;
        } else {
            if (!arg0) {
                this.field4886 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!js", name = "p", descriptor = "(I)I")
    public final int method2215(int arg0) {
        if (arg0 != 23505) {
            this.method2210(112, -61);
        }
        ++field4887;
        int var2 = super.field7050[super.field7042++] + -this.field4886.method2334(-93) & 255;
        return var2 < 128 ? var2 : (var2 + -128 << 8) - -(255 & super.field7050[super.field7042++] - this.field4886.method2334(-83));
    }

    @OriginalMember(owner = "client!js", name = "q", descriptor = "(II)I")
    public final int method2216(int arg0, int arg1) {
        ++field4890;
        int var3 = this.field4882 >> 3;
        int var4 = -(7 & this.field4882) + 8;
        this.field4882 += arg1;
        int var5 = 0;
        if (arg0 > -96) {
            field4878 = true;
        }
        while (~arg1 < ~var4) {
            var5 += (class174.field2691[var4] & super.field7050[var3++]) << -var4 + arg1;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (~arg1 == ~var4) {
            var6 = (super.field7050[var3] & class174.field2691[var4]) + var5;
        } else {
            var6 = (super.field7050[var3] >> -arg1 + var4 & class174.field2691[arg1]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!js", name = "<init>", descriptor = "(I)V")
    public class349(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!js", name = "q", descriptor = "(I)V")
    public final void method2217(int arg0) {
        super.field7042 = (this.field4882 - arg0) / 8;
        ++field4889;
    }
}
