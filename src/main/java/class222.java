import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class222 {

    @OriginalMember(owner = "client!we", name = "e", descriptor = "[[[I")
    private int[][][] field4202 = new int[2][2][4];

    @OriginalMember(owner = "client!we", name = "a", descriptor = "[I")
    public int[] field4198 = new int[2];

    @OriginalMember(owner = "client!we", name = "g", descriptor = "[I")
    private int[] field4204 = new int[2];

    @OriginalMember(owner = "client!we", name = "c", descriptor = "[[[I")
    private int[][][] field4200 = new int[2][2][4];

    @OriginalMember(owner = "client!we", name = "b", descriptor = "[[F")
    private static float[][] field4199 = new float[2][8];

    @OriginalMember(owner = "client!we", name = "f", descriptor = "[[I")
    public static int[][] field4203 = new int[2][8];

    @OriginalMember(owner = "client!we", name = "d", descriptor = "F")
    private static float field4201;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "I")
    public static int field4205;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIF)F")
    private final float method1428(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field4202[arg0][1][arg1] - this.field4202[arg0][0][arg1]) * arg2 + (float) this.field4202[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1429(var5);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(F)F")
    private static final float method1429(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IF)I")
    public final int method1430(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field4204[1] - this.field4204[0]) * arg1 + (float) this.field4204[0];
            float var4 = var3 * 0.0030517578F;
            field4201 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field4205 = (int) (field4201 * 65536.0F);
        }
        if (this.field4198[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1433(arg0, 0, arg1);
        field4199[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1428(arg0, 0, arg1));
        field4199[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field4198[arg0]; var6++) {
            float var9 = this.method1433(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method1428(arg0, var6, arg1));
            float var11 = var9 * var9;
            field4199[arg0][var6 * 2 + 1] = field4199[arg0][var6 * 2 - 1] * var11;
            field4199[arg0][var6 * 2] = field4199[arg0][var6 * 2 - 1] * var10 + field4199[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field4199[arg0][var12] += field4199[arg0][var12 - 1] * var10 + field4199[arg0][var12 - 2] * var11;
            }
            field4199[arg0][1] += field4199[arg0][0] * var10 + var11;
            field4199[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field4198[0] * 2; var7++) {
                field4199[0][var7] *= field4201;
            }
        }
        for (int var8 = 0; var8 < this.field4198[arg0] * 2; var8++) {
            field4203[arg0][var8] = (int) (field4199[arg0][var8] * 65536.0F);
        }
        return this.field4198[arg0] * 2;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "()V")
    public static void method1431() {
        field4199 = null;
        field4203 = null;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Log;Lj;)V")
    public final void method1432(class146 arg0, class89 arg1) {
        int var3 = arg0.method991(255);
        this.field4198[0] = var3 >> 4;
        this.field4198[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field4204[0] = this.field4204[1] = 0;
            return;
        }
        this.field4204[0] = arg0.method1007(86);
        this.field4204[1] = arg0.method1007(121);
        int var4 = arg0.method991(255);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field4198[var5]; var8++) {
                this.field4202[var5][0][var8] = arg0.method1007(61);
                this.field4200[var5][0][var8] = arg0.method1007(118);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field4198[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field4202[var6][1][var7] = this.field4202[var6][0][var7];
                    this.field4200[var6][1][var7] = this.field4200[var6][0][var7];
                } else {
                    this.field4202[var6][1][var7] = arg0.method1007(50);
                    this.field4200[var6][1][var7] = arg0.method1007(77);
                }
            }
        }
        if (var4 != 0 || this.field4204[1] != this.field4204[0]) {
            arg1.method606(arg0);
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(IIF)F")
    private final float method1433(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field4200[arg0][1][arg1] - this.field4200[arg0][0][arg1]) * arg2 + (float) this.field4200[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }
}
