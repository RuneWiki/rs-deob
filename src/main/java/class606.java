import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class606 {

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "[I")
    private int[] field8545 = new int[2];

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "[[[I")
    private int[][][] field8544 = new int[2][2][4];

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "[I")
    public int[] field8549 = new int[2];

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "[[[I")
    private int[][][] field8550 = new int[2][2][4];

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "[[F")
    private static float[][] field8548 = new float[2][8];

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "[[I")
    public static int[][] field8547 = new int[2][8];

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "F")
    private static float field8551;

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "I")
    public static int field8546;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIF)F", line = 4)
    private final float method3405(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field8544[arg0][1][arg1] - this.field8544[arg0][0][arg1]) * arg2 + (float) this.field8544[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IF)I", line = 10)
    public final int method3406(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field8545[1] - this.field8545[0]) * arg1 + (float) this.field8545[0];
            float var4 = var3 * 0.0030517578F;
            field8551 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field8546 = (int) (field8551 * 65536.0F);
        }
        if (this.field8549[arg0] == 0) {
            return 0;
        }
        float var5 = this.method3405(arg0, 0, arg1);
        field8548[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method3409(arg0, 0, arg1));
        field8548[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field8549[arg0]; var6++) {
            float var9 = this.method3405(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method3409(arg0, var6, arg1));
            float var11 = var9 * var9;
            field8548[arg0][var6 * 2 + 1] = field8548[arg0][var6 * 2 - 1] * var11;
            field8548[arg0][var6 * 2] = field8548[arg0][var6 * 2 - 1] * var10 + field8548[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field8548[arg0][var12] += field8548[arg0][var12 - 1] * var10 + field8548[arg0][var12 - 2] * var11;
            }
            field8548[arg0][1] += field8548[arg0][0] * var10 + var11;
            field8548[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field8549[0] * 2; var7++) {
                field8548[0][var7] *= field8551;
            }
        }
        for (int var8 = 0; var8 < this.field8549[arg0] * 2; var8++) {
            field8547[arg0][var8] = (int) (field8548[arg0][var8] * 65536.0F);
        }
        return this.field8549[arg0] * 2;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lmo;Lbaa;)V", line = 83)
    public final void method3407(class695 arg0, class482 arg1) {
        int var3 = arg0.method3826(false);
        this.field8549[0] = var3 >> 4;
        this.field8549[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field8545[0] = this.field8545[1] = 0;
            return;
        }
        this.field8545[0] = arg0.method3847((byte) 118);
        this.field8545[1] = arg0.method3847((byte) 118);
        int var4 = arg0.method3826(false);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field8549[var5]; var8++) {
                this.field8550[var5][0][var8] = arg0.method3847((byte) 118);
                this.field8544[var5][0][var8] = arg0.method3847((byte) 118);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field8549[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field8550[var6][1][var7] = this.field8550[var6][0][var7];
                    this.field8544[var6][1][var7] = this.field8544[var6][0][var7];
                } else {
                    this.field8550[var6][1][var7] = arg0.method3847((byte) 118);
                    this.field8544[var6][1][var7] = arg0.method3847((byte) 118);
                }
            }
        }
        if (var4 != 0 || this.field8545[1] != this.field8545[0]) {
            arg1.method2810(arg0);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(F)F", line = 164)
    private static final float method3408(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(IIF)F", line = 172)
    private final float method3409(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field8550[arg0][1][arg1] - this.field8550[arg0][0][arg1]) * arg2 + (float) this.field8550[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method3408(var5);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "()V", line = 180)
    public static void method3410() {
        field8548 = null;
        field8547 = null;
    }
}
