import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nca")
public class class55 {

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "[I")
    public int[] field552 = new int[2];

    @OriginalMember(owner = "client!nca", name = "b", descriptor = "[[[I")
    private int[][][] field553 = new int[2][2][4];

    @OriginalMember(owner = "client!nca", name = "c", descriptor = "[I")
    private int[] field554 = new int[2];

    @OriginalMember(owner = "client!nca", name = "h", descriptor = "[[[I")
    private int[][][] field559 = new int[2][2][4];

    @OriginalMember(owner = "client!nca", name = "d", descriptor = "[[F")
    private static float[][] field555 = new float[2][8];

    @OriginalMember(owner = "client!nca", name = "f", descriptor = "[[I")
    public static int[][] field557 = new int[2][8];

    @OriginalMember(owner = "client!nca", name = "g", descriptor = "F")
    private static float field558;

    @OriginalMember(owner = "client!nca", name = "e", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(IIF)F", line = 4)
    private final float method287(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field553[arg0][1][arg1] - this.field553[arg0][0][arg1]) * arg2 + (float) this.field553[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method290(var5);
    }

    @OriginalMember(owner = "client!nca", name = "b", descriptor = "(IIF)F", line = 14)
    private final float method288(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field559[arg0][1][arg1] - this.field559[arg0][0][arg1]) * arg2 + (float) this.field559[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "()V", line = 19)
    public static void method289() {
        field555 = null;
        field557 = null;
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(F)F", line = 24)
    private static final float method290(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(Lnp;Ltb;)V", line = 42)
    public final void method291(class115 arg0, class449 arg1) {
        int var3 = arg0.method620((byte) -128);
        this.field552[0] = var3 >> 4;
        this.field552[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field554[0] = this.field554[1] = 0;
            return;
        }
        this.field554[0] = arg0.method643((byte) -77);
        this.field554[1] = arg0.method643((byte) -77);
        int var4 = arg0.method620((byte) 81);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field552[var5]; var8++) {
                this.field553[var5][0][var8] = arg0.method643((byte) -77);
                this.field559[var5][0][var8] = arg0.method643((byte) -77);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field552[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field553[var6][1][var7] = this.field553[var6][0][var7];
                    this.field559[var6][1][var7] = this.field559[var6][0][var7];
                } else {
                    this.field553[var6][1][var7] = arg0.method643((byte) -77);
                    this.field559[var6][1][var7] = arg0.method643((byte) -77);
                }
            }
        }
        if (var4 != 0 || this.field554[1] != this.field554[0]) {
            arg1.method2590(arg0);
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(IF)I", line = 114)
    public final int method292(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field554[1] - this.field554[0]) * arg1 + (float) this.field554[0];
            float var4 = var3 * 0.0030517578F;
            field558 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field556 = (int) (field558 * 65536.0F);
        }
        if (this.field552[arg0] == 0) {
            return 0;
        }
        float var5 = this.method288(arg0, 0, arg1);
        field555[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method287(arg0, 0, arg1));
        field555[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field552[arg0]; var6++) {
            float var9 = this.method288(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method287(arg0, var6, arg1));
            float var11 = var9 * var9;
            field555[arg0][var6 * 2 + 1] = field555[arg0][var6 * 2 - 1] * var11;
            field555[arg0][var6 * 2] = field555[arg0][var6 * 2 - 1] * var10 + field555[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field555[arg0][var12] += field555[arg0][var12 - 1] * var10 + field555[arg0][var12 - 2] * var11;
            }
            field555[arg0][1] += field555[arg0][0] * var10 + var11;
            field555[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field552[0] * 2; var7++) {
                field555[0][var7] *= field558;
            }
        }
        for (int var8 = 0; var8 < this.field552[arg0] * 2; var8++) {
            field557[arg0][var8] = (int) (field555[arg0][var8] * 65536.0F);
        }
        return this.field552[arg0] * 2;
    }
}
