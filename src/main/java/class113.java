import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class113 {

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "[[[I")
    private int[][][] field2454 = new int[2][2][4];

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "[I")
    public int[] field2452 = new int[2];

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "[[[I")
    private int[][][] field2457 = new int[2][2][4];

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "[I")
    private int[] field2459 = new int[2];

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "[[F")
    private static float[][] field2455 = new float[2][8];

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "[[I")
    public static int[][] field2458 = new int[2][8];

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "F")
    private static float field2456;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(F)F")
    private static final float method827(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IF)I")
    public final int method828(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field2459[1] - this.field2459[0]) * arg1 + (float) this.field2459[0];
            float var4 = var3 * 0.0030517578F;
            field2456 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field2453 = (int) (field2456 * 65536.0F);
        }
        if (this.field2452[arg0] == 0) {
            return 0;
        }
        float var5 = this.method829(arg0, 0, arg1);
        field2455[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method831(arg0, 0, arg1));
        field2455[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field2452[arg0]; var6++) {
            float var9 = this.method829(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method831(arg0, var6, arg1));
            float var11 = var9 * var9;
            field2455[arg0][var6 * 2 + 1] = field2455[arg0][var6 * 2 - 1] * var11;
            field2455[arg0][var6 * 2] = field2455[arg0][var6 * 2 - 1] * var10 + field2455[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field2455[arg0][var12] += field2455[arg0][var12 - 1] * var10 + field2455[arg0][var12 - 2] * var11;
            }
            field2455[arg0][1] += field2455[arg0][0] * var10 + var11;
            field2455[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field2452[0] * 2; var7++) {
                field2455[0][var7] *= field2456;
            }
        }
        for (int var8 = 0; var8 < this.field2452[arg0] * 2; var8++) {
            field2458[arg0][var8] = (int) (field2455[arg0][var8] * 65536.0F);
        }
        return this.field2452[arg0] * 2;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIF)F")
    private final float method829(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2457[arg0][1][arg1] - this.field2457[arg0][0][arg1]) * arg2 + (float) this.field2457[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "()V")
    public static void method830() {
        field2455 = null;
        field2458 = null;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(IIF)F")
    private final float method831(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2454[arg0][1][arg1] - this.field2454[arg0][0][arg1]) * arg2 + (float) this.field2454[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method827(var5);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lpd;Ls;)V")
    public final void method832(class94 arg0, class105 arg1) {
        int var3 = arg0.method703((byte) 127);
        this.field2452[0] = var3 >> 4;
        this.field2452[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field2459[0] = this.field2459[1] = 0;
            return;
        }
        this.field2459[0] = arg0.method665(8666);
        this.field2459[1] = arg0.method665(8666);
        int var4 = arg0.method703((byte) 120);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field2452[var5]; var8++) {
                this.field2454[var5][0][var8] = arg0.method665(8666);
                this.field2457[var5][0][var8] = arg0.method665(8666);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field2452[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field2454[var6][1][var7] = this.field2454[var6][0][var7];
                    this.field2457[var6][1][var7] = this.field2457[var6][0][var7];
                } else {
                    this.field2454[var6][1][var7] = arg0.method665(8666);
                    this.field2457[var6][1][var7] = arg0.method665(8666);
                }
            }
        }
        if (var4 != 0 || this.field2459[1] != this.field2459[0]) {
            arg1.method786(arg0);
        }
    }
}
