import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class33 {

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    public int field389;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "I")
    private int field393;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "[I")
    private int[] field390;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "[I")
    private int[] field392;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "[[F")
    private float[][] field391;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "[I")
    private int[] field394;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)I", line = 4)
    private static final int method235(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class100.method750(arg1, (byte) 103, var2) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "()I", line = 12)
    public final int method236() {
        int var1;
        for (var1 = 0; this.field394[var1] >= 0; var1 = class288.method2033() == 0 ? var1 + 1 : this.field394[var1]) {
        }
        return ~this.field394[var1];
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "()[F", line = 19)
    public final float[] method237() {
        return this.field391[this.method236()];
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "()V", line = 23)
    private final void method238() {
        int[] var1 = new int[this.field393];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field393; var3++) {
            int var4 = this.field390[var3];
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
        this.field394 = new int[8];
        int var13 = 0;
        for (int var14 = 0; var14 < this.field393; var14++) {
            int var15 = this.field390[var14];
            if (var15 != 0) {
                int var16 = var1[var14];
                int var17 = 0;
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = Integer.MIN_VALUE >>> var18;
                    if ((var16 & var19) == 0) {
                        var17++;
                    } else {
                        if (this.field394[var17] == 0) {
                            this.field394[var17] = var13;
                        }
                        var17 = this.field394[var17];
                    }
                    if (var17 >= this.field394.length) {
                        int[] var20 = new int[this.field394.length * 2];
                        for (int var21 = 0; var21 < this.field394.length; var21++) {
                            var20[var21] = this.field394[var21];
                        }
                        this.field394 = var20;
                    }
                    int var22 = var19 >>> 1;
                }
                this.field394[var17] = ~var14;
                if (var17 >= var13) {
                    var13 = var17 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "()V", line = 165)
    public class33() {
        class288.method2025(24);
        this.field389 = class288.method2025(16);
        this.field393 = class288.method2025(24);
        this.field390 = new int[this.field393];
        boolean var1 = class288.method2033() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class288.method2025(5) + 1;
            while (var2 < this.field393) {
                int var4 = class288.method2025(class231.method1545(1937408966, this.field393 - var2));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field390[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class288.method2033() != 0;
            for (int var7 = 0; var7 < this.field393; var7++) {
                if (var6 && class288.method2033() == 0) {
                    this.field390[var7] = 0;
                } else {
                    this.field390[var7] = class288.method2025(5) + 1;
                }
            }
        }
        this.method238();
        int var8 = class288.method2025(4);
        if (var8 > 0) {
            float var9 = class288.method2029(class288.method2025(32));
            float var10 = class288.method2029(class288.method2025(32));
            int var11 = class288.method2025(4) + 1;
            boolean var12 = class288.method2033() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method235(this.field393, this.field389);
            } else {
                var13 = this.field393 * this.field389;
            }
            this.field392 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field392[var14] = class288.method2025(var11);
            }
            this.field391 = new float[this.field393][this.field389];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field393; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field389; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field392[var19] * var10 + var9 + var16;
                        this.field391[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field393; var21++) {
                    float var22 = 0.0F;
                    int var23 = this.field389 * var21;
                    for (int var24 = 0; var24 < this.field389; var24++) {
                        float var25 = (float) this.field392[var23] * var10 + var9 + var22;
                        this.field391[var21][var24] = var25;
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
