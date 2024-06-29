import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class27 {

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "[[[I")
    private int[][][] field461 = new int[2][2][4];

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "[[[I")
    private int[][][] field458 = new int[2][2][4];

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "[I")
    public int[] field462 = new int[2];

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "[I")
    private int[] field464 = new int[2];

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "[[I")
    public static int[][] field459 = new int[2][8];

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "[[F")
    private static float[][] field465 = new float[2][8];

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "F")
    private static float field460;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "()V")
    public static void method174() {
        field465 = null;
        field459 = null;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIF)F")
    private final float method175(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field461[arg0][1][arg1] - this.field461[arg0][0][arg1]) * arg2 + (float) this.field461[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method177(var5);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IF)I")
    public final int method176(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field464[1] - this.field464[0]) * arg1 + (float) this.field464[0];
            float var4 = var3 * 0.0030517578F;
            field460 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field463 = (int) (field460 * 65536.0F);
        }
        if (this.field462[arg0] == 0) {
            return 0;
        }
        float var5 = this.method178(arg0, 0, arg1);
        field465[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method175(arg0, 0, arg1));
        field465[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field462[arg0]; var6++) {
            float var9 = this.method178(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method175(arg0, var6, arg1));
            float var11 = var9 * var9;
            field465[arg0][var6 * 2 + 1] = field465[arg0][var6 * 2 - 1] * var11;
            field465[arg0][var6 * 2] = field465[arg0][var6 * 2 - 1] * var10 + field465[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field465[arg0][var12] += field465[arg0][var12 - 1] * var10 + field465[arg0][var12 - 2] * var11;
            }
            field465[arg0][1] += field465[arg0][0] * var10 + var11;
            field465[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field462[0] * 2; var7++) {
                field465[0][var7] *= field460;
            }
        }
        for (int var8 = 0; var8 < this.field462[arg0] * 2; var8++) {
            field459[arg0][var8] = (int) (field465[arg0][var8] * 65536.0F);
        }
        return this.field462[arg0] * 2;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(F)F")
    private static final float method177(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(IIF)F")
    private final float method178(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field458[arg0][1][arg1] - this.field458[arg0][0][arg1]) * arg2 + (float) this.field458[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lce;Lja;)V")
    public final void method179(class28 arg0, class98 arg1) {
        int var3 = arg0.method215(-1797813752);
        this.field462[0] = var3 >> 4;
        this.field462[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field464[0] = this.field464[1] = 0;
            return;
        }
        this.field464[0] = arg0.method230((byte) -118);
        this.field464[1] = arg0.method230((byte) -99);
        int var4 = arg0.method215(-1797813752);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field462[var5]; var8++) {
                this.field461[var5][0][var8] = arg0.method230((byte) -114);
                this.field458[var5][0][var8] = arg0.method230((byte) -105);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field462[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field461[var6][1][var7] = this.field461[var6][0][var7];
                    this.field458[var6][1][var7] = this.field458[var6][0][var7];
                } else {
                    this.field461[var6][1][var7] = arg0.method230((byte) -118);
                    this.field458[var6][1][var7] = arg0.method230((byte) -102);
                }
            }
        }
        if (var4 != 0 || this.field464[1] != this.field464[0]) {
            arg1.method652(arg0);
        }
    }
}
