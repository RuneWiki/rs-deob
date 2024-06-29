import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class127 {

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "[I")
    private int[] field1958 = new int[2];

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "[I")
    public int[] field1959 = new int[2];

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "[[[I")
    private int[][][] field1962 = new int[2][2][4];

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "[[[I")
    private int[][][] field1964 = new int[2][2][4];

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "[[I")
    public static int[][] field1963 = new int[2][8];

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "[[F")
    private static float[][] field1965 = new float[2][8];

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "F")
    private static float field1960;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lfh;Lve;)V", line = 4)
    public final void method828(class313 arg0, class231 arg1) {
        int var3 = arg0.method2224(-119);
        this.field1959[0] = var3 >> 4;
        this.field1959[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field1958[0] = this.field1958[1] = 0;
            return;
        }
        this.field1958[0] = arg0.method2250(-1613178296);
        this.field1958[1] = arg0.method2250(-1613178296);
        int var4 = arg0.method2224(-124);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1959[var5]; var6++) {
                this.field1964[var5][0][var6] = arg0.method2250(-1613178296);
                this.field1962[var5][0][var6] = arg0.method2250(-1613178296);
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1959[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1964[var7][1][var8] = this.field1964[var7][0][var8];
                    this.field1962[var7][1][var8] = this.field1962[var7][0][var8];
                } else {
                    this.field1964[var7][1][var8] = arg0.method2250(-1613178296);
                    this.field1962[var7][1][var8] = arg0.method2250(-1613178296);
                }
            }
        }
        if (var4 != 0 || this.field1958[1] != this.field1958[0]) {
            arg1.method1596(arg0);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IF)I", line = 70)
    public final int method829(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1958[1] - this.field1958[0]) * arg1 + (float) this.field1958[0];
            float var4 = var3 * 0.0030517578F;
            field1960 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field1961 = (int) (field1960 * 65536.0F);
        }
        if (this.field1959[arg0] == 0) {
            return 0;
        }
        float var5 = this.method831(arg0, 0, arg1);
        field1965[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method832(arg0, 0, arg1));
        field1965[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1959[arg0]; var6++) {
            float var7 = this.method831(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method832(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1965[arg0][var6 * 2 + 1] = field1965[arg0][var6 * 2 - 1] * var9;
            field1965[arg0][var6 * 2] = field1965[arg0][var6 * 2 - 1] * var8 + field1965[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1965[arg0][var10] += field1965[arg0][var10 - 1] * var8 + field1965[arg0][var10 - 2] * var9;
            }
            field1965[arg0][1] += field1965[arg0][0] * var8 + var9;
            field1965[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1959[0] * 2; var11++) {
                field1965[0][var11] *= field1960;
            }
        }
        for (int var12 = 0; var12 < this.field1959[arg0] * 2; var12++) {
            field1963[arg0][var12] = (int) (field1965[arg0][var12] * 65536.0F);
        }
        return this.field1959[arg0] * 2;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "()V", line = 136)
    public static void method830() {
        field1965 = (float[][]) null;
        field1963 = (int[][]) null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIF)F", line = 147)
    private final float method831(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1962[arg0][1][arg1] - this.field1962[arg0][0][arg1]) * arg2 + (float) this.field1962[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(IIF)F", line = 153)
    private final float method832(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1964[arg0][1][arg1] - this.field1964[arg0][0][arg1]) * arg2 + (float) this.field1964[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method833(var5);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(F)F", line = 160)
    private static final float method833(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }
}
