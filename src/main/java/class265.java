import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class265 {

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "I")
    public int field4105;

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "I")
    private int field4104;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "[I")
    private int[] field4103;

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "[I")
    private int[] field4106;

    @OriginalMember(owner = "client!cn", name = "e", descriptor = "[[F")
    private float[][] field4107;

    @OriginalMember(owner = "client!cn", name = "f", descriptor = "[I")
    private int[] field4108;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)I", line = 5)
    private static final int method1763(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class318.method2191(arg1, var2, 0) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "()[F", line = 12)
    public final float[] method1764() {
        return this.field4107[this.method1766()];
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "()V", line = 18)
    private final void method1765() {
        int[] var1 = new int[this.field4104];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field4104; var3++) {
            int var4 = this.field4103[var3];
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
        this.field4108 = new int[8];
        int var13 = 0;
        for (int var14 = 0; var14 < this.field4104; var14++) {
            int var15 = this.field4103[var14];
            if (var15 != 0) {
                int var16 = var1[var14];
                int var17 = 0;
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = Integer.MIN_VALUE >>> var18;
                    if ((var16 & var19) == 0) {
                        var17++;
                    } else {
                        if (this.field4108[var17] == 0) {
                            this.field4108[var17] = var13;
                        }
                        var17 = this.field4108[var17];
                    }
                    if (var17 >= this.field4108.length) {
                        int[] var20 = new int[this.field4108.length * 2];
                        for (int var21 = 0; var21 < this.field4108.length; var21++) {
                            var20[var21] = this.field4108[var21];
                        }
                        this.field4108 = var20;
                    }
                    int var22 = var19 >>> 1;
                }
                this.field4108[var17] = ~var14;
                if (var17 >= var13) {
                    var13 = var17 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "()I", line = 158)
    public final int method1766() {
        int var1;
        for (var1 = 0; this.field4108[var1] >= 0; var1 = class57.method443() == 0 ? var1 + 1 : this.field4108[var1]) {
        }
        return ~this.field4108[var1];
    }

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "()V", line = 165)
    public class265() {
        class57.method441(24);
        this.field4105 = class57.method441(16);
        this.field4104 = class57.method441(24);
        this.field4103 = new int[this.field4104];
        boolean var1 = class57.method443() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class57.method441(5) + 1;
            while (var2 < this.field4104) {
                int var4 = class57.method441(class223.method1482(this.field4104 - var2, (byte) 119));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field4103[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class57.method443() != 0;
            for (int var7 = 0; var7 < this.field4104; var7++) {
                if (var6 && class57.method443() == 0) {
                    this.field4103[var7] = 0;
                } else {
                    this.field4103[var7] = class57.method441(5) + 1;
                }
            }
        }
        this.method1765();
        int var8 = class57.method441(4);
        if (var8 > 0) {
            float var9 = class57.method439(class57.method441(32));
            float var10 = class57.method439(class57.method441(32));
            int var11 = class57.method441(4) + 1;
            boolean var12 = class57.method443() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method1763(this.field4104, this.field4105);
            } else {
                var13 = this.field4105 * this.field4104;
            }
            this.field4106 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field4106[var14] = class57.method441(var11);
            }
            this.field4107 = new float[this.field4104][this.field4105];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field4104; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field4105; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field4106[var19] * var10 + var9 + var16;
                        this.field4107[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field4104; var21++) {
                    float var22 = 0.0F;
                    int var23 = this.field4105 * var21;
                    for (int var24 = 0; var24 < this.field4105; var24++) {
                        float var25 = (float) this.field4106[var23] * var10 + var9 + var22;
                        this.field4107[var21][var24] = var25;
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
