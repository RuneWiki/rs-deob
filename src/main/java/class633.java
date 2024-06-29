import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class633 {

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "[I")
    public int[] field8969 = new int[2];

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "[[[I")
    private int[][][] field8973 = new int[2][2][4];

    @OriginalMember(owner = "client!bm", name = "f", descriptor = "[[[I")
    private int[][][] field8974 = new int[2][2][4];

    @OriginalMember(owner = "client!bm", name = "h", descriptor = "[I")
    private int[] field8976 = new int[2];

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "[[F")
    private static float[][] field8970 = new float[2][8];

    @OriginalMember(owner = "client!bm", name = "g", descriptor = "[[I")
    public static int[][] field8975 = new int[2][8];

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "F")
    private static float field8971;

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "I")
    public static int field8972;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IF)I")
    public final int method3566(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field8976[1] - this.field8976[0]) * arg1 + (float) this.field8976[0];
            float var4 = var3 * 0.0030517578F;
            field8971 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field8972 = (int) (field8971 * 65536.0F);
        }
        if (this.field8969[arg0] == 0) {
            return 0;
        }
        float var5 = this.method3571(arg0, 0, arg1);
        field8970[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method3570(arg0, 0, arg1));
        field8970[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field8969[arg0]; var6++) {
            float var9 = this.method3571(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method3570(arg0, var6, arg1));
            float var11 = var9 * var9;
            field8970[arg0][var6 * 2 + 1] = field8970[arg0][var6 * 2 - 1] * var11;
            field8970[arg0][var6 * 2] = field8970[arg0][var6 * 2 - 1] * var10 + field8970[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field8970[arg0][var12] += field8970[arg0][var12 - 1] * var10 + field8970[arg0][var12 - 2] * var11;
            }
            field8970[arg0][1] += field8970[arg0][0] * var10 + var11;
            field8970[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field8969[0] * 2; var7++) {
                field8970[0][var7] *= field8971;
            }
        }
        for (int var8 = 0; var8 < this.field8969[arg0] * 2; var8++) {
            field8975[arg0][var8] = (int) (field8970[arg0][var8] * 65536.0F);
        }
        return this.field8969[arg0] * 2;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lek;Lrc;)V")
    public final void method3567(class465 arg0, class162 arg1) {
        int var3 = arg0.method2705(-106);
        this.field8969[0] = var3 >> 4;
        this.field8969[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field8976[0] = this.field8976[1] = 0;
            return;
        }
        this.field8976[0] = arg0.method2755((byte) -50);
        this.field8976[1] = arg0.method2755((byte) -110);
        int var4 = arg0.method2705(-121);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field8969[var5]; var8++) {
                this.field8974[var5][0][var8] = arg0.method2755((byte) -122);
                this.field8973[var5][0][var8] = arg0.method2755((byte) -52);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field8969[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field8974[var6][1][var7] = this.field8974[var6][0][var7];
                    this.field8973[var6][1][var7] = this.field8973[var6][0][var7];
                } else {
                    this.field8974[var6][1][var7] = arg0.method2755((byte) -119);
                    this.field8973[var6][1][var7] = arg0.method2755((byte) -70);
                }
            }
        }
        if (var4 != 0 || this.field8976[1] != this.field8976[0]) {
            arg1.method1228(arg0);
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(F)F")
    private static final float method3568(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "()V")
    public static void method3569() {
        field8970 = null;
        field8975 = null;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIF)F")
    private final float method3570(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field8974[arg0][1][arg1] - this.field8974[arg0][0][arg1]) * arg2 + (float) this.field8974[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method3568(var5);
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(IIF)F")
    private final float method3571(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field8973[arg0][1][arg1] - this.field8973[arg0][0][arg1]) * arg2 + (float) this.field8973[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }
}
