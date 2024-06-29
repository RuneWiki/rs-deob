import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class52 extends class145 {

    @OriginalMember(owner = "client!eg", name = "Vb", descriptor = "Lkh;")
    public static class117 field1063 = class224.method1450((byte) 109, "sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1");

    @OriginalMember(owner = "client!eg", name = "dc", descriptor = "Lkh;")
    public static class117 field1071 = class224.method1450((byte) 115, "Einloggen");

    @OriginalMember(owner = "client!eg", name = "Tb", descriptor = "Lkh;")
    private static class117 field1061 = class224.method1450((byte) -93, "cyan:");

    @OriginalMember(owner = "client!eg", name = "Yb", descriptor = "Lkh;")
    public static class117 field1066 = field1061;

    @OriginalMember(owner = "client!eg", name = "kc", descriptor = "Lkh;")
    public static class117 field1078 = field1061;

    @OriginalMember(owner = "client!eg", name = "Rb", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!eg", name = "Sb", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!eg", name = "Ub", descriptor = "I")
    public static int field1062;

    @OriginalMember(owner = "client!eg", name = "Wb", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!eg", name = "Xb", descriptor = "I")
    private int field1065;

    @OriginalMember(owner = "client!eg", name = "Zb", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!eg", name = "ac", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!eg", name = "bc", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!eg", name = "cc", descriptor = "I")
    public static int field1070;

    @OriginalMember(owner = "client!eg", name = "ec", descriptor = "I")
    public static int field1072;

    @OriginalMember(owner = "client!eg", name = "fc", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!eg", name = "hc", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!eg", name = "jc", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!eg", name = "gc", descriptor = "Lte;")
    private class213 field1074;

    @OriginalMember(owner = "client!eg", name = "ic", descriptor = "[Lkh;")
    public static class117[] field1076;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIBIIIII)V")
    public static final void method394(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field1069;
        int var8 = -arg5 + 2048 & 2047;
        int var9 = 2047 & -arg7 + 2048;
        int var10 = 0;
        int var11 = 0;
        if (arg2 != 45) {
            field1071 = null;
        }
        int var12 = arg4;
        if (~var8 != -1) {
            int var13 = class89.field1650[var8];
            var11 = -arg4 * var13 >> 16;
            int var14 = class89.field1646[var8];
            var12 = arg4 * var14 >> 16;
        }
        if (var9 != 0) {
            int var15 = class89.field1650[var9];
            var10 = var12 * var15 >> 16;
            int var16 = class89.field1646[var9];
            var12 = var12 * var16 >> 16;
        }
        class150.field2726 = arg5;
        class19.field535 = -var10 + arg1;
        class186.field3339 = -var12 + arg0;
        class31.field732 = -var11 + arg3;
        class86.field1626 = arg7;
    }

    @OriginalMember(owner = "client!eg", name = "p", descriptor = "(B)V")
    public final void method395(byte arg0) {
        if (arg0 <= -95) {
            ++field1060;
            this.field1065 = super.field2643 * 8;
        }
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "(IB)I")
    public final int method396(int arg0, byte arg1) {
        ++field1059;
        int var3 = this.field1065 >> 3;
        int var4 = -(7 & this.field1065) + 8;
        int var5 = 0;
        this.field1065 += arg0;
        while (var4 < arg0) {
            var5 += (class171.field3083[var4] & super.field2613[var3++]) << -var4 + arg0;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg0 != var4) {
            var6 = (super.field2613[var3] >> -arg0 + var4 & class171.field3083[arg0]) + var5;
        } else {
            var6 = (super.field2613[var3] & class171.field3083[var4]) + var5;
        }
        if (arg1 != -9) {
            this.method403((byte) -96, (byte[]) null, 118, -108);
        }
        return var6;
    }

    @OriginalMember(owner = "client!eg", name = "q", descriptor = "(I)V")
    public final void method397(int arg0) {
        ++field1070;
        if (arg0 <= 3) {
            field1063 = null;
        }
        super.field2643 = (this.field1065 + 7) / 8;
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(I)V")
    public class52(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!eg", name = "m", descriptor = "(II)I")
    public final int method398(int arg0, int arg1) {
        if (arg1 != 8) {
            this.field1065 = -79;
        }
        ++field1062;
        return arg0 * 8 + -this.field1065;
    }

    @OriginalMember(owner = "client!eg", name = "q", descriptor = "(B)V")
    public static final void method399(byte arg0) {
        class195.field3473.method410((byte) 71);
        if (arg0 <= 19) {
            method401((byte) -28);
        }
        ++field1073;
    }

    @OriginalMember(owner = "client!eg", name = "n", descriptor = "(II)V")
    public final void method400(int arg0, int arg1) {
        super.field2613[super.field2643++] = (byte) (arg0 + this.field1074.method1403(256));
        if (arg1 != 8) {
            field1066 = null;
        }
        ++field1064;
    }

    @OriginalMember(owner = "client!eg", name = "r", descriptor = "(B)V")
    public static void method401(byte arg0) {
        field1061 = null;
        field1066 = null;
        field1078 = null;
        field1063 = null;
        field1076 = null;
        if (arg0 <= -39) {
            field1071 = null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "([IB)V")
    public final void method402(int[] arg0, byte arg1) {
        if (arg1 == 92) {
            this.field1074 = new class213(arg0);
            ++field1077;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(B[BII)V")
    public final void method403(byte arg0, byte[] arg1, int arg2, int arg3) {
        int var5 = -34 % ((12 - arg0) / 36);
        for (int var6 = 0; ~arg3 < ~var6; ++var6) {
            arg1[arg2 + var6] = (byte) (super.field2613[super.field2643++] + -this.field1074.method1403(256));
        }
        ++field1067;
    }

    @OriginalMember(owner = "client!eg", name = "r", descriptor = "(I)I")
    public final int method404(int arg0) {
        ++field1075;
        return arg0 != 255 ? 84 : 255 & super.field2613[super.field2643++] - this.field1074.method1403(256);
    }
}
