import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vfa")
public class class669 {

    @OriginalMember(owner = "client!vfa", name = "b", descriptor = "[I")
    public int[] field9508 = new int[2];

    @OriginalMember(owner = "client!vfa", name = "d", descriptor = "[I")
    private int[] field9510 = new int[2];

    @OriginalMember(owner = "client!vfa", name = "g", descriptor = "[[[I")
    private int[][][] field9513 = new int[2][2][4];

    @OriginalMember(owner = "client!vfa", name = "h", descriptor = "[[[I")
    private int[][][] field9514 = new int[2][2][4];

    @OriginalMember(owner = "client!vfa", name = "e", descriptor = "[[I")
    public static int[][] field9511 = new int[2][8];

    @OriginalMember(owner = "client!vfa", name = "c", descriptor = "[[F")
    private static float[][] field9509 = new float[2][8];

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "F")
    private static float field9507;

    @OriginalMember(owner = "client!vfa", name = "f", descriptor = "I")
    public static int field9512;

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "()V")
    public static void method3798() {
        field9509 = null;
        field9511 = null;
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(Lig;Lwda;)V")
    public final void method3799(class244 arg0, class636 arg1) {
        int var3 = arg0.method1423(-90);
        this.field9508[0] = var3 >> 4;
        this.field9508[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field9510[0] = this.field9510[1] = 0;
            return;
        }
        this.field9510[0] = arg0.method1476(109);
        this.field9510[1] = arg0.method1476(60);
        int var4 = arg0.method1423(-24);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field9508[var5]; var8++) {
                this.field9514[var5][0][var8] = arg0.method1476(-103);
                this.field9513[var5][0][var8] = arg0.method1476(127);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field9508[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field9514[var6][1][var7] = this.field9514[var6][0][var7];
                    this.field9513[var6][1][var7] = this.field9513[var6][0][var7];
                } else {
                    this.field9514[var6][1][var7] = arg0.method1476(-93);
                    this.field9513[var6][1][var7] = arg0.method1476(56);
                }
            }
        }
        if (var4 != 0 || this.field9510[1] != this.field9510[0]) {
            arg1.method3648(arg0);
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(IIF)F")
    private final float method3800(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field9513[arg0][1][arg1] - this.field9513[arg0][0][arg1]) * arg2 + (float) this.field9513[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!vfa", name = "b", descriptor = "(IIF)F")
    private final float method3801(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field9514[arg0][1][arg1] - this.field9514[arg0][0][arg1]) * arg2 + (float) this.field9514[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method3803(var5);
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(IF)I")
    public final int method3802(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field9510[1] - this.field9510[0]) * arg1 + (float) this.field9510[0];
            float var4 = var3 * 0.0030517578F;
            field9507 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field9512 = (int) (field9507 * 65536.0F);
        }
        if (this.field9508[arg0] == 0) {
            return 0;
        }
        float var5 = this.method3800(arg0, 0, arg1);
        field9509[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method3801(arg0, 0, arg1));
        field9509[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field9508[arg0]; var6++) {
            float var9 = this.method3800(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method3801(arg0, var6, arg1));
            float var11 = var9 * var9;
            field9509[arg0][var6 * 2 + 1] = field9509[arg0][var6 * 2 - 1] * var11;
            field9509[arg0][var6 * 2] = field9509[arg0][var6 * 2 - 1] * var10 + field9509[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field9509[arg0][var12] += field9509[arg0][var12 - 1] * var10 + field9509[arg0][var12 - 2] * var11;
            }
            field9509[arg0][1] += field9509[arg0][0] * var10 + var11;
            field9509[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field9508[0] * 2; var7++) {
                field9509[0][var7] *= field9507;
            }
        }
        for (int var8 = 0; var8 < this.field9508[arg0] * 2; var8++) {
            field9511[arg0][var8] = (int) (field9509[arg0][var8] * 65536.0F);
        }
        return this.field9508[arg0] * 2;
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(F)F")
    private static final float method3803(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }
}
