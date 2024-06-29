import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class48 {

    @OriginalMember(owner = "client!i", name = "h", descriptor = "[I")
    private int[] field1178 = new int[2];

    @OriginalMember(owner = "client!i", name = "f", descriptor = "[[[I")
    private int[][][] field1176 = new int[2][2][4];

    @OriginalMember(owner = "client!i", name = "c", descriptor = "[I")
    public int[] field1173 = new int[2];

    @OriginalMember(owner = "client!i", name = "g", descriptor = "[[[I")
    private int[][][] field1177 = new int[2][2][4];

    @OriginalMember(owner = "client!i", name = "a", descriptor = "[[I")
    public static int[][] field1171 = new int[2][8];

    @OriginalMember(owner = "client!i", name = "e", descriptor = "[[F")
    private static float[][] field1175 = new float[2][8];

    @OriginalMember(owner = "client!i", name = "d", descriptor = "F")
    private static float field1174;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IF)I", line = 3)
    public final int method363(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1178[1] - this.field1178[0]) * arg1 + (float) this.field1178[0];
            float var4 = var3 * 0.0030517578F;
            field1174 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field1172 = (int) (field1174 * 65536.0F);
        }
        if (this.field1173[arg0] == 0) {
            return 0;
        }
        float var5 = this.method365(arg0, 0, arg1);
        field1175[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method368(arg0, 0, arg1));
        field1175[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1173[arg0]; var6++) {
            float var9 = this.method365(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method368(arg0, var6, arg1));
            float var11 = var9 * var9;
            field1175[arg0][var6 * 2 + 1] = field1175[arg0][var6 * 2 - 1] * var11;
            field1175[arg0][var6 * 2] = field1175[arg0][var6 * 2 - 1] * var10 + field1175[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field1175[arg0][var12] += field1175[arg0][var12 - 1] * var10 + field1175[arg0][var12 - 2] * var11;
            }
            field1175[arg0][1] += field1175[arg0][0] * var10 + var11;
            field1175[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field1173[0] * 2; var7++) {
                field1175[0][var7] *= field1174;
            }
        }
        for (int var8 = 0; var8 < this.field1173[arg0] * 2; var8++) {
            field1171[arg0][var8] = (int) (field1175[arg0][var8] * 65536.0F);
        }
        return this.field1173[arg0] * 2;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(F)F", line = 63)
    private static final float method364(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIF)F", line = 72)
    private final float method365(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1176[arg0][1][arg1] - this.field1176[arg0][0][arg1]) * arg2 + (float) this.field1176[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lka;Ldc;)V", line = 90)
    public final void method366(class61 arg0, class22 arg1) {
        int var3 = arg0.method494(20471);
        this.field1173[0] = var3 >> 4;
        this.field1173[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field1178[0] = this.field1178[1] = 0;
            return;
        }
        this.field1178[0] = arg0.method507((byte) -38);
        this.field1178[1] = arg0.method507((byte) -55);
        int var4 = arg0.method494(20471);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field1173[var5]; var8++) {
                this.field1177[var5][0][var8] = arg0.method507((byte) -26);
                this.field1176[var5][0][var8] = arg0.method507((byte) -115);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field1173[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field1177[var6][1][var7] = this.field1177[var6][0][var7];
                    this.field1176[var6][1][var7] = this.field1176[var6][0][var7];
                } else {
                    this.field1177[var6][1][var7] = arg0.method507((byte) -91);
                    this.field1176[var6][1][var7] = arg0.method507((byte) -32);
                }
            }
        }
        if (var4 != 0 || this.field1178[1] != this.field1178[0]) {
            arg1.method155(arg0);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "()V", line = 159)
    public static void method367() {
        field1175 = null;
        field1171 = null;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(IIF)F", line = 164)
    private final float method368(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1177[arg0][1][arg1] - this.field1177[arg0][0][arg1]) * arg2 + (float) this.field1177[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method364(var5);
    }
}
