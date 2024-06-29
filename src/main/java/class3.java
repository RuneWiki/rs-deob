import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class3 {

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "[I")
    public int[] field43 = new int[2];

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "[I")
    private int[] field46 = new int[2];

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "[[[I")
    private int[][][] field44 = new int[2][2][4];

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "[[[I")
    private int[][][] field41 = new int[2][2][4];

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "[[I")
    public static int[][] field42 = new int[2][8];

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "[[F")
    private static float[][] field47 = new float[2][8];

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "F")
    private static float field48;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "()V")
    public static void method19() {
        field47 = null;
        field42 = null;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lng;Lme;)V")
    public final void method20(class135 arg0, class159 arg1) {
        int var3 = arg0.method920((byte) 38);
        this.field43[0] = var3 >> 4;
        this.field43[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field46[0] = this.field46[1] = 0;
            return;
        }
        this.field46[0] = arg0.method927(127);
        this.field46[1] = arg0.method927(125);
        int var4 = arg0.method920((byte) 109);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field43[var5]; var8++) {
                this.field44[var5][0][var8] = arg0.method927(125);
                this.field41[var5][0][var8] = arg0.method927(127);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field43[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field44[var6][1][var7] = this.field44[var6][0][var7];
                    this.field41[var6][1][var7] = this.field41[var6][0][var7];
                } else {
                    this.field44[var6][1][var7] = arg0.method927(125);
                    this.field41[var6][1][var7] = arg0.method927(127);
                }
            }
        }
        if (var4 != 0 || this.field46[1] != this.field46[0]) {
            arg1.method1065(arg0);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IF)I")
    public final int method21(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field46[1] - this.field46[0]) * arg1 + (float) this.field46[0];
            float var4 = var3 * 0.0030517578F;
            field48 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field45 = (int) (field48 * 65536.0F);
        }
        if (this.field43[arg0] == 0) {
            return 0;
        }
        float var5 = this.method22(arg0, 0, arg1);
        field47[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method24(arg0, 0, arg1));
        field47[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field43[arg0]; var6++) {
            float var9 = this.method22(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method24(arg0, var6, arg1));
            float var11 = var9 * var9;
            field47[arg0][var6 * 2 + 1] = field47[arg0][var6 * 2 - 1] * var11;
            field47[arg0][var6 * 2] = field47[arg0][var6 * 2 - 1] * var10 + field47[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field47[arg0][var12] += field47[arg0][var12 - 1] * var10 + field47[arg0][var12 - 2] * var11;
            }
            field47[arg0][1] += field47[arg0][0] * var10 + var11;
            field47[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field43[0] * 2; var7++) {
                field47[0][var7] *= field48;
            }
        }
        for (int var8 = 0; var8 < this.field43[arg0] * 2; var8++) {
            field42[arg0][var8] = (int) (field47[arg0][var8] * 65536.0F);
        }
        return this.field43[arg0] * 2;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIF)F")
    private final float method22(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field41[arg0][1][arg1] - this.field41[arg0][0][arg1]) * arg2 + (float) this.field41[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(F)F")
    private static final float method23(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(IIF)F")
    private final float method24(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field44[arg0][1][arg1] - this.field44[arg0][0][arg1]) * arg2 + (float) this.field44[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method23(var5);
    }
}
