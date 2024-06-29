import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class587 {

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "[I")
    private int[] field7416 = new int[2];

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "[[[I")
    private int[][][] field7414 = new int[2][2][4];

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "[I")
    public int[] field7412 = new int[2];

    @OriginalMember(owner = "client!cm", name = "h", descriptor = "[[[I")
    private int[][][] field7418 = new int[2][2][4];

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "[[I")
    public static int[][] field7415 = new int[2][8];

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "[[F")
    private static float[][] field7413 = new float[2][8];

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "F")
    private static float field7411;

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "I")
    public static int field7417;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIF)F", line = 4)
    private final float method3138(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field7414[arg0][1][arg1] - this.field7414[arg0][0][arg1]) * arg2 + (float) this.field7414[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method3142(var5);
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "()V", line = 13)
    public static void method3139() {
        field7413 = null;
        field7415 = null;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IF)I", line = 17)
    public final int method3140(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field7416[1] - this.field7416[0]) * arg1 + (float) this.field7416[0];
            float var4 = var3 * 0.0030517578F;
            field7411 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field7417 = (int) (field7411 * 65536.0F);
        }
        if (this.field7412[arg0] == 0) {
            return 0;
        }
        float var5 = this.method3143(arg0, 0, arg1);
        field7413[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method3138(arg0, 0, arg1));
        field7413[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field7412[arg0]; var6++) {
            float var9 = this.method3143(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method3138(arg0, var6, arg1));
            float var11 = var9 * var9;
            field7413[arg0][var6 * 2 + 1] = field7413[arg0][var6 * 2 - 1] * var11;
            field7413[arg0][var6 * 2] = field7413[arg0][var6 * 2 - 1] * var10 + field7413[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field7413[arg0][var12] += field7413[arg0][var12 - 1] * var10 + field7413[arg0][var12 - 2] * var11;
            }
            field7413[arg0][1] += field7413[arg0][0] * var10 + var11;
            field7413[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field7412[0] * 2; var7++) {
                field7413[0][var7] *= field7411;
            }
        }
        for (int var8 = 0; var8 < this.field7412[arg0] * 2; var8++) {
            field7415[arg0][var8] = (int) (field7413[arg0][var8] * 65536.0F);
        }
        return this.field7412[arg0] * 2;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lmc;Lnj;)V", line = 78)
    public final void method3141(class234 arg0, class741 arg1) {
        int var3 = arg0.method1509(true);
        this.field7412[0] = var3 >> 4;
        this.field7412[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field7416[0] = this.field7416[1] = 0;
            return;
        }
        this.field7416[0] = arg0.method1553((byte) 14);
        this.field7416[1] = arg0.method1553((byte) -116);
        int var4 = arg0.method1509(true);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field7412[var5]; var8++) {
                this.field7414[var5][0][var8] = arg0.method1553((byte) 85);
                this.field7418[var5][0][var8] = arg0.method1553((byte) 121);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field7412[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field7414[var6][1][var7] = this.field7414[var6][0][var7];
                    this.field7418[var6][1][var7] = this.field7418[var6][0][var7];
                } else {
                    this.field7414[var6][1][var7] = arg0.method1553((byte) 57);
                    this.field7418[var6][1][var7] = arg0.method1553((byte) 35);
                }
            }
        }
        if (var4 != 0 || this.field7416[1] != this.field7416[0]) {
            arg1.method4032(arg0);
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(F)F", line = 144)
    private static final float method3142(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(IIF)F", line = 156)
    private final float method3143(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field7418[arg0][1][arg1] - this.field7418[arg0][0][arg1]) * arg2 + (float) this.field7418[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }
}
