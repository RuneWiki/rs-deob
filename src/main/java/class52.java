import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("TUODRVGB")
public class class52 {

    @OriginalMember(owner = "TUODRVGB", name = "a", descriptor = "I")
    private int field1453 = 4;

    @OriginalMember(owner = "TUODRVGB", name = "b", descriptor = "B")
    private byte field1454 = -113;

    @OriginalMember(owner = "TUODRVGB", name = "c", descriptor = "B")
    private byte field1455 = -120;

    @OriginalMember(owner = "TUODRVGB", name = "d", descriptor = "B")
    private byte field1456 = -120;

    @OriginalMember(owner = "TUODRVGB", name = "e", descriptor = "I")
    private int field1457 = 986;

    @OriginalMember(owner = "TUODRVGB", name = "f", descriptor = "Z")
    private boolean field1458 = true;

    @OriginalMember(owner = "TUODRVGB", name = "g", descriptor = "[I")
    public int[] field1459 = new int[2];

    @OriginalMember(owner = "TUODRVGB", name = "h", descriptor = "[[[I")
    public int[][][] field1460 = new int[2][2][4];

    @OriginalMember(owner = "TUODRVGB", name = "i", descriptor = "[[[I")
    public int[][][] field1461 = new int[2][2][4];

    @OriginalMember(owner = "TUODRVGB", name = "j", descriptor = "[I")
    public int[] field1462 = new int[2];

    @OriginalMember(owner = "TUODRVGB", name = "k", descriptor = "[[F")
    public static float[][] field1463 = new float[2][8];

    @OriginalMember(owner = "TUODRVGB", name = "l", descriptor = "[[I")
    public static int[][] field1464 = new int[2][8];

    @OriginalMember(owner = "TUODRVGB", name = "m", descriptor = "F")
    public static float field1465;

    @OriginalMember(owner = "TUODRVGB", name = "n", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "TUODRVGB", name = "a", descriptor = "(BIIF)F")
    private float method443(byte arg0, int arg1, int arg2, float arg3) {
        float var5 = (float) (this.field1461[arg2][1][arg1] - this.field1461[arg2][0][arg1]) * arg3 + (float) this.field1461[arg2][0][arg1];
        if (arg0 != -113) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        float var7 = var5 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var7 / 20.0F));
    }

    @OriginalMember(owner = "TUODRVGB", name = "a", descriptor = "(FI)F")
    private float method444(float arg0, int arg1) {
        float var3 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        if (arg1 != 49808) {
            this.field1453 = 382;
        }
        return var3 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "TUODRVGB", name = "a", descriptor = "(FBII)F")
    private float method445(float arg0, byte arg1, int arg2, int arg3) {
        float var5 = (float) (this.field1460[arg2][1][arg3] - this.field1460[arg2][0][arg3]) * arg0 + (float) this.field1460[arg2][0][arg3];
        if (this.field1456 != arg1) {
            this.field1458 = !this.field1458;
        }
        float var6 = var5 * 1.2207031E-4F;
        return this.method444(var6, 49808);
    }

    @OriginalMember(owner = "TUODRVGB", name = "a", descriptor = "(IIF)I")
    public int method446(int arg0, int arg1, float arg2) {
        if (arg0 == 0) {
            float var4 = (float) (this.field1462[1] - this.field1462[0]) * arg2 + (float) this.field1462[0];
            float var5 = var4 * 0.0030517578F;
            field1465 = (float) Math.pow(0.1D, (double) (var5 / 20.0F));
            field1466 = (int) (field1465 * 65536.0F);
        }
        if (this.field1459[arg0] == 0) {
            return 0;
        }
        float var6 = this.method443(this.field1454, 0, arg0, arg2);
        field1463[arg0][0] = var6 * -2.0F * (float) Math.cos((double) this.method445(arg2, this.field1455, arg0, 0));
        if (arg1 <= 0) {
            this.field1457 = 67;
        }
        field1463[arg0][1] = var6 * var6;
        for (int var7 = 1; var7 < this.field1459[arg0]; var7++) {
            float var10 = this.method443(this.field1454, var7, arg0, arg2);
            float var11 = var10 * -2.0F * (float) Math.cos((double) this.method445(arg2, this.field1455, arg0, var7));
            float var12 = var10 * var10;
            field1463[arg0][var7 * 2 + 1] = field1463[arg0][var7 * 2 - 1] * var12;
            field1463[arg0][var7 * 2] = field1463[arg0][var7 * 2 - 1] * var11 + field1463[arg0][var7 * 2 - 2] * var12;
            for (int var13 = var7 * 2 - 1; var13 >= 2; var13--) {
                field1463[arg0][var13] += field1463[arg0][var13 - 1] * var11 + field1463[arg0][var13 - 2] * var12;
            }
            field1463[arg0][1] += field1463[arg0][0] * var11 + var12;
            field1463[arg0][0] += var11;
        }
        if (arg0 == 0) {
            for (int var8 = 0; var8 < this.field1459[0] * 2; var8++) {
                field1463[0][var8] *= field1465;
            }
        }
        for (int var9 = 0; var9 < this.field1459[arg0] * 2; var9++) {
            field1464[arg0][var9] = (int) (field1463[arg0][var9] * 65536.0F);
        }
        return this.field1459[arg0] * 2;
    }

    @OriginalMember(owner = "TUODRVGB", name = "a", descriptor = "(LXCOYGYOS;ILZOMNSJJM;)V")
    public final void method447(class59 arg0, int arg1, class69 arg2) {
        int var4 = arg2.method547();
        this.field1459[0] = var4 >> 4;
        this.field1459[1] = var4 & 0xF;
        if (arg1 != 8588) {
            return;
        }
        if (var4 == 0) {
            this.field1462[0] = this.field1462[1] = 0;
            return;
        }
        this.field1462[0] = arg2.method549();
        this.field1462[1] = arg2.method549();
        int var5 = arg2.method547();
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var9 = 0; var9 < this.field1459[var6]; var9++) {
                this.field1460[var6][0][var9] = arg2.method549();
                this.field1461[var6][0][var9] = arg2.method549();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1459[var7]; var8++) {
                if ((var5 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1460[var7][1][var8] = this.field1460[var7][0][var8];
                    this.field1461[var7][1][var8] = this.field1461[var7][0][var8];
                } else {
                    this.field1460[var7][1][var8] = arg2.method549();
                    this.field1461[var7][1][var8] = arg2.method549();
                }
            }
        }
        if (var5 != 0 || this.field1462[1] != this.field1462[0]) {
            arg0.method455(arg2, 51);
        }
    }

    @OriginalMember(owner = "TUODRVGB", name = "<init>", descriptor = "()V")
    public class52() {
        if (class72.field1737) {
        }
    }
}
