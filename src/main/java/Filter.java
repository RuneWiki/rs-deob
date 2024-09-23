import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("bc")
public class Filter {

    @OriginalMember(owner = "bc", name = "a", descriptor = "I")
    private int field894 = 181;

    @OriginalMember(owner = "bc", name = "b", descriptor = "Z")
    private boolean field895 = true;

    @OriginalMember(owner = "bc", name = "c", descriptor = "B")
    private byte field896 = 1;

    @OriginalMember(owner = "bc", name = "d", descriptor = "[I")
    public int[] field897 = new int[2];

    @OriginalMember(owner = "bc", name = "e", descriptor = "[[[I")
    public int[][][] field898 = new int[2][2][4];

    @OriginalMember(owner = "bc", name = "f", descriptor = "[[[I")
    public int[][][] field899 = new int[2][2][4];

    @OriginalMember(owner = "bc", name = "g", descriptor = "[I")
    public int[] field900 = new int[2];

    @OriginalMember(owner = "bc", name = "h", descriptor = "[[F")
    public static float[][] field901 = new float[2][8];

    @OriginalMember(owner = "bc", name = "i", descriptor = "[[I")
    public static int[][] field902 = new int[2][8];

    @OriginalMember(owner = "bc", name = "j", descriptor = "F")
    public static float field903;

    @OriginalMember(owner = "bc", name = "k", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "bc", name = "a", descriptor = "(IIIF)F")
    private float method308(int arg0, int arg1, int arg2, float arg3) {
        float var5 = (float) (this.field899[arg2][1][arg0] - this.field899[arg2][0][arg0]) * arg3 + (float) this.field899[arg2][0][arg0];
        int var6 = 49 / arg1;
        float var7 = var5 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var7 / 20.0F));
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(BF)F")
    private float method309(byte arg0, float arg1) {
        if (arg0 != -81) {
            throw new NullPointerException();
        }
        float var3 = (float) Math.pow(2.0D, (double) arg1) * 32.703197F;
        return var3 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(BIIF)F")
    private float method310(byte arg0, int arg1, int arg2, float arg3) {
        float var5 = (float) (this.field898[arg1][1][arg2] - this.field898[arg1][0][arg2]) * arg3 + (float) this.field898[arg1][0][arg2];
        if (this.field896 != arg0) {
            this.field894 = -228;
        }
        float var6 = var5 * 1.2207031E-4F;
        return this.method309((byte) -81, var6);
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(IFB)I")
    public int method311(int arg0, float arg1, byte arg2) {
        if (arg2 == 1) {
            boolean var4 = false;
        } else {
            this.field895 = !this.field895;
        }
        if (arg0 == 0) {
            float var5 = (float) (this.field900[1] - this.field900[0]) * arg1 + (float) this.field900[0];
            float var6 = var5 * 0.0030517578F;
            field903 = (float) Math.pow(0.1D, (double) (var6 / 20.0F));
            field904 = (int) (field903 * 65536.0F);
        }
        if (this.field897[arg0] == 0) {
            return 0;
        }
        float var7 = this.method308(0, 680, arg0, arg1);
        field901[arg0][0] = var7 * -2.0F * (float) Math.cos((double) this.method310((byte) 1, arg0, 0, arg1));
        field901[arg0][1] = var7 * var7;
        for (int var8 = 1; var8 < this.field897[arg0]; var8++) {
            float var11 = this.method308(var8, 680, arg0, arg1);
            float var12 = var11 * -2.0F * (float) Math.cos((double) this.method310((byte) 1, arg0, var8, arg1));
            float var13 = var11 * var11;
            field901[arg0][var8 * 2 + 1] = field901[arg0][var8 * 2 - 1] * var13;
            field901[arg0][var8 * 2] = field901[arg0][var8 * 2 - 1] * var12 + field901[arg0][var8 * 2 - 2] * var13;
            for (int var14 = var8 * 2 - 1; var14 >= 2; var14--) {
                field901[arg0][var14] += field901[arg0][var14 - 1] * var12 + field901[arg0][var14 - 2] * var13;
            }
            field901[arg0][1] += field901[arg0][0] * var12 + var13;
            field901[arg0][0] += var12;
        }
        if (arg0 == 0) {
            for (int var9 = 0; var9 < this.field897[0] * 2; var9++) {
                field901[0][var9] *= field903;
            }
        }
        for (int var10 = 0; var10 < this.field897[arg0] * 2; var10++) {
            field902[arg0][var10] = (int) (field901[arg0][var10] * 65536.0F);
        }
        return this.field897[arg0] * 2;
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(Llb;BLac;)V")
    public final void method312(Packet arg0, byte arg1, Envelope arg2) {
        int var4 = arg0.method224();
        this.field897[0] = var4 >> 4;
        this.field897[1] = var4 & 0xF;
        if (arg1 != 6) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (var4 == 0) {
            this.field900[0] = this.field900[1] = 0;
            return;
        }
        this.field900[0] = arg0.method226();
        this.field900[1] = arg0.method226();
        int var6 = arg0.method224();
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var10 = 0; var10 < this.field897[var7]; var10++) {
                this.field898[var7][0][var10] = arg0.method226();
                this.field899[var7][0][var10] = arg0.method226();
            }
        }
        for (int var8 = 0; var8 < 2; var8++) {
            for (int var9 = 0; var9 < this.field897[var8]; var9++) {
                if ((var6 & 0x1 << var8 * 4 << var9) == 0) {
                    this.field898[var8][1][var9] = this.field898[var8][0][var9];
                    this.field899[var8][1][var9] = this.field899[var8][0][var9];
                } else {
                    this.field898[var8][1][var9] = arg0.method226();
                    this.field899[var8][1][var9] = arg0.method226();
                }
            }
        }
        if (var6 != 0 || this.field900[1] != this.field900[0]) {
            arg2.method305(arg0, 9);
        }
    }

    @OriginalMember(owner = "bc", name = "<init>", descriptor = "()V")
    public Filter() {
        if (Linkable.field365) {
        }
    }
}
