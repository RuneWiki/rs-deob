import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class163 {

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "[I")
    public int[] field2621 = new int[2];

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "[I")
    private int[] field2622 = new int[2];

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "[[[I")
    private int[][][] field2623 = new int[2][2][4];

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "[[[I")
    private int[][][] field2628 = new int[2][2][4];

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "[[F")
    private static float[][] field2624 = new float[2][8];

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "[[I")
    public static int[][] field2626 = new int[2][8];

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "F")
    private static float field2627;

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIF)F", line = 12)
    private final float method1146(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2628[arg0][1][arg1] - this.field2628[arg0][0][arg1]) * arg2 + (float) this.field2628[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lhb;Lgd;)V", line = 18)
    public final void method1147(class164 arg0, class125 arg1) {
        int var3 = arg0.method1178(8);
        this.field2621[0] = var3 >> 4;
        this.field2621[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field2622[0] = this.field2622[1] = 0;
            return;
        }
        this.field2622[0] = arg0.method1161(true);
        this.field2622[1] = arg0.method1161(true);
        int var4 = arg0.method1178(8);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field2621[var5]; var6++) {
                this.field2623[var5][0][var6] = arg0.method1161(true);
                this.field2628[var5][0][var6] = arg0.method1161(true);
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field2621[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field2623[var7][1][var8] = this.field2623[var7][0][var8];
                    this.field2628[var7][1][var8] = this.field2628[var7][0][var8];
                } else {
                    this.field2623[var7][1][var8] = arg0.method1161(true);
                    this.field2628[var7][1][var8] = arg0.method1161(true);
                }
            }
        }
        if (var4 != 0 || this.field2622[1] != this.field2622[0]) {
            arg1.method924(arg0);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "()V", line = 83)
    public static void method1148() {
        field2624 = (float[][]) null;
        field2626 = (int[][]) null;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(F)F", line = 93)
    private static final float method1149(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(IIF)F", line = 102)
    private final float method1150(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2623[arg0][1][arg1] - this.field2623[arg0][0][arg1]) * arg2 + (float) this.field2623[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1149(var5);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IF)I", line = 116)
    public final int method1151(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field2622[1] - this.field2622[0]) * arg1 + (float) this.field2622[0];
            float var4 = var3 * 0.0030517578F;
            field2627 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field2625 = (int) (field2627 * 65536.0F);
        }
        if (this.field2621[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1146(arg0, 0, arg1);
        field2624[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1150(arg0, 0, arg1));
        field2624[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field2621[arg0]; var6++) {
            float var7 = this.method1146(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1150(arg0, var6, arg1));
            float var9 = var7 * var7;
            field2624[arg0][var6 * 2 + 1] = field2624[arg0][var6 * 2 - 1] * var9;
            field2624[arg0][var6 * 2] = field2624[arg0][var6 * 2 - 1] * var8 + field2624[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field2624[arg0][var10] += field2624[arg0][var10 - 1] * var8 + field2624[arg0][var10 - 2] * var9;
            }
            field2624[arg0][1] += field2624[arg0][0] * var8 + var9;
            field2624[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field2621[0] * 2; var11++) {
                field2624[0][var11] *= field2627;
            }
        }
        for (int var12 = 0; var12 < this.field2621[arg0] * 2; var12++) {
            field2626[arg0][var12] = (int) (field2624[arg0][var12] * 65536.0F);
        }
        return this.field2621[arg0] * 2;
    }
}
