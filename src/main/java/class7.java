import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!BVWZSTJJ")
public class class7 {

    @OriginalMember(owner = "client!BVWZSTJJ", name = "a", descriptor = "I")
    private int field118 = -6404;

    @OriginalMember(owner = "client!BVWZSTJJ", name = "b", descriptor = "[I")
    public int[] field119 = new int[2];

    @OriginalMember(owner = "client!BVWZSTJJ", name = "c", descriptor = "[[[I")
    public int[][][] field120 = new int[2][2][4];

    @OriginalMember(owner = "client!BVWZSTJJ", name = "d", descriptor = "[[[I")
    public int[][][] field121 = new int[2][2][4];

    @OriginalMember(owner = "client!BVWZSTJJ", name = "e", descriptor = "[I")
    public int[] field122 = new int[2];

    @OriginalMember(owner = "client!BVWZSTJJ", name = "f", descriptor = "[[F")
    public static float[][] field123 = new float[2][8];

    @OriginalMember(owner = "client!BVWZSTJJ", name = "g", descriptor = "[[I")
    public static int[][] field124 = new int[2][8];

    @OriginalMember(owner = "client!BVWZSTJJ", name = "h", descriptor = "F")
    public static float field125;

    @OriginalMember(owner = "client!BVWZSTJJ", name = "i", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!BVWZSTJJ", name = "a", descriptor = "(IIFI)F")
    private float method43(int arg0, int arg1, float arg2, int arg3) {
        if (arg3 >= 0) {
            throw new NullPointerException();
        }
        float var5 = (float) (this.field121[arg1][1][arg0] - this.field121[arg1][0][arg0]) * arg2 + (float) this.field121[arg1][0][arg0];
        float var6 = var5 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var6 / 20.0F));
    }

    @OriginalMember(owner = "client!BVWZSTJJ", name = "a", descriptor = "(ZF)F")
    private float method44(boolean arg0, float arg1) {
        float var3 = (float) Math.pow(2.0D, (double) arg1) * 32.703197F;
        if (arg0) {
            throw new NullPointerException();
        }
        return var3 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!BVWZSTJJ", name = "a", descriptor = "(FIII)F")
    private float method45(float arg0, int arg1, int arg2, int arg3) {
        float var5 = (float) (this.field120[arg1][1][arg3] - this.field120[arg1][0][arg3]) * arg0 + (float) this.field120[arg1][0][arg3];
        if (arg2 != 3) {
            throw new NullPointerException();
        }
        float var6 = var5 * 1.2207031E-4F;
        return this.method44(false, var6);
    }

    @OriginalMember(owner = "client!BVWZSTJJ", name = "a", descriptor = "(BFI)I")
    public int method46(byte arg0, float arg1, int arg2) {
        if (arg2 == 0) {
            float var4 = (float) (this.field122[1] - this.field122[0]) * arg1 + (float) this.field122[0];
            float var5 = var4 * 0.0030517578F;
            field125 = (float) Math.pow(0.1D, (double) (var5 / 20.0F));
            field126 = (int) (field125 * 65536.0F);
        }
        if (this.field119[arg2] == 0) {
            return 0;
        }
        float var6 = this.method43(0, arg2, arg1, -613);
        field123[arg2][0] = var6 * -2.0F * (float) Math.cos((double) this.method45(arg1, arg2, 3, 0));
        field123[arg2][1] = var6 * var6;
        for (int var7 = 1; var7 < this.field119[arg2]; var7++) {
            float var12 = this.method43(var7, arg2, arg1, -613);
            float var13 = var12 * -2.0F * (float) Math.cos((double) this.method45(arg1, arg2, 3, var7));
            float var14 = var12 * var12;
            field123[arg2][var7 * 2 + 1] = field123[arg2][var7 * 2 - 1] * var14;
            field123[arg2][var7 * 2] = field123[arg2][var7 * 2 - 1] * var13 + field123[arg2][var7 * 2 - 2] * var14;
            for (int var15 = var7 * 2 - 1; var15 >= 2; var15--) {
                field123[arg2][var15] += field123[arg2][var15 - 1] * var13 + field123[arg2][var15 - 2] * var14;
            }
            field123[arg2][1] += field123[arg2][0] * var13 + var14;
            field123[arg2][0] += var13;
        }
        if (arg0 == 7) {
            boolean var8 = false;
        } else {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        if (arg2 == 0) {
            for (int var10 = 0; var10 < this.field119[0] * 2; var10++) {
                field123[0][var10] *= field125;
            }
        }
        for (int var11 = 0; var11 < this.field119[arg2] * 2; var11++) {
            field124[arg2][var11] = (int) (field123[arg2][var11] * 65536.0F);
        }
        return this.field119[arg2] * 2;
    }

    @OriginalMember(owner = "client!BVWZSTJJ", name = "a", descriptor = "(LTPZZASFL;LMVHXDWGI;B)V")
    public final void method47(class60 arg0, class38 arg1, byte arg2) {
        int var4 = arg1.method357();
        this.field119[0] = var4 >> 4;
        this.field119[1] = var4 & 0xF;
        if (arg2 != 1) {
            this.field118 = -7;
        }
        if (var4 == 0) {
            this.field122[0] = this.field122[1] = 0;
            if (class66.field1692) {
            }
            return;
        }
        this.field122[0] = arg1.method359();
        this.field122[1] = arg1.method359();
        int var5 = arg1.method357();
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var9 = 0; var9 < this.field119[var6]; var9++) {
                this.field120[var6][0][var9] = arg1.method359();
                this.field121[var6][0][var9] = arg1.method359();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field119[var7]; var8++) {
                if ((var5 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field120[var7][1][var8] = this.field120[var7][0][var8];
                    this.field121[var7][1][var8] = this.field121[var7][0][var8];
                } else {
                    this.field120[var7][1][var8] = arg1.method359();
                    this.field121[var7][1][var8] = arg1.method359();
                }
            }
        }
        if (var5 != 0 || this.field122[1] != this.field122[0]) {
            arg0.method571(arg1, 10831);
        }
    }
}
