import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class9 {

    @OriginalMember(owner = "client!n", name = "b", descriptor = "[[[I")
    private int[][][] field131 = new int[2][2][4];

    @OriginalMember(owner = "client!n", name = "c", descriptor = "[I")
    public int[] field132 = new int[2];

    @OriginalMember(owner = "client!n", name = "e", descriptor = "[[[I")
    private int[][][] field134 = new int[2][2][4];

    @OriginalMember(owner = "client!n", name = "g", descriptor = "[I")
    private int[] field136 = new int[2];

    @OriginalMember(owner = "client!n", name = "f", descriptor = "[[F")
    private static float[][] field135 = new float[2][8];

    @OriginalMember(owner = "client!n", name = "h", descriptor = "[[I")
    public static int[][] field137 = new int[2][8];

    @OriginalMember(owner = "client!n", name = "d", descriptor = "F")
    private static float field133;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "I")
    public static int field130;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "()V", line = 4)
    public static void method84() {
        field135 = (float[][]) null;
        field137 = (int[][]) null;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(F)F", line = 17)
    private static final float method85(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIF)F", line = 26)
    private final float method86(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field131[arg0][1][arg1] - this.field131[arg0][0][arg1]) * arg2 + (float) this.field131[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method85(var5);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lwm;Lkd;)V", line = 32)
    public final void method87(class254 arg0, class123 arg1) {
        int var3 = arg0.method1774((byte) -116);
        this.field132[0] = var3 >> 4;
        this.field132[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field136[0] = this.field136[1] = 0;
            return;
        }
        this.field136[0] = arg0.method1755(false);
        this.field136[1] = arg0.method1755(false);
        int var4 = arg0.method1774((byte) -96);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field132[var5]; var6++) {
                this.field131[var5][0][var6] = arg0.method1755(false);
                this.field134[var5][0][var6] = arg0.method1755(false);
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field132[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field131[var7][1][var8] = this.field131[var7][0][var8];
                    this.field134[var7][1][var8] = this.field134[var7][0][var8];
                } else {
                    this.field131[var7][1][var8] = arg0.method1755(false);
                    this.field134[var7][1][var8] = arg0.method1755(false);
                }
            }
        }
        if (var4 != 0 || this.field136[1] != this.field136[0]) {
            arg1.method918(arg0);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IF)I", line = 109)
    public final int method88(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field136[1] - this.field136[0]) * arg1 + (float) this.field136[0];
            float var4 = var3 * 0.0030517578F;
            field133 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field130 = (int) (field133 * 65536.0F);
        }
        if (this.field132[arg0] == 0) {
            return 0;
        }
        float var5 = this.method89(arg0, 0, arg1);
        field135[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method86(arg0, 0, arg1));
        field135[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field132[arg0]; var6++) {
            float var7 = this.method89(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method86(arg0, var6, arg1));
            float var9 = var7 * var7;
            field135[arg0][var6 * 2 + 1] = field135[arg0][var6 * 2 - 1] * var9;
            field135[arg0][var6 * 2] = field135[arg0][var6 * 2 - 1] * var8 + field135[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field135[arg0][var10] += field135[arg0][var10 - 1] * var8 + field135[arg0][var10 - 2] * var9;
            }
            field135[arg0][1] += field135[arg0][0] * var8 + var9;
            field135[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field132[0] * 2; var11++) {
                field135[0][var11] *= field133;
            }
        }
        for (int var12 = 0; var12 < this.field132[arg0] * 2; var12++) {
            field137[arg0][var12] = (int) (field135[arg0][var12] * 65536.0F);
        }
        return this.field132[arg0] * 2;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(IIF)F", line = 171)
    private final float method89(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field134[arg0][1][arg1] - this.field134[arg0][0][arg1]) * arg2 + (float) this.field134[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }
}
