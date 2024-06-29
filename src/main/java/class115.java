import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class115 {

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "[I")
    public int[] field2638 = new int[2];

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "[[[I")
    private int[][][] field2640 = new int[2][2][4];

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "[[[I")
    private int[][][] field2641 = new int[2][2][4];

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "[I")
    private int[] field2643 = new int[2];

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "[[I")
    public static int[][] field2637 = new int[2][8];

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "[[F")
    private static float[][] field2639 = new float[2][8];

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "F")
    private static float field2636;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "I")
    public static int field2642;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "()V")
    public static void method904() {
        field2639 = null;
        field2637 = null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIF)F")
    private final float method905(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2641[arg0][1][arg1] - this.field2641[arg0][0][arg1]) * arg2 + (float) this.field2641[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method909(var5);
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(IIF)F")
    private final float method906(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2640[arg0][1][arg1] - this.field2640[arg0][0][arg1]) * arg2 + (float) this.field2640[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lsb;Loe;)V")
    public final void method907(class127 arg0, class102 arg1) {
        int var3 = arg0.method1011(70);
        this.field2638[0] = var3 >> 4;
        this.field2638[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field2643[0] = this.field2643[1] = 0;
            return;
        }
        this.field2643[0] = arg0.method1020(false);
        this.field2643[1] = arg0.method1020(false);
        int var4 = arg0.method1011(110);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field2638[var5]; var8++) {
                this.field2641[var5][0][var8] = arg0.method1020(false);
                this.field2640[var5][0][var8] = arg0.method1020(false);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field2638[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field2641[var6][1][var7] = this.field2641[var6][0][var7];
                    this.field2640[var6][1][var7] = this.field2640[var6][0][var7];
                } else {
                    this.field2641[var6][1][var7] = arg0.method1020(false);
                    this.field2640[var6][1][var7] = arg0.method1020(false);
                }
            }
        }
        if (var4 != 0 || this.field2643[1] != this.field2643[0]) {
            arg1.method816(arg0);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IF)I")
    public final int method908(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field2643[1] - this.field2643[0]) * arg1 + (float) this.field2643[0];
            float var4 = var3 * 0.0030517578F;
            field2636 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field2642 = (int) (field2636 * 65536.0F);
        }
        if (this.field2638[arg0] == 0) {
            return 0;
        }
        float var5 = this.method906(arg0, 0, arg1);
        field2639[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method905(arg0, 0, arg1));
        field2639[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field2638[arg0]; var6++) {
            float var9 = this.method906(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method905(arg0, var6, arg1));
            float var11 = var9 * var9;
            field2639[arg0][var6 * 2 + 1] = field2639[arg0][var6 * 2 - 1] * var11;
            field2639[arg0][var6 * 2] = field2639[arg0][var6 * 2 - 1] * var10 + field2639[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field2639[arg0][var12] += field2639[arg0][var12 - 1] * var10 + field2639[arg0][var12 - 2] * var11;
            }
            field2639[arg0][1] += field2639[arg0][0] * var10 + var11;
            field2639[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field2638[0] * 2; var7++) {
                field2639[0][var7] *= field2636;
            }
        }
        for (int var8 = 0; var8 < this.field2638[arg0] * 2; var8++) {
            field2637[arg0][var8] = (int) (field2639[arg0][var8] * 65536.0F);
        }
        return this.field2638[arg0] * 2;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(F)F")
    private static final float method909(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }
}
