import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("GLZZOSSI")
public class class16 {

    @OriginalMember(owner = "GLZZOSSI", name = "a", descriptor = "[I")
    public int[] field697 = new int[2];

    @OriginalMember(owner = "GLZZOSSI", name = "b", descriptor = "[[[I")
    public int[][][] field698 = new int[2][2][4];

    @OriginalMember(owner = "GLZZOSSI", name = "c", descriptor = "[[[I")
    public int[][][] field699 = new int[2][2][4];

    @OriginalMember(owner = "GLZZOSSI", name = "d", descriptor = "[I")
    public int[] field700 = new int[2];

    @OriginalMember(owner = "GLZZOSSI", name = "e", descriptor = "[[F")
    public static float[][] field701 = new float[2][8];

    @OriginalMember(owner = "GLZZOSSI", name = "f", descriptor = "[[I")
    public static int[][] field702 = new int[2][8];

    @OriginalMember(owner = "GLZZOSSI", name = "g", descriptor = "F")
    public static float field703;

    @OriginalMember(owner = "GLZZOSSI", name = "h", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "GLZZOSSI", name = "a", descriptor = "(FIZI)F")
    private float method251(float arg0, int arg1, boolean arg2, int arg3) {
        float var5 = (float) (this.field699[arg1][1][arg3] - this.field699[arg1][0][arg3]) * arg0 + (float) this.field699[arg1][0][arg3];
        float var6 = var5 * 0.0015258789F;
        if (!arg2) {
            throw new NullPointerException();
        }
        return 1.0F - (float) Math.pow(10.0D, (double) (-var6 / 20.0F));
    }

    @OriginalMember(owner = "GLZZOSSI", name = "a", descriptor = "(ZF)F")
    private float method252(boolean arg0, float arg1) {
        float var3 = (float) Math.pow(2.0D, (double) arg1) * 32.703197F;
        if (!arg0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        return var3 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "GLZZOSSI", name = "a", descriptor = "(FZII)F")
    private float method253(float arg0, boolean arg1, int arg2, int arg3) {
        float var5 = (float) (this.field698[arg2][1][arg3] - this.field698[arg2][0][arg3]) * arg0 + (float) this.field698[arg2][0][arg3];
        if (!arg1) {
            throw new NullPointerException();
        }
        float var6 = var5 * 1.2207031E-4F;
        return this.method252(true, var6);
    }

    @OriginalMember(owner = "GLZZOSSI", name = "a", descriptor = "(IIF)I")
    public int method254(int arg0, int arg1, float arg2) {
        if (arg1 != 0) {
            return 1;
        }
        if (arg0 == 0) {
            float var4 = (float) (this.field700[1] - this.field700[0]) * arg2 + (float) this.field700[0];
            float var5 = var4 * 0.0030517578F;
            field703 = (float) Math.pow(0.1D, (double) (var5 / 20.0F));
            field704 = (int) (field703 * 65536.0F);
        }
        if (this.field697[arg0] == 0) {
            return 0;
        }
        float var6 = this.method251(arg2, arg0, true, 0);
        field701[arg0][0] = var6 * -2.0F * (float) Math.cos((double) this.method253(arg2, true, arg0, 0));
        field701[arg0][1] = var6 * var6;
        for (int var7 = 1; var7 < this.field697[arg0]; var7++) {
            float var10 = this.method251(arg2, arg0, true, var7);
            float var11 = var10 * -2.0F * (float) Math.cos((double) this.method253(arg2, true, arg0, var7));
            float var12 = var10 * var10;
            field701[arg0][var7 * 2 + 1] = field701[arg0][var7 * 2 - 1] * var12;
            field701[arg0][var7 * 2] = field701[arg0][var7 * 2 - 1] * var11 + field701[arg0][var7 * 2 - 2] * var12;
            for (int var13 = var7 * 2 - 1; var13 >= 2; var13--) {
                field701[arg0][var13] += field701[arg0][var13 - 1] * var11 + field701[arg0][var13 - 2] * var12;
            }
            field701[arg0][1] += field701[arg0][0] * var11 + var12;
            field701[arg0][0] += var11;
        }
        if (arg0 == 0) {
            for (int var8 = 0; var8 < this.field697[0] * 2; var8++) {
                field701[0][var8] *= field703;
            }
        }
        for (int var9 = 0; var9 < this.field697[arg0] * 2; var9++) {
            field702[arg0][var9] = (int) (field701[arg0][var9] * 65536.0F);
        }
        return this.field697[arg0] * 2;
    }

    @OriginalMember(owner = "GLZZOSSI", name = "a", descriptor = "(LDNRIFKTO;LGJKLDIZT;B)V")
    public final void method255(class11 arg0, class15 arg1, byte arg2) {
        int var4 = arg0.method189();
        this.field697[0] = var4 >> 4;
        if (arg2 != 1) {
            return;
        }
        this.field697[1] = var4 & 0xF;
        if (var4 == 0) {
            this.field700[0] = this.field700[1] = 0;
            return;
        }
        this.field700[0] = arg0.method191();
        this.field700[1] = arg0.method191();
        int var5 = arg0.method189();
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var9 = 0; var9 < this.field697[var6]; var9++) {
                this.field698[var6][0][var9] = arg0.method191();
                this.field699[var6][0][var9] = arg0.method191();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field697[var7]; var8++) {
                if ((var5 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field698[var7][1][var8] = this.field698[var7][0][var8];
                    this.field699[var7][1][var8] = this.field699[var7][0][var8];
                } else {
                    this.field698[var7][1][var8] = arg0.method191();
                    this.field699[var7][1][var8] = arg0.method191();
                }
            }
        }
        if (var5 != 0 || this.field700[1] != this.field700[0]) {
            arg1.method248((byte) -76, arg0);
        }
    }
}
