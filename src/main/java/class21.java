import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class21 {

    @OriginalMember(owner = "client!an", name = "e", descriptor = "[[[I")
    private int[][][] field208 = new int[2][2][4];

    @OriginalMember(owner = "client!an", name = "b", descriptor = "[I")
    public int[] field205 = new int[2];

    @OriginalMember(owner = "client!an", name = "f", descriptor = "[[[I")
    private int[][][] field209 = new int[2][2][4];

    @OriginalMember(owner = "client!an", name = "c", descriptor = "[I")
    private int[] field206 = new int[2];

    @OriginalMember(owner = "client!an", name = "d", descriptor = "[[F")
    private static float[][] field207 = new float[2][8];

    @OriginalMember(owner = "client!an", name = "h", descriptor = "[[I")
    public static int[][] field211 = new int[2][8];

    @OriginalMember(owner = "client!an", name = "a", descriptor = "F")
    private static float field204;

    @OriginalMember(owner = "client!an", name = "g", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IF)I", line = 5)
    public final int method128(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field206[1] - this.field206[0]) * arg1 + (float) this.field206[0];
            float var4 = var3 * 0.0030517578F;
            field204 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field210 = (int) (field204 * 65536.0F);
        }
        if (this.field205[arg0] == 0) {
            return 0;
        }
        float var5 = this.method132(arg0, 0, arg1);
        field207[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method130(arg0, 0, arg1));
        field207[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field205[arg0]; var6++) {
            float var9 = this.method132(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method130(arg0, var6, arg1));
            float var11 = var9 * var9;
            field207[arg0][var6 * 2 + 1] = field207[arg0][var6 * 2 - 1] * var11;
            field207[arg0][var6 * 2] = field207[arg0][var6 * 2 - 1] * var10 + field207[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field207[arg0][var12] += field207[arg0][var12 - 1] * var10 + field207[arg0][var12 - 2] * var11;
            }
            field207[arg0][1] += field207[arg0][0] * var10 + var11;
            field207[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field205[0] * 2; var7++) {
                field207[0][var7] *= field204;
            }
        }
        for (int var8 = 0; var8 < this.field205[arg0] * 2; var8++) {
            field211[arg0][var8] = (int) (field207[arg0][var8] * 65536.0F);
        }
        return this.field205[arg0] * 2;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(F)F", line = 75)
    private static final float method129(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IIF)F", line = 89)
    private final float method130(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field208[arg0][1][arg1] - this.field208[arg0][0][arg1]) * arg2 + (float) this.field208[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method129(var5);
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "()V", line = 98)
    public static void method131() {
        field207 = null;
        field211 = null;
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(IIF)F", line = 104)
    private final float method132(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field209[arg0][1][arg1] - this.field209[arg0][0][arg1]) * arg2 + (float) this.field209[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Lrt;Lke;)V", line = 116)
    public final void method133(class194 arg0, class520 arg1) {
        int var3 = arg0.method1177(255);
        this.field205[0] = var3 >> 4;
        this.field205[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field206[0] = this.field206[1] = 0;
            return;
        }
        this.field206[0] = arg0.method1220(-86);
        this.field206[1] = arg0.method1220(121);
        int var4 = arg0.method1177(255);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field205[var5]; var8++) {
                this.field208[var5][0][var8] = arg0.method1220(-83);
                this.field209[var5][0][var8] = arg0.method1220(119);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field205[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field208[var6][1][var7] = this.field208[var6][0][var7];
                    this.field209[var6][1][var7] = this.field209[var6][0][var7];
                } else {
                    this.field208[var6][1][var7] = arg0.method1220(-59);
                    this.field209[var6][1][var7] = arg0.method1220(122);
                }
            }
        }
        if (var4 != 0 || this.field206[1] != this.field206[0]) {
            arg1.method3077(arg0);
        }
    }
}
