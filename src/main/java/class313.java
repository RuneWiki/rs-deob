import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class313 {

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "[I")
    private int[] field4605 = new int[2];

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "[[[I")
    private int[][][] field4606 = new int[2][2][4];

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "[[[I")
    private int[][][] field4607 = new int[2][2][4];

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "[I")
    public int[] field4609 = new int[2];

    @OriginalMember(owner = "client!uo", name = "f", descriptor = "[[I")
    public static int[][] field4610 = new int[2][8];

    @OriginalMember(owner = "client!uo", name = "h", descriptor = "[[F")
    private static float[][] field4612 = new float[2][8];

    @OriginalMember(owner = "client!uo", name = "g", descriptor = "F")
    private static float field4611;

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "I")
    public static int field4608;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIF)F", line = 5)
    private final float method2058(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field4607[arg0][1][arg1] - this.field4607[arg0][0][arg1]) * arg2 + (float) this.field4607[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method2060(var5);
    }

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(IIF)F", line = 15)
    private final float method2059(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field4606[arg0][1][arg1] - this.field4606[arg0][0][arg1]) * arg2 + (float) this.field4606[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(F)F", line = 21)
    private static final float method2060(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lfb;Lfs;)V", line = 36)
    public final void method2061(class341 arg0, class12 arg1) {
        int var3 = arg0.method2233((byte) 104);
        this.field4609[0] = var3 >> 4;
        this.field4609[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field4605[0] = this.field4605[1] = 0;
            return;
        }
        this.field4605[0] = arg0.method2239(-1076227960);
        this.field4605[1] = arg0.method2239(-1076227960);
        int var4 = arg0.method2233((byte) 104);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field4609[var5]; var8++) {
                this.field4607[var5][0][var8] = arg0.method2239(-1076227960);
                this.field4606[var5][0][var8] = arg0.method2239(-1076227960);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field4609[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field4607[var6][1][var7] = this.field4607[var6][0][var7];
                    this.field4606[var6][1][var7] = this.field4606[var6][0][var7];
                } else {
                    this.field4607[var6][1][var7] = arg0.method2239(-1076227960);
                    this.field4606[var6][1][var7] = arg0.method2239(-1076227960);
                }
            }
        }
        if (var4 != 0 || this.field4605[1] != this.field4605[0]) {
            arg1.method96(arg0);
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IF)I", line = 112)
    public final int method2062(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field4605[1] - this.field4605[0]) * arg1 + (float) this.field4605[0];
            float var4 = var3 * 0.0030517578F;
            field4611 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field4608 = (int) (field4611 * 65536.0F);
        }
        if (this.field4609[arg0] == 0) {
            return 0;
        }
        float var5 = this.method2059(arg0, 0, arg1);
        field4612[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method2058(arg0, 0, arg1));
        field4612[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field4609[arg0]; var6++) {
            float var9 = this.method2059(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method2058(arg0, var6, arg1));
            float var11 = var9 * var9;
            field4612[arg0][var6 * 2 + 1] = field4612[arg0][var6 * 2 - 1] * var11;
            field4612[arg0][var6 * 2] = field4612[arg0][var6 * 2 - 1] * var10 + field4612[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field4612[arg0][var12] += field4612[arg0][var12 - 1] * var10 + field4612[arg0][var12 - 2] * var11;
            }
            field4612[arg0][1] += field4612[arg0][0] * var10 + var11;
            field4612[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field4609[0] * 2; var7++) {
                field4612[0][var7] *= field4611;
            }
        }
        for (int var8 = 0; var8 < this.field4609[arg0] * 2; var8++) {
            field4610[arg0][var8] = (int) (field4612[arg0][var8] * 65536.0F);
        }
        return this.field4609[arg0] * 2;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "()V", line = 171)
    public static void method2063() {
        field4612 = null;
        field4610 = null;
    }
}
