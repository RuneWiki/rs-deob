import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class235 {

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "[I")
    private int[] field3343 = new int[2];

    @OriginalMember(owner = "client!uq", name = "d", descriptor = "[[[I")
    private int[][][] field3344 = new int[2][2][4];

    @OriginalMember(owner = "client!uq", name = "f", descriptor = "[[[I")
    private int[][][] field3346 = new int[2][2][4];

    @OriginalMember(owner = "client!uq", name = "g", descriptor = "[I")
    public int[] field3347 = new int[2];

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "[[F")
    private static float[][] field3342 = new float[2][8];

    @OriginalMember(owner = "client!uq", name = "h", descriptor = "[[I")
    public static int[][] field3348 = new int[2][8];

    @OriginalMember(owner = "client!uq", name = "e", descriptor = "F")
    private static float field3345;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(F)F")
    private static final float method1533(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "()V")
    public static void method1534() {
        field3342 = null;
        field3348 = null;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lrg;Lrq;)V")
    public final void method1535(class366 arg0, class327 arg1) {
        int var3 = arg0.method2306((byte) 70);
        this.field3347[0] = var3 >> 4;
        this.field3347[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field3343[0] = this.field3343[1] = 0;
            return;
        }
        this.field3343[0] = arg0.method2297(13352);
        this.field3343[1] = arg0.method2297(13352);
        int var4 = arg0.method2306((byte) 60);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field3347[var5]; var8++) {
                this.field3344[var5][0][var8] = arg0.method2297(13352);
                this.field3346[var5][0][var8] = arg0.method2297(13352);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field3347[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field3344[var6][1][var7] = this.field3344[var6][0][var7];
                    this.field3346[var6][1][var7] = this.field3346[var6][0][var7];
                } else {
                    this.field3344[var6][1][var7] = arg0.method2297(13352);
                    this.field3346[var6][1][var7] = arg0.method2297(13352);
                }
            }
        }
        if (var4 != 0 || this.field3343[1] != this.field3343[0]) {
            arg1.method1998(arg0);
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIF)F")
    private final float method1536(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3346[arg0][1][arg1] - this.field3346[arg0][0][arg1]) * arg2 + (float) this.field3346[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IF)I")
    public final int method1537(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field3343[1] - this.field3343[0]) * arg1 + (float) this.field3343[0];
            float var4 = var3 * 0.0030517578F;
            field3345 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field3341 = (int) (field3345 * 65536.0F);
        }
        if (this.field3347[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1536(arg0, 0, arg1);
        field3342[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1538(arg0, 0, arg1));
        field3342[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field3347[arg0]; var6++) {
            float var9 = this.method1536(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method1538(arg0, var6, arg1));
            float var11 = var9 * var9;
            field3342[arg0][var6 * 2 + 1] = field3342[arg0][var6 * 2 - 1] * var11;
            field3342[arg0][var6 * 2] = field3342[arg0][var6 * 2 - 1] * var10 + field3342[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field3342[arg0][var12] += field3342[arg0][var12 - 1] * var10 + field3342[arg0][var12 - 2] * var11;
            }
            field3342[arg0][1] += field3342[arg0][0] * var10 + var11;
            field3342[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field3347[0] * 2; var7++) {
                field3342[0][var7] *= field3345;
            }
        }
        for (int var8 = 0; var8 < this.field3347[arg0] * 2; var8++) {
            field3348[arg0][var8] = (int) (field3342[arg0][var8] * 65536.0F);
        }
        return this.field3347[arg0] * 2;
    }

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "(IIF)F")
    private final float method1538(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3344[arg0][1][arg1] - this.field3344[arg0][0][arg1]) * arg2 + (float) this.field3344[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1533(var5);
    }
}
