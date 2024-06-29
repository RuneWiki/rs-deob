import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class83 {

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "[[[I")
    private int[][][] field1678 = new int[2][2][4];

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "[[[I")
    private int[][][] field1680 = new int[2][2][4];

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "[I")
    public int[] field1677 = new int[2];

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "[I")
    private int[] field1676 = new int[2];

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "[[F")
    private static float[][] field1682 = new float[2][8];

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "[[I")
    public static int[][] field1683 = new int[2][8];

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "F")
    private static float field1679;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
    public static int field1681;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(F)F")
    private static final float method671(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIF)F")
    private final float method672(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1680[arg0][1][arg1] - this.field1680[arg0][0][arg1]) * arg2 + (float) this.field1680[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(IIF)F")
    private final float method673(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1678[arg0][1][arg1] - this.field1678[arg0][0][arg1]) * arg2 + (float) this.field1678[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method671(var5);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IF)I")
    public final int method674(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1676[1] - this.field1676[0]) * arg1 + (float) this.field1676[0];
            float var4 = var3 * 0.0030517578F;
            field1679 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field1681 = (int) (field1679 * 65536.0F);
        }
        if (this.field1677[arg0] == 0) {
            return 0;
        }
        float var5 = this.method672(arg0, 0, arg1);
        field1682[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method673(arg0, 0, arg1));
        field1682[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1677[arg0]; var6++) {
            float var9 = this.method672(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method673(arg0, var6, arg1));
            float var11 = var9 * var9;
            field1682[arg0][var6 * 2 + 1] = field1682[arg0][var6 * 2 - 1] * var11;
            field1682[arg0][var6 * 2] = field1682[arg0][var6 * 2 - 1] * var10 + field1682[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field1682[arg0][var12] += field1682[arg0][var12 - 1] * var10 + field1682[arg0][var12 - 2] * var11;
            }
            field1682[arg0][1] += field1682[arg0][0] * var10 + var11;
            field1682[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field1677[0] * 2; var7++) {
                field1682[0][var7] *= field1679;
            }
        }
        for (int var8 = 0; var8 < this.field1677[arg0] * 2; var8++) {
            field1683[arg0][var8] = (int) (field1682[arg0][var8] * 65536.0F);
        }
        return this.field1677[arg0] * 2;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lff;Luc;)V")
    public final void method675(class53 arg0, class183 arg1) {
        int var3 = arg0.method400(255);
        this.field1677[0] = var3 >> 4;
        this.field1677[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field1676[0] = this.field1676[1] = 0;
            return;
        }
        this.field1676[0] = arg0.method405(2);
        this.field1676[1] = arg0.method405(2);
        int var4 = arg0.method400(255);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field1677[var5]; var8++) {
                this.field1678[var5][0][var8] = arg0.method405(2);
                this.field1680[var5][0][var8] = arg0.method405(2);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field1677[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field1678[var6][1][var7] = this.field1678[var6][0][var7];
                    this.field1680[var6][1][var7] = this.field1680[var6][0][var7];
                } else {
                    this.field1678[var6][1][var7] = arg0.method405(2);
                    this.field1680[var6][1][var7] = arg0.method405(2);
                }
            }
        }
        if (var4 != 0 || this.field1676[1] != this.field1676[0]) {
            arg1.method1235(arg0);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "()V")
    public static void method676() {
        field1682 = null;
        field1683 = null;
    }
}
