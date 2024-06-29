import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class388 {

    @OriginalMember(owner = "client!os", name = "b", descriptor = "I")
    public int field5851;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "I")
    private int field5850;

    @OriginalMember(owner = "client!os", name = "e", descriptor = "[I")
    private int[] field5854;

    @OriginalMember(owner = "client!os", name = "d", descriptor = "[I")
    private int[] field5853;

    @OriginalMember(owner = "client!os", name = "c", descriptor = "[[F")
    private float[][] field5852;

    @OriginalMember(owner = "client!os", name = "f", descriptor = "[I")
    private int[] field5855;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "()[F", line = 3)
    public final float[] method2327() {
        return this.field5852[this.method2330()];
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "()V", line = 9)
    private final void method2328() {
        int[] var1 = new int[this.field5850];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field5850; var3++) {
            int var14 = this.field5854[var3];
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
        this.field5855 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field5850; var5++) {
            int var6 = this.field5854[var5];
            if (var6 != 0) {
                int var7 = var1[var5];
                int var8 = 0;
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = Integer.MIN_VALUE >>> var9;
                    if ((var7 & var10) == 0) {
                        var8++;
                    } else {
                        if (this.field5855[var8] == 0) {
                            this.field5855[var8] = var4;
                        }
                        var8 = this.field5855[var8];
                    }
                    if (var8 >= this.field5855.length) {
                        int[] var11 = new int[this.field5855.length * 2];
                        for (int var12 = 0; var12 < this.field5855.length; var12++) {
                            var11[var12] = this.field5855[var12];
                        }
                        this.field5855 = var11;
                    }
                    int var13 = var10 >>> 1;
                }
                this.field5855[var8] = ~var5;
                if (var8 >= var4) {
                    var4 = var8 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(II)I", line = 148)
    private static final int method2329(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class456.method2650(var2, (byte) -124, arg1) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!os", name = "c", descriptor = "()I", line = 158)
    public final int method2330() {
        int var1;
        for (var1 = 0; this.field5855[var1] >= 0; var1 = class177.method1215() == 0 ? var1 + 1 : this.field5855[var1]) {
        }
        return ~this.field5855[var1];
    }

    @OriginalMember(owner = "client!os", name = "<init>", descriptor = "()V", line = 165)
    public class388() {
        class177.method1212(24);
        this.field5851 = class177.method1212(16);
        this.field5850 = class177.method1212(24);
        this.field5854 = new int[this.field5850];
        boolean var1 = class177.method1215() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class177.method1212(5) + 1;
            while (var2 < this.field5850) {
                int var4 = class177.method1212(class34.method292(this.field5850 - var2, 92));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field5854[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class177.method1215() != 0;
            for (int var7 = 0; var7 < this.field5850; var7++) {
                if (var6 && class177.method1215() == 0) {
                    this.field5854[var7] = 0;
                } else {
                    this.field5854[var7] = class177.method1212(5) + 1;
                }
            }
        }
        this.method2328();
        int var8 = class177.method1212(4);
        if (var8 > 0) {
            float var9 = class177.method1216(class177.method1212(32));
            float var10 = class177.method1216(class177.method1212(32));
            int var11 = class177.method1212(4) + 1;
            boolean var12 = class177.method1215() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method2329(this.field5850, this.field5851);
            } else {
                var13 = this.field5851 * this.field5850;
            }
            this.field5853 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field5853[var14] = class177.method1212(var11);
            }
            this.field5852 = new float[this.field5850][this.field5851];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field5850; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field5851; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field5853[var19] * var10 + var9 + var16;
                        this.field5852[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
                return;
            }
            for (int var21 = 0; var21 < this.field5850; var21++) {
                float var22 = 0.0F;
                int var23 = this.field5851 * var21;
                for (int var24 = 0; var24 < this.field5851; var24++) {
                    float var25 = (float) this.field5853[var23] * var10 + var9 + var22;
                    this.field5852[var21][var24] = var25;
                    if (var12) {
                        var22 = var25;
                    }
                    var23++;
                }
            }
        }
    }
}
