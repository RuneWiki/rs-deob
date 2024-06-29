import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class239 {

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public int field3584;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
    private int field3583;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "[I")
    private int[] field3587;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "[I")
    private int[] field3586;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "[[F")
    private float[][] field3585;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "[I")
    private int[] field3588;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "()[F", line = 4)
    public final float[] method1701() {
        return this.field3585[this.method1702()];
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "()I", line = 9)
    public final int method1702() {
        int var1;
        for (var1 = 0; this.field3588[var1] >= 0; var1 = class341.method2363() == 0 ? var1 + 1 : this.field3588[var1]) {
        }
        return ~this.field3588[var1];
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)I", line = 17)
    private static final int method1703(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class157.method1164(1, var2, arg1) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "()V", line = 27)
    private final void method1704() {
        int[] var1 = new int[this.field3583];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field3583; var3++) {
            int var4 = this.field3587[var3];
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
        this.field3588 = new int[8];
        int var13 = 0;
        for (int var14 = 0; var14 < this.field3583; var14++) {
            int var15 = this.field3587[var14];
            if (var15 != 0) {
                int var16 = var1[var14];
                int var17 = 0;
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = Integer.MIN_VALUE >>> var18;
                    if ((var16 & var19) == 0) {
                        var17++;
                    } else {
                        if (this.field3588[var17] == 0) {
                            this.field3588[var17] = var13;
                        }
                        var17 = this.field3588[var17];
                    }
                    if (var17 >= this.field3588.length) {
                        int[] var20 = new int[this.field3588.length * 2];
                        for (int var21 = 0; var21 < this.field3588.length; var21++) {
                            var20[var21] = this.field3588[var21];
                        }
                        this.field3588 = var20;
                    }
                    int var22 = var19 >>> 1;
                }
                this.field3588[var17] = ~var14;
                if (var17 >= var13) {
                    var13 = var17 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V", line = 165)
    public class239() {
        class341.method2366(24);
        this.field3584 = class341.method2366(16);
        this.field3583 = class341.method2366(24);
        this.field3587 = new int[this.field3583];
        boolean var1 = class341.method2363() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class341.method2366(5) + 1;
            while (var2 < this.field3583) {
                int var4 = class341.method2366(class294.method2060(2047, this.field3583 - var2));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field3587[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class341.method2363() != 0;
            for (int var7 = 0; var7 < this.field3583; var7++) {
                if (var6 && class341.method2363() == 0) {
                    this.field3587[var7] = 0;
                } else {
                    this.field3587[var7] = class341.method2366(5) + 1;
                }
            }
        }
        this.method1704();
        int var8 = class341.method2366(4);
        if (var8 > 0) {
            float var9 = class341.method2371(class341.method2366(32));
            float var10 = class341.method2371(class341.method2366(32));
            int var11 = class341.method2366(4) + 1;
            boolean var12 = class341.method2363() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method1703(this.field3583, this.field3584);
            } else {
                var13 = this.field3584 * this.field3583;
            }
            this.field3586 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field3586[var14] = class341.method2366(var11);
            }
            this.field3585 = new float[this.field3583][this.field3584];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field3583; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field3584; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field3586[var19] * var10 + var9 + var16;
                        this.field3585[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field3583; var21++) {
                    float var22 = 0.0F;
                    int var23 = this.field3584 * var21;
                    for (int var24 = 0; var24 < this.field3584; var24++) {
                        float var25 = (float) this.field3586[var23] * var10 + var9 + var22;
                        this.field3585[var21][var24] = var25;
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
