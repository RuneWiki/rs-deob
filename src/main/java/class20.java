import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!GKDFAZFL")
public class class20 {

    @OriginalMember(owner = "client!GKDFAZFL", name = "b", descriptor = "Z")
    private boolean field836 = true;

    @OriginalMember(owner = "client!GKDFAZFL", name = "c", descriptor = "[I")
    public int[] field837 = new int[2];

    @OriginalMember(owner = "client!GKDFAZFL", name = "d", descriptor = "[[[I")
    public int[][][] field838 = new int[2][2][4];

    @OriginalMember(owner = "client!GKDFAZFL", name = "e", descriptor = "[[[I")
    public int[][][] field839 = new int[2][2][4];

    @OriginalMember(owner = "client!GKDFAZFL", name = "f", descriptor = "[I")
    public int[] field840 = new int[2];

    @OriginalMember(owner = "client!GKDFAZFL", name = "g", descriptor = "[[F")
    public static float[][] field841 = new float[2][8];

    @OriginalMember(owner = "client!GKDFAZFL", name = "h", descriptor = "[[I")
    public static int[][] field842 = new int[2][8];

    @OriginalMember(owner = "client!GKDFAZFL", name = "i", descriptor = "F")
    public static float field843;

    @OriginalMember(owner = "client!GKDFAZFL", name = "a", descriptor = "I")
    private int field835;

    @OriginalMember(owner = "client!GKDFAZFL", name = "j", descriptor = "I")
    public static int field844;

    @OriginalMember(owner = "client!GKDFAZFL", name = "a", descriptor = "(IZFI)F")
    private float method290(int arg0, boolean arg1, float arg2, int arg3) {
        if (!arg1) {
            this.field836 = !this.field836;
        }
        float var5 = (float) (this.field839[arg3][1][arg0] - this.field839[arg3][0][arg0]) * arg2 + (float) this.field839[arg3][0][arg0];
        float var6 = var5 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var6 / 20.0F));
    }

    @OriginalMember(owner = "client!GKDFAZFL", name = "a", descriptor = "(FZ)F")
    private float method291(float arg0, boolean arg1) {
        float var3 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        if (arg1) {
            throw new NullPointerException();
        }
        return var3 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!GKDFAZFL", name = "a", descriptor = "(IIFI)F")
    private float method292(int arg0, int arg1, float arg2, int arg3) {
        float var5 = (float) (this.field838[arg0][1][arg3] - this.field838[arg0][0][arg3]) * arg2 + (float) this.field838[arg0][0][arg3];
        if (arg1 != 37596) {
            throw new NullPointerException();
        }
        float var6 = var5 * 1.2207031E-4F;
        return this.method291(var6, false);
    }

    @OriginalMember(owner = "client!GKDFAZFL", name = "a", descriptor = "(FII)I")
    public int method293(float arg0, int arg1, int arg2) {
        int var4 = 99 / arg2;
        if (arg1 == 0) {
            float var5 = (float) (this.field840[1] - this.field840[0]) * arg0 + (float) this.field840[0];
            float var6 = var5 * 0.0030517578F;
            field843 = (float) Math.pow(0.1D, (double) (var6 / 20.0F));
            field844 = (int) (field843 * 65536.0F);
        }
        if (this.field837[arg1] == 0) {
            return 0;
        }
        float var7 = this.method290(0, true, arg0, arg1);
        field841[arg1][0] = var7 * -2.0F * (float) Math.cos((double) this.method292(arg1, 37596, arg0, 0));
        field841[arg1][1] = var7 * var7;
        for (int var8 = 1; var8 < this.field837[arg1]; var8++) {
            float var11 = this.method290(var8, true, arg0, arg1);
            float var12 = var11 * -2.0F * (float) Math.cos((double) this.method292(arg1, 37596, arg0, var8));
            float var13 = var11 * var11;
            field841[arg1][var8 * 2 + 1] = field841[arg1][var8 * 2 - 1] * var13;
            field841[arg1][var8 * 2] = field841[arg1][var8 * 2 - 1] * var12 + field841[arg1][var8 * 2 - 2] * var13;
            for (int var14 = var8 * 2 - 1; var14 >= 2; var14--) {
                field841[arg1][var14] += field841[arg1][var14 - 1] * var12 + field841[arg1][var14 - 2] * var13;
            }
            field841[arg1][1] += field841[arg1][0] * var12 + var13;
            field841[arg1][0] += var12;
        }
        if (arg1 == 0) {
            for (int var9 = 0; var9 < this.field837[0] * 2; var9++) {
                field841[0][var9] *= field843;
            }
        }
        for (int var10 = 0; var10 < this.field837[arg1] * 2; var10++) {
            field842[arg1][var10] = (int) (field841[arg1][var10] * 65536.0F);
        }
        return this.field837[arg1] * 2;
    }

    @OriginalMember(owner = "client!GKDFAZFL", name = "a", descriptor = "(LCMGGUSPR;ILJOBKQXED;)V")
    public final void method294(class10 arg0, int arg1, class32 arg2) {
        int var4 = arg0.method194();
        this.field837[0] = var4 >> 4;
        this.field837[1] = var4 & 0xF;
        if (arg1 <= 0) {
            this.field835 = -5;
        }
        if (var4 == 0) {
            this.field840[0] = this.field840[1] = 0;
            if (class1.field4) {
            }
            return;
        }
        this.field840[0] = arg0.method196();
        this.field840[1] = arg0.method196();
        int var5 = arg0.method194();
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var9 = 0; var9 < this.field837[var6]; var9++) {
                this.field838[var6][0][var9] = arg0.method196();
                this.field839[var6][0][var9] = arg0.method196();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field837[var7]; var8++) {
                if ((var5 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field838[var7][1][var8] = this.field838[var7][0][var8];
                    this.field839[var7][1][var8] = this.field839[var7][0][var8];
                } else {
                    this.field838[var7][1][var8] = arg0.method196();
                    this.field839[var7][1][var8] = arg0.method196();
                }
            }
        }
        if (var5 != 0 || this.field840[1] != this.field840[0]) {
            arg2.method338(true, arg0);
        }
    }
}
