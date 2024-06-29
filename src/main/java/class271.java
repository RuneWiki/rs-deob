import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class271 {

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
    public int field4697;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    private int field4695;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "[I")
    private int[] field4699;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "[I")
    private int[] field4696;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "[[F")
    private float[][] field4698;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "[I")
    private int[] field4700;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "()V", line = 6)
    private final void method1888() {
        int[] var1 = new int[this.field4695];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field4695; var3++) {
            int var4 = this.field4699[var3];
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
        this.field4700 = new int[8];
        int var13 = 0;
        for (int var14 = 0; var14 < this.field4695; var14++) {
            int var15 = this.field4699[var14];
            if (var15 != 0) {
                int var16 = var1[var14];
                int var17 = 0;
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = Integer.MIN_VALUE >>> var18;
                    if ((var16 & var19) == 0) {
                        var17++;
                    } else {
                        if (this.field4700[var17] == 0) {
                            this.field4700[var17] = var13;
                        }
                        var17 = this.field4700[var17];
                    }
                    if (var17 >= this.field4700.length) {
                        int[] var20 = new int[this.field4700.length * 2];
                        for (int var21 = 0; var21 < this.field4700.length; var21++) {
                            var20[var21] = this.field4700[var21];
                        }
                        this.field4700 = var20;
                    }
                    int var22 = var19 >>> 1;
                }
                this.field4700[var17] = ~var14;
                if (var17 >= var13) {
                    var13 = var17 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "()[F", line = 144)
    public final float[] method1889() {
        return this.field4698[this.method1891()];
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)I", line = 149)
    private static final int method1890(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class90.method668(arg1, var2, -31770) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "()I", line = 158)
    public final int method1891() {
        int var1;
        for (var1 = 0; this.field4700[var1] >= 0; var1 = class181.method1340() == 0 ? var1 + 1 : this.field4700[var1]) {
        }
        return ~this.field4700[var1];
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "()V", line = 165)
    public class271() {
        class181.method1349(24);
        this.field4697 = class181.method1349(16);
        this.field4695 = class181.method1349(24);
        this.field4699 = new int[this.field4695];
        boolean var1 = class181.method1340() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class181.method1349(5) + 1;
            while (var2 < this.field4695) {
                int var4 = class181.method1349(class167.method1179(this.field4695 - var2, 117));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field4699[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class181.method1340() != 0;
            for (int var7 = 0; var7 < this.field4695; var7++) {
                if (var6 && class181.method1340() == 0) {
                    this.field4699[var7] = 0;
                } else {
                    this.field4699[var7] = class181.method1349(5) + 1;
                }
            }
        }
        this.method1888();
        int var8 = class181.method1349(4);
        if (var8 > 0) {
            float var9 = class181.method1341(class181.method1349(32));
            float var10 = class181.method1341(class181.method1349(32));
            int var11 = class181.method1349(4) + 1;
            boolean var12 = class181.method1340() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method1890(this.field4695, this.field4697);
            } else {
                var13 = this.field4697 * this.field4695;
            }
            this.field4696 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field4696[var14] = class181.method1349(var11);
            }
            this.field4698 = new float[this.field4695][this.field4697];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field4695; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field4697; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field4696[var19] * var10 + var9 + var16;
                        this.field4698[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field4695; var21++) {
                    float var22 = 0.0F;
                    int var23 = this.field4697 * var21;
                    for (int var24 = 0; var24 < this.field4697; var24++) {
                        float var25 = (float) this.field4696[var23] * var10 + var9 + var22;
                        this.field4698[var21][var24] = var25;
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
