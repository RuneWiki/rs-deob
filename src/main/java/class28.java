import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class28 {

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "[I")
    public int[] field483 = new int[2];

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "[I")
    private int[] field488 = new int[2];

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "[[[I")
    private int[][][] field487 = new int[2][2][4];

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "[[[I")
    private int[][][] field490 = new int[2][2][4];

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "[[F")
    private static float[][] field484 = new float[2][8];

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "[[I")
    public static int[][] field489 = new int[2][8];

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "F")
    private static float field485;

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "()V")
    public static void method231() {
        field484 = null;
        field489 = null;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIF)F")
    private final float method232(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field487[arg0][1][arg1] - this.field487[arg0][0][arg1]) * arg2 + (float) this.field487[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method236(var5);
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(IIF)F")
    private final float method233(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field490[arg0][1][arg1] - this.field490[arg0][0][arg1]) * arg2 + (float) this.field490[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IF)I")
    public final int method234(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field488[1] - this.field488[0]) * arg1 + (float) this.field488[0];
            float var4 = var3 * 0.0030517578F;
            field485 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field486 = (int) (field485 * 65536.0F);
        }
        if (this.field483[arg0] == 0) {
            return 0;
        }
        float var5 = this.method233(arg0, 0, arg1);
        field484[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method232(arg0, 0, arg1));
        field484[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field483[arg0]; var6++) {
            float var9 = this.method233(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method232(arg0, var6, arg1));
            float var11 = var9 * var9;
            field484[arg0][var6 * 2 + 1] = field484[arg0][var6 * 2 - 1] * var11;
            field484[arg0][var6 * 2] = field484[arg0][var6 * 2 - 1] * var10 + field484[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field484[arg0][var12] += field484[arg0][var12 - 1] * var10 + field484[arg0][var12 - 2] * var11;
            }
            field484[arg0][1] += field484[arg0][0] * var10 + var11;
            field484[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field483[0] * 2; var7++) {
                field484[0][var7] *= field485;
            }
        }
        for (int var8 = 0; var8 < this.field483[arg0] * 2; var8++) {
            field489[arg0][var8] = (int) (field484[arg0][var8] * 65536.0F);
        }
        return this.field483[arg0] * 2;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lvf;Lq;)V")
    public final void method235(class230 arg0, class24 arg1) {
        int var3 = arg0.method1516((byte) 82);
        this.field483[0] = var3 >> 4;
        this.field483[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field488[0] = this.field488[1] = 0;
            return;
        }
        this.field488[0] = arg0.method1535(2);
        this.field488[1] = arg0.method1535(2);
        int var4 = arg0.method1516((byte) 82);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field483[var5]; var8++) {
                this.field487[var5][0][var8] = arg0.method1535(2);
                this.field490[var5][0][var8] = arg0.method1535(2);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field483[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field487[var6][1][var7] = this.field487[var6][0][var7];
                    this.field490[var6][1][var7] = this.field490[var6][0][var7];
                } else {
                    this.field487[var6][1][var7] = arg0.method1535(2);
                    this.field490[var6][1][var7] = arg0.method1535(2);
                }
            }
        }
        if (var4 != 0 || this.field488[1] != this.field488[0]) {
            arg1.method209(arg0);
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(F)F")
    private static final float method236(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }
}
