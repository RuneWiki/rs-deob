import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class330 {

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "[[[I")
    private int[][][] field5112 = new int[2][2][4];

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "[[[I")
    private int[][][] field5113 = new int[2][2][4];

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "[I")
    public int[] field5111 = new int[2];

    @OriginalMember(owner = "client!qp", name = "e", descriptor = "[I")
    private int[] field5115 = new int[2];

    @OriginalMember(owner = "client!qp", name = "f", descriptor = "[[I")
    public static int[][] field5116 = new int[2][8];

    @OriginalMember(owner = "client!qp", name = "h", descriptor = "[[F")
    private static float[][] field5118 = new float[2][8];

    @OriginalMember(owner = "client!qp", name = "g", descriptor = "F")
    private static float field5117;

    @OriginalMember(owner = "client!qp", name = "d", descriptor = "I")
    public static int field5114;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIF)F")
    private final float method2130(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field5112[arg0][1][arg1] - this.field5112[arg0][0][arg1]) * arg2 + (float) this.field5112[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IF)I")
    public final int method2131(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field5115[1] - this.field5115[0]) * arg1 + (float) this.field5115[0];
            float var4 = var3 * 0.0030517578F;
            field5117 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field5114 = (int) (field5117 * 65536.0F);
        }
        if (this.field5111[arg0] == 0) {
            return 0;
        }
        float var5 = this.method2130(arg0, 0, arg1);
        field5118[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method2134(arg0, 0, arg1));
        field5118[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field5111[arg0]; var6++) {
            float var9 = this.method2130(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method2134(arg0, var6, arg1));
            float var11 = var9 * var9;
            field5118[arg0][var6 * 2 + 1] = field5118[arg0][var6 * 2 - 1] * var11;
            field5118[arg0][var6 * 2] = field5118[arg0][var6 * 2 - 1] * var10 + field5118[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field5118[arg0][var12] += field5118[arg0][var12 - 1] * var10 + field5118[arg0][var12 - 2] * var11;
            }
            field5118[arg0][1] += field5118[arg0][0] * var10 + var11;
            field5118[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field5111[0] * 2; var7++) {
                field5118[0][var7] *= field5117;
            }
        }
        for (int var8 = 0; var8 < this.field5111[arg0] * 2; var8++) {
            field5116[arg0][var8] = (int) (field5118[arg0][var8] * 65536.0F);
        }
        return this.field5111[arg0] * 2;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "()V")
    public static void method2132() {
        field5118 = null;
        field5116 = null;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Ltl;Lov;)V")
    public final void method2133(class91 arg0, class22 arg1) {
        int var3 = arg0.method618((byte) 100);
        this.field5111[0] = var3 >> 4;
        this.field5111[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field5115[0] = this.field5115[1] = 0;
            return;
        }
        this.field5115[0] = arg0.method631(10494);
        this.field5115[1] = arg0.method631(10494);
        int var4 = arg0.method618((byte) 100);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field5111[var5]; var8++) {
                this.field5113[var5][0][var8] = arg0.method631(10494);
                this.field5112[var5][0][var8] = arg0.method631(10494);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field5111[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field5113[var6][1][var7] = this.field5113[var6][0][var7];
                    this.field5112[var6][1][var7] = this.field5112[var6][0][var7];
                } else {
                    this.field5113[var6][1][var7] = arg0.method631(10494);
                    this.field5112[var6][1][var7] = arg0.method631(10494);
                }
            }
        }
        if (var4 != 0 || this.field5115[1] != this.field5115[0]) {
            arg1.method170(arg0);
        }
    }

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "(IIF)F")
    private final float method2134(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field5113[arg0][1][arg1] - this.field5113[arg0][0][arg1]) * arg2 + (float) this.field5113[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method2135(var5);
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(F)F")
    private static final float method2135(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }
}
