import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class332 {

    @OriginalMember(owner = "client!si", name = "b", descriptor = "[[[I")
    private int[][][] field4494 = new int[2][2][4];

    @OriginalMember(owner = "client!si", name = "a", descriptor = "[[[I")
    private int[][][] field4493 = new int[2][2][4];

    @OriginalMember(owner = "client!si", name = "g", descriptor = "[I")
    public int[] field4499 = new int[2];

    @OriginalMember(owner = "client!si", name = "h", descriptor = "[I")
    private int[] field4500 = new int[2];

    @OriginalMember(owner = "client!si", name = "c", descriptor = "[[F")
    private static float[][] field4495 = new float[2][8];

    @OriginalMember(owner = "client!si", name = "f", descriptor = "[[I")
    public static int[][] field4498 = new int[2][8];

    @OriginalMember(owner = "client!si", name = "d", descriptor = "F")
    private static float field4496;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "I")
    public static int field4497;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(F)F")
    private static final float method2062(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIF)F")
    private final float method2063(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field4494[arg0][1][arg1] - this.field4494[arg0][0][arg1]) * arg2 + (float) this.field4494[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IF)I")
    public final int method2064(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field4500[1] - this.field4500[0]) * arg1 + (float) this.field4500[0];
            float var4 = var3 * 0.0030517578F;
            field4496 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field4497 = (int) (field4496 * 65536.0F);
        }
        if (this.field4499[arg0] == 0) {
            return 0;
        }
        float var5 = this.method2063(arg0, 0, arg1);
        field4495[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method2067(arg0, 0, arg1));
        field4495[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field4499[arg0]; var6++) {
            float var9 = this.method2063(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method2067(arg0, var6, arg1));
            float var11 = var9 * var9;
            field4495[arg0][var6 * 2 + 1] = field4495[arg0][var6 * 2 - 1] * var11;
            field4495[arg0][var6 * 2] = field4495[arg0][var6 * 2 - 1] * var10 + field4495[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field4495[arg0][var12] += field4495[arg0][var12 - 1] * var10 + field4495[arg0][var12 - 2] * var11;
            }
            field4495[arg0][1] += field4495[arg0][0] * var10 + var11;
            field4495[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field4499[0] * 2; var7++) {
                field4495[0][var7] *= field4496;
            }
        }
        for (int var8 = 0; var8 < this.field4499[arg0] * 2; var8++) {
            field4498[arg0][var8] = (int) (field4495[arg0][var8] * 65536.0F);
        }
        return this.field4499[arg0] * 2;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Leb;Lgh;)V")
    public final void method2065(class371 arg0, class325 arg1) {
        int var3 = arg0.method2429(0);
        this.field4499[0] = var3 >> 4;
        this.field4499[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field4500[0] = this.field4500[1] = 0;
            return;
        }
        this.field4500[0] = arg0.method2403((byte) 53);
        this.field4500[1] = arg0.method2403((byte) 66);
        int var4 = arg0.method2429(0);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field4499[var5]; var8++) {
                this.field4493[var5][0][var8] = arg0.method2403((byte) 101);
                this.field4494[var5][0][var8] = arg0.method2403((byte) 76);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field4499[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field4493[var6][1][var7] = this.field4493[var6][0][var7];
                    this.field4494[var6][1][var7] = this.field4494[var6][0][var7];
                } else {
                    this.field4493[var6][1][var7] = arg0.method2403((byte) 41);
                    this.field4494[var6][1][var7] = arg0.method2403((byte) 119);
                }
            }
        }
        if (var4 != 0 || this.field4500[1] != this.field4500[0]) {
            arg1.method2047(arg0);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "()V")
    public static void method2066() {
        field4495 = null;
        field4498 = null;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(IIF)F")
    private final float method2067(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field4493[arg0][1][arg1] - this.field4493[arg0][0][arg1]) * arg2 + (float) this.field4493[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method2062(var5);
    }
}
