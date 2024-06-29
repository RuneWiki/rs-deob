import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class7 {

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "[[[I")
    private int[][][] field59 = new int[2][2][4];

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "[I")
    public int[] field60 = new int[2];

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "[I")
    private int[] field62 = new int[2];

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "[[[I")
    private int[][][] field63 = new int[2][2][4];

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "[[I")
    public static int[][] field56 = new int[2][8];

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "[[F")
    private static float[][] field58 = new float[2][8];

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "F")
    private static float field57;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIF)F", line = 6)
    private final float method41(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field59[arg0][1][arg1] - this.field59[arg0][0][arg1]) * arg2 + (float) this.field59[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lbc;Lub;)V", line = 23)
    public final void method42(class153 arg0, class11 arg1) {
        int var3 = arg0.method1082(-35);
        this.field60[0] = var3 >> 4;
        this.field60[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field62[0] = this.field62[1] = 0;
            return;
        }
        this.field62[0] = arg0.method1090(false);
        this.field62[1] = arg0.method1090(false);
        int var4 = arg0.method1082(-67);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field60[var5]; var6++) {
                this.field63[var5][0][var6] = arg0.method1090(false);
                this.field59[var5][0][var6] = arg0.method1090(false);
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field60[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field63[var7][1][var8] = this.field63[var7][0][var8];
                    this.field59[var7][1][var8] = this.field59[var7][0][var8];
                } else {
                    this.field63[var7][1][var8] = arg0.method1090(false);
                    this.field59[var7][1][var8] = arg0.method1090(false);
                }
            }
        }
        if (var4 != 0 || this.field62[1] != this.field62[0]) {
            arg1.method67(arg0);
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IF)I", line = 91)
    public final int method43(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field62[1] - this.field62[0]) * arg1 + (float) this.field62[0];
            float var4 = var3 * 0.0030517578F;
            field57 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field61 = (int) (field57 * 65536.0F);
        }
        if (this.field60[arg0] == 0) {
            return 0;
        }
        float var5 = this.method41(arg0, 0, arg1);
        field58[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method46(arg0, 0, arg1));
        field58[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field60[arg0]; var6++) {
            float var7 = this.method41(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method46(arg0, var6, arg1));
            float var9 = var7 * var7;
            field58[arg0][var6 * 2 + 1] = field58[arg0][var6 * 2 - 1] * var9;
            field58[arg0][var6 * 2] = field58[arg0][var6 * 2 - 1] * var8 + field58[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field58[arg0][var10] += field58[arg0][var10 - 1] * var8 + field58[arg0][var10 - 2] * var9;
            }
            field58[arg0][1] += field58[arg0][0] * var8 + var9;
            field58[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field60[0] * 2; var11++) {
                field58[0][var11] *= field57;
            }
        }
        for (int var12 = 0; var12 < this.field60[arg0] * 2; var12++) {
            field56[arg0][var12] = (int) (field58[arg0][var12] * 65536.0F);
        }
        return this.field60[arg0] * 2;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "()V", line = 152)
    public static void method44() {
        field58 = (float[][]) null;
        field56 = (int[][]) null;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(F)F", line = 158)
    private static final float method45(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(IIF)F", line = 164)
    private final float method46(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field63[arg0][1][arg1] - this.field63[arg0][0][arg1]) * arg2 + (float) this.field63[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method45(var5);
    }
}
