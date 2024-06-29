import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class113 {

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "[[[I")
    private int[][][] field1845 = new int[2][2][4];

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "[I")
    public int[] field1847 = new int[2];

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "[[[I")
    private int[][][] field1846 = new int[2][2][4];

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "[I")
    private int[] field1851 = new int[2];

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "[[I")
    public static int[][] field1850 = new int[2][8];

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "[[F")
    private static float[][] field1852 = new float[2][8];

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "F")
    private static float field1848;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lnh;Lff;)V")
    public final void method779(class112 arg0, class224 arg1) {
        int var3 = arg0.method758(true);
        this.field1847[0] = var3 >> 4;
        this.field1847[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field1851[0] = this.field1851[1] = 0;
            return;
        }
        this.field1851[0] = arg0.method731(false);
        this.field1851[1] = arg0.method731(false);
        int var4 = arg0.method758(true);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field1847[var5]; var8++) {
                this.field1845[var5][0][var8] = arg0.method731(false);
                this.field1846[var5][0][var8] = arg0.method731(false);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field1847[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field1845[var6][1][var7] = this.field1845[var6][0][var7];
                    this.field1846[var6][1][var7] = this.field1846[var6][0][var7];
                } else {
                    this.field1845[var6][1][var7] = arg0.method731(false);
                    this.field1846[var6][1][var7] = arg0.method731(false);
                }
            }
        }
        if (var4 != 0 || this.field1851[1] != this.field1851[0]) {
            arg1.method1463(arg0);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "()V")
    public static void method780() {
        field1852 = null;
        field1850 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(F)F")
    private static final float method781(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IF)I")
    public final int method782(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1851[1] - this.field1851[0]) * arg1 + (float) this.field1851[0];
            float var4 = var3 * 0.0030517578F;
            field1848 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field1849 = (int) (field1848 * 65536.0F);
        }
        if (this.field1847[arg0] == 0) {
            return 0;
        }
        float var5 = this.method783(arg0, 0, arg1);
        field1852[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method784(arg0, 0, arg1));
        field1852[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1847[arg0]; var6++) {
            float var9 = this.method783(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method784(arg0, var6, arg1));
            float var11 = var9 * var9;
            field1852[arg0][var6 * 2 + 1] = field1852[arg0][var6 * 2 - 1] * var11;
            field1852[arg0][var6 * 2] = field1852[arg0][var6 * 2 - 1] * var10 + field1852[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field1852[arg0][var12] += field1852[arg0][var12 - 1] * var10 + field1852[arg0][var12 - 2] * var11;
            }
            field1852[arg0][1] += field1852[arg0][0] * var10 + var11;
            field1852[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field1847[0] * 2; var7++) {
                field1852[0][var7] *= field1848;
            }
        }
        for (int var8 = 0; var8 < this.field1847[arg0] * 2; var8++) {
            field1850[arg0][var8] = (int) (field1852[arg0][var8] * 65536.0F);
        }
        return this.field1847[arg0] * 2;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIF)F")
    private final float method783(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1846[arg0][1][arg1] - this.field1846[arg0][0][arg1]) * arg2 + (float) this.field1846[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(IIF)F")
    private final float method784(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1845[arg0][1][arg1] - this.field1845[arg0][0][arg1]) * arg2 + (float) this.field1845[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method781(var5);
    }
}
