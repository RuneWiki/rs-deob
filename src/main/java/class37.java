import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class37 {

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "[[[I")
    private int[][][] field453 = new int[2][2][4];

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "[I")
    private int[] field449 = new int[2];

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "[I")
    public int[] field455 = new int[2];

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "[[[I")
    private int[][][] field456 = new int[2][2][4];

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "[[I")
    public static int[][] field452 = new int[2][8];

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "[[F")
    private static float[][] field450 = new float[2][8];

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "F")
    private static float field454;

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(F)F")
    private static final float method295(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIF)F")
    private final float method296(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field456[arg0][1][arg1] - this.field456[arg0][0][arg1]) * arg2 + (float) this.field456[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lhi;Lql;)V")
    public final void method297(class264 arg0, class15 arg1) {
        int var3 = arg0.method1779(-64);
        this.field455[0] = var3 >> 4;
        this.field455[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field449[0] = this.field449[1] = 0;
            return;
        }
        this.field449[0] = arg0.method1777(-122);
        this.field449[1] = arg0.method1777(-81);
        int var4 = arg0.method1779(-78);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field455[var5]; var8++) {
                this.field453[var5][0][var8] = arg0.method1777(-69);
                this.field456[var5][0][var8] = arg0.method1777(-55);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field455[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field453[var6][1][var7] = this.field453[var6][0][var7];
                    this.field456[var6][1][var7] = this.field456[var6][0][var7];
                } else {
                    this.field453[var6][1][var7] = arg0.method1777(-82);
                    this.field456[var6][1][var7] = arg0.method1777(-44);
                }
            }
        }
        if (var4 != 0 || this.field449[1] != this.field449[0]) {
            arg1.method114(arg0);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IF)I")
    public final int method298(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field449[1] - this.field449[0]) * arg1 + (float) this.field449[0];
            float var4 = var3 * 0.0030517578F;
            field454 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field451 = (int) (field454 * 65536.0F);
        }
        if (this.field455[arg0] == 0) {
            return 0;
        }
        float var5 = this.method296(arg0, 0, arg1);
        field450[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method299(arg0, 0, arg1));
        field450[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field455[arg0]; var6++) {
            float var9 = this.method296(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method299(arg0, var6, arg1));
            float var11 = var9 * var9;
            field450[arg0][var6 * 2 + 1] = field450[arg0][var6 * 2 - 1] * var11;
            field450[arg0][var6 * 2] = field450[arg0][var6 * 2 - 1] * var10 + field450[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field450[arg0][var12] += field450[arg0][var12 - 1] * var10 + field450[arg0][var12 - 2] * var11;
            }
            field450[arg0][1] += field450[arg0][0] * var10 + var11;
            field450[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field455[0] * 2; var7++) {
                field450[0][var7] *= field454;
            }
        }
        for (int var8 = 0; var8 < this.field455[arg0] * 2; var8++) {
            field452[arg0][var8] = (int) (field450[arg0][var8] * 65536.0F);
        }
        return this.field455[arg0] * 2;
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(IIF)F")
    private final float method299(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field453[arg0][1][arg1] - this.field453[arg0][0][arg1]) * arg2 + (float) this.field453[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method295(var5);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "()V")
    public static void method300() {
        field450 = null;
        field452 = null;
    }
}
