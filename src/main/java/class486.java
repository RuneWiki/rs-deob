import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class486 {

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "[[[I")
    private int[][][] field7123 = new int[2][2][4];

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "[I")
    public int[] field7125 = new int[2];

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "[I")
    private int[] field7129 = new int[2];

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "[[[I")
    private int[][][] field7130 = new int[2][2][4];

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "[[I")
    public static int[][] field7127 = new int[2][8];

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "[[F")
    private static float[][] field7128 = new float[2][8];

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "F")
    private static float field7126;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
    public static int field7124;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIF)F")
    private final float method2841(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field7130[arg0][1][arg1] - this.field7130[arg0][0][arg1]) * arg2 + (float) this.field7130[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method2846(var5);
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(IIF)F")
    private final float method2842(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field7123[arg0][1][arg1] - this.field7123[arg0][0][arg1]) * arg2 + (float) this.field7123[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IF)I")
    public final int method2843(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field7129[1] - this.field7129[0]) * arg1 + (float) this.field7129[0];
            float var4 = var3 * 0.0030517578F;
            field7126 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field7124 = (int) (field7126 * 65536.0F);
        }
        if (this.field7125[arg0] == 0) {
            return 0;
        }
        float var5 = this.method2842(arg0, 0, arg1);
        field7128[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method2841(arg0, 0, arg1));
        field7128[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field7125[arg0]; var6++) {
            float var9 = this.method2842(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method2841(arg0, var6, arg1));
            float var11 = var9 * var9;
            field7128[arg0][var6 * 2 + 1] = field7128[arg0][var6 * 2 - 1] * var11;
            field7128[arg0][var6 * 2] = field7128[arg0][var6 * 2 - 1] * var10 + field7128[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field7128[arg0][var12] += field7128[arg0][var12 - 1] * var10 + field7128[arg0][var12 - 2] * var11;
            }
            field7128[arg0][1] += field7128[arg0][0] * var10 + var11;
            field7128[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field7125[0] * 2; var7++) {
                field7128[0][var7] *= field7126;
            }
        }
        for (int var8 = 0; var8 < this.field7125[arg0] * 2; var8++) {
            field7127[arg0][var8] = (int) (field7128[arg0][var8] * 65536.0F);
        }
        return this.field7125[arg0] * 2;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lia;Lre;)V")
    public final void method2844(class23 arg0, class225 arg1) {
        int var3 = arg0.method126((byte) -128);
        this.field7125[0] = var3 >> 4;
        this.field7125[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field7129[0] = this.field7129[1] = 0;
            return;
        }
        this.field7129[0] = arg0.method132(122);
        this.field7129[1] = arg0.method132(93);
        int var4 = arg0.method126((byte) -95);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field7125[var5]; var8++) {
                this.field7130[var5][0][var8] = arg0.method132(114);
                this.field7123[var5][0][var8] = arg0.method132(88);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field7125[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field7130[var6][1][var7] = this.field7130[var6][0][var7];
                    this.field7123[var6][1][var7] = this.field7123[var6][0][var7];
                } else {
                    this.field7130[var6][1][var7] = arg0.method132(43);
                    this.field7123[var6][1][var7] = arg0.method132(122);
                }
            }
        }
        if (var4 != 0 || this.field7129[1] != this.field7129[0]) {
            arg1.method1550(arg0);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "()V")
    public static void method2845() {
        field7128 = null;
        field7127 = null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(F)F")
    private static final float method2846(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }
}
