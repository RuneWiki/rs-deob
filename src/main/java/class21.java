import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class21 {

    @OriginalMember(owner = "client!db", name = "e", descriptor = "[[[I")
    private int[][][] field511 = new int[2][2][4];

    @OriginalMember(owner = "client!db", name = "g", descriptor = "[I")
    public int[] field513 = new int[2];

    @OriginalMember(owner = "client!db", name = "d", descriptor = "[[[I")
    private int[][][] field510 = new int[2][2][4];

    @OriginalMember(owner = "client!db", name = "f", descriptor = "[I")
    private int[] field512 = new int[2];

    @OriginalMember(owner = "client!db", name = "c", descriptor = "[[F")
    private static float[][] field509 = new float[2][8];

    @OriginalMember(owner = "client!db", name = "b", descriptor = "[[I")
    public static int[][] field508 = new int[2][8];

    @OriginalMember(owner = "client!db", name = "h", descriptor = "F")
    private static float field514;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IF)I", line = 4)
    public final int method227(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field512[1] - this.field512[0]) * arg1 + (float) this.field512[0];
            float var4 = var3 * 0.0030517578F;
            field514 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field507 = (int) (field514 * 65536.0F);
        }
        if (this.field513[arg0] == 0) {
            return 0;
        }
        float var5 = this.method231(arg0, 0, arg1);
        field509[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method229(arg0, 0, arg1));
        field509[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field513[arg0]; var6++) {
            float var9 = this.method231(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method229(arg0, var6, arg1));
            float var11 = var9 * var9;
            field509[arg0][var6 * 2 + 1] = field509[arg0][var6 * 2 - 1] * var11;
            field509[arg0][var6 * 2] = field509[arg0][var6 * 2 - 1] * var10 + field509[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field509[arg0][var12] += field509[arg0][var12 - 1] * var10 + field509[arg0][var12 - 2] * var11;
            }
            field509[arg0][1] += field509[arg0][0] * var10 + var11;
            field509[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field513[0] * 2; var7++) {
                field509[0][var7] *= field514;
            }
        }
        for (int var8 = 0; var8 < this.field513[arg0] * 2; var8++) {
            field508[arg0][var8] = (int) (field509[arg0][var8] * 65536.0F);
        }
        return this.field513[arg0] * 2;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "()V", line = 68)
    public static void method228() {
        field509 = null;
        field508 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIF)F", line = 74)
    private final float method229(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field511[arg0][1][arg1] - this.field511[arg0][0][arg1]) * arg2 + (float) this.field511[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method232(var5);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lb;Lhd;)V", line = 81)
    public final void method230(class7 arg0, class46 arg1) {
        int var3 = arg0.method96(27023);
        this.field513[0] = var3 >> 4;
        this.field513[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field512[0] = this.field512[1] = 0;
            return;
        }
        this.field512[0] = arg0.method101(2);
        this.field512[1] = arg0.method101(2);
        int var4 = arg0.method96(27023);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field513[var5]; var8++) {
                this.field511[var5][0][var8] = arg0.method101(2);
                this.field510[var5][0][var8] = arg0.method101(2);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field513[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field511[var6][1][var7] = this.field511[var6][0][var7];
                    this.field510[var6][1][var7] = this.field510[var6][0][var7];
                } else {
                    this.field511[var6][1][var7] = arg0.method101(2);
                    this.field510[var6][1][var7] = arg0.method101(2);
                }
            }
        }
        if (var4 != 0 || this.field512[1] != this.field512[0]) {
            arg1.method387(arg0);
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(IIF)F", line = 160)
    private final float method231(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field510[arg0][1][arg1] - this.field510[arg0][0][arg1]) * arg2 + (float) this.field510[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(F)F", line = 173)
    private static final float method232(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }
}
