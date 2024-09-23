import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("db")
public class ProjectileEntity extends Entity {

    @OriginalMember(owner = "db", name = "m", descriptor = "Z")
    private boolean field514 = true;

    @OriginalMember(owner = "db", name = "n", descriptor = "I")
    private int field515 = -917;

    @OriginalMember(owner = "db", name = "o", descriptor = "Z")
    private boolean field516 = true;

    @OriginalMember(owner = "db", name = "A", descriptor = "Z")
    public boolean field528 = false;

    @OriginalMember(owner = "db", name = "p", descriptor = "Lpc;")
    private SpotAnimType field517;

    @OriginalMember(owner = "db", name = "q", descriptor = "I")
    public int field518;

    @OriginalMember(owner = "db", name = "r", descriptor = "I")
    public int field519;

    @OriginalMember(owner = "db", name = "s", descriptor = "I")
    public int field520;

    @OriginalMember(owner = "db", name = "t", descriptor = "I")
    public int field521;

    @OriginalMember(owner = "db", name = "v", descriptor = "I")
    public int field523;

    @OriginalMember(owner = "db", name = "w", descriptor = "I")
    public int field524;

    @OriginalMember(owner = "db", name = "x", descriptor = "I")
    public int field525;

    @OriginalMember(owner = "db", name = "y", descriptor = "I")
    public int field526;

    @OriginalMember(owner = "db", name = "z", descriptor = "I")
    public int field527;

    @OriginalMember(owner = "db", name = "u", descriptor = "I")
    public int field522;

    @OriginalMember(owner = "db", name = "B", descriptor = "D")
    public double field529;

    @OriginalMember(owner = "db", name = "C", descriptor = "D")
    public double field530;

    @OriginalMember(owner = "db", name = "D", descriptor = "D")
    public double field531;

    @OriginalMember(owner = "db", name = "E", descriptor = "D")
    private double field532;

    @OriginalMember(owner = "db", name = "F", descriptor = "D")
    private double field533;

    @OriginalMember(owner = "db", name = "G", descriptor = "D")
    private double field534;

    @OriginalMember(owner = "db", name = "H", descriptor = "D")
    private double field535;

    @OriginalMember(owner = "db", name = "I", descriptor = "D")
    private double field536;

    @OriginalMember(owner = "db", name = "J", descriptor = "I")
    public int field537;

    @OriginalMember(owner = "db", name = "K", descriptor = "I")
    public int field538;

    @OriginalMember(owner = "db", name = "L", descriptor = "I")
    private int field539;

    @OriginalMember(owner = "db", name = "M", descriptor = "I")
    private int field540;

    @OriginalMember(owner = "db", name = "<init>", descriptor = "(IIIIIBIIIIII)V")
    public ProjectileEntity(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        this.field517 = SpotAnimType.field1166[arg3];
        this.field518 = arg8;
        this.field519 = arg6;
        this.field520 = arg10;
        this.field521 = arg1;
        this.field523 = arg2;
        this.field524 = arg0;
        this.field525 = arg9;
        this.field526 = arg11;
        this.field527 = arg4;
        if (arg5 == 0) {
            boolean var13 = false;
        } else {
            this.field515 = -140;
        }
        this.field522 = arg7;
        this.field528 = false;
    }

    @OriginalMember(owner = "db", name = "a", descriptor = "(IIIII)V")
    public final void method120(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!this.field528) {
            double var6 = (double) (arg3 - this.field519);
            double var8 = (double) (arg1 - this.field520);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field529 = (double) this.field526 * var6 / var10 + (double) this.field519;
            this.field530 = (double) this.field526 * var8 / var10 + (double) this.field520;
            this.field531 = this.field521;
        }
        double var12 = (double) (this.field524 + 1 - arg4);
        if (arg2 != 0) {
            for (int var14 = 1; var14 > 0; var14++) {
            }
        }
        this.field532 = ((double) arg3 - this.field529) / var12;
        this.field533 = ((double) arg1 - this.field530) / var12;
        this.field534 = Math.sqrt(this.field533 * this.field533 + this.field532 * this.field532);
        if (!this.field528) {
            this.field535 = -this.field534 * Math.tan((double) this.field525 * 0.02454369D);
        }
        this.field536 = ((double) arg0 - this.field531 - this.field535 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "db", name = "a", descriptor = "(ZI)V")
    public final void method121(boolean arg0, int arg1) {
        this.field528 = true;
        if (arg0) {
            return;
        }
        this.field529 += (double) arg1 * this.field532;
        this.field530 += (double) arg1 * this.field533;
        this.field531 += this.field536 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field535;
        this.field535 += (double) arg1 * this.field536;
        this.field537 = (int) (Math.atan2(this.field532, this.field533) * 325.949D) + 1024 & 0x7FF;
        this.field538 = (int) (Math.atan2(this.field535, this.field534) * 325.949D) & 0x7FF;
        if (this.field517.field1170 == null) {
            return;
        }
        this.field540 += arg1;
        while (this.field540 > this.field517.field1170.method382(this.field539, this.field516)) {
            this.field540 -= this.field517.field1170.method382(this.field539, this.field516) + 1;
            this.field539++;
            if (this.field539 >= this.field517.field1170.field1146) {
                this.field539 = 0;
            }
        }
    }

    @OriginalMember(owner = "db", name = "a", descriptor = "(I)Leb;")
    public final Model method109(int arg0) {
        if (arg0 != -47094) {
            this.field515 = -404;
        }
        Model var2 = this.field517.method386();
        if (var2 == null) {
            return null;
        }
        int var3 = -1;
        if (this.field517.field1170 != null) {
            var3 = this.field517.field1170.field1147[this.field539];
        }
        Model var4 = new Model(false, -16051, var2, AnimFrame.method48(var3, this.field514), true);
        if (var3 != -1) {
            var4.method133(true);
            var4.method134(true, var3);
            var4.field585 = null;
            var4.field584 = null;
        }
        if (this.field517.field1173 != 128 || this.field517.field1174 != 128) {
            var4.method142(19411, this.field517.field1173, this.field517.field1173, this.field517.field1174);
        }
        var4.method138(this.field538, 104);
        var4.method143(this.field517.field1176 + 64, this.field517.field1177 + 850, -30, -50, -30, true);
        return var4;
    }
}
