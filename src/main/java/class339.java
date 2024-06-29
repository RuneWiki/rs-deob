import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class339 {

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "[I")
    public int[] field4685 = new int[2];

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "[[[I")
    private int[][][] field4687 = new int[2][2][4];

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "[[[I")
    private int[][][] field4691 = new int[2][2][4];

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "[I")
    private int[] field4690 = new int[2];

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "[[I")
    public static int[][] field4689 = new int[2][8];

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "[[F")
    private static float[][] field4692 = new float[2][8];

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "F")
    private static float field4688;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
    public static int field4686;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(F)F")
    private static final float method2056(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IF)I")
    public final int method2057(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field4690[1] - this.field4690[0]) * arg1 + (float) this.field4690[0];
            float var4 = var3 * 0.0030517578F;
            field4688 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field4686 = (int) (field4688 * 65536.0F);
        }
        if (this.field4685[arg0] == 0) {
            return 0;
        }
        float var5 = this.method2059(arg0, 0, arg1);
        field4692[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method2061(arg0, 0, arg1));
        field4692[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field4685[arg0]; var6++) {
            float var9 = this.method2059(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method2061(arg0, var6, arg1));
            float var11 = var9 * var9;
            field4692[arg0][var6 * 2 + 1] = field4692[arg0][var6 * 2 - 1] * var11;
            field4692[arg0][var6 * 2] = field4692[arg0][var6 * 2 - 1] * var10 + field4692[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field4692[arg0][var12] += field4692[arg0][var12 - 1] * var10 + field4692[arg0][var12 - 2] * var11;
            }
            field4692[arg0][1] += field4692[arg0][0] * var10 + var11;
            field4692[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field4685[0] * 2; var7++) {
                field4692[0][var7] *= field4688;
            }
        }
        for (int var8 = 0; var8 < this.field4685[arg0] * 2; var8++) {
            field4689[arg0][var8] = (int) (field4692[arg0][var8] * 65536.0F);
        }
        return this.field4685[arg0] * 2;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Leh;Lfd;)V")
    public final void method2058(class335 arg0, class493 arg1) {
        int var3 = arg0.method2034(255);
        this.field4685[0] = var3 >> 4;
        this.field4685[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field4690[0] = this.field4690[1] = 0;
            return;
        }
        this.field4690[0] = arg0.method2001((byte) -83);
        this.field4690[1] = arg0.method2001((byte) -83);
        int var4 = arg0.method2034(255);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field4685[var5]; var8++) {
                this.field4687[var5][0][var8] = arg0.method2001((byte) -83);
                this.field4691[var5][0][var8] = arg0.method2001((byte) -83);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field4685[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field4687[var6][1][var7] = this.field4687[var6][0][var7];
                    this.field4691[var6][1][var7] = this.field4691[var6][0][var7];
                } else {
                    this.field4687[var6][1][var7] = arg0.method2001((byte) -83);
                    this.field4691[var6][1][var7] = arg0.method2001((byte) -83);
                }
            }
        }
        if (var4 != 0 || this.field4690[1] != this.field4690[0]) {
            arg1.method2750(arg0);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIF)F")
    private final float method2059(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field4691[arg0][1][arg1] - this.field4691[arg0][0][arg1]) * arg2 + (float) this.field4691[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "()V")
    public static void method2060() {
        field4692 = null;
        field4689 = null;
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(IIF)F")
    private final float method2061(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field4687[arg0][1][arg1] - this.field4687[arg0][0][arg1]) * arg2 + (float) this.field4687[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method2056(var5);
    }
}
