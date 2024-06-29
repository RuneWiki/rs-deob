import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class30 {

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "[I")
    public int[] field514 = new int[2];

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "[[[I")
    private int[][][] field512 = new int[2][2][4];

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "[[[I")
    private int[][][] field510 = new int[2][2][4];

    @OriginalMember(owner = "client!nl", name = "h", descriptor = "[I")
    private int[] field517 = new int[2];

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "[[F")
    private static float[][] field511 = new float[2][8];

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "[[I")
    public static int[][] field515 = new int[2][8];

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "F")
    private static float field513;

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lwa;Lff;)V", line = 4)
    public final void method239(class82 arg0, class52 arg1) {
        int var3 = arg0.method642((byte) -112);
        this.field514[0] = var3 >> 4;
        this.field514[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field517[0] = this.field517[1] = 0;
            return;
        }
        this.field517[0] = arg0.method576(1);
        this.field517[1] = arg0.method576(1);
        int var4 = arg0.method642((byte) -83);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field514[var5]; var6++) {
                this.field510[var5][0][var6] = arg0.method576(1);
                this.field512[var5][0][var6] = arg0.method576(1);
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field514[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field510[var7][1][var8] = this.field510[var7][0][var8];
                    this.field512[var7][1][var8] = this.field512[var7][0][var8];
                } else {
                    this.field510[var7][1][var8] = arg0.method576(1);
                    this.field512[var7][1][var8] = arg0.method576(1);
                }
            }
        }
        if (var4 != 0 || this.field517[1] != this.field517[0]) {
            arg1.method381(arg0);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(F)F", line = 73)
    private static final float method240(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IF)I", line = 97)
    public final int method241(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field517[1] - this.field517[0]) * arg1 + (float) this.field517[0];
            float var4 = var3 * 0.0030517578F;
            field513 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field516 = (int) (field513 * 65536.0F);
        }
        if (this.field514[arg0] == 0) {
            return 0;
        }
        float var5 = this.method243(arg0, 0, arg1);
        field511[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method244(arg0, 0, arg1));
        field511[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field514[arg0]; var6++) {
            float var7 = this.method243(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method244(arg0, var6, arg1));
            float var9 = var7 * var7;
            field511[arg0][var6 * 2 + 1] = field511[arg0][var6 * 2 - 1] * var9;
            field511[arg0][var6 * 2] = field511[arg0][var6 * 2 - 1] * var8 + field511[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field511[arg0][var10] += field511[arg0][var10 - 1] * var8 + field511[arg0][var10 - 2] * var9;
            }
            field511[arg0][1] += field511[arg0][0] * var8 + var9;
            field511[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field514[0] * 2; var11++) {
                field511[0][var11] *= field513;
            }
        }
        for (int var12 = 0; var12 < this.field514[arg0] * 2; var12++) {
            field515[arg0][var12] = (int) (field511[arg0][var12] * 65536.0F);
        }
        return this.field514[arg0] * 2;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "()V", line = 157)
    public static void method242() {
        field511 = (float[][]) null;
        field515 = (int[][]) null;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIF)F", line = 162)
    private final float method243(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field512[arg0][1][arg1] - this.field512[arg0][0][arg1]) * arg2 + (float) this.field512[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(IIF)F", line = 169)
    private final float method244(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field510[arg0][1][arg1] - this.field510[arg0][0][arg1]) * arg2 + (float) this.field510[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method240(var5);
    }
}
