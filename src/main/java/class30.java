import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class30 {

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "[I")
    private int[] field603 = new int[2];

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "[[[I")
    private int[][][] field604 = new int[2][2][4];

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "[[[I")
    private int[][][] field608 = new int[2][2][4];

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "[I")
    public int[] field610 = new int[2];

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "[[I")
    public static int[][] field605 = new int[2][8];

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "[[F")
    private static float[][] field609 = new float[2][8];

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "F")
    private static float field607;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "()V")
    public static void method279() {
        field609 = null;
        field605 = null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIF)F")
    private final float method280(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field604[arg0][1][arg1] - this.field604[arg0][0][arg1]) * arg2 + (float) this.field604[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method283(var5);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lie;Lah;)V")
    public final void method281(class32 arg0, class265 arg1) {
        int var3 = arg0.method316((byte) -84);
        this.field610[0] = var3 >> 4;
        this.field610[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field603[0] = this.field603[1] = 0;
            return;
        }
        this.field603[0] = arg0.method339(-16777216);
        this.field603[1] = arg0.method339(-16777216);
        int var4 = arg0.method316((byte) 122);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field610[var5]; var8++) {
                this.field604[var5][0][var8] = arg0.method339(-16777216);
                this.field608[var5][0][var8] = arg0.method339(-16777216);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field610[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field604[var6][1][var7] = this.field604[var6][0][var7];
                    this.field608[var6][1][var7] = this.field608[var6][0][var7];
                } else {
                    this.field604[var6][1][var7] = arg0.method339(-16777216);
                    this.field608[var6][1][var7] = arg0.method339(-16777216);
                }
            }
        }
        if (var4 != 0 || this.field603[1] != this.field603[0]) {
            arg1.method1769(arg0);
        }
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIF)F")
    private final float method282(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field608[arg0][1][arg1] - this.field608[arg0][0][arg1]) * arg2 + (float) this.field608[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(F)F")
    private static final float method283(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IF)I")
    public final int method284(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field603[1] - this.field603[0]) * arg1 + (float) this.field603[0];
            float var4 = var3 * 0.0030517578F;
            field607 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field606 = (int) (field607 * 65536.0F);
        }
        if (this.field610[arg0] == 0) {
            return 0;
        }
        float var5 = this.method282(arg0, 0, arg1);
        field609[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method280(arg0, 0, arg1));
        field609[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field610[arg0]; var6++) {
            float var9 = this.method282(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method280(arg0, var6, arg1));
            float var11 = var9 * var9;
            field609[arg0][var6 * 2 + 1] = field609[arg0][var6 * 2 - 1] * var11;
            field609[arg0][var6 * 2] = field609[arg0][var6 * 2 - 1] * var10 + field609[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field609[arg0][var12] += field609[arg0][var12 - 1] * var10 + field609[arg0][var12 - 2] * var11;
            }
            field609[arg0][1] += field609[arg0][0] * var10 + var11;
            field609[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field610[0] * 2; var7++) {
                field609[0][var7] *= field607;
            }
        }
        for (int var8 = 0; var8 < this.field610[arg0] * 2; var8++) {
            field605[arg0][var8] = (int) (field609[arg0][var8] * 65536.0F);
        }
        return this.field610[arg0] * 2;
    }
}
