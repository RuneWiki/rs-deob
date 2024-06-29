import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mw")
public class class452 {

    @OriginalMember(owner = "client!mw", name = "b", descriptor = "[I")
    public int[] field6307 = new int[2];

    @OriginalMember(owner = "client!mw", name = "c", descriptor = "[I")
    private int[] field6308 = new int[2];

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "[[[I")
    private int[][][] field6306 = new int[2][2][4];

    @OriginalMember(owner = "client!mw", name = "g", descriptor = "[[[I")
    private int[][][] field6312 = new int[2][2][4];

    @OriginalMember(owner = "client!mw", name = "d", descriptor = "[[I")
    public static int[][] field6309 = new int[2][8];

    @OriginalMember(owner = "client!mw", name = "f", descriptor = "[[F")
    private static float[][] field6311 = new float[2][8];

    @OriginalMember(owner = "client!mw", name = "e", descriptor = "F")
    private static float field6310;

    @OriginalMember(owner = "client!mw", name = "h", descriptor = "I")
    public static int field6313;

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(IIF)F")
    private final float method2592(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field6312[arg0][1][arg1] - this.field6312[arg0][0][arg1]) * arg2 + (float) this.field6312[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(Ljr;Ltca;)V")
    public final void method2593(class96 arg0, class157 arg1) {
        int var3 = arg0.method718(-114);
        this.field6307[0] = var3 >> 4;
        this.field6307[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field6308[0] = this.field6308[1] = 0;
            return;
        }
        this.field6308[0] = arg0.method743((byte) -39);
        this.field6308[1] = arg0.method743((byte) -22);
        int var4 = arg0.method718(77);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field6307[var5]; var8++) {
                this.field6306[var5][0][var8] = arg0.method743((byte) -23);
                this.field6312[var5][0][var8] = arg0.method743((byte) -52);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field6307[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field6306[var6][1][var7] = this.field6306[var6][0][var7];
                    this.field6312[var6][1][var7] = this.field6312[var6][0][var7];
                } else {
                    this.field6306[var6][1][var7] = arg0.method743((byte) -91);
                    this.field6312[var6][1][var7] = arg0.method743((byte) -64);
                }
            }
        }
        if (var4 != 0 || this.field6308[1] != this.field6308[0]) {
            arg1.method1089(arg0);
        }
    }

    @OriginalMember(owner = "client!mw", name = "b", descriptor = "(IIF)F")
    private final float method2594(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field6306[arg0][1][arg1] - this.field6306[arg0][0][arg1]) * arg2 + (float) this.field6306[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method2595(var5);
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(F)F")
    private static final float method2595(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "()V")
    public static void method2596() {
        field6311 = null;
        field6309 = null;
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(IF)I")
    public final int method2597(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field6308[1] - this.field6308[0]) * arg1 + (float) this.field6308[0];
            float var4 = var3 * 0.0030517578F;
            field6310 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field6313 = (int) (field6310 * 65536.0F);
        }
        if (this.field6307[arg0] == 0) {
            return 0;
        }
        float var5 = this.method2592(arg0, 0, arg1);
        field6311[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method2594(arg0, 0, arg1));
        field6311[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field6307[arg0]; var6++) {
            float var9 = this.method2592(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method2594(arg0, var6, arg1));
            float var11 = var9 * var9;
            field6311[arg0][var6 * 2 + 1] = field6311[arg0][var6 * 2 - 1] * var11;
            field6311[arg0][var6 * 2] = field6311[arg0][var6 * 2 - 1] * var10 + field6311[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field6311[arg0][var12] += field6311[arg0][var12 - 1] * var10 + field6311[arg0][var12 - 2] * var11;
            }
            field6311[arg0][1] += field6311[arg0][0] * var10 + var11;
            field6311[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field6307[0] * 2; var7++) {
                field6311[0][var7] *= field6310;
            }
        }
        for (int var8 = 0; var8 < this.field6307[arg0] * 2; var8++) {
            field6309[arg0][var8] = (int) (field6311[arg0][var8] * 65536.0F);
        }
        return this.field6307[arg0] * 2;
    }
}
