import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class544 {

    @OriginalMember(owner = "client!md", name = "a", descriptor = "[[[I")
    private int[][][] field7695 = new int[2][2][4];

    @OriginalMember(owner = "client!md", name = "b", descriptor = "[[[I")
    private int[][][] field7696 = new int[2][2][4];

    @OriginalMember(owner = "client!md", name = "e", descriptor = "[I")
    public int[] field7699 = new int[2];

    @OriginalMember(owner = "client!md", name = "h", descriptor = "[I")
    private int[] field7702 = new int[2];

    @OriginalMember(owner = "client!md", name = "c", descriptor = "[[F")
    private static float[][] field7697 = new float[2][8];

    @OriginalMember(owner = "client!md", name = "f", descriptor = "[[I")
    public static int[][] field7700 = new int[2][8];

    @OriginalMember(owner = "client!md", name = "d", descriptor = "F")
    private static float field7698;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "I")
    public static int field7701;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Lji;Lnj;)V")
    public final void method3087(class611 arg0, class248 arg1) {
        int var3 = arg0.method3428((byte) -126);
        this.field7699[0] = var3 >> 4;
        this.field7699[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field7702[0] = this.field7702[1] = 0;
            return;
        }
        this.field7702[0] = arg0.method3402((byte) 127);
        this.field7702[1] = arg0.method3402((byte) 127);
        int var4 = arg0.method3428((byte) -116);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field7699[var5]; var8++) {
                this.field7695[var5][0][var8] = arg0.method3402((byte) 127);
                this.field7696[var5][0][var8] = arg0.method3402((byte) 127);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field7699[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field7695[var6][1][var7] = this.field7695[var6][0][var7];
                    this.field7696[var6][1][var7] = this.field7696[var6][0][var7];
                } else {
                    this.field7695[var6][1][var7] = arg0.method3402((byte) 127);
                    this.field7696[var6][1][var7] = arg0.method3402((byte) 127);
                }
            }
        }
        if (var4 != 0 || this.field7702[1] != this.field7702[0]) {
            arg1.method1489(arg0);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IF)I")
    public final int method3088(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field7702[1] - this.field7702[0]) * arg1 + (float) this.field7702[0];
            float var4 = var3 * 0.0030517578F;
            field7698 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field7701 = (int) (field7698 * 65536.0F);
        }
        if (this.field7699[arg0] == 0) {
            return 0;
        }
        float var5 = this.method3092(arg0, 0, arg1);
        field7697[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method3090(arg0, 0, arg1));
        field7697[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field7699[arg0]; var6++) {
            float var9 = this.method3092(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method3090(arg0, var6, arg1));
            float var11 = var9 * var9;
            field7697[arg0][var6 * 2 + 1] = field7697[arg0][var6 * 2 - 1] * var11;
            field7697[arg0][var6 * 2] = field7697[arg0][var6 * 2 - 1] * var10 + field7697[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field7697[arg0][var12] += field7697[arg0][var12 - 1] * var10 + field7697[arg0][var12 - 2] * var11;
            }
            field7697[arg0][1] += field7697[arg0][0] * var10 + var11;
            field7697[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field7699[0] * 2; var7++) {
                field7697[0][var7] *= field7698;
            }
        }
        for (int var8 = 0; var8 < this.field7699[arg0] * 2; var8++) {
            field7700[arg0][var8] = (int) (field7697[arg0][var8] * 65536.0F);
        }
        return this.field7699[arg0] * 2;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "()V")
    public static void method3089() {
        field7697 = null;
        field7700 = null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIF)F")
    private final float method3090(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field7695[arg0][1][arg1] - this.field7695[arg0][0][arg1]) * arg2 + (float) this.field7695[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method3091(var5);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(F)F")
    private static final float method3091(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(IIF)F")
    private final float method3092(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field7696[arg0][1][arg1] - this.field7696[arg0][0][arg1]) * arg2 + (float) this.field7696[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }
}
