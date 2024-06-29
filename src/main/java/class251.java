import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class251 {

    @OriginalMember(owner = "client!he", name = "g", descriptor = "[I")
    public int[] field3926 = new int[2];

    @OriginalMember(owner = "client!he", name = "e", descriptor = "[[[I")
    private int[][][] field3924 = new int[2][2][4];

    @OriginalMember(owner = "client!he", name = "d", descriptor = "[I")
    private int[] field3923 = new int[2];

    @OriginalMember(owner = "client!he", name = "b", descriptor = "[[[I")
    private int[][][] field3921 = new int[2][2][4];

    @OriginalMember(owner = "client!he", name = "a", descriptor = "[[I")
    public static int[][] field3920 = new int[2][8];

    @OriginalMember(owner = "client!he", name = "h", descriptor = "[[F")
    private static float[][] field3927 = new float[2][8];

    @OriginalMember(owner = "client!he", name = "c", descriptor = "F")
    private static float field3922;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IF)I", line = 7)
    public final int method1696(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field3923[1] - this.field3923[0]) * arg1 + (float) this.field3923[0];
            float var4 = var3 * 0.0030517578F;
            field3922 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field3925 = (int) (field3922 * 65536.0F);
        }
        if (this.field3926[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1700(arg0, 0, arg1);
        field3927[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1697(arg0, 0, arg1));
        field3927[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field3926[arg0]; var6++) {
            float var7 = this.method1700(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1697(arg0, var6, arg1));
            float var9 = var7 * var7;
            field3927[arg0][var6 * 2 + 1] = field3927[arg0][var6 * 2 - 1] * var9;
            field3927[arg0][var6 * 2] = field3927[arg0][var6 * 2 - 1] * var8 + field3927[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field3927[arg0][var10] += field3927[arg0][var10 - 1] * var8 + field3927[arg0][var10 - 2] * var9;
            }
            field3927[arg0][1] += field3927[arg0][0] * var8 + var9;
            field3927[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field3926[0] * 2; var11++) {
                field3927[0][var11] *= field3922;
            }
        }
        for (int var12 = 0; var12 < this.field3926[arg0] * 2; var12++) {
            field3920[arg0][var12] = (int) (field3927[arg0][var12] * 65536.0F);
        }
        return this.field3926[arg0] * 2;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIF)F", line = 68)
    private final float method1697(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3924[arg0][1][arg1] - this.field3924[arg0][0][arg1]) * arg2 + (float) this.field3924[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1701(var5);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lgn;Lgg;)V", line = 80)
    public final void method1698(class303 arg0, class53 arg1) {
        int var3 = arg0.method2043((byte) -122);
        this.field3926[0] = var3 >> 4;
        this.field3926[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field3923[0] = this.field3923[1] = 0;
            return;
        }
        this.field3923[0] = arg0.method1994(false);
        this.field3923[1] = arg0.method1994(false);
        int var4 = arg0.method2043((byte) -110);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field3926[var5]; var6++) {
                this.field3924[var5][0][var6] = arg0.method1994(false);
                this.field3921[var5][0][var6] = arg0.method1994(false);
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field3926[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field3924[var7][1][var8] = this.field3924[var7][0][var8];
                    this.field3921[var7][1][var8] = this.field3921[var7][0][var8];
                } else {
                    this.field3924[var7][1][var8] = arg0.method1994(false);
                    this.field3921[var7][1][var8] = arg0.method1994(false);
                }
            }
        }
        if (var4 != 0 || this.field3923[1] != this.field3923[0]) {
            arg1.method359(arg0);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "()V", line = 155)
    public static void method1699() {
        field3927 = (float[][]) null;
        field3920 = (int[][]) null;
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(IIF)F", line = 166)
    private final float method1700(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3921[arg0][1][arg1] - this.field3921[arg0][0][arg1]) * arg2 + (float) this.field3921[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(F)F", line = 180)
    private static final float method1701(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }
}
