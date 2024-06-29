import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class481 {

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "[[[I")
    private int[][][] field6733 = new int[2][2][4];

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "[I")
    public int[] field6732 = new int[2];

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "[[[I")
    private int[][][] field6734 = new int[2][2][4];

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "[I")
    private int[] field6735 = new int[2];

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "[[I")
    public static int[][] field6731 = new int[2][8];

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "[[F")
    private static float[][] field6738 = new float[2][8];

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "F")
    private static float field6737;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "I")
    public static int field6736;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IF)I")
    public final int method2719(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field6735[1] - this.field6735[0]) * arg1 + (float) this.field6735[0];
            float var4 = var3 * 0.0030517578F;
            field6737 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field6736 = (int) (field6737 * 65536.0F);
        }
        if (this.field6732[arg0] == 0) {
            return 0;
        }
        float var5 = this.method2724(arg0, 0, arg1);
        field6738[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method2720(arg0, 0, arg1));
        field6738[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field6732[arg0]; var6++) {
            float var9 = this.method2724(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method2720(arg0, var6, arg1));
            float var11 = var9 * var9;
            field6738[arg0][var6 * 2 + 1] = field6738[arg0][var6 * 2 - 1] * var11;
            field6738[arg0][var6 * 2] = field6738[arg0][var6 * 2 - 1] * var10 + field6738[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field6738[arg0][var12] += field6738[arg0][var12 - 1] * var10 + field6738[arg0][var12 - 2] * var11;
            }
            field6738[arg0][1] += field6738[arg0][0] * var10 + var11;
            field6738[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field6732[0] * 2; var7++) {
                field6738[0][var7] *= field6737;
            }
        }
        for (int var8 = 0; var8 < this.field6732[arg0] * 2; var8++) {
            field6731[arg0][var8] = (int) (field6738[arg0][var8] * 65536.0F);
        }
        return this.field6732[arg0] * 2;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIF)F")
    private final float method2720(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field6733[arg0][1][arg1] - this.field6733[arg0][0][arg1]) * arg2 + (float) this.field6733[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method2722(var5);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lge;Loaa;)V")
    public final void method2721(class551 arg0, class511 arg1) {
        int var3 = arg0.method3045(-128);
        this.field6732[0] = var3 >> 4;
        this.field6732[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field6735[0] = this.field6735[1] = 0;
            return;
        }
        this.field6735[0] = arg0.method3090(-121);
        this.field6735[1] = arg0.method3090(-122);
        int var4 = arg0.method3045(-127);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field6732[var5]; var8++) {
                this.field6733[var5][0][var8] = arg0.method3090(-112);
                this.field6734[var5][0][var8] = arg0.method3090(-104);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field6732[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field6733[var6][1][var7] = this.field6733[var6][0][var7];
                    this.field6734[var6][1][var7] = this.field6734[var6][0][var7];
                } else {
                    this.field6733[var6][1][var7] = arg0.method3090(-124);
                    this.field6734[var6][1][var7] = arg0.method3090(-70);
                }
            }
        }
        if (var4 != 0 || this.field6735[1] != this.field6735[0]) {
            arg1.method2851(arg0);
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(F)F")
    private static final float method2722(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "()V")
    public static void method2723() {
        field6738 = null;
        field6731 = null;
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(IIF)F")
    private final float method2724(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field6734[arg0][1][arg1] - this.field6734[arg0][0][arg1]) * arg2 + (float) this.field6734[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }
}
