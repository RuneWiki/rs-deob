import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class138 {

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "[I")
    private int[] field2654 = new int[2];

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "[[[I")
    private int[][][] field2655 = new int[2][2][4];

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "[I")
    public int[] field2658 = new int[2];

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "[[[I")
    private int[][][] field2661 = new int[2][2][4];

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "[[I")
    public static int[][] field2657 = new int[2][8];

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "[[F")
    private static float[][] field2660 = new float[2][8];

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "F")
    private static float field2656;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lpg;Lji;)V")
    public final void method1068(class81 arg0, class200 arg1) {
        int var3 = arg0.method622(true);
        this.field2658[0] = var3 >> 4;
        this.field2658[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field2654[0] = this.field2654[1] = 0;
            return;
        }
        this.field2654[0] = arg0.method658(88);
        this.field2654[1] = arg0.method658(121);
        int var4 = arg0.method622(true);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field2658[var5]; var8++) {
                this.field2655[var5][0][var8] = arg0.method658(-65);
                this.field2661[var5][0][var8] = arg0.method658(126);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field2658[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field2655[var6][1][var7] = this.field2655[var6][0][var7];
                    this.field2661[var6][1][var7] = this.field2661[var6][0][var7];
                } else {
                    this.field2655[var6][1][var7] = arg0.method658(67);
                    this.field2661[var6][1][var7] = arg0.method658(-88);
                }
            }
        }
        if (var4 != 0 || this.field2654[1] != this.field2654[0]) {
            arg1.method1434(arg0);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IF)I")
    public final int method1069(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field2654[1] - this.field2654[0]) * arg1 + (float) this.field2654[0];
            float var4 = var3 * 0.0030517578F;
            field2656 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field2659 = (int) (field2656 * 65536.0F);
        }
        if (this.field2658[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1073(arg0, 0, arg1);
        field2660[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1072(arg0, 0, arg1));
        field2660[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field2658[arg0]; var6++) {
            float var9 = this.method1073(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method1072(arg0, var6, arg1));
            float var11 = var9 * var9;
            field2660[arg0][var6 * 2 + 1] = field2660[arg0][var6 * 2 - 1] * var11;
            field2660[arg0][var6 * 2] = field2660[arg0][var6 * 2 - 1] * var10 + field2660[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field2660[arg0][var12] += field2660[arg0][var12 - 1] * var10 + field2660[arg0][var12 - 2] * var11;
            }
            field2660[arg0][1] += field2660[arg0][0] * var10 + var11;
            field2660[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field2658[0] * 2; var7++) {
                field2660[0][var7] *= field2656;
            }
        }
        for (int var8 = 0; var8 < this.field2658[arg0] * 2; var8++) {
            field2657[arg0][var8] = (int) (field2660[arg0][var8] * 65536.0F);
        }
        return this.field2658[arg0] * 2;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(F)F")
    private static final float method1070(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "()V")
    public static void method1071() {
        field2660 = null;
        field2657 = null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIF)F")
    private final float method1072(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2655[arg0][1][arg1] - this.field2655[arg0][0][arg1]) * arg2 + (float) this.field2655[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1070(var5);
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(IIF)F")
    private final float method1073(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2661[arg0][1][arg1] - this.field2661[arg0][0][arg1]) * arg2 + (float) this.field2661[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }
}
