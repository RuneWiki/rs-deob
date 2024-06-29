import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class195 {

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "[I")
    private int[] field2805 = new int[2];

    @OriginalMember(owner = "client!rq", name = "f", descriptor = "[I")
    public int[] field2808 = new int[2];

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "[[[I")
    private int[][][] field2804 = new int[2][2][4];

    @OriginalMember(owner = "client!rq", name = "d", descriptor = "[[[I")
    private int[][][] field2806 = new int[2][2][4];

    @OriginalMember(owner = "client!rq", name = "e", descriptor = "[[F")
    private static float[][] field2807 = new float[2][8];

    @OriginalMember(owner = "client!rq", name = "g", descriptor = "[[I")
    public static int[][] field2809 = new int[2][8];

    @OriginalMember(owner = "client!rq", name = "h", descriptor = "F")
    private static float field2810;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(F)F")
    private static final float method1389(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(Llf;Ldl;)V")
    public final void method1390(class130 arg0, class39 arg1) {
        int var3 = arg0.method837(true);
        this.field2808[0] = var3 >> 4;
        this.field2808[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field2805[0] = this.field2805[1] = 0;
            return;
        }
        this.field2805[0] = arg0.method798(false);
        this.field2805[1] = arg0.method798(false);
        int var4 = arg0.method837(true);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field2808[var5]; var8++) {
                this.field2806[var5][0][var8] = arg0.method798(false);
                this.field2804[var5][0][var8] = arg0.method798(false);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field2808[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field2806[var6][1][var7] = this.field2806[var6][0][var7];
                    this.field2804[var6][1][var7] = this.field2804[var6][0][var7];
                } else {
                    this.field2806[var6][1][var7] = arg0.method798(false);
                    this.field2804[var6][1][var7] = arg0.method798(false);
                }
            }
        }
        if (var4 != 0 || this.field2805[1] != this.field2805[0]) {
            arg1.method256(arg0);
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IF)I")
    public final int method1391(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field2805[1] - this.field2805[0]) * arg1 + (float) this.field2805[0];
            float var4 = var3 * 0.0030517578F;
            field2810 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field2803 = (int) (field2810 * 65536.0F);
        }
        if (this.field2808[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1394(arg0, 0, arg1);
        field2807[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1393(arg0, 0, arg1));
        field2807[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field2808[arg0]; var6++) {
            float var9 = this.method1394(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method1393(arg0, var6, arg1));
            float var11 = var9 * var9;
            field2807[arg0][var6 * 2 + 1] = field2807[arg0][var6 * 2 - 1] * var11;
            field2807[arg0][var6 * 2] = field2807[arg0][var6 * 2 - 1] * var10 + field2807[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field2807[arg0][var12] += field2807[arg0][var12 - 1] * var10 + field2807[arg0][var12 - 2] * var11;
            }
            field2807[arg0][1] += field2807[arg0][0] * var10 + var11;
            field2807[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field2808[0] * 2; var7++) {
                field2807[0][var7] *= field2810;
            }
        }
        for (int var8 = 0; var8 < this.field2808[arg0] * 2; var8++) {
            field2809[arg0][var8] = (int) (field2807[arg0][var8] * 65536.0F);
        }
        return this.field2808[arg0] * 2;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "()V")
    public static void method1392() {
        field2807 = null;
        field2809 = null;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIF)F")
    private final float method1393(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2806[arg0][1][arg1] - this.field2806[arg0][0][arg1]) * arg2 + (float) this.field2806[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1389(var5);
    }

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "(IIF)F")
    private final float method1394(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2804[arg0][1][arg1] - this.field2804[arg0][0][arg1]) * arg2 + (float) this.field2804[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }
}
