import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class96 extends class229 {

    @OriginalMember(owner = "client!wc", name = "Mb", descriptor = "Lbe;")
    private static class283 field1601 = class153.method941(-10, "Please wait)3)3)3");

    @OriginalMember(owner = "client!wc", name = "Xb", descriptor = "Z")
    public static boolean field1612 = true;

    @OriginalMember(owner = "client!wc", name = "Vb", descriptor = "Lbe;")
    public static class283 field1610 = field1601;

    @OriginalMember(owner = "client!wc", name = "Jb", descriptor = "I")
    public static int field1598;

    @OriginalMember(owner = "client!wc", name = "Lb", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!wc", name = "Ob", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!wc", name = "Pb", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!wc", name = "Qb", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!wc", name = "Rb", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!wc", name = "Sb", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!wc", name = "Tb", descriptor = "I")
    public static int field1608;

    @OriginalMember(owner = "client!wc", name = "Ub", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!wc", name = "Wb", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!wc", name = "Yb", descriptor = "I")
    private int field1613;

    @OriginalMember(owner = "client!wc", name = "Zb", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!wc", name = "Nb", descriptor = "Lek;")
    public static class172 field1602;

    @OriginalMember(owner = "client!wc", name = "Kb", descriptor = "Loi;")
    private class302 field1599;

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(I)V", line = 4)
    public class96(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(II[BI)V", line = 13)
    public final void method616(int arg0, int arg1, byte[] arg2, int arg3) {
        for (int var5 = arg1; var5 < arg0; var5++) {
            arg2[arg3 + var5] = (byte) (this.field3879[this.field3905++] - this.field1599.method2043((byte) -120));
        }
        field1598++;
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(BI)I", line = 26)
    public final int method617(byte arg0, int arg1) {
        if (arg0 != -21) {
            this.method617((byte) -55, 47);
        }
        int var3 = this.field1613 >> 3;
        field1605++;
        int var4 = 8 - (this.field1613 & 0x7);
        this.field1613 += arg1;
        int var5 = 0;
        while (var4 < arg1) {
            var5 += (this.field3879[var3++] & class111.field1872[var4]) << arg1 - var4;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg1 == var4) {
            var6 = (this.field3879[var3] & class111.field1872[var4]) + var5;
        } else {
            var6 = (this.field3879[var3] >> var4 - arg1 & class111.field1872[arg1]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "(ZI)I", line = 56)
    public static final int method618(boolean arg0, int arg1) {
        field1604++;
        if (arg1 < 0) {
            return 0;
        }
        class74 var2 = (class74) class170.field2860.method1612((long) arg1, 99);
        if (var2 == null) {
            return class112.method736(112, arg1).field3754;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < var2.field1290.length; var4++) {
            if (var2.field1290[var4] == -1) {
                var3++;
            }
        }
        if (!arg0) {
            method618(true, 17);
        }
        return var3 + class112.method736(-55, arg1).field3754 - var2.field1290.length;
    }

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "(BI)I", line = 92)
    public final int method619(byte arg0, int arg1) {
        field1608++;
        if (arg0 != -98) {
            method622((byte) -112);
        }
        return arg1 * 8 - this.field1613;
    }

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "(Z)V", line = 103)
    public final void method620(boolean arg0) {
        field1603++;
        if (!arg0) {
            this.method619((byte) 70, -85);
        }
        this.field3905 = (this.field1613 + 7) / 8;
    }

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "(II)V", line = 115)
    public final void method621(int arg0, int arg1) {
        field1606++;
        this.field3879[this.field3905++] = (byte) (arg0 + this.field1599.method2043((byte) -112));
        if (arg1 != 8) {
            this.field1613 = -86;
        }
    }

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "(B)Z", line = 126)
    public static final boolean method622(byte arg0) {
        if (arg0 == 0) {
            field1611++;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "(I)I", line = 139)
    public final int method623(int arg0) {
        field1600++;
        int var2 = -29 % ((41 - arg0) / 47);
        return this.field3879[this.field3905++] - this.field1599.method2043((byte) -43) & 0xFF;
    }

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "(Z)V", line = 154)
    public final void method624(boolean arg0) {
        this.field1613 = this.field3905 * 8;
        field1609++;
        if (!arg0) {
            this.field1613 = 63;
        }
    }

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "(I)V", line = 170)
    public static void method625(int arg0) {
        if (arg0 == 8) {
            field1601 = null;
            field1602 = null;
            field1610 = null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "([IB)V", line = 187)
    public final void method626(int[] arg0, byte arg1) {
        field1614++;
        this.field1599 = new class302(arg0);
        if (arg1 <= 101) {
            this.method623(94);
        }
    }
}
