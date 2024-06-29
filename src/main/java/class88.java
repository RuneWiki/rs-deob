import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class88 {

    @OriginalMember(owner = "client!od", name = "a", descriptor = "[I")
    private int[] field2001 = new int[2];

    @OriginalMember(owner = "client!od", name = "d", descriptor = "[I")
    public int[] field2004 = new int[2];

    @OriginalMember(owner = "client!od", name = "e", descriptor = "[[[I")
    private int[][][] field2005 = new int[2][2][4];

    @OriginalMember(owner = "client!od", name = "b", descriptor = "[[[I")
    private int[][][] field2002 = new int[2][2][4];

    @OriginalMember(owner = "client!od", name = "f", descriptor = "[[I")
    public static int[][] field2006 = new int[2][8];

    @OriginalMember(owner = "client!od", name = "g", descriptor = "[[F")
    private static float[][] field2007 = new float[2][8];

    @OriginalMember(owner = "client!od", name = "c", descriptor = "F")
    private static float field2003;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Ltc;Lae;)V", line = 4)
    public final void method604(class113 arg0, class6 arg1) {
        int var3 = arg0.method821(true);
        this.field2004[0] = var3 >> 4;
        this.field2004[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field2001[0] = this.field2001[1] = 0;
            return;
        }
        this.field2001[0] = arg0.method870(-1);
        this.field2001[1] = arg0.method870(-1);
        int var4 = arg0.method821(true);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field2004[var5]; var8++) {
                this.field2002[var5][0][var8] = arg0.method870(-1);
                this.field2005[var5][0][var8] = arg0.method870(-1);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field2004[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field2002[var6][1][var7] = this.field2002[var6][0][var7];
                    this.field2005[var6][1][var7] = this.field2005[var6][0][var7];
                } else {
                    this.field2002[var6][1][var7] = arg0.method870(-1);
                    this.field2005[var6][1][var7] = arg0.method870(-1);
                }
            }
        }
        if (var4 != 0 || this.field2001[1] != this.field2001[0]) {
            arg1.method39(arg0);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(F)F", line = 78)
    private static final float method605(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "()V", line = 84)
    public static void method606() {
        field2007 = null;
        field2006 = null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IF)I", line = 89)
    public final int method607(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field2001[1] - this.field2001[0]) * arg1 + (float) this.field2001[0];
            float var4 = var3 * 0.0030517578F;
            field2003 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field2008 = (int) (field2003 * 65536.0F);
        }
        if (this.field2004[arg0] == 0) {
            return 0;
        }
        float var5 = this.method608(arg0, 0, arg1);
        field2007[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method609(arg0, 0, arg1));
        field2007[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field2004[arg0]; var6++) {
            float var9 = this.method608(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method609(arg0, var6, arg1));
            float var11 = var9 * var9;
            field2007[arg0][var6 * 2 + 1] = field2007[arg0][var6 * 2 - 1] * var11;
            field2007[arg0][var6 * 2] = field2007[arg0][var6 * 2 - 1] * var10 + field2007[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field2007[arg0][var12] += field2007[arg0][var12 - 1] * var10 + field2007[arg0][var12 - 2] * var11;
            }
            field2007[arg0][1] += field2007[arg0][0] * var10 + var11;
            field2007[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field2004[0] * 2; var7++) {
                field2007[0][var7] *= field2003;
            }
        }
        for (int var8 = 0; var8 < this.field2004[arg0] * 2; var8++) {
            field2006[arg0][var8] = (int) (field2007[arg0][var8] * 65536.0F);
        }
        return this.field2004[arg0] * 2;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIF)F", line = 150)
    private final float method608(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2005[arg0][1][arg1] - this.field2005[arg0][0][arg1]) * arg2 + (float) this.field2005[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(IIF)F", line = 166)
    private final float method609(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2002[arg0][1][arg1] - this.field2002[arg0][0][arg1]) * arg2 + (float) this.field2002[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method605(var5);
    }
}
