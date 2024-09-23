import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("YBXLKULU")
public class class67 extends class22 {

    @OriginalMember(owner = "YBXLKULU", name = "n", descriptor = "B")
    private byte field1694 = 1;

    @OriginalMember(owner = "YBXLKULU", name = "o", descriptor = "Z")
    public boolean field1695 = false;

    @OriginalMember(owner = "YBXLKULU", name = "t", descriptor = "I")
    private int field1700 = 5;

    @OriginalMember(owner = "YBXLKULU", name = "v", descriptor = "LXWNROHZR;")
    private class64 field1702;

    @OriginalMember(owner = "YBXLKULU", name = "u", descriptor = "I")
    public int field1701;

    @OriginalMember(owner = "YBXLKULU", name = "H", descriptor = "I")
    public int field1714;

    @OriginalMember(owner = "YBXLKULU", name = "I", descriptor = "I")
    public int field1715;

    @OriginalMember(owner = "YBXLKULU", name = "J", descriptor = "I")
    public int field1716;

    @OriginalMember(owner = "YBXLKULU", name = "F", descriptor = "I")
    public int field1712;

    @OriginalMember(owner = "YBXLKULU", name = "G", descriptor = "I")
    public int field1713;

    @OriginalMember(owner = "YBXLKULU", name = "y", descriptor = "I")
    public int field1705;

    @OriginalMember(owner = "YBXLKULU", name = "z", descriptor = "I")
    public int field1706;

    @OriginalMember(owner = "YBXLKULU", name = "A", descriptor = "I")
    public int field1707;

    @OriginalMember(owner = "YBXLKULU", name = "K", descriptor = "I")
    public int field1717;

    @OriginalMember(owner = "YBXLKULU", name = "p", descriptor = "D")
    public double field1696;

    @OriginalMember(owner = "YBXLKULU", name = "q", descriptor = "D")
    public double field1697;

    @OriginalMember(owner = "YBXLKULU", name = "r", descriptor = "D")
    public double field1698;

    @OriginalMember(owner = "YBXLKULU", name = "s", descriptor = "D")
    private double field1699;

    @OriginalMember(owner = "YBXLKULU", name = "B", descriptor = "D")
    private double field1708;

    @OriginalMember(owner = "YBXLKULU", name = "C", descriptor = "D")
    private double field1709;

    @OriginalMember(owner = "YBXLKULU", name = "D", descriptor = "D")
    private double field1710;

    @OriginalMember(owner = "YBXLKULU", name = "E", descriptor = "D")
    private double field1711;

    @OriginalMember(owner = "YBXLKULU", name = "w", descriptor = "I")
    public int field1703;

    @OriginalMember(owner = "YBXLKULU", name = "x", descriptor = "I")
    public int field1704;

    @OriginalMember(owner = "YBXLKULU", name = "L", descriptor = "I")
    private int field1718;

    @OriginalMember(owner = "YBXLKULU", name = "M", descriptor = "I")
    private int field1719;

    @OriginalMember(owner = "YBXLKULU", name = "a", descriptor = "(I)LCADBNSXE;")
    public final class3 method40(int arg0) {
        class3 var2 = this.field1702.method589();
        if (var2 == null) {
            return null;
        }
        int var3 = -1;
        if (arg0 >= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (this.field1702.field1669 != null) {
            var3 = this.field1702.field1669.field1572[this.field1718];
        }
        class3 var5 = new class3(false, class8.method215(false, var3), var2, this.field1694, true);
        if (var3 != -1) {
            var5.method18(false);
            var5.method19(var3, (byte) -62);
            var5.field58 = null;
            var5.field57 = null;
        }
        if (this.field1702.field1672 != 128 || this.field1702.field1673 != 128) {
            var5.method27(this.field1702.field1672, 0, this.field1702.field1673, this.field1702.field1672);
        }
        var5.method23(0, this.field1704);
        var5.method28(this.field1702.field1675 + 64, this.field1702.field1676 + 850, -30, -50, -30, true);
        return var5;
    }

    @OriginalMember(owner = "YBXLKULU", name = "a", descriptor = "(BI)V")
    public final void method590(byte arg0, int arg1) {
        this.field1695 = true;
        this.field1696 += (double) arg1 * this.field1708;
        this.field1697 += (double) arg1 * this.field1709;
        if (arg0 != -10) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field1698 += this.field1699 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field1711;
        this.field1711 += (double) arg1 * this.field1699;
        this.field1703 = (int) (Math.atan2(this.field1708, this.field1709) * 325.949D) + 1024 & 0x7FF;
        this.field1704 = (int) (Math.atan2(this.field1711, this.field1710) * 325.949D) & 0x7FF;
        if (this.field1702.field1669 == null) {
            return;
        }
        this.field1719 += arg1;
        while (this.field1719 > this.field1702.field1669.method562((byte) 5, this.field1718)) {
            this.field1719 -= this.field1702.field1669.method562((byte) 5, this.field1718) + 1;
            this.field1718++;
            if (this.field1718 >= this.field1702.field1669.field1571) {
                this.field1718 = 0;
            }
        }
    }

    @OriginalMember(owner = "YBXLKULU", name = "a", descriptor = "(ZIIII)V")
    public final void method591(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!this.field1695) {
            double var6 = (double) (arg4 - this.field1714);
            double var8 = (double) (arg1 - this.field1715);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field1696 = (double) this.field1706 * var6 / var10 + (double) this.field1714;
            this.field1697 = (double) this.field1706 * var8 / var10 + (double) this.field1715;
            this.field1698 = this.field1716;
        }
        double var12 = (double) (this.field1713 + 1 - arg2);
        if (arg0) {
            this.field1700 = 177;
        }
        this.field1708 = ((double) arg4 - this.field1696) / var12;
        this.field1709 = ((double) arg1 - this.field1697) / var12;
        this.field1710 = Math.sqrt(this.field1709 * this.field1709 + this.field1708 * this.field1708);
        if (!this.field1695) {
            this.field1711 = -this.field1710 * Math.tan((double) this.field1705 * 0.02454369D);
        }
        this.field1699 = ((double) arg3 - this.field1698 - this.field1711 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "YBXLKULU", name = "<init>", descriptor = "(IIIIIIIIBIII)V")
    public class67(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9, int arg10, int arg11) {
        this.field1702 = class64.field1665[arg0];
        this.field1701 = arg7;
        if (arg8 != -53) {
            throw new NullPointerException();
        }
        this.field1714 = arg6;
        this.field1715 = arg4;
        this.field1716 = arg11;
        this.field1712 = arg1;
        this.field1713 = arg2;
        this.field1705 = arg5;
        this.field1706 = arg9;
        this.field1707 = arg3;
        this.field1717 = arg10;
        this.field1695 = false;
    }
}
