import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class175 {

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "[[[I")
    private int[][][] field3258 = new int[2][2][4];

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "[[[I")
    private int[][][] field3261 = new int[2][2][4];

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "[I")
    public int[] field3262 = new int[2];

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "[I")
    private int[] field3260 = new int[2];

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "[[F")
    private static float[][] field3259 = new float[2][8];

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "[[I")
    public static int[][] field3263 = new int[2][8];

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "F")
    private static float field3257;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIF)F")
    private final float method1141(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3258[arg0][1][arg1] - this.field3258[arg0][0][arg1]) * arg2 + (float) this.field3258[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lkd;Llg;)V")
    public final void method1142(class112 arg0, class126 arg1) {
        int var3 = arg0.method716(-1308);
        this.field3262[0] = var3 >> 4;
        this.field3262[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field3260[0] = this.field3260[1] = 0;
            return;
        }
        this.field3260[0] = arg0.method739(-127);
        this.field3260[1] = arg0.method739(-123);
        int var4 = arg0.method716(-1308);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field3262[var5]; var8++) {
                this.field3261[var5][0][var8] = arg0.method739(-125);
                this.field3258[var5][0][var8] = arg0.method739(-127);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field3262[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field3261[var6][1][var7] = this.field3261[var6][0][var7];
                    this.field3258[var6][1][var7] = this.field3258[var6][0][var7];
                } else {
                    this.field3261[var6][1][var7] = arg0.method739(-124);
                    this.field3258[var6][1][var7] = arg0.method739(-126);
                }
            }
        }
        if (var4 != 0 || this.field3260[1] != this.field3260[0]) {
            arg1.method831(arg0);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IF)I")
    public final int method1143(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field3260[1] - this.field3260[0]) * arg1 + (float) this.field3260[0];
            float var4 = var3 * 0.0030517578F;
            field3257 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field3256 = (int) (field3257 * 65536.0F);
        }
        if (this.field3262[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1141(arg0, 0, arg1);
        field3259[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1144(arg0, 0, arg1));
        field3259[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field3262[arg0]; var6++) {
            float var9 = this.method1141(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method1144(arg0, var6, arg1));
            float var11 = var9 * var9;
            field3259[arg0][var6 * 2 + 1] = field3259[arg0][var6 * 2 - 1] * var11;
            field3259[arg0][var6 * 2] = field3259[arg0][var6 * 2 - 1] * var10 + field3259[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field3259[arg0][var12] += field3259[arg0][var12 - 1] * var10 + field3259[arg0][var12 - 2] * var11;
            }
            field3259[arg0][1] += field3259[arg0][0] * var10 + var11;
            field3259[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field3262[0] * 2; var7++) {
                field3259[0][var7] *= field3257;
            }
        }
        for (int var8 = 0; var8 < this.field3262[arg0] * 2; var8++) {
            field3263[arg0][var8] = (int) (field3259[arg0][var8] * 65536.0F);
        }
        return this.field3262[arg0] * 2;
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIF)F")
    private final float method1144(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3261[arg0][1][arg1] - this.field3261[arg0][0][arg1]) * arg2 + (float) this.field3261[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1145(var5);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(F)F")
    private static final float method1145(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "()V")
    public static void method1146() {
        field3259 = null;
        field3263 = null;
    }
}
