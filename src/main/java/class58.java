import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!WZPSCBGD")
public class class58 extends class12 {

    @OriginalMember(owner = "client!WZPSCBGD", name = "A", descriptor = "I")
    private int field1484 = -458;

    @OriginalMember(owner = "client!WZPSCBGD", name = "L", descriptor = "Z")
    public boolean field1495 = false;

    @OriginalMember(owner = "client!WZPSCBGD", name = "M", descriptor = "B")
    private byte field1496 = 0;

    @OriginalMember(owner = "client!WZPSCBGD", name = "N", descriptor = "Z")
    private boolean field1497 = false;

    @OriginalMember(owner = "client!WZPSCBGD", name = "F", descriptor = "LSDNQJNMP;")
    private class47 field1489;

    @OriginalMember(owner = "client!WZPSCBGD", name = "o", descriptor = "I")
    public int field1472;

    @OriginalMember(owner = "client!WZPSCBGD", name = "u", descriptor = "I")
    public int field1478;

    @OriginalMember(owner = "client!WZPSCBGD", name = "v", descriptor = "I")
    public int field1479;

    @OriginalMember(owner = "client!WZPSCBGD", name = "w", descriptor = "I")
    public int field1480;

    @OriginalMember(owner = "client!WZPSCBGD", name = "p", descriptor = "I")
    public int field1473;

    @OriginalMember(owner = "client!WZPSCBGD", name = "q", descriptor = "I")
    public int field1474;

    @OriginalMember(owner = "client!WZPSCBGD", name = "r", descriptor = "I")
    public int field1475;

    @OriginalMember(owner = "client!WZPSCBGD", name = "s", descriptor = "I")
    public int field1476;

    @OriginalMember(owner = "client!WZPSCBGD", name = "t", descriptor = "I")
    public int field1477;

    @OriginalMember(owner = "client!WZPSCBGD", name = "x", descriptor = "I")
    public int field1481;

    @OriginalMember(owner = "client!WZPSCBGD", name = "n", descriptor = "D")
    private double field1471;

    @OriginalMember(owner = "client!WZPSCBGD", name = "B", descriptor = "D")
    private double field1485;

    @OriginalMember(owner = "client!WZPSCBGD", name = "C", descriptor = "D")
    private double field1486;

    @OriginalMember(owner = "client!WZPSCBGD", name = "D", descriptor = "D")
    private double field1487;

    @OriginalMember(owner = "client!WZPSCBGD", name = "E", descriptor = "D")
    private double field1488;

    @OriginalMember(owner = "client!WZPSCBGD", name = "I", descriptor = "D")
    public double field1492;

    @OriginalMember(owner = "client!WZPSCBGD", name = "J", descriptor = "D")
    public double field1493;

    @OriginalMember(owner = "client!WZPSCBGD", name = "K", descriptor = "D")
    public double field1494;

    @OriginalMember(owner = "client!WZPSCBGD", name = "y", descriptor = "I")
    public int field1482;

    @OriginalMember(owner = "client!WZPSCBGD", name = "z", descriptor = "I")
    public int field1483;

    @OriginalMember(owner = "client!WZPSCBGD", name = "G", descriptor = "I")
    private int field1490;

    @OriginalMember(owner = "client!WZPSCBGD", name = "H", descriptor = "I")
    private int field1491;

    @OriginalMember(owner = "client!WZPSCBGD", name = "a", descriptor = "(II)V")
    public final void method475(int arg0, int arg1) {
        this.field1495 = true;
        this.field1492 += (double) arg0 * this.field1485;
        if (arg1 <= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field1493 += (double) arg0 * this.field1486;
        this.field1494 += this.field1471 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1488;
        this.field1488 += (double) arg0 * this.field1471;
        this.field1482 = (int) (Math.atan2(this.field1485, this.field1486) * 325.949D) + 1024 & 0x7FF;
        this.field1483 = (int) (Math.atan2(this.field1488, this.field1487) * 325.949D) & 0x7FF;
        if (this.field1489.field1280 == null) {
            return;
        }
        this.field1491 += arg0;
        while (this.field1491 > this.field1489.field1280.method459(this.field1490, false)) {
            this.field1491 -= this.field1489.field1280.method459(this.field1490, false) + 1;
            this.field1490++;
            if (this.field1490 >= this.field1489.field1280.field1445) {
                this.field1490 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!WZPSCBGD", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
    public class58(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        this.field1489 = class47.field1276[arg6];
        if (arg3 != 0) {
            this.field1497 = !this.field1497;
        }
        this.field1472 = arg7;
        this.field1478 = arg8;
        this.field1479 = arg1;
        this.field1480 = arg11;
        this.field1473 = arg0;
        this.field1474 = arg5;
        this.field1475 = arg2;
        this.field1476 = arg10;
        this.field1477 = arg9;
        this.field1481 = arg4;
        this.field1495 = false;
    }

    @OriginalMember(owner = "client!WZPSCBGD", name = "a", descriptor = "(I)LIEHKDFMR;")
    public final class18 method24(int arg0) {
        class18 var2 = this.field1489.method396();
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (var2 == null) {
            return null;
        }
        int var4 = -1;
        if (this.field1489.field1280 != null) {
            var4 = this.field1489.field1280.field1446[this.field1490];
        }
        class18 var5 = new class18(false, (byte) 1, class33.method337(this.field1496, var4), var2, true);
        if (var4 != -1) {
            var5.method274(false);
            var5.method275((byte) 9, var4);
            var5.field798 = null;
            var5.field797 = null;
        }
        if (this.field1489.field1283 != 128 || this.field1489.field1284 != 128) {
            var5.method283(this.field1489.field1283, this.field1489.field1284, 42667, this.field1489.field1283);
        }
        var5.method279(this.field1483, -896);
        var5.method284(this.field1489.field1286 + 64, this.field1489.field1287 + 850, -30, -50, -30, true);
        return var5;
    }

    @OriginalMember(owner = "client!WZPSCBGD", name = "a", descriptor = "(IIIII)V")
    public final void method476(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!this.field1495) {
            double var6 = (double) (arg1 - this.field1478);
            double var8 = (double) (arg0 - this.field1479);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field1492 = (double) this.field1476 * var6 / var10 + (double) this.field1478;
            this.field1493 = (double) this.field1476 * var8 / var10 + (double) this.field1479;
            this.field1494 = this.field1480;
        }
        double var12 = (double) (this.field1474 + 1 - arg2);
        if (arg3 >= 0) {
            return;
        }
        this.field1485 = ((double) arg1 - this.field1492) / var12;
        this.field1486 = ((double) arg0 - this.field1493) / var12;
        this.field1487 = Math.sqrt(this.field1486 * this.field1486 + this.field1485 * this.field1485);
        if (!this.field1495) {
            this.field1488 = -this.field1487 * Math.tan((double) this.field1475 * 0.02454369D);
        }
        this.field1471 = ((double) arg4 - this.field1494 - this.field1488 * var12) * 2.0D / (var12 * var12);
    }
}
