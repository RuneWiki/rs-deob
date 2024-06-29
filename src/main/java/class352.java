import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lka")
public class class352 {

    @OriginalMember(owner = "client!lka", name = "h", descriptor = "[I")
    private int[] field5102 = new int[2];

    @OriginalMember(owner = "client!lka", name = "f", descriptor = "[I")
    public int[] field5099 = new int[2];

    @OriginalMember(owner = "client!lka", name = "g", descriptor = "[[[I")
    private int[][][] field5100 = new int[2][2][4];

    @OriginalMember(owner = "client!lka", name = "a", descriptor = "[[[I")
    private int[][][] field5105 = new int[2][2][4];

    @OriginalMember(owner = "client!lka", name = "e", descriptor = "[[F")
    private static float[][] field5098 = new float[2][8];

    @OriginalMember(owner = "client!lka", name = "b", descriptor = "[[I")
    public static int[][] field5104 = new int[2][8];

    @OriginalMember(owner = "client!lka", name = "c", descriptor = "F")
    private static float field5103;

    @OriginalMember(owner = "client!lka", name = "d", descriptor = "I")
    public static int field5101;

    @OriginalMember(owner = "client!lka", name = "a", descriptor = "()V")
    public static void method2814() {
        field5098 = null;
        field5104 = null;
    }

    @OriginalMember(owner = "client!lka", name = "a", descriptor = "(IIF)F")
    private final float method2815(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field5100[arg0][1][arg1] - this.field5100[arg0][0][arg1]) * arg2 + (float) this.field5100[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method2819(var5);
    }

    @OriginalMember(owner = "client!lka", name = "b", descriptor = "(IIF)F")
    private final float method2816(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field5105[arg0][1][arg1] - this.field5105[arg0][0][arg1]) * arg2 + (float) this.field5105[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!lka", name = "a", descriptor = "(Ljc;Lhk;)V")
    public final void method2817(class711 arg0, class638 arg1) {
        int var3 = arg0.method5128(0);
        this.field5099[0] = var3 >> 4;
        this.field5099[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field5102[0] = this.field5102[1] = 0;
            return;
        }
        this.field5102[0] = arg0.method5116((byte) -117);
        this.field5102[1] = arg0.method5116((byte) -124);
        int var4 = arg0.method5128(0);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field5099[var5]; var8++) {
                this.field5100[var5][0][var8] = arg0.method5116((byte) -125);
                this.field5105[var5][0][var8] = arg0.method5116((byte) -127);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field5099[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field5100[var6][1][var7] = this.field5100[var6][0][var7];
                    this.field5105[var6][1][var7] = this.field5105[var6][0][var7];
                } else {
                    this.field5100[var6][1][var7] = arg0.method5116((byte) -118);
                    this.field5105[var6][1][var7] = arg0.method5116((byte) -119);
                }
            }
        }
        if (var4 != 0 || this.field5102[1] != this.field5102[0]) {
            arg1.method4647(arg0);
        }
    }

    @OriginalMember(owner = "client!lka", name = "a", descriptor = "(IF)I")
    public final int method2818(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field5102[1] - this.field5102[0]) * arg1 + (float) this.field5102[0];
            float var4 = var3 * 0.0030517578F;
            field5103 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field5101 = (int) (field5103 * 65536.0F);
        }
        if (this.field5099[arg0] == 0) {
            return 0;
        }
        float var5 = this.method2816(arg0, 0, arg1);
        field5098[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method2815(arg0, 0, arg1));
        field5098[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field5099[arg0]; var6++) {
            float var9 = this.method2816(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method2815(arg0, var6, arg1));
            float var11 = var9 * var9;
            field5098[arg0][var6 * 2 + 1] = field5098[arg0][var6 * 2 - 1] * var11;
            field5098[arg0][var6 * 2] = field5098[arg0][var6 * 2 - 1] * var10 + field5098[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field5098[arg0][var12] += field5098[arg0][var12 - 1] * var10 + field5098[arg0][var12 - 2] * var11;
            }
            field5098[arg0][1] += field5098[arg0][0] * var10 + var11;
            field5098[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field5099[0] * 2; var7++) {
                field5098[0][var7] *= field5103;
            }
        }
        for (int var8 = 0; var8 < this.field5099[arg0] * 2; var8++) {
            field5104[arg0][var8] = (int) (field5098[arg0][var8] * 65536.0F);
        }
        return this.field5099[arg0] * 2;
    }

    @OriginalMember(owner = "client!lka", name = "a", descriptor = "(F)F")
    private static final float method2819(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }
}
