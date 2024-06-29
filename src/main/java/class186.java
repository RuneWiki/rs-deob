import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class186 {

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "[I")
    public int[] field3239 = new int[2];

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "[I")
    private int[] field3242 = new int[2];

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "[[[I")
    private int[][][] field3244 = new int[2][2][4];

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "[[[I")
    private int[][][] field3240 = new int[2][2][4];

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "[[I")
    public static int[][] field3241 = new int[2][8];

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "[[F")
    private static float[][] field3246 = new float[2][8];

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "F")
    private static float field3245;

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IF)I")
    public final int method1257(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field3242[1] - this.field3242[0]) * arg1 + (float) this.field3242[0];
            float var4 = var3 * 0.0030517578F;
            field3245 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field3243 = (int) (field3245 * 65536.0F);
        }
        if (this.field3239[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1262(arg0, 0, arg1);
        field3246[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1261(arg0, 0, arg1));
        field3246[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field3239[arg0]; var6++) {
            float var9 = this.method1262(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method1261(arg0, var6, arg1));
            float var11 = var9 * var9;
            field3246[arg0][var6 * 2 + 1] = field3246[arg0][var6 * 2 - 1] * var11;
            field3246[arg0][var6 * 2] = field3246[arg0][var6 * 2 - 1] * var10 + field3246[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field3246[arg0][var12] += field3246[arg0][var12 - 1] * var10 + field3246[arg0][var12 - 2] * var11;
            }
            field3246[arg0][1] += field3246[arg0][0] * var10 + var11;
            field3246[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field3239[0] * 2; var7++) {
                field3246[0][var7] *= field3245;
            }
        }
        for (int var8 = 0; var8 < this.field3239[arg0] * 2; var8++) {
            field3241[arg0][var8] = (int) (field3246[arg0][var8] * 65536.0F);
        }
        return this.field3239[arg0] * 2;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lji;Lid;)V")
    public final void method1258(class225 arg0, class214 arg1) {
        int var3 = arg0.method1580(-111);
        this.field3239[0] = var3 >> 4;
        this.field3239[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field3242[0] = this.field3242[1] = 0;
            return;
        }
        this.field3242[0] = arg0.method1593(true);
        this.field3242[1] = arg0.method1593(true);
        int var4 = arg0.method1580(-118);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field3239[var5]; var8++) {
                this.field3244[var5][0][var8] = arg0.method1593(true);
                this.field3240[var5][0][var8] = arg0.method1593(true);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field3239[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field3244[var6][1][var7] = this.field3244[var6][0][var7];
                    this.field3240[var6][1][var7] = this.field3240[var6][0][var7];
                } else {
                    this.field3244[var6][1][var7] = arg0.method1593(true);
                    this.field3240[var6][1][var7] = arg0.method1593(true);
                }
            }
        }
        if (var4 != 0 || this.field3242[1] != this.field3242[0]) {
            arg1.method1462(arg0);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "()V")
    public static void method1259() {
        field3246 = null;
        field3241 = null;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(F)F")
    private static final float method1260(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIF)F")
    private final float method1261(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3244[arg0][1][arg1] - this.field3244[arg0][0][arg1]) * arg2 + (float) this.field3244[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1260(var5);
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(IIF)F")
    private final float method1262(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3240[arg0][1][arg1] - this.field3240[arg0][0][arg1]) * arg2 + (float) this.field3240[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }
}
