import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class118 {

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "[I")
    public int[] field1917 = new int[2];

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "[[[I")
    private int[][][] field1915 = new int[2][2][4];

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "[I")
    private int[] field1919 = new int[2];

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "[[[I")
    private int[][][] field1920 = new int[2][2][4];

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "[[I")
    public static int[][] field1918 = new int[2][8];

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "[[F")
    private static float[][] field1922 = new float[2][8];

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "F")
    private static float field1921;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(F)F")
    private static final float method881(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lhc;Lmc;)V")
    public final void method882(class53 arg0, class50 arg1) {
        int var3 = arg0.method366(-16505);
        this.field1917[0] = var3 >> 4;
        this.field1917[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field1919[0] = this.field1919[1] = 0;
            return;
        }
        this.field1919[0] = arg0.method331(-125);
        this.field1919[1] = arg0.method331(-75);
        int var4 = arg0.method366(-16505);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field1917[var5]; var8++) {
                this.field1915[var5][0][var8] = arg0.method331(-112);
                this.field1920[var5][0][var8] = arg0.method331(-27);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field1917[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field1915[var6][1][var7] = this.field1915[var6][0][var7];
                    this.field1920[var6][1][var7] = this.field1920[var6][0][var7];
                } else {
                    this.field1915[var6][1][var7] = arg0.method331(-110);
                    this.field1920[var6][1][var7] = arg0.method331(-107);
                }
            }
        }
        if (var4 != 0 || this.field1919[1] != this.field1919[0]) {
            arg1.method306(arg0);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIF)F")
    private final float method883(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1920[arg0][1][arg1] - this.field1920[arg0][0][arg1]) * arg2 + (float) this.field1920[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IF)I")
    public final int method884(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1919[1] - this.field1919[0]) * arg1 + (float) this.field1919[0];
            float var4 = var3 * 0.0030517578F;
            field1921 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field1916 = (int) (field1921 * 65536.0F);
        }
        if (this.field1917[arg0] == 0) {
            return 0;
        }
        float var5 = this.method883(arg0, 0, arg1);
        field1922[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method886(arg0, 0, arg1));
        field1922[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1917[arg0]; var6++) {
            float var9 = this.method883(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method886(arg0, var6, arg1));
            float var11 = var9 * var9;
            field1922[arg0][var6 * 2 + 1] = field1922[arg0][var6 * 2 - 1] * var11;
            field1922[arg0][var6 * 2] = field1922[arg0][var6 * 2 - 1] * var10 + field1922[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field1922[arg0][var12] += field1922[arg0][var12 - 1] * var10 + field1922[arg0][var12 - 2] * var11;
            }
            field1922[arg0][1] += field1922[arg0][0] * var10 + var11;
            field1922[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field1917[0] * 2; var7++) {
                field1922[0][var7] *= field1921;
            }
        }
        for (int var8 = 0; var8 < this.field1917[arg0] * 2; var8++) {
            field1918[arg0][var8] = (int) (field1922[arg0][var8] * 65536.0F);
        }
        return this.field1917[arg0] * 2;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "()V")
    public static void method885() {
        field1922 = null;
        field1918 = null;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(IIF)F")
    private final float method886(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1915[arg0][1][arg1] - this.field1915[arg0][0][arg1]) * arg2 + (float) this.field1915[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method881(var5);
    }
}
