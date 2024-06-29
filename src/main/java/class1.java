import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class1 {

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
    public int field3;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "I")
    private int field1;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "[I")
    private int[] field4;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "[I")
    private int[] field5;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "[[F")
    private float[][] field2;

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "[I")
    private int[] field6;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "()I", line = 6)
    public final int method1() {
        int var1;
        for (var1 = 0; this.field6[var1] >= 0; var1 = class202.method1357() == 0 ? var1 + 1 : this.field6[var1]) {
        }
        return ~this.field6[var1];
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)I", line = 15)
    private static final int method2(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class43.method307(114, var2, arg1) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "()[F", line = 22)
    public final float[] method3() {
        return this.field2[this.method1()];
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "()V", line = 26)
    private final void method4() {
        int[] var1 = new int[this.field1];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field1; var3++) {
            int var4 = this.field4[var3];
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
        this.field6 = new int[8];
        int var13 = 0;
        for (int var14 = 0; var14 < this.field1; var14++) {
            int var15 = this.field4[var14];
            if (var15 != 0) {
                int var16 = var1[var14];
                int var17 = 0;
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = Integer.MIN_VALUE >>> var18;
                    if ((var16 & var19) == 0) {
                        var17++;
                    } else {
                        if (this.field6[var17] == 0) {
                            this.field6[var17] = var13;
                        }
                        var17 = this.field6[var17];
                    }
                    if (var17 >= this.field6.length) {
                        int[] var20 = new int[this.field6.length * 2];
                        for (int var21 = 0; var21 < this.field6.length; var21++) {
                            var20[var21] = this.field6[var21];
                        }
                        this.field6 = var20;
                    }
                    int var22 = var19 >>> 1;
                }
                this.field6[var17] = ~var14;
                if (var17 >= var13) {
                    var13 = var17 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "()V", line = 165)
    public class1() {
        class202.method1355(24);
        this.field3 = class202.method1355(16);
        this.field1 = class202.method1355(24);
        this.field4 = new int[this.field1];
        boolean var1 = class202.method1357() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class202.method1355(5) + 1;
            while (var2 < this.field1) {
                int var4 = class202.method1355(class116.method799(this.field1 - var2, (byte) -80));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field4[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class202.method1357() != 0;
            for (int var7 = 0; var7 < this.field1; var7++) {
                if (var6 && class202.method1357() == 0) {
                    this.field4[var7] = 0;
                } else {
                    this.field4[var7] = class202.method1355(5) + 1;
                }
            }
        }
        this.method4();
        int var8 = class202.method1355(4);
        if (var8 > 0) {
            float var9 = class202.method1362(class202.method1355(32));
            float var10 = class202.method1362(class202.method1355(32));
            int var11 = class202.method1355(4) + 1;
            boolean var12 = class202.method1357() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method2(this.field1, this.field3);
            } else {
                var13 = this.field3 * this.field1;
            }
            this.field5 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field5[var14] = class202.method1355(var11);
            }
            this.field2 = new float[this.field1][this.field3];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field1; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field3; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field5[var19] * var10 + var9 + var16;
                        this.field2[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field1; var21++) {
                    float var22 = 0.0F;
                    int var23 = this.field3 * var21;
                    for (int var24 = 0; var24 < this.field3; var24++) {
                        float var25 = (float) this.field5[var23] * var10 + var9 + var22;
                        this.field2[var21][var24] = var25;
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
