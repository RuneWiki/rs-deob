import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class136 {

    @OriginalMember(owner = "client!di", name = "d", descriptor = "[[[I")
    private int[][][] field2044 = new int[2][2][4];

    @OriginalMember(owner = "client!di", name = "e", descriptor = "[[[I")
    private int[][][] field2045 = new int[2][2][4];

    @OriginalMember(owner = "client!di", name = "f", descriptor = "[I")
    private int[] field2046 = new int[2];

    @OriginalMember(owner = "client!di", name = "h", descriptor = "[I")
    public int[] field2048 = new int[2];

    @OriginalMember(owner = "client!di", name = "a", descriptor = "[[F")
    private static float[][] field2041 = new float[2][8];

    @OriginalMember(owner = "client!di", name = "c", descriptor = "[[I")
    public static int[][] field2043 = new int[2][8];

    @OriginalMember(owner = "client!di", name = "b", descriptor = "F")
    private static float field2042;

    @OriginalMember(owner = "client!di", name = "g", descriptor = "I")
    public static int field2047;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIF)F", line = 10)
    private final float method996(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2045[arg0][1][arg1] - this.field2045[arg0][0][arg1]) * arg2 + (float) this.field2045[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(F)F", line = 16)
    private static final float method997(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lso;Lkba;)V", line = 28)
    public final void method998(class494 arg0, class113 arg1) {
        int var3 = arg0.method2964((byte) 77);
        this.field2048[0] = var3 >> 4;
        this.field2048[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field2046[0] = this.field2046[1] = 0;
            return;
        }
        this.field2046[0] = arg0.method2998(true);
        this.field2046[1] = arg0.method2998(true);
        int var4 = arg0.method2964((byte) 87);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field2048[var5]; var8++) {
                this.field2044[var5][0][var8] = arg0.method2998(true);
                this.field2045[var5][0][var8] = arg0.method2998(true);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field2048[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field2044[var6][1][var7] = this.field2044[var6][0][var7];
                    this.field2045[var6][1][var7] = this.field2045[var6][0][var7];
                } else {
                    this.field2044[var6][1][var7] = arg0.method2998(true);
                    this.field2045[var6][1][var7] = arg0.method2998(true);
                }
            }
        }
        if (var4 != 0 || this.field2046[1] != this.field2046[0]) {
            arg1.method856(arg0);
        }
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(IIF)F", line = 94)
    private final float method999(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2044[arg0][1][arg1] - this.field2044[arg0][0][arg1]) * arg2 + (float) this.field2044[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method997(var5);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "()V", line = 104)
    public static void method1000() {
        field2041 = null;
        field2043 = null;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IF)I", line = 112)
    public final int method1001(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field2046[1] - this.field2046[0]) * arg1 + (float) this.field2046[0];
            float var4 = var3 * 0.0030517578F;
            field2042 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field2047 = (int) (field2042 * 65536.0F);
        }
        if (this.field2048[arg0] == 0) {
            return 0;
        }
        float var5 = this.method996(arg0, 0, arg1);
        field2041[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method999(arg0, 0, arg1));
        field2041[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field2048[arg0]; var6++) {
            float var9 = this.method996(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method999(arg0, var6, arg1));
            float var11 = var9 * var9;
            field2041[arg0][var6 * 2 + 1] = field2041[arg0][var6 * 2 - 1] * var11;
            field2041[arg0][var6 * 2] = field2041[arg0][var6 * 2 - 1] * var10 + field2041[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field2041[arg0][var12] += field2041[arg0][var12 - 1] * var10 + field2041[arg0][var12 - 2] * var11;
            }
            field2041[arg0][1] += field2041[arg0][0] * var10 + var11;
            field2041[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field2048[0] * 2; var7++) {
                field2041[0][var7] *= field2042;
            }
        }
        for (int var8 = 0; var8 < this.field2048[arg0] * 2; var8++) {
            field2043[arg0][var8] = (int) (field2041[arg0][var8] * 65536.0F);
        }
        return this.field2048[arg0] * 2;
    }
}
