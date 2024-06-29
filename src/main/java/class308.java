import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vw")
public class class308 {

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "[I")
    private int[] field4058 = new int[2];

    @OriginalMember(owner = "client!vw", name = "b", descriptor = "[[[I")
    private int[][][] field4059 = new int[2][2][4];

    @OriginalMember(owner = "client!vw", name = "g", descriptor = "[[[I")
    private int[][][] field4064 = new int[2][2][4];

    @OriginalMember(owner = "client!vw", name = "d", descriptor = "[I")
    public int[] field4061 = new int[2];

    @OriginalMember(owner = "client!vw", name = "f", descriptor = "[[I")
    public static int[][] field4063 = new int[2][8];

    @OriginalMember(owner = "client!vw", name = "e", descriptor = "[[F")
    private static float[][] field4062 = new float[2][8];

    @OriginalMember(owner = "client!vw", name = "h", descriptor = "F")
    private static float field4065;

    @OriginalMember(owner = "client!vw", name = "c", descriptor = "I")
    public static int field4060;

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(F)F")
    private static final float method1849(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(IIF)F")
    private final float method1850(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field4064[arg0][1][arg1] - this.field4064[arg0][0][arg1]) * arg2 + (float) this.field4064[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "()V")
    public static void method1851() {
        field4062 = null;
        field4063 = null;
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(Lsl;Lnha;)V")
    public final void method1852(class461 arg0, class325 arg1) {
        int var3 = arg0.method2600((byte) -127);
        this.field4061[0] = var3 >> 4;
        this.field4061[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field4058[0] = this.field4058[1] = 0;
            return;
        }
        this.field4058[0] = arg0.method2566(-2);
        this.field4058[1] = arg0.method2566(-2);
        int var4 = arg0.method2600((byte) -125);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field4061[var5]; var8++) {
                this.field4059[var5][0][var8] = arg0.method2566(-2);
                this.field4064[var5][0][var8] = arg0.method2566(-2);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field4061[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field4059[var6][1][var7] = this.field4059[var6][0][var7];
                    this.field4064[var6][1][var7] = this.field4064[var6][0][var7];
                } else {
                    this.field4059[var6][1][var7] = arg0.method2566(-2);
                    this.field4064[var6][1][var7] = arg0.method2566(-2);
                }
            }
        }
        if (var4 != 0 || this.field4058[1] != this.field4058[0]) {
            arg1.method1900(arg0);
        }
    }

    @OriginalMember(owner = "client!vw", name = "b", descriptor = "(IIF)F")
    private final float method1853(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field4059[arg0][1][arg1] - this.field4059[arg0][0][arg1]) * arg2 + (float) this.field4059[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1849(var5);
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(IF)I")
    public final int method1854(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field4058[1] - this.field4058[0]) * arg1 + (float) this.field4058[0];
            float var4 = var3 * 0.0030517578F;
            field4065 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field4060 = (int) (field4065 * 65536.0F);
        }
        if (this.field4061[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1850(arg0, 0, arg1);
        field4062[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1853(arg0, 0, arg1));
        field4062[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field4061[arg0]; var6++) {
            float var9 = this.method1850(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method1853(arg0, var6, arg1));
            float var11 = var9 * var9;
            field4062[arg0][var6 * 2 + 1] = field4062[arg0][var6 * 2 - 1] * var11;
            field4062[arg0][var6 * 2] = field4062[arg0][var6 * 2 - 1] * var10 + field4062[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field4062[arg0][var12] += field4062[arg0][var12 - 1] * var10 + field4062[arg0][var12 - 2] * var11;
            }
            field4062[arg0][1] += field4062[arg0][0] * var10 + var11;
            field4062[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field4061[0] * 2; var7++) {
                field4062[0][var7] *= field4065;
            }
        }
        for (int var8 = 0; var8 < this.field4061[arg0] * 2; var8++) {
            field4063[arg0][var8] = (int) (field4062[arg0][var8] * 65536.0F);
        }
        return this.field4061[arg0] * 2;
    }
}
