import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class31 {

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "[[[I")
    private int[][][] field499 = new int[2][2][4];

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "[[[I")
    private int[][][] field500 = new int[2][2][4];

    @OriginalMember(owner = "client!gp", name = "e", descriptor = "[I")
    public int[] field503 = new int[2];

    @OriginalMember(owner = "client!gp", name = "f", descriptor = "[I")
    private int[] field504 = new int[2];

    @OriginalMember(owner = "client!gp", name = "c", descriptor = "[[I")
    public static int[][] field501 = new int[2][8];

    @OriginalMember(owner = "client!gp", name = "g", descriptor = "[[F")
    private static float[][] field505 = new float[2][8];

    @OriginalMember(owner = "client!gp", name = "d", descriptor = "F")
    private static float field502;

    @OriginalMember(owner = "client!gp", name = "h", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIF)F", line = 7)
    private final float method315(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field500[arg0][1][arg1] - this.field500[arg0][0][arg1]) * arg2 + (float) this.field500[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IF)I", line = 15)
    public final int method316(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field504[1] - this.field504[0]) * arg1 + (float) this.field504[0];
            float var4 = var3 * 0.0030517578F;
            field502 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field506 = (int) (field502 * 65536.0F);
        }
        if (this.field503[arg0] == 0) {
            return 0;
        }
        float var5 = this.method315(arg0, 0, arg1);
        field505[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method320(arg0, 0, arg1));
        field505[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field503[arg0]; var6++) {
            float var9 = this.method315(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method320(arg0, var6, arg1));
            float var11 = var9 * var9;
            field505[arg0][var6 * 2 + 1] = field505[arg0][var6 * 2 - 1] * var11;
            field505[arg0][var6 * 2] = field505[arg0][var6 * 2 - 1] * var10 + field505[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field505[arg0][var12] += field505[arg0][var12 - 1] * var10 + field505[arg0][var12 - 2] * var11;
            }
            field505[arg0][1] += field505[arg0][0] * var10 + var11;
            field505[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field503[0] * 2; var7++) {
                field505[0][var7] *= field502;
            }
        }
        for (int var8 = 0; var8 < this.field503[arg0] * 2; var8++) {
            field501[arg0][var8] = (int) (field505[arg0][var8] * 65536.0F);
        }
        return this.field503[arg0] * 2;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(F)F", line = 81)
    private static final float method317(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lkh;Lpd;)V", line = 88)
    public final void method318(class11 arg0, class140 arg1) {
        int var3 = arg0.method172((byte) 52);
        this.field503[0] = var3 >> 4;
        this.field503[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field504[0] = this.field504[1] = 0;
            return;
        }
        this.field504[0] = arg0.method174(255);
        this.field504[1] = arg0.method174(255);
        int var4 = arg0.method172((byte) 52);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field503[var5]; var8++) {
                this.field499[var5][0][var8] = arg0.method174(255);
                this.field500[var5][0][var8] = arg0.method174(255);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field503[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field499[var6][1][var7] = this.field499[var6][0][var7];
                    this.field500[var6][1][var7] = this.field500[var6][0][var7];
                } else {
                    this.field499[var6][1][var7] = arg0.method174(255);
                    this.field500[var6][1][var7] = arg0.method174(255);
                }
            }
        }
        if (var4 != 0 || this.field504[1] != this.field504[0]) {
            arg1.method962(arg0);
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "()V", line = 157)
    public static void method319() {
        field505 = null;
        field501 = null;
    }

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "(IIF)F", line = 162)
    private final float method320(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field499[arg0][1][arg1] - this.field499[arg0][0][arg1]) * arg2 + (float) this.field499[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method317(var5);
    }
}
