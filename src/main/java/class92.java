import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class92 extends class1 {

    @OriginalMember(owner = "client!ie", name = "hb", descriptor = "I")
    private int field1675 = 4096;

    @OriginalMember(owner = "client!ie", name = "nb", descriptor = "I")
    private int field1681 = 4096;

    @OriginalMember(owner = "client!ie", name = "kb", descriptor = "I")
    private int field1678 = 4096;

    @OriginalMember(owner = "client!ie", name = "ob", descriptor = "Loc;")
    public static class151 field1682 = class137.method873(2, "Ihr Spielkonto wurde deaktiviert)3");

    @OriginalMember(owner = "client!ie", name = "ib", descriptor = "Loc;")
    public static class151 field1676 = class137.method873(2, ":tradereq:");

    @OriginalMember(owner = "client!ie", name = "gb", descriptor = "Loc;")
    public static class151 field1674 = class137.method873(2, "Bitte benutzen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!ie", name = "pb", descriptor = "Loc;")
    public static class151 field1683 = class137.method873(2, "sich mit einer anderen Welt zu verbinden)3");

    @OriginalMember(owner = "client!ie", name = "rb", descriptor = "I")
    public static int field1685 = 0;

    @OriginalMember(owner = "client!ie", name = "jb", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!ie", name = "lb", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!ie", name = "mb", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!ie", name = "qb", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IILwa;)V")
    public final void method13(int arg0, int arg1, class229 arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    this.field1681 = arg2.method1490((byte) 73);
                }
            } else {
                this.field1675 = arg2.method1490((byte) 73);
            }
        } else {
            this.field1678 = arg2.method1490((byte) 73);
        }
        if (arg0 != 0) {
            field1682 = null;
        }
        ++field1680;
    }

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "(B)V")
    public static void method582(byte arg0) {
        field1674 = null;
        field1683 = null;
        field1682 = null;
        field1676 = null;
        if (arg0 <= 113) {
            field1676 = null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "()V")
    public class92() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(II)[[I")
    public final int[][] method14(int arg0, int arg1) {
        if (arg1 != -81) {
            return null;
        } else {
            int[][] var3 = super.field13.method578(arg0, -1);
            if (super.field13.field1658) {
                int[][] var4 = this.method8(0, (byte) -102, arg0);
                int[] var5 = var4[0];
                int[] var6 = var4[2];
                int[] var7 = var3[0];
                int[] var8 = var4[1];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~var11 > ~class202.field3603; ++var11) {
                    int var12 = var6[var11];
                    int var13 = var5[var11];
                    int var14 = var8[var11];
                    if (~var12 == ~var13 && ~var12 == ~var14) {
                        var7[var11] = this.field1678 * var13 >> 12;
                        var9[var11] = this.field1675 * var12 >> 12;
                        var10[var11] = this.field1681 * var14 >> 12;
                    } else {
                        var7[var11] = this.field1678;
                        var9[var11] = this.field1675;
                        var10[var11] = this.field1681;
                    }
                }
            }
            ++field1684;
            return var3;
        }
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(II)I")
    public static final int method583(int arg0, int arg1) {
        ++field1677;
        if (arg0 != 127) {
            method583(-10, 110);
        }
        return arg1 & 127;
    }
}
