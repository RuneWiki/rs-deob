import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class85 {

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "[[[I")
    private int[][][] field1353 = new int[2][2][4];

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "[[[I")
    private int[][][] field1352 = new int[2][2][4];

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "[I")
    public int[] field1359 = new int[2];

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "[I")
    private int[] field1357 = new int[2];

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "[[F")
    private static float[][] field1354 = new float[2][8];

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "[[I")
    public static int[][] field1355 = new int[2][8];

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "F")
    private static float field1356;

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lrm;Lem;)V", line = 5)
    public final void method586(class249 arg0, class11 arg1) {
        int var3 = arg0.method1731(true);
        this.field1359[0] = var3 >> 4;
        this.field1359[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field1357[0] = this.field1357[1] = 0;
            return;
        }
        this.field1357[0] = arg0.method1712(-1);
        this.field1357[1] = arg0.method1712(-1);
        int var4 = arg0.method1731(true);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1359[var5]; var6++) {
                this.field1353[var5][0][var6] = arg0.method1712(-1);
                this.field1352[var5][0][var6] = arg0.method1712(-1);
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1359[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1353[var7][1][var8] = this.field1353[var7][0][var8];
                    this.field1352[var7][1][var8] = this.field1352[var7][0][var8];
                } else {
                    this.field1353[var7][1][var8] = arg0.method1712(-1);
                    this.field1352[var7][1][var8] = arg0.method1712(-1);
                }
            }
        }
        if (var4 != 0 || this.field1357[1] != this.field1357[0]) {
            arg1.method59(arg0);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIF)F", line = 73)
    private final float method587(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1352[arg0][1][arg1] - this.field1352[arg0][0][arg1]) * arg2 + (float) this.field1352[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "()V", line = 79)
    public static void method588() {
        field1354 = (float[][]) null;
        field1355 = (int[][]) null;
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(IIF)F", line = 86)
    private final float method589(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1353[arg0][1][arg1] - this.field1353[arg0][0][arg1]) * arg2 + (float) this.field1353[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method590(var5);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(F)F", line = 97)
    private static final float method590(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IF)I", line = 116)
    public final int method591(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1357[1] - this.field1357[0]) * arg1 + (float) this.field1357[0];
            float var4 = var3 * 0.0030517578F;
            field1356 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field1358 = (int) (field1356 * 65536.0F);
        }
        if (this.field1359[arg0] == 0) {
            return 0;
        }
        float var5 = this.method587(arg0, 0, arg1);
        field1354[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method589(arg0, 0, arg1));
        field1354[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1359[arg0]; var6++) {
            float var7 = this.method587(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method589(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1354[arg0][var6 * 2 + 1] = field1354[arg0][var6 * 2 - 1] * var9;
            field1354[arg0][var6 * 2] = field1354[arg0][var6 * 2 - 1] * var8 + field1354[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1354[arg0][var10] += field1354[arg0][var10 - 1] * var8 + field1354[arg0][var10 - 2] * var9;
            }
            field1354[arg0][1] += field1354[arg0][0] * var8 + var9;
            field1354[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1359[0] * 2; var11++) {
                field1354[0][var11] *= field1356;
            }
        }
        for (int var12 = 0; var12 < this.field1359[arg0] * 2; var12++) {
            field1355[arg0][var12] = (int) (field1354[arg0][var12] * 65536.0F);
        }
        return this.field1359[arg0] * 2;
    }
}
