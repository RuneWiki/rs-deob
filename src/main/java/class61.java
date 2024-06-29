import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class61 {

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "I")
    public int field779;

    @OriginalMember(owner = "client!tq", name = "e", descriptor = "I")
    private int field783;

    @OriginalMember(owner = "client!tq", name = "d", descriptor = "[I")
    private int[] field782;

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "[I")
    private int[] field781;

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "[[F")
    private float[][] field780;

    @OriginalMember(owner = "client!tq", name = "f", descriptor = "[I")
    private int[] field784;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "()I")
    public final int method331() {
        int var1;
        for (var1 = 0; this.field784[var1] >= 0; var1 = class249.method1513() == 0 ? var1 + 1 : this.field784[var1]) {
        }
        return ~this.field784[var1];
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(II)I")
    private static final int method332(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class107.method665(1, var2, arg1) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "()V")
    private final void method333() {
        int[] var1 = new int[this.field783];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field783; var3++) {
            int var14 = this.field782[var3];
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
        this.field784 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field783; var5++) {
            int var6 = this.field782[var5];
            if (var6 != 0) {
                int var7 = var1[var5];
                int var8 = 0;
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = Integer.MIN_VALUE >>> var9;
                    if ((var7 & var10) == 0) {
                        var8++;
                    } else {
                        if (this.field784[var8] == 0) {
                            this.field784[var8] = var4;
                        }
                        var8 = this.field784[var8];
                    }
                    if (var8 >= this.field784.length) {
                        int[] var11 = new int[this.field784.length * 2];
                        for (int var12 = 0; var12 < this.field784.length; var12++) {
                            var11[var12] = this.field784[var12];
                        }
                        this.field784 = var11;
                    }
                    int var13 = var10 >>> 1;
                }
                this.field784[var8] = ~var5;
                if (var8 >= var4) {
                    var4 = var8 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "()[F")
    public final float[] method334() {
        return this.field780[this.method331()];
    }

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "()V")
    public class61() {
        class249.method1517(24);
        this.field779 = class249.method1517(16);
        this.field783 = class249.method1517(24);
        this.field782 = new int[this.field783];
        boolean var1 = class249.method1513() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class249.method1517(5) + 1;
            while (var2 < this.field783) {
                int var4 = class249.method1517(class402.method2531(this.field783 - var2, -17));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field782[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class249.method1513() != 0;
            for (int var7 = 0; var7 < this.field783; var7++) {
                if (var6 && class249.method1513() == 0) {
                    this.field782[var7] = 0;
                } else {
                    this.field782[var7] = class249.method1517(5) + 1;
                }
            }
        }
        this.method333();
        int var8 = class249.method1517(4);
        if (var8 > 0) {
            float var9 = class249.method1521(class249.method1517(32));
            float var10 = class249.method1521(class249.method1517(32));
            int var11 = class249.method1517(4) + 1;
            boolean var12 = class249.method1513() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method332(this.field783, this.field779);
            } else {
                var13 = this.field783 * this.field779;
            }
            this.field781 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field781[var14] = class249.method1517(var11);
            }
            this.field780 = new float[this.field783][this.field779];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field783; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field779; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field781[var19] * var10 + var9 + var16;
                        this.field780[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
                return;
            }
            for (int var21 = 0; var21 < this.field783; var21++) {
                float var22 = 0.0F;
                int var23 = this.field779 * var21;
                for (int var24 = 0; var24 < this.field779; var24++) {
                    float var25 = (float) this.field781[var23] * var10 + var9 + var22;
                    this.field780[var21][var24] = var25;
                    if (var12) {
                        var22 = var25;
                    }
                    var23++;
                }
            }
        }
    }
}
