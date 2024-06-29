import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class34 {

    @OriginalMember(owner = "client!f", name = "b", descriptor = "[[[I")
    private int[][][] field925 = new int[2][2][4];

    @OriginalMember(owner = "client!f", name = "e", descriptor = "[I")
    public int[] field928 = new int[2];

    @OriginalMember(owner = "client!f", name = "c", descriptor = "[[[I")
    private int[][][] field926 = new int[2][2][4];

    @OriginalMember(owner = "client!f", name = "h", descriptor = "[I")
    private int[] field931 = new int[2];

    @OriginalMember(owner = "client!f", name = "d", descriptor = "[[I")
    public static int[][] field927 = new int[2][8];

    @OriginalMember(owner = "client!f", name = "g", descriptor = "[[F")
    private static float[][] field930 = new float[2][8];

    @OriginalMember(owner = "client!f", name = "a", descriptor = "F")
    private static float field924;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(F)F", line = 4)
    private static final float method273(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Luc;Lrd;)V", line = 9)
    public final void method274(class122 arg0, class106 arg1) {
        int var3 = arg0.method943(-1025);
        this.field928[0] = var3 >> 4;
        this.field928[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field931[0] = this.field931[1] = 0;
            return;
        }
        this.field931[0] = arg0.method938((byte) 32);
        this.field931[1] = arg0.method938((byte) -125);
        int var4 = arg0.method943(-1025);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field928[var5]; var8++) {
                this.field925[var5][0][var8] = arg0.method938((byte) 32);
                this.field926[var5][0][var8] = arg0.method938((byte) -105);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field928[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field925[var6][1][var7] = this.field925[var6][0][var7];
                    this.field926[var6][1][var7] = this.field926[var6][0][var7];
                } else {
                    this.field925[var6][1][var7] = arg0.method938((byte) 8);
                    this.field926[var6][1][var7] = arg0.method938((byte) -100);
                }
            }
        }
        if (var4 != 0 || this.field931[1] != this.field931[0]) {
            arg1.method780(arg0);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIF)F", line = 77)
    private final float method275(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field926[arg0][1][arg1] - this.field926[arg0][0][arg1]) * arg2 + (float) this.field926[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "()V", line = 83)
    public static void method276() {
        field930 = null;
        field927 = null;
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(IIF)F", line = 89)
    private final float method277(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field925[arg0][1][arg1] - this.field925[arg0][0][arg1]) * arg2 + (float) this.field925[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method273(var5);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IF)I", line = 94)
    public final int method278(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field931[1] - this.field931[0]) * arg1 + (float) this.field931[0];
            float var4 = var3 * 0.0030517578F;
            field924 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field929 = (int) (field924 * 65536.0F);
        }
        if (this.field928[arg0] == 0) {
            return 0;
        }
        float var5 = this.method275(arg0, 0, arg1);
        field930[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method277(arg0, 0, arg1));
        field930[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field928[arg0]; var6++) {
            float var9 = this.method275(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method277(arg0, var6, arg1));
            float var11 = var9 * var9;
            field930[arg0][var6 * 2 + 1] = field930[arg0][var6 * 2 - 1] * var11;
            field930[arg0][var6 * 2] = field930[arg0][var6 * 2 - 1] * var10 + field930[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field930[arg0][var12] += field930[arg0][var12 - 1] * var10 + field930[arg0][var12 - 2] * var11;
            }
            field930[arg0][1] += field930[arg0][0] * var10 + var11;
            field930[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field928[0] * 2; var7++) {
                field930[0][var7] *= field924;
            }
        }
        for (int var8 = 0; var8 < this.field928[arg0] * 2; var8++) {
            field927[arg0][var8] = (int) (field930[arg0][var8] * 65536.0F);
        }
        return this.field928[arg0] * 2;
    }
}
