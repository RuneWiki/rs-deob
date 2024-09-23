import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("KVKPXLHS")
public class class28 {

    @OriginalMember(owner = "KVKPXLHS", name = "a", descriptor = "Z")
    private boolean field835 = true;

    @OriginalMember(owner = "KVKPXLHS", name = "b", descriptor = "B")
    private byte field836 = 2;

    @OriginalMember(owner = "KVKPXLHS", name = "c", descriptor = "[I")
    public int[] field837 = new int[2];

    @OriginalMember(owner = "KVKPXLHS", name = "d", descriptor = "[[[I")
    public int[][][] field838 = new int[2][2][4];

    @OriginalMember(owner = "KVKPXLHS", name = "e", descriptor = "[[[I")
    public int[][][] field839 = new int[2][2][4];

    @OriginalMember(owner = "KVKPXLHS", name = "f", descriptor = "[I")
    public int[] field840 = new int[2];

    @OriginalMember(owner = "KVKPXLHS", name = "g", descriptor = "[[F")
    public static float[][] field841 = new float[2][8];

    @OriginalMember(owner = "KVKPXLHS", name = "h", descriptor = "[[I")
    public static int[][] field842 = new int[2][8];

    @OriginalMember(owner = "KVKPXLHS", name = "i", descriptor = "F")
    public static float field843;

    @OriginalMember(owner = "KVKPXLHS", name = "j", descriptor = "I")
    public static int field844;

    @OriginalMember(owner = "KVKPXLHS", name = "a", descriptor = "(IIFI)F")
    private float method265(int arg0, int arg1, float arg2, int arg3) {
        float var5 = (float) (this.field839[arg1][1][arg3] - this.field839[arg1][0][arg3]) * arg2 + (float) this.field839[arg1][0][arg3];
        if (arg0 != 2) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        float var7 = var5 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var7 / 20.0F));
    }

    @OriginalMember(owner = "KVKPXLHS", name = "a", descriptor = "(IF)F")
    private float method266(int arg0, float arg1) {
        float var3 = (float) Math.pow(2.0D, (double) arg1) * 32.703197F;
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        return var3 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "KVKPXLHS", name = "a", descriptor = "(IFII)F")
    private float method267(int arg0, float arg1, int arg2, int arg3) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        float var5 = (float) (this.field838[arg3][1][arg2] - this.field838[arg3][0][arg2]) * arg1 + (float) this.field838[arg3][0][arg2];
        float var6 = var5 * 1.2207031E-4F;
        return this.method266(0, var6);
    }

    @OriginalMember(owner = "KVKPXLHS", name = "a", descriptor = "(IZF)I")
    public int method268(int arg0, boolean arg1, float arg2) {
        if (arg0 == 0) {
            float var4 = (float) (this.field840[1] - this.field840[0]) * arg2 + (float) this.field840[0];
            float var5 = var4 * 0.0030517578F;
            field843 = (float) Math.pow(0.1D, (double) (var5 / 20.0F));
            field844 = (int) (field843 * 65536.0F);
        }
        if (this.field837[arg0] == 0) {
            return 0;
        }
        float var6 = this.method265(2, arg0, arg2, 0);
        field841[arg0][0] = var6 * -2.0F * (float) Math.cos((double) this.method267(0, arg2, 0, arg0));
        if (!arg1) {
            return 3;
        }
        field841[arg0][1] = var6 * var6;
        for (int var7 = 1; var7 < this.field837[arg0]; var7++) {
            float var10 = this.method265(2, arg0, arg2, var7);
            float var11 = var10 * -2.0F * (float) Math.cos((double) this.method267(0, arg2, var7, arg0));
            float var12 = var10 * var10;
            field841[arg0][var7 * 2 + 1] = field841[arg0][var7 * 2 - 1] * var12;
            field841[arg0][var7 * 2] = field841[arg0][var7 * 2 - 1] * var11 + field841[arg0][var7 * 2 - 2] * var12;
            for (int var13 = var7 * 2 - 1; var13 >= 2; var13--) {
                field841[arg0][var13] += field841[arg0][var13 - 1] * var11 + field841[arg0][var13 - 2] * var12;
            }
            field841[arg0][1] += field841[arg0][0] * var11 + var12;
            field841[arg0][0] += var11;
        }
        if (arg0 == 0) {
            for (int var8 = 0; var8 < this.field837[0] * 2; var8++) {
                field841[0][var8] *= field843;
            }
        }
        for (int var9 = 0; var9 < this.field837[arg0] * 2; var9++) {
            field842[arg0][var9] = (int) (field841[arg0][var9] * 65536.0F);
        }
        return this.field837[arg0] * 2;
    }

    @OriginalMember(owner = "KVKPXLHS", name = "a", descriptor = "(BLRPKBYPNF;LMQZHAILV;)V")
    public final void method269(byte arg0, class48 arg1, class33 arg2) {
        int var4 = arg2.method325();
        this.field837[0] = var4 >> 4;
        this.field837[1] = var4 & 0xF;
        if (this.field836 == arg0) {
            boolean var5 = false;
        } else {
            this.field835 = !this.field835;
        }
        if (var4 == 0) {
            this.field840[0] = this.field840[1] = 0;
            if (class53.field1329) {
            }
            return;
        }
        this.field840[0] = arg2.method327();
        this.field840[1] = arg2.method327();
        int var6 = arg2.method325();
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var10 = 0; var10 < this.field837[var7]; var10++) {
                this.field838[var7][0][var10] = arg2.method327();
                this.field839[var7][0][var10] = arg2.method327();
            }
        }
        for (int var8 = 0; var8 < 2; var8++) {
            for (int var9 = 0; var9 < this.field837[var8]; var9++) {
                if ((var6 & 0x1 << var8 * 4 << var9) == 0) {
                    this.field838[var8][1][var9] = this.field838[var8][0][var9];
                    this.field839[var8][1][var9] = this.field839[var8][0][var9];
                } else {
                    this.field838[var8][1][var9] = arg2.method327();
                    this.field839[var8][1][var9] = arg2.method327();
                }
            }
        }
        if (var6 != 0 || this.field840[1] != this.field840[0]) {
            arg1.method474(arg2, (byte) -93);
        }
    }
}
