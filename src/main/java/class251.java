import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class251 {

    @OriginalMember(owner = "client!io", name = "d", descriptor = "[I")
    private int[] field3575 = new int[2];

    @OriginalMember(owner = "client!io", name = "c", descriptor = "[[[I")
    private int[][][] field3574 = new int[2][2][4];

    @OriginalMember(owner = "client!io", name = "e", descriptor = "[I")
    public int[] field3576 = new int[2];

    @OriginalMember(owner = "client!io", name = "h", descriptor = "[[[I")
    private int[][][] field3579 = new int[2][2][4];

    @OriginalMember(owner = "client!io", name = "a", descriptor = "[[F")
    private static float[][] field3572 = new float[2][8];

    @OriginalMember(owner = "client!io", name = "b", descriptor = "[[I")
    public static int[][] field3573 = new int[2][8];

    @OriginalMember(owner = "client!io", name = "f", descriptor = "F")
    private static float field3577;

    @OriginalMember(owner = "client!io", name = "g", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IIF)F", line = 17)
    private final float method1701(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3574[arg0][1][arg1] - this.field3574[arg0][0][arg1]) * arg2 + (float) this.field3574[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1702(var5);
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(F)F", line = 29)
    private static final float method1702(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(IIF)F", line = 37)
    private final float method1703(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3579[arg0][1][arg1] - this.field3579[arg0][0][arg1]) * arg2 + (float) this.field3579[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "()V", line = 42)
    public static void method1704() {
        field3572 = null;
        field3573 = null;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IF)I", line = 47)
    public final int method1705(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field3575[1] - this.field3575[0]) * arg1 + (float) this.field3575[0];
            float var4 = var3 * 0.0030517578F;
            field3577 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field3578 = (int) (field3577 * 65536.0F);
        }
        if (this.field3576[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1703(arg0, 0, arg1);
        field3572[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1701(arg0, 0, arg1));
        field3572[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field3576[arg0]; var6++) {
            float var9 = this.method1703(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method1701(arg0, var6, arg1));
            float var11 = var9 * var9;
            field3572[arg0][var6 * 2 + 1] = field3572[arg0][var6 * 2 - 1] * var11;
            field3572[arg0][var6 * 2] = field3572[arg0][var6 * 2 - 1] * var10 + field3572[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field3572[arg0][var12] += field3572[arg0][var12 - 1] * var10 + field3572[arg0][var12 - 2] * var11;
            }
            field3572[arg0][1] += field3572[arg0][0] * var10 + var11;
            field3572[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field3576[0] * 2; var7++) {
                field3572[0][var7] *= field3577;
            }
        }
        for (int var8 = 0; var8 < this.field3576[arg0] * 2; var8++) {
            field3573[arg0][var8] = (int) (field3572[arg0][var8] * 65536.0F);
        }
        return this.field3576[arg0] * 2;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Ldg;Lbd;)V", line = 107)
    public final void method1706(class236 arg0, class37 arg1) {
        int var3 = arg0.method1574(-22);
        this.field3576[0] = var3 >> 4;
        this.field3576[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field3575[0] = this.field3575[1] = 0;
            return;
        }
        this.field3575[0] = arg0.method1617((byte) 48);
        this.field3575[1] = arg0.method1617((byte) 48);
        int var4 = arg0.method1574(-128);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field3576[var5]; var8++) {
                this.field3574[var5][0][var8] = arg0.method1617((byte) 48);
                this.field3579[var5][0][var8] = arg0.method1617((byte) 48);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field3576[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field3574[var6][1][var7] = this.field3574[var6][0][var7];
                    this.field3579[var6][1][var7] = this.field3579[var6][0][var7];
                } else {
                    this.field3574[var6][1][var7] = arg0.method1617((byte) 48);
                    this.field3579[var6][1][var7] = arg0.method1617((byte) 48);
                }
            }
        }
        if (var4 != 0 || this.field3575[1] != this.field3575[0]) {
            arg1.method225(arg0);
        }
    }
}
