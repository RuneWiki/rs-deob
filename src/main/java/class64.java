import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!XSKZRAYI")
public class class64 {

    @OriginalMember(owner = "client!XSKZRAYI", name = "a", descriptor = "Z")
    private boolean field1573 = true;

    @OriginalMember(owner = "client!XSKZRAYI", name = "b", descriptor = "I")
    private int field1574 = 635;

    @OriginalMember(owner = "client!XSKZRAYI", name = "d", descriptor = "[I")
    public int[] field1576 = new int[2];

    @OriginalMember(owner = "client!XSKZRAYI", name = "e", descriptor = "[[[I")
    public int[][][] field1577 = new int[2][2][4];

    @OriginalMember(owner = "client!XSKZRAYI", name = "f", descriptor = "[[[I")
    public int[][][] field1578 = new int[2][2][4];

    @OriginalMember(owner = "client!XSKZRAYI", name = "g", descriptor = "[I")
    public int[] field1579 = new int[2];

    @OriginalMember(owner = "client!XSKZRAYI", name = "h", descriptor = "[[F")
    public static float[][] field1580 = new float[2][8];

    @OriginalMember(owner = "client!XSKZRAYI", name = "i", descriptor = "[[I")
    public static int[][] field1581 = new int[2][8];

    @OriginalMember(owner = "client!XSKZRAYI", name = "j", descriptor = "F")
    public static float field1582;

    @OriginalMember(owner = "client!XSKZRAYI", name = "c", descriptor = "I")
    private int field1575;

    @OriginalMember(owner = "client!XSKZRAYI", name = "k", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!XSKZRAYI", name = "a", descriptor = "(FIBI)F")
    private float method531(float arg0, int arg1, byte arg2, int arg3) {
        if (arg2 == 2) {
            boolean var5 = false;
        } else {
            this.field1575 = 328;
        }
        float var6 = (float) (this.field1578[arg1][1][arg3] - this.field1578[arg1][0][arg3]) * arg0 + (float) this.field1578[arg1][0][arg3];
        float var7 = var6 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var7 / 20.0F));
    }

    @OriginalMember(owner = "client!XSKZRAYI", name = "a", descriptor = "(BF)F")
    private float method532(byte arg0, float arg1) {
        if (arg0 != 8) {
            throw new NullPointerException();
        }
        boolean var3 = false;
        float var4 = (float) Math.pow(2.0D, (double) arg1) * 32.703197F;
        return var4 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!XSKZRAYI", name = "a", descriptor = "(IFII)F")
    private float method533(int arg0, float arg1, int arg2, int arg3) {
        float var5 = (float) (this.field1577[arg0][1][arg2] - this.field1577[arg0][0][arg2]) * arg1 + (float) this.field1577[arg0][0][arg2];
        float var6 = var5 * 1.2207031E-4F;
        if (arg3 != 0) {
            this.field1573 = !this.field1573;
        }
        return this.method532((byte) 8, var6);
    }

    @OriginalMember(owner = "client!XSKZRAYI", name = "a", descriptor = "(BIF)I")
    public int method534(byte arg0, int arg1, float arg2) {
        if (arg1 == 0) {
            float var4 = (float) (this.field1579[1] - this.field1579[0]) * arg2 + (float) this.field1579[0];
            float var5 = var4 * 0.0030517578F;
            field1582 = (float) Math.pow(0.1D, (double) (var5 / 20.0F));
            field1583 = (int) (field1582 * 65536.0F);
        }
        if (this.field1576[arg1] == 0) {
            return 0;
        }
        float var6 = this.method531(arg2, arg1, (byte) 2, 0);
        field1580[arg1][0] = var6 * -2.0F * (float) Math.cos((double) this.method533(arg1, arg2, 0, 0));
        if (arg0 != 2) {
            return 2;
        }
        field1580[arg1][1] = var6 * var6;
        for (int var7 = 1; var7 < this.field1576[arg1]; var7++) {
            float var10 = this.method531(arg2, arg1, (byte) 2, var7);
            float var11 = var10 * -2.0F * (float) Math.cos((double) this.method533(arg1, arg2, var7, 0));
            float var12 = var10 * var10;
            field1580[arg1][var7 * 2 + 1] = field1580[arg1][var7 * 2 - 1] * var12;
            field1580[arg1][var7 * 2] = field1580[arg1][var7 * 2 - 1] * var11 + field1580[arg1][var7 * 2 - 2] * var12;
            for (int var13 = var7 * 2 - 1; var13 >= 2; var13--) {
                field1580[arg1][var13] += field1580[arg1][var13 - 1] * var11 + field1580[arg1][var13 - 2] * var12;
            }
            field1580[arg1][1] += field1580[arg1][0] * var11 + var12;
            field1580[arg1][0] += var11;
        }
        if (arg1 == 0) {
            for (int var8 = 0; var8 < this.field1576[0] * 2; var8++) {
                field1580[0][var8] *= field1582;
            }
        }
        for (int var9 = 0; var9 < this.field1576[arg1] * 2; var9++) {
            field1581[arg1][var9] = (int) (field1580[arg1][var9] * 65536.0F);
        }
        return this.field1576[arg1] * 2;
    }

    @OriginalMember(owner = "client!XSKZRAYI", name = "a", descriptor = "(LUHTSXKVU;ILRSWRPCHR;)V")
    public final void method535(class56 arg0, int arg1, class50 arg2) {
        int var4 = arg2.method388();
        this.field1576[0] = var4 >> 4;
        this.field1576[1] = var4 & 0xF;
        int var5 = 61 / arg1;
        if (var4 == 0) {
            this.field1579[0] = this.field1579[1] = 0;
            if (class8.field113) {
            }
            return;
        }
        this.field1579[0] = arg2.method390();
        this.field1579[1] = arg2.method390();
        int var6 = arg2.method388();
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var10 = 0; var10 < this.field1576[var7]; var10++) {
                this.field1577[var7][0][var10] = arg2.method390();
                this.field1578[var7][0][var10] = arg2.method390();
            }
        }
        for (int var8 = 0; var8 < 2; var8++) {
            for (int var9 = 0; var9 < this.field1576[var8]; var9++) {
                if ((var6 & 0x1 << var8 * 4 << var9) == 0) {
                    this.field1577[var8][1][var9] = this.field1577[var8][0][var9];
                    this.field1578[var8][1][var9] = this.field1578[var8][0][var9];
                } else {
                    this.field1577[var8][1][var9] = arg2.method390();
                    this.field1578[var8][1][var9] = arg2.method390();
                }
            }
        }
        if (var6 != 0 || this.field1579[1] != this.field1579[0]) {
            arg0.method446(arg2, -7641);
        }
    }
}
