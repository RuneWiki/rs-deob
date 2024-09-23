import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("bc")
public class Filter {

    @OriginalMember(owner = "bc", name = "a", descriptor = "Z")
    private boolean field906 = false;

    @OriginalMember(owner = "bc", name = "c", descriptor = "I")
    private int field908 = 39;

    @OriginalMember(owner = "bc", name = "d", descriptor = "I")
    private int field909 = -530;

    @OriginalMember(owner = "bc", name = "e", descriptor = "[I")
    public int[] field910 = new int[2];

    @OriginalMember(owner = "bc", name = "f", descriptor = "[[[I")
    public int[][][] field911 = new int[2][2][4];

    @OriginalMember(owner = "bc", name = "g", descriptor = "[[[I")
    public int[][][] field912 = new int[2][2][4];

    @OriginalMember(owner = "bc", name = "h", descriptor = "[I")
    public int[] field913 = new int[2];

    @OriginalMember(owner = "bc", name = "i", descriptor = "[[F")
    public static float[][] field914 = new float[2][8];

    @OriginalMember(owner = "bc", name = "j", descriptor = "[[I")
    public static int[][] field915 = new int[2][8];

    @OriginalMember(owner = "bc", name = "k", descriptor = "F")
    public static float field916;

    @OriginalMember(owner = "bc", name = "b", descriptor = "I")
    private int field907;

    @OriginalMember(owner = "bc", name = "l", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "bc", name = "a", descriptor = "(IFII)F")
    private float method313(int arg0, float arg1, int arg2, int arg3) {
        float var5 = (float) (this.field912[arg3][1][arg2] - this.field912[arg3][0][arg2]) * arg1 + (float) this.field912[arg3][0][arg2];
        if (arg0 >= 0) {
            this.field907 = 163;
        }
        float var6 = var5 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var6 / 20.0F));
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(ZF)F")
    private float method314(boolean arg0, float arg1) {
        if (!arg0) {
            this.field906 = !this.field906;
        }
        float var3 = (float) Math.pow(2.0D, (double) arg1) * 32.703197F;
        return var3 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(FIII)F")
    private float method315(float arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 27859) {
            throw new NullPointerException();
        }
        float var5 = (float) (this.field911[arg3][1][arg2] - this.field911[arg3][0][arg2]) * arg0 + (float) this.field911[arg3][0][arg2];
        float var6 = var5 * 1.2207031E-4F;
        return this.method314(true, var6);
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(FIZ)I")
    public int method316(float arg0, int arg1, boolean arg2) {
        if (arg1 == 0) {
            float var4 = (float) (this.field913[1] - this.field913[0]) * arg0 + (float) this.field913[0];
            float var5 = var4 * 0.0030517578F;
            field916 = (float) Math.pow(0.1D, (double) (var5 / 20.0F));
            field917 = (int) (field916 * 65536.0F);
        }
        if (this.field910[arg1] == 0) {
            return 0;
        }
        float var6 = this.method313(this.field909, arg0, 0, arg1);
        field914[arg1][0] = var6 * -2.0F * (float) Math.cos((double) this.method315(arg0, 27859, 0, arg1));
        field914[arg1][1] = var6 * var6;
        if (arg2) {
            this.field906 = !this.field906;
        }
        for (int var7 = 1; var7 < this.field910[arg1]; var7++) {
            float var10 = this.method313(this.field909, arg0, var7, arg1);
            float var11 = var10 * -2.0F * (float) Math.cos((double) this.method315(arg0, 27859, var7, arg1));
            float var12 = var10 * var10;
            field914[arg1][var7 * 2 + 1] = field914[arg1][var7 * 2 - 1] * var12;
            field914[arg1][var7 * 2] = field914[arg1][var7 * 2 - 1] * var11 + field914[arg1][var7 * 2 - 2] * var12;
            for (int var13 = var7 * 2 - 1; var13 >= 2; var13--) {
                field914[arg1][var13] += field914[arg1][var13 - 1] * var11 + field914[arg1][var13 - 2] * var12;
            }
            field914[arg1][1] += field914[arg1][0] * var11 + var12;
            field914[arg1][0] += var11;
        }
        if (arg1 == 0) {
            for (int var8 = 0; var8 < this.field910[0] * 2; var8++) {
                field914[0][var8] *= field916;
            }
        }
        for (int var9 = 0; var9 < this.field910[arg1] * 2; var9++) {
            field915[arg1][var9] = (int) (field914[arg1][var9] * 65536.0F);
        }
        return this.field910[arg1] * 2;
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(Lac;ILlb;)V")
    public final void method317(Envelope arg0, int arg1, Packet arg2) {
        if (arg1 != 39196) {
            return;
        }
        int var4 = arg2.method229();
        this.field910[0] = var4 >> 4;
        this.field910[1] = var4 & 0xF;
        if (var4 == 0) {
            this.field913[0] = this.field913[1] = 0;
            return;
        }
        this.field913[0] = arg2.method231();
        this.field913[1] = arg2.method231();
        int var5 = arg2.method229();
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var9 = 0; var9 < this.field910[var6]; var9++) {
                this.field911[var6][0][var9] = arg2.method231();
                this.field912[var6][0][var9] = arg2.method231();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field910[var7]; var8++) {
                if ((var5 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field911[var7][1][var8] = this.field911[var7][0][var8];
                    this.field912[var7][1][var8] = this.field912[var7][0][var8];
                } else {
                    this.field911[var7][1][var8] = arg2.method231();
                    this.field912[var7][1][var8] = arg2.method231();
                }
            }
        }
        if (var5 != 0 || this.field913[1] != this.field913[0]) {
            arg0.method310(arg2, this.field908);
        }
    }

    @OriginalMember(owner = "bc", name = "<init>", descriptor = "()V")
    public Filter() {
        if (Linkable.field363) {
        }
    }
}
