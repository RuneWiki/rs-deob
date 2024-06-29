import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class275 {

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "I")
    public int field3754;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "I")
    private int field3753;

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "[I")
    private int[] field3757;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "[I")
    private int[] field3756;

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "[[F")
    private float[][] field3755;

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "[I")
    private int[] field3758;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "()[F", line = 5)
    public final float[] method1736() {
        return this.field3755[this.method1738()];
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(II)I", line = 9)
    private static final int method1737(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class417.method2574(var2, arg1, (byte) -73) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "()I", line = 17)
    public final int method1738() {
        int var1;
        for (var1 = 0; this.field3758[var1] >= 0; var1 = class168.method1194() == 0 ? var1 + 1 : this.field3758[var1]) {
        }
        return ~this.field3758[var1];
    }

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "()V", line = 27)
    private final void method1739() {
        int[] var1 = new int[this.field3753];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field3753; var3++) {
            int var14 = this.field3757[var3];
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
        this.field3758 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field3753; var5++) {
            int var6 = this.field3757[var5];
            if (var6 != 0) {
                int var7 = var1[var5];
                int var8 = 0;
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = Integer.MIN_VALUE >>> var9;
                    if ((var7 & var10) == 0) {
                        var8++;
                    } else {
                        if (this.field3758[var8] == 0) {
                            this.field3758[var8] = var4;
                        }
                        var8 = this.field3758[var8];
                    }
                    if (var8 >= this.field3758.length) {
                        int[] var11 = new int[this.field3758.length * 2];
                        for (int var12 = 0; var12 < this.field3758.length; var12++) {
                            var11[var12] = this.field3758[var12];
                        }
                        this.field3758 = var11;
                    }
                    int var13 = var10 >>> 1;
                }
                this.field3758[var8] = ~var5;
                if (var8 >= var4) {
                    var4 = var8 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "()V", line = 165)
    public class275() {
        class168.method1201(24);
        this.field3754 = class168.method1201(16);
        this.field3753 = class168.method1201(24);
        this.field3757 = new int[this.field3753];
        boolean var1 = class168.method1194() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class168.method1201(5) + 1;
            while (var2 < this.field3753) {
                int var4 = class168.method1201(class85.method679((byte) -85, this.field3753 - var2));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field3757[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class168.method1194() != 0;
            for (int var7 = 0; var7 < this.field3753; var7++) {
                if (var6 && class168.method1194() == 0) {
                    this.field3757[var7] = 0;
                } else {
                    this.field3757[var7] = class168.method1201(5) + 1;
                }
            }
        }
        this.method1739();
        int var8 = class168.method1201(4);
        if (var8 > 0) {
            float var9 = class168.method1198(class168.method1201(32));
            float var10 = class168.method1198(class168.method1201(32));
            int var11 = class168.method1201(4) + 1;
            boolean var12 = class168.method1194() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method1737(this.field3753, this.field3754);
            } else {
                var13 = this.field3754 * this.field3753;
            }
            this.field3756 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field3756[var14] = class168.method1201(var11);
            }
            this.field3755 = new float[this.field3753][this.field3754];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field3753; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field3754; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field3756[var19] * var10 + var9 + var16;
                        this.field3755[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
                return;
            }
            for (int var21 = 0; var21 < this.field3753; var21++) {
                float var22 = 0.0F;
                int var23 = this.field3754 * var21;
                for (int var24 = 0; var24 < this.field3754; var24++) {
                    float var25 = (float) this.field3756[var23] * var10 + var9 + var22;
                    this.field3755[var21][var24] = var25;
                    if (var12) {
                        var22 = var25;
                    }
                    var23++;
                }
            }
        }
    }
}
