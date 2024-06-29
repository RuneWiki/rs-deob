import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class235 {

    @OriginalMember(owner = "client!km", name = "e", descriptor = "[[[I")
    private int[][][] field3255 = new int[2][2][4];

    @OriginalMember(owner = "client!km", name = "c", descriptor = "[[[I")
    private int[][][] field3253 = new int[2][2][4];

    @OriginalMember(owner = "client!km", name = "d", descriptor = "[I")
    private int[] field3254 = new int[2];

    @OriginalMember(owner = "client!km", name = "g", descriptor = "[I")
    public int[] field3257 = new int[2];

    @OriginalMember(owner = "client!km", name = "b", descriptor = "[[F")
    private static float[][] field3252 = new float[2][8];

    @OriginalMember(owner = "client!km", name = "f", descriptor = "[[I")
    public static int[][] field3256 = new int[2][8];

    @OriginalMember(owner = "client!km", name = "h", descriptor = "F")
    private static float field3258;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIF)F", line = 5)
    private final float method1368(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3253[arg0][1][arg1] - this.field3253[arg0][0][arg1]) * arg2 + (float) this.field3253[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1373(var5);
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Llh;Lbv;)V", line = 20)
    public final void method1369(class365 arg0, class199 arg1) {
        int var3 = arg0.method2099(255);
        this.field3257[0] = var3 >> 4;
        this.field3257[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field3254[0] = this.field3254[1] = 0;
            return;
        }
        this.field3254[0] = arg0.method2062((byte) 14);
        this.field3254[1] = arg0.method2062((byte) 14);
        int var4 = arg0.method2099(255);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field3257[var5]; var8++) {
                this.field3253[var5][0][var8] = arg0.method2062((byte) 14);
                this.field3255[var5][0][var8] = arg0.method2062((byte) 14);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field3257[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field3253[var6][1][var7] = this.field3253[var6][0][var7];
                    this.field3255[var6][1][var7] = this.field3255[var6][0][var7];
                } else {
                    this.field3253[var6][1][var7] = arg0.method2062((byte) 14);
                    this.field3255[var6][1][var7] = arg0.method2062((byte) 14);
                }
            }
        }
        if (var4 != 0 || this.field3254[1] != this.field3254[0]) {
            arg1.method1230(arg0);
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IF)I", line = 90)
    public final int method1370(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field3254[1] - this.field3254[0]) * arg1 + (float) this.field3254[0];
            float var4 = var3 * 0.0030517578F;
            field3258 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field3251 = (int) (field3258 * 65536.0F);
        }
        if (this.field3257[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1372(arg0, 0, arg1);
        field3252[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1368(arg0, 0, arg1));
        field3252[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field3257[arg0]; var6++) {
            float var9 = this.method1372(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method1368(arg0, var6, arg1));
            float var11 = var9 * var9;
            field3252[arg0][var6 * 2 + 1] = field3252[arg0][var6 * 2 - 1] * var11;
            field3252[arg0][var6 * 2] = field3252[arg0][var6 * 2 - 1] * var10 + field3252[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field3252[arg0][var12] += field3252[arg0][var12 - 1] * var10 + field3252[arg0][var12 - 2] * var11;
            }
            field3252[arg0][1] += field3252[arg0][0] * var10 + var11;
            field3252[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field3257[0] * 2; var7++) {
                field3252[0][var7] *= field3258;
            }
        }
        for (int var8 = 0; var8 < this.field3257[arg0] * 2; var8++) {
            field3256[arg0][var8] = (int) (field3252[arg0][var8] * 65536.0F);
        }
        return this.field3257[arg0] * 2;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "()V", line = 158)
    public static void method1371() {
        field3252 = null;
        field3256 = null;
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(IIF)F", line = 166)
    private final float method1372(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3255[arg0][1][arg1] - this.field3255[arg0][0][arg1]) * arg2 + (float) this.field3255[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(F)F", line = 175)
    private static final float method1373(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }
}
