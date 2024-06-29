import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class273 {

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "[[[I")
    private int[][][] field4340 = new int[2][2][4];

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "[I")
    public int[] field4338 = new int[2];

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "[[[I")
    private int[][][] field4343 = new int[2][2][4];

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "[I")
    private int[] field4337 = new int[2];

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "[[F")
    private static float[][] field4342 = new float[2][8];

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "[[I")
    public static int[][] field4344 = new int[2][8];

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "F")
    private static float field4341;

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "I")
    public static int field4339;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IF)I", line = 6)
    public final int method1945(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field4337[1] - this.field4337[0]) * arg1 + (float) this.field4337[0];
            float var4 = var3 * 0.0030517578F;
            field4341 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field4339 = (int) (field4341 * 65536.0F);
        }
        if (this.field4338[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1950(arg0, 0, arg1);
        field4342[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1946(arg0, 0, arg1));
        field4342[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field4338[arg0]; var6++) {
            float var7 = this.method1950(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method1946(arg0, var6, arg1));
            float var9 = var7 * var7;
            field4342[arg0][var6 * 2 + 1] = field4342[arg0][var6 * 2 - 1] * var9;
            field4342[arg0][var6 * 2] = field4342[arg0][var6 * 2 - 1] * var8 + field4342[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field4342[arg0][var10] += field4342[arg0][var10 - 1] * var8 + field4342[arg0][var10 - 2] * var9;
            }
            field4342[arg0][1] += field4342[arg0][0] * var8 + var9;
            field4342[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field4338[0] * 2; var11++) {
                field4342[0][var11] *= field4341;
            }
        }
        for (int var12 = 0; var12 < this.field4338[arg0] * 2; var12++) {
            field4344[arg0][var12] = (int) (field4342[arg0][var12] * 65536.0F);
        }
        return this.field4338[arg0] * 2;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIF)F", line = 70)
    private final float method1946(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field4343[arg0][1][arg1] - this.field4343[arg0][0][arg1]) * arg2 + (float) this.field4343[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1948(var5);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "()V", line = 77)
    public static void method1947() {
        field4342 = (float[][]) null;
        field4344 = (int[][]) null;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(F)F", line = 83)
    private static final float method1948(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lim;Lwb;)V", line = 91)
    public final void method1949(class192 arg0, class165 arg1) {
        int var3 = arg0.method1399(-1172389784);
        this.field4338[0] = var3 >> 4;
        this.field4338[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field4337[0] = this.field4337[1] = 0;
            return;
        }
        this.field4337[0] = arg0.method1396(-124);
        this.field4337[1] = arg0.method1396(-111);
        int var4 = arg0.method1399(-1172389784);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field4338[var5]; var6++) {
                this.field4343[var5][0][var6] = arg0.method1396(-128);
                this.field4340[var5][0][var6] = arg0.method1396(-48);
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field4338[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field4343[var7][1][var8] = this.field4343[var7][0][var8];
                    this.field4340[var7][1][var8] = this.field4340[var7][0][var8];
                } else {
                    this.field4343[var7][1][var8] = arg0.method1396(-116);
                    this.field4340[var7][1][var8] = arg0.method1396(-77);
                }
            }
        }
        if (var4 != 0 || this.field4337[1] != this.field4337[0]) {
            arg1.method1139(arg0);
        }
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(IIF)F", line = 172)
    private final float method1950(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field4340[arg0][1][arg1] - this.field4340[arg0][0][arg1]) * arg2 + (float) this.field4340[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }
}
