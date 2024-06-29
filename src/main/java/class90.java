import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eha")
public class class90 {

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "[I")
    public int[] field1576 = new int[2];

    @OriginalMember(owner = "client!eha", name = "f", descriptor = "[I")
    private int[] field1581 = new int[2];

    @OriginalMember(owner = "client!eha", name = "d", descriptor = "[[[I")
    private int[][][] field1579 = new int[2][2][4];

    @OriginalMember(owner = "client!eha", name = "b", descriptor = "[[[I")
    private int[][][] field1577 = new int[2][2][4];

    @OriginalMember(owner = "client!eha", name = "c", descriptor = "[[I")
    public static int[][] field1578 = new int[2][8];

    @OriginalMember(owner = "client!eha", name = "h", descriptor = "[[F")
    private static float[][] field1583 = new float[2][8];

    @OriginalMember(owner = "client!eha", name = "g", descriptor = "F")
    private static float field1582;

    @OriginalMember(owner = "client!eha", name = "e", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(Lcea;Lra;)V", line = 6)
    public final void method836(class215 arg0, class110 arg1) {
        int var3 = arg0.method1535(255);
        this.field1576[0] = var3 >> 4;
        this.field1576[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field1581[0] = this.field1581[1] = 0;
            return;
        }
        this.field1581[0] = arg0.method1478(842397944);
        this.field1581[1] = arg0.method1478(842397944);
        int var4 = arg0.method1535(255);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field1576[var5]; var8++) {
                this.field1579[var5][0][var8] = arg0.method1478(842397944);
                this.field1577[var5][0][var8] = arg0.method1478(842397944);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field1576[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field1579[var6][1][var7] = this.field1579[var6][0][var7];
                    this.field1577[var6][1][var7] = this.field1577[var6][0][var7];
                } else {
                    this.field1579[var6][1][var7] = arg0.method1478(842397944);
                    this.field1577[var6][1][var7] = arg0.method1478(842397944);
                }
            }
        }
        if (var4 != 0 || this.field1581[1] != this.field1581[0]) {
            arg1.method977(arg0);
        }
    }

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(IIF)F", line = 72)
    private final float method837(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1579[arg0][1][arg1] - this.field1579[arg0][0][arg1]) * arg2 + (float) this.field1579[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method838(var5);
    }

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(F)F", line = 80)
    private static final float method838(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!eha", name = "b", descriptor = "(IIF)F", line = 94)
    private final float method839(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1577[arg0][1][arg1] - this.field1577[arg0][0][arg1]) * arg2 + (float) this.field1577[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "()V", line = 104)
    public static void method840() {
        field1583 = null;
        field1578 = null;
    }

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(IF)I", line = 118)
    public final int method841(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1581[1] - this.field1581[0]) * arg1 + (float) this.field1581[0];
            float var4 = var3 * 0.0030517578F;
            field1582 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field1580 = (int) (field1582 * 65536.0F);
        }
        if (this.field1576[arg0] == 0) {
            return 0;
        }
        float var5 = this.method839(arg0, 0, arg1);
        field1583[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method837(arg0, 0, arg1));
        field1583[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1576[arg0]; var6++) {
            float var9 = this.method839(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method837(arg0, var6, arg1));
            float var11 = var9 * var9;
            field1583[arg0][var6 * 2 + 1] = field1583[arg0][var6 * 2 - 1] * var11;
            field1583[arg0][var6 * 2] = field1583[arg0][var6 * 2 - 1] * var10 + field1583[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field1583[arg0][var12] += field1583[arg0][var12 - 1] * var10 + field1583[arg0][var12 - 2] * var11;
            }
            field1583[arg0][1] += field1583[arg0][0] * var10 + var11;
            field1583[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field1576[0] * 2; var7++) {
                field1583[0][var7] *= field1582;
            }
        }
        for (int var8 = 0; var8 < this.field1576[arg0] * 2; var8++) {
            field1578[arg0][var8] = (int) (field1583[arg0][var8] * 65536.0F);
        }
        return this.field1576[arg0] * 2;
    }
}
