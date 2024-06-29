import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class211 {

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "[I")
    private int[] field3111 = new int[2];

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "[[[I")
    private int[][][] field3114 = new int[2][2][4];

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "[[[I")
    private int[][][] field3113 = new int[2][2][4];

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "[I")
    public int[] field3110 = new int[2];

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "[[I")
    public static int[][] field3109 = new int[2][8];

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "[[F")
    private static float[][] field3115 = new float[2][8];

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "F")
    private static float field3112;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "()V", line = 6)
    public static void method1387() {
        field3115 = null;
        field3109 = null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(F)F", line = 19)
    private static final float method1388(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IF)I", line = 23)
    public final int method1389(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field3111[1] - this.field3111[0]) * arg1 + (float) this.field3111[0];
            float var4 = var3 * 0.0030517578F;
            field3112 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field3116 = (int) (field3112 * 65536.0F);
        }
        if (this.field3110[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1390(arg0, 0, arg1);
        field3115[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1392(arg0, 0, arg1));
        field3115[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field3110[arg0]; var6++) {
            float var9 = this.method1390(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method1392(arg0, var6, arg1));
            float var11 = var9 * var9;
            field3115[arg0][var6 * 2 + 1] = field3115[arg0][var6 * 2 - 1] * var11;
            field3115[arg0][var6 * 2] = field3115[arg0][var6 * 2 - 1] * var10 + field3115[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field3115[arg0][var12] += field3115[arg0][var12 - 1] * var10 + field3115[arg0][var12 - 2] * var11;
            }
            field3115[arg0][1] += field3115[arg0][0] * var10 + var11;
            field3115[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field3110[0] * 2; var7++) {
                field3115[0][var7] *= field3112;
            }
        }
        for (int var8 = 0; var8 < this.field3110[arg0] * 2; var8++) {
            field3109[arg0][var8] = (int) (field3115[arg0][var8] * 65536.0F);
        }
        return this.field3110[arg0] * 2;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIF)F", line = 98)
    private final float method1390(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3114[arg0][1][arg1] - this.field3114[arg0][0][arg1]) * arg2 + (float) this.field3114[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lgw;Lsu;)V", line = 111)
    public final void method1391(class148 arg0, class179 arg1) {
        int var3 = arg0.method1032((byte) -33);
        this.field3110[0] = var3 >> 4;
        this.field3110[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field3111[0] = this.field3111[1] = 0;
            return;
        }
        this.field3111[0] = arg0.method1045(true);
        this.field3111[1] = arg0.method1045(true);
        int var4 = arg0.method1032((byte) -33);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field3110[var5]; var8++) {
                this.field3113[var5][0][var8] = arg0.method1045(true);
                this.field3114[var5][0][var8] = arg0.method1045(true);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field3110[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field3113[var6][1][var7] = this.field3113[var6][0][var7];
                    this.field3114[var6][1][var7] = this.field3114[var6][0][var7];
                } else {
                    this.field3113[var6][1][var7] = arg0.method1045(true);
                    this.field3114[var6][1][var7] = arg0.method1045(true);
                }
            }
        }
        if (var4 != 0 || this.field3111[1] != this.field3111[0]) {
            arg1.method1260(arg0);
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(IIF)F", line = 179)
    private final float method1392(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3113[arg0][1][arg1] - this.field3113[arg0][0][arg1]) * arg2 + (float) this.field3113[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1388(var5);
    }
}
