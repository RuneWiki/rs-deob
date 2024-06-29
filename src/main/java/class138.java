import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!faa")
public class class138 {

    @OriginalMember(owner = "client!faa", name = "c", descriptor = "[[[I")
    private int[][][] field1742 = new int[2][2][4];

    @OriginalMember(owner = "client!faa", name = "f", descriptor = "[[[I")
    private int[][][] field1745 = new int[2][2][4];

    @OriginalMember(owner = "client!faa", name = "g", descriptor = "[I")
    public int[] field1746 = new int[2];

    @OriginalMember(owner = "client!faa", name = "h", descriptor = "[I")
    private int[] field1747 = new int[2];

    @OriginalMember(owner = "client!faa", name = "b", descriptor = "[[I")
    public static int[][] field1741 = new int[2][8];

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "[[F")
    private static float[][] field1740 = new float[2][8];

    @OriginalMember(owner = "client!faa", name = "d", descriptor = "F")
    private static float field1743;

    @OriginalMember(owner = "client!faa", name = "e", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(IIF)F")
    private final float method911(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1742[arg0][1][arg1] - this.field1742[arg0][0][arg1]) * arg2 + (float) this.field1742[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method914(var5);
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(IF)I")
    public final int method912(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1747[1] - this.field1747[0]) * arg1 + (float) this.field1747[0];
            float var4 = var3 * 0.0030517578F;
            field1743 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field1744 = (int) (field1743 * 65536.0F);
        }
        if (this.field1746[arg0] == 0) {
            return 0;
        }
        float var5 = this.method915(arg0, 0, arg1);
        field1740[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method911(arg0, 0, arg1));
        field1740[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1746[arg0]; var6++) {
            float var9 = this.method915(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method911(arg0, var6, arg1));
            float var11 = var9 * var9;
            field1740[arg0][var6 * 2 + 1] = field1740[arg0][var6 * 2 - 1] * var11;
            field1740[arg0][var6 * 2] = field1740[arg0][var6 * 2 - 1] * var10 + field1740[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field1740[arg0][var12] += field1740[arg0][var12 - 1] * var10 + field1740[arg0][var12 - 2] * var11;
            }
            field1740[arg0][1] += field1740[arg0][0] * var10 + var11;
            field1740[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field1746[0] * 2; var7++) {
                field1740[0][var7] *= field1743;
            }
        }
        for (int var8 = 0; var8 < this.field1746[arg0] * 2; var8++) {
            field1741[arg0][var8] = (int) (field1740[arg0][var8] * 65536.0F);
        }
        return this.field1746[arg0] * 2;
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "()V")
    public static void method913() {
        field1740 = null;
        field1741 = null;
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(F)F")
    private static final float method914(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!faa", name = "b", descriptor = "(IIF)F")
    private final float method915(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1745[arg0][1][arg1] - this.field1745[arg0][0][arg1]) * arg2 + (float) this.field1745[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(Lun;Lkc;)V")
    public final void method916(class389 arg0, class117 arg1) {
        int var3 = arg0.method2229(255);
        this.field1746[0] = var3 >> 4;
        this.field1746[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field1747[0] = this.field1747[1] = 0;
            return;
        }
        this.field1747[0] = arg0.method2260(-96);
        this.field1747[1] = arg0.method2260(-91);
        int var4 = arg0.method2229(255);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field1746[var5]; var8++) {
                this.field1742[var5][0][var8] = arg0.method2260(-91);
                this.field1745[var5][0][var8] = arg0.method2260(-76);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field1746[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field1742[var6][1][var7] = this.field1742[var6][0][var7];
                    this.field1745[var6][1][var7] = this.field1745[var6][0][var7];
                } else {
                    this.field1742[var6][1][var7] = arg0.method2260(-46);
                    this.field1745[var6][1][var7] = arg0.method2260(-74);
                }
            }
        }
        if (var4 != 0 || this.field1747[1] != this.field1747[0]) {
            arg1.method828(arg0);
        }
    }
}
