import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!PTIFANAY")
public class class42 {

    @OriginalMember(owner = "client!PTIFANAY", name = "a", descriptor = "B")
    private byte field1152 = 28;

    @OriginalMember(owner = "client!PTIFANAY", name = "b", descriptor = "Z")
    private boolean field1153 = false;

    @OriginalMember(owner = "client!PTIFANAY", name = "c", descriptor = "[I")
    public int[] field1154 = new int[2];

    @OriginalMember(owner = "client!PTIFANAY", name = "d", descriptor = "[[[I")
    public int[][][] field1155 = new int[2][2][4];

    @OriginalMember(owner = "client!PTIFANAY", name = "e", descriptor = "[[[I")
    public int[][][] field1156 = new int[2][2][4];

    @OriginalMember(owner = "client!PTIFANAY", name = "f", descriptor = "[I")
    public int[] field1157 = new int[2];

    @OriginalMember(owner = "client!PTIFANAY", name = "g", descriptor = "[[F")
    public static float[][] field1158 = new float[2][8];

    @OriginalMember(owner = "client!PTIFANAY", name = "h", descriptor = "[[I")
    public static int[][] field1159 = new int[2][8];

    @OriginalMember(owner = "client!PTIFANAY", name = "i", descriptor = "F")
    public static float field1160;

    @OriginalMember(owner = "client!PTIFANAY", name = "j", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!PTIFANAY", name = "a", descriptor = "(IIIF)F")
    private float method431(int arg0, int arg1, int arg2, float arg3) {
        float var5 = (float) (this.field1156[arg2][1][arg1] - this.field1156[arg2][0][arg1]) * arg3 + (float) this.field1156[arg2][0][arg1];
        float var6 = var5 * 0.0015258789F;
        int var7 = 52 / arg0;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var6 / 20.0F));
    }

    @OriginalMember(owner = "client!PTIFANAY", name = "a", descriptor = "(IF)F")
    private float method432(int arg0, float arg1) {
        float var3 = (float) Math.pow(2.0D, (double) arg1) * 32.703197F;
        if (arg0 < 7 || arg0 > 7) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        return var3 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!PTIFANAY", name = "b", descriptor = "(IIIF)F")
    private float method433(int arg0, int arg1, int arg2, float arg3) {
        float var5 = (float) (this.field1155[arg2][1][arg1] - this.field1155[arg2][0][arg1]) * arg3 + (float) this.field1155[arg2][0][arg1];
        float var6 = var5 * 1.2207031E-4F;
        if (arg0 < 3 || arg0 > 3) {
            throw new NullPointerException();
        }
        return this.method432(7, var6);
    }

    @OriginalMember(owner = "client!PTIFANAY", name = "a", descriptor = "(IFI)I")
    public int method434(int arg0, float arg1, int arg2) {
        int var4 = 57 / arg0;
        if (arg2 == 0) {
            float var5 = (float) (this.field1157[1] - this.field1157[0]) * arg1 + (float) this.field1157[0];
            float var6 = var5 * 0.0030517578F;
            field1160 = (float) Math.pow(0.1D, (double) (var6 / 20.0F));
            field1161 = (int) (field1160 * 65536.0F);
        }
        if (this.field1154[arg2] == 0) {
            return 0;
        }
        float var7 = this.method431(718, 0, arg2, arg1);
        field1158[arg2][0] = var7 * -2.0F * (float) Math.cos((double) this.method433(3, 0, arg2, arg1));
        field1158[arg2][1] = var7 * var7;
        for (int var8 = 1; var8 < this.field1154[arg2]; var8++) {
            float var11 = this.method431(718, var8, arg2, arg1);
            float var12 = var11 * -2.0F * (float) Math.cos((double) this.method433(3, var8, arg2, arg1));
            float var13 = var11 * var11;
            field1158[arg2][var8 * 2 + 1] = field1158[arg2][var8 * 2 - 1] * var13;
            field1158[arg2][var8 * 2] = field1158[arg2][var8 * 2 - 1] * var12 + field1158[arg2][var8 * 2 - 2] * var13;
            for (int var14 = var8 * 2 - 1; var14 >= 2; var14--) {
                field1158[arg2][var14] += field1158[arg2][var14 - 1] * var12 + field1158[arg2][var14 - 2] * var13;
            }
            field1158[arg2][1] += field1158[arg2][0] * var12 + var13;
            field1158[arg2][0] += var12;
        }
        if (arg2 == 0) {
            for (int var9 = 0; var9 < this.field1154[0] * 2; var9++) {
                field1158[0][var9] *= field1160;
            }
        }
        for (int var10 = 0; var10 < this.field1154[arg2] * 2; var10++) {
            field1159[arg2][var10] = (int) (field1158[arg2][var10] * 65536.0F);
        }
        return this.field1154[arg2] * 2;
    }

    @OriginalMember(owner = "client!PTIFANAY", name = "a", descriptor = "(BLBSNPYLEV;LHCHPPCNY;)V")
    public final void method435(byte arg0, class7 arg1, class20 arg2) {
        int var4 = arg1.method47();
        this.field1154[0] = var4 >> 4;
        if (this.field1152 != arg0) {
            this.field1153 = !this.field1153;
        }
        this.field1154[1] = var4 & 0xF;
        if (var4 == 0) {
            this.field1157[0] = this.field1157[1] = 0;
            if (class56.field1535) {
            }
            return;
        }
        this.field1157[0] = arg1.method49();
        this.field1157[1] = arg1.method49();
        int var5 = arg1.method47();
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var9 = 0; var9 < this.field1154[var6]; var9++) {
                this.field1155[var6][0][var9] = arg1.method49();
                this.field1156[var6][0][var9] = arg1.method49();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1154[var7]; var8++) {
                if ((var5 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1155[var7][1][var8] = this.field1155[var7][0][var8];
                    this.field1156[var7][1][var8] = this.field1156[var7][0][var8];
                } else {
                    this.field1155[var7][1][var8] = arg1.method49();
                    this.field1156[var7][1][var8] = arg1.method49();
                }
            }
        }
        if (var5 != 0 || this.field1157[1] != this.field1157[0]) {
            arg2.method317(arg1, 779);
        }
    }
}
