import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class18 {

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "I")
    public int field212;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
    private int field213;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "[I")
    private int[] field209;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "[I")
    private int[] field210;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "[[F")
    private float[][] field211;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "[I")
    private int[] field214;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "()[F", line = 3)
    public final float[] method136() {
        return this.field211[this.method139()];
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "()V", line = 8)
    private final void method137() {
        int[] var1 = new int[this.field213];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field213; var3++) {
            int var4 = this.field209[var3];
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
        this.field214 = new int[8];
        int var13 = 0;
        for (int var14 = 0; var14 < this.field213; var14++) {
            int var15 = this.field209[var14];
            if (var15 != 0) {
                int var16 = var1[var14];
                int var17 = 0;
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = Integer.MIN_VALUE >>> var18;
                    if ((var16 & var19) == 0) {
                        var17++;
                    } else {
                        if (this.field214[var17] == 0) {
                            this.field214[var17] = var13;
                        }
                        var17 = this.field214[var17];
                    }
                    if (var17 >= this.field214.length) {
                        int[] var20 = new int[this.field214.length * 2];
                        for (int var21 = 0; var21 < this.field214.length; var21++) {
                            var20[var21] = this.field214[var21];
                        }
                        this.field214 = var20;
                    }
                    int var22 = var19 >>> 1;
                }
                this.field214[var17] = ~var14;
                if (var17 >= var13) {
                    var13 = var17 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)I", line = 149)
    private static final int method138(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class238.method1660(arg1, var2, 0) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "()I", line = 157)
    public final int method139() {
        int var1;
        for (var1 = 0; this.field214[var1] >= 0; var1 = class155.method1170() == 0 ? var1 + 1 : this.field214[var1]) {
        }
        return ~this.field214[var1];
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V", line = 165)
    public class18() {
        class155.method1163(24);
        this.field212 = class155.method1163(16);
        this.field213 = class155.method1163(24);
        this.field209 = new int[this.field213];
        boolean var1 = class155.method1170() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class155.method1163(5) + 1;
            while (var2 < this.field213) {
                int var4 = class155.method1163(class36.method273(16, this.field213 - var2));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field209[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class155.method1170() != 0;
            for (int var7 = 0; var7 < this.field213; var7++) {
                if (var6 && class155.method1170() == 0) {
                    this.field209[var7] = 0;
                } else {
                    this.field209[var7] = class155.method1163(5) + 1;
                }
            }
        }
        this.method137();
        int var8 = class155.method1163(4);
        if (var8 > 0) {
            float var9 = class155.method1166(class155.method1163(32));
            float var10 = class155.method1166(class155.method1163(32));
            int var11 = class155.method1163(4) + 1;
            boolean var12 = class155.method1170() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method138(this.field213, this.field212);
            } else {
                var13 = this.field213 * this.field212;
            }
            this.field210 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field210[var14] = class155.method1163(var11);
            }
            this.field211 = new float[this.field213][this.field212];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field213; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field212; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field210[var19] * var10 + var9 + var16;
                        this.field211[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field213; var21++) {
                    float var22 = 0.0F;
                    int var23 = this.field212 * var21;
                    for (int var24 = 0; var24 < this.field212; var24++) {
                        float var25 = (float) this.field210[var23] * var10 + var9 + var22;
                        this.field211[var21][var24] = var25;
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
