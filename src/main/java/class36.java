import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class36 {

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
    public int field596;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
    private int field599;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "[I")
    private int[] field595;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "[I")
    private int[] field597;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "[[F")
    private float[][] field598;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "[I")
    private int[] field600;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)I", line = 6)
    private static final int method265(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class194.method1297(arg1, var2, 21151) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "()[F", line = 13)
    public final float[] method266() {
        return this.field598[this.method267()];
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "()I", line = 18)
    public final int method267() {
        int var1;
        for (var1 = 0; this.field600[var1] >= 0; var1 = class315.method2204() == 0 ? var1 + 1 : this.field600[var1]) {
        }
        return ~this.field600[var1];
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V", line = 26)
    public class36() {
        class315.method2197(24);
        this.field596 = class315.method2197(16);
        this.field599 = class315.method2197(24);
        this.field595 = new int[this.field599];
        boolean var1 = class315.method2204() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class315.method2197(5) + 1;
            while (var2 < this.field599) {
                int var4 = class315.method2197(class191.method1264((byte) 91, this.field599 - var2));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field595[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class315.method2204() != 0;
            for (int var7 = 0; var7 < this.field599; var7++) {
                if (var6 && class315.method2204() == 0) {
                    this.field595[var7] = 0;
                } else {
                    this.field595[var7] = class315.method2197(5) + 1;
                }
            }
        }
        this.method268();
        int var8 = class315.method2197(4);
        if (var8 > 0) {
            float var9 = class315.method2206(class315.method2197(32));
            float var10 = class315.method2206(class315.method2197(32));
            int var11 = class315.method2197(4) + 1;
            boolean var12 = class315.method2204() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method265(this.field599, this.field596);
            } else {
                var13 = this.field599 * this.field596;
            }
            this.field597 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field597[var14] = class315.method2197(var11);
            }
            this.field598 = new float[this.field599][this.field596];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field599; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field596; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field597[var19] * var10 + var9 + var16;
                        this.field598[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field599; var21++) {
                    float var22 = 0.0F;
                    int var23 = this.field596 * var21;
                    for (int var24 = 0; var24 < this.field596; var24++) {
                        float var25 = (float) this.field597[var23] * var10 + var9 + var22;
                        this.field598[var21][var24] = var25;
                        if (var12) {
                            var22 = var25;
                        }
                        var23++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "()V", line = 169)
    private final void method268() {
        int[] var1 = new int[this.field599];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field599; var3++) {
            int var4 = this.field595[var3];
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
        this.field600 = new int[8];
        int var13 = 0;
        for (int var14 = 0; var14 < this.field599; var14++) {
            int var15 = this.field595[var14];
            if (var15 != 0) {
                int var16 = var1[var14];
                int var17 = 0;
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = Integer.MIN_VALUE >>> var18;
                    if ((var16 & var19) == 0) {
                        var17++;
                    } else {
                        if (this.field600[var17] == 0) {
                            this.field600[var17] = var13;
                        }
                        var17 = this.field600[var17];
                    }
                    if (var17 >= this.field600.length) {
                        int[] var20 = new int[this.field600.length * 2];
                        for (int var21 = 0; var21 < this.field600.length; var21++) {
                            var20[var21] = this.field600[var21];
                        }
                        this.field600 = var20;
                    }
                    int var22 = var19 >>> 1;
                }
                this.field600[var17] = ~var14;
                if (var17 >= var13) {
                    var13 = var17 + 1;
                }
            }
        }
    }
}
