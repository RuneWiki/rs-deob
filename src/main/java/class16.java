import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ERCNIFTI")
public class class16 {

    @OriginalMember(owner = "ERCNIFTI", name = "a", descriptor = "Z")
    private boolean field694 = true;

    @OriginalMember(owner = "ERCNIFTI", name = "b", descriptor = "I")
    private int field695 = -667;

    @OriginalMember(owner = "ERCNIFTI", name = "c", descriptor = "Z")
    private boolean field696 = false;

    @OriginalMember(owner = "ERCNIFTI", name = "d", descriptor = "[I")
    public int[] field697 = new int[2];

    @OriginalMember(owner = "ERCNIFTI", name = "e", descriptor = "[[[I")
    public int[][][] field698 = new int[2][2][4];

    @OriginalMember(owner = "ERCNIFTI", name = "f", descriptor = "[[[I")
    public int[][][] field699 = new int[2][2][4];

    @OriginalMember(owner = "ERCNIFTI", name = "g", descriptor = "[I")
    public int[] field700 = new int[2];

    @OriginalMember(owner = "ERCNIFTI", name = "h", descriptor = "[[F")
    public static float[][] field701 = new float[2][8];

    @OriginalMember(owner = "ERCNIFTI", name = "i", descriptor = "[[I")
    public static int[][] field702 = new int[2][8];

    @OriginalMember(owner = "ERCNIFTI", name = "j", descriptor = "F")
    public static float field703;

    @OriginalMember(owner = "ERCNIFTI", name = "k", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "ERCNIFTI", name = "a", descriptor = "(FIII)F")
    private float method235(float arg0, int arg1, int arg2, int arg3) {
        float var5 = (float) (this.field699[arg1][1][arg3] - this.field699[arg1][0][arg3]) * arg0 + (float) this.field699[arg1][0][arg3];
        float var6 = var5 * 0.0015258789F;
        if (arg2 < 6 || arg2 > 6) {
            throw new NullPointerException();
        }
        return 1.0F - (float) Math.pow(10.0D, (double) (-var6 / 20.0F));
    }

    @OriginalMember(owner = "ERCNIFTI", name = "a", descriptor = "(IF)F")
    private float method236(int arg0, float arg1) {
        if (arg0 >= 0) {
            this.field696 = !this.field696;
        }
        float var3 = (float) Math.pow(2.0D, (double) arg1) * 32.703197F;
        return var3 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "ERCNIFTI", name = "a", descriptor = "(IIIF)F")
    private float method237(int arg0, int arg1, int arg2, float arg3) {
        float var5 = (float) (this.field698[arg1][1][arg2] - this.field698[arg1][0][arg2]) * arg3 + (float) this.field698[arg1][0][arg2];
        float var6 = var5 * 1.2207031E-4F;
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        return this.method236(this.field695, var6);
    }

    @OriginalMember(owner = "ERCNIFTI", name = "a", descriptor = "(FII)I")
    public int method238(float arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            float var4 = (float) (this.field700[1] - this.field700[0]) * arg0 + (float) this.field700[0];
            float var5 = var4 * 0.0030517578F;
            field703 = (float) Math.pow(0.1D, (double) (var5 / 20.0F));
            field704 = (int) (field703 * 65536.0F);
        }
        if (this.field697[arg1] == 0) {
            return 0;
        }
        float var6 = this.method235(arg0, arg1, 6, 0);
        field701[arg1][0] = var6 * -2.0F * (float) Math.cos((double) this.method237(0, arg1, 0, arg0));
        if (arg2 >= 0) {
            this.field694 = !this.field694;
        }
        field701[arg1][1] = var6 * var6;
        for (int var7 = 1; var7 < this.field697[arg1]; var7++) {
            float var10 = this.method235(arg0, arg1, 6, var7);
            float var11 = var10 * -2.0F * (float) Math.cos((double) this.method237(0, arg1, var7, arg0));
            float var12 = var10 * var10;
            field701[arg1][var7 * 2 + 1] = field701[arg1][var7 * 2 - 1] * var12;
            field701[arg1][var7 * 2] = field701[arg1][var7 * 2 - 1] * var11 + field701[arg1][var7 * 2 - 2] * var12;
            for (int var13 = var7 * 2 - 1; var13 >= 2; var13--) {
                field701[arg1][var13] += field701[arg1][var13 - 1] * var11 + field701[arg1][var13 - 2] * var12;
            }
            field701[arg1][1] += field701[arg1][0] * var11 + var12;
            field701[arg1][0] += var11;
        }
        if (arg1 == 0) {
            for (int var8 = 0; var8 < this.field697[0] * 2; var8++) {
                field701[0][var8] *= field703;
            }
        }
        for (int var9 = 0; var9 < this.field697[arg1] * 2; var9++) {
            field702[arg1][var9] = (int) (field701[arg1][var9] * 65536.0F);
        }
        return this.field697[arg1] * 2;
    }

    @OriginalMember(owner = "ERCNIFTI", name = "a", descriptor = "(ZLLDILQFVA;LNXAZLFDC;)V")
    public final void method239(boolean arg0, class34 arg1, class41 arg2) {
        if (arg0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        int var5 = arg1.method402();
        this.field697[0] = var5 >> 4;
        this.field697[1] = var5 & 0xF;
        if (var5 == 0) {
            this.field700[0] = this.field700[1] = 0;
            return;
        }
        this.field700[0] = arg1.method404();
        this.field700[1] = arg1.method404();
        int var6 = arg1.method402();
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var10 = 0; var10 < this.field697[var7]; var10++) {
                this.field698[var7][0][var10] = arg1.method404();
                this.field699[var7][0][var10] = arg1.method404();
            }
        }
        for (int var8 = 0; var8 < 2; var8++) {
            for (int var9 = 0; var9 < this.field697[var8]; var9++) {
                if ((var6 & 0x1 << var8 * 4 << var9) == 0) {
                    this.field698[var8][1][var9] = this.field698[var8][0][var9];
                    this.field699[var8][1][var9] = this.field699[var8][0][var9];
                } else {
                    this.field698[var8][1][var9] = arg1.method404();
                    this.field699[var8][1][var9] = arg1.method404();
                }
            }
        }
        if (var6 != 0 || this.field700[1] != this.field700[0]) {
            arg2.method499(arg1, false);
        }
    }

    @OriginalMember(owner = "ERCNIFTI", name = "<init>", descriptor = "()V")
    public class16() {
        if (class6.field545) {
        }
    }
}
