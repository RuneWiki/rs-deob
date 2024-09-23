import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("EQHIVIBA")
public class class13 {

    @OriginalMember(owner = "EQHIVIBA", name = "a", descriptor = "I")
    private int field653 = 566;

    @OriginalMember(owner = "EQHIVIBA", name = "b", descriptor = "Z")
    private boolean field654 = false;

    @OriginalMember(owner = "EQHIVIBA", name = "c", descriptor = "[I")
    public int[] field655 = new int[2];

    @OriginalMember(owner = "EQHIVIBA", name = "d", descriptor = "[[[I")
    public int[][][] field656 = new int[2][2][4];

    @OriginalMember(owner = "EQHIVIBA", name = "e", descriptor = "[[[I")
    public int[][][] field657 = new int[2][2][4];

    @OriginalMember(owner = "EQHIVIBA", name = "f", descriptor = "[I")
    public int[] field658 = new int[2];

    @OriginalMember(owner = "EQHIVIBA", name = "g", descriptor = "[[F")
    public static float[][] field659 = new float[2][8];

    @OriginalMember(owner = "EQHIVIBA", name = "h", descriptor = "[[I")
    public static int[][] field660 = new int[2][8];

    @OriginalMember(owner = "EQHIVIBA", name = "i", descriptor = "F")
    public static float field661;

    @OriginalMember(owner = "EQHIVIBA", name = "j", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "EQHIVIBA", name = "a", descriptor = "(IBIF)F")
    private float method187(int arg0, byte arg1, int arg2, float arg3) {
        float var5 = (float) (this.field657[arg0][1][arg2] - this.field657[arg0][0][arg2]) * arg3 + (float) this.field657[arg0][0][arg2];
        if (arg1 != 3) {
            this.field654 = !this.field654;
        }
        float var6 = var5 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var6 / 20.0F));
    }

    @OriginalMember(owner = "EQHIVIBA", name = "a", descriptor = "(FB)F")
    private float method188(float arg0, byte arg1) {
        if (arg1 == 0) {
            boolean var3 = false;
        } else {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        float var5 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var5 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "EQHIVIBA", name = "a", descriptor = "(IFII)F")
    private float method189(int arg0, float arg1, int arg2, int arg3) {
        float var5 = (float) (this.field656[arg2][1][arg0] - this.field656[arg2][0][arg0]) * arg1 + (float) this.field656[arg2][0][arg0];
        float var6 = var5 * 1.2207031E-4F;
        int var7 = 53 / arg3;
        return this.method188(var6, (byte) 0);
    }

    @OriginalMember(owner = "EQHIVIBA", name = "a", descriptor = "(IFI)I")
    public int method190(int arg0, float arg1, int arg2) {
        if (arg2 == 0) {
            float var4 = (float) (this.field658[1] - this.field658[0]) * arg1 + (float) this.field658[0];
            float var5 = var4 * 0.0030517578F;
            field661 = (float) Math.pow(0.1D, (double) (var5 / 20.0F));
            field662 = (int) (field661 * 65536.0F);
        }
        if (this.field655[arg2] == 0) {
            return 0;
        }
        float var6 = this.method187(arg2, (byte) 3, 0, arg1);
        field659[arg2][0] = var6 * -2.0F * (float) Math.cos((double) this.method189(0, arg1, arg2, 279));
        field659[arg2][1] = var6 * var6;
        for (int var7 = 1; var7 < this.field655[arg2]; var7++) {
            float var10 = this.method187(arg2, (byte) 3, var7, arg1);
            float var11 = var10 * -2.0F * (float) Math.cos((double) this.method189(var7, arg1, arg2, 279));
            float var12 = var10 * var10;
            field659[arg2][var7 * 2 + 1] = field659[arg2][var7 * 2 - 1] * var12;
            field659[arg2][var7 * 2] = field659[arg2][var7 * 2 - 1] * var11 + field659[arg2][var7 * 2 - 2] * var12;
            for (int var13 = var7 * 2 - 1; var13 >= 2; var13--) {
                field659[arg2][var13] += field659[arg2][var13 - 1] * var11 + field659[arg2][var13 - 2] * var12;
            }
            field659[arg2][1] += field659[arg2][0] * var11 + var12;
            field659[arg2][0] += var11;
        }
        if (arg0 != -23989) {
            this.field653 = -78;
        }
        if (arg2 == 0) {
            for (int var8 = 0; var8 < this.field655[0] * 2; var8++) {
                field659[0][var8] *= field661;
            }
        }
        for (int var9 = 0; var9 < this.field655[arg2] * 2; var9++) {
            field660[arg2][var9] = (int) (field659[arg2][var9] * 65536.0F);
        }
        return this.field655[arg2] * 2;
    }

    @OriginalMember(owner = "EQHIVIBA", name = "a", descriptor = "(LXJCNBMKS;LVMVYFNTB;I)V")
    public final void method191(class68 arg0, class65 arg1, int arg2) {
        int var4 = arg0.method534();
        this.field655[0] = var4 >> 4;
        int var5 = 91 / arg2;
        this.field655[1] = var4 & 0xF;
        if (var4 == 0) {
            this.field658[0] = this.field658[1] = 0;
            if (class47.field1218) {
            }
            return;
        }
        this.field658[0] = arg0.method536();
        this.field658[1] = arg0.method536();
        int var6 = arg0.method534();
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var10 = 0; var10 < this.field655[var7]; var10++) {
                this.field656[var7][0][var10] = arg0.method536();
                this.field657[var7][0][var10] = arg0.method536();
            }
        }
        for (int var8 = 0; var8 < 2; var8++) {
            for (int var9 = 0; var9 < this.field655[var8]; var9++) {
                if ((var6 & 0x1 << var8 * 4 << var9) == 0) {
                    this.field656[var8][1][var9] = this.field656[var8][0][var9];
                    this.field657[var8][1][var9] = this.field657[var8][0][var9];
                } else {
                    this.field656[var8][1][var9] = arg0.method536();
                    this.field657[var8][1][var9] = arg0.method536();
                }
            }
        }
        if (var6 != 0 || this.field658[1] != this.field658[0]) {
            arg1.method514(arg0, (byte) -115);
        }
    }
}
