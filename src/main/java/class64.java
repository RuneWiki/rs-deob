import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!VLRTJGOX")
public class class64 {

    @OriginalMember(owner = "client!VLRTJGOX", name = "a", descriptor = "Z")
    private boolean field1653 = false;

    @OriginalMember(owner = "client!VLRTJGOX", name = "b", descriptor = "Z")
    private boolean field1654 = true;

    @OriginalMember(owner = "client!VLRTJGOX", name = "c", descriptor = "I")
    private int field1655 = 48306;

    @OriginalMember(owner = "client!VLRTJGOX", name = "d", descriptor = "Z")
    private boolean field1656 = true;

    @OriginalMember(owner = "client!VLRTJGOX", name = "e", descriptor = "[I")
    public int[] field1657 = new int[2];

    @OriginalMember(owner = "client!VLRTJGOX", name = "f", descriptor = "[[[I")
    public int[][][] field1658 = new int[2][2][4];

    @OriginalMember(owner = "client!VLRTJGOX", name = "g", descriptor = "[[[I")
    public int[][][] field1659 = new int[2][2][4];

    @OriginalMember(owner = "client!VLRTJGOX", name = "h", descriptor = "[I")
    public int[] field1660 = new int[2];

    @OriginalMember(owner = "client!VLRTJGOX", name = "i", descriptor = "[[F")
    public static float[][] field1661 = new float[2][8];

    @OriginalMember(owner = "client!VLRTJGOX", name = "j", descriptor = "[[I")
    public static int[][] field1662 = new int[2][8];

    @OriginalMember(owner = "client!VLRTJGOX", name = "k", descriptor = "F")
    public static float field1663;

    @OriginalMember(owner = "client!VLRTJGOX", name = "l", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!VLRTJGOX", name = "a", descriptor = "(IZIF)F")
    private float method556(int arg0, boolean arg1, int arg2, float arg3) {
        if (!arg1) {
            throw new NullPointerException();
        }
        float var5 = (float) (this.field1659[arg0][1][arg2] - this.field1659[arg0][0][arg2]) * arg3 + (float) this.field1659[arg0][0][arg2];
        float var6 = var5 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var6 / 20.0F));
    }

    @OriginalMember(owner = "client!VLRTJGOX", name = "a", descriptor = "(FZ)F")
    private float method557(float arg0, boolean arg1) {
        if (!arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        float var4 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var4 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!VLRTJGOX", name = "a", descriptor = "(IIIF)F")
    private float method558(int arg0, int arg1, int arg2, float arg3) {
        if (arg1 != 0) {
            this.field1656 = !this.field1656;
        }
        float var5 = (float) (this.field1658[arg2][1][arg0] - this.field1658[arg2][0][arg0]) * arg3 + (float) this.field1658[arg2][0][arg0];
        float var6 = var5 * 1.2207031E-4F;
        return this.method557(var6, true);
    }

    @OriginalMember(owner = "client!VLRTJGOX", name = "a", descriptor = "(IFI)I")
    public int method559(int arg0, float arg1, int arg2) {
        if (arg0 == 0) {
            float var4 = (float) (this.field1660[1] - this.field1660[0]) * arg1 + (float) this.field1660[0];
            float var5 = var4 * 0.0030517578F;
            field1663 = (float) Math.pow(0.1D, (double) (var5 / 20.0F));
            field1664 = (int) (field1663 * 65536.0F);
        }
        if (this.field1657[arg0] == 0) {
            return 0;
        }
        float var6 = this.method556(arg0, true, 0, arg1);
        field1661[arg0][0] = var6 * -2.0F * (float) Math.cos((double) this.method558(0, 0, arg0, arg1));
        field1661[arg0][1] = var6 * var6;
        for (int var7 = 1; var7 < this.field1657[arg0]; var7++) {
            float var10 = this.method556(arg0, true, var7, arg1);
            float var11 = var10 * -2.0F * (float) Math.cos((double) this.method558(var7, 0, arg0, arg1));
            float var12 = var10 * var10;
            field1661[arg0][var7 * 2 + 1] = field1661[arg0][var7 * 2 - 1] * var12;
            field1661[arg0][var7 * 2] = field1661[arg0][var7 * 2 - 1] * var11 + field1661[arg0][var7 * 2 - 2] * var12;
            for (int var13 = var7 * 2 - 1; var13 >= 2; var13--) {
                field1661[arg0][var13] += field1661[arg0][var13 - 1] * var11 + field1661[arg0][var13 - 2] * var12;
            }
            field1661[arg0][1] += field1661[arg0][0] * var11 + var12;
            field1661[arg0][0] += var11;
        }
        if (this.field1655 != arg2) {
            return 4;
        }
        if (arg0 == 0) {
            for (int var8 = 0; var8 < this.field1657[0] * 2; var8++) {
                field1661[0][var8] *= field1663;
            }
        }
        for (int var9 = 0; var9 < this.field1657[arg0] * 2; var9++) {
            field1662[arg0][var9] = (int) (field1661[arg0][var9] * 65536.0F);
        }
        return this.field1657[arg0] * 2;
    }

    @OriginalMember(owner = "client!VLRTJGOX", name = "a", descriptor = "(LRGCGKKUR;LSHSBXUIJ;I)V")
    public final void method560(class53 arg0, class54 arg1, int arg2) {
        int var4 = arg0.method455();
        this.field1657[0] = var4 >> 4;
        this.field1657[1] = var4 & 0xF;
        if (arg2 != 0) {
            this.field1653 = !this.field1653;
        }
        if (var4 == 0) {
            this.field1660[0] = this.field1660[1] = 0;
            return;
        }
        this.field1660[0] = arg0.method457();
        this.field1660[1] = arg0.method457();
        int var5 = arg0.method455();
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var9 = 0; var9 < this.field1657[var6]; var9++) {
                this.field1658[var6][0][var9] = arg0.method457();
                this.field1659[var6][0][var9] = arg0.method457();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1657[var7]; var8++) {
                if ((var5 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1658[var7][1][var8] = this.field1658[var7][0][var8];
                    this.field1659[var7][1][var8] = this.field1659[var7][0][var8];
                } else {
                    this.field1658[var7][1][var8] = arg0.method457();
                    this.field1659[var7][1][var8] = arg0.method457();
                }
            }
        }
        if (var5 != 0 || this.field1660[1] != this.field1660[0]) {
            arg1.method494(0, arg0);
        }
    }

    @OriginalMember(owner = "client!VLRTJGOX", name = "<init>", descriptor = "()V")
    public class64() {
        if (class57.field1577) {
        }
    }
}
