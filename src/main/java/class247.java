import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class247 {

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "[I")
    public int[] field3876 = new int[2];

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "[[[I")
    private int[][][] field3874 = new int[2][2][4];

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "[I")
    private int[] field3873 = new int[2];

    @OriginalMember(owner = "client!ll", name = "h", descriptor = "[[[I")
    private int[][][] field3878 = new int[2][2][4];

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "[[I")
    public static int[][] field3872 = new int[2][8];

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "[[F")
    private static float[][] field3871 = new float[2][8];

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "F")
    private static float field3875;

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "I")
    public static int field3877;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIF)F")
    private final float method1670(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3878[arg0][1][arg1] - this.field3878[arg0][0][arg1]) * arg2 + (float) this.field3878[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lhp;Lht;)V")
    public final void method1671(class217 arg0, class413 arg1) {
        int var3 = arg0.method1515((byte) 124);
        this.field3876[0] = var3 >> 4;
        this.field3876[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field3873[0] = this.field3873[1] = 0;
            return;
        }
        this.field3873[0] = arg0.method1511(-51);
        this.field3873[1] = arg0.method1511(97);
        int var4 = arg0.method1515((byte) 125);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field3876[var5]; var8++) {
                this.field3874[var5][0][var8] = arg0.method1511(124);
                this.field3878[var5][0][var8] = arg0.method1511(127);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field3876[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field3874[var6][1][var7] = this.field3874[var6][0][var7];
                    this.field3878[var6][1][var7] = this.field3878[var6][0][var7];
                } else {
                    this.field3874[var6][1][var7] = arg0.method1511(97);
                    this.field3878[var6][1][var7] = arg0.method1511(103);
                }
            }
        }
        if (var4 != 0 || this.field3873[1] != this.field3873[0]) {
            arg1.method2595(arg0);
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IF)I")
    public final int method1672(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field3873[1] - this.field3873[0]) * arg1 + (float) this.field3873[0];
            float var4 = var3 * 0.0030517578F;
            field3875 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field3877 = (int) (field3875 * 65536.0F);
        }
        if (this.field3876[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1670(arg0, 0, arg1);
        field3871[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1674(arg0, 0, arg1));
        field3871[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field3876[arg0]; var6++) {
            float var9 = this.method1670(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method1674(arg0, var6, arg1));
            float var11 = var9 * var9;
            field3871[arg0][var6 * 2 + 1] = field3871[arg0][var6 * 2 - 1] * var11;
            field3871[arg0][var6 * 2] = field3871[arg0][var6 * 2 - 1] * var10 + field3871[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field3871[arg0][var12] += field3871[arg0][var12 - 1] * var10 + field3871[arg0][var12 - 2] * var11;
            }
            field3871[arg0][1] += field3871[arg0][0] * var10 + var11;
            field3871[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field3876[0] * 2; var7++) {
                field3871[0][var7] *= field3875;
            }
        }
        for (int var8 = 0; var8 < this.field3876[arg0] * 2; var8++) {
            field3872[arg0][var8] = (int) (field3871[arg0][var8] * 65536.0F);
        }
        return this.field3876[arg0] * 2;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "()V")
    public static void method1673() {
        field3871 = null;
        field3872 = null;
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(IIF)F")
    private final float method1674(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3874[arg0][1][arg1] - this.field3874[arg0][0][arg1]) * arg2 + (float) this.field3874[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1675(var5);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(F)F")
    private static final float method1675(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }
}
