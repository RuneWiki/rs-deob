import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class89 {

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "[[[I")
    private int[][][] field1598 = new int[2][2][4];

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "[[[I")
    private int[][][] field1596 = new int[2][2][4];

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "[I")
    private int[] field1599 = new int[2];

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "[I")
    public int[] field1601 = new int[2];

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "[[I")
    public static int[][] field1594 = new int[2][8];

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "[[F")
    private static float[][] field1600 = new float[2][8];

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "F")
    private static float field1597;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IF)I")
    public final int method654(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1599[1] - this.field1599[0]) * arg1 + (float) this.field1599[0];
            float var4 = var3 * 0.0030517578F;
            field1597 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field1595 = (int) (field1597 * 65536.0F);
        }
        if (this.field1601[arg0] == 0) {
            return 0;
        }
        float var5 = this.method656(arg0, 0, arg1);
        field1600[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method659(arg0, 0, arg1));
        field1600[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1601[arg0]; var6++) {
            float var9 = this.method656(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method659(arg0, var6, arg1));
            float var11 = var9 * var9;
            field1600[arg0][var6 * 2 + 1] = field1600[arg0][var6 * 2 - 1] * var11;
            field1600[arg0][var6 * 2] = field1600[arg0][var6 * 2 - 1] * var10 + field1600[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field1600[arg0][var12] += field1600[arg0][var12 - 1] * var10 + field1600[arg0][var12 - 2] * var11;
            }
            field1600[arg0][1] += field1600[arg0][0] * var10 + var11;
            field1600[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field1601[0] * 2; var7++) {
                field1600[0][var7] *= field1597;
            }
        }
        for (int var8 = 0; var8 < this.field1601[arg0] * 2; var8++) {
            field1594[arg0][var8] = (int) (field1600[arg0][var8] * 65536.0F);
        }
        return this.field1601[arg0] * 2;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lgd;Leb;)V")
    public final void method655(class74 arg0, class239 arg1) {
        int var3 = arg0.method489((byte) -21);
        this.field1601[0] = var3 >> 4;
        this.field1601[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field1599[0] = this.field1599[1] = 0;
            return;
        }
        this.field1599[0] = arg0.method485(-2386);
        this.field1599[1] = arg0.method485(-2386);
        int var4 = arg0.method489((byte) -61);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field1601[var5]; var8++) {
                this.field1598[var5][0][var8] = arg0.method485(-2386);
                this.field1596[var5][0][var8] = arg0.method485(-2386);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field1601[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field1598[var6][1][var7] = this.field1598[var6][0][var7];
                    this.field1596[var6][1][var7] = this.field1596[var6][0][var7];
                } else {
                    this.field1598[var6][1][var7] = arg0.method485(-2386);
                    this.field1596[var6][1][var7] = arg0.method485(-2386);
                }
            }
        }
        if (var4 != 0 || this.field1599[1] != this.field1599[0]) {
            arg1.method1648(arg0);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIF)F")
    private final float method656(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1596[arg0][1][arg1] - this.field1596[arg0][0][arg1]) * arg2 + (float) this.field1596[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(F)F")
    private static final float method657(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "()V")
    public static void method658() {
        field1600 = null;
        field1594 = null;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(IIF)F")
    private final float method659(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1598[arg0][1][arg1] - this.field1598[arg0][0][arg1]) * arg2 + (float) this.field1598[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method657(var5);
    }
}
