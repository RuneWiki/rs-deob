import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class125 {

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "[[[I")
    private int[][][] field2305 = new int[2][2][4];

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "[I")
    private int[] field2308 = new int[2];

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "[I")
    public int[] field2309 = new int[2];

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "[[[I")
    private int[][][] field2310 = new int[2][2][4];

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "[[I")
    public static int[][] field2306 = new int[2][8];

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "[[F")
    private static float[][] field2307 = new float[2][8];

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "F")
    private static float field2304;

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIF)F")
    private final float method961(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2310[arg0][1][arg1] - this.field2310[arg0][0][arg1]) * arg2 + (float) this.field2310[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method965(var5);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IF)I")
    public final int method962(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field2308[1] - this.field2308[0]) * arg1 + (float) this.field2308[0];
            float var4 = var3 * 0.0030517578F;
            field2304 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field2311 = (int) (field2304 * 65536.0F);
        }
        if (this.field2309[arg0] == 0) {
            return 0;
        }
        float var5 = this.method966(arg0, 0, arg1);
        field2307[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method961(arg0, 0, arg1));
        field2307[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field2309[arg0]; var6++) {
            float var9 = this.method966(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method961(arg0, var6, arg1));
            float var11 = var9 * var9;
            field2307[arg0][var6 * 2 + 1] = field2307[arg0][var6 * 2 - 1] * var11;
            field2307[arg0][var6 * 2] = field2307[arg0][var6 * 2 - 1] * var10 + field2307[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field2307[arg0][var12] += field2307[arg0][var12 - 1] * var10 + field2307[arg0][var12 - 2] * var11;
            }
            field2307[arg0][1] += field2307[arg0][0] * var10 + var11;
            field2307[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field2309[0] * 2; var7++) {
                field2307[0][var7] *= field2304;
            }
        }
        for (int var8 = 0; var8 < this.field2309[arg0] * 2; var8++) {
            field2306[arg0][var8] = (int) (field2307[arg0][var8] * 65536.0F);
        }
        return this.field2309[arg0] * 2;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "()V")
    public static void method963() {
        field2307 = null;
        field2306 = null;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lrg;Lrk;)V")
    public final void method964(class239 arg0, class13 arg1) {
        int var3 = arg0.method1651(4139);
        this.field2309[0] = var3 >> 4;
        this.field2309[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field2308[0] = this.field2308[1] = 0;
            return;
        }
        this.field2308[0] = arg0.method1663((byte) -89);
        this.field2308[1] = arg0.method1663((byte) 85);
        int var4 = arg0.method1651(4139);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field2309[var5]; var8++) {
                this.field2310[var5][0][var8] = arg0.method1663((byte) -113);
                this.field2305[var5][0][var8] = arg0.method1663((byte) -54);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field2309[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field2310[var6][1][var7] = this.field2310[var6][0][var7];
                    this.field2305[var6][1][var7] = this.field2305[var6][0][var7];
                } else {
                    this.field2310[var6][1][var7] = arg0.method1663((byte) 71);
                    this.field2305[var6][1][var7] = arg0.method1663((byte) 107);
                }
            }
        }
        if (var4 != 0 || this.field2308[1] != this.field2308[0]) {
            arg1.method104(arg0);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(F)F")
    private static final float method965(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(IIF)F")
    private final float method966(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2305[arg0][1][arg1] - this.field2305[arg0][0][arg1]) * arg2 + (float) this.field2305[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }
}
