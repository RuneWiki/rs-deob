import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("DJKDKZEW")
public class class13 {

    @OriginalMember(owner = "DJKDKZEW", name = "b", descriptor = "[I")
    public int[] field646 = new int[2];

    @OriginalMember(owner = "DJKDKZEW", name = "c", descriptor = "[[[I")
    public int[][][] field647 = new int[2][2][4];

    @OriginalMember(owner = "DJKDKZEW", name = "d", descriptor = "[[[I")
    public int[][][] field648 = new int[2][2][4];

    @OriginalMember(owner = "DJKDKZEW", name = "e", descriptor = "[I")
    public int[] field649 = new int[2];

    @OriginalMember(owner = "DJKDKZEW", name = "f", descriptor = "[[F")
    public static float[][] field650 = new float[2][8];

    @OriginalMember(owner = "DJKDKZEW", name = "g", descriptor = "[[I")
    public static int[][] field651 = new int[2][8];

    @OriginalMember(owner = "DJKDKZEW", name = "h", descriptor = "F")
    public static float field652;

    @OriginalMember(owner = "DJKDKZEW", name = "a", descriptor = "I")
    private int field645;

    @OriginalMember(owner = "DJKDKZEW", name = "i", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "DJKDKZEW", name = "a", descriptor = "(IIFI)F")
    private float method209(int arg0, int arg1, float arg2, int arg3) {
        while (arg1 >= 0) {
            this.field645 = -57;
        }
        float var5 = (float) (this.field648[arg3][1][arg0] - this.field648[arg3][0][arg0]) * arg2 + (float) this.field648[arg3][0][arg0];
        float var6 = var5 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var6 / 20.0F));
    }

    @OriginalMember(owner = "DJKDKZEW", name = "a", descriptor = "(IF)F")
    private float method210(int arg0, float arg1) {
        float var3 = (float) Math.pow(2.0D, (double) arg1) * 32.703197F;
        if (arg0 < 9 || arg0 > 9) {
            throw new NullPointerException();
        }
        return var3 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "DJKDKZEW", name = "a", descriptor = "(IIIF)F")
    private float method211(int arg0, int arg1, int arg2, float arg3) {
        if (arg0 < 8 || arg0 > 8) {
            this.field645 = 400;
        }
        float var5 = (float) (this.field647[arg1][1][arg2] - this.field647[arg1][0][arg2]) * arg3 + (float) this.field647[arg1][0][arg2];
        float var6 = var5 * 1.2207031E-4F;
        return this.method210(9, var6);
    }

    @OriginalMember(owner = "DJKDKZEW", name = "a", descriptor = "(FZI)I")
    public int method212(float arg0, boolean arg1, int arg2) {
        if (arg2 == 0) {
            float var4 = (float) (this.field649[1] - this.field649[0]) * arg0 + (float) this.field649[0];
            float var5 = var4 * 0.0030517578F;
            field652 = (float) Math.pow(0.1D, (double) (var5 / 20.0F));
            field653 = (int) (field652 * 65536.0F);
        }
        if (this.field646[arg2] == 0) {
            return 0;
        }
        float var6 = this.method209(0, -920, arg0, arg2);
        if (!arg1) {
            return this.field645;
        }
        field650[arg2][0] = var6 * -2.0F * (float) Math.cos((double) this.method211(8, arg2, 0, arg0));
        field650[arg2][1] = var6 * var6;
        for (int var7 = 1; var7 < this.field646[arg2]; var7++) {
            float var10 = this.method209(var7, -920, arg0, arg2);
            float var11 = var10 * -2.0F * (float) Math.cos((double) this.method211(8, arg2, var7, arg0));
            float var12 = var10 * var10;
            field650[arg2][var7 * 2 + 1] = field650[arg2][var7 * 2 - 1] * var12;
            field650[arg2][var7 * 2] = field650[arg2][var7 * 2 - 1] * var11 + field650[arg2][var7 * 2 - 2] * var12;
            for (int var13 = var7 * 2 - 1; var13 >= 2; var13--) {
                field650[arg2][var13] += field650[arg2][var13 - 1] * var11 + field650[arg2][var13 - 2] * var12;
            }
            field650[arg2][1] += field650[arg2][0] * var11 + var12;
            field650[arg2][0] += var11;
        }
        if (arg2 == 0) {
            for (int var8 = 0; var8 < this.field646[0] * 2; var8++) {
                field650[0][var8] *= field652;
            }
        }
        for (int var9 = 0; var9 < this.field646[arg2] * 2; var9++) {
            field651[arg2][var9] = (int) (field650[arg2][var9] * 65536.0F);
        }
        return this.field646[arg2] * 2;
    }

    @OriginalMember(owner = "DJKDKZEW", name = "a", descriptor = "(LENGZWEMK;LPKHWFJLM;I)V")
    public final void method213(class17 arg0, class43 arg1, int arg2) {
        int var4 = arg1.method330();
        if (arg2 >= 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        this.field646[0] = var4 >> 4;
        this.field646[1] = var4 & 0xF;
        if (var4 == 0) {
            this.field649[0] = this.field649[1] = 0;
            if (class27.field922) {
            }
            return;
        }
        this.field649[0] = arg1.method332();
        this.field649[1] = arg1.method332();
        int var6 = arg1.method330();
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var10 = 0; var10 < this.field646[var7]; var10++) {
                this.field647[var7][0][var10] = arg1.method332();
                this.field648[var7][0][var10] = arg1.method332();
            }
        }
        for (int var8 = 0; var8 < 2; var8++) {
            for (int var9 = 0; var9 < this.field646[var8]; var9++) {
                if ((var6 & 0x1 << var8 * 4 << var9) == 0) {
                    this.field647[var8][1][var9] = this.field647[var8][0][var9];
                    this.field648[var8][1][var9] = this.field648[var8][0][var9];
                } else {
                    this.field647[var8][1][var9] = arg1.method332();
                    this.field648[var8][1][var9] = arg1.method332();
                }
            }
        }
        if (var6 != 0 || this.field649[1] != this.field649[0]) {
            arg0.method222(arg1, false);
        }
    }
}
