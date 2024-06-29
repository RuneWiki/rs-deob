import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class20 {

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "[I")
    public int[] field481 = new int[2];

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "[[[I")
    private int[][][] field482 = new int[2][2][4];

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "[[[I")
    private int[][][] field488 = new int[2][2][4];

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "[I")
    private int[] field487 = new int[2];

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "[[F")
    private static float[][] field483 = new float[2][8];

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "[[I")
    public static int[][] field486 = new int[2][8];

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "F")
    private static float field484;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIF)F")
    private final float method214(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field488[arg0][1][arg1] - this.field488[arg0][0][arg1]) * arg2 + (float) this.field488[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(F)F")
    private static final float method215(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(IIF)F")
    private final float method216(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field482[arg0][1][arg1] - this.field482[arg0][0][arg1]) * arg2 + (float) this.field482[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method215(var5);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lab;Lta;)V")
    public final void method217(class3 arg0, class172 arg1) {
        int var3 = arg0.method64(31790);
        this.field481[0] = var3 >> 4;
        this.field481[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field487[0] = this.field487[1] = 0;
            return;
        }
        this.field487[0] = arg0.method46((byte) 65);
        this.field487[1] = arg0.method46((byte) 65);
        int var4 = arg0.method64(31790);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field481[var5]; var8++) {
                this.field482[var5][0][var8] = arg0.method46((byte) 65);
                this.field488[var5][0][var8] = arg0.method46((byte) 65);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field481[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field482[var6][1][var7] = this.field482[var6][0][var7];
                    this.field488[var6][1][var7] = this.field488[var6][0][var7];
                } else {
                    this.field482[var6][1][var7] = arg0.method46((byte) 65);
                    this.field488[var6][1][var7] = arg0.method46((byte) 65);
                }
            }
        }
        if (var4 != 0 || this.field487[1] != this.field487[0]) {
            arg1.method1153(arg0);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IF)I")
    public final int method218(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field487[1] - this.field487[0]) * arg1 + (float) this.field487[0];
            float var4 = var3 * 0.0030517578F;
            field484 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field485 = (int) (field484 * 65536.0F);
        }
        if (this.field481[arg0] == 0) {
            return 0;
        }
        float var5 = this.method214(arg0, 0, arg1);
        field483[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method216(arg0, 0, arg1));
        field483[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field481[arg0]; var6++) {
            float var9 = this.method214(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method216(arg0, var6, arg1));
            float var11 = var9 * var9;
            field483[arg0][var6 * 2 + 1] = field483[arg0][var6 * 2 - 1] * var11;
            field483[arg0][var6 * 2] = field483[arg0][var6 * 2 - 1] * var10 + field483[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field483[arg0][var12] += field483[arg0][var12 - 1] * var10 + field483[arg0][var12 - 2] * var11;
            }
            field483[arg0][1] += field483[arg0][0] * var10 + var11;
            field483[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field481[0] * 2; var7++) {
                field483[0][var7] *= field484;
            }
        }
        for (int var8 = 0; var8 < this.field481[arg0] * 2; var8++) {
            field486[arg0][var8] = (int) (field483[arg0][var8] * 65536.0F);
        }
        return this.field481[arg0] * 2;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "()V")
    public static void method219() {
        field483 = null;
        field486 = null;
    }
}
