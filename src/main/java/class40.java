import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vba")
public class class40 {

    @OriginalMember(owner = "client!vba", name = "b", descriptor = "[I")
    public int[] field489 = new int[2];

    @OriginalMember(owner = "client!vba", name = "c", descriptor = "[I")
    private int[] field490 = new int[2];

    @OriginalMember(owner = "client!vba", name = "g", descriptor = "[[[I")
    private int[][][] field494 = new int[2][2][4];

    @OriginalMember(owner = "client!vba", name = "d", descriptor = "[[[I")
    private int[][][] field491 = new int[2][2][4];

    @OriginalMember(owner = "client!vba", name = "e", descriptor = "[[F")
    private static float[][] field492 = new float[2][8];

    @OriginalMember(owner = "client!vba", name = "f", descriptor = "[[I")
    public static int[][] field493 = new int[2][8];

    @OriginalMember(owner = "client!vba", name = "h", descriptor = "F")
    private static float field495;

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(IF)I")
    public final int method269(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field490[1] - this.field490[0]) * arg1 + (float) this.field490[0];
            float var4 = var3 * 0.0030517578F;
            field495 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field488 = (int) (field495 * 65536.0F);
        }
        if (this.field489[arg0] == 0) {
            return 0;
        }
        float var5 = this.method270(arg0, 0, arg1);
        field492[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method271(arg0, 0, arg1));
        field492[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field489[arg0]; var6++) {
            float var9 = this.method270(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method271(arg0, var6, arg1));
            float var11 = var9 * var9;
            field492[arg0][var6 * 2 + 1] = field492[arg0][var6 * 2 - 1] * var11;
            field492[arg0][var6 * 2] = field492[arg0][var6 * 2 - 1] * var10 + field492[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field492[arg0][var12] += field492[arg0][var12 - 1] * var10 + field492[arg0][var12 - 2] * var11;
            }
            field492[arg0][1] += field492[arg0][0] * var10 + var11;
            field492[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field489[0] * 2; var7++) {
                field492[0][var7] *= field495;
            }
        }
        for (int var8 = 0; var8 < this.field489[arg0] * 2; var8++) {
            field493[arg0][var8] = (int) (field492[arg0][var8] * 65536.0F);
        }
        return this.field489[arg0] * 2;
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(IIF)F")
    private final float method270(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field494[arg0][1][arg1] - this.field494[arg0][0][arg1]) * arg2 + (float) this.field494[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!vba", name = "b", descriptor = "(IIF)F")
    private final float method271(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field491[arg0][1][arg1] - this.field491[arg0][0][arg1]) * arg2 + (float) this.field491[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method273(var5);
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(Lee;Ljga;)V")
    public final void method272(class675 arg0, class715 arg1) {
        int var3 = arg0.method3750((byte) 35);
        this.field489[0] = var3 >> 4;
        this.field489[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field490[0] = this.field490[1] = 0;
            return;
        }
        this.field490[0] = arg0.method3757((byte) -65);
        this.field490[1] = arg0.method3757((byte) -65);
        int var4 = arg0.method3750((byte) 35);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field489[var5]; var8++) {
                this.field491[var5][0][var8] = arg0.method3757((byte) -65);
                this.field494[var5][0][var8] = arg0.method3757((byte) -65);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field489[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field491[var6][1][var7] = this.field491[var6][0][var7];
                    this.field494[var6][1][var7] = this.field494[var6][0][var7];
                } else {
                    this.field491[var6][1][var7] = arg0.method3757((byte) -65);
                    this.field494[var6][1][var7] = arg0.method3757((byte) -65);
                }
            }
        }
        if (var4 != 0 || this.field490[1] != this.field490[0]) {
            arg1.method4032(arg0);
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(F)F")
    private static final float method273(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "()V")
    public static void method274() {
        field492 = null;
        field493 = null;
    }
}
