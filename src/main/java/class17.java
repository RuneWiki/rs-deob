import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class17 {

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "[[[I")
    private int[][][] field268 = new int[2][2][4];

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "[[[I")
    private int[][][] field271 = new int[2][2][4];

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "[I")
    private int[] field272 = new int[2];

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "[I")
    public int[] field274 = new int[2];

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "[[I")
    public static int[][] field270 = new int[2][8];

    @OriginalMember(owner = "client!ql", name = "h", descriptor = "[[F")
    private static float[][] field275 = new float[2][8];

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "F")
    private static float field269;

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIF)F", line = 6)
    private final float method166(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field271[arg0][1][arg1] - this.field271[arg0][0][arg1]) * arg2 + (float) this.field271[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(F)F", line = 22)
    private static final float method167(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(IIF)F", line = 28)
    private final float method168(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field268[arg0][1][arg1] - this.field268[arg0][0][arg1]) * arg2 + (float) this.field268[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method167(var5);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IF)I", line = 34)
    public final int method169(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field272[1] - this.field272[0]) * arg1 + (float) this.field272[0];
            float var4 = var3 * 0.0030517578F;
            field269 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field273 = (int) (field269 * 65536.0F);
        }
        if (this.field274[arg0] == 0) {
            return 0;
        }
        float var5 = this.method166(arg0, 0, arg1);
        field275[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method168(arg0, 0, arg1));
        field275[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field274[arg0]; var6++) {
            float var7 = this.method166(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method168(arg0, var6, arg1));
            float var9 = var7 * var7;
            field275[arg0][var6 * 2 + 1] = field275[arg0][var6 * 2 - 1] * var9;
            field275[arg0][var6 * 2] = field275[arg0][var6 * 2 - 1] * var8 + field275[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field275[arg0][var10] += field275[arg0][var10 - 1] * var8 + field275[arg0][var10 - 2] * var9;
            }
            field275[arg0][1] += field275[arg0][0] * var8 + var9;
            field275[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field274[0] * 2; var11++) {
                field275[0][var11] *= field269;
            }
        }
        for (int var12 = 0; var12 < this.field274[arg0] * 2; var12++) {
            field270[arg0][var12] = (int) (field275[arg0][var12] * 65536.0F);
        }
        return this.field274[arg0] * 2;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "()V", line = 96)
    public static void method170() {
        field275 = (float[][]) null;
        field270 = (int[][]) null;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lkh;Lvd;)V", line = 116)
    public final void method171(class14 arg0, class135 arg1) {
        int var3 = arg0.method93(false);
        this.field274[0] = var3 >> 4;
        this.field274[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field272[0] = this.field272[1] = 0;
            return;
        }
        this.field272[0] = arg0.method116(-1);
        this.field272[1] = arg0.method116(-1);
        int var4 = arg0.method93(false);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field274[var5]; var6++) {
                this.field268[var5][0][var6] = arg0.method116(-1);
                this.field271[var5][0][var6] = arg0.method116(-1);
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field274[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field268[var7][1][var8] = this.field268[var7][0][var8];
                    this.field271[var7][1][var8] = this.field271[var7][0][var8];
                } else {
                    this.field268[var7][1][var8] = arg0.method116(-1);
                    this.field271[var7][1][var8] = arg0.method116(-1);
                }
            }
        }
        if (var4 != 0 || this.field272[1] != this.field272[0]) {
            arg1.method926(arg0);
        }
    }
}
