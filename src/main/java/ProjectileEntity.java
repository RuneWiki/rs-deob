import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("z")
public class ProjectileEntity extends Entity {

    @OriginalMember(owner = "z", name = "f", descriptor = "Z")
    private boolean field357 = true;

    @OriginalMember(owner = "z", name = "r", descriptor = "Z")
    public boolean field369 = false;

    @OriginalMember(owner = "z", name = "g", descriptor = "Lgc;")
    private SpotAnimType field358;

    @OriginalMember(owner = "z", name = "h", descriptor = "I")
    public int field359;

    @OriginalMember(owner = "z", name = "i", descriptor = "I")
    public int field360;

    @OriginalMember(owner = "z", name = "j", descriptor = "I")
    public int field361;

    @OriginalMember(owner = "z", name = "k", descriptor = "I")
    public int field362;

    @OriginalMember(owner = "z", name = "m", descriptor = "I")
    public int field364;

    @OriginalMember(owner = "z", name = "n", descriptor = "I")
    public int field365;

    @OriginalMember(owner = "z", name = "o", descriptor = "I")
    public int field366;

    @OriginalMember(owner = "z", name = "p", descriptor = "I")
    public int field367;

    @OriginalMember(owner = "z", name = "q", descriptor = "I")
    public int field368;

    @OriginalMember(owner = "z", name = "l", descriptor = "I")
    public int field363;

    @OriginalMember(owner = "z", name = "s", descriptor = "D")
    public double field370;

    @OriginalMember(owner = "z", name = "t", descriptor = "D")
    public double field371;

    @OriginalMember(owner = "z", name = "u", descriptor = "D")
    public double field372;

    @OriginalMember(owner = "z", name = "v", descriptor = "D")
    private double field373;

    @OriginalMember(owner = "z", name = "w", descriptor = "D")
    private double field374;

    @OriginalMember(owner = "z", name = "x", descriptor = "D")
    private double field375;

    @OriginalMember(owner = "z", name = "y", descriptor = "D")
    private double field376;

    @OriginalMember(owner = "z", name = "z", descriptor = "D")
    private double field377;

    @OriginalMember(owner = "z", name = "A", descriptor = "I")
    public int field378;

    @OriginalMember(owner = "z", name = "B", descriptor = "I")
    public int field379;

    @OriginalMember(owner = "z", name = "C", descriptor = "I")
    private int field380;

    @OriginalMember(owner = "z", name = "D", descriptor = "I")
    private int field381;

    @OriginalMember(owner = "z", name = "<init>", descriptor = "(IIIZIIIIIIII)V")
    public ProjectileEntity(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        this.field358 = SpotAnimType.field944[arg6];
        this.field359 = arg0;
        this.field360 = arg2;
        if (!arg3) {
            for (int var13 = 1; var13 > 0; var13++) {
            }
        }
        this.field361 = arg9;
        this.field362 = arg5;
        this.field364 = arg7;
        this.field365 = arg10;
        this.field366 = arg4;
        this.field367 = arg1;
        this.field368 = arg11;
        this.field363 = arg8;
        this.field369 = false;
    }

    @OriginalMember(owner = "z", name = "a", descriptor = "(IIIII)V")
    public final void method99(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 <= 0) {
            return;
        }
        if (!this.field369) {
            double var6 = (double) (arg2 - this.field360);
            double var8 = (double) (arg0 - this.field361);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field370 = (double) this.field367 * var6 / var10 + (double) this.field360;
            this.field371 = (double) this.field367 * var8 / var10 + (double) this.field361;
            this.field372 = this.field362;
        }
        double var12 = (double) (this.field365 + 1 - arg4);
        this.field373 = ((double) arg2 - this.field370) / var12;
        this.field374 = ((double) arg0 - this.field371) / var12;
        this.field375 = Math.sqrt(this.field374 * this.field374 + this.field373 * this.field373);
        if (!this.field369) {
            this.field376 = -this.field375 * Math.tan((double) this.field366 * 0.02454369D);
        }
        this.field377 = ((double) arg1 - this.field372 - this.field376 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "z", name = "a", descriptor = "(II)V")
    public final void method100(int arg0, int arg1) {
        this.field369 = true;
        this.field370 += (double) arg1 * this.field373;
        this.field371 += (double) arg1 * this.field374;
        this.field372 += this.field377 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field376;
        this.field376 += (double) arg1 * this.field377;
        if (arg0 != 0) {
            return;
        }
        this.field378 = (int) (Math.atan2(this.field373, this.field374) * 325.949D) + 1024 & 0x7FF;
        this.field379 = (int) (Math.atan2(this.field376, this.field375) * 325.949D) & 0x7FF;
        if (this.field358.field947 == null) {
            return;
        }
        this.field381 += arg1;
        while (this.field381 > this.field358.field947.field931[this.field380]) {
            this.field381 -= this.field358.field947.field931[this.field380] + 1;
            this.field380++;
            if (this.field380 >= this.field358.field947.field928) {
                this.field380 = 0;
            }
        }
    }

    @OriginalMember(owner = "z", name = "a", descriptor = "(I)Ldb;")
    public final Model method90(int arg0) {
        Model var2 = this.field358.method283();
        Model var3 = new Model(true, !this.field358.field948, var2, 440, true, false);
        if (this.field358.field947 != null) {
            var3.method108(0);
            var3.method109(false, this.field358.field947.field929[this.field380]);
            var3.field455 = null;
            var3.field454 = null;
        }
        var3.method113(this.field379, -937);
        var3.method118(64, 850, -30, -50, -30, true);
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        return var3;
    }
}
