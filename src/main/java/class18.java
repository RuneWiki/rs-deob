import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class18 {

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "[I")
    public int[] field202 = new int[2];

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "[[[I")
    private int[][][] field205 = new int[2][2][4];

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "[[[I")
    private int[][][] field208 = new int[2][2][4];

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "[I")
    private int[] field207 = new int[2];

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "[[F")
    private static float[][] field201 = new float[2][8];

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "[[I")
    public static int[][] field204 = new int[2][8];

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "F")
    private static float field203;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(F)F")
    private static final float method100(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "()V")
    public static void method101() {
        field201 = null;
        field204 = null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIF)F")
    private final float method102(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field205[arg0][1][arg1] - this.field205[arg0][0][arg1]) * arg2 + (float) this.field205[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(IIF)F")
    private final float method103(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field208[arg0][1][arg1] - this.field208[arg0][0][arg1]) * arg2 + (float) this.field208[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method100(var5);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lfd;Lck;)V")
    public final void method104(class418 arg0, class208 arg1) {
        int var3 = arg0.method2396(68);
        this.field202[0] = var3 >> 4;
        this.field202[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field207[0] = this.field207[1] = 0;
            return;
        }
        this.field207[0] = arg0.method2393(-30727);
        this.field207[1] = arg0.method2393(-30727);
        int var4 = arg0.method2396(-123);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field202[var5]; var8++) {
                this.field208[var5][0][var8] = arg0.method2393(-30727);
                this.field205[var5][0][var8] = arg0.method2393(-30727);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field202[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field208[var6][1][var7] = this.field208[var6][0][var7];
                    this.field205[var6][1][var7] = this.field205[var6][0][var7];
                } else {
                    this.field208[var6][1][var7] = arg0.method2393(-30727);
                    this.field205[var6][1][var7] = arg0.method2393(-30727);
                }
            }
        }
        if (var4 != 0 || this.field207[1] != this.field207[0]) {
            arg1.method1335(arg0);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IF)I")
    public final int method105(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field207[1] - this.field207[0]) * arg1 + (float) this.field207[0];
            float var4 = var3 * 0.0030517578F;
            field203 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field206 = (int) (field203 * 65536.0F);
        }
        if (this.field202[arg0] == 0) {
            return 0;
        }
        float var5 = this.method102(arg0, 0, arg1);
        field201[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method103(arg0, 0, arg1));
        field201[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field202[arg0]; var6++) {
            float var9 = this.method102(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method103(arg0, var6, arg1));
            float var11 = var9 * var9;
            field201[arg0][var6 * 2 + 1] = field201[arg0][var6 * 2 - 1] * var11;
            field201[arg0][var6 * 2] = field201[arg0][var6 * 2 - 1] * var10 + field201[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field201[arg0][var12] += field201[arg0][var12 - 1] * var10 + field201[arg0][var12 - 2] * var11;
            }
            field201[arg0][1] += field201[arg0][0] * var10 + var11;
            field201[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field202[0] * 2; var7++) {
                field201[0][var7] *= field203;
            }
        }
        for (int var8 = 0; var8 < this.field202[arg0] * 2; var8++) {
            field204[arg0][var8] = (int) (field201[arg0][var8] * 65536.0F);
        }
        return this.field202[arg0] * 2;
    }
}
