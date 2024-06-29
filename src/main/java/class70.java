import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ZENSICXR")
public class class70 {

    @OriginalMember(owner = "client!ZENSICXR", name = "a", descriptor = "I")
    private int field1730 = -742;

    @OriginalMember(owner = "client!ZENSICXR", name = "b", descriptor = "B")
    private byte field1731 = 1;

    @OriginalMember(owner = "client!ZENSICXR", name = "c", descriptor = "B")
    private byte field1732 = 93;

    @OriginalMember(owner = "client!ZENSICXR", name = "d", descriptor = "B")
    private byte field1733 = 8;

    @OriginalMember(owner = "client!ZENSICXR", name = "e", descriptor = "Z")
    private boolean field1734 = false;

    @OriginalMember(owner = "client!ZENSICXR", name = "f", descriptor = "Z")
    private boolean field1735 = true;

    @OriginalMember(owner = "client!ZENSICXR", name = "g", descriptor = "[I")
    public int[] field1736 = new int[2];

    @OriginalMember(owner = "client!ZENSICXR", name = "h", descriptor = "[[[I")
    public int[][][] field1737 = new int[2][2][4];

    @OriginalMember(owner = "client!ZENSICXR", name = "i", descriptor = "[[[I")
    public int[][][] field1738 = new int[2][2][4];

    @OriginalMember(owner = "client!ZENSICXR", name = "j", descriptor = "[I")
    public int[] field1739 = new int[2];

    @OriginalMember(owner = "client!ZENSICXR", name = "k", descriptor = "[[F")
    public static float[][] field1740 = new float[2][8];

    @OriginalMember(owner = "client!ZENSICXR", name = "l", descriptor = "[[I")
    public static int[][] field1741 = new int[2][8];

    @OriginalMember(owner = "client!ZENSICXR", name = "m", descriptor = "F")
    public static float field1742;

    @OriginalMember(owner = "client!ZENSICXR", name = "n", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!ZENSICXR", name = "a", descriptor = "(IFBI)F")
    private float method584(int arg0, float arg1, byte arg2, int arg3) {
        float var5 = (float) (this.field1738[arg3][1][arg0] - this.field1738[arg3][0][arg0]) * arg1 + (float) this.field1738[arg3][0][arg0];
        float var6 = var5 * 0.0015258789F;
        if (this.field1731 != arg2) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        return 1.0F - (float) Math.pow(10.0D, (double) (-var6 / 20.0F));
    }

    @OriginalMember(owner = "client!ZENSICXR", name = "a", descriptor = "(FB)F")
    private float method585(float arg0, byte arg1) {
        float var3 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        if (arg1 != 93) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        return var3 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!ZENSICXR", name = "a", descriptor = "(IIFI)F")
    private float method586(int arg0, int arg1, float arg2, int arg3) {
        float var5 = (float) (this.field1737[arg1][1][arg0] - this.field1737[arg1][0][arg0]) * arg2 + (float) this.field1737[arg1][0][arg0];
        float var6 = var5 * 1.2207031E-4F;
        while (arg3 >= 0) {
            this.field1735 = !this.field1735;
        }
        return this.method585(var6, this.field1732);
    }

    @OriginalMember(owner = "client!ZENSICXR", name = "a", descriptor = "(IFB)I")
    public int method587(int arg0, float arg1, byte arg2) {
        if (arg0 == 0) {
            float var4 = (float) (this.field1739[1] - this.field1739[0]) * arg1 + (float) this.field1739[0];
            float var5 = var4 * 0.0030517578F;
            field1742 = (float) Math.pow(0.1D, (double) (var5 / 20.0F));
            field1743 = (int) (field1742 * 65536.0F);
        }
        if (this.field1736[arg0] == 0) {
            return 0;
        }
        float var6 = this.method584(0, arg1, (byte) 1, arg0);
        field1740[arg0][0] = var6 * -2.0F * (float) Math.cos((double) this.method586(0, arg0, arg1, -64));
        if (this.field1733 != arg2) {
            return this.field1730;
        }
        boolean var7 = false;
        field1740[arg0][1] = var6 * var6;
        for (int var8 = 1; var8 < this.field1736[arg0]; var8++) {
            float var11 = this.method584(var8, arg1, (byte) 1, arg0);
            float var12 = var11 * -2.0F * (float) Math.cos((double) this.method586(var8, arg0, arg1, -64));
            float var13 = var11 * var11;
            field1740[arg0][var8 * 2 + 1] = field1740[arg0][var8 * 2 - 1] * var13;
            field1740[arg0][var8 * 2] = field1740[arg0][var8 * 2 - 1] * var12 + field1740[arg0][var8 * 2 - 2] * var13;
            for (int var14 = var8 * 2 - 1; var14 >= 2; var14--) {
                field1740[arg0][var14] += field1740[arg0][var14 - 1] * var12 + field1740[arg0][var14 - 2] * var13;
            }
            field1740[arg0][1] += field1740[arg0][0] * var12 + var13;
            field1740[arg0][0] += var12;
        }
        if (arg0 == 0) {
            for (int var9 = 0; var9 < this.field1736[0] * 2; var9++) {
                field1740[0][var9] *= field1742;
            }
        }
        for (int var10 = 0; var10 < this.field1736[arg0] * 2; var10++) {
            field1741[arg0][var10] = (int) (field1740[arg0][var10] * 65536.0F);
        }
        return this.field1736[arg0] * 2;
    }

    @OriginalMember(owner = "client!ZENSICXR", name = "a", descriptor = "(LHXORSAZH;ILTQYMAXSO;)V")
    public final void method588(class19 arg0, int arg1, class53 arg2) {
        int var4 = arg2.method468();
        this.field1736[0] = var4 >> 4;
        if (arg1 != 0) {
            this.field1734 = !this.field1734;
        }
        this.field1736[1] = var4 & 0xF;
        if (var4 == 0) {
            this.field1739[0] = this.field1739[1] = 0;
            return;
        }
        this.field1739[0] = arg2.method470();
        this.field1739[1] = arg2.method470();
        int var5 = arg2.method468();
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var9 = 0; var9 < this.field1736[var6]; var9++) {
                this.field1737[var6][0][var9] = arg2.method470();
                this.field1738[var6][0][var9] = arg2.method470();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1736[var7]; var8++) {
                if ((var5 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1737[var7][1][var8] = this.field1737[var7][0][var8];
                    this.field1738[var7][1][var8] = this.field1738[var7][0][var8];
                } else {
                    this.field1737[var7][1][var8] = arg2.method470();
                    this.field1738[var7][1][var8] = arg2.method470();
                }
            }
        }
        if (var5 != 0 || this.field1739[1] != this.field1739[0]) {
            arg0.method223(arg2, 36708);
        }
    }

    @OriginalMember(owner = "client!ZENSICXR", name = "<init>", descriptor = "()V")
    public class70() {
        if (class27.field954) {
        }
    }
}
