import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class55 {

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "[[[I")
    private int[][][] field1419 = new int[2][2][4];

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "[I")
    public int[] field1420 = new int[2];

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "[I")
    private int[] field1423 = new int[2];

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "[[[I")
    private int[][][] field1424 = new int[2][2][4];

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "[[I")
    public static int[][] field1418 = new int[2][8];

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "[[F")
    private static float[][] field1422 = new float[2][8];

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "F")
    private static float field1425;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IF)I", line = 4)
    public final int method465(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1423[1] - this.field1423[0]) * arg1 + (float) this.field1423[0];
            float var4 = var3 * 0.0030517578F;
            field1425 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field1421 = (int) (field1425 * 65536.0F);
        }
        if (this.field1420[arg0] == 0) {
            return 0;
        }
        float var5 = this.method466(arg0, 0, arg1);
        field1422[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method469(arg0, 0, arg1));
        field1422[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1420[arg0]; var6++) {
            float var9 = this.method466(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method469(arg0, var6, arg1));
            float var11 = var9 * var9;
            field1422[arg0][var6 * 2 + 1] = field1422[arg0][var6 * 2 - 1] * var11;
            field1422[arg0][var6 * 2] = field1422[arg0][var6 * 2 - 1] * var10 + field1422[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field1422[arg0][var12] += field1422[arg0][var12 - 1] * var10 + field1422[arg0][var12 - 2] * var11;
            }
            field1422[arg0][1] += field1422[arg0][0] * var10 + var11;
            field1422[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field1420[0] * 2; var7++) {
                field1422[0][var7] *= field1425;
            }
        }
        for (int var8 = 0; var8 < this.field1420[arg0] * 2; var8++) {
            field1418[arg0][var8] = (int) (field1422[arg0][var8] * 65536.0F);
        }
        return this.field1420[arg0] * 2;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIF)F", line = 72)
    private final float method466(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1419[arg0][1][arg1] - this.field1419[arg0][0][arg1]) * arg2 + (float) this.field1419[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(F)F", line = 88)
    private static final float method467(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "()V", line = 93)
    public static void method468() {
        field1422 = null;
        field1418 = null;
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(IIF)F", line = 99)
    private final float method469(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1424[arg0][1][arg1] - this.field1424[arg0][0][arg1]) * arg2 + (float) this.field1424[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method467(var5);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lfe;Ln;)V", line = 113)
    public final void method470(class36 arg0, class78 arg1) {
        int var3 = arg0.method365((byte) -127);
        this.field1420[0] = var3 >> 4;
        this.field1420[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field1423[0] = this.field1423[1] = 0;
            return;
        }
        this.field1423[0] = arg0.method351((byte) -114);
        this.field1423[1] = arg0.method351((byte) -107);
        int var4 = arg0.method365((byte) -127);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field1420[var5]; var8++) {
                this.field1424[var5][0][var8] = arg0.method351((byte) -111);
                this.field1419[var5][0][var8] = arg0.method351((byte) -104);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field1420[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field1424[var6][1][var7] = this.field1424[var6][0][var7];
                    this.field1419[var6][1][var7] = this.field1419[var6][0][var7];
                } else {
                    this.field1424[var6][1][var7] = arg0.method351((byte) -106);
                    this.field1419[var6][1][var7] = arg0.method351((byte) -105);
                }
            }
        }
        if (var4 != 0 || this.field1423[1] != this.field1423[0]) {
            arg1.method603(arg0);
        }
    }
}
