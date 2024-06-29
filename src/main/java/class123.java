import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class123 {

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "[I")
    private int[] field2234 = new int[2];

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "[[[I")
    private int[][][] field2236 = new int[2][2][4];

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "[[[I")
    private int[][][] field2235 = new int[2][2][4];

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "[I")
    public int[] field2239 = new int[2];

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "[[I")
    public static int[][] field2237 = new int[2][8];

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "[[F")
    private static float[][] field2240 = new float[2][8];

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "F")
    private static float field2238;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IF)I")
    public final int method1057(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field2234[1] - this.field2234[0]) * arg1 + (float) this.field2234[0];
            float var4 = var3 * 0.0030517578F;
            field2238 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field2233 = (int) (field2238 * 65536.0F);
        }
        if (this.field2239[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1062(arg0, 0, arg1);
        field2240[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1060(arg0, 0, arg1));
        field2240[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field2239[arg0]; var6++) {
            float var9 = this.method1062(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method1060(arg0, var6, arg1));
            float var11 = var9 * var9;
            field2240[arg0][var6 * 2 + 1] = field2240[arg0][var6 * 2 - 1] * var11;
            field2240[arg0][var6 * 2] = field2240[arg0][var6 * 2 - 1] * var10 + field2240[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field2240[arg0][var12] += field2240[arg0][var12 - 1] * var10 + field2240[arg0][var12 - 2] * var11;
            }
            field2240[arg0][1] += field2240[arg0][0] * var10 + var11;
            field2240[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field2239[0] * 2; var7++) {
                field2240[0][var7] *= field2238;
            }
        }
        for (int var8 = 0; var8 < this.field2239[arg0] * 2; var8++) {
            field2237[arg0][var8] = (int) (field2240[arg0][var8] * 65536.0F);
        }
        return this.field2239[arg0] * 2;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(F)F")
    private static final float method1058(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lqh;Lvda;)V")
    public final void method1059(class61 arg0, class166 arg1) {
        int var3 = arg0.method732(-559537960);
        this.field2239[0] = var3 >> 4;
        this.field2239[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field2234[0] = this.field2234[1] = 0;
            return;
        }
        this.field2234[0] = arg0.method723((byte) -25);
        this.field2234[1] = arg0.method723((byte) -25);
        int var4 = arg0.method732(-559537960);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field2239[var5]; var8++) {
                this.field2235[var5][0][var8] = arg0.method723((byte) -25);
                this.field2236[var5][0][var8] = arg0.method723((byte) -25);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field2239[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field2235[var6][1][var7] = this.field2235[var6][0][var7];
                    this.field2236[var6][1][var7] = this.field2236[var6][0][var7];
                } else {
                    this.field2235[var6][1][var7] = arg0.method723((byte) -25);
                    this.field2236[var6][1][var7] = arg0.method723((byte) -25);
                }
            }
        }
        if (var4 != 0 || this.field2234[1] != this.field2234[0]) {
            arg1.method1258(arg0);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIF)F")
    private final float method1060(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2235[arg0][1][arg1] - this.field2235[arg0][0][arg1]) * arg2 + (float) this.field2235[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1058(var5);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "()V")
    public static void method1061() {
        field2240 = null;
        field2237 = null;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(IIF)F")
    private final float method1062(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2236[arg0][1][arg1] - this.field2236[arg0][0][arg1]) * arg2 + (float) this.field2236[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }
}
