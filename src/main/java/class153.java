import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class153 {

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "[I")
    private int[] field2395 = new int[2];

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "[I")
    public int[] field2394 = new int[2];

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "[[[I")
    private int[][][] field2397 = new int[2][2][4];

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "[[[I")
    private int[][][] field2398 = new int[2][2][4];

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "[[F")
    private static float[][] field2393 = new float[2][8];

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "[[I")
    public static int[][] field2399 = new int[2][8];

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "F")
    private static float field2400;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lai;Lag;)V")
    public final void method1029(class88 arg0, class188 arg1) {
        int var3 = arg0.method633(103);
        this.field2394[0] = var3 >> 4;
        this.field2394[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field2395[0] = this.field2395[1] = 0;
            return;
        }
        this.field2395[0] = arg0.method645(11596);
        this.field2395[1] = arg0.method645(11596);
        int var4 = arg0.method633(55);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field2394[var5]; var8++) {
                this.field2397[var5][0][var8] = arg0.method645(11596);
                this.field2398[var5][0][var8] = arg0.method645(11596);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field2394[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field2397[var6][1][var7] = this.field2397[var6][0][var7];
                    this.field2398[var6][1][var7] = this.field2398[var6][0][var7];
                } else {
                    this.field2397[var6][1][var7] = arg0.method645(11596);
                    this.field2398[var6][1][var7] = arg0.method645(11596);
                }
            }
        }
        if (var4 != 0 || this.field2395[1] != this.field2395[0]) {
            arg1.method1271(arg0);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IF)I")
    public final int method1030(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field2395[1] - this.field2395[0]) * arg1 + (float) this.field2395[0];
            float var4 = var3 * 0.0030517578F;
            field2400 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field2396 = (int) (field2400 * 65536.0F);
        }
        if (this.field2394[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1031(arg0, 0, arg1);
        field2393[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1034(arg0, 0, arg1));
        field2393[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field2394[arg0]; var6++) {
            float var9 = this.method1031(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method1034(arg0, var6, arg1));
            float var11 = var9 * var9;
            field2393[arg0][var6 * 2 + 1] = field2393[arg0][var6 * 2 - 1] * var11;
            field2393[arg0][var6 * 2] = field2393[arg0][var6 * 2 - 1] * var10 + field2393[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field2393[arg0][var12] += field2393[arg0][var12 - 1] * var10 + field2393[arg0][var12 - 2] * var11;
            }
            field2393[arg0][1] += field2393[arg0][0] * var10 + var11;
            field2393[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field2394[0] * 2; var7++) {
                field2393[0][var7] *= field2400;
            }
        }
        for (int var8 = 0; var8 < this.field2394[arg0] * 2; var8++) {
            field2399[arg0][var8] = (int) (field2393[arg0][var8] * 65536.0F);
        }
        return this.field2394[arg0] * 2;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIF)F")
    private final float method1031(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2398[arg0][1][arg1] - this.field2398[arg0][0][arg1]) * arg2 + (float) this.field2398[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(F)F")
    private static final float method1032(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "()V")
    public static void method1033() {
        field2393 = null;
        field2399 = null;
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIF)F")
    private final float method1034(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2397[arg0][1][arg1] - this.field2397[arg0][0][arg1]) * arg2 + (float) this.field2397[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1032(var5);
    }
}
