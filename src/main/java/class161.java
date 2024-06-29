import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class161 {

    @OriginalMember(owner = "client!op", name = "g", descriptor = "[[[I")
    private int[][][] field2358 = new int[2][2][4];

    @OriginalMember(owner = "client!op", name = "c", descriptor = "[[[I")
    private int[][][] field2354 = new int[2][2][4];

    @OriginalMember(owner = "client!op", name = "f", descriptor = "[I")
    private int[] field2357 = new int[2];

    @OriginalMember(owner = "client!op", name = "h", descriptor = "[I")
    public int[] field2359 = new int[2];

    @OriginalMember(owner = "client!op", name = "b", descriptor = "[[F")
    private static float[][] field2353 = new float[2][8];

    @OriginalMember(owner = "client!op", name = "e", descriptor = "[[I")
    public static int[][] field2356 = new int[2][8];

    @OriginalMember(owner = "client!op", name = "a", descriptor = "F")
    private static float field2352;

    @OriginalMember(owner = "client!op", name = "d", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(Ldaa;Lec;)V")
    public final void method1032(class11 arg0, class198 arg1) {
        int var3 = arg0.method110((byte) 102);
        this.field2359[0] = var3 >> 4;
        this.field2359[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field2357[0] = this.field2357[1] = 0;
            return;
        }
        this.field2357[0] = arg0.method93((byte) 116);
        this.field2357[1] = arg0.method93((byte) 108);
        int var4 = arg0.method110((byte) 78);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field2359[var5]; var8++) {
                this.field2358[var5][0][var8] = arg0.method93((byte) 100);
                this.field2354[var5][0][var8] = arg0.method93((byte) 102);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field2359[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field2358[var6][1][var7] = this.field2358[var6][0][var7];
                    this.field2354[var6][1][var7] = this.field2354[var6][0][var7];
                } else {
                    this.field2358[var6][1][var7] = arg0.method93((byte) 94);
                    this.field2354[var6][1][var7] = arg0.method93((byte) 98);
                }
            }
        }
        if (var4 != 0 || this.field2357[1] != this.field2357[0]) {
            arg1.method1216(arg0);
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IF)I")
    public final int method1033(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field2357[1] - this.field2357[0]) * arg1 + (float) this.field2357[0];
            float var4 = var3 * 0.0030517578F;
            field2352 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field2355 = (int) (field2352 * 65536.0F);
        }
        if (this.field2359[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1035(arg0, 0, arg1);
        field2353[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1036(arg0, 0, arg1));
        field2353[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field2359[arg0]; var6++) {
            float var9 = this.method1035(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method1036(arg0, var6, arg1));
            float var11 = var9 * var9;
            field2353[arg0][var6 * 2 + 1] = field2353[arg0][var6 * 2 - 1] * var11;
            field2353[arg0][var6 * 2] = field2353[arg0][var6 * 2 - 1] * var10 + field2353[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field2353[arg0][var12] += field2353[arg0][var12 - 1] * var10 + field2353[arg0][var12 - 2] * var11;
            }
            field2353[arg0][1] += field2353[arg0][0] * var10 + var11;
            field2353[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field2359[0] * 2; var7++) {
                field2353[0][var7] *= field2352;
            }
        }
        for (int var8 = 0; var8 < this.field2359[arg0] * 2; var8++) {
            field2356[arg0][var8] = (int) (field2353[arg0][var8] * 65536.0F);
        }
        return this.field2359[arg0] * 2;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(F)F")
    private static final float method1034(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IIF)F")
    private final float method1035(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2354[arg0][1][arg1] - this.field2354[arg0][0][arg1]) * arg2 + (float) this.field2354[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(IIF)F")
    private final float method1036(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2358[arg0][1][arg1] - this.field2358[arg0][0][arg1]) * arg2 + (float) this.field2358[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1034(var5);
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "()V")
    public static void method1037() {
        field2353 = null;
        field2356 = null;
    }
}
