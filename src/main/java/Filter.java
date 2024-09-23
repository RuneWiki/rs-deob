import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("bc")
public class Filter {

    @OriginalMember(owner = "bc", name = "b", descriptor = "Z")
    private boolean field902 = true;

    @OriginalMember(owner = "bc", name = "c", descriptor = "[I")
    public int[] field903 = new int[2];

    @OriginalMember(owner = "bc", name = "d", descriptor = "[[[I")
    public int[][][] field904 = new int[2][2][4];

    @OriginalMember(owner = "bc", name = "e", descriptor = "[[[I")
    public int[][][] field905 = new int[2][2][4];

    @OriginalMember(owner = "bc", name = "f", descriptor = "[I")
    public int[] field906 = new int[2];

    @OriginalMember(owner = "bc", name = "g", descriptor = "[[F")
    public static float[][] field907 = new float[2][8];

    @OriginalMember(owner = "bc", name = "h", descriptor = "[[I")
    public static int[][] field908 = new int[2][8];

    @OriginalMember(owner = "bc", name = "i", descriptor = "F")
    public static float field909;

    @OriginalMember(owner = "bc", name = "a", descriptor = "I")
    private int field901;

    @OriginalMember(owner = "bc", name = "j", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "bc", name = "a", descriptor = "(IIIF)F")
    private float method313(int arg0, int arg1, int arg2, float arg3) {
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        float var5 = (float) (this.field905[arg0][1][arg2] - this.field905[arg0][0][arg2]) * arg3 + (float) this.field905[arg0][0][arg2];
        float var6 = var5 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var6 / 20.0F));
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(BF)F")
    private float method314(byte arg0, float arg1) {
        float var3 = (float) Math.pow(2.0D, (double) arg1) * 32.703197F;
        if (arg0 != -13) {
            this.field901 = -443;
        }
        return var3 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(FIII)F")
    private float method315(float arg0, int arg1, int arg2, int arg3) {
        if (arg2 != -3031) {
            throw new NullPointerException();
        }
        float var5 = (float) (this.field904[arg1][1][arg3] - this.field904[arg1][0][arg3]) * arg0 + (float) this.field904[arg1][0][arg3];
        float var6 = var5 * 1.2207031E-4F;
        return this.method314((byte) -13, var6);
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(FIB)I")
    public int method316(float arg0, int arg1, byte arg2) {
        if (arg1 == 0) {
            float var4 = (float) (this.field906[1] - this.field906[0]) * arg0 + (float) this.field906[0];
            float var5 = var4 * 0.0030517578F;
            field909 = (float) Math.pow(0.1D, (double) (var5 / 20.0F));
            field910 = (int) (field909 * 65536.0F);
        }
        if (this.field903[arg1] == 0) {
            return 0;
        }
        float var6 = this.method313(arg1, 0, 0, arg0);
        field907[arg1][0] = var6 * -2.0F * (float) Math.cos((double) this.method315(arg0, arg1, -3031, 0));
        field907[arg1][1] = var6 * var6;
        for (int var7 = 1; var7 < this.field903[arg1]; var7++) {
            float var10 = this.method313(arg1, 0, var7, arg0);
            float var11 = var10 * -2.0F * (float) Math.cos((double) this.method315(arg0, arg1, -3031, var7));
            float var12 = var10 * var10;
            field907[arg1][var7 * 2 + 1] = field907[arg1][var7 * 2 - 1] * var12;
            field907[arg1][var7 * 2] = field907[arg1][var7 * 2 - 1] * var11 + field907[arg1][var7 * 2 - 2] * var12;
            for (int var13 = var7 * 2 - 1; var13 >= 2; var13--) {
                field907[arg1][var13] += field907[arg1][var13 - 1] * var11 + field907[arg1][var13 - 2] * var12;
            }
            field907[arg1][1] += field907[arg1][0] * var11 + var12;
            field907[arg1][0] += var11;
        }
        if (arg2 != 5) {
            return this.field901;
        }
        if (arg1 == 0) {
            for (int var8 = 0; var8 < this.field903[0] * 2; var8++) {
                field907[0][var8] *= field909;
            }
        }
        for (int var9 = 0; var9 < this.field903[arg1] * 2; var9++) {
            field908[arg1][var9] = (int) (field907[arg1][var9] * 65536.0F);
        }
        return this.field903[arg1] * 2;
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(ZLlb;Lac;)V")
    public final void method317(boolean arg0, Packet arg1, Envelope arg2) {
        int var4 = arg1.method229();
        this.field903[0] = var4 >> 4;
        this.field903[1] = var4 & 0xF;
        if (!arg0) {
            this.field902 = !this.field902;
        }
        if (var4 == 0) {
            this.field906[0] = this.field906[1] = 0;
            if (Linkable.field367) {
            }
            return;
        }
        this.field906[0] = arg1.method231();
        this.field906[1] = arg1.method231();
        int var5 = arg1.method229();
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var9 = 0; var9 < this.field903[var6]; var9++) {
                this.field904[var6][0][var9] = arg1.method231();
                this.field905[var6][0][var9] = arg1.method231();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field903[var7]; var8++) {
                if ((var5 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field904[var7][1][var8] = this.field904[var7][0][var8];
                    this.field905[var7][1][var8] = this.field905[var7][0][var8];
                } else {
                    this.field904[var7][1][var8] = arg1.method231();
                    this.field905[var7][1][var8] = arg1.method231();
                }
            }
        }
        if (var5 != 0 || this.field906[1] != this.field906[0]) {
            arg2.method310(arg1, true);
        }
    }
}
