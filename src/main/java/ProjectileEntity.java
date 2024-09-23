import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("db")
public class ProjectileEntity extends Entity {

    @OriginalMember(owner = "db", name = "n", descriptor = "I")
    private int field499 = 6;

    @OriginalMember(owner = "db", name = "z", descriptor = "Z")
    public boolean field511 = false;

    @OriginalMember(owner = "db", name = "o", descriptor = "Lpc;")
    private SpotAnimType field500;

    @OriginalMember(owner = "db", name = "p", descriptor = "I")
    public int field501;

    @OriginalMember(owner = "db", name = "q", descriptor = "I")
    public int field502;

    @OriginalMember(owner = "db", name = "r", descriptor = "I")
    public int field503;

    @OriginalMember(owner = "db", name = "s", descriptor = "I")
    public int field504;

    @OriginalMember(owner = "db", name = "u", descriptor = "I")
    public int field506;

    @OriginalMember(owner = "db", name = "v", descriptor = "I")
    public int field507;

    @OriginalMember(owner = "db", name = "w", descriptor = "I")
    public int field508;

    @OriginalMember(owner = "db", name = "x", descriptor = "I")
    public int field509;

    @OriginalMember(owner = "db", name = "y", descriptor = "I")
    public int field510;

    @OriginalMember(owner = "db", name = "t", descriptor = "I")
    public int field505;

    @OriginalMember(owner = "db", name = "A", descriptor = "D")
    public double field512;

    @OriginalMember(owner = "db", name = "B", descriptor = "D")
    public double field513;

    @OriginalMember(owner = "db", name = "C", descriptor = "D")
    public double field514;

    @OriginalMember(owner = "db", name = "D", descriptor = "D")
    private double field515;

    @OriginalMember(owner = "db", name = "E", descriptor = "D")
    private double field516;

    @OriginalMember(owner = "db", name = "F", descriptor = "D")
    private double field517;

    @OriginalMember(owner = "db", name = "G", descriptor = "D")
    private double field518;

    @OriginalMember(owner = "db", name = "H", descriptor = "D")
    private double field519;

    @OriginalMember(owner = "db", name = "m", descriptor = "I")
    private int field498;

    @OriginalMember(owner = "db", name = "I", descriptor = "I")
    public int field520;

    @OriginalMember(owner = "db", name = "J", descriptor = "I")
    public int field521;

    @OriginalMember(owner = "db", name = "K", descriptor = "I")
    private int field522;

    @OriginalMember(owner = "db", name = "L", descriptor = "I")
    private int field523;

    @OriginalMember(owner = "db", name = "<init>", descriptor = "(IIIIIIIIIIZI)V")
    public ProjectileEntity(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, int arg11) {
        this.field500 = SpotAnimType.field1173[arg3];
        this.field501 = arg6;
        this.field502 = arg4;
        this.field503 = arg7;
        this.field504 = arg1;
        this.field506 = arg2;
        this.field507 = arg8;
        this.field508 = arg9;
        if (arg10) {
            for (int var13 = 1; var13 > 0; var13++) {
            }
        }
        this.field509 = arg0;
        this.field510 = arg5;
        this.field505 = arg11;
        this.field511 = false;
    }

    @OriginalMember(owner = "db", name = "a", descriptor = "(IZIII)V")
    public final void method119(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (!this.field511) {
            double var6 = (double) (arg4 - this.field502);
            double var8 = (double) (arg2 - this.field503);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field512 = (double) this.field509 * var6 / var10 + (double) this.field502;
            this.field513 = (double) this.field509 * var8 / var10 + (double) this.field503;
            this.field514 = this.field504;
        }
        double var12 = (double) (this.field507 + 1 - arg3);
        this.field515 = ((double) arg4 - this.field512) / var12;
        this.field516 = ((double) arg2 - this.field513) / var12;
        if (!arg1) {
            for (int var14 = 1; var14 > 0; var14++) {
            }
        }
        this.field517 = Math.sqrt(this.field516 * this.field516 + this.field515 * this.field515);
        if (!this.field511) {
            this.field518 = -this.field517 * Math.tan((double) this.field508 * 0.02454369D);
        }
        this.field519 = ((double) arg0 - this.field514 - this.field518 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "db", name = "a", descriptor = "(II)V")
    public final void method120(int arg0, int arg1) {
        if (arg1 >= 0) {
            this.field499 = -474;
        }
        this.field511 = true;
        this.field512 += (double) arg0 * this.field515;
        this.field513 += (double) arg0 * this.field516;
        this.field514 += this.field519 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field518;
        this.field518 += (double) arg0 * this.field519;
        this.field520 = (int) (Math.atan2(this.field515, this.field516) * 325.949D) + 1024 & 0x7FF;
        this.field521 = (int) (Math.atan2(this.field518, this.field517) * 325.949D) & 0x7FF;
        if (this.field500.field1177 == null) {
            return;
        }
        this.field523 += arg0;
        while (this.field523 > this.field500.field1177.method378(this.field522, 24425)) {
            this.field523 -= this.field500.field1177.method378(this.field522, 24425) + 1;
            this.field522++;
            if (this.field522 >= this.field500.field1177.field1151) {
                this.field522 = 0;
            }
        }
    }

    @OriginalMember(owner = "db", name = "a", descriptor = "(I)Leb;")
    public final Model method109(int arg0) {
        Model var2 = this.field500.method382();
        if (var2 == null) {
            return null;
        }
        int var3 = -1;
        if (this.field500.field1177 != null) {
            var3 = this.field500.field1177.field1152[this.field522];
        }
        Model var4 = new Model(var2, AnimFrame.method48(var3, 0), false, this.field498, true);
        if (var3 != -1) {
            var4.method132((byte) 3);
            var4.method133(var3, 188);
            var4.field568 = null;
            var4.field567 = null;
        }
        if (this.field500.field1180 != 128 || this.field500.field1181 != 128) {
            var4.method141(this.field500.field1180, this.field500.field1180, this.field500.field1181, (byte) 31);
        }
        var4.method137(46881, this.field521);
        if (arg0 != -37770) {
            throw new NullPointerException();
        }
        var4.method142(this.field500.field1183 + 64, this.field500.field1184 + 850, -30, -50, -30, true);
        return var4;
    }
}
