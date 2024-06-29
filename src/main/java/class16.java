import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class16 {

    @OriginalMember(owner = "client!be", name = "e", descriptor = "I")
    public int field357;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "I")
    private int field356;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "[I")
    private int[] field353;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "[I")
    private int[] field355;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "[[F")
    private float[][] field354;

    @OriginalMember(owner = "client!be", name = "f", descriptor = "[I")
    private int[] field358;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "()[F")
    public final float[] method148() {
        return this.field354[this.method149()];
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "()I")
    public final int method149() {
        int var1;
        for (var1 = 0; this.field358[var1] >= 0; var1 = class128.method818() == 0 ? var1 + 1 : this.field358[var1]) {
        }
        return ~this.field358[var1];
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II)I")
    private static final int method150(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class195.method1295(var2, arg1, -1140) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "()V")
    private final void method151() {
        int[] var1 = new int[this.field356];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field356; var3++) {
            int var14 = this.field353[var3];
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
        this.field358 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field356; var5++) {
            int var6 = this.field353[var5];
            if (var6 != 0) {
                int var7 = var1[var5];
                int var8 = 0;
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = Integer.MIN_VALUE >>> var9;
                    if ((var7 & var10) == 0) {
                        var8++;
                    } else {
                        if (this.field358[var8] == 0) {
                            this.field358[var8] = var4;
                        }
                        var8 = this.field358[var8];
                    }
                    if (var8 >= this.field358.length) {
                        int[] var11 = new int[this.field358.length * 2];
                        for (int var12 = 0; var12 < this.field358.length; var12++) {
                            var11[var12] = this.field358[var12];
                        }
                        this.field358 = var11;
                    }
                    int var13 = var10 >>> 1;
                }
                this.field358[var8] = ~var5;
                if (var8 >= var4) {
                    var4 = var8 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V")
    public class16() {
        class128.method819(24);
        this.field357 = class128.method819(16);
        this.field356 = class128.method819(24);
        this.field353 = new int[this.field356];
        boolean var1 = class128.method818() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class128.method819(5) + 1;
            while (var2 < this.field356) {
                int var4 = class128.method819(class191.method1273((byte) -55, this.field356 - var2));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field353[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class128.method818() != 0;
            for (int var7 = 0; var7 < this.field356; var7++) {
                if (var6 && class128.method818() == 0) {
                    this.field353[var7] = 0;
                } else {
                    this.field353[var7] = class128.method819(5) + 1;
                }
            }
        }
        this.method151();
        int var8 = class128.method819(4);
        if (var8 > 0) {
            float var9 = class128.method813(class128.method819(32));
            float var10 = class128.method813(class128.method819(32));
            int var11 = class128.method819(4) + 1;
            boolean var12 = class128.method818() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method150(this.field356, this.field357);
            } else {
                var13 = this.field357 * this.field356;
            }
            this.field355 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field355[var14] = class128.method819(var11);
            }
            this.field354 = new float[this.field356][this.field357];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field356; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field357; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field355[var19] * var10 + var9 + var16;
                        this.field354[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
                return;
            }
            for (int var21 = 0; var21 < this.field356; var21++) {
                float var22 = 0.0F;
                int var23 = this.field357 * var21;
                for (int var24 = 0; var24 < this.field357; var24++) {
                    float var25 = (float) this.field355[var23] * var10 + var9 + var22;
                    this.field354[var21][var24] = var25;
                    if (var12) {
                        var22 = var25;
                    }
                    var23++;
                }
            }
        }
    }
}
