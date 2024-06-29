import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class155 {

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "[I")
    public int[] field2670 = new int[2];

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "[I")
    private int[] field2668 = new int[2];

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "[[[I")
    private int[][][] field2666 = new int[2][2][4];

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "[[[I")
    private int[][][] field2669 = new int[2][2][4];

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "[[I")
    public static int[][] field2667 = new int[2][8];

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "[[F")
    private static float[][] field2673 = new float[2][8];

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "F")
    private static float field2672;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(F)F")
    private static final float method972(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "()V")
    public static void method973() {
        field2673 = null;
        field2667 = null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IF)I")
    public final int method974(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field2668[1] - this.field2668[0]) * arg1 + (float) this.field2668[0];
            float var4 = var3 * 0.0030517578F;
            field2672 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field2671 = (int) (field2672 * 65536.0F);
        }
        if (this.field2670[arg0] == 0) {
            return 0;
        }
        float var5 = this.method976(arg0, 0, arg1);
        field2673[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method977(arg0, 0, arg1));
        field2673[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field2670[arg0]; var6++) {
            float var9 = this.method976(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method977(arg0, var6, arg1));
            float var11 = var9 * var9;
            field2673[arg0][var6 * 2 + 1] = field2673[arg0][var6 * 2 - 1] * var11;
            field2673[arg0][var6 * 2] = field2673[arg0][var6 * 2 - 1] * var10 + field2673[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field2673[arg0][var12] += field2673[arg0][var12 - 1] * var10 + field2673[arg0][var12 - 2] * var11;
            }
            field2673[arg0][1] += field2673[arg0][0] * var10 + var11;
            field2673[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field2670[0] * 2; var7++) {
                field2673[0][var7] *= field2672;
            }
        }
        for (int var8 = 0; var8 < this.field2670[arg0] * 2; var8++) {
            field2667[arg0][var8] = (int) (field2673[arg0][var8] * 65536.0F);
        }
        return this.field2670[arg0] * 2;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lnj;Loa;)V")
    public final void method975(class226 arg0, class234 arg1) {
        int var3 = arg0.method1471(255);
        this.field2670[0] = var3 >> 4;
        this.field2670[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field2668[0] = this.field2668[1] = 0;
            return;
        }
        this.field2668[0] = arg0.method1447(0);
        this.field2668[1] = arg0.method1447(0);
        int var4 = arg0.method1471(255);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field2670[var5]; var8++) {
                this.field2666[var5][0][var8] = arg0.method1447(0);
                this.field2669[var5][0][var8] = arg0.method1447(0);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field2670[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field2666[var6][1][var7] = this.field2666[var6][0][var7];
                    this.field2669[var6][1][var7] = this.field2669[var6][0][var7];
                } else {
                    this.field2666[var6][1][var7] = arg0.method1447(0);
                    this.field2669[var6][1][var7] = arg0.method1447(0);
                }
            }
        }
        if (var4 != 0 || this.field2668[1] != this.field2668[0]) {
            arg1.method1564(arg0);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIF)F")
    private final float method976(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2669[arg0][1][arg1] - this.field2669[arg0][0][arg1]) * arg2 + (float) this.field2669[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(IIF)F")
    private final float method977(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2666[arg0][1][arg1] - this.field2666[arg0][0][arg1]) * arg2 + (float) this.field2666[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method972(var5);
    }
}
