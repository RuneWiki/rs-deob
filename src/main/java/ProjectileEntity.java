import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("db")
public class ProjectileEntity extends Entity {

    @OriginalMember(owner = "db", name = "o", descriptor = "Z")
    private boolean field500 = true;

    @OriginalMember(owner = "db", name = "p", descriptor = "Z")
    private boolean field501 = false;

    @OriginalMember(owner = "db", name = "B", descriptor = "Z")
    public boolean field513 = false;

    @OriginalMember(owner = "db", name = "q", descriptor = "Lpc;")
    private SpotAnimType field502;

    @OriginalMember(owner = "db", name = "r", descriptor = "I")
    public int field503;

    @OriginalMember(owner = "db", name = "s", descriptor = "I")
    public int field504;

    @OriginalMember(owner = "db", name = "t", descriptor = "I")
    public int field505;

    @OriginalMember(owner = "db", name = "u", descriptor = "I")
    public int field506;

    @OriginalMember(owner = "db", name = "w", descriptor = "I")
    public int field508;

    @OriginalMember(owner = "db", name = "x", descriptor = "I")
    public int field509;

    @OriginalMember(owner = "db", name = "y", descriptor = "I")
    public int field510;

    @OriginalMember(owner = "db", name = "z", descriptor = "I")
    public int field511;

    @OriginalMember(owner = "db", name = "A", descriptor = "I")
    public int field512;

    @OriginalMember(owner = "db", name = "v", descriptor = "I")
    public int field507;

    @OriginalMember(owner = "db", name = "C", descriptor = "D")
    public double field514;

    @OriginalMember(owner = "db", name = "D", descriptor = "D")
    public double field515;

    @OriginalMember(owner = "db", name = "E", descriptor = "D")
    public double field516;

    @OriginalMember(owner = "db", name = "F", descriptor = "D")
    private double field517;

    @OriginalMember(owner = "db", name = "G", descriptor = "D")
    private double field518;

    @OriginalMember(owner = "db", name = "H", descriptor = "D")
    private double field519;

    @OriginalMember(owner = "db", name = "I", descriptor = "D")
    private double field520;

    @OriginalMember(owner = "db", name = "J", descriptor = "D")
    private double field521;

    @OriginalMember(owner = "db", name = "K", descriptor = "I")
    public int field522;

    @OriginalMember(owner = "db", name = "L", descriptor = "I")
    public int field523;

    @OriginalMember(owner = "db", name = "M", descriptor = "I")
    private int field524;

    @OriginalMember(owner = "db", name = "N", descriptor = "I")
    private int field525;

    @OriginalMember(owner = "db", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
    public ProjectileEntity(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        this.field502 = SpotAnimType.field1157[arg5];
        if (arg9 != 0) {
            this.field500 = !this.field500;
        }
        this.field503 = arg1;
        this.field504 = arg2;
        this.field505 = arg3;
        this.field506 = arg6;
        this.field508 = arg0;
        this.field509 = arg4;
        this.field510 = arg8;
        this.field511 = arg7;
        this.field512 = arg11;
        this.field507 = arg10;
        this.field513 = false;
    }

    @OriginalMember(owner = "db", name = "a", descriptor = "(IIIZI)V")
    public final void method120(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (!this.field513) {
            double var6 = (double) (arg2 - this.field504);
            double var8 = (double) (arg0 - this.field505);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field514 = (double) this.field511 * var6 / var10 + (double) this.field504;
            this.field515 = (double) this.field511 * var8 / var10 + (double) this.field505;
            this.field516 = this.field506;
        }
        double var12 = (double) (this.field509 + 1 - arg1);
        this.field517 = ((double) arg2 - this.field514) / var12;
        if (arg3) {
            this.field500 = !this.field500;
        }
        this.field518 = ((double) arg0 - this.field515) / var12;
        this.field519 = Math.sqrt(this.field518 * this.field518 + this.field517 * this.field517);
        if (!this.field513) {
            this.field520 = -this.field519 * Math.tan((double) this.field510 * 0.02454369D);
        }
        this.field521 = ((double) arg4 - this.field516 - this.field520 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "db", name = "a", descriptor = "(II)V")
    public final void method121(int arg0, int arg1) {
        this.field513 = true;
        this.field514 += (double) arg1 * this.field517;
        this.field515 += (double) arg1 * this.field518;
        this.field516 += this.field521 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field520;
        if (arg0 >= 0) {
            return;
        }
        this.field520 += (double) arg1 * this.field521;
        this.field522 = (int) (Math.atan2(this.field517, this.field518) * 325.949D) + 1024 & 0x7FF;
        this.field523 = (int) (Math.atan2(this.field520, this.field519) * 325.949D) & 0x7FF;
        if (this.field502.field1161 == null) {
            return;
        }
        this.field525 += arg1;
        while (this.field525 > this.field502.field1161.method382(36967, this.field524)) {
            this.field525 -= this.field502.field1161.method382(36967, this.field524) + 1;
            this.field524++;
            if (this.field524 >= this.field502.field1161.field1135) {
                this.field524 = 0;
            }
        }
    }

    @OriginalMember(owner = "db", name = "a", descriptor = "(I)Leb;")
    public final Model method109(int arg0) {
        Model var2 = this.field502.method386();
        if (var2 == null) {
            return null;
        }
        int var3 = -1;
        if (this.field502.field1161 != null) {
            var3 = this.field502.field1161.field1136[this.field524];
        }
        Model var4 = new Model(var2, true, false, AnimFrame.method48(var3, -47594), 0);
        if (arg0 != 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (var3 != -1) {
            var4.method133(0);
            var4.method134(428, var3);
            var4.field570 = null;
            var4.field569 = null;
        }
        if (this.field502.field1164 != 128 || this.field502.field1165 != 128) {
            var4.method142((byte) 4, this.field502.field1165, this.field502.field1164, this.field502.field1164);
        }
        var4.method138(1, this.field523);
        var4.method143(this.field502.field1167 + 64, this.field502.field1168 + 850, -30, -50, -30, true);
        return var4;
    }
}
