import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class146 {

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "[I")
    public int[] field2271 = new int[2];

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "[[[I")
    private int[][][] field2273 = new int[2][2][4];

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "[[[I")
    private int[][][] field2270 = new int[2][2][4];

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "[I")
    private int[] field2269 = new int[2];

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "[[F")
    private static float[][] field2272 = new float[2][8];

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "[[I")
    public static int[][] field2274 = new int[2][8];

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "F")
    private static float field2268;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIF)F", line = 4)
    private final float method1006(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2270[arg0][1][arg1] - this.field2270[arg0][0][arg1]) * arg2 + (float) this.field2270[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lj;Lr;)V", line = 11)
    public final void method1007(class153 arg0, class243 arg1) {
        int var3 = arg0.method1042((byte) 89);
        this.field2271[0] = var3 >> 4;
        this.field2271[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field2269[0] = this.field2269[1] = 0;
            return;
        }
        this.field2269[0] = arg0.method1069(44);
        this.field2269[1] = arg0.method1069(113);
        int var4 = arg0.method1042((byte) 87);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field2271[var5]; var6++) {
                this.field2273[var5][0][var6] = arg0.method1069(84);
                this.field2270[var5][0][var6] = arg0.method1069(49);
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field2271[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field2273[var7][1][var8] = this.field2273[var7][0][var8];
                    this.field2270[var7][1][var8] = this.field2270[var7][0][var8];
                } else {
                    this.field2273[var7][1][var8] = arg0.method1069(97);
                    this.field2270[var7][1][var8] = arg0.method1069(118);
                }
            }
        }
        if (var4 != 0 || this.field2269[1] != this.field2269[0]) {
            arg1.method1676(arg0);
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(IIF)F", line = 77)
    private final float method1008(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2273[arg0][1][arg1] - this.field2273[arg0][0][arg1]) * arg2 + (float) this.field2273[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1011(var5);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IF)I", line = 106)
    public final int method1009(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field2269[1] - this.field2269[0]) * arg1 + (float) this.field2269[0];
            float var4 = var3 * 0.0030517578F;
            field2268 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field2275 = (int) (field2268 * 65536.0F);
        }
        if (this.field2271[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1006(arg0, 0, arg1);
        field2272[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1008(arg0, 0, arg1));
        field2272[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field2271[arg0]; var6++) {
            float var7 = this.method1006(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1008(arg0, var6, arg1));
            float var9 = var7 * var7;
            field2272[arg0][var6 * 2 + 1] = field2272[arg0][var6 * 2 - 1] * var9;
            field2272[arg0][var6 * 2] = field2272[arg0][var6 * 2 - 1] * var8 + field2272[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field2272[arg0][var10] += field2272[arg0][var10 - 1] * var8 + field2272[arg0][var10 - 2] * var9;
            }
            field2272[arg0][1] += field2272[arg0][0] * var8 + var9;
            field2272[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field2271[0] * 2; var11++) {
                field2272[0][var11] *= field2268;
            }
        }
        for (int var12 = 0; var12 < this.field2271[arg0] * 2; var12++) {
            field2274[arg0][var12] = (int) (field2272[arg0][var12] * 65536.0F);
        }
        return this.field2271[arg0] * 2;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "()V", line = 168)
    public static void method1010() {
        field2272 = (float[][]) null;
        field2274 = (int[][]) null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(F)F", line = 174)
    private static final float method1011(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }
}
