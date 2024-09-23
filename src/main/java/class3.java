import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("AWPNKCCI")
public class class3 {

    @OriginalMember(owner = "AWPNKCCI", name = "a", descriptor = "I")
    private int field27 = 2;

    @OriginalMember(owner = "AWPNKCCI", name = "b", descriptor = "Z")
    private boolean field28 = false;

    @OriginalMember(owner = "AWPNKCCI", name = "c", descriptor = "[I")
    public int[] field29 = new int[2];

    @OriginalMember(owner = "AWPNKCCI", name = "d", descriptor = "[[[I")
    public int[][][] field30 = new int[2][2][4];

    @OriginalMember(owner = "AWPNKCCI", name = "e", descriptor = "[[[I")
    public int[][][] field31 = new int[2][2][4];

    @OriginalMember(owner = "AWPNKCCI", name = "f", descriptor = "[I")
    public int[] field32 = new int[2];

    @OriginalMember(owner = "AWPNKCCI", name = "g", descriptor = "[[F")
    public static float[][] field33 = new float[2][8];

    @OriginalMember(owner = "AWPNKCCI", name = "h", descriptor = "[[I")
    public static int[][] field34 = new int[2][8];

    @OriginalMember(owner = "AWPNKCCI", name = "i", descriptor = "F")
    public static float field35;

    @OriginalMember(owner = "AWPNKCCI", name = "j", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "AWPNKCCI", name = "a", descriptor = "(IFII)F")
    private float method16(int arg0, float arg1, int arg2, int arg3) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        float var5 = (float) (this.field31[arg2][1][arg3] - this.field31[arg2][0][arg3]) * arg1 + (float) this.field31[arg2][0][arg3];
        float var6 = var5 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var6 / 20.0F));
    }

    @OriginalMember(owner = "AWPNKCCI", name = "a", descriptor = "(FZ)F")
    private float method17(float arg0, boolean arg1) {
        float var3 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        if (!arg1) {
            throw new NullPointerException();
        }
        return var3 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "AWPNKCCI", name = "a", descriptor = "(IZIF)F")
    private float method18(int arg0, boolean arg1, int arg2, float arg3) {
        float var5 = (float) (this.field30[arg2][1][arg0] - this.field30[arg2][0][arg0]) * arg3 + (float) this.field30[arg2][0][arg0];
        if (arg1) {
            this.field28 = !this.field28;
        }
        float var6 = var5 * 1.2207031E-4F;
        return this.method17(var6, true);
    }

    @OriginalMember(owner = "AWPNKCCI", name = "a", descriptor = "(FII)I")
    public int method19(float arg0, int arg1, int arg2) {
        if (arg2 < 5 || arg2 > 5) {
            this.field27 = 387;
        }
        if (arg1 == 0) {
            float var4 = (float) (this.field32[1] - this.field32[0]) * arg0 + (float) this.field32[0];
            float var5 = var4 * 0.0030517578F;
            field35 = (float) Math.pow(0.1D, (double) (var5 / 20.0F));
            field36 = (int) (field35 * 65536.0F);
        }
        if (this.field29[arg1] == 0) {
            return 0;
        }
        float var6 = this.method16(0, arg0, arg1, 0);
        field33[arg1][0] = var6 * -2.0F * (float) Math.cos((double) this.method18(0, false, arg1, arg0));
        field33[arg1][1] = var6 * var6;
        for (int var7 = 1; var7 < this.field29[arg1]; var7++) {
            float var10 = this.method16(0, arg0, arg1, var7);
            float var11 = var10 * -2.0F * (float) Math.cos((double) this.method18(var7, false, arg1, arg0));
            float var12 = var10 * var10;
            field33[arg1][var7 * 2 + 1] = field33[arg1][var7 * 2 - 1] * var12;
            field33[arg1][var7 * 2] = field33[arg1][var7 * 2 - 1] * var11 + field33[arg1][var7 * 2 - 2] * var12;
            for (int var13 = var7 * 2 - 1; var13 >= 2; var13--) {
                field33[arg1][var13] += field33[arg1][var13 - 1] * var11 + field33[arg1][var13 - 2] * var12;
            }
            field33[arg1][1] += field33[arg1][0] * var11 + var12;
            field33[arg1][0] += var11;
        }
        if (arg1 == 0) {
            for (int var8 = 0; var8 < this.field29[0] * 2; var8++) {
                field33[0][var8] *= field35;
            }
        }
        for (int var9 = 0; var9 < this.field29[arg1] * 2; var9++) {
            field34[arg1][var9] = (int) (field33[arg1][var9] * 65536.0F);
        }
        return this.field29[arg1] * 2;
    }

    @OriginalMember(owner = "AWPNKCCI", name = "a", descriptor = "(ILMUKVLYLC;LLRDFYKJP;)V")
    public final void method20(int arg0, class33 arg1, class29 arg2) {
        int var4 = arg1.method292();
        this.field29[0] = var4 >> 4;
        if (arg0 != 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        this.field29[1] = var4 & 0xF;
        if (var4 == 0) {
            this.field32[0] = this.field32[1] = 0;
            if (class37.field1083) {
            }
            return;
        }
        this.field32[0] = arg1.method294();
        this.field32[1] = arg1.method294();
        int var6 = arg1.method292();
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var10 = 0; var10 < this.field29[var7]; var10++) {
                this.field30[var7][0][var10] = arg1.method294();
                this.field31[var7][0][var10] = arg1.method294();
            }
        }
        for (int var8 = 0; var8 < 2; var8++) {
            for (int var9 = 0; var9 < this.field29[var8]; var9++) {
                if ((var6 & 0x1 << var8 * 4 << var9) == 0) {
                    this.field30[var8][1][var9] = this.field30[var8][0][var9];
                    this.field31[var8][1][var9] = this.field31[var8][0][var9];
                } else {
                    this.field30[var8][1][var9] = arg1.method294();
                    this.field31[var8][1][var9] = arg1.method294();
                }
            }
        }
        if (var6 != 0 || this.field32[1] != this.field32[0]) {
            arg2.method262(arg1, true);
        }
    }
}
