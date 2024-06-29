import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class191 {

    @OriginalMember(owner = "client!tr", name = "d", descriptor = "[[[I")
    private int[][][] field2805 = new int[2][2][4];

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "[I")
    private int[] field2803 = new int[2];

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "[[[I")
    private int[][][] field2804 = new int[2][2][4];

    @OriginalMember(owner = "client!tr", name = "g", descriptor = "[I")
    public int[] field2808 = new int[2];

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "[[I")
    public static int[][] field2802 = new int[2][8];

    @OriginalMember(owner = "client!tr", name = "h", descriptor = "[[F")
    private static float[][] field2809 = new float[2][8];

    @OriginalMember(owner = "client!tr", name = "f", descriptor = "F")
    private static float field2807;

    @OriginalMember(owner = "client!tr", name = "e", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IF)I", line = 6)
    public final int method1305(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field2803[1] - this.field2803[0]) * arg1 + (float) this.field2803[0];
            float var4 = var3 * 0.0030517578F;
            field2807 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field2806 = (int) (field2807 * 65536.0F);
        }
        if (this.field2808[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1310(arg0, 0, arg1);
        field2809[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1308(arg0, 0, arg1));
        field2809[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field2808[arg0]; var6++) {
            float var9 = this.method1310(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method1308(arg0, var6, arg1));
            float var11 = var9 * var9;
            field2809[arg0][var6 * 2 + 1] = field2809[arg0][var6 * 2 - 1] * var11;
            field2809[arg0][var6 * 2] = field2809[arg0][var6 * 2 - 1] * var10 + field2809[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field2809[arg0][var12] += field2809[arg0][var12 - 1] * var10 + field2809[arg0][var12 - 2] * var11;
            }
            field2809[arg0][1] += field2809[arg0][0] * var10 + var11;
            field2809[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field2808[0] * 2; var7++) {
                field2809[0][var7] *= field2807;
            }
        }
        for (int var8 = 0; var8 < this.field2808[arg0] * 2; var8++) {
            field2802[arg0][var8] = (int) (field2809[arg0][var8] * 65536.0F);
        }
        return this.field2808[arg0] * 2;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(F)F", line = 66)
    private static final float method1306(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lti;Lde;)V", line = 71)
    public final void method1307(class303 arg0, class368 arg1) {
        int var3 = arg0.method1918((byte) -102);
        this.field2808[0] = var3 >> 4;
        this.field2808[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field2803[0] = this.field2803[1] = 0;
            return;
        }
        this.field2803[0] = arg0.method1868(0);
        this.field2803[1] = arg0.method1868(0);
        int var4 = arg0.method1918((byte) -96);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field2808[var5]; var8++) {
                this.field2804[var5][0][var8] = arg0.method1868(0);
                this.field2805[var5][0][var8] = arg0.method1868(0);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field2808[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field2804[var6][1][var7] = this.field2804[var6][0][var7];
                    this.field2805[var6][1][var7] = this.field2805[var6][0][var7];
                } else {
                    this.field2804[var6][1][var7] = arg0.method1868(0);
                    this.field2805[var6][1][var7] = arg0.method1868(0);
                }
            }
        }
        if (var4 != 0 || this.field2803[1] != this.field2803[0]) {
            arg1.method2364(arg0);
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIF)F", line = 137)
    private final float method1308(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2804[arg0][1][arg1] - this.field2804[arg0][0][arg1]) * arg2 + (float) this.field2804[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1306(var5);
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "()V", line = 142)
    public static void method1309() {
        field2809 = null;
        field2802 = null;
    }

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "(IIF)F", line = 152)
    private final float method1310(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2805[arg0][1][arg1] - this.field2805[arg0][0][arg1]) * arg2 + (float) this.field2805[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }
}
