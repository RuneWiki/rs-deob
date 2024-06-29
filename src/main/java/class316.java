import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public class class316 {

    @OriginalMember(owner = "client!mv", name = "e", descriptor = "I")
    public int field4056;

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "I")
    private int field4053;

    @OriginalMember(owner = "client!mv", name = "c", descriptor = "[I")
    private int[] field4054;

    @OriginalMember(owner = "client!mv", name = "d", descriptor = "[I")
    private int[] field4055;

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "[[F")
    private float[][] field4052;

    @OriginalMember(owner = "client!mv", name = "f", descriptor = "[I")
    private int[] field4057;

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(II)I", line = 5)
    private static final int method1851(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class622.method3407(var2, 46, arg1) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "()[F", line = 13)
    public final float[] method1852() {
        return this.field4052[this.method1853()];
    }

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "()I", line = 18)
    public final int method1853() {
        int var1;
        for (var1 = 0; this.field4057[var1] >= 0; var1 = class759.method4220() == 0 ? var1 + 1 : this.field4057[var1]) {
        }
        return ~this.field4057[var1];
    }

    @OriginalMember(owner = "client!mv", name = "c", descriptor = "()V", line = 27)
    private final void method1854() {
        int[] var1 = new int[this.field4053];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field4053; var3++) {
            int var14 = this.field4054[var3];
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
        this.field4057 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field4053; var5++) {
            int var6 = this.field4054[var5];
            if (var6 != 0) {
                int var7 = var1[var5];
                int var8 = 0;
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = Integer.MIN_VALUE >>> var9;
                    if ((var7 & var10) == 0) {
                        var8++;
                    } else {
                        if (this.field4057[var8] == 0) {
                            this.field4057[var8] = var4;
                        }
                        var8 = this.field4057[var8];
                    }
                    if (var8 >= this.field4057.length) {
                        int[] var11 = new int[this.field4057.length * 2];
                        for (int var12 = 0; var12 < this.field4057.length; var12++) {
                            var11[var12] = this.field4057[var12];
                        }
                        this.field4057 = var11;
                    }
                    int var13 = var10 >>> 1;
                }
                this.field4057[var8] = ~var5;
                if (var8 >= var4) {
                    var4 = var8 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mv", name = "<init>", descriptor = "()V", line = 165)
    public class316() {
        class759.method4226(24);
        this.field4056 = class759.method4226(16);
        this.field4053 = class759.method4226(24);
        this.field4054 = new int[this.field4053];
        boolean var1 = class759.method4220() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class759.method4226(5) + 1;
            while (var2 < this.field4053) {
                int var4 = class759.method4226(class233.method1468(this.field4053 - var2, (byte) -37));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field4054[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class759.method4220() != 0;
            for (int var7 = 0; var7 < this.field4053; var7++) {
                if (var6 && class759.method4220() == 0) {
                    this.field4054[var7] = 0;
                } else {
                    this.field4054[var7] = class759.method4226(5) + 1;
                }
            }
        }
        this.method1854();
        int var8 = class759.method4226(4);
        if (var8 > 0) {
            float var9 = class759.method4224(class759.method4226(32));
            float var10 = class759.method4224(class759.method4226(32));
            int var11 = class759.method4226(4) + 1;
            boolean var12 = class759.method4220() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method1851(this.field4053, this.field4056);
            } else {
                var13 = this.field4056 * this.field4053;
            }
            this.field4055 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field4055[var14] = class759.method4226(var11);
            }
            this.field4052 = new float[this.field4053][this.field4056];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field4053; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field4056; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field4055[var19] * var10 + var9 + var16;
                        this.field4052[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
                return;
            }
            for (int var21 = 0; var21 < this.field4053; var21++) {
                float var22 = 0.0F;
                int var23 = this.field4056 * var21;
                for (int var24 = 0; var24 < this.field4056; var24++) {
                    float var25 = (float) this.field4055[var23] * var10 + var9 + var22;
                    this.field4052[var21][var24] = var25;
                    if (var12) {
                        var22 = var25;
                    }
                    var23++;
                }
            }
        }
    }
}
