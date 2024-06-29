import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class378 {

    @OriginalMember(owner = "client!we", name = "e", descriptor = "I")
    public int field4862;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "I")
    private int field4859;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "[I")
    private int[] field4860;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "[I")
    private int[] field4861;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "[[F")
    private float[][] field4858;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "[I")
    private int[] field4863;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "()V", line = 4)
    private final void method2179() {
        int[] var1 = new int[this.field4859];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field4859; var3++) {
            int var14 = this.field4860[var3];
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
        this.field4863 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field4859; var5++) {
            int var6 = this.field4860[var5];
            if (var6 != 0) {
                int var7 = var1[var5];
                int var8 = 0;
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = Integer.MIN_VALUE >>> var9;
                    if ((var7 & var10) == 0) {
                        var8++;
                    } else {
                        if (this.field4863[var8] == 0) {
                            this.field4863[var8] = var4;
                        }
                        var8 = this.field4863[var8];
                    }
                    if (var8 >= this.field4863.length) {
                        int[] var11 = new int[this.field4863.length * 2];
                        for (int var12 = 0; var12 < this.field4863.length; var12++) {
                            var11[var12] = this.field4863[var12];
                        }
                        this.field4863 = var11;
                    }
                    int var13 = var10 >>> 1;
                }
                this.field4863[var8] = ~var5;
                if (var8 >= var4) {
                    var4 = var8 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(II)I", line = 145)
    private static final int method2180(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class148.method930(arg1, var2, 1) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "()[F", line = 155)
    public final float[] method2181() {
        return this.field4858[this.method2182()];
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "()I", line = 159)
    public final int method2182() {
        int var1;
        for (var1 = 0; this.field4863[var1] >= 0; var1 = class494.method2680() == 0 ? var1 + 1 : this.field4863[var1]) {
        }
        return ~this.field4863[var1];
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "()V", line = 165)
    public class378() {
        class494.method2679(24);
        this.field4862 = class494.method2679(16);
        this.field4859 = class494.method2679(24);
        this.field4860 = new int[this.field4859];
        boolean var1 = class494.method2680() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class494.method2679(5) + 1;
            while (var2 < this.field4859) {
                int var4 = class494.method2679(class505.method2756(this.field4859 - var2, -65537));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field4860[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class494.method2680() != 0;
            for (int var7 = 0; var7 < this.field4859; var7++) {
                if (var6 && class494.method2680() == 0) {
                    this.field4860[var7] = 0;
                } else {
                    this.field4860[var7] = class494.method2679(5) + 1;
                }
            }
        }
        this.method2179();
        int var8 = class494.method2679(4);
        if (var8 > 0) {
            float var9 = class494.method2684(class494.method2679(32));
            float var10 = class494.method2684(class494.method2679(32));
            int var11 = class494.method2679(4) + 1;
            boolean var12 = class494.method2680() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method2180(this.field4859, this.field4862);
            } else {
                var13 = this.field4862 * this.field4859;
            }
            this.field4861 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field4861[var14] = class494.method2679(var11);
            }
            this.field4858 = new float[this.field4859][this.field4862];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field4859; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field4862; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field4861[var19] * var10 + var9 + var16;
                        this.field4858[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
                return;
            }
            for (int var21 = 0; var21 < this.field4859; var21++) {
                float var22 = 0.0F;
                int var23 = this.field4862 * var21;
                for (int var24 = 0; var24 < this.field4862; var24++) {
                    float var25 = (float) this.field4861[var23] * var10 + var9 + var22;
                    this.field4858[var21][var24] = var25;
                    if (var12) {
                        var22 = var25;
                    }
                    var23++;
                }
            }
        }
    }
}
