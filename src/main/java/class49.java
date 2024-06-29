import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!RHVCMDPL")
public class class49 {

    @OriginalMember(owner = "client!RHVCMDPL", name = "a", descriptor = "I")
    private int field1343 = 404;

    @OriginalMember(owner = "client!RHVCMDPL", name = "b", descriptor = "[I")
    public int[] field1344 = new int[2];

    @OriginalMember(owner = "client!RHVCMDPL", name = "c", descriptor = "[[[I")
    public int[][][] field1345 = new int[2][2][4];

    @OriginalMember(owner = "client!RHVCMDPL", name = "d", descriptor = "[[[I")
    public int[][][] field1346 = new int[2][2][4];

    @OriginalMember(owner = "client!RHVCMDPL", name = "e", descriptor = "[I")
    public int[] field1347 = new int[2];

    @OriginalMember(owner = "client!RHVCMDPL", name = "f", descriptor = "[[F")
    public static float[][] field1348 = new float[2][8];

    @OriginalMember(owner = "client!RHVCMDPL", name = "g", descriptor = "[[I")
    public static int[][] field1349 = new int[2][8];

    @OriginalMember(owner = "client!RHVCMDPL", name = "h", descriptor = "F")
    public static float field1350;

    @OriginalMember(owner = "client!RHVCMDPL", name = "i", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!RHVCMDPL", name = "a", descriptor = "(IIFI)F")
    private float method441(int arg0, int arg1, float arg2, int arg3) {
        if (arg0 != 6) {
            this.field1343 = 293;
        }
        float var5 = (float) (this.field1346[arg3][1][arg1] - this.field1346[arg3][0][arg1]) * arg2 + (float) this.field1346[arg3][0][arg1];
        float var6 = var5 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var6 / 20.0F));
    }

    @OriginalMember(owner = "client!RHVCMDPL", name = "a", descriptor = "(FI)F")
    private float method442(float arg0, int arg1) {
        float var3 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        if (arg1 != -46008) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        return var3 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!RHVCMDPL", name = "a", descriptor = "(IIIF)F")
    private float method443(int arg0, int arg1, int arg2, float arg3) {
        float var5 = (float) (this.field1345[arg2][1][arg1] - this.field1345[arg2][0][arg1]) * arg3 + (float) this.field1345[arg2][0][arg1];
        if (arg0 != 47248) {
            throw new NullPointerException();
        }
        float var6 = var5 * 1.2207031E-4F;
        return this.method442(var6, -46008);
    }

    @OriginalMember(owner = "client!RHVCMDPL", name = "a", descriptor = "(IIF)I")
    public int method444(int arg0, int arg1, float arg2) {
        if (arg0 == 0) {
            float var4 = (float) (this.field1347[1] - this.field1347[0]) * arg2 + (float) this.field1347[0];
            float var5 = var4 * 0.0030517578F;
            field1350 = (float) Math.pow(0.1D, (double) (var5 / 20.0F));
            field1351 = (int) (field1350 * 65536.0F);
        }
        if (this.field1344[arg0] == 0) {
            return 0;
        }
        float var6 = this.method441(6, 0, arg2, arg0);
        field1348[arg0][0] = var6 * -2.0F * (float) Math.cos((double) this.method443(47248, 0, arg0, arg2));
        if (arg1 != -15631) {
            return 0;
        }
        field1348[arg0][1] = var6 * var6;
        for (int var7 = 1; var7 < this.field1344[arg0]; var7++) {
            float var10 = this.method441(6, var7, arg2, arg0);
            float var11 = var10 * -2.0F * (float) Math.cos((double) this.method443(47248, var7, arg0, arg2));
            float var12 = var10 * var10;
            field1348[arg0][var7 * 2 + 1] = field1348[arg0][var7 * 2 - 1] * var12;
            field1348[arg0][var7 * 2] = field1348[arg0][var7 * 2 - 1] * var11 + field1348[arg0][var7 * 2 - 2] * var12;
            for (int var13 = var7 * 2 - 1; var13 >= 2; var13--) {
                field1348[arg0][var13] += field1348[arg0][var13 - 1] * var11 + field1348[arg0][var13 - 2] * var12;
            }
            field1348[arg0][1] += field1348[arg0][0] * var11 + var12;
            field1348[arg0][0] += var11;
        }
        if (arg0 == 0) {
            for (int var8 = 0; var8 < this.field1344[0] * 2; var8++) {
                field1348[0][var8] *= field1350;
            }
        }
        for (int var9 = 0; var9 < this.field1344[arg0] * 2; var9++) {
            field1349[arg0][var9] = (int) (field1348[arg0][var9] * 65536.0F);
        }
        return this.field1344[arg0] * 2;
    }

    @OriginalMember(owner = "client!RHVCMDPL", name = "a", descriptor = "(LXJHYQMBH;ZLSVWJKJVI;)V")
    public final void method445(class70 arg0, boolean arg1, class52 arg2) {
        int var4 = arg2.method461();
        if (arg1) {
            return;
        }
        this.field1344[0] = var4 >> 4;
        this.field1344[1] = var4 & 0xF;
        if (var4 == 0) {
            this.field1347[0] = this.field1347[1] = 0;
            return;
        }
        this.field1347[0] = arg2.method463();
        this.field1347[1] = arg2.method463();
        int var5 = arg2.method461();
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var9 = 0; var9 < this.field1344[var6]; var9++) {
                this.field1345[var6][0][var9] = arg2.method463();
                this.field1346[var6][0][var9] = arg2.method463();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1344[var7]; var8++) {
                if ((var5 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1345[var7][1][var8] = this.field1345[var7][0][var8];
                    this.field1346[var7][1][var8] = this.field1346[var7][0][var8];
                } else {
                    this.field1345[var7][1][var8] = arg2.method463();
                    this.field1346[var7][1][var8] = arg2.method463();
                }
            }
        }
        if (var5 != 0 || this.field1347[1] != this.field1347[0]) {
            arg0.method591(arg2, false);
        }
    }
}
