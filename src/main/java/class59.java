import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!WSKKAWXJ")
public class class59 {

    @OriginalMember(owner = "client!WSKKAWXJ", name = "a", descriptor = "Z")
    private boolean field1628 = false;

    @OriginalMember(owner = "client!WSKKAWXJ", name = "b", descriptor = "[I")
    public int[] field1629 = new int[2];

    @OriginalMember(owner = "client!WSKKAWXJ", name = "c", descriptor = "[[[I")
    public int[][][] field1630 = new int[2][2][4];

    @OriginalMember(owner = "client!WSKKAWXJ", name = "d", descriptor = "[[[I")
    public int[][][] field1631 = new int[2][2][4];

    @OriginalMember(owner = "client!WSKKAWXJ", name = "e", descriptor = "[I")
    public int[] field1632 = new int[2];

    @OriginalMember(owner = "client!WSKKAWXJ", name = "f", descriptor = "[[F")
    public static float[][] field1633 = new float[2][8];

    @OriginalMember(owner = "client!WSKKAWXJ", name = "g", descriptor = "[[I")
    public static int[][] field1634 = new int[2][8];

    @OriginalMember(owner = "client!WSKKAWXJ", name = "h", descriptor = "F")
    public static float field1635;

    @OriginalMember(owner = "client!WSKKAWXJ", name = "i", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!WSKKAWXJ", name = "a", descriptor = "(FIII)F")
    private float method553(float arg0, int arg1, int arg2, int arg3) {
        float var5 = (float) (this.field1631[arg3][1][arg1] - this.field1631[arg3][0][arg1]) * arg0 + (float) this.field1631[arg3][0][arg1];
        if (arg2 != -15313) {
            throw new NullPointerException();
        }
        float var6 = var5 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var6 / 20.0F));
    }

    @OriginalMember(owner = "client!WSKKAWXJ", name = "a", descriptor = "(BF)F")
    private float method554(byte arg0, float arg1) {
        float var3 = (float) Math.pow(2.0D, (double) arg1) * 32.703197F;
        if (arg0 != 85) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        return var3 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!WSKKAWXJ", name = "a", descriptor = "(IIFI)F")
    private float method555(int arg0, int arg1, float arg2, int arg3) {
        if (arg3 != 15950) {
            this.field1628 = !this.field1628;
        }
        float var5 = (float) (this.field1630[arg0][1][arg1] - this.field1630[arg0][0][arg1]) * arg2 + (float) this.field1630[arg0][0][arg1];
        float var6 = var5 * 1.2207031E-4F;
        return this.method554((byte) 85, var6);
    }

    @OriginalMember(owner = "client!WSKKAWXJ", name = "a", descriptor = "(FIZ)I")
    public int method556(float arg0, int arg1, boolean arg2) {
        if (arg1 == 0) {
            float var4 = (float) (this.field1632[1] - this.field1632[0]) * arg0 + (float) this.field1632[0];
            float var5 = var4 * 0.0030517578F;
            field1635 = (float) Math.pow(0.1D, (double) (var5 / 20.0F));
            field1636 = (int) (field1635 * 65536.0F);
        }
        if (this.field1629[arg1] == 0) {
            return 0;
        }
        float var6 = this.method553(arg0, 0, -15313, arg1);
        field1633[arg1][0] = var6 * -2.0F * (float) Math.cos((double) this.method555(arg1, 0, arg0, 15950));
        field1633[arg1][1] = var6 * var6;
        for (int var7 = 1; var7 < this.field1629[arg1]; var7++) {
            float var11 = this.method553(arg0, var7, -15313, arg1);
            float var12 = var11 * -2.0F * (float) Math.cos((double) this.method555(arg1, var7, arg0, 15950));
            float var13 = var11 * var11;
            field1633[arg1][var7 * 2 + 1] = field1633[arg1][var7 * 2 - 1] * var13;
            field1633[arg1][var7 * 2] = field1633[arg1][var7 * 2 - 1] * var12 + field1633[arg1][var7 * 2 - 2] * var13;
            for (int var14 = var7 * 2 - 1; var14 >= 2; var14--) {
                field1633[arg1][var14] += field1633[arg1][var14 - 1] * var12 + field1633[arg1][var14 - 2] * var13;
            }
            field1633[arg1][1] += field1633[arg1][0] * var12 + var13;
            field1633[arg1][0] += var12;
        }
        if (arg2) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        if (arg1 == 0) {
            for (int var9 = 0; var9 < this.field1629[0] * 2; var9++) {
                field1633[0][var9] *= field1635;
            }
        }
        for (int var10 = 0; var10 < this.field1629[arg1] * 2; var10++) {
            field1634[arg1][var10] = (int) (field1633[arg1][var10] * 65536.0F);
        }
        return this.field1629[arg1] * 2;
    }

    @OriginalMember(owner = "client!WSKKAWXJ", name = "a", descriptor = "(LWBEWPIXO;LGTUIGVXS;I)V")
    public final void method557(class58 arg0, class25 arg1, int arg2) {
        int var4 = arg0.method515();
        this.field1629[0] = var4 >> 4;
        if (arg2 != 6) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        this.field1629[1] = var4 & 0xF;
        if (var4 == 0) {
            this.field1632[0] = this.field1632[1] = 0;
            if (class7.field142) {
            }
            return;
        }
        this.field1632[0] = arg0.method517();
        this.field1632[1] = arg0.method517();
        int var6 = arg0.method515();
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var10 = 0; var10 < this.field1629[var7]; var10++) {
                this.field1630[var7][0][var10] = arg0.method517();
                this.field1631[var7][0][var10] = arg0.method517();
            }
        }
        for (int var8 = 0; var8 < 2; var8++) {
            for (int var9 = 0; var9 < this.field1629[var8]; var9++) {
                if ((var6 & 0x1 << var8 * 4 << var9) == 0) {
                    this.field1630[var8][1][var9] = this.field1630[var8][0][var9];
                    this.field1631[var8][1][var9] = this.field1631[var8][0][var9];
                } else {
                    this.field1630[var8][1][var9] = arg0.method517();
                    this.field1631[var8][1][var9] = arg0.method517();
                }
            }
        }
        if (var6 != 0 || this.field1632[1] != this.field1632[0]) {
            arg1.method270(arg0, -895);
        }
    }
}
