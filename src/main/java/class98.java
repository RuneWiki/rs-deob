import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class98 {

    @OriginalMember(owner = "client!og", name = "a", descriptor = "[[[I")
    private int[][][] field1218 = new int[2][2][4];

    @OriginalMember(owner = "client!og", name = "b", descriptor = "[I")
    public int[] field1219 = new int[2];

    @OriginalMember(owner = "client!og", name = "c", descriptor = "[I")
    private int[] field1220 = new int[2];

    @OriginalMember(owner = "client!og", name = "h", descriptor = "[[[I")
    private int[][][] field1225 = new int[2][2][4];

    @OriginalMember(owner = "client!og", name = "e", descriptor = "[[F")
    private static float[][] field1222 = new float[2][8];

    @OriginalMember(owner = "client!og", name = "f", descriptor = "[[I")
    public static int[][] field1223 = new int[2][8];

    @OriginalMember(owner = "client!og", name = "g", descriptor = "F")
    private static float field1224;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIF)F")
    private final float method570(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1225[arg0][1][arg1] - this.field1225[arg0][0][arg1]) * arg2 + (float) this.field1225[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IF)I")
    public final int method571(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1220[1] - this.field1220[0]) * arg1 + (float) this.field1220[0];
            float var4 = var3 * 0.0030517578F;
            field1224 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field1221 = (int) (field1224 * 65536.0F);
        }
        if (this.field1219[arg0] == 0) {
            return 0;
        }
        float var5 = this.method570(arg0, 0, arg1);
        field1222[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method575(arg0, 0, arg1));
        field1222[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1219[arg0]; var6++) {
            float var9 = this.method570(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method575(arg0, var6, arg1));
            float var11 = var9 * var9;
            field1222[arg0][var6 * 2 + 1] = field1222[arg0][var6 * 2 - 1] * var11;
            field1222[arg0][var6 * 2] = field1222[arg0][var6 * 2 - 1] * var10 + field1222[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field1222[arg0][var12] += field1222[arg0][var12 - 1] * var10 + field1222[arg0][var12 - 2] * var11;
            }
            field1222[arg0][1] += field1222[arg0][0] * var10 + var11;
            field1222[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field1219[0] * 2; var7++) {
                field1222[0][var7] *= field1224;
            }
        }
        for (int var8 = 0; var8 < this.field1219[arg0] * 2; var8++) {
            field1223[arg0][var8] = (int) (field1222[arg0][var8] * 65536.0F);
        }
        return this.field1219[arg0] * 2;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(F)F")
    private static final float method572(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lps;Lraa;)V")
    public final void method573(class428 arg0, class624 arg1) {
        int var3 = arg0.method2561((byte) -19);
        this.field1219[0] = var3 >> 4;
        this.field1219[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field1220[0] = this.field1220[1] = 0;
            return;
        }
        this.field1220[0] = arg0.method2620(104);
        this.field1220[1] = arg0.method2620(67);
        int var4 = arg0.method2561((byte) 116);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field1219[var5]; var8++) {
                this.field1218[var5][0][var8] = arg0.method2620(93);
                this.field1225[var5][0][var8] = arg0.method2620(65);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field1219[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field1218[var6][1][var7] = this.field1218[var6][0][var7];
                    this.field1225[var6][1][var7] = this.field1225[var6][0][var7];
                } else {
                    this.field1218[var6][1][var7] = arg0.method2620(36);
                    this.field1225[var6][1][var7] = arg0.method2620(48);
                }
            }
        }
        if (var4 != 0 || this.field1220[1] != this.field1220[0]) {
            arg1.method3643(arg0);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "()V")
    public static void method574() {
        field1222 = null;
        field1223 = null;
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(IIF)F")
    private final float method575(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1218[arg0][1][arg1] - this.field1218[arg0][0][arg1]) * arg2 + (float) this.field1218[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method572(var5);
    }
}
