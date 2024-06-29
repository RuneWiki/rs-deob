import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!QPYZEWVW")
public class class43 {

    @OriginalMember(owner = "client!QPYZEWVW", name = "a", descriptor = "I")
    private int field1187 = 9;

    @OriginalMember(owner = "client!QPYZEWVW", name = "b", descriptor = "Z")
    private boolean field1188 = true;

    @OriginalMember(owner = "client!QPYZEWVW", name = "c", descriptor = "I")
    private int field1189 = -160;

    @OriginalMember(owner = "client!QPYZEWVW", name = "d", descriptor = "[I")
    public int[] field1190 = new int[2];

    @OriginalMember(owner = "client!QPYZEWVW", name = "e", descriptor = "[[[I")
    public int[][][] field1191 = new int[2][2][4];

    @OriginalMember(owner = "client!QPYZEWVW", name = "f", descriptor = "[[[I")
    public int[][][] field1192 = new int[2][2][4];

    @OriginalMember(owner = "client!QPYZEWVW", name = "g", descriptor = "[I")
    public int[] field1193 = new int[2];

    @OriginalMember(owner = "client!QPYZEWVW", name = "h", descriptor = "[[F")
    public static float[][] field1194 = new float[2][8];

    @OriginalMember(owner = "client!QPYZEWVW", name = "i", descriptor = "[[I")
    public static int[][] field1195 = new int[2][8];

    @OriginalMember(owner = "client!QPYZEWVW", name = "j", descriptor = "F")
    public static float field1196;

    @OriginalMember(owner = "client!QPYZEWVW", name = "k", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!QPYZEWVW", name = "a", descriptor = "(FIII)F")
    private float method392(float arg0, int arg1, int arg2, int arg3) {
        float var5 = (float) (this.field1192[arg3][1][arg1] - this.field1192[arg3][0][arg1]) * arg0 + (float) this.field1192[arg3][0][arg1];
        if (arg2 != 0) {
            throw new NullPointerException();
        }
        float var6 = var5 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var6 / 20.0F));
    }

    @OriginalMember(owner = "client!QPYZEWVW", name = "a", descriptor = "(FI)F")
    private float method393(float arg0, int arg1) {
        while (arg1 >= 0) {
            this.field1187 = 145;
        }
        float var3 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var3 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!QPYZEWVW", name = "a", descriptor = "(IIIF)F")
    private float method394(int arg0, int arg1, int arg2, float arg3) {
        float var5 = (float) (this.field1191[arg1][1][arg2] - this.field1191[arg1][0][arg2]) * arg3 + (float) this.field1191[arg1][0][arg2];
        float var6 = var5 * 1.2207031E-4F;
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        return this.method393(var6, this.field1189);
    }

    @OriginalMember(owner = "client!QPYZEWVW", name = "a", descriptor = "(IFI)I")
    public int method395(int arg0, float arg1, int arg2) {
        if (arg2 == 0) {
            float var4 = (float) (this.field1193[1] - this.field1193[0]) * arg1 + (float) this.field1193[0];
            float var5 = var4 * 0.0030517578F;
            field1196 = (float) Math.pow(0.1D, (double) (var5 / 20.0F));
            field1197 = (int) (field1196 * 65536.0F);
        }
        if (this.field1190[arg2] == 0) {
            return 0;
        }
        float var6 = this.method392(arg1, 0, 0, arg2);
        while (arg0 >= 0) {
            for (int var14 = 1; var14 > 0; var14++) {
            }
        }
        field1194[arg2][0] = var6 * -2.0F * (float) Math.cos((double) this.method394(-855, arg2, 0, arg1));
        field1194[arg2][1] = var6 * var6;
        for (int var7 = 1; var7 < this.field1190[arg2]; var7++) {
            float var10 = this.method392(arg1, var7, 0, arg2);
            float var11 = var10 * -2.0F * (float) Math.cos((double) this.method394(-855, arg2, var7, arg1));
            float var12 = var10 * var10;
            field1194[arg2][var7 * 2 + 1] = field1194[arg2][var7 * 2 - 1] * var12;
            field1194[arg2][var7 * 2] = field1194[arg2][var7 * 2 - 1] * var11 + field1194[arg2][var7 * 2 - 2] * var12;
            for (int var13 = var7 * 2 - 1; var13 >= 2; var13--) {
                field1194[arg2][var13] += field1194[arg2][var13 - 1] * var11 + field1194[arg2][var13 - 2] * var12;
            }
            field1194[arg2][1] += field1194[arg2][0] * var11 + var12;
            field1194[arg2][0] += var11;
        }
        if (arg2 == 0) {
            for (int var8 = 0; var8 < this.field1190[0] * 2; var8++) {
                field1194[0][var8] *= field1196;
            }
        }
        for (int var9 = 0; var9 < this.field1190[arg2] * 2; var9++) {
            field1195[arg2][var9] = (int) (field1194[arg2][var9] * 65536.0F);
        }
        return this.field1190[arg2] * 2;
    }

    @OriginalMember(owner = "client!QPYZEWVW", name = "a", descriptor = "(LLSSFLBMP;LWNCFPLWV;Z)V")
    public final void method396(class32 arg0, class63 arg1, boolean arg2) {
        int var4 = arg1.method502();
        this.field1190[0] = var4 >> 4;
        if (!arg2) {
            return;
        }
        this.field1190[1] = var4 & 0xF;
        if (var4 == 0) {
            this.field1193[0] = this.field1193[1] = 0;
            return;
        }
        this.field1193[0] = arg1.method504();
        this.field1193[1] = arg1.method504();
        int var5 = arg1.method502();
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var9 = 0; var9 < this.field1190[var6]; var9++) {
                this.field1191[var6][0][var9] = arg1.method504();
                this.field1192[var6][0][var9] = arg1.method504();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1190[var7]; var8++) {
                if ((var5 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1191[var7][1][var8] = this.field1191[var7][0][var8];
                    this.field1192[var7][1][var8] = this.field1192[var7][0][var8];
                } else {
                    this.field1191[var7][1][var8] = arg1.method504();
                    this.field1192[var7][1][var8] = arg1.method504();
                }
            }
        }
        if (var5 != 0 || this.field1193[1] != this.field1193[0]) {
            arg0.method324(arg1, this.field1188);
        }
    }

    @OriginalMember(owner = "client!QPYZEWVW", name = "<init>", descriptor = "()V")
    public class43() {
        if (class33.field960) {
        }
    }
}
