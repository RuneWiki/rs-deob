import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class31 {

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "[[[I")
    private int[][][] field684 = new int[2][2][4];

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "[[[I")
    private int[][][] field682 = new int[2][2][4];

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "[I")
    private int[] field683 = new int[2];

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "[I")
    public int[] field688 = new int[2];

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "[[F")
    private static float[][] field685 = new float[2][8];

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "[[I")
    public static int[][] field687 = new int[2][8];

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "F")
    private static float field686;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lbe;Lpb;)V")
    public final void method321(class13 arg0, class106 arg1) {
        int var3 = arg0.method142(27467);
        this.field688[0] = var3 >> 4;
        this.field688[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field683[0] = this.field683[1] = 0;
            return;
        }
        this.field683[0] = arg0.method105(1375221240);
        this.field683[1] = arg0.method105(1375221240);
        int var4 = arg0.method142(27467);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field688[var5]; var8++) {
                this.field682[var5][0][var8] = arg0.method105(1375221240);
                this.field684[var5][0][var8] = arg0.method105(1375221240);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field688[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field682[var6][1][var7] = this.field682[var6][0][var7];
                    this.field684[var6][1][var7] = this.field684[var6][0][var7];
                } else {
                    this.field682[var6][1][var7] = arg0.method105(1375221240);
                    this.field684[var6][1][var7] = arg0.method105(1375221240);
                }
            }
        }
        if (var4 != 0 || this.field683[1] != this.field683[0]) {
            arg1.method861(arg0);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(F)F")
    private static final float method322(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IF)I")
    public final int method323(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field683[1] - this.field683[0]) * arg1 + (float) this.field683[0];
            float var4 = var3 * 0.0030517578F;
            field686 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field681 = (int) (field686 * 65536.0F);
        }
        if (this.field688[arg0] == 0) {
            return 0;
        }
        float var5 = this.method325(arg0, 0, arg1);
        field685[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method326(arg0, 0, arg1));
        field685[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field688[arg0]; var6++) {
            float var9 = this.method325(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method326(arg0, var6, arg1));
            float var11 = var9 * var9;
            field685[arg0][var6 * 2 + 1] = field685[arg0][var6 * 2 - 1] * var11;
            field685[arg0][var6 * 2] = field685[arg0][var6 * 2 - 1] * var10 + field685[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field685[arg0][var12] += field685[arg0][var12 - 1] * var10 + field685[arg0][var12 - 2] * var11;
            }
            field685[arg0][1] += field685[arg0][0] * var10 + var11;
            field685[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field688[0] * 2; var7++) {
                field685[0][var7] *= field686;
            }
        }
        for (int var8 = 0; var8 < this.field688[arg0] * 2; var8++) {
            field687[arg0][var8] = (int) (field685[arg0][var8] * 65536.0F);
        }
        return this.field688[arg0] * 2;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "()V")
    public static void method324() {
        field685 = null;
        field687 = null;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIF)F")
    private final float method325(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field684[arg0][1][arg1] - this.field684[arg0][0][arg1]) * arg2 + (float) this.field684[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(IIF)F")
    private final float method326(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field682[arg0][1][arg1] - this.field682[arg0][0][arg1]) * arg2 + (float) this.field682[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method322(var5);
    }
}
