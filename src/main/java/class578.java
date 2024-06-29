import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class578 {

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "[I")
    private int[] field7752 = new int[2];

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "[I")
    public int[] field7757 = new int[2];

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "[[[I")
    private int[][][] field7758 = new int[2][2][4];

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "[[[I")
    private int[][][] field7755 = new int[2][2][4];

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "[[I")
    public static int[][] field7756 = new int[2][8];

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "[[F")
    private static float[][] field7753 = new float[2][8];

    @OriginalMember(owner = "client!nl", name = "h", descriptor = "F")
    private static float field7759;

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "I")
    public static int field7754;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "()V", line = 3)
    public static void method3224() {
        field7753 = null;
        field7756 = null;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IF)I", line = 9)
    public final int method3225(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field7752[1] - this.field7752[0]) * arg1 + (float) this.field7752[0];
            float var4 = var3 * 0.0030517578F;
            field7759 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field7754 = (int) (field7759 * 65536.0F);
        }
        if (this.field7757[arg0] == 0) {
            return 0;
        }
        float var5 = this.method3226(arg0, 0, arg1);
        field7753[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method3228(arg0, 0, arg1));
        field7753[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field7757[arg0]; var6++) {
            float var9 = this.method3226(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method3228(arg0, var6, arg1));
            float var11 = var9 * var9;
            field7753[arg0][var6 * 2 + 1] = field7753[arg0][var6 * 2 - 1] * var11;
            field7753[arg0][var6 * 2] = field7753[arg0][var6 * 2 - 1] * var10 + field7753[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field7753[arg0][var12] += field7753[arg0][var12 - 1] * var10 + field7753[arg0][var12 - 2] * var11;
            }
            field7753[arg0][1] += field7753[arg0][0] * var10 + var11;
            field7753[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field7757[0] * 2; var7++) {
                field7753[0][var7] *= field7759;
            }
        }
        for (int var8 = 0; var8 < this.field7757[arg0] * 2; var8++) {
            field7756[arg0][var8] = (int) (field7753[arg0][var8] * 65536.0F);
        }
        return this.field7757[arg0] * 2;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIF)F", line = 69)
    private final float method3226(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field7755[arg0][1][arg1] - this.field7755[arg0][0][arg1]) * arg2 + (float) this.field7755[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Ljp;Lvca;)V", line = 75)
    public final void method3227(class376 arg0, class297 arg1) {
        int var3 = arg0.method2398(-1372747256);
        this.field7757[0] = var3 >> 4;
        this.field7757[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field7752[0] = this.field7752[1] = 0;
            return;
        }
        this.field7752[0] = arg0.method2359(-1);
        this.field7752[1] = arg0.method2359(-1);
        int var4 = arg0.method2398(-1372747256);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field7757[var5]; var8++) {
                this.field7758[var5][0][var8] = arg0.method2359(-1);
                this.field7755[var5][0][var8] = arg0.method2359(-1);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field7757[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field7758[var6][1][var7] = this.field7758[var6][0][var7];
                    this.field7755[var6][1][var7] = this.field7755[var6][0][var7];
                } else {
                    this.field7758[var6][1][var7] = arg0.method2359(-1);
                    this.field7755[var6][1][var7] = arg0.method2359(-1);
                }
            }
        }
        if (var4 != 0 || this.field7752[1] != this.field7752[0]) {
            arg1.method1885(arg0);
        }
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(IIF)F", line = 150)
    private final float method3228(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field7758[arg0][1][arg1] - this.field7758[arg0][0][arg1]) * arg2 + (float) this.field7758[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method3229(var5);
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(F)F", line = 162)
    private static final float method3229(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }
}
