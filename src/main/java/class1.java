import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ADELCBNY")
public class class1 {

    @OriginalMember(owner = "ADELCBNY", name = "a", descriptor = "Z")
    private boolean field1 = false;

    @OriginalMember(owner = "ADELCBNY", name = "b", descriptor = "[I")
    public int[] field2 = new int[2];

    @OriginalMember(owner = "ADELCBNY", name = "c", descriptor = "[[[I")
    public int[][][] field3 = new int[2][2][4];

    @OriginalMember(owner = "ADELCBNY", name = "d", descriptor = "[[[I")
    public int[][][] field4 = new int[2][2][4];

    @OriginalMember(owner = "ADELCBNY", name = "e", descriptor = "[I")
    public int[] field5 = new int[2];

    @OriginalMember(owner = "ADELCBNY", name = "f", descriptor = "[[F")
    public static float[][] field6 = new float[2][8];

    @OriginalMember(owner = "ADELCBNY", name = "g", descriptor = "[[I")
    public static int[][] field7 = new int[2][8];

    @OriginalMember(owner = "ADELCBNY", name = "h", descriptor = "F")
    public static float field8;

    @OriginalMember(owner = "ADELCBNY", name = "i", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "ADELCBNY", name = "a", descriptor = "(IIIF)F")
    private float method1(int arg0, int arg1, int arg2, float arg3) {
        float var5 = (float) (this.field4[arg2][1][arg1] - this.field4[arg2][0][arg1]) * arg3 + (float) this.field4[arg2][0][arg1];
        if (arg0 != 49278) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        float var7 = var5 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var7 / 20.0F));
    }

    @OriginalMember(owner = "ADELCBNY", name = "a", descriptor = "(FI)F")
    private float method2(float arg0, int arg1) {
        float var3 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        while (arg1 >= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        return var3 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "ADELCBNY", name = "a", descriptor = "(IBFI)F")
    private float method3(int arg0, byte arg1, float arg2, int arg3) {
        if (arg1 != 4) {
            throw new NullPointerException();
        }
        boolean var5 = false;
        float var6 = (float) (this.field3[arg0][1][arg3] - this.field3[arg0][0][arg3]) * arg2 + (float) this.field3[arg0][0][arg3];
        float var7 = var6 * 1.2207031E-4F;
        return this.method2(var7, -140);
    }

    @OriginalMember(owner = "ADELCBNY", name = "a", descriptor = "(IBF)I")
    public int method4(int arg0, byte arg1, float arg2) {
        if (arg0 == 0) {
            float var4 = (float) (this.field5[1] - this.field5[0]) * arg2 + (float) this.field5[0];
            float var5 = var4 * 0.0030517578F;
            field8 = (float) Math.pow(0.1D, (double) (var5 / 20.0F));
            field9 = (int) (field8 * 65536.0F);
        }
        if (this.field2[arg0] == 0) {
            return 0;
        }
        float var6 = this.method1(49278, 0, arg0, arg2);
        field6[arg0][0] = var6 * -2.0F * (float) Math.cos((double) this.method3(arg0, (byte) 4, arg2, 0));
        field6[arg0][1] = var6 * var6;
        if (arg1 != 86) {
            this.field1 = !this.field1;
        }
        for (int var7 = 1; var7 < this.field2[arg0]; var7++) {
            float var10 = this.method1(49278, var7, arg0, arg2);
            float var11 = var10 * -2.0F * (float) Math.cos((double) this.method3(arg0, (byte) 4, arg2, var7));
            float var12 = var10 * var10;
            field6[arg0][var7 * 2 + 1] = field6[arg0][var7 * 2 - 1] * var12;
            field6[arg0][var7 * 2] = field6[arg0][var7 * 2 - 1] * var11 + field6[arg0][var7 * 2 - 2] * var12;
            for (int var13 = var7 * 2 - 1; var13 >= 2; var13--) {
                field6[arg0][var13] += field6[arg0][var13 - 1] * var11 + field6[arg0][var13 - 2] * var12;
            }
            field6[arg0][1] += field6[arg0][0] * var11 + var12;
            field6[arg0][0] += var11;
        }
        if (arg0 == 0) {
            for (int var8 = 0; var8 < this.field2[0] * 2; var8++) {
                field6[0][var8] *= field8;
            }
        }
        for (int var9 = 0; var9 < this.field2[arg0] * 2; var9++) {
            field7[arg0][var9] = (int) (field6[arg0][var9] * 65536.0F);
        }
        return this.field2[arg0] * 2;
    }

    @OriginalMember(owner = "ADELCBNY", name = "a", descriptor = "(LIMUIZRAF;LTDXKKGZV;I)V")
    public final void method5(class24 arg0, class54 arg1, int arg2) {
        int var4 = arg0.method238();
        this.field2[0] = var4 >> 4;
        if (arg2 != 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        this.field2[1] = var4 & 0xF;
        if (var4 == 0) {
            this.field5[0] = this.field5[1] = 0;
            if (class64.field1590) {
            }
            return;
        }
        this.field5[0] = arg0.method240();
        this.field5[1] = arg0.method240();
        int var6 = arg0.method238();
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var10 = 0; var10 < this.field2[var7]; var10++) {
                this.field3[var7][0][var10] = arg0.method240();
                this.field4[var7][0][var10] = arg0.method240();
            }
        }
        for (int var8 = 0; var8 < 2; var8++) {
            for (int var9 = 0; var9 < this.field2[var8]; var9++) {
                if ((var6 & 0x1 << var8 * 4 << var9) == 0) {
                    this.field3[var8][1][var9] = this.field3[var8][0][var9];
                    this.field4[var8][1][var9] = this.field4[var8][0][var9];
                } else {
                    this.field3[var8][1][var9] = arg0.method240();
                    this.field4[var8][1][var9] = arg0.method240();
                }
            }
        }
        if (var6 != 0 || this.field5[1] != this.field5[0]) {
            arg1.method486(false, arg0);
        }
    }
}
