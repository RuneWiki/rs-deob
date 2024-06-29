import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class331 {

    @OriginalMember(owner = "client!md", name = "d", descriptor = "I")
    public int field4987;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "I")
    private int field4984;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "[I")
    private int[] field4988;

    @OriginalMember(owner = "client!md", name = "b", descriptor = "[I")
    private int[] field4985;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "[[F")
    private float[][] field4986;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "[I")
    private int[] field4989;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "()I", line = 4)
    public final int method2307() {
        int var1;
        for (var1 = 0; this.field4989[var1] >= 0; var1 = class244.method1677() == 0 ? var1 + 1 : this.field4989[var1]) {
        }
        return ~this.field4989[var1];
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "()V", line = 14)
    private final void method2308() {
        int[] var1 = new int[this.field4984];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field4984; var3++) {
            int var4 = this.field4988[var3];
            if (var4 != 0) {
                int var5 = 0x1 << 32 - var4;
                int var6 = var2[var4];
                var1[var3] = var6;
                int var7;
                if ((var6 & var5) == 0) {
                    var7 = var6 | var5;
                    for (int var8 = var4 - 1; var8 >= 1; var8--) {
                        int var9 = var2[var8];
                        if (var6 != var9) {
                            break;
                        }
                        int var10 = 0x1 << 32 - var8;
                        if ((var9 & var10) != 0) {
                            var2[var8] = var2[var8 - 1];
                            break;
                        }
                        var2[var8] = var9 | var10;
                    }
                } else {
                    var7 = var2[var4 - 1];
                }
                var2[var4] = var7;
                for (int var11 = var4 + 1; var11 <= 32; var11++) {
                    int var12 = var2[var11];
                    if (var6 == var12) {
                        var2[var11] = var7;
                    }
                }
            }
        }
        this.field4989 = new int[8];
        int var13 = 0;
        for (int var14 = 0; var14 < this.field4984; var14++) {
            int var15 = this.field4988[var14];
            if (var15 != 0) {
                int var16 = var1[var14];
                int var17 = 0;
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = Integer.MIN_VALUE >>> var18;
                    if ((var16 & var19) == 0) {
                        var17++;
                    } else {
                        if (this.field4989[var17] == 0) {
                            this.field4989[var17] = var13;
                        }
                        var17 = this.field4989[var17];
                    }
                    if (var17 >= this.field4989.length) {
                        int[] var20 = new int[this.field4989.length * 2];
                        for (int var21 = 0; var21 < this.field4989.length; var21++) {
                            var20[var21] = this.field4989[var21];
                        }
                        this.field4989 = var20;
                    }
                    int var22 = var19 >>> 1;
                }
                this.field4989[var17] = ~var14;
                if (var17 >= var13) {
                    var13 = var17 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "()[F", line = 152)
    public final float[] method2309() {
        return this.field4986[this.method2307()];
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(II)I", line = 157)
    private static final int method2310(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class282.method1948(var2, arg1, (byte) -75) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "()V", line = 165)
    public class331() {
        class244.method1679(24);
        this.field4987 = class244.method1679(16);
        this.field4984 = class244.method1679(24);
        this.field4988 = new int[this.field4984];
        boolean var1 = class244.method1677() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class244.method1679(5) + 1;
            while (var2 < this.field4984) {
                int var4 = class244.method1679(class130.method933(this.field4984 - var2, 2));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field4988[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class244.method1677() != 0;
            for (int var7 = 0; var7 < this.field4984; var7++) {
                if (var6 && class244.method1677() == 0) {
                    this.field4988[var7] = 0;
                } else {
                    this.field4988[var7] = class244.method1679(5) + 1;
                }
            }
        }
        this.method2308();
        int var8 = class244.method1679(4);
        if (var8 > 0) {
            float var9 = class244.method1675(class244.method1679(32));
            float var10 = class244.method1675(class244.method1679(32));
            int var11 = class244.method1679(4) + 1;
            boolean var12 = class244.method1677() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method2310(this.field4984, this.field4987);
            } else {
                var13 = this.field4987 * this.field4984;
            }
            this.field4985 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field4985[var14] = class244.method1679(var11);
            }
            this.field4986 = new float[this.field4984][this.field4987];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field4984; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field4987; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field4985[var19] * var10 + var9 + var16;
                        this.field4986[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field4984; var21++) {
                    float var22 = 0.0F;
                    int var23 = this.field4987 * var21;
                    for (int var24 = 0; var24 < this.field4987; var24++) {
                        float var25 = (float) this.field4985[var23] * var10 + var9 + var22;
                        this.field4986[var21][var24] = var25;
                        if (var12) {
                            var22 = var25;
                        }
                        var23++;
                    }
                }
            }
        }
    }
}
