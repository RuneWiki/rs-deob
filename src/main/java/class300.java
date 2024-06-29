import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class300 {

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "[I")
    public int[] field5099 = new int[2];

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "[I")
    private int[] field5102 = new int[2];

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "[[[I")
    private int[][][] field5103 = new int[2][2][4];

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "[[[I")
    private int[][][] field5106 = new int[2][2][4];

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "[[I")
    public static int[][] field5105 = new int[2][8];

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "[[F")
    private static float[][] field5104 = new float[2][8];

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "F")
    private static float field5100;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "I")
    public static int field5101;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(F)F", line = 8)
    private static final float method2043(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIF)F", line = 13)
    private final float method2044(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field5103[arg0][1][arg1] - this.field5103[arg0][0][arg1]) * arg2 + (float) this.field5103[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method2043(var5);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lbg;Ldk;)V", line = 23)
    public final void method2045(class194 arg0, class202 arg1) {
        int var3 = arg0.method1325(7627);
        this.field5099[0] = var3 >> 4;
        this.field5099[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field5102[0] = this.field5102[1] = 0;
            return;
        }
        this.field5102[0] = arg0.method1308(-50);
        this.field5102[1] = arg0.method1308(-59);
        int var4 = arg0.method1325(7627);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field5099[var5]; var6++) {
                this.field5103[var5][0][var6] = arg0.method1308(-84);
                this.field5106[var5][0][var6] = arg0.method1308(-71);
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field5099[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field5103[var7][1][var8] = this.field5103[var7][0][var8];
                    this.field5106[var7][1][var8] = this.field5106[var7][0][var8];
                } else {
                    this.field5103[var7][1][var8] = arg0.method1308(-79);
                    this.field5106[var7][1][var8] = arg0.method1308(-84);
                }
            }
        }
        if (var4 != 0 || this.field5102[1] != this.field5102[0]) {
            arg1.method1408(arg0);
        }
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(IIF)F", line = 93)
    private final float method2046(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field5106[arg0][1][arg1] - this.field5106[arg0][0][arg1]) * arg2 + (float) this.field5106[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "()V", line = 103)
    public static void method2047() {
        field5104 = (float[][]) null;
        field5105 = (int[][]) null;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IF)I", line = 123)
    public final int method2048(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field5102[1] - this.field5102[0]) * arg1 + (float) this.field5102[0];
            float var4 = var3 * 0.0030517578F;
            field5100 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field5101 = (int) (field5100 * 65536.0F);
        }
        if (this.field5099[arg0] == 0) {
            return 0;
        }
        float var5 = this.method2046(arg0, 0, arg1);
        field5104[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method2044(arg0, 0, arg1));
        field5104[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field5099[arg0]; var6++) {
            float var7 = this.method2046(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method2044(arg0, var6, arg1));
            float var9 = var7 * var7;
            field5104[arg0][var6 * 2 + 1] = field5104[arg0][var6 * 2 - 1] * var9;
            field5104[arg0][var6 * 2] = field5104[arg0][var6 * 2 - 1] * var8 + field5104[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field5104[arg0][var10] += field5104[arg0][var10 - 1] * var8 + field5104[arg0][var10 - 2] * var9;
            }
            field5104[arg0][1] += field5104[arg0][0] * var8 + var9;
            field5104[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field5099[0] * 2; var11++) {
                field5104[0][var11] *= field5100;
            }
        }
        for (int var12 = 0; var12 < this.field5099[arg0] * 2; var12++) {
            field5105[arg0][var12] = (int) (field5104[arg0][var12] * 65536.0F);
        }
        return this.field5099[arg0] * 2;
    }
}
