import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class200 {

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "[I")
    private int[] field3013 = new int[2];

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "[[[I")
    private int[][][] field3014 = new int[2][2][4];

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "[I")
    public int[] field3012 = new int[2];

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "[[[I")
    private int[][][] field3016 = new int[2][2][4];

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "[[I")
    public static int[][] field3010 = new int[2][8];

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "[[F")
    private static float[][] field3011 = new float[2][8];

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "F")
    private static float field3017;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IF)I")
    public final int method1195(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field3013[1] - this.field3013[0]) * arg1 + (float) this.field3013[0];
            float var4 = var3 * 0.0030517578F;
            field3017 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field3015 = (int) (field3017 * 65536.0F);
        }
        if (this.field3012[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1196(arg0, 0, arg1);
        field3011[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1199(arg0, 0, arg1));
        field3011[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field3012[arg0]; var6++) {
            float var9 = this.method1196(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method1199(arg0, var6, arg1));
            float var11 = var9 * var9;
            field3011[arg0][var6 * 2 + 1] = field3011[arg0][var6 * 2 - 1] * var11;
            field3011[arg0][var6 * 2] = field3011[arg0][var6 * 2 - 1] * var10 + field3011[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field3011[arg0][var12] += field3011[arg0][var12 - 1] * var10 + field3011[arg0][var12 - 2] * var11;
            }
            field3011[arg0][1] += field3011[arg0][0] * var10 + var11;
            field3011[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field3012[0] * 2; var7++) {
                field3011[0][var7] *= field3017;
            }
        }
        for (int var8 = 0; var8 < this.field3012[arg0] * 2; var8++) {
            field3010[arg0][var8] = (int) (field3011[arg0][var8] * 65536.0F);
        }
        return this.field3012[arg0] * 2;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIF)F")
    private final float method1196(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3014[arg0][1][arg1] - this.field3014[arg0][0][arg1]) * arg2 + (float) this.field3014[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(F)F")
    private static final float method1197(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lef;Lfr;)V")
    public final void method1198(class385 arg0, class436 arg1) {
        int var3 = arg0.method2343(255);
        this.field3012[0] = var3 >> 4;
        this.field3012[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field3013[0] = this.field3013[1] = 0;
            return;
        }
        this.field3013[0] = arg0.method2323(-72);
        this.field3013[1] = arg0.method2323(-65);
        int var4 = arg0.method2343(255);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field3012[var5]; var8++) {
                this.field3016[var5][0][var8] = arg0.method2323(-30);
                this.field3014[var5][0][var8] = arg0.method2323(-67);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field3012[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field3016[var6][1][var7] = this.field3016[var6][0][var7];
                    this.field3014[var6][1][var7] = this.field3014[var6][0][var7];
                } else {
                    this.field3016[var6][1][var7] = arg0.method2323(-42);
                    this.field3014[var6][1][var7] = arg0.method2323(-50);
                }
            }
        }
        if (var4 != 0 || this.field3013[1] != this.field3013[0]) {
            arg1.method2677(arg0);
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(IIF)F")
    private final float method1199(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3016[arg0][1][arg1] - this.field3016[arg0][0][arg1]) * arg2 + (float) this.field3016[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1197(var5);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "()V")
    public static void method1200() {
        field3011 = null;
        field3010 = null;
    }
}
