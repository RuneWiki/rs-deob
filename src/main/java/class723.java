import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lga")
public class class723 {

    @OriginalMember(owner = "client!lga", name = "c", descriptor = "I")
    public int field10160;

    @OriginalMember(owner = "client!lga", name = "d", descriptor = "I")
    private int field10161;

    @OriginalMember(owner = "client!lga", name = "b", descriptor = "[I")
    private int[] field10159;

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "[I")
    private int[] field10158;

    @OriginalMember(owner = "client!lga", name = "e", descriptor = "[[F")
    private float[][] field10162;

    @OriginalMember(owner = "client!lga", name = "f", descriptor = "[I")
    private int[] field10163;

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "()I", line = 4)
    public final int method4043() {
        int var1;
        for (var1 = 0; this.field10163[var1] >= 0; var1 = class531.method3224() == 0 ? var1 + 1 : this.field10163[var1]) {
        }
        return ~this.field10163[var1];
    }

    @OriginalMember(owner = "client!lga", name = "b", descriptor = "()V", line = 12)
    private final void method4044() {
        int[] var1 = new int[this.field10161];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field10161; var3++) {
            int var14 = this.field10159[var3];
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
        this.field10163 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field10161; var5++) {
            int var6 = this.field10159[var5];
            if (var6 != 0) {
                int var7 = var1[var5];
                int var8 = 0;
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = Integer.MIN_VALUE >>> var9;
                    if ((var7 & var10) == 0) {
                        var8++;
                    } else {
                        if (this.field10163[var8] == 0) {
                            this.field10163[var8] = var4;
                        }
                        var8 = this.field10163[var8];
                    }
                    if (var8 >= this.field10163.length) {
                        int[] var11 = new int[this.field10163.length * 2];
                        for (int var12 = 0; var12 < this.field10163.length; var12++) {
                            var11[var12] = this.field10163[var12];
                        }
                        this.field10163 = var11;
                    }
                    int var13 = var10 >>> 1;
                }
                this.field10163[var8] = ~var5;
                if (var8 >= var4) {
                    var4 = var8 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(II)I", line = 151)
    private static final int method4045(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class547.method3291(-125, var2, arg1) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!lga", name = "<init>", descriptor = "()V", line = 162)
    public class723() {
        class531.method3222(24);
        this.field10160 = class531.method3222(16);
        this.field10161 = class531.method3222(24);
        this.field10159 = new int[this.field10161];
        boolean var1 = class531.method3224() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class531.method3222(5) + 1;
            while (var2 < this.field10161) {
                int var4 = class531.method3222(class690.method3903(4, this.field10161 - var2));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field10159[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class531.method3224() != 0;
            for (int var7 = 0; var7 < this.field10161; var7++) {
                if (var6 && class531.method3224() == 0) {
                    this.field10159[var7] = 0;
                } else {
                    this.field10159[var7] = class531.method3222(5) + 1;
                }
            }
        }
        this.method4044();
        int var8 = class531.method3222(4);
        if (var8 > 0) {
            float var9 = class531.method3230(class531.method3222(32));
            float var10 = class531.method3230(class531.method3222(32));
            int var11 = class531.method3222(4) + 1;
            boolean var12 = class531.method3224() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method4045(this.field10161, this.field10160);
            } else {
                var13 = this.field10161 * this.field10160;
            }
            this.field10158 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field10158[var14] = class531.method3222(var11);
            }
            this.field10162 = new float[this.field10161][this.field10160];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field10161; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field10160; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field10158[var19] * var10 + var9 + var16;
                        this.field10162[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
                return;
            }
            for (int var21 = 0; var21 < this.field10161; var21++) {
                float var22 = 0.0F;
                int var23 = this.field10160 * var21;
                for (int var24 = 0; var24 < this.field10160; var24++) {
                    float var25 = (float) this.field10158[var23] * var10 + var9 + var22;
                    this.field10162[var21][var24] = var25;
                    if (var12) {
                        var22 = var25;
                    }
                    var23++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lga", name = "c", descriptor = "()[F", line = 304)
    public final float[] method4046() {
        return this.field10162[this.method4043()];
    }
}
