import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class424 {

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
    public int field6062;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
    private int field6059;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "[I")
    private int[] field6061;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "[I")
    private int[] field6060;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "[[F")
    private float[][] field6063;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "[I")
    private int[] field6064;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(II)I")
    private static final int method2670(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class122.method775(arg1, (byte) -15, var2) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "()[F")
    public final float[] method2671() {
        return this.field6063[this.method2672()];
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "()I")
    public final int method2672() {
        int var1;
        for (var1 = 0; this.field6064[var1] >= 0; var1 = class319.method2093() == 0 ? var1 + 1 : this.field6064[var1]) {
        }
        return ~this.field6064[var1];
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "()V")
    private final void method2673() {
        int[] var1 = new int[this.field6059];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field6059; var3++) {
            int var14 = this.field6061[var3];
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
        this.field6064 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field6059; var5++) {
            int var6 = this.field6061[var5];
            if (var6 != 0) {
                int var7 = var1[var5];
                int var8 = 0;
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = Integer.MIN_VALUE >>> var9;
                    if ((var7 & var10) == 0) {
                        var8++;
                    } else {
                        if (this.field6064[var8] == 0) {
                            this.field6064[var8] = var4;
                        }
                        var8 = this.field6064[var8];
                    }
                    if (var8 >= this.field6064.length) {
                        int[] var11 = new int[this.field6064.length * 2];
                        for (int var12 = 0; var12 < this.field6064.length; var12++) {
                            var11[var12] = this.field6064[var12];
                        }
                        this.field6064 = var11;
                    }
                    int var13 = var10 >>> 1;
                }
                this.field6064[var8] = ~var5;
                if (var8 >= var4) {
                    var4 = var8 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "()V")
    public class424() {
        class319.method2091(24);
        this.field6062 = class319.method2091(16);
        this.field6059 = class319.method2091(24);
        this.field6061 = new int[this.field6059];
        boolean var1 = class319.method2093() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class319.method2091(5) + 1;
            while (var2 < this.field6059) {
                int var4 = class319.method2091(class161.method1033(this.field6059 - var2, -257));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field6061[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class319.method2093() != 0;
            for (int var7 = 0; var7 < this.field6059; var7++) {
                if (var6 && class319.method2093() == 0) {
                    this.field6061[var7] = 0;
                } else {
                    this.field6061[var7] = class319.method2091(5) + 1;
                }
            }
        }
        this.method2673();
        int var8 = class319.method2091(4);
        if (var8 > 0) {
            float var9 = class319.method2088(class319.method2091(32));
            float var10 = class319.method2088(class319.method2091(32));
            int var11 = class319.method2091(4) + 1;
            boolean var12 = class319.method2093() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method2670(this.field6059, this.field6062);
            } else {
                var13 = this.field6062 * this.field6059;
            }
            this.field6060 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field6060[var14] = class319.method2091(var11);
            }
            this.field6063 = new float[this.field6059][this.field6062];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field6059; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field6062; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field6060[var19] * var10 + var9 + var16;
                        this.field6063[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
                return;
            }
            for (int var21 = 0; var21 < this.field6059; var21++) {
                float var22 = 0.0F;
                int var23 = this.field6062 * var21;
                for (int var24 = 0; var24 < this.field6062; var24++) {
                    float var25 = (float) this.field6060[var23] * var10 + var9 + var22;
                    this.field6063[var21][var24] = var25;
                    if (var12) {
                        var22 = var25;
                    }
                    var23++;
                }
            }
        }
    }
}
