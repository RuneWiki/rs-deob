import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!QMCMKVTF")
public class class42 {

    @OriginalMember(owner = "client!QMCMKVTF", name = "b", descriptor = "I")
    private int field1156 = 932;

    @OriginalMember(owner = "client!QMCMKVTF", name = "c", descriptor = "I")
    private int field1157 = 9;

    @OriginalMember(owner = "client!QMCMKVTF", name = "d", descriptor = "I")
    private int field1158 = -580;

    @OriginalMember(owner = "client!QMCMKVTF", name = "e", descriptor = "[I")
    public int[] field1159 = new int[2];

    @OriginalMember(owner = "client!QMCMKVTF", name = "f", descriptor = "[[[I")
    public int[][][] field1160 = new int[2][2][4];

    @OriginalMember(owner = "client!QMCMKVTF", name = "g", descriptor = "[[[I")
    public int[][][] field1161 = new int[2][2][4];

    @OriginalMember(owner = "client!QMCMKVTF", name = "h", descriptor = "[I")
    public int[] field1162 = new int[2];

    @OriginalMember(owner = "client!QMCMKVTF", name = "i", descriptor = "[[F")
    public static float[][] field1163 = new float[2][8];

    @OriginalMember(owner = "client!QMCMKVTF", name = "j", descriptor = "[[I")
    public static int[][] field1164 = new int[2][8];

    @OriginalMember(owner = "client!QMCMKVTF", name = "k", descriptor = "F")
    public static float field1165;

    @OriginalMember(owner = "client!QMCMKVTF", name = "a", descriptor = "I")
    private int field1155;

    @OriginalMember(owner = "client!QMCMKVTF", name = "l", descriptor = "I")
    public static int field1166;

    @OriginalMember(owner = "client!QMCMKVTF", name = "a", descriptor = "(IIIF)F")
    private float method368(int arg0, int arg1, int arg2, float arg3) {
        float var5 = (float) (this.field1161[arg1][1][arg2] - this.field1161[arg1][0][arg2]) * arg3 + (float) this.field1161[arg1][0][arg2];
        if (arg0 != 0) {
            this.field1158 = -226;
        }
        float var6 = var5 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var6 / 20.0F));
    }

    @OriginalMember(owner = "client!QMCMKVTF", name = "a", descriptor = "(FI)F")
    private float method369(float arg0, int arg1) {
        float var3 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        int var4 = 73 / arg1;
        return var3 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!QMCMKVTF", name = "b", descriptor = "(IIIF)F")
    private float method370(int arg0, int arg1, int arg2, float arg3) {
        if (arg0 < this.field1157 || arg0 > this.field1157) {
            throw new NullPointerException();
        }
        float var5 = (float) (this.field1160[arg2][1][arg1] - this.field1160[arg2][0][arg1]) * arg3 + (float) this.field1160[arg2][0][arg1];
        float var6 = var5 * 1.2207031E-4F;
        return this.method369(var6, 932);
    }

    @OriginalMember(owner = "client!QMCMKVTF", name = "a", descriptor = "(IZF)I")
    public int method371(int arg0, boolean arg1, float arg2) {
        if (arg0 == 0) {
            float var4 = (float) (this.field1162[1] - this.field1162[0]) * arg2 + (float) this.field1162[0];
            float var5 = var4 * 0.0030517578F;
            field1165 = (float) Math.pow(0.1D, (double) (var5 / 20.0F));
            field1166 = (int) (field1165 * 65536.0F);
        }
        if (this.field1159[arg0] == 0) {
            return 0;
        }
        float var6 = this.method368(0, arg0, 0, arg2);
        if (!arg1) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        field1163[arg0][0] = var6 * -2.0F * (float) Math.cos((double) this.method370(9, 0, arg0, arg2));
        field1163[arg0][1] = var6 * var6;
        for (int var8 = 1; var8 < this.field1159[arg0]; var8++) {
            float var11 = this.method368(0, arg0, var8, arg2);
            float var12 = var11 * -2.0F * (float) Math.cos((double) this.method370(9, var8, arg0, arg2));
            float var13 = var11 * var11;
            field1163[arg0][var8 * 2 + 1] = field1163[arg0][var8 * 2 - 1] * var13;
            field1163[arg0][var8 * 2] = field1163[arg0][var8 * 2 - 1] * var12 + field1163[arg0][var8 * 2 - 2] * var13;
            for (int var14 = var8 * 2 - 1; var14 >= 2; var14--) {
                field1163[arg0][var14] += field1163[arg0][var14 - 1] * var12 + field1163[arg0][var14 - 2] * var13;
            }
            field1163[arg0][1] += field1163[arg0][0] * var12 + var13;
            field1163[arg0][0] += var12;
        }
        if (arg0 == 0) {
            for (int var9 = 0; var9 < this.field1159[0] * 2; var9++) {
                field1163[0][var9] *= field1165;
            }
        }
        for (int var10 = 0; var10 < this.field1159[arg0] * 2; var10++) {
            field1164[arg0][var10] = (int) (field1163[arg0][var10] * 65536.0F);
        }
        return this.field1159[arg0] * 2;
    }

    @OriginalMember(owner = "client!QMCMKVTF", name = "a", descriptor = "(ZLEMWAMCXW;LISLGIOFS;)V")
    public final void method372(boolean arg0, class14 arg1, class21 arg2) {
        int var4 = arg1.method217();
        this.field1159[0] = var4 >> 4;
        this.field1159[1] = var4 & 0xF;
        if (arg0) {
            this.field1155 = -425;
        }
        if (var4 == 0) {
            this.field1162[0] = this.field1162[1] = 0;
            return;
        }
        this.field1162[0] = arg1.method219();
        this.field1162[1] = arg1.method219();
        int var5 = arg1.method217();
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var9 = 0; var9 < this.field1159[var6]; var9++) {
                this.field1160[var6][0][var9] = arg1.method219();
                this.field1161[var6][0][var9] = arg1.method219();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1159[var7]; var8++) {
                if ((var5 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1160[var7][1][var8] = this.field1160[var7][0][var8];
                    this.field1161[var7][1][var8] = this.field1161[var7][0][var8];
                } else {
                    this.field1160[var7][1][var8] = arg1.method219();
                    this.field1161[var7][1][var8] = arg1.method219();
                }
            }
        }
        if (var5 != 0 || this.field1162[1] != this.field1162[0]) {
            arg2.method296(-5335, arg1);
        }
    }

    @OriginalMember(owner = "client!QMCMKVTF", name = "<init>", descriptor = "()V")
    public class42() {
        if (class34.field1027) {
        }
    }
}
