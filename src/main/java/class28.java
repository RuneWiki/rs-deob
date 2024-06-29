import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!KEQJLHXN")
public class class28 {

    @OriginalMember(owner = "client!KEQJLHXN", name = "b", descriptor = "I")
    private int field993 = 1;

    @OriginalMember(owner = "client!KEQJLHXN", name = "c", descriptor = "I")
    private int field994 = 105;

    @OriginalMember(owner = "client!KEQJLHXN", name = "d", descriptor = "[I")
    public int[] field995 = new int[2];

    @OriginalMember(owner = "client!KEQJLHXN", name = "e", descriptor = "[[[I")
    public int[][][] field996 = new int[2][2][4];

    @OriginalMember(owner = "client!KEQJLHXN", name = "f", descriptor = "[[[I")
    public int[][][] field997 = new int[2][2][4];

    @OriginalMember(owner = "client!KEQJLHXN", name = "g", descriptor = "[I")
    public int[] field998 = new int[2];

    @OriginalMember(owner = "client!KEQJLHXN", name = "h", descriptor = "[[F")
    public static float[][] field999 = new float[2][8];

    @OriginalMember(owner = "client!KEQJLHXN", name = "i", descriptor = "[[I")
    public static int[][] field1000 = new int[2][8];

    @OriginalMember(owner = "client!KEQJLHXN", name = "j", descriptor = "F")
    public static float field1001;

    @OriginalMember(owner = "client!KEQJLHXN", name = "k", descriptor = "I")
    public static int field1002;

    @OriginalMember(owner = "client!KEQJLHXN", name = "a", descriptor = "I")
    private int field992;

    @OriginalMember(owner = "client!KEQJLHXN", name = "a", descriptor = "(FBII)F")
    private float method347(float arg0, byte arg1, int arg2, int arg3) {
        if (arg1 == 8) {
            boolean var5 = false;
        } else {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        float var7 = (float) (this.field997[arg3][1][arg2] - this.field997[arg3][0][arg2]) * arg0 + (float) this.field997[arg3][0][arg2];
        float var8 = var7 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var8 / 20.0F));
    }

    @OriginalMember(owner = "client!KEQJLHXN", name = "a", descriptor = "(IF)F")
    private float method348(int arg0, float arg1) {
        if (arg0 < 1 || arg0 > 1) {
            throw new NullPointerException();
        }
        float var3 = (float) Math.pow(2.0D, (double) arg1) * 32.703197F;
        return var3 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!KEQJLHXN", name = "a", descriptor = "(IZFI)F")
    private float method349(int arg0, boolean arg1, float arg2, int arg3) {
        if (arg1) {
            this.field994 = 476;
        }
        float var5 = (float) (this.field996[arg0][1][arg3] - this.field996[arg0][0][arg3]) * arg2 + (float) this.field996[arg0][0][arg3];
        float var6 = var5 * 1.2207031E-4F;
        return this.method348(this.field993, var6);
    }

    @OriginalMember(owner = "client!KEQJLHXN", name = "a", descriptor = "(FIZ)I")
    public int method350(float arg0, int arg1, boolean arg2) {
        if (arg1 == 0) {
            float var4 = (float) (this.field998[1] - this.field998[0]) * arg0 + (float) this.field998[0];
            float var5 = var4 * 0.0030517578F;
            field1001 = (float) Math.pow(0.1D, (double) (var5 / 20.0F));
            field1002 = (int) (field1001 * 65536.0F);
        }
        if (this.field995[arg1] == 0) {
            return 0;
        }
        float var6 = this.method347(arg0, (byte) 8, 0, arg1);
        if (arg2) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        field999[arg1][0] = var6 * -2.0F * (float) Math.cos((double) this.method349(arg1, false, arg0, 0));
        field999[arg1][1] = var6 * var6;
        for (int var8 = 1; var8 < this.field995[arg1]; var8++) {
            float var11 = this.method347(arg0, (byte) 8, var8, arg1);
            float var12 = var11 * -2.0F * (float) Math.cos((double) this.method349(arg1, false, arg0, var8));
            float var13 = var11 * var11;
            field999[arg1][var8 * 2 + 1] = field999[arg1][var8 * 2 - 1] * var13;
            field999[arg1][var8 * 2] = field999[arg1][var8 * 2 - 1] * var12 + field999[arg1][var8 * 2 - 2] * var13;
            for (int var14 = var8 * 2 - 1; var14 >= 2; var14--) {
                field999[arg1][var14] += field999[arg1][var14 - 1] * var12 + field999[arg1][var14 - 2] * var13;
            }
            field999[arg1][1] += field999[arg1][0] * var12 + var13;
            field999[arg1][0] += var12;
        }
        if (arg1 == 0) {
            for (int var9 = 0; var9 < this.field995[0] * 2; var9++) {
                field999[0][var9] *= field1001;
            }
        }
        for (int var10 = 0; var10 < this.field995[arg1] * 2; var10++) {
            field1000[arg1][var10] = (int) (field999[arg1][var10] * 65536.0F);
        }
        return this.field995[arg1] * 2;
    }

    @OriginalMember(owner = "client!KEQJLHXN", name = "a", descriptor = "(ZLLBBVYYXO;LZBHVITZX;)V")
    public final void method351(boolean arg0, class32 arg1, class67 arg2) {
        int var4 = arg1.method369();
        this.field995[0] = var4 >> 4;
        this.field995[1] = var4 & 0xF;
        if (arg0) {
            return;
        }
        if (var4 == 0) {
            this.field998[0] = this.field998[1] = 0;
            return;
        }
        this.field998[0] = arg1.method371();
        this.field998[1] = arg1.method371();
        int var5 = arg1.method369();
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var9 = 0; var9 < this.field995[var6]; var9++) {
                this.field996[var6][0][var9] = arg1.method371();
                this.field997[var6][0][var9] = arg1.method371();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field995[var7]; var8++) {
                if ((var5 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field996[var7][1][var8] = this.field996[var7][0][var8];
                    this.field997[var7][1][var8] = this.field997[var7][0][var8];
                } else {
                    this.field996[var7][1][var8] = arg1.method371();
                    this.field997[var7][1][var8] = arg1.method371();
                }
            }
        }
        if (var5 != 0 || this.field998[1] != this.field998[0]) {
            arg2.method578(arg1, this.field992);
        }
    }

    @OriginalMember(owner = "client!KEQJLHXN", name = "<init>", descriptor = "()V")
    public class28() {
        if (class45.field1317) {
        }
    }
}
