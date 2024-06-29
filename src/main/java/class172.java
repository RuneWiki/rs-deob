import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class172 {

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "[I")
    public int[] field3117 = new int[2];

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "[[[I")
    private int[][][] field3116 = new int[2][2][4];

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "[I")
    private int[] field3120 = new int[2];

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "[[[I")
    private int[][][] field3122 = new int[2][2][4];

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "[[I")
    public static int[][] field3118 = new int[2][8];

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "[[F")
    private static float[][] field3119 = new float[2][8];

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "F")
    private static float field3121;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "()V")
    public static void method1101() {
        field3119 = null;
        field3118 = null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IF)I")
    public final int method1102(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field3120[1] - this.field3120[0]) * arg1 + (float) this.field3120[0];
            float var4 = var3 * 0.0030517578F;
            field3121 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field3115 = (int) (field3121 * 65536.0F);
        }
        if (this.field3117[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1104(arg0, 0, arg1);
        field3119[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1106(arg0, 0, arg1));
        field3119[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field3117[arg0]; var6++) {
            float var9 = this.method1104(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method1106(arg0, var6, arg1));
            float var11 = var9 * var9;
            field3119[arg0][var6 * 2 + 1] = field3119[arg0][var6 * 2 - 1] * var11;
            field3119[arg0][var6 * 2] = field3119[arg0][var6 * 2 - 1] * var10 + field3119[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field3119[arg0][var12] += field3119[arg0][var12 - 1] * var10 + field3119[arg0][var12 - 2] * var11;
            }
            field3119[arg0][1] += field3119[arg0][0] * var10 + var11;
            field3119[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field3117[0] * 2; var7++) {
                field3119[0][var7] *= field3121;
            }
        }
        for (int var8 = 0; var8 < this.field3117[arg0] * 2; var8++) {
            field3118[arg0][var8] = (int) (field3119[arg0][var8] * 65536.0F);
        }
        return this.field3117[arg0] * 2;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lwa;Lhd;)V")
    public final void method1103(class229 arg0, class80 arg1) {
        int var3 = arg0.method1475(255);
        this.field3117[0] = var3 >> 4;
        this.field3117[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field3120[0] = this.field3120[1] = 0;
            return;
        }
        this.field3120[0] = arg0.method1490((byte) 73);
        this.field3120[1] = arg0.method1490((byte) 73);
        int var4 = arg0.method1475(255);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field3117[var5]; var8++) {
                this.field3116[var5][0][var8] = arg0.method1490((byte) 73);
                this.field3122[var5][0][var8] = arg0.method1490((byte) 73);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field3117[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field3116[var6][1][var7] = this.field3116[var6][0][var7];
                    this.field3122[var6][1][var7] = this.field3122[var6][0][var7];
                } else {
                    this.field3116[var6][1][var7] = arg0.method1490((byte) 73);
                    this.field3122[var6][1][var7] = arg0.method1490((byte) 73);
                }
            }
        }
        if (var4 != 0 || this.field3120[1] != this.field3120[0]) {
            arg1.method514(arg0);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIF)F")
    private final float method1104(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3122[arg0][1][arg1] - this.field3122[arg0][0][arg1]) * arg2 + (float) this.field3122[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(F)F")
    private static final float method1105(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(IIF)F")
    private final float method1106(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3116[arg0][1][arg1] - this.field3116[arg0][0][arg1]) * arg2 + (float) this.field3116[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1105(var5);
    }
}
