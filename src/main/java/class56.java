import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class56 {

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "[[[I")
    private int[][][] field941 = new int[2][2][4];

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "[I")
    public int[] field943 = new int[2];

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "[I")
    private int[] field944 = new int[2];

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "[[[I")
    private int[][][] field942 = new int[2][2][4];

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "[[I")
    public static int[][] field947 = new int[2][8];

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "[[F")
    private static float[][] field948 = new float[2][8];

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "F")
    private static float field946;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(F)F")
    private static final float method360(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Llb;Lbi;)V")
    public final void method361(class121 arg0, class88 arg1) {
        int var3 = arg0.method897(-40);
        this.field943[0] = var3 >> 4;
        this.field943[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field944[0] = this.field944[1] = 0;
            return;
        }
        this.field944[0] = arg0.method876(false);
        this.field944[1] = arg0.method876(false);
        int var4 = arg0.method897(-53);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field943[var5]; var8++) {
                this.field942[var5][0][var8] = arg0.method876(false);
                this.field941[var5][0][var8] = arg0.method876(false);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field943[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field942[var6][1][var7] = this.field942[var6][0][var7];
                    this.field941[var6][1][var7] = this.field941[var6][0][var7];
                } else {
                    this.field942[var6][1][var7] = arg0.method876(false);
                    this.field941[var6][1][var7] = arg0.method876(false);
                }
            }
        }
        if (var4 != 0 || this.field944[1] != this.field944[0]) {
            arg1.method671(arg0);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIF)F")
    private final float method362(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field942[arg0][1][arg1] - this.field942[arg0][0][arg1]) * arg2 + (float) this.field942[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method360(var5);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "()V")
    public static void method363() {
        field948 = null;
        field947 = null;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IF)I")
    public final int method364(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field944[1] - this.field944[0]) * arg1 + (float) this.field944[0];
            float var4 = var3 * 0.0030517578F;
            field946 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field945 = (int) (field946 * 65536.0F);
        }
        if (this.field943[arg0] == 0) {
            return 0;
        }
        float var5 = this.method365(arg0, 0, arg1);
        field948[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method362(arg0, 0, arg1));
        field948[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field943[arg0]; var6++) {
            float var9 = this.method365(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method362(arg0, var6, arg1));
            float var11 = var9 * var9;
            field948[arg0][var6 * 2 + 1] = field948[arg0][var6 * 2 - 1] * var11;
            field948[arg0][var6 * 2] = field948[arg0][var6 * 2 - 1] * var10 + field948[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field948[arg0][var12] += field948[arg0][var12 - 1] * var10 + field948[arg0][var12 - 2] * var11;
            }
            field948[arg0][1] += field948[arg0][0] * var10 + var11;
            field948[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field943[0] * 2; var7++) {
                field948[0][var7] *= field946;
            }
        }
        for (int var8 = 0; var8 < this.field943[arg0] * 2; var8++) {
            field947[arg0][var8] = (int) (field948[arg0][var8] * 65536.0F);
        }
        return this.field943[arg0] * 2;
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(IIF)F")
    private final float method365(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field941[arg0][1][arg1] - this.field941[arg0][0][arg1]) * arg2 + (float) this.field941[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }
}
