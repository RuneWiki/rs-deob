import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ab")
public class ProjectileEntity extends Entity {

    @OriginalMember(owner = "ab", name = "r", descriptor = "Z")
    public boolean field392 = false;

    @OriginalMember(owner = "ab", name = "g", descriptor = "Lkc;")
    private SpotAnimType field381;

    @OriginalMember(owner = "ab", name = "h", descriptor = "I")
    public int field382;

    @OriginalMember(owner = "ab", name = "i", descriptor = "I")
    public int field383;

    @OriginalMember(owner = "ab", name = "j", descriptor = "I")
    public int field384;

    @OriginalMember(owner = "ab", name = "k", descriptor = "I")
    public int field385;

    @OriginalMember(owner = "ab", name = "m", descriptor = "I")
    public int field387;

    @OriginalMember(owner = "ab", name = "n", descriptor = "I")
    public int field388;

    @OriginalMember(owner = "ab", name = "o", descriptor = "I")
    public int field389;

    @OriginalMember(owner = "ab", name = "p", descriptor = "I")
    public int field390;

    @OriginalMember(owner = "ab", name = "q", descriptor = "I")
    public int field391;

    @OriginalMember(owner = "ab", name = "l", descriptor = "I")
    public int field386;

    @OriginalMember(owner = "ab", name = "s", descriptor = "D")
    public double field393;

    @OriginalMember(owner = "ab", name = "t", descriptor = "D")
    public double field394;

    @OriginalMember(owner = "ab", name = "u", descriptor = "D")
    public double field395;

    @OriginalMember(owner = "ab", name = "v", descriptor = "D")
    private double field396;

    @OriginalMember(owner = "ab", name = "w", descriptor = "D")
    private double field397;

    @OriginalMember(owner = "ab", name = "x", descriptor = "D")
    private double field398;

    @OriginalMember(owner = "ab", name = "y", descriptor = "D")
    private double field399;

    @OriginalMember(owner = "ab", name = "z", descriptor = "D")
    private double field400;

    @OriginalMember(owner = "ab", name = "A", descriptor = "I")
    public int field401;

    @OriginalMember(owner = "ab", name = "B", descriptor = "I")
    public int field402;

    @OriginalMember(owner = "ab", name = "C", descriptor = "I")
    private int field403;

    @OriginalMember(owner = "ab", name = "D", descriptor = "I")
    private int field404;

    @OriginalMember(owner = "ab", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
    public ProjectileEntity(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        this.field381 = SpotAnimType.field1043[arg7];
        this.field382 = arg0;
        this.field383 = arg1;
        this.field384 = arg11;
        this.field385 = arg4;
        if (arg8 != 0) {
            throw new NullPointerException();
        }
        this.field387 = arg10;
        this.field388 = arg2;
        this.field389 = arg5;
        this.field390 = arg3;
        this.field391 = arg9;
        this.field386 = arg6;
        this.field392 = false;
    }

    @OriginalMember(owner = "ab", name = "a", descriptor = "(IIIII)V")
    public final void method115(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!this.field392) {
            double var6 = (double) (arg4 - this.field383);
            double var8 = (double) (arg0 - this.field384);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field393 = (double) this.field390 * var6 / var10 + (double) this.field383;
            this.field394 = (double) this.field390 * var8 / var10 + (double) this.field384;
            this.field395 = this.field385;
        }
        double var12 = (double) (this.field388 + 1 - arg3);
        if (arg1 >= 0) {
            return;
        }
        this.field396 = ((double) arg4 - this.field393) / var12;
        this.field397 = ((double) arg0 - this.field394) / var12;
        this.field398 = Math.sqrt(this.field397 * this.field397 + this.field396 * this.field396);
        if (!this.field392) {
            this.field399 = -this.field398 * Math.tan((double) this.field389 * 0.02454369D);
        }
        this.field400 = ((double) arg2 - this.field395 - this.field399 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "ab", name = "a", descriptor = "(II)V")
    public final void method116(int arg0, int arg1) {
        this.field392 = true;
        this.field393 += (double) arg1 * this.field396;
        this.field394 += (double) arg1 * this.field397;
        this.field395 += this.field400 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field399;
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field399 += (double) arg1 * this.field400;
        this.field401 = (int) (Math.atan2(this.field396, this.field397) * 325.949D) + 1024 & 0x7FF;
        this.field402 = (int) (Math.atan2(this.field399, this.field398) * 325.949D) & 0x7FF;
        if (this.field381.field1046 == null) {
            return;
        }
        this.field404 += arg1;
        while (this.field404 > this.field381.field1046.field1030[this.field403]) {
            this.field404 -= this.field381.field1046.field1030[this.field403] + 1;
            this.field403++;
            if (this.field403 >= this.field381.field1046.field1027) {
                this.field403 = 0;
            }
        }
    }

    @OriginalMember(owner = "ab", name = "a", descriptor = "(I)Leb;")
    public final Model method107(int arg0) {
        Model var2 = this.field381.method321();
        Model var3 = new Model(false, (byte) 8, true, !this.field381.field1047, var2);
        if (arg0 != 7) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (this.field381.field1046 != null) {
            var3.method125((byte) -17);
            var3.method126(this.field381.field1046.field1028[this.field403], (byte) 1);
            var3.field480 = null;
            var3.field479 = null;
        }
        var3.method130(this.field402, -608);
        var3.method135(this.field381.field1053 + 64, this.field381.field1054 + 850, -30, -50, -30, true);
        return var3;
    }
}
