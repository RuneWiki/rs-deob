import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class308 {

    @OriginalMember(owner = "client!km", name = "b", descriptor = "[I")
    public int[] field5275 = new int[2];

    @OriginalMember(owner = "client!km", name = "a", descriptor = "[I")
    private int[] field5274 = new int[2];

    @OriginalMember(owner = "client!km", name = "f", descriptor = "[[[I")
    private int[][][] field5279 = new int[2][2][4];

    @OriginalMember(owner = "client!km", name = "h", descriptor = "[[[I")
    private int[][][] field5281 = new int[2][2][4];

    @OriginalMember(owner = "client!km", name = "e", descriptor = "[[I")
    public static int[][] field5278 = new int[2][8];

    @OriginalMember(owner = "client!km", name = "g", descriptor = "[[F")
    private static float[][] field5280 = new float[2][8];

    @OriginalMember(owner = "client!km", name = "d", descriptor = "F")
    private static float field5277;

    @OriginalMember(owner = "client!km", name = "c", descriptor = "I")
    public static int field5276;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "()V", line = 5)
    public static void method2094() {
        field5280 = (float[][]) null;
        field5278 = (int[][]) null;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Lfe;Lci;)V", line = 12)
    public final void method2095(class229 arg0, class188 arg1) {
        int var3 = arg0.method1535((byte) 93);
        this.field5275[0] = var3 >> 4;
        this.field5275[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field5274[0] = this.field5274[1] = 0;
            return;
        }
        this.field5274[0] = arg0.method1496(true);
        this.field5274[1] = arg0.method1496(true);
        int var4 = arg0.method1535((byte) 125);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field5275[var5]; var6++) {
                this.field5279[var5][0][var6] = arg0.method1496(true);
                this.field5281[var5][0][var6] = arg0.method1496(true);
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field5275[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field5279[var7][1][var8] = this.field5279[var7][0][var8];
                    this.field5281[var7][1][var8] = this.field5281[var7][0][var8];
                } else {
                    this.field5279[var7][1][var8] = arg0.method1496(true);
                    this.field5281[var7][1][var8] = arg0.method1496(true);
                }
            }
        }
        if (var4 != 0 || this.field5274[1] != this.field5274[0]) {
            arg1.method1227(arg0);
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(F)F", line = 78)
    private static final float method2096(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIF)F", line = 95)
    private final float method2097(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field5279[arg0][1][arg1] - this.field5279[arg0][0][arg1]) * arg2 + (float) this.field5279[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method2096(var5);
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IF)I", line = 100)
    public final int method2098(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field5274[1] - this.field5274[0]) * arg1 + (float) this.field5274[0];
            float var4 = var3 * 0.0030517578F;
            field5277 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field5276 = (int) (field5277 * 65536.0F);
        }
        if (this.field5275[arg0] == 0) {
            return 0;
        }
        float var5 = this.method2099(arg0, 0, arg1);
        field5280[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method2097(arg0, 0, arg1));
        field5280[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field5275[arg0]; var6++) {
            float var7 = this.method2099(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method2097(arg0, var6, arg1));
            float var9 = var7 * var7;
            field5280[arg0][var6 * 2 + 1] = field5280[arg0][var6 * 2 - 1] * var9;
            field5280[arg0][var6 * 2] = field5280[arg0][var6 * 2 - 1] * var8 + field5280[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field5280[arg0][var10] += field5280[arg0][var10 - 1] * var8 + field5280[arg0][var10 - 2] * var9;
            }
            field5280[arg0][1] += field5280[arg0][0] * var8 + var9;
            field5280[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field5275[0] * 2; var11++) {
                field5280[0][var11] *= field5277;
            }
        }
        for (int var12 = 0; var12 < this.field5275[arg0] * 2; var12++) {
            field5278[arg0][var12] = (int) (field5280[arg0][var12] * 65536.0F);
        }
        return this.field5275[arg0] * 2;
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(IIF)F", line = 161)
    private final float method2099(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field5281[arg0][1][arg1] - this.field5281[arg0][0][arg1]) * arg2 + (float) this.field5281[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }
}
