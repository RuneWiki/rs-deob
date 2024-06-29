import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class360 {

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "I")
    public int field4660;

    @OriginalMember(owner = "client!tq", name = "e", descriptor = "I")
    private int field4663;

    @OriginalMember(owner = "client!tq", name = "d", descriptor = "[I")
    private int[] field4662;

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "[I")
    private int[] field4661;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "[[F")
    private float[][] field4659;

    @OriginalMember(owner = "client!tq", name = "f", descriptor = "[I")
    private int[] field4664;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "()[F", line = 4)
    public final float[] method2065() {
        return this.field4659[this.method2066()];
    }

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "()I", line = 9)
    public final int method2066() {
        int var1;
        for (var1 = 0; this.field4664[var1] >= 0; var1 = class73.method591() == 0 ? var1 + 1 : this.field4664[var1]) {
        }
        return ~this.field4664[var1];
    }

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "()V", line = 17)
    private final void method2067() {
        int[] var1 = new int[this.field4663];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field4663; var3++) {
            int var14 = this.field4662[var3];
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
        this.field4664 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field4663; var5++) {
            int var6 = this.field4662[var5];
            if (var6 != 0) {
                int var7 = var1[var5];
                int var8 = 0;
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = Integer.MIN_VALUE >>> var9;
                    if ((var7 & var10) == 0) {
                        var8++;
                    } else {
                        if (this.field4664[var8] == 0) {
                            this.field4664[var8] = var4;
                        }
                        var8 = this.field4664[var8];
                    }
                    if (var8 >= this.field4664.length) {
                        int[] var11 = new int[this.field4664.length * 2];
                        for (int var12 = 0; var12 < this.field4664.length; var12++) {
                            var11[var12] = this.field4664[var12];
                        }
                        this.field4664 = var11;
                    }
                    int var13 = var10 >>> 1;
                }
                this.field4664[var8] = ~var5;
                if (var8 >= var4) {
                    var4 = var8 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(II)I", line = 158)
    private static final int method2068(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class340.method1970(arg1, -19603, var2) > arg0; var2--) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "()V", line = 165)
    public class360() {
        class73.method584(24);
        this.field4660 = class73.method584(16);
        this.field4663 = class73.method584(24);
        this.field4662 = new int[this.field4663];
        boolean var1 = class73.method591() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class73.method584(5) + 1;
            while (var2 < this.field4663) {
                int var4 = class73.method584(class127.method924(12, this.field4663 - var2));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field4662[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class73.method591() != 0;
            for (int var7 = 0; var7 < this.field4663; var7++) {
                if (var6 && class73.method591() == 0) {
                    this.field4662[var7] = 0;
                } else {
                    this.field4662[var7] = class73.method584(5) + 1;
                }
            }
        }
        this.method2067();
        int var8 = class73.method584(4);
        if (var8 > 0) {
            float var9 = class73.method592(class73.method584(32));
            float var10 = class73.method592(class73.method584(32));
            int var11 = class73.method584(4) + 1;
            boolean var12 = class73.method591() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method2068(this.field4663, this.field4660);
            } else {
                var13 = this.field4663 * this.field4660;
            }
            this.field4661 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field4661[var14] = class73.method584(var11);
            }
            this.field4659 = new float[this.field4663][this.field4660];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field4663; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field4660; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field4661[var19] * var10 + var9 + var16;
                        this.field4659[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
                return;
            }
            for (int var21 = 0; var21 < this.field4663; var21++) {
                float var22 = 0.0F;
                int var23 = this.field4660 * var21;
                for (int var24 = 0; var24 < this.field4660; var24++) {
                    float var25 = (float) this.field4661[var23] * var10 + var9 + var22;
                    this.field4659[var21][var24] = var25;
                    if (var12) {
                        var22 = var25;
                    }
                    var23++;
                }
            }
        }
    }
}
