import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class563 {

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "[I")
    private int[] field8360 = new int[2];

    @OriginalMember(owner = "client!ur", name = "e", descriptor = "[I")
    public int[] field8361 = new int[2];

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "[[[I")
    private int[][][] field8362 = new int[2][2][4];

    @OriginalMember(owner = "client!ur", name = "g", descriptor = "[[[I")
    private int[][][] field8364 = new int[2][2][4];

    @OriginalMember(owner = "client!ur", name = "h", descriptor = "[[I")
    public static int[][] field8358 = new int[2][8];

    @OriginalMember(owner = "client!ur", name = "d", descriptor = "[[F")
    private static float[][] field8365 = new float[2][8];

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "F")
    private static float field8363;

    @OriginalMember(owner = "client!ur", name = "f", descriptor = "I")
    public static int field8359;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(F)F", line = 6)
    private static final float method4202(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(IIF)F", line = 14)
    private final float method4203(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field8364[arg0][1][arg1] - this.field8364[arg0][0][arg1]) * arg2 + (float) this.field8364[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "()V", line = 20)
    public static void method4204() {
        field8365 = null;
        field8358 = null;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IF)I", line = 30)
    public final int method4205(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field8360[1] - this.field8360[0]) * arg1 + (float) this.field8360[0];
            float var4 = var3 * 0.0030517578F;
            field8363 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field8359 = (int) (field8363 * 65536.0F);
        }
        if (this.field8361[arg0] == 0) {
            return 0;
        }
        float var5 = this.method4203(arg0, 0, arg1);
        field8365[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method4206(arg0, 0, arg1));
        field8365[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field8361[arg0]; var6++) {
            float var9 = this.method4203(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method4206(arg0, var6, arg1));
            float var11 = var9 * var9;
            field8365[arg0][var6 * 2 + 1] = field8365[arg0][var6 * 2 - 1] * var11;
            field8365[arg0][var6 * 2] = field8365[arg0][var6 * 2 - 1] * var10 + field8365[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field8365[arg0][var12] += field8365[arg0][var12 - 1] * var10 + field8365[arg0][var12 - 2] * var11;
            }
            field8365[arg0][1] += field8365[arg0][0] * var10 + var11;
            field8365[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field8361[0] * 2; var7++) {
                field8365[0][var7] *= field8363;
            }
        }
        for (int var8 = 0; var8 < this.field8361[arg0] * 2; var8++) {
            field8358[arg0][var8] = (int) (field8365[arg0][var8] * 65536.0F);
        }
        return this.field8361[arg0] * 2;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIF)F", line = 97)
    private final float method4206(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field8362[arg0][1][arg1] - this.field8362[arg0][0][arg1]) * arg2 + (float) this.field8362[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method4202(var5);
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lib;Lvk;)V", line = 103)
    public final void method4207(class163 arg0, class386 arg1) {
        int var3 = arg0.method1455((byte) 62);
        this.field8361[0] = var3 >> 4;
        this.field8361[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field8360[0] = this.field8360[1] = 0;
            return;
        }
        this.field8360[0] = arg0.method1445((byte) 120);
        this.field8360[1] = arg0.method1445((byte) 105);
        int var4 = arg0.method1455((byte) 62);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field8361[var5]; var8++) {
                this.field8362[var5][0][var8] = arg0.method1445((byte) 113);
                this.field8364[var5][0][var8] = arg0.method1445((byte) 118);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field8361[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field8362[var6][1][var7] = this.field8362[var6][0][var7];
                    this.field8364[var6][1][var7] = this.field8364[var6][0][var7];
                } else {
                    this.field8362[var6][1][var7] = arg0.method1445((byte) 116);
                    this.field8364[var6][1][var7] = arg0.method1445((byte) 105);
                }
            }
        }
        if (var4 != 0 || this.field8360[1] != this.field8360[0]) {
            arg1.method3084(arg0);
        }
    }
}
