import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mda")
public class class240 {

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "[[[I")
    private int[][][] field3026 = new int[2][2][4];

    @OriginalMember(owner = "client!mda", name = "b", descriptor = "[I")
    private int[] field3027 = new int[2];

    @OriginalMember(owner = "client!mda", name = "e", descriptor = "[I")
    public int[] field3030 = new int[2];

    @OriginalMember(owner = "client!mda", name = "g", descriptor = "[[[I")
    private int[][][] field3032 = new int[2][2][4];

    @OriginalMember(owner = "client!mda", name = "f", descriptor = "[[I")
    public static int[][] field3031 = new int[2][8];

    @OriginalMember(owner = "client!mda", name = "h", descriptor = "[[F")
    private static float[][] field3033 = new float[2][8];

    @OriginalMember(owner = "client!mda", name = "c", descriptor = "F")
    private static float field3028;

    @OriginalMember(owner = "client!mda", name = "d", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(IIF)F")
    private final float method1383(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3026[arg0][1][arg1] - this.field3026[arg0][0][arg1]) * arg2 + (float) this.field3026[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1388(var5);
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "()V")
    public static void method1384() {
        field3033 = null;
        field3031 = null;
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(IF)I")
    public final int method1385(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field3027[1] - this.field3027[0]) * arg1 + (float) this.field3027[0];
            float var4 = var3 * 0.0030517578F;
            field3028 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field3029 = (int) (field3028 * 65536.0F);
        }
        if (this.field3030[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1386(arg0, 0, arg1);
        field3033[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1383(arg0, 0, arg1));
        field3033[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field3030[arg0]; var6++) {
            float var9 = this.method1386(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method1383(arg0, var6, arg1));
            float var11 = var9 * var9;
            field3033[arg0][var6 * 2 + 1] = field3033[arg0][var6 * 2 - 1] * var11;
            field3033[arg0][var6 * 2] = field3033[arg0][var6 * 2 - 1] * var10 + field3033[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field3033[arg0][var12] += field3033[arg0][var12 - 1] * var10 + field3033[arg0][var12 - 2] * var11;
            }
            field3033[arg0][1] += field3033[arg0][0] * var10 + var11;
            field3033[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field3030[0] * 2; var7++) {
                field3033[0][var7] *= field3028;
            }
        }
        for (int var8 = 0; var8 < this.field3030[arg0] * 2; var8++) {
            field3031[arg0][var8] = (int) (field3033[arg0][var8] * 65536.0F);
        }
        return this.field3030[arg0] * 2;
    }

    @OriginalMember(owner = "client!mda", name = "b", descriptor = "(IIF)F")
    private final float method1386(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3032[arg0][1][arg1] - this.field3032[arg0][0][arg1]) * arg2 + (float) this.field3032[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(Liaa;Lwn;)V")
    public final void method1387(class452 arg0, class660 arg1) {
        int var3 = arg0.method2541(105);
        this.field3030[0] = var3 >> 4;
        this.field3030[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field3027[0] = this.field3027[1] = 0;
            return;
        }
        this.field3027[0] = arg0.method2574(-1758460248);
        this.field3027[1] = arg0.method2574(-1758460248);
        int var4 = arg0.method2541(120);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field3030[var5]; var8++) {
                this.field3026[var5][0][var8] = arg0.method2574(-1758460248);
                this.field3032[var5][0][var8] = arg0.method2574(-1758460248);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field3030[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field3026[var6][1][var7] = this.field3026[var6][0][var7];
                    this.field3032[var6][1][var7] = this.field3032[var6][0][var7];
                } else {
                    this.field3026[var6][1][var7] = arg0.method2574(-1758460248);
                    this.field3032[var6][1][var7] = arg0.method2574(-1758460248);
                }
            }
        }
        if (var4 != 0 || this.field3027[1] != this.field3027[0]) {
            arg1.method3716(arg0);
        }
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(F)F")
    private static final float method1388(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }
}
