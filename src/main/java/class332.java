import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class332 {

    @OriginalMember(owner = "client!si", name = "c", descriptor = "I")
    public int field5195;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    private int field5193;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "[I")
    private int[] field5194;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "[I")
    private int[] field5196;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "[[F")
    private float[][] field5197;

    @OriginalMember(owner = "client!si", name = "f", descriptor = "[I")
    private int[] field5198;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "()I")
    public final int method2200() {
        int var1;
        for (var1 = 0; this.field5198[var1] >= 0; var1 = class278.method1878() == 0 ? var1 + 1 : this.field5198[var1]) {
        }
        return ~this.field5198[var1];
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(II)I")
    private static final int method2201(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class375.method2393(arg1, var2, 10) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "()V")
    private final void method2202() {
        int[] var1 = new int[this.field5193];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field5193; var3++) {
            int var14 = this.field5194[var3];
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
        this.field5198 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field5193; var5++) {
            int var6 = this.field5194[var5];
            if (var6 != 0) {
                int var7 = var1[var5];
                int var8 = 0;
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = Integer.MIN_VALUE >>> var9;
                    if ((var7 & var10) == 0) {
                        var8++;
                    } else {
                        if (this.field5198[var8] == 0) {
                            this.field5198[var8] = var4;
                        }
                        var8 = this.field5198[var8];
                    }
                    if (var8 >= this.field5198.length) {
                        int[] var11 = new int[this.field5198.length * 2];
                        for (int var12 = 0; var12 < this.field5198.length; var12++) {
                            var11[var12] = this.field5198[var12];
                        }
                        this.field5198 = var11;
                    }
                    int var13 = var10 >>> 1;
                }
                this.field5198[var8] = ~var5;
                if (var8 >= var4) {
                    var4 = var8 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "c", descriptor = "()[F")
    public final float[] method2203() {
        return this.field5197[this.method2200()];
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "()V")
    public class332() {
        class278.method1874(24);
        this.field5195 = class278.method1874(16);
        this.field5193 = class278.method1874(24);
        this.field5194 = new int[this.field5193];
        boolean var1 = class278.method1878() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class278.method1874(5) + 1;
            while (var2 < this.field5193) {
                int var4 = class278.method1874(class181.method1243(this.field5193 - var2, (byte) 112));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field5194[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class278.method1878() != 0;
            for (int var7 = 0; var7 < this.field5193; var7++) {
                if (var6 && class278.method1878() == 0) {
                    this.field5194[var7] = 0;
                } else {
                    this.field5194[var7] = class278.method1874(5) + 1;
                }
            }
        }
        this.method2202();
        int var8 = class278.method1874(4);
        if (var8 > 0) {
            float var9 = class278.method1876(class278.method1874(32));
            float var10 = class278.method1876(class278.method1874(32));
            int var11 = class278.method1874(4) + 1;
            boolean var12 = class278.method1878() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method2201(this.field5193, this.field5195);
            } else {
                var13 = this.field5195 * this.field5193;
            }
            this.field5196 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field5196[var14] = class278.method1874(var11);
            }
            this.field5197 = new float[this.field5193][this.field5195];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field5193; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field5195; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field5196[var19] * var10 + var9 + var16;
                        this.field5197[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
                return;
            }
            for (int var21 = 0; var21 < this.field5193; var21++) {
                float var22 = 0.0F;
                int var23 = this.field5195 * var21;
                for (int var24 = 0; var24 < this.field5195; var24++) {
                    float var25 = (float) this.field5196[var23] * var10 + var9 + var22;
                    this.field5197[var21][var24] = var25;
                    if (var12) {
                        var22 = var25;
                    }
                    var23++;
                }
            }
        }
    }
}
