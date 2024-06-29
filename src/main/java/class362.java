import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class362 {

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "[[[I")
    private int[][][] field5193 = new int[2][2][4];

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "[[[I")
    private int[][][] field5198 = new int[2][2][4];

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "[I")
    public int[] field5197 = new int[2];

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "[I")
    private int[] field5195 = new int[2];

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "[[I")
    public static int[][] field5194 = new int[2][8];

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "[[F")
    private static float[][] field5199 = new float[2][8];

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "F")
    private static float field5200;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
    public static int field5196;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIF)F", line = 10)
    private final float method2161(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field5198[arg0][1][arg1] - this.field5198[arg0][0][arg1]) * arg2 + (float) this.field5198[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IF)I", line = 15)
    public final int method2162(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field5195[1] - this.field5195[0]) * arg1 + (float) this.field5195[0];
            float var4 = var3 * 0.0030517578F;
            field5200 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field5196 = (int) (field5200 * 65536.0F);
        }
        if (this.field5197[arg0] == 0) {
            return 0;
        }
        float var5 = this.method2161(arg0, 0, arg1);
        field5199[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method2165(arg0, 0, arg1));
        field5199[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field5197[arg0]; var6++) {
            float var9 = this.method2161(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method2165(arg0, var6, arg1));
            float var11 = var9 * var9;
            field5199[arg0][var6 * 2 + 1] = field5199[arg0][var6 * 2 - 1] * var11;
            field5199[arg0][var6 * 2] = field5199[arg0][var6 * 2 - 1] * var10 + field5199[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field5199[arg0][var12] += field5199[arg0][var12 - 1] * var10 + field5199[arg0][var12 - 2] * var11;
            }
            field5199[arg0][1] += field5199[arg0][0] * var10 + var11;
            field5199[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field5197[0] * 2; var7++) {
                field5199[0][var7] *= field5200;
            }
        }
        for (int var8 = 0; var8 < this.field5197[arg0] * 2; var8++) {
            field5194[arg0][var8] = (int) (field5199[arg0][var8] * 65536.0F);
        }
        return this.field5197[arg0] * 2;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(F)F", line = 75)
    private static final float method2163(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lsv;Lpv;)V", line = 95)
    public final void method2164(class319 arg0, class46 arg1) {
        int var3 = arg0.method1869(-122);
        this.field5197[0] = var3 >> 4;
        this.field5197[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field5195[0] = this.field5195[1] = 0;
            return;
        }
        this.field5195[0] = arg0.method1844(-104);
        this.field5195[1] = arg0.method1844(-119);
        int var4 = arg0.method1869(-66);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field5197[var5]; var8++) {
                this.field5193[var5][0][var8] = arg0.method1844(-116);
                this.field5198[var5][0][var8] = arg0.method1844(-115);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field5197[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field5193[var6][1][var7] = this.field5193[var6][0][var7];
                    this.field5198[var6][1][var7] = this.field5198[var6][0][var7];
                } else {
                    this.field5193[var6][1][var7] = arg0.method1844(-101);
                    this.field5198[var6][1][var7] = arg0.method1844(-105);
                }
            }
        }
        if (var4 != 0 || this.field5195[1] != this.field5195[0]) {
            arg1.method306(arg0);
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(IIF)F", line = 172)
    private final float method2165(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field5193[arg0][1][arg1] - this.field5193[arg0][0][arg1]) * arg2 + (float) this.field5193[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method2163(var5);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "()V", line = 180)
    public static void method2166() {
        field5199 = null;
        field5194 = null;
    }
}
