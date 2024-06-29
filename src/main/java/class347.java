import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class347 {

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "[[[I")
    private int[][][] field4690 = new int[2][2][4];

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "[I")
    public int[] field4692 = new int[2];

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "[I")
    private int[] field4693 = new int[2];

    @OriginalMember(owner = "client!ql", name = "h", descriptor = "[[[I")
    private int[][][] field4697 = new int[2][2][4];

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "[[I")
    public static int[][] field4691 = new int[2][8];

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "[[F")
    private static float[][] field4696 = new float[2][8];

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "F")
    private static float field4694;

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "I")
    public static int field4695;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "()V", line = 7)
    public static void method2190() {
        field4696 = null;
        field4691 = null;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(F)F", line = 14)
    private static final float method2191(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIF)F", line = 25)
    private final float method2192(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field4697[arg0][1][arg1] - this.field4697[arg0][0][arg1]) * arg2 + (float) this.field4697[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(IIF)F", line = 36)
    private final float method2193(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field4690[arg0][1][arg1] - this.field4690[arg0][0][arg1]) * arg2 + (float) this.field4690[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method2191(var5);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lap;Lvh;)V", line = 43)
    public final void method2194(class289 arg0, class432 arg1) {
        int var3 = arg0.method1861((byte) -72);
        this.field4692[0] = var3 >> 4;
        this.field4692[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field4693[0] = this.field4693[1] = 0;
            return;
        }
        this.field4693[0] = arg0.method1853(-99);
        this.field4693[1] = arg0.method1853(-109);
        int var4 = arg0.method1861((byte) -72);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field4692[var5]; var8++) {
                this.field4690[var5][0][var8] = arg0.method1853(105);
                this.field4697[var5][0][var8] = arg0.method1853(-125);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field4692[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field4690[var6][1][var7] = this.field4690[var6][0][var7];
                    this.field4697[var6][1][var7] = this.field4697[var6][0][var7];
                } else {
                    this.field4690[var6][1][var7] = arg0.method1853(99);
                    this.field4697[var6][1][var7] = arg0.method1853(94);
                }
            }
        }
        if (var4 != 0 || this.field4693[1] != this.field4693[0]) {
            arg1.method2681(arg0);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IF)I", line = 108)
    public final int method2195(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field4693[1] - this.field4693[0]) * arg1 + (float) this.field4693[0];
            float var4 = var3 * 0.0030517578F;
            field4694 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field4695 = (int) (field4694 * 65536.0F);
        }
        if (this.field4692[arg0] == 0) {
            return 0;
        }
        float var5 = this.method2192(arg0, 0, arg1);
        field4696[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method2193(arg0, 0, arg1));
        field4696[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field4692[arg0]; var6++) {
            float var9 = this.method2192(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method2193(arg0, var6, arg1));
            float var11 = var9 * var9;
            field4696[arg0][var6 * 2 + 1] = field4696[arg0][var6 * 2 - 1] * var11;
            field4696[arg0][var6 * 2] = field4696[arg0][var6 * 2 - 1] * var10 + field4696[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field4696[arg0][var12] += field4696[arg0][var12 - 1] * var10 + field4696[arg0][var12 - 2] * var11;
            }
            field4696[arg0][1] += field4696[arg0][0] * var10 + var11;
            field4696[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field4692[0] * 2; var7++) {
                field4696[0][var7] *= field4694;
            }
        }
        for (int var8 = 0; var8 < this.field4692[arg0] * 2; var8++) {
            field4691[arg0][var8] = (int) (field4696[arg0][var8] * 65536.0F);
        }
        return this.field4692[arg0] * 2;
    }
}
