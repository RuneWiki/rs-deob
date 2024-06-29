import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class296 {

    @OriginalMember(owner = "client!mq", name = "d", descriptor = "[[[I")
    private int[][][] field4226 = new int[2][2][4];

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "[I")
    public int[] field4224 = new int[2];

    @OriginalMember(owner = "client!mq", name = "f", descriptor = "[[[I")
    private int[][][] field4228 = new int[2][2][4];

    @OriginalMember(owner = "client!mq", name = "e", descriptor = "[I")
    private int[] field4227 = new int[2];

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "[[I")
    public static int[][] field4223 = new int[2][8];

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "[[F")
    private static float[][] field4225 = new float[2][8];

    @OriginalMember(owner = "client!mq", name = "g", descriptor = "F")
    private static float field4229;

    @OriginalMember(owner = "client!mq", name = "h", descriptor = "I")
    public static int field4230;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lbk;Ljh;)V", line = 8)
    public final void method1872(class211 arg0, class89 arg1) {
        int var3 = arg0.method1342((byte) -127);
        this.field4224[0] = var3 >> 4;
        this.field4224[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field4227[0] = this.field4227[1] = 0;
            return;
        }
        this.field4227[0] = arg0.method1355(32136);
        this.field4227[1] = arg0.method1355(32136);
        int var4 = arg0.method1342((byte) -127);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field4224[var5]; var8++) {
                this.field4226[var5][0][var8] = arg0.method1355(32136);
                this.field4228[var5][0][var8] = arg0.method1355(32136);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field4224[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field4226[var6][1][var7] = this.field4226[var6][0][var7];
                    this.field4228[var6][1][var7] = this.field4228[var6][0][var7];
                } else {
                    this.field4226[var6][1][var7] = arg0.method1355(32136);
                    this.field4228[var6][1][var7] = arg0.method1355(32136);
                }
            }
        }
        if (var4 != 0 || this.field4227[1] != this.field4227[0]) {
            arg1.method482(arg0);
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIF)F", line = 74)
    private final float method1873(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field4228[arg0][1][arg1] - this.field4228[arg0][0][arg1]) * arg2 + (float) this.field4228[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IF)I", line = 79)
    public final int method1874(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field4227[1] - this.field4227[0]) * arg1 + (float) this.field4227[0];
            float var4 = var3 * 0.0030517578F;
            field4229 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field4230 = (int) (field4229 * 65536.0F);
        }
        if (this.field4224[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1873(arg0, 0, arg1);
        field4225[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1876(arg0, 0, arg1));
        field4225[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field4224[arg0]; var6++) {
            float var9 = this.method1873(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method1876(arg0, var6, arg1));
            float var11 = var9 * var9;
            field4225[arg0][var6 * 2 + 1] = field4225[arg0][var6 * 2 - 1] * var11;
            field4225[arg0][var6 * 2] = field4225[arg0][var6 * 2 - 1] * var10 + field4225[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field4225[arg0][var12] += field4225[arg0][var12 - 1] * var10 + field4225[arg0][var12 - 2] * var11;
            }
            field4225[arg0][1] += field4225[arg0][0] * var10 + var11;
            field4225[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field4224[0] * 2; var7++) {
                field4225[0][var7] *= field4229;
            }
        }
        for (int var8 = 0; var8 < this.field4224[arg0] * 2; var8++) {
            field4223[arg0][var8] = (int) (field4225[arg0][var8] * 65536.0F);
        }
        return this.field4224[arg0] * 2;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "()V", line = 146)
    public static void method1875() {
        field4225 = null;
        field4223 = null;
    }

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(IIF)F", line = 152)
    private final float method1876(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field4226[arg0][1][arg1] - this.field4226[arg0][0][arg1]) * arg2 + (float) this.field4226[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1877(var5);
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(F)F", line = 178)
    private static final float method1877(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }
}
