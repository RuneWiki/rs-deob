import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class290 {

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "[I")
    private int[] field4399 = new int[2];

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "[I")
    public int[] field4401 = new int[2];

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "[[[I")
    private int[][][] field4398 = new int[2][2][4];

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "[[[I")
    private int[][][] field4404 = new int[2][2][4];

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "[[I")
    public static int[][] field4403 = new int[2][8];

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "[[F")
    private static float[][] field4405 = new float[2][8];

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "F")
    private static float field4402;

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "I")
    public static int field4400;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IF)I")
    public final int method1922(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field4399[1] - this.field4399[0]) * arg1 + (float) this.field4399[0];
            float var4 = var3 * 0.0030517578F;
            field4402 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field4400 = (int) (field4402 * 65536.0F);
        }
        if (this.field4401[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1924(arg0, 0, arg1);
        field4405[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1923(arg0, 0, arg1));
        field4405[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field4401[arg0]; var6++) {
            float var9 = this.method1924(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method1923(arg0, var6, arg1));
            float var11 = var9 * var9;
            field4405[arg0][var6 * 2 + 1] = field4405[arg0][var6 * 2 - 1] * var11;
            field4405[arg0][var6 * 2] = field4405[arg0][var6 * 2 - 1] * var10 + field4405[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field4405[arg0][var12] += field4405[arg0][var12 - 1] * var10 + field4405[arg0][var12 - 2] * var11;
            }
            field4405[arg0][1] += field4405[arg0][0] * var10 + var11;
            field4405[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field4401[0] * 2; var7++) {
                field4405[0][var7] *= field4402;
            }
        }
        for (int var8 = 0; var8 < this.field4401[arg0] * 2; var8++) {
            field4403[arg0][var8] = (int) (field4405[arg0][var8] * 65536.0F);
        }
        return this.field4401[arg0] * 2;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIF)F")
    private final float method1923(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field4404[arg0][1][arg1] - this.field4404[arg0][0][arg1]) * arg2 + (float) this.field4404[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1926(var5);
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(IIF)F")
    private final float method1924(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field4398[arg0][1][arg1] - this.field4398[arg0][0][arg1]) * arg2 + (float) this.field4398[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "()V")
    public static void method1925() {
        field4405 = null;
        field4403 = null;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(F)F")
    private static final float method1926(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lca;Lfa;)V")
    public final void method1927(class54 arg0, class255 arg1) {
        int var3 = arg0.method407(255);
        this.field4401[0] = var3 >> 4;
        this.field4401[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field4399[0] = this.field4399[1] = 0;
            return;
        }
        this.field4399[0] = arg0.method423(-128);
        this.field4399[1] = arg0.method423(-120);
        int var4 = arg0.method407(255);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field4401[var5]; var8++) {
                this.field4404[var5][0][var8] = arg0.method423(-107);
                this.field4398[var5][0][var8] = arg0.method423(-93);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field4401[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field4404[var6][1][var7] = this.field4404[var6][0][var7];
                    this.field4398[var6][1][var7] = this.field4398[var6][0][var7];
                } else {
                    this.field4404[var6][1][var7] = arg0.method423(-103);
                    this.field4398[var6][1][var7] = arg0.method423(-92);
                }
            }
        }
        if (var4 != 0 || this.field4399[1] != this.field4399[0]) {
            arg1.method1732(arg0);
        }
    }
}
