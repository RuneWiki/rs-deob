import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hca")
public class class363 {

    @OriginalMember(owner = "client!hca", name = "c", descriptor = "[[[I")
    private int[][][] field5329 = new int[2][2][4];

    @OriginalMember(owner = "client!hca", name = "d", descriptor = "[I")
    private int[] field5330 = new int[2];

    @OriginalMember(owner = "client!hca", name = "g", descriptor = "[[[I")
    private int[][][] field5333 = new int[2][2][4];

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "[I")
    public int[] field5327 = new int[2];

    @OriginalMember(owner = "client!hca", name = "b", descriptor = "[[F")
    private static float[][] field5328 = new float[2][8];

    @OriginalMember(owner = "client!hca", name = "e", descriptor = "[[I")
    public static int[][] field5331 = new int[2][8];

    @OriginalMember(owner = "client!hca", name = "h", descriptor = "F")
    private static float field5334;

    @OriginalMember(owner = "client!hca", name = "f", descriptor = "I")
    public static int field5332;

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "()V", line = 4)
    public static void method2226() {
        field5328 = null;
        field5331 = null;
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(F)F", line = 24)
    private static final float method2227(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(Lgk;Liea;)V", line = 32)
    public final void method2228(class540 arg0, class598 arg1) {
        int var3 = arg0.method3115(29871);
        this.field5327[0] = var3 >> 4;
        this.field5327[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field5330[0] = this.field5330[1] = 0;
            return;
        }
        this.field5330[0] = arg0.method3169(26488);
        this.field5330[1] = arg0.method3169(26488);
        int var4 = arg0.method3115(29871);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field5327[var5]; var8++) {
                this.field5329[var5][0][var8] = arg0.method3169(26488);
                this.field5333[var5][0][var8] = arg0.method3169(26488);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field5327[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field5329[var6][1][var7] = this.field5329[var6][0][var7];
                    this.field5333[var6][1][var7] = this.field5333[var6][0][var7];
                } else {
                    this.field5329[var6][1][var7] = arg0.method3169(26488);
                    this.field5333[var6][1][var7] = arg0.method3169(26488);
                }
            }
        }
        if (var4 != 0 || this.field5330[1] != this.field5330[0]) {
            arg1.method3405(arg0);
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(IIF)F", line = 112)
    private final float method2229(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field5333[arg0][1][arg1] - this.field5333[arg0][0][arg1]) * arg2 + (float) this.field5333[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(IF)I", line = 117)
    public final int method2230(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field5330[1] - this.field5330[0]) * arg1 + (float) this.field5330[0];
            float var4 = var3 * 0.0030517578F;
            field5334 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field5332 = (int) (field5334 * 65536.0F);
        }
        if (this.field5327[arg0] == 0) {
            return 0;
        }
        float var5 = this.method2229(arg0, 0, arg1);
        field5328[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method2231(arg0, 0, arg1));
        field5328[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field5327[arg0]; var6++) {
            float var9 = this.method2229(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method2231(arg0, var6, arg1));
            float var11 = var9 * var9;
            field5328[arg0][var6 * 2 + 1] = field5328[arg0][var6 * 2 - 1] * var11;
            field5328[arg0][var6 * 2] = field5328[arg0][var6 * 2 - 1] * var10 + field5328[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field5328[arg0][var12] += field5328[arg0][var12 - 1] * var10 + field5328[arg0][var12 - 2] * var11;
            }
            field5328[arg0][1] += field5328[arg0][0] * var10 + var11;
            field5328[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field5327[0] * 2; var7++) {
                field5328[0][var7] *= field5334;
            }
        }
        for (int var8 = 0; var8 < this.field5327[arg0] * 2; var8++) {
            field5331[arg0][var8] = (int) (field5328[arg0][var8] * 65536.0F);
        }
        return this.field5327[arg0] * 2;
    }

    @OriginalMember(owner = "client!hca", name = "b", descriptor = "(IIF)F", line = 177)
    private final float method2231(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field5329[arg0][1][arg1] - this.field5329[arg0][0][arg1]) * arg2 + (float) this.field5329[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method2227(var5);
    }
}
