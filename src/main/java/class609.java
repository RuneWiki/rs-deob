import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class609 {

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "[I")
    public int[] field8183 = new int[2];

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "[[[I")
    private int[][][] field8185 = new int[2][2][4];

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "[[[I")
    private int[][][] field8184 = new int[2][2][4];

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "[I")
    private int[] field8186 = new int[2];

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "[[F")
    private static float[][] field8181 = new float[2][8];

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "[[I")
    public static int[][] field8182 = new int[2][8];

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "F")
    private static float field8187;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "I")
    public static int field8180;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Les;Luf;)V")
    public final void method3454(class403 arg0, class472 arg1) {
        int var3 = arg0.method2396((byte) 116);
        this.field8183[0] = var3 >> 4;
        this.field8183[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field8186[0] = this.field8186[1] = 0;
            return;
        }
        this.field8186[0] = arg0.method2390((byte) 127);
        this.field8186[1] = arg0.method2390((byte) -108);
        int var4 = arg0.method2396((byte) 56);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field8183[var5]; var8++) {
                this.field8184[var5][0][var8] = arg0.method2390((byte) -111);
                this.field8185[var5][0][var8] = arg0.method2390((byte) 98);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field8183[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field8184[var6][1][var7] = this.field8184[var6][0][var7];
                    this.field8185[var6][1][var7] = this.field8185[var6][0][var7];
                } else {
                    this.field8184[var6][1][var7] = arg0.method2390((byte) -109);
                    this.field8185[var6][1][var7] = arg0.method2390((byte) -122);
                }
            }
        }
        if (var4 != 0 || this.field8186[1] != this.field8186[0]) {
            arg1.method2815(arg0);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IF)I")
    public final int method3455(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field8186[1] - this.field8186[0]) * arg1 + (float) this.field8186[0];
            float var4 = var3 * 0.0030517578F;
            field8187 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field8180 = (int) (field8187 * 65536.0F);
        }
        if (this.field8183[arg0] == 0) {
            return 0;
        }
        float var5 = this.method3458(arg0, 0, arg1);
        field8181[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method3457(arg0, 0, arg1));
        field8181[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field8183[arg0]; var6++) {
            float var9 = this.method3458(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method3457(arg0, var6, arg1));
            float var11 = var9 * var9;
            field8181[arg0][var6 * 2 + 1] = field8181[arg0][var6 * 2 - 1] * var11;
            field8181[arg0][var6 * 2] = field8181[arg0][var6 * 2 - 1] * var10 + field8181[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field8181[arg0][var12] += field8181[arg0][var12 - 1] * var10 + field8181[arg0][var12 - 2] * var11;
            }
            field8181[arg0][1] += field8181[arg0][0] * var10 + var11;
            field8181[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field8183[0] * 2; var7++) {
                field8181[0][var7] *= field8187;
            }
        }
        for (int var8 = 0; var8 < this.field8183[arg0] * 2; var8++) {
            field8182[arg0][var8] = (int) (field8181[arg0][var8] * 65536.0F);
        }
        return this.field8183[arg0] * 2;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(F)F")
    private static final float method3456(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIF)F")
    private final float method3457(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field8184[arg0][1][arg1] - this.field8184[arg0][0][arg1]) * arg2 + (float) this.field8184[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method3456(var5);
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(IIF)F")
    private final float method3458(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field8185[arg0][1][arg1] - this.field8185[arg0][0][arg1]) * arg2 + (float) this.field8185[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "()V")
    public static void method3459() {
        field8181 = null;
        field8182 = null;
    }
}
