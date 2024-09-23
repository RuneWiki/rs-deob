import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("SDZHMORV")
public class class57 extends class18 {

    @OriginalMember(owner = "SDZHMORV", name = "F", descriptor = "I")
    private int field1444 = 654;

    @OriginalMember(owner = "SDZHMORV", name = "G", descriptor = "Z")
    public boolean field1445 = false;

    @OriginalMember(owner = "SDZHMORV", name = "H", descriptor = "LYTBPTACV;")
    private class70 field1446;

    @OriginalMember(owner = "SDZHMORV", name = "q", descriptor = "I")
    public int field1429;

    @OriginalMember(owner = "SDZHMORV", name = "s", descriptor = "I")
    public int field1431;

    @OriginalMember(owner = "SDZHMORV", name = "t", descriptor = "I")
    public int field1432;

    @OriginalMember(owner = "SDZHMORV", name = "u", descriptor = "I")
    public int field1433;

    @OriginalMember(owner = "SDZHMORV", name = "w", descriptor = "I")
    public int field1435;

    @OriginalMember(owner = "SDZHMORV", name = "x", descriptor = "I")
    public int field1436;

    @OriginalMember(owner = "SDZHMORV", name = "l", descriptor = "I")
    public int field1424;

    @OriginalMember(owner = "SDZHMORV", name = "m", descriptor = "I")
    public int field1425;

    @OriginalMember(owner = "SDZHMORV", name = "n", descriptor = "I")
    public int field1426;

    @OriginalMember(owner = "SDZHMORV", name = "v", descriptor = "I")
    public int field1434;

    @OriginalMember(owner = "SDZHMORV", name = "r", descriptor = "D")
    private double field1430;

    @OriginalMember(owner = "SDZHMORV", name = "y", descriptor = "D")
    private double field1437;

    @OriginalMember(owner = "SDZHMORV", name = "z", descriptor = "D")
    private double field1438;

    @OriginalMember(owner = "SDZHMORV", name = "A", descriptor = "D")
    private double field1439;

    @OriginalMember(owner = "SDZHMORV", name = "B", descriptor = "D")
    private double field1440;

    @OriginalMember(owner = "SDZHMORV", name = "C", descriptor = "D")
    public double field1441;

    @OriginalMember(owner = "SDZHMORV", name = "D", descriptor = "D")
    public double field1442;

    @OriginalMember(owner = "SDZHMORV", name = "E", descriptor = "D")
    public double field1443;

    @OriginalMember(owner = "SDZHMORV", name = "o", descriptor = "I")
    private int field1427;

    @OriginalMember(owner = "SDZHMORV", name = "p", descriptor = "I")
    private int field1428;

    @OriginalMember(owner = "SDZHMORV", name = "I", descriptor = "I")
    public int field1447;

    @OriginalMember(owner = "SDZHMORV", name = "J", descriptor = "I")
    public int field1448;

    @OriginalMember(owner = "SDZHMORV", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
    public class57(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        this.field1446 = class70.field1694[arg11];
        this.field1429 = arg7;
        this.field1431 = arg4;
        if (arg9 != 0) {
            throw new NullPointerException();
        }
        this.field1432 = arg2;
        this.field1433 = arg3;
        this.field1435 = arg6;
        this.field1436 = arg1;
        this.field1424 = arg0;
        this.field1425 = arg5;
        this.field1426 = arg8;
        this.field1434 = arg10;
        this.field1445 = false;
    }

    @OriginalMember(owner = "SDZHMORV", name = "a", descriptor = "(IIIII)V")
    public final void method479(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!this.field1445) {
            double var6 = (double) (arg0 - this.field1431);
            double var8 = (double) (arg1 - this.field1432);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field1441 = (double) this.field1425 * var6 / var10 + (double) this.field1431;
            this.field1442 = (double) this.field1425 * var8 / var10 + (double) this.field1432;
            this.field1443 = this.field1433;
        }
        double var12 = (double) (this.field1436 + 1 - arg3);
        this.field1437 = ((double) arg0 - this.field1441) / var12;
        this.field1438 = ((double) arg1 - this.field1442) / var12;
        if (arg2 != 0) {
            return;
        }
        this.field1439 = Math.sqrt(this.field1438 * this.field1438 + this.field1437 * this.field1437);
        if (!this.field1445) {
            this.field1440 = -this.field1439 * Math.tan((double) this.field1424 * 0.02454369D);
        }
        this.field1430 = ((double) arg4 - this.field1443 - this.field1440 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "SDZHMORV", name = "a", descriptor = "(ZI)V")
    public final void method480(boolean arg0, int arg1) {
        this.field1445 = true;
        this.field1441 += (double) arg1 * this.field1437;
        this.field1442 += (double) arg1 * this.field1438;
        this.field1443 += this.field1430 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field1440;
        this.field1440 += (double) arg1 * this.field1430;
        this.field1447 = (int) (Math.atan2(this.field1437, this.field1438) * 325.949D) + 1024 & 0x7FF;
        if (!arg0) {
            return;
        }
        this.field1448 = (int) (Math.atan2(this.field1440, this.field1439) * 325.949D) & 0x7FF;
        if (this.field1446.field1698 == null) {
            return;
        }
        this.field1428 += arg1;
        while (this.field1428 > this.field1446.field1698.method275(210, this.field1427)) {
            this.field1428 -= this.field1446.field1698.method275(210, this.field1427) + 1;
            this.field1427++;
            if (this.field1427 >= this.field1446.field1698.field950) {
                this.field1427 = 0;
            }
        }
    }

    @OriginalMember(owner = "SDZHMORV", name = "a", descriptor = "(B)LDHUPIIUL;")
    public final class10 method159(byte arg0) {
        class10 var2 = this.field1446.method582();
        if (var2 == null) {
            return null;
        }
        int var3 = -1;
        if (this.field1446.field1698 != null) {
            var3 = this.field1446.field1698.field951[this.field1427];
        }
        class10 var4 = new class10(var2, false, class5.method16(var3, true), 878, true);
        if (var3 != -1) {
            var4.method198(-390);
            var4.method199(var3, 0);
            var4.field649 = null;
            var4.field648 = null;
        }
        if (this.field1446.field1701 != 128 || this.field1446.field1702 != 128) {
            var4.method207(-592, this.field1446.field1701, this.field1446.field1702, this.field1446.field1701);
        }
        var4.method203(this.field1448, 452);
        var4.method208(this.field1446.field1704 + 64, this.field1446.field1705 + 850, -30, -50, -30, true);
        if (arg0 != 5) {
            this.field1444 = 475;
        }
        return var4;
    }
}
