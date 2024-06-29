import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class13 {

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "[[[I")
    private int[][][] field223 = new int[2][2][4];

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "[[[I")
    private int[][][] field220 = new int[2][2][4];

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "[I")
    public int[] field221 = new int[2];

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "[I")
    private int[] field225 = new int[2];

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "[[F")
    private static float[][] field224 = new float[2][8];

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "[[I")
    public static int[][] field219 = new int[2][8];

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "F")
    private static float field226;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "I")
    public static int field222;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lfh;Lnm;)V")
    public final void method100(class463 arg0, class332 arg1) {
        int var3 = arg0.method2737(false);
        this.field221[0] = var3 >> 4;
        this.field221[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field225[0] = this.field225[1] = 0;
            return;
        }
        this.field225[0] = arg0.method2758((byte) 117);
        this.field225[1] = arg0.method2758((byte) 119);
        int var4 = arg0.method2737(false);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field221[var5]; var8++) {
                this.field220[var5][0][var8] = arg0.method2758((byte) 90);
                this.field223[var5][0][var8] = arg0.method2758((byte) 77);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field221[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field220[var6][1][var7] = this.field220[var6][0][var7];
                    this.field223[var6][1][var7] = this.field223[var6][0][var7];
                } else {
                    this.field220[var6][1][var7] = arg0.method2758((byte) 106);
                    this.field223[var6][1][var7] = arg0.method2758((byte) 108);
                }
            }
        }
        if (var4 != 0 || this.field225[1] != this.field225[0]) {
            arg1.method1925(arg0);
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(F)F")
    private static final float method101(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IF)I")
    public final int method102(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field225[1] - this.field225[0]) * arg1 + (float) this.field225[0];
            float var4 = var3 * 0.0030517578F;
            field226 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field222 = (int) (field226 * 65536.0F);
        }
        if (this.field221[arg0] == 0) {
            return 0;
        }
        float var5 = this.method104(arg0, 0, arg1);
        field224[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method103(arg0, 0, arg1));
        field224[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field221[arg0]; var6++) {
            float var9 = this.method104(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method103(arg0, var6, arg1));
            float var11 = var9 * var9;
            field224[arg0][var6 * 2 + 1] = field224[arg0][var6 * 2 - 1] * var11;
            field224[arg0][var6 * 2] = field224[arg0][var6 * 2 - 1] * var10 + field224[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field224[arg0][var12] += field224[arg0][var12 - 1] * var10 + field224[arg0][var12 - 2] * var11;
            }
            field224[arg0][1] += field224[arg0][0] * var10 + var11;
            field224[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field221[0] * 2; var7++) {
                field224[0][var7] *= field226;
            }
        }
        for (int var8 = 0; var8 < this.field221[arg0] * 2; var8++) {
            field219[arg0][var8] = (int) (field224[arg0][var8] * 65536.0F);
        }
        return this.field221[arg0] * 2;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIF)F")
    private final float method103(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field220[arg0][1][arg1] - this.field220[arg0][0][arg1]) * arg2 + (float) this.field220[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method101(var5);
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(IIF)F")
    private final float method104(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field223[arg0][1][arg1] - this.field223[arg0][0][arg1]) * arg2 + (float) this.field223[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "()V")
    public static void method105() {
        field224 = null;
        field219 = null;
    }
}
