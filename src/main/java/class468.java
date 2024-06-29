import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class468 {

    @OriginalMember(owner = "client!os", name = "a", descriptor = "[[[I")
    private int[][][] field6330 = new int[2][2][4];

    @OriginalMember(owner = "client!os", name = "d", descriptor = "[[[I")
    private int[][][] field6333 = new int[2][2][4];

    @OriginalMember(owner = "client!os", name = "h", descriptor = "[I")
    private int[] field6337 = new int[2];

    @OriginalMember(owner = "client!os", name = "b", descriptor = "[I")
    public int[] field6331 = new int[2];

    @OriginalMember(owner = "client!os", name = "c", descriptor = "[[F")
    private static float[][] field6332 = new float[2][8];

    @OriginalMember(owner = "client!os", name = "f", descriptor = "[[I")
    public static int[][] field6335 = new int[2][8];

    @OriginalMember(owner = "client!os", name = "g", descriptor = "F")
    private static float field6336;

    @OriginalMember(owner = "client!os", name = "e", descriptor = "I")
    public static int field6334;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Lfca;Lmt;)V")
    public final void method2689(class93 arg0, class419 arg1) {
        int var3 = arg0.method793((byte) 121);
        this.field6331[0] = var3 >> 4;
        this.field6331[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field6337[0] = this.field6337[1] = 0;
            return;
        }
        this.field6337[0] = arg0.method763(74);
        this.field6337[1] = arg0.method763(-63);
        int var4 = arg0.method793((byte) 14);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field6331[var5]; var8++) {
                this.field6333[var5][0][var8] = arg0.method763(-111);
                this.field6330[var5][0][var8] = arg0.method763(-45);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field6331[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field6333[var6][1][var7] = this.field6333[var6][0][var7];
                    this.field6330[var6][1][var7] = this.field6330[var6][0][var7];
                } else {
                    this.field6333[var6][1][var7] = arg0.method763(113);
                    this.field6330[var6][1][var7] = arg0.method763(109);
                }
            }
        }
        if (var4 != 0 || this.field6337[1] != this.field6337[0]) {
            arg1.method2464(arg0);
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IIF)F")
    private final float method2690(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field6330[arg0][1][arg1] - this.field6330[arg0][0][arg1]) * arg2 + (float) this.field6330[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "()V")
    public static void method2691() {
        field6332 = null;
        field6335 = null;
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(IIF)F")
    private final float method2692(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field6333[arg0][1][arg1] - this.field6333[arg0][0][arg1]) * arg2 + (float) this.field6333[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method2693(var5);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(F)F")
    private static final float method2693(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IF)I")
    public final int method2694(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field6337[1] - this.field6337[0]) * arg1 + (float) this.field6337[0];
            float var4 = var3 * 0.0030517578F;
            field6336 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field6334 = (int) (field6336 * 65536.0F);
        }
        if (this.field6331[arg0] == 0) {
            return 0;
        }
        float var5 = this.method2690(arg0, 0, arg1);
        field6332[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method2692(arg0, 0, arg1));
        field6332[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field6331[arg0]; var6++) {
            float var9 = this.method2690(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method2692(arg0, var6, arg1));
            float var11 = var9 * var9;
            field6332[arg0][var6 * 2 + 1] = field6332[arg0][var6 * 2 - 1] * var11;
            field6332[arg0][var6 * 2] = field6332[arg0][var6 * 2 - 1] * var10 + field6332[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field6332[arg0][var12] += field6332[arg0][var12 - 1] * var10 + field6332[arg0][var12 - 2] * var11;
            }
            field6332[arg0][1] += field6332[arg0][0] * var10 + var11;
            field6332[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field6331[0] * 2; var7++) {
                field6332[0][var7] *= field6336;
            }
        }
        for (int var8 = 0; var8 < this.field6331[arg0] * 2; var8++) {
            field6335[arg0][var8] = (int) (field6332[arg0][var8] * 65536.0F);
        }
        return this.field6331[arg0] * 2;
    }
}
