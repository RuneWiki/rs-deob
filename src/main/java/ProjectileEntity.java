import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ab")
public class ProjectileEntity extends Entity {

    @OriginalMember(owner = "ab", name = "e", descriptor = "Z")
    private boolean field382 = false;

    @OriginalMember(owner = "ab", name = "q", descriptor = "Z")
    public boolean field394 = false;

    @OriginalMember(owner = "ab", name = "f", descriptor = "Lkc;")
    private SpotAnimType field383;

    @OriginalMember(owner = "ab", name = "g", descriptor = "I")
    public int field384;

    @OriginalMember(owner = "ab", name = "h", descriptor = "I")
    public int field385;

    @OriginalMember(owner = "ab", name = "i", descriptor = "I")
    public int field386;

    @OriginalMember(owner = "ab", name = "j", descriptor = "I")
    public int field387;

    @OriginalMember(owner = "ab", name = "l", descriptor = "I")
    public int field389;

    @OriginalMember(owner = "ab", name = "m", descriptor = "I")
    public int field390;

    @OriginalMember(owner = "ab", name = "n", descriptor = "I")
    public int field391;

    @OriginalMember(owner = "ab", name = "o", descriptor = "I")
    public int field392;

    @OriginalMember(owner = "ab", name = "p", descriptor = "I")
    public int field393;

    @OriginalMember(owner = "ab", name = "k", descriptor = "I")
    public int field388;

    @OriginalMember(owner = "ab", name = "r", descriptor = "D")
    public double field395;

    @OriginalMember(owner = "ab", name = "s", descriptor = "D")
    public double field396;

    @OriginalMember(owner = "ab", name = "t", descriptor = "D")
    public double field397;

    @OriginalMember(owner = "ab", name = "u", descriptor = "D")
    private double field398;

    @OriginalMember(owner = "ab", name = "v", descriptor = "D")
    private double field399;

    @OriginalMember(owner = "ab", name = "w", descriptor = "D")
    private double field400;

    @OriginalMember(owner = "ab", name = "x", descriptor = "D")
    private double field401;

    @OriginalMember(owner = "ab", name = "y", descriptor = "D")
    private double field402;

    @OriginalMember(owner = "ab", name = "z", descriptor = "I")
    public int field403;

    @OriginalMember(owner = "ab", name = "A", descriptor = "I")
    public int field404;

    @OriginalMember(owner = "ab", name = "B", descriptor = "I")
    private int field405;

    @OriginalMember(owner = "ab", name = "C", descriptor = "I")
    private int field406;

    @OriginalMember(owner = "ab", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
    public ProjectileEntity(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        this.field383 = SpotAnimType.field1039[arg9];
        this.field384 = arg4;
        this.field385 = arg10;
        this.field386 = arg7;
        this.field387 = arg1;
        this.field389 = arg3;
        this.field390 = arg0;
        if (arg8 != 4) {
            throw new NullPointerException();
        }
        this.field391 = arg6;
        this.field392 = arg2;
        this.field393 = arg5;
        this.field388 = arg11;
        this.field394 = false;
    }

    @OriginalMember(owner = "ab", name = "a", descriptor = "(IIIII)V")
    public final void method116(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 0) {
            this.field382 = !this.field382;
        }
        if (!this.field394) {
            double var6 = (double) (arg0 - this.field385);
            double var8 = (double) (arg3 - this.field386);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field395 = (double) this.field392 * var6 / var10 + (double) this.field385;
            this.field396 = (double) this.field392 * var8 / var10 + (double) this.field386;
            this.field397 = this.field387;
        }
        double var12 = (double) (this.field390 + 1 - arg4);
        this.field398 = ((double) arg0 - this.field395) / var12;
        this.field399 = ((double) arg3 - this.field396) / var12;
        this.field400 = Math.sqrt(this.field399 * this.field399 + this.field398 * this.field398);
        if (!this.field394) {
            this.field401 = -this.field400 * Math.tan((double) this.field391 * 0.02454369D);
        }
        this.field402 = ((double) arg1 - this.field397 - this.field401 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "ab", name = "a", descriptor = "(II)V")
    public final void method117(int arg0, int arg1) {
        this.field394 = true;
        this.field395 += (double) arg1 * this.field398;
        this.field396 += (double) arg1 * this.field399;
        this.field397 += this.field402 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field401;
        this.field401 += (double) arg1 * this.field402;
        this.field403 = (int) (Math.atan2(this.field398, this.field399) * 325.949D) + 1024 & 0x7FF;
        if (arg0 != 0) {
            this.field382 = !this.field382;
        }
        this.field404 = (int) (Math.atan2(this.field401, this.field400) * 325.949D) & 0x7FF;
        if (this.field383.field1042 == null) {
            return;
        }
        this.field406 += arg1;
        while (this.field406 > this.field383.field1042.field1027[this.field405]) {
            this.field406 -= this.field383.field1042.field1027[this.field405] + 1;
            this.field405++;
            if (this.field405 >= this.field383.field1042.field1024) {
                this.field405 = 0;
            }
        }
    }

    @OriginalMember(owner = "ab", name = "a", descriptor = "(I)Leb;")
    public final Model method108(int arg0) {
        if (arg0 < 1 || arg0 > 1) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        Model var3 = this.field383.method322();
        Model var4 = new Model(!this.field383.field1043, false, false, var3, true);
        if (this.field383.field1042 != null) {
            var4.method126(-36895);
            var4.method127(1, this.field383.field1042.field1025[this.field405]);
            var4.field479 = null;
            var4.field478 = null;
        }
        var4.method131(-32470, this.field404);
        var4.method136(this.field383.field1049 + 64, this.field383.field1050 + 850, -30, -50, -30, true);
        return var4;
    }
}
