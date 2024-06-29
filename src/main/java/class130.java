import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class130 {

    @OriginalMember(owner = "client!se", name = "f", descriptor = "[[[I")
    private int[][][] field2994 = new int[2][2][4];

    @OriginalMember(owner = "client!se", name = "c", descriptor = "[[[I")
    private int[][][] field2991 = new int[2][2][4];

    @OriginalMember(owner = "client!se", name = "h", descriptor = "[I")
    public int[] field2996 = new int[2];

    @OriginalMember(owner = "client!se", name = "e", descriptor = "[I")
    private int[] field2993 = new int[2];

    @OriginalMember(owner = "client!se", name = "a", descriptor = "[[F")
    private static float[][] field2989 = new float[2][8];

    @OriginalMember(owner = "client!se", name = "b", descriptor = "[[I")
    public static int[][] field2990 = new int[2][8];

    @OriginalMember(owner = "client!se", name = "d", descriptor = "F")
    private static float field2992;

    @OriginalMember(owner = "client!se", name = "g", descriptor = "I")
    public static int field2995;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIF)F")
    private final float method973(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2994[arg0][1][arg1] - this.field2994[arg0][0][arg1]) * arg2 + (float) this.field2994[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method976(var5);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "()V")
    public static void method974() {
        field2989 = null;
        field2990 = null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IF)I")
    public final int method975(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field2993[1] - this.field2993[0]) * arg1 + (float) this.field2993[0];
            float var4 = var3 * 0.0030517578F;
            field2992 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field2995 = (int) (field2992 * 65536.0F);
        }
        if (this.field2996[arg0] == 0) {
            return 0;
        }
        float var5 = this.method977(arg0, 0, arg1);
        field2989[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method973(arg0, 0, arg1));
        field2989[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field2996[arg0]; var6++) {
            float var9 = this.method977(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method973(arg0, var6, arg1));
            float var11 = var9 * var9;
            field2989[arg0][var6 * 2 + 1] = field2989[arg0][var6 * 2 - 1] * var11;
            field2989[arg0][var6 * 2] = field2989[arg0][var6 * 2 - 1] * var10 + field2989[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field2989[arg0][var12] += field2989[arg0][var12 - 1] * var10 + field2989[arg0][var12 - 2] * var11;
            }
            field2989[arg0][1] += field2989[arg0][0] * var10 + var11;
            field2989[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field2996[0] * 2; var7++) {
                field2989[0][var7] *= field2992;
            }
        }
        for (int var8 = 0; var8 < this.field2996[arg0] * 2; var8++) {
            field2990[arg0][var8] = (int) (field2989[arg0][var8] * 65536.0F);
        }
        return this.field2996[arg0] * 2;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(F)F")
    private static final float method976(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(IIF)F")
    private final float method977(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2991[arg0][1][arg1] - this.field2991[arg0][0][arg1]) * arg2 + (float) this.field2991[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lne;Lg;)V")
    public final void method978(class95 arg0, class43 arg1) {
        int var3 = arg0.method790((byte) 73);
        this.field2996[0] = var3 >> 4;
        this.field2996[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field2993[0] = this.field2993[1] = 0;
            return;
        }
        this.field2993[0] = arg0.method795(1);
        this.field2993[1] = arg0.method795(1);
        int var4 = arg0.method790((byte) 73);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field2996[var5]; var8++) {
                this.field2994[var5][0][var8] = arg0.method795(1);
                this.field2991[var5][0][var8] = arg0.method795(1);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field2996[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field2994[var6][1][var7] = this.field2994[var6][0][var7];
                    this.field2991[var6][1][var7] = this.field2991[var6][0][var7];
                } else {
                    this.field2994[var6][1][var7] = arg0.method795(1);
                    this.field2991[var6][1][var7] = arg0.method795(1);
                }
            }
        }
        if (var4 != 0 || this.field2993[1] != this.field2993[0]) {
            arg1.method290(arg0);
        }
    }
}
