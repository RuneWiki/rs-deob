import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class222 {

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "[I")
    public int[] field3984 = new int[2];

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "[I")
    private int[] field3987 = new int[2];

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "[[[I")
    private int[][][] field3990 = new int[2][2][4];

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "[[[I")
    private int[][][] field3988 = new int[2][2][4];

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "[[I")
    public static int[][] field3989 = new int[2][8];

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "[[F")
    private static float[][] field3985 = new float[2][8];

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "F")
    private static float field3986;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
    public static int field3991;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "()V")
    public static void method1558() {
        field3985 = null;
        field3989 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIF)F")
    private final float method1559(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3990[arg0][1][arg1] - this.field3990[arg0][0][arg1]) * arg2 + (float) this.field3990[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1562(var5);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IF)I")
    public final int method1560(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field3987[1] - this.field3987[0]) * arg1 + (float) this.field3987[0];
            float var4 = var3 * 0.0030517578F;
            field3986 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field3991 = (int) (field3986 * 65536.0F);
        }
        if (this.field3984[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1561(arg0, 0, arg1);
        field3985[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1559(arg0, 0, arg1));
        field3985[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field3984[arg0]; var6++) {
            float var9 = this.method1561(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method1559(arg0, var6, arg1));
            float var11 = var9 * var9;
            field3985[arg0][var6 * 2 + 1] = field3985[arg0][var6 * 2 - 1] * var11;
            field3985[arg0][var6 * 2] = field3985[arg0][var6 * 2 - 1] * var10 + field3985[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field3985[arg0][var12] += field3985[arg0][var12 - 1] * var10 + field3985[arg0][var12 - 2] * var11;
            }
            field3985[arg0][1] += field3985[arg0][0] * var10 + var11;
            field3985[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field3984[0] * 2; var7++) {
                field3985[0][var7] *= field3986;
            }
        }
        for (int var8 = 0; var8 < this.field3984[arg0] * 2; var8++) {
            field3989[arg0][var8] = (int) (field3985[arg0][var8] * 65536.0F);
        }
        return this.field3984[arg0] * 2;
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(IIF)F")
    private final float method1561(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3988[arg0][1][arg1] - this.field3988[arg0][0][arg1]) * arg2 + (float) this.field3988[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(F)F")
    private static final float method1562(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lqk;Lcb;)V")
    public final void method1563(class200 arg0, class231 arg1) {
        int var3 = arg0.method1408((byte) -71);
        this.field3984[0] = var3 >> 4;
        this.field3984[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field3987[0] = this.field3987[1] = 0;
            return;
        }
        this.field3987[0] = arg0.method1410(-67);
        this.field3987[1] = arg0.method1410(-53);
        int var4 = arg0.method1408((byte) -114);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field3984[var5]; var8++) {
                this.field3990[var5][0][var8] = arg0.method1410(-98);
                this.field3988[var5][0][var8] = arg0.method1410(-59);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field3984[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field3990[var6][1][var7] = this.field3990[var6][0][var7];
                    this.field3988[var6][1][var7] = this.field3988[var6][0][var7];
                } else {
                    this.field3990[var6][1][var7] = arg0.method1410(-59);
                    this.field3988[var6][1][var7] = arg0.method1410(-79);
                }
            }
        }
        if (var4 != 0 || this.field3987[1] != this.field3987[0]) {
            arg1.method1608(arg0);
        }
    }
}
