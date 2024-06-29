import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class3 {

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
    public int field61;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
    private int field62;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "[I")
    private int[] field64;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "[I")
    private int[] field65;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "[[F")
    private float[][] field63;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "[I")
    private int[] field66;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)I")
    private static final int method21(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class136.method1101(var2, arg1, (byte) 84) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "()[F")
    public final float[] method22() {
        return this.field63[this.method23()];
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "()I")
    public final int method23() {
        int var1;
        for (var1 = 0; this.field66[var1] >= 0; var1 = class114.method932() == 0 ? var1 + 1 : this.field66[var1]) {
        }
        return ~this.field66[var1];
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "()V")
    private final void method24() {
        int[] var1 = new int[this.field62];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field62; var3++) {
            int var14 = this.field64[var3];
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
        this.field66 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field62; var5++) {
            int var6 = this.field64[var5];
            if (var6 != 0) {
                int var7 = var1[var5];
                int var8 = 0;
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = Integer.MIN_VALUE >>> var9;
                    if ((var7 & var10) == 0) {
                        var8++;
                    } else {
                        if (this.field66[var8] == 0) {
                            this.field66[var8] = var4;
                        }
                        var8 = this.field66[var8];
                    }
                    if (var8 >= this.field66.length) {
                        int[] var11 = new int[this.field66.length * 2];
                        for (int var12 = 0; var12 < this.field66.length; var12++) {
                            var11[var12] = this.field66[var12];
                        }
                        this.field66 = var11;
                    }
                    int var13 = var10 >>> 1;
                }
                this.field66[var8] = ~var5;
                if (var8 >= var4) {
                    var4 = var8 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "()V")
    public class3() {
        class114.method940(24);
        this.field61 = class114.method940(16);
        this.field62 = class114.method940(24);
        this.field64 = new int[this.field62];
        boolean var1 = class114.method932() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class114.method940(5) + 1;
            while (var2 < this.field62) {
                int var4 = class114.method940(class94.method790(this.field62 - var2, 36));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field64[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class114.method932() != 0;
            for (int var7 = 0; var7 < this.field62; var7++) {
                if (var6 && class114.method932() == 0) {
                    this.field64[var7] = 0;
                } else {
                    this.field64[var7] = class114.method940(5) + 1;
                }
            }
        }
        this.method24();
        int var8 = class114.method940(4);
        if (var8 > 0) {
            float var9 = class114.method936(class114.method940(32));
            float var10 = class114.method936(class114.method940(32));
            int var11 = class114.method940(4) + 1;
            boolean var12 = class114.method932() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method21(this.field62, this.field61);
            } else {
                var13 = this.field62 * this.field61;
            }
            this.field65 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field65[var14] = class114.method940(var11);
            }
            this.field63 = new float[this.field62][this.field61];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field62; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field61; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field65[var19] * var10 + var9 + var16;
                        this.field63[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
                return;
            }
            for (int var21 = 0; var21 < this.field62; var21++) {
                float var22 = 0.0F;
                int var23 = this.field61 * var21;
                for (int var24 = 0; var24 < this.field61; var24++) {
                    float var25 = (float) this.field65[var23] * var10 + var9 + var22;
                    this.field63[var21][var24] = var25;
                    if (var12) {
                        var22 = var25;
                    }
                    var23++;
                }
            }
        }
    }
}
