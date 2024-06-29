import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class136 {

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "[[[I")
    private int[][][] field2277 = new int[2][2][4];

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "[I")
    private int[] field2276 = new int[2];

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "[[[I")
    private int[][][] field2279 = new int[2][2][4];

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "[I")
    public int[] field2278 = new int[2];

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "[[I")
    public static int[][] field2272 = new int[2][8];

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "[[F")
    private static float[][] field2274 = new float[2][8];

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "F")
    private static float field2275;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "()V", line = 10)
    public static void method1002() {
        field2274 = (float[][]) null;
        field2272 = (int[][]) null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIF)F", line = 15)
    private final float method1003(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2277[arg0][1][arg1] - this.field2277[arg0][0][arg1]) * arg2 + (float) this.field2277[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(IIF)F", line = 22)
    private final float method1004(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2279[arg0][1][arg1] - this.field2279[arg0][0][arg1]) * arg2 + (float) this.field2279[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1005(var5);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(F)F", line = 29)
    private static final float method1005(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lwe;Lfl;)V", line = 40)
    public final void method1006(class47 arg0, class219 arg1) {
        int var3 = arg0.method368(-120);
        this.field2278[0] = var3 >> 4;
        this.field2278[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field2276[0] = this.field2276[1] = 0;
            return;
        }
        this.field2276[0] = arg0.method379(-2);
        this.field2276[1] = arg0.method379(-2);
        int var4 = arg0.method368(-104);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field2278[var5]; var6++) {
                this.field2279[var5][0][var6] = arg0.method379(-2);
                this.field2277[var5][0][var6] = arg0.method379(-2);
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field2278[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field2279[var7][1][var8] = this.field2279[var7][0][var8];
                    this.field2277[var7][1][var8] = this.field2277[var7][0][var8];
                } else {
                    this.field2279[var7][1][var8] = arg0.method379(-2);
                    this.field2277[var7][1][var8] = arg0.method379(-2);
                }
            }
        }
        if (var4 != 0 || this.field2276[1] != this.field2276[0]) {
            arg1.method1617(arg0);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IF)I", line = 112)
    public final int method1007(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field2276[1] - this.field2276[0]) * arg1 + (float) this.field2276[0];
            float var4 = var3 * 0.0030517578F;
            field2275 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field2273 = (int) (field2275 * 65536.0F);
        }
        if (this.field2278[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1003(arg0, 0, arg1);
        field2274[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1004(arg0, 0, arg1));
        field2274[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field2278[arg0]; var6++) {
            float var7 = this.method1003(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1004(arg0, var6, arg1));
            float var9 = var7 * var7;
            field2274[arg0][var6 * 2 + 1] = field2274[arg0][var6 * 2 - 1] * var9;
            field2274[arg0][var6 * 2] = field2274[arg0][var6 * 2 - 1] * var8 + field2274[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field2274[arg0][var10] += field2274[arg0][var10 - 1] * var8 + field2274[arg0][var10 - 2] * var9;
            }
            field2274[arg0][1] += field2274[arg0][0] * var8 + var9;
            field2274[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field2278[0] * 2; var11++) {
                field2274[0][var11] *= field2275;
            }
        }
        for (int var12 = 0; var12 < this.field2278[arg0] * 2; var12++) {
            field2272[arg0][var12] = (int) (field2274[arg0][var12] * 65536.0F);
        }
        return this.field2278[arg0] * 2;
    }
}
