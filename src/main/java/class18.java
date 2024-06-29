import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class18 {

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "[[[I")
    private int[][][] field249 = new int[2][2][4];

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "[[[I")
    private int[][][] field247 = new int[2][2][4];

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "[I")
    private int[] field248 = new int[2];

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "[I")
    public int[] field246 = new int[2];

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "[[I")
    public static int[][] field252 = new int[2][8];

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "[[F")
    private static float[][] field250 = new float[2][8];

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "F")
    private static float field251;

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(F)F", line = 12)
    private static final float method111(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIF)F", line = 21)
    private final float method112(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field249[arg0][1][arg1] - this.field249[arg0][0][arg1]) * arg2 + (float) this.field249[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IF)I", line = 26)
    public final int method113(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field248[1] - this.field248[0]) * arg1 + (float) this.field248[0];
            float var4 = var3 * 0.0030517578F;
            field251 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field253 = (int) (field251 * 65536.0F);
        }
        if (this.field246[arg0] == 0) {
            return 0;
        }
        float var5 = this.method112(arg0, 0, arg1);
        field250[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method114(arg0, 0, arg1));
        field250[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field246[arg0]; var6++) {
            float var7 = this.method112(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method114(arg0, var6, arg1));
            float var9 = var7 * var7;
            field250[arg0][var6 * 2 + 1] = field250[arg0][var6 * 2 - 1] * var9;
            field250[arg0][var6 * 2] = field250[arg0][var6 * 2 - 1] * var8 + field250[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field250[arg0][var10] += field250[arg0][var10 - 1] * var8 + field250[arg0][var10 - 2] * var9;
            }
            field250[arg0][1] += field250[arg0][0] * var8 + var9;
            field250[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field246[0] * 2; var11++) {
                field250[0][var11] *= field251;
            }
        }
        for (int var12 = 0; var12 < this.field246[arg0] * 2; var12++) {
            field252[arg0][var12] = (int) (field250[arg0][var12] * 65536.0F);
        }
        return this.field246[arg0] * 2;
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(IIF)F", line = 86)
    private final float method114(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field247[arg0][1][arg1] - this.field247[arg0][0][arg1]) * arg2 + (float) this.field247[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method111(var5);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lra;Leh;)V", line = 93)
    public final void method115(class41 arg0, class147 arg1) {
        int var3 = arg0.method357(false);
        this.field246[0] = var3 >> 4;
        this.field246[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field248[0] = this.field248[1] = 0;
            return;
        }
        this.field248[0] = arg0.method346(-16);
        this.field248[1] = arg0.method346(-16);
        int var4 = arg0.method357(false);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field246[var5]; var6++) {
                this.field247[var5][0][var6] = arg0.method346(-16);
                this.field249[var5][0][var6] = arg0.method346(-16);
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field246[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field247[var7][1][var8] = this.field247[var7][0][var8];
                    this.field249[var7][1][var8] = this.field249[var7][0][var8];
                } else {
                    this.field247[var7][1][var8] = arg0.method346(-16);
                    this.field249[var7][1][var8] = arg0.method346(-16);
                }
            }
        }
        if (var4 != 0 || this.field248[1] != this.field248[0]) {
            arg1.method1074(arg0);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "()V", line = 169)
    public static void method116() {
        field250 = (float[][]) null;
        field252 = (int[][]) null;
    }
}
