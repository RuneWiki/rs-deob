import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class424 {

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "[[[I")
    private int[][][] field6174 = new int[2][2][4];

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "[[[I")
    private int[][][] field6173 = new int[2][2][4];

    @OriginalMember(owner = "client!vn", name = "g", descriptor = "[I")
    public int[] field6178 = new int[2];

    @OriginalMember(owner = "client!vn", name = "h", descriptor = "[I")
    private int[] field6179 = new int[2];

    @OriginalMember(owner = "client!vn", name = "f", descriptor = "[[F")
    private static float[][] field6177 = new float[2][8];

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "[[I")
    public static int[][] field6176 = new int[2][8];

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "F")
    private static float field6172;

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "I")
    public static int field6175;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "()V")
    public static void method2659() {
        field6177 = null;
        field6176 = null;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIF)F")
    private final float method2660(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field6174[arg0][1][arg1] - this.field6174[arg0][0][arg1]) * arg2 + (float) this.field6174[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IF)I")
    public final int method2661(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field6179[1] - this.field6179[0]) * arg1 + (float) this.field6179[0];
            float var4 = var3 * 0.0030517578F;
            field6172 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field6175 = (int) (field6172 * 65536.0F);
        }
        if (this.field6178[arg0] == 0) {
            return 0;
        }
        float var5 = this.method2660(arg0, 0, arg1);
        field6177[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method2662(arg0, 0, arg1));
        field6177[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field6178[arg0]; var6++) {
            float var9 = this.method2660(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method2662(arg0, var6, arg1));
            float var11 = var9 * var9;
            field6177[arg0][var6 * 2 + 1] = field6177[arg0][var6 * 2 - 1] * var11;
            field6177[arg0][var6 * 2] = field6177[arg0][var6 * 2 - 1] * var10 + field6177[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field6177[arg0][var12] += field6177[arg0][var12 - 1] * var10 + field6177[arg0][var12 - 2] * var11;
            }
            field6177[arg0][1] += field6177[arg0][0] * var10 + var11;
            field6177[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field6178[0] * 2; var7++) {
                field6177[0][var7] *= field6172;
            }
        }
        for (int var8 = 0; var8 < this.field6178[arg0] * 2; var8++) {
            field6176[arg0][var8] = (int) (field6177[arg0][var8] * 65536.0F);
        }
        return this.field6178[arg0] * 2;
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(IIF)F")
    private final float method2662(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field6173[arg0][1][arg1] - this.field6173[arg0][0][arg1]) * arg2 + (float) this.field6173[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method2664(var5);
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lec;Lki;)V")
    public final void method2663(class37 arg0, class94 arg1) {
        int var3 = arg0.method271((byte) 115);
        this.field6178[0] = var3 >> 4;
        this.field6178[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field6179[0] = this.field6179[1] = 0;
            return;
        }
        this.field6179[0] = arg0.method320((byte) -87);
        this.field6179[1] = arg0.method320((byte) -87);
        int var4 = arg0.method271((byte) 101);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field6178[var5]; var8++) {
                this.field6173[var5][0][var8] = arg0.method320((byte) -87);
                this.field6174[var5][0][var8] = arg0.method320((byte) -87);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field6178[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field6173[var6][1][var7] = this.field6173[var6][0][var7];
                    this.field6174[var6][1][var7] = this.field6174[var6][0][var7];
                } else {
                    this.field6173[var6][1][var7] = arg0.method320((byte) -87);
                    this.field6174[var6][1][var7] = arg0.method320((byte) -87);
                }
            }
        }
        if (var4 != 0 || this.field6179[1] != this.field6179[0]) {
            arg1.method789(arg0);
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(F)F")
    private static final float method2664(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }
}
