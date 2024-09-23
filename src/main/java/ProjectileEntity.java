import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("db")
public class ProjectileEntity extends Entity {

    @OriginalMember(owner = "db", name = "l", descriptor = "B")
    private byte field497 = 7;

    @OriginalMember(owner = "db", name = "m", descriptor = "Z")
    private boolean field498 = true;

    @OriginalMember(owner = "db", name = "y", descriptor = "Z")
    public boolean field510 = false;

    @OriginalMember(owner = "db", name = "n", descriptor = "Lpc;")
    private SpotAnimType field499;

    @OriginalMember(owner = "db", name = "o", descriptor = "I")
    public int field500;

    @OriginalMember(owner = "db", name = "p", descriptor = "I")
    public int field501;

    @OriginalMember(owner = "db", name = "q", descriptor = "I")
    public int field502;

    @OriginalMember(owner = "db", name = "r", descriptor = "I")
    public int field503;

    @OriginalMember(owner = "db", name = "t", descriptor = "I")
    public int field505;

    @OriginalMember(owner = "db", name = "u", descriptor = "I")
    public int field506;

    @OriginalMember(owner = "db", name = "v", descriptor = "I")
    public int field507;

    @OriginalMember(owner = "db", name = "w", descriptor = "I")
    public int field508;

    @OriginalMember(owner = "db", name = "x", descriptor = "I")
    public int field509;

    @OriginalMember(owner = "db", name = "s", descriptor = "I")
    public int field504;

    @OriginalMember(owner = "db", name = "z", descriptor = "D")
    public double field511;

    @OriginalMember(owner = "db", name = "A", descriptor = "D")
    public double field512;

    @OriginalMember(owner = "db", name = "B", descriptor = "D")
    public double field513;

    @OriginalMember(owner = "db", name = "C", descriptor = "D")
    private double field514;

    @OriginalMember(owner = "db", name = "D", descriptor = "D")
    private double field515;

    @OriginalMember(owner = "db", name = "E", descriptor = "D")
    private double field516;

    @OriginalMember(owner = "db", name = "F", descriptor = "D")
    private double field517;

    @OriginalMember(owner = "db", name = "G", descriptor = "D")
    private double field518;

    @OriginalMember(owner = "db", name = "H", descriptor = "I")
    public int field519;

    @OriginalMember(owner = "db", name = "I", descriptor = "I")
    public int field520;

    @OriginalMember(owner = "db", name = "J", descriptor = "I")
    private int field521;

    @OriginalMember(owner = "db", name = "K", descriptor = "I")
    private int field522;

    @OriginalMember(owner = "db", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
    public ProjectileEntity(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        this.field499 = SpotAnimType.field1165[arg6];
        this.field500 = arg10;
        this.field501 = arg0;
        if (arg4 != 0) {
            for (int var13 = 1; var13 > 0; var13++) {
            }
        }
        this.field502 = arg3;
        this.field503 = arg2;
        this.field505 = arg9;
        this.field506 = arg7;
        this.field507 = arg11;
        this.field508 = arg8;
        this.field509 = arg1;
        this.field504 = arg5;
        this.field510 = false;
    }

    @OriginalMember(owner = "db", name = "a", descriptor = "(IIIIB)V")
    public final void method120(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (!this.field510) {
            double var6 = (double) (arg3 - this.field501);
            double var8 = (double) (arg2 - this.field502);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field511 = (double) this.field508 * var6 / var10 + (double) this.field501;
            this.field512 = (double) this.field508 * var8 / var10 + (double) this.field502;
            this.field513 = this.field503;
        }
        double var12 = (double) (this.field506 + 1 - arg0);
        this.field514 = ((double) arg3 - this.field511) / var12;
        this.field515 = ((double) arg2 - this.field512) / var12;
        this.field516 = Math.sqrt(this.field515 * this.field515 + this.field514 * this.field514);
        if (!this.field510) {
            this.field517 = -this.field516 * Math.tan((double) this.field507 * 0.02454369D);
        }
        this.field518 = ((double) arg1 - this.field513 - this.field517 * var12) * 2.0D / (var12 * var12);
        if (arg4 == 105) {
            ;
        }
    }

    @OriginalMember(owner = "db", name = "a", descriptor = "(ZI)V")
    public final void method121(boolean arg0, int arg1) {
        this.field510 = true;
        this.field511 += (double) arg1 * this.field514;
        this.field512 += (double) arg1 * this.field515;
        if (!arg0) {
            this.field498 = !this.field498;
        }
        this.field513 += this.field518 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field517;
        this.field517 += (double) arg1 * this.field518;
        this.field519 = (int) (Math.atan2(this.field514, this.field515) * 325.949D) + 1024 & 0x7FF;
        this.field520 = (int) (Math.atan2(this.field517, this.field516) * 325.949D) & 0x7FF;
        if (this.field499.field1169 == null) {
            return;
        }
        this.field522 += arg1;
        while (this.field522 > this.field499.field1169.method382((byte) -97, this.field521)) {
            this.field522 -= this.field499.field1169.method382((byte) -97, this.field521) + 1;
            this.field521++;
            if (this.field521 >= this.field499.field1169.field1144) {
                this.field521 = 0;
            }
        }
    }

    @OriginalMember(owner = "db", name = "a", descriptor = "(Z)Leb;")
    public final Model method109(boolean arg0) {
        Model var2 = this.field499.method386();
        if (var2 == null) {
            return null;
        }
        int var3 = -1;
        if (!arg0) {
            throw new NullPointerException();
        }
        if (this.field499.field1169 != null) {
            var3 = this.field499.field1169.field1145[this.field521];
        }
        Model var4 = new Model(false, 201, var2, AnimFrame.method48(577, var3), true);
        if (var3 != -1) {
            var4.method133(5);
            var4.method134(0, var3);
            var4.field569 = null;
            var4.field568 = null;
        }
        if (this.field499.field1172 != 128 || this.field499.field1173 != 128) {
            var4.method142(this.field499.field1172, this.field499.field1173, this.field499.field1172, (byte) -119);
        }
        var4.method138(this.field520, this.field497);
        var4.method143(this.field499.field1175 + 64, this.field499.field1176 + 850, -30, -50, -30, true);
        return var4;
    }
}
