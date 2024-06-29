import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class228 {

    @OriginalMember(owner = "client!je", name = "a", descriptor = "[[[I")
    private int[][][] field3821 = new int[2][2][4];

    @OriginalMember(owner = "client!je", name = "d", descriptor = "[I")
    private int[] field3824 = new int[2];

    @OriginalMember(owner = "client!je", name = "f", descriptor = "[I")
    public int[] field3826 = new int[2];

    @OriginalMember(owner = "client!je", name = "g", descriptor = "[[[I")
    private int[][][] field3827 = new int[2][2][4];

    @OriginalMember(owner = "client!je", name = "b", descriptor = "[[I")
    public static int[][] field3822 = new int[2][8];

    @OriginalMember(owner = "client!je", name = "c", descriptor = "[[F")
    private static float[][] field3823 = new float[2][8];

    @OriginalMember(owner = "client!je", name = "e", descriptor = "F")
    private static float field3825;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IF)I", line = 7)
    public final int method1626(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field3824[1] - this.field3824[0]) * arg1 + (float) this.field3824[0];
            float var4 = var3 * 0.0030517578F;
            field3825 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field3828 = (int) (field3825 * 65536.0F);
        }
        if (this.field3826[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1629(arg0, 0, arg1);
        field3823[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1627(arg0, 0, arg1));
        field3823[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field3826[arg0]; var6++) {
            float var9 = this.method1629(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method1627(arg0, var6, arg1));
            float var11 = var9 * var9;
            field3823[arg0][var6 * 2 + 1] = field3823[arg0][var6 * 2 - 1] * var11;
            field3823[arg0][var6 * 2] = field3823[arg0][var6 * 2 - 1] * var10 + field3823[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field3823[arg0][var12] += field3823[arg0][var12 - 1] * var10 + field3823[arg0][var12 - 2] * var11;
            }
            field3823[arg0][1] += field3823[arg0][0] * var10 + var11;
            field3823[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field3826[0] * 2; var7++) {
                field3823[0][var7] *= field3825;
            }
        }
        for (int var8 = 0; var8 < this.field3826[arg0] * 2; var8++) {
            field3822[arg0][var8] = (int) (field3823[arg0][var8] * 65536.0F);
        }
        return this.field3826[arg0] * 2;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIF)F", line = 67)
    private final float method1627(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3827[arg0][1][arg1] - this.field3827[arg0][0][arg1]) * arg2 + (float) this.field3827[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1628(var5);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(F)F", line = 75)
    private static final float method1628(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(IIF)F", line = 87)
    private final float method1629(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3821[arg0][1][arg1] - this.field3821[arg0][0][arg1]) * arg2 + (float) this.field3821[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljg;Lnm;)V", line = 98)
    public final void method1630(class186 arg0, class276 arg1) {
        int var3 = arg0.method1322(false);
        this.field3826[0] = var3 >> 4;
        this.field3826[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field3824[0] = this.field3824[1] = 0;
            return;
        }
        this.field3824[0] = arg0.method1272((byte) -113);
        this.field3824[1] = arg0.method1272((byte) -69);
        int var4 = arg0.method1322(false);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field3826[var5]; var8++) {
                this.field3827[var5][0][var8] = arg0.method1272((byte) -54);
                this.field3821[var5][0][var8] = arg0.method1272((byte) -107);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field3826[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field3827[var6][1][var7] = this.field3827[var6][0][var7];
                    this.field3821[var6][1][var7] = this.field3821[var6][0][var7];
                } else {
                    this.field3827[var6][1][var7] = arg0.method1272((byte) -111);
                    this.field3821[var6][1][var7] = arg0.method1272((byte) -65);
                }
            }
        }
        if (var4 != 0 || this.field3824[1] != this.field3824[0]) {
            arg1.method1859(arg0);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "()V", line = 171)
    public static void method1631() {
        field3823 = null;
        field3822 = null;
    }
}
