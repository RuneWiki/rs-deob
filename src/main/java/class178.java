import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class178 {

    @OriginalMember(owner = "client!ip", name = "e", descriptor = "I")
    public int field2225;

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "I")
    private int field2223;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "[I")
    private int[] field2221;

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "[I")
    private int[] field2222;

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "[[F")
    private float[][] field2224;

    @OriginalMember(owner = "client!ip", name = "f", descriptor = "[I")
    private int[] field2226;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "()[F", line = 3)
    public final float[] method1169() {
        return this.field2224[this.method1172()];
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(II)I", line = 8)
    private static final int method1170(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class192.method1230(arg1, 94, var2) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "()V", line = 16)
    private final void method1171() {
        int[] var1 = new int[this.field2223];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field2223; var3++) {
            int var14 = this.field2221[var3];
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
        this.field2226 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field2223; var5++) {
            int var6 = this.field2221[var5];
            if (var6 != 0) {
                int var7 = var1[var5];
                int var8 = 0;
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = Integer.MIN_VALUE >>> var9;
                    if ((var7 & var10) == 0) {
                        var8++;
                    } else {
                        if (this.field2226[var8] == 0) {
                            this.field2226[var8] = var4;
                        }
                        var8 = this.field2226[var8];
                    }
                    if (var8 >= this.field2226.length) {
                        int[] var11 = new int[this.field2226.length * 2];
                        for (int var12 = 0; var12 < this.field2226.length; var12++) {
                            var11[var12] = this.field2226[var12];
                        }
                        this.field2226 = var11;
                    }
                    int var13 = var10 >>> 1;
                }
                this.field2226[var8] = ~var5;
                if (var8 >= var4) {
                    var4 = var8 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "()I", line = 158)
    public final int method1172() {
        int var1;
        for (var1 = 0; this.field2226[var1] >= 0; var1 = class513.method2908() == 0 ? var1 + 1 : this.field2226[var1]) {
        }
        return ~this.field2226[var1];
    }

    @OriginalMember(owner = "client!ip", name = "<init>", descriptor = "()V", line = 165)
    public class178() {
        class513.method2903(24);
        this.field2225 = class513.method2903(16);
        this.field2223 = class513.method2903(24);
        this.field2221 = new int[this.field2223];
        boolean var1 = class513.method2908() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class513.method2903(5) + 1;
            while (var2 < this.field2223) {
                int var4 = class513.method2903(class335.method2138(this.field2223 - var2, 36161));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field2221[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class513.method2908() != 0;
            for (int var7 = 0; var7 < this.field2223; var7++) {
                if (var6 && class513.method2908() == 0) {
                    this.field2221[var7] = 0;
                } else {
                    this.field2221[var7] = class513.method2903(5) + 1;
                }
            }
        }
        this.method1171();
        int var8 = class513.method2903(4);
        if (var8 > 0) {
            float var9 = class513.method2910(class513.method2903(32));
            float var10 = class513.method2910(class513.method2903(32));
            int var11 = class513.method2903(4) + 1;
            boolean var12 = class513.method2908() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method1170(this.field2223, this.field2225);
            } else {
                var13 = this.field2225 * this.field2223;
            }
            this.field2222 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field2222[var14] = class513.method2903(var11);
            }
            this.field2224 = new float[this.field2223][this.field2225];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field2223; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field2225; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field2222[var19] * var10 + var9 + var16;
                        this.field2224[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
                return;
            }
            for (int var21 = 0; var21 < this.field2223; var21++) {
                float var22 = 0.0F;
                int var23 = this.field2225 * var21;
                for (int var24 = 0; var24 < this.field2225; var24++) {
                    float var25 = (float) this.field2222[var23] * var10 + var9 + var22;
                    this.field2224[var21][var24] = var25;
                    if (var12) {
                        var22 = var25;
                    }
                    var23++;
                }
            }
        }
    }
}
