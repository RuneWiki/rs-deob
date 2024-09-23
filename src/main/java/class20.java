import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("FCAOQJWY")
public class class20 {

    @OriginalMember(owner = "FCAOQJWY", name = "a", descriptor = "Z")
    private boolean field690 = true;

    @OriginalMember(owner = "FCAOQJWY", name = "b", descriptor = "B")
    private byte field691 = 48;

    @OriginalMember(owner = "FCAOQJWY", name = "c", descriptor = "I")
    private int field692 = 1;

    @OriginalMember(owner = "FCAOQJWY", name = "d", descriptor = "[I")
    public int[] field693 = new int[2];

    @OriginalMember(owner = "FCAOQJWY", name = "e", descriptor = "[[[I")
    public int[][][] field694 = new int[2][2][4];

    @OriginalMember(owner = "FCAOQJWY", name = "f", descriptor = "[[[I")
    public int[][][] field695 = new int[2][2][4];

    @OriginalMember(owner = "FCAOQJWY", name = "g", descriptor = "[I")
    public int[] field696 = new int[2];

    @OriginalMember(owner = "FCAOQJWY", name = "h", descriptor = "[[F")
    public static float[][] field697 = new float[2][8];

    @OriginalMember(owner = "FCAOQJWY", name = "i", descriptor = "[[I")
    public static int[][] field698 = new int[2][8];

    @OriginalMember(owner = "FCAOQJWY", name = "j", descriptor = "F")
    public static float field699;

    @OriginalMember(owner = "FCAOQJWY", name = "k", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "FCAOQJWY", name = "a", descriptor = "(BFII)F")
    private float method224(byte arg0, float arg1, int arg2, int arg3) {
        float var5 = (float) (this.field695[arg2][1][arg3] - this.field695[arg2][0][arg3]) * arg1 + (float) this.field695[arg2][0][arg3];
        float var6 = var5 * 0.0015258789F;
        if (arg0 == 7) {
            boolean var7 = false;
        } else {
            this.field690 = !this.field690;
        }
        return 1.0F - (float) Math.pow(10.0D, (double) (-var6 / 20.0F));
    }

    @OriginalMember(owner = "FCAOQJWY", name = "a", descriptor = "(BF)F")
    private float method225(byte arg0, float arg1) {
        if (arg0 != 48) {
            this.field690 = !this.field690;
        }
        float var3 = (float) Math.pow(2.0D, (double) arg1) * 32.703197F;
        return var3 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "FCAOQJWY", name = "a", descriptor = "(IIIF)F")
    private float method226(int arg0, int arg1, int arg2, float arg3) {
        float var5 = (float) (this.field694[arg1][1][arg2] - this.field694[arg1][0][arg2]) * arg3 + (float) this.field694[arg1][0][arg2];
        if (arg0 < 6 || arg0 > 6) {
            throw new NullPointerException();
        }
        float var6 = var5 * 1.2207031E-4F;
        return this.method225(this.field691, var6);
    }

    @OriginalMember(owner = "FCAOQJWY", name = "a", descriptor = "(FIZ)I")
    public int method227(float arg0, int arg1, boolean arg2) {
        if (arg1 == 0) {
            float var4 = (float) (this.field696[1] - this.field696[0]) * arg0 + (float) this.field696[0];
            float var5 = var4 * 0.0030517578F;
            field699 = (float) Math.pow(0.1D, (double) (var5 / 20.0F));
            field700 = (int) (field699 * 65536.0F);
        }
        if (this.field693[arg1] == 0) {
            return 0;
        }
        float var6 = this.method224((byte) 7, arg0, arg1, 0);
        field697[arg1][0] = var6 * -2.0F * (float) Math.cos((double) this.method226(6, arg1, 0, arg0));
        field697[arg1][1] = var6 * var6;
        for (int var7 = 1; var7 < this.field693[arg1]; var7++) {
            float var10 = this.method224((byte) 7, arg0, arg1, var7);
            float var11 = var10 * -2.0F * (float) Math.cos((double) this.method226(6, arg1, var7, arg0));
            float var12 = var10 * var10;
            field697[arg1][var7 * 2 + 1] = field697[arg1][var7 * 2 - 1] * var12;
            field697[arg1][var7 * 2] = field697[arg1][var7 * 2 - 1] * var11 + field697[arg1][var7 * 2 - 2] * var12;
            for (int var13 = var7 * 2 - 1; var13 >= 2; var13--) {
                field697[arg1][var13] += field697[arg1][var13 - 1] * var11 + field697[arg1][var13 - 2] * var12;
            }
            field697[arg1][1] += field697[arg1][0] * var11 + var12;
            field697[arg1][0] += var11;
        }
        if (!arg2) {
            return this.field692;
        }
        if (arg1 == 0) {
            for (int var8 = 0; var8 < this.field693[0] * 2; var8++) {
                field697[0][var8] *= field699;
            }
        }
        for (int var9 = 0; var9 < this.field693[arg1] * 2; var9++) {
            field698[arg1][var9] = (int) (field697[arg1][var9] * 65536.0F);
        }
        return this.field693[arg1] * 2;
    }

    @OriginalMember(owner = "FCAOQJWY", name = "a", descriptor = "(LBJPHZZMM;LXOUQUKZW;B)V")
    public final void method228(class5 arg0, class62 arg1, byte arg2) {
        int var4 = arg1.method521();
        this.field693[0] = var4 >> 4;
        this.field693[1] = var4 & 0xF;
        if (arg2 != -14) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (var4 == 0) {
            this.field696[0] = this.field696[1] = 0;
            return;
        }
        this.field696[0] = arg1.method523();
        this.field696[1] = arg1.method523();
        int var6 = arg1.method521();
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var10 = 0; var10 < this.field693[var7]; var10++) {
                this.field694[var7][0][var10] = arg1.method523();
                this.field695[var7][0][var10] = arg1.method523();
            }
        }
        for (int var8 = 0; var8 < 2; var8++) {
            for (int var9 = 0; var9 < this.field693[var8]; var9++) {
                if ((var6 & 0x1 << var8 * 4 << var9) == 0) {
                    this.field694[var8][1][var9] = this.field694[var8][0][var9];
                    this.field695[var8][1][var9] = this.field695[var8][0][var9];
                } else {
                    this.field694[var8][1][var9] = arg1.method523();
                    this.field695[var8][1][var9] = arg1.method523();
                }
            }
        }
        if (var6 != 0 || this.field696[1] != this.field696[0]) {
            arg0.method31(false, arg1);
        }
    }

    @OriginalMember(owner = "FCAOQJWY", name = "<init>", descriptor = "()V")
    public class20() {
        if (class54.field1472) {
        }
    }
}
