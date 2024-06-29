import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class160 extends class127 {

    @OriginalMember(owner = "client!rg", name = "Yb", descriptor = "Lsg;")
    public static class169 field3053 = class165.method1060("Hidden)2", 1536);

    @OriginalMember(owner = "client!rg", name = "Ub", descriptor = "Lsg;")
    public static class169 field3049 = class165.method1060("Gegenstand f-Ur Mitglieder", 1536);

    @OriginalMember(owner = "client!rg", name = "B", descriptor = "I")
    public static int field3042;

    @OriginalMember(owner = "client!rg", name = "Ob", descriptor = "I")
    private int field3043;

    @OriginalMember(owner = "client!rg", name = "Pb", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!rg", name = "Qb", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!rg", name = "Rb", descriptor = "I")
    public static int field3046;

    @OriginalMember(owner = "client!rg", name = "Sb", descriptor = "I")
    public static int field3047;

    @OriginalMember(owner = "client!rg", name = "Vb", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!rg", name = "Wb", descriptor = "I")
    public static int field3051;

    @OriginalMember(owner = "client!rg", name = "Xb", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!rg", name = "Zb", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!rg", name = "ac", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!rg", name = "Tb", descriptor = "Lle;")
    private class104 field3048;

    @OriginalMember(owner = "client!rg", name = "bc", descriptor = "Lbg;")
    public static class18 field3056;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "(IB)V")
    public final void method1024(int arg0, byte arg1) {
        super.field2325[super.field2346++] = (byte) (this.field3048.method616(-1) + arg0);
        ++field3051;
        if (arg1 != -94) {
            this.method1032(-99);
        }
    }

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "(B)V")
    public static void method1025(byte arg0) {
        if (arg0 >= 74) {
            field3049 = null;
            field3053 = null;
            field3056 = null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I[I)V")
    public final void method1026(int arg0, int[] arg1) {
        if (arg0 <= -71) {
            this.field3048 = new class104(arg1);
            ++field3044;
        }
    }

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "(II)I")
    public final int method1027(int arg0, int arg1) {
        ++field3055;
        int var3 = -36 / ((arg0 - -79) / 46);
        return arg1 * 8 + -this.field3043;
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(I)V")
    public class160(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "(II)Z")
    public static final boolean method1028(int arg0, int arg1) {
        if (arg1 < 112) {
            field3049 = null;
        }
        ++field3045;
        return ~arg0 <= -49 && arg0 <= 57;
    }

    @OriginalMember(owner = "client!rg", name = "s", descriptor = "(I)V")
    public final void method1029(int arg0) {
        ++field3046;
        super.field2346 = (this.field3043 + arg0) / 8;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lfb;")
    public static final class49 method1030(Throwable arg0, String arg1) {
        ++field3050;
        class49 var2;
        if (arg0 instanceof class49) {
            var2 = (class49) arg0;
            var2.field884 = var2.field884 + ' ' + arg1;
        } else {
            var2 = new class49(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "(IB)I")
    public final int method1031(int arg0, byte arg1) {
        ++field3054;
        int var3 = this.field3043 >> 3;
        int var4 = 8 - (7 & this.field3043);
        this.field3043 += arg0;
        int var5 = 0;
        while (~arg0 < ~var4) {
            var5 += (class123.field2262[var4] & super.field2325[var3++]) << -var4 + arg0;
            arg0 -= var4;
            var4 = 8;
        }
        int var6 = 113 % ((arg1 - -29) / 45);
        int var7;
        if (~arg0 != ~var4) {
            var7 = (super.field2325[var3] >> -arg0 + var4 & class123.field2262[arg0]) + var5;
        } else {
            var7 = (super.field2325[var3] & class123.field2262[var4]) + var5;
        }
        return var7;
    }

    @OriginalMember(owner = "client!rg", name = "t", descriptor = "(I)I")
    public final int method1032(int arg0) {
        ++field3042;
        int var2 = -101 / ((-8 - arg0) / 47);
        return super.field2325[super.field2346++] + -this.field3048.method616(76) & 255;
    }

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "(Z)V")
    public final void method1033(boolean arg0) {
        if (!arg0) {
            this.field3043 = -69;
        }
        ++field3052;
        this.field3043 = super.field2346 * 8;
    }
}
