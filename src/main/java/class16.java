import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ECVTLYGP")
public class class16 {

    @OriginalMember(owner = "ECVTLYGP", name = "a", descriptor = "I")
    private int field711 = 637;

    @OriginalMember(owner = "ECVTLYGP", name = "b", descriptor = "I")
    private int field712 = -446;

    @OriginalMember(owner = "ECVTLYGP", name = "c", descriptor = "[I")
    public int[] field713 = new int[2];

    @OriginalMember(owner = "ECVTLYGP", name = "d", descriptor = "[[[I")
    public int[][][] field714 = new int[2][2][4];

    @OriginalMember(owner = "ECVTLYGP", name = "e", descriptor = "[[[I")
    public int[][][] field715 = new int[2][2][4];

    @OriginalMember(owner = "ECVTLYGP", name = "f", descriptor = "[I")
    public int[] field716 = new int[2];

    @OriginalMember(owner = "ECVTLYGP", name = "g", descriptor = "[[F")
    public static float[][] field717 = new float[2][8];

    @OriginalMember(owner = "ECVTLYGP", name = "h", descriptor = "[[I")
    public static int[][] field718 = new int[2][8];

    @OriginalMember(owner = "ECVTLYGP", name = "i", descriptor = "F")
    public static float field719;

    @OriginalMember(owner = "ECVTLYGP", name = "j", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "ECVTLYGP", name = "a", descriptor = "(IFII)F")
    private float method194(int arg0, float arg1, int arg2, int arg3) {
        float var5 = (float) (this.field715[arg0][1][arg3] - this.field715[arg0][0][arg3]) * arg1 + (float) this.field715[arg0][0][arg3];
        if (arg2 >= 0) {
            throw new NullPointerException();
        }
        float var6 = var5 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var6 / 20.0F));
    }

    @OriginalMember(owner = "ECVTLYGP", name = "a", descriptor = "(IF)F")
    private float method195(int arg0, float arg1) {
        float var3 = (float) Math.pow(2.0D, (double) arg1) * 32.703197F;
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        return var3 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "ECVTLYGP", name = "a", descriptor = "(FIII)F")
    private float method196(float arg0, int arg1, int arg2, int arg3) {
        float var5 = (float) (this.field714[arg2][1][arg1] - this.field714[arg2][0][arg1]) * arg0 + (float) this.field714[arg2][0][arg1];
        if (arg3 < 1 || arg3 > 1) {
            throw new NullPointerException();
        }
        float var6 = var5 * 1.2207031E-4F;
        return this.method195(-559, var6);
    }

    @OriginalMember(owner = "ECVTLYGP", name = "a", descriptor = "(IIF)I")
    public int method197(int arg0, int arg1, float arg2) {
        if (arg1 == 0) {
            float var4 = (float) (this.field716[1] - this.field716[0]) * arg2 + (float) this.field716[0];
            float var5 = var4 * 0.0030517578F;
            field719 = (float) Math.pow(0.1D, (double) (var5 / 20.0F));
            field720 = (int) (field719 * 65536.0F);
        }
        if (this.field713[arg1] == 0) {
            return 0;
        }
        float var6 = this.method194(arg1, arg2, this.field712, 0);
        field717[arg1][0] = var6 * -2.0F * (float) Math.cos((double) this.method196(arg2, 0, arg1, 1));
        if (arg0 != 0) {
            return this.field711;
        }
        field717[arg1][1] = var6 * var6;
        for (int var7 = 1; var7 < this.field713[arg1]; var7++) {
            float var10 = this.method194(arg1, arg2, this.field712, var7);
            float var11 = var10 * -2.0F * (float) Math.cos((double) this.method196(arg2, var7, arg1, 1));
            float var12 = var10 * var10;
            field717[arg1][var7 * 2 + 1] = field717[arg1][var7 * 2 - 1] * var12;
            field717[arg1][var7 * 2] = field717[arg1][var7 * 2 - 1] * var11 + field717[arg1][var7 * 2 - 2] * var12;
            for (int var13 = var7 * 2 - 1; var13 >= 2; var13--) {
                field717[arg1][var13] += field717[arg1][var13 - 1] * var11 + field717[arg1][var13 - 2] * var12;
            }
            field717[arg1][1] += field717[arg1][0] * var11 + var12;
            field717[arg1][0] += var11;
        }
        if (arg1 == 0) {
            for (int var8 = 0; var8 < this.field713[0] * 2; var8++) {
                field717[0][var8] *= field719;
            }
        }
        for (int var9 = 0; var9 < this.field713[arg1] * 2; var9++) {
            field718[arg1][var9] = (int) (field717[arg1][var9] * 65536.0F);
        }
        return this.field713[arg1] * 2;
    }

    @OriginalMember(owner = "ECVTLYGP", name = "a", descriptor = "(BLYOXDZEVD;LNSRSHTPL;)V")
    public final void method198(byte arg0, class68 arg1, class38 arg2) {
        if (arg0 != -38) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        int var5 = arg1.method549();
        this.field713[0] = var5 >> 4;
        this.field713[1] = var5 & 0xF;
        if (var5 == 0) {
            this.field716[0] = this.field716[1] = 0;
            if (class72.field1713) {
            }
            return;
        }
        this.field716[0] = arg1.method551();
        this.field716[1] = arg1.method551();
        int var6 = arg1.method549();
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var10 = 0; var10 < this.field713[var7]; var10++) {
                this.field714[var7][0][var10] = arg1.method551();
                this.field715[var7][0][var10] = arg1.method551();
            }
        }
        for (int var8 = 0; var8 < 2; var8++) {
            for (int var9 = 0; var9 < this.field713[var8]; var9++) {
                if ((var6 & 0x1 << var8 * 4 << var9) == 0) {
                    this.field714[var8][1][var9] = this.field714[var8][0][var9];
                    this.field715[var8][1][var9] = this.field715[var8][0][var9];
                } else {
                    this.field714[var8][1][var9] = arg1.method551();
                    this.field715[var8][1][var9] = arg1.method551();
                }
            }
        }
        if (var6 != 0 || this.field716[1] != this.field716[0]) {
            arg2.method339(796, arg1);
        }
    }
}
