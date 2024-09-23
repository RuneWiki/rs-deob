import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("RFLXBNRG")
public class class42 {

    @OriginalMember(owner = "RFLXBNRG", name = "a", descriptor = "I")
    private int field1321 = 35844;

    @OriginalMember(owner = "RFLXBNRG", name = "b", descriptor = "Z")
    private boolean field1322 = false;

    @OriginalMember(owner = "RFLXBNRG", name = "c", descriptor = "[I")
    public int[] field1323 = new int[2];

    @OriginalMember(owner = "RFLXBNRG", name = "d", descriptor = "[[[I")
    public int[][][] field1324 = new int[2][2][4];

    @OriginalMember(owner = "RFLXBNRG", name = "e", descriptor = "[[[I")
    public int[][][] field1325 = new int[2][2][4];

    @OriginalMember(owner = "RFLXBNRG", name = "f", descriptor = "[I")
    public int[] field1326 = new int[2];

    @OriginalMember(owner = "RFLXBNRG", name = "g", descriptor = "[[F")
    public static float[][] field1327 = new float[2][8];

    @OriginalMember(owner = "RFLXBNRG", name = "h", descriptor = "[[I")
    public static int[][] field1328 = new int[2][8];

    @OriginalMember(owner = "RFLXBNRG", name = "i", descriptor = "F")
    public static float field1329;

    @OriginalMember(owner = "RFLXBNRG", name = "j", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "RFLXBNRG", name = "a", descriptor = "(IFBI)F")
    private float method436(int arg0, float arg1, byte arg2, int arg3) {
        if (arg2 == 2) {
            boolean var5 = false;
        } else {
            this.field1322 = !this.field1322;
        }
        float var6 = (float) (this.field1325[arg0][1][arg3] - this.field1325[arg0][0][arg3]) * arg1 + (float) this.field1325[arg0][0][arg3];
        float var7 = var6 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var7 / 20.0F));
    }

    @OriginalMember(owner = "RFLXBNRG", name = "a", descriptor = "(FB)F")
    private float method437(float arg0, byte arg1) {
        float var3 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        if (arg1 != -117) {
            throw new NullPointerException();
        }
        return var3 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "RFLXBNRG", name = "a", descriptor = "(IIIF)F")
    private float method438(int arg0, int arg1, int arg2, float arg3) {
        if (this.field1321 != arg0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        float var6 = (float) (this.field1324[arg1][1][arg2] - this.field1324[arg1][0][arg2]) * arg3 + (float) this.field1324[arg1][0][arg2];
        float var7 = var6 * 1.2207031E-4F;
        return this.method437(var7, (byte) -117);
    }

    @OriginalMember(owner = "RFLXBNRG", name = "a", descriptor = "(IIF)I")
    public int method439(int arg0, int arg1, float arg2) {
        if (arg1 == 0) {
            float var4 = (float) (this.field1326[1] - this.field1326[0]) * arg2 + (float) this.field1326[0];
            float var5 = var4 * 0.0030517578F;
            field1329 = (float) Math.pow(0.1D, (double) (var5 / 20.0F));
            field1330 = (int) (field1329 * 65536.0F);
        }
        if (this.field1323[arg1] == 0) {
            return 0;
        }
        float var6 = this.method436(arg1, arg2, (byte) 2, 0);
        field1327[arg1][0] = var6 * -2.0F * (float) Math.cos((double) this.method438(35844, arg1, 0, arg2));
        field1327[arg1][1] = var6 * var6;
        if (arg0 != -3907) {
            return 1;
        }
        for (int var7 = 1; var7 < this.field1323[arg1]; var7++) {
            float var10 = this.method436(arg1, arg2, (byte) 2, var7);
            float var11 = var10 * -2.0F * (float) Math.cos((double) this.method438(35844, arg1, var7, arg2));
            float var12 = var10 * var10;
            field1327[arg1][var7 * 2 + 1] = field1327[arg1][var7 * 2 - 1] * var12;
            field1327[arg1][var7 * 2] = field1327[arg1][var7 * 2 - 1] * var11 + field1327[arg1][var7 * 2 - 2] * var12;
            for (int var13 = var7 * 2 - 1; var13 >= 2; var13--) {
                field1327[arg1][var13] += field1327[arg1][var13 - 1] * var11 + field1327[arg1][var13 - 2] * var12;
            }
            field1327[arg1][1] += field1327[arg1][0] * var11 + var12;
            field1327[arg1][0] += var11;
        }
        if (arg1 == 0) {
            for (int var8 = 0; var8 < this.field1323[0] * 2; var8++) {
                field1327[0][var8] *= field1329;
            }
        }
        for (int var9 = 0; var9 < this.field1323[arg1] * 2; var9++) {
            field1328[arg1][var9] = (int) (field1327[arg1][var9] * 65536.0F);
        }
        return this.field1323[arg1] * 2;
    }

    @OriginalMember(owner = "RFLXBNRG", name = "a", descriptor = "(ILVJXKRAVR;LMLYYHULT;)V")
    public final void method440(int arg0, class59 arg1, class30 arg2) {
        int var4 = arg2.method296();
        this.field1323[0] = var4 >> 4;
        this.field1323[1] = var4 & 0xF;
        if (arg0 != 10762) {
            return;
        }
        if (var4 == 0) {
            this.field1326[0] = this.field1326[1] = 0;
            return;
        }
        this.field1326[0] = arg2.method298();
        this.field1326[1] = arg2.method298();
        int var5 = arg2.method296();
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var9 = 0; var9 < this.field1323[var6]; var9++) {
                this.field1324[var6][0][var9] = arg2.method298();
                this.field1325[var6][0][var9] = arg2.method298();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1323[var7]; var8++) {
                if ((var5 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1324[var7][1][var8] = this.field1324[var7][0][var8];
                    this.field1325[var7][1][var8] = this.field1325[var7][0][var8];
                } else {
                    this.field1324[var7][1][var8] = arg2.method298();
                    this.field1325[var7][1][var8] = arg2.method298();
                }
            }
        }
        if (var5 != 0 || this.field1326[1] != this.field1326[0]) {
            arg1.method565(arg2, -39134);
        }
    }

    @OriginalMember(owner = "RFLXBNRG", name = "<init>", descriptor = "()V")
    public class42() {
        if (class38.field1221) {
        }
    }
}
