import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("bc")
public class Filter {

    @OriginalMember(owner = "bc", name = "a", descriptor = "Z")
    private boolean field906 = false;

    @OriginalMember(owner = "bc", name = "b", descriptor = "I")
    private int field907 = 45800;

    @OriginalMember(owner = "bc", name = "c", descriptor = "[I")
    public int[] field908 = new int[2];

    @OriginalMember(owner = "bc", name = "d", descriptor = "[[[I")
    public int[][][] field909 = new int[2][2][4];

    @OriginalMember(owner = "bc", name = "e", descriptor = "[[[I")
    public int[][][] field910 = new int[2][2][4];

    @OriginalMember(owner = "bc", name = "f", descriptor = "[I")
    public int[] field911 = new int[2];

    @OriginalMember(owner = "bc", name = "g", descriptor = "[[F")
    public static float[][] field912 = new float[2][8];

    @OriginalMember(owner = "bc", name = "h", descriptor = "[[I")
    public static int[][] field913 = new int[2][8];

    @OriginalMember(owner = "bc", name = "i", descriptor = "F")
    public static float field914;

    @OriginalMember(owner = "bc", name = "j", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "bc", name = "a", descriptor = "(IFZI)F")
    private float method313(int arg0, float arg1, boolean arg2, int arg3) {
        float var5 = (float) (this.field910[arg3][1][arg0] - this.field910[arg3][0][arg0]) * arg1 + (float) this.field910[arg3][0][arg0];
        float var6 = var5 * 0.0015258789F;
        if (arg2) {
            this.field906 = !this.field906;
        }
        return 1.0F - (float) Math.pow(10.0D, (double) (-var6 / 20.0F));
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(IF)F")
    private float method314(int arg0, float arg1) {
        float var3 = (float) Math.pow(2.0D, (double) arg1) * 32.703197F;
        if (this.field907 != arg0) {
            this.field907 = 74;
        }
        return var3 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(ZIIF)F")
    private float method315(boolean arg0, int arg1, int arg2, float arg3) {
        if (!arg0) {
            this.field907 = 430;
        }
        float var5 = (float) (this.field909[arg2][1][arg1] - this.field909[arg2][0][arg1]) * arg3 + (float) this.field909[arg2][0][arg1];
        float var6 = var5 * 1.2207031E-4F;
        return this.method314(45800, var6);
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(IIF)I")
    public int method316(int arg0, int arg1, float arg2) {
        if (arg1 == 0) {
            float var4 = (float) (this.field911[1] - this.field911[0]) * arg2 + (float) this.field911[0];
            float var5 = var4 * 0.0030517578F;
            field914 = (float) Math.pow(0.1D, (double) (var5 / 20.0F));
            field915 = (int) (field914 * 65536.0F);
        }
        if (this.field908[arg1] == 0) {
            return 0;
        }
        float var6 = this.method313(0, arg2, false, arg1);
        if (arg0 != 0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        field912[arg1][0] = var6 * -2.0F * (float) Math.cos((double) this.method315(true, 0, arg1, arg2));
        field912[arg1][1] = var6 * var6;
        for (int var8 = 1; var8 < this.field908[arg1]; var8++) {
            float var11 = this.method313(var8, arg2, false, arg1);
            float var12 = var11 * -2.0F * (float) Math.cos((double) this.method315(true, var8, arg1, arg2));
            float var13 = var11 * var11;
            field912[arg1][var8 * 2 + 1] = field912[arg1][var8 * 2 - 1] * var13;
            field912[arg1][var8 * 2] = field912[arg1][var8 * 2 - 1] * var12 + field912[arg1][var8 * 2 - 2] * var13;
            for (int var14 = var8 * 2 - 1; var14 >= 2; var14--) {
                field912[arg1][var14] += field912[arg1][var14 - 1] * var12 + field912[arg1][var14 - 2] * var13;
            }
            field912[arg1][1] += field912[arg1][0] * var12 + var13;
            field912[arg1][0] += var12;
        }
        if (arg1 == 0) {
            for (int var9 = 0; var9 < this.field908[0] * 2; var9++) {
                field912[0][var9] *= field914;
            }
        }
        for (int var10 = 0; var10 < this.field908[arg1] * 2; var10++) {
            field913[arg1][var10] = (int) (field912[arg1][var10] * 65536.0F);
        }
        return this.field908[arg1] * 2;
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(Lac;Llb;I)V")
    public final void method317(Envelope arg0, Packet arg1, int arg2) {
        int var4 = arg1.method229();
        if (arg2 != -45931) {
            return;
        }
        this.field908[0] = var4 >> 4;
        this.field908[1] = var4 & 0xF;
        if (var4 == 0) {
            this.field911[0] = this.field911[1] = 0;
            return;
        }
        this.field911[0] = arg1.method231();
        this.field911[1] = arg1.method231();
        int var5 = arg1.method229();
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var9 = 0; var9 < this.field908[var6]; var9++) {
                this.field909[var6][0][var9] = arg1.method231();
                this.field910[var6][0][var9] = arg1.method231();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field908[var7]; var8++) {
                if ((var5 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field909[var7][1][var8] = this.field909[var7][0][var8];
                    this.field910[var7][1][var8] = this.field910[var7][0][var8];
                } else {
                    this.field909[var7][1][var8] = arg1.method231();
                    this.field910[var7][1][var8] = arg1.method231();
                }
            }
        }
        if (var5 != 0 || this.field911[1] != this.field911[0]) {
            arg0.method310(arg1, 6);
        }
    }

    @OriginalMember(owner = "bc", name = "<init>", descriptor = "()V")
    public Filter() {
        if (Linkable.field362) {
        }
    }
}
