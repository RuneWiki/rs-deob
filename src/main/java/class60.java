import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!VVKZWHMC")
public class class60 extends class20 {

    @OriginalMember(owner = "client!VVKZWHMC", name = "w", descriptor = "Z")
    public boolean field1579 = false;

    @OriginalMember(owner = "client!VVKZWHMC", name = "x", descriptor = "Z")
    private boolean field1580 = false;

    @OriginalMember(owner = "client!VVKZWHMC", name = "A", descriptor = "B")
    private byte field1583 = -8;

    @OriginalMember(owner = "client!VVKZWHMC", name = "y", descriptor = "LOPHZBIVR;")
    private class44 field1581;

    @OriginalMember(owner = "client!VVKZWHMC", name = "o", descriptor = "I")
    public int field1571;

    @OriginalMember(owner = "client!VVKZWHMC", name = "k", descriptor = "I")
    public int field1567;

    @OriginalMember(owner = "client!VVKZWHMC", name = "l", descriptor = "I")
    public int field1568;

    @OriginalMember(owner = "client!VVKZWHMC", name = "m", descriptor = "I")
    public int field1569;

    @OriginalMember(owner = "client!VVKZWHMC", name = "u", descriptor = "I")
    public int field1577;

    @OriginalMember(owner = "client!VVKZWHMC", name = "v", descriptor = "I")
    public int field1578;

    @OriginalMember(owner = "client!VVKZWHMC", name = "p", descriptor = "I")
    public int field1572;

    @OriginalMember(owner = "client!VVKZWHMC", name = "q", descriptor = "I")
    public int field1573;

    @OriginalMember(owner = "client!VVKZWHMC", name = "r", descriptor = "I")
    public int field1574;

    @OriginalMember(owner = "client!VVKZWHMC", name = "n", descriptor = "I")
    public int field1570;

    @OriginalMember(owner = "client!VVKZWHMC", name = "z", descriptor = "D")
    private double field1582;

    @OriginalMember(owner = "client!VVKZWHMC", name = "D", descriptor = "D")
    private double field1586;

    @OriginalMember(owner = "client!VVKZWHMC", name = "E", descriptor = "D")
    private double field1587;

    @OriginalMember(owner = "client!VVKZWHMC", name = "F", descriptor = "D")
    private double field1588;

    @OriginalMember(owner = "client!VVKZWHMC", name = "G", descriptor = "D")
    private double field1589;

    @OriginalMember(owner = "client!VVKZWHMC", name = "H", descriptor = "D")
    public double field1590;

    @OriginalMember(owner = "client!VVKZWHMC", name = "I", descriptor = "D")
    public double field1591;

    @OriginalMember(owner = "client!VVKZWHMC", name = "J", descriptor = "D")
    public double field1592;

    @OriginalMember(owner = "client!VVKZWHMC", name = "s", descriptor = "I")
    private int field1575;

    @OriginalMember(owner = "client!VVKZWHMC", name = "t", descriptor = "I")
    private int field1576;

    @OriginalMember(owner = "client!VVKZWHMC", name = "B", descriptor = "I")
    public int field1584;

    @OriginalMember(owner = "client!VVKZWHMC", name = "C", descriptor = "I")
    public int field1585;

    @OriginalMember(owner = "client!VVKZWHMC", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
    public class60(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        this.field1581 = class44.field1269[arg11];
        this.field1571 = arg0;
        this.field1567 = arg3;
        this.field1568 = arg7;
        this.field1569 = arg2;
        this.field1577 = arg8;
        this.field1578 = arg1;
        this.field1572 = arg5;
        this.field1573 = arg4;
        this.field1574 = arg10;
        if (arg9 != -33265) {
            for (int var13 = 1; var13 > 0; var13++) {
            }
        }
        this.field1570 = arg6;
        this.field1579 = false;
    }

    @OriginalMember(owner = "client!VVKZWHMC", name = "a", descriptor = "(IIIII)V")
    public final void method538(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!this.field1579) {
            double var6 = (double) (arg2 - this.field1567);
            double var8 = (double) (arg1 - this.field1568);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field1590 = (double) this.field1573 * var6 / var10 + (double) this.field1567;
            this.field1591 = (double) this.field1573 * var8 / var10 + (double) this.field1568;
            this.field1592 = this.field1569;
        }
        double var12 = (double) (this.field1578 + 1 - arg3);
        this.field1586 = ((double) arg2 - this.field1590) / var12;
        this.field1587 = ((double) arg1 - this.field1591) / var12;
        if (arg0 != -20299) {
            this.field1580 = !this.field1580;
        }
        this.field1588 = Math.sqrt(this.field1587 * this.field1587 + this.field1586 * this.field1586);
        if (!this.field1579) {
            this.field1589 = -this.field1588 * Math.tan((double) this.field1572 * 0.02454369D);
        }
        this.field1582 = ((double) arg4 - this.field1592 - this.field1589 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!VVKZWHMC", name = "a", descriptor = "(II)V")
    public final void method539(int arg0, int arg1) {
        if (arg0 >= 0) {
            this.field1580 = !this.field1580;
        }
        this.field1579 = true;
        this.field1590 += (double) arg1 * this.field1586;
        this.field1591 += (double) arg1 * this.field1587;
        this.field1592 += this.field1582 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field1589;
        this.field1589 += (double) arg1 * this.field1582;
        this.field1584 = (int) (Math.atan2(this.field1586, this.field1587) * 325.949D) + 1024 & 0x7FF;
        this.field1585 = (int) (Math.atan2(this.field1589, this.field1588) * 325.949D) & 0x7FF;
        if (this.field1581.field1273 == null) {
            return;
        }
        this.field1576 += arg1;
        while (this.field1576 > this.field1581.field1273.method451(13126, this.field1575)) {
            this.field1576 -= this.field1581.field1273.method451(13126, this.field1575) + 1;
            this.field1575++;
            if (this.field1575 >= this.field1581.field1273.field1337) {
                this.field1575 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!VVKZWHMC", name = "a", descriptor = "(I)LIRLTEWJP;")
    public final class26 method168(int arg0) {
        if (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        class26 var3 = this.field1581.method435();
        if (var3 == null) {
            return null;
        }
        int var4 = -1;
        if (this.field1581.field1273 != null) {
            var4 = this.field1581.field1273.field1338[this.field1575];
        }
        class26 var5 = new class26(var3, false, 0, class17.method211(var4, 47525), true);
        if (var4 != -1) {
            var5.method288(49427);
            var5.method289(var4, true);
            var5.field1023 = null;
            var5.field1022 = null;
        }
        if (this.field1581.field1276 != 128 || this.field1581.field1277 != 128) {
            var5.method297(this.field1581.field1276, this.field1583, this.field1581.field1277, this.field1581.field1276);
        }
        var5.method293(this.field1585, (byte) 6);
        var5.method298(this.field1581.field1279 + 64, this.field1581.field1280 + 850, -30, -50, -30, true);
        return var5;
    }
}
