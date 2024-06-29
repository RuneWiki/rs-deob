import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class135 {

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "[[[I")
    private int[][][] field2094 = new int[2][2][4];

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "[[[I")
    private int[][][] field2097 = new int[2][2][4];

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "[I")
    private int[] field2098 = new int[2];

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "[I")
    public int[] field2100 = new int[2];

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "[[I")
    public static int[][] field2095 = new int[2][8];

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "[[F")
    private static float[][] field2101 = new float[2][8];

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "F")
    private static float field2096;

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(F)F", line = 7)
    private static final float method981(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIF)F", line = 13)
    private final float method982(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2097[arg0][1][arg1] - this.field2097[arg0][0][arg1]) * arg2 + (float) this.field2097[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IF)I", line = 19)
    public final int method983(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field2098[1] - this.field2098[0]) * arg1 + (float) this.field2098[0];
            float var4 = var3 * 0.0030517578F;
            field2096 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field2099 = (int) (field2096 * 65536.0F);
        }
        if (this.field2100[arg0] == 0) {
            return 0;
        }
        float var5 = this.method982(arg0, 0, arg1);
        field2101[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method986(arg0, 0, arg1));
        field2101[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field2100[arg0]; var6++) {
            float var9 = this.method982(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method986(arg0, var6, arg1));
            float var11 = var9 * var9;
            field2101[arg0][var6 * 2 + 1] = field2101[arg0][var6 * 2 - 1] * var11;
            field2101[arg0][var6 * 2] = field2101[arg0][var6 * 2 - 1] * var10 + field2101[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field2101[arg0][var12] += field2101[arg0][var12 - 1] * var10 + field2101[arg0][var12 - 2] * var11;
            }
            field2101[arg0][1] += field2101[arg0][0] * var10 + var11;
            field2101[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field2100[0] * 2; var7++) {
                field2101[0][var7] *= field2096;
            }
        }
        for (int var8 = 0; var8 < this.field2100[arg0] * 2; var8++) {
            field2095[arg0][var8] = (int) (field2101[arg0][var8] * 65536.0F);
        }
        return this.field2100[arg0] * 2;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "()V", line = 81)
    public static void method984() {
        field2101 = null;
        field2095 = null;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lwn;Law;)V", line = 90)
    public final void method985(class519 arg0, class54 arg1) {
        int var3 = arg0.method3072((byte) -123);
        this.field2100[0] = var3 >> 4;
        this.field2100[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field2098[0] = this.field2098[1] = 0;
            return;
        }
        this.field2098[0] = arg0.method3018(566990904);
        this.field2098[1] = arg0.method3018(566990904);
        int var4 = arg0.method3072((byte) -123);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field2100[var5]; var8++) {
                this.field2094[var5][0][var8] = arg0.method3018(566990904);
                this.field2097[var5][0][var8] = arg0.method3018(566990904);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field2100[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field2094[var6][1][var7] = this.field2094[var6][0][var7];
                    this.field2097[var6][1][var7] = this.field2097[var6][0][var7];
                } else {
                    this.field2094[var6][1][var7] = arg0.method3018(566990904);
                    this.field2097[var6][1][var7] = arg0.method3018(566990904);
                }
            }
        }
        if (var4 != 0 || this.field2098[1] != this.field2098[0]) {
            arg1.method472(arg0);
        }
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(IIF)F", line = 157)
    private final float method986(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2094[arg0][1][arg1] - this.field2094[arg0][0][arg1]) * arg2 + (float) this.field2094[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method981(var5);
    }
}
