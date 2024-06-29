import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!BVZJQTSH")
public class class5 {

    @OriginalMember(owner = "client!BVZJQTSH", name = "a", descriptor = "B")
    private byte field66 = 0;

    @OriginalMember(owner = "client!BVZJQTSH", name = "b", descriptor = "B")
    private byte field67 = 42;

    @OriginalMember(owner = "client!BVZJQTSH", name = "c", descriptor = "I")
    private int field68 = 8;

    @OriginalMember(owner = "client!BVZJQTSH", name = "d", descriptor = "[I")
    public int[] field69 = new int[2];

    @OriginalMember(owner = "client!BVZJQTSH", name = "e", descriptor = "[[[I")
    public int[][][] field70 = new int[2][2][4];

    @OriginalMember(owner = "client!BVZJQTSH", name = "f", descriptor = "[[[I")
    public int[][][] field71 = new int[2][2][4];

    @OriginalMember(owner = "client!BVZJQTSH", name = "g", descriptor = "[I")
    public int[] field72 = new int[2];

    @OriginalMember(owner = "client!BVZJQTSH", name = "h", descriptor = "[[F")
    public static float[][] field73 = new float[2][8];

    @OriginalMember(owner = "client!BVZJQTSH", name = "i", descriptor = "[[I")
    public static int[][] field74 = new int[2][8];

    @OriginalMember(owner = "client!BVZJQTSH", name = "j", descriptor = "F")
    public static float field75;

    @OriginalMember(owner = "client!BVZJQTSH", name = "k", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!BVZJQTSH", name = "a", descriptor = "(ZIFI)F")
    private float method22(boolean arg0, int arg1, float arg2, int arg3) {
        float var5 = (float) (this.field71[arg3][1][arg1] - this.field71[arg3][0][arg1]) * arg2 + (float) this.field71[arg3][0][arg1];
        if (!arg0) {
            throw new NullPointerException();
        }
        float var6 = var5 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var6 / 20.0F));
    }

    @OriginalMember(owner = "client!BVZJQTSH", name = "a", descriptor = "(BF)F")
    private float method23(byte arg0, float arg1) {
        float var3 = (float) Math.pow(2.0D, (double) arg1) * 32.703197F;
        if (arg0 == 0) {
            boolean var4 = false;
        } else {
            this.field68 = -139;
        }
        return var3 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!BVZJQTSH", name = "a", descriptor = "(BFII)F")
    private float method24(byte arg0, float arg1, int arg2, int arg3) {
        float var5 = (float) (this.field70[arg2][1][arg3] - this.field70[arg2][0][arg3]) * arg1 + (float) this.field70[arg2][0][arg3];
        float var6 = var5 * 1.2207031E-4F;
        if (arg0 != 42) {
            throw new NullPointerException();
        }
        return this.method23(this.field66, var6);
    }

    @OriginalMember(owner = "client!BVZJQTSH", name = "a", descriptor = "(BFI)I")
    public int method25(byte arg0, float arg1, int arg2) {
        if (arg0 != 8) {
            return 1;
        }
        if (arg2 == 0) {
            float var4 = (float) (this.field72[1] - this.field72[0]) * arg1 + (float) this.field72[0];
            float var5 = var4 * 0.0030517578F;
            field75 = (float) Math.pow(0.1D, (double) (var5 / 20.0F));
            field76 = (int) (field75 * 65536.0F);
        }
        if (this.field69[arg2] == 0) {
            return 0;
        }
        float var6 = this.method22(true, 0, arg1, arg2);
        field73[arg2][0] = var6 * -2.0F * (float) Math.cos((double) this.method24(this.field67, arg1, arg2, 0));
        field73[arg2][1] = var6 * var6;
        for (int var7 = 1; var7 < this.field69[arg2]; var7++) {
            float var10 = this.method22(true, var7, arg1, arg2);
            float var11 = var10 * -2.0F * (float) Math.cos((double) this.method24(this.field67, arg1, arg2, var7));
            float var12 = var10 * var10;
            field73[arg2][var7 * 2 + 1] = field73[arg2][var7 * 2 - 1] * var12;
            field73[arg2][var7 * 2] = field73[arg2][var7 * 2 - 1] * var11 + field73[arg2][var7 * 2 - 2] * var12;
            for (int var13 = var7 * 2 - 1; var13 >= 2; var13--) {
                field73[arg2][var13] += field73[arg2][var13 - 1] * var11 + field73[arg2][var13 - 2] * var12;
            }
            field73[arg2][1] += field73[arg2][0] * var11 + var12;
            field73[arg2][0] += var11;
        }
        if (arg2 == 0) {
            for (int var8 = 0; var8 < this.field69[0] * 2; var8++) {
                field73[0][var8] *= field75;
            }
        }
        for (int var9 = 0; var9 < this.field69[arg2] * 2; var9++) {
            field74[arg2][var9] = (int) (field73[arg2][var9] * 65536.0F);
        }
        return this.field69[arg2] * 2;
    }

    @OriginalMember(owner = "client!BVZJQTSH", name = "a", descriptor = "(LMNKDCXXG;ZLLMFHFXBO;)V")
    public final void method26(class37 arg0, boolean arg1, class34 arg2) {
        int var4 = arg0.method386();
        this.field69[0] = var4 >> 4;
        this.field69[1] = var4 & 0xF;
        if (arg1) {
            this.field68 = -24;
        }
        if (var4 == 0) {
            this.field72[0] = this.field72[1] = 0;
            return;
        }
        this.field72[0] = arg0.method388();
        this.field72[1] = arg0.method388();
        int var5 = arg0.method386();
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var9 = 0; var9 < this.field69[var6]; var9++) {
                this.field70[var6][0][var9] = arg0.method388();
                this.field71[var6][0][var9] = arg0.method388();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field69[var7]; var8++) {
                if ((var5 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field70[var7][1][var8] = this.field70[var7][0][var8];
                    this.field71[var7][1][var8] = this.field71[var7][0][var8];
                } else {
                    this.field70[var7][1][var8] = arg0.method388();
                    this.field71[var7][1][var8] = arg0.method388();
                }
            }
        }
        if (var5 != 0 || this.field72[1] != this.field72[0]) {
            arg2.method357(0, arg0);
        }
    }

    @OriginalMember(owner = "client!BVZJQTSH", name = "<init>", descriptor = "()V")
    public class5() {
        if (class3.field51) {
        }
    }
}
