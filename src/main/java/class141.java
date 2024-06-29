import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class141 {

    @OriginalMember(owner = "client!he", name = "c", descriptor = "[[[I")
    private int[][][] field2418 = new int[2][2][4];

    @OriginalMember(owner = "client!he", name = "b", descriptor = "[I")
    private int[] field2417 = new int[2];

    @OriginalMember(owner = "client!he", name = "f", descriptor = "[I")
    public int[] field2421 = new int[2];

    @OriginalMember(owner = "client!he", name = "h", descriptor = "[[[I")
    private int[][][] field2423 = new int[2][2][4];

    @OriginalMember(owner = "client!he", name = "a", descriptor = "[[I")
    public static int[][] field2416 = new int[2][8];

    @OriginalMember(owner = "client!he", name = "e", descriptor = "[[F")
    private static float[][] field2420 = new float[2][8];

    @OriginalMember(owner = "client!he", name = "g", descriptor = "F")
    private static float field2422;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "I")
    public static int field2419;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "()V")
    public static void method994() {
        field2420 = null;
        field2416 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIF)F")
    private final float method995(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2423[arg0][1][arg1] - this.field2423[arg0][0][arg1]) * arg2 + (float) this.field2423[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(F)F")
    private static final float method996(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lva;Lil;)V")
    public final void method997(class187 arg0, class3 arg1) {
        int var3 = arg0.method1268(255);
        this.field2421[0] = var3 >> 4;
        this.field2421[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field2417[0] = this.field2417[1] = 0;
            return;
        }
        this.field2417[0] = arg0.method1244(false);
        this.field2417[1] = arg0.method1244(false);
        int var4 = arg0.method1268(255);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field2421[var5]; var8++) {
                this.field2418[var5][0][var8] = arg0.method1244(false);
                this.field2423[var5][0][var8] = arg0.method1244(false);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field2421[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field2418[var6][1][var7] = this.field2418[var6][0][var7];
                    this.field2423[var6][1][var7] = this.field2423[var6][0][var7];
                } else {
                    this.field2418[var6][1][var7] = arg0.method1244(false);
                    this.field2423[var6][1][var7] = arg0.method1244(false);
                }
            }
        }
        if (var4 != 0 || this.field2417[1] != this.field2417[0]) {
            arg1.method20(arg0);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IF)I")
    public final int method998(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field2417[1] - this.field2417[0]) * arg1 + (float) this.field2417[0];
            float var4 = var3 * 0.0030517578F;
            field2422 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field2419 = (int) (field2422 * 65536.0F);
        }
        if (this.field2421[arg0] == 0) {
            return 0;
        }
        float var5 = this.method995(arg0, 0, arg1);
        field2420[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method999(arg0, 0, arg1));
        field2420[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field2421[arg0]; var6++) {
            float var9 = this.method995(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method999(arg0, var6, arg1));
            float var11 = var9 * var9;
            field2420[arg0][var6 * 2 + 1] = field2420[arg0][var6 * 2 - 1] * var11;
            field2420[arg0][var6 * 2] = field2420[arg0][var6 * 2 - 1] * var10 + field2420[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field2420[arg0][var12] += field2420[arg0][var12 - 1] * var10 + field2420[arg0][var12 - 2] * var11;
            }
            field2420[arg0][1] += field2420[arg0][0] * var10 + var11;
            field2420[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field2421[0] * 2; var7++) {
                field2420[0][var7] *= field2422;
            }
        }
        for (int var8 = 0; var8 < this.field2421[arg0] * 2; var8++) {
            field2416[arg0][var8] = (int) (field2420[arg0][var8] * 65536.0F);
        }
        return this.field2421[arg0] * 2;
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(IIF)F")
    private final float method999(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2418[arg0][1][arg1] - this.field2418[arg0][0][arg1]) * arg2 + (float) this.field2418[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method996(var5);
    }
}
