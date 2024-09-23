import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("bc")
public class Filter {

    @OriginalMember(owner = "bc", name = "a", descriptor = "Z")
    private boolean field887 = false;

    @OriginalMember(owner = "bc", name = "b", descriptor = "I")
    private int field888 = 18931;

    @OriginalMember(owner = "bc", name = "c", descriptor = "[I")
    public int[] field889 = new int[2];

    @OriginalMember(owner = "bc", name = "d", descriptor = "[[[I")
    public int[][][] field890 = new int[2][2][4];

    @OriginalMember(owner = "bc", name = "e", descriptor = "[[[I")
    public int[][][] field891 = new int[2][2][4];

    @OriginalMember(owner = "bc", name = "f", descriptor = "[I")
    public int[] field892 = new int[2];

    @OriginalMember(owner = "bc", name = "g", descriptor = "[[F")
    public static float[][] field893 = new float[2][8];

    @OriginalMember(owner = "bc", name = "h", descriptor = "[[I")
    public static int[][] field894 = new int[2][8];

    @OriginalMember(owner = "bc", name = "i", descriptor = "F")
    public static float field895;

    @OriginalMember(owner = "bc", name = "j", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "bc", name = "a", descriptor = "(IFII)F")
    private float method313(int arg0, float arg1, int arg2, int arg3) {
        float var5 = (float) (this.field891[arg2][1][arg3] - this.field891[arg2][0][arg3]) * arg1 + (float) this.field891[arg2][0][arg3];
        float var6 = var5 * 0.0015258789F;
        int var7 = 52 / arg0;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var6 / 20.0F));
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(IF)F")
    private float method314(int arg0, float arg1) {
        float var3 = (float) Math.pow(2.0D, (double) arg1) * 32.703197F;
        if (arg0 >= 0) {
            this.field887 = !this.field887;
        }
        return var3 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(FIII)F")
    private float method315(float arg0, int arg1, int arg2, int arg3) {
        float var5 = (float) (this.field890[arg1][1][arg2] - this.field890[arg1][0][arg2]) * arg0 + (float) this.field890[arg1][0][arg2];
        float var6 = var5 * 1.2207031E-4F;
        if (arg3 < 4 || arg3 > 4) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        return this.method314(-900, var6);
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(FII)I")
    public int method316(float arg0, int arg1, int arg2) {
        if (arg1 < 3 || arg1 > 3) {
            return this.field888;
        }
        if (arg2 == 0) {
            float var4 = (float) (this.field892[1] - this.field892[0]) * arg0 + (float) this.field892[0];
            float var5 = var4 * 0.0030517578F;
            field895 = (float) Math.pow(0.1D, (double) (var5 / 20.0F));
            field896 = (int) (field895 * 65536.0F);
        }
        if (this.field889[arg2] == 0) {
            return 0;
        }
        float var6 = this.method313(294, arg0, arg2, 0);
        field893[arg2][0] = var6 * -2.0F * (float) Math.cos((double) this.method315(arg0, arg2, 0, 4));
        field893[arg2][1] = var6 * var6;
        for (int var7 = 1; var7 < this.field889[arg2]; var7++) {
            float var10 = this.method313(294, arg0, arg2, var7);
            float var11 = var10 * -2.0F * (float) Math.cos((double) this.method315(arg0, arg2, var7, 4));
            float var12 = var10 * var10;
            field893[arg2][var7 * 2 + 1] = field893[arg2][var7 * 2 - 1] * var12;
            field893[arg2][var7 * 2] = field893[arg2][var7 * 2 - 1] * var11 + field893[arg2][var7 * 2 - 2] * var12;
            for (int var13 = var7 * 2 - 1; var13 >= 2; var13--) {
                field893[arg2][var13] += field893[arg2][var13 - 1] * var11 + field893[arg2][var13 - 2] * var12;
            }
            field893[arg2][1] += field893[arg2][0] * var11 + var12;
            field893[arg2][0] += var11;
        }
        if (arg2 == 0) {
            for (int var8 = 0; var8 < this.field889[0] * 2; var8++) {
                field893[0][var8] *= field895;
            }
        }
        for (int var9 = 0; var9 < this.field889[arg2] * 2; var9++) {
            field894[arg2][var9] = (int) (field893[arg2][var9] * 65536.0F);
        }
        return this.field889[arg2] * 2;
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(Lac;Llb;I)V")
    public final void method317(Envelope arg0, Packet arg1, int arg2) {
        int var4 = arg1.method229();
        this.field889[0] = var4 >> 4;
        this.field889[1] = var4 & 0xF;
        if (arg2 != 12249) {
            this.field888 = 5;
        }
        if (var4 == 0) {
            this.field892[0] = this.field892[1] = 0;
            if (Linkable.field362) {
            }
            return;
        }
        this.field892[0] = arg1.method231();
        this.field892[1] = arg1.method231();
        int var5 = arg1.method229();
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var9 = 0; var9 < this.field889[var6]; var9++) {
                this.field890[var6][0][var9] = arg1.method231();
                this.field891[var6][0][var9] = arg1.method231();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field889[var7]; var8++) {
                if ((var5 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field890[var7][1][var8] = this.field890[var7][0][var8];
                    this.field891[var7][1][var8] = this.field891[var7][0][var8];
                } else {
                    this.field890[var7][1][var8] = arg1.method231();
                    this.field891[var7][1][var8] = arg1.method231();
                }
            }
        }
        if (var5 != 0 || this.field892[1] != this.field892[0]) {
            arg0.method310(0, arg1);
        }
    }
}
