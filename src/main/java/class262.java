import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class262 {

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "[[[I")
    private int[][][] field4108 = new int[2][2][4];

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "[I")
    public int[] field4111 = new int[2];

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "[[[I")
    private int[][][] field4109 = new int[2][2][4];

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "[I")
    private int[] field4107 = new int[2];

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "[[F")
    private static float[][] field4105 = new float[2][8];

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "[[I")
    public static int[][] field4112 = new int[2][8];

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "F")
    private static float field4106;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "I")
    public static int field4110;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(F)F", line = 6)
    private static final float method1878(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIF)F", line = 11)
    private final float method1879(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field4109[arg0][1][arg1] - this.field4109[arg0][0][arg1]) * arg2 + (float) this.field4109[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1878(var5);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IF)I", line = 17)
    public final int method1880(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field4107[1] - this.field4107[0]) * arg1 + (float) this.field4107[0];
            float var4 = var3 * 0.0030517578F;
            field4106 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field4110 = (int) (field4106 * 65536.0F);
        }
        if (this.field4111[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1882(arg0, 0, arg1);
        field4105[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1879(arg0, 0, arg1));
        field4105[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field4111[arg0]; var6++) {
            float var7 = this.method1882(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1879(arg0, var6, arg1));
            float var9 = var7 * var7;
            field4105[arg0][var6 * 2 + 1] = field4105[arg0][var6 * 2 - 1] * var9;
            field4105[arg0][var6 * 2] = field4105[arg0][var6 * 2 - 1] * var8 + field4105[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field4105[arg0][var10] += field4105[arg0][var10 - 1] * var8 + field4105[arg0][var10 - 2] * var9;
            }
            field4105[arg0][1] += field4105[arg0][0] * var8 + var9;
            field4105[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field4111[0] * 2; var11++) {
                field4105[0][var11] *= field4106;
            }
        }
        for (int var12 = 0; var12 < this.field4111[arg0] * 2; var12++) {
            field4112[arg0][var12] = (int) (field4105[arg0][var12] * 65536.0F);
        }
        return this.field4111[arg0] * 2;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "()V", line = 83)
    public static void method1881() {
        field4105 = (float[][]) null;
        field4112 = (int[][]) null;
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(IIF)F", line = 90)
    private final float method1882(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field4108[arg0][1][arg1] - this.field4108[arg0][0][arg1]) * arg2 + (float) this.field4108[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lvl;Lkf;)V", line = 96)
    public final void method1883(class6 arg0, class106 arg1) {
        int var3 = arg0.method58(-288140008);
        this.field4111[0] = var3 >> 4;
        this.field4111[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field4107[0] = this.field4107[1] = 0;
            return;
        }
        this.field4107[0] = arg0.method39((byte) 78);
        this.field4107[1] = arg0.method39((byte) 94);
        int var4 = arg0.method58(-288140008);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field4111[var5]; var6++) {
                this.field4109[var5][0][var6] = arg0.method39((byte) 61);
                this.field4108[var5][0][var6] = arg0.method39((byte) 112);
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field4111[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field4109[var7][1][var8] = this.field4109[var7][0][var8];
                    this.field4108[var7][1][var8] = this.field4108[var7][0][var8];
                } else {
                    this.field4109[var7][1][var8] = arg0.method39((byte) 115);
                    this.field4108[var7][1][var8] = arg0.method39((byte) 69);
                }
            }
        }
        if (var4 != 0 || this.field4107[1] != this.field4107[0]) {
            arg1.method728(arg0);
        }
    }
}
