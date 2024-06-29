import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class224 {

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "[[[I")
    private int[][][] field3501 = new int[2][2][4];

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "[[[I")
    private int[][][] field3499 = new int[2][2][4];

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "[I")
    public int[] field3503 = new int[2];

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "[I")
    private int[] field3498 = new int[2];

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "[[F")
    private static float[][] field3502 = new float[2][8];

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "[[I")
    public static int[][] field3496 = new int[2][8];

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "F")
    private static float field3497;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIF)F")
    private final float method1585(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3501[arg0][1][arg1] - this.field3501[arg0][0][arg1]) * arg2 + (float) this.field3501[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1586(var5);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(F)F")
    private static final float method1586(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "()V")
    public static void method1587() {
        field3502 = null;
        field3496 = null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lim;Llg;)V")
    public final void method1588(class170 arg0, class116 arg1) {
        int var3 = arg0.method1218(63);
        this.field3503[0] = var3 >> 4;
        this.field3503[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field3498[0] = this.field3498[1] = 0;
            return;
        }
        this.field3498[0] = arg0.method1186((byte) -87);
        this.field3498[1] = arg0.method1186((byte) -111);
        int var4 = arg0.method1218(-108);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field3503[var5]; var8++) {
                this.field3501[var5][0][var8] = arg0.method1186((byte) -55);
                this.field3499[var5][0][var8] = arg0.method1186((byte) -36);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field3503[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field3501[var6][1][var7] = this.field3501[var6][0][var7];
                    this.field3499[var6][1][var7] = this.field3499[var6][0][var7];
                } else {
                    this.field3501[var6][1][var7] = arg0.method1186((byte) -68);
                    this.field3499[var6][1][var7] = arg0.method1186((byte) -99);
                }
            }
        }
        if (var4 != 0 || this.field3498[1] != this.field3498[0]) {
            arg1.method766(arg0);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IF)I")
    public final int method1589(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field3498[1] - this.field3498[0]) * arg1 + (float) this.field3498[0];
            float var4 = var3 * 0.0030517578F;
            field3497 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field3500 = (int) (field3497 * 65536.0F);
        }
        if (this.field3503[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1590(arg0, 0, arg1);
        field3502[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1585(arg0, 0, arg1));
        field3502[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field3503[arg0]; var6++) {
            float var9 = this.method1590(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method1585(arg0, var6, arg1));
            float var11 = var9 * var9;
            field3502[arg0][var6 * 2 + 1] = field3502[arg0][var6 * 2 - 1] * var11;
            field3502[arg0][var6 * 2] = field3502[arg0][var6 * 2 - 1] * var10 + field3502[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field3502[arg0][var12] += field3502[arg0][var12 - 1] * var10 + field3502[arg0][var12 - 2] * var11;
            }
            field3502[arg0][1] += field3502[arg0][0] * var10 + var11;
            field3502[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field3503[0] * 2; var7++) {
                field3502[0][var7] *= field3497;
            }
        }
        for (int var8 = 0; var8 < this.field3503[arg0] * 2; var8++) {
            field3496[arg0][var8] = (int) (field3502[arg0][var8] * 65536.0F);
        }
        return this.field3503[arg0] * 2;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(IIF)F")
    private final float method1590(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3499[arg0][1][arg1] - this.field3499[arg0][0][arg1]) * arg2 + (float) this.field3499[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }
}
