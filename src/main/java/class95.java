import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class95 {

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "[I")
    public int[] field1699 = new int[2];

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "[[[I")
    private int[][][] field1701 = new int[2][2][4];

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "[I")
    private int[] field1702 = new int[2];

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "[[[I")
    private int[][][] field1703 = new int[2][2][4];

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "[[I")
    public static int[][] field1697 = new int[2][8];

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "[[F")
    private static float[][] field1704 = new float[2][8];

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "F")
    private static float field1700;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lha;Lpq;)V")
    public final void method708(class40 arg0, class122 arg1) {
        int var3 = arg0.method257((byte) 27);
        this.field1699[0] = var3 >> 4;
        this.field1699[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field1702[0] = this.field1702[1] = 0;
            return;
        }
        this.field1702[0] = arg0.method254((byte) -106);
        this.field1702[1] = arg0.method254((byte) -68);
        int var4 = arg0.method257((byte) 64);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field1699[var5]; var8++) {
                this.field1703[var5][0][var8] = arg0.method254((byte) -95);
                this.field1701[var5][0][var8] = arg0.method254((byte) -112);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field1699[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field1703[var6][1][var7] = this.field1703[var6][0][var7];
                    this.field1701[var6][1][var7] = this.field1701[var6][0][var7];
                } else {
                    this.field1703[var6][1][var7] = arg0.method254((byte) -74);
                    this.field1701[var6][1][var7] = arg0.method254((byte) -85);
                }
            }
        }
        if (var4 != 0 || this.field1702[1] != this.field1702[0]) {
            arg1.method847(arg0);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IF)I")
    public final int method709(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1702[1] - this.field1702[0]) * arg1 + (float) this.field1702[0];
            float var4 = var3 * 0.0030517578F;
            field1700 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field1698 = (int) (field1700 * 65536.0F);
        }
        if (this.field1699[arg0] == 0) {
            return 0;
        }
        float var5 = this.method712(arg0, 0, arg1);
        field1704[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method711(arg0, 0, arg1));
        field1704[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1699[arg0]; var6++) {
            float var9 = this.method712(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method711(arg0, var6, arg1));
            float var11 = var9 * var9;
            field1704[arg0][var6 * 2 + 1] = field1704[arg0][var6 * 2 - 1] * var11;
            field1704[arg0][var6 * 2] = field1704[arg0][var6 * 2 - 1] * var10 + field1704[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field1704[arg0][var12] += field1704[arg0][var12 - 1] * var10 + field1704[arg0][var12 - 2] * var11;
            }
            field1704[arg0][1] += field1704[arg0][0] * var10 + var11;
            field1704[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field1699[0] * 2; var7++) {
                field1704[0][var7] *= field1700;
            }
        }
        for (int var8 = 0; var8 < this.field1699[arg0] * 2; var8++) {
            field1697[arg0][var8] = (int) (field1704[arg0][var8] * 65536.0F);
        }
        return this.field1699[arg0] * 2;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(F)F")
    private static final float method710(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIF)F")
    private final float method711(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1703[arg0][1][arg1] - this.field1703[arg0][0][arg1]) * arg2 + (float) this.field1703[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method710(var5);
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(IIF)F")
    private final float method712(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1701[arg0][1][arg1] - this.field1701[arg0][0][arg1]) * arg2 + (float) this.field1701[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "()V")
    public static void method713() {
        field1704 = null;
        field1697 = null;
    }
}
