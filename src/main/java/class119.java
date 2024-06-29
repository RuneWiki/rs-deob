import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class119 {

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "[I")
    public int[] field1921 = new int[2];

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "[I")
    private int[] field1925 = new int[2];

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "[[[I")
    private int[][][] field1926 = new int[2][2][4];

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "[[[I")
    private int[][][] field1927 = new int[2][2][4];

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "[[F")
    private static float[][] field1920 = new float[2][8];

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "[[I")
    public static int[][] field1923 = new int[2][8];

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "F")
    private static float field1922;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public static int field1924;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIF)F", line = 9)
    private final float method929(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1927[arg0][1][arg1] - this.field1927[arg0][0][arg1]) * arg2 + (float) this.field1927[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(IIF)F", line = 16)
    private final float method930(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1926[arg0][1][arg1] - this.field1926[arg0][0][arg1]) * arg2 + (float) this.field1926[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method931(var5);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(F)F", line = 24)
    private static final float method931(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Laj;Lqe;)V", line = 40)
    public final void method932(class1 arg0, class199 arg1) {
        int var3 = arg0.method15((byte) -115);
        this.field1921[0] = var3 >> 4;
        this.field1921[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field1925[0] = this.field1925[1] = 0;
            return;
        }
        this.field1925[0] = arg0.method56(19612);
        this.field1925[1] = arg0.method56(19612);
        int var4 = arg0.method15((byte) -99);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1921[var5]; var6++) {
                this.field1926[var5][0][var6] = arg0.method56(19612);
                this.field1927[var5][0][var6] = arg0.method56(19612);
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1921[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1926[var7][1][var8] = this.field1926[var7][0][var8];
                    this.field1927[var7][1][var8] = this.field1927[var7][0][var8];
                } else {
                    this.field1926[var7][1][var8] = arg0.method56(19612);
                    this.field1927[var7][1][var8] = arg0.method56(19612);
                }
            }
        }
        if (var4 != 0 || this.field1925[1] != this.field1925[0]) {
            arg1.method1404(arg0);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IF)I", line = 111)
    public final int method933(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1925[1] - this.field1925[0]) * arg1 + (float) this.field1925[0];
            float var4 = var3 * 0.0030517578F;
            field1922 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field1924 = (int) (field1922 * 65536.0F);
        }
        if (this.field1921[arg0] == 0) {
            return 0;
        }
        float var5 = this.method929(arg0, 0, arg1);
        field1920[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method930(arg0, 0, arg1));
        field1920[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1921[arg0]; var6++) {
            float var7 = this.method929(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method930(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1920[arg0][var6 * 2 + 1] = field1920[arg0][var6 * 2 - 1] * var9;
            field1920[arg0][var6 * 2] = field1920[arg0][var6 * 2 - 1] * var8 + field1920[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1920[arg0][var10] += field1920[arg0][var10 - 1] * var8 + field1920[arg0][var10 - 2] * var9;
            }
            field1920[arg0][1] += field1920[arg0][0] * var8 + var9;
            field1920[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1921[0] * 2; var11++) {
                field1920[0][var11] *= field1922;
            }
        }
        for (int var12 = 0; var12 < this.field1921[arg0] * 2; var12++) {
            field1923[arg0][var12] = (int) (field1920[arg0][var12] * 65536.0F);
        }
        return this.field1921[arg0] * 2;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "()V", line = 170)
    public static void method934() {
        field1920 = (float[][]) null;
        field1923 = (int[][]) null;
    }
}
