import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("DQYHQSPL")
public class class15 {

    @OriginalMember(owner = "DQYHQSPL", name = "a", descriptor = "I")
    private int field763 = 41444;

    @OriginalMember(owner = "DQYHQSPL", name = "c", descriptor = "[I")
    public int[] field765 = new int[2];

    @OriginalMember(owner = "DQYHQSPL", name = "d", descriptor = "[[[I")
    public int[][][] field766 = new int[2][2][4];

    @OriginalMember(owner = "DQYHQSPL", name = "e", descriptor = "[[[I")
    public int[][][] field767 = new int[2][2][4];

    @OriginalMember(owner = "DQYHQSPL", name = "f", descriptor = "[I")
    public int[] field768 = new int[2];

    @OriginalMember(owner = "DQYHQSPL", name = "g", descriptor = "[[F")
    public static float[][] field769 = new float[2][8];

    @OriginalMember(owner = "DQYHQSPL", name = "h", descriptor = "[[I")
    public static int[][] field770 = new int[2][8];

    @OriginalMember(owner = "DQYHQSPL", name = "i", descriptor = "F")
    public static float field771;

    @OriginalMember(owner = "DQYHQSPL", name = "b", descriptor = "I")
    private int field764;

    @OriginalMember(owner = "DQYHQSPL", name = "j", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "DQYHQSPL", name = "a", descriptor = "(IIFI)F")
    private float method242(int arg0, int arg1, float arg2, int arg3) {
        float var5 = (float) (this.field767[arg0][1][arg3] - this.field767[arg0][0][arg3]) * arg2 + (float) this.field767[arg0][0][arg3];
        float var6 = var5 * 0.0015258789F;
        if (arg1 != 0) {
            this.field763 = 25;
        }
        return 1.0F - (float) Math.pow(10.0D, (double) (-var6 / 20.0F));
    }

    @OriginalMember(owner = "DQYHQSPL", name = "a", descriptor = "(IF)F")
    private float method243(int arg0, float arg1) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        float var3 = (float) Math.pow(2.0D, (double) arg1) * 32.703197F;
        return var3 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "DQYHQSPL", name = "a", descriptor = "(ZFII)F")
    private float method244(boolean arg0, float arg1, int arg2, int arg3) {
        float var5 = (float) (this.field766[arg2][1][arg3] - this.field766[arg2][0][arg3]) * arg1 + (float) this.field766[arg2][0][arg3];
        float var6 = var5 * 1.2207031E-4F;
        if (!arg0) {
            this.field763 = -313;
        }
        return this.method243(0, var6);
    }

    @OriginalMember(owner = "DQYHQSPL", name = "a", descriptor = "(IIF)I")
    public int method245(int arg0, int arg1, float arg2) {
        if (arg1 != -23379) {
            this.field764 = -373;
        }
        if (arg0 == 0) {
            float var4 = (float) (this.field768[1] - this.field768[0]) * arg2 + (float) this.field768[0];
            float var5 = var4 * 0.0030517578F;
            field771 = (float) Math.pow(0.1D, (double) (var5 / 20.0F));
            field772 = (int) (field771 * 65536.0F);
        }
        if (this.field765[arg0] == 0) {
            return 0;
        }
        float var6 = this.method242(arg0, 0, arg2, 0);
        field769[arg0][0] = var6 * -2.0F * (float) Math.cos((double) this.method244(true, arg2, arg0, 0));
        field769[arg0][1] = var6 * var6;
        for (int var7 = 1; var7 < this.field765[arg0]; var7++) {
            float var10 = this.method242(arg0, 0, arg2, var7);
            float var11 = var10 * -2.0F * (float) Math.cos((double) this.method244(true, arg2, arg0, var7));
            float var12 = var10 * var10;
            field769[arg0][var7 * 2 + 1] = field769[arg0][var7 * 2 - 1] * var12;
            field769[arg0][var7 * 2] = field769[arg0][var7 * 2 - 1] * var11 + field769[arg0][var7 * 2 - 2] * var12;
            for (int var13 = var7 * 2 - 1; var13 >= 2; var13--) {
                field769[arg0][var13] += field769[arg0][var13 - 1] * var11 + field769[arg0][var13 - 2] * var12;
            }
            field769[arg0][1] += field769[arg0][0] * var11 + var12;
            field769[arg0][0] += var11;
        }
        if (arg0 == 0) {
            for (int var8 = 0; var8 < this.field765[0] * 2; var8++) {
                field769[0][var8] *= field771;
            }
        }
        for (int var9 = 0; var9 < this.field765[arg0] * 2; var9++) {
            field770[arg0][var9] = (int) (field769[arg0][var9] * 65536.0F);
        }
        return this.field765[arg0] * 2;
    }

    @OriginalMember(owner = "DQYHQSPL", name = "a", descriptor = "(ILRSNWTZPO;LINLHDAGO;)V")
    public final void method246(int arg0, class54 arg1, class29 arg2) {
        int var4 = arg2.method308();
        this.field765[0] = var4 >> 4;
        if (arg0 != -45827) {
            return;
        }
        this.field765[1] = var4 & 0xF;
        if (var4 == 0) {
            this.field768[0] = this.field768[1] = 0;
            return;
        }
        this.field768[0] = arg2.method310();
        this.field768[1] = arg2.method310();
        int var5 = arg2.method308();
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var9 = 0; var9 < this.field765[var6]; var9++) {
                this.field766[var6][0][var9] = arg2.method310();
                this.field767[var6][0][var9] = arg2.method310();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field765[var7]; var8++) {
                if ((var5 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field766[var7][1][var8] = this.field766[var7][0][var8];
                    this.field767[var7][1][var8] = this.field767[var7][0][var8];
                } else {
                    this.field766[var7][1][var8] = arg2.method310();
                    this.field767[var7][1][var8] = arg2.method310();
                }
            }
        }
        if (var5 != 0 || this.field768[1] != this.field768[0]) {
            arg1.method466(arg2, 0);
        }
    }

    @OriginalMember(owner = "DQYHQSPL", name = "<init>", descriptor = "()V")
    public class15() {
        if (class13.field723) {
        }
    }
}
