import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("eb")
public class ProjectileEntity extends Entity {

    @OriginalMember(owner = "eb", name = "m", descriptor = "Z")
    private boolean field503 = false;

    @OriginalMember(owner = "eb", name = "n", descriptor = "I")
    private int field504 = 9;

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

    @OriginalMember(owner = "eb", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
    public ProjectileEntity(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        this.field505 = SpotAnimType.field1132[arg1];
        this.field506 = arg0;
        if (arg9 != 0) {
            throw new NullPointerException();
        }
        this.field507 = arg6;
        this.field508 = arg10;
        this.field509 = arg4;
        this.field511 = arg2;
        this.field512 = arg3;
        this.field513 = arg7;
        this.field514 = arg11;
        this.field515 = arg8;
        this.field510 = arg5;
        this.field516 = false;
    }

    @OriginalMember(owner = "eb", name = "a", descriptor = "(IIBII)V")
    public final void method133(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (!this.field516) {
            double var6 = (double) (arg3 - this.field507);
            double var8 = (double) (arg0 - this.field508);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field517 = (double) this.field514 * var6 / var10 + (double) this.field507;
            this.field518 = (double) this.field514 * var8 / var10 + (double) this.field508;
            this.field519 = this.field509;
        }
        double var12 = (double) (this.field512 + 1 - arg4);
        this.field520 = ((double) arg3 - this.field517) / var12;
        this.field521 = ((double) arg0 - this.field518) / var12;
        this.field522 = Math.sqrt(this.field521 * this.field521 + this.field520 * this.field520);
        if (!this.field516) {
            this.field523 = -this.field522 * Math.tan((double) this.field513 * 0.02454369D);
        }
        this.field524 = ((double) arg1 - this.field519 - this.field523 * var12) * 2.0D / (var12 * var12);
        if (arg2 != 0) {
            this.field504 = 68;
        }
    }

    @OriginalMember(owner = "eb", name = "a", descriptor = "(II)V")
    public final void method134(int arg0, int arg1) {
        this.field516 = true;
        this.field517 += (double) arg1 * this.field520;
        this.field518 += (double) arg1 * this.field521;
        this.field519 += this.field524 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field523;
        this.field523 += (double) arg1 * this.field524;
        if (arg0 >= 0) {
            this.field503 = !this.field503;
        }
        this.field525 = (int) (Math.atan2(this.field520, this.field521) * 325.949D) + 1024 & 0x7FF;
        this.field526 = (int) (Math.atan2(this.field523, this.field522) * 325.949D) & 0x7FF;
        if (this.field505.field1136 == null) {
            return;
        }
        this.field528 += arg1;
        while (this.field528 > this.field505.field1136.method384((byte) -103, this.field527)) {
            this.field528 -= this.field505.field1136.method384((byte) -103, this.field527) + 1;
            this.field527++;
            if (this.field527 >= this.field505.field1136.field1113) {
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
        if (this.field505.field1136 != null) {
            var3 = this.field505.field1136.field1114[this.field527];
        }
        Model var4 = new Model(AnimFrame.method62((byte) 8, var3), 992, false, true, var2);
        if (arg0 != 45160) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (var3 != -1) {
            var4.method146((byte) 112);
            var4.method147(true, var3);
            var4.field571 = null;
            var4.field570 = null;
        }
        if (this.field505.field1139 != 128 || this.field505.field1140 != 128) {
            var4.method155(792, this.field505.field1139, this.field505.field1139, this.field505.field1140);
        }
        var4.method151((byte) 24, this.field526);
        var4.method156(this.field505.field1142 + 64, this.field505.field1143 + 850, -30, -50, -30, true);
        return var4;
    }
}
