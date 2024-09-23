import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ab")
public class ProjectileEntity extends Entity {

    @OriginalMember(owner = "ab", name = "g", descriptor = "I")
    private int field389 = -142;

    @OriginalMember(owner = "ab", name = "s", descriptor = "Z")
    public boolean field401 = false;

    @OriginalMember(owner = "ab", name = "h", descriptor = "Lkc;")
    private SpotAnimType field390;

    @OriginalMember(owner = "ab", name = "i", descriptor = "I")
    public int field391;

    @OriginalMember(owner = "ab", name = "j", descriptor = "I")
    public int field392;

    @OriginalMember(owner = "ab", name = "k", descriptor = "I")
    public int field393;

    @OriginalMember(owner = "ab", name = "l", descriptor = "I")
    public int field394;

    @OriginalMember(owner = "ab", name = "n", descriptor = "I")
    public int field396;

    @OriginalMember(owner = "ab", name = "o", descriptor = "I")
    public int field397;

    @OriginalMember(owner = "ab", name = "p", descriptor = "I")
    public int field398;

    @OriginalMember(owner = "ab", name = "q", descriptor = "I")
    public int field399;

    @OriginalMember(owner = "ab", name = "r", descriptor = "I")
    public int field400;

    @OriginalMember(owner = "ab", name = "m", descriptor = "I")
    public int field395;

    @OriginalMember(owner = "ab", name = "t", descriptor = "D")
    public double field402;

    @OriginalMember(owner = "ab", name = "u", descriptor = "D")
    public double field403;

    @OriginalMember(owner = "ab", name = "v", descriptor = "D")
    public double field404;

    @OriginalMember(owner = "ab", name = "w", descriptor = "D")
    private double field405;

    @OriginalMember(owner = "ab", name = "x", descriptor = "D")
    private double field406;

    @OriginalMember(owner = "ab", name = "y", descriptor = "D")
    private double field407;

    @OriginalMember(owner = "ab", name = "z", descriptor = "D")
    private double field408;

    @OriginalMember(owner = "ab", name = "A", descriptor = "D")
    private double field409;

    @OriginalMember(owner = "ab", name = "f", descriptor = "I")
    private int field388;

    @OriginalMember(owner = "ab", name = "B", descriptor = "I")
    public int field410;

    @OriginalMember(owner = "ab", name = "C", descriptor = "I")
    public int field411;

    @OriginalMember(owner = "ab", name = "D", descriptor = "I")
    private int field412;

    @OriginalMember(owner = "ab", name = "E", descriptor = "I")
    private int field413;

    @OriginalMember(owner = "ab", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
    public ProjectileEntity(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        if (arg9 != 45526) {
            this.field389 = 126;
        }
        this.field390 = SpotAnimType.field1033[arg1];
        this.field391 = arg8;
        this.field392 = arg11;
        this.field393 = arg0;
        this.field394 = arg7;
        this.field396 = arg2;
        this.field397 = arg4;
        this.field398 = arg10;
        this.field399 = arg5;
        this.field400 = arg3;
        this.field395 = arg6;
        this.field401 = false;
    }

    @OriginalMember(owner = "ab", name = "a", descriptor = "(IIIII)V")
    public final void method117(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!this.field401) {
            double var6 = (double) (arg0 - this.field392);
            double var8 = (double) (arg2 - this.field393);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field402 = (double) this.field399 * var6 / var10 + (double) this.field392;
            this.field403 = (double) this.field399 * var8 / var10 + (double) this.field393;
            this.field404 = this.field394;
        }
        double var12 = (double) (this.field397 + 1 - arg1);
        int var14 = 72 / arg3;
        this.field405 = ((double) arg0 - this.field402) / var12;
        this.field406 = ((double) arg2 - this.field403) / var12;
        this.field407 = Math.sqrt(this.field406 * this.field406 + this.field405 * this.field405);
        if (!this.field401) {
            this.field408 = -this.field407 * Math.tan((double) this.field398 * 0.02454369D);
        }
        this.field409 = ((double) arg4 - this.field404 - this.field408 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "ab", name = "a", descriptor = "(IZ)V")
    public final void method118(int arg0, boolean arg1) {
        this.field401 = true;
        this.field402 += (double) arg0 * this.field405;
        this.field403 += (double) arg0 * this.field406;
        this.field404 += this.field409 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field408;
        this.field408 += (double) arg0 * this.field409;
        this.field410 = (int) (Math.atan2(this.field405, this.field406) * 325.949D) + 1024 & 0x7FF;
        this.field411 = (int) (Math.atan2(this.field408, this.field407) * 325.949D) & 0x7FF;
        if (arg1 || this.field390.field1037 == null) {
            return;
        }
        this.field413 += arg0;
        while (this.field413 > this.field390.field1037.field1022[this.field412]) {
            this.field413 -= this.field390.field1037.field1022[this.field412] + 1;
            this.field412++;
            if (this.field412 >= this.field390.field1037.field1019) {
                this.field412 = 0;
            }
        }
    }

    @OriginalMember(owner = "ab", name = "a", descriptor = "(I)Leb;")
    public final Model method109(int arg0) {
        Model var2 = this.field390.method330();
        Model var3 = new Model(!this.field390.field1038, (byte) 70, true, var2, false);
        if (this.field390.field1037 != null) {
            var3.method127(false);
            var3.method128(this.field390.field1037.field1020[this.field412], 5565);
            var3.field489 = null;
            var3.field488 = null;
        }
        if (this.field390.field1041 != 128 || this.field390.field1042 != 128) {
            var3.method136(this.field390.field1042, this.field390.field1041, false, this.field390.field1041);
        }
        var3.method132(true, this.field411);
        var3.method137(this.field390.field1044 + 64, this.field390.field1045 + 850, -30, -50, -30, true);
        if (arg0 < this.field388 || arg0 > this.field388) {
            this.field388 = -3;
        }
        return var3;
    }
}
