import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class362 {

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "[[[I")
    private int[][][] field5535 = new int[2][2][4];

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "[I")
    public int[] field5534 = new int[2];

    @OriginalMember(owner = "client!jr", name = "e", descriptor = "[[[I")
    private int[][][] field5536 = new int[2][2][4];

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "[I")
    private int[] field5533 = new int[2];

    @OriginalMember(owner = "client!jr", name = "g", descriptor = "[[I")
    public static int[][] field5538 = new int[2][8];

    @OriginalMember(owner = "client!jr", name = "f", descriptor = "[[F")
    private static float[][] field5537 = new float[2][8];

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "F")
    private static float field5532;

    @OriginalMember(owner = "client!jr", name = "h", descriptor = "I")
    public static int field5539;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IF)I", line = 6)
    public final int method2159(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field5533[1] - this.field5533[0]) * arg1 + (float) this.field5533[0];
            float var4 = var3 * 0.0030517578F;
            field5532 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field5539 = (int) (field5532 * 65536.0F);
        }
        if (this.field5534[arg0] == 0) {
            return 0;
        }
        float var5 = this.method2163(arg0, 0, arg1);
        field5537[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method2161(arg0, 0, arg1));
        field5537[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field5534[arg0]; var6++) {
            float var9 = this.method2163(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method2161(arg0, var6, arg1));
            float var11 = var9 * var9;
            field5537[arg0][var6 * 2 + 1] = field5537[arg0][var6 * 2 - 1] * var11;
            field5537[arg0][var6 * 2] = field5537[arg0][var6 * 2 - 1] * var10 + field5537[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field5537[arg0][var12] += field5537[arg0][var12 - 1] * var10 + field5537[arg0][var12 - 2] * var11;
            }
            field5537[arg0][1] += field5537[arg0][0] * var10 + var11;
            field5537[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field5534[0] * 2; var7++) {
                field5537[0][var7] *= field5532;
            }
        }
        for (int var8 = 0; var8 < this.field5534[arg0] * 2; var8++) {
            field5538[arg0][var8] = (int) (field5537[arg0][var8] * 65536.0F);
        }
        return this.field5534[arg0] * 2;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(Lgk;Lan;)V", line = 67)
    public final void method2160(class468 arg0, class185 arg1) {
        int var3 = arg0.method2765(114);
        this.field5534[0] = var3 >> 4;
        this.field5534[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field5533[0] = this.field5533[1] = 0;
            return;
        }
        this.field5533[0] = arg0.method2727((byte) 43);
        this.field5533[1] = arg0.method2727((byte) 43);
        int var4 = arg0.method2765(68);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field5534[var5]; var8++) {
                this.field5536[var5][0][var8] = arg0.method2727((byte) 43);
                this.field5535[var5][0][var8] = arg0.method2727((byte) 43);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field5534[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field5536[var6][1][var7] = this.field5536[var6][0][var7];
                    this.field5535[var6][1][var7] = this.field5535[var6][0][var7];
                } else {
                    this.field5536[var6][1][var7] = arg0.method2727((byte) 43);
                    this.field5535[var6][1][var7] = arg0.method2727((byte) 43);
                }
            }
        }
        if (var4 != 0 || this.field5533[1] != this.field5533[0]) {
            arg1.method1256(arg0);
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIF)F", line = 136)
    private final float method2161(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field5536[arg0][1][arg1] - this.field5536[arg0][0][arg1]) * arg2 + (float) this.field5536[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method2162(var5);
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(F)F", line = 144)
    private static final float method2162(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(IIF)F", line = 159)
    private final float method2163(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field5535[arg0][1][arg1] - this.field5535[arg0][0][arg1]) * arg2 + (float) this.field5535[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "()V", line = 168)
    public static void method2164() {
        field5537 = null;
        field5538 = null;
    }
}
