import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class202 {

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public int field3319;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    private int field3320;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "[I")
    private int[] field3318;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "[I")
    private int[] field3317;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "[[F")
    private float[][] field3321;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "[I")
    private int[] field3322;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "()V", line = 5)
    private final void method1412() {
        int[] var1 = new int[this.field3320];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field3320; var3++) {
            int var4 = this.field3318[var3];
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
        this.field3322 = new int[8];
        int var13 = 0;
        for (int var14 = 0; var14 < this.field3320; var14++) {
            int var15 = this.field3318[var14];
            if (var15 != 0) {
                int var16 = var1[var14];
                int var17 = 0;
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = Integer.MIN_VALUE >>> var18;
                    if ((var16 & var19) == 0) {
                        var17++;
                    } else {
                        if (this.field3322[var17] == 0) {
                            this.field3322[var17] = var13;
                        }
                        var17 = this.field3322[var17];
                    }
                    if (var17 >= this.field3322.length) {
                        int[] var20 = new int[this.field3322.length * 2];
                        for (int var21 = 0; var21 < this.field3322.length; var21++) {
                            var20[var21] = this.field3322[var21];
                        }
                        this.field3322 = var20;
                    }
                    int var22 = var19 >>> 1;
                }
                this.field3322[var17] = ~var14;
                if (var17 >= var13) {
                    var13 = var17 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "()[F", line = 144)
    public final float[] method1413() {
        return this.field3321[this.method1415()];
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V", line = 149)
    public class202() {
        class108.method803(24);
        this.field3319 = class108.method803(16);
        this.field3320 = class108.method803(24);
        this.field3318 = new int[this.field3320];
        boolean var1 = class108.method794() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class108.method803(5) + 1;
            while (var2 < this.field3320) {
                int var4 = class108.method803(class15.method60(false, this.field3320 - var2));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field3318[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class108.method794() != 0;
            for (int var7 = 0; var7 < this.field3320; var7++) {
                if (var6 && class108.method794() == 0) {
                    this.field3318[var7] = 0;
                } else {
                    this.field3318[var7] = class108.method803(5) + 1;
                }
            }
        }
        this.method1412();
        int var8 = class108.method803(4);
        if (var8 > 0) {
            float var9 = class108.method802(class108.method803(32));
            float var10 = class108.method802(class108.method803(32));
            int var11 = class108.method803(4) + 1;
            boolean var12 = class108.method794() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method1414(this.field3320, this.field3319);
            } else {
                var13 = this.field3320 * this.field3319;
            }
            this.field3317 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field3317[var14] = class108.method803(var11);
            }
            this.field3321 = new float[this.field3320][this.field3319];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field3320; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field3319; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field3317[var19] * var10 + var9 + var16;
                        this.field3321[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field3320; var21++) {
                    float var22 = 0.0F;
                    int var23 = this.field3319 * var21;
                    for (int var24 = 0; var24 < this.field3319; var24++) {
                        float var25 = (float) this.field3317[var23] * var10 + var9 + var22;
                        this.field3321[var21][var24] = var25;
                        if (var12) {
                            var22 = var25;
                        }
                        var23++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II)I", line = 292)
    private static final int method1414(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class206.method1439(arg1, var2, (byte) -97) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "()I", line = 301)
    public final int method1415() {
        int var1;
        for (var1 = 0; this.field3322[var1] >= 0; var1 = class108.method794() == 0 ? var1 + 1 : this.field3322[var1]) {
        }
        return ~this.field3322[var1];
    }
}
