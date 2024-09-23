import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("LNMFPXZK")
public class class38 {

    @OriginalMember(owner = "LNMFPXZK", name = "a", descriptor = "I")
    private int field975 = -45819;

    @OriginalMember(owner = "LNMFPXZK", name = "b", descriptor = "I")
    private int field976 = -308;

    @OriginalMember(owner = "LNMFPXZK", name = "c", descriptor = "[I")
    public int[] field977 = new int[2];

    @OriginalMember(owner = "LNMFPXZK", name = "d", descriptor = "[[[I")
    public int[][][] field978 = new int[2][2][4];

    @OriginalMember(owner = "LNMFPXZK", name = "e", descriptor = "[[[I")
    public int[][][] field979 = new int[2][2][4];

    @OriginalMember(owner = "LNMFPXZK", name = "f", descriptor = "[I")
    public int[] field980 = new int[2];

    @OriginalMember(owner = "LNMFPXZK", name = "g", descriptor = "[[F")
    public static float[][] field981 = new float[2][8];

    @OriginalMember(owner = "LNMFPXZK", name = "h", descriptor = "[[I")
    public static int[][] field982 = new int[2][8];

    @OriginalMember(owner = "LNMFPXZK", name = "i", descriptor = "F")
    public static float field983;

    @OriginalMember(owner = "LNMFPXZK", name = "j", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "LNMFPXZK", name = "a", descriptor = "(FIII)F")
    private float method363(float arg0, int arg1, int arg2, int arg3) {
        float var5 = (float) (this.field979[arg2][1][arg1] - this.field979[arg2][0][arg1]) * arg0 + (float) this.field979[arg2][0][arg1];
        float var6 = var5 * 0.0015258789F;
        if (arg3 >= 0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        return 1.0F - (float) Math.pow(10.0D, (double) (-var6 / 20.0F));
    }

    @OriginalMember(owner = "LNMFPXZK", name = "a", descriptor = "(FI)F")
    private float method364(float arg0, int arg1) {
        if (arg1 < 2 || arg1 > 2) {
            throw new NullPointerException();
        }
        float var3 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var3 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "LNMFPXZK", name = "b", descriptor = "(FIII)F")
    private float method365(float arg0, int arg1, int arg2, int arg3) {
        if (arg1 >= 0) {
            throw new NullPointerException();
        }
        float var5 = (float) (this.field978[arg2][1][arg3] - this.field978[arg2][0][arg3]) * arg0 + (float) this.field978[arg2][0][arg3];
        float var6 = var5 * 1.2207031E-4F;
        return this.method364(var6, 2);
    }

    @OriginalMember(owner = "LNMFPXZK", name = "a", descriptor = "(FII)I")
    public int method366(float arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            float var4 = (float) (this.field980[1] - this.field980[0]) * arg0 + (float) this.field980[0];
            float var5 = var4 * 0.0030517578F;
            field983 = (float) Math.pow(0.1D, (double) (var5 / 20.0F));
            field984 = (int) (field983 * 65536.0F);
        }
        if (this.field977[arg1] == 0) {
            return 0;
        }
        float var6 = this.method363(arg0, 0, arg1, this.field976);
        if (arg2 != 0) {
            this.field976 = -362;
        }
        field981[arg1][0] = var6 * -2.0F * (float) Math.cos((double) this.method365(arg0, -648, arg1, 0));
        field981[arg1][1] = var6 * var6;
        for (int var7 = 1; var7 < this.field977[arg1]; var7++) {
            float var10 = this.method363(arg0, var7, arg1, this.field976);
            float var11 = var10 * -2.0F * (float) Math.cos((double) this.method365(arg0, -648, arg1, var7));
            float var12 = var10 * var10;
            field981[arg1][var7 * 2 + 1] = field981[arg1][var7 * 2 - 1] * var12;
            field981[arg1][var7 * 2] = field981[arg1][var7 * 2 - 1] * var11 + field981[arg1][var7 * 2 - 2] * var12;
            for (int var13 = var7 * 2 - 1; var13 >= 2; var13--) {
                field981[arg1][var13] += field981[arg1][var13 - 1] * var11 + field981[arg1][var13 - 2] * var12;
            }
            field981[arg1][1] += field981[arg1][0] * var11 + var12;
            field981[arg1][0] += var11;
        }
        if (arg1 == 0) {
            for (int var8 = 0; var8 < this.field977[0] * 2; var8++) {
                field981[0][var8] *= field983;
            }
        }
        for (int var9 = 0; var9 < this.field977[arg1] * 2; var9++) {
            field982[arg1][var9] = (int) (field981[arg1][var9] * 65536.0F);
        }
        return this.field977[arg1] * 2;
    }

    @OriginalMember(owner = "LNMFPXZK", name = "a", descriptor = "(LSSKEPHYP;ILJHKSAGUC;)V")
    public final void method367(class60 arg0, int arg1, class31 arg2) {
        if (arg1 != 0) {
            this.field975 = -284;
        }
        int var4 = arg2.method306();
        this.field977[0] = var4 >> 4;
        this.field977[1] = var4 & 0xF;
        if (var4 == 0) {
            this.field980[0] = this.field980[1] = 0;
            if (class29.field878) {
            }
            return;
        }
        this.field980[0] = arg2.method308();
        this.field980[1] = arg2.method308();
        int var5 = arg2.method306();
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var9 = 0; var9 < this.field977[var6]; var9++) {
                this.field978[var6][0][var9] = arg2.method308();
                this.field979[var6][0][var9] = arg2.method308();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field977[var7]; var8++) {
                if ((var5 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field978[var7][1][var8] = this.field978[var7][0][var8];
                    this.field979[var7][1][var8] = this.field979[var7][0][var8];
                } else {
                    this.field978[var7][1][var8] = arg2.method308();
                    this.field979[var7][1][var8] = arg2.method308();
                }
            }
        }
        if (var5 != 0 || this.field980[1] != this.field980[0]) {
            arg0.method480(arg2, 8);
        }
    }
}
