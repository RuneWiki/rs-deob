import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class44 {

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "[[[I")
    private int[][][] field1111 = new int[2][2][4];

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "[I")
    private int[] field1112 = new int[2];

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "[I")
    public int[] field1114 = new int[2];

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "[[[I")
    private int[][][] field1117 = new int[2][2][4];

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "[[F")
    private static float[][] field1116 = new float[2][8];

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "[[I")
    public static int[][] field1118 = new int[2][8];

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "F")
    private static float field1115;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IF)I", line = 3)
    public final int method365(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1112[1] - this.field1112[0]) * arg1 + (float) this.field1112[0];
            float var4 = var3 * 0.0030517578F;
            field1115 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field1113 = (int) (field1115 * 65536.0F);
        }
        if (this.field1114[arg0] == 0) {
            return 0;
        }
        float var5 = this.method370(arg0, 0, arg1);
        field1116[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method366(arg0, 0, arg1));
        field1116[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1114[arg0]; var6++) {
            float var9 = this.method370(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method366(arg0, var6, arg1));
            float var11 = var9 * var9;
            field1116[arg0][var6 * 2 + 1] = field1116[arg0][var6 * 2 - 1] * var11;
            field1116[arg0][var6 * 2] = field1116[arg0][var6 * 2 - 1] * var10 + field1116[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field1116[arg0][var12] += field1116[arg0][var12 - 1] * var10 + field1116[arg0][var12 - 2] * var11;
            }
            field1116[arg0][1] += field1116[arg0][0] * var10 + var11;
            field1116[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field1114[0] * 2; var7++) {
                field1116[0][var7] *= field1115;
            }
        }
        for (int var8 = 0; var8 < this.field1114[arg0] * 2; var8++) {
            field1118[arg0][var8] = (int) (field1116[arg0][var8] * 65536.0F);
        }
        return this.field1114[arg0] * 2;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIF)F", line = 67)
    private final float method366(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1117[arg0][1][arg1] - this.field1117[arg0][0][arg1]) * arg2 + (float) this.field1117[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method368(var5);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "()V", line = 77)
    public static void method367() {
        field1116 = null;
        field1118 = null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(F)F", line = 83)
    private static final float method368(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lgb;Lea;)V", line = 98)
    public final void method369(class39 arg0, class26 arg1) {
        int var3 = arg0.method330(-30864);
        this.field1114[0] = var3 >> 4;
        this.field1114[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field1112[0] = this.field1112[1] = 0;
            return;
        }
        this.field1112[0] = arg0.method343((byte) -6);
        this.field1112[1] = arg0.method343((byte) -6);
        int var4 = arg0.method330(-30864);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field1114[var5]; var8++) {
                this.field1117[var5][0][var8] = arg0.method343((byte) -6);
                this.field1111[var5][0][var8] = arg0.method343((byte) -6);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field1114[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field1117[var6][1][var7] = this.field1117[var6][0][var7];
                    this.field1111[var6][1][var7] = this.field1111[var6][0][var7];
                } else {
                    this.field1117[var6][1][var7] = arg0.method343((byte) -6);
                    this.field1111[var6][1][var7] = arg0.method343((byte) -6);
                }
            }
        }
        if (var4 != 0 || this.field1112[1] != this.field1112[0]) {
            arg1.method217(arg0);
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(IIF)F", line = 165)
    private final float method370(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1111[arg0][1][arg1] - this.field1111[arg0][0][arg1]) * arg2 + (float) this.field1111[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }
}
