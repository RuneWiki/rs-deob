import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!SGFGLWZQ")
public class SoundFilter {

    @OriginalMember(owner = "client!SGFGLWZQ", name = "b", descriptor = "Z")
    private boolean field1415 = true;

    @OriginalMember(owner = "client!SGFGLWZQ", name = "c", descriptor = "[I")
    public int[] field1416 = new int[2];

    @OriginalMember(owner = "client!SGFGLWZQ", name = "d", descriptor = "[[[I")
    public int[][][] field1417 = new int[2][2][4];

    @OriginalMember(owner = "client!SGFGLWZQ", name = "e", descriptor = "[[[I")
    public int[][][] field1418 = new int[2][2][4];

    @OriginalMember(owner = "client!SGFGLWZQ", name = "f", descriptor = "[I")
    public int[] field1419 = new int[2];

    @OriginalMember(owner = "client!SGFGLWZQ", name = "g", descriptor = "[[F")
    public static float[][] field1420 = new float[2][8];

    @OriginalMember(owner = "client!SGFGLWZQ", name = "h", descriptor = "[[I")
    public static int[][] field1421 = new int[2][8];

    @OriginalMember(owner = "client!SGFGLWZQ", name = "i", descriptor = "F")
    public static float field1422;

    @OriginalMember(owner = "client!SGFGLWZQ", name = "a", descriptor = "I")
    private int field1414;

    @OriginalMember(owner = "client!SGFGLWZQ", name = "j", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!SGFGLWZQ", name = "a", descriptor = "(IIFI)F")
    private float method465(int arg0, int arg1, float arg2, int arg3) {
        float var5 = (float) (this.field1418[arg0][1][arg3] - this.field1418[arg0][0][arg3]) * arg2 + (float) this.field1418[arg0][0][arg3];
        float var6 = var5 * 0.0015258789F;
        int var7 = 34 / arg1;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var6 / 20.0F));
    }

    @OriginalMember(owner = "client!SGFGLWZQ", name = "a", descriptor = "(FI)F")
    private float method466(float arg0, int arg1) {
        float var3 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        if (arg1 >= 0) {
            this.field1415 = !this.field1415;
        }
        return var3 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!SGFGLWZQ", name = "a", descriptor = "(IIIF)F")
    private float method467(int arg0, int arg1, int arg2, float arg3) {
        if (arg1 != 0) {
            this.field1414 = -370;
        }
        float var5 = (float) (this.field1417[arg2][1][arg0] - this.field1417[arg2][0][arg0]) * arg3 + (float) this.field1417[arg2][0][arg0];
        float var6 = var5 * 1.2207031E-4F;
        return this.method466(var6, -335);
    }

    @OriginalMember(owner = "client!SGFGLWZQ", name = "a", descriptor = "(IZF)I")
    public int method468(int arg0, boolean arg1, float arg2) {
        if (!arg1) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (arg0 == 0) {
            float var5 = (float) (this.field1419[1] - this.field1419[0]) * arg2 + (float) this.field1419[0];
            float var6 = var5 * 0.0030517578F;
            field1422 = (float) Math.pow(0.1D, (double) (var6 / 20.0F));
            field1423 = (int) (field1422 * 65536.0F);
        }
        if (this.field1416[arg0] == 0) {
            return 0;
        }
        float var7 = this.method465(arg0, 849, arg2, 0);
        field1420[arg0][0] = var7 * -2.0F * (float) Math.cos((double) this.method467(0, 0, arg0, arg2));
        field1420[arg0][1] = var7 * var7;
        for (int var8 = 1; var8 < this.field1416[arg0]; var8++) {
            float var11 = this.method465(arg0, 849, arg2, var8);
            float var12 = var11 * -2.0F * (float) Math.cos((double) this.method467(var8, 0, arg0, arg2));
            float var13 = var11 * var11;
            field1420[arg0][var8 * 2 + 1] = field1420[arg0][var8 * 2 - 1] * var13;
            field1420[arg0][var8 * 2] = field1420[arg0][var8 * 2 - 1] * var12 + field1420[arg0][var8 * 2 - 2] * var13;
            for (int var14 = var8 * 2 - 1; var14 >= 2; var14--) {
                field1420[arg0][var14] += field1420[arg0][var14 - 1] * var12 + field1420[arg0][var14 - 2] * var13;
            }
            field1420[arg0][1] += field1420[arg0][0] * var12 + var13;
            field1420[arg0][0] += var12;
        }
        if (arg0 == 0) {
            for (int var9 = 0; var9 < this.field1416[0] * 2; var9++) {
                field1420[0][var9] *= field1422;
            }
        }
        for (int var10 = 0; var10 < this.field1416[arg0] * 2; var10++) {
            field1421[arg0][var10] = (int) (field1420[arg0][var10] * 65536.0F);
        }
        return this.field1416[arg0] * 2;
    }

    @OriginalMember(owner = "client!SGFGLWZQ", name = "a", descriptor = "(ILPFANSVWX;LMFMVIYHT;)V")
    public final void method469(int arg0, SoundEnvelope arg1, Packet arg2) {
        int var4 = arg2.g1();
        this.field1416[0] = var4 >> 4;
        while (arg0 >= 0) {
            for (int var10 = 1; var10 > 0; var10++) {
            }
        }
        this.field1416[1] = var4 & 0xF;
        if (var4 == 0) {
            this.field1419[0] = this.field1419[1] = 0;
            if (Linkable.field1772) {
            }
            return;
        }
        this.field1419[0] = arg2.g2();
        this.field1419[1] = arg2.g2();
        int var5 = arg2.g1();
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var9 = 0; var9 < this.field1416[var6]; var9++) {
                this.field1417[var6][0][var9] = arg2.g2();
                this.field1418[var6][0][var9] = arg2.g2();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field1416[var7]; var8++) {
                if ((var5 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field1417[var7][1][var8] = this.field1417[var7][0][var8];
                    this.field1418[var7][1][var8] = this.field1418[var7][0][var8];
                } else {
                    this.field1417[var7][1][var8] = arg2.g2();
                    this.field1418[var7][1][var8] = arg2.g2();
                }
            }
        }
        if (var5 != 0 || this.field1419[1] != this.field1419[0]) {
            arg1.method442(arg2, 0);
        }
    }
}
