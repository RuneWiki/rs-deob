import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class206 {

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "I")
    public int field3601;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
    private int field3599;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "[I")
    private int[] field3600;

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "[I")
    private int[] field3603;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "[[F")
    private float[][] field3602;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "[I")
    private int[] field3604;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "()I", line = 4)
    public final int method1476() {
        int var1;
        for (var1 = 0; this.field3604[var1] >= 0; var1 = class251.method1807() == 0 ? var1 + 1 : this.field3604[var1]) {
        }
        return ~this.field3604[var1];
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)I", line = 12)
    private static final int method1477(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class123.method840(47, arg1, var2) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "()V", line = 24)
    private final void method1478() {
        int[] var1 = new int[this.field3599];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field3599; var3++) {
            int var4 = this.field3600[var3];
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
        this.field3604 = new int[8];
        int var13 = 0;
        for (int var14 = 0; var14 < this.field3599; var14++) {
            int var15 = this.field3600[var14];
            if (var15 != 0) {
                int var16 = var1[var14];
                int var17 = 0;
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = Integer.MIN_VALUE >>> var18;
                    if ((var16 & var19) == 0) {
                        var17++;
                    } else {
                        if (this.field3604[var17] == 0) {
                            this.field3604[var17] = var13;
                        }
                        var17 = this.field3604[var17];
                    }
                    if (var17 >= this.field3604.length) {
                        int[] var20 = new int[this.field3604.length * 2];
                        for (int var21 = 0; var21 < this.field3604.length; var21++) {
                            var20[var21] = this.field3604[var21];
                        }
                        this.field3604 = var20;
                    }
                    int var22 = var19 >>> 1;
                }
                this.field3604[var17] = ~var14;
                if (var17 >= var13) {
                    var13 = var17 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "()[F", line = 162)
    public final float[] method1479() {
        return this.field3602[this.method1476()];
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "()V", line = 165)
    public class206() {
        class251.method1805(24);
        this.field3601 = class251.method1805(16);
        this.field3599 = class251.method1805(24);
        this.field3600 = new int[this.field3599];
        boolean var1 = class251.method1807() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class251.method1805(5) + 1;
            while (var2 < this.field3599) {
                int var4 = class251.method1805(class126.method889(this.field3599 - var2, -1));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field3600[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class251.method1807() != 0;
            for (int var7 = 0; var7 < this.field3599; var7++) {
                if (var6 && class251.method1807() == 0) {
                    this.field3600[var7] = 0;
                } else {
                    this.field3600[var7] = class251.method1805(5) + 1;
                }
            }
        }
        this.method1478();
        int var8 = class251.method1805(4);
        if (var8 > 0) {
            float var9 = class251.method1801(class251.method1805(32));
            float var10 = class251.method1801(class251.method1805(32));
            int var11 = class251.method1805(4) + 1;
            boolean var12 = class251.method1807() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method1477(this.field3599, this.field3601);
            } else {
                var13 = this.field3601 * this.field3599;
            }
            this.field3603 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field3603[var14] = class251.method1805(var11);
            }
            this.field3602 = new float[this.field3599][this.field3601];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field3599; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field3601; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field3603[var19] * var10 + var9 + var16;
                        this.field3602[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field3599; var21++) {
                    float var22 = 0.0F;
                    int var23 = this.field3601 * var21;
                    for (int var24 = 0; var24 < this.field3601; var24++) {
                        float var25 = (float) this.field3603[var23] * var10 + var9 + var22;
                        this.field3602[var21][var24] = var25;
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
