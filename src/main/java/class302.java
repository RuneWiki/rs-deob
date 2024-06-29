import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iba")
public class class302 {

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "[[[I")
    private int[][][] field3924 = new int[2][2][4];

    @OriginalMember(owner = "client!iba", name = "e", descriptor = "[I")
    public int[] field3928 = new int[2];

    @OriginalMember(owner = "client!iba", name = "d", descriptor = "[[[I")
    private int[][][] field3927 = new int[2][2][4];

    @OriginalMember(owner = "client!iba", name = "c", descriptor = "[I")
    private int[] field3926 = new int[2];

    @OriginalMember(owner = "client!iba", name = "b", descriptor = "[[F")
    private static float[][] field3925 = new float[2][8];

    @OriginalMember(owner = "client!iba", name = "f", descriptor = "[[I")
    public static int[][] field3929 = new int[2][8];

    @OriginalMember(owner = "client!iba", name = "h", descriptor = "F")
    private static float field3931;

    @OriginalMember(owner = "client!iba", name = "g", descriptor = "I")
    public static int field3930;

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "()V", line = 3)
    public static void method1768() {
        field3925 = null;
        field3929 = null;
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(IF)I", line = 9)
    public final int method1769(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field3926[1] - this.field3926[0]) * arg1 + (float) this.field3926[0];
            float var4 = var3 * 0.0030517578F;
            field3931 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field3930 = (int) (field3931 * 65536.0F);
        }
        if (this.field3928[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1771(arg0, 0, arg1);
        field3925[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1770(arg0, 0, arg1));
        field3925[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field3928[arg0]; var6++) {
            float var9 = this.method1771(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method1770(arg0, var6, arg1));
            float var11 = var9 * var9;
            field3925[arg0][var6 * 2 + 1] = field3925[arg0][var6 * 2 - 1] * var11;
            field3925[arg0][var6 * 2] = field3925[arg0][var6 * 2 - 1] * var10 + field3925[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field3925[arg0][var12] += field3925[arg0][var12 - 1] * var10 + field3925[arg0][var12 - 2] * var11;
            }
            field3925[arg0][1] += field3925[arg0][0] * var10 + var11;
            field3925[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field3928[0] * 2; var7++) {
                field3925[0][var7] *= field3931;
            }
        }
        for (int var8 = 0; var8 < this.field3928[arg0] * 2; var8++) {
            field3929[arg0][var8] = (int) (field3925[arg0][var8] * 65536.0F);
        }
        return this.field3928[arg0] * 2;
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(IIF)F", line = 76)
    private final float method1770(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3924[arg0][1][arg1] - this.field3924[arg0][0][arg1]) * arg2 + (float) this.field3924[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1773(var5);
    }

    @OriginalMember(owner = "client!iba", name = "b", descriptor = "(IIF)F", line = 85)
    private final float method1771(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3927[arg0][1][arg1] - this.field3927[arg0][0][arg1]) * arg2 + (float) this.field3927[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(Lvj;Lav;)V", line = 91)
    public final void method1772(class26 arg0, class414 arg1) {
        int var3 = arg0.method194((byte) 119);
        this.field3928[0] = var3 >> 4;
        this.field3928[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field3926[0] = this.field3926[1] = 0;
            return;
        }
        this.field3926[0] = arg0.method193(2);
        this.field3926[1] = arg0.method193(2);
        int var4 = arg0.method194((byte) 119);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field3928[var5]; var8++) {
                this.field3924[var5][0][var8] = arg0.method193(2);
                this.field3927[var5][0][var8] = arg0.method193(2);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field3928[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field3924[var6][1][var7] = this.field3924[var6][0][var7];
                    this.field3927[var6][1][var7] = this.field3927[var6][0][var7];
                } else {
                    this.field3924[var6][1][var7] = arg0.method193(2);
                    this.field3927[var6][1][var7] = arg0.method193(2);
                }
            }
        }
        if (var4 != 0 || this.field3926[1] != this.field3926[0]) {
            arg1.method2520(arg0);
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(F)F", line = 163)
    private static final float method1773(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }
}
