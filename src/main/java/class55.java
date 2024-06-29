import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class55 {

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "[I")
    public int[] field1286 = new int[2];

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "[[[I")
    private int[][][] field1287 = new int[2][2][4];

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "[I")
    private int[] field1291 = new int[2];

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "[[[I")
    private int[][][] field1292 = new int[2][2][4];

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "[[F")
    private static float[][] field1288 = new float[2][8];

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "[[I")
    public static int[][] field1285 = new int[2][8];

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "F")
    private static float field1290;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
    public static int field1289;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljd;Lk;)V")
    public final void method431(class66 arg0, class69 arg1) {
        int var3 = arg0.method533(255);
        this.field1286[0] = var3 >> 4;
        this.field1286[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field1291[0] = this.field1291[1] = 0;
            return;
        }
        this.field1291[0] = arg0.method532(0);
        this.field1291[1] = arg0.method532(0);
        int var4 = arg0.method533(255);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field1286[var5]; var8++) {
                this.field1292[var5][0][var8] = arg0.method532(0);
                this.field1287[var5][0][var8] = arg0.method532(0);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field1286[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field1292[var6][1][var7] = this.field1292[var6][0][var7];
                    this.field1287[var6][1][var7] = this.field1287[var6][0][var7];
                } else {
                    this.field1292[var6][1][var7] = arg0.method532(0);
                    this.field1287[var6][1][var7] = arg0.method532(0);
                }
            }
        }
        if (var4 != 0 || this.field1291[1] != this.field1291[0]) {
            arg1.method576(arg0);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(F)F")
    private static final float method432(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IF)I")
    public final int method433(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1291[1] - this.field1291[0]) * arg1 + (float) this.field1291[0];
            float var4 = var3 * 0.0030517578F;
            field1290 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field1289 = (int) (field1290 * 65536.0F);
        }
        if (this.field1286[arg0] == 0) {
            return 0;
        }
        float var5 = this.method436(arg0, 0, arg1);
        field1288[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method435(arg0, 0, arg1));
        field1288[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1286[arg0]; var6++) {
            float var9 = this.method436(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method435(arg0, var6, arg1));
            float var11 = var9 * var9;
            field1288[arg0][var6 * 2 + 1] = field1288[arg0][var6 * 2 - 1] * var11;
            field1288[arg0][var6 * 2] = field1288[arg0][var6 * 2 - 1] * var10 + field1288[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field1288[arg0][var12] += field1288[arg0][var12 - 1] * var10 + field1288[arg0][var12 - 2] * var11;
            }
            field1288[arg0][1] += field1288[arg0][0] * var10 + var11;
            field1288[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field1286[0] * 2; var7++) {
                field1288[0][var7] *= field1290;
            }
        }
        for (int var8 = 0; var8 < this.field1286[arg0] * 2; var8++) {
            field1285[arg0][var8] = (int) (field1288[arg0][var8] * 65536.0F);
        }
        return this.field1286[arg0] * 2;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "()V")
    public static void method434() {
        field1288 = null;
        field1285 = null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIF)F")
    private final float method435(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1292[arg0][1][arg1] - this.field1292[arg0][0][arg1]) * arg2 + (float) this.field1292[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method432(var5);
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(IIF)F")
    private final float method436(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1287[arg0][1][arg1] - this.field1287[arg0][0][arg1]) * arg2 + (float) this.field1287[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }
}
