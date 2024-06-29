import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uw")
public class class194 {

    @OriginalMember(owner = "client!uw", name = "b", descriptor = "[I")
    public int[] field2662 = new int[2];

    @OriginalMember(owner = "client!uw", name = "e", descriptor = "[[[I")
    private int[][][] field2665 = new int[2][2][4];

    @OriginalMember(owner = "client!uw", name = "g", descriptor = "[[[I")
    private int[][][] field2667 = new int[2][2][4];

    @OriginalMember(owner = "client!uw", name = "f", descriptor = "[I")
    private int[] field2666 = new int[2];

    @OriginalMember(owner = "client!uw", name = "d", descriptor = "[[F")
    private static float[][] field2664 = new float[2][8];

    @OriginalMember(owner = "client!uw", name = "h", descriptor = "[[I")
    public static int[][] field2668 = new int[2][8];

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "F")
    private static float field2661;

    @OriginalMember(owner = "client!uw", name = "c", descriptor = "I")
    public static int field2663;

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(IIF)F", line = 6)
    private final float method1266(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2667[arg0][1][arg1] - this.field2667[arg0][0][arg1]) * arg2 + (float) this.field2667[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1269(var5);
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(IF)I", line = 17)
    public final int method1267(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field2666[1] - this.field2666[0]) * arg1 + (float) this.field2666[0];
            float var4 = var3 * 0.0030517578F;
            field2661 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field2663 = (int) (field2661 * 65536.0F);
        }
        if (this.field2662[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1268(arg0, 0, arg1);
        field2664[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1266(arg0, 0, arg1));
        field2664[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field2662[arg0]; var6++) {
            float var9 = this.method1268(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method1266(arg0, var6, arg1));
            float var11 = var9 * var9;
            field2664[arg0][var6 * 2 + 1] = field2664[arg0][var6 * 2 - 1] * var11;
            field2664[arg0][var6 * 2] = field2664[arg0][var6 * 2 - 1] * var10 + field2664[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field2664[arg0][var12] += field2664[arg0][var12 - 1] * var10 + field2664[arg0][var12 - 2] * var11;
            }
            field2664[arg0][1] += field2664[arg0][0] * var10 + var11;
            field2664[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field2662[0] * 2; var7++) {
                field2664[0][var7] *= field2661;
            }
        }
        for (int var8 = 0; var8 < this.field2662[arg0] * 2; var8++) {
            field2668[arg0][var8] = (int) (field2664[arg0][var8] * 65536.0F);
        }
        return this.field2662[arg0] * 2;
    }

    @OriginalMember(owner = "client!uw", name = "b", descriptor = "(IIF)F", line = 77)
    private final float method1268(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2665[arg0][1][arg1] - this.field2665[arg0][0][arg1]) * arg2 + (float) this.field2665[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(F)F", line = 89)
    private static final float method1269(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "()V", line = 93)
    public static void method1270() {
        field2664 = null;
        field2668 = null;
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(Lio;Lvaa;)V", line = 119)
    public final void method1271(class157 arg0, class261 arg1) {
        int var3 = arg0.method930(255);
        this.field2662[0] = var3 >> 4;
        this.field2662[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field2666[0] = this.field2666[1] = 0;
            return;
        }
        this.field2666[0] = arg0.method963(-118);
        this.field2666[1] = arg0.method963(-128);
        int var4 = arg0.method930(255);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field2662[var5]; var8++) {
                this.field2667[var5][0][var8] = arg0.method963(-127);
                this.field2665[var5][0][var8] = arg0.method963(-128);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field2662[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field2667[var6][1][var7] = this.field2667[var6][0][var7];
                    this.field2665[var6][1][var7] = this.field2665[var6][0][var7];
                } else {
                    this.field2667[var6][1][var7] = arg0.method963(-119);
                    this.field2665[var6][1][var7] = arg0.method963(-128);
                }
            }
        }
        if (var4 != 0 || this.field2666[1] != this.field2666[0]) {
            arg1.method1568(arg0);
        }
    }
}
