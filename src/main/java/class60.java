import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class60 {

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "[[[I")
    private int[][][] field1078 = new int[2][2][4];

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "[I")
    private int[] field1079 = new int[2];

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "[I")
    public int[] field1076 = new int[2];

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "[[[I")
    private int[][][] field1082 = new int[2][2][4];

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "[[F")
    private static float[][] field1077 = new float[2][8];

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "[[I")
    public static int[][] field1081 = new int[2][8];

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "F")
    private static float field1083;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIF)F")
    private final float method395(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1078[arg0][1][arg1] - this.field1078[arg0][0][arg1]) * arg2 + (float) this.field1078[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IF)I")
    public final int method396(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1079[1] - this.field1079[0]) * arg1 + (float) this.field1079[0];
            float var4 = var3 * 0.0030517578F;
            field1083 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field1080 = (int) (field1083 * 65536.0F);
        }
        if (this.field1076[arg0] == 0) {
            return 0;
        }
        float var5 = this.method395(arg0, 0, arg1);
        field1077[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method398(arg0, 0, arg1));
        field1077[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1076[arg0]; var6++) {
            float var9 = this.method395(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method398(arg0, var6, arg1));
            float var11 = var9 * var9;
            field1077[arg0][var6 * 2 + 1] = field1077[arg0][var6 * 2 - 1] * var11;
            field1077[arg0][var6 * 2] = field1077[arg0][var6 * 2 - 1] * var10 + field1077[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field1077[arg0][var12] += field1077[arg0][var12 - 1] * var10 + field1077[arg0][var12 - 2] * var11;
            }
            field1077[arg0][1] += field1077[arg0][0] * var10 + var11;
            field1077[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field1076[0] * 2; var7++) {
                field1077[0][var7] *= field1083;
            }
        }
        for (int var8 = 0; var8 < this.field1076[arg0] * 2; var8++) {
            field1081[arg0][var8] = (int) (field1077[arg0][var8] * 65536.0F);
        }
        return this.field1076[arg0] * 2;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "()V")
    public static void method397() {
        field1077 = null;
        field1081 = null;
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(IIF)F")
    private final float method398(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1082[arg0][1][arg1] - this.field1082[arg0][0][arg1]) * arg2 + (float) this.field1082[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method399(var5);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(F)F")
    private static final float method399(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lik;Lai;)V")
    public final void method400(class247 arg0, class84 arg1) {
        int var3 = arg0.method1711((byte) -67);
        this.field1076[0] = var3 >> 4;
        this.field1076[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field1079[0] = this.field1079[1] = 0;
            return;
        }
        this.field1079[0] = arg0.method1694((byte) -100);
        this.field1079[1] = arg0.method1694((byte) -100);
        int var4 = arg0.method1711((byte) -67);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field1076[var5]; var8++) {
                this.field1082[var5][0][var8] = arg0.method1694((byte) -100);
                this.field1078[var5][0][var8] = arg0.method1694((byte) -100);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field1076[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field1082[var6][1][var7] = this.field1082[var6][0][var7];
                    this.field1078[var6][1][var7] = this.field1078[var6][0][var7];
                } else {
                    this.field1082[var6][1][var7] = arg0.method1694((byte) -100);
                    this.field1078[var6][1][var7] = arg0.method1694((byte) -100);
                }
            }
        }
        if (var4 != 0 || this.field1079[1] != this.field1079[0]) {
            arg1.method577(arg0);
        }
    }
}
