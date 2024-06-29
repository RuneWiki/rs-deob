import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class258 {

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "[I")
    public int[] field4409 = new int[2];

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "[[[I")
    private int[][][] field4412 = new int[2][2][4];

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "[I")
    private int[] field4414 = new int[2];

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "[[[I")
    private int[][][] field4415 = new int[2][2][4];

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "[[F")
    private static float[][] field4408 = new float[2][8];

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "[[I")
    public static int[][] field4413 = new int[2][8];

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "F")
    private static float field4411;

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "I")
    public static int field4410;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIF)F", line = 5)
    private final float method1791(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field4412[arg0][1][arg1] - this.field4412[arg0][0][arg1]) * arg2 + (float) this.field4412[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IF)I", line = 17)
    public final int method1792(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field4414[1] - this.field4414[0]) * arg1 + (float) this.field4414[0];
            float var4 = var3 * 0.0030517578F;
            field4411 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field4410 = (int) (field4411 * 65536.0F);
        }
        if (this.field4409[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1791(arg0, 0, arg1);
        field4408[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1795(arg0, 0, arg1));
        field4408[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field4409[arg0]; var6++) {
            float var7 = this.method1791(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1795(arg0, var6, arg1));
            float var9 = var7 * var7;
            field4408[arg0][var6 * 2 + 1] = field4408[arg0][var6 * 2 - 1] * var9;
            field4408[arg0][var6 * 2] = field4408[arg0][var6 * 2 - 1] * var8 + field4408[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field4408[arg0][var10] += field4408[arg0][var10 - 1] * var8 + field4408[arg0][var10 - 2] * var9;
            }
            field4408[arg0][1] += field4408[arg0][0] * var8 + var9;
            field4408[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field4409[0] * 2; var11++) {
                field4408[0][var11] *= field4411;
            }
        }
        for (int var12 = 0; var12 < this.field4409[arg0] * 2; var12++) {
            field4413[arg0][var12] = (int) (field4408[arg0][var12] * 65536.0F);
        }
        return this.field4409[arg0] * 2;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lii;Lkh;)V", line = 77)
    public final void method1793(class221 arg0, class7 arg1) {
        int var3 = arg0.method1509(true);
        this.field4409[0] = var3 >> 4;
        this.field4409[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field4414[0] = this.field4414[1] = 0;
            return;
        }
        this.field4414[0] = arg0.method1524((byte) 84);
        this.field4414[1] = arg0.method1524((byte) 96);
        int var4 = arg0.method1509(true);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field4409[var5]; var6++) {
                this.field4415[var5][0][var6] = arg0.method1524((byte) 95);
                this.field4412[var5][0][var6] = arg0.method1524((byte) 60);
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field4409[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field4415[var7][1][var8] = this.field4415[var7][0][var8];
                    this.field4412[var7][1][var8] = this.field4412[var7][0][var8];
                } else {
                    this.field4415[var7][1][var8] = arg0.method1524((byte) 91);
                    this.field4412[var7][1][var8] = arg0.method1524((byte) 68);
                }
            }
        }
        if (var4 != 0 || this.field4414[1] != this.field4414[0]) {
            arg1.method87(arg0);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "()V", line = 149)
    public static void method1794() {
        field4408 = (float[][]) null;
        field4413 = (int[][]) null;
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(IIF)F", line = 156)
    private final float method1795(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field4415[arg0][1][arg1] - this.field4415[arg0][0][arg1]) * arg2 + (float) this.field4415[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1796(var5);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(F)F", line = 166)
    private static final float method1796(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }
}
