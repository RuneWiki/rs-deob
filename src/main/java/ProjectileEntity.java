import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("eb")
public class ProjectileEntity extends Entity {

    @OriginalMember(owner = "eb", name = "l", descriptor = "I")
    private int field511 = -732;

    @OriginalMember(owner = "eb", name = "m", descriptor = "B")
    private byte field512 = 86;

    @OriginalMember(owner = "eb", name = "n", descriptor = "B")
    private byte field513 = 5;

    @OriginalMember(owner = "eb", name = "z", descriptor = "Z")
    public boolean field525 = false;

    @OriginalMember(owner = "eb", name = "o", descriptor = "Loc;")
    private SpotAnimType field514;

    @OriginalMember(owner = "eb", name = "p", descriptor = "I")
    public int field515;

    @OriginalMember(owner = "eb", name = "q", descriptor = "I")
    public int field516;

    @OriginalMember(owner = "eb", name = "r", descriptor = "I")
    public int field517;

    @OriginalMember(owner = "eb", name = "s", descriptor = "I")
    public int field518;

    @OriginalMember(owner = "eb", name = "u", descriptor = "I")
    public int field520;

    @OriginalMember(owner = "eb", name = "v", descriptor = "I")
    public int field521;

    @OriginalMember(owner = "eb", name = "w", descriptor = "I")
    public int field522;

    @OriginalMember(owner = "eb", name = "x", descriptor = "I")
    public int field523;

    @OriginalMember(owner = "eb", name = "y", descriptor = "I")
    public int field524;

    @OriginalMember(owner = "eb", name = "t", descriptor = "I")
    public int field519;

    @OriginalMember(owner = "eb", name = "A", descriptor = "D")
    public double field526;

    @OriginalMember(owner = "eb", name = "B", descriptor = "D")
    public double field527;

    @OriginalMember(owner = "eb", name = "C", descriptor = "D")
    public double field528;

    @OriginalMember(owner = "eb", name = "D", descriptor = "D")
    private double field529;

    @OriginalMember(owner = "eb", name = "E", descriptor = "D")
    private double field530;

    @OriginalMember(owner = "eb", name = "F", descriptor = "D")
    private double field531;

    @OriginalMember(owner = "eb", name = "G", descriptor = "D")
    private double field532;

    @OriginalMember(owner = "eb", name = "H", descriptor = "D")
    private double field533;

    @OriginalMember(owner = "eb", name = "I", descriptor = "I")
    public int field534;

    @OriginalMember(owner = "eb", name = "J", descriptor = "I")
    public int field535;

    @OriginalMember(owner = "eb", name = "K", descriptor = "I")
    private int field536;

    @OriginalMember(owner = "eb", name = "L", descriptor = "I")
    private int field537;

    @OriginalMember(owner = "eb", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
    public ProjectileEntity(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        this.field514 = SpotAnimType.field1142[arg6];
        this.field515 = arg2;
        this.field516 = arg10;
        this.field517 = arg3;
        this.field518 = arg0;
        this.field520 = arg11;
        this.field521 = arg4;
        this.field522 = arg7;
        int var13 = 24 / arg9;
        this.field523 = arg1;
        this.field524 = arg8;
        this.field519 = arg5;
        this.field525 = false;
    }

    @OriginalMember(owner = "eb", name = "a", descriptor = "(IIIBI)V")
    public final void method132(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (!this.field525) {
            double var6 = (double) (arg0 - this.field516);
            double var8 = (double) (arg1 - this.field517);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field526 = (double) this.field523 * var6 / var10 + (double) this.field516;
            this.field527 = (double) this.field523 * var8 / var10 + (double) this.field517;
            this.field528 = this.field518;
        }
        double var12 = (double) (this.field521 + 1 - arg2);
        this.field529 = ((double) arg0 - this.field526) / var12;
        if (this.field513 == arg3) {
            boolean var14 = false;
        } else {
            this.field511 = -20;
        }
        this.field530 = ((double) arg1 - this.field527) / var12;
        this.field531 = Math.sqrt(this.field530 * this.field530 + this.field529 * this.field529);
        if (!this.field525) {
            this.field532 = -this.field531 * Math.tan((double) this.field522 * 0.02454369D);
        }
        this.field533 = ((double) arg4 - this.field528 - this.field532 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "eb", name = "a", descriptor = "(IB)V")
    public final void method133(int arg0, byte arg1) {
        this.field525 = true;
        this.field526 += (double) arg0 * this.field529;
        this.field527 += (double) arg0 * this.field530;
        if (arg1 != 0) {
            return;
        }
        boolean var3 = false;
        this.field528 += this.field533 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field532;
        this.field532 += (double) arg0 * this.field533;
        this.field534 = (int) (Math.atan2(this.field529, this.field530) * 325.949D) + 1024 & 0x7FF;
        this.field535 = (int) (Math.atan2(this.field532, this.field531) * 325.949D) & 0x7FF;
        if (this.field514.field1146 == null) {
            return;
        }
        this.field537 += arg0;
        while (this.field537 > this.field514.field1146.method382(this.field536, 0)) {
            this.field537 -= this.field514.field1146.method382(this.field536, 0) + 1;
            this.field536++;
            if (this.field536 >= this.field514.field1146.field1126) {
                this.field536 = 0;
            }
        }
    }

    @OriginalMember(owner = "eb", name = "a", descriptor = "(I)Lfb;")
    public final Model method122(int arg0) {
        Model var2 = this.field514.method386();
        if (var2 == null) {
            return null;
        }
        Model var3 = new Model(true, var2, false, true, !this.field514.field1147);
        if (arg0 != -13634) {
            this.field511 = 234;
        }
        if (this.field514.field1146 != null) {
            var3.method145(this.field512);
            var3.method146(true, this.field514.field1146.field1127[this.field536]);
            var3.field582 = null;
            var3.field581 = null;
        }
        if (this.field514.field1150 != 128 || this.field514.field1151 != 128) {
            var3.method154(this.field514.field1150, this.field514.field1150, this.field514.field1151, 7);
        }
        var3.method150(true, this.field535);
        var3.method155(this.field514.field1153 + 64, this.field514.field1154 + 850, -30, -50, -30, true);
        return var3;
    }
}
