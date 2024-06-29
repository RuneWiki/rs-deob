import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class47 {

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "[I")
    private int[] field697 = new int[2];

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "[[[I")
    private int[][][] field696 = new int[2][2][4];

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "[I")
    public int[] field700 = new int[2];

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "[[[I")
    private int[][][] field699 = new int[2][2][4];

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "[[F")
    private static float[][] field693 = new float[2][8];

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "[[I")
    public static int[][] field695 = new int[2][8];

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "F")
    private static float field698;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IF)I")
    public final int method307(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field697[1] - this.field697[0]) * arg1 + (float) this.field697[0];
            float var4 = var3 * 0.0030517578F;
            field698 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field694 = (int) (field698 * 65536.0F);
        }
        if (this.field700[arg0] == 0) {
            return 0;
        }
        float var5 = this.method308(arg0, 0, arg1);
        field693[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method311(arg0, 0, arg1));
        field693[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field700[arg0]; var6++) {
            float var9 = this.method308(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method311(arg0, var6, arg1));
            float var11 = var9 * var9;
            field693[arg0][var6 * 2 + 1] = field693[arg0][var6 * 2 - 1] * var11;
            field693[arg0][var6 * 2] = field693[arg0][var6 * 2 - 1] * var10 + field693[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field693[arg0][var12] += field693[arg0][var12 - 1] * var10 + field693[arg0][var12 - 2] * var11;
            }
            field693[arg0][1] += field693[arg0][0] * var10 + var11;
            field693[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field700[0] * 2; var7++) {
                field693[0][var7] *= field698;
            }
        }
        for (int var8 = 0; var8 < this.field700[arg0] * 2; var8++) {
            field695[arg0][var8] = (int) (field693[arg0][var8] * 65536.0F);
        }
        return this.field700[arg0] * 2;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIF)F")
    private final float method308(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field699[arg0][1][arg1] - this.field699[arg0][0][arg1]) * arg2 + (float) this.field699[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(F)F")
    private static final float method309(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "()V")
    public static void method310() {
        field693 = null;
        field695 = null;
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(IIF)F")
    private final float method311(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field696[arg0][1][arg1] - this.field696[arg0][0][arg1]) * arg2 + (float) this.field696[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method309(var5);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lfj;Lof;)V")
    public final void method312(class274 arg0, class289 arg1) {
        int var3 = arg0.method1849(255);
        this.field700[0] = var3 >> 4;
        this.field700[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field697[0] = this.field697[1] = 0;
            return;
        }
        this.field697[0] = arg0.method1837(252);
        this.field697[1] = arg0.method1837(252);
        int var4 = arg0.method1849(255);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field700[var5]; var8++) {
                this.field696[var5][0][var8] = arg0.method1837(252);
                this.field699[var5][0][var8] = arg0.method1837(252);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field700[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field696[var6][1][var7] = this.field696[var6][0][var7];
                    this.field699[var6][1][var7] = this.field699[var6][0][var7];
                } else {
                    this.field696[var6][1][var7] = arg0.method1837(252);
                    this.field699[var6][1][var7] = arg0.method1837(252);
                }
            }
        }
        if (var4 != 0 || this.field697[1] != this.field697[0]) {
            arg1.method1991(arg0);
        }
    }
}
