import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ZOMUFNUM")
public class class71 {

    @OriginalMember(owner = "client!ZOMUFNUM", name = "a", descriptor = "I")
    private int field1719 = 34585;

    @OriginalMember(owner = "client!ZOMUFNUM", name = "b", descriptor = "Z")
    private boolean field1720 = false;

    @OriginalMember(owner = "client!ZOMUFNUM", name = "c", descriptor = "B")
    private byte field1721 = 4;

    @OriginalMember(owner = "client!ZOMUFNUM", name = "d", descriptor = "[I")
    public int[] field1722 = new int[2];

    @OriginalMember(owner = "client!ZOMUFNUM", name = "e", descriptor = "[[[I")
    public int[][][] field1723 = new int[2][2][4];

    @OriginalMember(owner = "client!ZOMUFNUM", name = "f", descriptor = "[[[I")
    public int[][][] field1724 = new int[2][2][4];

    @OriginalMember(owner = "client!ZOMUFNUM", name = "g", descriptor = "[I")
    public int[] field1725 = new int[2];

    @OriginalMember(owner = "client!ZOMUFNUM", name = "h", descriptor = "[[F")
    public static float[][] field1726 = new float[2][8];

    @OriginalMember(owner = "client!ZOMUFNUM", name = "i", descriptor = "[[I")
    public static int[][] field1727 = new int[2][8];

    @OriginalMember(owner = "client!ZOMUFNUM", name = "j", descriptor = "F")
    public static float field1728;

    @OriginalMember(owner = "client!ZOMUFNUM", name = "k", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!ZOMUFNUM", name = "a", descriptor = "(IBFI)F")
    private float method583(int arg0, byte arg1, float arg2, int arg3) {
        float var5 = (float) (this.field1724[arg3][1][arg0] - this.field1724[arg3][0][arg0]) * arg2 + (float) this.field1724[arg3][0][arg0];
        float var6 = var5 * 0.0015258789F;
        if (arg1 != 7) {
            this.field1719 = -419;
        }
        return 1.0F - (float) Math.pow(10.0D, (double) (-var6 / 20.0F));
    }

    @OriginalMember(owner = "client!ZOMUFNUM", name = "a", descriptor = "(IF)F")
    private float method584(int arg0, float arg1) {
        int var3 = 10 / arg0;
        float var4 = (float) Math.pow(2.0D, (double) arg1) * 32.703197F;
        return var4 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!ZOMUFNUM", name = "a", descriptor = "(BIIF)F")
    private float method585(byte arg0, int arg1, int arg2, float arg3) {
        float var5 = (float) (this.field1723[arg1][1][arg2] - this.field1723[arg1][0][arg2]) * arg3 + (float) this.field1723[arg1][0][arg2];
        float var6 = var5 * 1.2207031E-4F;
        if (this.field1721 == arg0) {
            boolean var7 = false;
        } else {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        return this.method584(796, var6);
    }

    @OriginalMember(owner = "client!ZOMUFNUM", name = "a", descriptor = "(IIF)I")
    public int method586(int arg0, int arg1, float arg2) {
        if (arg1 == 0) {
            float var4 = (float) (this.field1725[1] - this.field1725[0]) * arg2 + (float) this.field1725[0];
            float var5 = var4 * 0.0030517578F;
            field1728 = (float) Math.pow(0.1D, (double) (var5 / 20.0F));
            field1729 = (int) (field1728 * 65536.0F);
        }
        if (this.field1722[arg1] == 0) {
            return 0;
        }
        float var6 = this.method583(0, (byte) 7, arg2, arg1);
        field1726[arg1][0] = var6 * -2.0F * (float) Math.cos((double) this.method585((byte) 4, arg1, 0, arg2));
        if (arg0 != 0) {
            return this.field1719;
        }
        field1726[arg1][1] = var6 * var6;
        for (int var7 = 1; var7 < this.field1722[arg1]; var7++) {
            float var10 = this.method583(var7, (byte) 7, arg2, arg1);
            float var11 = var10 * -2.0F * (float) Math.cos((double) this.method585((byte) 4, arg1, var7, arg2));
            float var12 = var10 * var10;
            field1726[arg1][var7 * 2 + 1] = field1726[arg1][var7 * 2 - 1] * var12;
            field1726[arg1][var7 * 2] = field1726[arg1][var7 * 2 - 1] * var11 + field1726[arg1][var7 * 2 - 2] * var12;
            for (int var13 = var7 * 2 - 1; var13 >= 2; var13--) {
                field1726[arg1][var13] += field1726[arg1][var13 - 1] * var11 + field1726[arg1][var13 - 2] * var12;
            }
            field1726[arg1][1] += field1726[arg1][0] * var11 + var12;
            field1726[arg1][0] += var11;
        }
        if (arg1 == 0) {
            for (int var8 = 0; var8 < this.field1722[0] * 2; var8++) {
                field1726[0][var8] *= field1728;
            }
        }
        for (int var9 = 0; var9 < this.field1722[arg1] * 2; var9++) {
            field1727[arg1][var9] = (int) (field1726[arg1][var9] * 65536.0F);
        }
        return this.field1722[arg1] * 2;
    }

    @OriginalMember(owner = "client!ZOMUFNUM", name = "a", descriptor = "(LNQUAUMDT;ILFGSQUADF;)V")
    public final void method587(class36 arg0, int arg1, class12 arg2) {
        int var4 = arg0.method339();
        if (arg1 != 29883) {
            this.field1720 = !this.field1720;
        }
        this.field1722[0] = var4 >> 4;
        this.field1722[1] = var4 & 0xF;
        if (var4 == 0) {
            this.field1725[0] = this.field1725[1] = 0;
            return;
        }
        this.field1725[0] = arg0.method341();
        this.field1725[1] = arg0.method341();
        int var5 = arg0.method339();
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var9 = 0; var9 < this.field1722[var6]; var9++) {
                this.field1723[var6][0][var9] = arg0.method341();
                this.field1724[var6][0][var9] = arg0.method341();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1722[var7]; var8++) {
                if ((var5 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1723[var7][1][var8] = this.field1723[var7][0][var8];
                    this.field1724[var7][1][var8] = this.field1724[var7][0][var8];
                } else {
                    this.field1723[var7][1][var8] = arg0.method341();
                    this.field1724[var7][1][var8] = arg0.method341();
                }
            }
        }
        if (var5 != 0 || this.field1725[1] != this.field1725[0]) {
            arg2.method177(674, arg0);
        }
    }

    @OriginalMember(owner = "client!ZOMUFNUM", name = "<init>", descriptor = "()V")
    public class71() {
        if (class35.field1047) {
        }
    }
}
