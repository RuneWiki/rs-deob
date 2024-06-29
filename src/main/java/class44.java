import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class44 {

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "[[[I")
    private int[][][] field495 = new int[2][2][4];

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "[I")
    private int[] field499 = new int[2];

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "[I")
    public int[] field500 = new int[2];

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "[[[I")
    private int[][][] field498 = new int[2][2][4];

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "[[F")
    private static float[][] field497 = new float[2][8];

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "[[I")
    public static int[][] field496 = new int[2][8];

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "F")
    private static float field502;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIF)F")
    private final float method475(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field498[arg0][1][arg1] - this.field498[arg0][0][arg1]) * arg2 + (float) this.field498[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method479(var5);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Liv;Lej;)V")
    public final void method476(class65 arg0, class79 arg1) {
        int var3 = arg0.method577(255);
        this.field500[0] = var3 >> 4;
        this.field500[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field499[0] = this.field499[1] = 0;
            return;
        }
        this.field499[0] = arg0.method623((byte) -61);
        this.field499[1] = arg0.method623((byte) -121);
        int var4 = arg0.method577(255);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field500[var5]; var8++) {
                this.field498[var5][0][var8] = arg0.method623((byte) 120);
                this.field495[var5][0][var8] = arg0.method623((byte) -38);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field500[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field498[var6][1][var7] = this.field498[var6][0][var7];
                    this.field495[var6][1][var7] = this.field495[var6][0][var7];
                } else {
                    this.field498[var6][1][var7] = arg0.method623((byte) 95);
                    this.field495[var6][1][var7] = arg0.method623((byte) 120);
                }
            }
        }
        if (var4 != 0 || this.field499[1] != this.field499[0]) {
            arg1.method723(arg0);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IF)I")
    public final int method477(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field499[1] - this.field499[0]) * arg1 + (float) this.field499[0];
            float var4 = var3 * 0.0030517578F;
            field502 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field501 = (int) (field502 * 65536.0F);
        }
        if (this.field500[arg0] == 0) {
            return 0;
        }
        float var5 = this.method478(arg0, 0, arg1);
        field497[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method475(arg0, 0, arg1));
        field497[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field500[arg0]; var6++) {
            float var9 = this.method478(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method475(arg0, var6, arg1));
            float var11 = var9 * var9;
            field497[arg0][var6 * 2 + 1] = field497[arg0][var6 * 2 - 1] * var11;
            field497[arg0][var6 * 2] = field497[arg0][var6 * 2 - 1] * var10 + field497[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field497[arg0][var12] += field497[arg0][var12 - 1] * var10 + field497[arg0][var12 - 2] * var11;
            }
            field497[arg0][1] += field497[arg0][0] * var10 + var11;
            field497[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field500[0] * 2; var7++) {
                field497[0][var7] *= field502;
            }
        }
        for (int var8 = 0; var8 < this.field500[arg0] * 2; var8++) {
            field496[arg0][var8] = (int) (field497[arg0][var8] * 65536.0F);
        }
        return this.field500[arg0] * 2;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(IIF)F")
    private final float method478(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field495[arg0][1][arg1] - this.field495[arg0][0][arg1]) * arg2 + (float) this.field495[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(F)F")
    private static final float method479(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "()V")
    public static void method480() {
        field497 = null;
        field496 = null;
    }
}
