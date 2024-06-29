import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!URKVTZGT")
public class class61 {

    @OriginalMember(owner = "client!URKVTZGT", name = "a", descriptor = "I")
    private int field1573 = -205;

    @OriginalMember(owner = "client!URKVTZGT", name = "b", descriptor = "[I")
    public int[] field1574 = new int[2];

    @OriginalMember(owner = "client!URKVTZGT", name = "c", descriptor = "[[[I")
    public int[][][] field1575 = new int[2][2][4];

    @OriginalMember(owner = "client!URKVTZGT", name = "d", descriptor = "[[[I")
    public int[][][] field1576 = new int[2][2][4];

    @OriginalMember(owner = "client!URKVTZGT", name = "e", descriptor = "[I")
    public int[] field1577 = new int[2];

    @OriginalMember(owner = "client!URKVTZGT", name = "f", descriptor = "[[F")
    public static float[][] field1578 = new float[2][8];

    @OriginalMember(owner = "client!URKVTZGT", name = "g", descriptor = "[[I")
    public static int[][] field1579 = new int[2][8];

    @OriginalMember(owner = "client!URKVTZGT", name = "h", descriptor = "F")
    public static float field1580;

    @OriginalMember(owner = "client!URKVTZGT", name = "i", descriptor = "I")
    public static int field1581;

    @OriginalMember(owner = "client!URKVTZGT", name = "a", descriptor = "(IBFI)F")
    private float method517(int arg0, byte arg1, float arg2, int arg3) {
        if (arg1 != 2) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        float var6 = (float) (this.field1576[arg3][1][arg0] - this.field1576[arg3][0][arg0]) * arg2 + (float) this.field1576[arg3][0][arg0];
        float var7 = var6 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var7 / 20.0F));
    }

    @OriginalMember(owner = "client!URKVTZGT", name = "a", descriptor = "(IF)F")
    private float method518(int arg0, float arg1) {
        int var3 = 88 / arg0;
        float var4 = (float) Math.pow(2.0D, (double) arg1) * 32.703197F;
        return var4 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!URKVTZGT", name = "a", descriptor = "(IIIF)F")
    private float method519(int arg0, int arg1, int arg2, float arg3) {
        float var5 = (float) (this.field1575[arg0][1][arg2] - this.field1575[arg0][0][arg2]) * arg3 + (float) this.field1575[arg0][0][arg2];
        float var6 = var5 * 1.2207031E-4F;
        while (arg1 >= 0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        return this.method518(856, var6);
    }

    @OriginalMember(owner = "client!URKVTZGT", name = "a", descriptor = "(IIF)I")
    public int method520(int arg0, int arg1, float arg2) {
        if (arg0 == 0) {
            float var4 = (float) (this.field1577[1] - this.field1577[0]) * arg2 + (float) this.field1577[0];
            float var5 = var4 * 0.0030517578F;
            field1580 = (float) Math.pow(0.1D, (double) (var5 / 20.0F));
            field1581 = (int) (field1580 * 65536.0F);
        }
        if (this.field1574[arg0] == 0) {
            return 0;
        }
        float var6 = this.method517(0, (byte) 2, arg2, arg0);
        if (arg1 >= 0) {
            this.field1573 = -364;
        }
        field1578[arg0][0] = var6 * -2.0F * (float) Math.cos((double) this.method519(arg0, -31, 0, arg2));
        field1578[arg0][1] = var6 * var6;
        for (int var7 = 1; var7 < this.field1574[arg0]; var7++) {
            float var10 = this.method517(var7, (byte) 2, arg2, arg0);
            float var11 = var10 * -2.0F * (float) Math.cos((double) this.method519(arg0, -31, var7, arg2));
            float var12 = var10 * var10;
            field1578[arg0][var7 * 2 + 1] = field1578[arg0][var7 * 2 - 1] * var12;
            field1578[arg0][var7 * 2] = field1578[arg0][var7 * 2 - 1] * var11 + field1578[arg0][var7 * 2 - 2] * var12;
            for (int var13 = var7 * 2 - 1; var13 >= 2; var13--) {
                field1578[arg0][var13] += field1578[arg0][var13 - 1] * var11 + field1578[arg0][var13 - 2] * var12;
            }
            field1578[arg0][1] += field1578[arg0][0] * var11 + var12;
            field1578[arg0][0] += var11;
        }
        if (arg0 == 0) {
            for (int var8 = 0; var8 < this.field1574[0] * 2; var8++) {
                field1578[0][var8] *= field1580;
            }
        }
        for (int var9 = 0; var9 < this.field1574[arg0] * 2; var9++) {
            field1579[arg0][var9] = (int) (field1578[arg0][var9] * 65536.0F);
        }
        return this.field1574[arg0] * 2;
    }

    @OriginalMember(owner = "client!URKVTZGT", name = "a", descriptor = "(LIUVBENCV;LMWRZAKOJ;I)V")
    public final void method521(class25 arg0, class38 arg1, int arg2) {
        int var4 = arg0.method245();
        this.field1574[0] = var4 >> 4;
        this.field1574[1] = var4 & 0xF;
        if (arg2 >= 0) {
            return;
        }
        if (var4 == 0) {
            this.field1577[0] = this.field1577[1] = 0;
            return;
        }
        this.field1577[0] = arg0.method247();
        this.field1577[1] = arg0.method247();
        int var5 = arg0.method245();
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var9 = 0; var9 < this.field1574[var6]; var9++) {
                this.field1575[var6][0][var9] = arg0.method247();
                this.field1576[var6][0][var9] = arg0.method247();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1574[var7]; var8++) {
                if ((var5 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1575[var7][1][var8] = this.field1575[var7][0][var8];
                    this.field1576[var7][1][var8] = this.field1576[var7][0][var8];
                } else {
                    this.field1575[var7][1][var8] = arg0.method247();
                    this.field1576[var7][1][var8] = arg0.method247();
                }
            }
        }
        if (var5 != 0 || this.field1577[1] != this.field1577[0]) {
            arg1.method359(arg0, (byte) 1);
        }
    }
}
