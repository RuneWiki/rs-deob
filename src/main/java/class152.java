import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class152 {

    @OriginalMember(owner = "client!un", name = "b", descriptor = "[[[I")
    private int[][][] field2286 = new int[2][2][4];

    @OriginalMember(owner = "client!un", name = "d", descriptor = "[I")
    private int[] field2288 = new int[2];

    @OriginalMember(owner = "client!un", name = "e", descriptor = "[[[I")
    private int[][][] field2289 = new int[2][2][4];

    @OriginalMember(owner = "client!un", name = "h", descriptor = "[I")
    public int[] field2292 = new int[2];

    @OriginalMember(owner = "client!un", name = "f", descriptor = "[[F")
    private static float[][] field2290 = new float[2][8];

    @OriginalMember(owner = "client!un", name = "a", descriptor = "[[I")
    public static int[][] field2285 = new int[2][8];

    @OriginalMember(owner = "client!un", name = "g", descriptor = "F")
    private static float field2291;

    @OriginalMember(owner = "client!un", name = "c", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "()V", line = 3)
    public static void method1081() {
        field2290 = null;
        field2285 = null;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Lco;Lgd;)V", line = 9)
    public final void method1082(class268 arg0, class250 arg1) {
        int var3 = arg0.method1738(255);
        this.field2292[0] = var3 >> 4;
        this.field2292[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field2288[0] = this.field2288[1] = 0;
            return;
        }
        this.field2288[0] = arg0.method1745(32132);
        this.field2288[1] = arg0.method1745(32132);
        int var4 = arg0.method1738(255);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field2292[var5]; var8++) {
                this.field2289[var5][0][var8] = arg0.method1745(32132);
                this.field2286[var5][0][var8] = arg0.method1745(32132);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field2292[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field2289[var6][1][var7] = this.field2289[var6][0][var7];
                    this.field2286[var6][1][var7] = this.field2286[var6][0][var7];
                } else {
                    this.field2289[var6][1][var7] = arg0.method1745(32132);
                    this.field2286[var6][1][var7] = arg0.method1745(32132);
                }
            }
        }
        if (var4 != 0 || this.field2288[1] != this.field2288[0]) {
            arg1.method1582(arg0);
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(F)F", line = 76)
    private static final float method1083(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IIF)F", line = 86)
    private final float method1084(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2286[arg0][1][arg1] - this.field2286[arg0][0][arg1]) * arg2 + (float) this.field2286[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(IIF)F", line = 92)
    private final float method1085(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2289[arg0][1][arg1] - this.field2289[arg0][0][arg1]) * arg2 + (float) this.field2289[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1083(var5);
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IF)I", line = 99)
    public final int method1086(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field2288[1] - this.field2288[0]) * arg1 + (float) this.field2288[0];
            float var4 = var3 * 0.0030517578F;
            field2291 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field2287 = (int) (field2291 * 65536.0F);
        }
        if (this.field2292[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1084(arg0, 0, arg1);
        field2290[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1085(arg0, 0, arg1));
        field2290[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field2292[arg0]; var6++) {
            float var9 = this.method1084(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method1085(arg0, var6, arg1));
            float var11 = var9 * var9;
            field2290[arg0][var6 * 2 + 1] = field2290[arg0][var6 * 2 - 1] * var11;
            field2290[arg0][var6 * 2] = field2290[arg0][var6 * 2 - 1] * var10 + field2290[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field2290[arg0][var12] += field2290[arg0][var12 - 1] * var10 + field2290[arg0][var12 - 2] * var11;
            }
            field2290[arg0][1] += field2290[arg0][0] * var10 + var11;
            field2290[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field2292[0] * 2; var7++) {
                field2290[0][var7] *= field2291;
            }
        }
        for (int var8 = 0; var8 < this.field2292[arg0] * 2; var8++) {
            field2285[arg0][var8] = (int) (field2290[arg0][var8] * 65536.0F);
        }
        return this.field2292[arg0] * 2;
    }
}
