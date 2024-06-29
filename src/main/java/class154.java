import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class154 {

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "[[[I")
    private int[][][] field2605 = new int[2][2][4];

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "[I")
    private int[] field2600 = new int[2];

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "[I")
    public int[] field2604 = new int[2];

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "[[[I")
    private int[][][] field2601 = new int[2][2][4];

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "[[F")
    private static float[][] field2602 = new float[2][8];

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "[[I")
    public static int[][] field2607 = new int[2][8];

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "F")
    private static float field2606;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(F)F", line = 6)
    private static final float method1197(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IF)I", line = 11)
    public final int method1198(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field2600[1] - this.field2600[0]) * arg1 + (float) this.field2600[0];
            float var4 = var3 * 0.0030517578F;
            field2606 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field2603 = (int) (field2606 * 65536.0F);
        }
        if (this.field2604[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1202(arg0, 0, arg1);
        field2602[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1200(arg0, 0, arg1));
        field2602[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field2604[arg0]; var6++) {
            float var7 = this.method1202(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1200(arg0, var6, arg1));
            float var9 = var7 * var7;
            field2602[arg0][var6 * 2 + 1] = field2602[arg0][var6 * 2 - 1] * var9;
            field2602[arg0][var6 * 2] = field2602[arg0][var6 * 2 - 1] * var8 + field2602[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field2602[arg0][var10] += field2602[arg0][var10 - 1] * var8 + field2602[arg0][var10 - 2] * var9;
            }
            field2602[arg0][1] += field2602[arg0][0] * var8 + var9;
            field2602[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field2604[0] * 2; var11++) {
                field2602[0][var11] *= field2606;
            }
        }
        for (int var12 = 0; var12 < this.field2604[arg0] * 2; var12++) {
            field2607[arg0][var12] = (int) (field2602[arg0][var12] * 65536.0F);
        }
        return this.field2604[arg0] * 2;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "()V", line = 70)
    public static void method1199() {
        field2602 = (float[][]) null;
        field2607 = (int[][]) null;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIF)F", line = 76)
    private final float method1200(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2601[arg0][1][arg1] - this.field2601[arg0][0][arg1]) * arg2 + (float) this.field2601[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1197(var5);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lsd;Lod;)V", line = 84)
    public final void method1201(class26 arg0, class24 arg1) {
        int var3 = arg0.method226(255);
        this.field2604[0] = var3 >> 4;
        this.field2604[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field2600[0] = this.field2600[1] = 0;
            return;
        }
        this.field2600[0] = arg0.method197(-1);
        this.field2600[1] = arg0.method197(-1);
        int var4 = arg0.method226(255);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field2604[var5]; var6++) {
                this.field2601[var5][0][var6] = arg0.method197(-1);
                this.field2605[var5][0][var6] = arg0.method197(-1);
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field2604[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field2601[var7][1][var8] = this.field2601[var7][0][var8];
                    this.field2605[var7][1][var8] = this.field2605[var7][0][var8];
                } else {
                    this.field2601[var7][1][var8] = arg0.method197(-1);
                    this.field2605[var7][1][var8] = arg0.method197(-1);
                }
            }
        }
        if (var4 != 0 || this.field2600[1] != this.field2600[0]) {
            arg1.method176(arg0);
        }
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(IIF)F", line = 165)
    private final float method1202(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2605[arg0][1][arg1] - this.field2605[arg0][0][arg1]) * arg2 + (float) this.field2605[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }
}
