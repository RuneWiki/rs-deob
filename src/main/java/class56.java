import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!SOQRIJPC")
public class class56 extends class67 {

    @OriginalMember(owner = "client!SOQRIJPC", name = "z", descriptor = "Z")
    private boolean field1556 = true;

    @OriginalMember(owner = "client!SOQRIJPC", name = "E", descriptor = "Z")
    public boolean field1561 = false;

    @OriginalMember(owner = "client!SOQRIJPC", name = "F", descriptor = "Z")
    private boolean field1562 = true;

    @OriginalMember(owner = "client!SOQRIJPC", name = "A", descriptor = "LMBSSGBHW;")
    private class34 field1557;

    @OriginalMember(owner = "client!SOQRIJPC", name = "u", descriptor = "I")
    public int field1551;

    @OriginalMember(owner = "client!SOQRIJPC", name = "H", descriptor = "I")
    public int field1564;

    @OriginalMember(owner = "client!SOQRIJPC", name = "I", descriptor = "I")
    public int field1565;

    @OriginalMember(owner = "client!SOQRIJPC", name = "J", descriptor = "I")
    public int field1566;

    @OriginalMember(owner = "client!SOQRIJPC", name = "x", descriptor = "I")
    public int field1554;

    @OriginalMember(owner = "client!SOQRIJPC", name = "y", descriptor = "I")
    public int field1555;

    @OriginalMember(owner = "client!SOQRIJPC", name = "B", descriptor = "I")
    public int field1558;

    @OriginalMember(owner = "client!SOQRIJPC", name = "C", descriptor = "I")
    public int field1559;

    @OriginalMember(owner = "client!SOQRIJPC", name = "D", descriptor = "I")
    public int field1560;

    @OriginalMember(owner = "client!SOQRIJPC", name = "K", descriptor = "I")
    public int field1567;

    @OriginalMember(owner = "client!SOQRIJPC", name = "n", descriptor = "D")
    private double field1544;

    @OriginalMember(owner = "client!SOQRIJPC", name = "o", descriptor = "D")
    private double field1545;

    @OriginalMember(owner = "client!SOQRIJPC", name = "p", descriptor = "D")
    private double field1546;

    @OriginalMember(owner = "client!SOQRIJPC", name = "q", descriptor = "D")
    private double field1547;

    @OriginalMember(owner = "client!SOQRIJPC", name = "r", descriptor = "D")
    public double field1548;

    @OriginalMember(owner = "client!SOQRIJPC", name = "s", descriptor = "D")
    public double field1549;

    @OriginalMember(owner = "client!SOQRIJPC", name = "t", descriptor = "D")
    public double field1550;

    @OriginalMember(owner = "client!SOQRIJPC", name = "G", descriptor = "D")
    private double field1563;

    @OriginalMember(owner = "client!SOQRIJPC", name = "l", descriptor = "I")
    public int field1542;

    @OriginalMember(owner = "client!SOQRIJPC", name = "m", descriptor = "I")
    public int field1543;

    @OriginalMember(owner = "client!SOQRIJPC", name = "v", descriptor = "I")
    private int field1552;

    @OriginalMember(owner = "client!SOQRIJPC", name = "w", descriptor = "I")
    private int field1553;

    @OriginalMember(owner = "client!SOQRIJPC", name = "a", descriptor = "(IZ)V")
    public final void method541(int arg0, boolean arg1) {
        this.field1561 = true;
        this.field1548 += (double) arg0 * this.field1544;
        this.field1549 += (double) arg0 * this.field1545;
        this.field1550 += this.field1563 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1547;
        if (arg1) {
            this.field1562 = !this.field1562;
        }
        this.field1547 += (double) arg0 * this.field1563;
        this.field1542 = (int) (Math.atan2(this.field1544, this.field1545) * 325.949D) + 1024 & 0x7FF;
        this.field1543 = (int) (Math.atan2(this.field1547, this.field1546) * 325.949D) & 0x7FF;
        if (this.field1557.field1057 == null) {
            return;
        }
        this.field1553 += arg0;
        while (this.field1553 > this.field1557.field1057.method308(6, this.field1552)) {
            this.field1553 -= this.field1557.field1057.method308(6, this.field1552) + 1;
            this.field1552++;
            if (this.field1552 >= this.field1557.field1057.field953) {
                this.field1552 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!SOQRIJPC", name = "a", descriptor = "(B)LPDVZPZLT;")
    public final class42 method3(byte arg0) {
        class42 var2 = this.field1557.method343();
        if (var2 == null) {
            return null;
        }
        int var3 = -1;
        if (this.field1557.field1057 != null) {
            var3 = this.field1557.field1057.field954[this.field1552];
        }
        class42 var4 = new class42(var2, true, class71.method602(var3, true), 0, false);
        if (arg0 != 6) {
            throw new NullPointerException();
        }
        if (var3 != -1) {
            var4.method421(0);
            var4.method422(0, var3);
            var4.field1328 = null;
            var4.field1327 = null;
        }
        if (this.field1557.field1060 != 128 || this.field1557.field1061 != 128) {
            var4.method430(this.field1557.field1060, this.field1557.field1061, this.field1557.field1060, (byte) 6);
        }
        var4.method426((byte) 5, this.field1543);
        var4.method431(this.field1557.field1063 + 64, this.field1557.field1064 + 850, -30, -50, -30, true);
        return var4;
    }

    @OriginalMember(owner = "client!SOQRIJPC", name = "<init>", descriptor = "(IIIIIIIIIIBI)V")
    public class56(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, byte arg10, int arg11) {
        this.field1557 = class34.field1053[arg2];
        this.field1551 = arg1;
        this.field1564 = arg11;
        this.field1565 = arg8;
        this.field1566 = arg4;
        if (arg10 == 9) {
            boolean var13 = false;
        } else {
            this.field1556 = !this.field1556;
        }
        this.field1554 = arg9;
        this.field1555 = arg3;
        this.field1558 = arg6;
        this.field1559 = arg7;
        this.field1560 = arg5;
        this.field1567 = arg0;
        this.field1561 = false;
    }

    @OriginalMember(owner = "client!SOQRIJPC", name = "a", descriptor = "(IIZII)V")
    public final void method542(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (!this.field1561) {
            double var6 = (double) (arg0 - this.field1564);
            double var8 = (double) (arg4 - this.field1565);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field1548 = (double) this.field1559 * var6 / var10 + (double) this.field1564;
            this.field1549 = (double) this.field1559 * var8 / var10 + (double) this.field1565;
            this.field1550 = this.field1566;
        }
        double var12 = (double) (this.field1555 + 1 - arg1);
        this.field1544 = ((double) arg0 - this.field1548) / var12;
        if (arg2) {
            this.field1556 = !this.field1556;
        }
        this.field1545 = ((double) arg4 - this.field1549) / var12;
        this.field1546 = Math.sqrt(this.field1545 * this.field1545 + this.field1544 * this.field1544);
        if (!this.field1561) {
            this.field1547 = -this.field1546 * Math.tan((double) this.field1558 * 0.02454369D);
        }
        this.field1563 = ((double) arg3 - this.field1550 - this.field1547 * var12) * 2.0D / (var12 * var12);
    }
}
