import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class29 {

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "[I")
    private int[] field691 = new int[2];

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "[I")
    public int[] field694 = new int[2];

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "[[[I")
    private int[][][] field697 = new int[2][2][4];

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "[[[I")
    private int[][][] field696 = new int[2][2][4];

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "[[F")
    private static float[][] field692 = new float[2][8];

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "[[I")
    public static int[][] field698 = new int[2][8];

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "F")
    private static float field695;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    public static int field693;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIF)F")
    private final float method258(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field697[arg0][1][arg1] - this.field697[arg0][0][arg1]) * arg2 + (float) this.field697[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(IIF)F")
    private final float method259(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field696[arg0][1][arg1] - this.field696[arg0][0][arg1]) * arg2 + (float) this.field696[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method262(var5);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lib;Lwc;)V")
    public final void method260(class57 arg0, class147 arg1) {
        int var3 = arg0.method510(-110);
        this.field694[0] = var3 >> 4;
        this.field694[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field691[0] = this.field691[1] = 0;
            return;
        }
        this.field691[0] = arg0.method506(-1);
        this.field691[1] = arg0.method506(-1);
        int var4 = arg0.method510(-112);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field694[var5]; var8++) {
                this.field696[var5][0][var8] = arg0.method506(-1);
                this.field697[var5][0][var8] = arg0.method506(-1);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field694[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field696[var6][1][var7] = this.field696[var6][0][var7];
                    this.field697[var6][1][var7] = this.field697[var6][0][var7];
                } else {
                    this.field696[var6][1][var7] = arg0.method506(-1);
                    this.field697[var6][1][var7] = arg0.method506(-1);
                }
            }
        }
        if (var4 != 0 || this.field691[1] != this.field691[0]) {
            arg1.method1197(arg0);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IF)I")
    public final int method261(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field691[1] - this.field691[0]) * arg1 + (float) this.field691[0];
            float var4 = var3 * 0.0030517578F;
            field695 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field693 = (int) (field695 * 65536.0F);
        }
        if (this.field694[arg0] == 0) {
            return 0;
        }
        float var5 = this.method258(arg0, 0, arg1);
        field692[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method259(arg0, 0, arg1));
        field692[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field694[arg0]; var6++) {
            float var9 = this.method258(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method259(arg0, var6, arg1));
            float var11 = var9 * var9;
            field692[arg0][var6 * 2 + 1] = field692[arg0][var6 * 2 - 1] * var11;
            field692[arg0][var6 * 2] = field692[arg0][var6 * 2 - 1] * var10 + field692[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field692[arg0][var12] += field692[arg0][var12 - 1] * var10 + field692[arg0][var12 - 2] * var11;
            }
            field692[arg0][1] += field692[arg0][0] * var10 + var11;
            field692[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field694[0] * 2; var7++) {
                field692[0][var7] *= field695;
            }
        }
        for (int var8 = 0; var8 < this.field694[arg0] * 2; var8++) {
            field698[arg0][var8] = (int) (field692[arg0][var8] * 65536.0F);
        }
        return this.field694[arg0] * 2;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(F)F")
    private static final float method262(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "()V")
    public static void method263() {
        field692 = null;
        field698 = null;
    }
}
