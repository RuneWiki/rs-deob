import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class32 {

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "[[[I")
    private int[][][] field589 = new int[2][2][4];

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "[[[I")
    private int[][][] field590 = new int[2][2][4];

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "[I")
    private int[] field592 = new int[2];

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "[I")
    public int[] field595 = new int[2];

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "[[F")
    private static float[][] field591 = new float[2][8];

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "[[I")
    public static int[][] field594 = new int[2][8];

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "F")
    private static float field593;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIF)F")
    private final float method294(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field589[arg0][1][arg1] - this.field589[arg0][0][arg1]) * arg2 + (float) this.field589[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method297(var5);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IF)I")
    public final int method295(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field592[1] - this.field592[0]) * arg1 + (float) this.field592[0];
            float var4 = var3 * 0.0030517578F;
            field593 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field588 = (int) (field593 * 65536.0F);
        }
        if (this.field595[arg0] == 0) {
            return 0;
        }
        float var5 = this.method296(arg0, 0, arg1);
        field591[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method294(arg0, 0, arg1));
        field591[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field595[arg0]; var6++) {
            float var9 = this.method296(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method294(arg0, var6, arg1));
            float var11 = var9 * var9;
            field591[arg0][var6 * 2 + 1] = field591[arg0][var6 * 2 - 1] * var11;
            field591[arg0][var6 * 2] = field591[arg0][var6 * 2 - 1] * var10 + field591[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field591[arg0][var12] += field591[arg0][var12 - 1] * var10 + field591[arg0][var12 - 2] * var11;
            }
            field591[arg0][1] += field591[arg0][0] * var10 + var11;
            field591[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field595[0] * 2; var7++) {
                field591[0][var7] *= field593;
            }
        }
        for (int var8 = 0; var8 < this.field595[arg0] * 2; var8++) {
            field594[arg0][var8] = (int) (field591[arg0][var8] * 65536.0F);
        }
        return this.field595[arg0] * 2;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(IIF)F")
    private final float method296(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field590[arg0][1][arg1] - this.field590[arg0][0][arg1]) * arg2 + (float) this.field590[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(F)F")
    private static final float method297(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lfk;Ljk;)V")
    public final void method298(class14 arg0, class241 arg1) {
        int var3 = arg0.method200(255);
        this.field595[0] = var3 >> 4;
        this.field595[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field592[0] = this.field592[1] = 0;
            return;
        }
        this.field592[0] = arg0.method161(4);
        this.field592[1] = arg0.method161(4);
        int var4 = arg0.method200(255);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field595[var5]; var8++) {
                this.field589[var5][0][var8] = arg0.method161(4);
                this.field590[var5][0][var8] = arg0.method161(4);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field595[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field589[var6][1][var7] = this.field589[var6][0][var7];
                    this.field590[var6][1][var7] = this.field590[var6][0][var7];
                } else {
                    this.field589[var6][1][var7] = arg0.method161(4);
                    this.field590[var6][1][var7] = arg0.method161(4);
                }
            }
        }
        if (var4 != 0 || this.field592[1] != this.field592[0]) {
            arg1.method1689(arg0);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "()V")
    public static void method299() {
        field591 = null;
        field594 = null;
    }
}
