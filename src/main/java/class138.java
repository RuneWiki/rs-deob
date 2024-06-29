import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class138 {

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "[[[I")
    private int[][][] field2414 = new int[2][2][4];

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "[I")
    public int[] field2416 = new int[2];

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "[[[I")
    private int[][][] field2419 = new int[2][2][4];

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "[I")
    private int[] field2412 = new int[2];

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "[[F")
    private static float[][] field2415 = new float[2][8];

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "[[I")
    public static int[][] field2413 = new int[2][8];

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "F")
    private static float field2418;

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "I")
    public static int field2417;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(F)F")
    private static final float method950(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "()V")
    public static void method951() {
        field2415 = null;
        field2413 = null;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIF)F")
    private final float method952(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2414[arg0][1][arg1] - this.field2414[arg0][0][arg1]) * arg2 + (float) this.field2414[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method950(var5);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IF)I")
    public final int method953(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field2412[1] - this.field2412[0]) * arg1 + (float) this.field2412[0];
            float var4 = var3 * 0.0030517578F;
            field2418 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field2417 = (int) (field2418 * 65536.0F);
        }
        if (this.field2416[arg0] == 0) {
            return 0;
        }
        float var5 = this.method955(arg0, 0, arg1);
        field2415[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method952(arg0, 0, arg1));
        field2415[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field2416[arg0]; var6++) {
            float var9 = this.method955(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method952(arg0, var6, arg1));
            float var11 = var9 * var9;
            field2415[arg0][var6 * 2 + 1] = field2415[arg0][var6 * 2 - 1] * var11;
            field2415[arg0][var6 * 2] = field2415[arg0][var6 * 2 - 1] * var10 + field2415[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field2415[arg0][var12] += field2415[arg0][var12 - 1] * var10 + field2415[arg0][var12 - 2] * var11;
            }
            field2415[arg0][1] += field2415[arg0][0] * var10 + var11;
            field2415[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field2416[0] * 2; var7++) {
                field2415[0][var7] *= field2418;
            }
        }
        for (int var8 = 0; var8 < this.field2416[arg0] * 2; var8++) {
            field2413[arg0][var8] = (int) (field2415[arg0][var8] * 65536.0F);
        }
        return this.field2416[arg0] * 2;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Llj;Log;)V")
    public final void method954(class25 arg0, class217 arg1) {
        int var3 = arg0.method189((byte) -103);
        this.field2416[0] = var3 >> 4;
        this.field2416[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field2412[0] = this.field2412[1] = 0;
            return;
        }
        this.field2412[0] = arg0.method193((byte) 77);
        this.field2412[1] = arg0.method193((byte) 77);
        int var4 = arg0.method189((byte) -103);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field2416[var5]; var8++) {
                this.field2414[var5][0][var8] = arg0.method193((byte) 77);
                this.field2419[var5][0][var8] = arg0.method193((byte) 77);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field2416[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field2414[var6][1][var7] = this.field2414[var6][0][var7];
                    this.field2419[var6][1][var7] = this.field2419[var6][0][var7];
                } else {
                    this.field2414[var6][1][var7] = arg0.method193((byte) 77);
                    this.field2419[var6][1][var7] = arg0.method193((byte) 77);
                }
            }
        }
        if (var4 != 0 || this.field2412[1] != this.field2412[0]) {
            arg1.method1454(arg0);
        }
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(IIF)F")
    private final float method955(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2419[arg0][1][arg1] - this.field2419[arg0][0][arg1]) * arg2 + (float) this.field2419[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }
}
