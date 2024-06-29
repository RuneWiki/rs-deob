import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class316 {

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "[[[I")
    private int[][][] field5422 = new int[2][2][4];

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "[I")
    private int[] field5427 = new int[2];

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "[[[I")
    private int[][][] field5423 = new int[2][2][4];

    @OriginalMember(owner = "client!ql", name = "h", descriptor = "[I")
    public int[] field5429 = new int[2];

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "[[F")
    private static float[][] field5425 = new float[2][8];

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "[[I")
    public static int[][] field5424 = new int[2][8];

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "F")
    private static float field5428;

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "I")
    public static int field5426;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lbb;Lhi;)V", line = 8)
    public final void method2202(class134 arg0, class80 arg1) {
        int var3 = arg0.method948(-124);
        this.field5429[0] = var3 >> 4;
        this.field5429[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field5427[0] = this.field5427[1] = 0;
            return;
        }
        this.field5427[0] = arg0.method942(true);
        this.field5427[1] = arg0.method942(true);
        int var4 = arg0.method948(-126);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field5429[var5]; var6++) {
                this.field5423[var5][0][var6] = arg0.method942(true);
                this.field5422[var5][0][var6] = arg0.method942(true);
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field5429[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field5423[var7][1][var8] = this.field5423[var7][0][var8];
                    this.field5422[var7][1][var8] = this.field5422[var7][0][var8];
                } else {
                    this.field5423[var7][1][var8] = arg0.method942(true);
                    this.field5422[var7][1][var8] = arg0.method942(true);
                }
            }
        }
        if (var4 != 0 || this.field5427[1] != this.field5427[0]) {
            arg1.method575(arg0);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIF)F", line = 76)
    private final float method2203(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field5422[arg0][1][arg1] - this.field5422[arg0][0][arg1]) * arg2 + (float) this.field5422[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(IIF)F", line = 83)
    private final float method2204(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field5423[arg0][1][arg1] - this.field5423[arg0][0][arg1]) * arg2 + (float) this.field5423[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method2207(var5);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IF)I", line = 89)
    public final int method2205(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field5427[1] - this.field5427[0]) * arg1 + (float) this.field5427[0];
            float var4 = var3 * 0.0030517578F;
            field5428 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field5426 = (int) (field5428 * 65536.0F);
        }
        if (this.field5429[arg0] == 0) {
            return 0;
        }
        float var5 = this.method2203(arg0, 0, arg1);
        field5425[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method2204(arg0, 0, arg1));
        field5425[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field5429[arg0]; var6++) {
            float var7 = this.method2203(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method2204(arg0, var6, arg1));
            float var9 = var7 * var7;
            field5425[arg0][var6 * 2 + 1] = field5425[arg0][var6 * 2 - 1] * var9;
            field5425[arg0][var6 * 2] = field5425[arg0][var6 * 2 - 1] * var8 + field5425[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field5425[arg0][var10] += field5425[arg0][var10 - 1] * var8 + field5425[arg0][var10 - 2] * var9;
            }
            field5425[arg0][1] += field5425[arg0][0] * var8 + var9;
            field5425[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field5429[0] * 2; var11++) {
                field5425[0][var11] *= field5428;
            }
        }
        for (int var12 = 0; var12 < this.field5429[arg0] * 2; var12++) {
            field5424[arg0][var12] = (int) (field5425[arg0][var12] * 65536.0F);
        }
        return this.field5429[arg0] * 2;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "()V", line = 149)
    public static void method2206() {
        field5425 = (float[][]) null;
        field5424 = (int[][]) null;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(F)F", line = 161)
    private static final float method2207(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }
}
