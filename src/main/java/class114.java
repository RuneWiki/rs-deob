import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class114 {

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "[[[I")
    private int[][][] field1936 = new int[2][2][4];

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "[[[I")
    private int[][][] field1943 = new int[2][2][4];

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "[I")
    public int[] field1939 = new int[2];

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "[I")
    private int[] field1937 = new int[2];

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "[[F")
    private static float[][] field1941 = new float[2][8];

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "[[I")
    public static int[][] field1940 = new int[2][8];

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "F")
    private static float field1938;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "()V")
    public static void method872() {
        field1941 = null;
        field1940 = null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIF)F")
    private final float method873(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1936[arg0][1][arg1] - this.field1936[arg0][0][arg1]) * arg2 + (float) this.field1936[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method877(var5);
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(IIF)F")
    private final float method874(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1943[arg0][1][arg1] - this.field1943[arg0][0][arg1]) * arg2 + (float) this.field1943[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IF)I")
    public final int method875(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1937[1] - this.field1937[0]) * arg1 + (float) this.field1937[0];
            float var4 = var3 * 0.0030517578F;
            field1938 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field1942 = (int) (field1938 * 65536.0F);
        }
        if (this.field1939[arg0] == 0) {
            return 0;
        }
        float var5 = this.method874(arg0, 0, arg1);
        field1941[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method873(arg0, 0, arg1));
        field1941[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1939[arg0]; var6++) {
            float var9 = this.method874(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method873(arg0, var6, arg1));
            float var11 = var9 * var9;
            field1941[arg0][var6 * 2 + 1] = field1941[arg0][var6 * 2 - 1] * var11;
            field1941[arg0][var6 * 2] = field1941[arg0][var6 * 2 - 1] * var10 + field1941[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field1941[arg0][var12] += field1941[arg0][var12 - 1] * var10 + field1941[arg0][var12 - 2] * var11;
            }
            field1941[arg0][1] += field1941[arg0][0] * var10 + var11;
            field1941[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field1939[0] * 2; var7++) {
                field1941[0][var7] *= field1938;
            }
        }
        for (int var8 = 0; var8 < this.field1939[arg0] * 2; var8++) {
            field1940[arg0][var8] = (int) (field1941[arg0][var8] * 65536.0F);
        }
        return this.field1939[arg0] * 2;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lab;Lkc;)V")
    public final void method876(class249 arg0, class2 arg1) {
        int var3 = arg0.method1802((byte) 74);
        this.field1939[0] = var3 >> 4;
        this.field1939[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field1937[0] = this.field1937[1] = 0;
            return;
        }
        this.field1937[0] = arg0.method1821((byte) 51);
        this.field1937[1] = arg0.method1821((byte) 51);
        int var4 = arg0.method1802((byte) -122);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field1939[var5]; var8++) {
                this.field1936[var5][0][var8] = arg0.method1821((byte) 51);
                this.field1943[var5][0][var8] = arg0.method1821((byte) 51);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field1939[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field1936[var6][1][var7] = this.field1936[var6][0][var7];
                    this.field1943[var6][1][var7] = this.field1943[var6][0][var7];
                } else {
                    this.field1936[var6][1][var7] = arg0.method1821((byte) 51);
                    this.field1943[var6][1][var7] = arg0.method1821((byte) 51);
                }
            }
        }
        if (var4 != 0 || this.field1937[1] != this.field1937[0]) {
            arg1.method25(arg0);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(F)F")
    private static final float method877(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }
}
