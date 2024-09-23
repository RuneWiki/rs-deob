import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("GHIPAIQX")
public class class20 {

    @OriginalMember(owner = "GHIPAIQX", name = "a", descriptor = "Z")
    private boolean field788 = false;

    @OriginalMember(owner = "GHIPAIQX", name = "b", descriptor = "B")
    private byte field789 = 4;

    @OriginalMember(owner = "GHIPAIQX", name = "c", descriptor = "[I")
    public int[] field790 = new int[2];

    @OriginalMember(owner = "GHIPAIQX", name = "d", descriptor = "[[[I")
    public int[][][] field791 = new int[2][2][4];

    @OriginalMember(owner = "GHIPAIQX", name = "e", descriptor = "[[[I")
    public int[][][] field792 = new int[2][2][4];

    @OriginalMember(owner = "GHIPAIQX", name = "f", descriptor = "[I")
    public int[] field793 = new int[2];

    @OriginalMember(owner = "GHIPAIQX", name = "g", descriptor = "[[F")
    public static float[][] field794 = new float[2][8];

    @OriginalMember(owner = "GHIPAIQX", name = "h", descriptor = "[[I")
    public static int[][] field795 = new int[2][8];

    @OriginalMember(owner = "GHIPAIQX", name = "i", descriptor = "F")
    public static float field796;

    @OriginalMember(owner = "GHIPAIQX", name = "j", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "GHIPAIQX", name = "a", descriptor = "(FBII)F")
    private float method227(float arg0, byte arg1, int arg2, int arg3) {
        float var5 = (float) (this.field792[arg2][1][arg3] - this.field792[arg2][0][arg3]) * arg0 + (float) this.field792[arg2][0][arg3];
        float var6 = var5 * 0.0015258789F;
        if (this.field789 != arg1) {
            throw new NullPointerException();
        }
        return 1.0F - (float) Math.pow(10.0D, (double) (-var6 / 20.0F));
    }

    @OriginalMember(owner = "GHIPAIQX", name = "a", descriptor = "(IF)F")
    private float method228(int arg0, float arg1) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        float var3 = (float) Math.pow(2.0D, (double) arg1) * 32.703197F;
        return var3 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "GHIPAIQX", name = "a", descriptor = "(IFII)F")
    private float method229(int arg0, float arg1, int arg2, int arg3) {
        int var5 = 29 / arg3;
        float var6 = (float) (this.field791[arg0][1][arg2] - this.field791[arg0][0][arg2]) * arg1 + (float) this.field791[arg0][0][arg2];
        float var7 = var6 * 1.2207031E-4F;
        return this.method228(-762, var7);
    }

    @OriginalMember(owner = "GHIPAIQX", name = "a", descriptor = "(FII)I")
    public int method230(float arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            float var4 = (float) (this.field793[1] - this.field793[0]) * arg0 + (float) this.field793[0];
            float var5 = var4 * 0.0030517578F;
            field796 = (float) Math.pow(0.1D, (double) (var5 / 20.0F));
            field797 = (int) (field796 * 65536.0F);
        }
        if (this.field790[arg1] == 0) {
            return 0;
        }
        float var6 = this.method227(arg0, (byte) 4, arg1, 0);
        field794[arg1][0] = var6 * -2.0F * (float) Math.cos((double) this.method229(arg1, arg0, 0, 869));
        field794[arg1][1] = var6 * var6;
        if (arg2 < 4 || arg2 > 4) {
            this.field788 = !this.field788;
        }
        for (int var7 = 1; var7 < this.field790[arg1]; var7++) {
            float var10 = this.method227(arg0, (byte) 4, arg1, var7);
            float var11 = var10 * -2.0F * (float) Math.cos((double) this.method229(arg1, arg0, var7, 869));
            float var12 = var10 * var10;
            field794[arg1][var7 * 2 + 1] = field794[arg1][var7 * 2 - 1] * var12;
            field794[arg1][var7 * 2] = field794[arg1][var7 * 2 - 1] * var11 + field794[arg1][var7 * 2 - 2] * var12;
            for (int var13 = var7 * 2 - 1; var13 >= 2; var13--) {
                field794[arg1][var13] += field794[arg1][var13 - 1] * var11 + field794[arg1][var13 - 2] * var12;
            }
            field794[arg1][1] += field794[arg1][0] * var11 + var12;
            field794[arg1][0] += var11;
        }
        if (arg1 == 0) {
            for (int var8 = 0; var8 < this.field790[0] * 2; var8++) {
                field794[0][var8] *= field796;
            }
        }
        for (int var9 = 0; var9 < this.field790[arg1] * 2; var9++) {
            field795[arg1][var9] = (int) (field794[arg1][var9] * 65536.0F);
        }
        return this.field790[arg1] * 2;
    }

    @OriginalMember(owner = "GHIPAIQX", name = "a", descriptor = "(ZLLYKGAWTC;LGLMIQHJI;)V")
    public final void method231(boolean arg0, class37 arg1, class21 arg2) {
        int var4 = arg2.method244();
        this.field790[0] = var4 >> 4;
        this.field790[1] = var4 & 0xF;
        if (arg0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (var4 == 0) {
            this.field793[0] = this.field793[1] = 0;
            if (class62.field1590) {
            }
            return;
        }
        this.field793[0] = arg2.method246();
        this.field793[1] = arg2.method246();
        int var6 = arg2.method244();
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var10 = 0; var10 < this.field790[var7]; var10++) {
                this.field791[var7][0][var10] = arg2.method246();
                this.field792[var7][0][var10] = arg2.method246();
            }
        }
        for (int var8 = 0; var8 < 2; var8++) {
            for (int var9 = 0; var9 < this.field790[var8]; var9++) {
                if ((var6 & 0x1 << var8 * 4 << var9) == 0) {
                    this.field791[var8][1][var9] = this.field791[var8][0][var9];
                    this.field792[var8][1][var9] = this.field792[var8][0][var9];
                } else {
                    this.field791[var8][1][var9] = arg2.method246();
                    this.field792[var8][1][var9] = arg2.method246();
                }
            }
        }
        if (var6 != 0 || this.field793[1] != this.field793[0]) {
            arg1.method386(arg2, -433);
        }
    }
}
