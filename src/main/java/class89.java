import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class89 {

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "[I")
    public int[] field2080 = new int[2];

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "[I")
    private int[] field2078 = new int[2];

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "[[[I")
    private int[][][] field2079 = new int[2][2][4];

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "[[[I")
    private int[][][] field2085 = new int[2][2][4];

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "[[F")
    private static float[][] field2082 = new float[2][8];

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "[[I")
    public static int[][] field2084 = new int[2][8];

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "F")
    private static float field2083;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IF)I")
    public final int method637(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field2078[1] - this.field2078[0]) * arg1 + (float) this.field2078[0];
            float var4 = var3 * 0.0030517578F;
            field2083 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field2081 = (int) (field2083 * 65536.0F);
        }
        if (this.field2080[arg0] == 0) {
            return 0;
        }
        float var5 = this.method641(arg0, 0, arg1);
        field2082[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method640(arg0, 0, arg1));
        field2082[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field2080[arg0]; var6++) {
            float var9 = this.method641(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method640(arg0, var6, arg1));
            float var11 = var9 * var9;
            field2082[arg0][var6 * 2 + 1] = field2082[arg0][var6 * 2 - 1] * var11;
            field2082[arg0][var6 * 2] = field2082[arg0][var6 * 2 - 1] * var10 + field2082[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field2082[arg0][var12] += field2082[arg0][var12 - 1] * var10 + field2082[arg0][var12 - 2] * var11;
            }
            field2082[arg0][1] += field2082[arg0][0] * var10 + var11;
            field2082[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field2080[0] * 2; var7++) {
                field2082[0][var7] *= field2083;
            }
        }
        for (int var8 = 0; var8 < this.field2080[arg0] * 2; var8++) {
            field2084[arg0][var8] = (int) (field2082[arg0][var8] * 65536.0F);
        }
        return this.field2080[arg0] * 2;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lwb;Lia;)V")
    public final void method638(class148 arg0, class57 arg1) {
        int var3 = arg0.method1137(255);
        this.field2080[0] = var3 >> 4;
        this.field2080[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field2078[0] = this.field2078[1] = 0;
            return;
        }
        this.field2078[0] = arg0.method1140(-1);
        this.field2078[1] = arg0.method1140(-1);
        int var4 = arg0.method1137(255);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field2080[var5]; var8++) {
                this.field2085[var5][0][var8] = arg0.method1140(-1);
                this.field2079[var5][0][var8] = arg0.method1140(-1);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field2080[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field2085[var6][1][var7] = this.field2085[var6][0][var7];
                    this.field2079[var6][1][var7] = this.field2079[var6][0][var7];
                } else {
                    this.field2085[var6][1][var7] = arg0.method1140(-1);
                    this.field2079[var6][1][var7] = arg0.method1140(-1);
                }
            }
        }
        if (var4 != 0 || this.field2078[1] != this.field2078[0]) {
            arg1.method443(arg0);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(F)F")
    private static final float method639(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIF)F")
    private final float method640(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2085[arg0][1][arg1] - this.field2085[arg0][0][arg1]) * arg2 + (float) this.field2085[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method639(var5);
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(IIF)F")
    private final float method641(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2079[arg0][1][arg1] - this.field2079[arg0][0][arg1]) * arg2 + (float) this.field2079[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "()V")
    public static void method642() {
        field2082 = null;
        field2084 = null;
    }
}
