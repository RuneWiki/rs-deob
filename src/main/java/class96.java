import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class96 {

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "[[[I")
    private int[][][] field2432 = new int[2][2][4];

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "[I")
    public int[] field2431 = new int[2];

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "[I")
    private int[] field2435 = new int[2];

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "[[[I")
    private int[][][] field2438 = new int[2][2][4];

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "[[I")
    public static int[][] field2433 = new int[2][8];

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "[[F")
    private static float[][] field2437 = new float[2][8];

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "F")
    private static float field2436;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIF)F")
    private final float method794(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2432[arg0][1][arg1] - this.field2432[arg0][0][arg1]) * arg2 + (float) this.field2432[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(IIF)F")
    private final float method795(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2438[arg0][1][arg1] - this.field2438[arg0][0][arg1]) * arg2 + (float) this.field2438[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method797(var5);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "()V")
    public static void method796() {
        field2437 = null;
        field2433 = null;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(F)F")
    private static final float method797(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IF)I")
    public final int method798(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field2435[1] - this.field2435[0]) * arg1 + (float) this.field2435[0];
            float var4 = var3 * 0.0030517578F;
            field2436 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field2434 = (int) (field2436 * 65536.0F);
        }
        if (this.field2431[arg0] == 0) {
            return 0;
        }
        float var5 = this.method794(arg0, 0, arg1);
        field2437[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method795(arg0, 0, arg1));
        field2437[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field2431[arg0]; var6++) {
            float var9 = this.method794(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method795(arg0, var6, arg1));
            float var11 = var9 * var9;
            field2437[arg0][var6 * 2 + 1] = field2437[arg0][var6 * 2 - 1] * var11;
            field2437[arg0][var6 * 2] = field2437[arg0][var6 * 2 - 1] * var10 + field2437[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field2437[arg0][var12] += field2437[arg0][var12 - 1] * var10 + field2437[arg0][var12 - 2] * var11;
            }
            field2437[arg0][1] += field2437[arg0][0] * var10 + var11;
            field2437[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field2431[0] * 2; var7++) {
                field2437[0][var7] *= field2436;
            }
        }
        for (int var8 = 0; var8 < this.field2431[arg0] * 2; var8++) {
            field2433[arg0][var8] = (int) (field2437[arg0][var8] * 65536.0F);
        }
        return this.field2431[arg0] * 2;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lqc;Lmb;)V")
    public final void method799(class114 arg0, class85 arg1) {
        int var3 = arg0.method957((byte) 58);
        this.field2431[0] = var3 >> 4;
        this.field2431[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field2435[0] = this.field2435[1] = 0;
            return;
        }
        this.field2435[0] = arg0.method944((byte) 124);
        this.field2435[1] = arg0.method944((byte) 116);
        int var4 = arg0.method957((byte) 122);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field2431[var5]; var8++) {
                this.field2438[var5][0][var8] = arg0.method944((byte) 113);
                this.field2432[var5][0][var8] = arg0.method944((byte) 125);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field2431[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field2438[var6][1][var7] = this.field2438[var6][0][var7];
                    this.field2432[var6][1][var7] = this.field2432[var6][0][var7];
                } else {
                    this.field2438[var6][1][var7] = arg0.method944((byte) 120);
                    this.field2432[var6][1][var7] = arg0.method944((byte) 118);
                }
            }
        }
        if (var4 != 0 || this.field2435[1] != this.field2435[0]) {
            arg1.method715(arg0);
        }
    }
}
