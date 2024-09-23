import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("OKKLRABS")
public class class41 {

    @OriginalMember(owner = "OKKLRABS", name = "a", descriptor = "B")
    private byte field1302 = 75;

    @OriginalMember(owner = "OKKLRABS", name = "b", descriptor = "Z")
    private boolean field1303 = false;

    @OriginalMember(owner = "OKKLRABS", name = "c", descriptor = "[I")
    public int[] field1304 = new int[2];

    @OriginalMember(owner = "OKKLRABS", name = "d", descriptor = "[[[I")
    public int[][][] field1305 = new int[2][2][4];

    @OriginalMember(owner = "OKKLRABS", name = "e", descriptor = "[[[I")
    public int[][][] field1306 = new int[2][2][4];

    @OriginalMember(owner = "OKKLRABS", name = "f", descriptor = "[I")
    public int[] field1307 = new int[2];

    @OriginalMember(owner = "OKKLRABS", name = "g", descriptor = "[[F")
    public static float[][] field1308 = new float[2][8];

    @OriginalMember(owner = "OKKLRABS", name = "h", descriptor = "[[I")
    public static int[][] field1309 = new int[2][8];

    @OriginalMember(owner = "OKKLRABS", name = "i", descriptor = "F")
    public static float field1310;

    @OriginalMember(owner = "OKKLRABS", name = "j", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "OKKLRABS", name = "a", descriptor = "(IBFI)F")
    private float method451(int arg0, byte arg1, float arg2, int arg3) {
        float var5 = (float) (this.field1306[arg0][1][arg3] - this.field1306[arg0][0][arg3]) * arg2 + (float) this.field1306[arg0][0][arg3];
        if (arg1 != -8) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        float var7 = var5 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var7 / 20.0F));
    }

    @OriginalMember(owner = "OKKLRABS", name = "a", descriptor = "(ZF)F")
    private float method452(boolean arg0, float arg1) {
        float var3 = (float) Math.pow(2.0D, (double) arg1) * 32.703197F;
        if (arg0) {
            throw new NullPointerException();
        }
        return var3 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "OKKLRABS", name = "a", descriptor = "(IFBI)F")
    private float method453(int arg0, float arg1, byte arg2, int arg3) {
        float var5 = (float) (this.field1305[arg0][1][arg3] - this.field1305[arg0][0][arg3]) * arg1 + (float) this.field1305[arg0][0][arg3];
        float var6 = var5 * 1.2207031E-4F;
        if (this.field1302 != arg2) {
            this.field1303 = !this.field1303;
        }
        return this.method452(false, var6);
    }

    @OriginalMember(owner = "OKKLRABS", name = "a", descriptor = "(ZFI)I")
    public int method454(boolean arg0, float arg1, int arg2) {
        if (arg2 == 0) {
            float var4 = (float) (this.field1307[1] - this.field1307[0]) * arg1 + (float) this.field1307[0];
            float var5 = var4 * 0.0030517578F;
            field1310 = (float) Math.pow(0.1D, (double) (var5 / 20.0F));
            field1311 = (int) (field1310 * 65536.0F);
        }
        if (this.field1304[arg2] == 0) {
            return 0;
        }
        float var6 = this.method451(arg2, (byte) -8, arg1, 0);
        if (arg0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        field1308[arg2][0] = var6 * -2.0F * (float) Math.cos((double) this.method453(arg2, arg1, (byte) 75, 0));
        field1308[arg2][1] = var6 * var6;
        for (int var8 = 1; var8 < this.field1304[arg2]; var8++) {
            float var11 = this.method451(arg2, (byte) -8, arg1, var8);
            float var12 = var11 * -2.0F * (float) Math.cos((double) this.method453(arg2, arg1, (byte) 75, var8));
            float var13 = var11 * var11;
            field1308[arg2][var8 * 2 + 1] = field1308[arg2][var8 * 2 - 1] * var13;
            field1308[arg2][var8 * 2] = field1308[arg2][var8 * 2 - 1] * var12 + field1308[arg2][var8 * 2 - 2] * var13;
            for (int var14 = var8 * 2 - 1; var14 >= 2; var14--) {
                field1308[arg2][var14] += field1308[arg2][var14 - 1] * var12 + field1308[arg2][var14 - 2] * var13;
            }
            field1308[arg2][1] += field1308[arg2][0] * var12 + var13;
            field1308[arg2][0] += var12;
        }
        if (arg2 == 0) {
            for (int var9 = 0; var9 < this.field1304[0] * 2; var9++) {
                field1308[0][var9] *= field1310;
            }
        }
        for (int var10 = 0; var10 < this.field1304[arg2] * 2; var10++) {
            field1309[arg2][var10] = (int) (field1308[arg2][var10] * 65536.0F);
        }
        return this.field1304[arg2] * 2;
    }

    @OriginalMember(owner = "OKKLRABS", name = "a", descriptor = "(LBJPWOXRJ;ILXJOITHUI;)V")
    public final void method455(class3 arg0, int arg1, class65 arg2) {
        if (arg1 != 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        int var5 = arg0.method15();
        this.field1304[0] = var5 >> 4;
        this.field1304[1] = var5 & 0xF;
        if (var5 == 0) {
            this.field1307[0] = this.field1307[1] = 0;
            if (class38.field1228) {
            }
            return;
        }
        this.field1307[0] = arg0.method17();
        this.field1307[1] = arg0.method17();
        int var6 = arg0.method15();
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var10 = 0; var10 < this.field1304[var7]; var10++) {
                this.field1305[var7][0][var10] = arg0.method17();
                this.field1306[var7][0][var10] = arg0.method17();
            }
        }
        for (int var8 = 0; var8 < 2; var8++) {
            for (int var9 = 0; var9 < this.field1304[var8]; var9++) {
                if ((var6 & 0x1 << var8 * 4 << var9) == 0) {
                    this.field1305[var8][1][var9] = this.field1305[var8][0][var9];
                    this.field1306[var8][1][var9] = this.field1306[var8][0][var9];
                } else {
                    this.field1305[var8][1][var9] = arg0.method17();
                    this.field1306[var8][1][var9] = arg0.method17();
                }
            }
        }
        if (var6 != 0 || this.field1307[1] != this.field1307[0]) {
            arg2.method539(arg0, (byte) 5);
        }
    }
}
