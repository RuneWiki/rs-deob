import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class147 {

    @OriginalMember(owner = "client!vr", name = "d", descriptor = "[[[I")
    private int[][][] field1983 = new int[2][2][4];

    @OriginalMember(owner = "client!vr", name = "g", descriptor = "[[[I")
    private int[][][] field1986 = new int[2][2][4];

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "[I")
    public int[] field1982 = new int[2];

    @OriginalMember(owner = "client!vr", name = "h", descriptor = "[I")
    private int[] field1987 = new int[2];

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "[[F")
    private static float[][] field1980 = new float[2][8];

    @OriginalMember(owner = "client!vr", name = "e", descriptor = "[[I")
    public static int[][] field1984 = new int[2][8];

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "F")
    private static float field1981;

    @OriginalMember(owner = "client!vr", name = "f", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Ldt;Lgo;)V")
    public final void method1033(class254 arg0, class653 arg1) {
        int var3 = arg0.method1731((byte) 64);
        this.field1982[0] = var3 >> 4;
        this.field1982[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field1987[0] = this.field1987[1] = 0;
            return;
        }
        this.field1987[0] = arg0.method1728((byte) 16);
        this.field1987[1] = arg0.method1728((byte) 94);
        int var4 = arg0.method1731((byte) 64);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field1982[var5]; var8++) {
                this.field1986[var5][0][var8] = arg0.method1728((byte) 43);
                this.field1983[var5][0][var8] = arg0.method1728((byte) 32);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field1982[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field1986[var6][1][var7] = this.field1986[var6][0][var7];
                    this.field1983[var6][1][var7] = this.field1983[var6][0][var7];
                } else {
                    this.field1986[var6][1][var7] = arg0.method1728((byte) 40);
                    this.field1983[var6][1][var7] = arg0.method1728((byte) 15);
                }
            }
        }
        if (var4 != 0 || this.field1987[1] != this.field1987[0]) {
            arg1.method3634(arg0);
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IF)I")
    public final int method1034(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1987[1] - this.field1987[0]) * arg1 + (float) this.field1987[0];
            float var4 = var3 * 0.0030517578F;
            field1981 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field1985 = (int) (field1981 * 65536.0F);
        }
        if (this.field1982[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1036(arg0, 0, arg1);
        field1980[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1038(arg0, 0, arg1));
        field1980[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1982[arg0]; var6++) {
            float var9 = this.method1036(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method1038(arg0, var6, arg1));
            float var11 = var9 * var9;
            field1980[arg0][var6 * 2 + 1] = field1980[arg0][var6 * 2 - 1] * var11;
            field1980[arg0][var6 * 2] = field1980[arg0][var6 * 2 - 1] * var10 + field1980[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field1980[arg0][var12] += field1980[arg0][var12 - 1] * var10 + field1980[arg0][var12 - 2] * var11;
            }
            field1980[arg0][1] += field1980[arg0][0] * var10 + var11;
            field1980[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field1982[0] * 2; var7++) {
                field1980[0][var7] *= field1981;
            }
        }
        for (int var8 = 0; var8 < this.field1982[arg0] * 2; var8++) {
            field1984[arg0][var8] = (int) (field1980[arg0][var8] * 65536.0F);
        }
        return this.field1982[arg0] * 2;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "()V")
    public static void method1035() {
        field1980 = null;
        field1984 = null;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIF)F")
    private final float method1036(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1983[arg0][1][arg1] - this.field1983[arg0][0][arg1]) * arg2 + (float) this.field1983[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(F)F")
    private static final float method1037(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(IIF)F")
    private final float method1038(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1986[arg0][1][arg1] - this.field1986[arg0][0][arg1]) * arg2 + (float) this.field1986[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1037(var5);
    }
}
