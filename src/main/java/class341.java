import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class341 {

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "[[[I")
    private int[][][] field5417 = new int[2][2][4];

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "[I")
    public int[] field5418 = new int[2];

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "[[[I")
    private int[][][] field5419 = new int[2][2][4];

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "[I")
    private int[] field5420 = new int[2];

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "[[I")
    public static int[][] field5414 = new int[2][8];

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "[[F")
    private static float[][] field5421 = new float[2][8];

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "F")
    private static float field5416;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
    public static int field5415;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIF)F", line = 13)
    private final float method2340(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field5417[arg0][1][arg1] - this.field5417[arg0][0][arg1]) * arg2 + (float) this.field5417[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method2342(var5);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IF)I", line = 20)
    public final int method2341(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field5420[1] - this.field5420[0]) * arg1 + (float) this.field5420[0];
            float var4 = var3 * 0.0030517578F;
            field5416 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field5415 = (int) (field5416 * 65536.0F);
        }
        if (this.field5418[arg0] == 0) {
            return 0;
        }
        float var5 = this.method2345(arg0, 0, arg1);
        field5421[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method2340(arg0, 0, arg1));
        field5421[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field5418[arg0]; var6++) {
            float var7 = this.method2345(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method2340(arg0, var6, arg1));
            float var9 = var7 * var7;
            field5421[arg0][var6 * 2 + 1] = field5421[arg0][var6 * 2 - 1] * var9;
            field5421[arg0][var6 * 2] = field5421[arg0][var6 * 2 - 1] * var8 + field5421[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field5421[arg0][var10] += field5421[arg0][var10 - 1] * var8 + field5421[arg0][var10 - 2] * var9;
            }
            field5421[arg0][1] += field5421[arg0][0] * var8 + var9;
            field5421[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field5418[0] * 2; var11++) {
                field5421[0][var11] *= field5416;
            }
        }
        for (int var12 = 0; var12 < this.field5418[arg0] * 2; var12++) {
            field5414[arg0][var12] = (int) (field5421[arg0][var12] * 65536.0F);
        }
        return this.field5418[arg0] * 2;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(F)F", line = 89)
    private static final float method2342(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Llf;Lsh;)V", line = 94)
    public final void method2343(class143 arg0, class319 arg1) {
        int var3 = arg0.method1043(true);
        this.field5418[0] = var3 >> 4;
        this.field5418[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field5420[0] = this.field5420[1] = 0;
            return;
        }
        this.field5420[0] = arg0.method1051(1);
        this.field5420[1] = arg0.method1051(1);
        int var4 = arg0.method1043(true);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field5418[var5]; var6++) {
                this.field5417[var5][0][var6] = arg0.method1051(1);
                this.field5419[var5][0][var6] = arg0.method1051(1);
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field5418[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field5417[var7][1][var8] = this.field5417[var7][0][var8];
                    this.field5419[var7][1][var8] = this.field5419[var7][0][var8];
                } else {
                    this.field5417[var7][1][var8] = arg0.method1051(1);
                    this.field5419[var7][1][var8] = arg0.method1051(1);
                }
            }
        }
        if (var4 != 0 || this.field5420[1] != this.field5420[0]) {
            arg1.method2234(arg0);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "()V", line = 160)
    public static void method2344() {
        field5421 = (float[][]) null;
        field5414 = (int[][]) null;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(IIF)F", line = 171)
    private final float method2345(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field5419[arg0][1][arg1] - this.field5419[arg0][0][arg1]) * arg2 + (float) this.field5419[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }
}
