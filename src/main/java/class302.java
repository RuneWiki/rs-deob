import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class302 {

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "[I")
    private int[] field5183 = new int[2];

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "[I")
    public int[] field5187 = new int[2];

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "[[[I")
    private int[][][] field5188 = new int[2][2][4];

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "[[[I")
    private int[][][] field5189 = new int[2][2][4];

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "[[I")
    public static int[][] field5186 = new int[2][8];

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "[[F")
    private static float[][] field5184 = new float[2][8];

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "F")
    private static float field5185;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
    public static int field5182;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(F)F", line = 8)
    private static final float method2105(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IF)I", line = 15)
    public final int method2106(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field5183[1] - this.field5183[0]) * arg1 + (float) this.field5183[0];
            float var4 = var3 * 0.0030517578F;
            field5185 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field5182 = (int) (field5185 * 65536.0F);
        }
        if (this.field5187[arg0] == 0) {
            return 0;
        }
        float var5 = this.method2109(arg0, 0, arg1);
        field5184[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method2110(arg0, 0, arg1));
        field5184[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field5187[arg0]; var6++) {
            float var7 = this.method2109(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method2110(arg0, var6, arg1));
            float var9 = var7 * var7;
            field5184[arg0][var6 * 2 + 1] = field5184[arg0][var6 * 2 - 1] * var9;
            field5184[arg0][var6 * 2] = field5184[arg0][var6 * 2 - 1] * var8 + field5184[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field5184[arg0][var10] += field5184[arg0][var10 - 1] * var8 + field5184[arg0][var10 - 2] * var9;
            }
            field5184[arg0][1] += field5184[arg0][0] * var8 + var9;
            field5184[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field5187[0] * 2; var11++) {
                field5184[0][var11] *= field5185;
            }
        }
        for (int var12 = 0; var12 < this.field5187[arg0] * 2; var12++) {
            field5186[arg0][var12] = (int) (field5184[arg0][var12] * 65536.0F);
        }
        return this.field5187[arg0] * 2;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lpb;Lv;)V", line = 76)
    public final void method2107(class70 arg0, class66 arg1) {
        int var3 = arg0.method481(0);
        this.field5187[0] = var3 >> 4;
        this.field5187[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field5183[0] = this.field5183[1] = 0;
            return;
        }
        this.field5183[0] = arg0.method423(255);
        this.field5183[1] = arg0.method423(255);
        int var4 = arg0.method481(0);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field5187[var5]; var6++) {
                this.field5189[var5][0][var6] = arg0.method423(255);
                this.field5188[var5][0][var6] = arg0.method423(255);
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field5187[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field5189[var7][1][var8] = this.field5189[var7][0][var8];
                    this.field5188[var7][1][var8] = this.field5188[var7][0][var8];
                } else {
                    this.field5189[var7][1][var8] = arg0.method423(255);
                    this.field5188[var7][1][var8] = arg0.method423(255);
                }
            }
        }
        if (var4 != 0 || this.field5183[1] != this.field5183[0]) {
            arg1.method404(arg0);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "()V", line = 143)
    public static void method2108() {
        field5184 = (float[][]) null;
        field5186 = (int[][]) null;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIF)F", line = 162)
    private final float method2109(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field5188[arg0][1][arg1] - this.field5188[arg0][0][arg1]) * arg2 + (float) this.field5188[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(IIF)F", line = 168)
    private final float method2110(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field5189[arg0][1][arg1] - this.field5189[arg0][0][arg1]) * arg2 + (float) this.field5189[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method2105(var5);
    }
}
