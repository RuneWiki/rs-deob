import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public class class631 {

    @OriginalMember(owner = "client!ou", name = "c", descriptor = "I")
    public int field9221;

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "I")
    private int field9223;

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "[I")
    private int[] field9222;

    @OriginalMember(owner = "client!ou", name = "d", descriptor = "[I")
    private int[] field9220;

    @OriginalMember(owner = "client!ou", name = "e", descriptor = "[[F")
    private float[][] field9219;

    @OriginalMember(owner = "client!ou", name = "f", descriptor = "[I")
    private int[] field9224;

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(II)I", line = 4)
    private static final int method4670(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class784.method5673(arg1, 1, var2) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "()V", line = 12)
    private final void method4671() {
        int[] var1 = new int[this.field9223];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field9223; var3++) {
            int var14 = this.field9222[var3];
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
        this.field9224 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field9223; var5++) {
            int var6 = this.field9222[var5];
            if (var6 != 0) {
                int var7 = var1[var5];
                int var8 = 0;
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = Integer.MIN_VALUE >>> var9;
                    if ((var7 & var10) == 0) {
                        var8++;
                    } else {
                        if (this.field9224[var8] == 0) {
                            this.field9224[var8] = var4;
                        }
                        var8 = this.field9224[var8];
                    }
                    if (var8 >= this.field9224.length) {
                        int[] var11 = new int[this.field9224.length * 2];
                        for (int var12 = 0; var12 < this.field9224.length; var12++) {
                            var11[var12] = this.field9224[var12];
                        }
                        this.field9224 = var11;
                    }
                    int var13 = var10 >>> 1;
                }
                this.field9224[var8] = ~var5;
                if (var8 >= var4) {
                    var4 = var8 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "()I", line = 153)
    public final int method4672() {
        int var1;
        for (var1 = 0; this.field9224[var1] >= 0; var1 = class438.method3373() == 0 ? var1 + 1 : this.field9224[var1]) {
        }
        return ~this.field9224[var1];
    }

    @OriginalMember(owner = "client!ou", name = "c", descriptor = "()[F", line = 163)
    public final float[] method4673() {
        return this.field9219[this.method4672()];
    }

    @OriginalMember(owner = "client!ou", name = "<init>", descriptor = "()V", line = 165)
    public class631() {
        class438.method3364(24);
        this.field9221 = class438.method3364(16);
        this.field9223 = class438.method3364(24);
        this.field9222 = new int[this.field9223];
        boolean var1 = class438.method3373() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class438.method3364(5) + 1;
            while (var2 < this.field9223) {
                int var4 = class438.method3364(class54.method410((byte) -106, this.field9223 - var2));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field9222[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class438.method3373() != 0;
            for (int var7 = 0; var7 < this.field9223; var7++) {
                if (var6 && class438.method3373() == 0) {
                    this.field9222[var7] = 0;
                } else {
                    this.field9222[var7] = class438.method3364(5) + 1;
                }
            }
        }
        this.method4671();
        int var8 = class438.method3364(4);
        if (var8 > 0) {
            float var9 = class438.method3368(class438.method3364(32));
            float var10 = class438.method3368(class438.method3364(32));
            int var11 = class438.method3364(4) + 1;
            boolean var12 = class438.method3373() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method4670(this.field9223, this.field9221);
            } else {
                var13 = this.field9223 * this.field9221;
            }
            this.field9220 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field9220[var14] = class438.method3364(var11);
            }
            this.field9219 = new float[this.field9223][this.field9221];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field9223; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field9221; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field9220[var19] * var10 + var9 + var16;
                        this.field9219[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
                return;
            }
            for (int var21 = 0; var21 < this.field9223; var21++) {
                float var22 = 0.0F;
                int var23 = this.field9221 * var21;
                for (int var24 = 0; var24 < this.field9221; var24++) {
                    float var25 = (float) this.field9220[var23] * var10 + var9 + var22;
                    this.field9219[var21][var24] = var25;
                    if (var12) {
                        var22 = var25;
                    }
                    var23++;
                }
            }
        }
    }
}
