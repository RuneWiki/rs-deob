import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("db")
public class ProjectileEntity extends Entity {

    @OriginalMember(owner = "db", name = "l", descriptor = "Z")
    private boolean field493 = false;

    @OriginalMember(owner = "db", name = "m", descriptor = "I")
    private int field494 = 100;

    @OriginalMember(owner = "db", name = "y", descriptor = "Z")
    public boolean field506 = false;

    @OriginalMember(owner = "db", name = "n", descriptor = "Lpc;")
    private SpotAnimType field495;

    @OriginalMember(owner = "db", name = "o", descriptor = "I")
    public int field496;

    @OriginalMember(owner = "db", name = "p", descriptor = "I")
    public int field497;

    @OriginalMember(owner = "db", name = "q", descriptor = "I")
    public int field498;

    @OriginalMember(owner = "db", name = "r", descriptor = "I")
    public int field499;

    @OriginalMember(owner = "db", name = "t", descriptor = "I")
    public int field501;

    @OriginalMember(owner = "db", name = "u", descriptor = "I")
    public int field502;

    @OriginalMember(owner = "db", name = "v", descriptor = "I")
    public int field503;

    @OriginalMember(owner = "db", name = "w", descriptor = "I")
    public int field504;

    @OriginalMember(owner = "db", name = "x", descriptor = "I")
    public int field505;

    @OriginalMember(owner = "db", name = "s", descriptor = "I")
    public int field500;

    @OriginalMember(owner = "db", name = "z", descriptor = "D")
    public double field507;

    @OriginalMember(owner = "db", name = "A", descriptor = "D")
    public double field508;

    @OriginalMember(owner = "db", name = "B", descriptor = "D")
    public double field509;

    @OriginalMember(owner = "db", name = "C", descriptor = "D")
    private double field510;

    @OriginalMember(owner = "db", name = "D", descriptor = "D")
    private double field511;

    @OriginalMember(owner = "db", name = "E", descriptor = "D")
    private double field512;

    @OriginalMember(owner = "db", name = "F", descriptor = "D")
    private double field513;

    @OriginalMember(owner = "db", name = "G", descriptor = "D")
    private double field514;

    @OriginalMember(owner = "db", name = "H", descriptor = "I")
    public int field515;

    @OriginalMember(owner = "db", name = "I", descriptor = "I")
    public int field516;

    @OriginalMember(owner = "db", name = "J", descriptor = "I")
    private int field517;

    @OriginalMember(owner = "db", name = "K", descriptor = "I")
    private int field518;

    @OriginalMember(owner = "db", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
    public ProjectileEntity(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        this.field495 = SpotAnimType.field1153[arg6];
        this.field496 = arg10;
        this.field497 = arg11;
        this.field498 = arg0;
        this.field499 = arg4;
        this.field501 = arg9;
        this.field502 = arg5;
        this.field503 = arg1;
        this.field504 = arg7;
        if (arg8 != 0) {
            this.field493 = !this.field493;
        }
        this.field505 = arg3;
        this.field500 = arg2;
        this.field506 = false;
    }

    @OriginalMember(owner = "db", name = "a", descriptor = "(IIIII)V")
    public final void method119(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!this.field506) {
            double var6 = (double) (arg3 - this.field497);
            double var8 = (double) (arg2 - this.field498);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field507 = (double) this.field504 * var6 / var10 + (double) this.field497;
            this.field508 = (double) this.field504 * var8 / var10 + (double) this.field498;
            this.field509 = this.field499;
        }
        double var12 = (double) (this.field502 + 1 - arg1);
        this.field510 = ((double) arg3 - this.field507) / var12;
        this.field511 = ((double) arg2 - this.field508) / var12;
        this.field512 = Math.sqrt(this.field511 * this.field511 + this.field510 * this.field510);
        if (arg4 < 0) {
            if (!this.field506) {
                this.field513 = -this.field512 * Math.tan((double) this.field503 * 0.02454369D);
            }
            this.field514 = ((double) arg0 - this.field509 - this.field513 * var12) * 2.0D / (var12 * var12);
        }
    }

    @OriginalMember(owner = "db", name = "a", descriptor = "(II)V")
    public final void method120(int arg0, int arg1) {
        this.field506 = true;
        if (arg0 <= 0) {
            this.field493 = !this.field493;
        }
        this.field507 += (double) arg1 * this.field510;
        this.field508 += (double) arg1 * this.field511;
        this.field509 += this.field514 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field513;
        this.field513 += (double) arg1 * this.field514;
        this.field515 = (int) (Math.atan2(this.field510, this.field511) * 325.949D) + 1024 & 0x7FF;
        this.field516 = (int) (Math.atan2(this.field513, this.field512) * 325.949D) & 0x7FF;
        if (this.field495.field1157 == null) {
            return;
        }
        this.field518 += arg1;
        while (this.field518 > this.field495.field1157.method375(0, this.field517)) {
            this.field518 -= this.field495.field1157.method375(0, this.field517) + 1;
            this.field517++;
            if (this.field517 >= this.field495.field1157.field1132) {
                this.field517 = 0;
            }
        }
    }

    @OriginalMember(owner = "db", name = "a", descriptor = "(I)Leb;")
    public final Model method109(int arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        Model var3 = this.field495.method379();
        if (var3 == null) {
            return null;
        }
        int var4 = -1;
        if (this.field495.field1157 != null) {
            var4 = this.field495.field1157.field1133[this.field517];
        }
        Model var5 = new Model(false, true, var3, AnimFrame.method48(var4, 681), 9);
        if (var4 != -1) {
            var5.method132(1);
            var5.method133(var4, false);
            var5.field564 = null;
            var5.field563 = null;
        }
        if (this.field495.field1160 != 128 || this.field495.field1161 != 128) {
            var5.method141(this.field495.field1160, this.field495.field1161, 9, this.field495.field1160);
        }
        var5.method137(0, this.field516);
        var5.method142(this.field495.field1163 + 64, this.field495.field1164 + 850, -30, -50, -30, true);
        return var5;
    }
}
