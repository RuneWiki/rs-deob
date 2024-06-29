import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!STQKONHX")
public class class51 {

    @OriginalMember(owner = "client!STQKONHX", name = "a", descriptor = "I")
    private int field1409 = 16795;

    @OriginalMember(owner = "client!STQKONHX", name = "b", descriptor = "I")
    private int field1410 = -585;

    @OriginalMember(owner = "client!STQKONHX", name = "c", descriptor = "Z")
    private boolean field1411 = true;

    @OriginalMember(owner = "client!STQKONHX", name = "d", descriptor = "[I")
    public int[] field1412 = new int[2];

    @OriginalMember(owner = "client!STQKONHX", name = "e", descriptor = "[[[I")
    public int[][][] field1413 = new int[2][2][4];

    @OriginalMember(owner = "client!STQKONHX", name = "f", descriptor = "[[[I")
    public int[][][] field1414 = new int[2][2][4];

    @OriginalMember(owner = "client!STQKONHX", name = "g", descriptor = "[I")
    public int[] field1415 = new int[2];

    @OriginalMember(owner = "client!STQKONHX", name = "h", descriptor = "[[F")
    public static float[][] field1416 = new float[2][8];

    @OriginalMember(owner = "client!STQKONHX", name = "i", descriptor = "[[I")
    public static int[][] field1417 = new int[2][8];

    @OriginalMember(owner = "client!STQKONHX", name = "j", descriptor = "F")
    public static float field1418;

    @OriginalMember(owner = "client!STQKONHX", name = "k", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!STQKONHX", name = "a", descriptor = "(IFII)F")
    private float method509(int arg0, float arg1, int arg2, int arg3) {
        float var5 = (float) (this.field1414[arg0][1][arg3] - this.field1414[arg0][0][arg3]) * arg1 + (float) this.field1414[arg0][0][arg3];
        if (arg2 != 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        float var7 = var5 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var7 / 20.0F));
    }

    @OriginalMember(owner = "client!STQKONHX", name = "a", descriptor = "(FI)F")
    private float method510(float arg0, int arg1) {
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        float var3 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var3 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!STQKONHX", name = "a", descriptor = "(IIFI)F")
    private float method511(int arg0, int arg1, float arg2, int arg3) {
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        float var5 = (float) (this.field1413[arg3][1][arg0] - this.field1413[arg3][0][arg0]) * arg2 + (float) this.field1413[arg3][0][arg0];
        float var6 = var5 * 1.2207031E-4F;
        return this.method510(var6, 0);
    }

    @OriginalMember(owner = "client!STQKONHX", name = "a", descriptor = "(IFI)I")
    public int method512(int arg0, float arg1, int arg2) {
        if (arg0 == 0) {
            float var4 = (float) (this.field1415[1] - this.field1415[0]) * arg1 + (float) this.field1415[0];
            float var5 = var4 * 0.0030517578F;
            field1418 = (float) Math.pow(0.1D, (double) (var5 / 20.0F));
            field1419 = (int) (field1418 * 65536.0F);
        }
        if (this.field1412[arg0] == 0) {
            return 0;
        }
        float var6 = this.method509(arg0, arg1, 0, 0);
        field1416[arg0][0] = var6 * -2.0F * (float) Math.cos((double) this.method511(0, 0, arg1, arg0));
        field1416[arg0][1] = var6 * var6;
        if (arg2 != 0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        for (int var8 = 1; var8 < this.field1412[arg0]; var8++) {
            float var11 = this.method509(arg0, arg1, 0, var8);
            float var12 = var11 * -2.0F * (float) Math.cos((double) this.method511(var8, 0, arg1, arg0));
            float var13 = var11 * var11;
            field1416[arg0][var8 * 2 + 1] = field1416[arg0][var8 * 2 - 1] * var13;
            field1416[arg0][var8 * 2] = field1416[arg0][var8 * 2 - 1] * var12 + field1416[arg0][var8 * 2 - 2] * var13;
            for (int var14 = var8 * 2 - 1; var14 >= 2; var14--) {
                field1416[arg0][var14] += field1416[arg0][var14 - 1] * var12 + field1416[arg0][var14 - 2] * var13;
            }
            field1416[arg0][1] += field1416[arg0][0] * var12 + var13;
            field1416[arg0][0] += var12;
        }
        if (arg0 == 0) {
            for (int var9 = 0; var9 < this.field1412[0] * 2; var9++) {
                field1416[0][var9] *= field1418;
            }
        }
        for (int var10 = 0; var10 < this.field1412[arg0] * 2; var10++) {
            field1417[arg0][var10] = (int) (field1416[arg0][var10] * 65536.0F);
        }
        return this.field1412[arg0] * 2;
    }

    @OriginalMember(owner = "client!STQKONHX", name = "a", descriptor = "(LBJGBRRBX;LBFQIDHPO;I)V")
    public final void method513(class4 arg0, class3 arg1, int arg2) {
        int var4 = arg1.method54();
        this.field1412[0] = var4 >> 4;
        this.field1412[1] = var4 & 0xF;
        if (arg2 >= 0) {
            this.field1411 = !this.field1411;
        }
        if (var4 == 0) {
            this.field1415[0] = this.field1415[1] = 0;
            return;
        }
        this.field1415[0] = arg1.method56();
        this.field1415[1] = arg1.method56();
        int var5 = arg1.method54();
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var9 = 0; var9 < this.field1412[var6]; var9++) {
                this.field1413[var6][0][var9] = arg1.method56();
                this.field1414[var6][0][var9] = arg1.method56();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1412[var7]; var8++) {
                if ((var5 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1413[var7][1][var8] = this.field1413[var7][0][var8];
                    this.field1414[var7][1][var8] = this.field1414[var7][0][var8];
                } else {
                    this.field1413[var7][1][var8] = arg1.method56();
                    this.field1414[var7][1][var8] = arg1.method56();
                }
            }
        }
        if (var5 != 0 || this.field1415[1] != this.field1415[0]) {
            arg0.method92(arg1, this.field1409);
        }
    }

    @OriginalMember(owner = "client!STQKONHX", name = "<init>", descriptor = "()V")
    public class51() {
        if (class30.field1023) {
        }
    }
}
