import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("BMQRLUHC")
public class class5 {

    @OriginalMember(owner = "BMQRLUHC", name = "a", descriptor = "Z")
    private boolean field36 = true;

    @OriginalMember(owner = "BMQRLUHC", name = "b", descriptor = "[I")
    public int[] field37 = new int[2];

    @OriginalMember(owner = "BMQRLUHC", name = "c", descriptor = "[[[I")
    public int[][][] field38 = new int[2][2][4];

    @OriginalMember(owner = "BMQRLUHC", name = "d", descriptor = "[[[I")
    public int[][][] field39 = new int[2][2][4];

    @OriginalMember(owner = "BMQRLUHC", name = "e", descriptor = "[I")
    public int[] field40 = new int[2];

    @OriginalMember(owner = "BMQRLUHC", name = "f", descriptor = "[[F")
    public static float[][] field41 = new float[2][8];

    @OriginalMember(owner = "BMQRLUHC", name = "g", descriptor = "[[I")
    public static int[][] field42 = new int[2][8];

    @OriginalMember(owner = "BMQRLUHC", name = "h", descriptor = "F")
    public static float field43;

    @OriginalMember(owner = "BMQRLUHC", name = "i", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "BMQRLUHC", name = "a", descriptor = "(IIIF)F")
    private float method55(int arg0, int arg1, int arg2, float arg3) {
        if (arg1 != -42341) {
            throw new NullPointerException();
        }
        float var5 = (float) (this.field39[arg0][1][arg2] - this.field39[arg0][0][arg2]) * arg3 + (float) this.field39[arg0][0][arg2];
        float var6 = var5 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var6 / 20.0F));
    }

    @OriginalMember(owner = "BMQRLUHC", name = "a", descriptor = "(IF)F")
    private float method56(int arg0, float arg1) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        float var3 = (float) Math.pow(2.0D, (double) arg1) * 32.703197F;
        return var3 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "BMQRLUHC", name = "a", descriptor = "(FIBI)F")
    private float method57(float arg0, int arg1, byte arg2, int arg3) {
        float var5 = (float) (this.field38[arg1][1][arg3] - this.field38[arg1][0][arg3]) * arg0 + (float) this.field38[arg1][0][arg3];
        float var6 = var5 * 1.2207031E-4F;
        if (arg2 != 3) {
            throw new NullPointerException();
        }
        return this.method56(0, var6);
    }

    @OriginalMember(owner = "BMQRLUHC", name = "a", descriptor = "(IFI)I")
    public int method58(int arg0, float arg1, int arg2) {
        if (arg0 >= 0) {
            this.field36 = !this.field36;
        }
        if (arg2 == 0) {
            float var4 = (float) (this.field40[1] - this.field40[0]) * arg1 + (float) this.field40[0];
            float var5 = var4 * 0.0030517578F;
            field43 = (float) Math.pow(0.1D, (double) (var5 / 20.0F));
            field44 = (int) (field43 * 65536.0F);
        }
        if (this.field37[arg2] == 0) {
            return 0;
        }
        float var6 = this.method55(arg2, -42341, 0, arg1);
        field41[arg2][0] = var6 * -2.0F * (float) Math.cos((double) this.method57(arg1, arg2, (byte) 3, 0));
        field41[arg2][1] = var6 * var6;
        for (int var7 = 1; var7 < this.field37[arg2]; var7++) {
            float var10 = this.method55(arg2, -42341, var7, arg1);
            float var11 = var10 * -2.0F * (float) Math.cos((double) this.method57(arg1, arg2, (byte) 3, var7));
            float var12 = var10 * var10;
            field41[arg2][var7 * 2 + 1] = field41[arg2][var7 * 2 - 1] * var12;
            field41[arg2][var7 * 2] = field41[arg2][var7 * 2 - 1] * var11 + field41[arg2][var7 * 2 - 2] * var12;
            for (int var13 = var7 * 2 - 1; var13 >= 2; var13--) {
                field41[arg2][var13] += field41[arg2][var13 - 1] * var11 + field41[arg2][var13 - 2] * var12;
            }
            field41[arg2][1] += field41[arg2][0] * var11 + var12;
            field41[arg2][0] += var11;
        }
        if (arg2 == 0) {
            for (int var8 = 0; var8 < this.field37[0] * 2; var8++) {
                field41[0][var8] *= field43;
            }
        }
        for (int var9 = 0; var9 < this.field37[arg2] * 2; var9++) {
            field42[arg2][var9] = (int) (field41[arg2][var9] * 65536.0F);
        }
        return this.field37[arg2] * 2;
    }

    @OriginalMember(owner = "BMQRLUHC", name = "a", descriptor = "(BLPGNBHFUF;LYJSRODCC;)V")
    public final void method59(byte arg0, class42 arg1, class64 arg2) {
        int var4 = arg1.method420();
        this.field37[0] = var4 >> 4;
        if (arg0 != 8) {
            return;
        }
        this.field37[1] = var4 & 0xF;
        if (var4 == 0) {
            this.field40[0] = this.field40[1] = 0;
            return;
        }
        this.field40[0] = arg1.method422();
        this.field40[1] = arg1.method422();
        int var5 = arg1.method420();
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var9 = 0; var9 < this.field37[var6]; var9++) {
                this.field38[var6][0][var9] = arg1.method422();
                this.field39[var6][0][var9] = arg1.method422();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field37[var7]; var8++) {
                if ((var5 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field38[var7][1][var8] = this.field38[var7][0][var8];
                    this.field39[var7][1][var8] = this.field39[var7][0][var8];
                } else {
                    this.field38[var7][1][var8] = arg1.method422();
                    this.field39[var7][1][var8] = arg1.method422();
                }
            }
        }
        if (var5 != 0 || this.field40[1] != this.field40[0]) {
            arg2.method572(arg1, 0);
        }
    }

    @OriginalMember(owner = "BMQRLUHC", name = "<init>", descriptor = "()V")
    public class5() {
        if (class8.field617) {
        }
    }
}
