import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class24 {

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "[[[I")
    private int[][][] field523 = new int[2][2][4];

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "[I")
    public int[] field524 = new int[2];

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "[[[I")
    private int[][][] field525 = new int[2][2][4];

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "[I")
    private int[] field528 = new int[2];

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "[[I")
    public static int[][] field527 = new int[2][8];

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "[[F")
    private static float[][] field522 = new float[2][8];

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "F")
    private static float field526;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(F)F")
    private static final float method174(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lva;Ljg;)V")
    public final void method175(class189 arg0, class87 arg1) {
        int var3 = arg0.method1202(-25);
        this.field524[0] = var3 >> 4;
        this.field524[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field528[0] = this.field528[1] = 0;
            return;
        }
        this.field528[0] = arg0.method1197(-1);
        this.field528[1] = arg0.method1197(-1);
        int var4 = arg0.method1202(-42);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field524[var5]; var8++) {
                this.field525[var5][0][var8] = arg0.method1197(-1);
                this.field523[var5][0][var8] = arg0.method1197(-1);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field524[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field525[var6][1][var7] = this.field525[var6][0][var7];
                    this.field523[var6][1][var7] = this.field523[var6][0][var7];
                } else {
                    this.field525[var6][1][var7] = arg0.method1197(-1);
                    this.field523[var6][1][var7] = arg0.method1197(-1);
                }
            }
        }
        if (var4 != 0 || this.field528[1] != this.field528[0]) {
            arg1.method580(arg0);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "()V")
    public static void method176() {
        field522 = null;
        field527 = null;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIF)F")
    private final float method177(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field525[arg0][1][arg1] - this.field525[arg0][0][arg1]) * arg2 + (float) this.field525[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method174(var5);
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(IIF)F")
    private final float method178(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field523[arg0][1][arg1] - this.field523[arg0][0][arg1]) * arg2 + (float) this.field523[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IF)I")
    public final int method179(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field528[1] - this.field528[0]) * arg1 + (float) this.field528[0];
            float var4 = var3 * 0.0030517578F;
            field526 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field529 = (int) (field526 * 65536.0F);
        }
        if (this.field524[arg0] == 0) {
            return 0;
        }
        float var5 = this.method178(arg0, 0, arg1);
        field522[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method177(arg0, 0, arg1));
        field522[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field524[arg0]; var6++) {
            float var9 = this.method178(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method177(arg0, var6, arg1));
            float var11 = var9 * var9;
            field522[arg0][var6 * 2 + 1] = field522[arg0][var6 * 2 - 1] * var11;
            field522[arg0][var6 * 2] = field522[arg0][var6 * 2 - 1] * var10 + field522[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field522[arg0][var12] += field522[arg0][var12 - 1] * var10 + field522[arg0][var12 - 2] * var11;
            }
            field522[arg0][1] += field522[arg0][0] * var10 + var11;
            field522[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field524[0] * 2; var7++) {
                field522[0][var7] *= field526;
            }
        }
        for (int var8 = 0; var8 < this.field524[arg0] * 2; var8++) {
            field527[arg0][var8] = (int) (field522[arg0][var8] * 65536.0F);
        }
        return this.field524[arg0] * 2;
    }
}
