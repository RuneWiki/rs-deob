import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class61 {

    @OriginalMember(owner = "client!g", name = "b", descriptor = "[I")
    public int[] field1204 = new int[2];

    @OriginalMember(owner = "client!g", name = "a", descriptor = "[[[I")
    private int[][][] field1203 = new int[2][2][4];

    @OriginalMember(owner = "client!g", name = "h", descriptor = "[I")
    private int[] field1210 = new int[2];

    @OriginalMember(owner = "client!g", name = "f", descriptor = "[[[I")
    private int[][][] field1208 = new int[2][2][4];

    @OriginalMember(owner = "client!g", name = "g", descriptor = "[[F")
    private static float[][] field1209 = new float[2][8];

    @OriginalMember(owner = "client!g", name = "e", descriptor = "[[I")
    public static int[][] field1207 = new int[2][8];

    @OriginalMember(owner = "client!g", name = "d", descriptor = "F")
    private static float field1206;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIF)F")
    private final float method384(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1203[arg0][1][arg1] - this.field1203[arg0][0][arg1]) * arg2 + (float) this.field1203[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method389(var5);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IF)I")
    public final int method385(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1210[1] - this.field1210[0]) * arg1 + (float) this.field1210[0];
            float var4 = var3 * 0.0030517578F;
            field1206 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field1205 = (int) (field1206 * 65536.0F);
        }
        if (this.field1204[arg0] == 0) {
            return 0;
        }
        float var5 = this.method386(arg0, 0, arg1);
        field1209[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method384(arg0, 0, arg1));
        field1209[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1204[arg0]; var6++) {
            float var9 = this.method386(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method384(arg0, var6, arg1));
            float var11 = var9 * var9;
            field1209[arg0][var6 * 2 + 1] = field1209[arg0][var6 * 2 - 1] * var11;
            field1209[arg0][var6 * 2] = field1209[arg0][var6 * 2 - 1] * var10 + field1209[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field1209[arg0][var12] += field1209[arg0][var12 - 1] * var10 + field1209[arg0][var12 - 2] * var11;
            }
            field1209[arg0][1] += field1209[arg0][0] * var10 + var11;
            field1209[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field1204[0] * 2; var7++) {
                field1209[0][var7] *= field1206;
            }
        }
        for (int var8 = 0; var8 < this.field1204[arg0] * 2; var8++) {
            field1207[arg0][var8] = (int) (field1209[arg0][var8] * 65536.0F);
        }
        return this.field1204[arg0] * 2;
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(IIF)F")
    private final float method386(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1208[arg0][1][arg1] - this.field1208[arg0][0][arg1]) * arg2 + (float) this.field1208[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lmb;Lii;)V")
    public final void method387(class121 arg0, class88 arg1) {
        int var3 = arg0.method751((byte) -32);
        this.field1204[0] = var3 >> 4;
        this.field1204[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field1210[0] = this.field1210[1] = 0;
            return;
        }
        this.field1210[0] = arg0.method755((byte) -87);
        this.field1210[1] = arg0.method755((byte) -62);
        int var4 = arg0.method751((byte) 106);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field1204[var5]; var8++) {
                this.field1203[var5][0][var8] = arg0.method755((byte) -52);
                this.field1208[var5][0][var8] = arg0.method755((byte) -38);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field1204[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field1203[var6][1][var7] = this.field1203[var6][0][var7];
                    this.field1208[var6][1][var7] = this.field1208[var6][0][var7];
                } else {
                    this.field1203[var6][1][var7] = arg0.method755((byte) -22);
                    this.field1208[var6][1][var7] = arg0.method755((byte) -114);
                }
            }
        }
        if (var4 != 0 || this.field1210[1] != this.field1210[0]) {
            arg1.method565(arg0);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "()V")
    public static void method388() {
        field1209 = null;
        field1207 = null;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(F)F")
    private static final float method389(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }
}
