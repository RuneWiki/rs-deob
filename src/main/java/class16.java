import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class16 {

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "[I")
    private int[] field255 = new int[2];

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "[[[I")
    private int[][][] field256 = new int[2][2][4];

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "[[[I")
    private int[][][] field250 = new int[2][2][4];

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "[I")
    public int[] field254 = new int[2];

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "[[F")
    private static float[][] field251 = new float[2][8];

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "[[I")
    public static int[][] field257 = new int[2][8];

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "F")
    private static float field253;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lug;Ldn;)V", line = 4)
    public final void method166(class25 arg0, class142 arg1) {
        int var3 = arg0.method281(-126);
        this.field254[0] = var3 >> 4;
        this.field254[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field255[0] = this.field255[1] = 0;
            return;
        }
        this.field255[0] = arg0.method314((byte) 82);
        this.field255[1] = arg0.method314((byte) 55);
        int var4 = arg0.method281(-128);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field254[var5]; var6++) {
                this.field250[var5][0][var6] = arg0.method314((byte) 33);
                this.field256[var5][0][var6] = arg0.method314((byte) 59);
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field254[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field250[var7][1][var8] = this.field250[var7][0][var8];
                    this.field256[var7][1][var8] = this.field256[var7][0][var8];
                } else {
                    this.field250[var7][1][var8] = arg0.method314((byte) 88);
                    this.field256[var7][1][var8] = arg0.method314((byte) 51);
                }
            }
        }
        if (var4 != 0 || this.field255[1] != this.field255[0]) {
            arg1.method1181(arg0);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(F)F", line = 70)
    private static final float method167(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIF)F", line = 75)
    private final float method168(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field250[arg0][1][arg1] - this.field250[arg0][0][arg1]) * arg2 + (float) this.field250[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method167(var5);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "()V", line = 90)
    public static void method169() {
        field251 = (float[][]) null;
        field257 = (int[][]) null;
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(IIF)F", line = 98)
    private final float method170(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field256[arg0][1][arg1] - this.field256[arg0][0][arg1]) * arg2 + (float) this.field256[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IF)I", line = 120)
    public final int method171(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field255[1] - this.field255[0]) * arg1 + (float) this.field255[0];
            float var4 = var3 * 0.0030517578F;
            field253 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field252 = (int) (field253 * 65536.0F);
        }
        if (this.field254[arg0] == 0) {
            return 0;
        }
        float var5 = this.method170(arg0, 0, arg1);
        field251[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method168(arg0, 0, arg1));
        field251[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field254[arg0]; var6++) {
            float var7 = this.method170(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method168(arg0, var6, arg1));
            float var9 = var7 * var7;
            field251[arg0][var6 * 2 + 1] = field251[arg0][var6 * 2 - 1] * var9;
            field251[arg0][var6 * 2] = field251[arg0][var6 * 2 - 1] * var8 + field251[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field251[arg0][var10] += field251[arg0][var10 - 1] * var8 + field251[arg0][var10 - 2] * var9;
            }
            field251[arg0][1] += field251[arg0][0] * var8 + var9;
            field251[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field254[0] * 2; var11++) {
                field251[0][var11] *= field253;
            }
        }
        for (int var12 = 0; var12 < this.field254[arg0] * 2; var12++) {
            field257[arg0][var12] = (int) (field251[arg0][var12] * 65536.0F);
        }
        return this.field254[arg0] * 2;
    }
}
