import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("eb")
public class ProjectileEntity extends Entity {

    @OriginalMember(owner = "eb", name = "l", descriptor = "Z")
    private boolean field502 = true;

    @OriginalMember(owner = "eb", name = "m", descriptor = "B")
    private byte field503 = -2;

    @OriginalMember(owner = "eb", name = "y", descriptor = "Z")
    public boolean field515 = false;

    @OriginalMember(owner = "eb", name = "n", descriptor = "Loc;")
    private SpotAnimType field504;

    @OriginalMember(owner = "eb", name = "o", descriptor = "I")
    public int field505;

    @OriginalMember(owner = "eb", name = "p", descriptor = "I")
    public int field506;

    @OriginalMember(owner = "eb", name = "q", descriptor = "I")
    public int field507;

    @OriginalMember(owner = "eb", name = "r", descriptor = "I")
    public int field508;

    @OriginalMember(owner = "eb", name = "t", descriptor = "I")
    public int field510;

    @OriginalMember(owner = "eb", name = "u", descriptor = "I")
    public int field511;

    @OriginalMember(owner = "eb", name = "v", descriptor = "I")
    public int field512;

    @OriginalMember(owner = "eb", name = "w", descriptor = "I")
    public int field513;

    @OriginalMember(owner = "eb", name = "x", descriptor = "I")
    public int field514;

    @OriginalMember(owner = "eb", name = "s", descriptor = "I")
    public int field509;

    @OriginalMember(owner = "eb", name = "z", descriptor = "D")
    public double field516;

    @OriginalMember(owner = "eb", name = "A", descriptor = "D")
    public double field517;

    @OriginalMember(owner = "eb", name = "B", descriptor = "D")
    public double field518;

    @OriginalMember(owner = "eb", name = "C", descriptor = "D")
    private double field519;

    @OriginalMember(owner = "eb", name = "D", descriptor = "D")
    private double field520;

    @OriginalMember(owner = "eb", name = "E", descriptor = "D")
    private double field521;

    @OriginalMember(owner = "eb", name = "F", descriptor = "D")
    private double field522;

    @OriginalMember(owner = "eb", name = "G", descriptor = "D")
    private double field523;

    @OriginalMember(owner = "eb", name = "H", descriptor = "I")
    public int field524;

    @OriginalMember(owner = "eb", name = "I", descriptor = "I")
    public int field525;

    @OriginalMember(owner = "eb", name = "J", descriptor = "I")
    private int field526;

    @OriginalMember(owner = "eb", name = "K", descriptor = "I")
    private int field527;

    @OriginalMember(owner = "eb", name = "<init>", descriptor = "(IIIIBIIIIIII)V")
    public ProjectileEntity(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        this.field504 = SpotAnimType.field1138[arg1];
        this.field505 = arg5;
        this.field506 = arg0;
        this.field507 = arg6;
        this.field508 = arg7;
        this.field510 = arg9;
        this.field511 = arg11;
        this.field512 = arg2;
        this.field513 = arg8;
        this.field514 = arg10;
        this.field509 = arg3;
        if (this.field503 != arg4) {
            this.field502 = !this.field502;
        }
        this.field515 = false;
    }

    @OriginalMember(owner = "eb", name = "a", descriptor = "(IBIII)V")
    public final void method132(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (!this.field515) {
            double var6 = (double) (arg3 - this.field506);
            double var8 = (double) (arg0 - this.field507);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field516 = (double) this.field513 * var6 / var10 + (double) this.field506;
            this.field517 = (double) this.field513 * var8 / var10 + (double) this.field507;
            this.field518 = this.field508;
        }
        double var12 = (double) (this.field511 + 1 - arg4);
        this.field519 = ((double) arg3 - this.field516) / var12;
        this.field520 = ((double) arg0 - this.field517) / var12;
        this.field521 = Math.sqrt(this.field520 * this.field520 + this.field519 * this.field519);
        if (!this.field515) {
            this.field522 = -this.field521 * Math.tan((double) this.field512 * 0.02454369D);
        }
        this.field523 = ((double) arg2 - this.field518 - this.field522 * var12) * 2.0D / (var12 * var12);
        if (arg1 != -12) {
            this.field502 = !this.field502;
        }
    }

    @OriginalMember(owner = "eb", name = "a", descriptor = "(II)V")
    public final void method133(int arg0, int arg1) {
        this.field515 = true;
        this.field516 += (double) arg1 * this.field519;
        this.field517 += (double) arg1 * this.field520;
        this.field518 += this.field523 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field522;
        this.field522 += (double) arg1 * this.field523;
        if (arg0 >= 0) {
            return;
        }
        this.field524 = (int) (Math.atan2(this.field519, this.field520) * 325.949D) + 1024 & 0x7FF;
        this.field525 = (int) (Math.atan2(this.field522, this.field521) * 325.949D) & 0x7FF;
        if (this.field504.field1142 == null) {
            return;
        }
        this.field527 += arg1;
        while (this.field527 > this.field504.field1142.method382(0, this.field526)) {
            this.field527 -= this.field504.field1142.method382(0, this.field526) + 1;
            this.field526++;
            if (this.field526 >= this.field504.field1142.field1121) {
                this.field526 = 0;
            }
        }
    }

    @OriginalMember(owner = "eb", name = "a", descriptor = "(I)Lfb;")
    public final Model method122(int arg0) {
        Model var2 = this.field504.method386();
        if (arg0 != 5560) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (var2 == null) {
            return null;
        }
        Model var4 = new Model(var2, true, false, !this.field504.field1143, -796);
        if (this.field504.field1142 != null) {
            var4.method145(-591);
            var4.method146(this.field504.field1142.field1122[this.field526], 13056);
            var4.field575 = null;
            var4.field574 = null;
        }
        if (this.field504.field1146 != 128 || this.field504.field1147 != 128) {
            var4.method154(this.field504.field1147, this.field504.field1146, 4, this.field504.field1146);
        }
        var4.method150(2, this.field525);
        var4.method155(this.field504.field1149 + 64, this.field504.field1150 + 850, -30, -50, -30, true);
        return var4;
    }
}
