import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class214 {

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "[I")
    public int[] field3884 = new int[2];

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "[[[I")
    private int[][][] field3881 = new int[2][2][4];

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "[[[I")
    private int[][][] field3887 = new int[2][2][4];

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "[I")
    private int[] field3886 = new int[2];

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "[[I")
    public static int[][] field3883 = new int[2][8];

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "[[F")
    private static float[][] field3885 = new float[2][8];

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "F")
    private static float field3882;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public static int field3880;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIF)F")
    private final float method1540(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3887[arg0][1][arg1] - this.field3887[arg0][0][arg1]) * arg2 + (float) this.field3887[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1545(var5);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lfh;Lve;)V")
    public final void method1541(class128 arg0, class184 arg1) {
        int var3 = arg0.method937(false);
        this.field3884[0] = var3 >> 4;
        this.field3884[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field3886[0] = this.field3886[1] = 0;
            return;
        }
        this.field3886[0] = arg0.method912(84);
        this.field3886[1] = arg0.method912(49);
        int var4 = arg0.method937(false);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field3884[var5]; var8++) {
                this.field3887[var5][0][var8] = arg0.method912(124);
                this.field3881[var5][0][var8] = arg0.method912(80);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field3884[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field3887[var6][1][var7] = this.field3887[var6][0][var7];
                    this.field3881[var6][1][var7] = this.field3881[var6][0][var7];
                } else {
                    this.field3887[var6][1][var7] = arg0.method912(101);
                    this.field3881[var6][1][var7] = arg0.method912(-90);
                }
            }
        }
        if (var4 != 0 || this.field3886[1] != this.field3886[0]) {
            arg1.method1334(arg0);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IF)I")
    public final int method1542(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field3886[1] - this.field3886[0]) * arg1 + (float) this.field3886[0];
            float var4 = var3 * 0.0030517578F;
            field3882 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field3880 = (int) (field3882 * 65536.0F);
        }
        if (this.field3884[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1544(arg0, 0, arg1);
        field3885[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1540(arg0, 0, arg1));
        field3885[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field3884[arg0]; var6++) {
            float var9 = this.method1544(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method1540(arg0, var6, arg1));
            float var11 = var9 * var9;
            field3885[arg0][var6 * 2 + 1] = field3885[arg0][var6 * 2 - 1] * var11;
            field3885[arg0][var6 * 2] = field3885[arg0][var6 * 2 - 1] * var10 + field3885[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field3885[arg0][var12] += field3885[arg0][var12 - 1] * var10 + field3885[arg0][var12 - 2] * var11;
            }
            field3885[arg0][1] += field3885[arg0][0] * var10 + var11;
            field3885[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field3884[0] * 2; var7++) {
                field3885[0][var7] *= field3882;
            }
        }
        for (int var8 = 0; var8 < this.field3884[arg0] * 2; var8++) {
            field3883[arg0][var8] = (int) (field3885[arg0][var8] * 65536.0F);
        }
        return this.field3884[arg0] * 2;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "()V")
    public static void method1543() {
        field3885 = null;
        field3883 = null;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(IIF)F")
    private final float method1544(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3881[arg0][1][arg1] - this.field3881[arg0][0][arg1]) * arg2 + (float) this.field3881[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(F)F")
    private static final float method1545(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }
}
