import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class508 {

    @OriginalMember(owner = "client!cp", name = "d", descriptor = "I")
    public int field7479;

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "I")
    private int field7478;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "[I")
    private int[] field7476;

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "[I")
    private int[] field7477;

    @OriginalMember(owner = "client!cp", name = "e", descriptor = "[[F")
    private float[][] field7480;

    @OriginalMember(owner = "client!cp", name = "f", descriptor = "[I")
    private int[] field7481;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "()V")
    private final void method3028() {
        int[] var1 = new int[this.field7478];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field7478; var3++) {
            int var14 = this.field7476[var3];
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
        this.field7481 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field7478; var5++) {
            int var6 = this.field7476[var5];
            if (var6 != 0) {
                int var7 = var1[var5];
                int var8 = 0;
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = Integer.MIN_VALUE >>> var9;
                    if ((var7 & var10) == 0) {
                        var8++;
                    } else {
                        if (this.field7481[var8] == 0) {
                            this.field7481[var8] = var4;
                        }
                        var8 = this.field7481[var8];
                    }
                    if (var8 >= this.field7481.length) {
                        int[] var11 = new int[this.field7481.length * 2];
                        for (int var12 = 0; var12 < this.field7481.length; var12++) {
                            var11[var12] = this.field7481[var12];
                        }
                        this.field7481 = var11;
                    }
                    int var13 = var10 >>> 1;
                }
                this.field7481[var8] = ~var5;
                if (var8 >= var4) {
                    var4 = var8 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "()I")
    public final int method3029() {
        int var1;
        for (var1 = 0; this.field7481[var1] >= 0; var1 = class375.method2331() == 0 ? var1 + 1 : this.field7481[var1]) {
        }
        return ~this.field7481[var1];
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(II)I")
    private static final int method3030(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class164.method1211(26861, var2, arg1) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "()[F")
    public final float[] method3031() {
        return this.field7480[this.method3029()];
    }

    @OriginalMember(owner = "client!cp", name = "<init>", descriptor = "()V")
    public class508() {
        class375.method2339(24);
        this.field7479 = class375.method2339(16);
        this.field7478 = class375.method2339(24);
        this.field7476 = new int[this.field7478];
        boolean var1 = class375.method2331() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class375.method2339(5) + 1;
            while (var2 < this.field7478) {
                int var4 = class375.method2339(class210.method1417(this.field7478 - var2, 0));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field7476[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class375.method2331() != 0;
            for (int var7 = 0; var7 < this.field7478; var7++) {
                if (var6 && class375.method2331() == 0) {
                    this.field7476[var7] = 0;
                } else {
                    this.field7476[var7] = class375.method2339(5) + 1;
                }
            }
        }
        this.method3028();
        int var8 = class375.method2339(4);
        if (var8 > 0) {
            float var9 = class375.method2336(class375.method2339(32));
            float var10 = class375.method2336(class375.method2339(32));
            int var11 = class375.method2339(4) + 1;
            boolean var12 = class375.method2331() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method3030(this.field7478, this.field7479);
            } else {
                var13 = this.field7479 * this.field7478;
            }
            this.field7477 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field7477[var14] = class375.method2339(var11);
            }
            this.field7480 = new float[this.field7478][this.field7479];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field7478; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field7479; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field7477[var19] * var10 + var9 + var16;
                        this.field7480[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
                return;
            }
            for (int var21 = 0; var21 < this.field7478; var21++) {
                float var22 = 0.0F;
                int var23 = this.field7479 * var21;
                for (int var24 = 0; var24 < this.field7479; var24++) {
                    float var25 = (float) this.field7477[var23] * var10 + var9 + var22;
                    this.field7480[var21][var24] = var25;
                    if (var12) {
                        var22 = var25;
                    }
                    var23++;
                }
            }
        }
    }
}
