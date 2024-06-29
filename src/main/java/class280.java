import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class280 {

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "[[[I")
    private int[][][] field4021 = new int[2][2][4];

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "[I")
    public int[] field4020 = new int[2];

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "[I")
    private int[] field4023 = new int[2];

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "[[[I")
    private int[][][] field4024 = new int[2][2][4];

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "[[F")
    private static float[][] field4018 = new float[2][8];

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "[[I")
    public static int[][] field4022 = new int[2][8];

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "F")
    private static float field4017;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIF)F")
    private final float method1825(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field4024[arg0][1][arg1] - this.field4024[arg0][0][arg1]) * arg2 + (float) this.field4024[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1829(var5);
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(IIF)F")
    private final float method1826(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field4021[arg0][1][arg1] - this.field4021[arg0][0][arg1]) * arg2 + (float) this.field4021[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IF)I")
    public final int method1827(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field4023[1] - this.field4023[0]) * arg1 + (float) this.field4023[0];
            float var4 = var3 * 0.0030517578F;
            field4017 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field4019 = (int) (field4017 * 65536.0F);
        }
        if (this.field4020[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1826(arg0, 0, arg1);
        field4018[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1825(arg0, 0, arg1));
        field4018[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field4020[arg0]; var6++) {
            float var9 = this.method1826(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method1825(arg0, var6, arg1));
            float var11 = var9 * var9;
            field4018[arg0][var6 * 2 + 1] = field4018[arg0][var6 * 2 - 1] * var11;
            field4018[arg0][var6 * 2] = field4018[arg0][var6 * 2 - 1] * var10 + field4018[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field4018[arg0][var12] += field4018[arg0][var12 - 1] * var10 + field4018[arg0][var12 - 2] * var11;
            }
            field4018[arg0][1] += field4018[arg0][0] * var10 + var11;
            field4018[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field4020[0] * 2; var7++) {
                field4018[0][var7] *= field4017;
            }
        }
        for (int var8 = 0; var8 < this.field4020[arg0] * 2; var8++) {
            field4022[arg0][var8] = (int) (field4018[arg0][var8] * 65536.0F);
        }
        return this.field4020[arg0] * 2;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "()V")
    public static void method1828() {
        field4018 = null;
        field4022 = null;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(F)F")
    private static final float method1829(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lgga;Lmca;)V")
    public final void method1830(class511 arg0, class40 arg1) {
        int var3 = arg0.method3013(-112);
        this.field4020[0] = var3 >> 4;
        this.field4020[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field4023[0] = this.field4023[1] = 0;
            return;
        }
        this.field4023[0] = arg0.method3002(-1);
        this.field4023[1] = arg0.method3002(-1);
        int var4 = arg0.method3013(4);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field4020[var5]; var8++) {
                this.field4024[var5][0][var8] = arg0.method3002(-1);
                this.field4021[var5][0][var8] = arg0.method3002(-1);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field4020[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field4024[var6][1][var7] = this.field4024[var6][0][var7];
                    this.field4021[var6][1][var7] = this.field4021[var6][0][var7];
                } else {
                    this.field4024[var6][1][var7] = arg0.method3002(-1);
                    this.field4021[var6][1][var7] = arg0.method3002(-1);
                }
            }
        }
        if (var4 != 0 || this.field4023[1] != this.field4023[0]) {
            arg1.method322(arg0);
        }
    }
}
