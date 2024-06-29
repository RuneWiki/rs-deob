import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class59 {

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "[I")
    public int[] field1449 = new int[2];

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "[I")
    private int[] field1448 = new int[2];

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "[[[I")
    private int[][][] field1451 = new int[2][2][4];

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "[[[I")
    private int[][][] field1452 = new int[2][2][4];

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "[[F")
    private static float[][] field1450 = new float[2][8];

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "[[I")
    public static int[][] field1453 = new int[2][8];

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "F")
    private static float field1447;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(F)F", line = 4)
    private static final float method588(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Ldc;Lne;)V", line = 10)
    public final void method589(class25 arg0, class95 arg1) {
        int var3 = arg0.method322((byte) -50);
        this.field1449[0] = var3 >> 4;
        this.field1449[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field1448[0] = this.field1448[1] = 0;
            return;
        }
        this.field1448[0] = arg0.method301(-4853);
        this.field1448[1] = arg0.method301(-4853);
        int var4 = arg0.method322((byte) -50);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field1449[var5]; var8++) {
                this.field1451[var5][0][var8] = arg0.method301(-4853);
                this.field1452[var5][0][var8] = arg0.method301(-4853);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field1449[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field1451[var6][1][var7] = this.field1451[var6][0][var7];
                    this.field1452[var6][1][var7] = this.field1452[var6][0][var7];
                } else {
                    this.field1451[var6][1][var7] = arg0.method301(-4853);
                    this.field1452[var6][1][var7] = arg0.method301(-4853);
                }
            }
        }
        if (var4 != 0 || this.field1448[1] != this.field1448[0]) {
            arg1.method802(arg0);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIF)F", line = 79)
    private final float method590(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1452[arg0][1][arg1] - this.field1452[arg0][0][arg1]) * arg2 + (float) this.field1452[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IF)I", line = 86)
    public final int method591(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1448[1] - this.field1448[0]) * arg1 + (float) this.field1448[0];
            float var4 = var3 * 0.0030517578F;
            field1447 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field1454 = (int) (field1447 * 65536.0F);
        }
        if (this.field1449[arg0] == 0) {
            return 0;
        }
        float var5 = this.method590(arg0, 0, arg1);
        field1450[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method593(arg0, 0, arg1));
        field1450[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1449[arg0]; var6++) {
            float var9 = this.method590(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method593(arg0, var6, arg1));
            float var11 = var9 * var9;
            field1450[arg0][var6 * 2 + 1] = field1450[arg0][var6 * 2 - 1] * var11;
            field1450[arg0][var6 * 2] = field1450[arg0][var6 * 2 - 1] * var10 + field1450[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field1450[arg0][var12] += field1450[arg0][var12 - 1] * var10 + field1450[arg0][var12 - 2] * var11;
            }
            field1450[arg0][1] += field1450[arg0][0] * var10 + var11;
            field1450[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field1449[0] * 2; var7++) {
                field1450[0][var7] *= field1447;
            }
        }
        for (int var8 = 0; var8 < this.field1449[arg0] * 2; var8++) {
            field1453[arg0][var8] = (int) (field1450[arg0][var8] * 65536.0F);
        }
        return this.field1449[arg0] * 2;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "()V", line = 160)
    public static void method592() {
        field1450 = null;
        field1453 = null;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(IIF)F", line = 176)
    private final float method593(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1451[arg0][1][arg1] - this.field1451[arg0][0][arg1]) * arg2 + (float) this.field1451[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method588(var5);
    }
}
