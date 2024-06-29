import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class47 {

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "[I")
    public int[] field587 = new int[2];

    @OriginalMember(owner = "client!gm", name = "g", descriptor = "[I")
    private int[] field592 = new int[2];

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "[[[I")
    private int[][][] field589 = new int[2][2][4];

    @OriginalMember(owner = "client!gm", name = "h", descriptor = "[[[I")
    private int[][][] field593 = new int[2][2][4];

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "[[I")
    public static int[][] field588 = new int[2][8];

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "[[F")
    private static float[][] field591 = new float[2][8];

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "F")
    private static float field590;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "()V", line = 10)
    public static void method322() {
        field591 = (float[][]) null;
        field588 = (int[][]) null;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIF)F", line = 17)
    private final float method323(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field589[arg0][1][arg1] - this.field589[arg0][0][arg1]) * arg2 + (float) this.field589[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method327(var5);
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IF)I", line = 22)
    public final int method324(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field592[1] - this.field592[0]) * arg1 + (float) this.field592[0];
            float var4 = var3 * 0.0030517578F;
            field590 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field586 = (int) (field590 * 65536.0F);
        }
        if (this.field587[arg0] == 0) {
            return 0;
        }
        float var5 = this.method326(arg0, 0, arg1);
        field591[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method323(arg0, 0, arg1));
        field591[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field587[arg0]; var6++) {
            float var7 = this.method326(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method323(arg0, var6, arg1));
            float var9 = var7 * var7;
            field591[arg0][var6 * 2 + 1] = field591[arg0][var6 * 2 - 1] * var9;
            field591[arg0][var6 * 2] = field591[arg0][var6 * 2 - 1] * var8 + field591[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field591[arg0][var10] += field591[arg0][var10 - 1] * var8 + field591[arg0][var10 - 2] * var9;
            }
            field591[arg0][1] += field591[arg0][0] * var8 + var9;
            field591[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field587[0] * 2; var11++) {
                field591[0][var11] *= field590;
            }
        }
        for (int var12 = 0; var12 < this.field587[arg0] * 2; var12++) {
            field588[arg0][var12] = (int) (field591[arg0][var12] * 65536.0F);
        }
        return this.field587[arg0] * 2;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lre;Lfm;)V", line = 89)
    public final void method325(class263 arg0, class322 arg1) {
        int var3 = arg0.method1787(false);
        this.field587[0] = var3 >> 4;
        this.field587[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field592[0] = this.field592[1] = 0;
            return;
        }
        this.field592[0] = arg0.method1830((byte) -77);
        this.field592[1] = arg0.method1830((byte) -77);
        int var4 = arg0.method1787(false);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field587[var5]; var6++) {
                this.field589[var5][0][var6] = arg0.method1830((byte) -77);
                this.field593[var5][0][var6] = arg0.method1830((byte) -77);
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field587[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field589[var7][1][var8] = this.field589[var7][0][var8];
                    this.field593[var7][1][var8] = this.field593[var7][0][var8];
                } else {
                    this.field589[var7][1][var8] = arg0.method1830((byte) -77);
                    this.field593[var7][1][var8] = arg0.method1830((byte) -77);
                }
            }
        }
        if (var4 != 0 || this.field592[1] != this.field592[0]) {
            arg1.method2208(arg0);
        }
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(IIF)F", line = 157)
    private final float method326(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field593[arg0][1][arg1] - this.field593[arg0][0][arg1]) * arg2 + (float) this.field593[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(F)F", line = 163)
    private static final float method327(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }
}
