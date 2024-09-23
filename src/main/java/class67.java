import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("YRQDGGKN")
public class class67 extends class53 {

    @OriginalMember(owner = "YRQDGGKN", name = "l", descriptor = "B")
    private byte field1605 = 0;

    @OriginalMember(owner = "YRQDGGKN", name = "q", descriptor = "Z")
    public boolean field1610 = false;

    @OriginalMember(owner = "YRQDGGKN", name = "r", descriptor = "I")
    private int field1611 = -15;

    @OriginalMember(owner = "YRQDGGKN", name = "A", descriptor = "LFPSNPMMW;")
    private class17 field1620;

    @OriginalMember(owner = "YRQDGGKN", name = "I", descriptor = "I")
    public int field1628;

    @OriginalMember(owner = "YRQDGGKN", name = "E", descriptor = "I")
    public int field1624;

    @OriginalMember(owner = "YRQDGGKN", name = "F", descriptor = "I")
    public int field1625;

    @OriginalMember(owner = "YRQDGGKN", name = "G", descriptor = "I")
    public int field1626;

    @OriginalMember(owner = "YRQDGGKN", name = "s", descriptor = "I")
    public int field1612;

    @OriginalMember(owner = "YRQDGGKN", name = "t", descriptor = "I")
    public int field1613;

    @OriginalMember(owner = "YRQDGGKN", name = "J", descriptor = "I")
    public int field1629;

    @OriginalMember(owner = "YRQDGGKN", name = "K", descriptor = "I")
    public int field1630;

    @OriginalMember(owner = "YRQDGGKN", name = "L", descriptor = "I")
    public int field1631;

    @OriginalMember(owner = "YRQDGGKN", name = "H", descriptor = "I")
    public int field1627;

    @OriginalMember(owner = "YRQDGGKN", name = "m", descriptor = "D")
    private double field1606;

    @OriginalMember(owner = "YRQDGGKN", name = "n", descriptor = "D")
    private double field1607;

    @OriginalMember(owner = "YRQDGGKN", name = "o", descriptor = "D")
    private double field1608;

    @OriginalMember(owner = "YRQDGGKN", name = "p", descriptor = "D")
    private double field1609;

    @OriginalMember(owner = "YRQDGGKN", name = "x", descriptor = "D")
    public double field1617;

    @OriginalMember(owner = "YRQDGGKN", name = "y", descriptor = "D")
    public double field1618;

    @OriginalMember(owner = "YRQDGGKN", name = "z", descriptor = "D")
    public double field1619;

    @OriginalMember(owner = "YRQDGGKN", name = "B", descriptor = "D")
    private double field1621;

    @OriginalMember(owner = "YRQDGGKN", name = "u", descriptor = "I")
    private int field1614;

    @OriginalMember(owner = "YRQDGGKN", name = "v", descriptor = "I")
    private int field1615;

    @OriginalMember(owner = "YRQDGGKN", name = "w", descriptor = "I")
    private int field1616;

    @OriginalMember(owner = "YRQDGGKN", name = "C", descriptor = "I")
    public int field1622;

    @OriginalMember(owner = "YRQDGGKN", name = "D", descriptor = "I")
    public int field1623;

    @OriginalMember(owner = "YRQDGGKN", name = "a", descriptor = "(IIZII)V")
    public final void method535(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (!this.field1610) {
            double var6 = (double) (arg1 - this.field1624);
            double var8 = (double) (arg0 - this.field1625);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field1617 = (double) this.field1630 * var6 / var10 + (double) this.field1624;
            this.field1618 = (double) this.field1630 * var8 / var10 + (double) this.field1625;
            this.field1619 = this.field1626;
        }
        double var12 = (double) (this.field1613 + 1 - arg4);
        this.field1606 = ((double) arg1 - this.field1617) / var12;
        this.field1607 = ((double) arg0 - this.field1618) / var12;
        this.field1608 = Math.sqrt(this.field1607 * this.field1607 + this.field1606 * this.field1606);
        if (!this.field1610) {
            this.field1609 = -this.field1608 * Math.tan((double) this.field1629 * 0.02454369D);
        }
        this.field1621 = ((double) arg3 - this.field1619 - this.field1609 * var12) * 2.0D / (var12 * var12);
        if (arg2) {
            ;
        }
    }

    @OriginalMember(owner = "YRQDGGKN", name = "<init>", descriptor = "(IIIIIIIIIIBI)V")
    public class67(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, byte arg10, int arg11) {
        this.field1620 = class17.field725[arg3];
        this.field1628 = arg6;
        this.field1624 = arg8;
        this.field1625 = arg7;
        this.field1626 = arg4;
        this.field1612 = arg11;
        this.field1613 = arg5;
        this.field1629 = arg0;
        this.field1630 = arg2;
        if (this.field1605 != arg10) {
            this.field1611 = -133;
        }
        this.field1631 = arg9;
        this.field1627 = arg1;
        this.field1610 = false;
    }

    @OriginalMember(owner = "YRQDGGKN", name = "a", descriptor = "(II)V")
    public final void method536(int arg0, int arg1) {
        this.field1610 = true;
        this.field1617 += (double) arg0 * this.field1606;
        this.field1618 += (double) arg0 * this.field1607;
        this.field1619 += this.field1621 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1609;
        this.field1609 += (double) arg0 * this.field1621;
        if (arg1 != 1) {
            return;
        }
        this.field1622 = (int) (Math.atan2(this.field1606, this.field1607) * 325.949D) + 1024 & 0x7FF;
        this.field1623 = (int) (Math.atan2(this.field1609, this.field1608) * 325.949D) & 0x7FF;
        if (this.field1620.field729 == null) {
            return;
        }
        this.field1615 += arg0;
        while (this.field1615 > this.field1620.field729.method227(956, this.field1614)) {
            this.field1615 -= this.field1620.field729.method227(956, this.field1614) + 1;
            this.field1614++;
            if (this.field1614 >= this.field1620.field729.field814) {
                this.field1614 = 0;
            }
        }
    }

    @OriginalMember(owner = "YRQDGGKN", name = "a", descriptor = "(Z)LITSMSHJO;")
    public final class27 method2(boolean arg0) {
        class27 var2 = this.field1620.method206();
        if (var2 == null) {
            return null;
        }
        int var3 = -1;
        if (this.field1620.field729 != null) {
            var3 = this.field1620.field729.field815[this.field1614];
        }
        class27 var4 = new class27(var2, class49.method401(var3, 0), false, (byte) 85, true);
        if (var3 != -1) {
            var4.method245(0);
            var4.method246(-1851, var3);
            var4.field895 = null;
            var4.field894 = null;
        }
        if (this.field1620.field732 != 128 || this.field1620.field733 != 128) {
            var4.method254(this.field1620.field732, this.field1620.field732, this.field1620.field733, 619);
        }
        var4.method250(this.field1623, false);
        if (!arg0) {
            this.field1616 = -301;
        }
        var4.method255(this.field1620.field735 + 64, this.field1620.field736 + 850, -30, -50, -30, true);
        return var4;
    }
}
