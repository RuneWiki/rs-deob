import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class242 {

    @OriginalMember(owner = "client!af", name = "c", descriptor = "[[[I")
    private int[][][] field3826 = new int[2][2][4];

    @OriginalMember(owner = "client!af", name = "d", descriptor = "[I")
    public int[] field3827 = new int[2];

    @OriginalMember(owner = "client!af", name = "g", descriptor = "[[[I")
    private int[][][] field3830 = new int[2][2][4];

    @OriginalMember(owner = "client!af", name = "b", descriptor = "[I")
    private int[] field3825 = new int[2];

    @OriginalMember(owner = "client!af", name = "h", descriptor = "[[I")
    public static int[][] field3831 = new int[2][8];

    @OriginalMember(owner = "client!af", name = "e", descriptor = "[[F")
    private static float[][] field3828 = new float[2][8];

    @OriginalMember(owner = "client!af", name = "f", descriptor = "F")
    private static float field3829;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "I")
    public static int field3824;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIF)F", line = 15)
    private final float method1742(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3830[arg0][1][arg1] - this.field3830[arg0][0][arg1]) * arg2 + (float) this.field3830[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1747(var5);
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(IIF)F", line = 28)
    private final float method1743(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3826[arg0][1][arg1] - this.field3826[arg0][0][arg1]) * arg2 + (float) this.field3826[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IF)I", line = 39)
    public final int method1744(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field3825[1] - this.field3825[0]) * arg1 + (float) this.field3825[0];
            float var4 = var3 * 0.0030517578F;
            field3829 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field3824 = (int) (field3829 * 65536.0F);
        }
        if (this.field3827[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1743(arg0, 0, arg1);
        field3828[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1742(arg0, 0, arg1));
        field3828[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field3827[arg0]; var6++) {
            float var7 = this.method1743(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1742(arg0, var6, arg1));
            float var9 = var7 * var7;
            field3828[arg0][var6 * 2 + 1] = field3828[arg0][var6 * 2 - 1] * var9;
            field3828[arg0][var6 * 2] = field3828[arg0][var6 * 2 - 1] * var8 + field3828[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field3828[arg0][var10] += field3828[arg0][var10 - 1] * var8 + field3828[arg0][var10 - 2] * var9;
            }
            field3828[arg0][1] += field3828[arg0][0] * var8 + var9;
            field3828[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field3827[0] * 2; var11++) {
                field3828[0][var11] *= field3829;
            }
        }
        for (int var12 = 0; var12 < this.field3827[arg0] * 2; var12++) {
            field3831[arg0][var12] = (int) (field3828[arg0][var12] * 65536.0F);
        }
        return this.field3827[arg0] * 2;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Ljj;Lhd;)V", line = 100)
    public final void method1745(class44 arg0, class56 arg1) {
        int var3 = arg0.method286((byte) -106);
        this.field3827[0] = var3 >> 4;
        this.field3827[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field3825[0] = this.field3825[1] = 0;
            return;
        }
        this.field3825[0] = arg0.method271(21081);
        this.field3825[1] = arg0.method271(21081);
        int var4 = arg0.method286((byte) -102);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field3827[var5]; var6++) {
                this.field3830[var5][0][var6] = arg0.method271(21081);
                this.field3826[var5][0][var6] = arg0.method271(21081);
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field3827[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field3830[var7][1][var8] = this.field3830[var7][0][var8];
                    this.field3826[var7][1][var8] = this.field3826[var7][0][var8];
                } else {
                    this.field3830[var7][1][var8] = arg0.method271(21081);
                    this.field3826[var7][1][var8] = arg0.method271(21081);
                }
            }
        }
        if (var4 != 0 || this.field3825[1] != this.field3825[0]) {
            arg1.method357(arg0);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "()V", line = 165)
    public static void method1746() {
        field3828 = (float[][]) null;
        field3831 = (int[][]) null;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(F)F", line = 179)
    private static final float method1747(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }
}
