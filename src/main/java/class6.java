import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class6 {

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "[[[I")
    private int[][][] field140 = new int[2][2][4];

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "[I")
    private int[] field136 = new int[2];

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "[[[I")
    private int[][][] field139 = new int[2][2][4];

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "[I")
    public int[] field141 = new int[2];

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "[[I")
    public static int[][] field137 = new int[2][8];

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "[[F")
    private static float[][] field143 = new float[2][8];

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "F")
    private static float field138;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "()V", line = 6)
    public static void method62() {
        field143 = null;
        field137 = null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIF)F", line = 11)
    private final float method63(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field139[arg0][1][arg1] - this.field139[arg0][0][arg1]) * arg2 + (float) this.field139[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lwd;Lrd;)V", line = 21)
    public final void method64(class140 arg0, class110 arg1) {
        int var3 = arg0.method1105(255);
        this.field141[0] = var3 >> 4;
        this.field141[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field136[0] = this.field136[1] = 0;
            return;
        }
        this.field136[0] = arg0.method1072(67);
        this.field136[1] = arg0.method1072(70);
        int var4 = arg0.method1105(255);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field141[var5]; var8++) {
                this.field140[var5][0][var8] = arg0.method1072(30);
                this.field139[var5][0][var8] = arg0.method1072(79);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field141[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field140[var6][1][var7] = this.field140[var6][0][var7];
                    this.field139[var6][1][var7] = this.field139[var6][0][var7];
                } else {
                    this.field140[var6][1][var7] = arg0.method1072(79);
                    this.field139[var6][1][var7] = arg0.method1072(8);
                }
            }
        }
        if (var4 != 0 || this.field136[1] != this.field136[0]) {
            arg1.method835(arg0);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(F)F", line = 88)
    private static final float method65(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IF)I", line = 95)
    public final int method66(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field136[1] - this.field136[0]) * arg1 + (float) this.field136[0];
            float var4 = var3 * 0.0030517578F;
            field138 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field142 = (int) (field138 * 65536.0F);
        }
        if (this.field141[arg0] == 0) {
            return 0;
        }
        float var5 = this.method63(arg0, 0, arg1);
        field143[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method67(arg0, 0, arg1));
        field143[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field141[arg0]; var6++) {
            float var9 = this.method63(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method67(arg0, var6, arg1));
            float var11 = var9 * var9;
            field143[arg0][var6 * 2 + 1] = field143[arg0][var6 * 2 - 1] * var11;
            field143[arg0][var6 * 2] = field143[arg0][var6 * 2 - 1] * var10 + field143[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field143[arg0][var12] += field143[arg0][var12 - 1] * var10 + field143[arg0][var12 - 2] * var11;
            }
            field143[arg0][1] += field143[arg0][0] * var10 + var11;
            field143[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field141[0] * 2; var7++) {
                field143[0][var7] *= field138;
            }
        }
        for (int var8 = 0; var8 < this.field141[arg0] * 2; var8++) {
            field137[arg0][var8] = (int) (field143[arg0][var8] * 65536.0F);
        }
        return this.field141[arg0] * 2;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(IIF)F", line = 156)
    private final float method67(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field140[arg0][1][arg1] - this.field140[arg0][0][arg1]) * arg2 + (float) this.field140[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method65(var5);
    }
}
