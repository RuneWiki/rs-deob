import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class242 {

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "[I")
    private int[] field3522 = new int[2];

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "[[[I")
    private int[][][] field3521 = new int[2][2][4];

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "[[[I")
    private int[][][] field3520 = new int[2][2][4];

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "[I")
    public int[] field3517 = new int[2];

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "[[I")
    public static int[][] field3518 = new int[2][8];

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "[[F")
    private static float[][] field3519 = new float[2][8];

    @OriginalMember(owner = "client!nl", name = "h", descriptor = "F")
    private static float field3524;

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(F)F")
    private static final float method1574(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lqi;Lia;)V")
    public final void method1575(class216 arg0, class83 arg1) {
        int var3 = arg0.method1407(117);
        this.field3517[0] = var3 >> 4;
        this.field3517[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field3522[0] = this.field3522[1] = 0;
            return;
        }
        this.field3522[0] = arg0.method1380(true);
        this.field3522[1] = arg0.method1380(true);
        int var4 = arg0.method1407(105);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field3517[var5]; var8++) {
                this.field3520[var5][0][var8] = arg0.method1380(true);
                this.field3521[var5][0][var8] = arg0.method1380(true);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field3517[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field3520[var6][1][var7] = this.field3520[var6][0][var7];
                    this.field3521[var6][1][var7] = this.field3521[var6][0][var7];
                } else {
                    this.field3520[var6][1][var7] = arg0.method1380(true);
                    this.field3521[var6][1][var7] = arg0.method1380(true);
                }
            }
        }
        if (var4 != 0 || this.field3522[1] != this.field3522[0]) {
            arg1.method498(arg0);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIF)F")
    private final float method1576(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3520[arg0][1][arg1] - this.field3520[arg0][0][arg1]) * arg2 + (float) this.field3520[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1574(var5);
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(IIF)F")
    private final float method1577(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3521[arg0][1][arg1] - this.field3521[arg0][0][arg1]) * arg2 + (float) this.field3521[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IF)I")
    public final int method1578(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field3522[1] - this.field3522[0]) * arg1 + (float) this.field3522[0];
            float var4 = var3 * 0.0030517578F;
            field3524 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field3523 = (int) (field3524 * 65536.0F);
        }
        if (this.field3517[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1577(arg0, 0, arg1);
        field3519[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1576(arg0, 0, arg1));
        field3519[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field3517[arg0]; var6++) {
            float var9 = this.method1577(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method1576(arg0, var6, arg1));
            float var11 = var9 * var9;
            field3519[arg0][var6 * 2 + 1] = field3519[arg0][var6 * 2 - 1] * var11;
            field3519[arg0][var6 * 2] = field3519[arg0][var6 * 2 - 1] * var10 + field3519[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field3519[arg0][var12] += field3519[arg0][var12 - 1] * var10 + field3519[arg0][var12 - 2] * var11;
            }
            field3519[arg0][1] += field3519[arg0][0] * var10 + var11;
            field3519[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field3517[0] * 2; var7++) {
                field3519[0][var7] *= field3524;
            }
        }
        for (int var8 = 0; var8 < this.field3517[arg0] * 2; var8++) {
            field3518[arg0][var8] = (int) (field3519[arg0][var8] * 65536.0F);
        }
        return this.field3517[arg0] * 2;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "()V")
    public static void method1579() {
        field3519 = null;
        field3518 = null;
    }
}
