import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!VCMSZAQJ")
public class class58 extends class17 {

    @OriginalMember(owner = "client!VCMSZAQJ", name = "k", descriptor = "Z")
    private boolean field1489 = true;

    @OriginalMember(owner = "client!VCMSZAQJ", name = "l", descriptor = "Z")
    private boolean field1490 = false;

    @OriginalMember(owner = "client!VCMSZAQJ", name = "r", descriptor = "Z")
    private boolean field1496 = true;

    @OriginalMember(owner = "client!VCMSZAQJ", name = "u", descriptor = "I")
    private int field1499 = 41952;

    @OriginalMember(owner = "client!VCMSZAQJ", name = "K", descriptor = "Z")
    public boolean field1515 = false;

    @OriginalMember(owner = "client!VCMSZAQJ", name = "m", descriptor = "LQUXKFXEA;")
    private class45 field1491;

    @OriginalMember(owner = "client!VCMSZAQJ", name = "L", descriptor = "I")
    public int field1516;

    @OriginalMember(owner = "client!VCMSZAQJ", name = "G", descriptor = "I")
    public int field1511;

    @OriginalMember(owner = "client!VCMSZAQJ", name = "H", descriptor = "I")
    public int field1512;

    @OriginalMember(owner = "client!VCMSZAQJ", name = "I", descriptor = "I")
    public int field1513;

    @OriginalMember(owner = "client!VCMSZAQJ", name = "E", descriptor = "I")
    public int field1509;

    @OriginalMember(owner = "client!VCMSZAQJ", name = "F", descriptor = "I")
    public int field1510;

    @OriginalMember(owner = "client!VCMSZAQJ", name = "y", descriptor = "I")
    public int field1503;

    @OriginalMember(owner = "client!VCMSZAQJ", name = "z", descriptor = "I")
    public int field1504;

    @OriginalMember(owner = "client!VCMSZAQJ", name = "A", descriptor = "I")
    public int field1505;

    @OriginalMember(owner = "client!VCMSZAQJ", name = "J", descriptor = "I")
    public int field1514;

    @OriginalMember(owner = "client!VCMSZAQJ", name = "n", descriptor = "D")
    private double field1492;

    @OriginalMember(owner = "client!VCMSZAQJ", name = "o", descriptor = "D")
    private double field1493;

    @OriginalMember(owner = "client!VCMSZAQJ", name = "p", descriptor = "D")
    private double field1494;

    @OriginalMember(owner = "client!VCMSZAQJ", name = "q", descriptor = "D")
    private double field1495;

    @OriginalMember(owner = "client!VCMSZAQJ", name = "v", descriptor = "D")
    public double field1500;

    @OriginalMember(owner = "client!VCMSZAQJ", name = "w", descriptor = "D")
    public double field1501;

    @OriginalMember(owner = "client!VCMSZAQJ", name = "x", descriptor = "D")
    public double field1502;

    @OriginalMember(owner = "client!VCMSZAQJ", name = "B", descriptor = "D")
    private double field1506;

    @OriginalMember(owner = "client!VCMSZAQJ", name = "s", descriptor = "I")
    private int field1497;

    @OriginalMember(owner = "client!VCMSZAQJ", name = "t", descriptor = "I")
    private int field1498;

    @OriginalMember(owner = "client!VCMSZAQJ", name = "C", descriptor = "I")
    public int field1507;

    @OriginalMember(owner = "client!VCMSZAQJ", name = "D", descriptor = "I")
    public int field1508;

    @OriginalMember(owner = "client!VCMSZAQJ", name = "a", descriptor = "(I)LKDWDYCIL;")
    public final class25 method185(int arg0) {
        class25 var2 = this.field1491.method413();
        if (var2 == null) {
            return null;
        }
        int var3 = -1;
        if (arg0 != 9) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (this.field1491.field1311 != null) {
            var3 = this.field1491.field1311.field984[this.field1497];
        }
        class25 var5 = new class25((byte) -48, false, var2, class48.method423(var3, this.field1499), true);
        if (var3 != -1) {
            var5.method253(0);
            var5.method254(var3, 151);
            var5.field907 = null;
            var5.field906 = null;
        }
        if (this.field1491.field1314 != 128 || this.field1491.field1315 != 128) {
            var5.method262((byte) 3, this.field1491.field1314, this.field1491.field1314, this.field1491.field1315);
        }
        var5.method258(false, this.field1508);
        var5.method263(this.field1491.field1317 + 64, this.field1491.field1318 + 850, -30, -50, -30, true);
        return var5;
    }

    @OriginalMember(owner = "client!VCMSZAQJ", name = "a", descriptor = "(IIIII)V")
    public final void method532(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!this.field1515) {
            double var6 = (double) (arg1 - this.field1511);
            double var8 = (double) (arg4 - this.field1512);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field1500 = (double) this.field1504 * var6 / var10 + (double) this.field1511;
            this.field1501 = (double) this.field1504 * var8 / var10 + (double) this.field1512;
            this.field1502 = this.field1513;
        }
        double var12 = (double) (this.field1510 + 1 - arg2);
        this.field1492 = ((double) arg1 - this.field1500) / var12;
        if (arg3 < 2 || arg3 > 2) {
            this.field1489 = !this.field1489;
        }
        this.field1493 = ((double) arg4 - this.field1501) / var12;
        this.field1494 = Math.sqrt(this.field1493 * this.field1493 + this.field1492 * this.field1492);
        if (!this.field1515) {
            this.field1495 = -this.field1494 * Math.tan((double) this.field1503 * 0.02454369D);
        }
        this.field1506 = ((double) arg0 - this.field1502 - this.field1495 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!VCMSZAQJ", name = "a", descriptor = "(IZ)V")
    public final void method533(int arg0, boolean arg1) {
        this.field1515 = true;
        if (!arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field1500 += (double) arg0 * this.field1492;
        this.field1501 += (double) arg0 * this.field1493;
        this.field1502 += this.field1506 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1495;
        this.field1495 += (double) arg0 * this.field1506;
        this.field1507 = (int) (Math.atan2(this.field1492, this.field1493) * 325.949D) + 1024 & 0x7FF;
        this.field1508 = (int) (Math.atan2(this.field1495, this.field1494) * 325.949D) & 0x7FF;
        if (this.field1491.field1311 == null) {
            return;
        }
        this.field1498 += arg0;
        while (this.field1498 > this.field1491.field1311.method280(-204, this.field1497)) {
            this.field1498 -= this.field1491.field1311.method280(-204, this.field1497) + 1;
            this.field1497++;
            if (this.field1497 >= this.field1491.field1311.field983) {
                this.field1497 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!VCMSZAQJ", name = "<init>", descriptor = "(IIBIIIIIIIII)V")
    public class58(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        this.field1491 = class45.field1307[arg9];
        this.field1516 = arg6;
        this.field1511 = arg11;
        this.field1512 = arg4;
        if (arg2 != -35) {
            this.field1490 = !this.field1490;
        }
        this.field1513 = arg5;
        this.field1509 = arg0;
        this.field1510 = arg10;
        this.field1503 = arg1;
        this.field1504 = arg8;
        this.field1505 = arg3;
        this.field1514 = arg7;
        this.field1515 = false;
    }
}
