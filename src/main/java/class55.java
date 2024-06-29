import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class55 {

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "[I")
    private int[] field793 = new int[2];

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "[[[I")
    private int[][][] field795 = new int[2][2][4];

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "[I")
    public int[] field794 = new int[2];

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "[[[I")
    private int[][][] field798 = new int[2][2][4];

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "[[I")
    public static int[][] field799 = new int[2][8];

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "[[F")
    private static float[][] field800 = new float[2][8];

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "F")
    private static float field797;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
    public static int field796;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IF)I")
    public final int method341(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field793[1] - this.field793[0]) * arg1 + (float) this.field793[0];
            float var4 = var3 * 0.0030517578F;
            field797 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field796 = (int) (field797 * 65536.0F);
        }
        if (this.field794[arg0] == 0) {
            return 0;
        }
        float var5 = this.method345(arg0, 0, arg1);
        field800[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method342(arg0, 0, arg1));
        field800[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field794[arg0]; var6++) {
            float var9 = this.method345(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method342(arg0, var6, arg1));
            float var11 = var9 * var9;
            field800[arg0][var6 * 2 + 1] = field800[arg0][var6 * 2 - 1] * var11;
            field800[arg0][var6 * 2] = field800[arg0][var6 * 2 - 1] * var10 + field800[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field800[arg0][var12] += field800[arg0][var12 - 1] * var10 + field800[arg0][var12 - 2] * var11;
            }
            field800[arg0][1] += field800[arg0][0] * var10 + var11;
            field800[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field794[0] * 2; var7++) {
                field800[0][var7] *= field797;
            }
        }
        for (int var8 = 0; var8 < this.field794[arg0] * 2; var8++) {
            field799[arg0][var8] = (int) (field800[arg0][var8] * 65536.0F);
        }
        return this.field794[arg0] * 2;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIF)F")
    private final float method342(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field795[arg0][1][arg1] - this.field795[arg0][0][arg1]) * arg2 + (float) this.field795[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method343(var5);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(F)F")
    private static final float method343(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lql;Lmb;)V")
    public final void method344(class224 arg0, class162 arg1) {
        int var3 = arg0.method1453((byte) -128);
        this.field794[0] = var3 >> 4;
        this.field794[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field793[0] = this.field793[1] = 0;
            return;
        }
        this.field793[0] = arg0.method1445(false);
        this.field793[1] = arg0.method1445(false);
        int var4 = arg0.method1453((byte) -128);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field794[var5]; var8++) {
                this.field795[var5][0][var8] = arg0.method1445(false);
                this.field798[var5][0][var8] = arg0.method1445(false);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field794[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field795[var6][1][var7] = this.field795[var6][0][var7];
                    this.field798[var6][1][var7] = this.field798[var6][0][var7];
                } else {
                    this.field795[var6][1][var7] = arg0.method1445(false);
                    this.field798[var6][1][var7] = arg0.method1445(false);
                }
            }
        }
        if (var4 != 0 || this.field793[1] != this.field793[0]) {
            arg1.method1078(arg0);
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(IIF)F")
    private final float method345(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field798[arg0][1][arg1] - this.field798[arg0][0][arg1]) * arg2 + (float) this.field798[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "()V")
    public static void method346() {
        field800 = null;
        field799 = null;
    }
}
