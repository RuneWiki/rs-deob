import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class36 {

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
    public int field544;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
    private int field548;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "[I")
    private int[] field545;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "[I")
    private int[] field546;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "[[F")
    private float[][] field547;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "[I")
    private int[] field549;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "()I", line = 5)
    public final int method298() {
        int var1;
        for (var1 = 0; this.field549[var1] >= 0; var1 = class136.method943() == 0 ? var1 + 1 : this.field549[var1]) {
        }
        return ~this.field549[var1];
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)I", line = 14)
    private static final int method299(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class268.method1894(101, arg1, var2) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "()[F", line = 21)
    public final float[] method300() {
        return this.field547[this.method298()];
    }

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "()V", line = 25)
    private final void method301() {
        int[] var1 = new int[this.field548];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field548; var3++) {
            int var4 = this.field545[var3];
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
        this.field549 = new int[8];
        int var13 = 0;
        for (int var14 = 0; var14 < this.field548; var14++) {
            int var15 = this.field545[var14];
            if (var15 != 0) {
                int var16 = var1[var14];
                int var17 = 0;
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = Integer.MIN_VALUE >>> var18;
                    if ((var16 & var19) == 0) {
                        var17++;
                    } else {
                        if (this.field549[var17] == 0) {
                            this.field549[var17] = var13;
                        }
                        var17 = this.field549[var17];
                    }
                    if (var17 >= this.field549.length) {
                        int[] var20 = new int[this.field549.length * 2];
                        for (int var21 = 0; var21 < this.field549.length; var21++) {
                            var20[var21] = this.field549[var21];
                        }
                        this.field549 = var20;
                    }
                    int var22 = var19 >>> 1;
                }
                this.field549[var17] = ~var14;
                if (var17 >= var13) {
                    var13 = var17 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "()V", line = 165)
    public class36() {
        class136.method934(24);
        this.field544 = class136.method934(16);
        this.field548 = class136.method934(24);
        this.field545 = new int[this.field548];
        boolean var1 = class136.method943() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class136.method934(5) + 1;
            while (var2 < this.field548) {
                int var4 = class136.method934(class267.method1882(this.field548 - var2, 0));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field545[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class136.method943() != 0;
            for (int var7 = 0; var7 < this.field548; var7++) {
                if (var6 && class136.method943() == 0) {
                    this.field545[var7] = 0;
                } else {
                    this.field545[var7] = class136.method934(5) + 1;
                }
            }
        }
        this.method301();
        int var8 = class136.method934(4);
        if (var8 > 0) {
            float var9 = class136.method937(class136.method934(32));
            float var10 = class136.method937(class136.method934(32));
            int var11 = class136.method934(4) + 1;
            boolean var12 = class136.method943() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method299(this.field548, this.field544);
            } else {
                var13 = this.field548 * this.field544;
            }
            this.field546 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field546[var14] = class136.method934(var11);
            }
            this.field547 = new float[this.field548][this.field544];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field548; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field544; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field546[var19] * var10 + var9 + var16;
                        this.field547[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field548; var21++) {
                    float var22 = 0.0F;
                    int var23 = this.field544 * var21;
                    for (int var24 = 0; var24 < this.field544; var24++) {
                        float var25 = (float) this.field546[var23] * var10 + var9 + var22;
                        this.field547[var21][var24] = var25;
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
