import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class152 {

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "[[[I")
    private int[][][] field2473 = new int[2][2][4];

    @OriginalMember(owner = "client!kn", name = "h", descriptor = "[I")
    private int[] field2478 = new int[2];

    @OriginalMember(owner = "client!kn", name = "e", descriptor = "[I")
    public int[] field2475 = new int[2];

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "[[[I")
    private int[][][] field2471 = new int[2][2][4];

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "[[I")
    public static int[][] field2472 = new int[2][8];

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "[[F")
    private static float[][] field2474 = new float[2][8];

    @OriginalMember(owner = "client!kn", name = "g", descriptor = "F")
    private static float field2477;

    @OriginalMember(owner = "client!kn", name = "f", descriptor = "I")
    public static int field2476;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIF)F", line = 6)
    private final float method987(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2473[arg0][1][arg1] - this.field2473[arg0][0][arg1]) * arg2 + (float) this.field2473[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method990(var5);
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "()V", line = 13)
    public static void method988() {
        field2474 = (float[][]) null;
        field2472 = (int[][]) null;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Lag;Lpm;)V", line = 29)
    public final void method989(class202 arg0, class261 arg1) {
        int var3 = arg0.method1317((byte) -71);
        this.field2475[0] = var3 >> 4;
        this.field2475[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field2478[0] = this.field2478[1] = 0;
            return;
        }
        this.field2478[0] = arg0.method1315(14289);
        this.field2478[1] = arg0.method1315(14289);
        int var4 = arg0.method1317((byte) -114);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field2475[var5]; var6++) {
                this.field2473[var5][0][var6] = arg0.method1315(14289);
                this.field2471[var5][0][var6] = arg0.method1315(14289);
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field2475[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field2473[var7][1][var8] = this.field2473[var7][0][var8];
                    this.field2471[var7][1][var8] = this.field2471[var7][0][var8];
                } else {
                    this.field2473[var7][1][var8] = arg0.method1315(14289);
                    this.field2471[var7][1][var8] = arg0.method1315(14289);
                }
            }
        }
        if (var4 != 0 || this.field2478[1] != this.field2478[0]) {
            arg1.method1753(arg0);
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(F)F", line = 96)
    private static final float method990(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IF)I", line = 100)
    public final int method991(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field2478[1] - this.field2478[0]) * arg1 + (float) this.field2478[0];
            float var4 = var3 * 0.0030517578F;
            field2477 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field2476 = (int) (field2477 * 65536.0F);
        }
        if (this.field2475[arg0] == 0) {
            return 0;
        }
        float var5 = this.method992(arg0, 0, arg1);
        field2474[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method987(arg0, 0, arg1));
        field2474[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field2475[arg0]; var6++) {
            float var7 = this.method992(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method987(arg0, var6, arg1));
            float var9 = var7 * var7;
            field2474[arg0][var6 * 2 + 1] = field2474[arg0][var6 * 2 - 1] * var9;
            field2474[arg0][var6 * 2] = field2474[arg0][var6 * 2 - 1] * var8 + field2474[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field2474[arg0][var10] += field2474[arg0][var10 - 1] * var8 + field2474[arg0][var10 - 2] * var9;
            }
            field2474[arg0][1] += field2474[arg0][0] * var8 + var9;
            field2474[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field2475[0] * 2; var11++) {
                field2474[0][var11] *= field2477;
            }
        }
        for (int var12 = 0; var12 < this.field2475[arg0] * 2; var12++) {
            field2472[arg0][var12] = (int) (field2474[arg0][var12] * 65536.0F);
        }
        return this.field2475[arg0] * 2;
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(IIF)F", line = 167)
    private final float method992(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2471[arg0][1][arg1] - this.field2471[arg0][0][arg1]) * arg2 + (float) this.field2471[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }
}
