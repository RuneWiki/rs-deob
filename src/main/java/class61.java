import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("UVAKRMXV")
public class class61 {

    @OriginalMember(owner = "UVAKRMXV", name = "a", descriptor = "Z")
    private boolean field1418 = true;

    @OriginalMember(owner = "UVAKRMXV", name = "b", descriptor = "[I")
    public int[] field1419 = new int[2];

    @OriginalMember(owner = "UVAKRMXV", name = "c", descriptor = "[[[I")
    public int[][][] field1420 = new int[2][2][4];

    @OriginalMember(owner = "UVAKRMXV", name = "d", descriptor = "[[[I")
    public int[][][] field1421 = new int[2][2][4];

    @OriginalMember(owner = "UVAKRMXV", name = "e", descriptor = "[I")
    public int[] field1422 = new int[2];

    @OriginalMember(owner = "UVAKRMXV", name = "f", descriptor = "[[F")
    public static float[][] field1423 = new float[2][8];

    @OriginalMember(owner = "UVAKRMXV", name = "g", descriptor = "[[I")
    public static int[][] field1424 = new int[2][8];

    @OriginalMember(owner = "UVAKRMXV", name = "h", descriptor = "F")
    public static float field1425;

    @OriginalMember(owner = "UVAKRMXV", name = "i", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "UVAKRMXV", name = "a", descriptor = "(FIII)F")
    private float method471(float arg0, int arg1, int arg2, int arg3) {
        float var5 = (float) (this.field1421[arg2][1][arg3] - this.field1421[arg2][0][arg3]) * arg0 + (float) this.field1421[arg2][0][arg3];
        int var6 = 70 / arg1;
        float var7 = var5 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var7 / 20.0F));
    }

    @OriginalMember(owner = "UVAKRMXV", name = "a", descriptor = "(FI)F")
    private float method472(float arg0, int arg1) {
        float var3 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        if (arg1 < 0 || arg1 > 0) {
            throw new NullPointerException();
        }
        return var3 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "UVAKRMXV", name = "a", descriptor = "(IFII)F")
    private float method473(int arg0, float arg1, int arg2, int arg3) {
        if (arg2 != 0) {
            throw new NullPointerException();
        }
        float var5 = (float) (this.field1420[arg0][1][arg3] - this.field1420[arg0][0][arg3]) * arg1 + (float) this.field1420[arg0][0][arg3];
        float var6 = var5 * 1.2207031E-4F;
        return this.method472(var6, 0);
    }

    @OriginalMember(owner = "UVAKRMXV", name = "a", descriptor = "(ZFI)I")
    public int method474(boolean arg0, float arg1, int arg2) {
        if (arg2 == 0) {
            float var4 = (float) (this.field1422[1] - this.field1422[0]) * arg1 + (float) this.field1422[0];
            float var5 = var4 * 0.0030517578F;
            field1425 = (float) Math.pow(0.1D, (double) (var5 / 20.0F));
            field1426 = (int) (field1425 * 65536.0F);
        }
        if (this.field1419[arg2] == 0) {
            return 0;
        }
        float var6 = this.method471(arg1, 785, arg2, 0);
        if (arg0) {
            this.field1418 = !this.field1418;
        }
        field1423[arg2][0] = var6 * -2.0F * (float) Math.cos((double) this.method473(arg2, arg1, 0, 0));
        field1423[arg2][1] = var6 * var6;
        for (int var7 = 1; var7 < this.field1419[arg2]; var7++) {
            float var10 = this.method471(arg1, 785, arg2, var7);
            float var11 = var10 * -2.0F * (float) Math.cos((double) this.method473(arg2, arg1, 0, var7));
            float var12 = var10 * var10;
            field1423[arg2][var7 * 2 + 1] = field1423[arg2][var7 * 2 - 1] * var12;
            field1423[arg2][var7 * 2] = field1423[arg2][var7 * 2 - 1] * var11 + field1423[arg2][var7 * 2 - 2] * var12;
            for (int var13 = var7 * 2 - 1; var13 >= 2; var13--) {
                field1423[arg2][var13] += field1423[arg2][var13 - 1] * var11 + field1423[arg2][var13 - 2] * var12;
            }
            field1423[arg2][1] += field1423[arg2][0] * var11 + var12;
            field1423[arg2][0] += var11;
        }
        if (arg2 == 0) {
            for (int var8 = 0; var8 < this.field1419[0] * 2; var8++) {
                field1423[0][var8] *= field1425;
            }
        }
        for (int var9 = 0; var9 < this.field1419[arg2] * 2; var9++) {
            field1424[arg2][var9] = (int) (field1423[arg2][var9] * 65536.0F);
        }
        return this.field1419[arg2] * 2;
    }

    @OriginalMember(owner = "UVAKRMXV", name = "a", descriptor = "(LRRWCTNMK;LEILHLJCE;I)V")
    public final void method475(class50 arg0, class17 arg1, int arg2) {
        if (arg2 < 0 || arg2 > 0) {
            return;
        }
        int var4 = arg1.method224();
        this.field1419[0] = var4 >> 4;
        this.field1419[1] = var4 & 0xF;
        if (var4 == 0) {
            this.field1422[0] = this.field1422[1] = 0;
            return;
        }
        this.field1422[0] = arg1.method226();
        this.field1422[1] = arg1.method226();
        int var5 = arg1.method224();
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var9 = 0; var9 < this.field1419[var6]; var9++) {
                this.field1420[var6][0][var9] = arg1.method226();
                this.field1421[var6][0][var9] = arg1.method226();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1419[var7]; var8++) {
                if ((var5 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1420[var7][1][var8] = this.field1420[var7][0][var8];
                    this.field1421[var7][1][var8] = this.field1421[var7][0][var8];
                } else {
                    this.field1420[var7][1][var8] = arg1.method226();
                    this.field1421[var7][1][var8] = arg1.method226();
                }
            }
        }
        if (var5 != 0 || this.field1422[1] != this.field1422[0]) {
            arg0.method444(arg1, 0);
        }
    }

    @OriginalMember(owner = "UVAKRMXV", name = "<init>", descriptor = "()V")
    public class61() {
        if (class30.field987) {
        }
    }
}
