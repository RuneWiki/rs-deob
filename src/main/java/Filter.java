import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("cc")
public class Filter {

    @OriginalMember(owner = "cc", name = "a", descriptor = "Z")
    private boolean field899 = false;

    @OriginalMember(owner = "cc", name = "b", descriptor = "Z")
    private boolean field900 = false;

    @OriginalMember(owner = "cc", name = "c", descriptor = "I")
    private int field901 = -807;

    @OriginalMember(owner = "cc", name = "d", descriptor = "I")
    private int field902 = 1;

    @OriginalMember(owner = "cc", name = "e", descriptor = "Z")
    private boolean field903 = false;

    @OriginalMember(owner = "cc", name = "f", descriptor = "[I")
    public int[] field904 = new int[2];

    @OriginalMember(owner = "cc", name = "g", descriptor = "[[[I")
    public int[][][] field905 = new int[2][2][4];

    @OriginalMember(owner = "cc", name = "h", descriptor = "[[[I")
    public int[][][] field906 = new int[2][2][4];

    @OriginalMember(owner = "cc", name = "i", descriptor = "[I")
    public int[] field907 = new int[2];

    @OriginalMember(owner = "cc", name = "j", descriptor = "[[F")
    public static float[][] field908 = new float[2][8];

    @OriginalMember(owner = "cc", name = "k", descriptor = "[[I")
    public static int[][] field909 = new int[2][8];

    @OriginalMember(owner = "cc", name = "l", descriptor = "F")
    public static float field910;

    @OriginalMember(owner = "cc", name = "m", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "cc", name = "a", descriptor = "(FIII)F")
    private float method312(float arg0, int arg1, int arg2, int arg3) {
        if (arg2 < 9 || arg2 > 9) {
            this.field903 = !this.field903;
        }
        float var5 = (float) (this.field906[arg3][1][arg1] - this.field906[arg3][0][arg1]) * arg0 + (float) this.field906[arg3][0][arg1];
        float var6 = var5 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var6 / 20.0F));
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(IF)F")
    private float method313(int arg0, float arg1) {
        float var3 = (float) Math.pow(2.0D, (double) arg1) * 32.703197F;
        while (arg0 >= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        return var3 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(FIZI)F")
    private float method314(float arg0, int arg1, boolean arg2, int arg3) {
        float var5 = (float) (this.field905[arg3][1][arg1] - this.field905[arg3][0][arg1]) * arg0 + (float) this.field905[arg3][0][arg1];
        if (arg2) {
            this.field899 = !this.field899;
        }
        float var6 = var5 * 1.2207031E-4F;
        return this.method313(-807, var6);
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(FII)I")
    public int method315(float arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            float var4 = (float) (this.field907[1] - this.field907[0]) * arg0 + (float) this.field907[0];
            float var5 = var4 * 0.0030517578F;
            field910 = (float) Math.pow(0.1D, (double) (var5 / 20.0F));
            field911 = (int) (field910 * 65536.0F);
        }
        if (this.field904[arg1] == 0) {
            return 0;
        }
        float var6 = this.method312(arg0, 0, 9, arg1);
        if (arg2 < this.field902 || arg2 > this.field902) {
            this.field900 = !this.field900;
        }
        field908[arg1][0] = var6 * -2.0F * (float) Math.cos((double) this.method314(arg0, 0, false, arg1));
        field908[arg1][1] = var6 * var6;
        for (int var7 = 1; var7 < this.field904[arg1]; var7++) {
            float var10 = this.method312(arg0, var7, 9, arg1);
            float var11 = var10 * -2.0F * (float) Math.cos((double) this.method314(arg0, var7, false, arg1));
            float var12 = var10 * var10;
            field908[arg1][var7 * 2 + 1] = field908[arg1][var7 * 2 - 1] * var12;
            field908[arg1][var7 * 2] = field908[arg1][var7 * 2 - 1] * var11 + field908[arg1][var7 * 2 - 2] * var12;
            for (int var13 = var7 * 2 - 1; var13 >= 2; var13--) {
                field908[arg1][var13] += field908[arg1][var13 - 1] * var11 + field908[arg1][var13 - 2] * var12;
            }
            field908[arg1][1] += field908[arg1][0] * var11 + var12;
            field908[arg1][0] += var11;
        }
        if (arg1 == 0) {
            for (int var8 = 0; var8 < this.field904[0] * 2; var8++) {
                field908[0][var8] *= field910;
            }
        }
        for (int var9 = 0; var9 < this.field904[arg1] * 2; var9++) {
            field909[arg1][var9] = (int) (field908[arg1][var9] * 65536.0F);
        }
        return this.field904[arg1] * 2;
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(Lmb;Lbc;Z)V")
    public final void method316(Packet arg0, Envelope arg1, boolean arg2) {
        int var4 = arg0.method228();
        this.field904[0] = var4 >> 4;
        if (arg2) {
            this.field900 = !this.field900;
        }
        this.field904[1] = var4 & 0xF;
        if (var4 == 0) {
            this.field907[0] = this.field907[1] = 0;
            return;
        }
        this.field907[0] = arg0.method230();
        this.field907[1] = arg0.method230();
        int var5 = arg0.method228();
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var9 = 0; var9 < this.field904[var6]; var9++) {
                this.field905[var6][0][var9] = arg0.method230();
                this.field906[var6][0][var9] = arg0.method230();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field904[var7]; var8++) {
                if ((var5 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field905[var7][1][var8] = this.field905[var7][0][var8];
                    this.field906[var7][1][var8] = this.field906[var7][0][var8];
                } else {
                    this.field905[var7][1][var8] = arg0.method230();
                    this.field906[var7][1][var8] = arg0.method230();
                }
            }
        }
        if (var5 != 0 || this.field907[1] != this.field907[0]) {
            arg1.method309(-156, arg0);
        }
    }

    @OriginalMember(owner = "cc", name = "<init>", descriptor = "()V")
    public Filter() {
        if (Linkable.field369) {
        }
    }
}
