import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class273 {

    @OriginalMember(owner = "client!lp", name = "d", descriptor = "I")
    public int field4091;

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "I")
    private int field4090;

    @OriginalMember(owner = "client!lp", name = "e", descriptor = "[I")
    private int[] field4092;

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "[I")
    private int[] field4089;

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "[[F")
    private float[][] field4088;

    @OriginalMember(owner = "client!lp", name = "f", descriptor = "[I")
    private int[] field4093;

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "()[F")
    public final float[] method1759() {
        return this.field4088[this.method1760()];
    }

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "()I")
    public final int method1760() {
        int var1;
        for (var1 = 0; this.field4093[var1] >= 0; var1 = class527.method3130() == 0 ? var1 + 1 : this.field4093[var1]) {
        }
        return ~this.field4093[var1];
    }

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "()V")
    private final void method1761() {
        int[] var1 = new int[this.field4090];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field4090; var3++) {
            int var14 = this.field4092[var3];
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
        this.field4093 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field4090; var5++) {
            int var6 = this.field4092[var5];
            if (var6 != 0) {
                int var7 = var1[var5];
                int var8 = 0;
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = Integer.MIN_VALUE >>> var9;
                    if ((var7 & var10) == 0) {
                        var8++;
                    } else {
                        if (this.field4093[var8] == 0) {
                            this.field4093[var8] = var4;
                        }
                        var8 = this.field4093[var8];
                    }
                    if (var8 >= this.field4093.length) {
                        int[] var11 = new int[this.field4093.length * 2];
                        for (int var12 = 0; var12 < this.field4093.length; var12++) {
                            var11[var12] = this.field4093[var12];
                        }
                        this.field4093 = var11;
                    }
                    int var13 = var10 >>> 1;
                }
                this.field4093[var8] = ~var5;
                if (var8 >= var4) {
                    var4 = var8 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(II)I")
    private static final int method1762(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class84.method619(var2, -1, arg1) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!lp", name = "<init>", descriptor = "()V")
    public class273() {
        class527.method3121(24);
        this.field4091 = class527.method3121(16);
        this.field4090 = class527.method3121(24);
        this.field4092 = new int[this.field4090];
        boolean var1 = class527.method3130() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class527.method3121(5) + 1;
            while (var2 < this.field4090) {
                int var4 = class527.method3121(class100.method743(this.field4090 - var2, (byte) -126));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field4092[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class527.method3130() != 0;
            for (int var7 = 0; var7 < this.field4090; var7++) {
                if (var6 && class527.method3130() == 0) {
                    this.field4092[var7] = 0;
                } else {
                    this.field4092[var7] = class527.method3121(5) + 1;
                }
            }
        }
        this.method1761();
        int var8 = class527.method3121(4);
        if (var8 > 0) {
            float var9 = class527.method3123(class527.method3121(32));
            float var10 = class527.method3123(class527.method3121(32));
            int var11 = class527.method3121(4) + 1;
            boolean var12 = class527.method3130() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method1762(this.field4090, this.field4091);
            } else {
                var13 = this.field4091 * this.field4090;
            }
            this.field4089 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field4089[var14] = class527.method3121(var11);
            }
            this.field4088 = new float[this.field4090][this.field4091];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field4090; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field4091; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field4089[var19] * var10 + var9 + var16;
                        this.field4088[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
                return;
            }
            for (int var21 = 0; var21 < this.field4090; var21++) {
                float var22 = 0.0F;
                int var23 = this.field4091 * var21;
                for (int var24 = 0; var24 < this.field4091; var24++) {
                    float var25 = (float) this.field4089[var23] * var10 + var9 + var22;
                    this.field4088[var21][var24] = var25;
                    if (var12) {
                        var22 = var25;
                    }
                    var23++;
                }
            }
        }
    }
}
