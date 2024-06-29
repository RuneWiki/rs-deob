import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class89 {

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "[I")
    private int[] field1685 = new int[2];

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "[[[I")
    private int[][][] field1688 = new int[2][2][4];

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "[I")
    public int[] field1690 = new int[2];

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "[[[I")
    private int[][][] field1689 = new int[2][2][4];

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "[[I")
    public static int[][] field1686 = new int[2][8];

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "[[F")
    private static float[][] field1683 = new float[2][8];

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "F")
    private static float field1687;

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "()V", line = 3)
    public static void method765() {
        field1683 = (float[][]) null;
        field1686 = (int[][]) null;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIF)F", line = 10)
    private final float method766(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1689[arg0][1][arg1] - this.field1689[arg0][0][arg1]) * arg2 + (float) this.field1689[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(IIF)F", line = 18)
    private final float method767(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1688[arg0][1][arg1] - this.field1688[arg0][0][arg1]) * arg2 + (float) this.field1688[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method769(var5);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lvh;Lkd;)V", line = 24)
    public final void method768(class53 arg0, class76 arg1) {
        int var3 = arg0.method483(-116);
        this.field1690[0] = var3 >> 4;
        this.field1690[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field1685[0] = this.field1685[1] = 0;
            return;
        }
        this.field1685[0] = arg0.method468(28214);
        this.field1685[1] = arg0.method468(28214);
        int var4 = arg0.method483(-122);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1690[var5]; var6++) {
                this.field1688[var5][0][var6] = arg0.method468(28214);
                this.field1689[var5][0][var6] = arg0.method468(28214);
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1690[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1688[var7][1][var8] = this.field1688[var7][0][var8];
                    this.field1689[var7][1][var8] = this.field1689[var7][0][var8];
                } else {
                    this.field1688[var7][1][var8] = arg0.method468(28214);
                    this.field1689[var7][1][var8] = arg0.method468(28214);
                }
            }
        }
        if (var4 != 0 || this.field1685[1] != this.field1685[0]) {
            arg1.method647(arg0);
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(F)F", line = 105)
    private static final float method769(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IF)I", line = 113)
    public final int method770(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1685[1] - this.field1685[0]) * arg1 + (float) this.field1685[0];
            float var4 = var3 * 0.0030517578F;
            field1687 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field1684 = (int) (field1687 * 65536.0F);
        }
        if (this.field1690[arg0] == 0) {
            return 0;
        }
        float var5 = this.method766(arg0, 0, arg1);
        field1683[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method767(arg0, 0, arg1));
        field1683[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1690[arg0]; var6++) {
            float var7 = this.method766(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method767(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1683[arg0][var6 * 2 + 1] = field1683[arg0][var6 * 2 - 1] * var9;
            field1683[arg0][var6 * 2] = field1683[arg0][var6 * 2 - 1] * var8 + field1683[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1683[arg0][var10] += field1683[arg0][var10 - 1] * var8 + field1683[arg0][var10 - 2] * var9;
            }
            field1683[arg0][1] += field1683[arg0][0] * var8 + var9;
            field1683[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1690[0] * 2; var11++) {
                field1683[0][var11] *= field1687;
            }
        }
        for (int var12 = 0; var12 < this.field1690[arg0] * 2; var12++) {
            field1686[arg0][var12] = (int) (field1683[arg0][var12] * 65536.0F);
        }
        return this.field1690[arg0] * 2;
    }
}
