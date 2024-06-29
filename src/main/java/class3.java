import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class3 {

    @OriginalMember(owner = "client!dp", name = "e", descriptor = "I")
    public int field57;

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "I")
    private int field56;

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "[I")
    private int[] field55;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "[I")
    private int[] field53;

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "[[F")
    private float[][] field54;

    @OriginalMember(owner = "client!dp", name = "f", descriptor = "[I")
    private int[] field58;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "()[F")
    public final float[] method33() {
        return this.field54[this.method36()];
    }

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "()V")
    private final void method34() {
        int[] var1 = new int[this.field56];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field56; var3++) {
            int var14 = this.field55[var3];
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
        this.field58 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field56; var5++) {
            int var6 = this.field55[var5];
            if (var6 != 0) {
                int var7 = var1[var5];
                int var8 = 0;
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = Integer.MIN_VALUE >>> var9;
                    if ((var7 & var10) == 0) {
                        var8++;
                    } else {
                        if (this.field58[var8] == 0) {
                            this.field58[var8] = var4;
                        }
                        var8 = this.field58[var8];
                    }
                    if (var8 >= this.field58.length) {
                        int[] var11 = new int[this.field58.length * 2];
                        for (int var12 = 0; var12 < this.field58.length; var12++) {
                            var11[var12] = this.field58[var12];
                        }
                        this.field58 = var11;
                    }
                    int var13 = var10 >>> 1;
                }
                this.field58[var8] = ~var5;
                if (var8 >= var4) {
                    var4 = var8 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(II)I")
    private static final int method35(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class54.method394(var2, arg1, (byte) 27) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!dp", name = "<init>", descriptor = "()V")
    public class3() {
        class195.method1327(24);
        this.field57 = class195.method1327(16);
        this.field56 = class195.method1327(24);
        this.field55 = new int[this.field56];
        boolean var1 = class195.method1325() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class195.method1327(5) + 1;
            while (var2 < this.field56) {
                int var4 = class195.method1327(class211.method1408(true, this.field56 - var2));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field55[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class195.method1325() != 0;
            for (int var7 = 0; var7 < this.field56; var7++) {
                if (var6 && class195.method1325() == 0) {
                    this.field55[var7] = 0;
                } else {
                    this.field55[var7] = class195.method1327(5) + 1;
                }
            }
        }
        this.method34();
        int var8 = class195.method1327(4);
        if (var8 > 0) {
            float var9 = class195.method1330(class195.method1327(32));
            float var10 = class195.method1330(class195.method1327(32));
            int var11 = class195.method1327(4) + 1;
            boolean var12 = class195.method1325() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method35(this.field56, this.field57);
            } else {
                var13 = this.field57 * this.field56;
            }
            this.field53 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field53[var14] = class195.method1327(var11);
            }
            this.field54 = new float[this.field56][this.field57];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field56; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field57; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field53[var19] * var10 + var9 + var16;
                        this.field54[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
                return;
            }
            for (int var21 = 0; var21 < this.field56; var21++) {
                float var22 = 0.0F;
                int var23 = this.field57 * var21;
                for (int var24 = 0; var24 < this.field57; var24++) {
                    float var25 = (float) this.field53[var23] * var10 + var9 + var22;
                    this.field54[var21][var24] = var25;
                    if (var12) {
                        var22 = var25;
                    }
                    var23++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "()I")
    public final int method36() {
        int var1;
        for (var1 = 0; this.field58[var1] >= 0; var1 = class195.method1325() == 0 ? var1 + 1 : this.field58[var1]) {
        }
        return ~this.field58[var1];
    }
}
