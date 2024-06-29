import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class115 {

    @OriginalMember(owner = "client!se", name = "e", descriptor = "[I")
    public int[] field2705 = new int[2];

    @OriginalMember(owner = "client!se", name = "d", descriptor = "[I")
    private int[] field2704 = new int[2];

    @OriginalMember(owner = "client!se", name = "a", descriptor = "[[[I")
    private int[][][] field2701 = new int[2][2][4];

    @OriginalMember(owner = "client!se", name = "f", descriptor = "[[[I")
    private int[][][] field2706 = new int[2][2][4];

    @OriginalMember(owner = "client!se", name = "c", descriptor = "[[F")
    private static float[][] field2703 = new float[2][8];

    @OriginalMember(owner = "client!se", name = "h", descriptor = "[[I")
    public static int[][] field2708 = new int[2][8];

    @OriginalMember(owner = "client!se", name = "b", descriptor = "F")
    private static float field2702;

    @OriginalMember(owner = "client!se", name = "g", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIF)F", line = 8)
    private final float method945(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2701[arg0][1][arg1] - this.field2701[arg0][0][arg1]) * arg2 + (float) this.field2701[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(F)F", line = 18)
    private static final float method946(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lm;Lhb;)V", line = 23)
    public final void method947(class77 arg0, class45 arg1) {
        int var3 = arg0.method620((byte) -8);
        this.field2705[0] = var3 >> 4;
        this.field2705[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field2704[0] = this.field2704[1] = 0;
            return;
        }
        this.field2704[0] = arg0.method636(-80);
        this.field2704[1] = arg0.method636(-36);
        int var4 = arg0.method620((byte) -8);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field2705[var5]; var8++) {
                this.field2706[var5][0][var8] = arg0.method636(-61);
                this.field2701[var5][0][var8] = arg0.method636(-61);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field2705[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field2706[var6][1][var7] = this.field2706[var6][0][var7];
                    this.field2701[var6][1][var7] = this.field2701[var6][0][var7];
                } else {
                    this.field2706[var6][1][var7] = arg0.method636(-57);
                    this.field2701[var6][1][var7] = arg0.method636(-7);
                }
            }
        }
        if (var4 != 0 || this.field2704[1] != this.field2704[0]) {
            arg1.method368(arg0);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "()V", line = 88)
    public static void method948() {
        field2703 = null;
        field2708 = null;
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(IIF)F", line = 113)
    private final float method949(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2706[arg0][1][arg1] - this.field2706[arg0][0][arg1]) * arg2 + (float) this.field2706[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method946(var5);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IF)I", line = 125)
    public final int method950(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field2704[1] - this.field2704[0]) * arg1 + (float) this.field2704[0];
            float var4 = var3 * 0.0030517578F;
            field2702 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field2707 = (int) (field2702 * 65536.0F);
        }
        if (this.field2705[arg0] == 0) {
            return 0;
        }
        float var5 = this.method945(arg0, 0, arg1);
        field2703[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method949(arg0, 0, arg1));
        field2703[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field2705[arg0]; var6++) {
            float var9 = this.method945(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method949(arg0, var6, arg1));
            float var11 = var9 * var9;
            field2703[arg0][var6 * 2 + 1] = field2703[arg0][var6 * 2 - 1] * var11;
            field2703[arg0][var6 * 2] = field2703[arg0][var6 * 2 - 1] * var10 + field2703[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field2703[arg0][var12] += field2703[arg0][var12 - 1] * var10 + field2703[arg0][var12 - 2] * var11;
            }
            field2703[arg0][1] += field2703[arg0][0] * var10 + var11;
            field2703[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field2705[0] * 2; var7++) {
                field2703[0][var7] *= field2702;
            }
        }
        for (int var8 = 0; var8 < this.field2705[arg0] * 2; var8++) {
            field2708[arg0][var8] = (int) (field2703[arg0][var8] * 65536.0F);
        }
        return this.field2705[arg0] * 2;
    }
}
