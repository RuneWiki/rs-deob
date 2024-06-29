import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class423 {

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    public int field6154;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    private int field6153;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "[I")
    private int[] field6151;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "[I")
    private int[] field6152;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "[[F")
    private float[][] field6155;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "[I")
    private int[] field6156;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "()[F", line = 5)
    public final float[] method2646() {
        return this.field6155[this.method2649()];
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)I", line = 9)
    private static final int method2647(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class104.method716(var2, arg1, 16691) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "()V", line = 18)
    private final void method2648() {
        int[] var1 = new int[this.field6153];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field6153; var3++) {
            int var14 = this.field6151[var3];
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
        this.field6156 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field6153; var5++) {
            int var6 = this.field6151[var5];
            if (var6 != 0) {
                int var7 = var1[var5];
                int var8 = 0;
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = Integer.MIN_VALUE >>> var9;
                    if ((var7 & var10) == 0) {
                        var8++;
                    } else {
                        if (this.field6156[var8] == 0) {
                            this.field6156[var8] = var4;
                        }
                        var8 = this.field6156[var8];
                    }
                    if (var8 >= this.field6156.length) {
                        int[] var11 = new int[this.field6156.length * 2];
                        for (int var12 = 0; var12 < this.field6156.length; var12++) {
                            var11[var12] = this.field6156[var12];
                        }
                        this.field6156 = var11;
                    }
                    int var13 = var10 >>> 1;
                }
                this.field6156[var8] = ~var5;
                if (var8 >= var4) {
                    var4 = var8 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "()I", line = 158)
    public final int method2649() {
        int var1;
        for (var1 = 0; this.field6156[var1] >= 0; var1 = class571.method3318() == 0 ? var1 + 1 : this.field6156[var1]) {
        }
        return ~this.field6156[var1];
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V", line = 165)
    public class423() {
        class571.method3319(24);
        this.field6154 = class571.method3319(16);
        this.field6153 = class571.method3319(24);
        this.field6151 = new int[this.field6153];
        boolean var1 = class571.method3318() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class571.method3319(5) + 1;
            while (var2 < this.field6153) {
                int var4 = class571.method3319(class544.method3197(this.field6153 - var2, (byte) -99));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field6151[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class571.method3318() != 0;
            for (int var7 = 0; var7 < this.field6153; var7++) {
                if (var6 && class571.method3318() == 0) {
                    this.field6151[var7] = 0;
                } else {
                    this.field6151[var7] = class571.method3319(5) + 1;
                }
            }
        }
        this.method2648();
        int var8 = class571.method3319(4);
        if (var8 > 0) {
            float var9 = class571.method3315(class571.method3319(32));
            float var10 = class571.method3315(class571.method3319(32));
            int var11 = class571.method3319(4) + 1;
            boolean var12 = class571.method3318() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method2647(this.field6153, this.field6154);
            } else {
                var13 = this.field6154 * this.field6153;
            }
            this.field6152 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field6152[var14] = class571.method3319(var11);
            }
            this.field6155 = new float[this.field6153][this.field6154];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field6153; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field6154; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field6152[var19] * var10 + var9 + var16;
                        this.field6155[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
                return;
            }
            for (int var21 = 0; var21 < this.field6153; var21++) {
                float var22 = 0.0F;
                int var23 = this.field6154 * var21;
                for (int var24 = 0; var24 < this.field6154; var24++) {
                    float var25 = (float) this.field6152[var23] * var10 + var9 + var22;
                    this.field6155[var21][var24] = var25;
                    if (var12) {
                        var22 = var25;
                    }
                    var23++;
                }
            }
        }
    }
}
