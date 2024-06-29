import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class70 {

    @OriginalMember(owner = "client!he", name = "c", descriptor = "[I")
    public int[] field1387 = new int[2];

    @OriginalMember(owner = "client!he", name = "a", descriptor = "[[[I")
    private int[][][] field1385 = new int[2][2][4];

    @OriginalMember(owner = "client!he", name = "e", descriptor = "[I")
    private int[] field1389 = new int[2];

    @OriginalMember(owner = "client!he", name = "h", descriptor = "[[[I")
    private int[][][] field1392 = new int[2][2][4];

    @OriginalMember(owner = "client!he", name = "b", descriptor = "[[F")
    private static float[][] field1386 = new float[2][8];

    @OriginalMember(owner = "client!he", name = "g", descriptor = "[[I")
    public static int[][] field1391 = new int[2][8];

    @OriginalMember(owner = "client!he", name = "f", descriptor = "F")
    private static float field1390;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "I")
    public static int field1388;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Ljg;Lcd;)V")
    public final void method429(class89 arg0, class25 arg1) {
        int var3 = arg0.method538((byte) 81);
        this.field1387[0] = var3 >> 4;
        this.field1387[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field1389[0] = this.field1389[1] = 0;
            return;
        }
        this.field1389[0] = arg0.method555(-1113627096);
        this.field1389[1] = arg0.method555(-1113627096);
        int var4 = arg0.method538((byte) 121);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field1387[var5]; var8++) {
                this.field1392[var5][0][var8] = arg0.method555(-1113627096);
                this.field1385[var5][0][var8] = arg0.method555(-1113627096);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field1387[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field1392[var6][1][var7] = this.field1392[var6][0][var7];
                    this.field1385[var6][1][var7] = this.field1385[var6][0][var7];
                } else {
                    this.field1392[var6][1][var7] = arg0.method555(-1113627096);
                    this.field1385[var6][1][var7] = arg0.method555(-1113627096);
                }
            }
        }
        if (var4 != 0 || this.field1389[1] != this.field1389[0]) {
            arg1.method126(arg0);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIF)F")
    private final float method430(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1392[arg0][1][arg1] - this.field1392[arg0][0][arg1]) * arg2 + (float) this.field1392[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method433(var5);
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(IIF)F")
    private final float method431(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1385[arg0][1][arg1] - this.field1385[arg0][0][arg1]) * arg2 + (float) this.field1385[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "()V")
    public static void method432() {
        field1386 = null;
        field1391 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(F)F")
    private static final float method433(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IF)I")
    public final int method434(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1389[1] - this.field1389[0]) * arg1 + (float) this.field1389[0];
            float var4 = var3 * 0.0030517578F;
            field1390 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field1388 = (int) (field1390 * 65536.0F);
        }
        if (this.field1387[arg0] == 0) {
            return 0;
        }
        float var5 = this.method431(arg0, 0, arg1);
        field1386[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method430(arg0, 0, arg1));
        field1386[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1387[arg0]; var6++) {
            float var9 = this.method431(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method430(arg0, var6, arg1));
            float var11 = var9 * var9;
            field1386[arg0][var6 * 2 + 1] = field1386[arg0][var6 * 2 - 1] * var11;
            field1386[arg0][var6 * 2] = field1386[arg0][var6 * 2 - 1] * var10 + field1386[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field1386[arg0][var12] += field1386[arg0][var12 - 1] * var10 + field1386[arg0][var12 - 2] * var11;
            }
            field1386[arg0][1] += field1386[arg0][0] * var10 + var11;
            field1386[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field1387[0] * 2; var7++) {
                field1386[0][var7] *= field1390;
            }
        }
        for (int var8 = 0; var8 < this.field1387[arg0] * 2; var8++) {
            field1391[arg0][var8] = (int) (field1386[arg0][var8] * 65536.0F);
        }
        return this.field1387[arg0] * 2;
    }
}
