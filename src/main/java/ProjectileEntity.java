import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("db")
public class ProjectileEntity extends Entity {

    @OriginalMember(owner = "db", name = "n", descriptor = "Z")
    private boolean field497 = false;

    @OriginalMember(owner = "db", name = "z", descriptor = "Z")
    public boolean field509 = false;

    @OriginalMember(owner = "db", name = "o", descriptor = "Lpc;")
    private SpotAnimType field498;

    @OriginalMember(owner = "db", name = "p", descriptor = "I")
    public int field499;

    @OriginalMember(owner = "db", name = "q", descriptor = "I")
    public int field500;

    @OriginalMember(owner = "db", name = "r", descriptor = "I")
    public int field501;

    @OriginalMember(owner = "db", name = "s", descriptor = "I")
    public int field502;

    @OriginalMember(owner = "db", name = "u", descriptor = "I")
    public int field504;

    @OriginalMember(owner = "db", name = "v", descriptor = "I")
    public int field505;

    @OriginalMember(owner = "db", name = "w", descriptor = "I")
    public int field506;

    @OriginalMember(owner = "db", name = "x", descriptor = "I")
    public int field507;

    @OriginalMember(owner = "db", name = "y", descriptor = "I")
    public int field508;

    @OriginalMember(owner = "db", name = "t", descriptor = "I")
    public int field503;

    @OriginalMember(owner = "db", name = "A", descriptor = "D")
    public double field510;

    @OriginalMember(owner = "db", name = "B", descriptor = "D")
    public double field511;

    @OriginalMember(owner = "db", name = "C", descriptor = "D")
    public double field512;

    @OriginalMember(owner = "db", name = "D", descriptor = "D")
    private double field513;

    @OriginalMember(owner = "db", name = "E", descriptor = "D")
    private double field514;

    @OriginalMember(owner = "db", name = "F", descriptor = "D")
    private double field515;

    @OriginalMember(owner = "db", name = "G", descriptor = "D")
    private double field516;

    @OriginalMember(owner = "db", name = "H", descriptor = "D")
    private double field517;

    @OriginalMember(owner = "db", name = "m", descriptor = "I")
    private int field496;

    @OriginalMember(owner = "db", name = "I", descriptor = "I")
    public int field518;

    @OriginalMember(owner = "db", name = "J", descriptor = "I")
    public int field519;

    @OriginalMember(owner = "db", name = "K", descriptor = "I")
    private int field520;

    @OriginalMember(owner = "db", name = "L", descriptor = "I")
    private int field521;

    @OriginalMember(owner = "db", name = "<init>", descriptor = "(IIIIIIIIZIII)V")
    public ProjectileEntity(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10, int arg11) {
        this.field498 = SpotAnimType.field1154[arg7];
        this.field499 = arg6;
        this.field500 = arg0;
        this.field501 = arg11;
        this.field502 = arg9;
        this.field504 = arg5;
        this.field505 = arg3;
        this.field506 = arg4;
        this.field507 = arg1;
        this.field508 = arg10;
        this.field503 = arg2;
        this.field509 = false;
        if (!arg8) {
            this.field497 = !this.field497;
        }
    }

    @OriginalMember(owner = "db", name = "a", descriptor = "(IIIBI)V")
    public final void method119(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (!this.field509) {
            double var6 = (double) (arg2 - this.field500);
            double var8 = (double) (arg4 - this.field501);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field510 = (double) this.field507 * var6 / var10 + (double) this.field500;
            this.field511 = (double) this.field507 * var8 / var10 + (double) this.field501;
            this.field512 = this.field502;
        }
        double var12 = (double) (this.field505 + 1 - arg0);
        this.field513 = ((double) arg2 - this.field510) / var12;
        if (arg3 != 7) {
            return;
        }
        this.field514 = ((double) arg4 - this.field511) / var12;
        this.field515 = Math.sqrt(this.field514 * this.field514 + this.field513 * this.field513);
        if (!this.field509) {
            this.field516 = -this.field515 * Math.tan((double) this.field506 * 0.02454369D);
        }
        this.field517 = ((double) arg1 - this.field512 - this.field516 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "db", name = "a", descriptor = "(IZ)V")
    public final void method120(int arg0, boolean arg1) {
        this.field509 = true;
        this.field510 += (double) arg0 * this.field513;
        this.field511 += (double) arg0 * this.field514;
        this.field512 += this.field517 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field516;
        this.field516 += (double) arg0 * this.field517;
        this.field518 = (int) (Math.atan2(this.field513, this.field514) * 325.949D) + 1024 & 0x7FF;
        if (!arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field519 = (int) (Math.atan2(this.field516, this.field515) * 325.949D) & 0x7FF;
        if (this.field498.field1158 == null) {
            return;
        }
        this.field521 += arg0;
        while (this.field521 > this.field498.field1158.method375(this.field520, 41645)) {
            this.field521 -= this.field498.field1158.method375(this.field520, 41645) + 1;
            this.field520++;
            if (this.field520 >= this.field498.field1158.field1134) {
                this.field520 = 0;
            }
        }
    }

    @OriginalMember(owner = "db", name = "a", descriptor = "(Z)Leb;")
    public final Model method109(boolean arg0) {
        Model var2 = this.field498.method379();
        if (arg0) {
            this.field496 = 341;
        }
        if (var2 == null) {
            return null;
        }
        int var3 = -1;
        if (this.field498.field1158 != null) {
            var3 = this.field498.field1158.field1135[this.field520];
        }
        Model var4 = new Model(true, AnimFrame.method48(var3, 0), var2, true, false);
        if (var3 != -1) {
            var4.method132(9);
            var4.method133(var3, -284);
            var4.field568 = null;
            var4.field567 = null;
        }
        if (this.field498.field1161 != 128 || this.field498.field1162 != 128) {
            var4.method141(9, this.field498.field1161, this.field498.field1161, this.field498.field1162);
        }
        var4.method137((byte) -44, this.field519);
        var4.method142(this.field498.field1164 + 64, this.field498.field1165 + 850, -30, -50, -30, true);
        return var4;
    }
}
