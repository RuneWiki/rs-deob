import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class36 {

    @OriginalMember(owner = "client!f", name = "d", descriptor = "I")
    public int field847;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "I")
    private int field848;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "[I")
    private int[] field844;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "[I")
    private int[] field845;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "[[F")
    private float[][] field846;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "[I")
    private int[] field849;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "()V")
    private final void method308() {
        int[] var1 = new int[this.field848];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field848; var3++) {
            int var14 = this.field844[var3];
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
        this.field849 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field848; var5++) {
            int var6 = this.field844[var5];
            if (var6 != 0) {
                int var7 = var1[var5];
                int var8 = 0;
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = Integer.MIN_VALUE >>> var9;
                    if ((var7 & var10) == 0) {
                        var8++;
                    } else {
                        if (this.field849[var8] == 0) {
                            this.field849[var8] = var4;
                        }
                        var8 = this.field849[var8];
                    }
                    if (var8 >= this.field849.length) {
                        int[] var11 = new int[this.field849.length * 2];
                        for (int var12 = 0; var12 < this.field849.length; var12++) {
                            var11[var12] = this.field849[var12];
                        }
                        this.field849 = var11;
                    }
                    int var13 = var10 >>> 1;
                }
                this.field849[var8] = ~var5;
                if (var8 >= var4) {
                    var4 = var8 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II)I")
    private static final int method309(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class149.method1187((byte) -106, var2, arg1) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "()[F")
    public final float[] method310() {
        return this.field846[this.method311()];
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "()V")
    public class36() {
        class34.method299(24);
        this.field847 = class34.method299(16);
        this.field848 = class34.method299(24);
        this.field844 = new int[this.field848];
        boolean var1 = class34.method297() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class34.method299(5) + 1;
            while (var2 < this.field848) {
                int var4 = class34.method299(class112.method880(this.field848 - var2, (byte) 93));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field844[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class34.method297() != 0;
            for (int var7 = 0; var7 < this.field848; var7++) {
                if (var6 && class34.method297() == 0) {
                    this.field844[var7] = 0;
                } else {
                    this.field844[var7] = class34.method299(5) + 1;
                }
            }
        }
        this.method308();
        int var8 = class34.method299(4);
        if (var8 > 0) {
            float var9 = class34.method295(class34.method299(32));
            float var10 = class34.method295(class34.method299(32));
            int var11 = class34.method299(4) + 1;
            boolean var12 = class34.method297() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method309(this.field848, this.field847);
            } else {
                var13 = this.field848 * this.field847;
            }
            this.field845 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field845[var14] = class34.method299(var11);
            }
            this.field846 = new float[this.field848][this.field847];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field848; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field847; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field845[var19] * var10 + var9 + var16;
                        this.field846[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
                return;
            }
            for (int var21 = 0; var21 < this.field848; var21++) {
                float var22 = 0.0F;
                int var23 = this.field847 * var21;
                for (int var24 = 0; var24 < this.field847; var24++) {
                    float var25 = (float) this.field845[var23] * var10 + var9 + var22;
                    this.field846[var21][var24] = var25;
                    if (var12) {
                        var22 = var25;
                    }
                    var23++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "()I")
    public final int method311() {
        int var1;
        for (var1 = 0; this.field849[var1] >= 0; var1 = class34.method297() == 0 ? var1 + 1 : this.field849[var1]) {
        }
        return ~this.field849[var1];
    }
}
