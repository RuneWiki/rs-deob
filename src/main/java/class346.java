import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class346 {

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "[[[I")
    private int[][][] field4778 = new int[2][2][4];

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "[I")
    public int[] field4776 = new int[2];

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "[[[I")
    private int[][][] field4782 = new int[2][2][4];

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "[I")
    private int[] field4780 = new int[2];

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "[[F")
    private static float[][] field4777 = new float[2][8];

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "[[I")
    public static int[][] field4783 = new int[2][8];

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "F")
    private static float field4781;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "I")
    public static int field4779;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIF)F", line = 5)
    private final float method2149(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field4778[arg0][1][arg1] - this.field4778[arg0][0][arg1]) * arg2 + (float) this.field4778[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lkk;Ljh;)V", line = 19)
    public final void method2150(class161 arg0, class348 arg1) {
        int var3 = arg0.method1172((byte) -123);
        this.field4776[0] = var3 >> 4;
        this.field4776[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field4780[0] = this.field4780[1] = 0;
            return;
        }
        this.field4780[0] = arg0.method1134(-16848);
        this.field4780[1] = arg0.method1134(-16848);
        int var4 = arg0.method1172((byte) 122);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field4776[var5]; var8++) {
                this.field4782[var5][0][var8] = arg0.method1134(-16848);
                this.field4778[var5][0][var8] = arg0.method1134(-16848);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field4776[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field4782[var6][1][var7] = this.field4782[var6][0][var7];
                    this.field4778[var6][1][var7] = this.field4778[var6][0][var7];
                } else {
                    this.field4782[var6][1][var7] = arg0.method1134(-16848);
                    this.field4778[var6][1][var7] = arg0.method1134(-16848);
                }
            }
        }
        if (var4 != 0 || this.field4780[1] != this.field4780[0]) {
            arg1.method2160(arg0);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(F)F", line = 85)
    private static final float method2151(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(IIF)F", line = 90)
    private final float method2152(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field4782[arg0][1][arg1] - this.field4782[arg0][0][arg1]) * arg2 + (float) this.field4782[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method2151(var5);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IF)I", line = 95)
    public final int method2153(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field4780[1] - this.field4780[0]) * arg1 + (float) this.field4780[0];
            float var4 = var3 * 0.0030517578F;
            field4781 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field4779 = (int) (field4781 * 65536.0F);
        }
        if (this.field4776[arg0] == 0) {
            return 0;
        }
        float var5 = this.method2149(arg0, 0, arg1);
        field4777[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method2152(arg0, 0, arg1));
        field4777[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field4776[arg0]; var6++) {
            float var9 = this.method2149(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method2152(arg0, var6, arg1));
            float var11 = var9 * var9;
            field4777[arg0][var6 * 2 + 1] = field4777[arg0][var6 * 2 - 1] * var11;
            field4777[arg0][var6 * 2] = field4777[arg0][var6 * 2 - 1] * var10 + field4777[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field4777[arg0][var12] += field4777[arg0][var12 - 1] * var10 + field4777[arg0][var12 - 2] * var11;
            }
            field4777[arg0][1] += field4777[arg0][0] * var10 + var11;
            field4777[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field4776[0] * 2; var7++) {
                field4777[0][var7] *= field4781;
            }
        }
        for (int var8 = 0; var8 < this.field4776[arg0] * 2; var8++) {
            field4783[arg0][var8] = (int) (field4777[arg0][var8] * 65536.0F);
        }
        return this.field4776[arg0] * 2;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "()V", line = 163)
    public static void method2154() {
        field4777 = null;
        field4783 = null;
    }
}
