import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("bc")
public class Filter {

    @OriginalMember(owner = "bc", name = "a", descriptor = "Z")
    private boolean field891 = true;

    @OriginalMember(owner = "bc", name = "b", descriptor = "Z")
    private boolean field892 = true;

    @OriginalMember(owner = "bc", name = "c", descriptor = "[I")
    public int[] field893 = new int[2];

    @OriginalMember(owner = "bc", name = "d", descriptor = "[[[I")
    public int[][][] field894 = new int[2][2][4];

    @OriginalMember(owner = "bc", name = "e", descriptor = "[[[I")
    public int[][][] field895 = new int[2][2][4];

    @OriginalMember(owner = "bc", name = "f", descriptor = "[I")
    public int[] field896 = new int[2];

    @OriginalMember(owner = "bc", name = "g", descriptor = "[[F")
    public static float[][] field897 = new float[2][8];

    @OriginalMember(owner = "bc", name = "h", descriptor = "[[I")
    public static int[][] field898 = new int[2][8];

    @OriginalMember(owner = "bc", name = "i", descriptor = "F")
    public static float field899;

    @OriginalMember(owner = "bc", name = "j", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "bc", name = "a", descriptor = "(FZII)F")
    private float method309(float arg0, boolean arg1, int arg2, int arg3) {
        float var5 = (float) (this.field895[arg3][1][arg2] - this.field895[arg3][0][arg2]) * arg0 + (float) this.field895[arg3][0][arg2];
        if (!arg1) {
            throw new NullPointerException();
        }
        float var6 = var5 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var6 / 20.0F));
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(ZF)F")
    private float method310(boolean arg0, float arg1) {
        float var3 = (float) Math.pow(2.0D, (double) arg1) * 32.703197F;
        if (!arg0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        return var3 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(IIFI)F")
    private float method311(int arg0, int arg1, float arg2, int arg3) {
        float var5 = (float) (this.field894[arg1][1][arg0] - this.field894[arg1][0][arg0]) * arg2 + (float) this.field894[arg1][0][arg0];
        if (arg3 != -13943) {
            throw new NullPointerException();
        }
        float var6 = var5 * 1.2207031E-4F;
        return this.method310(true, var6);
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(IFZ)I")
    public int method312(int arg0, float arg1, boolean arg2) {
        if (!arg2) {
            this.field891 = !this.field891;
        }
        if (arg0 == 0) {
            float var4 = (float) (this.field896[1] - this.field896[0]) * arg1 + (float) this.field896[0];
            float var5 = var4 * 0.0030517578F;
            field899 = (float) Math.pow(0.1D, (double) (var5 / 20.0F));
            field900 = (int) (field899 * 65536.0F);
        }
        if (this.field893[arg0] == 0) {
            return 0;
        }
        float var6 = this.method309(arg1, true, 0, arg0);
        field897[arg0][0] = var6 * -2.0F * (float) Math.cos((double) this.method311(0, arg0, arg1, -13943));
        field897[arg0][1] = var6 * var6;
        for (int var7 = 1; var7 < this.field893[arg0]; var7++) {
            float var10 = this.method309(arg1, true, var7, arg0);
            float var11 = var10 * -2.0F * (float) Math.cos((double) this.method311(var7, arg0, arg1, -13943));
            float var12 = var10 * var10;
            field897[arg0][var7 * 2 + 1] = field897[arg0][var7 * 2 - 1] * var12;
            field897[arg0][var7 * 2] = field897[arg0][var7 * 2 - 1] * var11 + field897[arg0][var7 * 2 - 2] * var12;
            for (int var13 = var7 * 2 - 1; var13 >= 2; var13--) {
                field897[arg0][var13] += field897[arg0][var13 - 1] * var11 + field897[arg0][var13 - 2] * var12;
            }
            field897[arg0][1] += field897[arg0][0] * var11 + var12;
            field897[arg0][0] += var11;
        }
        if (arg0 == 0) {
            for (int var8 = 0; var8 < this.field893[0] * 2; var8++) {
                field897[0][var8] *= field899;
            }
        }
        for (int var9 = 0; var9 < this.field893[arg0] * 2; var9++) {
            field898[arg0][var9] = (int) (field897[arg0][var9] * 65536.0F);
        }
        return this.field893[arg0] * 2;
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(Lac;Llb;I)V")
    public final void method313(Envelope arg0, Packet arg1, int arg2) {
        int var4 = arg1.method225();
        this.field893[0] = var4 >> 4;
        this.field893[1] = var4 & 0xF;
        if (arg2 != 6454) {
            this.field892 = !this.field892;
        }
        if (var4 == 0) {
            this.field896[0] = this.field896[1] = 0;
            if (Linkable.field360) {
            }
            return;
        }
        this.field896[0] = arg1.method227();
        this.field896[1] = arg1.method227();
        int var5 = arg1.method225();
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var9 = 0; var9 < this.field893[var6]; var9++) {
                this.field894[var6][0][var9] = arg1.method227();
                this.field895[var6][0][var9] = arg1.method227();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field893[var7]; var8++) {
                if ((var5 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field894[var7][1][var8] = this.field894[var7][0][var8];
                    this.field895[var7][1][var8] = this.field895[var7][0][var8];
                } else {
                    this.field894[var7][1][var8] = arg1.method227();
                    this.field895[var7][1][var8] = arg1.method227();
                }
            }
        }
        if (var5 != 0 || this.field896[1] != this.field896[0]) {
            arg0.method306(0, arg1);
        }
    }
}
