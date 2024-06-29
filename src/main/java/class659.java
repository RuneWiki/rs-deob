import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rda")
public class class659 {

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "[I")
    private int[] field9283 = new int[2];

    @OriginalMember(owner = "client!rda", name = "e", descriptor = "[[[I")
    private int[][][] field9287 = new int[2][2][4];

    @OriginalMember(owner = "client!rda", name = "c", descriptor = "[[[I")
    private int[][][] field9285 = new int[2][2][4];

    @OriginalMember(owner = "client!rda", name = "f", descriptor = "[I")
    public int[] field9288 = new int[2];

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "[[I")
    public static int[][] field9284 = new int[2][8];

    @OriginalMember(owner = "client!rda", name = "d", descriptor = "[[F")
    private static float[][] field9286 = new float[2][8];

    @OriginalMember(owner = "client!rda", name = "g", descriptor = "F")
    private static float field9289;

    @OriginalMember(owner = "client!rda", name = "h", descriptor = "I")
    public static int field9290;

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lud;Ldf;)V", line = 4)
    public final void method3707(class35 arg0, class398 arg1) {
        int var3 = arg0.method273(255);
        this.field9288[0] = var3 >> 4;
        this.field9288[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field9283[0] = this.field9283[1] = 0;
            return;
        }
        this.field9283[0] = arg0.method253(-13900);
        this.field9283[1] = arg0.method253(-13900);
        int var4 = arg0.method273(255);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field9288[var5]; var8++) {
                this.field9285[var5][0][var8] = arg0.method253(-13900);
                this.field9287[var5][0][var8] = arg0.method253(-13900);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field9288[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field9285[var6][1][var7] = this.field9285[var6][0][var7];
                    this.field9287[var6][1][var7] = this.field9287[var6][0][var7];
                } else {
                    this.field9285[var6][1][var7] = arg0.method253(-13900);
                    this.field9287[var6][1][var7] = arg0.method253(-13900);
                }
            }
        }
        if (var4 != 0 || this.field9283[1] != this.field9283[0]) {
            arg1.method2467(arg0);
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "()V", line = 69)
    public static void method3708() {
        field9286 = null;
        field9284 = null;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(F)F", line = 81)
    private static final float method3709(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(IIF)F", line = 98)
    private final float method3710(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field9287[arg0][1][arg1] - this.field9287[arg0][0][arg1]) * arg2 + (float) this.field9287[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(IF)I", line = 106)
    public final int method3711(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field9283[1] - this.field9283[0]) * arg1 + (float) this.field9283[0];
            float var4 = var3 * 0.0030517578F;
            field9289 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field9290 = (int) (field9289 * 65536.0F);
        }
        if (this.field9288[arg0] == 0) {
            return 0;
        }
        float var5 = this.method3710(arg0, 0, arg1);
        field9286[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method3712(arg0, 0, arg1));
        field9286[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field9288[arg0]; var6++) {
            float var9 = this.method3710(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method3712(arg0, var6, arg1));
            float var11 = var9 * var9;
            field9286[arg0][var6 * 2 + 1] = field9286[arg0][var6 * 2 - 1] * var11;
            field9286[arg0][var6 * 2] = field9286[arg0][var6 * 2 - 1] * var10 + field9286[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field9286[arg0][var12] += field9286[arg0][var12 - 1] * var10 + field9286[arg0][var12 - 2] * var11;
            }
            field9286[arg0][1] += field9286[arg0][0] * var10 + var11;
            field9286[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field9288[0] * 2; var7++) {
                field9286[0][var7] *= field9289;
            }
        }
        for (int var8 = 0; var8 < this.field9288[arg0] * 2; var8++) {
            field9284[arg0][var8] = (int) (field9286[arg0][var8] * 65536.0F);
        }
        return this.field9288[arg0] * 2;
    }

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "(IIF)F", line = 172)
    private final float method3712(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field9285[arg0][1][arg1] - this.field9285[arg0][0][arg1]) * arg2 + (float) this.field9285[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method3709(var5);
    }
}
