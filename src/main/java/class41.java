import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class41 {

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "I")
    public int field1072;

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "I")
    private int field1074;

    @OriginalMember(owner = "client!gs", name = "e", descriptor = "[I")
    private int[] field1076;

    @OriginalMember(owner = "client!gs", name = "d", descriptor = "[I")
    private int[] field1075;

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "[[F")
    private float[][] field1073;

    @OriginalMember(owner = "client!gs", name = "f", descriptor = "[I")
    private int[] field1077;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "()[F")
    public final float[] method559() {
        return this.field1073[this.method561()];
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "()V")
    private final void method560() {
        int[] var1 = new int[this.field1074];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field1074; var3++) {
            int var14 = this.field1076[var3];
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
        this.field1077 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field1074; var5++) {
            int var6 = this.field1076[var5];
            if (var6 != 0) {
                int var7 = var1[var5];
                int var8 = 0;
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = Integer.MIN_VALUE >>> var9;
                    if ((var7 & var10) == 0) {
                        var8++;
                    } else {
                        if (this.field1077[var8] == 0) {
                            this.field1077[var8] = var4;
                        }
                        var8 = this.field1077[var8];
                    }
                    if (var8 >= this.field1077.length) {
                        int[] var11 = new int[this.field1077.length * 2];
                        for (int var12 = 0; var12 < this.field1077.length; var12++) {
                            var11[var12] = this.field1077[var12];
                        }
                        this.field1077 = var11;
                    }
                    int var13 = var10 >>> 1;
                }
                this.field1077[var8] = ~var5;
                if (var8 >= var4) {
                    var4 = var8 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "()I")
    public final int method561() {
        int var1;
        for (var1 = 0; this.field1077[var1] >= 0; var1 = class429.method2614() == 0 ? var1 + 1 : this.field1077[var1]) {
        }
        return ~this.field1077[var1];
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(II)I")
    private static final int method562(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class247.method1668(arg1, var2, (byte) -106) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!gs", name = "<init>", descriptor = "()V")
    public class41() {
        class429.method2612(24);
        this.field1072 = class429.method2612(16);
        this.field1074 = class429.method2612(24);
        this.field1076 = new int[this.field1074];
        boolean var1 = class429.method2614() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class429.method2612(5) + 1;
            while (var2 < this.field1074) {
                int var4 = class429.method2612(class608.method3498(this.field1074 - var2, (byte) -70));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field1076[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class429.method2614() != 0;
            for (int var7 = 0; var7 < this.field1074; var7++) {
                if (var6 && class429.method2614() == 0) {
                    this.field1076[var7] = 0;
                } else {
                    this.field1076[var7] = class429.method2612(5) + 1;
                }
            }
        }
        this.method560();
        int var8 = class429.method2612(4);
        if (var8 > 0) {
            float var9 = class429.method2617(class429.method2612(32));
            float var10 = class429.method2617(class429.method2612(32));
            int var11 = class429.method2612(4) + 1;
            boolean var12 = class429.method2614() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method562(this.field1074, this.field1072);
            } else {
                var13 = this.field1074 * this.field1072;
            }
            this.field1075 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field1075[var14] = class429.method2612(var11);
            }
            this.field1073 = new float[this.field1074][this.field1072];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field1074; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field1072; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field1075[var19] * var10 + var9 + var16;
                        this.field1073[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
                return;
            }
            for (int var21 = 0; var21 < this.field1074; var21++) {
                float var22 = 0.0F;
                int var23 = this.field1072 * var21;
                for (int var24 = 0; var24 < this.field1072; var24++) {
                    float var25 = (float) this.field1075[var23] * var10 + var9 + var22;
                    this.field1073[var21][var24] = var25;
                    if (var12) {
                        var22 = var25;
                    }
                    var23++;
                }
            }
        }
    }
}
