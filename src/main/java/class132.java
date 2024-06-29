import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class132 {

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "[[[I")
    private int[][][] field2486 = new int[2][2][4];

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "[I")
    public int[] field2490 = new int[2];

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "[I")
    private int[] field2492 = new int[2];

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "[[[I")
    private int[][][] field2493 = new int[2][2][4];

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "[[I")
    public static int[][] field2488 = new int[2][8];

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "[[F")
    private static float[][] field2489 = new float[2][8];

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "F")
    private static float field2491;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "()V")
    public static void method910() {
        field2489 = null;
        field2488 = null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IF)I")
    public final int method911(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field2492[1] - this.field2492[0]) * arg1 + (float) this.field2492[0];
            float var4 = var3 * 0.0030517578F;
            field2491 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field2487 = (int) (field2491 * 65536.0F);
        }
        if (this.field2490[arg0] == 0) {
            return 0;
        }
        float var5 = this.method912(arg0, 0, arg1);
        field2489[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method913(arg0, 0, arg1));
        field2489[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field2490[arg0]; var6++) {
            float var9 = this.method912(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method913(arg0, var6, arg1));
            float var11 = var9 * var9;
            field2489[arg0][var6 * 2 + 1] = field2489[arg0][var6 * 2 - 1] * var11;
            field2489[arg0][var6 * 2] = field2489[arg0][var6 * 2 - 1] * var10 + field2489[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field2489[arg0][var12] += field2489[arg0][var12 - 1] * var10 + field2489[arg0][var12 - 2] * var11;
            }
            field2489[arg0][1] += field2489[arg0][0] * var10 + var11;
            field2489[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field2490[0] * 2; var7++) {
                field2489[0][var7] *= field2491;
            }
        }
        for (int var8 = 0; var8 < this.field2490[arg0] * 2; var8++) {
            field2488[arg0][var8] = (int) (field2489[arg0][var8] * 65536.0F);
        }
        return this.field2490[arg0] * 2;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIF)F")
    private final float method912(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2486[arg0][1][arg1] - this.field2486[arg0][0][arg1]) * arg2 + (float) this.field2486[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(IIF)F")
    private final float method913(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2493[arg0][1][arg1] - this.field2493[arg0][0][arg1]) * arg2 + (float) this.field2493[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method914(var5);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(F)F")
    private static final float method914(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lme;Lrg;)V")
    public final void method915(class114 arg0, class161 arg1) {
        int var3 = arg0.method767(true);
        this.field2490[0] = var3 >> 4;
        this.field2490[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field2492[0] = this.field2492[1] = 0;
            return;
        }
        this.field2492[0] = arg0.method762((byte) 84);
        this.field2492[1] = arg0.method762((byte) 118);
        int var4 = arg0.method767(true);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field2490[var5]; var8++) {
                this.field2493[var5][0][var8] = arg0.method762((byte) 100);
                this.field2486[var5][0][var8] = arg0.method762((byte) 105);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field2490[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field2493[var6][1][var7] = this.field2493[var6][0][var7];
                    this.field2486[var6][1][var7] = this.field2486[var6][0][var7];
                } else {
                    this.field2493[var6][1][var7] = arg0.method762((byte) 99);
                    this.field2486[var6][1][var7] = arg0.method762((byte) 112);
                }
            }
        }
        if (var4 != 0 || this.field2492[1] != this.field2492[0]) {
            arg1.method1070(arg0);
        }
    }
}
