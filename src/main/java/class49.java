import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wba")
public class class49 {

    @OriginalMember(owner = "client!wba", name = "b", descriptor = "[[[I")
    private int[][][] field629 = new int[2][2][4];

    @OriginalMember(owner = "client!wba", name = "d", descriptor = "[I")
    private int[] field631 = new int[2];

    @OriginalMember(owner = "client!wba", name = "f", descriptor = "[[[I")
    private int[][][] field633 = new int[2][2][4];

    @OriginalMember(owner = "client!wba", name = "c", descriptor = "[I")
    public int[] field630 = new int[2];

    @OriginalMember(owner = "client!wba", name = "g", descriptor = "[[F")
    private static float[][] field634 = new float[2][8];

    @OriginalMember(owner = "client!wba", name = "e", descriptor = "[[I")
    public static int[][] field632 = new int[2][8];

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "F")
    private static float field628;

    @OriginalMember(owner = "client!wba", name = "h", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(F)F", line = 4)
    private static final float method349(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(IIF)F", line = 11)
    private final float method350(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field629[arg0][1][arg1] - this.field629[arg0][0][arg1]) * arg2 + (float) this.field629[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method349(var5);
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(IF)I", line = 18)
    public final int method351(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field631[1] - this.field631[0]) * arg1 + (float) this.field631[0];
            float var4 = var3 * 0.0030517578F;
            field628 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field635 = (int) (field628 * 65536.0F);
        }
        if (this.field630[arg0] == 0) {
            return 0;
        }
        float var5 = this.method354(arg0, 0, arg1);
        field634[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method350(arg0, 0, arg1));
        field634[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field630[arg0]; var6++) {
            float var9 = this.method354(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method350(arg0, var6, arg1));
            float var11 = var9 * var9;
            field634[arg0][var6 * 2 + 1] = field634[arg0][var6 * 2 - 1] * var11;
            field634[arg0][var6 * 2] = field634[arg0][var6 * 2 - 1] * var10 + field634[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field634[arg0][var12] += field634[arg0][var12 - 1] * var10 + field634[arg0][var12 - 2] * var11;
            }
            field634[arg0][1] += field634[arg0][0] * var10 + var11;
            field634[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field630[0] * 2; var7++) {
                field634[0][var7] *= field628;
            }
        }
        for (int var8 = 0; var8 < this.field630[arg0] * 2; var8++) {
            field632[arg0][var8] = (int) (field634[arg0][var8] * 65536.0F);
        }
        return this.field630[arg0] * 2;
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "()V", line = 78)
    public static void method352() {
        field634 = null;
        field632 = null;
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(Lee;Lqq;)V", line = 106)
    public final void method353(class677 arg0, class479 arg1) {
        int var3 = arg0.method3821((byte) -44);
        this.field630[0] = var3 >> 4;
        this.field630[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field631[0] = this.field631[1] = 0;
            return;
        }
        this.field631[0] = arg0.method3807(-1);
        this.field631[1] = arg0.method3807(-1);
        int var4 = arg0.method3821((byte) -61);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field630[var5]; var8++) {
                this.field629[var5][0][var8] = arg0.method3807(-1);
                this.field633[var5][0][var8] = arg0.method3807(-1);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field630[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field629[var6][1][var7] = this.field629[var6][0][var7];
                    this.field633[var6][1][var7] = this.field633[var6][0][var7];
                } else {
                    this.field629[var6][1][var7] = arg0.method3807(-1);
                    this.field633[var6][1][var7] = arg0.method3807(-1);
                }
            }
        }
        if (var4 != 0 || this.field631[1] != this.field631[0]) {
            arg1.method2696(arg0);
        }
    }

    @OriginalMember(owner = "client!wba", name = "b", descriptor = "(IIF)F", line = 178)
    private final float method354(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field633[arg0][1][arg1] - this.field633[arg0][0][arg1]) * arg2 + (float) this.field633[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }
}
