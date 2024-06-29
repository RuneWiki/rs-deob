import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class438 {

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "[I")
    private int[] field5937 = new int[2];

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "[[[I")
    private int[][][] field5939 = new int[2][2][4];

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "[I")
    public int[] field5943 = new int[2];

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "[[[I")
    private int[][][] field5940 = new int[2][2][4];

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "[[F")
    private static float[][] field5936 = new float[2][8];

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "[[I")
    public static int[][] field5941 = new int[2][8];

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "F")
    private static float field5942;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
    public static int field5938;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lbt;Luf;)V")
    public final void method2577(class32 arg0, class285 arg1) {
        int var3 = arg0.method201((byte) -114);
        this.field5943[0] = var3 >> 4;
        this.field5943[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field5937[0] = this.field5937[1] = 0;
            return;
        }
        this.field5937[0] = arg0.method215((byte) 107);
        this.field5937[1] = arg0.method215((byte) 120);
        int var4 = arg0.method201((byte) -122);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field5943[var5]; var8++) {
                this.field5940[var5][0][var8] = arg0.method215((byte) 102);
                this.field5939[var5][0][var8] = arg0.method215((byte) 95);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field5943[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field5940[var6][1][var7] = this.field5940[var6][0][var7];
                    this.field5939[var6][1][var7] = this.field5939[var6][0][var7];
                } else {
                    this.field5940[var6][1][var7] = arg0.method215((byte) 111);
                    this.field5939[var6][1][var7] = arg0.method215((byte) 91);
                }
            }
        }
        if (var4 != 0 || this.field5937[1] != this.field5937[0]) {
            arg1.method1617(arg0);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "()V")
    public static void method2578() {
        field5936 = null;
        field5941 = null;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IF)I")
    public final int method2579(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field5937[1] - this.field5937[0]) * arg1 + (float) this.field5937[0];
            float var4 = var3 * 0.0030517578F;
            field5942 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field5938 = (int) (field5942 * 65536.0F);
        }
        if (this.field5943[arg0] == 0) {
            return 0;
        }
        float var5 = this.method2580(arg0, 0, arg1);
        field5936[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method2582(arg0, 0, arg1));
        field5936[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field5943[arg0]; var6++) {
            float var9 = this.method2580(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method2582(arg0, var6, arg1));
            float var11 = var9 * var9;
            field5936[arg0][var6 * 2 + 1] = field5936[arg0][var6 * 2 - 1] * var11;
            field5936[arg0][var6 * 2] = field5936[arg0][var6 * 2 - 1] * var10 + field5936[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field5936[arg0][var12] += field5936[arg0][var12 - 1] * var10 + field5936[arg0][var12 - 2] * var11;
            }
            field5936[arg0][1] += field5936[arg0][0] * var10 + var11;
            field5936[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field5943[0] * 2; var7++) {
                field5936[0][var7] *= field5942;
            }
        }
        for (int var8 = 0; var8 < this.field5943[arg0] * 2; var8++) {
            field5941[arg0][var8] = (int) (field5936[arg0][var8] * 65536.0F);
        }
        return this.field5943[arg0] * 2;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIF)F")
    private final float method2580(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field5939[arg0][1][arg1] - this.field5939[arg0][0][arg1]) * arg2 + (float) this.field5939[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(F)F")
    private static final float method2581(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(IIF)F")
    private final float method2582(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field5940[arg0][1][arg1] - this.field5940[arg0][0][arg1]) * arg2 + (float) this.field5940[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method2581(var5);
    }
}
