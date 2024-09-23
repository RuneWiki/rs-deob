import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("YSFPJPXV")
public class class69 {

    @OriginalMember(owner = "YSFPJPXV", name = "a", descriptor = "Z")
    private boolean field1678 = true;

    @OriginalMember(owner = "YSFPJPXV", name = "b", descriptor = "I")
    private int field1679 = 9;

    @OriginalMember(owner = "YSFPJPXV", name = "c", descriptor = "[I")
    public int[] field1680 = new int[2];

    @OriginalMember(owner = "YSFPJPXV", name = "d", descriptor = "[[[I")
    public int[][][] field1681 = new int[2][2][4];

    @OriginalMember(owner = "YSFPJPXV", name = "e", descriptor = "[[[I")
    public int[][][] field1682 = new int[2][2][4];

    @OriginalMember(owner = "YSFPJPXV", name = "f", descriptor = "[I")
    public int[] field1683 = new int[2];

    @OriginalMember(owner = "YSFPJPXV", name = "g", descriptor = "[[F")
    public static float[][] field1684 = new float[2][8];

    @OriginalMember(owner = "YSFPJPXV", name = "h", descriptor = "[[I")
    public static int[][] field1685 = new int[2][8];

    @OriginalMember(owner = "YSFPJPXV", name = "i", descriptor = "F")
    public static float field1686;

    @OriginalMember(owner = "YSFPJPXV", name = "j", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "YSFPJPXV", name = "a", descriptor = "(IFIZ)F")
    private float method583(int arg0, float arg1, int arg2, boolean arg3) {
        if (!arg3) {
            this.field1678 = !this.field1678;
        }
        float var5 = (float) (this.field1682[arg0][1][arg2] - this.field1682[arg0][0][arg2]) * arg1 + (float) this.field1682[arg0][0][arg2];
        float var6 = var5 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var6 / 20.0F));
    }

    @OriginalMember(owner = "YSFPJPXV", name = "a", descriptor = "(IF)F")
    private float method584(int arg0, float arg1) {
        float var3 = (float) Math.pow(2.0D, (double) arg1) * 32.703197F;
        if (arg0 < 9 || arg0 > 9) {
            throw new NullPointerException();
        }
        return var3 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "YSFPJPXV", name = "a", descriptor = "(IIFI)F")
    private float method585(int arg0, int arg1, float arg2, int arg3) {
        if (arg3 != 15878) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        float var6 = (float) (this.field1681[arg0][1][arg1] - this.field1681[arg0][0][arg1]) * arg2 + (float) this.field1681[arg0][0][arg1];
        float var7 = var6 * 1.2207031E-4F;
        return this.method584(this.field1679, var7);
    }

    @OriginalMember(owner = "YSFPJPXV", name = "a", descriptor = "(IIF)I")
    public int method586(int arg0, int arg1, float arg2) {
        if (arg1 == 0) {
            float var4 = (float) (this.field1683[1] - this.field1683[0]) * arg2 + (float) this.field1683[0];
            float var5 = var4 * 0.0030517578F;
            field1686 = (float) Math.pow(0.1D, (double) (var5 / 20.0F));
            field1687 = (int) (field1686 * 65536.0F);
        }
        if (this.field1680[arg1] == 0) {
            return 0;
        }
        float var6 = this.method583(arg1, arg2, 0, true);
        field1684[arg1][0] = var6 * -2.0F * (float) Math.cos((double) this.method585(arg1, 0, arg2, 15878));
        field1684[arg1][1] = var6 * var6;
        if (arg0 < 4 || arg0 > 4) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        for (int var8 = 1; var8 < this.field1680[arg1]; var8++) {
            float var11 = this.method583(arg1, arg2, var8, true);
            float var12 = var11 * -2.0F * (float) Math.cos((double) this.method585(arg1, var8, arg2, 15878));
            float var13 = var11 * var11;
            field1684[arg1][var8 * 2 + 1] = field1684[arg1][var8 * 2 - 1] * var13;
            field1684[arg1][var8 * 2] = field1684[arg1][var8 * 2 - 1] * var12 + field1684[arg1][var8 * 2 - 2] * var13;
            for (int var14 = var8 * 2 - 1; var14 >= 2; var14--) {
                field1684[arg1][var14] += field1684[arg1][var14 - 1] * var12 + field1684[arg1][var14 - 2] * var13;
            }
            field1684[arg1][1] += field1684[arg1][0] * var12 + var13;
            field1684[arg1][0] += var12;
        }
        if (arg1 == 0) {
            for (int var9 = 0; var9 < this.field1680[0] * 2; var9++) {
                field1684[0][var9] *= field1686;
            }
        }
        for (int var10 = 0; var10 < this.field1680[arg1] * 2; var10++) {
            field1685[arg1][var10] = (int) (field1684[arg1][var10] * 65536.0F);
        }
        return this.field1680[arg1] * 2;
    }

    @OriginalMember(owner = "YSFPJPXV", name = "a", descriptor = "(LEGCCHUZS;ILUPKVWWFD;)V")
    public final void method587(class15 arg0, int arg1, class61 arg2) {
        int var4 = 13 / arg1;
        int var5 = arg0.method261();
        this.field1680[0] = var5 >> 4;
        this.field1680[1] = var5 & 0xF;
        if (var5 == 0) {
            this.field1683[0] = this.field1683[1] = 0;
            if (class33.field1009) {
            }
            return;
        }
        this.field1683[0] = arg0.method263();
        this.field1683[1] = arg0.method263();
        int var6 = arg0.method261();
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var10 = 0; var10 < this.field1680[var7]; var10++) {
                this.field1681[var7][0][var10] = arg0.method263();
                this.field1682[var7][0][var10] = arg0.method263();
            }
        }
        for (int var8 = 0; var8 < 2; var8++) {
            for (int var9 = 0; var9 < this.field1680[var8]; var9++) {
                if ((var6 & 0x1 << var8 * 4 << var9) == 0) {
                    this.field1681[var8][1][var9] = this.field1681[var8][0][var9];
                    this.field1682[var8][1][var9] = this.field1682[var8][0][var9];
                } else {
                    this.field1681[var8][1][var9] = arg0.method263();
                    this.field1682[var8][1][var9] = arg0.method263();
                }
            }
        }
        if (var6 != 0 || this.field1683[1] != this.field1683[0]) {
            arg2.method550(-267, arg0);
        }
    }
}
