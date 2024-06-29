import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class496 {

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "[[[I")
    private int[][][] field7550 = new int[2][2][4];

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "[I")
    public int[] field7551 = new int[2];

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "[I")
    private int[] field7552 = new int[2];

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "[[[I")
    private int[][][] field7554 = new int[2][2][4];

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "[[F")
    private static float[][] field7548 = new float[2][8];

    @OriginalMember(owner = "client!ql", name = "h", descriptor = "[[I")
    public static int[][] field7555 = new int[2][8];

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "F")
    private static float field7549;

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "I")
    public static int field7553;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "()V", line = 7)
    public static void method2977() {
        field7548 = null;
        field7555 = null;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lae;Lgo;)V", line = 14)
    public final void method2978(class156 arg0, class425 arg1) {
        int var3 = arg0.method941((byte) 125);
        this.field7551[0] = var3 >> 4;
        this.field7551[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field7552[0] = this.field7552[1] = 0;
            return;
        }
        this.field7552[0] = arg0.method993((byte) -41);
        this.field7552[1] = arg0.method993((byte) -106);
        int var4 = arg0.method941((byte) 123);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field7551[var5]; var8++) {
                this.field7550[var5][0][var8] = arg0.method993((byte) -43);
                this.field7554[var5][0][var8] = arg0.method993((byte) -43);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field7551[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field7550[var6][1][var7] = this.field7550[var6][0][var7];
                    this.field7554[var6][1][var7] = this.field7554[var6][0][var7];
                } else {
                    this.field7550[var6][1][var7] = arg0.method993((byte) -77);
                    this.field7554[var6][1][var7] = arg0.method993((byte) -105);
                }
            }
        }
        if (var4 != 0 || this.field7552[1] != this.field7552[0]) {
            arg1.method2538(arg0);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIF)F", line = 80)
    private final float method2979(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field7550[arg0][1][arg1] - this.field7550[arg0][0][arg1]) * arg2 + (float) this.field7550[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method2982(var5);
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(IIF)F", line = 86)
    private final float method2980(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field7554[arg0][1][arg1] - this.field7554[arg0][0][arg1]) * arg2 + (float) this.field7554[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IF)I", line = 102)
    public final int method2981(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field7552[1] - this.field7552[0]) * arg1 + (float) this.field7552[0];
            float var4 = var3 * 0.0030517578F;
            field7549 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field7553 = (int) (field7549 * 65536.0F);
        }
        if (this.field7551[arg0] == 0) {
            return 0;
        }
        float var5 = this.method2980(arg0, 0, arg1);
        field7548[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method2979(arg0, 0, arg1));
        field7548[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field7551[arg0]; var6++) {
            float var9 = this.method2980(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method2979(arg0, var6, arg1));
            float var11 = var9 * var9;
            field7548[arg0][var6 * 2 + 1] = field7548[arg0][var6 * 2 - 1] * var11;
            field7548[arg0][var6 * 2] = field7548[arg0][var6 * 2 - 1] * var10 + field7548[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field7548[arg0][var12] += field7548[arg0][var12 - 1] * var10 + field7548[arg0][var12 - 2] * var11;
            }
            field7548[arg0][1] += field7548[arg0][0] * var10 + var11;
            field7548[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field7551[0] * 2; var7++) {
                field7548[0][var7] *= field7549;
            }
        }
        for (int var8 = 0; var8 < this.field7551[arg0] * 2; var8++) {
            field7555[arg0][var8] = (int) (field7548[arg0][var8] * 65536.0F);
        }
        return this.field7551[arg0] * 2;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(F)F", line = 180)
    private static final float method2982(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }
}
