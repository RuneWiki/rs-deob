import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class129 {

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "I")
    public int field3056;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "I")
    private int field3054;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "[I")
    private int[] field3055;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "[I")
    private int[] field3057;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "[[F")
    private float[][] field3053;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "[I")
    private int[] field3058;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "()V")
    private final void method978() {
        int[] var1 = new int[this.field3054];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field3054; var3++) {
            int var14 = this.field3055[var3];
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
        this.field3058 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field3054; var5++) {
            int var6 = this.field3055[var5];
            if (var6 != 0) {
                int var7 = var1[var5];
                int var8 = 0;
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = Integer.MIN_VALUE >>> var9;
                    if ((var7 & var10) == 0) {
                        var8++;
                    } else {
                        if (this.field3058[var8] == 0) {
                            this.field3058[var8] = var4;
                        }
                        var8 = this.field3058[var8];
                    }
                    if (var8 >= this.field3058.length) {
                        int[] var11 = new int[this.field3058.length * 2];
                        for (int var12 = 0; var12 < this.field3058.length; var12++) {
                            var11[var12] = this.field3058[var12];
                        }
                        this.field3058 = var11;
                    }
                    int var13 = var10 >>> 1;
                }
                this.field3058[var8] = ~var5;
                if (var8 >= var4) {
                    var4 = var8 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "()[F")
    public final float[] method979() {
        return this.field3053[this.method981()];
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)I")
    private static final int method980(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class143.method1082(arg1, 6378, var2) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V")
    public class129() {
        class53.method422(24);
        this.field3056 = class53.method422(16);
        this.field3054 = class53.method422(24);
        this.field3055 = new int[this.field3054];
        boolean var1 = class53.method416() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class53.method422(5) + 1;
            while (var2 < this.field3054) {
                int var4 = class53.method422(class68.method524(this.field3054 - var2, (byte) -86));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field3055[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class53.method416() != 0;
            for (int var7 = 0; var7 < this.field3054; var7++) {
                if (var6 && class53.method416() == 0) {
                    this.field3055[var7] = 0;
                } else {
                    this.field3055[var7] = class53.method422(5) + 1;
                }
            }
        }
        this.method978();
        int var8 = class53.method422(4);
        if (var8 > 0) {
            float var9 = class53.method423(class53.method422(32));
            float var10 = class53.method423(class53.method422(32));
            int var11 = class53.method422(4) + 1;
            boolean var12 = class53.method416() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method980(this.field3054, this.field3056);
            } else {
                var13 = this.field3056 * this.field3054;
            }
            this.field3057 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field3057[var14] = class53.method422(var11);
            }
            this.field3053 = new float[this.field3054][this.field3056];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field3054; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field3056; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field3057[var19] * var10 + var9 + var16;
                        this.field3053[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
                return;
            }
            for (int var21 = 0; var21 < this.field3054; var21++) {
                float var22 = 0.0F;
                int var23 = this.field3056 * var21;
                for (int var24 = 0; var24 < this.field3056; var24++) {
                    float var25 = (float) this.field3057[var23] * var10 + var9 + var22;
                    this.field3053[var21][var24] = var25;
                    if (var12) {
                        var22 = var25;
                    }
                    var23++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "()I")
    public final int method981() {
        int var1;
        for (var1 = 0; this.field3058[var1] >= 0; var1 = class53.method416() == 0 ? var1 + 1 : this.field3058[var1]) {
        }
        return ~this.field3058[var1];
    }
}
