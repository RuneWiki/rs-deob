import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("PKLJDULJ")
public class class41 {

    @OriginalMember(owner = "PKLJDULJ", name = "a", descriptor = "Z")
    private boolean field1207 = false;

    @OriginalMember(owner = "PKLJDULJ", name = "b", descriptor = "Z")
    private boolean field1208 = true;

    @OriginalMember(owner = "PKLJDULJ", name = "c", descriptor = "[I")
    public int[] field1209 = new int[2];

    @OriginalMember(owner = "PKLJDULJ", name = "d", descriptor = "[[[I")
    public int[][][] field1210 = new int[2][2][4];

    @OriginalMember(owner = "PKLJDULJ", name = "e", descriptor = "[[[I")
    public int[][][] field1211 = new int[2][2][4];

    @OriginalMember(owner = "PKLJDULJ", name = "f", descriptor = "[I")
    public int[] field1212 = new int[2];

    @OriginalMember(owner = "PKLJDULJ", name = "g", descriptor = "[[F")
    public static float[][] field1213 = new float[2][8];

    @OriginalMember(owner = "PKLJDULJ", name = "h", descriptor = "[[I")
    public static int[][] field1214 = new int[2][8];

    @OriginalMember(owner = "PKLJDULJ", name = "i", descriptor = "F")
    public static float field1215;

    @OriginalMember(owner = "PKLJDULJ", name = "j", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "PKLJDULJ", name = "a", descriptor = "(ZIIF)F")
    private float method421(boolean arg0, int arg1, int arg2, float arg3) {
        if (arg0) {
            throw new NullPointerException();
        }
        float var5 = (float) (this.field1211[arg2][1][arg1] - this.field1211[arg2][0][arg1]) * arg3 + (float) this.field1211[arg2][0][arg1];
        float var6 = var5 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var6 / 20.0F));
    }

    @OriginalMember(owner = "PKLJDULJ", name = "a", descriptor = "(FZ)F")
    private float method422(float arg0, boolean arg1) {
        if (!arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        float var4 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var4 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "PKLJDULJ", name = "b", descriptor = "(ZIIF)F")
    private float method423(boolean arg0, int arg1, int arg2, float arg3) {
        if (arg0) {
            throw new NullPointerException();
        }
        float var5 = (float) (this.field1210[arg1][1][arg2] - this.field1210[arg1][0][arg2]) * arg3 + (float) this.field1210[arg1][0][arg2];
        float var6 = var5 * 1.2207031E-4F;
        return this.method422(var6, this.field1208);
    }

    @OriginalMember(owner = "PKLJDULJ", name = "a", descriptor = "(FII)I")
    public int method424(float arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            float var4 = (float) (this.field1212[1] - this.field1212[0]) * arg0 + (float) this.field1212[0];
            float var5 = var4 * 0.0030517578F;
            field1215 = (float) Math.pow(0.1D, (double) (var5 / 20.0F));
            field1216 = (int) (field1215 * 65536.0F);
        }
        if (this.field1209[arg1] == 0) {
            return 0;
        }
        float var6 = this.method421(false, 0, arg1, arg0);
        if (arg2 != 0) {
            this.field1207 = !this.field1207;
        }
        field1213[arg1][0] = var6 * -2.0F * (float) Math.cos((double) this.method423(false, arg1, 0, arg0));
        field1213[arg1][1] = var6 * var6;
        for (int var7 = 1; var7 < this.field1209[arg1]; var7++) {
            float var10 = this.method421(false, var7, arg1, arg0);
            float var11 = var10 * -2.0F * (float) Math.cos((double) this.method423(false, arg1, var7, arg0));
            float var12 = var10 * var10;
            field1213[arg1][var7 * 2 + 1] = field1213[arg1][var7 * 2 - 1] * var12;
            field1213[arg1][var7 * 2] = field1213[arg1][var7 * 2 - 1] * var11 + field1213[arg1][var7 * 2 - 2] * var12;
            for (int var13 = var7 * 2 - 1; var13 >= 2; var13--) {
                field1213[arg1][var13] += field1213[arg1][var13 - 1] * var11 + field1213[arg1][var13 - 2] * var12;
            }
            field1213[arg1][1] += field1213[arg1][0] * var11 + var12;
            field1213[arg1][0] += var11;
        }
        if (arg1 == 0) {
            for (int var8 = 0; var8 < this.field1209[0] * 2; var8++) {
                field1213[0][var8] *= field1215;
            }
        }
        for (int var9 = 0; var9 < this.field1209[arg1] * 2; var9++) {
            field1214[arg1][var9] = (int) (field1213[arg1][var9] * 65536.0F);
        }
        return this.field1209[arg1] * 2;
    }

    @OriginalMember(owner = "PKLJDULJ", name = "a", descriptor = "(ILNHEPCMLW;LAUPOWMGG;)V")
    public final void method425(int arg0, class35 arg1, class1 arg2) {
        int var4 = arg1.method349();
        if (arg0 != 0) {
            this.field1207 = !this.field1207;
        }
        this.field1209[0] = var4 >> 4;
        this.field1209[1] = var4 & 0xF;
        if (var4 == 0) {
            this.field1212[0] = this.field1212[1] = 0;
            if (class34.field1089) {
            }
            return;
        }
        this.field1212[0] = arg1.method351();
        this.field1212[1] = arg1.method351();
        int var5 = arg1.method349();
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var9 = 0; var9 < this.field1209[var6]; var9++) {
                this.field1210[var6][0][var9] = arg1.method351();
                this.field1211[var6][0][var9] = arg1.method351();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1209[var7]; var8++) {
                if ((var5 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1210[var7][1][var8] = this.field1210[var7][0][var8];
                    this.field1211[var7][1][var8] = this.field1211[var7][0][var8];
                } else {
                    this.field1210[var7][1][var8] = arg1.method351();
                    this.field1211[var7][1][var8] = arg1.method351();
                }
            }
        }
        if (var5 != 0 || this.field1212[1] != this.field1212[0]) {
            arg2.method2(arg1, (byte) 7);
        }
    }
}
