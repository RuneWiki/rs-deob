import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class7 {

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "[I")
    public int[] field95 = new int[2];

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "[[[I")
    private int[][][] field98 = new int[2][2][4];

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "[[[I")
    private int[][][] field96 = new int[2][2][4];

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "[I")
    private int[] field101 = new int[2];

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "[[I")
    public static int[][] field99 = new int[2][8];

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "[[F")
    private static float[][] field97 = new float[2][8];

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "F")
    private static float field94;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
    public static int field100;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IF)I")
    public final int method39(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field101[1] - this.field101[0]) * arg1 + (float) this.field101[0];
            float var4 = var3 * 0.0030517578F;
            field94 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field100 = (int) (field94 * 65536.0F);
        }
        if (this.field95[arg0] == 0) {
            return 0;
        }
        float var5 = this.method41(arg0, 0, arg1);
        field97[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method43(arg0, 0, arg1));
        field97[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field95[arg0]; var6++) {
            float var9 = this.method41(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method43(arg0, var6, arg1));
            float var11 = var9 * var9;
            field97[arg0][var6 * 2 + 1] = field97[arg0][var6 * 2 - 1] * var11;
            field97[arg0][var6 * 2] = field97[arg0][var6 * 2 - 1] * var10 + field97[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field97[arg0][var12] += field97[arg0][var12 - 1] * var10 + field97[arg0][var12 - 2] * var11;
            }
            field97[arg0][1] += field97[arg0][0] * var10 + var11;
            field97[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field95[0] * 2; var7++) {
                field97[0][var7] *= field94;
            }
        }
        for (int var8 = 0; var8 < this.field95[arg0] * 2; var8++) {
            field99[arg0][var8] = (int) (field97[arg0][var8] * 65536.0F);
        }
        return this.field95[arg0] * 2;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "()V")
    public static void method40() {
        field97 = null;
        field99 = null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIF)F")
    private final float method41(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field96[arg0][1][arg1] - this.field96[arg0][0][arg1]) * arg2 + (float) this.field96[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Laa;Lkh;)V")
    public final void method42(class8 arg0, class12 arg1) {
        int var3 = arg0.method63((byte) 81);
        this.field95[0] = var3 >> 4;
        this.field95[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field101[0] = this.field101[1] = 0;
            return;
        }
        this.field101[0] = arg0.method65((byte) 125);
        this.field101[1] = arg0.method65((byte) 118);
        int var4 = arg0.method63((byte) 79);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field95[var5]; var8++) {
                this.field98[var5][0][var8] = arg0.method65((byte) 115);
                this.field96[var5][0][var8] = arg0.method65((byte) 110);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field95[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field98[var6][1][var7] = this.field98[var6][0][var7];
                    this.field96[var6][1][var7] = this.field96[var6][0][var7];
                } else {
                    this.field98[var6][1][var7] = arg0.method65((byte) 125);
                    this.field96[var6][1][var7] = arg0.method65((byte) 120);
                }
            }
        }
        if (var4 != 0 || this.field101[1] != this.field101[0]) {
            arg1.method115(arg0);
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(IIF)F")
    private final float method43(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field98[arg0][1][arg1] - this.field98[arg0][0][arg1]) * arg2 + (float) this.field98[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method44(var5);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(F)F")
    private static final float method44(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }
}
