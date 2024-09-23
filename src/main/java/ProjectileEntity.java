import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("db")
public class ProjectileEntity extends Entity {

    @OriginalMember(owner = "db", name = "l", descriptor = "Z")
    private boolean field505 = false;

    @OriginalMember(owner = "db", name = "n", descriptor = "I")
    private int field507 = -231;

    @OriginalMember(owner = "db", name = "o", descriptor = "I")
    private int field508 = 35102;

    @OriginalMember(owner = "db", name = "p", descriptor = "I")
    private int field509 = 977;

    @OriginalMember(owner = "db", name = "B", descriptor = "Z")
    public boolean field521 = false;

    @OriginalMember(owner = "db", name = "q", descriptor = "Lpc;")
    private SpotAnimType field510;

    @OriginalMember(owner = "db", name = "r", descriptor = "I")
    public int field511;

    @OriginalMember(owner = "db", name = "s", descriptor = "I")
    public int field512;

    @OriginalMember(owner = "db", name = "t", descriptor = "I")
    public int field513;

    @OriginalMember(owner = "db", name = "u", descriptor = "I")
    public int field514;

    @OriginalMember(owner = "db", name = "w", descriptor = "I")
    public int field516;

    @OriginalMember(owner = "db", name = "x", descriptor = "I")
    public int field517;

    @OriginalMember(owner = "db", name = "y", descriptor = "I")
    public int field518;

    @OriginalMember(owner = "db", name = "z", descriptor = "I")
    public int field519;

    @OriginalMember(owner = "db", name = "A", descriptor = "I")
    public int field520;

    @OriginalMember(owner = "db", name = "v", descriptor = "I")
    public int field515;

    @OriginalMember(owner = "db", name = "C", descriptor = "D")
    public double field522;

    @OriginalMember(owner = "db", name = "D", descriptor = "D")
    public double field523;

    @OriginalMember(owner = "db", name = "E", descriptor = "D")
    public double field524;

    @OriginalMember(owner = "db", name = "F", descriptor = "D")
    private double field525;

    @OriginalMember(owner = "db", name = "G", descriptor = "D")
    private double field526;

    @OriginalMember(owner = "db", name = "H", descriptor = "D")
    private double field527;

    @OriginalMember(owner = "db", name = "I", descriptor = "D")
    private double field528;

    @OriginalMember(owner = "db", name = "J", descriptor = "D")
    private double field529;

    @OriginalMember(owner = "db", name = "m", descriptor = "I")
    private int field506;

    @OriginalMember(owner = "db", name = "K", descriptor = "I")
    public int field530;

    @OriginalMember(owner = "db", name = "L", descriptor = "I")
    public int field531;

    @OriginalMember(owner = "db", name = "M", descriptor = "I")
    private int field532;

    @OriginalMember(owner = "db", name = "N", descriptor = "I")
    private int field533;

    @OriginalMember(owner = "db", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
    public ProjectileEntity(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        this.field510 = SpotAnimType.field1177[arg8];
        this.field511 = arg2;
        this.field512 = arg5;
        this.field513 = arg10;
        if (arg0 >= 0) {
            this.field505 = !this.field505;
        }
        this.field514 = arg9;
        this.field516 = arg7;
        this.field517 = arg6;
        this.field518 = arg3;
        this.field519 = arg1;
        this.field520 = arg11;
        this.field515 = arg4;
        this.field521 = false;
    }

    @OriginalMember(owner = "db", name = "a", descriptor = "(IIIII)V")
    public final void method120(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!this.field521) {
            double var6 = (double) (arg1 - this.field512);
            double var8 = (double) (arg4 - this.field513);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field522 = (double) this.field519 * var6 / var10 + (double) this.field512;
            this.field523 = (double) this.field519 * var8 / var10 + (double) this.field513;
            this.field524 = this.field514;
        }
        double var12 = (double) (this.field517 + 1 - arg2);
        this.field525 = ((double) arg1 - this.field522) / var12;
        this.field526 = ((double) arg4 - this.field523) / var12;
        if (arg0 != 8424) {
            return;
        }
        this.field527 = Math.sqrt(this.field526 * this.field526 + this.field525 * this.field525);
        if (!this.field521) {
            this.field528 = -this.field527 * Math.tan((double) this.field518 * 0.02454369D);
        }
        this.field529 = ((double) arg3 - this.field524 - this.field528 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "db", name = "a", descriptor = "(BI)V")
    public final void method121(byte arg0, int arg1) {
        this.field521 = true;
        this.field522 += (double) arg1 * this.field525;
        this.field523 += (double) arg1 * this.field526;
        this.field524 += this.field529 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field528;
        this.field528 += (double) arg1 * this.field529;
        if (arg0 == 5) {
            boolean var3 = false;
        } else {
            this.field507 = 241;
        }
        this.field530 = (int) (Math.atan2(this.field525, this.field526) * 325.949D) + 1024 & 0x7FF;
        this.field531 = (int) (Math.atan2(this.field528, this.field527) * 325.949D) & 0x7FF;
        if (this.field510.field1181 == null) {
            return;
        }
        this.field533 += arg1;
        while (this.field533 > this.field510.field1181.method382(this.field532, this.field509)) {
            this.field533 -= this.field510.field1181.method382(this.field532, this.field509) + 1;
            this.field532++;
            if (this.field532 >= this.field510.field1181.field1156) {
                this.field532 = 0;
            }
        }
    }

    @OriginalMember(owner = "db", name = "a", descriptor = "(B)Leb;")
    public final Model method109(byte arg0) {
        if (arg0 != -59) {
            this.field508 = 175;
        }
        Model var2 = this.field510.method386();
        if (var2 == null) {
            return null;
        }
        int var3 = -1;
        if (this.field510.field1181 != null) {
            var3 = this.field510.field1181.field1157[this.field532];
        }
        Model var4 = new Model(AnimFrame.method48(var3, 0), false, 0, true, var2);
        if (var3 != -1) {
            var4.method133(this.field506);
            var4.method134(-37879, var3);
            var4.field579 = null;
            var4.field578 = null;
        }
        if (this.field510.field1184 != 128 || this.field510.field1185 != 128) {
            var4.method142(this.field510.field1185, this.field510.field1184, false, this.field510.field1184);
        }
        var4.method138((byte) -32, this.field531);
        var4.method143(this.field510.field1187 + 64, this.field510.field1188 + 850, -30, -50, -30, true);
        return var4;
    }
}
