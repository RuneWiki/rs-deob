import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("CNLPNPVK")
public class class7 extends class54 {

    @OriginalMember(owner = "CNLPNPVK", name = "o", descriptor = "I")
    private int field586 = 3;

    @OriginalMember(owner = "CNLPNPVK", name = "z", descriptor = "Z")
    public boolean field597 = false;

    @OriginalMember(owner = "CNLPNPVK", name = "t", descriptor = "LZSSCYSIO;")
    private class71 field591;

    @OriginalMember(owner = "CNLPNPVK", name = "l", descriptor = "I")
    public int field583;

    @OriginalMember(owner = "CNLPNPVK", name = "p", descriptor = "I")
    public int field587;

    @OriginalMember(owner = "CNLPNPVK", name = "q", descriptor = "I")
    public int field588;

    @OriginalMember(owner = "CNLPNPVK", name = "r", descriptor = "I")
    public int field589;

    @OriginalMember(owner = "CNLPNPVK", name = "F", descriptor = "I")
    public int field603;

    @OriginalMember(owner = "CNLPNPVK", name = "G", descriptor = "I")
    public int field604;

    @OriginalMember(owner = "CNLPNPVK", name = "H", descriptor = "I")
    public int field605;

    @OriginalMember(owner = "CNLPNPVK", name = "I", descriptor = "I")
    public int field606;

    @OriginalMember(owner = "CNLPNPVK", name = "J", descriptor = "I")
    public int field607;

    @OriginalMember(owner = "CNLPNPVK", name = "s", descriptor = "I")
    public int field590;

    @OriginalMember(owner = "CNLPNPVK", name = "u", descriptor = "D")
    public double field592;

    @OriginalMember(owner = "CNLPNPVK", name = "v", descriptor = "D")
    public double field593;

    @OriginalMember(owner = "CNLPNPVK", name = "w", descriptor = "D")
    public double field594;

    @OriginalMember(owner = "CNLPNPVK", name = "A", descriptor = "D")
    private double field598;

    @OriginalMember(owner = "CNLPNPVK", name = "B", descriptor = "D")
    private double field599;

    @OriginalMember(owner = "CNLPNPVK", name = "C", descriptor = "D")
    private double field600;

    @OriginalMember(owner = "CNLPNPVK", name = "D", descriptor = "D")
    private double field601;

    @OriginalMember(owner = "CNLPNPVK", name = "E", descriptor = "D")
    private double field602;

    @OriginalMember(owner = "CNLPNPVK", name = "m", descriptor = "I")
    private int field584;

    @OriginalMember(owner = "CNLPNPVK", name = "n", descriptor = "I")
    private int field585;

    @OriginalMember(owner = "CNLPNPVK", name = "x", descriptor = "I")
    public int field595;

    @OriginalMember(owner = "CNLPNPVK", name = "y", descriptor = "I")
    public int field596;

    @OriginalMember(owner = "CNLPNPVK", name = "<init>", descriptor = "(IIIIIIIIIIIB)V")
    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, byte arg11) {
        this.field591 = class71.field1721[arg10];
        this.field583 = arg2;
        this.field587 = arg5;
        this.field588 = arg4;
        this.field589 = arg0;
        this.field603 = arg3;
        this.field604 = arg6;
        this.field605 = arg1;
        this.field606 = arg7;
        this.field607 = arg9;
        if (arg11 != -5) {
            throw new NullPointerException();
        }
        this.field590 = arg8;
        this.field597 = false;
    }

    @OriginalMember(owner = "CNLPNPVK", name = "a", descriptor = "(II)V")
    public final void method180(int arg0, int arg1) {
        this.field597 = true;
        this.field592 += (double) arg0 * this.field599;
        if (arg1 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field593 += (double) arg0 * this.field600;
        this.field594 += this.field598 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field602;
        this.field602 += (double) arg0 * this.field598;
        this.field595 = (int) (Math.atan2(this.field599, this.field600) * 325.949D) + 1024 & 0x7FF;
        this.field596 = (int) (Math.atan2(this.field602, this.field601) * 325.949D) & 0x7FF;
        if (this.field591.field1725 == null) {
            return;
        }
        this.field585 += arg0;
        while (this.field585 > this.field591.field1725.method226((byte) 6, this.field584)) {
            this.field585 -= this.field591.field1725.method226((byte) 6, this.field584) + 1;
            this.field584++;
            if (this.field584 >= this.field591.field1725.field876) {
                this.field584 = 0;
            }
        }
    }

    @OriginalMember(owner = "CNLPNPVK", name = "a", descriptor = "(B)LCCYECDYX;")
    public final class4 method181(byte arg0) {
        class4 var2 = this.field591.method590();
        if (var2 == null) {
            return null;
        }
        int var3 = -1;
        if (arg0 != 1) {
            throw new NullPointerException();
        }
        boolean var4 = false;
        if (this.field591.field1725 != null) {
            var3 = this.field591.field1725.field877[this.field584];
        }
        class4 var5 = new class4(class41.method383(var3, (byte) 8), -784, var2, false, true);
        if (var3 != -1) {
            var5.method18(true);
            var5.method19(var3, (byte) 106);
            var5.field65 = null;
            var5.field64 = null;
        }
        if (this.field591.field1728 != 128 || this.field591.field1729 != 128) {
            var5.method27(this.field591.field1728, this.field591.field1729, this.field591.field1728, (byte) 6);
        }
        var5.method23(this.field596, true);
        var5.method28(this.field591.field1731 + 64, this.field591.field1732 + 850, -30, -50, -30, true);
        return var5;
    }

    @OriginalMember(owner = "CNLPNPVK", name = "a", descriptor = "(IIIIB)V")
    public final void method182(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (!this.field597) {
            double var6 = (double) (arg2 - this.field587);
            double var8 = (double) (arg0 - this.field588);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field592 = (double) this.field606 * var6 / var10 + (double) this.field587;
            this.field593 = (double) this.field606 * var8 / var10 + (double) this.field588;
            this.field594 = this.field589;
        }
        double var12 = (double) (this.field604 + 1 - arg3);
        this.field599 = ((double) arg2 - this.field592) / var12;
        if (arg4 != -56) {
            this.field586 = 178;
        }
        this.field600 = ((double) arg0 - this.field593) / var12;
        this.field601 = Math.sqrt(this.field600 * this.field600 + this.field599 * this.field599);
        if (!this.field597) {
            this.field602 = -this.field601 * Math.tan((double) this.field605 * 0.02454369D);
        }
        this.field598 = ((double) arg1 - this.field594 - this.field602 * var12) * 2.0D / (var12 * var12);
    }
}
