import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class187 {

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "[[[I")
    private int[][][] field3316 = new int[2][2][4];

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "[I")
    private int[] field3317 = new int[2];

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "[I")
    public int[] field3321 = new int[2];

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "[[[I")
    private int[][][] field3320 = new int[2][2][4];

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "[[I")
    public static int[][] field3319 = new int[2][8];

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "[[F")
    private static float[][] field3318 = new float[2][8];

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "F")
    private static float field3323;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
    public static int field3322;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIF)F", line = 8)
    private final float method1268(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3316[arg0][1][arg1] - this.field3316[arg0][0][arg1]) * arg2 + (float) this.field3316[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lva;Lgf;)V", line = 17)
    public final void method1269(class235 arg0, class28 arg1) {
        int var3 = arg0.method1589(106);
        this.field3321[0] = var3 >> 4;
        this.field3321[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field3317[0] = this.field3317[1] = 0;
            return;
        }
        this.field3317[0] = arg0.method1615(-44);
        this.field3317[1] = arg0.method1615(-124);
        int var4 = arg0.method1589(86);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field3321[var5]; var6++) {
                this.field3320[var5][0][var6] = arg0.method1615(-20);
                this.field3316[var5][0][var6] = arg0.method1615(-127);
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field3321[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field3320[var7][1][var8] = this.field3320[var7][0][var8];
                    this.field3316[var7][1][var8] = this.field3316[var7][0][var8];
                } else {
                    this.field3320[var7][1][var8] = arg0.method1615(-11);
                    this.field3316[var7][1][var8] = arg0.method1615(22);
                }
            }
        }
        if (var4 != 0 || this.field3317[1] != this.field3317[0]) {
            arg1.method214(arg0);
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(IIF)F", line = 92)
    private final float method1270(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3320[arg0][1][arg1] - this.field3320[arg0][0][arg1]) * arg2 + (float) this.field3320[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1271(var5);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(F)F", line = 100)
    private static final float method1271(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IF)I", line = 113)
    public final int method1272(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field3317[1] - this.field3317[0]) * arg1 + (float) this.field3317[0];
            float var4 = var3 * 0.0030517578F;
            field3323 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field3322 = (int) (field3323 * 65536.0F);
        }
        if (this.field3321[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1268(arg0, 0, arg1);
        field3318[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1270(arg0, 0, arg1));
        field3318[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field3321[arg0]; var6++) {
            float var7 = this.method1268(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1270(arg0, var6, arg1));
            float var9 = var7 * var7;
            field3318[arg0][var6 * 2 + 1] = field3318[arg0][var6 * 2 - 1] * var9;
            field3318[arg0][var6 * 2] = field3318[arg0][var6 * 2 - 1] * var8 + field3318[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field3318[arg0][var10] += field3318[arg0][var10 - 1] * var8 + field3318[arg0][var10 - 2] * var9;
            }
            field3318[arg0][1] += field3318[arg0][0] * var8 + var9;
            field3318[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field3321[0] * 2; var11++) {
                field3318[0][var11] *= field3323;
            }
        }
        for (int var12 = 0; var12 < this.field3321[arg0] * 2; var12++) {
            field3319[arg0][var12] = (int) (field3318[arg0][var12] * 65536.0F);
        }
        return this.field3321[arg0] * 2;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "()V", line = 175)
    public static void method1273() {
        field3318 = (float[][]) null;
        field3319 = (int[][]) null;
    }
}
