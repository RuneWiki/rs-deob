import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class110 {

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "[[[I")
    private int[][][] field2643 = new int[2][2][4];

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "[I")
    public int[] field2644 = new int[2];

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "[I")
    private int[] field2646 = new int[2];

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "[[[I")
    private int[][][] field2649 = new int[2][2][4];

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "[[I")
    public static int[][] field2642 = new int[2][8];

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "[[F")
    private static float[][] field2647 = new float[2][8];

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "F")
    private static float field2645;

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "I")
    public static int field2648;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IF)I")
    public final int method825(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field2646[1] - this.field2646[0]) * arg1 + (float) this.field2646[0];
            float var4 = var3 * 0.0030517578F;
            field2645 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field2648 = (int) (field2645 * 65536.0F);
        }
        if (this.field2644[arg0] == 0) {
            return 0;
        }
        float var5 = this.method828(arg0, 0, arg1);
        field2647[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method826(arg0, 0, arg1));
        field2647[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field2644[arg0]; var6++) {
            float var9 = this.method828(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method826(arg0, var6, arg1));
            float var11 = var9 * var9;
            field2647[arg0][var6 * 2 + 1] = field2647[arg0][var6 * 2 - 1] * var11;
            field2647[arg0][var6 * 2] = field2647[arg0][var6 * 2 - 1] * var10 + field2647[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field2647[arg0][var12] += field2647[arg0][var12 - 1] * var10 + field2647[arg0][var12 - 2] * var11;
            }
            field2647[arg0][1] += field2647[arg0][0] * var10 + var11;
            field2647[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field2644[0] * 2; var7++) {
                field2647[0][var7] *= field2645;
            }
        }
        for (int var8 = 0; var8 < this.field2644[arg0] * 2; var8++) {
            field2642[arg0][var8] = (int) (field2647[arg0][var8] * 65536.0F);
        }
        return this.field2644[arg0] * 2;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIF)F")
    private final float method826(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2649[arg0][1][arg1] - this.field2649[arg0][0][arg1]) * arg2 + (float) this.field2649[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method827(var5);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(F)F")
    private static final float method827(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(IIF)F")
    private final float method828(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2643[arg0][1][arg1] - this.field2643[arg0][0][arg1]) * arg2 + (float) this.field2643[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lm;Lf;)V")
    public final void method829(class83 arg0, class36 arg1) {
        int var3 = arg0.method638(0);
        this.field2644[0] = var3 >> 4;
        this.field2644[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field2646[0] = this.field2646[1] = 0;
            return;
        }
        this.field2646[0] = arg0.method631((byte) -124);
        this.field2646[1] = arg0.method631((byte) -107);
        int var4 = arg0.method638(0);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field2644[var5]; var8++) {
                this.field2649[var5][0][var8] = arg0.method631((byte) -102);
                this.field2643[var5][0][var8] = arg0.method631((byte) -113);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field2644[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field2649[var6][1][var7] = this.field2649[var6][0][var7];
                    this.field2643[var6][1][var7] = this.field2643[var6][0][var7];
                } else {
                    this.field2649[var6][1][var7] = arg0.method631((byte) -108);
                    this.field2643[var6][1][var7] = arg0.method631((byte) -120);
                }
            }
        }
        if (var4 != 0 || this.field2646[1] != this.field2646[0]) {
            arg1.method282(arg0);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "()V")
    public static void method830() {
        field2647 = null;
        field2642 = null;
    }
}
