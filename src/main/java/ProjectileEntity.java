import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("db")
public class ProjectileEntity extends Entity {

    @OriginalMember(owner = "db", name = "l", descriptor = "I")
    private int field506 = 5;

    @OriginalMember(owner = "db", name = "m", descriptor = "I")
    private int field507 = 7;

    @OriginalMember(owner = "db", name = "y", descriptor = "Z")
    public boolean field519 = false;

    @OriginalMember(owner = "db", name = "n", descriptor = "Lpc;")
    private SpotAnimType field508;

    @OriginalMember(owner = "db", name = "o", descriptor = "I")
    public int field509;

    @OriginalMember(owner = "db", name = "p", descriptor = "I")
    public int field510;

    @OriginalMember(owner = "db", name = "q", descriptor = "I")
    public int field511;

    @OriginalMember(owner = "db", name = "r", descriptor = "I")
    public int field512;

    @OriginalMember(owner = "db", name = "t", descriptor = "I")
    public int field514;

    @OriginalMember(owner = "db", name = "u", descriptor = "I")
    public int field515;

    @OriginalMember(owner = "db", name = "v", descriptor = "I")
    public int field516;

    @OriginalMember(owner = "db", name = "w", descriptor = "I")
    public int field517;

    @OriginalMember(owner = "db", name = "x", descriptor = "I")
    public int field518;

    @OriginalMember(owner = "db", name = "s", descriptor = "I")
    public int field513;

    @OriginalMember(owner = "db", name = "z", descriptor = "D")
    public double field520;

    @OriginalMember(owner = "db", name = "A", descriptor = "D")
    public double field521;

    @OriginalMember(owner = "db", name = "B", descriptor = "D")
    public double field522;

    @OriginalMember(owner = "db", name = "C", descriptor = "D")
    private double field523;

    @OriginalMember(owner = "db", name = "D", descriptor = "D")
    private double field524;

    @OriginalMember(owner = "db", name = "E", descriptor = "D")
    private double field525;

    @OriginalMember(owner = "db", name = "F", descriptor = "D")
    private double field526;

    @OriginalMember(owner = "db", name = "G", descriptor = "D")
    private double field527;

    @OriginalMember(owner = "db", name = "H", descriptor = "I")
    public int field528;

    @OriginalMember(owner = "db", name = "I", descriptor = "I")
    public int field529;

    @OriginalMember(owner = "db", name = "J", descriptor = "I")
    private int field530;

    @OriginalMember(owner = "db", name = "K", descriptor = "I")
    private int field531;

    @OriginalMember(owner = "db", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
    public ProjectileEntity(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        this.field508 = SpotAnimType.field1166[arg7];
        this.field509 = arg6;
        this.field510 = arg5;
        this.field511 = arg9;
        this.field512 = arg0;
        this.field514 = arg11;
        this.field515 = arg10;
        this.field516 = arg3;
        this.field517 = arg2;
        this.field518 = arg4;
        if (arg1 != 1) {
            this.field506 = -480;
        }
        this.field513 = arg8;
        this.field519 = false;
    }

    @OriginalMember(owner = "db", name = "a", descriptor = "(IZIII)V")
    public final void method120(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (!this.field519) {
            double var6 = (double) (arg4 - this.field510);
            double var8 = (double) (arg3 - this.field511);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field520 = (double) this.field517 * var6 / var10 + (double) this.field510;
            this.field521 = (double) this.field517 * var8 / var10 + (double) this.field511;
            this.field522 = this.field512;
        }
        double var12 = (double) (this.field515 + 1 - arg0);
        this.field523 = ((double) arg4 - this.field520) / var12;
        this.field524 = ((double) arg3 - this.field521) / var12;
        this.field525 = Math.sqrt(this.field524 * this.field524 + this.field523 * this.field523);
        if (!arg1) {
            for (int var14 = 1; var14 > 0; var14++) {
            }
        }
        if (!this.field519) {
            this.field526 = -this.field525 * Math.tan((double) this.field516 * 0.02454369D);
        }
        this.field527 = ((double) arg2 - this.field522 - this.field526 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "db", name = "a", descriptor = "(II)V")
    public final void method121(int arg0, int arg1) {
        this.field519 = true;
        this.field520 += (double) arg1 * this.field523;
        if (arg0 < this.field507 || arg0 > this.field507) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field521 += (double) arg1 * this.field524;
        this.field522 += this.field527 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field526;
        this.field526 += (double) arg1 * this.field527;
        this.field528 = (int) (Math.atan2(this.field523, this.field524) * 325.949D) + 1024 & 0x7FF;
        this.field529 = (int) (Math.atan2(this.field526, this.field525) * 325.949D) & 0x7FF;
        if (this.field508.field1170 == null) {
            return;
        }
        this.field531 += arg1;
        while (this.field531 > this.field508.field1170.method382(this.field530, -86)) {
            this.field531 -= this.field508.field1170.method382(this.field530, -86) + 1;
            this.field530++;
            if (this.field530 >= this.field508.field1170.field1145) {
                this.field530 = 0;
            }
        }
    }

    @OriginalMember(owner = "db", name = "a", descriptor = "(Z)Leb;")
    public final Model method109(boolean arg0) {
        Model var2 = this.field508.method386();
        if (var2 == null) {
            return null;
        }
        int var3 = -1;
        if (!arg0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (this.field508.field1170 != null) {
            var3 = this.field508.field1170.field1146[this.field530];
        }
        Model var5 = new Model(false, var2, true, (byte) 119, AnimFrame.method48(var3, (byte) 7));
        if (var3 != -1) {
            var5.method133(861);
            var5.method134((byte) -54, var3);
            var5.field578 = null;
            var5.field577 = null;
        }
        if (this.field508.field1173 != 128 || this.field508.field1174 != 128) {
            var5.method142(this.field508.field1173, true, this.field508.field1173, this.field508.field1174);
        }
        var5.method138(this.field529, false);
        var5.method143(this.field508.field1176 + 64, this.field508.field1177 + 850, -30, -50, -30, true);
        return var5;
    }
}
