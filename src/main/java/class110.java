import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class110 {

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "[I")
    public int[] field1972 = new int[2];

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "[[[I")
    private int[][][] field1969 = new int[2][2][4];

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "[[[I")
    private int[][][] field1970 = new int[2][2][4];

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "[I")
    private int[] field1974 = new int[2];

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "[[I")
    public static int[][] field1973 = new int[2][8];

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "[[F")
    private static float[][] field1975 = new float[2][8];

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "F")
    private static float field1976;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IF)I")
    public final int method810(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1974[1] - this.field1974[0]) * arg1 + (float) this.field1974[0];
            float var4 = var3 * 0.0030517578F;
            field1976 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field1971 = (int) (field1976 * 65536.0F);
        }
        if (this.field1972[arg0] == 0) {
            return 0;
        }
        float var5 = this.method813(arg0, 0, arg1);
        field1975[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method811(arg0, 0, arg1));
        field1975[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1972[arg0]; var6++) {
            float var9 = this.method813(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method811(arg0, var6, arg1));
            float var11 = var9 * var9;
            field1975[arg0][var6 * 2 + 1] = field1975[arg0][var6 * 2 - 1] * var11;
            field1975[arg0][var6 * 2] = field1975[arg0][var6 * 2 - 1] * var10 + field1975[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field1975[arg0][var12] += field1975[arg0][var12 - 1] * var10 + field1975[arg0][var12 - 2] * var11;
            }
            field1975[arg0][1] += field1975[arg0][0] * var10 + var11;
            field1975[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field1972[0] * 2; var7++) {
                field1975[0][var7] *= field1976;
            }
        }
        for (int var8 = 0; var8 < this.field1972[arg0] * 2; var8++) {
            field1973[arg0][var8] = (int) (field1975[arg0][var8] * 65536.0F);
        }
        return this.field1972[arg0] * 2;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIF)F")
    private final float method811(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1969[arg0][1][arg1] - this.field1969[arg0][0][arg1]) * arg2 + (float) this.field1969[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method814(var5);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "()V")
    public static void method812() {
        field1975 = null;
        field1973 = null;
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(IIF)F")
    private final float method813(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1970[arg0][1][arg1] - this.field1970[arg0][0][arg1]) * arg2 + (float) this.field1970[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(F)F")
    private static final float method814(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lwd;Lw;)V")
    public final void method815(class217 arg0, class150 arg1) {
        int var3 = arg0.method1487(255);
        this.field1972[0] = var3 >> 4;
        this.field1972[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field1974[0] = this.field1974[1] = 0;
            return;
        }
        this.field1974[0] = arg0.method1441(94);
        this.field1974[1] = arg0.method1441(-55);
        int var4 = arg0.method1487(255);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field1972[var5]; var8++) {
                this.field1969[var5][0][var8] = arg0.method1441(-91);
                this.field1970[var5][0][var8] = arg0.method1441(73);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field1972[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field1969[var6][1][var7] = this.field1969[var6][0][var7];
                    this.field1970[var6][1][var7] = this.field1970[var6][0][var7];
                } else {
                    this.field1969[var6][1][var7] = arg0.method1441(120);
                    this.field1970[var6][1][var7] = arg0.method1441(-51);
                }
            }
        }
        if (var4 != 0 || this.field1974[1] != this.field1974[0]) {
            arg1.method1051(arg0);
        }
    }
}
