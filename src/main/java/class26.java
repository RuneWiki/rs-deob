import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("LOQKYCGM")
public class class26 {

    @OriginalMember(owner = "LOQKYCGM", name = "a", descriptor = "I")
    private int field995 = 8;

    @OriginalMember(owner = "LOQKYCGM", name = "b", descriptor = "B")
    private byte field996 = 19;

    @OriginalMember(owner = "LOQKYCGM", name = "c", descriptor = "Z")
    private boolean field997 = true;

    @OriginalMember(owner = "LOQKYCGM", name = "d", descriptor = "[I")
    public int[] field998 = new int[2];

    @OriginalMember(owner = "LOQKYCGM", name = "e", descriptor = "[[[I")
    public int[][][] field999 = new int[2][2][4];

    @OriginalMember(owner = "LOQKYCGM", name = "f", descriptor = "[[[I")
    public int[][][] field1000 = new int[2][2][4];

    @OriginalMember(owner = "LOQKYCGM", name = "g", descriptor = "[I")
    public int[] field1001 = new int[2];

    @OriginalMember(owner = "LOQKYCGM", name = "h", descriptor = "[[F")
    public static float[][] field1002 = new float[2][8];

    @OriginalMember(owner = "LOQKYCGM", name = "i", descriptor = "[[I")
    public static int[][] field1003 = new int[2][8];

    @OriginalMember(owner = "LOQKYCGM", name = "j", descriptor = "F")
    public static float field1004;

    @OriginalMember(owner = "LOQKYCGM", name = "k", descriptor = "I")
    public static int field1005;

    @OriginalMember(owner = "LOQKYCGM", name = "a", descriptor = "(FIII)F")
    private float method303(float arg0, int arg1, int arg2, int arg3) {
        float var5 = (float) (this.field1000[arg1][1][arg3] - this.field1000[arg1][0][arg3]) * arg0 + (float) this.field1000[arg1][0][arg3];
        if (arg2 != 0) {
            this.field997 = !this.field997;
        }
        float var6 = var5 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var6 / 20.0F));
    }

    @OriginalMember(owner = "LOQKYCGM", name = "a", descriptor = "(ZF)F")
    private float method304(boolean arg0, float arg1) {
        float var3 = (float) Math.pow(2.0D, (double) arg1) * 32.703197F;
        if (!arg0) {
            this.field995 = 313;
        }
        return var3 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "LOQKYCGM", name = "a", descriptor = "(IIIF)F")
    private float method305(int arg0, int arg1, int arg2, float arg3) {
        int var5 = 45 / arg1;
        float var6 = (float) (this.field999[arg0][1][arg2] - this.field999[arg0][0][arg2]) * arg3 + (float) this.field999[arg0][0][arg2];
        float var7 = var6 * 1.2207031E-4F;
        return this.method304(true, var7);
    }

    @OriginalMember(owner = "LOQKYCGM", name = "a", descriptor = "(FIB)I")
    public int method306(float arg0, int arg1, byte arg2) {
        if (this.field996 != arg2) {
            this.field997 = !this.field997;
        }
        if (arg1 == 0) {
            float var4 = (float) (this.field1001[1] - this.field1001[0]) * arg0 + (float) this.field1001[0];
            float var5 = var4 * 0.0030517578F;
            field1004 = (float) Math.pow(0.1D, (double) (var5 / 20.0F));
            field1005 = (int) (field1004 * 65536.0F);
        }
        if (this.field998[arg1] == 0) {
            return 0;
        }
        float var6 = this.method303(arg0, arg1, 0, 0);
        field1002[arg1][0] = var6 * -2.0F * (float) Math.cos((double) this.method305(arg1, 269, 0, arg0));
        field1002[arg1][1] = var6 * var6;
        for (int var7 = 1; var7 < this.field998[arg1]; var7++) {
            float var10 = this.method303(arg0, arg1, 0, var7);
            float var11 = var10 * -2.0F * (float) Math.cos((double) this.method305(arg1, 269, var7, arg0));
            float var12 = var10 * var10;
            field1002[arg1][var7 * 2 + 1] = field1002[arg1][var7 * 2 - 1] * var12;
            field1002[arg1][var7 * 2] = field1002[arg1][var7 * 2 - 1] * var11 + field1002[arg1][var7 * 2 - 2] * var12;
            for (int var13 = var7 * 2 - 1; var13 >= 2; var13--) {
                field1002[arg1][var13] += field1002[arg1][var13 - 1] * var11 + field1002[arg1][var13 - 2] * var12;
            }
            field1002[arg1][1] += field1002[arg1][0] * var11 + var12;
            field1002[arg1][0] += var11;
        }
        if (arg1 == 0) {
            for (int var8 = 0; var8 < this.field998[0] * 2; var8++) {
                field1002[0][var8] *= field1004;
            }
        }
        for (int var9 = 0; var9 < this.field998[arg1] * 2; var9++) {
            field1003[arg1][var9] = (int) (field1002[arg1][var9] * 65536.0F);
        }
        return this.field998[arg1] * 2;
    }

    @OriginalMember(owner = "LOQKYCGM", name = "a", descriptor = "(ILTMVRZUVH;LGHHPHSRU;)V")
    public final void method307(int arg0, class49 arg1, class14 arg2) {
        int var4 = 61 / arg0;
        int var5 = arg2.method202();
        this.field998[0] = var5 >> 4;
        this.field998[1] = var5 & 0xF;
        if (var5 == 0) {
            this.field1001[0] = this.field1001[1] = 0;
            return;
        }
        this.field1001[0] = arg2.method204();
        this.field1001[1] = arg2.method204();
        int var6 = arg2.method202();
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var10 = 0; var10 < this.field998[var7]; var10++) {
                this.field999[var7][0][var10] = arg2.method204();
                this.field1000[var7][0][var10] = arg2.method204();
            }
        }
        for (int var8 = 0; var8 < 2; var8++) {
            for (int var9 = 0; var9 < this.field998[var8]; var9++) {
                if ((var6 & 0x1 << var8 * 4 << var9) == 0) {
                    this.field999[var8][1][var9] = this.field999[var8][0][var9];
                    this.field1000[var8][1][var9] = this.field1000[var8][0][var9];
                } else {
                    this.field999[var8][1][var9] = arg2.method204();
                    this.field1000[var8][1][var9] = arg2.method204();
                }
            }
        }
        if (var6 != 0 || this.field1001[1] != this.field1001[0]) {
            arg1.method489(arg2, (byte) 8);
        }
    }

    @OriginalMember(owner = "LOQKYCGM", name = "<init>", descriptor = "()V")
    public class26() {
        if (class4.field57) {
        }
    }
}
