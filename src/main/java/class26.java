import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class26 {

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "[[[I")
    private int[][][] field351 = new int[2][2][4];

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "[I")
    public int[] field354 = new int[2];

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "[[[I")
    private int[][][] field356 = new int[2][2][4];

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "[I")
    private int[] field358 = new int[2];

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "[[F")
    private static float[][] field353 = new float[2][8];

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "[[I")
    public static int[][] field355 = new int[2][8];

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "F")
    private static float field357;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IF)I")
    public final int method148(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field358[1] - this.field358[0]) * arg1 + (float) this.field358[0];
            float var4 = var3 * 0.0030517578F;
            field357 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field352 = (int) (field357 * 65536.0F);
        }
        if (this.field354[arg0] == 0) {
            return 0;
        }
        float var5 = this.method150(arg0, 0, arg1);
        field353[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method153(arg0, 0, arg1));
        field353[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field354[arg0]; var6++) {
            float var9 = this.method150(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method153(arg0, var6, arg1));
            float var11 = var9 * var9;
            field353[arg0][var6 * 2 + 1] = field353[arg0][var6 * 2 - 1] * var11;
            field353[arg0][var6 * 2] = field353[arg0][var6 * 2 - 1] * var10 + field353[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field353[arg0][var12] += field353[arg0][var12 - 1] * var10 + field353[arg0][var12 - 2] * var11;
            }
            field353[arg0][1] += field353[arg0][0] * var10 + var11;
            field353[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field354[0] * 2; var7++) {
                field353[0][var7] *= field357;
            }
        }
        for (int var8 = 0; var8 < this.field354[arg0] * 2; var8++) {
            field355[arg0][var8] = (int) (field353[arg0][var8] * 65536.0F);
        }
        return this.field354[arg0] * 2;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lpd;Llf;)V")
    public final void method149(class96 arg0, class87 arg1) {
        int var3 = arg0.method584(255);
        this.field354[0] = var3 >> 4;
        this.field354[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field358[0] = this.field358[1] = 0;
            return;
        }
        this.field358[0] = arg0.method549(255);
        this.field358[1] = arg0.method549(255);
        int var4 = arg0.method584(255);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field354[var5]; var8++) {
                this.field356[var5][0][var8] = arg0.method549(255);
                this.field351[var5][0][var8] = arg0.method549(255);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field354[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field356[var6][1][var7] = this.field356[var6][0][var7];
                    this.field351[var6][1][var7] = this.field351[var6][0][var7];
                } else {
                    this.field356[var6][1][var7] = arg0.method549(255);
                    this.field351[var6][1][var7] = arg0.method549(255);
                }
            }
        }
        if (var4 != 0 || this.field358[1] != this.field358[0]) {
            arg1.method475(arg0);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIF)F")
    private final float method150(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field351[arg0][1][arg1] - this.field351[arg0][0][arg1]) * arg2 + (float) this.field351[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(F)F")
    private static final float method151(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "()V")
    public static void method152() {
        field353 = null;
        field355 = null;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(IIF)F")
    private final float method153(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field356[arg0][1][arg1] - this.field356[arg0][0][arg1]) * arg2 + (float) this.field356[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method151(var5);
    }
}
