import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class81 {

    @OriginalMember(owner = "client!le", name = "d", descriptor = "[I")
    private int[] field1997 = new int[2];

    @OriginalMember(owner = "client!le", name = "e", descriptor = "[[[I")
    private int[][][] field1998 = new int[2][2][4];

    @OriginalMember(owner = "client!le", name = "h", descriptor = "[I")
    public int[] field2001 = new int[2];

    @OriginalMember(owner = "client!le", name = "f", descriptor = "[[[I")
    private int[][][] field1999 = new int[2][2][4];

    @OriginalMember(owner = "client!le", name = "a", descriptor = "[[I")
    public static int[][] field1994 = new int[2][8];

    @OriginalMember(owner = "client!le", name = "c", descriptor = "[[F")
    private static float[][] field1996 = new float[2][8];

    @OriginalMember(owner = "client!le", name = "g", descriptor = "F")
    private static float field2000;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIF)F")
    private final float method683(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1999[arg0][1][arg1] - this.field1999[arg0][0][arg1]) * arg2 + (float) this.field1999[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method688(var5);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IF)I")
    public final int method684(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1997[1] - this.field1997[0]) * arg1 + (float) this.field1997[0];
            float var4 = var3 * 0.0030517578F;
            field2000 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field1995 = (int) (field2000 * 65536.0F);
        }
        if (this.field2001[arg0] == 0) {
            return 0;
        }
        float var5 = this.method685(arg0, 0, arg1);
        field1996[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method683(arg0, 0, arg1));
        field1996[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field2001[arg0]; var6++) {
            float var9 = this.method685(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method683(arg0, var6, arg1));
            float var11 = var9 * var9;
            field1996[arg0][var6 * 2 + 1] = field1996[arg0][var6 * 2 - 1] * var11;
            field1996[arg0][var6 * 2] = field1996[arg0][var6 * 2 - 1] * var10 + field1996[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field1996[arg0][var12] += field1996[arg0][var12 - 1] * var10 + field1996[arg0][var12 - 2] * var11;
            }
            field1996[arg0][1] += field1996[arg0][0] * var10 + var11;
            field1996[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field2001[0] * 2; var7++) {
                field1996[0][var7] *= field2000;
            }
        }
        for (int var8 = 0; var8 < this.field2001[arg0] * 2; var8++) {
            field1994[arg0][var8] = (int) (field1996[arg0][var8] * 65536.0F);
        }
        return this.field2001[arg0] * 2;
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(IIF)F")
    private final float method685(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1998[arg0][1][arg1] - this.field1998[arg0][0][arg1]) * arg2 + (float) this.field1998[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Lhb;Lgb;)V")
    public final void method686(class51 arg0, class45 arg1) {
        int var3 = arg0.method373(25094);
        this.field2001[0] = var3 >> 4;
        this.field2001[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field1997[0] = this.field1997[1] = 0;
            return;
        }
        this.field1997[0] = arg0.method383(-2056200760);
        this.field1997[1] = arg0.method383(-2056200760);
        int var4 = arg0.method373(25094);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field2001[var5]; var8++) {
                this.field1999[var5][0][var8] = arg0.method383(-2056200760);
                this.field1998[var5][0][var8] = arg0.method383(-2056200760);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field2001[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field1999[var6][1][var7] = this.field1999[var6][0][var7];
                    this.field1998[var6][1][var7] = this.field1998[var6][0][var7];
                } else {
                    this.field1999[var6][1][var7] = arg0.method383(-2056200760);
                    this.field1998[var6][1][var7] = arg0.method383(-2056200760);
                }
            }
        }
        if (var4 != 0 || this.field1997[1] != this.field1997[0]) {
            arg1.method325(arg0);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "()V")
    public static void method687() {
        field1996 = null;
        field1994 = null;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(F)F")
    private static final float method688(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }
}
