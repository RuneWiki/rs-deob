import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class274 {

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "[[[I")
    private int[][][] field4836 = new int[2][2][4];

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "[I")
    private int[] field4840 = new int[2];

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "[[[I")
    private int[][][] field4841 = new int[2][2][4];

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "[I")
    public int[] field4839 = new int[2];

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "[[I")
    public static int[][] field4837 = new int[2][8];

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "[[F")
    private static float[][] field4842 = new float[2][8];

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "F")
    private static float field4835;

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "I")
    public static int field4838;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IF)I")
    public final int method1820(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field4840[1] - this.field4840[0]) * arg1 + (float) this.field4840[0];
            float var4 = var3 * 0.0030517578F;
            field4835 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field4838 = (int) (field4835 * 65536.0F);
        }
        if (this.field4839[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1822(arg0, 0, arg1);
        field4842[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1821(arg0, 0, arg1));
        field4842[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field4839[arg0]; var6++) {
            float var9 = this.method1822(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method1821(arg0, var6, arg1));
            float var11 = var9 * var9;
            field4842[arg0][var6 * 2 + 1] = field4842[arg0][var6 * 2 - 1] * var11;
            field4842[arg0][var6 * 2] = field4842[arg0][var6 * 2 - 1] * var10 + field4842[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field4842[arg0][var12] += field4842[arg0][var12 - 1] * var10 + field4842[arg0][var12 - 2] * var11;
            }
            field4842[arg0][1] += field4842[arg0][0] * var10 + var11;
            field4842[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field4839[0] * 2; var7++) {
                field4842[0][var7] *= field4835;
            }
        }
        for (int var8 = 0; var8 < this.field4839[arg0] * 2; var8++) {
            field4837[arg0][var8] = (int) (field4842[arg0][var8] * 65536.0F);
        }
        return this.field4839[arg0] * 2;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIF)F")
    private final float method1821(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field4836[arg0][1][arg1] - this.field4836[arg0][0][arg1]) * arg2 + (float) this.field4836[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1823(var5);
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(IIF)F")
    private final float method1822(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field4841[arg0][1][arg1] - this.field4841[arg0][0][arg1]) * arg2 + (float) this.field4841[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(F)F")
    private static final float method1823(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "()V")
    public static void method1824() {
        field4842 = null;
        field4837 = null;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lik;Lri;)V")
    public final void method1825(class261 arg0, class66 arg1) {
        int var3 = arg0.method1693((byte) -93);
        this.field4839[0] = var3 >> 4;
        this.field4839[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field4840[0] = this.field4840[1] = 0;
            return;
        }
        this.field4840[0] = arg0.method1740((byte) 65);
        this.field4840[1] = arg0.method1740((byte) 99);
        int var4 = arg0.method1693((byte) 58);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field4839[var5]; var8++) {
                this.field4836[var5][0][var8] = arg0.method1740((byte) 77);
                this.field4841[var5][0][var8] = arg0.method1740((byte) 61);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field4839[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field4836[var6][1][var7] = this.field4836[var6][0][var7];
                    this.field4841[var6][1][var7] = this.field4841[var6][0][var7];
                } else {
                    this.field4836[var6][1][var7] = arg0.method1740((byte) 79);
                    this.field4841[var6][1][var7] = arg0.method1740((byte) 126);
                }
            }
        }
        if (var4 != 0 || this.field4840[1] != this.field4840[0]) {
            arg1.method437(arg0);
        }
    }
}
