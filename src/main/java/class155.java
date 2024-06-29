import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class155 {

    @OriginalMember(owner = "client!df", name = "b", descriptor = "[[[I")
    private int[][][] field2738 = new int[2][2][4];

    @OriginalMember(owner = "client!df", name = "f", descriptor = "[I")
    private int[] field2742 = new int[2];

    @OriginalMember(owner = "client!df", name = "h", descriptor = "[[[I")
    private int[][][] field2744 = new int[2][2][4];

    @OriginalMember(owner = "client!df", name = "g", descriptor = "[I")
    public int[] field2743 = new int[2];

    @OriginalMember(owner = "client!df", name = "a", descriptor = "[[I")
    public static int[][] field2737 = new int[2][8];

    @OriginalMember(owner = "client!df", name = "c", descriptor = "[[F")
    private static float[][] field2739 = new float[2][8];

    @OriginalMember(owner = "client!df", name = "e", descriptor = "F")
    private static float field2741;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIF)F", line = 5)
    private final float method1204(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2738[arg0][1][arg1] - this.field2738[arg0][0][arg1]) * arg2 + (float) this.field2738[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IF)I", line = 10)
    public final int method1205(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field2742[1] - this.field2742[0]) * arg1 + (float) this.field2742[0];
            float var4 = var3 * 0.0030517578F;
            field2741 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field2740 = (int) (field2741 * 65536.0F);
        }
        if (this.field2743[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1204(arg0, 0, arg1);
        field2739[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1209(arg0, 0, arg1));
        field2739[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field2743[arg0]; var6++) {
            float var7 = this.method1204(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1209(arg0, var6, arg1));
            float var9 = var7 * var7;
            field2739[arg0][var6 * 2 + 1] = field2739[arg0][var6 * 2 - 1] * var9;
            field2739[arg0][var6 * 2] = field2739[arg0][var6 * 2 - 1] * var8 + field2739[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field2739[arg0][var10] += field2739[arg0][var10 - 1] * var8 + field2739[arg0][var10 - 2] * var9;
            }
            field2739[arg0][1] += field2739[arg0][0] * var8 + var9;
            field2739[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field2743[0] * 2; var11++) {
                field2739[0][var11] *= field2741;
            }
        }
        for (int var12 = 0; var12 < this.field2743[arg0] * 2; var12++) {
            field2737[arg0][var12] = (int) (field2739[arg0][var12] * 65536.0F);
        }
        return this.field2743[arg0] * 2;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "()V", line = 71)
    public static void method1206() {
        field2739 = (float[][]) null;
        field2737 = (int[][]) null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lb;Lhf;)V", line = 82)
    public final void method1207(class94 arg0, class14 arg1) {
        int var3 = arg0.method756(915905888);
        this.field2743[0] = var3 >> 4;
        this.field2743[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field2742[0] = this.field2742[1] = 0;
            return;
        }
        this.field2742[0] = arg0.method761((byte) 108);
        this.field2742[1] = arg0.method761((byte) 108);
        int var4 = arg0.method756(915905888);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field2743[var5]; var6++) {
                this.field2744[var5][0][var6] = arg0.method761((byte) 108);
                this.field2738[var5][0][var6] = arg0.method761((byte) 108);
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field2743[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field2744[var7][1][var8] = this.field2744[var7][0][var8];
                    this.field2738[var7][1][var8] = this.field2738[var7][0][var8];
                } else {
                    this.field2744[var7][1][var8] = arg0.method761((byte) 108);
                    this.field2738[var7][1][var8] = arg0.method761((byte) 108);
                }
            }
        }
        if (var4 != 0 || this.field2742[1] != this.field2742[0]) {
            arg1.method116(arg0);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(F)F", line = 157)
    private static final float method1208(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(IIF)F", line = 170)
    private final float method1209(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2744[arg0][1][arg1] - this.field2744[arg0][0][arg1]) * arg2 + (float) this.field2744[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1208(var5);
    }
}
