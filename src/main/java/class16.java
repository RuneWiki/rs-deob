import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class16 extends class88 {

    @OriginalMember(owner = "client!wt", name = "Lb", descriptor = "I")
    public static int field264 = 0;

    @OriginalMember(owner = "client!wt", name = "Jb", descriptor = "Z")
    public static boolean field262 = false;

    @OriginalMember(owner = "client!wt", name = "Kb", descriptor = "Loi;")
    public static class169 field263 = new class169("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces chargées", "Interfaces carregadas");

    @OriginalMember(owner = "client!wt", name = "Ub", descriptor = "Lcr;")
    public static class362 field273 = new class362();

    @OriginalMember(owner = "client!wt", name = "Fb", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!wt", name = "Gb", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!wt", name = "Hb", descriptor = "I")
    private int field260;

    @OriginalMember(owner = "client!wt", name = "Ib", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!wt", name = "Mb", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!wt", name = "Nb", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!wt", name = "Pb", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!wt", name = "Qb", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!wt", name = "Rb", descriptor = "I")
    public static int field270;

    @OriginalMember(owner = "client!wt", name = "Sb", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!wt", name = "Ob", descriptor = "Lfj;")
    private class494 field267;

    @OriginalMember(owner = "client!wt", name = "Tb", descriptor = "[I")
    public static int[] field272;

    @OriginalMember(owner = "client!wt", name = "l", descriptor = "(B)V")
    public static void method98(byte arg0) {
        field263 = null;
        if (arg0 >= -32) {
            field273 = null;
        }
        field273 = null;
        field272 = null;
    }

    @OriginalMember(owner = "client!wt", name = "s", descriptor = "(I)V")
    public final void method99(int arg0) {
        ++field270;
        this.field260 = super.field1176 * arg0;
    }

    @OriginalMember(owner = "client!wt", name = "c", descriptor = "(BI)I")
    public final int method100(byte arg0, int arg1) {
        ++field265;
        int var3 = this.field260 >> 3;
        int var4 = -(this.field260 & 7) + 8;
        int var5 = 0;
        int var6 = 41 % ((arg0 - -25) / 36);
        this.field260 += arg1;
        while (~arg1 < ~var4) {
            var5 += (class452.field6291[var4] & super.field1223[var3++]) << -var4 + arg1;
            arg1 -= var4;
            var4 = 8;
        }
        int var7;
        if (arg1 != var4) {
            var7 = (super.field1223[var3] >> var4 - arg1 & class452.field6291[arg1]) + var5;
        } else {
            var7 = (super.field1223[var3] & class452.field6291[var4]) + var5;
        }
        return var7;
    }

    @OriginalMember(owner = "client!wt", name = "c", descriptor = "(ZI)V")
    public final void method101(boolean arg0, int arg1) {
        ++field268;
        if (!arg0) {
            super.field1223[super.field1176++] = (byte) (this.field267.method2957(-9570) + arg1);
        }
    }

    @OriginalMember(owner = "client!wt", name = "t", descriptor = "(I)V")
    public final void method102(int arg0) {
        ++field266;
        super.field1176 = (this.field260 + 7) / 8;
        if (arg0 < 88) {
            this.method107(119);
        }
    }

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "(IZ)I")
    public final int method103(int arg0, boolean arg1) {
        ++field261;
        return !arg1 ? -103 : arg0 * 8 - this.field260;
    }

    @OriginalMember(owner = "client!wt", name = "m", descriptor = "(B)I")
    public final int method104(byte arg0) {
        ++field258;
        int var2 = super.field1223[super.field1176++] - this.field267.method2957(-9570) & 255;
        if (~var2 > -129) {
            return var2;
        } else {
            return arg0 <= 84 ? -37 : (super.field1223[super.field1176++] + -this.field267.method2957(-9570) & 255) + (var2 + -128 << 8);
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(Z[I)V")
    public final void method105(boolean arg0, int[] arg1) {
        this.field267 = new class494(arg1);
        if (arg0) {
            method98((byte) 19);
        }
        ++field269;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(IB[BI)V")
    public final void method106(int arg0, byte arg1, byte[] arg2, int arg3) {
        for (int var5 = 0; var5 < arg0; ++var5) {
            arg2[arg3 + var5] = (byte) (super.field1223[super.field1176++] + -this.field267.method2957(-9570));
        }
        int var6 = -108 % ((-6 - arg1) / 50);
        ++field259;
    }

    @OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(I)V")
    public class16(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!wt", name = "u", descriptor = "(I)Z")
    public final boolean method107(int arg0) {
        if (arg0 > -40) {
            this.method103(-105, true);
        }
        ++field271;
        int var2 = super.field1223[super.field1176] + -this.field267.method2954(false) & 255;
        return var2 >= 128;
    }
}
