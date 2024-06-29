import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class107 {

    @OriginalMember(owner = "client!p", name = "a", descriptor = "[I")
    private int[] field2447 = new int[2];

    @OriginalMember(owner = "client!p", name = "e", descriptor = "[I")
    public int[] field2451 = new int[2];

    @OriginalMember(owner = "client!p", name = "c", descriptor = "[[[I")
    private int[][][] field2449 = new int[2][2][4];

    @OriginalMember(owner = "client!p", name = "f", descriptor = "[[[I")
    private int[][][] field2452 = new int[2][2][4];

    @OriginalMember(owner = "client!p", name = "g", descriptor = "[[F")
    private static float[][] field2453 = new float[2][8];

    @OriginalMember(owner = "client!p", name = "d", descriptor = "[[I")
    public static int[][] field2450 = new int[2][8];

    @OriginalMember(owner = "client!p", name = "b", descriptor = "F")
    private static float field2448;

    @OriginalMember(owner = "client!p", name = "h", descriptor = "I")
    public static int field2454;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(F)F")
    private static final float method854(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIF)F")
    private final float method855(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2449[arg0][1][arg1] - this.field2449[arg0][0][arg1]) * arg2 + (float) this.field2449[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IF)I")
    public final int method856(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field2447[1] - this.field2447[0]) * arg1 + (float) this.field2447[0];
            float var4 = var3 * 0.0030517578F;
            field2448 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field2454 = (int) (field2448 * 65536.0F);
        }
        if (this.field2451[arg0] == 0) {
            return 0;
        }
        float var5 = this.method855(arg0, 0, arg1);
        field2453[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method859(arg0, 0, arg1));
        field2453[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field2451[arg0]; var6++) {
            float var9 = this.method855(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method859(arg0, var6, arg1));
            float var11 = var9 * var9;
            field2453[arg0][var6 * 2 + 1] = field2453[arg0][var6 * 2 - 1] * var11;
            field2453[arg0][var6 * 2] = field2453[arg0][var6 * 2 - 1] * var10 + field2453[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field2453[arg0][var12] += field2453[arg0][var12 - 1] * var10 + field2453[arg0][var12 - 2] * var11;
            }
            field2453[arg0][1] += field2453[arg0][0] * var10 + var11;
            field2453[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field2451[0] * 2; var7++) {
                field2453[0][var7] *= field2448;
            }
        }
        for (int var8 = 0; var8 < this.field2451[arg0] * 2; var8++) {
            field2450[arg0][var8] = (int) (field2453[arg0][var8] * 65536.0F);
        }
        return this.field2451[arg0] * 2;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "()V")
    public static void method857() {
        field2453 = null;
        field2450 = null;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ls;Lha;)V")
    public final void method858(class128 arg0, class49 arg1) {
        int var3 = arg0.method1025(255);
        this.field2451[0] = var3 >> 4;
        this.field2451[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field2447[0] = this.field2447[1] = 0;
            return;
        }
        this.field2447[0] = arg0.method1041(212464720);
        this.field2447[1] = arg0.method1041(212464720);
        int var4 = arg0.method1025(255);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field2451[var5]; var8++) {
                this.field2452[var5][0][var8] = arg0.method1041(212464720);
                this.field2449[var5][0][var8] = arg0.method1041(212464720);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field2451[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field2452[var6][1][var7] = this.field2452[var6][0][var7];
                    this.field2449[var6][1][var7] = this.field2449[var6][0][var7];
                } else {
                    this.field2452[var6][1][var7] = arg0.method1041(212464720);
                    this.field2449[var6][1][var7] = arg0.method1041(212464720);
                }
            }
        }
        if (var4 != 0 || this.field2447[1] != this.field2447[0]) {
            arg1.method344(arg0);
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(IIF)F")
    private final float method859(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2452[arg0][1][arg1] - this.field2452[arg0][0][arg1]) * arg2 + (float) this.field2452[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method854(var5);
    }
}
