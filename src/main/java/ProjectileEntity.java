import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("eb")
public class ProjectileEntity extends Entity {

    @OriginalMember(owner = "eb", name = "l", descriptor = "I")
    private int field522 = -911;

    @OriginalMember(owner = "eb", name = "m", descriptor = "Z")
    private boolean field523 = false;

    @OriginalMember(owner = "eb", name = "n", descriptor = "B")
    private byte field524 = 0;

    @OriginalMember(owner = "eb", name = "z", descriptor = "Z")
    public boolean field536 = false;

    @OriginalMember(owner = "eb", name = "o", descriptor = "Lpc;")
    private SpotAnimType field525;

    @OriginalMember(owner = "eb", name = "p", descriptor = "I")
    public int field526;

    @OriginalMember(owner = "eb", name = "q", descriptor = "I")
    public int field527;

    @OriginalMember(owner = "eb", name = "r", descriptor = "I")
    public int field528;

    @OriginalMember(owner = "eb", name = "s", descriptor = "I")
    public int field529;

    @OriginalMember(owner = "eb", name = "u", descriptor = "I")
    public int field531;

    @OriginalMember(owner = "eb", name = "v", descriptor = "I")
    public int field532;

    @OriginalMember(owner = "eb", name = "w", descriptor = "I")
    public int field533;

    @OriginalMember(owner = "eb", name = "x", descriptor = "I")
    public int field534;

    @OriginalMember(owner = "eb", name = "y", descriptor = "I")
    public int field535;

    @OriginalMember(owner = "eb", name = "t", descriptor = "I")
    public int field530;

    @OriginalMember(owner = "eb", name = "A", descriptor = "D")
    public double field537;

    @OriginalMember(owner = "eb", name = "B", descriptor = "D")
    public double field538;

    @OriginalMember(owner = "eb", name = "C", descriptor = "D")
    public double field539;

    @OriginalMember(owner = "eb", name = "D", descriptor = "D")
    private double field540;

    @OriginalMember(owner = "eb", name = "E", descriptor = "D")
    private double field541;

    @OriginalMember(owner = "eb", name = "F", descriptor = "D")
    private double field542;

    @OriginalMember(owner = "eb", name = "G", descriptor = "D")
    private double field543;

    @OriginalMember(owner = "eb", name = "H", descriptor = "D")
    private double field544;

    @OriginalMember(owner = "eb", name = "I", descriptor = "I")
    public int field545;

    @OriginalMember(owner = "eb", name = "J", descriptor = "I")
    public int field546;

    @OriginalMember(owner = "eb", name = "K", descriptor = "I")
    private int field547;

    @OriginalMember(owner = "eb", name = "L", descriptor = "I")
    private int field548;

    @OriginalMember(owner = "eb", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
    public ProjectileEntity(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        this.field525 = SpotAnimType.field1169[arg10];
        this.field526 = arg1;
        if (arg7 != 0) {
            throw new NullPointerException();
        }
        this.field527 = arg5;
        this.field528 = arg8;
        this.field529 = arg11;
        this.field531 = arg0;
        this.field532 = arg3;
        this.field533 = arg6;
        this.field534 = arg2;
        this.field535 = arg9;
        this.field530 = arg4;
        this.field536 = false;
    }

    @OriginalMember(owner = "eb", name = "a", descriptor = "(IIBII)V")
    public final void method133(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (!this.field536) {
            double var6 = (double) (arg1 - this.field527);
            double var8 = (double) (arg3 - this.field528);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field537 = (double) this.field534 * var6 / var10 + (double) this.field527;
            this.field538 = (double) this.field534 * var8 / var10 + (double) this.field528;
            this.field539 = this.field529;
        }
        double var12 = (double) (this.field532 + 1 - arg0);
        this.field540 = ((double) arg1 - this.field537) / var12;
        if (arg2 != 67) {
            this.field522 = -240;
        }
        this.field541 = ((double) arg3 - this.field538) / var12;
        this.field542 = Math.sqrt(this.field541 * this.field541 + this.field540 * this.field540);
        if (!this.field536) {
            this.field543 = -this.field542 * Math.tan((double) this.field533 * 0.02454369D);
        }
        this.field544 = ((double) arg4 - this.field539 - this.field543 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "eb", name = "a", descriptor = "(BI)V")
    public final void method134(byte arg0, int arg1) {
        if (arg0 != -26) {
            this.field523 = !this.field523;
        }
        this.field536 = true;
        this.field537 += (double) arg1 * this.field540;
        this.field538 += (double) arg1 * this.field541;
        this.field539 += this.field544 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field543;
        this.field543 += (double) arg1 * this.field544;
        this.field545 = (int) (Math.atan2(this.field540, this.field541) * 325.949D) + 1024 & 0x7FF;
        this.field546 = (int) (Math.atan2(this.field543, this.field542) * 325.949D) & 0x7FF;
        if (this.field525.field1173 == null) {
            return;
        }
        this.field548 += arg1;
        while (this.field548 > this.field525.field1173.method384(0, this.field547)) {
            this.field548 -= this.field525.field1173.method384(0, this.field547) + 1;
            this.field547++;
            if (this.field547 >= this.field525.field1173.field1150) {
                this.field547 = 0;
            }
        }
    }

    @OriginalMember(owner = "eb", name = "a", descriptor = "(B)Lfb;")
    public final Model method123(byte arg0) {
        if (arg0 == 8) {
            boolean var2 = false;
        } else {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        Model var4 = this.field525.method388();
        if (var4 == null) {
            return null;
        }
        int var5 = -1;
        if (this.field525.field1173 != null) {
            var5 = this.field525.field1173.field1151[this.field547];
        }
        Model var6 = new Model(AnimFrame.method62((byte) 7, var5), false, true, true, var4);
        if (var5 != -1) {
            var6.method146((byte) 107);
            var6.method147(this.field524, var5);
            var6.field595 = null;
            var6.field594 = null;
        }
        if (this.field525.field1176 != 128 || this.field525.field1177 != 128) {
            var6.method155(this.field525.field1176, this.field525.field1177, (byte) -121, this.field525.field1176);
        }
        var6.method151(this.field546, 0);
        var6.method156(this.field525.field1179 + 64, this.field525.field1180 + 850, -30, -50, -30, true);
        return var6;
    }
}
