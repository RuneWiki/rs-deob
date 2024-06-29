import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class102 {

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "[[[I")
    private int[][][] field2185 = new int[2][2][4];

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "[I")
    public int[] field2190 = new int[2];

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "[[[I")
    private int[][][] field2189 = new int[2][2][4];

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "[I")
    private int[] field2184 = new int[2];

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "[[F")
    private static float[][] field2186 = new float[2][8];

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "[[I")
    public static int[][] field2188 = new int[2][8];

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "F")
    private static float field2187;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(F)F")
    private static final float method717(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIF)F")
    private final float method718(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2185[arg0][1][arg1] - this.field2185[arg0][0][arg1]) * arg2 + (float) this.field2185[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(IIF)F")
    private final float method719(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2189[arg0][1][arg1] - this.field2189[arg0][0][arg1]) * arg2 + (float) this.field2189[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method717(var5);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IF)I")
    public final int method720(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field2184[1] - this.field2184[0]) * arg1 + (float) this.field2184[0];
            float var4 = var3 * 0.0030517578F;
            field2187 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field2191 = (int) (field2187 * 65536.0F);
        }
        if (this.field2190[arg0] == 0) {
            return 0;
        }
        float var5 = this.method718(arg0, 0, arg1);
        field2186[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method719(arg0, 0, arg1));
        field2186[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field2190[arg0]; var6++) {
            float var9 = this.method718(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method719(arg0, var6, arg1));
            float var11 = var9 * var9;
            field2186[arg0][var6 * 2 + 1] = field2186[arg0][var6 * 2 - 1] * var11;
            field2186[arg0][var6 * 2] = field2186[arg0][var6 * 2 - 1] * var10 + field2186[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field2186[arg0][var12] += field2186[arg0][var12 - 1] * var10 + field2186[arg0][var12 - 2] * var11;
            }
            field2186[arg0][1] += field2186[arg0][0] * var10 + var11;
            field2186[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field2190[0] * 2; var7++) {
                field2186[0][var7] *= field2187;
            }
        }
        for (int var8 = 0; var8 < this.field2190[arg0] * 2; var8++) {
            field2188[arg0][var8] = (int) (field2186[arg0][var8] * 65536.0F);
        }
        return this.field2190[arg0] * 2;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "()V")
    public static void method721() {
        field2186 = null;
        field2188 = null;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lud;Lge;)V")
    public final void method722(class119 arg0, class41 arg1) {
        int var3 = arg0.method879((byte) 45);
        this.field2190[0] = var3 >> 4;
        this.field2190[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field2184[0] = this.field2184[1] = 0;
            return;
        }
        this.field2184[0] = arg0.method903(2);
        this.field2184[1] = arg0.method903(2);
        int var4 = arg0.method879((byte) 45);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field2190[var5]; var8++) {
                this.field2189[var5][0][var8] = arg0.method903(2);
                this.field2185[var5][0][var8] = arg0.method903(2);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field2190[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field2189[var6][1][var7] = this.field2189[var6][0][var7];
                    this.field2185[var6][1][var7] = this.field2185[var6][0][var7];
                } else {
                    this.field2189[var6][1][var7] = arg0.method903(2);
                    this.field2185[var6][1][var7] = arg0.method903(2);
                }
            }
        }
        if (var4 != 0 || this.field2184[1] != this.field2184[0]) {
            arg1.method322(arg0);
        }
    }
}
