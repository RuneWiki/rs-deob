import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!OYVSGGSR")
public class class40 {

    @OriginalMember(owner = "client!OYVSGGSR", name = "a", descriptor = "Z")
    private boolean field1211 = false;

    @OriginalMember(owner = "client!OYVSGGSR", name = "b", descriptor = "[I")
    public int[] field1212 = new int[2];

    @OriginalMember(owner = "client!OYVSGGSR", name = "c", descriptor = "[[[I")
    public int[][][] field1213 = new int[2][2][4];

    @OriginalMember(owner = "client!OYVSGGSR", name = "d", descriptor = "[[[I")
    public int[][][] field1214 = new int[2][2][4];

    @OriginalMember(owner = "client!OYVSGGSR", name = "e", descriptor = "[I")
    public int[] field1215 = new int[2];

    @OriginalMember(owner = "client!OYVSGGSR", name = "f", descriptor = "[[F")
    public static float[][] field1216 = new float[2][8];

    @OriginalMember(owner = "client!OYVSGGSR", name = "g", descriptor = "[[I")
    public static int[][] field1217 = new int[2][8];

    @OriginalMember(owner = "client!OYVSGGSR", name = "h", descriptor = "F")
    public static float field1218;

    @OriginalMember(owner = "client!OYVSGGSR", name = "i", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!OYVSGGSR", name = "a", descriptor = "(IFII)F")
    private float method323(int arg0, float arg1, int arg2, int arg3) {
        float var5 = (float) (this.field1214[arg3][1][arg0] - this.field1214[arg3][0][arg0]) * arg1 + (float) this.field1214[arg3][0][arg0];
        float var6 = var5 * 0.0015258789F;
        if (arg2 >= 0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        return 1.0F - (float) Math.pow(10.0D, (double) (-var6 / 20.0F));
    }

    @OriginalMember(owner = "client!OYVSGGSR", name = "a", descriptor = "(IF)F")
    private float method324(int arg0, float arg1) {
        float var3 = (float) Math.pow(2.0D, (double) arg1) * 32.703197F;
        if (arg0 <= 0) {
            throw new NullPointerException();
        }
        return var3 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!OYVSGGSR", name = "a", descriptor = "(IZFI)F")
    private float method325(int arg0, boolean arg1, float arg2, int arg3) {
        float var5 = (float) (this.field1213[arg3][1][arg0] - this.field1213[arg3][0][arg0]) * arg2 + (float) this.field1213[arg3][0][arg0];
        if (!arg1) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        float var7 = var5 * 1.2207031E-4F;
        return this.method324(246, var7);
    }

    @OriginalMember(owner = "client!OYVSGGSR", name = "a", descriptor = "(IIF)I")
    public int method326(int arg0, int arg1, float arg2) {
        if (arg1 == 0) {
            float var4 = (float) (this.field1215[1] - this.field1215[0]) * arg2 + (float) this.field1215[0];
            float var5 = var4 * 0.0030517578F;
            field1218 = (float) Math.pow(0.1D, (double) (var5 / 20.0F));
            field1219 = (int) (field1218 * 65536.0F);
        }
        if (this.field1212[arg1] == 0) {
            return 0;
        }
        float var6 = this.method323(0, arg2, -844, arg1);
        field1216[arg1][0] = var6 * -2.0F * (float) Math.cos((double) this.method325(0, true, arg2, arg1));
        field1216[arg1][1] = var6 * var6;
        for (int var7 = 1; var7 < this.field1212[arg1]; var7++) {
            float var10 = this.method323(var7, arg2, -844, arg1);
            float var11 = var10 * -2.0F * (float) Math.cos((double) this.method325(var7, true, arg2, arg1));
            float var12 = var10 * var10;
            field1216[arg1][var7 * 2 + 1] = field1216[arg1][var7 * 2 - 1] * var12;
            field1216[arg1][var7 * 2] = field1216[arg1][var7 * 2 - 1] * var11 + field1216[arg1][var7 * 2 - 2] * var12;
            for (int var13 = var7 * 2 - 1; var13 >= 2; var13--) {
                field1216[arg1][var13] += field1216[arg1][var13 - 1] * var11 + field1216[arg1][var13 - 2] * var12;
            }
            field1216[arg1][1] += field1216[arg1][0] * var11 + var12;
            field1216[arg1][0] += var11;
        }
        if (arg0 < 1 || arg0 > 1) {
            this.field1211 = !this.field1211;
        }
        if (arg1 == 0) {
            for (int var8 = 0; var8 < this.field1212[0] * 2; var8++) {
                field1216[0][var8] *= field1218;
            }
        }
        for (int var9 = 0; var9 < this.field1212[arg1] * 2; var9++) {
            field1217[arg1][var9] = (int) (field1216[arg1][var9] * 65536.0F);
        }
        return this.field1212[arg1] * 2;
    }

    @OriginalMember(owner = "client!OYVSGGSR", name = "a", descriptor = "(ILPQBRPYKE;LKEEMQUKU;)V")
    public final void method327(int arg0, class41 arg1, class30 arg2) {
        int var4 = arg1.method340();
        if (arg0 >= 0) {
            this.field1211 = !this.field1211;
        }
        this.field1212[0] = var4 >> 4;
        this.field1212[1] = var4 & 0xF;
        if (var4 == 0) {
            this.field1215[0] = this.field1215[1] = 0;
            if (class8.field622) {
            }
            return;
        }
        this.field1215[0] = arg1.method342();
        this.field1215[1] = arg1.method342();
        int var5 = arg1.method340();
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var9 = 0; var9 < this.field1212[var6]; var9++) {
                this.field1213[var6][0][var9] = arg1.method342();
                this.field1214[var6][0][var9] = arg1.method342();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1212[var7]; var8++) {
                if ((var5 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1213[var7][1][var8] = this.field1213[var7][0][var8];
                    this.field1214[var7][1][var8] = this.field1214[var7][0][var8];
                } else {
                    this.field1213[var7][1][var8] = arg1.method342();
                    this.field1214[var7][1][var8] = arg1.method342();
                }
            }
        }
        if (var5 != 0 || this.field1215[1] != this.field1215[0]) {
            arg2.method273(0, arg1);
        }
    }
}
