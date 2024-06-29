import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class57 {

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "[I")
    public int[] field782 = new int[2];

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "[[[I")
    private int[][][] field783 = new int[2][2][4];

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "[[[I")
    private int[][][] field785 = new int[2][2][4];

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "[I")
    private int[] field787 = new int[2];

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "[[F")
    private static float[][] field784 = new float[2][8];

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "[[I")
    public static int[][] field788 = new int[2][8];

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "F")
    private static float field789;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIF)F", line = 4)
    private final float method397(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field783[arg0][1][arg1] - this.field783[arg0][0][arg1]) * arg2 + (float) this.field783[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method400(var5);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "()V", line = 10)
    public static void method398() {
        field784 = (float[][]) null;
        field788 = (int[][]) null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lcg;Lqa;)V", line = 15)
    public final void method399(class316 arg0, class321 arg1) {
        int var3 = arg0.method2219(16448);
        this.field782[0] = var3 >> 4;
        this.field782[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field787[0] = this.field787[1] = 0;
            return;
        }
        this.field787[0] = arg0.method2220((byte) 52);
        this.field787[1] = arg0.method2220((byte) 75);
        int var4 = arg0.method2219(16448);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field782[var5]; var6++) {
                this.field783[var5][0][var6] = arg0.method2220((byte) 113);
                this.field785[var5][0][var6] = arg0.method2220((byte) 99);
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field782[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field783[var7][1][var8] = this.field783[var7][0][var8];
                    this.field785[var7][1][var8] = this.field785[var7][0][var8];
                } else {
                    this.field783[var7][1][var8] = arg0.method2220((byte) 98);
                    this.field785[var7][1][var8] = arg0.method2220((byte) 115);
                }
            }
        }
        if (var4 != 0 || this.field787[1] != this.field787[0]) {
            arg1.method2247(arg0);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(F)F", line = 90)
    private static final float method400(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IF)I", line = 98)
    public final int method401(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field787[1] - this.field787[0]) * arg1 + (float) this.field787[0];
            float var4 = var3 * 0.0030517578F;
            field789 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field786 = (int) (field789 * 65536.0F);
        }
        if (this.field782[arg0] == 0) {
            return 0;
        }
        float var5 = this.method402(arg0, 0, arg1);
        field784[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method397(arg0, 0, arg1));
        field784[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field782[arg0]; var6++) {
            float var7 = this.method402(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method397(arg0, var6, arg1));
            float var9 = var7 * var7;
            field784[arg0][var6 * 2 + 1] = field784[arg0][var6 * 2 - 1] * var9;
            field784[arg0][var6 * 2] = field784[arg0][var6 * 2 - 1] * var8 + field784[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field784[arg0][var10] += field784[arg0][var10 - 1] * var8 + field784[arg0][var10 - 2] * var9;
            }
            field784[arg0][1] += field784[arg0][0] * var8 + var9;
            field784[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field782[0] * 2; var11++) {
                field784[0][var11] *= field789;
            }
        }
        for (int var12 = 0; var12 < this.field782[arg0] * 2; var12++) {
            field788[arg0][var12] = (int) (field784[arg0][var12] * 65536.0F);
        }
        return this.field782[arg0] * 2;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(IIF)F", line = 162)
    private final float method402(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field785[arg0][1][arg1] - this.field785[arg0][0][arg1]) * arg2 + (float) this.field785[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }
}
