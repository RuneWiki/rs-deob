import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class39 {

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "[[[I")
    private int[][][] field1004 = new int[2][2][4];

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "[I")
    public int[] field1007 = new int[2];

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "[I")
    private int[] field1008 = new int[2];

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "[[[I")
    private int[][][] field1009 = new int[2][2][4];

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "[[I")
    public static int[][] field1003 = new int[2][8];

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "[[F")
    private static float[][] field1002 = new float[2][8];

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "F")
    private static float field1005;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "()V")
    public static void method295() {
        field1002 = null;
        field1003 = null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIF)F")
    private final float method296(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1009[arg0][1][arg1] - this.field1009[arg0][0][arg1]) * arg2 + (float) this.field1009[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IF)I")
    public final int method297(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1008[1] - this.field1008[0]) * arg1 + (float) this.field1008[0];
            float var4 = var3 * 0.0030517578F;
            field1005 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field1006 = (int) (field1005 * 65536.0F);
        }
        if (this.field1007[arg0] == 0) {
            return 0;
        }
        float var5 = this.method296(arg0, 0, arg1);
        field1002[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method300(arg0, 0, arg1));
        field1002[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1007[arg0]; var6++) {
            float var9 = this.method296(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method300(arg0, var6, arg1));
            float var11 = var9 * var9;
            field1002[arg0][var6 * 2 + 1] = field1002[arg0][var6 * 2 - 1] * var11;
            field1002[arg0][var6 * 2] = field1002[arg0][var6 * 2 - 1] * var10 + field1002[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field1002[arg0][var12] += field1002[arg0][var12 - 1] * var10 + field1002[arg0][var12 - 2] * var11;
            }
            field1002[arg0][1] += field1002[arg0][0] * var10 + var11;
            field1002[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field1007[0] * 2; var7++) {
                field1002[0][var7] *= field1005;
            }
        }
        for (int var8 = 0; var8 < this.field1007[arg0] * 2; var8++) {
            field1003[arg0][var8] = (int) (field1002[arg0][var8] * 65536.0F);
        }
        return this.field1007[arg0] * 2;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(F)F")
    private static final float method298(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lwd;Lvd;)V")
    public final void method299(class157 arg0, class150 arg1) {
        int var3 = arg0.method1194(false);
        this.field1007[0] = var3 >> 4;
        this.field1007[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field1008[0] = this.field1008[1] = 0;
            return;
        }
        this.field1008[0] = arg0.method1161((byte) 60);
        this.field1008[1] = arg0.method1161((byte) 60);
        int var4 = arg0.method1194(false);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field1007[var5]; var8++) {
                this.field1004[var5][0][var8] = arg0.method1161((byte) 60);
                this.field1009[var5][0][var8] = arg0.method1161((byte) 60);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field1007[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field1004[var6][1][var7] = this.field1004[var6][0][var7];
                    this.field1009[var6][1][var7] = this.field1009[var6][0][var7];
                } else {
                    this.field1004[var6][1][var7] = arg0.method1161((byte) 60);
                    this.field1009[var6][1][var7] = arg0.method1161((byte) 60);
                }
            }
        }
        if (var4 != 0 || this.field1008[1] != this.field1008[0]) {
            arg1.method1111(arg0);
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(IIF)F")
    private final float method300(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1004[arg0][1][arg1] - this.field1004[arg0][0][arg1]) * arg2 + (float) this.field1004[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method298(var5);
    }
}
