import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class750 {

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "[I")
    private int[] field10406 = new int[2];

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "[[[I")
    private int[][][] field10408 = new int[2][2][4];

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "[I")
    public int[] field10411 = new int[2];

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "[[[I")
    private int[][][] field10413 = new int[2][2][4];

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "[[F")
    private static float[][] field10410 = new float[2][8];

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "[[I")
    public static int[][] field10409 = new int[2][8];

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "F")
    private static float field10412;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    public static int field10407;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIF)F", line = 5)
    private final float method4124(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field10408[arg0][1][arg1] - this.field10408[arg0][0][arg1]) * arg2 + (float) this.field10408[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IF)I", line = 19)
    public final int method4125(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field10406[1] - this.field10406[0]) * arg1 + (float) this.field10406[0];
            float var4 = var3 * 0.0030517578F;
            field10412 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field10407 = (int) (field10412 * 65536.0F);
        }
        if (this.field10411[arg0] == 0) {
            return 0;
        }
        float var5 = this.method4124(arg0, 0, arg1);
        field10410[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method4126(arg0, 0, arg1));
        field10410[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field10411[arg0]; var6++) {
            float var9 = this.method4124(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method4126(arg0, var6, arg1));
            float var11 = var9 * var9;
            field10410[arg0][var6 * 2 + 1] = field10410[arg0][var6 * 2 - 1] * var11;
            field10410[arg0][var6 * 2] = field10410[arg0][var6 * 2 - 1] * var10 + field10410[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field10410[arg0][var12] += field10410[arg0][var12 - 1] * var10 + field10410[arg0][var12 - 2] * var11;
            }
            field10410[arg0][1] += field10410[arg0][0] * var10 + var11;
            field10410[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field10411[0] * 2; var7++) {
                field10410[0][var7] *= field10412;
            }
        }
        for (int var8 = 0; var8 < this.field10411[arg0] * 2; var8++) {
            field10409[arg0][var8] = (int) (field10410[arg0][var8] * 65536.0F);
        }
        return this.field10411[arg0] * 2;
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(IIF)F", line = 79)
    private final float method4126(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field10413[arg0][1][arg1] - this.field10413[arg0][0][arg1]) * arg2 + (float) this.field10413[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method4129(var5);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "()V", line = 87)
    public static void method4127() {
        field10410 = null;
        field10409 = null;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lol;Lpr;)V", line = 97)
    public final void method4128(class431 arg0, class333 arg1) {
        int var3 = arg0.method2557(14929);
        this.field10411[0] = var3 >> 4;
        this.field10411[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field10406[0] = this.field10406[1] = 0;
            return;
        }
        this.field10406[0] = arg0.method2565((byte) -127);
        this.field10406[1] = arg0.method2565((byte) -102);
        int var4 = arg0.method2557(14929);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field10411[var5]; var8++) {
                this.field10413[var5][0][var8] = arg0.method2565((byte) -84);
                this.field10408[var5][0][var8] = arg0.method2565((byte) -125);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field10411[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field10413[var6][1][var7] = this.field10413[var6][0][var7];
                    this.field10408[var6][1][var7] = this.field10408[var6][0][var7];
                } else {
                    this.field10413[var6][1][var7] = arg0.method2565((byte) -116);
                    this.field10408[var6][1][var7] = arg0.method2565((byte) -107);
                }
            }
        }
        if (var4 != 0 || this.field10406[1] != this.field10406[0]) {
            arg1.method2045(arg0);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(F)F", line = 170)
    private static final float method4129(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }
}
