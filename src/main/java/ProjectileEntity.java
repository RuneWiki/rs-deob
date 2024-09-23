import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("eb")
public class ProjectileEntity extends Entity {

    @OriginalMember(owner = "eb", name = "m", descriptor = "I")
    private int field503 = 422;

    @OriginalMember(owner = "eb", name = "n", descriptor = "I")
    private int field504 = -39218;

    @OriginalMember(owner = "eb", name = "z", descriptor = "Z")
    public boolean field516 = false;

    @OriginalMember(owner = "eb", name = "o", descriptor = "Lpc;")
    private SpotAnimType field505;

    @OriginalMember(owner = "eb", name = "p", descriptor = "I")
    public int field506;

    @OriginalMember(owner = "eb", name = "q", descriptor = "I")
    public int field507;

    @OriginalMember(owner = "eb", name = "r", descriptor = "I")
    public int field508;

    @OriginalMember(owner = "eb", name = "s", descriptor = "I")
    public int field509;

    @OriginalMember(owner = "eb", name = "u", descriptor = "I")
    public int field511;

    @OriginalMember(owner = "eb", name = "v", descriptor = "I")
    public int field512;

    @OriginalMember(owner = "eb", name = "w", descriptor = "I")
    public int field513;

    @OriginalMember(owner = "eb", name = "x", descriptor = "I")
    public int field514;

    @OriginalMember(owner = "eb", name = "y", descriptor = "I")
    public int field515;

    @OriginalMember(owner = "eb", name = "t", descriptor = "I")
    public int field510;

    @OriginalMember(owner = "eb", name = "A", descriptor = "D")
    public double field517;

    @OriginalMember(owner = "eb", name = "B", descriptor = "D")
    public double field518;

    @OriginalMember(owner = "eb", name = "C", descriptor = "D")
    public double field519;

    @OriginalMember(owner = "eb", name = "D", descriptor = "D")
    private double field520;

    @OriginalMember(owner = "eb", name = "E", descriptor = "D")
    private double field521;

    @OriginalMember(owner = "eb", name = "F", descriptor = "D")
    private double field522;

    @OriginalMember(owner = "eb", name = "G", descriptor = "D")
    private double field523;

    @OriginalMember(owner = "eb", name = "H", descriptor = "D")
    private double field524;

    @OriginalMember(owner = "eb", name = "I", descriptor = "I")
    public int field525;

    @OriginalMember(owner = "eb", name = "J", descriptor = "I")
    public int field526;

    @OriginalMember(owner = "eb", name = "K", descriptor = "I")
    private int field527;

    @OriginalMember(owner = "eb", name = "L", descriptor = "I")
    private int field528;

    @OriginalMember(owner = "eb", name = "<init>", descriptor = "(IIIIIIIIIIIZ)V")
    public ProjectileEntity(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11) {
        this.field505 = SpotAnimType.field1143[arg8];
        this.field506 = arg9;
        this.field507 = arg2;
        if (!arg11) {
            this.field504 = -460;
        }
        this.field508 = arg1;
        this.field509 = arg6;
        this.field511 = arg4;
        this.field512 = arg10;
        this.field513 = arg3;
        this.field514 = arg7;
        this.field515 = arg0;
        this.field510 = arg5;
        this.field516 = false;
    }

    @OriginalMember(owner = "eb", name = "a", descriptor = "(IIIIB)V")
    public final void method133(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 != 9) {
            return;
        }
        if (!this.field516) {
            double var6 = (double) (arg0 - this.field507);
            double var8 = (double) (arg3 - this.field508);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field517 = (double) this.field514 * var6 / var10 + (double) this.field507;
            this.field518 = (double) this.field514 * var8 / var10 + (double) this.field508;
            this.field519 = this.field509;
        }
        double var12 = (double) (this.field512 + 1 - arg1);
        this.field520 = ((double) arg0 - this.field517) / var12;
        this.field521 = ((double) arg3 - this.field518) / var12;
        this.field522 = Math.sqrt(this.field521 * this.field521 + this.field520 * this.field520);
        if (!this.field516) {
            this.field523 = -this.field522 * Math.tan((double) this.field513 * 0.02454369D);
        }
        this.field524 = ((double) arg2 - this.field519 - this.field523 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "eb", name = "a", descriptor = "(IB)V")
    public final void method134(int arg0, byte arg1) {
        this.field516 = true;
        this.field517 += (double) arg0 * this.field520;
        if (arg1 == 5) {
            boolean var3 = false;
        } else {
            this.field504 = 166;
        }
        this.field518 += (double) arg0 * this.field521;
        this.field519 += this.field524 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field523;
        this.field523 += (double) arg0 * this.field524;
        this.field525 = (int) (Math.atan2(this.field520, this.field521) * 325.949D) + 1024 & 0x7FF;
        this.field526 = (int) (Math.atan2(this.field523, this.field522) * 325.949D) & 0x7FF;
        if (this.field505.field1147 == null) {
            return;
        }
        this.field528 += arg0;
        while (this.field528 > this.field505.field1147.method384(this.field527, (byte) 2)) {
            this.field528 -= this.field505.field1147.method384(this.field527, (byte) 2) + 1;
            this.field527++;
            if (this.field527 >= this.field505.field1147.field1122) {
                this.field527 = 0;
            }
        }
    }

    @OriginalMember(owner = "eb", name = "a", descriptor = "(I)Lfb;")
    public final Model method123(int arg0) {
        Model var2 = this.field505.method388();
        if (var2 == null) {
            return null;
        }
        int var3 = -1;
        if (this.field505.field1147 != null) {
            var3 = this.field505.field1147.field1123[this.field527];
        }
        Model var4 = new Model(AnimFrame.method62((byte) 17, var3), var2, true, 0, false);
        if (arg0 != -28205) {
            this.field503 = -281;
        }
        if (var3 != -1) {
            var4.method146(0);
            var4.method147((byte) 2, var3);
            var4.field577 = null;
            var4.field576 = null;
        }
        if (this.field505.field1150 != 128 || this.field505.field1151 != 128) {
            var4.method155(this.field505.field1150, (byte) 9, this.field505.field1150, this.field505.field1151);
        }
        var4.method151((byte) 2, this.field526);
        var4.method156(this.field505.field1153 + 64, this.field505.field1154 + 850, -30, -50, -30, true);
        return var4;
    }
}
