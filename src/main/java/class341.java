import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class341 {

    @OriginalMember(owner = "client!de", name = "d", descriptor = "[I")
    private int[] field4960 = new int[2];

    @OriginalMember(owner = "client!de", name = "f", descriptor = "[[[I")
    private int[][][] field4962 = new int[2][2][4];

    @OriginalMember(owner = "client!de", name = "h", descriptor = "[[[I")
    private int[][][] field4964 = new int[2][2][4];

    @OriginalMember(owner = "client!de", name = "c", descriptor = "[I")
    public int[] field4959 = new int[2];

    @OriginalMember(owner = "client!de", name = "e", descriptor = "[[F")
    private static float[][] field4961 = new float[2][8];

    @OriginalMember(owner = "client!de", name = "g", descriptor = "[[I")
    public static int[][] field4963 = new int[2][8];

    @OriginalMember(owner = "client!de", name = "a", descriptor = "F")
    private static float field4957;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "I")
    public static int field4958;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lrp;Lub;)V")
    public final void method2147(class276 arg0, class18 arg1) {
        int var3 = arg0.method1701(-23121);
        this.field4959[0] = var3 >> 4;
        this.field4959[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field4960[0] = this.field4960[1] = 0;
            return;
        }
        this.field4960[0] = arg0.method1729(65280);
        this.field4960[1] = arg0.method1729(65280);
        int var4 = arg0.method1701(-23121);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field4959[var5]; var8++) {
                this.field4962[var5][0][var8] = arg0.method1729(65280);
                this.field4964[var5][0][var8] = arg0.method1729(65280);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field4959[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field4962[var6][1][var7] = this.field4962[var6][0][var7];
                    this.field4964[var6][1][var7] = this.field4964[var6][0][var7];
                } else {
                    this.field4962[var6][1][var7] = arg0.method1729(65280);
                    this.field4964[var6][1][var7] = arg0.method1729(65280);
                }
            }
        }
        if (var4 != 0 || this.field4960[1] != this.field4960[0]) {
            arg1.method124(arg0);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(F)F")
    private static final float method2148(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIF)F")
    private final float method2149(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field4962[arg0][1][arg1] - this.field4962[arg0][0][arg1]) * arg2 + (float) this.field4962[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method2148(var5);
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(IIF)F")
    private final float method2150(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field4964[arg0][1][arg1] - this.field4964[arg0][0][arg1]) * arg2 + (float) this.field4964[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IF)I")
    public final int method2151(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field4960[1] - this.field4960[0]) * arg1 + (float) this.field4960[0];
            float var4 = var3 * 0.0030517578F;
            field4957 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field4958 = (int) (field4957 * 65536.0F);
        }
        if (this.field4959[arg0] == 0) {
            return 0;
        }
        float var5 = this.method2150(arg0, 0, arg1);
        field4961[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method2149(arg0, 0, arg1));
        field4961[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field4959[arg0]; var6++) {
            float var9 = this.method2150(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method2149(arg0, var6, arg1));
            float var11 = var9 * var9;
            field4961[arg0][var6 * 2 + 1] = field4961[arg0][var6 * 2 - 1] * var11;
            field4961[arg0][var6 * 2] = field4961[arg0][var6 * 2 - 1] * var10 + field4961[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field4961[arg0][var12] += field4961[arg0][var12 - 1] * var10 + field4961[arg0][var12 - 2] * var11;
            }
            field4961[arg0][1] += field4961[arg0][0] * var10 + var11;
            field4961[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field4959[0] * 2; var7++) {
                field4961[0][var7] *= field4957;
            }
        }
        for (int var8 = 0; var8 < this.field4959[arg0] * 2; var8++) {
            field4963[arg0][var8] = (int) (field4961[arg0][var8] * 65536.0F);
        }
        return this.field4959[arg0] * 2;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "()V")
    public static void method2152() {
        field4961 = null;
        field4963 = null;
    }
}
