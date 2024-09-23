import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("VJJXMLOH")
public class class66 extends class18 {

    @OriginalMember(owner = "VJJXMLOH", name = "J", descriptor = "Z")
    public boolean field1676 = false;

    @OriginalMember(owner = "VJJXMLOH", name = "x", descriptor = "LUYLUCQNM;")
    private class63 field1664;

    @OriginalMember(owner = "VJJXMLOH", name = "I", descriptor = "I")
    public int field1675;

    @OriginalMember(owner = "VJJXMLOH", name = "m", descriptor = "I")
    public int field1653;

    @OriginalMember(owner = "VJJXMLOH", name = "n", descriptor = "I")
    public int field1654;

    @OriginalMember(owner = "VJJXMLOH", name = "o", descriptor = "I")
    public int field1655;

    @OriginalMember(owner = "VJJXMLOH", name = "s", descriptor = "I")
    public int field1659;

    @OriginalMember(owner = "VJJXMLOH", name = "t", descriptor = "I")
    public int field1660;

    @OriginalMember(owner = "VJJXMLOH", name = "u", descriptor = "I")
    public int field1661;

    @OriginalMember(owner = "VJJXMLOH", name = "v", descriptor = "I")
    public int field1662;

    @OriginalMember(owner = "VJJXMLOH", name = "w", descriptor = "I")
    public int field1663;

    @OriginalMember(owner = "VJJXMLOH", name = "p", descriptor = "I")
    public int field1656;

    @OriginalMember(owner = "VJJXMLOH", name = "y", descriptor = "D")
    private double field1665;

    @OriginalMember(owner = "VJJXMLOH", name = "z", descriptor = "D")
    private double field1666;

    @OriginalMember(owner = "VJJXMLOH", name = "A", descriptor = "D")
    private double field1667;

    @OriginalMember(owner = "VJJXMLOH", name = "B", descriptor = "D")
    private double field1668;

    @OriginalMember(owner = "VJJXMLOH", name = "C", descriptor = "D")
    private double field1669;

    @OriginalMember(owner = "VJJXMLOH", name = "D", descriptor = "D")
    public double field1670;

    @OriginalMember(owner = "VJJXMLOH", name = "E", descriptor = "D")
    public double field1671;

    @OriginalMember(owner = "VJJXMLOH", name = "F", descriptor = "D")
    public double field1672;

    @OriginalMember(owner = "VJJXMLOH", name = "q", descriptor = "I")
    private int field1657;

    @OriginalMember(owner = "VJJXMLOH", name = "r", descriptor = "I")
    private int field1658;

    @OriginalMember(owner = "VJJXMLOH", name = "G", descriptor = "I")
    public int field1673;

    @OriginalMember(owner = "VJJXMLOH", name = "H", descriptor = "I")
    public int field1674;

    @OriginalMember(owner = "VJJXMLOH", name = "a", descriptor = "(IIIII)V")
    public final void method576(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!this.field1676) {
            double var6 = (double) (arg1 - this.field1653);
            double var8 = (double) (arg2 - this.field1654);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field1670 = (double) this.field1662 * var6 / var10 + (double) this.field1653;
            this.field1671 = (double) this.field1662 * var8 / var10 + (double) this.field1654;
            this.field1672 = this.field1655;
        }
        double var12 = (double) (this.field1660 + 1 - arg4);
        this.field1665 = ((double) arg1 - this.field1670) / var12;
        this.field1666 = ((double) arg2 - this.field1671) / var12;
        this.field1667 = Math.sqrt(this.field1666 * this.field1666 + this.field1665 * this.field1665);
        if (!this.field1676) {
            this.field1668 = -this.field1667 * Math.tan((double) this.field1661 * 0.02454369D);
        }
        this.field1669 = ((double) arg0 - this.field1672 - this.field1668 * var12) * 2.0D / (var12 * var12);
        int var14 = 99 / arg3;
    }

    @OriginalMember(owner = "VJJXMLOH", name = "a", descriptor = "(I)LGFYXEFQY;")
    public final class21 method294(int arg0) {
        class21 var2 = this.field1664.method564();
        int var3 = 96 / arg0;
        if (var2 == null) {
            return null;
        }
        int var4 = -1;
        if (this.field1664.field1592 != null) {
            var4 = this.field1664.field1592.field1197[this.field1657];
        }
        class21 var5 = new class21((byte) 72, class14.method282(var4, false), var2, true, false);
        if (var4 != -1) {
            var5.method348(false);
            var5.method349(90, var4);
            var5.field917 = null;
            var5.field916 = null;
        }
        if (this.field1664.field1595 != 128 || this.field1664.field1596 != 128) {
            var5.method357((byte) -10, this.field1664.field1595, this.field1664.field1595, this.field1664.field1596);
        }
        var5.method353(7336, this.field1674);
        var5.method358(this.field1664.field1598 + 64, this.field1664.field1599 + 850, -30, -50, -30, true);
        return var5;
    }

    @OriginalMember(owner = "VJJXMLOH", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
    public class66(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        this.field1664 = class63.field1588[arg6];
        this.field1675 = arg11;
        this.field1653 = arg1;
        this.field1654 = arg8;
        this.field1655 = arg2;
        this.field1659 = arg10;
        this.field1660 = arg3;
        if (arg4 >= 0) {
            throw new NullPointerException();
        }
        this.field1661 = arg7;
        this.field1662 = arg9;
        this.field1663 = arg0;
        this.field1656 = arg5;
        this.field1676 = false;
    }

    @OriginalMember(owner = "VJJXMLOH", name = "a", descriptor = "(IB)V")
    public final void method577(int arg0, byte arg1) {
        this.field1676 = true;
        this.field1670 += (double) arg0 * this.field1665;
        this.field1671 += (double) arg0 * this.field1666;
        this.field1672 += this.field1669 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1668;
        if (arg1 != 2) {
            return;
        }
        this.field1668 += (double) arg0 * this.field1669;
        this.field1673 = (int) (Math.atan2(this.field1665, this.field1666) * 325.949D) + 1024 & 0x7FF;
        this.field1674 = (int) (Math.atan2(this.field1668, this.field1667) * 325.949D) & 0x7FF;
        if (this.field1664.field1592 == null) {
            return;
        }
        this.field1658 += arg0;
        while (this.field1658 > this.field1664.field1592.method445(this.field1657, 977)) {
            this.field1658 -= this.field1664.field1592.method445(this.field1657, 977) + 1;
            this.field1657++;
            if (this.field1657 >= this.field1664.field1592.field1196) {
                this.field1657 = 0;
            }
        }
    }
}
