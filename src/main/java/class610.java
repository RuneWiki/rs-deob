import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public class class610 {

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "[I")
    private int[] field8852 = new int[2];

    @OriginalMember(owner = "client!dw", name = "e", descriptor = "[[[I")
    private int[][][] field8855 = new int[2][2][4];

    @OriginalMember(owner = "client!dw", name = "g", descriptor = "[[[I")
    private int[][][] field8857 = new int[2][2][4];

    @OriginalMember(owner = "client!dw", name = "h", descriptor = "[I")
    public int[] field8858 = new int[2];

    @OriginalMember(owner = "client!dw", name = "c", descriptor = "[[I")
    public static int[][] field8853 = new int[2][8];

    @OriginalMember(owner = "client!dw", name = "f", descriptor = "[[F")
    private static float[][] field8856 = new float[2][8];

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "F")
    private static float field8851;

    @OriginalMember(owner = "client!dw", name = "d", descriptor = "I")
    public static int field8854;

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIF)F")
    private final float method3505(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field8855[arg0][1][arg1] - this.field8855[arg0][0][arg1]) * arg2 + (float) this.field8855[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Los;Lir;)V")
    public final void method3506(class374 arg0, class25 arg1) {
        int var3 = arg0.method2129(-76);
        this.field8858[0] = var3 >> 4;
        this.field8858[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field8852[0] = this.field8852[1] = 0;
            return;
        }
        this.field8852[0] = arg0.method2136(false);
        this.field8852[1] = arg0.method2136(false);
        int var4 = arg0.method2129(-119);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field8858[var5]; var8++) {
                this.field8857[var5][0][var8] = arg0.method2136(false);
                this.field8855[var5][0][var8] = arg0.method2136(false);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field8858[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field8857[var6][1][var7] = this.field8857[var6][0][var7];
                    this.field8855[var6][1][var7] = this.field8855[var6][0][var7];
                } else {
                    this.field8857[var6][1][var7] = arg0.method2136(false);
                    this.field8855[var6][1][var7] = arg0.method2136(false);
                }
            }
        }
        if (var4 != 0 || this.field8852[1] != this.field8852[0]) {
            arg1.method156(arg0);
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(F)F")
    private static final float method3507(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "()V")
    public static void method3508() {
        field8856 = null;
        field8853 = null;
    }

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "(IIF)F")
    private final float method3509(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field8857[arg0][1][arg1] - this.field8857[arg0][0][arg1]) * arg2 + (float) this.field8857[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method3507(var5);
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(IF)I")
    public final int method3510(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field8852[1] - this.field8852[0]) * arg1 + (float) this.field8852[0];
            float var4 = var3 * 0.0030517578F;
            field8851 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field8854 = (int) (field8851 * 65536.0F);
        }
        if (this.field8858[arg0] == 0) {
            return 0;
        }
        float var5 = this.method3505(arg0, 0, arg1);
        field8856[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method3509(arg0, 0, arg1));
        field8856[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field8858[arg0]; var6++) {
            float var9 = this.method3505(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method3509(arg0, var6, arg1));
            float var11 = var9 * var9;
            field8856[arg0][var6 * 2 + 1] = field8856[arg0][var6 * 2 - 1] * var11;
            field8856[arg0][var6 * 2] = field8856[arg0][var6 * 2 - 1] * var10 + field8856[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field8856[arg0][var12] += field8856[arg0][var12 - 1] * var10 + field8856[arg0][var12 - 2] * var11;
            }
            field8856[arg0][1] += field8856[arg0][0] * var10 + var11;
            field8856[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field8858[0] * 2; var7++) {
                field8856[0][var7] *= field8851;
            }
        }
        for (int var8 = 0; var8 < this.field8858[arg0] * 2; var8++) {
            field8853[arg0][var8] = (int) (field8856[arg0][var8] * 65536.0F);
        }
        return this.field8858[arg0] * 2;
    }
}
