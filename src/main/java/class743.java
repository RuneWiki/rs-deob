import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lja")
public class class743 {

    @OriginalMember(owner = "client!lja", name = "b", descriptor = "[[[I")
    private int[][][] field10348 = new int[2][2][4];

    @OriginalMember(owner = "client!lja", name = "f", descriptor = "[I")
    public int[] field10352 = new int[2];

    @OriginalMember(owner = "client!lja", name = "g", descriptor = "[[[I")
    private int[][][] field10353 = new int[2][2][4];

    @OriginalMember(owner = "client!lja", name = "a", descriptor = "[I")
    private int[] field10347 = new int[2];

    @OriginalMember(owner = "client!lja", name = "e", descriptor = "[[I")
    public static int[][] field10351 = new int[2][8];

    @OriginalMember(owner = "client!lja", name = "h", descriptor = "[[F")
    private static float[][] field10354 = new float[2][8];

    @OriginalMember(owner = "client!lja", name = "c", descriptor = "F")
    private static float field10349;

    @OriginalMember(owner = "client!lja", name = "d", descriptor = "I")
    public static int field10350;

    @OriginalMember(owner = "client!lja", name = "a", descriptor = "(IF)I")
    public final int method4146(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field10347[1] - this.field10347[0]) * arg1 + (float) this.field10347[0];
            float var4 = var3 * 0.0030517578F;
            field10349 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field10350 = (int) (field10349 * 65536.0F);
        }
        if (this.field10352[arg0] == 0) {
            return 0;
        }
        float var5 = this.method4149(arg0, 0, arg1);
        field10354[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method4151(arg0, 0, arg1));
        field10354[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field10352[arg0]; var6++) {
            float var9 = this.method4149(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method4151(arg0, var6, arg1));
            float var11 = var9 * var9;
            field10354[arg0][var6 * 2 + 1] = field10354[arg0][var6 * 2 - 1] * var11;
            field10354[arg0][var6 * 2] = field10354[arg0][var6 * 2 - 1] * var10 + field10354[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field10354[arg0][var12] += field10354[arg0][var12 - 1] * var10 + field10354[arg0][var12 - 2] * var11;
            }
            field10354[arg0][1] += field10354[arg0][0] * var10 + var11;
            field10354[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field10352[0] * 2; var7++) {
                field10354[0][var7] *= field10349;
            }
        }
        for (int var8 = 0; var8 < this.field10352[arg0] * 2; var8++) {
            field10351[arg0][var8] = (int) (field10354[arg0][var8] * 65536.0F);
        }
        return this.field10352[arg0] * 2;
    }

    @OriginalMember(owner = "client!lja", name = "a", descriptor = "(F)F")
    private static final float method4147(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!lja", name = "a", descriptor = "()V")
    public static void method4148() {
        field10354 = null;
        field10351 = null;
    }

    @OriginalMember(owner = "client!lja", name = "a", descriptor = "(IIF)F")
    private final float method4149(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field10348[arg0][1][arg1] - this.field10348[arg0][0][arg1]) * arg2 + (float) this.field10348[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!lja", name = "a", descriptor = "(Lrv;Lmv;)V")
    public final void method4150(class120 arg0, class392 arg1) {
        int var3 = arg0.method842(2384);
        this.field10352[0] = var3 >> 4;
        this.field10352[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field10347[0] = this.field10347[1] = 0;
            return;
        }
        this.field10347[0] = arg0.method898((byte) -97);
        this.field10347[1] = arg0.method898((byte) -120);
        int var4 = arg0.method842(2384);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field10352[var5]; var8++) {
                this.field10353[var5][0][var8] = arg0.method898((byte) -118);
                this.field10348[var5][0][var8] = arg0.method898((byte) -118);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field10352[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field10353[var6][1][var7] = this.field10353[var6][0][var7];
                    this.field10348[var6][1][var7] = this.field10348[var6][0][var7];
                } else {
                    this.field10353[var6][1][var7] = arg0.method898((byte) -109);
                    this.field10348[var6][1][var7] = arg0.method898((byte) -83);
                }
            }
        }
        if (var4 != 0 || this.field10347[1] != this.field10347[0]) {
            arg1.method2393(arg0);
        }
    }

    @OriginalMember(owner = "client!lja", name = "b", descriptor = "(IIF)F")
    private final float method4151(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field10353[arg0][1][arg1] - this.field10353[arg0][0][arg1]) * arg2 + (float) this.field10353[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method4147(var5);
    }
}
