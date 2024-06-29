import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class5 {

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
    public int field39;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
    private int field37;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "[I")
    private int[] field38;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "[I")
    private int[] field35;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "[[F")
    private float[][] field36;

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "[I")
    private int[] field40;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "()I", line = 4)
    public final int method23() {
        int var1;
        for (var1 = 0; this.field40[var1] >= 0; var1 = class124.method1001() == 0 ? var1 + 1 : this.field40[var1]) {
        }
        return ~this.field40[var1];
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)I", line = 12)
    private static final int method24(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class171.method1314(var2, arg1, true) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "()[F", line = 24)
    public final float[] method25() {
        return this.field36[this.method23()];
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "()V", line = 28)
    private final void method26() {
        int[] var1 = new int[this.field37];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field37; var3++) {
            int var4 = this.field38[var3];
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
        this.field40 = new int[8];
        int var13 = 0;
        for (int var14 = 0; var14 < this.field37; var14++) {
            int var15 = this.field38[var14];
            if (var15 != 0) {
                int var16 = var1[var14];
                int var17 = 0;
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = Integer.MIN_VALUE >>> var18;
                    if ((var16 & var19) == 0) {
                        var17++;
                    } else {
                        if (this.field40[var17] == 0) {
                            this.field40[var17] = var13;
                        }
                        var17 = this.field40[var17];
                    }
                    if (var17 >= this.field40.length) {
                        int[] var20 = new int[this.field40.length * 2];
                        for (int var21 = 0; var21 < this.field40.length; var21++) {
                            var20[var21] = this.field40[var21];
                        }
                        this.field40 = var20;
                    }
                    int var22 = var19 >>> 1;
                }
                this.field40[var17] = ~var14;
                if (var17 >= var13) {
                    var13 = var17 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "()V", line = 165)
    public class5() {
        class124.method1008(24);
        this.field39 = class124.method1008(16);
        this.field37 = class124.method1008(24);
        this.field38 = new int[this.field37];
        boolean var1 = class124.method1001() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class124.method1008(5) + 1;
            while (var2 < this.field37) {
                int var4 = class124.method1008(class64.method440(6367, this.field37 - var2));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field38[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class124.method1001() != 0;
            for (int var7 = 0; var7 < this.field37; var7++) {
                if (var6 && class124.method1001() == 0) {
                    this.field38[var7] = 0;
                } else {
                    this.field38[var7] = class124.method1008(5) + 1;
                }
            }
        }
        this.method26();
        int var8 = class124.method1008(4);
        if (var8 > 0) {
            float var9 = class124.method1006(class124.method1008(32));
            float var10 = class124.method1006(class124.method1008(32));
            int var11 = class124.method1008(4) + 1;
            boolean var12 = class124.method1001() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method24(this.field37, this.field39);
            } else {
                var13 = this.field39 * this.field37;
            }
            this.field35 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field35[var14] = class124.method1008(var11);
            }
            this.field36 = new float[this.field37][this.field39];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field37; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field39; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field35[var19] * var10 + var9 + var16;
                        this.field36[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field37; var21++) {
                    float var22 = 0.0F;
                    int var23 = this.field39 * var21;
                    for (int var24 = 0; var24 < this.field39; var24++) {
                        float var25 = (float) this.field35[var23] * var10 + var9 + var22;
                        this.field36[var21][var24] = var25;
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
