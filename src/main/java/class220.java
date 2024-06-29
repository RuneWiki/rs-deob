import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class220 {

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "[[[I")
    private int[][][] field3068 = new int[2][2][4];

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "[[[I")
    private int[][][] field3075 = new int[2][2][4];

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "[I")
    public int[] field3072 = new int[2];

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "[I")
    private int[] field3069 = new int[2];

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "[[F")
    private static float[][] field3070 = new float[2][8];

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "[[I")
    public static int[][] field3074 = new int[2][8];

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "F")
    private static float field3073;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
    public static int field3071;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lnj;Lgo;)V", line = 6)
    public final void method1481(class164 arg0, class450 arg1) {
        int var3 = arg0.method1087(false);
        this.field3072[0] = var3 >> 4;
        this.field3072[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field3069[0] = this.field3069[1] = 0;
            return;
        }
        this.field3069[0] = arg0.method1074(-635989152);
        this.field3069[1] = arg0.method1074(-635989152);
        int var4 = arg0.method1087(false);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field3072[var5]; var8++) {
                this.field3068[var5][0][var8] = arg0.method1074(-635989152);
                this.field3075[var5][0][var8] = arg0.method1074(-635989152);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field3072[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field3068[var6][1][var7] = this.field3068[var6][0][var7];
                    this.field3075[var6][1][var7] = this.field3075[var6][0][var7];
                } else {
                    this.field3068[var6][1][var7] = arg0.method1074(-635989152);
                    this.field3075[var6][1][var7] = arg0.method1074(-635989152);
                }
            }
        }
        if (var4 != 0 || this.field3069[1] != this.field3069[0]) {
            arg1.method2743(arg0);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIF)F", line = 73)
    private final float method1482(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3075[arg0][1][arg1] - this.field3075[arg0][0][arg1]) * arg2 + (float) this.field3075[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(F)F", line = 80)
    private static final float method1483(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "()V", line = 100)
    public static void method1484() {
        field3070 = null;
        field3074 = null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IF)I", line = 111)
    public final int method1485(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field3069[1] - this.field3069[0]) * arg1 + (float) this.field3069[0];
            float var4 = var3 * 0.0030517578F;
            field3073 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field3071 = (int) (field3073 * 65536.0F);
        }
        if (this.field3072[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1482(arg0, 0, arg1);
        field3070[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1486(arg0, 0, arg1));
        field3070[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field3072[arg0]; var6++) {
            float var9 = this.method1482(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method1486(arg0, var6, arg1));
            float var11 = var9 * var9;
            field3070[arg0][var6 * 2 + 1] = field3070[arg0][var6 * 2 - 1] * var11;
            field3070[arg0][var6 * 2] = field3070[arg0][var6 * 2 - 1] * var10 + field3070[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field3070[arg0][var12] += field3070[arg0][var12 - 1] * var10 + field3070[arg0][var12 - 2] * var11;
            }
            field3070[arg0][1] += field3070[arg0][0] * var10 + var11;
            field3070[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field3072[0] * 2; var7++) {
                field3070[0][var7] *= field3073;
            }
        }
        for (int var8 = 0; var8 < this.field3072[arg0] * 2; var8++) {
            field3074[arg0][var8] = (int) (field3070[arg0][var8] * 65536.0F);
        }
        return this.field3072[arg0] * 2;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(IIF)F", line = 171)
    private final float method1486(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3068[arg0][1][arg1] - this.field3068[arg0][0][arg1]) * arg2 + (float) this.field3068[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1483(var5);
    }
}
