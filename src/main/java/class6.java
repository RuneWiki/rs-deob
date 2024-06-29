import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class6 {

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "[I")
    private int[] field80 = new int[2];

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "[[[I")
    private int[][][] field84 = new int[2][2][4];

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "[I")
    public int[] field81 = new int[2];

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "[[[I")
    private int[][][] field86 = new int[2][2][4];

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "[[I")
    public static int[][] field82 = new int[2][8];

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "[[F")
    private static float[][] field85 = new float[2][8];

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "F")
    private static float field83;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lid;Lga;)V")
    public final void method55(class60 arg0, class44 arg1) {
        int var3 = arg0.method462((byte) 116);
        this.field81[0] = var3 >> 4;
        this.field81[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field80[0] = this.field80[1] = 0;
            return;
        }
        this.field80[0] = arg0.method467(255);
        this.field80[1] = arg0.method467(255);
        int var4 = arg0.method462((byte) 116);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field81[var5]; var8++) {
                this.field84[var5][0][var8] = arg0.method467(255);
                this.field86[var5][0][var8] = arg0.method467(255);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field81[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field84[var6][1][var7] = this.field84[var6][0][var7];
                    this.field86[var6][1][var7] = this.field86[var6][0][var7];
                } else {
                    this.field84[var6][1][var7] = arg0.method467(255);
                    this.field86[var6][1][var7] = arg0.method467(255);
                }
            }
        }
        if (var4 != 0 || this.field80[1] != this.field80[0]) {
            arg1.method312(arg0);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIF)F")
    private final float method56(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field84[arg0][1][arg1] - this.field84[arg0][0][arg1]) * arg2 + (float) this.field84[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method59(var5);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IF)I")
    public final int method57(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field80[1] - this.field80[0]) * arg1 + (float) this.field80[0];
            float var4 = var3 * 0.0030517578F;
            field83 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field87 = (int) (field83 * 65536.0F);
        }
        if (this.field81[arg0] == 0) {
            return 0;
        }
        float var5 = this.method58(arg0, 0, arg1);
        field85[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method56(arg0, 0, arg1));
        field85[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field81[arg0]; var6++) {
            float var9 = this.method58(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method56(arg0, var6, arg1));
            float var11 = var9 * var9;
            field85[arg0][var6 * 2 + 1] = field85[arg0][var6 * 2 - 1] * var11;
            field85[arg0][var6 * 2] = field85[arg0][var6 * 2 - 1] * var10 + field85[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field85[arg0][var12] += field85[arg0][var12 - 1] * var10 + field85[arg0][var12 - 2] * var11;
            }
            field85[arg0][1] += field85[arg0][0] * var10 + var11;
            field85[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field81[0] * 2; var7++) {
                field85[0][var7] *= field83;
            }
        }
        for (int var8 = 0; var8 < this.field81[arg0] * 2; var8++) {
            field82[arg0][var8] = (int) (field85[arg0][var8] * 65536.0F);
        }
        return this.field81[arg0] * 2;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(IIF)F")
    private final float method58(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field86[arg0][1][arg1] - this.field86[arg0][0][arg1]) * arg2 + (float) this.field86[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(F)F")
    private static final float method59(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "()V")
    public static void method60() {
        field85 = null;
        field82 = null;
    }
}
