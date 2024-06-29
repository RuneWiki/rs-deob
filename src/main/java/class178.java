import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public class class178 {

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "[I")
    private int[] field2874 = new int[2];

    @OriginalMember(owner = "client!kv", name = "d", descriptor = "[I")
    public int[] field2876 = new int[2];

    @OriginalMember(owner = "client!kv", name = "e", descriptor = "[[[I")
    private int[][][] field2877 = new int[2][2][4];

    @OriginalMember(owner = "client!kv", name = "h", descriptor = "[[[I")
    private int[][][] field2880 = new int[2][2][4];

    @OriginalMember(owner = "client!kv", name = "f", descriptor = "[[I")
    public static int[][] field2878 = new int[2][8];

    @OriginalMember(owner = "client!kv", name = "c", descriptor = "[[F")
    private static float[][] field2875 = new float[2][8];

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "F")
    private static float field2873;

    @OriginalMember(owner = "client!kv", name = "g", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIF)F", line = 4)
    private final float method1216(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2880[arg0][1][arg1] - this.field2880[arg0][0][arg1]) * arg2 + (float) this.field2880[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1219(var5);
    }

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "(IIF)F", line = 16)
    private final float method1217(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2877[arg0][1][arg1] - this.field2877[arg0][0][arg1]) * arg2 + (float) this.field2877[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "()V", line = 24)
    public static void method1218() {
        field2875 = null;
        field2878 = null;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(F)F", line = 29)
    private static final float method1219(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lnn;Lcs;)V", line = 35)
    public final void method1220(class289 arg0, class228 arg1) {
        int var3 = arg0.method1858(-3256);
        this.field2876[0] = var3 >> 4;
        this.field2876[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field2874[0] = this.field2874[1] = 0;
            return;
        }
        this.field2874[0] = arg0.method1841((byte) -117);
        this.field2874[1] = arg0.method1841((byte) -117);
        int var4 = arg0.method1858(-3256);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field2876[var5]; var8++) {
                this.field2880[var5][0][var8] = arg0.method1841((byte) -125);
                this.field2877[var5][0][var8] = arg0.method1841((byte) -128);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field2876[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field2880[var6][1][var7] = this.field2880[var6][0][var7];
                    this.field2877[var6][1][var7] = this.field2877[var6][0][var7];
                } else {
                    this.field2880[var6][1][var7] = arg0.method1841((byte) -121);
                    this.field2877[var6][1][var7] = arg0.method1841((byte) 19);
                }
            }
        }
        if (var4 != 0 || this.field2874[1] != this.field2874[0]) {
            arg1.method1513(arg0);
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IF)I", line = 118)
    public final int method1221(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field2874[1] - this.field2874[0]) * arg1 + (float) this.field2874[0];
            float var4 = var3 * 0.0030517578F;
            field2873 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field2879 = (int) (field2873 * 65536.0F);
        }
        if (this.field2876[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1217(arg0, 0, arg1);
        field2875[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1216(arg0, 0, arg1));
        field2875[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field2876[arg0]; var6++) {
            float var9 = this.method1217(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method1216(arg0, var6, arg1));
            float var11 = var9 * var9;
            field2875[arg0][var6 * 2 + 1] = field2875[arg0][var6 * 2 - 1] * var11;
            field2875[arg0][var6 * 2] = field2875[arg0][var6 * 2 - 1] * var10 + field2875[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field2875[arg0][var12] += field2875[arg0][var12 - 1] * var10 + field2875[arg0][var12 - 2] * var11;
            }
            field2875[arg0][1] += field2875[arg0][0] * var10 + var11;
            field2875[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field2876[0] * 2; var7++) {
                field2875[0][var7] *= field2873;
            }
        }
        for (int var8 = 0; var8 < this.field2876[arg0] * 2; var8++) {
            field2878[arg0][var8] = (int) (field2875[arg0][var8] * 65536.0F);
        }
        return this.field2876[arg0] * 2;
    }
}
