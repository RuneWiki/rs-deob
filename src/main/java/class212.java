import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class212 {

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "[I")
    public int[] field2988 = new int[2];

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "[[[I")
    private int[][][] field2989 = new int[2][2][4];

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "[I")
    private int[] field2990 = new int[2];

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "[[[I")
    private int[][][] field2994 = new int[2][2][4];

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "[[I")
    public static int[][] field2991 = new int[2][8];

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "[[F")
    private static float[][] field2992 = new float[2][8];

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "F")
    private static float field2993;

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "I")
    public static int field2995;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "()V", line = 3)
    public static void method1450() {
        field2992 = (float[][]) null;
        field2991 = (int[][]) null;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIF)F", line = 9)
    private final float method1451(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2994[arg0][1][arg1] - this.field2994[arg0][0][arg1]) * arg2 + (float) this.field2994[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lp;Lpj;)V", line = 28)
    public final void method1452(class107 arg0, class194 arg1) {
        int var3 = arg0.method661(-1);
        this.field2988[0] = var3 >> 4;
        this.field2988[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field2990[0] = this.field2990[1] = 0;
            return;
        }
        this.field2990[0] = arg0.method624(14612);
        this.field2990[1] = arg0.method624(14612);
        int var4 = arg0.method661(-1);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field2988[var5]; var6++) {
                this.field2989[var5][0][var6] = arg0.method624(14612);
                this.field2994[var5][0][var6] = arg0.method624(14612);
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field2988[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field2989[var7][1][var8] = this.field2989[var7][0][var8];
                    this.field2994[var7][1][var8] = this.field2994[var7][0][var8];
                } else {
                    this.field2989[var7][1][var8] = arg0.method624(14612);
                    this.field2994[var7][1][var8] = arg0.method624(14612);
                }
            }
        }
        if (var4 != 0 || this.field2990[1] != this.field2990[0]) {
            arg1.method1349(arg0);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IF)I", line = 95)
    public final int method1453(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field2990[1] - this.field2990[0]) * arg1 + (float) this.field2990[0];
            float var4 = var3 * 0.0030517578F;
            field2993 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field2995 = (int) (field2993 * 65536.0F);
        }
        if (this.field2988[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1451(arg0, 0, arg1);
        field2992[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1454(arg0, 0, arg1));
        field2992[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field2988[arg0]; var6++) {
            float var7 = this.method1451(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1454(arg0, var6, arg1));
            float var9 = var7 * var7;
            field2992[arg0][var6 * 2 + 1] = field2992[arg0][var6 * 2 - 1] * var9;
            field2992[arg0][var6 * 2] = field2992[arg0][var6 * 2 - 1] * var8 + field2992[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field2992[arg0][var10] += field2992[arg0][var10 - 1] * var8 + field2992[arg0][var10 - 2] * var9;
            }
            field2992[arg0][1] += field2992[arg0][0] * var8 + var9;
            field2992[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field2988[0] * 2; var11++) {
                field2992[0][var11] *= field2993;
            }
        }
        for (int var12 = 0; var12 < this.field2988[arg0] * 2; var12++) {
            field2991[arg0][var12] = (int) (field2992[arg0][var12] * 65536.0F);
        }
        return this.field2988[arg0] * 2;
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(IIF)F", line = 167)
    private final float method1454(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2989[arg0][1][arg1] - this.field2989[arg0][0][arg1]) * arg2 + (float) this.field2989[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1455(var5);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(F)F", line = 175)
    private static final float method1455(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }
}
