import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class7 {

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "[I")
    private int[] field99 = new int[2];

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "[[[I")
    private int[][][] field103 = new int[2][2][4];

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "[[[I")
    private int[][][] field97 = new int[2][2][4];

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "[I")
    public int[] field104 = new int[2];

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "[[F")
    private static float[][] field101 = new float[2][8];

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "[[I")
    public static int[][] field102 = new int[2][8];

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "F")
    private static float field98;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "I")
    public static int field100;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IF)I")
    public final int method40(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field99[1] - this.field99[0]) * arg1 + (float) this.field99[0];
            float var4 = var3 * 0.0030517578F;
            field98 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field100 = (int) (field98 * 65536.0F);
        }
        if (this.field104[arg0] == 0) {
            return 0;
        }
        float var5 = this.method45(arg0, 0, arg1);
        field101[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method44(arg0, 0, arg1));
        field101[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field104[arg0]; var6++) {
            float var9 = this.method45(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method44(arg0, var6, arg1));
            float var11 = var9 * var9;
            field101[arg0][var6 * 2 + 1] = field101[arg0][var6 * 2 - 1] * var11;
            field101[arg0][var6 * 2] = field101[arg0][var6 * 2 - 1] * var10 + field101[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field101[arg0][var12] += field101[arg0][var12 - 1] * var10 + field101[arg0][var12 - 2] * var11;
            }
            field101[arg0][1] += field101[arg0][0] * var10 + var11;
            field101[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field104[0] * 2; var7++) {
                field101[0][var7] *= field98;
            }
        }
        for (int var8 = 0; var8 < this.field104[arg0] * 2; var8++) {
            field102[arg0][var8] = (int) (field101[arg0][var8] * 65536.0F);
        }
        return this.field104[arg0] * 2;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "()V")
    public static void method41() {
        field101 = null;
        field102 = null;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lv;Ljf;)V")
    public final void method42(class149 arg0, class63 arg1) {
        int var3 = arg0.method1045((byte) -41);
        this.field104[0] = var3 >> 4;
        this.field104[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field99[0] = this.field99[1] = 0;
            return;
        }
        this.field99[0] = arg0.method1050(1272006568);
        this.field99[1] = arg0.method1050(1272006568);
        int var4 = arg0.method1045((byte) -45);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field104[var5]; var8++) {
                this.field103[var5][0][var8] = arg0.method1050(1272006568);
                this.field97[var5][0][var8] = arg0.method1050(1272006568);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field104[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field103[var6][1][var7] = this.field103[var6][0][var7];
                    this.field97[var6][1][var7] = this.field97[var6][0][var7];
                } else {
                    this.field103[var6][1][var7] = arg0.method1050(1272006568);
                    this.field97[var6][1][var7] = arg0.method1050(1272006568);
                }
            }
        }
        if (var4 != 0 || this.field99[1] != this.field99[0]) {
            arg1.method461(arg0);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(F)F")
    private static final float method43(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIF)F")
    private final float method44(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field103[arg0][1][arg1] - this.field103[arg0][0][arg1]) * arg2 + (float) this.field103[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method43(var5);
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(IIF)F")
    private final float method45(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field97[arg0][1][arg1] - this.field97[arg0][0][arg1]) * arg2 + (float) this.field97[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }
}
