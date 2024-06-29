import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class273 {

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "[[[I")
    private int[][][] field4804 = new int[2][2][4];

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "[[[I")
    private int[][][] field4805 = new int[2][2][4];

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "[I")
    public int[] field4808 = new int[2];

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "[I")
    private int[] field4810 = new int[2];

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "[[F")
    private static float[][] field4809 = new float[2][8];

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "[[I")
    public static int[][] field4807 = new int[2][8];

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "F")
    private static float field4803;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "I")
    public static int field4806;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIF)F")
    private final float method1855(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field4805[arg0][1][arg1] - this.field4805[arg0][0][arg1]) * arg2 + (float) this.field4805[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1860(var5);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "()V")
    public static void method1856() {
        field4809 = null;
        field4807 = null;
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(IIF)F")
    private final float method1857(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field4804[arg0][1][arg1] - this.field4804[arg0][0][arg1]) * arg2 + (float) this.field4804[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lsi;Lhj;)V")
    public final void method1858(class194 arg0, class69 arg1) {
        int var3 = arg0.method1301(-8317);
        this.field4808[0] = var3 >> 4;
        this.field4808[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field4810[0] = this.field4810[1] = 0;
            return;
        }
        this.field4810[0] = arg0.method1294((byte) 3);
        this.field4810[1] = arg0.method1294((byte) 3);
        int var4 = arg0.method1301(-8317);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field4808[var5]; var8++) {
                this.field4805[var5][0][var8] = arg0.method1294((byte) 3);
                this.field4804[var5][0][var8] = arg0.method1294((byte) 3);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field4808[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field4805[var6][1][var7] = this.field4805[var6][0][var7];
                    this.field4804[var6][1][var7] = this.field4804[var6][0][var7];
                } else {
                    this.field4805[var6][1][var7] = arg0.method1294((byte) 3);
                    this.field4804[var6][1][var7] = arg0.method1294((byte) 3);
                }
            }
        }
        if (var4 != 0 || this.field4810[1] != this.field4810[0]) {
            arg1.method445(arg0);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IF)I")
    public final int method1859(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field4810[1] - this.field4810[0]) * arg1 + (float) this.field4810[0];
            float var4 = var3 * 0.0030517578F;
            field4803 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field4806 = (int) (field4803 * 65536.0F);
        }
        if (this.field4808[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1857(arg0, 0, arg1);
        field4809[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1855(arg0, 0, arg1));
        field4809[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field4808[arg0]; var6++) {
            float var9 = this.method1857(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method1855(arg0, var6, arg1));
            float var11 = var9 * var9;
            field4809[arg0][var6 * 2 + 1] = field4809[arg0][var6 * 2 - 1] * var11;
            field4809[arg0][var6 * 2] = field4809[arg0][var6 * 2 - 1] * var10 + field4809[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field4809[arg0][var12] += field4809[arg0][var12 - 1] * var10 + field4809[arg0][var12 - 2] * var11;
            }
            field4809[arg0][1] += field4809[arg0][0] * var10 + var11;
            field4809[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field4808[0] * 2; var7++) {
                field4809[0][var7] *= field4803;
            }
        }
        for (int var8 = 0; var8 < this.field4808[arg0] * 2; var8++) {
            field4807[arg0][var8] = (int) (field4809[arg0][var8] * 65536.0F);
        }
        return this.field4808[arg0] * 2;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(F)F")
    private static final float method1860(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }
}
