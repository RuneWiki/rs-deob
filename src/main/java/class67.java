import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class67 {

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "I")
    public int field1232;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "I")
    private int field1235;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "[I")
    private int[] field1234;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "[I")
    private int[] field1231;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "[[F")
    private float[][] field1233;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "[I")
    private int[] field1236;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "()V", line = 5)
    private final void method524() {
        int[] var1 = new int[this.field1235];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field1235; var3++) {
            int var4 = this.field1234[var3];
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
        this.field1236 = new int[8];
        int var13 = 0;
        for (int var14 = 0; var14 < this.field1235; var14++) {
            int var15 = this.field1234[var14];
            if (var15 != 0) {
                int var16 = var1[var14];
                int var17 = 0;
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = Integer.MIN_VALUE >>> var18;
                    if ((var16 & var19) == 0) {
                        var17++;
                    } else {
                        if (this.field1236[var17] == 0) {
                            this.field1236[var17] = var13;
                        }
                        var17 = this.field1236[var17];
                    }
                    if (var17 >= this.field1236.length) {
                        int[] var20 = new int[this.field1236.length * 2];
                        for (int var21 = 0; var21 < this.field1236.length; var21++) {
                            var20[var21] = this.field1236[var21];
                        }
                        this.field1236 = var20;
                    }
                    int var22 = var19 >>> 1;
                }
                this.field1236[var17] = ~var14;
                if (var17 >= var13) {
                    var13 = var17 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "()I", line = 144)
    public final int method525() {
        int var1;
        for (var1 = 0; this.field1236[var1] >= 0; var1 = class138.method1015() == 0 ? var1 + 1 : this.field1236[var1]) {
        }
        return ~this.field1236[var1];
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)I", line = 154)
    private static final int method526(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class249.method1762(1, var2, arg1) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "()[F", line = 162)
    public final float[] method527() {
        return this.field1233[this.method525()];
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "()V", line = 165)
    public class67() {
        class138.method1025(24);
        this.field1232 = class138.method1025(16);
        this.field1235 = class138.method1025(24);
        this.field1234 = new int[this.field1235];
        boolean var1 = class138.method1015() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class138.method1025(5) + 1;
            while (var2 < this.field1235) {
                int var4 = class138.method1025(class229.method1603(this.field1235 - var2, true));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field1234[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class138.method1015() != 0;
            for (int var7 = 0; var7 < this.field1235; var7++) {
                if (var6 && class138.method1015() == 0) {
                    this.field1234[var7] = 0;
                } else {
                    this.field1234[var7] = class138.method1025(5) + 1;
                }
            }
        }
        this.method524();
        int var8 = class138.method1025(4);
        if (var8 > 0) {
            float var9 = class138.method1019(class138.method1025(32));
            float var10 = class138.method1019(class138.method1025(32));
            int var11 = class138.method1025(4) + 1;
            boolean var12 = class138.method1015() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method526(this.field1235, this.field1232);
            } else {
                var13 = this.field1235 * this.field1232;
            }
            this.field1231 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field1231[var14] = class138.method1025(var11);
            }
            this.field1233 = new float[this.field1235][this.field1232];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field1235; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field1232; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field1231[var19] * var10 + var9 + var16;
                        this.field1233[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field1235; var21++) {
                    float var22 = 0.0F;
                    int var23 = this.field1232 * var21;
                    for (int var24 = 0; var24 < this.field1232; var24++) {
                        float var25 = (float) this.field1231[var23] * var10 + var9 + var22;
                        this.field1233[var21][var24] = var25;
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
