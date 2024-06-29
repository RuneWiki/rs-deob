import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class156 {

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "[I")
    private int[] field2043 = new int[2];

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "[I")
    public int[] field2044 = new int[2];

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "[[[I")
    private int[][][] field2047 = new int[2][2][4];

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "[[[I")
    private int[][][] field2049 = new int[2][2][4];

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "[[F")
    private static float[][] field2046 = new float[2][8];

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "[[I")
    public static int[][] field2045 = new int[2][8];

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "F")
    private static float field2048;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IF)I", line = 7)
    public final int method931(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field2043[1] - this.field2043[0]) * arg1 + (float) this.field2043[0];
            float var4 = var3 * 0.0030517578F;
            field2048 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field2042 = (int) (field2048 * 65536.0F);
        }
        if (this.field2044[arg0] == 0) {
            return 0;
        }
        float var5 = this.method934(arg0, 0, arg1);
        field2046[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method936(arg0, 0, arg1));
        field2046[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field2044[arg0]; var6++) {
            float var9 = this.method934(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method936(arg0, var6, arg1));
            float var11 = var9 * var9;
            field2046[arg0][var6 * 2 + 1] = field2046[arg0][var6 * 2 - 1] * var11;
            field2046[arg0][var6 * 2] = field2046[arg0][var6 * 2 - 1] * var10 + field2046[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field2046[arg0][var12] += field2046[arg0][var12 - 1] * var10 + field2046[arg0][var12 - 2] * var11;
            }
            field2046[arg0][1] += field2046[arg0][0] * var10 + var11;
            field2046[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field2044[0] * 2; var7++) {
                field2046[0][var7] *= field2048;
            }
        }
        for (int var8 = 0; var8 < this.field2044[arg0] * 2; var8++) {
            field2045[arg0][var8] = (int) (field2046[arg0][var8] * 65536.0F);
        }
        return this.field2044[arg0] * 2;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lug;Lmi;)V", line = 74)
    public final void method932(class396 arg0, class344 arg1) {
        int var3 = arg0.method2388((byte) -121);
        this.field2044[0] = var3 >> 4;
        this.field2044[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field2043[0] = this.field2043[1] = 0;
            return;
        }
        this.field2043[0] = arg0.method2386(-23648);
        this.field2043[1] = arg0.method2386(-23648);
        int var4 = arg0.method2388((byte) -110);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field2044[var5]; var8++) {
                this.field2047[var5][0][var8] = arg0.method2386(-23648);
                this.field2049[var5][0][var8] = arg0.method2386(-23648);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field2044[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field2047[var6][1][var7] = this.field2047[var6][0][var7];
                    this.field2049[var6][1][var7] = this.field2049[var6][0][var7];
                } else {
                    this.field2047[var6][1][var7] = arg0.method2386(-23648);
                    this.field2049[var6][1][var7] = arg0.method2386(-23648);
                }
            }
        }
        if (var4 != 0 || this.field2043[1] != this.field2043[0]) {
            arg1.method1999(arg0);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "()V", line = 143)
    public static void method933() {
        field2046 = null;
        field2045 = null;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIF)F", line = 155)
    private final float method934(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2049[arg0][1][arg1] - this.field2049[arg0][0][arg1]) * arg2 + (float) this.field2049[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(F)F", line = 162)
    private static final float method935(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(IIF)F", line = 173)
    private final float method936(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2047[arg0][1][arg1] - this.field2047[arg0][0][arg1]) * arg2 + (float) this.field2047[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method935(var5);
    }
}
