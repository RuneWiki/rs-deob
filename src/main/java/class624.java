import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!waa")
public class class624 {

    @OriginalMember(owner = "client!waa", name = "e", descriptor = "I")
    public int field8409;

    @OriginalMember(owner = "client!waa", name = "d", descriptor = "I")
    private int field8408;

    @OriginalMember(owner = "client!waa", name = "c", descriptor = "[I")
    private int[] field8407;

    @OriginalMember(owner = "client!waa", name = "b", descriptor = "[I")
    private int[] field8406;

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "[[F")
    private float[][] field8405;

    @OriginalMember(owner = "client!waa", name = "f", descriptor = "[I")
    private int[] field8410;

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "()I")
    public final int method3518() {
        int var1;
        for (var1 = 0; this.field8410[var1] >= 0; var1 = class187.method1171() == 0 ? var1 + 1 : this.field8410[var1]) {
        }
        return ~this.field8410[var1];
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(II)I")
    private static final int method3519(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class583.method3384(false, var2, arg1) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!waa", name = "b", descriptor = "()[F")
    public final float[] method3520() {
        return this.field8405[this.method3518()];
    }

    @OriginalMember(owner = "client!waa", name = "c", descriptor = "()V")
    private final void method3521() {
        int[] var1 = new int[this.field8408];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field8408; var3++) {
            int var14 = this.field8407[var3];
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
        this.field8410 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field8408; var5++) {
            int var6 = this.field8407[var5];
            if (var6 != 0) {
                int var7 = var1[var5];
                int var8 = 0;
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = Integer.MIN_VALUE >>> var9;
                    if ((var7 & var10) == 0) {
                        var8++;
                    } else {
                        if (this.field8410[var8] == 0) {
                            this.field8410[var8] = var4;
                        }
                        var8 = this.field8410[var8];
                    }
                    if (var8 >= this.field8410.length) {
                        int[] var11 = new int[this.field8410.length * 2];
                        for (int var12 = 0; var12 < this.field8410.length; var12++) {
                            var11[var12] = this.field8410[var12];
                        }
                        this.field8410 = var11;
                    }
                    int var13 = var10 >>> 1;
                }
                this.field8410[var8] = ~var5;
                if (var8 >= var4) {
                    var4 = var8 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!waa", name = "<init>", descriptor = "()V")
    public class624() {
        class187.method1176(24);
        this.field8409 = class187.method1176(16);
        this.field8408 = class187.method1176(24);
        this.field8407 = new int[this.field8408];
        boolean var1 = class187.method1171() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class187.method1176(5) + 1;
            while (var2 < this.field8408) {
                int var4 = class187.method1176(class200.method1219(this.field8408 - var2, 8));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field8407[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class187.method1171() != 0;
            for (int var7 = 0; var7 < this.field8408; var7++) {
                if (var6 && class187.method1171() == 0) {
                    this.field8407[var7] = 0;
                } else {
                    this.field8407[var7] = class187.method1176(5) + 1;
                }
            }
        }
        this.method3521();
        int var8 = class187.method1176(4);
        if (var8 > 0) {
            float var9 = class187.method1169(class187.method1176(32));
            float var10 = class187.method1169(class187.method1176(32));
            int var11 = class187.method1176(4) + 1;
            boolean var12 = class187.method1171() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method3519(this.field8408, this.field8409);
            } else {
                var13 = this.field8409 * this.field8408;
            }
            this.field8406 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field8406[var14] = class187.method1176(var11);
            }
            this.field8405 = new float[this.field8408][this.field8409];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field8408; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field8409; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field8406[var19] * var10 + var9 + var16;
                        this.field8405[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
                return;
            }
            for (int var21 = 0; var21 < this.field8408; var21++) {
                float var22 = 0.0F;
                int var23 = this.field8409 * var21;
                for (int var24 = 0; var24 < this.field8409; var24++) {
                    float var25 = (float) this.field8406[var23] * var10 + var9 + var22;
                    this.field8405[var21][var24] = var25;
                    if (var12) {
                        var22 = var25;
                    }
                    var23++;
                }
            }
        }
    }
}
