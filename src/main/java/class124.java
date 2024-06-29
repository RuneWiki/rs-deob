import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class124 {

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "[[[I")
    private int[][][] field1871 = new int[2][2][4];

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "[I")
    public int[] field1868 = new int[2];

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "[I")
    private int[] field1874 = new int[2];

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "[[[I")
    private int[][][] field1875 = new int[2][2][4];

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "[[F")
    private static float[][] field1870 = new float[2][8];

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "[[I")
    public static int[][] field1873 = new int[2][8];

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "F")
    private static float field1872;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(F)F")
    private static final float method930(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIF)F")
    private final float method931(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1871[arg0][1][arg1] - this.field1871[arg0][0][arg1]) * arg2 + (float) this.field1871[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lha;Lll;)V")
    public final void method932(class31 arg0, class217 arg1) {
        int var3 = arg0.method265(-106);
        this.field1868[0] = var3 >> 4;
        this.field1868[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field1874[0] = this.field1874[1] = 0;
            return;
        }
        this.field1874[0] = arg0.method260((byte) -67);
        this.field1874[1] = arg0.method260((byte) -67);
        int var4 = arg0.method265(-99);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field1868[var5]; var8++) {
                this.field1875[var5][0][var8] = arg0.method260((byte) -67);
                this.field1871[var5][0][var8] = arg0.method260((byte) -67);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field1868[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field1875[var6][1][var7] = this.field1875[var6][0][var7];
                    this.field1871[var6][1][var7] = this.field1871[var6][0][var7];
                } else {
                    this.field1875[var6][1][var7] = arg0.method260((byte) -67);
                    this.field1871[var6][1][var7] = arg0.method260((byte) -67);
                }
            }
        }
        if (var4 != 0 || this.field1874[1] != this.field1874[0]) {
            arg1.method1498(arg0);
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IF)I")
    public final int method933(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1874[1] - this.field1874[0]) * arg1 + (float) this.field1874[0];
            float var4 = var3 * 0.0030517578F;
            field1872 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field1869 = (int) (field1872 * 65536.0F);
        }
        if (this.field1868[arg0] == 0) {
            return 0;
        }
        float var5 = this.method931(arg0, 0, arg1);
        field1870[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method935(arg0, 0, arg1));
        field1870[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1868[arg0]; var6++) {
            float var9 = this.method931(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method935(arg0, var6, arg1));
            float var11 = var9 * var9;
            field1870[arg0][var6 * 2 + 1] = field1870[arg0][var6 * 2 - 1] * var11;
            field1870[arg0][var6 * 2] = field1870[arg0][var6 * 2 - 1] * var10 + field1870[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field1870[arg0][var12] += field1870[arg0][var12 - 1] * var10 + field1870[arg0][var12 - 2] * var11;
            }
            field1870[arg0][1] += field1870[arg0][0] * var10 + var11;
            field1870[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field1868[0] * 2; var7++) {
                field1870[0][var7] *= field1872;
            }
        }
        for (int var8 = 0; var8 < this.field1868[arg0] * 2; var8++) {
            field1873[arg0][var8] = (int) (field1870[arg0][var8] * 65536.0F);
        }
        return this.field1868[arg0] * 2;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "()V")
    public static void method934() {
        field1870 = null;
        field1873 = null;
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(IIF)F")
    private final float method935(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1875[arg0][1][arg1] - this.field1875[arg0][0][arg1]) * arg2 + (float) this.field1875[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method930(var5);
    }
}
