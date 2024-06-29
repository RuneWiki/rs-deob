import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class168 {

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "[[[I")
    private int[][][] field2663 = new int[2][2][4];

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "[I")
    private int[] field2665 = new int[2];

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "[[[I")
    private int[][][] field2670 = new int[2][2][4];

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "[I")
    public int[] field2664 = new int[2];

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "[[F")
    private static float[][] field2666 = new float[2][8];

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "[[I")
    public static int[][] field2669 = new int[2][8];

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "F")
    private static float field2667;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "I")
    public static int field2668;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IF)I", line = 9)
    public final int method1200(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field2665[1] - this.field2665[0]) * arg1 + (float) this.field2665[0];
            float var4 = var3 * 0.0030517578F;
            field2667 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field2668 = (int) (field2667 * 65536.0F);
        }
        if (this.field2664[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1205(arg0, 0, arg1);
        field2666[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1202(arg0, 0, arg1));
        field2666[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field2664[arg0]; var6++) {
            float var7 = this.method1205(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1202(arg0, var6, arg1));
            float var9 = var7 * var7;
            field2666[arg0][var6 * 2 + 1] = field2666[arg0][var6 * 2 - 1] * var9;
            field2666[arg0][var6 * 2] = field2666[arg0][var6 * 2 - 1] * var8 + field2666[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field2666[arg0][var10] += field2666[arg0][var10 - 1] * var8 + field2666[arg0][var10 - 2] * var9;
            }
            field2666[arg0][1] += field2666[arg0][0] * var8 + var9;
            field2666[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field2664[0] * 2; var11++) {
                field2666[0][var11] *= field2667;
            }
        }
        for (int var12 = 0; var12 < this.field2664[arg0] * 2; var12++) {
            field2669[arg0][var12] = (int) (field2666[arg0][var12] * 65536.0F);
        }
        return this.field2664[arg0] * 2;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(F)F", line = 71)
    private static final float method1201(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIF)F", line = 76)
    private final float method1202(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2663[arg0][1][arg1] - this.field2663[arg0][0][arg1]) * arg2 + (float) this.field2663[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1201(var5);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Llb;Lrj;)V", line = 85)
    public final void method1203(class112 arg0, class293 arg1) {
        int var3 = arg0.method792(2);
        this.field2664[0] = var3 >> 4;
        this.field2664[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field2665[0] = this.field2665[1] = 0;
            return;
        }
        this.field2665[0] = arg0.method759((byte) -91);
        this.field2665[1] = arg0.method759((byte) -53);
        int var4 = arg0.method792(2);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field2664[var5]; var6++) {
                this.field2663[var5][0][var6] = arg0.method759((byte) -63);
                this.field2670[var5][0][var6] = arg0.method759((byte) -33);
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field2664[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field2663[var7][1][var8] = this.field2663[var7][0][var8];
                    this.field2670[var7][1][var8] = this.field2670[var7][0][var8];
                } else {
                    this.field2663[var7][1][var8] = arg0.method759((byte) -103);
                    this.field2670[var7][1][var8] = arg0.method759((byte) -70);
                }
            }
        }
        if (var4 != 0 || this.field2665[1] != this.field2665[0]) {
            arg1.method2031(arg0);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "()V", line = 154)
    public static void method1204() {
        field2666 = (float[][]) null;
        field2669 = (int[][]) null;
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(IIF)F", line = 177)
    private final float method1205(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2670[arg0][1][arg1] - this.field2670[arg0][0][arg1]) * arg2 + (float) this.field2670[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }
}
