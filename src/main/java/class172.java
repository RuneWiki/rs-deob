import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class172 {

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "I")
    public int field3288;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "I")
    private int field3285;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "[I")
    private int[] field3286;

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "[I")
    private int[] field3289;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "[[F")
    private float[][] field3287;

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "[I")
    private int[] field3290;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "()I")
    public final int method1163() {
        int var1;
        for (var1 = 0; this.field3290[var1] >= 0; var1 = class22.method156() == 0 ? var1 + 1 : this.field3290[var1]) {
        }
        return ~this.field3290[var1];
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)I")
    private static final int method1164(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class76.method528(115, arg1, var2) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "()[F")
    public final float[] method1165() {
        return this.field3287[this.method1163()];
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "()V")
    private final void method1166() {
        int[] var1 = new int[this.field3285];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field3285; var3++) {
            int var14 = this.field3286[var3];
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
        this.field3290 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field3285; var5++) {
            int var6 = this.field3286[var5];
            if (var6 != 0) {
                int var7 = var1[var5];
                int var8 = 0;
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = Integer.MIN_VALUE >>> var9;
                    if ((var7 & var10) == 0) {
                        var8++;
                    } else {
                        if (this.field3290[var8] == 0) {
                            this.field3290[var8] = var4;
                        }
                        var8 = this.field3290[var8];
                    }
                    if (var8 >= this.field3290.length) {
                        int[] var11 = new int[this.field3290.length * 2];
                        for (int var12 = 0; var12 < this.field3290.length; var12++) {
                            var11[var12] = this.field3290[var12];
                        }
                        this.field3290 = var11;
                    }
                    int var13 = var10 >>> 1;
                }
                this.field3290[var8] = ~var5;
                if (var8 >= var4) {
                    var4 = var8 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "()V")
    public class172() {
        class22.method154(24);
        this.field3288 = class22.method154(16);
        this.field3285 = class22.method154(24);
        this.field3286 = new int[this.field3285];
        boolean var1 = class22.method156() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class22.method154(5) + 1;
            while (var2 < this.field3285) {
                int var4 = class22.method154(class232.method1499(8, this.field3285 - var2));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field3286[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class22.method156() != 0;
            for (int var7 = 0; var7 < this.field3285; var7++) {
                if (var6 && class22.method156() == 0) {
                    this.field3286[var7] = 0;
                } else {
                    this.field3286[var7] = class22.method154(5) + 1;
                }
            }
        }
        this.method1166();
        int var8 = class22.method154(4);
        if (var8 > 0) {
            float var9 = class22.method153(class22.method154(32));
            float var10 = class22.method153(class22.method154(32));
            int var11 = class22.method154(4) + 1;
            boolean var12 = class22.method156() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method1164(this.field3285, this.field3288);
            } else {
                var13 = this.field3288 * this.field3285;
            }
            this.field3289 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field3289[var14] = class22.method154(var11);
            }
            this.field3287 = new float[this.field3285][this.field3288];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field3285; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field3288; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field3289[var19] * var10 + var9 + var16;
                        this.field3287[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
                return;
            }
            for (int var21 = 0; var21 < this.field3285; var21++) {
                float var22 = 0.0F;
                int var23 = this.field3288 * var21;
                for (int var24 = 0; var24 < this.field3288; var24++) {
                    float var25 = (float) this.field3289[var23] * var10 + var9 + var22;
                    this.field3287[var21][var24] = var25;
                    if (var12) {
                        var22 = var25;
                    }
                    var23++;
                }
            }
        }
    }
}
