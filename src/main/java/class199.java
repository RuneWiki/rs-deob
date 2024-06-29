import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class199 {

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "[I")
    private int[] field2348 = new int[2];

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "[I")
    public int[] field2349 = new int[2];

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "[[[I")
    private int[][][] field2351 = new int[2][2][4];

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "[[[I")
    private int[][][] field2350 = new int[2][2][4];

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "[[F")
    private static float[][] field2346 = new float[2][8];

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "[[I")
    public static int[][] field2353 = new int[2][8];

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "F")
    private static float field2352;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIF)F")
    private final float method1226(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2350[arg0][1][arg1] - this.field2350[arg0][0][arg1]) * arg2 + (float) this.field2350[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1227(var5);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(F)F")
    private static final float method1227(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "()V")
    public static void method1228() {
        field2346 = null;
        field2353 = null;
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(IIF)F")
    private final float method1229(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2351[arg0][1][arg1] - this.field2351[arg0][0][arg1]) * arg2 + (float) this.field2351[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IF)I")
    public final int method1230(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field2348[1] - this.field2348[0]) * arg1 + (float) this.field2348[0];
            float var4 = var3 * 0.0030517578F;
            field2352 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field2347 = (int) (field2352 * 65536.0F);
        }
        if (this.field2349[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1229(arg0, 0, arg1);
        field2346[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1226(arg0, 0, arg1));
        field2346[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field2349[arg0]; var6++) {
            float var9 = this.method1229(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method1226(arg0, var6, arg1));
            float var11 = var9 * var9;
            field2346[arg0][var6 * 2 + 1] = field2346[arg0][var6 * 2 - 1] * var11;
            field2346[arg0][var6 * 2] = field2346[arg0][var6 * 2 - 1] * var10 + field2346[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field2346[arg0][var12] += field2346[arg0][var12 - 1] * var10 + field2346[arg0][var12 - 2] * var11;
            }
            field2346[arg0][1] += field2346[arg0][0] * var10 + var11;
            field2346[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field2349[0] * 2; var7++) {
                field2346[0][var7] *= field2352;
            }
        }
        for (int var8 = 0; var8 < this.field2349[arg0] * 2; var8++) {
            field2353[arg0][var8] = (int) (field2346[arg0][var8] * 65536.0F);
        }
        return this.field2349[arg0] * 2;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lbg;Lqs;)V")
    public final void method1231(class242 arg0, class44 arg1) {
        int var3 = arg0.method1563(-128);
        this.field2349[0] = var3 >> 4;
        this.field2349[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field2348[0] = this.field2348[1] = 0;
            return;
        }
        this.field2348[0] = arg0.method1587((byte) -102);
        this.field2348[1] = arg0.method1587((byte) -102);
        int var4 = arg0.method1563(-128);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field2349[var5]; var8++) {
                this.field2350[var5][0][var8] = arg0.method1587((byte) -102);
                this.field2351[var5][0][var8] = arg0.method1587((byte) -102);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field2349[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field2350[var6][1][var7] = this.field2350[var6][0][var7];
                    this.field2351[var6][1][var7] = this.field2351[var6][0][var7];
                } else {
                    this.field2350[var6][1][var7] = arg0.method1587((byte) -102);
                    this.field2351[var6][1][var7] = arg0.method1587((byte) -102);
                }
            }
        }
        if (var4 != 0 || this.field2348[1] != this.field2348[0]) {
            arg1.method267(arg0);
        }
    }
}
