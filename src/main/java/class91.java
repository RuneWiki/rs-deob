import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class91 {

    @OriginalMember(owner = "client!na", name = "a", descriptor = "[I")
    public int[] field1971 = new int[2];

    @OriginalMember(owner = "client!na", name = "e", descriptor = "[[[I")
    private int[][][] field1975 = new int[2][2][4];

    @OriginalMember(owner = "client!na", name = "g", descriptor = "[[[I")
    private int[][][] field1977 = new int[2][2][4];

    @OriginalMember(owner = "client!na", name = "d", descriptor = "[I")
    private int[] field1974 = new int[2];

    @OriginalMember(owner = "client!na", name = "f", descriptor = "[[I")
    public static int[][] field1976 = new int[2][8];

    @OriginalMember(owner = "client!na", name = "h", descriptor = "[[F")
    private static float[][] field1978 = new float[2][8];

    @OriginalMember(owner = "client!na", name = "b", descriptor = "F")
    private static float field1972;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "()V")
    public static void method636() {
        field1978 = null;
        field1976 = null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIF)F")
    private final float method637(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1977[arg0][1][arg1] - this.field1977[arg0][0][arg1]) * arg2 + (float) this.field1977[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(IIF)F")
    private final float method638(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1975[arg0][1][arg1] - this.field1975[arg0][0][arg1]) * arg2 + (float) this.field1975[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method640(var5);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Ltf;Lgb;)V")
    public final void method639(class138 arg0, class45 arg1) {
        int var3 = arg0.method1055(124);
        this.field1971[0] = var3 >> 4;
        this.field1971[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field1974[0] = this.field1974[1] = 0;
            return;
        }
        this.field1974[0] = arg0.method1098(true);
        this.field1974[1] = arg0.method1098(true);
        int var4 = arg0.method1055(112);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field1971[var5]; var8++) {
                this.field1975[var5][0][var8] = arg0.method1098(true);
                this.field1977[var5][0][var8] = arg0.method1098(true);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field1971[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field1975[var6][1][var7] = this.field1975[var6][0][var7];
                    this.field1977[var6][1][var7] = this.field1977[var6][0][var7];
                } else {
                    this.field1975[var6][1][var7] = arg0.method1098(true);
                    this.field1977[var6][1][var7] = arg0.method1098(true);
                }
            }
        }
        if (var4 != 0 || this.field1974[1] != this.field1974[0]) {
            arg1.method329(arg0);
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(F)F")
    private static final float method640(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IF)I")
    public final int method641(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1974[1] - this.field1974[0]) * arg1 + (float) this.field1974[0];
            float var4 = var3 * 0.0030517578F;
            field1972 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field1973 = (int) (field1972 * 65536.0F);
        }
        if (this.field1971[arg0] == 0) {
            return 0;
        }
        float var5 = this.method637(arg0, 0, arg1);
        field1978[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method638(arg0, 0, arg1));
        field1978[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1971[arg0]; var6++) {
            float var9 = this.method637(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method638(arg0, var6, arg1));
            float var11 = var9 * var9;
            field1978[arg0][var6 * 2 + 1] = field1978[arg0][var6 * 2 - 1] * var11;
            field1978[arg0][var6 * 2] = field1978[arg0][var6 * 2 - 1] * var10 + field1978[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field1978[arg0][var12] += field1978[arg0][var12 - 1] * var10 + field1978[arg0][var12 - 2] * var11;
            }
            field1978[arg0][1] += field1978[arg0][0] * var10 + var11;
            field1978[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field1971[0] * 2; var7++) {
                field1978[0][var7] *= field1972;
            }
        }
        for (int var8 = 0; var8 < this.field1971[arg0] * 2; var8++) {
            field1976[arg0][var8] = (int) (field1978[arg0][var8] * 65536.0F);
        }
        return this.field1971[arg0] * 2;
    }
}
