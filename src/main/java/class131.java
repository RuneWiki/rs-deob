import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class131 {

    @OriginalMember(owner = "client!t", name = "b", descriptor = "[I")
    public int[] field3111 = new int[2];

    @OriginalMember(owner = "client!t", name = "e", descriptor = "[[[I")
    private int[][][] field3114 = new int[2][2][4];

    @OriginalMember(owner = "client!t", name = "h", descriptor = "[I")
    private int[] field3117 = new int[2];

    @OriginalMember(owner = "client!t", name = "f", descriptor = "[[[I")
    private int[][][] field3115 = new int[2][2][4];

    @OriginalMember(owner = "client!t", name = "g", descriptor = "[[F")
    private static float[][] field3116 = new float[2][8];

    @OriginalMember(owner = "client!t", name = "c", descriptor = "[[I")
    public static int[][] field3112 = new int[2][8];

    @OriginalMember(owner = "client!t", name = "d", descriptor = "F")
    private static float field3113;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "I")
    public static int field3110;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lla;Laa;)V")
    public final void method1017(class77 arg0, class2 arg1) {
        int var3 = arg0.method570((byte) 123);
        this.field3111[0] = var3 >> 4;
        this.field3111[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field3117[0] = this.field3117[1] = 0;
            return;
        }
        this.field3117[0] = arg0.method597(40);
        this.field3117[1] = arg0.method597(101);
        int var4 = arg0.method570((byte) 123);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field3111[var5]; var8++) {
                this.field3114[var5][0][var8] = arg0.method597(86);
                this.field3115[var5][0][var8] = arg0.method597(118);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field3111[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field3114[var6][1][var7] = this.field3114[var6][0][var7];
                    this.field3115[var6][1][var7] = this.field3115[var6][0][var7];
                } else {
                    this.field3114[var6][1][var7] = arg0.method597(101);
                    this.field3115[var6][1][var7] = arg0.method597(102);
                }
            }
        }
        if (var4 != 0 || this.field3117[1] != this.field3117[0]) {
            arg1.method5(arg0);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IF)I")
    public final int method1018(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field3117[1] - this.field3117[0]) * arg1 + (float) this.field3117[0];
            float var4 = var3 * 0.0030517578F;
            field3113 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field3110 = (int) (field3113 * 65536.0F);
        }
        if (this.field3111[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1019(arg0, 0, arg1);
        field3116[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1022(arg0, 0, arg1));
        field3116[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field3111[arg0]; var6++) {
            float var9 = this.method1019(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method1022(arg0, var6, arg1));
            float var11 = var9 * var9;
            field3116[arg0][var6 * 2 + 1] = field3116[arg0][var6 * 2 - 1] * var11;
            field3116[arg0][var6 * 2] = field3116[arg0][var6 * 2 - 1] * var10 + field3116[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field3116[arg0][var12] += field3116[arg0][var12 - 1] * var10 + field3116[arg0][var12 - 2] * var11;
            }
            field3116[arg0][1] += field3116[arg0][0] * var10 + var11;
            field3116[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field3111[0] * 2; var7++) {
                field3116[0][var7] *= field3113;
            }
        }
        for (int var8 = 0; var8 < this.field3111[arg0] * 2; var8++) {
            field3112[arg0][var8] = (int) (field3116[arg0][var8] * 65536.0F);
        }
        return this.field3111[arg0] * 2;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIF)F")
    private final float method1019(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3115[arg0][1][arg1] - this.field3115[arg0][0][arg1]) * arg2 + (float) this.field3115[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "()V")
    public static void method1020() {
        field3116 = null;
        field3112 = null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(F)F")
    private static final float method1021(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(IIF)F")
    private final float method1022(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field3114[arg0][1][arg1] - this.field3114[arg0][0][arg1]) * arg2 + (float) this.field3114[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1021(var5);
    }
}
