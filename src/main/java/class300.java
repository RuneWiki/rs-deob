import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class300 {

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "[I")
    private int[] field4805 = new int[2];

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "[[[I")
    private int[][][] field4809 = new int[2][2][4];

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "[[[I")
    private int[][][] field4807 = new int[2][2][4];

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "[I")
    public int[] field4810 = new int[2];

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "[[F")
    private static float[][] field4804 = new float[2][8];

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "[[I")
    public static int[][] field4806 = new int[2][8];

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "F")
    private static float field4811;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
    public static int field4808;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lwd;Lra;)V")
    public final void method1982(class162 arg0, class122 arg1) {
        int var3 = arg0.method1133((byte) 53);
        this.field4810[0] = var3 >> 4;
        this.field4810[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field4805[0] = this.field4805[1] = 0;
            return;
        }
        this.field4805[0] = arg0.method1142(-18970);
        this.field4805[1] = arg0.method1142(-18970);
        int var4 = arg0.method1133((byte) 53);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field4810[var5]; var8++) {
                this.field4807[var5][0][var8] = arg0.method1142(-18970);
                this.field4809[var5][0][var8] = arg0.method1142(-18970);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field4810[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field4807[var6][1][var7] = this.field4807[var6][0][var7];
                    this.field4809[var6][1][var7] = this.field4809[var6][0][var7];
                } else {
                    this.field4807[var6][1][var7] = arg0.method1142(-18970);
                    this.field4809[var6][1][var7] = arg0.method1142(-18970);
                }
            }
        }
        if (var4 != 0 || this.field4805[1] != this.field4805[0]) {
            arg1.method859(arg0);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIF)F")
    private final float method1983(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field4809[arg0][1][arg1] - this.field4809[arg0][0][arg1]) * arg2 + (float) this.field4809[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(IIF)F")
    private final float method1984(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field4807[arg0][1][arg1] - this.field4807[arg0][0][arg1]) * arg2 + (float) this.field4807[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1985(var5);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(F)F")
    private static final float method1985(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "()V")
    public static void method1986() {
        field4804 = null;
        field4806 = null;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IF)I")
    public final int method1987(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field4805[1] - this.field4805[0]) * arg1 + (float) this.field4805[0];
            float var4 = var3 * 0.0030517578F;
            field4811 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field4808 = (int) (field4811 * 65536.0F);
        }
        if (this.field4810[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1983(arg0, 0, arg1);
        field4804[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1984(arg0, 0, arg1));
        field4804[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field4810[arg0]; var6++) {
            float var9 = this.method1983(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method1984(arg0, var6, arg1));
            float var11 = var9 * var9;
            field4804[arg0][var6 * 2 + 1] = field4804[arg0][var6 * 2 - 1] * var11;
            field4804[arg0][var6 * 2] = field4804[arg0][var6 * 2 - 1] * var10 + field4804[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field4804[arg0][var12] += field4804[arg0][var12 - 1] * var10 + field4804[arg0][var12 - 2] * var11;
            }
            field4804[arg0][1] += field4804[arg0][0] * var10 + var11;
            field4804[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field4810[0] * 2; var7++) {
                field4804[0][var7] *= field4811;
            }
        }
        for (int var8 = 0; var8 < this.field4810[arg0] * 2; var8++) {
            field4806[arg0][var8] = (int) (field4804[arg0][var8] * 65536.0F);
        }
        return this.field4810[arg0] * 2;
    }
}
