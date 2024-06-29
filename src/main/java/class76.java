import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class76 {

    @OriginalMember(owner = "client!md", name = "c", descriptor = "[[[I")
    private int[][][] field1638 = new int[2][2][4];

    @OriginalMember(owner = "client!md", name = "d", descriptor = "[[[I")
    private int[][][] field1639 = new int[2][2][4];

    @OriginalMember(owner = "client!md", name = "h", descriptor = "[I")
    public int[] field1643 = new int[2];

    @OriginalMember(owner = "client!md", name = "g", descriptor = "[I")
    private int[] field1642 = new int[2];

    @OriginalMember(owner = "client!md", name = "a", descriptor = "[[F")
    private static float[][] field1636 = new float[2][8];

    @OriginalMember(owner = "client!md", name = "f", descriptor = "[[I")
    public static int[][] field1641 = new int[2][8];

    @OriginalMember(owner = "client!md", name = "e", descriptor = "F")
    private static float field1640;

    @OriginalMember(owner = "client!md", name = "b", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "()V", line = 3)
    public static void method567() {
        field1636 = null;
        field1641 = null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIF)F", line = 8)
    private final float method568(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1638[arg0][1][arg1] - this.field1638[arg0][0][arg1]) * arg2 + (float) this.field1638[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method570(var5);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Leb;Lie;)V", line = 27)
    public final void method569(class27 arg0, class53 arg1) {
        int var3 = arg0.method231(255);
        this.field1643[0] = var3 >> 4;
        this.field1643[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field1642[0] = this.field1642[1] = 0;
            return;
        }
        this.field1642[0] = arg0.method227(127);
        this.field1642[1] = arg0.method227(127);
        int var4 = arg0.method231(255);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field1643[var5]; var8++) {
                this.field1638[var5][0][var8] = arg0.method227(127);
                this.field1639[var5][0][var8] = arg0.method227(127);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field1643[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field1638[var6][1][var7] = this.field1638[var6][0][var7];
                    this.field1639[var6][1][var7] = this.field1639[var6][0][var7];
                } else {
                    this.field1638[var6][1][var7] = arg0.method227(127);
                    this.field1639[var6][1][var7] = arg0.method227(127);
                }
            }
        }
        if (var4 != 0 || this.field1642[1] != this.field1642[0]) {
            arg1.method452(arg0);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(F)F", line = 93)
    private static final float method570(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(IIF)F", line = 100)
    private final float method571(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1639[arg0][1][arg1] - this.field1639[arg0][0][arg1]) * arg2 + (float) this.field1639[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IF)I", line = 112)
    public final int method572(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1642[1] - this.field1642[0]) * arg1 + (float) this.field1642[0];
            float var4 = var3 * 0.0030517578F;
            field1640 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field1637 = (int) (field1640 * 65536.0F);
        }
        if (this.field1643[arg0] == 0) {
            return 0;
        }
        float var5 = this.method571(arg0, 0, arg1);
        field1636[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method568(arg0, 0, arg1));
        field1636[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1643[arg0]; var6++) {
            float var9 = this.method571(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method568(arg0, var6, arg1));
            float var11 = var9 * var9;
            field1636[arg0][var6 * 2 + 1] = field1636[arg0][var6 * 2 - 1] * var11;
            field1636[arg0][var6 * 2] = field1636[arg0][var6 * 2 - 1] * var10 + field1636[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field1636[arg0][var12] += field1636[arg0][var12 - 1] * var10 + field1636[arg0][var12 - 2] * var11;
            }
            field1636[arg0][1] += field1636[arg0][0] * var10 + var11;
            field1636[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field1643[0] * 2; var7++) {
                field1636[0][var7] *= field1640;
            }
        }
        for (int var8 = 0; var8 < this.field1643[arg0] * 2; var8++) {
            field1641[arg0][var8] = (int) (field1636[arg0][var8] * 65536.0F);
        }
        return this.field1643[arg0] * 2;
    }
}
