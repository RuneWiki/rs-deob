import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class28 {

    @OriginalMember(owner = "client!df", name = "b", descriptor = "[[[I")
    private int[][][] field503 = new int[2][2][4];

    @OriginalMember(owner = "client!df", name = "d", descriptor = "[I")
    public int[] field505 = new int[2];

    @OriginalMember(owner = "client!df", name = "g", descriptor = "[[[I")
    private int[][][] field508 = new int[2][2][4];

    @OriginalMember(owner = "client!df", name = "a", descriptor = "[I")
    private int[] field502 = new int[2];

    @OriginalMember(owner = "client!df", name = "e", descriptor = "[[I")
    public static int[][] field506 = new int[2][8];

    @OriginalMember(owner = "client!df", name = "h", descriptor = "[[F")
    private static float[][] field509 = new float[2][8];

    @OriginalMember(owner = "client!df", name = "f", descriptor = "F")
    private static float field507;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lna;Lcf;)V")
    public final void method183(class91 arg0, class21 arg1) {
        int var3 = arg0.method649(false);
        this.field505[0] = var3 >> 4;
        this.field505[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field502[0] = this.field502[1] = 0;
            return;
        }
        this.field502[0] = arg0.method641(255);
        this.field502[1] = arg0.method641(255);
        int var4 = arg0.method649(false);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field505[var5]; var8++) {
                this.field503[var5][0][var8] = arg0.method641(255);
                this.field508[var5][0][var8] = arg0.method641(255);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field505[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field503[var6][1][var7] = this.field503[var6][0][var7];
                    this.field508[var6][1][var7] = this.field508[var6][0][var7];
                } else {
                    this.field503[var6][1][var7] = arg0.method641(255);
                    this.field508[var6][1][var7] = arg0.method641(255);
                }
            }
        }
        if (var4 != 0 || this.field502[1] != this.field502[0]) {
            arg1.method141(arg0);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IF)I")
    public final int method184(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field502[1] - this.field502[0]) * arg1 + (float) this.field502[0];
            float var4 = var3 * 0.0030517578F;
            field507 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field504 = (int) (field507 * 65536.0F);
        }
        if (this.field505[arg0] == 0) {
            return 0;
        }
        float var5 = this.method187(arg0, 0, arg1);
        field509[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method185(arg0, 0, arg1));
        field509[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field505[arg0]; var6++) {
            float var9 = this.method187(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method185(arg0, var6, arg1));
            float var11 = var9 * var9;
            field509[arg0][var6 * 2 + 1] = field509[arg0][var6 * 2 - 1] * var11;
            field509[arg0][var6 * 2] = field509[arg0][var6 * 2 - 1] * var10 + field509[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field509[arg0][var12] += field509[arg0][var12 - 1] * var10 + field509[arg0][var12 - 2] * var11;
            }
            field509[arg0][1] += field509[arg0][0] * var10 + var11;
            field509[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field505[0] * 2; var7++) {
                field509[0][var7] *= field507;
            }
        }
        for (int var8 = 0; var8 < this.field505[arg0] * 2; var8++) {
            field506[arg0][var8] = (int) (field509[arg0][var8] * 65536.0F);
        }
        return this.field505[arg0] * 2;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIF)F")
    private final float method185(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field503[arg0][1][arg1] - this.field503[arg0][0][arg1]) * arg2 + (float) this.field503[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method188(var5);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "()V")
    public static void method186() {
        field509 = null;
        field506 = null;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(IIF)F")
    private final float method187(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field508[arg0][1][arg1] - this.field508[arg0][0][arg1]) * arg2 + (float) this.field508[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(F)F")
    private static final float method188(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }
}
