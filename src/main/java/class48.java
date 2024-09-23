import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("RMKIQWOG")
public class class48 {

    @OriginalMember(owner = "RMKIQWOG", name = "a", descriptor = "Z")
    private boolean field1297 = false;

    @OriginalMember(owner = "RMKIQWOG", name = "b", descriptor = "B")
    private byte field1298 = 73;

    @OriginalMember(owner = "RMKIQWOG", name = "c", descriptor = "B")
    private byte field1299 = 73;

    @OriginalMember(owner = "RMKIQWOG", name = "d", descriptor = "I")
    private int field1300 = 531;

    @OriginalMember(owner = "RMKIQWOG", name = "e", descriptor = "I")
    private int field1301 = 531;

    @OriginalMember(owner = "RMKIQWOG", name = "f", descriptor = "[I")
    public int[] field1302 = new int[2];

    @OriginalMember(owner = "RMKIQWOG", name = "g", descriptor = "[[[I")
    public int[][][] field1303 = new int[2][2][4];

    @OriginalMember(owner = "RMKIQWOG", name = "h", descriptor = "[[[I")
    public int[][][] field1304 = new int[2][2][4];

    @OriginalMember(owner = "RMKIQWOG", name = "i", descriptor = "[I")
    public int[] field1305 = new int[2];

    @OriginalMember(owner = "RMKIQWOG", name = "j", descriptor = "[[F")
    public static float[][] field1306 = new float[2][8];

    @OriginalMember(owner = "RMKIQWOG", name = "k", descriptor = "[[I")
    public static int[][] field1307 = new int[2][8];

    @OriginalMember(owner = "RMKIQWOG", name = "l", descriptor = "F")
    public static float field1308;

    @OriginalMember(owner = "RMKIQWOG", name = "m", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "RMKIQWOG", name = "a", descriptor = "(FIIB)F")
    private float method416(float arg0, int arg1, int arg2, byte arg3) {
        float var5 = (float) (this.field1304[arg1][1][arg2] - this.field1304[arg1][0][arg2]) * arg0 + (float) this.field1304[arg1][0][arg2];
        if (this.field1299 != arg3) {
            this.field1297 = !this.field1297;
        }
        float var6 = var5 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var6 / 20.0F));
    }

    @OriginalMember(owner = "RMKIQWOG", name = "a", descriptor = "(FB)F")
    private float method417(float arg0, byte arg1) {
        float var3 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        if (arg1 != -15) {
            throw new NullPointerException();
        }
        return var3 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "RMKIQWOG", name = "a", descriptor = "(IIFI)F")
    private float method418(int arg0, int arg1, float arg2, int arg3) {
        float var5 = (float) (this.field1303[arg1][1][arg0] - this.field1303[arg1][0][arg0]) * arg2 + (float) this.field1303[arg1][0][arg0];
        int var6 = 48 / arg3;
        float var7 = var5 * 1.2207031E-4F;
        return this.method417(var7, (byte) -15);
    }

    @OriginalMember(owner = "RMKIQWOG", name = "a", descriptor = "(BIF)I")
    public int method419(byte arg0, int arg1, float arg2) {
        if (arg1 == 0) {
            float var4 = (float) (this.field1305[1] - this.field1305[0]) * arg2 + (float) this.field1305[0];
            float var5 = var4 * 0.0030517578F;
            field1308 = (float) Math.pow(0.1D, (double) (var5 / 20.0F));
            field1309 = (int) (field1308 * 65536.0F);
        }
        if (this.field1302[arg1] == 0) {
            return 0;
        }
        float var6 = this.method416(arg2, arg1, 0, this.field1298);
        if (arg0 != -98) {
            return this.field1301;
        }
        field1306[arg1][0] = var6 * -2.0F * (float) Math.cos((double) this.method418(0, arg1, arg2, this.field1300));
        field1306[arg1][1] = var6 * var6;
        for (int var7 = 1; var7 < this.field1302[arg1]; var7++) {
            float var10 = this.method416(arg2, arg1, var7, this.field1298);
            float var11 = var10 * -2.0F * (float) Math.cos((double) this.method418(var7, arg1, arg2, this.field1300));
            float var12 = var10 * var10;
            field1306[arg1][var7 * 2 + 1] = field1306[arg1][var7 * 2 - 1] * var12;
            field1306[arg1][var7 * 2] = field1306[arg1][var7 * 2 - 1] * var11 + field1306[arg1][var7 * 2 - 2] * var12;
            for (int var13 = var7 * 2 - 1; var13 >= 2; var13--) {
                field1306[arg1][var13] += field1306[arg1][var13 - 1] * var11 + field1306[arg1][var13 - 2] * var12;
            }
            field1306[arg1][1] += field1306[arg1][0] * var11 + var12;
            field1306[arg1][0] += var11;
        }
        if (arg1 == 0) {
            for (int var8 = 0; var8 < this.field1302[0] * 2; var8++) {
                field1306[0][var8] *= field1308;
            }
        }
        for (int var9 = 0; var9 < this.field1302[arg1] * 2; var9++) {
            field1307[arg1][var9] = (int) (field1306[arg1][var9] * 65536.0F);
        }
        return this.field1302[arg1] * 2;
    }

    @OriginalMember(owner = "RMKIQWOG", name = "a", descriptor = "(LUAWAYCTK;ILMMADHCLT;)V")
    public final void method420(class55 arg0, int arg1, class32 arg2) {
        if (arg1 <= 0) {
            return;
        }
        int var4 = arg0.method455();
        this.field1302[0] = var4 >> 4;
        this.field1302[1] = var4 & 0xF;
        if (var4 == 0) {
            this.field1305[0] = this.field1305[1] = 0;
            return;
        }
        this.field1305[0] = arg0.method457();
        this.field1305[1] = arg0.method457();
        int var5 = arg0.method455();
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var9 = 0; var9 < this.field1302[var6]; var9++) {
                this.field1303[var6][0][var9] = arg0.method457();
                this.field1304[var6][0][var9] = arg0.method457();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1302[var7]; var8++) {
                if ((var5 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1303[var7][1][var8] = this.field1303[var7][0][var8];
                    this.field1304[var7][1][var8] = this.field1304[var7][0][var8];
                } else {
                    this.field1303[var7][1][var8] = arg0.method457();
                    this.field1304[var7][1][var8] = arg0.method457();
                }
            }
        }
        if (var5 != 0 || this.field1305[1] != this.field1305[0]) {
            arg2.method325(arg0, -799);
        }
    }

    @OriginalMember(owner = "RMKIQWOG", name = "<init>", descriptor = "()V")
    public class48() {
        if (class40.field1193) {
        }
    }
}
