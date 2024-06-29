import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class173 {

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "[[[I")
    private int[][][] field3343 = new int[2][2][4];

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "[I")
    private int[] field3347 = new int[2];

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "[[[I")
    private int[][][] field3348 = new int[2][2][4];

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "[I")
    public int[] field3344 = new int[2];

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "[[I")
    public static int[][] field3346 = new int[2][8];

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "[[F")
    private static float[][] field3349 = new float[2][8];

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "F")
    private static float field3342;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "()V")
    public static void method1150() {
        field3349 = null;
        field3346 = null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIF)F")
    private final float method1151(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3348[arg0][1][arg1] - this.field3348[arg0][0][arg1]) * arg2 + (float) this.field3348[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1155(var5);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Loa;Lme;)V")
    public final void method1152(class127 arg0, class113 arg1) {
        int var3 = arg0.method819((byte) 22);
        this.field3344[0] = var3 >> 4;
        this.field3344[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field3347[0] = this.field3347[1] = 0;
            return;
        }
        this.field3347[0] = arg0.method785(true);
        this.field3347[1] = arg0.method785(true);
        int var4 = arg0.method819((byte) 22);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field3344[var5]; var8++) {
                this.field3348[var5][0][var8] = arg0.method785(true);
                this.field3343[var5][0][var8] = arg0.method785(true);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field3344[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field3348[var6][1][var7] = this.field3348[var6][0][var7];
                    this.field3343[var6][1][var7] = this.field3343[var6][0][var7];
                } else {
                    this.field3348[var6][1][var7] = arg0.method785(true);
                    this.field3343[var6][1][var7] = arg0.method785(true);
                }
            }
        }
        if (var4 != 0 || this.field3347[1] != this.field3347[0]) {
            arg1.method694(arg0);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IF)I")
    public final int method1153(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field3347[1] - this.field3347[0]) * arg1 + (float) this.field3347[0];
            float var4 = var3 * 0.0030517578F;
            field3342 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field3345 = (int) (field3342 * 65536.0F);
        }
        if (this.field3344[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1154(arg0, 0, arg1);
        field3349[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1151(arg0, 0, arg1));
        field3349[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field3344[arg0]; var6++) {
            float var9 = this.method1154(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method1151(arg0, var6, arg1));
            float var11 = var9 * var9;
            field3349[arg0][var6 * 2 + 1] = field3349[arg0][var6 * 2 - 1] * var11;
            field3349[arg0][var6 * 2] = field3349[arg0][var6 * 2 - 1] * var10 + field3349[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field3349[arg0][var12] += field3349[arg0][var12 - 1] * var10 + field3349[arg0][var12 - 2] * var11;
            }
            field3349[arg0][1] += field3349[arg0][0] * var10 + var11;
            field3349[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field3344[0] * 2; var7++) {
                field3349[0][var7] *= field3342;
            }
        }
        for (int var8 = 0; var8 < this.field3344[arg0] * 2; var8++) {
            field3346[arg0][var8] = (int) (field3349[arg0][var8] * 65536.0F);
        }
        return this.field3344[arg0] * 2;
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(IIF)F")
    private final float method1154(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3343[arg0][1][arg1] - this.field3343[arg0][0][arg1]) * arg2 + (float) this.field3343[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(F)F")
    private static final float method1155(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }
}
