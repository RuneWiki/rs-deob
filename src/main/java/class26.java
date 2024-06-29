import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class26 {

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "[[[I")
    private int[][][] field593 = new int[2][2][4];

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "[[[I")
    private int[][][] field597 = new int[2][2][4];

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "[I")
    public int[] field598 = new int[2];

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "[I")
    private int[] field596 = new int[2];

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "[[I")
    public static int[][] field594 = new int[2][8];

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "[[F")
    private static float[][] field599 = new float[2][8];

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "F")
    private static float field595;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(F)F", line = 5)
    private static final float method152(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lrc;Lfb;)V", line = 11)
    public final void method153(class104 arg0, class32 arg1) {
        int var3 = arg0.method798((byte) -111);
        this.field598[0] = var3 >> 4;
        this.field598[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field596[0] = this.field596[1] = 0;
            return;
        }
        this.field596[0] = arg0.method797(-7916);
        this.field596[1] = arg0.method797(-7916);
        int var4 = arg0.method798((byte) -123);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field598[var5]; var8++) {
                this.field593[var5][0][var8] = arg0.method797(-7916);
                this.field597[var5][0][var8] = arg0.method797(-7916);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field598[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field593[var6][1][var7] = this.field593[var6][0][var7];
                    this.field597[var6][1][var7] = this.field597[var6][0][var7];
                } else {
                    this.field593[var6][1][var7] = arg0.method797(-7916);
                    this.field597[var6][1][var7] = arg0.method797(-7916);
                }
            }
        }
        if (var4 != 0 || this.field596[1] != this.field596[0]) {
            arg1.method208(arg0);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IF)I", line = 77)
    public final int method154(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field596[1] - this.field596[0]) * arg1 + (float) this.field596[0];
            float var4 = var3 * 0.0030517578F;
            field595 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field592 = (int) (field595 * 65536.0F);
        }
        if (this.field598[arg0] == 0) {
            return 0;
        }
        float var5 = this.method156(arg0, 0, arg1);
        field599[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method155(arg0, 0, arg1));
        field599[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field598[arg0]; var6++) {
            float var9 = this.method156(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method155(arg0, var6, arg1));
            float var11 = var9 * var9;
            field599[arg0][var6 * 2 + 1] = field599[arg0][var6 * 2 - 1] * var11;
            field599[arg0][var6 * 2] = field599[arg0][var6 * 2 - 1] * var10 + field599[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field599[arg0][var12] += field599[arg0][var12 - 1] * var10 + field599[arg0][var12 - 2] * var11;
            }
            field599[arg0][1] += field599[arg0][0] * var10 + var11;
            field599[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field598[0] * 2; var7++) {
                field599[0][var7] *= field595;
            }
        }
        for (int var8 = 0; var8 < this.field598[arg0] * 2; var8++) {
            field594[arg0][var8] = (int) (field599[arg0][var8] * 65536.0F);
        }
        return this.field598[arg0] * 2;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIF)F", line = 147)
    private final float method155(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field593[arg0][1][arg1] - this.field593[arg0][0][arg1]) * arg2 + (float) this.field593[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method152(var5);
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(IIF)F", line = 157)
    private final float method156(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field597[arg0][1][arg1] - this.field597[arg0][0][arg1]) * arg2 + (float) this.field597[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "()V", line = 165)
    public static void method157() {
        field599 = null;
        field594 = null;
    }
}
