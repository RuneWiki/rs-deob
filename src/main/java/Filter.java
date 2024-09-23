import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("bc")
public class Filter {

    @OriginalMember(owner = "bc", name = "a", descriptor = "Z")
    private boolean field900 = true;

    @OriginalMember(owner = "bc", name = "b", descriptor = "Z")
    private boolean field901 = true;

    @OriginalMember(owner = "bc", name = "c", descriptor = "[I")
    public int[] field902 = new int[2];

    @OriginalMember(owner = "bc", name = "d", descriptor = "[[[I")
    public int[][][] field903 = new int[2][2][4];

    @OriginalMember(owner = "bc", name = "e", descriptor = "[[[I")
    public int[][][] field904 = new int[2][2][4];

    @OriginalMember(owner = "bc", name = "f", descriptor = "[I")
    public int[] field905 = new int[2];

    @OriginalMember(owner = "bc", name = "g", descriptor = "[[F")
    public static float[][] field906 = new float[2][8];

    @OriginalMember(owner = "bc", name = "h", descriptor = "[[I")
    public static int[][] field907 = new int[2][8];

    @OriginalMember(owner = "bc", name = "i", descriptor = "F")
    public static float field908;

    @OriginalMember(owner = "bc", name = "j", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "bc", name = "a", descriptor = "(IIIF)F")
    private float method313(int arg0, int arg1, int arg2, float arg3) {
        float var5 = (float) (this.field904[arg1][1][arg2] - this.field904[arg1][0][arg2]) * arg3 + (float) this.field904[arg1][0][arg2];
        float var6 = var5 * 0.0015258789F;
        if (arg0 != 0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        return 1.0F - (float) Math.pow(10.0D, (double) (-var6 / 20.0F));
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(FZ)F")
    private float method314(float arg0, boolean arg1) {
        float var3 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        if (!arg1) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        return var3 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(IIZF)F")
    private float method315(int arg0, int arg1, boolean arg2, float arg3) {
        if (!arg2) {
            throw new NullPointerException();
        }
        float var5 = (float) (this.field903[arg0][1][arg1] - this.field903[arg0][0][arg1]) * arg3 + (float) this.field903[arg0][0][arg1];
        float var6 = var5 * 1.2207031E-4F;
        return this.method314(var6, this.field900);
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(IIF)I")
    public int method316(int arg0, int arg1, float arg2) {
        if (arg1 == 0) {
            float var4 = (float) (this.field905[1] - this.field905[0]) * arg2 + (float) this.field905[0];
            float var5 = var4 * 0.0030517578F;
            field908 = (float) Math.pow(0.1D, (double) (var5 / 20.0F));
            field909 = (int) (field908 * 65536.0F);
        }
        if (this.field902[arg1] == 0) {
            return 0;
        }
        float var6 = this.method313(0, arg1, 0, arg2);
        field906[arg1][0] = var6 * -2.0F * (float) Math.cos((double) this.method315(arg1, 0, this.field901, arg2));
        field906[arg1][1] = var6 * var6;
        while (arg0 >= 0) {
            for (int var14 = 1; var14 > 0; var14++) {
            }
        }
        for (int var7 = 1; var7 < this.field902[arg1]; var7++) {
            float var10 = this.method313(0, arg1, var7, arg2);
            float var11 = var10 * -2.0F * (float) Math.cos((double) this.method315(arg1, var7, this.field901, arg2));
            float var12 = var10 * var10;
            field906[arg1][var7 * 2 + 1] = field906[arg1][var7 * 2 - 1] * var12;
            field906[arg1][var7 * 2] = field906[arg1][var7 * 2 - 1] * var11 + field906[arg1][var7 * 2 - 2] * var12;
            for (int var13 = var7 * 2 - 1; var13 >= 2; var13--) {
                field906[arg1][var13] += field906[arg1][var13 - 1] * var11 + field906[arg1][var13 - 2] * var12;
            }
            field906[arg1][1] += field906[arg1][0] * var11 + var12;
            field906[arg1][0] += var11;
        }
        if (arg1 == 0) {
            for (int var8 = 0; var8 < this.field902[0] * 2; var8++) {
                field906[0][var8] *= field908;
            }
        }
        for (int var9 = 0; var9 < this.field902[arg1] * 2; var9++) {
            field907[arg1][var9] = (int) (field906[arg1][var9] * 65536.0F);
        }
        return this.field902[arg1] * 2;
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(Lac;BLlb;)V")
    public final void method317(Envelope arg0, byte arg1, Packet arg2) {
        int var4 = arg2.method229();
        this.field902[0] = var4 >> 4;
        this.field902[1] = var4 & 0xF;
        if (arg1 != 0) {
            return;
        }
        if (var4 == 0) {
            this.field905[0] = this.field905[1] = 0;
            return;
        }
        this.field905[0] = arg2.method231();
        this.field905[1] = arg2.method231();
        int var5 = arg2.method229();
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var9 = 0; var9 < this.field902[var6]; var9++) {
                this.field903[var6][0][var9] = arg2.method231();
                this.field904[var6][0][var9] = arg2.method231();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field902[var7]; var8++) {
                if ((var5 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field903[var7][1][var8] = this.field903[var7][0][var8];
                    this.field904[var7][1][var8] = this.field904[var7][0][var8];
                } else {
                    this.field903[var7][1][var8] = arg2.method231();
                    this.field904[var7][1][var8] = arg2.method231();
                }
            }
        }
        if (var5 != 0 || this.field905[1] != this.field905[0]) {
            arg0.method310(-977, arg2);
        }
    }

    @OriginalMember(owner = "bc", name = "<init>", descriptor = "()V")
    public Filter() {
        if (Linkable.field368) {
        }
    }
}
