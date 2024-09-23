import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("bc")
public class Filter {

    @OriginalMember(owner = "bc", name = "a", descriptor = "Z")
    private boolean field889 = false;

    @OriginalMember(owner = "bc", name = "b", descriptor = "B")
    private byte field890 = 89;

    @OriginalMember(owner = "bc", name = "d", descriptor = "Z")
    private boolean field892 = false;

    @OriginalMember(owner = "bc", name = "e", descriptor = "[I")
    public int[] field893 = new int[2];

    @OriginalMember(owner = "bc", name = "f", descriptor = "[[[I")
    public int[][][] field894 = new int[2][2][4];

    @OriginalMember(owner = "bc", name = "g", descriptor = "[[[I")
    public int[][][] field895 = new int[2][2][4];

    @OriginalMember(owner = "bc", name = "h", descriptor = "[I")
    public int[] field896 = new int[2];

    @OriginalMember(owner = "bc", name = "i", descriptor = "[[F")
    public static float[][] field897 = new float[2][8];

    @OriginalMember(owner = "bc", name = "j", descriptor = "[[I")
    public static int[][] field898 = new int[2][8];

    @OriginalMember(owner = "bc", name = "k", descriptor = "F")
    public static float field899;

    @OriginalMember(owner = "bc", name = "c", descriptor = "I")
    private int field891;

    @OriginalMember(owner = "bc", name = "l", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "bc", name = "a", descriptor = "(FIII)F")
    private float method308(float arg0, int arg1, int arg2, int arg3) {
        float var5 = (float) (this.field895[arg3][1][arg1] - this.field895[arg3][0][arg1]) * arg0 + (float) this.field895[arg3][0][arg1];
        if (this.field891 != arg2) {
            this.field889 = !this.field889;
        }
        float var6 = var5 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var6 / 20.0F));
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(FZ)F")
    private float method309(float arg0, boolean arg1) {
        float var3 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        if (arg1) {
            throw new NullPointerException();
        }
        return var3 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(IIIF)F")
    private float method310(int arg0, int arg1, int arg2, float arg3) {
        float var5 = (float) (this.field894[arg0][1][arg2] - this.field894[arg0][0][arg2]) * arg3 + (float) this.field894[arg0][0][arg2];
        if (arg1 <= 0) {
            throw new NullPointerException();
        }
        float var6 = var5 * 1.2207031E-4F;
        return this.method309(var6, this.field892);
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(IFI)I")
    public int method311(int arg0, float arg1, int arg2) {
        if (arg2 == 0) {
            float var4 = (float) (this.field896[1] - this.field896[0]) * arg1 + (float) this.field896[0];
            float var5 = var4 * 0.0030517578F;
            field899 = (float) Math.pow(0.1D, (double) (var5 / 20.0F));
            field900 = (int) (field899 * 65536.0F);
        }
        if (this.field893[arg2] == 0) {
            return 0;
        }
        float var6 = this.method308(arg1, 0, 0, arg2);
        field897[arg2][0] = var6 * -2.0F * (float) Math.cos((double) this.method310(arg2, 180, 0, arg1));
        if (arg0 >= 0) {
            return this.field891;
        }
        field897[arg2][1] = var6 * var6;
        for (int var7 = 1; var7 < this.field893[arg2]; var7++) {
            float var10 = this.method308(arg1, var7, 0, arg2);
            float var11 = var10 * -2.0F * (float) Math.cos((double) this.method310(arg2, 180, var7, arg1));
            float var12 = var10 * var10;
            field897[arg2][var7 * 2 + 1] = field897[arg2][var7 * 2 - 1] * var12;
            field897[arg2][var7 * 2] = field897[arg2][var7 * 2 - 1] * var11 + field897[arg2][var7 * 2 - 2] * var12;
            for (int var13 = var7 * 2 - 1; var13 >= 2; var13--) {
                field897[arg2][var13] += field897[arg2][var13 - 1] * var11 + field897[arg2][var13 - 2] * var12;
            }
            field897[arg2][1] += field897[arg2][0] * var11 + var12;
            field897[arg2][0] += var11;
        }
        if (arg2 == 0) {
            for (int var8 = 0; var8 < this.field893[0] * 2; var8++) {
                field897[0][var8] *= field899;
            }
        }
        for (int var9 = 0; var9 < this.field893[arg2] * 2; var9++) {
            field898[arg2][var9] = (int) (field897[arg2][var9] * 65536.0F);
        }
        return this.field893[arg2] * 2;
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(ILac;Llb;)V")
    public final void method312(int arg0, Envelope arg1, Packet arg2) {
        if (arg0 != 0) {
            return;
        }
        int var4 = arg2.method224();
        this.field893[0] = var4 >> 4;
        this.field893[1] = var4 & 0xF;
        if (var4 == 0) {
            this.field896[0] = this.field896[1] = 0;
            return;
        }
        this.field896[0] = arg2.method226();
        this.field896[1] = arg2.method226();
        int var5 = arg2.method224();
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var9 = 0; var9 < this.field893[var6]; var9++) {
                this.field894[var6][0][var9] = arg2.method226();
                this.field895[var6][0][var9] = arg2.method226();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field893[var7]; var8++) {
                if ((var5 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field894[var7][1][var8] = this.field894[var7][0][var8];
                    this.field895[var7][1][var8] = this.field895[var7][0][var8];
                } else {
                    this.field894[var7][1][var8] = arg2.method226();
                    this.field895[var7][1][var8] = arg2.method226();
                }
            }
        }
        if (var5 != 0 || this.field896[1] != this.field896[0]) {
            arg1.method305(this.field890, arg2);
        }
    }

    @OriginalMember(owner = "bc", name = "<init>", descriptor = "()V")
    public Filter() {
        if (Linkable.field360) {
        }
    }
}
