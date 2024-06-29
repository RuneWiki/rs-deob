import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class51 {

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "[[[I")
    private int[][][] field928 = new int[2][2][4];

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "[I")
    public int[] field930 = new int[2];

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "[I")
    private int[] field934 = new int[2];

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "[[[I")
    private int[][][] field933 = new int[2][2][4];

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "[[F")
    private static float[][] field929 = new float[2][8];

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "[[I")
    public static int[][] field931 = new int[2][8];

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "F")
    private static float field935;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lig;Ljl;)V")
    public final void method428(class136 arg0, class53 arg1) {
        int var3 = arg0.method1012(4);
        this.field930[0] = var3 >> 4;
        this.field930[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field934[0] = this.field934[1] = 0;
            return;
        }
        this.field934[0] = arg0.method996(65280);
        this.field934[1] = arg0.method996(65280);
        int var4 = arg0.method1012(4);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field930[var5]; var8++) {
                this.field933[var5][0][var8] = arg0.method996(65280);
                this.field928[var5][0][var8] = arg0.method996(65280);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field930[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field933[var6][1][var7] = this.field933[var6][0][var7];
                    this.field928[var6][1][var7] = this.field928[var6][0][var7];
                } else {
                    this.field933[var6][1][var7] = arg0.method996(65280);
                    this.field928[var6][1][var7] = arg0.method996(65280);
                }
            }
        }
        if (var4 != 0 || this.field934[1] != this.field934[0]) {
            arg1.method438(arg0);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "()V")
    public static void method429() {
        field929 = null;
        field931 = null;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(F)F")
    private static final float method430(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IF)I")
    public final int method431(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field934[1] - this.field934[0]) * arg1 + (float) this.field934[0];
            float var4 = var3 * 0.0030517578F;
            field935 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field932 = (int) (field935 * 65536.0F);
        }
        if (this.field930[arg0] == 0) {
            return 0;
        }
        float var5 = this.method433(arg0, 0, arg1);
        field929[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method432(arg0, 0, arg1));
        field929[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field930[arg0]; var6++) {
            float var9 = this.method433(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method432(arg0, var6, arg1));
            float var11 = var9 * var9;
            field929[arg0][var6 * 2 + 1] = field929[arg0][var6 * 2 - 1] * var11;
            field929[arg0][var6 * 2] = field929[arg0][var6 * 2 - 1] * var10 + field929[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field929[arg0][var12] += field929[arg0][var12 - 1] * var10 + field929[arg0][var12 - 2] * var11;
            }
            field929[arg0][1] += field929[arg0][0] * var10 + var11;
            field929[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field930[0] * 2; var7++) {
                field929[0][var7] *= field935;
            }
        }
        for (int var8 = 0; var8 < this.field930[arg0] * 2; var8++) {
            field931[arg0][var8] = (int) (field929[arg0][var8] * 65536.0F);
        }
        return this.field930[arg0] * 2;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIF)F")
    private final float method432(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field933[arg0][1][arg1] - this.field933[arg0][0][arg1]) * arg2 + (float) this.field933[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method430(var5);
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(IIF)F")
    private final float method433(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field928[arg0][1][arg1] - this.field928[arg0][0][arg1]) * arg2 + (float) this.field928[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }
}
