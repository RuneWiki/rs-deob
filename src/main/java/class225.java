import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class225 {

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "I")
    public int field3606;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "I")
    private int field3609;

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "[I")
    private int[] field3608;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "[I")
    private int[] field3605;

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "[[F")
    private float[][] field3607;

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "[I")
    private int[] field3610;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "()I", line = 4)
    public final int method1628() {
        int var1;
        for (var1 = 0; this.field3610[var1] >= 0; var1 = class167.method1218() == 0 ? var1 + 1 : this.field3610[var1]) {
        }
        return ~this.field3610[var1];
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)I", line = 14)
    private static final int method1629(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class48.method373(arg1, var2, false) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "()[F", line = 22)
    public final float[] method1630() {
        return this.field3607[this.method1628()];
    }

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "()V", line = 27)
    private final void method1631() {
        int[] var1 = new int[this.field3609];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field3609; var3++) {
            int var4 = this.field3608[var3];
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
        this.field3610 = new int[8];
        int var13 = 0;
        for (int var14 = 0; var14 < this.field3609; var14++) {
            int var15 = this.field3608[var14];
            if (var15 != 0) {
                int var16 = var1[var14];
                int var17 = 0;
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = Integer.MIN_VALUE >>> var18;
                    if ((var16 & var19) == 0) {
                        var17++;
                    } else {
                        if (this.field3610[var17] == 0) {
                            this.field3610[var17] = var13;
                        }
                        var17 = this.field3610[var17];
                    }
                    if (var17 >= this.field3610.length) {
                        int[] var20 = new int[this.field3610.length * 2];
                        for (int var21 = 0; var21 < this.field3610.length; var21++) {
                            var20[var21] = this.field3610[var21];
                        }
                        this.field3610 = var20;
                    }
                    int var22 = var19 >>> 1;
                }
                this.field3610[var17] = ~var14;
                if (var17 >= var13) {
                    var13 = var17 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "()V", line = 165)
    public class225() {
        class167.method1220(24);
        this.field3606 = class167.method1220(16);
        this.field3609 = class167.method1220(24);
        this.field3608 = new int[this.field3609];
        boolean var1 = class167.method1218() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class167.method1220(5) + 1;
            while (var2 < this.field3609) {
                int var4 = class167.method1220(class86.method615((byte) 97, this.field3609 - var2));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field3608[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class167.method1218() != 0;
            for (int var7 = 0; var7 < this.field3609; var7++) {
                if (var6 && class167.method1218() == 0) {
                    this.field3608[var7] = 0;
                } else {
                    this.field3608[var7] = class167.method1220(5) + 1;
                }
            }
        }
        this.method1631();
        int var8 = class167.method1220(4);
        if (var8 > 0) {
            float var9 = class167.method1225(class167.method1220(32));
            float var10 = class167.method1225(class167.method1220(32));
            int var11 = class167.method1220(4) + 1;
            boolean var12 = class167.method1218() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method1629(this.field3609, this.field3606);
            } else {
                var13 = this.field3609 * this.field3606;
            }
            this.field3605 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field3605[var14] = class167.method1220(var11);
            }
            this.field3607 = new float[this.field3609][this.field3606];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field3609; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field3606; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field3605[var19] * var10 + var9 + var16;
                        this.field3607[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field3609; var21++) {
                    float var22 = 0.0F;
                    int var23 = this.field3606 * var21;
                    for (int var24 = 0; var24 < this.field3606; var24++) {
                        float var25 = (float) this.field3605[var23] * var10 + var9 + var22;
                        this.field3607[var21][var24] = var25;
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
