import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class89 extends class1 {

    @OriginalMember(owner = "client!ib", name = "hb", descriptor = "I")
    private int field1621 = 0;

    @OriginalMember(owner = "client!ib", name = "pb", descriptor = "I")
    private int field1629 = 4096;

    @OriginalMember(owner = "client!ib", name = "ib", descriptor = "Z")
    public static boolean field1622 = false;

    @OriginalMember(owner = "client!ib", name = "jb", descriptor = "Loc;")
    private static class151 field1623 = class137.method873(2, "scroll:");

    @OriginalMember(owner = "client!ib", name = "gb", descriptor = "Loc;")
    public static class151 field1620 = field1623;

    @OriginalMember(owner = "client!ib", name = "qb", descriptor = "Loc;")
    public static class151 field1630 = class137.method873(2, " loggt sich aus)3");

    @OriginalMember(owner = "client!ib", name = "rb", descriptor = "Loc;")
    public static class151 field1631 = class137.method873(2, "Spieler");

    @OriginalMember(owner = "client!ib", name = "sb", descriptor = "[I")
    public static int[] field1632 = new int[] { 0, 1, 2, 3 };

    @OriginalMember(owner = "client!ib", name = "nb", descriptor = "Loc;")
    public static class151 field1627 = field1623;

    @OriginalMember(owner = "client!ib", name = "kb", descriptor = "Loc;")
    public static class151 field1624 = class137.method873(2, "und loggen sich dann erneut ein)3");

    @OriginalMember(owner = "client!ib", name = "ub", descriptor = "I")
    public static int field1634 = 1;

    @OriginalMember(owner = "client!ib", name = "lb", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!ib", name = "mb", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!ib", name = "ob", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!ib", name = "tb", descriptor = "Lsd;")
    public static class192 field1633;

    @OriginalMember(owner = "client!ib", name = "vb", descriptor = "Luf;")
    public static class214 field1635;

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "()V")
    public class89() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(BI)[I")
    public final int[] method11(byte arg0, int arg1) {
        if (arg0 != 107) {
            method571(false);
        }
        int[] var3 = super.field21.method1182(arg1, -31709);
        ++field1628;
        if (super.field21.field3388) {
            int[] var4 = this.method4(arg1, -110, 0);
            for (int var5 = 0; ~var5 > ~class202.field3603; ++var5) {
                int var6 = var4[var5];
                if (var6 < this.field1621) {
                    var3[var5] = this.field1621;
                } else if (~var6 < ~this.field1629) {
                    var3[var5] = this.field1629;
                } else {
                    var3[var5] = var6;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IILwa;)V")
    public final void method13(int arg0, int arg1, class229 arg2) {
        ++field1626;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    super.field27 = ~arg2.method1475(255) == -2;
                }
            } else {
                this.field1629 = arg2.method1490((byte) 73);
            }
        } else {
            this.field1621 = arg2.method1490((byte) 73);
        }
        if (arg0 != 0) {
            field1622 = false;
        }
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(II)[[I")
    public final int[][] method14(int arg0, int arg1) {
        int[][] var3 = super.field13.method578(arg0, arg1 + 80);
        if (super.field13.field1658) {
            int[][] var4 = this.method8(0, (byte) -114, arg0);
            int[] var5 = var4[2];
            int[] var6 = var4[0];
            int[] var7 = var4[1];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class202.field3603 < ~var11; ++var11) {
                int var12 = var6[var11];
                int var13 = var7[var11];
                int var14 = var5[var11];
                if (~this.field1621 < ~var12) {
                    var8[var11] = this.field1621;
                } else if (this.field1629 < var12) {
                    var8[var11] = this.field1629;
                } else {
                    var8[var11] = var12;
                }
                if (this.field1621 > var13) {
                    var9[var11] = this.field1621;
                } else if (var13 > this.field1629) {
                    var9[var11] = this.field1629;
                } else {
                    var9[var11] = var13;
                }
                if (~this.field1621 < ~var14) {
                    var10[var11] = this.field1621;
                } else if (this.field1629 < var14) {
                    var10[var11] = this.field1629;
                } else {
                    var10[var11] = var14;
                }
            }
        }
        ++field1625;
        if (arg1 != -81) {
            this.method14(104, 57);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(Z)V")
    public static void method571(boolean arg0) {
        field1635 = null;
        field1632 = null;
        field1620 = null;
        if (!arg0) {
            method571(true);
        }
        field1623 = null;
        field1624 = null;
        field1630 = null;
        field1633 = null;
        field1631 = null;
        field1627 = null;
    }
}
