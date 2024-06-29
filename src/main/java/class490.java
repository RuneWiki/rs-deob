import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class490 {

    @OriginalMember(owner = "client!um", name = "e", descriptor = "[I")
    private int[] field6119 = new int[2];

    @OriginalMember(owner = "client!um", name = "b", descriptor = "[[[I")
    private int[][][] field6116 = new int[2][2][4];

    @OriginalMember(owner = "client!um", name = "f", descriptor = "[I")
    public int[] field6120 = new int[2];

    @OriginalMember(owner = "client!um", name = "h", descriptor = "[[[I")
    private int[][][] field6122 = new int[2][2][4];

    @OriginalMember(owner = "client!um", name = "c", descriptor = "[[I")
    public static int[][] field6117 = new int[2][8];

    @OriginalMember(owner = "client!um", name = "d", descriptor = "[[F")
    private static float[][] field6118 = new float[2][8];

    @OriginalMember(owner = "client!um", name = "a", descriptor = "F")
    private static float field6115;

    @OriginalMember(owner = "client!um", name = "g", descriptor = "I")
    public static int field6121;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(F)F", line = 10)
    private static final float method2659(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "()V", line = 18)
    public static void method2660() {
        field6118 = null;
        field6117 = null;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IIF)F", line = 25)
    private final float method2661(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field6116[arg0][1][arg1] - this.field6116[arg0][0][arg1]) * arg2 + (float) this.field6116[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(IIF)F", line = 32)
    private final float method2662(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field6122[arg0][1][arg1] - this.field6122[arg0][0][arg1]) * arg2 + (float) this.field6122[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method2659(var5);
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Lji;Lgf;)V", line = 38)
    public final void method2663(class572 arg0, class258 arg1) {
        int var3 = arg0.method3097((byte) 12);
        this.field6120[0] = var3 >> 4;
        this.field6120[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field6119[0] = this.field6119[1] = 0;
            return;
        }
        this.field6119[0] = arg0.method3031(-1);
        this.field6119[1] = arg0.method3031(-1);
        int var4 = arg0.method3097((byte) 12);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field6120[var5]; var8++) {
                this.field6122[var5][0][var8] = arg0.method3031(-1);
                this.field6116[var5][0][var8] = arg0.method3031(-1);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field6120[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field6122[var6][1][var7] = this.field6122[var6][0][var7];
                    this.field6116[var6][1][var7] = this.field6116[var6][0][var7];
                } else {
                    this.field6122[var6][1][var7] = arg0.method3031(-1);
                    this.field6116[var6][1][var7] = arg0.method3031(-1);
                }
            }
        }
        if (var4 != 0 || this.field6119[1] != this.field6119[0]) {
            arg1.method1540(arg0);
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IF)I", line = 108)
    public final int method2664(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field6119[1] - this.field6119[0]) * arg1 + (float) this.field6119[0];
            float var4 = var3 * 0.0030517578F;
            field6115 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field6121 = (int) (field6115 * 65536.0F);
        }
        if (this.field6120[arg0] == 0) {
            return 0;
        }
        float var5 = this.method2661(arg0, 0, arg1);
        field6118[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method2662(arg0, 0, arg1));
        field6118[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field6120[arg0]; var6++) {
            float var9 = this.method2661(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method2662(arg0, var6, arg1));
            float var11 = var9 * var9;
            field6118[arg0][var6 * 2 + 1] = field6118[arg0][var6 * 2 - 1] * var11;
            field6118[arg0][var6 * 2] = field6118[arg0][var6 * 2 - 1] * var10 + field6118[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field6118[arg0][var12] += field6118[arg0][var12 - 1] * var10 + field6118[arg0][var12 - 2] * var11;
            }
            field6118[arg0][1] += field6118[arg0][0] * var10 + var11;
            field6118[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field6120[0] * 2; var7++) {
                field6118[0][var7] *= field6115;
            }
        }
        for (int var8 = 0; var8 < this.field6120[arg0] * 2; var8++) {
            field6117[arg0][var8] = (int) (field6118[arg0][var8] * 65536.0F);
        }
        return this.field6120[arg0] * 2;
    }
}
