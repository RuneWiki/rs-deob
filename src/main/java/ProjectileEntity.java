import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ab")
public class ProjectileEntity extends Entity {

    @OriginalMember(owner = "ab", name = "f", descriptor = "Z")
    private boolean field387 = true;

    @OriginalMember(owner = "ab", name = "r", descriptor = "Z")
    public boolean field399 = false;

    @OriginalMember(owner = "ab", name = "g", descriptor = "Lkc;")
    private SpotAnimType field388;

    @OriginalMember(owner = "ab", name = "h", descriptor = "I")
    public int field389;

    @OriginalMember(owner = "ab", name = "i", descriptor = "I")
    public int field390;

    @OriginalMember(owner = "ab", name = "j", descriptor = "I")
    public int field391;

    @OriginalMember(owner = "ab", name = "k", descriptor = "I")
    public int field392;

    @OriginalMember(owner = "ab", name = "m", descriptor = "I")
    public int field394;

    @OriginalMember(owner = "ab", name = "n", descriptor = "I")
    public int field395;

    @OriginalMember(owner = "ab", name = "o", descriptor = "I")
    public int field396;

    @OriginalMember(owner = "ab", name = "p", descriptor = "I")
    public int field397;

    @OriginalMember(owner = "ab", name = "q", descriptor = "I")
    public int field398;

    @OriginalMember(owner = "ab", name = "l", descriptor = "I")
    public int field393;

    @OriginalMember(owner = "ab", name = "s", descriptor = "D")
    public double field400;

    @OriginalMember(owner = "ab", name = "t", descriptor = "D")
    public double field401;

    @OriginalMember(owner = "ab", name = "u", descriptor = "D")
    public double field402;

    @OriginalMember(owner = "ab", name = "v", descriptor = "D")
    private double field403;

    @OriginalMember(owner = "ab", name = "w", descriptor = "D")
    private double field404;

    @OriginalMember(owner = "ab", name = "x", descriptor = "D")
    private double field405;

    @OriginalMember(owner = "ab", name = "y", descriptor = "D")
    private double field406;

    @OriginalMember(owner = "ab", name = "z", descriptor = "D")
    private double field407;

    @OriginalMember(owner = "ab", name = "A", descriptor = "I")
    public int field408;

    @OriginalMember(owner = "ab", name = "B", descriptor = "I")
    public int field409;

    @OriginalMember(owner = "ab", name = "C", descriptor = "I")
    private int field410;

    @OriginalMember(owner = "ab", name = "D", descriptor = "I")
    private int field411;

    @OriginalMember(owner = "ab", name = "<init>", descriptor = "(IIIIIIIZIIII)V")
    public ProjectileEntity(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        this.field388 = SpotAnimType.field1061[arg9];
        if (arg7) {
            this.field387 = !this.field387;
        }
        this.field389 = arg1;
        this.field390 = arg10;
        this.field391 = arg3;
        this.field392 = arg8;
        this.field394 = arg2;
        this.field395 = arg11;
        this.field396 = arg0;
        this.field397 = arg6;
        this.field398 = arg5;
        this.field393 = arg4;
        this.field399 = false;
    }

    @OriginalMember(owner = "ab", name = "a", descriptor = "(IIZII)V")
    public final void method116(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (!this.field399) {
            double var6 = (double) (arg1 - this.field390);
            double var8 = (double) (arg3 - this.field391);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field400 = (double) this.field397 * var6 / var10 + (double) this.field390;
            this.field401 = (double) this.field397 * var8 / var10 + (double) this.field391;
            this.field402 = this.field392;
        }
        double var12 = (double) (this.field395 + 1 - arg4);
        this.field403 = ((double) arg1 - this.field400) / var12;
        if (arg2) {
            return;
        }
        this.field404 = ((double) arg3 - this.field401) / var12;
        this.field405 = Math.sqrt(this.field404 * this.field404 + this.field403 * this.field403);
        if (!this.field399) {
            this.field406 = -this.field405 * Math.tan((double) this.field396 * 0.02454369D);
        }
        this.field407 = ((double) arg0 - this.field402 - this.field406 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "ab", name = "a", descriptor = "(ZI)V")
    public final void method117(boolean arg0, int arg1) {
        if (arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field399 = true;
        this.field400 += (double) arg1 * this.field403;
        this.field401 += (double) arg1 * this.field404;
        this.field402 += this.field407 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field406;
        this.field406 += (double) arg1 * this.field407;
        this.field408 = (int) (Math.atan2(this.field403, this.field404) * 325.949D) + 1024 & 0x7FF;
        this.field409 = (int) (Math.atan2(this.field406, this.field405) * 325.949D) & 0x7FF;
        if (this.field388.field1064 == null) {
            return;
        }
        this.field411 += arg1;
        while (this.field411 > this.field388.field1064.field1047[this.field410]) {
            this.field411 -= this.field388.field1064.field1047[this.field410] + 1;
            this.field410++;
            if (this.field410 >= this.field388.field1064.field1044) {
                this.field410 = 0;
            }
        }
    }

    @OriginalMember(owner = "ab", name = "a", descriptor = "(I)Leb;")
    public final Model method108(int arg0) {
        Model var2 = this.field388.method322();
        Model var3 = new Model(364, var2, !this.field388.field1065, false, true);
        if (this.field388.field1064 != null) {
            var3.method126(797);
            var3.method127(this.field388.field1064.field1045[this.field410], (byte) -89);
            var3.field486 = null;
            var3.field485 = null;
        }
        var3.method131(this.field409, (byte) 1);
        var3.method136(this.field388.field1071 + 64, this.field388.field1072 + 850, -30, -50, -30, true);
        int var4 = 57 / arg0;
        return var3;
    }
}
