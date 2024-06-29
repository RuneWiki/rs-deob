import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class242 {

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "[I")
    private int[] field3601 = new int[2];

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "[[[I")
    private int[][][] field3606 = new int[2][2][4];

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "[I")
    public int[] field3607 = new int[2];

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "[[[I")
    private int[][][] field3608 = new int[2][2][4];

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "[[I")
    public static int[][] field3603 = new int[2][8];

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "[[F")
    private static float[][] field3605 = new float[2][8];

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "F")
    private static float field3604;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(F)F", line = 6)
    private static final float method1778(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lsb;Lgn;)V", line = 16)
    public final void method1779(class190 arg0, class271 arg1) {
        int var3 = arg0.method1319(255);
        this.field3607[0] = var3 >> 4;
        this.field3607[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field3601[0] = this.field3601[1] = 0;
            return;
        }
        this.field3601[0] = arg0.method1317((byte) 51);
        this.field3601[1] = arg0.method1317((byte) 120);
        int var4 = arg0.method1319(255);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field3607[var5]; var6++) {
                this.field3606[var5][0][var6] = arg0.method1317((byte) 94);
                this.field3608[var5][0][var6] = arg0.method1317((byte) 23);
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field3607[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field3606[var7][1][var8] = this.field3606[var7][0][var8];
                    this.field3608[var7][1][var8] = this.field3608[var7][0][var8];
                } else {
                    this.field3606[var7][1][var8] = arg0.method1317((byte) 8);
                    this.field3608[var7][1][var8] = arg0.method1317((byte) 56);
                }
            }
        }
        if (var4 != 0 || this.field3601[1] != this.field3601[0]) {
            arg1.method1998(arg0);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IF)I", line = 83)
    public final int method1780(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field3601[1] - this.field3601[0]) * arg1 + (float) this.field3601[0];
            float var4 = var3 * 0.0030517578F;
            field3604 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field3602 = (int) (field3604 * 65536.0F);
        }
        if (this.field3607[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1781(arg0, 0, arg1);
        field3605[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1782(arg0, 0, arg1));
        field3605[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field3607[arg0]; var6++) {
            float var7 = this.method1781(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1782(arg0, var6, arg1));
            float var9 = var7 * var7;
            field3605[arg0][var6 * 2 + 1] = field3605[arg0][var6 * 2 - 1] * var9;
            field3605[arg0][var6 * 2] = field3605[arg0][var6 * 2 - 1] * var8 + field3605[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field3605[arg0][var10] += field3605[arg0][var10 - 1] * var8 + field3605[arg0][var10 - 2] * var9;
            }
            field3605[arg0][1] += field3605[arg0][0] * var8 + var9;
            field3605[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field3607[0] * 2; var11++) {
                field3605[0][var11] *= field3604;
            }
        }
        for (int var12 = 0; var12 < this.field3607[arg0] * 2; var12++) {
            field3603[arg0][var12] = (int) (field3605[arg0][var12] * 65536.0F);
        }
        return this.field3607[arg0] * 2;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIF)F", line = 149)
    private final float method1781(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3608[arg0][1][arg1] - this.field3608[arg0][0][arg1]) * arg2 + (float) this.field3608[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(IIF)F", line = 158)
    private final float method1782(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3606[arg0][1][arg1] - this.field3606[arg0][0][arg1]) * arg2 + (float) this.field3606[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1778(var5);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "()V", line = 174)
    public static void method1783() {
        field3605 = (float[][]) null;
        field3603 = (int[][]) null;
    }
}
