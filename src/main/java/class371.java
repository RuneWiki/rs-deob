import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class371 {

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "I")
    public int field5476;

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "I")
    private int field5479;

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "[I")
    private int[] field5477;

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "[I")
    private int[] field5478;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "[[F")
    private float[][] field5475;

    @OriginalMember(owner = "client!wm", name = "f", descriptor = "[I")
    private int[] field5480;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "()V", line = 5)
    private final void method2440() {
        int[] var1 = new int[this.field5479];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field5479; var3++) {
            int var14 = this.field5477[var3];
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
        this.field5480 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field5479; var5++) {
            int var6 = this.field5477[var5];
            if (var6 != 0) {
                int var7 = var1[var5];
                int var8 = 0;
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = Integer.MIN_VALUE >>> var9;
                    if ((var7 & var10) == 0) {
                        var8++;
                    } else {
                        if (this.field5480[var8] == 0) {
                            this.field5480[var8] = var4;
                        }
                        var8 = this.field5480[var8];
                    }
                    if (var8 >= this.field5480.length) {
                        int[] var11 = new int[this.field5480.length * 2];
                        for (int var12 = 0; var12 < this.field5480.length; var12++) {
                            var11[var12] = this.field5480[var12];
                        }
                        this.field5480 = var11;
                    }
                    int var13 = var10 >>> 1;
                }
                this.field5480[var8] = ~var5;
                if (var8 >= var4) {
                    var4 = var8 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "()I", line = 144)
    public final int method2441() {
        int var1;
        for (var1 = 0; this.field5480[var1] >= 0; var1 = class44.method311() == 0 ? var1 + 1 : this.field5480[var1]) {
        }
        return ~this.field5480[var1];
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(II)I", line = 154)
    private static final int method2442(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class108.method814(arg1, 1, var2) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "()[F", line = 162)
    public final float[] method2443() {
        return this.field5475[this.method2441()];
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "()V", line = 165)
    public class371() {
        class44.method321(24);
        this.field5476 = class44.method321(16);
        this.field5479 = class44.method321(24);
        this.field5477 = new int[this.field5479];
        boolean var1 = class44.method311() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class44.method321(5) + 1;
            while (var2 < this.field5479) {
                int var4 = class44.method321(class430.method2686(68, this.field5479 - var2));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field5477[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class44.method311() != 0;
            for (int var7 = 0; var7 < this.field5479; var7++) {
                if (var6 && class44.method311() == 0) {
                    this.field5477[var7] = 0;
                } else {
                    this.field5477[var7] = class44.method321(5) + 1;
                }
            }
        }
        this.method2440();
        int var8 = class44.method321(4);
        if (var8 > 0) {
            float var9 = class44.method320(class44.method321(32));
            float var10 = class44.method320(class44.method321(32));
            int var11 = class44.method321(4) + 1;
            boolean var12 = class44.method311() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method2442(this.field5479, this.field5476);
            } else {
                var13 = this.field5479 * this.field5476;
            }
            this.field5478 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field5478[var14] = class44.method321(var11);
            }
            this.field5475 = new float[this.field5479][this.field5476];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field5479; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field5476; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field5478[var19] * var10 + var9 + var16;
                        this.field5475[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
                return;
            }
            for (int var21 = 0; var21 < this.field5479; var21++) {
                float var22 = 0.0F;
                int var23 = this.field5476 * var21;
                for (int var24 = 0; var24 < this.field5476; var24++) {
                    float var25 = (float) this.field5478[var23] * var10 + var9 + var22;
                    this.field5475[var21][var24] = var25;
                    if (var12) {
                        var22 = var25;
                    }
                    var23++;
                }
            }
        }
    }
}
