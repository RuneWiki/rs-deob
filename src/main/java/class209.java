import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class209 {

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "[[[I")
    private int[][][] field3590 = new int[2][2][4];

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "[[[I")
    private int[][][] field3591 = new int[2][2][4];

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "[I")
    public int[] field3594 = new int[2];

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "[I")
    private int[] field3595 = new int[2];

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "[[I")
    public static int[][] field3589 = new int[2][8];

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "[[F")
    private static float[][] field3588 = new float[2][8];

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "F")
    private static float field3593;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Llj;Lod;)V")
    public final void method1405(class216 arg0, class175 arg1) {
        int var3 = arg0.method1446(5350);
        this.field3594[0] = var3 >> 4;
        this.field3594[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field3595[0] = this.field3595[1] = 0;
            return;
        }
        this.field3595[0] = arg0.method1487(96);
        this.field3595[1] = arg0.method1487(27);
        int var4 = arg0.method1446(5350);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field3594[var5]; var8++) {
                this.field3590[var5][0][var8] = arg0.method1487(59);
                this.field3591[var5][0][var8] = arg0.method1487(107);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field3594[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field3590[var6][1][var7] = this.field3590[var6][0][var7];
                    this.field3591[var6][1][var7] = this.field3591[var6][0][var7];
                } else {
                    this.field3590[var6][1][var7] = arg0.method1487(55);
                    this.field3591[var6][1][var7] = arg0.method1487(78);
                }
            }
        }
        if (var4 != 0 || this.field3595[1] != this.field3595[0]) {
            arg1.method1223(arg0);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIF)F")
    private final float method1406(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3591[arg0][1][arg1] - this.field3591[arg0][0][arg1]) * arg2 + (float) this.field3591[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "()V")
    public static void method1407() {
        field3588 = null;
        field3589 = null;
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(IIF)F")
    private final float method1408(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3590[arg0][1][arg1] - this.field3590[arg0][0][arg1]) * arg2 + (float) this.field3590[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1410(var5);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IF)I")
    public final int method1409(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field3595[1] - this.field3595[0]) * arg1 + (float) this.field3595[0];
            float var4 = var3 * 0.0030517578F;
            field3593 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field3592 = (int) (field3593 * 65536.0F);
        }
        if (this.field3594[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1406(arg0, 0, arg1);
        field3588[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1408(arg0, 0, arg1));
        field3588[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field3594[arg0]; var6++) {
            float var9 = this.method1406(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method1408(arg0, var6, arg1));
            float var11 = var9 * var9;
            field3588[arg0][var6 * 2 + 1] = field3588[arg0][var6 * 2 - 1] * var11;
            field3588[arg0][var6 * 2] = field3588[arg0][var6 * 2 - 1] * var10 + field3588[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field3588[arg0][var12] += field3588[arg0][var12 - 1] * var10 + field3588[arg0][var12 - 2] * var11;
            }
            field3588[arg0][1] += field3588[arg0][0] * var10 + var11;
            field3588[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field3594[0] * 2; var7++) {
                field3588[0][var7] *= field3593;
            }
        }
        for (int var8 = 0; var8 < this.field3594[arg0] * 2; var8++) {
            field3589[arg0][var8] = (int) (field3588[arg0][var8] * 65536.0F);
        }
        return this.field3594[arg0] * 2;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(F)F")
    private static final float method1410(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }
}
