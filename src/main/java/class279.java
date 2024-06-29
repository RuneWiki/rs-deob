import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class279 {

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "[[[I")
    private int[][][] field4626 = new int[2][2][4];

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "[[[I")
    private int[][][] field4628 = new int[2][2][4];

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "[I")
    private int[] field4623 = new int[2];

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "[I")
    public int[] field4629 = new int[2];

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "[[F")
    private static float[][] field4625 = new float[2][8];

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "[[I")
    public static int[][] field4622 = new int[2][8];

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "F")
    private static float field4624;

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "I")
    public static int field4627;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "()V")
    public static void method1941() {
        field4625 = null;
        field4622 = null;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IF)I")
    public final int method1942(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field4623[1] - this.field4623[0]) * arg1 + (float) this.field4623[0];
            float var4 = var3 * 0.0030517578F;
            field4624 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field4627 = (int) (field4624 * 65536.0F);
        }
        if (this.field4629[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1945(arg0, 0, arg1);
        field4625[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1944(arg0, 0, arg1));
        field4625[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field4629[arg0]; var6++) {
            float var9 = this.method1945(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method1944(arg0, var6, arg1));
            float var11 = var9 * var9;
            field4625[arg0][var6 * 2 + 1] = field4625[arg0][var6 * 2 - 1] * var11;
            field4625[arg0][var6 * 2] = field4625[arg0][var6 * 2 - 1] * var10 + field4625[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field4625[arg0][var12] += field4625[arg0][var12 - 1] * var10 + field4625[arg0][var12 - 2] * var11;
            }
            field4625[arg0][1] += field4625[arg0][0] * var10 + var11;
            field4625[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field4629[0] * 2; var7++) {
                field4625[0][var7] *= field4624;
            }
        }
        for (int var8 = 0; var8 < this.field4629[arg0] * 2; var8++) {
            field4622[arg0][var8] = (int) (field4625[arg0][var8] * 65536.0F);
        }
        return this.field4629[arg0] * 2;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(F)F")
    private static final float method1943(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIF)F")
    private final float method1944(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field4628[arg0][1][arg1] - this.field4628[arg0][0][arg1]) * arg2 + (float) this.field4628[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1943(var5);
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(IIF)F")
    private final float method1945(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field4626[arg0][1][arg1] - this.field4626[arg0][0][arg1]) * arg2 + (float) this.field4626[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lma;Lce;)V")
    public final void method1946(class202 arg0, class234 arg1) {
        int var3 = arg0.method1420((byte) 0);
        this.field4629[0] = var3 >> 4;
        this.field4629[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field4623[0] = this.field4623[1] = 0;
            return;
        }
        this.field4623[0] = arg0.method1419(97);
        this.field4623[1] = arg0.method1419(98);
        int var4 = arg0.method1420((byte) 0);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field4629[var5]; var8++) {
                this.field4628[var5][0][var8] = arg0.method1419(109);
                this.field4626[var5][0][var8] = arg0.method1419(107);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field4629[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field4628[var6][1][var7] = this.field4628[var6][0][var7];
                    this.field4626[var6][1][var7] = this.field4626[var6][0][var7];
                } else {
                    this.field4628[var6][1][var7] = arg0.method1419(71);
                    this.field4626[var6][1][var7] = arg0.method1419(124);
                }
            }
        }
        if (var4 != 0 || this.field4623[1] != this.field4623[0]) {
            arg1.method1629(arg0);
        }
    }
}
