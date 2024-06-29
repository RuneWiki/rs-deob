import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uia")
public class class564 {

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "[[[I")
    private int[][][] field7894 = new int[2][2][4];

    @OriginalMember(owner = "client!uia", name = "g", descriptor = "[I")
    private int[] field7900 = new int[2];

    @OriginalMember(owner = "client!uia", name = "h", descriptor = "[I")
    public int[] field7901 = new int[2];

    @OriginalMember(owner = "client!uia", name = "e", descriptor = "[[[I")
    private int[][][] field7898 = new int[2][2][4];

    @OriginalMember(owner = "client!uia", name = "f", descriptor = "[[I")
    public static int[][] field7899 = new int[2][8];

    @OriginalMember(owner = "client!uia", name = "d", descriptor = "[[F")
    private static float[][] field7897 = new float[2][8];

    @OriginalMember(owner = "client!uia", name = "c", descriptor = "F")
    private static float field7896;

    @OriginalMember(owner = "client!uia", name = "b", descriptor = "I")
    public static int field7895;

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "()V")
    public static void method3183() {
        field7897 = null;
        field7899 = null;
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(F)F")
    private static final float method3184(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(IF)I")
    public final int method3185(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field7900[1] - this.field7900[0]) * arg1 + (float) this.field7900[0];
            float var4 = var3 * 0.0030517578F;
            field7896 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field7895 = (int) (field7896 * 65536.0F);
        }
        if (this.field7901[arg0] == 0) {
            return 0;
        }
        float var5 = this.method3187(arg0, 0, arg1);
        field7897[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method3186(arg0, 0, arg1));
        field7897[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field7901[arg0]; var6++) {
            float var9 = this.method3187(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method3186(arg0, var6, arg1));
            float var11 = var9 * var9;
            field7897[arg0][var6 * 2 + 1] = field7897[arg0][var6 * 2 - 1] * var11;
            field7897[arg0][var6 * 2] = field7897[arg0][var6 * 2 - 1] * var10 + field7897[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field7897[arg0][var12] += field7897[arg0][var12 - 1] * var10 + field7897[arg0][var12 - 2] * var11;
            }
            field7897[arg0][1] += field7897[arg0][0] * var10 + var11;
            field7897[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field7901[0] * 2; var7++) {
                field7897[0][var7] *= field7896;
            }
        }
        for (int var8 = 0; var8 < this.field7901[arg0] * 2; var8++) {
            field7899[arg0][var8] = (int) (field7897[arg0][var8] * 65536.0F);
        }
        return this.field7901[arg0] * 2;
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(IIF)F")
    private final float method3186(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field7898[arg0][1][arg1] - this.field7898[arg0][0][arg1]) * arg2 + (float) this.field7898[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method3184(var5);
    }

    @OriginalMember(owner = "client!uia", name = "b", descriptor = "(IIF)F")
    private final float method3187(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field7894[arg0][1][arg1] - this.field7894[arg0][0][arg1]) * arg2 + (float) this.field7894[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(Ltn;Lud;)V")
    public final void method3188(class179 arg0, class94 arg1) {
        int var3 = arg0.method1094(255);
        this.field7901[0] = var3 >> 4;
        this.field7901[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field7900[0] = this.field7900[1] = 0;
            return;
        }
        this.field7900[0] = arg0.method1107(false);
        this.field7900[1] = arg0.method1107(false);
        int var4 = arg0.method1094(255);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field7901[var5]; var8++) {
                this.field7898[var5][0][var8] = arg0.method1107(false);
                this.field7894[var5][0][var8] = arg0.method1107(false);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field7901[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field7898[var6][1][var7] = this.field7898[var6][0][var7];
                    this.field7894[var6][1][var7] = this.field7894[var6][0][var7];
                } else {
                    this.field7898[var6][1][var7] = arg0.method1107(false);
                    this.field7894[var6][1][var7] = arg0.method1107(false);
                }
            }
        }
        if (var4 != 0 || this.field7900[1] != this.field7900[0]) {
            arg1.method645(arg0);
        }
    }
}
