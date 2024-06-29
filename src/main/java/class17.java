import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class17 {

    @OriginalMember(owner = "client!db", name = "e", descriptor = "I")
    public int field238;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "I")
    private int field236;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "[I")
    private int[] field237;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "[I")
    private int[] field234;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "[[F")
    private float[][] field235;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "[I")
    private int[] field239;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "()I")
    public final int method129() {
        int var1;
        for (var1 = 0; this.field239[var1] >= 0; var1 = class132.method984() == 0 ? var1 + 1 : this.field239[var1]) {
        }
        return ~this.field239[var1];
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "()V")
    private final void method130() {
        int[] var1 = new int[this.field236];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field236; var3++) {
            int var14 = this.field237[var3];
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
        this.field239 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field236; var5++) {
            int var6 = this.field237[var5];
            if (var6 != 0) {
                int var7 = var1[var5];
                int var8 = 0;
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = Integer.MIN_VALUE >>> var9;
                    if ((var7 & var10) == 0) {
                        var8++;
                    } else {
                        if (this.field239[var8] == 0) {
                            this.field239[var8] = var4;
                        }
                        var8 = this.field239[var8];
                    }
                    if (var8 >= this.field239.length) {
                        int[] var11 = new int[this.field239.length * 2];
                        for (int var12 = 0; var12 < this.field239.length; var12++) {
                            var11[var12] = this.field239[var12];
                        }
                        this.field239 = var11;
                    }
                    int var13 = var10 >>> 1;
                }
                this.field239[var8] = ~var5;
                if (var8 >= var4) {
                    var4 = var8 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "()[F")
    public final float[] method131() {
        return this.field235[this.method129()];
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "()V")
    public class17() {
        class132.method983(24);
        this.field238 = class132.method983(16);
        this.field236 = class132.method983(24);
        this.field237 = new int[this.field236];
        boolean var1 = class132.method984() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class132.method983(5) + 1;
            while (var2 < this.field236) {
                int var4 = class132.method983(class179.method1267((byte) -123, this.field236 - var2));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field237[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class132.method984() != 0;
            for (int var7 = 0; var7 < this.field236; var7++) {
                if (var6 && class132.method984() == 0) {
                    this.field237[var7] = 0;
                } else {
                    this.field237[var7] = class132.method983(5) + 1;
                }
            }
        }
        this.method130();
        int var8 = class132.method983(4);
        if (var8 > 0) {
            float var9 = class132.method980(class132.method983(32));
            float var10 = class132.method980(class132.method983(32));
            int var11 = class132.method983(4) + 1;
            boolean var12 = class132.method984() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method132(this.field236, this.field238);
            } else {
                var13 = this.field238 * this.field236;
            }
            this.field234 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field234[var14] = class132.method983(var11);
            }
            this.field235 = new float[this.field236][this.field238];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field236; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field238; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field234[var19] * var10 + var9 + var16;
                        this.field235[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
                return;
            }
            for (int var21 = 0; var21 < this.field236; var21++) {
                float var22 = 0.0F;
                int var23 = this.field238 * var21;
                for (int var24 = 0; var24 < this.field238; var24++) {
                    float var25 = (float) this.field234[var23] * var10 + var9 + var22;
                    this.field235[var21][var24] = var25;
                    if (var12) {
                        var22 = var25;
                    }
                    var23++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(II)I")
    private static final int method132(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class22.method196(arg1, var2, -1) > arg0; var2--) {
        }
        return var2;
    }
}
