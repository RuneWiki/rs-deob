import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ab")
public class ProjectileEntity extends Entity {

    @OriginalMember(owner = "ab", name = "f", descriptor = "I")
    private int field379 = -159;

    @OriginalMember(owner = "ab", name = "r", descriptor = "Z")
    public boolean field391 = false;

    @OriginalMember(owner = "ab", name = "g", descriptor = "Lkc;")
    private SpotAnimType field380;

    @OriginalMember(owner = "ab", name = "h", descriptor = "I")
    public int field381;

    @OriginalMember(owner = "ab", name = "i", descriptor = "I")
    public int field382;

    @OriginalMember(owner = "ab", name = "j", descriptor = "I")
    public int field383;

    @OriginalMember(owner = "ab", name = "k", descriptor = "I")
    public int field384;

    @OriginalMember(owner = "ab", name = "m", descriptor = "I")
    public int field386;

    @OriginalMember(owner = "ab", name = "n", descriptor = "I")
    public int field387;

    @OriginalMember(owner = "ab", name = "o", descriptor = "I")
    public int field388;

    @OriginalMember(owner = "ab", name = "p", descriptor = "I")
    public int field389;

    @OriginalMember(owner = "ab", name = "q", descriptor = "I")
    public int field390;

    @OriginalMember(owner = "ab", name = "l", descriptor = "I")
    public int field385;

    @OriginalMember(owner = "ab", name = "s", descriptor = "D")
    public double field392;

    @OriginalMember(owner = "ab", name = "t", descriptor = "D")
    public double field393;

    @OriginalMember(owner = "ab", name = "u", descriptor = "D")
    public double field394;

    @OriginalMember(owner = "ab", name = "v", descriptor = "D")
    private double field395;

    @OriginalMember(owner = "ab", name = "w", descriptor = "D")
    private double field396;

    @OriginalMember(owner = "ab", name = "x", descriptor = "D")
    private double field397;

    @OriginalMember(owner = "ab", name = "y", descriptor = "D")
    private double field398;

    @OriginalMember(owner = "ab", name = "z", descriptor = "D")
    private double field399;

    @OriginalMember(owner = "ab", name = "e", descriptor = "I")
    private int field378;

    @OriginalMember(owner = "ab", name = "A", descriptor = "I")
    public int field400;

    @OriginalMember(owner = "ab", name = "B", descriptor = "I")
    public int field401;

    @OriginalMember(owner = "ab", name = "C", descriptor = "I")
    private int field402;

    @OriginalMember(owner = "ab", name = "D", descriptor = "I")
    private int field403;

    @OriginalMember(owner = "ab", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
    public ProjectileEntity(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        this.field380 = SpotAnimType.field1043[arg10];
        if (arg8 != 0) {
            throw new NullPointerException();
        }
        this.field381 = arg4;
        this.field382 = arg11;
        this.field383 = arg2;
        this.field384 = arg9;
        this.field386 = arg6;
        this.field387 = arg3;
        this.field388 = arg1;
        this.field389 = arg7;
        this.field390 = arg5;
        this.field385 = arg0;
        this.field391 = false;
    }

    @OriginalMember(owner = "ab", name = "a", descriptor = "(IIIII)V")
    public final void method117(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!this.field391) {
            double var6 = (double) (arg2 - this.field382);
            double var8 = (double) (arg1 - this.field383);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field392 = (double) this.field389 * var6 / var10 + (double) this.field382;
            this.field393 = (double) this.field389 * var8 / var10 + (double) this.field383;
            this.field394 = this.field384;
        }
        double var12 = (double) (this.field387 + 1 - arg4);
        this.field395 = ((double) arg2 - this.field392) / var12;
        this.field396 = ((double) arg1 - this.field393) / var12;
        this.field397 = Math.sqrt(this.field396 * this.field396 + this.field395 * this.field395);
        if (!this.field391) {
            this.field398 = -this.field397 * Math.tan((double) this.field388 * 0.02454369D);
        }
        this.field399 = ((double) arg0 - this.field394 - this.field398 * var12) * 2.0D / (var12 * var12);
        if (arg3 < 0) {
            ;
        }
    }

    @OriginalMember(owner = "ab", name = "a", descriptor = "(BI)V")
    public final void method118(byte arg0, int arg1) {
        if (arg0 != -30) {
            this.field379 = -454;
        }
        this.field391 = true;
        this.field392 += (double) arg1 * this.field395;
        this.field393 += (double) arg1 * this.field396;
        this.field394 += this.field399 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field398;
        this.field398 += (double) arg1 * this.field399;
        this.field400 = (int) (Math.atan2(this.field395, this.field396) * 325.949D) + 1024 & 0x7FF;
        this.field401 = (int) (Math.atan2(this.field398, this.field397) * 325.949D) & 0x7FF;
        if (this.field380.field1047 == null) {
            return;
        }
        this.field403 += arg1;
        while (this.field403 > this.field380.field1047.field1032[this.field402]) {
            this.field403 -= this.field380.field1047.field1032[this.field402] + 1;
            this.field402++;
            if (this.field402 >= this.field380.field1047.field1029) {
                this.field402 = 0;
            }
        }
    }

    @OriginalMember(owner = "ab", name = "a", descriptor = "(Z)Leb;")
    public final Model method109(boolean arg0) {
        Model var2 = this.field380.method330();
        Model var3 = new Model(var2, true, !this.field380.field1048, this.field378, false);
        if (!arg0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (this.field380.field1047 != null) {
            var3.method127(4);
            var3.method128(-16599, this.field380.field1047.field1030[this.field402]);
            var3.field480 = null;
            var3.field479 = null;
        }
        if (this.field380.field1051 != 128 || this.field380.field1052 != 128) {
            var3.method136(this.field380.field1051, 2, this.field380.field1052, this.field380.field1051);
        }
        var3.method132((byte) 7, this.field401);
        var3.method137(this.field380.field1054 + 64, this.field380.field1055 + 850, -30, -50, -30, true);
        return var3;
    }
}
