import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("bc")
public class Filter {

    @OriginalMember(owner = "bc", name = "a", descriptor = "Z")
    private boolean field898 = false;

    @OriginalMember(owner = "bc", name = "b", descriptor = "I")
    private int field899 = 2972;

    @OriginalMember(owner = "bc", name = "c", descriptor = "[I")
    public int[] field900 = new int[2];

    @OriginalMember(owner = "bc", name = "d", descriptor = "[[[I")
    public int[][][] field901 = new int[2][2][4];

    @OriginalMember(owner = "bc", name = "e", descriptor = "[[[I")
    public int[][][] field902 = new int[2][2][4];

    @OriginalMember(owner = "bc", name = "f", descriptor = "[I")
    public int[] field903 = new int[2];

    @OriginalMember(owner = "bc", name = "g", descriptor = "[[F")
    public static float[][] field904 = new float[2][8];

    @OriginalMember(owner = "bc", name = "h", descriptor = "[[I")
    public static int[][] field905 = new int[2][8];

    @OriginalMember(owner = "bc", name = "i", descriptor = "F")
    public static float field906;

    @OriginalMember(owner = "bc", name = "j", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "bc", name = "a", descriptor = "(IZFI)F")
    private float method311(int arg0, boolean arg1, float arg2, int arg3) {
        float var5 = (float) (this.field902[arg3][1][arg0] - this.field902[arg3][0][arg0]) * arg2 + (float) this.field902[arg3][0][arg0];
        float var6 = var5 * 0.0015258789F;
        if (!arg1) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        return 1.0F - (float) Math.pow(10.0D, (double) (-var6 / 20.0F));
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(IF)F")
    private float method312(int arg0, float arg1) {
        if (arg0 != 2972) {
            throw new NullPointerException();
        }
        float var3 = (float) Math.pow(2.0D, (double) arg1) * 32.703197F;
        return var3 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(IIIF)F")
    private float method313(int arg0, int arg1, int arg2, float arg3) {
        float var5 = (float) (this.field901[arg0][1][arg1] - this.field901[arg0][0][arg1]) * arg3 + (float) this.field901[arg0][0][arg1];
        float var6 = var5 * 1.2207031E-4F;
        if (arg2 != 9) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        return this.method312(this.field899, var6);
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(IIF)I")
    public int method314(int arg0, int arg1, float arg2) {
        if (arg0 == 0) {
            float var4 = (float) (this.field903[1] - this.field903[0]) * arg2 + (float) this.field903[0];
            float var5 = var4 * 0.0030517578F;
            field906 = (float) Math.pow(0.1D, (double) (var5 / 20.0F));
            field907 = (int) (field906 * 65536.0F);
        }
        if (this.field900[arg0] == 0) {
            return 0;
        }
        float var6 = this.method311(0, true, arg2, arg0);
        field904[arg0][0] = var6 * -2.0F * (float) Math.cos((double) this.method313(arg0, 0, 9, arg2));
        if (arg1 != 0) {
            this.field898 = !this.field898;
        }
        field904[arg0][1] = var6 * var6;
        for (int var7 = 1; var7 < this.field900[arg0]; var7++) {
            float var10 = this.method311(var7, true, arg2, arg0);
            float var11 = var10 * -2.0F * (float) Math.cos((double) this.method313(arg0, var7, 9, arg2));
            float var12 = var10 * var10;
            field904[arg0][var7 * 2 + 1] = field904[arg0][var7 * 2 - 1] * var12;
            field904[arg0][var7 * 2] = field904[arg0][var7 * 2 - 1] * var11 + field904[arg0][var7 * 2 - 2] * var12;
            for (int var13 = var7 * 2 - 1; var13 >= 2; var13--) {
                field904[arg0][var13] += field904[arg0][var13 - 1] * var11 + field904[arg0][var13 - 2] * var12;
            }
            field904[arg0][1] += field904[arg0][0] * var11 + var12;
            field904[arg0][0] += var11;
        }
        if (arg0 == 0) {
            for (int var8 = 0; var8 < this.field900[0] * 2; var8++) {
                field904[0][var8] *= field906;
            }
        }
        for (int var9 = 0; var9 < this.field900[arg0] * 2; var9++) {
            field905[arg0][var9] = (int) (field904[arg0][var9] * 65536.0F);
        }
        return this.field900[arg0] * 2;
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(ILac;Llb;)V")
    public final void method315(int arg0, Envelope arg1, Packet arg2) {
        if (arg0 <= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        int var5 = arg2.method227();
        this.field900[0] = var5 >> 4;
        this.field900[1] = var5 & 0xF;
        if (var5 == 0) {
            this.field903[0] = this.field903[1] = 0;
            return;
        }
        this.field903[0] = arg2.method229();
        this.field903[1] = arg2.method229();
        int var6 = arg2.method227();
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var10 = 0; var10 < this.field900[var7]; var10++) {
                this.field901[var7][0][var10] = arg2.method229();
                this.field902[var7][0][var10] = arg2.method229();
            }
        }
        for (int var8 = 0; var8 < 2; var8++) {
            for (int var9 = 0; var9 < this.field900[var8]; var9++) {
                if ((var6 & 0x1 << var8 * 4 << var9) == 0) {
                    this.field901[var8][1][var9] = this.field901[var8][0][var9];
                    this.field902[var8][1][var9] = this.field902[var8][0][var9];
                } else {
                    this.field901[var8][1][var9] = arg2.method229();
                    this.field902[var8][1][var9] = arg2.method229();
                }
            }
        }
        if (var6 != 0 || this.field903[1] != this.field903[0]) {
            arg1.method308(0, arg2);
        }
    }
}
