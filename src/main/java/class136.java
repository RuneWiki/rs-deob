import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class136 extends class239 {

    @OriginalMember(owner = "client!he", name = "Ob", descriptor = "I")
    public static int field2438 = 0;

    @OriginalMember(owner = "client!he", name = "Ub", descriptor = "Lmb;")
    private static class96 field2444 = class243.method1708("Loading title screen )2 ", (byte) 102);

    @OriginalMember(owner = "client!he", name = "Lb", descriptor = "Lmb;")
    public static class96 field2435 = field2444;

    @OriginalMember(owner = "client!he", name = "Kb", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!he", name = "Nb", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!he", name = "Pb", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!he", name = "Qb", descriptor = "I")
    public static int field2440;

    @OriginalMember(owner = "client!he", name = "Rb", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!he", name = "Sb", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!he", name = "Tb", descriptor = "I")
    public static int field2443;

    @OriginalMember(owner = "client!he", name = "Vb", descriptor = "I")
    public static int field2445;

    @OriginalMember(owner = "client!he", name = "Wb", descriptor = "I")
    private int field2446;

    @OriginalMember(owner = "client!he", name = "Xb", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!he", name = "Jb", descriptor = "Lhj;")
    private class212 field2433;

    @OriginalMember(owner = "client!he", name = "Mb", descriptor = "[I")
    public static int[] field2436;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "(BI)V")
    public final void method1012(byte arg0, int arg1) {
        super.field4144[super.field4124++] = (byte) (arg1 + this.field2433.method1474(123));
        int var3 = -108 % ((-76 - arg0) / 43);
        ++field2434;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "([BIII)V")
    public final void method1013(byte[] arg0, int arg1, int arg2, int arg3) {
        ++field2442;
        for (int var5 = 0; var5 < arg1; ++var5) {
            arg0[arg2 + var5] = (byte) (super.field4144[super.field4124++] + -this.field2433.method1474(112));
        }
        if (arg3 <= 123) {
            this.method1019((byte) -65);
        }
    }

    @OriginalMember(owner = "client!he", name = "e", descriptor = "(IB)I")
    public final int method1014(int arg0, byte arg1) {
        if (arg1 != 6) {
            return -12;
        } else {
            ++field2440;
            return arg0 * 8 + -this.field2446;
        }
    }

    @OriginalMember(owner = "client!he", name = "n", descriptor = "(B)V")
    public static void method1015(byte arg0) {
        field2444 = null;
        int var1 = -48 % ((arg0 - 31) / 62);
        field2436 = null;
        field2435 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I[I)V")
    public final void method1016(int arg0, int[] arg1) {
        ++field2439;
        this.field2433 = new class212(arg1);
        if (arg0 != 8) {
            this.method1016(-8, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(I)V")
    public class136(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!he", name = "f", descriptor = "(BI)I")
    public final int method1017(byte arg0, int arg1) {
        if (arg0 <= 123) {
            this.method1020(27);
        }
        int var3 = this.field2446 >> 3;
        ++field2447;
        int var4 = 8 - (this.field2446 & 7);
        this.field2446 += arg1;
        int var5 = 0;
        while (~var4 > ~arg1) {
            var5 += (super.field4144[var3++] & class215.field3696[var4]) << -var4 + arg1;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (~arg1 != ~var4) {
            var6 = (super.field4144[var3] >> -arg1 + var4 & class215.field3696[arg1]) + var5;
        } else {
            var6 = (super.field4144[var3] & class215.field3696[var4]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!he", name = "o", descriptor = "(B)V")
    public final void method1018(byte arg0) {
        int var2 = -39 / ((arg0 - -61) / 37);
        super.field4124 = (this.field2446 + 7) / 8;
        ++field2441;
    }

    @OriginalMember(owner = "client!he", name = "p", descriptor = "(B)I")
    public final int method1019(byte arg0) {
        if (arg0 != 81) {
            return 9;
        } else {
            ++field2437;
            return super.field4144[super.field4124++] + -this.field2433.method1474(arg0 ^ 47) & 255;
        }
    }

    @OriginalMember(owner = "client!he", name = "s", descriptor = "(I)V")
    public final void method1020(int arg0) {
        ++field2443;
        if (arg0 == 23608) {
            this.field2446 = super.field4124 * 8;
        }
    }
}
