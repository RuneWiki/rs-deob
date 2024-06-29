import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!EWUYFKZT")
public class class16 {

    @OriginalMember(owner = "client!EWUYFKZT", name = "a", descriptor = "I")
    private int field749 = 731;

    @OriginalMember(owner = "client!EWUYFKZT", name = "b", descriptor = "Z")
    private boolean field750 = false;

    @OriginalMember(owner = "client!EWUYFKZT", name = "c", descriptor = "[I")
    public int[] field751 = new int[2];

    @OriginalMember(owner = "client!EWUYFKZT", name = "d", descriptor = "[[[I")
    public int[][][] field752 = new int[2][2][4];

    @OriginalMember(owner = "client!EWUYFKZT", name = "e", descriptor = "[[[I")
    public int[][][] field753 = new int[2][2][4];

    @OriginalMember(owner = "client!EWUYFKZT", name = "f", descriptor = "[I")
    public int[] field754 = new int[2];

    @OriginalMember(owner = "client!EWUYFKZT", name = "g", descriptor = "[[F")
    public static float[][] field755 = new float[2][8];

    @OriginalMember(owner = "client!EWUYFKZT", name = "h", descriptor = "[[I")
    public static int[][] field756 = new int[2][8];

    @OriginalMember(owner = "client!EWUYFKZT", name = "i", descriptor = "F")
    public static float field757;

    @OriginalMember(owner = "client!EWUYFKZT", name = "j", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!EWUYFKZT", name = "a", descriptor = "(IFZI)F")
    private float method192(int arg0, float arg1, boolean arg2, int arg3) {
        float var5 = (float) (this.field753[arg0][1][arg3] - this.field753[arg0][0][arg3]) * arg1 + (float) this.field753[arg0][0][arg3];
        float var6 = var5 * 0.0015258789F;
        if (arg2) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        return 1.0F - (float) Math.pow(10.0D, (double) (-var6 / 20.0F));
    }

    @OriginalMember(owner = "client!EWUYFKZT", name = "a", descriptor = "(FB)F")
    private float method193(float arg0, byte arg1) {
        float var3 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        if (arg1 != -22) {
            throw new NullPointerException();
        }
        return var3 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!EWUYFKZT", name = "a", descriptor = "(IIIF)F")
    private float method194(int arg0, int arg1, int arg2, float arg3) {
        float var5 = (float) (this.field752[arg1][1][arg0] - this.field752[arg1][0][arg0]) * arg3 + (float) this.field752[arg1][0][arg0];
        float var6 = var5 * 1.2207031E-4F;
        if (arg2 != 0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        return this.method193(var6, (byte) -22);
    }

    @OriginalMember(owner = "client!EWUYFKZT", name = "a", descriptor = "(IIF)I")
    public int method195(int arg0, int arg1, float arg2) {
        if (arg1 == 0) {
            float var4 = (float) (this.field754[1] - this.field754[0]) * arg2 + (float) this.field754[0];
            float var5 = var4 * 0.0030517578F;
            field757 = (float) Math.pow(0.1D, (double) (var5 / 20.0F));
            field758 = (int) (field757 * 65536.0F);
        }
        if (this.field751[arg1] == 0) {
            return 0;
        }
        float var6 = this.method192(arg1, arg2, false, 0);
        field755[arg1][0] = var6 * -2.0F * (float) Math.cos((double) this.method194(0, arg1, 0, arg2));
        if (arg0 != -1766) {
            return this.field749;
        }
        field755[arg1][1] = var6 * var6;
        for (int var7 = 1; var7 < this.field751[arg1]; var7++) {
            float var10 = this.method192(arg1, arg2, false, var7);
            float var11 = var10 * -2.0F * (float) Math.cos((double) this.method194(var7, arg1, 0, arg2));
            float var12 = var10 * var10;
            field755[arg1][var7 * 2 + 1] = field755[arg1][var7 * 2 - 1] * var12;
            field755[arg1][var7 * 2] = field755[arg1][var7 * 2 - 1] * var11 + field755[arg1][var7 * 2 - 2] * var12;
            for (int var13 = var7 * 2 - 1; var13 >= 2; var13--) {
                field755[arg1][var13] += field755[arg1][var13 - 1] * var11 + field755[arg1][var13 - 2] * var12;
            }
            field755[arg1][1] += field755[arg1][0] * var11 + var12;
            field755[arg1][0] += var11;
        }
        if (arg1 == 0) {
            for (int var8 = 0; var8 < this.field751[0] * 2; var8++) {
                field755[0][var8] *= field757;
            }
        }
        for (int var9 = 0; var9 < this.field751[arg1] * 2; var9++) {
            field756[arg1][var9] = (int) (field755[arg1][var9] * 65536.0F);
        }
        return this.field751[arg1] * 2;
    }

    @OriginalMember(owner = "client!EWUYFKZT", name = "a", descriptor = "(LTKPFKOXP;ILVRTTZTTM;)V")
    public final void method196(class59 arg0, int arg1, class63 arg2) {
        if (arg1 != 0) {
            this.field750 = !this.field750;
        }
        int var4 = arg0.method529();
        this.field751[0] = var4 >> 4;
        this.field751[1] = var4 & 0xF;
        if (var4 == 0) {
            this.field754[0] = this.field754[1] = 0;
            if (class67.field1688) {
            }
            return;
        }
        this.field754[0] = arg0.method531();
        this.field754[1] = arg0.method531();
        int var5 = arg0.method529();
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var9 = 0; var9 < this.field751[var6]; var9++) {
                this.field752[var6][0][var9] = arg0.method531();
                this.field753[var6][0][var9] = arg0.method531();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field751[var7]; var8++) {
                if ((var5 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field752[var7][1][var8] = this.field752[var7][0][var8];
                    this.field753[var7][1][var8] = this.field753[var7][0][var8];
                } else {
                    this.field752[var7][1][var8] = arg0.method531();
                    this.field753[var7][1][var8] = arg0.method531();
                }
            }
        }
        if (var5 != 0 || this.field754[1] != this.field754[0]) {
            arg2.method583(false, arg0);
        }
    }
}
