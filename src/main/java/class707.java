import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ufa")
public class class707 {

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "I")
    public int field9664;

    @OriginalMember(owner = "client!ufa", name = "c", descriptor = "I")
    private int field9666;

    @OriginalMember(owner = "client!ufa", name = "e", descriptor = "[I")
    private int[] field9668;

    @OriginalMember(owner = "client!ufa", name = "b", descriptor = "[I")
    private int[] field9665;

    @OriginalMember(owner = "client!ufa", name = "d", descriptor = "[[F")
    private float[][] field9667;

    @OriginalMember(owner = "client!ufa", name = "f", descriptor = "[I")
    private int[] field9669;

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "()[F", line = 5)
    public final float[] method3928() {
        return this.field9667[this.method3930()];
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(II)I", line = 9)
    private static final int method3929(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class160.method1108(false, arg1, var2) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!ufa", name = "b", descriptor = "()I", line = 19)
    public final int method3930() {
        int var1;
        for (var1 = 0; this.field9669[var1] >= 0; var1 = class590.method3317() == 0 ? var1 + 1 : this.field9669[var1]) {
        }
        return ~this.field9669[var1];
    }

    @OriginalMember(owner = "client!ufa", name = "c", descriptor = "()V", line = 27)
    private final void method3931() {
        int[] var1 = new int[this.field9666];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field9666; var3++) {
            int var14 = this.field9668[var3];
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
        this.field9669 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field9666; var5++) {
            int var6 = this.field9668[var5];
            if (var6 != 0) {
                int var7 = var1[var5];
                int var8 = 0;
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = Integer.MIN_VALUE >>> var9;
                    if ((var7 & var10) == 0) {
                        var8++;
                    } else {
                        if (this.field9669[var8] == 0) {
                            this.field9669[var8] = var4;
                        }
                        var8 = this.field9669[var8];
                    }
                    if (var8 >= this.field9669.length) {
                        int[] var11 = new int[this.field9669.length * 2];
                        for (int var12 = 0; var12 < this.field9669.length; var12++) {
                            var11[var12] = this.field9669[var12];
                        }
                        this.field9669 = var11;
                    }
                    int var13 = var10 >>> 1;
                }
                this.field9669[var8] = ~var5;
                if (var8 >= var4) {
                    var4 = var8 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ufa", name = "<init>", descriptor = "()V", line = 165)
    public class707() {
        class590.method3324(24);
        this.field9664 = class590.method3324(16);
        this.field9666 = class590.method3324(24);
        this.field9668 = new int[this.field9666];
        boolean var1 = class590.method3317() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class590.method3324(5) + 1;
            while (var2 < this.field9666) {
                int var4 = class590.method3324(class436.method2617(this.field9666 - var2, 4));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field9668[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class590.method3317() != 0;
            for (int var7 = 0; var7 < this.field9666; var7++) {
                if (var6 && class590.method3317() == 0) {
                    this.field9668[var7] = 0;
                } else {
                    this.field9668[var7] = class590.method3324(5) + 1;
                }
            }
        }
        this.method3931();
        int var8 = class590.method3324(4);
        if (var8 > 0) {
            float var9 = class590.method3316(class590.method3324(32));
            float var10 = class590.method3316(class590.method3324(32));
            int var11 = class590.method3324(4) + 1;
            boolean var12 = class590.method3317() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method3929(this.field9666, this.field9664);
            } else {
                var13 = this.field9666 * this.field9664;
            }
            this.field9665 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field9665[var14] = class590.method3324(var11);
            }
            this.field9667 = new float[this.field9666][this.field9664];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field9666; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field9664; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field9665[var19] * var10 + var9 + var16;
                        this.field9667[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
                return;
            }
            for (int var21 = 0; var21 < this.field9666; var21++) {
                float var22 = 0.0F;
                int var23 = this.field9664 * var21;
                for (int var24 = 0; var24 < this.field9664; var24++) {
                    float var25 = (float) this.field9665[var23] * var10 + var9 + var22;
                    this.field9667[var21][var24] = var25;
                    if (var12) {
                        var22 = var25;
                    }
                    var23++;
                }
            }
        }
    }
}
