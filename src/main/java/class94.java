import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class94 {

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "[I")
    private int[] field2026 = new int[2];

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "[[[I")
    private int[][][] field2024 = new int[2][2][4];

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "[[[I")
    private int[][][] field2028 = new int[2][2][4];

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "[I")
    public int[] field2027 = new int[2];

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "[[I")
    public static int[][] field2025 = new int[2][8];

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "[[F")
    private static float[][] field2031 = new float[2][8];

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "F")
    private static float field2029;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(F)F")
    private static final float method654(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIF)F")
    private final float method655(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2028[arg0][1][arg1] - this.field2028[arg0][0][arg1]) * arg2 + (float) this.field2028[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "()V")
    public static void method656() {
        field2031 = null;
        field2025 = null;
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(IIF)F")
    private final float method657(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2024[arg0][1][arg1] - this.field2024[arg0][0][arg1]) * arg2 + (float) this.field2024[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method654(var5);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IF)I")
    public final int method658(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field2026[1] - this.field2026[0]) * arg1 + (float) this.field2026[0];
            float var4 = var3 * 0.0030517578F;
            field2029 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field2030 = (int) (field2029 * 65536.0F);
        }
        if (this.field2027[arg0] == 0) {
            return 0;
        }
        float var5 = this.method655(arg0, 0, arg1);
        field2031[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method657(arg0, 0, arg1));
        field2031[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field2027[arg0]; var6++) {
            float var9 = this.method655(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method657(arg0, var6, arg1));
            float var11 = var9 * var9;
            field2031[arg0][var6 * 2 + 1] = field2031[arg0][var6 * 2 - 1] * var11;
            field2031[arg0][var6 * 2] = field2031[arg0][var6 * 2 - 1] * var10 + field2031[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field2031[arg0][var12] += field2031[arg0][var12 - 1] * var10 + field2031[arg0][var12 - 2] * var11;
            }
            field2031[arg0][1] += field2031[arg0][0] * var10 + var11;
            field2031[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field2027[0] * 2; var7++) {
                field2031[0][var7] *= field2029;
            }
        }
        for (int var8 = 0; var8 < this.field2027[arg0] * 2; var8++) {
            field2025[arg0][var8] = (int) (field2031[arg0][var8] * 65536.0F);
        }
        return this.field2027[arg0] * 2;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lfa;Lsc;)V")
    public final void method659(class52 arg0, class169 arg1) {
        int var3 = arg0.method344(255);
        this.field2027[0] = var3 >> 4;
        this.field2027[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field2026[0] = this.field2026[1] = 0;
            return;
        }
        this.field2026[0] = arg0.method390((byte) 97);
        this.field2026[1] = arg0.method390((byte) 118);
        int var4 = arg0.method344(255);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field2027[var5]; var8++) {
                this.field2024[var5][0][var8] = arg0.method390((byte) 100);
                this.field2028[var5][0][var8] = arg0.method390((byte) 105);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field2027[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field2024[var6][1][var7] = this.field2024[var6][0][var7];
                    this.field2028[var6][1][var7] = this.field2028[var6][0][var7];
                } else {
                    this.field2024[var6][1][var7] = arg0.method390((byte) 125);
                    this.field2028[var6][1][var7] = arg0.method390((byte) 118);
                }
            }
        }
        if (var4 != 0 || this.field2026[1] != this.field2026[0]) {
            arg1.method1144(arg0);
        }
    }
}
