import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class101 {

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "[[[I")
    private int[][][] field2520 = new int[2][2][4];

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "[[[I")
    private int[][][] field2518 = new int[2][2][4];

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "[I")
    private int[] field2517 = new int[2];

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "[I")
    public int[] field2523 = new int[2];

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "[[I")
    public static int[][] field2522 = new int[2][8];

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "[[F")
    private static float[][] field2524 = new float[2][8];

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "F")
    private static float field2521;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
    public static int field2519;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IF)I", line = 5)
    public final int method773(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field2517[1] - this.field2517[0]) * arg1 + (float) this.field2517[0];
            float var4 = var3 * 0.0030517578F;
            field2521 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field2519 = (int) (field2521 * 65536.0F);
        }
        if (this.field2523[arg0] == 0) {
            return 0;
        }
        float var5 = this.method774(arg0, 0, arg1);
        field2524[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method778(arg0, 0, arg1));
        field2524[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field2523[arg0]; var6++) {
            float var9 = this.method774(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method778(arg0, var6, arg1));
            float var11 = var9 * var9;
            field2524[arg0][var6 * 2 + 1] = field2524[arg0][var6 * 2 - 1] * var11;
            field2524[arg0][var6 * 2] = field2524[arg0][var6 * 2 - 1] * var10 + field2524[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field2524[arg0][var12] += field2524[arg0][var12 - 1] * var10 + field2524[arg0][var12 - 2] * var11;
            }
            field2524[arg0][1] += field2524[arg0][0] * var10 + var11;
            field2524[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field2523[0] * 2; var7++) {
                field2524[0][var7] *= field2521;
            }
        }
        for (int var8 = 0; var8 < this.field2523[arg0] * 2; var8++) {
            field2522[arg0][var8] = (int) (field2524[arg0][var8] * 65536.0F);
        }
        return this.field2523[arg0] * 2;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIF)F", line = 71)
    private final float method774(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2520[arg0][1][arg1] - this.field2520[arg0][0][arg1]) * arg2 + (float) this.field2520[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "()V", line = 81)
    public static void method775() {
        field2524 = null;
        field2522 = null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lkd;Loa;)V", line = 89)
    public final void method776(class64 arg0, class85 arg1) {
        int var3 = arg0.method520(-112);
        this.field2523[0] = var3 >> 4;
        this.field2523[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field2517[0] = this.field2517[1] = 0;
            return;
        }
        this.field2517[0] = arg0.method506((byte) -90);
        this.field2517[1] = arg0.method506((byte) -90);
        int var4 = arg0.method520(-119);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field2523[var5]; var8++) {
                this.field2518[var5][0][var8] = arg0.method506((byte) -90);
                this.field2520[var5][0][var8] = arg0.method506((byte) -90);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field2523[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field2518[var6][1][var7] = this.field2518[var6][0][var7];
                    this.field2520[var6][1][var7] = this.field2520[var6][0][var7];
                } else {
                    this.field2518[var6][1][var7] = arg0.method506((byte) -90);
                    this.field2520[var6][1][var7] = arg0.method506((byte) -90);
                }
            }
        }
        if (var4 != 0 || this.field2517[1] != this.field2517[0]) {
            arg1.method679(arg0);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(F)F", line = 155)
    private static final float method777(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(IIF)F", line = 164)
    private final float method778(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2518[arg0][1][arg1] - this.field2518[arg0][0][arg1]) * arg2 + (float) this.field2518[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method777(var5);
    }
}
