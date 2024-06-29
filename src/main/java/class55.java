import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class55 {

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "[I")
    public int[] field847 = new int[2];

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "[[[I")
    private int[][][] field850 = new int[2][2][4];

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "[[[I")
    private int[][][] field849 = new int[2][2][4];

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "[I")
    private int[] field851 = new int[2];

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "[[F")
    private static float[][] field846 = new float[2][8];

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "[[I")
    public static int[][] field852 = new int[2][8];

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "F")
    private static float field848;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIF)F", line = 4)
    private final float method493(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field849[arg0][1][arg1] - this.field849[arg0][0][arg1]) * arg2 + (float) this.field849[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lpi;Li;)V", line = 11)
    public final void method494(class336 arg0, class237 arg1) {
        int var3 = arg0.method2364(-9069);
        this.field847[0] = var3 >> 4;
        this.field847[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field851[0] = this.field851[1] = 0;
            return;
        }
        this.field851[0] = arg0.method2339((byte) -46);
        this.field851[1] = arg0.method2339((byte) -46);
        int var4 = arg0.method2364(-9069);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field847[var5]; var6++) {
                this.field850[var5][0][var6] = arg0.method2339((byte) -46);
                this.field849[var5][0][var6] = arg0.method2339((byte) -46);
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field847[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field850[var7][1][var8] = this.field850[var7][0][var8];
                    this.field849[var7][1][var8] = this.field849[var7][0][var8];
                } else {
                    this.field850[var7][1][var8] = arg0.method2339((byte) -46);
                    this.field849[var7][1][var8] = arg0.method2339((byte) -46);
                }
            }
        }
        if (var4 != 0 || this.field851[1] != this.field851[0]) {
            arg1.method1681(arg0);
        }
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(IIF)F", line = 77)
    private final float method495(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field850[arg0][1][arg1] - this.field850[arg0][0][arg1]) * arg2 + (float) this.field850[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method497(var5);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IF)I", line = 86)
    public final int method496(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field851[1] - this.field851[0]) * arg1 + (float) this.field851[0];
            float var4 = var3 * 0.0030517578F;
            field848 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field853 = (int) (field848 * 65536.0F);
        }
        if (this.field847[arg0] == 0) {
            return 0;
        }
        float var5 = this.method493(arg0, 0, arg1);
        field846[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method495(arg0, 0, arg1));
        field846[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field847[arg0]; var6++) {
            float var7 = this.method493(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method495(arg0, var6, arg1));
            float var9 = var7 * var7;
            field846[arg0][var6 * 2 + 1] = field846[arg0][var6 * 2 - 1] * var9;
            field846[arg0][var6 * 2] = field846[arg0][var6 * 2 - 1] * var8 + field846[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field846[arg0][var10] += field846[arg0][var10 - 1] * var8 + field846[arg0][var10 - 2] * var9;
            }
            field846[arg0][1] += field846[arg0][0] * var8 + var9;
            field846[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field847[0] * 2; var11++) {
                field846[0][var11] *= field848;
            }
        }
        for (int var12 = 0; var12 < this.field847[arg0] * 2; var12++) {
            field852[arg0][var12] = (int) (field846[arg0][var12] * 65536.0F);
        }
        return this.field847[arg0] * 2;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(F)F", line = 151)
    private static final float method497(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "()V", line = 162)
    public static void method498() {
        field846 = (float[][]) null;
        field852 = (int[][]) null;
    }
}
