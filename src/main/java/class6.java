import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class6 extends class46 {

    @OriginalMember(owner = "client!ae", name = "Lb", descriptor = "I")
    public static int field72 = 0;

    @OriginalMember(owner = "client!ae", name = "Ob", descriptor = "[I")
    public static int[] field75 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!ae", name = "Kb", descriptor = "I")
    public static int field71 = 0;

    @OriginalMember(owner = "client!ae", name = "Vb", descriptor = "Li;")
    public static class88 field82 = class208.method1425(105, " GMT");

    @OriginalMember(owner = "client!ae", name = "Mb", descriptor = "Li;")
    public static class88 field73 = class208.method1425(105, "Ihr Spielkonto wurde deaktiviert)3");

    @OriginalMember(owner = "client!ae", name = "Zb", descriptor = "Li;")
    public static class88 field86 = class208.method1425(105, "und die Schaltfl-=che (WSpielkonto erstellen(W am");

    @OriginalMember(owner = "client!ae", name = "cc", descriptor = "Li;")
    private static class88 field89 = class208.method1425(105, "Cancel");

    @OriginalMember(owner = "client!ae", name = "Wb", descriptor = "I")
    public static int field83 = 10;

    @OriginalMember(owner = "client!ae", name = "Pb", descriptor = "Li;")
    public static class88 field76 = field89;

    @OriginalMember(owner = "client!ae", name = "ac", descriptor = "Li;")
    public static class88 field87 = class208.method1425(105, "Freie Welt");

    @OriginalMember(owner = "client!ae", name = "Nb", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!ae", name = "Qb", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!ae", name = "Rb", descriptor = "I")
    private int field78;

    @OriginalMember(owner = "client!ae", name = "Sb", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!ae", name = "Tb", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!ae", name = "Ub", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!ae", name = "Xb", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!ae", name = "Yb", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!ae", name = "bc", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!ae", name = "dc", descriptor = "I")
    public static int field90;

    @OriginalMember(owner = "client!ae", name = "fc", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!ae", name = "hc", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!ae", name = "ic", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!ae", name = "ec", descriptor = "Lnd;")
    private class146 field91;

    @OriginalMember(owner = "client!ae", name = "gc", descriptor = "Lqg;")
    public static class181 field93;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZIIIII)V")
    public static final void method26(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field95;
        if (!arg0) {
            field82 = null;
        }
        if (class67.field1207 <= arg4 && class12.field183 >= arg5 && ~arg2 <= ~class49.field919 && ~class18.field279 <= ~arg1) {
            class223.method1504(arg4, arg3, arg5, arg2, !arg0, arg1);
        } else {
            client.method226(arg3, arg2, arg1, 63, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "(IB)Z")
    public static final boolean method27(int arg0, byte arg1) {
        if (arg1 >= -59) {
            method27(57, (byte) -23);
        }
        ++field79;
        return ~(arg0 >> 31 & 1) != -1;
    }

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "(II)I")
    public final int method28(int arg0, int arg1) {
        int var3 = this.field78 >> 3;
        ++field90;
        int var4 = -(7 & this.field78) + 8;
        this.field78 += arg0;
        if (arg1 != -315) {
            field83 = 34;
        }
        int var5 = 0;
        while (~var4 > ~arg0) {
            var5 += (class219.field4144[var4] & super.field842[var3++]) << -var4 + arg0;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (~arg0 == ~var4) {
            var6 = (super.field842[var3] & class219.field4144[var4]) + var5;
        } else {
            var6 = (super.field842[var3] >> -arg0 + var4 & class219.field4144[arg0]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I[BZI)V")
    public final void method29(int arg0, byte[] arg1, boolean arg2, int arg3) {
        ++field74;
        if (arg2) {
            field72 = 103;
        }
        for (int var5 = 0; ~var5 > ~arg0; ++var5) {
            arg1[arg3 + var5] = (byte) (super.field842[super.field831++] + -this.field91.method980(255));
        }
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(I)V")
    public class6(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(BI)V")
    public final void method30(byte arg0, int arg1) {
        super.field842[super.field831++] = (byte) (arg1 + this.field91.method980(255));
        if (arg0 < -28) {
            ++field94;
        }
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(ZI)I")
    public final int method31(boolean arg0, int arg1) {
        ++field92;
        if (arg0) {
            this.field91 = null;
        }
        return arg1 * 8 + -this.field78;
    }

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "(Z)V")
    public static void method32(boolean arg0) {
        if (!arg0) {
            field89 = null;
            field82 = null;
            field75 = null;
            field73 = null;
            field76 = null;
            field86 = null;
            field87 = null;
            field93 = null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "(B)I")
    public final int method33(byte arg0) {
        ++field80;
        return arg0 > -20 ? 103 : 255 & super.field842[super.field831++] - this.field91.method980(255);
    }

    @OriginalMember(owner = "client!ae", name = "u", descriptor = "(I)V")
    public final void method34(int arg0) {
        this.field78 = super.field831 * arg0;
        ++field81;
    }

    @OriginalMember(owner = "client!ae", name = "v", descriptor = "(I)V")
    public final void method35(int arg0) {
        ++field85;
        super.field831 = (this.field78 + 7) / arg0;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "([IB)V")
    public final void method36(int[] arg0, byte arg1) {
        ++field88;
        if (arg1 != 75) {
            this.method31(true, -17);
        }
        this.field91 = new class146(arg0);
    }
}
