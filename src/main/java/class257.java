import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class257 {

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
    public int field3942;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "I")
    private int field3945;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "[I")
    private int[] field3941;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "[I")
    private int[] field3944;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "[[F")
    private float[][] field3943;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "[I")
    private int[] field3946;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "()[F", line = 3)
    public final float[] method1895() {
        return this.field3943[this.method1898()];
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "()V", line = 9)
    private final void method1896() {
        int[] var1 = new int[this.field3945];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field3945; var3++) {
            int var4 = this.field3941[var3];
            if (var4 != 0) {
                int var5 = 0x1 << 32 - var4;
                int var6 = var2[var4];
                var1[var3] = var6;
                int var7;
                if ((var6 & var5) == 0) {
                    var7 = var6 | var5;
                    for (int var8 = var4 - 1; var8 >= 1; var8--) {
                        int var9 = var2[var8];
                        if (var6 != var9) {
                            break;
                        }
                        int var10 = 0x1 << 32 - var8;
                        if ((var9 & var10) != 0) {
                            var2[var8] = var2[var8 - 1];
                            break;
                        }
                        var2[var8] = var9 | var10;
                    }
                } else {
                    var7 = var2[var4 - 1];
                }
                var2[var4] = var7;
                for (int var11 = var4 + 1; var11 <= 32; var11++) {
                    int var12 = var2[var11];
                    if (var6 == var12) {
                        var2[var11] = var7;
                    }
                }
            }
        }
        this.field3946 = new int[8];
        int var13 = 0;
        for (int var14 = 0; var14 < this.field3945; var14++) {
            int var15 = this.field3941[var14];
            if (var15 != 0) {
                int var16 = var1[var14];
                int var17 = 0;
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = Integer.MIN_VALUE >>> var18;
                    if ((var16 & var19) == 0) {
                        var17++;
                    } else {
                        if (this.field3946[var17] == 0) {
                            this.field3946[var17] = var13;
                        }
                        var17 = this.field3946[var17];
                    }
                    if (var17 >= this.field3946.length) {
                        int[] var20 = new int[this.field3946.length * 2];
                        for (int var21 = 0; var21 < this.field3946.length; var21++) {
                            var20[var21] = this.field3946[var21];
                        }
                        this.field3946 = var20;
                    }
                    int var22 = var19 >>> 1;
                }
                this.field3946[var17] = ~var14;
                if (var17 >= var13) {
                    var13 = var17 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)I", line = 148)
    private static final int method1897(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class64.method634((byte) 99, var2, arg1) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "()I", line = 157)
    public final int method1898() {
        int var1;
        for (var1 = 0; this.field3946[var1] >= 0; var1 = class302.method2176() == 0 ? var1 + 1 : this.field3946[var1]) {
        }
        return ~this.field3946[var1];
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "()V", line = 165)
    public class257() {
        class302.method2173(24);
        this.field3942 = class302.method2173(16);
        this.field3945 = class302.method2173(24);
        this.field3941 = new int[this.field3945];
        boolean var1 = class302.method2176() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class302.method2173(5) + 1;
            while (var2 < this.field3945) {
                int var4 = class302.method2173(class72.method684(4, this.field3945 - var2));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field3941[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class302.method2176() != 0;
            for (int var7 = 0; var7 < this.field3945; var7++) {
                if (var6 && class302.method2176() == 0) {
                    this.field3941[var7] = 0;
                } else {
                    this.field3941[var7] = class302.method2173(5) + 1;
                }
            }
        }
        this.method1896();
        int var8 = class302.method2173(4);
        if (var8 > 0) {
            float var9 = class302.method2175(class302.method2173(32));
            float var10 = class302.method2175(class302.method2173(32));
            int var11 = class302.method2173(4) + 1;
            boolean var12 = class302.method2176() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method1897(this.field3945, this.field3942);
            } else {
                var13 = this.field3945 * this.field3942;
            }
            this.field3944 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field3944[var14] = class302.method2173(var11);
            }
            this.field3943 = new float[this.field3945][this.field3942];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field3945; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field3942; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field3944[var19] * var10 + var9 + var16;
                        this.field3943[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field3945; var21++) {
                    float var22 = 0.0F;
                    int var23 = this.field3942 * var21;
                    for (int var24 = 0; var24 < this.field3942; var24++) {
                        float var25 = (float) this.field3944[var23] * var10 + var9 + var22;
                        this.field3943[var21][var24] = var25;
                        if (var12) {
                            var22 = var25;
                        }
                        var23++;
                    }
                }
            }
        }
    }
}
