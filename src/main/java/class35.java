import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class35 {

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "[[[I")
    private int[][][] field512 = new int[2][2][4];

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "[I")
    private int[] field513 = new int[2];

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "[[[I")
    private int[][][] field511 = new int[2][2][4];

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "[I")
    public int[] field514 = new int[2];

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "[[F")
    private static float[][] field516 = new float[2][8];

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "[[I")
    public static int[][] field509 = new int[2][8];

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "F")
    private static float field510;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IF)I", line = 4)
    public final int method233(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field513[1] - this.field513[0]) * arg1 + (float) this.field513[0];
            float var4 = var3 * 0.0030517578F;
            field510 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field515 = (int) (field510 * 65536.0F);
        }
        if (this.field514[arg0] == 0) {
            return 0;
        }
        float var5 = this.method235(arg0, 0, arg1);
        field516[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method234(arg0, 0, arg1));
        field516[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field514[arg0]; var6++) {
            float var7 = this.method235(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method234(arg0, var6, arg1));
            float var9 = var7 * var7;
            field516[arg0][var6 * 2 + 1] = field516[arg0][var6 * 2 - 1] * var9;
            field516[arg0][var6 * 2] = field516[arg0][var6 * 2 - 1] * var8 + field516[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                field516[arg0][var10] += field516[arg0][var10 - 1] * var8 + field516[arg0][var10 - 2] * var9;
            }
            field516[arg0][1] += field516[arg0][0] * var8 + var9;
            field516[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.field514[0] * 2; var11++) {
                field516[0][var11] *= field510;
            }
        }
        for (int var12 = 0; var12 < this.field514[arg0] * 2; var12++) {
            field509[arg0][var12] = (int) (field516[arg0][var12] * 65536.0F);
        }
        return this.field514[arg0] * 2;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIF)F", line = 67)
    private final float method234(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field512[arg0][1][arg1] - this.field512[arg0][0][arg1]) * arg2 + (float) this.field512[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method236(var5);
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(IIF)F", line = 79)
    private final float method235(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field511[arg0][1][arg1] - this.field511[arg0][0][arg1]) * arg2 + (float) this.field511[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(F)F", line = 87)
    private static final float method236(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "()V", line = 102)
    public static void method237() {
        field516 = (float[][]) null;
        field509 = (int[][]) null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ls;Lcf;)V", line = 116)
    public final void method238(class170 arg0, class66 arg1) {
        int var3 = arg0.method1221(103);
        this.field514[0] = var3 >> 4;
        this.field514[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field513[0] = this.field513[1] = 0;
            return;
        }
        this.field513[0] = arg0.method1214(-18254);
        this.field513[1] = arg0.method1214(-18254);
        int var4 = arg0.method1221(85);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field514[var5]; var6++) {
                this.field512[var5][0][var6] = arg0.method1214(-18254);
                this.field511[var5][0][var6] = arg0.method1214(-18254);
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.field514[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.field512[var7][1][var8] = this.field512[var7][0][var8];
                    this.field511[var7][1][var8] = this.field511[var7][0][var8];
                } else {
                    this.field512[var7][1][var8] = arg0.method1214(-18254);
                    this.field511[var7][1][var8] = arg0.method1214(-18254);
                }
            }
        }
        if (var4 != 0 || this.field513[1] != this.field513[0]) {
            arg1.method545(arg0);
        }
    }
}
