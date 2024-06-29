import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class72 {

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "[[[I")
    private int[][][] field1046 = new int[2][2][4];

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "[I")
    private int[] field1045 = new int[2];

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "[[[I")
    private int[][][] field1048 = new int[2][2][4];

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "[I")
    public int[] field1050 = new int[2];

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "[[F")
    private static float[][] field1043 = new float[2][8];

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "[[I")
    public static int[][] field1044 = new int[2][8];

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "F")
    private static float field1047;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(F)F")
    private static final float method520(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lv;Lfk;)V")
    public final void method521(class152 arg0, class14 arg1) {
        int var3 = arg0.method1111(255);
        this.field1050[0] = var3 >> 4;
        this.field1050[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field1045[0] = this.field1045[1] = 0;
            return;
        }
        this.field1045[0] = arg0.method1126(false);
        this.field1045[1] = arg0.method1126(false);
        int var4 = arg0.method1111(255);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field1050[var5]; var8++) {
                this.field1048[var5][0][var8] = arg0.method1126(false);
                this.field1046[var5][0][var8] = arg0.method1126(false);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field1050[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field1048[var6][1][var7] = this.field1048[var6][0][var7];
                    this.field1046[var6][1][var7] = this.field1046[var6][0][var7];
                } else {
                    this.field1048[var6][1][var7] = arg0.method1126(false);
                    this.field1046[var6][1][var7] = arg0.method1126(false);
                }
            }
        }
        if (var4 != 0 || this.field1045[1] != this.field1045[0]) {
            arg1.method108(arg0);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIF)F")
    private final float method522(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1046[arg0][1][arg1] - this.field1046[arg0][0][arg1]) * arg2 + (float) this.field1046[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IF)I")
    public final int method523(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1045[1] - this.field1045[0]) * arg1 + (float) this.field1045[0];
            float var4 = var3 * 0.0030517578F;
            field1047 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field1049 = (int) (field1047 * 65536.0F);
        }
        if (this.field1050[arg0] == 0) {
            return 0;
        }
        float var5 = this.method522(arg0, 0, arg1);
        field1043[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method525(arg0, 0, arg1));
        field1043[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1050[arg0]; var6++) {
            float var9 = this.method522(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method525(arg0, var6, arg1));
            float var11 = var9 * var9;
            field1043[arg0][var6 * 2 + 1] = field1043[arg0][var6 * 2 - 1] * var11;
            field1043[arg0][var6 * 2] = field1043[arg0][var6 * 2 - 1] * var10 + field1043[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field1043[arg0][var12] += field1043[arg0][var12 - 1] * var10 + field1043[arg0][var12 - 2] * var11;
            }
            field1043[arg0][1] += field1043[arg0][0] * var10 + var11;
            field1043[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field1050[0] * 2; var7++) {
                field1043[0][var7] *= field1047;
            }
        }
        for (int var8 = 0; var8 < this.field1050[arg0] * 2; var8++) {
            field1044[arg0][var8] = (int) (field1043[arg0][var8] * 65536.0F);
        }
        return this.field1050[arg0] * 2;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "()V")
    public static void method524() {
        field1043 = null;
        field1044 = null;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(IIF)F")
    private final float method525(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1048[arg0][1][arg1] - this.field1048[arg0][0][arg1]) * arg2 + (float) this.field1048[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method520(var5);
    }
}
