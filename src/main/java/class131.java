import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class131 {

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "I")
    public int field1798;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
    private int field1796;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "[I")
    private int[] field1797;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "[I")
    private int[] field1795;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "[[F")
    private float[][] field1794;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "[I")
    private int[] field1799;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "()V", line = 7)
    private final void method871() {
        int[] var1 = new int[this.field1796];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field1796; var3++) {
            int var4 = this.field1797[var3];
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
        this.field1799 = new int[8];
        int var13 = 0;
        for (int var14 = 0; var14 < this.field1796; var14++) {
            int var15 = this.field1797[var14];
            if (var15 != 0) {
                int var16 = var1[var14];
                int var17 = 0;
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = Integer.MIN_VALUE >>> var18;
                    if ((var16 & var19) == 0) {
                        var17++;
                    } else {
                        if (this.field1799[var17] == 0) {
                            this.field1799[var17] = var13;
                        }
                        var17 = this.field1799[var17];
                    }
                    if (var17 >= this.field1799.length) {
                        int[] var20 = new int[this.field1799.length * 2];
                        for (int var21 = 0; var21 < this.field1799.length; var21++) {
                            var20[var21] = this.field1799[var21];
                        }
                        this.field1799 = var20;
                    }
                    int var22 = var19 >>> 1;
                }
                this.field1799[var17] = ~var14;
                if (var17 >= var13) {
                    var13 = var17 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)I", line = 147)
    private static final int method872(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class176.method1209(arg1, var2, -87) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "()[F", line = 154)
    public final float[] method873() {
        return this.field1794[this.method874()];
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "()I", line = 158)
    public final int method874() {
        int var1;
        for (var1 = 0; this.field1799[var1] >= 0; var1 = class338.method2341() == 0 ? var1 + 1 : this.field1799[var1]) {
        }
        return ~this.field1799[var1];
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "()V", line = 165)
    public class131() {
        class338.method2335(24);
        this.field1798 = class338.method2335(16);
        this.field1796 = class338.method2335(24);
        this.field1797 = new int[this.field1796];
        boolean var1 = class338.method2341() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class338.method2335(5) + 1;
            while (var2 < this.field1796) {
                int var4 = class338.method2335(class98.method591(this.field1796 - var2, -125));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field1797[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class338.method2341() != 0;
            for (int var7 = 0; var7 < this.field1796; var7++) {
                if (var6 && class338.method2341() == 0) {
                    this.field1797[var7] = 0;
                } else {
                    this.field1797[var7] = class338.method2335(5) + 1;
                }
            }
        }
        this.method871();
        int var8 = class338.method2335(4);
        if (var8 > 0) {
            float var9 = class338.method2344(class338.method2335(32));
            float var10 = class338.method2344(class338.method2335(32));
            int var11 = class338.method2335(4) + 1;
            boolean var12 = class338.method2341() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method872(this.field1796, this.field1798);
            } else {
                var13 = this.field1798 * this.field1796;
            }
            this.field1795 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field1795[var14] = class338.method2335(var11);
            }
            this.field1794 = new float[this.field1796][this.field1798];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field1796; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field1798; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field1795[var19] * var10 + var9 + var16;
                        this.field1794[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field1796; var21++) {
                    float var22 = 0.0F;
                    int var23 = this.field1798 * var21;
                    for (int var24 = 0; var24 < this.field1798; var24++) {
                        float var25 = (float) this.field1795[var23] * var10 + var9 + var22;
                        this.field1794[var21][var24] = var25;
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
