import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class279 {

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "[[[I")
    private int[][][] field3847 = new int[2][2][4];

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "[I")
    public int[] field3846 = new int[2];

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "[I")
    private int[] field3849 = new int[2];

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "[[[I")
    private int[][][] field3852 = new int[2][2][4];

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "[[F")
    private static float[][] field3848 = new float[2][8];

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "[[I")
    public static int[][] field3851 = new int[2][8];

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "F")
    private static float field3845;

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIF)F")
    private final float method1742(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3847[arg0][1][arg1] - this.field3847[arg0][0][arg1]) * arg2 + (float) this.field3847[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(IIF)F")
    private final float method1743(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3852[arg0][1][arg1] - this.field3852[arg0][0][arg1]) * arg2 + (float) this.field3852[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1747(var5);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "()V")
    public static void method1744() {
        field3848 = null;
        field3851 = null;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Llk;Le;)V")
    public final void method1745(class425 arg0, class253 arg1) {
        int var3 = arg0.method2503(true);
        this.field3846[0] = var3 >> 4;
        this.field3846[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field3849[0] = this.field3849[1] = 0;
            return;
        }
        this.field3849[0] = arg0.method2508(true);
        this.field3849[1] = arg0.method2508(true);
        int var4 = arg0.method2503(true);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field3846[var5]; var8++) {
                this.field3852[var5][0][var8] = arg0.method2508(true);
                this.field3847[var5][0][var8] = arg0.method2508(true);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field3846[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field3852[var6][1][var7] = this.field3852[var6][0][var7];
                    this.field3847[var6][1][var7] = this.field3847[var6][0][var7];
                } else {
                    this.field3852[var6][1][var7] = arg0.method2508(true);
                    this.field3847[var6][1][var7] = arg0.method2508(true);
                }
            }
        }
        if (var4 != 0 || this.field3849[1] != this.field3849[0]) {
            arg1.method1574(arg0);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IF)I")
    public final int method1746(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field3849[1] - this.field3849[0]) * arg1 + (float) this.field3849[0];
            float var4 = var3 * 0.0030517578F;
            field3845 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field3850 = (int) (field3845 * 65536.0F);
        }
        if (this.field3846[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1742(arg0, 0, arg1);
        field3848[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1743(arg0, 0, arg1));
        field3848[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field3846[arg0]; var6++) {
            float var9 = this.method1742(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method1743(arg0, var6, arg1));
            float var11 = var9 * var9;
            field3848[arg0][var6 * 2 + 1] = field3848[arg0][var6 * 2 - 1] * var11;
            field3848[arg0][var6 * 2] = field3848[arg0][var6 * 2 - 1] * var10 + field3848[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field3848[arg0][var12] += field3848[arg0][var12 - 1] * var10 + field3848[arg0][var12 - 2] * var11;
            }
            field3848[arg0][1] += field3848[arg0][0] * var10 + var11;
            field3848[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field3846[0] * 2; var7++) {
                field3848[0][var7] *= field3845;
            }
        }
        for (int var8 = 0; var8 < this.field3846[arg0] * 2; var8++) {
            field3851[arg0][var8] = (int) (field3848[arg0][var8] * 65536.0F);
        }
        return this.field3846[arg0] * 2;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(F)F")
    private static final float method1747(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }
}
