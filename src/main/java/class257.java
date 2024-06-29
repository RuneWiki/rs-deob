import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class257 {

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "[I")
    public int[] field3971 = new int[2];

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "[[[I")
    private int[][][] field3970 = new int[2][2][4];

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "[I")
    private int[] field3972 = new int[2];

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "[[[I")
    private int[][][] field3973 = new int[2][2][4];

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "[[I")
    public static int[][] field3967 = new int[2][8];

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "[[F")
    private static float[][] field3969 = new float[2][8];

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "F")
    private static float field3966;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "I")
    public static int field3968;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(F)F", line = 8)
    private static final float method1814(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "()V", line = 12)
    public static void method1815() {
        field3969 = (float[][]) null;
        field3967 = (int[][]) null;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lpe;Le;)V", line = 18)
    public final void method1816(class101 arg0, class161 arg1) {
        int var3 = arg0.method741(34);
        this.field3971[0] = var3 >> 4;
        this.field3971[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field3972[0] = this.field3972[1] = 0;
            return;
        }
        this.field3972[0] = arg0.method731(false);
        this.field3972[1] = arg0.method731(false);
        int var4 = arg0.method741(127);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field3971[var5]; var6++) {
                this.field3970[var5][0][var6] = arg0.method731(false);
                this.field3973[var5][0][var6] = arg0.method731(false);
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field3971[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field3970[var7][1][var8] = this.field3970[var7][0][var8];
                    this.field3973[var7][1][var8] = this.field3973[var7][0][var8];
                } else {
                    this.field3970[var7][1][var8] = arg0.method731(false);
                    this.field3973[var7][1][var8] = arg0.method731(false);
                }
            }
        }
        if (var4 != 0 || this.field3972[1] != this.field3972[0]) {
            arg1.method1197(arg0);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIF)F", line = 90)
    private final float method1817(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3973[arg0][1][arg1] - this.field3973[arg0][0][arg1]) * arg2 + (float) this.field3973[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(IIF)F", line = 97)
    private final float method1818(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3970[arg0][1][arg1] - this.field3970[arg0][0][arg1]) * arg2 + (float) this.field3970[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1814(var5);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IF)I", line = 123)
    public final int method1819(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field3972[1] - this.field3972[0]) * arg1 + (float) this.field3972[0];
            float var4 = var3 * 0.0030517578F;
            field3966 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field3968 = (int) (field3966 * 65536.0F);
        }
        if (this.field3971[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1817(arg0, 0, arg1);
        field3969[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1818(arg0, 0, arg1));
        field3969[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field3971[arg0]; var6++) {
            float var7 = this.method1817(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1818(arg0, var6, arg1));
            float var9 = var7 * var7;
            field3969[arg0][var6 * 2 + 1] = field3969[arg0][var6 * 2 - 1] * var9;
            field3969[arg0][var6 * 2] = field3969[arg0][var6 * 2 - 1] * var8 + field3969[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field3969[arg0][var10] += field3969[arg0][var10 - 1] * var8 + field3969[arg0][var10 - 2] * var9;
            }
            field3969[arg0][1] += field3969[arg0][0] * var8 + var9;
            field3969[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field3971[0] * 2; var11++) {
                field3969[0][var11] *= field3966;
            }
        }
        for (int var12 = 0; var12 < this.field3971[arg0] * 2; var12++) {
            field3967[arg0][var12] = (int) (field3969[arg0][var12] * 65536.0F);
        }
        return this.field3971[arg0] * 2;
    }
}
