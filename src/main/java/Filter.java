import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("bc")
public class Filter {

    @OriginalMember(owner = "bc", name = "a", descriptor = "Z")
    private boolean field899 = true;

    @OriginalMember(owner = "bc", name = "b", descriptor = "I")
    private int field900 = 6;

    @OriginalMember(owner = "bc", name = "c", descriptor = "[I")
    public int[] field901 = new int[2];

    @OriginalMember(owner = "bc", name = "d", descriptor = "[[[I")
    public int[][][] field902 = new int[2][2][4];

    @OriginalMember(owner = "bc", name = "e", descriptor = "[[[I")
    public int[][][] field903 = new int[2][2][4];

    @OriginalMember(owner = "bc", name = "f", descriptor = "[I")
    public int[] field904 = new int[2];

    @OriginalMember(owner = "bc", name = "g", descriptor = "[[F")
    public static float[][] field905 = new float[2][8];

    @OriginalMember(owner = "bc", name = "h", descriptor = "[[I")
    public static int[][] field906 = new int[2][8];

    @OriginalMember(owner = "bc", name = "i", descriptor = "F")
    public static float field907;

    @OriginalMember(owner = "bc", name = "j", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "bc", name = "a", descriptor = "(IIIF)F")
    private float method313(int arg0, int arg1, int arg2, float arg3) {
        if (arg2 != 6) {
            throw new NullPointerException();
        }
        float var5 = (float) (this.field903[arg0][1][arg1] - this.field903[arg0][0][arg1]) * arg3 + (float) this.field903[arg0][0][arg1];
        float var6 = var5 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var6 / 20.0F));
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(FI)F")
    private float method314(float arg0, int arg1) {
        if (arg1 < 7 || arg1 > 7) {
            throw new NullPointerException();
        }
        float var3 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var3 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(FIIB)F")
    private float method315(float arg0, int arg1, int arg2, byte arg3) {
        float var5 = (float) (this.field902[arg2][1][arg1] - this.field902[arg2][0][arg1]) * arg0 + (float) this.field902[arg2][0][arg1];
        float var6 = var5 * 1.2207031E-4F;
        if (arg3 != -34) {
            this.field899 = !this.field899;
        }
        return this.method314(var6, 7);
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(FII)I")
    public int method316(float arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            float var4 = (float) (this.field904[1] - this.field904[0]) * arg0 + (float) this.field904[0];
            float var5 = var4 * 0.0030517578F;
            field907 = (float) Math.pow(0.1D, (double) (var5 / 20.0F));
            field908 = (int) (field907 * 65536.0F);
        }
        if (this.field901[arg2] == 0) {
            return 0;
        }
        float var6 = this.method313(arg2, 0, this.field900, arg0);
        field905[arg2][0] = var6 * -2.0F * (float) Math.cos((double) this.method315(arg0, 0, arg2, (byte) -34));
        field905[arg2][1] = var6 * var6;
        if (arg1 != 0) {
            return 0;
        }
        for (int var7 = 1; var7 < this.field901[arg2]; var7++) {
            float var10 = this.method313(arg2, var7, this.field900, arg0);
            float var11 = var10 * -2.0F * (float) Math.cos((double) this.method315(arg0, var7, arg2, (byte) -34));
            float var12 = var10 * var10;
            field905[arg2][var7 * 2 + 1] = field905[arg2][var7 * 2 - 1] * var12;
            field905[arg2][var7 * 2] = field905[arg2][var7 * 2 - 1] * var11 + field905[arg2][var7 * 2 - 2] * var12;
            for (int var13 = var7 * 2 - 1; var13 >= 2; var13--) {
                field905[arg2][var13] += field905[arg2][var13 - 1] * var11 + field905[arg2][var13 - 2] * var12;
            }
            field905[arg2][1] += field905[arg2][0] * var11 + var12;
            field905[arg2][0] += var11;
        }
        if (arg2 == 0) {
            for (int var8 = 0; var8 < this.field901[0] * 2; var8++) {
                field905[0][var8] *= field907;
            }
        }
        for (int var9 = 0; var9 < this.field901[arg2] * 2; var9++) {
            field906[arg2][var9] = (int) (field905[arg2][var9] * 65536.0F);
        }
        return this.field901[arg2] * 2;
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(Llb;Lac;I)V")
    public final void method317(Packet arg0, Envelope arg1, int arg2) {
        int var4 = arg0.method229();
        this.field901[0] = var4 >> 4;
        if (arg2 < 2 || arg2 > 2) {
            this.field899 = !this.field899;
        }
        this.field901[1] = var4 & 0xF;
        if (var4 == 0) {
            this.field904[0] = this.field904[1] = 0;
            if (Linkable.field368) {
            }
            return;
        }
        this.field904[0] = arg0.method231();
        this.field904[1] = arg0.method231();
        int var5 = arg0.method229();
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var9 = 0; var9 < this.field901[var6]; var9++) {
                this.field902[var6][0][var9] = arg0.method231();
                this.field903[var6][0][var9] = arg0.method231();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field901[var7]; var8++) {
                if ((var5 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field902[var7][1][var8] = this.field902[var7][0][var8];
                    this.field903[var7][1][var8] = this.field903[var7][0][var8];
                } else {
                    this.field902[var7][1][var8] = arg0.method231();
                    this.field903[var7][1][var8] = arg0.method231();
                }
            }
        }
        if (var5 != 0 || this.field904[1] != this.field904[0]) {
            arg1.method310(0, arg0);
        }
    }
}
