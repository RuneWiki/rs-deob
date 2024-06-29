import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class9 {

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "[I")
    private int[] field127 = new int[2];

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "[[[I")
    private int[][][] field129 = new int[2][2][4];

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "[[[I")
    private int[][][] field132 = new int[2][2][4];

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "[I")
    public int[] field134 = new int[2];

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "[[I")
    public static int[][] field128 = new int[2][8];

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "[[F")
    private static float[][] field131 = new float[2][8];

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "F")
    private static float field130;

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIF)F")
    private final float method54(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field129[arg0][1][arg1] - this.field129[arg0][0][arg1]) * arg2 + (float) this.field129[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(F)F")
    private static final float method55(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Llj;Ldd;)V")
    public final void method56(class25 arg0, class133 arg1) {
        int var3 = arg0.method201(255);
        this.field134[0] = var3 >> 4;
        this.field134[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field127[0] = this.field127[1] = 0;
            return;
        }
        this.field127[0] = arg0.method190(-3);
        this.field127[1] = arg0.method190(-3);
        int var4 = arg0.method201(255);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field134[var5]; var8++) {
                this.field132[var5][0][var8] = arg0.method190(-3);
                this.field129[var5][0][var8] = arg0.method190(-3);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field134[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field132[var6][1][var7] = this.field132[var6][0][var7];
                    this.field129[var6][1][var7] = this.field129[var6][0][var7];
                } else {
                    this.field132[var6][1][var7] = arg0.method190(-3);
                    this.field129[var6][1][var7] = arg0.method190(-3);
                }
            }
        }
        if (var4 != 0 || this.field127[1] != this.field127[0]) {
            arg1.method905(arg0);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "()V")
    public static void method57() {
        field131 = null;
        field128 = null;
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(IIF)F")
    private final float method58(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field132[arg0][1][arg1] - this.field132[arg0][0][arg1]) * arg2 + (float) this.field132[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method55(var5);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IF)I")
    public final int method59(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field127[1] - this.field127[0]) * arg1 + (float) this.field127[0];
            float var4 = var3 * 0.0030517578F;
            field130 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field133 = (int) (field130 * 65536.0F);
        }
        if (this.field134[arg0] == 0) {
            return 0;
        }
        float var5 = this.method54(arg0, 0, arg1);
        field131[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method58(arg0, 0, arg1));
        field131[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field134[arg0]; var6++) {
            float var9 = this.method54(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method58(arg0, var6, arg1));
            float var11 = var9 * var9;
            field131[arg0][var6 * 2 + 1] = field131[arg0][var6 * 2 - 1] * var11;
            field131[arg0][var6 * 2] = field131[arg0][var6 * 2 - 1] * var10 + field131[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field131[arg0][var12] += field131[arg0][var12 - 1] * var10 + field131[arg0][var12 - 2] * var11;
            }
            field131[arg0][1] += field131[arg0][0] * var10 + var11;
            field131[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field134[0] * 2; var7++) {
                field131[0][var7] *= field130;
            }
        }
        for (int var8 = 0; var8 < this.field134[arg0] * 2; var8++) {
            field128[arg0][var8] = (int) (field131[arg0][var8] * 65536.0F);
        }
        return this.field134[arg0] * 2;
    }
}
