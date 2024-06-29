import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class284 {

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "I")
    public int field3718;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
    private int field3715;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "[I")
    private int[] field3717;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "[I")
    private int[] field3719;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "[[F")
    private float[][] field3716;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "[I")
    private int[] field3720;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "()[F", line = 3)
    public final float[] method1684() {
        return this.field3716[this.method1685()];
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "()I", line = 7)
    public final int method1685() {
        int var1;
        for (var1 = 0; this.field3720[var1] >= 0; var1 = class82.method514() == 0 ? var1 + 1 : this.field3720[var1]) {
        }
        return ~this.field3720[var1];
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "()V", line = 17)
    private final void method1686() {
        int[] var1 = new int[this.field3715];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field3715; var3++) {
            int var14 = this.field3717[var3];
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
        this.field3720 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field3715; var5++) {
            int var6 = this.field3717[var5];
            if (var6 != 0) {
                int var7 = var1[var5];
                int var8 = 0;
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = Integer.MIN_VALUE >>> var9;
                    if ((var7 & var10) == 0) {
                        var8++;
                    } else {
                        if (this.field3720[var8] == 0) {
                            this.field3720[var8] = var4;
                        }
                        var8 = this.field3720[var8];
                    }
                    if (var8 >= this.field3720.length) {
                        int[] var11 = new int[this.field3720.length * 2];
                        for (int var12 = 0; var12 < this.field3720.length; var12++) {
                            var11[var12] = this.field3720[var12];
                        }
                        this.field3720 = var11;
                    }
                    int var13 = var10 >>> 1;
                }
                this.field3720[var8] = ~var5;
                if (var8 >= var4) {
                    var4 = var8 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)I", line = 158)
    private static final int method1687(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class229.method1432(arg1, var2, 31926) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "()V", line = 165)
    public class284() {
        class82.method513(24);
        this.field3718 = class82.method513(16);
        this.field3715 = class82.method513(24);
        this.field3717 = new int[this.field3715];
        boolean var1 = class82.method514() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class82.method513(5) + 1;
            while (var2 < this.field3715) {
                int var4 = class82.method513(class302.method1758(16, this.field3715 - var2));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field3717[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class82.method514() != 0;
            for (int var7 = 0; var7 < this.field3715; var7++) {
                if (var6 && class82.method514() == 0) {
                    this.field3717[var7] = 0;
                } else {
                    this.field3717[var7] = class82.method513(5) + 1;
                }
            }
        }
        this.method1686();
        int var8 = class82.method513(4);
        if (var8 > 0) {
            float var9 = class82.method511(class82.method513(32));
            float var10 = class82.method511(class82.method513(32));
            int var11 = class82.method513(4) + 1;
            boolean var12 = class82.method514() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method1687(this.field3715, this.field3718);
            } else {
                var13 = this.field3718 * this.field3715;
            }
            this.field3719 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field3719[var14] = class82.method513(var11);
            }
            this.field3716 = new float[this.field3715][this.field3718];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field3715; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field3718; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field3719[var19] * var10 + var9 + var16;
                        this.field3716[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
                return;
            }
            for (int var21 = 0; var21 < this.field3715; var21++) {
                float var22 = 0.0F;
                int var23 = this.field3718 * var21;
                for (int var24 = 0; var24 < this.field3718; var24++) {
                    float var25 = (float) this.field3719[var23] * var10 + var9 + var22;
                    this.field3716[var21][var24] = var25;
                    if (var12) {
                        var22 = var25;
                    }
                    var23++;
                }
            }
        }
    }
}
