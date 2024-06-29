import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class100 {

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "[I")
    private int[] field1741 = new int[2];

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "[[[I")
    private int[][][] field1740 = new int[2][2][4];

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "[I")
    public int[] field1744 = new int[2];

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "[[[I")
    private int[][][] field1746 = new int[2][2][4];

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "[[I")
    public static int[][] field1742 = new int[2][8];

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "[[F")
    private static float[][] field1745 = new float[2][8];

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "F")
    private static float field1747;

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(F)F")
    private static final float method720(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IF)I")
    public final int method721(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1741[1] - this.field1741[0]) * arg1 + (float) this.field1741[0];
            float var4 = var3 * 0.0030517578F;
            field1747 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field1743 = (int) (field1747 * 65536.0F);
        }
        if (this.field1744[arg0] == 0) {
            return 0;
        }
        float var5 = this.method724(arg0, 0, arg1);
        field1745[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method725(arg0, 0, arg1));
        field1745[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1744[arg0]; var6++) {
            float var9 = this.method724(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method725(arg0, var6, arg1));
            float var11 = var9 * var9;
            field1745[arg0][var6 * 2 + 1] = field1745[arg0][var6 * 2 - 1] * var11;
            field1745[arg0][var6 * 2] = field1745[arg0][var6 * 2 - 1] * var10 + field1745[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field1745[arg0][var12] += field1745[arg0][var12 - 1] * var10 + field1745[arg0][var12 - 2] * var11;
            }
            field1745[arg0][1] += field1745[arg0][0] * var10 + var11;
            field1745[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field1744[0] * 2; var7++) {
                field1745[0][var7] *= field1747;
            }
        }
        for (int var8 = 0; var8 < this.field1744[arg0] * 2; var8++) {
            field1742[arg0][var8] = (int) (field1745[arg0][var8] * 65536.0F);
        }
        return this.field1744[arg0] * 2;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lee;Lag;)V")
    public final void method722(class280 arg0, class184 arg1) {
        int var3 = arg0.method1907(16832);
        this.field1744[0] = var3 >> 4;
        this.field1744[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field1741[0] = this.field1741[1] = 0;
            return;
        }
        this.field1741[0] = arg0.method1891(-118);
        this.field1741[1] = arg0.method1891(-123);
        int var4 = arg0.method1907(16832);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field1744[var5]; var8++) {
                this.field1740[var5][0][var8] = arg0.method1891(-122);
                this.field1746[var5][0][var8] = arg0.method1891(-122);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field1744[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field1740[var6][1][var7] = this.field1740[var6][0][var7];
                    this.field1746[var6][1][var7] = this.field1746[var6][0][var7];
                } else {
                    this.field1740[var6][1][var7] = arg0.method1891(-122);
                    this.field1746[var6][1][var7] = arg0.method1891(-127);
                }
            }
        }
        if (var4 != 0 || this.field1741[1] != this.field1741[0]) {
            arg1.method1345(arg0);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "()V")
    public static void method723() {
        field1745 = null;
        field1742 = null;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIF)F")
    private final float method724(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1746[arg0][1][arg1] - this.field1746[arg0][0][arg1]) * arg2 + (float) this.field1746[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(IIF)F")
    private final float method725(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1740[arg0][1][arg1] - this.field1740[arg0][0][arg1]) * arg2 + (float) this.field1740[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method720(var5);
    }
}
