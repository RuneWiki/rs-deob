import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class95 {

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "[[[I")
    private int[][][] field1402 = new int[2][2][4];

    @OriginalMember(owner = "client!mr", name = "e", descriptor = "[I")
    public int[] field1404 = new int[2];

    @OriginalMember(owner = "client!mr", name = "d", descriptor = "[[[I")
    private int[][][] field1403 = new int[2][2][4];

    @OriginalMember(owner = "client!mr", name = "g", descriptor = "[I")
    private int[] field1406 = new int[2];

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "[[I")
    public static int[][] field1401 = new int[2][8];

    @OriginalMember(owner = "client!mr", name = "h", descriptor = "[[F")
    private static float[][] field1407 = new float[2][8];

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "F")
    private static float field1400;

    @OriginalMember(owner = "client!mr", name = "f", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(IF)I", line = 4)
    public final int method548(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1406[1] - this.field1406[0]) * arg1 + (float) this.field1406[0];
            float var4 = var3 * 0.0030517578F;
            field1400 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field1405 = (int) (field1400 * 65536.0F);
        }
        if (this.field1404[arg0] == 0) {
            return 0;
        }
        float var5 = this.method553(arg0, 0, arg1);
        field1407[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method552(arg0, 0, arg1));
        field1407[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1404[arg0]; var6++) {
            float var9 = this.method553(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method552(arg0, var6, arg1));
            float var11 = var9 * var9;
            field1407[arg0][var6 * 2 + 1] = field1407[arg0][var6 * 2 - 1] * var11;
            field1407[arg0][var6 * 2] = field1407[arg0][var6 * 2 - 1] * var10 + field1407[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field1407[arg0][var12] += field1407[arg0][var12 - 1] * var10 + field1407[arg0][var12 - 2] * var11;
            }
            field1407[arg0][1] += field1407[arg0][0] * var10 + var11;
            field1407[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field1404[0] * 2; var7++) {
                field1407[0][var7] *= field1400;
            }
        }
        for (int var8 = 0; var8 < this.field1404[arg0] * 2; var8++) {
            field1401[arg0][var8] = (int) (field1407[arg0][var8] * 65536.0F);
        }
        return this.field1404[arg0] * 2;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "()V", line = 64)
    public static void method549() {
        field1407 = null;
        field1401 = null;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Ldh;Ljr;)V", line = 70)
    public final void method550(class209 arg0, class72 arg1) {
        int var3 = arg0.method1428(32122);
        this.field1404[0] = var3 >> 4;
        this.field1404[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field1406[0] = this.field1406[1] = 0;
            return;
        }
        this.field1406[0] = arg0.method1450((byte) 79);
        this.field1406[1] = arg0.method1450((byte) 36);
        int var4 = arg0.method1428(32122);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field1404[var5]; var8++) {
                this.field1403[var5][0][var8] = arg0.method1450((byte) 112);
                this.field1402[var5][0][var8] = arg0.method1450((byte) 33);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field1404[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field1403[var6][1][var7] = this.field1403[var6][0][var7];
                    this.field1402[var6][1][var7] = this.field1402[var6][0][var7];
                } else {
                    this.field1403[var6][1][var7] = arg0.method1450((byte) 55);
                    this.field1402[var6][1][var7] = arg0.method1450((byte) 95);
                }
            }
        }
        if (var4 != 0 || this.field1406[1] != this.field1406[0]) {
            arg1.method415(arg0);
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(F)F", line = 138)
    private static final float method551(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(IIF)F", line = 155)
    private final float method552(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1403[arg0][1][arg1] - this.field1403[arg0][0][arg1]) * arg2 + (float) this.field1403[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method551(var5);
    }

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(IIF)F", line = 164)
    private final float method553(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1402[arg0][1][arg1] - this.field1402[arg0][0][arg1]) * arg2 + (float) this.field1402[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }
}
