import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class123 {

    @OriginalMember(owner = "client!re", name = "b", descriptor = "[[[I")
    private int[][][] field2832 = new int[2][2][4];

    @OriginalMember(owner = "client!re", name = "f", descriptor = "[[[I")
    private int[][][] field2836 = new int[2][2][4];

    @OriginalMember(owner = "client!re", name = "e", descriptor = "[I")
    private int[] field2835 = new int[2];

    @OriginalMember(owner = "client!re", name = "h", descriptor = "[I")
    public int[] field2838 = new int[2];

    @OriginalMember(owner = "client!re", name = "c", descriptor = "[[I")
    public static int[][] field2833 = new int[2][8];

    @OriginalMember(owner = "client!re", name = "g", descriptor = "[[F")
    private static float[][] field2837 = new float[2][8];

    @OriginalMember(owner = "client!re", name = "d", descriptor = "F")
    private static float field2834;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lof;Lde;)V")
    public final void method972(class103 arg0, class27 arg1) {
        int var3 = arg0.method829((byte) -127);
        this.field2838[0] = var3 >> 4;
        this.field2838[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field2835[0] = this.field2835[1] = 0;
            return;
        }
        this.field2835[0] = arg0.method808(-20054);
        this.field2835[1] = arg0.method808(-20054);
        int var4 = arg0.method829((byte) -85);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field2838[var5]; var8++) {
                this.field2836[var5][0][var8] = arg0.method808(-20054);
                this.field2832[var5][0][var8] = arg0.method808(-20054);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field2838[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field2836[var6][1][var7] = this.field2836[var6][0][var7];
                    this.field2832[var6][1][var7] = this.field2832[var6][0][var7];
                } else {
                    this.field2836[var6][1][var7] = arg0.method808(-20054);
                    this.field2832[var6][1][var7] = arg0.method808(-20054);
                }
            }
        }
        if (var4 != 0 || this.field2835[1] != this.field2835[0]) {
            arg1.method207(arg0);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "()V")
    public static void method973() {
        field2837 = null;
        field2833 = null;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IF)I")
    public final int method974(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field2835[1] - this.field2835[0]) * arg1 + (float) this.field2835[0];
            float var4 = var3 * 0.0030517578F;
            field2834 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field2831 = (int) (field2834 * 65536.0F);
        }
        if (this.field2838[arg0] == 0) {
            return 0;
        }
        float var5 = this.method975(arg0, 0, arg1);
        field2837[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method976(arg0, 0, arg1));
        field2837[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field2838[arg0]; var6++) {
            float var9 = this.method975(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method976(arg0, var6, arg1));
            float var11 = var9 * var9;
            field2837[arg0][var6 * 2 + 1] = field2837[arg0][var6 * 2 - 1] * var11;
            field2837[arg0][var6 * 2] = field2837[arg0][var6 * 2 - 1] * var10 + field2837[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field2837[arg0][var12] += field2837[arg0][var12 - 1] * var10 + field2837[arg0][var12 - 2] * var11;
            }
            field2837[arg0][1] += field2837[arg0][0] * var10 + var11;
            field2837[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field2838[0] * 2; var7++) {
                field2837[0][var7] *= field2834;
            }
        }
        for (int var8 = 0; var8 < this.field2838[arg0] * 2; var8++) {
            field2833[arg0][var8] = (int) (field2837[arg0][var8] * 65536.0F);
        }
        return this.field2838[arg0] * 2;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIF)F")
    private final float method975(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2832[arg0][1][arg1] - this.field2832[arg0][0][arg1]) * arg2 + (float) this.field2832[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(IIF)F")
    private final float method976(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2836[arg0][1][arg1] - this.field2836[arg0][0][arg1]) * arg2 + (float) this.field2836[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method977(var5);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(F)F")
    private static final float method977(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }
}
