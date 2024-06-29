import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class43 {

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "[[[I")
    private int[][][] field738 = new int[2][2][4];

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "[[[I")
    private int[][][] field735 = new int[2][2][4];

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "[I")
    private int[] field733 = new int[2];

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "[I")
    public int[] field737 = new int[2];

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "[[F")
    private static float[][] field736 = new float[2][8];

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "[[I")
    public static int[][] field739 = new int[2][8];

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "F")
    private static float field740;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(F)F")
    private static final float method254(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IF)I")
    public final int method255(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field733[1] - this.field733[0]) * arg1 + (float) this.field733[0];
            float var4 = var3 * 0.0030517578F;
            field740 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field734 = (int) (field740 * 65536.0F);
        }
        if (this.field737[arg0] == 0) {
            return 0;
        }
        float var5 = this.method259(arg0, 0, arg1);
        field736[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method257(arg0, 0, arg1));
        field736[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field737[arg0]; var6++) {
            float var9 = this.method259(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method257(arg0, var6, arg1));
            float var11 = var9 * var9;
            field736[arg0][var6 * 2 + 1] = field736[arg0][var6 * 2 - 1] * var11;
            field736[arg0][var6 * 2] = field736[arg0][var6 * 2 - 1] * var10 + field736[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field736[arg0][var12] += field736[arg0][var12 - 1] * var10 + field736[arg0][var12 - 2] * var11;
            }
            field736[arg0][1] += field736[arg0][0] * var10 + var11;
            field736[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field737[0] * 2; var7++) {
                field736[0][var7] *= field740;
            }
        }
        for (int var8 = 0; var8 < this.field737[arg0] * 2; var8++) {
            field739[arg0][var8] = (int) (field736[arg0][var8] * 65536.0F);
        }
        return this.field737[arg0] * 2;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "()V")
    public static void method256() {
        field736 = null;
        field739 = null;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIF)F")
    private final float method257(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field738[arg0][1][arg1] - this.field738[arg0][0][arg1]) * arg2 + (float) this.field738[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method254(var5);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lij;Lnj;)V")
    public final void method258(class85 arg0, class183 arg1) {
        int var3 = arg0.method564((byte) 67);
        this.field737[0] = var3 >> 4;
        this.field737[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field733[0] = this.field733[1] = 0;
            return;
        }
        this.field733[0] = arg0.method608(15);
        this.field733[1] = arg0.method608(111);
        int var4 = arg0.method564((byte) 69);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field737[var5]; var8++) {
                this.field738[var5][0][var8] = arg0.method608(102);
                this.field735[var5][0][var8] = arg0.method608(20);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field737[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field738[var6][1][var7] = this.field738[var6][0][var7];
                    this.field735[var6][1][var7] = this.field735[var6][0][var7];
                } else {
                    this.field738[var6][1][var7] = arg0.method608(114);
                    this.field735[var6][1][var7] = arg0.method608(56);
                }
            }
        }
        if (var4 != 0 || this.field733[1] != this.field733[0]) {
            arg1.method1225(arg0);
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(IIF)F")
    private final float method259(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field735[arg0][1][arg1] - this.field735[arg0][0][arg1]) * arg2 + (float) this.field735[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }
}
