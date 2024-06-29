import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class253 {

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "[[[I")
    private int[][][] field4301 = new int[2][2][4];

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "[I")
    private int[] field4305 = new int[2];

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "[I")
    public int[] field4306 = new int[2];

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "[[[I")
    private int[][][] field4304 = new int[2][2][4];

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "[[I")
    public static int[][] field4307 = new int[2][8];

    @OriginalMember(owner = "client!cm", name = "h", descriptor = "[[F")
    private static float[][] field4308 = new float[2][8];

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "F")
    private static float field4303;

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "I")
    public static int field4302;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IF)I", line = 3)
    public final int method1765(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field4305[1] - this.field4305[0]) * arg1 + (float) this.field4305[0];
            float var4 = var3 * 0.0030517578F;
            field4303 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field4302 = (int) (field4303 * 65536.0F);
        }
        if (this.field4306[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1767(arg0, 0, arg1);
        field4308[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1769(arg0, 0, arg1));
        field4308[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field4306[arg0]; var6++) {
            float var7 = this.method1767(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1769(arg0, var6, arg1));
            float var9 = var7 * var7;
            field4308[arg0][var6 * 2 + 1] = field4308[arg0][var6 * 2 - 1] * var9;
            field4308[arg0][var6 * 2] = field4308[arg0][var6 * 2 - 1] * var8 + field4308[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field4308[arg0][var10] += field4308[arg0][var10 - 1] * var8 + field4308[arg0][var10 - 2] * var9;
            }
            field4308[arg0][1] += field4308[arg0][0] * var8 + var9;
            field4308[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field4306[0] * 2; var11++) {
                field4308[0][var11] *= field4303;
            }
        }
        for (int var12 = 0; var12 < this.field4306[arg0] * 2; var12++) {
            field4307[arg0][var12] = (int) (field4308[arg0][var12] * 65536.0F);
        }
        return this.field4306[arg0] * 2;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lmi;Lse;)V", line = 72)
    public final void method1766(class92 arg0, class93 arg1) {
        int var3 = arg0.method702(-1);
        this.field4306[0] = var3 >> 4;
        this.field4306[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field4305[0] = this.field4305[1] = 0;
            return;
        }
        this.field4305[0] = arg0.method721(28);
        this.field4305[1] = arg0.method721(62);
        int var4 = arg0.method702(-1);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field4306[var5]; var6++) {
                this.field4301[var5][0][var6] = arg0.method721(85);
                this.field4304[var5][0][var6] = arg0.method721(117);
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field4306[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field4301[var7][1][var8] = this.field4301[var7][0][var8];
                    this.field4304[var7][1][var8] = this.field4304[var7][0][var8];
                } else {
                    this.field4301[var7][1][var8] = arg0.method721(28);
                    this.field4304[var7][1][var8] = arg0.method721(46);
                }
            }
        }
        if (var4 != 0 || this.field4305[1] != this.field4305[0]) {
            arg1.method752(arg0);
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIF)F", line = 148)
    private final float method1767(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field4304[arg0][1][arg1] - this.field4304[arg0][0][arg1]) * arg2 + (float) this.field4304[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(F)F", line = 154)
    private static final float method1768(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(IIF)F", line = 159)
    private final float method1769(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field4301[arg0][1][arg1] - this.field4301[arg0][0][arg1]) * arg2 + (float) this.field4301[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1768(var5);
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "()V", line = 167)
    public static void method1770() {
        field4308 = (float[][]) null;
        field4307 = (int[][]) null;
    }
}
