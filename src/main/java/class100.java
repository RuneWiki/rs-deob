import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class100 {

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "I")
    public int field1809;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "I")
    private int field1808;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "[I")
    private int[] field1806;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "[I")
    private int[] field1807;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "[[F")
    private float[][] field1805;

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "[I")
    private int[] field1810;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "()V", line = 6)
    private final void method741() {
        int[] var1 = new int[this.field1808];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field1808; var3++) {
            int var4 = this.field1806[var3];
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
        this.field1810 = new int[8];
        int var13 = 0;
        for (int var14 = 0; var14 < this.field1808; var14++) {
            int var15 = this.field1806[var14];
            if (var15 != 0) {
                int var16 = var1[var14];
                int var17 = 0;
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = Integer.MIN_VALUE >>> var18;
                    if ((var16 & var19) == 0) {
                        var17++;
                    } else {
                        if (this.field1810[var17] == 0) {
                            this.field1810[var17] = var13;
                        }
                        var17 = this.field1810[var17];
                    }
                    if (var17 >= this.field1810.length) {
                        int[] var20 = new int[this.field1810.length * 2];
                        for (int var21 = 0; var21 < this.field1810.length; var21++) {
                            var20[var21] = this.field1810[var21];
                        }
                        this.field1810 = var20;
                    }
                    int var22 = var19 >>> 1;
                }
                this.field1810[var17] = ~var14;
                if (var17 >= var13) {
                    var13 = var17 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "()[F", line = 146)
    public final float[] method742() {
        return this.field1805[this.method744()];
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(II)I", line = 151)
    private static final int method743(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class131.method945(arg1, (byte) 119, var2) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "()V", line = 157)
    public class100() {
        class144.method1021(24);
        this.field1809 = class144.method1021(16);
        this.field1808 = class144.method1021(24);
        this.field1806 = new int[this.field1808];
        boolean var1 = class144.method1023() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class144.method1021(5) + 1;
            while (var2 < this.field1808) {
                int var4 = class144.method1021(class213.method1501(-10189, this.field1808 - var2));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field1806[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class144.method1023() != 0;
            for (int var7 = 0; var7 < this.field1808; var7++) {
                if (var6 && class144.method1023() == 0) {
                    this.field1806[var7] = 0;
                } else {
                    this.field1806[var7] = class144.method1021(5) + 1;
                }
            }
        }
        this.method741();
        int var8 = class144.method1021(4);
        if (var8 > 0) {
            float var9 = class144.method1029(class144.method1021(32));
            float var10 = class144.method1029(class144.method1021(32));
            int var11 = class144.method1021(4) + 1;
            boolean var12 = class144.method1023() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method743(this.field1808, this.field1809);
            } else {
                var13 = this.field1809 * this.field1808;
            }
            this.field1807 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field1807[var14] = class144.method1021(var11);
            }
            this.field1805 = new float[this.field1808][this.field1809];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field1808; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field1809; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field1807[var19] * var10 + var9 + var16;
                        this.field1805[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field1808; var21++) {
                    float var22 = 0.0F;
                    int var23 = this.field1809 * var21;
                    for (int var24 = 0; var24 < this.field1809; var24++) {
                        float var25 = (float) this.field1807[var23] * var10 + var9 + var22;
                        this.field1805[var21][var24] = var25;
                        if (var12) {
                            var22 = var25;
                        }
                        var23++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "()I", line = 300)
    public final int method744() {
        int var1;
        for (var1 = 0; this.field1810[var1] >= 0; var1 = class144.method1023() == 0 ? var1 + 1 : this.field1810[var1]) {
        }
        return ~this.field1810[var1];
    }
}
