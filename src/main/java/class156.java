import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class156 {

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
    public int field3604;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
    private int field3606;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "[I")
    private int[] field3605;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "[I")
    private int[] field3603;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "[[F")
    private float[][] field3607;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "[I")
    private int[] field3608;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "()V")
    private final void method1219() {
        int[] var1 = new int[this.field3606];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field3606; var3++) {
            int var14 = this.field3605[var3];
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
        this.field3608 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field3606; var5++) {
            int var6 = this.field3605[var5];
            if (var6 != 0) {
                int var7 = var1[var5];
                int var8 = 0;
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = Integer.MIN_VALUE >>> var9;
                    if ((var7 & var10) == 0) {
                        var8++;
                    } else {
                        if (this.field3608[var8] == 0) {
                            this.field3608[var8] = var4;
                        }
                        var8 = this.field3608[var8];
                    }
                    if (var8 >= this.field3608.length) {
                        int[] var11 = new int[this.field3608.length * 2];
                        for (int var12 = 0; var12 < this.field3608.length; var12++) {
                            var11[var12] = this.field3608[var12];
                        }
                        this.field3608 = var11;
                    }
                    int var13 = var10 >>> 1;
                }
                this.field3608[var8] = ~var5;
                if (var8 >= var4) {
                    var4 = var8 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "()I")
    public final int method1220() {
        int var1;
        for (var1 = 0; this.field3608[var1] >= 0; var1 = class5.method26() == 0 ? var1 + 1 : this.field3608[var1]) {
        }
        return ~this.field3608[var1];
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "()V")
    public class156() {
        class5.method19(24);
        this.field3604 = class5.method19(16);
        this.field3606 = class5.method19(24);
        this.field3605 = new int[this.field3606];
        boolean var1 = class5.method26() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class5.method19(5) + 1;
            while (var2 < this.field3606) {
                int var4 = class5.method19(class73.method611(this.field3606 - var2, 4));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field3605[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class5.method26() != 0;
            for (int var7 = 0; var7 < this.field3606; var7++) {
                if (var6 && class5.method26() == 0) {
                    this.field3605[var7] = 0;
                } else {
                    this.field3605[var7] = class5.method19(5) + 1;
                }
            }
        }
        this.method1219();
        int var8 = class5.method19(4);
        if (var8 > 0) {
            float var9 = class5.method18(class5.method19(32));
            float var10 = class5.method18(class5.method19(32));
            int var11 = class5.method19(4) + 1;
            boolean var12 = class5.method26() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method1222(this.field3606, this.field3604);
            } else {
                var13 = this.field3606 * this.field3604;
            }
            this.field3603 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field3603[var14] = class5.method19(var11);
            }
            this.field3607 = new float[this.field3606][this.field3604];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field3606; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field3604; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field3603[var19] * var10 + var9 + var16;
                        this.field3607[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
                return;
            }
            for (int var21 = 0; var21 < this.field3606; var21++) {
                float var22 = 0.0F;
                int var23 = this.field3604 * var21;
                for (int var24 = 0; var24 < this.field3604; var24++) {
                    float var25 = (float) this.field3603[var23] * var10 + var9 + var22;
                    this.field3607[var21][var24] = var25;
                    if (var12) {
                        var22 = var25;
                    }
                    var23++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "()[F")
    public final float[] method1221() {
        return this.field3607[this.method1220()];
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)I")
    private static final int method1222(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class73.method612(arg1, 20745, var2) > arg0; var2--) {
        }
        return var2;
    }
}
