import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("we")
public class class207 {

    @OriginalMember(owner = "we", name = "c", descriptor = "[I")
    private int[] field4057 = new int[2];

    @OriginalMember(owner = "we", name = "f", descriptor = "[[[I")
    private int[][][] field4060 = new int[2][2][4];

    @OriginalMember(owner = "we", name = "d", descriptor = "[I")
    public int[] field4058 = new int[2];

    @OriginalMember(owner = "we", name = "g", descriptor = "[[[I")
    private int[][][] field4061 = new int[2][2][4];

    @OriginalMember(owner = "we", name = "b", descriptor = "[[I")
    public static int[][] field4056 = new int[2][8];

    @OriginalMember(owner = "we", name = "e", descriptor = "[[F")
    private static float[][] field4059 = new float[2][8];

    @OriginalMember(owner = "we", name = "h", descriptor = "F")
    private static float field4062;

    @OriginalMember(owner = "we", name = "a", descriptor = "I")
    public static int field4055;

    @OriginalMember(owner = "we", name = "a", descriptor = "()V")
    public static void method1354() {
        field4059 = null;
        field4056 = null;
    }

    @OriginalMember(owner = "we", name = "a", descriptor = "(Lja;Lta;)V")
    public final void method1355(class86 arg0, class176 arg1) {
        int var3 = arg0.method598((byte) 96);
        this.field4058[0] = var3 >> 4;
        this.field4058[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field4057[0] = this.field4057[1] = 0;
            return;
        }
        this.field4057[0] = arg0.method569(true);
        this.field4057[1] = arg0.method569(true);
        int var4 = arg0.method598((byte) 105);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field4058[var5]; var8++) {
                this.field4061[var5][0][var8] = arg0.method569(true);
                this.field4060[var5][0][var8] = arg0.method569(true);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field4058[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field4061[var6][1][var7] = this.field4061[var6][0][var7];
                    this.field4060[var6][1][var7] = this.field4060[var6][0][var7];
                } else {
                    this.field4061[var6][1][var7] = arg0.method569(true);
                    this.field4060[var6][1][var7] = arg0.method569(true);
                }
            }
        }
        if (var4 != 0 || this.field4057[1] != this.field4057[0]) {
            arg1.method1205(arg0);
        }
    }

    @OriginalMember(owner = "we", name = "a", descriptor = "(IIF)F")
    private final float method1356(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field4060[arg0][1][arg1] - this.field4060[arg0][0][arg1]) * arg2 + (float) this.field4060[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "we", name = "b", descriptor = "(IIF)F")
    private final float method1357(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field4061[arg0][1][arg1] - this.field4061[arg0][0][arg1]) * arg2 + (float) this.field4061[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1359(var5);
    }

    @OriginalMember(owner = "we", name = "a", descriptor = "(IF)I")
    public final int method1358(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field4057[1] - this.field4057[0]) * arg1 + (float) this.field4057[0];
            float var4 = var3 * 0.0030517578F;
            field4062 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field4055 = (int) (field4062 * 65536.0F);
        }
        if (this.field4058[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1356(arg0, 0, arg1);
        field4059[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1357(arg0, 0, arg1));
        field4059[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field4058[arg0]; var6++) {
            float var9 = this.method1356(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method1357(arg0, var6, arg1));
            float var11 = var9 * var9;
            field4059[arg0][var6 * 2 + 1] = field4059[arg0][var6 * 2 - 1] * var11;
            field4059[arg0][var6 * 2] = field4059[arg0][var6 * 2 - 1] * var10 + field4059[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field4059[arg0][var12] += field4059[arg0][var12 - 1] * var10 + field4059[arg0][var12 - 2] * var11;
            }
            field4059[arg0][1] += field4059[arg0][0] * var10 + var11;
            field4059[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field4058[0] * 2; var7++) {
                field4059[0][var7] *= field4062;
            }
        }
        for (int var8 = 0; var8 < this.field4058[arg0] * 2; var8++) {
            field4056[arg0][var8] = (int) (field4059[arg0][var8] * 65536.0F);
        }
        return this.field4058[arg0] * 2;
    }

    @OriginalMember(owner = "we", name = "a", descriptor = "(F)F")
    private static final float method1359(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }
}
