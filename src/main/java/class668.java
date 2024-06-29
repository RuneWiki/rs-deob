import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class668 {

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "[[[I")
    private int[][][] field9532 = new int[2][2][4];

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "[I")
    private int[] field9530 = new int[2];

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "[[[I")
    private int[][][] field9535 = new int[2][2][4];

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "[I")
    public int[] field9533 = new int[2];

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "[[F")
    private static float[][] field9531 = new float[2][8];

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "[[I")
    public static int[][] field9534 = new int[2][8];

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "F")
    private static float field9536;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "I")
    public static int field9529;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "()V")
    public static void method3810() {
        field9531 = null;
        field9534 = null;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lsl;Lcq;)V")
    public final void method3811(class479 arg0, class220 arg1) {
        int var3 = arg0.method2886(true);
        this.field9533[0] = var3 >> 4;
        this.field9533[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field9530[0] = this.field9530[1] = 0;
            return;
        }
        this.field9530[0] = arg0.method2882(-1);
        this.field9530[1] = arg0.method2882(-1);
        int var4 = arg0.method2886(true);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field9533[var5]; var8++) {
                this.field9535[var5][0][var8] = arg0.method2882(-1);
                this.field9532[var5][0][var8] = arg0.method2882(-1);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field9533[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field9535[var6][1][var7] = this.field9535[var6][0][var7];
                    this.field9532[var6][1][var7] = this.field9532[var6][0][var7];
                } else {
                    this.field9535[var6][1][var7] = arg0.method2882(-1);
                    this.field9532[var6][1][var7] = arg0.method2882(-1);
                }
            }
        }
        if (var4 != 0 || this.field9530[1] != this.field9530[0]) {
            arg1.method1546(arg0);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(F)F")
    private static final float method3812(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIF)F")
    private final float method3813(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field9532[arg0][1][arg1] - this.field9532[arg0][0][arg1]) * arg2 + (float) this.field9532[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(IIF)F")
    private final float method3814(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field9535[arg0][1][arg1] - this.field9535[arg0][0][arg1]) * arg2 + (float) this.field9535[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method3812(var5);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IF)I")
    public final int method3815(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field9530[1] - this.field9530[0]) * arg1 + (float) this.field9530[0];
            float var4 = var3 * 0.0030517578F;
            field9536 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field9529 = (int) (field9536 * 65536.0F);
        }
        if (this.field9533[arg0] == 0) {
            return 0;
        }
        float var5 = this.method3813(arg0, 0, arg1);
        field9531[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method3814(arg0, 0, arg1));
        field9531[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field9533[arg0]; var6++) {
            float var9 = this.method3813(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method3814(arg0, var6, arg1));
            float var11 = var9 * var9;
            field9531[arg0][var6 * 2 + 1] = field9531[arg0][var6 * 2 - 1] * var11;
            field9531[arg0][var6 * 2] = field9531[arg0][var6 * 2 - 1] * var10 + field9531[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field9531[arg0][var12] += field9531[arg0][var12 - 1] * var10 + field9531[arg0][var12 - 2] * var11;
            }
            field9531[arg0][1] += field9531[arg0][0] * var10 + var11;
            field9531[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field9533[0] * 2; var7++) {
                field9531[0][var7] *= field9536;
            }
        }
        for (int var8 = 0; var8 < this.field9533[arg0] * 2; var8++) {
            field9534[arg0][var8] = (int) (field9531[arg0][var8] * 65536.0F);
        }
        return this.field9533[arg0] * 2;
    }
}
