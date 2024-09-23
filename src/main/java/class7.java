import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("CGCAZMIE")
public class class7 {

    @OriginalMember(owner = "CGCAZMIE", name = "a", descriptor = "Z")
    private boolean field68 = true;

    @OriginalMember(owner = "CGCAZMIE", name = "b", descriptor = "B")
    private byte field69 = -100;

    @OriginalMember(owner = "CGCAZMIE", name = "c", descriptor = "Z")
    private boolean field70 = true;

    @OriginalMember(owner = "CGCAZMIE", name = "d", descriptor = "I")
    private int field71 = -443;

    @OriginalMember(owner = "CGCAZMIE", name = "e", descriptor = "[I")
    public int[] field72 = new int[2];

    @OriginalMember(owner = "CGCAZMIE", name = "f", descriptor = "[[[I")
    public int[][][] field73 = new int[2][2][4];

    @OriginalMember(owner = "CGCAZMIE", name = "g", descriptor = "[[[I")
    public int[][][] field74 = new int[2][2][4];

    @OriginalMember(owner = "CGCAZMIE", name = "h", descriptor = "[I")
    public int[] field75 = new int[2];

    @OriginalMember(owner = "CGCAZMIE", name = "i", descriptor = "[[F")
    public static float[][] field76 = new float[2][8];

    @OriginalMember(owner = "CGCAZMIE", name = "j", descriptor = "[[I")
    public static int[][] field77 = new int[2][8];

    @OriginalMember(owner = "CGCAZMIE", name = "k", descriptor = "F")
    public static float field78;

    @OriginalMember(owner = "CGCAZMIE", name = "l", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "CGCAZMIE", name = "a", descriptor = "(IIFI)F")
    private float method27(int arg0, int arg1, float arg2, int arg3) {
        if (arg3 >= 0) {
            throw new NullPointerException();
        }
        float var5 = (float) (this.field74[arg0][1][arg1] - this.field74[arg0][0][arg1]) * arg2 + (float) this.field74[arg0][0][arg1];
        float var6 = var5 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var6 / 20.0F));
    }

    @OriginalMember(owner = "CGCAZMIE", name = "a", descriptor = "(ZF)F")
    private float method28(boolean arg0, float arg1) {
        float var3 = (float) Math.pow(2.0D, (double) arg1) * 32.703197F;
        if (!arg0) {
            this.field68 = !this.field68;
        }
        return var3 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "CGCAZMIE", name = "a", descriptor = "(IFIB)F")
    private float method29(int arg0, float arg1, int arg2, byte arg3) {
        if (this.field69 != arg3) {
            throw new NullPointerException();
        }
        float var5 = (float) (this.field73[arg2][1][arg0] - this.field73[arg2][0][arg0]) * arg1 + (float) this.field73[arg2][0][arg0];
        float var6 = var5 * 1.2207031E-4F;
        return this.method28(true, var6);
    }

    @OriginalMember(owner = "CGCAZMIE", name = "a", descriptor = "(FII)I")
    public int method30(float arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            float var4 = (float) (this.field75[1] - this.field75[0]) * arg0 + (float) this.field75[0];
            float var5 = var4 * 0.0030517578F;
            field78 = (float) Math.pow(0.1D, (double) (var5 / 20.0F));
            field79 = (int) (field78 * 65536.0F);
        }
        if (this.field72[arg2] == 0) {
            return 0;
        }
        float var6 = this.method27(arg2, 0, arg0, -611);
        if (arg1 != 4827) {
            return this.field71;
        }
        field76[arg2][0] = var6 * -2.0F * (float) Math.cos((double) this.method29(0, arg0, arg2, this.field69));
        field76[arg2][1] = var6 * var6;
        for (int var7 = 1; var7 < this.field72[arg2]; var7++) {
            float var10 = this.method27(arg2, var7, arg0, -611);
            float var11 = var10 * -2.0F * (float) Math.cos((double) this.method29(var7, arg0, arg2, this.field69));
            float var12 = var10 * var10;
            field76[arg2][var7 * 2 + 1] = field76[arg2][var7 * 2 - 1] * var12;
            field76[arg2][var7 * 2] = field76[arg2][var7 * 2 - 1] * var11 + field76[arg2][var7 * 2 - 2] * var12;
            for (int var13 = var7 * 2 - 1; var13 >= 2; var13--) {
                field76[arg2][var13] += field76[arg2][var13 - 1] * var11 + field76[arg2][var13 - 2] * var12;
            }
            field76[arg2][1] += field76[arg2][0] * var11 + var12;
            field76[arg2][0] += var11;
        }
        if (arg2 == 0) {
            for (int var8 = 0; var8 < this.field72[0] * 2; var8++) {
                field76[0][var8] *= field78;
            }
        }
        for (int var9 = 0; var9 < this.field72[arg2] * 2; var9++) {
            field77[arg2][var9] = (int) (field76[arg2][var9] * 65536.0F);
        }
        return this.field72[arg2] * 2;
    }

    @OriginalMember(owner = "CGCAZMIE", name = "a", descriptor = "(ZLXQPFGONL;LQOBPOZUC;)V")
    public final void method31(boolean arg0, class62 arg1, class46 arg2) {
        int var4 = arg1.method478();
        this.field72[0] = var4 >> 4;
        if (!arg0) {
            return;
        }
        this.field72[1] = var4 & 0xF;
        if (var4 == 0) {
            this.field75[0] = this.field75[1] = 0;
            return;
        }
        this.field75[0] = arg1.method480();
        this.field75[1] = arg1.method480();
        int var5 = arg1.method478();
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var9 = 0; var9 < this.field72[var6]; var9++) {
                this.field73[var6][0][var9] = arg1.method480();
                this.field74[var6][0][var9] = arg1.method480();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field72[var7]; var8++) {
                if ((var5 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field73[var7][1][var8] = this.field73[var7][0][var8];
                    this.field74[var7][1][var8] = this.field74[var7][0][var8];
                } else {
                    this.field73[var7][1][var8] = arg1.method480();
                    this.field74[var7][1][var8] = arg1.method480();
                }
            }
        }
        if (var5 != 0 || this.field75[1] != this.field75[0]) {
            arg2.method391(arg1, true);
        }
    }

    @OriginalMember(owner = "CGCAZMIE", name = "<init>", descriptor = "()V")
    public class7() {
        if (class15.field717) {
        }
    }
}
