import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class2 {

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "[I")
    public int[] field48 = new int[2];

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "[I")
    private int[] field50 = new int[2];

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "[[[I")
    private int[][][] field49 = new int[2][2][4];

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "[[[I")
    private int[][][] field47 = new int[2][2][4];

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "[[I")
    public static int[][] field46 = new int[2][8];

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "[[F")
    private static float[][] field44 = new float[2][8];

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "F")
    private static float field43;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIF)F", line = 4)
    private final float method18(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field49[arg0][1][arg1] - this.field49[arg0][0][arg1]) * arg2 + (float) this.field49[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method22(var5);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IF)I", line = 12)
    public final int method19(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field50[1] - this.field50[0]) * arg1 + (float) this.field50[0];
            float var4 = var3 * 0.0030517578F;
            field43 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field45 = (int) (field43 * 65536.0F);
        }
        if (this.field48[arg0] == 0) {
            return 0;
        }
        float var5 = this.method23(arg0, 0, arg1);
        field44[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method18(arg0, 0, arg1));
        field44[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field48[arg0]; var6++) {
            float var9 = this.method23(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method18(arg0, var6, arg1));
            float var11 = var9 * var9;
            field44[arg0][var6 * 2 + 1] = field44[arg0][var6 * 2 - 1] * var11;
            field44[arg0][var6 * 2] = field44[arg0][var6 * 2 - 1] * var10 + field44[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field44[arg0][var12] += field44[arg0][var12 - 1] * var10 + field44[arg0][var12 - 2] * var11;
            }
            field44[arg0][1] += field44[arg0][0] * var10 + var11;
            field44[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field48[0] * 2; var7++) {
                field44[0][var7] *= field43;
            }
        }
        for (int var8 = 0; var8 < this.field48[arg0] * 2; var8++) {
            field46[arg0][var8] = (int) (field44[arg0][var8] * 65536.0F);
        }
        return this.field48[arg0] * 2;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lg;Lce;)V", line = 76)
    public final void method20(class39 arg0, class18 arg1) {
        int var3 = arg0.method334(114);
        this.field48[0] = var3 >> 4;
        this.field48[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field50[0] = this.field50[1] = 0;
            return;
        }
        this.field50[0] = arg0.method326(255);
        this.field50[1] = arg0.method326(255);
        int var4 = arg0.method334(109);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field48[var5]; var8++) {
                this.field49[var5][0][var8] = arg0.method326(255);
                this.field47[var5][0][var8] = arg0.method326(255);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field48[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field49[var6][1][var7] = this.field49[var6][0][var7];
                    this.field47[var6][1][var7] = this.field47[var6][0][var7];
                } else {
                    this.field49[var6][1][var7] = arg0.method326(255);
                    this.field47[var6][1][var7] = arg0.method326(255);
                }
            }
        }
        if (var4 != 0 || this.field50[1] != this.field50[0]) {
            arg1.method137(arg0);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "()V", line = 141)
    public static void method21() {
        field44 = null;
        field46 = null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(F)F", line = 161)
    private static final float method22(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(IIF)F", line = 173)
    private final float method23(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field47[arg0][1][arg1] - this.field47[arg0][0][arg1]) * arg2 + (float) this.field47[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }
}
