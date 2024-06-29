import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class185 {

    @OriginalMember(owner = "client!r", name = "c", descriptor = "[[[I")
    private int[][][] field3618 = new int[2][2][4];

    @OriginalMember(owner = "client!r", name = "a", descriptor = "[[[I")
    private int[][][] field3616 = new int[2][2][4];

    @OriginalMember(owner = "client!r", name = "d", descriptor = "[I")
    private int[] field3619 = new int[2];

    @OriginalMember(owner = "client!r", name = "g", descriptor = "[I")
    public int[] field3622 = new int[2];

    @OriginalMember(owner = "client!r", name = "h", descriptor = "[[F")
    private static float[][] field3623 = new float[2][8];

    @OriginalMember(owner = "client!r", name = "f", descriptor = "[[I")
    public static int[][] field3621 = new int[2][8];

    @OriginalMember(owner = "client!r", name = "e", descriptor = "F")
    private static float field3620;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIF)F")
    private final float method1302(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3616[arg0][1][arg1] - this.field3616[arg0][0][arg1]) * arg2 + (float) this.field3616[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1303(var5);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(F)F")
    private static final float method1303(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(IIF)F")
    private final float method1304(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3618[arg0][1][arg1] - this.field3618[arg0][0][arg1]) * arg2 + (float) this.field3618[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IF)I")
    public final int method1305(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field3619[1] - this.field3619[0]) * arg1 + (float) this.field3619[0];
            float var4 = var3 * 0.0030517578F;
            field3620 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field3617 = (int) (field3620 * 65536.0F);
        }
        if (this.field3622[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1304(arg0, 0, arg1);
        field3623[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1302(arg0, 0, arg1));
        field3623[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field3622[arg0]; var6++) {
            float var9 = this.method1304(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method1302(arg0, var6, arg1));
            float var11 = var9 * var9;
            field3623[arg0][var6 * 2 + 1] = field3623[arg0][var6 * 2 - 1] * var11;
            field3623[arg0][var6 * 2] = field3623[arg0][var6 * 2 - 1] * var10 + field3623[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field3623[arg0][var12] += field3623[arg0][var12 - 1] * var10 + field3623[arg0][var12 - 2] * var11;
            }
            field3623[arg0][1] += field3623[arg0][0] * var10 + var11;
            field3623[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field3622[0] * 2; var7++) {
                field3623[0][var7] *= field3620;
            }
        }
        for (int var8 = 0; var8 < this.field3622[arg0] * 2; var8++) {
            field3621[arg0][var8] = (int) (field3623[arg0][var8] * 65536.0F);
        }
        return this.field3622[arg0] * 2;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "()V")
    public static void method1306() {
        field3623 = null;
        field3621 = null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lea;Lvf;)V")
    public final void method1307(class46 arg0, class235 arg1) {
        int var3 = arg0.method347(26119);
        this.field3622[0] = var3 >> 4;
        this.field3622[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field3619[0] = this.field3619[1] = 0;
            return;
        }
        this.field3619[0] = arg0.method301(125);
        this.field3619[1] = arg0.method301(113);
        int var4 = arg0.method347(26119);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field3622[var5]; var8++) {
                this.field3616[var5][0][var8] = arg0.method301(92);
                this.field3618[var5][0][var8] = arg0.method301(61);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field3622[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field3616[var6][1][var7] = this.field3616[var6][0][var7];
                    this.field3618[var6][1][var7] = this.field3618[var6][0][var7];
                } else {
                    this.field3616[var6][1][var7] = arg0.method301(63);
                    this.field3618[var6][1][var7] = arg0.method301(119);
                }
            }
        }
        if (var4 != 0 || this.field3619[1] != this.field3619[0]) {
            arg1.method1564(arg0);
        }
    }
}
