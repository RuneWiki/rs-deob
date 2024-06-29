import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class242 {

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "[I")
    public int[] field3601 = new int[2];

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "[[[I")
    private int[][][] field3600 = new int[2][2][4];

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "[[[I")
    private int[][][] field3602 = new int[2][2][4];

    @OriginalMember(owner = "client!wr", name = "h", descriptor = "[I")
    private int[] field3606 = new int[2];

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "[[F")
    private static float[][] field3599 = new float[2][8];

    @OriginalMember(owner = "client!wr", name = "f", descriptor = "[[I")
    public static int[][] field3604 = new int[2][8];

    @OriginalMember(owner = "client!wr", name = "e", descriptor = "F")
    private static float field3603;

    @OriginalMember(owner = "client!wr", name = "g", descriptor = "I")
    public static int field3605;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "()V", line = 4)
    public static void method1626() {
        field3599 = null;
        field3604 = null;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIF)F", line = 15)
    private final float method1627(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3600[arg0][1][arg1] - this.field3600[arg0][0][arg1]) * arg2 + (float) this.field3600[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "(IIF)F", line = 29)
    private final float method1628(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3602[arg0][1][arg1] - this.field3602[arg0][0][arg1]) * arg2 + (float) this.field3602[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1631(var5);
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Ldc;Lle;)V", line = 38)
    public final void method1629(class63 arg0, class739 arg1) {
        int var3 = arg0.method505((byte) -119);
        this.field3601[0] = var3 >> 4;
        this.field3601[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field3606[0] = this.field3606[1] = 0;
            return;
        }
        this.field3606[0] = arg0.method482(-772591672);
        this.field3606[1] = arg0.method482(-772591672);
        int var4 = arg0.method505((byte) -119);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field3601[var5]; var8++) {
                this.field3602[var5][0][var8] = arg0.method482(-772591672);
                this.field3600[var5][0][var8] = arg0.method482(-772591672);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field3601[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field3602[var6][1][var7] = this.field3602[var6][0][var7];
                    this.field3600[var6][1][var7] = this.field3600[var6][0][var7];
                } else {
                    this.field3602[var6][1][var7] = arg0.method482(-772591672);
                    this.field3600[var6][1][var7] = arg0.method482(-772591672);
                }
            }
        }
        if (var4 != 0 || this.field3606[1] != this.field3606[0]) {
            arg1.method4107(arg0);
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IF)I", line = 104)
    public final int method1630(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field3606[1] - this.field3606[0]) * arg1 + (float) this.field3606[0];
            float var4 = var3 * 0.0030517578F;
            field3603 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field3605 = (int) (field3603 * 65536.0F);
        }
        if (this.field3601[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1627(arg0, 0, arg1);
        field3599[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1628(arg0, 0, arg1));
        field3599[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field3601[arg0]; var6++) {
            float var9 = this.method1627(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method1628(arg0, var6, arg1));
            float var11 = var9 * var9;
            field3599[arg0][var6 * 2 + 1] = field3599[arg0][var6 * 2 - 1] * var11;
            field3599[arg0][var6 * 2] = field3599[arg0][var6 * 2 - 1] * var10 + field3599[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field3599[arg0][var12] += field3599[arg0][var12 - 1] * var10 + field3599[arg0][var12 - 2] * var11;
            }
            field3599[arg0][1] += field3599[arg0][0] * var10 + var11;
            field3599[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field3601[0] * 2; var7++) {
                field3599[0][var7] *= field3603;
            }
        }
        for (int var8 = 0; var8 < this.field3601[arg0] * 2; var8++) {
            field3604[arg0][var8] = (int) (field3599[arg0][var8] * 65536.0F);
        }
        return this.field3601[arg0] * 2;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(F)F", line = 165)
    private static final float method1631(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }
}
