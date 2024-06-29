import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!WNPAFFHH")
public class class64 extends class3 {

    @OriginalMember(owner = "client!WNPAFFHH", name = "x", descriptor = "Z")
    private boolean field1597 = true;

    @OriginalMember(owner = "client!WNPAFFHH", name = "B", descriptor = "Z")
    public boolean field1601 = false;

    @OriginalMember(owner = "client!WNPAFFHH", name = "J", descriptor = "Z")
    private boolean field1609 = true;

    @OriginalMember(owner = "client!WNPAFFHH", name = "t", descriptor = "LTYXORIIC;")
    private class54 field1593;

    @OriginalMember(owner = "client!WNPAFFHH", name = "o", descriptor = "I")
    public int field1588;

    @OriginalMember(owner = "client!WNPAFFHH", name = "k", descriptor = "I")
    public int field1584;

    @OriginalMember(owner = "client!WNPAFFHH", name = "l", descriptor = "I")
    public int field1585;

    @OriginalMember(owner = "client!WNPAFFHH", name = "m", descriptor = "I")
    public int field1586;

    @OriginalMember(owner = "client!WNPAFFHH", name = "H", descriptor = "I")
    public int field1607;

    @OriginalMember(owner = "client!WNPAFFHH", name = "I", descriptor = "I")
    public int field1608;

    @OriginalMember(owner = "client!WNPAFFHH", name = "E", descriptor = "I")
    public int field1604;

    @OriginalMember(owner = "client!WNPAFFHH", name = "F", descriptor = "I")
    public int field1605;

    @OriginalMember(owner = "client!WNPAFFHH", name = "G", descriptor = "I")
    public int field1606;

    @OriginalMember(owner = "client!WNPAFFHH", name = "n", descriptor = "I")
    public int field1587;

    @OriginalMember(owner = "client!WNPAFFHH", name = "p", descriptor = "D")
    private double field1589;

    @OriginalMember(owner = "client!WNPAFFHH", name = "q", descriptor = "D")
    private double field1590;

    @OriginalMember(owner = "client!WNPAFFHH", name = "r", descriptor = "D")
    private double field1591;

    @OriginalMember(owner = "client!WNPAFFHH", name = "s", descriptor = "D")
    private double field1592;

    @OriginalMember(owner = "client!WNPAFFHH", name = "u", descriptor = "D")
    public double field1594;

    @OriginalMember(owner = "client!WNPAFFHH", name = "v", descriptor = "D")
    public double field1595;

    @OriginalMember(owner = "client!WNPAFFHH", name = "w", descriptor = "D")
    public double field1596;

    @OriginalMember(owner = "client!WNPAFFHH", name = "y", descriptor = "D")
    private double field1598;

    @OriginalMember(owner = "client!WNPAFFHH", name = "z", descriptor = "I")
    public int field1599;

    @OriginalMember(owner = "client!WNPAFFHH", name = "A", descriptor = "I")
    public int field1600;

    @OriginalMember(owner = "client!WNPAFFHH", name = "C", descriptor = "I")
    private int field1602;

    @OriginalMember(owner = "client!WNPAFFHH", name = "D", descriptor = "I")
    private int field1603;

    @OriginalMember(owner = "client!WNPAFFHH", name = "a", descriptor = "(II)V")
    public final void method540(int arg0, int arg1) {
        this.field1601 = true;
        this.field1594 += (double) arg0 * this.field1589;
        this.field1595 += (double) arg0 * this.field1590;
        this.field1596 += this.field1598 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1592;
        if (arg1 < 0 || arg1 > 0) {
            this.field1609 = !this.field1609;
        }
        this.field1592 += (double) arg0 * this.field1598;
        this.field1599 = (int) (Math.atan2(this.field1589, this.field1590) * 325.949D) + 1024 & 0x7FF;
        this.field1600 = (int) (Math.atan2(this.field1592, this.field1591) * 325.949D) & 0x7FF;
        if (this.field1593.field1411 == null) {
            return;
        }
        this.field1603 += arg0;
        while (this.field1603 > this.field1593.field1411.method390(this.field1602, (byte) -99)) {
            this.field1603 -= this.field1593.field1411.method390(this.field1602, (byte) -99);
            this.field1602++;
            if (this.field1602 >= this.field1593.field1411.field1148) {
                this.field1602 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!WNPAFFHH", name = "a", descriptor = "(IIIBI)V")
    public final void method541(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 != 8) {
            return;
        }
        if (!this.field1601) {
            double var6 = (double) (arg1 - this.field1584);
            double var8 = (double) (arg0 - this.field1585);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field1594 = (double) this.field1605 * var6 / var10 + (double) this.field1584;
            this.field1595 = (double) this.field1605 * var8 / var10 + (double) this.field1585;
            this.field1596 = this.field1586;
        }
        double var12 = (double) (this.field1608 + 1 - arg4);
        this.field1589 = ((double) arg1 - this.field1594) / var12;
        this.field1590 = ((double) arg0 - this.field1595) / var12;
        this.field1591 = Math.sqrt(this.field1590 * this.field1590 + this.field1589 * this.field1589);
        if (!this.field1601) {
            this.field1592 = -this.field1591 * Math.tan((double) this.field1604 * 0.02454369D);
        }
        this.field1598 = ((double) arg2 - this.field1596 - this.field1592 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!WNPAFFHH", name = "<init>", descriptor = "(IIIIIIIBIIII)V")
    public class64(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9, int arg10, int arg11) {
        this.field1593 = class54.field1407[arg10];
        this.field1588 = arg0;
        this.field1584 = arg4;
        this.field1585 = arg2;
        this.field1586 = arg5;
        this.field1607 = arg8;
        this.field1608 = arg9;
        if (arg7 != -30) {
            throw new NullPointerException();
        }
        this.field1604 = arg6;
        this.field1605 = arg3;
        this.field1606 = arg11;
        this.field1587 = arg1;
        this.field1601 = false;
    }

    @OriginalMember(owner = "client!WNPAFFHH", name = "a", descriptor = "(B)LUNLYQRUD;")
    public final class56 method10(byte arg0) {
        if (arg0 != 93) {
            this.field1597 = !this.field1597;
        }
        class56 var2 = this.field1593.method436();
        if (var2 == null) {
            return null;
        }
        int var3 = -1;
        if (this.field1593.field1411 != null) {
            var3 = this.field1593.field1411.field1149[this.field1602];
        }
        class56 var4 = new class56(true, var2, false, 8, class6.method178(var3, 688));
        if (var3 != -1) {
            var4.method449(956);
            var4.method450(936, var3);
            var4.field1466 = null;
            var4.field1465 = null;
        }
        if (this.field1593.field1414 != 128 || this.field1593.field1415 != 128) {
            var4.method458(this.field1593.field1414, this.field1593.field1415, false, this.field1593.field1414);
        }
        var4.method454(0, this.field1600);
        var4.method459(this.field1593.field1417 + 64, this.field1593.field1418 + 850, -30, -50, -30, true);
        return var4;
    }
}
