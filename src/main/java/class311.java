import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class311 {

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "[I")
    private int[] field4240 = new int[2];

    @OriginalMember(owner = "client!pr", name = "e", descriptor = "[I")
    public int[] field4242 = new int[2];

    @OriginalMember(owner = "client!pr", name = "g", descriptor = "[[[I")
    private int[][][] field4244 = new int[2][2][4];

    @OriginalMember(owner = "client!pr", name = "h", descriptor = "[[[I")
    private int[][][] field4245 = new int[2][2][4];

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "[[I")
    public static int[][] field4238 = new int[2][8];

    @OriginalMember(owner = "client!pr", name = "f", descriptor = "[[F")
    private static float[][] field4243 = new float[2][8];

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "F")
    private static float field4239;

    @OriginalMember(owner = "client!pr", name = "d", descriptor = "I")
    public static int field4241;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(IIF)F", line = 10)
    private final float method1800(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field4244[arg0][1][arg1] - this.field4244[arg0][0][arg1]) * arg2 + (float) this.field4244[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lsi;Lbs;)V", line = 29)
    public final void method1801(class391 arg0, class482 arg1) {
        int var3 = arg0.method2348(-2);
        this.field4242[0] = var3 >> 4;
        this.field4242[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field4240[0] = this.field4240[1] = 0;
            return;
        }
        this.field4240[0] = arg0.method2353((byte) 67);
        this.field4240[1] = arg0.method2353((byte) 78);
        int var4 = arg0.method2348(-2);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field4242[var5]; var8++) {
                this.field4245[var5][0][var8] = arg0.method2353((byte) 103);
                this.field4244[var5][0][var8] = arg0.method2353((byte) 113);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field4242[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field4245[var6][1][var7] = this.field4245[var6][0][var7];
                    this.field4244[var6][1][var7] = this.field4244[var6][0][var7];
                } else {
                    this.field4245[var6][1][var7] = arg0.method2353((byte) 113);
                    this.field4244[var6][1][var7] = arg0.method2353((byte) 81);
                }
            }
        }
        if (var4 != 0 || this.field4240[1] != this.field4240[0]) {
            arg1.method2829(arg0);
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "()V", line = 94)
    public static void method1802() {
        field4243 = null;
        field4238 = null;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(F)F", line = 99)
    private static final float method1803(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(IF)I", line = 112)
    public final int method1804(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field4240[1] - this.field4240[0]) * arg1 + (float) this.field4240[0];
            float var4 = var3 * 0.0030517578F;
            field4239 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field4241 = (int) (field4239 * 65536.0F);
        }
        if (this.field4242[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1800(arg0, 0, arg1);
        field4243[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1805(arg0, 0, arg1));
        field4243[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field4242[arg0]; var6++) {
            float var9 = this.method1800(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method1805(arg0, var6, arg1));
            float var11 = var9 * var9;
            field4243[arg0][var6 * 2 + 1] = field4243[arg0][var6 * 2 - 1] * var11;
            field4243[arg0][var6 * 2] = field4243[arg0][var6 * 2 - 1] * var10 + field4243[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field4243[arg0][var12] += field4243[arg0][var12 - 1] * var10 + field4243[arg0][var12 - 2] * var11;
            }
            field4243[arg0][1] += field4243[arg0][0] * var10 + var11;
            field4243[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field4242[0] * 2; var7++) {
                field4243[0][var7] *= field4239;
            }
        }
        for (int var8 = 0; var8 < this.field4242[arg0] * 2; var8++) {
            field4238[arg0][var8] = (int) (field4243[arg0][var8] * 65536.0F);
        }
        return this.field4242[arg0] * 2;
    }

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "(IIF)F", line = 173)
    private final float method1805(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field4245[arg0][1][arg1] - this.field4245[arg0][0][arg1]) * arg2 + (float) this.field4245[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1803(var5);
    }
}
