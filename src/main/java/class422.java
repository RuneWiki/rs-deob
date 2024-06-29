import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class422 {

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "[[[I")
    private int[][][] field6285 = new int[2][2][4];

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "[I")
    private int[] field6284 = new int[2];

    @OriginalMember(owner = "client!sp", name = "e", descriptor = "[[[I")
    private int[][][] field6288 = new int[2][2][4];

    @OriginalMember(owner = "client!sp", name = "g", descriptor = "[I")
    public int[] field6290 = new int[2];

    @OriginalMember(owner = "client!sp", name = "d", descriptor = "[[F")
    private static float[][] field6287 = new float[2][8];

    @OriginalMember(owner = "client!sp", name = "h", descriptor = "[[I")
    public static int[][] field6291 = new int[2][8];

    @OriginalMember(owner = "client!sp", name = "c", descriptor = "F")
    private static float field6286;

    @OriginalMember(owner = "client!sp", name = "f", descriptor = "I")
    public static int field6289;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "()V")
    public static void method2716() {
        field6287 = null;
        field6291 = null;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(IF)I")
    public final int method2717(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field6284[1] - this.field6284[0]) * arg1 + (float) this.field6284[0];
            float var4 = var3 * 0.0030517578F;
            field6286 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field6289 = (int) (field6286 * 65536.0F);
        }
        if (this.field6290[arg0] == 0) {
            return 0;
        }
        float var5 = this.method2719(arg0, 0, arg1);
        field6287[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method2720(arg0, 0, arg1));
        field6287[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field6290[arg0]; var6++) {
            float var9 = this.method2719(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method2720(arg0, var6, arg1));
            float var11 = var9 * var9;
            field6287[arg0][var6 * 2 + 1] = field6287[arg0][var6 * 2 - 1] * var11;
            field6287[arg0][var6 * 2] = field6287[arg0][var6 * 2 - 1] * var10 + field6287[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field6287[arg0][var12] += field6287[arg0][var12 - 1] * var10 + field6287[arg0][var12 - 2] * var11;
            }
            field6287[arg0][1] += field6287[arg0][0] * var10 + var11;
            field6287[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field6290[0] * 2; var7++) {
                field6287[0][var7] *= field6286;
            }
        }
        for (int var8 = 0; var8 < this.field6290[arg0] * 2; var8++) {
            field6291[arg0][var8] = (int) (field6287[arg0][var8] * 65536.0F);
        }
        return this.field6290[arg0] * 2;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(F)F")
    private static final float method2718(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(IIF)F")
    private final float method2719(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field6285[arg0][1][arg1] - this.field6285[arg0][0][arg1]) * arg2 + (float) this.field6285[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "(IIF)F")
    private final float method2720(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field6288[arg0][1][arg1] - this.field6288[arg0][0][arg1]) * arg2 + (float) this.field6288[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method2718(var5);
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lil;Lbd;)V")
    public final void method2721(class265 arg0, class304 arg1) {
        int var3 = arg0.method1697(-54);
        this.field6290[0] = var3 >> 4;
        this.field6290[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field6284[0] = this.field6284[1] = 0;
            return;
        }
        this.field6284[0] = arg0.method1685(8104);
        this.field6284[1] = arg0.method1685(8104);
        int var4 = arg0.method1697(121);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field6290[var5]; var8++) {
                this.field6288[var5][0][var8] = arg0.method1685(8104);
                this.field6285[var5][0][var8] = arg0.method1685(8104);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field6290[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field6288[var6][1][var7] = this.field6288[var6][0][var7];
                    this.field6285[var6][1][var7] = this.field6285[var6][0][var7];
                } else {
                    this.field6288[var6][1][var7] = arg0.method1685(8104);
                    this.field6285[var6][1][var7] = arg0.method1685(8104);
                }
            }
        }
        if (var4 != 0 || this.field6284[1] != this.field6284[0]) {
            arg1.method1917(arg0);
        }
    }
}
