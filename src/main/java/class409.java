import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class409 {

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "[[[I")
    private int[][][] field5472 = new int[2][2][4];

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "[I")
    private int[] field5478 = new int[2];

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "[[[I")
    private int[][][] field5474 = new int[2][2][4];

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "[I")
    public int[] field5479 = new int[2];

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "[[F")
    private static float[][] field5476 = new float[2][8];

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "[[I")
    public static int[][] field5477 = new int[2][8];

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "F")
    private static float field5473;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
    public static int field5475;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IF)I")
    public final int method2425(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field5478[1] - this.field5478[0]) * arg1 + (float) this.field5478[0];
            float var4 = var3 * 0.0030517578F;
            field5473 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field5475 = (int) (field5473 * 65536.0F);
        }
        if (this.field5479[arg0] == 0) {
            return 0;
        }
        float var5 = this.method2428(arg0, 0, arg1);
        field5476[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method2429(arg0, 0, arg1));
        field5476[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field5479[arg0]; var6++) {
            float var9 = this.method2428(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method2429(arg0, var6, arg1));
            float var11 = var9 * var9;
            field5476[arg0][var6 * 2 + 1] = field5476[arg0][var6 * 2 - 1] * var11;
            field5476[arg0][var6 * 2] = field5476[arg0][var6 * 2 - 1] * var10 + field5476[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field5476[arg0][var12] += field5476[arg0][var12 - 1] * var10 + field5476[arg0][var12 - 2] * var11;
            }
            field5476[arg0][1] += field5476[arg0][0] * var10 + var11;
            field5476[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field5479[0] * 2; var7++) {
                field5476[0][var7] *= field5473;
            }
        }
        for (int var8 = 0; var8 < this.field5479[arg0] * 2; var8++) {
            field5477[arg0][var8] = (int) (field5476[arg0][var8] * 65536.0F);
        }
        return this.field5479[arg0] * 2;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lbt;Ldk;)V")
    public final void method2426(class88 arg0, class416 arg1) {
        int var3 = arg0.method617(2);
        this.field5479[0] = var3 >> 4;
        this.field5479[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field5478[0] = this.field5478[1] = 0;
            return;
        }
        this.field5478[0] = arg0.method568((byte) 110);
        this.field5478[1] = arg0.method568((byte) 110);
        int var4 = arg0.method617(2);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field5479[var5]; var8++) {
                this.field5474[var5][0][var8] = arg0.method568((byte) 110);
                this.field5472[var5][0][var8] = arg0.method568((byte) 110);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field5479[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field5474[var6][1][var7] = this.field5474[var6][0][var7];
                    this.field5472[var6][1][var7] = this.field5472[var6][0][var7];
                } else {
                    this.field5474[var6][1][var7] = arg0.method568((byte) 110);
                    this.field5472[var6][1][var7] = arg0.method568((byte) 110);
                }
            }
        }
        if (var4 != 0 || this.field5478[1] != this.field5478[0]) {
            arg1.method2449(arg0);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "()V")
    public static void method2427() {
        field5476 = null;
        field5477 = null;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIF)F")
    private final float method2428(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field5472[arg0][1][arg1] - this.field5472[arg0][0][arg1]) * arg2 + (float) this.field5472[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(IIF)F")
    private final float method2429(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field5474[arg0][1][arg1] - this.field5474[arg0][0][arg1]) * arg2 + (float) this.field5474[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method2430(var5);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(F)F")
    private static final float method2430(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }
}
