import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class148 {

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
    public int field2297;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    private int field2295;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "[I")
    private int[] field2296;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "[I")
    private int[] field2293;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "[[F")
    private float[][] field2294;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "[I")
    private int[] field2298;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "()V", line = 5)
    private final void method1085() {
        int[] var1 = new int[this.field2295];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field2295; var3++) {
            int var4 = this.field2296[var3];
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
        this.field2298 = new int[8];
        int var13 = 0;
        for (int var14 = 0; var14 < this.field2295; var14++) {
            int var15 = this.field2296[var14];
            if (var15 != 0) {
                int var16 = var1[var14];
                int var17 = 0;
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = Integer.MIN_VALUE >>> var18;
                    if ((var16 & var19) == 0) {
                        var17++;
                    } else {
                        if (this.field2298[var17] == 0) {
                            this.field2298[var17] = var13;
                        }
                        var17 = this.field2298[var17];
                    }
                    if (var17 >= this.field2298.length) {
                        int[] var20 = new int[this.field2298.length * 2];
                        for (int var21 = 0; var21 < this.field2298.length; var21++) {
                            var20[var21] = this.field2298[var21];
                        }
                        this.field2298 = var20;
                    }
                    int var22 = var19 >>> 1;
                }
                this.field2298[var17] = ~var14;
                if (var17 >= var13) {
                    var13 = var17 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "()I", line = 144)
    public final int method1086() {
        int var1;
        for (var1 = 0; this.field2298[var1] >= 0; var1 = class3.method22() == 0 ? var1 + 1 : this.field2298[var1]) {
        }
        return ~this.field2298[var1];
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "()[F", line = 151)
    public final float[] method1087() {
        return this.field2294[this.method1086()];
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)I", line = 158)
    private static final int method1088(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class70.method464(var2, arg1, 1388) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "()V", line = 165)
    public class148() {
        class3.method20(24);
        this.field2297 = class3.method20(16);
        this.field2295 = class3.method20(24);
        this.field2296 = new int[this.field2295];
        boolean var1 = class3.method22() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class3.method20(5) + 1;
            while (var2 < this.field2295) {
                int var4 = class3.method20(class197.method1448(this.field2295 - var2, -606));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field2296[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class3.method22() != 0;
            for (int var7 = 0; var7 < this.field2295; var7++) {
                if (var6 && class3.method22() == 0) {
                    this.field2296[var7] = 0;
                } else {
                    this.field2296[var7] = class3.method20(5) + 1;
                }
            }
        }
        this.method1085();
        int var8 = class3.method20(4);
        if (var8 > 0) {
            float var9 = class3.method17(class3.method20(32));
            float var10 = class3.method17(class3.method20(32));
            int var11 = class3.method20(4) + 1;
            boolean var12 = class3.method22() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method1088(this.field2295, this.field2297);
            } else {
                var13 = this.field2297 * this.field2295;
            }
            this.field2293 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field2293[var14] = class3.method20(var11);
            }
            this.field2294 = new float[this.field2295][this.field2297];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field2295; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field2297; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field2293[var19] * var10 + var9 + var16;
                        this.field2294[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field2295; var21++) {
                    float var22 = 0.0F;
                    int var23 = this.field2297 * var21;
                    for (int var24 = 0; var24 < this.field2297; var24++) {
                        float var25 = (float) this.field2293[var23] * var10 + var9 + var22;
                        this.field2294[var21][var24] = var25;
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
