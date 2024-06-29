import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class104 {

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "[I")
    private int[] field1696 = new int[2];

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "[[[I")
    private int[][][] field1694 = new int[2][2][4];

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "[I")
    public int[] field1700 = new int[2];

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "[[[I")
    private int[][][] field1701 = new int[2][2][4];

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "[[I")
    public static int[][] field1697 = new int[2][8];

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "[[F")
    private static float[][] field1698 = new float[2][8];

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "F")
    private static float field1695;

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIF)F", line = 8)
    private final float method991(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1694[arg0][1][arg1] - this.field1694[arg0][0][arg1]) * arg2 + (float) this.field1694[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IF)I", line = 21)
    public final int method992(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1696[1] - this.field1696[0]) * arg1 + (float) this.field1696[0];
            float var4 = var3 * 0.0030517578F;
            field1695 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field1699 = (int) (field1695 * 65536.0F);
        }
        if (this.field1700[arg0] == 0) {
            return 0;
        }
        float var5 = this.method991(arg0, 0, arg1);
        field1698[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method994(arg0, 0, arg1));
        field1698[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1700[arg0]; var6++) {
            float var9 = this.method991(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method994(arg0, var6, arg1));
            float var11 = var9 * var9;
            field1698[arg0][var6 * 2 + 1] = field1698[arg0][var6 * 2 - 1] * var11;
            field1698[arg0][var6 * 2] = field1698[arg0][var6 * 2 - 1] * var10 + field1698[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field1698[arg0][var12] += field1698[arg0][var12 - 1] * var10 + field1698[arg0][var12 - 2] * var11;
            }
            field1698[arg0][1] += field1698[arg0][0] * var10 + var11;
            field1698[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field1700[0] * 2; var7++) {
                field1698[0][var7] *= field1695;
            }
        }
        for (int var8 = 0; var8 < this.field1700[arg0] * 2; var8++) {
            field1697[arg0][var8] = (int) (field1698[arg0][var8] * 65536.0F);
        }
        return this.field1700[arg0] * 2;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "()V", line = 80)
    public static void method993() {
        field1698 = null;
        field1697 = null;
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(IIF)F", line = 86)
    private final float method994(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1701[arg0][1][arg1] - this.field1701[arg0][0][arg1]) * arg2 + (float) this.field1701[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method996(var5);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lie;Llea;)V", line = 97)
    public final void method995(class6 arg0, class569 arg1) {
        int var3 = arg0.method70(-9059);
        this.field1700[0] = var3 >> 4;
        this.field1700[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field1696[0] = this.field1696[1] = 0;
            return;
        }
        this.field1696[0] = arg0.method67(12021);
        this.field1696[1] = arg0.method67(12021);
        int var4 = arg0.method70(-9059);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field1700[var5]; var8++) {
                this.field1701[var5][0][var8] = arg0.method67(12021);
                this.field1694[var5][0][var8] = arg0.method67(12021);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field1700[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field1701[var6][1][var7] = this.field1701[var6][0][var7];
                    this.field1694[var6][1][var7] = this.field1694[var6][0][var7];
                } else {
                    this.field1701[var6][1][var7] = arg0.method67(12021);
                    this.field1694[var6][1][var7] = arg0.method67(12021);
                }
            }
        }
        if (var4 != 0 || this.field1696[1] != this.field1696[0]) {
            arg1.method3361(arg0);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(F)F", line = 167)
    private static final float method996(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }
}
