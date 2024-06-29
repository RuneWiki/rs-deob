import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class388 {

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
    public int field5793;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "I")
    private int field5794;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "[I")
    private int[] field5791;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "[I")
    private int[] field5790;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "[[F")
    private float[][] field5792;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "[I")
    private int[] field5795;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "()I", line = 4)
    public final int method2530() {
        int var1;
        for (var1 = 0; this.field5795[var1] >= 0; var1 = class375.method2488() == 0 ? var1 + 1 : this.field5795[var1]) {
        }
        return ~this.field5795[var1];
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "()[F", line = 11)
    public final float[] method2531() {
        return this.field5792[this.method2530()];
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "()V", line = 19)
    private final void method2532() {
        int[] var1 = new int[this.field5794];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field5794; var3++) {
            int var14 = this.field5791[var3];
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
        this.field5795 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field5794; var5++) {
            int var6 = this.field5791[var5];
            if (var6 != 0) {
                int var7 = var1[var5];
                int var8 = 0;
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = Integer.MIN_VALUE >>> var9;
                    if ((var7 & var10) == 0) {
                        var8++;
                    } else {
                        if (this.field5795[var8] == 0) {
                            this.field5795[var8] = var4;
                        }
                        var8 = this.field5795[var8];
                    }
                    if (var8 >= this.field5795.length) {
                        int[] var11 = new int[this.field5795.length * 2];
                        for (int var12 = 0; var12 < this.field5795.length; var12++) {
                            var11[var12] = this.field5795[var12];
                        }
                        this.field5795 = var11;
                    }
                    int var13 = var10 >>> 1;
                }
                this.field5795[var8] = ~var5;
                if (var8 >= var4) {
                    var4 = var8 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)I", line = 158)
    private static final int method2533(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class18.method138((byte) 118, var2, arg1) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "()V", line = 165)
    public class388() {
        class375.method2482(24);
        this.field5793 = class375.method2482(16);
        this.field5794 = class375.method2482(24);
        this.field5791 = new int[this.field5794];
        boolean var1 = class375.method2488() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class375.method2482(5) + 1;
            while (var2 < this.field5794) {
                int var4 = class375.method2482(class39.method307(1, this.field5794 - var2));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field5791[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class375.method2488() != 0;
            for (int var7 = 0; var7 < this.field5794; var7++) {
                if (var6 && class375.method2488() == 0) {
                    this.field5791[var7] = 0;
                } else {
                    this.field5791[var7] = class375.method2482(5) + 1;
                }
            }
        }
        this.method2532();
        int var8 = class375.method2482(4);
        if (var8 > 0) {
            float var9 = class375.method2480(class375.method2482(32));
            float var10 = class375.method2480(class375.method2482(32));
            int var11 = class375.method2482(4) + 1;
            boolean var12 = class375.method2488() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method2533(this.field5794, this.field5793);
            } else {
                var13 = this.field5794 * this.field5793;
            }
            this.field5790 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field5790[var14] = class375.method2482(var11);
            }
            this.field5792 = new float[this.field5794][this.field5793];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field5794; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field5793; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field5790[var19] * var10 + var9 + var16;
                        this.field5792[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
                return;
            }
            for (int var21 = 0; var21 < this.field5794; var21++) {
                float var22 = 0.0F;
                int var23 = this.field5793 * var21;
                for (int var24 = 0; var24 < this.field5793; var24++) {
                    float var25 = (float) this.field5790[var23] * var10 + var9 + var22;
                    this.field5792[var21][var24] = var25;
                    if (var12) {
                        var22 = var25;
                    }
                    var23++;
                }
            }
        }
    }
}
