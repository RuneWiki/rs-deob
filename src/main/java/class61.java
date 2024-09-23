import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("XCJHWHNQ")
public class class61 extends class64 {

    @OriginalMember(owner = "XCJHWHNQ", name = "l", descriptor = "B")
    private byte field1478 = 6;

    @OriginalMember(owner = "XCJHWHNQ", name = "K", descriptor = "Z")
    public boolean field1503 = false;

    @OriginalMember(owner = "XCJHWHNQ", name = "L", descriptor = "B")
    private byte field1504 = 3;

    @OriginalMember(owner = "XCJHWHNQ", name = "F", descriptor = "LIDQQUVDL;")
    private class27 field1498;

    @OriginalMember(owner = "XCJHWHNQ", name = "q", descriptor = "I")
    public int field1483;

    @OriginalMember(owner = "XCJHWHNQ", name = "m", descriptor = "I")
    public int field1479;

    @OriginalMember(owner = "XCJHWHNQ", name = "n", descriptor = "I")
    public int field1480;

    @OriginalMember(owner = "XCJHWHNQ", name = "o", descriptor = "I")
    public int field1481;

    @OriginalMember(owner = "XCJHWHNQ", name = "x", descriptor = "I")
    public int field1490;

    @OriginalMember(owner = "XCJHWHNQ", name = "y", descriptor = "I")
    public int field1491;

    @OriginalMember(owner = "XCJHWHNQ", name = "z", descriptor = "I")
    public int field1492;

    @OriginalMember(owner = "XCJHWHNQ", name = "A", descriptor = "I")
    public int field1493;

    @OriginalMember(owner = "XCJHWHNQ", name = "B", descriptor = "I")
    public int field1494;

    @OriginalMember(owner = "XCJHWHNQ", name = "p", descriptor = "I")
    public int field1482;

    @OriginalMember(owner = "XCJHWHNQ", name = "r", descriptor = "I")
    private int field1484;

    @OriginalMember(owner = "XCJHWHNQ", name = "s", descriptor = "D")
    private double field1485;

    @OriginalMember(owner = "XCJHWHNQ", name = "C", descriptor = "D")
    public double field1495;

    @OriginalMember(owner = "XCJHWHNQ", name = "D", descriptor = "D")
    public double field1496;

    @OriginalMember(owner = "XCJHWHNQ", name = "E", descriptor = "D")
    public double field1497;

    @OriginalMember(owner = "XCJHWHNQ", name = "G", descriptor = "D")
    private double field1499;

    @OriginalMember(owner = "XCJHWHNQ", name = "H", descriptor = "D")
    private double field1500;

    @OriginalMember(owner = "XCJHWHNQ", name = "I", descriptor = "D")
    private double field1501;

    @OriginalMember(owner = "XCJHWHNQ", name = "J", descriptor = "D")
    private double field1502;

    @OriginalMember(owner = "XCJHWHNQ", name = "t", descriptor = "I")
    private int field1486;

    @OriginalMember(owner = "XCJHWHNQ", name = "u", descriptor = "I")
    private int field1487;

    @OriginalMember(owner = "XCJHWHNQ", name = "v", descriptor = "I")
    public int field1488;

    @OriginalMember(owner = "XCJHWHNQ", name = "w", descriptor = "I")
    public int field1489;

    @OriginalMember(owner = "XCJHWHNQ", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
    public class61(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        this.field1498 = class27.field847[arg4];
        this.field1483 = arg1;
        this.field1479 = arg3;
        this.field1480 = arg8;
        this.field1481 = arg11;
        this.field1490 = arg9;
        this.field1491 = arg0;
        this.field1492 = arg7;
        this.field1493 = arg6;
        this.field1494 = arg5;
        while (arg2 >= 0) {
            this.field1484 = 466;
        }
        this.field1482 = arg10;
        this.field1503 = false;
    }

    @OriginalMember(owner = "XCJHWHNQ", name = "a", descriptor = "(Z)LOIBEFFXI;")
    public final class39 method2(boolean arg0) {
        class39 var2 = this.field1498.method233();
        if (var2 == null) {
            return null;
        }
        int var3 = -1;
        if (arg0) {
            throw new NullPointerException();
        }
        if (this.field1498.field851 != null) {
            var3 = this.field1498.field851.field165[this.field1486];
        }
        class39 var4 = new class39(false, true, var2, class55.method455(true, var3), 5);
        if (var3 != -1) {
            var4.method353(10544);
            var4.method354(var3, this.field1478);
            var4.field1138 = null;
            var4.field1137 = null;
        }
        if (this.field1498.field854 != 128 || this.field1498.field855 != 128) {
            var4.method362((byte) 7, this.field1498.field855, this.field1498.field854, this.field1498.field854);
        }
        var4.method358((byte) -110, this.field1489);
        var4.method363(this.field1498.field857 + 64, this.field1498.field858 + 850, -30, -50, -30, true);
        return var4;
    }

    @OriginalMember(owner = "XCJHWHNQ", name = "a", descriptor = "(IIIBI)V")
    public final void method514(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (!this.field1503) {
            double var6 = (double) (arg4 - this.field1479);
            double var8 = (double) (arg0 - this.field1480);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field1495 = (double) this.field1493 * var6 / var10 + (double) this.field1479;
            this.field1496 = (double) this.field1493 * var8 / var10 + (double) this.field1480;
            this.field1497 = this.field1481;
        }
        double var12 = (double) (this.field1491 + 1 - arg1);
        this.field1499 = ((double) arg4 - this.field1495) / var12;
        this.field1500 = ((double) arg0 - this.field1496) / var12;
        this.field1501 = Math.sqrt(this.field1500 * this.field1500 + this.field1499 * this.field1499);
        if (!this.field1503) {
            this.field1502 = -this.field1501 * Math.tan((double) this.field1492 * 0.02454369D);
        }
        this.field1485 = ((double) arg2 - this.field1497 - this.field1502 * var12) * 2.0D / (var12 * var12);
        if (arg3 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "XCJHWHNQ", name = "a", descriptor = "(IB)V")
    public final void method515(int arg0, byte arg1) {
        this.field1503 = true;
        this.field1495 += (double) arg0 * this.field1499;
        this.field1496 += (double) arg0 * this.field1500;
        this.field1497 += this.field1485 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1502;
        this.field1502 += (double) arg0 * this.field1485;
        this.field1488 = (int) (Math.atan2(this.field1499, this.field1500) * 325.949D) + 1024 & 0x7FF;
        this.field1489 = (int) (Math.atan2(this.field1502, this.field1501) * 325.949D) & 0x7FF;
        if (this.field1504 != arg1 || this.field1498.field851 == null) {
            return;
        }
        this.field1487 += arg0;
        while (this.field1487 > this.field1498.field851.method23((byte) 2, this.field1486)) {
            this.field1487 -= this.field1498.field851.method23((byte) 2, this.field1486) + 1;
            this.field1486++;
            if (this.field1486 >= this.field1498.field851.field164) {
                this.field1486 = 0;
            }
        }
    }
}
