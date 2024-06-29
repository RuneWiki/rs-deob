import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class560 {

    @OriginalMember(owner = "client!po", name = "a", descriptor = "[[[I")
    private int[][][] field8000 = new int[2][2][4];

    @OriginalMember(owner = "client!po", name = "e", descriptor = "[I")
    private int[] field8004 = new int[2];

    @OriginalMember(owner = "client!po", name = "h", descriptor = "[[[I")
    private int[][][] field8007 = new int[2][2][4];

    @OriginalMember(owner = "client!po", name = "f", descriptor = "[I")
    public int[] field8005 = new int[2];

    @OriginalMember(owner = "client!po", name = "c", descriptor = "[[I")
    public static int[][] field8002 = new int[2][8];

    @OriginalMember(owner = "client!po", name = "g", descriptor = "[[F")
    private static float[][] field8006 = new float[2][8];

    @OriginalMember(owner = "client!po", name = "d", descriptor = "F")
    private static float field8003;

    @OriginalMember(owner = "client!po", name = "b", descriptor = "I")
    public static int field8001;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IIF)F")
    private final float method3271(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field8000[arg0][1][arg1] - this.field8000[arg0][0][arg1]) * arg2 + (float) this.field8000[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(F)F")
    private static final float method3272(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Lrg;Loea;)V")
    public final void method3273(class645 arg0, class599 arg1) {
        int var3 = arg0.method3745(-6314);
        this.field8005[0] = var3 >> 4;
        this.field8005[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field8004[0] = this.field8004[1] = 0;
            return;
        }
        this.field8004[0] = arg0.method3712((byte) 65);
        this.field8004[1] = arg0.method3712((byte) 2);
        int var4 = arg0.method3745(-6314);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field8005[var5]; var8++) {
                this.field8007[var5][0][var8] = arg0.method3712((byte) -112);
                this.field8000[var5][0][var8] = arg0.method3712((byte) -122);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field8005[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field8007[var6][1][var7] = this.field8007[var6][0][var7];
                    this.field8000[var6][1][var7] = this.field8000[var6][0][var7];
                } else {
                    this.field8007[var6][1][var7] = arg0.method3712((byte) -15);
                    this.field8000[var6][1][var7] = arg0.method3712((byte) -127);
                }
            }
        }
        if (var4 != 0 || this.field8004[1] != this.field8004[0]) {
            arg1.method3487(arg0);
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IF)I")
    public final int method3274(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field8004[1] - this.field8004[0]) * arg1 + (float) this.field8004[0];
            float var4 = var3 * 0.0030517578F;
            field8003 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field8001 = (int) (field8003 * 65536.0F);
        }
        if (this.field8005[arg0] == 0) {
            return 0;
        }
        float var5 = this.method3271(arg0, 0, arg1);
        field8006[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method3275(arg0, 0, arg1));
        field8006[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field8005[arg0]; var6++) {
            float var9 = this.method3271(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method3275(arg0, var6, arg1));
            float var11 = var9 * var9;
            field8006[arg0][var6 * 2 + 1] = field8006[arg0][var6 * 2 - 1] * var11;
            field8006[arg0][var6 * 2] = field8006[arg0][var6 * 2 - 1] * var10 + field8006[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field8006[arg0][var12] += field8006[arg0][var12 - 1] * var10 + field8006[arg0][var12 - 2] * var11;
            }
            field8006[arg0][1] += field8006[arg0][0] * var10 + var11;
            field8006[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field8005[0] * 2; var7++) {
                field8006[0][var7] *= field8003;
            }
        }
        for (int var8 = 0; var8 < this.field8005[arg0] * 2; var8++) {
            field8002[arg0][var8] = (int) (field8006[arg0][var8] * 65536.0F);
        }
        return this.field8005[arg0] * 2;
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(IIF)F")
    private final float method3275(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field8007[arg0][1][arg1] - this.field8007[arg0][0][arg1]) * arg2 + (float) this.field8007[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method3272(var5);
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "()V")
    public static void method3276() {
        field8006 = null;
        field8002 = null;
    }
}
