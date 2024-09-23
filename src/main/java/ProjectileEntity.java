import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("db")
public class ProjectileEntity extends Entity {

    @OriginalMember(owner = "db", name = "m", descriptor = "Z")
    private boolean field502 = true;

    @OriginalMember(owner = "db", name = "n", descriptor = "I")
    private int field503 = 5;

    @OriginalMember(owner = "db", name = "z", descriptor = "Z")
    public boolean field515 = false;

    @OriginalMember(owner = "db", name = "o", descriptor = "Lpc;")
    private SpotAnimType field504;

    @OriginalMember(owner = "db", name = "p", descriptor = "I")
    public int field505;

    @OriginalMember(owner = "db", name = "q", descriptor = "I")
    public int field506;

    @OriginalMember(owner = "db", name = "r", descriptor = "I")
    public int field507;

    @OriginalMember(owner = "db", name = "s", descriptor = "I")
    public int field508;

    @OriginalMember(owner = "db", name = "u", descriptor = "I")
    public int field510;

    @OriginalMember(owner = "db", name = "v", descriptor = "I")
    public int field511;

    @OriginalMember(owner = "db", name = "w", descriptor = "I")
    public int field512;

    @OriginalMember(owner = "db", name = "x", descriptor = "I")
    public int field513;

    @OriginalMember(owner = "db", name = "y", descriptor = "I")
    public int field514;

    @OriginalMember(owner = "db", name = "t", descriptor = "I")
    public int field509;

    @OriginalMember(owner = "db", name = "A", descriptor = "D")
    public double field516;

    @OriginalMember(owner = "db", name = "B", descriptor = "D")
    public double field517;

    @OriginalMember(owner = "db", name = "C", descriptor = "D")
    public double field518;

    @OriginalMember(owner = "db", name = "D", descriptor = "D")
    private double field519;

    @OriginalMember(owner = "db", name = "E", descriptor = "D")
    private double field520;

    @OriginalMember(owner = "db", name = "F", descriptor = "D")
    private double field521;

    @OriginalMember(owner = "db", name = "G", descriptor = "D")
    private double field522;

    @OriginalMember(owner = "db", name = "H", descriptor = "D")
    private double field523;

    @OriginalMember(owner = "db", name = "I", descriptor = "I")
    public int field524;

    @OriginalMember(owner = "db", name = "J", descriptor = "I")
    public int field525;

    @OriginalMember(owner = "db", name = "K", descriptor = "I")
    private int field526;

    @OriginalMember(owner = "db", name = "L", descriptor = "I")
    private int field527;

    @OriginalMember(owner = "db", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
    public ProjectileEntity(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        this.field504 = SpotAnimType.field1157[arg9];
        this.field505 = arg5;
        this.field506 = arg2;
        this.field507 = arg10;
        this.field508 = arg4;
        this.field510 = arg11;
        this.field511 = arg0;
        this.field512 = arg7;
        this.field513 = arg3;
        while (arg1 >= 0) {
            this.field503 = -137;
        }
        this.field514 = arg6;
        this.field509 = arg8;
        this.field515 = false;
    }

    @OriginalMember(owner = "db", name = "a", descriptor = "(IIIBI)V")
    public final void method120(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (!this.field515) {
            double var6 = (double) (arg4 - this.field506);
            double var8 = (double) (arg0 - this.field507);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field516 = (double) this.field513 * var6 / var10 + (double) this.field506;
            this.field517 = (double) this.field513 * var8 / var10 + (double) this.field507;
            this.field518 = this.field508;
        }
        double var12 = (double) (this.field511 + 1 - arg1);
        if (arg3 == 6) {
            boolean var14 = false;
        } else {
            for (int var15 = 1; var15 > 0; var15++) {
            }
        }
        this.field519 = ((double) arg4 - this.field516) / var12;
        this.field520 = ((double) arg0 - this.field517) / var12;
        this.field521 = Math.sqrt(this.field520 * this.field520 + this.field519 * this.field519);
        if (!this.field515) {
            this.field522 = -this.field521 * Math.tan((double) this.field512 * 0.02454369D);
        }
        this.field523 = ((double) arg2 - this.field518 - this.field522 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "db", name = "a", descriptor = "(IZ)V")
    public final void method121(int arg0, boolean arg1) {
        if (arg1) {
            this.field502 = !this.field502;
        }
        this.field515 = true;
        this.field516 += (double) arg0 * this.field519;
        this.field517 += (double) arg0 * this.field520;
        this.field518 += this.field523 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field522;
        this.field522 += (double) arg0 * this.field523;
        this.field524 = (int) (Math.atan2(this.field519, this.field520) * 325.949D) + 1024 & 0x7FF;
        this.field525 = (int) (Math.atan2(this.field522, this.field521) * 325.949D) & 0x7FF;
        if (this.field504.field1161 == null) {
            return;
        }
        this.field527 += arg0;
        while (this.field527 > this.field504.field1161.method382(this.field526, 0)) {
            this.field527 -= this.field504.field1161.method382(this.field526, 0) + 1;
            this.field526++;
            if (this.field526 >= this.field504.field1161.field1136) {
                this.field526 = 0;
            }
        }
    }

    @OriginalMember(owner = "db", name = "a", descriptor = "(B)Leb;")
    public final Model method109(byte arg0) {
        if (arg0 != -67) {
            this.field502 = !this.field502;
        }
        Model var2 = this.field504.method386();
        if (var2 == null) {
            return null;
        }
        int var3 = -1;
        if (this.field504.field1161 != null) {
            var3 = this.field504.field1161.field1137[this.field526];
        }
        Model var4 = new Model(false, true, AnimFrame.method48(4, var3), var2, 396);
        if (var3 != -1) {
            var4.method133(false);
            var4.method134(2, var3);
            var4.field573 = null;
            var4.field572 = null;
        }
        if (this.field504.field1164 != 128 || this.field504.field1165 != 128) {
            var4.method142(this.field504.field1164, this.field504.field1164, this.field504.field1165, 0);
        }
        var4.method138(this.field525, -27172);
        var4.method143(this.field504.field1167 + 64, this.field504.field1168 + 850, -30, -50, -30, true);
        return var4;
    }
}
