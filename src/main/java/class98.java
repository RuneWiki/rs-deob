import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class98 {

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "[[[I")
    private int[][][] field2450 = new int[2][2][4];

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "[I")
    private int[] field2447 = new int[2];

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "[[[I")
    private int[][][] field2453 = new int[2][2][4];

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "[I")
    public int[] field2449 = new int[2];

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "[[F")
    private static float[][] field2452 = new float[2][8];

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "[[I")
    public static int[][] field2451 = new int[2][8];

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "F")
    private static float field2448;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "()V")
    public static void method832() {
        field2452 = null;
        field2451 = null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIF)F")
    private final float method833(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2453[arg0][1][arg1] - this.field2453[arg0][0][arg1]) * arg2 + (float) this.field2453[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method836(var5);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IF)I")
    public final int method834(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field2447[1] - this.field2447[0]) * arg1 + (float) this.field2447[0];
            float var4 = var3 * 0.0030517578F;
            field2448 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field2446 = (int) (field2448 * 65536.0F);
        }
        if (this.field2449[arg0] == 0) {
            return 0;
        }
        float var5 = this.method835(arg0, 0, arg1);
        field2452[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method833(arg0, 0, arg1));
        field2452[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field2449[arg0]; var6++) {
            float var9 = this.method835(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method833(arg0, var6, arg1));
            float var11 = var9 * var9;
            field2452[arg0][var6 * 2 + 1] = field2452[arg0][var6 * 2 - 1] * var11;
            field2452[arg0][var6 * 2] = field2452[arg0][var6 * 2 - 1] * var10 + field2452[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field2452[arg0][var12] += field2452[arg0][var12 - 1] * var10 + field2452[arg0][var12 - 2] * var11;
            }
            field2452[arg0][1] += field2452[arg0][0] * var10 + var11;
            field2452[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field2449[0] * 2; var7++) {
                field2452[0][var7] *= field2448;
            }
        }
        for (int var8 = 0; var8 < this.field2449[arg0] * 2; var8++) {
            field2451[arg0][var8] = (int) (field2452[arg0][var8] * 65536.0F);
        }
        return this.field2449[arg0] * 2;
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(IIF)F")
    private final float method835(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field2450[arg0][1][arg1] - this.field2450[arg0][0][arg1]) * arg2 + (float) this.field2450[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(F)F")
    private static final float method836(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lbf;Lsd;)V")
    public final void method837(class14 arg0, class123 arg1) {
        int var3 = arg0.method153(true);
        this.field2449[0] = var3 >> 4;
        this.field2449[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field2447[0] = this.field2447[1] = 0;
            return;
        }
        this.field2447[0] = arg0.method138((byte) 99);
        this.field2447[1] = arg0.method138((byte) 110);
        int var4 = arg0.method153(true);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field2449[var5]; var8++) {
                this.field2453[var5][0][var8] = arg0.method138((byte) 112);
                this.field2450[var5][0][var8] = arg0.method138((byte) 104);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field2449[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field2453[var6][1][var7] = this.field2453[var6][0][var7];
                    this.field2450[var6][1][var7] = this.field2450[var6][0][var7];
                } else {
                    this.field2453[var6][1][var7] = arg0.method138((byte) 93);
                    this.field2450[var6][1][var7] = arg0.method138((byte) 95);
                }
            }
        }
        if (var4 != 0 || this.field2447[1] != this.field2447[0]) {
            arg1.method995(arg0);
        }
    }
}
