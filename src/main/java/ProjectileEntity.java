import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ab")
public class ProjectileEntity extends Entity {

    @OriginalMember(owner = "ab", name = "f", descriptor = "Z")
    private boolean field377 = false;

    @OriginalMember(owner = "ab", name = "g", descriptor = "B")
    private byte field378 = 4;

    @OriginalMember(owner = "ab", name = "h", descriptor = "I")
    private int field379 = 30695;

    @OriginalMember(owner = "ab", name = "t", descriptor = "Z")
    public boolean field391 = false;

    @OriginalMember(owner = "ab", name = "i", descriptor = "Lkc;")
    private SpotAnimType field380;

    @OriginalMember(owner = "ab", name = "j", descriptor = "I")
    public int field381;

    @OriginalMember(owner = "ab", name = "k", descriptor = "I")
    public int field382;

    @OriginalMember(owner = "ab", name = "l", descriptor = "I")
    public int field383;

    @OriginalMember(owner = "ab", name = "m", descriptor = "I")
    public int field384;

    @OriginalMember(owner = "ab", name = "o", descriptor = "I")
    public int field386;

    @OriginalMember(owner = "ab", name = "p", descriptor = "I")
    public int field387;

    @OriginalMember(owner = "ab", name = "q", descriptor = "I")
    public int field388;

    @OriginalMember(owner = "ab", name = "r", descriptor = "I")
    public int field389;

    @OriginalMember(owner = "ab", name = "s", descriptor = "I")
    public int field390;

    @OriginalMember(owner = "ab", name = "n", descriptor = "I")
    public int field385;

    @OriginalMember(owner = "ab", name = "u", descriptor = "D")
    public double field392;

    @OriginalMember(owner = "ab", name = "v", descriptor = "D")
    public double field393;

    @OriginalMember(owner = "ab", name = "w", descriptor = "D")
    public double field394;

    @OriginalMember(owner = "ab", name = "x", descriptor = "D")
    private double field395;

    @OriginalMember(owner = "ab", name = "y", descriptor = "D")
    private double field396;

    @OriginalMember(owner = "ab", name = "z", descriptor = "D")
    private double field397;

    @OriginalMember(owner = "ab", name = "A", descriptor = "D")
    private double field398;

    @OriginalMember(owner = "ab", name = "B", descriptor = "D")
    private double field399;

    @OriginalMember(owner = "ab", name = "C", descriptor = "I")
    public int field400;

    @OriginalMember(owner = "ab", name = "D", descriptor = "I")
    public int field401;

    @OriginalMember(owner = "ab", name = "E", descriptor = "I")
    private int field402;

    @OriginalMember(owner = "ab", name = "F", descriptor = "I")
    private int field403;

    @OriginalMember(owner = "ab", name = "<init>", descriptor = "(IIIIIIIIIBII)V")
    public ProjectileEntity(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte arg9, int arg10, int arg11) {
        this.field380 = SpotAnimType.field1015[arg2];
        this.field381 = arg5;
        this.field382 = arg4;
        this.field383 = arg3;
        this.field384 = arg11;
        this.field386 = arg7;
        this.field387 = arg8;
        this.field388 = arg1;
        this.field389 = arg10;
        if (this.field378 != arg9) {
            this.field377 = !this.field377;
        }
        this.field390 = arg0;
        this.field385 = arg6;
        this.field391 = false;
    }

    @OriginalMember(owner = "ab", name = "a", descriptor = "(IIIII)V")
    public final void method116(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!this.field391) {
            double var6 = (double) (arg1 - this.field382);
            double var8 = (double) (arg3 - this.field383);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field392 = (double) this.field389 * var6 / var10 + (double) this.field382;
            this.field393 = (double) this.field389 * var8 / var10 + (double) this.field383;
            this.field394 = this.field384;
        }
        double var12 = (double) (this.field387 + 1 - arg4);
        this.field395 = ((double) arg1 - this.field392) / var12;
        this.field396 = ((double) arg3 - this.field393) / var12;
        if (this.field379 != arg0) {
            this.field377 = !this.field377;
        }
        this.field397 = Math.sqrt(this.field396 * this.field396 + this.field395 * this.field395);
        if (!this.field391) {
            this.field398 = -this.field397 * Math.tan((double) this.field388 * 0.02454369D);
        }
        this.field399 = ((double) arg2 - this.field394 - this.field398 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "ab", name = "a", descriptor = "(II)V")
    public final void method117(int arg0, int arg1) {
        this.field391 = true;
        this.field392 += (double) arg0 * this.field395;
        this.field393 += (double) arg0 * this.field396;
        this.field394 += this.field399 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field398;
        this.field398 += (double) arg0 * this.field399;
        this.field400 = (int) (Math.atan2(this.field395, this.field396) * 325.949D) + 1024 & 0x7FF;
        if (arg1 >= 0) {
            return;
        }
        this.field401 = (int) (Math.atan2(this.field398, this.field397) * 325.949D) & 0x7FF;
        if (this.field380.field1018 == null) {
            return;
        }
        this.field403 += arg0;
        while (this.field403 > this.field380.field1018.field1003[this.field402]) {
            this.field403 -= this.field380.field1018.field1003[this.field402] + 1;
            this.field402++;
            if (this.field402 >= this.field380.field1018.field1000) {
                this.field402 = 0;
            }
        }
    }

    @OriginalMember(owner = "ab", name = "a", descriptor = "(Z)Leb;")
    public final Model method108(boolean arg0) {
        Model var2 = this.field380.method322();
        Model var3 = new Model(var2, !this.field380.field1019, 868, false, true);
        if (arg0) {
            throw new NullPointerException();
        }
        if (this.field380.field1018 != null) {
            var3.method126(true);
            var3.method127(this.field380.field1018.field1001[this.field402], -227);
            var3.field480 = null;
            var3.field479 = null;
        }
        var3.method131(this.field401, (byte) -30);
        var3.method136(this.field380.field1025 + 64, this.field380.field1026 + 850, -30, -50, -30, true);
        return var3;
    }
}
