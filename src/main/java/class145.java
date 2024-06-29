import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class145 {

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "[[[I")
    private int[][][] field2225 = new int[2][2][4];

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "[I")
    public int[] field2228 = new int[2];

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "[[[I")
    private int[][][] field2227 = new int[2][2][4];

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "[I")
    private int[] field2224 = new int[2];

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "[[I")
    public static int[][] field2223 = new int[2][8];

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "[[F")
    private static float[][] field2226 = new float[2][8];

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "F")
    private static float field2229;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIF)F", line = 4)
    private final float method909(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2225[arg0][1][arg1] - this.field2225[arg0][0][arg1]) * arg2 + (float) this.field2225[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "()V", line = 10)
    public static void method910() {
        field2226 = (float[][]) null;
        field2223 = (int[][]) null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lhi;Lkg;)V", line = 16)
    public final void method911(class291 arg0, class75 arg1) {
        int var3 = arg0.method2011(-89);
        this.field2228[0] = var3 >> 4;
        this.field2228[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field2224[0] = this.field2224[1] = 0;
            return;
        }
        this.field2224[0] = arg0.method2021((byte) 74);
        this.field2224[1] = arg0.method2021((byte) 74);
        int var4 = arg0.method2011(-100);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field2228[var5]; var6++) {
                this.field2227[var5][0][var6] = arg0.method2021((byte) 74);
                this.field2225[var5][0][var6] = arg0.method2021((byte) 74);
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field2228[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field2227[var7][1][var8] = this.field2227[var7][0][var8];
                    this.field2225[var7][1][var8] = this.field2225[var7][0][var8];
                } else {
                    this.field2227[var7][1][var8] = arg0.method2021((byte) 74);
                    this.field2225[var7][1][var8] = arg0.method2021((byte) 74);
                }
            }
        }
        if (var4 != 0 || this.field2224[1] != this.field2224[0]) {
            arg1.method506(arg0);
        }
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(IIF)F", line = 87)
    private final float method912(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2227[arg0][1][arg1] - this.field2227[arg0][0][arg1]) * arg2 + (float) this.field2227[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method913(var5);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(F)F", line = 98)
    private static final float method913(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IF)I", line = 111)
    public final int method914(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field2224[1] - this.field2224[0]) * arg1 + (float) this.field2224[0];
            float var4 = var3 * 0.0030517578F;
            field2229 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field2230 = (int) (field2229 * 65536.0F);
        }
        if (this.field2228[arg0] == 0) {
            return 0;
        }
        float var5 = this.method909(arg0, 0, arg1);
        field2226[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method912(arg0, 0, arg1));
        field2226[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field2228[arg0]; var6++) {
            float var7 = this.method909(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method912(arg0, var6, arg1));
            float var9 = var7 * var7;
            field2226[arg0][var6 * 2 + 1] = field2226[arg0][var6 * 2 - 1] * var9;
            field2226[arg0][var6 * 2] = field2226[arg0][var6 * 2 - 1] * var8 + field2226[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field2226[arg0][var10] += field2226[arg0][var10 - 1] * var8 + field2226[arg0][var10 - 2] * var9;
            }
            field2226[arg0][1] += field2226[arg0][0] * var8 + var9;
            field2226[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field2228[0] * 2; var11++) {
                field2226[0][var11] *= field2229;
            }
        }
        for (int var12 = 0; var12 < this.field2228[arg0] * 2; var12++) {
            field2223[arg0][var12] = (int) (field2226[arg0][var12] * 65536.0F);
        }
        return this.field2228[arg0] * 2;
    }
}
