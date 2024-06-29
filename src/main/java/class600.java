import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class600 {

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "[[[I")
    private int[][][] field8690 = new int[2][2][4];

    @OriginalMember(owner = "client!cr", name = "h", descriptor = "[I")
    public int[] field8693 = new int[2];

    @OriginalMember(owner = "client!cr", name = "e", descriptor = "[I")
    private int[] field8691 = new int[2];

    @OriginalMember(owner = "client!cr", name = "f", descriptor = "[[[I")
    private int[][][] field8694 = new int[2][2][4];

    @OriginalMember(owner = "client!cr", name = "d", descriptor = "[[I")
    public static int[][] field8689 = new int[2][8];

    @OriginalMember(owner = "client!cr", name = "g", descriptor = "[[F")
    private static float[][] field8688 = new float[2][8];

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "F")
    private static float field8692;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "I")
    public static int field8695;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lwq;Lmb;)V", line = 4)
    public final void method4399(class176 arg0, class273 arg1) {
        int var3 = arg0.method1645((byte) -74);
        this.field8693[0] = var3 >> 4;
        this.field8693[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field8691[0] = this.field8691[1] = 0;
            return;
        }
        this.field8691[0] = arg0.method1687((byte) -122);
        this.field8691[1] = arg0.method1687((byte) -128);
        int var4 = arg0.method1645((byte) -99);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field8693[var5]; var8++) {
                this.field8694[var5][0][var8] = arg0.method1687((byte) -64);
                this.field8690[var5][0][var8] = arg0.method1687((byte) -55);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field8693[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field8694[var6][1][var7] = this.field8694[var6][0][var7];
                    this.field8690[var6][1][var7] = this.field8690[var6][0][var7];
                } else {
                    this.field8694[var6][1][var7] = arg0.method1687((byte) -39);
                    this.field8690[var6][1][var7] = arg0.method1687((byte) -104);
                }
            }
        }
        if (var4 != 0 || this.field8691[1] != this.field8691[0]) {
            arg1.method2349(arg0);
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(F)F", line = 70)
    private static final float method4400(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "(IIF)F", line = 81)
    private final float method4401(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field8690[arg0][1][arg1] - this.field8690[arg0][0][arg1]) * arg2 + (float) this.field8690[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIF)F", line = 88)
    private final float method4402(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field8694[arg0][1][arg1] - this.field8694[arg0][0][arg1]) * arg2 + (float) this.field8694[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method4400(var5);
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IF)I", line = 103)
    public final int method4403(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field8691[1] - this.field8691[0]) * arg1 + (float) this.field8691[0];
            float var4 = var3 * 0.0030517578F;
            field8692 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field8695 = (int) (field8692 * 65536.0F);
        }
        if (this.field8693[arg0] == 0) {
            return 0;
        }
        float var5 = this.method4401(arg0, 0, arg1);
        field8688[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method4402(arg0, 0, arg1));
        field8688[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field8693[arg0]; var6++) {
            float var9 = this.method4401(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method4402(arg0, var6, arg1));
            float var11 = var9 * var9;
            field8688[arg0][var6 * 2 + 1] = field8688[arg0][var6 * 2 - 1] * var11;
            field8688[arg0][var6 * 2] = field8688[arg0][var6 * 2 - 1] * var10 + field8688[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field8688[arg0][var12] += field8688[arg0][var12 - 1] * var10 + field8688[arg0][var12 - 2] * var11;
            }
            field8688[arg0][1] += field8688[arg0][0] * var10 + var11;
            field8688[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field8693[0] * 2; var7++) {
                field8688[0][var7] *= field8692;
            }
        }
        for (int var8 = 0; var8 < this.field8693[arg0] * 2; var8++) {
            field8689[arg0][var8] = (int) (field8688[arg0][var8] * 65536.0F);
        }
        return this.field8693[arg0] * 2;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "()V", line = 175)
    public static void method4404() {
        field8688 = null;
        field8689 = null;
    }
}
