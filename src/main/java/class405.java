import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class405 {

    @OriginalMember(owner = "client!o", name = "a", descriptor = "I")
    public int field5855;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "I")
    private int field5858;

    @OriginalMember(owner = "client!o", name = "e", descriptor = "[I")
    private int[] field5859;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "[I")
    private int[] field5857;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "[[F")
    private float[][] field5856;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "[I")
    private int[] field5860;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "()I", line = 5)
    public final int method2528() {
        int var1;
        for (var1 = 0; this.field5860[var1] >= 0; var1 = class194.method1342() == 0 ? var1 + 1 : this.field5860[var1]) {
        }
        return ~this.field5860[var1];
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)I", line = 13)
    private static final int method2529(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class303.method2017((byte) 73, arg1, var2) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "()[F", line = 21)
    public final float[] method2530() {
        return this.field5856[this.method2528()];
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "()V", line = 27)
    private final void method2531() {
        int[] var1 = new int[this.field5858];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field5858; var3++) {
            int var14 = this.field5859[var3];
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
        this.field5860 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field5858; var5++) {
            int var6 = this.field5859[var5];
            if (var6 != 0) {
                int var7 = var1[var5];
                int var8 = 0;
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = Integer.MIN_VALUE >>> var9;
                    if ((var7 & var10) == 0) {
                        var8++;
                    } else {
                        if (this.field5860[var8] == 0) {
                            this.field5860[var8] = var4;
                        }
                        var8 = this.field5860[var8];
                    }
                    if (var8 >= this.field5860.length) {
                        int[] var11 = new int[this.field5860.length * 2];
                        for (int var12 = 0; var12 < this.field5860.length; var12++) {
                            var11[var12] = this.field5860[var12];
                        }
                        this.field5860 = var11;
                    }
                    int var13 = var10 >>> 1;
                }
                this.field5860[var8] = ~var5;
                if (var8 >= var4) {
                    var4 = var8 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V", line = 165)
    public class405() {
        class194.method1349(24);
        this.field5855 = class194.method1349(16);
        this.field5858 = class194.method1349(24);
        this.field5859 = new int[this.field5858];
        boolean var1 = class194.method1342() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class194.method1349(5) + 1;
            while (var2 < this.field5858) {
                int var4 = class194.method1349(class446.method2749((byte) -19, this.field5858 - var2));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field5859[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class194.method1342() != 0;
            for (int var7 = 0; var7 < this.field5858; var7++) {
                if (var6 && class194.method1342() == 0) {
                    this.field5859[var7] = 0;
                } else {
                    this.field5859[var7] = class194.method1349(5) + 1;
                }
            }
        }
        this.method2531();
        int var8 = class194.method1349(4);
        if (var8 > 0) {
            float var9 = class194.method1350(class194.method1349(32));
            float var10 = class194.method1350(class194.method1349(32));
            int var11 = class194.method1349(4) + 1;
            boolean var12 = class194.method1342() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method2529(this.field5858, this.field5855);
            } else {
                var13 = this.field5858 * this.field5855;
            }
            this.field5857 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field5857[var14] = class194.method1349(var11);
            }
            this.field5856 = new float[this.field5858][this.field5855];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field5858; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field5855; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field5857[var19] * var10 + var9 + var16;
                        this.field5856[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
                return;
            }
            for (int var21 = 0; var21 < this.field5858; var21++) {
                float var22 = 0.0F;
                int var23 = this.field5855 * var21;
                for (int var24 = 0; var24 < this.field5855; var24++) {
                    float var25 = (float) this.field5857[var23] * var10 + var9 + var22;
                    this.field5856[var21][var24] = var25;
                    if (var12) {
                        var22 = var25;
                    }
                    var23++;
                }
            }
        }
    }
}
