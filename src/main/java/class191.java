import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class191 {

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "[[[I")
    private int[][][] field3270 = new int[2][2][4];

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "[I")
    public int[] field3272 = new int[2];

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "[I")
    private int[] field3275 = new int[2];

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "[[[I")
    private int[][][] field3271 = new int[2][2][4];

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "[[I")
    public static int[][] field3276 = new int[2][8];

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "[[F")
    private static float[][] field3273 = new float[2][8];

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "F")
    private static float field3274;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "I")
    public static int field3277;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "()V", line = 8)
    public static void method1348() {
        field3273 = (float[][]) null;
        field3276 = (int[][]) null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIF)F", line = 14)
    private final float method1349(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3271[arg0][1][arg1] - this.field3271[arg0][0][arg1]) * arg2 + (float) this.field3271[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(IIF)F", line = 26)
    private final float method1350(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3270[arg0][1][arg1] - this.field3270[arg0][0][arg1]) * arg2 + (float) this.field3270[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1353(var5);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IF)I", line = 32)
    public final int method1351(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field3275[1] - this.field3275[0]) * arg1 + (float) this.field3275[0];
            float var4 = var3 * 0.0030517578F;
            field3274 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field3277 = (int) (field3274 * 65536.0F);
        }
        if (this.field3272[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1349(arg0, 0, arg1);
        field3273[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1350(arg0, 0, arg1));
        field3273[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field3272[arg0]; var6++) {
            float var7 = this.method1349(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1350(arg0, var6, arg1));
            float var9 = var7 * var7;
            field3273[arg0][var6 * 2 + 1] = field3273[arg0][var6 * 2 - 1] * var9;
            field3273[arg0][var6 * 2] = field3273[arg0][var6 * 2 - 1] * var8 + field3273[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field3273[arg0][var10] += field3273[arg0][var10 - 1] * var8 + field3273[arg0][var10 - 2] * var9;
            }
            field3273[arg0][1] += field3273[arg0][0] * var8 + var9;
            field3273[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field3272[0] * 2; var11++) {
                field3273[0][var11] *= field3274;
            }
        }
        for (int var12 = 0; var12 < this.field3272[arg0] * 2; var12++) {
            field3276[arg0][var12] = (int) (field3273[arg0][var12] * 65536.0F);
        }
        return this.field3272[arg0] * 2;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lkh;Lob;)V", line = 94)
    public final void method1352(class13 arg0, class279 arg1) {
        int var3 = arg0.method152((byte) -99);
        this.field3272[0] = var3 >> 4;
        this.field3272[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field3275[0] = this.field3275[1] = 0;
            return;
        }
        this.field3275[0] = arg0.method112((byte) 92);
        this.field3275[1] = arg0.method112((byte) 92);
        int var4 = arg0.method152((byte) -124);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field3272[var5]; var6++) {
                this.field3270[var5][0][var6] = arg0.method112((byte) 92);
                this.field3271[var5][0][var6] = arg0.method112((byte) 92);
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field3272[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field3270[var7][1][var8] = this.field3270[var7][0][var8];
                    this.field3271[var7][1][var8] = this.field3271[var7][0][var8];
                } else {
                    this.field3270[var7][1][var8] = arg0.method112((byte) 92);
                    this.field3271[var7][1][var8] = arg0.method112((byte) 92);
                }
            }
        }
        if (var4 != 0 || this.field3275[1] != this.field3275[0]) {
            arg1.method1936(arg0);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(F)F", line = 164)
    private static final float method1353(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }
}
