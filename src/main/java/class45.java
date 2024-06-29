import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class45 {

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "[[[I")
    private int[][][] field896 = new int[2][2][4];

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "[I")
    private int[] field897 = new int[2];

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "[[[I")
    private int[][][] field898 = new int[2][2][4];

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "[I")
    public int[] field895 = new int[2];

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "[[F")
    private static float[][] field900 = new float[2][8];

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "[[I")
    public static int[][] field901 = new int[2][8];

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "F")
    private static float field899;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IF)I")
    public final int method369(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field897[1] - this.field897[0]) * arg1 + (float) this.field897[0];
            float var4 = var3 * 0.0030517578F;
            field899 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field894 = (int) (field899 * 65536.0F);
        }
        if (this.field895[arg0] == 0) {
            return 0;
        }
        float var5 = this.method370(arg0, 0, arg1);
        field900[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method371(arg0, 0, arg1));
        field900[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field895[arg0]; var6++) {
            float var9 = this.method370(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method371(arg0, var6, arg1));
            float var11 = var9 * var9;
            field900[arg0][var6 * 2 + 1] = field900[arg0][var6 * 2 - 1] * var11;
            field900[arg0][var6 * 2] = field900[arg0][var6 * 2 - 1] * var10 + field900[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field900[arg0][var12] += field900[arg0][var12 - 1] * var10 + field900[arg0][var12 - 2] * var11;
            }
            field900[arg0][1] += field900[arg0][0] * var10 + var11;
            field900[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field895[0] * 2; var7++) {
                field900[0][var7] *= field899;
            }
        }
        for (int var8 = 0; var8 < this.field895[arg0] * 2; var8++) {
            field901[arg0][var8] = (int) (field900[arg0][var8] * 65536.0F);
        }
        return this.field895[arg0] * 2;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIF)F")
    private final float method370(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field898[arg0][1][arg1] - this.field898[arg0][0][arg1]) * arg2 + (float) this.field898[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(IIF)F")
    private final float method371(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field896[arg0][1][arg1] - this.field896[arg0][0][arg1]) * arg2 + (float) this.field896[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method372(var5);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(F)F")
    private static final float method372(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "()V")
    public static void method373() {
        field900 = null;
        field901 = null;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lhd;Lai;)V")
    public final void method374(class68 arg0, class10 arg1) {
        int var3 = arg0.method604((byte) -123);
        this.field895[0] = var3 >> 4;
        this.field895[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field897[0] = this.field897[1] = 0;
            return;
        }
        this.field897[0] = arg0.method569(26496);
        this.field897[1] = arg0.method569(26496);
        int var4 = arg0.method604((byte) -125);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field895[var5]; var8++) {
                this.field896[var5][0][var8] = arg0.method569(26496);
                this.field898[var5][0][var8] = arg0.method569(26496);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field895[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field896[var6][1][var7] = this.field896[var6][0][var7];
                    this.field898[var6][1][var7] = this.field898[var6][0][var7];
                } else {
                    this.field896[var6][1][var7] = arg0.method569(26496);
                    this.field898[var6][1][var7] = arg0.method569(26496);
                }
            }
        }
        if (var4 != 0 || this.field897[1] != this.field897[0]) {
            arg1.method81(arg0);
        }
    }
}
