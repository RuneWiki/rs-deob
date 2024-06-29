import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!YFDAHBXI")
public class class68 extends class50 {

    @OriginalMember(owner = "client!YFDAHBXI", name = "n", descriptor = "I")
    private int field1677 = -479;

    @OriginalMember(owner = "client!YFDAHBXI", name = "H", descriptor = "Z")
    private boolean field1697 = false;

    @OriginalMember(owner = "client!YFDAHBXI", name = "L", descriptor = "Z")
    public boolean field1701 = false;

    @OriginalMember(owner = "client!YFDAHBXI", name = "B", descriptor = "LPHXJLMVH;")
    private class41 field1691;

    @OriginalMember(owner = "client!YFDAHBXI", name = "I", descriptor = "I")
    public int field1698;

    @OriginalMember(owner = "client!YFDAHBXI", name = "u", descriptor = "I")
    public int field1684;

    @OriginalMember(owner = "client!YFDAHBXI", name = "v", descriptor = "I")
    public int field1685;

    @OriginalMember(owner = "client!YFDAHBXI", name = "w", descriptor = "I")
    public int field1686;

    @OriginalMember(owner = "client!YFDAHBXI", name = "F", descriptor = "I")
    public int field1695;

    @OriginalMember(owner = "client!YFDAHBXI", name = "G", descriptor = "I")
    public int field1696;

    @OriginalMember(owner = "client!YFDAHBXI", name = "y", descriptor = "I")
    public int field1688;

    @OriginalMember(owner = "client!YFDAHBXI", name = "z", descriptor = "I")
    public int field1689;

    @OriginalMember(owner = "client!YFDAHBXI", name = "A", descriptor = "I")
    public int field1690;

    @OriginalMember(owner = "client!YFDAHBXI", name = "x", descriptor = "I")
    public int field1687;

    @OriginalMember(owner = "client!YFDAHBXI", name = "o", descriptor = "D")
    private double field1678;

    @OriginalMember(owner = "client!YFDAHBXI", name = "p", descriptor = "D")
    private double field1679;

    @OriginalMember(owner = "client!YFDAHBXI", name = "q", descriptor = "D")
    private double field1680;

    @OriginalMember(owner = "client!YFDAHBXI", name = "r", descriptor = "D")
    private double field1681;

    @OriginalMember(owner = "client!YFDAHBXI", name = "C", descriptor = "D")
    public double field1692;

    @OriginalMember(owner = "client!YFDAHBXI", name = "D", descriptor = "D")
    public double field1693;

    @OriginalMember(owner = "client!YFDAHBXI", name = "E", descriptor = "D")
    public double field1694;

    @OriginalMember(owner = "client!YFDAHBXI", name = "M", descriptor = "D")
    private double field1702;

    @OriginalMember(owner = "client!YFDAHBXI", name = "s", descriptor = "I")
    public int field1682;

    @OriginalMember(owner = "client!YFDAHBXI", name = "t", descriptor = "I")
    public int field1683;

    @OriginalMember(owner = "client!YFDAHBXI", name = "J", descriptor = "I")
    private int field1699;

    @OriginalMember(owner = "client!YFDAHBXI", name = "K", descriptor = "I")
    private int field1700;

    @OriginalMember(owner = "client!YFDAHBXI", name = "<init>", descriptor = "(IIIIIIIBIIII)V")
    public class68(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9, int arg10, int arg11) {
        this.field1691 = class41.field1131[arg9];
        this.field1698 = arg10;
        this.field1684 = arg6;
        this.field1685 = arg1;
        this.field1686 = arg2;
        this.field1695 = arg11;
        if (arg7 != 66) {
            throw new NullPointerException();
        }
        this.field1696 = arg8;
        this.field1688 = arg4;
        this.field1689 = arg0;
        this.field1690 = arg5;
        this.field1687 = arg3;
        this.field1701 = false;
    }

    @OriginalMember(owner = "client!YFDAHBXI", name = "a", descriptor = "(II)V")
    public final void method573(int arg0, int arg1) {
        this.field1701 = true;
        this.field1692 += (double) arg1 * this.field1678;
        this.field1693 += (double) arg1 * this.field1679;
        this.field1694 += this.field1702 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field1681;
        this.field1681 += (double) arg1 * this.field1702;
        this.field1682 = (int) (Math.atan2(this.field1678, this.field1679) * 325.949D) + 1024 & 0x7FF;
        this.field1683 = (int) (Math.atan2(this.field1681, this.field1680) * 325.949D) & 0x7FF;
        if (arg0 >= 0) {
            this.field1697 = !this.field1697;
        }
        if (this.field1691.field1135 == null) {
            return;
        }
        this.field1700 += arg1;
        while (this.field1700 > this.field1691.field1135.method256(this.field1699, 642)) {
            this.field1700 -= this.field1691.field1135.method256(this.field1699, 642) + 1;
            this.field1699++;
            if (this.field1699 >= this.field1691.field1135.field924) {
                this.field1699 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!YFDAHBXI", name = "a", descriptor = "(I)LJUQSYEMB;")
    public final class22 method167(int arg0) {
        class22 var2 = this.field1691.method414();
        if (var2 == null) {
            return null;
        }
        int var3 = -1;
        if (this.field1691.field1135 != null) {
            var3 = this.field1691.field1135.field925[this.field1699];
        }
        class22 var4 = new class22(false, true, (byte) 119, var2, class69.method579(true, var3));
        if (var3 != -1) {
            var4.method219(301);
            var4.method220(true, var3);
            var4.field800 = null;
            var4.field799 = null;
        }
        if (this.field1691.field1138 != 128 || this.field1691.field1139 != 128) {
            var4.method228(this.field1691.field1138, this.field1691.field1139, this.field1691.field1138, this.field1677);
        }
        var4.method224(5, this.field1683);
        if (arg0 <= 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        var4.method229(this.field1691.field1141 + 64, this.field1691.field1142 + 850, -30, -50, -30, true);
        return var4;
    }

    @OriginalMember(owner = "client!YFDAHBXI", name = "a", descriptor = "(BIIII)V")
    public final void method574(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != -53) {
            this.field1697 = !this.field1697;
        }
        if (!this.field1701) {
            double var6 = (double) (arg3 - this.field1684);
            double var8 = (double) (arg4 - this.field1685);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field1692 = (double) this.field1689 * var6 / var10 + (double) this.field1684;
            this.field1693 = (double) this.field1689 * var8 / var10 + (double) this.field1685;
            this.field1694 = this.field1686;
        }
        double var12 = (double) (this.field1696 + 1 - arg2);
        this.field1678 = ((double) arg3 - this.field1692) / var12;
        this.field1679 = ((double) arg4 - this.field1693) / var12;
        this.field1680 = Math.sqrt(this.field1679 * this.field1679 + this.field1678 * this.field1678);
        if (!this.field1701) {
            this.field1681 = -this.field1680 * Math.tan((double) this.field1688 * 0.02454369D);
        }
        this.field1702 = ((double) arg1 - this.field1694 - this.field1681 * var12) * 2.0D / (var12 * var12);
    }
}
