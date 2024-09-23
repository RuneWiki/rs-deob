import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("bc")
public class Filter {

    @OriginalMember(owner = "bc", name = "a", descriptor = "[I")
    public int[] field896 = new int[2];

    @OriginalMember(owner = "bc", name = "b", descriptor = "[[[I")
    public int[][][] field897 = new int[2][2][4];

    @OriginalMember(owner = "bc", name = "c", descriptor = "[[[I")
    public int[][][] field898 = new int[2][2][4];

    @OriginalMember(owner = "bc", name = "d", descriptor = "[I")
    public int[] field899 = new int[2];

    @OriginalMember(owner = "bc", name = "e", descriptor = "[[F")
    public static float[][] field900 = new float[2][8];

    @OriginalMember(owner = "bc", name = "f", descriptor = "[[I")
    public static int[][] field901 = new int[2][8];

    @OriginalMember(owner = "bc", name = "g", descriptor = "F")
    public static float field902;

    @OriginalMember(owner = "bc", name = "h", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "bc", name = "a", descriptor = "(IIIF)F")
    private float method313(int arg0, int arg1, int arg2, float arg3) {
        if (arg2 != 48528) {
            throw new NullPointerException();
        }
        float var5 = (float) (this.field898[arg0][1][arg1] - this.field898[arg0][0][arg1]) * arg3 + (float) this.field898[arg0][0][arg1];
        float var6 = var5 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var6 / 20.0F));
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(FI)F")
    private float method314(float arg0, int arg1) {
        while (arg1 >= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        float var3 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var3 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(ZFII)F")
    private float method315(boolean arg0, float arg1, int arg2, int arg3) {
        if (arg0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        float var6 = (float) (this.field897[arg2][1][arg3] - this.field897[arg2][0][arg3]) * arg1 + (float) this.field897[arg2][0][arg3];
        float var7 = var6 * 1.2207031E-4F;
        return this.method314(var7, -541);
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(IIF)I")
    public int method316(int arg0, int arg1, float arg2) {
        if (arg0 == 0) {
            float var4 = (float) (this.field899[1] - this.field899[0]) * arg2 + (float) this.field899[0];
            float var5 = var4 * 0.0030517578F;
            field902 = (float) Math.pow(0.1D, (double) (var5 / 20.0F));
            field903 = (int) (field902 * 65536.0F);
        }
        if (this.field896[arg0] == 0) {
            return 0;
        }
        float var6 = this.method313(arg0, 0, 48528, arg2);
        if (arg1 != 3046) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        field900[arg0][0] = var6 * -2.0F * (float) Math.cos((double) this.method315(false, arg2, arg0, 0));
        field900[arg0][1] = var6 * var6;
        for (int var8 = 1; var8 < this.field896[arg0]; var8++) {
            float var11 = this.method313(arg0, var8, 48528, arg2);
            float var12 = var11 * -2.0F * (float) Math.cos((double) this.method315(false, arg2, arg0, var8));
            float var13 = var11 * var11;
            field900[arg0][var8 * 2 + 1] = field900[arg0][var8 * 2 - 1] * var13;
            field900[arg0][var8 * 2] = field900[arg0][var8 * 2 - 1] * var12 + field900[arg0][var8 * 2 - 2] * var13;
            for (int var14 = var8 * 2 - 1; var14 >= 2; var14--) {
                field900[arg0][var14] += field900[arg0][var14 - 1] * var12 + field900[arg0][var14 - 2] * var13;
            }
            field900[arg0][1] += field900[arg0][0] * var12 + var13;
            field900[arg0][0] += var12;
        }
        if (arg0 == 0) {
            for (int var9 = 0; var9 < this.field896[0] * 2; var9++) {
                field900[0][var9] *= field902;
            }
        }
        for (int var10 = 0; var10 < this.field896[arg0] * 2; var10++) {
            field901[arg0][var10] = (int) (field900[arg0][var10] * 65536.0F);
        }
        return this.field896[arg0] * 2;
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(ZLlb;Lac;)V")
    public final void method317(boolean arg0, Packet arg1, Envelope arg2) {
        if (!arg0) {
            return;
        }
        int var4 = arg1.method229();
        this.field896[0] = var4 >> 4;
        this.field896[1] = var4 & 0xF;
        if (var4 == 0) {
            this.field899[0] = this.field899[1] = 0;
            return;
        }
        this.field899[0] = arg1.method231();
        this.field899[1] = arg1.method231();
        int var5 = arg1.method229();
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var9 = 0; var9 < this.field896[var6]; var9++) {
                this.field897[var6][0][var9] = arg1.method231();
                this.field898[var6][0][var9] = arg1.method231();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field896[var7]; var8++) {
                if ((var5 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field897[var7][1][var8] = this.field897[var7][0][var8];
                    this.field898[var7][1][var8] = this.field898[var7][0][var8];
                } else {
                    this.field897[var7][1][var8] = arg1.method231();
                    this.field898[var7][1][var8] = arg1.method231();
                }
            }
        }
        if (var5 != 0 || this.field899[1] != this.field899[0]) {
            arg2.method310(arg1, true);
        }
    }
}
