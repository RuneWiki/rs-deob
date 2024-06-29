import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class201 {

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "[[[I")
    private int[][][] field3395 = new int[2][2][4];

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "[I")
    public int[] field3393 = new int[2];

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "[[[I")
    private int[][][] field3396 = new int[2][2][4];

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "[I")
    private int[] field3398 = new int[2];

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "[[I")
    public static int[][] field3397 = new int[2][8];

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "[[F")
    private static float[][] field3399 = new float[2][8];

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "F")
    private static float field3394;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "()V", line = 4)
    public static void method1492() {
        field3399 = (float[][]) null;
        field3397 = (int[][]) null;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IF)I", line = 12)
    public final int method1493(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field3398[1] - this.field3398[0]) * arg1 + (float) this.field3398[0];
            float var4 = var3 * 0.0030517578F;
            field3394 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field3392 = (int) (field3394 * 65536.0F);
        }
        if (this.field3393[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1497(arg0, 0, arg1);
        field3399[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1495(arg0, 0, arg1));
        field3399[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field3393[arg0]; var6++) {
            float var7 = this.method1497(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1495(arg0, var6, arg1));
            float var9 = var7 * var7;
            field3399[arg0][var6 * 2 + 1] = field3399[arg0][var6 * 2 - 1] * var9;
            field3399[arg0][var6 * 2] = field3399[arg0][var6 * 2 - 1] * var8 + field3399[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field3399[arg0][var10] += field3399[arg0][var10 - 1] * var8 + field3399[arg0][var10 - 2] * var9;
            }
            field3399[arg0][1] += field3399[arg0][0] * var8 + var9;
            field3399[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field3393[0] * 2; var11++) {
                field3399[0][var11] *= field3394;
            }
        }
        for (int var12 = 0; var12 < this.field3393[arg0] * 2; var12++) {
            field3397[arg0][var12] = (int) (field3399[arg0][var12] * 65536.0F);
        }
        return this.field3393[arg0] * 2;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lja;Lpb;)V", line = 74)
    public final void method1494(class60 arg0, class71 arg1) {
        int var3 = arg0.method501(0);
        this.field3393[0] = var3 >> 4;
        this.field3393[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field3398[0] = this.field3398[1] = 0;
            return;
        }
        this.field3398[0] = arg0.method485((byte) -2);
        this.field3398[1] = arg0.method485((byte) -2);
        int var4 = arg0.method501(0);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field3393[var5]; var6++) {
                this.field3395[var5][0][var6] = arg0.method485((byte) -2);
                this.field3396[var5][0][var6] = arg0.method485((byte) -2);
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field3393[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field3395[var7][1][var8] = this.field3395[var7][0][var8];
                    this.field3396[var7][1][var8] = this.field3396[var7][0][var8];
                } else {
                    this.field3395[var7][1][var8] = arg0.method485((byte) -2);
                    this.field3396[var7][1][var8] = arg0.method485((byte) -2);
                }
            }
        }
        if (var4 != 0 || this.field3398[1] != this.field3398[0]) {
            arg1.method593(arg0);
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIF)F", line = 144)
    private final float method1495(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3395[arg0][1][arg1] - this.field3395[arg0][0][arg1]) * arg2 + (float) this.field3395[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1496(var5);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(F)F", line = 159)
    private static final float method1496(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(IIF)F", line = 174)
    private final float method1497(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3396[arg0][1][arg1] - this.field3396[arg0][0][arg1]) * arg2 + (float) this.field3396[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }
}
