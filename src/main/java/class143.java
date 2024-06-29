import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class143 {

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "[[[I")
    private int[][][] field3222 = new int[2][2][4];

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "[I")
    public int[] field3223 = new int[2];

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "[I")
    private int[] field3227 = new int[2];

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "[[[I")
    private int[][][] field3228 = new int[2][2][4];

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "[[F")
    private static float[][] field3226 = new float[2][8];

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "[[I")
    public static int[][] field3225 = new int[2][8];

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "F")
    private static float field3224;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lpa;Lh;)V")
    public final void method1058(class105 arg0, class49 arg1) {
        int var3 = arg0.method831((byte) 76);
        this.field3223[0] = var3 >> 4;
        this.field3223[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field3227[0] = this.field3227[1] = 0;
            return;
        }
        this.field3227[0] = arg0.method838((byte) 5);
        this.field3227[1] = arg0.method838((byte) 5);
        int var4 = arg0.method831((byte) 76);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field3223[var5]; var8++) {
                this.field3222[var5][0][var8] = arg0.method838((byte) 5);
                this.field3228[var5][0][var8] = arg0.method838((byte) 5);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field3223[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field3222[var6][1][var7] = this.field3222[var6][0][var7];
                    this.field3228[var6][1][var7] = this.field3228[var6][0][var7];
                } else {
                    this.field3222[var6][1][var7] = arg0.method838((byte) 5);
                    this.field3228[var6][1][var7] = arg0.method838((byte) 5);
                }
            }
        }
        if (var4 != 0 || this.field3227[1] != this.field3227[0]) {
            arg1.method411(arg0);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "()V")
    public static void method1059() {
        field3226 = null;
        field3225 = null;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IF)I")
    public final int method1060(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field3227[1] - this.field3227[0]) * arg1 + (float) this.field3227[0];
            float var4 = var3 * 0.0030517578F;
            field3224 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field3229 = (int) (field3224 * 65536.0F);
        }
        if (this.field3223[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1062(arg0, 0, arg1);
        field3226[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1061(arg0, 0, arg1));
        field3226[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field3223[arg0]; var6++) {
            float var9 = this.method1062(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method1061(arg0, var6, arg1));
            float var11 = var9 * var9;
            field3226[arg0][var6 * 2 + 1] = field3226[arg0][var6 * 2 - 1] * var11;
            field3226[arg0][var6 * 2] = field3226[arg0][var6 * 2 - 1] * var10 + field3226[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field3226[arg0][var12] += field3226[arg0][var12 - 1] * var10 + field3226[arg0][var12 - 2] * var11;
            }
            field3226[arg0][1] += field3226[arg0][0] * var10 + var11;
            field3226[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field3223[0] * 2; var7++) {
                field3226[0][var7] *= field3224;
            }
        }
        for (int var8 = 0; var8 < this.field3223[arg0] * 2; var8++) {
            field3225[arg0][var8] = (int) (field3226[arg0][var8] * 65536.0F);
        }
        return this.field3223[arg0] * 2;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIF)F")
    private final float method1061(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3222[arg0][1][arg1] - this.field3222[arg0][0][arg1]) * arg2 + (float) this.field3222[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1063(var5);
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(IIF)F")
    private final float method1062(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3228[arg0][1][arg1] - this.field3228[arg0][0][arg1]) * arg2 + (float) this.field3228[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(F)F")
    private static final float method1063(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }
}
