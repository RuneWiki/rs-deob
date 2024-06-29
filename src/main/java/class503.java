import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class503 {

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "I")
    public int field7516;

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "I")
    private int field7519;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "[I")
    private int[] field7518;

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "[I")
    private int[] field7517;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "[[F")
    private float[][] field7515;

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "[I")
    private int[] field7520;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "()[F", line = 3)
    public final float[] method3023() {
        return this.field7515[this.method3026()];
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)I", line = 7)
    private static final int method3024(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class93.method535(arg1, (byte) -31, var2) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "()V", line = 16)
    private final void method3025() {
        int[] var1 = new int[this.field7519];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field7519; var3++) {
            int var14 = this.field7518[var3];
            if (var14 != 0) {
                int var15 = 0x1 << 32 - var14;
                int var16 = var2[var14];
                var1[var3] = var16;
                int var17;
                if ((var16 & var15) == 0) {
                    var17 = var16 | var15;
                    for (int var18 = var14 - 1; var18 >= 1; var18--) {
                        int var19 = var2[var18];
                        if (var16 != var19) {
                            break;
                        }
                        int var20 = 0x1 << 32 - var18;
                        if ((var19 & var20) != 0) {
                            var2[var18] = var2[var18 - 1];
                            break;
                        }
                        var2[var18] = var19 | var20;
                    }
                } else {
                    var17 = var2[var14 - 1];
                }
                var2[var14] = var17;
                for (int var21 = var14 + 1; var21 <= 32; var21++) {
                    int var22 = var2[var21];
                    if (var16 == var22) {
                        var2[var21] = var17;
                    }
                }
            }
        }
        this.field7520 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field7519; var5++) {
            int var6 = this.field7518[var5];
            if (var6 != 0) {
                int var7 = var1[var5];
                int var8 = 0;
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = Integer.MIN_VALUE >>> var9;
                    if ((var7 & var10) == 0) {
                        var8++;
                    } else {
                        if (this.field7520[var8] == 0) {
                            this.field7520[var8] = var4;
                        }
                        var8 = this.field7520[var8];
                    }
                    if (var8 >= this.field7520.length) {
                        int[] var11 = new int[this.field7520.length * 2];
                        for (int var12 = 0; var12 < this.field7520.length; var12++) {
                            var11[var12] = this.field7520[var12];
                        }
                        this.field7520 = var11;
                    }
                    int var13 = var10 >>> 1;
                }
                this.field7520[var8] = ~var5;
                if (var8 >= var4) {
                    var4 = var8 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "()I", line = 156)
    public final int method3026() {
        int var1;
        for (var1 = 0; this.field7520[var1] >= 0; var1 = class299.method1844() == 0 ? var1 + 1 : this.field7520[var1]) {
        }
        return ~this.field7520[var1];
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "()V", line = 165)
    public class503() {
        class299.method1850(24);
        this.field7516 = class299.method1850(16);
        this.field7519 = class299.method1850(24);
        this.field7518 = new int[this.field7519];
        boolean var1 = class299.method1844() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class299.method1850(5) + 1;
            while (var2 < this.field7519) {
                int var4 = class299.method1850(class552.method3233(-119, this.field7519 - var2));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field7518[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class299.method1844() != 0;
            for (int var7 = 0; var7 < this.field7519; var7++) {
                if (var6 && class299.method1844() == 0) {
                    this.field7518[var7] = 0;
                } else {
                    this.field7518[var7] = class299.method1850(5) + 1;
                }
            }
        }
        this.method3025();
        int var8 = class299.method1850(4);
        if (var8 > 0) {
            float var9 = class299.method1848(class299.method1850(32));
            float var10 = class299.method1848(class299.method1850(32));
            int var11 = class299.method1850(4) + 1;
            boolean var12 = class299.method1844() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method3024(this.field7519, this.field7516);
            } else {
                var13 = this.field7519 * this.field7516;
            }
            this.field7517 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field7517[var14] = class299.method1850(var11);
            }
            this.field7515 = new float[this.field7519][this.field7516];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field7519; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field7516; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field7517[var19] * var10 + var9 + var16;
                        this.field7515[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
                return;
            }
            for (int var21 = 0; var21 < this.field7519; var21++) {
                float var22 = 0.0F;
                int var23 = this.field7516 * var21;
                for (int var24 = 0; var24 < this.field7516; var24++) {
                    float var25 = (float) this.field7517[var23] * var10 + var9 + var22;
                    this.field7515[var21][var24] = var25;
                    if (var12) {
                        var22 = var25;
                    }
                    var23++;
                }
            }
        }
    }
}
