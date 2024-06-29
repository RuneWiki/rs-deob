import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class22 {

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "[I")
    private int[] field354 = new int[2];

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "[[[I")
    private int[][][] field351 = new int[2][2][4];

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "[I")
    public int[] field353 = new int[2];

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "[[[I")
    private int[][][] field350 = new int[2][2][4];

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "[[F")
    private static float[][] field355 = new float[2][8];

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "[[I")
    public static int[][] field352 = new int[2][8];

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "F")
    private static float field349;

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lbj;Lfj;)V")
    public final void method143(class215 arg0, class293 arg1) {
        int var3 = arg0.method1374((byte) -60);
        this.field353[0] = var3 >> 4;
        this.field353[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field354[0] = this.field354[1] = 0;
            return;
        }
        this.field354[0] = arg0.method1379(-109);
        this.field354[1] = arg0.method1379(-101);
        int var4 = arg0.method1374((byte) -60);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field353[var5]; var8++) {
                this.field351[var5][0][var8] = arg0.method1379(-128);
                this.field350[var5][0][var8] = arg0.method1379(-104);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field353[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field351[var6][1][var7] = this.field351[var6][0][var7];
                    this.field350[var6][1][var7] = this.field350[var6][0][var7];
                } else {
                    this.field351[var6][1][var7] = arg0.method1379(-83);
                    this.field350[var6][1][var7] = arg0.method1379(-100);
                }
            }
        }
        if (var4 != 0 || this.field354[1] != this.field354[0]) {
            arg1.method1968(arg0);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIF)F")
    private final float method144(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field350[arg0][1][arg1] - this.field350[arg0][0][arg1]) * arg2 + (float) this.field350[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IF)I")
    public final int method145(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field354[1] - this.field354[0]) * arg1 + (float) this.field354[0];
            float var4 = var3 * 0.0030517578F;
            field349 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field356 = (int) (field349 * 65536.0F);
        }
        if (this.field353[arg0] == 0) {
            return 0;
        }
        float var5 = this.method144(arg0, 0, arg1);
        field355[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method146(arg0, 0, arg1));
        field355[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field353[arg0]; var6++) {
            float var9 = this.method144(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method146(arg0, var6, arg1));
            float var11 = var9 * var9;
            field355[arg0][var6 * 2 + 1] = field355[arg0][var6 * 2 - 1] * var11;
            field355[arg0][var6 * 2] = field355[arg0][var6 * 2 - 1] * var10 + field355[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field355[arg0][var12] += field355[arg0][var12 - 1] * var10 + field355[arg0][var12 - 2] * var11;
            }
            field355[arg0][1] += field355[arg0][0] * var10 + var11;
            field355[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field353[0] * 2; var7++) {
                field355[0][var7] *= field349;
            }
        }
        for (int var8 = 0; var8 < this.field353[arg0] * 2; var8++) {
            field352[arg0][var8] = (int) (field355[arg0][var8] * 65536.0F);
        }
        return this.field353[arg0] * 2;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(IIF)F")
    private final float method146(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field351[arg0][1][arg1] - this.field351[arg0][0][arg1]) * arg2 + (float) this.field351[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method148(var5);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "()V")
    public static void method147() {
        field355 = null;
        field352 = null;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(F)F")
    private static final float method148(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }
}
