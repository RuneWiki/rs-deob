import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("db")
public class ProjectileEntity extends Entity {

    @OriginalMember(owner = "db", name = "m", descriptor = "I")
    private int field501 = 9;

    @OriginalMember(owner = "db", name = "n", descriptor = "Z")
    private boolean field502 = false;

    @OriginalMember(owner = "db", name = "o", descriptor = "Z")
    private boolean field503 = true;

    @OriginalMember(owner = "db", name = "A", descriptor = "Z")
    public boolean field515 = false;

    @OriginalMember(owner = "db", name = "p", descriptor = "Lqc;")
    private SpotAnimType field504;

    @OriginalMember(owner = "db", name = "q", descriptor = "I")
    public int field505;

    @OriginalMember(owner = "db", name = "r", descriptor = "I")
    public int field506;

    @OriginalMember(owner = "db", name = "s", descriptor = "I")
    public int field507;

    @OriginalMember(owner = "db", name = "t", descriptor = "I")
    public int field508;

    @OriginalMember(owner = "db", name = "v", descriptor = "I")
    public int field510;

    @OriginalMember(owner = "db", name = "w", descriptor = "I")
    public int field511;

    @OriginalMember(owner = "db", name = "x", descriptor = "I")
    public int field512;

    @OriginalMember(owner = "db", name = "y", descriptor = "I")
    public int field513;

    @OriginalMember(owner = "db", name = "z", descriptor = "I")
    public int field514;

    @OriginalMember(owner = "db", name = "u", descriptor = "I")
    public int field509;

    @OriginalMember(owner = "db", name = "B", descriptor = "D")
    public double field516;

    @OriginalMember(owner = "db", name = "C", descriptor = "D")
    public double field517;

    @OriginalMember(owner = "db", name = "D", descriptor = "D")
    public double field518;

    @OriginalMember(owner = "db", name = "E", descriptor = "D")
    private double field519;

    @OriginalMember(owner = "db", name = "F", descriptor = "D")
    private double field520;

    @OriginalMember(owner = "db", name = "G", descriptor = "D")
    private double field521;

    @OriginalMember(owner = "db", name = "H", descriptor = "D")
    private double field522;

    @OriginalMember(owner = "db", name = "I", descriptor = "D")
    private double field523;

    @OriginalMember(owner = "db", name = "l", descriptor = "I")
    private int field500;

    @OriginalMember(owner = "db", name = "J", descriptor = "I")
    public int field524;

    @OriginalMember(owner = "db", name = "K", descriptor = "I")
    public int field525;

    @OriginalMember(owner = "db", name = "L", descriptor = "I")
    private int field526;

    @OriginalMember(owner = "db", name = "M", descriptor = "I")
    private int field527;

    @OriginalMember(owner = "db", name = "<init>", descriptor = "(IIIIIIIIIIZI)V")
    public ProjectileEntity(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, int arg11) {
        this.field504 = SpotAnimType.field1158[arg0];
        if (!arg10) {
            this.field502 = !this.field502;
        }
        this.field505 = arg5;
        this.field506 = arg9;
        this.field507 = arg3;
        this.field508 = arg4;
        this.field510 = arg1;
        this.field511 = arg8;
        this.field512 = arg6;
        this.field513 = arg11;
        this.field514 = arg2;
        this.field509 = arg7;
        this.field515 = false;
    }

    @OriginalMember(owner = "db", name = "a", descriptor = "(IIIII)V")
    public final void method119(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!this.field515) {
            double var6 = (double) (arg0 - this.field506);
            double var8 = (double) (arg3 - this.field507);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field516 = (double) this.field513 * var6 / var10 + (double) this.field506;
            this.field517 = (double) this.field513 * var8 / var10 + (double) this.field507;
            this.field518 = this.field508;
        }
        double var12 = (double) (this.field511 + 1 - arg4);
        if (arg1 != 0) {
            this.field501 = -479;
        }
        this.field519 = ((double) arg0 - this.field516) / var12;
        this.field520 = ((double) arg3 - this.field517) / var12;
        this.field521 = Math.sqrt(this.field520 * this.field520 + this.field519 * this.field519);
        if (!this.field515) {
            this.field522 = -this.field521 * Math.tan((double) this.field512 * 0.02454369D);
        }
        this.field523 = ((double) arg2 - this.field518 - this.field522 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "db", name = "a", descriptor = "(ZI)V")
    public final void method120(boolean arg0, int arg1) {
        if (!arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field515 = true;
        this.field516 += (double) arg1 * this.field519;
        this.field517 += (double) arg1 * this.field520;
        this.field518 += this.field523 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field522;
        this.field522 += (double) arg1 * this.field523;
        this.field524 = (int) (Math.atan2(this.field519, this.field520) * 325.949D) + 1024 & 0x7FF;
        this.field525 = (int) (Math.atan2(this.field522, this.field521) * 325.949D) & 0x7FF;
        if (this.field504.field1162 == null) {
            return;
        }
        this.field527 += arg1;
        while (this.field527 > this.field504.field1162.method379(1, this.field526)) {
            this.field527 -= this.field504.field1162.method379(1, this.field526) + 1;
            this.field526++;
            if (this.field526 >= this.field504.field1162.field1137) {
                this.field526 = 0;
            }
        }
    }

    @OriginalMember(owner = "db", name = "a", descriptor = "(I)Leb;")
    public final Model method109(int arg0) {
        Model var2 = this.field504.method383();
        if (var2 == null) {
            return null;
        }
        int var3 = -1;
        if (arg0 != -21173) {
            throw new NullPointerException();
        }
        if (this.field504.field1162 != null) {
            var3 = this.field504.field1162.field1138[this.field526];
        }
        Model var4 = new Model(false, -164, var2, true, AnimFrame.method48(var3, 62));
        if (var3 != -1) {
            var4.method132(this.field500);
            var4.method133(-278, var3);
            var4.field572 = null;
            var4.field571 = null;
        }
        if (this.field504.field1165 != 128 || this.field504.field1166 != 128) {
            var4.method141(this.field504.field1165, false, this.field504.field1165, this.field504.field1166);
        }
        var4.method137(this.field525, 0);
        var4.method142(this.field504.field1168 + 64, this.field504.field1169 + 850, -30, -50, -30, true);
        return var4;
    }
}
