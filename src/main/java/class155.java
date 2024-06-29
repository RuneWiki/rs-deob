import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class155 {

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "[I")
    public int[] field2461 = new int[2];

    @OriginalMember(owner = "client!pn", name = "f", descriptor = "[I")
    private int[] field2464 = new int[2];

    @OriginalMember(owner = "client!pn", name = "e", descriptor = "[[[I")
    private int[][][] field2463 = new int[2][2][4];

    @OriginalMember(owner = "client!pn", name = "g", descriptor = "[[[I")
    private int[][][] field2465 = new int[2][2][4];

    @OriginalMember(owner = "client!pn", name = "d", descriptor = "[[I")
    public static int[][] field2462 = new int[2][8];

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "[[F")
    private static float[][] field2459 = new float[2][8];

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "F")
    private static float field2460;

    @OriginalMember(owner = "client!pn", name = "h", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIF)F", line = 7)
    private final float method1209(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2463[arg0][1][arg1] - this.field2463[arg0][0][arg1]) * arg2 + (float) this.field2463[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "()V", line = 13)
    public static void method1210() {
        field2459 = (float[][]) null;
        field2462 = (int[][]) null;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(F)F", line = 21)
    private static final float method1211(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(IIF)F", line = 31)
    private final float method1212(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2465[arg0][1][arg1] - this.field2465[arg0][0][arg1]) * arg2 + (float) this.field2465[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1211(var5);
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lqm;Lcb;)V", line = 39)
    public final void method1213(class227 arg0, class80 arg1) {
        int var3 = arg0.method1720((byte) -91);
        this.field2461[0] = var3 >> 4;
        this.field2461[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field2464[0] = this.field2464[1] = 0;
            return;
        }
        this.field2464[0] = arg0.method1765(true);
        this.field2464[1] = arg0.method1765(true);
        int var4 = arg0.method1720((byte) -120);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field2461[var5]; var6++) {
                this.field2465[var5][0][var6] = arg0.method1765(true);
                this.field2463[var5][0][var6] = arg0.method1765(true);
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field2461[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field2465[var7][1][var8] = this.field2465[var7][0][var8];
                    this.field2463[var7][1][var8] = this.field2463[var7][0][var8];
                } else {
                    this.field2465[var7][1][var8] = arg0.method1765(true);
                    this.field2463[var7][1][var8] = arg0.method1765(true);
                }
            }
        }
        if (var4 != 0 || this.field2464[1] != this.field2464[0]) {
            arg1.method655(arg0);
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IF)I", line = 116)
    public final int method1214(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field2464[1] - this.field2464[0]) * arg1 + (float) this.field2464[0];
            float var4 = var3 * 0.0030517578F;
            field2460 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field2466 = (int) (field2460 * 65536.0F);
        }
        if (this.field2461[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1209(arg0, 0, arg1);
        field2459[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1212(arg0, 0, arg1));
        field2459[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field2461[arg0]; var6++) {
            float var7 = this.method1209(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1212(arg0, var6, arg1));
            float var9 = var7 * var7;
            field2459[arg0][var6 * 2 + 1] = field2459[arg0][var6 * 2 - 1] * var9;
            field2459[arg0][var6 * 2] = field2459[arg0][var6 * 2 - 1] * var8 + field2459[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field2459[arg0][var10] += field2459[arg0][var10 - 1] * var8 + field2459[arg0][var10 - 2] * var9;
            }
            field2459[arg0][1] += field2459[arg0][0] * var8 + var9;
            field2459[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field2461[0] * 2; var11++) {
                field2459[0][var11] *= field2460;
            }
        }
        for (int var12 = 0; var12 < this.field2461[arg0] * 2; var12++) {
            field2462[arg0][var12] = (int) (field2459[arg0][var12] * 65536.0F);
        }
        return this.field2461[arg0] * 2;
    }
}
