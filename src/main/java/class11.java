import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class11 {

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "[I")
    public int[] field181 = new int[2];

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "[[[I")
    private int[][][] field185 = new int[2][2][4];

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "[I")
    private int[] field182 = new int[2];

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "[[[I")
    private int[][][] field183 = new int[2][2][4];

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "[[F")
    private static float[][] field184 = new float[2][8];

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "[[I")
    public static int[][] field186 = new int[2][8];

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "F")
    private static float field180;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(F)F")
    private static final float method57(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lwe;Lce;)V")
    public final void method58(class75 arg0, class172 arg1) {
        int var3 = arg0.method558(1);
        this.field181[0] = var3 >> 4;
        this.field181[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field182[0] = this.field182[1] = 0;
            return;
        }
        this.field182[0] = arg0.method545((byte) -87);
        this.field182[1] = arg0.method545((byte) 78);
        int var4 = arg0.method558(1);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field181[var5]; var8++) {
                this.field183[var5][0][var8] = arg0.method545((byte) -75);
                this.field185[var5][0][var8] = arg0.method545((byte) -101);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field181[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field183[var6][1][var7] = this.field183[var6][0][var7];
                    this.field185[var6][1][var7] = this.field185[var6][0][var7];
                } else {
                    this.field183[var6][1][var7] = arg0.method545((byte) 79);
                    this.field185[var6][1][var7] = arg0.method545((byte) 62);
                }
            }
        }
        if (var4 != 0 || this.field182[1] != this.field182[0]) {
            arg1.method1225(arg0);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IF)I")
    public final int method59(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field182[1] - this.field182[0]) * arg1 + (float) this.field182[0];
            float var4 = var3 * 0.0030517578F;
            field180 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field187 = (int) (field180 * 65536.0F);
        }
        if (this.field181[arg0] == 0) {
            return 0;
        }
        float var5 = this.method60(arg0, 0, arg1);
        field184[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method62(arg0, 0, arg1));
        field184[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field181[arg0]; var6++) {
            float var9 = this.method60(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method62(arg0, var6, arg1));
            float var11 = var9 * var9;
            field184[arg0][var6 * 2 + 1] = field184[arg0][var6 * 2 - 1] * var11;
            field184[arg0][var6 * 2] = field184[arg0][var6 * 2 - 1] * var10 + field184[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field184[arg0][var12] += field184[arg0][var12 - 1] * var10 + field184[arg0][var12 - 2] * var11;
            }
            field184[arg0][1] += field184[arg0][0] * var10 + var11;
            field184[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field181[0] * 2; var7++) {
                field184[0][var7] *= field180;
            }
        }
        for (int var8 = 0; var8 < this.field181[arg0] * 2; var8++) {
            field186[arg0][var8] = (int) (field184[arg0][var8] * 65536.0F);
        }
        return this.field181[arg0] * 2;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIF)F")
    private final float method60(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field185[arg0][1][arg1] - this.field185[arg0][0][arg1]) * arg2 + (float) this.field185[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "()V")
    public static void method61() {
        field184 = null;
        field186 = null;
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(IIF)F")
    private final float method62(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field183[arg0][1][arg1] - this.field183[arg0][0][arg1]) * arg2 + (float) this.field183[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method57(var5);
    }
}
