import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("CHUIKYUV")
public class class6 extends class71 {

    @OriginalMember(owner = "CHUIKYUV", name = "sb", descriptor = "I")
    private int field84 = 5131;

    @OriginalMember(owner = "CHUIKYUV", name = "tb", descriptor = "Z")
    private boolean field85 = true;

    @OriginalMember(owner = "CHUIKYUV", name = "ub", descriptor = "LAUWOQLEO;")
    public class2 field86;

    @OriginalMember(owner = "CHUIKYUV", name = "a", descriptor = "(Z)Z")
    public final boolean method29(boolean arg0) {
        if (!arg0) {
            throw new NullPointerException();
        } else {
            return this.field86 != null;
        }
    }

    @OriginalMember(owner = "CHUIKYUV", name = "a", descriptor = "(B)LIGXVZOHI;")
    private final class32 method30(byte arg0) {
        if (arg0 == 5) {
            boolean var2 = false;
            if (super.field1694 >= 0 && super.field1697 == 0) {
                int var3 = class5.field67[super.field1694].field69[super.field1695];
                int var4 = -1;
                if (super.field1741 >= 0 && super.field1741 != super.field1718) {
                    var4 = class5.field67[super.field1741].field69[super.field1742];
                }
                return this.field86.method7((byte) 15, var4, var3, class5.field67[super.field1694].field73);
            } else {
                int var5 = -1;
                if (super.field1741 >= 0) {
                    var5 = class5.field67[super.field1741].field69[super.field1742];
                }
                return this.field86.method7((byte) 15, -1, var5, (int[]) null);
            }
        } else {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "CHUIKYUV", name = "a", descriptor = "(I)LIGXVZOHI;")
    public final class32 method25(int arg0) {
        if (this.field86 == null) {
            return null;
        } else {
            class32 var2 = this.method30((byte) 5);
            if (arg0 != 47492) {
                throw new NullPointerException();
            } else if (var2 == null) {
                return null;
            } else {
                super.field1715 = var2.field63;
                if (super.field1747 != -1 && super.field1748 != -1) {
                    class62 var3 = class62.field1570[super.field1747];
                    class32 var4 = var3.method555();
                    if (var4 != null) {
                        int var5 = var3.field1574.field69[super.field1748];
                        class32 var6 = new class32(true, var4, false, class31.method349(var5, this.field84), (byte) 1);
                        var6.method367((byte) 10, 0, 0, -super.field1751);
                        var6.method361(6);
                        var6.method362(33114, var5);
                        var6.field970 = null;
                        var6.field969 = null;
                        if (var3.field1577 != 128 || var3.field1578 != 128) {
                            var6.method370(var3.field1577, var3.field1578, false, var3.field1577);
                        }
                        var6.method371(var3.field1580 + 64, var3.field1581 + 850, -30, -50, -30, true);
                        class32[] var7 = new class32[] { var2, var6 };
                        var2 = new class32(2, var7, true, (byte) 63);
                    }
                }
                if (this.field86.field18 == 1) {
                    var2.field971 = true;
                }
                return var2;
            }
        }
    }
}
