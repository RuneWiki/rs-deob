import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class150 {

    @OriginalMember(owner = "client!qo", name = "f", descriptor = "[I")
    public int[] field2127 = new int[2];

    @OriginalMember(owner = "client!qo", name = "e", descriptor = "[[[I")
    private int[][][] field2126 = new int[2][2][4];

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "[[[I")
    private int[][][] field2125 = new int[2][2][4];

    @OriginalMember(owner = "client!qo", name = "h", descriptor = "[I")
    private int[] field2129 = new int[2];

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "[[I")
    public static int[][] field2123 = new int[2][8];

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "[[F")
    private static float[][] field2122 = new float[2][8];

    @OriginalMember(owner = "client!qo", name = "g", descriptor = "F")
    private static float field2128;

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "I")
    public static int field2124;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIF)F", line = 6)
    private final float method1149(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2125[arg0][1][arg1] - this.field2125[arg0][0][arg1]) * arg2 + (float) this.field2125[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "()V", line = 18)
    public static void method1150() {
        field2122 = (float[][]) null;
        field2123 = (int[][]) null;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IF)I", line = 22)
    public final int method1151(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field2129[1] - this.field2129[0]) * arg1 + (float) this.field2129[0];
            float var4 = var3 * 0.0030517578F;
            field2128 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field2124 = (int) (field2128 * 65536.0F);
        }
        if (this.field2127[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1149(arg0, 0, arg1);
        field2122[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1154(arg0, 0, arg1));
        field2122[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field2127[arg0]; var6++) {
            float var7 = this.method1149(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1154(arg0, var6, arg1));
            float var9 = var7 * var7;
            field2122[arg0][var6 * 2 + 1] = field2122[arg0][var6 * 2 - 1] * var9;
            field2122[arg0][var6 * 2] = field2122[arg0][var6 * 2 - 1] * var8 + field2122[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field2122[arg0][var10] += field2122[arg0][var10 - 1] * var8 + field2122[arg0][var10 - 2] * var9;
            }
            field2122[arg0][1] += field2122[arg0][0] * var8 + var9;
            field2122[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field2127[0] * 2; var11++) {
                field2122[0][var11] *= field2128;
            }
        }
        for (int var12 = 0; var12 < this.field2127[arg0] * 2; var12++) {
            field2123[arg0][var12] = (int) (field2122[arg0][var12] * 65536.0F);
        }
        return this.field2127[arg0] * 2;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(F)F", line = 91)
    private static final float method1152(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lfd;Lh;)V", line = 103)
    public final void method1153(class299 arg0, class189 arg1) {
        int var3 = arg0.method2096((byte) -122);
        this.field2127[0] = var3 >> 4;
        this.field2127[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field2129[0] = this.field2129[1] = 0;
            return;
        }
        this.field2129[0] = arg0.method2083((byte) -28);
        this.field2129[1] = arg0.method2083((byte) -27);
        int var4 = arg0.method2096((byte) -122);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field2127[var5]; var6++) {
                this.field2126[var5][0][var6] = arg0.method2083((byte) -82);
                this.field2125[var5][0][var6] = arg0.method2083((byte) -124);
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field2127[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field2126[var7][1][var8] = this.field2126[var7][0][var8];
                    this.field2125[var7][1][var8] = this.field2125[var7][0][var8];
                } else {
                    this.field2126[var7][1][var8] = arg0.method2083((byte) -18);
                    this.field2125[var7][1][var8] = arg0.method2083((byte) -128);
                }
            }
        }
        if (var4 != 0 || this.field2129[1] != this.field2129[0]) {
            arg1.method1376(arg0);
        }
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(IIF)F", line = 170)
    private final float method1154(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2126[arg0][1][arg1] - this.field2126[arg0][0][arg1]) * arg2 + (float) this.field2126[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1152(var5);
    }
}
