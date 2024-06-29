import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class381 {

    @OriginalMember(owner = "client!ur", name = "e", descriptor = "[[[I")
    private int[][][] field5375 = new int[2][2][4];

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "[I")
    public int[] field5372 = new int[2];

    @OriginalMember(owner = "client!ur", name = "g", descriptor = "[[[I")
    private int[][][] field5377 = new int[2][2][4];

    @OriginalMember(owner = "client!ur", name = "f", descriptor = "[I")
    private int[] field5376 = new int[2];

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "[[I")
    public static int[][] field5371 = new int[2][8];

    @OriginalMember(owner = "client!ur", name = "h", descriptor = "[[F")
    private static float[][] field5378 = new float[2][8];

    @OriginalMember(owner = "client!ur", name = "d", descriptor = "F")
    private static float field5374;

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "I")
    public static int field5373;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIF)F")
    private final float method2213(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field5377[arg0][1][arg1] - this.field5377[arg0][0][arg1]) * arg2 + (float) this.field5377[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IF)I")
    public final int method2214(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field5376[1] - this.field5376[0]) * arg1 + (float) this.field5376[0];
            float var4 = var3 * 0.0030517578F;
            field5374 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field5373 = (int) (field5374 * 65536.0F);
        }
        if (this.field5372[arg0] == 0) {
            return 0;
        }
        float var5 = this.method2213(arg0, 0, arg1);
        field5378[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method2218(arg0, 0, arg1));
        field5378[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field5372[arg0]; var6++) {
            float var9 = this.method2213(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method2218(arg0, var6, arg1));
            float var11 = var9 * var9;
            field5378[arg0][var6 * 2 + 1] = field5378[arg0][var6 * 2 - 1] * var11;
            field5378[arg0][var6 * 2] = field5378[arg0][var6 * 2 - 1] * var10 + field5378[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field5378[arg0][var12] += field5378[arg0][var12 - 1] * var10 + field5378[arg0][var12 - 2] * var11;
            }
            field5378[arg0][1] += field5378[arg0][0] * var10 + var11;
            field5378[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field5372[0] * 2; var7++) {
                field5378[0][var7] *= field5374;
            }
        }
        for (int var8 = 0; var8 < this.field5372[arg0] * 2; var8++) {
            field5371[arg0][var8] = (int) (field5378[arg0][var8] * 65536.0F);
        }
        return this.field5372[arg0] * 2;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "()V")
    public static void method2215() {
        field5378 = null;
        field5371 = null;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(F)F")
    private static final float method2216(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lwm;Ljk;)V")
    public final void method2217(class403 arg0, class456 arg1) {
        int var3 = arg0.method2357((byte) 117);
        this.field5372[0] = var3 >> 4;
        this.field5372[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field5376[0] = this.field5376[1] = 0;
            return;
        }
        this.field5376[0] = arg0.method2338(0);
        this.field5376[1] = arg0.method2338(0);
        int var4 = arg0.method2357((byte) 104);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field5372[var5]; var8++) {
                this.field5375[var5][0][var8] = arg0.method2338(0);
                this.field5377[var5][0][var8] = arg0.method2338(0);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field5372[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field5375[var6][1][var7] = this.field5375[var6][0][var7];
                    this.field5377[var6][1][var7] = this.field5377[var6][0][var7];
                } else {
                    this.field5375[var6][1][var7] = arg0.method2338(0);
                    this.field5377[var6][1][var7] = arg0.method2338(0);
                }
            }
        }
        if (var4 != 0 || this.field5376[1] != this.field5376[0]) {
            arg1.method2671(arg0);
        }
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(IIF)F")
    private final float method2218(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field5375[arg0][1][arg1] - this.field5375[arg0][0][arg1]) * arg2 + (float) this.field5375[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method2216(var5);
    }
}
