import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("QPCNAGNU")
public class class56 {

    @OriginalMember(owner = "QPCNAGNU", name = "a", descriptor = "I")
    private int field1314 = 6;

    @OriginalMember(owner = "QPCNAGNU", name = "b", descriptor = "[I")
    public int[] field1315 = new int[2];

    @OriginalMember(owner = "QPCNAGNU", name = "c", descriptor = "[[[I")
    public int[][][] field1316 = new int[2][2][4];

    @OriginalMember(owner = "QPCNAGNU", name = "d", descriptor = "[[[I")
    public int[][][] field1317 = new int[2][2][4];

    @OriginalMember(owner = "QPCNAGNU", name = "e", descriptor = "[I")
    public int[] field1318 = new int[2];

    @OriginalMember(owner = "QPCNAGNU", name = "f", descriptor = "[[F")
    public static float[][] field1319 = new float[2][8];

    @OriginalMember(owner = "QPCNAGNU", name = "g", descriptor = "[[I")
    public static int[][] field1320 = new int[2][8];

    @OriginalMember(owner = "QPCNAGNU", name = "h", descriptor = "F")
    public static float field1321;

    @OriginalMember(owner = "QPCNAGNU", name = "i", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "QPCNAGNU", name = "a", descriptor = "(FIBI)F")
    private float method348(float arg0, int arg1, byte arg2, int arg3) {
        float var5 = (float) (this.field1317[arg3][1][arg1] - this.field1317[arg3][0][arg1]) * arg0 + (float) this.field1317[arg3][0][arg1];
        if (arg2 != 1) {
            this.field1314 = 221;
        }
        float var6 = var5 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var6 / 20.0F));
    }

    @OriginalMember(owner = "QPCNAGNU", name = "a", descriptor = "(FB)F")
    private float method349(float arg0, byte arg1) {
        float var3 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        if (arg1 == 5) {
            boolean var4 = false;
        } else {
            this.field1314 = 375;
        }
        return var3 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "QPCNAGNU", name = "a", descriptor = "(IFII)F")
    private float method350(int arg0, float arg1, int arg2, int arg3) {
        float var5 = (float) (this.field1316[arg3][1][arg0] - this.field1316[arg3][0][arg0]) * arg1 + (float) this.field1316[arg3][0][arg0];
        if (arg2 >= 0) {
            this.field1314 = -188;
        }
        float var6 = var5 * 1.2207031E-4F;
        return this.method349(var6, (byte) 5);
    }

    @OriginalMember(owner = "QPCNAGNU", name = "a", descriptor = "(IIF)I")
    public int method351(int arg0, int arg1, float arg2) {
        if (arg0 == 0) {
            float var4 = (float) (this.field1318[1] - this.field1318[0]) * arg2 + (float) this.field1318[0];
            float var5 = var4 * 0.0030517578F;
            field1321 = (float) Math.pow(0.1D, (double) (var5 / 20.0F));
            field1322 = (int) (field1321 * 65536.0F);
        }
        if (this.field1315[arg0] == 0) {
            return 0;
        }
        float var6 = this.method348(arg2, 0, (byte) 1, arg0);
        field1319[arg0][0] = var6 * -2.0F * (float) Math.cos((double) this.method350(0, arg2, -274, arg0));
        if (arg1 >= 0) {
            return 4;
        }
        field1319[arg0][1] = var6 * var6;
        for (int var7 = 1; var7 < this.field1315[arg0]; var7++) {
            float var10 = this.method348(arg2, var7, (byte) 1, arg0);
            float var11 = var10 * -2.0F * (float) Math.cos((double) this.method350(var7, arg2, -274, arg0));
            float var12 = var10 * var10;
            field1319[arg0][var7 * 2 + 1] = field1319[arg0][var7 * 2 - 1] * var12;
            field1319[arg0][var7 * 2] = field1319[arg0][var7 * 2 - 1] * var11 + field1319[arg0][var7 * 2 - 2] * var12;
            for (int var13 = var7 * 2 - 1; var13 >= 2; var13--) {
                field1319[arg0][var13] += field1319[arg0][var13 - 1] * var11 + field1319[arg0][var13 - 2] * var12;
            }
            field1319[arg0][1] += field1319[arg0][0] * var11 + var12;
            field1319[arg0][0] += var11;
        }
        if (arg0 == 0) {
            for (int var8 = 0; var8 < this.field1315[0] * 2; var8++) {
                field1319[0][var8] *= field1321;
            }
        }
        for (int var9 = 0; var9 < this.field1315[arg0] * 2; var9++) {
            field1320[arg0][var9] = (int) (field1319[arg0][var9] * 65536.0F);
        }
        return this.field1315[arg0] * 2;
    }

    @OriginalMember(owner = "QPCNAGNU", name = "a", descriptor = "(LJDDBCSRY;ILXGRGMPUQ;)V")
    public final void method352(class29 arg0, int arg1, class69 arg2) {
        int var4 = arg2.method465();
        this.field1315[0] = var4 >> 4;
        if (arg1 != 0) {
            return;
        }
        this.field1315[1] = var4 & 0xF;
        if (var4 == 0) {
            this.field1318[0] = this.field1318[1] = 0;
            return;
        }
        this.field1318[0] = arg2.method467();
        this.field1318[1] = arg2.method467();
        int var5 = arg2.method465();
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var9 = 0; var9 < this.field1315[var6]; var9++) {
                this.field1316[var6][0][var9] = arg2.method467();
                this.field1317[var6][0][var9] = arg2.method467();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1315[var7]; var8++) {
                if ((var5 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1316[var7][1][var8] = this.field1316[var7][0][var8];
                    this.field1317[var7][1][var8] = this.field1317[var7][0][var8];
                } else {
                    this.field1316[var7][1][var8] = arg2.method467();
                    this.field1317[var7][1][var8] = arg2.method467();
                }
            }
        }
        if (var5 != 0 || this.field1318[1] != this.field1318[0]) {
            arg0.method258(arg2, 43184);
        }
    }

    @OriginalMember(owner = "QPCNAGNU", name = "<init>", descriptor = "()V")
    public class56() {
        if (class54.field1301) {
        }
    }
}
