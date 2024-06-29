import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class178 {

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "[I")
    private int[] field2225 = new int[2];

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "[[[I")
    private int[][][] field2224 = new int[2][2][4];

    @OriginalMember(owner = "client!fq", name = "d", descriptor = "[I")
    public int[] field2226 = new int[2];

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "[[[I")
    private int[][][] field2223 = new int[2][2][4];

    @OriginalMember(owner = "client!fq", name = "e", descriptor = "[[F")
    private static float[][] field2227 = new float[2][8];

    @OriginalMember(owner = "client!fq", name = "f", descriptor = "[[I")
    public static int[][] field2228 = new int[2][8];

    @OriginalMember(owner = "client!fq", name = "h", descriptor = "F")
    private static float field2230;

    @OriginalMember(owner = "client!fq", name = "g", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Ltq;Ldf;)V")
    public final void method934(class250 arg0, class81 arg1) {
        int var3 = arg0.method1350(31351);
        this.field2226[0] = var3 >> 4;
        this.field2226[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field2225[0] = this.field2225[1] = 0;
            return;
        }
        this.field2225[0] = arg0.method1374(-2);
        this.field2225[1] = arg0.method1374(-2);
        int var4 = arg0.method1350(31351);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field2226[var5]; var8++) {
                this.field2223[var5][0][var8] = arg0.method1374(-2);
                this.field2224[var5][0][var8] = arg0.method1374(-2);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field2226[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field2223[var6][1][var7] = this.field2223[var6][0][var7];
                    this.field2224[var6][1][var7] = this.field2224[var6][0][var7];
                } else {
                    this.field2223[var6][1][var7] = arg0.method1374(-2);
                    this.field2224[var6][1][var7] = arg0.method1374(-2);
                }
            }
        }
        if (var4 != 0 || this.field2225[1] != this.field2225[0]) {
            arg1.method446(arg0);
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(IIF)F")
    private final float method935(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2224[arg0][1][arg1] - this.field2224[arg0][0][arg1]) * arg2 + (float) this.field2224[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(IF)I")
    public final int method936(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field2225[1] - this.field2225[0]) * arg1 + (float) this.field2225[0];
            float var4 = var3 * 0.0030517578F;
            field2230 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field2229 = (int) (field2230 * 65536.0F);
        }
        if (this.field2226[arg0] == 0) {
            return 0;
        }
        float var5 = this.method935(arg0, 0, arg1);
        field2227[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method938(arg0, 0, arg1));
        field2227[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field2226[arg0]; var6++) {
            float var9 = this.method935(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method938(arg0, var6, arg1));
            float var11 = var9 * var9;
            field2227[arg0][var6 * 2 + 1] = field2227[arg0][var6 * 2 - 1] * var11;
            field2227[arg0][var6 * 2] = field2227[arg0][var6 * 2 - 1] * var10 + field2227[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field2227[arg0][var12] += field2227[arg0][var12 - 1] * var10 + field2227[arg0][var12 - 2] * var11;
            }
            field2227[arg0][1] += field2227[arg0][0] * var10 + var11;
            field2227[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field2226[0] * 2; var7++) {
                field2227[0][var7] *= field2230;
            }
        }
        for (int var8 = 0; var8 < this.field2226[arg0] * 2; var8++) {
            field2228[arg0][var8] = (int) (field2227[arg0][var8] * 65536.0F);
        }
        return this.field2226[arg0] * 2;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(F)F")
    private static final float method937(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "(IIF)F")
    private final float method938(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2223[arg0][1][arg1] - this.field2223[arg0][0][arg1]) * arg2 + (float) this.field2223[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method937(var5);
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "()V")
    public static void method939() {
        field2227 = null;
        field2228 = null;
    }
}
