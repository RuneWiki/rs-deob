import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class13 {

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "[I")
    public int[] field161 = new int[2];

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "[[[I")
    private int[][][] field164 = new int[2][2][4];

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "[[[I")
    private int[][][] field160 = new int[2][2][4];

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "[I")
    private int[] field166 = new int[2];

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "[[I")
    public static int[][] field162 = new int[2][8];

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "[[F")
    private static float[][] field165 = new float[2][8];

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "F")
    private static float field159;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Llh;Lag;)V")
    public final void method55(class249 arg0, class239 arg1) {
        int var3 = arg0.method1677(-6677);
        this.field161[0] = var3 >> 4;
        this.field161[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field166[0] = this.field166[1] = 0;
            return;
        }
        this.field166[0] = arg0.method1674(1355769544);
        this.field166[1] = arg0.method1674(1355769544);
        int var4 = arg0.method1677(-6677);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field161[var5]; var8++) {
                this.field160[var5][0][var8] = arg0.method1674(1355769544);
                this.field164[var5][0][var8] = arg0.method1674(1355769544);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field161[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field160[var6][1][var7] = this.field160[var6][0][var7];
                    this.field164[var6][1][var7] = this.field164[var6][0][var7];
                } else {
                    this.field160[var6][1][var7] = arg0.method1674(1355769544);
                    this.field164[var6][1][var7] = arg0.method1674(1355769544);
                }
            }
        }
        if (var4 != 0 || this.field166[1] != this.field166[0]) {
            arg1.method1572(arg0);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IF)I")
    public final int method56(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field166[1] - this.field166[0]) * arg1 + (float) this.field166[0];
            float var4 = var3 * 0.0030517578F;
            field159 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field163 = (int) (field159 * 65536.0F);
        }
        if (this.field161[arg0] == 0) {
            return 0;
        }
        float var5 = this.method60(arg0, 0, arg1);
        field165[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method57(arg0, 0, arg1));
        field165[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field161[arg0]; var6++) {
            float var9 = this.method60(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method57(arg0, var6, arg1));
            float var11 = var9 * var9;
            field165[arg0][var6 * 2 + 1] = field165[arg0][var6 * 2 - 1] * var11;
            field165[arg0][var6 * 2] = field165[arg0][var6 * 2 - 1] * var10 + field165[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field165[arg0][var12] += field165[arg0][var12 - 1] * var10 + field165[arg0][var12 - 2] * var11;
            }
            field165[arg0][1] += field165[arg0][0] * var10 + var11;
            field165[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field161[0] * 2; var7++) {
                field165[0][var7] *= field159;
            }
        }
        for (int var8 = 0; var8 < this.field161[arg0] * 2; var8++) {
            field162[arg0][var8] = (int) (field165[arg0][var8] * 65536.0F);
        }
        return this.field161[arg0] * 2;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIF)F")
    private final float method57(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field160[arg0][1][arg1] - this.field160[arg0][0][arg1]) * arg2 + (float) this.field160[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method58(var5);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(F)F")
    private static final float method58(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "()V")
    public static void method59() {
        field165 = null;
        field162 = null;
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(IIF)F")
    private final float method60(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field164[arg0][1][arg1] - this.field164[arg0][0][arg1]) * arg2 + (float) this.field164[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }
}
