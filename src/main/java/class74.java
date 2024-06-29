import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class74 {

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "[[[I")
    private int[][][] field1345 = new int[2][2][4];

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "[[[I")
    private int[][][] field1343 = new int[2][2][4];

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "[I")
    public int[] field1348 = new int[2];

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "[I")
    private int[] field1350 = new int[2];

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "[[I")
    public static int[][] field1346 = new int[2][8];

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "[[F")
    private static float[][] field1344 = new float[2][8];

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "F")
    private static float field1347;

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIF)F", line = 12)
    private final float method559(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1345[arg0][1][arg1] - this.field1345[arg0][0][arg1]) * arg2 + (float) this.field1345[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Loe;Lkl;)V", line = 19)
    public final void method560(class146 arg0, class150 arg1) {
        int var3 = arg0.method1005((byte) 122);
        this.field1348[0] = var3 >> 4;
        this.field1348[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field1350[0] = this.field1350[1] = 0;
            return;
        }
        this.field1350[0] = arg0.method989(119);
        this.field1350[1] = arg0.method989(69);
        int var4 = arg0.method1005((byte) 122);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1348[var5]; var6++) {
                this.field1343[var5][0][var6] = arg0.method989(83);
                this.field1345[var5][0][var6] = arg0.method989(119);
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1348[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1343[var7][1][var8] = this.field1343[var7][0][var8];
                    this.field1345[var7][1][var8] = this.field1345[var7][0][var8];
                } else {
                    this.field1343[var7][1][var8] = arg0.method989(79);
                    this.field1345[var7][1][var8] = arg0.method989(71);
                }
            }
        }
        if (var4 != 0 || this.field1350[1] != this.field1350[0]) {
            arg1.method1075(arg0);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(F)F", line = 86)
    private static final float method561(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IF)I", line = 92)
    public final int method562(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1350[1] - this.field1350[0]) * arg1 + (float) this.field1350[0];
            float var4 = var3 * 0.0030517578F;
            field1347 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field1349 = (int) (field1347 * 65536.0F);
        }
        if (this.field1348[arg0] == 0) {
            return 0;
        }
        float var5 = this.method559(arg0, 0, arg1);
        field1344[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method563(arg0, 0, arg1));
        field1344[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1348[arg0]; var6++) {
            float var7 = this.method559(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method563(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1344[arg0][var6 * 2 + 1] = field1344[arg0][var6 * 2 - 1] * var9;
            field1344[arg0][var6 * 2] = field1344[arg0][var6 * 2 - 1] * var8 + field1344[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1344[arg0][var10] += field1344[arg0][var10 - 1] * var8 + field1344[arg0][var10 - 2] * var9;
            }
            field1344[arg0][1] += field1344[arg0][0] * var8 + var9;
            field1344[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1348[0] * 2; var11++) {
                field1344[0][var11] *= field1347;
            }
        }
        for (int var12 = 0; var12 < this.field1348[arg0] * 2; var12++) {
            field1346[arg0][var12] = (int) (field1344[arg0][var12] * 65536.0F);
        }
        return this.field1348[arg0] * 2;
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(IIF)F", line = 157)
    private final float method563(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1343[arg0][1][arg1] - this.field1343[arg0][0][arg1]) * arg2 + (float) this.field1343[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method561(var5);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "()V", line = 175)
    public static void method564() {
        field1344 = (float[][]) null;
        field1346 = (int[][]) null;
    }
}
