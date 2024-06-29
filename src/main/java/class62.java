import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!XQTFUCRC")
public class class62 extends class20 {

    @OriginalMember(owner = "client!XQTFUCRC", name = "H", descriptor = "Z")
    public boolean field1681 = false;

    @OriginalMember(owner = "client!XQTFUCRC", name = "I", descriptor = "I")
    private int field1682 = 584;

    @OriginalMember(owner = "client!XQTFUCRC", name = "L", descriptor = "B")
    private byte field1685 = 2;

    @OriginalMember(owner = "client!XQTFUCRC", name = "x", descriptor = "LOKJTNJLE;")
    private class38 field1671;

    @OriginalMember(owner = "client!XQTFUCRC", name = "G", descriptor = "I")
    public int field1680;

    @OriginalMember(owner = "client!XQTFUCRC", name = "t", descriptor = "I")
    public int field1667;

    @OriginalMember(owner = "client!XQTFUCRC", name = "u", descriptor = "I")
    public int field1668;

    @OriginalMember(owner = "client!XQTFUCRC", name = "v", descriptor = "I")
    public int field1669;

    @OriginalMember(owner = "client!XQTFUCRC", name = "J", descriptor = "I")
    public int field1683;

    @OriginalMember(owner = "client!XQTFUCRC", name = "K", descriptor = "I")
    public int field1684;

    @OriginalMember(owner = "client!XQTFUCRC", name = "C", descriptor = "I")
    public int field1676;

    @OriginalMember(owner = "client!XQTFUCRC", name = "D", descriptor = "I")
    public int field1677;

    @OriginalMember(owner = "client!XQTFUCRC", name = "E", descriptor = "I")
    public int field1678;

    @OriginalMember(owner = "client!XQTFUCRC", name = "w", descriptor = "I")
    public int field1670;

    @OriginalMember(owner = "client!XQTFUCRC", name = "o", descriptor = "D")
    public double field1662;

    @OriginalMember(owner = "client!XQTFUCRC", name = "p", descriptor = "D")
    public double field1663;

    @OriginalMember(owner = "client!XQTFUCRC", name = "q", descriptor = "D")
    public double field1664;

    @OriginalMember(owner = "client!XQTFUCRC", name = "y", descriptor = "D")
    private double field1672;

    @OriginalMember(owner = "client!XQTFUCRC", name = "z", descriptor = "D")
    private double field1673;

    @OriginalMember(owner = "client!XQTFUCRC", name = "A", descriptor = "D")
    private double field1674;

    @OriginalMember(owner = "client!XQTFUCRC", name = "B", descriptor = "D")
    private double field1675;

    @OriginalMember(owner = "client!XQTFUCRC", name = "F", descriptor = "D")
    private double field1679;

    @OriginalMember(owner = "client!XQTFUCRC", name = "m", descriptor = "I")
    private int field1660;

    @OriginalMember(owner = "client!XQTFUCRC", name = "n", descriptor = "I")
    private int field1661;

    @OriginalMember(owner = "client!XQTFUCRC", name = "r", descriptor = "I")
    public int field1665;

    @OriginalMember(owner = "client!XQTFUCRC", name = "s", descriptor = "I")
    public int field1666;

    @OriginalMember(owner = "client!XQTFUCRC", name = "<init>", descriptor = "(IIIIIIZIIIII)V")
    public class62(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        this.field1671 = class38.field1171[arg0];
        if (arg6) {
            throw new NullPointerException();
        }
        this.field1680 = arg1;
        this.field1667 = arg2;
        this.field1668 = arg4;
        this.field1669 = arg9;
        this.field1683 = arg11;
        this.field1684 = arg10;
        this.field1676 = arg5;
        this.field1677 = arg8;
        this.field1678 = arg3;
        this.field1670 = arg7;
        this.field1681 = false;
    }

    @OriginalMember(owner = "client!XQTFUCRC", name = "a", descriptor = "(IB)V")
    public final void method565(int arg0, byte arg1) {
        this.field1681 = true;
        this.field1662 += (double) arg0 * this.field1672;
        if (arg1 != 10) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field1663 += (double) arg0 * this.field1673;
        this.field1664 += this.field1679 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1675;
        this.field1675 += (double) arg0 * this.field1679;
        this.field1665 = (int) (Math.atan2(this.field1672, this.field1673) * 325.949D) + 1024 & 0x7FF;
        this.field1666 = (int) (Math.atan2(this.field1675, this.field1674) * 325.949D) & 0x7FF;
        if (this.field1671.field1175 == null) {
            return;
        }
        this.field1661 += arg0;
        while (this.field1661 > this.field1671.field1175.method12(this.field1660, 214)) {
            this.field1661 -= this.field1671.field1175.method12(this.field1660, 214);
            this.field1660++;
            if (this.field1660 >= this.field1671.field1175.field78) {
                this.field1660 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!XQTFUCRC", name = "a", descriptor = "(IIIII)V")
    public final void method566(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 0) {
            return;
        }
        if (!this.field1681) {
            double var6 = (double) (arg4 - this.field1667);
            double var8 = (double) (arg1 - this.field1668);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field1662 = (double) this.field1677 * var6 / var10 + (double) this.field1667;
            this.field1663 = (double) this.field1677 * var8 / var10 + (double) this.field1668;
            this.field1664 = this.field1669;
        }
        double var12 = (double) (this.field1684 + 1 - arg0);
        this.field1672 = ((double) arg4 - this.field1662) / var12;
        this.field1673 = ((double) arg1 - this.field1663) / var12;
        this.field1674 = Math.sqrt(this.field1673 * this.field1673 + this.field1672 * this.field1672);
        if (!this.field1681) {
            this.field1675 = -this.field1674 * Math.tan((double) this.field1676 * 0.02454369D);
        }
        this.field1679 = ((double) arg3 - this.field1664 - this.field1675 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!XQTFUCRC", name = "a", descriptor = "(B)LFLXAIVEA;")
    public final class16 method190(byte arg0) {
        class16 var2 = this.field1671.method305();
        if (var2 == null) {
            return null;
        }
        int var3 = -1;
        if (this.field1685 != arg0) {
            this.field1682 = -203;
        }
        if (this.field1671.field1175 != null) {
            var3 = this.field1671.field1175.field79[this.field1660];
        }
        class16 var4 = new class16(var2, class37.method302(true, var3), true, (byte) 8, false);
        if (var3 != -1) {
            var4.method225((byte) -116);
            var4.method226((byte) 8, var3);
            var4.field807 = null;
            var4.field806 = null;
        }
        if (this.field1671.field1178 != 128 || this.field1671.field1179 != 128) {
            var4.method234(this.field1671.field1178, this.field1671.field1178, (byte) 73, this.field1671.field1179);
        }
        var4.method230(this.field1666, 81);
        var4.method235(this.field1671.field1181 + 64, this.field1671.field1182 + 850, -30, -50, -30, true);
        return var4;
    }
}
