import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class184 {

    @OriginalMember(owner = "client!te", name = "e", descriptor = "[I")
    public int[] field3482 = new int[2];

    @OriginalMember(owner = "client!te", name = "a", descriptor = "[[[I")
    private int[][][] field3478 = new int[2][2][4];

    @OriginalMember(owner = "client!te", name = "g", descriptor = "[[[I")
    private int[][][] field3484 = new int[2][2][4];

    @OriginalMember(owner = "client!te", name = "h", descriptor = "[I")
    private int[] field3485 = new int[2];

    @OriginalMember(owner = "client!te", name = "d", descriptor = "[[F")
    private static float[][] field3481 = new float[2][8];

    @OriginalMember(owner = "client!te", name = "b", descriptor = "[[I")
    public static int[][] field3479 = new int[2][8];

    @OriginalMember(owner = "client!te", name = "c", descriptor = "F")
    private static float field3480;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIF)F")
    private final float method1194(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3478[arg0][1][arg1] - this.field3478[arg0][0][arg1]) * arg2 + (float) this.field3478[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(IIF)F")
    private final float method1195(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3484[arg0][1][arg1] - this.field3484[arg0][0][arg1]) * arg2 + (float) this.field3484[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1199(var5);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lh;Ldf;)V")
    public final void method1196(class70 arg0, class37 arg1) {
        int var3 = arg0.method443(255);
        this.field3482[0] = var3 >> 4;
        this.field3482[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field3485[0] = this.field3485[1] = 0;
            return;
        }
        this.field3485[0] = arg0.method442(-21351);
        this.field3485[1] = arg0.method442(-21351);
        int var4 = arg0.method443(255);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field3482[var5]; var8++) {
                this.field3484[var5][0][var8] = arg0.method442(-21351);
                this.field3478[var5][0][var8] = arg0.method442(-21351);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field3482[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field3484[var6][1][var7] = this.field3484[var6][0][var7];
                    this.field3478[var6][1][var7] = this.field3478[var6][0][var7];
                } else {
                    this.field3484[var6][1][var7] = arg0.method442(-21351);
                    this.field3478[var6][1][var7] = arg0.method442(-21351);
                }
            }
        }
        if (var4 != 0 || this.field3485[1] != this.field3485[0]) {
            arg1.method234(arg0);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IF)I")
    public final int method1197(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field3485[1] - this.field3485[0]) * arg1 + (float) this.field3485[0];
            float var4 = var3 * 0.0030517578F;
            field3480 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field3483 = (int) (field3480 * 65536.0F);
        }
        if (this.field3482[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1194(arg0, 0, arg1);
        field3481[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1195(arg0, 0, arg1));
        field3481[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field3482[arg0]; var6++) {
            float var9 = this.method1194(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method1195(arg0, var6, arg1));
            float var11 = var9 * var9;
            field3481[arg0][var6 * 2 + 1] = field3481[arg0][var6 * 2 - 1] * var11;
            field3481[arg0][var6 * 2] = field3481[arg0][var6 * 2 - 1] * var10 + field3481[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field3481[arg0][var12] += field3481[arg0][var12 - 1] * var10 + field3481[arg0][var12 - 2] * var11;
            }
            field3481[arg0][1] += field3481[arg0][0] * var10 + var11;
            field3481[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field3482[0] * 2; var7++) {
                field3481[0][var7] *= field3480;
            }
        }
        for (int var8 = 0; var8 < this.field3482[arg0] * 2; var8++) {
            field3479[arg0][var8] = (int) (field3481[arg0][var8] * 65536.0F);
        }
        return this.field3482[arg0] * 2;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "()V")
    public static void method1198() {
        field3481 = null;
        field3479 = null;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(F)F")
    private static final float method1199(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }
}
