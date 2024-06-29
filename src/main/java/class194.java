import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class194 {

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "[[[I")
    private int[][][] field3060 = new int[2][2][4];

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "[I")
    public int[] field3062 = new int[2];

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "[[[I")
    private int[][][] field3064 = new int[2][2][4];

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "[I")
    private int[] field3067 = new int[2];

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "[[F")
    private static float[][] field3065 = new float[2][8];

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "[[I")
    public static int[][] field3066 = new int[2][8];

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "F")
    private static float field3063;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lf;Lma;)V")
    public final void method1300(class37 arg0, class193 arg1) {
        int var3 = arg0.method333((byte) -59);
        this.field3062[0] = var3 >> 4;
        this.field3062[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field3067[0] = this.field3067[1] = 0;
            return;
        }
        this.field3067[0] = arg0.method293(122);
        this.field3067[1] = arg0.method293(-1);
        int var4 = arg0.method333((byte) -59);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field3062[var5]; var8++) {
                this.field3060[var5][0][var8] = arg0.method293(-123);
                this.field3064[var5][0][var8] = arg0.method293(4);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field3062[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field3060[var6][1][var7] = this.field3060[var6][0][var7];
                    this.field3064[var6][1][var7] = this.field3064[var6][0][var7];
                } else {
                    this.field3060[var6][1][var7] = arg0.method293(-44);
                    this.field3064[var6][1][var7] = arg0.method293(117);
                }
            }
        }
        if (var4 != 0 || this.field3067[1] != this.field3067[0]) {
            arg1.method1296(arg0);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "()V")
    public static void method1301() {
        field3065 = null;
        field3066 = null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIF)F")
    private final float method1302(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3060[arg0][1][arg1] - this.field3060[arg0][0][arg1]) * arg2 + (float) this.field3060[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1305(var5);
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(IIF)F")
    private final float method1303(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3064[arg0][1][arg1] - this.field3064[arg0][0][arg1]) * arg2 + (float) this.field3064[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IF)I")
    public final int method1304(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field3067[1] - this.field3067[0]) * arg1 + (float) this.field3067[0];
            float var4 = var3 * 0.0030517578F;
            field3063 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field3061 = (int) (field3063 * 65536.0F);
        }
        if (this.field3062[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1303(arg0, 0, arg1);
        field3065[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1302(arg0, 0, arg1));
        field3065[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field3062[arg0]; var6++) {
            float var9 = this.method1303(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method1302(arg0, var6, arg1));
            float var11 = var9 * var9;
            field3065[arg0][var6 * 2 + 1] = field3065[arg0][var6 * 2 - 1] * var11;
            field3065[arg0][var6 * 2] = field3065[arg0][var6 * 2 - 1] * var10 + field3065[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field3065[arg0][var12] += field3065[arg0][var12 - 1] * var10 + field3065[arg0][var12 - 2] * var11;
            }
            field3065[arg0][1] += field3065[arg0][0] * var10 + var11;
            field3065[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field3062[0] * 2; var7++) {
                field3065[0][var7] *= field3063;
            }
        }
        for (int var8 = 0; var8 < this.field3062[arg0] * 2; var8++) {
            field3066[arg0][var8] = (int) (field3065[arg0][var8] * 65536.0F);
        }
        return this.field3062[arg0] * 2;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(F)F")
    private static final float method1305(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }
}
