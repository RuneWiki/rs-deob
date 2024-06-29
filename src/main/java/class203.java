import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class203 {

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
    public int field2830;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
    private int field2826;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "[I")
    private int[] field2829;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "[I")
    private int[] field2827;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "[[F")
    private float[][] field2828;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "[I")
    private int[] field2831;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "()[F", line = 4)
    public final float[] method1478() {
        return this.field2828[this.method1481()];
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)I", line = 9)
    private static final int method1479(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class157.method1202(6, arg1, var2) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "()V", line = 18)
    private final void method1480() {
        int[] var1 = new int[this.field2826];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field2826; var3++) {
            int var4 = this.field2829[var3];
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
        this.field2831 = new int[8];
        int var13 = 0;
        for (int var14 = 0; var14 < this.field2826; var14++) {
            int var15 = this.field2829[var14];
            if (var15 != 0) {
                int var16 = var1[var14];
                int var17 = 0;
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = Integer.MIN_VALUE >>> var18;
                    if ((var16 & var19) == 0) {
                        var17++;
                    } else {
                        if (this.field2831[var17] == 0) {
                            this.field2831[var17] = var13;
                        }
                        var17 = this.field2831[var17];
                    }
                    if (var17 >= this.field2831.length) {
                        int[] var20 = new int[this.field2831.length * 2];
                        for (int var21 = 0; var21 < this.field2831.length; var21++) {
                            var20[var21] = this.field2831[var21];
                        }
                        this.field2831 = var20;
                    }
                    int var22 = var19 >>> 1;
                }
                this.field2831[var17] = ~var14;
                if (var17 >= var13) {
                    var13 = var17 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "()I", line = 157)
    public final int method1481() {
        int var1;
        for (var1 = 0; this.field2831[var1] >= 0; var1 = class250.method1755() == 0 ? var1 + 1 : this.field2831[var1]) {
        }
        return ~this.field2831[var1];
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V", line = 165)
    public class203() {
        class250.method1760(24);
        this.field2830 = class250.method1760(16);
        this.field2826 = class250.method1760(24);
        this.field2829 = new int[this.field2826];
        boolean var1 = class250.method1755() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class250.method1760(5) + 1;
            while (var2 < this.field2826) {
                int var4 = class250.method1760(class195.method1411(this.field2826 - var2, -107));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field2829[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class250.method1755() != 0;
            for (int var7 = 0; var7 < this.field2826; var7++) {
                if (var6 && class250.method1755() == 0) {
                    this.field2829[var7] = 0;
                } else {
                    this.field2829[var7] = class250.method1760(5) + 1;
                }
            }
        }
        this.method1480();
        int var8 = class250.method1760(4);
        if (var8 > 0) {
            float var9 = class250.method1757(class250.method1760(32));
            float var10 = class250.method1757(class250.method1760(32));
            int var11 = class250.method1760(4) + 1;
            boolean var12 = class250.method1755() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method1479(this.field2826, this.field2830);
            } else {
                var13 = this.field2830 * this.field2826;
            }
            this.field2827 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field2827[var14] = class250.method1760(var11);
            }
            this.field2828 = new float[this.field2826][this.field2830];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field2826; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field2830; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field2827[var19] * var10 + var9 + var16;
                        this.field2828[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field2826; var21++) {
                    float var22 = 0.0F;
                    int var23 = this.field2830 * var21;
                    for (int var24 = 0; var24 < this.field2830; var24++) {
                        float var25 = (float) this.field2827[var23] * var10 + var9 + var22;
                        this.field2828[var21][var24] = var25;
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
