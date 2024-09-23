import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("QEWPNZTS")
public class class47 {

    @OriginalMember(owner = "QEWPNZTS", name = "a", descriptor = "Z")
    private boolean field1290 = true;

    @OriginalMember(owner = "QEWPNZTS", name = "b", descriptor = "I")
    private int field1291 = 6;

    @OriginalMember(owner = "QEWPNZTS", name = "c", descriptor = "[I")
    public int[] field1292 = new int[2];

    @OriginalMember(owner = "QEWPNZTS", name = "d", descriptor = "[[[I")
    public int[][][] field1293 = new int[2][2][4];

    @OriginalMember(owner = "QEWPNZTS", name = "e", descriptor = "[[[I")
    public int[][][] field1294 = new int[2][2][4];

    @OriginalMember(owner = "QEWPNZTS", name = "f", descriptor = "[I")
    public int[] field1295 = new int[2];

    @OriginalMember(owner = "QEWPNZTS", name = "g", descriptor = "[[F")
    public static float[][] field1296 = new float[2][8];

    @OriginalMember(owner = "QEWPNZTS", name = "h", descriptor = "[[I")
    public static int[][] field1297 = new int[2][8];

    @OriginalMember(owner = "QEWPNZTS", name = "i", descriptor = "F")
    public static float field1298;

    @OriginalMember(owner = "QEWPNZTS", name = "j", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "QEWPNZTS", name = "a", descriptor = "(IZFI)F")
    private float method495(int arg0, boolean arg1, float arg2, int arg3) {
        if (!arg1) {
            this.field1290 = !this.field1290;
        }
        float var5 = (float) (this.field1294[arg0][1][arg3] - this.field1294[arg0][0][arg3]) * arg2 + (float) this.field1294[arg0][0][arg3];
        float var6 = var5 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var6 / 20.0F));
    }

    @OriginalMember(owner = "QEWPNZTS", name = "a", descriptor = "(IF)F")
    private float method496(int arg0, float arg1) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        float var3 = (float) Math.pow(2.0D, (double) arg1) * 32.703197F;
        return var3 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "QEWPNZTS", name = "a", descriptor = "(ZFII)F")
    private float method497(boolean arg0, float arg1, int arg2, int arg3) {
        float var5 = (float) (this.field1293[arg3][1][arg2] - this.field1293[arg3][0][arg2]) * arg1 + (float) this.field1293[arg3][0][arg2];
        if (!arg0) {
            this.field1291 = 285;
        }
        float var6 = var5 * 1.2207031E-4F;
        return this.method496(0, var6);
    }

    @OriginalMember(owner = "QEWPNZTS", name = "a", descriptor = "(FII)I")
    public int method498(float arg0, int arg1, int arg2) {
        if (arg2 != -47883) {
            return this.field1291;
        }
        if (arg1 == 0) {
            float var4 = (float) (this.field1295[1] - this.field1295[0]) * arg0 + (float) this.field1295[0];
            float var5 = var4 * 0.0030517578F;
            field1298 = (float) Math.pow(0.1D, (double) (var5 / 20.0F));
            field1299 = (int) (field1298 * 65536.0F);
        }
        if (this.field1292[arg1] == 0) {
            return 0;
        }
        float var6 = this.method495(arg1, true, arg0, 0);
        field1296[arg1][0] = var6 * -2.0F * (float) Math.cos((double) this.method497(true, arg0, 0, arg1));
        field1296[arg1][1] = var6 * var6;
        for (int var7 = 1; var7 < this.field1292[arg1]; var7++) {
            float var10 = this.method495(arg1, true, arg0, var7);
            float var11 = var10 * -2.0F * (float) Math.cos((double) this.method497(true, arg0, var7, arg1));
            float var12 = var10 * var10;
            field1296[arg1][var7 * 2 + 1] = field1296[arg1][var7 * 2 - 1] * var12;
            field1296[arg1][var7 * 2] = field1296[arg1][var7 * 2 - 1] * var11 + field1296[arg1][var7 * 2 - 2] * var12;
            for (int var13 = var7 * 2 - 1; var13 >= 2; var13--) {
                field1296[arg1][var13] += field1296[arg1][var13 - 1] * var11 + field1296[arg1][var13 - 2] * var12;
            }
            field1296[arg1][1] += field1296[arg1][0] * var11 + var12;
            field1296[arg1][0] += var11;
        }
        if (arg1 == 0) {
            for (int var8 = 0; var8 < this.field1292[0] * 2; var8++) {
                field1296[0][var8] *= field1298;
            }
        }
        for (int var9 = 0; var9 < this.field1292[arg1] * 2; var9++) {
            field1297[arg1][var9] = (int) (field1296[arg1][var9] * 65536.0F);
        }
        return this.field1292[arg1] * 2;
    }

    @OriginalMember(owner = "QEWPNZTS", name = "a", descriptor = "(LKMZLAUEV;LKHOMSBHW;B)V")
    public final void method499(class32 arg0, class30 arg1, byte arg2) {
        int var4 = arg1.method349();
        this.field1292[0] = var4 >> 4;
        if (arg2 == 7) {
            boolean var5 = false;
        } else {
            this.field1291 = -25;
        }
        this.field1292[1] = var4 & 0xF;
        if (var4 == 0) {
            this.field1295[0] = this.field1295[1] = 0;
            if (class1.field4) {
            }
            return;
        }
        this.field1295[0] = arg1.method351();
        this.field1295[1] = arg1.method351();
        int var6 = arg1.method349();
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var10 = 0; var10 < this.field1292[var7]; var10++) {
                this.field1293[var7][0][var10] = arg1.method351();
                this.field1294[var7][0][var10] = arg1.method351();
            }
        }
        for (int var8 = 0; var8 < 2; var8++) {
            for (int var9 = 0; var9 < this.field1292[var8]; var9++) {
                if ((var6 & 0x1 << var8 * 4 << var9) == 0) {
                    this.field1293[var8][1][var9] = this.field1293[var8][0][var9];
                    this.field1294[var8][1][var9] = this.field1294[var8][0][var9];
                } else {
                    this.field1293[var8][1][var9] = arg1.method351();
                    this.field1294[var8][1][var9] = arg1.method351();
                }
            }
        }
        if (var6 != 0 || this.field1295[1] != this.field1295[0]) {
            arg0.method395(arg1, 866);
        }
    }
}
