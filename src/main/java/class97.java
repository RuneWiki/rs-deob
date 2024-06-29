import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class97 {

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "[I")
    public int[] field1816 = new int[2];

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "[I")
    private int[] field1814 = new int[2];

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "[[[I")
    private int[][][] field1817 = new int[2][2][4];

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "[[[I")
    private int[][][] field1819 = new int[2][2][4];

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "[[F")
    private static float[][] field1815 = new float[2][8];

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "[[I")
    public static int[][] field1818 = new int[2][8];

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "F")
    private static float field1820;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIF)F")
    private final float method701(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1819[arg0][1][arg1] - this.field1819[arg0][0][arg1]) * arg2 + (float) this.field1819[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(IIF)F")
    private final float method702(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1817[arg0][1][arg1] - this.field1817[arg0][0][arg1]) * arg2 + (float) this.field1817[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method706(var5);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IF)I")
    public final int method703(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1814[1] - this.field1814[0]) * arg1 + (float) this.field1814[0];
            float var4 = var3 * 0.0030517578F;
            field1820 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field1821 = (int) (field1820 * 65536.0F);
        }
        if (this.field1816[arg0] == 0) {
            return 0;
        }
        float var5 = this.method701(arg0, 0, arg1);
        field1815[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method702(arg0, 0, arg1));
        field1815[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1816[arg0]; var6++) {
            float var9 = this.method701(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method702(arg0, var6, arg1));
            float var11 = var9 * var9;
            field1815[arg0][var6 * 2 + 1] = field1815[arg0][var6 * 2 - 1] * var11;
            field1815[arg0][var6 * 2] = field1815[arg0][var6 * 2 - 1] * var10 + field1815[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field1815[arg0][var12] += field1815[arg0][var12 - 1] * var10 + field1815[arg0][var12 - 2] * var11;
            }
            field1815[arg0][1] += field1815[arg0][0] * var10 + var11;
            field1815[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field1816[0] * 2; var7++) {
                field1815[0][var7] *= field1820;
            }
        }
        for (int var8 = 0; var8 < this.field1816[arg0] * 2; var8++) {
            field1818[arg0][var8] = (int) (field1815[arg0][var8] * 65536.0F);
        }
        return this.field1816[arg0] * 2;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "()V")
    public static void method704() {
        field1815 = null;
        field1818 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lk;Ljd;)V")
    public final void method705(class152 arg0, class234 arg1) {
        int var3 = arg0.method1051((byte) 102);
        this.field1816[0] = var3 >> 4;
        this.field1816[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field1814[0] = this.field1814[1] = 0;
            return;
        }
        this.field1814[0] = arg0.method1063(-17162);
        this.field1814[1] = arg0.method1063(-17162);
        int var4 = arg0.method1051((byte) 101);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field1816[var5]; var8++) {
                this.field1817[var5][0][var8] = arg0.method1063(-17162);
                this.field1819[var5][0][var8] = arg0.method1063(-17162);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field1816[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field1817[var6][1][var7] = this.field1817[var6][0][var7];
                    this.field1819[var6][1][var7] = this.field1819[var6][0][var7];
                } else {
                    this.field1817[var6][1][var7] = arg0.method1063(-17162);
                    this.field1819[var6][1][var7] = arg0.method1063(-17162);
                }
            }
        }
        if (var4 != 0 || this.field1814[1] != this.field1814[0]) {
            arg1.method1544(arg0);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(F)F")
    private static final float method706(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }
}
