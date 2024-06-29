import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public class class23 {

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "[[[I")
    private int[][][] field321 = new int[2][2][4];

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "[[[I")
    private int[][][] field322 = new int[2][2][4];

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "[I")
    private int[] field323 = new int[2];

    @OriginalMember(owner = "client!mp", name = "h", descriptor = "[I")
    public int[] field328 = new int[2];

    @OriginalMember(owner = "client!mp", name = "f", descriptor = "[[I")
    public static int[][] field326 = new int[2][8];

    @OriginalMember(owner = "client!mp", name = "d", descriptor = "[[F")
    private static float[][] field324 = new float[2][8];

    @OriginalMember(owner = "client!mp", name = "g", descriptor = "F")
    private static float field327;

    @OriginalMember(owner = "client!mp", name = "e", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(IF)I", line = 3)
    public final int method243(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field323[1] - this.field323[0]) * arg1 + (float) this.field323[0];
            float var4 = var3 * 0.0030517578F;
            field327 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field325 = (int) (field327 * 65536.0F);
        }
        if (this.field328[arg0] == 0) {
            return 0;
        }
        float var5 = this.method245(arg0, 0, arg1);
        field324[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method244(arg0, 0, arg1));
        field324[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field328[arg0]; var6++) {
            float var9 = this.method245(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method244(arg0, var6, arg1));
            float var11 = var9 * var9;
            field324[arg0][var6 * 2 + 1] = field324[arg0][var6 * 2 - 1] * var11;
            field324[arg0][var6 * 2] = field324[arg0][var6 * 2 - 1] * var10 + field324[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field324[arg0][var12] += field324[arg0][var12 - 1] * var10 + field324[arg0][var12 - 2] * var11;
            }
            field324[arg0][1] += field324[arg0][0] * var10 + var11;
            field324[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field328[0] * 2; var7++) {
                field324[0][var7] *= field327;
            }
        }
        for (int var8 = 0; var8 < this.field328[arg0] * 2; var8++) {
            field326[arg0][var8] = (int) (field324[arg0][var8] * 65536.0F);
        }
        return this.field328[arg0] * 2;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(IIF)F", line = 64)
    private final float method244(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field322[arg0][1][arg1] - this.field322[arg0][0][arg1]) * arg2 + (float) this.field322[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method247(var5);
    }

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "(IIF)F", line = 73)
    private final float method245(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field321[arg0][1][arg1] - this.field321[arg0][0][arg1]) * arg2 + (float) this.field321[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(Lat;Lcp;)V", line = 81)
    public final void method246(class256 arg0, class410 arg1) {
        int var3 = arg0.method1738((byte) 94);
        this.field328[0] = var3 >> 4;
        this.field328[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field323[0] = this.field323[1] = 0;
            return;
        }
        this.field323[0] = arg0.method1767(1930493576);
        this.field323[1] = arg0.method1767(1930493576);
        int var4 = arg0.method1738((byte) -51);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field328[var5]; var8++) {
                this.field322[var5][0][var8] = arg0.method1767(1930493576);
                this.field321[var5][0][var8] = arg0.method1767(1930493576);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field328[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field322[var6][1][var7] = this.field322[var6][0][var7];
                    this.field321[var6][1][var7] = this.field321[var6][0][var7];
                } else {
                    this.field322[var6][1][var7] = arg0.method1767(1930493576);
                    this.field321[var6][1][var7] = arg0.method1767(1930493576);
                }
            }
        }
        if (var4 != 0 || this.field323[1] != this.field323[0]) {
            arg1.method2545(arg0);
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(F)F", line = 151)
    private static final float method247(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "()V", line = 170)
    public static void method248() {
        field324 = null;
        field326 = null;
    }
}
