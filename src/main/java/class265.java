import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class265 {

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "I")
    public int field4562;

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "I")
    private int field4565;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "[I")
    private int[] field4563;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "[I")
    private int[] field4564;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "[[F")
    private float[][] field4561;

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "[I")
    private int[] field4566;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(II)I", line = 5)
    private static final int method1873(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class277.method1951(var2, arg1, -1) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "()I", line = 16)
    public final int method1874() {
        int var1;
        for (var1 = 0; this.field4566[var1] >= 0; var1 = class53.method421() == 0 ? var1 + 1 : this.field4566[var1]) {
        }
        return ~this.field4566[var1];
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "()V", line = 25)
    private final void method1875() {
        int[] var1 = new int[this.field4565];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field4565; var3++) {
            int var4 = this.field4563[var3];
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
        this.field4566 = new int[8];
        int var13 = 0;
        for (int var14 = 0; var14 < this.field4565; var14++) {
            int var15 = this.field4563[var14];
            if (var15 != 0) {
                int var16 = var1[var14];
                int var17 = 0;
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = Integer.MIN_VALUE >>> var18;
                    if ((var16 & var19) == 0) {
                        var17++;
                    } else {
                        if (this.field4566[var17] == 0) {
                            this.field4566[var17] = var13;
                        }
                        var17 = this.field4566[var17];
                    }
                    if (var17 >= this.field4566.length) {
                        int[] var20 = new int[this.field4566.length * 2];
                        for (int var21 = 0; var21 < this.field4566.length; var21++) {
                            var20[var21] = this.field4566[var21];
                        }
                        this.field4566 = var20;
                    }
                    int var22 = var19 >>> 1;
                }
                this.field4566[var17] = ~var14;
                if (var17 >= var13) {
                    var13 = var17 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "()V", line = 162)
    public class265() {
        class53.method424(24);
        this.field4562 = class53.method424(16);
        this.field4565 = class53.method424(24);
        this.field4563 = new int[this.field4565];
        boolean var1 = class53.method421() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class53.method424(5) + 1;
            while (var2 < this.field4565) {
                int var4 = class53.method424(class27.method239(this.field4565 - var2, (byte) -97));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field4563[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class53.method421() != 0;
            for (int var7 = 0; var7 < this.field4565; var7++) {
                if (var6 && class53.method421() == 0) {
                    this.field4563[var7] = 0;
                } else {
                    this.field4563[var7] = class53.method424(5) + 1;
                }
            }
        }
        this.method1875();
        int var8 = class53.method424(4);
        if (var8 > 0) {
            float var9 = class53.method420(class53.method424(32));
            float var10 = class53.method420(class53.method424(32));
            int var11 = class53.method424(4) + 1;
            boolean var12 = class53.method421() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method1873(this.field4565, this.field4562);
            } else {
                var13 = this.field4565 * this.field4562;
            }
            this.field4564 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field4564[var14] = class53.method424(var11);
            }
            this.field4561 = new float[this.field4565][this.field4562];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field4565; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field4562; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field4564[var19] * var10 + var9 + var16;
                        this.field4561[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field4565; var21++) {
                    float var22 = 0.0F;
                    int var23 = this.field4562 * var21;
                    for (int var24 = 0; var24 < this.field4562; var24++) {
                        float var25 = (float) this.field4564[var23] * var10 + var9 + var22;
                        this.field4561[var21][var24] = var25;
                        if (var12) {
                            var22 = var25;
                        }
                        var23++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "()[F", line = 304)
    public final float[] method1876() {
        return this.field4561[this.method1874()];
    }
}
