import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("eb")
public class ProjectileEntity extends Entity {

    @OriginalMember(owner = "eb", name = "l", descriptor = "Z")
    private boolean field504 = false;

    @OriginalMember(owner = "eb", name = "m", descriptor = "I")
    private int field505 = 2;

    @OriginalMember(owner = "eb", name = "n", descriptor = "I")
    private int field506 = 650;

    @OriginalMember(owner = "eb", name = "o", descriptor = "Z")
    private boolean field507 = true;

    @OriginalMember(owner = "eb", name = "A", descriptor = "Z")
    public boolean field519 = false;

    @OriginalMember(owner = "eb", name = "p", descriptor = "Lpc;")
    private SpotAnimType field508;

    @OriginalMember(owner = "eb", name = "q", descriptor = "I")
    public int field509;

    @OriginalMember(owner = "eb", name = "r", descriptor = "I")
    public int field510;

    @OriginalMember(owner = "eb", name = "s", descriptor = "I")
    public int field511;

    @OriginalMember(owner = "eb", name = "t", descriptor = "I")
    public int field512;

    @OriginalMember(owner = "eb", name = "v", descriptor = "I")
    public int field514;

    @OriginalMember(owner = "eb", name = "w", descriptor = "I")
    public int field515;

    @OriginalMember(owner = "eb", name = "x", descriptor = "I")
    public int field516;

    @OriginalMember(owner = "eb", name = "y", descriptor = "I")
    public int field517;

    @OriginalMember(owner = "eb", name = "z", descriptor = "I")
    public int field518;

    @OriginalMember(owner = "eb", name = "u", descriptor = "I")
    public int field513;

    @OriginalMember(owner = "eb", name = "B", descriptor = "D")
    public double field520;

    @OriginalMember(owner = "eb", name = "C", descriptor = "D")
    public double field521;

    @OriginalMember(owner = "eb", name = "D", descriptor = "D")
    public double field522;

    @OriginalMember(owner = "eb", name = "E", descriptor = "D")
    private double field523;

    @OriginalMember(owner = "eb", name = "F", descriptor = "D")
    private double field524;

    @OriginalMember(owner = "eb", name = "G", descriptor = "D")
    private double field525;

    @OriginalMember(owner = "eb", name = "H", descriptor = "D")
    private double field526;

    @OriginalMember(owner = "eb", name = "I", descriptor = "D")
    private double field527;

    @OriginalMember(owner = "eb", name = "J", descriptor = "I")
    public int field528;

    @OriginalMember(owner = "eb", name = "K", descriptor = "I")
    public int field529;

    @OriginalMember(owner = "eb", name = "L", descriptor = "I")
    private int field530;

    @OriginalMember(owner = "eb", name = "M", descriptor = "I")
    private int field531;

    @OriginalMember(owner = "eb", name = "<init>", descriptor = "(IIIIIZIIIIII)V")
    public ProjectileEntity(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        this.field508 = SpotAnimType.field1130[arg2];
        this.field509 = arg11;
        this.field510 = arg7;
        if (arg5) {
            this.field505 = -228;
        }
        this.field511 = arg1;
        this.field512 = arg6;
        this.field514 = arg4;
        this.field515 = arg3;
        this.field516 = arg9;
        this.field517 = arg0;
        this.field518 = arg10;
        this.field513 = arg8;
        this.field519 = false;
    }

    @OriginalMember(owner = "eb", name = "a", descriptor = "(BIIII)V")
    public final void method133(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 7) {
            this.field505 = -262;
        }
        if (!this.field519) {
            double var6 = (double) (arg3 - this.field510);
            double var8 = (double) (arg2 - this.field511);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field520 = (double) this.field517 * var6 / var10 + (double) this.field510;
            this.field521 = (double) this.field517 * var8 / var10 + (double) this.field511;
            this.field522 = this.field512;
        }
        double var12 = (double) (this.field515 + 1 - arg1);
        this.field523 = ((double) arg3 - this.field520) / var12;
        this.field524 = ((double) arg2 - this.field521) / var12;
        this.field525 = Math.sqrt(this.field524 * this.field524 + this.field523 * this.field523);
        if (!this.field519) {
            this.field526 = -this.field525 * Math.tan((double) this.field516 * 0.02454369D);
        }
        this.field527 = ((double) arg4 - this.field522 - this.field526 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "eb", name = "a", descriptor = "(II)V")
    public final void method134(int arg0, int arg1) {
        this.field519 = true;
        this.field520 += (double) arg0 * this.field523;
        if (arg1 != 2) {
            this.field507 = !this.field507;
        }
        this.field521 += (double) arg0 * this.field524;
        this.field522 += this.field527 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field526;
        this.field526 += (double) arg0 * this.field527;
        this.field528 = (int) (Math.atan2(this.field523, this.field524) * 325.949D) + 1024 & 0x7FF;
        this.field529 = (int) (Math.atan2(this.field526, this.field525) * 325.949D) & 0x7FF;
        if (this.field508.field1134 == null) {
            return;
        }
        this.field531 += arg0;
        while (this.field531 > this.field508.field1134.method384(this.field530, true)) {
            this.field531 -= this.field508.field1134.method384(this.field530, true) + 1;
            this.field530++;
            if (this.field530 >= this.field508.field1134.field1111) {
                this.field530 = 0;
            }
        }
    }

    @OriginalMember(owner = "eb", name = "a", descriptor = "(I)Lfb;")
    public final Model method123(int arg0) {
        Model var2 = this.field508.method388();
        if (var2 == null) {
            return null;
        }
        int var3 = -1;
        if (arg0 <= 0) {
            this.field504 = !this.field504;
        }
        if (this.field508.field1134 != null) {
            var3 = this.field508.field1134.field1112[this.field530];
        }
        Model var4 = new Model(23727, AnimFrame.method62(0, var3), true, var2, false);
        if (var3 != -1) {
            var4.method146(true);
            var4.method147(var3, false);
            var4.field576 = null;
            var4.field575 = null;
        }
        if (this.field508.field1137 != 128 || this.field508.field1138 != 128) {
            var4.method155(this.field508.field1137, (byte) 2, this.field508.field1138, this.field508.field1137);
        }
        var4.method151(46261, this.field529);
        var4.method156(this.field508.field1140 + 64, this.field508.field1141 + 850, -30, -50, -30, true);
        return var4;
    }
}
