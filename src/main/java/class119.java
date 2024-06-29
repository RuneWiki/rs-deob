import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class119 {

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "[I")
    public int[] field2918 = new int[2];

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "[[[I")
    private int[][][] field2919 = new int[2][2][4];

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "[I")
    private int[] field2920 = new int[2];

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "[[[I")
    private int[][][] field2916 = new int[2][2][4];

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "[[F")
    private static float[][] field2917 = new float[2][8];

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "[[I")
    public static int[][] field2921 = new int[2][8];

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "F")
    private static float field2915;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "()V", line = 4)
    public static void method919() {
        field2917 = null;
        field2921 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIF)F", line = 14)
    private final float method920(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2919[arg0][1][arg1] - this.field2919[arg0][0][arg1]) * arg2 + (float) this.field2919[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lwd;Loc;)V", line = 21)
    public final void method921(class131 arg0, class87 arg1) {
        int var3 = arg0.method971(true);
        this.field2918[0] = var3 >> 4;
        this.field2918[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field2920[0] = this.field2920[1] = 0;
            return;
        }
        this.field2920[0] = arg0.method1001(65280);
        this.field2920[1] = arg0.method1001(65280);
        int var4 = arg0.method971(true);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field2918[var5]; var8++) {
                this.field2916[var5][0][var8] = arg0.method1001(65280);
                this.field2919[var5][0][var8] = arg0.method1001(65280);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field2918[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field2916[var6][1][var7] = this.field2916[var6][0][var7];
                    this.field2919[var6][1][var7] = this.field2919[var6][0][var7];
                } else {
                    this.field2916[var6][1][var7] = arg0.method1001(65280);
                    this.field2919[var6][1][var7] = arg0.method1001(65280);
                }
            }
        }
        if (var4 != 0 || this.field2920[1] != this.field2920[0]) {
            arg1.method710(arg0);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IF)I", line = 87)
    public final int method922(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field2920[1] - this.field2920[0]) * arg1 + (float) this.field2920[0];
            float var4 = var3 * 0.0030517578F;
            field2915 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field2922 = (int) (field2915 * 65536.0F);
        }
        if (this.field2918[arg0] == 0) {
            return 0;
        }
        float var5 = this.method920(arg0, 0, arg1);
        field2917[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method923(arg0, 0, arg1));
        field2917[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field2918[arg0]; var6++) {
            float var9 = this.method920(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method923(arg0, var6, arg1));
            float var11 = var9 * var9;
            field2917[arg0][var6 * 2 + 1] = field2917[arg0][var6 * 2 - 1] * var11;
            field2917[arg0][var6 * 2] = field2917[arg0][var6 * 2 - 1] * var10 + field2917[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field2917[arg0][var12] += field2917[arg0][var12 - 1] * var10 + field2917[arg0][var12 - 2] * var11;
            }
            field2917[arg0][1] += field2917[arg0][0] * var10 + var11;
            field2917[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field2918[0] * 2; var7++) {
                field2917[0][var7] *= field2915;
            }
        }
        for (int var8 = 0; var8 < this.field2918[arg0] * 2; var8++) {
            field2921[arg0][var8] = (int) (field2917[arg0][var8] * 65536.0F);
        }
        return this.field2918[arg0] * 2;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(IIF)F", line = 158)
    private final float method923(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2916[arg0][1][arg1] - this.field2916[arg0][0][arg1]) * arg2 + (float) this.field2916[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method924(var5);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(F)F", line = 170)
    private static final float method924(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }
}
