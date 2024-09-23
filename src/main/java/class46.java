import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("SCWHDOGN")
public class class46 extends class71 {

    @OriginalMember(owner = "SCWHDOGN", name = "p", descriptor = "B")
    private byte field1427 = 2;

    @OriginalMember(owner = "SCWHDOGN", name = "r", descriptor = "Z")
    public boolean field1429 = false;

    @OriginalMember(owner = "SCWHDOGN", name = "G", descriptor = "I")
    private int field1444 = -23378;

    @OriginalMember(owner = "SCWHDOGN", name = "H", descriptor = "I")
    private int field1445 = -36281;

    @OriginalMember(owner = "SCWHDOGN", name = "J", descriptor = "Z")
    private boolean field1447 = false;

    @OriginalMember(owner = "SCWHDOGN", name = "A", descriptor = "LBYUDODIR;")
    private class3 field1438;

    @OriginalMember(owner = "SCWHDOGN", name = "q", descriptor = "I")
    public int field1428;

    @OriginalMember(owner = "SCWHDOGN", name = "u", descriptor = "I")
    public int field1432;

    @OriginalMember(owner = "SCWHDOGN", name = "v", descriptor = "I")
    public int field1433;

    @OriginalMember(owner = "SCWHDOGN", name = "w", descriptor = "I")
    public int field1434;

    @OriginalMember(owner = "SCWHDOGN", name = "y", descriptor = "I")
    public int field1436;

    @OriginalMember(owner = "SCWHDOGN", name = "z", descriptor = "I")
    public int field1437;

    @OriginalMember(owner = "SCWHDOGN", name = "K", descriptor = "I")
    public int field1448;

    @OriginalMember(owner = "SCWHDOGN", name = "L", descriptor = "I")
    public int field1449;

    @OriginalMember(owner = "SCWHDOGN", name = "M", descriptor = "I")
    public int field1450;

    @OriginalMember(owner = "SCWHDOGN", name = "x", descriptor = "I")
    public int field1435;

    @OriginalMember(owner = "SCWHDOGN", name = "l", descriptor = "D")
    private double field1423;

    @OriginalMember(owner = "SCWHDOGN", name = "m", descriptor = "D")
    private double field1424;

    @OriginalMember(owner = "SCWHDOGN", name = "n", descriptor = "D")
    private double field1425;

    @OriginalMember(owner = "SCWHDOGN", name = "o", descriptor = "D")
    private double field1426;

    @OriginalMember(owner = "SCWHDOGN", name = "D", descriptor = "D")
    public double field1441;

    @OriginalMember(owner = "SCWHDOGN", name = "E", descriptor = "D")
    public double field1442;

    @OriginalMember(owner = "SCWHDOGN", name = "F", descriptor = "D")
    public double field1443;

    @OriginalMember(owner = "SCWHDOGN", name = "I", descriptor = "D")
    private double field1446;

    @OriginalMember(owner = "SCWHDOGN", name = "s", descriptor = "I")
    private int field1430;

    @OriginalMember(owner = "SCWHDOGN", name = "t", descriptor = "I")
    private int field1431;

    @OriginalMember(owner = "SCWHDOGN", name = "B", descriptor = "I")
    public int field1439;

    @OriginalMember(owner = "SCWHDOGN", name = "C", descriptor = "I")
    public int field1440;

    @OriginalMember(owner = "SCWHDOGN", name = "<init>", descriptor = "(IIIIIIBIIIII)V")
    public class46(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        this.field1438 = class3.field41[arg3];
        this.field1428 = arg0;
        this.field1432 = arg4;
        this.field1433 = arg10;
        this.field1434 = arg9;
        this.field1436 = arg7;
        this.field1437 = arg2;
        this.field1448 = arg11;
        this.field1449 = arg8;
        this.field1450 = arg1;
        this.field1435 = arg5;
        this.field1429 = false;
        if (this.field1427 == arg6) {
            boolean var13 = false;
        } else {
            this.field1447 = !this.field1447;
        }
    }

    @OriginalMember(owner = "SCWHDOGN", name = "a", descriptor = "(BI)V")
    public final void method470(byte arg0, int arg1) {
        this.field1429 = true;
        this.field1441 += (double) arg1 * this.field1423;
        this.field1442 += (double) arg1 * this.field1424;
        this.field1443 += this.field1446 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field1426;
        this.field1426 += (double) arg1 * this.field1446;
        this.field1439 = (int) (Math.atan2(this.field1423, this.field1424) * 325.949D) + 1024 & 0x7FF;
        if (arg0 != -41) {
            return;
        }
        this.field1440 = (int) (Math.atan2(this.field1426, this.field1425) * 325.949D) & 0x7FF;
        if (this.field1438.field45 == null) {
            return;
        }
        this.field1431 += arg1;
        while (this.field1431 > this.field1438.field45.method525(0, this.field1430)) {
            this.field1431 -= this.field1438.field45.method525(0, this.field1430) + 1;
            this.field1430++;
            if (this.field1430 >= this.field1438.field45.field1561) {
                this.field1430 = 0;
            }
        }
    }

    @OriginalMember(owner = "SCWHDOGN", name = "a", descriptor = "(Z)LOQIGXOFQ;")
    public final class35 method171(boolean arg0) {
        class35 var2 = this.field1438.method18();
        if (arg0) {
            this.field1444 = -250;
        }
        if (var2 == null) {
            return null;
        }
        int var3 = -1;
        if (this.field1438.field45 != null) {
            var3 = this.field1438.field45.field1562[this.field1430];
        }
        class35 var4 = new class35(class68.method582(var3, 0), var2, -575, false, true);
        if (var3 != -1) {
            var4.method398(0);
            var4.method399(-230, var3);
            var4.field1238 = null;
            var4.field1237 = null;
        }
        if (this.field1438.field48 != 128 || this.field1438.field49 != 128) {
            var4.method407(this.field1438.field49, this.field1438.field48, false, this.field1438.field48);
        }
        var4.method403(true, this.field1440);
        var4.method408(this.field1438.field51 + 64, this.field1438.field52 + 850, -30, -50, -30, true);
        return var4;
    }

    @OriginalMember(owner = "SCWHDOGN", name = "a", descriptor = "(IIIII)V")
    public final void method471(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!this.field1429) {
            double var6 = (double) (arg4 - this.field1432);
            double var8 = (double) (arg3 - this.field1433);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field1441 = (double) this.field1449 * var6 / var10 + (double) this.field1432;
            this.field1442 = (double) this.field1449 * var8 / var10 + (double) this.field1433;
            this.field1443 = this.field1434;
        }
        double var12 = (double) (this.field1437 + 1 - arg1);
        this.field1423 = ((double) arg4 - this.field1441) / var12;
        this.field1424 = ((double) arg3 - this.field1442) / var12;
        if (this.field1445 != arg2) {
            for (int var14 = 1; var14 > 0; var14++) {
            }
        }
        this.field1425 = Math.sqrt(this.field1424 * this.field1424 + this.field1423 * this.field1423);
        if (!this.field1429) {
            this.field1426 = -this.field1425 * Math.tan((double) this.field1448 * 0.02454369D);
        }
        this.field1446 = ((double) arg0 - this.field1443 - this.field1426 * var12) * 2.0D / (var12 * var12);
    }
}
