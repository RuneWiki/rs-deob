import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!XALWVYUP")
public class class62 {

    @OriginalMember(owner = "client!XALWVYUP", name = "a", descriptor = "I")
    private int field1514 = -6102;

    @OriginalMember(owner = "client!XALWVYUP", name = "b", descriptor = "Z")
    private boolean field1515 = false;

    @OriginalMember(owner = "client!XALWVYUP", name = "c", descriptor = "[I")
    public int[] field1516 = new int[2];

    @OriginalMember(owner = "client!XALWVYUP", name = "d", descriptor = "[[[I")
    public int[][][] field1517 = new int[2][2][4];

    @OriginalMember(owner = "client!XALWVYUP", name = "e", descriptor = "[[[I")
    public int[][][] field1518 = new int[2][2][4];

    @OriginalMember(owner = "client!XALWVYUP", name = "f", descriptor = "[I")
    public int[] field1519 = new int[2];

    @OriginalMember(owner = "client!XALWVYUP", name = "g", descriptor = "[[F")
    public static float[][] field1520 = new float[2][8];

    @OriginalMember(owner = "client!XALWVYUP", name = "h", descriptor = "[[I")
    public static int[][] field1521 = new int[2][8];

    @OriginalMember(owner = "client!XALWVYUP", name = "i", descriptor = "F")
    public static float field1522;

    @OriginalMember(owner = "client!XALWVYUP", name = "j", descriptor = "I")
    public static int field1523;

    @OriginalMember(owner = "client!XALWVYUP", name = "a", descriptor = "(BFII)F")
    private float method481(byte arg0, float arg1, int arg2, int arg3) {
        float var5 = (float) (this.field1518[arg3][1][arg2] - this.field1518[arg3][0][arg2]) * arg1 + (float) this.field1518[arg3][0][arg2];
        if (arg0 != 1) {
            throw new NullPointerException();
        }
        boolean var6 = false;
        float var7 = var5 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var7 / 20.0F));
    }

    @OriginalMember(owner = "client!XALWVYUP", name = "a", descriptor = "(ZF)F")
    private float method482(boolean arg0, float arg1) {
        float var3 = (float) Math.pow(2.0D, (double) arg1) * 32.703197F;
        if (!arg0) {
            this.field1514 = -448;
        }
        return var3 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!XALWVYUP", name = "a", descriptor = "(IFII)F")
    private float method483(int arg0, float arg1, int arg2, int arg3) {
        float var5 = (float) (this.field1517[arg2][1][arg3] - this.field1517[arg2][0][arg3]) * arg1 + (float) this.field1517[arg2][0][arg3];
        float var6 = var5 * 1.2207031E-4F;
        if (arg0 <= 0) {
            this.field1515 = !this.field1515;
        }
        return this.method482(true, var6);
    }

    @OriginalMember(owner = "client!XALWVYUP", name = "a", descriptor = "(IZF)I")
    public int method484(int arg0, boolean arg1, float arg2) {
        if (arg1) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (arg0 == 0) {
            float var5 = (float) (this.field1519[1] - this.field1519[0]) * arg2 + (float) this.field1519[0];
            float var6 = var5 * 0.0030517578F;
            field1522 = (float) Math.pow(0.1D, (double) (var6 / 20.0F));
            field1523 = (int) (field1522 * 65536.0F);
        }
        if (this.field1516[arg0] == 0) {
            return 0;
        }
        float var7 = this.method481((byte) 1, arg2, 0, arg0);
        field1520[arg0][0] = var7 * -2.0F * (float) Math.cos((double) this.method483(887, arg2, arg0, 0));
        field1520[arg0][1] = var7 * var7;
        for (int var8 = 1; var8 < this.field1516[arg0]; var8++) {
            float var11 = this.method481((byte) 1, arg2, var8, arg0);
            float var12 = var11 * -2.0F * (float) Math.cos((double) this.method483(887, arg2, arg0, var8));
            float var13 = var11 * var11;
            field1520[arg0][var8 * 2 + 1] = field1520[arg0][var8 * 2 - 1] * var13;
            field1520[arg0][var8 * 2] = field1520[arg0][var8 * 2 - 1] * var12 + field1520[arg0][var8 * 2 - 2] * var13;
            for (int var14 = var8 * 2 - 1; var14 >= 2; var14--) {
                field1520[arg0][var14] += field1520[arg0][var14 - 1] * var12 + field1520[arg0][var14 - 2] * var13;
            }
            field1520[arg0][1] += field1520[arg0][0] * var12 + var13;
            field1520[arg0][0] += var12;
        }
        if (arg0 == 0) {
            for (int var9 = 0; var9 < this.field1516[0] * 2; var9++) {
                field1520[0][var9] *= field1522;
            }
        }
        for (int var10 = 0; var10 < this.field1516[arg0] * 2; var10++) {
            field1521[arg0][var10] = (int) (field1520[arg0][var10] * 65536.0F);
        }
        return this.field1516[arg0] * 2;
    }

    @OriginalMember(owner = "client!XALWVYUP", name = "a", descriptor = "(LJZEFIVMF;LFTMSICIZ;I)V")
    public final void method485(class25 arg0, class13 arg1, int arg2) {
        int var4 = arg1.method213();
        this.field1516[0] = var4 >> 4;
        this.field1516[1] = var4 & 0xF;
        if (arg2 != -5817) {
            return;
        }
        if (var4 == 0) {
            this.field1519[0] = this.field1519[1] = 0;
            return;
        }
        this.field1519[0] = arg1.method215();
        this.field1519[1] = arg1.method215();
        int var5 = arg1.method213();
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var9 = 0; var9 < this.field1516[var6]; var9++) {
                this.field1517[var6][0][var9] = arg1.method215();
                this.field1518[var6][0][var9] = arg1.method215();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1516[var7]; var8++) {
                if ((var5 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1517[var7][1][var8] = this.field1517[var7][0][var8];
                    this.field1518[var7][1][var8] = this.field1518[var7][0][var8];
                } else {
                    this.field1517[var7][1][var8] = arg1.method215();
                    this.field1518[var7][1][var8] = arg1.method215();
                }
            }
        }
        if (var5 != 0 || this.field1519[1] != this.field1519[0]) {
            arg0.method310(false, arg1);
        }
    }

    @OriginalMember(owner = "client!XALWVYUP", name = "<init>", descriptor = "()V")
    public class62() {
        if (class41.field1195) {
        }
    }
}
