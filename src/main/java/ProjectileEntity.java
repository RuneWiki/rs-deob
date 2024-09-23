import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("eb")
public class ProjectileEntity extends Entity {

    @OriginalMember(owner = "eb", name = "l", descriptor = "Z")
    private boolean field496 = true;

    @OriginalMember(owner = "eb", name = "x", descriptor = "Z")
    public boolean field508 = false;

    @OriginalMember(owner = "eb", name = "m", descriptor = "Lnc;")
    private SpotAnimType field497;

    @OriginalMember(owner = "eb", name = "n", descriptor = "I")
    public int field498;

    @OriginalMember(owner = "eb", name = "o", descriptor = "I")
    public int field499;

    @OriginalMember(owner = "eb", name = "p", descriptor = "I")
    public int field500;

    @OriginalMember(owner = "eb", name = "q", descriptor = "I")
    public int field501;

    @OriginalMember(owner = "eb", name = "s", descriptor = "I")
    public int field503;

    @OriginalMember(owner = "eb", name = "t", descriptor = "I")
    public int field504;

    @OriginalMember(owner = "eb", name = "u", descriptor = "I")
    public int field505;

    @OriginalMember(owner = "eb", name = "v", descriptor = "I")
    public int field506;

    @OriginalMember(owner = "eb", name = "w", descriptor = "I")
    public int field507;

    @OriginalMember(owner = "eb", name = "r", descriptor = "I")
    public int field502;

    @OriginalMember(owner = "eb", name = "y", descriptor = "D")
    public double field509;

    @OriginalMember(owner = "eb", name = "z", descriptor = "D")
    public double field510;

    @OriginalMember(owner = "eb", name = "A", descriptor = "D")
    public double field511;

    @OriginalMember(owner = "eb", name = "B", descriptor = "D")
    private double field512;

    @OriginalMember(owner = "eb", name = "C", descriptor = "D")
    private double field513;

    @OriginalMember(owner = "eb", name = "D", descriptor = "D")
    private double field514;

    @OriginalMember(owner = "eb", name = "E", descriptor = "D")
    private double field515;

    @OriginalMember(owner = "eb", name = "F", descriptor = "D")
    private double field516;

    @OriginalMember(owner = "eb", name = "G", descriptor = "I")
    public int field517;

    @OriginalMember(owner = "eb", name = "H", descriptor = "I")
    public int field518;

    @OriginalMember(owner = "eb", name = "I", descriptor = "I")
    private int field519;

    @OriginalMember(owner = "eb", name = "J", descriptor = "I")
    private int field520;

    @OriginalMember(owner = "eb", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
    public ProjectileEntity(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        this.field497 = SpotAnimType.field1097[arg3];
        this.field498 = arg9;
        this.field499 = arg2;
        this.field500 = arg6;
        this.field501 = arg5;
        this.field503 = arg7;
        this.field504 = arg0;
        this.field505 = arg8;
        this.field506 = arg4;
        if (arg11 != 0) {
            for (int var13 = 1; var13 > 0; var13++) {
            }
        }
        this.field507 = arg10;
        this.field502 = arg1;
        this.field508 = false;
    }

    @OriginalMember(owner = "eb", name = "a", descriptor = "(IBIII)V")
    public final void method129(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 3) {
            return;
        }
        boolean var6 = false;
        if (!this.field508) {
            double var7 = (double) (arg4 - this.field499);
            double var9 = (double) (arg2 - this.field500);
            double var11 = Math.sqrt(var7 * var7 + var9 * var9);
            this.field509 = (double) this.field506 * var7 / var11 + (double) this.field499;
            this.field510 = (double) this.field506 * var9 / var11 + (double) this.field500;
            this.field511 = this.field501;
        }
        double var13 = (double) (this.field504 + 1 - arg3);
        this.field512 = ((double) arg4 - this.field509) / var13;
        this.field513 = ((double) arg2 - this.field510) / var13;
        this.field514 = Math.sqrt(this.field513 * this.field513 + this.field512 * this.field512);
        if (!this.field508) {
            this.field515 = -this.field514 * Math.tan((double) this.field505 * 0.02454369D);
        }
        this.field516 = ((double) arg0 - this.field511 - this.field515 * var13) * 2.0D / (var13 * var13);
    }

    @OriginalMember(owner = "eb", name = "a", descriptor = "(ZI)V")
    public final void method130(boolean arg0, int arg1) {
        this.field508 = true;
        this.field509 += (double) arg1 * this.field512;
        this.field510 += (double) arg1 * this.field513;
        this.field511 += this.field516 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field515;
        this.field515 += (double) arg1 * this.field516;
        this.field517 = (int) (Math.atan2(this.field512, this.field513) * 325.949D) + 1024 & 0x7FF;
        if (!arg0) {
            this.field496 = !this.field496;
        }
        this.field518 = (int) (Math.atan2(this.field515, this.field514) * 325.949D) & 0x7FF;
        if (this.field497.field1101 == null) {
            return;
        }
        this.field520 += arg1;
        while (this.field520 > this.field497.field1101.method373(true, this.field519)) {
            this.field520 -= this.field497.field1101.method373(true, this.field519) + 1;
            this.field519++;
            if (this.field519 >= this.field497.field1101.field1082) {
                this.field519 = 0;
            }
        }
    }

    @OriginalMember(owner = "eb", name = "a", descriptor = "(Z)Lfb;")
    public final Model method121(boolean arg0) {
        Model var2 = this.field497.method377();
        if (var2 == null) {
            return null;
        }
        Model var3 = new Model(-435, true, false, var2, !this.field497.field1102);
        if (this.field497.field1101 != null) {
            var3.method142(8);
            var3.method143(true, this.field497.field1101.field1083[this.field519]);
            var3.field566 = null;
            var3.field565 = null;
        }
        if (this.field497.field1105 != 128 || this.field497.field1106 != 128) {
            var3.method151(this.field497.field1106, this.field497.field1105, 0, this.field497.field1105);
        }
        var3.method147(true, this.field518);
        var3.method152(this.field497.field1108 + 64, this.field497.field1109 + 850, -30, -50, -30, true);
        if (arg0) {
            throw new NullPointerException();
        }
        return var3;
    }
}
