import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ab")
public class ProjectileEntity extends Entity {

    @OriginalMember(owner = "ab", name = "e", descriptor = "I")
    private int field370 = -403;

    @OriginalMember(owner = "ab", name = "f", descriptor = "Z")
    private boolean field371 = true;

    @OriginalMember(owner = "ab", name = "g", descriptor = "Z")
    private boolean field372 = false;

    @OriginalMember(owner = "ab", name = "s", descriptor = "Z")
    public boolean field384 = false;

    @OriginalMember(owner = "ab", name = "h", descriptor = "Lhc;")
    private SpotAnimType field373;

    @OriginalMember(owner = "ab", name = "i", descriptor = "I")
    public int field374;

    @OriginalMember(owner = "ab", name = "j", descriptor = "I")
    public int field375;

    @OriginalMember(owner = "ab", name = "k", descriptor = "I")
    public int field376;

    @OriginalMember(owner = "ab", name = "l", descriptor = "I")
    public int field377;

    @OriginalMember(owner = "ab", name = "n", descriptor = "I")
    public int field379;

    @OriginalMember(owner = "ab", name = "o", descriptor = "I")
    public int field380;

    @OriginalMember(owner = "ab", name = "p", descriptor = "I")
    public int field381;

    @OriginalMember(owner = "ab", name = "q", descriptor = "I")
    public int field382;

    @OriginalMember(owner = "ab", name = "r", descriptor = "I")
    public int field383;

    @OriginalMember(owner = "ab", name = "m", descriptor = "I")
    public int field378;

    @OriginalMember(owner = "ab", name = "t", descriptor = "D")
    public double field385;

    @OriginalMember(owner = "ab", name = "u", descriptor = "D")
    public double field386;

    @OriginalMember(owner = "ab", name = "v", descriptor = "D")
    public double field387;

    @OriginalMember(owner = "ab", name = "w", descriptor = "D")
    private double field388;

    @OriginalMember(owner = "ab", name = "x", descriptor = "D")
    private double field389;

    @OriginalMember(owner = "ab", name = "y", descriptor = "D")
    private double field390;

    @OriginalMember(owner = "ab", name = "z", descriptor = "D")
    private double field391;

    @OriginalMember(owner = "ab", name = "A", descriptor = "D")
    private double field392;

    @OriginalMember(owner = "ab", name = "B", descriptor = "I")
    public int field393;

    @OriginalMember(owner = "ab", name = "C", descriptor = "I")
    public int field394;

    @OriginalMember(owner = "ab", name = "D", descriptor = "I")
    private int field395;

    @OriginalMember(owner = "ab", name = "E", descriptor = "I")
    private int field396;

    @OriginalMember(owner = "ab", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
    public ProjectileEntity(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        this.field373 = SpotAnimType.field952[arg4];
        this.field374 = arg6;
        if (arg1 != -35843) {
            throw new NullPointerException();
        }
        this.field375 = arg0;
        this.field376 = arg10;
        this.field377 = arg5;
        this.field379 = arg8;
        this.field380 = arg2;
        this.field381 = arg9;
        this.field382 = arg3;
        this.field383 = arg7;
        this.field378 = arg11;
        this.field384 = false;
    }

    @OriginalMember(owner = "ab", name = "a", descriptor = "(IIIIZ)V")
    public final void method113(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (!this.field384) {
            double var6 = (double) (arg3 - this.field375);
            double var8 = (double) (arg1 - this.field376);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field385 = (double) this.field382 * var6 / var10 + (double) this.field375;
            this.field386 = (double) this.field382 * var8 / var10 + (double) this.field376;
            this.field387 = this.field377;
        }
        double var12 = (double) (this.field380 + 1 - arg2);
        this.field388 = ((double) arg3 - this.field385) / var12;
        this.field389 = ((double) arg1 - this.field386) / var12;
        if (!arg4) {
            this.field372 = !this.field372;
        }
        this.field390 = Math.sqrt(this.field389 * this.field389 + this.field388 * this.field388);
        if (!this.field384) {
            this.field391 = -this.field390 * Math.tan((double) this.field381 * 0.02454369D);
        }
        this.field392 = ((double) arg0 - this.field387 - this.field391 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "ab", name = "a", descriptor = "(II)V")
    public final void method114(int arg0, int arg1) {
        this.field384 = true;
        this.field385 += (double) arg1 * this.field388;
        this.field386 += (double) arg1 * this.field389;
        this.field387 += this.field392 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field391;
        this.field391 += (double) arg1 * this.field392;
        this.field393 = (int) (Math.atan2(this.field388, this.field389) * 325.949D) + 1024 & 0x7FF;
        if (arg0 >= 0) {
            this.field370 = -428;
        }
        this.field394 = (int) (Math.atan2(this.field391, this.field390) * 325.949D) & 0x7FF;
        if (this.field373.field955 == null) {
            return;
        }
        this.field396 += arg1;
        while (this.field396 > this.field373.field955.field942[this.field395]) {
            this.field396 -= this.field373.field955.field942[this.field395] + 1;
            this.field395++;
            if (this.field395 >= this.field373.field955.field939) {
                this.field395 = 0;
            }
        }
    }

    @OriginalMember(owner = "ab", name = "a", descriptor = "(I)Leb;")
    public final Model method105(int arg0) {
        if (arg0 != 0) {
            this.field371 = !this.field371;
        }
        Model var2 = this.field373.method299();
        Model var3 = new Model(-428, true, var2, true, false, !this.field373.field956);
        if (this.field373.field955 != null) {
            var3.method122((byte) 3);
            var3.method123(7, this.field373.field955.field940[this.field395]);
            var3.field469 = null;
            var3.field468 = null;
        }
        var3.method127(this.field394, (byte) -42);
        var3.method132(64, 850, -30, -50, -30, true);
        return var3;
    }
}
