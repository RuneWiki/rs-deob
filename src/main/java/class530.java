import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class530 {

    @OriginalMember(owner = "client!ms", name = "c", descriptor = "I")
    public int field7808;

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "I")
    private int field7806;

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "[I")
    private int[] field7807;

    @OriginalMember(owner = "client!ms", name = "d", descriptor = "[I")
    private int[] field7809;

    @OriginalMember(owner = "client!ms", name = "e", descriptor = "[[F")
    private float[][] field7810;

    @OriginalMember(owner = "client!ms", name = "f", descriptor = "[I")
    private int[] field7811;

    @OriginalMember(owner = "client!ms", name = "<init>", descriptor = "()V", line = 7)
    public class530() {
        class363.method2193(24);
        this.field7808 = class363.method2193(16);
        this.field7806 = class363.method2193(24);
        this.field7807 = new int[this.field7806];
        boolean var1 = class363.method2185() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class363.method2193(5) + 1;
            while (var2 < this.field7806) {
                int var4 = class363.method2193(class285.method1698(-73, this.field7806 - var2));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field7807[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class363.method2185() != 0;
            for (int var7 = 0; var7 < this.field7806; var7++) {
                if (var6 && class363.method2185() == 0) {
                    this.field7807[var7] = 0;
                } else {
                    this.field7807[var7] = class363.method2193(5) + 1;
                }
            }
        }
        this.method3136();
        int var8 = class363.method2193(4);
        if (var8 > 0) {
            float var9 = class363.method2186(class363.method2193(32));
            float var10 = class363.method2186(class363.method2193(32));
            int var11 = class363.method2193(4) + 1;
            boolean var12 = class363.method2185() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method3135(this.field7806, this.field7808);
            } else {
                var13 = this.field7808 * this.field7806;
            }
            this.field7809 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field7809[var14] = class363.method2193(var11);
            }
            this.field7810 = new float[this.field7806][this.field7808];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field7806; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field7808; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field7809[var19] * var10 + var9 + var16;
                        this.field7810[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
                return;
            }
            for (int var21 = 0; var21 < this.field7806; var21++) {
                float var22 = 0.0F;
                int var23 = this.field7808 * var21;
                for (int var24 = 0; var24 < this.field7808; var24++) {
                    float var25 = (float) this.field7809[var23] * var10 + var9 + var22;
                    this.field7810[var21][var24] = var25;
                    if (var12) {
                        var22 = var25;
                    }
                    var23++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "()I", line = 151)
    public final int method3134() {
        int var1;
        for (var1 = 0; this.field7811[var1] >= 0; var1 = class363.method2185() == 0 ? var1 + 1 : this.field7811[var1]) {
        }
        return ~this.field7811[var1];
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(II)I", line = 159)
    private static final int method3135(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class216.method1338(var2, 83, arg1) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "()V", line = 167)
    private final void method3136() {
        int[] var1 = new int[this.field7806];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field7806; var3++) {
            int var14 = this.field7807[var3];
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
        this.field7811 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field7806; var5++) {
            int var6 = this.field7807[var5];
            if (var6 != 0) {
                int var7 = var1[var5];
                int var8 = 0;
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = Integer.MIN_VALUE >>> var9;
                    if ((var7 & var10) == 0) {
                        var8++;
                    } else {
                        if (this.field7811[var8] == 0) {
                            this.field7811[var8] = var4;
                        }
                        var8 = this.field7811[var8];
                    }
                    if (var8 >= this.field7811.length) {
                        int[] var11 = new int[this.field7811.length * 2];
                        for (int var12 = 0; var12 < this.field7811.length; var12++) {
                            var11[var12] = this.field7811[var12];
                        }
                        this.field7811 = var11;
                    }
                    int var13 = var10 >>> 1;
                }
                this.field7811[var8] = ~var5;
                if (var8 >= var4) {
                    var4 = var8 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ms", name = "c", descriptor = "()[F", line = 305)
    public final float[] method3137() {
        return this.field7810[this.method3134()];
    }
}
