import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class112 {

    @OriginalMember(owner = "client!le", name = "a", descriptor = "[[[I")
    private int[][][] field1708 = new int[2][2][4];

    @OriginalMember(owner = "client!le", name = "d", descriptor = "[I")
    private int[] field1711 = new int[2];

    @OriginalMember(owner = "client!le", name = "c", descriptor = "[I")
    public int[] field1710 = new int[2];

    @OriginalMember(owner = "client!le", name = "h", descriptor = "[[[I")
    private int[][][] field1715 = new int[2][2][4];

    @OriginalMember(owner = "client!le", name = "f", descriptor = "[[I")
    public static int[][] field1713 = new int[2][8];

    @OriginalMember(owner = "client!le", name = "g", descriptor = "[[F")
    private static float[][] field1714 = new float[2][8];

    @OriginalMember(owner = "client!le", name = "b", descriptor = "F")
    private static float field1709;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "I")
    public static int field1712;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Lfj;Lbf;)V", line = 4)
    public final void method713(class3 arg0, class51 arg1) {
        int var3 = arg0.method64((byte) 83);
        this.field1710[0] = var3 >> 4;
        this.field1710[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field1711[0] = this.field1711[1] = 0;
            return;
        }
        this.field1711[0] = arg0.method63((byte) 1);
        this.field1711[1] = arg0.method63((byte) 1);
        int var4 = arg0.method64((byte) -117);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field1710[var5]; var6++) {
                this.field1708[var5][0][var6] = arg0.method63((byte) 1);
                this.field1715[var5][0][var6] = arg0.method63((byte) 1);
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1710[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1708[var7][1][var8] = this.field1708[var7][0][var8];
                    this.field1715[var7][1][var8] = this.field1715[var7][0][var8];
                } else {
                    this.field1708[var7][1][var8] = arg0.method63((byte) 1);
                    this.field1715[var7][1][var8] = arg0.method63((byte) 1);
                }
            }
        }
        if (var4 != 0 || this.field1711[1] != this.field1711[0]) {
            arg1.method392(arg0);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIF)F", line = 73)
    private final float method714(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1708[arg0][1][arg1] - this.field1708[arg0][0][arg1]) * arg2 + (float) this.field1708[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method715(var5);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(F)F", line = 80)
    private static final float method715(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(IIF)F", line = 89)
    private final float method716(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1715[arg0][1][arg1] - this.field1715[arg0][0][arg1]) * arg2 + (float) this.field1715[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "()V", line = 95)
    public static void method717() {
        field1714 = (float[][]) null;
        field1713 = (int[][]) null;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IF)I", line = 110)
    public final int method718(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1711[1] - this.field1711[0]) * arg1 + (float) this.field1711[0];
            float var4 = var3 * 0.0030517578F;
            field1709 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field1712 = (int) (field1709 * 65536.0F);
        }
        if (this.field1710[arg0] == 0) {
            return 0;
        }
        float var5 = this.method716(arg0, 0, arg1);
        field1714[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method714(arg0, 0, arg1));
        field1714[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1710[arg0]; var6++) {
            float var7 = this.method716(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method714(arg0, var6, arg1));
            float var9 = var7 * var7;
            field1714[arg0][var6 * 2 + 1] = field1714[arg0][var6 * 2 - 1] * var9;
            field1714[arg0][var6 * 2] = field1714[arg0][var6 * 2 - 1] * var8 + field1714[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field1714[arg0][var10] += field1714[arg0][var10 - 1] * var8 + field1714[arg0][var10 - 2] * var9;
            }
            field1714[arg0][1] += field1714[arg0][0] * var8 + var9;
            field1714[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field1710[0] * 2; var11++) {
                field1714[0][var11] *= field1709;
            }
        }
        for (int var12 = 0; var12 < this.field1710[arg0] * 2; var12++) {
            field1713[arg0][var12] = (int) (field1714[arg0][var12] * 65536.0F);
        }
        return this.field1710[arg0] * 2;
    }
}
