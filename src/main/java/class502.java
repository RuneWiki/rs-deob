import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class502 {

    @OriginalMember(owner = "client!fr", name = "e", descriptor = "[I")
    public int[] field7290 = new int[2];

    @OriginalMember(owner = "client!fr", name = "f", descriptor = "[[[I")
    private int[][][] field7291 = new int[2][2][4];

    @OriginalMember(owner = "client!fr", name = "g", descriptor = "[[[I")
    private int[][][] field7292 = new int[2][2][4];

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "[I")
    private int[] field7286 = new int[2];

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "[[I")
    public static int[][] field7288 = new int[2][8];

    @OriginalMember(owner = "client!fr", name = "d", descriptor = "[[F")
    private static float[][] field7289 = new float[2][8];

    @OriginalMember(owner = "client!fr", name = "h", descriptor = "F")
    private static float field7293;

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "I")
    public static int field7287;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(IF)I")
    public final int method2990(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field7286[1] - this.field7286[0]) * arg1 + (float) this.field7286[0];
            float var4 = var3 * 0.0030517578F;
            field7293 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field7287 = (int) (field7293 * 65536.0F);
        }
        if (this.field7290[arg0] == 0) {
            return 0;
        }
        float var5 = this.method2994(arg0, 0, arg1);
        field7289[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method2991(arg0, 0, arg1));
        field7289[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field7290[arg0]; var6++) {
            float var9 = this.method2994(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method2991(arg0, var6, arg1));
            float var11 = var9 * var9;
            field7289[arg0][var6 * 2 + 1] = field7289[arg0][var6 * 2 - 1] * var11;
            field7289[arg0][var6 * 2] = field7289[arg0][var6 * 2 - 1] * var10 + field7289[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field7289[arg0][var12] += field7289[arg0][var12 - 1] * var10 + field7289[arg0][var12 - 2] * var11;
            }
            field7289[arg0][1] += field7289[arg0][0] * var10 + var11;
            field7289[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field7290[0] * 2; var7++) {
                field7289[0][var7] *= field7293;
            }
        }
        for (int var8 = 0; var8 < this.field7290[arg0] * 2; var8++) {
            field7288[arg0][var8] = (int) (field7289[arg0][var8] * 65536.0F);
        }
        return this.field7290[arg0] * 2;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(IIF)F")
    private final float method2991(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field7291[arg0][1][arg1] - this.field7291[arg0][0][arg1]) * arg2 + (float) this.field7291[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method2992(var5);
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(F)F")
    private static final float method2992(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "()V")
    public static void method2993() {
        field7289 = null;
        field7288 = null;
    }

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(IIF)F")
    private final float method2994(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field7292[arg0][1][arg1] - this.field7292[arg0][0][arg1]) * arg2 + (float) this.field7292[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lfh;Lkv;)V")
    public final void method2995(class194 arg0, class160 arg1) {
        int var3 = arg0.method1337((byte) -122);
        this.field7290[0] = var3 >> 4;
        this.field7290[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field7286[0] = this.field7286[1] = 0;
            return;
        }
        this.field7286[0] = arg0.method1396(58);
        this.field7286[1] = arg0.method1396(-85);
        int var4 = arg0.method1337((byte) 83);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field7290[var5]; var8++) {
                this.field7291[var5][0][var8] = arg0.method1396(-97);
                this.field7292[var5][0][var8] = arg0.method1396(31);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field7290[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field7291[var6][1][var7] = this.field7291[var6][0][var7];
                    this.field7292[var6][1][var7] = this.field7292[var6][0][var7];
                } else {
                    this.field7291[var6][1][var7] = arg0.method1396(49);
                    this.field7292[var6][1][var7] = arg0.method1396(18);
                }
            }
        }
        if (var4 != 0 || this.field7286[1] != this.field7286[0]) {
            arg1.method1151(arg0);
        }
    }
}
