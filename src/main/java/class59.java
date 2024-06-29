import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class59 {

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "[[[I")
    private int[][][] field1261 = new int[2][2][4];

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "[I")
    private int[] field1263 = new int[2];

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "[[[I")
    private int[][][] field1265 = new int[2][2][4];

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "[I")
    public int[] field1266 = new int[2];

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "[[I")
    public static int[][] field1259 = new int[2][8];

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "[[F")
    private static float[][] field1264 = new float[2][8];

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "F")
    private static float field1262;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIF)F")
    private final float method445(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1265[arg0][1][arg1] - this.field1265[arg0][0][arg1]) * arg2 + (float) this.field1265[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(F)F")
    private static final float method446(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lmc;Lmb;)V")
    public final void method447(class86 arg0, class85 arg1) {
        int var3 = arg0.method646(-15447);
        this.field1266[0] = var3 >> 4;
        this.field1266[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field1263[0] = this.field1263[1] = 0;
            return;
        }
        this.field1263[0] = arg0.method632((byte) -80);
        this.field1263[1] = arg0.method632((byte) -80);
        int var4 = arg0.method646(-15447);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field1266[var5]; var8++) {
                this.field1261[var5][0][var8] = arg0.method632((byte) -80);
                this.field1265[var5][0][var8] = arg0.method632((byte) -80);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field1266[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field1261[var6][1][var7] = this.field1261[var6][0][var7];
                    this.field1265[var6][1][var7] = this.field1265[var6][0][var7];
                } else {
                    this.field1261[var6][1][var7] = arg0.method632((byte) -80);
                    this.field1265[var6][1][var7] = arg0.method632((byte) -80);
                }
            }
        }
        if (var4 != 0 || this.field1263[1] != this.field1263[0]) {
            arg1.method620(arg0);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IF)I")
    public final int method448(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1263[1] - this.field1263[0]) * arg1 + (float) this.field1263[0];
            float var4 = var3 * 0.0030517578F;
            field1262 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field1260 = (int) (field1262 * 65536.0F);
        }
        if (this.field1266[arg0] == 0) {
            return 0;
        }
        float var5 = this.method445(arg0, 0, arg1);
        field1264[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method449(arg0, 0, arg1));
        field1264[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1266[arg0]; var6++) {
            float var9 = this.method445(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method449(arg0, var6, arg1));
            float var11 = var9 * var9;
            field1264[arg0][var6 * 2 + 1] = field1264[arg0][var6 * 2 - 1] * var11;
            field1264[arg0][var6 * 2] = field1264[arg0][var6 * 2 - 1] * var10 + field1264[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field1264[arg0][var12] += field1264[arg0][var12 - 1] * var10 + field1264[arg0][var12 - 2] * var11;
            }
            field1264[arg0][1] += field1264[arg0][0] * var10 + var11;
            field1264[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field1266[0] * 2; var7++) {
                field1264[0][var7] *= field1262;
            }
        }
        for (int var8 = 0; var8 < this.field1266[arg0] * 2; var8++) {
            field1259[arg0][var8] = (int) (field1264[arg0][var8] * 65536.0F);
        }
        return this.field1266[arg0] * 2;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(IIF)F")
    private final float method449(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1261[arg0][1][arg1] - this.field1261[arg0][0][arg1]) * arg2 + (float) this.field1261[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method446(var5);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "()V")
    public static void method450() {
        field1264 = null;
        field1259 = null;
    }
}
