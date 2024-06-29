import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class278 {

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "[[[I")
    private int[][][] field4441 = new int[2][2][4];

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "[[[I")
    private int[][][] field4444 = new int[2][2][4];

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "[I")
    public int[] field4443 = new int[2];

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "[I")
    private int[] field4446 = new int[2];

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "[[I")
    public static int[][] field4442 = new int[2][8];

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "[[F")
    private static float[][] field4445 = new float[2][8];

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "F")
    private static float field4440;

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "()V")
    public static void method1815() {
        field4445 = null;
        field4442 = null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIF)F")
    private final float method1816(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field4441[arg0][1][arg1] - this.field4441[arg0][0][arg1]) * arg2 + (float) this.field4441[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1819(var5);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Leh;Lnb;)V")
    public final void method1817(class101 arg0, class128 arg1) {
        int var3 = arg0.method669((byte) 36);
        this.field4443[0] = var3 >> 4;
        this.field4443[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field4446[0] = this.field4446[1] = 0;
            return;
        }
        this.field4446[0] = arg0.method677(false);
        this.field4446[1] = arg0.method677(false);
        int var4 = arg0.method669((byte) 36);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field4443[var5]; var8++) {
                this.field4441[var5][0][var8] = arg0.method677(false);
                this.field4444[var5][0][var8] = arg0.method677(false);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field4443[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field4441[var6][1][var7] = this.field4441[var6][0][var7];
                    this.field4444[var6][1][var7] = this.field4444[var6][0][var7];
                } else {
                    this.field4441[var6][1][var7] = arg0.method677(false);
                    this.field4444[var6][1][var7] = arg0.method677(false);
                }
            }
        }
        if (var4 != 0 || this.field4446[1] != this.field4446[0]) {
            arg1.method884(arg0);
        }
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(IIF)F")
    private final float method1818(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field4444[arg0][1][arg1] - this.field4444[arg0][0][arg1]) * arg2 + (float) this.field4444[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(F)F")
    private static final float method1819(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IF)I")
    public final int method1820(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field4446[1] - this.field4446[0]) * arg1 + (float) this.field4446[0];
            float var4 = var3 * 0.0030517578F;
            field4440 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field4447 = (int) (field4440 * 65536.0F);
        }
        if (this.field4443[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1818(arg0, 0, arg1);
        field4445[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1816(arg0, 0, arg1));
        field4445[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field4443[arg0]; var6++) {
            float var9 = this.method1818(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method1816(arg0, var6, arg1));
            float var11 = var9 * var9;
            field4445[arg0][var6 * 2 + 1] = field4445[arg0][var6 * 2 - 1] * var11;
            field4445[arg0][var6 * 2] = field4445[arg0][var6 * 2 - 1] * var10 + field4445[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field4445[arg0][var12] += field4445[arg0][var12 - 1] * var10 + field4445[arg0][var12 - 2] * var11;
            }
            field4445[arg0][1] += field4445[arg0][0] * var10 + var11;
            field4445[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field4443[0] * 2; var7++) {
                field4445[0][var7] *= field4440;
            }
        }
        for (int var8 = 0; var8 < this.field4443[arg0] * 2; var8++) {
            field4442[arg0][var8] = (int) (field4445[arg0][var8] * 65536.0F);
        }
        return this.field4443[arg0] * 2;
    }
}
