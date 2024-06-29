import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class138 {

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "[[[I")
    private int[][][] field2465 = new int[2][2][4];

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "[I")
    public int[] field2467 = new int[2];

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "[I")
    private int[] field2468 = new int[2];

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "[[[I")
    private int[][][] field2470 = new int[2][2][4];

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "[[I")
    public static int[][] field2466 = new int[2][8];

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "[[F")
    private static float[][] field2469 = new float[2][8];

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "F")
    private static float field2471;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
    public static int field2464;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IF)I")
    public final int method925(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field2468[1] - this.field2468[0]) * arg1 + (float) this.field2468[0];
            float var4 = var3 * 0.0030517578F;
            field2471 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field2464 = (int) (field2471 * 65536.0F);
        }
        if (this.field2467[arg0] == 0) {
            return 0;
        }
        float var5 = this.method929(arg0, 0, arg1);
        field2469[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method930(arg0, 0, arg1));
        field2469[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field2467[arg0]; var6++) {
            float var9 = this.method929(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method930(arg0, var6, arg1));
            float var11 = var9 * var9;
            field2469[arg0][var6 * 2 + 1] = field2469[arg0][var6 * 2 - 1] * var11;
            field2469[arg0][var6 * 2] = field2469[arg0][var6 * 2 - 1] * var10 + field2469[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field2469[arg0][var12] += field2469[arg0][var12 - 1] * var10 + field2469[arg0][var12 - 2] * var11;
            }
            field2469[arg0][1] += field2469[arg0][0] * var10 + var11;
            field2469[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field2467[0] * 2; var7++) {
                field2469[0][var7] *= field2471;
            }
        }
        for (int var8 = 0; var8 < this.field2467[arg0] * 2; var8++) {
            field2466[arg0][var8] = (int) (field2469[arg0][var8] * 65536.0F);
        }
        return this.field2467[arg0] * 2;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(F)F")
    private static final float method926(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "()V")
    public static void method927() {
        field2469 = null;
        field2466 = null;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lfj;Lwb;)V")
    public final void method928(class66 arg0, class232 arg1) {
        int var3 = arg0.method506(255);
        this.field2467[0] = var3 >> 4;
        this.field2467[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field2468[0] = this.field2468[1] = 0;
            return;
        }
        this.field2468[0] = arg0.method500(88);
        this.field2468[1] = arg0.method500(40);
        int var4 = arg0.method506(255);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field2467[var5]; var8++) {
                this.field2465[var5][0][var8] = arg0.method500(86);
                this.field2470[var5][0][var8] = arg0.method500(95);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field2467[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field2465[var6][1][var7] = this.field2465[var6][0][var7];
                    this.field2470[var6][1][var7] = this.field2470[var6][0][var7];
                } else {
                    this.field2465[var6][1][var7] = arg0.method500(123);
                    this.field2470[var6][1][var7] = arg0.method500(37);
                }
            }
        }
        if (var4 != 0 || this.field2468[1] != this.field2468[0]) {
            arg1.method1517(arg0);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIF)F")
    private final float method929(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2470[arg0][1][arg1] - this.field2470[arg0][0][arg1]) * arg2 + (float) this.field2470[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(IIF)F")
    private final float method930(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2465[arg0][1][arg1] - this.field2465[arg0][0][arg1]) * arg2 + (float) this.field2465[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method926(var5);
    }
}
