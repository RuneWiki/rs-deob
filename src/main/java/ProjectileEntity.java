import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("eb")
public class ProjectileEntity extends Entity {

    @OriginalMember(owner = "eb", name = "l", descriptor = "Z")
    private boolean field489 = false;

    @OriginalMember(owner = "eb", name = "n", descriptor = "I")
    private int field491 = 668;

    @OriginalMember(owner = "eb", name = "z", descriptor = "Z")
    public boolean field503 = false;

    @OriginalMember(owner = "eb", name = "o", descriptor = "Lnc;")
    private SpotAnimType field492;

    @OriginalMember(owner = "eb", name = "p", descriptor = "I")
    public int field493;

    @OriginalMember(owner = "eb", name = "q", descriptor = "I")
    public int field494;

    @OriginalMember(owner = "eb", name = "r", descriptor = "I")
    public int field495;

    @OriginalMember(owner = "eb", name = "s", descriptor = "I")
    public int field496;

    @OriginalMember(owner = "eb", name = "u", descriptor = "I")
    public int field498;

    @OriginalMember(owner = "eb", name = "v", descriptor = "I")
    public int field499;

    @OriginalMember(owner = "eb", name = "w", descriptor = "I")
    public int field500;

    @OriginalMember(owner = "eb", name = "x", descriptor = "I")
    public int field501;

    @OriginalMember(owner = "eb", name = "y", descriptor = "I")
    public int field502;

    @OriginalMember(owner = "eb", name = "t", descriptor = "I")
    public int field497;

    @OriginalMember(owner = "eb", name = "A", descriptor = "D")
    public double field504;

    @OriginalMember(owner = "eb", name = "B", descriptor = "D")
    public double field505;

    @OriginalMember(owner = "eb", name = "C", descriptor = "D")
    public double field506;

    @OriginalMember(owner = "eb", name = "D", descriptor = "D")
    private double field507;

    @OriginalMember(owner = "eb", name = "E", descriptor = "D")
    private double field508;

    @OriginalMember(owner = "eb", name = "F", descriptor = "D")
    private double field509;

    @OriginalMember(owner = "eb", name = "G", descriptor = "D")
    private double field510;

    @OriginalMember(owner = "eb", name = "H", descriptor = "D")
    private double field511;

    @OriginalMember(owner = "eb", name = "m", descriptor = "I")
    private int field490;

    @OriginalMember(owner = "eb", name = "I", descriptor = "I")
    public int field512;

    @OriginalMember(owner = "eb", name = "J", descriptor = "I")
    public int field513;

    @OriginalMember(owner = "eb", name = "K", descriptor = "I")
    private int field514;

    @OriginalMember(owner = "eb", name = "L", descriptor = "I")
    private int field515;

    @OriginalMember(owner = "eb", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
    public ProjectileEntity(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        if (arg3 < 9 || arg3 > 9) {
            this.field491 = -333;
        }
        this.field492 = SpotAnimType.field1084[arg9];
        this.field493 = arg8;
        this.field494 = arg6;
        this.field495 = arg5;
        this.field496 = arg10;
        this.field498 = arg2;
        this.field499 = arg7;
        this.field500 = arg4;
        this.field501 = arg1;
        this.field502 = arg0;
        this.field497 = arg11;
        this.field503 = false;
    }

    @OriginalMember(owner = "eb", name = "a", descriptor = "(IIIII)V")
    public final void method129(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = 31 / arg0;
        if (!this.field503) {
            double var7 = (double) (arg1 - this.field494);
            double var9 = (double) (arg4 - this.field495);
            double var11 = Math.sqrt(var7 * var7 + var9 * var9);
            this.field504 = (double) this.field501 * var7 / var11 + (double) this.field494;
            this.field505 = (double) this.field501 * var9 / var11 + (double) this.field495;
            this.field506 = this.field496;
        }
        double var13 = (double) (this.field499 + 1 - arg2);
        this.field507 = ((double) arg1 - this.field504) / var13;
        this.field508 = ((double) arg4 - this.field505) / var13;
        this.field509 = Math.sqrt(this.field508 * this.field508 + this.field507 * this.field507);
        if (!this.field503) {
            this.field510 = -this.field509 * Math.tan((double) this.field500 * 0.02454369D);
        }
        this.field511 = ((double) arg3 - this.field506 - this.field510 * var13) * 2.0D / (var13 * var13);
    }

    @OriginalMember(owner = "eb", name = "a", descriptor = "(II)V")
    public final void method130(int arg0, int arg1) {
        this.field503 = true;
        this.field504 += (double) arg0 * this.field507;
        if (arg1 < 6 || arg1 > 6) {
            this.field490 = -135;
        }
        this.field505 += (double) arg0 * this.field508;
        this.field506 += this.field511 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field510;
        this.field510 += (double) arg0 * this.field511;
        this.field512 = (int) (Math.atan2(this.field507, this.field508) * 325.949D) + 1024 & 0x7FF;
        this.field513 = (int) (Math.atan2(this.field510, this.field509) * 325.949D) & 0x7FF;
        if (this.field492.field1088 == null) {
            return;
        }
        this.field515 += arg0;
        while (this.field515 > this.field492.field1088.method369(7, this.field514)) {
            this.field515 -= this.field492.field1088.method369(7, this.field514) + 1;
            this.field514++;
            if (this.field514 >= this.field492.field1088.field1070) {
                this.field514 = 0;
            }
        }
    }

    @OriginalMember(owner = "eb", name = "a", descriptor = "(I)Lfb;")
    public final Model method121(int arg0) {
        Model var2 = this.field492.method373();
        if (var2 == null) {
            return null;
        }
        Model var3 = new Model(8, true, !this.field492.field1089, false, var2);
        if (this.field492.field1088 != null) {
            var3.method142((byte) 9);
            var3.method143(this.field492.field1088.field1071[this.field514], false);
            var3.field557 = null;
            var3.field556 = null;
        }
        if (this.field492.field1092 != 128 || this.field492.field1093 != 128) {
            var3.method151(this.field492.field1092, this.field492.field1092, this.field492.field1093, -797);
        }
        var3.method147(1, this.field513);
        if (arg0 != 0) {
            this.field489 = !this.field489;
        }
        var3.method152(this.field492.field1095 + 64, this.field492.field1096 + 850, -30, -50, -30, true);
        return var3;
    }
}
