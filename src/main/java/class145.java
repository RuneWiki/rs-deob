import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public class class145 {

    @OriginalMember(owner = "client!ku", name = "f", descriptor = "[I")
    public int[] field1948 = new int[2];

    @OriginalMember(owner = "client!ku", name = "g", descriptor = "[[[I")
    private int[][][] field1949 = new int[2][2][4];

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "[[[I")
    private int[][][] field1944 = new int[2][2][4];

    @OriginalMember(owner = "client!ku", name = "h", descriptor = "[I")
    private int[] field1950 = new int[2];

    @OriginalMember(owner = "client!ku", name = "c", descriptor = "[[I")
    public static int[][] field1945 = new int[2][8];

    @OriginalMember(owner = "client!ku", name = "e", descriptor = "[[F")
    private static float[][] field1947 = new float[2][8];

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "F")
    private static float field1943;

    @OriginalMember(owner = "client!ku", name = "d", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(IF)I")
    public final int method870(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1950[1] - this.field1950[0]) * arg1 + (float) this.field1950[0];
            float var4 = var3 * 0.0030517578F;
            field1943 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field1946 = (int) (field1943 * 65536.0F);
        }
        if (this.field1948[arg0] == 0) {
            return 0;
        }
        float var5 = this.method871(arg0, 0, arg1);
        field1947[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method875(arg0, 0, arg1));
        field1947[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1948[arg0]; var6++) {
            float var9 = this.method871(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method875(arg0, var6, arg1));
            float var11 = var9 * var9;
            field1947[arg0][var6 * 2 + 1] = field1947[arg0][var6 * 2 - 1] * var11;
            field1947[arg0][var6 * 2] = field1947[arg0][var6 * 2 - 1] * var10 + field1947[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field1947[arg0][var12] += field1947[arg0][var12 - 1] * var10 + field1947[arg0][var12 - 2] * var11;
            }
            field1947[arg0][1] += field1947[arg0][0] * var10 + var11;
            field1947[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field1948[0] * 2; var7++) {
                field1947[0][var7] *= field1943;
            }
        }
        for (int var8 = 0; var8 < this.field1948[arg0] * 2; var8++) {
            field1945[arg0][var8] = (int) (field1947[arg0][var8] * 65536.0F);
        }
        return this.field1948[arg0] * 2;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(IIF)F")
    private final float method871(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1944[arg0][1][arg1] - this.field1944[arg0][0][arg1]) * arg2 + (float) this.field1944[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "()V")
    public static void method872() {
        field1947 = null;
        field1945 = null;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(F)F")
    private static final float method873(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(Lhw;Lls;)V")
    public final void method874(class208 arg0, class111 arg1) {
        int var3 = arg0.method1445(-79);
        this.field1948[0] = var3 >> 4;
        this.field1948[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field1950[0] = this.field1950[1] = 0;
            return;
        }
        this.field1950[0] = arg0.method1455(-3387);
        this.field1950[1] = arg0.method1455(-3387);
        int var4 = arg0.method1445(39);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field1948[var5]; var8++) {
                this.field1949[var5][0][var8] = arg0.method1455(-3387);
                this.field1944[var5][0][var8] = arg0.method1455(-3387);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field1948[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field1949[var6][1][var7] = this.field1949[var6][0][var7];
                    this.field1944[var6][1][var7] = this.field1944[var6][0][var7];
                } else {
                    this.field1949[var6][1][var7] = arg0.method1455(-3387);
                    this.field1944[var6][1][var7] = arg0.method1455(-3387);
                }
            }
        }
        if (var4 != 0 || this.field1950[1] != this.field1950[0]) {
            arg1.method722(arg0);
        }
    }

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(IIF)F")
    private final float method875(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1949[arg0][1][arg1] - this.field1949[arg0][0][arg1]) * arg2 + (float) this.field1949[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method873(var5);
    }
}
